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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'true'", "'-'", "'.'", "'unknown'", "'error'", "'('", "')'", "':'", "'exists'", "'equals'", "'bool'", "'int'", "'real'", "'string'", "'\\''", "'predicate'", "'|'", "'+'", "'*'", "'default'", "'class'", "'{'", "'}'", "'extends'", "'enum'", "'relation'", "'..'", "'abstract'", "'containment'"
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

                if ( (LA1_0==RULE_ID||LA1_0==16||(LA1_0>=20 && LA1_0<=25)||LA1_0==27||LA1_0==31||LA1_0==36||(LA1_0>=39 && LA1_0<=40)) ) {
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
    // InternalSolverLanguage.g:737:1: rulePredicate : ( ( rule__Predicate__Alternatives ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:741:2: ( ( ( rule__Predicate__Alternatives ) ) )
            // InternalSolverLanguage.g:742:2: ( ( rule__Predicate__Alternatives ) )
            {
            // InternalSolverLanguage.g:742:2: ( ( rule__Predicate__Alternatives ) )
            // InternalSolverLanguage.g:743:3: ( rule__Predicate__Alternatives )
            {
             before(grammarAccess.getPredicateAccess().getAlternatives()); 
            // InternalSolverLanguage.g:744:3: ( rule__Predicate__Alternatives )
            // InternalSolverLanguage.g:744:4: rule__Predicate__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePredicateSymbol"
    // InternalSolverLanguage.g:753:1: entryRulePredicateSymbol : rulePredicateSymbol EOF ;
    public final void entryRulePredicateSymbol() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:754:1: ( rulePredicateSymbol EOF )
            // InternalSolverLanguage.g:755:1: rulePredicateSymbol EOF
            {
             before(grammarAccess.getPredicateSymbolRule()); 
            pushFollow(FOLLOW_1);
            rulePredicateSymbol();

            state._fsp--;

             after(grammarAccess.getPredicateSymbolRule()); 
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
    // $ANTLR end "entryRulePredicateSymbol"


    // $ANTLR start "rulePredicateSymbol"
    // InternalSolverLanguage.g:762:1: rulePredicateSymbol : ( ( rule__PredicateSymbol__Group__0 ) ) ;
    public final void rulePredicateSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:766:2: ( ( ( rule__PredicateSymbol__Group__0 ) ) )
            // InternalSolverLanguage.g:767:2: ( ( rule__PredicateSymbol__Group__0 ) )
            {
            // InternalSolverLanguage.g:767:2: ( ( rule__PredicateSymbol__Group__0 ) )
            // InternalSolverLanguage.g:768:3: ( rule__PredicateSymbol__Group__0 )
            {
             before(grammarAccess.getPredicateSymbolAccess().getGroup()); 
            // InternalSolverLanguage.g:769:3: ( rule__PredicateSymbol__Group__0 )
            // InternalSolverLanguage.g:769:4: rule__PredicateSymbol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateSymbol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateSymbolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicateSymbol"


    // $ANTLR start "entryRuleErrorPredicate"
    // InternalSolverLanguage.g:778:1: entryRuleErrorPredicate : ruleErrorPredicate EOF ;
    public final void entryRuleErrorPredicate() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:779:1: ( ruleErrorPredicate EOF )
            // InternalSolverLanguage.g:780:1: ruleErrorPredicate EOF
            {
             before(grammarAccess.getErrorPredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleErrorPredicate();

            state._fsp--;

             after(grammarAccess.getErrorPredicateRule()); 
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
    // $ANTLR end "entryRuleErrorPredicate"


    // $ANTLR start "ruleErrorPredicate"
    // InternalSolverLanguage.g:787:1: ruleErrorPredicate : ( ( rule__ErrorPredicate__Group__0 ) ) ;
    public final void ruleErrorPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:791:2: ( ( ( rule__ErrorPredicate__Group__0 ) ) )
            // InternalSolverLanguage.g:792:2: ( ( rule__ErrorPredicate__Group__0 ) )
            {
            // InternalSolverLanguage.g:792:2: ( ( rule__ErrorPredicate__Group__0 ) )
            // InternalSolverLanguage.g:793:3: ( rule__ErrorPredicate__Group__0 )
            {
             before(grammarAccess.getErrorPredicateAccess().getGroup()); 
            // InternalSolverLanguage.g:794:3: ( rule__ErrorPredicate__Group__0 )
            // InternalSolverLanguage.g:794:4: rule__ErrorPredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getErrorPredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleErrorPredicate"


    // $ANTLR start "entryRuleParameter"
    // InternalSolverLanguage.g:803:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:804:1: ( ruleParameter EOF )
            // InternalSolverLanguage.g:805:1: ruleParameter EOF
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
    // InternalSolverLanguage.g:812:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:816:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalSolverLanguage.g:817:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalSolverLanguage.g:817:2: ( ( rule__Parameter__Group__0 ) )
            // InternalSolverLanguage.g:818:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalSolverLanguage.g:819:3: ( rule__Parameter__Group__0 )
            // InternalSolverLanguage.g:819:4: rule__Parameter__Group__0
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
    // InternalSolverLanguage.g:828:1: entryRulePatternBody : rulePatternBody EOF ;
    public final void entryRulePatternBody() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:829:1: ( rulePatternBody EOF )
            // InternalSolverLanguage.g:830:1: rulePatternBody EOF
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
    // InternalSolverLanguage.g:837:1: rulePatternBody : ( ( rule__PatternBody__Group__0 ) ) ;
    public final void rulePatternBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:841:2: ( ( ( rule__PatternBody__Group__0 ) ) )
            // InternalSolverLanguage.g:842:2: ( ( rule__PatternBody__Group__0 ) )
            {
            // InternalSolverLanguage.g:842:2: ( ( rule__PatternBody__Group__0 ) )
            // InternalSolverLanguage.g:843:3: ( rule__PatternBody__Group__0 )
            {
             before(grammarAccess.getPatternBodyAccess().getGroup()); 
            // InternalSolverLanguage.g:844:3: ( rule__PatternBody__Group__0 )
            // InternalSolverLanguage.g:844:4: rule__PatternBody__Group__0
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
    // InternalSolverLanguage.g:853:1: entryRulePolarity : rulePolarity EOF ;
    public final void entryRulePolarity() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:854:1: ( rulePolarity EOF )
            // InternalSolverLanguage.g:855:1: rulePolarity EOF
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
    // InternalSolverLanguage.g:862:1: rulePolarity : ( ( rule__Polarity__Alternatives ) ) ;
    public final void rulePolarity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:866:2: ( ( ( rule__Polarity__Alternatives ) ) )
            // InternalSolverLanguage.g:867:2: ( ( rule__Polarity__Alternatives ) )
            {
            // InternalSolverLanguage.g:867:2: ( ( rule__Polarity__Alternatives ) )
            // InternalSolverLanguage.g:868:3: ( rule__Polarity__Alternatives )
            {
             before(grammarAccess.getPolarityAccess().getAlternatives()); 
            // InternalSolverLanguage.g:869:3: ( rule__Polarity__Alternatives )
            // InternalSolverLanguage.g:869:4: rule__Polarity__Alternatives
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
    // InternalSolverLanguage.g:878:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:879:1: ( ruleConstraint EOF )
            // InternalSolverLanguage.g:880:1: ruleConstraint EOF
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
    // InternalSolverLanguage.g:887:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:891:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalSolverLanguage.g:892:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalSolverLanguage.g:892:2: ( ( rule__Constraint__Group__0 ) )
            // InternalSolverLanguage.g:893:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalSolverLanguage.g:894:3: ( rule__Constraint__Group__0 )
            // InternalSolverLanguage.g:894:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
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
    // InternalSolverLanguage.g:903:1: entryRuleClosureType : ruleClosureType EOF ;
    public final void entryRuleClosureType() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:904:1: ( ruleClosureType EOF )
            // InternalSolverLanguage.g:905:1: ruleClosureType EOF
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
    // InternalSolverLanguage.g:912:1: ruleClosureType : ( ( rule__ClosureType__Alternatives ) ) ;
    public final void ruleClosureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:916:2: ( ( ( rule__ClosureType__Alternatives ) ) )
            // InternalSolverLanguage.g:917:2: ( ( rule__ClosureType__Alternatives ) )
            {
            // InternalSolverLanguage.g:917:2: ( ( rule__ClosureType__Alternatives ) )
            // InternalSolverLanguage.g:918:3: ( rule__ClosureType__Alternatives )
            {
             before(grammarAccess.getClosureTypeAccess().getAlternatives()); 
            // InternalSolverLanguage.g:919:3: ( rule__ClosureType__Alternatives )
            // InternalSolverLanguage.g:919:4: rule__ClosureType__Alternatives
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
    // InternalSolverLanguage.g:928:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:929:1: ( ruleLiteral EOF )
            // InternalSolverLanguage.g:930:1: ruleLiteral EOF
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
    // InternalSolverLanguage.g:937:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:941:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalSolverLanguage.g:942:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalSolverLanguage.g:942:2: ( ( rule__Literal__Alternatives ) )
            // InternalSolverLanguage.g:943:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalSolverLanguage.g:944:3: ( rule__Literal__Alternatives )
            // InternalSolverLanguage.g:944:4: rule__Literal__Alternatives
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
    // InternalSolverLanguage.g:953:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:954:1: ( ruleVariable EOF )
            // InternalSolverLanguage.g:955:1: ruleVariable EOF
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
    // InternalSolverLanguage.g:962:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:966:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalSolverLanguage.g:967:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalSolverLanguage.g:967:2: ( ( rule__Variable__NameAssignment ) )
            // InternalSolverLanguage.g:968:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalSolverLanguage.g:969:3: ( rule__Variable__NameAssignment )
            // InternalSolverLanguage.g:969:4: rule__Variable__NameAssignment
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
    // InternalSolverLanguage.g:978:1: entryRuleAllInstances : ruleAllInstances EOF ;
    public final void entryRuleAllInstances() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:979:1: ( ruleAllInstances EOF )
            // InternalSolverLanguage.g:980:1: ruleAllInstances EOF
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
    // InternalSolverLanguage.g:987:1: ruleAllInstances : ( ( rule__AllInstances__Group__0 ) ) ;
    public final void ruleAllInstances() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:991:2: ( ( ( rule__AllInstances__Group__0 ) ) )
            // InternalSolverLanguage.g:992:2: ( ( rule__AllInstances__Group__0 ) )
            {
            // InternalSolverLanguage.g:992:2: ( ( rule__AllInstances__Group__0 ) )
            // InternalSolverLanguage.g:993:3: ( rule__AllInstances__Group__0 )
            {
             before(grammarAccess.getAllInstancesAccess().getGroup()); 
            // InternalSolverLanguage.g:994:3: ( rule__AllInstances__Group__0 )
            // InternalSolverLanguage.g:994:4: rule__AllInstances__Group__0
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
    // InternalSolverLanguage.g:1003:1: entryRuleAllObjects : ruleAllObjects EOF ;
    public final void entryRuleAllObjects() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:1004:1: ( ruleAllObjects EOF )
            // InternalSolverLanguage.g:1005:1: ruleAllObjects EOF
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
    // InternalSolverLanguage.g:1012:1: ruleAllObjects : ( ( rule__AllObjects__Group__0 ) ) ;
    public final void ruleAllObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1016:2: ( ( ( rule__AllObjects__Group__0 ) ) )
            // InternalSolverLanguage.g:1017:2: ( ( rule__AllObjects__Group__0 ) )
            {
            // InternalSolverLanguage.g:1017:2: ( ( rule__AllObjects__Group__0 ) )
            // InternalSolverLanguage.g:1018:3: ( rule__AllObjects__Group__0 )
            {
             before(grammarAccess.getAllObjectsAccess().getGroup()); 
            // InternalSolverLanguage.g:1019:3: ( rule__AllObjects__Group__0 )
            // InternalSolverLanguage.g:1019:4: rule__AllObjects__Group__0
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
    // InternalSolverLanguage.g:1028:1: entryRuleDefaultInterpretation : ruleDefaultInterpretation EOF ;
    public final void entryRuleDefaultInterpretation() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:1029:1: ( ruleDefaultInterpretation EOF )
            // InternalSolverLanguage.g:1030:1: ruleDefaultInterpretation EOF
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
    // InternalSolverLanguage.g:1037:1: ruleDefaultInterpretation : ( ( rule__DefaultInterpretation__Group__0 ) ) ;
    public final void ruleDefaultInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1041:2: ( ( ( rule__DefaultInterpretation__Group__0 ) ) )
            // InternalSolverLanguage.g:1042:2: ( ( rule__DefaultInterpretation__Group__0 ) )
            {
            // InternalSolverLanguage.g:1042:2: ( ( rule__DefaultInterpretation__Group__0 ) )
            // InternalSolverLanguage.g:1043:3: ( rule__DefaultInterpretation__Group__0 )
            {
             before(grammarAccess.getDefaultInterpretationAccess().getGroup()); 
            // InternalSolverLanguage.g:1044:3: ( rule__DefaultInterpretation__Group__0 )
            // InternalSolverLanguage.g:1044:4: rule__DefaultInterpretation__Group__0
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
    // InternalSolverLanguage.g:1053:1: entryRuleCDInterpretation : ruleCDInterpretation EOF ;
    public final void entryRuleCDInterpretation() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:1054:1: ( ruleCDInterpretation EOF )
            // InternalSolverLanguage.g:1055:1: ruleCDInterpretation EOF
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
    // InternalSolverLanguage.g:1062:1: ruleCDInterpretation : ( ( rule__CDInterpretation__Alternatives ) ) ;
    public final void ruleCDInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1066:2: ( ( ( rule__CDInterpretation__Alternatives ) ) )
            // InternalSolverLanguage.g:1067:2: ( ( rule__CDInterpretation__Alternatives ) )
            {
            // InternalSolverLanguage.g:1067:2: ( ( rule__CDInterpretation__Alternatives ) )
            // InternalSolverLanguage.g:1068:3: ( rule__CDInterpretation__Alternatives )
            {
             before(grammarAccess.getCDInterpretationAccess().getAlternatives()); 
            // InternalSolverLanguage.g:1069:3: ( rule__CDInterpretation__Alternatives )
            // InternalSolverLanguage.g:1069:4: rule__CDInterpretation__Alternatives
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
    // InternalSolverLanguage.g:1078:1: entryRuleClassInterpretation : ruleClassInterpretation EOF ;
    public final void entryRuleClassInterpretation() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:1079:1: ( ruleClassInterpretation EOF )
            // InternalSolverLanguage.g:1080:1: ruleClassInterpretation EOF
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
    // InternalSolverLanguage.g:1087:1: ruleClassInterpretation : ( ( rule__ClassInterpretation__Group__0 ) ) ;
    public final void ruleClassInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1091:2: ( ( ( rule__ClassInterpretation__Group__0 ) ) )
            // InternalSolverLanguage.g:1092:2: ( ( rule__ClassInterpretation__Group__0 ) )
            {
            // InternalSolverLanguage.g:1092:2: ( ( rule__ClassInterpretation__Group__0 ) )
            // InternalSolverLanguage.g:1093:3: ( rule__ClassInterpretation__Group__0 )
            {
             before(grammarAccess.getClassInterpretationAccess().getGroup()); 
            // InternalSolverLanguage.g:1094:3: ( rule__ClassInterpretation__Group__0 )
            // InternalSolverLanguage.g:1094:4: rule__ClassInterpretation__Group__0
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
    // InternalSolverLanguage.g:1103:1: entryRuleEnumInterpretation : ruleEnumInterpretation EOF ;
    public final void entryRuleEnumInterpretation() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:1104:1: ( ruleEnumInterpretation EOF )
            // InternalSolverLanguage.g:1105:1: ruleEnumInterpretation EOF
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
    // InternalSolverLanguage.g:1112:1: ruleEnumInterpretation : ( ( rule__EnumInterpretation__Group__0 ) ) ;
    public final void ruleEnumInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1116:2: ( ( ( rule__EnumInterpretation__Group__0 ) ) )
            // InternalSolverLanguage.g:1117:2: ( ( rule__EnumInterpretation__Group__0 ) )
            {
            // InternalSolverLanguage.g:1117:2: ( ( rule__EnumInterpretation__Group__0 ) )
            // InternalSolverLanguage.g:1118:3: ( rule__EnumInterpretation__Group__0 )
            {
             before(grammarAccess.getEnumInterpretationAccess().getGroup()); 
            // InternalSolverLanguage.g:1119:3: ( rule__EnumInterpretation__Group__0 )
            // InternalSolverLanguage.g:1119:4: rule__EnumInterpretation__Group__0
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
    // InternalSolverLanguage.g:1128:1: entryRuleFieldRelationInterpretation : ruleFieldRelationInterpretation EOF ;
    public final void entryRuleFieldRelationInterpretation() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:1129:1: ( ruleFieldRelationInterpretation EOF )
            // InternalSolverLanguage.g:1130:1: ruleFieldRelationInterpretation EOF
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
    // InternalSolverLanguage.g:1137:1: ruleFieldRelationInterpretation : ( ( rule__FieldRelationInterpretation__Group__0 ) ) ;
    public final void ruleFieldRelationInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1141:2: ( ( ( rule__FieldRelationInterpretation__Group__0 ) ) )
            // InternalSolverLanguage.g:1142:2: ( ( rule__FieldRelationInterpretation__Group__0 ) )
            {
            // InternalSolverLanguage.g:1142:2: ( ( rule__FieldRelationInterpretation__Group__0 ) )
            // InternalSolverLanguage.g:1143:3: ( rule__FieldRelationInterpretation__Group__0 )
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getGroup()); 
            // InternalSolverLanguage.g:1144:3: ( rule__FieldRelationInterpretation__Group__0 )
            // InternalSolverLanguage.g:1144:4: rule__FieldRelationInterpretation__Group__0
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
    // InternalSolverLanguage.g:1153:1: entryRuleGlobalRelationInterpretation : ruleGlobalRelationInterpretation EOF ;
    public final void entryRuleGlobalRelationInterpretation() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:1154:1: ( ruleGlobalRelationInterpretation EOF )
            // InternalSolverLanguage.g:1155:1: ruleGlobalRelationInterpretation EOF
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
    // InternalSolverLanguage.g:1162:1: ruleGlobalRelationInterpretation : ( ( rule__GlobalRelationInterpretation__Group__0 ) ) ;
    public final void ruleGlobalRelationInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1166:2: ( ( ( rule__GlobalRelationInterpretation__Group__0 ) ) )
            // InternalSolverLanguage.g:1167:2: ( ( rule__GlobalRelationInterpretation__Group__0 ) )
            {
            // InternalSolverLanguage.g:1167:2: ( ( rule__GlobalRelationInterpretation__Group__0 ) )
            // InternalSolverLanguage.g:1168:3: ( rule__GlobalRelationInterpretation__Group__0 )
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getGroup()); 
            // InternalSolverLanguage.g:1169:3: ( rule__GlobalRelationInterpretation__Group__0 )
            // InternalSolverLanguage.g:1169:4: rule__GlobalRelationInterpretation__Group__0
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
    // InternalSolverLanguage.g:1178:1: entryRuleMultiplicityDefinition : ruleMultiplicityDefinition EOF ;
    public final void entryRuleMultiplicityDefinition() throws RecognitionException {
        try {
            // InternalSolverLanguage.g:1179:1: ( ruleMultiplicityDefinition EOF )
            // InternalSolverLanguage.g:1180:1: ruleMultiplicityDefinition EOF
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
    // InternalSolverLanguage.g:1187:1: ruleMultiplicityDefinition : ( ( rule__MultiplicityDefinition__Group__0 ) ) ;
    public final void ruleMultiplicityDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1191:2: ( ( ( rule__MultiplicityDefinition__Group__0 ) ) )
            // InternalSolverLanguage.g:1192:2: ( ( rule__MultiplicityDefinition__Group__0 ) )
            {
            // InternalSolverLanguage.g:1192:2: ( ( rule__MultiplicityDefinition__Group__0 ) )
            // InternalSolverLanguage.g:1193:3: ( rule__MultiplicityDefinition__Group__0 )
            {
             before(grammarAccess.getMultiplicityDefinitionAccess().getGroup()); 
            // InternalSolverLanguage.g:1194:3: ( rule__MultiplicityDefinition__Group__0 )
            // InternalSolverLanguage.g:1194:4: rule__MultiplicityDefinition__Group__0
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
    // InternalSolverLanguage.g:1202:1: rule__Statement__Alternatives : ( ( ruleInterpretation ) | ( rulePredicate ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1206:1: ( ( ruleInterpretation ) | ( rulePredicate ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||(LA2_0>=20 && LA2_0<=25)||LA2_0==31||LA2_0==36||(LA2_0>=39 && LA2_0<=40)) ) {
                alt2=1;
            }
            else if ( (LA2_0==16||LA2_0==27) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSolverLanguage.g:1207:2: ( ruleInterpretation )
                    {
                    // InternalSolverLanguage.g:1207:2: ( ruleInterpretation )
                    // InternalSolverLanguage.g:1208:3: ruleInterpretation
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
                    // InternalSolverLanguage.g:1213:2: ( rulePredicate )
                    {
                    // InternalSolverLanguage.g:1213:2: ( rulePredicate )
                    // InternalSolverLanguage.g:1214:3: rulePredicate
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
    // InternalSolverLanguage.g:1223:1: rule__BooleanValue__Alternatives : ( ( ( rule__BooleanValue__Group_0__0 ) ) | ( ( rule__BooleanValue__Group_1__0 ) ) );
    public final void rule__BooleanValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1227:1: ( ( ( rule__BooleanValue__Group_0__0 ) ) | ( ( rule__BooleanValue__Group_1__0 ) ) )
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
                    // InternalSolverLanguage.g:1228:2: ( ( rule__BooleanValue__Group_0__0 ) )
                    {
                    // InternalSolverLanguage.g:1228:2: ( ( rule__BooleanValue__Group_0__0 ) )
                    // InternalSolverLanguage.g:1229:3: ( rule__BooleanValue__Group_0__0 )
                    {
                     before(grammarAccess.getBooleanValueAccess().getGroup_0()); 
                    // InternalSolverLanguage.g:1230:3: ( rule__BooleanValue__Group_0__0 )
                    // InternalSolverLanguage.g:1230:4: rule__BooleanValue__Group_0__0
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
                    // InternalSolverLanguage.g:1234:2: ( ( rule__BooleanValue__Group_1__0 ) )
                    {
                    // InternalSolverLanguage.g:1234:2: ( ( rule__BooleanValue__Group_1__0 ) )
                    // InternalSolverLanguage.g:1235:3: ( rule__BooleanValue__Group_1__0 )
                    {
                     before(grammarAccess.getBooleanValueAccess().getGroup_1()); 
                    // InternalSolverLanguage.g:1236:3: ( rule__BooleanValue__Group_1__0 )
                    // InternalSolverLanguage.g:1236:4: rule__BooleanValue__Group_1__0
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
    // InternalSolverLanguage.g:1244:1: rule__TruthValue__Alternatives : ( ( ( rule__TruthValue__Group_0__0 ) ) | ( ( rule__TruthValue__Group_1__0 ) ) | ( ( rule__TruthValue__Group_2__0 ) ) | ( ( rule__TruthValue__Group_3__0 ) ) );
    public final void rule__TruthValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1248:1: ( ( ( rule__TruthValue__Group_0__0 ) ) | ( ( rule__TruthValue__Group_1__0 ) ) | ( ( rule__TruthValue__Group_2__0 ) ) | ( ( rule__TruthValue__Group_3__0 ) ) )
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
                    // InternalSolverLanguage.g:1249:2: ( ( rule__TruthValue__Group_0__0 ) )
                    {
                    // InternalSolverLanguage.g:1249:2: ( ( rule__TruthValue__Group_0__0 ) )
                    // InternalSolverLanguage.g:1250:3: ( rule__TruthValue__Group_0__0 )
                    {
                     before(grammarAccess.getTruthValueAccess().getGroup_0()); 
                    // InternalSolverLanguage.g:1251:3: ( rule__TruthValue__Group_0__0 )
                    // InternalSolverLanguage.g:1251:4: rule__TruthValue__Group_0__0
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
                    // InternalSolverLanguage.g:1255:2: ( ( rule__TruthValue__Group_1__0 ) )
                    {
                    // InternalSolverLanguage.g:1255:2: ( ( rule__TruthValue__Group_1__0 ) )
                    // InternalSolverLanguage.g:1256:3: ( rule__TruthValue__Group_1__0 )
                    {
                     before(grammarAccess.getTruthValueAccess().getGroup_1()); 
                    // InternalSolverLanguage.g:1257:3: ( rule__TruthValue__Group_1__0 )
                    // InternalSolverLanguage.g:1257:4: rule__TruthValue__Group_1__0
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
                    // InternalSolverLanguage.g:1261:2: ( ( rule__TruthValue__Group_2__0 ) )
                    {
                    // InternalSolverLanguage.g:1261:2: ( ( rule__TruthValue__Group_2__0 ) )
                    // InternalSolverLanguage.g:1262:3: ( rule__TruthValue__Group_2__0 )
                    {
                     before(grammarAccess.getTruthValueAccess().getGroup_2()); 
                    // InternalSolverLanguage.g:1263:3: ( rule__TruthValue__Group_2__0 )
                    // InternalSolverLanguage.g:1263:4: rule__TruthValue__Group_2__0
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
                    // InternalSolverLanguage.g:1267:2: ( ( rule__TruthValue__Group_3__0 ) )
                    {
                    // InternalSolverLanguage.g:1267:2: ( ( rule__TruthValue__Group_3__0 ) )
                    // InternalSolverLanguage.g:1268:3: ( rule__TruthValue__Group_3__0 )
                    {
                     before(grammarAccess.getTruthValueAccess().getGroup_3()); 
                    // InternalSolverLanguage.g:1269:3: ( rule__TruthValue__Group_3__0 )
                    // InternalSolverLanguage.g:1269:4: rule__TruthValue__Group_3__0
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
    // InternalSolverLanguage.g:1277:1: rule__Interpretation__Alternatives : ( ( ruleBasicInterpretation ) | ( ruleDefaultInterpretation ) | ( ruleCDInterpretation ) );
    public final void rule__Interpretation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1281:1: ( ( ruleBasicInterpretation ) | ( ruleDefaultInterpretation ) | ( ruleCDInterpretation ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt5=1;
                }
                break;
            case 31:
                {
                alt5=2;
                }
                break;
            case 36:
            case 39:
            case 40:
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
                    // InternalSolverLanguage.g:1282:2: ( ruleBasicInterpretation )
                    {
                    // InternalSolverLanguage.g:1282:2: ( ruleBasicInterpretation )
                    // InternalSolverLanguage.g:1283:3: ruleBasicInterpretation
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
                    // InternalSolverLanguage.g:1288:2: ( ruleDefaultInterpretation )
                    {
                    // InternalSolverLanguage.g:1288:2: ( ruleDefaultInterpretation )
                    // InternalSolverLanguage.g:1289:3: ruleDefaultInterpretation
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
                    // InternalSolverLanguage.g:1294:2: ( ruleCDInterpretation )
                    {
                    // InternalSolverLanguage.g:1294:2: ( ruleCDInterpretation )
                    // InternalSolverLanguage.g:1295:3: ruleCDInterpretation
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
    // InternalSolverLanguage.g:1304:1: rule__Symbol__Alternatives : ( ( ruleModelSymbol ) | ( rulePartialitySymbol ) | ( ruleDataSymbol ) );
    public final void rule__Symbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1308:1: ( ( ruleModelSymbol ) | ( rulePartialitySymbol ) | ( ruleDataSymbol ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 20:
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
            case 23:
            case 24:
            case 25:
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
                    // InternalSolverLanguage.g:1309:2: ( ruleModelSymbol )
                    {
                    // InternalSolverLanguage.g:1309:2: ( ruleModelSymbol )
                    // InternalSolverLanguage.g:1310:3: ruleModelSymbol
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
                    // InternalSolverLanguage.g:1315:2: ( rulePartialitySymbol )
                    {
                    // InternalSolverLanguage.g:1315:2: ( rulePartialitySymbol )
                    // InternalSolverLanguage.g:1316:3: rulePartialitySymbol
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
                    // InternalSolverLanguage.g:1321:2: ( ruleDataSymbol )
                    {
                    // InternalSolverLanguage.g:1321:2: ( ruleDataSymbol )
                    // InternalSolverLanguage.g:1322:3: ruleDataSymbol
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
    // InternalSolverLanguage.g:1331:1: rule__PartialitySymbol__Alternatives : ( ( ruleExistSymbol ) | ( ruleEqualsSymbol ) );
    public final void rule__PartialitySymbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1335:1: ( ( ruleExistSymbol ) | ( ruleEqualsSymbol ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSolverLanguage.g:1336:2: ( ruleExistSymbol )
                    {
                    // InternalSolverLanguage.g:1336:2: ( ruleExistSymbol )
                    // InternalSolverLanguage.g:1337:3: ruleExistSymbol
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
                    // InternalSolverLanguage.g:1342:2: ( ruleEqualsSymbol )
                    {
                    // InternalSolverLanguage.g:1342:2: ( ruleEqualsSymbol )
                    // InternalSolverLanguage.g:1343:3: ruleEqualsSymbol
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
    // InternalSolverLanguage.g:1352:1: rule__DataSymbol__Alternatives : ( ( ruleBooleanSymbol ) | ( ruleIntegerSymbol ) | ( ruleRealSymbol ) | ( ruleStringSymbol ) );
    public final void rule__DataSymbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1356:1: ( ( ruleBooleanSymbol ) | ( ruleIntegerSymbol ) | ( ruleRealSymbol ) | ( ruleStringSymbol ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 25:
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
                    // InternalSolverLanguage.g:1357:2: ( ruleBooleanSymbol )
                    {
                    // InternalSolverLanguage.g:1357:2: ( ruleBooleanSymbol )
                    // InternalSolverLanguage.g:1358:3: ruleBooleanSymbol
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
                    // InternalSolverLanguage.g:1363:2: ( ruleIntegerSymbol )
                    {
                    // InternalSolverLanguage.g:1363:2: ( ruleIntegerSymbol )
                    // InternalSolverLanguage.g:1364:3: ruleIntegerSymbol
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
                    // InternalSolverLanguage.g:1369:2: ( ruleRealSymbol )
                    {
                    // InternalSolverLanguage.g:1369:2: ( ruleRealSymbol )
                    // InternalSolverLanguage.g:1370:3: ruleRealSymbol
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
                    // InternalSolverLanguage.g:1375:2: ( ruleStringSymbol )
                    {
                    // InternalSolverLanguage.g:1375:2: ( ruleStringSymbol )
                    // InternalSolverLanguage.g:1376:3: ruleStringSymbol
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
    // InternalSolverLanguage.g:1385:1: rule__ComplexObject__Alternatives : ( ( ruleObject ) | ( ruleAllInstances ) | ( ruleAllObjects ) );
    public final void rule__ComplexObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1389:1: ( ( ruleObject ) | ( ruleAllInstances ) | ( ruleAllObjects ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_ID:
            case RULE_STRING:
            case 11:
            case 12:
            case 13:
            case 26:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 30:
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
                    // InternalSolverLanguage.g:1390:2: ( ruleObject )
                    {
                    // InternalSolverLanguage.g:1390:2: ( ruleObject )
                    // InternalSolverLanguage.g:1391:3: ruleObject
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
                    // InternalSolverLanguage.g:1396:2: ( ruleAllInstances )
                    {
                    // InternalSolverLanguage.g:1396:2: ( ruleAllInstances )
                    // InternalSolverLanguage.g:1397:3: ruleAllInstances
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
                    // InternalSolverLanguage.g:1402:2: ( ruleAllObjects )
                    {
                    // InternalSolverLanguage.g:1402:2: ( ruleAllObjects )
                    // InternalSolverLanguage.g:1403:3: ruleAllObjects
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
    // InternalSolverLanguage.g:1412:1: rule__Object__Alternatives : ( ( ruleNamedObject ) | ( ruleUnnamedObject ) | ( ruleDataObject ) );
    public final void rule__Object__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1416:1: ( ( ruleNamedObject ) | ( ruleUnnamedObject ) | ( ruleDataObject ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 26:
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
                    // InternalSolverLanguage.g:1417:2: ( ruleNamedObject )
                    {
                    // InternalSolverLanguage.g:1417:2: ( ruleNamedObject )
                    // InternalSolverLanguage.g:1418:3: ruleNamedObject
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
                    // InternalSolverLanguage.g:1423:2: ( ruleUnnamedObject )
                    {
                    // InternalSolverLanguage.g:1423:2: ( ruleUnnamedObject )
                    // InternalSolverLanguage.g:1424:3: ruleUnnamedObject
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
                    // InternalSolverLanguage.g:1429:2: ( ruleDataObject )
                    {
                    // InternalSolverLanguage.g:1429:2: ( ruleDataObject )
                    // InternalSolverLanguage.g:1430:3: ruleDataObject
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
    // InternalSolverLanguage.g:1439:1: rule__DataObject__Alternatives : ( ( ruleBooleanObject ) | ( ruleIntObject ) | ( ruleRealObject ) | ( ruleStringObject ) );
    public final void rule__DataObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1443:1: ( ( ruleBooleanObject ) | ( ruleIntObject ) | ( ruleRealObject ) | ( ruleStringObject ) )
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

                    if ( (LA11_3==14) ) {
                        alt11=3;
                    }
                    else if ( (LA11_3==EOF||(LA11_3>=RULE_INT && LA11_3<=RULE_STRING)||(LA11_3>=11 && LA11_3<=13)||(LA11_3>=18 && LA11_3<=19)||LA11_3==26||LA11_3==30) ) {
                        alt11=2;
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

                if ( (LA11_3==14) ) {
                    alt11=3;
                }
                else if ( (LA11_3==EOF||(LA11_3>=RULE_INT && LA11_3<=RULE_STRING)||(LA11_3>=11 && LA11_3<=13)||(LA11_3>=18 && LA11_3<=19)||LA11_3==26||LA11_3==30) ) {
                    alt11=2;
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
                    // InternalSolverLanguage.g:1444:2: ( ruleBooleanObject )
                    {
                    // InternalSolverLanguage.g:1444:2: ( ruleBooleanObject )
                    // InternalSolverLanguage.g:1445:3: ruleBooleanObject
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
                    // InternalSolverLanguage.g:1450:2: ( ruleIntObject )
                    {
                    // InternalSolverLanguage.g:1450:2: ( ruleIntObject )
                    // InternalSolverLanguage.g:1451:3: ruleIntObject
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
                    // InternalSolverLanguage.g:1456:2: ( ruleRealObject )
                    {
                    // InternalSolverLanguage.g:1456:2: ( ruleRealObject )
                    // InternalSolverLanguage.g:1457:3: ruleRealObject
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
                    // InternalSolverLanguage.g:1462:2: ( ruleStringObject )
                    {
                    // InternalSolverLanguage.g:1462:2: ( ruleStringObject )
                    // InternalSolverLanguage.g:1463:3: ruleStringObject
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


    // $ANTLR start "rule__Predicate__Alternatives"
    // InternalSolverLanguage.g:1472:1: rule__Predicate__Alternatives : ( ( rulePredicateSymbol ) | ( ruleErrorPredicate ) );
    public final void rule__Predicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1476:1: ( ( rulePredicateSymbol ) | ( ruleErrorPredicate ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( (LA12_0==16) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSolverLanguage.g:1477:2: ( rulePredicateSymbol )
                    {
                    // InternalSolverLanguage.g:1477:2: ( rulePredicateSymbol )
                    // InternalSolverLanguage.g:1478:3: rulePredicateSymbol
                    {
                     before(grammarAccess.getPredicateAccess().getPredicateSymbolParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePredicateSymbol();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getPredicateSymbolParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1483:2: ( ruleErrorPredicate )
                    {
                    // InternalSolverLanguage.g:1483:2: ( ruleErrorPredicate )
                    // InternalSolverLanguage.g:1484:3: ruleErrorPredicate
                    {
                     before(grammarAccess.getPredicateAccess().getErrorPredicateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleErrorPredicate();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getErrorPredicateParserRuleCall_1()); 

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
    // $ANTLR end "rule__Predicate__Alternatives"


    // $ANTLR start "rule__PredicateSymbol__Alternatives_6"
    // InternalSolverLanguage.g:1493:1: rule__PredicateSymbol__Alternatives_6 : ( ( 'false' ) | ( ( rule__PredicateSymbol__Group_6_1__0 ) ) );
    public final void rule__PredicateSymbol__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1497:1: ( ( 'false' ) | ( ( rule__PredicateSymbol__Group_6_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==11) ) {
                alt13=1;
            }
            else if ( (LA13_0==EOF||LA13_0==RULE_ID||(LA13_0>=12 && LA13_0<=14)||(LA13_0>=28 && LA13_0<=29)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSolverLanguage.g:1498:2: ( 'false' )
                    {
                    // InternalSolverLanguage.g:1498:2: ( 'false' )
                    // InternalSolverLanguage.g:1499:3: 'false'
                    {
                     before(grammarAccess.getPredicateSymbolAccess().getFalseKeyword_6_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPredicateSymbolAccess().getFalseKeyword_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1504:2: ( ( rule__PredicateSymbol__Group_6_1__0 ) )
                    {
                    // InternalSolverLanguage.g:1504:2: ( ( rule__PredicateSymbol__Group_6_1__0 ) )
                    // InternalSolverLanguage.g:1505:3: ( rule__PredicateSymbol__Group_6_1__0 )
                    {
                     before(grammarAccess.getPredicateSymbolAccess().getGroup_6_1()); 
                    // InternalSolverLanguage.g:1506:3: ( rule__PredicateSymbol__Group_6_1__0 )
                    // InternalSolverLanguage.g:1506:4: rule__PredicateSymbol__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PredicateSymbol__Group_6_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicateSymbolAccess().getGroup_6_1()); 

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
    // $ANTLR end "rule__PredicateSymbol__Alternatives_6"


    // $ANTLR start "rule__ErrorPredicate__Alternatives_5"
    // InternalSolverLanguage.g:1514:1: rule__ErrorPredicate__Alternatives_5 : ( ( 'false' ) | ( ( rule__ErrorPredicate__Group_5_1__0 ) ) );
    public final void rule__ErrorPredicate__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1518:1: ( ( 'false' ) | ( ( rule__ErrorPredicate__Group_5_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==11) ) {
                alt14=1;
            }
            else if ( (LA14_0==EOF||LA14_0==RULE_ID||(LA14_0>=12 && LA14_0<=14)||(LA14_0>=28 && LA14_0<=29)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSolverLanguage.g:1519:2: ( 'false' )
                    {
                    // InternalSolverLanguage.g:1519:2: ( 'false' )
                    // InternalSolverLanguage.g:1520:3: 'false'
                    {
                     before(grammarAccess.getErrorPredicateAccess().getFalseKeyword_5_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getErrorPredicateAccess().getFalseKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1525:2: ( ( rule__ErrorPredicate__Group_5_1__0 ) )
                    {
                    // InternalSolverLanguage.g:1525:2: ( ( rule__ErrorPredicate__Group_5_1__0 ) )
                    // InternalSolverLanguage.g:1526:3: ( rule__ErrorPredicate__Group_5_1__0 )
                    {
                     before(grammarAccess.getErrorPredicateAccess().getGroup_5_1()); 
                    // InternalSolverLanguage.g:1527:3: ( rule__ErrorPredicate__Group_5_1__0 )
                    // InternalSolverLanguage.g:1527:4: rule__ErrorPredicate__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ErrorPredicate__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getErrorPredicateAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__ErrorPredicate__Alternatives_5"


    // $ANTLR start "rule__PatternBody__Alternatives_1"
    // InternalSolverLanguage.g:1535:1: rule__PatternBody__Alternatives_1 : ( ( 'true' ) | ( ( rule__PatternBody__ConstraintsAssignment_1_1 )* ) );
    public final void rule__PatternBody__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1539:1: ( ( 'true' ) | ( ( rule__PatternBody__ConstraintsAssignment_1_1 )* ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            else if ( (LA16_0==EOF||LA16_0==RULE_ID||(LA16_0>=13 && LA16_0<=14)||(LA16_0>=28 && LA16_0<=29)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSolverLanguage.g:1540:2: ( 'true' )
                    {
                    // InternalSolverLanguage.g:1540:2: ( 'true' )
                    // InternalSolverLanguage.g:1541:3: 'true'
                    {
                     before(grammarAccess.getPatternBodyAccess().getTrueKeyword_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPatternBodyAccess().getTrueKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1546:2: ( ( rule__PatternBody__ConstraintsAssignment_1_1 )* )
                    {
                    // InternalSolverLanguage.g:1546:2: ( ( rule__PatternBody__ConstraintsAssignment_1_1 )* )
                    // InternalSolverLanguage.g:1547:3: ( rule__PatternBody__ConstraintsAssignment_1_1 )*
                    {
                     before(grammarAccess.getPatternBodyAccess().getConstraintsAssignment_1_1()); 
                    // InternalSolverLanguage.g:1548:3: ( rule__PatternBody__ConstraintsAssignment_1_1 )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID||LA15_0==13||LA15_0==29) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalSolverLanguage.g:1548:4: rule__PatternBody__ConstraintsAssignment_1_1
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__PatternBody__ConstraintsAssignment_1_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
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
    // InternalSolverLanguage.g:1556:1: rule__Polarity__Alternatives : ( ( ( rule__Polarity__Group_0__0 ) ) | ( ( rule__Polarity__Group_1__0 ) ) );
    public final void rule__Polarity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1560:1: ( ( ( rule__Polarity__Group_0__0 ) ) | ( ( rule__Polarity__Group_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            else if ( (LA17_0==13) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSolverLanguage.g:1561:2: ( ( rule__Polarity__Group_0__0 ) )
                    {
                    // InternalSolverLanguage.g:1561:2: ( ( rule__Polarity__Group_0__0 ) )
                    // InternalSolverLanguage.g:1562:3: ( rule__Polarity__Group_0__0 )
                    {
                     before(grammarAccess.getPolarityAccess().getGroup_0()); 
                    // InternalSolverLanguage.g:1563:3: ( rule__Polarity__Group_0__0 )
                    // InternalSolverLanguage.g:1563:4: rule__Polarity__Group_0__0
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
                    // InternalSolverLanguage.g:1567:2: ( ( rule__Polarity__Group_1__0 ) )
                    {
                    // InternalSolverLanguage.g:1567:2: ( ( rule__Polarity__Group_1__0 ) )
                    // InternalSolverLanguage.g:1568:3: ( rule__Polarity__Group_1__0 )
                    {
                     before(grammarAccess.getPolarityAccess().getGroup_1()); 
                    // InternalSolverLanguage.g:1569:3: ( rule__Polarity__Group_1__0 )
                    // InternalSolverLanguage.g:1569:4: rule__Polarity__Group_1__0
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


    // $ANTLR start "rule__Constraint__Alternatives_2"
    // InternalSolverLanguage.g:1577:1: rule__Constraint__Alternatives_2 : ( ( ( rule__Constraint__Group_2_0__0 ) ) | ( ( rule__Constraint__Group_2_1__0 ) ) );
    public final void rule__Constraint__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1581:1: ( ( ( rule__Constraint__Group_2_0__0 ) ) | ( ( rule__Constraint__Group_2_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=29 && LA18_0<=30)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSolverLanguage.g:1582:2: ( ( rule__Constraint__Group_2_0__0 ) )
                    {
                    // InternalSolverLanguage.g:1582:2: ( ( rule__Constraint__Group_2_0__0 ) )
                    // InternalSolverLanguage.g:1583:3: ( rule__Constraint__Group_2_0__0 )
                    {
                     before(grammarAccess.getConstraintAccess().getGroup_2_0()); 
                    // InternalSolverLanguage.g:1584:3: ( rule__Constraint__Group_2_0__0 )
                    // InternalSolverLanguage.g:1584:4: rule__Constraint__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1588:2: ( ( rule__Constraint__Group_2_1__0 ) )
                    {
                    // InternalSolverLanguage.g:1588:2: ( ( rule__Constraint__Group_2_1__0 ) )
                    // InternalSolverLanguage.g:1589:3: ( rule__Constraint__Group_2_1__0 )
                    {
                     before(grammarAccess.getConstraintAccess().getGroup_2_1()); 
                    // InternalSolverLanguage.g:1590:3: ( rule__Constraint__Group_2_1__0 )
                    // InternalSolverLanguage.g:1590:4: rule__Constraint__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstraintAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Constraint__Alternatives_2"


    // $ANTLR start "rule__ClosureType__Alternatives"
    // InternalSolverLanguage.g:1598:1: rule__ClosureType__Alternatives : ( ( ( rule__ClosureType__Group_0__0 ) ) | ( ( rule__ClosureType__Group_1__0 ) ) );
    public final void rule__ClosureType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1602:1: ( ( ( rule__ClosureType__Group_0__0 ) ) | ( ( rule__ClosureType__Group_1__0 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            else if ( (LA19_0==29) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSolverLanguage.g:1603:2: ( ( rule__ClosureType__Group_0__0 ) )
                    {
                    // InternalSolverLanguage.g:1603:2: ( ( rule__ClosureType__Group_0__0 ) )
                    // InternalSolverLanguage.g:1604:3: ( rule__ClosureType__Group_0__0 )
                    {
                     before(grammarAccess.getClosureTypeAccess().getGroup_0()); 
                    // InternalSolverLanguage.g:1605:3: ( rule__ClosureType__Group_0__0 )
                    // InternalSolverLanguage.g:1605:4: rule__ClosureType__Group_0__0
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
                    // InternalSolverLanguage.g:1609:2: ( ( rule__ClosureType__Group_1__0 ) )
                    {
                    // InternalSolverLanguage.g:1609:2: ( ( rule__ClosureType__Group_1__0 ) )
                    // InternalSolverLanguage.g:1610:3: ( rule__ClosureType__Group_1__0 )
                    {
                     before(grammarAccess.getClosureTypeAccess().getGroup_1()); 
                    // InternalSolverLanguage.g:1611:3: ( rule__ClosureType__Group_1__0 )
                    // InternalSolverLanguage.g:1611:4: rule__ClosureType__Group_1__0
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
    // InternalSolverLanguage.g:1619:1: rule__Literal__Alternatives : ( ( ruleVariable ) | ( ruleDataObject ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1623:1: ( ( ruleVariable ) | ( ruleDataObject ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_INT||LA20_0==RULE_STRING||(LA20_0>=11 && LA20_0<=13)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSolverLanguage.g:1624:2: ( ruleVariable )
                    {
                    // InternalSolverLanguage.g:1624:2: ( ruleVariable )
                    // InternalSolverLanguage.g:1625:3: ruleVariable
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
                    // InternalSolverLanguage.g:1630:2: ( ruleDataObject )
                    {
                    // InternalSolverLanguage.g:1630:2: ( ruleDataObject )
                    // InternalSolverLanguage.g:1631:3: ruleDataObject
                    {
                     before(grammarAccess.getLiteralAccess().getDataObjectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataObject();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getDataObjectParserRuleCall_1()); 

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
    // InternalSolverLanguage.g:1640:1: rule__CDInterpretation__Alternatives : ( ( ruleClassInterpretation ) | ( ruleEnumInterpretation ) | ( ruleGlobalRelationInterpretation ) );
    public final void rule__CDInterpretation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1644:1: ( ( ruleClassInterpretation ) | ( ruleEnumInterpretation ) | ( ruleGlobalRelationInterpretation ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt21=1;
                }
                break;
            case 36:
                {
                alt21=2;
                }
                break;
            case 40:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalSolverLanguage.g:1645:2: ( ruleClassInterpretation )
                    {
                    // InternalSolverLanguage.g:1645:2: ( ruleClassInterpretation )
                    // InternalSolverLanguage.g:1646:3: ruleClassInterpretation
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
                    // InternalSolverLanguage.g:1651:2: ( ruleEnumInterpretation )
                    {
                    // InternalSolverLanguage.g:1651:2: ( ruleEnumInterpretation )
                    // InternalSolverLanguage.g:1652:3: ruleEnumInterpretation
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
                    // InternalSolverLanguage.g:1657:2: ( ruleGlobalRelationInterpretation )
                    {
                    // InternalSolverLanguage.g:1657:2: ( ruleGlobalRelationInterpretation )
                    // InternalSolverLanguage.g:1658:3: ruleGlobalRelationInterpretation
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
    // InternalSolverLanguage.g:1667:1: rule__MultiplicityDefinition__Alternatives_2 : ( ( ( rule__MultiplicityDefinition__UpperAssignment_2_0 ) ) | ( ( rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1 ) ) );
    public final void rule__MultiplicityDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1671:1: ( ( ( rule__MultiplicityDefinition__UpperAssignment_2_0 ) ) | ( ( rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            else if ( (LA22_0==30) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSolverLanguage.g:1672:2: ( ( rule__MultiplicityDefinition__UpperAssignment_2_0 ) )
                    {
                    // InternalSolverLanguage.g:1672:2: ( ( rule__MultiplicityDefinition__UpperAssignment_2_0 ) )
                    // InternalSolverLanguage.g:1673:3: ( rule__MultiplicityDefinition__UpperAssignment_2_0 )
                    {
                     before(grammarAccess.getMultiplicityDefinitionAccess().getUpperAssignment_2_0()); 
                    // InternalSolverLanguage.g:1674:3: ( rule__MultiplicityDefinition__UpperAssignment_2_0 )
                    // InternalSolverLanguage.g:1674:4: rule__MultiplicityDefinition__UpperAssignment_2_0
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
                    // InternalSolverLanguage.g:1678:2: ( ( rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1 ) )
                    {
                    // InternalSolverLanguage.g:1678:2: ( ( rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1 ) )
                    // InternalSolverLanguage.g:1679:3: ( rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1 )
                    {
                     before(grammarAccess.getMultiplicityDefinitionAccess().getUnlimitedUpperAssignment_2_1()); 
                    // InternalSolverLanguage.g:1680:3: ( rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1 )
                    // InternalSolverLanguage.g:1680:4: rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1
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
    // InternalSolverLanguage.g:1688:1: rule__REALLiteral__Group__0 : rule__REALLiteral__Group__0__Impl rule__REALLiteral__Group__1 ;
    public final void rule__REALLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1692:1: ( rule__REALLiteral__Group__0__Impl rule__REALLiteral__Group__1 )
            // InternalSolverLanguage.g:1693:2: rule__REALLiteral__Group__0__Impl rule__REALLiteral__Group__1
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
    // InternalSolverLanguage.g:1700:1: rule__REALLiteral__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__REALLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1704:1: ( ( ( '-' )? ) )
            // InternalSolverLanguage.g:1705:1: ( ( '-' )? )
            {
            // InternalSolverLanguage.g:1705:1: ( ( '-' )? )
            // InternalSolverLanguage.g:1706:2: ( '-' )?
            {
             before(grammarAccess.getREALLiteralAccess().getHyphenMinusKeyword_0()); 
            // InternalSolverLanguage.g:1707:2: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==13) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSolverLanguage.g:1707:3: '-'
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
    // InternalSolverLanguage.g:1715:1: rule__REALLiteral__Group__1 : rule__REALLiteral__Group__1__Impl rule__REALLiteral__Group__2 ;
    public final void rule__REALLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1719:1: ( rule__REALLiteral__Group__1__Impl rule__REALLiteral__Group__2 )
            // InternalSolverLanguage.g:1720:2: rule__REALLiteral__Group__1__Impl rule__REALLiteral__Group__2
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
    // InternalSolverLanguage.g:1727:1: rule__REALLiteral__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__REALLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1731:1: ( ( RULE_INT ) )
            // InternalSolverLanguage.g:1732:1: ( RULE_INT )
            {
            // InternalSolverLanguage.g:1732:1: ( RULE_INT )
            // InternalSolverLanguage.g:1733:2: RULE_INT
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
    // InternalSolverLanguage.g:1742:1: rule__REALLiteral__Group__2 : rule__REALLiteral__Group__2__Impl rule__REALLiteral__Group__3 ;
    public final void rule__REALLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1746:1: ( rule__REALLiteral__Group__2__Impl rule__REALLiteral__Group__3 )
            // InternalSolverLanguage.g:1747:2: rule__REALLiteral__Group__2__Impl rule__REALLiteral__Group__3
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
    // InternalSolverLanguage.g:1754:1: rule__REALLiteral__Group__2__Impl : ( '.' ) ;
    public final void rule__REALLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1758:1: ( ( '.' ) )
            // InternalSolverLanguage.g:1759:1: ( '.' )
            {
            // InternalSolverLanguage.g:1759:1: ( '.' )
            // InternalSolverLanguage.g:1760:2: '.'
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
    // InternalSolverLanguage.g:1769:1: rule__REALLiteral__Group__3 : rule__REALLiteral__Group__3__Impl ;
    public final void rule__REALLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1773:1: ( rule__REALLiteral__Group__3__Impl )
            // InternalSolverLanguage.g:1774:2: rule__REALLiteral__Group__3__Impl
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
    // InternalSolverLanguage.g:1780:1: rule__REALLiteral__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__REALLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1784:1: ( ( RULE_INT ) )
            // InternalSolverLanguage.g:1785:1: ( RULE_INT )
            {
            // InternalSolverLanguage.g:1785:1: ( RULE_INT )
            // InternalSolverLanguage.g:1786:2: RULE_INT
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
    // InternalSolverLanguage.g:1796:1: rule__INTLiteral__Group__0 : rule__INTLiteral__Group__0__Impl rule__INTLiteral__Group__1 ;
    public final void rule__INTLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1800:1: ( rule__INTLiteral__Group__0__Impl rule__INTLiteral__Group__1 )
            // InternalSolverLanguage.g:1801:2: rule__INTLiteral__Group__0__Impl rule__INTLiteral__Group__1
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
    // InternalSolverLanguage.g:1808:1: rule__INTLiteral__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1812:1: ( ( ( '-' )? ) )
            // InternalSolverLanguage.g:1813:1: ( ( '-' )? )
            {
            // InternalSolverLanguage.g:1813:1: ( ( '-' )? )
            // InternalSolverLanguage.g:1814:2: ( '-' )?
            {
             before(grammarAccess.getINTLiteralAccess().getHyphenMinusKeyword_0()); 
            // InternalSolverLanguage.g:1815:2: ( '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSolverLanguage.g:1815:3: '-'
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
    // InternalSolverLanguage.g:1823:1: rule__INTLiteral__Group__1 : rule__INTLiteral__Group__1__Impl ;
    public final void rule__INTLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1827:1: ( rule__INTLiteral__Group__1__Impl )
            // InternalSolverLanguage.g:1828:2: rule__INTLiteral__Group__1__Impl
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
    // InternalSolverLanguage.g:1834:1: rule__INTLiteral__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__INTLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1838:1: ( ( RULE_INT ) )
            // InternalSolverLanguage.g:1839:1: ( RULE_INT )
            {
            // InternalSolverLanguage.g:1839:1: ( RULE_INT )
            // InternalSolverLanguage.g:1840:2: RULE_INT
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
    // InternalSolverLanguage.g:1850:1: rule__BooleanValue__Group_0__0 : rule__BooleanValue__Group_0__0__Impl rule__BooleanValue__Group_0__1 ;
    public final void rule__BooleanValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1854:1: ( rule__BooleanValue__Group_0__0__Impl rule__BooleanValue__Group_0__1 )
            // InternalSolverLanguage.g:1855:2: rule__BooleanValue__Group_0__0__Impl rule__BooleanValue__Group_0__1
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
    // InternalSolverLanguage.g:1862:1: rule__BooleanValue__Group_0__0__Impl : ( () ) ;
    public final void rule__BooleanValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1866:1: ( ( () ) )
            // InternalSolverLanguage.g:1867:1: ( () )
            {
            // InternalSolverLanguage.g:1867:1: ( () )
            // InternalSolverLanguage.g:1868:2: ()
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanTrueAction_0_0()); 
            // InternalSolverLanguage.g:1869:2: ()
            // InternalSolverLanguage.g:1869:3: 
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
    // InternalSolverLanguage.g:1877:1: rule__BooleanValue__Group_0__1 : rule__BooleanValue__Group_0__1__Impl ;
    public final void rule__BooleanValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1881:1: ( rule__BooleanValue__Group_0__1__Impl )
            // InternalSolverLanguage.g:1882:2: rule__BooleanValue__Group_0__1__Impl
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
    // InternalSolverLanguage.g:1888:1: rule__BooleanValue__Group_0__1__Impl : ( 'true' ) ;
    public final void rule__BooleanValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1892:1: ( ( 'true' ) )
            // InternalSolverLanguage.g:1893:1: ( 'true' )
            {
            // InternalSolverLanguage.g:1893:1: ( 'true' )
            // InternalSolverLanguage.g:1894:2: 'true'
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
    // InternalSolverLanguage.g:1904:1: rule__BooleanValue__Group_1__0 : rule__BooleanValue__Group_1__0__Impl rule__BooleanValue__Group_1__1 ;
    public final void rule__BooleanValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1908:1: ( rule__BooleanValue__Group_1__0__Impl rule__BooleanValue__Group_1__1 )
            // InternalSolverLanguage.g:1909:2: rule__BooleanValue__Group_1__0__Impl rule__BooleanValue__Group_1__1
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
    // InternalSolverLanguage.g:1916:1: rule__BooleanValue__Group_1__0__Impl : ( 'false' ) ;
    public final void rule__BooleanValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1920:1: ( ( 'false' ) )
            // InternalSolverLanguage.g:1921:1: ( 'false' )
            {
            // InternalSolverLanguage.g:1921:1: ( 'false' )
            // InternalSolverLanguage.g:1922:2: 'false'
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
    // InternalSolverLanguage.g:1931:1: rule__BooleanValue__Group_1__1 : rule__BooleanValue__Group_1__1__Impl ;
    public final void rule__BooleanValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1935:1: ( rule__BooleanValue__Group_1__1__Impl )
            // InternalSolverLanguage.g:1936:2: rule__BooleanValue__Group_1__1__Impl
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
    // InternalSolverLanguage.g:1942:1: rule__BooleanValue__Group_1__1__Impl : ( () ) ;
    public final void rule__BooleanValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1946:1: ( ( () ) )
            // InternalSolverLanguage.g:1947:1: ( () )
            {
            // InternalSolverLanguage.g:1947:1: ( () )
            // InternalSolverLanguage.g:1948:2: ()
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanFalseAction_1_1()); 
            // InternalSolverLanguage.g:1949:2: ()
            // InternalSolverLanguage.g:1949:3: 
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
    // InternalSolverLanguage.g:1958:1: rule__TruthValue__Group_0__0 : rule__TruthValue__Group_0__0__Impl rule__TruthValue__Group_0__1 ;
    public final void rule__TruthValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1962:1: ( rule__TruthValue__Group_0__0__Impl rule__TruthValue__Group_0__1 )
            // InternalSolverLanguage.g:1963:2: rule__TruthValue__Group_0__0__Impl rule__TruthValue__Group_0__1
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
    // InternalSolverLanguage.g:1970:1: rule__TruthValue__Group_0__0__Impl : ( () ) ;
    public final void rule__TruthValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1974:1: ( ( () ) )
            // InternalSolverLanguage.g:1975:1: ( () )
            {
            // InternalSolverLanguage.g:1975:1: ( () )
            // InternalSolverLanguage.g:1976:2: ()
            {
             before(grammarAccess.getTruthValueAccess().getTrueAction_0_0()); 
            // InternalSolverLanguage.g:1977:2: ()
            // InternalSolverLanguage.g:1977:3: 
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
    // InternalSolverLanguage.g:1985:1: rule__TruthValue__Group_0__1 : rule__TruthValue__Group_0__1__Impl ;
    public final void rule__TruthValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:1989:1: ( rule__TruthValue__Group_0__1__Impl )
            // InternalSolverLanguage.g:1990:2: rule__TruthValue__Group_0__1__Impl
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
    // InternalSolverLanguage.g:1996:1: rule__TruthValue__Group_0__1__Impl : ( 'true' ) ;
    public final void rule__TruthValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2000:1: ( ( 'true' ) )
            // InternalSolverLanguage.g:2001:1: ( 'true' )
            {
            // InternalSolverLanguage.g:2001:1: ( 'true' )
            // InternalSolverLanguage.g:2002:2: 'true'
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
    // InternalSolverLanguage.g:2012:1: rule__TruthValue__Group_1__0 : rule__TruthValue__Group_1__0__Impl rule__TruthValue__Group_1__1 ;
    public final void rule__TruthValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2016:1: ( rule__TruthValue__Group_1__0__Impl rule__TruthValue__Group_1__1 )
            // InternalSolverLanguage.g:2017:2: rule__TruthValue__Group_1__0__Impl rule__TruthValue__Group_1__1
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
    // InternalSolverLanguage.g:2024:1: rule__TruthValue__Group_1__0__Impl : ( () ) ;
    public final void rule__TruthValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2028:1: ( ( () ) )
            // InternalSolverLanguage.g:2029:1: ( () )
            {
            // InternalSolverLanguage.g:2029:1: ( () )
            // InternalSolverLanguage.g:2030:2: ()
            {
             before(grammarAccess.getTruthValueAccess().getFalseAction_1_0()); 
            // InternalSolverLanguage.g:2031:2: ()
            // InternalSolverLanguage.g:2031:3: 
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
    // InternalSolverLanguage.g:2039:1: rule__TruthValue__Group_1__1 : rule__TruthValue__Group_1__1__Impl ;
    public final void rule__TruthValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2043:1: ( rule__TruthValue__Group_1__1__Impl )
            // InternalSolverLanguage.g:2044:2: rule__TruthValue__Group_1__1__Impl
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
    // InternalSolverLanguage.g:2050:1: rule__TruthValue__Group_1__1__Impl : ( 'false' ) ;
    public final void rule__TruthValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2054:1: ( ( 'false' ) )
            // InternalSolverLanguage.g:2055:1: ( 'false' )
            {
            // InternalSolverLanguage.g:2055:1: ( 'false' )
            // InternalSolverLanguage.g:2056:2: 'false'
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
    // InternalSolverLanguage.g:2066:1: rule__TruthValue__Group_2__0 : rule__TruthValue__Group_2__0__Impl rule__TruthValue__Group_2__1 ;
    public final void rule__TruthValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2070:1: ( rule__TruthValue__Group_2__0__Impl rule__TruthValue__Group_2__1 )
            // InternalSolverLanguage.g:2071:2: rule__TruthValue__Group_2__0__Impl rule__TruthValue__Group_2__1
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
    // InternalSolverLanguage.g:2078:1: rule__TruthValue__Group_2__0__Impl : ( () ) ;
    public final void rule__TruthValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2082:1: ( ( () ) )
            // InternalSolverLanguage.g:2083:1: ( () )
            {
            // InternalSolverLanguage.g:2083:1: ( () )
            // InternalSolverLanguage.g:2084:2: ()
            {
             before(grammarAccess.getTruthValueAccess().getUnknownAction_2_0()); 
            // InternalSolverLanguage.g:2085:2: ()
            // InternalSolverLanguage.g:2085:3: 
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
    // InternalSolverLanguage.g:2093:1: rule__TruthValue__Group_2__1 : rule__TruthValue__Group_2__1__Impl ;
    public final void rule__TruthValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2097:1: ( rule__TruthValue__Group_2__1__Impl )
            // InternalSolverLanguage.g:2098:2: rule__TruthValue__Group_2__1__Impl
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
    // InternalSolverLanguage.g:2104:1: rule__TruthValue__Group_2__1__Impl : ( 'unknown' ) ;
    public final void rule__TruthValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2108:1: ( ( 'unknown' ) )
            // InternalSolverLanguage.g:2109:1: ( 'unknown' )
            {
            // InternalSolverLanguage.g:2109:1: ( 'unknown' )
            // InternalSolverLanguage.g:2110:2: 'unknown'
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
    // InternalSolverLanguage.g:2120:1: rule__TruthValue__Group_3__0 : rule__TruthValue__Group_3__0__Impl rule__TruthValue__Group_3__1 ;
    public final void rule__TruthValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2124:1: ( rule__TruthValue__Group_3__0__Impl rule__TruthValue__Group_3__1 )
            // InternalSolverLanguage.g:2125:2: rule__TruthValue__Group_3__0__Impl rule__TruthValue__Group_3__1
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
    // InternalSolverLanguage.g:2132:1: rule__TruthValue__Group_3__0__Impl : ( () ) ;
    public final void rule__TruthValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2136:1: ( ( () ) )
            // InternalSolverLanguage.g:2137:1: ( () )
            {
            // InternalSolverLanguage.g:2137:1: ( () )
            // InternalSolverLanguage.g:2138:2: ()
            {
             before(grammarAccess.getTruthValueAccess().getErrorAction_3_0()); 
            // InternalSolverLanguage.g:2139:2: ()
            // InternalSolverLanguage.g:2139:3: 
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
    // InternalSolverLanguage.g:2147:1: rule__TruthValue__Group_3__1 : rule__TruthValue__Group_3__1__Impl ;
    public final void rule__TruthValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2151:1: ( rule__TruthValue__Group_3__1__Impl )
            // InternalSolverLanguage.g:2152:2: rule__TruthValue__Group_3__1__Impl
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
    // InternalSolverLanguage.g:2158:1: rule__TruthValue__Group_3__1__Impl : ( 'error' ) ;
    public final void rule__TruthValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2162:1: ( ( 'error' ) )
            // InternalSolverLanguage.g:2163:1: ( 'error' )
            {
            // InternalSolverLanguage.g:2163:1: ( 'error' )
            // InternalSolverLanguage.g:2164:2: 'error'
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
    // InternalSolverLanguage.g:2174:1: rule__BasicInterpretation__Group__0 : rule__BasicInterpretation__Group__0__Impl rule__BasicInterpretation__Group__1 ;
    public final void rule__BasicInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2178:1: ( rule__BasicInterpretation__Group__0__Impl rule__BasicInterpretation__Group__1 )
            // InternalSolverLanguage.g:2179:2: rule__BasicInterpretation__Group__0__Impl rule__BasicInterpretation__Group__1
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
    // InternalSolverLanguage.g:2186:1: rule__BasicInterpretation__Group__0__Impl : ( ( rule__BasicInterpretation__SymbolAssignment_0 ) ) ;
    public final void rule__BasicInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2190:1: ( ( ( rule__BasicInterpretation__SymbolAssignment_0 ) ) )
            // InternalSolverLanguage.g:2191:1: ( ( rule__BasicInterpretation__SymbolAssignment_0 ) )
            {
            // InternalSolverLanguage.g:2191:1: ( ( rule__BasicInterpretation__SymbolAssignment_0 ) )
            // InternalSolverLanguage.g:2192:2: ( rule__BasicInterpretation__SymbolAssignment_0 )
            {
             before(grammarAccess.getBasicInterpretationAccess().getSymbolAssignment_0()); 
            // InternalSolverLanguage.g:2193:2: ( rule__BasicInterpretation__SymbolAssignment_0 )
            // InternalSolverLanguage.g:2193:3: rule__BasicInterpretation__SymbolAssignment_0
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
    // InternalSolverLanguage.g:2201:1: rule__BasicInterpretation__Group__1 : rule__BasicInterpretation__Group__1__Impl rule__BasicInterpretation__Group__2 ;
    public final void rule__BasicInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2205:1: ( rule__BasicInterpretation__Group__1__Impl rule__BasicInterpretation__Group__2 )
            // InternalSolverLanguage.g:2206:2: rule__BasicInterpretation__Group__1__Impl rule__BasicInterpretation__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSolverLanguage.g:2213:1: rule__BasicInterpretation__Group__1__Impl : ( '(' ) ;
    public final void rule__BasicInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2217:1: ( ( '(' ) )
            // InternalSolverLanguage.g:2218:1: ( '(' )
            {
            // InternalSolverLanguage.g:2218:1: ( '(' )
            // InternalSolverLanguage.g:2219:2: '('
            {
             before(grammarAccess.getBasicInterpretationAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBasicInterpretationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalSolverLanguage.g:2228:1: rule__BasicInterpretation__Group__2 : rule__BasicInterpretation__Group__2__Impl rule__BasicInterpretation__Group__3 ;
    public final void rule__BasicInterpretation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2232:1: ( rule__BasicInterpretation__Group__2__Impl rule__BasicInterpretation__Group__3 )
            // InternalSolverLanguage.g:2233:2: rule__BasicInterpretation__Group__2__Impl rule__BasicInterpretation__Group__3
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
    // InternalSolverLanguage.g:2240:1: rule__BasicInterpretation__Group__2__Impl : ( ( rule__BasicInterpretation__ObjectsAssignment_2 )* ) ;
    public final void rule__BasicInterpretation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2244:1: ( ( ( rule__BasicInterpretation__ObjectsAssignment_2 )* ) )
            // InternalSolverLanguage.g:2245:1: ( ( rule__BasicInterpretation__ObjectsAssignment_2 )* )
            {
            // InternalSolverLanguage.g:2245:1: ( ( rule__BasicInterpretation__ObjectsAssignment_2 )* )
            // InternalSolverLanguage.g:2246:2: ( rule__BasicInterpretation__ObjectsAssignment_2 )*
            {
             before(grammarAccess.getBasicInterpretationAccess().getObjectsAssignment_2()); 
            // InternalSolverLanguage.g:2247:2: ( rule__BasicInterpretation__ObjectsAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_INT && LA25_0<=RULE_STRING)||(LA25_0>=11 && LA25_0<=13)||LA25_0==19||LA25_0==26||LA25_0==30) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSolverLanguage.g:2247:3: rule__BasicInterpretation__ObjectsAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__BasicInterpretation__ObjectsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getBasicInterpretationAccess().getObjectsAssignment_2()); 

            }


            }

        }
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
    // InternalSolverLanguage.g:2255:1: rule__BasicInterpretation__Group__3 : rule__BasicInterpretation__Group__3__Impl rule__BasicInterpretation__Group__4 ;
    public final void rule__BasicInterpretation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2259:1: ( rule__BasicInterpretation__Group__3__Impl rule__BasicInterpretation__Group__4 )
            // InternalSolverLanguage.g:2260:2: rule__BasicInterpretation__Group__3__Impl rule__BasicInterpretation__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__BasicInterpretation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__Group__4();

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
    // InternalSolverLanguage.g:2267:1: rule__BasicInterpretation__Group__3__Impl : ( ')' ) ;
    public final void rule__BasicInterpretation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2271:1: ( ( ')' ) )
            // InternalSolverLanguage.g:2272:1: ( ')' )
            {
            // InternalSolverLanguage.g:2272:1: ( ')' )
            // InternalSolverLanguage.g:2273:2: ')'
            {
             before(grammarAccess.getBasicInterpretationAccess().getRightParenthesisKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBasicInterpretationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__BasicInterpretation__Group__4"
    // InternalSolverLanguage.g:2282:1: rule__BasicInterpretation__Group__4 : rule__BasicInterpretation__Group__4__Impl rule__BasicInterpretation__Group__5 ;
    public final void rule__BasicInterpretation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2286:1: ( rule__BasicInterpretation__Group__4__Impl rule__BasicInterpretation__Group__5 )
            // InternalSolverLanguage.g:2287:2: rule__BasicInterpretation__Group__4__Impl rule__BasicInterpretation__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__BasicInterpretation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__Group__5();

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
    // $ANTLR end "rule__BasicInterpretation__Group__4"


    // $ANTLR start "rule__BasicInterpretation__Group__4__Impl"
    // InternalSolverLanguage.g:2294:1: rule__BasicInterpretation__Group__4__Impl : ( ':' ) ;
    public final void rule__BasicInterpretation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2298:1: ( ( ':' ) )
            // InternalSolverLanguage.g:2299:1: ( ':' )
            {
            // InternalSolverLanguage.g:2299:1: ( ':' )
            // InternalSolverLanguage.g:2300:2: ':'
            {
             before(grammarAccess.getBasicInterpretationAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBasicInterpretationAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicInterpretation__Group__4__Impl"


    // $ANTLR start "rule__BasicInterpretation__Group__5"
    // InternalSolverLanguage.g:2309:1: rule__BasicInterpretation__Group__5 : rule__BasicInterpretation__Group__5__Impl ;
    public final void rule__BasicInterpretation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2313:1: ( rule__BasicInterpretation__Group__5__Impl )
            // InternalSolverLanguage.g:2314:2: rule__BasicInterpretation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__Group__5__Impl();

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
    // $ANTLR end "rule__BasicInterpretation__Group__5"


    // $ANTLR start "rule__BasicInterpretation__Group__5__Impl"
    // InternalSolverLanguage.g:2320:1: rule__BasicInterpretation__Group__5__Impl : ( ( rule__BasicInterpretation__ValueAssignment_5 ) ) ;
    public final void rule__BasicInterpretation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2324:1: ( ( ( rule__BasicInterpretation__ValueAssignment_5 ) ) )
            // InternalSolverLanguage.g:2325:1: ( ( rule__BasicInterpretation__ValueAssignment_5 ) )
            {
            // InternalSolverLanguage.g:2325:1: ( ( rule__BasicInterpretation__ValueAssignment_5 ) )
            // InternalSolverLanguage.g:2326:2: ( rule__BasicInterpretation__ValueAssignment_5 )
            {
             before(grammarAccess.getBasicInterpretationAccess().getValueAssignment_5()); 
            // InternalSolverLanguage.g:2327:2: ( rule__BasicInterpretation__ValueAssignment_5 )
            // InternalSolverLanguage.g:2327:3: rule__BasicInterpretation__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BasicInterpretation__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBasicInterpretationAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicInterpretation__Group__5__Impl"


    // $ANTLR start "rule__ExistSymbol__Group__0"
    // InternalSolverLanguage.g:2336:1: rule__ExistSymbol__Group__0 : rule__ExistSymbol__Group__0__Impl rule__ExistSymbol__Group__1 ;
    public final void rule__ExistSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2340:1: ( rule__ExistSymbol__Group__0__Impl rule__ExistSymbol__Group__1 )
            // InternalSolverLanguage.g:2341:2: rule__ExistSymbol__Group__0__Impl rule__ExistSymbol__Group__1
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
    // InternalSolverLanguage.g:2348:1: rule__ExistSymbol__Group__0__Impl : ( 'exists' ) ;
    public final void rule__ExistSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2352:1: ( ( 'exists' ) )
            // InternalSolverLanguage.g:2353:1: ( 'exists' )
            {
            // InternalSolverLanguage.g:2353:1: ( 'exists' )
            // InternalSolverLanguage.g:2354:2: 'exists'
            {
             before(grammarAccess.getExistSymbolAccess().getExistsKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSolverLanguage.g:2363:1: rule__ExistSymbol__Group__1 : rule__ExistSymbol__Group__1__Impl ;
    public final void rule__ExistSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2367:1: ( rule__ExistSymbol__Group__1__Impl )
            // InternalSolverLanguage.g:2368:2: rule__ExistSymbol__Group__1__Impl
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
    // InternalSolverLanguage.g:2374:1: rule__ExistSymbol__Group__1__Impl : ( () ) ;
    public final void rule__ExistSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2378:1: ( ( () ) )
            // InternalSolverLanguage.g:2379:1: ( () )
            {
            // InternalSolverLanguage.g:2379:1: ( () )
            // InternalSolverLanguage.g:2380:2: ()
            {
             before(grammarAccess.getExistSymbolAccess().getExistSymbolAction_1()); 
            // InternalSolverLanguage.g:2381:2: ()
            // InternalSolverLanguage.g:2381:3: 
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
    // InternalSolverLanguage.g:2390:1: rule__EqualsSymbol__Group__0 : rule__EqualsSymbol__Group__0__Impl rule__EqualsSymbol__Group__1 ;
    public final void rule__EqualsSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2394:1: ( rule__EqualsSymbol__Group__0__Impl rule__EqualsSymbol__Group__1 )
            // InternalSolverLanguage.g:2395:2: rule__EqualsSymbol__Group__0__Impl rule__EqualsSymbol__Group__1
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
    // InternalSolverLanguage.g:2402:1: rule__EqualsSymbol__Group__0__Impl : ( 'equals' ) ;
    public final void rule__EqualsSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2406:1: ( ( 'equals' ) )
            // InternalSolverLanguage.g:2407:1: ( 'equals' )
            {
            // InternalSolverLanguage.g:2407:1: ( 'equals' )
            // InternalSolverLanguage.g:2408:2: 'equals'
            {
             before(grammarAccess.getEqualsSymbolAccess().getEqualsKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSolverLanguage.g:2417:1: rule__EqualsSymbol__Group__1 : rule__EqualsSymbol__Group__1__Impl ;
    public final void rule__EqualsSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2421:1: ( rule__EqualsSymbol__Group__1__Impl )
            // InternalSolverLanguage.g:2422:2: rule__EqualsSymbol__Group__1__Impl
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
    // InternalSolverLanguage.g:2428:1: rule__EqualsSymbol__Group__1__Impl : ( () ) ;
    public final void rule__EqualsSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2432:1: ( ( () ) )
            // InternalSolverLanguage.g:2433:1: ( () )
            {
            // InternalSolverLanguage.g:2433:1: ( () )
            // InternalSolverLanguage.g:2434:2: ()
            {
             before(grammarAccess.getEqualsSymbolAccess().getEqualsSymbolAction_1()); 
            // InternalSolverLanguage.g:2435:2: ()
            // InternalSolverLanguage.g:2435:3: 
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
    // InternalSolverLanguage.g:2444:1: rule__BooleanSymbol__Group__0 : rule__BooleanSymbol__Group__0__Impl rule__BooleanSymbol__Group__1 ;
    public final void rule__BooleanSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2448:1: ( rule__BooleanSymbol__Group__0__Impl rule__BooleanSymbol__Group__1 )
            // InternalSolverLanguage.g:2449:2: rule__BooleanSymbol__Group__0__Impl rule__BooleanSymbol__Group__1
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
    // InternalSolverLanguage.g:2456:1: rule__BooleanSymbol__Group__0__Impl : ( 'bool' ) ;
    public final void rule__BooleanSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2460:1: ( ( 'bool' ) )
            // InternalSolverLanguage.g:2461:1: ( 'bool' )
            {
            // InternalSolverLanguage.g:2461:1: ( 'bool' )
            // InternalSolverLanguage.g:2462:2: 'bool'
            {
             before(grammarAccess.getBooleanSymbolAccess().getBoolKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSolverLanguage.g:2471:1: rule__BooleanSymbol__Group__1 : rule__BooleanSymbol__Group__1__Impl ;
    public final void rule__BooleanSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2475:1: ( rule__BooleanSymbol__Group__1__Impl )
            // InternalSolverLanguage.g:2476:2: rule__BooleanSymbol__Group__1__Impl
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
    // InternalSolverLanguage.g:2482:1: rule__BooleanSymbol__Group__1__Impl : ( () ) ;
    public final void rule__BooleanSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2486:1: ( ( () ) )
            // InternalSolverLanguage.g:2487:1: ( () )
            {
            // InternalSolverLanguage.g:2487:1: ( () )
            // InternalSolverLanguage.g:2488:2: ()
            {
             before(grammarAccess.getBooleanSymbolAccess().getBooleanSymbolAction_1()); 
            // InternalSolverLanguage.g:2489:2: ()
            // InternalSolverLanguage.g:2489:3: 
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
    // InternalSolverLanguage.g:2498:1: rule__IntegerSymbol__Group__0 : rule__IntegerSymbol__Group__0__Impl rule__IntegerSymbol__Group__1 ;
    public final void rule__IntegerSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2502:1: ( rule__IntegerSymbol__Group__0__Impl rule__IntegerSymbol__Group__1 )
            // InternalSolverLanguage.g:2503:2: rule__IntegerSymbol__Group__0__Impl rule__IntegerSymbol__Group__1
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
    // InternalSolverLanguage.g:2510:1: rule__IntegerSymbol__Group__0__Impl : ( 'int' ) ;
    public final void rule__IntegerSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2514:1: ( ( 'int' ) )
            // InternalSolverLanguage.g:2515:1: ( 'int' )
            {
            // InternalSolverLanguage.g:2515:1: ( 'int' )
            // InternalSolverLanguage.g:2516:2: 'int'
            {
             before(grammarAccess.getIntegerSymbolAccess().getIntKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSolverLanguage.g:2525:1: rule__IntegerSymbol__Group__1 : rule__IntegerSymbol__Group__1__Impl ;
    public final void rule__IntegerSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2529:1: ( rule__IntegerSymbol__Group__1__Impl )
            // InternalSolverLanguage.g:2530:2: rule__IntegerSymbol__Group__1__Impl
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
    // InternalSolverLanguage.g:2536:1: rule__IntegerSymbol__Group__1__Impl : ( () ) ;
    public final void rule__IntegerSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2540:1: ( ( () ) )
            // InternalSolverLanguage.g:2541:1: ( () )
            {
            // InternalSolverLanguage.g:2541:1: ( () )
            // InternalSolverLanguage.g:2542:2: ()
            {
             before(grammarAccess.getIntegerSymbolAccess().getIntegerSymbolAction_1()); 
            // InternalSolverLanguage.g:2543:2: ()
            // InternalSolverLanguage.g:2543:3: 
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
    // InternalSolverLanguage.g:2552:1: rule__RealSymbol__Group__0 : rule__RealSymbol__Group__0__Impl rule__RealSymbol__Group__1 ;
    public final void rule__RealSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2556:1: ( rule__RealSymbol__Group__0__Impl rule__RealSymbol__Group__1 )
            // InternalSolverLanguage.g:2557:2: rule__RealSymbol__Group__0__Impl rule__RealSymbol__Group__1
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
    // InternalSolverLanguage.g:2564:1: rule__RealSymbol__Group__0__Impl : ( 'real' ) ;
    public final void rule__RealSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2568:1: ( ( 'real' ) )
            // InternalSolverLanguage.g:2569:1: ( 'real' )
            {
            // InternalSolverLanguage.g:2569:1: ( 'real' )
            // InternalSolverLanguage.g:2570:2: 'real'
            {
             before(grammarAccess.getRealSymbolAccess().getRealKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSolverLanguage.g:2579:1: rule__RealSymbol__Group__1 : rule__RealSymbol__Group__1__Impl ;
    public final void rule__RealSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2583:1: ( rule__RealSymbol__Group__1__Impl )
            // InternalSolverLanguage.g:2584:2: rule__RealSymbol__Group__1__Impl
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
    // InternalSolverLanguage.g:2590:1: rule__RealSymbol__Group__1__Impl : ( () ) ;
    public final void rule__RealSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2594:1: ( ( () ) )
            // InternalSolverLanguage.g:2595:1: ( () )
            {
            // InternalSolverLanguage.g:2595:1: ( () )
            // InternalSolverLanguage.g:2596:2: ()
            {
             before(grammarAccess.getRealSymbolAccess().getRealSymbolAction_1()); 
            // InternalSolverLanguage.g:2597:2: ()
            // InternalSolverLanguage.g:2597:3: 
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
    // InternalSolverLanguage.g:2606:1: rule__StringSymbol__Group__0 : rule__StringSymbol__Group__0__Impl rule__StringSymbol__Group__1 ;
    public final void rule__StringSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2610:1: ( rule__StringSymbol__Group__0__Impl rule__StringSymbol__Group__1 )
            // InternalSolverLanguage.g:2611:2: rule__StringSymbol__Group__0__Impl rule__StringSymbol__Group__1
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
    // InternalSolverLanguage.g:2618:1: rule__StringSymbol__Group__0__Impl : ( 'string' ) ;
    public final void rule__StringSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2622:1: ( ( 'string' ) )
            // InternalSolverLanguage.g:2623:1: ( 'string' )
            {
            // InternalSolverLanguage.g:2623:1: ( 'string' )
            // InternalSolverLanguage.g:2624:2: 'string'
            {
             before(grammarAccess.getStringSymbolAccess().getStringKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSolverLanguage.g:2633:1: rule__StringSymbol__Group__1 : rule__StringSymbol__Group__1__Impl ;
    public final void rule__StringSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2637:1: ( rule__StringSymbol__Group__1__Impl )
            // InternalSolverLanguage.g:2638:2: rule__StringSymbol__Group__1__Impl
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
    // InternalSolverLanguage.g:2644:1: rule__StringSymbol__Group__1__Impl : ( () ) ;
    public final void rule__StringSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2648:1: ( ( () ) )
            // InternalSolverLanguage.g:2649:1: ( () )
            {
            // InternalSolverLanguage.g:2649:1: ( () )
            // InternalSolverLanguage.g:2650:2: ()
            {
             before(grammarAccess.getStringSymbolAccess().getStringSymbolAction_1()); 
            // InternalSolverLanguage.g:2651:2: ()
            // InternalSolverLanguage.g:2651:3: 
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
    // InternalSolverLanguage.g:2660:1: rule__NamedObject__Group__0 : rule__NamedObject__Group__0__Impl rule__NamedObject__Group__1 ;
    public final void rule__NamedObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2664:1: ( rule__NamedObject__Group__0__Impl rule__NamedObject__Group__1 )
            // InternalSolverLanguage.g:2665:2: rule__NamedObject__Group__0__Impl rule__NamedObject__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSolverLanguage.g:2672:1: rule__NamedObject__Group__0__Impl : ( '\\'' ) ;
    public final void rule__NamedObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2676:1: ( ( '\\'' ) )
            // InternalSolverLanguage.g:2677:1: ( '\\'' )
            {
            // InternalSolverLanguage.g:2677:1: ( '\\'' )
            // InternalSolverLanguage.g:2678:2: '\\''
            {
             before(grammarAccess.getNamedObjectAccess().getApostropheKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSolverLanguage.g:2687:1: rule__NamedObject__Group__1 : rule__NamedObject__Group__1__Impl rule__NamedObject__Group__2 ;
    public final void rule__NamedObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2691:1: ( rule__NamedObject__Group__1__Impl rule__NamedObject__Group__2 )
            // InternalSolverLanguage.g:2692:2: rule__NamedObject__Group__1__Impl rule__NamedObject__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSolverLanguage.g:2699:1: rule__NamedObject__Group__1__Impl : ( ( rule__NamedObject__NameAssignment_1 ) ) ;
    public final void rule__NamedObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2703:1: ( ( ( rule__NamedObject__NameAssignment_1 ) ) )
            // InternalSolverLanguage.g:2704:1: ( ( rule__NamedObject__NameAssignment_1 ) )
            {
            // InternalSolverLanguage.g:2704:1: ( ( rule__NamedObject__NameAssignment_1 ) )
            // InternalSolverLanguage.g:2705:2: ( rule__NamedObject__NameAssignment_1 )
            {
             before(grammarAccess.getNamedObjectAccess().getNameAssignment_1()); 
            // InternalSolverLanguage.g:2706:2: ( rule__NamedObject__NameAssignment_1 )
            // InternalSolverLanguage.g:2706:3: rule__NamedObject__NameAssignment_1
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
    // InternalSolverLanguage.g:2714:1: rule__NamedObject__Group__2 : rule__NamedObject__Group__2__Impl ;
    public final void rule__NamedObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2718:1: ( rule__NamedObject__Group__2__Impl )
            // InternalSolverLanguage.g:2719:2: rule__NamedObject__Group__2__Impl
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
    // InternalSolverLanguage.g:2725:1: rule__NamedObject__Group__2__Impl : ( '\\'' ) ;
    public final void rule__NamedObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2729:1: ( ( '\\'' ) )
            // InternalSolverLanguage.g:2730:1: ( '\\'' )
            {
            // InternalSolverLanguage.g:2730:1: ( '\\'' )
            // InternalSolverLanguage.g:2731:2: '\\''
            {
             before(grammarAccess.getNamedObjectAccess().getApostropheKeyword_2()); 
            match(input,26,FOLLOW_2); 
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


    // $ANTLR start "rule__PredicateSymbol__Group__0"
    // InternalSolverLanguage.g:2741:1: rule__PredicateSymbol__Group__0 : rule__PredicateSymbol__Group__0__Impl rule__PredicateSymbol__Group__1 ;
    public final void rule__PredicateSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2745:1: ( rule__PredicateSymbol__Group__0__Impl rule__PredicateSymbol__Group__1 )
            // InternalSolverLanguage.g:2746:2: rule__PredicateSymbol__Group__0__Impl rule__PredicateSymbol__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__PredicateSymbol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateSymbol__Group__1();

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
    // $ANTLR end "rule__PredicateSymbol__Group__0"


    // $ANTLR start "rule__PredicateSymbol__Group__0__Impl"
    // InternalSolverLanguage.g:2753:1: rule__PredicateSymbol__Group__0__Impl : ( 'predicate' ) ;
    public final void rule__PredicateSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2757:1: ( ( 'predicate' ) )
            // InternalSolverLanguage.g:2758:1: ( 'predicate' )
            {
            // InternalSolverLanguage.g:2758:1: ( 'predicate' )
            // InternalSolverLanguage.g:2759:2: 'predicate'
            {
             before(grammarAccess.getPredicateSymbolAccess().getPredicateKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPredicateSymbolAccess().getPredicateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateSymbol__Group__0__Impl"


    // $ANTLR start "rule__PredicateSymbol__Group__1"
    // InternalSolverLanguage.g:2768:1: rule__PredicateSymbol__Group__1 : rule__PredicateSymbol__Group__1__Impl rule__PredicateSymbol__Group__2 ;
    public final void rule__PredicateSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2772:1: ( rule__PredicateSymbol__Group__1__Impl rule__PredicateSymbol__Group__2 )
            // InternalSolverLanguage.g:2773:2: rule__PredicateSymbol__Group__1__Impl rule__PredicateSymbol__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__PredicateSymbol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateSymbol__Group__2();

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
    // $ANTLR end "rule__PredicateSymbol__Group__1"


    // $ANTLR start "rule__PredicateSymbol__Group__1__Impl"
    // InternalSolverLanguage.g:2780:1: rule__PredicateSymbol__Group__1__Impl : ( ( rule__PredicateSymbol__SymbolAssignment_1 ) ) ;
    public final void rule__PredicateSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2784:1: ( ( ( rule__PredicateSymbol__SymbolAssignment_1 ) ) )
            // InternalSolverLanguage.g:2785:1: ( ( rule__PredicateSymbol__SymbolAssignment_1 ) )
            {
            // InternalSolverLanguage.g:2785:1: ( ( rule__PredicateSymbol__SymbolAssignment_1 ) )
            // InternalSolverLanguage.g:2786:2: ( rule__PredicateSymbol__SymbolAssignment_1 )
            {
             before(grammarAccess.getPredicateSymbolAccess().getSymbolAssignment_1()); 
            // InternalSolverLanguage.g:2787:2: ( rule__PredicateSymbol__SymbolAssignment_1 )
            // InternalSolverLanguage.g:2787:3: rule__PredicateSymbol__SymbolAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PredicateSymbol__SymbolAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateSymbolAccess().getSymbolAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateSymbol__Group__1__Impl"


    // $ANTLR start "rule__PredicateSymbol__Group__2"
    // InternalSolverLanguage.g:2795:1: rule__PredicateSymbol__Group__2 : rule__PredicateSymbol__Group__2__Impl rule__PredicateSymbol__Group__3 ;
    public final void rule__PredicateSymbol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2799:1: ( rule__PredicateSymbol__Group__2__Impl rule__PredicateSymbol__Group__3 )
            // InternalSolverLanguage.g:2800:2: rule__PredicateSymbol__Group__2__Impl rule__PredicateSymbol__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__PredicateSymbol__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateSymbol__Group__3();

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
    // $ANTLR end "rule__PredicateSymbol__Group__2"


    // $ANTLR start "rule__PredicateSymbol__Group__2__Impl"
    // InternalSolverLanguage.g:2807:1: rule__PredicateSymbol__Group__2__Impl : ( '(' ) ;
    public final void rule__PredicateSymbol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2811:1: ( ( '(' ) )
            // InternalSolverLanguage.g:2812:1: ( '(' )
            {
            // InternalSolverLanguage.g:2812:1: ( '(' )
            // InternalSolverLanguage.g:2813:2: '('
            {
             before(grammarAccess.getPredicateSymbolAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPredicateSymbolAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateSymbol__Group__2__Impl"


    // $ANTLR start "rule__PredicateSymbol__Group__3"
    // InternalSolverLanguage.g:2822:1: rule__PredicateSymbol__Group__3 : rule__PredicateSymbol__Group__3__Impl rule__PredicateSymbol__Group__4 ;
    public final void rule__PredicateSymbol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2826:1: ( rule__PredicateSymbol__Group__3__Impl rule__PredicateSymbol__Group__4 )
            // InternalSolverLanguage.g:2827:2: rule__PredicateSymbol__Group__3__Impl rule__PredicateSymbol__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__PredicateSymbol__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateSymbol__Group__4();

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
    // $ANTLR end "rule__PredicateSymbol__Group__3"


    // $ANTLR start "rule__PredicateSymbol__Group__3__Impl"
    // InternalSolverLanguage.g:2834:1: rule__PredicateSymbol__Group__3__Impl : ( ( rule__PredicateSymbol__ParametersAssignment_3 )* ) ;
    public final void rule__PredicateSymbol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2838:1: ( ( ( rule__PredicateSymbol__ParametersAssignment_3 )* ) )
            // InternalSolverLanguage.g:2839:1: ( ( rule__PredicateSymbol__ParametersAssignment_3 )* )
            {
            // InternalSolverLanguage.g:2839:1: ( ( rule__PredicateSymbol__ParametersAssignment_3 )* )
            // InternalSolverLanguage.g:2840:2: ( rule__PredicateSymbol__ParametersAssignment_3 )*
            {
             before(grammarAccess.getPredicateSymbolAccess().getParametersAssignment_3()); 
            // InternalSolverLanguage.g:2841:2: ( rule__PredicateSymbol__ParametersAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSolverLanguage.g:2841:3: rule__PredicateSymbol__ParametersAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__PredicateSymbol__ParametersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getPredicateSymbolAccess().getParametersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateSymbol__Group__3__Impl"


    // $ANTLR start "rule__PredicateSymbol__Group__4"
    // InternalSolverLanguage.g:2849:1: rule__PredicateSymbol__Group__4 : rule__PredicateSymbol__Group__4__Impl rule__PredicateSymbol__Group__5 ;
    public final void rule__PredicateSymbol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2853:1: ( rule__PredicateSymbol__Group__4__Impl rule__PredicateSymbol__Group__5 )
            // InternalSolverLanguage.g:2854:2: rule__PredicateSymbol__Group__4__Impl rule__PredicateSymbol__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__PredicateSymbol__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateSymbol__Group__5();

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
    // $ANTLR end "rule__PredicateSymbol__Group__4"


    // $ANTLR start "rule__PredicateSymbol__Group__4__Impl"
    // InternalSolverLanguage.g:2861:1: rule__PredicateSymbol__Group__4__Impl : ( ')' ) ;
    public final void rule__PredicateSymbol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2865:1: ( ( ')' ) )
            // InternalSolverLanguage.g:2866:1: ( ')' )
            {
            // InternalSolverLanguage.g:2866:1: ( ')' )
            // InternalSolverLanguage.g:2867:2: ')'
            {
             before(grammarAccess.getPredicateSymbolAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPredicateSymbolAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateSymbol__Group__4__Impl"


    // $ANTLR start "rule__PredicateSymbol__Group__5"
    // InternalSolverLanguage.g:2876:1: rule__PredicateSymbol__Group__5 : rule__PredicateSymbol__Group__5__Impl rule__PredicateSymbol__Group__6 ;
    public final void rule__PredicateSymbol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2880:1: ( rule__PredicateSymbol__Group__5__Impl rule__PredicateSymbol__Group__6 )
            // InternalSolverLanguage.g:2881:2: rule__PredicateSymbol__Group__5__Impl rule__PredicateSymbol__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__PredicateSymbol__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateSymbol__Group__6();

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
    // $ANTLR end "rule__PredicateSymbol__Group__5"


    // $ANTLR start "rule__PredicateSymbol__Group__5__Impl"
    // InternalSolverLanguage.g:2888:1: rule__PredicateSymbol__Group__5__Impl : ( ':' ) ;
    public final void rule__PredicateSymbol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2892:1: ( ( ':' ) )
            // InternalSolverLanguage.g:2893:1: ( ':' )
            {
            // InternalSolverLanguage.g:2893:1: ( ':' )
            // InternalSolverLanguage.g:2894:2: ':'
            {
             before(grammarAccess.getPredicateSymbolAccess().getColonKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPredicateSymbolAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateSymbol__Group__5__Impl"


    // $ANTLR start "rule__PredicateSymbol__Group__6"
    // InternalSolverLanguage.g:2903:1: rule__PredicateSymbol__Group__6 : rule__PredicateSymbol__Group__6__Impl rule__PredicateSymbol__Group__7 ;
    public final void rule__PredicateSymbol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2907:1: ( rule__PredicateSymbol__Group__6__Impl rule__PredicateSymbol__Group__7 )
            // InternalSolverLanguage.g:2908:2: rule__PredicateSymbol__Group__6__Impl rule__PredicateSymbol__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__PredicateSymbol__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateSymbol__Group__7();

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
    // $ANTLR end "rule__PredicateSymbol__Group__6"


    // $ANTLR start "rule__PredicateSymbol__Group__6__Impl"
    // InternalSolverLanguage.g:2915:1: rule__PredicateSymbol__Group__6__Impl : ( ( rule__PredicateSymbol__Alternatives_6 ) ) ;
    public final void rule__PredicateSymbol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2919:1: ( ( ( rule__PredicateSymbol__Alternatives_6 ) ) )
            // InternalSolverLanguage.g:2920:1: ( ( rule__PredicateSymbol__Alternatives_6 ) )
            {
            // InternalSolverLanguage.g:2920:1: ( ( rule__PredicateSymbol__Alternatives_6 ) )
            // InternalSolverLanguage.g:2921:2: ( rule__PredicateSymbol__Alternatives_6 )
            {
             before(grammarAccess.getPredicateSymbolAccess().getAlternatives_6()); 
            // InternalSolverLanguage.g:2922:2: ( rule__PredicateSymbol__Alternatives_6 )
            // InternalSolverLanguage.g:2922:3: rule__PredicateSymbol__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__PredicateSymbol__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getPredicateSymbolAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateSymbol__Group__6__Impl"


    // $ANTLR start "rule__PredicateSymbol__Group__7"
    // InternalSolverLanguage.g:2930:1: rule__PredicateSymbol__Group__7 : rule__PredicateSymbol__Group__7__Impl ;
    public final void rule__PredicateSymbol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2934:1: ( rule__PredicateSymbol__Group__7__Impl )
            // InternalSolverLanguage.g:2935:2: rule__PredicateSymbol__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateSymbol__Group__7__Impl();

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
    // $ANTLR end "rule__PredicateSymbol__Group__7"


    // $ANTLR start "rule__PredicateSymbol__Group__7__Impl"
    // InternalSolverLanguage.g:2941:1: rule__PredicateSymbol__Group__7__Impl : ( '.' ) ;
    public final void rule__PredicateSymbol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2945:1: ( ( '.' ) )
            // InternalSolverLanguage.g:2946:1: ( '.' )
            {
            // InternalSolverLanguage.g:2946:1: ( '.' )
            // InternalSolverLanguage.g:2947:2: '.'
            {
             before(grammarAccess.getPredicateSymbolAccess().getFullStopKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPredicateSymbolAccess().getFullStopKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateSymbol__Group__7__Impl"


    // $ANTLR start "rule__PredicateSymbol__Group_6_1__0"
    // InternalSolverLanguage.g:2957:1: rule__PredicateSymbol__Group_6_1__0 : rule__PredicateSymbol__Group_6_1__0__Impl rule__PredicateSymbol__Group_6_1__1 ;
    public final void rule__PredicateSymbol__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2961:1: ( rule__PredicateSymbol__Group_6_1__0__Impl rule__PredicateSymbol__Group_6_1__1 )
            // InternalSolverLanguage.g:2962:2: rule__PredicateSymbol__Group_6_1__0__Impl rule__PredicateSymbol__Group_6_1__1
            {
            pushFollow(FOLLOW_21);
            rule__PredicateSymbol__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateSymbol__Group_6_1__1();

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
    // $ANTLR end "rule__PredicateSymbol__Group_6_1__0"


    // $ANTLR start "rule__PredicateSymbol__Group_6_1__0__Impl"
    // InternalSolverLanguage.g:2969:1: rule__PredicateSymbol__Group_6_1__0__Impl : ( ( rule__PredicateSymbol__BodiesAssignment_6_1_0 ) ) ;
    public final void rule__PredicateSymbol__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2973:1: ( ( ( rule__PredicateSymbol__BodiesAssignment_6_1_0 ) ) )
            // InternalSolverLanguage.g:2974:1: ( ( rule__PredicateSymbol__BodiesAssignment_6_1_0 ) )
            {
            // InternalSolverLanguage.g:2974:1: ( ( rule__PredicateSymbol__BodiesAssignment_6_1_0 ) )
            // InternalSolverLanguage.g:2975:2: ( rule__PredicateSymbol__BodiesAssignment_6_1_0 )
            {
             before(grammarAccess.getPredicateSymbolAccess().getBodiesAssignment_6_1_0()); 
            // InternalSolverLanguage.g:2976:2: ( rule__PredicateSymbol__BodiesAssignment_6_1_0 )
            // InternalSolverLanguage.g:2976:3: rule__PredicateSymbol__BodiesAssignment_6_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateSymbol__BodiesAssignment_6_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateSymbolAccess().getBodiesAssignment_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateSymbol__Group_6_1__0__Impl"


    // $ANTLR start "rule__PredicateSymbol__Group_6_1__1"
    // InternalSolverLanguage.g:2984:1: rule__PredicateSymbol__Group_6_1__1 : rule__PredicateSymbol__Group_6_1__1__Impl ;
    public final void rule__PredicateSymbol__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2988:1: ( rule__PredicateSymbol__Group_6_1__1__Impl )
            // InternalSolverLanguage.g:2989:2: rule__PredicateSymbol__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateSymbol__Group_6_1__1__Impl();

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
    // $ANTLR end "rule__PredicateSymbol__Group_6_1__1"


    // $ANTLR start "rule__PredicateSymbol__Group_6_1__1__Impl"
    // InternalSolverLanguage.g:2995:1: rule__PredicateSymbol__Group_6_1__1__Impl : ( ( rule__PredicateSymbol__Group_6_1_1__0 )* ) ;
    public final void rule__PredicateSymbol__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:2999:1: ( ( ( rule__PredicateSymbol__Group_6_1_1__0 )* ) )
            // InternalSolverLanguage.g:3000:1: ( ( rule__PredicateSymbol__Group_6_1_1__0 )* )
            {
            // InternalSolverLanguage.g:3000:1: ( ( rule__PredicateSymbol__Group_6_1_1__0 )* )
            // InternalSolverLanguage.g:3001:2: ( rule__PredicateSymbol__Group_6_1_1__0 )*
            {
             before(grammarAccess.getPredicateSymbolAccess().getGroup_6_1_1()); 
            // InternalSolverLanguage.g:3002:2: ( rule__PredicateSymbol__Group_6_1_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==28) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSolverLanguage.g:3002:3: rule__PredicateSymbol__Group_6_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__PredicateSymbol__Group_6_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getPredicateSymbolAccess().getGroup_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateSymbol__Group_6_1__1__Impl"


    // $ANTLR start "rule__PredicateSymbol__Group_6_1_1__0"
    // InternalSolverLanguage.g:3011:1: rule__PredicateSymbol__Group_6_1_1__0 : rule__PredicateSymbol__Group_6_1_1__0__Impl rule__PredicateSymbol__Group_6_1_1__1 ;
    public final void rule__PredicateSymbol__Group_6_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3015:1: ( rule__PredicateSymbol__Group_6_1_1__0__Impl rule__PredicateSymbol__Group_6_1_1__1 )
            // InternalSolverLanguage.g:3016:2: rule__PredicateSymbol__Group_6_1_1__0__Impl rule__PredicateSymbol__Group_6_1_1__1
            {
            pushFollow(FOLLOW_20);
            rule__PredicateSymbol__Group_6_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateSymbol__Group_6_1_1__1();

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
    // $ANTLR end "rule__PredicateSymbol__Group_6_1_1__0"


    // $ANTLR start "rule__PredicateSymbol__Group_6_1_1__0__Impl"
    // InternalSolverLanguage.g:3023:1: rule__PredicateSymbol__Group_6_1_1__0__Impl : ( '|' ) ;
    public final void rule__PredicateSymbol__Group_6_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3027:1: ( ( '|' ) )
            // InternalSolverLanguage.g:3028:1: ( '|' )
            {
            // InternalSolverLanguage.g:3028:1: ( '|' )
            // InternalSolverLanguage.g:3029:2: '|'
            {
             before(grammarAccess.getPredicateSymbolAccess().getVerticalLineKeyword_6_1_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPredicateSymbolAccess().getVerticalLineKeyword_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateSymbol__Group_6_1_1__0__Impl"


    // $ANTLR start "rule__PredicateSymbol__Group_6_1_1__1"
    // InternalSolverLanguage.g:3038:1: rule__PredicateSymbol__Group_6_1_1__1 : rule__PredicateSymbol__Group_6_1_1__1__Impl ;
    public final void rule__PredicateSymbol__Group_6_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3042:1: ( rule__PredicateSymbol__Group_6_1_1__1__Impl )
            // InternalSolverLanguage.g:3043:2: rule__PredicateSymbol__Group_6_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateSymbol__Group_6_1_1__1__Impl();

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
    // $ANTLR end "rule__PredicateSymbol__Group_6_1_1__1"


    // $ANTLR start "rule__PredicateSymbol__Group_6_1_1__1__Impl"
    // InternalSolverLanguage.g:3049:1: rule__PredicateSymbol__Group_6_1_1__1__Impl : ( ( rule__PredicateSymbol__BodiesAssignment_6_1_1_1 ) ) ;
    public final void rule__PredicateSymbol__Group_6_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3053:1: ( ( ( rule__PredicateSymbol__BodiesAssignment_6_1_1_1 ) ) )
            // InternalSolverLanguage.g:3054:1: ( ( rule__PredicateSymbol__BodiesAssignment_6_1_1_1 ) )
            {
            // InternalSolverLanguage.g:3054:1: ( ( rule__PredicateSymbol__BodiesAssignment_6_1_1_1 ) )
            // InternalSolverLanguage.g:3055:2: ( rule__PredicateSymbol__BodiesAssignment_6_1_1_1 )
            {
             before(grammarAccess.getPredicateSymbolAccess().getBodiesAssignment_6_1_1_1()); 
            // InternalSolverLanguage.g:3056:2: ( rule__PredicateSymbol__BodiesAssignment_6_1_1_1 )
            // InternalSolverLanguage.g:3056:3: rule__PredicateSymbol__BodiesAssignment_6_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PredicateSymbol__BodiesAssignment_6_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateSymbolAccess().getBodiesAssignment_6_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateSymbol__Group_6_1_1__1__Impl"


    // $ANTLR start "rule__ErrorPredicate__Group__0"
    // InternalSolverLanguage.g:3065:1: rule__ErrorPredicate__Group__0 : rule__ErrorPredicate__Group__0__Impl rule__ErrorPredicate__Group__1 ;
    public final void rule__ErrorPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3069:1: ( rule__ErrorPredicate__Group__0__Impl rule__ErrorPredicate__Group__1 )
            // InternalSolverLanguage.g:3070:2: rule__ErrorPredicate__Group__0__Impl rule__ErrorPredicate__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ErrorPredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__Group__1();

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
    // $ANTLR end "rule__ErrorPredicate__Group__0"


    // $ANTLR start "rule__ErrorPredicate__Group__0__Impl"
    // InternalSolverLanguage.g:3077:1: rule__ErrorPredicate__Group__0__Impl : ( () ) ;
    public final void rule__ErrorPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3081:1: ( ( () ) )
            // InternalSolverLanguage.g:3082:1: ( () )
            {
            // InternalSolverLanguage.g:3082:1: ( () )
            // InternalSolverLanguage.g:3083:2: ()
            {
             before(grammarAccess.getErrorPredicateAccess().getErrorPredicateAction_0()); 
            // InternalSolverLanguage.g:3084:2: ()
            // InternalSolverLanguage.g:3084:3: 
            {
            }

             after(grammarAccess.getErrorPredicateAccess().getErrorPredicateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__Group__0__Impl"


    // $ANTLR start "rule__ErrorPredicate__Group__1"
    // InternalSolverLanguage.g:3092:1: rule__ErrorPredicate__Group__1 : rule__ErrorPredicate__Group__1__Impl rule__ErrorPredicate__Group__2 ;
    public final void rule__ErrorPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3096:1: ( rule__ErrorPredicate__Group__1__Impl rule__ErrorPredicate__Group__2 )
            // InternalSolverLanguage.g:3097:2: rule__ErrorPredicate__Group__1__Impl rule__ErrorPredicate__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ErrorPredicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__Group__2();

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
    // $ANTLR end "rule__ErrorPredicate__Group__1"


    // $ANTLR start "rule__ErrorPredicate__Group__1__Impl"
    // InternalSolverLanguage.g:3104:1: rule__ErrorPredicate__Group__1__Impl : ( 'error' ) ;
    public final void rule__ErrorPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3108:1: ( ( 'error' ) )
            // InternalSolverLanguage.g:3109:1: ( 'error' )
            {
            // InternalSolverLanguage.g:3109:1: ( 'error' )
            // InternalSolverLanguage.g:3110:2: 'error'
            {
             before(grammarAccess.getErrorPredicateAccess().getErrorKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getErrorPredicateAccess().getErrorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__Group__1__Impl"


    // $ANTLR start "rule__ErrorPredicate__Group__2"
    // InternalSolverLanguage.g:3119:1: rule__ErrorPredicate__Group__2 : rule__ErrorPredicate__Group__2__Impl rule__ErrorPredicate__Group__3 ;
    public final void rule__ErrorPredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3123:1: ( rule__ErrorPredicate__Group__2__Impl rule__ErrorPredicate__Group__3 )
            // InternalSolverLanguage.g:3124:2: rule__ErrorPredicate__Group__2__Impl rule__ErrorPredicate__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ErrorPredicate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__Group__3();

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
    // $ANTLR end "rule__ErrorPredicate__Group__2"


    // $ANTLR start "rule__ErrorPredicate__Group__2__Impl"
    // InternalSolverLanguage.g:3131:1: rule__ErrorPredicate__Group__2__Impl : ( ( rule__ErrorPredicate__NameAssignment_2 )? ) ;
    public final void rule__ErrorPredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3135:1: ( ( ( rule__ErrorPredicate__NameAssignment_2 )? ) )
            // InternalSolverLanguage.g:3136:1: ( ( rule__ErrorPredicate__NameAssignment_2 )? )
            {
            // InternalSolverLanguage.g:3136:1: ( ( rule__ErrorPredicate__NameAssignment_2 )? )
            // InternalSolverLanguage.g:3137:2: ( rule__ErrorPredicate__NameAssignment_2 )?
            {
             before(grammarAccess.getErrorPredicateAccess().getNameAssignment_2()); 
            // InternalSolverLanguage.g:3138:2: ( rule__ErrorPredicate__NameAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSolverLanguage.g:3138:3: rule__ErrorPredicate__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ErrorPredicate__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getErrorPredicateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__Group__2__Impl"


    // $ANTLR start "rule__ErrorPredicate__Group__3"
    // InternalSolverLanguage.g:3146:1: rule__ErrorPredicate__Group__3 : rule__ErrorPredicate__Group__3__Impl rule__ErrorPredicate__Group__4 ;
    public final void rule__ErrorPredicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3150:1: ( rule__ErrorPredicate__Group__3__Impl rule__ErrorPredicate__Group__4 )
            // InternalSolverLanguage.g:3151:2: rule__ErrorPredicate__Group__3__Impl rule__ErrorPredicate__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ErrorPredicate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__Group__4();

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
    // $ANTLR end "rule__ErrorPredicate__Group__3"


    // $ANTLR start "rule__ErrorPredicate__Group__3__Impl"
    // InternalSolverLanguage.g:3158:1: rule__ErrorPredicate__Group__3__Impl : ( ( rule__ErrorPredicate__Group_3__0 ) ) ;
    public final void rule__ErrorPredicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3162:1: ( ( ( rule__ErrorPredicate__Group_3__0 ) ) )
            // InternalSolverLanguage.g:3163:1: ( ( rule__ErrorPredicate__Group_3__0 ) )
            {
            // InternalSolverLanguage.g:3163:1: ( ( rule__ErrorPredicate__Group_3__0 ) )
            // InternalSolverLanguage.g:3164:2: ( rule__ErrorPredicate__Group_3__0 )
            {
             before(grammarAccess.getErrorPredicateAccess().getGroup_3()); 
            // InternalSolverLanguage.g:3165:2: ( rule__ErrorPredicate__Group_3__0 )
            // InternalSolverLanguage.g:3165:3: rule__ErrorPredicate__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getErrorPredicateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__Group__3__Impl"


    // $ANTLR start "rule__ErrorPredicate__Group__4"
    // InternalSolverLanguage.g:3173:1: rule__ErrorPredicate__Group__4 : rule__ErrorPredicate__Group__4__Impl rule__ErrorPredicate__Group__5 ;
    public final void rule__ErrorPredicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3177:1: ( rule__ErrorPredicate__Group__4__Impl rule__ErrorPredicate__Group__5 )
            // InternalSolverLanguage.g:3178:2: rule__ErrorPredicate__Group__4__Impl rule__ErrorPredicate__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__ErrorPredicate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__Group__5();

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
    // $ANTLR end "rule__ErrorPredicate__Group__4"


    // $ANTLR start "rule__ErrorPredicate__Group__4__Impl"
    // InternalSolverLanguage.g:3185:1: rule__ErrorPredicate__Group__4__Impl : ( ':' ) ;
    public final void rule__ErrorPredicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3189:1: ( ( ':' ) )
            // InternalSolverLanguage.g:3190:1: ( ':' )
            {
            // InternalSolverLanguage.g:3190:1: ( ':' )
            // InternalSolverLanguage.g:3191:2: ':'
            {
             before(grammarAccess.getErrorPredicateAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getErrorPredicateAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__Group__4__Impl"


    // $ANTLR start "rule__ErrorPredicate__Group__5"
    // InternalSolverLanguage.g:3200:1: rule__ErrorPredicate__Group__5 : rule__ErrorPredicate__Group__5__Impl rule__ErrorPredicate__Group__6 ;
    public final void rule__ErrorPredicate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3204:1: ( rule__ErrorPredicate__Group__5__Impl rule__ErrorPredicate__Group__6 )
            // InternalSolverLanguage.g:3205:2: rule__ErrorPredicate__Group__5__Impl rule__ErrorPredicate__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ErrorPredicate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__Group__6();

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
    // $ANTLR end "rule__ErrorPredicate__Group__5"


    // $ANTLR start "rule__ErrorPredicate__Group__5__Impl"
    // InternalSolverLanguage.g:3212:1: rule__ErrorPredicate__Group__5__Impl : ( ( rule__ErrorPredicate__Alternatives_5 ) ) ;
    public final void rule__ErrorPredicate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3216:1: ( ( ( rule__ErrorPredicate__Alternatives_5 ) ) )
            // InternalSolverLanguage.g:3217:1: ( ( rule__ErrorPredicate__Alternatives_5 ) )
            {
            // InternalSolverLanguage.g:3217:1: ( ( rule__ErrorPredicate__Alternatives_5 ) )
            // InternalSolverLanguage.g:3218:2: ( rule__ErrorPredicate__Alternatives_5 )
            {
             before(grammarAccess.getErrorPredicateAccess().getAlternatives_5()); 
            // InternalSolverLanguage.g:3219:2: ( rule__ErrorPredicate__Alternatives_5 )
            // InternalSolverLanguage.g:3219:3: rule__ErrorPredicate__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getErrorPredicateAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__Group__5__Impl"


    // $ANTLR start "rule__ErrorPredicate__Group__6"
    // InternalSolverLanguage.g:3227:1: rule__ErrorPredicate__Group__6 : rule__ErrorPredicate__Group__6__Impl ;
    public final void rule__ErrorPredicate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3231:1: ( rule__ErrorPredicate__Group__6__Impl )
            // InternalSolverLanguage.g:3232:2: rule__ErrorPredicate__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__Group__6__Impl();

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
    // $ANTLR end "rule__ErrorPredicate__Group__6"


    // $ANTLR start "rule__ErrorPredicate__Group__6__Impl"
    // InternalSolverLanguage.g:3238:1: rule__ErrorPredicate__Group__6__Impl : ( '.' ) ;
    public final void rule__ErrorPredicate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3242:1: ( ( '.' ) )
            // InternalSolverLanguage.g:3243:1: ( '.' )
            {
            // InternalSolverLanguage.g:3243:1: ( '.' )
            // InternalSolverLanguage.g:3244:2: '.'
            {
             before(grammarAccess.getErrorPredicateAccess().getFullStopKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getErrorPredicateAccess().getFullStopKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__Group__6__Impl"


    // $ANTLR start "rule__ErrorPredicate__Group_3__0"
    // InternalSolverLanguage.g:3254:1: rule__ErrorPredicate__Group_3__0 : rule__ErrorPredicate__Group_3__0__Impl rule__ErrorPredicate__Group_3__1 ;
    public final void rule__ErrorPredicate__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3258:1: ( rule__ErrorPredicate__Group_3__0__Impl rule__ErrorPredicate__Group_3__1 )
            // InternalSolverLanguage.g:3259:2: rule__ErrorPredicate__Group_3__0__Impl rule__ErrorPredicate__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__ErrorPredicate__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__Group_3__1();

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
    // $ANTLR end "rule__ErrorPredicate__Group_3__0"


    // $ANTLR start "rule__ErrorPredicate__Group_3__0__Impl"
    // InternalSolverLanguage.g:3266:1: rule__ErrorPredicate__Group_3__0__Impl : ( '(' ) ;
    public final void rule__ErrorPredicate__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3270:1: ( ( '(' ) )
            // InternalSolverLanguage.g:3271:1: ( '(' )
            {
            // InternalSolverLanguage.g:3271:1: ( '(' )
            // InternalSolverLanguage.g:3272:2: '('
            {
             before(grammarAccess.getErrorPredicateAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getErrorPredicateAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__Group_3__0__Impl"


    // $ANTLR start "rule__ErrorPredicate__Group_3__1"
    // InternalSolverLanguage.g:3281:1: rule__ErrorPredicate__Group_3__1 : rule__ErrorPredicate__Group_3__1__Impl rule__ErrorPredicate__Group_3__2 ;
    public final void rule__ErrorPredicate__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3285:1: ( rule__ErrorPredicate__Group_3__1__Impl rule__ErrorPredicate__Group_3__2 )
            // InternalSolverLanguage.g:3286:2: rule__ErrorPredicate__Group_3__1__Impl rule__ErrorPredicate__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__ErrorPredicate__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__Group_3__2();

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
    // $ANTLR end "rule__ErrorPredicate__Group_3__1"


    // $ANTLR start "rule__ErrorPredicate__Group_3__1__Impl"
    // InternalSolverLanguage.g:3293:1: rule__ErrorPredicate__Group_3__1__Impl : ( ( rule__ErrorPredicate__ParametersAssignment_3_1 )* ) ;
    public final void rule__ErrorPredicate__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3297:1: ( ( ( rule__ErrorPredicate__ParametersAssignment_3_1 )* ) )
            // InternalSolverLanguage.g:3298:1: ( ( rule__ErrorPredicate__ParametersAssignment_3_1 )* )
            {
            // InternalSolverLanguage.g:3298:1: ( ( rule__ErrorPredicate__ParametersAssignment_3_1 )* )
            // InternalSolverLanguage.g:3299:2: ( rule__ErrorPredicate__ParametersAssignment_3_1 )*
            {
             before(grammarAccess.getErrorPredicateAccess().getParametersAssignment_3_1()); 
            // InternalSolverLanguage.g:3300:2: ( rule__ErrorPredicate__ParametersAssignment_3_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSolverLanguage.g:3300:3: rule__ErrorPredicate__ParametersAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ErrorPredicate__ParametersAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getErrorPredicateAccess().getParametersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__Group_3__1__Impl"


    // $ANTLR start "rule__ErrorPredicate__Group_3__2"
    // InternalSolverLanguage.g:3308:1: rule__ErrorPredicate__Group_3__2 : rule__ErrorPredicate__Group_3__2__Impl ;
    public final void rule__ErrorPredicate__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3312:1: ( rule__ErrorPredicate__Group_3__2__Impl )
            // InternalSolverLanguage.g:3313:2: rule__ErrorPredicate__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__Group_3__2__Impl();

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
    // $ANTLR end "rule__ErrorPredicate__Group_3__2"


    // $ANTLR start "rule__ErrorPredicate__Group_3__2__Impl"
    // InternalSolverLanguage.g:3319:1: rule__ErrorPredicate__Group_3__2__Impl : ( ')' ) ;
    public final void rule__ErrorPredicate__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3323:1: ( ( ')' ) )
            // InternalSolverLanguage.g:3324:1: ( ')' )
            {
            // InternalSolverLanguage.g:3324:1: ( ')' )
            // InternalSolverLanguage.g:3325:2: ')'
            {
             before(grammarAccess.getErrorPredicateAccess().getRightParenthesisKeyword_3_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getErrorPredicateAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__Group_3__2__Impl"


    // $ANTLR start "rule__ErrorPredicate__Group_5_1__0"
    // InternalSolverLanguage.g:3335:1: rule__ErrorPredicate__Group_5_1__0 : rule__ErrorPredicate__Group_5_1__0__Impl rule__ErrorPredicate__Group_5_1__1 ;
    public final void rule__ErrorPredicate__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3339:1: ( rule__ErrorPredicate__Group_5_1__0__Impl rule__ErrorPredicate__Group_5_1__1 )
            // InternalSolverLanguage.g:3340:2: rule__ErrorPredicate__Group_5_1__0__Impl rule__ErrorPredicate__Group_5_1__1
            {
            pushFollow(FOLLOW_21);
            rule__ErrorPredicate__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__Group_5_1__1();

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
    // $ANTLR end "rule__ErrorPredicate__Group_5_1__0"


    // $ANTLR start "rule__ErrorPredicate__Group_5_1__0__Impl"
    // InternalSolverLanguage.g:3347:1: rule__ErrorPredicate__Group_5_1__0__Impl : ( ( rule__ErrorPredicate__BodiesAssignment_5_1_0 ) ) ;
    public final void rule__ErrorPredicate__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3351:1: ( ( ( rule__ErrorPredicate__BodiesAssignment_5_1_0 ) ) )
            // InternalSolverLanguage.g:3352:1: ( ( rule__ErrorPredicate__BodiesAssignment_5_1_0 ) )
            {
            // InternalSolverLanguage.g:3352:1: ( ( rule__ErrorPredicate__BodiesAssignment_5_1_0 ) )
            // InternalSolverLanguage.g:3353:2: ( rule__ErrorPredicate__BodiesAssignment_5_1_0 )
            {
             before(grammarAccess.getErrorPredicateAccess().getBodiesAssignment_5_1_0()); 
            // InternalSolverLanguage.g:3354:2: ( rule__ErrorPredicate__BodiesAssignment_5_1_0 )
            // InternalSolverLanguage.g:3354:3: rule__ErrorPredicate__BodiesAssignment_5_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__BodiesAssignment_5_1_0();

            state._fsp--;


            }

             after(grammarAccess.getErrorPredicateAccess().getBodiesAssignment_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__Group_5_1__0__Impl"


    // $ANTLR start "rule__ErrorPredicate__Group_5_1__1"
    // InternalSolverLanguage.g:3362:1: rule__ErrorPredicate__Group_5_1__1 : rule__ErrorPredicate__Group_5_1__1__Impl ;
    public final void rule__ErrorPredicate__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3366:1: ( rule__ErrorPredicate__Group_5_1__1__Impl )
            // InternalSolverLanguage.g:3367:2: rule__ErrorPredicate__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__ErrorPredicate__Group_5_1__1"


    // $ANTLR start "rule__ErrorPredicate__Group_5_1__1__Impl"
    // InternalSolverLanguage.g:3373:1: rule__ErrorPredicate__Group_5_1__1__Impl : ( ( rule__ErrorPredicate__Group_5_1_1__0 )* ) ;
    public final void rule__ErrorPredicate__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3377:1: ( ( ( rule__ErrorPredicate__Group_5_1_1__0 )* ) )
            // InternalSolverLanguage.g:3378:1: ( ( rule__ErrorPredicate__Group_5_1_1__0 )* )
            {
            // InternalSolverLanguage.g:3378:1: ( ( rule__ErrorPredicate__Group_5_1_1__0 )* )
            // InternalSolverLanguage.g:3379:2: ( rule__ErrorPredicate__Group_5_1_1__0 )*
            {
             before(grammarAccess.getErrorPredicateAccess().getGroup_5_1_1()); 
            // InternalSolverLanguage.g:3380:2: ( rule__ErrorPredicate__Group_5_1_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==28) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSolverLanguage.g:3380:3: rule__ErrorPredicate__Group_5_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ErrorPredicate__Group_5_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getErrorPredicateAccess().getGroup_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__Group_5_1__1__Impl"


    // $ANTLR start "rule__ErrorPredicate__Group_5_1_1__0"
    // InternalSolverLanguage.g:3389:1: rule__ErrorPredicate__Group_5_1_1__0 : rule__ErrorPredicate__Group_5_1_1__0__Impl rule__ErrorPredicate__Group_5_1_1__1 ;
    public final void rule__ErrorPredicate__Group_5_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3393:1: ( rule__ErrorPredicate__Group_5_1_1__0__Impl rule__ErrorPredicate__Group_5_1_1__1 )
            // InternalSolverLanguage.g:3394:2: rule__ErrorPredicate__Group_5_1_1__0__Impl rule__ErrorPredicate__Group_5_1_1__1
            {
            pushFollow(FOLLOW_20);
            rule__ErrorPredicate__Group_5_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__Group_5_1_1__1();

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
    // $ANTLR end "rule__ErrorPredicate__Group_5_1_1__0"


    // $ANTLR start "rule__ErrorPredicate__Group_5_1_1__0__Impl"
    // InternalSolverLanguage.g:3401:1: rule__ErrorPredicate__Group_5_1_1__0__Impl : ( '|' ) ;
    public final void rule__ErrorPredicate__Group_5_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3405:1: ( ( '|' ) )
            // InternalSolverLanguage.g:3406:1: ( '|' )
            {
            // InternalSolverLanguage.g:3406:1: ( '|' )
            // InternalSolverLanguage.g:3407:2: '|'
            {
             before(grammarAccess.getErrorPredicateAccess().getVerticalLineKeyword_5_1_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getErrorPredicateAccess().getVerticalLineKeyword_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__Group_5_1_1__0__Impl"


    // $ANTLR start "rule__ErrorPredicate__Group_5_1_1__1"
    // InternalSolverLanguage.g:3416:1: rule__ErrorPredicate__Group_5_1_1__1 : rule__ErrorPredicate__Group_5_1_1__1__Impl ;
    public final void rule__ErrorPredicate__Group_5_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3420:1: ( rule__ErrorPredicate__Group_5_1_1__1__Impl )
            // InternalSolverLanguage.g:3421:2: rule__ErrorPredicate__Group_5_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__Group_5_1_1__1__Impl();

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
    // $ANTLR end "rule__ErrorPredicate__Group_5_1_1__1"


    // $ANTLR start "rule__ErrorPredicate__Group_5_1_1__1__Impl"
    // InternalSolverLanguage.g:3427:1: rule__ErrorPredicate__Group_5_1_1__1__Impl : ( ( rule__ErrorPredicate__BodiesAssignment_5_1_1_1 ) ) ;
    public final void rule__ErrorPredicate__Group_5_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3431:1: ( ( ( rule__ErrorPredicate__BodiesAssignment_5_1_1_1 ) ) )
            // InternalSolverLanguage.g:3432:1: ( ( rule__ErrorPredicate__BodiesAssignment_5_1_1_1 ) )
            {
            // InternalSolverLanguage.g:3432:1: ( ( rule__ErrorPredicate__BodiesAssignment_5_1_1_1 ) )
            // InternalSolverLanguage.g:3433:2: ( rule__ErrorPredicate__BodiesAssignment_5_1_1_1 )
            {
             before(grammarAccess.getErrorPredicateAccess().getBodiesAssignment_5_1_1_1()); 
            // InternalSolverLanguage.g:3434:2: ( rule__ErrorPredicate__BodiesAssignment_5_1_1_1 )
            // InternalSolverLanguage.g:3434:3: rule__ErrorPredicate__BodiesAssignment_5_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ErrorPredicate__BodiesAssignment_5_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getErrorPredicateAccess().getBodiesAssignment_5_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__Group_5_1_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalSolverLanguage.g:3443:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3447:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalSolverLanguage.g:3448:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSolverLanguage.g:3455:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__VariableAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3459:1: ( ( ( rule__Parameter__VariableAssignment_0 ) ) )
            // InternalSolverLanguage.g:3460:1: ( ( rule__Parameter__VariableAssignment_0 ) )
            {
            // InternalSolverLanguage.g:3460:1: ( ( rule__Parameter__VariableAssignment_0 ) )
            // InternalSolverLanguage.g:3461:2: ( rule__Parameter__VariableAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getVariableAssignment_0()); 
            // InternalSolverLanguage.g:3462:2: ( rule__Parameter__VariableAssignment_0 )
            // InternalSolverLanguage.g:3462:3: rule__Parameter__VariableAssignment_0
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
    // InternalSolverLanguage.g:3470:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3474:1: ( rule__Parameter__Group__1__Impl )
            // InternalSolverLanguage.g:3475:2: rule__Parameter__Group__1__Impl
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
    // InternalSolverLanguage.g:3481:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__Group_1__0 )? ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3485:1: ( ( ( rule__Parameter__Group_1__0 )? ) )
            // InternalSolverLanguage.g:3486:1: ( ( rule__Parameter__Group_1__0 )? )
            {
            // InternalSolverLanguage.g:3486:1: ( ( rule__Parameter__Group_1__0 )? )
            // InternalSolverLanguage.g:3487:2: ( rule__Parameter__Group_1__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_1()); 
            // InternalSolverLanguage.g:3488:2: ( rule__Parameter__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==19) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSolverLanguage.g:3488:3: rule__Parameter__Group_1__0
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
    // InternalSolverLanguage.g:3497:1: rule__Parameter__Group_1__0 : rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 ;
    public final void rule__Parameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3501:1: ( rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 )
            // InternalSolverLanguage.g:3502:2: rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSolverLanguage.g:3509:1: rule__Parameter__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Parameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3513:1: ( ( ':' ) )
            // InternalSolverLanguage.g:3514:1: ( ':' )
            {
            // InternalSolverLanguage.g:3514:1: ( ':' )
            // InternalSolverLanguage.g:3515:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSolverLanguage.g:3524:1: rule__Parameter__Group_1__1 : rule__Parameter__Group_1__1__Impl ;
    public final void rule__Parameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3528:1: ( rule__Parameter__Group_1__1__Impl )
            // InternalSolverLanguage.g:3529:2: rule__Parameter__Group_1__1__Impl
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
    // InternalSolverLanguage.g:3535:1: rule__Parameter__Group_1__1__Impl : ( ( rule__Parameter__TypeAssignment_1_1 ) ) ;
    public final void rule__Parameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3539:1: ( ( ( rule__Parameter__TypeAssignment_1_1 ) ) )
            // InternalSolverLanguage.g:3540:1: ( ( rule__Parameter__TypeAssignment_1_1 ) )
            {
            // InternalSolverLanguage.g:3540:1: ( ( rule__Parameter__TypeAssignment_1_1 ) )
            // InternalSolverLanguage.g:3541:2: ( rule__Parameter__TypeAssignment_1_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1_1()); 
            // InternalSolverLanguage.g:3542:2: ( rule__Parameter__TypeAssignment_1_1 )
            // InternalSolverLanguage.g:3542:3: rule__Parameter__TypeAssignment_1_1
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
    // InternalSolverLanguage.g:3551:1: rule__PatternBody__Group__0 : rule__PatternBody__Group__0__Impl rule__PatternBody__Group__1 ;
    public final void rule__PatternBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3555:1: ( rule__PatternBody__Group__0__Impl rule__PatternBody__Group__1 )
            // InternalSolverLanguage.g:3556:2: rule__PatternBody__Group__0__Impl rule__PatternBody__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSolverLanguage.g:3563:1: rule__PatternBody__Group__0__Impl : ( () ) ;
    public final void rule__PatternBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3567:1: ( ( () ) )
            // InternalSolverLanguage.g:3568:1: ( () )
            {
            // InternalSolverLanguage.g:3568:1: ( () )
            // InternalSolverLanguage.g:3569:2: ()
            {
             before(grammarAccess.getPatternBodyAccess().getPatternBodyAction_0()); 
            // InternalSolverLanguage.g:3570:2: ()
            // InternalSolverLanguage.g:3570:3: 
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
    // InternalSolverLanguage.g:3578:1: rule__PatternBody__Group__1 : rule__PatternBody__Group__1__Impl ;
    public final void rule__PatternBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3582:1: ( rule__PatternBody__Group__1__Impl )
            // InternalSolverLanguage.g:3583:2: rule__PatternBody__Group__1__Impl
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
    // InternalSolverLanguage.g:3589:1: rule__PatternBody__Group__1__Impl : ( ( rule__PatternBody__Alternatives_1 ) ) ;
    public final void rule__PatternBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3593:1: ( ( ( rule__PatternBody__Alternatives_1 ) ) )
            // InternalSolverLanguage.g:3594:1: ( ( rule__PatternBody__Alternatives_1 ) )
            {
            // InternalSolverLanguage.g:3594:1: ( ( rule__PatternBody__Alternatives_1 ) )
            // InternalSolverLanguage.g:3595:2: ( rule__PatternBody__Alternatives_1 )
            {
             before(grammarAccess.getPatternBodyAccess().getAlternatives_1()); 
            // InternalSolverLanguage.g:3596:2: ( rule__PatternBody__Alternatives_1 )
            // InternalSolverLanguage.g:3596:3: rule__PatternBody__Alternatives_1
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
    // InternalSolverLanguage.g:3605:1: rule__Polarity__Group_0__0 : rule__Polarity__Group_0__0__Impl rule__Polarity__Group_0__1 ;
    public final void rule__Polarity__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3609:1: ( rule__Polarity__Group_0__0__Impl rule__Polarity__Group_0__1 )
            // InternalSolverLanguage.g:3610:2: rule__Polarity__Group_0__0__Impl rule__Polarity__Group_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSolverLanguage.g:3617:1: rule__Polarity__Group_0__0__Impl : ( () ) ;
    public final void rule__Polarity__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3621:1: ( ( () ) )
            // InternalSolverLanguage.g:3622:1: ( () )
            {
            // InternalSolverLanguage.g:3622:1: ( () )
            // InternalSolverLanguage.g:3623:2: ()
            {
             before(grammarAccess.getPolarityAccess().getPositiveAction_0_0()); 
            // InternalSolverLanguage.g:3624:2: ()
            // InternalSolverLanguage.g:3624:3: 
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
    // InternalSolverLanguage.g:3632:1: rule__Polarity__Group_0__1 : rule__Polarity__Group_0__1__Impl ;
    public final void rule__Polarity__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3636:1: ( rule__Polarity__Group_0__1__Impl )
            // InternalSolverLanguage.g:3637:2: rule__Polarity__Group_0__1__Impl
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
    // InternalSolverLanguage.g:3643:1: rule__Polarity__Group_0__1__Impl : ( '+' ) ;
    public final void rule__Polarity__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3647:1: ( ( '+' ) )
            // InternalSolverLanguage.g:3648:1: ( '+' )
            {
            // InternalSolverLanguage.g:3648:1: ( '+' )
            // InternalSolverLanguage.g:3649:2: '+'
            {
             before(grammarAccess.getPolarityAccess().getPlusSignKeyword_0_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSolverLanguage.g:3659:1: rule__Polarity__Group_1__0 : rule__Polarity__Group_1__0__Impl rule__Polarity__Group_1__1 ;
    public final void rule__Polarity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3663:1: ( rule__Polarity__Group_1__0__Impl rule__Polarity__Group_1__1 )
            // InternalSolverLanguage.g:3664:2: rule__Polarity__Group_1__0__Impl rule__Polarity__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSolverLanguage.g:3671:1: rule__Polarity__Group_1__0__Impl : ( () ) ;
    public final void rule__Polarity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3675:1: ( ( () ) )
            // InternalSolverLanguage.g:3676:1: ( () )
            {
            // InternalSolverLanguage.g:3676:1: ( () )
            // InternalSolverLanguage.g:3677:2: ()
            {
             before(grammarAccess.getPolarityAccess().getNegativeAction_1_0()); 
            // InternalSolverLanguage.g:3678:2: ()
            // InternalSolverLanguage.g:3678:3: 
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
    // InternalSolverLanguage.g:3686:1: rule__Polarity__Group_1__1 : rule__Polarity__Group_1__1__Impl ;
    public final void rule__Polarity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3690:1: ( rule__Polarity__Group_1__1__Impl )
            // InternalSolverLanguage.g:3691:2: rule__Polarity__Group_1__1__Impl
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
    // InternalSolverLanguage.g:3697:1: rule__Polarity__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Polarity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3701:1: ( ( '-' ) )
            // InternalSolverLanguage.g:3702:1: ( '-' )
            {
            // InternalSolverLanguage.g:3702:1: ( '-' )
            // InternalSolverLanguage.g:3703:2: '-'
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


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalSolverLanguage.g:3713:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3717:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalSolverLanguage.g:3718:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

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
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalSolverLanguage.g:3725:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__PolarityAssignment_0 )? ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3729:1: ( ( ( rule__Constraint__PolarityAssignment_0 )? ) )
            // InternalSolverLanguage.g:3730:1: ( ( rule__Constraint__PolarityAssignment_0 )? )
            {
            // InternalSolverLanguage.g:3730:1: ( ( rule__Constraint__PolarityAssignment_0 )? )
            // InternalSolverLanguage.g:3731:2: ( rule__Constraint__PolarityAssignment_0 )?
            {
             before(grammarAccess.getConstraintAccess().getPolarityAssignment_0()); 
            // InternalSolverLanguage.g:3732:2: ( rule__Constraint__PolarityAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==13||LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSolverLanguage.g:3732:3: rule__Constraint__PolarityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__PolarityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getPolarityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalSolverLanguage.g:3740:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3744:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalSolverLanguage.g:3745:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

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
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalSolverLanguage.g:3752:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__SymbolAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3756:1: ( ( ( rule__Constraint__SymbolAssignment_1 ) ) )
            // InternalSolverLanguage.g:3757:1: ( ( rule__Constraint__SymbolAssignment_1 ) )
            {
            // InternalSolverLanguage.g:3757:1: ( ( rule__Constraint__SymbolAssignment_1 ) )
            // InternalSolverLanguage.g:3758:2: ( rule__Constraint__SymbolAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getSymbolAssignment_1()); 
            // InternalSolverLanguage.g:3759:2: ( rule__Constraint__SymbolAssignment_1 )
            // InternalSolverLanguage.g:3759:3: rule__Constraint__SymbolAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__SymbolAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getSymbolAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalSolverLanguage.g:3767:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3771:1: ( rule__Constraint__Group__2__Impl )
            // InternalSolverLanguage.g:3772:2: rule__Constraint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2__Impl();

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
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalSolverLanguage.g:3778:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__Alternatives_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3782:1: ( ( ( rule__Constraint__Alternatives_2 ) ) )
            // InternalSolverLanguage.g:3783:1: ( ( rule__Constraint__Alternatives_2 ) )
            {
            // InternalSolverLanguage.g:3783:1: ( ( rule__Constraint__Alternatives_2 ) )
            // InternalSolverLanguage.g:3784:2: ( rule__Constraint__Alternatives_2 )
            {
             before(grammarAccess.getConstraintAccess().getAlternatives_2()); 
            // InternalSolverLanguage.g:3785:2: ( rule__Constraint__Alternatives_2 )
            // InternalSolverLanguage.g:3785:3: rule__Constraint__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group_2_0__0"
    // InternalSolverLanguage.g:3794:1: rule__Constraint__Group_2_0__0 : rule__Constraint__Group_2_0__0__Impl rule__Constraint__Group_2_0__1 ;
    public final void rule__Constraint__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3798:1: ( rule__Constraint__Group_2_0__0__Impl rule__Constraint__Group_2_0__1 )
            // InternalSolverLanguage.g:3799:2: rule__Constraint__Group_2_0__0__Impl rule__Constraint__Group_2_0__1
            {
            pushFollow(FOLLOW_30);
            rule__Constraint__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_2_0__1();

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
    // $ANTLR end "rule__Constraint__Group_2_0__0"


    // $ANTLR start "rule__Constraint__Group_2_0__0__Impl"
    // InternalSolverLanguage.g:3806:1: rule__Constraint__Group_2_0__0__Impl : ( '(' ) ;
    public final void rule__Constraint__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3810:1: ( ( '(' ) )
            // InternalSolverLanguage.g:3811:1: ( '(' )
            {
            // InternalSolverLanguage.g:3811:1: ( '(' )
            // InternalSolverLanguage.g:3812:2: '('
            {
             before(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_2_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_2_0__0__Impl"


    // $ANTLR start "rule__Constraint__Group_2_0__1"
    // InternalSolverLanguage.g:3821:1: rule__Constraint__Group_2_0__1 : rule__Constraint__Group_2_0__1__Impl rule__Constraint__Group_2_0__2 ;
    public final void rule__Constraint__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3825:1: ( rule__Constraint__Group_2_0__1__Impl rule__Constraint__Group_2_0__2 )
            // InternalSolverLanguage.g:3826:2: rule__Constraint__Group_2_0__1__Impl rule__Constraint__Group_2_0__2
            {
            pushFollow(FOLLOW_30);
            rule__Constraint__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_2_0__2();

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
    // $ANTLR end "rule__Constraint__Group_2_0__1"


    // $ANTLR start "rule__Constraint__Group_2_0__1__Impl"
    // InternalSolverLanguage.g:3833:1: rule__Constraint__Group_2_0__1__Impl : ( ( rule__Constraint__ParamsAssignment_2_0_1 )* ) ;
    public final void rule__Constraint__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3837:1: ( ( ( rule__Constraint__ParamsAssignment_2_0_1 )* ) )
            // InternalSolverLanguage.g:3838:1: ( ( rule__Constraint__ParamsAssignment_2_0_1 )* )
            {
            // InternalSolverLanguage.g:3838:1: ( ( rule__Constraint__ParamsAssignment_2_0_1 )* )
            // InternalSolverLanguage.g:3839:2: ( rule__Constraint__ParamsAssignment_2_0_1 )*
            {
             before(grammarAccess.getConstraintAccess().getParamsAssignment_2_0_1()); 
            // InternalSolverLanguage.g:3840:2: ( rule__Constraint__ParamsAssignment_2_0_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_INT && LA33_0<=RULE_STRING)||(LA33_0>=11 && LA33_0<=13)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSolverLanguage.g:3840:3: rule__Constraint__ParamsAssignment_2_0_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Constraint__ParamsAssignment_2_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getConstraintAccess().getParamsAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_2_0__1__Impl"


    // $ANTLR start "rule__Constraint__Group_2_0__2"
    // InternalSolverLanguage.g:3848:1: rule__Constraint__Group_2_0__2 : rule__Constraint__Group_2_0__2__Impl ;
    public final void rule__Constraint__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3852:1: ( rule__Constraint__Group_2_0__2__Impl )
            // InternalSolverLanguage.g:3853:2: rule__Constraint__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_2_0__2__Impl();

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
    // $ANTLR end "rule__Constraint__Group_2_0__2"


    // $ANTLR start "rule__Constraint__Group_2_0__2__Impl"
    // InternalSolverLanguage.g:3859:1: rule__Constraint__Group_2_0__2__Impl : ( ')' ) ;
    public final void rule__Constraint__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3863:1: ( ( ')' ) )
            // InternalSolverLanguage.g:3864:1: ( ')' )
            {
            // InternalSolverLanguage.g:3864:1: ( ')' )
            // InternalSolverLanguage.g:3865:2: ')'
            {
             before(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_2_0_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_2_0__2__Impl"


    // $ANTLR start "rule__Constraint__Group_2_1__0"
    // InternalSolverLanguage.g:3875:1: rule__Constraint__Group_2_1__0 : rule__Constraint__Group_2_1__0__Impl rule__Constraint__Group_2_1__1 ;
    public final void rule__Constraint__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3879:1: ( rule__Constraint__Group_2_1__0__Impl rule__Constraint__Group_2_1__1 )
            // InternalSolverLanguage.g:3880:2: rule__Constraint__Group_2_1__0__Impl rule__Constraint__Group_2_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Constraint__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_2_1__1();

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
    // $ANTLR end "rule__Constraint__Group_2_1__0"


    // $ANTLR start "rule__Constraint__Group_2_1__0__Impl"
    // InternalSolverLanguage.g:3887:1: rule__Constraint__Group_2_1__0__Impl : ( ( rule__Constraint__ClosureTypeAssignment_2_1_0 ) ) ;
    public final void rule__Constraint__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3891:1: ( ( ( rule__Constraint__ClosureTypeAssignment_2_1_0 ) ) )
            // InternalSolverLanguage.g:3892:1: ( ( rule__Constraint__ClosureTypeAssignment_2_1_0 ) )
            {
            // InternalSolverLanguage.g:3892:1: ( ( rule__Constraint__ClosureTypeAssignment_2_1_0 ) )
            // InternalSolverLanguage.g:3893:2: ( rule__Constraint__ClosureTypeAssignment_2_1_0 )
            {
             before(grammarAccess.getConstraintAccess().getClosureTypeAssignment_2_1_0()); 
            // InternalSolverLanguage.g:3894:2: ( rule__Constraint__ClosureTypeAssignment_2_1_0 )
            // InternalSolverLanguage.g:3894:3: rule__Constraint__ClosureTypeAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ClosureTypeAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getClosureTypeAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_2_1__0__Impl"


    // $ANTLR start "rule__Constraint__Group_2_1__1"
    // InternalSolverLanguage.g:3902:1: rule__Constraint__Group_2_1__1 : rule__Constraint__Group_2_1__1__Impl rule__Constraint__Group_2_1__2 ;
    public final void rule__Constraint__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3906:1: ( rule__Constraint__Group_2_1__1__Impl rule__Constraint__Group_2_1__2 )
            // InternalSolverLanguage.g:3907:2: rule__Constraint__Group_2_1__1__Impl rule__Constraint__Group_2_1__2
            {
            pushFollow(FOLLOW_32);
            rule__Constraint__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_2_1__2();

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
    // $ANTLR end "rule__Constraint__Group_2_1__1"


    // $ANTLR start "rule__Constraint__Group_2_1__1__Impl"
    // InternalSolverLanguage.g:3914:1: rule__Constraint__Group_2_1__1__Impl : ( '(' ) ;
    public final void rule__Constraint__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3918:1: ( ( '(' ) )
            // InternalSolverLanguage.g:3919:1: ( '(' )
            {
            // InternalSolverLanguage.g:3919:1: ( '(' )
            // InternalSolverLanguage.g:3920:2: '('
            {
             before(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_2_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_2_1__1__Impl"


    // $ANTLR start "rule__Constraint__Group_2_1__2"
    // InternalSolverLanguage.g:3929:1: rule__Constraint__Group_2_1__2 : rule__Constraint__Group_2_1__2__Impl rule__Constraint__Group_2_1__3 ;
    public final void rule__Constraint__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3933:1: ( rule__Constraint__Group_2_1__2__Impl rule__Constraint__Group_2_1__3 )
            // InternalSolverLanguage.g:3934:2: rule__Constraint__Group_2_1__2__Impl rule__Constraint__Group_2_1__3
            {
            pushFollow(FOLLOW_32);
            rule__Constraint__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_2_1__3();

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
    // $ANTLR end "rule__Constraint__Group_2_1__2"


    // $ANTLR start "rule__Constraint__Group_2_1__2__Impl"
    // InternalSolverLanguage.g:3941:1: rule__Constraint__Group_2_1__2__Impl : ( ( rule__Constraint__ParamsAssignment_2_1_2 ) ) ;
    public final void rule__Constraint__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3945:1: ( ( ( rule__Constraint__ParamsAssignment_2_1_2 ) ) )
            // InternalSolverLanguage.g:3946:1: ( ( rule__Constraint__ParamsAssignment_2_1_2 ) )
            {
            // InternalSolverLanguage.g:3946:1: ( ( rule__Constraint__ParamsAssignment_2_1_2 ) )
            // InternalSolverLanguage.g:3947:2: ( rule__Constraint__ParamsAssignment_2_1_2 )
            {
             before(grammarAccess.getConstraintAccess().getParamsAssignment_2_1_2()); 
            // InternalSolverLanguage.g:3948:2: ( rule__Constraint__ParamsAssignment_2_1_2 )
            // InternalSolverLanguage.g:3948:3: rule__Constraint__ParamsAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ParamsAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getParamsAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_2_1__2__Impl"


    // $ANTLR start "rule__Constraint__Group_2_1__3"
    // InternalSolverLanguage.g:3956:1: rule__Constraint__Group_2_1__3 : rule__Constraint__Group_2_1__3__Impl rule__Constraint__Group_2_1__4 ;
    public final void rule__Constraint__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3960:1: ( rule__Constraint__Group_2_1__3__Impl rule__Constraint__Group_2_1__4 )
            // InternalSolverLanguage.g:3961:2: rule__Constraint__Group_2_1__3__Impl rule__Constraint__Group_2_1__4
            {
            pushFollow(FOLLOW_33);
            rule__Constraint__Group_2_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_2_1__4();

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
    // $ANTLR end "rule__Constraint__Group_2_1__3"


    // $ANTLR start "rule__Constraint__Group_2_1__3__Impl"
    // InternalSolverLanguage.g:3968:1: rule__Constraint__Group_2_1__3__Impl : ( ( rule__Constraint__ParamsAssignment_2_1_3 ) ) ;
    public final void rule__Constraint__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3972:1: ( ( ( rule__Constraint__ParamsAssignment_2_1_3 ) ) )
            // InternalSolverLanguage.g:3973:1: ( ( rule__Constraint__ParamsAssignment_2_1_3 ) )
            {
            // InternalSolverLanguage.g:3973:1: ( ( rule__Constraint__ParamsAssignment_2_1_3 ) )
            // InternalSolverLanguage.g:3974:2: ( rule__Constraint__ParamsAssignment_2_1_3 )
            {
             before(grammarAccess.getConstraintAccess().getParamsAssignment_2_1_3()); 
            // InternalSolverLanguage.g:3975:2: ( rule__Constraint__ParamsAssignment_2_1_3 )
            // InternalSolverLanguage.g:3975:3: rule__Constraint__ParamsAssignment_2_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ParamsAssignment_2_1_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getParamsAssignment_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_2_1__3__Impl"


    // $ANTLR start "rule__Constraint__Group_2_1__4"
    // InternalSolverLanguage.g:3983:1: rule__Constraint__Group_2_1__4 : rule__Constraint__Group_2_1__4__Impl ;
    public final void rule__Constraint__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3987:1: ( rule__Constraint__Group_2_1__4__Impl )
            // InternalSolverLanguage.g:3988:2: rule__Constraint__Group_2_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_2_1__4__Impl();

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
    // $ANTLR end "rule__Constraint__Group_2_1__4"


    // $ANTLR start "rule__Constraint__Group_2_1__4__Impl"
    // InternalSolverLanguage.g:3994:1: rule__Constraint__Group_2_1__4__Impl : ( ')' ) ;
    public final void rule__Constraint__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:3998:1: ( ( ')' ) )
            // InternalSolverLanguage.g:3999:1: ( ')' )
            {
            // InternalSolverLanguage.g:3999:1: ( ')' )
            // InternalSolverLanguage.g:4000:2: ')'
            {
             before(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_2_1_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_2_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_2_1__4__Impl"


    // $ANTLR start "rule__ClosureType__Group_0__0"
    // InternalSolverLanguage.g:4010:1: rule__ClosureType__Group_0__0 : rule__ClosureType__Group_0__0__Impl rule__ClosureType__Group_0__1 ;
    public final void rule__ClosureType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4014:1: ( rule__ClosureType__Group_0__0__Impl rule__ClosureType__Group_0__1 )
            // InternalSolverLanguage.g:4015:2: rule__ClosureType__Group_0__0__Impl rule__ClosureType__Group_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalSolverLanguage.g:4022:1: rule__ClosureType__Group_0__0__Impl : ( () ) ;
    public final void rule__ClosureType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4026:1: ( ( () ) )
            // InternalSolverLanguage.g:4027:1: ( () )
            {
            // InternalSolverLanguage.g:4027:1: ( () )
            // InternalSolverLanguage.g:4028:2: ()
            {
             before(grammarAccess.getClosureTypeAccess().getReflexiveClosureAction_0_0()); 
            // InternalSolverLanguage.g:4029:2: ()
            // InternalSolverLanguage.g:4029:3: 
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
    // InternalSolverLanguage.g:4037:1: rule__ClosureType__Group_0__1 : rule__ClosureType__Group_0__1__Impl ;
    public final void rule__ClosureType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4041:1: ( rule__ClosureType__Group_0__1__Impl )
            // InternalSolverLanguage.g:4042:2: rule__ClosureType__Group_0__1__Impl
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
    // InternalSolverLanguage.g:4048:1: rule__ClosureType__Group_0__1__Impl : ( '*' ) ;
    public final void rule__ClosureType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4052:1: ( ( '*' ) )
            // InternalSolverLanguage.g:4053:1: ( '*' )
            {
            // InternalSolverLanguage.g:4053:1: ( '*' )
            // InternalSolverLanguage.g:4054:2: '*'
            {
             before(grammarAccess.getClosureTypeAccess().getAsteriskKeyword_0_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSolverLanguage.g:4064:1: rule__ClosureType__Group_1__0 : rule__ClosureType__Group_1__0__Impl rule__ClosureType__Group_1__1 ;
    public final void rule__ClosureType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4068:1: ( rule__ClosureType__Group_1__0__Impl rule__ClosureType__Group_1__1 )
            // InternalSolverLanguage.g:4069:2: rule__ClosureType__Group_1__0__Impl rule__ClosureType__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSolverLanguage.g:4076:1: rule__ClosureType__Group_1__0__Impl : ( () ) ;
    public final void rule__ClosureType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4080:1: ( ( () ) )
            // InternalSolverLanguage.g:4081:1: ( () )
            {
            // InternalSolverLanguage.g:4081:1: ( () )
            // InternalSolverLanguage.g:4082:2: ()
            {
             before(grammarAccess.getClosureTypeAccess().getIrreflexiveClosureAction_1_0()); 
            // InternalSolverLanguage.g:4083:2: ()
            // InternalSolverLanguage.g:4083:3: 
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
    // InternalSolverLanguage.g:4091:1: rule__ClosureType__Group_1__1 : rule__ClosureType__Group_1__1__Impl ;
    public final void rule__ClosureType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4095:1: ( rule__ClosureType__Group_1__1__Impl )
            // InternalSolverLanguage.g:4096:2: rule__ClosureType__Group_1__1__Impl
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
    // InternalSolverLanguage.g:4102:1: rule__ClosureType__Group_1__1__Impl : ( '+' ) ;
    public final void rule__ClosureType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4106:1: ( ( '+' ) )
            // InternalSolverLanguage.g:4107:1: ( '+' )
            {
            // InternalSolverLanguage.g:4107:1: ( '+' )
            // InternalSolverLanguage.g:4108:2: '+'
            {
             before(grammarAccess.getClosureTypeAccess().getPlusSignKeyword_1_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSolverLanguage.g:4118:1: rule__AllInstances__Group__0 : rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1 ;
    public final void rule__AllInstances__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4122:1: ( rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1 )
            // InternalSolverLanguage.g:4123:2: rule__AllInstances__Group__0__Impl rule__AllInstances__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSolverLanguage.g:4130:1: rule__AllInstances__Group__0__Impl : ( ':' ) ;
    public final void rule__AllInstances__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4134:1: ( ( ':' ) )
            // InternalSolverLanguage.g:4135:1: ( ':' )
            {
            // InternalSolverLanguage.g:4135:1: ( ':' )
            // InternalSolverLanguage.g:4136:2: ':'
            {
             before(grammarAccess.getAllInstancesAccess().getColonKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSolverLanguage.g:4145:1: rule__AllInstances__Group__1 : rule__AllInstances__Group__1__Impl ;
    public final void rule__AllInstances__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4149:1: ( rule__AllInstances__Group__1__Impl )
            // InternalSolverLanguage.g:4150:2: rule__AllInstances__Group__1__Impl
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
    // InternalSolverLanguage.g:4156:1: rule__AllInstances__Group__1__Impl : ( ( rule__AllInstances__SymbolAssignment_1 ) ) ;
    public final void rule__AllInstances__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4160:1: ( ( ( rule__AllInstances__SymbolAssignment_1 ) ) )
            // InternalSolverLanguage.g:4161:1: ( ( rule__AllInstances__SymbolAssignment_1 ) )
            {
            // InternalSolverLanguage.g:4161:1: ( ( rule__AllInstances__SymbolAssignment_1 ) )
            // InternalSolverLanguage.g:4162:2: ( rule__AllInstances__SymbolAssignment_1 )
            {
             before(grammarAccess.getAllInstancesAccess().getSymbolAssignment_1()); 
            // InternalSolverLanguage.g:4163:2: ( rule__AllInstances__SymbolAssignment_1 )
            // InternalSolverLanguage.g:4163:3: rule__AllInstances__SymbolAssignment_1
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
    // InternalSolverLanguage.g:4172:1: rule__AllObjects__Group__0 : rule__AllObjects__Group__0__Impl rule__AllObjects__Group__1 ;
    public final void rule__AllObjects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4176:1: ( rule__AllObjects__Group__0__Impl rule__AllObjects__Group__1 )
            // InternalSolverLanguage.g:4177:2: rule__AllObjects__Group__0__Impl rule__AllObjects__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSolverLanguage.g:4184:1: rule__AllObjects__Group__0__Impl : ( () ) ;
    public final void rule__AllObjects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4188:1: ( ( () ) )
            // InternalSolverLanguage.g:4189:1: ( () )
            {
            // InternalSolverLanguage.g:4189:1: ( () )
            // InternalSolverLanguage.g:4190:2: ()
            {
             before(grammarAccess.getAllObjectsAccess().getAllObjectsAction_0()); 
            // InternalSolverLanguage.g:4191:2: ()
            // InternalSolverLanguage.g:4191:3: 
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
    // InternalSolverLanguage.g:4199:1: rule__AllObjects__Group__1 : rule__AllObjects__Group__1__Impl ;
    public final void rule__AllObjects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4203:1: ( rule__AllObjects__Group__1__Impl )
            // InternalSolverLanguage.g:4204:2: rule__AllObjects__Group__1__Impl
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
    // InternalSolverLanguage.g:4210:1: rule__AllObjects__Group__1__Impl : ( '*' ) ;
    public final void rule__AllObjects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4214:1: ( ( '*' ) )
            // InternalSolverLanguage.g:4215:1: ( '*' )
            {
            // InternalSolverLanguage.g:4215:1: ( '*' )
            // InternalSolverLanguage.g:4216:2: '*'
            {
             before(grammarAccess.getAllObjectsAccess().getAsteriskKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSolverLanguage.g:4226:1: rule__DefaultInterpretation__Group__0 : rule__DefaultInterpretation__Group__0__Impl rule__DefaultInterpretation__Group__1 ;
    public final void rule__DefaultInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4230:1: ( rule__DefaultInterpretation__Group__0__Impl rule__DefaultInterpretation__Group__1 )
            // InternalSolverLanguage.g:4231:2: rule__DefaultInterpretation__Group__0__Impl rule__DefaultInterpretation__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSolverLanguage.g:4238:1: rule__DefaultInterpretation__Group__0__Impl : ( 'default' ) ;
    public final void rule__DefaultInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4242:1: ( ( 'default' ) )
            // InternalSolverLanguage.g:4243:1: ( 'default' )
            {
            // InternalSolverLanguage.g:4243:1: ( 'default' )
            // InternalSolverLanguage.g:4244:2: 'default'
            {
             before(grammarAccess.getDefaultInterpretationAccess().getDefaultKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSolverLanguage.g:4253:1: rule__DefaultInterpretation__Group__1 : rule__DefaultInterpretation__Group__1__Impl ;
    public final void rule__DefaultInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4257:1: ( rule__DefaultInterpretation__Group__1__Impl )
            // InternalSolverLanguage.g:4258:2: rule__DefaultInterpretation__Group__1__Impl
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
    // InternalSolverLanguage.g:4264:1: rule__DefaultInterpretation__Group__1__Impl : ( ( rule__DefaultInterpretation__InterpretationAssignment_1 ) ) ;
    public final void rule__DefaultInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4268:1: ( ( ( rule__DefaultInterpretation__InterpretationAssignment_1 ) ) )
            // InternalSolverLanguage.g:4269:1: ( ( rule__DefaultInterpretation__InterpretationAssignment_1 ) )
            {
            // InternalSolverLanguage.g:4269:1: ( ( rule__DefaultInterpretation__InterpretationAssignment_1 ) )
            // InternalSolverLanguage.g:4270:2: ( rule__DefaultInterpretation__InterpretationAssignment_1 )
            {
             before(grammarAccess.getDefaultInterpretationAccess().getInterpretationAssignment_1()); 
            // InternalSolverLanguage.g:4271:2: ( rule__DefaultInterpretation__InterpretationAssignment_1 )
            // InternalSolverLanguage.g:4271:3: rule__DefaultInterpretation__InterpretationAssignment_1
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
    // InternalSolverLanguage.g:4280:1: rule__ClassInterpretation__Group__0 : rule__ClassInterpretation__Group__0__Impl rule__ClassInterpretation__Group__1 ;
    public final void rule__ClassInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4284:1: ( rule__ClassInterpretation__Group__0__Impl rule__ClassInterpretation__Group__1 )
            // InternalSolverLanguage.g:4285:2: rule__ClassInterpretation__Group__0__Impl rule__ClassInterpretation__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalSolverLanguage.g:4292:1: rule__ClassInterpretation__Group__0__Impl : ( ( rule__ClassInterpretation__AbstractAssignment_0 ) ) ;
    public final void rule__ClassInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4296:1: ( ( ( rule__ClassInterpretation__AbstractAssignment_0 ) ) )
            // InternalSolverLanguage.g:4297:1: ( ( rule__ClassInterpretation__AbstractAssignment_0 ) )
            {
            // InternalSolverLanguage.g:4297:1: ( ( rule__ClassInterpretation__AbstractAssignment_0 ) )
            // InternalSolverLanguage.g:4298:2: ( rule__ClassInterpretation__AbstractAssignment_0 )
            {
             before(grammarAccess.getClassInterpretationAccess().getAbstractAssignment_0()); 
            // InternalSolverLanguage.g:4299:2: ( rule__ClassInterpretation__AbstractAssignment_0 )
            // InternalSolverLanguage.g:4299:3: rule__ClassInterpretation__AbstractAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassInterpretation__AbstractAssignment_0();

            state._fsp--;


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
    // InternalSolverLanguage.g:4307:1: rule__ClassInterpretation__Group__1 : rule__ClassInterpretation__Group__1__Impl rule__ClassInterpretation__Group__2 ;
    public final void rule__ClassInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4311:1: ( rule__ClassInterpretation__Group__1__Impl rule__ClassInterpretation__Group__2 )
            // InternalSolverLanguage.g:4312:2: rule__ClassInterpretation__Group__1__Impl rule__ClassInterpretation__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSolverLanguage.g:4319:1: rule__ClassInterpretation__Group__1__Impl : ( 'class' ) ;
    public final void rule__ClassInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4323:1: ( ( 'class' ) )
            // InternalSolverLanguage.g:4324:1: ( 'class' )
            {
            // InternalSolverLanguage.g:4324:1: ( 'class' )
            // InternalSolverLanguage.g:4325:2: 'class'
            {
             before(grammarAccess.getClassInterpretationAccess().getClassKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSolverLanguage.g:4334:1: rule__ClassInterpretation__Group__2 : rule__ClassInterpretation__Group__2__Impl rule__ClassInterpretation__Group__3 ;
    public final void rule__ClassInterpretation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4338:1: ( rule__ClassInterpretation__Group__2__Impl rule__ClassInterpretation__Group__3 )
            // InternalSolverLanguage.g:4339:2: rule__ClassInterpretation__Group__2__Impl rule__ClassInterpretation__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalSolverLanguage.g:4346:1: rule__ClassInterpretation__Group__2__Impl : ( ( rule__ClassInterpretation__SymbolAssignment_2 ) ) ;
    public final void rule__ClassInterpretation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4350:1: ( ( ( rule__ClassInterpretation__SymbolAssignment_2 ) ) )
            // InternalSolverLanguage.g:4351:1: ( ( rule__ClassInterpretation__SymbolAssignment_2 ) )
            {
            // InternalSolverLanguage.g:4351:1: ( ( rule__ClassInterpretation__SymbolAssignment_2 ) )
            // InternalSolverLanguage.g:4352:2: ( rule__ClassInterpretation__SymbolAssignment_2 )
            {
             before(grammarAccess.getClassInterpretationAccess().getSymbolAssignment_2()); 
            // InternalSolverLanguage.g:4353:2: ( rule__ClassInterpretation__SymbolAssignment_2 )
            // InternalSolverLanguage.g:4353:3: rule__ClassInterpretation__SymbolAssignment_2
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
    // InternalSolverLanguage.g:4361:1: rule__ClassInterpretation__Group__3 : rule__ClassInterpretation__Group__3__Impl rule__ClassInterpretation__Group__4 ;
    public final void rule__ClassInterpretation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4365:1: ( rule__ClassInterpretation__Group__3__Impl rule__ClassInterpretation__Group__4 )
            // InternalSolverLanguage.g:4366:2: rule__ClassInterpretation__Group__3__Impl rule__ClassInterpretation__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalSolverLanguage.g:4373:1: rule__ClassInterpretation__Group__3__Impl : ( ( rule__ClassInterpretation__Group_3__0 )? ) ;
    public final void rule__ClassInterpretation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4377:1: ( ( ( rule__ClassInterpretation__Group_3__0 )? ) )
            // InternalSolverLanguage.g:4378:1: ( ( rule__ClassInterpretation__Group_3__0 )? )
            {
            // InternalSolverLanguage.g:4378:1: ( ( rule__ClassInterpretation__Group_3__0 )? )
            // InternalSolverLanguage.g:4379:2: ( rule__ClassInterpretation__Group_3__0 )?
            {
             before(grammarAccess.getClassInterpretationAccess().getGroup_3()); 
            // InternalSolverLanguage.g:4380:2: ( rule__ClassInterpretation__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSolverLanguage.g:4380:3: rule__ClassInterpretation__Group_3__0
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
    // InternalSolverLanguage.g:4388:1: rule__ClassInterpretation__Group__4 : rule__ClassInterpretation__Group__4__Impl rule__ClassInterpretation__Group__5 ;
    public final void rule__ClassInterpretation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4392:1: ( rule__ClassInterpretation__Group__4__Impl rule__ClassInterpretation__Group__5 )
            // InternalSolverLanguage.g:4393:2: rule__ClassInterpretation__Group__4__Impl rule__ClassInterpretation__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalSolverLanguage.g:4400:1: rule__ClassInterpretation__Group__4__Impl : ( '{' ) ;
    public final void rule__ClassInterpretation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4404:1: ( ( '{' ) )
            // InternalSolverLanguage.g:4405:1: ( '{' )
            {
            // InternalSolverLanguage.g:4405:1: ( '{' )
            // InternalSolverLanguage.g:4406:2: '{'
            {
             before(grammarAccess.getClassInterpretationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSolverLanguage.g:4415:1: rule__ClassInterpretation__Group__5 : rule__ClassInterpretation__Group__5__Impl rule__ClassInterpretation__Group__6 ;
    public final void rule__ClassInterpretation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4419:1: ( rule__ClassInterpretation__Group__5__Impl rule__ClassInterpretation__Group__6 )
            // InternalSolverLanguage.g:4420:2: rule__ClassInterpretation__Group__5__Impl rule__ClassInterpretation__Group__6
            {
            pushFollow(FOLLOW_38);
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
    // InternalSolverLanguage.g:4427:1: rule__ClassInterpretation__Group__5__Impl : ( ( rule__ClassInterpretation__FieltAssignment_5 )* ) ;
    public final void rule__ClassInterpretation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4431:1: ( ( ( rule__ClassInterpretation__FieltAssignment_5 )* ) )
            // InternalSolverLanguage.g:4432:1: ( ( rule__ClassInterpretation__FieltAssignment_5 )* )
            {
            // InternalSolverLanguage.g:4432:1: ( ( rule__ClassInterpretation__FieltAssignment_5 )* )
            // InternalSolverLanguage.g:4433:2: ( rule__ClassInterpretation__FieltAssignment_5 )*
            {
             before(grammarAccess.getClassInterpretationAccess().getFieltAssignment_5()); 
            // InternalSolverLanguage.g:4434:2: ( rule__ClassInterpretation__FieltAssignment_5 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==40) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSolverLanguage.g:4434:3: rule__ClassInterpretation__FieltAssignment_5
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__ClassInterpretation__FieltAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalSolverLanguage.g:4442:1: rule__ClassInterpretation__Group__6 : rule__ClassInterpretation__Group__6__Impl ;
    public final void rule__ClassInterpretation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4446:1: ( rule__ClassInterpretation__Group__6__Impl )
            // InternalSolverLanguage.g:4447:2: rule__ClassInterpretation__Group__6__Impl
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
    // InternalSolverLanguage.g:4453:1: rule__ClassInterpretation__Group__6__Impl : ( '}' ) ;
    public final void rule__ClassInterpretation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4457:1: ( ( '}' ) )
            // InternalSolverLanguage.g:4458:1: ( '}' )
            {
            // InternalSolverLanguage.g:4458:1: ( '}' )
            // InternalSolverLanguage.g:4459:2: '}'
            {
             before(grammarAccess.getClassInterpretationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSolverLanguage.g:4469:1: rule__ClassInterpretation__Group_3__0 : rule__ClassInterpretation__Group_3__0__Impl rule__ClassInterpretation__Group_3__1 ;
    public final void rule__ClassInterpretation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4473:1: ( rule__ClassInterpretation__Group_3__0__Impl rule__ClassInterpretation__Group_3__1 )
            // InternalSolverLanguage.g:4474:2: rule__ClassInterpretation__Group_3__0__Impl rule__ClassInterpretation__Group_3__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSolverLanguage.g:4481:1: rule__ClassInterpretation__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__ClassInterpretation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4485:1: ( ( 'extends' ) )
            // InternalSolverLanguage.g:4486:1: ( 'extends' )
            {
            // InternalSolverLanguage.g:4486:1: ( 'extends' )
            // InternalSolverLanguage.g:4487:2: 'extends'
            {
             before(grammarAccess.getClassInterpretationAccess().getExtendsKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSolverLanguage.g:4496:1: rule__ClassInterpretation__Group_3__1 : rule__ClassInterpretation__Group_3__1__Impl ;
    public final void rule__ClassInterpretation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4500:1: ( rule__ClassInterpretation__Group_3__1__Impl )
            // InternalSolverLanguage.g:4501:2: rule__ClassInterpretation__Group_3__1__Impl
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
    // InternalSolverLanguage.g:4507:1: rule__ClassInterpretation__Group_3__1__Impl : ( ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 ) ) ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 )* ) ) ;
    public final void rule__ClassInterpretation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4511:1: ( ( ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 ) ) ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 )* ) ) )
            // InternalSolverLanguage.g:4512:1: ( ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 ) ) ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 )* ) )
            {
            // InternalSolverLanguage.g:4512:1: ( ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 ) ) ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 )* ) )
            // InternalSolverLanguage.g:4513:2: ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 ) ) ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 )* )
            {
            // InternalSolverLanguage.g:4513:2: ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 ) )
            // InternalSolverLanguage.g:4514:3: ( rule__ClassInterpretation__SupertypesAssignment_3_1 )
            {
             before(grammarAccess.getClassInterpretationAccess().getSupertypesAssignment_3_1()); 
            // InternalSolverLanguage.g:4515:3: ( rule__ClassInterpretation__SupertypesAssignment_3_1 )
            // InternalSolverLanguage.g:4515:4: rule__ClassInterpretation__SupertypesAssignment_3_1
            {
            pushFollow(FOLLOW_19);
            rule__ClassInterpretation__SupertypesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassInterpretationAccess().getSupertypesAssignment_3_1()); 

            }

            // InternalSolverLanguage.g:4518:2: ( ( rule__ClassInterpretation__SupertypesAssignment_3_1 )* )
            // InternalSolverLanguage.g:4519:3: ( rule__ClassInterpretation__SupertypesAssignment_3_1 )*
            {
             before(grammarAccess.getClassInterpretationAccess().getSupertypesAssignment_3_1()); 
            // InternalSolverLanguage.g:4520:3: ( rule__ClassInterpretation__SupertypesAssignment_3_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSolverLanguage.g:4520:4: rule__ClassInterpretation__SupertypesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ClassInterpretation__SupertypesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalSolverLanguage.g:4530:1: rule__EnumInterpretation__Group__0 : rule__EnumInterpretation__Group__0__Impl rule__EnumInterpretation__Group__1 ;
    public final void rule__EnumInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4534:1: ( rule__EnumInterpretation__Group__0__Impl rule__EnumInterpretation__Group__1 )
            // InternalSolverLanguage.g:4535:2: rule__EnumInterpretation__Group__0__Impl rule__EnumInterpretation__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSolverLanguage.g:4542:1: rule__EnumInterpretation__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4546:1: ( ( 'enum' ) )
            // InternalSolverLanguage.g:4547:1: ( 'enum' )
            {
            // InternalSolverLanguage.g:4547:1: ( 'enum' )
            // InternalSolverLanguage.g:4548:2: 'enum'
            {
             before(grammarAccess.getEnumInterpretationAccess().getEnumKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSolverLanguage.g:4557:1: rule__EnumInterpretation__Group__1 : rule__EnumInterpretation__Group__1__Impl rule__EnumInterpretation__Group__2 ;
    public final void rule__EnumInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4561:1: ( rule__EnumInterpretation__Group__1__Impl rule__EnumInterpretation__Group__2 )
            // InternalSolverLanguage.g:4562:2: rule__EnumInterpretation__Group__1__Impl rule__EnumInterpretation__Group__2
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
    // InternalSolverLanguage.g:4569:1: rule__EnumInterpretation__Group__1__Impl : ( ( rule__EnumInterpretation__SymbolAssignment_1 ) ) ;
    public final void rule__EnumInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4573:1: ( ( ( rule__EnumInterpretation__SymbolAssignment_1 ) ) )
            // InternalSolverLanguage.g:4574:1: ( ( rule__EnumInterpretation__SymbolAssignment_1 ) )
            {
            // InternalSolverLanguage.g:4574:1: ( ( rule__EnumInterpretation__SymbolAssignment_1 ) )
            // InternalSolverLanguage.g:4575:2: ( rule__EnumInterpretation__SymbolAssignment_1 )
            {
             before(grammarAccess.getEnumInterpretationAccess().getSymbolAssignment_1()); 
            // InternalSolverLanguage.g:4576:2: ( rule__EnumInterpretation__SymbolAssignment_1 )
            // InternalSolverLanguage.g:4576:3: rule__EnumInterpretation__SymbolAssignment_1
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
    // InternalSolverLanguage.g:4584:1: rule__EnumInterpretation__Group__2 : rule__EnumInterpretation__Group__2__Impl rule__EnumInterpretation__Group__3 ;
    public final void rule__EnumInterpretation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4588:1: ( rule__EnumInterpretation__Group__2__Impl rule__EnumInterpretation__Group__3 )
            // InternalSolverLanguage.g:4589:2: rule__EnumInterpretation__Group__2__Impl rule__EnumInterpretation__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalSolverLanguage.g:4596:1: rule__EnumInterpretation__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumInterpretation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4600:1: ( ( '{' ) )
            // InternalSolverLanguage.g:4601:1: ( '{' )
            {
            // InternalSolverLanguage.g:4601:1: ( '{' )
            // InternalSolverLanguage.g:4602:2: '{'
            {
             before(grammarAccess.getEnumInterpretationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSolverLanguage.g:4611:1: rule__EnumInterpretation__Group__3 : rule__EnumInterpretation__Group__3__Impl rule__EnumInterpretation__Group__4 ;
    public final void rule__EnumInterpretation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4615:1: ( rule__EnumInterpretation__Group__3__Impl rule__EnumInterpretation__Group__4 )
            // InternalSolverLanguage.g:4616:2: rule__EnumInterpretation__Group__3__Impl rule__EnumInterpretation__Group__4
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
    // InternalSolverLanguage.g:4623:1: rule__EnumInterpretation__Group__3__Impl : ( ( ( rule__EnumInterpretation__ObjectsAssignment_3 ) ) ( ( rule__EnumInterpretation__ObjectsAssignment_3 )* ) ) ;
    public final void rule__EnumInterpretation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4627:1: ( ( ( ( rule__EnumInterpretation__ObjectsAssignment_3 ) ) ( ( rule__EnumInterpretation__ObjectsAssignment_3 )* ) ) )
            // InternalSolverLanguage.g:4628:1: ( ( ( rule__EnumInterpretation__ObjectsAssignment_3 ) ) ( ( rule__EnumInterpretation__ObjectsAssignment_3 )* ) )
            {
            // InternalSolverLanguage.g:4628:1: ( ( ( rule__EnumInterpretation__ObjectsAssignment_3 ) ) ( ( rule__EnumInterpretation__ObjectsAssignment_3 )* ) )
            // InternalSolverLanguage.g:4629:2: ( ( rule__EnumInterpretation__ObjectsAssignment_3 ) ) ( ( rule__EnumInterpretation__ObjectsAssignment_3 )* )
            {
            // InternalSolverLanguage.g:4629:2: ( ( rule__EnumInterpretation__ObjectsAssignment_3 ) )
            // InternalSolverLanguage.g:4630:3: ( rule__EnumInterpretation__ObjectsAssignment_3 )
            {
             before(grammarAccess.getEnumInterpretationAccess().getObjectsAssignment_3()); 
            // InternalSolverLanguage.g:4631:3: ( rule__EnumInterpretation__ObjectsAssignment_3 )
            // InternalSolverLanguage.g:4631:4: rule__EnumInterpretation__ObjectsAssignment_3
            {
            pushFollow(FOLLOW_42);
            rule__EnumInterpretation__ObjectsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumInterpretationAccess().getObjectsAssignment_3()); 

            }

            // InternalSolverLanguage.g:4634:2: ( ( rule__EnumInterpretation__ObjectsAssignment_3 )* )
            // InternalSolverLanguage.g:4635:3: ( rule__EnumInterpretation__ObjectsAssignment_3 )*
            {
             before(grammarAccess.getEnumInterpretationAccess().getObjectsAssignment_3()); 
            // InternalSolverLanguage.g:4636:3: ( rule__EnumInterpretation__ObjectsAssignment_3 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==26) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSolverLanguage.g:4636:4: rule__EnumInterpretation__ObjectsAssignment_3
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__EnumInterpretation__ObjectsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalSolverLanguage.g:4645:1: rule__EnumInterpretation__Group__4 : rule__EnumInterpretation__Group__4__Impl ;
    public final void rule__EnumInterpretation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4649:1: ( rule__EnumInterpretation__Group__4__Impl )
            // InternalSolverLanguage.g:4650:2: rule__EnumInterpretation__Group__4__Impl
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
    // InternalSolverLanguage.g:4656:1: rule__EnumInterpretation__Group__4__Impl : ( '}' ) ;
    public final void rule__EnumInterpretation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4660:1: ( ( '}' ) )
            // InternalSolverLanguage.g:4661:1: ( '}' )
            {
            // InternalSolverLanguage.g:4661:1: ( '}' )
            // InternalSolverLanguage.g:4662:2: '}'
            {
             before(grammarAccess.getEnumInterpretationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSolverLanguage.g:4672:1: rule__FieldRelationInterpretation__Group__0 : rule__FieldRelationInterpretation__Group__0__Impl rule__FieldRelationInterpretation__Group__1 ;
    public final void rule__FieldRelationInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4676:1: ( rule__FieldRelationInterpretation__Group__0__Impl rule__FieldRelationInterpretation__Group__1 )
            // InternalSolverLanguage.g:4677:2: rule__FieldRelationInterpretation__Group__0__Impl rule__FieldRelationInterpretation__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSolverLanguage.g:4684:1: rule__FieldRelationInterpretation__Group__0__Impl : ( ( rule__FieldRelationInterpretation__ContainmentAssignment_0 ) ) ;
    public final void rule__FieldRelationInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4688:1: ( ( ( rule__FieldRelationInterpretation__ContainmentAssignment_0 ) ) )
            // InternalSolverLanguage.g:4689:1: ( ( rule__FieldRelationInterpretation__ContainmentAssignment_0 ) )
            {
            // InternalSolverLanguage.g:4689:1: ( ( rule__FieldRelationInterpretation__ContainmentAssignment_0 ) )
            // InternalSolverLanguage.g:4690:2: ( rule__FieldRelationInterpretation__ContainmentAssignment_0 )
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getContainmentAssignment_0()); 
            // InternalSolverLanguage.g:4691:2: ( rule__FieldRelationInterpretation__ContainmentAssignment_0 )
            // InternalSolverLanguage.g:4691:3: rule__FieldRelationInterpretation__ContainmentAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FieldRelationInterpretation__ContainmentAssignment_0();

            state._fsp--;


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
    // InternalSolverLanguage.g:4699:1: rule__FieldRelationInterpretation__Group__1 : rule__FieldRelationInterpretation__Group__1__Impl rule__FieldRelationInterpretation__Group__2 ;
    public final void rule__FieldRelationInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4703:1: ( rule__FieldRelationInterpretation__Group__1__Impl rule__FieldRelationInterpretation__Group__2 )
            // InternalSolverLanguage.g:4704:2: rule__FieldRelationInterpretation__Group__1__Impl rule__FieldRelationInterpretation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalSolverLanguage.g:4711:1: rule__FieldRelationInterpretation__Group__1__Impl : ( ( rule__FieldRelationInterpretation__SymbolAssignment_1 ) ) ;
    public final void rule__FieldRelationInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4715:1: ( ( ( rule__FieldRelationInterpretation__SymbolAssignment_1 ) ) )
            // InternalSolverLanguage.g:4716:1: ( ( rule__FieldRelationInterpretation__SymbolAssignment_1 ) )
            {
            // InternalSolverLanguage.g:4716:1: ( ( rule__FieldRelationInterpretation__SymbolAssignment_1 ) )
            // InternalSolverLanguage.g:4717:2: ( rule__FieldRelationInterpretation__SymbolAssignment_1 )
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getSymbolAssignment_1()); 
            // InternalSolverLanguage.g:4718:2: ( rule__FieldRelationInterpretation__SymbolAssignment_1 )
            // InternalSolverLanguage.g:4718:3: rule__FieldRelationInterpretation__SymbolAssignment_1
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
    // InternalSolverLanguage.g:4726:1: rule__FieldRelationInterpretation__Group__2 : rule__FieldRelationInterpretation__Group__2__Impl rule__FieldRelationInterpretation__Group__3 ;
    public final void rule__FieldRelationInterpretation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4730:1: ( rule__FieldRelationInterpretation__Group__2__Impl rule__FieldRelationInterpretation__Group__3 )
            // InternalSolverLanguage.g:4731:2: rule__FieldRelationInterpretation__Group__2__Impl rule__FieldRelationInterpretation__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalSolverLanguage.g:4738:1: rule__FieldRelationInterpretation__Group__2__Impl : ( ':' ) ;
    public final void rule__FieldRelationInterpretation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4742:1: ( ( ':' ) )
            // InternalSolverLanguage.g:4743:1: ( ':' )
            {
            // InternalSolverLanguage.g:4743:1: ( ':' )
            // InternalSolverLanguage.g:4744:2: ':'
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSolverLanguage.g:4753:1: rule__FieldRelationInterpretation__Group__3 : rule__FieldRelationInterpretation__Group__3__Impl rule__FieldRelationInterpretation__Group__4 ;
    public final void rule__FieldRelationInterpretation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4757:1: ( rule__FieldRelationInterpretation__Group__3__Impl rule__FieldRelationInterpretation__Group__4 )
            // InternalSolverLanguage.g:4758:2: rule__FieldRelationInterpretation__Group__3__Impl rule__FieldRelationInterpretation__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalSolverLanguage.g:4765:1: rule__FieldRelationInterpretation__Group__3__Impl : ( ( rule__FieldRelationInterpretation__MultiplicityAssignment_3 )? ) ;
    public final void rule__FieldRelationInterpretation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4769:1: ( ( ( rule__FieldRelationInterpretation__MultiplicityAssignment_3 )? ) )
            // InternalSolverLanguage.g:4770:1: ( ( rule__FieldRelationInterpretation__MultiplicityAssignment_3 )? )
            {
            // InternalSolverLanguage.g:4770:1: ( ( rule__FieldRelationInterpretation__MultiplicityAssignment_3 )? )
            // InternalSolverLanguage.g:4771:2: ( rule__FieldRelationInterpretation__MultiplicityAssignment_3 )?
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getMultiplicityAssignment_3()); 
            // InternalSolverLanguage.g:4772:2: ( rule__FieldRelationInterpretation__MultiplicityAssignment_3 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSolverLanguage.g:4772:3: rule__FieldRelationInterpretation__MultiplicityAssignment_3
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
    // InternalSolverLanguage.g:4780:1: rule__FieldRelationInterpretation__Group__4 : rule__FieldRelationInterpretation__Group__4__Impl ;
    public final void rule__FieldRelationInterpretation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4784:1: ( rule__FieldRelationInterpretation__Group__4__Impl )
            // InternalSolverLanguage.g:4785:2: rule__FieldRelationInterpretation__Group__4__Impl
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
    // InternalSolverLanguage.g:4791:1: rule__FieldRelationInterpretation__Group__4__Impl : ( ( rule__FieldRelationInterpretation__TargetAssignment_4 ) ) ;
    public final void rule__FieldRelationInterpretation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4795:1: ( ( ( rule__FieldRelationInterpretation__TargetAssignment_4 ) ) )
            // InternalSolverLanguage.g:4796:1: ( ( rule__FieldRelationInterpretation__TargetAssignment_4 ) )
            {
            // InternalSolverLanguage.g:4796:1: ( ( rule__FieldRelationInterpretation__TargetAssignment_4 ) )
            // InternalSolverLanguage.g:4797:2: ( rule__FieldRelationInterpretation__TargetAssignment_4 )
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getTargetAssignment_4()); 
            // InternalSolverLanguage.g:4798:2: ( rule__FieldRelationInterpretation__TargetAssignment_4 )
            // InternalSolverLanguage.g:4798:3: rule__FieldRelationInterpretation__TargetAssignment_4
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
    // InternalSolverLanguage.g:4807:1: rule__GlobalRelationInterpretation__Group__0 : rule__GlobalRelationInterpretation__Group__0__Impl rule__GlobalRelationInterpretation__Group__1 ;
    public final void rule__GlobalRelationInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4811:1: ( rule__GlobalRelationInterpretation__Group__0__Impl rule__GlobalRelationInterpretation__Group__1 )
            // InternalSolverLanguage.g:4812:2: rule__GlobalRelationInterpretation__Group__0__Impl rule__GlobalRelationInterpretation__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalSolverLanguage.g:4819:1: rule__GlobalRelationInterpretation__Group__0__Impl : ( ( rule__GlobalRelationInterpretation__ContainmentAssignment_0 ) ) ;
    public final void rule__GlobalRelationInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4823:1: ( ( ( rule__GlobalRelationInterpretation__ContainmentAssignment_0 ) ) )
            // InternalSolverLanguage.g:4824:1: ( ( rule__GlobalRelationInterpretation__ContainmentAssignment_0 ) )
            {
            // InternalSolverLanguage.g:4824:1: ( ( rule__GlobalRelationInterpretation__ContainmentAssignment_0 ) )
            // InternalSolverLanguage.g:4825:2: ( rule__GlobalRelationInterpretation__ContainmentAssignment_0 )
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getContainmentAssignment_0()); 
            // InternalSolverLanguage.g:4826:2: ( rule__GlobalRelationInterpretation__ContainmentAssignment_0 )
            // InternalSolverLanguage.g:4826:3: rule__GlobalRelationInterpretation__ContainmentAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalRelationInterpretation__ContainmentAssignment_0();

            state._fsp--;


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
    // InternalSolverLanguage.g:4834:1: rule__GlobalRelationInterpretation__Group__1 : rule__GlobalRelationInterpretation__Group__1__Impl rule__GlobalRelationInterpretation__Group__2 ;
    public final void rule__GlobalRelationInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4838:1: ( rule__GlobalRelationInterpretation__Group__1__Impl rule__GlobalRelationInterpretation__Group__2 )
            // InternalSolverLanguage.g:4839:2: rule__GlobalRelationInterpretation__Group__1__Impl rule__GlobalRelationInterpretation__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSolverLanguage.g:4846:1: rule__GlobalRelationInterpretation__Group__1__Impl : ( 'relation' ) ;
    public final void rule__GlobalRelationInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4850:1: ( ( 'relation' ) )
            // InternalSolverLanguage.g:4851:1: ( 'relation' )
            {
            // InternalSolverLanguage.g:4851:1: ( 'relation' )
            // InternalSolverLanguage.g:4852:2: 'relation'
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getRelationKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSolverLanguage.g:4861:1: rule__GlobalRelationInterpretation__Group__2 : rule__GlobalRelationInterpretation__Group__2__Impl rule__GlobalRelationInterpretation__Group__3 ;
    public final void rule__GlobalRelationInterpretation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4865:1: ( rule__GlobalRelationInterpretation__Group__2__Impl rule__GlobalRelationInterpretation__Group__3 )
            // InternalSolverLanguage.g:4866:2: rule__GlobalRelationInterpretation__Group__2__Impl rule__GlobalRelationInterpretation__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalSolverLanguage.g:4873:1: rule__GlobalRelationInterpretation__Group__2__Impl : ( ( rule__GlobalRelationInterpretation__SymbolAssignment_2 ) ) ;
    public final void rule__GlobalRelationInterpretation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4877:1: ( ( ( rule__GlobalRelationInterpretation__SymbolAssignment_2 ) ) )
            // InternalSolverLanguage.g:4878:1: ( ( rule__GlobalRelationInterpretation__SymbolAssignment_2 ) )
            {
            // InternalSolverLanguage.g:4878:1: ( ( rule__GlobalRelationInterpretation__SymbolAssignment_2 ) )
            // InternalSolverLanguage.g:4879:2: ( rule__GlobalRelationInterpretation__SymbolAssignment_2 )
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getSymbolAssignment_2()); 
            // InternalSolverLanguage.g:4880:2: ( rule__GlobalRelationInterpretation__SymbolAssignment_2 )
            // InternalSolverLanguage.g:4880:3: rule__GlobalRelationInterpretation__SymbolAssignment_2
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
    // InternalSolverLanguage.g:4888:1: rule__GlobalRelationInterpretation__Group__3 : rule__GlobalRelationInterpretation__Group__3__Impl rule__GlobalRelationInterpretation__Group__4 ;
    public final void rule__GlobalRelationInterpretation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4892:1: ( rule__GlobalRelationInterpretation__Group__3__Impl rule__GlobalRelationInterpretation__Group__4 )
            // InternalSolverLanguage.g:4893:2: rule__GlobalRelationInterpretation__Group__3__Impl rule__GlobalRelationInterpretation__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalSolverLanguage.g:4900:1: rule__GlobalRelationInterpretation__Group__3__Impl : ( ':' ) ;
    public final void rule__GlobalRelationInterpretation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4904:1: ( ( ':' ) )
            // InternalSolverLanguage.g:4905:1: ( ':' )
            {
            // InternalSolverLanguage.g:4905:1: ( ':' )
            // InternalSolverLanguage.g:4906:2: ':'
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getColonKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSolverLanguage.g:4915:1: rule__GlobalRelationInterpretation__Group__4 : rule__GlobalRelationInterpretation__Group__4__Impl rule__GlobalRelationInterpretation__Group__5 ;
    public final void rule__GlobalRelationInterpretation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4919:1: ( rule__GlobalRelationInterpretation__Group__4__Impl rule__GlobalRelationInterpretation__Group__5 )
            // InternalSolverLanguage.g:4920:2: rule__GlobalRelationInterpretation__Group__4__Impl rule__GlobalRelationInterpretation__Group__5
            {
            pushFollow(FOLLOW_43);
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
    // InternalSolverLanguage.g:4927:1: rule__GlobalRelationInterpretation__Group__4__Impl : ( ( rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4 )? ) ;
    public final void rule__GlobalRelationInterpretation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4931:1: ( ( ( rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4 )? ) )
            // InternalSolverLanguage.g:4932:1: ( ( rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4 )? )
            {
            // InternalSolverLanguage.g:4932:1: ( ( rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4 )? )
            // InternalSolverLanguage.g:4933:2: ( rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4 )?
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getSourceMultiplicityAssignment_4()); 
            // InternalSolverLanguage.g:4934:2: ( rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSolverLanguage.g:4934:3: rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4
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
    // InternalSolverLanguage.g:4942:1: rule__GlobalRelationInterpretation__Group__5 : rule__GlobalRelationInterpretation__Group__5__Impl rule__GlobalRelationInterpretation__Group__6 ;
    public final void rule__GlobalRelationInterpretation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4946:1: ( rule__GlobalRelationInterpretation__Group__5__Impl rule__GlobalRelationInterpretation__Group__6 )
            // InternalSolverLanguage.g:4947:2: rule__GlobalRelationInterpretation__Group__5__Impl rule__GlobalRelationInterpretation__Group__6
            {
            pushFollow(FOLLOW_43);
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
    // InternalSolverLanguage.g:4954:1: rule__GlobalRelationInterpretation__Group__5__Impl : ( ( rule__GlobalRelationInterpretation__SourceAssignment_5 ) ) ;
    public final void rule__GlobalRelationInterpretation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4958:1: ( ( ( rule__GlobalRelationInterpretation__SourceAssignment_5 ) ) )
            // InternalSolverLanguage.g:4959:1: ( ( rule__GlobalRelationInterpretation__SourceAssignment_5 ) )
            {
            // InternalSolverLanguage.g:4959:1: ( ( rule__GlobalRelationInterpretation__SourceAssignment_5 ) )
            // InternalSolverLanguage.g:4960:2: ( rule__GlobalRelationInterpretation__SourceAssignment_5 )
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getSourceAssignment_5()); 
            // InternalSolverLanguage.g:4961:2: ( rule__GlobalRelationInterpretation__SourceAssignment_5 )
            // InternalSolverLanguage.g:4961:3: rule__GlobalRelationInterpretation__SourceAssignment_5
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
    // InternalSolverLanguage.g:4969:1: rule__GlobalRelationInterpretation__Group__6 : rule__GlobalRelationInterpretation__Group__6__Impl rule__GlobalRelationInterpretation__Group__7 ;
    public final void rule__GlobalRelationInterpretation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4973:1: ( rule__GlobalRelationInterpretation__Group__6__Impl rule__GlobalRelationInterpretation__Group__7 )
            // InternalSolverLanguage.g:4974:2: rule__GlobalRelationInterpretation__Group__6__Impl rule__GlobalRelationInterpretation__Group__7
            {
            pushFollow(FOLLOW_43);
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
    // InternalSolverLanguage.g:4981:1: rule__GlobalRelationInterpretation__Group__6__Impl : ( ( rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6 )? ) ;
    public final void rule__GlobalRelationInterpretation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:4985:1: ( ( ( rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6 )? ) )
            // InternalSolverLanguage.g:4986:1: ( ( rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6 )? )
            {
            // InternalSolverLanguage.g:4986:1: ( ( rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6 )? )
            // InternalSolverLanguage.g:4987:2: ( rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6 )?
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getTargetMultiplicityAssignment_6()); 
            // InternalSolverLanguage.g:4988:2: ( rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSolverLanguage.g:4988:3: rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6
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
    // InternalSolverLanguage.g:4996:1: rule__GlobalRelationInterpretation__Group__7 : rule__GlobalRelationInterpretation__Group__7__Impl ;
    public final void rule__GlobalRelationInterpretation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5000:1: ( rule__GlobalRelationInterpretation__Group__7__Impl )
            // InternalSolverLanguage.g:5001:2: rule__GlobalRelationInterpretation__Group__7__Impl
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
    // InternalSolverLanguage.g:5007:1: rule__GlobalRelationInterpretation__Group__7__Impl : ( ( rule__GlobalRelationInterpretation__TargetAssignment_7 ) ) ;
    public final void rule__GlobalRelationInterpretation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5011:1: ( ( ( rule__GlobalRelationInterpretation__TargetAssignment_7 ) ) )
            // InternalSolverLanguage.g:5012:1: ( ( rule__GlobalRelationInterpretation__TargetAssignment_7 ) )
            {
            // InternalSolverLanguage.g:5012:1: ( ( rule__GlobalRelationInterpretation__TargetAssignment_7 ) )
            // InternalSolverLanguage.g:5013:2: ( rule__GlobalRelationInterpretation__TargetAssignment_7 )
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getTargetAssignment_7()); 
            // InternalSolverLanguage.g:5014:2: ( rule__GlobalRelationInterpretation__TargetAssignment_7 )
            // InternalSolverLanguage.g:5014:3: rule__GlobalRelationInterpretation__TargetAssignment_7
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
    // InternalSolverLanguage.g:5023:1: rule__MultiplicityDefinition__Group__0 : rule__MultiplicityDefinition__Group__0__Impl rule__MultiplicityDefinition__Group__1 ;
    public final void rule__MultiplicityDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5027:1: ( rule__MultiplicityDefinition__Group__0__Impl rule__MultiplicityDefinition__Group__1 )
            // InternalSolverLanguage.g:5028:2: rule__MultiplicityDefinition__Group__0__Impl rule__MultiplicityDefinition__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalSolverLanguage.g:5035:1: rule__MultiplicityDefinition__Group__0__Impl : ( ( rule__MultiplicityDefinition__LowerAssignment_0 ) ) ;
    public final void rule__MultiplicityDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5039:1: ( ( ( rule__MultiplicityDefinition__LowerAssignment_0 ) ) )
            // InternalSolverLanguage.g:5040:1: ( ( rule__MultiplicityDefinition__LowerAssignment_0 ) )
            {
            // InternalSolverLanguage.g:5040:1: ( ( rule__MultiplicityDefinition__LowerAssignment_0 ) )
            // InternalSolverLanguage.g:5041:2: ( rule__MultiplicityDefinition__LowerAssignment_0 )
            {
             before(grammarAccess.getMultiplicityDefinitionAccess().getLowerAssignment_0()); 
            // InternalSolverLanguage.g:5042:2: ( rule__MultiplicityDefinition__LowerAssignment_0 )
            // InternalSolverLanguage.g:5042:3: rule__MultiplicityDefinition__LowerAssignment_0
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
    // InternalSolverLanguage.g:5050:1: rule__MultiplicityDefinition__Group__1 : rule__MultiplicityDefinition__Group__1__Impl rule__MultiplicityDefinition__Group__2 ;
    public final void rule__MultiplicityDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5054:1: ( rule__MultiplicityDefinition__Group__1__Impl rule__MultiplicityDefinition__Group__2 )
            // InternalSolverLanguage.g:5055:2: rule__MultiplicityDefinition__Group__1__Impl rule__MultiplicityDefinition__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalSolverLanguage.g:5062:1: rule__MultiplicityDefinition__Group__1__Impl : ( '..' ) ;
    public final void rule__MultiplicityDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5066:1: ( ( '..' ) )
            // InternalSolverLanguage.g:5067:1: ( '..' )
            {
            // InternalSolverLanguage.g:5067:1: ( '..' )
            // InternalSolverLanguage.g:5068:2: '..'
            {
             before(grammarAccess.getMultiplicityDefinitionAccess().getFullStopFullStopKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSolverLanguage.g:5077:1: rule__MultiplicityDefinition__Group__2 : rule__MultiplicityDefinition__Group__2__Impl ;
    public final void rule__MultiplicityDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5081:1: ( rule__MultiplicityDefinition__Group__2__Impl )
            // InternalSolverLanguage.g:5082:2: rule__MultiplicityDefinition__Group__2__Impl
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
    // InternalSolverLanguage.g:5088:1: rule__MultiplicityDefinition__Group__2__Impl : ( ( rule__MultiplicityDefinition__Alternatives_2 ) ) ;
    public final void rule__MultiplicityDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5092:1: ( ( ( rule__MultiplicityDefinition__Alternatives_2 ) ) )
            // InternalSolverLanguage.g:5093:1: ( ( rule__MultiplicityDefinition__Alternatives_2 ) )
            {
            // InternalSolverLanguage.g:5093:1: ( ( rule__MultiplicityDefinition__Alternatives_2 ) )
            // InternalSolverLanguage.g:5094:2: ( rule__MultiplicityDefinition__Alternatives_2 )
            {
             before(grammarAccess.getMultiplicityDefinitionAccess().getAlternatives_2()); 
            // InternalSolverLanguage.g:5095:2: ( rule__MultiplicityDefinition__Alternatives_2 )
            // InternalSolverLanguage.g:5095:3: rule__MultiplicityDefinition__Alternatives_2
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
    // InternalSolverLanguage.g:5104:1: rule__Problem__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Problem__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5108:1: ( ( ruleStatement ) )
            // InternalSolverLanguage.g:5109:2: ( ruleStatement )
            {
            // InternalSolverLanguage.g:5109:2: ( ruleStatement )
            // InternalSolverLanguage.g:5110:3: ruleStatement
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
    // InternalSolverLanguage.g:5119:1: rule__BasicInterpretation__SymbolAssignment_0 : ( ruleSymbol ) ;
    public final void rule__BasicInterpretation__SymbolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5123:1: ( ( ruleSymbol ) )
            // InternalSolverLanguage.g:5124:2: ( ruleSymbol )
            {
            // InternalSolverLanguage.g:5124:2: ( ruleSymbol )
            // InternalSolverLanguage.g:5125:3: ruleSymbol
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


    // $ANTLR start "rule__BasicInterpretation__ObjectsAssignment_2"
    // InternalSolverLanguage.g:5134:1: rule__BasicInterpretation__ObjectsAssignment_2 : ( ruleComplexObject ) ;
    public final void rule__BasicInterpretation__ObjectsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5138:1: ( ( ruleComplexObject ) )
            // InternalSolverLanguage.g:5139:2: ( ruleComplexObject )
            {
            // InternalSolverLanguage.g:5139:2: ( ruleComplexObject )
            // InternalSolverLanguage.g:5140:3: ruleComplexObject
            {
             before(grammarAccess.getBasicInterpretationAccess().getObjectsComplexObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexObject();

            state._fsp--;

             after(grammarAccess.getBasicInterpretationAccess().getObjectsComplexObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicInterpretation__ObjectsAssignment_2"


    // $ANTLR start "rule__BasicInterpretation__ValueAssignment_5"
    // InternalSolverLanguage.g:5149:1: rule__BasicInterpretation__ValueAssignment_5 : ( ruleTruthValue ) ;
    public final void rule__BasicInterpretation__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5153:1: ( ( ruleTruthValue ) )
            // InternalSolverLanguage.g:5154:2: ( ruleTruthValue )
            {
            // InternalSolverLanguage.g:5154:2: ( ruleTruthValue )
            // InternalSolverLanguage.g:5155:3: ruleTruthValue
            {
             before(grammarAccess.getBasicInterpretationAccess().getValueTruthValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTruthValue();

            state._fsp--;

             after(grammarAccess.getBasicInterpretationAccess().getValueTruthValueParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicInterpretation__ValueAssignment_5"


    // $ANTLR start "rule__ModelSymbol__NameAssignment"
    // InternalSolverLanguage.g:5164:1: rule__ModelSymbol__NameAssignment : ( RULE_ID ) ;
    public final void rule__ModelSymbol__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5168:1: ( ( RULE_ID ) )
            // InternalSolverLanguage.g:5169:2: ( RULE_ID )
            {
            // InternalSolverLanguage.g:5169:2: ( RULE_ID )
            // InternalSolverLanguage.g:5170:3: RULE_ID
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
    // InternalSolverLanguage.g:5179:1: rule__NamedObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NamedObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5183:1: ( ( RULE_ID ) )
            // InternalSolverLanguage.g:5184:2: ( RULE_ID )
            {
            // InternalSolverLanguage.g:5184:2: ( RULE_ID )
            // InternalSolverLanguage.g:5185:3: RULE_ID
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
    // InternalSolverLanguage.g:5194:1: rule__UnnamedObject__NameAssignment : ( RULE_ID ) ;
    public final void rule__UnnamedObject__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5198:1: ( ( RULE_ID ) )
            // InternalSolverLanguage.g:5199:2: ( RULE_ID )
            {
            // InternalSolverLanguage.g:5199:2: ( RULE_ID )
            // InternalSolverLanguage.g:5200:3: RULE_ID
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
    // InternalSolverLanguage.g:5209:1: rule__BooleanObject__ValueAssignment : ( ruleBooleanValue ) ;
    public final void rule__BooleanObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5213:1: ( ( ruleBooleanValue ) )
            // InternalSolverLanguage.g:5214:2: ( ruleBooleanValue )
            {
            // InternalSolverLanguage.g:5214:2: ( ruleBooleanValue )
            // InternalSolverLanguage.g:5215:3: ruleBooleanValue
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
    // InternalSolverLanguage.g:5224:1: rule__IntObject__ValueAssignment : ( ruleINTLiteral ) ;
    public final void rule__IntObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5228:1: ( ( ruleINTLiteral ) )
            // InternalSolverLanguage.g:5229:2: ( ruleINTLiteral )
            {
            // InternalSolverLanguage.g:5229:2: ( ruleINTLiteral )
            // InternalSolverLanguage.g:5230:3: ruleINTLiteral
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
    // InternalSolverLanguage.g:5239:1: rule__RealObject__ValueAssignment : ( ruleREALLiteral ) ;
    public final void rule__RealObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5243:1: ( ( ruleREALLiteral ) )
            // InternalSolverLanguage.g:5244:2: ( ruleREALLiteral )
            {
            // InternalSolverLanguage.g:5244:2: ( ruleREALLiteral )
            // InternalSolverLanguage.g:5245:3: ruleREALLiteral
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
    // InternalSolverLanguage.g:5254:1: rule__StringObject__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5258:1: ( ( RULE_STRING ) )
            // InternalSolverLanguage.g:5259:2: ( RULE_STRING )
            {
            // InternalSolverLanguage.g:5259:2: ( RULE_STRING )
            // InternalSolverLanguage.g:5260:3: RULE_STRING
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


    // $ANTLR start "rule__PredicateSymbol__SymbolAssignment_1"
    // InternalSolverLanguage.g:5269:1: rule__PredicateSymbol__SymbolAssignment_1 : ( ruleModelSymbol ) ;
    public final void rule__PredicateSymbol__SymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5273:1: ( ( ruleModelSymbol ) )
            // InternalSolverLanguage.g:5274:2: ( ruleModelSymbol )
            {
            // InternalSolverLanguage.g:5274:2: ( ruleModelSymbol )
            // InternalSolverLanguage.g:5275:3: ruleModelSymbol
            {
             before(grammarAccess.getPredicateSymbolAccess().getSymbolModelSymbolParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModelSymbol();

            state._fsp--;

             after(grammarAccess.getPredicateSymbolAccess().getSymbolModelSymbolParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateSymbol__SymbolAssignment_1"


    // $ANTLR start "rule__PredicateSymbol__ParametersAssignment_3"
    // InternalSolverLanguage.g:5284:1: rule__PredicateSymbol__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__PredicateSymbol__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5288:1: ( ( ruleParameter ) )
            // InternalSolverLanguage.g:5289:2: ( ruleParameter )
            {
            // InternalSolverLanguage.g:5289:2: ( ruleParameter )
            // InternalSolverLanguage.g:5290:3: ruleParameter
            {
             before(grammarAccess.getPredicateSymbolAccess().getParametersParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getPredicateSymbolAccess().getParametersParameterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateSymbol__ParametersAssignment_3"


    // $ANTLR start "rule__PredicateSymbol__BodiesAssignment_6_1_0"
    // InternalSolverLanguage.g:5299:1: rule__PredicateSymbol__BodiesAssignment_6_1_0 : ( rulePatternBody ) ;
    public final void rule__PredicateSymbol__BodiesAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5303:1: ( ( rulePatternBody ) )
            // InternalSolverLanguage.g:5304:2: ( rulePatternBody )
            {
            // InternalSolverLanguage.g:5304:2: ( rulePatternBody )
            // InternalSolverLanguage.g:5305:3: rulePatternBody
            {
             before(grammarAccess.getPredicateSymbolAccess().getBodiesPatternBodyParserRuleCall_6_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePatternBody();

            state._fsp--;

             after(grammarAccess.getPredicateSymbolAccess().getBodiesPatternBodyParserRuleCall_6_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateSymbol__BodiesAssignment_6_1_0"


    // $ANTLR start "rule__PredicateSymbol__BodiesAssignment_6_1_1_1"
    // InternalSolverLanguage.g:5314:1: rule__PredicateSymbol__BodiesAssignment_6_1_1_1 : ( rulePatternBody ) ;
    public final void rule__PredicateSymbol__BodiesAssignment_6_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5318:1: ( ( rulePatternBody ) )
            // InternalSolverLanguage.g:5319:2: ( rulePatternBody )
            {
            // InternalSolverLanguage.g:5319:2: ( rulePatternBody )
            // InternalSolverLanguage.g:5320:3: rulePatternBody
            {
             before(grammarAccess.getPredicateSymbolAccess().getBodiesPatternBodyParserRuleCall_6_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePatternBody();

            state._fsp--;

             after(grammarAccess.getPredicateSymbolAccess().getBodiesPatternBodyParserRuleCall_6_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateSymbol__BodiesAssignment_6_1_1_1"


    // $ANTLR start "rule__ErrorPredicate__NameAssignment_2"
    // InternalSolverLanguage.g:5329:1: rule__ErrorPredicate__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ErrorPredicate__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5333:1: ( ( RULE_ID ) )
            // InternalSolverLanguage.g:5334:2: ( RULE_ID )
            {
            // InternalSolverLanguage.g:5334:2: ( RULE_ID )
            // InternalSolverLanguage.g:5335:3: RULE_ID
            {
             before(grammarAccess.getErrorPredicateAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getErrorPredicateAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__NameAssignment_2"


    // $ANTLR start "rule__ErrorPredicate__ParametersAssignment_3_1"
    // InternalSolverLanguage.g:5344:1: rule__ErrorPredicate__ParametersAssignment_3_1 : ( ruleParameter ) ;
    public final void rule__ErrorPredicate__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5348:1: ( ( ruleParameter ) )
            // InternalSolverLanguage.g:5349:2: ( ruleParameter )
            {
            // InternalSolverLanguage.g:5349:2: ( ruleParameter )
            // InternalSolverLanguage.g:5350:3: ruleParameter
            {
             before(grammarAccess.getErrorPredicateAccess().getParametersParameterParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getErrorPredicateAccess().getParametersParameterParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__ParametersAssignment_3_1"


    // $ANTLR start "rule__ErrorPredicate__BodiesAssignment_5_1_0"
    // InternalSolverLanguage.g:5359:1: rule__ErrorPredicate__BodiesAssignment_5_1_0 : ( rulePatternBody ) ;
    public final void rule__ErrorPredicate__BodiesAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5363:1: ( ( rulePatternBody ) )
            // InternalSolverLanguage.g:5364:2: ( rulePatternBody )
            {
            // InternalSolverLanguage.g:5364:2: ( rulePatternBody )
            // InternalSolverLanguage.g:5365:3: rulePatternBody
            {
             before(grammarAccess.getErrorPredicateAccess().getBodiesPatternBodyParserRuleCall_5_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePatternBody();

            state._fsp--;

             after(grammarAccess.getErrorPredicateAccess().getBodiesPatternBodyParserRuleCall_5_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__BodiesAssignment_5_1_0"


    // $ANTLR start "rule__ErrorPredicate__BodiesAssignment_5_1_1_1"
    // InternalSolverLanguage.g:5374:1: rule__ErrorPredicate__BodiesAssignment_5_1_1_1 : ( rulePatternBody ) ;
    public final void rule__ErrorPredicate__BodiesAssignment_5_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5378:1: ( ( rulePatternBody ) )
            // InternalSolverLanguage.g:5379:2: ( rulePatternBody )
            {
            // InternalSolverLanguage.g:5379:2: ( rulePatternBody )
            // InternalSolverLanguage.g:5380:3: rulePatternBody
            {
             before(grammarAccess.getErrorPredicateAccess().getBodiesPatternBodyParserRuleCall_5_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePatternBody();

            state._fsp--;

             after(grammarAccess.getErrorPredicateAccess().getBodiesPatternBodyParserRuleCall_5_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ErrorPredicate__BodiesAssignment_5_1_1_1"


    // $ANTLR start "rule__Parameter__VariableAssignment_0"
    // InternalSolverLanguage.g:5389:1: rule__Parameter__VariableAssignment_0 : ( ruleVariable ) ;
    public final void rule__Parameter__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5393:1: ( ( ruleVariable ) )
            // InternalSolverLanguage.g:5394:2: ( ruleVariable )
            {
            // InternalSolverLanguage.g:5394:2: ( ruleVariable )
            // InternalSolverLanguage.g:5395:3: ruleVariable
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
    // InternalSolverLanguage.g:5404:1: rule__Parameter__TypeAssignment_1_1 : ( ruleSymbol ) ;
    public final void rule__Parameter__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5408:1: ( ( ruleSymbol ) )
            // InternalSolverLanguage.g:5409:2: ( ruleSymbol )
            {
            // InternalSolverLanguage.g:5409:2: ( ruleSymbol )
            // InternalSolverLanguage.g:5410:3: ruleSymbol
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
    // InternalSolverLanguage.g:5419:1: rule__PatternBody__ConstraintsAssignment_1_1 : ( ruleConstraint ) ;
    public final void rule__PatternBody__ConstraintsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5423:1: ( ( ruleConstraint ) )
            // InternalSolverLanguage.g:5424:2: ( ruleConstraint )
            {
            // InternalSolverLanguage.g:5424:2: ( ruleConstraint )
            // InternalSolverLanguage.g:5425:3: ruleConstraint
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


    // $ANTLR start "rule__Constraint__PolarityAssignment_0"
    // InternalSolverLanguage.g:5434:1: rule__Constraint__PolarityAssignment_0 : ( rulePolarity ) ;
    public final void rule__Constraint__PolarityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5438:1: ( ( rulePolarity ) )
            // InternalSolverLanguage.g:5439:2: ( rulePolarity )
            {
            // InternalSolverLanguage.g:5439:2: ( rulePolarity )
            // InternalSolverLanguage.g:5440:3: rulePolarity
            {
             before(grammarAccess.getConstraintAccess().getPolarityPolarityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePolarity();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getPolarityPolarityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__PolarityAssignment_0"


    // $ANTLR start "rule__Constraint__SymbolAssignment_1"
    // InternalSolverLanguage.g:5449:1: rule__Constraint__SymbolAssignment_1 : ( ruleModelSymbol ) ;
    public final void rule__Constraint__SymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5453:1: ( ( ruleModelSymbol ) )
            // InternalSolverLanguage.g:5454:2: ( ruleModelSymbol )
            {
            // InternalSolverLanguage.g:5454:2: ( ruleModelSymbol )
            // InternalSolverLanguage.g:5455:3: ruleModelSymbol
            {
             before(grammarAccess.getConstraintAccess().getSymbolModelSymbolParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModelSymbol();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getSymbolModelSymbolParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__SymbolAssignment_1"


    // $ANTLR start "rule__Constraint__ParamsAssignment_2_0_1"
    // InternalSolverLanguage.g:5464:1: rule__Constraint__ParamsAssignment_2_0_1 : ( ruleLiteral ) ;
    public final void rule__Constraint__ParamsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5468:1: ( ( ruleLiteral ) )
            // InternalSolverLanguage.g:5469:2: ( ruleLiteral )
            {
            // InternalSolverLanguage.g:5469:2: ( ruleLiteral )
            // InternalSolverLanguage.g:5470:3: ruleLiteral
            {
             before(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ParamsAssignment_2_0_1"


    // $ANTLR start "rule__Constraint__ClosureTypeAssignment_2_1_0"
    // InternalSolverLanguage.g:5479:1: rule__Constraint__ClosureTypeAssignment_2_1_0 : ( ruleClosureType ) ;
    public final void rule__Constraint__ClosureTypeAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5483:1: ( ( ruleClosureType ) )
            // InternalSolverLanguage.g:5484:2: ( ruleClosureType )
            {
            // InternalSolverLanguage.g:5484:2: ( ruleClosureType )
            // InternalSolverLanguage.g:5485:3: ruleClosureType
            {
             before(grammarAccess.getConstraintAccess().getClosureTypeClosureTypeParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClosureType();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getClosureTypeClosureTypeParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ClosureTypeAssignment_2_1_0"


    // $ANTLR start "rule__Constraint__ParamsAssignment_2_1_2"
    // InternalSolverLanguage.g:5494:1: rule__Constraint__ParamsAssignment_2_1_2 : ( ruleLiteral ) ;
    public final void rule__Constraint__ParamsAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5498:1: ( ( ruleLiteral ) )
            // InternalSolverLanguage.g:5499:2: ( ruleLiteral )
            {
            // InternalSolverLanguage.g:5499:2: ( ruleLiteral )
            // InternalSolverLanguage.g:5500:3: ruleLiteral
            {
             before(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ParamsAssignment_2_1_2"


    // $ANTLR start "rule__Constraint__ParamsAssignment_2_1_3"
    // InternalSolverLanguage.g:5509:1: rule__Constraint__ParamsAssignment_2_1_3 : ( ruleLiteral ) ;
    public final void rule__Constraint__ParamsAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5513:1: ( ( ruleLiteral ) )
            // InternalSolverLanguage.g:5514:2: ( ruleLiteral )
            {
            // InternalSolverLanguage.g:5514:2: ( ruleLiteral )
            // InternalSolverLanguage.g:5515:3: ruleLiteral
            {
             before(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_2_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_2_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ParamsAssignment_2_1_3"


    // $ANTLR start "rule__Variable__NameAssignment"
    // InternalSolverLanguage.g:5524:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5528:1: ( ( RULE_ID ) )
            // InternalSolverLanguage.g:5529:2: ( RULE_ID )
            {
            // InternalSolverLanguage.g:5529:2: ( RULE_ID )
            // InternalSolverLanguage.g:5530:3: RULE_ID
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
    // InternalSolverLanguage.g:5539:1: rule__AllInstances__SymbolAssignment_1 : ( ruleSymbol ) ;
    public final void rule__AllInstances__SymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5543:1: ( ( ruleSymbol ) )
            // InternalSolverLanguage.g:5544:2: ( ruleSymbol )
            {
            // InternalSolverLanguage.g:5544:2: ( ruleSymbol )
            // InternalSolverLanguage.g:5545:3: ruleSymbol
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
    // InternalSolverLanguage.g:5554:1: rule__DefaultInterpretation__InterpretationAssignment_1 : ( ruleBasicInterpretation ) ;
    public final void rule__DefaultInterpretation__InterpretationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5558:1: ( ( ruleBasicInterpretation ) )
            // InternalSolverLanguage.g:5559:2: ( ruleBasicInterpretation )
            {
            // InternalSolverLanguage.g:5559:2: ( ruleBasicInterpretation )
            // InternalSolverLanguage.g:5560:3: ruleBasicInterpretation
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
    // InternalSolverLanguage.g:5569:1: rule__ClassInterpretation__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ClassInterpretation__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5573:1: ( ( ( 'abstract' ) ) )
            // InternalSolverLanguage.g:5574:2: ( ( 'abstract' ) )
            {
            // InternalSolverLanguage.g:5574:2: ( ( 'abstract' ) )
            // InternalSolverLanguage.g:5575:3: ( 'abstract' )
            {
             before(grammarAccess.getClassInterpretationAccess().getAbstractAbstractKeyword_0_0()); 
            // InternalSolverLanguage.g:5576:3: ( 'abstract' )
            // InternalSolverLanguage.g:5577:4: 'abstract'
            {
             before(grammarAccess.getClassInterpretationAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSolverLanguage.g:5588:1: rule__ClassInterpretation__SymbolAssignment_2 : ( ruleModelSymbol ) ;
    public final void rule__ClassInterpretation__SymbolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5592:1: ( ( ruleModelSymbol ) )
            // InternalSolverLanguage.g:5593:2: ( ruleModelSymbol )
            {
            // InternalSolverLanguage.g:5593:2: ( ruleModelSymbol )
            // InternalSolverLanguage.g:5594:3: ruleModelSymbol
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
    // InternalSolverLanguage.g:5603:1: rule__ClassInterpretation__SupertypesAssignment_3_1 : ( ruleModelSymbol ) ;
    public final void rule__ClassInterpretation__SupertypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5607:1: ( ( ruleModelSymbol ) )
            // InternalSolverLanguage.g:5608:2: ( ruleModelSymbol )
            {
            // InternalSolverLanguage.g:5608:2: ( ruleModelSymbol )
            // InternalSolverLanguage.g:5609:3: ruleModelSymbol
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
    // InternalSolverLanguage.g:5618:1: rule__ClassInterpretation__FieltAssignment_5 : ( ruleFieldRelationInterpretation ) ;
    public final void rule__ClassInterpretation__FieltAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5622:1: ( ( ruleFieldRelationInterpretation ) )
            // InternalSolverLanguage.g:5623:2: ( ruleFieldRelationInterpretation )
            {
            // InternalSolverLanguage.g:5623:2: ( ruleFieldRelationInterpretation )
            // InternalSolverLanguage.g:5624:3: ruleFieldRelationInterpretation
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
    // InternalSolverLanguage.g:5633:1: rule__EnumInterpretation__SymbolAssignment_1 : ( ruleModelSymbol ) ;
    public final void rule__EnumInterpretation__SymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5637:1: ( ( ruleModelSymbol ) )
            // InternalSolverLanguage.g:5638:2: ( ruleModelSymbol )
            {
            // InternalSolverLanguage.g:5638:2: ( ruleModelSymbol )
            // InternalSolverLanguage.g:5639:3: ruleModelSymbol
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
    // InternalSolverLanguage.g:5648:1: rule__EnumInterpretation__ObjectsAssignment_3 : ( ruleNamedObject ) ;
    public final void rule__EnumInterpretation__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5652:1: ( ( ruleNamedObject ) )
            // InternalSolverLanguage.g:5653:2: ( ruleNamedObject )
            {
            // InternalSolverLanguage.g:5653:2: ( ruleNamedObject )
            // InternalSolverLanguage.g:5654:3: ruleNamedObject
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
    // InternalSolverLanguage.g:5663:1: rule__FieldRelationInterpretation__ContainmentAssignment_0 : ( ( 'containment' ) ) ;
    public final void rule__FieldRelationInterpretation__ContainmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5667:1: ( ( ( 'containment' ) ) )
            // InternalSolverLanguage.g:5668:2: ( ( 'containment' ) )
            {
            // InternalSolverLanguage.g:5668:2: ( ( 'containment' ) )
            // InternalSolverLanguage.g:5669:3: ( 'containment' )
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getContainmentContainmentKeyword_0_0()); 
            // InternalSolverLanguage.g:5670:3: ( 'containment' )
            // InternalSolverLanguage.g:5671:4: 'containment'
            {
             before(grammarAccess.getFieldRelationInterpretationAccess().getContainmentContainmentKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSolverLanguage.g:5682:1: rule__FieldRelationInterpretation__SymbolAssignment_1 : ( ruleModelSymbol ) ;
    public final void rule__FieldRelationInterpretation__SymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5686:1: ( ( ruleModelSymbol ) )
            // InternalSolverLanguage.g:5687:2: ( ruleModelSymbol )
            {
            // InternalSolverLanguage.g:5687:2: ( ruleModelSymbol )
            // InternalSolverLanguage.g:5688:3: ruleModelSymbol
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
    // InternalSolverLanguage.g:5697:1: rule__FieldRelationInterpretation__MultiplicityAssignment_3 : ( ruleMultiplicityDefinition ) ;
    public final void rule__FieldRelationInterpretation__MultiplicityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5701:1: ( ( ruleMultiplicityDefinition ) )
            // InternalSolverLanguage.g:5702:2: ( ruleMultiplicityDefinition )
            {
            // InternalSolverLanguage.g:5702:2: ( ruleMultiplicityDefinition )
            // InternalSolverLanguage.g:5703:3: ruleMultiplicityDefinition
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
    // InternalSolverLanguage.g:5712:1: rule__FieldRelationInterpretation__TargetAssignment_4 : ( ruleSymbol ) ;
    public final void rule__FieldRelationInterpretation__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5716:1: ( ( ruleSymbol ) )
            // InternalSolverLanguage.g:5717:2: ( ruleSymbol )
            {
            // InternalSolverLanguage.g:5717:2: ( ruleSymbol )
            // InternalSolverLanguage.g:5718:3: ruleSymbol
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
    // InternalSolverLanguage.g:5727:1: rule__GlobalRelationInterpretation__ContainmentAssignment_0 : ( ( 'containment' ) ) ;
    public final void rule__GlobalRelationInterpretation__ContainmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5731:1: ( ( ( 'containment' ) ) )
            // InternalSolverLanguage.g:5732:2: ( ( 'containment' ) )
            {
            // InternalSolverLanguage.g:5732:2: ( ( 'containment' ) )
            // InternalSolverLanguage.g:5733:3: ( 'containment' )
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getContainmentContainmentKeyword_0_0()); 
            // InternalSolverLanguage.g:5734:3: ( 'containment' )
            // InternalSolverLanguage.g:5735:4: 'containment'
            {
             before(grammarAccess.getGlobalRelationInterpretationAccess().getContainmentContainmentKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSolverLanguage.g:5746:1: rule__GlobalRelationInterpretation__SymbolAssignment_2 : ( ruleModelSymbol ) ;
    public final void rule__GlobalRelationInterpretation__SymbolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5750:1: ( ( ruleModelSymbol ) )
            // InternalSolverLanguage.g:5751:2: ( ruleModelSymbol )
            {
            // InternalSolverLanguage.g:5751:2: ( ruleModelSymbol )
            // InternalSolverLanguage.g:5752:3: ruleModelSymbol
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
    // InternalSolverLanguage.g:5761:1: rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4 : ( ruleMultiplicityDefinition ) ;
    public final void rule__GlobalRelationInterpretation__SourceMultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5765:1: ( ( ruleMultiplicityDefinition ) )
            // InternalSolverLanguage.g:5766:2: ( ruleMultiplicityDefinition )
            {
            // InternalSolverLanguage.g:5766:2: ( ruleMultiplicityDefinition )
            // InternalSolverLanguage.g:5767:3: ruleMultiplicityDefinition
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
    // InternalSolverLanguage.g:5776:1: rule__GlobalRelationInterpretation__SourceAssignment_5 : ( ruleSymbol ) ;
    public final void rule__GlobalRelationInterpretation__SourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5780:1: ( ( ruleSymbol ) )
            // InternalSolverLanguage.g:5781:2: ( ruleSymbol )
            {
            // InternalSolverLanguage.g:5781:2: ( ruleSymbol )
            // InternalSolverLanguage.g:5782:3: ruleSymbol
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
    // InternalSolverLanguage.g:5791:1: rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6 : ( ruleMultiplicityDefinition ) ;
    public final void rule__GlobalRelationInterpretation__TargetMultiplicityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5795:1: ( ( ruleMultiplicityDefinition ) )
            // InternalSolverLanguage.g:5796:2: ( ruleMultiplicityDefinition )
            {
            // InternalSolverLanguage.g:5796:2: ( ruleMultiplicityDefinition )
            // InternalSolverLanguage.g:5797:3: ruleMultiplicityDefinition
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
    // InternalSolverLanguage.g:5806:1: rule__GlobalRelationInterpretation__TargetAssignment_7 : ( ruleSymbol ) ;
    public final void rule__GlobalRelationInterpretation__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5810:1: ( ( ruleSymbol ) )
            // InternalSolverLanguage.g:5811:2: ( ruleSymbol )
            {
            // InternalSolverLanguage.g:5811:2: ( ruleSymbol )
            // InternalSolverLanguage.g:5812:3: ruleSymbol
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
    // InternalSolverLanguage.g:5821:1: rule__MultiplicityDefinition__LowerAssignment_0 : ( RULE_INT ) ;
    public final void rule__MultiplicityDefinition__LowerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5825:1: ( ( RULE_INT ) )
            // InternalSolverLanguage.g:5826:2: ( RULE_INT )
            {
            // InternalSolverLanguage.g:5826:2: ( RULE_INT )
            // InternalSolverLanguage.g:5827:3: RULE_INT
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
    // InternalSolverLanguage.g:5836:1: rule__MultiplicityDefinition__UpperAssignment_2_0 : ( RULE_INT ) ;
    public final void rule__MultiplicityDefinition__UpperAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5840:1: ( ( RULE_INT ) )
            // InternalSolverLanguage.g:5841:2: ( RULE_INT )
            {
            // InternalSolverLanguage.g:5841:2: ( RULE_INT )
            // InternalSolverLanguage.g:5842:3: RULE_INT
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
    // InternalSolverLanguage.g:5851:1: rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1 : ( ( '*' ) ) ;
    public final void rule__MultiplicityDefinition__UnlimitedUpperAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSolverLanguage.g:5855:1: ( ( ( '*' ) ) )
            // InternalSolverLanguage.g:5856:2: ( ( '*' ) )
            {
            // InternalSolverLanguage.g:5856:2: ( ( '*' ) )
            // InternalSolverLanguage.g:5857:3: ( '*' )
            {
             before(grammarAccess.getMultiplicityDefinitionAccess().getUnlimitedUpperAsteriskKeyword_2_1_0()); 
            // InternalSolverLanguage.g:5858:3: ( '*' )
            // InternalSolverLanguage.g:5859:4: '*'
            {
             before(grammarAccess.getMultiplicityDefinitionAccess().getUnlimitedUpperAsteriskKeyword_2_1_0()); 
            match(input,30,FOLLOW_2); 
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000001908BF10022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020002022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000440C3870L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000044083872L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000019800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020003820L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000001908BF10020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000003F00020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020002020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000060020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000004043870L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004003872L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000004003870L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000044083870L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000003F00030L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000040000010L});

}