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

public class PythonCompiler {

	private JsonModel _model;
	private String baseFile;
	private List<String> vars;

	public PythonCompiler(JsonModel _model) {
		this._model = _model;
		this.vars = new ArrayList<String>();
	}

	public void compileAndRun() throws IOException {
		String PYTHON_OUTPUT = "jsonparser_test.py";			
		baseFile = _model.getBaseLoad().getFile();
		String pythonCode = "import json\n" + 
				"import csv\n"+	
				"with open("+baseFile+") as f:\n" +
				"\t data = json.load(f)\n";

		Files.write(Paths.get(PYTHON_OUTPUT), pythonCode.getBytes());

		for(Instruction i : _model.getInstructions()) {
			String instructionCode;
			try {
				instructionCode = generateCode(i);
				Files.write(Paths.get(PYTHON_OUTPUT), instructionCode.getBytes(), StandardOpenOption.APPEND);

			} catch (Exception e) {
				e.printStackTrace();
			}
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
		writeJsonObjectContentToFile();
	}
	
	private String writeJsonObjectContentToFile() {
		String codeWrittenToFile = "";
		codeWrittenToFile += "with open("+ baseFile +", 'w') as file:\n"
				+ "\t json.dump(data, file, indent=4)\n";
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
		generatedCode += "pairs = data.items()\n";
		generatedCode += "for key, value in pairs:\n";
		generatedCode += "\t if(key == " + key + "):\n";
		generatedCode += "\t\t " + var + " = value\n";
		return generatedCode;
	}

	private String generateCode(Store s) {
		String generatedCode = "";
		String pathToFile = s.getFile();
		generatedCode += "with open("+pathToFile+", 'w') as newFile:\n"
				+ "\t json.dump(data, newFile, indent=4)\n";
		return generatedCode;
	}

	private String generateCode(Print p) {
		String generatedCode = "";
		String key = p.getKey();
		generatedCode += "pairs = data.items()\n";
		generatedCode += "for key, value in pairs:\n";
		generatedCode += "\t if key == " + key + ":\n";
		generatedCode += "\t\t print(value)\n";
		return generatedCode;
	}

	private String generateCode(Insert i) {
		String generatedCode = "";
		String key = i.getKey();
		String value = i.getValue().getStringValue();
		generatedCode = "data["+key+"] = " + value + "\n";
		generatedCode += writeJsonObjectContentToFile();
		return generatedCode;
	}

	private String generateCode(Update u) {
		String generatedCode = "";
		String key = u.getKey();
		String value = u.getNewValue().getStringValue();
		generatedCode += "data[" + key + "] = " + value + "\n";
		generatedCode += writeJsonObjectContentToFile();
		generatedCode += "print(data["+ key + "])\n"; //to remove later
		return generatedCode;
	}

	private String generateCode(Compute c) {
		String key1 = c.getKey1();
		String key2 = c.getKey2();
		String generatedCode = "";

		if(c instanceof Sum) {
			generatedCode += "data["+key1+"] + data["+key2+"]\n";
			generatedCode += "print(data["+key1+"] + data["+key2+"])\n"; //to remove later
		}
		if(c instanceof Product) {
			generatedCode += "data["+key1+"] * data["+key2+"]\n";
			generatedCode += "print(data["+key1+"] * data["+key2+"])\n"; //to remove later
		}
		return generatedCode;
	}
	private String generateCode(Export e) {
		String csvFileName = e.getCsvFileName();
		String generatedCode = "";
		generatedCode += "keys = list(data.keys())\n";
		generatedCode += "try:\n"
				+ "    with open('"+csvFileName+"', 'w') as csvfile:\n"
				+ "        writer = csv.DictWriter(csvfile, fieldnames=keys)\n"
				+ "        writer.writeheader()\n"
				+ "        writer.writerow(data)\n"
				+ "except IOError:\n"
				+ "    print(\"I/O error\")";
		return generatedCode;
	}
}
