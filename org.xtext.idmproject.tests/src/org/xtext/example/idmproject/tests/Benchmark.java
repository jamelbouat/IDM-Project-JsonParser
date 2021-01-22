package org.xtext.example.idmproject.tests;

import org.junit.platform.launcher.*;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import static org.junit.platform.engine.discovery.ClassNameFilter.includeClassNamePatterns;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Benchmark {
	private List<Long> pythonCompilerValue;
	private List<Long> javaCompilerValue;
	private List<Long> javaInterpreterValue;
    private static Benchmark INSTANCE = new Benchmark();
    private String instruction;
    public int count = 0;
	
	public Benchmark() {
		setJavaCompilerValue(new ArrayList());
		setPythonCompilerValue(new ArrayList());
		setJavaInterpreterValue(new ArrayList());
		setBenchmarkHeader();

	}
	public static Benchmark getInstance()
    {   return INSTANCE;
    }
	
	public List getJavaInterpreterValue() {
		return javaInterpreterValue;
	}
	public void setJavaInterpreterValue(List javaInterpreterValue) {
		this.javaInterpreterValue = javaInterpreterValue;
	}

	public List getJavaCompilerValue() {
		return javaCompilerValue;
	}

	public void setJavaCompilerValue(List javaCompilerValue) {
		this.javaCompilerValue = javaCompilerValue;
	}

	public List getPythonCompilerValue() {
		return pythonCompilerValue;
	}

	public void setPythonCompilerValue(List pythonCompilerValue) {
		this.pythonCompilerValue = pythonCompilerValue;
	}
	public void setBenchmarkHeader() {
		 String benchmark = "./benchmark/benchmark.csv";
		 try {
		        FileWriter fw = new FileWriter(benchmark, false);
		        BufferedWriter bw = new BufferedWriter(fw);
		        PrintWriter pw = new PrintWriter(bw);


		        pw.println("name" + ","+"instruction"+"," + "average execution time(ms)" +"," + "minimum execution time(ms)"+"," + "maximum execution time(ms)");
		        pw.flush();
		        pw.close();

		    } catch (FileNotFoundException e) {
		        System.out.println(e.getMessage());
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
	}
	public void computeNewRowForEach() throws IOException {
		String benchmark = "./benchmark/benchmark.csv";
		        FileWriter fw = new FileWriter(benchmark, true);
		        BufferedWriter bw = new BufferedWriter(fw);
		        PrintWriter pw = new PrintWriter(bw);

		        	
		        pw.println("compilateur Python" + ","+instruction+"," + mean(pythonCompilerValue) +"," + Collections.min(pythonCompilerValue)+"," + Collections.max(pythonCompilerValue));
		        pw.println("compilateur Java" + ","+instruction+"," + mean(javaCompilerValue) +"," + Collections.min(javaCompilerValue)+"," + Collections.max(javaCompilerValue));
		        pw.println("interpreteur Java" + ","+instruction+"," + mean(javaInterpreterValue) +"," + Collections.min(javaInterpreterValue)+"," + Collections.max(javaInterpreterValue));
		       
		        pw.flush();
		        pw.close();
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	private String mean(List<Long> values) {
		long sum = 0;
		  if(!values.isEmpty()) {
		    for (long val : values) {
		        sum += val;
		    }
		    return String.valueOf(sum / values.size());
		  }
		  return String.valueOf(sum);
	}
	
	

}
