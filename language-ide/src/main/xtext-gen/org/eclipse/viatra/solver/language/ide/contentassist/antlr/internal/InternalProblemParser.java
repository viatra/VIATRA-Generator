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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_QUOTED_ID", "RULE_ID", "RULE_EXPONENTIAL", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "','", "';'", "'refers'", "'pred'", "'='", "'*'", "'true'", "'false'", "'unknown'", "'!'", "'?'", "'problem'", "'class'", "'extends'", "'{'", "'}'", "'enum'", "'['", "']'", "'opposite'", "'('", "')'", "':-'", "':'", "'scope'", "'..'", "'::'", "'-'", "'abstract'", "'contains'", "'error'", "'+'", "'+='"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_EXPONENTIAL=7;
    public static final int RULE_ID=6;
    public static final int RULE_QUOTED_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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


    // $ANTLR start "entryRuleEnumDeclaration"
    // InternalProblem.g:128:1: entryRuleEnumDeclaration : ruleEnumDeclaration EOF ;
    public final void entryRuleEnumDeclaration() throws RecognitionException {
        try {
            // InternalProblem.g:129:1: ( ruleEnumDeclaration EOF )
            // InternalProblem.g:130:1: ruleEnumDeclaration EOF
            {
             before(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumDeclarationRule()); 
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
    // $ANTLR end "entryRuleEnumDeclaration"


    // $ANTLR start "ruleEnumDeclaration"
    // InternalProblem.g:137:1: ruleEnumDeclaration : ( ( rule__EnumDeclaration__Group__0 ) ) ;
    public final void ruleEnumDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:141:2: ( ( ( rule__EnumDeclaration__Group__0 ) ) )
            // InternalProblem.g:142:2: ( ( rule__EnumDeclaration__Group__0 ) )
            {
            // InternalProblem.g:142:2: ( ( rule__EnumDeclaration__Group__0 ) )
            // InternalProblem.g:143:3: ( rule__EnumDeclaration__Group__0 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup()); 
            // InternalProblem.g:144:3: ( rule__EnumDeclaration__Group__0 )
            // InternalProblem.g:144:4: rule__EnumDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumDeclaration"


    // $ANTLR start "entryRuleEnumLiteral"
    // InternalProblem.g:153:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // InternalProblem.g:154:1: ( ruleEnumLiteral EOF )
            // InternalProblem.g:155:1: ruleEnumLiteral EOF
            {
             before(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnumLiteralRule()); 
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
    // $ANTLR end "entryRuleEnumLiteral"


    // $ANTLR start "ruleEnumLiteral"
    // InternalProblem.g:162:1: ruleEnumLiteral : ( ( rule__EnumLiteral__NameAssignment ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:166:2: ( ( ( rule__EnumLiteral__NameAssignment ) ) )
            // InternalProblem.g:167:2: ( ( rule__EnumLiteral__NameAssignment ) )
            {
            // InternalProblem.g:167:2: ( ( rule__EnumLiteral__NameAssignment ) )
            // InternalProblem.g:168:3: ( rule__EnumLiteral__NameAssignment )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment()); 
            // InternalProblem.g:169:3: ( rule__EnumLiteral__NameAssignment )
            // InternalProblem.g:169:4: rule__EnumLiteral__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumLiteral"


    // $ANTLR start "entryRuleReferenceDeclaration"
    // InternalProblem.g:178:1: entryRuleReferenceDeclaration : ruleReferenceDeclaration EOF ;
    public final void entryRuleReferenceDeclaration() throws RecognitionException {
        try {
            // InternalProblem.g:179:1: ( ruleReferenceDeclaration EOF )
            // InternalProblem.g:180:1: ruleReferenceDeclaration EOF
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
    // InternalProblem.g:187:1: ruleReferenceDeclaration : ( ( rule__ReferenceDeclaration__Group__0 ) ) ;
    public final void ruleReferenceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:191:2: ( ( ( rule__ReferenceDeclaration__Group__0 ) ) )
            // InternalProblem.g:192:2: ( ( rule__ReferenceDeclaration__Group__0 ) )
            {
            // InternalProblem.g:192:2: ( ( rule__ReferenceDeclaration__Group__0 ) )
            // InternalProblem.g:193:3: ( rule__ReferenceDeclaration__Group__0 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getGroup()); 
            // InternalProblem.g:194:3: ( rule__ReferenceDeclaration__Group__0 )
            // InternalProblem.g:194:4: rule__ReferenceDeclaration__Group__0
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
    // InternalProblem.g:203:1: entryRulePredicateDefinition : rulePredicateDefinition EOF ;
    public final void entryRulePredicateDefinition() throws RecognitionException {
        try {
            // InternalProblem.g:204:1: ( rulePredicateDefinition EOF )
            // InternalProblem.g:205:1: rulePredicateDefinition EOF
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
    // InternalProblem.g:212:1: rulePredicateDefinition : ( ( rule__PredicateDefinition__Group__0 ) ) ;
    public final void rulePredicateDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:216:2: ( ( ( rule__PredicateDefinition__Group__0 ) ) )
            // InternalProblem.g:217:2: ( ( rule__PredicateDefinition__Group__0 ) )
            {
            // InternalProblem.g:217:2: ( ( rule__PredicateDefinition__Group__0 ) )
            // InternalProblem.g:218:3: ( rule__PredicateDefinition__Group__0 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup()); 
            // InternalProblem.g:219:3: ( rule__PredicateDefinition__Group__0 )
            // InternalProblem.g:219:4: rule__PredicateDefinition__Group__0
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
    // InternalProblem.g:228:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalProblem.g:229:1: ( ruleParameter EOF )
            // InternalProblem.g:230:1: ruleParameter EOF
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
    // InternalProblem.g:237:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:241:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalProblem.g:242:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalProblem.g:242:2: ( ( rule__Parameter__Group__0 ) )
            // InternalProblem.g:243:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalProblem.g:244:3: ( rule__Parameter__Group__0 )
            // InternalProblem.g:244:4: rule__Parameter__Group__0
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
    // InternalProblem.g:253:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // InternalProblem.g:254:1: ( ruleConjunction EOF )
            // InternalProblem.g:255:1: ruleConjunction EOF
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
    // InternalProblem.g:262:1: ruleConjunction : ( ( rule__Conjunction__Group__0 ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:266:2: ( ( ( rule__Conjunction__Group__0 ) ) )
            // InternalProblem.g:267:2: ( ( rule__Conjunction__Group__0 ) )
            {
            // InternalProblem.g:267:2: ( ( rule__Conjunction__Group__0 ) )
            // InternalProblem.g:268:3: ( rule__Conjunction__Group__0 )
            {
             before(grammarAccess.getConjunctionAccess().getGroup()); 
            // InternalProblem.g:269:3: ( rule__Conjunction__Group__0 )
            // InternalProblem.g:269:4: rule__Conjunction__Group__0
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
    // InternalProblem.g:278:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalProblem.g:279:1: ( ruleLiteral EOF )
            // InternalProblem.g:280:1: ruleLiteral EOF
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
    // InternalProblem.g:287:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:291:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalProblem.g:292:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalProblem.g:292:2: ( ( rule__Literal__Alternatives ) )
            // InternalProblem.g:293:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalProblem.g:294:3: ( rule__Literal__Alternatives )
            // InternalProblem.g:294:4: rule__Literal__Alternatives
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
    // InternalProblem.g:303:1: entryRuleNegativeLiteral : ruleNegativeLiteral EOF ;
    public final void entryRuleNegativeLiteral() throws RecognitionException {
        try {
            // InternalProblem.g:304:1: ( ruleNegativeLiteral EOF )
            // InternalProblem.g:305:1: ruleNegativeLiteral EOF
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
    // InternalProblem.g:312:1: ruleNegativeLiteral : ( ( rule__NegativeLiteral__Group__0 ) ) ;
    public final void ruleNegativeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:316:2: ( ( ( rule__NegativeLiteral__Group__0 ) ) )
            // InternalProblem.g:317:2: ( ( rule__NegativeLiteral__Group__0 ) )
            {
            // InternalProblem.g:317:2: ( ( rule__NegativeLiteral__Group__0 ) )
            // InternalProblem.g:318:3: ( rule__NegativeLiteral__Group__0 )
            {
             before(grammarAccess.getNegativeLiteralAccess().getGroup()); 
            // InternalProblem.g:319:3: ( rule__NegativeLiteral__Group__0 )
            // InternalProblem.g:319:4: rule__NegativeLiteral__Group__0
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
    // InternalProblem.g:328:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalProblem.g:329:1: ( ruleAtom EOF )
            // InternalProblem.g:330:1: ruleAtom EOF
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
    // InternalProblem.g:337:1: ruleAtom : ( ( rule__Atom__Group__0 ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:341:2: ( ( ( rule__Atom__Group__0 ) ) )
            // InternalProblem.g:342:2: ( ( rule__Atom__Group__0 ) )
            {
            // InternalProblem.g:342:2: ( ( rule__Atom__Group__0 ) )
            // InternalProblem.g:343:3: ( rule__Atom__Group__0 )
            {
             before(grammarAccess.getAtomAccess().getGroup()); 
            // InternalProblem.g:344:3: ( rule__Atom__Group__0 )
            // InternalProblem.g:344:4: rule__Atom__Group__0
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
    // InternalProblem.g:353:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalProblem.g:354:1: ( ruleArgument EOF )
            // InternalProblem.g:355:1: ruleArgument EOF
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
    // InternalProblem.g:362:1: ruleArgument : ( ( rule__Argument__Alternatives ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:366:2: ( ( ( rule__Argument__Alternatives ) ) )
            // InternalProblem.g:367:2: ( ( rule__Argument__Alternatives ) )
            {
            // InternalProblem.g:367:2: ( ( rule__Argument__Alternatives ) )
            // InternalProblem.g:368:3: ( rule__Argument__Alternatives )
            {
             before(grammarAccess.getArgumentAccess().getAlternatives()); 
            // InternalProblem.g:369:3: ( rule__Argument__Alternatives )
            // InternalProblem.g:369:4: rule__Argument__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleVariableOrNodeArgument"
    // InternalProblem.g:378:1: entryRuleVariableOrNodeArgument : ruleVariableOrNodeArgument EOF ;
    public final void entryRuleVariableOrNodeArgument() throws RecognitionException {
        try {
            // InternalProblem.g:379:1: ( ruleVariableOrNodeArgument EOF )
            // InternalProblem.g:380:1: ruleVariableOrNodeArgument EOF
            {
             before(grammarAccess.getVariableOrNodeArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableOrNodeArgument();

            state._fsp--;

             after(grammarAccess.getVariableOrNodeArgumentRule()); 
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
    // $ANTLR end "entryRuleVariableOrNodeArgument"


    // $ANTLR start "ruleVariableOrNodeArgument"
    // InternalProblem.g:387:1: ruleVariableOrNodeArgument : ( ( rule__VariableOrNodeArgument__VariableOrNodeAssignment ) ) ;
    public final void ruleVariableOrNodeArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:391:2: ( ( ( rule__VariableOrNodeArgument__VariableOrNodeAssignment ) ) )
            // InternalProblem.g:392:2: ( ( rule__VariableOrNodeArgument__VariableOrNodeAssignment ) )
            {
            // InternalProblem.g:392:2: ( ( rule__VariableOrNodeArgument__VariableOrNodeAssignment ) )
            // InternalProblem.g:393:3: ( rule__VariableOrNodeArgument__VariableOrNodeAssignment )
            {
             before(grammarAccess.getVariableOrNodeArgumentAccess().getVariableOrNodeAssignment()); 
            // InternalProblem.g:394:3: ( rule__VariableOrNodeArgument__VariableOrNodeAssignment )
            // InternalProblem.g:394:4: rule__VariableOrNodeArgument__VariableOrNodeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableOrNodeArgument__VariableOrNodeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableOrNodeArgumentAccess().getVariableOrNodeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableOrNodeArgument"


    // $ANTLR start "entryRuleConstantArgument"
    // InternalProblem.g:403:1: entryRuleConstantArgument : ruleConstantArgument EOF ;
    public final void entryRuleConstantArgument() throws RecognitionException {
        try {
            // InternalProblem.g:404:1: ( ruleConstantArgument EOF )
            // InternalProblem.g:405:1: ruleConstantArgument EOF
            {
             before(grammarAccess.getConstantArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleConstantArgument();

            state._fsp--;

             after(grammarAccess.getConstantArgumentRule()); 
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
    // $ANTLR end "entryRuleConstantArgument"


    // $ANTLR start "ruleConstantArgument"
    // InternalProblem.g:412:1: ruleConstantArgument : ( ( rule__ConstantArgument__ConstantAssignment ) ) ;
    public final void ruleConstantArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:416:2: ( ( ( rule__ConstantArgument__ConstantAssignment ) ) )
            // InternalProblem.g:417:2: ( ( rule__ConstantArgument__ConstantAssignment ) )
            {
            // InternalProblem.g:417:2: ( ( rule__ConstantArgument__ConstantAssignment ) )
            // InternalProblem.g:418:3: ( rule__ConstantArgument__ConstantAssignment )
            {
             before(grammarAccess.getConstantArgumentAccess().getConstantAssignment()); 
            // InternalProblem.g:419:3: ( rule__ConstantArgument__ConstantAssignment )
            // InternalProblem.g:419:4: rule__ConstantArgument__ConstantAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConstantArgument__ConstantAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConstantArgumentAccess().getConstantAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantArgument"


    // $ANTLR start "entryRuleAssertion"
    // InternalProblem.g:428:1: entryRuleAssertion : ruleAssertion EOF ;
    public final void entryRuleAssertion() throws RecognitionException {
        try {
            // InternalProblem.g:429:1: ( ruleAssertion EOF )
            // InternalProblem.g:430:1: ruleAssertion EOF
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
    // InternalProblem.g:437:1: ruleAssertion : ( ( rule__Assertion__Group__0 ) ) ;
    public final void ruleAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:441:2: ( ( ( rule__Assertion__Group__0 ) ) )
            // InternalProblem.g:442:2: ( ( rule__Assertion__Group__0 ) )
            {
            // InternalProblem.g:442:2: ( ( rule__Assertion__Group__0 ) )
            // InternalProblem.g:443:3: ( rule__Assertion__Group__0 )
            {
             before(grammarAccess.getAssertionAccess().getGroup()); 
            // InternalProblem.g:444:3: ( rule__Assertion__Group__0 )
            // InternalProblem.g:444:4: rule__Assertion__Group__0
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


    // $ANTLR start "entryRuleAssertionArgument"
    // InternalProblem.g:453:1: entryRuleAssertionArgument : ruleAssertionArgument EOF ;
    public final void entryRuleAssertionArgument() throws RecognitionException {
        try {
            // InternalProblem.g:454:1: ( ruleAssertionArgument EOF )
            // InternalProblem.g:455:1: ruleAssertionArgument EOF
            {
             before(grammarAccess.getAssertionArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssertionArgument();

            state._fsp--;

             after(grammarAccess.getAssertionArgumentRule()); 
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
    // $ANTLR end "entryRuleAssertionArgument"


    // $ANTLR start "ruleAssertionArgument"
    // InternalProblem.g:462:1: ruleAssertionArgument : ( ( rule__AssertionArgument__Alternatives ) ) ;
    public final void ruleAssertionArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:466:2: ( ( ( rule__AssertionArgument__Alternatives ) ) )
            // InternalProblem.g:467:2: ( ( rule__AssertionArgument__Alternatives ) )
            {
            // InternalProblem.g:467:2: ( ( rule__AssertionArgument__Alternatives ) )
            // InternalProblem.g:468:3: ( rule__AssertionArgument__Alternatives )
            {
             before(grammarAccess.getAssertionArgumentAccess().getAlternatives()); 
            // InternalProblem.g:469:3: ( rule__AssertionArgument__Alternatives )
            // InternalProblem.g:469:4: rule__AssertionArgument__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AssertionArgument__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssertionArgumentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssertionArgument"


    // $ANTLR start "entryRuleNodeAssertionArgument"
    // InternalProblem.g:478:1: entryRuleNodeAssertionArgument : ruleNodeAssertionArgument EOF ;
    public final void entryRuleNodeAssertionArgument() throws RecognitionException {
        try {
            // InternalProblem.g:479:1: ( ruleNodeAssertionArgument EOF )
            // InternalProblem.g:480:1: ruleNodeAssertionArgument EOF
            {
             before(grammarAccess.getNodeAssertionArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeAssertionArgument();

            state._fsp--;

             after(grammarAccess.getNodeAssertionArgumentRule()); 
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
    // $ANTLR end "entryRuleNodeAssertionArgument"


    // $ANTLR start "ruleNodeAssertionArgument"
    // InternalProblem.g:487:1: ruleNodeAssertionArgument : ( ( rule__NodeAssertionArgument__NodeAssignment ) ) ;
    public final void ruleNodeAssertionArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:491:2: ( ( ( rule__NodeAssertionArgument__NodeAssignment ) ) )
            // InternalProblem.g:492:2: ( ( rule__NodeAssertionArgument__NodeAssignment ) )
            {
            // InternalProblem.g:492:2: ( ( rule__NodeAssertionArgument__NodeAssignment ) )
            // InternalProblem.g:493:3: ( rule__NodeAssertionArgument__NodeAssignment )
            {
             before(grammarAccess.getNodeAssertionArgumentAccess().getNodeAssignment()); 
            // InternalProblem.g:494:3: ( rule__NodeAssertionArgument__NodeAssignment )
            // InternalProblem.g:494:4: rule__NodeAssertionArgument__NodeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NodeAssertionArgument__NodeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNodeAssertionArgumentAccess().getNodeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeAssertionArgument"


    // $ANTLR start "entryRuleConstantAssertionArgument"
    // InternalProblem.g:503:1: entryRuleConstantAssertionArgument : ruleConstantAssertionArgument EOF ;
    public final void entryRuleConstantAssertionArgument() throws RecognitionException {
        try {
            // InternalProblem.g:504:1: ( ruleConstantAssertionArgument EOF )
            // InternalProblem.g:505:1: ruleConstantAssertionArgument EOF
            {
             before(grammarAccess.getConstantAssertionArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleConstantAssertionArgument();

            state._fsp--;

             after(grammarAccess.getConstantAssertionArgumentRule()); 
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
    // $ANTLR end "entryRuleConstantAssertionArgument"


    // $ANTLR start "ruleConstantAssertionArgument"
    // InternalProblem.g:512:1: ruleConstantAssertionArgument : ( ( rule__ConstantAssertionArgument__ConstantAssignment ) ) ;
    public final void ruleConstantAssertionArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:516:2: ( ( ( rule__ConstantAssertionArgument__ConstantAssignment ) ) )
            // InternalProblem.g:517:2: ( ( rule__ConstantAssertionArgument__ConstantAssignment ) )
            {
            // InternalProblem.g:517:2: ( ( rule__ConstantAssertionArgument__ConstantAssignment ) )
            // InternalProblem.g:518:3: ( rule__ConstantAssertionArgument__ConstantAssignment )
            {
             before(grammarAccess.getConstantAssertionArgumentAccess().getConstantAssignment()); 
            // InternalProblem.g:519:3: ( rule__ConstantAssertionArgument__ConstantAssignment )
            // InternalProblem.g:519:4: rule__ConstantAssertionArgument__ConstantAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConstantAssertionArgument__ConstantAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConstantAssertionArgumentAccess().getConstantAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantAssertionArgument"


    // $ANTLR start "entryRuleNodeValueAssertion"
    // InternalProblem.g:528:1: entryRuleNodeValueAssertion : ruleNodeValueAssertion EOF ;
    public final void entryRuleNodeValueAssertion() throws RecognitionException {
        try {
            // InternalProblem.g:529:1: ( ruleNodeValueAssertion EOF )
            // InternalProblem.g:530:1: ruleNodeValueAssertion EOF
            {
             before(grammarAccess.getNodeValueAssertionRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeValueAssertion();

            state._fsp--;

             after(grammarAccess.getNodeValueAssertionRule()); 
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
    // $ANTLR end "entryRuleNodeValueAssertion"


    // $ANTLR start "ruleNodeValueAssertion"
    // InternalProblem.g:537:1: ruleNodeValueAssertion : ( ( rule__NodeValueAssertion__Group__0 ) ) ;
    public final void ruleNodeValueAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:541:2: ( ( ( rule__NodeValueAssertion__Group__0 ) ) )
            // InternalProblem.g:542:2: ( ( rule__NodeValueAssertion__Group__0 ) )
            {
            // InternalProblem.g:542:2: ( ( rule__NodeValueAssertion__Group__0 ) )
            // InternalProblem.g:543:3: ( rule__NodeValueAssertion__Group__0 )
            {
             before(grammarAccess.getNodeValueAssertionAccess().getGroup()); 
            // InternalProblem.g:544:3: ( rule__NodeValueAssertion__Group__0 )
            // InternalProblem.g:544:4: rule__NodeValueAssertion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeValueAssertion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeValueAssertionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeValueAssertion"


    // $ANTLR start "entryRuleConstant"
    // InternalProblem.g:553:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalProblem.g:554:1: ( ruleConstant EOF )
            // InternalProblem.g:555:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalProblem.g:562:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:566:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalProblem.g:567:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalProblem.g:567:2: ( ( rule__Constant__Alternatives ) )
            // InternalProblem.g:568:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalProblem.g:569:3: ( rule__Constant__Alternatives )
            // InternalProblem.g:569:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleIntConstant"
    // InternalProblem.g:578:1: entryRuleIntConstant : ruleIntConstant EOF ;
    public final void entryRuleIntConstant() throws RecognitionException {
        try {
            // InternalProblem.g:579:1: ( ruleIntConstant EOF )
            // InternalProblem.g:580:1: ruleIntConstant EOF
            {
             before(grammarAccess.getIntConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleIntConstant();

            state._fsp--;

             after(grammarAccess.getIntConstantRule()); 
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
    // $ANTLR end "entryRuleIntConstant"


    // $ANTLR start "ruleIntConstant"
    // InternalProblem.g:587:1: ruleIntConstant : ( ( rule__IntConstant__IntValueAssignment ) ) ;
    public final void ruleIntConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:591:2: ( ( ( rule__IntConstant__IntValueAssignment ) ) )
            // InternalProblem.g:592:2: ( ( rule__IntConstant__IntValueAssignment ) )
            {
            // InternalProblem.g:592:2: ( ( rule__IntConstant__IntValueAssignment ) )
            // InternalProblem.g:593:3: ( rule__IntConstant__IntValueAssignment )
            {
             before(grammarAccess.getIntConstantAccess().getIntValueAssignment()); 
            // InternalProblem.g:594:3: ( rule__IntConstant__IntValueAssignment )
            // InternalProblem.g:594:4: rule__IntConstant__IntValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntConstant__IntValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntConstantAccess().getIntValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntConstant"


    // $ANTLR start "entryRuleRealConstant"
    // InternalProblem.g:603:1: entryRuleRealConstant : ruleRealConstant EOF ;
    public final void entryRuleRealConstant() throws RecognitionException {
        try {
            // InternalProblem.g:604:1: ( ruleRealConstant EOF )
            // InternalProblem.g:605:1: ruleRealConstant EOF
            {
             before(grammarAccess.getRealConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleRealConstant();

            state._fsp--;

             after(grammarAccess.getRealConstantRule()); 
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
    // $ANTLR end "entryRuleRealConstant"


    // $ANTLR start "ruleRealConstant"
    // InternalProblem.g:612:1: ruleRealConstant : ( ( rule__RealConstant__RealValueAssignment ) ) ;
    public final void ruleRealConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:616:2: ( ( ( rule__RealConstant__RealValueAssignment ) ) )
            // InternalProblem.g:617:2: ( ( rule__RealConstant__RealValueAssignment ) )
            {
            // InternalProblem.g:617:2: ( ( rule__RealConstant__RealValueAssignment ) )
            // InternalProblem.g:618:3: ( rule__RealConstant__RealValueAssignment )
            {
             before(grammarAccess.getRealConstantAccess().getRealValueAssignment()); 
            // InternalProblem.g:619:3: ( rule__RealConstant__RealValueAssignment )
            // InternalProblem.g:619:4: rule__RealConstant__RealValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RealConstant__RealValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRealConstantAccess().getRealValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRealConstant"


    // $ANTLR start "entryRuleStringConstant"
    // InternalProblem.g:628:1: entryRuleStringConstant : ruleStringConstant EOF ;
    public final void entryRuleStringConstant() throws RecognitionException {
        try {
            // InternalProblem.g:629:1: ( ruleStringConstant EOF )
            // InternalProblem.g:630:1: ruleStringConstant EOF
            {
             before(grammarAccess.getStringConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleStringConstant();

            state._fsp--;

             after(grammarAccess.getStringConstantRule()); 
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
    // $ANTLR end "entryRuleStringConstant"


    // $ANTLR start "ruleStringConstant"
    // InternalProblem.g:637:1: ruleStringConstant : ( ( rule__StringConstant__StringValueAssignment ) ) ;
    public final void ruleStringConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:641:2: ( ( ( rule__StringConstant__StringValueAssignment ) ) )
            // InternalProblem.g:642:2: ( ( rule__StringConstant__StringValueAssignment ) )
            {
            // InternalProblem.g:642:2: ( ( rule__StringConstant__StringValueAssignment ) )
            // InternalProblem.g:643:3: ( rule__StringConstant__StringValueAssignment )
            {
             before(grammarAccess.getStringConstantAccess().getStringValueAssignment()); 
            // InternalProblem.g:644:3: ( rule__StringConstant__StringValueAssignment )
            // InternalProblem.g:644:4: rule__StringConstant__StringValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringConstant__StringValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringConstantAccess().getStringValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringConstant"


    // $ANTLR start "entryRuleScopeDeclaration"
    // InternalProblem.g:653:1: entryRuleScopeDeclaration : ruleScopeDeclaration EOF ;
    public final void entryRuleScopeDeclaration() throws RecognitionException {
        try {
            // InternalProblem.g:654:1: ( ruleScopeDeclaration EOF )
            // InternalProblem.g:655:1: ruleScopeDeclaration EOF
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
    // InternalProblem.g:662:1: ruleScopeDeclaration : ( ( rule__ScopeDeclaration__Group__0 ) ) ;
    public final void ruleScopeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:666:2: ( ( ( rule__ScopeDeclaration__Group__0 ) ) )
            // InternalProblem.g:667:2: ( ( rule__ScopeDeclaration__Group__0 ) )
            {
            // InternalProblem.g:667:2: ( ( rule__ScopeDeclaration__Group__0 ) )
            // InternalProblem.g:668:3: ( rule__ScopeDeclaration__Group__0 )
            {
             before(grammarAccess.getScopeDeclarationAccess().getGroup()); 
            // InternalProblem.g:669:3: ( rule__ScopeDeclaration__Group__0 )
            // InternalProblem.g:669:4: rule__ScopeDeclaration__Group__0
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
    // InternalProblem.g:678:1: entryRuleTypeScope : ruleTypeScope EOF ;
    public final void entryRuleTypeScope() throws RecognitionException {
        try {
            // InternalProblem.g:679:1: ( ruleTypeScope EOF )
            // InternalProblem.g:680:1: ruleTypeScope EOF
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
    // InternalProblem.g:687:1: ruleTypeScope : ( ( rule__TypeScope__Group__0 ) ) ;
    public final void ruleTypeScope() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:691:2: ( ( ( rule__TypeScope__Group__0 ) ) )
            // InternalProblem.g:692:2: ( ( rule__TypeScope__Group__0 ) )
            {
            // InternalProblem.g:692:2: ( ( rule__TypeScope__Group__0 ) )
            // InternalProblem.g:693:3: ( rule__TypeScope__Group__0 )
            {
             before(grammarAccess.getTypeScopeAccess().getGroup()); 
            // InternalProblem.g:694:3: ( rule__TypeScope__Group__0 )
            // InternalProblem.g:694:4: rule__TypeScope__Group__0
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
    // InternalProblem.g:703:1: entryRuleMultiplicity : ruleMultiplicity EOF ;
    public final void entryRuleMultiplicity() throws RecognitionException {
        try {
            // InternalProblem.g:704:1: ( ruleMultiplicity EOF )
            // InternalProblem.g:705:1: ruleMultiplicity EOF
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
    // InternalProblem.g:712:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:716:2: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // InternalProblem.g:717:2: ( ( rule__Multiplicity__Alternatives ) )
            {
            // InternalProblem.g:717:2: ( ( rule__Multiplicity__Alternatives ) )
            // InternalProblem.g:718:3: ( rule__Multiplicity__Alternatives )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            // InternalProblem.g:719:3: ( rule__Multiplicity__Alternatives )
            // InternalProblem.g:719:4: rule__Multiplicity__Alternatives
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
    // InternalProblem.g:728:1: entryRuleDefiniteMultiplicity : ruleDefiniteMultiplicity EOF ;
    public final void entryRuleDefiniteMultiplicity() throws RecognitionException {
        try {
            // InternalProblem.g:729:1: ( ruleDefiniteMultiplicity EOF )
            // InternalProblem.g:730:1: ruleDefiniteMultiplicity EOF
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
    // InternalProblem.g:737:1: ruleDefiniteMultiplicity : ( ( rule__DefiniteMultiplicity__Alternatives ) ) ;
    public final void ruleDefiniteMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:741:2: ( ( ( rule__DefiniteMultiplicity__Alternatives ) ) )
            // InternalProblem.g:742:2: ( ( rule__DefiniteMultiplicity__Alternatives ) )
            {
            // InternalProblem.g:742:2: ( ( rule__DefiniteMultiplicity__Alternatives ) )
            // InternalProblem.g:743:3: ( rule__DefiniteMultiplicity__Alternatives )
            {
             before(grammarAccess.getDefiniteMultiplicityAccess().getAlternatives()); 
            // InternalProblem.g:744:3: ( rule__DefiniteMultiplicity__Alternatives )
            // InternalProblem.g:744:4: rule__DefiniteMultiplicity__Alternatives
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
    // InternalProblem.g:753:1: entryRuleUnboundedMultiplicity : ruleUnboundedMultiplicity EOF ;
    public final void entryRuleUnboundedMultiplicity() throws RecognitionException {
        try {
            // InternalProblem.g:754:1: ( ruleUnboundedMultiplicity EOF )
            // InternalProblem.g:755:1: ruleUnboundedMultiplicity EOF
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
    // InternalProblem.g:762:1: ruleUnboundedMultiplicity : ( () ) ;
    public final void ruleUnboundedMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:766:2: ( ( () ) )
            // InternalProblem.g:767:2: ( () )
            {
            // InternalProblem.g:767:2: ( () )
            // InternalProblem.g:768:3: ()
            {
             before(grammarAccess.getUnboundedMultiplicityAccess().getUnboundedMultiplicityAction()); 
            // InternalProblem.g:769:3: ()
            // InternalProblem.g:769:4: 
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
    // InternalProblem.g:778:1: entryRuleRangeMultiplicity : ruleRangeMultiplicity EOF ;
    public final void entryRuleRangeMultiplicity() throws RecognitionException {
        try {
            // InternalProblem.g:779:1: ( ruleRangeMultiplicity EOF )
            // InternalProblem.g:780:1: ruleRangeMultiplicity EOF
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
    // InternalProblem.g:787:1: ruleRangeMultiplicity : ( ( rule__RangeMultiplicity__Group__0 ) ) ;
    public final void ruleRangeMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:791:2: ( ( ( rule__RangeMultiplicity__Group__0 ) ) )
            // InternalProblem.g:792:2: ( ( rule__RangeMultiplicity__Group__0 ) )
            {
            // InternalProblem.g:792:2: ( ( rule__RangeMultiplicity__Group__0 ) )
            // InternalProblem.g:793:3: ( rule__RangeMultiplicity__Group__0 )
            {
             before(grammarAccess.getRangeMultiplicityAccess().getGroup()); 
            // InternalProblem.g:794:3: ( rule__RangeMultiplicity__Group__0 )
            // InternalProblem.g:794:4: rule__RangeMultiplicity__Group__0
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
    // InternalProblem.g:803:1: entryRuleExactMultiplicity : ruleExactMultiplicity EOF ;
    public final void entryRuleExactMultiplicity() throws RecognitionException {
        try {
            // InternalProblem.g:804:1: ( ruleExactMultiplicity EOF )
            // InternalProblem.g:805:1: ruleExactMultiplicity EOF
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
    // InternalProblem.g:812:1: ruleExactMultiplicity : ( ( rule__ExactMultiplicity__ExactValueAssignment ) ) ;
    public final void ruleExactMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:816:2: ( ( ( rule__ExactMultiplicity__ExactValueAssignment ) ) )
            // InternalProblem.g:817:2: ( ( rule__ExactMultiplicity__ExactValueAssignment ) )
            {
            // InternalProblem.g:817:2: ( ( rule__ExactMultiplicity__ExactValueAssignment ) )
            // InternalProblem.g:818:3: ( rule__ExactMultiplicity__ExactValueAssignment )
            {
             before(grammarAccess.getExactMultiplicityAccess().getExactValueAssignment()); 
            // InternalProblem.g:819:3: ( rule__ExactMultiplicity__ExactValueAssignment )
            // InternalProblem.g:819:4: rule__ExactMultiplicity__ExactValueAssignment
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
    // InternalProblem.g:828:1: entryRuleUpperBound : ruleUpperBound EOF ;
    public final void entryRuleUpperBound() throws RecognitionException {
        try {
            // InternalProblem.g:829:1: ( ruleUpperBound EOF )
            // InternalProblem.g:830:1: ruleUpperBound EOF
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
    // InternalProblem.g:837:1: ruleUpperBound : ( ( rule__UpperBound__Alternatives ) ) ;
    public final void ruleUpperBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:841:2: ( ( ( rule__UpperBound__Alternatives ) ) )
            // InternalProblem.g:842:2: ( ( rule__UpperBound__Alternatives ) )
            {
            // InternalProblem.g:842:2: ( ( rule__UpperBound__Alternatives ) )
            // InternalProblem.g:843:3: ( rule__UpperBound__Alternatives )
            {
             before(grammarAccess.getUpperBoundAccess().getAlternatives()); 
            // InternalProblem.g:844:3: ( rule__UpperBound__Alternatives )
            // InternalProblem.g:844:4: rule__UpperBound__Alternatives
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
    // InternalProblem.g:853:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalProblem.g:857:1: ( ruleQualifiedName EOF )
            // InternalProblem.g:858:1: ruleQualifiedName EOF
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

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalProblem.g:868:1: ruleQualifiedName : ( ( rule__QualifiedName__Alternatives ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:873:2: ( ( ( rule__QualifiedName__Alternatives ) ) )
            // InternalProblem.g:874:2: ( ( rule__QualifiedName__Alternatives ) )
            {
            // InternalProblem.g:874:2: ( ( rule__QualifiedName__Alternatives ) )
            // InternalProblem.g:875:3: ( rule__QualifiedName__Alternatives )
            {
             before(grammarAccess.getQualifiedNameAccess().getAlternatives()); 
            // InternalProblem.g:876:3: ( rule__QualifiedName__Alternatives )
            // InternalProblem.g:876:4: rule__QualifiedName__Alternatives
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleIdentifier"
    // InternalProblem.g:886:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // InternalProblem.g:887:1: ( ruleIdentifier EOF )
            // InternalProblem.g:888:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalProblem.g:895:1: ruleIdentifier : ( ( rule__Identifier__Alternatives ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:899:2: ( ( ( rule__Identifier__Alternatives ) ) )
            // InternalProblem.g:900:2: ( ( rule__Identifier__Alternatives ) )
            {
            // InternalProblem.g:900:2: ( ( rule__Identifier__Alternatives ) )
            // InternalProblem.g:901:3: ( rule__Identifier__Alternatives )
            {
             before(grammarAccess.getIdentifierAccess().getAlternatives()); 
            // InternalProblem.g:902:3: ( rule__Identifier__Alternatives )
            // InternalProblem.g:902:4: rule__Identifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleInteger"
    // InternalProblem.g:911:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalProblem.g:915:1: ( ruleInteger EOF )
            // InternalProblem.g:916:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalProblem.g:926:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:931:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalProblem.g:932:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalProblem.g:932:2: ( ( rule__Integer__Group__0 ) )
            // InternalProblem.g:933:3: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // InternalProblem.g:934:3: ( rule__Integer__Group__0 )
            // InternalProblem.g:934:4: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getGroup()); 

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleReal"
    // InternalProblem.g:944:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // InternalProblem.g:945:1: ( ruleReal EOF )
            // InternalProblem.g:946:1: ruleReal EOF
            {
             before(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_1);
            ruleReal();

            state._fsp--;

             after(grammarAccess.getRealRule()); 
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
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalProblem.g:953:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:957:2: ( ( ( rule__Real__Group__0 ) ) )
            // InternalProblem.g:958:2: ( ( rule__Real__Group__0 ) )
            {
            // InternalProblem.g:958:2: ( ( rule__Real__Group__0 ) )
            // InternalProblem.g:959:3: ( rule__Real__Group__0 )
            {
             before(grammarAccess.getRealAccess().getGroup()); 
            // InternalProblem.g:960:3: ( rule__Real__Group__0 )
            // InternalProblem.g:960:4: rule__Real__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReal"


    // $ANTLR start "ruleLogicValue"
    // InternalProblem.g:969:1: ruleLogicValue : ( ( rule__LogicValue__Alternatives ) ) ;
    public final void ruleLogicValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:973:1: ( ( ( rule__LogicValue__Alternatives ) ) )
            // InternalProblem.g:974:2: ( ( rule__LogicValue__Alternatives ) )
            {
            // InternalProblem.g:974:2: ( ( rule__LogicValue__Alternatives ) )
            // InternalProblem.g:975:3: ( rule__LogicValue__Alternatives )
            {
             before(grammarAccess.getLogicValueAccess().getAlternatives()); 
            // InternalProblem.g:976:3: ( rule__LogicValue__Alternatives )
            // InternalProblem.g:976:4: rule__LogicValue__Alternatives
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
    // InternalProblem.g:985:1: ruleShortLogicValue : ( ( rule__ShortLogicValue__Alternatives ) ) ;
    public final void ruleShortLogicValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:989:1: ( ( ( rule__ShortLogicValue__Alternatives ) ) )
            // InternalProblem.g:990:2: ( ( rule__ShortLogicValue__Alternatives ) )
            {
            // InternalProblem.g:990:2: ( ( rule__ShortLogicValue__Alternatives ) )
            // InternalProblem.g:991:3: ( rule__ShortLogicValue__Alternatives )
            {
             before(grammarAccess.getShortLogicValueAccess().getAlternatives()); 
            // InternalProblem.g:992:3: ( rule__ShortLogicValue__Alternatives )
            // InternalProblem.g:992:4: rule__ShortLogicValue__Alternatives
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
    // InternalProblem.g:1000:1: rule__Statement__Alternatives : ( ( ruleClassDeclaration ) | ( ruleEnumDeclaration ) | ( rulePredicateDefinition ) | ( ruleAssertion ) | ( ruleNodeValueAssertion ) | ( ruleScopeDeclaration ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1004:1: ( ( ruleClassDeclaration ) | ( ruleEnumDeclaration ) | ( rulePredicateDefinition ) | ( ruleAssertion ) | ( ruleNodeValueAssertion ) | ( ruleScopeDeclaration ) )
            int alt1=6;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalProblem.g:1005:2: ( ruleClassDeclaration )
                    {
                    // InternalProblem.g:1005:2: ( ruleClassDeclaration )
                    // InternalProblem.g:1006:3: ruleClassDeclaration
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
                    // InternalProblem.g:1011:2: ( ruleEnumDeclaration )
                    {
                    // InternalProblem.g:1011:2: ( ruleEnumDeclaration )
                    // InternalProblem.g:1012:3: ruleEnumDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getEnumDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getEnumDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:1017:2: ( rulePredicateDefinition )
                    {
                    // InternalProblem.g:1017:2: ( rulePredicateDefinition )
                    // InternalProblem.g:1018:3: rulePredicateDefinition
                    {
                     before(grammarAccess.getStatementAccess().getPredicateDefinitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePredicateDefinition();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPredicateDefinitionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProblem.g:1023:2: ( ruleAssertion )
                    {
                    // InternalProblem.g:1023:2: ( ruleAssertion )
                    // InternalProblem.g:1024:3: ruleAssertion
                    {
                     before(grammarAccess.getStatementAccess().getAssertionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAssertion();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssertionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProblem.g:1029:2: ( ruleNodeValueAssertion )
                    {
                    // InternalProblem.g:1029:2: ( ruleNodeValueAssertion )
                    // InternalProblem.g:1030:3: ruleNodeValueAssertion
                    {
                     before(grammarAccess.getStatementAccess().getNodeValueAssertionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNodeValueAssertion();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getNodeValueAssertionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProblem.g:1035:2: ( ruleScopeDeclaration )
                    {
                    // InternalProblem.g:1035:2: ( ruleScopeDeclaration )
                    // InternalProblem.g:1036:3: ruleScopeDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getScopeDeclarationParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleScopeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getScopeDeclarationParserRuleCall_5()); 

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
    // InternalProblem.g:1045:1: rule__ClassDeclaration__Alternatives_4 : ( ( ( rule__ClassDeclaration__Group_4_0__0 ) ) | ( '.' ) );
    public final void rule__ClassDeclaration__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1049:1: ( ( ( rule__ClassDeclaration__Group_4_0__0 ) ) | ( '.' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalProblem.g:1050:2: ( ( rule__ClassDeclaration__Group_4_0__0 ) )
                    {
                    // InternalProblem.g:1050:2: ( ( rule__ClassDeclaration__Group_4_0__0 ) )
                    // InternalProblem.g:1051:3: ( rule__ClassDeclaration__Group_4_0__0 )
                    {
                     before(grammarAccess.getClassDeclarationAccess().getGroup_4_0()); 
                    // InternalProblem.g:1052:3: ( rule__ClassDeclaration__Group_4_0__0 )
                    // InternalProblem.g:1052:4: rule__ClassDeclaration__Group_4_0__0
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
                    // InternalProblem.g:1056:2: ( '.' )
                    {
                    // InternalProblem.g:1056:2: ( '.' )
                    // InternalProblem.g:1057:3: '.'
                    {
                     before(grammarAccess.getClassDeclarationAccess().getFullStopKeyword_4_1()); 
                    match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__EnumDeclaration__Alternatives_2"
    // InternalProblem.g:1066:1: rule__EnumDeclaration__Alternatives_2 : ( ( ( rule__EnumDeclaration__Group_2_0__0 ) ) | ( '.' ) );
    public final void rule__EnumDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1070:1: ( ( ( rule__EnumDeclaration__Group_2_0__0 ) ) | ( '.' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
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
                    // InternalProblem.g:1071:2: ( ( rule__EnumDeclaration__Group_2_0__0 ) )
                    {
                    // InternalProblem.g:1071:2: ( ( rule__EnumDeclaration__Group_2_0__0 ) )
                    // InternalProblem.g:1072:3: ( rule__EnumDeclaration__Group_2_0__0 )
                    {
                     before(grammarAccess.getEnumDeclarationAccess().getGroup_2_0()); 
                    // InternalProblem.g:1073:3: ( rule__EnumDeclaration__Group_2_0__0 )
                    // InternalProblem.g:1073:4: rule__EnumDeclaration__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumDeclaration__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumDeclarationAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1077:2: ( '.' )
                    {
                    // InternalProblem.g:1077:2: ( '.' )
                    // InternalProblem.g:1078:3: '.'
                    {
                     before(grammarAccess.getEnumDeclarationAccess().getFullStopKeyword_2_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEnumDeclarationAccess().getFullStopKeyword_2_1()); 

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
    // $ANTLR end "rule__EnumDeclaration__Alternatives_2"


    // $ANTLR start "rule__EnumDeclaration__Alternatives_2_0_1_2"
    // InternalProblem.g:1087:1: rule__EnumDeclaration__Alternatives_2_0_1_2 : ( ( ',' ) | ( ';' ) );
    public final void rule__EnumDeclaration__Alternatives_2_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1091:1: ( ( ',' ) | ( ';' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalProblem.g:1092:2: ( ',' )
                    {
                    // InternalProblem.g:1092:2: ( ',' )
                    // InternalProblem.g:1093:3: ','
                    {
                     before(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_2_0_1_2_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_2_0_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1098:2: ( ';' )
                    {
                    // InternalProblem.g:1098:2: ( ';' )
                    // InternalProblem.g:1099:3: ';'
                    {
                     before(grammarAccess.getEnumDeclarationAccess().getSemicolonKeyword_2_0_1_2_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEnumDeclarationAccess().getSemicolonKeyword_2_0_1_2_1()); 

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
    // $ANTLR end "rule__EnumDeclaration__Alternatives_2_0_1_2"


    // $ANTLR start "rule__ReferenceDeclaration__Alternatives_0"
    // InternalProblem.g:1108:1: rule__ReferenceDeclaration__Alternatives_0 : ( ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) ) | ( 'refers' ) );
    public final void rule__ReferenceDeclaration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1112:1: ( ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) ) | ( 'refers' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==43) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalProblem.g:1113:2: ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) )
                    {
                    // InternalProblem.g:1113:2: ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) )
                    // InternalProblem.g:1114:3: ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 )
                    {
                     before(grammarAccess.getReferenceDeclarationAccess().getContainmentAssignment_0_0()); 
                    // InternalProblem.g:1115:3: ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 )
                    // InternalProblem.g:1115:4: rule__ReferenceDeclaration__ContainmentAssignment_0_0
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
                    // InternalProblem.g:1119:2: ( 'refers' )
                    {
                    // InternalProblem.g:1119:2: ( 'refers' )
                    // InternalProblem.g:1120:3: 'refers'
                    {
                     before(grammarAccess.getReferenceDeclarationAccess().getRefersKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalProblem.g:1129:1: rule__PredicateDefinition__Alternatives_0 : ( ( ( rule__PredicateDefinition__Group_0_0__0 ) ) | ( 'pred' ) );
    public final void rule__PredicateDefinition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1133:1: ( ( ( rule__PredicateDefinition__Group_0_0__0 ) ) | ( 'pred' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==44) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalProblem.g:1134:2: ( ( rule__PredicateDefinition__Group_0_0__0 ) )
                    {
                    // InternalProblem.g:1134:2: ( ( rule__PredicateDefinition__Group_0_0__0 ) )
                    // InternalProblem.g:1135:3: ( rule__PredicateDefinition__Group_0_0__0 )
                    {
                     before(grammarAccess.getPredicateDefinitionAccess().getGroup_0_0()); 
                    // InternalProblem.g:1136:3: ( rule__PredicateDefinition__Group_0_0__0 )
                    // InternalProblem.g:1136:4: rule__PredicateDefinition__Group_0_0__0
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
                    // InternalProblem.g:1140:2: ( 'pred' )
                    {
                    // InternalProblem.g:1140:2: ( 'pred' )
                    // InternalProblem.g:1141:3: 'pred'
                    {
                     before(grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_1()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalProblem.g:1150:1: rule__Literal__Alternatives : ( ( ruleAtom ) | ( ruleNegativeLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1154:1: ( ( ruleAtom ) | ( ruleNegativeLiteral ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_QUOTED_ID && LA7_0<=RULE_ID)||(LA7_0>=20 && LA7_0<=21)) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalProblem.g:1155:2: ( ruleAtom )
                    {
                    // InternalProblem.g:1155:2: ( ruleAtom )
                    // InternalProblem.g:1156:3: ruleAtom
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
                    // InternalProblem.g:1161:2: ( ruleNegativeLiteral )
                    {
                    // InternalProblem.g:1161:2: ( ruleNegativeLiteral )
                    // InternalProblem.g:1162:3: ruleNegativeLiteral
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


    // $ANTLR start "rule__Argument__Alternatives"
    // InternalProblem.g:1171:1: rule__Argument__Alternatives : ( ( ruleVariableOrNodeArgument ) | ( ruleConstantArgument ) );
    public final void rule__Argument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1175:1: ( ( ruleVariableOrNodeArgument ) | ( ruleConstantArgument ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_QUOTED_ID && LA8_0<=RULE_ID)||(LA8_0>=20 && LA8_0<=21)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT||(LA8_0>=RULE_EXPONENTIAL && LA8_0<=RULE_STRING)||LA8_0==41) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalProblem.g:1176:2: ( ruleVariableOrNodeArgument )
                    {
                    // InternalProblem.g:1176:2: ( ruleVariableOrNodeArgument )
                    // InternalProblem.g:1177:3: ruleVariableOrNodeArgument
                    {
                     before(grammarAccess.getArgumentAccess().getVariableOrNodeArgumentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableOrNodeArgument();

                    state._fsp--;

                     after(grammarAccess.getArgumentAccess().getVariableOrNodeArgumentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1182:2: ( ruleConstantArgument )
                    {
                    // InternalProblem.g:1182:2: ( ruleConstantArgument )
                    // InternalProblem.g:1183:3: ruleConstantArgument
                    {
                     before(grammarAccess.getArgumentAccess().getConstantArgumentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConstantArgument();

                    state._fsp--;

                     after(grammarAccess.getArgumentAccess().getConstantArgumentParserRuleCall_1()); 

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
    // $ANTLR end "rule__Argument__Alternatives"


    // $ANTLR start "rule__Assertion__Alternatives_0"
    // InternalProblem.g:1192:1: rule__Assertion__Alternatives_0 : ( ( ( rule__Assertion__Group_0_0__0 ) ) | ( ( rule__Assertion__Group_0_1__0 ) ) );
    public final void rule__Assertion__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1196:1: ( ( ( rule__Assertion__Group_0_0__0 ) ) | ( ( rule__Assertion__Group_0_1__0 ) ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalProblem.g:1197:2: ( ( rule__Assertion__Group_0_0__0 ) )
                    {
                    // InternalProblem.g:1197:2: ( ( rule__Assertion__Group_0_0__0 ) )
                    // InternalProblem.g:1198:3: ( rule__Assertion__Group_0_0__0 )
                    {
                     before(grammarAccess.getAssertionAccess().getGroup_0_0()); 
                    // InternalProblem.g:1199:3: ( rule__Assertion__Group_0_0__0 )
                    // InternalProblem.g:1199:4: rule__Assertion__Group_0_0__0
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
                    // InternalProblem.g:1203:2: ( ( rule__Assertion__Group_0_1__0 ) )
                    {
                    // InternalProblem.g:1203:2: ( ( rule__Assertion__Group_0_1__0 ) )
                    // InternalProblem.g:1204:3: ( rule__Assertion__Group_0_1__0 )
                    {
                     before(grammarAccess.getAssertionAccess().getGroup_0_1()); 
                    // InternalProblem.g:1205:3: ( rule__Assertion__Group_0_1__0 )
                    // InternalProblem.g:1205:4: rule__Assertion__Group_0_1__0
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


    // $ANTLR start "rule__AssertionArgument__Alternatives"
    // InternalProblem.g:1213:1: rule__AssertionArgument__Alternatives : ( ( ruleNodeAssertionArgument ) | ( ruleConstantAssertionArgument ) );
    public final void rule__AssertionArgument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1217:1: ( ( ruleNodeAssertionArgument ) | ( ruleConstantAssertionArgument ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_QUOTED_ID && LA10_0<=RULE_ID)||(LA10_0>=20 && LA10_0<=21)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT||(LA10_0>=RULE_EXPONENTIAL && LA10_0<=RULE_STRING)||LA10_0==41) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalProblem.g:1218:2: ( ruleNodeAssertionArgument )
                    {
                    // InternalProblem.g:1218:2: ( ruleNodeAssertionArgument )
                    // InternalProblem.g:1219:3: ruleNodeAssertionArgument
                    {
                     before(grammarAccess.getAssertionArgumentAccess().getNodeAssertionArgumentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNodeAssertionArgument();

                    state._fsp--;

                     after(grammarAccess.getAssertionArgumentAccess().getNodeAssertionArgumentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1224:2: ( ruleConstantAssertionArgument )
                    {
                    // InternalProblem.g:1224:2: ( ruleConstantAssertionArgument )
                    // InternalProblem.g:1225:3: ruleConstantAssertionArgument
                    {
                     before(grammarAccess.getAssertionArgumentAccess().getConstantAssertionArgumentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConstantAssertionArgument();

                    state._fsp--;

                     after(grammarAccess.getAssertionArgumentAccess().getConstantAssertionArgumentParserRuleCall_1()); 

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
    // $ANTLR end "rule__AssertionArgument__Alternatives"


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalProblem.g:1234:1: rule__Constant__Alternatives : ( ( ruleRealConstant ) | ( ruleIntConstant ) | ( ruleStringConstant ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1238:1: ( ( ruleRealConstant ) | ( ruleIntConstant ) | ( ruleStringConstant ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_EXPONENTIAL) ) {
                    alt11=1;
                }
                else if ( (LA11_1==RULE_INT) ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==EOF||LA11_3==14||LA11_3==35) ) {
                        alt11=2;
                    }
                    else if ( (LA11_3==13) ) {
                        int LA11_6 = input.LA(4);

                        if ( (LA11_6==EOF||(LA11_6>=RULE_QUOTED_ID && LA11_6<=RULE_ID)||LA11_6==17||(LA11_6>=20 && LA11_6<=21)||(LA11_6>=23 && LA11_6<=24)||LA11_6==26||LA11_6==30||LA11_6==38||LA11_6==42||LA11_6==44) ) {
                            alt11=2;
                        }
                        else if ( (LA11_6==RULE_INT||LA11_6==RULE_EXPONENTIAL) ) {
                            alt11=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXPONENTIAL:
                {
                alt11=1;
                }
                break;
            case RULE_INT:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==EOF||LA11_3==14||LA11_3==35) ) {
                    alt11=2;
                }
                else if ( (LA11_3==13) ) {
                    int LA11_6 = input.LA(3);

                    if ( (LA11_6==EOF||(LA11_6>=RULE_QUOTED_ID && LA11_6<=RULE_ID)||LA11_6==17||(LA11_6>=20 && LA11_6<=21)||(LA11_6>=23 && LA11_6<=24)||LA11_6==26||LA11_6==30||LA11_6==38||LA11_6==42||LA11_6==44) ) {
                        alt11=2;
                    }
                    else if ( (LA11_6==RULE_INT||LA11_6==RULE_EXPONENTIAL) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 6, input);

                        throw nvae;
                    }
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
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalProblem.g:1239:2: ( ruleRealConstant )
                    {
                    // InternalProblem.g:1239:2: ( ruleRealConstant )
                    // InternalProblem.g:1240:3: ruleRealConstant
                    {
                     before(grammarAccess.getConstantAccess().getRealConstantParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRealConstant();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getRealConstantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1245:2: ( ruleIntConstant )
                    {
                    // InternalProblem.g:1245:2: ( ruleIntConstant )
                    // InternalProblem.g:1246:3: ruleIntConstant
                    {
                     before(grammarAccess.getConstantAccess().getIntConstantParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntConstant();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getIntConstantParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:1251:2: ( ruleStringConstant )
                    {
                    // InternalProblem.g:1251:2: ( ruleStringConstant )
                    // InternalProblem.g:1252:3: ruleStringConstant
                    {
                     before(grammarAccess.getConstantAccess().getStringConstantParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStringConstant();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getStringConstantParserRuleCall_2()); 

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
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__TypeScope__Alternatives_1"
    // InternalProblem.g:1261:1: rule__TypeScope__Alternatives_1 : ( ( ( rule__TypeScope__IncrementAssignment_1_0 ) ) | ( '=' ) );
    public final void rule__TypeScope__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1265:1: ( ( ( rule__TypeScope__IncrementAssignment_1_0 ) ) | ( '=' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==46) ) {
                alt12=1;
            }
            else if ( (LA12_0==18) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalProblem.g:1266:2: ( ( rule__TypeScope__IncrementAssignment_1_0 ) )
                    {
                    // InternalProblem.g:1266:2: ( ( rule__TypeScope__IncrementAssignment_1_0 ) )
                    // InternalProblem.g:1267:3: ( rule__TypeScope__IncrementAssignment_1_0 )
                    {
                     before(grammarAccess.getTypeScopeAccess().getIncrementAssignment_1_0()); 
                    // InternalProblem.g:1268:3: ( rule__TypeScope__IncrementAssignment_1_0 )
                    // InternalProblem.g:1268:4: rule__TypeScope__IncrementAssignment_1_0
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
                    // InternalProblem.g:1272:2: ( '=' )
                    {
                    // InternalProblem.g:1272:2: ( '=' )
                    // InternalProblem.g:1273:3: '='
                    {
                     before(grammarAccess.getTypeScopeAccess().getEqualsSignKeyword_1_1()); 
                    match(input,18,FOLLOW_2); 
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
    // InternalProblem.g:1282:1: rule__Multiplicity__Alternatives : ( ( ruleUnboundedMultiplicity ) | ( ruleDefiniteMultiplicity ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1286:1: ( ( ruleUnboundedMultiplicity ) | ( ruleDefiniteMultiplicity ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EOF||LA13_0==32) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_INT) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalProblem.g:1287:2: ( ruleUnboundedMultiplicity )
                    {
                    // InternalProblem.g:1287:2: ( ruleUnboundedMultiplicity )
                    // InternalProblem.g:1288:3: ruleUnboundedMultiplicity
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
                    // InternalProblem.g:1293:2: ( ruleDefiniteMultiplicity )
                    {
                    // InternalProblem.g:1293:2: ( ruleDefiniteMultiplicity )
                    // InternalProblem.g:1294:3: ruleDefiniteMultiplicity
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
    // InternalProblem.g:1303:1: rule__DefiniteMultiplicity__Alternatives : ( ( ruleRangeMultiplicity ) | ( ruleExactMultiplicity ) );
    public final void rule__DefiniteMultiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1307:1: ( ( ruleRangeMultiplicity ) | ( ruleExactMultiplicity ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EOF||(LA14_1>=13 && LA14_1<=14)||LA14_1==32) ) {
                    alt14=2;
                }
                else if ( (LA14_1==39) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalProblem.g:1308:2: ( ruleRangeMultiplicity )
                    {
                    // InternalProblem.g:1308:2: ( ruleRangeMultiplicity )
                    // InternalProblem.g:1309:3: ruleRangeMultiplicity
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
                    // InternalProblem.g:1314:2: ( ruleExactMultiplicity )
                    {
                    // InternalProblem.g:1314:2: ( ruleExactMultiplicity )
                    // InternalProblem.g:1315:3: ruleExactMultiplicity
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
    // InternalProblem.g:1324:1: rule__UpperBound__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__UpperBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1328:1: ( ( RULE_INT ) | ( '*' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==19) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalProblem.g:1329:2: ( RULE_INT )
                    {
                    // InternalProblem.g:1329:2: ( RULE_INT )
                    // InternalProblem.g:1330:3: RULE_INT
                    {
                     before(grammarAccess.getUpperBoundAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getUpperBoundAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1335:2: ( '*' )
                    {
                    // InternalProblem.g:1335:2: ( '*' )
                    // InternalProblem.g:1336:3: '*'
                    {
                     before(grammarAccess.getUpperBoundAccess().getAsteriskKeyword_1()); 
                    match(input,19,FOLLOW_2); 
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
    // InternalProblem.g:1345:1: rule__QualifiedName__Alternatives : ( ( RULE_QUOTED_ID ) | ( ( rule__QualifiedName__Group_1__0 ) ) );
    public final void rule__QualifiedName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1349:1: ( ( RULE_QUOTED_ID ) | ( ( rule__QualifiedName__Group_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_QUOTED_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID||(LA16_0>=20 && LA16_0<=21)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalProblem.g:1350:2: ( RULE_QUOTED_ID )
                    {
                    // InternalProblem.g:1350:2: ( RULE_QUOTED_ID )
                    // InternalProblem.g:1351:3: RULE_QUOTED_ID
                    {
                     before(grammarAccess.getQualifiedNameAccess().getQUOTED_IDTerminalRuleCall_0()); 
                    match(input,RULE_QUOTED_ID,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getQUOTED_IDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1356:2: ( ( rule__QualifiedName__Group_1__0 ) )
                    {
                    // InternalProblem.g:1356:2: ( ( rule__QualifiedName__Group_1__0 ) )
                    // InternalProblem.g:1357:3: ( rule__QualifiedName__Group_1__0 )
                    {
                     before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
                    // InternalProblem.g:1358:3: ( rule__QualifiedName__Group_1__0 )
                    // InternalProblem.g:1358:4: rule__QualifiedName__Group_1__0
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


    // $ANTLR start "rule__Identifier__Alternatives"
    // InternalProblem.g:1366:1: rule__Identifier__Alternatives : ( ( RULE_ID ) | ( 'true' ) | ( 'false' ) );
    public final void rule__Identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1370:1: ( ( RULE_ID ) | ( 'true' ) | ( 'false' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case 20:
                {
                alt17=2;
                }
                break;
            case 21:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalProblem.g:1371:2: ( RULE_ID )
                    {
                    // InternalProblem.g:1371:2: ( RULE_ID )
                    // InternalProblem.g:1372:3: RULE_ID
                    {
                     before(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1377:2: ( 'true' )
                    {
                    // InternalProblem.g:1377:2: ( 'true' )
                    // InternalProblem.g:1378:3: 'true'
                    {
                     before(grammarAccess.getIdentifierAccess().getTrueKeyword_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getIdentifierAccess().getTrueKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:1383:2: ( 'false' )
                    {
                    // InternalProblem.g:1383:2: ( 'false' )
                    // InternalProblem.g:1384:3: 'false'
                    {
                     before(grammarAccess.getIdentifierAccess().getFalseKeyword_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getIdentifierAccess().getFalseKeyword_2()); 

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
    // $ANTLR end "rule__Identifier__Alternatives"


    // $ANTLR start "rule__Real__Alternatives_1"
    // InternalProblem.g:1393:1: rule__Real__Alternatives_1 : ( ( RULE_EXPONENTIAL ) | ( ( rule__Real__Group_1_1__0 ) ) );
    public final void rule__Real__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1397:1: ( ( RULE_EXPONENTIAL ) | ( ( rule__Real__Group_1_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_EXPONENTIAL) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_INT) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalProblem.g:1398:2: ( RULE_EXPONENTIAL )
                    {
                    // InternalProblem.g:1398:2: ( RULE_EXPONENTIAL )
                    // InternalProblem.g:1399:3: RULE_EXPONENTIAL
                    {
                     before(grammarAccess.getRealAccess().getEXPONENTIALTerminalRuleCall_1_0()); 
                    match(input,RULE_EXPONENTIAL,FOLLOW_2); 
                     after(grammarAccess.getRealAccess().getEXPONENTIALTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1404:2: ( ( rule__Real__Group_1_1__0 ) )
                    {
                    // InternalProblem.g:1404:2: ( ( rule__Real__Group_1_1__0 ) )
                    // InternalProblem.g:1405:3: ( rule__Real__Group_1_1__0 )
                    {
                     before(grammarAccess.getRealAccess().getGroup_1_1()); 
                    // InternalProblem.g:1406:3: ( rule__Real__Group_1_1__0 )
                    // InternalProblem.g:1406:4: rule__Real__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Real__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRealAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Real__Alternatives_1"


    // $ANTLR start "rule__Real__Alternatives_1_1_2"
    // InternalProblem.g:1414:1: rule__Real__Alternatives_1_1_2 : ( ( RULE_INT ) | ( RULE_EXPONENTIAL ) );
    public final void rule__Real__Alternatives_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1418:1: ( ( RULE_INT ) | ( RULE_EXPONENTIAL ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_EXPONENTIAL) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalProblem.g:1419:2: ( RULE_INT )
                    {
                    // InternalProblem.g:1419:2: ( RULE_INT )
                    // InternalProblem.g:1420:3: RULE_INT
                    {
                     before(grammarAccess.getRealAccess().getINTTerminalRuleCall_1_1_2_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getRealAccess().getINTTerminalRuleCall_1_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1425:2: ( RULE_EXPONENTIAL )
                    {
                    // InternalProblem.g:1425:2: ( RULE_EXPONENTIAL )
                    // InternalProblem.g:1426:3: RULE_EXPONENTIAL
                    {
                     before(grammarAccess.getRealAccess().getEXPONENTIALTerminalRuleCall_1_1_2_1()); 
                    match(input,RULE_EXPONENTIAL,FOLLOW_2); 
                     after(grammarAccess.getRealAccess().getEXPONENTIALTerminalRuleCall_1_1_2_1()); 

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
    // $ANTLR end "rule__Real__Alternatives_1_1_2"


    // $ANTLR start "rule__LogicValue__Alternatives"
    // InternalProblem.g:1435:1: rule__LogicValue__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) | ( ( 'unknown' ) ) );
    public final void rule__LogicValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1439:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) | ( ( 'unknown' ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt20=1;
                }
                break;
            case 21:
                {
                alt20=2;
                }
                break;
            case 22:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalProblem.g:1440:2: ( ( 'true' ) )
                    {
                    // InternalProblem.g:1440:2: ( ( 'true' ) )
                    // InternalProblem.g:1441:3: ( 'true' )
                    {
                     before(grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:1442:3: ( 'true' )
                    // InternalProblem.g:1442:4: 'true'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1446:2: ( ( 'false' ) )
                    {
                    // InternalProblem.g:1446:2: ( ( 'false' ) )
                    // InternalProblem.g:1447:3: ( 'false' )
                    {
                     before(grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:1448:3: ( 'false' )
                    // InternalProblem.g:1448:4: 'false'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:1452:2: ( ( 'unknown' ) )
                    {
                    // InternalProblem.g:1452:2: ( ( 'unknown' ) )
                    // InternalProblem.g:1453:3: ( 'unknown' )
                    {
                     before(grammarAccess.getLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_2()); 
                    // InternalProblem.g:1454:3: ( 'unknown' )
                    // InternalProblem.g:1454:4: 'unknown'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalProblem.g:1462:1: rule__ShortLogicValue__Alternatives : ( ( ( '!' ) ) | ( ( '?' ) ) );
    public final void rule__ShortLogicValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1466:1: ( ( ( '!' ) ) | ( ( '?' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            else if ( (LA21_0==24) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalProblem.g:1467:2: ( ( '!' ) )
                    {
                    // InternalProblem.g:1467:2: ( ( '!' ) )
                    // InternalProblem.g:1468:3: ( '!' )
                    {
                     before(grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:1469:3: ( '!' )
                    // InternalProblem.g:1469:4: '!'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1473:2: ( ( '?' ) )
                    {
                    // InternalProblem.g:1473:2: ( ( '?' ) )
                    // InternalProblem.g:1474:3: ( '?' )
                    {
                     before(grammarAccess.getShortLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:1475:3: ( '?' )
                    // InternalProblem.g:1475:4: '?'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalProblem.g:1483:1: rule__Problem__Group__0 : rule__Problem__Group__0__Impl rule__Problem__Group__1 ;
    public final void rule__Problem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1487:1: ( rule__Problem__Group__0__Impl rule__Problem__Group__1 )
            // InternalProblem.g:1488:2: rule__Problem__Group__0__Impl rule__Problem__Group__1
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
    // InternalProblem.g:1495:1: rule__Problem__Group__0__Impl : ( ( rule__Problem__Group_0__0 )? ) ;
    public final void rule__Problem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1499:1: ( ( ( rule__Problem__Group_0__0 )? ) )
            // InternalProblem.g:1500:1: ( ( rule__Problem__Group_0__0 )? )
            {
            // InternalProblem.g:1500:1: ( ( rule__Problem__Group_0__0 )? )
            // InternalProblem.g:1501:2: ( rule__Problem__Group_0__0 )?
            {
             before(grammarAccess.getProblemAccess().getGroup_0()); 
            // InternalProblem.g:1502:2: ( rule__Problem__Group_0__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProblem.g:1502:3: rule__Problem__Group_0__0
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
    // InternalProblem.g:1510:1: rule__Problem__Group__1 : rule__Problem__Group__1__Impl ;
    public final void rule__Problem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1514:1: ( rule__Problem__Group__1__Impl )
            // InternalProblem.g:1515:2: rule__Problem__Group__1__Impl
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
    // InternalProblem.g:1521:1: rule__Problem__Group__1__Impl : ( ( rule__Problem__StatementsAssignment_1 )* ) ;
    public final void rule__Problem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1525:1: ( ( ( rule__Problem__StatementsAssignment_1 )* ) )
            // InternalProblem.g:1526:1: ( ( rule__Problem__StatementsAssignment_1 )* )
            {
            // InternalProblem.g:1526:1: ( ( rule__Problem__StatementsAssignment_1 )* )
            // InternalProblem.g:1527:2: ( rule__Problem__StatementsAssignment_1 )*
            {
             before(grammarAccess.getProblemAccess().getStatementsAssignment_1()); 
            // InternalProblem.g:1528:2: ( rule__Problem__StatementsAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_QUOTED_ID && LA23_0<=RULE_ID)||LA23_0==17||(LA23_0>=20 && LA23_0<=21)||(LA23_0>=23 && LA23_0<=24)||LA23_0==26||LA23_0==30||LA23_0==38||LA23_0==42||LA23_0==44) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalProblem.g:1528:3: rule__Problem__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Problem__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalProblem.g:1537:1: rule__Problem__Group_0__0 : rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1 ;
    public final void rule__Problem__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1541:1: ( rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1 )
            // InternalProblem.g:1542:2: rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1
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
    // InternalProblem.g:1549:1: rule__Problem__Group_0__0__Impl : ( 'problem' ) ;
    public final void rule__Problem__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1553:1: ( ( 'problem' ) )
            // InternalProblem.g:1554:1: ( 'problem' )
            {
            // InternalProblem.g:1554:1: ( 'problem' )
            // InternalProblem.g:1555:2: 'problem'
            {
             before(grammarAccess.getProblemAccess().getProblemKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalProblem.g:1564:1: rule__Problem__Group_0__1 : rule__Problem__Group_0__1__Impl rule__Problem__Group_0__2 ;
    public final void rule__Problem__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1568:1: ( rule__Problem__Group_0__1__Impl rule__Problem__Group_0__2 )
            // InternalProblem.g:1569:2: rule__Problem__Group_0__1__Impl rule__Problem__Group_0__2
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
    // InternalProblem.g:1576:1: rule__Problem__Group_0__1__Impl : ( ( rule__Problem__NameAssignment_0_1 ) ) ;
    public final void rule__Problem__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1580:1: ( ( ( rule__Problem__NameAssignment_0_1 ) ) )
            // InternalProblem.g:1581:1: ( ( rule__Problem__NameAssignment_0_1 ) )
            {
            // InternalProblem.g:1581:1: ( ( rule__Problem__NameAssignment_0_1 ) )
            // InternalProblem.g:1582:2: ( rule__Problem__NameAssignment_0_1 )
            {
             before(grammarAccess.getProblemAccess().getNameAssignment_0_1()); 
            // InternalProblem.g:1583:2: ( rule__Problem__NameAssignment_0_1 )
            // InternalProblem.g:1583:3: rule__Problem__NameAssignment_0_1
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
    // InternalProblem.g:1591:1: rule__Problem__Group_0__2 : rule__Problem__Group_0__2__Impl ;
    public final void rule__Problem__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1595:1: ( rule__Problem__Group_0__2__Impl )
            // InternalProblem.g:1596:2: rule__Problem__Group_0__2__Impl
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
    // InternalProblem.g:1602:1: rule__Problem__Group_0__2__Impl : ( '.' ) ;
    public final void rule__Problem__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1606:1: ( ( '.' ) )
            // InternalProblem.g:1607:1: ( '.' )
            {
            // InternalProblem.g:1607:1: ( '.' )
            // InternalProblem.g:1608:2: '.'
            {
             before(grammarAccess.getProblemAccess().getFullStopKeyword_0_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalProblem.g:1618:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1622:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalProblem.g:1623:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
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
    // InternalProblem.g:1630:1: rule__ClassDeclaration__Group__0__Impl : ( ( rule__ClassDeclaration__AbstractAssignment_0 )? ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1634:1: ( ( ( rule__ClassDeclaration__AbstractAssignment_0 )? ) )
            // InternalProblem.g:1635:1: ( ( rule__ClassDeclaration__AbstractAssignment_0 )? )
            {
            // InternalProblem.g:1635:1: ( ( rule__ClassDeclaration__AbstractAssignment_0 )? )
            // InternalProblem.g:1636:2: ( rule__ClassDeclaration__AbstractAssignment_0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getAbstractAssignment_0()); 
            // InternalProblem.g:1637:2: ( rule__ClassDeclaration__AbstractAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProblem.g:1637:3: rule__ClassDeclaration__AbstractAssignment_0
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
    // InternalProblem.g:1645:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1649:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalProblem.g:1650:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
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
    // InternalProblem.g:1657:1: rule__ClassDeclaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1661:1: ( ( 'class' ) )
            // InternalProblem.g:1662:1: ( 'class' )
            {
            // InternalProblem.g:1662:1: ( 'class' )
            // InternalProblem.g:1663:2: 'class'
            {
             before(grammarAccess.getClassDeclarationAccess().getClassKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalProblem.g:1672:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1676:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalProblem.g:1677:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
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
    // InternalProblem.g:1684:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1688:1: ( ( ( rule__ClassDeclaration__NameAssignment_2 ) ) )
            // InternalProblem.g:1689:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            {
            // InternalProblem.g:1689:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            // InternalProblem.g:1690:2: ( rule__ClassDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 
            // InternalProblem.g:1691:2: ( rule__ClassDeclaration__NameAssignment_2 )
            // InternalProblem.g:1691:3: rule__ClassDeclaration__NameAssignment_2
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
    // InternalProblem.g:1699:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1703:1: ( rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 )
            // InternalProblem.g:1704:2: rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4
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
    // InternalProblem.g:1711:1: rule__ClassDeclaration__Group__3__Impl : ( ( rule__ClassDeclaration__Group_3__0 )? ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1715:1: ( ( ( rule__ClassDeclaration__Group_3__0 )? ) )
            // InternalProblem.g:1716:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            {
            // InternalProblem.g:1716:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            // InternalProblem.g:1717:2: ( rule__ClassDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3()); 
            // InternalProblem.g:1718:2: ( rule__ClassDeclaration__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalProblem.g:1718:3: rule__ClassDeclaration__Group_3__0
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
    // InternalProblem.g:1726:1: rule__ClassDeclaration__Group__4 : rule__ClassDeclaration__Group__4__Impl ;
    public final void rule__ClassDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1730:1: ( rule__ClassDeclaration__Group__4__Impl )
            // InternalProblem.g:1731:2: rule__ClassDeclaration__Group__4__Impl
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
    // InternalProblem.g:1737:1: rule__ClassDeclaration__Group__4__Impl : ( ( rule__ClassDeclaration__Alternatives_4 ) ) ;
    public final void rule__ClassDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1741:1: ( ( ( rule__ClassDeclaration__Alternatives_4 ) ) )
            // InternalProblem.g:1742:1: ( ( rule__ClassDeclaration__Alternatives_4 ) )
            {
            // InternalProblem.g:1742:1: ( ( rule__ClassDeclaration__Alternatives_4 ) )
            // InternalProblem.g:1743:2: ( rule__ClassDeclaration__Alternatives_4 )
            {
             before(grammarAccess.getClassDeclarationAccess().getAlternatives_4()); 
            // InternalProblem.g:1744:2: ( rule__ClassDeclaration__Alternatives_4 )
            // InternalProblem.g:1744:3: rule__ClassDeclaration__Alternatives_4
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
    // InternalProblem.g:1753:1: rule__ClassDeclaration__Group_3__0 : rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 ;
    public final void rule__ClassDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1757:1: ( rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 )
            // InternalProblem.g:1758:2: rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProblem.g:1765:1: rule__ClassDeclaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__ClassDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1769:1: ( ( 'extends' ) )
            // InternalProblem.g:1770:1: ( 'extends' )
            {
            // InternalProblem.g:1770:1: ( 'extends' )
            // InternalProblem.g:1771:2: 'extends'
            {
             before(grammarAccess.getClassDeclarationAccess().getExtendsKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalProblem.g:1780:1: rule__ClassDeclaration__Group_3__1 : rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 ;
    public final void rule__ClassDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1784:1: ( rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 )
            // InternalProblem.g:1785:2: rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalProblem.g:1792:1: rule__ClassDeclaration__Group_3__1__Impl : ( ( rule__ClassDeclaration__SuperTypesAssignment_3_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1796:1: ( ( ( rule__ClassDeclaration__SuperTypesAssignment_3_1 ) ) )
            // InternalProblem.g:1797:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_1 ) )
            {
            // InternalProblem.g:1797:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_1 ) )
            // InternalProblem.g:1798:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesAssignment_3_1()); 
            // InternalProblem.g:1799:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_1 )
            // InternalProblem.g:1799:3: rule__ClassDeclaration__SuperTypesAssignment_3_1
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
    // InternalProblem.g:1807:1: rule__ClassDeclaration__Group_3__2 : rule__ClassDeclaration__Group_3__2__Impl ;
    public final void rule__ClassDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1811:1: ( rule__ClassDeclaration__Group_3__2__Impl )
            // InternalProblem.g:1812:2: rule__ClassDeclaration__Group_3__2__Impl
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
    // InternalProblem.g:1818:1: rule__ClassDeclaration__Group_3__2__Impl : ( ( rule__ClassDeclaration__Group_3_2__0 )* ) ;
    public final void rule__ClassDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1822:1: ( ( ( rule__ClassDeclaration__Group_3_2__0 )* ) )
            // InternalProblem.g:1823:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            {
            // InternalProblem.g:1823:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            // InternalProblem.g:1824:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3_2()); 
            // InternalProblem.g:1825:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==14) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalProblem.g:1825:3: rule__ClassDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ClassDeclaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalProblem.g:1834:1: rule__ClassDeclaration__Group_3_2__0 : rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 ;
    public final void rule__ClassDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1838:1: ( rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 )
            // InternalProblem.g:1839:2: rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProblem.g:1846:1: rule__ClassDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1850:1: ( ( ',' ) )
            // InternalProblem.g:1851:1: ( ',' )
            {
            // InternalProblem.g:1851:1: ( ',' )
            // InternalProblem.g:1852:2: ','
            {
             before(grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalProblem.g:1861:1: rule__ClassDeclaration__Group_3_2__1 : rule__ClassDeclaration__Group_3_2__1__Impl ;
    public final void rule__ClassDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1865:1: ( rule__ClassDeclaration__Group_3_2__1__Impl )
            // InternalProblem.g:1866:2: rule__ClassDeclaration__Group_3_2__1__Impl
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
    // InternalProblem.g:1872:1: rule__ClassDeclaration__Group_3_2__1__Impl : ( ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1876:1: ( ( ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 ) ) )
            // InternalProblem.g:1877:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 ) )
            {
            // InternalProblem.g:1877:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 ) )
            // InternalProblem.g:1878:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesAssignment_3_2_1()); 
            // InternalProblem.g:1879:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 )
            // InternalProblem.g:1879:3: rule__ClassDeclaration__SuperTypesAssignment_3_2_1
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
    // InternalProblem.g:1888:1: rule__ClassDeclaration__Group_4_0__0 : rule__ClassDeclaration__Group_4_0__0__Impl rule__ClassDeclaration__Group_4_0__1 ;
    public final void rule__ClassDeclaration__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1892:1: ( rule__ClassDeclaration__Group_4_0__0__Impl rule__ClassDeclaration__Group_4_0__1 )
            // InternalProblem.g:1893:2: rule__ClassDeclaration__Group_4_0__0__Impl rule__ClassDeclaration__Group_4_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalProblem.g:1900:1: rule__ClassDeclaration__Group_4_0__0__Impl : ( '{' ) ;
    public final void rule__ClassDeclaration__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1904:1: ( ( '{' ) )
            // InternalProblem.g:1905:1: ( '{' )
            {
            // InternalProblem.g:1905:1: ( '{' )
            // InternalProblem.g:1906:2: '{'
            {
             before(grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_4_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalProblem.g:1915:1: rule__ClassDeclaration__Group_4_0__1 : rule__ClassDeclaration__Group_4_0__1__Impl rule__ClassDeclaration__Group_4_0__2 ;
    public final void rule__ClassDeclaration__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1919:1: ( rule__ClassDeclaration__Group_4_0__1__Impl rule__ClassDeclaration__Group_4_0__2 )
            // InternalProblem.g:1920:2: rule__ClassDeclaration__Group_4_0__1__Impl rule__ClassDeclaration__Group_4_0__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalProblem.g:1927:1: rule__ClassDeclaration__Group_4_0__1__Impl : ( ( rule__ClassDeclaration__Group_4_0_1__0 )* ) ;
    public final void rule__ClassDeclaration__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1931:1: ( ( ( rule__ClassDeclaration__Group_4_0_1__0 )* ) )
            // InternalProblem.g:1932:1: ( ( rule__ClassDeclaration__Group_4_0_1__0 )* )
            {
            // InternalProblem.g:1932:1: ( ( rule__ClassDeclaration__Group_4_0_1__0 )* )
            // InternalProblem.g:1933:2: ( rule__ClassDeclaration__Group_4_0_1__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_4_0_1()); 
            // InternalProblem.g:1934:2: ( rule__ClassDeclaration__Group_4_0_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_QUOTED_ID && LA27_0<=RULE_ID)||LA27_0==16||(LA27_0>=20 && LA27_0<=21)||LA27_0==43) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalProblem.g:1934:3: rule__ClassDeclaration__Group_4_0_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ClassDeclaration__Group_4_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalProblem.g:1942:1: rule__ClassDeclaration__Group_4_0__2 : rule__ClassDeclaration__Group_4_0__2__Impl ;
    public final void rule__ClassDeclaration__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1946:1: ( rule__ClassDeclaration__Group_4_0__2__Impl )
            // InternalProblem.g:1947:2: rule__ClassDeclaration__Group_4_0__2__Impl
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
    // InternalProblem.g:1953:1: rule__ClassDeclaration__Group_4_0__2__Impl : ( '}' ) ;
    public final void rule__ClassDeclaration__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1957:1: ( ( '}' ) )
            // InternalProblem.g:1958:1: ( '}' )
            {
            // InternalProblem.g:1958:1: ( '}' )
            // InternalProblem.g:1959:2: '}'
            {
             before(grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_4_0_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalProblem.g:1969:1: rule__ClassDeclaration__Group_4_0_1__0 : rule__ClassDeclaration__Group_4_0_1__0__Impl rule__ClassDeclaration__Group_4_0_1__1 ;
    public final void rule__ClassDeclaration__Group_4_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1973:1: ( rule__ClassDeclaration__Group_4_0_1__0__Impl rule__ClassDeclaration__Group_4_0_1__1 )
            // InternalProblem.g:1974:2: rule__ClassDeclaration__Group_4_0_1__0__Impl rule__ClassDeclaration__Group_4_0_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalProblem.g:1981:1: rule__ClassDeclaration__Group_4_0_1__0__Impl : ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 ) ) ;
    public final void rule__ClassDeclaration__Group_4_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1985:1: ( ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 ) ) )
            // InternalProblem.g:1986:1: ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 ) )
            {
            // InternalProblem.g:1986:1: ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 ) )
            // InternalProblem.g:1987:2: ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsAssignment_4_0_1_0()); 
            // InternalProblem.g:1988:2: ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 )
            // InternalProblem.g:1988:3: rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0
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
    // InternalProblem.g:1996:1: rule__ClassDeclaration__Group_4_0_1__1 : rule__ClassDeclaration__Group_4_0_1__1__Impl ;
    public final void rule__ClassDeclaration__Group_4_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2000:1: ( rule__ClassDeclaration__Group_4_0_1__1__Impl )
            // InternalProblem.g:2001:2: rule__ClassDeclaration__Group_4_0_1__1__Impl
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
    // InternalProblem.g:2007:1: rule__ClassDeclaration__Group_4_0_1__1__Impl : ( ( ';' )? ) ;
    public final void rule__ClassDeclaration__Group_4_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2011:1: ( ( ( ';' )? ) )
            // InternalProblem.g:2012:1: ( ( ';' )? )
            {
            // InternalProblem.g:2012:1: ( ( ';' )? )
            // InternalProblem.g:2013:2: ( ';' )?
            {
             before(grammarAccess.getClassDeclarationAccess().getSemicolonKeyword_4_0_1_1()); 
            // InternalProblem.g:2014:2: ( ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==15) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalProblem.g:2014:3: ';'
                    {
                    match(input,15,FOLLOW_2); 

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


    // $ANTLR start "rule__EnumDeclaration__Group__0"
    // InternalProblem.g:2023:1: rule__EnumDeclaration__Group__0 : rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 ;
    public final void rule__EnumDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2027:1: ( rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 )
            // InternalProblem.g:2028:2: rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EnumDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__0"


    // $ANTLR start "rule__EnumDeclaration__Group__0__Impl"
    // InternalProblem.g:2035:1: rule__EnumDeclaration__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2039:1: ( ( 'enum' ) )
            // InternalProblem.g:2040:1: ( 'enum' )
            {
            // InternalProblem.g:2040:1: ( 'enum' )
            // InternalProblem.g:2041:2: 'enum'
            {
             before(grammarAccess.getEnumDeclarationAccess().getEnumKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__1"
    // InternalProblem.g:2050:1: rule__EnumDeclaration__Group__1 : rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 ;
    public final void rule__EnumDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2054:1: ( rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 )
            // InternalProblem.g:2055:2: rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__EnumDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__1"


    // $ANTLR start "rule__EnumDeclaration__Group__1__Impl"
    // InternalProblem.g:2062:1: rule__EnumDeclaration__Group__1__Impl : ( ( rule__EnumDeclaration__NameAssignment_1 ) ) ;
    public final void rule__EnumDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2066:1: ( ( ( rule__EnumDeclaration__NameAssignment_1 ) ) )
            // InternalProblem.g:2067:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            {
            // InternalProblem.g:2067:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            // InternalProblem.g:2068:2: ( rule__EnumDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 
            // InternalProblem.g:2069:2: ( rule__EnumDeclaration__NameAssignment_1 )
            // InternalProblem.g:2069:3: rule__EnumDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__1__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__2"
    // InternalProblem.g:2077:1: rule__EnumDeclaration__Group__2 : rule__EnumDeclaration__Group__2__Impl ;
    public final void rule__EnumDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2081:1: ( rule__EnumDeclaration__Group__2__Impl )
            // InternalProblem.g:2082:2: rule__EnumDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__2"


    // $ANTLR start "rule__EnumDeclaration__Group__2__Impl"
    // InternalProblem.g:2088:1: rule__EnumDeclaration__Group__2__Impl : ( ( rule__EnumDeclaration__Alternatives_2 ) ) ;
    public final void rule__EnumDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2092:1: ( ( ( rule__EnumDeclaration__Alternatives_2 ) ) )
            // InternalProblem.g:2093:1: ( ( rule__EnumDeclaration__Alternatives_2 ) )
            {
            // InternalProblem.g:2093:1: ( ( rule__EnumDeclaration__Alternatives_2 ) )
            // InternalProblem.g:2094:2: ( rule__EnumDeclaration__Alternatives_2 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getAlternatives_2()); 
            // InternalProblem.g:2095:2: ( rule__EnumDeclaration__Alternatives_2 )
            // InternalProblem.g:2095:3: rule__EnumDeclaration__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group__2__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_2_0__0"
    // InternalProblem.g:2104:1: rule__EnumDeclaration__Group_2_0__0 : rule__EnumDeclaration__Group_2_0__0__Impl rule__EnumDeclaration__Group_2_0__1 ;
    public final void rule__EnumDeclaration__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2108:1: ( rule__EnumDeclaration__Group_2_0__0__Impl rule__EnumDeclaration__Group_2_0__1 )
            // InternalProblem.g:2109:2: rule__EnumDeclaration__Group_2_0__0__Impl rule__EnumDeclaration__Group_2_0__1
            {
            pushFollow(FOLLOW_15);
            rule__EnumDeclaration__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_2_0__0"


    // $ANTLR start "rule__EnumDeclaration__Group_2_0__0__Impl"
    // InternalProblem.g:2116:1: rule__EnumDeclaration__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__EnumDeclaration__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2120:1: ( ( '{' ) )
            // InternalProblem.g:2121:1: ( '{' )
            {
            // InternalProblem.g:2121:1: ( '{' )
            // InternalProblem.g:2122:2: '{'
            {
             before(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_2_0__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_2_0__1"
    // InternalProblem.g:2131:1: rule__EnumDeclaration__Group_2_0__1 : rule__EnumDeclaration__Group_2_0__1__Impl rule__EnumDeclaration__Group_2_0__2 ;
    public final void rule__EnumDeclaration__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2135:1: ( rule__EnumDeclaration__Group_2_0__1__Impl rule__EnumDeclaration__Group_2_0__2 )
            // InternalProblem.g:2136:2: rule__EnumDeclaration__Group_2_0__1__Impl rule__EnumDeclaration__Group_2_0__2
            {
            pushFollow(FOLLOW_15);
            rule__EnumDeclaration__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_2_0__1"


    // $ANTLR start "rule__EnumDeclaration__Group_2_0__1__Impl"
    // InternalProblem.g:2143:1: rule__EnumDeclaration__Group_2_0__1__Impl : ( ( rule__EnumDeclaration__Group_2_0_1__0 )? ) ;
    public final void rule__EnumDeclaration__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2147:1: ( ( ( rule__EnumDeclaration__Group_2_0_1__0 )? ) )
            // InternalProblem.g:2148:1: ( ( rule__EnumDeclaration__Group_2_0_1__0 )? )
            {
            // InternalProblem.g:2148:1: ( ( rule__EnumDeclaration__Group_2_0_1__0 )? )
            // InternalProblem.g:2149:2: ( rule__EnumDeclaration__Group_2_0_1__0 )?
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup_2_0_1()); 
            // InternalProblem.g:2150:2: ( rule__EnumDeclaration__Group_2_0_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||(LA29_0>=20 && LA29_0<=21)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalProblem.g:2150:3: rule__EnumDeclaration__Group_2_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumDeclaration__Group_2_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumDeclarationAccess().getGroup_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_2_0__1__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_2_0__2"
    // InternalProblem.g:2158:1: rule__EnumDeclaration__Group_2_0__2 : rule__EnumDeclaration__Group_2_0__2__Impl ;
    public final void rule__EnumDeclaration__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2162:1: ( rule__EnumDeclaration__Group_2_0__2__Impl )
            // InternalProblem.g:2163:2: rule__EnumDeclaration__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_2_0__2"


    // $ANTLR start "rule__EnumDeclaration__Group_2_0__2__Impl"
    // InternalProblem.g:2169:1: rule__EnumDeclaration__Group_2_0__2__Impl : ( '}' ) ;
    public final void rule__EnumDeclaration__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2173:1: ( ( '}' ) )
            // InternalProblem.g:2174:1: ( '}' )
            {
            // InternalProblem.g:2174:1: ( '}' )
            // InternalProblem.g:2175:2: '}'
            {
             before(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_2_0_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_2_0__2__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_2_0_1__0"
    // InternalProblem.g:2185:1: rule__EnumDeclaration__Group_2_0_1__0 : rule__EnumDeclaration__Group_2_0_1__0__Impl rule__EnumDeclaration__Group_2_0_1__1 ;
    public final void rule__EnumDeclaration__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2189:1: ( rule__EnumDeclaration__Group_2_0_1__0__Impl rule__EnumDeclaration__Group_2_0_1__1 )
            // InternalProblem.g:2190:2: rule__EnumDeclaration__Group_2_0_1__0__Impl rule__EnumDeclaration__Group_2_0_1__1
            {
            pushFollow(FOLLOW_16);
            rule__EnumDeclaration__Group_2_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group_2_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_2_0_1__0"


    // $ANTLR start "rule__EnumDeclaration__Group_2_0_1__0__Impl"
    // InternalProblem.g:2197:1: rule__EnumDeclaration__Group_2_0_1__0__Impl : ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 ) ) ;
    public final void rule__EnumDeclaration__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2201:1: ( ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 ) ) )
            // InternalProblem.g:2202:1: ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 ) )
            {
            // InternalProblem.g:2202:1: ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 ) )
            // InternalProblem.g:2203:2: ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getLiteralsAssignment_2_0_1_0()); 
            // InternalProblem.g:2204:2: ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 )
            // InternalProblem.g:2204:3: rule__EnumDeclaration__LiteralsAssignment_2_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__LiteralsAssignment_2_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getLiteralsAssignment_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_2_0_1__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_2_0_1__1"
    // InternalProblem.g:2212:1: rule__EnumDeclaration__Group_2_0_1__1 : rule__EnumDeclaration__Group_2_0_1__1__Impl rule__EnumDeclaration__Group_2_0_1__2 ;
    public final void rule__EnumDeclaration__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2216:1: ( rule__EnumDeclaration__Group_2_0_1__1__Impl rule__EnumDeclaration__Group_2_0_1__2 )
            // InternalProblem.g:2217:2: rule__EnumDeclaration__Group_2_0_1__1__Impl rule__EnumDeclaration__Group_2_0_1__2
            {
            pushFollow(FOLLOW_16);
            rule__EnumDeclaration__Group_2_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group_2_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_2_0_1__1"


    // $ANTLR start "rule__EnumDeclaration__Group_2_0_1__1__Impl"
    // InternalProblem.g:2224:1: rule__EnumDeclaration__Group_2_0_1__1__Impl : ( ( rule__EnumDeclaration__Group_2_0_1_1__0 )* ) ;
    public final void rule__EnumDeclaration__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2228:1: ( ( ( rule__EnumDeclaration__Group_2_0_1_1__0 )* ) )
            // InternalProblem.g:2229:1: ( ( rule__EnumDeclaration__Group_2_0_1_1__0 )* )
            {
            // InternalProblem.g:2229:1: ( ( rule__EnumDeclaration__Group_2_0_1_1__0 )* )
            // InternalProblem.g:2230:2: ( rule__EnumDeclaration__Group_2_0_1_1__0 )*
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup_2_0_1_1()); 
            // InternalProblem.g:2231:2: ( rule__EnumDeclaration__Group_2_0_1_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==14) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_ID||(LA30_1>=20 && LA30_1<=21)) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalProblem.g:2231:3: rule__EnumDeclaration__Group_2_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__EnumDeclaration__Group_2_0_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getEnumDeclarationAccess().getGroup_2_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_2_0_1__1__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_2_0_1__2"
    // InternalProblem.g:2239:1: rule__EnumDeclaration__Group_2_0_1__2 : rule__EnumDeclaration__Group_2_0_1__2__Impl ;
    public final void rule__EnumDeclaration__Group_2_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2243:1: ( rule__EnumDeclaration__Group_2_0_1__2__Impl )
            // InternalProblem.g:2244:2: rule__EnumDeclaration__Group_2_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group_2_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_2_0_1__2"


    // $ANTLR start "rule__EnumDeclaration__Group_2_0_1__2__Impl"
    // InternalProblem.g:2250:1: rule__EnumDeclaration__Group_2_0_1__2__Impl : ( ( rule__EnumDeclaration__Alternatives_2_0_1_2 )? ) ;
    public final void rule__EnumDeclaration__Group_2_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2254:1: ( ( ( rule__EnumDeclaration__Alternatives_2_0_1_2 )? ) )
            // InternalProblem.g:2255:1: ( ( rule__EnumDeclaration__Alternatives_2_0_1_2 )? )
            {
            // InternalProblem.g:2255:1: ( ( rule__EnumDeclaration__Alternatives_2_0_1_2 )? )
            // InternalProblem.g:2256:2: ( rule__EnumDeclaration__Alternatives_2_0_1_2 )?
            {
             before(grammarAccess.getEnumDeclarationAccess().getAlternatives_2_0_1_2()); 
            // InternalProblem.g:2257:2: ( rule__EnumDeclaration__Alternatives_2_0_1_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=14 && LA31_0<=15)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalProblem.g:2257:3: rule__EnumDeclaration__Alternatives_2_0_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumDeclaration__Alternatives_2_0_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumDeclarationAccess().getAlternatives_2_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_2_0_1__2__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_2_0_1_1__0"
    // InternalProblem.g:2266:1: rule__EnumDeclaration__Group_2_0_1_1__0 : rule__EnumDeclaration__Group_2_0_1_1__0__Impl rule__EnumDeclaration__Group_2_0_1_1__1 ;
    public final void rule__EnumDeclaration__Group_2_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2270:1: ( rule__EnumDeclaration__Group_2_0_1_1__0__Impl rule__EnumDeclaration__Group_2_0_1_1__1 )
            // InternalProblem.g:2271:2: rule__EnumDeclaration__Group_2_0_1_1__0__Impl rule__EnumDeclaration__Group_2_0_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__EnumDeclaration__Group_2_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group_2_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_2_0_1_1__0"


    // $ANTLR start "rule__EnumDeclaration__Group_2_0_1_1__0__Impl"
    // InternalProblem.g:2278:1: rule__EnumDeclaration__Group_2_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__EnumDeclaration__Group_2_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2282:1: ( ( ',' ) )
            // InternalProblem.g:2283:1: ( ',' )
            {
            // InternalProblem.g:2283:1: ( ',' )
            // InternalProblem.g:2284:2: ','
            {
             before(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_2_0_1_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_2_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_2_0_1_1__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_2_0_1_1__1"
    // InternalProblem.g:2293:1: rule__EnumDeclaration__Group_2_0_1_1__1 : rule__EnumDeclaration__Group_2_0_1_1__1__Impl ;
    public final void rule__EnumDeclaration__Group_2_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2297:1: ( rule__EnumDeclaration__Group_2_0_1_1__1__Impl )
            // InternalProblem.g:2298:2: rule__EnumDeclaration__Group_2_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__Group_2_0_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_2_0_1_1__1"


    // $ANTLR start "rule__EnumDeclaration__Group_2_0_1_1__1__Impl"
    // InternalProblem.g:2304:1: rule__EnumDeclaration__Group_2_0_1_1__1__Impl : ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 ) ) ;
    public final void rule__EnumDeclaration__Group_2_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2308:1: ( ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 ) ) )
            // InternalProblem.g:2309:1: ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 ) )
            {
            // InternalProblem.g:2309:1: ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 ) )
            // InternalProblem.g:2310:2: ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getLiteralsAssignment_2_0_1_1_1()); 
            // InternalProblem.g:2311:2: ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 )
            // InternalProblem.g:2311:3: rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getLiteralsAssignment_2_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__Group_2_0_1_1__1__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group__0"
    // InternalProblem.g:2320:1: rule__ReferenceDeclaration__Group__0 : rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1 ;
    public final void rule__ReferenceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2324:1: ( rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1 )
            // InternalProblem.g:2325:2: rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalProblem.g:2332:1: rule__ReferenceDeclaration__Group__0__Impl : ( ( rule__ReferenceDeclaration__Alternatives_0 )? ) ;
    public final void rule__ReferenceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2336:1: ( ( ( rule__ReferenceDeclaration__Alternatives_0 )? ) )
            // InternalProblem.g:2337:1: ( ( rule__ReferenceDeclaration__Alternatives_0 )? )
            {
            // InternalProblem.g:2337:1: ( ( rule__ReferenceDeclaration__Alternatives_0 )? )
            // InternalProblem.g:2338:2: ( rule__ReferenceDeclaration__Alternatives_0 )?
            {
             before(grammarAccess.getReferenceDeclarationAccess().getAlternatives_0()); 
            // InternalProblem.g:2339:2: ( rule__ReferenceDeclaration__Alternatives_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16||LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalProblem.g:2339:3: rule__ReferenceDeclaration__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceDeclaration__Alternatives_0();

                    state._fsp--;


                    }
                    break;

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
    // InternalProblem.g:2347:1: rule__ReferenceDeclaration__Group__1 : rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2 ;
    public final void rule__ReferenceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2351:1: ( rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2 )
            // InternalProblem.g:2352:2: rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalProblem.g:2359:1: rule__ReferenceDeclaration__Group__1__Impl : ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) ) ;
    public final void rule__ReferenceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2363:1: ( ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) ) )
            // InternalProblem.g:2364:1: ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) )
            {
            // InternalProblem.g:2364:1: ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) )
            // InternalProblem.g:2365:2: ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeAssignment_1()); 
            // InternalProblem.g:2366:2: ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 )
            // InternalProblem.g:2366:3: rule__ReferenceDeclaration__ReferenceTypeAssignment_1
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
    // InternalProblem.g:2374:1: rule__ReferenceDeclaration__Group__2 : rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3 ;
    public final void rule__ReferenceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2378:1: ( rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3 )
            // InternalProblem.g:2379:2: rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalProblem.g:2386:1: rule__ReferenceDeclaration__Group__2__Impl : ( ( rule__ReferenceDeclaration__Group_2__0 )? ) ;
    public final void rule__ReferenceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2390:1: ( ( ( rule__ReferenceDeclaration__Group_2__0 )? ) )
            // InternalProblem.g:2391:1: ( ( rule__ReferenceDeclaration__Group_2__0 )? )
            {
            // InternalProblem.g:2391:1: ( ( rule__ReferenceDeclaration__Group_2__0 )? )
            // InternalProblem.g:2392:2: ( rule__ReferenceDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getReferenceDeclarationAccess().getGroup_2()); 
            // InternalProblem.g:2393:2: ( rule__ReferenceDeclaration__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalProblem.g:2393:3: rule__ReferenceDeclaration__Group_2__0
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
    // InternalProblem.g:2401:1: rule__ReferenceDeclaration__Group__3 : rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4 ;
    public final void rule__ReferenceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2405:1: ( rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4 )
            // InternalProblem.g:2406:2: rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalProblem.g:2413:1: rule__ReferenceDeclaration__Group__3__Impl : ( ( rule__ReferenceDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ReferenceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2417:1: ( ( ( rule__ReferenceDeclaration__NameAssignment_3 ) ) )
            // InternalProblem.g:2418:1: ( ( rule__ReferenceDeclaration__NameAssignment_3 ) )
            {
            // InternalProblem.g:2418:1: ( ( rule__ReferenceDeclaration__NameAssignment_3 ) )
            // InternalProblem.g:2419:2: ( rule__ReferenceDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getNameAssignment_3()); 
            // InternalProblem.g:2420:2: ( rule__ReferenceDeclaration__NameAssignment_3 )
            // InternalProblem.g:2420:3: rule__ReferenceDeclaration__NameAssignment_3
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
    // InternalProblem.g:2428:1: rule__ReferenceDeclaration__Group__4 : rule__ReferenceDeclaration__Group__4__Impl ;
    public final void rule__ReferenceDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2432:1: ( rule__ReferenceDeclaration__Group__4__Impl )
            // InternalProblem.g:2433:2: rule__ReferenceDeclaration__Group__4__Impl
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
    // InternalProblem.g:2439:1: rule__ReferenceDeclaration__Group__4__Impl : ( ( rule__ReferenceDeclaration__Group_4__0 )? ) ;
    public final void rule__ReferenceDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2443:1: ( ( ( rule__ReferenceDeclaration__Group_4__0 )? ) )
            // InternalProblem.g:2444:1: ( ( rule__ReferenceDeclaration__Group_4__0 )? )
            {
            // InternalProblem.g:2444:1: ( ( rule__ReferenceDeclaration__Group_4__0 )? )
            // InternalProblem.g:2445:2: ( rule__ReferenceDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getReferenceDeclarationAccess().getGroup_4()); 
            // InternalProblem.g:2446:2: ( rule__ReferenceDeclaration__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalProblem.g:2446:3: rule__ReferenceDeclaration__Group_4__0
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
    // InternalProblem.g:2455:1: rule__ReferenceDeclaration__Group_2__0 : rule__ReferenceDeclaration__Group_2__0__Impl rule__ReferenceDeclaration__Group_2__1 ;
    public final void rule__ReferenceDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2459:1: ( rule__ReferenceDeclaration__Group_2__0__Impl rule__ReferenceDeclaration__Group_2__1 )
            // InternalProblem.g:2460:2: rule__ReferenceDeclaration__Group_2__0__Impl rule__ReferenceDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalProblem.g:2467:1: rule__ReferenceDeclaration__Group_2__0__Impl : ( '[' ) ;
    public final void rule__ReferenceDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2471:1: ( ( '[' ) )
            // InternalProblem.g:2472:1: ( '[' )
            {
            // InternalProblem.g:2472:1: ( '[' )
            // InternalProblem.g:2473:2: '['
            {
             before(grammarAccess.getReferenceDeclarationAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalProblem.g:2482:1: rule__ReferenceDeclaration__Group_2__1 : rule__ReferenceDeclaration__Group_2__1__Impl rule__ReferenceDeclaration__Group_2__2 ;
    public final void rule__ReferenceDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2486:1: ( rule__ReferenceDeclaration__Group_2__1__Impl rule__ReferenceDeclaration__Group_2__2 )
            // InternalProblem.g:2487:2: rule__ReferenceDeclaration__Group_2__1__Impl rule__ReferenceDeclaration__Group_2__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalProblem.g:2494:1: rule__ReferenceDeclaration__Group_2__1__Impl : ( ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 ) ) ;
    public final void rule__ReferenceDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2498:1: ( ( ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 ) ) )
            // InternalProblem.g:2499:1: ( ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 ) )
            {
            // InternalProblem.g:2499:1: ( ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 ) )
            // InternalProblem.g:2500:2: ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getMultiplicityAssignment_2_1()); 
            // InternalProblem.g:2501:2: ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 )
            // InternalProblem.g:2501:3: rule__ReferenceDeclaration__MultiplicityAssignment_2_1
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
    // InternalProblem.g:2509:1: rule__ReferenceDeclaration__Group_2__2 : rule__ReferenceDeclaration__Group_2__2__Impl ;
    public final void rule__ReferenceDeclaration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2513:1: ( rule__ReferenceDeclaration__Group_2__2__Impl )
            // InternalProblem.g:2514:2: rule__ReferenceDeclaration__Group_2__2__Impl
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
    // InternalProblem.g:2520:1: rule__ReferenceDeclaration__Group_2__2__Impl : ( ']' ) ;
    public final void rule__ReferenceDeclaration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2524:1: ( ( ']' ) )
            // InternalProblem.g:2525:1: ( ']' )
            {
            // InternalProblem.g:2525:1: ( ']' )
            // InternalProblem.g:2526:2: ']'
            {
             before(grammarAccess.getReferenceDeclarationAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalProblem.g:2536:1: rule__ReferenceDeclaration__Group_4__0 : rule__ReferenceDeclaration__Group_4__0__Impl rule__ReferenceDeclaration__Group_4__1 ;
    public final void rule__ReferenceDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2540:1: ( rule__ReferenceDeclaration__Group_4__0__Impl rule__ReferenceDeclaration__Group_4__1 )
            // InternalProblem.g:2541:2: rule__ReferenceDeclaration__Group_4__0__Impl rule__ReferenceDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProblem.g:2548:1: rule__ReferenceDeclaration__Group_4__0__Impl : ( 'opposite' ) ;
    public final void rule__ReferenceDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2552:1: ( ( 'opposite' ) )
            // InternalProblem.g:2553:1: ( 'opposite' )
            {
            // InternalProblem.g:2553:1: ( 'opposite' )
            // InternalProblem.g:2554:2: 'opposite'
            {
             before(grammarAccess.getReferenceDeclarationAccess().getOppositeKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalProblem.g:2563:1: rule__ReferenceDeclaration__Group_4__1 : rule__ReferenceDeclaration__Group_4__1__Impl ;
    public final void rule__ReferenceDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2567:1: ( rule__ReferenceDeclaration__Group_4__1__Impl )
            // InternalProblem.g:2568:2: rule__ReferenceDeclaration__Group_4__1__Impl
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
    // InternalProblem.g:2574:1: rule__ReferenceDeclaration__Group_4__1__Impl : ( ( rule__ReferenceDeclaration__OppositeAssignment_4_1 ) ) ;
    public final void rule__ReferenceDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2578:1: ( ( ( rule__ReferenceDeclaration__OppositeAssignment_4_1 ) ) )
            // InternalProblem.g:2579:1: ( ( rule__ReferenceDeclaration__OppositeAssignment_4_1 ) )
            {
            // InternalProblem.g:2579:1: ( ( rule__ReferenceDeclaration__OppositeAssignment_4_1 ) )
            // InternalProblem.g:2580:2: ( rule__ReferenceDeclaration__OppositeAssignment_4_1 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getOppositeAssignment_4_1()); 
            // InternalProblem.g:2581:2: ( rule__ReferenceDeclaration__OppositeAssignment_4_1 )
            // InternalProblem.g:2581:3: rule__ReferenceDeclaration__OppositeAssignment_4_1
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
    // InternalProblem.g:2590:1: rule__PredicateDefinition__Group__0 : rule__PredicateDefinition__Group__0__Impl rule__PredicateDefinition__Group__1 ;
    public final void rule__PredicateDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2594:1: ( rule__PredicateDefinition__Group__0__Impl rule__PredicateDefinition__Group__1 )
            // InternalProblem.g:2595:2: rule__PredicateDefinition__Group__0__Impl rule__PredicateDefinition__Group__1
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
    // InternalProblem.g:2602:1: rule__PredicateDefinition__Group__0__Impl : ( ( rule__PredicateDefinition__Alternatives_0 ) ) ;
    public final void rule__PredicateDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2606:1: ( ( ( rule__PredicateDefinition__Alternatives_0 ) ) )
            // InternalProblem.g:2607:1: ( ( rule__PredicateDefinition__Alternatives_0 ) )
            {
            // InternalProblem.g:2607:1: ( ( rule__PredicateDefinition__Alternatives_0 ) )
            // InternalProblem.g:2608:2: ( rule__PredicateDefinition__Alternatives_0 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getAlternatives_0()); 
            // InternalProblem.g:2609:2: ( rule__PredicateDefinition__Alternatives_0 )
            // InternalProblem.g:2609:3: rule__PredicateDefinition__Alternatives_0
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
    // InternalProblem.g:2617:1: rule__PredicateDefinition__Group__1 : rule__PredicateDefinition__Group__1__Impl rule__PredicateDefinition__Group__2 ;
    public final void rule__PredicateDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2621:1: ( rule__PredicateDefinition__Group__1__Impl rule__PredicateDefinition__Group__2 )
            // InternalProblem.g:2622:2: rule__PredicateDefinition__Group__1__Impl rule__PredicateDefinition__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalProblem.g:2629:1: rule__PredicateDefinition__Group__1__Impl : ( ( rule__PredicateDefinition__NameAssignment_1 ) ) ;
    public final void rule__PredicateDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2633:1: ( ( ( rule__PredicateDefinition__NameAssignment_1 ) ) )
            // InternalProblem.g:2634:1: ( ( rule__PredicateDefinition__NameAssignment_1 ) )
            {
            // InternalProblem.g:2634:1: ( ( rule__PredicateDefinition__NameAssignment_1 ) )
            // InternalProblem.g:2635:2: ( rule__PredicateDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getNameAssignment_1()); 
            // InternalProblem.g:2636:2: ( rule__PredicateDefinition__NameAssignment_1 )
            // InternalProblem.g:2636:3: rule__PredicateDefinition__NameAssignment_1
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
    // InternalProblem.g:2644:1: rule__PredicateDefinition__Group__2 : rule__PredicateDefinition__Group__2__Impl rule__PredicateDefinition__Group__3 ;
    public final void rule__PredicateDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2648:1: ( rule__PredicateDefinition__Group__2__Impl rule__PredicateDefinition__Group__3 )
            // InternalProblem.g:2649:2: rule__PredicateDefinition__Group__2__Impl rule__PredicateDefinition__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalProblem.g:2656:1: rule__PredicateDefinition__Group__2__Impl : ( '(' ) ;
    public final void rule__PredicateDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2660:1: ( ( '(' ) )
            // InternalProblem.g:2661:1: ( '(' )
            {
            // InternalProblem.g:2661:1: ( '(' )
            // InternalProblem.g:2662:2: '('
            {
             before(grammarAccess.getPredicateDefinitionAccess().getLeftParenthesisKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalProblem.g:2671:1: rule__PredicateDefinition__Group__3 : rule__PredicateDefinition__Group__3__Impl rule__PredicateDefinition__Group__4 ;
    public final void rule__PredicateDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2675:1: ( rule__PredicateDefinition__Group__3__Impl rule__PredicateDefinition__Group__4 )
            // InternalProblem.g:2676:2: rule__PredicateDefinition__Group__3__Impl rule__PredicateDefinition__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalProblem.g:2683:1: rule__PredicateDefinition__Group__3__Impl : ( ( rule__PredicateDefinition__Group_3__0 )? ) ;
    public final void rule__PredicateDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2687:1: ( ( ( rule__PredicateDefinition__Group_3__0 )? ) )
            // InternalProblem.g:2688:1: ( ( rule__PredicateDefinition__Group_3__0 )? )
            {
            // InternalProblem.g:2688:1: ( ( rule__PredicateDefinition__Group_3__0 )? )
            // InternalProblem.g:2689:2: ( rule__PredicateDefinition__Group_3__0 )?
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_3()); 
            // InternalProblem.g:2690:2: ( rule__PredicateDefinition__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_QUOTED_ID && LA35_0<=RULE_ID)||(LA35_0>=20 && LA35_0<=21)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalProblem.g:2690:3: rule__PredicateDefinition__Group_3__0
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
    // InternalProblem.g:2698:1: rule__PredicateDefinition__Group__4 : rule__PredicateDefinition__Group__4__Impl rule__PredicateDefinition__Group__5 ;
    public final void rule__PredicateDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2702:1: ( rule__PredicateDefinition__Group__4__Impl rule__PredicateDefinition__Group__5 )
            // InternalProblem.g:2703:2: rule__PredicateDefinition__Group__4__Impl rule__PredicateDefinition__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalProblem.g:2710:1: rule__PredicateDefinition__Group__4__Impl : ( ')' ) ;
    public final void rule__PredicateDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2714:1: ( ( ')' ) )
            // InternalProblem.g:2715:1: ( ')' )
            {
            // InternalProblem.g:2715:1: ( ')' )
            // InternalProblem.g:2716:2: ')'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getRightParenthesisKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalProblem.g:2725:1: rule__PredicateDefinition__Group__5 : rule__PredicateDefinition__Group__5__Impl rule__PredicateDefinition__Group__6 ;
    public final void rule__PredicateDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2729:1: ( rule__PredicateDefinition__Group__5__Impl rule__PredicateDefinition__Group__6 )
            // InternalProblem.g:2730:2: rule__PredicateDefinition__Group__5__Impl rule__PredicateDefinition__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalProblem.g:2737:1: rule__PredicateDefinition__Group__5__Impl : ( ( rule__PredicateDefinition__Group_5__0 )? ) ;
    public final void rule__PredicateDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2741:1: ( ( ( rule__PredicateDefinition__Group_5__0 )? ) )
            // InternalProblem.g:2742:1: ( ( rule__PredicateDefinition__Group_5__0 )? )
            {
            // InternalProblem.g:2742:1: ( ( rule__PredicateDefinition__Group_5__0 )? )
            // InternalProblem.g:2743:2: ( rule__PredicateDefinition__Group_5__0 )?
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_5()); 
            // InternalProblem.g:2744:2: ( rule__PredicateDefinition__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalProblem.g:2744:3: rule__PredicateDefinition__Group_5__0
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
    // InternalProblem.g:2752:1: rule__PredicateDefinition__Group__6 : rule__PredicateDefinition__Group__6__Impl ;
    public final void rule__PredicateDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2756:1: ( rule__PredicateDefinition__Group__6__Impl )
            // InternalProblem.g:2757:2: rule__PredicateDefinition__Group__6__Impl
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
    // InternalProblem.g:2763:1: rule__PredicateDefinition__Group__6__Impl : ( '.' ) ;
    public final void rule__PredicateDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2767:1: ( ( '.' ) )
            // InternalProblem.g:2768:1: ( '.' )
            {
            // InternalProblem.g:2768:1: ( '.' )
            // InternalProblem.g:2769:2: '.'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getFullStopKeyword_6()); 
            match(input,13,FOLLOW_2); 
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
    // InternalProblem.g:2779:1: rule__PredicateDefinition__Group_0_0__0 : rule__PredicateDefinition__Group_0_0__0__Impl rule__PredicateDefinition__Group_0_0__1 ;
    public final void rule__PredicateDefinition__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2783:1: ( rule__PredicateDefinition__Group_0_0__0__Impl rule__PredicateDefinition__Group_0_0__1 )
            // InternalProblem.g:2784:2: rule__PredicateDefinition__Group_0_0__0__Impl rule__PredicateDefinition__Group_0_0__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalProblem.g:2791:1: rule__PredicateDefinition__Group_0_0__0__Impl : ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) ) ;
    public final void rule__PredicateDefinition__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2795:1: ( ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) ) )
            // InternalProblem.g:2796:1: ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) )
            {
            // InternalProblem.g:2796:1: ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) )
            // InternalProblem.g:2797:2: ( rule__PredicateDefinition__ErrorAssignment_0_0_0 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getErrorAssignment_0_0_0()); 
            // InternalProblem.g:2798:2: ( rule__PredicateDefinition__ErrorAssignment_0_0_0 )
            // InternalProblem.g:2798:3: rule__PredicateDefinition__ErrorAssignment_0_0_0
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
    // InternalProblem.g:2806:1: rule__PredicateDefinition__Group_0_0__1 : rule__PredicateDefinition__Group_0_0__1__Impl ;
    public final void rule__PredicateDefinition__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2810:1: ( rule__PredicateDefinition__Group_0_0__1__Impl )
            // InternalProblem.g:2811:2: rule__PredicateDefinition__Group_0_0__1__Impl
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
    // InternalProblem.g:2817:1: rule__PredicateDefinition__Group_0_0__1__Impl : ( ( 'pred' )? ) ;
    public final void rule__PredicateDefinition__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2821:1: ( ( ( 'pred' )? ) )
            // InternalProblem.g:2822:1: ( ( 'pred' )? )
            {
            // InternalProblem.g:2822:1: ( ( 'pred' )? )
            // InternalProblem.g:2823:2: ( 'pred' )?
            {
             before(grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_0_1()); 
            // InternalProblem.g:2824:2: ( 'pred' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==17) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalProblem.g:2824:3: 'pred'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalProblem.g:2833:1: rule__PredicateDefinition__Group_3__0 : rule__PredicateDefinition__Group_3__0__Impl rule__PredicateDefinition__Group_3__1 ;
    public final void rule__PredicateDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2837:1: ( rule__PredicateDefinition__Group_3__0__Impl rule__PredicateDefinition__Group_3__1 )
            // InternalProblem.g:2838:2: rule__PredicateDefinition__Group_3__0__Impl rule__PredicateDefinition__Group_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalProblem.g:2845:1: rule__PredicateDefinition__Group_3__0__Impl : ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) ) ;
    public final void rule__PredicateDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2849:1: ( ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) ) )
            // InternalProblem.g:2850:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) )
            {
            // InternalProblem.g:2850:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) )
            // InternalProblem.g:2851:2: ( rule__PredicateDefinition__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getParametersAssignment_3_0()); 
            // InternalProblem.g:2852:2: ( rule__PredicateDefinition__ParametersAssignment_3_0 )
            // InternalProblem.g:2852:3: rule__PredicateDefinition__ParametersAssignment_3_0
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
    // InternalProblem.g:2860:1: rule__PredicateDefinition__Group_3__1 : rule__PredicateDefinition__Group_3__1__Impl ;
    public final void rule__PredicateDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2864:1: ( rule__PredicateDefinition__Group_3__1__Impl )
            // InternalProblem.g:2865:2: rule__PredicateDefinition__Group_3__1__Impl
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
    // InternalProblem.g:2871:1: rule__PredicateDefinition__Group_3__1__Impl : ( ( rule__PredicateDefinition__Group_3_1__0 )* ) ;
    public final void rule__PredicateDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2875:1: ( ( ( rule__PredicateDefinition__Group_3_1__0 )* ) )
            // InternalProblem.g:2876:1: ( ( rule__PredicateDefinition__Group_3_1__0 )* )
            {
            // InternalProblem.g:2876:1: ( ( rule__PredicateDefinition__Group_3_1__0 )* )
            // InternalProblem.g:2877:2: ( rule__PredicateDefinition__Group_3_1__0 )*
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_3_1()); 
            // InternalProblem.g:2878:2: ( rule__PredicateDefinition__Group_3_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==14) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalProblem.g:2878:3: rule__PredicateDefinition__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PredicateDefinition__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalProblem.g:2887:1: rule__PredicateDefinition__Group_3_1__0 : rule__PredicateDefinition__Group_3_1__0__Impl rule__PredicateDefinition__Group_3_1__1 ;
    public final void rule__PredicateDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2891:1: ( rule__PredicateDefinition__Group_3_1__0__Impl rule__PredicateDefinition__Group_3_1__1 )
            // InternalProblem.g:2892:2: rule__PredicateDefinition__Group_3_1__0__Impl rule__PredicateDefinition__Group_3_1__1
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
    // InternalProblem.g:2899:1: rule__PredicateDefinition__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__PredicateDefinition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2903:1: ( ( ',' ) )
            // InternalProblem.g:2904:1: ( ',' )
            {
            // InternalProblem.g:2904:1: ( ',' )
            // InternalProblem.g:2905:2: ','
            {
             before(grammarAccess.getPredicateDefinitionAccess().getCommaKeyword_3_1_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalProblem.g:2914:1: rule__PredicateDefinition__Group_3_1__1 : rule__PredicateDefinition__Group_3_1__1__Impl ;
    public final void rule__PredicateDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2918:1: ( rule__PredicateDefinition__Group_3_1__1__Impl )
            // InternalProblem.g:2919:2: rule__PredicateDefinition__Group_3_1__1__Impl
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
    // InternalProblem.g:2925:1: rule__PredicateDefinition__Group_3_1__1__Impl : ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__PredicateDefinition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2929:1: ( ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) ) )
            // InternalProblem.g:2930:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) )
            {
            // InternalProblem.g:2930:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) )
            // InternalProblem.g:2931:2: ( rule__PredicateDefinition__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getParametersAssignment_3_1_1()); 
            // InternalProblem.g:2932:2: ( rule__PredicateDefinition__ParametersAssignment_3_1_1 )
            // InternalProblem.g:2932:3: rule__PredicateDefinition__ParametersAssignment_3_1_1
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
    // InternalProblem.g:2941:1: rule__PredicateDefinition__Group_5__0 : rule__PredicateDefinition__Group_5__0__Impl rule__PredicateDefinition__Group_5__1 ;
    public final void rule__PredicateDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2945:1: ( rule__PredicateDefinition__Group_5__0__Impl rule__PredicateDefinition__Group_5__1 )
            // InternalProblem.g:2946:2: rule__PredicateDefinition__Group_5__0__Impl rule__PredicateDefinition__Group_5__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalProblem.g:2953:1: rule__PredicateDefinition__Group_5__0__Impl : ( ':-' ) ;
    public final void rule__PredicateDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2957:1: ( ( ':-' ) )
            // InternalProblem.g:2958:1: ( ':-' )
            {
            // InternalProblem.g:2958:1: ( ':-' )
            // InternalProblem.g:2959:2: ':-'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getColonHyphenMinusKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalProblem.g:2968:1: rule__PredicateDefinition__Group_5__1 : rule__PredicateDefinition__Group_5__1__Impl rule__PredicateDefinition__Group_5__2 ;
    public final void rule__PredicateDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2972:1: ( rule__PredicateDefinition__Group_5__1__Impl rule__PredicateDefinition__Group_5__2 )
            // InternalProblem.g:2973:2: rule__PredicateDefinition__Group_5__1__Impl rule__PredicateDefinition__Group_5__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalProblem.g:2980:1: rule__PredicateDefinition__Group_5__1__Impl : ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) ) ;
    public final void rule__PredicateDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2984:1: ( ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) ) )
            // InternalProblem.g:2985:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) )
            {
            // InternalProblem.g:2985:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) )
            // InternalProblem.g:2986:2: ( rule__PredicateDefinition__BodiesAssignment_5_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getBodiesAssignment_5_1()); 
            // InternalProblem.g:2987:2: ( rule__PredicateDefinition__BodiesAssignment_5_1 )
            // InternalProblem.g:2987:3: rule__PredicateDefinition__BodiesAssignment_5_1
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
    // InternalProblem.g:2995:1: rule__PredicateDefinition__Group_5__2 : rule__PredicateDefinition__Group_5__2__Impl ;
    public final void rule__PredicateDefinition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2999:1: ( rule__PredicateDefinition__Group_5__2__Impl )
            // InternalProblem.g:3000:2: rule__PredicateDefinition__Group_5__2__Impl
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
    // InternalProblem.g:3006:1: rule__PredicateDefinition__Group_5__2__Impl : ( ( rule__PredicateDefinition__Group_5_2__0 )* ) ;
    public final void rule__PredicateDefinition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3010:1: ( ( ( rule__PredicateDefinition__Group_5_2__0 )* ) )
            // InternalProblem.g:3011:1: ( ( rule__PredicateDefinition__Group_5_2__0 )* )
            {
            // InternalProblem.g:3011:1: ( ( rule__PredicateDefinition__Group_5_2__0 )* )
            // InternalProblem.g:3012:2: ( rule__PredicateDefinition__Group_5_2__0 )*
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_5_2()); 
            // InternalProblem.g:3013:2: ( rule__PredicateDefinition__Group_5_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==15) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalProblem.g:3013:3: rule__PredicateDefinition__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__PredicateDefinition__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalProblem.g:3022:1: rule__PredicateDefinition__Group_5_2__0 : rule__PredicateDefinition__Group_5_2__0__Impl rule__PredicateDefinition__Group_5_2__1 ;
    public final void rule__PredicateDefinition__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3026:1: ( rule__PredicateDefinition__Group_5_2__0__Impl rule__PredicateDefinition__Group_5_2__1 )
            // InternalProblem.g:3027:2: rule__PredicateDefinition__Group_5_2__0__Impl rule__PredicateDefinition__Group_5_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalProblem.g:3034:1: rule__PredicateDefinition__Group_5_2__0__Impl : ( ';' ) ;
    public final void rule__PredicateDefinition__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3038:1: ( ( ';' ) )
            // InternalProblem.g:3039:1: ( ';' )
            {
            // InternalProblem.g:3039:1: ( ';' )
            // InternalProblem.g:3040:2: ';'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getSemicolonKeyword_5_2_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalProblem.g:3049:1: rule__PredicateDefinition__Group_5_2__1 : rule__PredicateDefinition__Group_5_2__1__Impl ;
    public final void rule__PredicateDefinition__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3053:1: ( rule__PredicateDefinition__Group_5_2__1__Impl )
            // InternalProblem.g:3054:2: rule__PredicateDefinition__Group_5_2__1__Impl
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
    // InternalProblem.g:3060:1: rule__PredicateDefinition__Group_5_2__1__Impl : ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) ) ;
    public final void rule__PredicateDefinition__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3064:1: ( ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) ) )
            // InternalProblem.g:3065:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) )
            {
            // InternalProblem.g:3065:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) )
            // InternalProblem.g:3066:2: ( rule__PredicateDefinition__BodiesAssignment_5_2_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getBodiesAssignment_5_2_1()); 
            // InternalProblem.g:3067:2: ( rule__PredicateDefinition__BodiesAssignment_5_2_1 )
            // InternalProblem.g:3067:3: rule__PredicateDefinition__BodiesAssignment_5_2_1
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
    // InternalProblem.g:3076:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3080:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalProblem.g:3081:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalProblem.g:3088:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__ParameterTypeAssignment_0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3092:1: ( ( ( rule__Parameter__ParameterTypeAssignment_0 )? ) )
            // InternalProblem.g:3093:1: ( ( rule__Parameter__ParameterTypeAssignment_0 )? )
            {
            // InternalProblem.g:3093:1: ( ( rule__Parameter__ParameterTypeAssignment_0 )? )
            // InternalProblem.g:3094:2: ( rule__Parameter__ParameterTypeAssignment_0 )?
            {
             before(grammarAccess.getParameterAccess().getParameterTypeAssignment_0()); 
            // InternalProblem.g:3095:2: ( rule__Parameter__ParameterTypeAssignment_0 )?
            int alt40=2;
            switch ( input.LA(1) ) {
                case RULE_QUOTED_ID:
                    {
                    alt40=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA40_2 = input.LA(2);

                    if ( (LA40_2==RULE_ID||(LA40_2>=20 && LA40_2<=21)||LA40_2==40) ) {
                        alt40=1;
                    }
                    }
                    break;
                case 20:
                    {
                    int LA40_3 = input.LA(2);

                    if ( (LA40_3==RULE_ID||(LA40_3>=20 && LA40_3<=21)||LA40_3==40) ) {
                        alt40=1;
                    }
                    }
                    break;
                case 21:
                    {
                    int LA40_4 = input.LA(2);

                    if ( (LA40_4==RULE_ID||(LA40_4>=20 && LA40_4<=21)||LA40_4==40) ) {
                        alt40=1;
                    }
                    }
                    break;
            }

            switch (alt40) {
                case 1 :
                    // InternalProblem.g:3095:3: rule__Parameter__ParameterTypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__ParameterTypeAssignment_0();

                    state._fsp--;


                    }
                    break;

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
    // InternalProblem.g:3103:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3107:1: ( rule__Parameter__Group__1__Impl )
            // InternalProblem.g:3108:2: rule__Parameter__Group__1__Impl
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
    // InternalProblem.g:3114:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3118:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalProblem.g:3119:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalProblem.g:3119:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalProblem.g:3120:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalProblem.g:3121:2: ( rule__Parameter__NameAssignment_1 )
            // InternalProblem.g:3121:3: rule__Parameter__NameAssignment_1
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
    // InternalProblem.g:3130:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3134:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // InternalProblem.g:3135:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalProblem.g:3142:1: rule__Conjunction__Group__0__Impl : ( ( rule__Conjunction__LiteralsAssignment_0 ) ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3146:1: ( ( ( rule__Conjunction__LiteralsAssignment_0 ) ) )
            // InternalProblem.g:3147:1: ( ( rule__Conjunction__LiteralsAssignment_0 ) )
            {
            // InternalProblem.g:3147:1: ( ( rule__Conjunction__LiteralsAssignment_0 ) )
            // InternalProblem.g:3148:2: ( rule__Conjunction__LiteralsAssignment_0 )
            {
             before(grammarAccess.getConjunctionAccess().getLiteralsAssignment_0()); 
            // InternalProblem.g:3149:2: ( rule__Conjunction__LiteralsAssignment_0 )
            // InternalProblem.g:3149:3: rule__Conjunction__LiteralsAssignment_0
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
    // InternalProblem.g:3157:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3161:1: ( rule__Conjunction__Group__1__Impl )
            // InternalProblem.g:3162:2: rule__Conjunction__Group__1__Impl
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
    // InternalProblem.g:3168:1: rule__Conjunction__Group__1__Impl : ( ( rule__Conjunction__Group_1__0 )* ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3172:1: ( ( ( rule__Conjunction__Group_1__0 )* ) )
            // InternalProblem.g:3173:1: ( ( rule__Conjunction__Group_1__0 )* )
            {
            // InternalProblem.g:3173:1: ( ( rule__Conjunction__Group_1__0 )* )
            // InternalProblem.g:3174:2: ( rule__Conjunction__Group_1__0 )*
            {
             before(grammarAccess.getConjunctionAccess().getGroup_1()); 
            // InternalProblem.g:3175:2: ( rule__Conjunction__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==14) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalProblem.g:3175:3: rule__Conjunction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Conjunction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalProblem.g:3184:1: rule__Conjunction__Group_1__0 : rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 ;
    public final void rule__Conjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3188:1: ( rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 )
            // InternalProblem.g:3189:2: rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalProblem.g:3196:1: rule__Conjunction__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Conjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3200:1: ( ( ',' ) )
            // InternalProblem.g:3201:1: ( ',' )
            {
            // InternalProblem.g:3201:1: ( ',' )
            // InternalProblem.g:3202:2: ','
            {
             before(grammarAccess.getConjunctionAccess().getCommaKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalProblem.g:3211:1: rule__Conjunction__Group_1__1 : rule__Conjunction__Group_1__1__Impl ;
    public final void rule__Conjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3215:1: ( rule__Conjunction__Group_1__1__Impl )
            // InternalProblem.g:3216:2: rule__Conjunction__Group_1__1__Impl
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
    // InternalProblem.g:3222:1: rule__Conjunction__Group_1__1__Impl : ( ( rule__Conjunction__LiteralsAssignment_1_1 ) ) ;
    public final void rule__Conjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3226:1: ( ( ( rule__Conjunction__LiteralsAssignment_1_1 ) ) )
            // InternalProblem.g:3227:1: ( ( rule__Conjunction__LiteralsAssignment_1_1 ) )
            {
            // InternalProblem.g:3227:1: ( ( rule__Conjunction__LiteralsAssignment_1_1 ) )
            // InternalProblem.g:3228:2: ( rule__Conjunction__LiteralsAssignment_1_1 )
            {
             before(grammarAccess.getConjunctionAccess().getLiteralsAssignment_1_1()); 
            // InternalProblem.g:3229:2: ( rule__Conjunction__LiteralsAssignment_1_1 )
            // InternalProblem.g:3229:3: rule__Conjunction__LiteralsAssignment_1_1
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
    // InternalProblem.g:3238:1: rule__NegativeLiteral__Group__0 : rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1 ;
    public final void rule__NegativeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3242:1: ( rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1 )
            // InternalProblem.g:3243:2: rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1
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
    // InternalProblem.g:3250:1: rule__NegativeLiteral__Group__0__Impl : ( '!' ) ;
    public final void rule__NegativeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3254:1: ( ( '!' ) )
            // InternalProblem.g:3255:1: ( '!' )
            {
            // InternalProblem.g:3255:1: ( '!' )
            // InternalProblem.g:3256:2: '!'
            {
             before(grammarAccess.getNegativeLiteralAccess().getExclamationMarkKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalProblem.g:3265:1: rule__NegativeLiteral__Group__1 : rule__NegativeLiteral__Group__1__Impl ;
    public final void rule__NegativeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3269:1: ( rule__NegativeLiteral__Group__1__Impl )
            // InternalProblem.g:3270:2: rule__NegativeLiteral__Group__1__Impl
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
    // InternalProblem.g:3276:1: rule__NegativeLiteral__Group__1__Impl : ( ( rule__NegativeLiteral__AtomAssignment_1 ) ) ;
    public final void rule__NegativeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3280:1: ( ( ( rule__NegativeLiteral__AtomAssignment_1 ) ) )
            // InternalProblem.g:3281:1: ( ( rule__NegativeLiteral__AtomAssignment_1 ) )
            {
            // InternalProblem.g:3281:1: ( ( rule__NegativeLiteral__AtomAssignment_1 ) )
            // InternalProblem.g:3282:2: ( rule__NegativeLiteral__AtomAssignment_1 )
            {
             before(grammarAccess.getNegativeLiteralAccess().getAtomAssignment_1()); 
            // InternalProblem.g:3283:2: ( rule__NegativeLiteral__AtomAssignment_1 )
            // InternalProblem.g:3283:3: rule__NegativeLiteral__AtomAssignment_1
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
    // InternalProblem.g:3292:1: rule__Atom__Group__0 : rule__Atom__Group__0__Impl rule__Atom__Group__1 ;
    public final void rule__Atom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3296:1: ( rule__Atom__Group__0__Impl rule__Atom__Group__1 )
            // InternalProblem.g:3297:2: rule__Atom__Group__0__Impl rule__Atom__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalProblem.g:3304:1: rule__Atom__Group__0__Impl : ( ( rule__Atom__RelationAssignment_0 ) ) ;
    public final void rule__Atom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3308:1: ( ( ( rule__Atom__RelationAssignment_0 ) ) )
            // InternalProblem.g:3309:1: ( ( rule__Atom__RelationAssignment_0 ) )
            {
            // InternalProblem.g:3309:1: ( ( rule__Atom__RelationAssignment_0 ) )
            // InternalProblem.g:3310:2: ( rule__Atom__RelationAssignment_0 )
            {
             before(grammarAccess.getAtomAccess().getRelationAssignment_0()); 
            // InternalProblem.g:3311:2: ( rule__Atom__RelationAssignment_0 )
            // InternalProblem.g:3311:3: rule__Atom__RelationAssignment_0
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
    // InternalProblem.g:3319:1: rule__Atom__Group__1 : rule__Atom__Group__1__Impl rule__Atom__Group__2 ;
    public final void rule__Atom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3323:1: ( rule__Atom__Group__1__Impl rule__Atom__Group__2 )
            // InternalProblem.g:3324:2: rule__Atom__Group__1__Impl rule__Atom__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalProblem.g:3331:1: rule__Atom__Group__1__Impl : ( ( rule__Atom__TransitiveClosureAssignment_1 )? ) ;
    public final void rule__Atom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3335:1: ( ( ( rule__Atom__TransitiveClosureAssignment_1 )? ) )
            // InternalProblem.g:3336:1: ( ( rule__Atom__TransitiveClosureAssignment_1 )? )
            {
            // InternalProblem.g:3336:1: ( ( rule__Atom__TransitiveClosureAssignment_1 )? )
            // InternalProblem.g:3337:2: ( rule__Atom__TransitiveClosureAssignment_1 )?
            {
             before(grammarAccess.getAtomAccess().getTransitiveClosureAssignment_1()); 
            // InternalProblem.g:3338:2: ( rule__Atom__TransitiveClosureAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==45) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalProblem.g:3338:3: rule__Atom__TransitiveClosureAssignment_1
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
    // InternalProblem.g:3346:1: rule__Atom__Group__2 : rule__Atom__Group__2__Impl rule__Atom__Group__3 ;
    public final void rule__Atom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3350:1: ( rule__Atom__Group__2__Impl rule__Atom__Group__3 )
            // InternalProblem.g:3351:2: rule__Atom__Group__2__Impl rule__Atom__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalProblem.g:3358:1: rule__Atom__Group__2__Impl : ( '(' ) ;
    public final void rule__Atom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3362:1: ( ( '(' ) )
            // InternalProblem.g:3363:1: ( '(' )
            {
            // InternalProblem.g:3363:1: ( '(' )
            // InternalProblem.g:3364:2: '('
            {
             before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalProblem.g:3373:1: rule__Atom__Group__3 : rule__Atom__Group__3__Impl rule__Atom__Group__4 ;
    public final void rule__Atom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3377:1: ( rule__Atom__Group__3__Impl rule__Atom__Group__4 )
            // InternalProblem.g:3378:2: rule__Atom__Group__3__Impl rule__Atom__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalProblem.g:3385:1: rule__Atom__Group__3__Impl : ( ( rule__Atom__Group_3__0 )? ) ;
    public final void rule__Atom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3389:1: ( ( ( rule__Atom__Group_3__0 )? ) )
            // InternalProblem.g:3390:1: ( ( rule__Atom__Group_3__0 )? )
            {
            // InternalProblem.g:3390:1: ( ( rule__Atom__Group_3__0 )? )
            // InternalProblem.g:3391:2: ( rule__Atom__Group_3__0 )?
            {
             before(grammarAccess.getAtomAccess().getGroup_3()); 
            // InternalProblem.g:3392:2: ( rule__Atom__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_INT && LA43_0<=RULE_STRING)||(LA43_0>=20 && LA43_0<=21)||LA43_0==41) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalProblem.g:3392:3: rule__Atom__Group_3__0
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
    // InternalProblem.g:3400:1: rule__Atom__Group__4 : rule__Atom__Group__4__Impl ;
    public final void rule__Atom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3404:1: ( rule__Atom__Group__4__Impl )
            // InternalProblem.g:3405:2: rule__Atom__Group__4__Impl
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
    // InternalProblem.g:3411:1: rule__Atom__Group__4__Impl : ( ')' ) ;
    public final void rule__Atom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3415:1: ( ( ')' ) )
            // InternalProblem.g:3416:1: ( ')' )
            {
            // InternalProblem.g:3416:1: ( ')' )
            // InternalProblem.g:3417:2: ')'
            {
             before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalProblem.g:3427:1: rule__Atom__Group_3__0 : rule__Atom__Group_3__0__Impl rule__Atom__Group_3__1 ;
    public final void rule__Atom__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3431:1: ( rule__Atom__Group_3__0__Impl rule__Atom__Group_3__1 )
            // InternalProblem.g:3432:2: rule__Atom__Group_3__0__Impl rule__Atom__Group_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalProblem.g:3439:1: rule__Atom__Group_3__0__Impl : ( ( rule__Atom__ArgumentsAssignment_3_0 ) ) ;
    public final void rule__Atom__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3443:1: ( ( ( rule__Atom__ArgumentsAssignment_3_0 ) ) )
            // InternalProblem.g:3444:1: ( ( rule__Atom__ArgumentsAssignment_3_0 ) )
            {
            // InternalProblem.g:3444:1: ( ( rule__Atom__ArgumentsAssignment_3_0 ) )
            // InternalProblem.g:3445:2: ( rule__Atom__ArgumentsAssignment_3_0 )
            {
             before(grammarAccess.getAtomAccess().getArgumentsAssignment_3_0()); 
            // InternalProblem.g:3446:2: ( rule__Atom__ArgumentsAssignment_3_0 )
            // InternalProblem.g:3446:3: rule__Atom__ArgumentsAssignment_3_0
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
    // InternalProblem.g:3454:1: rule__Atom__Group_3__1 : rule__Atom__Group_3__1__Impl ;
    public final void rule__Atom__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3458:1: ( rule__Atom__Group_3__1__Impl )
            // InternalProblem.g:3459:2: rule__Atom__Group_3__1__Impl
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
    // InternalProblem.g:3465:1: rule__Atom__Group_3__1__Impl : ( ( rule__Atom__Group_3_1__0 )* ) ;
    public final void rule__Atom__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3469:1: ( ( ( rule__Atom__Group_3_1__0 )* ) )
            // InternalProblem.g:3470:1: ( ( rule__Atom__Group_3_1__0 )* )
            {
            // InternalProblem.g:3470:1: ( ( rule__Atom__Group_3_1__0 )* )
            // InternalProblem.g:3471:2: ( rule__Atom__Group_3_1__0 )*
            {
             before(grammarAccess.getAtomAccess().getGroup_3_1()); 
            // InternalProblem.g:3472:2: ( rule__Atom__Group_3_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==14) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalProblem.g:3472:3: rule__Atom__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Atom__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalProblem.g:3481:1: rule__Atom__Group_3_1__0 : rule__Atom__Group_3_1__0__Impl rule__Atom__Group_3_1__1 ;
    public final void rule__Atom__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3485:1: ( rule__Atom__Group_3_1__0__Impl rule__Atom__Group_3_1__1 )
            // InternalProblem.g:3486:2: rule__Atom__Group_3_1__0__Impl rule__Atom__Group_3_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalProblem.g:3493:1: rule__Atom__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Atom__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3497:1: ( ( ',' ) )
            // InternalProblem.g:3498:1: ( ',' )
            {
            // InternalProblem.g:3498:1: ( ',' )
            // InternalProblem.g:3499:2: ','
            {
             before(grammarAccess.getAtomAccess().getCommaKeyword_3_1_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalProblem.g:3508:1: rule__Atom__Group_3_1__1 : rule__Atom__Group_3_1__1__Impl ;
    public final void rule__Atom__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3512:1: ( rule__Atom__Group_3_1__1__Impl )
            // InternalProblem.g:3513:2: rule__Atom__Group_3_1__1__Impl
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
    // InternalProblem.g:3519:1: rule__Atom__Group_3_1__1__Impl : ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) ) ;
    public final void rule__Atom__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3523:1: ( ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) ) )
            // InternalProblem.g:3524:1: ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) )
            {
            // InternalProblem.g:3524:1: ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) )
            // InternalProblem.g:3525:2: ( rule__Atom__ArgumentsAssignment_3_1_1 )
            {
             before(grammarAccess.getAtomAccess().getArgumentsAssignment_3_1_1()); 
            // InternalProblem.g:3526:2: ( rule__Atom__ArgumentsAssignment_3_1_1 )
            // InternalProblem.g:3526:3: rule__Atom__ArgumentsAssignment_3_1_1
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
    // InternalProblem.g:3535:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3539:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // InternalProblem.g:3540:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
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
    // InternalProblem.g:3547:1: rule__Assertion__Group__0__Impl : ( ( rule__Assertion__Alternatives_0 ) ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3551:1: ( ( ( rule__Assertion__Alternatives_0 ) ) )
            // InternalProblem.g:3552:1: ( ( rule__Assertion__Alternatives_0 ) )
            {
            // InternalProblem.g:3552:1: ( ( rule__Assertion__Alternatives_0 ) )
            // InternalProblem.g:3553:2: ( rule__Assertion__Alternatives_0 )
            {
             before(grammarAccess.getAssertionAccess().getAlternatives_0()); 
            // InternalProblem.g:3554:2: ( rule__Assertion__Alternatives_0 )
            // InternalProblem.g:3554:3: rule__Assertion__Alternatives_0
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
    // InternalProblem.g:3562:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3566:1: ( rule__Assertion__Group__1__Impl )
            // InternalProblem.g:3567:2: rule__Assertion__Group__1__Impl
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
    // InternalProblem.g:3573:1: rule__Assertion__Group__1__Impl : ( '.' ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3577:1: ( ( '.' ) )
            // InternalProblem.g:3578:1: ( '.' )
            {
            // InternalProblem.g:3578:1: ( '.' )
            // InternalProblem.g:3579:2: '.'
            {
             before(grammarAccess.getAssertionAccess().getFullStopKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalProblem.g:3589:1: rule__Assertion__Group_0_0__0 : rule__Assertion__Group_0_0__0__Impl rule__Assertion__Group_0_0__1 ;
    public final void rule__Assertion__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3593:1: ( rule__Assertion__Group_0_0__0__Impl rule__Assertion__Group_0_0__1 )
            // InternalProblem.g:3594:2: rule__Assertion__Group_0_0__0__Impl rule__Assertion__Group_0_0__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalProblem.g:3601:1: rule__Assertion__Group_0_0__0__Impl : ( ( rule__Assertion__RelationAssignment_0_0_0 ) ) ;
    public final void rule__Assertion__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3605:1: ( ( ( rule__Assertion__RelationAssignment_0_0_0 ) ) )
            // InternalProblem.g:3606:1: ( ( rule__Assertion__RelationAssignment_0_0_0 ) )
            {
            // InternalProblem.g:3606:1: ( ( rule__Assertion__RelationAssignment_0_0_0 ) )
            // InternalProblem.g:3607:2: ( rule__Assertion__RelationAssignment_0_0_0 )
            {
             before(grammarAccess.getAssertionAccess().getRelationAssignment_0_0_0()); 
            // InternalProblem.g:3608:2: ( rule__Assertion__RelationAssignment_0_0_0 )
            // InternalProblem.g:3608:3: rule__Assertion__RelationAssignment_0_0_0
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
    // InternalProblem.g:3616:1: rule__Assertion__Group_0_0__1 : rule__Assertion__Group_0_0__1__Impl rule__Assertion__Group_0_0__2 ;
    public final void rule__Assertion__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3620:1: ( rule__Assertion__Group_0_0__1__Impl rule__Assertion__Group_0_0__2 )
            // InternalProblem.g:3621:2: rule__Assertion__Group_0_0__1__Impl rule__Assertion__Group_0_0__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalProblem.g:3628:1: rule__Assertion__Group_0_0__1__Impl : ( '(' ) ;
    public final void rule__Assertion__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3632:1: ( ( '(' ) )
            // InternalProblem.g:3633:1: ( '(' )
            {
            // InternalProblem.g:3633:1: ( '(' )
            // InternalProblem.g:3634:2: '('
            {
             before(grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_0_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalProblem.g:3643:1: rule__Assertion__Group_0_0__2 : rule__Assertion__Group_0_0__2__Impl rule__Assertion__Group_0_0__3 ;
    public final void rule__Assertion__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3647:1: ( rule__Assertion__Group_0_0__2__Impl rule__Assertion__Group_0_0__3 )
            // InternalProblem.g:3648:2: rule__Assertion__Group_0_0__2__Impl rule__Assertion__Group_0_0__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalProblem.g:3655:1: rule__Assertion__Group_0_0__2__Impl : ( ( rule__Assertion__Group_0_0_2__0 )? ) ;
    public final void rule__Assertion__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3659:1: ( ( ( rule__Assertion__Group_0_0_2__0 )? ) )
            // InternalProblem.g:3660:1: ( ( rule__Assertion__Group_0_0_2__0 )? )
            {
            // InternalProblem.g:3660:1: ( ( rule__Assertion__Group_0_0_2__0 )? )
            // InternalProblem.g:3661:2: ( rule__Assertion__Group_0_0_2__0 )?
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_0_2()); 
            // InternalProblem.g:3662:2: ( rule__Assertion__Group_0_0_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_INT && LA45_0<=RULE_STRING)||(LA45_0>=20 && LA45_0<=21)||LA45_0==41) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalProblem.g:3662:3: rule__Assertion__Group_0_0_2__0
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
    // InternalProblem.g:3670:1: rule__Assertion__Group_0_0__3 : rule__Assertion__Group_0_0__3__Impl rule__Assertion__Group_0_0__4 ;
    public final void rule__Assertion__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3674:1: ( rule__Assertion__Group_0_0__3__Impl rule__Assertion__Group_0_0__4 )
            // InternalProblem.g:3675:2: rule__Assertion__Group_0_0__3__Impl rule__Assertion__Group_0_0__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalProblem.g:3682:1: rule__Assertion__Group_0_0__3__Impl : ( ')' ) ;
    public final void rule__Assertion__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3686:1: ( ( ')' ) )
            // InternalProblem.g:3687:1: ( ')' )
            {
            // InternalProblem.g:3687:1: ( ')' )
            // InternalProblem.g:3688:2: ')'
            {
             before(grammarAccess.getAssertionAccess().getRightParenthesisKeyword_0_0_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalProblem.g:3697:1: rule__Assertion__Group_0_0__4 : rule__Assertion__Group_0_0__4__Impl rule__Assertion__Group_0_0__5 ;
    public final void rule__Assertion__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3701:1: ( rule__Assertion__Group_0_0__4__Impl rule__Assertion__Group_0_0__5 )
            // InternalProblem.g:3702:2: rule__Assertion__Group_0_0__4__Impl rule__Assertion__Group_0_0__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalProblem.g:3709:1: rule__Assertion__Group_0_0__4__Impl : ( ':' ) ;
    public final void rule__Assertion__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3713:1: ( ( ':' ) )
            // InternalProblem.g:3714:1: ( ':' )
            {
            // InternalProblem.g:3714:1: ( ':' )
            // InternalProblem.g:3715:2: ':'
            {
             before(grammarAccess.getAssertionAccess().getColonKeyword_0_0_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalProblem.g:3724:1: rule__Assertion__Group_0_0__5 : rule__Assertion__Group_0_0__5__Impl ;
    public final void rule__Assertion__Group_0_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3728:1: ( rule__Assertion__Group_0_0__5__Impl )
            // InternalProblem.g:3729:2: rule__Assertion__Group_0_0__5__Impl
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
    // InternalProblem.g:3735:1: rule__Assertion__Group_0_0__5__Impl : ( ( rule__Assertion__ValueAssignment_0_0_5 ) ) ;
    public final void rule__Assertion__Group_0_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3739:1: ( ( ( rule__Assertion__ValueAssignment_0_0_5 ) ) )
            // InternalProblem.g:3740:1: ( ( rule__Assertion__ValueAssignment_0_0_5 ) )
            {
            // InternalProblem.g:3740:1: ( ( rule__Assertion__ValueAssignment_0_0_5 ) )
            // InternalProblem.g:3741:2: ( rule__Assertion__ValueAssignment_0_0_5 )
            {
             before(grammarAccess.getAssertionAccess().getValueAssignment_0_0_5()); 
            // InternalProblem.g:3742:2: ( rule__Assertion__ValueAssignment_0_0_5 )
            // InternalProblem.g:3742:3: rule__Assertion__ValueAssignment_0_0_5
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
    // InternalProblem.g:3751:1: rule__Assertion__Group_0_0_2__0 : rule__Assertion__Group_0_0_2__0__Impl rule__Assertion__Group_0_0_2__1 ;
    public final void rule__Assertion__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3755:1: ( rule__Assertion__Group_0_0_2__0__Impl rule__Assertion__Group_0_0_2__1 )
            // InternalProblem.g:3756:2: rule__Assertion__Group_0_0_2__0__Impl rule__Assertion__Group_0_0_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalProblem.g:3763:1: rule__Assertion__Group_0_0_2__0__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) ) ;
    public final void rule__Assertion__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3767:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) ) )
            // InternalProblem.g:3768:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) )
            {
            // InternalProblem.g:3768:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) )
            // InternalProblem.g:3769:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_0 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_0_2_0()); 
            // InternalProblem.g:3770:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_0 )
            // InternalProblem.g:3770:3: rule__Assertion__ArgumentsAssignment_0_0_2_0
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
    // InternalProblem.g:3778:1: rule__Assertion__Group_0_0_2__1 : rule__Assertion__Group_0_0_2__1__Impl ;
    public final void rule__Assertion__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3782:1: ( rule__Assertion__Group_0_0_2__1__Impl )
            // InternalProblem.g:3783:2: rule__Assertion__Group_0_0_2__1__Impl
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
    // InternalProblem.g:3789:1: rule__Assertion__Group_0_0_2__1__Impl : ( ( rule__Assertion__Group_0_0_2_1__0 )* ) ;
    public final void rule__Assertion__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3793:1: ( ( ( rule__Assertion__Group_0_0_2_1__0 )* ) )
            // InternalProblem.g:3794:1: ( ( rule__Assertion__Group_0_0_2_1__0 )* )
            {
            // InternalProblem.g:3794:1: ( ( rule__Assertion__Group_0_0_2_1__0 )* )
            // InternalProblem.g:3795:2: ( rule__Assertion__Group_0_0_2_1__0 )*
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_0_2_1()); 
            // InternalProblem.g:3796:2: ( rule__Assertion__Group_0_0_2_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==14) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalProblem.g:3796:3: rule__Assertion__Group_0_0_2_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Assertion__Group_0_0_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalProblem.g:3805:1: rule__Assertion__Group_0_0_2_1__0 : rule__Assertion__Group_0_0_2_1__0__Impl rule__Assertion__Group_0_0_2_1__1 ;
    public final void rule__Assertion__Group_0_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3809:1: ( rule__Assertion__Group_0_0_2_1__0__Impl rule__Assertion__Group_0_0_2_1__1 )
            // InternalProblem.g:3810:2: rule__Assertion__Group_0_0_2_1__0__Impl rule__Assertion__Group_0_0_2_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalProblem.g:3817:1: rule__Assertion__Group_0_0_2_1__0__Impl : ( ',' ) ;
    public final void rule__Assertion__Group_0_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3821:1: ( ( ',' ) )
            // InternalProblem.g:3822:1: ( ',' )
            {
            // InternalProblem.g:3822:1: ( ',' )
            // InternalProblem.g:3823:2: ','
            {
             before(grammarAccess.getAssertionAccess().getCommaKeyword_0_0_2_1_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalProblem.g:3832:1: rule__Assertion__Group_0_0_2_1__1 : rule__Assertion__Group_0_0_2_1__1__Impl ;
    public final void rule__Assertion__Group_0_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3836:1: ( rule__Assertion__Group_0_0_2_1__1__Impl )
            // InternalProblem.g:3837:2: rule__Assertion__Group_0_0_2_1__1__Impl
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
    // InternalProblem.g:3843:1: rule__Assertion__Group_0_0_2_1__1__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) ) ;
    public final void rule__Assertion__Group_0_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3847:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) ) )
            // InternalProblem.g:3848:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) )
            {
            // InternalProblem.g:3848:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) )
            // InternalProblem.g:3849:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_0_2_1_1()); 
            // InternalProblem.g:3850:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 )
            // InternalProblem.g:3850:3: rule__Assertion__ArgumentsAssignment_0_0_2_1_1
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
    // InternalProblem.g:3859:1: rule__Assertion__Group_0_1__0 : rule__Assertion__Group_0_1__0__Impl rule__Assertion__Group_0_1__1 ;
    public final void rule__Assertion__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3863:1: ( rule__Assertion__Group_0_1__0__Impl rule__Assertion__Group_0_1__1 )
            // InternalProblem.g:3864:2: rule__Assertion__Group_0_1__0__Impl rule__Assertion__Group_0_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalProblem.g:3871:1: rule__Assertion__Group_0_1__0__Impl : ( ( rule__Assertion__ValueAssignment_0_1_0 )? ) ;
    public final void rule__Assertion__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3875:1: ( ( ( rule__Assertion__ValueAssignment_0_1_0 )? ) )
            // InternalProblem.g:3876:1: ( ( rule__Assertion__ValueAssignment_0_1_0 )? )
            {
            // InternalProblem.g:3876:1: ( ( rule__Assertion__ValueAssignment_0_1_0 )? )
            // InternalProblem.g:3877:2: ( rule__Assertion__ValueAssignment_0_1_0 )?
            {
             before(grammarAccess.getAssertionAccess().getValueAssignment_0_1_0()); 
            // InternalProblem.g:3878:2: ( rule__Assertion__ValueAssignment_0_1_0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=23 && LA47_0<=24)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalProblem.g:3878:3: rule__Assertion__ValueAssignment_0_1_0
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
    // InternalProblem.g:3886:1: rule__Assertion__Group_0_1__1 : rule__Assertion__Group_0_1__1__Impl rule__Assertion__Group_0_1__2 ;
    public final void rule__Assertion__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3890:1: ( rule__Assertion__Group_0_1__1__Impl rule__Assertion__Group_0_1__2 )
            // InternalProblem.g:3891:2: rule__Assertion__Group_0_1__1__Impl rule__Assertion__Group_0_1__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalProblem.g:3898:1: rule__Assertion__Group_0_1__1__Impl : ( ( rule__Assertion__RelationAssignment_0_1_1 ) ) ;
    public final void rule__Assertion__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3902:1: ( ( ( rule__Assertion__RelationAssignment_0_1_1 ) ) )
            // InternalProblem.g:3903:1: ( ( rule__Assertion__RelationAssignment_0_1_1 ) )
            {
            // InternalProblem.g:3903:1: ( ( rule__Assertion__RelationAssignment_0_1_1 ) )
            // InternalProblem.g:3904:2: ( rule__Assertion__RelationAssignment_0_1_1 )
            {
             before(grammarAccess.getAssertionAccess().getRelationAssignment_0_1_1()); 
            // InternalProblem.g:3905:2: ( rule__Assertion__RelationAssignment_0_1_1 )
            // InternalProblem.g:3905:3: rule__Assertion__RelationAssignment_0_1_1
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
    // InternalProblem.g:3913:1: rule__Assertion__Group_0_1__2 : rule__Assertion__Group_0_1__2__Impl rule__Assertion__Group_0_1__3 ;
    public final void rule__Assertion__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3917:1: ( rule__Assertion__Group_0_1__2__Impl rule__Assertion__Group_0_1__3 )
            // InternalProblem.g:3918:2: rule__Assertion__Group_0_1__2__Impl rule__Assertion__Group_0_1__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalProblem.g:3925:1: rule__Assertion__Group_0_1__2__Impl : ( '(' ) ;
    public final void rule__Assertion__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3929:1: ( ( '(' ) )
            // InternalProblem.g:3930:1: ( '(' )
            {
            // InternalProblem.g:3930:1: ( '(' )
            // InternalProblem.g:3931:2: '('
            {
             before(grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_1_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalProblem.g:3940:1: rule__Assertion__Group_0_1__3 : rule__Assertion__Group_0_1__3__Impl rule__Assertion__Group_0_1__4 ;
    public final void rule__Assertion__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3944:1: ( rule__Assertion__Group_0_1__3__Impl rule__Assertion__Group_0_1__4 )
            // InternalProblem.g:3945:2: rule__Assertion__Group_0_1__3__Impl rule__Assertion__Group_0_1__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalProblem.g:3952:1: rule__Assertion__Group_0_1__3__Impl : ( ( rule__Assertion__Group_0_1_3__0 )? ) ;
    public final void rule__Assertion__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3956:1: ( ( ( rule__Assertion__Group_0_1_3__0 )? ) )
            // InternalProblem.g:3957:1: ( ( rule__Assertion__Group_0_1_3__0 )? )
            {
            // InternalProblem.g:3957:1: ( ( rule__Assertion__Group_0_1_3__0 )? )
            // InternalProblem.g:3958:2: ( rule__Assertion__Group_0_1_3__0 )?
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_1_3()); 
            // InternalProblem.g:3959:2: ( rule__Assertion__Group_0_1_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_INT && LA48_0<=RULE_STRING)||(LA48_0>=20 && LA48_0<=21)||LA48_0==41) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalProblem.g:3959:3: rule__Assertion__Group_0_1_3__0
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
    // InternalProblem.g:3967:1: rule__Assertion__Group_0_1__4 : rule__Assertion__Group_0_1__4__Impl ;
    public final void rule__Assertion__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3971:1: ( rule__Assertion__Group_0_1__4__Impl )
            // InternalProblem.g:3972:2: rule__Assertion__Group_0_1__4__Impl
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
    // InternalProblem.g:3978:1: rule__Assertion__Group_0_1__4__Impl : ( ')' ) ;
    public final void rule__Assertion__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3982:1: ( ( ')' ) )
            // InternalProblem.g:3983:1: ( ')' )
            {
            // InternalProblem.g:3983:1: ( ')' )
            // InternalProblem.g:3984:2: ')'
            {
             before(grammarAccess.getAssertionAccess().getRightParenthesisKeyword_0_1_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalProblem.g:3994:1: rule__Assertion__Group_0_1_3__0 : rule__Assertion__Group_0_1_3__0__Impl rule__Assertion__Group_0_1_3__1 ;
    public final void rule__Assertion__Group_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3998:1: ( rule__Assertion__Group_0_1_3__0__Impl rule__Assertion__Group_0_1_3__1 )
            // InternalProblem.g:3999:2: rule__Assertion__Group_0_1_3__0__Impl rule__Assertion__Group_0_1_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalProblem.g:4006:1: rule__Assertion__Group_0_1_3__0__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) ) ;
    public final void rule__Assertion__Group_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4010:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) ) )
            // InternalProblem.g:4011:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) )
            {
            // InternalProblem.g:4011:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) )
            // InternalProblem.g:4012:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_0 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_1_3_0()); 
            // InternalProblem.g:4013:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_0 )
            // InternalProblem.g:4013:3: rule__Assertion__ArgumentsAssignment_0_1_3_0
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
    // InternalProblem.g:4021:1: rule__Assertion__Group_0_1_3__1 : rule__Assertion__Group_0_1_3__1__Impl ;
    public final void rule__Assertion__Group_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4025:1: ( rule__Assertion__Group_0_1_3__1__Impl )
            // InternalProblem.g:4026:2: rule__Assertion__Group_0_1_3__1__Impl
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
    // InternalProblem.g:4032:1: rule__Assertion__Group_0_1_3__1__Impl : ( ( rule__Assertion__Group_0_1_3_1__0 )* ) ;
    public final void rule__Assertion__Group_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4036:1: ( ( ( rule__Assertion__Group_0_1_3_1__0 )* ) )
            // InternalProblem.g:4037:1: ( ( rule__Assertion__Group_0_1_3_1__0 )* )
            {
            // InternalProblem.g:4037:1: ( ( rule__Assertion__Group_0_1_3_1__0 )* )
            // InternalProblem.g:4038:2: ( rule__Assertion__Group_0_1_3_1__0 )*
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_1_3_1()); 
            // InternalProblem.g:4039:2: ( rule__Assertion__Group_0_1_3_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==14) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalProblem.g:4039:3: rule__Assertion__Group_0_1_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Assertion__Group_0_1_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalProblem.g:4048:1: rule__Assertion__Group_0_1_3_1__0 : rule__Assertion__Group_0_1_3_1__0__Impl rule__Assertion__Group_0_1_3_1__1 ;
    public final void rule__Assertion__Group_0_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4052:1: ( rule__Assertion__Group_0_1_3_1__0__Impl rule__Assertion__Group_0_1_3_1__1 )
            // InternalProblem.g:4053:2: rule__Assertion__Group_0_1_3_1__0__Impl rule__Assertion__Group_0_1_3_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalProblem.g:4060:1: rule__Assertion__Group_0_1_3_1__0__Impl : ( ',' ) ;
    public final void rule__Assertion__Group_0_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4064:1: ( ( ',' ) )
            // InternalProblem.g:4065:1: ( ',' )
            {
            // InternalProblem.g:4065:1: ( ',' )
            // InternalProblem.g:4066:2: ','
            {
             before(grammarAccess.getAssertionAccess().getCommaKeyword_0_1_3_1_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalProblem.g:4075:1: rule__Assertion__Group_0_1_3_1__1 : rule__Assertion__Group_0_1_3_1__1__Impl ;
    public final void rule__Assertion__Group_0_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4079:1: ( rule__Assertion__Group_0_1_3_1__1__Impl )
            // InternalProblem.g:4080:2: rule__Assertion__Group_0_1_3_1__1__Impl
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
    // InternalProblem.g:4086:1: rule__Assertion__Group_0_1_3_1__1__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) ) ;
    public final void rule__Assertion__Group_0_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4090:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) ) )
            // InternalProblem.g:4091:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) )
            {
            // InternalProblem.g:4091:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) )
            // InternalProblem.g:4092:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_1_3_1_1()); 
            // InternalProblem.g:4093:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 )
            // InternalProblem.g:4093:3: rule__Assertion__ArgumentsAssignment_0_1_3_1_1
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


    // $ANTLR start "rule__NodeValueAssertion__Group__0"
    // InternalProblem.g:4102:1: rule__NodeValueAssertion__Group__0 : rule__NodeValueAssertion__Group__0__Impl rule__NodeValueAssertion__Group__1 ;
    public final void rule__NodeValueAssertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4106:1: ( rule__NodeValueAssertion__Group__0__Impl rule__NodeValueAssertion__Group__1 )
            // InternalProblem.g:4107:2: rule__NodeValueAssertion__Group__0__Impl rule__NodeValueAssertion__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__NodeValueAssertion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeValueAssertion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeValueAssertion__Group__0"


    // $ANTLR start "rule__NodeValueAssertion__Group__0__Impl"
    // InternalProblem.g:4114:1: rule__NodeValueAssertion__Group__0__Impl : ( ( rule__NodeValueAssertion__NodeAssignment_0 ) ) ;
    public final void rule__NodeValueAssertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4118:1: ( ( ( rule__NodeValueAssertion__NodeAssignment_0 ) ) )
            // InternalProblem.g:4119:1: ( ( rule__NodeValueAssertion__NodeAssignment_0 ) )
            {
            // InternalProblem.g:4119:1: ( ( rule__NodeValueAssertion__NodeAssignment_0 ) )
            // InternalProblem.g:4120:2: ( rule__NodeValueAssertion__NodeAssignment_0 )
            {
             before(grammarAccess.getNodeValueAssertionAccess().getNodeAssignment_0()); 
            // InternalProblem.g:4121:2: ( rule__NodeValueAssertion__NodeAssignment_0 )
            // InternalProblem.g:4121:3: rule__NodeValueAssertion__NodeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NodeValueAssertion__NodeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeValueAssertionAccess().getNodeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeValueAssertion__Group__0__Impl"


    // $ANTLR start "rule__NodeValueAssertion__Group__1"
    // InternalProblem.g:4129:1: rule__NodeValueAssertion__Group__1 : rule__NodeValueAssertion__Group__1__Impl rule__NodeValueAssertion__Group__2 ;
    public final void rule__NodeValueAssertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4133:1: ( rule__NodeValueAssertion__Group__1__Impl rule__NodeValueAssertion__Group__2 )
            // InternalProblem.g:4134:2: rule__NodeValueAssertion__Group__1__Impl rule__NodeValueAssertion__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__NodeValueAssertion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeValueAssertion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeValueAssertion__Group__1"


    // $ANTLR start "rule__NodeValueAssertion__Group__1__Impl"
    // InternalProblem.g:4141:1: rule__NodeValueAssertion__Group__1__Impl : ( ':' ) ;
    public final void rule__NodeValueAssertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4145:1: ( ( ':' ) )
            // InternalProblem.g:4146:1: ( ':' )
            {
            // InternalProblem.g:4146:1: ( ':' )
            // InternalProblem.g:4147:2: ':'
            {
             before(grammarAccess.getNodeValueAssertionAccess().getColonKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNodeValueAssertionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeValueAssertion__Group__1__Impl"


    // $ANTLR start "rule__NodeValueAssertion__Group__2"
    // InternalProblem.g:4156:1: rule__NodeValueAssertion__Group__2 : rule__NodeValueAssertion__Group__2__Impl rule__NodeValueAssertion__Group__3 ;
    public final void rule__NodeValueAssertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4160:1: ( rule__NodeValueAssertion__Group__2__Impl rule__NodeValueAssertion__Group__3 )
            // InternalProblem.g:4161:2: rule__NodeValueAssertion__Group__2__Impl rule__NodeValueAssertion__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__NodeValueAssertion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeValueAssertion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeValueAssertion__Group__2"


    // $ANTLR start "rule__NodeValueAssertion__Group__2__Impl"
    // InternalProblem.g:4168:1: rule__NodeValueAssertion__Group__2__Impl : ( ( rule__NodeValueAssertion__ValueAssignment_2 ) ) ;
    public final void rule__NodeValueAssertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4172:1: ( ( ( rule__NodeValueAssertion__ValueAssignment_2 ) ) )
            // InternalProblem.g:4173:1: ( ( rule__NodeValueAssertion__ValueAssignment_2 ) )
            {
            // InternalProblem.g:4173:1: ( ( rule__NodeValueAssertion__ValueAssignment_2 ) )
            // InternalProblem.g:4174:2: ( rule__NodeValueAssertion__ValueAssignment_2 )
            {
             before(grammarAccess.getNodeValueAssertionAccess().getValueAssignment_2()); 
            // InternalProblem.g:4175:2: ( rule__NodeValueAssertion__ValueAssignment_2 )
            // InternalProblem.g:4175:3: rule__NodeValueAssertion__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NodeValueAssertion__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeValueAssertionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeValueAssertion__Group__2__Impl"


    // $ANTLR start "rule__NodeValueAssertion__Group__3"
    // InternalProblem.g:4183:1: rule__NodeValueAssertion__Group__3 : rule__NodeValueAssertion__Group__3__Impl ;
    public final void rule__NodeValueAssertion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4187:1: ( rule__NodeValueAssertion__Group__3__Impl )
            // InternalProblem.g:4188:2: rule__NodeValueAssertion__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeValueAssertion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeValueAssertion__Group__3"


    // $ANTLR start "rule__NodeValueAssertion__Group__3__Impl"
    // InternalProblem.g:4194:1: rule__NodeValueAssertion__Group__3__Impl : ( '.' ) ;
    public final void rule__NodeValueAssertion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4198:1: ( ( '.' ) )
            // InternalProblem.g:4199:1: ( '.' )
            {
            // InternalProblem.g:4199:1: ( '.' )
            // InternalProblem.g:4200:2: '.'
            {
             before(grammarAccess.getNodeValueAssertionAccess().getFullStopKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNodeValueAssertionAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeValueAssertion__Group__3__Impl"


    // $ANTLR start "rule__ScopeDeclaration__Group__0"
    // InternalProblem.g:4210:1: rule__ScopeDeclaration__Group__0 : rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1 ;
    public final void rule__ScopeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4214:1: ( rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1 )
            // InternalProblem.g:4215:2: rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalProblem.g:4222:1: rule__ScopeDeclaration__Group__0__Impl : ( 'scope' ) ;
    public final void rule__ScopeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4226:1: ( ( 'scope' ) )
            // InternalProblem.g:4227:1: ( 'scope' )
            {
            // InternalProblem.g:4227:1: ( 'scope' )
            // InternalProblem.g:4228:2: 'scope'
            {
             before(grammarAccess.getScopeDeclarationAccess().getScopeKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalProblem.g:4237:1: rule__ScopeDeclaration__Group__1 : rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2 ;
    public final void rule__ScopeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4241:1: ( rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2 )
            // InternalProblem.g:4242:2: rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalProblem.g:4249:1: rule__ScopeDeclaration__Group__1__Impl : ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) ) ;
    public final void rule__ScopeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4253:1: ( ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) ) )
            // InternalProblem.g:4254:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) )
            {
            // InternalProblem.g:4254:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) )
            // InternalProblem.g:4255:2: ( rule__ScopeDeclaration__TypeScopesAssignment_1 )
            {
             before(grammarAccess.getScopeDeclarationAccess().getTypeScopesAssignment_1()); 
            // InternalProblem.g:4256:2: ( rule__ScopeDeclaration__TypeScopesAssignment_1 )
            // InternalProblem.g:4256:3: rule__ScopeDeclaration__TypeScopesAssignment_1
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
    // InternalProblem.g:4264:1: rule__ScopeDeclaration__Group__2 : rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3 ;
    public final void rule__ScopeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4268:1: ( rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3 )
            // InternalProblem.g:4269:2: rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalProblem.g:4276:1: rule__ScopeDeclaration__Group__2__Impl : ( ( rule__ScopeDeclaration__Group_2__0 )* ) ;
    public final void rule__ScopeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4280:1: ( ( ( rule__ScopeDeclaration__Group_2__0 )* ) )
            // InternalProblem.g:4281:1: ( ( rule__ScopeDeclaration__Group_2__0 )* )
            {
            // InternalProblem.g:4281:1: ( ( rule__ScopeDeclaration__Group_2__0 )* )
            // InternalProblem.g:4282:2: ( rule__ScopeDeclaration__Group_2__0 )*
            {
             before(grammarAccess.getScopeDeclarationAccess().getGroup_2()); 
            // InternalProblem.g:4283:2: ( rule__ScopeDeclaration__Group_2__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==14) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalProblem.g:4283:3: rule__ScopeDeclaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ScopeDeclaration__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalProblem.g:4291:1: rule__ScopeDeclaration__Group__3 : rule__ScopeDeclaration__Group__3__Impl ;
    public final void rule__ScopeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4295:1: ( rule__ScopeDeclaration__Group__3__Impl )
            // InternalProblem.g:4296:2: rule__ScopeDeclaration__Group__3__Impl
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
    // InternalProblem.g:4302:1: rule__ScopeDeclaration__Group__3__Impl : ( '.' ) ;
    public final void rule__ScopeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4306:1: ( ( '.' ) )
            // InternalProblem.g:4307:1: ( '.' )
            {
            // InternalProblem.g:4307:1: ( '.' )
            // InternalProblem.g:4308:2: '.'
            {
             before(grammarAccess.getScopeDeclarationAccess().getFullStopKeyword_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalProblem.g:4318:1: rule__ScopeDeclaration__Group_2__0 : rule__ScopeDeclaration__Group_2__0__Impl rule__ScopeDeclaration__Group_2__1 ;
    public final void rule__ScopeDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4322:1: ( rule__ScopeDeclaration__Group_2__0__Impl rule__ScopeDeclaration__Group_2__1 )
            // InternalProblem.g:4323:2: rule__ScopeDeclaration__Group_2__0__Impl rule__ScopeDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalProblem.g:4330:1: rule__ScopeDeclaration__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ScopeDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4334:1: ( ( ',' ) )
            // InternalProblem.g:4335:1: ( ',' )
            {
            // InternalProblem.g:4335:1: ( ',' )
            // InternalProblem.g:4336:2: ','
            {
             before(grammarAccess.getScopeDeclarationAccess().getCommaKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalProblem.g:4345:1: rule__ScopeDeclaration__Group_2__1 : rule__ScopeDeclaration__Group_2__1__Impl ;
    public final void rule__ScopeDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4349:1: ( rule__ScopeDeclaration__Group_2__1__Impl )
            // InternalProblem.g:4350:2: rule__ScopeDeclaration__Group_2__1__Impl
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
    // InternalProblem.g:4356:1: rule__ScopeDeclaration__Group_2__1__Impl : ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) ) ;
    public final void rule__ScopeDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4360:1: ( ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) ) )
            // InternalProblem.g:4361:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) )
            {
            // InternalProblem.g:4361:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) )
            // InternalProblem.g:4362:2: ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 )
            {
             before(grammarAccess.getScopeDeclarationAccess().getTypeScopesAssignment_2_1()); 
            // InternalProblem.g:4363:2: ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 )
            // InternalProblem.g:4363:3: rule__ScopeDeclaration__TypeScopesAssignment_2_1
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
    // InternalProblem.g:4372:1: rule__TypeScope__Group__0 : rule__TypeScope__Group__0__Impl rule__TypeScope__Group__1 ;
    public final void rule__TypeScope__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4376:1: ( rule__TypeScope__Group__0__Impl rule__TypeScope__Group__1 )
            // InternalProblem.g:4377:2: rule__TypeScope__Group__0__Impl rule__TypeScope__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalProblem.g:4384:1: rule__TypeScope__Group__0__Impl : ( ( rule__TypeScope__TargetTypeAssignment_0 ) ) ;
    public final void rule__TypeScope__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4388:1: ( ( ( rule__TypeScope__TargetTypeAssignment_0 ) ) )
            // InternalProblem.g:4389:1: ( ( rule__TypeScope__TargetTypeAssignment_0 ) )
            {
            // InternalProblem.g:4389:1: ( ( rule__TypeScope__TargetTypeAssignment_0 ) )
            // InternalProblem.g:4390:2: ( rule__TypeScope__TargetTypeAssignment_0 )
            {
             before(grammarAccess.getTypeScopeAccess().getTargetTypeAssignment_0()); 
            // InternalProblem.g:4391:2: ( rule__TypeScope__TargetTypeAssignment_0 )
            // InternalProblem.g:4391:3: rule__TypeScope__TargetTypeAssignment_0
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
    // InternalProblem.g:4399:1: rule__TypeScope__Group__1 : rule__TypeScope__Group__1__Impl rule__TypeScope__Group__2 ;
    public final void rule__TypeScope__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4403:1: ( rule__TypeScope__Group__1__Impl rule__TypeScope__Group__2 )
            // InternalProblem.g:4404:2: rule__TypeScope__Group__1__Impl rule__TypeScope__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalProblem.g:4411:1: rule__TypeScope__Group__1__Impl : ( ( rule__TypeScope__Alternatives_1 ) ) ;
    public final void rule__TypeScope__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4415:1: ( ( ( rule__TypeScope__Alternatives_1 ) ) )
            // InternalProblem.g:4416:1: ( ( rule__TypeScope__Alternatives_1 ) )
            {
            // InternalProblem.g:4416:1: ( ( rule__TypeScope__Alternatives_1 ) )
            // InternalProblem.g:4417:2: ( rule__TypeScope__Alternatives_1 )
            {
             before(grammarAccess.getTypeScopeAccess().getAlternatives_1()); 
            // InternalProblem.g:4418:2: ( rule__TypeScope__Alternatives_1 )
            // InternalProblem.g:4418:3: rule__TypeScope__Alternatives_1
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
    // InternalProblem.g:4426:1: rule__TypeScope__Group__2 : rule__TypeScope__Group__2__Impl ;
    public final void rule__TypeScope__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4430:1: ( rule__TypeScope__Group__2__Impl )
            // InternalProblem.g:4431:2: rule__TypeScope__Group__2__Impl
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
    // InternalProblem.g:4437:1: rule__TypeScope__Group__2__Impl : ( ( rule__TypeScope__MultiplicityAssignment_2 ) ) ;
    public final void rule__TypeScope__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4441:1: ( ( ( rule__TypeScope__MultiplicityAssignment_2 ) ) )
            // InternalProblem.g:4442:1: ( ( rule__TypeScope__MultiplicityAssignment_2 ) )
            {
            // InternalProblem.g:4442:1: ( ( rule__TypeScope__MultiplicityAssignment_2 ) )
            // InternalProblem.g:4443:2: ( rule__TypeScope__MultiplicityAssignment_2 )
            {
             before(grammarAccess.getTypeScopeAccess().getMultiplicityAssignment_2()); 
            // InternalProblem.g:4444:2: ( rule__TypeScope__MultiplicityAssignment_2 )
            // InternalProblem.g:4444:3: rule__TypeScope__MultiplicityAssignment_2
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
    // InternalProblem.g:4453:1: rule__RangeMultiplicity__Group__0 : rule__RangeMultiplicity__Group__0__Impl rule__RangeMultiplicity__Group__1 ;
    public final void rule__RangeMultiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4457:1: ( rule__RangeMultiplicity__Group__0__Impl rule__RangeMultiplicity__Group__1 )
            // InternalProblem.g:4458:2: rule__RangeMultiplicity__Group__0__Impl rule__RangeMultiplicity__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalProblem.g:4465:1: rule__RangeMultiplicity__Group__0__Impl : ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) ) ;
    public final void rule__RangeMultiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4469:1: ( ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) ) )
            // InternalProblem.g:4470:1: ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) )
            {
            // InternalProblem.g:4470:1: ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) )
            // InternalProblem.g:4471:2: ( rule__RangeMultiplicity__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getRangeMultiplicityAccess().getLowerBoundAssignment_0()); 
            // InternalProblem.g:4472:2: ( rule__RangeMultiplicity__LowerBoundAssignment_0 )
            // InternalProblem.g:4472:3: rule__RangeMultiplicity__LowerBoundAssignment_0
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
    // InternalProblem.g:4480:1: rule__RangeMultiplicity__Group__1 : rule__RangeMultiplicity__Group__1__Impl rule__RangeMultiplicity__Group__2 ;
    public final void rule__RangeMultiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4484:1: ( rule__RangeMultiplicity__Group__1__Impl rule__RangeMultiplicity__Group__2 )
            // InternalProblem.g:4485:2: rule__RangeMultiplicity__Group__1__Impl rule__RangeMultiplicity__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalProblem.g:4492:1: rule__RangeMultiplicity__Group__1__Impl : ( '..' ) ;
    public final void rule__RangeMultiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4496:1: ( ( '..' ) )
            // InternalProblem.g:4497:1: ( '..' )
            {
            // InternalProblem.g:4497:1: ( '..' )
            // InternalProblem.g:4498:2: '..'
            {
             before(grammarAccess.getRangeMultiplicityAccess().getFullStopFullStopKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalProblem.g:4507:1: rule__RangeMultiplicity__Group__2 : rule__RangeMultiplicity__Group__2__Impl ;
    public final void rule__RangeMultiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4511:1: ( rule__RangeMultiplicity__Group__2__Impl )
            // InternalProblem.g:4512:2: rule__RangeMultiplicity__Group__2__Impl
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
    // InternalProblem.g:4518:1: rule__RangeMultiplicity__Group__2__Impl : ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) ) ;
    public final void rule__RangeMultiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4522:1: ( ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) ) )
            // InternalProblem.g:4523:1: ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) )
            {
            // InternalProblem.g:4523:1: ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) )
            // InternalProblem.g:4524:2: ( rule__RangeMultiplicity__UpperBoundAssignment_2 )
            {
             before(grammarAccess.getRangeMultiplicityAccess().getUpperBoundAssignment_2()); 
            // InternalProblem.g:4525:2: ( rule__RangeMultiplicity__UpperBoundAssignment_2 )
            // InternalProblem.g:4525:3: rule__RangeMultiplicity__UpperBoundAssignment_2
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
    // InternalProblem.g:4534:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4538:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalProblem.g:4539:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalProblem.g:4546:1: rule__QualifiedName__Group_1__0__Impl : ( ruleIdentifier ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4550:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:4551:1: ( ruleIdentifier )
            {
            // InternalProblem.g:4551:1: ( ruleIdentifier )
            // InternalProblem.g:4552:2: ruleIdentifier
            {
             before(grammarAccess.getQualifiedNameAccess().getIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getIdentifierParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProblem.g:4561:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4565:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalProblem.g:4566:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalProblem.g:4572:1: rule__QualifiedName__Group_1__1__Impl : ( ( rule__QualifiedName__Group_1_1__0 )* ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4576:1: ( ( ( rule__QualifiedName__Group_1_1__0 )* ) )
            // InternalProblem.g:4577:1: ( ( rule__QualifiedName__Group_1_1__0 )* )
            {
            // InternalProblem.g:4577:1: ( ( rule__QualifiedName__Group_1_1__0 )* )
            // InternalProblem.g:4578:2: ( rule__QualifiedName__Group_1_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1_1()); 
            // InternalProblem.g:4579:2: ( rule__QualifiedName__Group_1_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==40) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalProblem.g:4579:3: rule__QualifiedName__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__QualifiedName__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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


    // $ANTLR start "rule__QualifiedName__Group_1_1__0"
    // InternalProblem.g:4588:1: rule__QualifiedName__Group_1_1__0 : rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1 ;
    public final void rule__QualifiedName__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4592:1: ( rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1 )
            // InternalProblem.g:4593:2: rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1
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
    // InternalProblem.g:4600:1: rule__QualifiedName__Group_1_1__0__Impl : ( '::' ) ;
    public final void rule__QualifiedName__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4604:1: ( ( '::' ) )
            // InternalProblem.g:4605:1: ( '::' )
            {
            // InternalProblem.g:4605:1: ( '::' )
            // InternalProblem.g:4606:2: '::'
            {
             before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_1_0()); 

            }


            }

        }
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
    // InternalProblem.g:4615:1: rule__QualifiedName__Group_1_1__1 : rule__QualifiedName__Group_1_1__1__Impl ;
    public final void rule__QualifiedName__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4619:1: ( rule__QualifiedName__Group_1_1__1__Impl )
            // InternalProblem.g:4620:2: rule__QualifiedName__Group_1_1__1__Impl
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
    // InternalProblem.g:4626:1: rule__QualifiedName__Group_1_1__1__Impl : ( ruleIdentifier ) ;
    public final void rule__QualifiedName__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4630:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:4631:1: ( ruleIdentifier )
            {
            // InternalProblem.g:4631:1: ( ruleIdentifier )
            // InternalProblem.g:4632:2: ruleIdentifier
            {
             before(grammarAccess.getQualifiedNameAccess().getIdentifierParserRuleCall_1_1_1()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getIdentifierParserRuleCall_1_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Integer__Group__0"
    // InternalProblem.g:4642:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4646:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalProblem.g:4647:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Integer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Integer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0"


    // $ANTLR start "rule__Integer__Group__0__Impl"
    // InternalProblem.g:4654:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4658:1: ( ( ( '-' )? ) )
            // InternalProblem.g:4659:1: ( ( '-' )? )
            {
            // InternalProblem.g:4659:1: ( ( '-' )? )
            // InternalProblem.g:4660:2: ( '-' )?
            {
             before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            // InternalProblem.g:4661:2: ( '-' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==41) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalProblem.g:4661:3: '-'
                    {
                    match(input,41,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0__Impl"


    // $ANTLR start "rule__Integer__Group__1"
    // InternalProblem.g:4669:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4673:1: ( rule__Integer__Group__1__Impl )
            // InternalProblem.g:4674:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1"


    // $ANTLR start "rule__Integer__Group__1__Impl"
    // InternalProblem.g:4680:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4684:1: ( ( RULE_INT ) )
            // InternalProblem.g:4685:1: ( RULE_INT )
            {
            // InternalProblem.g:4685:1: ( RULE_INT )
            // InternalProblem.g:4686:2: RULE_INT
            {
             before(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1__Impl"


    // $ANTLR start "rule__Real__Group__0"
    // InternalProblem.g:4696:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4700:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // InternalProblem.g:4701:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Real__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__0"


    // $ANTLR start "rule__Real__Group__0__Impl"
    // InternalProblem.g:4708:1: rule__Real__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4712:1: ( ( ( '-' )? ) )
            // InternalProblem.g:4713:1: ( ( '-' )? )
            {
            // InternalProblem.g:4713:1: ( ( '-' )? )
            // InternalProblem.g:4714:2: ( '-' )?
            {
             before(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
            // InternalProblem.g:4715:2: ( '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==41) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalProblem.g:4715:3: '-'
                    {
                    match(input,41,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__0__Impl"


    // $ANTLR start "rule__Real__Group__1"
    // InternalProblem.g:4723:1: rule__Real__Group__1 : rule__Real__Group__1__Impl ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4727:1: ( rule__Real__Group__1__Impl )
            // InternalProblem.g:4728:2: rule__Real__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__1"


    // $ANTLR start "rule__Real__Group__1__Impl"
    // InternalProblem.g:4734:1: rule__Real__Group__1__Impl : ( ( rule__Real__Alternatives_1 ) ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4738:1: ( ( ( rule__Real__Alternatives_1 ) ) )
            // InternalProblem.g:4739:1: ( ( rule__Real__Alternatives_1 ) )
            {
            // InternalProblem.g:4739:1: ( ( rule__Real__Alternatives_1 ) )
            // InternalProblem.g:4740:2: ( rule__Real__Alternatives_1 )
            {
             before(grammarAccess.getRealAccess().getAlternatives_1()); 
            // InternalProblem.g:4741:2: ( rule__Real__Alternatives_1 )
            // InternalProblem.g:4741:3: rule__Real__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Real__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__1__Impl"


    // $ANTLR start "rule__Real__Group_1_1__0"
    // InternalProblem.g:4750:1: rule__Real__Group_1_1__0 : rule__Real__Group_1_1__0__Impl rule__Real__Group_1_1__1 ;
    public final void rule__Real__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4754:1: ( rule__Real__Group_1_1__0__Impl rule__Real__Group_1_1__1 )
            // InternalProblem.g:4755:2: rule__Real__Group_1_1__0__Impl rule__Real__Group_1_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Real__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_1_1__0"


    // $ANTLR start "rule__Real__Group_1_1__0__Impl"
    // InternalProblem.g:4762:1: rule__Real__Group_1_1__0__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4766:1: ( ( RULE_INT ) )
            // InternalProblem.g:4767:1: ( RULE_INT )
            {
            // InternalProblem.g:4767:1: ( RULE_INT )
            // InternalProblem.g:4768:2: RULE_INT
            {
             before(grammarAccess.getRealAccess().getINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_1_1__0__Impl"


    // $ANTLR start "rule__Real__Group_1_1__1"
    // InternalProblem.g:4777:1: rule__Real__Group_1_1__1 : rule__Real__Group_1_1__1__Impl rule__Real__Group_1_1__2 ;
    public final void rule__Real__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4781:1: ( rule__Real__Group_1_1__1__Impl rule__Real__Group_1_1__2 )
            // InternalProblem.g:4782:2: rule__Real__Group_1_1__1__Impl rule__Real__Group_1_1__2
            {
            pushFollow(FOLLOW_43);
            rule__Real__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_1_1__1"


    // $ANTLR start "rule__Real__Group_1_1__1__Impl"
    // InternalProblem.g:4789:1: rule__Real__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__Real__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4793:1: ( ( '.' ) )
            // InternalProblem.g:4794:1: ( '.' )
            {
            // InternalProblem.g:4794:1: ( '.' )
            // InternalProblem.g:4795:2: '.'
            {
             before(grammarAccess.getRealAccess().getFullStopKeyword_1_1_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getFullStopKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_1_1__1__Impl"


    // $ANTLR start "rule__Real__Group_1_1__2"
    // InternalProblem.g:4804:1: rule__Real__Group_1_1__2 : rule__Real__Group_1_1__2__Impl ;
    public final void rule__Real__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4808:1: ( rule__Real__Group_1_1__2__Impl )
            // InternalProblem.g:4809:2: rule__Real__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_1_1__2"


    // $ANTLR start "rule__Real__Group_1_1__2__Impl"
    // InternalProblem.g:4815:1: rule__Real__Group_1_1__2__Impl : ( ( rule__Real__Alternatives_1_1_2 ) ) ;
    public final void rule__Real__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4819:1: ( ( ( rule__Real__Alternatives_1_1_2 ) ) )
            // InternalProblem.g:4820:1: ( ( rule__Real__Alternatives_1_1_2 ) )
            {
            // InternalProblem.g:4820:1: ( ( rule__Real__Alternatives_1_1_2 ) )
            // InternalProblem.g:4821:2: ( rule__Real__Alternatives_1_1_2 )
            {
             before(grammarAccess.getRealAccess().getAlternatives_1_1_2()); 
            // InternalProblem.g:4822:2: ( rule__Real__Alternatives_1_1_2 )
            // InternalProblem.g:4822:3: rule__Real__Alternatives_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Real__Alternatives_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getAlternatives_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_1_1__2__Impl"


    // $ANTLR start "rule__Problem__NameAssignment_0_1"
    // InternalProblem.g:4831:1: rule__Problem__NameAssignment_0_1 : ( ruleIdentifier ) ;
    public final void rule__Problem__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4835:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:4836:2: ( ruleIdentifier )
            {
            // InternalProblem.g:4836:2: ( ruleIdentifier )
            // InternalProblem.g:4837:3: ruleIdentifier
            {
             before(grammarAccess.getProblemAccess().getNameIdentifierParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getProblemAccess().getNameIdentifierParserRuleCall_0_1_0()); 

            }


            }

        }
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
    // InternalProblem.g:4846:1: rule__Problem__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Problem__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4850:1: ( ( ruleStatement ) )
            // InternalProblem.g:4851:2: ( ruleStatement )
            {
            // InternalProblem.g:4851:2: ( ruleStatement )
            // InternalProblem.g:4852:3: ruleStatement
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
    // InternalProblem.g:4861:1: rule__ClassDeclaration__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ClassDeclaration__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4865:1: ( ( ( 'abstract' ) ) )
            // InternalProblem.g:4866:2: ( ( 'abstract' ) )
            {
            // InternalProblem.g:4866:2: ( ( 'abstract' ) )
            // InternalProblem.g:4867:3: ( 'abstract' )
            {
             before(grammarAccess.getClassDeclarationAccess().getAbstractAbstractKeyword_0_0()); 
            // InternalProblem.g:4868:3: ( 'abstract' )
            // InternalProblem.g:4869:4: 'abstract'
            {
             before(grammarAccess.getClassDeclarationAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalProblem.g:4880:1: rule__ClassDeclaration__NameAssignment_2 : ( ruleIdentifier ) ;
    public final void rule__ClassDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4884:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:4885:2: ( ruleIdentifier )
            {
            // InternalProblem.g:4885:2: ( ruleIdentifier )
            // InternalProblem.g:4886:3: ruleIdentifier
            {
             before(grammarAccess.getClassDeclarationAccess().getNameIdentifierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getNameIdentifierParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalProblem.g:4895:1: rule__ClassDeclaration__SuperTypesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassDeclaration__SuperTypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4899:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:4900:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:4900:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:4901:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesRelationCrossReference_3_1_0()); 
            // InternalProblem.g:4902:3: ( ruleQualifiedName )
            // InternalProblem.g:4903:4: ruleQualifiedName
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesRelationQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getSuperTypesRelationQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getClassDeclarationAccess().getSuperTypesRelationCrossReference_3_1_0()); 

            }


            }

        }
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
    // InternalProblem.g:4914:1: rule__ClassDeclaration__SuperTypesAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassDeclaration__SuperTypesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4918:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:4919:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:4919:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:4920:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesRelationCrossReference_3_2_1_0()); 
            // InternalProblem.g:4921:3: ( ruleQualifiedName )
            // InternalProblem.g:4922:4: ruleQualifiedName
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesRelationQualifiedNameParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getSuperTypesRelationQualifiedNameParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getClassDeclarationAccess().getSuperTypesRelationCrossReference_3_2_1_0()); 

            }


            }

        }
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
    // InternalProblem.g:4933:1: rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 : ( ruleReferenceDeclaration ) ;
    public final void rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4937:1: ( ( ruleReferenceDeclaration ) )
            // InternalProblem.g:4938:2: ( ruleReferenceDeclaration )
            {
            // InternalProblem.g:4938:2: ( ruleReferenceDeclaration )
            // InternalProblem.g:4939:3: ruleReferenceDeclaration
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


    // $ANTLR start "rule__EnumDeclaration__NameAssignment_1"
    // InternalProblem.g:4948:1: rule__EnumDeclaration__NameAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__EnumDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4952:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:4953:2: ( ruleIdentifier )
            {
            // InternalProblem.g:4953:2: ( ruleIdentifier )
            // InternalProblem.g:4954:3: ruleIdentifier
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getEnumDeclarationAccess().getNameIdentifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__NameAssignment_1"


    // $ANTLR start "rule__EnumDeclaration__LiteralsAssignment_2_0_1_0"
    // InternalProblem.g:4963:1: rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 : ( ruleEnumLiteral ) ;
    public final void rule__EnumDeclaration__LiteralsAssignment_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4967:1: ( ( ruleEnumLiteral ) )
            // InternalProblem.g:4968:2: ( ruleEnumLiteral )
            {
            // InternalProblem.g:4968:2: ( ruleEnumLiteral )
            // InternalProblem.g:4969:3: ruleEnumLiteral
            {
             before(grammarAccess.getEnumDeclarationAccess().getLiteralsEnumLiteralParserRuleCall_2_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnumDeclarationAccess().getLiteralsEnumLiteralParserRuleCall_2_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__LiteralsAssignment_2_0_1_0"


    // $ANTLR start "rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1"
    // InternalProblem.g:4978:1: rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 : ( ruleEnumLiteral ) ;
    public final void rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4982:1: ( ( ruleEnumLiteral ) )
            // InternalProblem.g:4983:2: ( ruleEnumLiteral )
            {
            // InternalProblem.g:4983:2: ( ruleEnumLiteral )
            // InternalProblem.g:4984:3: ruleEnumLiteral
            {
             before(grammarAccess.getEnumDeclarationAccess().getLiteralsEnumLiteralParserRuleCall_2_0_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnumDeclarationAccess().getLiteralsEnumLiteralParserRuleCall_2_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1"


    // $ANTLR start "rule__EnumLiteral__NameAssignment"
    // InternalProblem.g:4993:1: rule__EnumLiteral__NameAssignment : ( ruleIdentifier ) ;
    public final void rule__EnumLiteral__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4997:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:4998:2: ( ruleIdentifier )
            {
            // InternalProblem.g:4998:2: ( ruleIdentifier )
            // InternalProblem.g:4999:3: ruleIdentifier
            {
             before(grammarAccess.getEnumLiteralAccess().getNameIdentifierParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getEnumLiteralAccess().getNameIdentifierParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumLiteral__NameAssignment"


    // $ANTLR start "rule__ReferenceDeclaration__ContainmentAssignment_0_0"
    // InternalProblem.g:5008:1: rule__ReferenceDeclaration__ContainmentAssignment_0_0 : ( ( 'contains' ) ) ;
    public final void rule__ReferenceDeclaration__ContainmentAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5012:1: ( ( ( 'contains' ) ) )
            // InternalProblem.g:5013:2: ( ( 'contains' ) )
            {
            // InternalProblem.g:5013:2: ( ( 'contains' ) )
            // InternalProblem.g:5014:3: ( 'contains' )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getContainmentContainsKeyword_0_0_0()); 
            // InternalProblem.g:5015:3: ( 'contains' )
            // InternalProblem.g:5016:4: 'contains'
            {
             before(grammarAccess.getReferenceDeclarationAccess().getContainmentContainsKeyword_0_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalProblem.g:5027:1: rule__ReferenceDeclaration__ReferenceTypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceDeclaration__ReferenceTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5031:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5032:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5032:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5033:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeRelationCrossReference_1_0()); 
            // InternalProblem.g:5034:3: ( ruleQualifiedName )
            // InternalProblem.g:5035:4: ruleQualifiedName
            {
             before(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeRelationQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeRelationQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeRelationCrossReference_1_0()); 

            }


            }

        }
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
    // InternalProblem.g:5046:1: rule__ReferenceDeclaration__MultiplicityAssignment_2_1 : ( ruleMultiplicity ) ;
    public final void rule__ReferenceDeclaration__MultiplicityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5050:1: ( ( ruleMultiplicity ) )
            // InternalProblem.g:5051:2: ( ruleMultiplicity )
            {
            // InternalProblem.g:5051:2: ( ruleMultiplicity )
            // InternalProblem.g:5052:3: ruleMultiplicity
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
    // InternalProblem.g:5061:1: rule__ReferenceDeclaration__NameAssignment_3 : ( ruleIdentifier ) ;
    public final void rule__ReferenceDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5065:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:5066:2: ( ruleIdentifier )
            {
            // InternalProblem.g:5066:2: ( ruleIdentifier )
            // InternalProblem.g:5067:3: ruleIdentifier
            {
             before(grammarAccess.getReferenceDeclarationAccess().getNameIdentifierParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getReferenceDeclarationAccess().getNameIdentifierParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalProblem.g:5076:1: rule__ReferenceDeclaration__OppositeAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceDeclaration__OppositeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5080:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5081:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5081:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5082:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getOppositeReferenceDeclarationCrossReference_4_1_0()); 
            // InternalProblem.g:5083:3: ( ruleQualifiedName )
            // InternalProblem.g:5084:4: ruleQualifiedName
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
    // InternalProblem.g:5095:1: rule__PredicateDefinition__ErrorAssignment_0_0_0 : ( ( 'error' ) ) ;
    public final void rule__PredicateDefinition__ErrorAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5099:1: ( ( ( 'error' ) ) )
            // InternalProblem.g:5100:2: ( ( 'error' ) )
            {
            // InternalProblem.g:5100:2: ( ( 'error' ) )
            // InternalProblem.g:5101:3: ( 'error' )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_0_0_0()); 
            // InternalProblem.g:5102:3: ( 'error' )
            // InternalProblem.g:5103:4: 'error'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_0_0_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalProblem.g:5114:1: rule__PredicateDefinition__NameAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__PredicateDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5118:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:5119:2: ( ruleIdentifier )
            {
            // InternalProblem.g:5119:2: ( ruleIdentifier )
            // InternalProblem.g:5120:3: ruleIdentifier
            {
             before(grammarAccess.getPredicateDefinitionAccess().getNameIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getPredicateDefinitionAccess().getNameIdentifierParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProblem.g:5129:1: rule__PredicateDefinition__ParametersAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__PredicateDefinition__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5133:1: ( ( ruleParameter ) )
            // InternalProblem.g:5134:2: ( ruleParameter )
            {
            // InternalProblem.g:5134:2: ( ruleParameter )
            // InternalProblem.g:5135:3: ruleParameter
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
    // InternalProblem.g:5144:1: rule__PredicateDefinition__ParametersAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__PredicateDefinition__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5148:1: ( ( ruleParameter ) )
            // InternalProblem.g:5149:2: ( ruleParameter )
            {
            // InternalProblem.g:5149:2: ( ruleParameter )
            // InternalProblem.g:5150:3: ruleParameter
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
    // InternalProblem.g:5159:1: rule__PredicateDefinition__BodiesAssignment_5_1 : ( ruleConjunction ) ;
    public final void rule__PredicateDefinition__BodiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5163:1: ( ( ruleConjunction ) )
            // InternalProblem.g:5164:2: ( ruleConjunction )
            {
            // InternalProblem.g:5164:2: ( ruleConjunction )
            // InternalProblem.g:5165:3: ruleConjunction
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
    // InternalProblem.g:5174:1: rule__PredicateDefinition__BodiesAssignment_5_2_1 : ( ruleConjunction ) ;
    public final void rule__PredicateDefinition__BodiesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5178:1: ( ( ruleConjunction ) )
            // InternalProblem.g:5179:2: ( ruleConjunction )
            {
            // InternalProblem.g:5179:2: ( ruleConjunction )
            // InternalProblem.g:5180:3: ruleConjunction
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
    // InternalProblem.g:5189:1: rule__Parameter__ParameterTypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Parameter__ParameterTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5193:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5194:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5194:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5195:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getParameterAccess().getParameterTypeRelationCrossReference_0_0()); 
            // InternalProblem.g:5196:3: ( ruleQualifiedName )
            // InternalProblem.g:5197:4: ruleQualifiedName
            {
             before(grammarAccess.getParameterAccess().getParameterTypeRelationQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getParameterTypeRelationQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getParameterTypeRelationCrossReference_0_0()); 

            }


            }

        }
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
    // InternalProblem.g:5208:1: rule__Parameter__NameAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5212:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:5213:2: ( ruleIdentifier )
            {
            // InternalProblem.g:5213:2: ( ruleIdentifier )
            // InternalProblem.g:5214:3: ruleIdentifier
            {
             before(grammarAccess.getParameterAccess().getNameIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameIdentifierParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProblem.g:5223:1: rule__Conjunction__LiteralsAssignment_0 : ( ruleLiteral ) ;
    public final void rule__Conjunction__LiteralsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5227:1: ( ( ruleLiteral ) )
            // InternalProblem.g:5228:2: ( ruleLiteral )
            {
            // InternalProblem.g:5228:2: ( ruleLiteral )
            // InternalProblem.g:5229:3: ruleLiteral
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
    // InternalProblem.g:5238:1: rule__Conjunction__LiteralsAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__Conjunction__LiteralsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5242:1: ( ( ruleLiteral ) )
            // InternalProblem.g:5243:2: ( ruleLiteral )
            {
            // InternalProblem.g:5243:2: ( ruleLiteral )
            // InternalProblem.g:5244:3: ruleLiteral
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
    // InternalProblem.g:5253:1: rule__NegativeLiteral__AtomAssignment_1 : ( ruleAtom ) ;
    public final void rule__NegativeLiteral__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5257:1: ( ( ruleAtom ) )
            // InternalProblem.g:5258:2: ( ruleAtom )
            {
            // InternalProblem.g:5258:2: ( ruleAtom )
            // InternalProblem.g:5259:3: ruleAtom
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
    // InternalProblem.g:5268:1: rule__Atom__RelationAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Atom__RelationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5272:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5273:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5273:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5274:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAtomAccess().getRelationRelationCrossReference_0_0()); 
            // InternalProblem.g:5275:3: ( ruleQualifiedName )
            // InternalProblem.g:5276:4: ruleQualifiedName
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
    // InternalProblem.g:5287:1: rule__Atom__TransitiveClosureAssignment_1 : ( ( '+' ) ) ;
    public final void rule__Atom__TransitiveClosureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5291:1: ( ( ( '+' ) ) )
            // InternalProblem.g:5292:2: ( ( '+' ) )
            {
            // InternalProblem.g:5292:2: ( ( '+' ) )
            // InternalProblem.g:5293:3: ( '+' )
            {
             before(grammarAccess.getAtomAccess().getTransitiveClosurePlusSignKeyword_1_0()); 
            // InternalProblem.g:5294:3: ( '+' )
            // InternalProblem.g:5295:4: '+'
            {
             before(grammarAccess.getAtomAccess().getTransitiveClosurePlusSignKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalProblem.g:5306:1: rule__Atom__ArgumentsAssignment_3_0 : ( ruleArgument ) ;
    public final void rule__Atom__ArgumentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5310:1: ( ( ruleArgument ) )
            // InternalProblem.g:5311:2: ( ruleArgument )
            {
            // InternalProblem.g:5311:2: ( ruleArgument )
            // InternalProblem.g:5312:3: ruleArgument
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
    // InternalProblem.g:5321:1: rule__Atom__ArgumentsAssignment_3_1_1 : ( ruleArgument ) ;
    public final void rule__Atom__ArgumentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5325:1: ( ( ruleArgument ) )
            // InternalProblem.g:5326:2: ( ruleArgument )
            {
            // InternalProblem.g:5326:2: ( ruleArgument )
            // InternalProblem.g:5327:3: ruleArgument
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


    // $ANTLR start "rule__VariableOrNodeArgument__VariableOrNodeAssignment"
    // InternalProblem.g:5336:1: rule__VariableOrNodeArgument__VariableOrNodeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__VariableOrNodeArgument__VariableOrNodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5340:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5341:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5341:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5342:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getVariableOrNodeArgumentAccess().getVariableOrNodeVariableOrNodeCrossReference_0()); 
            // InternalProblem.g:5343:3: ( ruleQualifiedName )
            // InternalProblem.g:5344:4: ruleQualifiedName
            {
             before(grammarAccess.getVariableOrNodeArgumentAccess().getVariableOrNodeVariableOrNodeQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getVariableOrNodeArgumentAccess().getVariableOrNodeVariableOrNodeQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getVariableOrNodeArgumentAccess().getVariableOrNodeVariableOrNodeCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableOrNodeArgument__VariableOrNodeAssignment"


    // $ANTLR start "rule__ConstantArgument__ConstantAssignment"
    // InternalProblem.g:5355:1: rule__ConstantArgument__ConstantAssignment : ( ruleConstant ) ;
    public final void rule__ConstantArgument__ConstantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5359:1: ( ( ruleConstant ) )
            // InternalProblem.g:5360:2: ( ruleConstant )
            {
            // InternalProblem.g:5360:2: ( ruleConstant )
            // InternalProblem.g:5361:3: ruleConstant
            {
             before(grammarAccess.getConstantArgumentAccess().getConstantConstantParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantArgumentAccess().getConstantConstantParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantArgument__ConstantAssignment"


    // $ANTLR start "rule__Assertion__RelationAssignment_0_0_0"
    // InternalProblem.g:5370:1: rule__Assertion__RelationAssignment_0_0_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__RelationAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5374:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5375:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5375:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5376:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getRelationRelationCrossReference_0_0_0_0()); 
            // InternalProblem.g:5377:3: ( ruleQualifiedName )
            // InternalProblem.g:5378:4: ruleQualifiedName
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
    // InternalProblem.g:5389:1: rule__Assertion__ArgumentsAssignment_0_0_2_0 : ( ruleAssertionArgument ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5393:1: ( ( ruleAssertionArgument ) )
            // InternalProblem.g:5394:2: ( ruleAssertionArgument )
            {
            // InternalProblem.g:5394:2: ( ruleAssertionArgument )
            // InternalProblem.g:5395:3: ruleAssertionArgument
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssertionArgumentParserRuleCall_0_0_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertionArgument();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getArgumentsAssertionArgumentParserRuleCall_0_0_2_0_0()); 

            }


            }

        }
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
    // InternalProblem.g:5404:1: rule__Assertion__ArgumentsAssignment_0_0_2_1_1 : ( ruleAssertionArgument ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5408:1: ( ( ruleAssertionArgument ) )
            // InternalProblem.g:5409:2: ( ruleAssertionArgument )
            {
            // InternalProblem.g:5409:2: ( ruleAssertionArgument )
            // InternalProblem.g:5410:3: ruleAssertionArgument
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssertionArgumentParserRuleCall_0_0_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertionArgument();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getArgumentsAssertionArgumentParserRuleCall_0_0_2_1_1_0()); 

            }


            }

        }
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
    // InternalProblem.g:5419:1: rule__Assertion__ValueAssignment_0_0_5 : ( ruleLogicValue ) ;
    public final void rule__Assertion__ValueAssignment_0_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5423:1: ( ( ruleLogicValue ) )
            // InternalProblem.g:5424:2: ( ruleLogicValue )
            {
            // InternalProblem.g:5424:2: ( ruleLogicValue )
            // InternalProblem.g:5425:3: ruleLogicValue
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
    // InternalProblem.g:5434:1: rule__Assertion__ValueAssignment_0_1_0 : ( ruleShortLogicValue ) ;
    public final void rule__Assertion__ValueAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5438:1: ( ( ruleShortLogicValue ) )
            // InternalProblem.g:5439:2: ( ruleShortLogicValue )
            {
            // InternalProblem.g:5439:2: ( ruleShortLogicValue )
            // InternalProblem.g:5440:3: ruleShortLogicValue
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
    // InternalProblem.g:5449:1: rule__Assertion__RelationAssignment_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__RelationAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5453:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5454:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5454:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5455:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getRelationRelationCrossReference_0_1_1_0()); 
            // InternalProblem.g:5456:3: ( ruleQualifiedName )
            // InternalProblem.g:5457:4: ruleQualifiedName
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
    // InternalProblem.g:5468:1: rule__Assertion__ArgumentsAssignment_0_1_3_0 : ( ruleAssertionArgument ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5472:1: ( ( ruleAssertionArgument ) )
            // InternalProblem.g:5473:2: ( ruleAssertionArgument )
            {
            // InternalProblem.g:5473:2: ( ruleAssertionArgument )
            // InternalProblem.g:5474:3: ruleAssertionArgument
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssertionArgumentParserRuleCall_0_1_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertionArgument();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getArgumentsAssertionArgumentParserRuleCall_0_1_3_0_0()); 

            }


            }

        }
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
    // InternalProblem.g:5483:1: rule__Assertion__ArgumentsAssignment_0_1_3_1_1 : ( ruleAssertionArgument ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_1_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5487:1: ( ( ruleAssertionArgument ) )
            // InternalProblem.g:5488:2: ( ruleAssertionArgument )
            {
            // InternalProblem.g:5488:2: ( ruleAssertionArgument )
            // InternalProblem.g:5489:3: ruleAssertionArgument
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssertionArgumentParserRuleCall_0_1_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertionArgument();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getArgumentsAssertionArgumentParserRuleCall_0_1_3_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__NodeAssertionArgument__NodeAssignment"
    // InternalProblem.g:5498:1: rule__NodeAssertionArgument__NodeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__NodeAssertionArgument__NodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5502:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5503:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5503:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5504:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNodeAssertionArgumentAccess().getNodeNodeCrossReference_0()); 
            // InternalProblem.g:5505:3: ( ruleQualifiedName )
            // InternalProblem.g:5506:4: ruleQualifiedName
            {
             before(grammarAccess.getNodeAssertionArgumentAccess().getNodeNodeQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNodeAssertionArgumentAccess().getNodeNodeQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getNodeAssertionArgumentAccess().getNodeNodeCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeAssertionArgument__NodeAssignment"


    // $ANTLR start "rule__ConstantAssertionArgument__ConstantAssignment"
    // InternalProblem.g:5517:1: rule__ConstantAssertionArgument__ConstantAssignment : ( ruleConstant ) ;
    public final void rule__ConstantAssertionArgument__ConstantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5521:1: ( ( ruleConstant ) )
            // InternalProblem.g:5522:2: ( ruleConstant )
            {
            // InternalProblem.g:5522:2: ( ruleConstant )
            // InternalProblem.g:5523:3: ruleConstant
            {
             before(grammarAccess.getConstantAssertionArgumentAccess().getConstantConstantParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantAssertionArgumentAccess().getConstantConstantParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantAssertionArgument__ConstantAssignment"


    // $ANTLR start "rule__NodeValueAssertion__NodeAssignment_0"
    // InternalProblem.g:5532:1: rule__NodeValueAssertion__NodeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NodeValueAssertion__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5536:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5537:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5537:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5538:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNodeValueAssertionAccess().getNodeNodeCrossReference_0_0()); 
            // InternalProblem.g:5539:3: ( ruleQualifiedName )
            // InternalProblem.g:5540:4: ruleQualifiedName
            {
             before(grammarAccess.getNodeValueAssertionAccess().getNodeNodeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNodeValueAssertionAccess().getNodeNodeQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getNodeValueAssertionAccess().getNodeNodeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeValueAssertion__NodeAssignment_0"


    // $ANTLR start "rule__NodeValueAssertion__ValueAssignment_2"
    // InternalProblem.g:5551:1: rule__NodeValueAssertion__ValueAssignment_2 : ( ruleConstant ) ;
    public final void rule__NodeValueAssertion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5555:1: ( ( ruleConstant ) )
            // InternalProblem.g:5556:2: ( ruleConstant )
            {
            // InternalProblem.g:5556:2: ( ruleConstant )
            // InternalProblem.g:5557:3: ruleConstant
            {
             before(grammarAccess.getNodeValueAssertionAccess().getValueConstantParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getNodeValueAssertionAccess().getValueConstantParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeValueAssertion__ValueAssignment_2"


    // $ANTLR start "rule__IntConstant__IntValueAssignment"
    // InternalProblem.g:5566:1: rule__IntConstant__IntValueAssignment : ( ruleInteger ) ;
    public final void rule__IntConstant__IntValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5570:1: ( ( ruleInteger ) )
            // InternalProblem.g:5571:2: ( ruleInteger )
            {
            // InternalProblem.g:5571:2: ( ruleInteger )
            // InternalProblem.g:5572:3: ruleInteger
            {
             before(grammarAccess.getIntConstantAccess().getIntValueIntegerParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntConstantAccess().getIntValueIntegerParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntConstant__IntValueAssignment"


    // $ANTLR start "rule__RealConstant__RealValueAssignment"
    // InternalProblem.g:5581:1: rule__RealConstant__RealValueAssignment : ( ruleReal ) ;
    public final void rule__RealConstant__RealValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5585:1: ( ( ruleReal ) )
            // InternalProblem.g:5586:2: ( ruleReal )
            {
            // InternalProblem.g:5586:2: ( ruleReal )
            // InternalProblem.g:5587:3: ruleReal
            {
             before(grammarAccess.getRealConstantAccess().getRealValueRealParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleReal();

            state._fsp--;

             after(grammarAccess.getRealConstantAccess().getRealValueRealParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealConstant__RealValueAssignment"


    // $ANTLR start "rule__StringConstant__StringValueAssignment"
    // InternalProblem.g:5596:1: rule__StringConstant__StringValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringConstant__StringValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5600:1: ( ( RULE_STRING ) )
            // InternalProblem.g:5601:2: ( RULE_STRING )
            {
            // InternalProblem.g:5601:2: ( RULE_STRING )
            // InternalProblem.g:5602:3: RULE_STRING
            {
             before(grammarAccess.getStringConstantAccess().getStringValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringConstantAccess().getStringValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstant__StringValueAssignment"


    // $ANTLR start "rule__ScopeDeclaration__TypeScopesAssignment_1"
    // InternalProblem.g:5611:1: rule__ScopeDeclaration__TypeScopesAssignment_1 : ( ruleTypeScope ) ;
    public final void rule__ScopeDeclaration__TypeScopesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5615:1: ( ( ruleTypeScope ) )
            // InternalProblem.g:5616:2: ( ruleTypeScope )
            {
            // InternalProblem.g:5616:2: ( ruleTypeScope )
            // InternalProblem.g:5617:3: ruleTypeScope
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
    // InternalProblem.g:5626:1: rule__ScopeDeclaration__TypeScopesAssignment_2_1 : ( ruleTypeScope ) ;
    public final void rule__ScopeDeclaration__TypeScopesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5630:1: ( ( ruleTypeScope ) )
            // InternalProblem.g:5631:2: ( ruleTypeScope )
            {
            // InternalProblem.g:5631:2: ( ruleTypeScope )
            // InternalProblem.g:5632:3: ruleTypeScope
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
    // InternalProblem.g:5641:1: rule__TypeScope__TargetTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeScope__TargetTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5645:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:5646:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:5646:2: ( ( RULE_ID ) )
            // InternalProblem.g:5647:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeScopeAccess().getTargetTypeClassDeclarationCrossReference_0_0()); 
            // InternalProblem.g:5648:3: ( RULE_ID )
            // InternalProblem.g:5649:4: RULE_ID
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
    // InternalProblem.g:5660:1: rule__TypeScope__IncrementAssignment_1_0 : ( ( '+=' ) ) ;
    public final void rule__TypeScope__IncrementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5664:1: ( ( ( '+=' ) ) )
            // InternalProblem.g:5665:2: ( ( '+=' ) )
            {
            // InternalProblem.g:5665:2: ( ( '+=' ) )
            // InternalProblem.g:5666:3: ( '+=' )
            {
             before(grammarAccess.getTypeScopeAccess().getIncrementPlusSignEqualsSignKeyword_1_0_0()); 
            // InternalProblem.g:5667:3: ( '+=' )
            // InternalProblem.g:5668:4: '+='
            {
             before(grammarAccess.getTypeScopeAccess().getIncrementPlusSignEqualsSignKeyword_1_0_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalProblem.g:5679:1: rule__TypeScope__MultiplicityAssignment_2 : ( ruleDefiniteMultiplicity ) ;
    public final void rule__TypeScope__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5683:1: ( ( ruleDefiniteMultiplicity ) )
            // InternalProblem.g:5684:2: ( ruleDefiniteMultiplicity )
            {
            // InternalProblem.g:5684:2: ( ruleDefiniteMultiplicity )
            // InternalProblem.g:5685:3: ruleDefiniteMultiplicity
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
    // InternalProblem.g:5694:1: rule__RangeMultiplicity__LowerBoundAssignment_0 : ( RULE_INT ) ;
    public final void rule__RangeMultiplicity__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5698:1: ( ( RULE_INT ) )
            // InternalProblem.g:5699:2: ( RULE_INT )
            {
            // InternalProblem.g:5699:2: ( RULE_INT )
            // InternalProblem.g:5700:3: RULE_INT
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
    // InternalProblem.g:5709:1: rule__RangeMultiplicity__UpperBoundAssignment_2 : ( ruleUpperBound ) ;
    public final void rule__RangeMultiplicity__UpperBoundAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5713:1: ( ( ruleUpperBound ) )
            // InternalProblem.g:5714:2: ( ruleUpperBound )
            {
            // InternalProblem.g:5714:2: ( ruleUpperBound )
            // InternalProblem.g:5715:3: ruleUpperBound
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
    // InternalProblem.g:5724:1: rule__ExactMultiplicity__ExactValueAssignment : ( RULE_INT ) ;
    public final void rule__ExactMultiplicity__ExactValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5728:1: ( ( RULE_INT ) )
            // InternalProblem.g:5729:2: ( RULE_INT )
            {
            // InternalProblem.g:5729:2: ( RULE_INT )
            // InternalProblem.g:5730:3: RULE_INT
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\5\3\uffff\4\42\3\uffff\1\6\3\42";
    static final String dfa_3s = "\1\54\3\uffff\1\45\3\50\3\uffff\1\25\3\50";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\4\uffff\1\4\1\6\1\5\4\uffff";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\5\12\uffff\1\3\2\uffff\1\6\1\7\1\uffff\2\10\1\uffff\1\1\3\uffff\1\2\7\uffff\1\11\3\uffff\1\1\1\uffff\1\3",
            "",
            "",
            "",
            "\1\10\2\uffff\1\12",
            "\1\10\2\uffff\1\12\2\uffff\1\13",
            "\1\10\2\uffff\1\12\2\uffff\1\13",
            "\1\10\2\uffff\1\12\2\uffff\1\13",
            "",
            "",
            "",
            "\1\14\15\uffff\1\15\1\16",
            "\1\10\2\uffff\1\12\2\uffff\1\13",
            "\1\10\2\uffff\1\12\2\uffff\1\13",
            "\1\10\2\uffff\1\12\2\uffff\1\13"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1000:1: rule__Statement__Alternatives : ( ( ruleClassDeclaration ) | ( ruleEnumDeclaration ) | ( rulePredicateDefinition ) | ( ruleAssertion ) | ( ruleNodeValueAssertion ) | ( ruleScopeDeclaration ) );";
        }
    }
    static final String dfa_7s = "\54\uffff";
    static final String dfa_8s = "\1\5\4\42\1\uffff\1\4\1\6\4\16\1\4\1\16\1\15\1\16\1\15\3\42\1\4\1\6\1\4\1\uffff\4\16\1\4\1\16\1\15\6\16\1\6\1\4\5\16";
    static final String dfa_9s = "\1\30\1\42\3\50\1\uffff\1\51\1\25\1\43\3\50\1\7\3\43\1\45\3\50\1\51\1\25\1\7\1\uffff\1\43\3\50\1\7\3\43\3\50\2\43\1\25\1\7\3\50\2\43";
    static final String dfa_10s = "\5\uffff\1\2\21\uffff\1\1\24\uffff";
    static final String dfa_11s = "\54\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\2\15\uffff\1\3\1\4\1\uffff\2\5",
            "\1\6",
            "\1\6\5\uffff\1\7",
            "\1\6\5\uffff\1\7",
            "\1\6\5\uffff\1\7",
            "",
            "\1\16\1\10\1\11\1\15\1\17\13\uffff\1\12\1\13\15\uffff\1\20\5\uffff\1\14",
            "\1\21\15\uffff\1\22\1\23",
            "\1\24\24\uffff\1\20",
            "\1\24\24\uffff\1\20\4\uffff\1\25",
            "\1\24\24\uffff\1\20\4\uffff\1\25",
            "\1\24\24\uffff\1\20\4\uffff\1\25",
            "\1\16\2\uffff\1\15",
            "\1\24\24\uffff\1\20",
            "\1\26\1\24\24\uffff\1\20",
            "\1\24\24\uffff\1\20",
            "\1\5\27\uffff\1\27",
            "\1\6\5\uffff\1\7",
            "\1\6\5\uffff\1\7",
            "\1\6\5\uffff\1\7",
            "\1\36\1\30\1\31\1\35\1\37\13\uffff\1\32\1\33\23\uffff\1\34",
            "\1\40\15\uffff\1\41\1\42",
            "\1\43\2\uffff\1\44",
            "",
            "\1\24\24\uffff\1\20",
            "\1\24\24\uffff\1\20\4\uffff\1\45",
            "\1\24\24\uffff\1\20\4\uffff\1\45",
            "\1\24\24\uffff\1\20\4\uffff\1\45",
            "\1\36\2\uffff\1\35",
            "\1\24\24\uffff\1\20",
            "\1\46\1\24\24\uffff\1\20",
            "\1\24\24\uffff\1\20",
            "\1\24\24\uffff\1\20\4\uffff\1\25",
            "\1\24\24\uffff\1\20\4\uffff\1\25",
            "\1\24\24\uffff\1\20\4\uffff\1\25",
            "\1\24\24\uffff\1\20",
            "\1\24\24\uffff\1\20",
            "\1\47\15\uffff\1\50\1\51",
            "\1\52\2\uffff\1\53",
            "\1\24\24\uffff\1\20\4\uffff\1\45",
            "\1\24\24\uffff\1\20\4\uffff\1\45",
            "\1\24\24\uffff\1\20\4\uffff\1\45",
            "\1\24\24\uffff\1\20",
            "\1\24\24\uffff\1\20"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1192:1: rule__Assertion__Alternatives_0 : ( ( ( rule__Assertion__Group_0_0__0 ) ) | ( ( rule__Assertion__Group_0_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000144045B20060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000144045B20062L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000300060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000040004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000018002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000080020310060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000310062L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020300060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000310060L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080300060L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800300060L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000B00060L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000208003001F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000200003001F0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000001B00060L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000040000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000090L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000090L});

}