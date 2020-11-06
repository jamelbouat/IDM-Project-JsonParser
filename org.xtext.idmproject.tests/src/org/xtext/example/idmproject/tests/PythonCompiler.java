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
			generateCode(i);
			Files.write(pythonCode.getBytes(), JsonParserTest);

		}
		
	}
	private void generateCode(Instruction i) {
			if(i instanceof Select) {
				generateCode((Select)i);
			}
			if(i instanceof Store) {
				generateCode((Store)i);
			}
			if(i instanceof Print) {
				generateCode((Print)i);
			}
			if(i instanceof Insert) {
				generateCode((Insert)i);
			}
			if(i instanceof Modify) {
				generateCode((Modify)i);
			}
			if(i instanceof Compute) {
				generateCode((Compute)i);
			}
	}
	private void generateCode(Select s) {
	}
	private void generateCode(Store s) {
	}
	private void generateCode(Print p) {
	}
	private void generateCode(Insert i) {
	}
	private void generateCode(Modify m) {
	}
	private void generateCode(Compute c) {
	}
}
