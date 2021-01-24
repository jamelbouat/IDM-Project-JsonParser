package org.xtext.example.idmproject.tests;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BenchmarkProgram {
	
	private Map<String, List<Long>> pythonCompilerBenchmark = new HashMap<>();
	private Map<String, List<Long>> javaCompilerBenchmark = new HashMap<>();
	private Map<String, List<Long>> interpreterBenchmark = new HashMap<>();

	public void addToPythonCompilerBenchmark(String operation, Long duration) {
		if (!pythonCompilerBenchmark.containsKey(operation)) {
			pythonCompilerBenchmark.put(operation, new ArrayList<>());
		}
		pythonCompilerBenchmark.get(operation).add(duration);
	}
	
	public void addToJavaCompilerBenchmark(String operation, Long duration) {
		if (!javaCompilerBenchmark.containsKey(operation)) {
			javaCompilerBenchmark.put(operation, new ArrayList<>());
		}
		javaCompilerBenchmark.get(operation).add(duration);
	}
	
	public void addToInterpreterBenchmark(String operation, Long duration) {
		if (!interpreterBenchmark.containsKey(operation)) {
			interpreterBenchmark.put(operation, new ArrayList<>());
		}
		interpreterBenchmark.get(operation).add(duration);
	}
	
	public void calculateExecutionTimesAndInsertTabularDataToFile() throws IOException {
		List<String[]> dataLines = new ArrayList<>();
		dataLines.add(new String[] { "Compiler/Interpreter", "Operation", "Minimum_duration", "Maximum_duration", "Average_duration" });
		
		List<Long> received_durations;
		// Used to store min, max and average durations as strings
		List<String> calculated_durations;
		
		for (String operation: pythonCompilerBenchmark.keySet()) {
			// Durations for Python compiler
			received_durations = pythonCompilerBenchmark.get(operation);
			calculated_durations = calculateDurations(received_durations);
			dataLines.add(new String[] { "Python Compiler", 
					                     operation, 
					                     calculated_durations.get(0), 
					                     calculated_durations.get(1), 
					                     calculated_durations.get(2) });
			
			// Durations for Java compiler
			received_durations = javaCompilerBenchmark.get(operation);
			calculated_durations = calculateDurations(received_durations);
			dataLines.add(new String[] { "Java Compiler", 
					                     operation, 
					                     calculated_durations.get(0), 
					                     calculated_durations.get(1), 
					                     calculated_durations.get(2) });
						
			// Durations for Java interpreter
			received_durations = interpreterBenchmark.get(operation);
			calculated_durations = calculateDurations(received_durations);
			dataLines.add(new String[] { "Java Interpreter", 
					                     operation, 
					                     calculated_durations.get(0), 
					                     calculated_durations.get(1), 
					                     calculated_durations.get(2) });			
		}
		
		// Create CSV file and insert dataLines to it
		File csvOutputFile = new File("benchmark_File.csv");
	    try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
	        dataLines.stream()
	          .map(this::convertToCSV)
	          .forEach(pw::println);
	    }
	}
	
	private String convertToCSV(String[] data) {
	    return Stream.of(data)
	      .collect(Collectors.joining(","));
	}
	
	private List<String> calculateDurations(List<Long> durations) {
		List<String> durations_list = new ArrayList<>();
		Long minimum_duration = (Collections.min(durations)) / 100000;
		Long maximum_duration = (Collections.max(durations)) / 100000;
		Long average_duration = (long) ((durations.stream().mapToDouble(a -> a).average()).getAsDouble()) / 100000;
		durations_list.add(minimum_duration.toString());
		durations_list.add(maximum_duration.toString());
		durations_list.add(average_duration.toString());
		
		return durations_list ;
	}
}
