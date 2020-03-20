package kcl.ac.uk.jian.building.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import kcl.ac.uk.jian.building.services.BuildingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBuildingParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'aboveground'", "'underground'", "'var'", "'='", "'('", "')'", "'paint'", "'the'", "'['", "']'", "'floor'", "'add'", "'windows'", "'to'", "'times'", "'do'", "'end'", "'.'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(BuildingGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleBuildingProgram"
    // InternalBuilding.g:53:1: entryRuleBuildingProgram : ruleBuildingProgram EOF ;
    public final void entryRuleBuildingProgram() throws RecognitionException {
        try {
            // InternalBuilding.g:54:1: ( ruleBuildingProgram EOF )
            // InternalBuilding.g:55:1: ruleBuildingProgram EOF
            {
             before(grammarAccess.getBuildingProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleBuildingProgram();

            state._fsp--;

             after(grammarAccess.getBuildingProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBuildingProgram"


    // $ANTLR start "ruleBuildingProgram"
    // InternalBuilding.g:62:1: ruleBuildingProgram : ( ( rule__BuildingProgram__ProcessesAssignment )* ) ;
    public final void ruleBuildingProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:66:2: ( ( ( rule__BuildingProgram__ProcessesAssignment )* ) )
            // InternalBuilding.g:67:2: ( ( rule__BuildingProgram__ProcessesAssignment )* )
            {
            // InternalBuilding.g:67:2: ( ( rule__BuildingProgram__ProcessesAssignment )* )
            // InternalBuilding.g:68:3: ( rule__BuildingProgram__ProcessesAssignment )*
            {
             before(grammarAccess.getBuildingProgramAccess().getProcessesAssignment()); 
            // InternalBuilding.g:69:3: ( rule__BuildingProgram__ProcessesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_ID)||(LA1_0>=15 && LA1_0<=17)||LA1_0==19||LA1_0==21||LA1_0==26||LA1_0==32) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBuilding.g:69:4: rule__BuildingProgram__ProcessesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__BuildingProgram__ProcessesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getBuildingProgramAccess().getProcessesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuildingProgram"


    // $ANTLR start "entryRuleProcess"
    // InternalBuilding.g:78:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalBuilding.g:79:1: ( ruleProcess EOF )
            // InternalBuilding.g:80:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalBuilding.g:87:1: ruleProcess : ( ( rule__Process__Alternatives ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:91:2: ( ( ( rule__Process__Alternatives ) ) )
            // InternalBuilding.g:92:2: ( ( rule__Process__Alternatives ) )
            {
            // InternalBuilding.g:92:2: ( ( rule__Process__Alternatives ) )
            // InternalBuilding.g:93:3: ( rule__Process__Alternatives )
            {
             before(grammarAccess.getProcessAccess().getAlternatives()); 
            // InternalBuilding.g:94:3: ( rule__Process__Alternatives )
            // InternalBuilding.g:94:4: rule__Process__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Process__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalBuilding.g:103:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalBuilding.g:104:1: ( ruleVariableDeclaration EOF )
            // InternalBuilding.g:105:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalBuilding.g:112:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:116:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalBuilding.g:117:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalBuilding.g:117:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalBuilding.g:118:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalBuilding.g:119:3: ( rule__VariableDeclaration__Group__0 )
            // InternalBuilding.g:119:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleAddFloorProcess"
    // InternalBuilding.g:128:1: entryRuleAddFloorProcess : ruleAddFloorProcess EOF ;
    public final void entryRuleAddFloorProcess() throws RecognitionException {
        try {
            // InternalBuilding.g:129:1: ( ruleAddFloorProcess EOF )
            // InternalBuilding.g:130:1: ruleAddFloorProcess EOF
            {
             before(grammarAccess.getAddFloorProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleAddFloorProcess();

            state._fsp--;

             after(grammarAccess.getAddFloorProcessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddFloorProcess"


    // $ANTLR start "ruleAddFloorProcess"
    // InternalBuilding.g:137:1: ruleAddFloorProcess : ( ( rule__AddFloorProcess__Group__0 ) ) ;
    public final void ruleAddFloorProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:141:2: ( ( ( rule__AddFloorProcess__Group__0 ) ) )
            // InternalBuilding.g:142:2: ( ( rule__AddFloorProcess__Group__0 ) )
            {
            // InternalBuilding.g:142:2: ( ( rule__AddFloorProcess__Group__0 ) )
            // InternalBuilding.g:143:3: ( rule__AddFloorProcess__Group__0 )
            {
             before(grammarAccess.getAddFloorProcessAccess().getGroup()); 
            // InternalBuilding.g:144:3: ( rule__AddFloorProcess__Group__0 )
            // InternalBuilding.g:144:4: rule__AddFloorProcess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddFloorProcess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddFloorProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddFloorProcess"


    // $ANTLR start "entryRulePaintProcess"
    // InternalBuilding.g:153:1: entryRulePaintProcess : rulePaintProcess EOF ;
    public final void entryRulePaintProcess() throws RecognitionException {
        try {
            // InternalBuilding.g:154:1: ( rulePaintProcess EOF )
            // InternalBuilding.g:155:1: rulePaintProcess EOF
            {
             before(grammarAccess.getPaintProcessRule()); 
            pushFollow(FOLLOW_1);
            rulePaintProcess();

            state._fsp--;

             after(grammarAccess.getPaintProcessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePaintProcess"


    // $ANTLR start "rulePaintProcess"
    // InternalBuilding.g:162:1: rulePaintProcess : ( ( rule__PaintProcess__Group__0 ) ) ;
    public final void rulePaintProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:166:2: ( ( ( rule__PaintProcess__Group__0 ) ) )
            // InternalBuilding.g:167:2: ( ( rule__PaintProcess__Group__0 ) )
            {
            // InternalBuilding.g:167:2: ( ( rule__PaintProcess__Group__0 ) )
            // InternalBuilding.g:168:3: ( rule__PaintProcess__Group__0 )
            {
             before(grammarAccess.getPaintProcessAccess().getGroup()); 
            // InternalBuilding.g:169:3: ( rule__PaintProcess__Group__0 )
            // InternalBuilding.g:169:4: rule__PaintProcess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PaintProcess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaintProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePaintProcess"


    // $ANTLR start "entryRuleAddWindowProcess"
    // InternalBuilding.g:178:1: entryRuleAddWindowProcess : ruleAddWindowProcess EOF ;
    public final void entryRuleAddWindowProcess() throws RecognitionException {
        try {
            // InternalBuilding.g:179:1: ( ruleAddWindowProcess EOF )
            // InternalBuilding.g:180:1: ruleAddWindowProcess EOF
            {
             before(grammarAccess.getAddWindowProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleAddWindowProcess();

            state._fsp--;

             after(grammarAccess.getAddWindowProcessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddWindowProcess"


    // $ANTLR start "ruleAddWindowProcess"
    // InternalBuilding.g:187:1: ruleAddWindowProcess : ( ( rule__AddWindowProcess__Group__0 ) ) ;
    public final void ruleAddWindowProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:191:2: ( ( ( rule__AddWindowProcess__Group__0 ) ) )
            // InternalBuilding.g:192:2: ( ( rule__AddWindowProcess__Group__0 ) )
            {
            // InternalBuilding.g:192:2: ( ( rule__AddWindowProcess__Group__0 ) )
            // InternalBuilding.g:193:3: ( rule__AddWindowProcess__Group__0 )
            {
             before(grammarAccess.getAddWindowProcessAccess().getGroup()); 
            // InternalBuilding.g:194:3: ( rule__AddWindowProcess__Group__0 )
            // InternalBuilding.g:194:4: rule__AddWindowProcess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddWindowProcess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddWindowProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddWindowProcess"


    // $ANTLR start "entryRuleLoop"
    // InternalBuilding.g:203:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalBuilding.g:204:1: ( ruleLoop EOF )
            // InternalBuilding.g:205:1: ruleLoop EOF
            {
             before(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getLoopRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalBuilding.g:212:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:216:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalBuilding.g:217:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalBuilding.g:217:2: ( ( rule__Loop__Group__0 ) )
            // InternalBuilding.g:218:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalBuilding.g:219:3: ( rule__Loop__Group__0 )
            // InternalBuilding.g:219:4: rule__Loop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleAddition"
    // InternalBuilding.g:228:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalBuilding.g:229:1: ( ruleAddition EOF )
            // InternalBuilding.g:230:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalBuilding.g:237:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:241:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalBuilding.g:242:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalBuilding.g:242:2: ( ( rule__Addition__Group__0 ) )
            // InternalBuilding.g:243:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalBuilding.g:244:3: ( rule__Addition__Group__0 )
            // InternalBuilding.g:244:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalBuilding.g:253:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalBuilding.g:254:1: ( ruleMultiplication EOF )
            // InternalBuilding.g:255:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalBuilding.g:262:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:266:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalBuilding.g:267:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalBuilding.g:267:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalBuilding.g:268:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalBuilding.g:269:3: ( rule__Multiplication__Group__0 )
            // InternalBuilding.g:269:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalBuilding.g:278:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalBuilding.g:279:1: ( rulePrimary EOF )
            // InternalBuilding.g:280:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalBuilding.g:287:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:291:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalBuilding.g:292:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalBuilding.g:292:2: ( ( rule__Primary__Alternatives ) )
            // InternalBuilding.g:293:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalBuilding.g:294:3: ( rule__Primary__Alternatives )
            // InternalBuilding.g:294:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalBuilding.g:303:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalBuilding.g:304:1: ( ruleIntLiteral EOF )
            // InternalBuilding.g:305:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalBuilding.g:312:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:316:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalBuilding.g:317:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalBuilding.g:317:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalBuilding.g:318:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalBuilding.g:319:3: ( rule__IntLiteral__ValAssignment )
            // InternalBuilding.g:319:4: rule__IntLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalBuilding.g:328:1: entryRuleRealLiteral : ruleRealLiteral EOF ;
    public final void entryRuleRealLiteral() throws RecognitionException {
        try {
            // InternalBuilding.g:329:1: ( ruleRealLiteral EOF )
            // InternalBuilding.g:330:1: ruleRealLiteral EOF
            {
             before(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleRealLiteral();

            state._fsp--;

             after(grammarAccess.getRealLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalBuilding.g:337:1: ruleRealLiteral : ( ( rule__RealLiteral__ValAssignment ) ) ;
    public final void ruleRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:341:2: ( ( ( rule__RealLiteral__ValAssignment ) ) )
            // InternalBuilding.g:342:2: ( ( rule__RealLiteral__ValAssignment ) )
            {
            // InternalBuilding.g:342:2: ( ( rule__RealLiteral__ValAssignment ) )
            // InternalBuilding.g:343:3: ( rule__RealLiteral__ValAssignment )
            {
             before(grammarAccess.getRealLiteralAccess().getValAssignment()); 
            // InternalBuilding.g:344:3: ( rule__RealLiteral__ValAssignment )
            // InternalBuilding.g:344:4: rule__RealLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RealLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRealLiteralAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleIntVarExpression"
    // InternalBuilding.g:353:1: entryRuleIntVarExpression : ruleIntVarExpression EOF ;
    public final void entryRuleIntVarExpression() throws RecognitionException {
        try {
            // InternalBuilding.g:354:1: ( ruleIntVarExpression EOF )
            // InternalBuilding.g:355:1: ruleIntVarExpression EOF
            {
             before(grammarAccess.getIntVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleIntVarExpression();

            state._fsp--;

             after(grammarAccess.getIntVarExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntVarExpression"


    // $ANTLR start "ruleIntVarExpression"
    // InternalBuilding.g:362:1: ruleIntVarExpression : ( ( rule__IntVarExpression__VarAssignment ) ) ;
    public final void ruleIntVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:366:2: ( ( ( rule__IntVarExpression__VarAssignment ) ) )
            // InternalBuilding.g:367:2: ( ( rule__IntVarExpression__VarAssignment ) )
            {
            // InternalBuilding.g:367:2: ( ( rule__IntVarExpression__VarAssignment ) )
            // InternalBuilding.g:368:3: ( rule__IntVarExpression__VarAssignment )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 
            // InternalBuilding.g:369:3: ( rule__IntVarExpression__VarAssignment )
            // InternalBuilding.g:369:4: rule__IntVarExpression__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntVarExpression__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntVarExpression"


    // $ANTLR start "entryRuleREAL"
    // InternalBuilding.g:378:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalBuilding.g:382:1: ( ruleREAL EOF )
            // InternalBuilding.g:383:1: ruleREAL EOF
            {
             before(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getREALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalBuilding.g:393:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:398:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalBuilding.g:399:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalBuilding.g:399:2: ( ( rule__REAL__Group__0 ) )
            // InternalBuilding.g:400:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalBuilding.g:401:3: ( rule__REAL__Group__0 )
            // InternalBuilding.g:401:4: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "ruleWholeStructure"
    // InternalBuilding.g:411:1: ruleWholeStructure : ( ( rule__WholeStructure__Alternatives ) ) ;
    public final void ruleWholeStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:415:1: ( ( ( rule__WholeStructure__Alternatives ) ) )
            // InternalBuilding.g:416:2: ( ( rule__WholeStructure__Alternatives ) )
            {
            // InternalBuilding.g:416:2: ( ( rule__WholeStructure__Alternatives ) )
            // InternalBuilding.g:417:3: ( rule__WholeStructure__Alternatives )
            {
             before(grammarAccess.getWholeStructureAccess().getAlternatives()); 
            // InternalBuilding.g:418:3: ( rule__WholeStructure__Alternatives )
            // InternalBuilding.g:418:4: rule__WholeStructure__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WholeStructure__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWholeStructureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWholeStructure"


    // $ANTLR start "rule__Process__Alternatives"
    // InternalBuilding.g:426:1: rule__Process__Alternatives : ( ( ruleAddFloorProcess ) | ( rulePaintProcess ) | ( ruleAddWindowProcess ) | ( ruleVariableDeclaration ) | ( ruleLoop ) );
    public final void rule__Process__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:430:1: ( ( ruleAddFloorProcess ) | ( rulePaintProcess ) | ( ruleAddWindowProcess ) | ( ruleVariableDeclaration ) | ( ruleLoop ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case RULE_INT:
            case RULE_ID:
            case 19:
            case 32:
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
                    // InternalBuilding.g:431:2: ( ruleAddFloorProcess )
                    {
                    // InternalBuilding.g:431:2: ( ruleAddFloorProcess )
                    // InternalBuilding.g:432:3: ruleAddFloorProcess
                    {
                     before(grammarAccess.getProcessAccess().getAddFloorProcessParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAddFloorProcess();

                    state._fsp--;

                     after(grammarAccess.getProcessAccess().getAddFloorProcessParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBuilding.g:437:2: ( rulePaintProcess )
                    {
                    // InternalBuilding.g:437:2: ( rulePaintProcess )
                    // InternalBuilding.g:438:3: rulePaintProcess
                    {
                     before(grammarAccess.getProcessAccess().getPaintProcessParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePaintProcess();

                    state._fsp--;

                     after(grammarAccess.getProcessAccess().getPaintProcessParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBuilding.g:443:2: ( ruleAddWindowProcess )
                    {
                    // InternalBuilding.g:443:2: ( ruleAddWindowProcess )
                    // InternalBuilding.g:444:3: ruleAddWindowProcess
                    {
                     before(grammarAccess.getProcessAccess().getAddWindowProcessParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAddWindowProcess();

                    state._fsp--;

                     after(grammarAccess.getProcessAccess().getAddWindowProcessParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBuilding.g:449:2: ( ruleVariableDeclaration )
                    {
                    // InternalBuilding.g:449:2: ( ruleVariableDeclaration )
                    // InternalBuilding.g:450:3: ruleVariableDeclaration
                    {
                     before(grammarAccess.getProcessAccess().getVariableDeclarationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getProcessAccess().getVariableDeclarationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBuilding.g:455:2: ( ruleLoop )
                    {
                    // InternalBuilding.g:455:2: ( ruleLoop )
                    // InternalBuilding.g:456:3: ruleLoop
                    {
                     before(grammarAccess.getProcessAccess().getLoopParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleLoop();

                    state._fsp--;

                     after(grammarAccess.getProcessAccess().getLoopParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Alternatives"


    // $ANTLR start "rule__Addition__OperatorAlternatives_1_1_0"
    // InternalBuilding.g:465:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:469:1: ( ( '+' ) | ( '-' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBuilding.g:470:2: ( '+' )
                    {
                    // InternalBuilding.g:470:2: ( '+' )
                    // InternalBuilding.g:471:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBuilding.g:476:2: ( '-' )
                    {
                    // InternalBuilding.g:476:2: ( '-' )
                    // InternalBuilding.g:477:3: '-'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Multiplication__OperatorAlternatives_1_1_0"
    // InternalBuilding.g:486:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:490:1: ( ( '*' ) | ( '/' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBuilding.g:491:2: ( '*' )
                    {
                    // InternalBuilding.g:491:2: ( '*' )
                    // InternalBuilding.g:492:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBuilding.g:497:2: ( '/' )
                    {
                    // InternalBuilding.g:497:2: ( '/' )
                    // InternalBuilding.g:498:3: '/'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalBuilding.g:507:1: rule__Primary__Alternatives : ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ruleRealLiteral ) | ( ( rule__Primary__Group_3__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:511:1: ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ruleRealLiteral ) | ( ( rule__Primary__Group_3__0 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||(LA5_1>=11 && LA5_1<=14)||LA5_1==20||LA5_1==24||LA5_1==27||LA5_1==29) ) {
                    alt5=1;
                }
                else if ( (LA5_1==32) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 32:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalBuilding.g:512:2: ( ruleIntLiteral )
                    {
                    // InternalBuilding.g:512:2: ( ruleIntLiteral )
                    // InternalBuilding.g:513:3: ruleIntLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIntLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBuilding.g:518:2: ( ruleIntVarExpression )
                    {
                    // InternalBuilding.g:518:2: ( ruleIntVarExpression )
                    // InternalBuilding.g:519:3: ruleIntVarExpression
                    {
                     before(grammarAccess.getPrimaryAccess().getIntVarExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntVarExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIntVarExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBuilding.g:524:2: ( ruleRealLiteral )
                    {
                    // InternalBuilding.g:524:2: ( ruleRealLiteral )
                    // InternalBuilding.g:525:3: ruleRealLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRealLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getRealLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBuilding.g:530:2: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // InternalBuilding.g:530:2: ( ( rule__Primary__Group_3__0 ) )
                    // InternalBuilding.g:531:3: ( rule__Primary__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    // InternalBuilding.g:532:3: ( rule__Primary__Group_3__0 )
                    // InternalBuilding.g:532:4: rule__Primary__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__WholeStructure__Alternatives"
    // InternalBuilding.g:540:1: rule__WholeStructure__Alternatives : ( ( ( 'aboveground' ) ) | ( ( 'underground' ) ) );
    public final void rule__WholeStructure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:544:1: ( ( ( 'aboveground' ) ) | ( ( 'underground' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBuilding.g:545:2: ( ( 'aboveground' ) )
                    {
                    // InternalBuilding.g:545:2: ( ( 'aboveground' ) )
                    // InternalBuilding.g:546:3: ( 'aboveground' )
                    {
                     before(grammarAccess.getWholeStructureAccess().getAbovegroundEnumLiteralDeclaration_0()); 
                    // InternalBuilding.g:547:3: ( 'aboveground' )
                    // InternalBuilding.g:547:4: 'aboveground'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getWholeStructureAccess().getAbovegroundEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBuilding.g:551:2: ( ( 'underground' ) )
                    {
                    // InternalBuilding.g:551:2: ( ( 'underground' ) )
                    // InternalBuilding.g:552:3: ( 'underground' )
                    {
                     before(grammarAccess.getWholeStructureAccess().getUndergroundEnumLiteralDeclaration_1()); 
                    // InternalBuilding.g:553:3: ( 'underground' )
                    // InternalBuilding.g:553:4: 'underground'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getWholeStructureAccess().getUndergroundEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WholeStructure__Alternatives"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalBuilding.g:561:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:565:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalBuilding.g:566:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalBuilding.g:573:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:577:1: ( ( 'var' ) )
            // InternalBuilding.g:578:1: ( 'var' )
            {
            // InternalBuilding.g:578:1: ( 'var' )
            // InternalBuilding.g:579:2: 'var'
            {
             before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalBuilding.g:588:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:592:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalBuilding.g:593:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalBuilding.g:600:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:604:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalBuilding.g:605:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalBuilding.g:605:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalBuilding.g:606:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalBuilding.g:607:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalBuilding.g:607:3: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalBuilding.g:615:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:619:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalBuilding.g:620:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalBuilding.g:627:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:631:1: ( ( '=' ) )
            // InternalBuilding.g:632:1: ( '=' )
            {
            // InternalBuilding.g:632:1: ( '=' )
            // InternalBuilding.g:633:2: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // InternalBuilding.g:642:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:646:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalBuilding.g:647:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // InternalBuilding.g:653:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:657:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalBuilding.g:658:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalBuilding.g:658:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalBuilding.g:659:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            // InternalBuilding.g:660:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalBuilding.g:660:3: rule__VariableDeclaration__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__AddFloorProcess__Group__0"
    // InternalBuilding.g:669:1: rule__AddFloorProcess__Group__0 : rule__AddFloorProcess__Group__0__Impl rule__AddFloorProcess__Group__1 ;
    public final void rule__AddFloorProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:673:1: ( rule__AddFloorProcess__Group__0__Impl rule__AddFloorProcess__Group__1 )
            // InternalBuilding.g:674:2: rule__AddFloorProcess__Group__0__Impl rule__AddFloorProcess__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__AddFloorProcess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddFloorProcess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFloorProcess__Group__0"


    // $ANTLR start "rule__AddFloorProcess__Group__0__Impl"
    // InternalBuilding.g:681:1: rule__AddFloorProcess__Group__0__Impl : ( ( rule__AddFloorProcess__StructureAssignment_0 ) ) ;
    public final void rule__AddFloorProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:685:1: ( ( ( rule__AddFloorProcess__StructureAssignment_0 ) ) )
            // InternalBuilding.g:686:1: ( ( rule__AddFloorProcess__StructureAssignment_0 ) )
            {
            // InternalBuilding.g:686:1: ( ( rule__AddFloorProcess__StructureAssignment_0 ) )
            // InternalBuilding.g:687:2: ( rule__AddFloorProcess__StructureAssignment_0 )
            {
             before(grammarAccess.getAddFloorProcessAccess().getStructureAssignment_0()); 
            // InternalBuilding.g:688:2: ( rule__AddFloorProcess__StructureAssignment_0 )
            // InternalBuilding.g:688:3: rule__AddFloorProcess__StructureAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AddFloorProcess__StructureAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAddFloorProcessAccess().getStructureAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFloorProcess__Group__0__Impl"


    // $ANTLR start "rule__AddFloorProcess__Group__1"
    // InternalBuilding.g:696:1: rule__AddFloorProcess__Group__1 : rule__AddFloorProcess__Group__1__Impl rule__AddFloorProcess__Group__2 ;
    public final void rule__AddFloorProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:700:1: ( rule__AddFloorProcess__Group__1__Impl rule__AddFloorProcess__Group__2 )
            // InternalBuilding.g:701:2: rule__AddFloorProcess__Group__1__Impl rule__AddFloorProcess__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AddFloorProcess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddFloorProcess__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFloorProcess__Group__1"


    // $ANTLR start "rule__AddFloorProcess__Group__1__Impl"
    // InternalBuilding.g:708:1: rule__AddFloorProcess__Group__1__Impl : ( '(' ) ;
    public final void rule__AddFloorProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:712:1: ( ( '(' ) )
            // InternalBuilding.g:713:1: ( '(' )
            {
            // InternalBuilding.g:713:1: ( '(' )
            // InternalBuilding.g:714:2: '('
            {
             before(grammarAccess.getAddFloorProcessAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAddFloorProcessAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFloorProcess__Group__1__Impl"


    // $ANTLR start "rule__AddFloorProcess__Group__2"
    // InternalBuilding.g:723:1: rule__AddFloorProcess__Group__2 : rule__AddFloorProcess__Group__2__Impl rule__AddFloorProcess__Group__3 ;
    public final void rule__AddFloorProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:727:1: ( rule__AddFloorProcess__Group__2__Impl rule__AddFloorProcess__Group__3 )
            // InternalBuilding.g:728:2: rule__AddFloorProcess__Group__2__Impl rule__AddFloorProcess__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__AddFloorProcess__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddFloorProcess__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFloorProcess__Group__2"


    // $ANTLR start "rule__AddFloorProcess__Group__2__Impl"
    // InternalBuilding.g:735:1: rule__AddFloorProcess__Group__2__Impl : ( ( rule__AddFloorProcess__LevelsAssignment_2 ) ) ;
    public final void rule__AddFloorProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:739:1: ( ( ( rule__AddFloorProcess__LevelsAssignment_2 ) ) )
            // InternalBuilding.g:740:1: ( ( rule__AddFloorProcess__LevelsAssignment_2 ) )
            {
            // InternalBuilding.g:740:1: ( ( rule__AddFloorProcess__LevelsAssignment_2 ) )
            // InternalBuilding.g:741:2: ( rule__AddFloorProcess__LevelsAssignment_2 )
            {
             before(grammarAccess.getAddFloorProcessAccess().getLevelsAssignment_2()); 
            // InternalBuilding.g:742:2: ( rule__AddFloorProcess__LevelsAssignment_2 )
            // InternalBuilding.g:742:3: rule__AddFloorProcess__LevelsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddFloorProcess__LevelsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddFloorProcessAccess().getLevelsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFloorProcess__Group__2__Impl"


    // $ANTLR start "rule__AddFloorProcess__Group__3"
    // InternalBuilding.g:750:1: rule__AddFloorProcess__Group__3 : rule__AddFloorProcess__Group__3__Impl ;
    public final void rule__AddFloorProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:754:1: ( rule__AddFloorProcess__Group__3__Impl )
            // InternalBuilding.g:755:2: rule__AddFloorProcess__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddFloorProcess__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFloorProcess__Group__3"


    // $ANTLR start "rule__AddFloorProcess__Group__3__Impl"
    // InternalBuilding.g:761:1: rule__AddFloorProcess__Group__3__Impl : ( ')' ) ;
    public final void rule__AddFloorProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:765:1: ( ( ')' ) )
            // InternalBuilding.g:766:1: ( ')' )
            {
            // InternalBuilding.g:766:1: ( ')' )
            // InternalBuilding.g:767:2: ')'
            {
             before(grammarAccess.getAddFloorProcessAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAddFloorProcessAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFloorProcess__Group__3__Impl"


    // $ANTLR start "rule__PaintProcess__Group__0"
    // InternalBuilding.g:777:1: rule__PaintProcess__Group__0 : rule__PaintProcess__Group__0__Impl rule__PaintProcess__Group__1 ;
    public final void rule__PaintProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:781:1: ( rule__PaintProcess__Group__0__Impl rule__PaintProcess__Group__1 )
            // InternalBuilding.g:782:2: rule__PaintProcess__Group__0__Impl rule__PaintProcess__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__PaintProcess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaintProcess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaintProcess__Group__0"


    // $ANTLR start "rule__PaintProcess__Group__0__Impl"
    // InternalBuilding.g:789:1: rule__PaintProcess__Group__0__Impl : ( 'paint' ) ;
    public final void rule__PaintProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:793:1: ( ( 'paint' ) )
            // InternalBuilding.g:794:1: ( 'paint' )
            {
            // InternalBuilding.g:794:1: ( 'paint' )
            // InternalBuilding.g:795:2: 'paint'
            {
             before(grammarAccess.getPaintProcessAccess().getPaintKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPaintProcessAccess().getPaintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaintProcess__Group__0__Impl"


    // $ANTLR start "rule__PaintProcess__Group__1"
    // InternalBuilding.g:804:1: rule__PaintProcess__Group__1 : rule__PaintProcess__Group__1__Impl rule__PaintProcess__Group__2 ;
    public final void rule__PaintProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:808:1: ( rule__PaintProcess__Group__1__Impl rule__PaintProcess__Group__2 )
            // InternalBuilding.g:809:2: rule__PaintProcess__Group__1__Impl rule__PaintProcess__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__PaintProcess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaintProcess__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaintProcess__Group__1"


    // $ANTLR start "rule__PaintProcess__Group__1__Impl"
    // InternalBuilding.g:816:1: rule__PaintProcess__Group__1__Impl : ( 'the' ) ;
    public final void rule__PaintProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:820:1: ( ( 'the' ) )
            // InternalBuilding.g:821:1: ( 'the' )
            {
            // InternalBuilding.g:821:1: ( 'the' )
            // InternalBuilding.g:822:2: 'the'
            {
             before(grammarAccess.getPaintProcessAccess().getTheKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPaintProcessAccess().getTheKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaintProcess__Group__1__Impl"


    // $ANTLR start "rule__PaintProcess__Group__2"
    // InternalBuilding.g:831:1: rule__PaintProcess__Group__2 : rule__PaintProcess__Group__2__Impl rule__PaintProcess__Group__3 ;
    public final void rule__PaintProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:835:1: ( rule__PaintProcess__Group__2__Impl rule__PaintProcess__Group__3 )
            // InternalBuilding.g:836:2: rule__PaintProcess__Group__2__Impl rule__PaintProcess__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__PaintProcess__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaintProcess__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaintProcess__Group__2"


    // $ANTLR start "rule__PaintProcess__Group__2__Impl"
    // InternalBuilding.g:843:1: rule__PaintProcess__Group__2__Impl : ( '[' ) ;
    public final void rule__PaintProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:847:1: ( ( '[' ) )
            // InternalBuilding.g:848:1: ( '[' )
            {
            // InternalBuilding.g:848:1: ( '[' )
            // InternalBuilding.g:849:2: '['
            {
             before(grammarAccess.getPaintProcessAccess().getLeftSquareBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPaintProcessAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaintProcess__Group__2__Impl"


    // $ANTLR start "rule__PaintProcess__Group__3"
    // InternalBuilding.g:858:1: rule__PaintProcess__Group__3 : rule__PaintProcess__Group__3__Impl rule__PaintProcess__Group__4 ;
    public final void rule__PaintProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:862:1: ( rule__PaintProcess__Group__3__Impl rule__PaintProcess__Group__4 )
            // InternalBuilding.g:863:2: rule__PaintProcess__Group__3__Impl rule__PaintProcess__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__PaintProcess__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaintProcess__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaintProcess__Group__3"


    // $ANTLR start "rule__PaintProcess__Group__3__Impl"
    // InternalBuilding.g:870:1: rule__PaintProcess__Group__3__Impl : ( ( rule__PaintProcess__LevelsAssignment_3 ) ) ;
    public final void rule__PaintProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:874:1: ( ( ( rule__PaintProcess__LevelsAssignment_3 ) ) )
            // InternalBuilding.g:875:1: ( ( rule__PaintProcess__LevelsAssignment_3 ) )
            {
            // InternalBuilding.g:875:1: ( ( rule__PaintProcess__LevelsAssignment_3 ) )
            // InternalBuilding.g:876:2: ( rule__PaintProcess__LevelsAssignment_3 )
            {
             before(grammarAccess.getPaintProcessAccess().getLevelsAssignment_3()); 
            // InternalBuilding.g:877:2: ( rule__PaintProcess__LevelsAssignment_3 )
            // InternalBuilding.g:877:3: rule__PaintProcess__LevelsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PaintProcess__LevelsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPaintProcessAccess().getLevelsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaintProcess__Group__3__Impl"


    // $ANTLR start "rule__PaintProcess__Group__4"
    // InternalBuilding.g:885:1: rule__PaintProcess__Group__4 : rule__PaintProcess__Group__4__Impl rule__PaintProcess__Group__5 ;
    public final void rule__PaintProcess__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:889:1: ( rule__PaintProcess__Group__4__Impl rule__PaintProcess__Group__5 )
            // InternalBuilding.g:890:2: rule__PaintProcess__Group__4__Impl rule__PaintProcess__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__PaintProcess__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaintProcess__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaintProcess__Group__4"


    // $ANTLR start "rule__PaintProcess__Group__4__Impl"
    // InternalBuilding.g:897:1: rule__PaintProcess__Group__4__Impl : ( ']' ) ;
    public final void rule__PaintProcess__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:901:1: ( ( ']' ) )
            // InternalBuilding.g:902:1: ( ']' )
            {
            // InternalBuilding.g:902:1: ( ']' )
            // InternalBuilding.g:903:2: ']'
            {
             before(grammarAccess.getPaintProcessAccess().getRightSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPaintProcessAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaintProcess__Group__4__Impl"


    // $ANTLR start "rule__PaintProcess__Group__5"
    // InternalBuilding.g:912:1: rule__PaintProcess__Group__5 : rule__PaintProcess__Group__5__Impl rule__PaintProcess__Group__6 ;
    public final void rule__PaintProcess__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:916:1: ( rule__PaintProcess__Group__5__Impl rule__PaintProcess__Group__6 )
            // InternalBuilding.g:917:2: rule__PaintProcess__Group__5__Impl rule__PaintProcess__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__PaintProcess__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaintProcess__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaintProcess__Group__5"


    // $ANTLR start "rule__PaintProcess__Group__5__Impl"
    // InternalBuilding.g:924:1: rule__PaintProcess__Group__5__Impl : ( 'floor' ) ;
    public final void rule__PaintProcess__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:928:1: ( ( 'floor' ) )
            // InternalBuilding.g:929:1: ( 'floor' )
            {
            // InternalBuilding.g:929:1: ( 'floor' )
            // InternalBuilding.g:930:2: 'floor'
            {
             before(grammarAccess.getPaintProcessAccess().getFloorKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPaintProcessAccess().getFloorKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaintProcess__Group__5__Impl"


    // $ANTLR start "rule__PaintProcess__Group__6"
    // InternalBuilding.g:939:1: rule__PaintProcess__Group__6 : rule__PaintProcess__Group__6__Impl ;
    public final void rule__PaintProcess__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:943:1: ( rule__PaintProcess__Group__6__Impl )
            // InternalBuilding.g:944:2: rule__PaintProcess__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaintProcess__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaintProcess__Group__6"


    // $ANTLR start "rule__PaintProcess__Group__6__Impl"
    // InternalBuilding.g:950:1: rule__PaintProcess__Group__6__Impl : ( ( rule__PaintProcess__ColorAssignment_6 ) ) ;
    public final void rule__PaintProcess__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:954:1: ( ( ( rule__PaintProcess__ColorAssignment_6 ) ) )
            // InternalBuilding.g:955:1: ( ( rule__PaintProcess__ColorAssignment_6 ) )
            {
            // InternalBuilding.g:955:1: ( ( rule__PaintProcess__ColorAssignment_6 ) )
            // InternalBuilding.g:956:2: ( rule__PaintProcess__ColorAssignment_6 )
            {
             before(grammarAccess.getPaintProcessAccess().getColorAssignment_6()); 
            // InternalBuilding.g:957:2: ( rule__PaintProcess__ColorAssignment_6 )
            // InternalBuilding.g:957:3: rule__PaintProcess__ColorAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PaintProcess__ColorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPaintProcessAccess().getColorAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaintProcess__Group__6__Impl"


    // $ANTLR start "rule__AddWindowProcess__Group__0"
    // InternalBuilding.g:966:1: rule__AddWindowProcess__Group__0 : rule__AddWindowProcess__Group__0__Impl rule__AddWindowProcess__Group__1 ;
    public final void rule__AddWindowProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:970:1: ( rule__AddWindowProcess__Group__0__Impl rule__AddWindowProcess__Group__1 )
            // InternalBuilding.g:971:2: rule__AddWindowProcess__Group__0__Impl rule__AddWindowProcess__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AddWindowProcess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddWindowProcess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__Group__0"


    // $ANTLR start "rule__AddWindowProcess__Group__0__Impl"
    // InternalBuilding.g:978:1: rule__AddWindowProcess__Group__0__Impl : ( 'add' ) ;
    public final void rule__AddWindowProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:982:1: ( ( 'add' ) )
            // InternalBuilding.g:983:1: ( 'add' )
            {
            // InternalBuilding.g:983:1: ( 'add' )
            // InternalBuilding.g:984:2: 'add'
            {
             before(grammarAccess.getAddWindowProcessAccess().getAddKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAddWindowProcessAccess().getAddKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__Group__0__Impl"


    // $ANTLR start "rule__AddWindowProcess__Group__1"
    // InternalBuilding.g:993:1: rule__AddWindowProcess__Group__1 : rule__AddWindowProcess__Group__1__Impl rule__AddWindowProcess__Group__2 ;
    public final void rule__AddWindowProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:997:1: ( rule__AddWindowProcess__Group__1__Impl rule__AddWindowProcess__Group__2 )
            // InternalBuilding.g:998:2: rule__AddWindowProcess__Group__1__Impl rule__AddWindowProcess__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AddWindowProcess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddWindowProcess__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__Group__1"


    // $ANTLR start "rule__AddWindowProcess__Group__1__Impl"
    // InternalBuilding.g:1005:1: rule__AddWindowProcess__Group__1__Impl : ( ( rule__AddWindowProcess__NumAssignment_1 ) ) ;
    public final void rule__AddWindowProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1009:1: ( ( ( rule__AddWindowProcess__NumAssignment_1 ) ) )
            // InternalBuilding.g:1010:1: ( ( rule__AddWindowProcess__NumAssignment_1 ) )
            {
            // InternalBuilding.g:1010:1: ( ( rule__AddWindowProcess__NumAssignment_1 ) )
            // InternalBuilding.g:1011:2: ( rule__AddWindowProcess__NumAssignment_1 )
            {
             before(grammarAccess.getAddWindowProcessAccess().getNumAssignment_1()); 
            // InternalBuilding.g:1012:2: ( rule__AddWindowProcess__NumAssignment_1 )
            // InternalBuilding.g:1012:3: rule__AddWindowProcess__NumAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddWindowProcess__NumAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddWindowProcessAccess().getNumAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__Group__1__Impl"


    // $ANTLR start "rule__AddWindowProcess__Group__2"
    // InternalBuilding.g:1020:1: rule__AddWindowProcess__Group__2 : rule__AddWindowProcess__Group__2__Impl rule__AddWindowProcess__Group__3 ;
    public final void rule__AddWindowProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1024:1: ( rule__AddWindowProcess__Group__2__Impl rule__AddWindowProcess__Group__3 )
            // InternalBuilding.g:1025:2: rule__AddWindowProcess__Group__2__Impl rule__AddWindowProcess__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__AddWindowProcess__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddWindowProcess__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__Group__2"


    // $ANTLR start "rule__AddWindowProcess__Group__2__Impl"
    // InternalBuilding.g:1032:1: rule__AddWindowProcess__Group__2__Impl : ( 'windows' ) ;
    public final void rule__AddWindowProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1036:1: ( ( 'windows' ) )
            // InternalBuilding.g:1037:1: ( 'windows' )
            {
            // InternalBuilding.g:1037:1: ( 'windows' )
            // InternalBuilding.g:1038:2: 'windows'
            {
             before(grammarAccess.getAddWindowProcessAccess().getWindowsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAddWindowProcessAccess().getWindowsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__Group__2__Impl"


    // $ANTLR start "rule__AddWindowProcess__Group__3"
    // InternalBuilding.g:1047:1: rule__AddWindowProcess__Group__3 : rule__AddWindowProcess__Group__3__Impl rule__AddWindowProcess__Group__4 ;
    public final void rule__AddWindowProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1051:1: ( rule__AddWindowProcess__Group__3__Impl rule__AddWindowProcess__Group__4 )
            // InternalBuilding.g:1052:2: rule__AddWindowProcess__Group__3__Impl rule__AddWindowProcess__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__AddWindowProcess__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddWindowProcess__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__Group__3"


    // $ANTLR start "rule__AddWindowProcess__Group__3__Impl"
    // InternalBuilding.g:1059:1: rule__AddWindowProcess__Group__3__Impl : ( 'to' ) ;
    public final void rule__AddWindowProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1063:1: ( ( 'to' ) )
            // InternalBuilding.g:1064:1: ( 'to' )
            {
            // InternalBuilding.g:1064:1: ( 'to' )
            // InternalBuilding.g:1065:2: 'to'
            {
             before(grammarAccess.getAddWindowProcessAccess().getToKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAddWindowProcessAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__Group__3__Impl"


    // $ANTLR start "rule__AddWindowProcess__Group__4"
    // InternalBuilding.g:1074:1: rule__AddWindowProcess__Group__4 : rule__AddWindowProcess__Group__4__Impl rule__AddWindowProcess__Group__5 ;
    public final void rule__AddWindowProcess__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1078:1: ( rule__AddWindowProcess__Group__4__Impl rule__AddWindowProcess__Group__5 )
            // InternalBuilding.g:1079:2: rule__AddWindowProcess__Group__4__Impl rule__AddWindowProcess__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__AddWindowProcess__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddWindowProcess__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__Group__4"


    // $ANTLR start "rule__AddWindowProcess__Group__4__Impl"
    // InternalBuilding.g:1086:1: rule__AddWindowProcess__Group__4__Impl : ( '[' ) ;
    public final void rule__AddWindowProcess__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1090:1: ( ( '[' ) )
            // InternalBuilding.g:1091:1: ( '[' )
            {
            // InternalBuilding.g:1091:1: ( '[' )
            // InternalBuilding.g:1092:2: '['
            {
             before(grammarAccess.getAddWindowProcessAccess().getLeftSquareBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAddWindowProcessAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__Group__4__Impl"


    // $ANTLR start "rule__AddWindowProcess__Group__5"
    // InternalBuilding.g:1101:1: rule__AddWindowProcess__Group__5 : rule__AddWindowProcess__Group__5__Impl rule__AddWindowProcess__Group__6 ;
    public final void rule__AddWindowProcess__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1105:1: ( rule__AddWindowProcess__Group__5__Impl rule__AddWindowProcess__Group__6 )
            // InternalBuilding.g:1106:2: rule__AddWindowProcess__Group__5__Impl rule__AddWindowProcess__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__AddWindowProcess__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddWindowProcess__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__Group__5"


    // $ANTLR start "rule__AddWindowProcess__Group__5__Impl"
    // InternalBuilding.g:1113:1: rule__AddWindowProcess__Group__5__Impl : ( ( rule__AddWindowProcess__LevelsAssignment_5 ) ) ;
    public final void rule__AddWindowProcess__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1117:1: ( ( ( rule__AddWindowProcess__LevelsAssignment_5 ) ) )
            // InternalBuilding.g:1118:1: ( ( rule__AddWindowProcess__LevelsAssignment_5 ) )
            {
            // InternalBuilding.g:1118:1: ( ( rule__AddWindowProcess__LevelsAssignment_5 ) )
            // InternalBuilding.g:1119:2: ( rule__AddWindowProcess__LevelsAssignment_5 )
            {
             before(grammarAccess.getAddWindowProcessAccess().getLevelsAssignment_5()); 
            // InternalBuilding.g:1120:2: ( rule__AddWindowProcess__LevelsAssignment_5 )
            // InternalBuilding.g:1120:3: rule__AddWindowProcess__LevelsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AddWindowProcess__LevelsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAddWindowProcessAccess().getLevelsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__Group__5__Impl"


    // $ANTLR start "rule__AddWindowProcess__Group__6"
    // InternalBuilding.g:1128:1: rule__AddWindowProcess__Group__6 : rule__AddWindowProcess__Group__6__Impl rule__AddWindowProcess__Group__7 ;
    public final void rule__AddWindowProcess__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1132:1: ( rule__AddWindowProcess__Group__6__Impl rule__AddWindowProcess__Group__7 )
            // InternalBuilding.g:1133:2: rule__AddWindowProcess__Group__6__Impl rule__AddWindowProcess__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__AddWindowProcess__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddWindowProcess__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__Group__6"


    // $ANTLR start "rule__AddWindowProcess__Group__6__Impl"
    // InternalBuilding.g:1140:1: rule__AddWindowProcess__Group__6__Impl : ( ']' ) ;
    public final void rule__AddWindowProcess__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1144:1: ( ( ']' ) )
            // InternalBuilding.g:1145:1: ( ']' )
            {
            // InternalBuilding.g:1145:1: ( ']' )
            // InternalBuilding.g:1146:2: ']'
            {
             before(grammarAccess.getAddWindowProcessAccess().getRightSquareBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAddWindowProcessAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__Group__6__Impl"


    // $ANTLR start "rule__AddWindowProcess__Group__7"
    // InternalBuilding.g:1155:1: rule__AddWindowProcess__Group__7 : rule__AddWindowProcess__Group__7__Impl ;
    public final void rule__AddWindowProcess__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1159:1: ( rule__AddWindowProcess__Group__7__Impl )
            // InternalBuilding.g:1160:2: rule__AddWindowProcess__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddWindowProcess__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__Group__7"


    // $ANTLR start "rule__AddWindowProcess__Group__7__Impl"
    // InternalBuilding.g:1166:1: rule__AddWindowProcess__Group__7__Impl : ( 'floor' ) ;
    public final void rule__AddWindowProcess__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1170:1: ( ( 'floor' ) )
            // InternalBuilding.g:1171:1: ( 'floor' )
            {
            // InternalBuilding.g:1171:1: ( 'floor' )
            // InternalBuilding.g:1172:2: 'floor'
            {
             before(grammarAccess.getAddWindowProcessAccess().getFloorKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAddWindowProcessAccess().getFloorKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__Group__7__Impl"


    // $ANTLR start "rule__Loop__Group__0"
    // InternalBuilding.g:1182:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1186:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalBuilding.g:1187:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Loop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0"


    // $ANTLR start "rule__Loop__Group__0__Impl"
    // InternalBuilding.g:1194:1: rule__Loop__Group__0__Impl : ( ( rule__Loop__CountAssignment_0 ) ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1198:1: ( ( ( rule__Loop__CountAssignment_0 ) ) )
            // InternalBuilding.g:1199:1: ( ( rule__Loop__CountAssignment_0 ) )
            {
            // InternalBuilding.g:1199:1: ( ( rule__Loop__CountAssignment_0 ) )
            // InternalBuilding.g:1200:2: ( rule__Loop__CountAssignment_0 )
            {
             before(grammarAccess.getLoopAccess().getCountAssignment_0()); 
            // InternalBuilding.g:1201:2: ( rule__Loop__CountAssignment_0 )
            // InternalBuilding.g:1201:3: rule__Loop__CountAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Loop__CountAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getCountAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0__Impl"


    // $ANTLR start "rule__Loop__Group__1"
    // InternalBuilding.g:1209:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1213:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalBuilding.g:1214:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Loop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1"


    // $ANTLR start "rule__Loop__Group__1__Impl"
    // InternalBuilding.g:1221:1: rule__Loop__Group__1__Impl : ( 'times' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1225:1: ( ( 'times' ) )
            // InternalBuilding.g:1226:1: ( 'times' )
            {
            // InternalBuilding.g:1226:1: ( 'times' )
            // InternalBuilding.g:1227:2: 'times'
            {
             before(grammarAccess.getLoopAccess().getTimesKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getTimesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1__Impl"


    // $ANTLR start "rule__Loop__Group__2"
    // InternalBuilding.g:1236:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1240:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalBuilding.g:1241:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Loop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__2"


    // $ANTLR start "rule__Loop__Group__2__Impl"
    // InternalBuilding.g:1248:1: rule__Loop__Group__2__Impl : ( 'do' ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1252:1: ( ( 'do' ) )
            // InternalBuilding.g:1253:1: ( 'do' )
            {
            // InternalBuilding.g:1253:1: ( 'do' )
            // InternalBuilding.g:1254:2: 'do'
            {
             before(grammarAccess.getLoopAccess().getDoKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getDoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__2__Impl"


    // $ANTLR start "rule__Loop__Group__3"
    // InternalBuilding.g:1263:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1267:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalBuilding.g:1268:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Loop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__3"


    // $ANTLR start "rule__Loop__Group__3__Impl"
    // InternalBuilding.g:1275:1: rule__Loop__Group__3__Impl : ( ( ( rule__Loop__ProcessesAssignment_3 ) ) ( ( rule__Loop__ProcessesAssignment_3 )* ) ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1279:1: ( ( ( ( rule__Loop__ProcessesAssignment_3 ) ) ( ( rule__Loop__ProcessesAssignment_3 )* ) ) )
            // InternalBuilding.g:1280:1: ( ( ( rule__Loop__ProcessesAssignment_3 ) ) ( ( rule__Loop__ProcessesAssignment_3 )* ) )
            {
            // InternalBuilding.g:1280:1: ( ( ( rule__Loop__ProcessesAssignment_3 ) ) ( ( rule__Loop__ProcessesAssignment_3 )* ) )
            // InternalBuilding.g:1281:2: ( ( rule__Loop__ProcessesAssignment_3 ) ) ( ( rule__Loop__ProcessesAssignment_3 )* )
            {
            // InternalBuilding.g:1281:2: ( ( rule__Loop__ProcessesAssignment_3 ) )
            // InternalBuilding.g:1282:3: ( rule__Loop__ProcessesAssignment_3 )
            {
             before(grammarAccess.getLoopAccess().getProcessesAssignment_3()); 
            // InternalBuilding.g:1283:3: ( rule__Loop__ProcessesAssignment_3 )
            // InternalBuilding.g:1283:4: rule__Loop__ProcessesAssignment_3
            {
            pushFollow(FOLLOW_3);
            rule__Loop__ProcessesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getProcessesAssignment_3()); 

            }

            // InternalBuilding.g:1286:2: ( ( rule__Loop__ProcessesAssignment_3 )* )
            // InternalBuilding.g:1287:3: ( rule__Loop__ProcessesAssignment_3 )*
            {
             before(grammarAccess.getLoopAccess().getProcessesAssignment_3()); 
            // InternalBuilding.g:1288:3: ( rule__Loop__ProcessesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_ID)||(LA7_0>=15 && LA7_0<=17)||LA7_0==19||LA7_0==21||LA7_0==26||LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBuilding.g:1288:4: rule__Loop__ProcessesAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Loop__ProcessesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getProcessesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__3__Impl"


    // $ANTLR start "rule__Loop__Group__4"
    // InternalBuilding.g:1297:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl ;
    public final void rule__Loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1301:1: ( rule__Loop__Group__4__Impl )
            // InternalBuilding.g:1302:2: rule__Loop__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__4"


    // $ANTLR start "rule__Loop__Group__4__Impl"
    // InternalBuilding.g:1308:1: rule__Loop__Group__4__Impl : ( 'end' ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1312:1: ( ( 'end' ) )
            // InternalBuilding.g:1313:1: ( 'end' )
            {
            // InternalBuilding.g:1313:1: ( 'end' )
            // InternalBuilding.g:1314:2: 'end'
            {
             before(grammarAccess.getLoopAccess().getEndKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getEndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__4__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalBuilding.g:1324:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1328:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalBuilding.g:1329:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalBuilding.g:1336:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1340:1: ( ( ruleMultiplication ) )
            // InternalBuilding.g:1341:1: ( ruleMultiplication )
            {
            // InternalBuilding.g:1341:1: ( ruleMultiplication )
            // InternalBuilding.g:1342:2: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalBuilding.g:1351:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1355:1: ( rule__Addition__Group__1__Impl )
            // InternalBuilding.g:1356:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalBuilding.g:1362:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1366:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalBuilding.g:1367:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalBuilding.g:1367:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalBuilding.g:1368:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalBuilding.g:1369:2: ( rule__Addition__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=11 && LA8_0<=12)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBuilding.g:1369:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalBuilding.g:1378:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1382:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalBuilding.g:1383:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalBuilding.g:1390:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1394:1: ( ( () ) )
            // InternalBuilding.g:1395:1: ( () )
            {
            // InternalBuilding.g:1395:1: ( () )
            // InternalBuilding.g:1396:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalBuilding.g:1397:2: ()
            // InternalBuilding.g:1397:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalBuilding.g:1405:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1409:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalBuilding.g:1410:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalBuilding.g:1417:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1421:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalBuilding.g:1422:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalBuilding.g:1422:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalBuilding.g:1423:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalBuilding.g:1424:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalBuilding.g:1424:3: rule__Addition__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // InternalBuilding.g:1432:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1436:1: ( rule__Addition__Group_1__2__Impl )
            // InternalBuilding.g:1437:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // InternalBuilding.g:1443:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1447:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalBuilding.g:1448:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalBuilding.g:1448:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalBuilding.g:1449:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalBuilding.g:1450:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalBuilding.g:1450:3: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalBuilding.g:1459:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1463:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalBuilding.g:1464:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalBuilding.g:1471:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1475:1: ( ( rulePrimary ) )
            // InternalBuilding.g:1476:1: ( rulePrimary )
            {
            // InternalBuilding.g:1476:1: ( rulePrimary )
            // InternalBuilding.g:1477:2: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalBuilding.g:1486:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1490:1: ( rule__Multiplication__Group__1__Impl )
            // InternalBuilding.g:1491:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalBuilding.g:1497:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1501:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalBuilding.g:1502:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalBuilding.g:1502:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalBuilding.g:1503:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalBuilding.g:1504:2: ( rule__Multiplication__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=13 && LA9_0<=14)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBuilding.g:1504:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalBuilding.g:1513:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1517:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalBuilding.g:1518:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalBuilding.g:1525:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1529:1: ( ( () ) )
            // InternalBuilding.g:1530:1: ( () )
            {
            // InternalBuilding.g:1530:1: ( () )
            // InternalBuilding.g:1531:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalBuilding.g:1532:2: ()
            // InternalBuilding.g:1532:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalBuilding.g:1540:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1544:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalBuilding.g:1545:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalBuilding.g:1552:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1556:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalBuilding.g:1557:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalBuilding.g:1557:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalBuilding.g:1558:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalBuilding.g:1559:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalBuilding.g:1559:3: rule__Multiplication__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // InternalBuilding.g:1567:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1571:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalBuilding.g:1572:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // InternalBuilding.g:1578:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1582:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalBuilding.g:1583:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalBuilding.g:1583:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalBuilding.g:1584:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalBuilding.g:1585:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalBuilding.g:1585:3: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_3__0"
    // InternalBuilding.g:1594:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1598:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // InternalBuilding.g:1599:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Primary__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0"


    // $ANTLR start "rule__Primary__Group_3__0__Impl"
    // InternalBuilding.g:1606:1: rule__Primary__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1610:1: ( ( '(' ) )
            // InternalBuilding.g:1611:1: ( '(' )
            {
            // InternalBuilding.g:1611:1: ( '(' )
            // InternalBuilding.g:1612:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0__Impl"


    // $ANTLR start "rule__Primary__Group_3__1"
    // InternalBuilding.g:1621:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1625:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // InternalBuilding.g:1626:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__Primary__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1"


    // $ANTLR start "rule__Primary__Group_3__1__Impl"
    // InternalBuilding.g:1633:1: rule__Primary__Group_3__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1637:1: ( ( ruleAddition ) )
            // InternalBuilding.g:1638:1: ( ruleAddition )
            {
            // InternalBuilding.g:1638:1: ( ruleAddition )
            // InternalBuilding.g:1639:2: ruleAddition
            {
             before(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1__Impl"


    // $ANTLR start "rule__Primary__Group_3__2"
    // InternalBuilding.g:1648:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1652:1: ( rule__Primary__Group_3__2__Impl )
            // InternalBuilding.g:1653:2: rule__Primary__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2"


    // $ANTLR start "rule__Primary__Group_3__2__Impl"
    // InternalBuilding.g:1659:1: rule__Primary__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1663:1: ( ( ')' ) )
            // InternalBuilding.g:1664:1: ( ')' )
            {
            // InternalBuilding.g:1664:1: ( ')' )
            // InternalBuilding.g:1665:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalBuilding.g:1675:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1679:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalBuilding.g:1680:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__REAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0"


    // $ANTLR start "rule__REAL__Group__0__Impl"
    // InternalBuilding.g:1687:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1691:1: ( ( ( RULE_INT )? ) )
            // InternalBuilding.g:1692:1: ( ( RULE_INT )? )
            {
            // InternalBuilding.g:1692:1: ( ( RULE_INT )? )
            // InternalBuilding.g:1693:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalBuilding.g:1694:2: ( RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBuilding.g:1694:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0__Impl"


    // $ANTLR start "rule__REAL__Group__1"
    // InternalBuilding.g:1702:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1706:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalBuilding.g:1707:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__REAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1"


    // $ANTLR start "rule__REAL__Group__1__Impl"
    // InternalBuilding.g:1714:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1718:1: ( ( '.' ) )
            // InternalBuilding.g:1719:1: ( '.' )
            {
            // InternalBuilding.g:1719:1: ( '.' )
            // InternalBuilding.g:1720:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1__Impl"


    // $ANTLR start "rule__REAL__Group__2"
    // InternalBuilding.g:1729:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1733:1: ( rule__REAL__Group__2__Impl )
            // InternalBuilding.g:1734:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2"


    // $ANTLR start "rule__REAL__Group__2__Impl"
    // InternalBuilding.g:1740:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1744:1: ( ( RULE_INT ) )
            // InternalBuilding.g:1745:1: ( RULE_INT )
            {
            // InternalBuilding.g:1745:1: ( RULE_INT )
            // InternalBuilding.g:1746:2: RULE_INT
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2__Impl"


    // $ANTLR start "rule__BuildingProgram__ProcessesAssignment"
    // InternalBuilding.g:1756:1: rule__BuildingProgram__ProcessesAssignment : ( ruleProcess ) ;
    public final void rule__BuildingProgram__ProcessesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1760:1: ( ( ruleProcess ) )
            // InternalBuilding.g:1761:2: ( ruleProcess )
            {
            // InternalBuilding.g:1761:2: ( ruleProcess )
            // InternalBuilding.g:1762:3: ruleProcess
            {
             before(grammarAccess.getBuildingProgramAccess().getProcessesProcessParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getBuildingProgramAccess().getProcessesProcessParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildingProgram__ProcessesAssignment"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalBuilding.g:1771:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1775:1: ( ( RULE_ID ) )
            // InternalBuilding.g:1776:2: ( RULE_ID )
            {
            // InternalBuilding.g:1776:2: ( RULE_ID )
            // InternalBuilding.g:1777:3: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__ValueAssignment_3"
    // InternalBuilding.g:1786:1: rule__VariableDeclaration__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1790:1: ( ( RULE_INT ) )
            // InternalBuilding.g:1791:2: ( RULE_INT )
            {
            // InternalBuilding.g:1791:2: ( RULE_INT )
            // InternalBuilding.g:1792:3: RULE_INT
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ValueAssignment_3"


    // $ANTLR start "rule__AddFloorProcess__StructureAssignment_0"
    // InternalBuilding.g:1801:1: rule__AddFloorProcess__StructureAssignment_0 : ( ruleWholeStructure ) ;
    public final void rule__AddFloorProcess__StructureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1805:1: ( ( ruleWholeStructure ) )
            // InternalBuilding.g:1806:2: ( ruleWholeStructure )
            {
            // InternalBuilding.g:1806:2: ( ruleWholeStructure )
            // InternalBuilding.g:1807:3: ruleWholeStructure
            {
             before(grammarAccess.getAddFloorProcessAccess().getStructureWholeStructureEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWholeStructure();

            state._fsp--;

             after(grammarAccess.getAddFloorProcessAccess().getStructureWholeStructureEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFloorProcess__StructureAssignment_0"


    // $ANTLR start "rule__AddFloorProcess__LevelsAssignment_2"
    // InternalBuilding.g:1816:1: rule__AddFloorProcess__LevelsAssignment_2 : ( ruleAddition ) ;
    public final void rule__AddFloorProcess__LevelsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1820:1: ( ( ruleAddition ) )
            // InternalBuilding.g:1821:2: ( ruleAddition )
            {
            // InternalBuilding.g:1821:2: ( ruleAddition )
            // InternalBuilding.g:1822:3: ruleAddition
            {
             before(grammarAccess.getAddFloorProcessAccess().getLevelsAdditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAddFloorProcessAccess().getLevelsAdditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddFloorProcess__LevelsAssignment_2"


    // $ANTLR start "rule__PaintProcess__LevelsAssignment_3"
    // InternalBuilding.g:1831:1: rule__PaintProcess__LevelsAssignment_3 : ( ruleAddition ) ;
    public final void rule__PaintProcess__LevelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1835:1: ( ( ruleAddition ) )
            // InternalBuilding.g:1836:2: ( ruleAddition )
            {
            // InternalBuilding.g:1836:2: ( ruleAddition )
            // InternalBuilding.g:1837:3: ruleAddition
            {
             before(grammarAccess.getPaintProcessAccess().getLevelsAdditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPaintProcessAccess().getLevelsAdditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaintProcess__LevelsAssignment_3"


    // $ANTLR start "rule__PaintProcess__ColorAssignment_6"
    // InternalBuilding.g:1846:1: rule__PaintProcess__ColorAssignment_6 : ( RULE_ID ) ;
    public final void rule__PaintProcess__ColorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1850:1: ( ( RULE_ID ) )
            // InternalBuilding.g:1851:2: ( RULE_ID )
            {
            // InternalBuilding.g:1851:2: ( RULE_ID )
            // InternalBuilding.g:1852:3: RULE_ID
            {
             before(grammarAccess.getPaintProcessAccess().getColorIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPaintProcessAccess().getColorIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaintProcess__ColorAssignment_6"


    // $ANTLR start "rule__AddWindowProcess__NumAssignment_1"
    // InternalBuilding.g:1861:1: rule__AddWindowProcess__NumAssignment_1 : ( ruleAddition ) ;
    public final void rule__AddWindowProcess__NumAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1865:1: ( ( ruleAddition ) )
            // InternalBuilding.g:1866:2: ( ruleAddition )
            {
            // InternalBuilding.g:1866:2: ( ruleAddition )
            // InternalBuilding.g:1867:3: ruleAddition
            {
             before(grammarAccess.getAddWindowProcessAccess().getNumAdditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAddWindowProcessAccess().getNumAdditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__NumAssignment_1"


    // $ANTLR start "rule__AddWindowProcess__LevelsAssignment_5"
    // InternalBuilding.g:1876:1: rule__AddWindowProcess__LevelsAssignment_5 : ( ruleAddition ) ;
    public final void rule__AddWindowProcess__LevelsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1880:1: ( ( ruleAddition ) )
            // InternalBuilding.g:1881:2: ( ruleAddition )
            {
            // InternalBuilding.g:1881:2: ( ruleAddition )
            // InternalBuilding.g:1882:3: ruleAddition
            {
             before(grammarAccess.getAddWindowProcessAccess().getLevelsAdditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAddWindowProcessAccess().getLevelsAdditionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddWindowProcess__LevelsAssignment_5"


    // $ANTLR start "rule__Loop__CountAssignment_0"
    // InternalBuilding.g:1891:1: rule__Loop__CountAssignment_0 : ( ruleAddition ) ;
    public final void rule__Loop__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1895:1: ( ( ruleAddition ) )
            // InternalBuilding.g:1896:2: ( ruleAddition )
            {
            // InternalBuilding.g:1896:2: ( ruleAddition )
            // InternalBuilding.g:1897:3: ruleAddition
            {
             before(grammarAccess.getLoopAccess().getCountAdditionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getCountAdditionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__CountAssignment_0"


    // $ANTLR start "rule__Loop__ProcessesAssignment_3"
    // InternalBuilding.g:1906:1: rule__Loop__ProcessesAssignment_3 : ( ruleProcess ) ;
    public final void rule__Loop__ProcessesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1910:1: ( ( ruleProcess ) )
            // InternalBuilding.g:1911:2: ( ruleProcess )
            {
            // InternalBuilding.g:1911:2: ( ruleProcess )
            // InternalBuilding.g:1912:3: ruleProcess
            {
             before(grammarAccess.getLoopAccess().getProcessesProcessParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getProcessesProcessParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__ProcessesAssignment_3"


    // $ANTLR start "rule__Addition__OperatorAssignment_1_1"
    // InternalBuilding.g:1921:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1925:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalBuilding.g:1926:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalBuilding.g:1926:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalBuilding.g:1927:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalBuilding.g:1928:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalBuilding.g:1928:4: rule__Addition__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OperatorAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // InternalBuilding.g:1936:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1940:1: ( ( ruleMultiplication ) )
            // InternalBuilding.g:1941:2: ( ruleMultiplication )
            {
            // InternalBuilding.g:1941:2: ( ruleMultiplication )
            // InternalBuilding.g:1942:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__OperatorAssignment_1_1"
    // InternalBuilding.g:1951:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1955:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalBuilding.g:1956:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalBuilding.g:1956:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalBuilding.g:1957:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalBuilding.g:1958:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalBuilding.g:1958:4: rule__Multiplication__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OperatorAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // InternalBuilding.g:1966:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1970:1: ( ( rulePrimary ) )
            // InternalBuilding.g:1971:2: ( rulePrimary )
            {
            // InternalBuilding.g:1971:2: ( rulePrimary )
            // InternalBuilding.g:1972:3: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__IntLiteral__ValAssignment"
    // InternalBuilding.g:1981:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:1985:1: ( ( RULE_INT ) )
            // InternalBuilding.g:1986:2: ( RULE_INT )
            {
            // InternalBuilding.g:1986:2: ( RULE_INT )
            // InternalBuilding.g:1987:3: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__ValAssignment"


    // $ANTLR start "rule__RealLiteral__ValAssignment"
    // InternalBuilding.g:1996:1: rule__RealLiteral__ValAssignment : ( ruleREAL ) ;
    public final void rule__RealLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:2000:1: ( ( ruleREAL ) )
            // InternalBuilding.g:2001:2: ( ruleREAL )
            {
            // InternalBuilding.g:2001:2: ( ruleREAL )
            // InternalBuilding.g:2002:3: ruleREAL
            {
             before(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__ValAssignment"


    // $ANTLR start "rule__IntVarExpression__VarAssignment"
    // InternalBuilding.g:2011:1: rule__IntVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IntVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBuilding.g:2015:1: ( ( ( RULE_ID ) ) )
            // InternalBuilding.g:2016:2: ( ( RULE_ID ) )
            {
            // InternalBuilding.g:2016:2: ( ( RULE_ID ) )
            // InternalBuilding.g:2017:3: ( RULE_ID )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalBuilding.g:2018:3: ( RULE_ID )
            // InternalBuilding.g:2019:4: RULE_ID
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVarExpression__VarAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000001042B8032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000001042B8030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000010L});

}