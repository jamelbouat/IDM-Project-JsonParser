package org.xtext.example.idmproject.tests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import com.google.common.io.Files;

import org.xtext.example.idmproject.jsonParser.*;

public class JavaCompiler {
	
	private JsonModel _model;
	private List<String> vars;

	
	public JavaCompiler(JsonModel _model) {
		this._model = _model;
		this.vars = new ArrayList<String>();

	}
	
	public void compileAndRun() throws IOException {
		String JAVA_OUTPUT = "jsonparser_test.java";			
		File jsonParserTest = new File(JAVA_OUTPUT);
		String baseFile = _model.getBaseLoad().getFile();
		String javaCode =
		  "import org.json.simple.*;\n\n"
		+ "public class Clazz {\n"
		+ "\tpublic static void main(String[] args) {\n"
		+ "\t\tJSONParser parser = new JSONParser();\n"
		+ "\t\tObject obj = parser.parse(new FileReader(\"baseFile\"));\n"
		+ "\t\tJSONObject jsonObject = (JSONObject)obj;"
		+ "\n\t}\n}";
		
		Files.write(javaCode.getBytes(), jsonParserTest);

		Process process = Runtime.getRuntime().exec("javac "+ JAVA_OUTPUT);
		process = Runtime.getRuntime().exec("java jsonparser_test");
		
		for(Instruction i : _model.getInstructions()) {
			String instructionCode;
			try {
				instructionCode = generateCode(i);
				Files.write(instructionCode.getBytes(), jsonParserTest);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
	
	private String generateCode(Instruction i) throws Exception {
		if(i instanceof Select) {
			return generateCode((Select)i);
		}
		if(i instanceof Store) {
			return generateCode((Store)i);
		}
		if(i instanceof Print) {
			return generateCode((Print)i);
		}
		if(i instanceof Insert) {
			return generateCode((Insert)i);
		}
		if(i instanceof Update) {
			return generateCode((Update) i);
		}
		if(i instanceof Compute) {
			return generateCode((Compute)i);
		}
		return "";
	}
	
	private String generateCode(Select s) throws Exception {
		String generatedCode = "";
		String key = s.getKey();
		String var = s.getId();

		if(vars.contains(var)) {
			throw new Exception();
		}

		vars.add(var);
		generatedCode += "Object "+ var +" = jsonObject.getJsonObject('"+key+"');";
		return generatedCode;
		
	}
	
	private String generateCode(Store s) {
		String generatedCode = "";
		String pathToFile = s.getFile();
		generatedCode+="FileWriter fileWriter = new FileWriter("+pathToFile+");";
		generatedCode+="fileWriter.write(jsonObject.toJSONString());";
		return generatedCode;
	}
	
	private String generateCode(Print p) {
		String generatedCode = "";
		String key = p.getKey();
		generatedCode += "System.out.println(jsonObject.getJsonObject('"+key+"'));";
		return generatedCode;
	}
	
	private String generateCode(Insert i) {
		String generatedCode = "";
		return generatedCode;
	}
	
	private String generateCode(Update u) {
		String generatedCode = "";
		String key = u.getKey();
		Value val = u.getNewValue();
		generatedCode += "JSONObject toUpdate = jsonObject.getJsonObject('"+key+"');";
		generatedCode += "toUpdate.put("+val+")";
		return generatedCode;	
	}
	
	private String generateCode(Compute c) {
		String key1 = c.getKey1();
		String key2 = c.getKey2();
		String generatedCode = "";

		if(c instanceof Sum) {
			generatedCode += "jsonObject.getJsonObject('"+key1+"') + jsonObject.getJsonObject('"+key2+"');";
			generatedCode += "System.out.println(jsonObject.getJsonObject('"+key1+"') + jsonObject.getJsonObject('"+key2+"'));"; //to remove later
		}
		if(c instanceof Product) {
			generatedCode += "jsonObject.getJsonObject('"+key1+"') * jsonObject.getJsonObject('"+key2+"');";
			generatedCode += "System.out.println(jsonObject.getJsonObject('"+key1+"') * jsonObject.getJsonObject('"+key2+"'))"; //to remove later
		}
		return generatedCode;
	}
}
