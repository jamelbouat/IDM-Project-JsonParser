package org.xtext.example.idmproject.tests;

import java.io.File;
import java.io.IOException;
import com.google.common.io.Files;

import org.xtext.example.idmproject.jsonParser.Instruction;
import org.xtext.example.idmproject.jsonParser.JsonModel;
import org.xtext.example.idmproject.jsonParser.*;

public class PythonCompiler {
	
	private JsonModel _model;
	
	public PythonCompiler(JsonModel _model) {
		this._model = _model;
	}
	public void compileAndRun() throws IOException {
		String PYTHON_OUTPUT = "jsonparser_test.py";			
		File JsonParserTest = new File(PYTHON_OUTPUT);
		String baseFile = _model.getBaseLoad().getFile();
		String pythonCode = "import json\n" + 
				"with open('"+baseFile+"') as f:\n"
				+ "  data = json.load(f)\n";
		
		Files.write(pythonCode.getBytes(), JsonParserTest);

		for(Instruction i : _model.getInstructions()) {
			String instructionCode = generateCode(i);
			Files.write(instructionCode.getBytes(), JsonParserTest);

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
			if(i instanceof Modify) {
				return generateCode((Modify)i);
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
		Expression expr = p.getExpression();
		String key = expr.getKey();
		generatedCode += "";
		return generatedCode;
	}
	private String generateCode(Insert i) {
		String generatedCode = "";
		return generatedCode;
	}
	private String generateCode(Modify m) {
		String generatedCode = "";
		return generatedCode;
	}
	private String generateCode(Compute c) {
		String generatedCode = "";
		return generatedCode;
	}
}
