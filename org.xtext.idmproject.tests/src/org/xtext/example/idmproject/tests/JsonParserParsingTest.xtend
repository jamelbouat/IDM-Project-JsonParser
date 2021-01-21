/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.idmproject.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.idmproject.jsonParser.JsonModel
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.TestMethodOrder
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Disabled
import java.io.ByteArrayOutputStream
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.AfterEach
import java.io.PrintStream
import java.io.PrintWriter

@ExtendWith(InjectionExtension)
@InjectWith(JsonParserInjectorProvider)
@TestMethodOrder(OrderAnnotation) 
class JsonParserParsingTest {
	@Inject
	ParseHelper<JsonModel> parseHelper 
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
	
	/* Premier test , juste le load, on attends rien en sortie et aucune erreur */
	@Test
	@Order(1)
	def void loadBaseFile() {
		val result = parseHelper.parse('''
			.load("file.json")
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		computeAndAssertOutAreAlike(result);

		
	}
	
	@Test
	@Order(2)
	def void selectData() {
		val result = parseHelper.parse('''
			.load("file.json")
			expr id1 =.select("key1")
			expr id2 =.select("key1")
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		computeAndAssertOutAreAlike(result);

		
		/* On test que la variable est bien ajouté dans les variables stockées */
		Assertions.assertTrue(javaCompiler.vars.contains("id1"))
		Assertions.assertTrue(javaCompiler.vars.contains("id2"))
	}

	@Test
	@Order(3)
	def void storeData() {
		val result = parseHelper.parse('''
			.load("file.json")
			.store("newFile1.json")
			.store("newFile2.json")
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		computeAndAssertOutAreAlike(result);

	}
	
	@Test
	@Order(4)
	def void insertData() {
		val result = parseHelper.parse('''
			.load("file.json")
			.insert("newKey1","\"newValue1\"")
			.insert("newKey2","\"newValue2\"")
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		computeAndAssertOutAreAlike(result);

	}
	
	@Test
	@Order(5)
	def void printData() {
		val result = parseHelper.parse('''
			.load("file.json")
			.print("key1")
			.print("key2")
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		computeAndAssertOutAreAlike(result);
		

	}
	
	@Test
	@Order(6)
	def void updateData() {
		val result = parseHelper.parse('''
			.load("file.json")
			.update("key1","\"updatedValue1\"")
			.update("key2","\"updatedValue2\"")
			.save()
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		computeAndAssertOutAreAlike(result);
	}
	
	@Test
	@Order(7)
	def void computeData() {
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
		
		computeAndAssertOutAreAlike(result);
	}
	
	@Test
	@Order(8)
	def void saveData() {
		val result = parseHelper.parse('''
			.load("file.json")
			.save()
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		computeAndAssertOutAreAlike(result);
	}
		
	def void computeAndAssertOutAreAlike(JsonModel result){
		
		/*On assigne un nouveau compilateur ou interpreteur */
		pythonCompiler = new PythonCompiler(result)
		pythonCompiler.compileAndRun
		val pythonCompilerOut =  outContent.toString()
		val pythonCompilerErr =  errContent.toString()

		/*Les lignes suivantes servent a vider le contenu pour ne pas garder celui d'avant lors de la comparaison */
		outContent.flush
		outContent = new ByteArrayOutputStream();
		setUpStreams
	    
		javaCompiler = new JavaCompiler(result)
		javaCompiler.compileAndRun
		val javaCompilerOut =  outContent.toString()
		val javaCompilerErr =  errContent.toString()
			
		outContent.flush
		outContent = new ByteArrayOutputStream();
		setUpStreams
	
		javaInterpreter = new JavaInterpreter(result);
		javaInterpreter.interpretAndRun
		val javaInterpreterOut =  outContent.toString()
		val javaInterpreterErr =  errContent.toString()
	
		outContent.flush
		outContent = new ByteArrayOutputStream();
		setUpStreams		
		originalOut.println("python compiler : " + pythonCompilerOut)
		originalOut.println("java compiler : " + javaCompilerOut)
		originalOut.println("java interpreter : " + javaInterpreterOut)
	
		Assertions.assertEquals(pythonCompilerOut,javaCompilerOut);
		Assertions.assertEquals(pythonCompilerOut,javaInterpreterOut);
		Assertions.assertEquals(javaCompilerOut,javaInterpreterOut);
		
		Assertions.assertEquals(pythonCompilerErr,javaCompilerErr);
		Assertions.assertEquals(pythonCompilerErr,javaInterpreterErr);
		Assertions.assertEquals(javaCompilerErr,javaInterpreterErr);
	}
}
