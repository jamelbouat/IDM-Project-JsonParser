package org.xtext.example.idmproject.tests;

import java.io.File;
import java.io.IOException;
import com.google.common.io.Files;

import org.xtext.example.idmproject.jsonParser.Instruction;
import org.xtext.example.idmproject.jsonParser.JsonModel;
import org.xtext.example.idmproject.jsonParser.*;

public class JavaCompiler {
	
	private JsonModel _model;
	
	public JavaCompiler(JsonModel _model) {
		this._model = _model;
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
			String instructionCode = generateCode(i);
			Files.write(instructionCode.getBytes(), jsonParserTest);
		}
	}
	
	private String generateCode(Instruction i) {
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
	
	private String generateCode(Select s) {
		String generatedCode = "";
		return generatedCode;
		
	}
	
	private String generateCode(Store s) {
		String generatedCode = "";
		String pathToFile = s.getFile();
		generatedCode+="f = open("+pathToFile+", 'a')\n"
				+ "f.write(data)\n"
				+ "f.close()\n";
		return generatedCode;
	}
	
	private String generateCode(Print p) {
		String generatedCode = "";
		String key = p.getKey();
		generatedCode += "";
		return generatedCode;
	}
	
	private String generateCode(Insert i) {
		String generatedCode = "";
		return generatedCode;
	}
	
	private String generateCode(Update u) {
		String generatedCode = "";
		return generatedCode;
	}
	
	private String generateCode(Compute c) {
		String generatedCode = "";
		return generatedCode;
	}
}
