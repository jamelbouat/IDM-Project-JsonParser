package org.xtext.example.idmproject.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.xtext.example.idmproject.jsonParser.Instruction;
import org.xtext.example.idmproject.jsonParser.JsonModel;
import org.xtext.example.idmproject.jsonParser.*;

public class PythonCompiler {
	
	private JsonModel _model;
	private String baseFile;
	
	public PythonCompiler(JsonModel _model) {
		this._model = _model;
	}
	
	public void compileAndRun() throws IOException {
		String PYTHON_OUTPUT = "jsonparser_test.py";			
		baseFile = _model.getBaseLoad().getFile();
		String pythonCode = "import json\n" + 
				            "with open("+baseFile+") as f:\n" +
				            " data = json.load(f)\n";
		
		Files.write(Paths.get(PYTHON_OUTPUT), pythonCode.getBytes());
		
		for(Instruction i : _model.getInstructions()) {
			String instructionCode = generateCode(i);
			Files.write(Paths.get(PYTHON_OUTPUT), instructionCode.getBytes(), StandardOpenOption.APPEND);
		}
		
		Process p = Runtime.getRuntime().exec("python3 " + PYTHON_OUTPUT);

		//output
	    BufferedReader stdInput = new BufferedReader(new 
	         InputStreamReader(p.getInputStream()));

	    // error
	    BufferedReader stdError = new BufferedReader(new 
	         InputStreamReader(p.getErrorStream()));
	    
	    String o;
		while ((o = stdInput.readLine()) != null) {
	        System.out.println(o);
	    }
	    
		String err; 
		while ((err = stdError.readLine()) != null) {
	        System.out.println(err);
	    }
	}
	
	private String generateCode(Instruction i) {

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
			if(i.getModify() instanceof Modify) {
				return generateCode(i.getModify());
			}
			if(i.getCompute() instanceof Compute) {
				return generateCode(i.getCompute());
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
		generatedCode += "with open("+pathToFile+", 'w') as newFile:\n"
				        + " json.dump(data, newFile)";
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
		Expression expr = i.getExpression();
		String key = expr.getKey();
		String value = expr.getValue().getStringValue();
		System.out.println(key + "===" + value);
		generatedCode = "data["+key+"] = " + value + "\n" +
						"with open("+ baseFile +", 'w') as f:\n"
						+ " json.dump(data, f)";
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
