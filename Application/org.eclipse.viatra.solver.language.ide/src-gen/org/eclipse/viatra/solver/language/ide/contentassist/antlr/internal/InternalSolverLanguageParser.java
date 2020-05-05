package org.eclipse.viatra.solver.language.ide.contentassist.antlr.internal;

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
import org.eclipse.viatra.solver.language.services.SolverLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSolverLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'true'", "'-'", "'.'", "'unknown'", "'error'", "':'", "'('", "')'", "','", "'exists'", "'equals'", "'bool'", "'int'", "'real'", "'string'", "'\\''", "':-'", "'|'", "'+'", "'*'", "'default'", "'class'", "'{'", "'}'", "'extends'", "'enum'", "'relation'", "'..'", "'abstract'", "'containment'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSolverLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSolverLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSolverLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSolverLanguage.g"; }


    	private SolverLanguageGrammarAccess grammarAccess;

    	public void setGrammarAccess(SolverLanguageGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProblem"
    // InternalSolverLanguage.g:53:1: entryRuleProblem : ruleProblem EOF ;
    public final void entryRuleProblem() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:54:1: ( ruleProblem EOF )
            // InternalSolverLanguage.g:55:1: ruleProblem EOF
            {
             before(grammarAccess.getProblemRule()); 
            pushFollow(FOLLOW_1);
            ruleProblem();

            state._fsp--;

             after(grammarAccess.getProblemRule()); 
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
    // $ANTLR end "entryRuleProblem"


    // $ANTLR start "ruleProblem"
    // InternalSolverLanguage.g:62:1: ruleProblem : ( ( rule__Problem__StatementsAssignment )* ) ;
    public final void ruleProblem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:66:2: ( ( ( rule__Problem__StatementsAssignment )* ) )
            // InternalSolverLanguage.g:67:2: ( ( rule__Problem__StatementsAssignment )* )
            {
            // InternalSolverLanguage.g:67:2: ( ( rule__Problem__StatementsAssignment )* )
            // InternalSolverLanguage.g:68:3: ( rule__Problem__StatementsAssignment )*
            {
             before(grammarAccess.getProblemAccess().getStatementsAssignment()); 
            // InternalSolverLanguage.g:69:3: ( rule__Problem__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==16||(LA1_0>=21 && LA1_0<=26)||(LA1_0>=32 && LA1_0<=33)||(LA1_0>=37 && LA1_0<=38)||(LA1_0>=40 && LA1_0<=41)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSolverLanguage.g:69:4: rule__Problem__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Problem__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProblemAccess().getStatementsAssignment()); 

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
    // $ANTLR end "ruleProblem"


    // $ANTLR start "entryRuleStatement"
    // InternalSolverLanguage.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:79:1: ( ruleStatement EOF )
            // InternalSolverLanguage.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalSolverLanguage.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalSolverLanguage.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalSolverLanguage.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalSolverLanguage.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalSolverLanguage.g:94:3: ( rule__Statement__Alternatives )
            // InternalSolverLanguage.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleREALLiteral"
    // InternalSolverLanguage.g:103:1: entryRuleREALLiteral : ruleREALLiteral EOF ;
    public final void entryRuleREALLiteral() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:104:1: ( ruleREALLiteral EOF )
            // InternalSolverLanguage.g:105:1: ruleREALLiteral EOF
            {
             before(grammarAccess.getREALLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleREALLiteral();

            state._fsp--;

             after(grammarAccess.getREALLiteralRule()); 
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
    // $ANTLR end "entryRuleREALLiteral"


    // $ANTLR start "ruleREALLiteral"
    // InternalSolverLanguage.g:112:1: ruleREALLiteral : ( ( rule__REALLiteral__Group__0 ) ) ;
    public final void ruleREALLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:116:2: ( ( ( rule__REALLiteral__Group__0 ) ) )
            // InternalSolverLanguage.g:117:2: ( ( rule__REALLiteral__Group__0 ) )
            {
            // InternalSolverLanguage.g:117:2: ( ( rule__REALLiteral__Group__0 ) )
            // InternalSolverLanguage.g:118:3: ( rule__REALLiteral__Group__0 )
            {
             before(grammarAccess.getREALLiteralAccess().getGroup()); 
            // InternalSolverLanguage.g:119:3: ( rule__REALLiteral__Group__0 )
            // InternalSolverLanguage.g:119:4: rule__REALLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REALLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREALLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleREALLiteral"


    // $ANTLR start "entryRuleINTLiteral"
    // InternalSolverLanguage.g:128:1: entryRuleINTLiteral : ruleINTLiteral EOF ;
    public final void entryRuleINTLiteral() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:129:1: ( ruleINTLiteral EOF )
            // InternalSolverLanguage.g:130:1: ruleINTLiteral EOF
            {
             before(grammarAccess.getINTLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleINTLiteral();

            state._fsp--;

             after(grammarAccess.getINTLiteralRule()); 
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
    // $ANTLR end "entryRuleINTLiteral"


    // $ANTLR start "ruleINTLiteral"
    // InternalSolverLanguage.g:137:1: ruleINTLiteral : ( ( rule__INTLiteral__Group__0 ) ) ;
    public final void ruleINTLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:141:2: ( ( ( rule__INTLiteral__Group__0 ) ) )
            // InternalSolverLanguage.g:142:2: ( ( rule__INTLiteral__Group__0 ) )
            {
            // InternalSolverLanguage.g:142:2: ( ( rule__INTLiteral__Group__0 ) )
            // InternalSolverLanguage.g:143:3: ( rule__INTLiteral__Group__0 )
            {
             before(grammarAccess.getINTLiteralAccess().getGroup()); 
            // InternalSolverLanguage.g:144:3: ( rule__INTLiteral__Group__0 )
            // InternalSolverLanguage.g:144:4: rule__INTLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__INTLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getINTLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleINTLiteral"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalSolverLanguage.g:153:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:154:1: ( ruleBooleanValue EOF )
            // InternalSolverLanguage.g:155:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalSolverLanguage.g:162:1: ruleBooleanValue : ( ( rule__BooleanValue__Alternatives ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:166:2: ( ( ( rule__BooleanValue__Alternatives ) ) )
            // InternalSolverLanguage.g:167:2: ( ( rule__BooleanValue__Alternatives ) )
            {
            // InternalSolverLanguage.g:167:2: ( ( rule__BooleanValue__Alternatives ) )
            // InternalSolverLanguage.g:168:3: ( rule__BooleanValue__Alternatives )
            {
             before(grammarAccess.getBooleanValueAccess().getAlternatives()); 
            // InternalSolverLanguage.g:169:3: ( rule__BooleanValue__Alternatives )
            // InternalSolverLanguage.g:169:4: rule__BooleanValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleTruthValue"
    // InternalSolverLanguage.g:178:1: entryRuleTruthValue : ruleTruthValue EOF ;
    public final void entryRuleTruthValue() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:179:1: ( ruleTruthValue EOF )
            // InternalSolverLanguage.g:180:1: ruleTruthValue EOF
            {
             before(grammarAccess.getTruthValueRule()); 
            pushFollow(FOLLOW_1);
            ruleTruthValue();

            state._fsp--;

             after(grammarAccess.getTruthValueRule()); 
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
    // $ANTLR end "entryRuleTruthValue"


    // $ANTLR start "ruleTruthValue"
    // InternalSolverLanguage.g:187:1: ruleTruthValue : ( ( rule__TruthValue__Alternatives ) ) ;
    public final void ruleTruthValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:191:2: ( ( ( rule__TruthValue__Alternatives ) ) )
            // InternalSolverLanguage.g:192:2: ( ( rule__TruthValue__Alternatives ) )
            {
            // InternalSolverLanguage.g:192:2: ( ( rule__TruthValue__Alternatives ) )
            // InternalSolverLanguage.g:193:3: ( rule__TruthValue__Alternatives )
            {
             before(grammarAccess.getTruthValueAccess().getAlternatives()); 
            // InternalSolverLanguage.g:194:3: ( rule__TruthValue__Alternatives )
            // InternalSolverLanguage.g:194:4: rule__TruthValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TruthValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTruthValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTruthValue"


    // $ANTLR start "entryRuleInterpretation"
    // InternalSolverLanguage.g:203:1: entryRuleInterpretation : ruleInterpretation EOF ;
    public final void entryRuleInterpretation() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:204:1: ( ruleInterpretation EOF )
            // InternalSolverLanguage.g:205:1: ruleInterpretation EOF
            {
             before(grammarAccess.getInterpretationRule()); 
            pushFollow(FOLLOW_1);
            ruleInterpretation();

            state._fsp--;

             after(grammarAccess.getInterpretationRule()); 
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
    // $ANTLR end "entryRuleInterpretation"


    // $ANTLR start "ruleInterpretation"
    // InternalSolverLanguage.g:212:1: ruleInterpretation : ( ( rule__Interpretation__Alternatives ) ) ;
    public final void ruleInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:216:2: ( ( ( rule__Interpretation__Alternatives ) ) )
            // InternalSolverLanguage.g:217:2: ( ( rule__Interpretation__Alternatives ) )
            {
            // InternalSolverLanguage.g:217:2: ( ( rule__Interpretation__Alternatives ) )
            // InternalSolverLanguage.g:218:3: ( rule__Interpretation__Alternatives )
            {
             before(grammarAccess.getInterpretationAccess().getAlternatives()); 
            // InternalSolverLanguage.g:219:3: ( rule__Interpretation__Alternatives )
            // InternalSolverLanguage.g:219:4: rule__Interpretation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Interpretation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInterpretationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInterpretation"


    // $ANTLR start "entryRuleBasicInterpretation"
    // InternalSolverLanguage.g:228:1: entryRuleBasicInterpretation : ruleBasicInterpretation EOF ;
    public final void entryRuleBasicInterpretation() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:229:1: ( ruleBasicInterpretation EOF )
            // InternalSolverLanguage.g:230:1: ruleBasicInterpretation EOF
            {
             before(grammarAccess.getBasicInterpretationRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicInterpretation();

            state._fsp--;

             after(grammarAccess.getBasicInterpretationRule()); 
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
    // $ANTLR end "entryRuleBasicInterpretation"


    // $ANTLR start "ruleBasicInterpretation"
    // InternalSolverLanguage.g:237:1: ruleBasicInterpretation : ( ( rule__BasicInterpretation__Group__0 ) ) ;
    public final void ruleBasicInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:241:2: ( ( ( rule__BasicInterpretation__Group__0 ) ) )
            // InternalSolverLanguage.g:242:2: ( ( rule__BasicInterpretation__Group__0 ) )
            {
            // InternalSolverLanguage.g:242:2: ( ( rule__BasicInterpretation__Group__0 ) )
            // InternalSolverLanguage.g:243:3: ( rule__BasicInterpretation__Group__0 )
            {
             before(grammarAccess.getBasicInterpretationAccess().getGroup()); 
            // InternalSolverLanguage.g:244:3: ( rule__BasicInterpretation__Group__0 )
            // InternalSolverLanguage.g:244:4: rule__BasicInterpretation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicInterpretationAccess().getGroup()); 

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
    // $ANTLR end "ruleBasicInterpretation"


    // $ANTLR start "entryRuleSymbol"
    // InternalSolverLanguage.g:253:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:254:1: ( ruleSymbol EOF )
            // InternalSolverLanguage.g:255:1: ruleSymbol EOF
            {
             before(grammarAccess.getSymbolRule()); 
            pushFollow(FOLLOW_1);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getSymbolRule()); 
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
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // InternalSolverLanguage.g:262:1: ruleSymbol : ( ( rule__Symbol__Alternatives ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:266:2: ( ( ( rule__Symbol__Alternatives ) ) )
            // InternalSolverLanguage.g:267:2: ( ( rule__Symbol__Alternatives ) )
            {
            // InternalSolverLanguage.g:267:2: ( ( rule__Symbol__Alternatives ) )
            // InternalSolverLanguage.g:268:3: ( rule__Symbol__Alternatives )
            {
             before(grammarAccess.getSymbolAccess().getAlternatives()); 
            // InternalSolverLanguage.g:269:3: ( rule__Symbol__Alternatives )
            // InternalSolverLanguage.g:269:4: rule__Symbol__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "entryRuleModelSymbol"
    // InternalSolverLanguage.g:278:1: entryRuleModelSymbol : ruleModelSymbol EOF ;
    public final void entryRuleModelSymbol() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:279:1: ( ruleModelSymbol EOF )
            // InternalSolverLanguage.g:280:1: ruleModelSymbol EOF
            {
             before(grammarAccess.getModelSymbolRule()); 
            pushFollow(FOLLOW_1);
            ruleModelSymbol();

            state._fsp--;

             after(grammarAccess.getModelSymbolRule()); 
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
    // $ANTLR end "entryRuleModelSymbol"


    // $ANTLR start "ruleModelSymbol"
    // InternalSolverLanguage.g:287:1: ruleModelSymbol : ( ( rule__ModelSymbol__NameAssignment ) ) ;
    public final void ruleModelSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:291:2: ( ( ( rule__ModelSymbol__NameAssignment ) ) )
            // InternalSolverLanguage.g:292:2: ( ( rule__ModelSymbol__NameAssignment ) )
            {
            // InternalSolverLanguage.g:292:2: ( ( rule__ModelSymbol__NameAssignment ) )
            // InternalSolverLanguage.g:293:3: ( rule__ModelSymbol__NameAssignment )
            {
             before(grammarAccess.getModelSymbolAccess().getNameAssignment()); 
            // InternalSolverLanguage.g:294:3: ( rule__ModelSymbol__NameAssignment )
            // InternalSolverLanguage.g:294:4: rule__ModelSymbol__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ModelSymbol__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelSymbolAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleModelSymbol"


    // $ANTLR start "entryRulePartialitySymbol"
    // InternalSolverLanguage.g:303:1: entryRulePartialitySymbol : rulePartialitySymbol EOF ;
    public final void entryRulePartialitySymbol() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:304:1: ( rulePartialitySymbol EOF )
            // InternalSolverLanguage.g:305:1: rulePartialitySymbol EOF
            {
             before(grammarAccess.getPartialitySymbolRule()); 
            pushFollow(FOLLOW_1);
            rulePartialitySymbol();

            state._fsp--;

             after(grammarAccess.getPartialitySymbolRule()); 
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
    // $ANTLR end "entryRulePartialitySymbol"


    // $ANTLR start "rulePartialitySymbol"
    // InternalSolverLanguage.g:312:1: rulePartialitySymbol : ( ( rule__PartialitySymbol__Alternatives ) ) ;
    public final void rulePartialitySymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:316:2: ( ( ( rule__PartialitySymbol__Alternatives ) ) )
            // InternalSolverLanguage.g:317:2: ( ( rule__PartialitySymbol__Alternatives ) )
            {
            // InternalSolverLanguage.g:317:2: ( ( rule__PartialitySymbol__Alternatives ) )
            // InternalSolverLanguage.g:318:3: ( rule__PartialitySymbol__Alternatives )
            {
             before(grammarAccess.getPartialitySymbolAccess().getAlternatives()); 
            // InternalSolverLanguage.g:319:3: ( rule__PartialitySymbol__Alternatives )
            // InternalSolverLanguage.g:319:4: rule__PartialitySymbol__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PartialitySymbol__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPartialitySymbolAccess().getAlternatives()); 

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
    // $ANTLR end "rulePartialitySymbol"


    // $ANTLR start "entryRuleExistSymbol"
    // InternalSolverLanguage.g:328:1: entryRuleExistSymbol : ruleExistSymbol EOF ;
    public final void entryRuleExistSymbol() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:329:1: ( ruleExistSymbol EOF )
            // InternalSolverLanguage.g:330:1: ruleExistSymbol EOF
            {
             before(grammarAccess.getExistSymbolRule()); 
            pushFollow(FOLLOW_1);
            ruleExistSymbol();

            state._fsp--;

             after(grammarAccess.getExistSymbolRule()); 
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
    // $ANTLR end "entryRuleExistSymbol"


    // $ANTLR start "ruleExistSymbol"
    // InternalSolverLanguage.g:337:1: ruleExistSymbol : ( ( rule__ExistSymbol__Group__0 ) ) ;
    public final void ruleExistSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:341:2: ( ( ( rule__ExistSymbol__Group__0 ) ) )
            // InternalSolverLanguage.g:342:2: ( ( rule__ExistSymbol__Group__0 ) )
            {
            // InternalSolverLanguage.g:342:2: ( ( rule__ExistSymbol__Group__0 ) )
            // InternalSolverLanguage.g:343:3: ( rule__ExistSymbol__Group__0 )
            {
             before(grammarAccess.getExistSymbolAccess().getGroup()); 
            // InternalSolverLanguage.g:344:3: ( rule__ExistSymbol__Group__0 )
            // InternalSolverLanguage.g:344:4: rule__ExistSymbol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExistSymbol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExistSymbolAccess().getGroup()); 

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
    // $ANTLR end "ruleExistSymbol"


    // $ANTLR start "entryRuleEqualsSymbol"
    // InternalSolverLanguage.g:353:1: entryRuleEqualsSymbol : ruleEqualsSymbol EOF ;
    public final void entryRuleEqualsSymbol() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:354:1: ( ruleEqualsSymbol EOF )
            // InternalSolverLanguage.g:355:1: ruleEqualsSymbol EOF
            {
             before(grammarAccess.getEqualsSymbolRule()); 
            pushFollow(FOLLOW_1);
            ruleEqualsSymbol();

            state._fsp--;

             after(grammarAccess.getEqualsSymbolRule()); 
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
    // $ANTLR end "entryRuleEqualsSymbol"


    // $ANTLR start "ruleEqualsSymbol"
    // InternalSolverLanguage.g:362:1: ruleEqualsSymbol : ( ( rule__EqualsSymbol__Group__0 ) ) ;
    public final void ruleEqualsSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:366:2: ( ( ( rule__EqualsSymbol__Group__0 ) ) )
            // InternalSolverLanguage.g:367:2: ( ( rule__EqualsSymbol__Group__0 ) )
            {
            // InternalSolverLanguage.g:367:2: ( ( rule__EqualsSymbol__Group__0 ) )
            // InternalSolverLanguage.g:368:3: ( rule__EqualsSymbol__Group__0 )
            {
             before(grammarAccess.getEqualsSymbolAccess().getGroup()); 
            // InternalSolverLanguage.g:369:3: ( rule__EqualsSymbol__Group__0 )
            // InternalSolverLanguage.g:369:4: rule__EqualsSymbol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualsSymbol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualsSymbolAccess().getGroup()); 

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
    // $ANTLR end "ruleEqualsSymbol"


    // $ANTLR start "entryRuleDataSymbol"
    // InternalSolverLanguage.g:378:1: entryRuleDataSymbol : ruleDataSymbol EOF ;
    public final void entryRuleDataSymbol() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:379:1: ( ruleDataSymbol EOF )
            // InternalSolverLanguage.g:380:1: ruleDataSymbol EOF
            {
             before(grammarAccess.getDataSymbolRule()); 
            pushFollow(FOLLOW_1);
            ruleDataSymbol();

            state._fsp--;

             after(grammarAccess.getDataSymbolRule()); 
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
    // $ANTLR end "entryRuleDataSymbol"


    // $ANTLR start "ruleDataSymbol"
    // InternalSolverLanguage.g:387:1: ruleDataSymbol : ( ( rule__DataSymbol__Alternatives ) ) ;
    public final void ruleDataSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:391:2: ( ( ( rule__DataSymbol__Alternatives ) ) )
            // InternalSolverLanguage.g:392:2: ( ( rule__DataSymbol__Alternatives ) )
            {
            // InternalSolverLanguage.g:392:2: ( ( rule__DataSymbol__Alternatives ) )
            // InternalSolverLanguage.g:393:3: ( rule__DataSymbol__Alternatives )
            {
             before(grammarAccess.getDataSymbolAccess().getAlternatives()); 
            // InternalSolverLanguage.g:394:3: ( rule__DataSymbol__Alternatives )
            // InternalSolverLanguage.g:394:4: rule__DataSymbol__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataSymbol__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataSymbolAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataSymbol"


    // $ANTLR start "entryRuleBooleanSymbol"
    // InternalSolverLanguage.g:403:1: entryRuleBooleanSymbol : ruleBooleanSymbol EOF ;
    public final void entryRuleBooleanSymbol() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:404:1: ( ruleBooleanSymbol EOF )
            // InternalSolverLanguage.g:405:1: ruleBooleanSymbol EOF
            {
             before(grammarAccess.getBooleanSymbolRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanSymbol();

            state._fsp--;

             after(grammarAccess.getBooleanSymbolRule()); 
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
    // $ANTLR end "entryRuleBooleanSymbol"


    // $ANTLR start "ruleBooleanSymbol"
    // InternalSolverLanguage.g:412:1: ruleBooleanSymbol : ( ( rule__BooleanSymbol__Group__0 ) ) ;
    public final void ruleBooleanSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:416:2: ( ( ( rule__BooleanSymbol__Group__0 ) ) )
            // InternalSolverLanguage.g:417:2: ( ( rule__BooleanSymbol__Group__0 ) )
            {
            // InternalSolverLanguage.g:417:2: ( ( rule__BooleanSymbol__Group__0 ) )
            // InternalSolverLanguage.g:418:3: ( rule__BooleanSymbol__Group__0 )
            {
             before(grammarAccess.getBooleanSymbolAccess().getGroup()); 
            // InternalSolverLanguage.g:419:3: ( rule__BooleanSymbol__Group__0 )
            // InternalSolverLanguage.g:419:4: rule__BooleanSymbol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanSymbol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanSymbolAccess().getGroup()); 

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
    // $ANTLR end "ruleBooleanSymbol"


    // $ANTLR start "entryRuleIntegerSymbol"
    // InternalSolverLanguage.g:428:1: entryRuleIntegerSymbol : ruleIntegerSymbol EOF ;
    public final void entryRuleIntegerSymbol() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:429:1: ( ruleIntegerSymbol EOF )
            // InternalSolverLanguage.g:430:1: ruleIntegerSymbol EOF
            {
             before(grammarAccess.getIntegerSymbolRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerSymbol();

            state._fsp--;

             after(grammarAccess.getIntegerSymbolRule()); 
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
    // $ANTLR end "entryRuleIntegerSymbol"


    // $ANTLR start "ruleIntegerSymbol"
    // InternalSolverLanguage.g:437:1: ruleIntegerSymbol : ( ( rule__IntegerSymbol__Group__0 ) ) ;
    public final void ruleIntegerSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:441:2: ( ( ( rule__IntegerSymbol__Group__0 ) ) )
            // InternalSolverLanguage.g:442:2: ( ( rule__IntegerSymbol__Group__0 ) )
            {
            // InternalSolverLanguage.g:442:2: ( ( rule__IntegerSymbol__Group__0 ) )
            // InternalSolverLanguage.g:443:3: ( rule__IntegerSymbol__Group__0 )
            {
             before(grammarAccess.getIntegerSymbolAccess().getGroup()); 
            // InternalSolverLanguage.g:444:3: ( rule__IntegerSymbol__Group__0 )
            // InternalSolverLanguage.g:444:4: rule__IntegerSymbol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerSymbol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerSymbolAccess().getGroup()); 

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
    // $ANTLR end "ruleIntegerSymbol"


    // $ANTLR start "entryRuleRealSymbol"
    // InternalSolverLanguage.g:453:1: entryRuleRealSymbol : ruleRealSymbol EOF ;
    public final void entryRuleRealSymbol() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:454:1: ( ruleRealSymbol EOF )
            // InternalSolverLanguage.g:455:1: ruleRealSymbol EOF
            {
             before(grammarAccess.getRealSymbolRule()); 
            pushFollow(FOLLOW_1);
            ruleRealSymbol();

            state._fsp--;

             after(grammarAccess.getRealSymbolRule()); 
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
    // $ANTLR end "entryRuleRealSymbol"


    // $ANTLR start "ruleRealSymbol"
    // InternalSolverLanguage.g:462:1: ruleRealSymbol : ( ( rule__RealSymbol__Group__0 ) ) ;
    public final void ruleRealSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:466:2: ( ( ( rule__RealSymbol__Group__0 ) ) )
            // InternalSolverLanguage.g:467:2: ( ( rule__RealSymbol__Group__0 ) )
            {
            // InternalSolverLanguage.g:467:2: ( ( rule__RealSymbol__Group__0 ) )
            // InternalSolverLanguage.g:468:3: ( rule__RealSymbol__Group__0 )
            {
             before(grammarAccess.getRealSymbolAccess().getGroup()); 
            // InternalSolverLanguage.g:469:3: ( rule__RealSymbol__Group__0 )
            // InternalSolverLanguage.g:469:4: rule__RealSymbol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RealSymbol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRealSymbolAccess().getGroup()); 

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
    // $ANTLR end "ruleRealSymbol"


    // $ANTLR start "entryRuleStringSymbol"
    // InternalSolverLanguage.g:478:1: entryRuleStringSymbol : ruleStringSymbol EOF ;
    public final void entryRuleStringSymbol() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:479:1: ( ruleStringSymbol EOF )
            // InternalSolverLanguage.g:480:1: ruleStringSymbol EOF
            {
             before(grammarAccess.getStringSymbolRule()); 
            pushFollow(FOLLOW_1);
            ruleStringSymbol();

            state._fsp--;

             after(grammarAccess.getStringSymbolRule()); 
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
    // $ANTLR end "entryRuleStringSymbol"


    // $ANTLR start "ruleStringSymbol"
    // InternalSolverLanguage.g:487:1: ruleStringSymbol : ( ( rule__StringSymbol__Group__0 ) ) ;
    public final void ruleStringSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:491:2: ( ( ( rule__StringSymbol__Group__0 ) ) )
            // InternalSolverLanguage.g:492:2: ( ( rule__StringSymbol__Group__0 ) )
            {
            // InternalSolverLanguage.g:492:2: ( ( rule__StringSymbol__Group__0 ) )
            // InternalSolverLanguage.g:493:3: ( rule__StringSymbol__Group__0 )
            {
             before(grammarAccess.getStringSymbolAccess().getGroup()); 
            // InternalSolverLanguage.g:494:3: ( rule__StringSymbol__Group__0 )
            // InternalSolverLanguage.g:494:4: rule__StringSymbol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringSymbol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringSymbolAccess().getGroup()); 

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
    // $ANTLR end "ruleStringSymbol"


    // $ANTLR start "entryRuleComplexObject"
    // InternalSolverLanguage.g:503:1: entryRuleComplexObject : ruleComplexObject EOF ;
    public final void entryRuleComplexObject() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:504:1: ( ruleComplexObject EOF )
            // InternalSolverLanguage.g:505:1: ruleComplexObject EOF
            {
             before(grammarAccess.getComplexObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexObject();

            state._fsp--;

             after(grammarAccess.getComplexObjectRule()); 
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
    // $ANTLR end "entryRuleComplexObject"


    // $ANTLR start "ruleComplexObject"
    // InternalSolverLanguage.g:512:1: ruleComplexObject : ( ( rule__ComplexObject__Alternatives ) ) ;
    public final void ruleComplexObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:516:2: ( ( ( rule__ComplexObject__Alternatives ) ) )
            // InternalSolverLanguage.g:517:2: ( ( rule__ComplexObject__Alternatives ) )
            {
            // InternalSolverLanguage.g:517:2: ( ( rule__ComplexObject__Alternatives ) )
            // InternalSolverLanguage.g:518:3: ( rule__ComplexObject__Alternatives )
            {
             before(grammarAccess.getComplexObjectAccess().getAlternatives()); 
            // InternalSolverLanguage.g:519:3: ( rule__ComplexObject__Alternatives )
            // InternalSolverLanguage.g:519:4: rule__ComplexObject__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComplexObject__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComplexObjectAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComplexObject"


    // $ANTLR start "entryRuleObject"
    // InternalSolverLanguage.g:528:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:529:1: ( ruleObject EOF )
            // InternalSolverLanguage.g:530:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getObjectRule()); 
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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalSolverLanguage.g:537:1: ruleObject : ( ( rule__Object__Alternatives ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:541:2: ( ( ( rule__Object__Alternatives ) ) )
            // InternalSolverLanguage.g:542:2: ( ( rule__Object__Alternatives ) )
            {
            // InternalSolverLanguage.g:542:2: ( ( rule__Object__Alternatives ) )
            // InternalSolverLanguage.g:543:3: ( rule__Object__Alternatives )
            {
             before(grammarAccess.getObjectAccess().getAlternatives()); 
            // InternalSolverLanguage.g:544:3: ( rule__Object__Alternatives )
            // InternalSolverLanguage.g:544:4: rule__Object__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Object__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getAlternatives()); 

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleNamedObject"
    // InternalSolverLanguage.g:553:1: entryRuleNamedObject : ruleNamedObject EOF ;
    public final void entryRuleNamedObject() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:554:1: ( ruleNamedObject EOF )
            // InternalSolverLanguage.g:555:1: ruleNamedObject EOF
            {
             before(grammarAccess.getNamedObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleNamedObject();

            state._fsp--;

             after(grammarAccess.getNamedObjectRule()); 
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
    // $ANTLR end "entryRuleNamedObject"


    // $ANTLR start "ruleNamedObject"
    // InternalSolverLanguage.g:562:1: ruleNamedObject : ( ( rule__NamedObject__Group__0 ) ) ;
    public final void ruleNamedObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:566:2: ( ( ( rule__NamedObject__Group__0 ) ) )
            // InternalSolverLanguage.g:567:2: ( ( rule__NamedObject__Group__0 ) )
            {
            // InternalSolverLanguage.g:567:2: ( ( rule__NamedObject__Group__0 ) )
            // InternalSolverLanguage.g:568:3: ( rule__NamedObject__Group__0 )
            {
             before(grammarAccess.getNamedObjectAccess().getGroup()); 
            // InternalSolverLanguage.g:569:3: ( rule__NamedObject__Group__0 )
            // InternalSolverLanguage.g:569:4: rule__NamedObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamedObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleNamedObject"


    // $ANTLR start "entryRuleUnnamedObject"
    // InternalSolverLanguage.g:578:1: entryRuleUnnamedObject : ruleUnnamedObject EOF ;
    public final void entryRuleUnnamedObject() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:579:1: ( ruleUnnamedObject EOF )
            // InternalSolverLanguage.g:580:1: ruleUnnamedObject EOF
            {
             before(grammarAccess.getUnnamedObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleUnnamedObject();

            state._fsp--;

             after(grammarAccess.getUnnamedObjectRule()); 
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
    // $ANTLR end "entryRuleUnnamedObject"


    // $ANTLR start "ruleUnnamedObject"
    // InternalSolverLanguage.g:587:1: ruleUnnamedObject : ( ( rule__UnnamedObject__NameAssignment ) ) ;
    public final void ruleUnnamedObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:591:2: ( ( ( rule__UnnamedObject__NameAssignment ) ) )
            // InternalSolverLanguage.g:592:2: ( ( rule__UnnamedObject__NameAssignment ) )
            {
            // InternalSolverLanguage.g:592:2: ( ( rule__UnnamedObject__NameAssignment ) )
            // InternalSolverLanguage.g:593:3: ( rule__UnnamedObject__NameAssignment )
            {
             before(grammarAccess.getUnnamedObjectAccess().getNameAssignment()); 
            // InternalSolverLanguage.g:594:3: ( rule__UnnamedObject__NameAssignment )
            // InternalSolverLanguage.g:594:4: rule__UnnamedObject__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__UnnamedObject__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUnnamedObjectAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleUnnamedObject"


    // $ANTLR start "entryRuleDataObject"
    // InternalSolverLanguage.g:603:1: entryRuleDataObject : ruleDataObject EOF ;
    public final void entryRuleDataObject() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:604:1: ( ruleDataObject EOF )
            // InternalSolverLanguage.g:605:1: ruleDataObject EOF
            {
             before(grammarAccess.getDataObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleDataObject();

            state._fsp--;

             after(grammarAccess.getDataObjectRule()); 
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
    // $ANTLR end "entryRuleDataObject"


    // $ANTLR start "ruleDataObject"
    // InternalSolverLanguage.g:612:1: ruleDataObject : ( ( rule__DataObject__Alternatives ) ) ;
    public final void ruleDataObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:616:2: ( ( ( rule__DataObject__Alternatives ) ) )
            // InternalSolverLanguage.g:617:2: ( ( rule__DataObject__Alternatives ) )
            {
            // InternalSolverLanguage.g:617:2: ( ( rule__DataObject__Alternatives ) )
            // InternalSolverLanguage.g:618:3: ( rule__DataObject__Alternatives )
            {
             before(grammarAccess.getDataObjectAccess().getAlternatives()); 
            // InternalSolverLanguage.g:619:3: ( rule__DataObject__Alternatives )
            // InternalSolverLanguage.g:619:4: rule__DataObject__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataObject__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataObjectAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataObject"


    // $ANTLR start "entryRuleBooleanObject"
    // InternalSolverLanguage.g:628:1: entryRuleBooleanObject : ruleBooleanObject EOF ;
    public final void entryRuleBooleanObject() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:629:1: ( ruleBooleanObject EOF )
            // InternalSolverLanguage.g:630:1: ruleBooleanObject EOF
            {
             before(grammarAccess.getBooleanObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanObject();

            state._fsp--;

             after(grammarAccess.getBooleanObjectRule()); 
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
    // $ANTLR end "entryRuleBooleanObject"


    // $ANTLR start "ruleBooleanObject"
    // InternalSolverLanguage.g:637:1: ruleBooleanObject : ( ( rule__BooleanObject__ValueAssignment ) ) ;
    public final void ruleBooleanObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:641:2: ( ( ( rule__BooleanObject__ValueAssignment ) ) )
            // InternalSolverLanguage.g:642:2: ( ( rule__BooleanObject__ValueAssignment ) )
            {
            // InternalSolverLanguage.g:642:2: ( ( rule__BooleanObject__ValueAssignment ) )
            // InternalSolverLanguage.g:643:3: ( rule__BooleanObject__ValueAssignment )
            {
             before(grammarAccess.getBooleanObjectAccess().getValueAssignment()); 
            // InternalSolverLanguage.g:644:3: ( rule__BooleanObject__ValueAssignment )
            // InternalSolverLanguage.g:644:4: rule__BooleanObject__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanObject__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanObjectAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleBooleanObject"


    // $ANTLR start "entryRuleIntObject"
    // InternalSolverLanguage.g:653:1: entryRuleIntObject : ruleIntObject EOF ;
    public final void entryRuleIntObject() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:654:1: ( ruleIntObject EOF )
            // InternalSolverLanguage.g:655:1: ruleIntObject EOF
            {
             before(grammarAccess.getIntObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleIntObject();

            state._fsp--;

             after(grammarAccess.getIntObjectRule()); 
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
    // $ANTLR end "entryRuleIntObject"


    // $ANTLR start "ruleIntObject"
    // InternalSolverLanguage.g:662:1: ruleIntObject : ( ( rule__IntObject__ValueAssignment ) ) ;
    public final void ruleIntObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:666:2: ( ( ( rule__IntObject__ValueAssignment ) ) )
            // InternalSolverLanguage.g:667:2: ( ( rule__IntObject__ValueAssignment ) )
            {
            // InternalSolverLanguage.g:667:2: ( ( rule__IntObject__ValueAssignment ) )
            // InternalSolverLanguage.g:668:3: ( rule__IntObject__ValueAssignment )
            {
             before(grammarAccess.getIntObjectAccess().getValueAssignment()); 
            // InternalSolverLanguage.g:669:3: ( rule__IntObject__ValueAssignment )
            // InternalSolverLanguage.g:669:4: rule__IntObject__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntObject__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntObjectAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleIntObject"


    // $ANTLR start "entryRuleRealObject"
    // InternalSolverLanguage.g:678:1: entryRuleRealObject : ruleRealObject EOF ;
    public final void entryRuleRealObject() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:679:1: ( ruleRealObject EOF )
            // InternalSolverLanguage.g:680:1: ruleRealObject EOF
            {
             before(grammarAccess.getRealObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleRealObject();

            state._fsp--;

             after(grammarAccess.getRealObjectRule()); 
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
    // $ANTLR end "entryRuleRealObject"


    // $ANTLR start "ruleRealObject"
    // InternalSolverLanguage.g:687:1: ruleRealObject : ( ( rule__RealObject__ValueAssignment ) ) ;
    public final void ruleRealObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:691:2: ( ( ( rule__RealObject__ValueAssignment ) ) )
            // InternalSolverLanguage.g:692:2: ( ( rule__RealObject__ValueAssignment ) )
            {
            // InternalSolverLanguage.g:692:2: ( ( rule__RealObject__ValueAssignment ) )
            // InternalSolverLanguage.g:693:3: ( rule__RealObject__ValueAssignment )
            {
             before(grammarAccess.getRealObjectAccess().getValueAssignment()); 
            // InternalSolverLanguage.g:694:3: ( rule__RealObject__ValueAssignment )
            // InternalSolverLanguage.g:694:4: rule__RealObject__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RealObject__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRealObjectAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleRealObject"


    // $ANTLR start "entryRuleStringObject"
    // InternalSolverLanguage.g:703:1: entryRuleStringObject : ruleStringObject EOF ;
    public final void entryRuleStringObject() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:704:1: ( ruleStringObject EOF )
            // InternalSolverLanguage.g:705:1: ruleStringObject EOF
            {
             before(grammarAccess.getStringObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleStringObject();

            state._fsp--;

             after(grammarAccess.getStringObjectRule()); 
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
    // $ANTLR end "entryRuleStringObject"


    // $ANTLR start "ruleStringObject"
    // InternalSolverLanguage.g:712:1: ruleStringObject : ( ( rule__StringObject__ValueAssignment ) ) ;
    public final void ruleStringObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:716:2: ( ( ( rule__StringObject__ValueAssignment ) ) )
            // InternalSolverLanguage.g:717:2: ( ( rule__StringObject__ValueAssignment ) )
            {
            // InternalSolverLanguage.g:717:2: ( ( rule__StringObject__ValueAssignment ) )
            // InternalSolverLanguage.g:718:3: ( rule__StringObject__ValueAssignment )
            {
             before(grammarAccess.getStringObjectAccess().getValueAssignment()); 
            // InternalSolverLanguage.g:719:3: ( rule__StringObject__ValueAssignment )
            // InternalSolverLanguage.g:719:4: rule__StringObject__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringObject__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringObjectAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStringObject"


    // $ANTLR start "entryRulePredicate"
    // InternalSolverLanguage.g:728:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:729:1: ( rulePredicate EOF )
            // InternalSolverLanguage.g:730:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalSolverLanguage.g:737:1: rulePredicate : ( ( rule__Predicate__Group__0 ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:741:2: ( ( ( rule__Predicate__Group__0 ) ) )
            // InternalSolverLanguage.g:742:2: ( ( rule__Predicate__Group__0 ) )
            {
            // InternalSolverLanguage.g:742:2: ( ( rule__Predicate__Group__0 ) )
            // InternalSolverLanguage.g:743:3: ( rule__Predicate__Group__0 )
            {
             before(grammarAccess.getPredicateAccess().getGroup()); 
            // InternalSolverLanguage.g:744:3: ( rule__Predicate__Group__0 )
            // InternalSolverLanguage.g:744:4: rule__Predicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getGroup()); 

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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleParameter"
    // InternalSolverLanguage.g:753:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:754:1: ( ruleParameter EOF )
            // InternalSolverLanguage.g:755:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSolverLanguage.g:762:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:766:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalSolverLanguage.g:767:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalSolverLanguage.g:767:2: ( ( rule__Parameter__Group__0 ) )
            // InternalSolverLanguage.g:768:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalSolverLanguage.g:769:3: ( rule__Parameter__Group__0 )
            // InternalSolverLanguage.g:769:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRulePatternBody"
    // InternalSolverLanguage.g:778:1: entryRulePatternBody : rulePatternBody EOF ;
    public final void entryRulePatternBody() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:779:1: ( rulePatternBody EOF )
            // InternalSolverLanguage.g:780:1: rulePatternBody EOF
            {
             before(grammarAccess.getPatternBodyRule()); 
            pushFollow(FOLLOW_1);
            rulePatternBody();

            state._fsp--;

             after(grammarAccess.getPatternBodyRule()); 
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
    // $ANTLR end "entryRulePatternBody"


    // $ANTLR start "rulePatternBody"
    // InternalSolverLanguage.g:787:1: rulePatternBody : ( ( rule__PatternBody__Group__0 ) ) ;
    public final void rulePatternBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:791:2: ( ( ( rule__PatternBody__Group__0 ) ) )
            // InternalSolverLanguage.g:792:2: ( ( rule__PatternBody__Group__0 ) )
            {
            // InternalSolverLanguage.g:792:2: ( ( rule__PatternBody__Group__0 ) )
            // InternalSolverLanguage.g:793:3: ( rule__PatternBody__Group__0 )
            {
             before(grammarAccess.getPatternBodyAccess().getGroup()); 
            // InternalSolverLanguage.g:794:3: ( rule__PatternBody__Group__0 )
            // InternalSolverLanguage.g:794:4: rule__PatternBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternBodyAccess().getGroup()); 

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
    // $ANTLR end "rulePatternBody"


    // $ANTLR start "entryRulePolarity"
    // InternalSolverLanguage.g:803:1: entryRulePolarity : rulePolarity EOF ;
    public final void entryRulePolarity() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:804:1: ( rulePolarity EOF )
            // InternalSolverLanguage.g:805:1: rulePolarity EOF
            {
             before(grammarAccess.getPolarityRule()); 
            pushFollow(FOLLOW_1);
            rulePolarity();

            state._fsp--;

             after(grammarAccess.getPolarityRule()); 
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
    // $ANTLR end "entryRulePolarity"


    // $ANTLR start "rulePolarity"
    // InternalSolverLanguage.g:812:1: rulePolarity : ( ( rule__Polarity__Alternatives ) ) ;
    public final void rulePolarity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:816:2: ( ( ( rule__Polarity__Alternatives ) ) )
            // InternalSolverLanguage.g:817:2: ( ( rule__Polarity__Alternatives ) )
            {
            // InternalSolverLanguage.g:817:2: ( ( rule__Polarity__Alternatives ) )
            // InternalSolverLanguage.g:818:3: ( rule__Polarity__Alternatives )
            {
             before(grammarAccess.getPolarityAccess().getAlternatives()); 
            // InternalSolverLanguage.g:819:3: ( rule__Polarity__Alternatives )
            // InternalSolverLanguage.g:819:4: rule__Polarity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Polarity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPolarityAccess().getAlternatives()); 

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
    // $ANTLR end "rulePolarity"


    // $ANTLR start "entryRuleConstraint"
    // InternalSolverLanguage.g:828:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:829:1: ( ruleConstraint EOF )
            // InternalSolverLanguage.g:830:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalSolverLanguage.g:837:1: ruleConstraint : ( ( rule__Constraint__Alternatives ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:841:2: ( ( ( rule__Constraint__Alternatives ) ) )
            // InternalSolverLanguage.g:842:2: ( ( rule__Constraint__Alternatives ) )
            {
            // InternalSolverLanguage.g:842:2: ( ( rule__Constraint__Alternatives ) )
            // InternalSolverLanguage.g:843:3: ( rule__Constraint__Alternatives )
            {
             before(grammarAccess.getConstraintAccess().getAlternatives()); 
            // InternalSolverLanguage.g:844:3: ( rule__Constraint__Alternatives )
            // InternalSolverLanguage.g:844:4: rule__Constraint__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleClosureType"
    // InternalSolverLanguage.g:853:1: entryRuleClosureType : ruleClosureType EOF ;
    public final void entryRuleClosureType() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:854:1: ( ruleClosureType EOF )
            // InternalSolverLanguage.g:855:1: ruleClosureType EOF
            {
             before(grammarAccess.getClosureTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleClosureType();

            state._fsp--;

             after(grammarAccess.getClosureTypeRule()); 
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
    // $ANTLR end "entryRuleClosureType"


    // $ANTLR start "ruleClosureType"
    // InternalSolverLanguage.g:862:1: ruleClosureType : ( ( rule__ClosureType__Alternatives ) ) ;
    public final void ruleClosureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:866:2: ( ( ( rule__ClosureType__Alternatives ) ) )
            // InternalSolverLanguage.g:867:2: ( ( rule__ClosureType__Alternatives ) )
            {
            // InternalSolverLanguage.g:867:2: ( ( rule__ClosureType__Alternatives ) )
            // InternalSolverLanguage.g:868:3: ( rule__ClosureType__Alternatives )
            {
             before(grammarAccess.getClosureTypeAccess().getAlternatives()); 
            // InternalSolverLanguage.g:869:3: ( rule__ClosureType__Alternatives )
            // InternalSolverLanguage.g:869:4: rule__ClosureType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClosureType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClosureTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleClosureType"


    // $ANTLR start "entryRuleLiteral"
    // InternalSolverLanguage.g:878:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:879:1: ( ruleLiteral EOF )
            // InternalSolverLanguage.g:880:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalSolverLanguage.g:887:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:891:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalSolverLanguage.g:892:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalSolverLanguage.g:892:2: ( ( rule__Literal__Alternatives ) )
            // InternalSolverLanguage.g:893:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalSolverLanguage.g:894:3: ( rule__Literal__Alternatives )
            // InternalSolverLanguage.g:894:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleVariable"
    // InternalSolverLanguage.g:903:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:904:1: ( ruleVariable EOF )
            // InternalSolverLanguage.g:905:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalSolverLanguage.g:912:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:916:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalSolverLanguage.g:917:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalSolverLanguage.g:917:2: ( ( rule__Variable__NameAssignment ) )
            // InternalSolverLanguage.g:918:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalSolverLanguage.g:919:3: ( rule__Variable__NameAssignment )
            // InternalSolverLanguage.g:919:4: rule__Variable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAllInstances"
    // InternalSolverLanguage.g:928:1: entryRuleAllInstances : ruleAllInstances EOF ;
    public final void entryRuleAllInstances() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:929:1: ( ruleAllInstances EOF )
            // InternalSolverLanguage.g:930:1: ruleAllInstances EOF
            {
             before(grammarAccess.getAllInstancesRule()); 
            pushFollow(FOLLOW_1);
            ruleAllInstances();

            state._fsp--;

             after(grammarAccess.getAllInstancesRule()); 
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
    // $ANTLR end "entryRuleAllInstances"


    // $ANTLR start "ruleAllInstances"
    // InternalSolverLanguage.g:937:1: ruleAllInstances : ( ( rule__AllInstances__Group__0 ) ) ;
    public final void ruleAllInstances() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:941:2: ( ( ( rule__AllInstances__Group__0 ) ) )
            // InternalSolverLanguage.g:942:2: ( ( rule__AllInstances__Group__0 ) )
            {
            // InternalSolverLanguage.g:942:2: ( ( rule__AllInstances__Group__0 ) )
            // InternalSolverLanguage.g:943:3: ( rule__AllInstances__Group__0 )
            {
             before(grammarAccess.getAllInstancesAccess().getGroup()); 
            // InternalSolverLanguage.g:944:3: ( rule__AllInstances__Group__0 )
            // InternalSolverLanguage.g:944:4: rule__AllInstances__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getGroup()); 

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
    // $ANTLR end "ruleAllInstances"


    // $ANTLR start "entryRuleAllObjects"
    // InternalSolverLanguage.g:953:1: entryRuleAllObjects : ruleAllObjects EOF ;
    public final void entryRuleAllObjects() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:954:1: ( ruleAllObjects EOF )
            // InternalSolverLanguage.g:955:1: ruleAllObjects EOF
            {
             before(grammarAccess.getAllObjectsRule()); 
            pushFollow(FOLLOW_1);
            ruleAllObjects();

            state._fsp--;

             after(grammarAccess.getAllObjectsRule()); 
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
    // $ANTLR end "entryRuleAllObjects"


    // $ANTLR start "ruleAllObjects"
    // InternalSolverLanguage.g:962:1: ruleAllObjects : ( ( rule__AllObjects__Group__0 ) ) ;
    public final void ruleAllObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:966:2: ( ( ( rule__AllObjects__Group__0 ) ) )
            // InternalSolverLanguage.g:967:2: ( ( rule__AllObjects__Group__0 ) )
            {
            // InternalSolverLanguage.g:967:2: ( ( rule__AllObjects__Group__0 ) )
            // InternalSolverLanguage.g:968:3: ( rule__AllObjects__Group__0 )
            {
             before(grammarAccess.getAllObjectsAccess().getGroup()); 
            // InternalSolverLanguage.g:969:3: ( rule__AllObjects__Group__0 )
            // InternalSolverLanguage.g:969:4: rule__AllObjects__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllObjects__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllObjectsAccess().getGroup()); 

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
    // $ANTLR end "ruleAllObjects"


    // $ANTLR start "entryRuleDefaultInterpretation"
    // InternalSolverLanguage.g:978:1: entryRuleDefaultInterpretation : ruleDefaultInterpretation EOF ;
    public final void entryRuleDefaultInterpretation() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:979:1: ( ruleDefaultInterpretation EOF )
            // InternalSolverLanguage.g:980:1: ruleDefaultInterpretation EOF
            {
             before(grammarAccess.getDefaultInterpretationRule()); 
            pushFollow(FOLLOW_1);
            ruleDefaultInterpretation();

            state._fsp--;

             after(grammarAccess.getDefaultInterpretationRule()); 
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
    // $ANTLR end "entryRuleDefaultInterpretation"


    // $ANTLR start "ruleDefaultInterpretation"
    // InternalSolverLanguage.g:987:1: ruleDefaultInterpretation : ( ( rule__DefaultInterpretation__Group__0 ) ) ;
    public final void ruleDefaultInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:991:2: ( ( ( rule__DefaultInterpretation__Group__0 ) ) )
            // InternalSolverLanguage.g:992:2: ( ( rule__DefaultInterpretation__Group__0 ) )
            {
            // InternalSolverLanguage.g:992:2: ( ( rule__DefaultInterpretation__Group__0 ) )
            // InternalSolverLanguage.g:993:3: ( rule__DefaultInterpretation__Group__0 )
            {
             before(grammarAccess.getDefaultInterpretationAccess().getGroup()); 
            // InternalSolverLanguage.g:994:3: ( rule__DefaultInterpretation__Group__0 )
            // InternalSolverLanguage.g:994:4: rule__DefaultInterpretation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefaultInterpretation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultInterpretationAccess().getGroup()); 

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
    // $ANTLR end "ruleDefaultInterpretation"


    // $ANTLR start "entryRuleCDInterpretation"
    // InternalSolverLanguage.g:1003:1: entryRuleCDInterpretation : ruleCDInterpretation EOF ;
    public final void entryRuleCDInterpretation() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:1004:1: ( ruleCDInterpretation EOF )
            // InternalSolverLanguage.g:1005:1: ruleCDInterpretation EOF
            {
             before(grammarAccess.getCDInterpretationRule()); 
            pushFollow(FOLLOW_1);
            ruleCDInterpretation();

            state._fsp--;

             after(grammarAccess.getCDInterpretationRule()); 
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
    // $ANTLR end "entryRuleCDInterpretation"


    // $ANTLR start "ruleCDInterpretation"
    // InternalSolverLanguage.g:1012:1: ruleCDInterpretation : ( ( rule__CDInterpretation__Alternatives ) ) ;
    public final void ruleCDInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1016:2: ( ( ( rule__CDInterpretation__Alternatives ) ) )
            // InternalSolverLanguage.g:1017:2: ( ( rule__CDInterpretation__Alternatives ) )
            {
            // InternalSolverLanguage.g:1017:2: ( ( rule__CDInterpretation__Alternatives ) )
            // InternalSolverLanguage.g:1018:3: ( rule__CDInterpretation__Alternatives )
            {
             before(grammarAccess.getCDInterpretationAccess().getAlternatives()); 
            // InternalSolverLanguage.g:1019:3: ( rule__CDInterpretation__Alternatives )
            // InternalSolverLanguage.g:1019:4: rule__CDInterpretation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CDInterpretation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCDInterpretationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCDInterpretation"


    // $ANTLR start "entryRuleClassInterpretation"
    // InternalSolverLanguage.g:1028:1: entryRuleClassInterpretation : ruleClassInterpretation EOF ;
    public final void entryRuleClassInterpretation() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:1029:1: ( ruleClassInterpretation EOF )
            // InternalSolverLanguage.g:1030:1: ruleClassInterpretation EOF
            {
             before(grammarAccess.getClassInterpretationRule()); 
            pushFollow(FOLLOW_1);
            ruleClassInterpretation();

            state._fsp--;

             after(grammarAccess.getClassInterpretationRule()); 
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
    // $ANTLR end "entryRuleClassInterpretation"


    // $ANTLR start "ruleClassInterpretation"
    // InternalSolverLanguage.g:1037:1: ruleClassInterpretation : ( ( rule__ClassInterpretation__Group__0 ) ) ;
    public final void ruleClassInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1041:2: ( ( ( rule__ClassInterpretation__Group__0 ) ) )
            // InternalSolverLanguage.g:1042:2: ( ( rule__ClassInterpretation__Group__0 ) )
            {
            // InternalSolverLanguage.g:1042:2: ( ( rule__ClassInterpretation__Group__0 ) )
            // InternalSolverLanguage.g:1043:3: ( rule__ClassInterpretation__Group__0 )
            {
             before(grammarAccess.getClassInterpretationAccess().getGroup()); 
            // InternalSolverLanguage.g:1044:3: ( rule__ClassInterpretation__Group__0 )
            // InternalSolverLanguage.g:1044:4: rule__ClassInterpretation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassInterpretation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassInterpretationAccess().getGroup()); 

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
    // $ANTLR end "ruleClassInterpretation"


    // $ANTLR start "entryRuleEnumInterpretation"
    // InternalSolverLanguage.g:1053:1: entryRuleEnumInterpretation : ruleEnumInterpretation EOF ;
    public final void entryRuleEnumInterpretation() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:1054:1: ( ruleEnumInterpretation EOF )
            // InternalSolverLanguage.g:1055:1: ruleEnumInterpretation EOF
            {
             before(grammarAccess.getEnumInterpretationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumInterpretation();

            state._fsp--;

             after(grammarAccess.getEnumInterpretationRule()); 
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
    // $ANTLR end "entryRuleEnumInterpretation"


    // $ANTLR start "ruleEnumInterpretation"
    // InternalSolverLanguage.g:1062:1: ruleEnumInterpretation : ( ( rule__EnumInterpretation__Group__0 ) ) ;
    public final void ruleEnumInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1066:2: ( ( ( rule__EnumInterpretation__Group__0 ) ) )
            // InternalSolverLanguage.g:1067:2: ( ( rule__EnumInterpretation__Group__0 ) )
            {
            // InternalSolverLanguage.g:1067:2: ( ( rule__EnumInterpretation__Group__0 ) )
            // InternalSolverLanguage.g:1068:3: ( rule__EnumInterpretation__Group__0 )
            {
             before(grammarAccess.getEnumInterpretationAccess().getGroup()); 
            // InternalSolverLanguage.g:1069:3: ( rule__EnumInterpretation__Group__0 )
            // InternalSolverLanguage.g:1069:4: rule__EnumInterpretation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumInterpretation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumInterpretationAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumInterpretation"


    // $ANTLR start "entryRuleFieldRelationInterpretation"
    // InternalSolverLanguage.g:1078:1: entryRuleFieldRelationInterpretation : ruleFieldRelationInterpretation EOF ;
    public final void entryRuleFieldRelationInterpretation() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:1079:1: ( ruleFieldRelationInterpretation EOF )
            // InternalSolverLanguage.g:1080:1: ruleFieldRelationInterpretation EOF
            {
             before(grammarAccess.getFieldRelationInterpretationRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldRelationInterpretation();

            state._fsp--;

             after(grammarAccess.getFieldRelationInterpretationRule()); 
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
    // $ANTLR end "entryRuleFieldRelationInterpretation"


    // $ANTLR start "ruleFieldRelationInterpretation"
    // InternalSolverLanguage.g:1087:1: ruleFieldRelationInterpretation : ( ( rule__FieldRelationInterpretation__Group__0 ) ) ;
    public final void ruleFieldRelationInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1091:2: ( ( ( rule__FieldRelationInterpretation__Group__0 ) ) )
            // InternalSolverLanguage.g:1092:2: ( ( rule__FieldRelationInterpretation__Group__0 ) )
            {
            // InternalSolverLanguage.g:1092:2: ( ( rule__FieldRelationInterpretation__Group__0 ) )
            // InternalSolverLanguage.g:1093:3: ( rule__FieldRelationInterpretation__Group__0 )
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getGroup()); 
            // InternalSolverLanguage.g:1094:3: ( rule__FieldRelationInterpretation__Group__0 )
            // InternalSolverLanguage.g:1094:4: rule__FieldRelationInterpretation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldRelationInterpretation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldRelationInterpretationAccess().getGroup()); 

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
    // $ANTLR end "ruleFieldRelationInterpretation"


    // $ANTLR start "entryRuleGlobalRelationInterpretation"
    // InternalSolverLanguage.g:1103:1: entryRuleGlobalRelationInterpretation : ruleGlobalRelationInterpretation EOF ;
    public final void entryRuleGlobalRelationInterpretation() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:1104:1: ( ruleGlobalRelationInterpretation EOF )
            // InternalSolverLanguage.g:1105:1: ruleGlobalRelationInterpretation EOF
            {
             before(grammarAccess.getGlobalRelationInterpretationRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalRelationInterpretation();

            state._fsp--;

             after(grammarAccess.getGlobalRelationInterpretationRule()); 
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
    // $ANTLR end "entryRuleGlobalRelationInterpretation"


    // $ANTLR start "ruleGlobalRelationInterpretation"
    // InternalSolverLanguage.g:1112:1: ruleGlobalRelationInterpretation : ( ( rule__GlobalRelationInterpretation__Group__0 ) ) ;
    public final void ruleGlobalRelationInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1116:2: ( ( ( rule__GlobalRelationInterpretation__Group__0 ) ) )
            // InternalSolverLanguage.g:1117:2: ( ( rule__GlobalRelationInterpretation__Group__0 ) )
            {
            // InternalSolverLanguage.g:1117:2: ( ( rule__GlobalRelationInterpretation__Group__0 ) )
            // InternalSolverLanguage.g:1118:3: ( rule__GlobalRelationInterpretation__Group__0 )
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getGroup()); 
            // InternalSolverLanguage.g:1119:3: ( rule__GlobalRelationInterpretation__Group__0 )
            // InternalSolverLanguage.g:1119:4: rule__GlobalRelationInterpretation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalRelationInterpretation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalRelationInterpretationAccess().getGroup()); 

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
    // $ANTLR end "ruleGlobalRelationInterpretation"


    // $ANTLR start "entryRuleMultiplicityDefinition"
    // InternalSolverLanguage.g:1128:1: entryRuleMultiplicityDefinition : ruleMultiplicityDefinition EOF ;
    public final void entryRuleMultiplicityDefinition() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:1129:1: ( ruleMultiplicityDefinition EOF )
            // InternalSolverLanguage.g:1130:1: ruleMultiplicityDefinition EOF
            {
             before(grammarAccess.getMultiplicityDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicityDefinition();

            state._fsp--;

             after(grammarAccess.getMultiplicityDefinitionRule()); 
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
    // $ANTLR end "entryRuleMultiplicityDefinition"


    // $ANTLR start "ruleMultiplicityDefinition"
    // InternalSolverLanguage.g:1137:1: ruleMultiplicityDefinition : ( ( rule__MultiplicityDefinition__Group__0 ) ) ;
    public final void ruleMultiplicityDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1141:2: ( ( ( rule__MultiplicityDefinition__Group__0 ) ) )
            // InternalSolverLanguage.g:1142:2: ( ( rule__MultiplicityDefinition__Group__0 ) )
            {
            // InternalSolverLanguage.g:1142:2: ( ( rule__MultiplicityDefinition__Group__0 ) )
            // InternalSolverLanguage.g:1143:3: ( rule__MultiplicityDefinition__Group__0 )
            {
             before(grammarAccess.getMultiplicityDefinitionAccess().getGroup()); 
            // InternalSolverLanguage.g:1144:3: ( rule__MultiplicityDefinition__Group__0 )
            // InternalSolverLanguage.g:1144:4: rule__MultiplicityDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiplicityDefinition"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalSolverLanguage.g:1152:1: rule__Statement__Alternatives : ( ( ruleInterpretation ) | ( rulePredicate ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1156:1: ( ( ruleInterpretation ) | ( rulePredicate ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSolverLanguage.g:1157:2: ( ruleInterpretation )
                    {
                    // InternalSolverLanguage.g:1157:2: ( ruleInterpretation )
                    // InternalSolverLanguage.g:1158:3: ruleInterpretation
                    {
                     before(grammarAccess.getStatementAccess().getInterpretationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInterpretation();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getInterpretationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1163:2: ( rulePredicate )
                    {
                    // InternalSolverLanguage.g:1163:2: ( rulePredicate )
                    // InternalSolverLanguage.g:1164:3: rulePredicate
                    {
                     before(grammarAccess.getStatementAccess().getPredicateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePredicate();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPredicateParserRuleCall_1()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__BooleanValue__Alternatives"
    // InternalSolverLanguage.g:1173:1: rule__BooleanValue__Alternatives : ( ( ( rule__BooleanValue__Group_0__0 ) ) | ( ( rule__BooleanValue__Group_1__0 ) ) );
    public final void rule__BooleanValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1177:1: ( ( ( rule__BooleanValue__Group_0__0 ) ) | ( ( rule__BooleanValue__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSolverLanguage.g:1178:2: ( ( rule__BooleanValue__Group_0__0 ) )
                    {
                    // InternalSolverLanguage.g:1178:2: ( ( rule__BooleanValue__Group_0__0 ) )
                    // InternalSolverLanguage.g:1179:3: ( rule__BooleanValue__Group_0__0 )
                    {
                     before(grammarAccess.getBooleanValueAccess().getGroup_0()); 
                    // InternalSolverLanguage.g:1180:3: ( rule__BooleanValue__Group_0__0 )
                    // InternalSolverLanguage.g:1180:4: rule__BooleanValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanValue__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanValueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1184:2: ( ( rule__BooleanValue__Group_1__0 ) )
                    {
                    // InternalSolverLanguage.g:1184:2: ( ( rule__BooleanValue__Group_1__0 ) )
                    // InternalSolverLanguage.g:1185:3: ( rule__BooleanValue__Group_1__0 )
                    {
                     before(grammarAccess.getBooleanValueAccess().getGroup_1()); 
                    // InternalSolverLanguage.g:1186:3: ( rule__BooleanValue__Group_1__0 )
                    // InternalSolverLanguage.g:1186:4: rule__BooleanValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanValue__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanValueAccess().getGroup_1()); 

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
    // $ANTLR end "rule__BooleanValue__Alternatives"


    // $ANTLR start "rule__TruthValue__Alternatives"
    // InternalSolverLanguage.g:1194:1: rule__TruthValue__Alternatives : ( ( ( rule__TruthValue__Group_0__0 ) ) | ( ( rule__TruthValue__Group_1__0 ) ) | ( ( rule__TruthValue__Group_2__0 ) ) | ( ( rule__TruthValue__Group_3__0 ) ) );
    public final void rule__TruthValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1198:1: ( ( ( rule__TruthValue__Group_0__0 ) ) | ( ( rule__TruthValue__Group_1__0 ) ) | ( ( rule__TruthValue__Group_2__0 ) ) | ( ( rule__TruthValue__Group_3__0 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 11:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSolverLanguage.g:1199:2: ( ( rule__TruthValue__Group_0__0 ) )
                    {
                    // InternalSolverLanguage.g:1199:2: ( ( rule__TruthValue__Group_0__0 ) )
                    // InternalSolverLanguage.g:1200:3: ( rule__TruthValue__Group_0__0 )
                    {
                     before(grammarAccess.getTruthValueAccess().getGroup_0()); 
                    // InternalSolverLanguage.g:1201:3: ( rule__TruthValue__Group_0__0 )
                    // InternalSolverLanguage.g:1201:4: rule__TruthValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TruthValue__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTruthValueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1205:2: ( ( rule__TruthValue__Group_1__0 ) )
                    {
                    // InternalSolverLanguage.g:1205:2: ( ( rule__TruthValue__Group_1__0 ) )
                    // InternalSolverLanguage.g:1206:3: ( rule__TruthValue__Group_1__0 )
                    {
                     before(grammarAccess.getTruthValueAccess().getGroup_1()); 
                    // InternalSolverLanguage.g:1207:3: ( rule__TruthValue__Group_1__0 )
                    // InternalSolverLanguage.g:1207:4: rule__TruthValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TruthValue__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTruthValueAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:1211:2: ( ( rule__TruthValue__Group_2__0 ) )
                    {
                    // InternalSolverLanguage.g:1211:2: ( ( rule__TruthValue__Group_2__0 ) )
                    // InternalSolverLanguage.g:1212:3: ( rule__TruthValue__Group_2__0 )
                    {
                     before(grammarAccess.getTruthValueAccess().getGroup_2()); 
                    // InternalSolverLanguage.g:1213:3: ( rule__TruthValue__Group_2__0 )
                    // InternalSolverLanguage.g:1213:4: rule__TruthValue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TruthValue__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTruthValueAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguage.g:1217:2: ( ( rule__TruthValue__Group_3__0 ) )
                    {
                    // InternalSolverLanguage.g:1217:2: ( ( rule__TruthValue__Group_3__0 ) )
                    // InternalSolverLanguage.g:1218:3: ( rule__TruthValue__Group_3__0 )
                    {
                     before(grammarAccess.getTruthValueAccess().getGroup_3()); 
                    // InternalSolverLanguage.g:1219:3: ( rule__TruthValue__Group_3__0 )
                    // InternalSolverLanguage.g:1219:4: rule__TruthValue__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TruthValue__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTruthValueAccess().getGroup_3()); 

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
    // $ANTLR end "rule__TruthValue__Alternatives"


    // $ANTLR start "rule__Interpretation__Alternatives"
    // InternalSolverLanguage.g:1227:1: rule__Interpretation__Alternatives : ( ( ruleBasicInterpretation ) | ( ruleDefaultInterpretation ) | ( ruleCDInterpretation ) );
    public final void rule__Interpretation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1231:1: ( ( ruleBasicInterpretation ) | ( ruleDefaultInterpretation ) | ( ruleCDInterpretation ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 33:
            case 37:
            case 38:
            case 40:
            case 41:
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
                    // InternalSolverLanguage.g:1232:2: ( ruleBasicInterpretation )
                    {
                    // InternalSolverLanguage.g:1232:2: ( ruleBasicInterpretation )
                    // InternalSolverLanguage.g:1233:3: ruleBasicInterpretation
                    {
                     before(grammarAccess.getInterpretationAccess().getBasicInterpretationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicInterpretation();

                    state._fsp--;

                     after(grammarAccess.getInterpretationAccess().getBasicInterpretationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1238:2: ( ruleDefaultInterpretation )
                    {
                    // InternalSolverLanguage.g:1238:2: ( ruleDefaultInterpretation )
                    // InternalSolverLanguage.g:1239:3: ruleDefaultInterpretation
                    {
                     before(grammarAccess.getInterpretationAccess().getDefaultInterpretationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDefaultInterpretation();

                    state._fsp--;

                     after(grammarAccess.getInterpretationAccess().getDefaultInterpretationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:1244:2: ( ruleCDInterpretation )
                    {
                    // InternalSolverLanguage.g:1244:2: ( ruleCDInterpretation )
                    // InternalSolverLanguage.g:1245:3: ruleCDInterpretation
                    {
                     before(grammarAccess.getInterpretationAccess().getCDInterpretationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCDInterpretation();

                    state._fsp--;

                     after(grammarAccess.getInterpretationAccess().getCDInterpretationParserRuleCall_2()); 

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
    // $ANTLR end "rule__Interpretation__Alternatives"


    // $ANTLR start "rule__Symbol__Alternatives"
    // InternalSolverLanguage.g:1254:1: rule__Symbol__Alternatives : ( ( ruleModelSymbol ) | ( rulePartialitySymbol ) | ( ruleDataSymbol ) );
    public final void rule__Symbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1258:1: ( ( ruleModelSymbol ) | ( rulePartialitySymbol ) | ( ruleDataSymbol ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 21:
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSolverLanguage.g:1259:2: ( ruleModelSymbol )
                    {
                    // InternalSolverLanguage.g:1259:2: ( ruleModelSymbol )
                    // InternalSolverLanguage.g:1260:3: ruleModelSymbol
                    {
                     before(grammarAccess.getSymbolAccess().getModelSymbolParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleModelSymbol();

                    state._fsp--;

                     after(grammarAccess.getSymbolAccess().getModelSymbolParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1265:2: ( rulePartialitySymbol )
                    {
                    // InternalSolverLanguage.g:1265:2: ( rulePartialitySymbol )
                    // InternalSolverLanguage.g:1266:3: rulePartialitySymbol
                    {
                     before(grammarAccess.getSymbolAccess().getPartialitySymbolParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePartialitySymbol();

                    state._fsp--;

                     after(grammarAccess.getSymbolAccess().getPartialitySymbolParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:1271:2: ( ruleDataSymbol )
                    {
                    // InternalSolverLanguage.g:1271:2: ( ruleDataSymbol )
                    // InternalSolverLanguage.g:1272:3: ruleDataSymbol
                    {
                     before(grammarAccess.getSymbolAccess().getDataSymbolParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDataSymbol();

                    state._fsp--;

                     after(grammarAccess.getSymbolAccess().getDataSymbolParserRuleCall_2()); 

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
    // $ANTLR end "rule__Symbol__Alternatives"


    // $ANTLR start "rule__PartialitySymbol__Alternatives"
    // InternalSolverLanguage.g:1281:1: rule__PartialitySymbol__Alternatives : ( ( ruleExistSymbol ) | ( ruleEqualsSymbol ) );
    public final void rule__PartialitySymbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1285:1: ( ( ruleExistSymbol ) | ( ruleEqualsSymbol ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSolverLanguage.g:1286:2: ( ruleExistSymbol )
                    {
                    // InternalSolverLanguage.g:1286:2: ( ruleExistSymbol )
                    // InternalSolverLanguage.g:1287:3: ruleExistSymbol
                    {
                     before(grammarAccess.getPartialitySymbolAccess().getExistSymbolParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExistSymbol();

                    state._fsp--;

                     after(grammarAccess.getPartialitySymbolAccess().getExistSymbolParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1292:2: ( ruleEqualsSymbol )
                    {
                    // InternalSolverLanguage.g:1292:2: ( ruleEqualsSymbol )
                    // InternalSolverLanguage.g:1293:3: ruleEqualsSymbol
                    {
                     before(grammarAccess.getPartialitySymbolAccess().getEqualsSymbolParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEqualsSymbol();

                    state._fsp--;

                     after(grammarAccess.getPartialitySymbolAccess().getEqualsSymbolParserRuleCall_1()); 

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
    // $ANTLR end "rule__PartialitySymbol__Alternatives"


    // $ANTLR start "rule__DataSymbol__Alternatives"
    // InternalSolverLanguage.g:1302:1: rule__DataSymbol__Alternatives : ( ( ruleBooleanSymbol ) | ( ruleIntegerSymbol ) | ( ruleRealSymbol ) | ( ruleStringSymbol ) );
    public final void rule__DataSymbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1306:1: ( ( ruleBooleanSymbol ) | ( ruleIntegerSymbol ) | ( ruleRealSymbol ) | ( ruleStringSymbol ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            case 26:
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
                    // InternalSolverLanguage.g:1307:2: ( ruleBooleanSymbol )
                    {
                    // InternalSolverLanguage.g:1307:2: ( ruleBooleanSymbol )
                    // InternalSolverLanguage.g:1308:3: ruleBooleanSymbol
                    {
                     before(grammarAccess.getDataSymbolAccess().getBooleanSymbolParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanSymbol();

                    state._fsp--;

                     after(grammarAccess.getDataSymbolAccess().getBooleanSymbolParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1313:2: ( ruleIntegerSymbol )
                    {
                    // InternalSolverLanguage.g:1313:2: ( ruleIntegerSymbol )
                    // InternalSolverLanguage.g:1314:3: ruleIntegerSymbol
                    {
                     before(grammarAccess.getDataSymbolAccess().getIntegerSymbolParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerSymbol();

                    state._fsp--;

                     after(grammarAccess.getDataSymbolAccess().getIntegerSymbolParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:1319:2: ( ruleRealSymbol )
                    {
                    // InternalSolverLanguage.g:1319:2: ( ruleRealSymbol )
                    // InternalSolverLanguage.g:1320:3: ruleRealSymbol
                    {
                     before(grammarAccess.getDataSymbolAccess().getRealSymbolParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRealSymbol();

                    state._fsp--;

                     after(grammarAccess.getDataSymbolAccess().getRealSymbolParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguage.g:1325:2: ( ruleStringSymbol )
                    {
                    // InternalSolverLanguage.g:1325:2: ( ruleStringSymbol )
                    // InternalSolverLanguage.g:1326:3: ruleStringSymbol
                    {
                     before(grammarAccess.getDataSymbolAccess().getStringSymbolParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStringSymbol();

                    state._fsp--;

                     after(grammarAccess.getDataSymbolAccess().getStringSymbolParserRuleCall_3()); 

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
    // $ANTLR end "rule__DataSymbol__Alternatives"


    // $ANTLR start "rule__ComplexObject__Alternatives"
    // InternalSolverLanguage.g:1335:1: rule__ComplexObject__Alternatives : ( ( ruleObject ) | ( ruleAllInstances ) | ( ruleAllObjects ) );
    public final void rule__ComplexObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1339:1: ( ( ruleObject ) | ( ruleAllInstances ) | ( ruleAllObjects ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_ID:
            case RULE_STRING:
            case 11:
            case 12:
            case 13:
            case 27:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 31:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSolverLanguage.g:1340:2: ( ruleObject )
                    {
                    // InternalSolverLanguage.g:1340:2: ( ruleObject )
                    // InternalSolverLanguage.g:1341:3: ruleObject
                    {
                     before(grammarAccess.getComplexObjectAccess().getObjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObject();

                    state._fsp--;

                     after(grammarAccess.getComplexObjectAccess().getObjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1346:2: ( ruleAllInstances )
                    {
                    // InternalSolverLanguage.g:1346:2: ( ruleAllInstances )
                    // InternalSolverLanguage.g:1347:3: ruleAllInstances
                    {
                     before(grammarAccess.getComplexObjectAccess().getAllInstancesParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAllInstances();

                    state._fsp--;

                     after(grammarAccess.getComplexObjectAccess().getAllInstancesParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:1352:2: ( ruleAllObjects )
                    {
                    // InternalSolverLanguage.g:1352:2: ( ruleAllObjects )
                    // InternalSolverLanguage.g:1353:3: ruleAllObjects
                    {
                     before(grammarAccess.getComplexObjectAccess().getAllObjectsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAllObjects();

                    state._fsp--;

                     after(grammarAccess.getComplexObjectAccess().getAllObjectsParserRuleCall_2()); 

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
    // $ANTLR end "rule__ComplexObject__Alternatives"


    // $ANTLR start "rule__Object__Alternatives"
    // InternalSolverLanguage.g:1362:1: rule__Object__Alternatives : ( ( ruleNamedObject ) | ( ruleUnnamedObject ) | ( ruleDataObject ) );
    public final void rule__Object__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1366:1: ( ( ruleNamedObject ) | ( ruleUnnamedObject ) | ( ruleDataObject ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 11:
            case 12:
            case 13:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSolverLanguage.g:1367:2: ( ruleNamedObject )
                    {
                    // InternalSolverLanguage.g:1367:2: ( ruleNamedObject )
                    // InternalSolverLanguage.g:1368:3: ruleNamedObject
                    {
                     before(grammarAccess.getObjectAccess().getNamedObjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNamedObject();

                    state._fsp--;

                     after(grammarAccess.getObjectAccess().getNamedObjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1373:2: ( ruleUnnamedObject )
                    {
                    // InternalSolverLanguage.g:1373:2: ( ruleUnnamedObject )
                    // InternalSolverLanguage.g:1374:3: ruleUnnamedObject
                    {
                     before(grammarAccess.getObjectAccess().getUnnamedObjectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnnamedObject();

                    state._fsp--;

                     after(grammarAccess.getObjectAccess().getUnnamedObjectParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:1379:2: ( ruleDataObject )
                    {
                    // InternalSolverLanguage.g:1379:2: ( ruleDataObject )
                    // InternalSolverLanguage.g:1380:3: ruleDataObject
                    {
                     before(grammarAccess.getObjectAccess().getDataObjectParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDataObject();

                    state._fsp--;

                     after(grammarAccess.getObjectAccess().getDataObjectParserRuleCall_2()); 

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
    // $ANTLR end "rule__Object__Alternatives"


    // $ANTLR start "rule__DataObject__Alternatives"
    // InternalSolverLanguage.g:1389:1: rule__DataObject__Alternatives : ( ( ruleBooleanObject ) | ( ruleIntObject ) | ( ruleRealObject ) | ( ruleStringObject ) );
    public final void rule__DataObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1393:1: ( ( ruleBooleanObject ) | ( ruleIntObject ) | ( ruleRealObject ) | ( ruleStringObject ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt11=1;
                }
                break;
            case 13:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==RULE_INT) ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==EOF||(LA11_3>=19 && LA11_3<=20)) ) {
                        alt11=2;
                    }
                    else if ( (LA11_3==14) ) {
                        alt11=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==EOF||(LA11_3>=19 && LA11_3<=20)) ) {
                    alt11=2;
                }
                else if ( (LA11_3==14) ) {
                    alt11=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSolverLanguage.g:1394:2: ( ruleBooleanObject )
                    {
                    // InternalSolverLanguage.g:1394:2: ( ruleBooleanObject )
                    // InternalSolverLanguage.g:1395:3: ruleBooleanObject
                    {
                     before(grammarAccess.getDataObjectAccess().getBooleanObjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanObject();

                    state._fsp--;

                     after(grammarAccess.getDataObjectAccess().getBooleanObjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1400:2: ( ruleIntObject )
                    {
                    // InternalSolverLanguage.g:1400:2: ( ruleIntObject )
                    // InternalSolverLanguage.g:1401:3: ruleIntObject
                    {
                     before(grammarAccess.getDataObjectAccess().getIntObjectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntObject();

                    state._fsp--;

                     after(grammarAccess.getDataObjectAccess().getIntObjectParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:1406:2: ( ruleRealObject )
                    {
                    // InternalSolverLanguage.g:1406:2: ( ruleRealObject )
                    // InternalSolverLanguage.g:1407:3: ruleRealObject
                    {
                     before(grammarAccess.getDataObjectAccess().getRealObjectParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRealObject();

                    state._fsp--;

                     after(grammarAccess.getDataObjectAccess().getRealObjectParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguage.g:1412:2: ( ruleStringObject )
                    {
                    // InternalSolverLanguage.g:1412:2: ( ruleStringObject )
                    // InternalSolverLanguage.g:1413:3: ruleStringObject
                    {
                     before(grammarAccess.getDataObjectAccess().getStringObjectParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStringObject();

                    state._fsp--;

                     after(grammarAccess.getDataObjectAccess().getStringObjectParserRuleCall_3()); 

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
    // $ANTLR end "rule__DataObject__Alternatives"


    // $ANTLR start "rule__Predicate__Alternatives_4"
    // InternalSolverLanguage.g:1422:1: rule__Predicate__Alternatives_4 : ( ( 'false' ) | ( ( rule__Predicate__Group_4_1__0 ) ) );
    public final void rule__Predicate__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1426:1: ( ( 'false' ) | ( ( rule__Predicate__Group_4_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==11) ) {
                alt12=1;
            }
            else if ( (LA12_0==EOF||LA12_0==RULE_ID||(LA12_0>=12 && LA12_0<=14)||(LA12_0>=29 && LA12_0<=31)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSolverLanguage.g:1427:2: ( 'false' )
                    {
                    // InternalSolverLanguage.g:1427:2: ( 'false' )
                    // InternalSolverLanguage.g:1428:3: 'false'
                    {
                     before(grammarAccess.getPredicateAccess().getFalseKeyword_4_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPredicateAccess().getFalseKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1433:2: ( ( rule__Predicate__Group_4_1__0 ) )
                    {
                    // InternalSolverLanguage.g:1433:2: ( ( rule__Predicate__Group_4_1__0 ) )
                    // InternalSolverLanguage.g:1434:3: ( rule__Predicate__Group_4_1__0 )
                    {
                     before(grammarAccess.getPredicateAccess().getGroup_4_1()); 
                    // InternalSolverLanguage.g:1435:3: ( rule__Predicate__Group_4_1__0 )
                    // InternalSolverLanguage.g:1435:4: rule__Predicate__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Predicate__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicateAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__Predicate__Alternatives_4"


    // $ANTLR start "rule__PatternBody__Alternatives_1"
    // InternalSolverLanguage.g:1443:1: rule__PatternBody__Alternatives_1 : ( ( 'true' ) | ( ( rule__PatternBody__ConstraintsAssignment_1_1 )* ) );
    public final void rule__PatternBody__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1447:1: ( ( 'true' ) | ( ( rule__PatternBody__ConstraintsAssignment_1_1 )* ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            else if ( (LA14_0==EOF||LA14_0==RULE_ID||(LA14_0>=13 && LA14_0<=14)||(LA14_0>=29 && LA14_0<=31)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSolverLanguage.g:1448:2: ( 'true' )
                    {
                    // InternalSolverLanguage.g:1448:2: ( 'true' )
                    // InternalSolverLanguage.g:1449:3: 'true'
                    {
                     before(grammarAccess.getPatternBodyAccess().getTrueKeyword_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPatternBodyAccess().getTrueKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1454:2: ( ( rule__PatternBody__ConstraintsAssignment_1_1 )* )
                    {
                    // InternalSolverLanguage.g:1454:2: ( ( rule__PatternBody__ConstraintsAssignment_1_1 )* )
                    // InternalSolverLanguage.g:1455:3: ( rule__PatternBody__ConstraintsAssignment_1_1 )*
                    {
                     before(grammarAccess.getPatternBodyAccess().getConstraintsAssignment_1_1()); 
                    // InternalSolverLanguage.g:1456:3: ( rule__PatternBody__ConstraintsAssignment_1_1 )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID||LA13_0==13||(LA13_0>=30 && LA13_0<=31)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSolverLanguage.g:1456:4: rule__PatternBody__ConstraintsAssignment_1_1
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__PatternBody__ConstraintsAssignment_1_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                     after(grammarAccess.getPatternBodyAccess().getConstraintsAssignment_1_1()); 

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
    // $ANTLR end "rule__PatternBody__Alternatives_1"


    // $ANTLR start "rule__Polarity__Alternatives"
    // InternalSolverLanguage.g:1464:1: rule__Polarity__Alternatives : ( ( ( rule__Polarity__Group_0__0 ) ) | ( ( rule__Polarity__Group_1__0 ) ) );
    public final void rule__Polarity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1468:1: ( ( ( rule__Polarity__Group_0__0 ) ) | ( ( rule__Polarity__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            else if ( (LA15_0==13) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSolverLanguage.g:1469:2: ( ( rule__Polarity__Group_0__0 ) )
                    {
                    // InternalSolverLanguage.g:1469:2: ( ( rule__Polarity__Group_0__0 ) )
                    // InternalSolverLanguage.g:1470:3: ( rule__Polarity__Group_0__0 )
                    {
                     before(grammarAccess.getPolarityAccess().getGroup_0()); 
                    // InternalSolverLanguage.g:1471:3: ( rule__Polarity__Group_0__0 )
                    // InternalSolverLanguage.g:1471:4: rule__Polarity__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Polarity__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPolarityAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1475:2: ( ( rule__Polarity__Group_1__0 ) )
                    {
                    // InternalSolverLanguage.g:1475:2: ( ( rule__Polarity__Group_1__0 ) )
                    // InternalSolverLanguage.g:1476:3: ( rule__Polarity__Group_1__0 )
                    {
                     before(grammarAccess.getPolarityAccess().getGroup_1()); 
                    // InternalSolverLanguage.g:1477:3: ( rule__Polarity__Group_1__0 )
                    // InternalSolverLanguage.g:1477:4: rule__Polarity__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Polarity__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPolarityAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Polarity__Alternatives"


    // $ANTLR start "rule__Constraint__Alternatives"
    // InternalSolverLanguage.g:1485:1: rule__Constraint__Alternatives : ( ( ( rule__Constraint__Group_0__0 ) ) | ( ( rule__Constraint__Group_1__0 ) ) );
    public final void rule__Constraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1489:1: ( ( ( rule__Constraint__Group_0__0 ) ) | ( ( rule__Constraint__Group_1__0 ) ) )
            int alt16=2;
            switch ( input.LA(1) ) {
            case 30:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==RULE_ID) ) {
                    alt16=1;
                }
                else if ( (LA16_1==18) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 13:
                {
                alt16=1;
                }
                break;
            case 31:
                {
                alt16=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalSolverLanguage.g:1490:2: ( ( rule__Constraint__Group_0__0 ) )
                    {
                    // InternalSolverLanguage.g:1490:2: ( ( rule__Constraint__Group_0__0 ) )
                    // InternalSolverLanguage.g:1491:3: ( rule__Constraint__Group_0__0 )
                    {
                     before(grammarAccess.getConstraintAccess().getGroup_0()); 
                    // InternalSolverLanguage.g:1492:3: ( rule__Constraint__Group_0__0 )
                    // InternalSolverLanguage.g:1492:4: rule__Constraint__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1496:2: ( ( rule__Constraint__Group_1__0 ) )
                    {
                    // InternalSolverLanguage.g:1496:2: ( ( rule__Constraint__Group_1__0 ) )
                    // InternalSolverLanguage.g:1497:3: ( rule__Constraint__Group_1__0 )
                    {
                     before(grammarAccess.getConstraintAccess().getGroup_1()); 
                    // InternalSolverLanguage.g:1498:3: ( rule__Constraint__Group_1__0 )
                    // InternalSolverLanguage.g:1498:4: rule__Constraint__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Constraint__Alternatives"


    // $ANTLR start "rule__ClosureType__Alternatives"
    // InternalSolverLanguage.g:1506:1: rule__ClosureType__Alternatives : ( ( ( rule__ClosureType__Group_0__0 ) ) | ( ( rule__ClosureType__Group_1__0 ) ) );
    public final void rule__ClosureType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1510:1: ( ( ( rule__ClosureType__Group_0__0 ) ) | ( ( rule__ClosureType__Group_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            else if ( (LA17_0==30) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSolverLanguage.g:1511:2: ( ( rule__ClosureType__Group_0__0 ) )
                    {
                    // InternalSolverLanguage.g:1511:2: ( ( rule__ClosureType__Group_0__0 ) )
                    // InternalSolverLanguage.g:1512:3: ( rule__ClosureType__Group_0__0 )
                    {
                     before(grammarAccess.getClosureTypeAccess().getGroup_0()); 
                    // InternalSolverLanguage.g:1513:3: ( rule__ClosureType__Group_0__0 )
                    // InternalSolverLanguage.g:1513:4: rule__ClosureType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClosureType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClosureTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1517:2: ( ( rule__ClosureType__Group_1__0 ) )
                    {
                    // InternalSolverLanguage.g:1517:2: ( ( rule__ClosureType__Group_1__0 ) )
                    // InternalSolverLanguage.g:1518:3: ( rule__ClosureType__Group_1__0 )
                    {
                     before(grammarAccess.getClosureTypeAccess().getGroup_1()); 
                    // InternalSolverLanguage.g:1519:3: ( rule__ClosureType__Group_1__0 )
                    // InternalSolverLanguage.g:1519:4: rule__ClosureType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClosureType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClosureTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ClosureType__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalSolverLanguage.g:1527:1: rule__Literal__Alternatives : ( ( ruleVariable ) | ( ruleDataObject ) | ( ruleNamedObject ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1531:1: ( ( ruleVariable ) | ( ruleDataObject ) | ( ruleNamedObject ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 11:
            case 12:
            case 13:
                {
                alt18=2;
                }
                break;
            case 27:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalSolverLanguage.g:1532:2: ( ruleVariable )
                    {
                    // InternalSolverLanguage.g:1532:2: ( ruleVariable )
                    // InternalSolverLanguage.g:1533:3: ruleVariable
                    {
                     before(grammarAccess.getLiteralAccess().getVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1538:2: ( ruleDataObject )
                    {
                    // InternalSolverLanguage.g:1538:2: ( ruleDataObject )
                    // InternalSolverLanguage.g:1539:3: ruleDataObject
                    {
                     before(grammarAccess.getLiteralAccess().getDataObjectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataObject();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getDataObjectParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:1544:2: ( ruleNamedObject )
                    {
                    // InternalSolverLanguage.g:1544:2: ( ruleNamedObject )
                    // InternalSolverLanguage.g:1545:3: ruleNamedObject
                    {
                     before(grammarAccess.getLiteralAccess().getNamedObjectParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNamedObject();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNamedObjectParserRuleCall_2()); 

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__CDInterpretation__Alternatives"
    // InternalSolverLanguage.g:1554:1: rule__CDInterpretation__Alternatives : ( ( ruleClassInterpretation ) | ( ruleEnumInterpretation ) | ( ruleGlobalRelationInterpretation ) );
    public final void rule__CDInterpretation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1558:1: ( ( ruleClassInterpretation ) | ( ruleEnumInterpretation ) | ( ruleGlobalRelationInterpretation ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 33:
            case 40:
                {
                alt19=1;
                }
                break;
            case 37:
                {
                alt19=2;
                }
                break;
            case 38:
            case 41:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalSolverLanguage.g:1559:2: ( ruleClassInterpretation )
                    {
                    // InternalSolverLanguage.g:1559:2: ( ruleClassInterpretation )
                    // InternalSolverLanguage.g:1560:3: ruleClassInterpretation
                    {
                     before(grammarAccess.getCDInterpretationAccess().getClassInterpretationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClassInterpretation();

                    state._fsp--;

                     after(grammarAccess.getCDInterpretationAccess().getClassInterpretationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1565:2: ( ruleEnumInterpretation )
                    {
                    // InternalSolverLanguage.g:1565:2: ( ruleEnumInterpretation )
                    // InternalSolverLanguage.g:1566:3: ruleEnumInterpretation
                    {
                     before(grammarAccess.getCDInterpretationAccess().getEnumInterpretationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumInterpretation();

                    state._fsp--;

                     after(grammarAccess.getCDInterpretationAccess().getEnumInterpretationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:1571:2: ( ruleGlobalRelationInterpretation )
                    {
                    // InternalSolverLanguage.g:1571:2: ( ruleGlobalRelationInterpretation )
                    // InternalSolverLanguage.g:1572:3: ruleGlobalRelationInterpretation
                    {
                     before(grammarAccess.getCDInterpretationAccess().getGlobalRelationInterpretationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGlobalRelationInterpretation();

                    state._fsp--;

                     after(grammarAccess.getCDInterpretationAccess().getGlobalRelationInterpretationParserRuleCall_2()); 

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
    // $ANTLR end "rule__CDInterpretation__Alternatives"


    // $ANTLR start "rule__MultiplicityDefinition__Alternatives_2"
    // InternalSolverLanguage.g:1581:1: rule__MultiplicityDefinition__Alternatives_2 : ( ( ( rule__MultiplicityDefinition__UpperAssignment_2_0 ) ) | ( ( rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1 ) ) );
    public final void rule__MultiplicityDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1585:1: ( ( ( rule__MultiplicityDefinition__UpperAssignment_2_0 ) ) | ( ( rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            else if ( (LA20_0==31) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSolverLanguage.g:1586:2: ( ( rule__MultiplicityDefinition__UpperAssignment_2_0 ) )
                    {
                    // InternalSolverLanguage.g:1586:2: ( ( rule__MultiplicityDefinition__UpperAssignment_2_0 ) )
                    // InternalSolverLanguage.g:1587:3: ( rule__MultiplicityDefinition__UpperAssignment_2_0 )
                    {
                     before(grammarAccess.getMultiplicityDefinitionAccess().getUpperAssignment_2_0()); 
                    // InternalSolverLanguage.g:1588:3: ( rule__MultiplicityDefinition__UpperAssignment_2_0 )
                    // InternalSolverLanguage.g:1588:4: rule__MultiplicityDefinition__UpperAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicityDefinition__UpperAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicityDefinitionAccess().getUpperAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1592:2: ( ( rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1 ) )
                    {
                    // InternalSolverLanguage.g:1592:2: ( ( rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1 ) )
                    // InternalSolverLanguage.g:1593:3: ( rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1 )
                    {
                     before(grammarAccess.getMultiplicityDefinitionAccess().getUnlimitedUpperAssignment_2_1()); 
                    // InternalSolverLanguage.g:1594:3: ( rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1 )
                    // InternalSolverLanguage.g:1594:4: rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicityDefinitionAccess().getUnlimitedUpperAssignment_2_1()); 

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
    // $ANTLR end "rule__MultiplicityDefinition__Alternatives_2"


    // $ANTLR start "rule__REALLiteral__Group__0"
    // InternalSolverLanguage.g:1602:1: rule__REALLiteral__Group__0 : rule__REALLiteral__Group__0__Impl rule__REALLiteral__Group__1 ;
    public final void rule__REALLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1606:1: ( rule__REALLiteral__Group__0__Impl rule__REALLiteral__Group__1 )
            // InternalSolverLanguage.g:1607:2: rule__REALLiteral__Group__0__Impl rule__REALLiteral__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__REALLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REALLiteral__Group__1();

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
    // $ANTLR end "rule__REALLiteral__Group__0"


    // $ANTLR start "rule__REALLiteral__Group__0__Impl"
    // InternalSolverLanguage.g:1614:1: rule__REALLiteral__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__REALLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1618:1: ( ( ( '-' )? ) )
            // InternalSolverLanguage.g:1619:1: ( ( '-' )? )
            {
            // InternalSolverLanguage.g:1619:1: ( ( '-' )? )
            // InternalSolverLanguage.g:1620:2: ( '-' )?
            {
             before(grammarAccess.getREALLiteralAccess().getHyphenMinusKeyword_0()); 
            // InternalSolverLanguage.g:1621:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==13) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSolverLanguage.g:1621:3: '-'
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getREALLiteralAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__REALLiteral__Group__0__Impl"


    // $ANTLR start "rule__REALLiteral__Group__1"
    // InternalSolverLanguage.g:1629:1: rule__REALLiteral__Group__1 : rule__REALLiteral__Group__1__Impl rule__REALLiteral__Group__2 ;
    public final void rule__REALLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1633:1: ( rule__REALLiteral__Group__1__Impl rule__REALLiteral__Group__2 )
            // InternalSolverLanguage.g:1634:2: rule__REALLiteral__Group__1__Impl rule__REALLiteral__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__REALLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REALLiteral__Group__2();

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
    // $ANTLR end "rule__REALLiteral__Group__1"


    // $ANTLR start "rule__REALLiteral__Group__1__Impl"
    // InternalSolverLanguage.g:1641:1: rule__REALLiteral__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__REALLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1645:1: ( ( RULE_INT ) )
            // InternalSolverLanguage.g:1646:1: ( RULE_INT )
            {
            // InternalSolverLanguage.g:1646:1: ( RULE_INT )
            // InternalSolverLanguage.g:1647:2: RULE_INT
            {
             before(grammarAccess.getREALLiteralAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getREALLiteralAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__REALLiteral__Group__1__Impl"


    // $ANTLR start "rule__REALLiteral__Group__2"
    // InternalSolverLanguage.g:1656:1: rule__REALLiteral__Group__2 : rule__REALLiteral__Group__2__Impl rule__REALLiteral__Group__3 ;
    public final void rule__REALLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1660:1: ( rule__REALLiteral__Group__2__Impl rule__REALLiteral__Group__3 )
            // InternalSolverLanguage.g:1661:2: rule__REALLiteral__Group__2__Impl rule__REALLiteral__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__REALLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REALLiteral__Group__3();

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
    // $ANTLR end "rule__REALLiteral__Group__2"


    // $ANTLR start "rule__REALLiteral__Group__2__Impl"
    // InternalSolverLanguage.g:1668:1: rule__REALLiteral__Group__2__Impl : ( '.' ) ;
    public final void rule__REALLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1672:1: ( ( '.' ) )
            // InternalSolverLanguage.g:1673:1: ( '.' )
            {
            // InternalSolverLanguage.g:1673:1: ( '.' )
            // InternalSolverLanguage.g:1674:2: '.'
            {
             before(grammarAccess.getREALLiteralAccess().getFullStopKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getREALLiteralAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__REALLiteral__Group__2__Impl"


    // $ANTLR start "rule__REALLiteral__Group__3"
    // InternalSolverLanguage.g:1683:1: rule__REALLiteral__Group__3 : rule__REALLiteral__Group__3__Impl ;
    public final void rule__REALLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1687:1: ( rule__REALLiteral__Group__3__Impl )
            // InternalSolverLanguage.g:1688:2: rule__REALLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REALLiteral__Group__3__Impl();

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
    // $ANTLR end "rule__REALLiteral__Group__3"


    // $ANTLR start "rule__REALLiteral__Group__3__Impl"
    // InternalSolverLanguage.g:1694:1: rule__REALLiteral__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__REALLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1698:1: ( ( RULE_INT ) )
            // InternalSolverLanguage.g:1699:1: ( RULE_INT )
            {
            // InternalSolverLanguage.g:1699:1: ( RULE_INT )
            // InternalSolverLanguage.g:1700:2: RULE_INT
            {
             before(grammarAccess.getREALLiteralAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getREALLiteralAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__REALLiteral__Group__3__Impl"


    // $ANTLR start "rule__INTLiteral__Group__0"
    // InternalSolverLanguage.g:1710:1: rule__INTLiteral__Group__0 : rule__INTLiteral__Group__0__Impl rule__INTLiteral__Group__1 ;
    public final void rule__INTLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1714:1: ( rule__INTLiteral__Group__0__Impl rule__INTLiteral__Group__1 )
            // InternalSolverLanguage.g:1715:2: rule__INTLiteral__Group__0__Impl rule__INTLiteral__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__INTLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INTLiteral__Group__1();

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
    // $ANTLR end "rule__INTLiteral__Group__0"


    // $ANTLR start "rule__INTLiteral__Group__0__Impl"
    // InternalSolverLanguage.g:1722:1: rule__INTLiteral__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1726:1: ( ( ( '-' )? ) )
            // InternalSolverLanguage.g:1727:1: ( ( '-' )? )
            {
            // InternalSolverLanguage.g:1727:1: ( ( '-' )? )
            // InternalSolverLanguage.g:1728:2: ( '-' )?
            {
             before(grammarAccess.getINTLiteralAccess().getHyphenMinusKeyword_0()); 
            // InternalSolverLanguage.g:1729:2: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSolverLanguage.g:1729:3: '-'
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getINTLiteralAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__INTLiteral__Group__0__Impl"


    // $ANTLR start "rule__INTLiteral__Group__1"
    // InternalSolverLanguage.g:1737:1: rule__INTLiteral__Group__1 : rule__INTLiteral__Group__1__Impl ;
    public final void rule__INTLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1741:1: ( rule__INTLiteral__Group__1__Impl )
            // InternalSolverLanguage.g:1742:2: rule__INTLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__INTLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__INTLiteral__Group__1"


    // $ANTLR start "rule__INTLiteral__Group__1__Impl"
    // InternalSolverLanguage.g:1748:1: rule__INTLiteral__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__INTLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1752:1: ( ( RULE_INT ) )
            // InternalSolverLanguage.g:1753:1: ( RULE_INT )
            {
            // InternalSolverLanguage.g:1753:1: ( RULE_INT )
            // InternalSolverLanguage.g:1754:2: RULE_INT
            {
             before(grammarAccess.getINTLiteralAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getINTLiteralAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__INTLiteral__Group__1__Impl"


    // $ANTLR start "rule__BooleanValue__Group_0__0"
    // InternalSolverLanguage.g:1764:1: rule__BooleanValue__Group_0__0 : rule__BooleanValue__Group_0__0__Impl rule__BooleanValue__Group_0__1 ;
    public final void rule__BooleanValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1768:1: ( rule__BooleanValue__Group_0__0__Impl rule__BooleanValue__Group_0__1 )
            // InternalSolverLanguage.g:1769:2: rule__BooleanValue__Group_0__0__Impl rule__BooleanValue__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__BooleanValue__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValue__Group_0__1();

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
    // $ANTLR end "rule__BooleanValue__Group_0__0"


    // $ANTLR start "rule__BooleanValue__Group_0__0__Impl"
    // InternalSolverLanguage.g:1776:1: rule__BooleanValue__Group_0__0__Impl : ( () ) ;
    public final void rule__BooleanValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1780:1: ( ( () ) )
            // InternalSolverLanguage.g:1781:1: ( () )
            {
            // InternalSolverLanguage.g:1781:1: ( () )
            // InternalSolverLanguage.g:1782:2: ()
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanTrueAction_0_0()); 
            // InternalSolverLanguage.g:1783:2: ()
            // InternalSolverLanguage.g:1783:3: 
            {
            }

             after(grammarAccess.getBooleanValueAccess().getBooleanTrueAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group_0__0__Impl"


    // $ANTLR start "rule__BooleanValue__Group_0__1"
    // InternalSolverLanguage.g:1791:1: rule__BooleanValue__Group_0__1 : rule__BooleanValue__Group_0__1__Impl ;
    public final void rule__BooleanValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1795:1: ( rule__BooleanValue__Group_0__1__Impl )
            // InternalSolverLanguage.g:1796:2: rule__BooleanValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__Group_0__1__Impl();

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
    // $ANTLR end "rule__BooleanValue__Group_0__1"


    // $ANTLR start "rule__BooleanValue__Group_0__1__Impl"
    // InternalSolverLanguage.g:1802:1: rule__BooleanValue__Group_0__1__Impl : ( 'true' ) ;
    public final void rule__BooleanValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1806:1: ( ( 'true' ) )
            // InternalSolverLanguage.g:1807:1: ( 'true' )
            {
            // InternalSolverLanguage.g:1807:1: ( 'true' )
            // InternalSolverLanguage.g:1808:2: 'true'
            {
             before(grammarAccess.getBooleanValueAccess().getTrueKeyword_0_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBooleanValueAccess().getTrueKeyword_0_1()); 

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
    // $ANTLR end "rule__BooleanValue__Group_0__1__Impl"


    // $ANTLR start "rule__BooleanValue__Group_1__0"
    // InternalSolverLanguage.g:1818:1: rule__BooleanValue__Group_1__0 : rule__BooleanValue__Group_1__0__Impl rule__BooleanValue__Group_1__1 ;
    public final void rule__BooleanValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1822:1: ( rule__BooleanValue__Group_1__0__Impl rule__BooleanValue__Group_1__1 )
            // InternalSolverLanguage.g:1823:2: rule__BooleanValue__Group_1__0__Impl rule__BooleanValue__Group_1__1
            {
            pushFollow(FOLLOW_1);
            rule__BooleanValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanValue__Group_1__1();

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
    // $ANTLR end "rule__BooleanValue__Group_1__0"


    // $ANTLR start "rule__BooleanValue__Group_1__0__Impl"
    // InternalSolverLanguage.g:1830:1: rule__BooleanValue__Group_1__0__Impl : ( 'false' ) ;
    public final void rule__BooleanValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1834:1: ( ( 'false' ) )
            // InternalSolverLanguage.g:1835:1: ( 'false' )
            {
            // InternalSolverLanguage.g:1835:1: ( 'false' )
            // InternalSolverLanguage.g:1836:2: 'false'
            {
             before(grammarAccess.getBooleanValueAccess().getFalseKeyword_1_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBooleanValueAccess().getFalseKeyword_1_0()); 

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
    // $ANTLR end "rule__BooleanValue__Group_1__0__Impl"


    // $ANTLR start "rule__BooleanValue__Group_1__1"
    // InternalSolverLanguage.g:1845:1: rule__BooleanValue__Group_1__1 : rule__BooleanValue__Group_1__1__Impl ;
    public final void rule__BooleanValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1849:1: ( rule__BooleanValue__Group_1__1__Impl )
            // InternalSolverLanguage.g:1850:2: rule__BooleanValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__Group_1__1__Impl();

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
    // $ANTLR end "rule__BooleanValue__Group_1__1"


    // $ANTLR start "rule__BooleanValue__Group_1__1__Impl"
    // InternalSolverLanguage.g:1856:1: rule__BooleanValue__Group_1__1__Impl : ( () ) ;
    public final void rule__BooleanValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1860:1: ( ( () ) )
            // InternalSolverLanguage.g:1861:1: ( () )
            {
            // InternalSolverLanguage.g:1861:1: ( () )
            // InternalSolverLanguage.g:1862:2: ()
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanFalseAction_1_1()); 
            // InternalSolverLanguage.g:1863:2: ()
            // InternalSolverLanguage.g:1863:3: 
            {
            }

             after(grammarAccess.getBooleanValueAccess().getBooleanFalseAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group_1__1__Impl"


    // $ANTLR start "rule__TruthValue__Group_0__0"
    // InternalSolverLanguage.g:1872:1: rule__TruthValue__Group_0__0 : rule__TruthValue__Group_0__0__Impl rule__TruthValue__Group_0__1 ;
    public final void rule__TruthValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1876:1: ( rule__TruthValue__Group_0__0__Impl rule__TruthValue__Group_0__1 )
            // InternalSolverLanguage.g:1877:2: rule__TruthValue__Group_0__0__Impl rule__TruthValue__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__TruthValue__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TruthValue__Group_0__1();

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
    // $ANTLR end "rule__TruthValue__Group_0__0"


    // $ANTLR start "rule__TruthValue__Group_0__0__Impl"
    // InternalSolverLanguage.g:1884:1: rule__TruthValue__Group_0__0__Impl : ( () ) ;
    public final void rule__TruthValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1888:1: ( ( () ) )
            // InternalSolverLanguage.g:1889:1: ( () )
            {
            // InternalSolverLanguage.g:1889:1: ( () )
            // InternalSolverLanguage.g:1890:2: ()
            {
             before(grammarAccess.getTruthValueAccess().getTrueAction_0_0()); 
            // InternalSolverLanguage.g:1891:2: ()
            // InternalSolverLanguage.g:1891:3: 
            {
            }

             after(grammarAccess.getTruthValueAccess().getTrueAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruthValue__Group_0__0__Impl"


    // $ANTLR start "rule__TruthValue__Group_0__1"
    // InternalSolverLanguage.g:1899:1: rule__TruthValue__Group_0__1 : rule__TruthValue__Group_0__1__Impl ;
    public final void rule__TruthValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1903:1: ( rule__TruthValue__Group_0__1__Impl )
            // InternalSolverLanguage.g:1904:2: rule__TruthValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TruthValue__Group_0__1__Impl();

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
    // $ANTLR end "rule__TruthValue__Group_0__1"


    // $ANTLR start "rule__TruthValue__Group_0__1__Impl"
    // InternalSolverLanguage.g:1910:1: rule__TruthValue__Group_0__1__Impl : ( 'true' ) ;
    public final void rule__TruthValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1914:1: ( ( 'true' ) )
            // InternalSolverLanguage.g:1915:1: ( 'true' )
            {
            // InternalSolverLanguage.g:1915:1: ( 'true' )
            // InternalSolverLanguage.g:1916:2: 'true'
            {
             before(grammarAccess.getTruthValueAccess().getTrueKeyword_0_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTruthValueAccess().getTrueKeyword_0_1()); 

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
    // $ANTLR end "rule__TruthValue__Group_0__1__Impl"


    // $ANTLR start "rule__TruthValue__Group_1__0"
    // InternalSolverLanguage.g:1926:1: rule__TruthValue__Group_1__0 : rule__TruthValue__Group_1__0__Impl rule__TruthValue__Group_1__1 ;
    public final void rule__TruthValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1930:1: ( rule__TruthValue__Group_1__0__Impl rule__TruthValue__Group_1__1 )
            // InternalSolverLanguage.g:1931:2: rule__TruthValue__Group_1__0__Impl rule__TruthValue__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__TruthValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TruthValue__Group_1__1();

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
    // $ANTLR end "rule__TruthValue__Group_1__0"


    // $ANTLR start "rule__TruthValue__Group_1__0__Impl"
    // InternalSolverLanguage.g:1938:1: rule__TruthValue__Group_1__0__Impl : ( () ) ;
    public final void rule__TruthValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1942:1: ( ( () ) )
            // InternalSolverLanguage.g:1943:1: ( () )
            {
            // InternalSolverLanguage.g:1943:1: ( () )
            // InternalSolverLanguage.g:1944:2: ()
            {
             before(grammarAccess.getTruthValueAccess().getFalseAction_1_0()); 
            // InternalSolverLanguage.g:1945:2: ()
            // InternalSolverLanguage.g:1945:3: 
            {
            }

             after(grammarAccess.getTruthValueAccess().getFalseAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruthValue__Group_1__0__Impl"


    // $ANTLR start "rule__TruthValue__Group_1__1"
    // InternalSolverLanguage.g:1953:1: rule__TruthValue__Group_1__1 : rule__TruthValue__Group_1__1__Impl ;
    public final void rule__TruthValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1957:1: ( rule__TruthValue__Group_1__1__Impl )
            // InternalSolverLanguage.g:1958:2: rule__TruthValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TruthValue__Group_1__1__Impl();

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
    // $ANTLR end "rule__TruthValue__Group_1__1"


    // $ANTLR start "rule__TruthValue__Group_1__1__Impl"
    // InternalSolverLanguage.g:1964:1: rule__TruthValue__Group_1__1__Impl : ( 'false' ) ;
    public final void rule__TruthValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1968:1: ( ( 'false' ) )
            // InternalSolverLanguage.g:1969:1: ( 'false' )
            {
            // InternalSolverLanguage.g:1969:1: ( 'false' )
            // InternalSolverLanguage.g:1970:2: 'false'
            {
             before(grammarAccess.getTruthValueAccess().getFalseKeyword_1_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTruthValueAccess().getFalseKeyword_1_1()); 

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
    // $ANTLR end "rule__TruthValue__Group_1__1__Impl"


    // $ANTLR start "rule__TruthValue__Group_2__0"
    // InternalSolverLanguage.g:1980:1: rule__TruthValue__Group_2__0 : rule__TruthValue__Group_2__0__Impl rule__TruthValue__Group_2__1 ;
    public final void rule__TruthValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1984:1: ( rule__TruthValue__Group_2__0__Impl rule__TruthValue__Group_2__1 )
            // InternalSolverLanguage.g:1985:2: rule__TruthValue__Group_2__0__Impl rule__TruthValue__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__TruthValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TruthValue__Group_2__1();

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
    // $ANTLR end "rule__TruthValue__Group_2__0"


    // $ANTLR start "rule__TruthValue__Group_2__0__Impl"
    // InternalSolverLanguage.g:1992:1: rule__TruthValue__Group_2__0__Impl : ( () ) ;
    public final void rule__TruthValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1996:1: ( ( () ) )
            // InternalSolverLanguage.g:1997:1: ( () )
            {
            // InternalSolverLanguage.g:1997:1: ( () )
            // InternalSolverLanguage.g:1998:2: ()
            {
             before(grammarAccess.getTruthValueAccess().getUnknownAction_2_0()); 
            // InternalSolverLanguage.g:1999:2: ()
            // InternalSolverLanguage.g:1999:3: 
            {
            }

             after(grammarAccess.getTruthValueAccess().getUnknownAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruthValue__Group_2__0__Impl"


    // $ANTLR start "rule__TruthValue__Group_2__1"
    // InternalSolverLanguage.g:2007:1: rule__TruthValue__Group_2__1 : rule__TruthValue__Group_2__1__Impl ;
    public final void rule__TruthValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2011:1: ( rule__TruthValue__Group_2__1__Impl )
            // InternalSolverLanguage.g:2012:2: rule__TruthValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TruthValue__Group_2__1__Impl();

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
    // $ANTLR end "rule__TruthValue__Group_2__1"


    // $ANTLR start "rule__TruthValue__Group_2__1__Impl"
    // InternalSolverLanguage.g:2018:1: rule__TruthValue__Group_2__1__Impl : ( 'unknown' ) ;
    public final void rule__TruthValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2022:1: ( ( 'unknown' ) )
            // InternalSolverLanguage.g:2023:1: ( 'unknown' )
            {
            // InternalSolverLanguage.g:2023:1: ( 'unknown' )
            // InternalSolverLanguage.g:2024:2: 'unknown'
            {
             before(grammarAccess.getTruthValueAccess().getUnknownKeyword_2_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTruthValueAccess().getUnknownKeyword_2_1()); 

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
    // $ANTLR end "rule__TruthValue__Group_2__1__Impl"


    // $ANTLR start "rule__TruthValue__Group_3__0"
    // InternalSolverLanguage.g:2034:1: rule__TruthValue__Group_3__0 : rule__TruthValue__Group_3__0__Impl rule__TruthValue__Group_3__1 ;
    public final void rule__TruthValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2038:1: ( rule__TruthValue__Group_3__0__Impl rule__TruthValue__Group_3__1 )
            // InternalSolverLanguage.g:2039:2: rule__TruthValue__Group_3__0__Impl rule__TruthValue__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__TruthValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TruthValue__Group_3__1();

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
    // $ANTLR end "rule__TruthValue__Group_3__0"


    // $ANTLR start "rule__TruthValue__Group_3__0__Impl"
    // InternalSolverLanguage.g:2046:1: rule__TruthValue__Group_3__0__Impl : ( () ) ;
    public final void rule__TruthValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2050:1: ( ( () ) )
            // InternalSolverLanguage.g:2051:1: ( () )
            {
            // InternalSolverLanguage.g:2051:1: ( () )
            // InternalSolverLanguage.g:2052:2: ()
            {
             before(grammarAccess.getTruthValueAccess().getErrorAction_3_0()); 
            // InternalSolverLanguage.g:2053:2: ()
            // InternalSolverLanguage.g:2053:3: 
            {
            }

             after(grammarAccess.getTruthValueAccess().getErrorAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TruthValue__Group_3__0__Impl"


    // $ANTLR start "rule__TruthValue__Group_3__1"
    // InternalSolverLanguage.g:2061:1: rule__TruthValue__Group_3__1 : rule__TruthValue__Group_3__1__Impl ;
    public final void rule__TruthValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2065:1: ( rule__TruthValue__Group_3__1__Impl )
            // InternalSolverLanguage.g:2066:2: rule__TruthValue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TruthValue__Group_3__1__Impl();

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
    // $ANTLR end "rule__TruthValue__Group_3__1"


    // $ANTLR start "rule__TruthValue__Group_3__1__Impl"
    // InternalSolverLanguage.g:2072:1: rule__TruthValue__Group_3__1__Impl : ( 'error' ) ;
    public final void rule__TruthValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2076:1: ( ( 'error' ) )
            // InternalSolverLanguage.g:2077:1: ( 'error' )
            {
            // InternalSolverLanguage.g:2077:1: ( 'error' )
            // InternalSolverLanguage.g:2078:2: 'error'
            {
             before(grammarAccess.getTruthValueAccess().getErrorKeyword_3_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTruthValueAccess().getErrorKeyword_3_1()); 

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
    // $ANTLR end "rule__TruthValue__Group_3__1__Impl"


    // $ANTLR start "rule__BasicInterpretation__Group__0"
    // InternalSolverLanguage.g:2088:1: rule__BasicInterpretation__Group__0 : rule__BasicInterpretation__Group__0__Impl rule__BasicInterpretation__Group__1 ;
    public final void rule__BasicInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2092:1: ( rule__BasicInterpretation__Group__0__Impl rule__BasicInterpretation__Group__1 )
            // InternalSolverLanguage.g:2093:2: rule__BasicInterpretation__Group__0__Impl rule__BasicInterpretation__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__BasicInterpretation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__Group__1();

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
    // $ANTLR end "rule__BasicInterpretation__Group__0"


    // $ANTLR start "rule__BasicInterpretation__Group__0__Impl"
    // InternalSolverLanguage.g:2100:1: rule__BasicInterpretation__Group__0__Impl : ( ( rule__BasicInterpretation__SymbolAssignment_0 ) ) ;
    public final void rule__BasicInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2104:1: ( ( ( rule__BasicInterpretation__SymbolAssignment_0 ) ) )
            // InternalSolverLanguage.g:2105:1: ( ( rule__BasicInterpretation__SymbolAssignment_0 ) )
            {
            // InternalSolverLanguage.g:2105:1: ( ( rule__BasicInterpretation__SymbolAssignment_0 ) )
            // InternalSolverLanguage.g:2106:2: ( rule__BasicInterpretation__SymbolAssignment_0 )
            {
             before(grammarAccess.getBasicInterpretationAccess().getSymbolAssignment_0()); 
            // InternalSolverLanguage.g:2107:2: ( rule__BasicInterpretation__SymbolAssignment_0 )
            // InternalSolverLanguage.g:2107:3: rule__BasicInterpretation__SymbolAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__SymbolAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicInterpretationAccess().getSymbolAssignment_0()); 

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
    // $ANTLR end "rule__BasicInterpretation__Group__0__Impl"


    // $ANTLR start "rule__BasicInterpretation__Group__1"
    // InternalSolverLanguage.g:2115:1: rule__BasicInterpretation__Group__1 : rule__BasicInterpretation__Group__1__Impl rule__BasicInterpretation__Group__2 ;
    public final void rule__BasicInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2119:1: ( rule__BasicInterpretation__Group__1__Impl rule__BasicInterpretation__Group__2 )
            // InternalSolverLanguage.g:2120:2: rule__BasicInterpretation__Group__1__Impl rule__BasicInterpretation__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__BasicInterpretation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__Group__2();

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
    // $ANTLR end "rule__BasicInterpretation__Group__1"


    // $ANTLR start "rule__BasicInterpretation__Group__1__Impl"
    // InternalSolverLanguage.g:2127:1: rule__BasicInterpretation__Group__1__Impl : ( ( rule__BasicInterpretation__Group_1__0 )? ) ;
    public final void rule__BasicInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2131:1: ( ( ( rule__BasicInterpretation__Group_1__0 )? ) )
            // InternalSolverLanguage.g:2132:1: ( ( rule__BasicInterpretation__Group_1__0 )? )
            {
            // InternalSolverLanguage.g:2132:1: ( ( rule__BasicInterpretation__Group_1__0 )? )
            // InternalSolverLanguage.g:2133:2: ( rule__BasicInterpretation__Group_1__0 )?
            {
             before(grammarAccess.getBasicInterpretationAccess().getGroup_1()); 
            // InternalSolverLanguage.g:2134:2: ( rule__BasicInterpretation__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSolverLanguage.g:2134:3: rule__BasicInterpretation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicInterpretation__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicInterpretationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__BasicInterpretation__Group__1__Impl"


    // $ANTLR start "rule__BasicInterpretation__Group__2"
    // InternalSolverLanguage.g:2142:1: rule__BasicInterpretation__Group__2 : rule__BasicInterpretation__Group__2__Impl rule__BasicInterpretation__Group__3 ;
    public final void rule__BasicInterpretation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2146:1: ( rule__BasicInterpretation__Group__2__Impl rule__BasicInterpretation__Group__3 )
            // InternalSolverLanguage.g:2147:2: rule__BasicInterpretation__Group__2__Impl rule__BasicInterpretation__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__BasicInterpretation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__Group__3();

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
    // $ANTLR end "rule__BasicInterpretation__Group__2"


    // $ANTLR start "rule__BasicInterpretation__Group__2__Impl"
    // InternalSolverLanguage.g:2154:1: rule__BasicInterpretation__Group__2__Impl : ( ':' ) ;
    public final void rule__BasicInterpretation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2158:1: ( ( ':' ) )
            // InternalSolverLanguage.g:2159:1: ( ':' )
            {
            // InternalSolverLanguage.g:2159:1: ( ':' )
            // InternalSolverLanguage.g:2160:2: ':'
            {
             before(grammarAccess.getBasicInterpretationAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBasicInterpretationAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__BasicInterpretation__Group__2__Impl"


    // $ANTLR start "rule__BasicInterpretation__Group__3"
    // InternalSolverLanguage.g:2169:1: rule__BasicInterpretation__Group__3 : rule__BasicInterpretation__Group__3__Impl ;
    public final void rule__BasicInterpretation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2173:1: ( rule__BasicInterpretation__Group__3__Impl )
            // InternalSolverLanguage.g:2174:2: rule__BasicInterpretation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__Group__3__Impl();

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
    // $ANTLR end "rule__BasicInterpretation__Group__3"


    // $ANTLR start "rule__BasicInterpretation__Group__3__Impl"
    // InternalSolverLanguage.g:2180:1: rule__BasicInterpretation__Group__3__Impl : ( ( rule__BasicInterpretation__ValueAssignment_3 ) ) ;
    public final void rule__BasicInterpretation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2184:1: ( ( ( rule__BasicInterpretation__ValueAssignment_3 ) ) )
            // InternalSolverLanguage.g:2185:1: ( ( rule__BasicInterpretation__ValueAssignment_3 ) )
            {
            // InternalSolverLanguage.g:2185:1: ( ( rule__BasicInterpretation__ValueAssignment_3 ) )
            // InternalSolverLanguage.g:2186:2: ( rule__BasicInterpretation__ValueAssignment_3 )
            {
             before(grammarAccess.getBasicInterpretationAccess().getValueAssignment_3()); 
            // InternalSolverLanguage.g:2187:2: ( rule__BasicInterpretation__ValueAssignment_3 )
            // InternalSolverLanguage.g:2187:3: rule__BasicInterpretation__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBasicInterpretationAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__BasicInterpretation__Group__3__Impl"


    // $ANTLR start "rule__BasicInterpretation__Group_1__0"
    // InternalSolverLanguage.g:2196:1: rule__BasicInterpretation__Group_1__0 : rule__BasicInterpretation__Group_1__0__Impl rule__BasicInterpretation__Group_1__1 ;
    public final void rule__BasicInterpretation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2200:1: ( rule__BasicInterpretation__Group_1__0__Impl rule__BasicInterpretation__Group_1__1 )
            // InternalSolverLanguage.g:2201:2: rule__BasicInterpretation__Group_1__0__Impl rule__BasicInterpretation__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__BasicInterpretation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__Group_1__1();

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
    // $ANTLR end "rule__BasicInterpretation__Group_1__0"


    // $ANTLR start "rule__BasicInterpretation__Group_1__0__Impl"
    // InternalSolverLanguage.g:2208:1: rule__BasicInterpretation__Group_1__0__Impl : ( '(' ) ;
    public final void rule__BasicInterpretation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2212:1: ( ( '(' ) )
            // InternalSolverLanguage.g:2213:1: ( '(' )
            {
            // InternalSolverLanguage.g:2213:1: ( '(' )
            // InternalSolverLanguage.g:2214:2: '('
            {
             before(grammarAccess.getBasicInterpretationAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBasicInterpretationAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__BasicInterpretation__Group_1__0__Impl"


    // $ANTLR start "rule__BasicInterpretation__Group_1__1"
    // InternalSolverLanguage.g:2223:1: rule__BasicInterpretation__Group_1__1 : rule__BasicInterpretation__Group_1__1__Impl rule__BasicInterpretation__Group_1__2 ;
    public final void rule__BasicInterpretation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2227:1: ( rule__BasicInterpretation__Group_1__1__Impl rule__BasicInterpretation__Group_1__2 )
            // InternalSolverLanguage.g:2228:2: rule__BasicInterpretation__Group_1__1__Impl rule__BasicInterpretation__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__BasicInterpretation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__Group_1__2();

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
    // $ANTLR end "rule__BasicInterpretation__Group_1__1"


    // $ANTLR start "rule__BasicInterpretation__Group_1__1__Impl"
    // InternalSolverLanguage.g:2235:1: rule__BasicInterpretation__Group_1__1__Impl : ( ( rule__BasicInterpretation__Group_1_1__0 )? ) ;
    public final void rule__BasicInterpretation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2239:1: ( ( ( rule__BasicInterpretation__Group_1_1__0 )? ) )
            // InternalSolverLanguage.g:2240:1: ( ( rule__BasicInterpretation__Group_1_1__0 )? )
            {
            // InternalSolverLanguage.g:2240:1: ( ( rule__BasicInterpretation__Group_1_1__0 )? )
            // InternalSolverLanguage.g:2241:2: ( rule__BasicInterpretation__Group_1_1__0 )?
            {
             before(grammarAccess.getBasicInterpretationAccess().getGroup_1_1()); 
            // InternalSolverLanguage.g:2242:2: ( rule__BasicInterpretation__Group_1_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_INT && LA24_0<=RULE_STRING)||(LA24_0>=11 && LA24_0<=13)||LA24_0==17||LA24_0==27||LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSolverLanguage.g:2242:3: rule__BasicInterpretation__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicInterpretation__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicInterpretationAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__BasicInterpretation__Group_1__1__Impl"


    // $ANTLR start "rule__BasicInterpretation__Group_1__2"
    // InternalSolverLanguage.g:2250:1: rule__BasicInterpretation__Group_1__2 : rule__BasicInterpretation__Group_1__2__Impl ;
    public final void rule__BasicInterpretation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2254:1: ( rule__BasicInterpretation__Group_1__2__Impl )
            // InternalSolverLanguage.g:2255:2: rule__BasicInterpretation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__Group_1__2__Impl();

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
    // $ANTLR end "rule__BasicInterpretation__Group_1__2"


    // $ANTLR start "rule__BasicInterpretation__Group_1__2__Impl"
    // InternalSolverLanguage.g:2261:1: rule__BasicInterpretation__Group_1__2__Impl : ( ')' ) ;
    public final void rule__BasicInterpretation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2265:1: ( ( ')' ) )
            // InternalSolverLanguage.g:2266:1: ( ')' )
            {
            // InternalSolverLanguage.g:2266:1: ( ')' )
            // InternalSolverLanguage.g:2267:2: ')'
            {
             before(grammarAccess.getBasicInterpretationAccess().getRightParenthesisKeyword_1_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBasicInterpretationAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__BasicInterpretation__Group_1__2__Impl"


    // $ANTLR start "rule__BasicInterpretation__Group_1_1__0"
    // InternalSolverLanguage.g:2277:1: rule__BasicInterpretation__Group_1_1__0 : rule__BasicInterpretation__Group_1_1__0__Impl rule__BasicInterpretation__Group_1_1__1 ;
    public final void rule__BasicInterpretation__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2281:1: ( rule__BasicInterpretation__Group_1_1__0__Impl rule__BasicInterpretation__Group_1_1__1 )
            // InternalSolverLanguage.g:2282:2: rule__BasicInterpretation__Group_1_1__0__Impl rule__BasicInterpretation__Group_1_1__1
            {
            pushFollow(FOLLOW_14);
            rule__BasicInterpretation__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__Group_1_1__1();

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
    // $ANTLR end "rule__BasicInterpretation__Group_1_1__0"


    // $ANTLR start "rule__BasicInterpretation__Group_1_1__0__Impl"
    // InternalSolverLanguage.g:2289:1: rule__BasicInterpretation__Group_1_1__0__Impl : ( ( rule__BasicInterpretation__ObjectsAssignment_1_1_0 ) ) ;
    public final void rule__BasicInterpretation__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2293:1: ( ( ( rule__BasicInterpretation__ObjectsAssignment_1_1_0 ) ) )
            // InternalSolverLanguage.g:2294:1: ( ( rule__BasicInterpretation__ObjectsAssignment_1_1_0 ) )
            {
            // InternalSolverLanguage.g:2294:1: ( ( rule__BasicInterpretation__ObjectsAssignment_1_1_0 ) )
            // InternalSolverLanguage.g:2295:2: ( rule__BasicInterpretation__ObjectsAssignment_1_1_0 )
            {
             before(grammarAccess.getBasicInterpretationAccess().getObjectsAssignment_1_1_0()); 
            // InternalSolverLanguage.g:2296:2: ( rule__BasicInterpretation__ObjectsAssignment_1_1_0 )
            // InternalSolverLanguage.g:2296:3: rule__BasicInterpretation__ObjectsAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__ObjectsAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicInterpretationAccess().getObjectsAssignment_1_1_0()); 

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
    // $ANTLR end "rule__BasicInterpretation__Group_1_1__0__Impl"


    // $ANTLR start "rule__BasicInterpretation__Group_1_1__1"
    // InternalSolverLanguage.g:2304:1: rule__BasicInterpretation__Group_1_1__1 : rule__BasicInterpretation__Group_1_1__1__Impl ;
    public final void rule__BasicInterpretation__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2308:1: ( rule__BasicInterpretation__Group_1_1__1__Impl )
            // InternalSolverLanguage.g:2309:2: rule__BasicInterpretation__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__BasicInterpretation__Group_1_1__1"


    // $ANTLR start "rule__BasicInterpretation__Group_1_1__1__Impl"
    // InternalSolverLanguage.g:2315:1: rule__BasicInterpretation__Group_1_1__1__Impl : ( ( rule__BasicInterpretation__Group_1_1_1__0 )* ) ;
    public final void rule__BasicInterpretation__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2319:1: ( ( ( rule__BasicInterpretation__Group_1_1_1__0 )* ) )
            // InternalSolverLanguage.g:2320:1: ( ( rule__BasicInterpretation__Group_1_1_1__0 )* )
            {
            // InternalSolverLanguage.g:2320:1: ( ( rule__BasicInterpretation__Group_1_1_1__0 )* )
            // InternalSolverLanguage.g:2321:2: ( rule__BasicInterpretation__Group_1_1_1__0 )*
            {
             before(grammarAccess.getBasicInterpretationAccess().getGroup_1_1_1()); 
            // InternalSolverLanguage.g:2322:2: ( rule__BasicInterpretation__Group_1_1_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==20) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSolverLanguage.g:2322:3: rule__BasicInterpretation__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__BasicInterpretation__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getBasicInterpretationAccess().getGroup_1_1_1()); 

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
    // $ANTLR end "rule__BasicInterpretation__Group_1_1__1__Impl"


    // $ANTLR start "rule__BasicInterpretation__Group_1_1_1__0"
    // InternalSolverLanguage.g:2331:1: rule__BasicInterpretation__Group_1_1_1__0 : rule__BasicInterpretation__Group_1_1_1__0__Impl rule__BasicInterpretation__Group_1_1_1__1 ;
    public final void rule__BasicInterpretation__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2335:1: ( rule__BasicInterpretation__Group_1_1_1__0__Impl rule__BasicInterpretation__Group_1_1_1__1 )
            // InternalSolverLanguage.g:2336:2: rule__BasicInterpretation__Group_1_1_1__0__Impl rule__BasicInterpretation__Group_1_1_1__1
            {
            pushFollow(FOLLOW_16);
            rule__BasicInterpretation__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__Group_1_1_1__1();

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
    // $ANTLR end "rule__BasicInterpretation__Group_1_1_1__0"


    // $ANTLR start "rule__BasicInterpretation__Group_1_1_1__0__Impl"
    // InternalSolverLanguage.g:2343:1: rule__BasicInterpretation__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__BasicInterpretation__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2347:1: ( ( ',' ) )
            // InternalSolverLanguage.g:2348:1: ( ',' )
            {
            // InternalSolverLanguage.g:2348:1: ( ',' )
            // InternalSolverLanguage.g:2349:2: ','
            {
             before(grammarAccess.getBasicInterpretationAccess().getCommaKeyword_1_1_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBasicInterpretationAccess().getCommaKeyword_1_1_1_0()); 

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
    // $ANTLR end "rule__BasicInterpretation__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__BasicInterpretation__Group_1_1_1__1"
    // InternalSolverLanguage.g:2358:1: rule__BasicInterpretation__Group_1_1_1__1 : rule__BasicInterpretation__Group_1_1_1__1__Impl ;
    public final void rule__BasicInterpretation__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2362:1: ( rule__BasicInterpretation__Group_1_1_1__1__Impl )
            // InternalSolverLanguage.g:2363:2: rule__BasicInterpretation__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__Group_1_1_1__1__Impl();

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
    // $ANTLR end "rule__BasicInterpretation__Group_1_1_1__1"


    // $ANTLR start "rule__BasicInterpretation__Group_1_1_1__1__Impl"
    // InternalSolverLanguage.g:2369:1: rule__BasicInterpretation__Group_1_1_1__1__Impl : ( ( rule__BasicInterpretation__ObjectsAssignment_1_1_1_1 ) ) ;
    public final void rule__BasicInterpretation__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2373:1: ( ( ( rule__BasicInterpretation__ObjectsAssignment_1_1_1_1 ) ) )
            // InternalSolverLanguage.g:2374:1: ( ( rule__BasicInterpretation__ObjectsAssignment_1_1_1_1 ) )
            {
            // InternalSolverLanguage.g:2374:1: ( ( rule__BasicInterpretation__ObjectsAssignment_1_1_1_1 ) )
            // InternalSolverLanguage.g:2375:2: ( rule__BasicInterpretation__ObjectsAssignment_1_1_1_1 )
            {
             before(grammarAccess.getBasicInterpretationAccess().getObjectsAssignment_1_1_1_1()); 
            // InternalSolverLanguage.g:2376:2: ( rule__BasicInterpretation__ObjectsAssignment_1_1_1_1 )
            // InternalSolverLanguage.g:2376:3: rule__BasicInterpretation__ObjectsAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__ObjectsAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicInterpretationAccess().getObjectsAssignment_1_1_1_1()); 

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
    // $ANTLR end "rule__BasicInterpretation__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__ExistSymbol__Group__0"
    // InternalSolverLanguage.g:2385:1: rule__ExistSymbol__Group__0 : rule__ExistSymbol__Group__0__Impl rule__ExistSymbol__Group__1 ;
    public final void rule__ExistSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2389:1: ( rule__ExistSymbol__Group__0__Impl rule__ExistSymbol__Group__1 )
            // InternalSolverLanguage.g:2390:2: rule__ExistSymbol__Group__0__Impl rule__ExistSymbol__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__ExistSymbol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExistSymbol__Group__1();

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
    // $ANTLR end "rule__ExistSymbol__Group__0"


    // $ANTLR start "rule__ExistSymbol__Group__0__Impl"
    // InternalSolverLanguage.g:2397:1: rule__ExistSymbol__Group__0__Impl : ( 'exists' ) ;
    public final void rule__ExistSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2401:1: ( ( 'exists' ) )
            // InternalSolverLanguage.g:2402:1: ( 'exists' )
            {
            // InternalSolverLanguage.g:2402:1: ( 'exists' )
            // InternalSolverLanguage.g:2403:2: 'exists'
            {
             before(grammarAccess.getExistSymbolAccess().getExistsKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExistSymbolAccess().getExistsKeyword_0()); 

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
    // $ANTLR end "rule__ExistSymbol__Group__0__Impl"


    // $ANTLR start "rule__ExistSymbol__Group__1"
    // InternalSolverLanguage.g:2412:1: rule__ExistSymbol__Group__1 : rule__ExistSymbol__Group__1__Impl ;
    public final void rule__ExistSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2416:1: ( rule__ExistSymbol__Group__1__Impl )
            // InternalSolverLanguage.g:2417:2: rule__ExistSymbol__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExistSymbol__Group__1__Impl();

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
    // $ANTLR end "rule__ExistSymbol__Group__1"


    // $ANTLR start "rule__ExistSymbol__Group__1__Impl"
    // InternalSolverLanguage.g:2423:1: rule__ExistSymbol__Group__1__Impl : ( () ) ;
    public final void rule__ExistSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2427:1: ( ( () ) )
            // InternalSolverLanguage.g:2428:1: ( () )
            {
            // InternalSolverLanguage.g:2428:1: ( () )
            // InternalSolverLanguage.g:2429:2: ()
            {
             before(grammarAccess.getExistSymbolAccess().getExistSymbolAction_1()); 
            // InternalSolverLanguage.g:2430:2: ()
            // InternalSolverLanguage.g:2430:3: 
            {
            }

             after(grammarAccess.getExistSymbolAccess().getExistSymbolAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistSymbol__Group__1__Impl"


    // $ANTLR start "rule__EqualsSymbol__Group__0"
    // InternalSolverLanguage.g:2439:1: rule__EqualsSymbol__Group__0 : rule__EqualsSymbol__Group__0__Impl rule__EqualsSymbol__Group__1 ;
    public final void rule__EqualsSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2443:1: ( rule__EqualsSymbol__Group__0__Impl rule__EqualsSymbol__Group__1 )
            // InternalSolverLanguage.g:2444:2: rule__EqualsSymbol__Group__0__Impl rule__EqualsSymbol__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__EqualsSymbol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualsSymbol__Group__1();

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
    // $ANTLR end "rule__EqualsSymbol__Group__0"


    // $ANTLR start "rule__EqualsSymbol__Group__0__Impl"
    // InternalSolverLanguage.g:2451:1: rule__EqualsSymbol__Group__0__Impl : ( 'equals' ) ;
    public final void rule__EqualsSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2455:1: ( ( 'equals' ) )
            // InternalSolverLanguage.g:2456:1: ( 'equals' )
            {
            // InternalSolverLanguage.g:2456:1: ( 'equals' )
            // InternalSolverLanguage.g:2457:2: 'equals'
            {
             before(grammarAccess.getEqualsSymbolAccess().getEqualsKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEqualsSymbolAccess().getEqualsKeyword_0()); 

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
    // $ANTLR end "rule__EqualsSymbol__Group__0__Impl"


    // $ANTLR start "rule__EqualsSymbol__Group__1"
    // InternalSolverLanguage.g:2466:1: rule__EqualsSymbol__Group__1 : rule__EqualsSymbol__Group__1__Impl ;
    public final void rule__EqualsSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2470:1: ( rule__EqualsSymbol__Group__1__Impl )
            // InternalSolverLanguage.g:2471:2: rule__EqualsSymbol__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualsSymbol__Group__1__Impl();

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
    // $ANTLR end "rule__EqualsSymbol__Group__1"


    // $ANTLR start "rule__EqualsSymbol__Group__1__Impl"
    // InternalSolverLanguage.g:2477:1: rule__EqualsSymbol__Group__1__Impl : ( () ) ;
    public final void rule__EqualsSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2481:1: ( ( () ) )
            // InternalSolverLanguage.g:2482:1: ( () )
            {
            // InternalSolverLanguage.g:2482:1: ( () )
            // InternalSolverLanguage.g:2483:2: ()
            {
             before(grammarAccess.getEqualsSymbolAccess().getEqualsSymbolAction_1()); 
            // InternalSolverLanguage.g:2484:2: ()
            // InternalSolverLanguage.g:2484:3: 
            {
            }

             after(grammarAccess.getEqualsSymbolAccess().getEqualsSymbolAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsSymbol__Group__1__Impl"


    // $ANTLR start "rule__BooleanSymbol__Group__0"
    // InternalSolverLanguage.g:2493:1: rule__BooleanSymbol__Group__0 : rule__BooleanSymbol__Group__0__Impl rule__BooleanSymbol__Group__1 ;
    public final void rule__BooleanSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2497:1: ( rule__BooleanSymbol__Group__0__Impl rule__BooleanSymbol__Group__1 )
            // InternalSolverLanguage.g:2498:2: rule__BooleanSymbol__Group__0__Impl rule__BooleanSymbol__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__BooleanSymbol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanSymbol__Group__1();

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
    // $ANTLR end "rule__BooleanSymbol__Group__0"


    // $ANTLR start "rule__BooleanSymbol__Group__0__Impl"
    // InternalSolverLanguage.g:2505:1: rule__BooleanSymbol__Group__0__Impl : ( 'bool' ) ;
    public final void rule__BooleanSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2509:1: ( ( 'bool' ) )
            // InternalSolverLanguage.g:2510:1: ( 'bool' )
            {
            // InternalSolverLanguage.g:2510:1: ( 'bool' )
            // InternalSolverLanguage.g:2511:2: 'bool'
            {
             before(grammarAccess.getBooleanSymbolAccess().getBoolKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBooleanSymbolAccess().getBoolKeyword_0()); 

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
    // $ANTLR end "rule__BooleanSymbol__Group__0__Impl"


    // $ANTLR start "rule__BooleanSymbol__Group__1"
    // InternalSolverLanguage.g:2520:1: rule__BooleanSymbol__Group__1 : rule__BooleanSymbol__Group__1__Impl ;
    public final void rule__BooleanSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2524:1: ( rule__BooleanSymbol__Group__1__Impl )
            // InternalSolverLanguage.g:2525:2: rule__BooleanSymbol__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanSymbol__Group__1__Impl();

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
    // $ANTLR end "rule__BooleanSymbol__Group__1"


    // $ANTLR start "rule__BooleanSymbol__Group__1__Impl"
    // InternalSolverLanguage.g:2531:1: rule__BooleanSymbol__Group__1__Impl : ( () ) ;
    public final void rule__BooleanSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2535:1: ( ( () ) )
            // InternalSolverLanguage.g:2536:1: ( () )
            {
            // InternalSolverLanguage.g:2536:1: ( () )
            // InternalSolverLanguage.g:2537:2: ()
            {
             before(grammarAccess.getBooleanSymbolAccess().getBooleanSymbolAction_1()); 
            // InternalSolverLanguage.g:2538:2: ()
            // InternalSolverLanguage.g:2538:3: 
            {
            }

             after(grammarAccess.getBooleanSymbolAccess().getBooleanSymbolAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanSymbol__Group__1__Impl"


    // $ANTLR start "rule__IntegerSymbol__Group__0"
    // InternalSolverLanguage.g:2547:1: rule__IntegerSymbol__Group__0 : rule__IntegerSymbol__Group__0__Impl rule__IntegerSymbol__Group__1 ;
    public final void rule__IntegerSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2551:1: ( rule__IntegerSymbol__Group__0__Impl rule__IntegerSymbol__Group__1 )
            // InternalSolverLanguage.g:2552:2: rule__IntegerSymbol__Group__0__Impl rule__IntegerSymbol__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__IntegerSymbol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerSymbol__Group__1();

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
    // $ANTLR end "rule__IntegerSymbol__Group__0"


    // $ANTLR start "rule__IntegerSymbol__Group__0__Impl"
    // InternalSolverLanguage.g:2559:1: rule__IntegerSymbol__Group__0__Impl : ( 'int' ) ;
    public final void rule__IntegerSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2563:1: ( ( 'int' ) )
            // InternalSolverLanguage.g:2564:1: ( 'int' )
            {
            // InternalSolverLanguage.g:2564:1: ( 'int' )
            // InternalSolverLanguage.g:2565:2: 'int'
            {
             before(grammarAccess.getIntegerSymbolAccess().getIntKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIntegerSymbolAccess().getIntKeyword_0()); 

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
    // $ANTLR end "rule__IntegerSymbol__Group__0__Impl"


    // $ANTLR start "rule__IntegerSymbol__Group__1"
    // InternalSolverLanguage.g:2574:1: rule__IntegerSymbol__Group__1 : rule__IntegerSymbol__Group__1__Impl ;
    public final void rule__IntegerSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2578:1: ( rule__IntegerSymbol__Group__1__Impl )
            // InternalSolverLanguage.g:2579:2: rule__IntegerSymbol__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerSymbol__Group__1__Impl();

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
    // $ANTLR end "rule__IntegerSymbol__Group__1"


    // $ANTLR start "rule__IntegerSymbol__Group__1__Impl"
    // InternalSolverLanguage.g:2585:1: rule__IntegerSymbol__Group__1__Impl : ( () ) ;
    public final void rule__IntegerSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2589:1: ( ( () ) )
            // InternalSolverLanguage.g:2590:1: ( () )
            {
            // InternalSolverLanguage.g:2590:1: ( () )
            // InternalSolverLanguage.g:2591:2: ()
            {
             before(grammarAccess.getIntegerSymbolAccess().getIntegerSymbolAction_1()); 
            // InternalSolverLanguage.g:2592:2: ()
            // InternalSolverLanguage.g:2592:3: 
            {
            }

             after(grammarAccess.getIntegerSymbolAccess().getIntegerSymbolAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerSymbol__Group__1__Impl"


    // $ANTLR start "rule__RealSymbol__Group__0"
    // InternalSolverLanguage.g:2601:1: rule__RealSymbol__Group__0 : rule__RealSymbol__Group__0__Impl rule__RealSymbol__Group__1 ;
    public final void rule__RealSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2605:1: ( rule__RealSymbol__Group__0__Impl rule__RealSymbol__Group__1 )
            // InternalSolverLanguage.g:2606:2: rule__RealSymbol__Group__0__Impl rule__RealSymbol__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__RealSymbol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealSymbol__Group__1();

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
    // $ANTLR end "rule__RealSymbol__Group__0"


    // $ANTLR start "rule__RealSymbol__Group__0__Impl"
    // InternalSolverLanguage.g:2613:1: rule__RealSymbol__Group__0__Impl : ( 'real' ) ;
    public final void rule__RealSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2617:1: ( ( 'real' ) )
            // InternalSolverLanguage.g:2618:1: ( 'real' )
            {
            // InternalSolverLanguage.g:2618:1: ( 'real' )
            // InternalSolverLanguage.g:2619:2: 'real'
            {
             before(grammarAccess.getRealSymbolAccess().getRealKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRealSymbolAccess().getRealKeyword_0()); 

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
    // $ANTLR end "rule__RealSymbol__Group__0__Impl"


    // $ANTLR start "rule__RealSymbol__Group__1"
    // InternalSolverLanguage.g:2628:1: rule__RealSymbol__Group__1 : rule__RealSymbol__Group__1__Impl ;
    public final void rule__RealSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2632:1: ( rule__RealSymbol__Group__1__Impl )
            // InternalSolverLanguage.g:2633:2: rule__RealSymbol__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RealSymbol__Group__1__Impl();

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
    // $ANTLR end "rule__RealSymbol__Group__1"


    // $ANTLR start "rule__RealSymbol__Group__1__Impl"
    // InternalSolverLanguage.g:2639:1: rule__RealSymbol__Group__1__Impl : ( () ) ;
    public final void rule__RealSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2643:1: ( ( () ) )
            // InternalSolverLanguage.g:2644:1: ( () )
            {
            // InternalSolverLanguage.g:2644:1: ( () )
            // InternalSolverLanguage.g:2645:2: ()
            {
             before(grammarAccess.getRealSymbolAccess().getRealSymbolAction_1()); 
            // InternalSolverLanguage.g:2646:2: ()
            // InternalSolverLanguage.g:2646:3: 
            {
            }

             after(grammarAccess.getRealSymbolAccess().getRealSymbolAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealSymbol__Group__1__Impl"


    // $ANTLR start "rule__StringSymbol__Group__0"
    // InternalSolverLanguage.g:2655:1: rule__StringSymbol__Group__0 : rule__StringSymbol__Group__0__Impl rule__StringSymbol__Group__1 ;
    public final void rule__StringSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2659:1: ( rule__StringSymbol__Group__0__Impl rule__StringSymbol__Group__1 )
            // InternalSolverLanguage.g:2660:2: rule__StringSymbol__Group__0__Impl rule__StringSymbol__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__StringSymbol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringSymbol__Group__1();

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
    // $ANTLR end "rule__StringSymbol__Group__0"


    // $ANTLR start "rule__StringSymbol__Group__0__Impl"
    // InternalSolverLanguage.g:2667:1: rule__StringSymbol__Group__0__Impl : ( 'string' ) ;
    public final void rule__StringSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2671:1: ( ( 'string' ) )
            // InternalSolverLanguage.g:2672:1: ( 'string' )
            {
            // InternalSolverLanguage.g:2672:1: ( 'string' )
            // InternalSolverLanguage.g:2673:2: 'string'
            {
             before(grammarAccess.getStringSymbolAccess().getStringKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStringSymbolAccess().getStringKeyword_0()); 

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
    // $ANTLR end "rule__StringSymbol__Group__0__Impl"


    // $ANTLR start "rule__StringSymbol__Group__1"
    // InternalSolverLanguage.g:2682:1: rule__StringSymbol__Group__1 : rule__StringSymbol__Group__1__Impl ;
    public final void rule__StringSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2686:1: ( rule__StringSymbol__Group__1__Impl )
            // InternalSolverLanguage.g:2687:2: rule__StringSymbol__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringSymbol__Group__1__Impl();

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
    // $ANTLR end "rule__StringSymbol__Group__1"


    // $ANTLR start "rule__StringSymbol__Group__1__Impl"
    // InternalSolverLanguage.g:2693:1: rule__StringSymbol__Group__1__Impl : ( () ) ;
    public final void rule__StringSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2697:1: ( ( () ) )
            // InternalSolverLanguage.g:2698:1: ( () )
            {
            // InternalSolverLanguage.g:2698:1: ( () )
            // InternalSolverLanguage.g:2699:2: ()
            {
             before(grammarAccess.getStringSymbolAccess().getStringSymbolAction_1()); 
            // InternalSolverLanguage.g:2700:2: ()
            // InternalSolverLanguage.g:2700:3: 
            {
            }

             after(grammarAccess.getStringSymbolAccess().getStringSymbolAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringSymbol__Group__1__Impl"


    // $ANTLR start "rule__NamedObject__Group__0"
    // InternalSolverLanguage.g:2709:1: rule__NamedObject__Group__0 : rule__NamedObject__Group__0__Impl rule__NamedObject__Group__1 ;
    public final void rule__NamedObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2713:1: ( rule__NamedObject__Group__0__Impl rule__NamedObject__Group__1 )
            // InternalSolverLanguage.g:2714:2: rule__NamedObject__Group__0__Impl rule__NamedObject__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__NamedObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedObject__Group__1();

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
    // $ANTLR end "rule__NamedObject__Group__0"


    // $ANTLR start "rule__NamedObject__Group__0__Impl"
    // InternalSolverLanguage.g:2721:1: rule__NamedObject__Group__0__Impl : ( '\\'' ) ;
    public final void rule__NamedObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2725:1: ( ( '\\'' ) )
            // InternalSolverLanguage.g:2726:1: ( '\\'' )
            {
            // InternalSolverLanguage.g:2726:1: ( '\\'' )
            // InternalSolverLanguage.g:2727:2: '\\''
            {
             before(grammarAccess.getNamedObjectAccess().getApostropheKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNamedObjectAccess().getApostropheKeyword_0()); 

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
    // $ANTLR end "rule__NamedObject__Group__0__Impl"


    // $ANTLR start "rule__NamedObject__Group__1"
    // InternalSolverLanguage.g:2736:1: rule__NamedObject__Group__1 : rule__NamedObject__Group__1__Impl rule__NamedObject__Group__2 ;
    public final void rule__NamedObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2740:1: ( rule__NamedObject__Group__1__Impl rule__NamedObject__Group__2 )
            // InternalSolverLanguage.g:2741:2: rule__NamedObject__Group__1__Impl rule__NamedObject__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__NamedObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedObject__Group__2();

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
    // $ANTLR end "rule__NamedObject__Group__1"


    // $ANTLR start "rule__NamedObject__Group__1__Impl"
    // InternalSolverLanguage.g:2748:1: rule__NamedObject__Group__1__Impl : ( ( rule__NamedObject__NameAssignment_1 ) ) ;
    public final void rule__NamedObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2752:1: ( ( ( rule__NamedObject__NameAssignment_1 ) ) )
            // InternalSolverLanguage.g:2753:1: ( ( rule__NamedObject__NameAssignment_1 ) )
            {
            // InternalSolverLanguage.g:2753:1: ( ( rule__NamedObject__NameAssignment_1 ) )
            // InternalSolverLanguage.g:2754:2: ( rule__NamedObject__NameAssignment_1 )
            {
             before(grammarAccess.getNamedObjectAccess().getNameAssignment_1()); 
            // InternalSolverLanguage.g:2755:2: ( rule__NamedObject__NameAssignment_1 )
            // InternalSolverLanguage.g:2755:3: rule__NamedObject__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedObject__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedObjectAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__NamedObject__Group__1__Impl"


    // $ANTLR start "rule__NamedObject__Group__2"
    // InternalSolverLanguage.g:2763:1: rule__NamedObject__Group__2 : rule__NamedObject__Group__2__Impl ;
    public final void rule__NamedObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2767:1: ( rule__NamedObject__Group__2__Impl )
            // InternalSolverLanguage.g:2768:2: rule__NamedObject__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedObject__Group__2__Impl();

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
    // $ANTLR end "rule__NamedObject__Group__2"


    // $ANTLR start "rule__NamedObject__Group__2__Impl"
    // InternalSolverLanguage.g:2774:1: rule__NamedObject__Group__2__Impl : ( '\\'' ) ;
    public final void rule__NamedObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2778:1: ( ( '\\'' ) )
            // InternalSolverLanguage.g:2779:1: ( '\\'' )
            {
            // InternalSolverLanguage.g:2779:1: ( '\\'' )
            // InternalSolverLanguage.g:2780:2: '\\''
            {
             before(grammarAccess.getNamedObjectAccess().getApostropheKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNamedObjectAccess().getApostropheKeyword_2()); 

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
    // $ANTLR end "rule__NamedObject__Group__2__Impl"


    // $ANTLR start "rule__Predicate__Group__0"
    // InternalSolverLanguage.g:2790:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2794:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // InternalSolverLanguage.g:2795:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Predicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__1();

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
    // $ANTLR end "rule__Predicate__Group__0"


    // $ANTLR start "rule__Predicate__Group__0__Impl"
    // InternalSolverLanguage.g:2802:1: rule__Predicate__Group__0__Impl : ( ( rule__Predicate__IsErrorAssignment_0 )? ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2806:1: ( ( ( rule__Predicate__IsErrorAssignment_0 )? ) )
            // InternalSolverLanguage.g:2807:1: ( ( rule__Predicate__IsErrorAssignment_0 )? )
            {
            // InternalSolverLanguage.g:2807:1: ( ( rule__Predicate__IsErrorAssignment_0 )? )
            // InternalSolverLanguage.g:2808:2: ( rule__Predicate__IsErrorAssignment_0 )?
            {
             before(grammarAccess.getPredicateAccess().getIsErrorAssignment_0()); 
            // InternalSolverLanguage.g:2809:2: ( rule__Predicate__IsErrorAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSolverLanguage.g:2809:3: rule__Predicate__IsErrorAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Predicate__IsErrorAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPredicateAccess().getIsErrorAssignment_0()); 

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
    // $ANTLR end "rule__Predicate__Group__0__Impl"


    // $ANTLR start "rule__Predicate__Group__1"
    // InternalSolverLanguage.g:2817:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl rule__Predicate__Group__2 ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2821:1: ( rule__Predicate__Group__1__Impl rule__Predicate__Group__2 )
            // InternalSolverLanguage.g:2822:2: rule__Predicate__Group__1__Impl rule__Predicate__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Predicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__2();

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
    // $ANTLR end "rule__Predicate__Group__1"


    // $ANTLR start "rule__Predicate__Group__1__Impl"
    // InternalSolverLanguage.g:2829:1: rule__Predicate__Group__1__Impl : ( ( rule__Predicate__SymbolAssignment_1 ) ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2833:1: ( ( ( rule__Predicate__SymbolAssignment_1 ) ) )
            // InternalSolverLanguage.g:2834:1: ( ( rule__Predicate__SymbolAssignment_1 ) )
            {
            // InternalSolverLanguage.g:2834:1: ( ( rule__Predicate__SymbolAssignment_1 ) )
            // InternalSolverLanguage.g:2835:2: ( rule__Predicate__SymbolAssignment_1 )
            {
             before(grammarAccess.getPredicateAccess().getSymbolAssignment_1()); 
            // InternalSolverLanguage.g:2836:2: ( rule__Predicate__SymbolAssignment_1 )
            // InternalSolverLanguage.g:2836:3: rule__Predicate__SymbolAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__SymbolAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getSymbolAssignment_1()); 

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
    // $ANTLR end "rule__Predicate__Group__1__Impl"


    // $ANTLR start "rule__Predicate__Group__2"
    // InternalSolverLanguage.g:2844:1: rule__Predicate__Group__2 : rule__Predicate__Group__2__Impl rule__Predicate__Group__3 ;
    public final void rule__Predicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2848:1: ( rule__Predicate__Group__2__Impl rule__Predicate__Group__3 )
            // InternalSolverLanguage.g:2849:2: rule__Predicate__Group__2__Impl rule__Predicate__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Predicate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__3();

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
    // $ANTLR end "rule__Predicate__Group__2"


    // $ANTLR start "rule__Predicate__Group__2__Impl"
    // InternalSolverLanguage.g:2856:1: rule__Predicate__Group__2__Impl : ( ( rule__Predicate__Group_2__0 )? ) ;
    public final void rule__Predicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2860:1: ( ( ( rule__Predicate__Group_2__0 )? ) )
            // InternalSolverLanguage.g:2861:1: ( ( rule__Predicate__Group_2__0 )? )
            {
            // InternalSolverLanguage.g:2861:1: ( ( rule__Predicate__Group_2__0 )? )
            // InternalSolverLanguage.g:2862:2: ( rule__Predicate__Group_2__0 )?
            {
             before(grammarAccess.getPredicateAccess().getGroup_2()); 
            // InternalSolverLanguage.g:2863:2: ( rule__Predicate__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSolverLanguage.g:2863:3: rule__Predicate__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Predicate__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPredicateAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Predicate__Group__2__Impl"


    // $ANTLR start "rule__Predicate__Group__3"
    // InternalSolverLanguage.g:2871:1: rule__Predicate__Group__3 : rule__Predicate__Group__3__Impl rule__Predicate__Group__4 ;
    public final void rule__Predicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2875:1: ( rule__Predicate__Group__3__Impl rule__Predicate__Group__4 )
            // InternalSolverLanguage.g:2876:2: rule__Predicate__Group__3__Impl rule__Predicate__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Predicate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__4();

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
    // $ANTLR end "rule__Predicate__Group__3"


    // $ANTLR start "rule__Predicate__Group__3__Impl"
    // InternalSolverLanguage.g:2883:1: rule__Predicate__Group__3__Impl : ( ':-' ) ;
    public final void rule__Predicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2887:1: ( ( ':-' ) )
            // InternalSolverLanguage.g:2888:1: ( ':-' )
            {
            // InternalSolverLanguage.g:2888:1: ( ':-' )
            // InternalSolverLanguage.g:2889:2: ':-'
            {
             before(grammarAccess.getPredicateAccess().getColonHyphenMinusKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getColonHyphenMinusKeyword_3()); 

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
    // $ANTLR end "rule__Predicate__Group__3__Impl"


    // $ANTLR start "rule__Predicate__Group__4"
    // InternalSolverLanguage.g:2898:1: rule__Predicate__Group__4 : rule__Predicate__Group__4__Impl rule__Predicate__Group__5 ;
    public final void rule__Predicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2902:1: ( rule__Predicate__Group__4__Impl rule__Predicate__Group__5 )
            // InternalSolverLanguage.g:2903:2: rule__Predicate__Group__4__Impl rule__Predicate__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Predicate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__5();

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
    // $ANTLR end "rule__Predicate__Group__4"


    // $ANTLR start "rule__Predicate__Group__4__Impl"
    // InternalSolverLanguage.g:2910:1: rule__Predicate__Group__4__Impl : ( ( rule__Predicate__Alternatives_4 ) ) ;
    public final void rule__Predicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2914:1: ( ( ( rule__Predicate__Alternatives_4 ) ) )
            // InternalSolverLanguage.g:2915:1: ( ( rule__Predicate__Alternatives_4 ) )
            {
            // InternalSolverLanguage.g:2915:1: ( ( rule__Predicate__Alternatives_4 ) )
            // InternalSolverLanguage.g:2916:2: ( rule__Predicate__Alternatives_4 )
            {
             before(grammarAccess.getPredicateAccess().getAlternatives_4()); 
            // InternalSolverLanguage.g:2917:2: ( rule__Predicate__Alternatives_4 )
            // InternalSolverLanguage.g:2917:3: rule__Predicate__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__Predicate__Group__4__Impl"


    // $ANTLR start "rule__Predicate__Group__5"
    // InternalSolverLanguage.g:2925:1: rule__Predicate__Group__5 : rule__Predicate__Group__5__Impl ;
    public final void rule__Predicate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2929:1: ( rule__Predicate__Group__5__Impl )
            // InternalSolverLanguage.g:2930:2: rule__Predicate__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__5__Impl();

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
    // $ANTLR end "rule__Predicate__Group__5"


    // $ANTLR start "rule__Predicate__Group__5__Impl"
    // InternalSolverLanguage.g:2936:1: rule__Predicate__Group__5__Impl : ( '.' ) ;
    public final void rule__Predicate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2940:1: ( ( '.' ) )
            // InternalSolverLanguage.g:2941:1: ( '.' )
            {
            // InternalSolverLanguage.g:2941:1: ( '.' )
            // InternalSolverLanguage.g:2942:2: '.'
            {
             before(grammarAccess.getPredicateAccess().getFullStopKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getFullStopKeyword_5()); 

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
    // $ANTLR end "rule__Predicate__Group__5__Impl"


    // $ANTLR start "rule__Predicate__Group_2__0"
    // InternalSolverLanguage.g:2952:1: rule__Predicate__Group_2__0 : rule__Predicate__Group_2__0__Impl rule__Predicate__Group_2__1 ;
    public final void rule__Predicate__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2956:1: ( rule__Predicate__Group_2__0__Impl rule__Predicate__Group_2__1 )
            // InternalSolverLanguage.g:2957:2: rule__Predicate__Group_2__0__Impl rule__Predicate__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__Predicate__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group_2__1();

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
    // $ANTLR end "rule__Predicate__Group_2__0"


    // $ANTLR start "rule__Predicate__Group_2__0__Impl"
    // InternalSolverLanguage.g:2964:1: rule__Predicate__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Predicate__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2968:1: ( ( '(' ) )
            // InternalSolverLanguage.g:2969:1: ( '(' )
            {
            // InternalSolverLanguage.g:2969:1: ( '(' )
            // InternalSolverLanguage.g:2970:2: '('
            {
             before(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Predicate__Group_2__0__Impl"


    // $ANTLR start "rule__Predicate__Group_2__1"
    // InternalSolverLanguage.g:2979:1: rule__Predicate__Group_2__1 : rule__Predicate__Group_2__1__Impl rule__Predicate__Group_2__2 ;
    public final void rule__Predicate__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2983:1: ( rule__Predicate__Group_2__1__Impl rule__Predicate__Group_2__2 )
            // InternalSolverLanguage.g:2984:2: rule__Predicate__Group_2__1__Impl rule__Predicate__Group_2__2
            {
            pushFollow(FOLLOW_22);
            rule__Predicate__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group_2__2();

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
    // $ANTLR end "rule__Predicate__Group_2__1"


    // $ANTLR start "rule__Predicate__Group_2__1__Impl"
    // InternalSolverLanguage.g:2991:1: rule__Predicate__Group_2__1__Impl : ( ( rule__Predicate__Group_2_1__0 )? ) ;
    public final void rule__Predicate__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2995:1: ( ( ( rule__Predicate__Group_2_1__0 )? ) )
            // InternalSolverLanguage.g:2996:1: ( ( rule__Predicate__Group_2_1__0 )? )
            {
            // InternalSolverLanguage.g:2996:1: ( ( rule__Predicate__Group_2_1__0 )? )
            // InternalSolverLanguage.g:2997:2: ( rule__Predicate__Group_2_1__0 )?
            {
             before(grammarAccess.getPredicateAccess().getGroup_2_1()); 
            // InternalSolverLanguage.g:2998:2: ( rule__Predicate__Group_2_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSolverLanguage.g:2998:3: rule__Predicate__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Predicate__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPredicateAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Predicate__Group_2__1__Impl"


    // $ANTLR start "rule__Predicate__Group_2__2"
    // InternalSolverLanguage.g:3006:1: rule__Predicate__Group_2__2 : rule__Predicate__Group_2__2__Impl ;
    public final void rule__Predicate__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3010:1: ( rule__Predicate__Group_2__2__Impl )
            // InternalSolverLanguage.g:3011:2: rule__Predicate__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group_2__2__Impl();

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
    // $ANTLR end "rule__Predicate__Group_2__2"


    // $ANTLR start "rule__Predicate__Group_2__2__Impl"
    // InternalSolverLanguage.g:3017:1: rule__Predicate__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Predicate__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3021:1: ( ( ')' ) )
            // InternalSolverLanguage.g:3022:1: ( ')' )
            {
            // InternalSolverLanguage.g:3022:1: ( ')' )
            // InternalSolverLanguage.g:3023:2: ')'
            {
             before(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_2_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Predicate__Group_2__2__Impl"


    // $ANTLR start "rule__Predicate__Group_2_1__0"
    // InternalSolverLanguage.g:3033:1: rule__Predicate__Group_2_1__0 : rule__Predicate__Group_2_1__0__Impl rule__Predicate__Group_2_1__1 ;
    public final void rule__Predicate__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3037:1: ( rule__Predicate__Group_2_1__0__Impl rule__Predicate__Group_2_1__1 )
            // InternalSolverLanguage.g:3038:2: rule__Predicate__Group_2_1__0__Impl rule__Predicate__Group_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Predicate__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group_2_1__1();

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
    // $ANTLR end "rule__Predicate__Group_2_1__0"


    // $ANTLR start "rule__Predicate__Group_2_1__0__Impl"
    // InternalSolverLanguage.g:3045:1: rule__Predicate__Group_2_1__0__Impl : ( ( rule__Predicate__ParametersAssignment_2_1_0 ) ) ;
    public final void rule__Predicate__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3049:1: ( ( ( rule__Predicate__ParametersAssignment_2_1_0 ) ) )
            // InternalSolverLanguage.g:3050:1: ( ( rule__Predicate__ParametersAssignment_2_1_0 ) )
            {
            // InternalSolverLanguage.g:3050:1: ( ( rule__Predicate__ParametersAssignment_2_1_0 ) )
            // InternalSolverLanguage.g:3051:2: ( rule__Predicate__ParametersAssignment_2_1_0 )
            {
             before(grammarAccess.getPredicateAccess().getParametersAssignment_2_1_0()); 
            // InternalSolverLanguage.g:3052:2: ( rule__Predicate__ParametersAssignment_2_1_0 )
            // InternalSolverLanguage.g:3052:3: rule__Predicate__ParametersAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__ParametersAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getParametersAssignment_2_1_0()); 

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
    // $ANTLR end "rule__Predicate__Group_2_1__0__Impl"


    // $ANTLR start "rule__Predicate__Group_2_1__1"
    // InternalSolverLanguage.g:3060:1: rule__Predicate__Group_2_1__1 : rule__Predicate__Group_2_1__1__Impl ;
    public final void rule__Predicate__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3064:1: ( rule__Predicate__Group_2_1__1__Impl )
            // InternalSolverLanguage.g:3065:2: rule__Predicate__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Predicate__Group_2_1__1"


    // $ANTLR start "rule__Predicate__Group_2_1__1__Impl"
    // InternalSolverLanguage.g:3071:1: rule__Predicate__Group_2_1__1__Impl : ( ( rule__Predicate__Group_2_1_1__0 )* ) ;
    public final void rule__Predicate__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3075:1: ( ( ( rule__Predicate__Group_2_1_1__0 )* ) )
            // InternalSolverLanguage.g:3076:1: ( ( rule__Predicate__Group_2_1_1__0 )* )
            {
            // InternalSolverLanguage.g:3076:1: ( ( rule__Predicate__Group_2_1_1__0 )* )
            // InternalSolverLanguage.g:3077:2: ( rule__Predicate__Group_2_1_1__0 )*
            {
             before(grammarAccess.getPredicateAccess().getGroup_2_1_1()); 
            // InternalSolverLanguage.g:3078:2: ( rule__Predicate__Group_2_1_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==20) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSolverLanguage.g:3078:3: rule__Predicate__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Predicate__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getPredicateAccess().getGroup_2_1_1()); 

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
    // $ANTLR end "rule__Predicate__Group_2_1__1__Impl"


    // $ANTLR start "rule__Predicate__Group_2_1_1__0"
    // InternalSolverLanguage.g:3087:1: rule__Predicate__Group_2_1_1__0 : rule__Predicate__Group_2_1_1__0__Impl rule__Predicate__Group_2_1_1__1 ;
    public final void rule__Predicate__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3091:1: ( rule__Predicate__Group_2_1_1__0__Impl rule__Predicate__Group_2_1_1__1 )
            // InternalSolverLanguage.g:3092:2: rule__Predicate__Group_2_1_1__0__Impl rule__Predicate__Group_2_1_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Predicate__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group_2_1_1__1();

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
    // $ANTLR end "rule__Predicate__Group_2_1_1__0"


    // $ANTLR start "rule__Predicate__Group_2_1_1__0__Impl"
    // InternalSolverLanguage.g:3099:1: rule__Predicate__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Predicate__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3103:1: ( ( ',' ) )
            // InternalSolverLanguage.g:3104:1: ( ',' )
            {
            // InternalSolverLanguage.g:3104:1: ( ',' )
            // InternalSolverLanguage.g:3105:2: ','
            {
             before(grammarAccess.getPredicateAccess().getCommaKeyword_2_1_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getCommaKeyword_2_1_1_0()); 

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
    // $ANTLR end "rule__Predicate__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__Predicate__Group_2_1_1__1"
    // InternalSolverLanguage.g:3114:1: rule__Predicate__Group_2_1_1__1 : rule__Predicate__Group_2_1_1__1__Impl ;
    public final void rule__Predicate__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3118:1: ( rule__Predicate__Group_2_1_1__1__Impl )
            // InternalSolverLanguage.g:3119:2: rule__Predicate__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__Predicate__Group_2_1_1__1"


    // $ANTLR start "rule__Predicate__Group_2_1_1__1__Impl"
    // InternalSolverLanguage.g:3125:1: rule__Predicate__Group_2_1_1__1__Impl : ( ( rule__Predicate__ParametersAssignment_2_1_1_1 ) ) ;
    public final void rule__Predicate__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3129:1: ( ( ( rule__Predicate__ParametersAssignment_2_1_1_1 ) ) )
            // InternalSolverLanguage.g:3130:1: ( ( rule__Predicate__ParametersAssignment_2_1_1_1 ) )
            {
            // InternalSolverLanguage.g:3130:1: ( ( rule__Predicate__ParametersAssignment_2_1_1_1 ) )
            // InternalSolverLanguage.g:3131:2: ( rule__Predicate__ParametersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getPredicateAccess().getParametersAssignment_2_1_1_1()); 
            // InternalSolverLanguage.g:3132:2: ( rule__Predicate__ParametersAssignment_2_1_1_1 )
            // InternalSolverLanguage.g:3132:3: rule__Predicate__ParametersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__ParametersAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getParametersAssignment_2_1_1_1()); 

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
    // $ANTLR end "rule__Predicate__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__Predicate__Group_4_1__0"
    // InternalSolverLanguage.g:3141:1: rule__Predicate__Group_4_1__0 : rule__Predicate__Group_4_1__0__Impl rule__Predicate__Group_4_1__1 ;
    public final void rule__Predicate__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3145:1: ( rule__Predicate__Group_4_1__0__Impl rule__Predicate__Group_4_1__1 )
            // InternalSolverLanguage.g:3146:2: rule__Predicate__Group_4_1__0__Impl rule__Predicate__Group_4_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Predicate__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group_4_1__1();

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
    // $ANTLR end "rule__Predicate__Group_4_1__0"


    // $ANTLR start "rule__Predicate__Group_4_1__0__Impl"
    // InternalSolverLanguage.g:3153:1: rule__Predicate__Group_4_1__0__Impl : ( ( rule__Predicate__BodiesAssignment_4_1_0 ) ) ;
    public final void rule__Predicate__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3157:1: ( ( ( rule__Predicate__BodiesAssignment_4_1_0 ) ) )
            // InternalSolverLanguage.g:3158:1: ( ( rule__Predicate__BodiesAssignment_4_1_0 ) )
            {
            // InternalSolverLanguage.g:3158:1: ( ( rule__Predicate__BodiesAssignment_4_1_0 ) )
            // InternalSolverLanguage.g:3159:2: ( rule__Predicate__BodiesAssignment_4_1_0 )
            {
             before(grammarAccess.getPredicateAccess().getBodiesAssignment_4_1_0()); 
            // InternalSolverLanguage.g:3160:2: ( rule__Predicate__BodiesAssignment_4_1_0 )
            // InternalSolverLanguage.g:3160:3: rule__Predicate__BodiesAssignment_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__BodiesAssignment_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getBodiesAssignment_4_1_0()); 

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
    // $ANTLR end "rule__Predicate__Group_4_1__0__Impl"


    // $ANTLR start "rule__Predicate__Group_4_1__1"
    // InternalSolverLanguage.g:3168:1: rule__Predicate__Group_4_1__1 : rule__Predicate__Group_4_1__1__Impl ;
    public final void rule__Predicate__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3172:1: ( rule__Predicate__Group_4_1__1__Impl )
            // InternalSolverLanguage.g:3173:2: rule__Predicate__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__Predicate__Group_4_1__1"


    // $ANTLR start "rule__Predicate__Group_4_1__1__Impl"
    // InternalSolverLanguage.g:3179:1: rule__Predicate__Group_4_1__1__Impl : ( ( rule__Predicate__Group_4_1_1__0 )* ) ;
    public final void rule__Predicate__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3183:1: ( ( ( rule__Predicate__Group_4_1_1__0 )* ) )
            // InternalSolverLanguage.g:3184:1: ( ( rule__Predicate__Group_4_1_1__0 )* )
            {
            // InternalSolverLanguage.g:3184:1: ( ( rule__Predicate__Group_4_1_1__0 )* )
            // InternalSolverLanguage.g:3185:2: ( rule__Predicate__Group_4_1_1__0 )*
            {
             before(grammarAccess.getPredicateAccess().getGroup_4_1_1()); 
            // InternalSolverLanguage.g:3186:2: ( rule__Predicate__Group_4_1_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==29) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSolverLanguage.g:3186:3: rule__Predicate__Group_4_1_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Predicate__Group_4_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getPredicateAccess().getGroup_4_1_1()); 

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
    // $ANTLR end "rule__Predicate__Group_4_1__1__Impl"


    // $ANTLR start "rule__Predicate__Group_4_1_1__0"
    // InternalSolverLanguage.g:3195:1: rule__Predicate__Group_4_1_1__0 : rule__Predicate__Group_4_1_1__0__Impl rule__Predicate__Group_4_1_1__1 ;
    public final void rule__Predicate__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3199:1: ( rule__Predicate__Group_4_1_1__0__Impl rule__Predicate__Group_4_1_1__1 )
            // InternalSolverLanguage.g:3200:2: rule__Predicate__Group_4_1_1__0__Impl rule__Predicate__Group_4_1_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Predicate__Group_4_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group_4_1_1__1();

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
    // $ANTLR end "rule__Predicate__Group_4_1_1__0"


    // $ANTLR start "rule__Predicate__Group_4_1_1__0__Impl"
    // InternalSolverLanguage.g:3207:1: rule__Predicate__Group_4_1_1__0__Impl : ( '|' ) ;
    public final void rule__Predicate__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3211:1: ( ( '|' ) )
            // InternalSolverLanguage.g:3212:1: ( '|' )
            {
            // InternalSolverLanguage.g:3212:1: ( '|' )
            // InternalSolverLanguage.g:3213:2: '|'
            {
             before(grammarAccess.getPredicateAccess().getVerticalLineKeyword_4_1_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getVerticalLineKeyword_4_1_1_0()); 

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
    // $ANTLR end "rule__Predicate__Group_4_1_1__0__Impl"


    // $ANTLR start "rule__Predicate__Group_4_1_1__1"
    // InternalSolverLanguage.g:3222:1: rule__Predicate__Group_4_1_1__1 : rule__Predicate__Group_4_1_1__1__Impl ;
    public final void rule__Predicate__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3226:1: ( rule__Predicate__Group_4_1_1__1__Impl )
            // InternalSolverLanguage.g:3227:2: rule__Predicate__Group_4_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group_4_1_1__1__Impl();

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
    // $ANTLR end "rule__Predicate__Group_4_1_1__1"


    // $ANTLR start "rule__Predicate__Group_4_1_1__1__Impl"
    // InternalSolverLanguage.g:3233:1: rule__Predicate__Group_4_1_1__1__Impl : ( ( rule__Predicate__BodiesAssignment_4_1_1_1 ) ) ;
    public final void rule__Predicate__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3237:1: ( ( ( rule__Predicate__BodiesAssignment_4_1_1_1 ) ) )
            // InternalSolverLanguage.g:3238:1: ( ( rule__Predicate__BodiesAssignment_4_1_1_1 ) )
            {
            // InternalSolverLanguage.g:3238:1: ( ( rule__Predicate__BodiesAssignment_4_1_1_1 ) )
            // InternalSolverLanguage.g:3239:2: ( rule__Predicate__BodiesAssignment_4_1_1_1 )
            {
             before(grammarAccess.getPredicateAccess().getBodiesAssignment_4_1_1_1()); 
            // InternalSolverLanguage.g:3240:2: ( rule__Predicate__BodiesAssignment_4_1_1_1 )
            // InternalSolverLanguage.g:3240:3: rule__Predicate__BodiesAssignment_4_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__BodiesAssignment_4_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getBodiesAssignment_4_1_1_1()); 

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
    // $ANTLR end "rule__Predicate__Group_4_1_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalSolverLanguage.g:3249:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3253:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalSolverLanguage.g:3254:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalSolverLanguage.g:3261:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__VariableAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3265:1: ( ( ( rule__Parameter__VariableAssignment_0 ) ) )
            // InternalSolverLanguage.g:3266:1: ( ( rule__Parameter__VariableAssignment_0 ) )
            {
            // InternalSolverLanguage.g:3266:1: ( ( rule__Parameter__VariableAssignment_0 ) )
            // InternalSolverLanguage.g:3267:2: ( rule__Parameter__VariableAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getVariableAssignment_0()); 
            // InternalSolverLanguage.g:3268:2: ( rule__Parameter__VariableAssignment_0 )
            // InternalSolverLanguage.g:3268:3: rule__Parameter__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getVariableAssignment_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalSolverLanguage.g:3276:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3280:1: ( rule__Parameter__Group__1__Impl )
            // InternalSolverLanguage.g:3281:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalSolverLanguage.g:3287:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__Group_1__0 )? ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3291:1: ( ( ( rule__Parameter__Group_1__0 )? ) )
            // InternalSolverLanguage.g:3292:1: ( ( rule__Parameter__Group_1__0 )? )
            {
            // InternalSolverLanguage.g:3292:1: ( ( rule__Parameter__Group_1__0 )? )
            // InternalSolverLanguage.g:3293:2: ( rule__Parameter__Group_1__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_1()); 
            // InternalSolverLanguage.g:3294:2: ( rule__Parameter__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSolverLanguage.g:3294:3: rule__Parameter__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group_1__0"
    // InternalSolverLanguage.g:3303:1: rule__Parameter__Group_1__0 : rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 ;
    public final void rule__Parameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3307:1: ( rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 )
            // InternalSolverLanguage.g:3308:2: rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__Parameter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1__1();

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
    // $ANTLR end "rule__Parameter__Group_1__0"


    // $ANTLR start "rule__Parameter__Group_1__0__Impl"
    // InternalSolverLanguage.g:3315:1: rule__Parameter__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Parameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3319:1: ( ( ':' ) )
            // InternalSolverLanguage.g:3320:1: ( ':' )
            {
            // InternalSolverLanguage.g:3320:1: ( ':' )
            // InternalSolverLanguage.g:3321:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1_0()); 

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
    // $ANTLR end "rule__Parameter__Group_1__0__Impl"


    // $ANTLR start "rule__Parameter__Group_1__1"
    // InternalSolverLanguage.g:3330:1: rule__Parameter__Group_1__1 : rule__Parameter__Group_1__1__Impl ;
    public final void rule__Parameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3334:1: ( rule__Parameter__Group_1__1__Impl )
            // InternalSolverLanguage.g:3335:2: rule__Parameter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group_1__1"


    // $ANTLR start "rule__Parameter__Group_1__1__Impl"
    // InternalSolverLanguage.g:3341:1: rule__Parameter__Group_1__1__Impl : ( ( rule__Parameter__TypeAssignment_1_1 ) ) ;
    public final void rule__Parameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3345:1: ( ( ( rule__Parameter__TypeAssignment_1_1 ) ) )
            // InternalSolverLanguage.g:3346:1: ( ( rule__Parameter__TypeAssignment_1_1 ) )
            {
            // InternalSolverLanguage.g:3346:1: ( ( rule__Parameter__TypeAssignment_1_1 ) )
            // InternalSolverLanguage.g:3347:2: ( rule__Parameter__TypeAssignment_1_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1_1()); 
            // InternalSolverLanguage.g:3348:2: ( rule__Parameter__TypeAssignment_1_1 )
            // InternalSolverLanguage.g:3348:3: rule__Parameter__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_1_1()); 

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
    // $ANTLR end "rule__Parameter__Group_1__1__Impl"


    // $ANTLR start "rule__PatternBody__Group__0"
    // InternalSolverLanguage.g:3357:1: rule__PatternBody__Group__0 : rule__PatternBody__Group__0__Impl rule__PatternBody__Group__1 ;
    public final void rule__PatternBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3361:1: ( rule__PatternBody__Group__0__Impl rule__PatternBody__Group__1 )
            // InternalSolverLanguage.g:3362:2: rule__PatternBody__Group__0__Impl rule__PatternBody__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__PatternBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternBody__Group__1();

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
    // $ANTLR end "rule__PatternBody__Group__0"


    // $ANTLR start "rule__PatternBody__Group__0__Impl"
    // InternalSolverLanguage.g:3369:1: rule__PatternBody__Group__0__Impl : ( () ) ;
    public final void rule__PatternBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3373:1: ( ( () ) )
            // InternalSolverLanguage.g:3374:1: ( () )
            {
            // InternalSolverLanguage.g:3374:1: ( () )
            // InternalSolverLanguage.g:3375:2: ()
            {
             before(grammarAccess.getPatternBodyAccess().getPatternBodyAction_0()); 
            // InternalSolverLanguage.g:3376:2: ()
            // InternalSolverLanguage.g:3376:3: 
            {
            }

             after(grammarAccess.getPatternBodyAccess().getPatternBodyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternBody__Group__0__Impl"


    // $ANTLR start "rule__PatternBody__Group__1"
    // InternalSolverLanguage.g:3384:1: rule__PatternBody__Group__1 : rule__PatternBody__Group__1__Impl ;
    public final void rule__PatternBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3388:1: ( rule__PatternBody__Group__1__Impl )
            // InternalSolverLanguage.g:3389:2: rule__PatternBody__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternBody__Group__1__Impl();

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
    // $ANTLR end "rule__PatternBody__Group__1"


    // $ANTLR start "rule__PatternBody__Group__1__Impl"
    // InternalSolverLanguage.g:3395:1: rule__PatternBody__Group__1__Impl : ( ( rule__PatternBody__Alternatives_1 ) ) ;
    public final void rule__PatternBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3399:1: ( ( ( rule__PatternBody__Alternatives_1 ) ) )
            // InternalSolverLanguage.g:3400:1: ( ( rule__PatternBody__Alternatives_1 ) )
            {
            // InternalSolverLanguage.g:3400:1: ( ( rule__PatternBody__Alternatives_1 ) )
            // InternalSolverLanguage.g:3401:2: ( rule__PatternBody__Alternatives_1 )
            {
             before(grammarAccess.getPatternBodyAccess().getAlternatives_1()); 
            // InternalSolverLanguage.g:3402:2: ( rule__PatternBody__Alternatives_1 )
            // InternalSolverLanguage.g:3402:3: rule__PatternBody__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternBody__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternBodyAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__PatternBody__Group__1__Impl"


    // $ANTLR start "rule__Polarity__Group_0__0"
    // InternalSolverLanguage.g:3411:1: rule__Polarity__Group_0__0 : rule__Polarity__Group_0__0__Impl rule__Polarity__Group_0__1 ;
    public final void rule__Polarity__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3415:1: ( rule__Polarity__Group_0__0__Impl rule__Polarity__Group_0__1 )
            // InternalSolverLanguage.g:3416:2: rule__Polarity__Group_0__0__Impl rule__Polarity__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__Polarity__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polarity__Group_0__1();

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
    // $ANTLR end "rule__Polarity__Group_0__0"


    // $ANTLR start "rule__Polarity__Group_0__0__Impl"
    // InternalSolverLanguage.g:3423:1: rule__Polarity__Group_0__0__Impl : ( () ) ;
    public final void rule__Polarity__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3427:1: ( ( () ) )
            // InternalSolverLanguage.g:3428:1: ( () )
            {
            // InternalSolverLanguage.g:3428:1: ( () )
            // InternalSolverLanguage.g:3429:2: ()
            {
             before(grammarAccess.getPolarityAccess().getPositiveAction_0_0()); 
            // InternalSolverLanguage.g:3430:2: ()
            // InternalSolverLanguage.g:3430:3: 
            {
            }

             after(grammarAccess.getPolarityAccess().getPositiveAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polarity__Group_0__0__Impl"


    // $ANTLR start "rule__Polarity__Group_0__1"
    // InternalSolverLanguage.g:3438:1: rule__Polarity__Group_0__1 : rule__Polarity__Group_0__1__Impl ;
    public final void rule__Polarity__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3442:1: ( rule__Polarity__Group_0__1__Impl )
            // InternalSolverLanguage.g:3443:2: rule__Polarity__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Polarity__Group_0__1__Impl();

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
    // $ANTLR end "rule__Polarity__Group_0__1"


    // $ANTLR start "rule__Polarity__Group_0__1__Impl"
    // InternalSolverLanguage.g:3449:1: rule__Polarity__Group_0__1__Impl : ( '+' ) ;
    public final void rule__Polarity__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3453:1: ( ( '+' ) )
            // InternalSolverLanguage.g:3454:1: ( '+' )
            {
            // InternalSolverLanguage.g:3454:1: ( '+' )
            // InternalSolverLanguage.g:3455:2: '+'
            {
             before(grammarAccess.getPolarityAccess().getPlusSignKeyword_0_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPolarityAccess().getPlusSignKeyword_0_1()); 

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
    // $ANTLR end "rule__Polarity__Group_0__1__Impl"


    // $ANTLR start "rule__Polarity__Group_1__0"
    // InternalSolverLanguage.g:3465:1: rule__Polarity__Group_1__0 : rule__Polarity__Group_1__0__Impl rule__Polarity__Group_1__1 ;
    public final void rule__Polarity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3469:1: ( rule__Polarity__Group_1__0__Impl rule__Polarity__Group_1__1 )
            // InternalSolverLanguage.g:3470:2: rule__Polarity__Group_1__0__Impl rule__Polarity__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Polarity__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polarity__Group_1__1();

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
    // $ANTLR end "rule__Polarity__Group_1__0"


    // $ANTLR start "rule__Polarity__Group_1__0__Impl"
    // InternalSolverLanguage.g:3477:1: rule__Polarity__Group_1__0__Impl : ( () ) ;
    public final void rule__Polarity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3481:1: ( ( () ) )
            // InternalSolverLanguage.g:3482:1: ( () )
            {
            // InternalSolverLanguage.g:3482:1: ( () )
            // InternalSolverLanguage.g:3483:2: ()
            {
             before(grammarAccess.getPolarityAccess().getNegativeAction_1_0()); 
            // InternalSolverLanguage.g:3484:2: ()
            // InternalSolverLanguage.g:3484:3: 
            {
            }

             after(grammarAccess.getPolarityAccess().getNegativeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polarity__Group_1__0__Impl"


    // $ANTLR start "rule__Polarity__Group_1__1"
    // InternalSolverLanguage.g:3492:1: rule__Polarity__Group_1__1 : rule__Polarity__Group_1__1__Impl ;
    public final void rule__Polarity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3496:1: ( rule__Polarity__Group_1__1__Impl )
            // InternalSolverLanguage.g:3497:2: rule__Polarity__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Polarity__Group_1__1__Impl();

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
    // $ANTLR end "rule__Polarity__Group_1__1"


    // $ANTLR start "rule__Polarity__Group_1__1__Impl"
    // InternalSolverLanguage.g:3503:1: rule__Polarity__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Polarity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3507:1: ( ( '-' ) )
            // InternalSolverLanguage.g:3508:1: ( '-' )
            {
            // InternalSolverLanguage.g:3508:1: ( '-' )
            // InternalSolverLanguage.g:3509:2: '-'
            {
             before(grammarAccess.getPolarityAccess().getHyphenMinusKeyword_1_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPolarityAccess().getHyphenMinusKeyword_1_1()); 

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
    // $ANTLR end "rule__Polarity__Group_1__1__Impl"


    // $ANTLR start "rule__Constraint__Group_0__0"
    // InternalSolverLanguage.g:3519:1: rule__Constraint__Group_0__0 : rule__Constraint__Group_0__0__Impl rule__Constraint__Group_0__1 ;
    public final void rule__Constraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3523:1: ( rule__Constraint__Group_0__0__Impl rule__Constraint__Group_0__1 )
            // InternalSolverLanguage.g:3524:2: rule__Constraint__Group_0__0__Impl rule__Constraint__Group_0__1
            {
            pushFollow(FOLLOW_29);
            rule__Constraint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0__1();

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
    // $ANTLR end "rule__Constraint__Group_0__0"


    // $ANTLR start "rule__Constraint__Group_0__0__Impl"
    // InternalSolverLanguage.g:3531:1: rule__Constraint__Group_0__0__Impl : ( ( rule__Constraint__PolarityAssignment_0_0 )? ) ;
    public final void rule__Constraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3535:1: ( ( ( rule__Constraint__PolarityAssignment_0_0 )? ) )
            // InternalSolverLanguage.g:3536:1: ( ( rule__Constraint__PolarityAssignment_0_0 )? )
            {
            // InternalSolverLanguage.g:3536:1: ( ( rule__Constraint__PolarityAssignment_0_0 )? )
            // InternalSolverLanguage.g:3537:2: ( rule__Constraint__PolarityAssignment_0_0 )?
            {
             before(grammarAccess.getConstraintAccess().getPolarityAssignment_0_0()); 
            // InternalSolverLanguage.g:3538:2: ( rule__Constraint__PolarityAssignment_0_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==13||LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSolverLanguage.g:3538:3: rule__Constraint__PolarityAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__PolarityAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getPolarityAssignment_0_0()); 

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
    // $ANTLR end "rule__Constraint__Group_0__0__Impl"


    // $ANTLR start "rule__Constraint__Group_0__1"
    // InternalSolverLanguage.g:3546:1: rule__Constraint__Group_0__1 : rule__Constraint__Group_0__1__Impl rule__Constraint__Group_0__2 ;
    public final void rule__Constraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3550:1: ( rule__Constraint__Group_0__1__Impl rule__Constraint__Group_0__2 )
            // InternalSolverLanguage.g:3551:2: rule__Constraint__Group_0__1__Impl rule__Constraint__Group_0__2
            {
            pushFollow(FOLLOW_30);
            rule__Constraint__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0__2();

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
    // $ANTLR end "rule__Constraint__Group_0__1"


    // $ANTLR start "rule__Constraint__Group_0__1__Impl"
    // InternalSolverLanguage.g:3558:1: rule__Constraint__Group_0__1__Impl : ( ( rule__Constraint__SymbolAssignment_0_1 ) ) ;
    public final void rule__Constraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3562:1: ( ( ( rule__Constraint__SymbolAssignment_0_1 ) ) )
            // InternalSolverLanguage.g:3563:1: ( ( rule__Constraint__SymbolAssignment_0_1 ) )
            {
            // InternalSolverLanguage.g:3563:1: ( ( rule__Constraint__SymbolAssignment_0_1 ) )
            // InternalSolverLanguage.g:3564:2: ( rule__Constraint__SymbolAssignment_0_1 )
            {
             before(grammarAccess.getConstraintAccess().getSymbolAssignment_0_1()); 
            // InternalSolverLanguage.g:3565:2: ( rule__Constraint__SymbolAssignment_0_1 )
            // InternalSolverLanguage.g:3565:3: rule__Constraint__SymbolAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__SymbolAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getSymbolAssignment_0_1()); 

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
    // $ANTLR end "rule__Constraint__Group_0__1__Impl"


    // $ANTLR start "rule__Constraint__Group_0__2"
    // InternalSolverLanguage.g:3573:1: rule__Constraint__Group_0__2 : rule__Constraint__Group_0__2__Impl ;
    public final void rule__Constraint__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3577:1: ( rule__Constraint__Group_0__2__Impl )
            // InternalSolverLanguage.g:3578:2: rule__Constraint__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0__2__Impl();

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
    // $ANTLR end "rule__Constraint__Group_0__2"


    // $ANTLR start "rule__Constraint__Group_0__2__Impl"
    // InternalSolverLanguage.g:3584:1: rule__Constraint__Group_0__2__Impl : ( ( rule__Constraint__Group_0_2__0 )? ) ;
    public final void rule__Constraint__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3588:1: ( ( ( rule__Constraint__Group_0_2__0 )? ) )
            // InternalSolverLanguage.g:3589:1: ( ( rule__Constraint__Group_0_2__0 )? )
            {
            // InternalSolverLanguage.g:3589:1: ( ( rule__Constraint__Group_0_2__0 )? )
            // InternalSolverLanguage.g:3590:2: ( rule__Constraint__Group_0_2__0 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_0_2()); 
            // InternalSolverLanguage.g:3591:2: ( rule__Constraint__Group_0_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==18) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSolverLanguage.g:3591:3: rule__Constraint__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__Group_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getGroup_0_2()); 

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
    // $ANTLR end "rule__Constraint__Group_0__2__Impl"


    // $ANTLR start "rule__Constraint__Group_0_2__0"
    // InternalSolverLanguage.g:3600:1: rule__Constraint__Group_0_2__0 : rule__Constraint__Group_0_2__0__Impl rule__Constraint__Group_0_2__1 ;
    public final void rule__Constraint__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3604:1: ( rule__Constraint__Group_0_2__0__Impl rule__Constraint__Group_0_2__1 )
            // InternalSolverLanguage.g:3605:2: rule__Constraint__Group_0_2__0__Impl rule__Constraint__Group_0_2__1
            {
            pushFollow(FOLLOW_31);
            rule__Constraint__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0_2__1();

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
    // $ANTLR end "rule__Constraint__Group_0_2__0"


    // $ANTLR start "rule__Constraint__Group_0_2__0__Impl"
    // InternalSolverLanguage.g:3612:1: rule__Constraint__Group_0_2__0__Impl : ( '(' ) ;
    public final void rule__Constraint__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3616:1: ( ( '(' ) )
            // InternalSolverLanguage.g:3617:1: ( '(' )
            {
            // InternalSolverLanguage.g:3617:1: ( '(' )
            // InternalSolverLanguage.g:3618:2: '('
            {
             before(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_0_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_0_2_0()); 

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
    // $ANTLR end "rule__Constraint__Group_0_2__0__Impl"


    // $ANTLR start "rule__Constraint__Group_0_2__1"
    // InternalSolverLanguage.g:3627:1: rule__Constraint__Group_0_2__1 : rule__Constraint__Group_0_2__1__Impl rule__Constraint__Group_0_2__2 ;
    public final void rule__Constraint__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3631:1: ( rule__Constraint__Group_0_2__1__Impl rule__Constraint__Group_0_2__2 )
            // InternalSolverLanguage.g:3632:2: rule__Constraint__Group_0_2__1__Impl rule__Constraint__Group_0_2__2
            {
            pushFollow(FOLLOW_31);
            rule__Constraint__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0_2__2();

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
    // $ANTLR end "rule__Constraint__Group_0_2__1"


    // $ANTLR start "rule__Constraint__Group_0_2__1__Impl"
    // InternalSolverLanguage.g:3639:1: rule__Constraint__Group_0_2__1__Impl : ( ( rule__Constraint__ParamsAssignment_0_2_1 )? ) ;
    public final void rule__Constraint__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3643:1: ( ( ( rule__Constraint__ParamsAssignment_0_2_1 )? ) )
            // InternalSolverLanguage.g:3644:1: ( ( rule__Constraint__ParamsAssignment_0_2_1 )? )
            {
            // InternalSolverLanguage.g:3644:1: ( ( rule__Constraint__ParamsAssignment_0_2_1 )? )
            // InternalSolverLanguage.g:3645:2: ( rule__Constraint__ParamsAssignment_0_2_1 )?
            {
             before(grammarAccess.getConstraintAccess().getParamsAssignment_0_2_1()); 
            // InternalSolverLanguage.g:3646:2: ( rule__Constraint__ParamsAssignment_0_2_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_INT && LA34_0<=RULE_STRING)||(LA34_0>=11 && LA34_0<=13)||LA34_0==27) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSolverLanguage.g:3646:3: rule__Constraint__ParamsAssignment_0_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__ParamsAssignment_0_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getParamsAssignment_0_2_1()); 

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
    // $ANTLR end "rule__Constraint__Group_0_2__1__Impl"


    // $ANTLR start "rule__Constraint__Group_0_2__2"
    // InternalSolverLanguage.g:3654:1: rule__Constraint__Group_0_2__2 : rule__Constraint__Group_0_2__2__Impl rule__Constraint__Group_0_2__3 ;
    public final void rule__Constraint__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3658:1: ( rule__Constraint__Group_0_2__2__Impl rule__Constraint__Group_0_2__3 )
            // InternalSolverLanguage.g:3659:2: rule__Constraint__Group_0_2__2__Impl rule__Constraint__Group_0_2__3
            {
            pushFollow(FOLLOW_31);
            rule__Constraint__Group_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0_2__3();

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
    // $ANTLR end "rule__Constraint__Group_0_2__2"


    // $ANTLR start "rule__Constraint__Group_0_2__2__Impl"
    // InternalSolverLanguage.g:3666:1: rule__Constraint__Group_0_2__2__Impl : ( ( rule__Constraint__Group_0_2_2__0 )* ) ;
    public final void rule__Constraint__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3670:1: ( ( ( rule__Constraint__Group_0_2_2__0 )* ) )
            // InternalSolverLanguage.g:3671:1: ( ( rule__Constraint__Group_0_2_2__0 )* )
            {
            // InternalSolverLanguage.g:3671:1: ( ( rule__Constraint__Group_0_2_2__0 )* )
            // InternalSolverLanguage.g:3672:2: ( rule__Constraint__Group_0_2_2__0 )*
            {
             before(grammarAccess.getConstraintAccess().getGroup_0_2_2()); 
            // InternalSolverLanguage.g:3673:2: ( rule__Constraint__Group_0_2_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==20) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSolverLanguage.g:3673:3: rule__Constraint__Group_0_2_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Constraint__Group_0_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getConstraintAccess().getGroup_0_2_2()); 

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
    // $ANTLR end "rule__Constraint__Group_0_2__2__Impl"


    // $ANTLR start "rule__Constraint__Group_0_2__3"
    // InternalSolverLanguage.g:3681:1: rule__Constraint__Group_0_2__3 : rule__Constraint__Group_0_2__3__Impl ;
    public final void rule__Constraint__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3685:1: ( rule__Constraint__Group_0_2__3__Impl )
            // InternalSolverLanguage.g:3686:2: rule__Constraint__Group_0_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0_2__3__Impl();

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
    // $ANTLR end "rule__Constraint__Group_0_2__3"


    // $ANTLR start "rule__Constraint__Group_0_2__3__Impl"
    // InternalSolverLanguage.g:3692:1: rule__Constraint__Group_0_2__3__Impl : ( ')' ) ;
    public final void rule__Constraint__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3696:1: ( ( ')' ) )
            // InternalSolverLanguage.g:3697:1: ( ')' )
            {
            // InternalSolverLanguage.g:3697:1: ( ')' )
            // InternalSolverLanguage.g:3698:2: ')'
            {
             before(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_0_2_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_0_2_3()); 

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
    // $ANTLR end "rule__Constraint__Group_0_2__3__Impl"


    // $ANTLR start "rule__Constraint__Group_0_2_2__0"
    // InternalSolverLanguage.g:3708:1: rule__Constraint__Group_0_2_2__0 : rule__Constraint__Group_0_2_2__0__Impl rule__Constraint__Group_0_2_2__1 ;
    public final void rule__Constraint__Group_0_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3712:1: ( rule__Constraint__Group_0_2_2__0__Impl rule__Constraint__Group_0_2_2__1 )
            // InternalSolverLanguage.g:3713:2: rule__Constraint__Group_0_2_2__0__Impl rule__Constraint__Group_0_2_2__1
            {
            pushFollow(FOLLOW_32);
            rule__Constraint__Group_0_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0_2_2__1();

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
    // $ANTLR end "rule__Constraint__Group_0_2_2__0"


    // $ANTLR start "rule__Constraint__Group_0_2_2__0__Impl"
    // InternalSolverLanguage.g:3720:1: rule__Constraint__Group_0_2_2__0__Impl : ( ',' ) ;
    public final void rule__Constraint__Group_0_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3724:1: ( ( ',' ) )
            // InternalSolverLanguage.g:3725:1: ( ',' )
            {
            // InternalSolverLanguage.g:3725:1: ( ',' )
            // InternalSolverLanguage.g:3726:2: ','
            {
             before(grammarAccess.getConstraintAccess().getCommaKeyword_0_2_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getCommaKeyword_0_2_2_0()); 

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
    // $ANTLR end "rule__Constraint__Group_0_2_2__0__Impl"


    // $ANTLR start "rule__Constraint__Group_0_2_2__1"
    // InternalSolverLanguage.g:3735:1: rule__Constraint__Group_0_2_2__1 : rule__Constraint__Group_0_2_2__1__Impl ;
    public final void rule__Constraint__Group_0_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3739:1: ( rule__Constraint__Group_0_2_2__1__Impl )
            // InternalSolverLanguage.g:3740:2: rule__Constraint__Group_0_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_0_2_2__1__Impl();

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
    // $ANTLR end "rule__Constraint__Group_0_2_2__1"


    // $ANTLR start "rule__Constraint__Group_0_2_2__1__Impl"
    // InternalSolverLanguage.g:3746:1: rule__Constraint__Group_0_2_2__1__Impl : ( ( rule__Constraint__ParamsAssignment_0_2_2_1 ) ) ;
    public final void rule__Constraint__Group_0_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3750:1: ( ( ( rule__Constraint__ParamsAssignment_0_2_2_1 ) ) )
            // InternalSolverLanguage.g:3751:1: ( ( rule__Constraint__ParamsAssignment_0_2_2_1 ) )
            {
            // InternalSolverLanguage.g:3751:1: ( ( rule__Constraint__ParamsAssignment_0_2_2_1 ) )
            // InternalSolverLanguage.g:3752:2: ( rule__Constraint__ParamsAssignment_0_2_2_1 )
            {
             before(grammarAccess.getConstraintAccess().getParamsAssignment_0_2_2_1()); 
            // InternalSolverLanguage.g:3753:2: ( rule__Constraint__ParamsAssignment_0_2_2_1 )
            // InternalSolverLanguage.g:3753:3: rule__Constraint__ParamsAssignment_0_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ParamsAssignment_0_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getParamsAssignment_0_2_2_1()); 

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
    // $ANTLR end "rule__Constraint__Group_0_2_2__1__Impl"


    // $ANTLR start "rule__Constraint__Group_1__0"
    // InternalSolverLanguage.g:3762:1: rule__Constraint__Group_1__0 : rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 ;
    public final void rule__Constraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3766:1: ( rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 )
            // InternalSolverLanguage.g:3767:2: rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Constraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_1__1();

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
    // $ANTLR end "rule__Constraint__Group_1__0"


    // $ANTLR start "rule__Constraint__Group_1__0__Impl"
    // InternalSolverLanguage.g:3774:1: rule__Constraint__Group_1__0__Impl : ( ( rule__Constraint__ClosureTypeAssignment_1_0 ) ) ;
    public final void rule__Constraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3778:1: ( ( ( rule__Constraint__ClosureTypeAssignment_1_0 ) ) )
            // InternalSolverLanguage.g:3779:1: ( ( rule__Constraint__ClosureTypeAssignment_1_0 ) )
            {
            // InternalSolverLanguage.g:3779:1: ( ( rule__Constraint__ClosureTypeAssignment_1_0 ) )
            // InternalSolverLanguage.g:3780:2: ( rule__Constraint__ClosureTypeAssignment_1_0 )
            {
             before(grammarAccess.getConstraintAccess().getClosureTypeAssignment_1_0()); 
            // InternalSolverLanguage.g:3781:2: ( rule__Constraint__ClosureTypeAssignment_1_0 )
            // InternalSolverLanguage.g:3781:3: rule__Constraint__ClosureTypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ClosureTypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getClosureTypeAssignment_1_0()); 

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
    // $ANTLR end "rule__Constraint__Group_1__0__Impl"


    // $ANTLR start "rule__Constraint__Group_1__1"
    // InternalSolverLanguage.g:3789:1: rule__Constraint__Group_1__1 : rule__Constraint__Group_1__1__Impl rule__Constraint__Group_1__2 ;
    public final void rule__Constraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3793:1: ( rule__Constraint__Group_1__1__Impl rule__Constraint__Group_1__2 )
            // InternalSolverLanguage.g:3794:2: rule__Constraint__Group_1__1__Impl rule__Constraint__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__Constraint__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_1__2();

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
    // $ANTLR end "rule__Constraint__Group_1__1"


    // $ANTLR start "rule__Constraint__Group_1__1__Impl"
    // InternalSolverLanguage.g:3801:1: rule__Constraint__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Constraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3805:1: ( ( '(' ) )
            // InternalSolverLanguage.g:3806:1: ( '(' )
            {
            // InternalSolverLanguage.g:3806:1: ( '(' )
            // InternalSolverLanguage.g:3807:2: '('
            {
             before(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__Constraint__Group_1__1__Impl"


    // $ANTLR start "rule__Constraint__Group_1__2"
    // InternalSolverLanguage.g:3816:1: rule__Constraint__Group_1__2 : rule__Constraint__Group_1__2__Impl rule__Constraint__Group_1__3 ;
    public final void rule__Constraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3820:1: ( rule__Constraint__Group_1__2__Impl rule__Constraint__Group_1__3 )
            // InternalSolverLanguage.g:3821:2: rule__Constraint__Group_1__2__Impl rule__Constraint__Group_1__3
            {
            pushFollow(FOLLOW_31);
            rule__Constraint__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_1__3();

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
    // $ANTLR end "rule__Constraint__Group_1__2"


    // $ANTLR start "rule__Constraint__Group_1__2__Impl"
    // InternalSolverLanguage.g:3828:1: rule__Constraint__Group_1__2__Impl : ( ( rule__Constraint__ParamsAssignment_1_2 )? ) ;
    public final void rule__Constraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3832:1: ( ( ( rule__Constraint__ParamsAssignment_1_2 )? ) )
            // InternalSolverLanguage.g:3833:1: ( ( rule__Constraint__ParamsAssignment_1_2 )? )
            {
            // InternalSolverLanguage.g:3833:1: ( ( rule__Constraint__ParamsAssignment_1_2 )? )
            // InternalSolverLanguage.g:3834:2: ( rule__Constraint__ParamsAssignment_1_2 )?
            {
             before(grammarAccess.getConstraintAccess().getParamsAssignment_1_2()); 
            // InternalSolverLanguage.g:3835:2: ( rule__Constraint__ParamsAssignment_1_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_INT && LA36_0<=RULE_STRING)||(LA36_0>=11 && LA36_0<=13)||LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSolverLanguage.g:3835:3: rule__Constraint__ParamsAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__ParamsAssignment_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getParamsAssignment_1_2()); 

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
    // $ANTLR end "rule__Constraint__Group_1__2__Impl"


    // $ANTLR start "rule__Constraint__Group_1__3"
    // InternalSolverLanguage.g:3843:1: rule__Constraint__Group_1__3 : rule__Constraint__Group_1__3__Impl rule__Constraint__Group_1__4 ;
    public final void rule__Constraint__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3847:1: ( rule__Constraint__Group_1__3__Impl rule__Constraint__Group_1__4 )
            // InternalSolverLanguage.g:3848:2: rule__Constraint__Group_1__3__Impl rule__Constraint__Group_1__4
            {
            pushFollow(FOLLOW_31);
            rule__Constraint__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_1__4();

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
    // $ANTLR end "rule__Constraint__Group_1__3"


    // $ANTLR start "rule__Constraint__Group_1__3__Impl"
    // InternalSolverLanguage.g:3855:1: rule__Constraint__Group_1__3__Impl : ( ( rule__Constraint__Group_1_3__0 )* ) ;
    public final void rule__Constraint__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3859:1: ( ( ( rule__Constraint__Group_1_3__0 )* ) )
            // InternalSolverLanguage.g:3860:1: ( ( rule__Constraint__Group_1_3__0 )* )
            {
            // InternalSolverLanguage.g:3860:1: ( ( rule__Constraint__Group_1_3__0 )* )
            // InternalSolverLanguage.g:3861:2: ( rule__Constraint__Group_1_3__0 )*
            {
             before(grammarAccess.getConstraintAccess().getGroup_1_3()); 
            // InternalSolverLanguage.g:3862:2: ( rule__Constraint__Group_1_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==20) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSolverLanguage.g:3862:3: rule__Constraint__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Constraint__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getConstraintAccess().getGroup_1_3()); 

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
    // $ANTLR end "rule__Constraint__Group_1__3__Impl"


    // $ANTLR start "rule__Constraint__Group_1__4"
    // InternalSolverLanguage.g:3870:1: rule__Constraint__Group_1__4 : rule__Constraint__Group_1__4__Impl ;
    public final void rule__Constraint__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3874:1: ( rule__Constraint__Group_1__4__Impl )
            // InternalSolverLanguage.g:3875:2: rule__Constraint__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_1__4__Impl();

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
    // $ANTLR end "rule__Constraint__Group_1__4"


    // $ANTLR start "rule__Constraint__Group_1__4__Impl"
    // InternalSolverLanguage.g:3881:1: rule__Constraint__Group_1__4__Impl : ( ')' ) ;
    public final void rule__Constraint__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3885:1: ( ( ')' ) )
            // InternalSolverLanguage.g:3886:1: ( ')' )
            {
            // InternalSolverLanguage.g:3886:1: ( ')' )
            // InternalSolverLanguage.g:3887:2: ')'
            {
             before(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_1_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_1_4()); 

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
    // $ANTLR end "rule__Constraint__Group_1__4__Impl"


    // $ANTLR start "rule__Constraint__Group_1_3__0"
    // InternalSolverLanguage.g:3897:1: rule__Constraint__Group_1_3__0 : rule__Constraint__Group_1_3__0__Impl rule__Constraint__Group_1_3__1 ;
    public final void rule__Constraint__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3901:1: ( rule__Constraint__Group_1_3__0__Impl rule__Constraint__Group_1_3__1 )
            // InternalSolverLanguage.g:3902:2: rule__Constraint__Group_1_3__0__Impl rule__Constraint__Group_1_3__1
            {
            pushFollow(FOLLOW_32);
            rule__Constraint__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_1_3__1();

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
    // $ANTLR end "rule__Constraint__Group_1_3__0"


    // $ANTLR start "rule__Constraint__Group_1_3__0__Impl"
    // InternalSolverLanguage.g:3909:1: rule__Constraint__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__Constraint__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3913:1: ( ( ',' ) )
            // InternalSolverLanguage.g:3914:1: ( ',' )
            {
            // InternalSolverLanguage.g:3914:1: ( ',' )
            // InternalSolverLanguage.g:3915:2: ','
            {
             before(grammarAccess.getConstraintAccess().getCommaKeyword_1_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getCommaKeyword_1_3_0()); 

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
    // $ANTLR end "rule__Constraint__Group_1_3__0__Impl"


    // $ANTLR start "rule__Constraint__Group_1_3__1"
    // InternalSolverLanguage.g:3924:1: rule__Constraint__Group_1_3__1 : rule__Constraint__Group_1_3__1__Impl ;
    public final void rule__Constraint__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3928:1: ( rule__Constraint__Group_1_3__1__Impl )
            // InternalSolverLanguage.g:3929:2: rule__Constraint__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_1_3__1__Impl();

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
    // $ANTLR end "rule__Constraint__Group_1_3__1"


    // $ANTLR start "rule__Constraint__Group_1_3__1__Impl"
    // InternalSolverLanguage.g:3935:1: rule__Constraint__Group_1_3__1__Impl : ( ( rule__Constraint__ParamsAssignment_1_3_1 ) ) ;
    public final void rule__Constraint__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3939:1: ( ( ( rule__Constraint__ParamsAssignment_1_3_1 ) ) )
            // InternalSolverLanguage.g:3940:1: ( ( rule__Constraint__ParamsAssignment_1_3_1 ) )
            {
            // InternalSolverLanguage.g:3940:1: ( ( rule__Constraint__ParamsAssignment_1_3_1 ) )
            // InternalSolverLanguage.g:3941:2: ( rule__Constraint__ParamsAssignment_1_3_1 )
            {
             before(grammarAccess.getConstraintAccess().getParamsAssignment_1_3_1()); 
            // InternalSolverLanguage.g:3942:2: ( rule__Constraint__ParamsAssignment_1_3_1 )
            // InternalSolverLanguage.g:3942:3: rule__Constraint__ParamsAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ParamsAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getParamsAssignment_1_3_1()); 

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
    // $ANTLR end "rule__Constraint__Group_1_3__1__Impl"


    // $ANTLR start "rule__ClosureType__Group_0__0"
    // InternalSolverLanguage.g:3951:1: rule__ClosureType__Group_0__0 : rule__ClosureType__Group_0__0__Impl rule__ClosureType__Group_0__1 ;
    public final void rule__ClosureType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3955:1: ( rule__ClosureType__Group_0__0__Impl rule__ClosureType__Group_0__1 )
            // InternalSolverLanguage.g:3956:2: rule__ClosureType__Group_0__0__Impl rule__ClosureType__Group_0__1
            {
            pushFollow(FOLLOW_33);
            rule__ClosureType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClosureType__Group_0__1();

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
    // $ANTLR end "rule__ClosureType__Group_0__0"


    // $ANTLR start "rule__ClosureType__Group_0__0__Impl"
    // InternalSolverLanguage.g:3963:1: rule__ClosureType__Group_0__0__Impl : ( () ) ;
    public final void rule__ClosureType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3967:1: ( ( () ) )
            // InternalSolverLanguage.g:3968:1: ( () )
            {
            // InternalSolverLanguage.g:3968:1: ( () )
            // InternalSolverLanguage.g:3969:2: ()
            {
             before(grammarAccess.getClosureTypeAccess().getReflexiveClosureAction_0_0()); 
            // InternalSolverLanguage.g:3970:2: ()
            // InternalSolverLanguage.g:3970:3: 
            {
            }

             after(grammarAccess.getClosureTypeAccess().getReflexiveClosureAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosureType__Group_0__0__Impl"


    // $ANTLR start "rule__ClosureType__Group_0__1"
    // InternalSolverLanguage.g:3978:1: rule__ClosureType__Group_0__1 : rule__ClosureType__Group_0__1__Impl ;
    public final void rule__ClosureType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3982:1: ( rule__ClosureType__Group_0__1__Impl )
            // InternalSolverLanguage.g:3983:2: rule__ClosureType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClosureType__Group_0__1__Impl();

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
    // $ANTLR end "rule__ClosureType__Group_0__1"


    // $ANTLR start "rule__ClosureType__Group_0__1__Impl"
    // InternalSolverLanguage.g:3989:1: rule__ClosureType__Group_0__1__Impl : ( '*' ) ;
    public final void rule__ClosureType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3993:1: ( ( '*' ) )
            // InternalSolverLanguage.g:3994:1: ( '*' )
            {
            // InternalSolverLanguage.g:3994:1: ( '*' )
            // InternalSolverLanguage.g:3995:2: '*'
            {
             before(grammarAccess.getClosureTypeAccess().getAsteriskKeyword_0_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getClosureTypeAccess().getAsteriskKeyword_0_1()); 

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
    // $ANTLR end "rule__ClosureType__Group_0__1__Impl"


    // $ANTLR start "rule__ClosureType__Group_1__0"
    // InternalSolverLanguage.g:4005:1: rule__ClosureType__Group_1__0 : rule__ClosureType__Group_1__0__Impl rule__ClosureType__Group_1__1 ;
    public final void rule__ClosureType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4009:1: ( rule__ClosureType__Group_1__0__Impl rule__ClosureType__Group_1__1 )
            // InternalSolverLanguage.g:4010:2: rule__ClosureType__Group_1__0__Impl rule__ClosureType__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__ClosureType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClosureType__Group_1__1();

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
    // $ANTLR end "rule__ClosureType__Group_1__0"


    // $ANTLR start "rule__ClosureType__Group_1__0__Impl"
    // InternalSolverLanguage.g:4017:1: rule__ClosureType__Group_1__0__Impl : ( () ) ;
    public final void rule__ClosureType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4021:1: ( ( () ) )
            // InternalSolverLanguage.g:4022:1: ( () )
            {
            // InternalSolverLanguage.g:4022:1: ( () )
            // InternalSolverLanguage.g:4023:2: ()
            {
             before(grammarAccess.getClosureTypeAccess().getIrreflexiveClosureAction_1_0()); 
            // InternalSolverLanguage.g:4024:2: ()
            // InternalSolverLanguage.g:4024:3: 
            {
            }

             after(grammarAccess.getClosureTypeAccess().getIrreflexiveClosureAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosureType__Group_1__0__Impl"


    // $ANTLR start "rule__ClosureType__Group_1__1"
    // InternalSolverLanguage.g:4032:1: rule__ClosureType__Group_1__1 : rule__ClosureType__Group_1__1__Impl ;
    public final void rule__ClosureType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4036:1: ( rule__ClosureType__Group_1__1__Impl )
            // InternalSolverLanguage.g:4037:2: rule__ClosureType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClosureType__Group_1__1__Impl();

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
    // $ANTLR end "rule__ClosureType__Group_1__1"


    // $ANTLR start "rule__ClosureType__Group_1__1__Impl"
    // InternalSolverLanguage.g:4043:1: rule__ClosureType__Group_1__1__Impl : ( '+' ) ;
    public final void rule__ClosureType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4047:1: ( ( '+' ) )
            // InternalSolverLanguage.g:4048:1: ( '+' )
            {
            // InternalSolverLanguage.g:4048:1: ( '+' )
            // InternalSolverLanguage.g:4049:2: '+'
            {
             before(grammarAccess.getClosureTypeAccess().getPlusSignKeyword_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getClosureTypeAccess().getPlusSignKeyword_1_1()); 

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
    // $ANTLR end "rule__ClosureType__Group_1__1__Impl"


    // $ANTLR start "rule__AllInstances__Group__0"
    // InternalSolverLanguage.g:4059:1: rule__AllInstances__Group__0 : rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1 ;
    public final void rule__AllInstances__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4063:1: ( rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1 )
            // InternalSolverLanguage.g:4064:2: rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__AllInstances__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllInstances__Group__1();

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
    // $ANTLR end "rule__AllInstances__Group__0"


    // $ANTLR start "rule__AllInstances__Group__0__Impl"
    // InternalSolverLanguage.g:4071:1: rule__AllInstances__Group__0__Impl : ( ':' ) ;
    public final void rule__AllInstances__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4075:1: ( ( ':' ) )
            // InternalSolverLanguage.g:4076:1: ( ':' )
            {
            // InternalSolverLanguage.g:4076:1: ( ':' )
            // InternalSolverLanguage.g:4077:2: ':'
            {
             before(grammarAccess.getAllInstancesAccess().getColonKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAllInstancesAccess().getColonKeyword_0()); 

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
    // $ANTLR end "rule__AllInstances__Group__0__Impl"


    // $ANTLR start "rule__AllInstances__Group__1"
    // InternalSolverLanguage.g:4086:1: rule__AllInstances__Group__1 : rule__AllInstances__Group__1__Impl ;
    public final void rule__AllInstances__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4090:1: ( rule__AllInstances__Group__1__Impl )
            // InternalSolverLanguage.g:4091:2: rule__AllInstances__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__Group__1__Impl();

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
    // $ANTLR end "rule__AllInstances__Group__1"


    // $ANTLR start "rule__AllInstances__Group__1__Impl"
    // InternalSolverLanguage.g:4097:1: rule__AllInstances__Group__1__Impl : ( ( rule__AllInstances__SymbolAssignment_1 ) ) ;
    public final void rule__AllInstances__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4101:1: ( ( ( rule__AllInstances__SymbolAssignment_1 ) ) )
            // InternalSolverLanguage.g:4102:1: ( ( rule__AllInstances__SymbolAssignment_1 ) )
            {
            // InternalSolverLanguage.g:4102:1: ( ( rule__AllInstances__SymbolAssignment_1 ) )
            // InternalSolverLanguage.g:4103:2: ( rule__AllInstances__SymbolAssignment_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getSymbolAssignment_1()); 
            // InternalSolverLanguage.g:4104:2: ( rule__AllInstances__SymbolAssignment_1 )
            // InternalSolverLanguage.g:4104:3: rule__AllInstances__SymbolAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AllInstances__SymbolAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesAccess().getSymbolAssignment_1()); 

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
    // $ANTLR end "rule__AllInstances__Group__1__Impl"


    // $ANTLR start "rule__AllObjects__Group__0"
    // InternalSolverLanguage.g:4113:1: rule__AllObjects__Group__0 : rule__AllObjects__Group__0__Impl rule__AllObjects__Group__1 ;
    public final void rule__AllObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4117:1: ( rule__AllObjects__Group__0__Impl rule__AllObjects__Group__1 )
            // InternalSolverLanguage.g:4118:2: rule__AllObjects__Group__0__Impl rule__AllObjects__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__AllObjects__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllObjects__Group__1();

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
    // $ANTLR end "rule__AllObjects__Group__0"


    // $ANTLR start "rule__AllObjects__Group__0__Impl"
    // InternalSolverLanguage.g:4125:1: rule__AllObjects__Group__0__Impl : ( () ) ;
    public final void rule__AllObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4129:1: ( ( () ) )
            // InternalSolverLanguage.g:4130:1: ( () )
            {
            // InternalSolverLanguage.g:4130:1: ( () )
            // InternalSolverLanguage.g:4131:2: ()
            {
             before(grammarAccess.getAllObjectsAccess().getAllObjectsAction_0()); 
            // InternalSolverLanguage.g:4132:2: ()
            // InternalSolverLanguage.g:4132:3: 
            {
            }

             after(grammarAccess.getAllObjectsAccess().getAllObjectsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllObjects__Group__0__Impl"


    // $ANTLR start "rule__AllObjects__Group__1"
    // InternalSolverLanguage.g:4140:1: rule__AllObjects__Group__1 : rule__AllObjects__Group__1__Impl ;
    public final void rule__AllObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4144:1: ( rule__AllObjects__Group__1__Impl )
            // InternalSolverLanguage.g:4145:2: rule__AllObjects__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllObjects__Group__1__Impl();

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
    // $ANTLR end "rule__AllObjects__Group__1"


    // $ANTLR start "rule__AllObjects__Group__1__Impl"
    // InternalSolverLanguage.g:4151:1: rule__AllObjects__Group__1__Impl : ( '*' ) ;
    public final void rule__AllObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4155:1: ( ( '*' ) )
            // InternalSolverLanguage.g:4156:1: ( '*' )
            {
            // InternalSolverLanguage.g:4156:1: ( '*' )
            // InternalSolverLanguage.g:4157:2: '*'
            {
             before(grammarAccess.getAllObjectsAccess().getAsteriskKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAllObjectsAccess().getAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__AllObjects__Group__1__Impl"


    // $ANTLR start "rule__DefaultInterpretation__Group__0"
    // InternalSolverLanguage.g:4167:1: rule__DefaultInterpretation__Group__0 : rule__DefaultInterpretation__Group__0__Impl rule__DefaultInterpretation__Group__1 ;
    public final void rule__DefaultInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4171:1: ( rule__DefaultInterpretation__Group__0__Impl rule__DefaultInterpretation__Group__1 )
            // InternalSolverLanguage.g:4172:2: rule__DefaultInterpretation__Group__0__Impl rule__DefaultInterpretation__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__DefaultInterpretation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefaultInterpretation__Group__1();

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
    // $ANTLR end "rule__DefaultInterpretation__Group__0"


    // $ANTLR start "rule__DefaultInterpretation__Group__0__Impl"
    // InternalSolverLanguage.g:4179:1: rule__DefaultInterpretation__Group__0__Impl : ( 'default' ) ;
    public final void rule__DefaultInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4183:1: ( ( 'default' ) )
            // InternalSolverLanguage.g:4184:1: ( 'default' )
            {
            // InternalSolverLanguage.g:4184:1: ( 'default' )
            // InternalSolverLanguage.g:4185:2: 'default'
            {
             before(grammarAccess.getDefaultInterpretationAccess().getDefaultKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDefaultInterpretationAccess().getDefaultKeyword_0()); 

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
    // $ANTLR end "rule__DefaultInterpretation__Group__0__Impl"


    // $ANTLR start "rule__DefaultInterpretation__Group__1"
    // InternalSolverLanguage.g:4194:1: rule__DefaultInterpretation__Group__1 : rule__DefaultInterpretation__Group__1__Impl ;
    public final void rule__DefaultInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4198:1: ( rule__DefaultInterpretation__Group__1__Impl )
            // InternalSolverLanguage.g:4199:2: rule__DefaultInterpretation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefaultInterpretation__Group__1__Impl();

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
    // $ANTLR end "rule__DefaultInterpretation__Group__1"


    // $ANTLR start "rule__DefaultInterpretation__Group__1__Impl"
    // InternalSolverLanguage.g:4205:1: rule__DefaultInterpretation__Group__1__Impl : ( ( rule__DefaultInterpretation__InterpretationAssignment_1 ) ) ;
    public final void rule__DefaultInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4209:1: ( ( ( rule__DefaultInterpretation__InterpretationAssignment_1 ) ) )
            // InternalSolverLanguage.g:4210:1: ( ( rule__DefaultInterpretation__InterpretationAssignment_1 ) )
            {
            // InternalSolverLanguage.g:4210:1: ( ( rule__DefaultInterpretation__InterpretationAssignment_1 ) )
            // InternalSolverLanguage.g:4211:2: ( rule__DefaultInterpretation__InterpretationAssignment_1 )
            {
             before(grammarAccess.getDefaultInterpretationAccess().getInterpretationAssignment_1()); 
            // InternalSolverLanguage.g:4212:2: ( rule__DefaultInterpretation__InterpretationAssignment_1 )
            // InternalSolverLanguage.g:4212:3: rule__DefaultInterpretation__InterpretationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefaultInterpretation__InterpretationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefaultInterpretationAccess().getInterpretationAssignment_1()); 

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
    // $ANTLR end "rule__DefaultInterpretation__Group__1__Impl"


    // $ANTLR start "rule__ClassInterpretation__Group__0"
    // InternalSolverLanguage.g:4221:1: rule__ClassInterpretation__Group__0 : rule__ClassInterpretation__Group__0__Impl rule__ClassInterpretation__Group__1 ;
    public final void rule__ClassInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4225:1: ( rule__ClassInterpretation__Group__0__Impl rule__ClassInterpretation__Group__1 )
            // InternalSolverLanguage.g:4226:2: rule__ClassInterpretation__Group__0__Impl rule__ClassInterpretation__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__ClassInterpretation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassInterpretation__Group__1();

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
    // $ANTLR end "rule__ClassInterpretation__Group__0"


    // $ANTLR start "rule__ClassInterpretation__Group__0__Impl"
    // InternalSolverLanguage.g:4233:1: rule__ClassInterpretation__Group__0__Impl : ( ( rule__ClassInterpretation__AbstractAssignment_0 )? ) ;
    public final void rule__ClassInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4237:1: ( ( ( rule__ClassInterpretation__AbstractAssignment_0 )? ) )
            // InternalSolverLanguage.g:4238:1: ( ( rule__ClassInterpretation__AbstractAssignment_0 )? )
            {
            // InternalSolverLanguage.g:4238:1: ( ( rule__ClassInterpretation__AbstractAssignment_0 )? )
            // InternalSolverLanguage.g:4239:2: ( rule__ClassInterpretation__AbstractAssignment_0 )?
            {
             before(grammarAccess.getClassInterpretationAccess().getAbstractAssignment_0()); 
            // InternalSolverLanguage.g:4240:2: ( rule__ClassInterpretation__AbstractAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSolverLanguage.g:4240:3: rule__ClassInterpretation__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassInterpretation__AbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassInterpretationAccess().getAbstractAssignment_0()); 

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
    // $ANTLR end "rule__ClassInterpretation__Group__0__Impl"


    // $ANTLR start "rule__ClassInterpretation__Group__1"
    // InternalSolverLanguage.g:4248:1: rule__ClassInterpretation__Group__1 : rule__ClassInterpretation__Group__1__Impl rule__ClassInterpretation__Group__2 ;
    public final void rule__ClassInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4252:1: ( rule__ClassInterpretation__Group__1__Impl rule__ClassInterpretation__Group__2 )
            // InternalSolverLanguage.g:4253:2: rule__ClassInterpretation__Group__1__Impl rule__ClassInterpretation__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ClassInterpretation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassInterpretation__Group__2();

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
    // $ANTLR end "rule__ClassInterpretation__Group__1"


    // $ANTLR start "rule__ClassInterpretation__Group__1__Impl"
    // InternalSolverLanguage.g:4260:1: rule__ClassInterpretation__Group__1__Impl : ( 'class' ) ;
    public final void rule__ClassInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4264:1: ( ( 'class' ) )
            // InternalSolverLanguage.g:4265:1: ( 'class' )
            {
            // InternalSolverLanguage.g:4265:1: ( 'class' )
            // InternalSolverLanguage.g:4266:2: 'class'
            {
             before(grammarAccess.getClassInterpretationAccess().getClassKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getClassInterpretationAccess().getClassKeyword_1()); 

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
    // $ANTLR end "rule__ClassInterpretation__Group__1__Impl"


    // $ANTLR start "rule__ClassInterpretation__Group__2"
    // InternalSolverLanguage.g:4275:1: rule__ClassInterpretation__Group__2 : rule__ClassInterpretation__Group__2__Impl rule__ClassInterpretation__Group__3 ;
    public final void rule__ClassInterpretation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4279:1: ( rule__ClassInterpretation__Group__2__Impl rule__ClassInterpretation__Group__3 )
            // InternalSolverLanguage.g:4280:2: rule__ClassInterpretation__Group__2__Impl rule__ClassInterpretation__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__ClassInterpretation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassInterpretation__Group__3();

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
    // $ANTLR end "rule__ClassInterpretation__Group__2"


    // $ANTLR start "rule__ClassInterpretation__Group__2__Impl"
    // InternalSolverLanguage.g:4287:1: rule__ClassInterpretation__Group__2__Impl : ( ( rule__ClassInterpretation__SymbolAssignment_2 ) ) ;
    public final void rule__ClassInterpretation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4291:1: ( ( ( rule__ClassInterpretation__SymbolAssignment_2 ) ) )
            // InternalSolverLanguage.g:4292:1: ( ( rule__ClassInterpretation__SymbolAssignment_2 ) )
            {
            // InternalSolverLanguage.g:4292:1: ( ( rule__ClassInterpretation__SymbolAssignment_2 ) )
            // InternalSolverLanguage.g:4293:2: ( rule__ClassInterpretation__SymbolAssignment_2 )
            {
             before(grammarAccess.getClassInterpretationAccess().getSymbolAssignment_2()); 
            // InternalSolverLanguage.g:4294:2: ( rule__ClassInterpretation__SymbolAssignment_2 )
            // InternalSolverLanguage.g:4294:3: rule__ClassInterpretation__SymbolAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassInterpretation__SymbolAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassInterpretationAccess().getSymbolAssignment_2()); 

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
    // $ANTLR end "rule__ClassInterpretation__Group__2__Impl"


    // $ANTLR start "rule__ClassInterpretation__Group__3"
    // InternalSolverLanguage.g:4302:1: rule__ClassInterpretation__Group__3 : rule__ClassInterpretation__Group__3__Impl rule__ClassInterpretation__Group__4 ;
    public final void rule__ClassInterpretation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4306:1: ( rule__ClassInterpretation__Group__3__Impl rule__ClassInterpretation__Group__4 )
            // InternalSolverLanguage.g:4307:2: rule__ClassInterpretation__Group__3__Impl rule__ClassInterpretation__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__ClassInterpretation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassInterpretation__Group__4();

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
    // $ANTLR end "rule__ClassInterpretation__Group__3"


    // $ANTLR start "rule__ClassInterpretation__Group__3__Impl"
    // InternalSolverLanguage.g:4314:1: rule__ClassInterpretation__Group__3__Impl : ( ( rule__ClassInterpretation__Group_3__0 )? ) ;
    public final void rule__ClassInterpretation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4318:1: ( ( ( rule__ClassInterpretation__Group_3__0 )? ) )
            // InternalSolverLanguage.g:4319:1: ( ( rule__ClassInterpretation__Group_3__0 )? )
            {
            // InternalSolverLanguage.g:4319:1: ( ( rule__ClassInterpretation__Group_3__0 )? )
            // InternalSolverLanguage.g:4320:2: ( rule__ClassInterpretation__Group_3__0 )?
            {
             before(grammarAccess.getClassInterpretationAccess().getGroup_3()); 
            // InternalSolverLanguage.g:4321:2: ( rule__ClassInterpretation__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==36) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSolverLanguage.g:4321:3: rule__ClassInterpretation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassInterpretation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassInterpretationAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ClassInterpretation__Group__3__Impl"


    // $ANTLR start "rule__ClassInterpretation__Group__4"
    // InternalSolverLanguage.g:4329:1: rule__ClassInterpretation__Group__4 : rule__ClassInterpretation__Group__4__Impl rule__ClassInterpretation__Group__5 ;
    public final void rule__ClassInterpretation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4333:1: ( rule__ClassInterpretation__Group__4__Impl rule__ClassInterpretation__Group__5 )
            // InternalSolverLanguage.g:4334:2: rule__ClassInterpretation__Group__4__Impl rule__ClassInterpretation__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__ClassInterpretation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassInterpretation__Group__5();

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
    // $ANTLR end "rule__ClassInterpretation__Group__4"


    // $ANTLR start "rule__ClassInterpretation__Group__4__Impl"
    // InternalSolverLanguage.g:4341:1: rule__ClassInterpretation__Group__4__Impl : ( '{' ) ;
    public final void rule__ClassInterpretation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4345:1: ( ( '{' ) )
            // InternalSolverLanguage.g:4346:1: ( '{' )
            {
            // InternalSolverLanguage.g:4346:1: ( '{' )
            // InternalSolverLanguage.g:4347:2: '{'
            {
             before(grammarAccess.getClassInterpretationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getClassInterpretationAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ClassInterpretation__Group__4__Impl"


    // $ANTLR start "rule__ClassInterpretation__Group__5"
    // InternalSolverLanguage.g:4356:1: rule__ClassInterpretation__Group__5 : rule__ClassInterpretation__Group__5__Impl rule__ClassInterpretation__Group__6 ;
    public final void rule__ClassInterpretation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4360:1: ( rule__ClassInterpretation__Group__5__Impl rule__ClassInterpretation__Group__6 )
            // InternalSolverLanguage.g:4361:2: rule__ClassInterpretation__Group__5__Impl rule__ClassInterpretation__Group__6
            {
            pushFollow(FOLLOW_37);
            rule__ClassInterpretation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassInterpretation__Group__6();

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
    // $ANTLR end "rule__ClassInterpretation__Group__5"


    // $ANTLR start "rule__ClassInterpretation__Group__5__Impl"
    // InternalSolverLanguage.g:4368:1: rule__ClassInterpretation__Group__5__Impl : ( ( rule__ClassInterpretation__FieltAssignment_5 )* ) ;
    public final void rule__ClassInterpretation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4372:1: ( ( ( rule__ClassInterpretation__FieltAssignment_5 )* ) )
            // InternalSolverLanguage.g:4373:1: ( ( rule__ClassInterpretation__FieltAssignment_5 )* )
            {
            // InternalSolverLanguage.g:4373:1: ( ( rule__ClassInterpretation__FieltAssignment_5 )* )
            // InternalSolverLanguage.g:4374:2: ( rule__ClassInterpretation__FieltAssignment_5 )*
            {
             before(grammarAccess.getClassInterpretationAccess().getFieltAssignment_5()); 
            // InternalSolverLanguage.g:4375:2: ( rule__ClassInterpretation__FieltAssignment_5 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID||LA40_0==41) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalSolverLanguage.g:4375:3: rule__ClassInterpretation__FieltAssignment_5
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__ClassInterpretation__FieltAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getClassInterpretationAccess().getFieltAssignment_5()); 

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
    // $ANTLR end "rule__ClassInterpretation__Group__5__Impl"


    // $ANTLR start "rule__ClassInterpretation__Group__6"
    // InternalSolverLanguage.g:4383:1: rule__ClassInterpretation__Group__6 : rule__ClassInterpretation__Group__6__Impl ;
    public final void rule__ClassInterpretation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4387:1: ( rule__ClassInterpretation__Group__6__Impl )
            // InternalSolverLanguage.g:4388:2: rule__ClassInterpretation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassInterpretation__Group__6__Impl();

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
    // $ANTLR end "rule__ClassInterpretation__Group__6"


    // $ANTLR start "rule__ClassInterpretation__Group__6__Impl"
    // InternalSolverLanguage.g:4394:1: rule__ClassInterpretation__Group__6__Impl : ( '}' ) ;
    public final void rule__ClassInterpretation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4398:1: ( ( '}' ) )
            // InternalSolverLanguage.g:4399:1: ( '}' )
            {
            // InternalSolverLanguage.g:4399:1: ( '}' )
            // InternalSolverLanguage.g:4400:2: '}'
            {
             before(grammarAccess.getClassInterpretationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getClassInterpretationAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ClassInterpretation__Group__6__Impl"


    // $ANTLR start "rule__ClassInterpretation__Group_3__0"
    // InternalSolverLanguage.g:4410:1: rule__ClassInterpretation__Group_3__0 : rule__ClassInterpretation__Group_3__0__Impl rule__ClassInterpretation__Group_3__1 ;
    public final void rule__ClassInterpretation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4414:1: ( rule__ClassInterpretation__Group_3__0__Impl rule__ClassInterpretation__Group_3__1 )
            // InternalSolverLanguage.g:4415:2: rule__ClassInterpretation__Group_3__0__Impl rule__ClassInterpretation__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__ClassInterpretation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassInterpretation__Group_3__1();

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
    // $ANTLR end "rule__ClassInterpretation__Group_3__0"


    // $ANTLR start "rule__ClassInterpretation__Group_3__0__Impl"
    // InternalSolverLanguage.g:4422:1: rule__ClassInterpretation__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__ClassInterpretation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4426:1: ( ( 'extends' ) )
            // InternalSolverLanguage.g:4427:1: ( 'extends' )
            {
            // InternalSolverLanguage.g:4427:1: ( 'extends' )
            // InternalSolverLanguage.g:4428:2: 'extends'
            {
             before(grammarAccess.getClassInterpretationAccess().getExtendsKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getClassInterpretationAccess().getExtendsKeyword_3_0()); 

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
    // $ANTLR end "rule__ClassInterpretation__Group_3__0__Impl"


    // $ANTLR start "rule__ClassInterpretation__Group_3__1"
    // InternalSolverLanguage.g:4437:1: rule__ClassInterpretation__Group_3__1 : rule__ClassInterpretation__Group_3__1__Impl ;
    public final void rule__ClassInterpretation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4441:1: ( rule__ClassInterpretation__Group_3__1__Impl )
            // InternalSolverLanguage.g:4442:2: rule__ClassInterpretation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassInterpretation__Group_3__1__Impl();

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
    // $ANTLR end "rule__ClassInterpretation__Group_3__1"


    // $ANTLR start "rule__ClassInterpretation__Group_3__1__Impl"
    // InternalSolverLanguage.g:4448:1: rule__ClassInterpretation__Group_3__1__Impl : ( ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 ) ) ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 )* ) ) ;
    public final void rule__ClassInterpretation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4452:1: ( ( ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 ) ) ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 )* ) ) )
            // InternalSolverLanguage.g:4453:1: ( ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 ) ) ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 )* ) )
            {
            // InternalSolverLanguage.g:4453:1: ( ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 ) ) ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 )* ) )
            // InternalSolverLanguage.g:4454:2: ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 ) ) ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 )* )
            {
            // InternalSolverLanguage.g:4454:2: ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 ) )
            // InternalSolverLanguage.g:4455:3: ( rule__ClassInterpretation__SupertypesAssignment_3_1 )
            {
             before(grammarAccess.getClassInterpretationAccess().getSupertypesAssignment_3_1()); 
            // InternalSolverLanguage.g:4456:3: ( rule__ClassInterpretation__SupertypesAssignment_3_1 )
            // InternalSolverLanguage.g:4456:4: rule__ClassInterpretation__SupertypesAssignment_3_1
            {
            pushFollow(FOLLOW_39);
            rule__ClassInterpretation__SupertypesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassInterpretationAccess().getSupertypesAssignment_3_1()); 

            }

            // InternalSolverLanguage.g:4459:2: ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 )* )
            // InternalSolverLanguage.g:4460:3: ( rule__ClassInterpretation__SupertypesAssignment_3_1 )*
            {
             before(grammarAccess.getClassInterpretationAccess().getSupertypesAssignment_3_1()); 
            // InternalSolverLanguage.g:4461:3: ( rule__ClassInterpretation__SupertypesAssignment_3_1 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSolverLanguage.g:4461:4: rule__ClassInterpretation__SupertypesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__ClassInterpretation__SupertypesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getClassInterpretationAccess().getSupertypesAssignment_3_1()); 

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
    // $ANTLR end "rule__ClassInterpretation__Group_3__1__Impl"


    // $ANTLR start "rule__EnumInterpretation__Group__0"
    // InternalSolverLanguage.g:4471:1: rule__EnumInterpretation__Group__0 : rule__EnumInterpretation__Group__0__Impl rule__EnumInterpretation__Group__1 ;
    public final void rule__EnumInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4475:1: ( rule__EnumInterpretation__Group__0__Impl rule__EnumInterpretation__Group__1 )
            // InternalSolverLanguage.g:4476:2: rule__EnumInterpretation__Group__0__Impl rule__EnumInterpretation__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EnumInterpretation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumInterpretation__Group__1();

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
    // $ANTLR end "rule__EnumInterpretation__Group__0"


    // $ANTLR start "rule__EnumInterpretation__Group__0__Impl"
    // InternalSolverLanguage.g:4483:1: rule__EnumInterpretation__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4487:1: ( ( 'enum' ) )
            // InternalSolverLanguage.g:4488:1: ( 'enum' )
            {
            // InternalSolverLanguage.g:4488:1: ( 'enum' )
            // InternalSolverLanguage.g:4489:2: 'enum'
            {
             before(grammarAccess.getEnumInterpretationAccess().getEnumKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEnumInterpretationAccess().getEnumKeyword_0()); 

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
    // $ANTLR end "rule__EnumInterpretation__Group__0__Impl"


    // $ANTLR start "rule__EnumInterpretation__Group__1"
    // InternalSolverLanguage.g:4498:1: rule__EnumInterpretation__Group__1 : rule__EnumInterpretation__Group__1__Impl rule__EnumInterpretation__Group__2 ;
    public final void rule__EnumInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4502:1: ( rule__EnumInterpretation__Group__1__Impl rule__EnumInterpretation__Group__2 )
            // InternalSolverLanguage.g:4503:2: rule__EnumInterpretation__Group__1__Impl rule__EnumInterpretation__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__EnumInterpretation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumInterpretation__Group__2();

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
    // $ANTLR end "rule__EnumInterpretation__Group__1"


    // $ANTLR start "rule__EnumInterpretation__Group__1__Impl"
    // InternalSolverLanguage.g:4510:1: rule__EnumInterpretation__Group__1__Impl : ( ( rule__EnumInterpretation__SymbolAssignment_1 ) ) ;
    public final void rule__EnumInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4514:1: ( ( ( rule__EnumInterpretation__SymbolAssignment_1 ) ) )
            // InternalSolverLanguage.g:4515:1: ( ( rule__EnumInterpretation__SymbolAssignment_1 ) )
            {
            // InternalSolverLanguage.g:4515:1: ( ( rule__EnumInterpretation__SymbolAssignment_1 ) )
            // InternalSolverLanguage.g:4516:2: ( rule__EnumInterpretation__SymbolAssignment_1 )
            {
             before(grammarAccess.getEnumInterpretationAccess().getSymbolAssignment_1()); 
            // InternalSolverLanguage.g:4517:2: ( rule__EnumInterpretation__SymbolAssignment_1 )
            // InternalSolverLanguage.g:4517:3: rule__EnumInterpretation__SymbolAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumInterpretation__SymbolAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumInterpretationAccess().getSymbolAssignment_1()); 

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
    // $ANTLR end "rule__EnumInterpretation__Group__1__Impl"


    // $ANTLR start "rule__EnumInterpretation__Group__2"
    // InternalSolverLanguage.g:4525:1: rule__EnumInterpretation__Group__2 : rule__EnumInterpretation__Group__2__Impl rule__EnumInterpretation__Group__3 ;
    public final void rule__EnumInterpretation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4529:1: ( rule__EnumInterpretation__Group__2__Impl rule__EnumInterpretation__Group__3 )
            // InternalSolverLanguage.g:4530:2: rule__EnumInterpretation__Group__2__Impl rule__EnumInterpretation__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__EnumInterpretation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumInterpretation__Group__3();

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
    // $ANTLR end "rule__EnumInterpretation__Group__2"


    // $ANTLR start "rule__EnumInterpretation__Group__2__Impl"
    // InternalSolverLanguage.g:4537:1: rule__EnumInterpretation__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumInterpretation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4541:1: ( ( '{' ) )
            // InternalSolverLanguage.g:4542:1: ( '{' )
            {
            // InternalSolverLanguage.g:4542:1: ( '{' )
            // InternalSolverLanguage.g:4543:2: '{'
            {
             before(grammarAccess.getEnumInterpretationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEnumInterpretationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__EnumInterpretation__Group__2__Impl"


    // $ANTLR start "rule__EnumInterpretation__Group__3"
    // InternalSolverLanguage.g:4552:1: rule__EnumInterpretation__Group__3 : rule__EnumInterpretation__Group__3__Impl rule__EnumInterpretation__Group__4 ;
    public final void rule__EnumInterpretation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4556:1: ( rule__EnumInterpretation__Group__3__Impl rule__EnumInterpretation__Group__4 )
            // InternalSolverLanguage.g:4557:2: rule__EnumInterpretation__Group__3__Impl rule__EnumInterpretation__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__EnumInterpretation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumInterpretation__Group__4();

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
    // $ANTLR end "rule__EnumInterpretation__Group__3"


    // $ANTLR start "rule__EnumInterpretation__Group__3__Impl"
    // InternalSolverLanguage.g:4564:1: rule__EnumInterpretation__Group__3__Impl : ( ( ( rule__EnumInterpretation__ObjectsAssignment_3 ) ) ( ( rule__EnumInterpretation__ObjectsAssignment_3 )* ) ) ;
    public final void rule__EnumInterpretation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4568:1: ( ( ( ( rule__EnumInterpretation__ObjectsAssignment_3 ) ) ( ( rule__EnumInterpretation__ObjectsAssignment_3 )* ) ) )
            // InternalSolverLanguage.g:4569:1: ( ( ( rule__EnumInterpretation__ObjectsAssignment_3 ) ) ( ( rule__EnumInterpretation__ObjectsAssignment_3 )* ) )
            {
            // InternalSolverLanguage.g:4569:1: ( ( ( rule__EnumInterpretation__ObjectsAssignment_3 ) ) ( ( rule__EnumInterpretation__ObjectsAssignment_3 )* ) )
            // InternalSolverLanguage.g:4570:2: ( ( rule__EnumInterpretation__ObjectsAssignment_3 ) ) ( ( rule__EnumInterpretation__ObjectsAssignment_3 )* )
            {
            // InternalSolverLanguage.g:4570:2: ( ( rule__EnumInterpretation__ObjectsAssignment_3 ) )
            // InternalSolverLanguage.g:4571:3: ( rule__EnumInterpretation__ObjectsAssignment_3 )
            {
             before(grammarAccess.getEnumInterpretationAccess().getObjectsAssignment_3()); 
            // InternalSolverLanguage.g:4572:3: ( rule__EnumInterpretation__ObjectsAssignment_3 )
            // InternalSolverLanguage.g:4572:4: rule__EnumInterpretation__ObjectsAssignment_3
            {
            pushFollow(FOLLOW_42);
            rule__EnumInterpretation__ObjectsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumInterpretationAccess().getObjectsAssignment_3()); 

            }

            // InternalSolverLanguage.g:4575:2: ( ( rule__EnumInterpretation__ObjectsAssignment_3 )* )
            // InternalSolverLanguage.g:4576:3: ( rule__EnumInterpretation__ObjectsAssignment_3 )*
            {
             before(grammarAccess.getEnumInterpretationAccess().getObjectsAssignment_3()); 
            // InternalSolverLanguage.g:4577:3: ( rule__EnumInterpretation__ObjectsAssignment_3 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==27) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalSolverLanguage.g:4577:4: rule__EnumInterpretation__ObjectsAssignment_3
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__EnumInterpretation__ObjectsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getEnumInterpretationAccess().getObjectsAssignment_3()); 

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
    // $ANTLR end "rule__EnumInterpretation__Group__3__Impl"


    // $ANTLR start "rule__EnumInterpretation__Group__4"
    // InternalSolverLanguage.g:4586:1: rule__EnumInterpretation__Group__4 : rule__EnumInterpretation__Group__4__Impl ;
    public final void rule__EnumInterpretation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4590:1: ( rule__EnumInterpretation__Group__4__Impl )
            // InternalSolverLanguage.g:4591:2: rule__EnumInterpretation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumInterpretation__Group__4__Impl();

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
    // $ANTLR end "rule__EnumInterpretation__Group__4"


    // $ANTLR start "rule__EnumInterpretation__Group__4__Impl"
    // InternalSolverLanguage.g:4597:1: rule__EnumInterpretation__Group__4__Impl : ( '}' ) ;
    public final void rule__EnumInterpretation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4601:1: ( ( '}' ) )
            // InternalSolverLanguage.g:4602:1: ( '}' )
            {
            // InternalSolverLanguage.g:4602:1: ( '}' )
            // InternalSolverLanguage.g:4603:2: '}'
            {
             before(grammarAccess.getEnumInterpretationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEnumInterpretationAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__EnumInterpretation__Group__4__Impl"


    // $ANTLR start "rule__FieldRelationInterpretation__Group__0"
    // InternalSolverLanguage.g:4613:1: rule__FieldRelationInterpretation__Group__0 : rule__FieldRelationInterpretation__Group__0__Impl rule__FieldRelationInterpretation__Group__1 ;
    public final void rule__FieldRelationInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4617:1: ( rule__FieldRelationInterpretation__Group__0__Impl rule__FieldRelationInterpretation__Group__1 )
            // InternalSolverLanguage.g:4618:2: rule__FieldRelationInterpretation__Group__0__Impl rule__FieldRelationInterpretation__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__FieldRelationInterpretation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldRelationInterpretation__Group__1();

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
    // $ANTLR end "rule__FieldRelationInterpretation__Group__0"


    // $ANTLR start "rule__FieldRelationInterpretation__Group__0__Impl"
    // InternalSolverLanguage.g:4625:1: rule__FieldRelationInterpretation__Group__0__Impl : ( ( rule__FieldRelationInterpretation__ContainmentAssignment_0 )? ) ;
    public final void rule__FieldRelationInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4629:1: ( ( ( rule__FieldRelationInterpretation__ContainmentAssignment_0 )? ) )
            // InternalSolverLanguage.g:4630:1: ( ( rule__FieldRelationInterpretation__ContainmentAssignment_0 )? )
            {
            // InternalSolverLanguage.g:4630:1: ( ( rule__FieldRelationInterpretation__ContainmentAssignment_0 )? )
            // InternalSolverLanguage.g:4631:2: ( rule__FieldRelationInterpretation__ContainmentAssignment_0 )?
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getContainmentAssignment_0()); 
            // InternalSolverLanguage.g:4632:2: ( rule__FieldRelationInterpretation__ContainmentAssignment_0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==41) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSolverLanguage.g:4632:3: rule__FieldRelationInterpretation__ContainmentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldRelationInterpretation__ContainmentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldRelationInterpretationAccess().getContainmentAssignment_0()); 

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
    // $ANTLR end "rule__FieldRelationInterpretation__Group__0__Impl"


    // $ANTLR start "rule__FieldRelationInterpretation__Group__1"
    // InternalSolverLanguage.g:4640:1: rule__FieldRelationInterpretation__Group__1 : rule__FieldRelationInterpretation__Group__1__Impl rule__FieldRelationInterpretation__Group__2 ;
    public final void rule__FieldRelationInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4644:1: ( rule__FieldRelationInterpretation__Group__1__Impl rule__FieldRelationInterpretation__Group__2 )
            // InternalSolverLanguage.g:4645:2: rule__FieldRelationInterpretation__Group__1__Impl rule__FieldRelationInterpretation__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__FieldRelationInterpretation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldRelationInterpretation__Group__2();

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
    // $ANTLR end "rule__FieldRelationInterpretation__Group__1"


    // $ANTLR start "rule__FieldRelationInterpretation__Group__1__Impl"
    // InternalSolverLanguage.g:4652:1: rule__FieldRelationInterpretation__Group__1__Impl : ( ( rule__FieldRelationInterpretation__SymbolAssignment_1 ) ) ;
    public final void rule__FieldRelationInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4656:1: ( ( ( rule__FieldRelationInterpretation__SymbolAssignment_1 ) ) )
            // InternalSolverLanguage.g:4657:1: ( ( rule__FieldRelationInterpretation__SymbolAssignment_1 ) )
            {
            // InternalSolverLanguage.g:4657:1: ( ( rule__FieldRelationInterpretation__SymbolAssignment_1 ) )
            // InternalSolverLanguage.g:4658:2: ( rule__FieldRelationInterpretation__SymbolAssignment_1 )
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getSymbolAssignment_1()); 
            // InternalSolverLanguage.g:4659:2: ( rule__FieldRelationInterpretation__SymbolAssignment_1 )
            // InternalSolverLanguage.g:4659:3: rule__FieldRelationInterpretation__SymbolAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldRelationInterpretation__SymbolAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldRelationInterpretationAccess().getSymbolAssignment_1()); 

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
    // $ANTLR end "rule__FieldRelationInterpretation__Group__1__Impl"


    // $ANTLR start "rule__FieldRelationInterpretation__Group__2"
    // InternalSolverLanguage.g:4667:1: rule__FieldRelationInterpretation__Group__2 : rule__FieldRelationInterpretation__Group__2__Impl rule__FieldRelationInterpretation__Group__3 ;
    public final void rule__FieldRelationInterpretation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4671:1: ( rule__FieldRelationInterpretation__Group__2__Impl rule__FieldRelationInterpretation__Group__3 )
            // InternalSolverLanguage.g:4672:2: rule__FieldRelationInterpretation__Group__2__Impl rule__FieldRelationInterpretation__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__FieldRelationInterpretation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldRelationInterpretation__Group__3();

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
    // $ANTLR end "rule__FieldRelationInterpretation__Group__2"


    // $ANTLR start "rule__FieldRelationInterpretation__Group__2__Impl"
    // InternalSolverLanguage.g:4679:1: rule__FieldRelationInterpretation__Group__2__Impl : ( ':' ) ;
    public final void rule__FieldRelationInterpretation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4683:1: ( ( ':' ) )
            // InternalSolverLanguage.g:4684:1: ( ':' )
            {
            // InternalSolverLanguage.g:4684:1: ( ':' )
            // InternalSolverLanguage.g:4685:2: ':'
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFieldRelationInterpretationAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__FieldRelationInterpretation__Group__2__Impl"


    // $ANTLR start "rule__FieldRelationInterpretation__Group__3"
    // InternalSolverLanguage.g:4694:1: rule__FieldRelationInterpretation__Group__3 : rule__FieldRelationInterpretation__Group__3__Impl rule__FieldRelationInterpretation__Group__4 ;
    public final void rule__FieldRelationInterpretation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4698:1: ( rule__FieldRelationInterpretation__Group__3__Impl rule__FieldRelationInterpretation__Group__4 )
            // InternalSolverLanguage.g:4699:2: rule__FieldRelationInterpretation__Group__3__Impl rule__FieldRelationInterpretation__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__FieldRelationInterpretation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldRelationInterpretation__Group__4();

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
    // $ANTLR end "rule__FieldRelationInterpretation__Group__3"


    // $ANTLR start "rule__FieldRelationInterpretation__Group__3__Impl"
    // InternalSolverLanguage.g:4706:1: rule__FieldRelationInterpretation__Group__3__Impl : ( ( rule__FieldRelationInterpretation__MultiplicityAssignment_3 )? ) ;
    public final void rule__FieldRelationInterpretation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4710:1: ( ( ( rule__FieldRelationInterpretation__MultiplicityAssignment_3 )? ) )
            // InternalSolverLanguage.g:4711:1: ( ( rule__FieldRelationInterpretation__MultiplicityAssignment_3 )? )
            {
            // InternalSolverLanguage.g:4711:1: ( ( rule__FieldRelationInterpretation__MultiplicityAssignment_3 )? )
            // InternalSolverLanguage.g:4712:2: ( rule__FieldRelationInterpretation__MultiplicityAssignment_3 )?
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getMultiplicityAssignment_3()); 
            // InternalSolverLanguage.g:4713:2: ( rule__FieldRelationInterpretation__MultiplicityAssignment_3 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSolverLanguage.g:4713:3: rule__FieldRelationInterpretation__MultiplicityAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldRelationInterpretation__MultiplicityAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldRelationInterpretationAccess().getMultiplicityAssignment_3()); 

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
    // $ANTLR end "rule__FieldRelationInterpretation__Group__3__Impl"


    // $ANTLR start "rule__FieldRelationInterpretation__Group__4"
    // InternalSolverLanguage.g:4721:1: rule__FieldRelationInterpretation__Group__4 : rule__FieldRelationInterpretation__Group__4__Impl ;
    public final void rule__FieldRelationInterpretation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4725:1: ( rule__FieldRelationInterpretation__Group__4__Impl )
            // InternalSolverLanguage.g:4726:2: rule__FieldRelationInterpretation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldRelationInterpretation__Group__4__Impl();

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
    // $ANTLR end "rule__FieldRelationInterpretation__Group__4"


    // $ANTLR start "rule__FieldRelationInterpretation__Group__4__Impl"
    // InternalSolverLanguage.g:4732:1: rule__FieldRelationInterpretation__Group__4__Impl : ( ( rule__FieldRelationInterpretation__TargetAssignment_4 ) ) ;
    public final void rule__FieldRelationInterpretation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4736:1: ( ( ( rule__FieldRelationInterpretation__TargetAssignment_4 ) ) )
            // InternalSolverLanguage.g:4737:1: ( ( rule__FieldRelationInterpretation__TargetAssignment_4 ) )
            {
            // InternalSolverLanguage.g:4737:1: ( ( rule__FieldRelationInterpretation__TargetAssignment_4 ) )
            // InternalSolverLanguage.g:4738:2: ( rule__FieldRelationInterpretation__TargetAssignment_4 )
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getTargetAssignment_4()); 
            // InternalSolverLanguage.g:4739:2: ( rule__FieldRelationInterpretation__TargetAssignment_4 )
            // InternalSolverLanguage.g:4739:3: rule__FieldRelationInterpretation__TargetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FieldRelationInterpretation__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFieldRelationInterpretationAccess().getTargetAssignment_4()); 

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
    // $ANTLR end "rule__FieldRelationInterpretation__Group__4__Impl"


    // $ANTLR start "rule__GlobalRelationInterpretation__Group__0"
    // InternalSolverLanguage.g:4748:1: rule__GlobalRelationInterpretation__Group__0 : rule__GlobalRelationInterpretation__Group__0__Impl rule__GlobalRelationInterpretation__Group__1 ;
    public final void rule__GlobalRelationInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4752:1: ( rule__GlobalRelationInterpretation__Group__0__Impl rule__GlobalRelationInterpretation__Group__1 )
            // InternalSolverLanguage.g:4753:2: rule__GlobalRelationInterpretation__Group__0__Impl rule__GlobalRelationInterpretation__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__GlobalRelationInterpretation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalRelationInterpretation__Group__1();

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
    // $ANTLR end "rule__GlobalRelationInterpretation__Group__0"


    // $ANTLR start "rule__GlobalRelationInterpretation__Group__0__Impl"
    // InternalSolverLanguage.g:4760:1: rule__GlobalRelationInterpretation__Group__0__Impl : ( ( rule__GlobalRelationInterpretation__ContainmentAssignment_0 )? ) ;
    public final void rule__GlobalRelationInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4764:1: ( ( ( rule__GlobalRelationInterpretation__ContainmentAssignment_0 )? ) )
            // InternalSolverLanguage.g:4765:1: ( ( rule__GlobalRelationInterpretation__ContainmentAssignment_0 )? )
            {
            // InternalSolverLanguage.g:4765:1: ( ( rule__GlobalRelationInterpretation__ContainmentAssignment_0 )? )
            // InternalSolverLanguage.g:4766:2: ( rule__GlobalRelationInterpretation__ContainmentAssignment_0 )?
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getContainmentAssignment_0()); 
            // InternalSolverLanguage.g:4767:2: ( rule__GlobalRelationInterpretation__ContainmentAssignment_0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSolverLanguage.g:4767:3: rule__GlobalRelationInterpretation__ContainmentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GlobalRelationInterpretation__ContainmentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalRelationInterpretationAccess().getContainmentAssignment_0()); 

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
    // $ANTLR end "rule__GlobalRelationInterpretation__Group__0__Impl"


    // $ANTLR start "rule__GlobalRelationInterpretation__Group__1"
    // InternalSolverLanguage.g:4775:1: rule__GlobalRelationInterpretation__Group__1 : rule__GlobalRelationInterpretation__Group__1__Impl rule__GlobalRelationInterpretation__Group__2 ;
    public final void rule__GlobalRelationInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4779:1: ( rule__GlobalRelationInterpretation__Group__1__Impl rule__GlobalRelationInterpretation__Group__2 )
            // InternalSolverLanguage.g:4780:2: rule__GlobalRelationInterpretation__Group__1__Impl rule__GlobalRelationInterpretation__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__GlobalRelationInterpretation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalRelationInterpretation__Group__2();

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
    // $ANTLR end "rule__GlobalRelationInterpretation__Group__1"


    // $ANTLR start "rule__GlobalRelationInterpretation__Group__1__Impl"
    // InternalSolverLanguage.g:4787:1: rule__GlobalRelationInterpretation__Group__1__Impl : ( 'relation' ) ;
    public final void rule__GlobalRelationInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4791:1: ( ( 'relation' ) )
            // InternalSolverLanguage.g:4792:1: ( 'relation' )
            {
            // InternalSolverLanguage.g:4792:1: ( 'relation' )
            // InternalSolverLanguage.g:4793:2: 'relation'
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getRelationKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGlobalRelationInterpretationAccess().getRelationKeyword_1()); 

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
    // $ANTLR end "rule__GlobalRelationInterpretation__Group__1__Impl"


    // $ANTLR start "rule__GlobalRelationInterpretation__Group__2"
    // InternalSolverLanguage.g:4802:1: rule__GlobalRelationInterpretation__Group__2 : rule__GlobalRelationInterpretation__Group__2__Impl rule__GlobalRelationInterpretation__Group__3 ;
    public final void rule__GlobalRelationInterpretation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4806:1: ( rule__GlobalRelationInterpretation__Group__2__Impl rule__GlobalRelationInterpretation__Group__3 )
            // InternalSolverLanguage.g:4807:2: rule__GlobalRelationInterpretation__Group__2__Impl rule__GlobalRelationInterpretation__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__GlobalRelationInterpretation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalRelationInterpretation__Group__3();

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
    // $ANTLR end "rule__GlobalRelationInterpretation__Group__2"


    // $ANTLR start "rule__GlobalRelationInterpretation__Group__2__Impl"
    // InternalSolverLanguage.g:4814:1: rule__GlobalRelationInterpretation__Group__2__Impl : ( ( rule__GlobalRelationInterpretation__SymbolAssignment_2 ) ) ;
    public final void rule__GlobalRelationInterpretation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4818:1: ( ( ( rule__GlobalRelationInterpretation__SymbolAssignment_2 ) ) )
            // InternalSolverLanguage.g:4819:1: ( ( rule__GlobalRelationInterpretation__SymbolAssignment_2 ) )
            {
            // InternalSolverLanguage.g:4819:1: ( ( rule__GlobalRelationInterpretation__SymbolAssignment_2 ) )
            // InternalSolverLanguage.g:4820:2: ( rule__GlobalRelationInterpretation__SymbolAssignment_2 )
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getSymbolAssignment_2()); 
            // InternalSolverLanguage.g:4821:2: ( rule__GlobalRelationInterpretation__SymbolAssignment_2 )
            // InternalSolverLanguage.g:4821:3: rule__GlobalRelationInterpretation__SymbolAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GlobalRelationInterpretation__SymbolAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalRelationInterpretationAccess().getSymbolAssignment_2()); 

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
    // $ANTLR end "rule__GlobalRelationInterpretation__Group__2__Impl"


    // $ANTLR start "rule__GlobalRelationInterpretation__Group__3"
    // InternalSolverLanguage.g:4829:1: rule__GlobalRelationInterpretation__Group__3 : rule__GlobalRelationInterpretation__Group__3__Impl rule__GlobalRelationInterpretation__Group__4 ;
    public final void rule__GlobalRelationInterpretation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4833:1: ( rule__GlobalRelationInterpretation__Group__3__Impl rule__GlobalRelationInterpretation__Group__4 )
            // InternalSolverLanguage.g:4834:2: rule__GlobalRelationInterpretation__Group__3__Impl rule__GlobalRelationInterpretation__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__GlobalRelationInterpretation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalRelationInterpretation__Group__4();

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
    // $ANTLR end "rule__GlobalRelationInterpretation__Group__3"


    // $ANTLR start "rule__GlobalRelationInterpretation__Group__3__Impl"
    // InternalSolverLanguage.g:4841:1: rule__GlobalRelationInterpretation__Group__3__Impl : ( ':' ) ;
    public final void rule__GlobalRelationInterpretation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4845:1: ( ( ':' ) )
            // InternalSolverLanguage.g:4846:1: ( ':' )
            {
            // InternalSolverLanguage.g:4846:1: ( ':' )
            // InternalSolverLanguage.g:4847:2: ':'
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getColonKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGlobalRelationInterpretationAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__GlobalRelationInterpretation__Group__3__Impl"


    // $ANTLR start "rule__GlobalRelationInterpretation__Group__4"
    // InternalSolverLanguage.g:4856:1: rule__GlobalRelationInterpretation__Group__4 : rule__GlobalRelationInterpretation__Group__4__Impl rule__GlobalRelationInterpretation__Group__5 ;
    public final void rule__GlobalRelationInterpretation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4860:1: ( rule__GlobalRelationInterpretation__Group__4__Impl rule__GlobalRelationInterpretation__Group__5 )
            // InternalSolverLanguage.g:4861:2: rule__GlobalRelationInterpretation__Group__4__Impl rule__GlobalRelationInterpretation__Group__5
            {
            pushFollow(FOLLOW_44);
            rule__GlobalRelationInterpretation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalRelationInterpretation__Group__5();

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
    // $ANTLR end "rule__GlobalRelationInterpretation__Group__4"


    // $ANTLR start "rule__GlobalRelationInterpretation__Group__4__Impl"
    // InternalSolverLanguage.g:4868:1: rule__GlobalRelationInterpretation__Group__4__Impl : ( ( rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4 )? ) ;
    public final void rule__GlobalRelationInterpretation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4872:1: ( ( ( rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4 )? ) )
            // InternalSolverLanguage.g:4873:1: ( ( rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4 )? )
            {
            // InternalSolverLanguage.g:4873:1: ( ( rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4 )? )
            // InternalSolverLanguage.g:4874:2: ( rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4 )?
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getSourceMultiplicityAssignment_4()); 
            // InternalSolverLanguage.g:4875:2: ( rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_INT) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSolverLanguage.g:4875:3: rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalRelationInterpretationAccess().getSourceMultiplicityAssignment_4()); 

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
    // $ANTLR end "rule__GlobalRelationInterpretation__Group__4__Impl"


    // $ANTLR start "rule__GlobalRelationInterpretation__Group__5"
    // InternalSolverLanguage.g:4883:1: rule__GlobalRelationInterpretation__Group__5 : rule__GlobalRelationInterpretation__Group__5__Impl rule__GlobalRelationInterpretation__Group__6 ;
    public final void rule__GlobalRelationInterpretation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4887:1: ( rule__GlobalRelationInterpretation__Group__5__Impl rule__GlobalRelationInterpretation__Group__6 )
            // InternalSolverLanguage.g:4888:2: rule__GlobalRelationInterpretation__Group__5__Impl rule__GlobalRelationInterpretation__Group__6
            {
            pushFollow(FOLLOW_44);
            rule__GlobalRelationInterpretation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalRelationInterpretation__Group__6();

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
    // $ANTLR end "rule__GlobalRelationInterpretation__Group__5"


    // $ANTLR start "rule__GlobalRelationInterpretation__Group__5__Impl"
    // InternalSolverLanguage.g:4895:1: rule__GlobalRelationInterpretation__Group__5__Impl : ( ( rule__GlobalRelationInterpretation__SourceAssignment_5 ) ) ;
    public final void rule__GlobalRelationInterpretation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4899:1: ( ( ( rule__GlobalRelationInterpretation__SourceAssignment_5 ) ) )
            // InternalSolverLanguage.g:4900:1: ( ( rule__GlobalRelationInterpretation__SourceAssignment_5 ) )
            {
            // InternalSolverLanguage.g:4900:1: ( ( rule__GlobalRelationInterpretation__SourceAssignment_5 ) )
            // InternalSolverLanguage.g:4901:2: ( rule__GlobalRelationInterpretation__SourceAssignment_5 )
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getSourceAssignment_5()); 
            // InternalSolverLanguage.g:4902:2: ( rule__GlobalRelationInterpretation__SourceAssignment_5 )
            // InternalSolverLanguage.g:4902:3: rule__GlobalRelationInterpretation__SourceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__GlobalRelationInterpretation__SourceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGlobalRelationInterpretationAccess().getSourceAssignment_5()); 

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
    // $ANTLR end "rule__GlobalRelationInterpretation__Group__5__Impl"


    // $ANTLR start "rule__GlobalRelationInterpretation__Group__6"
    // InternalSolverLanguage.g:4910:1: rule__GlobalRelationInterpretation__Group__6 : rule__GlobalRelationInterpretation__Group__6__Impl rule__GlobalRelationInterpretation__Group__7 ;
    public final void rule__GlobalRelationInterpretation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4914:1: ( rule__GlobalRelationInterpretation__Group__6__Impl rule__GlobalRelationInterpretation__Group__7 )
            // InternalSolverLanguage.g:4915:2: rule__GlobalRelationInterpretation__Group__6__Impl rule__GlobalRelationInterpretation__Group__7
            {
            pushFollow(FOLLOW_44);
            rule__GlobalRelationInterpretation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalRelationInterpretation__Group__7();

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
    // $ANTLR end "rule__GlobalRelationInterpretation__Group__6"


    // $ANTLR start "rule__GlobalRelationInterpretation__Group__6__Impl"
    // InternalSolverLanguage.g:4922:1: rule__GlobalRelationInterpretation__Group__6__Impl : ( ( rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6 )? ) ;
    public final void rule__GlobalRelationInterpretation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4926:1: ( ( ( rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6 )? ) )
            // InternalSolverLanguage.g:4927:1: ( ( rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6 )? )
            {
            // InternalSolverLanguage.g:4927:1: ( ( rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6 )? )
            // InternalSolverLanguage.g:4928:2: ( rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6 )?
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getTargetMultiplicityAssignment_6()); 
            // InternalSolverLanguage.g:4929:2: ( rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSolverLanguage.g:4929:3: rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalRelationInterpretationAccess().getTargetMultiplicityAssignment_6()); 

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
    // $ANTLR end "rule__GlobalRelationInterpretation__Group__6__Impl"


    // $ANTLR start "rule__GlobalRelationInterpretation__Group__7"
    // InternalSolverLanguage.g:4937:1: rule__GlobalRelationInterpretation__Group__7 : rule__GlobalRelationInterpretation__Group__7__Impl ;
    public final void rule__GlobalRelationInterpretation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4941:1: ( rule__GlobalRelationInterpretation__Group__7__Impl )
            // InternalSolverLanguage.g:4942:2: rule__GlobalRelationInterpretation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalRelationInterpretation__Group__7__Impl();

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
    // $ANTLR end "rule__GlobalRelationInterpretation__Group__7"


    // $ANTLR start "rule__GlobalRelationInterpretation__Group__7__Impl"
    // InternalSolverLanguage.g:4948:1: rule__GlobalRelationInterpretation__Group__7__Impl : ( ( rule__GlobalRelationInterpretation__TargetAssignment_7 ) ) ;
    public final void rule__GlobalRelationInterpretation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4952:1: ( ( ( rule__GlobalRelationInterpretation__TargetAssignment_7 ) ) )
            // InternalSolverLanguage.g:4953:1: ( ( rule__GlobalRelationInterpretation__TargetAssignment_7 ) )
            {
            // InternalSolverLanguage.g:4953:1: ( ( rule__GlobalRelationInterpretation__TargetAssignment_7 ) )
            // InternalSolverLanguage.g:4954:2: ( rule__GlobalRelationInterpretation__TargetAssignment_7 )
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getTargetAssignment_7()); 
            // InternalSolverLanguage.g:4955:2: ( rule__GlobalRelationInterpretation__TargetAssignment_7 )
            // InternalSolverLanguage.g:4955:3: rule__GlobalRelationInterpretation__TargetAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__GlobalRelationInterpretation__TargetAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGlobalRelationInterpretationAccess().getTargetAssignment_7()); 

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
    // $ANTLR end "rule__GlobalRelationInterpretation__Group__7__Impl"


    // $ANTLR start "rule__MultiplicityDefinition__Group__0"
    // InternalSolverLanguage.g:4964:1: rule__MultiplicityDefinition__Group__0 : rule__MultiplicityDefinition__Group__0__Impl rule__MultiplicityDefinition__Group__1 ;
    public final void rule__MultiplicityDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4968:1: ( rule__MultiplicityDefinition__Group__0__Impl rule__MultiplicityDefinition__Group__1 )
            // InternalSolverLanguage.g:4969:2: rule__MultiplicityDefinition__Group__0__Impl rule__MultiplicityDefinition__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__MultiplicityDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicityDefinition__Group__1();

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
    // $ANTLR end "rule__MultiplicityDefinition__Group__0"


    // $ANTLR start "rule__MultiplicityDefinition__Group__0__Impl"
    // InternalSolverLanguage.g:4976:1: rule__MultiplicityDefinition__Group__0__Impl : ( ( rule__MultiplicityDefinition__LowerAssignment_0 ) ) ;
    public final void rule__MultiplicityDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4980:1: ( ( ( rule__MultiplicityDefinition__LowerAssignment_0 ) ) )
            // InternalSolverLanguage.g:4981:1: ( ( rule__MultiplicityDefinition__LowerAssignment_0 ) )
            {
            // InternalSolverLanguage.g:4981:1: ( ( rule__MultiplicityDefinition__LowerAssignment_0 ) )
            // InternalSolverLanguage.g:4982:2: ( rule__MultiplicityDefinition__LowerAssignment_0 )
            {
             before(grammarAccess.getMultiplicityDefinitionAccess().getLowerAssignment_0()); 
            // InternalSolverLanguage.g:4983:2: ( rule__MultiplicityDefinition__LowerAssignment_0 )
            // InternalSolverLanguage.g:4983:3: rule__MultiplicityDefinition__LowerAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityDefinition__LowerAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityDefinitionAccess().getLowerAssignment_0()); 

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
    // $ANTLR end "rule__MultiplicityDefinition__Group__0__Impl"


    // $ANTLR start "rule__MultiplicityDefinition__Group__1"
    // InternalSolverLanguage.g:4991:1: rule__MultiplicityDefinition__Group__1 : rule__MultiplicityDefinition__Group__1__Impl rule__MultiplicityDefinition__Group__2 ;
    public final void rule__MultiplicityDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4995:1: ( rule__MultiplicityDefinition__Group__1__Impl rule__MultiplicityDefinition__Group__2 )
            // InternalSolverLanguage.g:4996:2: rule__MultiplicityDefinition__Group__1__Impl rule__MultiplicityDefinition__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__MultiplicityDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicityDefinition__Group__2();

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
    // $ANTLR end "rule__MultiplicityDefinition__Group__1"


    // $ANTLR start "rule__MultiplicityDefinition__Group__1__Impl"
    // InternalSolverLanguage.g:5003:1: rule__MultiplicityDefinition__Group__1__Impl : ( '..' ) ;
    public final void rule__MultiplicityDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5007:1: ( ( '..' ) )
            // InternalSolverLanguage.g:5008:1: ( '..' )
            {
            // InternalSolverLanguage.g:5008:1: ( '..' )
            // InternalSolverLanguage.g:5009:2: '..'
            {
             before(grammarAccess.getMultiplicityDefinitionAccess().getFullStopFullStopKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMultiplicityDefinitionAccess().getFullStopFullStopKeyword_1()); 

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
    // $ANTLR end "rule__MultiplicityDefinition__Group__1__Impl"


    // $ANTLR start "rule__MultiplicityDefinition__Group__2"
    // InternalSolverLanguage.g:5018:1: rule__MultiplicityDefinition__Group__2 : rule__MultiplicityDefinition__Group__2__Impl ;
    public final void rule__MultiplicityDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5022:1: ( rule__MultiplicityDefinition__Group__2__Impl )
            // InternalSolverLanguage.g:5023:2: rule__MultiplicityDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__MultiplicityDefinition__Group__2"


    // $ANTLR start "rule__MultiplicityDefinition__Group__2__Impl"
    // InternalSolverLanguage.g:5029:1: rule__MultiplicityDefinition__Group__2__Impl : ( ( rule__MultiplicityDefinition__Alternatives_2 ) ) ;
    public final void rule__MultiplicityDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5033:1: ( ( ( rule__MultiplicityDefinition__Alternatives_2 ) ) )
            // InternalSolverLanguage.g:5034:1: ( ( rule__MultiplicityDefinition__Alternatives_2 ) )
            {
            // InternalSolverLanguage.g:5034:1: ( ( rule__MultiplicityDefinition__Alternatives_2 ) )
            // InternalSolverLanguage.g:5035:2: ( rule__MultiplicityDefinition__Alternatives_2 )
            {
             before(grammarAccess.getMultiplicityDefinitionAccess().getAlternatives_2()); 
            // InternalSolverLanguage.g:5036:2: ( rule__MultiplicityDefinition__Alternatives_2 )
            // InternalSolverLanguage.g:5036:3: rule__MultiplicityDefinition__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityDefinition__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityDefinitionAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__MultiplicityDefinition__Group__2__Impl"


    // $ANTLR start "rule__Problem__StatementsAssignment"
    // InternalSolverLanguage.g:5045:1: rule__Problem__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Problem__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5049:1: ( ( ruleStatement ) )
            // InternalSolverLanguage.g:5050:2: ( ruleStatement )
            {
            // InternalSolverLanguage.g:5050:2: ( ruleStatement )
            // InternalSolverLanguage.g:5051:3: ruleStatement
            {
             before(grammarAccess.getProblemAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProblemAccess().getStatementsStatementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Problem__StatementsAssignment"


    // $ANTLR start "rule__BasicInterpretation__SymbolAssignment_0"
    // InternalSolverLanguage.g:5060:1: rule__BasicInterpretation__SymbolAssignment_0 : ( ruleSymbol ) ;
    public final void rule__BasicInterpretation__SymbolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5064:1: ( ( ruleSymbol ) )
            // InternalSolverLanguage.g:5065:2: ( ruleSymbol )
            {
            // InternalSolverLanguage.g:5065:2: ( ruleSymbol )
            // InternalSolverLanguage.g:5066:3: ruleSymbol
            {
             before(grammarAccess.getBasicInterpretationAccess().getSymbolSymbolParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getBasicInterpretationAccess().getSymbolSymbolParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__BasicInterpretation__SymbolAssignment_0"


    // $ANTLR start "rule__BasicInterpretation__ObjectsAssignment_1_1_0"
    // InternalSolverLanguage.g:5075:1: rule__BasicInterpretation__ObjectsAssignment_1_1_0 : ( ruleComplexObject ) ;
    public final void rule__BasicInterpretation__ObjectsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5079:1: ( ( ruleComplexObject ) )
            // InternalSolverLanguage.g:5080:2: ( ruleComplexObject )
            {
            // InternalSolverLanguage.g:5080:2: ( ruleComplexObject )
            // InternalSolverLanguage.g:5081:3: ruleComplexObject
            {
             before(grammarAccess.getBasicInterpretationAccess().getObjectsComplexObjectParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexObject();

            state._fsp--;

             after(grammarAccess.getBasicInterpretationAccess().getObjectsComplexObjectParserRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__BasicInterpretation__ObjectsAssignment_1_1_0"


    // $ANTLR start "rule__BasicInterpretation__ObjectsAssignment_1_1_1_1"
    // InternalSolverLanguage.g:5090:1: rule__BasicInterpretation__ObjectsAssignment_1_1_1_1 : ( ruleComplexObject ) ;
    public final void rule__BasicInterpretation__ObjectsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5094:1: ( ( ruleComplexObject ) )
            // InternalSolverLanguage.g:5095:2: ( ruleComplexObject )
            {
            // InternalSolverLanguage.g:5095:2: ( ruleComplexObject )
            // InternalSolverLanguage.g:5096:3: ruleComplexObject
            {
             before(grammarAccess.getBasicInterpretationAccess().getObjectsComplexObjectParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexObject();

            state._fsp--;

             after(grammarAccess.getBasicInterpretationAccess().getObjectsComplexObjectParserRuleCall_1_1_1_1_0()); 

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
    // $ANTLR end "rule__BasicInterpretation__ObjectsAssignment_1_1_1_1"


    // $ANTLR start "rule__BasicInterpretation__ValueAssignment_3"
    // InternalSolverLanguage.g:5105:1: rule__BasicInterpretation__ValueAssignment_3 : ( ruleTruthValue ) ;
    public final void rule__BasicInterpretation__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5109:1: ( ( ruleTruthValue ) )
            // InternalSolverLanguage.g:5110:2: ( ruleTruthValue )
            {
            // InternalSolverLanguage.g:5110:2: ( ruleTruthValue )
            // InternalSolverLanguage.g:5111:3: ruleTruthValue
            {
             before(grammarAccess.getBasicInterpretationAccess().getValueTruthValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTruthValue();

            state._fsp--;

             after(grammarAccess.getBasicInterpretationAccess().getValueTruthValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__BasicInterpretation__ValueAssignment_3"


    // $ANTLR start "rule__ModelSymbol__NameAssignment"
    // InternalSolverLanguage.g:5120:1: rule__ModelSymbol__NameAssignment : ( RULE_ID ) ;
    public final void rule__ModelSymbol__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5124:1: ( ( RULE_ID ) )
            // InternalSolverLanguage.g:5125:2: ( RULE_ID )
            {
            // InternalSolverLanguage.g:5125:2: ( RULE_ID )
            // InternalSolverLanguage.g:5126:3: RULE_ID
            {
             before(grammarAccess.getModelSymbolAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelSymbolAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ModelSymbol__NameAssignment"


    // $ANTLR start "rule__NamedObject__NameAssignment_1"
    // InternalSolverLanguage.g:5135:1: rule__NamedObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NamedObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5139:1: ( ( RULE_ID ) )
            // InternalSolverLanguage.g:5140:2: ( RULE_ID )
            {
            // InternalSolverLanguage.g:5140:2: ( RULE_ID )
            // InternalSolverLanguage.g:5141:3: RULE_ID
            {
             before(grammarAccess.getNamedObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedObjectAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NamedObject__NameAssignment_1"


    // $ANTLR start "rule__UnnamedObject__NameAssignment"
    // InternalSolverLanguage.g:5150:1: rule__UnnamedObject__NameAssignment : ( RULE_ID ) ;
    public final void rule__UnnamedObject__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5154:1: ( ( RULE_ID ) )
            // InternalSolverLanguage.g:5155:2: ( RULE_ID )
            {
            // InternalSolverLanguage.g:5155:2: ( RULE_ID )
            // InternalSolverLanguage.g:5156:3: RULE_ID
            {
             before(grammarAccess.getUnnamedObjectAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUnnamedObjectAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__UnnamedObject__NameAssignment"


    // $ANTLR start "rule__BooleanObject__ValueAssignment"
    // InternalSolverLanguage.g:5165:1: rule__BooleanObject__ValueAssignment : ( ruleBooleanValue ) ;
    public final void rule__BooleanObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5169:1: ( ( ruleBooleanValue ) )
            // InternalSolverLanguage.g:5170:2: ( ruleBooleanValue )
            {
            // InternalSolverLanguage.g:5170:2: ( ruleBooleanValue )
            // InternalSolverLanguage.g:5171:3: ruleBooleanValue
            {
             before(grammarAccess.getBooleanObjectAccess().getValueBooleanValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanObjectAccess().getValueBooleanValueParserRuleCall_0()); 

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
    // $ANTLR end "rule__BooleanObject__ValueAssignment"


    // $ANTLR start "rule__IntObject__ValueAssignment"
    // InternalSolverLanguage.g:5180:1: rule__IntObject__ValueAssignment : ( ruleINTLiteral ) ;
    public final void rule__IntObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5184:1: ( ( ruleINTLiteral ) )
            // InternalSolverLanguage.g:5185:2: ( ruleINTLiteral )
            {
            // InternalSolverLanguage.g:5185:2: ( ruleINTLiteral )
            // InternalSolverLanguage.g:5186:3: ruleINTLiteral
            {
             before(grammarAccess.getIntObjectAccess().getValueINTLiteralParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleINTLiteral();

            state._fsp--;

             after(grammarAccess.getIntObjectAccess().getValueINTLiteralParserRuleCall_0()); 

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
    // $ANTLR end "rule__IntObject__ValueAssignment"


    // $ANTLR start "rule__RealObject__ValueAssignment"
    // InternalSolverLanguage.g:5195:1: rule__RealObject__ValueAssignment : ( ruleREALLiteral ) ;
    public final void rule__RealObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5199:1: ( ( ruleREALLiteral ) )
            // InternalSolverLanguage.g:5200:2: ( ruleREALLiteral )
            {
            // InternalSolverLanguage.g:5200:2: ( ruleREALLiteral )
            // InternalSolverLanguage.g:5201:3: ruleREALLiteral
            {
             before(grammarAccess.getRealObjectAccess().getValueREALLiteralParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleREALLiteral();

            state._fsp--;

             after(grammarAccess.getRealObjectAccess().getValueREALLiteralParserRuleCall_0()); 

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
    // $ANTLR end "rule__RealObject__ValueAssignment"


    // $ANTLR start "rule__StringObject__ValueAssignment"
    // InternalSolverLanguage.g:5210:1: rule__StringObject__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5214:1: ( ( RULE_STRING ) )
            // InternalSolverLanguage.g:5215:2: ( RULE_STRING )
            {
            // InternalSolverLanguage.g:5215:2: ( RULE_STRING )
            // InternalSolverLanguage.g:5216:3: RULE_STRING
            {
             before(grammarAccess.getStringObjectAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringObjectAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringObject__ValueAssignment"


    // $ANTLR start "rule__Predicate__IsErrorAssignment_0"
    // InternalSolverLanguage.g:5225:1: rule__Predicate__IsErrorAssignment_0 : ( ( 'error' ) ) ;
    public final void rule__Predicate__IsErrorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5229:1: ( ( ( 'error' ) ) )
            // InternalSolverLanguage.g:5230:2: ( ( 'error' ) )
            {
            // InternalSolverLanguage.g:5230:2: ( ( 'error' ) )
            // InternalSolverLanguage.g:5231:3: ( 'error' )
            {
             before(grammarAccess.getPredicateAccess().getIsErrorErrorKeyword_0_0()); 
            // InternalSolverLanguage.g:5232:3: ( 'error' )
            // InternalSolverLanguage.g:5233:4: 'error'
            {
             before(grammarAccess.getPredicateAccess().getIsErrorErrorKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getIsErrorErrorKeyword_0_0()); 

            }

             after(grammarAccess.getPredicateAccess().getIsErrorErrorKeyword_0_0()); 

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
    // $ANTLR end "rule__Predicate__IsErrorAssignment_0"


    // $ANTLR start "rule__Predicate__SymbolAssignment_1"
    // InternalSolverLanguage.g:5244:1: rule__Predicate__SymbolAssignment_1 : ( ruleModelSymbol ) ;
    public final void rule__Predicate__SymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5248:1: ( ( ruleModelSymbol ) )
            // InternalSolverLanguage.g:5249:2: ( ruleModelSymbol )
            {
            // InternalSolverLanguage.g:5249:2: ( ruleModelSymbol )
            // InternalSolverLanguage.g:5250:3: ruleModelSymbol
            {
             before(grammarAccess.getPredicateAccess().getSymbolModelSymbolParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModelSymbol();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getSymbolModelSymbolParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Predicate__SymbolAssignment_1"


    // $ANTLR start "rule__Predicate__ParametersAssignment_2_1_0"
    // InternalSolverLanguage.g:5259:1: rule__Predicate__ParametersAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__Predicate__ParametersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5263:1: ( ( ruleParameter ) )
            // InternalSolverLanguage.g:5264:2: ( ruleParameter )
            {
            // InternalSolverLanguage.g:5264:2: ( ruleParameter )
            // InternalSolverLanguage.g:5265:3: ruleParameter
            {
             before(grammarAccess.getPredicateAccess().getParametersParameterParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getParametersParameterParserRuleCall_2_1_0_0()); 

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
    // $ANTLR end "rule__Predicate__ParametersAssignment_2_1_0"


    // $ANTLR start "rule__Predicate__ParametersAssignment_2_1_1_1"
    // InternalSolverLanguage.g:5274:1: rule__Predicate__ParametersAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__Predicate__ParametersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5278:1: ( ( ruleParameter ) )
            // InternalSolverLanguage.g:5279:2: ( ruleParameter )
            {
            // InternalSolverLanguage.g:5279:2: ( ruleParameter )
            // InternalSolverLanguage.g:5280:3: ruleParameter
            {
             before(grammarAccess.getPredicateAccess().getParametersParameterParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getParametersParameterParserRuleCall_2_1_1_1_0()); 

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
    // $ANTLR end "rule__Predicate__ParametersAssignment_2_1_1_1"


    // $ANTLR start "rule__Predicate__BodiesAssignment_4_1_0"
    // InternalSolverLanguage.g:5289:1: rule__Predicate__BodiesAssignment_4_1_0 : ( rulePatternBody ) ;
    public final void rule__Predicate__BodiesAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5293:1: ( ( rulePatternBody ) )
            // InternalSolverLanguage.g:5294:2: ( rulePatternBody )
            {
            // InternalSolverLanguage.g:5294:2: ( rulePatternBody )
            // InternalSolverLanguage.g:5295:3: rulePatternBody
            {
             before(grammarAccess.getPredicateAccess().getBodiesPatternBodyParserRuleCall_4_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePatternBody();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getBodiesPatternBodyParserRuleCall_4_1_0_0()); 

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
    // $ANTLR end "rule__Predicate__BodiesAssignment_4_1_0"


    // $ANTLR start "rule__Predicate__BodiesAssignment_4_1_1_1"
    // InternalSolverLanguage.g:5304:1: rule__Predicate__BodiesAssignment_4_1_1_1 : ( rulePatternBody ) ;
    public final void rule__Predicate__BodiesAssignment_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5308:1: ( ( rulePatternBody ) )
            // InternalSolverLanguage.g:5309:2: ( rulePatternBody )
            {
            // InternalSolverLanguage.g:5309:2: ( rulePatternBody )
            // InternalSolverLanguage.g:5310:3: rulePatternBody
            {
             before(grammarAccess.getPredicateAccess().getBodiesPatternBodyParserRuleCall_4_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePatternBody();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getBodiesPatternBodyParserRuleCall_4_1_1_1_0()); 

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
    // $ANTLR end "rule__Predicate__BodiesAssignment_4_1_1_1"


    // $ANTLR start "rule__Parameter__VariableAssignment_0"
    // InternalSolverLanguage.g:5319:1: rule__Parameter__VariableAssignment_0 : ( ruleVariable ) ;
    public final void rule__Parameter__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5323:1: ( ( ruleVariable ) )
            // InternalSolverLanguage.g:5324:2: ( ruleVariable )
            {
            // InternalSolverLanguage.g:5324:2: ( ruleVariable )
            // InternalSolverLanguage.g:5325:3: ruleVariable
            {
             before(grammarAccess.getParameterAccess().getVariableVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getVariableVariableParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Parameter__VariableAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_1_1"
    // InternalSolverLanguage.g:5334:1: rule__Parameter__TypeAssignment_1_1 : ( ruleSymbol ) ;
    public final void rule__Parameter__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5338:1: ( ( ruleSymbol ) )
            // InternalSolverLanguage.g:5339:2: ( ruleSymbol )
            {
            // InternalSolverLanguage.g:5339:2: ( ruleSymbol )
            // InternalSolverLanguage.g:5340:3: ruleSymbol
            {
             before(grammarAccess.getParameterAccess().getTypeSymbolParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeSymbolParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Parameter__TypeAssignment_1_1"


    // $ANTLR start "rule__PatternBody__ConstraintsAssignment_1_1"
    // InternalSolverLanguage.g:5349:1: rule__PatternBody__ConstraintsAssignment_1_1 : ( ruleConstraint ) ;
    public final void rule__PatternBody__ConstraintsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5353:1: ( ( ruleConstraint ) )
            // InternalSolverLanguage.g:5354:2: ( ruleConstraint )
            {
            // InternalSolverLanguage.g:5354:2: ( ruleConstraint )
            // InternalSolverLanguage.g:5355:3: ruleConstraint
            {
             before(grammarAccess.getPatternBodyAccess().getConstraintsConstraintParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getPatternBodyAccess().getConstraintsConstraintParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PatternBody__ConstraintsAssignment_1_1"


    // $ANTLR start "rule__Constraint__PolarityAssignment_0_0"
    // InternalSolverLanguage.g:5364:1: rule__Constraint__PolarityAssignment_0_0 : ( rulePolarity ) ;
    public final void rule__Constraint__PolarityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5368:1: ( ( rulePolarity ) )
            // InternalSolverLanguage.g:5369:2: ( rulePolarity )
            {
            // InternalSolverLanguage.g:5369:2: ( rulePolarity )
            // InternalSolverLanguage.g:5370:3: rulePolarity
            {
             before(grammarAccess.getConstraintAccess().getPolarityPolarityParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            rulePolarity();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getPolarityPolarityParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Constraint__PolarityAssignment_0_0"


    // $ANTLR start "rule__Constraint__SymbolAssignment_0_1"
    // InternalSolverLanguage.g:5379:1: rule__Constraint__SymbolAssignment_0_1 : ( ruleModelSymbol ) ;
    public final void rule__Constraint__SymbolAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5383:1: ( ( ruleModelSymbol ) )
            // InternalSolverLanguage.g:5384:2: ( ruleModelSymbol )
            {
            // InternalSolverLanguage.g:5384:2: ( ruleModelSymbol )
            // InternalSolverLanguage.g:5385:3: ruleModelSymbol
            {
             before(grammarAccess.getConstraintAccess().getSymbolModelSymbolParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModelSymbol();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getSymbolModelSymbolParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Constraint__SymbolAssignment_0_1"


    // $ANTLR start "rule__Constraint__ParamsAssignment_0_2_1"
    // InternalSolverLanguage.g:5394:1: rule__Constraint__ParamsAssignment_0_2_1 : ( ruleLiteral ) ;
    public final void rule__Constraint__ParamsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5398:1: ( ( ruleLiteral ) )
            // InternalSolverLanguage.g:5399:2: ( ruleLiteral )
            {
            // InternalSolverLanguage.g:5399:2: ( ruleLiteral )
            // InternalSolverLanguage.g:5400:3: ruleLiteral
            {
             before(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_0_2_1_0()); 

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
    // $ANTLR end "rule__Constraint__ParamsAssignment_0_2_1"


    // $ANTLR start "rule__Constraint__ParamsAssignment_0_2_2_1"
    // InternalSolverLanguage.g:5409:1: rule__Constraint__ParamsAssignment_0_2_2_1 : ( ruleLiteral ) ;
    public final void rule__Constraint__ParamsAssignment_0_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5413:1: ( ( ruleLiteral ) )
            // InternalSolverLanguage.g:5414:2: ( ruleLiteral )
            {
            // InternalSolverLanguage.g:5414:2: ( ruleLiteral )
            // InternalSolverLanguage.g:5415:3: ruleLiteral
            {
             before(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_0_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_0_2_2_1_0()); 

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
    // $ANTLR end "rule__Constraint__ParamsAssignment_0_2_2_1"


    // $ANTLR start "rule__Constraint__ClosureTypeAssignment_1_0"
    // InternalSolverLanguage.g:5424:1: rule__Constraint__ClosureTypeAssignment_1_0 : ( ruleClosureType ) ;
    public final void rule__Constraint__ClosureTypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5428:1: ( ( ruleClosureType ) )
            // InternalSolverLanguage.g:5429:2: ( ruleClosureType )
            {
            // InternalSolverLanguage.g:5429:2: ( ruleClosureType )
            // InternalSolverLanguage.g:5430:3: ruleClosureType
            {
             before(grammarAccess.getConstraintAccess().getClosureTypeClosureTypeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClosureType();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getClosureTypeClosureTypeParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Constraint__ClosureTypeAssignment_1_0"


    // $ANTLR start "rule__Constraint__ParamsAssignment_1_2"
    // InternalSolverLanguage.g:5439:1: rule__Constraint__ParamsAssignment_1_2 : ( ruleLiteral ) ;
    public final void rule__Constraint__ParamsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5443:1: ( ( ruleLiteral ) )
            // InternalSolverLanguage.g:5444:2: ( ruleLiteral )
            {
            // InternalSolverLanguage.g:5444:2: ( ruleLiteral )
            // InternalSolverLanguage.g:5445:3: ruleLiteral
            {
             before(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Constraint__ParamsAssignment_1_2"


    // $ANTLR start "rule__Constraint__ParamsAssignment_1_3_1"
    // InternalSolverLanguage.g:5454:1: rule__Constraint__ParamsAssignment_1_3_1 : ( ruleLiteral ) ;
    public final void rule__Constraint__ParamsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5458:1: ( ( ruleLiteral ) )
            // InternalSolverLanguage.g:5459:2: ( ruleLiteral )
            {
            // InternalSolverLanguage.g:5459:2: ( ruleLiteral )
            // InternalSolverLanguage.g:5460:3: ruleLiteral
            {
             before(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_1_3_1_0()); 

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
    // $ANTLR end "rule__Constraint__ParamsAssignment_1_3_1"


    // $ANTLR start "rule__Variable__NameAssignment"
    // InternalSolverLanguage.g:5469:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5473:1: ( ( RULE_ID ) )
            // InternalSolverLanguage.g:5474:2: ( RULE_ID )
            {
            // InternalSolverLanguage.g:5474:2: ( RULE_ID )
            // InternalSolverLanguage.g:5475:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment"


    // $ANTLR start "rule__AllInstances__SymbolAssignment_1"
    // InternalSolverLanguage.g:5484:1: rule__AllInstances__SymbolAssignment_1 : ( ruleSymbol ) ;
    public final void rule__AllInstances__SymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5488:1: ( ( ruleSymbol ) )
            // InternalSolverLanguage.g:5489:2: ( ruleSymbol )
            {
            // InternalSolverLanguage.g:5489:2: ( ruleSymbol )
            // InternalSolverLanguage.g:5490:3: ruleSymbol
            {
             before(grammarAccess.getAllInstancesAccess().getSymbolSymbolParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getAllInstancesAccess().getSymbolSymbolParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AllInstances__SymbolAssignment_1"


    // $ANTLR start "rule__DefaultInterpretation__InterpretationAssignment_1"
    // InternalSolverLanguage.g:5499:1: rule__DefaultInterpretation__InterpretationAssignment_1 : ( ruleBasicInterpretation ) ;
    public final void rule__DefaultInterpretation__InterpretationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5503:1: ( ( ruleBasicInterpretation ) )
            // InternalSolverLanguage.g:5504:2: ( ruleBasicInterpretation )
            {
            // InternalSolverLanguage.g:5504:2: ( ruleBasicInterpretation )
            // InternalSolverLanguage.g:5505:3: ruleBasicInterpretation
            {
             before(grammarAccess.getDefaultInterpretationAccess().getInterpretationBasicInterpretationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicInterpretation();

            state._fsp--;

             after(grammarAccess.getDefaultInterpretationAccess().getInterpretationBasicInterpretationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DefaultInterpretation__InterpretationAssignment_1"


    // $ANTLR start "rule__ClassInterpretation__AbstractAssignment_0"
    // InternalSolverLanguage.g:5514:1: rule__ClassInterpretation__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ClassInterpretation__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5518:1: ( ( ( 'abstract' ) ) )
            // InternalSolverLanguage.g:5519:2: ( ( 'abstract' ) )
            {
            // InternalSolverLanguage.g:5519:2: ( ( 'abstract' ) )
            // InternalSolverLanguage.g:5520:3: ( 'abstract' )
            {
             before(grammarAccess.getClassInterpretationAccess().getAbstractAbstractKeyword_0_0()); 
            // InternalSolverLanguage.g:5521:3: ( 'abstract' )
            // InternalSolverLanguage.g:5522:4: 'abstract'
            {
             before(grammarAccess.getClassInterpretationAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getClassInterpretationAccess().getAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getClassInterpretationAccess().getAbstractAbstractKeyword_0_0()); 

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
    // $ANTLR end "rule__ClassInterpretation__AbstractAssignment_0"


    // $ANTLR start "rule__ClassInterpretation__SymbolAssignment_2"
    // InternalSolverLanguage.g:5533:1: rule__ClassInterpretation__SymbolAssignment_2 : ( ruleModelSymbol ) ;
    public final void rule__ClassInterpretation__SymbolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5537:1: ( ( ruleModelSymbol ) )
            // InternalSolverLanguage.g:5538:2: ( ruleModelSymbol )
            {
            // InternalSolverLanguage.g:5538:2: ( ruleModelSymbol )
            // InternalSolverLanguage.g:5539:3: ruleModelSymbol
            {
             before(grammarAccess.getClassInterpretationAccess().getSymbolModelSymbolParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleModelSymbol();

            state._fsp--;

             after(grammarAccess.getClassInterpretationAccess().getSymbolModelSymbolParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ClassInterpretation__SymbolAssignment_2"


    // $ANTLR start "rule__ClassInterpretation__SupertypesAssignment_3_1"
    // InternalSolverLanguage.g:5548:1: rule__ClassInterpretation__SupertypesAssignment_3_1 : ( ruleModelSymbol ) ;
    public final void rule__ClassInterpretation__SupertypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5552:1: ( ( ruleModelSymbol ) )
            // InternalSolverLanguage.g:5553:2: ( ruleModelSymbol )
            {
            // InternalSolverLanguage.g:5553:2: ( ruleModelSymbol )
            // InternalSolverLanguage.g:5554:3: ruleModelSymbol
            {
             before(grammarAccess.getClassInterpretationAccess().getSupertypesModelSymbolParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModelSymbol();

            state._fsp--;

             after(grammarAccess.getClassInterpretationAccess().getSupertypesModelSymbolParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ClassInterpretation__SupertypesAssignment_3_1"


    // $ANTLR start "rule__ClassInterpretation__FieltAssignment_5"
    // InternalSolverLanguage.g:5563:1: rule__ClassInterpretation__FieltAssignment_5 : ( ruleFieldRelationInterpretation ) ;
    public final void rule__ClassInterpretation__FieltAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5567:1: ( ( ruleFieldRelationInterpretation ) )
            // InternalSolverLanguage.g:5568:2: ( ruleFieldRelationInterpretation )
            {
            // InternalSolverLanguage.g:5568:2: ( ruleFieldRelationInterpretation )
            // InternalSolverLanguage.g:5569:3: ruleFieldRelationInterpretation
            {
             before(grammarAccess.getClassInterpretationAccess().getFieltFieldRelationInterpretationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldRelationInterpretation();

            state._fsp--;

             after(grammarAccess.getClassInterpretationAccess().getFieltFieldRelationInterpretationParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ClassInterpretation__FieltAssignment_5"


    // $ANTLR start "rule__EnumInterpretation__SymbolAssignment_1"
    // InternalSolverLanguage.g:5578:1: rule__EnumInterpretation__SymbolAssignment_1 : ( ruleModelSymbol ) ;
    public final void rule__EnumInterpretation__SymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5582:1: ( ( ruleModelSymbol ) )
            // InternalSolverLanguage.g:5583:2: ( ruleModelSymbol )
            {
            // InternalSolverLanguage.g:5583:2: ( ruleModelSymbol )
            // InternalSolverLanguage.g:5584:3: ruleModelSymbol
            {
             before(grammarAccess.getEnumInterpretationAccess().getSymbolModelSymbolParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModelSymbol();

            state._fsp--;

             after(grammarAccess.getEnumInterpretationAccess().getSymbolModelSymbolParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EnumInterpretation__SymbolAssignment_1"


    // $ANTLR start "rule__EnumInterpretation__ObjectsAssignment_3"
    // InternalSolverLanguage.g:5593:1: rule__EnumInterpretation__ObjectsAssignment_3 : ( ruleNamedObject ) ;
    public final void rule__EnumInterpretation__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5597:1: ( ( ruleNamedObject ) )
            // InternalSolverLanguage.g:5598:2: ( ruleNamedObject )
            {
            // InternalSolverLanguage.g:5598:2: ( ruleNamedObject )
            // InternalSolverLanguage.g:5599:3: ruleNamedObject
            {
             before(grammarAccess.getEnumInterpretationAccess().getObjectsNamedObjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNamedObject();

            state._fsp--;

             after(grammarAccess.getEnumInterpretationAccess().getObjectsNamedObjectParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__EnumInterpretation__ObjectsAssignment_3"


    // $ANTLR start "rule__FieldRelationInterpretation__ContainmentAssignment_0"
    // InternalSolverLanguage.g:5608:1: rule__FieldRelationInterpretation__ContainmentAssignment_0 : ( ( 'containment' ) ) ;
    public final void rule__FieldRelationInterpretation__ContainmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5612:1: ( ( ( 'containment' ) ) )
            // InternalSolverLanguage.g:5613:2: ( ( 'containment' ) )
            {
            // InternalSolverLanguage.g:5613:2: ( ( 'containment' ) )
            // InternalSolverLanguage.g:5614:3: ( 'containment' )
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getContainmentContainmentKeyword_0_0()); 
            // InternalSolverLanguage.g:5615:3: ( 'containment' )
            // InternalSolverLanguage.g:5616:4: 'containment'
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getContainmentContainmentKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFieldRelationInterpretationAccess().getContainmentContainmentKeyword_0_0()); 

            }

             after(grammarAccess.getFieldRelationInterpretationAccess().getContainmentContainmentKeyword_0_0()); 

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
    // $ANTLR end "rule__FieldRelationInterpretation__ContainmentAssignment_0"


    // $ANTLR start "rule__FieldRelationInterpretation__SymbolAssignment_1"
    // InternalSolverLanguage.g:5627:1: rule__FieldRelationInterpretation__SymbolAssignment_1 : ( ruleModelSymbol ) ;
    public final void rule__FieldRelationInterpretation__SymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5631:1: ( ( ruleModelSymbol ) )
            // InternalSolverLanguage.g:5632:2: ( ruleModelSymbol )
            {
            // InternalSolverLanguage.g:5632:2: ( ruleModelSymbol )
            // InternalSolverLanguage.g:5633:3: ruleModelSymbol
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getSymbolModelSymbolParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModelSymbol();

            state._fsp--;

             after(grammarAccess.getFieldRelationInterpretationAccess().getSymbolModelSymbolParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FieldRelationInterpretation__SymbolAssignment_1"


    // $ANTLR start "rule__FieldRelationInterpretation__MultiplicityAssignment_3"
    // InternalSolverLanguage.g:5642:1: rule__FieldRelationInterpretation__MultiplicityAssignment_3 : ( ruleMultiplicityDefinition ) ;
    public final void rule__FieldRelationInterpretation__MultiplicityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5646:1: ( ( ruleMultiplicityDefinition ) )
            // InternalSolverLanguage.g:5647:2: ( ruleMultiplicityDefinition )
            {
            // InternalSolverLanguage.g:5647:2: ( ruleMultiplicityDefinition )
            // InternalSolverLanguage.g:5648:3: ruleMultiplicityDefinition
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getMultiplicityMultiplicityDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicityDefinition();

            state._fsp--;

             after(grammarAccess.getFieldRelationInterpretationAccess().getMultiplicityMultiplicityDefinitionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__FieldRelationInterpretation__MultiplicityAssignment_3"


    // $ANTLR start "rule__FieldRelationInterpretation__TargetAssignment_4"
    // InternalSolverLanguage.g:5657:1: rule__FieldRelationInterpretation__TargetAssignment_4 : ( ruleSymbol ) ;
    public final void rule__FieldRelationInterpretation__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5661:1: ( ( ruleSymbol ) )
            // InternalSolverLanguage.g:5662:2: ( ruleSymbol )
            {
            // InternalSolverLanguage.g:5662:2: ( ruleSymbol )
            // InternalSolverLanguage.g:5663:3: ruleSymbol
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getTargetSymbolParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getFieldRelationInterpretationAccess().getTargetSymbolParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__FieldRelationInterpretation__TargetAssignment_4"


    // $ANTLR start "rule__GlobalRelationInterpretation__ContainmentAssignment_0"
    // InternalSolverLanguage.g:5672:1: rule__GlobalRelationInterpretation__ContainmentAssignment_0 : ( ( 'containment' ) ) ;
    public final void rule__GlobalRelationInterpretation__ContainmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5676:1: ( ( ( 'containment' ) ) )
            // InternalSolverLanguage.g:5677:2: ( ( 'containment' ) )
            {
            // InternalSolverLanguage.g:5677:2: ( ( 'containment' ) )
            // InternalSolverLanguage.g:5678:3: ( 'containment' )
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getContainmentContainmentKeyword_0_0()); 
            // InternalSolverLanguage.g:5679:3: ( 'containment' )
            // InternalSolverLanguage.g:5680:4: 'containment'
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getContainmentContainmentKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getGlobalRelationInterpretationAccess().getContainmentContainmentKeyword_0_0()); 

            }

             after(grammarAccess.getGlobalRelationInterpretationAccess().getContainmentContainmentKeyword_0_0()); 

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
    // $ANTLR end "rule__GlobalRelationInterpretation__ContainmentAssignment_0"


    // $ANTLR start "rule__GlobalRelationInterpretation__SymbolAssignment_2"
    // InternalSolverLanguage.g:5691:1: rule__GlobalRelationInterpretation__SymbolAssignment_2 : ( ruleModelSymbol ) ;
    public final void rule__GlobalRelationInterpretation__SymbolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5695:1: ( ( ruleModelSymbol ) )
            // InternalSolverLanguage.g:5696:2: ( ruleModelSymbol )
            {
            // InternalSolverLanguage.g:5696:2: ( ruleModelSymbol )
            // InternalSolverLanguage.g:5697:3: ruleModelSymbol
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getSymbolModelSymbolParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleModelSymbol();

            state._fsp--;

             after(grammarAccess.getGlobalRelationInterpretationAccess().getSymbolModelSymbolParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__GlobalRelationInterpretation__SymbolAssignment_2"


    // $ANTLR start "rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4"
    // InternalSolverLanguage.g:5706:1: rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4 : ( ruleMultiplicityDefinition ) ;
    public final void rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5710:1: ( ( ruleMultiplicityDefinition ) )
            // InternalSolverLanguage.g:5711:2: ( ruleMultiplicityDefinition )
            {
            // InternalSolverLanguage.g:5711:2: ( ruleMultiplicityDefinition )
            // InternalSolverLanguage.g:5712:3: ruleMultiplicityDefinition
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getSourceMultiplicityMultiplicityDefinitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicityDefinition();

            state._fsp--;

             after(grammarAccess.getGlobalRelationInterpretationAccess().getSourceMultiplicityMultiplicityDefinitionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4"


    // $ANTLR start "rule__GlobalRelationInterpretation__SourceAssignment_5"
    // InternalSolverLanguage.g:5721:1: rule__GlobalRelationInterpretation__SourceAssignment_5 : ( ruleSymbol ) ;
    public final void rule__GlobalRelationInterpretation__SourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5725:1: ( ( ruleSymbol ) )
            // InternalSolverLanguage.g:5726:2: ( ruleSymbol )
            {
            // InternalSolverLanguage.g:5726:2: ( ruleSymbol )
            // InternalSolverLanguage.g:5727:3: ruleSymbol
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getSourceSymbolParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getGlobalRelationInterpretationAccess().getSourceSymbolParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__GlobalRelationInterpretation__SourceAssignment_5"


    // $ANTLR start "rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6"
    // InternalSolverLanguage.g:5736:1: rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6 : ( ruleMultiplicityDefinition ) ;
    public final void rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5740:1: ( ( ruleMultiplicityDefinition ) )
            // InternalSolverLanguage.g:5741:2: ( ruleMultiplicityDefinition )
            {
            // InternalSolverLanguage.g:5741:2: ( ruleMultiplicityDefinition )
            // InternalSolverLanguage.g:5742:3: ruleMultiplicityDefinition
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getTargetMultiplicityMultiplicityDefinitionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicityDefinition();

            state._fsp--;

             after(grammarAccess.getGlobalRelationInterpretationAccess().getTargetMultiplicityMultiplicityDefinitionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6"


    // $ANTLR start "rule__GlobalRelationInterpretation__TargetAssignment_7"
    // InternalSolverLanguage.g:5751:1: rule__GlobalRelationInterpretation__TargetAssignment_7 : ( ruleSymbol ) ;
    public final void rule__GlobalRelationInterpretation__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5755:1: ( ( ruleSymbol ) )
            // InternalSolverLanguage.g:5756:2: ( ruleSymbol )
            {
            // InternalSolverLanguage.g:5756:2: ( ruleSymbol )
            // InternalSolverLanguage.g:5757:3: ruleSymbol
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getTargetSymbolParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getGlobalRelationInterpretationAccess().getTargetSymbolParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__GlobalRelationInterpretation__TargetAssignment_7"


    // $ANTLR start "rule__MultiplicityDefinition__LowerAssignment_0"
    // InternalSolverLanguage.g:5766:1: rule__MultiplicityDefinition__LowerAssignment_0 : ( RULE_INT ) ;
    public final void rule__MultiplicityDefinition__LowerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5770:1: ( ( RULE_INT ) )
            // InternalSolverLanguage.g:5771:2: ( RULE_INT )
            {
            // InternalSolverLanguage.g:5771:2: ( RULE_INT )
            // InternalSolverLanguage.g:5772:3: RULE_INT
            {
             before(grammarAccess.getMultiplicityDefinitionAccess().getLowerINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMultiplicityDefinitionAccess().getLowerINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__MultiplicityDefinition__LowerAssignment_0"


    // $ANTLR start "rule__MultiplicityDefinition__UpperAssignment_2_0"
    // InternalSolverLanguage.g:5781:1: rule__MultiplicityDefinition__UpperAssignment_2_0 : ( RULE_INT ) ;
    public final void rule__MultiplicityDefinition__UpperAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5785:1: ( ( RULE_INT ) )
            // InternalSolverLanguage.g:5786:2: ( RULE_INT )
            {
            // InternalSolverLanguage.g:5786:2: ( RULE_INT )
            // InternalSolverLanguage.g:5787:3: RULE_INT
            {
             before(grammarAccess.getMultiplicityDefinitionAccess().getUpperINTTerminalRuleCall_2_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMultiplicityDefinitionAccess().getUpperINTTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__MultiplicityDefinition__UpperAssignment_2_0"


    // $ANTLR start "rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1"
    // InternalSolverLanguage.g:5796:1: rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1 : ( ( '*' ) ) ;
    public final void rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5800:1: ( ( ( '*' ) ) )
            // InternalSolverLanguage.g:5801:2: ( ( '*' ) )
            {
            // InternalSolverLanguage.g:5801:2: ( ( '*' ) )
            // InternalSolverLanguage.g:5802:3: ( '*' )
            {
             before(grammarAccess.getMultiplicityDefinitionAccess().getUnlimitedUpperAsteriskKeyword_2_1_0()); 
            // InternalSolverLanguage.g:5803:3: ( '*' )
            // InternalSolverLanguage.g:5804:4: '*'
            {
             before(grammarAccess.getMultiplicityDefinitionAccess().getUnlimitedUpperAsteriskKeyword_2_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMultiplicityDefinitionAccess().getUnlimitedUpperAsteriskKeyword_2_1_0()); 

            }

             after(grammarAccess.getMultiplicityDefinitionAccess().getUnlimitedUpperAsteriskKeyword_2_1_0()); 

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
    // $ANTLR end "rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\5\1\21\2\uffff\1\4\2\21\1\4\1\21";
    static final String dfa_3s = "\1\51\1\34\2\uffff\1\37\1\24\1\34\1\37\1\24";
    static final String dfa_4s = "\2\uffff\1\1\1\2\5\uffff";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\12\uffff\1\3\4\uffff\6\2\5\uffff\2\2\3\uffff\2\2\1\uffff\2\2",
            "\1\2\1\4\11\uffff\1\3",
            "",
            "",
            "\1\2\1\5\1\2\4\uffff\3\2\3\uffff\1\2\1\uffff\1\6\7\uffff\1\2\3\uffff\1\2",
            "\1\3\1\uffff\1\6\1\7",
            "\1\2\12\uffff\1\3",
            "\1\2\1\10\1\2\4\uffff\3\2\3\uffff\1\2\11\uffff\1\2\3\uffff\1\2",
            "\1\3\1\uffff\1\6\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1152:1: rule__Statement__Alternatives : ( ( ruleInterpretation ) | ( rulePredicate ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000036307E10022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000C0002022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000019800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000880A3870L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000088023870L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000036307E10020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000C0003820L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000007E00020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040002020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008183870L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000008003870L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000C0002020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020800000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000022L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000007E00030L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000036307E00020L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000080000010L});

}