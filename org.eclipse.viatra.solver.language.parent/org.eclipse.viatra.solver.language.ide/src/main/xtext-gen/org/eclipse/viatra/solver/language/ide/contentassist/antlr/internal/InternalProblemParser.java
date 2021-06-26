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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_QUOTED_ID", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'refers'", "'pred'", "'='", "'*'", "'true'", "'false'", "'unknown'", "'!'", "'?'", "'problem'", "'class'", "'extends'", "','", "'{'", "'}'", "';'", "'['", "']'", "'opposite'", "'('", "')'", "':-'", "':'", "'scope'", "'..'", "'abstract'", "'contains'", "'error'", "'+'", "'+='"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_QUOTED_ID=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
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
    // InternalProblem.g:62:1: ruleProblem : ( ( rule__Problem__Group__0 ) ) ;
    public final void ruleProblem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:66:2: ( ( ( rule__Problem__Group__0 ) ) )
            // InternalProblem.g:67:2: ( ( rule__Problem__Group__0 ) )
            {
            // InternalProblem.g:67:2: ( ( rule__Problem__Group__0 ) )
            // InternalProblem.g:68:3: ( rule__Problem__Group__0 )
            {
             before(grammarAccess.getProblemAccess().getGroup()); 
            // InternalProblem.g:69:3: ( rule__Problem__Group__0 )
            // InternalProblem.g:69:4: rule__Problem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Problem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProblemAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleArgument"
    // InternalProblem.g:303:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalProblem.g:304:1: ( ruleArgument EOF )
            // InternalProblem.g:305:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalProblem.g:312:1: ruleArgument : ( ( rule__Argument__VariableAssignment ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:316:2: ( ( ( rule__Argument__VariableAssignment ) ) )
            // InternalProblem.g:317:2: ( ( rule__Argument__VariableAssignment ) )
            {
            // InternalProblem.g:317:2: ( ( rule__Argument__VariableAssignment ) )
            // InternalProblem.g:318:3: ( rule__Argument__VariableAssignment )
            {
             before(grammarAccess.getArgumentAccess().getVariableAssignment()); 
            // InternalProblem.g:319:3: ( rule__Argument__VariableAssignment )
            // InternalProblem.g:319:4: rule__Argument__VariableAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Argument__VariableAssignment();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getVariableAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleAssertion"
    // InternalProblem.g:328:1: entryRuleAssertion : ruleAssertion EOF ;
    public final void entryRuleAssertion() throws RecognitionException {
        try {
            // InternalProblem.g:329:1: ( ruleAssertion EOF )
            // InternalProblem.g:330:1: ruleAssertion EOF
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
    // InternalProblem.g:337:1: ruleAssertion : ( ( rule__Assertion__Group__0 ) ) ;
    public final void ruleAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:341:2: ( ( ( rule__Assertion__Group__0 ) ) )
            // InternalProblem.g:342:2: ( ( rule__Assertion__Group__0 ) )
            {
            // InternalProblem.g:342:2: ( ( rule__Assertion__Group__0 ) )
            // InternalProblem.g:343:3: ( rule__Assertion__Group__0 )
            {
             before(grammarAccess.getAssertionAccess().getGroup()); 
            // InternalProblem.g:344:3: ( rule__Assertion__Group__0 )
            // InternalProblem.g:344:4: rule__Assertion__Group__0
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
    // InternalProblem.g:353:1: entryRuleScopeDeclaration : ruleScopeDeclaration EOF ;
    public final void entryRuleScopeDeclaration() throws RecognitionException {
        try {
            // InternalProblem.g:354:1: ( ruleScopeDeclaration EOF )
            // InternalProblem.g:355:1: ruleScopeDeclaration EOF
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
    // InternalProblem.g:362:1: ruleScopeDeclaration : ( ( rule__ScopeDeclaration__Group__0 ) ) ;
    public final void ruleScopeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:366:2: ( ( ( rule__ScopeDeclaration__Group__0 ) ) )
            // InternalProblem.g:367:2: ( ( rule__ScopeDeclaration__Group__0 ) )
            {
            // InternalProblem.g:367:2: ( ( rule__ScopeDeclaration__Group__0 ) )
            // InternalProblem.g:368:3: ( rule__ScopeDeclaration__Group__0 )
            {
             before(grammarAccess.getScopeDeclarationAccess().getGroup()); 
            // InternalProblem.g:369:3: ( rule__ScopeDeclaration__Group__0 )
            // InternalProblem.g:369:4: rule__ScopeDeclaration__Group__0
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
    // InternalProblem.g:378:1: entryRuleTypeScope : ruleTypeScope EOF ;
    public final void entryRuleTypeScope() throws RecognitionException {
        try {
            // InternalProblem.g:379:1: ( ruleTypeScope EOF )
            // InternalProblem.g:380:1: ruleTypeScope EOF
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
    // InternalProblem.g:387:1: ruleTypeScope : ( ( rule__TypeScope__Group__0 ) ) ;
    public final void ruleTypeScope() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:391:2: ( ( ( rule__TypeScope__Group__0 ) ) )
            // InternalProblem.g:392:2: ( ( rule__TypeScope__Group__0 ) )
            {
            // InternalProblem.g:392:2: ( ( rule__TypeScope__Group__0 ) )
            // InternalProblem.g:393:3: ( rule__TypeScope__Group__0 )
            {
             before(grammarAccess.getTypeScopeAccess().getGroup()); 
            // InternalProblem.g:394:3: ( rule__TypeScope__Group__0 )
            // InternalProblem.g:394:4: rule__TypeScope__Group__0
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
    // InternalProblem.g:403:1: entryRuleMultiplicity : ruleMultiplicity EOF ;
    public final void entryRuleMultiplicity() throws RecognitionException {
        try {
            // InternalProblem.g:404:1: ( ruleMultiplicity EOF )
            // InternalProblem.g:405:1: ruleMultiplicity EOF
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
    // InternalProblem.g:412:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:416:2: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // InternalProblem.g:417:2: ( ( rule__Multiplicity__Alternatives ) )
            {
            // InternalProblem.g:417:2: ( ( rule__Multiplicity__Alternatives ) )
            // InternalProblem.g:418:3: ( rule__Multiplicity__Alternatives )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            // InternalProblem.g:419:3: ( rule__Multiplicity__Alternatives )
            // InternalProblem.g:419:4: rule__Multiplicity__Alternatives
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


    // $ANTLR start "entryRuleDefiniteMultiplicity"
    // InternalProblem.g:428:1: entryRuleDefiniteMultiplicity : ruleDefiniteMultiplicity EOF ;
    public final void entryRuleDefiniteMultiplicity() throws RecognitionException {
        try {
            // InternalProblem.g:429:1: ( ruleDefiniteMultiplicity EOF )
            // InternalProblem.g:430:1: ruleDefiniteMultiplicity EOF
            {
             before(grammarAccess.getDefiniteMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            ruleDefiniteMultiplicity();

            state._fsp--;

             after(grammarAccess.getDefiniteMultiplicityRule()); 
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
    // $ANTLR end "entryRuleDefiniteMultiplicity"


    // $ANTLR start "ruleDefiniteMultiplicity"
    // InternalProblem.g:437:1: ruleDefiniteMultiplicity : ( ( rule__DefiniteMultiplicity__Alternatives ) ) ;
    public final void ruleDefiniteMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:441:2: ( ( ( rule__DefiniteMultiplicity__Alternatives ) ) )
            // InternalProblem.g:442:2: ( ( rule__DefiniteMultiplicity__Alternatives ) )
            {
            // InternalProblem.g:442:2: ( ( rule__DefiniteMultiplicity__Alternatives ) )
            // InternalProblem.g:443:3: ( rule__DefiniteMultiplicity__Alternatives )
            {
             before(grammarAccess.getDefiniteMultiplicityAccess().getAlternatives()); 
            // InternalProblem.g:444:3: ( rule__DefiniteMultiplicity__Alternatives )
            // InternalProblem.g:444:4: rule__DefiniteMultiplicity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DefiniteMultiplicity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefiniteMultiplicityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefiniteMultiplicity"


    // $ANTLR start "entryRuleUnboundedMultiplicity"
    // InternalProblem.g:453:1: entryRuleUnboundedMultiplicity : ruleUnboundedMultiplicity EOF ;
    public final void entryRuleUnboundedMultiplicity() throws RecognitionException {
        try {
            // InternalProblem.g:454:1: ( ruleUnboundedMultiplicity EOF )
            // InternalProblem.g:455:1: ruleUnboundedMultiplicity EOF
            {
             before(grammarAccess.getUnboundedMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            ruleUnboundedMultiplicity();

            state._fsp--;

             after(grammarAccess.getUnboundedMultiplicityRule()); 
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
    // $ANTLR end "entryRuleUnboundedMultiplicity"


    // $ANTLR start "ruleUnboundedMultiplicity"
    // InternalProblem.g:462:1: ruleUnboundedMultiplicity : ( () ) ;
    public final void ruleUnboundedMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:466:2: ( ( () ) )
            // InternalProblem.g:467:2: ( () )
            {
            // InternalProblem.g:467:2: ( () )
            // InternalProblem.g:468:3: ()
            {
             before(grammarAccess.getUnboundedMultiplicityAccess().getUnboundedMultiplicityAction()); 
            // InternalProblem.g:469:3: ()
            // InternalProblem.g:469:4: 
            {
            }

             after(grammarAccess.getUnboundedMultiplicityAccess().getUnboundedMultiplicityAction()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnboundedMultiplicity"


    // $ANTLR start "entryRuleRangeMultiplicity"
    // InternalProblem.g:478:1: entryRuleRangeMultiplicity : ruleRangeMultiplicity EOF ;
    public final void entryRuleRangeMultiplicity() throws RecognitionException {
        try {
            // InternalProblem.g:479:1: ( ruleRangeMultiplicity EOF )
            // InternalProblem.g:480:1: ruleRangeMultiplicity EOF
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
    // InternalProblem.g:487:1: ruleRangeMultiplicity : ( ( rule__RangeMultiplicity__Group__0 ) ) ;
    public final void ruleRangeMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:491:2: ( ( ( rule__RangeMultiplicity__Group__0 ) ) )
            // InternalProblem.g:492:2: ( ( rule__RangeMultiplicity__Group__0 ) )
            {
            // InternalProblem.g:492:2: ( ( rule__RangeMultiplicity__Group__0 ) )
            // InternalProblem.g:493:3: ( rule__RangeMultiplicity__Group__0 )
            {
             before(grammarAccess.getRangeMultiplicityAccess().getGroup()); 
            // InternalProblem.g:494:3: ( rule__RangeMultiplicity__Group__0 )
            // InternalProblem.g:494:4: rule__RangeMultiplicity__Group__0
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
    // InternalProblem.g:503:1: entryRuleExactMultiplicity : ruleExactMultiplicity EOF ;
    public final void entryRuleExactMultiplicity() throws RecognitionException {
        try {
            // InternalProblem.g:504:1: ( ruleExactMultiplicity EOF )
            // InternalProblem.g:505:1: ruleExactMultiplicity EOF
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
    // InternalProblem.g:512:1: ruleExactMultiplicity : ( ( rule__ExactMultiplicity__ExactValueAssignment ) ) ;
    public final void ruleExactMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:516:2: ( ( ( rule__ExactMultiplicity__ExactValueAssignment ) ) )
            // InternalProblem.g:517:2: ( ( rule__ExactMultiplicity__ExactValueAssignment ) )
            {
            // InternalProblem.g:517:2: ( ( rule__ExactMultiplicity__ExactValueAssignment ) )
            // InternalProblem.g:518:3: ( rule__ExactMultiplicity__ExactValueAssignment )
            {
             before(grammarAccess.getExactMultiplicityAccess().getExactValueAssignment()); 
            // InternalProblem.g:519:3: ( rule__ExactMultiplicity__ExactValueAssignment )
            // InternalProblem.g:519:4: rule__ExactMultiplicity__ExactValueAssignment
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
    // InternalProblem.g:528:1: entryRuleUpperBound : ruleUpperBound EOF ;
    public final void entryRuleUpperBound() throws RecognitionException {
        try {
            // InternalProblem.g:529:1: ( ruleUpperBound EOF )
            // InternalProblem.g:530:1: ruleUpperBound EOF
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
    // InternalProblem.g:537:1: ruleUpperBound : ( ( rule__UpperBound__Alternatives ) ) ;
    public final void ruleUpperBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:541:2: ( ( ( rule__UpperBound__Alternatives ) ) )
            // InternalProblem.g:542:2: ( ( rule__UpperBound__Alternatives ) )
            {
            // InternalProblem.g:542:2: ( ( rule__UpperBound__Alternatives ) )
            // InternalProblem.g:543:3: ( rule__UpperBound__Alternatives )
            {
             before(grammarAccess.getUpperBoundAccess().getAlternatives()); 
            // InternalProblem.g:544:3: ( rule__UpperBound__Alternatives )
            // InternalProblem.g:544:4: rule__UpperBound__Alternatives
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
    // InternalProblem.g:553:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalProblem.g:554:1: ( ruleQualifiedName EOF )
            // InternalProblem.g:555:1: ruleQualifiedName EOF
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
    // InternalProblem.g:562:1: ruleQualifiedName : ( ( rule__QualifiedName__Alternatives ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:566:2: ( ( ( rule__QualifiedName__Alternatives ) ) )
            // InternalProblem.g:567:2: ( ( rule__QualifiedName__Alternatives ) )
            {
            // InternalProblem.g:567:2: ( ( rule__QualifiedName__Alternatives ) )
            // InternalProblem.g:568:3: ( rule__QualifiedName__Alternatives )
            {
             before(grammarAccess.getQualifiedNameAccess().getAlternatives()); 
            // InternalProblem.g:569:3: ( rule__QualifiedName__Alternatives )
            // InternalProblem.g:569:4: rule__QualifiedName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalProblem.g:578:1: ruleLogicValue : ( ( rule__LogicValue__Alternatives ) ) ;
    public final void ruleLogicValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:582:1: ( ( ( rule__LogicValue__Alternatives ) ) )
            // InternalProblem.g:583:2: ( ( rule__LogicValue__Alternatives ) )
            {
            // InternalProblem.g:583:2: ( ( rule__LogicValue__Alternatives ) )
            // InternalProblem.g:584:3: ( rule__LogicValue__Alternatives )
            {
             before(grammarAccess.getLogicValueAccess().getAlternatives()); 
            // InternalProblem.g:585:3: ( rule__LogicValue__Alternatives )
            // InternalProblem.g:585:4: rule__LogicValue__Alternatives
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
    // InternalProblem.g:594:1: ruleShortLogicValue : ( ( rule__ShortLogicValue__Alternatives ) ) ;
    public final void ruleShortLogicValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:598:1: ( ( ( rule__ShortLogicValue__Alternatives ) ) )
            // InternalProblem.g:599:2: ( ( rule__ShortLogicValue__Alternatives ) )
            {
            // InternalProblem.g:599:2: ( ( rule__ShortLogicValue__Alternatives ) )
            // InternalProblem.g:600:3: ( rule__ShortLogicValue__Alternatives )
            {
             before(grammarAccess.getShortLogicValueAccess().getAlternatives()); 
            // InternalProblem.g:601:3: ( rule__ShortLogicValue__Alternatives )
            // InternalProblem.g:601:4: rule__ShortLogicValue__Alternatives
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
    // InternalProblem.g:609:1: rule__Statement__Alternatives : ( ( ruleClassDeclaration ) | ( rulePredicateDefinition ) | ( ruleAssertion ) | ( ruleScopeDeclaration ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:613:1: ( ( ruleClassDeclaration ) | ( rulePredicateDefinition ) | ( ruleAssertion ) | ( ruleScopeDeclaration ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 23:
            case 38:
                {
                alt1=1;
                }
                break;
            case 14:
            case 40:
                {
                alt1=2;
                }
                break;
            case RULE_QUOTED_ID:
            case RULE_ID:
            case 20:
            case 21:
                {
                alt1=3;
                }
                break;
            case 36:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalProblem.g:614:2: ( ruleClassDeclaration )
                    {
                    // InternalProblem.g:614:2: ( ruleClassDeclaration )
                    // InternalProblem.g:615:3: ruleClassDeclaration
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
                    // InternalProblem.g:620:2: ( rulePredicateDefinition )
                    {
                    // InternalProblem.g:620:2: ( rulePredicateDefinition )
                    // InternalProblem.g:621:3: rulePredicateDefinition
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
                    // InternalProblem.g:626:2: ( ruleAssertion )
                    {
                    // InternalProblem.g:626:2: ( ruleAssertion )
                    // InternalProblem.g:627:3: ruleAssertion
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
                    // InternalProblem.g:632:2: ( ruleScopeDeclaration )
                    {
                    // InternalProblem.g:632:2: ( ruleScopeDeclaration )
                    // InternalProblem.g:633:3: ruleScopeDeclaration
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


    // $ANTLR start "rule__ClassDeclaration__Alternatives_4"
    // InternalProblem.g:642:1: rule__ClassDeclaration__Alternatives_4 : ( ( ( rule__ClassDeclaration__Group_4_0__0 ) ) | ( '.' ) );
    public final void rule__ClassDeclaration__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:646:1: ( ( ( rule__ClassDeclaration__Group_4_0__0 ) ) | ( '.' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalProblem.g:647:2: ( ( rule__ClassDeclaration__Group_4_0__0 ) )
                    {
                    // InternalProblem.g:647:2: ( ( rule__ClassDeclaration__Group_4_0__0 ) )
                    // InternalProblem.g:648:3: ( rule__ClassDeclaration__Group_4_0__0 )
                    {
                     before(grammarAccess.getClassDeclarationAccess().getGroup_4_0()); 
                    // InternalProblem.g:649:3: ( rule__ClassDeclaration__Group_4_0__0 )
                    // InternalProblem.g:649:4: rule__ClassDeclaration__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDeclaration__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassDeclarationAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:653:2: ( '.' )
                    {
                    // InternalProblem.g:653:2: ( '.' )
                    // InternalProblem.g:654:3: '.'
                    {
                     before(grammarAccess.getClassDeclarationAccess().getFullStopKeyword_4_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getClassDeclarationAccess().getFullStopKeyword_4_1()); 

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
    // $ANTLR end "rule__ClassDeclaration__Alternatives_4"


    // $ANTLR start "rule__ReferenceDeclaration__Alternatives_0"
    // InternalProblem.g:663:1: rule__ReferenceDeclaration__Alternatives_0 : ( ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) ) | ( 'refers' ) );
    public final void rule__ReferenceDeclaration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:667:1: ( ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) ) | ( 'refers' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==39) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalProblem.g:668:2: ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) )
                    {
                    // InternalProblem.g:668:2: ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) )
                    // InternalProblem.g:669:3: ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 )
                    {
                     before(grammarAccess.getReferenceDeclarationAccess().getContainmentAssignment_0_0()); 
                    // InternalProblem.g:670:3: ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 )
                    // InternalProblem.g:670:4: rule__ReferenceDeclaration__ContainmentAssignment_0_0
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
                    // InternalProblem.g:674:2: ( 'refers' )
                    {
                    // InternalProblem.g:674:2: ( 'refers' )
                    // InternalProblem.g:675:3: 'refers'
                    {
                     before(grammarAccess.getReferenceDeclarationAccess().getRefersKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
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
    // InternalProblem.g:684:1: rule__PredicateDefinition__Alternatives_0 : ( ( ( rule__PredicateDefinition__Group_0_0__0 ) ) | ( 'pred' ) );
    public final void rule__PredicateDefinition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:688:1: ( ( ( rule__PredicateDefinition__Group_0_0__0 ) ) | ( 'pred' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==40) ) {
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
                    // InternalProblem.g:689:2: ( ( rule__PredicateDefinition__Group_0_0__0 ) )
                    {
                    // InternalProblem.g:689:2: ( ( rule__PredicateDefinition__Group_0_0__0 ) )
                    // InternalProblem.g:690:3: ( rule__PredicateDefinition__Group_0_0__0 )
                    {
                     before(grammarAccess.getPredicateDefinitionAccess().getGroup_0_0()); 
                    // InternalProblem.g:691:3: ( rule__PredicateDefinition__Group_0_0__0 )
                    // InternalProblem.g:691:4: rule__PredicateDefinition__Group_0_0__0
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
                    // InternalProblem.g:695:2: ( 'pred' )
                    {
                    // InternalProblem.g:695:2: ( 'pred' )
                    // InternalProblem.g:696:3: 'pred'
                    {
                     before(grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalProblem.g:705:1: rule__Literal__Alternatives : ( ( ruleAtom ) | ( ruleNegativeLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:709:1: ( ( ruleAtom ) | ( ruleNegativeLiteral ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_QUOTED_ID && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalProblem.g:710:2: ( ruleAtom )
                    {
                    // InternalProblem.g:710:2: ( ruleAtom )
                    // InternalProblem.g:711:3: ruleAtom
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
                    // InternalProblem.g:716:2: ( ruleNegativeLiteral )
                    {
                    // InternalProblem.g:716:2: ( ruleNegativeLiteral )
                    // InternalProblem.g:717:3: ruleNegativeLiteral
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
    // InternalProblem.g:726:1: rule__Assertion__Alternatives_0 : ( ( ( rule__Assertion__Group_0_0__0 ) ) | ( ( rule__Assertion__Group_0_1__0 ) ) );
    public final void rule__Assertion__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:730:1: ( ( ( rule__Assertion__Group_0_0__0 ) ) | ( ( rule__Assertion__Group_0_1__0 ) ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalProblem.g:731:2: ( ( rule__Assertion__Group_0_0__0 ) )
                    {
                    // InternalProblem.g:731:2: ( ( rule__Assertion__Group_0_0__0 ) )
                    // InternalProblem.g:732:3: ( rule__Assertion__Group_0_0__0 )
                    {
                     before(grammarAccess.getAssertionAccess().getGroup_0_0()); 
                    // InternalProblem.g:733:3: ( rule__Assertion__Group_0_0__0 )
                    // InternalProblem.g:733:4: rule__Assertion__Group_0_0__0
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
                    // InternalProblem.g:737:2: ( ( rule__Assertion__Group_0_1__0 ) )
                    {
                    // InternalProblem.g:737:2: ( ( rule__Assertion__Group_0_1__0 ) )
                    // InternalProblem.g:738:3: ( rule__Assertion__Group_0_1__0 )
                    {
                     before(grammarAccess.getAssertionAccess().getGroup_0_1()); 
                    // InternalProblem.g:739:3: ( rule__Assertion__Group_0_1__0 )
                    // InternalProblem.g:739:4: rule__Assertion__Group_0_1__0
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
    // InternalProblem.g:747:1: rule__TypeScope__Alternatives_1 : ( ( ( rule__TypeScope__IncrementAssignment_1_0 ) ) | ( '=' ) );
    public final void rule__TypeScope__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:751:1: ( ( ( rule__TypeScope__IncrementAssignment_1_0 ) ) | ( '=' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==42) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalProblem.g:752:2: ( ( rule__TypeScope__IncrementAssignment_1_0 ) )
                    {
                    // InternalProblem.g:752:2: ( ( rule__TypeScope__IncrementAssignment_1_0 ) )
                    // InternalProblem.g:753:3: ( rule__TypeScope__IncrementAssignment_1_0 )
                    {
                     before(grammarAccess.getTypeScopeAccess().getIncrementAssignment_1_0()); 
                    // InternalProblem.g:754:3: ( rule__TypeScope__IncrementAssignment_1_0 )
                    // InternalProblem.g:754:4: rule__TypeScope__IncrementAssignment_1_0
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
                    // InternalProblem.g:758:2: ( '=' )
                    {
                    // InternalProblem.g:758:2: ( '=' )
                    // InternalProblem.g:759:3: '='
                    {
                     before(grammarAccess.getTypeScopeAccess().getEqualsSignKeyword_1_1()); 
                    match(input,15,FOLLOW_2); 
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
    // InternalProblem.g:768:1: rule__Multiplicity__Alternatives : ( ( ruleUnboundedMultiplicity ) | ( ruleDefiniteMultiplicity ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:772:1: ( ( ruleUnboundedMultiplicity ) | ( ruleDefiniteMultiplicity ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EOF||LA8_0==30) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalProblem.g:773:2: ( ruleUnboundedMultiplicity )
                    {
                    // InternalProblem.g:773:2: ( ruleUnboundedMultiplicity )
                    // InternalProblem.g:774:3: ruleUnboundedMultiplicity
                    {
                     before(grammarAccess.getMultiplicityAccess().getUnboundedMultiplicityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUnboundedMultiplicity();

                    state._fsp--;

                     after(grammarAccess.getMultiplicityAccess().getUnboundedMultiplicityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:779:2: ( ruleDefiniteMultiplicity )
                    {
                    // InternalProblem.g:779:2: ( ruleDefiniteMultiplicity )
                    // InternalProblem.g:780:3: ruleDefiniteMultiplicity
                    {
                     before(grammarAccess.getMultiplicityAccess().getDefiniteMultiplicityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDefiniteMultiplicity();

                    state._fsp--;

                     after(grammarAccess.getMultiplicityAccess().getDefiniteMultiplicityParserRuleCall_1()); 

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


    // $ANTLR start "rule__DefiniteMultiplicity__Alternatives"
    // InternalProblem.g:789:1: rule__DefiniteMultiplicity__Alternatives : ( ( ruleRangeMultiplicity ) | ( ruleExactMultiplicity ) );
    public final void rule__DefiniteMultiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:793:1: ( ( ruleRangeMultiplicity ) | ( ruleExactMultiplicity ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==37) ) {
                    alt9=1;
                }
                else if ( (LA9_1==EOF||LA9_1==12||LA9_1==25||LA9_1==30) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalProblem.g:794:2: ( ruleRangeMultiplicity )
                    {
                    // InternalProblem.g:794:2: ( ruleRangeMultiplicity )
                    // InternalProblem.g:795:3: ruleRangeMultiplicity
                    {
                     before(grammarAccess.getDefiniteMultiplicityAccess().getRangeMultiplicityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRangeMultiplicity();

                    state._fsp--;

                     after(grammarAccess.getDefiniteMultiplicityAccess().getRangeMultiplicityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:800:2: ( ruleExactMultiplicity )
                    {
                    // InternalProblem.g:800:2: ( ruleExactMultiplicity )
                    // InternalProblem.g:801:3: ruleExactMultiplicity
                    {
                     before(grammarAccess.getDefiniteMultiplicityAccess().getExactMultiplicityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExactMultiplicity();

                    state._fsp--;

                     after(grammarAccess.getDefiniteMultiplicityAccess().getExactMultiplicityParserRuleCall_1()); 

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
    // $ANTLR end "rule__DefiniteMultiplicity__Alternatives"


    // $ANTLR start "rule__UpperBound__Alternatives"
    // InternalProblem.g:810:1: rule__UpperBound__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__UpperBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:814:1: ( ( RULE_INT ) | ( '*' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            else if ( (LA10_0==16) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalProblem.g:815:2: ( RULE_INT )
                    {
                    // InternalProblem.g:815:2: ( RULE_INT )
                    // InternalProblem.g:816:3: RULE_INT
                    {
                     before(grammarAccess.getUpperBoundAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getUpperBoundAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:821:2: ( '*' )
                    {
                    // InternalProblem.g:821:2: ( '*' )
                    // InternalProblem.g:822:3: '*'
                    {
                     before(grammarAccess.getUpperBoundAccess().getAsteriskKeyword_1()); 
                    match(input,16,FOLLOW_2); 
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


    // $ANTLR start "rule__QualifiedName__Alternatives"
    // InternalProblem.g:831:1: rule__QualifiedName__Alternatives : ( ( RULE_QUOTED_ID ) | ( ( rule__QualifiedName__Group_1__0 ) ) );
    public final void rule__QualifiedName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:835:1: ( ( RULE_QUOTED_ID ) | ( ( rule__QualifiedName__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_QUOTED_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalProblem.g:836:2: ( RULE_QUOTED_ID )
                    {
                    // InternalProblem.g:836:2: ( RULE_QUOTED_ID )
                    // InternalProblem.g:837:3: RULE_QUOTED_ID
                    {
                     before(grammarAccess.getQualifiedNameAccess().getQUOTED_IDTerminalRuleCall_0()); 
                    match(input,RULE_QUOTED_ID,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getQUOTED_IDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:842:2: ( ( rule__QualifiedName__Group_1__0 ) )
                    {
                    // InternalProblem.g:842:2: ( ( rule__QualifiedName__Group_1__0 ) )
                    // InternalProblem.g:843:3: ( rule__QualifiedName__Group_1__0 )
                    {
                     before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
                    // InternalProblem.g:844:3: ( rule__QualifiedName__Group_1__0 )
                    // InternalProblem.g:844:4: rule__QualifiedName__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedName__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Alternatives"


    // $ANTLR start "rule__LogicValue__Alternatives"
    // InternalProblem.g:852:1: rule__LogicValue__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) | ( ( 'unknown' ) ) );
    public final void rule__LogicValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:856:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) | ( ( 'unknown' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt12=1;
                }
                break;
            case 18:
                {
                alt12=2;
                }
                break;
            case 19:
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
                    // InternalProblem.g:857:2: ( ( 'true' ) )
                    {
                    // InternalProblem.g:857:2: ( ( 'true' ) )
                    // InternalProblem.g:858:3: ( 'true' )
                    {
                     before(grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:859:3: ( 'true' )
                    // InternalProblem.g:859:4: 'true'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:863:2: ( ( 'false' ) )
                    {
                    // InternalProblem.g:863:2: ( ( 'false' ) )
                    // InternalProblem.g:864:3: ( 'false' )
                    {
                     before(grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:865:3: ( 'false' )
                    // InternalProblem.g:865:4: 'false'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:869:2: ( ( 'unknown' ) )
                    {
                    // InternalProblem.g:869:2: ( ( 'unknown' ) )
                    // InternalProblem.g:870:3: ( 'unknown' )
                    {
                     before(grammarAccess.getLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_2()); 
                    // InternalProblem.g:871:3: ( 'unknown' )
                    // InternalProblem.g:871:4: 'unknown'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalProblem.g:879:1: rule__ShortLogicValue__Alternatives : ( ( ( '!' ) ) | ( ( '?' ) ) );
    public final void rule__ShortLogicValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:883:1: ( ( ( '!' ) ) | ( ( '?' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            else if ( (LA13_0==21) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalProblem.g:884:2: ( ( '!' ) )
                    {
                    // InternalProblem.g:884:2: ( ( '!' ) )
                    // InternalProblem.g:885:3: ( '!' )
                    {
                     before(grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:886:3: ( '!' )
                    // InternalProblem.g:886:4: '!'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:890:2: ( ( '?' ) )
                    {
                    // InternalProblem.g:890:2: ( ( '?' ) )
                    // InternalProblem.g:891:3: ( '?' )
                    {
                     before(grammarAccess.getShortLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:892:3: ( '?' )
                    // InternalProblem.g:892:4: '?'
                    {
                    match(input,21,FOLLOW_2); 

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


    // $ANTLR start "rule__Problem__Group__0"
    // InternalProblem.g:900:1: rule__Problem__Group__0 : rule__Problem__Group__0__Impl rule__Problem__Group__1 ;
    public final void rule__Problem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:904:1: ( rule__Problem__Group__0__Impl rule__Problem__Group__1 )
            // InternalProblem.g:905:2: rule__Problem__Group__0__Impl rule__Problem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Problem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Problem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__0"


    // $ANTLR start "rule__Problem__Group__0__Impl"
    // InternalProblem.g:912:1: rule__Problem__Group__0__Impl : ( ( rule__Problem__Group_0__0 )? ) ;
    public final void rule__Problem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:916:1: ( ( ( rule__Problem__Group_0__0 )? ) )
            // InternalProblem.g:917:1: ( ( rule__Problem__Group_0__0 )? )
            {
            // InternalProblem.g:917:1: ( ( rule__Problem__Group_0__0 )? )
            // InternalProblem.g:918:2: ( rule__Problem__Group_0__0 )?
            {
             before(grammarAccess.getProblemAccess().getGroup_0()); 
            // InternalProblem.g:919:2: ( rule__Problem__Group_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalProblem.g:919:3: rule__Problem__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Problem__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProblemAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__0__Impl"


    // $ANTLR start "rule__Problem__Group__1"
    // InternalProblem.g:927:1: rule__Problem__Group__1 : rule__Problem__Group__1__Impl ;
    public final void rule__Problem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:931:1: ( rule__Problem__Group__1__Impl )
            // InternalProblem.g:932:2: rule__Problem__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Problem__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__1"


    // $ANTLR start "rule__Problem__Group__1__Impl"
    // InternalProblem.g:938:1: rule__Problem__Group__1__Impl : ( ( rule__Problem__StatementsAssignment_1 )* ) ;
    public final void rule__Problem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:942:1: ( ( ( rule__Problem__StatementsAssignment_1 )* ) )
            // InternalProblem.g:943:1: ( ( rule__Problem__StatementsAssignment_1 )* )
            {
            // InternalProblem.g:943:1: ( ( rule__Problem__StatementsAssignment_1 )* )
            // InternalProblem.g:944:2: ( rule__Problem__StatementsAssignment_1 )*
            {
             before(grammarAccess.getProblemAccess().getStatementsAssignment_1()); 
            // InternalProblem.g:945:2: ( rule__Problem__StatementsAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_QUOTED_ID && LA15_0<=RULE_ID)||LA15_0==14||(LA15_0>=20 && LA15_0<=21)||LA15_0==23||LA15_0==36||LA15_0==38||LA15_0==40) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalProblem.g:945:3: rule__Problem__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Problem__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getProblemAccess().getStatementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__1__Impl"


    // $ANTLR start "rule__Problem__Group_0__0"
    // InternalProblem.g:954:1: rule__Problem__Group_0__0 : rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1 ;
    public final void rule__Problem__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:958:1: ( rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1 )
            // InternalProblem.g:959:2: rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Problem__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Problem__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_0__0"


    // $ANTLR start "rule__Problem__Group_0__0__Impl"
    // InternalProblem.g:966:1: rule__Problem__Group_0__0__Impl : ( 'problem' ) ;
    public final void rule__Problem__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:970:1: ( ( 'problem' ) )
            // InternalProblem.g:971:1: ( 'problem' )
            {
            // InternalProblem.g:971:1: ( 'problem' )
            // InternalProblem.g:972:2: 'problem'
            {
             before(grammarAccess.getProblemAccess().getProblemKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProblemAccess().getProblemKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_0__0__Impl"


    // $ANTLR start "rule__Problem__Group_0__1"
    // InternalProblem.g:981:1: rule__Problem__Group_0__1 : rule__Problem__Group_0__1__Impl rule__Problem__Group_0__2 ;
    public final void rule__Problem__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:985:1: ( rule__Problem__Group_0__1__Impl rule__Problem__Group_0__2 )
            // InternalProblem.g:986:2: rule__Problem__Group_0__1__Impl rule__Problem__Group_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Problem__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Problem__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_0__1"


    // $ANTLR start "rule__Problem__Group_0__1__Impl"
    // InternalProblem.g:993:1: rule__Problem__Group_0__1__Impl : ( ( rule__Problem__NameAssignment_0_1 ) ) ;
    public final void rule__Problem__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:997:1: ( ( ( rule__Problem__NameAssignment_0_1 ) ) )
            // InternalProblem.g:998:1: ( ( rule__Problem__NameAssignment_0_1 ) )
            {
            // InternalProblem.g:998:1: ( ( rule__Problem__NameAssignment_0_1 ) )
            // InternalProblem.g:999:2: ( rule__Problem__NameAssignment_0_1 )
            {
             before(grammarAccess.getProblemAccess().getNameAssignment_0_1()); 
            // InternalProblem.g:1000:2: ( rule__Problem__NameAssignment_0_1 )
            // InternalProblem.g:1000:3: rule__Problem__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Problem__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getProblemAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_0__1__Impl"


    // $ANTLR start "rule__Problem__Group_0__2"
    // InternalProblem.g:1008:1: rule__Problem__Group_0__2 : rule__Problem__Group_0__2__Impl ;
    public final void rule__Problem__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1012:1: ( rule__Problem__Group_0__2__Impl )
            // InternalProblem.g:1013:2: rule__Problem__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Problem__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_0__2"


    // $ANTLR start "rule__Problem__Group_0__2__Impl"
    // InternalProblem.g:1019:1: rule__Problem__Group_0__2__Impl : ( '.' ) ;
    public final void rule__Problem__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1023:1: ( ( '.' ) )
            // InternalProblem.g:1024:1: ( '.' )
            {
            // InternalProblem.g:1024:1: ( '.' )
            // InternalProblem.g:1025:2: '.'
            {
             before(grammarAccess.getProblemAccess().getFullStopKeyword_0_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProblemAccess().getFullStopKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_0__2__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__0"
    // InternalProblem.g:1035:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1039:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalProblem.g:1040:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalProblem.g:1047:1: rule__ClassDeclaration__Group__0__Impl : ( ( rule__ClassDeclaration__AbstractAssignment_0 )? ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1051:1: ( ( ( rule__ClassDeclaration__AbstractAssignment_0 )? ) )
            // InternalProblem.g:1052:1: ( ( rule__ClassDeclaration__AbstractAssignment_0 )? )
            {
            // InternalProblem.g:1052:1: ( ( rule__ClassDeclaration__AbstractAssignment_0 )? )
            // InternalProblem.g:1053:2: ( rule__ClassDeclaration__AbstractAssignment_0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getAbstractAssignment_0()); 
            // InternalProblem.g:1054:2: ( rule__ClassDeclaration__AbstractAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProblem.g:1054:3: rule__ClassDeclaration__AbstractAssignment_0
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
    // InternalProblem.g:1062:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1066:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalProblem.g:1067:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
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
    // InternalProblem.g:1074:1: rule__ClassDeclaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1078:1: ( ( 'class' ) )
            // InternalProblem.g:1079:1: ( 'class' )
            {
            // InternalProblem.g:1079:1: ( 'class' )
            // InternalProblem.g:1080:2: 'class'
            {
             before(grammarAccess.getClassDeclarationAccess().getClassKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalProblem.g:1089:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1093:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalProblem.g:1094:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalProblem.g:1101:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1105:1: ( ( ( rule__ClassDeclaration__NameAssignment_2 ) ) )
            // InternalProblem.g:1106:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            {
            // InternalProblem.g:1106:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            // InternalProblem.g:1107:2: ( rule__ClassDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 
            // InternalProblem.g:1108:2: ( rule__ClassDeclaration__NameAssignment_2 )
            // InternalProblem.g:1108:3: rule__ClassDeclaration__NameAssignment_2
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
    // InternalProblem.g:1116:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1120:1: ( rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 )
            // InternalProblem.g:1121:2: rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalProblem.g:1128:1: rule__ClassDeclaration__Group__3__Impl : ( ( rule__ClassDeclaration__Group_3__0 )? ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1132:1: ( ( ( rule__ClassDeclaration__Group_3__0 )? ) )
            // InternalProblem.g:1133:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            {
            // InternalProblem.g:1133:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            // InternalProblem.g:1134:2: ( rule__ClassDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3()); 
            // InternalProblem.g:1135:2: ( rule__ClassDeclaration__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalProblem.g:1135:3: rule__ClassDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDeclaration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassDeclarationAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalProblem.g:1143:1: rule__ClassDeclaration__Group__4 : rule__ClassDeclaration__Group__4__Impl ;
    public final void rule__ClassDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1147:1: ( rule__ClassDeclaration__Group__4__Impl )
            // InternalProblem.g:1148:2: rule__ClassDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalProblem.g:1154:1: rule__ClassDeclaration__Group__4__Impl : ( ( rule__ClassDeclaration__Alternatives_4 ) ) ;
    public final void rule__ClassDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1158:1: ( ( ( rule__ClassDeclaration__Alternatives_4 ) ) )
            // InternalProblem.g:1159:1: ( ( rule__ClassDeclaration__Alternatives_4 ) )
            {
            // InternalProblem.g:1159:1: ( ( rule__ClassDeclaration__Alternatives_4 ) )
            // InternalProblem.g:1160:2: ( rule__ClassDeclaration__Alternatives_4 )
            {
             before(grammarAccess.getClassDeclarationAccess().getAlternatives_4()); 
            // InternalProblem.g:1161:2: ( rule__ClassDeclaration__Alternatives_4 )
            // InternalProblem.g:1161:3: rule__ClassDeclaration__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getAlternatives_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ClassDeclaration__Group_3__0"
    // InternalProblem.g:1170:1: rule__ClassDeclaration__Group_3__0 : rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 ;
    public final void rule__ClassDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1174:1: ( rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 )
            // InternalProblem.g:1175:2: rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__ClassDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3__0"


    // $ANTLR start "rule__ClassDeclaration__Group_3__0__Impl"
    // InternalProblem.g:1182:1: rule__ClassDeclaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__ClassDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1186:1: ( ( 'extends' ) )
            // InternalProblem.g:1187:1: ( 'extends' )
            {
            // InternalProblem.g:1187:1: ( 'extends' )
            // InternalProblem.g:1188:2: 'extends'
            {
             before(grammarAccess.getClassDeclarationAccess().getExtendsKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3__1"
    // InternalProblem.g:1197:1: rule__ClassDeclaration__Group_3__1 : rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 ;
    public final void rule__ClassDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1201:1: ( rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 )
            // InternalProblem.g:1202:2: rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__ClassDeclaration__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3__1"


    // $ANTLR start "rule__ClassDeclaration__Group_3__1__Impl"
    // InternalProblem.g:1209:1: rule__ClassDeclaration__Group_3__1__Impl : ( ( rule__ClassDeclaration__SuperTypesAssignment_3_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1213:1: ( ( ( rule__ClassDeclaration__SuperTypesAssignment_3_1 ) ) )
            // InternalProblem.g:1214:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_1 ) )
            {
            // InternalProblem.g:1214:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_1 ) )
            // InternalProblem.g:1215:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesAssignment_3_1()); 
            // InternalProblem.g:1216:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_1 )
            // InternalProblem.g:1216:3: rule__ClassDeclaration__SuperTypesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__SuperTypesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getSuperTypesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3__2"
    // InternalProblem.g:1224:1: rule__ClassDeclaration__Group_3__2 : rule__ClassDeclaration__Group_3__2__Impl ;
    public final void rule__ClassDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1228:1: ( rule__ClassDeclaration__Group_3__2__Impl )
            // InternalProblem.g:1229:2: rule__ClassDeclaration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3__2"


    // $ANTLR start "rule__ClassDeclaration__Group_3__2__Impl"
    // InternalProblem.g:1235:1: rule__ClassDeclaration__Group_3__2__Impl : ( ( rule__ClassDeclaration__Group_3_2__0 )* ) ;
    public final void rule__ClassDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1239:1: ( ( ( rule__ClassDeclaration__Group_3_2__0 )* ) )
            // InternalProblem.g:1240:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            {
            // InternalProblem.g:1240:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            // InternalProblem.g:1241:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3_2()); 
            // InternalProblem.g:1242:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalProblem.g:1242:3: rule__ClassDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ClassDeclaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getClassDeclarationAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3__2__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3_2__0"
    // InternalProblem.g:1251:1: rule__ClassDeclaration__Group_3_2__0 : rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 ;
    public final void rule__ClassDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1255:1: ( rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 )
            // InternalProblem.g:1256:2: rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1
            {
            pushFollow(FOLLOW_9);
            rule__ClassDeclaration__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_2__0"


    // $ANTLR start "rule__ClassDeclaration__Group_3_2__0__Impl"
    // InternalProblem.g:1263:1: rule__ClassDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1267:1: ( ( ',' ) )
            // InternalProblem.g:1268:1: ( ',' )
            {
            // InternalProblem.g:1268:1: ( ',' )
            // InternalProblem.g:1269:2: ','
            {
             before(grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_2__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_3_2__1"
    // InternalProblem.g:1278:1: rule__ClassDeclaration__Group_3_2__1 : rule__ClassDeclaration__Group_3_2__1__Impl ;
    public final void rule__ClassDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1282:1: ( rule__ClassDeclaration__Group_3_2__1__Impl )
            // InternalProblem.g:1283:2: rule__ClassDeclaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_2__1"


    // $ANTLR start "rule__ClassDeclaration__Group_3_2__1__Impl"
    // InternalProblem.g:1289:1: rule__ClassDeclaration__Group_3_2__1__Impl : ( ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1293:1: ( ( ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 ) ) )
            // InternalProblem.g:1294:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 ) )
            {
            // InternalProblem.g:1294:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 ) )
            // InternalProblem.g:1295:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesAssignment_3_2_1()); 
            // InternalProblem.g:1296:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 )
            // InternalProblem.g:1296:3: rule__ClassDeclaration__SuperTypesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__SuperTypesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getSuperTypesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_3_2__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_4_0__0"
    // InternalProblem.g:1305:1: rule__ClassDeclaration__Group_4_0__0 : rule__ClassDeclaration__Group_4_0__0__Impl rule__ClassDeclaration__Group_4_0__1 ;
    public final void rule__ClassDeclaration__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1309:1: ( rule__ClassDeclaration__Group_4_0__0__Impl rule__ClassDeclaration__Group_4_0__1 )
            // InternalProblem.g:1310:2: rule__ClassDeclaration__Group_4_0__0__Impl rule__ClassDeclaration__Group_4_0__1
            {
            pushFollow(FOLLOW_12);
            rule__ClassDeclaration__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_4_0__0"


    // $ANTLR start "rule__ClassDeclaration__Group_4_0__0__Impl"
    // InternalProblem.g:1317:1: rule__ClassDeclaration__Group_4_0__0__Impl : ( '{' ) ;
    public final void rule__ClassDeclaration__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1321:1: ( ( '{' ) )
            // InternalProblem.g:1322:1: ( '{' )
            {
            // InternalProblem.g:1322:1: ( '{' )
            // InternalProblem.g:1323:2: '{'
            {
             before(grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_4_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_4_0__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_4_0__1"
    // InternalProblem.g:1332:1: rule__ClassDeclaration__Group_4_0__1 : rule__ClassDeclaration__Group_4_0__1__Impl rule__ClassDeclaration__Group_4_0__2 ;
    public final void rule__ClassDeclaration__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1336:1: ( rule__ClassDeclaration__Group_4_0__1__Impl rule__ClassDeclaration__Group_4_0__2 )
            // InternalProblem.g:1337:2: rule__ClassDeclaration__Group_4_0__1__Impl rule__ClassDeclaration__Group_4_0__2
            {
            pushFollow(FOLLOW_12);
            rule__ClassDeclaration__Group_4_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_4_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_4_0__1"


    // $ANTLR start "rule__ClassDeclaration__Group_4_0__1__Impl"
    // InternalProblem.g:1344:1: rule__ClassDeclaration__Group_4_0__1__Impl : ( ( rule__ClassDeclaration__Group_4_0_1__0 )* ) ;
    public final void rule__ClassDeclaration__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1348:1: ( ( ( rule__ClassDeclaration__Group_4_0_1__0 )* ) )
            // InternalProblem.g:1349:1: ( ( rule__ClassDeclaration__Group_4_0_1__0 )* )
            {
            // InternalProblem.g:1349:1: ( ( rule__ClassDeclaration__Group_4_0_1__0 )* )
            // InternalProblem.g:1350:2: ( rule__ClassDeclaration__Group_4_0_1__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_4_0_1()); 
            // InternalProblem.g:1351:2: ( rule__ClassDeclaration__Group_4_0_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==13||LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalProblem.g:1351:3: rule__ClassDeclaration__Group_4_0_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ClassDeclaration__Group_4_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getClassDeclarationAccess().getGroup_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_4_0__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_4_0__2"
    // InternalProblem.g:1359:1: rule__ClassDeclaration__Group_4_0__2 : rule__ClassDeclaration__Group_4_0__2__Impl ;
    public final void rule__ClassDeclaration__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1363:1: ( rule__ClassDeclaration__Group_4_0__2__Impl )
            // InternalProblem.g:1364:2: rule__ClassDeclaration__Group_4_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_4_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_4_0__2"


    // $ANTLR start "rule__ClassDeclaration__Group_4_0__2__Impl"
    // InternalProblem.g:1370:1: rule__ClassDeclaration__Group_4_0__2__Impl : ( '}' ) ;
    public final void rule__ClassDeclaration__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1374:1: ( ( '}' ) )
            // InternalProblem.g:1375:1: ( '}' )
            {
            // InternalProblem.g:1375:1: ( '}' )
            // InternalProblem.g:1376:2: '}'
            {
             before(grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_4_0_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_4_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_4_0__2__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_4_0_1__0"
    // InternalProblem.g:1386:1: rule__ClassDeclaration__Group_4_0_1__0 : rule__ClassDeclaration__Group_4_0_1__0__Impl rule__ClassDeclaration__Group_4_0_1__1 ;
    public final void rule__ClassDeclaration__Group_4_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1390:1: ( rule__ClassDeclaration__Group_4_0_1__0__Impl rule__ClassDeclaration__Group_4_0_1__1 )
            // InternalProblem.g:1391:2: rule__ClassDeclaration__Group_4_0_1__0__Impl rule__ClassDeclaration__Group_4_0_1__1
            {
            pushFollow(FOLLOW_14);
            rule__ClassDeclaration__Group_4_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_4_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_4_0_1__0"


    // $ANTLR start "rule__ClassDeclaration__Group_4_0_1__0__Impl"
    // InternalProblem.g:1398:1: rule__ClassDeclaration__Group_4_0_1__0__Impl : ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 ) ) ;
    public final void rule__ClassDeclaration__Group_4_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1402:1: ( ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 ) ) )
            // InternalProblem.g:1403:1: ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 ) )
            {
            // InternalProblem.g:1403:1: ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 ) )
            // InternalProblem.g:1404:2: ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsAssignment_4_0_1_0()); 
            // InternalProblem.g:1405:2: ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 )
            // InternalProblem.g:1405:3: rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsAssignment_4_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_4_0_1__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group_4_0_1__1"
    // InternalProblem.g:1413:1: rule__ClassDeclaration__Group_4_0_1__1 : rule__ClassDeclaration__Group_4_0_1__1__Impl ;
    public final void rule__ClassDeclaration__Group_4_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1417:1: ( rule__ClassDeclaration__Group_4_0_1__1__Impl )
            // InternalProblem.g:1418:2: rule__ClassDeclaration__Group_4_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group_4_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_4_0_1__1"


    // $ANTLR start "rule__ClassDeclaration__Group_4_0_1__1__Impl"
    // InternalProblem.g:1424:1: rule__ClassDeclaration__Group_4_0_1__1__Impl : ( ( ';' )? ) ;
    public final void rule__ClassDeclaration__Group_4_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1428:1: ( ( ( ';' )? ) )
            // InternalProblem.g:1429:1: ( ( ';' )? )
            {
            // InternalProblem.g:1429:1: ( ( ';' )? )
            // InternalProblem.g:1430:2: ( ';' )?
            {
             before(grammarAccess.getClassDeclarationAccess().getSemicolonKeyword_4_0_1_1()); 
            // InternalProblem.g:1431:2: ( ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProblem.g:1431:3: ';'
                    {
                    match(input,28,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getClassDeclarationAccess().getSemicolonKeyword_4_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group_4_0_1__1__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group__0"
    // InternalProblem.g:1440:1: rule__ReferenceDeclaration__Group__0 : rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1 ;
    public final void rule__ReferenceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1444:1: ( rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1 )
            // InternalProblem.g:1445:2: rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalProblem.g:1452:1: rule__ReferenceDeclaration__Group__0__Impl : ( ( rule__ReferenceDeclaration__Alternatives_0 ) ) ;
    public final void rule__ReferenceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1456:1: ( ( ( rule__ReferenceDeclaration__Alternatives_0 ) ) )
            // InternalProblem.g:1457:1: ( ( rule__ReferenceDeclaration__Alternatives_0 ) )
            {
            // InternalProblem.g:1457:1: ( ( rule__ReferenceDeclaration__Alternatives_0 ) )
            // InternalProblem.g:1458:2: ( rule__ReferenceDeclaration__Alternatives_0 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getAlternatives_0()); 
            // InternalProblem.g:1459:2: ( rule__ReferenceDeclaration__Alternatives_0 )
            // InternalProblem.g:1459:3: rule__ReferenceDeclaration__Alternatives_0
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
    // InternalProblem.g:1467:1: rule__ReferenceDeclaration__Group__1 : rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2 ;
    public final void rule__ReferenceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1471:1: ( rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2 )
            // InternalProblem.g:1472:2: rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalProblem.g:1479:1: rule__ReferenceDeclaration__Group__1__Impl : ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) ) ;
    public final void rule__ReferenceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1483:1: ( ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) ) )
            // InternalProblem.g:1484:1: ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) )
            {
            // InternalProblem.g:1484:1: ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) )
            // InternalProblem.g:1485:2: ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeAssignment_1()); 
            // InternalProblem.g:1486:2: ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 )
            // InternalProblem.g:1486:3: rule__ReferenceDeclaration__ReferenceTypeAssignment_1
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
    // InternalProblem.g:1494:1: rule__ReferenceDeclaration__Group__2 : rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3 ;
    public final void rule__ReferenceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1498:1: ( rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3 )
            // InternalProblem.g:1499:2: rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalProblem.g:1506:1: rule__ReferenceDeclaration__Group__2__Impl : ( ( rule__ReferenceDeclaration__Group_2__0 )? ) ;
    public final void rule__ReferenceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1510:1: ( ( ( rule__ReferenceDeclaration__Group_2__0 )? ) )
            // InternalProblem.g:1511:1: ( ( rule__ReferenceDeclaration__Group_2__0 )? )
            {
            // InternalProblem.g:1511:1: ( ( rule__ReferenceDeclaration__Group_2__0 )? )
            // InternalProblem.g:1512:2: ( rule__ReferenceDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getReferenceDeclarationAccess().getGroup_2()); 
            // InternalProblem.g:1513:2: ( rule__ReferenceDeclaration__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalProblem.g:1513:3: rule__ReferenceDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceDeclarationAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalProblem.g:1521:1: rule__ReferenceDeclaration__Group__3 : rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4 ;
    public final void rule__ReferenceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1525:1: ( rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4 )
            // InternalProblem.g:1526:2: rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalProblem.g:1533:1: rule__ReferenceDeclaration__Group__3__Impl : ( ( rule__ReferenceDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ReferenceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1537:1: ( ( ( rule__ReferenceDeclaration__NameAssignment_3 ) ) )
            // InternalProblem.g:1538:1: ( ( rule__ReferenceDeclaration__NameAssignment_3 ) )
            {
            // InternalProblem.g:1538:1: ( ( rule__ReferenceDeclaration__NameAssignment_3 ) )
            // InternalProblem.g:1539:2: ( rule__ReferenceDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getNameAssignment_3()); 
            // InternalProblem.g:1540:2: ( rule__ReferenceDeclaration__NameAssignment_3 )
            // InternalProblem.g:1540:3: rule__ReferenceDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceDeclarationAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalProblem.g:1548:1: rule__ReferenceDeclaration__Group__4 : rule__ReferenceDeclaration__Group__4__Impl ;
    public final void rule__ReferenceDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1552:1: ( rule__ReferenceDeclaration__Group__4__Impl )
            // InternalProblem.g:1553:2: rule__ReferenceDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalProblem.g:1559:1: rule__ReferenceDeclaration__Group__4__Impl : ( ( rule__ReferenceDeclaration__Group_4__0 )? ) ;
    public final void rule__ReferenceDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1563:1: ( ( ( rule__ReferenceDeclaration__Group_4__0 )? ) )
            // InternalProblem.g:1564:1: ( ( rule__ReferenceDeclaration__Group_4__0 )? )
            {
            // InternalProblem.g:1564:1: ( ( rule__ReferenceDeclaration__Group_4__0 )? )
            // InternalProblem.g:1565:2: ( rule__ReferenceDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getReferenceDeclarationAccess().getGroup_4()); 
            // InternalProblem.g:1566:2: ( rule__ReferenceDeclaration__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProblem.g:1566:3: rule__ReferenceDeclaration__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceDeclaration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceDeclarationAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ReferenceDeclaration__Group_2__0"
    // InternalProblem.g:1575:1: rule__ReferenceDeclaration__Group_2__0 : rule__ReferenceDeclaration__Group_2__0__Impl rule__ReferenceDeclaration__Group_2__1 ;
    public final void rule__ReferenceDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1579:1: ( rule__ReferenceDeclaration__Group_2__0__Impl rule__ReferenceDeclaration__Group_2__1 )
            // InternalProblem.g:1580:2: rule__ReferenceDeclaration__Group_2__0__Impl rule__ReferenceDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_17);
            rule__ReferenceDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group_2__0"


    // $ANTLR start "rule__ReferenceDeclaration__Group_2__0__Impl"
    // InternalProblem.g:1587:1: rule__ReferenceDeclaration__Group_2__0__Impl : ( '[' ) ;
    public final void rule__ReferenceDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1591:1: ( ( '[' ) )
            // InternalProblem.g:1592:1: ( '[' )
            {
            // InternalProblem.g:1592:1: ( '[' )
            // InternalProblem.g:1593:2: '['
            {
             before(grammarAccess.getReferenceDeclarationAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getReferenceDeclarationAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group_2__1"
    // InternalProblem.g:1602:1: rule__ReferenceDeclaration__Group_2__1 : rule__ReferenceDeclaration__Group_2__1__Impl rule__ReferenceDeclaration__Group_2__2 ;
    public final void rule__ReferenceDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1606:1: ( rule__ReferenceDeclaration__Group_2__1__Impl rule__ReferenceDeclaration__Group_2__2 )
            // InternalProblem.g:1607:2: rule__ReferenceDeclaration__Group_2__1__Impl rule__ReferenceDeclaration__Group_2__2
            {
            pushFollow(FOLLOW_18);
            rule__ReferenceDeclaration__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group_2__1"


    // $ANTLR start "rule__ReferenceDeclaration__Group_2__1__Impl"
    // InternalProblem.g:1614:1: rule__ReferenceDeclaration__Group_2__1__Impl : ( ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 ) ) ;
    public final void rule__ReferenceDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1618:1: ( ( ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 ) ) )
            // InternalProblem.g:1619:1: ( ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 ) )
            {
            // InternalProblem.g:1619:1: ( ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 ) )
            // InternalProblem.g:1620:2: ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getMultiplicityAssignment_2_1()); 
            // InternalProblem.g:1621:2: ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 )
            // InternalProblem.g:1621:3: rule__ReferenceDeclaration__MultiplicityAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__MultiplicityAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceDeclarationAccess().getMultiplicityAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group_2__2"
    // InternalProblem.g:1629:1: rule__ReferenceDeclaration__Group_2__2 : rule__ReferenceDeclaration__Group_2__2__Impl ;
    public final void rule__ReferenceDeclaration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1633:1: ( rule__ReferenceDeclaration__Group_2__2__Impl )
            // InternalProblem.g:1634:2: rule__ReferenceDeclaration__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group_2__2"


    // $ANTLR start "rule__ReferenceDeclaration__Group_2__2__Impl"
    // InternalProblem.g:1640:1: rule__ReferenceDeclaration__Group_2__2__Impl : ( ']' ) ;
    public final void rule__ReferenceDeclaration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1644:1: ( ( ']' ) )
            // InternalProblem.g:1645:1: ( ']' )
            {
            // InternalProblem.g:1645:1: ( ']' )
            // InternalProblem.g:1646:2: ']'
            {
             before(grammarAccess.getReferenceDeclarationAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getReferenceDeclarationAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group_2__2__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group_4__0"
    // InternalProblem.g:1656:1: rule__ReferenceDeclaration__Group_4__0 : rule__ReferenceDeclaration__Group_4__0__Impl rule__ReferenceDeclaration__Group_4__1 ;
    public final void rule__ReferenceDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1660:1: ( rule__ReferenceDeclaration__Group_4__0__Impl rule__ReferenceDeclaration__Group_4__1 )
            // InternalProblem.g:1661:2: rule__ReferenceDeclaration__Group_4__0__Impl rule__ReferenceDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__ReferenceDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group_4__0"


    // $ANTLR start "rule__ReferenceDeclaration__Group_4__0__Impl"
    // InternalProblem.g:1668:1: rule__ReferenceDeclaration__Group_4__0__Impl : ( 'opposite' ) ;
    public final void rule__ReferenceDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1672:1: ( ( 'opposite' ) )
            // InternalProblem.g:1673:1: ( 'opposite' )
            {
            // InternalProblem.g:1673:1: ( 'opposite' )
            // InternalProblem.g:1674:2: 'opposite'
            {
             before(grammarAccess.getReferenceDeclarationAccess().getOppositeKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getReferenceDeclarationAccess().getOppositeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group_4__1"
    // InternalProblem.g:1683:1: rule__ReferenceDeclaration__Group_4__1 : rule__ReferenceDeclaration__Group_4__1__Impl ;
    public final void rule__ReferenceDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1687:1: ( rule__ReferenceDeclaration__Group_4__1__Impl )
            // InternalProblem.g:1688:2: rule__ReferenceDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group_4__1"


    // $ANTLR start "rule__ReferenceDeclaration__Group_4__1__Impl"
    // InternalProblem.g:1694:1: rule__ReferenceDeclaration__Group_4__1__Impl : ( ( rule__ReferenceDeclaration__OppositeAssignment_4_1 ) ) ;
    public final void rule__ReferenceDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1698:1: ( ( ( rule__ReferenceDeclaration__OppositeAssignment_4_1 ) ) )
            // InternalProblem.g:1699:1: ( ( rule__ReferenceDeclaration__OppositeAssignment_4_1 ) )
            {
            // InternalProblem.g:1699:1: ( ( rule__ReferenceDeclaration__OppositeAssignment_4_1 ) )
            // InternalProblem.g:1700:2: ( rule__ReferenceDeclaration__OppositeAssignment_4_1 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getOppositeAssignment_4_1()); 
            // InternalProblem.g:1701:2: ( rule__ReferenceDeclaration__OppositeAssignment_4_1 )
            // InternalProblem.g:1701:3: rule__ReferenceDeclaration__OppositeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceDeclaration__OppositeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceDeclarationAccess().getOppositeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__PredicateDefinition__Group__0"
    // InternalProblem.g:1710:1: rule__PredicateDefinition__Group__0 : rule__PredicateDefinition__Group__0__Impl rule__PredicateDefinition__Group__1 ;
    public final void rule__PredicateDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1714:1: ( rule__PredicateDefinition__Group__0__Impl rule__PredicateDefinition__Group__1 )
            // InternalProblem.g:1715:2: rule__PredicateDefinition__Group__0__Impl rule__PredicateDefinition__Group__1
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
    // InternalProblem.g:1722:1: rule__PredicateDefinition__Group__0__Impl : ( ( rule__PredicateDefinition__Alternatives_0 ) ) ;
    public final void rule__PredicateDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1726:1: ( ( ( rule__PredicateDefinition__Alternatives_0 ) ) )
            // InternalProblem.g:1727:1: ( ( rule__PredicateDefinition__Alternatives_0 ) )
            {
            // InternalProblem.g:1727:1: ( ( rule__PredicateDefinition__Alternatives_0 ) )
            // InternalProblem.g:1728:2: ( rule__PredicateDefinition__Alternatives_0 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getAlternatives_0()); 
            // InternalProblem.g:1729:2: ( rule__PredicateDefinition__Alternatives_0 )
            // InternalProblem.g:1729:3: rule__PredicateDefinition__Alternatives_0
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
    // InternalProblem.g:1737:1: rule__PredicateDefinition__Group__1 : rule__PredicateDefinition__Group__1__Impl rule__PredicateDefinition__Group__2 ;
    public final void rule__PredicateDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1741:1: ( rule__PredicateDefinition__Group__1__Impl rule__PredicateDefinition__Group__2 )
            // InternalProblem.g:1742:2: rule__PredicateDefinition__Group__1__Impl rule__PredicateDefinition__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalProblem.g:1749:1: rule__PredicateDefinition__Group__1__Impl : ( ( rule__PredicateDefinition__NameAssignment_1 ) ) ;
    public final void rule__PredicateDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1753:1: ( ( ( rule__PredicateDefinition__NameAssignment_1 ) ) )
            // InternalProblem.g:1754:1: ( ( rule__PredicateDefinition__NameAssignment_1 ) )
            {
            // InternalProblem.g:1754:1: ( ( rule__PredicateDefinition__NameAssignment_1 ) )
            // InternalProblem.g:1755:2: ( rule__PredicateDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getNameAssignment_1()); 
            // InternalProblem.g:1756:2: ( rule__PredicateDefinition__NameAssignment_1 )
            // InternalProblem.g:1756:3: rule__PredicateDefinition__NameAssignment_1
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
    // InternalProblem.g:1764:1: rule__PredicateDefinition__Group__2 : rule__PredicateDefinition__Group__2__Impl rule__PredicateDefinition__Group__3 ;
    public final void rule__PredicateDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1768:1: ( rule__PredicateDefinition__Group__2__Impl rule__PredicateDefinition__Group__3 )
            // InternalProblem.g:1769:2: rule__PredicateDefinition__Group__2__Impl rule__PredicateDefinition__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalProblem.g:1776:1: rule__PredicateDefinition__Group__2__Impl : ( '(' ) ;
    public final void rule__PredicateDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1780:1: ( ( '(' ) )
            // InternalProblem.g:1781:1: ( '(' )
            {
            // InternalProblem.g:1781:1: ( '(' )
            // InternalProblem.g:1782:2: '('
            {
             before(grammarAccess.getPredicateDefinitionAccess().getLeftParenthesisKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalProblem.g:1791:1: rule__PredicateDefinition__Group__3 : rule__PredicateDefinition__Group__3__Impl rule__PredicateDefinition__Group__4 ;
    public final void rule__PredicateDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1795:1: ( rule__PredicateDefinition__Group__3__Impl rule__PredicateDefinition__Group__4 )
            // InternalProblem.g:1796:2: rule__PredicateDefinition__Group__3__Impl rule__PredicateDefinition__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalProblem.g:1803:1: rule__PredicateDefinition__Group__3__Impl : ( ( rule__PredicateDefinition__Group_3__0 )? ) ;
    public final void rule__PredicateDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1807:1: ( ( ( rule__PredicateDefinition__Group_3__0 )? ) )
            // InternalProblem.g:1808:1: ( ( rule__PredicateDefinition__Group_3__0 )? )
            {
            // InternalProblem.g:1808:1: ( ( rule__PredicateDefinition__Group_3__0 )? )
            // InternalProblem.g:1809:2: ( rule__PredicateDefinition__Group_3__0 )?
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_3()); 
            // InternalProblem.g:1810:2: ( rule__PredicateDefinition__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalProblem.g:1810:3: rule__PredicateDefinition__Group_3__0
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
    // InternalProblem.g:1818:1: rule__PredicateDefinition__Group__4 : rule__PredicateDefinition__Group__4__Impl rule__PredicateDefinition__Group__5 ;
    public final void rule__PredicateDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1822:1: ( rule__PredicateDefinition__Group__4__Impl rule__PredicateDefinition__Group__5 )
            // InternalProblem.g:1823:2: rule__PredicateDefinition__Group__4__Impl rule__PredicateDefinition__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalProblem.g:1830:1: rule__PredicateDefinition__Group__4__Impl : ( ')' ) ;
    public final void rule__PredicateDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1834:1: ( ( ')' ) )
            // InternalProblem.g:1835:1: ( ')' )
            {
            // InternalProblem.g:1835:1: ( ')' )
            // InternalProblem.g:1836:2: ')'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalProblem.g:1845:1: rule__PredicateDefinition__Group__5 : rule__PredicateDefinition__Group__5__Impl rule__PredicateDefinition__Group__6 ;
    public final void rule__PredicateDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1849:1: ( rule__PredicateDefinition__Group__5__Impl rule__PredicateDefinition__Group__6 )
            // InternalProblem.g:1850:2: rule__PredicateDefinition__Group__5__Impl rule__PredicateDefinition__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalProblem.g:1857:1: rule__PredicateDefinition__Group__5__Impl : ( ( rule__PredicateDefinition__Group_5__0 )? ) ;
    public final void rule__PredicateDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1861:1: ( ( ( rule__PredicateDefinition__Group_5__0 )? ) )
            // InternalProblem.g:1862:1: ( ( rule__PredicateDefinition__Group_5__0 )? )
            {
            // InternalProblem.g:1862:1: ( ( rule__PredicateDefinition__Group_5__0 )? )
            // InternalProblem.g:1863:2: ( rule__PredicateDefinition__Group_5__0 )?
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_5()); 
            // InternalProblem.g:1864:2: ( rule__PredicateDefinition__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProblem.g:1864:3: rule__PredicateDefinition__Group_5__0
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
    // InternalProblem.g:1872:1: rule__PredicateDefinition__Group__6 : rule__PredicateDefinition__Group__6__Impl ;
    public final void rule__PredicateDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1876:1: ( rule__PredicateDefinition__Group__6__Impl )
            // InternalProblem.g:1877:2: rule__PredicateDefinition__Group__6__Impl
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
    // InternalProblem.g:1883:1: rule__PredicateDefinition__Group__6__Impl : ( '.' ) ;
    public final void rule__PredicateDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1887:1: ( ( '.' ) )
            // InternalProblem.g:1888:1: ( '.' )
            {
            // InternalProblem.g:1888:1: ( '.' )
            // InternalProblem.g:1889:2: '.'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getFullStopKeyword_6()); 
            match(input,12,FOLLOW_2); 
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
    // InternalProblem.g:1899:1: rule__PredicateDefinition__Group_0_0__0 : rule__PredicateDefinition__Group_0_0__0__Impl rule__PredicateDefinition__Group_0_0__1 ;
    public final void rule__PredicateDefinition__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1903:1: ( rule__PredicateDefinition__Group_0_0__0__Impl rule__PredicateDefinition__Group_0_0__1 )
            // InternalProblem.g:1904:2: rule__PredicateDefinition__Group_0_0__0__Impl rule__PredicateDefinition__Group_0_0__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalProblem.g:1911:1: rule__PredicateDefinition__Group_0_0__0__Impl : ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) ) ;
    public final void rule__PredicateDefinition__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1915:1: ( ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) ) )
            // InternalProblem.g:1916:1: ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) )
            {
            // InternalProblem.g:1916:1: ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) )
            // InternalProblem.g:1917:2: ( rule__PredicateDefinition__ErrorAssignment_0_0_0 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getErrorAssignment_0_0_0()); 
            // InternalProblem.g:1918:2: ( rule__PredicateDefinition__ErrorAssignment_0_0_0 )
            // InternalProblem.g:1918:3: rule__PredicateDefinition__ErrorAssignment_0_0_0
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
    // InternalProblem.g:1926:1: rule__PredicateDefinition__Group_0_0__1 : rule__PredicateDefinition__Group_0_0__1__Impl ;
    public final void rule__PredicateDefinition__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1930:1: ( rule__PredicateDefinition__Group_0_0__1__Impl )
            // InternalProblem.g:1931:2: rule__PredicateDefinition__Group_0_0__1__Impl
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
    // InternalProblem.g:1937:1: rule__PredicateDefinition__Group_0_0__1__Impl : ( ( 'pred' )? ) ;
    public final void rule__PredicateDefinition__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1941:1: ( ( ( 'pred' )? ) )
            // InternalProblem.g:1942:1: ( ( 'pred' )? )
            {
            // InternalProblem.g:1942:1: ( ( 'pred' )? )
            // InternalProblem.g:1943:2: ( 'pred' )?
            {
             before(grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_0_1()); 
            // InternalProblem.g:1944:2: ( 'pred' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==14) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalProblem.g:1944:3: 'pred'
                    {
                    match(input,14,FOLLOW_2); 

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
    // InternalProblem.g:1953:1: rule__PredicateDefinition__Group_3__0 : rule__PredicateDefinition__Group_3__0__Impl rule__PredicateDefinition__Group_3__1 ;
    public final void rule__PredicateDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1957:1: ( rule__PredicateDefinition__Group_3__0__Impl rule__PredicateDefinition__Group_3__1 )
            // InternalProblem.g:1958:2: rule__PredicateDefinition__Group_3__0__Impl rule__PredicateDefinition__Group_3__1
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
    // InternalProblem.g:1965:1: rule__PredicateDefinition__Group_3__0__Impl : ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) ) ;
    public final void rule__PredicateDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1969:1: ( ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) ) )
            // InternalProblem.g:1970:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) )
            {
            // InternalProblem.g:1970:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) )
            // InternalProblem.g:1971:2: ( rule__PredicateDefinition__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getParametersAssignment_3_0()); 
            // InternalProblem.g:1972:2: ( rule__PredicateDefinition__ParametersAssignment_3_0 )
            // InternalProblem.g:1972:3: rule__PredicateDefinition__ParametersAssignment_3_0
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
    // InternalProblem.g:1980:1: rule__PredicateDefinition__Group_3__1 : rule__PredicateDefinition__Group_3__1__Impl ;
    public final void rule__PredicateDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1984:1: ( rule__PredicateDefinition__Group_3__1__Impl )
            // InternalProblem.g:1985:2: rule__PredicateDefinition__Group_3__1__Impl
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
    // InternalProblem.g:1991:1: rule__PredicateDefinition__Group_3__1__Impl : ( ( rule__PredicateDefinition__Group_3_1__0 )* ) ;
    public final void rule__PredicateDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1995:1: ( ( ( rule__PredicateDefinition__Group_3_1__0 )* ) )
            // InternalProblem.g:1996:1: ( ( rule__PredicateDefinition__Group_3_1__0 )* )
            {
            // InternalProblem.g:1996:1: ( ( rule__PredicateDefinition__Group_3_1__0 )* )
            // InternalProblem.g:1997:2: ( rule__PredicateDefinition__Group_3_1__0 )*
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_3_1()); 
            // InternalProblem.g:1998:2: ( rule__PredicateDefinition__Group_3_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==25) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalProblem.g:1998:3: rule__PredicateDefinition__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PredicateDefinition__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalProblem.g:2007:1: rule__PredicateDefinition__Group_3_1__0 : rule__PredicateDefinition__Group_3_1__0__Impl rule__PredicateDefinition__Group_3_1__1 ;
    public final void rule__PredicateDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2011:1: ( rule__PredicateDefinition__Group_3_1__0__Impl rule__PredicateDefinition__Group_3_1__1 )
            // InternalProblem.g:2012:2: rule__PredicateDefinition__Group_3_1__0__Impl rule__PredicateDefinition__Group_3_1__1
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
    // InternalProblem.g:2019:1: rule__PredicateDefinition__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__PredicateDefinition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2023:1: ( ( ',' ) )
            // InternalProblem.g:2024:1: ( ',' )
            {
            // InternalProblem.g:2024:1: ( ',' )
            // InternalProblem.g:2025:2: ','
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
    // InternalProblem.g:2034:1: rule__PredicateDefinition__Group_3_1__1 : rule__PredicateDefinition__Group_3_1__1__Impl ;
    public final void rule__PredicateDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2038:1: ( rule__PredicateDefinition__Group_3_1__1__Impl )
            // InternalProblem.g:2039:2: rule__PredicateDefinition__Group_3_1__1__Impl
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
    // InternalProblem.g:2045:1: rule__PredicateDefinition__Group_3_1__1__Impl : ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__PredicateDefinition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2049:1: ( ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) ) )
            // InternalProblem.g:2050:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) )
            {
            // InternalProblem.g:2050:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) )
            // InternalProblem.g:2051:2: ( rule__PredicateDefinition__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getParametersAssignment_3_1_1()); 
            // InternalProblem.g:2052:2: ( rule__PredicateDefinition__ParametersAssignment_3_1_1 )
            // InternalProblem.g:2052:3: rule__PredicateDefinition__ParametersAssignment_3_1_1
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
    // InternalProblem.g:2061:1: rule__PredicateDefinition__Group_5__0 : rule__PredicateDefinition__Group_5__0__Impl rule__PredicateDefinition__Group_5__1 ;
    public final void rule__PredicateDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2065:1: ( rule__PredicateDefinition__Group_5__0__Impl rule__PredicateDefinition__Group_5__1 )
            // InternalProblem.g:2066:2: rule__PredicateDefinition__Group_5__0__Impl rule__PredicateDefinition__Group_5__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalProblem.g:2073:1: rule__PredicateDefinition__Group_5__0__Impl : ( ':-' ) ;
    public final void rule__PredicateDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2077:1: ( ( ':-' ) )
            // InternalProblem.g:2078:1: ( ':-' )
            {
            // InternalProblem.g:2078:1: ( ':-' )
            // InternalProblem.g:2079:2: ':-'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getColonHyphenMinusKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPredicateDefinitionAccess().getColonHyphenMinusKeyword_5_0()); 

            }


            }

        }
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
    // InternalProblem.g:2088:1: rule__PredicateDefinition__Group_5__1 : rule__PredicateDefinition__Group_5__1__Impl rule__PredicateDefinition__Group_5__2 ;
    public final void rule__PredicateDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2092:1: ( rule__PredicateDefinition__Group_5__1__Impl rule__PredicateDefinition__Group_5__2 )
            // InternalProblem.g:2093:2: rule__PredicateDefinition__Group_5__1__Impl rule__PredicateDefinition__Group_5__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalProblem.g:2100:1: rule__PredicateDefinition__Group_5__1__Impl : ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) ) ;
    public final void rule__PredicateDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2104:1: ( ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) ) )
            // InternalProblem.g:2105:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) )
            {
            // InternalProblem.g:2105:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) )
            // InternalProblem.g:2106:2: ( rule__PredicateDefinition__BodiesAssignment_5_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getBodiesAssignment_5_1()); 
            // InternalProblem.g:2107:2: ( rule__PredicateDefinition__BodiesAssignment_5_1 )
            // InternalProblem.g:2107:3: rule__PredicateDefinition__BodiesAssignment_5_1
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
    // InternalProblem.g:2115:1: rule__PredicateDefinition__Group_5__2 : rule__PredicateDefinition__Group_5__2__Impl ;
    public final void rule__PredicateDefinition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2119:1: ( rule__PredicateDefinition__Group_5__2__Impl )
            // InternalProblem.g:2120:2: rule__PredicateDefinition__Group_5__2__Impl
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
    // InternalProblem.g:2126:1: rule__PredicateDefinition__Group_5__2__Impl : ( ( rule__PredicateDefinition__Group_5_2__0 )* ) ;
    public final void rule__PredicateDefinition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2130:1: ( ( ( rule__PredicateDefinition__Group_5_2__0 )* ) )
            // InternalProblem.g:2131:1: ( ( rule__PredicateDefinition__Group_5_2__0 )* )
            {
            // InternalProblem.g:2131:1: ( ( rule__PredicateDefinition__Group_5_2__0 )* )
            // InternalProblem.g:2132:2: ( rule__PredicateDefinition__Group_5_2__0 )*
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_5_2()); 
            // InternalProblem.g:2133:2: ( rule__PredicateDefinition__Group_5_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==28) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalProblem.g:2133:3: rule__PredicateDefinition__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__PredicateDefinition__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalProblem.g:2142:1: rule__PredicateDefinition__Group_5_2__0 : rule__PredicateDefinition__Group_5_2__0__Impl rule__PredicateDefinition__Group_5_2__1 ;
    public final void rule__PredicateDefinition__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2146:1: ( rule__PredicateDefinition__Group_5_2__0__Impl rule__PredicateDefinition__Group_5_2__1 )
            // InternalProblem.g:2147:2: rule__PredicateDefinition__Group_5_2__0__Impl rule__PredicateDefinition__Group_5_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalProblem.g:2154:1: rule__PredicateDefinition__Group_5_2__0__Impl : ( ';' ) ;
    public final void rule__PredicateDefinition__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2158:1: ( ( ';' ) )
            // InternalProblem.g:2159:1: ( ';' )
            {
            // InternalProblem.g:2159:1: ( ';' )
            // InternalProblem.g:2160:2: ';'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getSemicolonKeyword_5_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalProblem.g:2169:1: rule__PredicateDefinition__Group_5_2__1 : rule__PredicateDefinition__Group_5_2__1__Impl ;
    public final void rule__PredicateDefinition__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2173:1: ( rule__PredicateDefinition__Group_5_2__1__Impl )
            // InternalProblem.g:2174:2: rule__PredicateDefinition__Group_5_2__1__Impl
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
    // InternalProblem.g:2180:1: rule__PredicateDefinition__Group_5_2__1__Impl : ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) ) ;
    public final void rule__PredicateDefinition__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2184:1: ( ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) ) )
            // InternalProblem.g:2185:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) )
            {
            // InternalProblem.g:2185:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) )
            // InternalProblem.g:2186:2: ( rule__PredicateDefinition__BodiesAssignment_5_2_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getBodiesAssignment_5_2_1()); 
            // InternalProblem.g:2187:2: ( rule__PredicateDefinition__BodiesAssignment_5_2_1 )
            // InternalProblem.g:2187:3: rule__PredicateDefinition__BodiesAssignment_5_2_1
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
    // InternalProblem.g:2196:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2200:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalProblem.g:2201:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalProblem.g:2208:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__ParameterTypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2212:1: ( ( ( rule__Parameter__ParameterTypeAssignment_0 ) ) )
            // InternalProblem.g:2213:1: ( ( rule__Parameter__ParameterTypeAssignment_0 ) )
            {
            // InternalProblem.g:2213:1: ( ( rule__Parameter__ParameterTypeAssignment_0 ) )
            // InternalProblem.g:2214:2: ( rule__Parameter__ParameterTypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getParameterTypeAssignment_0()); 
            // InternalProblem.g:2215:2: ( rule__Parameter__ParameterTypeAssignment_0 )
            // InternalProblem.g:2215:3: rule__Parameter__ParameterTypeAssignment_0
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
    // InternalProblem.g:2223:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2227:1: ( rule__Parameter__Group__1__Impl )
            // InternalProblem.g:2228:2: rule__Parameter__Group__1__Impl
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
    // InternalProblem.g:2234:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2238:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalProblem.g:2239:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalProblem.g:2239:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalProblem.g:2240:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalProblem.g:2241:2: ( rule__Parameter__NameAssignment_1 )
            // InternalProblem.g:2241:3: rule__Parameter__NameAssignment_1
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
    // InternalProblem.g:2250:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2254:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // InternalProblem.g:2255:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
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
    // InternalProblem.g:2262:1: rule__Conjunction__Group__0__Impl : ( ( rule__Conjunction__LiteralsAssignment_0 ) ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2266:1: ( ( ( rule__Conjunction__LiteralsAssignment_0 ) ) )
            // InternalProblem.g:2267:1: ( ( rule__Conjunction__LiteralsAssignment_0 ) )
            {
            // InternalProblem.g:2267:1: ( ( rule__Conjunction__LiteralsAssignment_0 ) )
            // InternalProblem.g:2268:2: ( rule__Conjunction__LiteralsAssignment_0 )
            {
             before(grammarAccess.getConjunctionAccess().getLiteralsAssignment_0()); 
            // InternalProblem.g:2269:2: ( rule__Conjunction__LiteralsAssignment_0 )
            // InternalProblem.g:2269:3: rule__Conjunction__LiteralsAssignment_0
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
    // InternalProblem.g:2277:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2281:1: ( rule__Conjunction__Group__1__Impl )
            // InternalProblem.g:2282:2: rule__Conjunction__Group__1__Impl
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
    // InternalProblem.g:2288:1: rule__Conjunction__Group__1__Impl : ( ( rule__Conjunction__Group_1__0 )* ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2292:1: ( ( ( rule__Conjunction__Group_1__0 )* ) )
            // InternalProblem.g:2293:1: ( ( rule__Conjunction__Group_1__0 )* )
            {
            // InternalProblem.g:2293:1: ( ( rule__Conjunction__Group_1__0 )* )
            // InternalProblem.g:2294:2: ( rule__Conjunction__Group_1__0 )*
            {
             before(grammarAccess.getConjunctionAccess().getGroup_1()); 
            // InternalProblem.g:2295:2: ( rule__Conjunction__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==25) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalProblem.g:2295:3: rule__Conjunction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Conjunction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalProblem.g:2304:1: rule__Conjunction__Group_1__0 : rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 ;
    public final void rule__Conjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2308:1: ( rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 )
            // InternalProblem.g:2309:2: rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalProblem.g:2316:1: rule__Conjunction__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Conjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2320:1: ( ( ',' ) )
            // InternalProblem.g:2321:1: ( ',' )
            {
            // InternalProblem.g:2321:1: ( ',' )
            // InternalProblem.g:2322:2: ','
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
    // InternalProblem.g:2331:1: rule__Conjunction__Group_1__1 : rule__Conjunction__Group_1__1__Impl ;
    public final void rule__Conjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2335:1: ( rule__Conjunction__Group_1__1__Impl )
            // InternalProblem.g:2336:2: rule__Conjunction__Group_1__1__Impl
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
    // InternalProblem.g:2342:1: rule__Conjunction__Group_1__1__Impl : ( ( rule__Conjunction__LiteralsAssignment_1_1 ) ) ;
    public final void rule__Conjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2346:1: ( ( ( rule__Conjunction__LiteralsAssignment_1_1 ) ) )
            // InternalProblem.g:2347:1: ( ( rule__Conjunction__LiteralsAssignment_1_1 ) )
            {
            // InternalProblem.g:2347:1: ( ( rule__Conjunction__LiteralsAssignment_1_1 ) )
            // InternalProblem.g:2348:2: ( rule__Conjunction__LiteralsAssignment_1_1 )
            {
             before(grammarAccess.getConjunctionAccess().getLiteralsAssignment_1_1()); 
            // InternalProblem.g:2349:2: ( rule__Conjunction__LiteralsAssignment_1_1 )
            // InternalProblem.g:2349:3: rule__Conjunction__LiteralsAssignment_1_1
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
    // InternalProblem.g:2358:1: rule__NegativeLiteral__Group__0 : rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1 ;
    public final void rule__NegativeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2362:1: ( rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1 )
            // InternalProblem.g:2363:2: rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalProblem.g:2370:1: rule__NegativeLiteral__Group__0__Impl : ( '!' ) ;
    public final void rule__NegativeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2374:1: ( ( '!' ) )
            // InternalProblem.g:2375:1: ( '!' )
            {
            // InternalProblem.g:2375:1: ( '!' )
            // InternalProblem.g:2376:2: '!'
            {
             before(grammarAccess.getNegativeLiteralAccess().getExclamationMarkKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalProblem.g:2385:1: rule__NegativeLiteral__Group__1 : rule__NegativeLiteral__Group__1__Impl ;
    public final void rule__NegativeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2389:1: ( rule__NegativeLiteral__Group__1__Impl )
            // InternalProblem.g:2390:2: rule__NegativeLiteral__Group__1__Impl
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
    // InternalProblem.g:2396:1: rule__NegativeLiteral__Group__1__Impl : ( ( rule__NegativeLiteral__AtomAssignment_1 ) ) ;
    public final void rule__NegativeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2400:1: ( ( ( rule__NegativeLiteral__AtomAssignment_1 ) ) )
            // InternalProblem.g:2401:1: ( ( rule__NegativeLiteral__AtomAssignment_1 ) )
            {
            // InternalProblem.g:2401:1: ( ( rule__NegativeLiteral__AtomAssignment_1 ) )
            // InternalProblem.g:2402:2: ( rule__NegativeLiteral__AtomAssignment_1 )
            {
             before(grammarAccess.getNegativeLiteralAccess().getAtomAssignment_1()); 
            // InternalProblem.g:2403:2: ( rule__NegativeLiteral__AtomAssignment_1 )
            // InternalProblem.g:2403:3: rule__NegativeLiteral__AtomAssignment_1
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
    // InternalProblem.g:2412:1: rule__Atom__Group__0 : rule__Atom__Group__0__Impl rule__Atom__Group__1 ;
    public final void rule__Atom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2416:1: ( rule__Atom__Group__0__Impl rule__Atom__Group__1 )
            // InternalProblem.g:2417:2: rule__Atom__Group__0__Impl rule__Atom__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalProblem.g:2424:1: rule__Atom__Group__0__Impl : ( ( rule__Atom__RelationAssignment_0 ) ) ;
    public final void rule__Atom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2428:1: ( ( ( rule__Atom__RelationAssignment_0 ) ) )
            // InternalProblem.g:2429:1: ( ( rule__Atom__RelationAssignment_0 ) )
            {
            // InternalProblem.g:2429:1: ( ( rule__Atom__RelationAssignment_0 ) )
            // InternalProblem.g:2430:2: ( rule__Atom__RelationAssignment_0 )
            {
             before(grammarAccess.getAtomAccess().getRelationAssignment_0()); 
            // InternalProblem.g:2431:2: ( rule__Atom__RelationAssignment_0 )
            // InternalProblem.g:2431:3: rule__Atom__RelationAssignment_0
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
    // InternalProblem.g:2439:1: rule__Atom__Group__1 : rule__Atom__Group__1__Impl rule__Atom__Group__2 ;
    public final void rule__Atom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2443:1: ( rule__Atom__Group__1__Impl rule__Atom__Group__2 )
            // InternalProblem.g:2444:2: rule__Atom__Group__1__Impl rule__Atom__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalProblem.g:2451:1: rule__Atom__Group__1__Impl : ( ( rule__Atom__TransitiveClosureAssignment_1 )? ) ;
    public final void rule__Atom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2455:1: ( ( ( rule__Atom__TransitiveClosureAssignment_1 )? ) )
            // InternalProblem.g:2456:1: ( ( rule__Atom__TransitiveClosureAssignment_1 )? )
            {
            // InternalProblem.g:2456:1: ( ( rule__Atom__TransitiveClosureAssignment_1 )? )
            // InternalProblem.g:2457:2: ( rule__Atom__TransitiveClosureAssignment_1 )?
            {
             before(grammarAccess.getAtomAccess().getTransitiveClosureAssignment_1()); 
            // InternalProblem.g:2458:2: ( rule__Atom__TransitiveClosureAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalProblem.g:2458:3: rule__Atom__TransitiveClosureAssignment_1
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
    // InternalProblem.g:2466:1: rule__Atom__Group__2 : rule__Atom__Group__2__Impl rule__Atom__Group__3 ;
    public final void rule__Atom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2470:1: ( rule__Atom__Group__2__Impl rule__Atom__Group__3 )
            // InternalProblem.g:2471:2: rule__Atom__Group__2__Impl rule__Atom__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalProblem.g:2478:1: rule__Atom__Group__2__Impl : ( '(' ) ;
    public final void rule__Atom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2482:1: ( ( '(' ) )
            // InternalProblem.g:2483:1: ( '(' )
            {
            // InternalProblem.g:2483:1: ( '(' )
            // InternalProblem.g:2484:2: '('
            {
             before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalProblem.g:2493:1: rule__Atom__Group__3 : rule__Atom__Group__3__Impl rule__Atom__Group__4 ;
    public final void rule__Atom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2497:1: ( rule__Atom__Group__3__Impl rule__Atom__Group__4 )
            // InternalProblem.g:2498:2: rule__Atom__Group__3__Impl rule__Atom__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalProblem.g:2505:1: rule__Atom__Group__3__Impl : ( ( rule__Atom__Group_3__0 )? ) ;
    public final void rule__Atom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2509:1: ( ( ( rule__Atom__Group_3__0 )? ) )
            // InternalProblem.g:2510:1: ( ( rule__Atom__Group_3__0 )? )
            {
            // InternalProblem.g:2510:1: ( ( rule__Atom__Group_3__0 )? )
            // InternalProblem.g:2511:2: ( rule__Atom__Group_3__0 )?
            {
             before(grammarAccess.getAtomAccess().getGroup_3()); 
            // InternalProblem.g:2512:2: ( rule__Atom__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalProblem.g:2512:3: rule__Atom__Group_3__0
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
    // InternalProblem.g:2520:1: rule__Atom__Group__4 : rule__Atom__Group__4__Impl ;
    public final void rule__Atom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2524:1: ( rule__Atom__Group__4__Impl )
            // InternalProblem.g:2525:2: rule__Atom__Group__4__Impl
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
    // InternalProblem.g:2531:1: rule__Atom__Group__4__Impl : ( ')' ) ;
    public final void rule__Atom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2535:1: ( ( ')' ) )
            // InternalProblem.g:2536:1: ( ')' )
            {
            // InternalProblem.g:2536:1: ( ')' )
            // InternalProblem.g:2537:2: ')'
            {
             before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalProblem.g:2547:1: rule__Atom__Group_3__0 : rule__Atom__Group_3__0__Impl rule__Atom__Group_3__1 ;
    public final void rule__Atom__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2551:1: ( rule__Atom__Group_3__0__Impl rule__Atom__Group_3__1 )
            // InternalProblem.g:2552:2: rule__Atom__Group_3__0__Impl rule__Atom__Group_3__1
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
    // InternalProblem.g:2559:1: rule__Atom__Group_3__0__Impl : ( ( rule__Atom__ArgumentsAssignment_3_0 ) ) ;
    public final void rule__Atom__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2563:1: ( ( ( rule__Atom__ArgumentsAssignment_3_0 ) ) )
            // InternalProblem.g:2564:1: ( ( rule__Atom__ArgumentsAssignment_3_0 ) )
            {
            // InternalProblem.g:2564:1: ( ( rule__Atom__ArgumentsAssignment_3_0 ) )
            // InternalProblem.g:2565:2: ( rule__Atom__ArgumentsAssignment_3_0 )
            {
             before(grammarAccess.getAtomAccess().getArgumentsAssignment_3_0()); 
            // InternalProblem.g:2566:2: ( rule__Atom__ArgumentsAssignment_3_0 )
            // InternalProblem.g:2566:3: rule__Atom__ArgumentsAssignment_3_0
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
    // InternalProblem.g:2574:1: rule__Atom__Group_3__1 : rule__Atom__Group_3__1__Impl ;
    public final void rule__Atom__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2578:1: ( rule__Atom__Group_3__1__Impl )
            // InternalProblem.g:2579:2: rule__Atom__Group_3__1__Impl
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
    // InternalProblem.g:2585:1: rule__Atom__Group_3__1__Impl : ( ( rule__Atom__Group_3_1__0 )* ) ;
    public final void rule__Atom__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2589:1: ( ( ( rule__Atom__Group_3_1__0 )* ) )
            // InternalProblem.g:2590:1: ( ( rule__Atom__Group_3_1__0 )* )
            {
            // InternalProblem.g:2590:1: ( ( rule__Atom__Group_3_1__0 )* )
            // InternalProblem.g:2591:2: ( rule__Atom__Group_3_1__0 )*
            {
             before(grammarAccess.getAtomAccess().getGroup_3_1()); 
            // InternalProblem.g:2592:2: ( rule__Atom__Group_3_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==25) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalProblem.g:2592:3: rule__Atom__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Atom__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalProblem.g:2601:1: rule__Atom__Group_3_1__0 : rule__Atom__Group_3_1__0__Impl rule__Atom__Group_3_1__1 ;
    public final void rule__Atom__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2605:1: ( rule__Atom__Group_3_1__0__Impl rule__Atom__Group_3_1__1 )
            // InternalProblem.g:2606:2: rule__Atom__Group_3_1__0__Impl rule__Atom__Group_3_1__1
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
    // InternalProblem.g:2613:1: rule__Atom__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Atom__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2617:1: ( ( ',' ) )
            // InternalProblem.g:2618:1: ( ',' )
            {
            // InternalProblem.g:2618:1: ( ',' )
            // InternalProblem.g:2619:2: ','
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
    // InternalProblem.g:2628:1: rule__Atom__Group_3_1__1 : rule__Atom__Group_3_1__1__Impl ;
    public final void rule__Atom__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2632:1: ( rule__Atom__Group_3_1__1__Impl )
            // InternalProblem.g:2633:2: rule__Atom__Group_3_1__1__Impl
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
    // InternalProblem.g:2639:1: rule__Atom__Group_3_1__1__Impl : ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) ) ;
    public final void rule__Atom__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2643:1: ( ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) ) )
            // InternalProblem.g:2644:1: ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) )
            {
            // InternalProblem.g:2644:1: ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) )
            // InternalProblem.g:2645:2: ( rule__Atom__ArgumentsAssignment_3_1_1 )
            {
             before(grammarAccess.getAtomAccess().getArgumentsAssignment_3_1_1()); 
            // InternalProblem.g:2646:2: ( rule__Atom__ArgumentsAssignment_3_1_1 )
            // InternalProblem.g:2646:3: rule__Atom__ArgumentsAssignment_3_1_1
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
    // InternalProblem.g:2655:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2659:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // InternalProblem.g:2660:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalProblem.g:2667:1: rule__Assertion__Group__0__Impl : ( ( rule__Assertion__Alternatives_0 ) ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2671:1: ( ( ( rule__Assertion__Alternatives_0 ) ) )
            // InternalProblem.g:2672:1: ( ( rule__Assertion__Alternatives_0 ) )
            {
            // InternalProblem.g:2672:1: ( ( rule__Assertion__Alternatives_0 ) )
            // InternalProblem.g:2673:2: ( rule__Assertion__Alternatives_0 )
            {
             before(grammarAccess.getAssertionAccess().getAlternatives_0()); 
            // InternalProblem.g:2674:2: ( rule__Assertion__Alternatives_0 )
            // InternalProblem.g:2674:3: rule__Assertion__Alternatives_0
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
    // InternalProblem.g:2682:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2686:1: ( rule__Assertion__Group__1__Impl )
            // InternalProblem.g:2687:2: rule__Assertion__Group__1__Impl
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
    // InternalProblem.g:2693:1: rule__Assertion__Group__1__Impl : ( '.' ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2697:1: ( ( '.' ) )
            // InternalProblem.g:2698:1: ( '.' )
            {
            // InternalProblem.g:2698:1: ( '.' )
            // InternalProblem.g:2699:2: '.'
            {
             before(grammarAccess.getAssertionAccess().getFullStopKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalProblem.g:2709:1: rule__Assertion__Group_0_0__0 : rule__Assertion__Group_0_0__0__Impl rule__Assertion__Group_0_0__1 ;
    public final void rule__Assertion__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2713:1: ( rule__Assertion__Group_0_0__0__Impl rule__Assertion__Group_0_0__1 )
            // InternalProblem.g:2714:2: rule__Assertion__Group_0_0__0__Impl rule__Assertion__Group_0_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalProblem.g:2721:1: rule__Assertion__Group_0_0__0__Impl : ( ( rule__Assertion__RelationAssignment_0_0_0 ) ) ;
    public final void rule__Assertion__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2725:1: ( ( ( rule__Assertion__RelationAssignment_0_0_0 ) ) )
            // InternalProblem.g:2726:1: ( ( rule__Assertion__RelationAssignment_0_0_0 ) )
            {
            // InternalProblem.g:2726:1: ( ( rule__Assertion__RelationAssignment_0_0_0 ) )
            // InternalProblem.g:2727:2: ( rule__Assertion__RelationAssignment_0_0_0 )
            {
             before(grammarAccess.getAssertionAccess().getRelationAssignment_0_0_0()); 
            // InternalProblem.g:2728:2: ( rule__Assertion__RelationAssignment_0_0_0 )
            // InternalProblem.g:2728:3: rule__Assertion__RelationAssignment_0_0_0
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
    // InternalProblem.g:2736:1: rule__Assertion__Group_0_0__1 : rule__Assertion__Group_0_0__1__Impl rule__Assertion__Group_0_0__2 ;
    public final void rule__Assertion__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2740:1: ( rule__Assertion__Group_0_0__1__Impl rule__Assertion__Group_0_0__2 )
            // InternalProblem.g:2741:2: rule__Assertion__Group_0_0__1__Impl rule__Assertion__Group_0_0__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalProblem.g:2748:1: rule__Assertion__Group_0_0__1__Impl : ( '(' ) ;
    public final void rule__Assertion__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2752:1: ( ( '(' ) )
            // InternalProblem.g:2753:1: ( '(' )
            {
            // InternalProblem.g:2753:1: ( '(' )
            // InternalProblem.g:2754:2: '('
            {
             before(grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_0_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalProblem.g:2763:1: rule__Assertion__Group_0_0__2 : rule__Assertion__Group_0_0__2__Impl rule__Assertion__Group_0_0__3 ;
    public final void rule__Assertion__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2767:1: ( rule__Assertion__Group_0_0__2__Impl rule__Assertion__Group_0_0__3 )
            // InternalProblem.g:2768:2: rule__Assertion__Group_0_0__2__Impl rule__Assertion__Group_0_0__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalProblem.g:2775:1: rule__Assertion__Group_0_0__2__Impl : ( ( rule__Assertion__Group_0_0_2__0 )? ) ;
    public final void rule__Assertion__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2779:1: ( ( ( rule__Assertion__Group_0_0_2__0 )? ) )
            // InternalProblem.g:2780:1: ( ( rule__Assertion__Group_0_0_2__0 )? )
            {
            // InternalProblem.g:2780:1: ( ( rule__Assertion__Group_0_0_2__0 )? )
            // InternalProblem.g:2781:2: ( rule__Assertion__Group_0_0_2__0 )?
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_0_2()); 
            // InternalProblem.g:2782:2: ( rule__Assertion__Group_0_0_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_QUOTED_ID && LA32_0<=RULE_ID)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalProblem.g:2782:3: rule__Assertion__Group_0_0_2__0
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
    // InternalProblem.g:2790:1: rule__Assertion__Group_0_0__3 : rule__Assertion__Group_0_0__3__Impl rule__Assertion__Group_0_0__4 ;
    public final void rule__Assertion__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2794:1: ( rule__Assertion__Group_0_0__3__Impl rule__Assertion__Group_0_0__4 )
            // InternalProblem.g:2795:2: rule__Assertion__Group_0_0__3__Impl rule__Assertion__Group_0_0__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalProblem.g:2802:1: rule__Assertion__Group_0_0__3__Impl : ( ')' ) ;
    public final void rule__Assertion__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2806:1: ( ( ')' ) )
            // InternalProblem.g:2807:1: ( ')' )
            {
            // InternalProblem.g:2807:1: ( ')' )
            // InternalProblem.g:2808:2: ')'
            {
             before(grammarAccess.getAssertionAccess().getRightParenthesisKeyword_0_0_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalProblem.g:2817:1: rule__Assertion__Group_0_0__4 : rule__Assertion__Group_0_0__4__Impl rule__Assertion__Group_0_0__5 ;
    public final void rule__Assertion__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2821:1: ( rule__Assertion__Group_0_0__4__Impl rule__Assertion__Group_0_0__5 )
            // InternalProblem.g:2822:2: rule__Assertion__Group_0_0__4__Impl rule__Assertion__Group_0_0__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalProblem.g:2829:1: rule__Assertion__Group_0_0__4__Impl : ( ':' ) ;
    public final void rule__Assertion__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2833:1: ( ( ':' ) )
            // InternalProblem.g:2834:1: ( ':' )
            {
            // InternalProblem.g:2834:1: ( ':' )
            // InternalProblem.g:2835:2: ':'
            {
             before(grammarAccess.getAssertionAccess().getColonKeyword_0_0_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalProblem.g:2844:1: rule__Assertion__Group_0_0__5 : rule__Assertion__Group_0_0__5__Impl ;
    public final void rule__Assertion__Group_0_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2848:1: ( rule__Assertion__Group_0_0__5__Impl )
            // InternalProblem.g:2849:2: rule__Assertion__Group_0_0__5__Impl
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
    // InternalProblem.g:2855:1: rule__Assertion__Group_0_0__5__Impl : ( ( rule__Assertion__ValueAssignment_0_0_5 ) ) ;
    public final void rule__Assertion__Group_0_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2859:1: ( ( ( rule__Assertion__ValueAssignment_0_0_5 ) ) )
            // InternalProblem.g:2860:1: ( ( rule__Assertion__ValueAssignment_0_0_5 ) )
            {
            // InternalProblem.g:2860:1: ( ( rule__Assertion__ValueAssignment_0_0_5 ) )
            // InternalProblem.g:2861:2: ( rule__Assertion__ValueAssignment_0_0_5 )
            {
             before(grammarAccess.getAssertionAccess().getValueAssignment_0_0_5()); 
            // InternalProblem.g:2862:2: ( rule__Assertion__ValueAssignment_0_0_5 )
            // InternalProblem.g:2862:3: rule__Assertion__ValueAssignment_0_0_5
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
    // InternalProblem.g:2871:1: rule__Assertion__Group_0_0_2__0 : rule__Assertion__Group_0_0_2__0__Impl rule__Assertion__Group_0_0_2__1 ;
    public final void rule__Assertion__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2875:1: ( rule__Assertion__Group_0_0_2__0__Impl rule__Assertion__Group_0_0_2__1 )
            // InternalProblem.g:2876:2: rule__Assertion__Group_0_0_2__0__Impl rule__Assertion__Group_0_0_2__1
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
    // InternalProblem.g:2883:1: rule__Assertion__Group_0_0_2__0__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) ) ;
    public final void rule__Assertion__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2887:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) ) )
            // InternalProblem.g:2888:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) )
            {
            // InternalProblem.g:2888:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) )
            // InternalProblem.g:2889:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_0 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_0_2_0()); 
            // InternalProblem.g:2890:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_0 )
            // InternalProblem.g:2890:3: rule__Assertion__ArgumentsAssignment_0_0_2_0
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
    // InternalProblem.g:2898:1: rule__Assertion__Group_0_0_2__1 : rule__Assertion__Group_0_0_2__1__Impl ;
    public final void rule__Assertion__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2902:1: ( rule__Assertion__Group_0_0_2__1__Impl )
            // InternalProblem.g:2903:2: rule__Assertion__Group_0_0_2__1__Impl
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
    // InternalProblem.g:2909:1: rule__Assertion__Group_0_0_2__1__Impl : ( ( rule__Assertion__Group_0_0_2_1__0 )* ) ;
    public final void rule__Assertion__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2913:1: ( ( ( rule__Assertion__Group_0_0_2_1__0 )* ) )
            // InternalProblem.g:2914:1: ( ( rule__Assertion__Group_0_0_2_1__0 )* )
            {
            // InternalProblem.g:2914:1: ( ( rule__Assertion__Group_0_0_2_1__0 )* )
            // InternalProblem.g:2915:2: ( rule__Assertion__Group_0_0_2_1__0 )*
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_0_2_1()); 
            // InternalProblem.g:2916:2: ( rule__Assertion__Group_0_0_2_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==25) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalProblem.g:2916:3: rule__Assertion__Group_0_0_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Assertion__Group_0_0_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalProblem.g:2925:1: rule__Assertion__Group_0_0_2_1__0 : rule__Assertion__Group_0_0_2_1__0__Impl rule__Assertion__Group_0_0_2_1__1 ;
    public final void rule__Assertion__Group_0_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2929:1: ( rule__Assertion__Group_0_0_2_1__0__Impl rule__Assertion__Group_0_0_2_1__1 )
            // InternalProblem.g:2930:2: rule__Assertion__Group_0_0_2_1__0__Impl rule__Assertion__Group_0_0_2_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalProblem.g:2937:1: rule__Assertion__Group_0_0_2_1__0__Impl : ( ',' ) ;
    public final void rule__Assertion__Group_0_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2941:1: ( ( ',' ) )
            // InternalProblem.g:2942:1: ( ',' )
            {
            // InternalProblem.g:2942:1: ( ',' )
            // InternalProblem.g:2943:2: ','
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
    // InternalProblem.g:2952:1: rule__Assertion__Group_0_0_2_1__1 : rule__Assertion__Group_0_0_2_1__1__Impl ;
    public final void rule__Assertion__Group_0_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2956:1: ( rule__Assertion__Group_0_0_2_1__1__Impl )
            // InternalProblem.g:2957:2: rule__Assertion__Group_0_0_2_1__1__Impl
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
    // InternalProblem.g:2963:1: rule__Assertion__Group_0_0_2_1__1__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) ) ;
    public final void rule__Assertion__Group_0_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2967:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) ) )
            // InternalProblem.g:2968:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) )
            {
            // InternalProblem.g:2968:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) )
            // InternalProblem.g:2969:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_0_2_1_1()); 
            // InternalProblem.g:2970:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 )
            // InternalProblem.g:2970:3: rule__Assertion__ArgumentsAssignment_0_0_2_1_1
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
    // InternalProblem.g:2979:1: rule__Assertion__Group_0_1__0 : rule__Assertion__Group_0_1__0__Impl rule__Assertion__Group_0_1__1 ;
    public final void rule__Assertion__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2983:1: ( rule__Assertion__Group_0_1__0__Impl rule__Assertion__Group_0_1__1 )
            // InternalProblem.g:2984:2: rule__Assertion__Group_0_1__0__Impl rule__Assertion__Group_0_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalProblem.g:2991:1: rule__Assertion__Group_0_1__0__Impl : ( ( rule__Assertion__ValueAssignment_0_1_0 )? ) ;
    public final void rule__Assertion__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2995:1: ( ( ( rule__Assertion__ValueAssignment_0_1_0 )? ) )
            // InternalProblem.g:2996:1: ( ( rule__Assertion__ValueAssignment_0_1_0 )? )
            {
            // InternalProblem.g:2996:1: ( ( rule__Assertion__ValueAssignment_0_1_0 )? )
            // InternalProblem.g:2997:2: ( rule__Assertion__ValueAssignment_0_1_0 )?
            {
             before(grammarAccess.getAssertionAccess().getValueAssignment_0_1_0()); 
            // InternalProblem.g:2998:2: ( rule__Assertion__ValueAssignment_0_1_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=20 && LA34_0<=21)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalProblem.g:2998:3: rule__Assertion__ValueAssignment_0_1_0
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
    // InternalProblem.g:3006:1: rule__Assertion__Group_0_1__1 : rule__Assertion__Group_0_1__1__Impl rule__Assertion__Group_0_1__2 ;
    public final void rule__Assertion__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3010:1: ( rule__Assertion__Group_0_1__1__Impl rule__Assertion__Group_0_1__2 )
            // InternalProblem.g:3011:2: rule__Assertion__Group_0_1__1__Impl rule__Assertion__Group_0_1__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalProblem.g:3018:1: rule__Assertion__Group_0_1__1__Impl : ( ( rule__Assertion__RelationAssignment_0_1_1 ) ) ;
    public final void rule__Assertion__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3022:1: ( ( ( rule__Assertion__RelationAssignment_0_1_1 ) ) )
            // InternalProblem.g:3023:1: ( ( rule__Assertion__RelationAssignment_0_1_1 ) )
            {
            // InternalProblem.g:3023:1: ( ( rule__Assertion__RelationAssignment_0_1_1 ) )
            // InternalProblem.g:3024:2: ( rule__Assertion__RelationAssignment_0_1_1 )
            {
             before(grammarAccess.getAssertionAccess().getRelationAssignment_0_1_1()); 
            // InternalProblem.g:3025:2: ( rule__Assertion__RelationAssignment_0_1_1 )
            // InternalProblem.g:3025:3: rule__Assertion__RelationAssignment_0_1_1
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
    // InternalProblem.g:3033:1: rule__Assertion__Group_0_1__2 : rule__Assertion__Group_0_1__2__Impl rule__Assertion__Group_0_1__3 ;
    public final void rule__Assertion__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3037:1: ( rule__Assertion__Group_0_1__2__Impl rule__Assertion__Group_0_1__3 )
            // InternalProblem.g:3038:2: rule__Assertion__Group_0_1__2__Impl rule__Assertion__Group_0_1__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalProblem.g:3045:1: rule__Assertion__Group_0_1__2__Impl : ( '(' ) ;
    public final void rule__Assertion__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3049:1: ( ( '(' ) )
            // InternalProblem.g:3050:1: ( '(' )
            {
            // InternalProblem.g:3050:1: ( '(' )
            // InternalProblem.g:3051:2: '('
            {
             before(grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_1_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalProblem.g:3060:1: rule__Assertion__Group_0_1__3 : rule__Assertion__Group_0_1__3__Impl rule__Assertion__Group_0_1__4 ;
    public final void rule__Assertion__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3064:1: ( rule__Assertion__Group_0_1__3__Impl rule__Assertion__Group_0_1__4 )
            // InternalProblem.g:3065:2: rule__Assertion__Group_0_1__3__Impl rule__Assertion__Group_0_1__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalProblem.g:3072:1: rule__Assertion__Group_0_1__3__Impl : ( ( rule__Assertion__Group_0_1_3__0 )? ) ;
    public final void rule__Assertion__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3076:1: ( ( ( rule__Assertion__Group_0_1_3__0 )? ) )
            // InternalProblem.g:3077:1: ( ( rule__Assertion__Group_0_1_3__0 )? )
            {
            // InternalProblem.g:3077:1: ( ( rule__Assertion__Group_0_1_3__0 )? )
            // InternalProblem.g:3078:2: ( rule__Assertion__Group_0_1_3__0 )?
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_1_3()); 
            // InternalProblem.g:3079:2: ( rule__Assertion__Group_0_1_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_QUOTED_ID && LA35_0<=RULE_ID)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalProblem.g:3079:3: rule__Assertion__Group_0_1_3__0
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
    // InternalProblem.g:3087:1: rule__Assertion__Group_0_1__4 : rule__Assertion__Group_0_1__4__Impl ;
    public final void rule__Assertion__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3091:1: ( rule__Assertion__Group_0_1__4__Impl )
            // InternalProblem.g:3092:2: rule__Assertion__Group_0_1__4__Impl
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
    // InternalProblem.g:3098:1: rule__Assertion__Group_0_1__4__Impl : ( ')' ) ;
    public final void rule__Assertion__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3102:1: ( ( ')' ) )
            // InternalProblem.g:3103:1: ( ')' )
            {
            // InternalProblem.g:3103:1: ( ')' )
            // InternalProblem.g:3104:2: ')'
            {
             before(grammarAccess.getAssertionAccess().getRightParenthesisKeyword_0_1_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalProblem.g:3114:1: rule__Assertion__Group_0_1_3__0 : rule__Assertion__Group_0_1_3__0__Impl rule__Assertion__Group_0_1_3__1 ;
    public final void rule__Assertion__Group_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3118:1: ( rule__Assertion__Group_0_1_3__0__Impl rule__Assertion__Group_0_1_3__1 )
            // InternalProblem.g:3119:2: rule__Assertion__Group_0_1_3__0__Impl rule__Assertion__Group_0_1_3__1
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
    // InternalProblem.g:3126:1: rule__Assertion__Group_0_1_3__0__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) ) ;
    public final void rule__Assertion__Group_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3130:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) ) )
            // InternalProblem.g:3131:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) )
            {
            // InternalProblem.g:3131:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) )
            // InternalProblem.g:3132:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_0 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_1_3_0()); 
            // InternalProblem.g:3133:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_0 )
            // InternalProblem.g:3133:3: rule__Assertion__ArgumentsAssignment_0_1_3_0
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
    // InternalProblem.g:3141:1: rule__Assertion__Group_0_1_3__1 : rule__Assertion__Group_0_1_3__1__Impl ;
    public final void rule__Assertion__Group_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3145:1: ( rule__Assertion__Group_0_1_3__1__Impl )
            // InternalProblem.g:3146:2: rule__Assertion__Group_0_1_3__1__Impl
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
    // InternalProblem.g:3152:1: rule__Assertion__Group_0_1_3__1__Impl : ( ( rule__Assertion__Group_0_1_3_1__0 )* ) ;
    public final void rule__Assertion__Group_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3156:1: ( ( ( rule__Assertion__Group_0_1_3_1__0 )* ) )
            // InternalProblem.g:3157:1: ( ( rule__Assertion__Group_0_1_3_1__0 )* )
            {
            // InternalProblem.g:3157:1: ( ( rule__Assertion__Group_0_1_3_1__0 )* )
            // InternalProblem.g:3158:2: ( rule__Assertion__Group_0_1_3_1__0 )*
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_1_3_1()); 
            // InternalProblem.g:3159:2: ( rule__Assertion__Group_0_1_3_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==25) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalProblem.g:3159:3: rule__Assertion__Group_0_1_3_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Assertion__Group_0_1_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalProblem.g:3168:1: rule__Assertion__Group_0_1_3_1__0 : rule__Assertion__Group_0_1_3_1__0__Impl rule__Assertion__Group_0_1_3_1__1 ;
    public final void rule__Assertion__Group_0_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3172:1: ( rule__Assertion__Group_0_1_3_1__0__Impl rule__Assertion__Group_0_1_3_1__1 )
            // InternalProblem.g:3173:2: rule__Assertion__Group_0_1_3_1__0__Impl rule__Assertion__Group_0_1_3_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalProblem.g:3180:1: rule__Assertion__Group_0_1_3_1__0__Impl : ( ',' ) ;
    public final void rule__Assertion__Group_0_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3184:1: ( ( ',' ) )
            // InternalProblem.g:3185:1: ( ',' )
            {
            // InternalProblem.g:3185:1: ( ',' )
            // InternalProblem.g:3186:2: ','
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
    // InternalProblem.g:3195:1: rule__Assertion__Group_0_1_3_1__1 : rule__Assertion__Group_0_1_3_1__1__Impl ;
    public final void rule__Assertion__Group_0_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3199:1: ( rule__Assertion__Group_0_1_3_1__1__Impl )
            // InternalProblem.g:3200:2: rule__Assertion__Group_0_1_3_1__1__Impl
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
    // InternalProblem.g:3206:1: rule__Assertion__Group_0_1_3_1__1__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) ) ;
    public final void rule__Assertion__Group_0_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3210:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) ) )
            // InternalProblem.g:3211:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) )
            {
            // InternalProblem.g:3211:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) )
            // InternalProblem.g:3212:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_1_3_1_1()); 
            // InternalProblem.g:3213:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 )
            // InternalProblem.g:3213:3: rule__Assertion__ArgumentsAssignment_0_1_3_1_1
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
    // InternalProblem.g:3222:1: rule__ScopeDeclaration__Group__0 : rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1 ;
    public final void rule__ScopeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3226:1: ( rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1 )
            // InternalProblem.g:3227:2: rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1
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
    // InternalProblem.g:3234:1: rule__ScopeDeclaration__Group__0__Impl : ( 'scope' ) ;
    public final void rule__ScopeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3238:1: ( ( 'scope' ) )
            // InternalProblem.g:3239:1: ( 'scope' )
            {
            // InternalProblem.g:3239:1: ( 'scope' )
            // InternalProblem.g:3240:2: 'scope'
            {
             before(grammarAccess.getScopeDeclarationAccess().getScopeKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalProblem.g:3249:1: rule__ScopeDeclaration__Group__1 : rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2 ;
    public final void rule__ScopeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3253:1: ( rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2 )
            // InternalProblem.g:3254:2: rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalProblem.g:3261:1: rule__ScopeDeclaration__Group__1__Impl : ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) ) ;
    public final void rule__ScopeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3265:1: ( ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) ) )
            // InternalProblem.g:3266:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) )
            {
            // InternalProblem.g:3266:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) )
            // InternalProblem.g:3267:2: ( rule__ScopeDeclaration__TypeScopesAssignment_1 )
            {
             before(grammarAccess.getScopeDeclarationAccess().getTypeScopesAssignment_1()); 
            // InternalProblem.g:3268:2: ( rule__ScopeDeclaration__TypeScopesAssignment_1 )
            // InternalProblem.g:3268:3: rule__ScopeDeclaration__TypeScopesAssignment_1
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
    // InternalProblem.g:3276:1: rule__ScopeDeclaration__Group__2 : rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3 ;
    public final void rule__ScopeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3280:1: ( rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3 )
            // InternalProblem.g:3281:2: rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalProblem.g:3288:1: rule__ScopeDeclaration__Group__2__Impl : ( ( rule__ScopeDeclaration__Group_2__0 )* ) ;
    public final void rule__ScopeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3292:1: ( ( ( rule__ScopeDeclaration__Group_2__0 )* ) )
            // InternalProblem.g:3293:1: ( ( rule__ScopeDeclaration__Group_2__0 )* )
            {
            // InternalProblem.g:3293:1: ( ( rule__ScopeDeclaration__Group_2__0 )* )
            // InternalProblem.g:3294:2: ( rule__ScopeDeclaration__Group_2__0 )*
            {
             before(grammarAccess.getScopeDeclarationAccess().getGroup_2()); 
            // InternalProblem.g:3295:2: ( rule__ScopeDeclaration__Group_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==25) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalProblem.g:3295:3: rule__ScopeDeclaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ScopeDeclaration__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalProblem.g:3303:1: rule__ScopeDeclaration__Group__3 : rule__ScopeDeclaration__Group__3__Impl ;
    public final void rule__ScopeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3307:1: ( rule__ScopeDeclaration__Group__3__Impl )
            // InternalProblem.g:3308:2: rule__ScopeDeclaration__Group__3__Impl
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
    // InternalProblem.g:3314:1: rule__ScopeDeclaration__Group__3__Impl : ( '.' ) ;
    public final void rule__ScopeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3318:1: ( ( '.' ) )
            // InternalProblem.g:3319:1: ( '.' )
            {
            // InternalProblem.g:3319:1: ( '.' )
            // InternalProblem.g:3320:2: '.'
            {
             before(grammarAccess.getScopeDeclarationAccess().getFullStopKeyword_3()); 
            match(input,12,FOLLOW_2); 
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
    // InternalProblem.g:3330:1: rule__ScopeDeclaration__Group_2__0 : rule__ScopeDeclaration__Group_2__0__Impl rule__ScopeDeclaration__Group_2__1 ;
    public final void rule__ScopeDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3334:1: ( rule__ScopeDeclaration__Group_2__0__Impl rule__ScopeDeclaration__Group_2__1 )
            // InternalProblem.g:3335:2: rule__ScopeDeclaration__Group_2__0__Impl rule__ScopeDeclaration__Group_2__1
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
    // InternalProblem.g:3342:1: rule__ScopeDeclaration__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ScopeDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3346:1: ( ( ',' ) )
            // InternalProblem.g:3347:1: ( ',' )
            {
            // InternalProblem.g:3347:1: ( ',' )
            // InternalProblem.g:3348:2: ','
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
    // InternalProblem.g:3357:1: rule__ScopeDeclaration__Group_2__1 : rule__ScopeDeclaration__Group_2__1__Impl ;
    public final void rule__ScopeDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3361:1: ( rule__ScopeDeclaration__Group_2__1__Impl )
            // InternalProblem.g:3362:2: rule__ScopeDeclaration__Group_2__1__Impl
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
    // InternalProblem.g:3368:1: rule__ScopeDeclaration__Group_2__1__Impl : ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) ) ;
    public final void rule__ScopeDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3372:1: ( ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) ) )
            // InternalProblem.g:3373:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) )
            {
            // InternalProblem.g:3373:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) )
            // InternalProblem.g:3374:2: ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 )
            {
             before(grammarAccess.getScopeDeclarationAccess().getTypeScopesAssignment_2_1()); 
            // InternalProblem.g:3375:2: ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 )
            // InternalProblem.g:3375:3: rule__ScopeDeclaration__TypeScopesAssignment_2_1
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
    // InternalProblem.g:3384:1: rule__TypeScope__Group__0 : rule__TypeScope__Group__0__Impl rule__TypeScope__Group__1 ;
    public final void rule__TypeScope__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3388:1: ( rule__TypeScope__Group__0__Impl rule__TypeScope__Group__1 )
            // InternalProblem.g:3389:2: rule__TypeScope__Group__0__Impl rule__TypeScope__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalProblem.g:3396:1: rule__TypeScope__Group__0__Impl : ( ( rule__TypeScope__TargetTypeAssignment_0 ) ) ;
    public final void rule__TypeScope__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3400:1: ( ( ( rule__TypeScope__TargetTypeAssignment_0 ) ) )
            // InternalProblem.g:3401:1: ( ( rule__TypeScope__TargetTypeAssignment_0 ) )
            {
            // InternalProblem.g:3401:1: ( ( rule__TypeScope__TargetTypeAssignment_0 ) )
            // InternalProblem.g:3402:2: ( rule__TypeScope__TargetTypeAssignment_0 )
            {
             before(grammarAccess.getTypeScopeAccess().getTargetTypeAssignment_0()); 
            // InternalProblem.g:3403:2: ( rule__TypeScope__TargetTypeAssignment_0 )
            // InternalProblem.g:3403:3: rule__TypeScope__TargetTypeAssignment_0
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
    // InternalProblem.g:3411:1: rule__TypeScope__Group__1 : rule__TypeScope__Group__1__Impl rule__TypeScope__Group__2 ;
    public final void rule__TypeScope__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3415:1: ( rule__TypeScope__Group__1__Impl rule__TypeScope__Group__2 )
            // InternalProblem.g:3416:2: rule__TypeScope__Group__1__Impl rule__TypeScope__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalProblem.g:3423:1: rule__TypeScope__Group__1__Impl : ( ( rule__TypeScope__Alternatives_1 ) ) ;
    public final void rule__TypeScope__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3427:1: ( ( ( rule__TypeScope__Alternatives_1 ) ) )
            // InternalProblem.g:3428:1: ( ( rule__TypeScope__Alternatives_1 ) )
            {
            // InternalProblem.g:3428:1: ( ( rule__TypeScope__Alternatives_1 ) )
            // InternalProblem.g:3429:2: ( rule__TypeScope__Alternatives_1 )
            {
             before(grammarAccess.getTypeScopeAccess().getAlternatives_1()); 
            // InternalProblem.g:3430:2: ( rule__TypeScope__Alternatives_1 )
            // InternalProblem.g:3430:3: rule__TypeScope__Alternatives_1
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
    // InternalProblem.g:3438:1: rule__TypeScope__Group__2 : rule__TypeScope__Group__2__Impl ;
    public final void rule__TypeScope__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3442:1: ( rule__TypeScope__Group__2__Impl )
            // InternalProblem.g:3443:2: rule__TypeScope__Group__2__Impl
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
    // InternalProblem.g:3449:1: rule__TypeScope__Group__2__Impl : ( ( rule__TypeScope__MultiplicityAssignment_2 ) ) ;
    public final void rule__TypeScope__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3453:1: ( ( ( rule__TypeScope__MultiplicityAssignment_2 ) ) )
            // InternalProblem.g:3454:1: ( ( rule__TypeScope__MultiplicityAssignment_2 ) )
            {
            // InternalProblem.g:3454:1: ( ( rule__TypeScope__MultiplicityAssignment_2 ) )
            // InternalProblem.g:3455:2: ( rule__TypeScope__MultiplicityAssignment_2 )
            {
             before(grammarAccess.getTypeScopeAccess().getMultiplicityAssignment_2()); 
            // InternalProblem.g:3456:2: ( rule__TypeScope__MultiplicityAssignment_2 )
            // InternalProblem.g:3456:3: rule__TypeScope__MultiplicityAssignment_2
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
    // InternalProblem.g:3465:1: rule__RangeMultiplicity__Group__0 : rule__RangeMultiplicity__Group__0__Impl rule__RangeMultiplicity__Group__1 ;
    public final void rule__RangeMultiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3469:1: ( rule__RangeMultiplicity__Group__0__Impl rule__RangeMultiplicity__Group__1 )
            // InternalProblem.g:3470:2: rule__RangeMultiplicity__Group__0__Impl rule__RangeMultiplicity__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalProblem.g:3477:1: rule__RangeMultiplicity__Group__0__Impl : ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) ) ;
    public final void rule__RangeMultiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3481:1: ( ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) ) )
            // InternalProblem.g:3482:1: ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) )
            {
            // InternalProblem.g:3482:1: ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) )
            // InternalProblem.g:3483:2: ( rule__RangeMultiplicity__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getRangeMultiplicityAccess().getLowerBoundAssignment_0()); 
            // InternalProblem.g:3484:2: ( rule__RangeMultiplicity__LowerBoundAssignment_0 )
            // InternalProblem.g:3484:3: rule__RangeMultiplicity__LowerBoundAssignment_0
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
    // InternalProblem.g:3492:1: rule__RangeMultiplicity__Group__1 : rule__RangeMultiplicity__Group__1__Impl rule__RangeMultiplicity__Group__2 ;
    public final void rule__RangeMultiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3496:1: ( rule__RangeMultiplicity__Group__1__Impl rule__RangeMultiplicity__Group__2 )
            // InternalProblem.g:3497:2: rule__RangeMultiplicity__Group__1__Impl rule__RangeMultiplicity__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalProblem.g:3504:1: rule__RangeMultiplicity__Group__1__Impl : ( '..' ) ;
    public final void rule__RangeMultiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3508:1: ( ( '..' ) )
            // InternalProblem.g:3509:1: ( '..' )
            {
            // InternalProblem.g:3509:1: ( '..' )
            // InternalProblem.g:3510:2: '..'
            {
             before(grammarAccess.getRangeMultiplicityAccess().getFullStopFullStopKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalProblem.g:3519:1: rule__RangeMultiplicity__Group__2 : rule__RangeMultiplicity__Group__2__Impl ;
    public final void rule__RangeMultiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3523:1: ( rule__RangeMultiplicity__Group__2__Impl )
            // InternalProblem.g:3524:2: rule__RangeMultiplicity__Group__2__Impl
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
    // InternalProblem.g:3530:1: rule__RangeMultiplicity__Group__2__Impl : ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) ) ;
    public final void rule__RangeMultiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3534:1: ( ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) ) )
            // InternalProblem.g:3535:1: ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) )
            {
            // InternalProblem.g:3535:1: ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) )
            // InternalProblem.g:3536:2: ( rule__RangeMultiplicity__UpperBoundAssignment_2 )
            {
             before(grammarAccess.getRangeMultiplicityAccess().getUpperBoundAssignment_2()); 
            // InternalProblem.g:3537:2: ( rule__RangeMultiplicity__UpperBoundAssignment_2 )
            // InternalProblem.g:3537:3: rule__RangeMultiplicity__UpperBoundAssignment_2
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


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalProblem.g:3546:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3550:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalProblem.g:3551:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalProblem.g:3558:1: rule__QualifiedName__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3562:1: ( ( RULE_ID ) )
            // InternalProblem.g:3563:1: ( RULE_ID )
            {
            // InternalProblem.g:3563:1: ( RULE_ID )
            // InternalProblem.g:3564:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProblem.g:3573:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2 ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3577:1: ( rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2 )
            // InternalProblem.g:3578:2: rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalProblem.g:3585:1: rule__QualifiedName__Group_1__1__Impl : ( ( rule__QualifiedName__Group_1_1__0 )* ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3589:1: ( ( ( rule__QualifiedName__Group_1_1__0 )* ) )
            // InternalProblem.g:3590:1: ( ( rule__QualifiedName__Group_1_1__0 )* )
            {
            // InternalProblem.g:3590:1: ( ( rule__QualifiedName__Group_1_1__0 )* )
            // InternalProblem.g:3591:2: ( rule__QualifiedName__Group_1_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1_1()); 
            // InternalProblem.g:3592:2: ( rule__QualifiedName__Group_1_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==35) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==RULE_ID) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // InternalProblem.g:3592:3: rule__QualifiedName__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__QualifiedName__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__QualifiedName__Group_1__2"
    // InternalProblem.g:3600:1: rule__QualifiedName__Group_1__2 : rule__QualifiedName__Group_1__2__Impl ;
    public final void rule__QualifiedName__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3604:1: ( rule__QualifiedName__Group_1__2__Impl )
            // InternalProblem.g:3605:2: rule__QualifiedName__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__2"


    // $ANTLR start "rule__QualifiedName__Group_1__2__Impl"
    // InternalProblem.g:3611:1: rule__QualifiedName__Group_1__2__Impl : ( ( rule__QualifiedName__Group_1_2__0 )? ) ;
    public final void rule__QualifiedName__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3615:1: ( ( ( rule__QualifiedName__Group_1_2__0 )? ) )
            // InternalProblem.g:3616:1: ( ( rule__QualifiedName__Group_1_2__0 )? )
            {
            // InternalProblem.g:3616:1: ( ( rule__QualifiedName__Group_1_2__0 )? )
            // InternalProblem.g:3617:2: ( rule__QualifiedName__Group_1_2__0 )?
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1_2()); 
            // InternalProblem.g:3618:2: ( rule__QualifiedName__Group_1_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalProblem.g:3618:3: rule__QualifiedName__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedName__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1_1__0"
    // InternalProblem.g:3627:1: rule__QualifiedName__Group_1_1__0 : rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1 ;
    public final void rule__QualifiedName__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3631:1: ( rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1 )
            // InternalProblem.g:3632:2: rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1_1__0__Impl"
    // InternalProblem.g:3639:1: rule__QualifiedName__Group_1_1__0__Impl : ( ':' ) ;
    public final void rule__QualifiedName__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3643:1: ( ( ':' ) )
            // InternalProblem.g:3644:1: ( ':' )
            {
            // InternalProblem.g:3644:1: ( ':' )
            // InternalProblem.g:3645:2: ':'
            {
             before(grammarAccess.getQualifiedNameAccess().getColonKeyword_1_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getColonKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1_1__1"
    // InternalProblem.g:3654:1: rule__QualifiedName__Group_1_1__1 : rule__QualifiedName__Group_1_1__1__Impl ;
    public final void rule__QualifiedName__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3658:1: ( rule__QualifiedName__Group_1_1__1__Impl )
            // InternalProblem.g:3659:2: rule__QualifiedName__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1_1__1__Impl"
    // InternalProblem.g:3665:1: rule__QualifiedName__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3669:1: ( ( RULE_ID ) )
            // InternalProblem.g:3670:1: ( RULE_ID )
            {
            // InternalProblem.g:3670:1: ( RULE_ID )
            // InternalProblem.g:3671:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1_2__0"
    // InternalProblem.g:3681:1: rule__QualifiedName__Group_1_2__0 : rule__QualifiedName__Group_1_2__0__Impl rule__QualifiedName__Group_1_2__1 ;
    public final void rule__QualifiedName__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3685:1: ( rule__QualifiedName__Group_1_2__0__Impl rule__QualifiedName__Group_1_2__1 )
            // InternalProblem.g:3686:2: rule__QualifiedName__Group_1_2__0__Impl rule__QualifiedName__Group_1_2__1
            {
            pushFollow(FOLLOW_35);
            rule__QualifiedName__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1_2__0"


    // $ANTLR start "rule__QualifiedName__Group_1_2__0__Impl"
    // InternalProblem.g:3693:1: rule__QualifiedName__Group_1_2__0__Impl : ( ':' ) ;
    public final void rule__QualifiedName__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3697:1: ( ( ':' ) )
            // InternalProblem.g:3698:1: ( ':' )
            {
            // InternalProblem.g:3698:1: ( ':' )
            // InternalProblem.g:3699:2: ':'
            {
             before(grammarAccess.getQualifiedNameAccess().getColonKeyword_1_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getColonKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1_2__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1_2__1"
    // InternalProblem.g:3708:1: rule__QualifiedName__Group_1_2__1 : rule__QualifiedName__Group_1_2__1__Impl ;
    public final void rule__QualifiedName__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3712:1: ( rule__QualifiedName__Group_1_2__1__Impl )
            // InternalProblem.g:3713:2: rule__QualifiedName__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1_2__1"


    // $ANTLR start "rule__QualifiedName__Group_1_2__1__Impl"
    // InternalProblem.g:3719:1: rule__QualifiedName__Group_1_2__1__Impl : ( RULE_QUOTED_ID ) ;
    public final void rule__QualifiedName__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3723:1: ( ( RULE_QUOTED_ID ) )
            // InternalProblem.g:3724:1: ( RULE_QUOTED_ID )
            {
            // InternalProblem.g:3724:1: ( RULE_QUOTED_ID )
            // InternalProblem.g:3725:2: RULE_QUOTED_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getQUOTED_IDTerminalRuleCall_1_2_1()); 
            match(input,RULE_QUOTED_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getQUOTED_IDTerminalRuleCall_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1_2__1__Impl"


    // $ANTLR start "rule__Problem__NameAssignment_0_1"
    // InternalProblem.g:3735:1: rule__Problem__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Problem__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3739:1: ( ( RULE_ID ) )
            // InternalProblem.g:3740:2: ( RULE_ID )
            {
            // InternalProblem.g:3740:2: ( RULE_ID )
            // InternalProblem.g:3741:3: RULE_ID
            {
             before(grammarAccess.getProblemAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProblemAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__NameAssignment_0_1"


    // $ANTLR start "rule__Problem__StatementsAssignment_1"
    // InternalProblem.g:3750:1: rule__Problem__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Problem__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3754:1: ( ( ruleStatement ) )
            // InternalProblem.g:3755:2: ( ruleStatement )
            {
            // InternalProblem.g:3755:2: ( ruleStatement )
            // InternalProblem.g:3756:3: ruleStatement
            {
             before(grammarAccess.getProblemAccess().getStatementsStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProblemAccess().getStatementsStatementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__StatementsAssignment_1"


    // $ANTLR start "rule__ClassDeclaration__AbstractAssignment_0"
    // InternalProblem.g:3765:1: rule__ClassDeclaration__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ClassDeclaration__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3769:1: ( ( ( 'abstract' ) ) )
            // InternalProblem.g:3770:2: ( ( 'abstract' ) )
            {
            // InternalProblem.g:3770:2: ( ( 'abstract' ) )
            // InternalProblem.g:3771:3: ( 'abstract' )
            {
             before(grammarAccess.getClassDeclarationAccess().getAbstractAbstractKeyword_0_0()); 
            // InternalProblem.g:3772:3: ( 'abstract' )
            // InternalProblem.g:3773:4: 'abstract'
            {
             before(grammarAccess.getClassDeclarationAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalProblem.g:3784:1: rule__ClassDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ClassDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3788:1: ( ( RULE_ID ) )
            // InternalProblem.g:3789:2: ( RULE_ID )
            {
            // InternalProblem.g:3789:2: ( RULE_ID )
            // InternalProblem.g:3790:3: RULE_ID
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


    // $ANTLR start "rule__ClassDeclaration__SuperTypesAssignment_3_1"
    // InternalProblem.g:3799:1: rule__ClassDeclaration__SuperTypesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassDeclaration__SuperTypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3803:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:3804:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:3804:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:3805:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationCrossReference_3_1_0()); 
            // InternalProblem.g:3806:3: ( ruleQualifiedName )
            // InternalProblem.g:3807:4: ruleQualifiedName
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__SuperTypesAssignment_3_1"


    // $ANTLR start "rule__ClassDeclaration__SuperTypesAssignment_3_2_1"
    // InternalProblem.g:3818:1: rule__ClassDeclaration__SuperTypesAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassDeclaration__SuperTypesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3822:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:3823:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:3823:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:3824:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationCrossReference_3_2_1_0()); 
            // InternalProblem.g:3825:3: ( ruleQualifiedName )
            // InternalProblem.g:3826:4: ruleQualifiedName
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationQualifiedNameParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationQualifiedNameParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__SuperTypesAssignment_3_2_1"


    // $ANTLR start "rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0"
    // InternalProblem.g:3837:1: rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 : ( ruleReferenceDeclaration ) ;
    public final void rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3841:1: ( ( ruleReferenceDeclaration ) )
            // InternalProblem.g:3842:2: ( ruleReferenceDeclaration )
            {
            // InternalProblem.g:3842:2: ( ruleReferenceDeclaration )
            // InternalProblem.g:3843:3: ruleReferenceDeclaration
            {
             before(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsReferenceDeclarationParserRuleCall_4_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleReferenceDeclaration();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsReferenceDeclarationParserRuleCall_4_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0"


    // $ANTLR start "rule__ReferenceDeclaration__ContainmentAssignment_0_0"
    // InternalProblem.g:3852:1: rule__ReferenceDeclaration__ContainmentAssignment_0_0 : ( ( 'contains' ) ) ;
    public final void rule__ReferenceDeclaration__ContainmentAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3856:1: ( ( ( 'contains' ) ) )
            // InternalProblem.g:3857:2: ( ( 'contains' ) )
            {
            // InternalProblem.g:3857:2: ( ( 'contains' ) )
            // InternalProblem.g:3858:3: ( 'contains' )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getContainmentContainsKeyword_0_0_0()); 
            // InternalProblem.g:3859:3: ( 'contains' )
            // InternalProblem.g:3860:4: 'contains'
            {
             before(grammarAccess.getReferenceDeclarationAccess().getContainmentContainsKeyword_0_0_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalProblem.g:3871:1: rule__ReferenceDeclaration__ReferenceTypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceDeclaration__ReferenceTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3875:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:3876:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:3876:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:3877:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeClassDeclarationCrossReference_1_0()); 
            // InternalProblem.g:3878:3: ( ruleQualifiedName )
            // InternalProblem.g:3879:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeClassDeclarationQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeClassDeclarationQualifiedNameParserRuleCall_1_0_1()); 

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


    // $ANTLR start "rule__ReferenceDeclaration__MultiplicityAssignment_2_1"
    // InternalProblem.g:3890:1: rule__ReferenceDeclaration__MultiplicityAssignment_2_1 : ( ruleMultiplicity ) ;
    public final void rule__ReferenceDeclaration__MultiplicityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3894:1: ( ( ruleMultiplicity ) )
            // InternalProblem.g:3895:2: ( ruleMultiplicity )
            {
            // InternalProblem.g:3895:2: ( ruleMultiplicity )
            // InternalProblem.g:3896:3: ruleMultiplicity
            {
             before(grammarAccess.getReferenceDeclarationAccess().getMultiplicityMultiplicityParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getReferenceDeclarationAccess().getMultiplicityMultiplicityParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__MultiplicityAssignment_2_1"


    // $ANTLR start "rule__ReferenceDeclaration__NameAssignment_3"
    // InternalProblem.g:3905:1: rule__ReferenceDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ReferenceDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3909:1: ( ( RULE_ID ) )
            // InternalProblem.g:3910:2: ( RULE_ID )
            {
            // InternalProblem.g:3910:2: ( RULE_ID )
            // InternalProblem.g:3911:3: RULE_ID
            {
             before(grammarAccess.getReferenceDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__NameAssignment_3"


    // $ANTLR start "rule__ReferenceDeclaration__OppositeAssignment_4_1"
    // InternalProblem.g:3920:1: rule__ReferenceDeclaration__OppositeAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceDeclaration__OppositeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3924:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:3925:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:3925:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:3926:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getOppositeReferenceDeclarationCrossReference_4_1_0()); 
            // InternalProblem.g:3927:3: ( ruleQualifiedName )
            // InternalProblem.g:3928:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceDeclarationAccess().getOppositeReferenceDeclarationQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceDeclarationAccess().getOppositeReferenceDeclarationQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getReferenceDeclarationAccess().getOppositeReferenceDeclarationCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__OppositeAssignment_4_1"


    // $ANTLR start "rule__PredicateDefinition__ErrorAssignment_0_0_0"
    // InternalProblem.g:3939:1: rule__PredicateDefinition__ErrorAssignment_0_0_0 : ( ( 'error' ) ) ;
    public final void rule__PredicateDefinition__ErrorAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3943:1: ( ( ( 'error' ) ) )
            // InternalProblem.g:3944:2: ( ( 'error' ) )
            {
            // InternalProblem.g:3944:2: ( ( 'error' ) )
            // InternalProblem.g:3945:3: ( 'error' )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_0_0_0()); 
            // InternalProblem.g:3946:3: ( 'error' )
            // InternalProblem.g:3947:4: 'error'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_0_0_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalProblem.g:3958:1: rule__PredicateDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PredicateDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3962:1: ( ( RULE_ID ) )
            // InternalProblem.g:3963:2: ( RULE_ID )
            {
            // InternalProblem.g:3963:2: ( RULE_ID )
            // InternalProblem.g:3964:3: RULE_ID
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
    // InternalProblem.g:3973:1: rule__PredicateDefinition__ParametersAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__PredicateDefinition__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3977:1: ( ( ruleParameter ) )
            // InternalProblem.g:3978:2: ( ruleParameter )
            {
            // InternalProblem.g:3978:2: ( ruleParameter )
            // InternalProblem.g:3979:3: ruleParameter
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
    // InternalProblem.g:3988:1: rule__PredicateDefinition__ParametersAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__PredicateDefinition__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3992:1: ( ( ruleParameter ) )
            // InternalProblem.g:3993:2: ( ruleParameter )
            {
            // InternalProblem.g:3993:2: ( ruleParameter )
            // InternalProblem.g:3994:3: ruleParameter
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
    // InternalProblem.g:4003:1: rule__PredicateDefinition__BodiesAssignment_5_1 : ( ruleConjunction ) ;
    public final void rule__PredicateDefinition__BodiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4007:1: ( ( ruleConjunction ) )
            // InternalProblem.g:4008:2: ( ruleConjunction )
            {
            // InternalProblem.g:4008:2: ( ruleConjunction )
            // InternalProblem.g:4009:3: ruleConjunction
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
    // InternalProblem.g:4018:1: rule__PredicateDefinition__BodiesAssignment_5_2_1 : ( ruleConjunction ) ;
    public final void rule__PredicateDefinition__BodiesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4022:1: ( ( ruleConjunction ) )
            // InternalProblem.g:4023:2: ( ruleConjunction )
            {
            // InternalProblem.g:4023:2: ( ruleConjunction )
            // InternalProblem.g:4024:3: ruleConjunction
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
    // InternalProblem.g:4033:1: rule__Parameter__ParameterTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__ParameterTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4037:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:4038:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:4038:2: ( ( RULE_ID ) )
            // InternalProblem.g:4039:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getParameterTypeClassDeclarationCrossReference_0_0()); 
            // InternalProblem.g:4040:3: ( RULE_ID )
            // InternalProblem.g:4041:4: RULE_ID
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
    // InternalProblem.g:4052:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4056:1: ( ( RULE_ID ) )
            // InternalProblem.g:4057:2: ( RULE_ID )
            {
            // InternalProblem.g:4057:2: ( RULE_ID )
            // InternalProblem.g:4058:3: RULE_ID
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
    // InternalProblem.g:4067:1: rule__Conjunction__LiteralsAssignment_0 : ( ruleLiteral ) ;
    public final void rule__Conjunction__LiteralsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4071:1: ( ( ruleLiteral ) )
            // InternalProblem.g:4072:2: ( ruleLiteral )
            {
            // InternalProblem.g:4072:2: ( ruleLiteral )
            // InternalProblem.g:4073:3: ruleLiteral
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
    // InternalProblem.g:4082:1: rule__Conjunction__LiteralsAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__Conjunction__LiteralsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4086:1: ( ( ruleLiteral ) )
            // InternalProblem.g:4087:2: ( ruleLiteral )
            {
            // InternalProblem.g:4087:2: ( ruleLiteral )
            // InternalProblem.g:4088:3: ruleLiteral
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
    // InternalProblem.g:4097:1: rule__NegativeLiteral__AtomAssignment_1 : ( ruleAtom ) ;
    public final void rule__NegativeLiteral__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4101:1: ( ( ruleAtom ) )
            // InternalProblem.g:4102:2: ( ruleAtom )
            {
            // InternalProblem.g:4102:2: ( ruleAtom )
            // InternalProblem.g:4103:3: ruleAtom
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
    // InternalProblem.g:4112:1: rule__Atom__RelationAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Atom__RelationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4116:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:4117:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:4117:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:4118:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAtomAccess().getRelationRelationCrossReference_0_0()); 
            // InternalProblem.g:4119:3: ( ruleQualifiedName )
            // InternalProblem.g:4120:4: ruleQualifiedName
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
    // InternalProblem.g:4131:1: rule__Atom__TransitiveClosureAssignment_1 : ( ( '+' ) ) ;
    public final void rule__Atom__TransitiveClosureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4135:1: ( ( ( '+' ) ) )
            // InternalProblem.g:4136:2: ( ( '+' ) )
            {
            // InternalProblem.g:4136:2: ( ( '+' ) )
            // InternalProblem.g:4137:3: ( '+' )
            {
             before(grammarAccess.getAtomAccess().getTransitiveClosurePlusSignKeyword_1_0()); 
            // InternalProblem.g:4138:3: ( '+' )
            // InternalProblem.g:4139:4: '+'
            {
             before(grammarAccess.getAtomAccess().getTransitiveClosurePlusSignKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalProblem.g:4150:1: rule__Atom__ArgumentsAssignment_3_0 : ( ruleArgument ) ;
    public final void rule__Atom__ArgumentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4154:1: ( ( ruleArgument ) )
            // InternalProblem.g:4155:2: ( ruleArgument )
            {
            // InternalProblem.g:4155:2: ( ruleArgument )
            // InternalProblem.g:4156:3: ruleArgument
            {
             before(grammarAccess.getAtomAccess().getArgumentsArgumentParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getArgumentsArgumentParserRuleCall_3_0_0()); 

            }


            }

        }
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
    // InternalProblem.g:4165:1: rule__Atom__ArgumentsAssignment_3_1_1 : ( ruleArgument ) ;
    public final void rule__Atom__ArgumentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4169:1: ( ( ruleArgument ) )
            // InternalProblem.g:4170:2: ( ruleArgument )
            {
            // InternalProblem.g:4170:2: ( ruleArgument )
            // InternalProblem.g:4171:3: ruleArgument
            {
             before(grammarAccess.getAtomAccess().getArgumentsArgumentParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getArgumentsArgumentParserRuleCall_3_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Argument__VariableAssignment"
    // InternalProblem.g:4180:1: rule__Argument__VariableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Argument__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4184:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:4185:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:4185:2: ( ( RULE_ID ) )
            // InternalProblem.g:4186:3: ( RULE_ID )
            {
             before(grammarAccess.getArgumentAccess().getVariableVariableCrossReference_0()); 
            // InternalProblem.g:4187:3: ( RULE_ID )
            // InternalProblem.g:4188:4: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getVariableVariableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArgumentAccess().getVariableVariableIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getArgumentAccess().getVariableVariableCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__VariableAssignment"


    // $ANTLR start "rule__Assertion__RelationAssignment_0_0_0"
    // InternalProblem.g:4199:1: rule__Assertion__RelationAssignment_0_0_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__RelationAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4203:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:4204:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:4204:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:4205:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getRelationRelationCrossReference_0_0_0_0()); 
            // InternalProblem.g:4206:3: ( ruleQualifiedName )
            // InternalProblem.g:4207:4: ruleQualifiedName
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
    // InternalProblem.g:4218:1: rule__Assertion__ArgumentsAssignment_0_0_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4222:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:4223:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:4223:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:4224:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_0_2_0_0()); 
            // InternalProblem.g:4225:3: ( ruleQualifiedName )
            // InternalProblem.g:4226:4: ruleQualifiedName
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
    // InternalProblem.g:4237:1: rule__Assertion__ArgumentsAssignment_0_0_2_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4241:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:4242:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:4242:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:4243:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_0_2_1_1_0()); 
            // InternalProblem.g:4244:3: ( ruleQualifiedName )
            // InternalProblem.g:4245:4: ruleQualifiedName
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
    // InternalProblem.g:4256:1: rule__Assertion__ValueAssignment_0_0_5 : ( ruleLogicValue ) ;
    public final void rule__Assertion__ValueAssignment_0_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4260:1: ( ( ruleLogicValue ) )
            // InternalProblem.g:4261:2: ( ruleLogicValue )
            {
            // InternalProblem.g:4261:2: ( ruleLogicValue )
            // InternalProblem.g:4262:3: ruleLogicValue
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
    // InternalProblem.g:4271:1: rule__Assertion__ValueAssignment_0_1_0 : ( ruleShortLogicValue ) ;
    public final void rule__Assertion__ValueAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4275:1: ( ( ruleShortLogicValue ) )
            // InternalProblem.g:4276:2: ( ruleShortLogicValue )
            {
            // InternalProblem.g:4276:2: ( ruleShortLogicValue )
            // InternalProblem.g:4277:3: ruleShortLogicValue
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
    // InternalProblem.g:4286:1: rule__Assertion__RelationAssignment_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__RelationAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4290:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:4291:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:4291:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:4292:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getRelationRelationCrossReference_0_1_1_0()); 
            // InternalProblem.g:4293:3: ( ruleQualifiedName )
            // InternalProblem.g:4294:4: ruleQualifiedName
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
    // InternalProblem.g:4305:1: rule__Assertion__ArgumentsAssignment_0_1_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4309:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:4310:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:4310:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:4311:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_1_3_0_0()); 
            // InternalProblem.g:4312:3: ( ruleQualifiedName )
            // InternalProblem.g:4313:4: ruleQualifiedName
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
    // InternalProblem.g:4324:1: rule__Assertion__ArgumentsAssignment_0_1_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_1_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4328:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:4329:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:4329:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:4330:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_1_3_1_1_0()); 
            // InternalProblem.g:4331:3: ( ruleQualifiedName )
            // InternalProblem.g:4332:4: ruleQualifiedName
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
    // InternalProblem.g:4343:1: rule__ScopeDeclaration__TypeScopesAssignment_1 : ( ruleTypeScope ) ;
    public final void rule__ScopeDeclaration__TypeScopesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4347:1: ( ( ruleTypeScope ) )
            // InternalProblem.g:4348:2: ( ruleTypeScope )
            {
            // InternalProblem.g:4348:2: ( ruleTypeScope )
            // InternalProblem.g:4349:3: ruleTypeScope
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
    // InternalProblem.g:4358:1: rule__ScopeDeclaration__TypeScopesAssignment_2_1 : ( ruleTypeScope ) ;
    public final void rule__ScopeDeclaration__TypeScopesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4362:1: ( ( ruleTypeScope ) )
            // InternalProblem.g:4363:2: ( ruleTypeScope )
            {
            // InternalProblem.g:4363:2: ( ruleTypeScope )
            // InternalProblem.g:4364:3: ruleTypeScope
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
    // InternalProblem.g:4373:1: rule__TypeScope__TargetTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeScope__TargetTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4377:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:4378:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:4378:2: ( ( RULE_ID ) )
            // InternalProblem.g:4379:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeScopeAccess().getTargetTypeClassDeclarationCrossReference_0_0()); 
            // InternalProblem.g:4380:3: ( RULE_ID )
            // InternalProblem.g:4381:4: RULE_ID
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
    // InternalProblem.g:4392:1: rule__TypeScope__IncrementAssignment_1_0 : ( ( '+=' ) ) ;
    public final void rule__TypeScope__IncrementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4396:1: ( ( ( '+=' ) ) )
            // InternalProblem.g:4397:2: ( ( '+=' ) )
            {
            // InternalProblem.g:4397:2: ( ( '+=' ) )
            // InternalProblem.g:4398:3: ( '+=' )
            {
             before(grammarAccess.getTypeScopeAccess().getIncrementPlusSignEqualsSignKeyword_1_0_0()); 
            // InternalProblem.g:4399:3: ( '+=' )
            // InternalProblem.g:4400:4: '+='
            {
             before(grammarAccess.getTypeScopeAccess().getIncrementPlusSignEqualsSignKeyword_1_0_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalProblem.g:4411:1: rule__TypeScope__MultiplicityAssignment_2 : ( ruleDefiniteMultiplicity ) ;
    public final void rule__TypeScope__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4415:1: ( ( ruleDefiniteMultiplicity ) )
            // InternalProblem.g:4416:2: ( ruleDefiniteMultiplicity )
            {
            // InternalProblem.g:4416:2: ( ruleDefiniteMultiplicity )
            // InternalProblem.g:4417:3: ruleDefiniteMultiplicity
            {
             before(grammarAccess.getTypeScopeAccess().getMultiplicityDefiniteMultiplicityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDefiniteMultiplicity();

            state._fsp--;

             after(grammarAccess.getTypeScopeAccess().getMultiplicityDefiniteMultiplicityParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalProblem.g:4426:1: rule__RangeMultiplicity__LowerBoundAssignment_0 : ( RULE_INT ) ;
    public final void rule__RangeMultiplicity__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4430:1: ( ( RULE_INT ) )
            // InternalProblem.g:4431:2: ( RULE_INT )
            {
            // InternalProblem.g:4431:2: ( RULE_INT )
            // InternalProblem.g:4432:3: RULE_INT
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
    // InternalProblem.g:4441:1: rule__RangeMultiplicity__UpperBoundAssignment_2 : ( ruleUpperBound ) ;
    public final void rule__RangeMultiplicity__UpperBoundAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4445:1: ( ( ruleUpperBound ) )
            // InternalProblem.g:4446:2: ( ruleUpperBound )
            {
            // InternalProblem.g:4446:2: ( ruleUpperBound )
            // InternalProblem.g:4447:3: ruleUpperBound
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
    // InternalProblem.g:4456:1: rule__ExactMultiplicity__ExactValueAssignment : ( RULE_INT ) ;
    public final void rule__ExactMultiplicity__ExactValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4460:1: ( ( RULE_INT ) )
            // InternalProblem.g:4461:2: ( RULE_INT )
            {
            // InternalProblem.g:4461:2: ( RULE_INT )
            // InternalProblem.g:4462:3: RULE_INT
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


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\5\2\40\1\uffff\2\5\2\31\1\14\2\40\2\5\1\uffff\4\31\1\5\2\31";
    static final String dfa_3s = "\1\25\1\40\1\43\1\uffff\1\41\1\6\1\41\3\43\1\40\2\6\1\uffff\1\41\2\43\1\41\1\6\1\43\1\41";
    static final String dfa_4s = "\3\uffff\1\2\11\uffff\1\1\7\uffff";
    static final String dfa_5s = "\25\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\15\uffff\2\3",
            "\1\4",
            "\1\4\2\uffff\1\5",
            "",
            "\1\6\1\7\32\uffff\1\10",
            "\1\12\1\11",
            "\1\13\7\uffff\1\10",
            "\1\13\7\uffff\1\10\1\uffff\1\14",
            "\1\3\26\uffff\1\15",
            "\1\4\2\uffff\1\5",
            "\1\4",
            "\1\16\1\17",
            "\1\21\1\20",
            "",
            "\1\13\7\uffff\1\10",
            "\1\13\7\uffff\1\10\1\uffff\1\22",
            "\1\13\7\uffff\1\10\1\uffff\1\14",
            "\1\13\7\uffff\1\10",
            "\1\24\1\23",
            "\1\13\7\uffff\1\10\1\uffff\1\22",
            "\1\13\7\uffff\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "726:1: rule__Assertion__Alternatives_0 : ( ( ( rule__Assertion__Group_0_0__0 ) ) | ( ( rule__Assertion__Group_0_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000015000B04060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000015000B04062L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000005001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008008002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000002002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000060L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000300060L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000002001000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L});

}