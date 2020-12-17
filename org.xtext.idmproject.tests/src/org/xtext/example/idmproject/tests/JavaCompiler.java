package org.xtext.example.idmproject.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import org.xtext.example.idmproject.jsonParser.*;

public class JavaCompiler {
	
	private JsonModel _model;
	private List<String> vars;
	private String baseFile;
	
	public JavaCompiler(JsonModel _model) {
		this._model = _model;
		this.vars = new ArrayList<String>();
	}
	
	public void compileAndRun() throws IOException {
		String javaFileName = "JsonParserTest";
		String JAVA_OUTPUT = javaFileName + ".java";			
		baseFile = _model.getBaseLoad().getFile();
		String javaCode =
				  "import java.io.FileNotFoundException;\n"
				+ "import java.io.FileReader;\n"
				+ "import java.io.FileWriter;\n"
				+ "import java.io.IOException;\n\n"
				+ "import org.json.simple.JSONObject;\n"
			    + "import org.json.simple.parser.JSONParser;\n"
			    + "import org.json.simple.parser.ParseException;\n\n"
				+ "public class JsonParserTest {\n"
				+ "\t public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {\n"
				+ "\t\t JSONParser parser = new JSONParser();\n"
				+ "\t\t Object obj = parser.parse(new FileReader("+baseFile+"));\n"
				+ "\t\t JSONObject jsonObject = (JSONObject)obj;\n"
				+ "\t\t FileWriter fileWriter;\n"
				+ "\t\t long value1, value2;\n";
		
		Files.write(Paths.get(JAVA_OUTPUT), javaCode.getBytes());
		
		for(Instruction i : _model.getInstructions()) {
			String instructionCode;
			try {
				instructionCode = generateCode(i);
				Files.write(Paths.get(JAVA_OUTPUT), instructionCode.getBytes(), StandardOpenOption.APPEND);
			    System.out.println("instruction executed"); // to remove later
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
		
		// Close main method and JsonParserTest class
		Files.write(Paths.get(JAVA_OUTPUT), "\t }\n}\n".getBytes(), StandardOpenOption.APPEND);
		
		// Compile and run JsonParserTest class
		Process process = null;
		try {
			process = Runtime.getRuntime().exec("javac -cp ./lib/json-simple-1.1.jar " + JAVA_OUTPUT);
			process.waitFor();
			process = Runtime.getRuntime().exec("java -cp .:./lib/json-simple-1.1.jar " + javaFileName);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//output
		BufferedReader stdInput = new BufferedReader(new 
				InputStreamReader(process.getInputStream()));

		// error
		BufferedReader stdError = new BufferedReader(new 
				InputStreamReader(process.getErrorStream()));

		String o;
		while ((o = stdInput.readLine()) != null) {
			System.out.println(o);
		}

		String err; 
		while ((err = stdError.readLine()) != null) {
			System.out.println(err);
		}
	}
	
	private String generateCode(Instruction i) throws Exception {
		if(i.getSelect() instanceof Select) {
			return generateCode(i.getSelect());
		}
		if(i.getStore() instanceof Store) {
			return generateCode(i.getStore());
		}
		if(i.getPrint() instanceof Print) {
			return generateCode(i.getPrint());
		}
		if(i.getInsert() instanceof Insert) {
			return generateCode(i.getInsert());
		}
		if(i.getUpdate() instanceof Update) {
			return generateCode(i.getUpdate());
		}
		if(i.getCompute() instanceof Compute) {
			return generateCode(i.getCompute());
		}
		if(i.getSave() instanceof String) {
			generateCode();
		}
		return "";
	}
	
	private void generateCode() {
		writeJsonObjectContentToFile(baseFile);
	}
	
	private String writeJsonObjectContentToFile(String file) {
		String codeWrittenToFile = "";
		codeWrittenToFile += "\t\t fileWriter = new FileWriter(" + file + ");\n";
		codeWrittenToFile += "\t\t fileWriter.write(jsonObject.toJSONString(4));\n";
		codeWrittenToFile += "\t\t fileWriter.flush();\n";	
		codeWrittenToFile += "\t\t fileWriter.close();\n";	
		return codeWrittenToFile;		
	}
	
	private String generateCode(Select s) throws Exception {
		String generatedCode = "";
		String key = s.getKey();
		String var = s.getId();

		if(vars.contains(var)) {
			throw new Exception();
		}

		vars.add(var);
		generatedCode += "\t\t Object " + var + " = jsonObject.get(" + key + ");\n";
		return generatedCode;
	}
	
	private String generateCode(Store s) {
		String generatedCode = "";
		String pathToFile = s.getFile();
		generatedCode += writeJsonObjectContentToFile(pathToFile);
		return generatedCode;
	}
	
	private String generateCode(Print p) {
		String generatedCode = "";
		String key = p.getKey();
		generatedCode += "\t\t System.out.println(jsonObject.get(" + key + "));\n";
		return generatedCode;
	}
	
	private String generateCode(Insert i) {
		String generatedCode = "";
		String key = i.getKey();
		String value = i.getValue().getStringValue();
		generatedCode += "\t\t jsonObject.put(" + key + ", " + value + ");\n";
		generatedCode += writeJsonObjectContentToFile(baseFile);
		return generatedCode;
	}
	
	private String generateCode(Update u) {
		String generatedCode = "";
		String key = u.getKey();
		String newValue = u.getNewValue().getStringValue();
		generatedCode += "\t\t jsonObject.put(" + key + ", " + newValue + ");\n";
		generatedCode += writeJsonObjectContentToFile(baseFile);
		return generatedCode;	
	}
	
	private String generateCode(Compute c) {
		String key1 = c.getKey1();
		String key2 = c.getKey2();
		String generatedCode = "";

		if(c instanceof Sum) {
			generatedCode += "\t\t value1 = (long) jsonObject.get(" + key1 + ");\n";
			generatedCode += "\t\t value2 = (long) jsonObject.get(" + key2 + ");\n";				
			generatedCode += "\t\t System.out.println(value1 + value2);\n"; // to remove later
		}
		if(c instanceof Product) {
			generatedCode += "\t\t value1 = (long) jsonObject.get(" + key1 + ");\n";
			generatedCode += "\t\t value2 = (long) jsonObject.get(" + key2 + ");\n";				
			generatedCode += "\t\t System.out.println(value1 * value2);\n"; // to remove later
		}
		return generatedCode;
	}
}
