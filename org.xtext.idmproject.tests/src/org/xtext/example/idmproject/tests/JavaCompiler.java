package org.xtext.example.idmproject.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
				+ "import java.io.File;\n"
				+ "import java.io.FileReader;\n"
				+ "import java.io.IOException;\n"
				+ "import java.io.PrintWriter;\n"
				+ "import java.util.ArrayList;\n"
				+ "import java.util.Arrays;\n"
				+ "import java.util.List;\n"
				+ "import java.util.stream.Collectors;\n"
				+ "import java.util.stream.Stream;"
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
	
	public List<String> getVars() {
		return vars;
	}

	public void setVars(List<String> vars) {
		this.vars = vars;
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
		if(i.getExport() instanceof Export) {
			return generateCode(i.getExport());
		}
		return "";
	}
	
	private void generateCode() {
		writeJsonObjectContentToFile(baseFile);
	}
	
	private String writeJsonObjectContentToFile(String file) {
		String codeWrittenToFile = "";
		codeWrittenToFile += "\t\t fileWriter = new FileWriter(" + file + ");\n";
		codeWrittenToFile += "\t\t fileWriter.write(jsonObject.toJSONString());\n";
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
		generatedCode += "\t\t Object " + var + " = jsonObject.get(\"" + key + "\");\n";
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
		String key = p.getKey().replaceAll("^.|.$", "");
		generatedCode += "\t\t Object "+key+"Val = jsonObject.get(\"" + key + "\");\n";
		//On choisit de ne pas afficher null qd la valeur est nulle et d'afficher un saut de ligne
		//Ceci est fait pour que le résultat soit pareil que le compilateur pyton et donc le dsl coherent
		generatedCode += "\t\t if("+key+"Val !=null){\n";
		generatedCode += "\t\t\t System.out.println("+key+"Val);\n";
		generatedCode += "\t\t }\n";
		return generatedCode;
	}
	
	private String generateCode(Insert i) {
		String generatedCode = "";
		String key = i.getKey();
		Object rawValue = i.getValue();
		if(rawValue instanceof String) {
			String value = rawValue.toString();
			generatedCode += "\t\t jsonObject.put(" + key + ", " + value + ");\n";
			generatedCode += writeJsonObjectContentToFile(baseFile);
		}
		if(rawValue instanceof Integer) {
			int value = (int)rawValue;
			generatedCode += "\t\t jsonObject.put(" + key + ", " + value + ");\n";
			generatedCode += writeJsonObjectContentToFile(baseFile);
		}
		
		return generatedCode;
	}
	
	private String generateCode(Update u) {
		String generatedCode = "";
		String key = u.getKey();
		String newValue = u.getNewValue().getStringValue();
		generatedCode += "\t\t jsonObject.put(" + key + ", " + newValue + ");\n";
		generatedCode += "\t\t System.out.println ("+newValue + ");\n";
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
	private String generateCode(Export e) {
		String generatedCode ="";
		generatedCode += "\t\t ExporterToCsv exporter = new ExporterToCsv();\n";
		generatedCode += "\t\t exporter.execute(jsonObject);\n";
		generatedCode += " \n}\n}\n";
		generatedCode += "class ExporterToCsv{\n";
		generatedCode += " public void execute(JSONObject jsonObject){\n";
		generatedCode += "\t\t String[] keys = new String[jsonObject.keySet().size()];\n";
		generatedCode += "\t\t Arrays.fill(keys, \"\");\n";
		generatedCode += "\t\t int i =0;\n";
		generatedCode += "\t\t for(Object o:jsonObject.keySet()) {\n";
		generatedCode += "\t\t	if(o instanceof String) {\n";
		generatedCode += "\t\t		keys[i] = o.toString();}\n";
		generatedCode += "\t\t	if(o instanceof Integer) {\n";
		generatedCode += "\t\t		keys[i] = String.valueOf(o);\n}";
		generatedCode += "\t\t	i++;}\n";
		generatedCode += "\t\t String[] values = new String[jsonObject.values().size()];\n";
		generatedCode += "\t\t Arrays.fill(values, \"\");\n";
		generatedCode += "\t\t i =0;\n";
		generatedCode += "\t\t for(Object o:jsonObject.values()) {\n";
		generatedCode += "\t\t	if(o instanceof String) {\n";
		generatedCode += "\t\t		values[i] = o.toString();}\n";
		generatedCode += "\t\t	else {\n\n";
		generatedCode += "\t\t		values[i] = String.valueOf(o);\n}";
		generatedCode += "\t\t	i++;\n\t\t}\n";
	
		
		generatedCode += "List<String[]> lines = new ArrayList<>();\n"
				+ "		lines.add(keys);\n"
				+ "		lines.add(values);\n"
				+ "		File csvOutputFile = new File(\""+e.getCsvFileName()+"\");\n"
				+ "	    try (PrintWriter pw = new PrintWriter(csvOutputFile)) {\n"
				+ "	        lines.stream()\n"
				+ "	          .map(this::convertToCSV)\n"
				+ "           .forEach(pw::println);\n"
				+ "	    } catch (Exception e) {\n"
				+ "			e.printStackTrace();\n"
				+ "		}\n}";
		
		generatedCode += "private String convertToCSV(String[] data) {\n"
				+ "	    return Stream.of(data)\n"
				+ "	      .map(this::escapeSpecialCharacters)\n"
				+ "	      .collect(Collectors.joining(\",\"));\n"
				+ "	}\n";
		
		generatedCode += "private String escapeSpecialCharacters(String data) {\n"
				+ "	    String escapedData = data.replaceAll(\"\\\\R\", \" \");\n"
				+ "	    if (data.contains(\",\") || data.contains(\"\\\"\") || data.contains(\"'\")) {\n"
				+ "	        data = data.replace(\"\\\"\", \"\\\"\\\"\");\n"
				+ "	        escapedData = \"\\\"\" + data + \"\\\"\";\n"
				+ "	    }\n"
				+ "	    return escapedData;\n";
		return generatedCode;
		
	}		
	
	
}
