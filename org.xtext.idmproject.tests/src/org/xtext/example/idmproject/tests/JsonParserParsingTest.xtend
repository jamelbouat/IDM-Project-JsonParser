/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.idmproject.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.idmproject.jsonParser.JsonModel
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.TestMethodOrder
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import java.io.ByteArrayOutputStream
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.AfterEach
import java.io.PrintStream
import java.io.PrintWriter
import java.util.List
import java.io.BufferedReader
import java.util.ArrayList
import java.io.FileReader
import java.util.Arrays
import org.junit.jupiter.api.Test
import org.junit.Before
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.RepeatedTest

@ExtendWith(InjectionExtension)
@InjectWith(JsonParserInjectorProvider)
@TestMethodOrder(OrderAnnotation) 
class JsonParserParsingTest {
	
	
	@Inject
	ParseHelper<JsonModel> parseHelper 
	Benchmark benchmark = Benchmark.instance;
	/* On va utiliser des tests sur les outputs pour bien verifier que nos sorties et erreurs des compilateurs python java et de l'interpreteur java soit les mêmes*/
	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	/*On garde de coté les Flux originaux de sortie pour rediriger ceux de nos tests vers ceux ci dessus */
	PrintStream originalOut = System.out;
	PrintStream originalErr = System.err;
	PythonCompiler pythonCompiler;
	JavaCompiler javaCompiler;
	JavaInterpreter javaInterpreter;

	@BeforeEach
	def void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}
	@BeforeEach
	def void setUp() {
	    val PrintWriter prw= new PrintWriter("file.json");
      	prw.println('{"key1" : "value1"}');          
      	prw.close();
	}
	
	@AfterEach
	def void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	@AfterEach
	def void computeBenchmarkRows() {
		originalOut.println(benchmark.count)
		benchmark.count += 1;
		if(benchmark.count==10){
			 benchmark.computeNewRowForEach();
			 benchmark.count = 0;
		}
	}
	
	/* Premier test , juste le load, on attends rien en sortie et aucune erreur */
	@RepeatedTest(10)
	@Order(1)
	def void loadBaseFile() {
		benchmark.instruction = "load"
		val result = parseHelper.parse('''
			.load("file.json")
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		var startTime = System.nanoTime();
		val pythonCompilerOut = pythonCompilerComputeAndAssertOutAreAlike(result);
		var stopTime = System.nanoTime();
		benchmark.pythonCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		startTime = System.nanoTime();
		val javaCompilerOut = javaCompilerComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		startTime = System.nanoTime();
		val javaInterpreterOut = javaInterpreterComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaInterpreterValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		Assertions.assertEquals(pythonCompilerOut,javaCompilerOut);
		Assertions.assertEquals(pythonCompilerOut,javaInterpreterOut);
		Assertions.assertEquals(javaCompilerOut,javaInterpreterOut);
	
	}
	
	@RepeatedTest(10)
	@Order(2)
	def void selectData() {
		benchmark.instruction = "load and 2 select"
		val result = parseHelper.parse('''
			.load("file.json")
			expr id1 =.select("key1")
			expr id2 =.select("key1")
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		var startTime = System.nanoTime();
		val pythonCompilerOut = pythonCompilerComputeAndAssertOutAreAlike(result);
		var stopTime = System.nanoTime();
		benchmark.pythonCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		startTime = System.nanoTime();
		val javaCompilerOut = javaCompilerComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		startTime = System.nanoTime();
		val javaInterpreterOut = javaInterpreterComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaInterpreterValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		Assertions.assertEquals(pythonCompilerOut,javaCompilerOut);
		Assertions.assertEquals(pythonCompilerOut,javaInterpreterOut);
		Assertions.assertEquals(javaCompilerOut,javaInterpreterOut);
		
		/* On test que la variable est bien ajouté dans les variables stockées */
		Assertions.assertTrue(javaCompiler.vars.contains("id1"))
		Assertions.assertTrue(javaCompiler.vars.contains("id2"))
	}

	@RepeatedTest(10)
	@Order(3)
	def void storeData() {
		benchmark.instruction = "load and 2 store"
		val result = parseHelper.parse('''
			.load("file.json")
			.store("newFile1.json")
			.store("newFile2.json")
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		var startTime = System.nanoTime();
		val pythonCompilerOut = pythonCompilerComputeAndAssertOutAreAlike(result);
		var stopTime = System.nanoTime();
		benchmark.pythonCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		startTime = System.nanoTime();
		val javaCompilerOut = javaCompilerComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		startTime = System.nanoTime();
		val javaInterpreterOut = javaInterpreterComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaInterpreterValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		Assertions.assertEquals(pythonCompilerOut,javaCompilerOut);
		Assertions.assertEquals(pythonCompilerOut,javaInterpreterOut);
		Assertions.assertEquals(javaCompilerOut,javaInterpreterOut);
	}
	
	@RepeatedTest(10)
	@Order(4)
	def void insertData() {
		benchmark.instruction = "load and 2 insert"
		val result = parseHelper.parse('''
			.load("file.json")
			.insert("newKey1","\"newValue1\"")
			.insert("newKey2","\"newValue2\"")
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		var startTime = System.nanoTime();
		val pythonCompilerOut = pythonCompilerComputeAndAssertOutAreAlike(result);
		var stopTime = System.nanoTime();
		benchmark.pythonCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		startTime = System.nanoTime();
		val javaCompilerOut = javaCompilerComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		startTime = System.nanoTime();
		val javaInterpreterOut = javaInterpreterComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaInterpreterValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		Assertions.assertEquals(pythonCompilerOut,javaCompilerOut);
		Assertions.assertEquals(pythonCompilerOut,javaInterpreterOut);
		Assertions.assertEquals(javaCompilerOut,javaInterpreterOut);
	}
	
	@RepeatedTest(10)
	@Order(5)
	def void printData() {
		benchmark.instruction = "load and 2 print"
		val result = parseHelper.parse('''
			.load("file.json")
			.print("key1")
			.print("key2")
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		var startTime = System.nanoTime();
		val pythonCompilerOut = pythonCompilerComputeAndAssertOutAreAlike(result);
		var stopTime = System.nanoTime();
		benchmark.pythonCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		startTime = System.nanoTime();
		val javaCompilerOut = javaCompilerComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		startTime = System.nanoTime();
		val javaInterpreterOut = javaInterpreterComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaInterpreterValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		Assertions.assertEquals(pythonCompilerOut,javaCompilerOut);
		Assertions.assertEquals(pythonCompilerOut,javaInterpreterOut);
		Assertions.assertEquals(javaCompilerOut,javaInterpreterOut);		

	}
	
	@RepeatedTest(10)
	@Order(6)
	def void updateData() {
		benchmark.instruction = "load and 2 update"
		val result = parseHelper.parse('''
			.load("file.json")
			.update("key1","\"updatedValue1\"")
			.update("key2","\"updatedValue2\"")
			.save()
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		var startTime = System.nanoTime();
		val pythonCompilerOut = pythonCompilerComputeAndAssertOutAreAlike(result);
		var stopTime = System.nanoTime();
		benchmark.pythonCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		startTime = System.nanoTime();
		val javaCompilerOut = javaCompilerComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		startTime = System.nanoTime();
		val javaInterpreterOut = javaInterpreterComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaInterpreterValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		Assertions.assertEquals(pythonCompilerOut,javaCompilerOut);
		Assertions.assertEquals(pythonCompilerOut,javaInterpreterOut);
		Assertions.assertEquals(javaCompilerOut,javaInterpreterOut);	}
	
	@RepeatedTest(10)
	@Order(7)
	def void computeData() {
		benchmark.instruction = "load + 2 insert +sum +product"
		val result = parseHelper.parse('''
			.load("file.json")
			.insert("key3","2")
			.insert("key4","3")
			.sum("key3" + "key4")
			.product("key3" * "key4")
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		var startTime = System.nanoTime();
		val pythonCompilerOut = pythonCompilerComputeAndAssertOutAreAlike(result);
		var stopTime = System.nanoTime();
		benchmark.pythonCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		startTime = System.nanoTime();
		val javaCompilerOut = javaCompilerComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		startTime = System.nanoTime();
		val javaInterpreterOut = javaInterpreterComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaInterpreterValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		Assertions.assertEquals(pythonCompilerOut,javaCompilerOut);
		Assertions.assertEquals(pythonCompilerOut,javaInterpreterOut);
		Assertions.assertEquals(javaCompilerOut,javaInterpreterOut);	}
	
	@RepeatedTest(10)
	@Order(8)
	def void saveData() {
		benchmark.instruction = "load and save"
		val result = parseHelper.parse('''
			.load("file.json")
			.save()
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		var startTime = System.nanoTime();
		val pythonCompilerOut = pythonCompilerComputeAndAssertOutAreAlike(result);
		var stopTime = System.nanoTime();
		benchmark.pythonCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		startTime = System.nanoTime();
		val javaCompilerOut = javaCompilerComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		startTime = System.nanoTime();
		val javaInterpreterOut = javaInterpreterComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaInterpreterValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		Assertions.assertEquals(pythonCompilerOut,javaCompilerOut);
		Assertions.assertEquals(pythonCompilerOut,javaInterpreterOut);
		Assertions.assertEquals(javaCompilerOut,javaInterpreterOut);	}
	@RepeatedTest(10)
	@Order(9)
	def void exportDataToCsv() {
		benchmark.instruction = "load + 2 insert +export" 
		val result = parseHelper.parse('''
			.load("file.json")
			.insert("key3","2")
			.insert("key4","3")
			.export("newFile.csv")
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		
		var startTime = System.nanoTime();
		val pythonCompilerOut = pythonCompilerComputeAndAssertOutAreAlike(result);
		var stopTime = System.nanoTime();
		benchmark.pythonCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		val List<List<String>> csvWithPythonCompiler = getCsvToString("newFile.csv"); 
		
		startTime = System.nanoTime();
		val javaCompilerOut = javaCompilerComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaCompilerValue.add((stopTime - startTime)/1000000)
		
		reInitStream
		
		val List<List<String>> csvWithJavaCompiler = getCsvToString("newFile.csv"); 
		
		startTime = System.nanoTime();
		val javaInterpreterOut = javaInterpreterComputeAndAssertOutAreAlike(result);
		stopTime = System.nanoTime();
		benchmark.javaInterpreterValue.add((stopTime - startTime)/1000000)
		reInitStream
		
		val List<List<String>> csvWithJavaInterpreter = getCsvToString("newFile.csv"); 
		
		originalOut.println(javaInterpreterOut)
		Assertions.assertEquals(pythonCompilerOut,javaCompilerOut);
		Assertions.assertEquals(pythonCompilerOut,javaInterpreterOut);
		Assertions.assertEquals(javaCompilerOut,javaInterpreterOut);		

		Assertions.assertEquals(csvWithPythonCompiler,csvWithJavaCompiler);
		Assertions.assertEquals(csvWithJavaCompiler,csvWithJavaInterpreter);
		Assertions.assertEquals(csvWithPythonCompiler,csvWithJavaInterpreter);		
	}
	def void reInitStream()	{
		/*Les lignes suivantes servent a vider le contenu pour ne pas garder celui d'avant lors de la comparaison */
		outContent.flush
		outContent = new ByteArrayOutputStream();
		setUpStreams
	}
	def String pythonCompilerComputeAndAssertOutAreAlike(JsonModel result){
		
		/*On assigne un nouveau compilateur ou interpreteur */
		pythonCompiler = new PythonCompiler(result)
		pythonCompiler.compileAndRun
		return outContent.toString()

		
	}
	def String javaCompilerComputeAndAssertOutAreAlike(JsonModel result){
	
		javaCompiler = new JavaCompiler(result)
		javaCompiler.compileAndRun
		return outContent.toString()
	}
	def String javaInterpreterComputeAndAssertOutAreAlike(JsonModel result){
	
		javaInterpreter = new JavaInterpreter(result);
		javaInterpreter.interpretAndRun
		return outContent.toString()

	}		
	def List<List<String>> getCsvToString(String path){
		val List<List<String>> records = new ArrayList();
		try (val BufferedReader br = new BufferedReader(new FileReader(path))) {
    		var String line = br.readLine();
    		while (line !== null) {
        		val String[] values = line.split(",");
        		records.add(Arrays.asList(values));
        		line = br.readLine();
    		}
    		br.close()
		}
		return records
	}
}
