/*
 * generated by Xtext 2.23.0
 */
grammar InternalJsonParser;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.idmproject.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.idmproject.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.idmproject.services.JsonParserGrammarAccess;

}

@parser::members {

 	private JsonParserGrammarAccess grammarAccess;

    public InternalJsonParserParser(TokenStream input, JsonParserGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "JsonModel";
   	}

   	@Override
   	protected JsonParserGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleJsonModel
entryRuleJsonModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJsonModelRule()); }
	iv_ruleJsonModel=ruleJsonModel
	{ $current=$iv_ruleJsonModel.current; }
	EOF;

// Rule JsonModel
ruleJsonModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getJsonModelAccess().getBaseLoadLoadParserRuleCall_0_0());
				}
				lv_baseLoad_0_0=ruleLoad
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJsonModelRule());
					}
					set(
						$current,
						"baseLoad",
						lv_baseLoad_0_0,
						"org.xtext.example.idmproject.JsonParser.Load");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getJsonModelAccess().getInstructionsInstructionParserRuleCall_1_0());
				}
				lv_instructions_1_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJsonModelRule());
					}
					add(
						$current,
						"instructions",
						lv_instructions_1_0,
						"org.xtext.example.idmproject.JsonParser.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleInstruction
entryRuleInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionRule()); }
	iv_ruleInstruction=ruleInstruction
	{ $current=$iv_ruleInstruction.current; }
	EOF;

// Rule Instruction
ruleInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructionAccess().getSelectSelectParserRuleCall_0_0());
				}
				lv_select_0_0=ruleSelect
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructionRule());
					}
					set(
						$current,
						"select",
						lv_select_0_0,
						"org.xtext.example.idmproject.JsonParser.Select");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructionAccess().getStoreStoreParserRuleCall_1_0());
				}
				lv_store_1_0=ruleStore
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructionRule());
					}
					set(
						$current,
						"store",
						lv_store_1_0,
						"org.xtext.example.idmproject.JsonParser.Store");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructionAccess().getSaveSaveParserRuleCall_2_0());
				}
				lv_save_2_0=ruleSave
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructionRule());
					}
					set(
						$current,
						"save",
						lv_save_2_0,
						"org.xtext.example.idmproject.JsonParser.Save");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructionAccess().getPrintPrintParserRuleCall_3_0());
				}
				lv_print_3_0=rulePrint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructionRule());
					}
					set(
						$current,
						"print",
						lv_print_3_0,
						"org.xtext.example.idmproject.JsonParser.Print");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructionAccess().getInsertInsertParserRuleCall_4_0());
				}
				lv_insert_4_0=ruleInsert
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructionRule());
					}
					set(
						$current,
						"insert",
						lv_insert_4_0,
						"org.xtext.example.idmproject.JsonParser.Insert");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructionAccess().getUpdateUpdateParserRuleCall_5_0());
				}
				lv_update_5_0=ruleUpdate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructionRule());
					}
					set(
						$current,
						"update",
						lv_update_5_0,
						"org.xtext.example.idmproject.JsonParser.Update");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructionAccess().getComputeComputeParserRuleCall_6_0());
				}
				lv_compute_6_0=ruleCompute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructionRule());
					}
					set(
						$current,
						"compute",
						lv_compute_6_0,
						"org.xtext.example.idmproject.JsonParser.Compute");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructionAccess().getGetGetValueParserRuleCall_7_0());
				}
				lv_get_7_0=ruleGetValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructionRule());
					}
					set(
						$current,
						"get",
						lv_get_7_0,
						"org.xtext.example.idmproject.JsonParser.GetValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLoad
entryRuleLoad returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLoadRule()); }
	iv_ruleLoad=ruleLoad
	{ $current=$iv_ruleLoad.current; }
	EOF;

// Rule Load
ruleLoad returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='.load('
		{
			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLoadAccess().getFileFileParserRuleCall_1_0());
				}
				lv_file_1_0=ruleFile
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLoadRule());
					}
					set(
						$current,
						"file",
						lv_file_1_0,
						"org.xtext.example.idmproject.JsonParser.File");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getLoadAccess().getRightParenthesisKeyword_2());
		}
		{
			newCompositeNode(grammarAccess.getLoadAccess().getEOLParserRuleCall_3());
		}
		ruleEOL
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSelect
entryRuleSelect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectRule()); }
	iv_ruleSelect=ruleSelect
	{ $current=$iv_ruleSelect.current; }
	EOF;

// Rule Select
ruleSelect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='expr'
		{
			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getExprKeyword_0());
		}
		(
			(
				lv_ID_1_0='.select('
				{
					newLeafNode(lv_ID_1_0, grammarAccess.getSelectAccess().getIDSelectKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelectRule());
					}
					setWithLastConsumed($current, "ID", lv_ID_1_0, ".select(");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectAccess().getKeyKeyParserRuleCall_2_0());
				}
				lv_key_2_0=ruleKey
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectRule());
					}
					set(
						$current,
						"key",
						lv_key_2_0,
						"org.xtext.example.idmproject.JsonParser.Key");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getSelectAccess().getRightParenthesisKeyword_3());
		}
		{
			newCompositeNode(grammarAccess.getSelectAccess().getEOLParserRuleCall_4());
		}
		ruleEOL
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleStore
entryRuleStore returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStoreRule()); }
	iv_ruleStore=ruleStore
	{ $current=$iv_ruleStore.current; }
	EOF;

// Rule Store
ruleStore returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='.store('
		{
			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStoreAccess().getFileFileParserRuleCall_1_0());
				}
				lv_file_1_0=ruleFile
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStoreRule());
					}
					set(
						$current,
						"file",
						lv_file_1_0,
						"org.xtext.example.idmproject.JsonParser.File");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getRightParenthesisKeyword_2());
		}
		{
			newCompositeNode(grammarAccess.getStoreAccess().getEOLParserRuleCall_3());
		}
		ruleEOL
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFile
entryRuleFile returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFileRule()); }
	iv_ruleFile=ruleFile
	{ $current=$iv_ruleFile.current.getText(); }
	EOF;

// Rule File
ruleFile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getFileAccess().getSTRINGTerminalRuleCall());
	}
;

// Entry rule entryRuleSave
entryRuleSave returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSaveRule()); }
	iv_ruleSave=ruleSave
	{ $current=$iv_ruleSave.current.getText(); }
	EOF;

// Rule Save
ruleSave returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='.save()'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSaveAccess().getSaveKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getSaveAccess().getEOLParserRuleCall_1());
		}
		this_EOL_1=ruleEOL
		{
			$current.merge(this_EOL_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePrint
entryRulePrint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrintRule()); }
	iv_rulePrint=rulePrint
	{ $current=$iv_rulePrint.current; }
	EOF;

// Rule Print
rulePrint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='.print('
		{
			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPrintAccess().getKeyKeyParserRuleCall_1_0());
				}
				lv_key_1_0=ruleKey
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPrintRule());
					}
					set(
						$current,
						"key",
						lv_key_1_0,
						"org.xtext.example.idmproject.JsonParser.Key");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getPrintAccess().getRightParenthesisKeyword_2());
		}
		{
			newCompositeNode(grammarAccess.getPrintAccess().getEOLParserRuleCall_3());
		}
		ruleEOL
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGetValue
entryRuleGetValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGetValueRule()); }
	iv_ruleGetValue=ruleGetValue
	{ $current=$iv_ruleGetValue.current; }
	EOF;

// Rule GetValue
ruleGetValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='.get('
		{
			newLeafNode(otherlv_0, grammarAccess.getGetValueAccess().getGetKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGetValueAccess().getKeyKeyParserRuleCall_1_0());
				}
				lv_key_1_0=ruleKey
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGetValueRule());
					}
					set(
						$current,
						"key",
						lv_key_1_0,
						"org.xtext.example.idmproject.JsonParser.Key");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getGetValueAccess().getRightParenthesisKeyword_2());
		}
		{
			newCompositeNode(grammarAccess.getGetValueAccess().getEOLParserRuleCall_3());
		}
		ruleEOL
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleInsert
entryRuleInsert returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInsertRule()); }
	iv_ruleInsert=ruleInsert
	{ $current=$iv_ruleInsert.current; }
	EOF;

// Rule Insert
ruleInsert returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='.insert('
		{
			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInsertAccess().getKeyKeyParserRuleCall_1_0());
				}
				lv_key_1_0=ruleKey
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInsertRule());
					}
					set(
						$current,
						"key",
						lv_key_1_0,
						"org.xtext.example.idmproject.JsonParser.Key");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getCommaKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInsertAccess().getValueValueParserRuleCall_3_0());
				}
				lv_value_3_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInsertRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"org.xtext.example.idmproject.JsonParser.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getInsertAccess().getRightParenthesisKeyword_4());
		}
		{
			newCompositeNode(grammarAccess.getInsertAccess().getEOLParserRuleCall_5());
		}
		ruleEOL
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleUpdate
entryRuleUpdate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUpdateRule()); }
	iv_ruleUpdate=ruleUpdate
	{ $current=$iv_ruleUpdate.current; }
	EOF;

// Rule Update
ruleUpdate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='.update('
		{
			newLeafNode(otherlv_0, grammarAccess.getUpdateAccess().getUpdateKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUpdateAccess().getKeyKeyParserRuleCall_1_0());
				}
				lv_key_1_0=ruleKey
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUpdateRule());
					}
					set(
						$current,
						"key",
						lv_key_1_0,
						"org.xtext.example.idmproject.JsonParser.Key");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getUpdateAccess().getCommaKeyword_2());
			}
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getUpdateAccess().getNewValueValueParserRuleCall_3_0());
				}
				lv_newValue_3_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUpdateRule());
					}
					set(
						$current,
						"newValue",
						lv_newValue_3_0,
						"org.xtext.example.idmproject.JsonParser.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getUpdateAccess().getRightParenthesisKeyword_4());
		}
		{
			newCompositeNode(grammarAccess.getUpdateAccess().getEOLParserRuleCall_5());
		}
		ruleEOL
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCompute
entryRuleCompute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComputeRule()); }
	iv_ruleCompute=ruleCompute
	{ $current=$iv_ruleCompute.current; }
	EOF;

// Rule Compute
ruleCompute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getComputeAccess().getSumParserRuleCall_0());
		}
		this_Sum_0=ruleSum
		{
			$current = $this_Sum_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getComputeAccess().getProductParserRuleCall_1());
		}
		this_Product_1=ruleProduct
		{
			$current = $this_Product_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSum
entryRuleSum returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSumRule()); }
	iv_ruleSum=ruleSum
	{ $current=$iv_ruleSum.current; }
	EOF;

// Rule Sum
ruleSum returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSumAccess().getKey1KeyParserRuleCall_0_0());
				}
				lv_key1_0_0=ruleKey
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSumRule());
					}
					set(
						$current,
						"key1",
						lv_key1_0_0,
						"org.xtext.example.idmproject.JsonParser.Key");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='+'
		{
			newLeafNode(otherlv_1, grammarAccess.getSumAccess().getPlusSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSumAccess().getKey2KeyParserRuleCall_2_0());
				}
				lv_key2_2_0=ruleKey
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSumRule());
					}
					set(
						$current,
						"key2",
						lv_key2_2_0,
						"org.xtext.example.idmproject.JsonParser.Key");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getSumAccess().getEOLParserRuleCall_3());
		}
		ruleEOL
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleProduct
entryRuleProduct returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProductRule()); }
	iv_ruleProduct=ruleProduct
	{ $current=$iv_ruleProduct.current; }
	EOF;

// Rule Product
ruleProduct returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getProductAccess().getKey1KeyParserRuleCall_0_0());
				}
				lv_key1_0_0=ruleKey
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProductRule());
					}
					set(
						$current,
						"key1",
						lv_key1_0_0,
						"org.xtext.example.idmproject.JsonParser.Key");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='*'
		{
			newLeafNode(otherlv_1, grammarAccess.getProductAccess().getAsteriskKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProductAccess().getKey2KeyParserRuleCall_2_0());
				}
				lv_key2_2_0=ruleKey
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProductRule());
					}
					set(
						$current,
						"key2",
						lv_key2_2_0,
						"org.xtext.example.idmproject.JsonParser.Key");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getProductAccess().getEOLParserRuleCall_3());
		}
		ruleEOL
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleKey
entryRuleKey returns [String current=null]:
	{ newCompositeNode(grammarAccess.getKeyRule()); }
	iv_ruleKey=ruleKey
	{ $current=$iv_ruleKey.current.getText(); }
	EOF;

// Rule Key
ruleKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getKeyAccess().getSTRINGTerminalRuleCall());
	}
;

// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current; }
	EOF;

// Rule Value
ruleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_stringValue_0_0=RULE_STRING
				{
					newLeafNode(lv_stringValue_0_0, grammarAccess.getValueAccess().getStringValueSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getValueRule());
					}
					setWithLastConsumed(
						$current,
						"stringValue",
						lv_stringValue_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		    |
		(
			(
				lv_integerValue_1_0=RULE_INT
				{
					newLeafNode(lv_integerValue_1_0, grammarAccess.getValueAccess().getIntegerValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getValueRule());
					}
					setWithLastConsumed(
						$current,
						"integerValue",
						lv_integerValue_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getValueAccess().getArrayArrayParserRuleCall_2_0());
				}
				lv_array_2_0=ruleArray
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getValueRule());
					}
					set(
						$current,
						"array",
						lv_array_2_0,
						"org.xtext.example.idmproject.JsonParser.Array");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleArray
entryRuleArray returns [String current=null]:
	{ newCompositeNode(grammarAccess.getArrayRule()); }
	iv_ruleArray=ruleArray
	{ $current=$iv_ruleArray.current.getText(); }
	EOF;

// Rule Array
ruleArray returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='['
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0_0());
			}
			(
				this_INT_1=RULE_INT
				{
					$current.merge(this_INT_1);
				}
				{
					newLeafNode(this_INT_1, grammarAccess.getArrayAccess().getINTTerminalRuleCall_0_1());
				}
			)*
		)
		    |
		(
			(
				this_STRING_2=RULE_STRING
				{
					$current.merge(this_STRING_2);
				}
				{
					newLeafNode(this_STRING_2, grammarAccess.getArrayAccess().getSTRINGTerminalRuleCall_1_0());
				}
			)*
			kw=']'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleEOL
entryRuleEOL returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEOLRule()); }
	iv_ruleEOL=ruleEOL
	{ $current=$iv_ruleEOL.current.getText(); }
	EOF;

// Rule EOL
ruleEOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='\n'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getEOLAccess().getLineFeedKeyword());
	}
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
