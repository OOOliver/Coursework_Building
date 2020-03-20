package kcl.ac.uk.jian.building.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import kcl.ac.uk.jian.building.services.BuildingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBuildingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "'('", "')'", "'paint'", "'the'", "'['", "']'", "'floor'", "'add'", "'windows'", "'to'", "'times'", "'do'", "'end'", "'+'", "'-'", "'*'", "'/'", "'.'", "'aboveground'", "'underground'"
    };
    public static final int RULE_STRING=6;
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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


        public InternalBuildingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBuildingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBuildingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBuilding.g"; }



     	private BuildingGrammarAccess grammarAccess;

        public InternalBuildingParser(TokenStream input, BuildingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BuildingProgram";
       	}

       	@Override
       	protected BuildingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBuildingProgram"
    // InternalBuilding.g:65:1: entryRuleBuildingProgram returns [EObject current=null] : iv_ruleBuildingProgram= ruleBuildingProgram EOF ;
    public final EObject entryRuleBuildingProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildingProgram = null;


        try {
            // InternalBuilding.g:65:56: (iv_ruleBuildingProgram= ruleBuildingProgram EOF )
            // InternalBuilding.g:66:2: iv_ruleBuildingProgram= ruleBuildingProgram EOF
            {
             newCompositeNode(grammarAccess.getBuildingProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuildingProgram=ruleBuildingProgram();

            state._fsp--;

             current =iv_ruleBuildingProgram; 
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
    // $ANTLR end "entryRuleBuildingProgram"


    // $ANTLR start "ruleBuildingProgram"
    // InternalBuilding.g:72:1: ruleBuildingProgram returns [EObject current=null] : ( (lv_processes_0_0= ruleProcess ) )* ;
    public final EObject ruleBuildingProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_processes_0_0 = null;



        	enterRule();

        try {
            // InternalBuilding.g:78:2: ( ( (lv_processes_0_0= ruleProcess ) )* )
            // InternalBuilding.g:79:2: ( (lv_processes_0_0= ruleProcess ) )*
            {
            // InternalBuilding.g:79:2: ( (lv_processes_0_0= ruleProcess ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==11||LA1_0==13||LA1_0==15||LA1_0==20||(LA1_0>=30 && LA1_0<=32)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBuilding.g:80:3: (lv_processes_0_0= ruleProcess )
            	    {
            	    // InternalBuilding.g:80:3: (lv_processes_0_0= ruleProcess )
            	    // InternalBuilding.g:81:4: lv_processes_0_0= ruleProcess
            	    {

            	    				newCompositeNode(grammarAccess.getBuildingProgramAccess().getProcessesProcessParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_processes_0_0=ruleProcess();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getBuildingProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"processes",
            	    					lv_processes_0_0,
            	    					"kcl.ac.uk.jian.building.Building.Process");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleBuildingProgram"


    // $ANTLR start "entryRuleProcess"
    // InternalBuilding.g:101:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalBuilding.g:101:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalBuilding.g:102:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalBuilding.g:108:1: ruleProcess returns [EObject current=null] : (this_AddFloorProcess_0= ruleAddFloorProcess | this_PaintProcess_1= rulePaintProcess | this_AddWindowProcess_2= ruleAddWindowProcess | this_VariableDeclaration_3= ruleVariableDeclaration | this_Loop_4= ruleLoop ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        EObject this_AddFloorProcess_0 = null;

        EObject this_PaintProcess_1 = null;

        EObject this_AddWindowProcess_2 = null;

        EObject this_VariableDeclaration_3 = null;

        EObject this_Loop_4 = null;



        	enterRule();

        try {
            // InternalBuilding.g:114:2: ( (this_AddFloorProcess_0= ruleAddFloorProcess | this_PaintProcess_1= rulePaintProcess | this_AddWindowProcess_2= ruleAddWindowProcess | this_VariableDeclaration_3= ruleVariableDeclaration | this_Loop_4= ruleLoop ) )
            // InternalBuilding.g:115:2: (this_AddFloorProcess_0= ruleAddFloorProcess | this_PaintProcess_1= rulePaintProcess | this_AddWindowProcess_2= ruleAddWindowProcess | this_VariableDeclaration_3= ruleVariableDeclaration | this_Loop_4= ruleLoop )
            {
            // InternalBuilding.g:115:2: (this_AddFloorProcess_0= ruleAddFloorProcess | this_PaintProcess_1= rulePaintProcess | this_AddWindowProcess_2= ruleAddWindowProcess | this_VariableDeclaration_3= ruleVariableDeclaration | this_Loop_4= ruleLoop )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 31:
            case 32:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 11:
                {
                alt2=4;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 13:
            case 30:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBuilding.g:116:3: this_AddFloorProcess_0= ruleAddFloorProcess
                    {

                    			newCompositeNode(grammarAccess.getProcessAccess().getAddFloorProcessParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddFloorProcess_0=ruleAddFloorProcess();

                    state._fsp--;


                    			current = this_AddFloorProcess_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBuilding.g:125:3: this_PaintProcess_1= rulePaintProcess
                    {

                    			newCompositeNode(grammarAccess.getProcessAccess().getPaintProcessParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PaintProcess_1=rulePaintProcess();

                    state._fsp--;


                    			current = this_PaintProcess_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBuilding.g:134:3: this_AddWindowProcess_2= ruleAddWindowProcess
                    {

                    			newCompositeNode(grammarAccess.getProcessAccess().getAddWindowProcessParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddWindowProcess_2=ruleAddWindowProcess();

                    state._fsp--;


                    			current = this_AddWindowProcess_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBuilding.g:143:3: this_VariableDeclaration_3= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getProcessAccess().getVariableDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_3=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBuilding.g:152:3: this_Loop_4= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getProcessAccess().getLoopParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_4=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_4;
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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalBuilding.g:164:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalBuilding.g:164:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalBuilding.g:165:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalBuilding.g:171:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalBuilding.g:177:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalBuilding.g:178:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalBuilding.g:178:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalBuilding.g:179:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalBuilding.g:183:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBuilding.g:184:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBuilding.g:184:4: (lv_name_1_0= RULE_ID )
            // InternalBuilding.g:185:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalBuilding.g:205:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalBuilding.g:206:4: (lv_value_3_0= RULE_INT )
            {
            // InternalBuilding.g:206:4: (lv_value_3_0= RULE_INT )
            // InternalBuilding.g:207:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleAddFloorProcess"
    // InternalBuilding.g:227:1: entryRuleAddFloorProcess returns [EObject current=null] : iv_ruleAddFloorProcess= ruleAddFloorProcess EOF ;
    public final EObject entryRuleAddFloorProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddFloorProcess = null;


        try {
            // InternalBuilding.g:227:56: (iv_ruleAddFloorProcess= ruleAddFloorProcess EOF )
            // InternalBuilding.g:228:2: iv_ruleAddFloorProcess= ruleAddFloorProcess EOF
            {
             newCompositeNode(grammarAccess.getAddFloorProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddFloorProcess=ruleAddFloorProcess();

            state._fsp--;

             current =iv_ruleAddFloorProcess; 
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
    // $ANTLR end "entryRuleAddFloorProcess"


    // $ANTLR start "ruleAddFloorProcess"
    // InternalBuilding.g:234:1: ruleAddFloorProcess returns [EObject current=null] : ( ( (lv_structure_0_0= ruleWholeStructure ) ) otherlv_1= '(' ( (lv_levels_2_0= ruleAddition ) ) otherlv_3= ')' ) ;
    public final EObject ruleAddFloorProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_structure_0_0 = null;

        EObject lv_levels_2_0 = null;



        	enterRule();

        try {
            // InternalBuilding.g:240:2: ( ( ( (lv_structure_0_0= ruleWholeStructure ) ) otherlv_1= '(' ( (lv_levels_2_0= ruleAddition ) ) otherlv_3= ')' ) )
            // InternalBuilding.g:241:2: ( ( (lv_structure_0_0= ruleWholeStructure ) ) otherlv_1= '(' ( (lv_levels_2_0= ruleAddition ) ) otherlv_3= ')' )
            {
            // InternalBuilding.g:241:2: ( ( (lv_structure_0_0= ruleWholeStructure ) ) otherlv_1= '(' ( (lv_levels_2_0= ruleAddition ) ) otherlv_3= ')' )
            // InternalBuilding.g:242:3: ( (lv_structure_0_0= ruleWholeStructure ) ) otherlv_1= '(' ( (lv_levels_2_0= ruleAddition ) ) otherlv_3= ')'
            {
            // InternalBuilding.g:242:3: ( (lv_structure_0_0= ruleWholeStructure ) )
            // InternalBuilding.g:243:4: (lv_structure_0_0= ruleWholeStructure )
            {
            // InternalBuilding.g:243:4: (lv_structure_0_0= ruleWholeStructure )
            // InternalBuilding.g:244:5: lv_structure_0_0= ruleWholeStructure
            {

            					newCompositeNode(grammarAccess.getAddFloorProcessAccess().getStructureWholeStructureEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_structure_0_0=ruleWholeStructure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddFloorProcessRule());
            					}
            					set(
            						current,
            						"structure",
            						lv_structure_0_0,
            						"kcl.ac.uk.jian.building.Building.WholeStructure");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAddFloorProcessAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBuilding.g:265:3: ( (lv_levels_2_0= ruleAddition ) )
            // InternalBuilding.g:266:4: (lv_levels_2_0= ruleAddition )
            {
            // InternalBuilding.g:266:4: (lv_levels_2_0= ruleAddition )
            // InternalBuilding.g:267:5: lv_levels_2_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getAddFloorProcessAccess().getLevelsAdditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_levels_2_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddFloorProcessRule());
            					}
            					set(
            						current,
            						"levels",
            						lv_levels_2_0,
            						"kcl.ac.uk.jian.building.Building.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAddFloorProcessAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleAddFloorProcess"


    // $ANTLR start "entryRulePaintProcess"
    // InternalBuilding.g:292:1: entryRulePaintProcess returns [EObject current=null] : iv_rulePaintProcess= rulePaintProcess EOF ;
    public final EObject entryRulePaintProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaintProcess = null;


        try {
            // InternalBuilding.g:292:53: (iv_rulePaintProcess= rulePaintProcess EOF )
            // InternalBuilding.g:293:2: iv_rulePaintProcess= rulePaintProcess EOF
            {
             newCompositeNode(grammarAccess.getPaintProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePaintProcess=rulePaintProcess();

            state._fsp--;

             current =iv_rulePaintProcess; 
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
    // $ANTLR end "entryRulePaintProcess"


    // $ANTLR start "rulePaintProcess"
    // InternalBuilding.g:299:1: rulePaintProcess returns [EObject current=null] : (otherlv_0= 'paint' otherlv_1= 'the' otherlv_2= '[' ( (lv_levels_3_0= ruleAddition ) ) otherlv_4= ']' otherlv_5= 'floor' ( (lv_color_6_0= RULE_ID ) ) ) ;
    public final EObject rulePaintProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_color_6_0=null;
        EObject lv_levels_3_0 = null;



        	enterRule();

        try {
            // InternalBuilding.g:305:2: ( (otherlv_0= 'paint' otherlv_1= 'the' otherlv_2= '[' ( (lv_levels_3_0= ruleAddition ) ) otherlv_4= ']' otherlv_5= 'floor' ( (lv_color_6_0= RULE_ID ) ) ) )
            // InternalBuilding.g:306:2: (otherlv_0= 'paint' otherlv_1= 'the' otherlv_2= '[' ( (lv_levels_3_0= ruleAddition ) ) otherlv_4= ']' otherlv_5= 'floor' ( (lv_color_6_0= RULE_ID ) ) )
            {
            // InternalBuilding.g:306:2: (otherlv_0= 'paint' otherlv_1= 'the' otherlv_2= '[' ( (lv_levels_3_0= ruleAddition ) ) otherlv_4= ']' otherlv_5= 'floor' ( (lv_color_6_0= RULE_ID ) ) )
            // InternalBuilding.g:307:3: otherlv_0= 'paint' otherlv_1= 'the' otherlv_2= '[' ( (lv_levels_3_0= ruleAddition ) ) otherlv_4= ']' otherlv_5= 'floor' ( (lv_color_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPaintProcessAccess().getPaintKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPaintProcessAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getPaintProcessAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalBuilding.g:319:3: ( (lv_levels_3_0= ruleAddition ) )
            // InternalBuilding.g:320:4: (lv_levels_3_0= ruleAddition )
            {
            // InternalBuilding.g:320:4: (lv_levels_3_0= ruleAddition )
            // InternalBuilding.g:321:5: lv_levels_3_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getPaintProcessAccess().getLevelsAdditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_levels_3_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPaintProcessRule());
            					}
            					set(
            						current,
            						"levels",
            						lv_levels_3_0,
            						"kcl.ac.uk.jian.building.Building.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getPaintProcessAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getPaintProcessAccess().getFloorKeyword_5());
            		
            // InternalBuilding.g:346:3: ( (lv_color_6_0= RULE_ID ) )
            // InternalBuilding.g:347:4: (lv_color_6_0= RULE_ID )
            {
            // InternalBuilding.g:347:4: (lv_color_6_0= RULE_ID )
            // InternalBuilding.g:348:5: lv_color_6_0= RULE_ID
            {
            lv_color_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_color_6_0, grammarAccess.getPaintProcessAccess().getColorIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPaintProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"color",
            						lv_color_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


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
    // $ANTLR end "rulePaintProcess"


    // $ANTLR start "entryRuleAddWindowProcess"
    // InternalBuilding.g:368:1: entryRuleAddWindowProcess returns [EObject current=null] : iv_ruleAddWindowProcess= ruleAddWindowProcess EOF ;
    public final EObject entryRuleAddWindowProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddWindowProcess = null;


        try {
            // InternalBuilding.g:368:57: (iv_ruleAddWindowProcess= ruleAddWindowProcess EOF )
            // InternalBuilding.g:369:2: iv_ruleAddWindowProcess= ruleAddWindowProcess EOF
            {
             newCompositeNode(grammarAccess.getAddWindowProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddWindowProcess=ruleAddWindowProcess();

            state._fsp--;

             current =iv_ruleAddWindowProcess; 
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
    // $ANTLR end "entryRuleAddWindowProcess"


    // $ANTLR start "ruleAddWindowProcess"
    // InternalBuilding.g:375:1: ruleAddWindowProcess returns [EObject current=null] : (otherlv_0= 'add' ( (lv_num_1_0= ruleAddition ) ) otherlv_2= 'windows' otherlv_3= 'to' otherlv_4= '[' ( (lv_levels_5_0= ruleAddition ) ) otherlv_6= ']' otherlv_7= 'floor' ) ;
    public final EObject ruleAddWindowProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_num_1_0 = null;

        EObject lv_levels_5_0 = null;



        	enterRule();

        try {
            // InternalBuilding.g:381:2: ( (otherlv_0= 'add' ( (lv_num_1_0= ruleAddition ) ) otherlv_2= 'windows' otherlv_3= 'to' otherlv_4= '[' ( (lv_levels_5_0= ruleAddition ) ) otherlv_6= ']' otherlv_7= 'floor' ) )
            // InternalBuilding.g:382:2: (otherlv_0= 'add' ( (lv_num_1_0= ruleAddition ) ) otherlv_2= 'windows' otherlv_3= 'to' otherlv_4= '[' ( (lv_levels_5_0= ruleAddition ) ) otherlv_6= ']' otherlv_7= 'floor' )
            {
            // InternalBuilding.g:382:2: (otherlv_0= 'add' ( (lv_num_1_0= ruleAddition ) ) otherlv_2= 'windows' otherlv_3= 'to' otherlv_4= '[' ( (lv_levels_5_0= ruleAddition ) ) otherlv_6= ']' otherlv_7= 'floor' )
            // InternalBuilding.g:383:3: otherlv_0= 'add' ( (lv_num_1_0= ruleAddition ) ) otherlv_2= 'windows' otherlv_3= 'to' otherlv_4= '[' ( (lv_levels_5_0= ruleAddition ) ) otherlv_6= ']' otherlv_7= 'floor'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getAddWindowProcessAccess().getAddKeyword_0());
            		
            // InternalBuilding.g:387:3: ( (lv_num_1_0= ruleAddition ) )
            // InternalBuilding.g:388:4: (lv_num_1_0= ruleAddition )
            {
            // InternalBuilding.g:388:4: (lv_num_1_0= ruleAddition )
            // InternalBuilding.g:389:5: lv_num_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getAddWindowProcessAccess().getNumAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_num_1_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddWindowProcessRule());
            					}
            					set(
            						current,
            						"num",
            						lv_num_1_0,
            						"kcl.ac.uk.jian.building.Building.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getAddWindowProcessAccess().getWindowsKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getAddWindowProcessAccess().getToKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getAddWindowProcessAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalBuilding.g:418:3: ( (lv_levels_5_0= ruleAddition ) )
            // InternalBuilding.g:419:4: (lv_levels_5_0= ruleAddition )
            {
            // InternalBuilding.g:419:4: (lv_levels_5_0= ruleAddition )
            // InternalBuilding.g:420:5: lv_levels_5_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getAddWindowProcessAccess().getLevelsAdditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_levels_5_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddWindowProcessRule());
            					}
            					set(
            						current,
            						"levels",
            						lv_levels_5_0,
            						"kcl.ac.uk.jian.building.Building.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getAddWindowProcessAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAddWindowProcessAccess().getFloorKeyword_7());
            		

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
    // $ANTLR end "ruleAddWindowProcess"


    // $ANTLR start "entryRuleLoop"
    // InternalBuilding.g:449:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalBuilding.g:449:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalBuilding.g:450:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalBuilding.g:456:1: ruleLoop returns [EObject current=null] : ( ( (lv_count_0_0= ruleAddition ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_processes_3_0= ruleProcess ) )+ otherlv_4= 'end' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_count_0_0 = null;

        EObject lv_processes_3_0 = null;



        	enterRule();

        try {
            // InternalBuilding.g:462:2: ( ( ( (lv_count_0_0= ruleAddition ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_processes_3_0= ruleProcess ) )+ otherlv_4= 'end' ) )
            // InternalBuilding.g:463:2: ( ( (lv_count_0_0= ruleAddition ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_processes_3_0= ruleProcess ) )+ otherlv_4= 'end' )
            {
            // InternalBuilding.g:463:2: ( ( (lv_count_0_0= ruleAddition ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_processes_3_0= ruleProcess ) )+ otherlv_4= 'end' )
            // InternalBuilding.g:464:3: ( (lv_count_0_0= ruleAddition ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_processes_3_0= ruleProcess ) )+ otherlv_4= 'end'
            {
            // InternalBuilding.g:464:3: ( (lv_count_0_0= ruleAddition ) )
            // InternalBuilding.g:465:4: (lv_count_0_0= ruleAddition )
            {
            // InternalBuilding.g:465:4: (lv_count_0_0= ruleAddition )
            // InternalBuilding.g:466:5: lv_count_0_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getCountAdditionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_count_0_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					set(
            						current,
            						"count",
            						lv_count_0_0,
            						"kcl.ac.uk.jian.building.Building.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getTimesKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getDoKeyword_2());
            		
            // InternalBuilding.g:491:3: ( (lv_processes_3_0= ruleProcess ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||LA3_0==11||LA3_0==13||LA3_0==15||LA3_0==20||(LA3_0>=30 && LA3_0<=32)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBuilding.g:492:4: (lv_processes_3_0= ruleProcess )
            	    {
            	    // InternalBuilding.g:492:4: (lv_processes_3_0= ruleProcess )
            	    // InternalBuilding.g:493:5: lv_processes_3_0= ruleProcess
            	    {

            	    					newCompositeNode(grammarAccess.getLoopAccess().getProcessesProcessParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_processes_3_0=ruleProcess();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoopRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processes",
            	    						lv_processes_3_0,
            	    						"kcl.ac.uk.jian.building.Building.Process");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getEndKeyword_4());
            		

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleAddition"
    // InternalBuilding.g:518:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalBuilding.g:518:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalBuilding.g:519:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalBuilding.g:525:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBuilding.g:531:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalBuilding.g:532:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalBuilding.g:532:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalBuilding.g:533:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBuilding.g:541:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=26 && LA5_0<=27)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBuilding.g:542:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalBuilding.g:542:4: ()
            	    // InternalBuilding.g:543:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBuilding.g:549:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalBuilding.g:550:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalBuilding.g:550:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalBuilding.g:551:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalBuilding.g:551:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==26) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==27) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalBuilding.g:552:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,26,FOLLOW_22); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalBuilding.g:563:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,27,FOLLOW_22); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalBuilding.g:576:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalBuilding.g:577:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalBuilding.g:577:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalBuilding.g:578:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"kcl.ac.uk.jian.building.Building.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalBuilding.g:600:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalBuilding.g:600:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalBuilding.g:601:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalBuilding.g:607:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBuilding.g:613:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalBuilding.g:614:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalBuilding.g:614:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalBuilding.g:615:3: this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBuilding.g:623:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=28 && LA7_0<=29)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBuilding.g:624:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalBuilding.g:624:4: ()
            	    // InternalBuilding.g:625:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBuilding.g:631:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalBuilding.g:632:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalBuilding.g:632:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalBuilding.g:633:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalBuilding.g:633:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==28) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==29) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalBuilding.g:634:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,28,FOLLOW_24); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalBuilding.g:645:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,29,FOLLOW_24); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalBuilding.g:658:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalBuilding.g:659:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalBuilding.g:659:5: (lv_right_3_0= rulePrimary )
            	    // InternalBuilding.g:660:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"kcl.ac.uk.jian.building.Building.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalBuilding.g:682:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalBuilding.g:682:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalBuilding.g:683:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalBuilding.g:689:1: rulePrimary returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_IntLiteral_0 = null;

        EObject this_IntVarExpression_1 = null;

        EObject this_RealLiteral_2 = null;

        EObject this_Addition_4 = null;



        	enterRule();

        try {
            // InternalBuilding.g:695:2: ( (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) ) )
            // InternalBuilding.g:696:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) )
            {
            // InternalBuilding.g:696:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral | (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==14||LA8_1==18||LA8_1==21||LA8_1==23||(LA8_1>=26 && LA8_1<=29)) ) {
                    alt8=1;
                }
                else if ( (LA8_1==30) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 30:
                {
                alt8=3;
                }
                break;
            case 13:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBuilding.g:697:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBuilding.g:706:3: this_IntVarExpression_1= ruleIntVarExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getIntVarExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntVarExpression_1=ruleIntVarExpression();

                    state._fsp--;


                    			current = this_IntVarExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBuilding.g:715:3: this_RealLiteral_2= ruleRealLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealLiteral_2=ruleRealLiteral();

                    state._fsp--;


                    			current = this_RealLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBuilding.g:724:3: (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' )
                    {
                    // InternalBuilding.g:724:3: (otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')' )
                    // InternalBuilding.g:725:4: otherlv_3= '(' this_Addition_4= ruleAddition otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_Addition_4=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalBuilding.g:746:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalBuilding.g:746:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalBuilding.g:747:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalBuilding.g:753:1: ruleIntLiteral returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalBuilding.g:759:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalBuilding.g:760:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalBuilding.g:760:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalBuilding.g:761:3: (lv_val_0_0= RULE_INT )
            {
            // InternalBuilding.g:761:3: (lv_val_0_0= RULE_INT )
            // InternalBuilding.g:762:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalBuilding.g:781:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalBuilding.g:781:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalBuilding.g:782:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
             newCompositeNode(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;

             current =iv_ruleRealLiteral; 
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
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalBuilding.g:788:1: ruleRealLiteral returns [EObject current=null] : ( (lv_val_0_0= ruleREAL ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalBuilding.g:794:2: ( ( (lv_val_0_0= ruleREAL ) ) )
            // InternalBuilding.g:795:2: ( (lv_val_0_0= ruleREAL ) )
            {
            // InternalBuilding.g:795:2: ( (lv_val_0_0= ruleREAL ) )
            // InternalBuilding.g:796:3: (lv_val_0_0= ruleREAL )
            {
            // InternalBuilding.g:796:3: (lv_val_0_0= ruleREAL )
            // InternalBuilding.g:797:4: lv_val_0_0= ruleREAL
            {

            				newCompositeNode(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_val_0_0=ruleREAL();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealLiteralRule());
            				}
            				set(
            					current,
            					"val",
            					lv_val_0_0,
            					"kcl.ac.uk.jian.building.Building.REAL");
            				afterParserOrEnumRuleCall();
            			

            }


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
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleIntVarExpression"
    // InternalBuilding.g:817:1: entryRuleIntVarExpression returns [EObject current=null] : iv_ruleIntVarExpression= ruleIntVarExpression EOF ;
    public final EObject entryRuleIntVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVarExpression = null;


        try {
            // InternalBuilding.g:817:57: (iv_ruleIntVarExpression= ruleIntVarExpression EOF )
            // InternalBuilding.g:818:2: iv_ruleIntVarExpression= ruleIntVarExpression EOF
            {
             newCompositeNode(grammarAccess.getIntVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntVarExpression=ruleIntVarExpression();

            state._fsp--;

             current =iv_ruleIntVarExpression; 
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
    // $ANTLR end "entryRuleIntVarExpression"


    // $ANTLR start "ruleIntVarExpression"
    // InternalBuilding.g:824:1: ruleIntVarExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleIntVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBuilding.g:830:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBuilding.g:831:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBuilding.g:831:2: ( (otherlv_0= RULE_ID ) )
            // InternalBuilding.g:832:3: (otherlv_0= RULE_ID )
            {
            // InternalBuilding.g:832:3: (otherlv_0= RULE_ID )
            // InternalBuilding.g:833:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntVarExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0());
            			

            }


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
    // $ANTLR end "ruleIntVarExpression"


    // $ANTLR start "entryRuleREAL"
    // InternalBuilding.g:847:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalBuilding.g:849:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalBuilding.g:850:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalBuilding.g:859:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalBuilding.g:866:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalBuilding.g:867:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalBuilding.g:867:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalBuilding.g:868:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalBuilding.g:868:3: (this_INT_0= RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBuilding.g:869:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,30,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "ruleWholeStructure"
    // InternalBuilding.g:896:1: ruleWholeStructure returns [Enumerator current=null] : ( (enumLiteral_0= 'aboveground' ) | (enumLiteral_1= 'underground' ) ) ;
    public final Enumerator ruleWholeStructure() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBuilding.g:902:2: ( ( (enumLiteral_0= 'aboveground' ) | (enumLiteral_1= 'underground' ) ) )
            // InternalBuilding.g:903:2: ( (enumLiteral_0= 'aboveground' ) | (enumLiteral_1= 'underground' ) )
            {
            // InternalBuilding.g:903:2: ( (enumLiteral_0= 'aboveground' ) | (enumLiteral_1= 'underground' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            else if ( (LA10_0==32) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBuilding.g:904:3: (enumLiteral_0= 'aboveground' )
                    {
                    // InternalBuilding.g:904:3: (enumLiteral_0= 'aboveground' )
                    // InternalBuilding.g:905:4: enumLiteral_0= 'aboveground'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getWholeStructureAccess().getAbovegroundEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWholeStructureAccess().getAbovegroundEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBuilding.g:912:3: (enumLiteral_1= 'underground' )
                    {
                    // InternalBuilding.g:912:3: (enumLiteral_1= 'underground' )
                    // InternalBuilding.g:913:4: enumLiteral_1= 'underground'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getWholeStructureAccess().getUndergroundEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWholeStructureAccess().getUndergroundEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleWholeStructure"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000001C010A832L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000001C010E830L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000001C014A830L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001C030A830L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000001C210A830L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000001CC10A830L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001F010A830L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});

}