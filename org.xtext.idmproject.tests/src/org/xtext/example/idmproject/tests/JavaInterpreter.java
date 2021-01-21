package org.xtext.example.idmproject.tests;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.xtext.xbase.testing.typesystem.TypeSystemSmokeTester;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.xtext.example.idmproject.jsonParser.Compute;
import org.xtext.example.idmproject.jsonParser.Export;
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
		if(i.getExport() instanceof Export) {
			executeInstruction(i.getExport());
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
	private void executeInstruction(Export export) {
		String[] keys = new String[jsonObject.keySet().size()];
		Arrays.fill(keys, "");
		int i =0;
		for(Object obj:jsonObject.keySet()) {
			if(obj instanceof String) {
				keys[i] = obj.toString();
			}
			if(obj instanceof Integer) {
				keys[i] = String.valueOf(obj);
			}
			i++;
		}
		String[] values =new String[jsonObject.values().size()];
		Arrays.fill(values, "");
		i=0;
		for(Object obj:jsonObject.values()) {
			if(obj instanceof String) {
				values[i] = obj.toString();
			}
			else {
				values[i] = String.valueOf(obj);
			}
			i++;
		}
		List<String[]> lines = new ArrayList<>();
		lines.add(keys);
		lines.add(values);
		File csvOutputFile = new File(export.getCsvFileName());
	    try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
	        lines.stream()
	          .map(this::convertToCSV);
	    } catch (Exception e) {
			e.printStackTrace();
		}
		
	}		
	private String convertToCSV(String[] data) {
	    return Stream.of(data)
	      .map(this::escapeSpecialCharacters)
	      .collect(Collectors.joining(","));
	}
	private String escapeSpecialCharacters(String data) {
	    String escapedData = data.replaceAll("\\R", " ");
	    if (data.contains(",") || data.contains("\"") || data.contains("'")) {
	        data = data.replace("\"", "\"\"");
	        escapedData = "\"" + data + "\"";
	    }
	    return escapedData;
	}
}
