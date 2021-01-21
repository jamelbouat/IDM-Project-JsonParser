package org.xtext.example.idmproject.tests;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.xtext.example.idmproject.jsonParser.Compute;
import org.xtext.example.idmproject.jsonParser.Insert;
import org.xtext.example.idmproject.jsonParser.Instruction;
import org.xtext.example.idmproject.jsonParser.JsonModel;
import org.xtext.example.idmproject.jsonParser.Print;
import org.xtext.example.idmproject.jsonParser.Product;
import org.xtext.example.idmproject.jsonParser.Select;
import org.xtext.example.idmproject.jsonParser.Store;
import org.xtext.example.idmproject.jsonParser.Sum;
import org.xtext.example.idmproject.jsonParser.Update;

public class JavaInterpreter {
	
	private JsonModel _model;
	private JSONParser parser;
	private JSONObject jsonObject;
	private String baseFile;
	
	public JavaInterpreter(JsonModel _model) {
		this._model = _model;
		parser = new JSONParser();
	}
	
	public void interpretAndRun() throws IOException {

		try {
			baseFile = _model.getBaseLoad().getFile().replaceAll("^.|.$", "");
			FileReader fileReader = new FileReader(baseFile);
			Object obj = parser.parse(fileReader);
			jsonObject = (JSONObject)obj;
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
		for(Instruction i : _model.getInstructions()) {
			try {
				executeInstruction(i);
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}

	private void executeInstruction(Instruction i) throws IOException {
		if(i.getSelect() instanceof Select) {
			executeInstruction(i.getSelect());
		}
		if(i.getStore() instanceof Store) {
			executeInstruction(i.getStore());
		}
		if(i.getPrint() instanceof Print) {
			executeInstruction(i.getPrint());
		}
		if(i.getInsert() instanceof Insert) {
			executeInstruction(i.getInsert());
		}
		if(i.getUpdate() instanceof Update) {
			executeInstruction(i.getUpdate());
		}
		if(i.getCompute() instanceof Compute) {
			executeInstruction(i.getCompute());
		}
		if(i.getSave() instanceof String) {
			executeInstruction();
		}
	}
	
	private void executeInstruction() throws IOException {
		writeJsonObjectContentToFile(baseFile);
	}

	private void writeJsonObjectContentToFile(String file) throws IOException {
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(jsonObject.toString());
		fileWriter.flush();	
		fileWriter.close();	
		
	}

	private void executeInstruction(Select select) {
		String key = select.getKey().replaceAll("^.|.$", "");
		jsonObject.get(key);
	}
	
	private void executeInstruction(Store store) throws IOException {
		String pathToFile = store.getFile().replaceAll("^.|.$", "");
		writeJsonObjectContentToFile(pathToFile);
	}
	
	private void executeInstruction(Print print) {
		String key = print.getKey().replaceAll("^.|.$", "");
		Object valToPrint = jsonObject.get(key);
		//On choisit de ne pas afficher null qd la valeur est nulle et d'afficher un saut de ligne
		//Ceci est fait pour que le résultat soit pareil que le compilateur pyton et donc le dsl coherent
		if(valToPrint!=null) {
			System.out.println(valToPrint);
		}
	}

	private void executeInstruction(Insert insert) throws IOException {
		String key = insert.getKey().replaceAll("^.|.$", "");
		Object rawValue = insert.getValue();
		if(rawValue instanceof String) {
			String value = rawValue.toString();
			jsonObject.put(key, value);
			writeJsonObjectContentToFile(baseFile);
		}
		if(rawValue instanceof Integer) {
			int value = (int)rawValue;
			jsonObject.put(key, value);
			writeJsonObjectContentToFile(baseFile);
		}
	}
	
	private void executeInstruction(Update update) throws IOException {
		String key = update.getKey().replaceAll("^.|.$", "");
		String newValue = update.getNewValue().getStringValue().replaceAll("^.|.$", "");
		jsonObject.put(key, newValue);
		System.out.println(newValue);
		writeJsonObjectContentToFile(baseFile);
	}
	
	private void executeInstruction(Compute compute) {
		String key1 = compute.getKey1().replaceAll("^.|.$", "");
		String key2 = compute.getKey2().replaceAll("^.|.$", "");
		if(compute instanceof Sum) {

			long value1 = (long) jsonObject.get(key1);
			long value2 = (long) jsonObject.get(key2);				
			System.out.println(value1 + value2); // to remove later
		}
		if(compute instanceof Product) {
			long value1 = (long) jsonObject.get(key1);
			long value2 = (long) jsonObject.get(key2);				
			System.out.println(value1 * value2); // to remove later
		}

	}		

}
