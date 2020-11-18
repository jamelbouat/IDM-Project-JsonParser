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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.load('", "')'", "'expr'", "'.select('", "'.store('", "'.save()'", "'.print('", "'.get('", "'.insert('", "','", "'.update('", "'+'", "'*'", "'['", "']'", "'\\n'"
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
    public static final int T__26=26;
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

                if ( (LA1_0==RULE_STRING||LA1_0==13||(LA1_0>=15 && LA1_0<=19)||LA1_0==21) ) {
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
    // InternalJsonParser.g:128:1: ruleInstruction returns [EObject current=null] : ( ( (lv_select_0_0= ruleSelect ) ) | ( (lv_store_1_0= ruleStore ) ) | ( (lv_save_2_0= ruleSave ) ) | ( (lv_print_3_0= rulePrint ) ) | ( (lv_insert_4_0= ruleInsert ) ) | ( (lv_update_5_0= ruleUpdate ) ) | ( (lv_compute_6_0= ruleCompute ) ) | ( (lv_get_7_0= ruleGetValue ) ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject lv_select_0_0 = null;

        EObject lv_store_1_0 = null;

        AntlrDatatypeRuleToken lv_save_2_0 = null;

        EObject lv_print_3_0 = null;

        EObject lv_insert_4_0 = null;

        EObject lv_update_5_0 = null;

        EObject lv_compute_6_0 = null;

        EObject lv_get_7_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:134:2: ( ( ( (lv_select_0_0= ruleSelect ) ) | ( (lv_store_1_0= ruleStore ) ) | ( (lv_save_2_0= ruleSave ) ) | ( (lv_print_3_0= rulePrint ) ) | ( (lv_insert_4_0= ruleInsert ) ) | ( (lv_update_5_0= ruleUpdate ) ) | ( (lv_compute_6_0= ruleCompute ) ) | ( (lv_get_7_0= ruleGetValue ) ) ) )
            // InternalJsonParser.g:135:2: ( ( (lv_select_0_0= ruleSelect ) ) | ( (lv_store_1_0= ruleStore ) ) | ( (lv_save_2_0= ruleSave ) ) | ( (lv_print_3_0= rulePrint ) ) | ( (lv_insert_4_0= ruleInsert ) ) | ( (lv_update_5_0= ruleUpdate ) ) | ( (lv_compute_6_0= ruleCompute ) ) | ( (lv_get_7_0= ruleGetValue ) ) )
            {
            // InternalJsonParser.g:135:2: ( ( (lv_select_0_0= ruleSelect ) ) | ( (lv_store_1_0= ruleStore ) ) | ( (lv_save_2_0= ruleSave ) ) | ( (lv_print_3_0= rulePrint ) ) | ( (lv_insert_4_0= ruleInsert ) ) | ( (lv_update_5_0= ruleUpdate ) ) | ( (lv_compute_6_0= ruleCompute ) ) | ( (lv_get_7_0= ruleGetValue ) ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 19:
                {
                alt2=5;
                }
                break;
            case 21:
                {
                alt2=6;
                }
                break;
            case RULE_STRING:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
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
                    // InternalJsonParser.g:236:3: ( (lv_update_5_0= ruleUpdate ) )
                    {
                    // InternalJsonParser.g:236:3: ( (lv_update_5_0= ruleUpdate ) )
                    // InternalJsonParser.g:237:4: (lv_update_5_0= ruleUpdate )
                    {
                    // InternalJsonParser.g:237:4: (lv_update_5_0= ruleUpdate )
                    // InternalJsonParser.g:238:5: lv_update_5_0= ruleUpdate
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getUpdateUpdateParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_update_5_0=ruleUpdate();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"update",
                    						lv_update_5_0,
                    						"org.xtext.example.idmproject.JsonParser.Update");
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
                case 8 :
                    // InternalJsonParser.g:276:3: ( (lv_get_7_0= ruleGetValue ) )
                    {
                    // InternalJsonParser.g:276:3: ( (lv_get_7_0= ruleGetValue ) )
                    // InternalJsonParser.g:277:4: (lv_get_7_0= ruleGetValue )
                    {
                    // InternalJsonParser.g:277:4: (lv_get_7_0= ruleGetValue )
                    // InternalJsonParser.g:278:5: lv_get_7_0= ruleGetValue
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getGetGetValueParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_get_7_0=ruleGetValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"get",
                    						lv_get_7_0,
                    						"org.xtext.example.idmproject.JsonParser.GetValue");
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
    // InternalJsonParser.g:299:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalJsonParser.g:299:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalJsonParser.g:300:2: iv_ruleLoad= ruleLoad EOF
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
    // InternalJsonParser.g:306:1: ruleLoad returns [EObject current=null] : (otherlv_0= '.load(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_file_1_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:312:2: ( (otherlv_0= '.load(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL ) )
            // InternalJsonParser.g:313:2: (otherlv_0= '.load(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL )
            {
            // InternalJsonParser.g:313:2: (otherlv_0= '.load(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL )
            // InternalJsonParser.g:314:3: otherlv_0= '.load(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0());
            		
            // InternalJsonParser.g:318:3: ( (lv_file_1_0= ruleFile ) )
            // InternalJsonParser.g:319:4: (lv_file_1_0= ruleFile )
            {
            // InternalJsonParser.g:319:4: (lv_file_1_0= ruleFile )
            // InternalJsonParser.g:320:5: lv_file_1_0= ruleFile
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
    // InternalJsonParser.g:352:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalJsonParser.g:352:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalJsonParser.g:353:2: iv_ruleSelect= ruleSelect EOF
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
    // InternalJsonParser.g:359:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'expr' ( (lv_ID_1_0= '.select(' ) ) ( (lv_key_2_0= ruleKey ) ) otherlv_3= ')' ruleEOL ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ID_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_key_2_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:365:2: ( (otherlv_0= 'expr' ( (lv_ID_1_0= '.select(' ) ) ( (lv_key_2_0= ruleKey ) ) otherlv_3= ')' ruleEOL ) )
            // InternalJsonParser.g:366:2: (otherlv_0= 'expr' ( (lv_ID_1_0= '.select(' ) ) ( (lv_key_2_0= ruleKey ) ) otherlv_3= ')' ruleEOL )
            {
            // InternalJsonParser.g:366:2: (otherlv_0= 'expr' ( (lv_ID_1_0= '.select(' ) ) ( (lv_key_2_0= ruleKey ) ) otherlv_3= ')' ruleEOL )
            // InternalJsonParser.g:367:3: otherlv_0= 'expr' ( (lv_ID_1_0= '.select(' ) ) ( (lv_key_2_0= ruleKey ) ) otherlv_3= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getExprKeyword_0());
            		
            // InternalJsonParser.g:371:3: ( (lv_ID_1_0= '.select(' ) )
            // InternalJsonParser.g:372:4: (lv_ID_1_0= '.select(' )
            {
            // InternalJsonParser.g:372:4: (lv_ID_1_0= '.select(' )
            // InternalJsonParser.g:373:5: lv_ID_1_0= '.select('
            {
            lv_ID_1_0=(Token)match(input,14,FOLLOW_4); 

            					newLeafNode(lv_ID_1_0, grammarAccess.getSelectAccess().getIDSelectKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectRule());
            					}
            					setWithLastConsumed(current, "ID", lv_ID_1_0, ".select(");
            				

            }


            }

            // InternalJsonParser.g:385:3: ( (lv_key_2_0= ruleKey ) )
            // InternalJsonParser.g:386:4: (lv_key_2_0= ruleKey )
            {
            // InternalJsonParser.g:386:4: (lv_key_2_0= ruleKey )
            // InternalJsonParser.g:387:5: lv_key_2_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getSelectAccess().getKeyKeyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_key_2_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_2_0,
            						"org.xtext.example.idmproject.JsonParser.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectAccess().getRightParenthesisKeyword_3());
            		

            			newCompositeNode(grammarAccess.getSelectAccess().getEOLParserRuleCall_4());
            		
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
    // InternalJsonParser.g:419:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalJsonParser.g:419:46: (iv_ruleStore= ruleStore EOF )
            // InternalJsonParser.g:420:2: iv_ruleStore= ruleStore EOF
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
    // InternalJsonParser.g:426:1: ruleStore returns [EObject current=null] : (otherlv_0= '.store(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_file_1_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:432:2: ( (otherlv_0= '.store(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL ) )
            // InternalJsonParser.g:433:2: (otherlv_0= '.store(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL )
            {
            // InternalJsonParser.g:433:2: (otherlv_0= '.store(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL )
            // InternalJsonParser.g:434:3: otherlv_0= '.store(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            // InternalJsonParser.g:438:3: ( (lv_file_1_0= ruleFile ) )
            // InternalJsonParser.g:439:4: (lv_file_1_0= ruleFile )
            {
            // InternalJsonParser.g:439:4: (lv_file_1_0= ruleFile )
            // InternalJsonParser.g:440:5: lv_file_1_0= ruleFile
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
    // InternalJsonParser.g:472:1: entryRuleFile returns [String current=null] : iv_ruleFile= ruleFile EOF ;
    public final String entryRuleFile() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFile = null;


        try {
            // InternalJsonParser.g:472:44: (iv_ruleFile= ruleFile EOF )
            // InternalJsonParser.g:473:2: iv_ruleFile= ruleFile EOF
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
    // InternalJsonParser.g:479:1: ruleFile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleFile() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalJsonParser.g:485:2: (this_STRING_0= RULE_STRING )
            // InternalJsonParser.g:486:2: this_STRING_0= RULE_STRING
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
    // InternalJsonParser.g:496:1: entryRuleSave returns [String current=null] : iv_ruleSave= ruleSave EOF ;
    public final String entryRuleSave() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSave = null;


        try {
            // InternalJsonParser.g:496:44: (iv_ruleSave= ruleSave EOF )
            // InternalJsonParser.g:497:2: iv_ruleSave= ruleSave EOF
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
    // InternalJsonParser.g:503:1: ruleSave returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.save()' this_EOL_1= ruleEOL ) ;
    public final AntlrDatatypeRuleToken ruleSave() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EOL_1 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:509:2: ( (kw= '.save()' this_EOL_1= ruleEOL ) )
            // InternalJsonParser.g:510:2: (kw= '.save()' this_EOL_1= ruleEOL )
            {
            // InternalJsonParser.g:510:2: (kw= '.save()' this_EOL_1= ruleEOL )
            // InternalJsonParser.g:511:3: kw= '.save()' this_EOL_1= ruleEOL
            {
            kw=(Token)match(input,16,FOLLOW_6); 

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
    // InternalJsonParser.g:530:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalJsonParser.g:530:46: (iv_rulePrint= rulePrint EOF )
            // InternalJsonParser.g:531:2: iv_rulePrint= rulePrint EOF
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
    // InternalJsonParser.g:537:1: rulePrint returns [EObject current=null] : (otherlv_0= '.print(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:543:2: ( (otherlv_0= '.print(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL ) )
            // InternalJsonParser.g:544:2: (otherlv_0= '.print(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL )
            {
            // InternalJsonParser.g:544:2: (otherlv_0= '.print(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL )
            // InternalJsonParser.g:545:3: otherlv_0= '.print(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            // InternalJsonParser.g:549:3: ( (lv_key_1_0= ruleKey ) )
            // InternalJsonParser.g:550:4: (lv_key_1_0= ruleKey )
            {
            // InternalJsonParser.g:550:4: (lv_key_1_0= ruleKey )
            // InternalJsonParser.g:551:5: lv_key_1_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getPrintAccess().getKeyKeyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_key_1_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.xtext.example.idmproject.JsonParser.Key");
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


    // $ANTLR start "entryRuleGetValue"
    // InternalJsonParser.g:583:1: entryRuleGetValue returns [EObject current=null] : iv_ruleGetValue= ruleGetValue EOF ;
    public final EObject entryRuleGetValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetValue = null;


        try {
            // InternalJsonParser.g:583:49: (iv_ruleGetValue= ruleGetValue EOF )
            // InternalJsonParser.g:584:2: iv_ruleGetValue= ruleGetValue EOF
            {
             newCompositeNode(grammarAccess.getGetValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetValue=ruleGetValue();

            state._fsp--;

             current =iv_ruleGetValue; 
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
    // $ANTLR end "entryRuleGetValue"


    // $ANTLR start "ruleGetValue"
    // InternalJsonParser.g:590:1: ruleGetValue returns [EObject current=null] : (otherlv_0= '.get(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL ) ;
    public final EObject ruleGetValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:596:2: ( (otherlv_0= '.get(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL ) )
            // InternalJsonParser.g:597:2: (otherlv_0= '.get(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL )
            {
            // InternalJsonParser.g:597:2: (otherlv_0= '.get(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL )
            // InternalJsonParser.g:598:3: otherlv_0= '.get(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGetValueAccess().getGetKeyword_0());
            		
            // InternalJsonParser.g:602:3: ( (lv_key_1_0= ruleKey ) )
            // InternalJsonParser.g:603:4: (lv_key_1_0= ruleKey )
            {
            // InternalJsonParser.g:603:4: (lv_key_1_0= ruleKey )
            // InternalJsonParser.g:604:5: lv_key_1_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getGetValueAccess().getKeyKeyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_key_1_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetValueRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.xtext.example.idmproject.JsonParser.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getGetValueAccess().getRightParenthesisKeyword_2());
            		

            			newCompositeNode(grammarAccess.getGetValueAccess().getEOLParserRuleCall_3());
            		
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
    // $ANTLR end "ruleGetValue"


    // $ANTLR start "entryRuleInsert"
    // InternalJsonParser.g:636:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalJsonParser.g:636:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalJsonParser.g:637:2: iv_ruleInsert= ruleInsert EOF
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
    // InternalJsonParser.g:643:1: ruleInsert returns [EObject current=null] : (otherlv_0= '.insert(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:649:2: ( (otherlv_0= '.insert(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL ) )
            // InternalJsonParser.g:650:2: (otherlv_0= '.insert(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL )
            {
            // InternalJsonParser.g:650:2: (otherlv_0= '.insert(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL )
            // InternalJsonParser.g:651:3: otherlv_0= '.insert(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
            		
            // InternalJsonParser.g:655:3: ( (lv_key_1_0= ruleKey ) )
            // InternalJsonParser.g:656:4: (lv_key_1_0= ruleKey )
            {
            // InternalJsonParser.g:656:4: (lv_key_1_0= ruleKey )
            // InternalJsonParser.g:657:5: lv_key_1_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getKeyKeyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_key_1_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.xtext.example.idmproject.JsonParser.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getCommaKeyword_2());
            		
            // InternalJsonParser.g:678:3: ( (lv_value_3_0= ruleValue ) )
            // InternalJsonParser.g:679:4: (lv_value_3_0= ruleValue )
            {
            // InternalJsonParser.g:679:4: (lv_value_3_0= ruleValue )
            // InternalJsonParser.g:680:5: lv_value_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getValueValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_value_3_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.idmproject.JsonParser.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getInsertAccess().getRightParenthesisKeyword_4());
            		

            			newCompositeNode(grammarAccess.getInsertAccess().getEOLParserRuleCall_5());
            		
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


    // $ANTLR start "entryRuleUpdate"
    // InternalJsonParser.g:712:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // InternalJsonParser.g:712:47: (iv_ruleUpdate= ruleUpdate EOF )
            // InternalJsonParser.g:713:2: iv_ruleUpdate= ruleUpdate EOF
            {
             newCompositeNode(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdate=ruleUpdate();

            state._fsp--;

             current =iv_ruleUpdate; 
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
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // InternalJsonParser.g:719:1: ruleUpdate returns [EObject current=null] : (otherlv_0= '.update(' ( (lv_key_1_0= ruleKey ) ) (otherlv_2= ',' )+ ( (lv_newValue_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        EObject lv_newValue_3_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:725:2: ( (otherlv_0= '.update(' ( (lv_key_1_0= ruleKey ) ) (otherlv_2= ',' )+ ( (lv_newValue_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL ) )
            // InternalJsonParser.g:726:2: (otherlv_0= '.update(' ( (lv_key_1_0= ruleKey ) ) (otherlv_2= ',' )+ ( (lv_newValue_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL )
            {
            // InternalJsonParser.g:726:2: (otherlv_0= '.update(' ( (lv_key_1_0= ruleKey ) ) (otherlv_2= ',' )+ ( (lv_newValue_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL )
            // InternalJsonParser.g:727:3: otherlv_0= '.update(' ( (lv_key_1_0= ruleKey ) ) (otherlv_2= ',' )+ ( (lv_newValue_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateAccess().getUpdateKeyword_0());
            		
            // InternalJsonParser.g:731:3: ( (lv_key_1_0= ruleKey ) )
            // InternalJsonParser.g:732:4: (lv_key_1_0= ruleKey )
            {
            // InternalJsonParser.g:732:4: (lv_key_1_0= ruleKey )
            // InternalJsonParser.g:733:5: lv_key_1_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getKeyKeyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_key_1_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.xtext.example.idmproject.JsonParser.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonParser.g:750:3: (otherlv_2= ',' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJsonParser.g:751:4: otherlv_2= ','
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getUpdateAccess().getCommaKeyword_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalJsonParser.g:756:3: ( (lv_newValue_3_0= ruleValue ) )
            // InternalJsonParser.g:757:4: (lv_newValue_3_0= ruleValue )
            {
            // InternalJsonParser.g:757:4: (lv_newValue_3_0= ruleValue )
            // InternalJsonParser.g:758:5: lv_newValue_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getNewValueValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_newValue_3_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					set(
            						current,
            						"newValue",
            						lv_newValue_3_0,
            						"org.xtext.example.idmproject.JsonParser.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getUpdateAccess().getRightParenthesisKeyword_4());
            		

            			newCompositeNode(grammarAccess.getUpdateAccess().getEOLParserRuleCall_5());
            		
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
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleCompute"
    // InternalJsonParser.g:790:1: entryRuleCompute returns [EObject current=null] : iv_ruleCompute= ruleCompute EOF ;
    public final EObject entryRuleCompute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompute = null;


        try {
            // InternalJsonParser.g:790:48: (iv_ruleCompute= ruleCompute EOF )
            // InternalJsonParser.g:791:2: iv_ruleCompute= ruleCompute EOF
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
    // InternalJsonParser.g:797:1: ruleCompute returns [EObject current=null] : (this_Sum_0= ruleSum | this_Product_1= ruleProduct ) ;
    public final EObject ruleCompute() throws RecognitionException {
        EObject current = null;

        EObject this_Sum_0 = null;

        EObject this_Product_1 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:803:2: ( (this_Sum_0= ruleSum | this_Product_1= ruleProduct ) )
            // InternalJsonParser.g:804:2: (this_Sum_0= ruleSum | this_Product_1= ruleProduct )
            {
            // InternalJsonParser.g:804:2: (this_Sum_0= ruleSum | this_Product_1= ruleProduct )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==22) ) {
                    alt4=1;
                }
                else if ( (LA4_1==23) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJsonParser.g:805:3: this_Sum_0= ruleSum
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
                    // InternalJsonParser.g:814:3: this_Product_1= ruleProduct
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
    // InternalJsonParser.g:826:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalJsonParser.g:826:44: (iv_ruleSum= ruleSum EOF )
            // InternalJsonParser.g:827:2: iv_ruleSum= ruleSum EOF
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
    // InternalJsonParser.g:833:1: ruleSum returns [EObject current=null] : ( ( (lv_key1_0_0= ruleKey ) ) otherlv_1= '+' ( (lv_key2_2_0= ruleKey ) ) ruleEOL ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key1_0_0 = null;

        AntlrDatatypeRuleToken lv_key2_2_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:839:2: ( ( ( (lv_key1_0_0= ruleKey ) ) otherlv_1= '+' ( (lv_key2_2_0= ruleKey ) ) ruleEOL ) )
            // InternalJsonParser.g:840:2: ( ( (lv_key1_0_0= ruleKey ) ) otherlv_1= '+' ( (lv_key2_2_0= ruleKey ) ) ruleEOL )
            {
            // InternalJsonParser.g:840:2: ( ( (lv_key1_0_0= ruleKey ) ) otherlv_1= '+' ( (lv_key2_2_0= ruleKey ) ) ruleEOL )
            // InternalJsonParser.g:841:3: ( (lv_key1_0_0= ruleKey ) ) otherlv_1= '+' ( (lv_key2_2_0= ruleKey ) ) ruleEOL
            {
            // InternalJsonParser.g:841:3: ( (lv_key1_0_0= ruleKey ) )
            // InternalJsonParser.g:842:4: (lv_key1_0_0= ruleKey )
            {
            // InternalJsonParser.g:842:4: (lv_key1_0_0= ruleKey )
            // InternalJsonParser.g:843:5: lv_key1_0_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getSumAccess().getKey1KeyParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_key1_0_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					set(
            						current,
            						"key1",
            						lv_key1_0_0,
            						"org.xtext.example.idmproject.JsonParser.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSumAccess().getPlusSignKeyword_1());
            		
            // InternalJsonParser.g:864:3: ( (lv_key2_2_0= ruleKey ) )
            // InternalJsonParser.g:865:4: (lv_key2_2_0= ruleKey )
            {
            // InternalJsonParser.g:865:4: (lv_key2_2_0= ruleKey )
            // InternalJsonParser.g:866:5: lv_key2_2_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getSumAccess().getKey2KeyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_key2_2_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					set(
            						current,
            						"key2",
            						lv_key2_2_0,
            						"org.xtext.example.idmproject.JsonParser.Key");
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
    // InternalJsonParser.g:894:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // InternalJsonParser.g:894:48: (iv_ruleProduct= ruleProduct EOF )
            // InternalJsonParser.g:895:2: iv_ruleProduct= ruleProduct EOF
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
    // InternalJsonParser.g:901:1: ruleProduct returns [EObject current=null] : ( ( (lv_key1_0_0= ruleKey ) ) otherlv_1= '*' ( (lv_key2_2_0= ruleKey ) ) ruleEOL ) ;
    public final EObject ruleProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key1_0_0 = null;

        AntlrDatatypeRuleToken lv_key2_2_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:907:2: ( ( ( (lv_key1_0_0= ruleKey ) ) otherlv_1= '*' ( (lv_key2_2_0= ruleKey ) ) ruleEOL ) )
            // InternalJsonParser.g:908:2: ( ( (lv_key1_0_0= ruleKey ) ) otherlv_1= '*' ( (lv_key2_2_0= ruleKey ) ) ruleEOL )
            {
            // InternalJsonParser.g:908:2: ( ( (lv_key1_0_0= ruleKey ) ) otherlv_1= '*' ( (lv_key2_2_0= ruleKey ) ) ruleEOL )
            // InternalJsonParser.g:909:3: ( (lv_key1_0_0= ruleKey ) ) otherlv_1= '*' ( (lv_key2_2_0= ruleKey ) ) ruleEOL
            {
            // InternalJsonParser.g:909:3: ( (lv_key1_0_0= ruleKey ) )
            // InternalJsonParser.g:910:4: (lv_key1_0_0= ruleKey )
            {
            // InternalJsonParser.g:910:4: (lv_key1_0_0= ruleKey )
            // InternalJsonParser.g:911:5: lv_key1_0_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getProductAccess().getKey1KeyParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_key1_0_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductRule());
            					}
            					set(
            						current,
            						"key1",
            						lv_key1_0_0,
            						"org.xtext.example.idmproject.JsonParser.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProductAccess().getAsteriskKeyword_1());
            		
            // InternalJsonParser.g:932:3: ( (lv_key2_2_0= ruleKey ) )
            // InternalJsonParser.g:933:4: (lv_key2_2_0= ruleKey )
            {
            // InternalJsonParser.g:933:4: (lv_key2_2_0= ruleKey )
            // InternalJsonParser.g:934:5: lv_key2_2_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getProductAccess().getKey2KeyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_key2_2_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductRule());
            					}
            					set(
            						current,
            						"key2",
            						lv_key2_2_0,
            						"org.xtext.example.idmproject.JsonParser.Key");
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


    // $ANTLR start "entryRuleKey"
    // InternalJsonParser.g:962:1: entryRuleKey returns [String current=null] : iv_ruleKey= ruleKey EOF ;
    public final String entryRuleKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKey = null;


        try {
            // InternalJsonParser.g:962:43: (iv_ruleKey= ruleKey EOF )
            // InternalJsonParser.g:963:2: iv_ruleKey= ruleKey EOF
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
    // InternalJsonParser.g:969:1: ruleKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalJsonParser.g:975:2: (this_STRING_0= RULE_STRING )
            // InternalJsonParser.g:976:2: this_STRING_0= RULE_STRING
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
    // InternalJsonParser.g:986:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalJsonParser.g:986:46: (iv_ruleValue= ruleValue EOF )
            // InternalJsonParser.g:987:2: iv_ruleValue= ruleValue EOF
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
    // InternalJsonParser.g:993:1: ruleValue returns [EObject current=null] : ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_integerValue_1_0= RULE_INT ) ) | ( (lv_array_2_0= ruleArray ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_0_0=null;
        Token lv_integerValue_1_0=null;
        AntlrDatatypeRuleToken lv_array_2_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:999:2: ( ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_integerValue_1_0= RULE_INT ) ) | ( (lv_array_2_0= ruleArray ) ) ) )
            // InternalJsonParser.g:1000:2: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_integerValue_1_0= RULE_INT ) ) | ( (lv_array_2_0= ruleArray ) ) )
            {
            // InternalJsonParser.g:1000:2: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_integerValue_1_0= RULE_INT ) ) | ( (lv_array_2_0= ruleArray ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==12) ) {
                    alt5=1;
                }
                else if ( (LA5_1==RULE_STRING||LA5_1==25) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case 24:
            case 25:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalJsonParser.g:1001:3: ( (lv_stringValue_0_0= RULE_STRING ) )
                    {
                    // InternalJsonParser.g:1001:3: ( (lv_stringValue_0_0= RULE_STRING ) )
                    // InternalJsonParser.g:1002:4: (lv_stringValue_0_0= RULE_STRING )
                    {
                    // InternalJsonParser.g:1002:4: (lv_stringValue_0_0= RULE_STRING )
                    // InternalJsonParser.g:1003:5: lv_stringValue_0_0= RULE_STRING
                    {
                    lv_stringValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_stringValue_0_0, grammarAccess.getValueAccess().getStringValueSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"stringValue",
                    						lv_stringValue_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJsonParser.g:1020:3: ( (lv_integerValue_1_0= RULE_INT ) )
                    {
                    // InternalJsonParser.g:1020:3: ( (lv_integerValue_1_0= RULE_INT ) )
                    // InternalJsonParser.g:1021:4: (lv_integerValue_1_0= RULE_INT )
                    {
                    // InternalJsonParser.g:1021:4: (lv_integerValue_1_0= RULE_INT )
                    // InternalJsonParser.g:1022:5: lv_integerValue_1_0= RULE_INT
                    {
                    lv_integerValue_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_integerValue_1_0, grammarAccess.getValueAccess().getIntegerValueINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"integerValue",
                    						lv_integerValue_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJsonParser.g:1039:3: ( (lv_array_2_0= ruleArray ) )
                    {
                    // InternalJsonParser.g:1039:3: ( (lv_array_2_0= ruleArray ) )
                    // InternalJsonParser.g:1040:4: (lv_array_2_0= ruleArray )
                    {
                    // InternalJsonParser.g:1040:4: (lv_array_2_0= ruleArray )
                    // InternalJsonParser.g:1041:5: lv_array_2_0= ruleArray
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getArrayArrayParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_2_0=ruleArray();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_2_0,
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
    // InternalJsonParser.g:1062:1: entryRuleArray returns [String current=null] : iv_ruleArray= ruleArray EOF ;
    public final String entryRuleArray() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArray = null;


        try {
            // InternalJsonParser.g:1062:45: (iv_ruleArray= ruleArray EOF )
            // InternalJsonParser.g:1063:2: iv_ruleArray= ruleArray EOF
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
    // InternalJsonParser.g:1069:1: ruleArray returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '[' (this_INT_1= RULE_INT )* ) | ( (this_STRING_2= RULE_STRING )* kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken ruleArray() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalJsonParser.g:1075:2: ( ( (kw= '[' (this_INT_1= RULE_INT )* ) | ( (this_STRING_2= RULE_STRING )* kw= ']' ) ) )
            // InternalJsonParser.g:1076:2: ( (kw= '[' (this_INT_1= RULE_INT )* ) | ( (this_STRING_2= RULE_STRING )* kw= ']' ) )
            {
            // InternalJsonParser.g:1076:2: ( (kw= '[' (this_INT_1= RULE_INT )* ) | ( (this_STRING_2= RULE_STRING )* kw= ']' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING||LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalJsonParser.g:1077:3: (kw= '[' (this_INT_1= RULE_INT )* )
                    {
                    // InternalJsonParser.g:1077:3: (kw= '[' (this_INT_1= RULE_INT )* )
                    // InternalJsonParser.g:1078:4: kw= '[' (this_INT_1= RULE_INT )*
                    {
                    kw=(Token)match(input,24,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalJsonParser.g:1083:4: (this_INT_1= RULE_INT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_INT) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalJsonParser.g:1084:5: this_INT_1= RULE_INT
                    	    {
                    	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_13); 

                    	    					current.merge(this_INT_1);
                    	    				

                    	    					newLeafNode(this_INT_1, grammarAccess.getArrayAccess().getINTTerminalRuleCall_0_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalJsonParser.g:1094:3: ( (this_STRING_2= RULE_STRING )* kw= ']' )
                    {
                    // InternalJsonParser.g:1094:3: ( (this_STRING_2= RULE_STRING )* kw= ']' )
                    // InternalJsonParser.g:1095:4: (this_STRING_2= RULE_STRING )* kw= ']'
                    {
                    // InternalJsonParser.g:1095:4: (this_STRING_2= RULE_STRING )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_STRING) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalJsonParser.g:1096:5: this_STRING_2= RULE_STRING
                    	    {
                    	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    	    					current.merge(this_STRING_2);
                    	    				

                    	    					newLeafNode(this_STRING_2, grammarAccess.getArrayAccess().getSTRINGTerminalRuleCall_1_0());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    kw=(Token)match(input,25,FOLLOW_2); 

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
    // InternalJsonParser.g:1114:1: entryRuleEOL returns [String current=null] : iv_ruleEOL= ruleEOL EOF ;
    public final String entryRuleEOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEOL = null;


        try {
            // InternalJsonParser.g:1114:43: (iv_ruleEOL= ruleEOL EOF )
            // InternalJsonParser.g:1115:2: iv_ruleEOL= ruleEOL EOF
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
    // InternalJsonParser.g:1121:1: ruleEOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\n' ;
    public final AntlrDatatypeRuleToken ruleEOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJsonParser.g:1127:2: (kw= '\\n' )
            // InternalJsonParser.g:1128:2: kw= '\\n'
            {
            kw=(Token)match(input,26,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000002FA012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003100030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000010L});

}