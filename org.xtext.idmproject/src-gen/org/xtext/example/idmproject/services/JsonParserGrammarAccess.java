/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.idmproject.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class JsonParserGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class JsonModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.JsonModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cBaseLoadAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cBaseLoadLoadParserRuleCall_0_0 = (RuleCall)cBaseLoadAssignment_0.eContents().get(0);
		private final Assignment cInstructionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cInstructionsInstructionParserRuleCall_1_0 = (RuleCall)cInstructionsAssignment_1.eContents().get(0);
		
		//JsonModel:
		//	baseLoad=Load
		//	instructions+=Instruction*;
		@Override public ParserRule getRule() { return rule; }
		
		//baseLoad=Load instructions+=Instruction*
		public Group getGroup() { return cGroup; }
		
		//baseLoad=Load
		public Assignment getBaseLoadAssignment_0() { return cBaseLoadAssignment_0; }
		
		//Load
		public RuleCall getBaseLoadLoadParserRuleCall_0_0() { return cBaseLoadLoadParserRuleCall_0_0; }
		
		//instructions+=Instruction*
		public Assignment getInstructionsAssignment_1() { return cInstructionsAssignment_1; }
		
		//Instruction
		public RuleCall getInstructionsInstructionParserRuleCall_1_0() { return cInstructionsInstructionParserRuleCall_1_0; }
	}
	public class InstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Instruction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cSelectAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cSelectSelectParserRuleCall_0_0 = (RuleCall)cSelectAssignment_0.eContents().get(0);
		private final Assignment cStoreAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cStoreStoreParserRuleCall_1_0 = (RuleCall)cStoreAssignment_1.eContents().get(0);
		private final Assignment cSaveAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cSaveSaveParserRuleCall_2_0 = (RuleCall)cSaveAssignment_2.eContents().get(0);
		private final Assignment cPrintAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cPrintPrintParserRuleCall_3_0 = (RuleCall)cPrintAssignment_3.eContents().get(0);
		private final Assignment cInsertAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cInsertInsertParserRuleCall_4_0 = (RuleCall)cInsertAssignment_4.eContents().get(0);
		private final Assignment cUpdateAssignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final RuleCall cUpdateUpdateParserRuleCall_5_0 = (RuleCall)cUpdateAssignment_5.eContents().get(0);
		private final Assignment cComputeAssignment_6 = (Assignment)cAlternatives.eContents().get(6);
		private final RuleCall cComputeComputeParserRuleCall_6_0 = (RuleCall)cComputeAssignment_6.eContents().get(0);
		private final Assignment cGetAssignment_7 = (Assignment)cAlternatives.eContents().get(7);
		private final RuleCall cGetGetValueParserRuleCall_7_0 = (RuleCall)cGetAssignment_7.eContents().get(0);
		
		//Instruction:
		//	select=Select | store=Store | save=Save | print=Print | insert=Insert | update=Update | compute=Compute |
		//	get=GetValue;
		@Override public ParserRule getRule() { return rule; }
		
		//select=Select | store=Store | save=Save | print=Print | insert=Insert | update=Update | compute=Compute | get=GetValue
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//select=Select
		public Assignment getSelectAssignment_0() { return cSelectAssignment_0; }
		
		//Select
		public RuleCall getSelectSelectParserRuleCall_0_0() { return cSelectSelectParserRuleCall_0_0; }
		
		//store=Store
		public Assignment getStoreAssignment_1() { return cStoreAssignment_1; }
		
		//Store
		public RuleCall getStoreStoreParserRuleCall_1_0() { return cStoreStoreParserRuleCall_1_0; }
		
		//save=Save
		public Assignment getSaveAssignment_2() { return cSaveAssignment_2; }
		
		//Save
		public RuleCall getSaveSaveParserRuleCall_2_0() { return cSaveSaveParserRuleCall_2_0; }
		
		//print=Print
		public Assignment getPrintAssignment_3() { return cPrintAssignment_3; }
		
		//Print
		public RuleCall getPrintPrintParserRuleCall_3_0() { return cPrintPrintParserRuleCall_3_0; }
		
		//insert=Insert
		public Assignment getInsertAssignment_4() { return cInsertAssignment_4; }
		
		//Insert
		public RuleCall getInsertInsertParserRuleCall_4_0() { return cInsertInsertParserRuleCall_4_0; }
		
		//update=Update
		public Assignment getUpdateAssignment_5() { return cUpdateAssignment_5; }
		
		//Update
		public RuleCall getUpdateUpdateParserRuleCall_5_0() { return cUpdateUpdateParserRuleCall_5_0; }
		
		//compute=Compute
		public Assignment getComputeAssignment_6() { return cComputeAssignment_6; }
		
		//Compute
		public RuleCall getComputeComputeParserRuleCall_6_0() { return cComputeComputeParserRuleCall_6_0; }
		
		//get=GetValue
		public Assignment getGetAssignment_7() { return cGetAssignment_7; }
		
		//GetValue
		public RuleCall getGetGetValueParserRuleCall_7_0() { return cGetGetValueParserRuleCall_7_0; }
	}
	public class LoadElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Load");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLoadKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFileAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFileFileParserRuleCall_1_0 = (RuleCall)cFileAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cEOLParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//Load:
		//	'.load(' file=File ')' EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//'.load(' file=File ')' EOL
		public Group getGroup() { return cGroup; }
		
		//'.load('
		public Keyword getLoadKeyword_0() { return cLoadKeyword_0; }
		
		//file=File
		public Assignment getFileAssignment_1() { return cFileAssignment_1; }
		
		//File
		public RuleCall getFileFileParserRuleCall_1_0() { return cFileFileParserRuleCall_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
		
		//EOL
		public RuleCall getEOLParserRuleCall_3() { return cEOLParserRuleCall_3; }
	}
	public class SelectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Select");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExprKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		private final Keyword cSelectKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cKeyAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cKeyKeyParserRuleCall_3_0 = (RuleCall)cKeyAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cEOLParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Select:
		//	'expr' id=ID '=.select(' key=Key ')' EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//'expr' id=ID '=.select(' key=Key ')' EOL
		public Group getGroup() { return cGroup; }
		
		//'expr'
		public Keyword getExprKeyword_0() { return cExprKeyword_0; }
		
		//id=ID
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }
		
		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }
		
		//'=.select('
		public Keyword getSelectKeyword_2() { return cSelectKeyword_2; }
		
		//key=Key
		public Assignment getKeyAssignment_3() { return cKeyAssignment_3; }
		
		//Key
		public RuleCall getKeyKeyParserRuleCall_3_0() { return cKeyKeyParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//EOL
		public RuleCall getEOLParserRuleCall_5() { return cEOLParserRuleCall_5; }
	}
	public class StoreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Store");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStoreKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFileAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFileFileParserRuleCall_1_0 = (RuleCall)cFileAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cEOLParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//Store:
		//	'.store(' file=File ')' EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//'.store(' file=File ')' EOL
		public Group getGroup() { return cGroup; }
		
		//'.store('
		public Keyword getStoreKeyword_0() { return cStoreKeyword_0; }
		
		//file=File
		public Assignment getFileAssignment_1() { return cFileAssignment_1; }
		
		//File
		public RuleCall getFileFileParserRuleCall_1_0() { return cFileFileParserRuleCall_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
		
		//EOL
		public RuleCall getEOLParserRuleCall_3() { return cEOLParserRuleCall_3; }
	}
	public class FileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.File");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//File:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class SaveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Save");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSaveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cEOLParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Save:
		//	'.save()' EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//'.save()' EOL
		public Group getGroup() { return cGroup; }
		
		//'.save()'
		public Keyword getSaveKeyword_0() { return cSaveKeyword_0; }
		
		//EOL
		public RuleCall getEOLParserRuleCall_1() { return cEOLParserRuleCall_1; }
	}
	public class PrintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Print");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPrintKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cKeyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cKeyKeyParserRuleCall_1_0 = (RuleCall)cKeyAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cEOLParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//Print:
		//	'.print(' key=Key ')' EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//'.print(' key=Key ')' EOL
		public Group getGroup() { return cGroup; }
		
		//'.print('
		public Keyword getPrintKeyword_0() { return cPrintKeyword_0; }
		
		//key=Key
		public Assignment getKeyAssignment_1() { return cKeyAssignment_1; }
		
		//Key
		public RuleCall getKeyKeyParserRuleCall_1_0() { return cKeyKeyParserRuleCall_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
		
		//EOL
		public RuleCall getEOLParserRuleCall_3() { return cEOLParserRuleCall_3; }
	}
	public class GetValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.GetValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cKeyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cKeyKeyParserRuleCall_1_0 = (RuleCall)cKeyAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cEOLParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//GetValue:
		//	'.get(' key=Key ')' EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//'.get(' key=Key ')' EOL
		public Group getGroup() { return cGroup; }
		
		//'.get('
		public Keyword getGetKeyword_0() { return cGetKeyword_0; }
		
		//key=Key
		public Assignment getKeyAssignment_1() { return cKeyAssignment_1; }
		
		//Key
		public RuleCall getKeyKeyParserRuleCall_1_0() { return cKeyKeyParserRuleCall_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
		
		//EOL
		public RuleCall getEOLParserRuleCall_3() { return cEOLParserRuleCall_3; }
	}
	public class InsertElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Insert");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInsertKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cKeyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cKeyKeyParserRuleCall_1_0 = (RuleCall)cKeyAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueValueParserRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cEOLParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Insert:
		//	'.insert(' key=Key ',' value=Value ')' EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//'.insert(' key=Key ',' value=Value ')' EOL
		public Group getGroup() { return cGroup; }
		
		//'.insert('
		public Keyword getInsertKeyword_0() { return cInsertKeyword_0; }
		
		//key=Key
		public Assignment getKeyAssignment_1() { return cKeyAssignment_1; }
		
		//Key
		public RuleCall getKeyKeyParserRuleCall_1_0() { return cKeyKeyParserRuleCall_1_0; }
		
		//','
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//value=Value
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }
		
		//Value
		public RuleCall getValueValueParserRuleCall_3_0() { return cValueValueParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//EOL
		public RuleCall getEOLParserRuleCall_5() { return cEOLParserRuleCall_5; }
	}
	public class UpdateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Update");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUpdateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cKeyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cKeyKeyParserRuleCall_1_0 = (RuleCall)cKeyAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNewValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNewValueValueParserRuleCall_3_0 = (RuleCall)cNewValueAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cEOLParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Update:
		//	'.update(' key=Key ',' newValue=Value ')' EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//'.update(' key=Key ',' newValue=Value ')' EOL
		public Group getGroup() { return cGroup; }
		
		//'.update('
		public Keyword getUpdateKeyword_0() { return cUpdateKeyword_0; }
		
		//key=Key
		public Assignment getKeyAssignment_1() { return cKeyAssignment_1; }
		
		//Key
		public RuleCall getKeyKeyParserRuleCall_1_0() { return cKeyKeyParserRuleCall_1_0; }
		
		//','
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//newValue=Value
		public Assignment getNewValueAssignment_3() { return cNewValueAssignment_3; }
		
		//Value
		public RuleCall getNewValueValueParserRuleCall_3_0() { return cNewValueValueParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//EOL
		public RuleCall getEOLParserRuleCall_5() { return cEOLParserRuleCall_5; }
	}
	public class ComputeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Compute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cSumParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cProductParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final RuleCall cEOLParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Compute:
		//	(Sum | Product) EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//(Sum | Product) EOL
		public Group getGroup() { return cGroup; }
		
		//(Sum | Product)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//Sum
		public RuleCall getSumParserRuleCall_0_0() { return cSumParserRuleCall_0_0; }
		
		//Product
		public RuleCall getProductParserRuleCall_0_1() { return cProductParserRuleCall_0_1; }
		
		//EOL
		public RuleCall getEOLParserRuleCall_1() { return cEOLParserRuleCall_1; }
	}
	public class SumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Sum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cKey1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cKey1KeyParserRuleCall_1_0 = (RuleCall)cKey1Assignment_1.eContents().get(0);
		private final Keyword cPlusSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cKey2Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cKey2KeyParserRuleCall_3_0 = (RuleCall)cKey2Assignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Sum:
		//	'.sum(' key1=Key '+' key2=Key ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'.sum(' key1=Key '+' key2=Key ')'
		public Group getGroup() { return cGroup; }
		
		//'.sum('
		public Keyword getSumKeyword_0() { return cSumKeyword_0; }
		
		//key1=Key
		public Assignment getKey1Assignment_1() { return cKey1Assignment_1; }
		
		//Key
		public RuleCall getKey1KeyParserRuleCall_1_0() { return cKey1KeyParserRuleCall_1_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_2() { return cPlusSignKeyword_2; }
		
		//key2=Key
		public Assignment getKey2Assignment_3() { return cKey2Assignment_3; }
		
		//Key
		public RuleCall getKey2KeyParserRuleCall_3_0() { return cKey2KeyParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class ProductElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Product");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProductKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cKey1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cKey1KeyParserRuleCall_1_0 = (RuleCall)cKey1Assignment_1.eContents().get(0);
		private final Keyword cAsteriskKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cKey2Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cKey2KeyParserRuleCall_3_0 = (RuleCall)cKey2Assignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Product:
		//	'.product(' key1=Key '*' key2=Key ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'.product(' key1=Key '*' key2=Key ')'
		public Group getGroup() { return cGroup; }
		
		//'.product('
		public Keyword getProductKeyword_0() { return cProductKeyword_0; }
		
		//key1=Key
		public Assignment getKey1Assignment_1() { return cKey1Assignment_1; }
		
		//Key
		public RuleCall getKey1KeyParserRuleCall_1_0() { return cKey1KeyParserRuleCall_1_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_2() { return cAsteriskKeyword_2; }
		
		//key2=Key
		public Assignment getKey2Assignment_3() { return cKey2Assignment_3; }
		
		//Key
		public RuleCall getKey2KeyParserRuleCall_3_0() { return cKey2KeyParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cKeyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cKeyKeyParserRuleCall_0_0 = (RuleCall)cKeyAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueValueParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Expression:
		//	key=Key ':' value=Value;
		@Override public ParserRule getRule() { return rule; }
		
		//key=Key ':' value=Value
		public Group getGroup() { return cGroup; }
		
		//key=Key
		public Assignment getKeyAssignment_0() { return cKeyAssignment_0; }
		
		//Key
		public RuleCall getKeyKeyParserRuleCall_0_0() { return cKeyKeyParserRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//value=Value
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//Value
		public RuleCall getValueValueParserRuleCall_2_0() { return cValueValueParserRuleCall_2_0; }
	}
	public class KeyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Key");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Key:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Value");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cStringValueAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cStringValueSTRINGTerminalRuleCall_0_0 = (RuleCall)cStringValueAssignment_0.eContents().get(0);
		private final Assignment cIntegerValueAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cIntegerValueINTTerminalRuleCall_1_0 = (RuleCall)cIntegerValueAssignment_1.eContents().get(0);
		private final Assignment cArrayAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cArrayArrayParserRuleCall_2_0 = (RuleCall)cArrayAssignment_2.eContents().get(0);
		
		//Value:
		//	stringValue=STRING | integerValue=INT | array=Array;
		@Override public ParserRule getRule() { return rule; }
		
		//stringValue=STRING | integerValue=INT | array=Array
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//stringValue=STRING
		public Assignment getStringValueAssignment_0() { return cStringValueAssignment_0; }
		
		//STRING
		public RuleCall getStringValueSTRINGTerminalRuleCall_0_0() { return cStringValueSTRINGTerminalRuleCall_0_0; }
		
		//integerValue=INT
		public Assignment getIntegerValueAssignment_1() { return cIntegerValueAssignment_1; }
		
		//INT
		public RuleCall getIntegerValueINTTerminalRuleCall_1_0() { return cIntegerValueINTTerminalRuleCall_1_0; }
		
		//array=Array
		public Assignment getArrayAssignment_2() { return cArrayAssignment_2; }
		
		//Array
		public RuleCall getArrayArrayParserRuleCall_2_0() { return cArrayArrayParserRuleCall_2_0; }
	}
	public class ArrayElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Array");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		
		//Array:
		//	'[' INT* | STRING* ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'[' INT* | STRING* ']'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'[' INT*
		public Group getGroup_0() { return cGroup_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0_0() { return cLeftSquareBracketKeyword_0_0; }
		
		//INT*
		public RuleCall getINTTerminalRuleCall_0_1() { return cINTTerminalRuleCall_0_1; }
		
		//STRING* ']'
		public Group getGroup_1() { return cGroup_1; }
		
		//STRING*
		public RuleCall getSTRINGTerminalRuleCall_1_0() { return cSTRINGTerminalRuleCall_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_1() { return cRightSquareBracketKeyword_1_1; }
	}
	public class EOLElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.EOL");
		private final Keyword cLineFeedKeyword = (Keyword)rule.eContents().get(1);
		
		//EOL:
		//	'\n';
		@Override public ParserRule getRule() { return rule; }
		
		//'\n'
		public Keyword getLineFeedKeyword() { return cLineFeedKeyword; }
	}
	
	
	private final JsonModelElements pJsonModel;
	private final InstructionElements pInstruction;
	private final LoadElements pLoad;
	private final SelectElements pSelect;
	private final StoreElements pStore;
	private final FileElements pFile;
	private final SaveElements pSave;
	private final PrintElements pPrint;
	private final GetValueElements pGetValue;
	private final InsertElements pInsert;
	private final UpdateElements pUpdate;
	private final ComputeElements pCompute;
	private final SumElements pSum;
	private final ProductElements pProduct;
	private final ExpressionElements pExpression;
	private final KeyElements pKey;
	private final ValueElements pValue;
	private final ArrayElements pArray;
	private final EOLElements pEOL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public JsonParserGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pJsonModel = new JsonModelElements();
		this.pInstruction = new InstructionElements();
		this.pLoad = new LoadElements();
		this.pSelect = new SelectElements();
		this.pStore = new StoreElements();
		this.pFile = new FileElements();
		this.pSave = new SaveElements();
		this.pPrint = new PrintElements();
		this.pGetValue = new GetValueElements();
		this.pInsert = new InsertElements();
		this.pUpdate = new UpdateElements();
		this.pCompute = new ComputeElements();
		this.pSum = new SumElements();
		this.pProduct = new ProductElements();
		this.pExpression = new ExpressionElements();
		this.pKey = new KeyElements();
		this.pValue = new ValueElements();
		this.pArray = new ArrayElements();
		this.pEOL = new EOLElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.idmproject.JsonParser".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//JsonModel:
	//	baseLoad=Load
	//	instructions+=Instruction*;
	public JsonModelElements getJsonModelAccess() {
		return pJsonModel;
	}
	
	public ParserRule getJsonModelRule() {
		return getJsonModelAccess().getRule();
	}
	
	//Instruction:
	//	select=Select | store=Store | save=Save | print=Print | insert=Insert | update=Update | compute=Compute |
	//	get=GetValue;
	public InstructionElements getInstructionAccess() {
		return pInstruction;
	}
	
	public ParserRule getInstructionRule() {
		return getInstructionAccess().getRule();
	}
	
	//Load:
	//	'.load(' file=File ')' EOL;
	public LoadElements getLoadAccess() {
		return pLoad;
	}
	
	public ParserRule getLoadRule() {
		return getLoadAccess().getRule();
	}
	
	//Select:
	//	'expr' id=ID '=.select(' key=Key ')' EOL;
	public SelectElements getSelectAccess() {
		return pSelect;
	}
	
	public ParserRule getSelectRule() {
		return getSelectAccess().getRule();
	}
	
	//Store:
	//	'.store(' file=File ')' EOL;
	public StoreElements getStoreAccess() {
		return pStore;
	}
	
	public ParserRule getStoreRule() {
		return getStoreAccess().getRule();
	}
	
	//File:
	//	STRING;
	public FileElements getFileAccess() {
		return pFile;
	}
	
	public ParserRule getFileRule() {
		return getFileAccess().getRule();
	}
	
	//Save:
	//	'.save()' EOL;
	public SaveElements getSaveAccess() {
		return pSave;
	}
	
	public ParserRule getSaveRule() {
		return getSaveAccess().getRule();
	}
	
	//Print:
	//	'.print(' key=Key ')' EOL;
	public PrintElements getPrintAccess() {
		return pPrint;
	}
	
	public ParserRule getPrintRule() {
		return getPrintAccess().getRule();
	}
	
	//GetValue:
	//	'.get(' key=Key ')' EOL;
	public GetValueElements getGetValueAccess() {
		return pGetValue;
	}
	
	public ParserRule getGetValueRule() {
		return getGetValueAccess().getRule();
	}
	
	//Insert:
	//	'.insert(' key=Key ',' value=Value ')' EOL;
	public InsertElements getInsertAccess() {
		return pInsert;
	}
	
	public ParserRule getInsertRule() {
		return getInsertAccess().getRule();
	}
	
	//Update:
	//	'.update(' key=Key ',' newValue=Value ')' EOL;
	public UpdateElements getUpdateAccess() {
		return pUpdate;
	}
	
	public ParserRule getUpdateRule() {
		return getUpdateAccess().getRule();
	}
	
	//Compute:
	//	(Sum | Product) EOL;
	public ComputeElements getComputeAccess() {
		return pCompute;
	}
	
	public ParserRule getComputeRule() {
		return getComputeAccess().getRule();
	}
	
	//Sum:
	//	'.sum(' key1=Key '+' key2=Key ')';
	public SumElements getSumAccess() {
		return pSum;
	}
	
	public ParserRule getSumRule() {
		return getSumAccess().getRule();
	}
	
	//Product:
	//	'.product(' key1=Key '*' key2=Key ')';
	public ProductElements getProductAccess() {
		return pProduct;
	}
	
	public ParserRule getProductRule() {
		return getProductAccess().getRule();
	}
	
	//Expression:
	//	key=Key ':' value=Value;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//Key:
	//	STRING;
	public KeyElements getKeyAccess() {
		return pKey;
	}
	
	public ParserRule getKeyRule() {
		return getKeyAccess().getRule();
	}
	
	//Value:
	//	stringValue=STRING | integerValue=INT | array=Array;
	public ValueElements getValueAccess() {
		return pValue;
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}
	
	//Array:
	//	'[' INT* | STRING* ']';
	public ArrayElements getArrayAccess() {
		return pArray;
	}
	
	public ParserRule getArrayRule() {
		return getArrayAccess().getRule();
	}
	
	//EOL:
	//	'\n';
	public EOLElements getEOLAccess() {
		return pEOL;
	}
	
	public ParserRule getEOLRule() {
		return getEOLAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
