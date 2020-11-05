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
		private final Assignment cLoadAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cLoadLoadParserRuleCall_0_0 = (RuleCall)cLoadAssignment_0.eContents().get(0);
		private final Assignment cSelectAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cSelectSelectParserRuleCall_1_0 = (RuleCall)cSelectAssignment_1.eContents().get(0);
		private final Assignment cStoreAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cStoreStoreParserRuleCall_2_0 = (RuleCall)cStoreAssignment_2.eContents().get(0);
		private final Assignment cSaveAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cSaveSaveParserRuleCall_3_0 = (RuleCall)cSaveAssignment_3.eContents().get(0);
		private final Assignment cPrintAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cPrintPrintParserRuleCall_4_0 = (RuleCall)cPrintAssignment_4.eContents().get(0);
		private final Assignment cInsertAssignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final RuleCall cInsertInsertParserRuleCall_5_0 = (RuleCall)cInsertAssignment_5.eContents().get(0);
		private final Assignment cModifyAssignment_6 = (Assignment)cAlternatives.eContents().get(6);
		private final RuleCall cModifyModifyParserRuleCall_6_0 = (RuleCall)cModifyAssignment_6.eContents().get(0);
		private final Assignment cComputeAssignment_7 = (Assignment)cAlternatives.eContents().get(7);
		private final RuleCall cComputeComputeParserRuleCall_7_0 = (RuleCall)cComputeAssignment_7.eContents().get(0);
		
		//Instruction:
		//	load=Load | select=Select | store=Store | save=Save | print=Print | insert=Insert | modify=Modify | compute=Compute;
		@Override public ParserRule getRule() { return rule; }
		
		//load=Load | select=Select | store=Store | save=Save | print=Print | insert=Insert | modify=Modify | compute=Compute
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//load=Load
		public Assignment getLoadAssignment_0() { return cLoadAssignment_0; }
		
		//Load
		public RuleCall getLoadLoadParserRuleCall_0_0() { return cLoadLoadParserRuleCall_0_0; }
		
		//select=Select
		public Assignment getSelectAssignment_1() { return cSelectAssignment_1; }
		
		//Select
		public RuleCall getSelectSelectParserRuleCall_1_0() { return cSelectSelectParserRuleCall_1_0; }
		
		//store=Store
		public Assignment getStoreAssignment_2() { return cStoreAssignment_2; }
		
		//Store
		public RuleCall getStoreStoreParserRuleCall_2_0() { return cStoreStoreParserRuleCall_2_0; }
		
		//save=Save
		public Assignment getSaveAssignment_3() { return cSaveAssignment_3; }
		
		//Save
		public RuleCall getSaveSaveParserRuleCall_3_0() { return cSaveSaveParserRuleCall_3_0; }
		
		//print=Print
		public Assignment getPrintAssignment_4() { return cPrintAssignment_4; }
		
		//Print
		public RuleCall getPrintPrintParserRuleCall_4_0() { return cPrintPrintParserRuleCall_4_0; }
		
		//insert=Insert
		public Assignment getInsertAssignment_5() { return cInsertAssignment_5; }
		
		//Insert
		public RuleCall getInsertInsertParserRuleCall_5_0() { return cInsertInsertParserRuleCall_5_0; }
		
		//modify=Modify
		public Assignment getModifyAssignment_6() { return cModifyAssignment_6; }
		
		//Modify
		public RuleCall getModifyModifyParserRuleCall_6_0() { return cModifyModifyParserRuleCall_6_0; }
		
		//compute=Compute
		public Assignment getComputeAssignment_7() { return cComputeAssignment_7; }
		
		//Compute
		public RuleCall getComputeComputeParserRuleCall_7_0() { return cComputeComputeParserRuleCall_7_0; }
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
		private final Keyword cSelectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_1_0 = (RuleCall)cExpressionAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cEOLParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//Select:
		//	'.select(' expression=Expression ')' EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//'.select(' expression=Expression ')' EOL
		public Group getGroup() { return cGroup; }
		
		//'.select('
		public Keyword getSelectKeyword_0() { return cSelectKeyword_0; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_1() { return cExpressionAssignment_1; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_0() { return cExpressionExpressionParserRuleCall_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
		
		//EOL
		public RuleCall getEOLParserRuleCall_3() { return cEOLParserRuleCall_3; }
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
		private final Assignment cExpressionsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cExpressionsExpressionParserRuleCall_0 = (RuleCall)cExpressionsAssignment.eContents().get(0);
		
		//File:
		//	expressions+=Expression+;
		@Override public ParserRule getRule() { return rule; }
		
		//expressions+=Expression+
		public Assignment getExpressionsAssignment() { return cExpressionsAssignment; }
		
		//Expression
		public RuleCall getExpressionsExpressionParserRuleCall_0() { return cExpressionsExpressionParserRuleCall_0; }
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
		private final Assignment cExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_1_0 = (RuleCall)cExpressionAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cEOLParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//Print:
		//	'.print(' expression=Expression ')' EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//'.print(' expression=Expression ')' EOL
		public Group getGroup() { return cGroup; }
		
		//'.print('
		public Keyword getPrintKeyword_0() { return cPrintKeyword_0; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_1() { return cExpressionAssignment_1; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_0() { return cExpressionExpressionParserRuleCall_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
		
		//EOL
		public RuleCall getEOLParserRuleCall_3() { return cEOLParserRuleCall_3; }
	}
	public class InsertElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Insert");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInsertKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_1_0 = (RuleCall)cExpressionAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cEOLParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//Insert:
		//	'.insert(' expression=Expression ')' EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//'.insert(' expression=Expression ')' EOL
		public Group getGroup() { return cGroup; }
		
		//'.insert('
		public Keyword getInsertKeyword_0() { return cInsertKeyword_0; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_1() { return cExpressionAssignment_1; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_0() { return cExpressionExpressionParserRuleCall_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
		
		//EOL
		public RuleCall getEOLParserRuleCall_3() { return cEOLParserRuleCall_3; }
	}
	public class ModifyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Modify");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModifyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_1_0 = (RuleCall)cExpressionAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNewExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNewExpressionExpressionParserRuleCall_3_0 = (RuleCall)cNewExpressionAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cEOLParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Modify:
		//	'.modify(' expression=Expression ',' newExpression=Expression ')' EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//'.modify(' expression=Expression ',' newExpression=Expression ')' EOL
		public Group getGroup() { return cGroup; }
		
		//'.modify('
		public Keyword getModifyKeyword_0() { return cModifyKeyword_0; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_1() { return cExpressionAssignment_1; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_0() { return cExpressionExpressionParserRuleCall_1_0; }
		
		//','
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//newExpression=Expression
		public Assignment getNewExpressionAssignment_3() { return cNewExpressionAssignment_3; }
		
		//Expression
		public RuleCall getNewExpressionExpressionParserRuleCall_3_0() { return cNewExpressionExpressionParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//EOL
		public RuleCall getEOLParserRuleCall_5() { return cEOLParserRuleCall_5; }
	}
	public class ComputeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Compute");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSumParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cProductParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Compute:
		//	Sum | Product;
		@Override public ParserRule getRule() { return rule; }
		
		//Sum | Product
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Sum
		public RuleCall getSumParserRuleCall_0() { return cSumParserRuleCall_0; }
		
		//Product
		public RuleCall getProductParserRuleCall_1() { return cProductParserRuleCall_1; }
	}
	public class SumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Sum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExpression1Assignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cExpression1ExpressionParserRuleCall_0_0 = (RuleCall)cExpression1Assignment_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpression2Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpression2ExpressionParserRuleCall_2_0 = (RuleCall)cExpression2Assignment_2.eContents().get(0);
		private final RuleCall cEOLParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//Sum:
		//	expression1=Expression '+' expression2=Expression EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//expression1=Expression '+' expression2=Expression EOL
		public Group getGroup() { return cGroup; }
		
		//expression1=Expression
		public Assignment getExpression1Assignment_0() { return cExpression1Assignment_0; }
		
		//Expression
		public RuleCall getExpression1ExpressionParserRuleCall_0_0() { return cExpression1ExpressionParserRuleCall_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1() { return cPlusSignKeyword_1; }
		
		//expression2=Expression
		public Assignment getExpression2Assignment_2() { return cExpression2Assignment_2; }
		
		//Expression
		public RuleCall getExpression2ExpressionParserRuleCall_2_0() { return cExpression2ExpressionParserRuleCall_2_0; }
		
		//EOL
		public RuleCall getEOLParserRuleCall_3() { return cEOLParserRuleCall_3; }
	}
	public class ProductElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Product");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExpression1Assignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cExpression1ExpressionParserRuleCall_0_0 = (RuleCall)cExpression1Assignment_0.eContents().get(0);
		private final Keyword cAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpression2Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpression2ExpressionParserRuleCall_2_0 = (RuleCall)cExpression2Assignment_2.eContents().get(0);
		private final RuleCall cEOLParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//Product:
		//	expression1=Expression '*' expression2=Expression EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//expression1=Expression '*' expression2=Expression EOL
		public Group getGroup() { return cGroup; }
		
		//expression1=Expression
		public Assignment getExpression1Assignment_0() { return cExpression1Assignment_0; }
		
		//Expression
		public RuleCall getExpression1ExpressionParserRuleCall_0_0() { return cExpression1ExpressionParserRuleCall_0_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1() { return cAsteriskKeyword_1; }
		
		//expression2=Expression
		public Assignment getExpression2Assignment_2() { return cExpression2Assignment_2; }
		
		//Expression
		public RuleCall getExpression2ExpressionParserRuleCall_2_0() { return cExpression2ExpressionParserRuleCall_2_0; }
		
		//EOL
		public RuleCall getEOLParserRuleCall_3() { return cEOLParserRuleCall_3; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.idmproject.JsonParser.Expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cKeyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cKeyKeyParserRuleCall_0_0 = (RuleCall)cKeyAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueValueParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		private final RuleCall cEOLParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//Expression:
		//	key=Key ':' value=Value EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//key=Key ':' value=Value EOL
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
		
		//EOL
		public RuleCall getEOLParserRuleCall_3() { return cEOLParserRuleCall_3; }
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
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final Assignment cArrayAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cArrayArrayParserRuleCall_2_0 = (RuleCall)cArrayAssignment_2.eContents().get(0);
		
		//Value:
		//	STRING | INT | array=Array;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | INT | array=Array
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
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
	private final InsertElements pInsert;
	private final ModifyElements pModify;
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
		this.pInsert = new InsertElements();
		this.pModify = new ModifyElements();
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
	//	load=Load | select=Select | store=Store | save=Save | print=Print | insert=Insert | modify=Modify | compute=Compute;
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
	//	'.select(' expression=Expression ')' EOL;
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
	//	expressions+=Expression+;
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
	//	'.print(' expression=Expression ')' EOL;
	public PrintElements getPrintAccess() {
		return pPrint;
	}
	
	public ParserRule getPrintRule() {
		return getPrintAccess().getRule();
	}
	
	//Insert:
	//	'.insert(' expression=Expression ')' EOL;
	public InsertElements getInsertAccess() {
		return pInsert;
	}
	
	public ParserRule getInsertRule() {
		return getInsertAccess().getRule();
	}
	
	//Modify:
	//	'.modify(' expression=Expression ',' newExpression=Expression ')' EOL;
	public ModifyElements getModifyAccess() {
		return pModify;
	}
	
	public ParserRule getModifyRule() {
		return getModifyAccess().getRule();
	}
	
	//Compute:
	//	Sum | Product;
	public ComputeElements getComputeAccess() {
		return pCompute;
	}
	
	public ParserRule getComputeRule() {
		return getComputeAccess().getRule();
	}
	
	//Sum:
	//	expression1=Expression '+' expression2=Expression EOL;
	public SumElements getSumAccess() {
		return pSum;
	}
	
	public ParserRule getSumRule() {
		return getSumAccess().getRule();
	}
	
	//Product:
	//	expression1=Expression '*' expression2=Expression EOL;
	public ProductElements getProductAccess() {
		return pProduct;
	}
	
	public ParserRule getProductRule() {
		return getProductAccess().getRule();
	}
	
	//Expression:
	//	key=Key ':' value=Value EOL;
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
	//	STRING | INT | array=Array;
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