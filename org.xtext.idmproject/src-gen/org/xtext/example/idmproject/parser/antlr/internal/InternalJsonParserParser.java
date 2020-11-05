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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonParserParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.load('", "')'", "'.select('", "'.store('", "'.save()'", "'.print('", "'.insert('", "'.modify('", "','", "'+'", "'*'", "':'", "'['", "']'", "'\\n'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJsonParserParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJsonParserParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJsonParserParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJsonParser.g"; }



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




    // $ANTLR start "entryRuleJsonModel"
    // InternalJsonParser.g:64:1: entryRuleJsonModel returns [EObject current=null] : iv_ruleJsonModel= ruleJsonModel EOF ;
    public final EObject entryRuleJsonModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonModel = null;


        try {
            // InternalJsonParser.g:64:50: (iv_ruleJsonModel= ruleJsonModel EOF )
            // InternalJsonParser.g:65:2: iv_ruleJsonModel= ruleJsonModel EOF
            {
             newCompositeNode(grammarAccess.getJsonModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonModel=ruleJsonModel();

            state._fsp--;

             current =iv_ruleJsonModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonModel"


    // $ANTLR start "ruleJsonModel"
    // InternalJsonParser.g:71:1: ruleJsonModel returns [EObject current=null] : ( ( (lv_baseLoad_0_0= ruleLoad ) ) ( (lv_instructions_1_0= ruleInstruction ) )* ) ;
    public final EObject ruleJsonModel() throws RecognitionException {
        EObject current = null;

        EObject lv_baseLoad_0_0 = null;

        EObject lv_instructions_1_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:77:2: ( ( ( (lv_baseLoad_0_0= ruleLoad ) ) ( (lv_instructions_1_0= ruleInstruction ) )* ) )
            // InternalJsonParser.g:78:2: ( ( (lv_baseLoad_0_0= ruleLoad ) ) ( (lv_instructions_1_0= ruleInstruction ) )* )
            {
            // InternalJsonParser.g:78:2: ( ( (lv_baseLoad_0_0= ruleLoad ) ) ( (lv_instructions_1_0= ruleInstruction ) )* )
            // InternalJsonParser.g:79:3: ( (lv_baseLoad_0_0= ruleLoad ) ) ( (lv_instructions_1_0= ruleInstruction ) )*
            {
            // InternalJsonParser.g:79:3: ( (lv_baseLoad_0_0= ruleLoad ) )
            // InternalJsonParser.g:80:4: (lv_baseLoad_0_0= ruleLoad )
            {
            // InternalJsonParser.g:80:4: (lv_baseLoad_0_0= ruleLoad )
            // InternalJsonParser.g:81:5: lv_baseLoad_0_0= ruleLoad
            {

            					newCompositeNode(grammarAccess.getJsonModelAccess().getBaseLoadLoadParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_baseLoad_0_0=ruleLoad();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJsonModelRule());
            					}
            					set(
            						current,
            						"baseLoad",
            						lv_baseLoad_0_0,
            						"org.xtext.example.idmproject.JsonParser.Load");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonParser.g:98:3: ( (lv_instructions_1_0= ruleInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING||(LA1_0>=13 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJsonParser.g:99:4: (lv_instructions_1_0= ruleInstruction )
            	    {
            	    // InternalJsonParser.g:99:4: (lv_instructions_1_0= ruleInstruction )
            	    // InternalJsonParser.g:100:5: lv_instructions_1_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getJsonModelAccess().getInstructionsInstructionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_instructions_1_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJsonModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_1_0,
            	    						"org.xtext.example.idmproject.JsonParser.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonModel"


    // $ANTLR start "entryRuleInstruction"
    // InternalJsonParser.g:121:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalJsonParser.g:121:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalJsonParser.g:122:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalJsonParser.g:128:1: ruleInstruction returns [EObject current=null] : ( ( (lv_select_0_0= ruleSelect ) ) | ( (lv_store_1_0= ruleStore ) ) | ( (lv_save_2_0= ruleSave ) ) | ( (lv_print_3_0= rulePrint ) ) | ( (lv_insert_4_0= ruleInsert ) ) | ( (lv_modify_5_0= ruleModify ) ) | ( (lv_compute_6_0= ruleCompute ) ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject lv_select_0_0 = null;

        EObject lv_store_1_0 = null;

        AntlrDatatypeRuleToken lv_save_2_0 = null;

        EObject lv_print_3_0 = null;

        EObject lv_insert_4_0 = null;

        EObject lv_modify_5_0 = null;

        EObject lv_compute_6_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:134:2: ( ( ( (lv_select_0_0= ruleSelect ) ) | ( (lv_store_1_0= ruleStore ) ) | ( (lv_save_2_0= ruleSave ) ) | ( (lv_print_3_0= rulePrint ) ) | ( (lv_insert_4_0= ruleInsert ) ) | ( (lv_modify_5_0= ruleModify ) ) | ( (lv_compute_6_0= ruleCompute ) ) ) )
            // InternalJsonParser.g:135:2: ( ( (lv_select_0_0= ruleSelect ) ) | ( (lv_store_1_0= ruleStore ) ) | ( (lv_save_2_0= ruleSave ) ) | ( (lv_print_3_0= rulePrint ) ) | ( (lv_insert_4_0= ruleInsert ) ) | ( (lv_modify_5_0= ruleModify ) ) | ( (lv_compute_6_0= ruleCompute ) ) )
            {
            // InternalJsonParser.g:135:2: ( ( (lv_select_0_0= ruleSelect ) ) | ( (lv_store_1_0= ruleStore ) ) | ( (lv_save_2_0= ruleSave ) ) | ( (lv_print_3_0= rulePrint ) ) | ( (lv_insert_4_0= ruleInsert ) ) | ( (lv_modify_5_0= ruleModify ) ) | ( (lv_compute_6_0= ruleCompute ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            case 18:
                {
                alt2=6;
                }
                break;
            case RULE_STRING:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalJsonParser.g:136:3: ( (lv_select_0_0= ruleSelect ) )
                    {
                    // InternalJsonParser.g:136:3: ( (lv_select_0_0= ruleSelect ) )
                    // InternalJsonParser.g:137:4: (lv_select_0_0= ruleSelect )
                    {
                    // InternalJsonParser.g:137:4: (lv_select_0_0= ruleSelect )
                    // InternalJsonParser.g:138:5: lv_select_0_0= ruleSelect
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getSelectSelectParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_select_0_0=ruleSelect();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"select",
                    						lv_select_0_0,
                    						"org.xtext.example.idmproject.JsonParser.Select");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJsonParser.g:156:3: ( (lv_store_1_0= ruleStore ) )
                    {
                    // InternalJsonParser.g:156:3: ( (lv_store_1_0= ruleStore ) )
                    // InternalJsonParser.g:157:4: (lv_store_1_0= ruleStore )
                    {
                    // InternalJsonParser.g:157:4: (lv_store_1_0= ruleStore )
                    // InternalJsonParser.g:158:5: lv_store_1_0= ruleStore
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getStoreStoreParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_store_1_0=ruleStore();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"store",
                    						lv_store_1_0,
                    						"org.xtext.example.idmproject.JsonParser.Store");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJsonParser.g:176:3: ( (lv_save_2_0= ruleSave ) )
                    {
                    // InternalJsonParser.g:176:3: ( (lv_save_2_0= ruleSave ) )
                    // InternalJsonParser.g:177:4: (lv_save_2_0= ruleSave )
                    {
                    // InternalJsonParser.g:177:4: (lv_save_2_0= ruleSave )
                    // InternalJsonParser.g:178:5: lv_save_2_0= ruleSave
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getSaveSaveParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_save_2_0=ruleSave();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"save",
                    						lv_save_2_0,
                    						"org.xtext.example.idmproject.JsonParser.Save");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJsonParser.g:196:3: ( (lv_print_3_0= rulePrint ) )
                    {
                    // InternalJsonParser.g:196:3: ( (lv_print_3_0= rulePrint ) )
                    // InternalJsonParser.g:197:4: (lv_print_3_0= rulePrint )
                    {
                    // InternalJsonParser.g:197:4: (lv_print_3_0= rulePrint )
                    // InternalJsonParser.g:198:5: lv_print_3_0= rulePrint
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getPrintPrintParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_print_3_0=rulePrint();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"print",
                    						lv_print_3_0,
                    						"org.xtext.example.idmproject.JsonParser.Print");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalJsonParser.g:216:3: ( (lv_insert_4_0= ruleInsert ) )
                    {
                    // InternalJsonParser.g:216:3: ( (lv_insert_4_0= ruleInsert ) )
                    // InternalJsonParser.g:217:4: (lv_insert_4_0= ruleInsert )
                    {
                    // InternalJsonParser.g:217:4: (lv_insert_4_0= ruleInsert )
                    // InternalJsonParser.g:218:5: lv_insert_4_0= ruleInsert
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getInsertInsertParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_insert_4_0=ruleInsert();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"insert",
                    						lv_insert_4_0,
                    						"org.xtext.example.idmproject.JsonParser.Insert");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalJsonParser.g:236:3: ( (lv_modify_5_0= ruleModify ) )
                    {
                    // InternalJsonParser.g:236:3: ( (lv_modify_5_0= ruleModify ) )
                    // InternalJsonParser.g:237:4: (lv_modify_5_0= ruleModify )
                    {
                    // InternalJsonParser.g:237:4: (lv_modify_5_0= ruleModify )
                    // InternalJsonParser.g:238:5: lv_modify_5_0= ruleModify
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getModifyModifyParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_modify_5_0=ruleModify();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"modify",
                    						lv_modify_5_0,
                    						"org.xtext.example.idmproject.JsonParser.Modify");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalJsonParser.g:256:3: ( (lv_compute_6_0= ruleCompute ) )
                    {
                    // InternalJsonParser.g:256:3: ( (lv_compute_6_0= ruleCompute ) )
                    // InternalJsonParser.g:257:4: (lv_compute_6_0= ruleCompute )
                    {
                    // InternalJsonParser.g:257:4: (lv_compute_6_0= ruleCompute )
                    // InternalJsonParser.g:258:5: lv_compute_6_0= ruleCompute
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getComputeComputeParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_compute_6_0=ruleCompute();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"compute",
                    						lv_compute_6_0,
                    						"org.xtext.example.idmproject.JsonParser.Compute");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleLoad"
    // InternalJsonParser.g:279:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalJsonParser.g:279:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalJsonParser.g:280:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoad"


    // $ANTLR start "ruleLoad"
    // InternalJsonParser.g:286:1: ruleLoad returns [EObject current=null] : (otherlv_0= '.load(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_file_1_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:292:2: ( (otherlv_0= '.load(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL ) )
            // InternalJsonParser.g:293:2: (otherlv_0= '.load(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL )
            {
            // InternalJsonParser.g:293:2: (otherlv_0= '.load(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL )
            // InternalJsonParser.g:294:3: otherlv_0= '.load(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0());
            		
            // InternalJsonParser.g:298:3: ( (lv_file_1_0= ruleFile ) )
            // InternalJsonParser.g:299:4: (lv_file_1_0= ruleFile )
            {
            // InternalJsonParser.g:299:4: (lv_file_1_0= ruleFile )
            // InternalJsonParser.g:300:5: lv_file_1_0= ruleFile
            {

            					newCompositeNode(grammarAccess.getLoadAccess().getFileFileParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_file_1_0=ruleFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_1_0,
            						"org.xtext.example.idmproject.JsonParser.File");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadAccess().getRightParenthesisKeyword_2());
            		

            			newCompositeNode(grammarAccess.getLoadAccess().getEOLParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRuleSelect"
    // InternalJsonParser.g:332:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalJsonParser.g:332:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalJsonParser.g:333:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalJsonParser.g:339:1: ruleSelect returns [EObject current=null] : (otherlv_0= '.select(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ruleEOL ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:345:2: ( (otherlv_0= '.select(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ruleEOL ) )
            // InternalJsonParser.g:346:2: (otherlv_0= '.select(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ruleEOL )
            {
            // InternalJsonParser.g:346:2: (otherlv_0= '.select(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ruleEOL )
            // InternalJsonParser.g:347:3: otherlv_0= '.select(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
            		
            // InternalJsonParser.g:351:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalJsonParser.g:352:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalJsonParser.g:352:4: (lv_expression_1_0= ruleExpression )
            // InternalJsonParser.g:353:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSelectAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.idmproject.JsonParser.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getRightParenthesisKeyword_2());
            		

            			newCompositeNode(grammarAccess.getSelectAccess().getEOLParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleStore"
    // InternalJsonParser.g:385:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalJsonParser.g:385:46: (iv_ruleStore= ruleStore EOF )
            // InternalJsonParser.g:386:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalJsonParser.g:392:1: ruleStore returns [EObject current=null] : (otherlv_0= '.store(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_file_1_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:398:2: ( (otherlv_0= '.store(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL ) )
            // InternalJsonParser.g:399:2: (otherlv_0= '.store(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL )
            {
            // InternalJsonParser.g:399:2: (otherlv_0= '.store(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL )
            // InternalJsonParser.g:400:3: otherlv_0= '.store(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            // InternalJsonParser.g:404:3: ( (lv_file_1_0= ruleFile ) )
            // InternalJsonParser.g:405:4: (lv_file_1_0= ruleFile )
            {
            // InternalJsonParser.g:405:4: (lv_file_1_0= ruleFile )
            // InternalJsonParser.g:406:5: lv_file_1_0= ruleFile
            {

            					newCompositeNode(grammarAccess.getStoreAccess().getFileFileParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_file_1_0=ruleFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoreRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_1_0,
            						"org.xtext.example.idmproject.JsonParser.File");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getRightParenthesisKeyword_2());
            		

            			newCompositeNode(grammarAccess.getStoreAccess().getEOLParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleFile"
    // InternalJsonParser.g:438:1: entryRuleFile returns [String current=null] : iv_ruleFile= ruleFile EOF ;
    public final String entryRuleFile() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFile = null;


        try {
            // InternalJsonParser.g:438:44: (iv_ruleFile= ruleFile EOF )
            // InternalJsonParser.g:439:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalJsonParser.g:445:1: ruleFile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleFile() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalJsonParser.g:451:2: (this_STRING_0= RULE_STRING )
            // InternalJsonParser.g:452:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getFileAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleSave"
    // InternalJsonParser.g:462:1: entryRuleSave returns [String current=null] : iv_ruleSave= ruleSave EOF ;
    public final String entryRuleSave() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSave = null;


        try {
            // InternalJsonParser.g:462:44: (iv_ruleSave= ruleSave EOF )
            // InternalJsonParser.g:463:2: iv_ruleSave= ruleSave EOF
            {
             newCompositeNode(grammarAccess.getSaveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSave=ruleSave();

            state._fsp--;

             current =iv_ruleSave.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSave"


    // $ANTLR start "ruleSave"
    // InternalJsonParser.g:469:1: ruleSave returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.save()' this_EOL_1= ruleEOL ) ;
    public final AntlrDatatypeRuleToken ruleSave() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EOL_1 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:475:2: ( (kw= '.save()' this_EOL_1= ruleEOL ) )
            // InternalJsonParser.g:476:2: (kw= '.save()' this_EOL_1= ruleEOL )
            {
            // InternalJsonParser.g:476:2: (kw= '.save()' this_EOL_1= ruleEOL )
            // InternalJsonParser.g:477:3: kw= '.save()' this_EOL_1= ruleEOL
            {
            kw=(Token)match(input,15,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSaveAccess().getSaveKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSaveAccess().getEOLParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_EOL_1=ruleEOL();

            state._fsp--;


            			current.merge(this_EOL_1);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSave"


    // $ANTLR start "entryRulePrint"
    // InternalJsonParser.g:496:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalJsonParser.g:496:46: (iv_rulePrint= rulePrint EOF )
            // InternalJsonParser.g:497:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalJsonParser.g:503:1: rulePrint returns [EObject current=null] : (otherlv_0= '.print(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ruleEOL ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:509:2: ( (otherlv_0= '.print(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ruleEOL ) )
            // InternalJsonParser.g:510:2: (otherlv_0= '.print(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ruleEOL )
            {
            // InternalJsonParser.g:510:2: (otherlv_0= '.print(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ruleEOL )
            // InternalJsonParser.g:511:3: otherlv_0= '.print(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            // InternalJsonParser.g:515:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalJsonParser.g:516:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalJsonParser.g:516:4: (lv_expression_1_0= ruleExpression )
            // InternalJsonParser.g:517:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPrintAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.idmproject.JsonParser.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPrintAccess().getRightParenthesisKeyword_2());
            		

            			newCompositeNode(grammarAccess.getPrintAccess().getEOLParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleInsert"
    // InternalJsonParser.g:549:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalJsonParser.g:549:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalJsonParser.g:550:2: iv_ruleInsert= ruleInsert EOF
            {
             newCompositeNode(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsert=ruleInsert();

            state._fsp--;

             current =iv_ruleInsert; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalJsonParser.g:556:1: ruleInsert returns [EObject current=null] : (otherlv_0= '.insert(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ruleEOL ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:562:2: ( (otherlv_0= '.insert(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ruleEOL ) )
            // InternalJsonParser.g:563:2: (otherlv_0= '.insert(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ruleEOL )
            {
            // InternalJsonParser.g:563:2: (otherlv_0= '.insert(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ruleEOL )
            // InternalJsonParser.g:564:3: otherlv_0= '.insert(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
            		
            // InternalJsonParser.g:568:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalJsonParser.g:569:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalJsonParser.g:569:4: (lv_expression_1_0= ruleExpression )
            // InternalJsonParser.g:570:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.idmproject.JsonParser.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getRightParenthesisKeyword_2());
            		

            			newCompositeNode(grammarAccess.getInsertAccess().getEOLParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleModify"
    // InternalJsonParser.g:602:1: entryRuleModify returns [EObject current=null] : iv_ruleModify= ruleModify EOF ;
    public final EObject entryRuleModify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModify = null;


        try {
            // InternalJsonParser.g:602:47: (iv_ruleModify= ruleModify EOF )
            // InternalJsonParser.g:603:2: iv_ruleModify= ruleModify EOF
            {
             newCompositeNode(grammarAccess.getModifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModify=ruleModify();

            state._fsp--;

             current =iv_ruleModify; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModify"


    // $ANTLR start "ruleModify"
    // InternalJsonParser.g:609:1: ruleModify returns [EObject current=null] : (otherlv_0= '.modify(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_newExpression_3_0= ruleExpression ) ) otherlv_4= ')' ruleEOL ) ;
    public final EObject ruleModify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_newExpression_3_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:615:2: ( (otherlv_0= '.modify(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_newExpression_3_0= ruleExpression ) ) otherlv_4= ')' ruleEOL ) )
            // InternalJsonParser.g:616:2: (otherlv_0= '.modify(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_newExpression_3_0= ruleExpression ) ) otherlv_4= ')' ruleEOL )
            {
            // InternalJsonParser.g:616:2: (otherlv_0= '.modify(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_newExpression_3_0= ruleExpression ) ) otherlv_4= ')' ruleEOL )
            // InternalJsonParser.g:617:3: otherlv_0= '.modify(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_newExpression_3_0= ruleExpression ) ) otherlv_4= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModifyAccess().getModifyKeyword_0());
            		
            // InternalJsonParser.g:621:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalJsonParser.g:622:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalJsonParser.g:622:4: (lv_expression_1_0= ruleExpression )
            // InternalJsonParser.g:623:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getModifyAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifyRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.idmproject.JsonParser.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getModifyAccess().getCommaKeyword_2());
            		
            // InternalJsonParser.g:644:3: ( (lv_newExpression_3_0= ruleExpression ) )
            // InternalJsonParser.g:645:4: (lv_newExpression_3_0= ruleExpression )
            {
            // InternalJsonParser.g:645:4: (lv_newExpression_3_0= ruleExpression )
            // InternalJsonParser.g:646:5: lv_newExpression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getModifyAccess().getNewExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_newExpression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifyRule());
            					}
            					set(
            						current,
            						"newExpression",
            						lv_newExpression_3_0,
            						"org.xtext.example.idmproject.JsonParser.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getModifyAccess().getRightParenthesisKeyword_4());
            		

            			newCompositeNode(grammarAccess.getModifyAccess().getEOLParserRuleCall_5());
            		
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModify"


    // $ANTLR start "entryRuleCompute"
    // InternalJsonParser.g:678:1: entryRuleCompute returns [EObject current=null] : iv_ruleCompute= ruleCompute EOF ;
    public final EObject entryRuleCompute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompute = null;


        try {
            // InternalJsonParser.g:678:48: (iv_ruleCompute= ruleCompute EOF )
            // InternalJsonParser.g:679:2: iv_ruleCompute= ruleCompute EOF
            {
             newCompositeNode(grammarAccess.getComputeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompute=ruleCompute();

            state._fsp--;

             current =iv_ruleCompute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompute"


    // $ANTLR start "ruleCompute"
    // InternalJsonParser.g:685:1: ruleCompute returns [EObject current=null] : (this_Sum_0= ruleSum | this_Product_1= ruleProduct ) ;
    public final EObject ruleCompute() throws RecognitionException {
        EObject current = null;

        EObject this_Sum_0 = null;

        EObject this_Product_1 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:691:2: ( (this_Sum_0= ruleSum | this_Product_1= ruleProduct ) )
            // InternalJsonParser.g:692:2: (this_Sum_0= ruleSum | this_Product_1= ruleProduct )
            {
            // InternalJsonParser.g:692:2: (this_Sum_0= ruleSum | this_Product_1= ruleProduct )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalJsonParser.g:693:3: this_Sum_0= ruleSum
                    {

                    			newCompositeNode(grammarAccess.getComputeAccess().getSumParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sum_0=ruleSum();

                    state._fsp--;


                    			current = this_Sum_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonParser.g:702:3: this_Product_1= ruleProduct
                    {

                    			newCompositeNode(grammarAccess.getComputeAccess().getProductParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Product_1=ruleProduct();

                    state._fsp--;


                    			current = this_Product_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompute"


    // $ANTLR start "entryRuleSum"
    // InternalJsonParser.g:714:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalJsonParser.g:714:44: (iv_ruleSum= ruleSum EOF )
            // InternalJsonParser.g:715:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalJsonParser.g:721:1: ruleSum returns [EObject current=null] : ( ( (lv_expression1_0_0= ruleExpression ) ) otherlv_1= '+' ( (lv_expression2_2_0= ruleExpression ) ) ruleEOL ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression1_0_0 = null;

        EObject lv_expression2_2_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:727:2: ( ( ( (lv_expression1_0_0= ruleExpression ) ) otherlv_1= '+' ( (lv_expression2_2_0= ruleExpression ) ) ruleEOL ) )
            // InternalJsonParser.g:728:2: ( ( (lv_expression1_0_0= ruleExpression ) ) otherlv_1= '+' ( (lv_expression2_2_0= ruleExpression ) ) ruleEOL )
            {
            // InternalJsonParser.g:728:2: ( ( (lv_expression1_0_0= ruleExpression ) ) otherlv_1= '+' ( (lv_expression2_2_0= ruleExpression ) ) ruleEOL )
            // InternalJsonParser.g:729:3: ( (lv_expression1_0_0= ruleExpression ) ) otherlv_1= '+' ( (lv_expression2_2_0= ruleExpression ) ) ruleEOL
            {
            // InternalJsonParser.g:729:3: ( (lv_expression1_0_0= ruleExpression ) )
            // InternalJsonParser.g:730:4: (lv_expression1_0_0= ruleExpression )
            {
            // InternalJsonParser.g:730:4: (lv_expression1_0_0= ruleExpression )
            // InternalJsonParser.g:731:5: lv_expression1_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSumAccess().getExpression1ExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_expression1_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					set(
            						current,
            						"expression1",
            						lv_expression1_0_0,
            						"org.xtext.example.idmproject.JsonParser.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSumAccess().getPlusSignKeyword_1());
            		
            // InternalJsonParser.g:752:3: ( (lv_expression2_2_0= ruleExpression ) )
            // InternalJsonParser.g:753:4: (lv_expression2_2_0= ruleExpression )
            {
            // InternalJsonParser.g:753:4: (lv_expression2_2_0= ruleExpression )
            // InternalJsonParser.g:754:5: lv_expression2_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSumAccess().getExpression2ExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_expression2_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					set(
            						current,
            						"expression2",
            						lv_expression2_2_0,
            						"org.xtext.example.idmproject.JsonParser.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getSumAccess().getEOLParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleProduct"
    // InternalJsonParser.g:782:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // InternalJsonParser.g:782:48: (iv_ruleProduct= ruleProduct EOF )
            // InternalJsonParser.g:783:2: iv_ruleProduct= ruleProduct EOF
            {
             newCompositeNode(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProduct=ruleProduct();

            state._fsp--;

             current =iv_ruleProduct; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // InternalJsonParser.g:789:1: ruleProduct returns [EObject current=null] : ( ( (lv_expression1_0_0= ruleExpression ) ) otherlv_1= '*' ( (lv_expression2_2_0= ruleExpression ) ) ruleEOL ) ;
    public final EObject ruleProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression1_0_0 = null;

        EObject lv_expression2_2_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:795:2: ( ( ( (lv_expression1_0_0= ruleExpression ) ) otherlv_1= '*' ( (lv_expression2_2_0= ruleExpression ) ) ruleEOL ) )
            // InternalJsonParser.g:796:2: ( ( (lv_expression1_0_0= ruleExpression ) ) otherlv_1= '*' ( (lv_expression2_2_0= ruleExpression ) ) ruleEOL )
            {
            // InternalJsonParser.g:796:2: ( ( (lv_expression1_0_0= ruleExpression ) ) otherlv_1= '*' ( (lv_expression2_2_0= ruleExpression ) ) ruleEOL )
            // InternalJsonParser.g:797:3: ( (lv_expression1_0_0= ruleExpression ) ) otherlv_1= '*' ( (lv_expression2_2_0= ruleExpression ) ) ruleEOL
            {
            // InternalJsonParser.g:797:3: ( (lv_expression1_0_0= ruleExpression ) )
            // InternalJsonParser.g:798:4: (lv_expression1_0_0= ruleExpression )
            {
            // InternalJsonParser.g:798:4: (lv_expression1_0_0= ruleExpression )
            // InternalJsonParser.g:799:5: lv_expression1_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getProductAccess().getExpression1ExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_expression1_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductRule());
            					}
            					set(
            						current,
            						"expression1",
            						lv_expression1_0_0,
            						"org.xtext.example.idmproject.JsonParser.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProductAccess().getAsteriskKeyword_1());
            		
            // InternalJsonParser.g:820:3: ( (lv_expression2_2_0= ruleExpression ) )
            // InternalJsonParser.g:821:4: (lv_expression2_2_0= ruleExpression )
            {
            // InternalJsonParser.g:821:4: (lv_expression2_2_0= ruleExpression )
            // InternalJsonParser.g:822:5: lv_expression2_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getProductAccess().getExpression2ExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_expression2_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductRule());
            					}
            					set(
            						current,
            						"expression2",
            						lv_expression2_2_0,
            						"org.xtext.example.idmproject.JsonParser.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getProductAccess().getEOLParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRuleExpression"
    // InternalJsonParser.g:850:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalJsonParser.g:850:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalJsonParser.g:851:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalJsonParser.g:857:1: ruleExpression returns [EObject current=null] : ( ( (lv_key_0_0= ruleKey ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ruleEOL ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:863:2: ( ( ( (lv_key_0_0= ruleKey ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ruleEOL ) )
            // InternalJsonParser.g:864:2: ( ( (lv_key_0_0= ruleKey ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ruleEOL )
            {
            // InternalJsonParser.g:864:2: ( ( (lv_key_0_0= ruleKey ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ruleEOL )
            // InternalJsonParser.g:865:3: ( (lv_key_0_0= ruleKey ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ruleEOL
            {
            // InternalJsonParser.g:865:3: ( (lv_key_0_0= ruleKey ) )
            // InternalJsonParser.g:866:4: (lv_key_0_0= ruleKey )
            {
            // InternalJsonParser.g:866:4: (lv_key_0_0= ruleKey )
            // InternalJsonParser.g:867:5: lv_key_0_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getKeyKeyParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_key_0_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.xtext.example.idmproject.JsonParser.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getColonKeyword_1());
            		
            // InternalJsonParser.g:888:3: ( (lv_value_2_0= ruleValue ) )
            // InternalJsonParser.g:889:4: (lv_value_2_0= ruleValue )
            {
            // InternalJsonParser.g:889:4: (lv_value_2_0= ruleValue )
            // InternalJsonParser.g:890:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.idmproject.JsonParser.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getExpressionAccess().getEOLParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleKey"
    // InternalJsonParser.g:918:1: entryRuleKey returns [String current=null] : iv_ruleKey= ruleKey EOF ;
    public final String entryRuleKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKey = null;


        try {
            // InternalJsonParser.g:918:43: (iv_ruleKey= ruleKey EOF )
            // InternalJsonParser.g:919:2: iv_ruleKey= ruleKey EOF
            {
             newCompositeNode(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKey=ruleKey();

            state._fsp--;

             current =iv_ruleKey.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalJsonParser.g:925:1: ruleKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalJsonParser.g:931:2: (this_STRING_0= RULE_STRING )
            // InternalJsonParser.g:932:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getKeyAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleValue"
    // InternalJsonParser.g:942:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalJsonParser.g:942:46: (iv_ruleValue= ruleValue EOF )
            // InternalJsonParser.g:943:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalJsonParser.g:949:1: ruleValue returns [EObject current=null] : ( ( () this_STRING_1= RULE_STRING ) | ( () this_INT_3= RULE_INT ) | ( (lv_array_4_0= ruleArray ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;
        Token this_INT_3=null;
        AntlrDatatypeRuleToken lv_array_4_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:955:2: ( ( ( () this_STRING_1= RULE_STRING ) | ( () this_INT_3= RULE_INT ) | ( (lv_array_4_0= ruleArray ) ) ) )
            // InternalJsonParser.g:956:2: ( ( () this_STRING_1= RULE_STRING ) | ( () this_INT_3= RULE_INT ) | ( (lv_array_4_0= ruleArray ) ) )
            {
            // InternalJsonParser.g:956:2: ( ( () this_STRING_1= RULE_STRING ) | ( () this_INT_3= RULE_INT ) | ( (lv_array_4_0= ruleArray ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==25) ) {
                    alt4=1;
                }
                else if ( (LA4_1==RULE_STRING||LA4_1==24) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt4=2;
                }
                break;
            case 23:
            case 24:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalJsonParser.g:957:3: ( () this_STRING_1= RULE_STRING )
                    {
                    // InternalJsonParser.g:957:3: ( () this_STRING_1= RULE_STRING )
                    // InternalJsonParser.g:958:4: () this_STRING_1= RULE_STRING
                    {
                    // InternalJsonParser.g:958:4: ()
                    // InternalJsonParser.g:959:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValueAccess().getValueAction_0_0(),
                    						current);
                    				

                    }

                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonParser.g:971:3: ( () this_INT_3= RULE_INT )
                    {
                    // InternalJsonParser.g:971:3: ( () this_INT_3= RULE_INT )
                    // InternalJsonParser.g:972:4: () this_INT_3= RULE_INT
                    {
                    // InternalJsonParser.g:972:4: ()
                    // InternalJsonParser.g:973:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValueAccess().getValueAction_1_0(),
                    						current);
                    				

                    }

                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_3, grammarAccess.getValueAccess().getINTTerminalRuleCall_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonParser.g:985:3: ( (lv_array_4_0= ruleArray ) )
                    {
                    // InternalJsonParser.g:985:3: ( (lv_array_4_0= ruleArray ) )
                    // InternalJsonParser.g:986:4: (lv_array_4_0= ruleArray )
                    {
                    // InternalJsonParser.g:986:4: (lv_array_4_0= ruleArray )
                    // InternalJsonParser.g:987:5: lv_array_4_0= ruleArray
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getArrayArrayParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_4_0=ruleArray();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_4_0,
                    						"org.xtext.example.idmproject.JsonParser.Array");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleArray"
    // InternalJsonParser.g:1008:1: entryRuleArray returns [String current=null] : iv_ruleArray= ruleArray EOF ;
    public final String entryRuleArray() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArray = null;


        try {
            // InternalJsonParser.g:1008:45: (iv_ruleArray= ruleArray EOF )
            // InternalJsonParser.g:1009:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalJsonParser.g:1015:1: ruleArray returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '[' (this_INT_1= RULE_INT )* ) | ( (this_STRING_2= RULE_STRING )* kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken ruleArray() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalJsonParser.g:1021:2: ( ( (kw= '[' (this_INT_1= RULE_INT )* ) | ( (this_STRING_2= RULE_STRING )* kw= ']' ) ) )
            // InternalJsonParser.g:1022:2: ( (kw= '[' (this_INT_1= RULE_INT )* ) | ( (this_STRING_2= RULE_STRING )* kw= ']' ) )
            {
            // InternalJsonParser.g:1022:2: ( (kw= '[' (this_INT_1= RULE_INT )* ) | ( (this_STRING_2= RULE_STRING )* kw= ']' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING||LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalJsonParser.g:1023:3: (kw= '[' (this_INT_1= RULE_INT )* )
                    {
                    // InternalJsonParser.g:1023:3: (kw= '[' (this_INT_1= RULE_INT )* )
                    // InternalJsonParser.g:1024:4: kw= '[' (this_INT_1= RULE_INT )*
                    {
                    kw=(Token)match(input,23,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalJsonParser.g:1029:4: (this_INT_1= RULE_INT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_INT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalJsonParser.g:1030:5: this_INT_1= RULE_INT
                    	    {
                    	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_12); 

                    	    					current.merge(this_INT_1);
                    	    				

                    	    					newLeafNode(this_INT_1, grammarAccess.getArrayAccess().getINTTerminalRuleCall_0_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalJsonParser.g:1040:3: ( (this_STRING_2= RULE_STRING )* kw= ']' )
                    {
                    // InternalJsonParser.g:1040:3: ( (this_STRING_2= RULE_STRING )* kw= ']' )
                    // InternalJsonParser.g:1041:4: (this_STRING_2= RULE_STRING )* kw= ']'
                    {
                    // InternalJsonParser.g:1041:4: (this_STRING_2= RULE_STRING )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_STRING) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalJsonParser.g:1042:5: this_STRING_2= RULE_STRING
                    	    {
                    	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    	    					current.merge(this_STRING_2);
                    	    				

                    	    					newLeafNode(this_STRING_2, grammarAccess.getArrayAccess().getSTRINGTerminalRuleCall_1_0());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    kw=(Token)match(input,24,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleEOL"
    // InternalJsonParser.g:1060:1: entryRuleEOL returns [String current=null] : iv_ruleEOL= ruleEOL EOF ;
    public final String entryRuleEOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEOL = null;


        try {
            // InternalJsonParser.g:1060:43: (iv_ruleEOL= ruleEOL EOF )
            // InternalJsonParser.g:1061:2: iv_ruleEOL= ruleEOL EOF
            {
             newCompositeNode(grammarAccess.getEOLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOL=ruleEOL();

            state._fsp--;

             current =iv_ruleEOL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOL"


    // $ANTLR start "ruleEOL"
    // InternalJsonParser.g:1067:1: ruleEOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\n' ;
    public final AntlrDatatypeRuleToken ruleEOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJsonParser.g:1073:2: (kw= '\\n' )
            // InternalJsonParser.g:1074:2: kw= '\\n'
            {
            kw=(Token)match(input,25,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEOLAccess().getLineFeedKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOL"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\1\26\2\4\1\31\1\5\1\31\1\4\1\24\1\5\2\uffff";
    static final String dfa_3s = "\1\4\1\26\1\30\4\31\1\30\1\25\1\31\2\uffff";
    static final String dfa_4s = "\12\uffff\1\1\1\2";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\21\uffff\1\5\1\6",
            "\1\7\23\uffff\1\6\1\10",
            "\1\10",
            "\1\11\23\uffff\1\10",
            "\1\10",
            "\1\7\23\uffff\1\6",
            "\1\12\1\13",
            "\1\11\23\uffff\1\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "692:2: (this_Sum_0= ruleSum | this_Product_1= ruleProduct )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000007E012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001800030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000010L});

}