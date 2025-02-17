/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.idmproject.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.idmproject.jsonParser.Export;
import org.xtext.example.idmproject.jsonParser.GetValue;
import org.xtext.example.idmproject.jsonParser.Insert;
import org.xtext.example.idmproject.jsonParser.Instruction;
import org.xtext.example.idmproject.jsonParser.JsonModel;
import org.xtext.example.idmproject.jsonParser.JsonParserPackage;
import org.xtext.example.idmproject.jsonParser.Load;
import org.xtext.example.idmproject.jsonParser.Print;
import org.xtext.example.idmproject.jsonParser.Product;
import org.xtext.example.idmproject.jsonParser.Select;
import org.xtext.example.idmproject.jsonParser.Store;
import org.xtext.example.idmproject.jsonParser.Sum;
import org.xtext.example.idmproject.jsonParser.Update;
import org.xtext.example.idmproject.jsonParser.Value;
import org.xtext.example.idmproject.services.JsonParserGrammarAccess;

@SuppressWarnings("all")
public class JsonParserSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JsonParserGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == JsonParserPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case JsonParserPackage.EXPORT:
				sequence_Export(context, (Export) semanticObject); 
				return; 
			case JsonParserPackage.GET_VALUE:
				sequence_GetValue(context, (GetValue) semanticObject); 
				return; 
			case JsonParserPackage.INSERT:
				sequence_Insert(context, (Insert) semanticObject); 
				return; 
			case JsonParserPackage.INSTRUCTION:
				sequence_Instruction(context, (Instruction) semanticObject); 
				return; 
			case JsonParserPackage.JSON_MODEL:
				sequence_JsonModel(context, (JsonModel) semanticObject); 
				return; 
			case JsonParserPackage.LOAD:
				sequence_Load(context, (Load) semanticObject); 
				return; 
			case JsonParserPackage.PRINT:
				sequence_Print(context, (Print) semanticObject); 
				return; 
			case JsonParserPackage.PRODUCT:
				sequence_Product(context, (Product) semanticObject); 
				return; 
			case JsonParserPackage.SELECT:
				sequence_Select(context, (Select) semanticObject); 
				return; 
			case JsonParserPackage.STORE:
				sequence_Store(context, (Store) semanticObject); 
				return; 
			case JsonParserPackage.SUM:
				sequence_Sum(context, (Sum) semanticObject); 
				return; 
			case JsonParserPackage.UPDATE:
				sequence_Update(context, (Update) semanticObject); 
				return; 
			case JsonParserPackage.VALUE:
				sequence_Value(context, (Value) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Export returns Export
	 *
	 * Constraint:
	 *     csvFileName=STRING
	 */
	protected void sequence_Export(ISerializationContext context, Export semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonParserPackage.Literals.EXPORT__CSV_FILE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonParserPackage.Literals.EXPORT__CSV_FILE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExportAccess().getCsvFileNameSTRINGTerminalRuleCall_1_0(), semanticObject.getCsvFileName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GetValue returns GetValue
	 *
	 * Constraint:
	 *     key=Key
	 */
	protected void sequence_GetValue(ISerializationContext context, GetValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonParserPackage.Literals.GET_VALUE__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonParserPackage.Literals.GET_VALUE__KEY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGetValueAccess().getKeyKeyParserRuleCall_1_0(), semanticObject.getKey());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Insert returns Insert
	 *
	 * Constraint:
	 *     (key=Key value=Value)
	 */
	protected void sequence_Insert(ISerializationContext context, Insert semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonParserPackage.Literals.INSERT__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonParserPackage.Literals.INSERT__KEY));
			if (transientValues.isValueTransient(semanticObject, JsonParserPackage.Literals.INSERT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonParserPackage.Literals.INSERT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInsertAccess().getKeyKeyParserRuleCall_1_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getInsertAccess().getValueValueParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Instruction
	 *
	 * Constraint:
	 *     (
	 *         select=Select | 
	 *         store=Store | 
	 *         save=Save | 
	 *         print=Print | 
	 *         insert=Insert | 
	 *         update=Update | 
	 *         compute=Compute | 
	 *         get=GetValue | 
	 *         export=Export
	 *     )
	 */
	protected void sequence_Instruction(ISerializationContext context, Instruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JsonModel returns JsonModel
	 *
	 * Constraint:
	 *     (baseLoad=Load instructions+=Instruction*)
	 */
	protected void sequence_JsonModel(ISerializationContext context, JsonModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Load returns Load
	 *
	 * Constraint:
	 *     file=File
	 */
	protected void sequence_Load(ISerializationContext context, Load semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonParserPackage.Literals.LOAD__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonParserPackage.Literals.LOAD__FILE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLoadAccess().getFileFileParserRuleCall_1_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Print returns Print
	 *
	 * Constraint:
	 *     key=Key
	 */
	protected void sequence_Print(ISerializationContext context, Print semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonParserPackage.Literals.PRINT__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonParserPackage.Literals.PRINT__KEY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrintAccess().getKeyKeyParserRuleCall_1_0(), semanticObject.getKey());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Compute returns Product
	 *     Product returns Product
	 *
	 * Constraint:
	 *     (key1=Key key2=Key)
	 */
	protected void sequence_Product(ISerializationContext context, Product semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonParserPackage.Literals.COMPUTE__KEY1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonParserPackage.Literals.COMPUTE__KEY1));
			if (transientValues.isValueTransient(semanticObject, JsonParserPackage.Literals.COMPUTE__KEY2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonParserPackage.Literals.COMPUTE__KEY2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProductAccess().getKey1KeyParserRuleCall_1_0(), semanticObject.getKey1());
		feeder.accept(grammarAccess.getProductAccess().getKey2KeyParserRuleCall_3_0(), semanticObject.getKey2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Select returns Select
	 *
	 * Constraint:
	 *     (id=ID key=Key)
	 */
	protected void sequence_Select(ISerializationContext context, Select semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonParserPackage.Literals.SELECT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonParserPackage.Literals.SELECT__ID));
			if (transientValues.isValueTransient(semanticObject, JsonParserPackage.Literals.SELECT__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonParserPackage.Literals.SELECT__KEY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSelectAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getSelectAccess().getKeyKeyParserRuleCall_3_0(), semanticObject.getKey());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Store returns Store
	 *
	 * Constraint:
	 *     file=File
	 */
	protected void sequence_Store(ISerializationContext context, Store semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonParserPackage.Literals.STORE__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonParserPackage.Literals.STORE__FILE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStoreAccess().getFileFileParserRuleCall_1_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Compute returns Sum
	 *     Sum returns Sum
	 *
	 * Constraint:
	 *     (key1=Key key2=Key)
	 */
	protected void sequence_Sum(ISerializationContext context, Sum semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonParserPackage.Literals.COMPUTE__KEY1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonParserPackage.Literals.COMPUTE__KEY1));
			if (transientValues.isValueTransient(semanticObject, JsonParserPackage.Literals.COMPUTE__KEY2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonParserPackage.Literals.COMPUTE__KEY2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSumAccess().getKey1KeyParserRuleCall_1_0(), semanticObject.getKey1());
		feeder.accept(grammarAccess.getSumAccess().getKey2KeyParserRuleCall_3_0(), semanticObject.getKey2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Update returns Update
	 *
	 * Constraint:
	 *     (key=Key newValue=Value)
	 */
	protected void sequence_Update(ISerializationContext context, Update semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonParserPackage.Literals.UPDATE__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonParserPackage.Literals.UPDATE__KEY));
			if (transientValues.isValueTransient(semanticObject, JsonParserPackage.Literals.UPDATE__NEW_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonParserPackage.Literals.UPDATE__NEW_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUpdateAccess().getKeyKeyParserRuleCall_1_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getUpdateAccess().getNewValueValueParserRuleCall_3_0(), semanticObject.getNewValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns Value
	 *
	 * Constraint:
	 *     (stringValue=STRING | integerValue=INT | array=Array)
	 */
	protected void sequence_Value(ISerializationContext context, Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
