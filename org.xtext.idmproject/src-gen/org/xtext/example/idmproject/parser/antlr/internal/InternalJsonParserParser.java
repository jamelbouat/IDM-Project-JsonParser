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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.load('", "')'", "'expr'", "'=.select('", "'.store('", "'.save()'", "'.print('", "'.get('", "'.insert('", "','", "'.update('", "'.sum('", "'+'", "'.product('", "'*'", "'.export('", "'['", "']'", "'\\n'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
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

                if ( (LA1_0==13||(LA1_0>=15 && LA1_0<=19)||(LA1_0>=21 && LA1_0<=22)||LA1_0==24||LA1_0==26) ) {
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
    // InternalJsonParser.g:128:1: ruleInstruction returns [EObject current=null] : ( ( (lv_select_0_0= ruleSelect ) ) | ( (lv_store_1_0= ruleStore ) ) | ( (lv_save_2_0= ruleSave ) ) | ( (lv_print_3_0= rulePrint ) ) | ( (lv_insert_4_0= ruleInsert ) ) | ( (lv_update_5_0= ruleUpdate ) ) | ( (lv_compute_6_0= ruleCompute ) ) | ( (lv_get_7_0= ruleGetValue ) ) | ( (lv_export_8_0= ruleExport ) ) ) ;
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

        EObject lv_export_8_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:134:2: ( ( ( (lv_select_0_0= ruleSelect ) ) | ( (lv_store_1_0= ruleStore ) ) | ( (lv_save_2_0= ruleSave ) ) | ( (lv_print_3_0= rulePrint ) ) | ( (lv_insert_4_0= ruleInsert ) ) | ( (lv_update_5_0= ruleUpdate ) ) | ( (lv_compute_6_0= ruleCompute ) ) | ( (lv_get_7_0= ruleGetValue ) ) | ( (lv_export_8_0= ruleExport ) ) ) )
            // InternalJsonParser.g:135:2: ( ( (lv_select_0_0= ruleSelect ) ) | ( (lv_store_1_0= ruleStore ) ) | ( (lv_save_2_0= ruleSave ) ) | ( (lv_print_3_0= rulePrint ) ) | ( (lv_insert_4_0= ruleInsert ) ) | ( (lv_update_5_0= ruleUpdate ) ) | ( (lv_compute_6_0= ruleCompute ) ) | ( (lv_get_7_0= ruleGetValue ) ) | ( (lv_export_8_0= ruleExport ) ) )
            {
            // InternalJsonParser.g:135:2: ( ( (lv_select_0_0= ruleSelect ) ) | ( (lv_store_1_0= ruleStore ) ) | ( (lv_save_2_0= ruleSave ) ) | ( (lv_print_3_0= rulePrint ) ) | ( (lv_insert_4_0= ruleInsert ) ) | ( (lv_update_5_0= ruleUpdate ) ) | ( (lv_compute_6_0= ruleCompute ) ) | ( (lv_get_7_0= ruleGetValue ) ) | ( (lv_export_8_0= ruleExport ) ) )
            int alt2=9;
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
            case 22:
            case 24:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            case 26:
                {
                alt2=9;
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
                case 9 :
                    // InternalJsonParser.g:296:3: ( (lv_export_8_0= ruleExport ) )
                    {
                    // InternalJsonParser.g:296:3: ( (lv_export_8_0= ruleExport ) )
                    // InternalJsonParser.g:297:4: (lv_export_8_0= ruleExport )
                    {
                    // InternalJsonParser.g:297:4: (lv_export_8_0= ruleExport )
                    // InternalJsonParser.g:298:5: lv_export_8_0= ruleExport
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getExportExportParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_export_8_0=ruleExport();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"export",
                    						lv_export_8_0,
                    						"org.xtext.example.idmproject.JsonParser.Export");
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
    // InternalJsonParser.g:319:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalJsonParser.g:319:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalJsonParser.g:320:2: iv_ruleLoad= ruleLoad EOF
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
    // InternalJsonParser.g:326:1: ruleLoad returns [EObject current=null] : (otherlv_0= '.load(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_file_1_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:332:2: ( (otherlv_0= '.load(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL ) )
            // InternalJsonParser.g:333:2: (otherlv_0= '.load(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL )
            {
            // InternalJsonParser.g:333:2: (otherlv_0= '.load(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL )
            // InternalJsonParser.g:334:3: otherlv_0= '.load(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0());
            		
            // InternalJsonParser.g:338:3: ( (lv_file_1_0= ruleFile ) )
            // InternalJsonParser.g:339:4: (lv_file_1_0= ruleFile )
            {
            // InternalJsonParser.g:339:4: (lv_file_1_0= ruleFile )
            // InternalJsonParser.g:340:5: lv_file_1_0= ruleFile
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
    // InternalJsonParser.g:372:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalJsonParser.g:372:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalJsonParser.g:373:2: iv_ruleSelect= ruleSelect EOF
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
    // InternalJsonParser.g:379:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'expr' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '=.select(' ( (lv_key_3_0= ruleKey ) ) otherlv_4= ')' ruleEOL ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_key_3_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:385:2: ( (otherlv_0= 'expr' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '=.select(' ( (lv_key_3_0= ruleKey ) ) otherlv_4= ')' ruleEOL ) )
            // InternalJsonParser.g:386:2: (otherlv_0= 'expr' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '=.select(' ( (lv_key_3_0= ruleKey ) ) otherlv_4= ')' ruleEOL )
            {
            // InternalJsonParser.g:386:2: (otherlv_0= 'expr' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '=.select(' ( (lv_key_3_0= ruleKey ) ) otherlv_4= ')' ruleEOL )
            // InternalJsonParser.g:387:3: otherlv_0= 'expr' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '=.select(' ( (lv_key_3_0= ruleKey ) ) otherlv_4= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getExprKeyword_0());
            		
            // InternalJsonParser.g:391:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalJsonParser.g:392:4: (lv_id_1_0= RULE_ID )
            {
            // InternalJsonParser.g:392:4: (lv_id_1_0= RULE_ID )
            // InternalJsonParser.g:393:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_id_1_0, grammarAccess.getSelectAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getSelectKeyword_2());
            		
            // InternalJsonParser.g:413:3: ( (lv_key_3_0= ruleKey ) )
            // InternalJsonParser.g:414:4: (lv_key_3_0= ruleKey )
            {
            // InternalJsonParser.g:414:4: (lv_key_3_0= ruleKey )
            // InternalJsonParser.g:415:5: lv_key_3_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getSelectAccess().getKeyKeyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_key_3_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_3_0,
            						"org.xtext.example.idmproject.JsonParser.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getRightParenthesisKeyword_4());
            		

            			newCompositeNode(grammarAccess.getSelectAccess().getEOLParserRuleCall_5());
            		
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
    // InternalJsonParser.g:447:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalJsonParser.g:447:46: (iv_ruleStore= ruleStore EOF )
            // InternalJsonParser.g:448:2: iv_ruleStore= ruleStore EOF
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
    // InternalJsonParser.g:454:1: ruleStore returns [EObject current=null] : (otherlv_0= '.store(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_file_1_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:460:2: ( (otherlv_0= '.store(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL ) )
            // InternalJsonParser.g:461:2: (otherlv_0= '.store(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL )
            {
            // InternalJsonParser.g:461:2: (otherlv_0= '.store(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL )
            // InternalJsonParser.g:462:3: otherlv_0= '.store(' ( (lv_file_1_0= ruleFile ) ) otherlv_2= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            // InternalJsonParser.g:466:3: ( (lv_file_1_0= ruleFile ) )
            // InternalJsonParser.g:467:4: (lv_file_1_0= ruleFile )
            {
            // InternalJsonParser.g:467:4: (lv_file_1_0= ruleFile )
            // InternalJsonParser.g:468:5: lv_file_1_0= ruleFile
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
    // InternalJsonParser.g:500:1: entryRuleFile returns [String current=null] : iv_ruleFile= ruleFile EOF ;
    public final String entryRuleFile() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFile = null;


        try {
            // InternalJsonParser.g:500:44: (iv_ruleFile= ruleFile EOF )
            // InternalJsonParser.g:501:2: iv_ruleFile= ruleFile EOF
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
    // InternalJsonParser.g:507:1: ruleFile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleFile() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalJsonParser.g:513:2: (this_STRING_0= RULE_STRING )
            // InternalJsonParser.g:514:2: this_STRING_0= RULE_STRING
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
    // InternalJsonParser.g:524:1: entryRuleSave returns [String current=null] : iv_ruleSave= ruleSave EOF ;
    public final String entryRuleSave() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSave = null;


        try {
            // InternalJsonParser.g:524:44: (iv_ruleSave= ruleSave EOF )
            // InternalJsonParser.g:525:2: iv_ruleSave= ruleSave EOF
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
    // InternalJsonParser.g:531:1: ruleSave returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.save()' this_EOL_1= ruleEOL ) ;
    public final AntlrDatatypeRuleToken ruleSave() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EOL_1 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:537:2: ( (kw= '.save()' this_EOL_1= ruleEOL ) )
            // InternalJsonParser.g:538:2: (kw= '.save()' this_EOL_1= ruleEOL )
            {
            // InternalJsonParser.g:538:2: (kw= '.save()' this_EOL_1= ruleEOL )
            // InternalJsonParser.g:539:3: kw= '.save()' this_EOL_1= ruleEOL
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
    // InternalJsonParser.g:558:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalJsonParser.g:558:46: (iv_rulePrint= rulePrint EOF )
            // InternalJsonParser.g:559:2: iv_rulePrint= rulePrint EOF
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
    // InternalJsonParser.g:565:1: rulePrint returns [EObject current=null] : (otherlv_0= '.print(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:571:2: ( (otherlv_0= '.print(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL ) )
            // InternalJsonParser.g:572:2: (otherlv_0= '.print(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL )
            {
            // InternalJsonParser.g:572:2: (otherlv_0= '.print(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL )
            // InternalJsonParser.g:573:3: otherlv_0= '.print(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            // InternalJsonParser.g:577:3: ( (lv_key_1_0= ruleKey ) )
            // InternalJsonParser.g:578:4: (lv_key_1_0= ruleKey )
            {
            // InternalJsonParser.g:578:4: (lv_key_1_0= ruleKey )
            // InternalJsonParser.g:579:5: lv_key_1_0= ruleKey
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
    // InternalJsonParser.g:611:1: entryRuleGetValue returns [EObject current=null] : iv_ruleGetValue= ruleGetValue EOF ;
    public final EObject entryRuleGetValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetValue = null;


        try {
            // InternalJsonParser.g:611:49: (iv_ruleGetValue= ruleGetValue EOF )
            // InternalJsonParser.g:612:2: iv_ruleGetValue= ruleGetValue EOF
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
    // InternalJsonParser.g:618:1: ruleGetValue returns [EObject current=null] : (otherlv_0= '.get(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL ) ;
    public final EObject ruleGetValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:624:2: ( (otherlv_0= '.get(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL ) )
            // InternalJsonParser.g:625:2: (otherlv_0= '.get(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL )
            {
            // InternalJsonParser.g:625:2: (otherlv_0= '.get(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL )
            // InternalJsonParser.g:626:3: otherlv_0= '.get(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGetValueAccess().getGetKeyword_0());
            		
            // InternalJsonParser.g:630:3: ( (lv_key_1_0= ruleKey ) )
            // InternalJsonParser.g:631:4: (lv_key_1_0= ruleKey )
            {
            // InternalJsonParser.g:631:4: (lv_key_1_0= ruleKey )
            // InternalJsonParser.g:632:5: lv_key_1_0= ruleKey
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
    // InternalJsonParser.g:664:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalJsonParser.g:664:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalJsonParser.g:665:2: iv_ruleInsert= ruleInsert EOF
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
    // InternalJsonParser.g:671:1: ruleInsert returns [EObject current=null] : (otherlv_0= '.insert(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:677:2: ( (otherlv_0= '.insert(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL ) )
            // InternalJsonParser.g:678:2: (otherlv_0= '.insert(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL )
            {
            // InternalJsonParser.g:678:2: (otherlv_0= '.insert(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL )
            // InternalJsonParser.g:679:3: otherlv_0= '.insert(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
            		
            // InternalJsonParser.g:683:3: ( (lv_key_1_0= ruleKey ) )
            // InternalJsonParser.g:684:4: (lv_key_1_0= ruleKey )
            {
            // InternalJsonParser.g:684:4: (lv_key_1_0= ruleKey )
            // InternalJsonParser.g:685:5: lv_key_1_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getKeyKeyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getCommaKeyword_2());
            		
            // InternalJsonParser.g:706:3: ( (lv_value_3_0= ruleValue ) )
            // InternalJsonParser.g:707:4: (lv_value_3_0= ruleValue )
            {
            // InternalJsonParser.g:707:4: (lv_value_3_0= ruleValue )
            // InternalJsonParser.g:708:5: lv_value_3_0= ruleValue
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
    // InternalJsonParser.g:740:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // InternalJsonParser.g:740:47: (iv_ruleUpdate= ruleUpdate EOF )
            // InternalJsonParser.g:741:2: iv_ruleUpdate= ruleUpdate EOF
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
    // InternalJsonParser.g:747:1: ruleUpdate returns [EObject current=null] : (otherlv_0= '.update(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ',' ( (lv_newValue_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        EObject lv_newValue_3_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:753:2: ( (otherlv_0= '.update(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ',' ( (lv_newValue_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL ) )
            // InternalJsonParser.g:754:2: (otherlv_0= '.update(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ',' ( (lv_newValue_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL )
            {
            // InternalJsonParser.g:754:2: (otherlv_0= '.update(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ',' ( (lv_newValue_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL )
            // InternalJsonParser.g:755:3: otherlv_0= '.update(' ( (lv_key_1_0= ruleKey ) ) otherlv_2= ',' ( (lv_newValue_3_0= ruleValue ) ) otherlv_4= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateAccess().getUpdateKeyword_0());
            		
            // InternalJsonParser.g:759:3: ( (lv_key_1_0= ruleKey ) )
            // InternalJsonParser.g:760:4: (lv_key_1_0= ruleKey )
            {
            // InternalJsonParser.g:760:4: (lv_key_1_0= ruleKey )
            // InternalJsonParser.g:761:5: lv_key_1_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getKeyKeyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getUpdateAccess().getCommaKeyword_2());
            		
            // InternalJsonParser.g:782:3: ( (lv_newValue_3_0= ruleValue ) )
            // InternalJsonParser.g:783:4: (lv_newValue_3_0= ruleValue )
            {
            // InternalJsonParser.g:783:4: (lv_newValue_3_0= ruleValue )
            // InternalJsonParser.g:784:5: lv_newValue_3_0= ruleValue
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
    // InternalJsonParser.g:816:1: entryRuleCompute returns [EObject current=null] : iv_ruleCompute= ruleCompute EOF ;
    public final EObject entryRuleCompute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompute = null;


        try {
            // InternalJsonParser.g:816:48: (iv_ruleCompute= ruleCompute EOF )
            // InternalJsonParser.g:817:2: iv_ruleCompute= ruleCompute EOF
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
    // InternalJsonParser.g:823:1: ruleCompute returns [EObject current=null] : ( (this_Sum_0= ruleSum | this_Product_1= ruleProduct ) ruleEOL ) ;
    public final EObject ruleCompute() throws RecognitionException {
        EObject current = null;

        EObject this_Sum_0 = null;

        EObject this_Product_1 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:829:2: ( ( (this_Sum_0= ruleSum | this_Product_1= ruleProduct ) ruleEOL ) )
            // InternalJsonParser.g:830:2: ( (this_Sum_0= ruleSum | this_Product_1= ruleProduct ) ruleEOL )
            {
            // InternalJsonParser.g:830:2: ( (this_Sum_0= ruleSum | this_Product_1= ruleProduct ) ruleEOL )
            // InternalJsonParser.g:831:3: (this_Sum_0= ruleSum | this_Product_1= ruleProduct ) ruleEOL
            {
            // InternalJsonParser.g:831:3: (this_Sum_0= ruleSum | this_Product_1= ruleProduct )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJsonParser.g:832:4: this_Sum_0= ruleSum
                    {

                    				newCompositeNode(grammarAccess.getComputeAccess().getSumParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_6);
                    this_Sum_0=ruleSum();

                    state._fsp--;


                    				current = this_Sum_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalJsonParser.g:841:4: this_Product_1= ruleProduct
                    {

                    				newCompositeNode(grammarAccess.getComputeAccess().getProductParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_6);
                    this_Product_1=ruleProduct();

                    state._fsp--;


                    				current = this_Product_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getComputeAccess().getEOLParserRuleCall_1());
            		
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
    // $ANTLR end "ruleCompute"


    // $ANTLR start "entryRuleSum"
    // InternalJsonParser.g:861:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalJsonParser.g:861:44: (iv_ruleSum= ruleSum EOF )
            // InternalJsonParser.g:862:2: iv_ruleSum= ruleSum EOF
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
    // InternalJsonParser.g:868:1: ruleSum returns [EObject current=null] : (otherlv_0= '.sum(' ( (lv_key1_1_0= ruleKey ) ) otherlv_2= '+' ( (lv_key2_3_0= ruleKey ) ) otherlv_4= ')' ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_key1_1_0 = null;

        AntlrDatatypeRuleToken lv_key2_3_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:874:2: ( (otherlv_0= '.sum(' ( (lv_key1_1_0= ruleKey ) ) otherlv_2= '+' ( (lv_key2_3_0= ruleKey ) ) otherlv_4= ')' ) )
            // InternalJsonParser.g:875:2: (otherlv_0= '.sum(' ( (lv_key1_1_0= ruleKey ) ) otherlv_2= '+' ( (lv_key2_3_0= ruleKey ) ) otherlv_4= ')' )
            {
            // InternalJsonParser.g:875:2: (otherlv_0= '.sum(' ( (lv_key1_1_0= ruleKey ) ) otherlv_2= '+' ( (lv_key2_3_0= ruleKey ) ) otherlv_4= ')' )
            // InternalJsonParser.g:876:3: otherlv_0= '.sum(' ( (lv_key1_1_0= ruleKey ) ) otherlv_2= '+' ( (lv_key2_3_0= ruleKey ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSumAccess().getSumKeyword_0());
            		
            // InternalJsonParser.g:880:3: ( (lv_key1_1_0= ruleKey ) )
            // InternalJsonParser.g:881:4: (lv_key1_1_0= ruleKey )
            {
            // InternalJsonParser.g:881:4: (lv_key1_1_0= ruleKey )
            // InternalJsonParser.g:882:5: lv_key1_1_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getSumAccess().getKey1KeyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_key1_1_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					set(
            						current,
            						"key1",
            						lv_key1_1_0,
            						"org.xtext.example.idmproject.JsonParser.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSumAccess().getPlusSignKeyword_2());
            		
            // InternalJsonParser.g:903:3: ( (lv_key2_3_0= ruleKey ) )
            // InternalJsonParser.g:904:4: (lv_key2_3_0= ruleKey )
            {
            // InternalJsonParser.g:904:4: (lv_key2_3_0= ruleKey )
            // InternalJsonParser.g:905:5: lv_key2_3_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getSumAccess().getKey2KeyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_key2_3_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					set(
            						current,
            						"key2",
            						lv_key2_3_0,
            						"org.xtext.example.idmproject.JsonParser.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSumAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalJsonParser.g:930:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // InternalJsonParser.g:930:48: (iv_ruleProduct= ruleProduct EOF )
            // InternalJsonParser.g:931:2: iv_ruleProduct= ruleProduct EOF
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
    // InternalJsonParser.g:937:1: ruleProduct returns [EObject current=null] : (otherlv_0= '.product(' ( (lv_key1_1_0= ruleKey ) ) otherlv_2= '*' ( (lv_key2_3_0= ruleKey ) ) otherlv_4= ')' ) ;
    public final EObject ruleProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_key1_1_0 = null;

        AntlrDatatypeRuleToken lv_key2_3_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:943:2: ( (otherlv_0= '.product(' ( (lv_key1_1_0= ruleKey ) ) otherlv_2= '*' ( (lv_key2_3_0= ruleKey ) ) otherlv_4= ')' ) )
            // InternalJsonParser.g:944:2: (otherlv_0= '.product(' ( (lv_key1_1_0= ruleKey ) ) otherlv_2= '*' ( (lv_key2_3_0= ruleKey ) ) otherlv_4= ')' )
            {
            // InternalJsonParser.g:944:2: (otherlv_0= '.product(' ( (lv_key1_1_0= ruleKey ) ) otherlv_2= '*' ( (lv_key2_3_0= ruleKey ) ) otherlv_4= ')' )
            // InternalJsonParser.g:945:3: otherlv_0= '.product(' ( (lv_key1_1_0= ruleKey ) ) otherlv_2= '*' ( (lv_key2_3_0= ruleKey ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProductAccess().getProductKeyword_0());
            		
            // InternalJsonParser.g:949:3: ( (lv_key1_1_0= ruleKey ) )
            // InternalJsonParser.g:950:4: (lv_key1_1_0= ruleKey )
            {
            // InternalJsonParser.g:950:4: (lv_key1_1_0= ruleKey )
            // InternalJsonParser.g:951:5: lv_key1_1_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getProductAccess().getKey1KeyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_key1_1_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductRule());
            					}
            					set(
            						current,
            						"key1",
            						lv_key1_1_0,
            						"org.xtext.example.idmproject.JsonParser.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getProductAccess().getAsteriskKeyword_2());
            		
            // InternalJsonParser.g:972:3: ( (lv_key2_3_0= ruleKey ) )
            // InternalJsonParser.g:973:4: (lv_key2_3_0= ruleKey )
            {
            // InternalJsonParser.g:973:4: (lv_key2_3_0= ruleKey )
            // InternalJsonParser.g:974:5: lv_key2_3_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getProductAccess().getKey2KeyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_key2_3_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductRule());
            					}
            					set(
            						current,
            						"key2",
            						lv_key2_3_0,
            						"org.xtext.example.idmproject.JsonParser.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProductAccess().getRightParenthesisKeyword_4());
            		

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


    // $ANTLR start "entryRuleExport"
    // InternalJsonParser.g:999:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalJsonParser.g:999:47: (iv_ruleExport= ruleExport EOF )
            // InternalJsonParser.g:1000:2: iv_ruleExport= ruleExport EOF
            {
             newCompositeNode(grammarAccess.getExportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExport=ruleExport();

            state._fsp--;

             current =iv_ruleExport; 
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
    // $ANTLR end "entryRuleExport"


    // $ANTLR start "ruleExport"
    // InternalJsonParser.g:1006:1: ruleExport returns [EObject current=null] : (otherlv_0= '.export(' ( (lv_csvFileName_1_0= RULE_STRING ) ) otherlv_2= ')' ruleEOL ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_csvFileName_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJsonParser.g:1012:2: ( (otherlv_0= '.export(' ( (lv_csvFileName_1_0= RULE_STRING ) ) otherlv_2= ')' ruleEOL ) )
            // InternalJsonParser.g:1013:2: (otherlv_0= '.export(' ( (lv_csvFileName_1_0= RULE_STRING ) ) otherlv_2= ')' ruleEOL )
            {
            // InternalJsonParser.g:1013:2: (otherlv_0= '.export(' ( (lv_csvFileName_1_0= RULE_STRING ) ) otherlv_2= ')' ruleEOL )
            // InternalJsonParser.g:1014:3: otherlv_0= '.export(' ( (lv_csvFileName_1_0= RULE_STRING ) ) otherlv_2= ')' ruleEOL
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getExportKeyword_0());
            		
            // InternalJsonParser.g:1018:3: ( (lv_csvFileName_1_0= RULE_STRING ) )
            // InternalJsonParser.g:1019:4: (lv_csvFileName_1_0= RULE_STRING )
            {
            // InternalJsonParser.g:1019:4: (lv_csvFileName_1_0= RULE_STRING )
            // InternalJsonParser.g:1020:5: lv_csvFileName_1_0= RULE_STRING
            {
            lv_csvFileName_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_csvFileName_1_0, grammarAccess.getExportAccess().getCsvFileNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"csvFileName",
            						lv_csvFileName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getExportAccess().getRightParenthesisKeyword_2());
            		

            			newCompositeNode(grammarAccess.getExportAccess().getEOLParserRuleCall_3());
            		
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
    // $ANTLR end "ruleExport"


    // $ANTLR start "entryRuleKey"
    // InternalJsonParser.g:1051:1: entryRuleKey returns [String current=null] : iv_ruleKey= ruleKey EOF ;
    public final String entryRuleKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKey = null;


        try {
            // InternalJsonParser.g:1051:43: (iv_ruleKey= ruleKey EOF )
            // InternalJsonParser.g:1052:2: iv_ruleKey= ruleKey EOF
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
    // InternalJsonParser.g:1058:1: ruleKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalJsonParser.g:1064:2: (this_STRING_0= RULE_STRING )
            // InternalJsonParser.g:1065:2: this_STRING_0= RULE_STRING
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
    // InternalJsonParser.g:1075:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalJsonParser.g:1075:46: (iv_ruleValue= ruleValue EOF )
            // InternalJsonParser.g:1076:2: iv_ruleValue= ruleValue EOF
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
    // InternalJsonParser.g:1082:1: ruleValue returns [EObject current=null] : ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_integerValue_1_0= RULE_INT ) ) | ( (lv_array_2_0= ruleArray ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_0_0=null;
        Token lv_integerValue_1_0=null;
        AntlrDatatypeRuleToken lv_array_2_0 = null;



        	enterRule();

        try {
            // InternalJsonParser.g:1088:2: ( ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_integerValue_1_0= RULE_INT ) ) | ( (lv_array_2_0= ruleArray ) ) ) )
            // InternalJsonParser.g:1089:2: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_integerValue_1_0= RULE_INT ) ) | ( (lv_array_2_0= ruleArray ) ) )
            {
            // InternalJsonParser.g:1089:2: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_integerValue_1_0= RULE_INT ) ) | ( (lv_array_2_0= ruleArray ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_STRING||LA4_1==28) ) {
                    alt4=3;
                }
                else if ( (LA4_1==EOF||LA4_1==12) ) {
                    alt4=1;
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
            case 27:
            case 28:
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
                    // InternalJsonParser.g:1090:3: ( (lv_stringValue_0_0= RULE_STRING ) )
                    {
                    // InternalJsonParser.g:1090:3: ( (lv_stringValue_0_0= RULE_STRING ) )
                    // InternalJsonParser.g:1091:4: (lv_stringValue_0_0= RULE_STRING )
                    {
                    // InternalJsonParser.g:1091:4: (lv_stringValue_0_0= RULE_STRING )
                    // InternalJsonParser.g:1092:5: lv_stringValue_0_0= RULE_STRING
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
                    // InternalJsonParser.g:1109:3: ( (lv_integerValue_1_0= RULE_INT ) )
                    {
                    // InternalJsonParser.g:1109:3: ( (lv_integerValue_1_0= RULE_INT ) )
                    // InternalJsonParser.g:1110:4: (lv_integerValue_1_0= RULE_INT )
                    {
                    // InternalJsonParser.g:1110:4: (lv_integerValue_1_0= RULE_INT )
                    // InternalJsonParser.g:1111:5: lv_integerValue_1_0= RULE_INT
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
                    // InternalJsonParser.g:1128:3: ( (lv_array_2_0= ruleArray ) )
                    {
                    // InternalJsonParser.g:1128:3: ( (lv_array_2_0= ruleArray ) )
                    // InternalJsonParser.g:1129:4: (lv_array_2_0= ruleArray )
                    {
                    // InternalJsonParser.g:1129:4: (lv_array_2_0= ruleArray )
                    // InternalJsonParser.g:1130:5: lv_array_2_0= ruleArray
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
    // InternalJsonParser.g:1151:1: entryRuleArray returns [String current=null] : iv_ruleArray= ruleArray EOF ;
    public final String entryRuleArray() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArray = null;


        try {
            // InternalJsonParser.g:1151:45: (iv_ruleArray= ruleArray EOF )
            // InternalJsonParser.g:1152:2: iv_ruleArray= ruleArray EOF
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
    // InternalJsonParser.g:1158:1: ruleArray returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '[' (this_INT_1= RULE_INT )* ) | ( (this_STRING_2= RULE_STRING )* kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken ruleArray() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalJsonParser.g:1164:2: ( ( (kw= '[' (this_INT_1= RULE_INT )* ) | ( (this_STRING_2= RULE_STRING )* kw= ']' ) ) )
            // InternalJsonParser.g:1165:2: ( (kw= '[' (this_INT_1= RULE_INT )* ) | ( (this_STRING_2= RULE_STRING )* kw= ']' ) )
            {
            // InternalJsonParser.g:1165:2: ( (kw= '[' (this_INT_1= RULE_INT )* ) | ( (this_STRING_2= RULE_STRING )* kw= ']' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING||LA7_0==28) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalJsonParser.g:1166:3: (kw= '[' (this_INT_1= RULE_INT )* )
                    {
                    // InternalJsonParser.g:1166:3: (kw= '[' (this_INT_1= RULE_INT )* )
                    // InternalJsonParser.g:1167:4: kw= '[' (this_INT_1= RULE_INT )*
                    {
                    kw=(Token)match(input,27,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalJsonParser.g:1172:4: (this_INT_1= RULE_INT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_INT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalJsonParser.g:1173:5: this_INT_1= RULE_INT
                    	    {
                    	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_13); 

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
                    // InternalJsonParser.g:1183:3: ( (this_STRING_2= RULE_STRING )* kw= ']' )
                    {
                    // InternalJsonParser.g:1183:3: ( (this_STRING_2= RULE_STRING )* kw= ']' )
                    // InternalJsonParser.g:1184:4: (this_STRING_2= RULE_STRING )* kw= ']'
                    {
                    // InternalJsonParser.g:1184:4: (this_STRING_2= RULE_STRING )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_STRING) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalJsonParser.g:1185:5: this_STRING_2= RULE_STRING
                    	    {
                    	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    	    					current.merge(this_STRING_2);
                    	    				

                    	    					newLeafNode(this_STRING_2, grammarAccess.getArrayAccess().getSTRINGTerminalRuleCall_1_0());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    kw=(Token)match(input,28,FOLLOW_2); 

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
    // InternalJsonParser.g:1203:1: entryRuleEOL returns [String current=null] : iv_ruleEOL= ruleEOL EOF ;
    public final String entryRuleEOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEOL = null;


        try {
            // InternalJsonParser.g:1203:43: (iv_ruleEOL= ruleEOL EOF )
            // InternalJsonParser.g:1204:2: iv_ruleEOL= ruleEOL EOF
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
    // InternalJsonParser.g:1210:1: ruleEOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\n' ;
    public final AntlrDatatypeRuleToken ruleEOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJsonParser.g:1216:2: (kw= '\\n' )
            // InternalJsonParser.g:1217:2: kw= '\\n'
            {
            kw=(Token)match(input,29,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000056FA002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000018000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000020L});

}