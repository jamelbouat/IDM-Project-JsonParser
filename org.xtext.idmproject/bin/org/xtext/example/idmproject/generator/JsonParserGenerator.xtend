/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.idmproject.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.idmproject.jsonParser.JsonModel
import java.util.List
import org.xtext.example.idmproject.jsonParser.*

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class JsonParserGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
	/* 	for(JsonModel model : resource.contents as List<JsonModel>){
			for(Instruction i : model.instructions){
				i.genInstruction
			}
		}
*/

//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
	}
	def dispatch genInstruction(Select select){
		
	}
	def dispatch genInstruction(Store store){
		
	}
	def dispatch genInstruction(Print print){
		
	}
	def dispatch genInstruction(Insert insert){
		
	}
	def dispatch genInstruction(Modify print){
		
	}
	def dispatch genInstruction(Compute print){
		
	}		
}
