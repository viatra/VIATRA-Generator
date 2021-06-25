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
import org.eclipse.viatra.solver.language.services.ProblemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProblemParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'refers'", "'pred'", "'='", "'*'", "'true'", "'false'", "'unknown'", "'!'", "'?'", "'class'", "'.'", "'extends'", "'['", "']'", "','", "'opposite'", "'('", "')'", "':='", "';'", "':'", "'scope'", "'..'", "'::'", "'abstract'", "'contains'", "'error'", "'+'", "'+='"
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalProblemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProblemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProblemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProblem.g"; }


    	private ProblemGrammarAccess grammarAccess;

    	public void setGrammarAccess(ProblemGrammarAccess grammarAccess) {
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
    // InternalProblem.g:53:1: entryRuleProblem : ruleProblem EOF ;
    public final void entryRuleProblem() throws RecognitionException {
        try {
            // InternalProblem.g:54:1: ( ruleProblem EOF )
            // InternalProblem.g:55:1: ruleProblem EOF
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
    // InternalProblem.g:62:1: ruleProblem : ( ( rule__Problem__StatementsAssignment )* ) ;
    public final void ruleProblem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:66:2: ( ( ( rule__Problem__StatementsAssignment )* ) )
            // InternalProblem.g:67:2: ( ( rule__Problem__StatementsAssignment )* )
            {
            // InternalProblem.g:67:2: ( ( rule__Problem__StatementsAssignment )* )
            // InternalProblem.g:68:3: ( rule__Problem__StatementsAssignment )*
            {
             before(grammarAccess.getProblemAccess().getStatementsAssignment()); 
            // InternalProblem.g:69:3: ( rule__Problem__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==12||(LA1_0>=18 && LA1_0<=20)||LA1_0==32||LA1_0==35||LA1_0==37) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProblem.g:69:4: rule__Problem__StatementsAssignment
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
    // InternalProblem.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalProblem.g:79:1: ( ruleStatement EOF )
            // InternalProblem.g:80:1: ruleStatement EOF
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
    // InternalProblem.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalProblem.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalProblem.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalProblem.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalProblem.g:94:3: ( rule__Statement__Alternatives )
            // InternalProblem.g:94:4: rule__Statement__Alternatives
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


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalProblem.g:103:1: entryRuleClassDeclaration : ruleClassDeclaration EOF ;
    public final void entryRuleClassDeclaration() throws RecognitionException {
        try {
            // InternalProblem.g:104:1: ( ruleClassDeclaration EOF )
            // InternalProblem.g:105:1: ruleClassDeclaration EOF
            {
             before(grammarAccess.getClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDeclaration();

            state._fsp--;

             after(grammarAccess.getClassDeclarationRule()); 
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
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // InternalProblem.g:112:1: ruleClassDeclaration : ( ( rule__ClassDeclaration__Group__0 ) ) ;
    public final void ruleClassDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:116:2: ( ( ( rule__ClassDeclaration__Group__0 ) ) )
            // InternalProblem.g:117:2: ( ( rule__ClassDeclaration__Group__0 ) )
            {
            // InternalProblem.g:117:2: ( ( rule__ClassDeclaration__Group__0 ) )
            // InternalProblem.g:118:3: ( rule__ClassDeclaration__Group__0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup()); 
            // InternalProblem.g:119:3: ( rule__ClassDeclaration__Group__0 )
            // InternalProblem.g:119:4: rule__ClassDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleReferenceDeclaration"
    // InternalProblem.g:128:1: entryRuleReferenceDeclaration : ruleReferenceDeclaration EOF ;
    public final void entryRuleReferenceDeclaration() throws RecognitionException {
        try {
            // InternalProblem.g:129:1: ( ruleReferenceDeclaration EOF )
            // InternalProblem.g:130:1: ruleReferenceDeclaration EOF
            {
             before(grammarAccess.getReferenceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleReferenceDeclaration();

            state._fsp--;

             after(grammarAccess.getReferenceDeclarationRule()); 
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
    // $ANTLR end "entryRuleReferenceDeclaration"


    // $ANTLR start "ruleReferenceDeclaration"
    // InternalProblem.g:137:1: ruleReferenceDeclaration : ( ( rule__ReferenceDeclaration__Group__0 ) ) ;
    public final void ruleReferenceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:141:2: ( ( ( rule__ReferenceDeclaration__Group__0 ) ) )
            // InternalProblem.g:142:2: ( ( rule__ReferenceDeclaration__Group__0 ) )
            {
            // InternalProblem.g:142:2: ( ( rule__ReferenceDeclaration__Group__0 ) )
            // InternalProblem.g:143:3: ( rule__ReferenceDeclaration__Group__0 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getGroup()); 
            // InternalProblem.g:144:3: ( rule__ReferenceDeclaration__Group__0 )
            // InternalProblem.g:144:4: rule__ReferenceDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferenceDeclaration"


    // $ANTLR start "entryRulePredicateDefinition"
    // InternalProblem.g:153:1: entryRulePredicateDefinition : rulePredicateDefinition EOF ;
    public final void entryRulePredicateDefinition() throws RecognitionException {
        try {
            // InternalProblem.g:154:1: ( rulePredicateDefinition EOF )
            // InternalProblem.g:155:1: rulePredicateDefinition EOF
            {
             before(grammarAccess.getPredicateDefinitionRule()); 
            pushFollow(FOLLOW_1);
            rulePredicateDefinition();

            state._fsp--;

             after(grammarAccess.getPredicateDefinitionRule()); 
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
    // $ANTLR end "entryRulePredicateDefinition"


    // $ANTLR start "rulePredicateDefinition"
    // InternalProblem.g:162:1: rulePredicateDefinition : ( ( rule__PredicateDefinition__Group__0 ) ) ;
    public final void rulePredicateDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:166:2: ( ( ( rule__PredicateDefinition__Group__0 ) ) )
            // InternalProblem.g:167:2: ( ( rule__PredicateDefinition__Group__0 ) )
            {
            // InternalProblem.g:167:2: ( ( rule__PredicateDefinition__Group__0 ) )
            // InternalProblem.g:168:3: ( rule__PredicateDefinition__Group__0 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup()); 
            // InternalProblem.g:169:3: ( rule__PredicateDefinition__Group__0 )
            // InternalProblem.g:169:4: rule__PredicateDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicateDefinition"


    // $ANTLR start "entryRuleParameter"
    // InternalProblem.g:178:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalProblem.g:179:1: ( ruleParameter EOF )
            // InternalProblem.g:180:1: ruleParameter EOF
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
    // InternalProblem.g:187:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:191:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalProblem.g:192:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalProblem.g:192:2: ( ( rule__Parameter__Group__0 ) )
            // InternalProblem.g:193:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalProblem.g:194:3: ( rule__Parameter__Group__0 )
            // InternalProblem.g:194:4: rule__Parameter__Group__0
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


    // $ANTLR start "entryRuleConjunction"
    // InternalProblem.g:203:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // InternalProblem.g:204:1: ( ruleConjunction EOF )
            // InternalProblem.g:205:1: ruleConjunction EOF
            {
             before(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getConjunctionRule()); 
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
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // InternalProblem.g:212:1: ruleConjunction : ( ( rule__Conjunction__Group__0 ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:216:2: ( ( ( rule__Conjunction__Group__0 ) ) )
            // InternalProblem.g:217:2: ( ( rule__Conjunction__Group__0 ) )
            {
            // InternalProblem.g:217:2: ( ( rule__Conjunction__Group__0 ) )
            // InternalProblem.g:218:3: ( rule__Conjunction__Group__0 )
            {
             before(grammarAccess.getConjunctionAccess().getGroup()); 
            // InternalProblem.g:219:3: ( rule__Conjunction__Group__0 )
            // InternalProblem.g:219:4: rule__Conjunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conjunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleLiteral"
    // InternalProblem.g:228:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalProblem.g:229:1: ( ruleLiteral EOF )
            // InternalProblem.g:230:1: ruleLiteral EOF
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
    // InternalProblem.g:237:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:241:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalProblem.g:242:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalProblem.g:242:2: ( ( rule__Literal__Alternatives ) )
            // InternalProblem.g:243:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalProblem.g:244:3: ( rule__Literal__Alternatives )
            // InternalProblem.g:244:4: rule__Literal__Alternatives
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


    // $ANTLR start "entryRuleNegativeLiteral"
    // InternalProblem.g:253:1: entryRuleNegativeLiteral : ruleNegativeLiteral EOF ;
    public final void entryRuleNegativeLiteral() throws RecognitionException {
        try {
            // InternalProblem.g:254:1: ( ruleNegativeLiteral EOF )
            // InternalProblem.g:255:1: ruleNegativeLiteral EOF
            {
             before(grammarAccess.getNegativeLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNegativeLiteral();

            state._fsp--;

             after(grammarAccess.getNegativeLiteralRule()); 
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
    // $ANTLR end "entryRuleNegativeLiteral"


    // $ANTLR start "ruleNegativeLiteral"
    // InternalProblem.g:262:1: ruleNegativeLiteral : ( ( rule__NegativeLiteral__Group__0 ) ) ;
    public final void ruleNegativeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:266:2: ( ( ( rule__NegativeLiteral__Group__0 ) ) )
            // InternalProblem.g:267:2: ( ( rule__NegativeLiteral__Group__0 ) )
            {
            // InternalProblem.g:267:2: ( ( rule__NegativeLiteral__Group__0 ) )
            // InternalProblem.g:268:3: ( rule__NegativeLiteral__Group__0 )
            {
             before(grammarAccess.getNegativeLiteralAccess().getGroup()); 
            // InternalProblem.g:269:3: ( rule__NegativeLiteral__Group__0 )
            // InternalProblem.g:269:4: rule__NegativeLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NegativeLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegativeLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegativeLiteral"


    // $ANTLR start "entryRuleAtom"
    // InternalProblem.g:278:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalProblem.g:279:1: ( ruleAtom EOF )
            // InternalProblem.g:280:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalProblem.g:287:1: ruleAtom : ( ( rule__Atom__Group__0 ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:291:2: ( ( ( rule__Atom__Group__0 ) ) )
            // InternalProblem.g:292:2: ( ( rule__Atom__Group__0 ) )
            {
            // InternalProblem.g:292:2: ( ( rule__Atom__Group__0 ) )
            // InternalProblem.g:293:3: ( rule__Atom__Group__0 )
            {
             before(grammarAccess.getAtomAccess().getGroup()); 
            // InternalProblem.g:294:3: ( rule__Atom__Group__0 )
            // InternalProblem.g:294:4: rule__Atom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleAssertion"
    // InternalProblem.g:303:1: entryRuleAssertion : ruleAssertion EOF ;
    public final void entryRuleAssertion() throws RecognitionException {
        try {
            // InternalProblem.g:304:1: ( ruleAssertion EOF )
            // InternalProblem.g:305:1: ruleAssertion EOF
            {
             before(grammarAccess.getAssertionRule()); 
            pushFollow(FOLLOW_1);
            ruleAssertion();

            state._fsp--;

             after(grammarAccess.getAssertionRule()); 
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
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // InternalProblem.g:312:1: ruleAssertion : ( ( rule__Assertion__Group__0 ) ) ;
    public final void ruleAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:316:2: ( ( ( rule__Assertion__Group__0 ) ) )
            // InternalProblem.g:317:2: ( ( rule__Assertion__Group__0 ) )
            {
            // InternalProblem.g:317:2: ( ( rule__Assertion__Group__0 ) )
            // InternalProblem.g:318:3: ( rule__Assertion__Group__0 )
            {
             before(grammarAccess.getAssertionAccess().getGroup()); 
            // InternalProblem.g:319:3: ( rule__Assertion__Group__0 )
            // InternalProblem.g:319:4: rule__Assertion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleScopeDeclaration"
    // InternalProblem.g:328:1: entryRuleScopeDeclaration : ruleScopeDeclaration EOF ;
    public final void entryRuleScopeDeclaration() throws RecognitionException {
        try {
            // InternalProblem.g:329:1: ( ruleScopeDeclaration EOF )
            // InternalProblem.g:330:1: ruleScopeDeclaration EOF
            {
             before(grammarAccess.getScopeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleScopeDeclaration();

            state._fsp--;

             after(grammarAccess.getScopeDeclarationRule()); 
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
    // $ANTLR end "entryRuleScopeDeclaration"


    // $ANTLR start "ruleScopeDeclaration"
    // InternalProblem.g:337:1: ruleScopeDeclaration : ( ( rule__ScopeDeclaration__Group__0 ) ) ;
    public final void ruleScopeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:341:2: ( ( ( rule__ScopeDeclaration__Group__0 ) ) )
            // InternalProblem.g:342:2: ( ( rule__ScopeDeclaration__Group__0 ) )
            {
            // InternalProblem.g:342:2: ( ( rule__ScopeDeclaration__Group__0 ) )
            // InternalProblem.g:343:3: ( rule__ScopeDeclaration__Group__0 )
            {
             before(grammarAccess.getScopeDeclarationAccess().getGroup()); 
            // InternalProblem.g:344:3: ( rule__ScopeDeclaration__Group__0 )
            // InternalProblem.g:344:4: rule__ScopeDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScopeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScopeDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScopeDeclaration"


    // $ANTLR start "entryRuleTypeScope"
    // InternalProblem.g:353:1: entryRuleTypeScope : ruleTypeScope EOF ;
    public final void entryRuleTypeScope() throws RecognitionException {
        try {
            // InternalProblem.g:354:1: ( ruleTypeScope EOF )
            // InternalProblem.g:355:1: ruleTypeScope EOF
            {
             before(grammarAccess.getTypeScopeRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeScope();

            state._fsp--;

             after(grammarAccess.getTypeScopeRule()); 
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
    // $ANTLR end "entryRuleTypeScope"


    // $ANTLR start "ruleTypeScope"
    // InternalProblem.g:362:1: ruleTypeScope : ( ( rule__TypeScope__Group__0 ) ) ;
    public final void ruleTypeScope() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:366:2: ( ( ( rule__TypeScope__Group__0 ) ) )
            // InternalProblem.g:367:2: ( ( rule__TypeScope__Group__0 ) )
            {
            // InternalProblem.g:367:2: ( ( rule__TypeScope__Group__0 ) )
            // InternalProblem.g:368:3: ( rule__TypeScope__Group__0 )
            {
             before(grammarAccess.getTypeScopeAccess().getGroup()); 
            // InternalProblem.g:369:3: ( rule__TypeScope__Group__0 )
            // InternalProblem.g:369:4: rule__TypeScope__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeScope__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeScopeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeScope"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalProblem.g:378:1: entryRuleMultiplicity : ruleMultiplicity EOF ;
    public final void entryRuleMultiplicity() throws RecognitionException {
        try {
            // InternalProblem.g:379:1: ( ruleMultiplicity EOF )
            // InternalProblem.g:380:1: ruleMultiplicity EOF
            {
             before(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getMultiplicityRule()); 
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
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalProblem.g:387:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:391:2: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // InternalProblem.g:392:2: ( ( rule__Multiplicity__Alternatives ) )
            {
            // InternalProblem.g:392:2: ( ( rule__Multiplicity__Alternatives ) )
            // InternalProblem.g:393:3: ( rule__Multiplicity__Alternatives )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            // InternalProblem.g:394:3: ( rule__Multiplicity__Alternatives )
            // InternalProblem.g:394:4: rule__Multiplicity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleRangeMultiplicity"
    // InternalProblem.g:403:1: entryRuleRangeMultiplicity : ruleRangeMultiplicity EOF ;
    public final void entryRuleRangeMultiplicity() throws RecognitionException {
        try {
            // InternalProblem.g:404:1: ( ruleRangeMultiplicity EOF )
            // InternalProblem.g:405:1: ruleRangeMultiplicity EOF
            {
             before(grammarAccess.getRangeMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            ruleRangeMultiplicity();

            state._fsp--;

             after(grammarAccess.getRangeMultiplicityRule()); 
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
    // $ANTLR end "entryRuleRangeMultiplicity"


    // $ANTLR start "ruleRangeMultiplicity"
    // InternalProblem.g:412:1: ruleRangeMultiplicity : ( ( rule__RangeMultiplicity__Group__0 ) ) ;
    public final void ruleRangeMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:416:2: ( ( ( rule__RangeMultiplicity__Group__0 ) ) )
            // InternalProblem.g:417:2: ( ( rule__RangeMultiplicity__Group__0 ) )
            {
            // InternalProblem.g:417:2: ( ( rule__RangeMultiplicity__Group__0 ) )
            // InternalProblem.g:418:3: ( rule__RangeMultiplicity__Group__0 )
            {
             before(grammarAccess.getRangeMultiplicityAccess().getGroup()); 
            // InternalProblem.g:419:3: ( rule__RangeMultiplicity__Group__0 )
            // InternalProblem.g:419:4: rule__RangeMultiplicity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RangeMultiplicity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeMultiplicityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRangeMultiplicity"


    // $ANTLR start "entryRuleExactMultiplicity"
    // InternalProblem.g:428:1: entryRuleExactMultiplicity : ruleExactMultiplicity EOF ;
    public final void entryRuleExactMultiplicity() throws RecognitionException {
        try {
            // InternalProblem.g:429:1: ( ruleExactMultiplicity EOF )
            // InternalProblem.g:430:1: ruleExactMultiplicity EOF
            {
             before(grammarAccess.getExactMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            ruleExactMultiplicity();

            state._fsp--;

             after(grammarAccess.getExactMultiplicityRule()); 
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
    // $ANTLR end "entryRuleExactMultiplicity"


    // $ANTLR start "ruleExactMultiplicity"
    // InternalProblem.g:437:1: ruleExactMultiplicity : ( ( rule__ExactMultiplicity__ExactValueAssignment ) ) ;
    public final void ruleExactMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:441:2: ( ( ( rule__ExactMultiplicity__ExactValueAssignment ) ) )
            // InternalProblem.g:442:2: ( ( rule__ExactMultiplicity__ExactValueAssignment ) )
            {
            // InternalProblem.g:442:2: ( ( rule__ExactMultiplicity__ExactValueAssignment ) )
            // InternalProblem.g:443:3: ( rule__ExactMultiplicity__ExactValueAssignment )
            {
             before(grammarAccess.getExactMultiplicityAccess().getExactValueAssignment()); 
            // InternalProblem.g:444:3: ( rule__ExactMultiplicity__ExactValueAssignment )
            // InternalProblem.g:444:4: rule__ExactMultiplicity__ExactValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExactMultiplicity__ExactValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExactMultiplicityAccess().getExactValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExactMultiplicity"


    // $ANTLR start "entryRuleUpperBound"
    // InternalProblem.g:453:1: entryRuleUpperBound : ruleUpperBound EOF ;
    public final void entryRuleUpperBound() throws RecognitionException {
        try {
            // InternalProblem.g:454:1: ( ruleUpperBound EOF )
            // InternalProblem.g:455:1: ruleUpperBound EOF
            {
             before(grammarAccess.getUpperBoundRule()); 
            pushFollow(FOLLOW_1);
            ruleUpperBound();

            state._fsp--;

             after(grammarAccess.getUpperBoundRule()); 
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
    // $ANTLR end "entryRuleUpperBound"


    // $ANTLR start "ruleUpperBound"
    // InternalProblem.g:462:1: ruleUpperBound : ( ( rule__UpperBound__Alternatives ) ) ;
    public final void ruleUpperBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:466:2: ( ( ( rule__UpperBound__Alternatives ) ) )
            // InternalProblem.g:467:2: ( ( rule__UpperBound__Alternatives ) )
            {
            // InternalProblem.g:467:2: ( ( rule__UpperBound__Alternatives ) )
            // InternalProblem.g:468:3: ( rule__UpperBound__Alternatives )
            {
             before(grammarAccess.getUpperBoundAccess().getAlternatives()); 
            // InternalProblem.g:469:3: ( rule__UpperBound__Alternatives )
            // InternalProblem.g:469:4: rule__UpperBound__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UpperBound__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUpperBoundAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpperBound"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalProblem.g:478:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalProblem.g:479:1: ( ruleQualifiedName EOF )
            // InternalProblem.g:480:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalProblem.g:487:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:491:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalProblem.g:492:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalProblem.g:492:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalProblem.g:493:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalProblem.g:494:3: ( rule__QualifiedName__Group__0 )
            // InternalProblem.g:494:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleLogicValue"
    // InternalProblem.g:503:1: ruleLogicValue : ( ( rule__LogicValue__Alternatives ) ) ;
    public final void ruleLogicValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:507:1: ( ( ( rule__LogicValue__Alternatives ) ) )
            // InternalProblem.g:508:2: ( ( rule__LogicValue__Alternatives ) )
            {
            // InternalProblem.g:508:2: ( ( rule__LogicValue__Alternatives ) )
            // InternalProblem.g:509:3: ( rule__LogicValue__Alternatives )
            {
             before(grammarAccess.getLogicValueAccess().getAlternatives()); 
            // InternalProblem.g:510:3: ( rule__LogicValue__Alternatives )
            // InternalProblem.g:510:4: rule__LogicValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogicValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicValue"


    // $ANTLR start "ruleShortLogicValue"
    // InternalProblem.g:519:1: ruleShortLogicValue : ( ( rule__ShortLogicValue__Alternatives ) ) ;
    public final void ruleShortLogicValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:523:1: ( ( ( rule__ShortLogicValue__Alternatives ) ) )
            // InternalProblem.g:524:2: ( ( rule__ShortLogicValue__Alternatives ) )
            {
            // InternalProblem.g:524:2: ( ( rule__ShortLogicValue__Alternatives ) )
            // InternalProblem.g:525:3: ( rule__ShortLogicValue__Alternatives )
            {
             before(grammarAccess.getShortLogicValueAccess().getAlternatives()); 
            // InternalProblem.g:526:3: ( rule__ShortLogicValue__Alternatives )
            // InternalProblem.g:526:4: rule__ShortLogicValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ShortLogicValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getShortLogicValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShortLogicValue"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalProblem.g:534:1: rule__Statement__Alternatives : ( ( ruleClassDeclaration ) | ( rulePredicateDefinition ) | ( ruleAssertion ) | ( ruleScopeDeclaration ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:538:1: ( ( ruleClassDeclaration ) | ( rulePredicateDefinition ) | ( ruleAssertion ) | ( ruleScopeDeclaration ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 20:
            case 35:
                {
                alt2=1;
                }
                break;
            case 12:
            case 37:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
            case 18:
            case 19:
                {
                alt2=3;
                }
                break;
            case 32:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalProblem.g:539:2: ( ruleClassDeclaration )
                    {
                    // InternalProblem.g:539:2: ( ruleClassDeclaration )
                    // InternalProblem.g:540:3: ruleClassDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getClassDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClassDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getClassDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:545:2: ( rulePredicateDefinition )
                    {
                    // InternalProblem.g:545:2: ( rulePredicateDefinition )
                    // InternalProblem.g:546:3: rulePredicateDefinition
                    {
                     before(grammarAccess.getStatementAccess().getPredicateDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePredicateDefinition();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPredicateDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:551:2: ( ruleAssertion )
                    {
                    // InternalProblem.g:551:2: ( ruleAssertion )
                    // InternalProblem.g:552:3: ruleAssertion
                    {
                     before(grammarAccess.getStatementAccess().getAssertionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAssertion();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssertionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProblem.g:557:2: ( ruleScopeDeclaration )
                    {
                    // InternalProblem.g:557:2: ( ruleScopeDeclaration )
                    // InternalProblem.g:558:3: ruleScopeDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getScopeDeclarationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleScopeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getScopeDeclarationParserRuleCall_3()); 

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


    // $ANTLR start "rule__ClassDeclaration__Alternatives_3"
    // InternalProblem.g:567:1: rule__ClassDeclaration__Alternatives_3 : ( ( ( rule__ClassDeclaration__Group_3_0__0 ) ) | ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_3_1 ) ) );
    public final void rule__ClassDeclaration__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:571:1: ( ( ( rule__ClassDeclaration__Group_3_0__0 ) ) | ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_3_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==11||LA3_0==36) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalProblem.g:572:2: ( ( rule__ClassDeclaration__Group_3_0__0 ) )
                    {
                    // InternalProblem.g:572:2: ( ( rule__ClassDeclaration__Group_3_0__0 ) )
                    // InternalProblem.g:573:3: ( rule__ClassDeclaration__Group_3_0__0 )
                    {
                     before(grammarAccess.getClassDeclarationAccess().getGroup_3_0()); 
                    // InternalProblem.g:574:3: ( rule__ClassDeclaration__Group_3_0__0 )
                    // InternalProblem.g:574:4: rule__ClassDeclaration__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDeclaration__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassDeclarationAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:578:2: ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_3_1 ) )
                    {
                    // InternalProblem.g:578:2: ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_3_1 ) )
                    // InternalProblem.g:579:3: ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_3_1 )
                    {
                     before(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsAssignment_3_1()); 
                    // InternalProblem.g:580:3: ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_3_1 )
                    // InternalProblem.g:580:4: rule__ClassDeclaration__ReferenceDeclarationsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDeclaration__ReferenceDeclarationsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsAssignment_3_1()); 

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
    // $ANTLR end "rule__ClassDeclaration__Alternatives_3"


    // $ANTLR start "rule__ClassDeclaration__Alternatives_3_0_1"
    // InternalProblem.g:588:1: rule__ClassDeclaration__Alternatives_3_0_1 : ( ( ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_0 ) ) | ( ( rule__ClassDeclaration__Group_3_0_1_1__0 ) ) );
    public final void rule__ClassDeclaration__Alternatives_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:592:1: ( ( ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_0 ) ) | ( ( rule__ClassDeclaration__Group_3_0_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalProblem.g:593:2: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_0 ) )
                    {
                    // InternalProblem.g:593:2: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_0 ) )
                    // InternalProblem.g:594:3: ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_0 )
                    {
                     before(grammarAccess.getClassDeclarationAccess().getSuperTypesAssignment_3_0_1_0()); 
                    // InternalProblem.g:595:3: ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_0 )
                    // InternalProblem.g:595:4: rule__ClassDeclaration__SuperTypesAssignment_3_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDeclaration__SuperTypesAssignment_3_0_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassDeclarationAccess().getSuperTypesAssignment_3_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:599:2: ( ( rule__ClassDeclaration__Group_3_0_1_1__0 ) )
                    {
                    // InternalProblem.g:599:2: ( ( rule__ClassDeclaration__Group_3_0_1_1__0 ) )
                    // InternalProblem.g:600:3: ( rule__ClassDeclaration__Group_3_0_1_1__0 )
                    {
                     before(grammarAccess.getClassDeclarationAccess().getGroup_3_0_1_1()); 
                    // InternalProblem.g:601:3: ( rule__ClassDeclaration__Group_3_0_1_1__0 )
                    // InternalProblem.g:601:4: rule__ClassDeclaration__Group_3_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDeclaration__Group_3_0_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassDeclarationAccess().getGroup_3_0_1_1()); 

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
    // $ANTLR end "rule__ClassDeclaration__Alternatives_3_0_1"


    // $ANTLR start "rule__ReferenceDeclaration__Alternatives_0"
    // InternalProblem.g:609:1: rule__ReferenceDeclaration__Alternatives_0 : ( ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) ) | ( 'refers' ) );
    public final void rule__ReferenceDeclaration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:613:1: ( ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) ) | ( 'refers' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalProblem.g:614:2: ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) )
                    {
                    // InternalProblem.g:614:2: ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) )
                    // InternalProblem.g:615:3: ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 )
                    {
                     before(grammarAccess.getReferenceDeclarationAccess().getContainmentAssignment_0_0()); 
                    // InternalProblem.g:616:3: ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 )
                    // InternalProblem.g:616:4: rule__ReferenceDeclaration__ContainmentAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceDeclaration__ContainmentAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceDeclarationAccess().getContainmentAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:620:2: ( 'refers' )
                    {
                    // InternalProblem.g:620:2: ( 'refers' )
                    // InternalProblem.g:621:3: 'refers'
                    {
                     before(grammarAccess.getReferenceDeclarationAccess().getRefersKeyword_0_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getReferenceDeclarationAccess().getRefersKeyword_0_1()); 

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
    // $ANTLR end "rule__ReferenceDeclaration__Alternatives_0"


    // $ANTLR start "rule__PredicateDefinition__Alternatives_0"
    // InternalProblem.g:630:1: rule__PredicateDefinition__Alternatives_0 : ( ( ( rule__PredicateDefinition__Group_0_0__0 ) ) | ( 'pred' ) );
    public final void rule__PredicateDefinition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:634:1: ( ( ( rule__PredicateDefinition__Group_0_0__0 ) ) | ( 'pred' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==37) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalProblem.g:635:2: ( ( rule__PredicateDefinition__Group_0_0__0 ) )
                    {
                    // InternalProblem.g:635:2: ( ( rule__PredicateDefinition__Group_0_0__0 ) )
                    // InternalProblem.g:636:3: ( rule__PredicateDefinition__Group_0_0__0 )
                    {
                     before(grammarAccess.getPredicateDefinitionAccess().getGroup_0_0()); 
                    // InternalProblem.g:637:3: ( rule__PredicateDefinition__Group_0_0__0 )
                    // InternalProblem.g:637:4: rule__PredicateDefinition__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PredicateDefinition__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPredicateDefinitionAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:641:2: ( 'pred' )
                    {
                    // InternalProblem.g:641:2: ( 'pred' )
                    // InternalProblem.g:642:3: 'pred'
                    {
                     before(grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_1()); 

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
    // $ANTLR end "rule__PredicateDefinition__Alternatives_0"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalProblem.g:651:1: rule__Literal__Alternatives : ( ( ruleAtom ) | ( ruleNegativeLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:655:1: ( ( ruleAtom ) | ( ruleNegativeLiteral ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalProblem.g:656:2: ( ruleAtom )
                    {
                    // InternalProblem.g:656:2: ( ruleAtom )
                    // InternalProblem.g:657:3: ruleAtom
                    {
                     before(grammarAccess.getLiteralAccess().getAtomParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAtom();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getAtomParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:662:2: ( ruleNegativeLiteral )
                    {
                    // InternalProblem.g:662:2: ( ruleNegativeLiteral )
                    // InternalProblem.g:663:3: ruleNegativeLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getNegativeLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNegativeLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNegativeLiteralParserRuleCall_1()); 

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


    // $ANTLR start "rule__Assertion__Alternatives_0"
    // InternalProblem.g:672:1: rule__Assertion__Alternatives_0 : ( ( ( rule__Assertion__Group_0_0__0 ) ) | ( ( rule__Assertion__Group_0_1__0 ) ) );
    public final void rule__Assertion__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:676:1: ( ( ( rule__Assertion__Group_0_0__0 ) ) | ( ( rule__Assertion__Group_0_1__0 ) ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalProblem.g:677:2: ( ( rule__Assertion__Group_0_0__0 ) )
                    {
                    // InternalProblem.g:677:2: ( ( rule__Assertion__Group_0_0__0 ) )
                    // InternalProblem.g:678:3: ( rule__Assertion__Group_0_0__0 )
                    {
                     before(grammarAccess.getAssertionAccess().getGroup_0_0()); 
                    // InternalProblem.g:679:3: ( rule__Assertion__Group_0_0__0 )
                    // InternalProblem.g:679:4: rule__Assertion__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assertion__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssertionAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:683:2: ( ( rule__Assertion__Group_0_1__0 ) )
                    {
                    // InternalProblem.g:683:2: ( ( rule__Assertion__Group_0_1__0 ) )
                    // InternalProblem.g:684:3: ( rule__Assertion__Group_0_1__0 )
                    {
                     before(grammarAccess.getAssertionAccess().getGroup_0_1()); 
                    // InternalProblem.g:685:3: ( rule__Assertion__Group_0_1__0 )
                    // InternalProblem.g:685:4: rule__Assertion__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assertion__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssertionAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__Assertion__Alternatives_0"


    // $ANTLR start "rule__TypeScope__Alternatives_1"
    // InternalProblem.g:693:1: rule__TypeScope__Alternatives_1 : ( ( ( rule__TypeScope__IncrementAssignment_1_0 ) ) | ( '=' ) );
    public final void rule__TypeScope__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:697:1: ( ( ( rule__TypeScope__IncrementAssignment_1_0 ) ) | ( '=' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
                alt9=1;
            }
            else if ( (LA9_0==13) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalProblem.g:698:2: ( ( rule__TypeScope__IncrementAssignment_1_0 ) )
                    {
                    // InternalProblem.g:698:2: ( ( rule__TypeScope__IncrementAssignment_1_0 ) )
                    // InternalProblem.g:699:3: ( rule__TypeScope__IncrementAssignment_1_0 )
                    {
                     before(grammarAccess.getTypeScopeAccess().getIncrementAssignment_1_0()); 
                    // InternalProblem.g:700:3: ( rule__TypeScope__IncrementAssignment_1_0 )
                    // InternalProblem.g:700:4: rule__TypeScope__IncrementAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeScope__IncrementAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeScopeAccess().getIncrementAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:704:2: ( '=' )
                    {
                    // InternalProblem.g:704:2: ( '=' )
                    // InternalProblem.g:705:3: '='
                    {
                     before(grammarAccess.getTypeScopeAccess().getEqualsSignKeyword_1_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTypeScopeAccess().getEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__TypeScope__Alternatives_1"


    // $ANTLR start "rule__Multiplicity__Alternatives"
    // InternalProblem.g:714:1: rule__Multiplicity__Alternatives : ( ( ruleRangeMultiplicity ) | ( ruleExactMultiplicity ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:718:1: ( ( ruleRangeMultiplicity ) | ( ruleExactMultiplicity ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==33) ) {
                    alt10=1;
                }
                else if ( (LA10_1==EOF||LA10_1==21||(LA10_1>=24 && LA10_1<=25)) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalProblem.g:719:2: ( ruleRangeMultiplicity )
                    {
                    // InternalProblem.g:719:2: ( ruleRangeMultiplicity )
                    // InternalProblem.g:720:3: ruleRangeMultiplicity
                    {
                     before(grammarAccess.getMultiplicityAccess().getRangeMultiplicityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRangeMultiplicity();

                    state._fsp--;

                     after(grammarAccess.getMultiplicityAccess().getRangeMultiplicityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:725:2: ( ruleExactMultiplicity )
                    {
                    // InternalProblem.g:725:2: ( ruleExactMultiplicity )
                    // InternalProblem.g:726:3: ruleExactMultiplicity
                    {
                     before(grammarAccess.getMultiplicityAccess().getExactMultiplicityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExactMultiplicity();

                    state._fsp--;

                     after(grammarAccess.getMultiplicityAccess().getExactMultiplicityParserRuleCall_1()); 

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
    // $ANTLR end "rule__Multiplicity__Alternatives"


    // $ANTLR start "rule__UpperBound__Alternatives"
    // InternalProblem.g:735:1: rule__UpperBound__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__UpperBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:739:1: ( ( RULE_INT ) | ( '*' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            else if ( (LA11_0==14) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalProblem.g:740:2: ( RULE_INT )
                    {
                    // InternalProblem.g:740:2: ( RULE_INT )
                    // InternalProblem.g:741:3: RULE_INT
                    {
                     before(grammarAccess.getUpperBoundAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getUpperBoundAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:746:2: ( '*' )
                    {
                    // InternalProblem.g:746:2: ( '*' )
                    // InternalProblem.g:747:3: '*'
                    {
                     before(grammarAccess.getUpperBoundAccess().getAsteriskKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getUpperBoundAccess().getAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__UpperBound__Alternatives"


    // $ANTLR start "rule__LogicValue__Alternatives"
    // InternalProblem.g:756:1: rule__LogicValue__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) | ( ( 'unknown' ) ) );
    public final void rule__LogicValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:760:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) | ( ( 'unknown' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt12=1;
                }
                break;
            case 16:
                {
                alt12=2;
                }
                break;
            case 17:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalProblem.g:761:2: ( ( 'true' ) )
                    {
                    // InternalProblem.g:761:2: ( ( 'true' ) )
                    // InternalProblem.g:762:3: ( 'true' )
                    {
                     before(grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:763:3: ( 'true' )
                    // InternalProblem.g:763:4: 'true'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:767:2: ( ( 'false' ) )
                    {
                    // InternalProblem.g:767:2: ( ( 'false' ) )
                    // InternalProblem.g:768:3: ( 'false' )
                    {
                     before(grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:769:3: ( 'false' )
                    // InternalProblem.g:769:4: 'false'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:773:2: ( ( 'unknown' ) )
                    {
                    // InternalProblem.g:773:2: ( ( 'unknown' ) )
                    // InternalProblem.g:774:3: ( 'unknown' )
                    {
                     before(grammarAccess.getLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_2()); 
                    // InternalProblem.g:775:3: ( 'unknown' )
                    // InternalProblem.g:775:4: 'unknown'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__LogicValue__Alternatives"


    // $ANTLR start "rule__ShortLogicValue__Alternatives"
    // InternalProblem.g:783:1: rule__ShortLogicValue__Alternatives : ( ( ( '!' ) ) | ( ( '?' ) ) );
    public final void rule__ShortLogicValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:787:1: ( ( ( '!' ) ) | ( ( '?' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            else if ( (LA13_0==19) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalProblem.g:788:2: ( ( '!' ) )
                    {
                    // InternalProblem.g:788:2: ( ( '!' ) )
                    // InternalProblem.g:789:3: ( '!' )
                    {
                     before(grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:790:3: ( '!' )
                    // InternalProblem.g:790:4: '!'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:794:2: ( ( '?' ) )
                    {
                    // InternalProblem.g:794:2: ( ( '?' ) )
                    // InternalProblem.g:795:3: ( '?' )
                    {
                     before(grammarAccess.getShortLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:796:3: ( '?' )
                    // InternalProblem.g:796:4: '?'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getShortLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ShortLogicValue__Alternatives"


    // $ANTLR start "rule__ClassDeclaration__Group__0"
    // InternalProblem.g:804:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:808:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalProblem.g:809:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ClassDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__0"


    // $ANTLR start "rule__ClassDeclaration__Group__0__Impl"
    // InternalProblem.g:816:1: rule__ClassDeclaration__Group__0__Impl : ( ( rule__ClassDeclaration__AbstractAssignment_0 )? ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:820:1: ( ( ( rule__ClassDeclaration__AbstractAssignment_0 )? ) )
            // InternalProblem.g:821:1: ( ( rule__ClassDeclaration__AbstractAssignment_0 )? )
            {
            // InternalProblem.g:821:1: ( ( rule__ClassDeclaration__AbstractAssignment_0 )? )
            // InternalProblem.g:822:2: ( rule__ClassDeclaration__AbstractAssignment_0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getAbstractAssignment_0()); 
            // InternalProblem.g:823:2: ( rule__ClassDeclaration__AbstractAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalProblem.g:823:3: rule__ClassDeclaration__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDeclaration__AbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassDeclarationAccess().getAbstractAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__1"
    // InternalProblem.g:831:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:835:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalProblem.g:836:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ClassDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__1"


    // $ANTLR start "rule__ClassDeclaration__Group__1__Impl"
    // InternalProblem.g:843:1: rule__ClassDeclaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:847:1: ( ( 'class' ) )
            // InternalProblem.g:848:1: ( 'class' )
            {
            // InternalProblem.g:848:1: ( 'class' )
            // InternalProblem.g:849:2: 'class'
            {
             before(grammarAccess.getClassDeclarationAccess().getClassKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__2"
    // InternalProblem.g:858:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:862:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalProblem.g:863:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ClassDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__2"


    // $ANTLR start "rule__ClassDeclaration__Group__2__Impl"
    // InternalProblem.g:870:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:874:1: ( ( ( rule__ClassDeclaration__NameAssignment_2 ) ) )
            // InternalProblem.g:875:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            {
            // InternalProblem.g:875:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            // InternalProblem.g:876:2: ( rule__ClassDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 
            // InternalProblem.g:877:2: ( rule__ClassDeclaration__NameAssignment_2 )
            // InternalProblem.g:877:3: rule__ClassDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__3"
    // InternalProblem.g:885:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:889:1: ( rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 )
            // InternalProblem.g:890:2: rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ClassDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__3"


    // $ANTLR start "rule__ClassDeclaration__Group__3__Impl"
    // InternalProblem.g:897:1: rule__ClassDeclaration__Group__3__Impl : ( ( rule__ClassDeclaration__Alternatives_3 )? ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:901:1: ( ( ( rule__ClassDeclaration__Alternatives_3 )? ) )
            // InternalProblem.g:902:1: ( ( rule__ClassDeclaration__Alternatives_3 )? )
            {
            // InternalProblem.g:902:1: ( ( rule__ClassDeclaration__Alternatives_3 )? )
            // InternalProblem.g:903:2: ( rule__ClassDeclaration__Alternatives_3 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getAlternatives_3()); 
            // InternalProblem.g:904:2: ( rule__ClassDeclaration__Alternatives_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==11||LA15_0==22||LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalProblem.g:904:3: rule__ClassDeclaration__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDeclaration__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassDeclarationAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__4"
    // InternalProblem.g:912:1: rule__ClassDeclaration__Group__4 : rule__ClassDeclaration__Group__4__Impl rule__ClassDeclaration__Group__5 ;
    public final void rule__ClassDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:916:1: ( rule__ClassDeclaration__Group__4__Impl rule__ClassDeclaration__Group__5 )
            // InternalProblem.g:917:2: rule__ClassDeclaration__Group__4__Impl rule__ClassDeclaration__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ClassDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__4"


    // $ANTLR start "rule__ClassDeclaration__Group__4__Impl"
    // InternalProblem.g:924:1: rule__ClassDeclaration__Group__4__Impl : ( ( rule__ClassDeclaration__Group_4__0 )* ) ;
    public final void rule__ClassDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:928:1: ( ( ( rule__ClassDeclaration__Group_4__0 )* ) )
            // InternalProblem.g:929:1: ( ( rule__ClassDeclaration__Group_4__0 )* )
            {
            // InternalProblem.g:929:1: ( ( rule__ClassDeclaration__Group_4__0 )* )
            // InternalProblem.g:930:2: ( rule__ClassDeclaration__Group_4__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_4()); 
            // InternalProblem.g:931:2: ( rule__ClassDeclaration__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalProblem.g:931:3: rule__ClassDeclaration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ClassDeclaration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getClassDeclarationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__5"
    // InternalProblem.g:939:1: rule__ClassDeclaration__Group__5 : rule__ClassDeclaration__Group__5__Impl ;
    public final void rule__ClassDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:943:1: ( rule__ClassDeclaration__Group__5__Impl )
            // InternalProblem.g:944:2: rule__ClassDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__5"


    // $ANTLR start "rule__ClassDeclaration__Group__5__Impl"
    // InternalProblem.g:950:1: rule__ClassDeclaration__Group__5__Impl : ( '.' ) ;
    public final void rule__ClassDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:954:1: ( ( '.' ) )
            // InternalProblem.g:955:1: ( '.' )
            {
            // InternalProblem.g:955:1: ( '.' )
            // InternalProblem.g:956:2: '.'
            {
             before(grammarAccess.getClassDeclarationAccess().getFullStopKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0__0"
    // InternalProblem.g:966:1: rule__ClassDeclaration__Group_3_0__0 : rule__ClassDeclaration__Group_3_0__0__Impl rule__ClassDeclaration__Group_3_0__1 ;
    public final void rule__ClassDeclaration__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:970:1: ( rule__ClassDeclaration__Group_3_0__0__Impl rule__ClassDeclaration__Group_3_0__1 )
            // InternalProblem.g:971:2: rule__ClassDeclaration__Group_3_0__0__Impl rule__ClassDeclaration__Group_3_0__1
            {
            pushFollow(FOLLOW_8);
            rule__ClassDeclaration__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0__0"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0__0__Impl"
    // InternalProblem.g:978:1: rule__ClassDeclaration__Group_3_0__0__Impl : ( 'extends' ) ;
    public final void rule__ClassDeclaration__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:982:1: ( ( 'extends' ) )
            // InternalProblem.g:983:1: ( 'extends' )
            {
            // InternalProblem.g:983:1: ( 'extends' )
            // InternalProblem.g:984:2: 'extends'
            {
             before(grammarAccess.getClassDeclarationAccess().getExtendsKeyword_3_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getExtendsKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0__1"
    // InternalProblem.g:993:1: rule__ClassDeclaration__Group_3_0__1 : rule__ClassDeclaration__Group_3_0__1__Impl ;
    public final void rule__ClassDeclaration__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:997:1: ( rule__ClassDeclaration__Group_3_0__1__Impl )
            // InternalProblem.g:998:2: rule__ClassDeclaration__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0__1"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0__1__Impl"
    // InternalProblem.g:1004:1: rule__ClassDeclaration__Group_3_0__1__Impl : ( ( rule__ClassDeclaration__Alternatives_3_0_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1008:1: ( ( ( rule__ClassDeclaration__Alternatives_3_0_1 ) ) )
            // InternalProblem.g:1009:1: ( ( rule__ClassDeclaration__Alternatives_3_0_1 ) )
            {
            // InternalProblem.g:1009:1: ( ( rule__ClassDeclaration__Alternatives_3_0_1 ) )
            // InternalProblem.g:1010:2: ( rule__ClassDeclaration__Alternatives_3_0_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getAlternatives_3_0_1()); 
            // InternalProblem.g:1011:2: ( rule__ClassDeclaration__Alternatives_3_0_1 )
            // InternalProblem.g:1011:3: rule__ClassDeclaration__Alternatives_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Alternatives_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getAlternatives_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0_1_1__0"
    // InternalProblem.g:1020:1: rule__ClassDeclaration__Group_3_0_1_1__0 : rule__ClassDeclaration__Group_3_0_1_1__0__Impl rule__ClassDeclaration__Group_3_0_1_1__1 ;
    public final void rule__ClassDeclaration__Group_3_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1024:1: ( rule__ClassDeclaration__Group_3_0_1_1__0__Impl rule__ClassDeclaration__Group_3_0_1_1__1 )
            // InternalProblem.g:1025:2: rule__ClassDeclaration__Group_3_0_1_1__0__Impl rule__ClassDeclaration__Group_3_0_1_1__1
            {
            pushFollow(FOLLOW_9);
            rule__ClassDeclaration__Group_3_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0_1_1__0"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0_1_1__0__Impl"
    // InternalProblem.g:1032:1: rule__ClassDeclaration__Group_3_0_1_1__0__Impl : ( '[' ) ;
    public final void rule__ClassDeclaration__Group_3_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1036:1: ( ( '[' ) )
            // InternalProblem.g:1037:1: ( '[' )
            {
            // InternalProblem.g:1037:1: ( '[' )
            // InternalProblem.g:1038:2: '['
            {
             before(grammarAccess.getClassDeclarationAccess().getLeftSquareBracketKeyword_3_0_1_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getLeftSquareBracketKeyword_3_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0_1_1__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0_1_1__1"
    // InternalProblem.g:1047:1: rule__ClassDeclaration__Group_3_0_1_1__1 : rule__ClassDeclaration__Group_3_0_1_1__1__Impl rule__ClassDeclaration__Group_3_0_1_1__2 ;
    public final void rule__ClassDeclaration__Group_3_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1051:1: ( rule__ClassDeclaration__Group_3_0_1_1__1__Impl rule__ClassDeclaration__Group_3_0_1_1__2 )
            // InternalProblem.g:1052:2: rule__ClassDeclaration__Group_3_0_1_1__1__Impl rule__ClassDeclaration__Group_3_0_1_1__2
            {
            pushFollow(FOLLOW_9);
            rule__ClassDeclaration__Group_3_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3_0_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0_1_1__1"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0_1_1__1__Impl"
    // InternalProblem.g:1059:1: rule__ClassDeclaration__Group_3_0_1_1__1__Impl : ( ( rule__ClassDeclaration__Group_3_0_1_1_1__0 )? ) ;
    public final void rule__ClassDeclaration__Group_3_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1063:1: ( ( ( rule__ClassDeclaration__Group_3_0_1_1_1__0 )? ) )
            // InternalProblem.g:1064:1: ( ( rule__ClassDeclaration__Group_3_0_1_1_1__0 )? )
            {
            // InternalProblem.g:1064:1: ( ( rule__ClassDeclaration__Group_3_0_1_1_1__0 )? )
            // InternalProblem.g:1065:2: ( rule__ClassDeclaration__Group_3_0_1_1_1__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3_0_1_1_1()); 
            // InternalProblem.g:1066:2: ( rule__ClassDeclaration__Group_3_0_1_1_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalProblem.g:1066:3: rule__ClassDeclaration__Group_3_0_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDeclaration__Group_3_0_1_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassDeclarationAccess().getGroup_3_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0_1_1__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0_1_1__2"
    // InternalProblem.g:1074:1: rule__ClassDeclaration__Group_3_0_1_1__2 : rule__ClassDeclaration__Group_3_0_1_1__2__Impl ;
    public final void rule__ClassDeclaration__Group_3_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1078:1: ( rule__ClassDeclaration__Group_3_0_1_1__2__Impl )
            // InternalProblem.g:1079:2: rule__ClassDeclaration__Group_3_0_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3_0_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0_1_1__2"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0_1_1__2__Impl"
    // InternalProblem.g:1085:1: rule__ClassDeclaration__Group_3_0_1_1__2__Impl : ( ']' ) ;
    public final void rule__ClassDeclaration__Group_3_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1089:1: ( ( ']' ) )
            // InternalProblem.g:1090:1: ( ']' )
            {
            // InternalProblem.g:1090:1: ( ']' )
            // InternalProblem.g:1091:2: ']'
            {
             before(grammarAccess.getClassDeclarationAccess().getRightSquareBracketKeyword_3_0_1_1_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getRightSquareBracketKeyword_3_0_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0_1_1__2__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0_1_1_1__0"
    // InternalProblem.g:1101:1: rule__ClassDeclaration__Group_3_0_1_1_1__0 : rule__ClassDeclaration__Group_3_0_1_1_1__0__Impl rule__ClassDeclaration__Group_3_0_1_1_1__1 ;
    public final void rule__ClassDeclaration__Group_3_0_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1105:1: ( rule__ClassDeclaration__Group_3_0_1_1_1__0__Impl rule__ClassDeclaration__Group_3_0_1_1_1__1 )
            // InternalProblem.g:1106:2: rule__ClassDeclaration__Group_3_0_1_1_1__0__Impl rule__ClassDeclaration__Group_3_0_1_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ClassDeclaration__Group_3_0_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3_0_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0_1_1_1__0"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0_1_1_1__0__Impl"
    // InternalProblem.g:1113:1: rule__ClassDeclaration__Group_3_0_1_1_1__0__Impl : ( ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_0 ) ) ;
    public final void rule__ClassDeclaration__Group_3_0_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1117:1: ( ( ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_0 ) ) )
            // InternalProblem.g:1118:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_0 ) )
            {
            // InternalProblem.g:1118:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_0 ) )
            // InternalProblem.g:1119:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesAssignment_3_0_1_1_1_0()); 
            // InternalProblem.g:1120:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_0 )
            // InternalProblem.g:1120:3: rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getSuperTypesAssignment_3_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0_1_1_1__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0_1_1_1__1"
    // InternalProblem.g:1128:1: rule__ClassDeclaration__Group_3_0_1_1_1__1 : rule__ClassDeclaration__Group_3_0_1_1_1__1__Impl ;
    public final void rule__ClassDeclaration__Group_3_0_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1132:1: ( rule__ClassDeclaration__Group_3_0_1_1_1__1__Impl )
            // InternalProblem.g:1133:2: rule__ClassDeclaration__Group_3_0_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3_0_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0_1_1_1__1"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0_1_1_1__1__Impl"
    // InternalProblem.g:1139:1: rule__ClassDeclaration__Group_3_0_1_1_1__1__Impl : ( ( rule__ClassDeclaration__Group_3_0_1_1_1_1__0 )* ) ;
    public final void rule__ClassDeclaration__Group_3_0_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1143:1: ( ( ( rule__ClassDeclaration__Group_3_0_1_1_1_1__0 )* ) )
            // InternalProblem.g:1144:1: ( ( rule__ClassDeclaration__Group_3_0_1_1_1_1__0 )* )
            {
            // InternalProblem.g:1144:1: ( ( rule__ClassDeclaration__Group_3_0_1_1_1_1__0 )* )
            // InternalProblem.g:1145:2: ( rule__ClassDeclaration__Group_3_0_1_1_1_1__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3_0_1_1_1_1()); 
            // InternalProblem.g:1146:2: ( rule__ClassDeclaration__Group_3_0_1_1_1_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalProblem.g:1146:3: rule__ClassDeclaration__Group_3_0_1_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ClassDeclaration__Group_3_0_1_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getClassDeclarationAccess().getGroup_3_0_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0_1_1_1__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0_1_1_1_1__0"
    // InternalProblem.g:1155:1: rule__ClassDeclaration__Group_3_0_1_1_1_1__0 : rule__ClassDeclaration__Group_3_0_1_1_1_1__0__Impl rule__ClassDeclaration__Group_3_0_1_1_1_1__1 ;
    public final void rule__ClassDeclaration__Group_3_0_1_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1159:1: ( rule__ClassDeclaration__Group_3_0_1_1_1_1__0__Impl rule__ClassDeclaration__Group_3_0_1_1_1_1__1 )
            // InternalProblem.g:1160:2: rule__ClassDeclaration__Group_3_0_1_1_1_1__0__Impl rule__ClassDeclaration__Group_3_0_1_1_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ClassDeclaration__Group_3_0_1_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3_0_1_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0_1_1_1_1__0"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0_1_1_1_1__0__Impl"
    // InternalProblem.g:1167:1: rule__ClassDeclaration__Group_3_0_1_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__ClassDeclaration__Group_3_0_1_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1171:1: ( ( ',' ) )
            // InternalProblem.g:1172:1: ( ',' )
            {
            // InternalProblem.g:1172:1: ( ',' )
            // InternalProblem.g:1173:2: ','
            {
             before(grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_0_1_1_1_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_0_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0_1_1_1_1__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0_1_1_1_1__1"
    // InternalProblem.g:1182:1: rule__ClassDeclaration__Group_3_0_1_1_1_1__1 : rule__ClassDeclaration__Group_3_0_1_1_1_1__1__Impl ;
    public final void rule__ClassDeclaration__Group_3_0_1_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1186:1: ( rule__ClassDeclaration__Group_3_0_1_1_1_1__1__Impl )
            // InternalProblem.g:1187:2: rule__ClassDeclaration__Group_3_0_1_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3_0_1_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0_1_1_1_1__1"


    // $ANTLR start "rule__ClassDeclaration__Group_3_0_1_1_1_1__1__Impl"
    // InternalProblem.g:1193:1: rule__ClassDeclaration__Group_3_0_1_1_1_1__1__Impl : ( ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_1_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3_0_1_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1197:1: ( ( ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_1_1 ) ) )
            // InternalProblem.g:1198:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_1_1 ) )
            {
            // InternalProblem.g:1198:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_1_1 ) )
            // InternalProblem.g:1199:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_1_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesAssignment_3_0_1_1_1_1_1()); 
            // InternalProblem.g:1200:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_1_1 )
            // InternalProblem.g:1200:3: rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getSuperTypesAssignment_3_0_1_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_0_1_1_1_1__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_4__0"
    // InternalProblem.g:1209:1: rule__ClassDeclaration__Group_4__0 : rule__ClassDeclaration__Group_4__0__Impl rule__ClassDeclaration__Group_4__1 ;
    public final void rule__ClassDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1213:1: ( rule__ClassDeclaration__Group_4__0__Impl rule__ClassDeclaration__Group_4__1 )
            // InternalProblem.g:1214:2: rule__ClassDeclaration__Group_4__0__Impl rule__ClassDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__ClassDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_4__0"


    // $ANTLR start "rule__ClassDeclaration__Group_4__0__Impl"
    // InternalProblem.g:1221:1: rule__ClassDeclaration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ClassDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1225:1: ( ( ',' ) )
            // InternalProblem.g:1226:1: ( ',' )
            {
            // InternalProblem.g:1226:1: ( ',' )
            // InternalProblem.g:1227:2: ','
            {
             before(grammarAccess.getClassDeclarationAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_4__1"
    // InternalProblem.g:1236:1: rule__ClassDeclaration__Group_4__1 : rule__ClassDeclaration__Group_4__1__Impl ;
    public final void rule__ClassDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1240:1: ( rule__ClassDeclaration__Group_4__1__Impl )
            // InternalProblem.g:1241:2: rule__ClassDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_4__1"


    // $ANTLR start "rule__ClassDeclaration__Group_4__1__Impl"
    // InternalProblem.g:1247:1: rule__ClassDeclaration__Group_4__1__Impl : ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_1 ) ) ;
    public final void rule__ClassDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1251:1: ( ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_1 ) ) )
            // InternalProblem.g:1252:1: ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_1 ) )
            {
            // InternalProblem.g:1252:1: ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_1 ) )
            // InternalProblem.g:1253:2: ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsAssignment_4_1()); 
            // InternalProblem.g:1254:2: ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_1 )
            // InternalProblem.g:1254:3: rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group__0"
    // InternalProblem.g:1263:1: rule__ReferenceDeclaration__Group__0 : rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1 ;
    public final void rule__ReferenceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1267:1: ( rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1 )
            // InternalProblem.g:1268:2: rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ReferenceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__0"


    // $ANTLR start "rule__ReferenceDeclaration__Group__0__Impl"
    // InternalProblem.g:1275:1: rule__ReferenceDeclaration__Group__0__Impl : ( ( rule__ReferenceDeclaration__Alternatives_0 ) ) ;
    public final void rule__ReferenceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1279:1: ( ( ( rule__ReferenceDeclaration__Alternatives_0 ) ) )
            // InternalProblem.g:1280:1: ( ( rule__ReferenceDeclaration__Alternatives_0 ) )
            {
            // InternalProblem.g:1280:1: ( ( rule__ReferenceDeclaration__Alternatives_0 ) )
            // InternalProblem.g:1281:2: ( rule__ReferenceDeclaration__Alternatives_0 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getAlternatives_0()); 
            // InternalProblem.g:1282:2: ( rule__ReferenceDeclaration__Alternatives_0 )
            // InternalProblem.g:1282:3: rule__ReferenceDeclaration__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceDeclarationAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group__1"
    // InternalProblem.g:1290:1: rule__ReferenceDeclaration__Group__1 : rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2 ;
    public final void rule__ReferenceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1294:1: ( rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2 )
            // InternalProblem.g:1295:2: rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ReferenceDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__1"


    // $ANTLR start "rule__ReferenceDeclaration__Group__1__Impl"
    // InternalProblem.g:1302:1: rule__ReferenceDeclaration__Group__1__Impl : ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) ) ;
    public final void rule__ReferenceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1306:1: ( ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) ) )
            // InternalProblem.g:1307:1: ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) )
            {
            // InternalProblem.g:1307:1: ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) )
            // InternalProblem.g:1308:2: ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeAssignment_1()); 
            // InternalProblem.g:1309:2: ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 )
            // InternalProblem.g:1309:3: rule__ReferenceDeclaration__ReferenceTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__ReferenceTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group__2"
    // InternalProblem.g:1317:1: rule__ReferenceDeclaration__Group__2 : rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3 ;
    public final void rule__ReferenceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1321:1: ( rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3 )
            // InternalProblem.g:1322:2: rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ReferenceDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__2"


    // $ANTLR start "rule__ReferenceDeclaration__Group__2__Impl"
    // InternalProblem.g:1329:1: rule__ReferenceDeclaration__Group__2__Impl : ( '[' ) ;
    public final void rule__ReferenceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1333:1: ( ( '[' ) )
            // InternalProblem.g:1334:1: ( '[' )
            {
            // InternalProblem.g:1334:1: ( '[' )
            // InternalProblem.g:1335:2: '['
            {
             before(grammarAccess.getReferenceDeclarationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getReferenceDeclarationAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group__3"
    // InternalProblem.g:1344:1: rule__ReferenceDeclaration__Group__3 : rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4 ;
    public final void rule__ReferenceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1348:1: ( rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4 )
            // InternalProblem.g:1349:2: rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ReferenceDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__3"


    // $ANTLR start "rule__ReferenceDeclaration__Group__3__Impl"
    // InternalProblem.g:1356:1: rule__ReferenceDeclaration__Group__3__Impl : ( ( rule__ReferenceDeclaration__MultiplicityAssignment_3 ) ) ;
    public final void rule__ReferenceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1360:1: ( ( ( rule__ReferenceDeclaration__MultiplicityAssignment_3 ) ) )
            // InternalProblem.g:1361:1: ( ( rule__ReferenceDeclaration__MultiplicityAssignment_3 ) )
            {
            // InternalProblem.g:1361:1: ( ( rule__ReferenceDeclaration__MultiplicityAssignment_3 ) )
            // InternalProblem.g:1362:2: ( rule__ReferenceDeclaration__MultiplicityAssignment_3 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getMultiplicityAssignment_3()); 
            // InternalProblem.g:1363:2: ( rule__ReferenceDeclaration__MultiplicityAssignment_3 )
            // InternalProblem.g:1363:3: rule__ReferenceDeclaration__MultiplicityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__MultiplicityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceDeclarationAccess().getMultiplicityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group__4"
    // InternalProblem.g:1371:1: rule__ReferenceDeclaration__Group__4 : rule__ReferenceDeclaration__Group__4__Impl rule__ReferenceDeclaration__Group__5 ;
    public final void rule__ReferenceDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1375:1: ( rule__ReferenceDeclaration__Group__4__Impl rule__ReferenceDeclaration__Group__5 )
            // InternalProblem.g:1376:2: rule__ReferenceDeclaration__Group__4__Impl rule__ReferenceDeclaration__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__ReferenceDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__4"


    // $ANTLR start "rule__ReferenceDeclaration__Group__4__Impl"
    // InternalProblem.g:1383:1: rule__ReferenceDeclaration__Group__4__Impl : ( ']' ) ;
    public final void rule__ReferenceDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1387:1: ( ( ']' ) )
            // InternalProblem.g:1388:1: ( ']' )
            {
            // InternalProblem.g:1388:1: ( ']' )
            // InternalProblem.g:1389:2: ']'
            {
             before(grammarAccess.getReferenceDeclarationAccess().getRightSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getReferenceDeclarationAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group__5"
    // InternalProblem.g:1398:1: rule__ReferenceDeclaration__Group__5 : rule__ReferenceDeclaration__Group__5__Impl rule__ReferenceDeclaration__Group__6 ;
    public final void rule__ReferenceDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1402:1: ( rule__ReferenceDeclaration__Group__5__Impl rule__ReferenceDeclaration__Group__6 )
            // InternalProblem.g:1403:2: rule__ReferenceDeclaration__Group__5__Impl rule__ReferenceDeclaration__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__ReferenceDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__5"


    // $ANTLR start "rule__ReferenceDeclaration__Group__5__Impl"
    // InternalProblem.g:1410:1: rule__ReferenceDeclaration__Group__5__Impl : ( ( rule__ReferenceDeclaration__NameAssignment_5 ) ) ;
    public final void rule__ReferenceDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1414:1: ( ( ( rule__ReferenceDeclaration__NameAssignment_5 ) ) )
            // InternalProblem.g:1415:1: ( ( rule__ReferenceDeclaration__NameAssignment_5 ) )
            {
            // InternalProblem.g:1415:1: ( ( rule__ReferenceDeclaration__NameAssignment_5 ) )
            // InternalProblem.g:1416:2: ( rule__ReferenceDeclaration__NameAssignment_5 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getNameAssignment_5()); 
            // InternalProblem.g:1417:2: ( rule__ReferenceDeclaration__NameAssignment_5 )
            // InternalProblem.g:1417:3: rule__ReferenceDeclaration__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getReferenceDeclarationAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group__6"
    // InternalProblem.g:1425:1: rule__ReferenceDeclaration__Group__6 : rule__ReferenceDeclaration__Group__6__Impl ;
    public final void rule__ReferenceDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1429:1: ( rule__ReferenceDeclaration__Group__6__Impl )
            // InternalProblem.g:1430:2: rule__ReferenceDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__6"


    // $ANTLR start "rule__ReferenceDeclaration__Group__6__Impl"
    // InternalProblem.g:1436:1: rule__ReferenceDeclaration__Group__6__Impl : ( ( rule__ReferenceDeclaration__Group_6__0 )? ) ;
    public final void rule__ReferenceDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1440:1: ( ( ( rule__ReferenceDeclaration__Group_6__0 )? ) )
            // InternalProblem.g:1441:1: ( ( rule__ReferenceDeclaration__Group_6__0 )? )
            {
            // InternalProblem.g:1441:1: ( ( rule__ReferenceDeclaration__Group_6__0 )? )
            // InternalProblem.g:1442:2: ( rule__ReferenceDeclaration__Group_6__0 )?
            {
             before(grammarAccess.getReferenceDeclarationAccess().getGroup_6()); 
            // InternalProblem.g:1443:2: ( rule__ReferenceDeclaration__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProblem.g:1443:3: rule__ReferenceDeclaration__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceDeclaration__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceDeclarationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__6__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group_6__0"
    // InternalProblem.g:1452:1: rule__ReferenceDeclaration__Group_6__0 : rule__ReferenceDeclaration__Group_6__0__Impl rule__ReferenceDeclaration__Group_6__1 ;
    public final void rule__ReferenceDeclaration__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1456:1: ( rule__ReferenceDeclaration__Group_6__0__Impl rule__ReferenceDeclaration__Group_6__1 )
            // InternalProblem.g:1457:2: rule__ReferenceDeclaration__Group_6__0__Impl rule__ReferenceDeclaration__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__ReferenceDeclaration__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group_6__0"


    // $ANTLR start "rule__ReferenceDeclaration__Group_6__0__Impl"
    // InternalProblem.g:1464:1: rule__ReferenceDeclaration__Group_6__0__Impl : ( 'opposite' ) ;
    public final void rule__ReferenceDeclaration__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1468:1: ( ( 'opposite' ) )
            // InternalProblem.g:1469:1: ( 'opposite' )
            {
            // InternalProblem.g:1469:1: ( 'opposite' )
            // InternalProblem.g:1470:2: 'opposite'
            {
             before(grammarAccess.getReferenceDeclarationAccess().getOppositeKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getReferenceDeclarationAccess().getOppositeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group_6__0__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group_6__1"
    // InternalProblem.g:1479:1: rule__ReferenceDeclaration__Group_6__1 : rule__ReferenceDeclaration__Group_6__1__Impl ;
    public final void rule__ReferenceDeclaration__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1483:1: ( rule__ReferenceDeclaration__Group_6__1__Impl )
            // InternalProblem.g:1484:2: rule__ReferenceDeclaration__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group_6__1"


    // $ANTLR start "rule__ReferenceDeclaration__Group_6__1__Impl"
    // InternalProblem.g:1490:1: rule__ReferenceDeclaration__Group_6__1__Impl : ( ( rule__ReferenceDeclaration__OppositeAssignment_6_1 ) ) ;
    public final void rule__ReferenceDeclaration__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1494:1: ( ( ( rule__ReferenceDeclaration__OppositeAssignment_6_1 ) ) )
            // InternalProblem.g:1495:1: ( ( rule__ReferenceDeclaration__OppositeAssignment_6_1 ) )
            {
            // InternalProblem.g:1495:1: ( ( rule__ReferenceDeclaration__OppositeAssignment_6_1 ) )
            // InternalProblem.g:1496:2: ( rule__ReferenceDeclaration__OppositeAssignment_6_1 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getOppositeAssignment_6_1()); 
            // InternalProblem.g:1497:2: ( rule__ReferenceDeclaration__OppositeAssignment_6_1 )
            // InternalProblem.g:1497:3: rule__ReferenceDeclaration__OppositeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__OppositeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceDeclarationAccess().getOppositeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group_6__1__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group__0"
    // InternalProblem.g:1506:1: rule__PredicateDefinition__Group__0 : rule__PredicateDefinition__Group__0__Impl rule__PredicateDefinition__Group__1 ;
    public final void rule__PredicateDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1510:1: ( rule__PredicateDefinition__Group__0__Impl rule__PredicateDefinition__Group__1 )
            // InternalProblem.g:1511:2: rule__PredicateDefinition__Group__0__Impl rule__PredicateDefinition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PredicateDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group__0"


    // $ANTLR start "rule__PredicateDefinition__Group__0__Impl"
    // InternalProblem.g:1518:1: rule__PredicateDefinition__Group__0__Impl : ( ( rule__PredicateDefinition__Alternatives_0 ) ) ;
    public final void rule__PredicateDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1522:1: ( ( ( rule__PredicateDefinition__Alternatives_0 ) ) )
            // InternalProblem.g:1523:1: ( ( rule__PredicateDefinition__Alternatives_0 ) )
            {
            // InternalProblem.g:1523:1: ( ( rule__PredicateDefinition__Alternatives_0 ) )
            // InternalProblem.g:1524:2: ( rule__PredicateDefinition__Alternatives_0 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getAlternatives_0()); 
            // InternalProblem.g:1525:2: ( rule__PredicateDefinition__Alternatives_0 )
            // InternalProblem.g:1525:3: rule__PredicateDefinition__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateDefinitionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group__0__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group__1"
    // InternalProblem.g:1533:1: rule__PredicateDefinition__Group__1 : rule__PredicateDefinition__Group__1__Impl rule__PredicateDefinition__Group__2 ;
    public final void rule__PredicateDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1537:1: ( rule__PredicateDefinition__Group__1__Impl rule__PredicateDefinition__Group__2 )
            // InternalProblem.g:1538:2: rule__PredicateDefinition__Group__1__Impl rule__PredicateDefinition__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__PredicateDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group__1"


    // $ANTLR start "rule__PredicateDefinition__Group__1__Impl"
    // InternalProblem.g:1545:1: rule__PredicateDefinition__Group__1__Impl : ( ( rule__PredicateDefinition__NameAssignment_1 ) ) ;
    public final void rule__PredicateDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1549:1: ( ( ( rule__PredicateDefinition__NameAssignment_1 ) ) )
            // InternalProblem.g:1550:1: ( ( rule__PredicateDefinition__NameAssignment_1 ) )
            {
            // InternalProblem.g:1550:1: ( ( rule__PredicateDefinition__NameAssignment_1 ) )
            // InternalProblem.g:1551:2: ( rule__PredicateDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getNameAssignment_1()); 
            // InternalProblem.g:1552:2: ( rule__PredicateDefinition__NameAssignment_1 )
            // InternalProblem.g:1552:3: rule__PredicateDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group__1__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group__2"
    // InternalProblem.g:1560:1: rule__PredicateDefinition__Group__2 : rule__PredicateDefinition__Group__2__Impl rule__PredicateDefinition__Group__3 ;
    public final void rule__PredicateDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1564:1: ( rule__PredicateDefinition__Group__2__Impl rule__PredicateDefinition__Group__3 )
            // InternalProblem.g:1565:2: rule__PredicateDefinition__Group__2__Impl rule__PredicateDefinition__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__PredicateDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group__2"


    // $ANTLR start "rule__PredicateDefinition__Group__2__Impl"
    // InternalProblem.g:1572:1: rule__PredicateDefinition__Group__2__Impl : ( '(' ) ;
    public final void rule__PredicateDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1576:1: ( ( '(' ) )
            // InternalProblem.g:1577:1: ( '(' )
            {
            // InternalProblem.g:1577:1: ( '(' )
            // InternalProblem.g:1578:2: '('
            {
             before(grammarAccess.getPredicateDefinitionAccess().getLeftParenthesisKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPredicateDefinitionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group__2__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group__3"
    // InternalProblem.g:1587:1: rule__PredicateDefinition__Group__3 : rule__PredicateDefinition__Group__3__Impl rule__PredicateDefinition__Group__4 ;
    public final void rule__PredicateDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1591:1: ( rule__PredicateDefinition__Group__3__Impl rule__PredicateDefinition__Group__4 )
            // InternalProblem.g:1592:2: rule__PredicateDefinition__Group__3__Impl rule__PredicateDefinition__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__PredicateDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group__3"


    // $ANTLR start "rule__PredicateDefinition__Group__3__Impl"
    // InternalProblem.g:1599:1: rule__PredicateDefinition__Group__3__Impl : ( ( rule__PredicateDefinition__Group_3__0 )? ) ;
    public final void rule__PredicateDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1603:1: ( ( ( rule__PredicateDefinition__Group_3__0 )? ) )
            // InternalProblem.g:1604:1: ( ( rule__PredicateDefinition__Group_3__0 )? )
            {
            // InternalProblem.g:1604:1: ( ( rule__PredicateDefinition__Group_3__0 )? )
            // InternalProblem.g:1605:2: ( rule__PredicateDefinition__Group_3__0 )?
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_3()); 
            // InternalProblem.g:1606:2: ( rule__PredicateDefinition__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProblem.g:1606:3: rule__PredicateDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PredicateDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPredicateDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group__3__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group__4"
    // InternalProblem.g:1614:1: rule__PredicateDefinition__Group__4 : rule__PredicateDefinition__Group__4__Impl rule__PredicateDefinition__Group__5 ;
    public final void rule__PredicateDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1618:1: ( rule__PredicateDefinition__Group__4__Impl rule__PredicateDefinition__Group__5 )
            // InternalProblem.g:1619:2: rule__PredicateDefinition__Group__4__Impl rule__PredicateDefinition__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__PredicateDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group__4"


    // $ANTLR start "rule__PredicateDefinition__Group__4__Impl"
    // InternalProblem.g:1626:1: rule__PredicateDefinition__Group__4__Impl : ( ')' ) ;
    public final void rule__PredicateDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1630:1: ( ( ')' ) )
            // InternalProblem.g:1631:1: ( ')' )
            {
            // InternalProblem.g:1631:1: ( ')' )
            // InternalProblem.g:1632:2: ')'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPredicateDefinitionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group__4__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group__5"
    // InternalProblem.g:1641:1: rule__PredicateDefinition__Group__5 : rule__PredicateDefinition__Group__5__Impl rule__PredicateDefinition__Group__6 ;
    public final void rule__PredicateDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1645:1: ( rule__PredicateDefinition__Group__5__Impl rule__PredicateDefinition__Group__6 )
            // InternalProblem.g:1646:2: rule__PredicateDefinition__Group__5__Impl rule__PredicateDefinition__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__PredicateDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group__5"


    // $ANTLR start "rule__PredicateDefinition__Group__5__Impl"
    // InternalProblem.g:1653:1: rule__PredicateDefinition__Group__5__Impl : ( ( rule__PredicateDefinition__Group_5__0 )? ) ;
    public final void rule__PredicateDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1657:1: ( ( ( rule__PredicateDefinition__Group_5__0 )? ) )
            // InternalProblem.g:1658:1: ( ( rule__PredicateDefinition__Group_5__0 )? )
            {
            // InternalProblem.g:1658:1: ( ( rule__PredicateDefinition__Group_5__0 )? )
            // InternalProblem.g:1659:2: ( rule__PredicateDefinition__Group_5__0 )?
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_5()); 
            // InternalProblem.g:1660:2: ( rule__PredicateDefinition__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalProblem.g:1660:3: rule__PredicateDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PredicateDefinition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPredicateDefinitionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group__5__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group__6"
    // InternalProblem.g:1668:1: rule__PredicateDefinition__Group__6 : rule__PredicateDefinition__Group__6__Impl ;
    public final void rule__PredicateDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1672:1: ( rule__PredicateDefinition__Group__6__Impl )
            // InternalProblem.g:1673:2: rule__PredicateDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group__6"


    // $ANTLR start "rule__PredicateDefinition__Group__6__Impl"
    // InternalProblem.g:1679:1: rule__PredicateDefinition__Group__6__Impl : ( '.' ) ;
    public final void rule__PredicateDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1683:1: ( ( '.' ) )
            // InternalProblem.g:1684:1: ( '.' )
            {
            // InternalProblem.g:1684:1: ( '.' )
            // InternalProblem.g:1685:2: '.'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getFullStopKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPredicateDefinitionAccess().getFullStopKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group__6__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group_0_0__0"
    // InternalProblem.g:1695:1: rule__PredicateDefinition__Group_0_0__0 : rule__PredicateDefinition__Group_0_0__0__Impl rule__PredicateDefinition__Group_0_0__1 ;
    public final void rule__PredicateDefinition__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1699:1: ( rule__PredicateDefinition__Group_0_0__0__Impl rule__PredicateDefinition__Group_0_0__1 )
            // InternalProblem.g:1700:2: rule__PredicateDefinition__Group_0_0__0__Impl rule__PredicateDefinition__Group_0_0__1
            {
            pushFollow(FOLLOW_19);
            rule__PredicateDefinition__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_0_0__0"


    // $ANTLR start "rule__PredicateDefinition__Group_0_0__0__Impl"
    // InternalProblem.g:1707:1: rule__PredicateDefinition__Group_0_0__0__Impl : ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) ) ;
    public final void rule__PredicateDefinition__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1711:1: ( ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) ) )
            // InternalProblem.g:1712:1: ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) )
            {
            // InternalProblem.g:1712:1: ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) )
            // InternalProblem.g:1713:2: ( rule__PredicateDefinition__ErrorAssignment_0_0_0 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getErrorAssignment_0_0_0()); 
            // InternalProblem.g:1714:2: ( rule__PredicateDefinition__ErrorAssignment_0_0_0 )
            // InternalProblem.g:1714:3: rule__PredicateDefinition__ErrorAssignment_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__ErrorAssignment_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateDefinitionAccess().getErrorAssignment_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_0_0__0__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group_0_0__1"
    // InternalProblem.g:1722:1: rule__PredicateDefinition__Group_0_0__1 : rule__PredicateDefinition__Group_0_0__1__Impl ;
    public final void rule__PredicateDefinition__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1726:1: ( rule__PredicateDefinition__Group_0_0__1__Impl )
            // InternalProblem.g:1727:2: rule__PredicateDefinition__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_0_0__1"


    // $ANTLR start "rule__PredicateDefinition__Group_0_0__1__Impl"
    // InternalProblem.g:1733:1: rule__PredicateDefinition__Group_0_0__1__Impl : ( ( 'pred' )? ) ;
    public final void rule__PredicateDefinition__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1737:1: ( ( ( 'pred' )? ) )
            // InternalProblem.g:1738:1: ( ( 'pred' )? )
            {
            // InternalProblem.g:1738:1: ( ( 'pred' )? )
            // InternalProblem.g:1739:2: ( 'pred' )?
            {
             before(grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_0_1()); 
            // InternalProblem.g:1740:2: ( 'pred' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==12) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProblem.g:1740:3: 'pred'
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_0_0__1__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group_3__0"
    // InternalProblem.g:1749:1: rule__PredicateDefinition__Group_3__0 : rule__PredicateDefinition__Group_3__0__Impl rule__PredicateDefinition__Group_3__1 ;
    public final void rule__PredicateDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1753:1: ( rule__PredicateDefinition__Group_3__0__Impl rule__PredicateDefinition__Group_3__1 )
            // InternalProblem.g:1754:2: rule__PredicateDefinition__Group_3__0__Impl rule__PredicateDefinition__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__PredicateDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_3__0"


    // $ANTLR start "rule__PredicateDefinition__Group_3__0__Impl"
    // InternalProblem.g:1761:1: rule__PredicateDefinition__Group_3__0__Impl : ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) ) ;
    public final void rule__PredicateDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1765:1: ( ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) ) )
            // InternalProblem.g:1766:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) )
            {
            // InternalProblem.g:1766:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) )
            // InternalProblem.g:1767:2: ( rule__PredicateDefinition__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getParametersAssignment_3_0()); 
            // InternalProblem.g:1768:2: ( rule__PredicateDefinition__ParametersAssignment_3_0 )
            // InternalProblem.g:1768:3: rule__PredicateDefinition__ParametersAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__ParametersAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateDefinitionAccess().getParametersAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group_3__1"
    // InternalProblem.g:1776:1: rule__PredicateDefinition__Group_3__1 : rule__PredicateDefinition__Group_3__1__Impl ;
    public final void rule__PredicateDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1780:1: ( rule__PredicateDefinition__Group_3__1__Impl )
            // InternalProblem.g:1781:2: rule__PredicateDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_3__1"


    // $ANTLR start "rule__PredicateDefinition__Group_3__1__Impl"
    // InternalProblem.g:1787:1: rule__PredicateDefinition__Group_3__1__Impl : ( ( rule__PredicateDefinition__Group_3_1__0 )* ) ;
    public final void rule__PredicateDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1791:1: ( ( ( rule__PredicateDefinition__Group_3_1__0 )* ) )
            // InternalProblem.g:1792:1: ( ( rule__PredicateDefinition__Group_3_1__0 )* )
            {
            // InternalProblem.g:1792:1: ( ( rule__PredicateDefinition__Group_3_1__0 )* )
            // InternalProblem.g:1793:2: ( rule__PredicateDefinition__Group_3_1__0 )*
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_3_1()); 
            // InternalProblem.g:1794:2: ( rule__PredicateDefinition__Group_3_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==25) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalProblem.g:1794:3: rule__PredicateDefinition__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PredicateDefinition__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getPredicateDefinitionAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group_3_1__0"
    // InternalProblem.g:1803:1: rule__PredicateDefinition__Group_3_1__0 : rule__PredicateDefinition__Group_3_1__0__Impl rule__PredicateDefinition__Group_3_1__1 ;
    public final void rule__PredicateDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1807:1: ( rule__PredicateDefinition__Group_3_1__0__Impl rule__PredicateDefinition__Group_3_1__1 )
            // InternalProblem.g:1808:2: rule__PredicateDefinition__Group_3_1__0__Impl rule__PredicateDefinition__Group_3_1__1
            {
            pushFollow(FOLLOW_5);
            rule__PredicateDefinition__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_3_1__0"


    // $ANTLR start "rule__PredicateDefinition__Group_3_1__0__Impl"
    // InternalProblem.g:1815:1: rule__PredicateDefinition__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__PredicateDefinition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1819:1: ( ( ',' ) )
            // InternalProblem.g:1820:1: ( ',' )
            {
            // InternalProblem.g:1820:1: ( ',' )
            // InternalProblem.g:1821:2: ','
            {
             before(grammarAccess.getPredicateDefinitionAccess().getCommaKeyword_3_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPredicateDefinitionAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_3_1__0__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group_3_1__1"
    // InternalProblem.g:1830:1: rule__PredicateDefinition__Group_3_1__1 : rule__PredicateDefinition__Group_3_1__1__Impl ;
    public final void rule__PredicateDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1834:1: ( rule__PredicateDefinition__Group_3_1__1__Impl )
            // InternalProblem.g:1835:2: rule__PredicateDefinition__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_3_1__1"


    // $ANTLR start "rule__PredicateDefinition__Group_3_1__1__Impl"
    // InternalProblem.g:1841:1: rule__PredicateDefinition__Group_3_1__1__Impl : ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__PredicateDefinition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1845:1: ( ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) ) )
            // InternalProblem.g:1846:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) )
            {
            // InternalProblem.g:1846:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) )
            // InternalProblem.g:1847:2: ( rule__PredicateDefinition__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getParametersAssignment_3_1_1()); 
            // InternalProblem.g:1848:2: ( rule__PredicateDefinition__ParametersAssignment_3_1_1 )
            // InternalProblem.g:1848:3: rule__PredicateDefinition__ParametersAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__ParametersAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateDefinitionAccess().getParametersAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_3_1__1__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group_5__0"
    // InternalProblem.g:1857:1: rule__PredicateDefinition__Group_5__0 : rule__PredicateDefinition__Group_5__0__Impl rule__PredicateDefinition__Group_5__1 ;
    public final void rule__PredicateDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1861:1: ( rule__PredicateDefinition__Group_5__0__Impl rule__PredicateDefinition__Group_5__1 )
            // InternalProblem.g:1862:2: rule__PredicateDefinition__Group_5__0__Impl rule__PredicateDefinition__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__PredicateDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_5__0"


    // $ANTLR start "rule__PredicateDefinition__Group_5__0__Impl"
    // InternalProblem.g:1869:1: rule__PredicateDefinition__Group_5__0__Impl : ( ':=' ) ;
    public final void rule__PredicateDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1873:1: ( ( ':=' ) )
            // InternalProblem.g:1874:1: ( ':=' )
            {
            // InternalProblem.g:1874:1: ( ':=' )
            // InternalProblem.g:1875:2: ':='
            {
             before(grammarAccess.getPredicateDefinitionAccess().getColonEqualsSignKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPredicateDefinitionAccess().getColonEqualsSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group_5__1"
    // InternalProblem.g:1884:1: rule__PredicateDefinition__Group_5__1 : rule__PredicateDefinition__Group_5__1__Impl rule__PredicateDefinition__Group_5__2 ;
    public final void rule__PredicateDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1888:1: ( rule__PredicateDefinition__Group_5__1__Impl rule__PredicateDefinition__Group_5__2 )
            // InternalProblem.g:1889:2: rule__PredicateDefinition__Group_5__1__Impl rule__PredicateDefinition__Group_5__2
            {
            pushFollow(FOLLOW_21);
            rule__PredicateDefinition__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_5__1"


    // $ANTLR start "rule__PredicateDefinition__Group_5__1__Impl"
    // InternalProblem.g:1896:1: rule__PredicateDefinition__Group_5__1__Impl : ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) ) ;
    public final void rule__PredicateDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1900:1: ( ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) ) )
            // InternalProblem.g:1901:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) )
            {
            // InternalProblem.g:1901:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) )
            // InternalProblem.g:1902:2: ( rule__PredicateDefinition__BodiesAssignment_5_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getBodiesAssignment_5_1()); 
            // InternalProblem.g:1903:2: ( rule__PredicateDefinition__BodiesAssignment_5_1 )
            // InternalProblem.g:1903:3: rule__PredicateDefinition__BodiesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__BodiesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateDefinitionAccess().getBodiesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group_5__2"
    // InternalProblem.g:1911:1: rule__PredicateDefinition__Group_5__2 : rule__PredicateDefinition__Group_5__2__Impl ;
    public final void rule__PredicateDefinition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1915:1: ( rule__PredicateDefinition__Group_5__2__Impl )
            // InternalProblem.g:1916:2: rule__PredicateDefinition__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_5__2"


    // $ANTLR start "rule__PredicateDefinition__Group_5__2__Impl"
    // InternalProblem.g:1922:1: rule__PredicateDefinition__Group_5__2__Impl : ( ( rule__PredicateDefinition__Group_5_2__0 )* ) ;
    public final void rule__PredicateDefinition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1926:1: ( ( ( rule__PredicateDefinition__Group_5_2__0 )* ) )
            // InternalProblem.g:1927:1: ( ( rule__PredicateDefinition__Group_5_2__0 )* )
            {
            // InternalProblem.g:1927:1: ( ( rule__PredicateDefinition__Group_5_2__0 )* )
            // InternalProblem.g:1928:2: ( rule__PredicateDefinition__Group_5_2__0 )*
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_5_2()); 
            // InternalProblem.g:1929:2: ( rule__PredicateDefinition__Group_5_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==30) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalProblem.g:1929:3: rule__PredicateDefinition__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__PredicateDefinition__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getPredicateDefinitionAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_5__2__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group_5_2__0"
    // InternalProblem.g:1938:1: rule__PredicateDefinition__Group_5_2__0 : rule__PredicateDefinition__Group_5_2__0__Impl rule__PredicateDefinition__Group_5_2__1 ;
    public final void rule__PredicateDefinition__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1942:1: ( rule__PredicateDefinition__Group_5_2__0__Impl rule__PredicateDefinition__Group_5_2__1 )
            // InternalProblem.g:1943:2: rule__PredicateDefinition__Group_5_2__0__Impl rule__PredicateDefinition__Group_5_2__1
            {
            pushFollow(FOLLOW_20);
            rule__PredicateDefinition__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_5_2__0"


    // $ANTLR start "rule__PredicateDefinition__Group_5_2__0__Impl"
    // InternalProblem.g:1950:1: rule__PredicateDefinition__Group_5_2__0__Impl : ( ';' ) ;
    public final void rule__PredicateDefinition__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1954:1: ( ( ';' ) )
            // InternalProblem.g:1955:1: ( ';' )
            {
            // InternalProblem.g:1955:1: ( ';' )
            // InternalProblem.g:1956:2: ';'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getSemicolonKeyword_5_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPredicateDefinitionAccess().getSemicolonKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_5_2__0__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group_5_2__1"
    // InternalProblem.g:1965:1: rule__PredicateDefinition__Group_5_2__1 : rule__PredicateDefinition__Group_5_2__1__Impl ;
    public final void rule__PredicateDefinition__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1969:1: ( rule__PredicateDefinition__Group_5_2__1__Impl )
            // InternalProblem.g:1970:2: rule__PredicateDefinition__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_5_2__1"


    // $ANTLR start "rule__PredicateDefinition__Group_5_2__1__Impl"
    // InternalProblem.g:1976:1: rule__PredicateDefinition__Group_5_2__1__Impl : ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) ) ;
    public final void rule__PredicateDefinition__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1980:1: ( ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) ) )
            // InternalProblem.g:1981:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) )
            {
            // InternalProblem.g:1981:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) )
            // InternalProblem.g:1982:2: ( rule__PredicateDefinition__BodiesAssignment_5_2_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getBodiesAssignment_5_2_1()); 
            // InternalProblem.g:1983:2: ( rule__PredicateDefinition__BodiesAssignment_5_2_1 )
            // InternalProblem.g:1983:3: rule__PredicateDefinition__BodiesAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PredicateDefinition__BodiesAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPredicateDefinitionAccess().getBodiesAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__Group_5_2__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalProblem.g:1992:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1996:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalProblem.g:1997:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProblem.g:2004:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__ParameterTypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2008:1: ( ( ( rule__Parameter__ParameterTypeAssignment_0 ) ) )
            // InternalProblem.g:2009:1: ( ( rule__Parameter__ParameterTypeAssignment_0 ) )
            {
            // InternalProblem.g:2009:1: ( ( rule__Parameter__ParameterTypeAssignment_0 ) )
            // InternalProblem.g:2010:2: ( rule__Parameter__ParameterTypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getParameterTypeAssignment_0()); 
            // InternalProblem.g:2011:2: ( rule__Parameter__ParameterTypeAssignment_0 )
            // InternalProblem.g:2011:3: rule__Parameter__ParameterTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ParameterTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getParameterTypeAssignment_0()); 

            }


            }

        }
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
    // InternalProblem.g:2019:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2023:1: ( rule__Parameter__Group__1__Impl )
            // InternalProblem.g:2024:2: rule__Parameter__Group__1__Impl
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
    // InternalProblem.g:2030:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2034:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalProblem.g:2035:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalProblem.g:2035:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalProblem.g:2036:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalProblem.g:2037:2: ( rule__Parameter__NameAssignment_1 )
            // InternalProblem.g:2037:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Conjunction__Group__0"
    // InternalProblem.g:2046:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2050:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // InternalProblem.g:2051:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Conjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conjunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__0"


    // $ANTLR start "rule__Conjunction__Group__0__Impl"
    // InternalProblem.g:2058:1: rule__Conjunction__Group__0__Impl : ( ( rule__Conjunction__LiteralsAssignment_0 ) ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2062:1: ( ( ( rule__Conjunction__LiteralsAssignment_0 ) ) )
            // InternalProblem.g:2063:1: ( ( rule__Conjunction__LiteralsAssignment_0 ) )
            {
            // InternalProblem.g:2063:1: ( ( rule__Conjunction__LiteralsAssignment_0 ) )
            // InternalProblem.g:2064:2: ( rule__Conjunction__LiteralsAssignment_0 )
            {
             before(grammarAccess.getConjunctionAccess().getLiteralsAssignment_0()); 
            // InternalProblem.g:2065:2: ( rule__Conjunction__LiteralsAssignment_0 )
            // InternalProblem.g:2065:3: rule__Conjunction__LiteralsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Conjunction__LiteralsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getLiteralsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__0__Impl"


    // $ANTLR start "rule__Conjunction__Group__1"
    // InternalProblem.g:2073:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2077:1: ( rule__Conjunction__Group__1__Impl )
            // InternalProblem.g:2078:2: rule__Conjunction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conjunction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__1"


    // $ANTLR start "rule__Conjunction__Group__1__Impl"
    // InternalProblem.g:2084:1: rule__Conjunction__Group__1__Impl : ( ( rule__Conjunction__Group_1__0 )* ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2088:1: ( ( ( rule__Conjunction__Group_1__0 )* ) )
            // InternalProblem.g:2089:1: ( ( rule__Conjunction__Group_1__0 )* )
            {
            // InternalProblem.g:2089:1: ( ( rule__Conjunction__Group_1__0 )* )
            // InternalProblem.g:2090:2: ( rule__Conjunction__Group_1__0 )*
            {
             before(grammarAccess.getConjunctionAccess().getGroup_1()); 
            // InternalProblem.g:2091:2: ( rule__Conjunction__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==25) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalProblem.g:2091:3: rule__Conjunction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Conjunction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getConjunctionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__1__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__0"
    // InternalProblem.g:2100:1: rule__Conjunction__Group_1__0 : rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 ;
    public final void rule__Conjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2104:1: ( rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 )
            // InternalProblem.g:2105:2: rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Conjunction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conjunction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__0"


    // $ANTLR start "rule__Conjunction__Group_1__0__Impl"
    // InternalProblem.g:2112:1: rule__Conjunction__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Conjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2116:1: ( ( ',' ) )
            // InternalProblem.g:2117:1: ( ',' )
            {
            // InternalProblem.g:2117:1: ( ',' )
            // InternalProblem.g:2118:2: ','
            {
             before(grammarAccess.getConjunctionAccess().getCommaKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConjunctionAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__0__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__1"
    // InternalProblem.g:2127:1: rule__Conjunction__Group_1__1 : rule__Conjunction__Group_1__1__Impl ;
    public final void rule__Conjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2131:1: ( rule__Conjunction__Group_1__1__Impl )
            // InternalProblem.g:2132:2: rule__Conjunction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conjunction__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__1"


    // $ANTLR start "rule__Conjunction__Group_1__1__Impl"
    // InternalProblem.g:2138:1: rule__Conjunction__Group_1__1__Impl : ( ( rule__Conjunction__LiteralsAssignment_1_1 ) ) ;
    public final void rule__Conjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2142:1: ( ( ( rule__Conjunction__LiteralsAssignment_1_1 ) ) )
            // InternalProblem.g:2143:1: ( ( rule__Conjunction__LiteralsAssignment_1_1 ) )
            {
            // InternalProblem.g:2143:1: ( ( rule__Conjunction__LiteralsAssignment_1_1 ) )
            // InternalProblem.g:2144:2: ( rule__Conjunction__LiteralsAssignment_1_1 )
            {
             before(grammarAccess.getConjunctionAccess().getLiteralsAssignment_1_1()); 
            // InternalProblem.g:2145:2: ( rule__Conjunction__LiteralsAssignment_1_1 )
            // InternalProblem.g:2145:3: rule__Conjunction__LiteralsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Conjunction__LiteralsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getLiteralsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__1__Impl"


    // $ANTLR start "rule__NegativeLiteral__Group__0"
    // InternalProblem.g:2154:1: rule__NegativeLiteral__Group__0 : rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1 ;
    public final void rule__NegativeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2158:1: ( rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1 )
            // InternalProblem.g:2159:2: rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__NegativeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NegativeLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeLiteral__Group__0"


    // $ANTLR start "rule__NegativeLiteral__Group__0__Impl"
    // InternalProblem.g:2166:1: rule__NegativeLiteral__Group__0__Impl : ( '!' ) ;
    public final void rule__NegativeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2170:1: ( ( '!' ) )
            // InternalProblem.g:2171:1: ( '!' )
            {
            // InternalProblem.g:2171:1: ( '!' )
            // InternalProblem.g:2172:2: '!'
            {
             before(grammarAccess.getNegativeLiteralAccess().getExclamationMarkKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNegativeLiteralAccess().getExclamationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeLiteral__Group__0__Impl"


    // $ANTLR start "rule__NegativeLiteral__Group__1"
    // InternalProblem.g:2181:1: rule__NegativeLiteral__Group__1 : rule__NegativeLiteral__Group__1__Impl ;
    public final void rule__NegativeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2185:1: ( rule__NegativeLiteral__Group__1__Impl )
            // InternalProblem.g:2186:2: rule__NegativeLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NegativeLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeLiteral__Group__1"


    // $ANTLR start "rule__NegativeLiteral__Group__1__Impl"
    // InternalProblem.g:2192:1: rule__NegativeLiteral__Group__1__Impl : ( ( rule__NegativeLiteral__AtomAssignment_1 ) ) ;
    public final void rule__NegativeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2196:1: ( ( ( rule__NegativeLiteral__AtomAssignment_1 ) ) )
            // InternalProblem.g:2197:1: ( ( rule__NegativeLiteral__AtomAssignment_1 ) )
            {
            // InternalProblem.g:2197:1: ( ( rule__NegativeLiteral__AtomAssignment_1 ) )
            // InternalProblem.g:2198:2: ( rule__NegativeLiteral__AtomAssignment_1 )
            {
             before(grammarAccess.getNegativeLiteralAccess().getAtomAssignment_1()); 
            // InternalProblem.g:2199:2: ( rule__NegativeLiteral__AtomAssignment_1 )
            // InternalProblem.g:2199:3: rule__NegativeLiteral__AtomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NegativeLiteral__AtomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNegativeLiteralAccess().getAtomAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeLiteral__Group__1__Impl"


    // $ANTLR start "rule__Atom__Group__0"
    // InternalProblem.g:2208:1: rule__Atom__Group__0 : rule__Atom__Group__0__Impl rule__Atom__Group__1 ;
    public final void rule__Atom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2212:1: ( rule__Atom__Group__0__Impl rule__Atom__Group__1 )
            // InternalProblem.g:2213:2: rule__Atom__Group__0__Impl rule__Atom__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Atom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__0"


    // $ANTLR start "rule__Atom__Group__0__Impl"
    // InternalProblem.g:2220:1: rule__Atom__Group__0__Impl : ( ( rule__Atom__RelationAssignment_0 ) ) ;
    public final void rule__Atom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2224:1: ( ( ( rule__Atom__RelationAssignment_0 ) ) )
            // InternalProblem.g:2225:1: ( ( rule__Atom__RelationAssignment_0 ) )
            {
            // InternalProblem.g:2225:1: ( ( rule__Atom__RelationAssignment_0 ) )
            // InternalProblem.g:2226:2: ( rule__Atom__RelationAssignment_0 )
            {
             before(grammarAccess.getAtomAccess().getRelationAssignment_0()); 
            // InternalProblem.g:2227:2: ( rule__Atom__RelationAssignment_0 )
            // InternalProblem.g:2227:3: rule__Atom__RelationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Atom__RelationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getRelationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__0__Impl"


    // $ANTLR start "rule__Atom__Group__1"
    // InternalProblem.g:2235:1: rule__Atom__Group__1 : rule__Atom__Group__1__Impl rule__Atom__Group__2 ;
    public final void rule__Atom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2239:1: ( rule__Atom__Group__1__Impl rule__Atom__Group__2 )
            // InternalProblem.g:2240:2: rule__Atom__Group__1__Impl rule__Atom__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Atom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__1"


    // $ANTLR start "rule__Atom__Group__1__Impl"
    // InternalProblem.g:2247:1: rule__Atom__Group__1__Impl : ( ( rule__Atom__TransitiveClosureAssignment_1 )? ) ;
    public final void rule__Atom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2251:1: ( ( ( rule__Atom__TransitiveClosureAssignment_1 )? ) )
            // InternalProblem.g:2252:1: ( ( rule__Atom__TransitiveClosureAssignment_1 )? )
            {
            // InternalProblem.g:2252:1: ( ( rule__Atom__TransitiveClosureAssignment_1 )? )
            // InternalProblem.g:2253:2: ( rule__Atom__TransitiveClosureAssignment_1 )?
            {
             before(grammarAccess.getAtomAccess().getTransitiveClosureAssignment_1()); 
            // InternalProblem.g:2254:2: ( rule__Atom__TransitiveClosureAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProblem.g:2254:3: rule__Atom__TransitiveClosureAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__TransitiveClosureAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomAccess().getTransitiveClosureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__1__Impl"


    // $ANTLR start "rule__Atom__Group__2"
    // InternalProblem.g:2262:1: rule__Atom__Group__2 : rule__Atom__Group__2__Impl rule__Atom__Group__3 ;
    public final void rule__Atom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2266:1: ( rule__Atom__Group__2__Impl rule__Atom__Group__3 )
            // InternalProblem.g:2267:2: rule__Atom__Group__2__Impl rule__Atom__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Atom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__2"


    // $ANTLR start "rule__Atom__Group__2__Impl"
    // InternalProblem.g:2274:1: rule__Atom__Group__2__Impl : ( '(' ) ;
    public final void rule__Atom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2278:1: ( ( '(' ) )
            // InternalProblem.g:2279:1: ( '(' )
            {
            // InternalProblem.g:2279:1: ( '(' )
            // InternalProblem.g:2280:2: '('
            {
             before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__2__Impl"


    // $ANTLR start "rule__Atom__Group__3"
    // InternalProblem.g:2289:1: rule__Atom__Group__3 : rule__Atom__Group__3__Impl rule__Atom__Group__4 ;
    public final void rule__Atom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2293:1: ( rule__Atom__Group__3__Impl rule__Atom__Group__4 )
            // InternalProblem.g:2294:2: rule__Atom__Group__3__Impl rule__Atom__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Atom__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__3"


    // $ANTLR start "rule__Atom__Group__3__Impl"
    // InternalProblem.g:2301:1: rule__Atom__Group__3__Impl : ( ( rule__Atom__Group_3__0 )? ) ;
    public final void rule__Atom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2305:1: ( ( ( rule__Atom__Group_3__0 )? ) )
            // InternalProblem.g:2306:1: ( ( rule__Atom__Group_3__0 )? )
            {
            // InternalProblem.g:2306:1: ( ( rule__Atom__Group_3__0 )? )
            // InternalProblem.g:2307:2: ( rule__Atom__Group_3__0 )?
            {
             before(grammarAccess.getAtomAccess().getGroup_3()); 
            // InternalProblem.g:2308:2: ( rule__Atom__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalProblem.g:2308:3: rule__Atom__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__3__Impl"


    // $ANTLR start "rule__Atom__Group__4"
    // InternalProblem.g:2316:1: rule__Atom__Group__4 : rule__Atom__Group__4__Impl ;
    public final void rule__Atom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2320:1: ( rule__Atom__Group__4__Impl )
            // InternalProblem.g:2321:2: rule__Atom__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__4"


    // $ANTLR start "rule__Atom__Group__4__Impl"
    // InternalProblem.g:2327:1: rule__Atom__Group__4__Impl : ( ')' ) ;
    public final void rule__Atom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2331:1: ( ( ')' ) )
            // InternalProblem.g:2332:1: ( ')' )
            {
            // InternalProblem.g:2332:1: ( ')' )
            // InternalProblem.g:2333:2: ')'
            {
             before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__4__Impl"


    // $ANTLR start "rule__Atom__Group_3__0"
    // InternalProblem.g:2343:1: rule__Atom__Group_3__0 : rule__Atom__Group_3__0__Impl rule__Atom__Group_3__1 ;
    public final void rule__Atom__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2347:1: ( rule__Atom__Group_3__0__Impl rule__Atom__Group_3__1 )
            // InternalProblem.g:2348:2: rule__Atom__Group_3__0__Impl rule__Atom__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Atom__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_3__0"


    // $ANTLR start "rule__Atom__Group_3__0__Impl"
    // InternalProblem.g:2355:1: rule__Atom__Group_3__0__Impl : ( ( rule__Atom__ArgumentsAssignment_3_0 ) ) ;
    public final void rule__Atom__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2359:1: ( ( ( rule__Atom__ArgumentsAssignment_3_0 ) ) )
            // InternalProblem.g:2360:1: ( ( rule__Atom__ArgumentsAssignment_3_0 ) )
            {
            // InternalProblem.g:2360:1: ( ( rule__Atom__ArgumentsAssignment_3_0 ) )
            // InternalProblem.g:2361:2: ( rule__Atom__ArgumentsAssignment_3_0 )
            {
             before(grammarAccess.getAtomAccess().getArgumentsAssignment_3_0()); 
            // InternalProblem.g:2362:2: ( rule__Atom__ArgumentsAssignment_3_0 )
            // InternalProblem.g:2362:3: rule__Atom__ArgumentsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Atom__ArgumentsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getArgumentsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_3__0__Impl"


    // $ANTLR start "rule__Atom__Group_3__1"
    // InternalProblem.g:2370:1: rule__Atom__Group_3__1 : rule__Atom__Group_3__1__Impl ;
    public final void rule__Atom__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2374:1: ( rule__Atom__Group_3__1__Impl )
            // InternalProblem.g:2375:2: rule__Atom__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_3__1"


    // $ANTLR start "rule__Atom__Group_3__1__Impl"
    // InternalProblem.g:2381:1: rule__Atom__Group_3__1__Impl : ( ( rule__Atom__Group_3_1__0 )* ) ;
    public final void rule__Atom__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2385:1: ( ( ( rule__Atom__Group_3_1__0 )* ) )
            // InternalProblem.g:2386:1: ( ( rule__Atom__Group_3_1__0 )* )
            {
            // InternalProblem.g:2386:1: ( ( rule__Atom__Group_3_1__0 )* )
            // InternalProblem.g:2387:2: ( rule__Atom__Group_3_1__0 )*
            {
             before(grammarAccess.getAtomAccess().getGroup_3_1()); 
            // InternalProblem.g:2388:2: ( rule__Atom__Group_3_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==25) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalProblem.g:2388:3: rule__Atom__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Atom__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getAtomAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_3__1__Impl"


    // $ANTLR start "rule__Atom__Group_3_1__0"
    // InternalProblem.g:2397:1: rule__Atom__Group_3_1__0 : rule__Atom__Group_3_1__0__Impl rule__Atom__Group_3_1__1 ;
    public final void rule__Atom__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2401:1: ( rule__Atom__Group_3_1__0__Impl rule__Atom__Group_3_1__1 )
            // InternalProblem.g:2402:2: rule__Atom__Group_3_1__0__Impl rule__Atom__Group_3_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Atom__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_3_1__0"


    // $ANTLR start "rule__Atom__Group_3_1__0__Impl"
    // InternalProblem.g:2409:1: rule__Atom__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Atom__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2413:1: ( ( ',' ) )
            // InternalProblem.g:2414:1: ( ',' )
            {
            // InternalProblem.g:2414:1: ( ',' )
            // InternalProblem.g:2415:2: ','
            {
             before(grammarAccess.getAtomAccess().getCommaKeyword_3_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_3_1__0__Impl"


    // $ANTLR start "rule__Atom__Group_3_1__1"
    // InternalProblem.g:2424:1: rule__Atom__Group_3_1__1 : rule__Atom__Group_3_1__1__Impl ;
    public final void rule__Atom__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2428:1: ( rule__Atom__Group_3_1__1__Impl )
            // InternalProblem.g:2429:2: rule__Atom__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_3_1__1"


    // $ANTLR start "rule__Atom__Group_3_1__1__Impl"
    // InternalProblem.g:2435:1: rule__Atom__Group_3_1__1__Impl : ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) ) ;
    public final void rule__Atom__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2439:1: ( ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) ) )
            // InternalProblem.g:2440:1: ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) )
            {
            // InternalProblem.g:2440:1: ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) )
            // InternalProblem.g:2441:2: ( rule__Atom__ArgumentsAssignment_3_1_1 )
            {
             before(grammarAccess.getAtomAccess().getArgumentsAssignment_3_1_1()); 
            // InternalProblem.g:2442:2: ( rule__Atom__ArgumentsAssignment_3_1_1 )
            // InternalProblem.g:2442:3: rule__Atom__ArgumentsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atom__ArgumentsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getArgumentsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_3_1__1__Impl"


    // $ANTLR start "rule__Assertion__Group__0"
    // InternalProblem.g:2451:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2455:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // InternalProblem.g:2456:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Assertion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__0"


    // $ANTLR start "rule__Assertion__Group__0__Impl"
    // InternalProblem.g:2463:1: rule__Assertion__Group__0__Impl : ( ( rule__Assertion__Alternatives_0 ) ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2467:1: ( ( ( rule__Assertion__Alternatives_0 ) ) )
            // InternalProblem.g:2468:1: ( ( rule__Assertion__Alternatives_0 ) )
            {
            // InternalProblem.g:2468:1: ( ( rule__Assertion__Alternatives_0 ) )
            // InternalProblem.g:2469:2: ( rule__Assertion__Alternatives_0 )
            {
             before(grammarAccess.getAssertionAccess().getAlternatives_0()); 
            // InternalProblem.g:2470:2: ( rule__Assertion__Alternatives_0 )
            // InternalProblem.g:2470:3: rule__Assertion__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__0__Impl"


    // $ANTLR start "rule__Assertion__Group__1"
    // InternalProblem.g:2478:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2482:1: ( rule__Assertion__Group__1__Impl )
            // InternalProblem.g:2483:2: rule__Assertion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__1"


    // $ANTLR start "rule__Assertion__Group__1__Impl"
    // InternalProblem.g:2489:1: rule__Assertion__Group__1__Impl : ( '.' ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2493:1: ( ( '.' ) )
            // InternalProblem.g:2494:1: ( '.' )
            {
            // InternalProblem.g:2494:1: ( '.' )
            // InternalProblem.g:2495:2: '.'
            {
             before(grammarAccess.getAssertionAccess().getFullStopKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__1__Impl"


    // $ANTLR start "rule__Assertion__Group_0_0__0"
    // InternalProblem.g:2505:1: rule__Assertion__Group_0_0__0 : rule__Assertion__Group_0_0__0__Impl rule__Assertion__Group_0_0__1 ;
    public final void rule__Assertion__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2509:1: ( rule__Assertion__Group_0_0__0__Impl rule__Assertion__Group_0_0__1 )
            // InternalProblem.g:2510:2: rule__Assertion__Group_0_0__0__Impl rule__Assertion__Group_0_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Assertion__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0__0"


    // $ANTLR start "rule__Assertion__Group_0_0__0__Impl"
    // InternalProblem.g:2517:1: rule__Assertion__Group_0_0__0__Impl : ( ( rule__Assertion__RelationAssignment_0_0_0 ) ) ;
    public final void rule__Assertion__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2521:1: ( ( ( rule__Assertion__RelationAssignment_0_0_0 ) ) )
            // InternalProblem.g:2522:1: ( ( rule__Assertion__RelationAssignment_0_0_0 ) )
            {
            // InternalProblem.g:2522:1: ( ( rule__Assertion__RelationAssignment_0_0_0 ) )
            // InternalProblem.g:2523:2: ( rule__Assertion__RelationAssignment_0_0_0 )
            {
             before(grammarAccess.getAssertionAccess().getRelationAssignment_0_0_0()); 
            // InternalProblem.g:2524:2: ( rule__Assertion__RelationAssignment_0_0_0 )
            // InternalProblem.g:2524:3: rule__Assertion__RelationAssignment_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__RelationAssignment_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getRelationAssignment_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0__0__Impl"


    // $ANTLR start "rule__Assertion__Group_0_0__1"
    // InternalProblem.g:2532:1: rule__Assertion__Group_0_0__1 : rule__Assertion__Group_0_0__1__Impl rule__Assertion__Group_0_0__2 ;
    public final void rule__Assertion__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2536:1: ( rule__Assertion__Group_0_0__1__Impl rule__Assertion__Group_0_0__2 )
            // InternalProblem.g:2537:2: rule__Assertion__Group_0_0__1__Impl rule__Assertion__Group_0_0__2
            {
            pushFollow(FOLLOW_17);
            rule__Assertion__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0__1"


    // $ANTLR start "rule__Assertion__Group_0_0__1__Impl"
    // InternalProblem.g:2544:1: rule__Assertion__Group_0_0__1__Impl : ( '(' ) ;
    public final void rule__Assertion__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2548:1: ( ( '(' ) )
            // InternalProblem.g:2549:1: ( '(' )
            {
            // InternalProblem.g:2549:1: ( '(' )
            // InternalProblem.g:2550:2: '('
            {
             before(grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_0_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0__1__Impl"


    // $ANTLR start "rule__Assertion__Group_0_0__2"
    // InternalProblem.g:2559:1: rule__Assertion__Group_0_0__2 : rule__Assertion__Group_0_0__2__Impl rule__Assertion__Group_0_0__3 ;
    public final void rule__Assertion__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2563:1: ( rule__Assertion__Group_0_0__2__Impl rule__Assertion__Group_0_0__3 )
            // InternalProblem.g:2564:2: rule__Assertion__Group_0_0__2__Impl rule__Assertion__Group_0_0__3
            {
            pushFollow(FOLLOW_17);
            rule__Assertion__Group_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0__2"


    // $ANTLR start "rule__Assertion__Group_0_0__2__Impl"
    // InternalProblem.g:2571:1: rule__Assertion__Group_0_0__2__Impl : ( ( rule__Assertion__Group_0_0_2__0 )? ) ;
    public final void rule__Assertion__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2575:1: ( ( ( rule__Assertion__Group_0_0_2__0 )? ) )
            // InternalProblem.g:2576:1: ( ( rule__Assertion__Group_0_0_2__0 )? )
            {
            // InternalProblem.g:2576:1: ( ( rule__Assertion__Group_0_0_2__0 )? )
            // InternalProblem.g:2577:2: ( rule__Assertion__Group_0_0_2__0 )?
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_0_2()); 
            // InternalProblem.g:2578:2: ( rule__Assertion__Group_0_0_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalProblem.g:2578:3: rule__Assertion__Group_0_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assertion__Group_0_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssertionAccess().getGroup_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0__2__Impl"


    // $ANTLR start "rule__Assertion__Group_0_0__3"
    // InternalProblem.g:2586:1: rule__Assertion__Group_0_0__3 : rule__Assertion__Group_0_0__3__Impl rule__Assertion__Group_0_0__4 ;
    public final void rule__Assertion__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2590:1: ( rule__Assertion__Group_0_0__3__Impl rule__Assertion__Group_0_0__4 )
            // InternalProblem.g:2591:2: rule__Assertion__Group_0_0__3__Impl rule__Assertion__Group_0_0__4
            {
            pushFollow(FOLLOW_25);
            rule__Assertion__Group_0_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0__3"


    // $ANTLR start "rule__Assertion__Group_0_0__3__Impl"
    // InternalProblem.g:2598:1: rule__Assertion__Group_0_0__3__Impl : ( ')' ) ;
    public final void rule__Assertion__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2602:1: ( ( ')' ) )
            // InternalProblem.g:2603:1: ( ')' )
            {
            // InternalProblem.g:2603:1: ( ')' )
            // InternalProblem.g:2604:2: ')'
            {
             before(grammarAccess.getAssertionAccess().getRightParenthesisKeyword_0_0_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getRightParenthesisKeyword_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0__3__Impl"


    // $ANTLR start "rule__Assertion__Group_0_0__4"
    // InternalProblem.g:2613:1: rule__Assertion__Group_0_0__4 : rule__Assertion__Group_0_0__4__Impl rule__Assertion__Group_0_0__5 ;
    public final void rule__Assertion__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2617:1: ( rule__Assertion__Group_0_0__4__Impl rule__Assertion__Group_0_0__5 )
            // InternalProblem.g:2618:2: rule__Assertion__Group_0_0__4__Impl rule__Assertion__Group_0_0__5
            {
            pushFollow(FOLLOW_26);
            rule__Assertion__Group_0_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0__4"


    // $ANTLR start "rule__Assertion__Group_0_0__4__Impl"
    // InternalProblem.g:2625:1: rule__Assertion__Group_0_0__4__Impl : ( ':' ) ;
    public final void rule__Assertion__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2629:1: ( ( ':' ) )
            // InternalProblem.g:2630:1: ( ':' )
            {
            // InternalProblem.g:2630:1: ( ':' )
            // InternalProblem.g:2631:2: ':'
            {
             before(grammarAccess.getAssertionAccess().getColonKeyword_0_0_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getColonKeyword_0_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0__4__Impl"


    // $ANTLR start "rule__Assertion__Group_0_0__5"
    // InternalProblem.g:2640:1: rule__Assertion__Group_0_0__5 : rule__Assertion__Group_0_0__5__Impl ;
    public final void rule__Assertion__Group_0_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2644:1: ( rule__Assertion__Group_0_0__5__Impl )
            // InternalProblem.g:2645:2: rule__Assertion__Group_0_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0__5"


    // $ANTLR start "rule__Assertion__Group_0_0__5__Impl"
    // InternalProblem.g:2651:1: rule__Assertion__Group_0_0__5__Impl : ( ( rule__Assertion__ValueAssignment_0_0_5 ) ) ;
    public final void rule__Assertion__Group_0_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2655:1: ( ( ( rule__Assertion__ValueAssignment_0_0_5 ) ) )
            // InternalProblem.g:2656:1: ( ( rule__Assertion__ValueAssignment_0_0_5 ) )
            {
            // InternalProblem.g:2656:1: ( ( rule__Assertion__ValueAssignment_0_0_5 ) )
            // InternalProblem.g:2657:2: ( rule__Assertion__ValueAssignment_0_0_5 )
            {
             before(grammarAccess.getAssertionAccess().getValueAssignment_0_0_5()); 
            // InternalProblem.g:2658:2: ( rule__Assertion__ValueAssignment_0_0_5 )
            // InternalProblem.g:2658:3: rule__Assertion__ValueAssignment_0_0_5
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__ValueAssignment_0_0_5();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getValueAssignment_0_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0__5__Impl"


    // $ANTLR start "rule__Assertion__Group_0_0_2__0"
    // InternalProblem.g:2667:1: rule__Assertion__Group_0_0_2__0 : rule__Assertion__Group_0_0_2__0__Impl rule__Assertion__Group_0_0_2__1 ;
    public final void rule__Assertion__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2671:1: ( rule__Assertion__Group_0_0_2__0__Impl rule__Assertion__Group_0_0_2__1 )
            // InternalProblem.g:2672:2: rule__Assertion__Group_0_0_2__0__Impl rule__Assertion__Group_0_0_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Assertion__Group_0_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0_2__0"


    // $ANTLR start "rule__Assertion__Group_0_0_2__0__Impl"
    // InternalProblem.g:2679:1: rule__Assertion__Group_0_0_2__0__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) ) ;
    public final void rule__Assertion__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2683:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) ) )
            // InternalProblem.g:2684:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) )
            {
            // InternalProblem.g:2684:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) )
            // InternalProblem.g:2685:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_0 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_0_2_0()); 
            // InternalProblem.g:2686:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_0 )
            // InternalProblem.g:2686:3: rule__Assertion__ArgumentsAssignment_0_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__ArgumentsAssignment_0_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0_2__0__Impl"


    // $ANTLR start "rule__Assertion__Group_0_0_2__1"
    // InternalProblem.g:2694:1: rule__Assertion__Group_0_0_2__1 : rule__Assertion__Group_0_0_2__1__Impl ;
    public final void rule__Assertion__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2698:1: ( rule__Assertion__Group_0_0_2__1__Impl )
            // InternalProblem.g:2699:2: rule__Assertion__Group_0_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0_2__1"


    // $ANTLR start "rule__Assertion__Group_0_0_2__1__Impl"
    // InternalProblem.g:2705:1: rule__Assertion__Group_0_0_2__1__Impl : ( ( rule__Assertion__Group_0_0_2_1__0 )* ) ;
    public final void rule__Assertion__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2709:1: ( ( ( rule__Assertion__Group_0_0_2_1__0 )* ) )
            // InternalProblem.g:2710:1: ( ( rule__Assertion__Group_0_0_2_1__0 )* )
            {
            // InternalProblem.g:2710:1: ( ( rule__Assertion__Group_0_0_2_1__0 )* )
            // InternalProblem.g:2711:2: ( rule__Assertion__Group_0_0_2_1__0 )*
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_0_2_1()); 
            // InternalProblem.g:2712:2: ( rule__Assertion__Group_0_0_2_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==25) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalProblem.g:2712:3: rule__Assertion__Group_0_0_2_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Assertion__Group_0_0_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getAssertionAccess().getGroup_0_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0_2__1__Impl"


    // $ANTLR start "rule__Assertion__Group_0_0_2_1__0"
    // InternalProblem.g:2721:1: rule__Assertion__Group_0_0_2_1__0 : rule__Assertion__Group_0_0_2_1__0__Impl rule__Assertion__Group_0_0_2_1__1 ;
    public final void rule__Assertion__Group_0_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2725:1: ( rule__Assertion__Group_0_0_2_1__0__Impl rule__Assertion__Group_0_0_2_1__1 )
            // InternalProblem.g:2726:2: rule__Assertion__Group_0_0_2_1__0__Impl rule__Assertion__Group_0_0_2_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Assertion__Group_0_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_0_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0_2_1__0"


    // $ANTLR start "rule__Assertion__Group_0_0_2_1__0__Impl"
    // InternalProblem.g:2733:1: rule__Assertion__Group_0_0_2_1__0__Impl : ( ',' ) ;
    public final void rule__Assertion__Group_0_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2737:1: ( ( ',' ) )
            // InternalProblem.g:2738:1: ( ',' )
            {
            // InternalProblem.g:2738:1: ( ',' )
            // InternalProblem.g:2739:2: ','
            {
             before(grammarAccess.getAssertionAccess().getCommaKeyword_0_0_2_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getCommaKeyword_0_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0_2_1__0__Impl"


    // $ANTLR start "rule__Assertion__Group_0_0_2_1__1"
    // InternalProblem.g:2748:1: rule__Assertion__Group_0_0_2_1__1 : rule__Assertion__Group_0_0_2_1__1__Impl ;
    public final void rule__Assertion__Group_0_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2752:1: ( rule__Assertion__Group_0_0_2_1__1__Impl )
            // InternalProblem.g:2753:2: rule__Assertion__Group_0_0_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_0_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0_2_1__1"


    // $ANTLR start "rule__Assertion__Group_0_0_2_1__1__Impl"
    // InternalProblem.g:2759:1: rule__Assertion__Group_0_0_2_1__1__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) ) ;
    public final void rule__Assertion__Group_0_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2763:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) ) )
            // InternalProblem.g:2764:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) )
            {
            // InternalProblem.g:2764:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) )
            // InternalProblem.g:2765:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_0_2_1_1()); 
            // InternalProblem.g:2766:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 )
            // InternalProblem.g:2766:3: rule__Assertion__ArgumentsAssignment_0_0_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__ArgumentsAssignment_0_0_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_0_2_1__1__Impl"


    // $ANTLR start "rule__Assertion__Group_0_1__0"
    // InternalProblem.g:2775:1: rule__Assertion__Group_0_1__0 : rule__Assertion__Group_0_1__0__Impl rule__Assertion__Group_0_1__1 ;
    public final void rule__Assertion__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2779:1: ( rule__Assertion__Group_0_1__0__Impl rule__Assertion__Group_0_1__1 )
            // InternalProblem.g:2780:2: rule__Assertion__Group_0_1__0__Impl rule__Assertion__Group_0_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Assertion__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1__0"


    // $ANTLR start "rule__Assertion__Group_0_1__0__Impl"
    // InternalProblem.g:2787:1: rule__Assertion__Group_0_1__0__Impl : ( ( rule__Assertion__ValueAssignment_0_1_0 )? ) ;
    public final void rule__Assertion__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2791:1: ( ( ( rule__Assertion__ValueAssignment_0_1_0 )? ) )
            // InternalProblem.g:2792:1: ( ( rule__Assertion__ValueAssignment_0_1_0 )? )
            {
            // InternalProblem.g:2792:1: ( ( rule__Assertion__ValueAssignment_0_1_0 )? )
            // InternalProblem.g:2793:2: ( rule__Assertion__ValueAssignment_0_1_0 )?
            {
             before(grammarAccess.getAssertionAccess().getValueAssignment_0_1_0()); 
            // InternalProblem.g:2794:2: ( rule__Assertion__ValueAssignment_0_1_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=18 && LA31_0<=19)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalProblem.g:2794:3: rule__Assertion__ValueAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assertion__ValueAssignment_0_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssertionAccess().getValueAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1__0__Impl"


    // $ANTLR start "rule__Assertion__Group_0_1__1"
    // InternalProblem.g:2802:1: rule__Assertion__Group_0_1__1 : rule__Assertion__Group_0_1__1__Impl rule__Assertion__Group_0_1__2 ;
    public final void rule__Assertion__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2806:1: ( rule__Assertion__Group_0_1__1__Impl rule__Assertion__Group_0_1__2 )
            // InternalProblem.g:2807:2: rule__Assertion__Group_0_1__1__Impl rule__Assertion__Group_0_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Assertion__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1__1"


    // $ANTLR start "rule__Assertion__Group_0_1__1__Impl"
    // InternalProblem.g:2814:1: rule__Assertion__Group_0_1__1__Impl : ( ( rule__Assertion__RelationAssignment_0_1_1 ) ) ;
    public final void rule__Assertion__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2818:1: ( ( ( rule__Assertion__RelationAssignment_0_1_1 ) ) )
            // InternalProblem.g:2819:1: ( ( rule__Assertion__RelationAssignment_0_1_1 ) )
            {
            // InternalProblem.g:2819:1: ( ( rule__Assertion__RelationAssignment_0_1_1 ) )
            // InternalProblem.g:2820:2: ( rule__Assertion__RelationAssignment_0_1_1 )
            {
             before(grammarAccess.getAssertionAccess().getRelationAssignment_0_1_1()); 
            // InternalProblem.g:2821:2: ( rule__Assertion__RelationAssignment_0_1_1 )
            // InternalProblem.g:2821:3: rule__Assertion__RelationAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__RelationAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getRelationAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1__1__Impl"


    // $ANTLR start "rule__Assertion__Group_0_1__2"
    // InternalProblem.g:2829:1: rule__Assertion__Group_0_1__2 : rule__Assertion__Group_0_1__2__Impl rule__Assertion__Group_0_1__3 ;
    public final void rule__Assertion__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2833:1: ( rule__Assertion__Group_0_1__2__Impl rule__Assertion__Group_0_1__3 )
            // InternalProblem.g:2834:2: rule__Assertion__Group_0_1__2__Impl rule__Assertion__Group_0_1__3
            {
            pushFollow(FOLLOW_17);
            rule__Assertion__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1__2"


    // $ANTLR start "rule__Assertion__Group_0_1__2__Impl"
    // InternalProblem.g:2841:1: rule__Assertion__Group_0_1__2__Impl : ( '(' ) ;
    public final void rule__Assertion__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2845:1: ( ( '(' ) )
            // InternalProblem.g:2846:1: ( '(' )
            {
            // InternalProblem.g:2846:1: ( '(' )
            // InternalProblem.g:2847:2: '('
            {
             before(grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_1_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1__2__Impl"


    // $ANTLR start "rule__Assertion__Group_0_1__3"
    // InternalProblem.g:2856:1: rule__Assertion__Group_0_1__3 : rule__Assertion__Group_0_1__3__Impl rule__Assertion__Group_0_1__4 ;
    public final void rule__Assertion__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2860:1: ( rule__Assertion__Group_0_1__3__Impl rule__Assertion__Group_0_1__4 )
            // InternalProblem.g:2861:2: rule__Assertion__Group_0_1__3__Impl rule__Assertion__Group_0_1__4
            {
            pushFollow(FOLLOW_17);
            rule__Assertion__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1__3"


    // $ANTLR start "rule__Assertion__Group_0_1__3__Impl"
    // InternalProblem.g:2868:1: rule__Assertion__Group_0_1__3__Impl : ( ( rule__Assertion__Group_0_1_3__0 )? ) ;
    public final void rule__Assertion__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2872:1: ( ( ( rule__Assertion__Group_0_1_3__0 )? ) )
            // InternalProblem.g:2873:1: ( ( rule__Assertion__Group_0_1_3__0 )? )
            {
            // InternalProblem.g:2873:1: ( ( rule__Assertion__Group_0_1_3__0 )? )
            // InternalProblem.g:2874:2: ( rule__Assertion__Group_0_1_3__0 )?
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_1_3()); 
            // InternalProblem.g:2875:2: ( rule__Assertion__Group_0_1_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalProblem.g:2875:3: rule__Assertion__Group_0_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assertion__Group_0_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssertionAccess().getGroup_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1__3__Impl"


    // $ANTLR start "rule__Assertion__Group_0_1__4"
    // InternalProblem.g:2883:1: rule__Assertion__Group_0_1__4 : rule__Assertion__Group_0_1__4__Impl ;
    public final void rule__Assertion__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2887:1: ( rule__Assertion__Group_0_1__4__Impl )
            // InternalProblem.g:2888:2: rule__Assertion__Group_0_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1__4"


    // $ANTLR start "rule__Assertion__Group_0_1__4__Impl"
    // InternalProblem.g:2894:1: rule__Assertion__Group_0_1__4__Impl : ( ')' ) ;
    public final void rule__Assertion__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2898:1: ( ( ')' ) )
            // InternalProblem.g:2899:1: ( ')' )
            {
            // InternalProblem.g:2899:1: ( ')' )
            // InternalProblem.g:2900:2: ')'
            {
             before(grammarAccess.getAssertionAccess().getRightParenthesisKeyword_0_1_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getRightParenthesisKeyword_0_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1__4__Impl"


    // $ANTLR start "rule__Assertion__Group_0_1_3__0"
    // InternalProblem.g:2910:1: rule__Assertion__Group_0_1_3__0 : rule__Assertion__Group_0_1_3__0__Impl rule__Assertion__Group_0_1_3__1 ;
    public final void rule__Assertion__Group_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2914:1: ( rule__Assertion__Group_0_1_3__0__Impl rule__Assertion__Group_0_1_3__1 )
            // InternalProblem.g:2915:2: rule__Assertion__Group_0_1_3__0__Impl rule__Assertion__Group_0_1_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Assertion__Group_0_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1_3__0"


    // $ANTLR start "rule__Assertion__Group_0_1_3__0__Impl"
    // InternalProblem.g:2922:1: rule__Assertion__Group_0_1_3__0__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) ) ;
    public final void rule__Assertion__Group_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2926:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) ) )
            // InternalProblem.g:2927:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) )
            {
            // InternalProblem.g:2927:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) )
            // InternalProblem.g:2928:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_0 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_1_3_0()); 
            // InternalProblem.g:2929:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_0 )
            // InternalProblem.g:2929:3: rule__Assertion__ArgumentsAssignment_0_1_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__ArgumentsAssignment_0_1_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1_3__0__Impl"


    // $ANTLR start "rule__Assertion__Group_0_1_3__1"
    // InternalProblem.g:2937:1: rule__Assertion__Group_0_1_3__1 : rule__Assertion__Group_0_1_3__1__Impl ;
    public final void rule__Assertion__Group_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2941:1: ( rule__Assertion__Group_0_1_3__1__Impl )
            // InternalProblem.g:2942:2: rule__Assertion__Group_0_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1_3__1"


    // $ANTLR start "rule__Assertion__Group_0_1_3__1__Impl"
    // InternalProblem.g:2948:1: rule__Assertion__Group_0_1_3__1__Impl : ( ( rule__Assertion__Group_0_1_3_1__0 )* ) ;
    public final void rule__Assertion__Group_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2952:1: ( ( ( rule__Assertion__Group_0_1_3_1__0 )* ) )
            // InternalProblem.g:2953:1: ( ( rule__Assertion__Group_0_1_3_1__0 )* )
            {
            // InternalProblem.g:2953:1: ( ( rule__Assertion__Group_0_1_3_1__0 )* )
            // InternalProblem.g:2954:2: ( rule__Assertion__Group_0_1_3_1__0 )*
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_1_3_1()); 
            // InternalProblem.g:2955:2: ( rule__Assertion__Group_0_1_3_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==25) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalProblem.g:2955:3: rule__Assertion__Group_0_1_3_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Assertion__Group_0_1_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getAssertionAccess().getGroup_0_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1_3__1__Impl"


    // $ANTLR start "rule__Assertion__Group_0_1_3_1__0"
    // InternalProblem.g:2964:1: rule__Assertion__Group_0_1_3_1__0 : rule__Assertion__Group_0_1_3_1__0__Impl rule__Assertion__Group_0_1_3_1__1 ;
    public final void rule__Assertion__Group_0_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2968:1: ( rule__Assertion__Group_0_1_3_1__0__Impl rule__Assertion__Group_0_1_3_1__1 )
            // InternalProblem.g:2969:2: rule__Assertion__Group_0_1_3_1__0__Impl rule__Assertion__Group_0_1_3_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Assertion__Group_0_1_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_1_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1_3_1__0"


    // $ANTLR start "rule__Assertion__Group_0_1_3_1__0__Impl"
    // InternalProblem.g:2976:1: rule__Assertion__Group_0_1_3_1__0__Impl : ( ',' ) ;
    public final void rule__Assertion__Group_0_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2980:1: ( ( ',' ) )
            // InternalProblem.g:2981:1: ( ',' )
            {
            // InternalProblem.g:2981:1: ( ',' )
            // InternalProblem.g:2982:2: ','
            {
             before(grammarAccess.getAssertionAccess().getCommaKeyword_0_1_3_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getCommaKeyword_0_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1_3_1__0__Impl"


    // $ANTLR start "rule__Assertion__Group_0_1_3_1__1"
    // InternalProblem.g:2991:1: rule__Assertion__Group_0_1_3_1__1 : rule__Assertion__Group_0_1_3_1__1__Impl ;
    public final void rule__Assertion__Group_0_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2995:1: ( rule__Assertion__Group_0_1_3_1__1__Impl )
            // InternalProblem.g:2996:2: rule__Assertion__Group_0_1_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group_0_1_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1_3_1__1"


    // $ANTLR start "rule__Assertion__Group_0_1_3_1__1__Impl"
    // InternalProblem.g:3002:1: rule__Assertion__Group_0_1_3_1__1__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) ) ;
    public final void rule__Assertion__Group_0_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3006:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) ) )
            // InternalProblem.g:3007:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) )
            {
            // InternalProblem.g:3007:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) )
            // InternalProblem.g:3008:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_1_3_1_1()); 
            // InternalProblem.g:3009:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 )
            // InternalProblem.g:3009:3: rule__Assertion__ArgumentsAssignment_0_1_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__ArgumentsAssignment_0_1_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_1_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group_0_1_3_1__1__Impl"


    // $ANTLR start "rule__ScopeDeclaration__Group__0"
    // InternalProblem.g:3018:1: rule__ScopeDeclaration__Group__0 : rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1 ;
    public final void rule__ScopeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3022:1: ( rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1 )
            // InternalProblem.g:3023:2: rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ScopeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScopeDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group__0"


    // $ANTLR start "rule__ScopeDeclaration__Group__0__Impl"
    // InternalProblem.g:3030:1: rule__ScopeDeclaration__Group__0__Impl : ( 'scope' ) ;
    public final void rule__ScopeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3034:1: ( ( 'scope' ) )
            // InternalProblem.g:3035:1: ( 'scope' )
            {
            // InternalProblem.g:3035:1: ( 'scope' )
            // InternalProblem.g:3036:2: 'scope'
            {
             before(grammarAccess.getScopeDeclarationAccess().getScopeKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getScopeDeclarationAccess().getScopeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ScopeDeclaration__Group__1"
    // InternalProblem.g:3045:1: rule__ScopeDeclaration__Group__1 : rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2 ;
    public final void rule__ScopeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3049:1: ( rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2 )
            // InternalProblem.g:3050:2: rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__ScopeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScopeDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group__1"


    // $ANTLR start "rule__ScopeDeclaration__Group__1__Impl"
    // InternalProblem.g:3057:1: rule__ScopeDeclaration__Group__1__Impl : ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) ) ;
    public final void rule__ScopeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3061:1: ( ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) ) )
            // InternalProblem.g:3062:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) )
            {
            // InternalProblem.g:3062:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) )
            // InternalProblem.g:3063:2: ( rule__ScopeDeclaration__TypeScopesAssignment_1 )
            {
             before(grammarAccess.getScopeDeclarationAccess().getTypeScopesAssignment_1()); 
            // InternalProblem.g:3064:2: ( rule__ScopeDeclaration__TypeScopesAssignment_1 )
            // InternalProblem.g:3064:3: rule__ScopeDeclaration__TypeScopesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ScopeDeclaration__TypeScopesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScopeDeclarationAccess().getTypeScopesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ScopeDeclaration__Group__2"
    // InternalProblem.g:3072:1: rule__ScopeDeclaration__Group__2 : rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3 ;
    public final void rule__ScopeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3076:1: ( rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3 )
            // InternalProblem.g:3077:2: rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__ScopeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScopeDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group__2"


    // $ANTLR start "rule__ScopeDeclaration__Group__2__Impl"
    // InternalProblem.g:3084:1: rule__ScopeDeclaration__Group__2__Impl : ( ( rule__ScopeDeclaration__Group_2__0 )* ) ;
    public final void rule__ScopeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3088:1: ( ( ( rule__ScopeDeclaration__Group_2__0 )* ) )
            // InternalProblem.g:3089:1: ( ( rule__ScopeDeclaration__Group_2__0 )* )
            {
            // InternalProblem.g:3089:1: ( ( rule__ScopeDeclaration__Group_2__0 )* )
            // InternalProblem.g:3090:2: ( rule__ScopeDeclaration__Group_2__0 )*
            {
             before(grammarAccess.getScopeDeclarationAccess().getGroup_2()); 
            // InternalProblem.g:3091:2: ( rule__ScopeDeclaration__Group_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==25) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalProblem.g:3091:3: rule__ScopeDeclaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ScopeDeclaration__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getScopeDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ScopeDeclaration__Group__3"
    // InternalProblem.g:3099:1: rule__ScopeDeclaration__Group__3 : rule__ScopeDeclaration__Group__3__Impl ;
    public final void rule__ScopeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3103:1: ( rule__ScopeDeclaration__Group__3__Impl )
            // InternalProblem.g:3104:2: rule__ScopeDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScopeDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group__3"


    // $ANTLR start "rule__ScopeDeclaration__Group__3__Impl"
    // InternalProblem.g:3110:1: rule__ScopeDeclaration__Group__3__Impl : ( '.' ) ;
    public final void rule__ScopeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3114:1: ( ( '.' ) )
            // InternalProblem.g:3115:1: ( '.' )
            {
            // InternalProblem.g:3115:1: ( '.' )
            // InternalProblem.g:3116:2: '.'
            {
             before(grammarAccess.getScopeDeclarationAccess().getFullStopKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScopeDeclarationAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ScopeDeclaration__Group_2__0"
    // InternalProblem.g:3126:1: rule__ScopeDeclaration__Group_2__0 : rule__ScopeDeclaration__Group_2__0__Impl rule__ScopeDeclaration__Group_2__1 ;
    public final void rule__ScopeDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3130:1: ( rule__ScopeDeclaration__Group_2__0__Impl rule__ScopeDeclaration__Group_2__1 )
            // InternalProblem.g:3131:2: rule__ScopeDeclaration__Group_2__0__Impl rule__ScopeDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ScopeDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScopeDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group_2__0"


    // $ANTLR start "rule__ScopeDeclaration__Group_2__0__Impl"
    // InternalProblem.g:3138:1: rule__ScopeDeclaration__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ScopeDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3142:1: ( ( ',' ) )
            // InternalProblem.g:3143:1: ( ',' )
            {
            // InternalProblem.g:3143:1: ( ',' )
            // InternalProblem.g:3144:2: ','
            {
             before(grammarAccess.getScopeDeclarationAccess().getCommaKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getScopeDeclarationAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__ScopeDeclaration__Group_2__1"
    // InternalProblem.g:3153:1: rule__ScopeDeclaration__Group_2__1 : rule__ScopeDeclaration__Group_2__1__Impl ;
    public final void rule__ScopeDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3157:1: ( rule__ScopeDeclaration__Group_2__1__Impl )
            // InternalProblem.g:3158:2: rule__ScopeDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScopeDeclaration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group_2__1"


    // $ANTLR start "rule__ScopeDeclaration__Group_2__1__Impl"
    // InternalProblem.g:3164:1: rule__ScopeDeclaration__Group_2__1__Impl : ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) ) ;
    public final void rule__ScopeDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3168:1: ( ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) ) )
            // InternalProblem.g:3169:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) )
            {
            // InternalProblem.g:3169:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) )
            // InternalProblem.g:3170:2: ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 )
            {
             before(grammarAccess.getScopeDeclarationAccess().getTypeScopesAssignment_2_1()); 
            // InternalProblem.g:3171:2: ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 )
            // InternalProblem.g:3171:3: rule__ScopeDeclaration__TypeScopesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ScopeDeclaration__TypeScopesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getScopeDeclarationAccess().getTypeScopesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__TypeScope__Group__0"
    // InternalProblem.g:3180:1: rule__TypeScope__Group__0 : rule__TypeScope__Group__0__Impl rule__TypeScope__Group__1 ;
    public final void rule__TypeScope__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3184:1: ( rule__TypeScope__Group__0__Impl rule__TypeScope__Group__1 )
            // InternalProblem.g:3185:2: rule__TypeScope__Group__0__Impl rule__TypeScope__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__TypeScope__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeScope__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeScope__Group__0"


    // $ANTLR start "rule__TypeScope__Group__0__Impl"
    // InternalProblem.g:3192:1: rule__TypeScope__Group__0__Impl : ( ( rule__TypeScope__TargetTypeAssignment_0 ) ) ;
    public final void rule__TypeScope__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3196:1: ( ( ( rule__TypeScope__TargetTypeAssignment_0 ) ) )
            // InternalProblem.g:3197:1: ( ( rule__TypeScope__TargetTypeAssignment_0 ) )
            {
            // InternalProblem.g:3197:1: ( ( rule__TypeScope__TargetTypeAssignment_0 ) )
            // InternalProblem.g:3198:2: ( rule__TypeScope__TargetTypeAssignment_0 )
            {
             before(grammarAccess.getTypeScopeAccess().getTargetTypeAssignment_0()); 
            // InternalProblem.g:3199:2: ( rule__TypeScope__TargetTypeAssignment_0 )
            // InternalProblem.g:3199:3: rule__TypeScope__TargetTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeScope__TargetTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeScopeAccess().getTargetTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeScope__Group__0__Impl"


    // $ANTLR start "rule__TypeScope__Group__1"
    // InternalProblem.g:3207:1: rule__TypeScope__Group__1 : rule__TypeScope__Group__1__Impl rule__TypeScope__Group__2 ;
    public final void rule__TypeScope__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3211:1: ( rule__TypeScope__Group__1__Impl rule__TypeScope__Group__2 )
            // InternalProblem.g:3212:2: rule__TypeScope__Group__1__Impl rule__TypeScope__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__TypeScope__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeScope__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeScope__Group__1"


    // $ANTLR start "rule__TypeScope__Group__1__Impl"
    // InternalProblem.g:3219:1: rule__TypeScope__Group__1__Impl : ( ( rule__TypeScope__Alternatives_1 ) ) ;
    public final void rule__TypeScope__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3223:1: ( ( ( rule__TypeScope__Alternatives_1 ) ) )
            // InternalProblem.g:3224:1: ( ( rule__TypeScope__Alternatives_1 ) )
            {
            // InternalProblem.g:3224:1: ( ( rule__TypeScope__Alternatives_1 ) )
            // InternalProblem.g:3225:2: ( rule__TypeScope__Alternatives_1 )
            {
             before(grammarAccess.getTypeScopeAccess().getAlternatives_1()); 
            // InternalProblem.g:3226:2: ( rule__TypeScope__Alternatives_1 )
            // InternalProblem.g:3226:3: rule__TypeScope__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeScope__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeScopeAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeScope__Group__1__Impl"


    // $ANTLR start "rule__TypeScope__Group__2"
    // InternalProblem.g:3234:1: rule__TypeScope__Group__2 : rule__TypeScope__Group__2__Impl ;
    public final void rule__TypeScope__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3238:1: ( rule__TypeScope__Group__2__Impl )
            // InternalProblem.g:3239:2: rule__TypeScope__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeScope__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeScope__Group__2"


    // $ANTLR start "rule__TypeScope__Group__2__Impl"
    // InternalProblem.g:3245:1: rule__TypeScope__Group__2__Impl : ( ( rule__TypeScope__MultiplicityAssignment_2 ) ) ;
    public final void rule__TypeScope__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3249:1: ( ( ( rule__TypeScope__MultiplicityAssignment_2 ) ) )
            // InternalProblem.g:3250:1: ( ( rule__TypeScope__MultiplicityAssignment_2 ) )
            {
            // InternalProblem.g:3250:1: ( ( rule__TypeScope__MultiplicityAssignment_2 ) )
            // InternalProblem.g:3251:2: ( rule__TypeScope__MultiplicityAssignment_2 )
            {
             before(grammarAccess.getTypeScopeAccess().getMultiplicityAssignment_2()); 
            // InternalProblem.g:3252:2: ( rule__TypeScope__MultiplicityAssignment_2 )
            // InternalProblem.g:3252:3: rule__TypeScope__MultiplicityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TypeScope__MultiplicityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeScopeAccess().getMultiplicityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeScope__Group__2__Impl"


    // $ANTLR start "rule__RangeMultiplicity__Group__0"
    // InternalProblem.g:3261:1: rule__RangeMultiplicity__Group__0 : rule__RangeMultiplicity__Group__0__Impl rule__RangeMultiplicity__Group__1 ;
    public final void rule__RangeMultiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3265:1: ( rule__RangeMultiplicity__Group__0__Impl rule__RangeMultiplicity__Group__1 )
            // InternalProblem.g:3266:2: rule__RangeMultiplicity__Group__0__Impl rule__RangeMultiplicity__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__RangeMultiplicity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeMultiplicity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeMultiplicity__Group__0"


    // $ANTLR start "rule__RangeMultiplicity__Group__0__Impl"
    // InternalProblem.g:3273:1: rule__RangeMultiplicity__Group__0__Impl : ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) ) ;
    public final void rule__RangeMultiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3277:1: ( ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) ) )
            // InternalProblem.g:3278:1: ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) )
            {
            // InternalProblem.g:3278:1: ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) )
            // InternalProblem.g:3279:2: ( rule__RangeMultiplicity__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getRangeMultiplicityAccess().getLowerBoundAssignment_0()); 
            // InternalProblem.g:3280:2: ( rule__RangeMultiplicity__LowerBoundAssignment_0 )
            // InternalProblem.g:3280:3: rule__RangeMultiplicity__LowerBoundAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RangeMultiplicity__LowerBoundAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRangeMultiplicityAccess().getLowerBoundAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeMultiplicity__Group__0__Impl"


    // $ANTLR start "rule__RangeMultiplicity__Group__1"
    // InternalProblem.g:3288:1: rule__RangeMultiplicity__Group__1 : rule__RangeMultiplicity__Group__1__Impl rule__RangeMultiplicity__Group__2 ;
    public final void rule__RangeMultiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3292:1: ( rule__RangeMultiplicity__Group__1__Impl rule__RangeMultiplicity__Group__2 )
            // InternalProblem.g:3293:2: rule__RangeMultiplicity__Group__1__Impl rule__RangeMultiplicity__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__RangeMultiplicity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeMultiplicity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeMultiplicity__Group__1"


    // $ANTLR start "rule__RangeMultiplicity__Group__1__Impl"
    // InternalProblem.g:3300:1: rule__RangeMultiplicity__Group__1__Impl : ( '..' ) ;
    public final void rule__RangeMultiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3304:1: ( ( '..' ) )
            // InternalProblem.g:3305:1: ( '..' )
            {
            // InternalProblem.g:3305:1: ( '..' )
            // InternalProblem.g:3306:2: '..'
            {
             before(grammarAccess.getRangeMultiplicityAccess().getFullStopFullStopKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRangeMultiplicityAccess().getFullStopFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeMultiplicity__Group__1__Impl"


    // $ANTLR start "rule__RangeMultiplicity__Group__2"
    // InternalProblem.g:3315:1: rule__RangeMultiplicity__Group__2 : rule__RangeMultiplicity__Group__2__Impl ;
    public final void rule__RangeMultiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3319:1: ( rule__RangeMultiplicity__Group__2__Impl )
            // InternalProblem.g:3320:2: rule__RangeMultiplicity__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RangeMultiplicity__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeMultiplicity__Group__2"


    // $ANTLR start "rule__RangeMultiplicity__Group__2__Impl"
    // InternalProblem.g:3326:1: rule__RangeMultiplicity__Group__2__Impl : ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) ) ;
    public final void rule__RangeMultiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3330:1: ( ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) ) )
            // InternalProblem.g:3331:1: ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) )
            {
            // InternalProblem.g:3331:1: ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) )
            // InternalProblem.g:3332:2: ( rule__RangeMultiplicity__UpperBoundAssignment_2 )
            {
             before(grammarAccess.getRangeMultiplicityAccess().getUpperBoundAssignment_2()); 
            // InternalProblem.g:3333:2: ( rule__RangeMultiplicity__UpperBoundAssignment_2 )
            // InternalProblem.g:3333:3: rule__RangeMultiplicity__UpperBoundAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RangeMultiplicity__UpperBoundAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRangeMultiplicityAccess().getUpperBoundAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeMultiplicity__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalProblem.g:3342:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3346:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalProblem.g:3347:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalProblem.g:3354:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3358:1: ( ( RULE_ID ) )
            // InternalProblem.g:3359:1: ( RULE_ID )
            {
            // InternalProblem.g:3359:1: ( RULE_ID )
            // InternalProblem.g:3360:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalProblem.g:3369:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3373:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalProblem.g:3374:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalProblem.g:3380:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3384:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalProblem.g:3385:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalProblem.g:3385:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalProblem.g:3386:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalProblem.g:3387:2: ( rule__QualifiedName__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==34) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalProblem.g:3387:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalProblem.g:3396:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3400:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalProblem.g:3401:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalProblem.g:3408:1: rule__QualifiedName__Group_1__0__Impl : ( '::' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3412:1: ( ( '::' ) )
            // InternalProblem.g:3413:1: ( '::' )
            {
            // InternalProblem.g:3413:1: ( '::' )
            // InternalProblem.g:3414:2: '::'
            {
             before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalProblem.g:3423:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3427:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalProblem.g:3428:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalProblem.g:3434:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3438:1: ( ( RULE_ID ) )
            // InternalProblem.g:3439:1: ( RULE_ID )
            {
            // InternalProblem.g:3439:1: ( RULE_ID )
            // InternalProblem.g:3440:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Problem__StatementsAssignment"
    // InternalProblem.g:3450:1: rule__Problem__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Problem__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3454:1: ( ( ruleStatement ) )
            // InternalProblem.g:3455:2: ( ruleStatement )
            {
            // InternalProblem.g:3455:2: ( ruleStatement )
            // InternalProblem.g:3456:3: ruleStatement
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


    // $ANTLR start "rule__ClassDeclaration__AbstractAssignment_0"
    // InternalProblem.g:3465:1: rule__ClassDeclaration__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ClassDeclaration__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3469:1: ( ( ( 'abstract' ) ) )
            // InternalProblem.g:3470:2: ( ( 'abstract' ) )
            {
            // InternalProblem.g:3470:2: ( ( 'abstract' ) )
            // InternalProblem.g:3471:3: ( 'abstract' )
            {
             before(grammarAccess.getClassDeclarationAccess().getAbstractAbstractKeyword_0_0()); 
            // InternalProblem.g:3472:3: ( 'abstract' )
            // InternalProblem.g:3473:4: 'abstract'
            {
             before(grammarAccess.getClassDeclarationAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getClassDeclarationAccess().getAbstractAbstractKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__AbstractAssignment_0"


    // $ANTLR start "rule__ClassDeclaration__NameAssignment_2"
    // InternalProblem.g:3484:1: rule__ClassDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ClassDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3488:1: ( ( RULE_ID ) )
            // InternalProblem.g:3489:2: ( RULE_ID )
            {
            // InternalProblem.g:3489:2: ( RULE_ID )
            // InternalProblem.g:3490:3: RULE_ID
            {
             before(grammarAccess.getClassDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__NameAssignment_2"


    // $ANTLR start "rule__ClassDeclaration__SuperTypesAssignment_3_0_1_0"
    // InternalProblem.g:3499:1: rule__ClassDeclaration__SuperTypesAssignment_3_0_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__ClassDeclaration__SuperTypesAssignment_3_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3503:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:3504:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:3504:2: ( ( RULE_ID ) )
            // InternalProblem.g:3505:3: ( RULE_ID )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationCrossReference_3_0_1_0_0()); 
            // InternalProblem.g:3506:3: ( RULE_ID )
            // InternalProblem.g:3507:4: RULE_ID
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationIDTerminalRuleCall_3_0_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationIDTerminalRuleCall_3_0_1_0_0_1()); 

            }

             after(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationCrossReference_3_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__SuperTypesAssignment_3_0_1_0"


    // $ANTLR start "rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_0"
    // InternalProblem.g:3518:1: rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3522:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:3523:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:3523:2: ( ( RULE_ID ) )
            // InternalProblem.g:3524:3: ( RULE_ID )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationCrossReference_3_0_1_1_1_0_0()); 
            // InternalProblem.g:3525:3: ( RULE_ID )
            // InternalProblem.g:3526:4: RULE_ID
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationIDTerminalRuleCall_3_0_1_1_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationIDTerminalRuleCall_3_0_1_1_1_0_0_1()); 

            }

             after(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationCrossReference_3_0_1_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_0"


    // $ANTLR start "rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_1_1"
    // InternalProblem.g:3537:1: rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3541:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:3542:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:3542:2: ( ( RULE_ID ) )
            // InternalProblem.g:3543:3: ( RULE_ID )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationCrossReference_3_0_1_1_1_1_1_0()); 
            // InternalProblem.g:3544:3: ( RULE_ID )
            // InternalProblem.g:3545:4: RULE_ID
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationIDTerminalRuleCall_3_0_1_1_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationIDTerminalRuleCall_3_0_1_1_1_1_1_0_1()); 

            }

             after(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationCrossReference_3_0_1_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__SuperTypesAssignment_3_0_1_1_1_1_1"


    // $ANTLR start "rule__ClassDeclaration__ReferenceDeclarationsAssignment_3_1"
    // InternalProblem.g:3556:1: rule__ClassDeclaration__ReferenceDeclarationsAssignment_3_1 : ( ruleReferenceDeclaration ) ;
    public final void rule__ClassDeclaration__ReferenceDeclarationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3560:1: ( ( ruleReferenceDeclaration ) )
            // InternalProblem.g:3561:2: ( ruleReferenceDeclaration )
            {
            // InternalProblem.g:3561:2: ( ruleReferenceDeclaration )
            // InternalProblem.g:3562:3: ruleReferenceDeclaration
            {
             before(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsReferenceDeclarationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReferenceDeclaration();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsReferenceDeclarationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__ReferenceDeclarationsAssignment_3_1"


    // $ANTLR start "rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_1"
    // InternalProblem.g:3571:1: rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_1 : ( ruleReferenceDeclaration ) ;
    public final void rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3575:1: ( ( ruleReferenceDeclaration ) )
            // InternalProblem.g:3576:2: ( ruleReferenceDeclaration )
            {
            // InternalProblem.g:3576:2: ( ruleReferenceDeclaration )
            // InternalProblem.g:3577:3: ruleReferenceDeclaration
            {
             before(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsReferenceDeclarationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReferenceDeclaration();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsReferenceDeclarationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_1"


    // $ANTLR start "rule__ReferenceDeclaration__ContainmentAssignment_0_0"
    // InternalProblem.g:3586:1: rule__ReferenceDeclaration__ContainmentAssignment_0_0 : ( ( 'contains' ) ) ;
    public final void rule__ReferenceDeclaration__ContainmentAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3590:1: ( ( ( 'contains' ) ) )
            // InternalProblem.g:3591:2: ( ( 'contains' ) )
            {
            // InternalProblem.g:3591:2: ( ( 'contains' ) )
            // InternalProblem.g:3592:3: ( 'contains' )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getContainmentContainsKeyword_0_0_0()); 
            // InternalProblem.g:3593:3: ( 'contains' )
            // InternalProblem.g:3594:4: 'contains'
            {
             before(grammarAccess.getReferenceDeclarationAccess().getContainmentContainsKeyword_0_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getReferenceDeclarationAccess().getContainmentContainsKeyword_0_0_0()); 

            }

             after(grammarAccess.getReferenceDeclarationAccess().getContainmentContainsKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__ContainmentAssignment_0_0"


    // $ANTLR start "rule__ReferenceDeclaration__ReferenceTypeAssignment_1"
    // InternalProblem.g:3605:1: rule__ReferenceDeclaration__ReferenceTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceDeclaration__ReferenceTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3609:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:3610:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:3610:2: ( ( RULE_ID ) )
            // InternalProblem.g:3611:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeClassDeclarationCrossReference_1_0()); 
            // InternalProblem.g:3612:3: ( RULE_ID )
            // InternalProblem.g:3613:4: RULE_ID
            {
             before(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeClassDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeClassDeclarationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeClassDeclarationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__ReferenceTypeAssignment_1"


    // $ANTLR start "rule__ReferenceDeclaration__MultiplicityAssignment_3"
    // InternalProblem.g:3624:1: rule__ReferenceDeclaration__MultiplicityAssignment_3 : ( ruleMultiplicity ) ;
    public final void rule__ReferenceDeclaration__MultiplicityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3628:1: ( ( ruleMultiplicity ) )
            // InternalProblem.g:3629:2: ( ruleMultiplicity )
            {
            // InternalProblem.g:3629:2: ( ruleMultiplicity )
            // InternalProblem.g:3630:3: ruleMultiplicity
            {
             before(grammarAccess.getReferenceDeclarationAccess().getMultiplicityMultiplicityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getReferenceDeclarationAccess().getMultiplicityMultiplicityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__MultiplicityAssignment_3"


    // $ANTLR start "rule__ReferenceDeclaration__NameAssignment_5"
    // InternalProblem.g:3639:1: rule__ReferenceDeclaration__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__ReferenceDeclaration__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3643:1: ( ( RULE_ID ) )
            // InternalProblem.g:3644:2: ( RULE_ID )
            {
            // InternalProblem.g:3644:2: ( RULE_ID )
            // InternalProblem.g:3645:3: RULE_ID
            {
             before(grammarAccess.getReferenceDeclarationAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceDeclarationAccess().getNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__NameAssignment_5"


    // $ANTLR start "rule__ReferenceDeclaration__OppositeAssignment_6_1"
    // InternalProblem.g:3654:1: rule__ReferenceDeclaration__OppositeAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceDeclaration__OppositeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3658:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:3659:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:3659:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:3660:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getOppositeReferenceDeclarationCrossReference_6_1_0()); 
            // InternalProblem.g:3661:3: ( ruleQualifiedName )
            // InternalProblem.g:3662:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceDeclarationAccess().getOppositeReferenceDeclarationQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceDeclarationAccess().getOppositeReferenceDeclarationQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getReferenceDeclarationAccess().getOppositeReferenceDeclarationCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__OppositeAssignment_6_1"


    // $ANTLR start "rule__PredicateDefinition__ErrorAssignment_0_0_0"
    // InternalProblem.g:3673:1: rule__PredicateDefinition__ErrorAssignment_0_0_0 : ( ( 'error' ) ) ;
    public final void rule__PredicateDefinition__ErrorAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3677:1: ( ( ( 'error' ) ) )
            // InternalProblem.g:3678:2: ( ( 'error' ) )
            {
            // InternalProblem.g:3678:2: ( ( 'error' ) )
            // InternalProblem.g:3679:3: ( 'error' )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_0_0_0()); 
            // InternalProblem.g:3680:3: ( 'error' )
            // InternalProblem.g:3681:4: 'error'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_0_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_0_0_0()); 

            }

             after(grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__ErrorAssignment_0_0_0"


    // $ANTLR start "rule__PredicateDefinition__NameAssignment_1"
    // InternalProblem.g:3692:1: rule__PredicateDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PredicateDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3696:1: ( ( RULE_ID ) )
            // InternalProblem.g:3697:2: ( RULE_ID )
            {
            // InternalProblem.g:3697:2: ( RULE_ID )
            // InternalProblem.g:3698:3: RULE_ID
            {
             before(grammarAccess.getPredicateDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPredicateDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__NameAssignment_1"


    // $ANTLR start "rule__PredicateDefinition__ParametersAssignment_3_0"
    // InternalProblem.g:3707:1: rule__PredicateDefinition__ParametersAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__PredicateDefinition__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3711:1: ( ( ruleParameter ) )
            // InternalProblem.g:3712:2: ( ruleParameter )
            {
            // InternalProblem.g:3712:2: ( ruleParameter )
            // InternalProblem.g:3713:3: ruleParameter
            {
             before(grammarAccess.getPredicateDefinitionAccess().getParametersParameterParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getPredicateDefinitionAccess().getParametersParameterParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__ParametersAssignment_3_0"


    // $ANTLR start "rule__PredicateDefinition__ParametersAssignment_3_1_1"
    // InternalProblem.g:3722:1: rule__PredicateDefinition__ParametersAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__PredicateDefinition__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3726:1: ( ( ruleParameter ) )
            // InternalProblem.g:3727:2: ( ruleParameter )
            {
            // InternalProblem.g:3727:2: ( ruleParameter )
            // InternalProblem.g:3728:3: ruleParameter
            {
             before(grammarAccess.getPredicateDefinitionAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getPredicateDefinitionAccess().getParametersParameterParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__ParametersAssignment_3_1_1"


    // $ANTLR start "rule__PredicateDefinition__BodiesAssignment_5_1"
    // InternalProblem.g:3737:1: rule__PredicateDefinition__BodiesAssignment_5_1 : ( ruleConjunction ) ;
    public final void rule__PredicateDefinition__BodiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3741:1: ( ( ruleConjunction ) )
            // InternalProblem.g:3742:2: ( ruleConjunction )
            {
            // InternalProblem.g:3742:2: ( ruleConjunction )
            // InternalProblem.g:3743:3: ruleConjunction
            {
             before(grammarAccess.getPredicateDefinitionAccess().getBodiesConjunctionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getPredicateDefinitionAccess().getBodiesConjunctionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__BodiesAssignment_5_1"


    // $ANTLR start "rule__PredicateDefinition__BodiesAssignment_5_2_1"
    // InternalProblem.g:3752:1: rule__PredicateDefinition__BodiesAssignment_5_2_1 : ( ruleConjunction ) ;
    public final void rule__PredicateDefinition__BodiesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3756:1: ( ( ruleConjunction ) )
            // InternalProblem.g:3757:2: ( ruleConjunction )
            {
            // InternalProblem.g:3757:2: ( ruleConjunction )
            // InternalProblem.g:3758:3: ruleConjunction
            {
             before(grammarAccess.getPredicateDefinitionAccess().getBodiesConjunctionParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getPredicateDefinitionAccess().getBodiesConjunctionParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredicateDefinition__BodiesAssignment_5_2_1"


    // $ANTLR start "rule__Parameter__ParameterTypeAssignment_0"
    // InternalProblem.g:3767:1: rule__Parameter__ParameterTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__ParameterTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3771:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:3772:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:3772:2: ( ( RULE_ID ) )
            // InternalProblem.g:3773:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getParameterTypeClassDeclarationCrossReference_0_0()); 
            // InternalProblem.g:3774:3: ( RULE_ID )
            // InternalProblem.g:3775:4: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getParameterTypeClassDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterTypeClassDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getParameterTypeClassDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ParameterTypeAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalProblem.g:3786:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3790:1: ( ( RULE_ID ) )
            // InternalProblem.g:3791:2: ( RULE_ID )
            {
            // InternalProblem.g:3791:2: ( RULE_ID )
            // InternalProblem.g:3792:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Conjunction__LiteralsAssignment_0"
    // InternalProblem.g:3801:1: rule__Conjunction__LiteralsAssignment_0 : ( ruleLiteral ) ;
    public final void rule__Conjunction__LiteralsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3805:1: ( ( ruleLiteral ) )
            // InternalProblem.g:3806:2: ( ruleLiteral )
            {
            // InternalProblem.g:3806:2: ( ruleLiteral )
            // InternalProblem.g:3807:3: ruleLiteral
            {
             before(grammarAccess.getConjunctionAccess().getLiteralsLiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getConjunctionAccess().getLiteralsLiteralParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__LiteralsAssignment_0"


    // $ANTLR start "rule__Conjunction__LiteralsAssignment_1_1"
    // InternalProblem.g:3816:1: rule__Conjunction__LiteralsAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__Conjunction__LiteralsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3820:1: ( ( ruleLiteral ) )
            // InternalProblem.g:3821:2: ( ruleLiteral )
            {
            // InternalProblem.g:3821:2: ( ruleLiteral )
            // InternalProblem.g:3822:3: ruleLiteral
            {
             before(grammarAccess.getConjunctionAccess().getLiteralsLiteralParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getConjunctionAccess().getLiteralsLiteralParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__LiteralsAssignment_1_1"


    // $ANTLR start "rule__NegativeLiteral__AtomAssignment_1"
    // InternalProblem.g:3831:1: rule__NegativeLiteral__AtomAssignment_1 : ( ruleAtom ) ;
    public final void rule__NegativeLiteral__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3835:1: ( ( ruleAtom ) )
            // InternalProblem.g:3836:2: ( ruleAtom )
            {
            // InternalProblem.g:3836:2: ( ruleAtom )
            // InternalProblem.g:3837:3: ruleAtom
            {
             before(grammarAccess.getNegativeLiteralAccess().getAtomAtomParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getNegativeLiteralAccess().getAtomAtomParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeLiteral__AtomAssignment_1"


    // $ANTLR start "rule__Atom__RelationAssignment_0"
    // InternalProblem.g:3846:1: rule__Atom__RelationAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Atom__RelationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3850:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:3851:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:3851:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:3852:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAtomAccess().getRelationRelationCrossReference_0_0()); 
            // InternalProblem.g:3853:3: ( ruleQualifiedName )
            // InternalProblem.g:3854:4: ruleQualifiedName
            {
             before(grammarAccess.getAtomAccess().getRelationRelationQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getRelationRelationQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAtomAccess().getRelationRelationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__RelationAssignment_0"


    // $ANTLR start "rule__Atom__TransitiveClosureAssignment_1"
    // InternalProblem.g:3865:1: rule__Atom__TransitiveClosureAssignment_1 : ( ( '+' ) ) ;
    public final void rule__Atom__TransitiveClosureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3869:1: ( ( ( '+' ) ) )
            // InternalProblem.g:3870:2: ( ( '+' ) )
            {
            // InternalProblem.g:3870:2: ( ( '+' ) )
            // InternalProblem.g:3871:3: ( '+' )
            {
             before(grammarAccess.getAtomAccess().getTransitiveClosurePlusSignKeyword_1_0()); 
            // InternalProblem.g:3872:3: ( '+' )
            // InternalProblem.g:3873:4: '+'
            {
             before(grammarAccess.getAtomAccess().getTransitiveClosurePlusSignKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getTransitiveClosurePlusSignKeyword_1_0()); 

            }

             after(grammarAccess.getAtomAccess().getTransitiveClosurePlusSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__TransitiveClosureAssignment_1"


    // $ANTLR start "rule__Atom__ArgumentsAssignment_3_0"
    // InternalProblem.g:3884:1: rule__Atom__ArgumentsAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__Atom__ArgumentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3888:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:3889:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:3889:2: ( ( RULE_ID ) )
            // InternalProblem.g:3890:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomAccess().getArgumentsVariableCrossReference_3_0_0()); 
            // InternalProblem.g:3891:3: ( RULE_ID )
            // InternalProblem.g:3892:4: RULE_ID
            {
             before(grammarAccess.getAtomAccess().getArgumentsVariableIDTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getArgumentsVariableIDTerminalRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getAtomAccess().getArgumentsVariableCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__ArgumentsAssignment_3_0"


    // $ANTLR start "rule__Atom__ArgumentsAssignment_3_1_1"
    // InternalProblem.g:3903:1: rule__Atom__ArgumentsAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atom__ArgumentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3907:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:3908:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:3908:2: ( ( RULE_ID ) )
            // InternalProblem.g:3909:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomAccess().getArgumentsVariableCrossReference_3_1_1_0()); 
            // InternalProblem.g:3910:3: ( RULE_ID )
            // InternalProblem.g:3911:4: RULE_ID
            {
             before(grammarAccess.getAtomAccess().getArgumentsVariableIDTerminalRuleCall_3_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getArgumentsVariableIDTerminalRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getAtomAccess().getArgumentsVariableCrossReference_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__ArgumentsAssignment_3_1_1"


    // $ANTLR start "rule__Assertion__RelationAssignment_0_0_0"
    // InternalProblem.g:3922:1: rule__Assertion__RelationAssignment_0_0_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__RelationAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3926:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:3927:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:3927:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:3928:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getRelationRelationCrossReference_0_0_0_0()); 
            // InternalProblem.g:3929:3: ( ruleQualifiedName )
            // InternalProblem.g:3930:4: ruleQualifiedName
            {
             before(grammarAccess.getAssertionAccess().getRelationRelationQualifiedNameParserRuleCall_0_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getRelationRelationQualifiedNameParserRuleCall_0_0_0_0_1()); 

            }

             after(grammarAccess.getAssertionAccess().getRelationRelationCrossReference_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__RelationAssignment_0_0_0"


    // $ANTLR start "rule__Assertion__ArgumentsAssignment_0_0_2_0"
    // InternalProblem.g:3941:1: rule__Assertion__ArgumentsAssignment_0_0_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3945:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:3946:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:3946:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:3947:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_0_2_0_0()); 
            // InternalProblem.g:3948:3: ( ruleQualifiedName )
            // InternalProblem.g:3949:4: ruleQualifiedName
            {
             before(grammarAccess.getAssertionAccess().getArgumentsNodeQualifiedNameParserRuleCall_0_0_2_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getArgumentsNodeQualifiedNameParserRuleCall_0_0_2_0_0_1()); 

            }

             after(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__ArgumentsAssignment_0_0_2_0"


    // $ANTLR start "rule__Assertion__ArgumentsAssignment_0_0_2_1_1"
    // InternalProblem.g:3960:1: rule__Assertion__ArgumentsAssignment_0_0_2_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3964:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:3965:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:3965:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:3966:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_0_2_1_1_0()); 
            // InternalProblem.g:3967:3: ( ruleQualifiedName )
            // InternalProblem.g:3968:4: ruleQualifiedName
            {
             before(grammarAccess.getAssertionAccess().getArgumentsNodeQualifiedNameParserRuleCall_0_0_2_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getArgumentsNodeQualifiedNameParserRuleCall_0_0_2_1_1_0_1()); 

            }

             after(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__ArgumentsAssignment_0_0_2_1_1"


    // $ANTLR start "rule__Assertion__ValueAssignment_0_0_5"
    // InternalProblem.g:3979:1: rule__Assertion__ValueAssignment_0_0_5 : ( ruleLogicValue ) ;
    public final void rule__Assertion__ValueAssignment_0_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3983:1: ( ( ruleLogicValue ) )
            // InternalProblem.g:3984:2: ( ruleLogicValue )
            {
            // InternalProblem.g:3984:2: ( ruleLogicValue )
            // InternalProblem.g:3985:3: ruleLogicValue
            {
             before(grammarAccess.getAssertionAccess().getValueLogicValueEnumRuleCall_0_0_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicValue();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getValueLogicValueEnumRuleCall_0_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__ValueAssignment_0_0_5"


    // $ANTLR start "rule__Assertion__ValueAssignment_0_1_0"
    // InternalProblem.g:3994:1: rule__Assertion__ValueAssignment_0_1_0 : ( ruleShortLogicValue ) ;
    public final void rule__Assertion__ValueAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3998:1: ( ( ruleShortLogicValue ) )
            // InternalProblem.g:3999:2: ( ruleShortLogicValue )
            {
            // InternalProblem.g:3999:2: ( ruleShortLogicValue )
            // InternalProblem.g:4000:3: ruleShortLogicValue
            {
             before(grammarAccess.getAssertionAccess().getValueShortLogicValueEnumRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleShortLogicValue();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getValueShortLogicValueEnumRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__ValueAssignment_0_1_0"


    // $ANTLR start "rule__Assertion__RelationAssignment_0_1_1"
    // InternalProblem.g:4009:1: rule__Assertion__RelationAssignment_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__RelationAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4013:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:4014:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:4014:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:4015:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getRelationRelationCrossReference_0_1_1_0()); 
            // InternalProblem.g:4016:3: ( ruleQualifiedName )
            // InternalProblem.g:4017:4: ruleQualifiedName
            {
             before(grammarAccess.getAssertionAccess().getRelationRelationQualifiedNameParserRuleCall_0_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getRelationRelationQualifiedNameParserRuleCall_0_1_1_0_1()); 

            }

             after(grammarAccess.getAssertionAccess().getRelationRelationCrossReference_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__RelationAssignment_0_1_1"


    // $ANTLR start "rule__Assertion__ArgumentsAssignment_0_1_3_0"
    // InternalProblem.g:4028:1: rule__Assertion__ArgumentsAssignment_0_1_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4032:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:4033:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:4033:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:4034:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_1_3_0_0()); 
            // InternalProblem.g:4035:3: ( ruleQualifiedName )
            // InternalProblem.g:4036:4: ruleQualifiedName
            {
             before(grammarAccess.getAssertionAccess().getArgumentsNodeQualifiedNameParserRuleCall_0_1_3_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getArgumentsNodeQualifiedNameParserRuleCall_0_1_3_0_0_1()); 

            }

             after(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_1_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__ArgumentsAssignment_0_1_3_0"


    // $ANTLR start "rule__Assertion__ArgumentsAssignment_0_1_3_1_1"
    // InternalProblem.g:4047:1: rule__Assertion__ArgumentsAssignment_0_1_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_1_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4051:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:4052:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:4052:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:4053:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_1_3_1_1_0()); 
            // InternalProblem.g:4054:3: ( ruleQualifiedName )
            // InternalProblem.g:4055:4: ruleQualifiedName
            {
             before(grammarAccess.getAssertionAccess().getArgumentsNodeQualifiedNameParserRuleCall_0_1_3_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getArgumentsNodeQualifiedNameParserRuleCall_0_1_3_1_1_0_1()); 

            }

             after(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_1_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__ArgumentsAssignment_0_1_3_1_1"


    // $ANTLR start "rule__ScopeDeclaration__TypeScopesAssignment_1"
    // InternalProblem.g:4066:1: rule__ScopeDeclaration__TypeScopesAssignment_1 : ( ruleTypeScope ) ;
    public final void rule__ScopeDeclaration__TypeScopesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4070:1: ( ( ruleTypeScope ) )
            // InternalProblem.g:4071:2: ( ruleTypeScope )
            {
            // InternalProblem.g:4071:2: ( ruleTypeScope )
            // InternalProblem.g:4072:3: ruleTypeScope
            {
             before(grammarAccess.getScopeDeclarationAccess().getTypeScopesTypeScopeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeScope();

            state._fsp--;

             after(grammarAccess.getScopeDeclarationAccess().getTypeScopesTypeScopeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__TypeScopesAssignment_1"


    // $ANTLR start "rule__ScopeDeclaration__TypeScopesAssignment_2_1"
    // InternalProblem.g:4081:1: rule__ScopeDeclaration__TypeScopesAssignment_2_1 : ( ruleTypeScope ) ;
    public final void rule__ScopeDeclaration__TypeScopesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4085:1: ( ( ruleTypeScope ) )
            // InternalProblem.g:4086:2: ( ruleTypeScope )
            {
            // InternalProblem.g:4086:2: ( ruleTypeScope )
            // InternalProblem.g:4087:3: ruleTypeScope
            {
             before(grammarAccess.getScopeDeclarationAccess().getTypeScopesTypeScopeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeScope();

            state._fsp--;

             after(grammarAccess.getScopeDeclarationAccess().getTypeScopesTypeScopeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeDeclaration__TypeScopesAssignment_2_1"


    // $ANTLR start "rule__TypeScope__TargetTypeAssignment_0"
    // InternalProblem.g:4096:1: rule__TypeScope__TargetTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeScope__TargetTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4100:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:4101:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:4101:2: ( ( RULE_ID ) )
            // InternalProblem.g:4102:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeScopeAccess().getTargetTypeClassDeclarationCrossReference_0_0()); 
            // InternalProblem.g:4103:3: ( RULE_ID )
            // InternalProblem.g:4104:4: RULE_ID
            {
             before(grammarAccess.getTypeScopeAccess().getTargetTypeClassDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeScopeAccess().getTargetTypeClassDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypeScopeAccess().getTargetTypeClassDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeScope__TargetTypeAssignment_0"


    // $ANTLR start "rule__TypeScope__IncrementAssignment_1_0"
    // InternalProblem.g:4115:1: rule__TypeScope__IncrementAssignment_1_0 : ( ( '+=' ) ) ;
    public final void rule__TypeScope__IncrementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4119:1: ( ( ( '+=' ) ) )
            // InternalProblem.g:4120:2: ( ( '+=' ) )
            {
            // InternalProblem.g:4120:2: ( ( '+=' ) )
            // InternalProblem.g:4121:3: ( '+=' )
            {
             before(grammarAccess.getTypeScopeAccess().getIncrementPlusSignEqualsSignKeyword_1_0_0()); 
            // InternalProblem.g:4122:3: ( '+=' )
            // InternalProblem.g:4123:4: '+='
            {
             before(grammarAccess.getTypeScopeAccess().getIncrementPlusSignEqualsSignKeyword_1_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTypeScopeAccess().getIncrementPlusSignEqualsSignKeyword_1_0_0()); 

            }

             after(grammarAccess.getTypeScopeAccess().getIncrementPlusSignEqualsSignKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeScope__IncrementAssignment_1_0"


    // $ANTLR start "rule__TypeScope__MultiplicityAssignment_2"
    // InternalProblem.g:4134:1: rule__TypeScope__MultiplicityAssignment_2 : ( ruleMultiplicity ) ;
    public final void rule__TypeScope__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4138:1: ( ( ruleMultiplicity ) )
            // InternalProblem.g:4139:2: ( ruleMultiplicity )
            {
            // InternalProblem.g:4139:2: ( ruleMultiplicity )
            // InternalProblem.g:4140:3: ruleMultiplicity
            {
             before(grammarAccess.getTypeScopeAccess().getMultiplicityMultiplicityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getTypeScopeAccess().getMultiplicityMultiplicityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeScope__MultiplicityAssignment_2"


    // $ANTLR start "rule__RangeMultiplicity__LowerBoundAssignment_0"
    // InternalProblem.g:4149:1: rule__RangeMultiplicity__LowerBoundAssignment_0 : ( RULE_INT ) ;
    public final void rule__RangeMultiplicity__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4153:1: ( ( RULE_INT ) )
            // InternalProblem.g:4154:2: ( RULE_INT )
            {
            // InternalProblem.g:4154:2: ( RULE_INT )
            // InternalProblem.g:4155:3: RULE_INT
            {
             before(grammarAccess.getRangeMultiplicityAccess().getLowerBoundINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRangeMultiplicityAccess().getLowerBoundINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeMultiplicity__LowerBoundAssignment_0"


    // $ANTLR start "rule__RangeMultiplicity__UpperBoundAssignment_2"
    // InternalProblem.g:4164:1: rule__RangeMultiplicity__UpperBoundAssignment_2 : ( ruleUpperBound ) ;
    public final void rule__RangeMultiplicity__UpperBoundAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4168:1: ( ( ruleUpperBound ) )
            // InternalProblem.g:4169:2: ( ruleUpperBound )
            {
            // InternalProblem.g:4169:2: ( ruleUpperBound )
            // InternalProblem.g:4170:3: ruleUpperBound
            {
             before(grammarAccess.getRangeMultiplicityAccess().getUpperBoundUpperBoundParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUpperBound();

            state._fsp--;

             after(grammarAccess.getRangeMultiplicityAccess().getUpperBoundUpperBoundParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeMultiplicity__UpperBoundAssignment_2"


    // $ANTLR start "rule__ExactMultiplicity__ExactValueAssignment"
    // InternalProblem.g:4179:1: rule__ExactMultiplicity__ExactValueAssignment : ( RULE_INT ) ;
    public final void rule__ExactMultiplicity__ExactValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4183:1: ( ( RULE_INT ) )
            // InternalProblem.g:4184:2: ( RULE_INT )
            {
            // InternalProblem.g:4184:2: ( RULE_INT )
            // InternalProblem.g:4185:3: RULE_INT
            {
             before(grammarAccess.getExactMultiplicityAccess().getExactValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExactMultiplicityAccess().getExactValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactMultiplicity__ExactValueAssignment"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\5\1\33\1\uffff\2\5\1\33\1\31\1\25\2\5\1\uffff\2\31\1\5\1\31";
    static final String dfa_3s = "\1\23\1\42\1\uffff\1\5\1\34\2\42\1\37\2\5\1\uffff\2\42\1\5\1\42";
    static final String dfa_4s = "\2\uffff\1\2\7\uffff\1\1\4\uffff";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\14\uffff\2\2",
            "\1\4\6\uffff\1\3",
            "",
            "\1\5",
            "\1\6\26\uffff\1\7",
            "\1\4\6\uffff\1\3",
            "\1\11\2\uffff\1\7\5\uffff\1\10",
            "\1\2\11\uffff\1\12",
            "\1\13",
            "\1\14",
            "",
            "\1\11\2\uffff\1\7\5\uffff\1\10",
            "\1\11\2\uffff\1\7\5\uffff\1\15",
            "\1\16",
            "\1\11\2\uffff\1\7\5\uffff\1\15"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "672:1: rule__Assertion__Alternatives_0 : ( ( ( rule__Assertion__Group_0_0__0 ) ) | ( ( rule__Assertion__Group_0_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000029001C1022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001002600800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000400800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000000C0020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000002L});

}