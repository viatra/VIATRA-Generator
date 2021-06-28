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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_QUOTED_ID", "RULE_ID", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "','", "';'", "'refers'", "'pred'", "'='", "'*'", "'true'", "'false'", "'e'", "'E'", "'-'", "'+'", "'unknown'", "'!'", "'?'", "'problem'", "'class'", "'extends'", "'{'", "'}'", "'enum'", "'['", "']'", "'opposite'", "'('", "')'", "':-'", "':'", "'scope'", "'..'", "'::'", "'abstract'", "'contains'", "'error'", "'+='"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int RULE_QUOTED_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalProblem.g:948:1: ( ruleReal EOF )
            // InternalProblem.g:949:1: ruleReal EOF
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

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalProblem.g:959:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:964:2: ( ( ( rule__Real__Group__0 ) ) )
            // InternalProblem.g:965:2: ( ( rule__Real__Group__0 ) )
            {
            // InternalProblem.g:965:2: ( ( rule__Real__Group__0 ) )
            // InternalProblem.g:966:3: ( rule__Real__Group__0 )
            {
             before(grammarAccess.getRealAccess().getGroup()); 
            // InternalProblem.g:967:3: ( rule__Real__Group__0 )
            // InternalProblem.g:967:4: rule__Real__Group__0
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleReal"


    // $ANTLR start "ruleLogicValue"
    // InternalProblem.g:977:1: ruleLogicValue : ( ( rule__LogicValue__Alternatives ) ) ;
    public final void ruleLogicValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:981:1: ( ( ( rule__LogicValue__Alternatives ) ) )
            // InternalProblem.g:982:2: ( ( rule__LogicValue__Alternatives ) )
            {
            // InternalProblem.g:982:2: ( ( rule__LogicValue__Alternatives ) )
            // InternalProblem.g:983:3: ( rule__LogicValue__Alternatives )
            {
             before(grammarAccess.getLogicValueAccess().getAlternatives()); 
            // InternalProblem.g:984:3: ( rule__LogicValue__Alternatives )
            // InternalProblem.g:984:4: rule__LogicValue__Alternatives
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
    // InternalProblem.g:993:1: ruleShortLogicValue : ( ( rule__ShortLogicValue__Alternatives ) ) ;
    public final void ruleShortLogicValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:997:1: ( ( ( rule__ShortLogicValue__Alternatives ) ) )
            // InternalProblem.g:998:2: ( ( rule__ShortLogicValue__Alternatives ) )
            {
            // InternalProblem.g:998:2: ( ( rule__ShortLogicValue__Alternatives ) )
            // InternalProblem.g:999:3: ( rule__ShortLogicValue__Alternatives )
            {
             before(grammarAccess.getShortLogicValueAccess().getAlternatives()); 
            // InternalProblem.g:1000:3: ( rule__ShortLogicValue__Alternatives )
            // InternalProblem.g:1000:4: rule__ShortLogicValue__Alternatives
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
    // InternalProblem.g:1008:1: rule__Statement__Alternatives : ( ( ruleClassDeclaration ) | ( ruleEnumDeclaration ) | ( rulePredicateDefinition ) | ( ruleAssertion ) | ( ruleNodeValueAssertion ) | ( ruleScopeDeclaration ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1012:1: ( ( ruleClassDeclaration ) | ( ruleEnumDeclaration ) | ( rulePredicateDefinition ) | ( ruleAssertion ) | ( ruleNodeValueAssertion ) | ( ruleScopeDeclaration ) )
            int alt1=6;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalProblem.g:1013:2: ( ruleClassDeclaration )
                    {
                    // InternalProblem.g:1013:2: ( ruleClassDeclaration )
                    // InternalProblem.g:1014:3: ruleClassDeclaration
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
                    // InternalProblem.g:1019:2: ( ruleEnumDeclaration )
                    {
                    // InternalProblem.g:1019:2: ( ruleEnumDeclaration )
                    // InternalProblem.g:1020:3: ruleEnumDeclaration
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
                    // InternalProblem.g:1025:2: ( rulePredicateDefinition )
                    {
                    // InternalProblem.g:1025:2: ( rulePredicateDefinition )
                    // InternalProblem.g:1026:3: rulePredicateDefinition
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
                    // InternalProblem.g:1031:2: ( ruleAssertion )
                    {
                    // InternalProblem.g:1031:2: ( ruleAssertion )
                    // InternalProblem.g:1032:3: ruleAssertion
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
                    // InternalProblem.g:1037:2: ( ruleNodeValueAssertion )
                    {
                    // InternalProblem.g:1037:2: ( ruleNodeValueAssertion )
                    // InternalProblem.g:1038:3: ruleNodeValueAssertion
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
                    // InternalProblem.g:1043:2: ( ruleScopeDeclaration )
                    {
                    // InternalProblem.g:1043:2: ( ruleScopeDeclaration )
                    // InternalProblem.g:1044:3: ruleScopeDeclaration
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
    // InternalProblem.g:1053:1: rule__ClassDeclaration__Alternatives_4 : ( ( ( rule__ClassDeclaration__Group_4_0__0 ) ) | ( '.' ) );
    public final void rule__ClassDeclaration__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1057:1: ( ( ( rule__ClassDeclaration__Group_4_0__0 ) ) | ( '.' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
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
                    // InternalProblem.g:1058:2: ( ( rule__ClassDeclaration__Group_4_0__0 ) )
                    {
                    // InternalProblem.g:1058:2: ( ( rule__ClassDeclaration__Group_4_0__0 ) )
                    // InternalProblem.g:1059:3: ( rule__ClassDeclaration__Group_4_0__0 )
                    {
                     before(grammarAccess.getClassDeclarationAccess().getGroup_4_0()); 
                    // InternalProblem.g:1060:3: ( rule__ClassDeclaration__Group_4_0__0 )
                    // InternalProblem.g:1060:4: rule__ClassDeclaration__Group_4_0__0
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
                    // InternalProblem.g:1064:2: ( '.' )
                    {
                    // InternalProblem.g:1064:2: ( '.' )
                    // InternalProblem.g:1065:3: '.'
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


    // $ANTLR start "rule__EnumDeclaration__Alternatives_2"
    // InternalProblem.g:1074:1: rule__EnumDeclaration__Alternatives_2 : ( ( ( rule__EnumDeclaration__Group_2_0__0 ) ) | ( '.' ) );
    public final void rule__EnumDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1078:1: ( ( ( rule__EnumDeclaration__Group_2_0__0 ) ) | ( '.' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
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
                    // InternalProblem.g:1079:2: ( ( rule__EnumDeclaration__Group_2_0__0 ) )
                    {
                    // InternalProblem.g:1079:2: ( ( rule__EnumDeclaration__Group_2_0__0 ) )
                    // InternalProblem.g:1080:3: ( rule__EnumDeclaration__Group_2_0__0 )
                    {
                     before(grammarAccess.getEnumDeclarationAccess().getGroup_2_0()); 
                    // InternalProblem.g:1081:3: ( rule__EnumDeclaration__Group_2_0__0 )
                    // InternalProblem.g:1081:4: rule__EnumDeclaration__Group_2_0__0
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
                    // InternalProblem.g:1085:2: ( '.' )
                    {
                    // InternalProblem.g:1085:2: ( '.' )
                    // InternalProblem.g:1086:3: '.'
                    {
                     before(grammarAccess.getEnumDeclarationAccess().getFullStopKeyword_2_1()); 
                    match(input,12,FOLLOW_2); 
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
    // InternalProblem.g:1095:1: rule__EnumDeclaration__Alternatives_2_0_1_2 : ( ( ',' ) | ( ';' ) );
    public final void rule__EnumDeclaration__Alternatives_2_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1099:1: ( ( ',' ) | ( ';' ) )
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
                    // InternalProblem.g:1100:2: ( ',' )
                    {
                    // InternalProblem.g:1100:2: ( ',' )
                    // InternalProblem.g:1101:3: ','
                    {
                     before(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_2_0_1_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_2_0_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1106:2: ( ';' )
                    {
                    // InternalProblem.g:1106:2: ( ';' )
                    // InternalProblem.g:1107:3: ';'
                    {
                     before(grammarAccess.getEnumDeclarationAccess().getSemicolonKeyword_2_0_1_2_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalProblem.g:1116:1: rule__ReferenceDeclaration__Alternatives_0 : ( ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) ) | ( 'refers' ) );
    public final void rule__ReferenceDeclaration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1120:1: ( ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) ) | ( 'refers' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==45) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalProblem.g:1121:2: ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) )
                    {
                    // InternalProblem.g:1121:2: ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) )
                    // InternalProblem.g:1122:3: ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 )
                    {
                     before(grammarAccess.getReferenceDeclarationAccess().getContainmentAssignment_0_0()); 
                    // InternalProblem.g:1123:3: ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 )
                    // InternalProblem.g:1123:4: rule__ReferenceDeclaration__ContainmentAssignment_0_0
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
                    // InternalProblem.g:1127:2: ( 'refers' )
                    {
                    // InternalProblem.g:1127:2: ( 'refers' )
                    // InternalProblem.g:1128:3: 'refers'
                    {
                     before(grammarAccess.getReferenceDeclarationAccess().getRefersKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
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
    // InternalProblem.g:1137:1: rule__PredicateDefinition__Alternatives_0 : ( ( ( rule__PredicateDefinition__Group_0_0__0 ) ) | ( 'pred' ) );
    public final void rule__PredicateDefinition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1141:1: ( ( ( rule__PredicateDefinition__Group_0_0__0 ) ) | ( 'pred' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==46) ) {
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
                    // InternalProblem.g:1142:2: ( ( rule__PredicateDefinition__Group_0_0__0 ) )
                    {
                    // InternalProblem.g:1142:2: ( ( rule__PredicateDefinition__Group_0_0__0 ) )
                    // InternalProblem.g:1143:3: ( rule__PredicateDefinition__Group_0_0__0 )
                    {
                     before(grammarAccess.getPredicateDefinitionAccess().getGroup_0_0()); 
                    // InternalProblem.g:1144:3: ( rule__PredicateDefinition__Group_0_0__0 )
                    // InternalProblem.g:1144:4: rule__PredicateDefinition__Group_0_0__0
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
                    // InternalProblem.g:1148:2: ( 'pred' )
                    {
                    // InternalProblem.g:1148:2: ( 'pred' )
                    // InternalProblem.g:1149:3: 'pred'
                    {
                     before(grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalProblem.g:1158:1: rule__Literal__Alternatives : ( ( ruleAtom ) | ( ruleNegativeLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1162:1: ( ( ruleAtom ) | ( ruleNegativeLiteral ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_QUOTED_ID && LA7_0<=RULE_ID)||(LA7_0>=19 && LA7_0<=22)) ) {
                alt7=1;
            }
            else if ( (LA7_0==26) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalProblem.g:1163:2: ( ruleAtom )
                    {
                    // InternalProblem.g:1163:2: ( ruleAtom )
                    // InternalProblem.g:1164:3: ruleAtom
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
                    // InternalProblem.g:1169:2: ( ruleNegativeLiteral )
                    {
                    // InternalProblem.g:1169:2: ( ruleNegativeLiteral )
                    // InternalProblem.g:1170:3: ruleNegativeLiteral
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
    // InternalProblem.g:1179:1: rule__Argument__Alternatives : ( ( ruleVariableOrNodeArgument ) | ( ruleConstantArgument ) );
    public final void rule__Argument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1183:1: ( ( ruleVariableOrNodeArgument ) | ( ruleConstantArgument ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_QUOTED_ID && LA8_0<=RULE_ID)||(LA8_0>=19 && LA8_0<=22)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT||LA8_0==RULE_STRING||LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalProblem.g:1184:2: ( ruleVariableOrNodeArgument )
                    {
                    // InternalProblem.g:1184:2: ( ruleVariableOrNodeArgument )
                    // InternalProblem.g:1185:3: ruleVariableOrNodeArgument
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
                    // InternalProblem.g:1190:2: ( ruleConstantArgument )
                    {
                    // InternalProblem.g:1190:2: ( ruleConstantArgument )
                    // InternalProblem.g:1191:3: ruleConstantArgument
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
    // InternalProblem.g:1200:1: rule__Assertion__Alternatives_0 : ( ( ( rule__Assertion__Group_0_0__0 ) ) | ( ( rule__Assertion__Group_0_1__0 ) ) );
    public final void rule__Assertion__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1204:1: ( ( ( rule__Assertion__Group_0_0__0 ) ) | ( ( rule__Assertion__Group_0_1__0 ) ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalProblem.g:1205:2: ( ( rule__Assertion__Group_0_0__0 ) )
                    {
                    // InternalProblem.g:1205:2: ( ( rule__Assertion__Group_0_0__0 ) )
                    // InternalProblem.g:1206:3: ( rule__Assertion__Group_0_0__0 )
                    {
                     before(grammarAccess.getAssertionAccess().getGroup_0_0()); 
                    // InternalProblem.g:1207:3: ( rule__Assertion__Group_0_0__0 )
                    // InternalProblem.g:1207:4: rule__Assertion__Group_0_0__0
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
                    // InternalProblem.g:1211:2: ( ( rule__Assertion__Group_0_1__0 ) )
                    {
                    // InternalProblem.g:1211:2: ( ( rule__Assertion__Group_0_1__0 ) )
                    // InternalProblem.g:1212:3: ( rule__Assertion__Group_0_1__0 )
                    {
                     before(grammarAccess.getAssertionAccess().getGroup_0_1()); 
                    // InternalProblem.g:1213:3: ( rule__Assertion__Group_0_1__0 )
                    // InternalProblem.g:1213:4: rule__Assertion__Group_0_1__0
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
    // InternalProblem.g:1221:1: rule__AssertionArgument__Alternatives : ( ( ruleNodeAssertionArgument ) | ( ruleConstantAssertionArgument ) );
    public final void rule__AssertionArgument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1225:1: ( ( ruleNodeAssertionArgument ) | ( ruleConstantAssertionArgument ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_QUOTED_ID && LA10_0<=RULE_ID)||(LA10_0>=19 && LA10_0<=22)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT||LA10_0==RULE_STRING||LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalProblem.g:1226:2: ( ruleNodeAssertionArgument )
                    {
                    // InternalProblem.g:1226:2: ( ruleNodeAssertionArgument )
                    // InternalProblem.g:1227:3: ruleNodeAssertionArgument
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
                    // InternalProblem.g:1232:2: ( ruleConstantAssertionArgument )
                    {
                    // InternalProblem.g:1232:2: ( ruleConstantAssertionArgument )
                    // InternalProblem.g:1233:3: ruleConstantAssertionArgument
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
    // InternalProblem.g:1242:1: rule__Constant__Alternatives : ( ( ruleIntConstant ) | ( ruleRealConstant ) | ( ruleStringConstant ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1246:1: ( ( ruleIntConstant ) | ( ruleRealConstant ) | ( ruleStringConstant ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 12:
                        {
                        int LA11_4 = input.LA(4);

                        if ( (LA11_4==RULE_INT) ) {
                            alt11=2;
                        }
                        else if ( (LA11_4==EOF||(LA11_4>=RULE_QUOTED_ID && LA11_4<=RULE_ID)||LA11_4==16||(LA11_4>=19 && LA11_4<=22)||(LA11_4>=26 && LA11_4<=27)||LA11_4==29||LA11_4==33||LA11_4==41||LA11_4==44||LA11_4==46) ) {
                            alt11=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 21:
                    case 22:
                        {
                        alt11=2;
                        }
                        break;
                    case EOF:
                    case 13:
                    case 38:
                        {
                        alt11=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

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
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 12:
                    {
                    int LA11_4 = input.LA(3);

                    if ( (LA11_4==RULE_INT) ) {
                        alt11=2;
                    }
                    else if ( (LA11_4==EOF||(LA11_4>=RULE_QUOTED_ID && LA11_4<=RULE_ID)||LA11_4==16||(LA11_4>=19 && LA11_4<=22)||(LA11_4>=26 && LA11_4<=27)||LA11_4==29||LA11_4==33||LA11_4==41||LA11_4==44||LA11_4==46) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 21:
                case 22:
                    {
                    alt11=2;
                    }
                    break;
                case EOF:
                case 13:
                case 38:
                    {
                    alt11=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

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
                    // InternalProblem.g:1247:2: ( ruleIntConstant )
                    {
                    // InternalProblem.g:1247:2: ( ruleIntConstant )
                    // InternalProblem.g:1248:3: ruleIntConstant
                    {
                     before(grammarAccess.getConstantAccess().getIntConstantParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntConstant();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getIntConstantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1253:2: ( ruleRealConstant )
                    {
                    // InternalProblem.g:1253:2: ( ruleRealConstant )
                    // InternalProblem.g:1254:3: ruleRealConstant
                    {
                     before(grammarAccess.getConstantAccess().getRealConstantParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRealConstant();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getRealConstantParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:1259:2: ( ruleStringConstant )
                    {
                    // InternalProblem.g:1259:2: ( ruleStringConstant )
                    // InternalProblem.g:1260:3: ruleStringConstant
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
    // InternalProblem.g:1269:1: rule__TypeScope__Alternatives_1 : ( ( ( rule__TypeScope__IncrementAssignment_1_0 ) ) | ( '=' ) );
    public final void rule__TypeScope__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1273:1: ( ( ( rule__TypeScope__IncrementAssignment_1_0 ) ) | ( '=' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==47) ) {
                alt12=1;
            }
            else if ( (LA12_0==17) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalProblem.g:1274:2: ( ( rule__TypeScope__IncrementAssignment_1_0 ) )
                    {
                    // InternalProblem.g:1274:2: ( ( rule__TypeScope__IncrementAssignment_1_0 ) )
                    // InternalProblem.g:1275:3: ( rule__TypeScope__IncrementAssignment_1_0 )
                    {
                     before(grammarAccess.getTypeScopeAccess().getIncrementAssignment_1_0()); 
                    // InternalProblem.g:1276:3: ( rule__TypeScope__IncrementAssignment_1_0 )
                    // InternalProblem.g:1276:4: rule__TypeScope__IncrementAssignment_1_0
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
                    // InternalProblem.g:1280:2: ( '=' )
                    {
                    // InternalProblem.g:1280:2: ( '=' )
                    // InternalProblem.g:1281:3: '='
                    {
                     before(grammarAccess.getTypeScopeAccess().getEqualsSignKeyword_1_1()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalProblem.g:1290:1: rule__Multiplicity__Alternatives : ( ( ruleUnboundedMultiplicity ) | ( ruleDefiniteMultiplicity ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1294:1: ( ( ruleUnboundedMultiplicity ) | ( ruleDefiniteMultiplicity ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EOF||LA13_0==35) ) {
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
                    // InternalProblem.g:1295:2: ( ruleUnboundedMultiplicity )
                    {
                    // InternalProblem.g:1295:2: ( ruleUnboundedMultiplicity )
                    // InternalProblem.g:1296:3: ruleUnboundedMultiplicity
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
                    // InternalProblem.g:1301:2: ( ruleDefiniteMultiplicity )
                    {
                    // InternalProblem.g:1301:2: ( ruleDefiniteMultiplicity )
                    // InternalProblem.g:1302:3: ruleDefiniteMultiplicity
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
    // InternalProblem.g:1311:1: rule__DefiniteMultiplicity__Alternatives : ( ( ruleRangeMultiplicity ) | ( ruleExactMultiplicity ) );
    public final void rule__DefiniteMultiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1315:1: ( ( ruleRangeMultiplicity ) | ( ruleExactMultiplicity ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==42) ) {
                    alt14=1;
                }
                else if ( (LA14_1==EOF||(LA14_1>=12 && LA14_1<=13)||LA14_1==35) ) {
                    alt14=2;
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
                    // InternalProblem.g:1316:2: ( ruleRangeMultiplicity )
                    {
                    // InternalProblem.g:1316:2: ( ruleRangeMultiplicity )
                    // InternalProblem.g:1317:3: ruleRangeMultiplicity
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
                    // InternalProblem.g:1322:2: ( ruleExactMultiplicity )
                    {
                    // InternalProblem.g:1322:2: ( ruleExactMultiplicity )
                    // InternalProblem.g:1323:3: ruleExactMultiplicity
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
    // InternalProblem.g:1332:1: rule__UpperBound__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__UpperBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1336:1: ( ( RULE_INT ) | ( '*' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==18) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalProblem.g:1337:2: ( RULE_INT )
                    {
                    // InternalProblem.g:1337:2: ( RULE_INT )
                    // InternalProblem.g:1338:3: RULE_INT
                    {
                     before(grammarAccess.getUpperBoundAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getUpperBoundAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1343:2: ( '*' )
                    {
                    // InternalProblem.g:1343:2: ( '*' )
                    // InternalProblem.g:1344:3: '*'
                    {
                     before(grammarAccess.getUpperBoundAccess().getAsteriskKeyword_1()); 
                    match(input,18,FOLLOW_2); 
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
    // InternalProblem.g:1353:1: rule__QualifiedName__Alternatives : ( ( RULE_QUOTED_ID ) | ( ( rule__QualifiedName__Group_1__0 ) ) );
    public final void rule__QualifiedName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1357:1: ( ( RULE_QUOTED_ID ) | ( ( rule__QualifiedName__Group_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_QUOTED_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID||(LA16_0>=19 && LA16_0<=22)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalProblem.g:1358:2: ( RULE_QUOTED_ID )
                    {
                    // InternalProblem.g:1358:2: ( RULE_QUOTED_ID )
                    // InternalProblem.g:1359:3: RULE_QUOTED_ID
                    {
                     before(grammarAccess.getQualifiedNameAccess().getQUOTED_IDTerminalRuleCall_0()); 
                    match(input,RULE_QUOTED_ID,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getQUOTED_IDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1364:2: ( ( rule__QualifiedName__Group_1__0 ) )
                    {
                    // InternalProblem.g:1364:2: ( ( rule__QualifiedName__Group_1__0 ) )
                    // InternalProblem.g:1365:3: ( rule__QualifiedName__Group_1__0 )
                    {
                     before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
                    // InternalProblem.g:1366:3: ( rule__QualifiedName__Group_1__0 )
                    // InternalProblem.g:1366:4: rule__QualifiedName__Group_1__0
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
    // InternalProblem.g:1374:1: rule__Identifier__Alternatives : ( ( RULE_ID ) | ( 'true' ) | ( 'false' ) | ( 'e' ) | ( 'E' ) );
    public final void rule__Identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1378:1: ( ( RULE_ID ) | ( 'true' ) | ( 'false' ) | ( 'e' ) | ( 'E' ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case 19:
                {
                alt17=2;
                }
                break;
            case 20:
                {
                alt17=3;
                }
                break;
            case 21:
                {
                alt17=4;
                }
                break;
            case 22:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalProblem.g:1379:2: ( RULE_ID )
                    {
                    // InternalProblem.g:1379:2: ( RULE_ID )
                    // InternalProblem.g:1380:3: RULE_ID
                    {
                     before(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1385:2: ( 'true' )
                    {
                    // InternalProblem.g:1385:2: ( 'true' )
                    // InternalProblem.g:1386:3: 'true'
                    {
                     before(grammarAccess.getIdentifierAccess().getTrueKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getIdentifierAccess().getTrueKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:1391:2: ( 'false' )
                    {
                    // InternalProblem.g:1391:2: ( 'false' )
                    // InternalProblem.g:1392:3: 'false'
                    {
                     before(grammarAccess.getIdentifierAccess().getFalseKeyword_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getIdentifierAccess().getFalseKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProblem.g:1397:2: ( 'e' )
                    {
                    // InternalProblem.g:1397:2: ( 'e' )
                    // InternalProblem.g:1398:3: 'e'
                    {
                     before(grammarAccess.getIdentifierAccess().getEKeyword_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getIdentifierAccess().getEKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProblem.g:1403:2: ( 'E' )
                    {
                    // InternalProblem.g:1403:2: ( 'E' )
                    // InternalProblem.g:1404:3: 'E'
                    {
                     before(grammarAccess.getIdentifierAccess().getEKeyword_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getIdentifierAccess().getEKeyword_4()); 

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


    // $ANTLR start "rule__Real__Alternatives_2"
    // InternalProblem.g:1413:1: rule__Real__Alternatives_2 : ( ( ( rule__Real__Group_2_0__0 ) ) | ( ( rule__Real__Group_2_1__0 ) ) );
    public final void rule__Real__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1417:1: ( ( ( rule__Real__Group_2_0__0 ) ) | ( ( rule__Real__Group_2_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==12) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_INT) ) {
                    int LA18_3 = input.LA(3);

                    if ( ((LA18_3>=21 && LA18_3<=22)) ) {
                        alt18=2;
                    }
                    else if ( (LA18_3==EOF||(LA18_3>=12 && LA18_3<=13)||LA18_3==38) ) {
                        alt18=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA18_0>=21 && LA18_0<=22)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalProblem.g:1418:2: ( ( rule__Real__Group_2_0__0 ) )
                    {
                    // InternalProblem.g:1418:2: ( ( rule__Real__Group_2_0__0 ) )
                    // InternalProblem.g:1419:3: ( rule__Real__Group_2_0__0 )
                    {
                     before(grammarAccess.getRealAccess().getGroup_2_0()); 
                    // InternalProblem.g:1420:3: ( rule__Real__Group_2_0__0 )
                    // InternalProblem.g:1420:4: rule__Real__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Real__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRealAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1424:2: ( ( rule__Real__Group_2_1__0 ) )
                    {
                    // InternalProblem.g:1424:2: ( ( rule__Real__Group_2_1__0 ) )
                    // InternalProblem.g:1425:3: ( rule__Real__Group_2_1__0 )
                    {
                     before(grammarAccess.getRealAccess().getGroup_2_1()); 
                    // InternalProblem.g:1426:3: ( rule__Real__Group_2_1__0 )
                    // InternalProblem.g:1426:4: rule__Real__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Real__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRealAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Real__Alternatives_2"


    // $ANTLR start "rule__Real__Alternatives_2_1_1"
    // InternalProblem.g:1434:1: rule__Real__Alternatives_2_1_1 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__Real__Alternatives_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1438:1: ( ( 'e' ) | ( 'E' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            else if ( (LA19_0==22) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalProblem.g:1439:2: ( 'e' )
                    {
                    // InternalProblem.g:1439:2: ( 'e' )
                    // InternalProblem.g:1440:3: 'e'
                    {
                     before(grammarAccess.getRealAccess().getEKeyword_2_1_1_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getRealAccess().getEKeyword_2_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1445:2: ( 'E' )
                    {
                    // InternalProblem.g:1445:2: ( 'E' )
                    // InternalProblem.g:1446:3: 'E'
                    {
                     before(grammarAccess.getRealAccess().getEKeyword_2_1_1_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getRealAccess().getEKeyword_2_1_1_1()); 

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
    // $ANTLR end "rule__Real__Alternatives_2_1_1"


    // $ANTLR start "rule__Real__Alternatives_2_1_2"
    // InternalProblem.g:1455:1: rule__Real__Alternatives_2_1_2 : ( ( '-' ) | ( '+' ) );
    public final void rule__Real__Alternatives_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1459:1: ( ( '-' ) | ( '+' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            else if ( (LA20_0==24) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalProblem.g:1460:2: ( '-' )
                    {
                    // InternalProblem.g:1460:2: ( '-' )
                    // InternalProblem.g:1461:3: '-'
                    {
                     before(grammarAccess.getRealAccess().getHyphenMinusKeyword_2_1_2_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getRealAccess().getHyphenMinusKeyword_2_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1466:2: ( '+' )
                    {
                    // InternalProblem.g:1466:2: ( '+' )
                    // InternalProblem.g:1467:3: '+'
                    {
                     before(grammarAccess.getRealAccess().getPlusSignKeyword_2_1_2_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getRealAccess().getPlusSignKeyword_2_1_2_1()); 

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
    // $ANTLR end "rule__Real__Alternatives_2_1_2"


    // $ANTLR start "rule__LogicValue__Alternatives"
    // InternalProblem.g:1476:1: rule__LogicValue__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) | ( ( 'unknown' ) ) );
    public final void rule__LogicValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1480:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) | ( ( 'unknown' ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt21=1;
                }
                break;
            case 20:
                {
                alt21=2;
                }
                break;
            case 25:
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
                    // InternalProblem.g:1481:2: ( ( 'true' ) )
                    {
                    // InternalProblem.g:1481:2: ( ( 'true' ) )
                    // InternalProblem.g:1482:3: ( 'true' )
                    {
                     before(grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:1483:3: ( 'true' )
                    // InternalProblem.g:1483:4: 'true'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1487:2: ( ( 'false' ) )
                    {
                    // InternalProblem.g:1487:2: ( ( 'false' ) )
                    // InternalProblem.g:1488:3: ( 'false' )
                    {
                     before(grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:1489:3: ( 'false' )
                    // InternalProblem.g:1489:4: 'false'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:1493:2: ( ( 'unknown' ) )
                    {
                    // InternalProblem.g:1493:2: ( ( 'unknown' ) )
                    // InternalProblem.g:1494:3: ( 'unknown' )
                    {
                     before(grammarAccess.getLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_2()); 
                    // InternalProblem.g:1495:3: ( 'unknown' )
                    // InternalProblem.g:1495:4: 'unknown'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalProblem.g:1503:1: rule__ShortLogicValue__Alternatives : ( ( ( '!' ) ) | ( ( '?' ) ) );
    public final void rule__ShortLogicValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1507:1: ( ( ( '!' ) ) | ( ( '?' ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            else if ( (LA22_0==27) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalProblem.g:1508:2: ( ( '!' ) )
                    {
                    // InternalProblem.g:1508:2: ( ( '!' ) )
                    // InternalProblem.g:1509:3: ( '!' )
                    {
                     before(grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:1510:3: ( '!' )
                    // InternalProblem.g:1510:4: '!'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1514:2: ( ( '?' ) )
                    {
                    // InternalProblem.g:1514:2: ( ( '?' ) )
                    // InternalProblem.g:1515:3: ( '?' )
                    {
                     before(grammarAccess.getShortLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:1516:3: ( '?' )
                    // InternalProblem.g:1516:4: '?'
                    {
                    match(input,27,FOLLOW_2); 

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
    // InternalProblem.g:1524:1: rule__Problem__Group__0 : rule__Problem__Group__0__Impl rule__Problem__Group__1 ;
    public final void rule__Problem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1528:1: ( rule__Problem__Group__0__Impl rule__Problem__Group__1 )
            // InternalProblem.g:1529:2: rule__Problem__Group__0__Impl rule__Problem__Group__1
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
    // InternalProblem.g:1536:1: rule__Problem__Group__0__Impl : ( ( rule__Problem__Group_0__0 )? ) ;
    public final void rule__Problem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1540:1: ( ( ( rule__Problem__Group_0__0 )? ) )
            // InternalProblem.g:1541:1: ( ( rule__Problem__Group_0__0 )? )
            {
            // InternalProblem.g:1541:1: ( ( rule__Problem__Group_0__0 )? )
            // InternalProblem.g:1542:2: ( rule__Problem__Group_0__0 )?
            {
             before(grammarAccess.getProblemAccess().getGroup_0()); 
            // InternalProblem.g:1543:2: ( rule__Problem__Group_0__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalProblem.g:1543:3: rule__Problem__Group_0__0
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
    // InternalProblem.g:1551:1: rule__Problem__Group__1 : rule__Problem__Group__1__Impl ;
    public final void rule__Problem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1555:1: ( rule__Problem__Group__1__Impl )
            // InternalProblem.g:1556:2: rule__Problem__Group__1__Impl
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
    // InternalProblem.g:1562:1: rule__Problem__Group__1__Impl : ( ( rule__Problem__StatementsAssignment_1 )* ) ;
    public final void rule__Problem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1566:1: ( ( ( rule__Problem__StatementsAssignment_1 )* ) )
            // InternalProblem.g:1567:1: ( ( rule__Problem__StatementsAssignment_1 )* )
            {
            // InternalProblem.g:1567:1: ( ( rule__Problem__StatementsAssignment_1 )* )
            // InternalProblem.g:1568:2: ( rule__Problem__StatementsAssignment_1 )*
            {
             before(grammarAccess.getProblemAccess().getStatementsAssignment_1()); 
            // InternalProblem.g:1569:2: ( rule__Problem__StatementsAssignment_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_QUOTED_ID && LA24_0<=RULE_ID)||LA24_0==16||(LA24_0>=19 && LA24_0<=22)||(LA24_0>=26 && LA24_0<=27)||LA24_0==29||LA24_0==33||LA24_0==41||LA24_0==44||LA24_0==46) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalProblem.g:1569:3: rule__Problem__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Problem__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalProblem.g:1578:1: rule__Problem__Group_0__0 : rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1 ;
    public final void rule__Problem__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1582:1: ( rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1 )
            // InternalProblem.g:1583:2: rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1
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
    // InternalProblem.g:1590:1: rule__Problem__Group_0__0__Impl : ( 'problem' ) ;
    public final void rule__Problem__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1594:1: ( ( 'problem' ) )
            // InternalProblem.g:1595:1: ( 'problem' )
            {
            // InternalProblem.g:1595:1: ( 'problem' )
            // InternalProblem.g:1596:2: 'problem'
            {
             before(grammarAccess.getProblemAccess().getProblemKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalProblem.g:1605:1: rule__Problem__Group_0__1 : rule__Problem__Group_0__1__Impl rule__Problem__Group_0__2 ;
    public final void rule__Problem__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1609:1: ( rule__Problem__Group_0__1__Impl rule__Problem__Group_0__2 )
            // InternalProblem.g:1610:2: rule__Problem__Group_0__1__Impl rule__Problem__Group_0__2
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
    // InternalProblem.g:1617:1: rule__Problem__Group_0__1__Impl : ( ( rule__Problem__NameAssignment_0_1 ) ) ;
    public final void rule__Problem__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1621:1: ( ( ( rule__Problem__NameAssignment_0_1 ) ) )
            // InternalProblem.g:1622:1: ( ( rule__Problem__NameAssignment_0_1 ) )
            {
            // InternalProblem.g:1622:1: ( ( rule__Problem__NameAssignment_0_1 ) )
            // InternalProblem.g:1623:2: ( rule__Problem__NameAssignment_0_1 )
            {
             before(grammarAccess.getProblemAccess().getNameAssignment_0_1()); 
            // InternalProblem.g:1624:2: ( rule__Problem__NameAssignment_0_1 )
            // InternalProblem.g:1624:3: rule__Problem__NameAssignment_0_1
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
    // InternalProblem.g:1632:1: rule__Problem__Group_0__2 : rule__Problem__Group_0__2__Impl ;
    public final void rule__Problem__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1636:1: ( rule__Problem__Group_0__2__Impl )
            // InternalProblem.g:1637:2: rule__Problem__Group_0__2__Impl
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
    // InternalProblem.g:1643:1: rule__Problem__Group_0__2__Impl : ( '.' ) ;
    public final void rule__Problem__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1647:1: ( ( '.' ) )
            // InternalProblem.g:1648:1: ( '.' )
            {
            // InternalProblem.g:1648:1: ( '.' )
            // InternalProblem.g:1649:2: '.'
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
    // InternalProblem.g:1659:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1663:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalProblem.g:1664:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
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
    // InternalProblem.g:1671:1: rule__ClassDeclaration__Group__0__Impl : ( ( rule__ClassDeclaration__AbstractAssignment_0 )? ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1675:1: ( ( ( rule__ClassDeclaration__AbstractAssignment_0 )? ) )
            // InternalProblem.g:1676:1: ( ( rule__ClassDeclaration__AbstractAssignment_0 )? )
            {
            // InternalProblem.g:1676:1: ( ( rule__ClassDeclaration__AbstractAssignment_0 )? )
            // InternalProblem.g:1677:2: ( rule__ClassDeclaration__AbstractAssignment_0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getAbstractAssignment_0()); 
            // InternalProblem.g:1678:2: ( rule__ClassDeclaration__AbstractAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalProblem.g:1678:3: rule__ClassDeclaration__AbstractAssignment_0
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
    // InternalProblem.g:1686:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1690:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalProblem.g:1691:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
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
    // InternalProblem.g:1698:1: rule__ClassDeclaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1702:1: ( ( 'class' ) )
            // InternalProblem.g:1703:1: ( 'class' )
            {
            // InternalProblem.g:1703:1: ( 'class' )
            // InternalProblem.g:1704:2: 'class'
            {
             before(grammarAccess.getClassDeclarationAccess().getClassKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalProblem.g:1713:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1717:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalProblem.g:1718:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
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
    // InternalProblem.g:1725:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1729:1: ( ( ( rule__ClassDeclaration__NameAssignment_2 ) ) )
            // InternalProblem.g:1730:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            {
            // InternalProblem.g:1730:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            // InternalProblem.g:1731:2: ( rule__ClassDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 
            // InternalProblem.g:1732:2: ( rule__ClassDeclaration__NameAssignment_2 )
            // InternalProblem.g:1732:3: rule__ClassDeclaration__NameAssignment_2
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
    // InternalProblem.g:1740:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1744:1: ( rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 )
            // InternalProblem.g:1745:2: rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4
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
    // InternalProblem.g:1752:1: rule__ClassDeclaration__Group__3__Impl : ( ( rule__ClassDeclaration__Group_3__0 )? ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1756:1: ( ( ( rule__ClassDeclaration__Group_3__0 )? ) )
            // InternalProblem.g:1757:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            {
            // InternalProblem.g:1757:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            // InternalProblem.g:1758:2: ( rule__ClassDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3()); 
            // InternalProblem.g:1759:2: ( rule__ClassDeclaration__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProblem.g:1759:3: rule__ClassDeclaration__Group_3__0
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
    // InternalProblem.g:1767:1: rule__ClassDeclaration__Group__4 : rule__ClassDeclaration__Group__4__Impl ;
    public final void rule__ClassDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1771:1: ( rule__ClassDeclaration__Group__4__Impl )
            // InternalProblem.g:1772:2: rule__ClassDeclaration__Group__4__Impl
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
    // InternalProblem.g:1778:1: rule__ClassDeclaration__Group__4__Impl : ( ( rule__ClassDeclaration__Alternatives_4 ) ) ;
    public final void rule__ClassDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1782:1: ( ( ( rule__ClassDeclaration__Alternatives_4 ) ) )
            // InternalProblem.g:1783:1: ( ( rule__ClassDeclaration__Alternatives_4 ) )
            {
            // InternalProblem.g:1783:1: ( ( rule__ClassDeclaration__Alternatives_4 ) )
            // InternalProblem.g:1784:2: ( rule__ClassDeclaration__Alternatives_4 )
            {
             before(grammarAccess.getClassDeclarationAccess().getAlternatives_4()); 
            // InternalProblem.g:1785:2: ( rule__ClassDeclaration__Alternatives_4 )
            // InternalProblem.g:1785:3: rule__ClassDeclaration__Alternatives_4
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
    // InternalProblem.g:1794:1: rule__ClassDeclaration__Group_3__0 : rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 ;
    public final void rule__ClassDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1798:1: ( rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 )
            // InternalProblem.g:1799:2: rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1
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
    // InternalProblem.g:1806:1: rule__ClassDeclaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__ClassDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1810:1: ( ( 'extends' ) )
            // InternalProblem.g:1811:1: ( 'extends' )
            {
            // InternalProblem.g:1811:1: ( 'extends' )
            // InternalProblem.g:1812:2: 'extends'
            {
             before(grammarAccess.getClassDeclarationAccess().getExtendsKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalProblem.g:1821:1: rule__ClassDeclaration__Group_3__1 : rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 ;
    public final void rule__ClassDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1825:1: ( rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 )
            // InternalProblem.g:1826:2: rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2
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
    // InternalProblem.g:1833:1: rule__ClassDeclaration__Group_3__1__Impl : ( ( rule__ClassDeclaration__SuperTypesAssignment_3_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1837:1: ( ( ( rule__ClassDeclaration__SuperTypesAssignment_3_1 ) ) )
            // InternalProblem.g:1838:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_1 ) )
            {
            // InternalProblem.g:1838:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_1 ) )
            // InternalProblem.g:1839:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesAssignment_3_1()); 
            // InternalProblem.g:1840:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_1 )
            // InternalProblem.g:1840:3: rule__ClassDeclaration__SuperTypesAssignment_3_1
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
    // InternalProblem.g:1848:1: rule__ClassDeclaration__Group_3__2 : rule__ClassDeclaration__Group_3__2__Impl ;
    public final void rule__ClassDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1852:1: ( rule__ClassDeclaration__Group_3__2__Impl )
            // InternalProblem.g:1853:2: rule__ClassDeclaration__Group_3__2__Impl
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
    // InternalProblem.g:1859:1: rule__ClassDeclaration__Group_3__2__Impl : ( ( rule__ClassDeclaration__Group_3_2__0 )* ) ;
    public final void rule__ClassDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1863:1: ( ( ( rule__ClassDeclaration__Group_3_2__0 )* ) )
            // InternalProblem.g:1864:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            {
            // InternalProblem.g:1864:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            // InternalProblem.g:1865:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3_2()); 
            // InternalProblem.g:1866:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==13) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalProblem.g:1866:3: rule__ClassDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ClassDeclaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalProblem.g:1875:1: rule__ClassDeclaration__Group_3_2__0 : rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 ;
    public final void rule__ClassDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1879:1: ( rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 )
            // InternalProblem.g:1880:2: rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1
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
    // InternalProblem.g:1887:1: rule__ClassDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1891:1: ( ( ',' ) )
            // InternalProblem.g:1892:1: ( ',' )
            {
            // InternalProblem.g:1892:1: ( ',' )
            // InternalProblem.g:1893:2: ','
            {
             before(grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalProblem.g:1902:1: rule__ClassDeclaration__Group_3_2__1 : rule__ClassDeclaration__Group_3_2__1__Impl ;
    public final void rule__ClassDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1906:1: ( rule__ClassDeclaration__Group_3_2__1__Impl )
            // InternalProblem.g:1907:2: rule__ClassDeclaration__Group_3_2__1__Impl
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
    // InternalProblem.g:1913:1: rule__ClassDeclaration__Group_3_2__1__Impl : ( ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1917:1: ( ( ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 ) ) )
            // InternalProblem.g:1918:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 ) )
            {
            // InternalProblem.g:1918:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 ) )
            // InternalProblem.g:1919:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesAssignment_3_2_1()); 
            // InternalProblem.g:1920:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 )
            // InternalProblem.g:1920:3: rule__ClassDeclaration__SuperTypesAssignment_3_2_1
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
    // InternalProblem.g:1929:1: rule__ClassDeclaration__Group_4_0__0 : rule__ClassDeclaration__Group_4_0__0__Impl rule__ClassDeclaration__Group_4_0__1 ;
    public final void rule__ClassDeclaration__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1933:1: ( rule__ClassDeclaration__Group_4_0__0__Impl rule__ClassDeclaration__Group_4_0__1 )
            // InternalProblem.g:1934:2: rule__ClassDeclaration__Group_4_0__0__Impl rule__ClassDeclaration__Group_4_0__1
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
    // InternalProblem.g:1941:1: rule__ClassDeclaration__Group_4_0__0__Impl : ( '{' ) ;
    public final void rule__ClassDeclaration__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1945:1: ( ( '{' ) )
            // InternalProblem.g:1946:1: ( '{' )
            {
            // InternalProblem.g:1946:1: ( '{' )
            // InternalProblem.g:1947:2: '{'
            {
             before(grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_4_0_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalProblem.g:1956:1: rule__ClassDeclaration__Group_4_0__1 : rule__ClassDeclaration__Group_4_0__1__Impl rule__ClassDeclaration__Group_4_0__2 ;
    public final void rule__ClassDeclaration__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1960:1: ( rule__ClassDeclaration__Group_4_0__1__Impl rule__ClassDeclaration__Group_4_0__2 )
            // InternalProblem.g:1961:2: rule__ClassDeclaration__Group_4_0__1__Impl rule__ClassDeclaration__Group_4_0__2
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
    // InternalProblem.g:1968:1: rule__ClassDeclaration__Group_4_0__1__Impl : ( ( rule__ClassDeclaration__Group_4_0_1__0 )* ) ;
    public final void rule__ClassDeclaration__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1972:1: ( ( ( rule__ClassDeclaration__Group_4_0_1__0 )* ) )
            // InternalProblem.g:1973:1: ( ( rule__ClassDeclaration__Group_4_0_1__0 )* )
            {
            // InternalProblem.g:1973:1: ( ( rule__ClassDeclaration__Group_4_0_1__0 )* )
            // InternalProblem.g:1974:2: ( rule__ClassDeclaration__Group_4_0_1__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_4_0_1()); 
            // InternalProblem.g:1975:2: ( rule__ClassDeclaration__Group_4_0_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_QUOTED_ID && LA28_0<=RULE_ID)||LA28_0==15||(LA28_0>=19 && LA28_0<=22)||LA28_0==45) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalProblem.g:1975:3: rule__ClassDeclaration__Group_4_0_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ClassDeclaration__Group_4_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalProblem.g:1983:1: rule__ClassDeclaration__Group_4_0__2 : rule__ClassDeclaration__Group_4_0__2__Impl ;
    public final void rule__ClassDeclaration__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1987:1: ( rule__ClassDeclaration__Group_4_0__2__Impl )
            // InternalProblem.g:1988:2: rule__ClassDeclaration__Group_4_0__2__Impl
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
    // InternalProblem.g:1994:1: rule__ClassDeclaration__Group_4_0__2__Impl : ( '}' ) ;
    public final void rule__ClassDeclaration__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1998:1: ( ( '}' ) )
            // InternalProblem.g:1999:1: ( '}' )
            {
            // InternalProblem.g:1999:1: ( '}' )
            // InternalProblem.g:2000:2: '}'
            {
             before(grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_4_0_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalProblem.g:2010:1: rule__ClassDeclaration__Group_4_0_1__0 : rule__ClassDeclaration__Group_4_0_1__0__Impl rule__ClassDeclaration__Group_4_0_1__1 ;
    public final void rule__ClassDeclaration__Group_4_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2014:1: ( rule__ClassDeclaration__Group_4_0_1__0__Impl rule__ClassDeclaration__Group_4_0_1__1 )
            // InternalProblem.g:2015:2: rule__ClassDeclaration__Group_4_0_1__0__Impl rule__ClassDeclaration__Group_4_0_1__1
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
    // InternalProblem.g:2022:1: rule__ClassDeclaration__Group_4_0_1__0__Impl : ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 ) ) ;
    public final void rule__ClassDeclaration__Group_4_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2026:1: ( ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 ) ) )
            // InternalProblem.g:2027:1: ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 ) )
            {
            // InternalProblem.g:2027:1: ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 ) )
            // InternalProblem.g:2028:2: ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsAssignment_4_0_1_0()); 
            // InternalProblem.g:2029:2: ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 )
            // InternalProblem.g:2029:3: rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0
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
    // InternalProblem.g:2037:1: rule__ClassDeclaration__Group_4_0_1__1 : rule__ClassDeclaration__Group_4_0_1__1__Impl ;
    public final void rule__ClassDeclaration__Group_4_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2041:1: ( rule__ClassDeclaration__Group_4_0_1__1__Impl )
            // InternalProblem.g:2042:2: rule__ClassDeclaration__Group_4_0_1__1__Impl
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
    // InternalProblem.g:2048:1: rule__ClassDeclaration__Group_4_0_1__1__Impl : ( ( ';' )? ) ;
    public final void rule__ClassDeclaration__Group_4_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2052:1: ( ( ( ';' )? ) )
            // InternalProblem.g:2053:1: ( ( ';' )? )
            {
            // InternalProblem.g:2053:1: ( ( ';' )? )
            // InternalProblem.g:2054:2: ( ';' )?
            {
             before(grammarAccess.getClassDeclarationAccess().getSemicolonKeyword_4_0_1_1()); 
            // InternalProblem.g:2055:2: ( ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==14) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalProblem.g:2055:3: ';'
                    {
                    match(input,14,FOLLOW_2); 

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
    // InternalProblem.g:2064:1: rule__EnumDeclaration__Group__0 : rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 ;
    public final void rule__EnumDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2068:1: ( rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 )
            // InternalProblem.g:2069:2: rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1
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
    // InternalProblem.g:2076:1: rule__EnumDeclaration__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2080:1: ( ( 'enum' ) )
            // InternalProblem.g:2081:1: ( 'enum' )
            {
            // InternalProblem.g:2081:1: ( 'enum' )
            // InternalProblem.g:2082:2: 'enum'
            {
             before(grammarAccess.getEnumDeclarationAccess().getEnumKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalProblem.g:2091:1: rule__EnumDeclaration__Group__1 : rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 ;
    public final void rule__EnumDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2095:1: ( rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 )
            // InternalProblem.g:2096:2: rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2
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
    // InternalProblem.g:2103:1: rule__EnumDeclaration__Group__1__Impl : ( ( rule__EnumDeclaration__NameAssignment_1 ) ) ;
    public final void rule__EnumDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2107:1: ( ( ( rule__EnumDeclaration__NameAssignment_1 ) ) )
            // InternalProblem.g:2108:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            {
            // InternalProblem.g:2108:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            // InternalProblem.g:2109:2: ( rule__EnumDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 
            // InternalProblem.g:2110:2: ( rule__EnumDeclaration__NameAssignment_1 )
            // InternalProblem.g:2110:3: rule__EnumDeclaration__NameAssignment_1
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
    // InternalProblem.g:2118:1: rule__EnumDeclaration__Group__2 : rule__EnumDeclaration__Group__2__Impl ;
    public final void rule__EnumDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2122:1: ( rule__EnumDeclaration__Group__2__Impl )
            // InternalProblem.g:2123:2: rule__EnumDeclaration__Group__2__Impl
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
    // InternalProblem.g:2129:1: rule__EnumDeclaration__Group__2__Impl : ( ( rule__EnumDeclaration__Alternatives_2 ) ) ;
    public final void rule__EnumDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2133:1: ( ( ( rule__EnumDeclaration__Alternatives_2 ) ) )
            // InternalProblem.g:2134:1: ( ( rule__EnumDeclaration__Alternatives_2 ) )
            {
            // InternalProblem.g:2134:1: ( ( rule__EnumDeclaration__Alternatives_2 ) )
            // InternalProblem.g:2135:2: ( rule__EnumDeclaration__Alternatives_2 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getAlternatives_2()); 
            // InternalProblem.g:2136:2: ( rule__EnumDeclaration__Alternatives_2 )
            // InternalProblem.g:2136:3: rule__EnumDeclaration__Alternatives_2
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
    // InternalProblem.g:2145:1: rule__EnumDeclaration__Group_2_0__0 : rule__EnumDeclaration__Group_2_0__0__Impl rule__EnumDeclaration__Group_2_0__1 ;
    public final void rule__EnumDeclaration__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2149:1: ( rule__EnumDeclaration__Group_2_0__0__Impl rule__EnumDeclaration__Group_2_0__1 )
            // InternalProblem.g:2150:2: rule__EnumDeclaration__Group_2_0__0__Impl rule__EnumDeclaration__Group_2_0__1
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
    // InternalProblem.g:2157:1: rule__EnumDeclaration__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__EnumDeclaration__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2161:1: ( ( '{' ) )
            // InternalProblem.g:2162:1: ( '{' )
            {
            // InternalProblem.g:2162:1: ( '{' )
            // InternalProblem.g:2163:2: '{'
            {
             before(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalProblem.g:2172:1: rule__EnumDeclaration__Group_2_0__1 : rule__EnumDeclaration__Group_2_0__1__Impl rule__EnumDeclaration__Group_2_0__2 ;
    public final void rule__EnumDeclaration__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2176:1: ( rule__EnumDeclaration__Group_2_0__1__Impl rule__EnumDeclaration__Group_2_0__2 )
            // InternalProblem.g:2177:2: rule__EnumDeclaration__Group_2_0__1__Impl rule__EnumDeclaration__Group_2_0__2
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
    // InternalProblem.g:2184:1: rule__EnumDeclaration__Group_2_0__1__Impl : ( ( rule__EnumDeclaration__Group_2_0_1__0 )? ) ;
    public final void rule__EnumDeclaration__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2188:1: ( ( ( rule__EnumDeclaration__Group_2_0_1__0 )? ) )
            // InternalProblem.g:2189:1: ( ( rule__EnumDeclaration__Group_2_0_1__0 )? )
            {
            // InternalProblem.g:2189:1: ( ( rule__EnumDeclaration__Group_2_0_1__0 )? )
            // InternalProblem.g:2190:2: ( rule__EnumDeclaration__Group_2_0_1__0 )?
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup_2_0_1()); 
            // InternalProblem.g:2191:2: ( rule__EnumDeclaration__Group_2_0_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||(LA30_0>=19 && LA30_0<=22)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalProblem.g:2191:3: rule__EnumDeclaration__Group_2_0_1__0
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
    // InternalProblem.g:2199:1: rule__EnumDeclaration__Group_2_0__2 : rule__EnumDeclaration__Group_2_0__2__Impl ;
    public final void rule__EnumDeclaration__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2203:1: ( rule__EnumDeclaration__Group_2_0__2__Impl )
            // InternalProblem.g:2204:2: rule__EnumDeclaration__Group_2_0__2__Impl
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
    // InternalProblem.g:2210:1: rule__EnumDeclaration__Group_2_0__2__Impl : ( '}' ) ;
    public final void rule__EnumDeclaration__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2214:1: ( ( '}' ) )
            // InternalProblem.g:2215:1: ( '}' )
            {
            // InternalProblem.g:2215:1: ( '}' )
            // InternalProblem.g:2216:2: '}'
            {
             before(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_2_0_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalProblem.g:2226:1: rule__EnumDeclaration__Group_2_0_1__0 : rule__EnumDeclaration__Group_2_0_1__0__Impl rule__EnumDeclaration__Group_2_0_1__1 ;
    public final void rule__EnumDeclaration__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2230:1: ( rule__EnumDeclaration__Group_2_0_1__0__Impl rule__EnumDeclaration__Group_2_0_1__1 )
            // InternalProblem.g:2231:2: rule__EnumDeclaration__Group_2_0_1__0__Impl rule__EnumDeclaration__Group_2_0_1__1
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
    // InternalProblem.g:2238:1: rule__EnumDeclaration__Group_2_0_1__0__Impl : ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 ) ) ;
    public final void rule__EnumDeclaration__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2242:1: ( ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 ) ) )
            // InternalProblem.g:2243:1: ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 ) )
            {
            // InternalProblem.g:2243:1: ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 ) )
            // InternalProblem.g:2244:2: ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getLiteralsAssignment_2_0_1_0()); 
            // InternalProblem.g:2245:2: ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 )
            // InternalProblem.g:2245:3: rule__EnumDeclaration__LiteralsAssignment_2_0_1_0
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
    // InternalProblem.g:2253:1: rule__EnumDeclaration__Group_2_0_1__1 : rule__EnumDeclaration__Group_2_0_1__1__Impl rule__EnumDeclaration__Group_2_0_1__2 ;
    public final void rule__EnumDeclaration__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2257:1: ( rule__EnumDeclaration__Group_2_0_1__1__Impl rule__EnumDeclaration__Group_2_0_1__2 )
            // InternalProblem.g:2258:2: rule__EnumDeclaration__Group_2_0_1__1__Impl rule__EnumDeclaration__Group_2_0_1__2
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
    // InternalProblem.g:2265:1: rule__EnumDeclaration__Group_2_0_1__1__Impl : ( ( rule__EnumDeclaration__Group_2_0_1_1__0 )* ) ;
    public final void rule__EnumDeclaration__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2269:1: ( ( ( rule__EnumDeclaration__Group_2_0_1_1__0 )* ) )
            // InternalProblem.g:2270:1: ( ( rule__EnumDeclaration__Group_2_0_1_1__0 )* )
            {
            // InternalProblem.g:2270:1: ( ( rule__EnumDeclaration__Group_2_0_1_1__0 )* )
            // InternalProblem.g:2271:2: ( rule__EnumDeclaration__Group_2_0_1_1__0 )*
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup_2_0_1_1()); 
            // InternalProblem.g:2272:2: ( rule__EnumDeclaration__Group_2_0_1_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==13) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==RULE_ID||(LA31_1>=19 && LA31_1<=22)) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalProblem.g:2272:3: rule__EnumDeclaration__Group_2_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__EnumDeclaration__Group_2_0_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalProblem.g:2280:1: rule__EnumDeclaration__Group_2_0_1__2 : rule__EnumDeclaration__Group_2_0_1__2__Impl ;
    public final void rule__EnumDeclaration__Group_2_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2284:1: ( rule__EnumDeclaration__Group_2_0_1__2__Impl )
            // InternalProblem.g:2285:2: rule__EnumDeclaration__Group_2_0_1__2__Impl
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
    // InternalProblem.g:2291:1: rule__EnumDeclaration__Group_2_0_1__2__Impl : ( ( rule__EnumDeclaration__Alternatives_2_0_1_2 )? ) ;
    public final void rule__EnumDeclaration__Group_2_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2295:1: ( ( ( rule__EnumDeclaration__Alternatives_2_0_1_2 )? ) )
            // InternalProblem.g:2296:1: ( ( rule__EnumDeclaration__Alternatives_2_0_1_2 )? )
            {
            // InternalProblem.g:2296:1: ( ( rule__EnumDeclaration__Alternatives_2_0_1_2 )? )
            // InternalProblem.g:2297:2: ( rule__EnumDeclaration__Alternatives_2_0_1_2 )?
            {
             before(grammarAccess.getEnumDeclarationAccess().getAlternatives_2_0_1_2()); 
            // InternalProblem.g:2298:2: ( rule__EnumDeclaration__Alternatives_2_0_1_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=13 && LA32_0<=14)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalProblem.g:2298:3: rule__EnumDeclaration__Alternatives_2_0_1_2
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
    // InternalProblem.g:2307:1: rule__EnumDeclaration__Group_2_0_1_1__0 : rule__EnumDeclaration__Group_2_0_1_1__0__Impl rule__EnumDeclaration__Group_2_0_1_1__1 ;
    public final void rule__EnumDeclaration__Group_2_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2311:1: ( rule__EnumDeclaration__Group_2_0_1_1__0__Impl rule__EnumDeclaration__Group_2_0_1_1__1 )
            // InternalProblem.g:2312:2: rule__EnumDeclaration__Group_2_0_1_1__0__Impl rule__EnumDeclaration__Group_2_0_1_1__1
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
    // InternalProblem.g:2319:1: rule__EnumDeclaration__Group_2_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__EnumDeclaration__Group_2_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2323:1: ( ( ',' ) )
            // InternalProblem.g:2324:1: ( ',' )
            {
            // InternalProblem.g:2324:1: ( ',' )
            // InternalProblem.g:2325:2: ','
            {
             before(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_2_0_1_1_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalProblem.g:2334:1: rule__EnumDeclaration__Group_2_0_1_1__1 : rule__EnumDeclaration__Group_2_0_1_1__1__Impl ;
    public final void rule__EnumDeclaration__Group_2_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2338:1: ( rule__EnumDeclaration__Group_2_0_1_1__1__Impl )
            // InternalProblem.g:2339:2: rule__EnumDeclaration__Group_2_0_1_1__1__Impl
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
    // InternalProblem.g:2345:1: rule__EnumDeclaration__Group_2_0_1_1__1__Impl : ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 ) ) ;
    public final void rule__EnumDeclaration__Group_2_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2349:1: ( ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 ) ) )
            // InternalProblem.g:2350:1: ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 ) )
            {
            // InternalProblem.g:2350:1: ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 ) )
            // InternalProblem.g:2351:2: ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getLiteralsAssignment_2_0_1_1_1()); 
            // InternalProblem.g:2352:2: ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 )
            // InternalProblem.g:2352:3: rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1
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
    // InternalProblem.g:2361:1: rule__ReferenceDeclaration__Group__0 : rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1 ;
    public final void rule__ReferenceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2365:1: ( rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1 )
            // InternalProblem.g:2366:2: rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1
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
    // InternalProblem.g:2373:1: rule__ReferenceDeclaration__Group__0__Impl : ( ( rule__ReferenceDeclaration__Alternatives_0 )? ) ;
    public final void rule__ReferenceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2377:1: ( ( ( rule__ReferenceDeclaration__Alternatives_0 )? ) )
            // InternalProblem.g:2378:1: ( ( rule__ReferenceDeclaration__Alternatives_0 )? )
            {
            // InternalProblem.g:2378:1: ( ( rule__ReferenceDeclaration__Alternatives_0 )? )
            // InternalProblem.g:2379:2: ( rule__ReferenceDeclaration__Alternatives_0 )?
            {
             before(grammarAccess.getReferenceDeclarationAccess().getAlternatives_0()); 
            // InternalProblem.g:2380:2: ( rule__ReferenceDeclaration__Alternatives_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==15||LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalProblem.g:2380:3: rule__ReferenceDeclaration__Alternatives_0
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
    // InternalProblem.g:2388:1: rule__ReferenceDeclaration__Group__1 : rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2 ;
    public final void rule__ReferenceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2392:1: ( rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2 )
            // InternalProblem.g:2393:2: rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2
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
    // InternalProblem.g:2400:1: rule__ReferenceDeclaration__Group__1__Impl : ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) ) ;
    public final void rule__ReferenceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2404:1: ( ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) ) )
            // InternalProblem.g:2405:1: ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) )
            {
            // InternalProblem.g:2405:1: ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) )
            // InternalProblem.g:2406:2: ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeAssignment_1()); 
            // InternalProblem.g:2407:2: ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 )
            // InternalProblem.g:2407:3: rule__ReferenceDeclaration__ReferenceTypeAssignment_1
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
    // InternalProblem.g:2415:1: rule__ReferenceDeclaration__Group__2 : rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3 ;
    public final void rule__ReferenceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2419:1: ( rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3 )
            // InternalProblem.g:2420:2: rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3
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
    // InternalProblem.g:2427:1: rule__ReferenceDeclaration__Group__2__Impl : ( ( rule__ReferenceDeclaration__Group_2__0 )? ) ;
    public final void rule__ReferenceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2431:1: ( ( ( rule__ReferenceDeclaration__Group_2__0 )? ) )
            // InternalProblem.g:2432:1: ( ( rule__ReferenceDeclaration__Group_2__0 )? )
            {
            // InternalProblem.g:2432:1: ( ( rule__ReferenceDeclaration__Group_2__0 )? )
            // InternalProblem.g:2433:2: ( rule__ReferenceDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getReferenceDeclarationAccess().getGroup_2()); 
            // InternalProblem.g:2434:2: ( rule__ReferenceDeclaration__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalProblem.g:2434:3: rule__ReferenceDeclaration__Group_2__0
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
    // InternalProblem.g:2442:1: rule__ReferenceDeclaration__Group__3 : rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4 ;
    public final void rule__ReferenceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2446:1: ( rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4 )
            // InternalProblem.g:2447:2: rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4
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
    // InternalProblem.g:2454:1: rule__ReferenceDeclaration__Group__3__Impl : ( ( rule__ReferenceDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ReferenceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2458:1: ( ( ( rule__ReferenceDeclaration__NameAssignment_3 ) ) )
            // InternalProblem.g:2459:1: ( ( rule__ReferenceDeclaration__NameAssignment_3 ) )
            {
            // InternalProblem.g:2459:1: ( ( rule__ReferenceDeclaration__NameAssignment_3 ) )
            // InternalProblem.g:2460:2: ( rule__ReferenceDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getNameAssignment_3()); 
            // InternalProblem.g:2461:2: ( rule__ReferenceDeclaration__NameAssignment_3 )
            // InternalProblem.g:2461:3: rule__ReferenceDeclaration__NameAssignment_3
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
    // InternalProblem.g:2469:1: rule__ReferenceDeclaration__Group__4 : rule__ReferenceDeclaration__Group__4__Impl ;
    public final void rule__ReferenceDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2473:1: ( rule__ReferenceDeclaration__Group__4__Impl )
            // InternalProblem.g:2474:2: rule__ReferenceDeclaration__Group__4__Impl
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
    // InternalProblem.g:2480:1: rule__ReferenceDeclaration__Group__4__Impl : ( ( rule__ReferenceDeclaration__Group_4__0 )? ) ;
    public final void rule__ReferenceDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2484:1: ( ( ( rule__ReferenceDeclaration__Group_4__0 )? ) )
            // InternalProblem.g:2485:1: ( ( rule__ReferenceDeclaration__Group_4__0 )? )
            {
            // InternalProblem.g:2485:1: ( ( rule__ReferenceDeclaration__Group_4__0 )? )
            // InternalProblem.g:2486:2: ( rule__ReferenceDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getReferenceDeclarationAccess().getGroup_4()); 
            // InternalProblem.g:2487:2: ( rule__ReferenceDeclaration__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalProblem.g:2487:3: rule__ReferenceDeclaration__Group_4__0
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
    // InternalProblem.g:2496:1: rule__ReferenceDeclaration__Group_2__0 : rule__ReferenceDeclaration__Group_2__0__Impl rule__ReferenceDeclaration__Group_2__1 ;
    public final void rule__ReferenceDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2500:1: ( rule__ReferenceDeclaration__Group_2__0__Impl rule__ReferenceDeclaration__Group_2__1 )
            // InternalProblem.g:2501:2: rule__ReferenceDeclaration__Group_2__0__Impl rule__ReferenceDeclaration__Group_2__1
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
    // InternalProblem.g:2508:1: rule__ReferenceDeclaration__Group_2__0__Impl : ( '[' ) ;
    public final void rule__ReferenceDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2512:1: ( ( '[' ) )
            // InternalProblem.g:2513:1: ( '[' )
            {
            // InternalProblem.g:2513:1: ( '[' )
            // InternalProblem.g:2514:2: '['
            {
             before(grammarAccess.getReferenceDeclarationAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalProblem.g:2523:1: rule__ReferenceDeclaration__Group_2__1 : rule__ReferenceDeclaration__Group_2__1__Impl rule__ReferenceDeclaration__Group_2__2 ;
    public final void rule__ReferenceDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2527:1: ( rule__ReferenceDeclaration__Group_2__1__Impl rule__ReferenceDeclaration__Group_2__2 )
            // InternalProblem.g:2528:2: rule__ReferenceDeclaration__Group_2__1__Impl rule__ReferenceDeclaration__Group_2__2
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
    // InternalProblem.g:2535:1: rule__ReferenceDeclaration__Group_2__1__Impl : ( ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 ) ) ;
    public final void rule__ReferenceDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2539:1: ( ( ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 ) ) )
            // InternalProblem.g:2540:1: ( ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 ) )
            {
            // InternalProblem.g:2540:1: ( ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 ) )
            // InternalProblem.g:2541:2: ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getMultiplicityAssignment_2_1()); 
            // InternalProblem.g:2542:2: ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 )
            // InternalProblem.g:2542:3: rule__ReferenceDeclaration__MultiplicityAssignment_2_1
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
    // InternalProblem.g:2550:1: rule__ReferenceDeclaration__Group_2__2 : rule__ReferenceDeclaration__Group_2__2__Impl ;
    public final void rule__ReferenceDeclaration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2554:1: ( rule__ReferenceDeclaration__Group_2__2__Impl )
            // InternalProblem.g:2555:2: rule__ReferenceDeclaration__Group_2__2__Impl
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
    // InternalProblem.g:2561:1: rule__ReferenceDeclaration__Group_2__2__Impl : ( ']' ) ;
    public final void rule__ReferenceDeclaration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2565:1: ( ( ']' ) )
            // InternalProblem.g:2566:1: ( ']' )
            {
            // InternalProblem.g:2566:1: ( ']' )
            // InternalProblem.g:2567:2: ']'
            {
             before(grammarAccess.getReferenceDeclarationAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalProblem.g:2577:1: rule__ReferenceDeclaration__Group_4__0 : rule__ReferenceDeclaration__Group_4__0__Impl rule__ReferenceDeclaration__Group_4__1 ;
    public final void rule__ReferenceDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2581:1: ( rule__ReferenceDeclaration__Group_4__0__Impl rule__ReferenceDeclaration__Group_4__1 )
            // InternalProblem.g:2582:2: rule__ReferenceDeclaration__Group_4__0__Impl rule__ReferenceDeclaration__Group_4__1
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
    // InternalProblem.g:2589:1: rule__ReferenceDeclaration__Group_4__0__Impl : ( 'opposite' ) ;
    public final void rule__ReferenceDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2593:1: ( ( 'opposite' ) )
            // InternalProblem.g:2594:1: ( 'opposite' )
            {
            // InternalProblem.g:2594:1: ( 'opposite' )
            // InternalProblem.g:2595:2: 'opposite'
            {
             before(grammarAccess.getReferenceDeclarationAccess().getOppositeKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalProblem.g:2604:1: rule__ReferenceDeclaration__Group_4__1 : rule__ReferenceDeclaration__Group_4__1__Impl ;
    public final void rule__ReferenceDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2608:1: ( rule__ReferenceDeclaration__Group_4__1__Impl )
            // InternalProblem.g:2609:2: rule__ReferenceDeclaration__Group_4__1__Impl
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
    // InternalProblem.g:2615:1: rule__ReferenceDeclaration__Group_4__1__Impl : ( ( rule__ReferenceDeclaration__OppositeAssignment_4_1 ) ) ;
    public final void rule__ReferenceDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2619:1: ( ( ( rule__ReferenceDeclaration__OppositeAssignment_4_1 ) ) )
            // InternalProblem.g:2620:1: ( ( rule__ReferenceDeclaration__OppositeAssignment_4_1 ) )
            {
            // InternalProblem.g:2620:1: ( ( rule__ReferenceDeclaration__OppositeAssignment_4_1 ) )
            // InternalProblem.g:2621:2: ( rule__ReferenceDeclaration__OppositeAssignment_4_1 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getOppositeAssignment_4_1()); 
            // InternalProblem.g:2622:2: ( rule__ReferenceDeclaration__OppositeAssignment_4_1 )
            // InternalProblem.g:2622:3: rule__ReferenceDeclaration__OppositeAssignment_4_1
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
    // InternalProblem.g:2631:1: rule__PredicateDefinition__Group__0 : rule__PredicateDefinition__Group__0__Impl rule__PredicateDefinition__Group__1 ;
    public final void rule__PredicateDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2635:1: ( rule__PredicateDefinition__Group__0__Impl rule__PredicateDefinition__Group__1 )
            // InternalProblem.g:2636:2: rule__PredicateDefinition__Group__0__Impl rule__PredicateDefinition__Group__1
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
    // InternalProblem.g:2643:1: rule__PredicateDefinition__Group__0__Impl : ( ( rule__PredicateDefinition__Alternatives_0 ) ) ;
    public final void rule__PredicateDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2647:1: ( ( ( rule__PredicateDefinition__Alternatives_0 ) ) )
            // InternalProblem.g:2648:1: ( ( rule__PredicateDefinition__Alternatives_0 ) )
            {
            // InternalProblem.g:2648:1: ( ( rule__PredicateDefinition__Alternatives_0 ) )
            // InternalProblem.g:2649:2: ( rule__PredicateDefinition__Alternatives_0 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getAlternatives_0()); 
            // InternalProblem.g:2650:2: ( rule__PredicateDefinition__Alternatives_0 )
            // InternalProblem.g:2650:3: rule__PredicateDefinition__Alternatives_0
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
    // InternalProblem.g:2658:1: rule__PredicateDefinition__Group__1 : rule__PredicateDefinition__Group__1__Impl rule__PredicateDefinition__Group__2 ;
    public final void rule__PredicateDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2662:1: ( rule__PredicateDefinition__Group__1__Impl rule__PredicateDefinition__Group__2 )
            // InternalProblem.g:2663:2: rule__PredicateDefinition__Group__1__Impl rule__PredicateDefinition__Group__2
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
    // InternalProblem.g:2670:1: rule__PredicateDefinition__Group__1__Impl : ( ( rule__PredicateDefinition__NameAssignment_1 ) ) ;
    public final void rule__PredicateDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2674:1: ( ( ( rule__PredicateDefinition__NameAssignment_1 ) ) )
            // InternalProblem.g:2675:1: ( ( rule__PredicateDefinition__NameAssignment_1 ) )
            {
            // InternalProblem.g:2675:1: ( ( rule__PredicateDefinition__NameAssignment_1 ) )
            // InternalProblem.g:2676:2: ( rule__PredicateDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getNameAssignment_1()); 
            // InternalProblem.g:2677:2: ( rule__PredicateDefinition__NameAssignment_1 )
            // InternalProblem.g:2677:3: rule__PredicateDefinition__NameAssignment_1
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
    // InternalProblem.g:2685:1: rule__PredicateDefinition__Group__2 : rule__PredicateDefinition__Group__2__Impl rule__PredicateDefinition__Group__3 ;
    public final void rule__PredicateDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2689:1: ( rule__PredicateDefinition__Group__2__Impl rule__PredicateDefinition__Group__3 )
            // InternalProblem.g:2690:2: rule__PredicateDefinition__Group__2__Impl rule__PredicateDefinition__Group__3
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
    // InternalProblem.g:2697:1: rule__PredicateDefinition__Group__2__Impl : ( '(' ) ;
    public final void rule__PredicateDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2701:1: ( ( '(' ) )
            // InternalProblem.g:2702:1: ( '(' )
            {
            // InternalProblem.g:2702:1: ( '(' )
            // InternalProblem.g:2703:2: '('
            {
             before(grammarAccess.getPredicateDefinitionAccess().getLeftParenthesisKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalProblem.g:2712:1: rule__PredicateDefinition__Group__3 : rule__PredicateDefinition__Group__3__Impl rule__PredicateDefinition__Group__4 ;
    public final void rule__PredicateDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2716:1: ( rule__PredicateDefinition__Group__3__Impl rule__PredicateDefinition__Group__4 )
            // InternalProblem.g:2717:2: rule__PredicateDefinition__Group__3__Impl rule__PredicateDefinition__Group__4
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
    // InternalProblem.g:2724:1: rule__PredicateDefinition__Group__3__Impl : ( ( rule__PredicateDefinition__Group_3__0 )? ) ;
    public final void rule__PredicateDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2728:1: ( ( ( rule__PredicateDefinition__Group_3__0 )? ) )
            // InternalProblem.g:2729:1: ( ( rule__PredicateDefinition__Group_3__0 )? )
            {
            // InternalProblem.g:2729:1: ( ( rule__PredicateDefinition__Group_3__0 )? )
            // InternalProblem.g:2730:2: ( rule__PredicateDefinition__Group_3__0 )?
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_3()); 
            // InternalProblem.g:2731:2: ( rule__PredicateDefinition__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_QUOTED_ID && LA36_0<=RULE_ID)||(LA36_0>=19 && LA36_0<=22)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalProblem.g:2731:3: rule__PredicateDefinition__Group_3__0
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
    // InternalProblem.g:2739:1: rule__PredicateDefinition__Group__4 : rule__PredicateDefinition__Group__4__Impl rule__PredicateDefinition__Group__5 ;
    public final void rule__PredicateDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2743:1: ( rule__PredicateDefinition__Group__4__Impl rule__PredicateDefinition__Group__5 )
            // InternalProblem.g:2744:2: rule__PredicateDefinition__Group__4__Impl rule__PredicateDefinition__Group__5
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
    // InternalProblem.g:2751:1: rule__PredicateDefinition__Group__4__Impl : ( ')' ) ;
    public final void rule__PredicateDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2755:1: ( ( ')' ) )
            // InternalProblem.g:2756:1: ( ')' )
            {
            // InternalProblem.g:2756:1: ( ')' )
            // InternalProblem.g:2757:2: ')'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getRightParenthesisKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalProblem.g:2766:1: rule__PredicateDefinition__Group__5 : rule__PredicateDefinition__Group__5__Impl rule__PredicateDefinition__Group__6 ;
    public final void rule__PredicateDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2770:1: ( rule__PredicateDefinition__Group__5__Impl rule__PredicateDefinition__Group__6 )
            // InternalProblem.g:2771:2: rule__PredicateDefinition__Group__5__Impl rule__PredicateDefinition__Group__6
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
    // InternalProblem.g:2778:1: rule__PredicateDefinition__Group__5__Impl : ( ( rule__PredicateDefinition__Group_5__0 )? ) ;
    public final void rule__PredicateDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2782:1: ( ( ( rule__PredicateDefinition__Group_5__0 )? ) )
            // InternalProblem.g:2783:1: ( ( rule__PredicateDefinition__Group_5__0 )? )
            {
            // InternalProblem.g:2783:1: ( ( rule__PredicateDefinition__Group_5__0 )? )
            // InternalProblem.g:2784:2: ( rule__PredicateDefinition__Group_5__0 )?
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_5()); 
            // InternalProblem.g:2785:2: ( rule__PredicateDefinition__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalProblem.g:2785:3: rule__PredicateDefinition__Group_5__0
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
    // InternalProblem.g:2793:1: rule__PredicateDefinition__Group__6 : rule__PredicateDefinition__Group__6__Impl ;
    public final void rule__PredicateDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2797:1: ( rule__PredicateDefinition__Group__6__Impl )
            // InternalProblem.g:2798:2: rule__PredicateDefinition__Group__6__Impl
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
    // InternalProblem.g:2804:1: rule__PredicateDefinition__Group__6__Impl : ( '.' ) ;
    public final void rule__PredicateDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2808:1: ( ( '.' ) )
            // InternalProblem.g:2809:1: ( '.' )
            {
            // InternalProblem.g:2809:1: ( '.' )
            // InternalProblem.g:2810:2: '.'
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
    // InternalProblem.g:2820:1: rule__PredicateDefinition__Group_0_0__0 : rule__PredicateDefinition__Group_0_0__0__Impl rule__PredicateDefinition__Group_0_0__1 ;
    public final void rule__PredicateDefinition__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2824:1: ( rule__PredicateDefinition__Group_0_0__0__Impl rule__PredicateDefinition__Group_0_0__1 )
            // InternalProblem.g:2825:2: rule__PredicateDefinition__Group_0_0__0__Impl rule__PredicateDefinition__Group_0_0__1
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
    // InternalProblem.g:2832:1: rule__PredicateDefinition__Group_0_0__0__Impl : ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) ) ;
    public final void rule__PredicateDefinition__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2836:1: ( ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) ) )
            // InternalProblem.g:2837:1: ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) )
            {
            // InternalProblem.g:2837:1: ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) )
            // InternalProblem.g:2838:2: ( rule__PredicateDefinition__ErrorAssignment_0_0_0 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getErrorAssignment_0_0_0()); 
            // InternalProblem.g:2839:2: ( rule__PredicateDefinition__ErrorAssignment_0_0_0 )
            // InternalProblem.g:2839:3: rule__PredicateDefinition__ErrorAssignment_0_0_0
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
    // InternalProblem.g:2847:1: rule__PredicateDefinition__Group_0_0__1 : rule__PredicateDefinition__Group_0_0__1__Impl ;
    public final void rule__PredicateDefinition__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2851:1: ( rule__PredicateDefinition__Group_0_0__1__Impl )
            // InternalProblem.g:2852:2: rule__PredicateDefinition__Group_0_0__1__Impl
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
    // InternalProblem.g:2858:1: rule__PredicateDefinition__Group_0_0__1__Impl : ( ( 'pred' )? ) ;
    public final void rule__PredicateDefinition__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2862:1: ( ( ( 'pred' )? ) )
            // InternalProblem.g:2863:1: ( ( 'pred' )? )
            {
            // InternalProblem.g:2863:1: ( ( 'pred' )? )
            // InternalProblem.g:2864:2: ( 'pred' )?
            {
             before(grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_0_1()); 
            // InternalProblem.g:2865:2: ( 'pred' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==16) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalProblem.g:2865:3: 'pred'
                    {
                    match(input,16,FOLLOW_2); 

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
    // InternalProblem.g:2874:1: rule__PredicateDefinition__Group_3__0 : rule__PredicateDefinition__Group_3__0__Impl rule__PredicateDefinition__Group_3__1 ;
    public final void rule__PredicateDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2878:1: ( rule__PredicateDefinition__Group_3__0__Impl rule__PredicateDefinition__Group_3__1 )
            // InternalProblem.g:2879:2: rule__PredicateDefinition__Group_3__0__Impl rule__PredicateDefinition__Group_3__1
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
    // InternalProblem.g:2886:1: rule__PredicateDefinition__Group_3__0__Impl : ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) ) ;
    public final void rule__PredicateDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2890:1: ( ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) ) )
            // InternalProblem.g:2891:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) )
            {
            // InternalProblem.g:2891:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) )
            // InternalProblem.g:2892:2: ( rule__PredicateDefinition__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getParametersAssignment_3_0()); 
            // InternalProblem.g:2893:2: ( rule__PredicateDefinition__ParametersAssignment_3_0 )
            // InternalProblem.g:2893:3: rule__PredicateDefinition__ParametersAssignment_3_0
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
    // InternalProblem.g:2901:1: rule__PredicateDefinition__Group_3__1 : rule__PredicateDefinition__Group_3__1__Impl ;
    public final void rule__PredicateDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2905:1: ( rule__PredicateDefinition__Group_3__1__Impl )
            // InternalProblem.g:2906:2: rule__PredicateDefinition__Group_3__1__Impl
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
    // InternalProblem.g:2912:1: rule__PredicateDefinition__Group_3__1__Impl : ( ( rule__PredicateDefinition__Group_3_1__0 )* ) ;
    public final void rule__PredicateDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2916:1: ( ( ( rule__PredicateDefinition__Group_3_1__0 )* ) )
            // InternalProblem.g:2917:1: ( ( rule__PredicateDefinition__Group_3_1__0 )* )
            {
            // InternalProblem.g:2917:1: ( ( rule__PredicateDefinition__Group_3_1__0 )* )
            // InternalProblem.g:2918:2: ( rule__PredicateDefinition__Group_3_1__0 )*
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_3_1()); 
            // InternalProblem.g:2919:2: ( rule__PredicateDefinition__Group_3_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==13) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalProblem.g:2919:3: rule__PredicateDefinition__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PredicateDefinition__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalProblem.g:2928:1: rule__PredicateDefinition__Group_3_1__0 : rule__PredicateDefinition__Group_3_1__0__Impl rule__PredicateDefinition__Group_3_1__1 ;
    public final void rule__PredicateDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2932:1: ( rule__PredicateDefinition__Group_3_1__0__Impl rule__PredicateDefinition__Group_3_1__1 )
            // InternalProblem.g:2933:2: rule__PredicateDefinition__Group_3_1__0__Impl rule__PredicateDefinition__Group_3_1__1
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
    // InternalProblem.g:2940:1: rule__PredicateDefinition__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__PredicateDefinition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2944:1: ( ( ',' ) )
            // InternalProblem.g:2945:1: ( ',' )
            {
            // InternalProblem.g:2945:1: ( ',' )
            // InternalProblem.g:2946:2: ','
            {
             before(grammarAccess.getPredicateDefinitionAccess().getCommaKeyword_3_1_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalProblem.g:2955:1: rule__PredicateDefinition__Group_3_1__1 : rule__PredicateDefinition__Group_3_1__1__Impl ;
    public final void rule__PredicateDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2959:1: ( rule__PredicateDefinition__Group_3_1__1__Impl )
            // InternalProblem.g:2960:2: rule__PredicateDefinition__Group_3_1__1__Impl
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
    // InternalProblem.g:2966:1: rule__PredicateDefinition__Group_3_1__1__Impl : ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__PredicateDefinition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2970:1: ( ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) ) )
            // InternalProblem.g:2971:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) )
            {
            // InternalProblem.g:2971:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) )
            // InternalProblem.g:2972:2: ( rule__PredicateDefinition__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getParametersAssignment_3_1_1()); 
            // InternalProblem.g:2973:2: ( rule__PredicateDefinition__ParametersAssignment_3_1_1 )
            // InternalProblem.g:2973:3: rule__PredicateDefinition__ParametersAssignment_3_1_1
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
    // InternalProblem.g:2982:1: rule__PredicateDefinition__Group_5__0 : rule__PredicateDefinition__Group_5__0__Impl rule__PredicateDefinition__Group_5__1 ;
    public final void rule__PredicateDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2986:1: ( rule__PredicateDefinition__Group_5__0__Impl rule__PredicateDefinition__Group_5__1 )
            // InternalProblem.g:2987:2: rule__PredicateDefinition__Group_5__0__Impl rule__PredicateDefinition__Group_5__1
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
    // InternalProblem.g:2994:1: rule__PredicateDefinition__Group_5__0__Impl : ( ':-' ) ;
    public final void rule__PredicateDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2998:1: ( ( ':-' ) )
            // InternalProblem.g:2999:1: ( ':-' )
            {
            // InternalProblem.g:2999:1: ( ':-' )
            // InternalProblem.g:3000:2: ':-'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getColonHyphenMinusKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalProblem.g:3009:1: rule__PredicateDefinition__Group_5__1 : rule__PredicateDefinition__Group_5__1__Impl rule__PredicateDefinition__Group_5__2 ;
    public final void rule__PredicateDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3013:1: ( rule__PredicateDefinition__Group_5__1__Impl rule__PredicateDefinition__Group_5__2 )
            // InternalProblem.g:3014:2: rule__PredicateDefinition__Group_5__1__Impl rule__PredicateDefinition__Group_5__2
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
    // InternalProblem.g:3021:1: rule__PredicateDefinition__Group_5__1__Impl : ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) ) ;
    public final void rule__PredicateDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3025:1: ( ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) ) )
            // InternalProblem.g:3026:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) )
            {
            // InternalProblem.g:3026:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) )
            // InternalProblem.g:3027:2: ( rule__PredicateDefinition__BodiesAssignment_5_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getBodiesAssignment_5_1()); 
            // InternalProblem.g:3028:2: ( rule__PredicateDefinition__BodiesAssignment_5_1 )
            // InternalProblem.g:3028:3: rule__PredicateDefinition__BodiesAssignment_5_1
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
    // InternalProblem.g:3036:1: rule__PredicateDefinition__Group_5__2 : rule__PredicateDefinition__Group_5__2__Impl ;
    public final void rule__PredicateDefinition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3040:1: ( rule__PredicateDefinition__Group_5__2__Impl )
            // InternalProblem.g:3041:2: rule__PredicateDefinition__Group_5__2__Impl
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
    // InternalProblem.g:3047:1: rule__PredicateDefinition__Group_5__2__Impl : ( ( rule__PredicateDefinition__Group_5_2__0 )* ) ;
    public final void rule__PredicateDefinition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3051:1: ( ( ( rule__PredicateDefinition__Group_5_2__0 )* ) )
            // InternalProblem.g:3052:1: ( ( rule__PredicateDefinition__Group_5_2__0 )* )
            {
            // InternalProblem.g:3052:1: ( ( rule__PredicateDefinition__Group_5_2__0 )* )
            // InternalProblem.g:3053:2: ( rule__PredicateDefinition__Group_5_2__0 )*
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_5_2()); 
            // InternalProblem.g:3054:2: ( rule__PredicateDefinition__Group_5_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==14) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalProblem.g:3054:3: rule__PredicateDefinition__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__PredicateDefinition__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalProblem.g:3063:1: rule__PredicateDefinition__Group_5_2__0 : rule__PredicateDefinition__Group_5_2__0__Impl rule__PredicateDefinition__Group_5_2__1 ;
    public final void rule__PredicateDefinition__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3067:1: ( rule__PredicateDefinition__Group_5_2__0__Impl rule__PredicateDefinition__Group_5_2__1 )
            // InternalProblem.g:3068:2: rule__PredicateDefinition__Group_5_2__0__Impl rule__PredicateDefinition__Group_5_2__1
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
    // InternalProblem.g:3075:1: rule__PredicateDefinition__Group_5_2__0__Impl : ( ';' ) ;
    public final void rule__PredicateDefinition__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3079:1: ( ( ';' ) )
            // InternalProblem.g:3080:1: ( ';' )
            {
            // InternalProblem.g:3080:1: ( ';' )
            // InternalProblem.g:3081:2: ';'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getSemicolonKeyword_5_2_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalProblem.g:3090:1: rule__PredicateDefinition__Group_5_2__1 : rule__PredicateDefinition__Group_5_2__1__Impl ;
    public final void rule__PredicateDefinition__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3094:1: ( rule__PredicateDefinition__Group_5_2__1__Impl )
            // InternalProblem.g:3095:2: rule__PredicateDefinition__Group_5_2__1__Impl
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
    // InternalProblem.g:3101:1: rule__PredicateDefinition__Group_5_2__1__Impl : ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) ) ;
    public final void rule__PredicateDefinition__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3105:1: ( ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) ) )
            // InternalProblem.g:3106:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) )
            {
            // InternalProblem.g:3106:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) )
            // InternalProblem.g:3107:2: ( rule__PredicateDefinition__BodiesAssignment_5_2_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getBodiesAssignment_5_2_1()); 
            // InternalProblem.g:3108:2: ( rule__PredicateDefinition__BodiesAssignment_5_2_1 )
            // InternalProblem.g:3108:3: rule__PredicateDefinition__BodiesAssignment_5_2_1
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
    // InternalProblem.g:3117:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3121:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalProblem.g:3122:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalProblem.g:3129:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__ParameterTypeAssignment_0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3133:1: ( ( ( rule__Parameter__ParameterTypeAssignment_0 )? ) )
            // InternalProblem.g:3134:1: ( ( rule__Parameter__ParameterTypeAssignment_0 )? )
            {
            // InternalProblem.g:3134:1: ( ( rule__Parameter__ParameterTypeAssignment_0 )? )
            // InternalProblem.g:3135:2: ( rule__Parameter__ParameterTypeAssignment_0 )?
            {
             before(grammarAccess.getParameterAccess().getParameterTypeAssignment_0()); 
            // InternalProblem.g:3136:2: ( rule__Parameter__ParameterTypeAssignment_0 )?
            int alt41=2;
            switch ( input.LA(1) ) {
                case RULE_QUOTED_ID:
                    {
                    alt41=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA41_2 = input.LA(2);

                    if ( (LA41_2==RULE_ID||(LA41_2>=19 && LA41_2<=22)||LA41_2==43) ) {
                        alt41=1;
                    }
                    }
                    break;
                case 19:
                    {
                    int LA41_3 = input.LA(2);

                    if ( (LA41_3==RULE_ID||(LA41_3>=19 && LA41_3<=22)||LA41_3==43) ) {
                        alt41=1;
                    }
                    }
                    break;
                case 20:
                    {
                    int LA41_4 = input.LA(2);

                    if ( (LA41_4==RULE_ID||(LA41_4>=19 && LA41_4<=22)||LA41_4==43) ) {
                        alt41=1;
                    }
                    }
                    break;
                case 21:
                    {
                    int LA41_5 = input.LA(2);

                    if ( (LA41_5==RULE_ID||(LA41_5>=19 && LA41_5<=22)||LA41_5==43) ) {
                        alt41=1;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA41_6 = input.LA(2);

                    if ( (LA41_6==RULE_ID||(LA41_6>=19 && LA41_6<=22)||LA41_6==43) ) {
                        alt41=1;
                    }
                    }
                    break;
            }

            switch (alt41) {
                case 1 :
                    // InternalProblem.g:3136:3: rule__Parameter__ParameterTypeAssignment_0
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
    // InternalProblem.g:3144:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3148:1: ( rule__Parameter__Group__1__Impl )
            // InternalProblem.g:3149:2: rule__Parameter__Group__1__Impl
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
    // InternalProblem.g:3155:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3159:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalProblem.g:3160:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalProblem.g:3160:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalProblem.g:3161:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalProblem.g:3162:2: ( rule__Parameter__NameAssignment_1 )
            // InternalProblem.g:3162:3: rule__Parameter__NameAssignment_1
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
    // InternalProblem.g:3171:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3175:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // InternalProblem.g:3176:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
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
    // InternalProblem.g:3183:1: rule__Conjunction__Group__0__Impl : ( ( rule__Conjunction__LiteralsAssignment_0 ) ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3187:1: ( ( ( rule__Conjunction__LiteralsAssignment_0 ) ) )
            // InternalProblem.g:3188:1: ( ( rule__Conjunction__LiteralsAssignment_0 ) )
            {
            // InternalProblem.g:3188:1: ( ( rule__Conjunction__LiteralsAssignment_0 ) )
            // InternalProblem.g:3189:2: ( rule__Conjunction__LiteralsAssignment_0 )
            {
             before(grammarAccess.getConjunctionAccess().getLiteralsAssignment_0()); 
            // InternalProblem.g:3190:2: ( rule__Conjunction__LiteralsAssignment_0 )
            // InternalProblem.g:3190:3: rule__Conjunction__LiteralsAssignment_0
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
    // InternalProblem.g:3198:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3202:1: ( rule__Conjunction__Group__1__Impl )
            // InternalProblem.g:3203:2: rule__Conjunction__Group__1__Impl
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
    // InternalProblem.g:3209:1: rule__Conjunction__Group__1__Impl : ( ( rule__Conjunction__Group_1__0 )* ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3213:1: ( ( ( rule__Conjunction__Group_1__0 )* ) )
            // InternalProblem.g:3214:1: ( ( rule__Conjunction__Group_1__0 )* )
            {
            // InternalProblem.g:3214:1: ( ( rule__Conjunction__Group_1__0 )* )
            // InternalProblem.g:3215:2: ( rule__Conjunction__Group_1__0 )*
            {
             before(grammarAccess.getConjunctionAccess().getGroup_1()); 
            // InternalProblem.g:3216:2: ( rule__Conjunction__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==13) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalProblem.g:3216:3: rule__Conjunction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Conjunction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalProblem.g:3225:1: rule__Conjunction__Group_1__0 : rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 ;
    public final void rule__Conjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3229:1: ( rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 )
            // InternalProblem.g:3230:2: rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1
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
    // InternalProblem.g:3237:1: rule__Conjunction__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Conjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3241:1: ( ( ',' ) )
            // InternalProblem.g:3242:1: ( ',' )
            {
            // InternalProblem.g:3242:1: ( ',' )
            // InternalProblem.g:3243:2: ','
            {
             before(grammarAccess.getConjunctionAccess().getCommaKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalProblem.g:3252:1: rule__Conjunction__Group_1__1 : rule__Conjunction__Group_1__1__Impl ;
    public final void rule__Conjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3256:1: ( rule__Conjunction__Group_1__1__Impl )
            // InternalProblem.g:3257:2: rule__Conjunction__Group_1__1__Impl
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
    // InternalProblem.g:3263:1: rule__Conjunction__Group_1__1__Impl : ( ( rule__Conjunction__LiteralsAssignment_1_1 ) ) ;
    public final void rule__Conjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3267:1: ( ( ( rule__Conjunction__LiteralsAssignment_1_1 ) ) )
            // InternalProblem.g:3268:1: ( ( rule__Conjunction__LiteralsAssignment_1_1 ) )
            {
            // InternalProblem.g:3268:1: ( ( rule__Conjunction__LiteralsAssignment_1_1 ) )
            // InternalProblem.g:3269:2: ( rule__Conjunction__LiteralsAssignment_1_1 )
            {
             before(grammarAccess.getConjunctionAccess().getLiteralsAssignment_1_1()); 
            // InternalProblem.g:3270:2: ( rule__Conjunction__LiteralsAssignment_1_1 )
            // InternalProblem.g:3270:3: rule__Conjunction__LiteralsAssignment_1_1
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
    // InternalProblem.g:3279:1: rule__NegativeLiteral__Group__0 : rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1 ;
    public final void rule__NegativeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3283:1: ( rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1 )
            // InternalProblem.g:3284:2: rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1
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
    // InternalProblem.g:3291:1: rule__NegativeLiteral__Group__0__Impl : ( '!' ) ;
    public final void rule__NegativeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3295:1: ( ( '!' ) )
            // InternalProblem.g:3296:1: ( '!' )
            {
            // InternalProblem.g:3296:1: ( '!' )
            // InternalProblem.g:3297:2: '!'
            {
             before(grammarAccess.getNegativeLiteralAccess().getExclamationMarkKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalProblem.g:3306:1: rule__NegativeLiteral__Group__1 : rule__NegativeLiteral__Group__1__Impl ;
    public final void rule__NegativeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3310:1: ( rule__NegativeLiteral__Group__1__Impl )
            // InternalProblem.g:3311:2: rule__NegativeLiteral__Group__1__Impl
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
    // InternalProblem.g:3317:1: rule__NegativeLiteral__Group__1__Impl : ( ( rule__NegativeLiteral__AtomAssignment_1 ) ) ;
    public final void rule__NegativeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3321:1: ( ( ( rule__NegativeLiteral__AtomAssignment_1 ) ) )
            // InternalProblem.g:3322:1: ( ( rule__NegativeLiteral__AtomAssignment_1 ) )
            {
            // InternalProblem.g:3322:1: ( ( rule__NegativeLiteral__AtomAssignment_1 ) )
            // InternalProblem.g:3323:2: ( rule__NegativeLiteral__AtomAssignment_1 )
            {
             before(grammarAccess.getNegativeLiteralAccess().getAtomAssignment_1()); 
            // InternalProblem.g:3324:2: ( rule__NegativeLiteral__AtomAssignment_1 )
            // InternalProblem.g:3324:3: rule__NegativeLiteral__AtomAssignment_1
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
    // InternalProblem.g:3333:1: rule__Atom__Group__0 : rule__Atom__Group__0__Impl rule__Atom__Group__1 ;
    public final void rule__Atom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3337:1: ( rule__Atom__Group__0__Impl rule__Atom__Group__1 )
            // InternalProblem.g:3338:2: rule__Atom__Group__0__Impl rule__Atom__Group__1
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
    // InternalProblem.g:3345:1: rule__Atom__Group__0__Impl : ( ( rule__Atom__RelationAssignment_0 ) ) ;
    public final void rule__Atom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3349:1: ( ( ( rule__Atom__RelationAssignment_0 ) ) )
            // InternalProblem.g:3350:1: ( ( rule__Atom__RelationAssignment_0 ) )
            {
            // InternalProblem.g:3350:1: ( ( rule__Atom__RelationAssignment_0 ) )
            // InternalProblem.g:3351:2: ( rule__Atom__RelationAssignment_0 )
            {
             before(grammarAccess.getAtomAccess().getRelationAssignment_0()); 
            // InternalProblem.g:3352:2: ( rule__Atom__RelationAssignment_0 )
            // InternalProblem.g:3352:3: rule__Atom__RelationAssignment_0
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
    // InternalProblem.g:3360:1: rule__Atom__Group__1 : rule__Atom__Group__1__Impl rule__Atom__Group__2 ;
    public final void rule__Atom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3364:1: ( rule__Atom__Group__1__Impl rule__Atom__Group__2 )
            // InternalProblem.g:3365:2: rule__Atom__Group__1__Impl rule__Atom__Group__2
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
    // InternalProblem.g:3372:1: rule__Atom__Group__1__Impl : ( ( rule__Atom__TransitiveClosureAssignment_1 )? ) ;
    public final void rule__Atom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3376:1: ( ( ( rule__Atom__TransitiveClosureAssignment_1 )? ) )
            // InternalProblem.g:3377:1: ( ( rule__Atom__TransitiveClosureAssignment_1 )? )
            {
            // InternalProblem.g:3377:1: ( ( rule__Atom__TransitiveClosureAssignment_1 )? )
            // InternalProblem.g:3378:2: ( rule__Atom__TransitiveClosureAssignment_1 )?
            {
             before(grammarAccess.getAtomAccess().getTransitiveClosureAssignment_1()); 
            // InternalProblem.g:3379:2: ( rule__Atom__TransitiveClosureAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==24) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalProblem.g:3379:3: rule__Atom__TransitiveClosureAssignment_1
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
    // InternalProblem.g:3387:1: rule__Atom__Group__2 : rule__Atom__Group__2__Impl rule__Atom__Group__3 ;
    public final void rule__Atom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3391:1: ( rule__Atom__Group__2__Impl rule__Atom__Group__3 )
            // InternalProblem.g:3392:2: rule__Atom__Group__2__Impl rule__Atom__Group__3
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
    // InternalProblem.g:3399:1: rule__Atom__Group__2__Impl : ( '(' ) ;
    public final void rule__Atom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3403:1: ( ( '(' ) )
            // InternalProblem.g:3404:1: ( '(' )
            {
            // InternalProblem.g:3404:1: ( '(' )
            // InternalProblem.g:3405:2: '('
            {
             before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalProblem.g:3414:1: rule__Atom__Group__3 : rule__Atom__Group__3__Impl rule__Atom__Group__4 ;
    public final void rule__Atom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3418:1: ( rule__Atom__Group__3__Impl rule__Atom__Group__4 )
            // InternalProblem.g:3419:2: rule__Atom__Group__3__Impl rule__Atom__Group__4
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
    // InternalProblem.g:3426:1: rule__Atom__Group__3__Impl : ( ( rule__Atom__Group_3__0 )? ) ;
    public final void rule__Atom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3430:1: ( ( ( rule__Atom__Group_3__0 )? ) )
            // InternalProblem.g:3431:1: ( ( rule__Atom__Group_3__0 )? )
            {
            // InternalProblem.g:3431:1: ( ( rule__Atom__Group_3__0 )? )
            // InternalProblem.g:3432:2: ( rule__Atom__Group_3__0 )?
            {
             before(grammarAccess.getAtomAccess().getGroup_3()); 
            // InternalProblem.g:3433:2: ( rule__Atom__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_INT && LA44_0<=RULE_STRING)||(LA44_0>=19 && LA44_0<=23)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalProblem.g:3433:3: rule__Atom__Group_3__0
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
    // InternalProblem.g:3441:1: rule__Atom__Group__4 : rule__Atom__Group__4__Impl ;
    public final void rule__Atom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3445:1: ( rule__Atom__Group__4__Impl )
            // InternalProblem.g:3446:2: rule__Atom__Group__4__Impl
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
    // InternalProblem.g:3452:1: rule__Atom__Group__4__Impl : ( ')' ) ;
    public final void rule__Atom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3456:1: ( ( ')' ) )
            // InternalProblem.g:3457:1: ( ')' )
            {
            // InternalProblem.g:3457:1: ( ')' )
            // InternalProblem.g:3458:2: ')'
            {
             before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalProblem.g:3468:1: rule__Atom__Group_3__0 : rule__Atom__Group_3__0__Impl rule__Atom__Group_3__1 ;
    public final void rule__Atom__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3472:1: ( rule__Atom__Group_3__0__Impl rule__Atom__Group_3__1 )
            // InternalProblem.g:3473:2: rule__Atom__Group_3__0__Impl rule__Atom__Group_3__1
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
    // InternalProblem.g:3480:1: rule__Atom__Group_3__0__Impl : ( ( rule__Atom__ArgumentsAssignment_3_0 ) ) ;
    public final void rule__Atom__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3484:1: ( ( ( rule__Atom__ArgumentsAssignment_3_0 ) ) )
            // InternalProblem.g:3485:1: ( ( rule__Atom__ArgumentsAssignment_3_0 ) )
            {
            // InternalProblem.g:3485:1: ( ( rule__Atom__ArgumentsAssignment_3_0 ) )
            // InternalProblem.g:3486:2: ( rule__Atom__ArgumentsAssignment_3_0 )
            {
             before(grammarAccess.getAtomAccess().getArgumentsAssignment_3_0()); 
            // InternalProblem.g:3487:2: ( rule__Atom__ArgumentsAssignment_3_0 )
            // InternalProblem.g:3487:3: rule__Atom__ArgumentsAssignment_3_0
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
    // InternalProblem.g:3495:1: rule__Atom__Group_3__1 : rule__Atom__Group_3__1__Impl ;
    public final void rule__Atom__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3499:1: ( rule__Atom__Group_3__1__Impl )
            // InternalProblem.g:3500:2: rule__Atom__Group_3__1__Impl
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
    // InternalProblem.g:3506:1: rule__Atom__Group_3__1__Impl : ( ( rule__Atom__Group_3_1__0 )* ) ;
    public final void rule__Atom__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3510:1: ( ( ( rule__Atom__Group_3_1__0 )* ) )
            // InternalProblem.g:3511:1: ( ( rule__Atom__Group_3_1__0 )* )
            {
            // InternalProblem.g:3511:1: ( ( rule__Atom__Group_3_1__0 )* )
            // InternalProblem.g:3512:2: ( rule__Atom__Group_3_1__0 )*
            {
             before(grammarAccess.getAtomAccess().getGroup_3_1()); 
            // InternalProblem.g:3513:2: ( rule__Atom__Group_3_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==13) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalProblem.g:3513:3: rule__Atom__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Atom__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalProblem.g:3522:1: rule__Atom__Group_3_1__0 : rule__Atom__Group_3_1__0__Impl rule__Atom__Group_3_1__1 ;
    public final void rule__Atom__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3526:1: ( rule__Atom__Group_3_1__0__Impl rule__Atom__Group_3_1__1 )
            // InternalProblem.g:3527:2: rule__Atom__Group_3_1__0__Impl rule__Atom__Group_3_1__1
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
    // InternalProblem.g:3534:1: rule__Atom__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Atom__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3538:1: ( ( ',' ) )
            // InternalProblem.g:3539:1: ( ',' )
            {
            // InternalProblem.g:3539:1: ( ',' )
            // InternalProblem.g:3540:2: ','
            {
             before(grammarAccess.getAtomAccess().getCommaKeyword_3_1_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalProblem.g:3549:1: rule__Atom__Group_3_1__1 : rule__Atom__Group_3_1__1__Impl ;
    public final void rule__Atom__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3553:1: ( rule__Atom__Group_3_1__1__Impl )
            // InternalProblem.g:3554:2: rule__Atom__Group_3_1__1__Impl
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
    // InternalProblem.g:3560:1: rule__Atom__Group_3_1__1__Impl : ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) ) ;
    public final void rule__Atom__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3564:1: ( ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) ) )
            // InternalProblem.g:3565:1: ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) )
            {
            // InternalProblem.g:3565:1: ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) )
            // InternalProblem.g:3566:2: ( rule__Atom__ArgumentsAssignment_3_1_1 )
            {
             before(grammarAccess.getAtomAccess().getArgumentsAssignment_3_1_1()); 
            // InternalProblem.g:3567:2: ( rule__Atom__ArgumentsAssignment_3_1_1 )
            // InternalProblem.g:3567:3: rule__Atom__ArgumentsAssignment_3_1_1
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
    // InternalProblem.g:3576:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3580:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // InternalProblem.g:3581:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
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
    // InternalProblem.g:3588:1: rule__Assertion__Group__0__Impl : ( ( rule__Assertion__Alternatives_0 ) ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3592:1: ( ( ( rule__Assertion__Alternatives_0 ) ) )
            // InternalProblem.g:3593:1: ( ( rule__Assertion__Alternatives_0 ) )
            {
            // InternalProblem.g:3593:1: ( ( rule__Assertion__Alternatives_0 ) )
            // InternalProblem.g:3594:2: ( rule__Assertion__Alternatives_0 )
            {
             before(grammarAccess.getAssertionAccess().getAlternatives_0()); 
            // InternalProblem.g:3595:2: ( rule__Assertion__Alternatives_0 )
            // InternalProblem.g:3595:3: rule__Assertion__Alternatives_0
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
    // InternalProblem.g:3603:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3607:1: ( rule__Assertion__Group__1__Impl )
            // InternalProblem.g:3608:2: rule__Assertion__Group__1__Impl
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
    // InternalProblem.g:3614:1: rule__Assertion__Group__1__Impl : ( '.' ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3618:1: ( ( '.' ) )
            // InternalProblem.g:3619:1: ( '.' )
            {
            // InternalProblem.g:3619:1: ( '.' )
            // InternalProblem.g:3620:2: '.'
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
    // InternalProblem.g:3630:1: rule__Assertion__Group_0_0__0 : rule__Assertion__Group_0_0__0__Impl rule__Assertion__Group_0_0__1 ;
    public final void rule__Assertion__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3634:1: ( rule__Assertion__Group_0_0__0__Impl rule__Assertion__Group_0_0__1 )
            // InternalProblem.g:3635:2: rule__Assertion__Group_0_0__0__Impl rule__Assertion__Group_0_0__1
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
    // InternalProblem.g:3642:1: rule__Assertion__Group_0_0__0__Impl : ( ( rule__Assertion__RelationAssignment_0_0_0 ) ) ;
    public final void rule__Assertion__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3646:1: ( ( ( rule__Assertion__RelationAssignment_0_0_0 ) ) )
            // InternalProblem.g:3647:1: ( ( rule__Assertion__RelationAssignment_0_0_0 ) )
            {
            // InternalProblem.g:3647:1: ( ( rule__Assertion__RelationAssignment_0_0_0 ) )
            // InternalProblem.g:3648:2: ( rule__Assertion__RelationAssignment_0_0_0 )
            {
             before(grammarAccess.getAssertionAccess().getRelationAssignment_0_0_0()); 
            // InternalProblem.g:3649:2: ( rule__Assertion__RelationAssignment_0_0_0 )
            // InternalProblem.g:3649:3: rule__Assertion__RelationAssignment_0_0_0
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
    // InternalProblem.g:3657:1: rule__Assertion__Group_0_0__1 : rule__Assertion__Group_0_0__1__Impl rule__Assertion__Group_0_0__2 ;
    public final void rule__Assertion__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3661:1: ( rule__Assertion__Group_0_0__1__Impl rule__Assertion__Group_0_0__2 )
            // InternalProblem.g:3662:2: rule__Assertion__Group_0_0__1__Impl rule__Assertion__Group_0_0__2
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
    // InternalProblem.g:3669:1: rule__Assertion__Group_0_0__1__Impl : ( '(' ) ;
    public final void rule__Assertion__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3673:1: ( ( '(' ) )
            // InternalProblem.g:3674:1: ( '(' )
            {
            // InternalProblem.g:3674:1: ( '(' )
            // InternalProblem.g:3675:2: '('
            {
             before(grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_0_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalProblem.g:3684:1: rule__Assertion__Group_0_0__2 : rule__Assertion__Group_0_0__2__Impl rule__Assertion__Group_0_0__3 ;
    public final void rule__Assertion__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3688:1: ( rule__Assertion__Group_0_0__2__Impl rule__Assertion__Group_0_0__3 )
            // InternalProblem.g:3689:2: rule__Assertion__Group_0_0__2__Impl rule__Assertion__Group_0_0__3
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
    // InternalProblem.g:3696:1: rule__Assertion__Group_0_0__2__Impl : ( ( rule__Assertion__Group_0_0_2__0 )? ) ;
    public final void rule__Assertion__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3700:1: ( ( ( rule__Assertion__Group_0_0_2__0 )? ) )
            // InternalProblem.g:3701:1: ( ( rule__Assertion__Group_0_0_2__0 )? )
            {
            // InternalProblem.g:3701:1: ( ( rule__Assertion__Group_0_0_2__0 )? )
            // InternalProblem.g:3702:2: ( rule__Assertion__Group_0_0_2__0 )?
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_0_2()); 
            // InternalProblem.g:3703:2: ( rule__Assertion__Group_0_0_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_INT && LA46_0<=RULE_STRING)||(LA46_0>=19 && LA46_0<=23)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalProblem.g:3703:3: rule__Assertion__Group_0_0_2__0
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
    // InternalProblem.g:3711:1: rule__Assertion__Group_0_0__3 : rule__Assertion__Group_0_0__3__Impl rule__Assertion__Group_0_0__4 ;
    public final void rule__Assertion__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3715:1: ( rule__Assertion__Group_0_0__3__Impl rule__Assertion__Group_0_0__4 )
            // InternalProblem.g:3716:2: rule__Assertion__Group_0_0__3__Impl rule__Assertion__Group_0_0__4
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
    // InternalProblem.g:3723:1: rule__Assertion__Group_0_0__3__Impl : ( ')' ) ;
    public final void rule__Assertion__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3727:1: ( ( ')' ) )
            // InternalProblem.g:3728:1: ( ')' )
            {
            // InternalProblem.g:3728:1: ( ')' )
            // InternalProblem.g:3729:2: ')'
            {
             before(grammarAccess.getAssertionAccess().getRightParenthesisKeyword_0_0_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalProblem.g:3738:1: rule__Assertion__Group_0_0__4 : rule__Assertion__Group_0_0__4__Impl rule__Assertion__Group_0_0__5 ;
    public final void rule__Assertion__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3742:1: ( rule__Assertion__Group_0_0__4__Impl rule__Assertion__Group_0_0__5 )
            // InternalProblem.g:3743:2: rule__Assertion__Group_0_0__4__Impl rule__Assertion__Group_0_0__5
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
    // InternalProblem.g:3750:1: rule__Assertion__Group_0_0__4__Impl : ( ':' ) ;
    public final void rule__Assertion__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3754:1: ( ( ':' ) )
            // InternalProblem.g:3755:1: ( ':' )
            {
            // InternalProblem.g:3755:1: ( ':' )
            // InternalProblem.g:3756:2: ':'
            {
             before(grammarAccess.getAssertionAccess().getColonKeyword_0_0_4()); 
            match(input,40,FOLLOW_2); 
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
    // InternalProblem.g:3765:1: rule__Assertion__Group_0_0__5 : rule__Assertion__Group_0_0__5__Impl ;
    public final void rule__Assertion__Group_0_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3769:1: ( rule__Assertion__Group_0_0__5__Impl )
            // InternalProblem.g:3770:2: rule__Assertion__Group_0_0__5__Impl
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
    // InternalProblem.g:3776:1: rule__Assertion__Group_0_0__5__Impl : ( ( rule__Assertion__ValueAssignment_0_0_5 ) ) ;
    public final void rule__Assertion__Group_0_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3780:1: ( ( ( rule__Assertion__ValueAssignment_0_0_5 ) ) )
            // InternalProblem.g:3781:1: ( ( rule__Assertion__ValueAssignment_0_0_5 ) )
            {
            // InternalProblem.g:3781:1: ( ( rule__Assertion__ValueAssignment_0_0_5 ) )
            // InternalProblem.g:3782:2: ( rule__Assertion__ValueAssignment_0_0_5 )
            {
             before(grammarAccess.getAssertionAccess().getValueAssignment_0_0_5()); 
            // InternalProblem.g:3783:2: ( rule__Assertion__ValueAssignment_0_0_5 )
            // InternalProblem.g:3783:3: rule__Assertion__ValueAssignment_0_0_5
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
    // InternalProblem.g:3792:1: rule__Assertion__Group_0_0_2__0 : rule__Assertion__Group_0_0_2__0__Impl rule__Assertion__Group_0_0_2__1 ;
    public final void rule__Assertion__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3796:1: ( rule__Assertion__Group_0_0_2__0__Impl rule__Assertion__Group_0_0_2__1 )
            // InternalProblem.g:3797:2: rule__Assertion__Group_0_0_2__0__Impl rule__Assertion__Group_0_0_2__1
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
    // InternalProblem.g:3804:1: rule__Assertion__Group_0_0_2__0__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) ) ;
    public final void rule__Assertion__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3808:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) ) )
            // InternalProblem.g:3809:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) )
            {
            // InternalProblem.g:3809:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) )
            // InternalProblem.g:3810:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_0 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_0_2_0()); 
            // InternalProblem.g:3811:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_0 )
            // InternalProblem.g:3811:3: rule__Assertion__ArgumentsAssignment_0_0_2_0
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
    // InternalProblem.g:3819:1: rule__Assertion__Group_0_0_2__1 : rule__Assertion__Group_0_0_2__1__Impl ;
    public final void rule__Assertion__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3823:1: ( rule__Assertion__Group_0_0_2__1__Impl )
            // InternalProblem.g:3824:2: rule__Assertion__Group_0_0_2__1__Impl
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
    // InternalProblem.g:3830:1: rule__Assertion__Group_0_0_2__1__Impl : ( ( rule__Assertion__Group_0_0_2_1__0 )* ) ;
    public final void rule__Assertion__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3834:1: ( ( ( rule__Assertion__Group_0_0_2_1__0 )* ) )
            // InternalProblem.g:3835:1: ( ( rule__Assertion__Group_0_0_2_1__0 )* )
            {
            // InternalProblem.g:3835:1: ( ( rule__Assertion__Group_0_0_2_1__0 )* )
            // InternalProblem.g:3836:2: ( rule__Assertion__Group_0_0_2_1__0 )*
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_0_2_1()); 
            // InternalProblem.g:3837:2: ( rule__Assertion__Group_0_0_2_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==13) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalProblem.g:3837:3: rule__Assertion__Group_0_0_2_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Assertion__Group_0_0_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalProblem.g:3846:1: rule__Assertion__Group_0_0_2_1__0 : rule__Assertion__Group_0_0_2_1__0__Impl rule__Assertion__Group_0_0_2_1__1 ;
    public final void rule__Assertion__Group_0_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3850:1: ( rule__Assertion__Group_0_0_2_1__0__Impl rule__Assertion__Group_0_0_2_1__1 )
            // InternalProblem.g:3851:2: rule__Assertion__Group_0_0_2_1__0__Impl rule__Assertion__Group_0_0_2_1__1
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
    // InternalProblem.g:3858:1: rule__Assertion__Group_0_0_2_1__0__Impl : ( ',' ) ;
    public final void rule__Assertion__Group_0_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3862:1: ( ( ',' ) )
            // InternalProblem.g:3863:1: ( ',' )
            {
            // InternalProblem.g:3863:1: ( ',' )
            // InternalProblem.g:3864:2: ','
            {
             before(grammarAccess.getAssertionAccess().getCommaKeyword_0_0_2_1_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalProblem.g:3873:1: rule__Assertion__Group_0_0_2_1__1 : rule__Assertion__Group_0_0_2_1__1__Impl ;
    public final void rule__Assertion__Group_0_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3877:1: ( rule__Assertion__Group_0_0_2_1__1__Impl )
            // InternalProblem.g:3878:2: rule__Assertion__Group_0_0_2_1__1__Impl
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
    // InternalProblem.g:3884:1: rule__Assertion__Group_0_0_2_1__1__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) ) ;
    public final void rule__Assertion__Group_0_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3888:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) ) )
            // InternalProblem.g:3889:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) )
            {
            // InternalProblem.g:3889:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) )
            // InternalProblem.g:3890:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_0_2_1_1()); 
            // InternalProblem.g:3891:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 )
            // InternalProblem.g:3891:3: rule__Assertion__ArgumentsAssignment_0_0_2_1_1
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
    // InternalProblem.g:3900:1: rule__Assertion__Group_0_1__0 : rule__Assertion__Group_0_1__0__Impl rule__Assertion__Group_0_1__1 ;
    public final void rule__Assertion__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3904:1: ( rule__Assertion__Group_0_1__0__Impl rule__Assertion__Group_0_1__1 )
            // InternalProblem.g:3905:2: rule__Assertion__Group_0_1__0__Impl rule__Assertion__Group_0_1__1
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
    // InternalProblem.g:3912:1: rule__Assertion__Group_0_1__0__Impl : ( ( rule__Assertion__ValueAssignment_0_1_0 )? ) ;
    public final void rule__Assertion__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3916:1: ( ( ( rule__Assertion__ValueAssignment_0_1_0 )? ) )
            // InternalProblem.g:3917:1: ( ( rule__Assertion__ValueAssignment_0_1_0 )? )
            {
            // InternalProblem.g:3917:1: ( ( rule__Assertion__ValueAssignment_0_1_0 )? )
            // InternalProblem.g:3918:2: ( rule__Assertion__ValueAssignment_0_1_0 )?
            {
             before(grammarAccess.getAssertionAccess().getValueAssignment_0_1_0()); 
            // InternalProblem.g:3919:2: ( rule__Assertion__ValueAssignment_0_1_0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=26 && LA48_0<=27)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalProblem.g:3919:3: rule__Assertion__ValueAssignment_0_1_0
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
    // InternalProblem.g:3927:1: rule__Assertion__Group_0_1__1 : rule__Assertion__Group_0_1__1__Impl rule__Assertion__Group_0_1__2 ;
    public final void rule__Assertion__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3931:1: ( rule__Assertion__Group_0_1__1__Impl rule__Assertion__Group_0_1__2 )
            // InternalProblem.g:3932:2: rule__Assertion__Group_0_1__1__Impl rule__Assertion__Group_0_1__2
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
    // InternalProblem.g:3939:1: rule__Assertion__Group_0_1__1__Impl : ( ( rule__Assertion__RelationAssignment_0_1_1 ) ) ;
    public final void rule__Assertion__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3943:1: ( ( ( rule__Assertion__RelationAssignment_0_1_1 ) ) )
            // InternalProblem.g:3944:1: ( ( rule__Assertion__RelationAssignment_0_1_1 ) )
            {
            // InternalProblem.g:3944:1: ( ( rule__Assertion__RelationAssignment_0_1_1 ) )
            // InternalProblem.g:3945:2: ( rule__Assertion__RelationAssignment_0_1_1 )
            {
             before(grammarAccess.getAssertionAccess().getRelationAssignment_0_1_1()); 
            // InternalProblem.g:3946:2: ( rule__Assertion__RelationAssignment_0_1_1 )
            // InternalProblem.g:3946:3: rule__Assertion__RelationAssignment_0_1_1
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
    // InternalProblem.g:3954:1: rule__Assertion__Group_0_1__2 : rule__Assertion__Group_0_1__2__Impl rule__Assertion__Group_0_1__3 ;
    public final void rule__Assertion__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3958:1: ( rule__Assertion__Group_0_1__2__Impl rule__Assertion__Group_0_1__3 )
            // InternalProblem.g:3959:2: rule__Assertion__Group_0_1__2__Impl rule__Assertion__Group_0_1__3
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
    // InternalProblem.g:3966:1: rule__Assertion__Group_0_1__2__Impl : ( '(' ) ;
    public final void rule__Assertion__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3970:1: ( ( '(' ) )
            // InternalProblem.g:3971:1: ( '(' )
            {
            // InternalProblem.g:3971:1: ( '(' )
            // InternalProblem.g:3972:2: '('
            {
             before(grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_1_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalProblem.g:3981:1: rule__Assertion__Group_0_1__3 : rule__Assertion__Group_0_1__3__Impl rule__Assertion__Group_0_1__4 ;
    public final void rule__Assertion__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3985:1: ( rule__Assertion__Group_0_1__3__Impl rule__Assertion__Group_0_1__4 )
            // InternalProblem.g:3986:2: rule__Assertion__Group_0_1__3__Impl rule__Assertion__Group_0_1__4
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
    // InternalProblem.g:3993:1: rule__Assertion__Group_0_1__3__Impl : ( ( rule__Assertion__Group_0_1_3__0 )? ) ;
    public final void rule__Assertion__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3997:1: ( ( ( rule__Assertion__Group_0_1_3__0 )? ) )
            // InternalProblem.g:3998:1: ( ( rule__Assertion__Group_0_1_3__0 )? )
            {
            // InternalProblem.g:3998:1: ( ( rule__Assertion__Group_0_1_3__0 )? )
            // InternalProblem.g:3999:2: ( rule__Assertion__Group_0_1_3__0 )?
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_1_3()); 
            // InternalProblem.g:4000:2: ( rule__Assertion__Group_0_1_3__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_INT && LA49_0<=RULE_STRING)||(LA49_0>=19 && LA49_0<=23)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalProblem.g:4000:3: rule__Assertion__Group_0_1_3__0
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
    // InternalProblem.g:4008:1: rule__Assertion__Group_0_1__4 : rule__Assertion__Group_0_1__4__Impl ;
    public final void rule__Assertion__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4012:1: ( rule__Assertion__Group_0_1__4__Impl )
            // InternalProblem.g:4013:2: rule__Assertion__Group_0_1__4__Impl
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
    // InternalProblem.g:4019:1: rule__Assertion__Group_0_1__4__Impl : ( ')' ) ;
    public final void rule__Assertion__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4023:1: ( ( ')' ) )
            // InternalProblem.g:4024:1: ( ')' )
            {
            // InternalProblem.g:4024:1: ( ')' )
            // InternalProblem.g:4025:2: ')'
            {
             before(grammarAccess.getAssertionAccess().getRightParenthesisKeyword_0_1_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalProblem.g:4035:1: rule__Assertion__Group_0_1_3__0 : rule__Assertion__Group_0_1_3__0__Impl rule__Assertion__Group_0_1_3__1 ;
    public final void rule__Assertion__Group_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4039:1: ( rule__Assertion__Group_0_1_3__0__Impl rule__Assertion__Group_0_1_3__1 )
            // InternalProblem.g:4040:2: rule__Assertion__Group_0_1_3__0__Impl rule__Assertion__Group_0_1_3__1
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
    // InternalProblem.g:4047:1: rule__Assertion__Group_0_1_3__0__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) ) ;
    public final void rule__Assertion__Group_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4051:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) ) )
            // InternalProblem.g:4052:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) )
            {
            // InternalProblem.g:4052:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) )
            // InternalProblem.g:4053:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_0 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_1_3_0()); 
            // InternalProblem.g:4054:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_0 )
            // InternalProblem.g:4054:3: rule__Assertion__ArgumentsAssignment_0_1_3_0
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
    // InternalProblem.g:4062:1: rule__Assertion__Group_0_1_3__1 : rule__Assertion__Group_0_1_3__1__Impl ;
    public final void rule__Assertion__Group_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4066:1: ( rule__Assertion__Group_0_1_3__1__Impl )
            // InternalProblem.g:4067:2: rule__Assertion__Group_0_1_3__1__Impl
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
    // InternalProblem.g:4073:1: rule__Assertion__Group_0_1_3__1__Impl : ( ( rule__Assertion__Group_0_1_3_1__0 )* ) ;
    public final void rule__Assertion__Group_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4077:1: ( ( ( rule__Assertion__Group_0_1_3_1__0 )* ) )
            // InternalProblem.g:4078:1: ( ( rule__Assertion__Group_0_1_3_1__0 )* )
            {
            // InternalProblem.g:4078:1: ( ( rule__Assertion__Group_0_1_3_1__0 )* )
            // InternalProblem.g:4079:2: ( rule__Assertion__Group_0_1_3_1__0 )*
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_1_3_1()); 
            // InternalProblem.g:4080:2: ( rule__Assertion__Group_0_1_3_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==13) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalProblem.g:4080:3: rule__Assertion__Group_0_1_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Assertion__Group_0_1_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalProblem.g:4089:1: rule__Assertion__Group_0_1_3_1__0 : rule__Assertion__Group_0_1_3_1__0__Impl rule__Assertion__Group_0_1_3_1__1 ;
    public final void rule__Assertion__Group_0_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4093:1: ( rule__Assertion__Group_0_1_3_1__0__Impl rule__Assertion__Group_0_1_3_1__1 )
            // InternalProblem.g:4094:2: rule__Assertion__Group_0_1_3_1__0__Impl rule__Assertion__Group_0_1_3_1__1
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
    // InternalProblem.g:4101:1: rule__Assertion__Group_0_1_3_1__0__Impl : ( ',' ) ;
    public final void rule__Assertion__Group_0_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4105:1: ( ( ',' ) )
            // InternalProblem.g:4106:1: ( ',' )
            {
            // InternalProblem.g:4106:1: ( ',' )
            // InternalProblem.g:4107:2: ','
            {
             before(grammarAccess.getAssertionAccess().getCommaKeyword_0_1_3_1_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalProblem.g:4116:1: rule__Assertion__Group_0_1_3_1__1 : rule__Assertion__Group_0_1_3_1__1__Impl ;
    public final void rule__Assertion__Group_0_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4120:1: ( rule__Assertion__Group_0_1_3_1__1__Impl )
            // InternalProblem.g:4121:2: rule__Assertion__Group_0_1_3_1__1__Impl
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
    // InternalProblem.g:4127:1: rule__Assertion__Group_0_1_3_1__1__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) ) ;
    public final void rule__Assertion__Group_0_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4131:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) ) )
            // InternalProblem.g:4132:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) )
            {
            // InternalProblem.g:4132:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) )
            // InternalProblem.g:4133:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_1_3_1_1()); 
            // InternalProblem.g:4134:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 )
            // InternalProblem.g:4134:3: rule__Assertion__ArgumentsAssignment_0_1_3_1_1
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
    // InternalProblem.g:4143:1: rule__NodeValueAssertion__Group__0 : rule__NodeValueAssertion__Group__0__Impl rule__NodeValueAssertion__Group__1 ;
    public final void rule__NodeValueAssertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4147:1: ( rule__NodeValueAssertion__Group__0__Impl rule__NodeValueAssertion__Group__1 )
            // InternalProblem.g:4148:2: rule__NodeValueAssertion__Group__0__Impl rule__NodeValueAssertion__Group__1
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
    // InternalProblem.g:4155:1: rule__NodeValueAssertion__Group__0__Impl : ( ( rule__NodeValueAssertion__NodeAssignment_0 ) ) ;
    public final void rule__NodeValueAssertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4159:1: ( ( ( rule__NodeValueAssertion__NodeAssignment_0 ) ) )
            // InternalProblem.g:4160:1: ( ( rule__NodeValueAssertion__NodeAssignment_0 ) )
            {
            // InternalProblem.g:4160:1: ( ( rule__NodeValueAssertion__NodeAssignment_0 ) )
            // InternalProblem.g:4161:2: ( rule__NodeValueAssertion__NodeAssignment_0 )
            {
             before(grammarAccess.getNodeValueAssertionAccess().getNodeAssignment_0()); 
            // InternalProblem.g:4162:2: ( rule__NodeValueAssertion__NodeAssignment_0 )
            // InternalProblem.g:4162:3: rule__NodeValueAssertion__NodeAssignment_0
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
    // InternalProblem.g:4170:1: rule__NodeValueAssertion__Group__1 : rule__NodeValueAssertion__Group__1__Impl rule__NodeValueAssertion__Group__2 ;
    public final void rule__NodeValueAssertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4174:1: ( rule__NodeValueAssertion__Group__1__Impl rule__NodeValueAssertion__Group__2 )
            // InternalProblem.g:4175:2: rule__NodeValueAssertion__Group__1__Impl rule__NodeValueAssertion__Group__2
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
    // InternalProblem.g:4182:1: rule__NodeValueAssertion__Group__1__Impl : ( ':' ) ;
    public final void rule__NodeValueAssertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4186:1: ( ( ':' ) )
            // InternalProblem.g:4187:1: ( ':' )
            {
            // InternalProblem.g:4187:1: ( ':' )
            // InternalProblem.g:4188:2: ':'
            {
             before(grammarAccess.getNodeValueAssertionAccess().getColonKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalProblem.g:4197:1: rule__NodeValueAssertion__Group__2 : rule__NodeValueAssertion__Group__2__Impl rule__NodeValueAssertion__Group__3 ;
    public final void rule__NodeValueAssertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4201:1: ( rule__NodeValueAssertion__Group__2__Impl rule__NodeValueAssertion__Group__3 )
            // InternalProblem.g:4202:2: rule__NodeValueAssertion__Group__2__Impl rule__NodeValueAssertion__Group__3
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
    // InternalProblem.g:4209:1: rule__NodeValueAssertion__Group__2__Impl : ( ( rule__NodeValueAssertion__ValueAssignment_2 ) ) ;
    public final void rule__NodeValueAssertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4213:1: ( ( ( rule__NodeValueAssertion__ValueAssignment_2 ) ) )
            // InternalProblem.g:4214:1: ( ( rule__NodeValueAssertion__ValueAssignment_2 ) )
            {
            // InternalProblem.g:4214:1: ( ( rule__NodeValueAssertion__ValueAssignment_2 ) )
            // InternalProblem.g:4215:2: ( rule__NodeValueAssertion__ValueAssignment_2 )
            {
             before(grammarAccess.getNodeValueAssertionAccess().getValueAssignment_2()); 
            // InternalProblem.g:4216:2: ( rule__NodeValueAssertion__ValueAssignment_2 )
            // InternalProblem.g:4216:3: rule__NodeValueAssertion__ValueAssignment_2
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
    // InternalProblem.g:4224:1: rule__NodeValueAssertion__Group__3 : rule__NodeValueAssertion__Group__3__Impl ;
    public final void rule__NodeValueAssertion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4228:1: ( rule__NodeValueAssertion__Group__3__Impl )
            // InternalProblem.g:4229:2: rule__NodeValueAssertion__Group__3__Impl
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
    // InternalProblem.g:4235:1: rule__NodeValueAssertion__Group__3__Impl : ( '.' ) ;
    public final void rule__NodeValueAssertion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4239:1: ( ( '.' ) )
            // InternalProblem.g:4240:1: ( '.' )
            {
            // InternalProblem.g:4240:1: ( '.' )
            // InternalProblem.g:4241:2: '.'
            {
             before(grammarAccess.getNodeValueAssertionAccess().getFullStopKeyword_3()); 
            match(input,12,FOLLOW_2); 
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
    // InternalProblem.g:4251:1: rule__ScopeDeclaration__Group__0 : rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1 ;
    public final void rule__ScopeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4255:1: ( rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1 )
            // InternalProblem.g:4256:2: rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1
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
    // InternalProblem.g:4263:1: rule__ScopeDeclaration__Group__0__Impl : ( 'scope' ) ;
    public final void rule__ScopeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4267:1: ( ( 'scope' ) )
            // InternalProblem.g:4268:1: ( 'scope' )
            {
            // InternalProblem.g:4268:1: ( 'scope' )
            // InternalProblem.g:4269:2: 'scope'
            {
             before(grammarAccess.getScopeDeclarationAccess().getScopeKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalProblem.g:4278:1: rule__ScopeDeclaration__Group__1 : rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2 ;
    public final void rule__ScopeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4282:1: ( rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2 )
            // InternalProblem.g:4283:2: rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2
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
    // InternalProblem.g:4290:1: rule__ScopeDeclaration__Group__1__Impl : ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) ) ;
    public final void rule__ScopeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4294:1: ( ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) ) )
            // InternalProblem.g:4295:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) )
            {
            // InternalProblem.g:4295:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) )
            // InternalProblem.g:4296:2: ( rule__ScopeDeclaration__TypeScopesAssignment_1 )
            {
             before(grammarAccess.getScopeDeclarationAccess().getTypeScopesAssignment_1()); 
            // InternalProblem.g:4297:2: ( rule__ScopeDeclaration__TypeScopesAssignment_1 )
            // InternalProblem.g:4297:3: rule__ScopeDeclaration__TypeScopesAssignment_1
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
    // InternalProblem.g:4305:1: rule__ScopeDeclaration__Group__2 : rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3 ;
    public final void rule__ScopeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4309:1: ( rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3 )
            // InternalProblem.g:4310:2: rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3
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
    // InternalProblem.g:4317:1: rule__ScopeDeclaration__Group__2__Impl : ( ( rule__ScopeDeclaration__Group_2__0 )* ) ;
    public final void rule__ScopeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4321:1: ( ( ( rule__ScopeDeclaration__Group_2__0 )* ) )
            // InternalProblem.g:4322:1: ( ( rule__ScopeDeclaration__Group_2__0 )* )
            {
            // InternalProblem.g:4322:1: ( ( rule__ScopeDeclaration__Group_2__0 )* )
            // InternalProblem.g:4323:2: ( rule__ScopeDeclaration__Group_2__0 )*
            {
             before(grammarAccess.getScopeDeclarationAccess().getGroup_2()); 
            // InternalProblem.g:4324:2: ( rule__ScopeDeclaration__Group_2__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==13) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalProblem.g:4324:3: rule__ScopeDeclaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ScopeDeclaration__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalProblem.g:4332:1: rule__ScopeDeclaration__Group__3 : rule__ScopeDeclaration__Group__3__Impl ;
    public final void rule__ScopeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4336:1: ( rule__ScopeDeclaration__Group__3__Impl )
            // InternalProblem.g:4337:2: rule__ScopeDeclaration__Group__3__Impl
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
    // InternalProblem.g:4343:1: rule__ScopeDeclaration__Group__3__Impl : ( '.' ) ;
    public final void rule__ScopeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4347:1: ( ( '.' ) )
            // InternalProblem.g:4348:1: ( '.' )
            {
            // InternalProblem.g:4348:1: ( '.' )
            // InternalProblem.g:4349:2: '.'
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
    // InternalProblem.g:4359:1: rule__ScopeDeclaration__Group_2__0 : rule__ScopeDeclaration__Group_2__0__Impl rule__ScopeDeclaration__Group_2__1 ;
    public final void rule__ScopeDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4363:1: ( rule__ScopeDeclaration__Group_2__0__Impl rule__ScopeDeclaration__Group_2__1 )
            // InternalProblem.g:4364:2: rule__ScopeDeclaration__Group_2__0__Impl rule__ScopeDeclaration__Group_2__1
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
    // InternalProblem.g:4371:1: rule__ScopeDeclaration__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ScopeDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4375:1: ( ( ',' ) )
            // InternalProblem.g:4376:1: ( ',' )
            {
            // InternalProblem.g:4376:1: ( ',' )
            // InternalProblem.g:4377:2: ','
            {
             before(grammarAccess.getScopeDeclarationAccess().getCommaKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalProblem.g:4386:1: rule__ScopeDeclaration__Group_2__1 : rule__ScopeDeclaration__Group_2__1__Impl ;
    public final void rule__ScopeDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4390:1: ( rule__ScopeDeclaration__Group_2__1__Impl )
            // InternalProblem.g:4391:2: rule__ScopeDeclaration__Group_2__1__Impl
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
    // InternalProblem.g:4397:1: rule__ScopeDeclaration__Group_2__1__Impl : ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) ) ;
    public final void rule__ScopeDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4401:1: ( ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) ) )
            // InternalProblem.g:4402:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) )
            {
            // InternalProblem.g:4402:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) )
            // InternalProblem.g:4403:2: ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 )
            {
             before(grammarAccess.getScopeDeclarationAccess().getTypeScopesAssignment_2_1()); 
            // InternalProblem.g:4404:2: ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 )
            // InternalProblem.g:4404:3: rule__ScopeDeclaration__TypeScopesAssignment_2_1
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
    // InternalProblem.g:4413:1: rule__TypeScope__Group__0 : rule__TypeScope__Group__0__Impl rule__TypeScope__Group__1 ;
    public final void rule__TypeScope__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4417:1: ( rule__TypeScope__Group__0__Impl rule__TypeScope__Group__1 )
            // InternalProblem.g:4418:2: rule__TypeScope__Group__0__Impl rule__TypeScope__Group__1
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
    // InternalProblem.g:4425:1: rule__TypeScope__Group__0__Impl : ( ( rule__TypeScope__TargetTypeAssignment_0 ) ) ;
    public final void rule__TypeScope__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4429:1: ( ( ( rule__TypeScope__TargetTypeAssignment_0 ) ) )
            // InternalProblem.g:4430:1: ( ( rule__TypeScope__TargetTypeAssignment_0 ) )
            {
            // InternalProblem.g:4430:1: ( ( rule__TypeScope__TargetTypeAssignment_0 ) )
            // InternalProblem.g:4431:2: ( rule__TypeScope__TargetTypeAssignment_0 )
            {
             before(grammarAccess.getTypeScopeAccess().getTargetTypeAssignment_0()); 
            // InternalProblem.g:4432:2: ( rule__TypeScope__TargetTypeAssignment_0 )
            // InternalProblem.g:4432:3: rule__TypeScope__TargetTypeAssignment_0
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
    // InternalProblem.g:4440:1: rule__TypeScope__Group__1 : rule__TypeScope__Group__1__Impl rule__TypeScope__Group__2 ;
    public final void rule__TypeScope__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4444:1: ( rule__TypeScope__Group__1__Impl rule__TypeScope__Group__2 )
            // InternalProblem.g:4445:2: rule__TypeScope__Group__1__Impl rule__TypeScope__Group__2
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
    // InternalProblem.g:4452:1: rule__TypeScope__Group__1__Impl : ( ( rule__TypeScope__Alternatives_1 ) ) ;
    public final void rule__TypeScope__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4456:1: ( ( ( rule__TypeScope__Alternatives_1 ) ) )
            // InternalProblem.g:4457:1: ( ( rule__TypeScope__Alternatives_1 ) )
            {
            // InternalProblem.g:4457:1: ( ( rule__TypeScope__Alternatives_1 ) )
            // InternalProblem.g:4458:2: ( rule__TypeScope__Alternatives_1 )
            {
             before(grammarAccess.getTypeScopeAccess().getAlternatives_1()); 
            // InternalProblem.g:4459:2: ( rule__TypeScope__Alternatives_1 )
            // InternalProblem.g:4459:3: rule__TypeScope__Alternatives_1
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
    // InternalProblem.g:4467:1: rule__TypeScope__Group__2 : rule__TypeScope__Group__2__Impl ;
    public final void rule__TypeScope__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4471:1: ( rule__TypeScope__Group__2__Impl )
            // InternalProblem.g:4472:2: rule__TypeScope__Group__2__Impl
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
    // InternalProblem.g:4478:1: rule__TypeScope__Group__2__Impl : ( ( rule__TypeScope__MultiplicityAssignment_2 ) ) ;
    public final void rule__TypeScope__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4482:1: ( ( ( rule__TypeScope__MultiplicityAssignment_2 ) ) )
            // InternalProblem.g:4483:1: ( ( rule__TypeScope__MultiplicityAssignment_2 ) )
            {
            // InternalProblem.g:4483:1: ( ( rule__TypeScope__MultiplicityAssignment_2 ) )
            // InternalProblem.g:4484:2: ( rule__TypeScope__MultiplicityAssignment_2 )
            {
             before(grammarAccess.getTypeScopeAccess().getMultiplicityAssignment_2()); 
            // InternalProblem.g:4485:2: ( rule__TypeScope__MultiplicityAssignment_2 )
            // InternalProblem.g:4485:3: rule__TypeScope__MultiplicityAssignment_2
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
    // InternalProblem.g:4494:1: rule__RangeMultiplicity__Group__0 : rule__RangeMultiplicity__Group__0__Impl rule__RangeMultiplicity__Group__1 ;
    public final void rule__RangeMultiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4498:1: ( rule__RangeMultiplicity__Group__0__Impl rule__RangeMultiplicity__Group__1 )
            // InternalProblem.g:4499:2: rule__RangeMultiplicity__Group__0__Impl rule__RangeMultiplicity__Group__1
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
    // InternalProblem.g:4506:1: rule__RangeMultiplicity__Group__0__Impl : ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) ) ;
    public final void rule__RangeMultiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4510:1: ( ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) ) )
            // InternalProblem.g:4511:1: ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) )
            {
            // InternalProblem.g:4511:1: ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) )
            // InternalProblem.g:4512:2: ( rule__RangeMultiplicity__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getRangeMultiplicityAccess().getLowerBoundAssignment_0()); 
            // InternalProblem.g:4513:2: ( rule__RangeMultiplicity__LowerBoundAssignment_0 )
            // InternalProblem.g:4513:3: rule__RangeMultiplicity__LowerBoundAssignment_0
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
    // InternalProblem.g:4521:1: rule__RangeMultiplicity__Group__1 : rule__RangeMultiplicity__Group__1__Impl rule__RangeMultiplicity__Group__2 ;
    public final void rule__RangeMultiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4525:1: ( rule__RangeMultiplicity__Group__1__Impl rule__RangeMultiplicity__Group__2 )
            // InternalProblem.g:4526:2: rule__RangeMultiplicity__Group__1__Impl rule__RangeMultiplicity__Group__2
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
    // InternalProblem.g:4533:1: rule__RangeMultiplicity__Group__1__Impl : ( '..' ) ;
    public final void rule__RangeMultiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4537:1: ( ( '..' ) )
            // InternalProblem.g:4538:1: ( '..' )
            {
            // InternalProblem.g:4538:1: ( '..' )
            // InternalProblem.g:4539:2: '..'
            {
             before(grammarAccess.getRangeMultiplicityAccess().getFullStopFullStopKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalProblem.g:4548:1: rule__RangeMultiplicity__Group__2 : rule__RangeMultiplicity__Group__2__Impl ;
    public final void rule__RangeMultiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4552:1: ( rule__RangeMultiplicity__Group__2__Impl )
            // InternalProblem.g:4553:2: rule__RangeMultiplicity__Group__2__Impl
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
    // InternalProblem.g:4559:1: rule__RangeMultiplicity__Group__2__Impl : ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) ) ;
    public final void rule__RangeMultiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4563:1: ( ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) ) )
            // InternalProblem.g:4564:1: ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) )
            {
            // InternalProblem.g:4564:1: ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) )
            // InternalProblem.g:4565:2: ( rule__RangeMultiplicity__UpperBoundAssignment_2 )
            {
             before(grammarAccess.getRangeMultiplicityAccess().getUpperBoundAssignment_2()); 
            // InternalProblem.g:4566:2: ( rule__RangeMultiplicity__UpperBoundAssignment_2 )
            // InternalProblem.g:4566:3: rule__RangeMultiplicity__UpperBoundAssignment_2
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
    // InternalProblem.g:4575:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4579:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalProblem.g:4580:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalProblem.g:4587:1: rule__QualifiedName__Group_1__0__Impl : ( ruleIdentifier ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4591:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:4592:1: ( ruleIdentifier )
            {
            // InternalProblem.g:4592:1: ( ruleIdentifier )
            // InternalProblem.g:4593:2: ruleIdentifier
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
    // InternalProblem.g:4602:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4606:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalProblem.g:4607:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalProblem.g:4613:1: rule__QualifiedName__Group_1__1__Impl : ( ( rule__QualifiedName__Group_1_1__0 )* ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4617:1: ( ( ( rule__QualifiedName__Group_1_1__0 )* ) )
            // InternalProblem.g:4618:1: ( ( rule__QualifiedName__Group_1_1__0 )* )
            {
            // InternalProblem.g:4618:1: ( ( rule__QualifiedName__Group_1_1__0 )* )
            // InternalProblem.g:4619:2: ( rule__QualifiedName__Group_1_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1_1()); 
            // InternalProblem.g:4620:2: ( rule__QualifiedName__Group_1_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==43) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalProblem.g:4620:3: rule__QualifiedName__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__QualifiedName__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalProblem.g:4629:1: rule__QualifiedName__Group_1_1__0 : rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1 ;
    public final void rule__QualifiedName__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4633:1: ( rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1 )
            // InternalProblem.g:4634:2: rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1
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
    // InternalProblem.g:4641:1: rule__QualifiedName__Group_1_1__0__Impl : ( '::' ) ;
    public final void rule__QualifiedName__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4645:1: ( ( '::' ) )
            // InternalProblem.g:4646:1: ( '::' )
            {
            // InternalProblem.g:4646:1: ( '::' )
            // InternalProblem.g:4647:2: '::'
            {
             before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalProblem.g:4656:1: rule__QualifiedName__Group_1_1__1 : rule__QualifiedName__Group_1_1__1__Impl ;
    public final void rule__QualifiedName__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4660:1: ( rule__QualifiedName__Group_1_1__1__Impl )
            // InternalProblem.g:4661:2: rule__QualifiedName__Group_1_1__1__Impl
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
    // InternalProblem.g:4667:1: rule__QualifiedName__Group_1_1__1__Impl : ( ruleIdentifier ) ;
    public final void rule__QualifiedName__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4671:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:4672:1: ( ruleIdentifier )
            {
            // InternalProblem.g:4672:1: ( ruleIdentifier )
            // InternalProblem.g:4673:2: ruleIdentifier
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
    // InternalProblem.g:4683:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4687:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalProblem.g:4688:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
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
    // InternalProblem.g:4695:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4699:1: ( ( ( '-' )? ) )
            // InternalProblem.g:4700:1: ( ( '-' )? )
            {
            // InternalProblem.g:4700:1: ( ( '-' )? )
            // InternalProblem.g:4701:2: ( '-' )?
            {
             before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            // InternalProblem.g:4702:2: ( '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==23) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalProblem.g:4702:3: '-'
                    {
                    match(input,23,FOLLOW_2); 

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
    // InternalProblem.g:4710:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4714:1: ( rule__Integer__Group__1__Impl )
            // InternalProblem.g:4715:2: rule__Integer__Group__1__Impl
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
    // InternalProblem.g:4721:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4725:1: ( ( RULE_INT ) )
            // InternalProblem.g:4726:1: ( RULE_INT )
            {
            // InternalProblem.g:4726:1: ( RULE_INT )
            // InternalProblem.g:4727:2: RULE_INT
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
    // InternalProblem.g:4737:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4741:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // InternalProblem.g:4742:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalProblem.g:4749:1: rule__Real__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4753:1: ( ( ( '-' )? ) )
            // InternalProblem.g:4754:1: ( ( '-' )? )
            {
            // InternalProblem.g:4754:1: ( ( '-' )? )
            // InternalProblem.g:4755:2: ( '-' )?
            {
             before(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
            // InternalProblem.g:4756:2: ( '-' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==23) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalProblem.g:4756:3: '-'
                    {
                    match(input,23,FOLLOW_2); 

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
    // InternalProblem.g:4764:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4768:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // InternalProblem.g:4769:2: rule__Real__Group__1__Impl rule__Real__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__Real__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group__2();

            state._fsp--;


            }

        }
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
    // InternalProblem.g:4776:1: rule__Real__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4780:1: ( ( RULE_INT ) )
            // InternalProblem.g:4781:1: ( RULE_INT )
            {
            // InternalProblem.g:4781:1: ( RULE_INT )
            // InternalProblem.g:4782:2: RULE_INT
            {
             before(grammarAccess.getRealAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Real__Group__2"
    // InternalProblem.g:4791:1: rule__Real__Group__2 : rule__Real__Group__2__Impl ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4795:1: ( rule__Real__Group__2__Impl )
            // InternalProblem.g:4796:2: rule__Real__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__2"


    // $ANTLR start "rule__Real__Group__2__Impl"
    // InternalProblem.g:4802:1: rule__Real__Group__2__Impl : ( ( rule__Real__Alternatives_2 ) ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4806:1: ( ( ( rule__Real__Alternatives_2 ) ) )
            // InternalProblem.g:4807:1: ( ( rule__Real__Alternatives_2 ) )
            {
            // InternalProblem.g:4807:1: ( ( rule__Real__Alternatives_2 ) )
            // InternalProblem.g:4808:2: ( rule__Real__Alternatives_2 )
            {
             before(grammarAccess.getRealAccess().getAlternatives_2()); 
            // InternalProblem.g:4809:2: ( rule__Real__Alternatives_2 )
            // InternalProblem.g:4809:3: rule__Real__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Real__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__2__Impl"


    // $ANTLR start "rule__Real__Group_2_0__0"
    // InternalProblem.g:4818:1: rule__Real__Group_2_0__0 : rule__Real__Group_2_0__0__Impl rule__Real__Group_2_0__1 ;
    public final void rule__Real__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4822:1: ( rule__Real__Group_2_0__0__Impl rule__Real__Group_2_0__1 )
            // InternalProblem.g:4823:2: rule__Real__Group_2_0__0__Impl rule__Real__Group_2_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Real__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_2_0__0"


    // $ANTLR start "rule__Real__Group_2_0__0__Impl"
    // InternalProblem.g:4830:1: rule__Real__Group_2_0__0__Impl : ( '.' ) ;
    public final void rule__Real__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4834:1: ( ( '.' ) )
            // InternalProblem.g:4835:1: ( '.' )
            {
            // InternalProblem.g:4835:1: ( '.' )
            // InternalProblem.g:4836:2: '.'
            {
             before(grammarAccess.getRealAccess().getFullStopKeyword_2_0_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getFullStopKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_2_0__0__Impl"


    // $ANTLR start "rule__Real__Group_2_0__1"
    // InternalProblem.g:4845:1: rule__Real__Group_2_0__1 : rule__Real__Group_2_0__1__Impl ;
    public final void rule__Real__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4849:1: ( rule__Real__Group_2_0__1__Impl )
            // InternalProblem.g:4850:2: rule__Real__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_2_0__1"


    // $ANTLR start "rule__Real__Group_2_0__1__Impl"
    // InternalProblem.g:4856:1: rule__Real__Group_2_0__1__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4860:1: ( ( RULE_INT ) )
            // InternalProblem.g:4861:1: ( RULE_INT )
            {
            // InternalProblem.g:4861:1: ( RULE_INT )
            // InternalProblem.g:4862:2: RULE_INT
            {
             before(grammarAccess.getRealAccess().getINTTerminalRuleCall_2_0_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getINTTerminalRuleCall_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_2_0__1__Impl"


    // $ANTLR start "rule__Real__Group_2_1__0"
    // InternalProblem.g:4872:1: rule__Real__Group_2_1__0 : rule__Real__Group_2_1__0__Impl rule__Real__Group_2_1__1 ;
    public final void rule__Real__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4876:1: ( rule__Real__Group_2_1__0__Impl rule__Real__Group_2_1__1 )
            // InternalProblem.g:4877:2: rule__Real__Group_2_1__0__Impl rule__Real__Group_2_1__1
            {
            pushFollow(FOLLOW_42);
            rule__Real__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_2_1__0"


    // $ANTLR start "rule__Real__Group_2_1__0__Impl"
    // InternalProblem.g:4884:1: rule__Real__Group_2_1__0__Impl : ( ( rule__Real__Group_2_1_0__0 )? ) ;
    public final void rule__Real__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4888:1: ( ( ( rule__Real__Group_2_1_0__0 )? ) )
            // InternalProblem.g:4889:1: ( ( rule__Real__Group_2_1_0__0 )? )
            {
            // InternalProblem.g:4889:1: ( ( rule__Real__Group_2_1_0__0 )? )
            // InternalProblem.g:4890:2: ( rule__Real__Group_2_1_0__0 )?
            {
             before(grammarAccess.getRealAccess().getGroup_2_1_0()); 
            // InternalProblem.g:4891:2: ( rule__Real__Group_2_1_0__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==12) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalProblem.g:4891:3: rule__Real__Group_2_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Real__Group_2_1_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRealAccess().getGroup_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_2_1__0__Impl"


    // $ANTLR start "rule__Real__Group_2_1__1"
    // InternalProblem.g:4899:1: rule__Real__Group_2_1__1 : rule__Real__Group_2_1__1__Impl rule__Real__Group_2_1__2 ;
    public final void rule__Real__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4903:1: ( rule__Real__Group_2_1__1__Impl rule__Real__Group_2_1__2 )
            // InternalProblem.g:4904:2: rule__Real__Group_2_1__1__Impl rule__Real__Group_2_1__2
            {
            pushFollow(FOLLOW_43);
            rule__Real__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_2_1__1"


    // $ANTLR start "rule__Real__Group_2_1__1__Impl"
    // InternalProblem.g:4911:1: rule__Real__Group_2_1__1__Impl : ( ( rule__Real__Alternatives_2_1_1 ) ) ;
    public final void rule__Real__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4915:1: ( ( ( rule__Real__Alternatives_2_1_1 ) ) )
            // InternalProblem.g:4916:1: ( ( rule__Real__Alternatives_2_1_1 ) )
            {
            // InternalProblem.g:4916:1: ( ( rule__Real__Alternatives_2_1_1 ) )
            // InternalProblem.g:4917:2: ( rule__Real__Alternatives_2_1_1 )
            {
             before(grammarAccess.getRealAccess().getAlternatives_2_1_1()); 
            // InternalProblem.g:4918:2: ( rule__Real__Alternatives_2_1_1 )
            // InternalProblem.g:4918:3: rule__Real__Alternatives_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Real__Alternatives_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getAlternatives_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_2_1__1__Impl"


    // $ANTLR start "rule__Real__Group_2_1__2"
    // InternalProblem.g:4926:1: rule__Real__Group_2_1__2 : rule__Real__Group_2_1__2__Impl rule__Real__Group_2_1__3 ;
    public final void rule__Real__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4930:1: ( rule__Real__Group_2_1__2__Impl rule__Real__Group_2_1__3 )
            // InternalProblem.g:4931:2: rule__Real__Group_2_1__2__Impl rule__Real__Group_2_1__3
            {
            pushFollow(FOLLOW_43);
            rule__Real__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_2_1__2"


    // $ANTLR start "rule__Real__Group_2_1__2__Impl"
    // InternalProblem.g:4938:1: rule__Real__Group_2_1__2__Impl : ( ( rule__Real__Alternatives_2_1_2 )? ) ;
    public final void rule__Real__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4942:1: ( ( ( rule__Real__Alternatives_2_1_2 )? ) )
            // InternalProblem.g:4943:1: ( ( rule__Real__Alternatives_2_1_2 )? )
            {
            // InternalProblem.g:4943:1: ( ( rule__Real__Alternatives_2_1_2 )? )
            // InternalProblem.g:4944:2: ( rule__Real__Alternatives_2_1_2 )?
            {
             before(grammarAccess.getRealAccess().getAlternatives_2_1_2()); 
            // InternalProblem.g:4945:2: ( rule__Real__Alternatives_2_1_2 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=23 && LA56_0<=24)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalProblem.g:4945:3: rule__Real__Alternatives_2_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Real__Alternatives_2_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRealAccess().getAlternatives_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_2_1__2__Impl"


    // $ANTLR start "rule__Real__Group_2_1__3"
    // InternalProblem.g:4953:1: rule__Real__Group_2_1__3 : rule__Real__Group_2_1__3__Impl ;
    public final void rule__Real__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4957:1: ( rule__Real__Group_2_1__3__Impl )
            // InternalProblem.g:4958:2: rule__Real__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group_2_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_2_1__3"


    // $ANTLR start "rule__Real__Group_2_1__3__Impl"
    // InternalProblem.g:4964:1: rule__Real__Group_2_1__3__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4968:1: ( ( RULE_INT ) )
            // InternalProblem.g:4969:1: ( RULE_INT )
            {
            // InternalProblem.g:4969:1: ( RULE_INT )
            // InternalProblem.g:4970:2: RULE_INT
            {
             before(grammarAccess.getRealAccess().getINTTerminalRuleCall_2_1_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getINTTerminalRuleCall_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_2_1__3__Impl"


    // $ANTLR start "rule__Real__Group_2_1_0__0"
    // InternalProblem.g:4980:1: rule__Real__Group_2_1_0__0 : rule__Real__Group_2_1_0__0__Impl rule__Real__Group_2_1_0__1 ;
    public final void rule__Real__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4984:1: ( rule__Real__Group_2_1_0__0__Impl rule__Real__Group_2_1_0__1 )
            // InternalProblem.g:4985:2: rule__Real__Group_2_1_0__0__Impl rule__Real__Group_2_1_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Real__Group_2_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group_2_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_2_1_0__0"


    // $ANTLR start "rule__Real__Group_2_1_0__0__Impl"
    // InternalProblem.g:4992:1: rule__Real__Group_2_1_0__0__Impl : ( '.' ) ;
    public final void rule__Real__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4996:1: ( ( '.' ) )
            // InternalProblem.g:4997:1: ( '.' )
            {
            // InternalProblem.g:4997:1: ( '.' )
            // InternalProblem.g:4998:2: '.'
            {
             before(grammarAccess.getRealAccess().getFullStopKeyword_2_1_0_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getFullStopKeyword_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_2_1_0__0__Impl"


    // $ANTLR start "rule__Real__Group_2_1_0__1"
    // InternalProblem.g:5007:1: rule__Real__Group_2_1_0__1 : rule__Real__Group_2_1_0__1__Impl ;
    public final void rule__Real__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5011:1: ( rule__Real__Group_2_1_0__1__Impl )
            // InternalProblem.g:5012:2: rule__Real__Group_2_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group_2_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_2_1_0__1"


    // $ANTLR start "rule__Real__Group_2_1_0__1__Impl"
    // InternalProblem.g:5018:1: rule__Real__Group_2_1_0__1__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5022:1: ( ( RULE_INT ) )
            // InternalProblem.g:5023:1: ( RULE_INT )
            {
            // InternalProblem.g:5023:1: ( RULE_INT )
            // InternalProblem.g:5024:2: RULE_INT
            {
             before(grammarAccess.getRealAccess().getINTTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getINTTerminalRuleCall_2_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_2_1_0__1__Impl"


    // $ANTLR start "rule__Problem__NameAssignment_0_1"
    // InternalProblem.g:5034:1: rule__Problem__NameAssignment_0_1 : ( ruleIdentifier ) ;
    public final void rule__Problem__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5038:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:5039:2: ( ruleIdentifier )
            {
            // InternalProblem.g:5039:2: ( ruleIdentifier )
            // InternalProblem.g:5040:3: ruleIdentifier
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
    // InternalProblem.g:5049:1: rule__Problem__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Problem__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5053:1: ( ( ruleStatement ) )
            // InternalProblem.g:5054:2: ( ruleStatement )
            {
            // InternalProblem.g:5054:2: ( ruleStatement )
            // InternalProblem.g:5055:3: ruleStatement
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
    // InternalProblem.g:5064:1: rule__ClassDeclaration__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ClassDeclaration__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5068:1: ( ( ( 'abstract' ) ) )
            // InternalProblem.g:5069:2: ( ( 'abstract' ) )
            {
            // InternalProblem.g:5069:2: ( ( 'abstract' ) )
            // InternalProblem.g:5070:3: ( 'abstract' )
            {
             before(grammarAccess.getClassDeclarationAccess().getAbstractAbstractKeyword_0_0()); 
            // InternalProblem.g:5071:3: ( 'abstract' )
            // InternalProblem.g:5072:4: 'abstract'
            {
             before(grammarAccess.getClassDeclarationAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalProblem.g:5083:1: rule__ClassDeclaration__NameAssignment_2 : ( ruleIdentifier ) ;
    public final void rule__ClassDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5087:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:5088:2: ( ruleIdentifier )
            {
            // InternalProblem.g:5088:2: ( ruleIdentifier )
            // InternalProblem.g:5089:3: ruleIdentifier
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
    // InternalProblem.g:5098:1: rule__ClassDeclaration__SuperTypesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassDeclaration__SuperTypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5102:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5103:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5103:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5104:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesRelationCrossReference_3_1_0()); 
            // InternalProblem.g:5105:3: ( ruleQualifiedName )
            // InternalProblem.g:5106:4: ruleQualifiedName
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
    // InternalProblem.g:5117:1: rule__ClassDeclaration__SuperTypesAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassDeclaration__SuperTypesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5121:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5122:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5122:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5123:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesRelationCrossReference_3_2_1_0()); 
            // InternalProblem.g:5124:3: ( ruleQualifiedName )
            // InternalProblem.g:5125:4: ruleQualifiedName
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
    // InternalProblem.g:5136:1: rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 : ( ruleReferenceDeclaration ) ;
    public final void rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5140:1: ( ( ruleReferenceDeclaration ) )
            // InternalProblem.g:5141:2: ( ruleReferenceDeclaration )
            {
            // InternalProblem.g:5141:2: ( ruleReferenceDeclaration )
            // InternalProblem.g:5142:3: ruleReferenceDeclaration
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
    // InternalProblem.g:5151:1: rule__EnumDeclaration__NameAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__EnumDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5155:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:5156:2: ( ruleIdentifier )
            {
            // InternalProblem.g:5156:2: ( ruleIdentifier )
            // InternalProblem.g:5157:3: ruleIdentifier
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
    // InternalProblem.g:5166:1: rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 : ( ruleEnumLiteral ) ;
    public final void rule__EnumDeclaration__LiteralsAssignment_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5170:1: ( ( ruleEnumLiteral ) )
            // InternalProblem.g:5171:2: ( ruleEnumLiteral )
            {
            // InternalProblem.g:5171:2: ( ruleEnumLiteral )
            // InternalProblem.g:5172:3: ruleEnumLiteral
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
    // InternalProblem.g:5181:1: rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 : ( ruleEnumLiteral ) ;
    public final void rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5185:1: ( ( ruleEnumLiteral ) )
            // InternalProblem.g:5186:2: ( ruleEnumLiteral )
            {
            // InternalProblem.g:5186:2: ( ruleEnumLiteral )
            // InternalProblem.g:5187:3: ruleEnumLiteral
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
    // InternalProblem.g:5196:1: rule__EnumLiteral__NameAssignment : ( ruleIdentifier ) ;
    public final void rule__EnumLiteral__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5200:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:5201:2: ( ruleIdentifier )
            {
            // InternalProblem.g:5201:2: ( ruleIdentifier )
            // InternalProblem.g:5202:3: ruleIdentifier
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
    // InternalProblem.g:5211:1: rule__ReferenceDeclaration__ContainmentAssignment_0_0 : ( ( 'contains' ) ) ;
    public final void rule__ReferenceDeclaration__ContainmentAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5215:1: ( ( ( 'contains' ) ) )
            // InternalProblem.g:5216:2: ( ( 'contains' ) )
            {
            // InternalProblem.g:5216:2: ( ( 'contains' ) )
            // InternalProblem.g:5217:3: ( 'contains' )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getContainmentContainsKeyword_0_0_0()); 
            // InternalProblem.g:5218:3: ( 'contains' )
            // InternalProblem.g:5219:4: 'contains'
            {
             before(grammarAccess.getReferenceDeclarationAccess().getContainmentContainsKeyword_0_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalProblem.g:5230:1: rule__ReferenceDeclaration__ReferenceTypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceDeclaration__ReferenceTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5234:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5235:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5235:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5236:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeRelationCrossReference_1_0()); 
            // InternalProblem.g:5237:3: ( ruleQualifiedName )
            // InternalProblem.g:5238:4: ruleQualifiedName
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
    // InternalProblem.g:5249:1: rule__ReferenceDeclaration__MultiplicityAssignment_2_1 : ( ruleMultiplicity ) ;
    public final void rule__ReferenceDeclaration__MultiplicityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5253:1: ( ( ruleMultiplicity ) )
            // InternalProblem.g:5254:2: ( ruleMultiplicity )
            {
            // InternalProblem.g:5254:2: ( ruleMultiplicity )
            // InternalProblem.g:5255:3: ruleMultiplicity
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
    // InternalProblem.g:5264:1: rule__ReferenceDeclaration__NameAssignment_3 : ( ruleIdentifier ) ;
    public final void rule__ReferenceDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5268:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:5269:2: ( ruleIdentifier )
            {
            // InternalProblem.g:5269:2: ( ruleIdentifier )
            // InternalProblem.g:5270:3: ruleIdentifier
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
    // InternalProblem.g:5279:1: rule__ReferenceDeclaration__OppositeAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceDeclaration__OppositeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5283:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5284:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5284:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5285:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getOppositeReferenceDeclarationCrossReference_4_1_0()); 
            // InternalProblem.g:5286:3: ( ruleQualifiedName )
            // InternalProblem.g:5287:4: ruleQualifiedName
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
    // InternalProblem.g:5298:1: rule__PredicateDefinition__ErrorAssignment_0_0_0 : ( ( 'error' ) ) ;
    public final void rule__PredicateDefinition__ErrorAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5302:1: ( ( ( 'error' ) ) )
            // InternalProblem.g:5303:2: ( ( 'error' ) )
            {
            // InternalProblem.g:5303:2: ( ( 'error' ) )
            // InternalProblem.g:5304:3: ( 'error' )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_0_0_0()); 
            // InternalProblem.g:5305:3: ( 'error' )
            // InternalProblem.g:5306:4: 'error'
            {
             before(grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_0_0_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalProblem.g:5317:1: rule__PredicateDefinition__NameAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__PredicateDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5321:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:5322:2: ( ruleIdentifier )
            {
            // InternalProblem.g:5322:2: ( ruleIdentifier )
            // InternalProblem.g:5323:3: ruleIdentifier
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
    // InternalProblem.g:5332:1: rule__PredicateDefinition__ParametersAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__PredicateDefinition__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5336:1: ( ( ruleParameter ) )
            // InternalProblem.g:5337:2: ( ruleParameter )
            {
            // InternalProblem.g:5337:2: ( ruleParameter )
            // InternalProblem.g:5338:3: ruleParameter
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
    // InternalProblem.g:5347:1: rule__PredicateDefinition__ParametersAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__PredicateDefinition__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5351:1: ( ( ruleParameter ) )
            // InternalProblem.g:5352:2: ( ruleParameter )
            {
            // InternalProblem.g:5352:2: ( ruleParameter )
            // InternalProblem.g:5353:3: ruleParameter
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
    // InternalProblem.g:5362:1: rule__PredicateDefinition__BodiesAssignment_5_1 : ( ruleConjunction ) ;
    public final void rule__PredicateDefinition__BodiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5366:1: ( ( ruleConjunction ) )
            // InternalProblem.g:5367:2: ( ruleConjunction )
            {
            // InternalProblem.g:5367:2: ( ruleConjunction )
            // InternalProblem.g:5368:3: ruleConjunction
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
    // InternalProblem.g:5377:1: rule__PredicateDefinition__BodiesAssignment_5_2_1 : ( ruleConjunction ) ;
    public final void rule__PredicateDefinition__BodiesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5381:1: ( ( ruleConjunction ) )
            // InternalProblem.g:5382:2: ( ruleConjunction )
            {
            // InternalProblem.g:5382:2: ( ruleConjunction )
            // InternalProblem.g:5383:3: ruleConjunction
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
    // InternalProblem.g:5392:1: rule__Parameter__ParameterTypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Parameter__ParameterTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5396:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5397:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5397:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5398:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getParameterAccess().getParameterTypeRelationCrossReference_0_0()); 
            // InternalProblem.g:5399:3: ( ruleQualifiedName )
            // InternalProblem.g:5400:4: ruleQualifiedName
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
    // InternalProblem.g:5411:1: rule__Parameter__NameAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5415:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:5416:2: ( ruleIdentifier )
            {
            // InternalProblem.g:5416:2: ( ruleIdentifier )
            // InternalProblem.g:5417:3: ruleIdentifier
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
    // InternalProblem.g:5426:1: rule__Conjunction__LiteralsAssignment_0 : ( ruleLiteral ) ;
    public final void rule__Conjunction__LiteralsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5430:1: ( ( ruleLiteral ) )
            // InternalProblem.g:5431:2: ( ruleLiteral )
            {
            // InternalProblem.g:5431:2: ( ruleLiteral )
            // InternalProblem.g:5432:3: ruleLiteral
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
    // InternalProblem.g:5441:1: rule__Conjunction__LiteralsAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__Conjunction__LiteralsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5445:1: ( ( ruleLiteral ) )
            // InternalProblem.g:5446:2: ( ruleLiteral )
            {
            // InternalProblem.g:5446:2: ( ruleLiteral )
            // InternalProblem.g:5447:3: ruleLiteral
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
    // InternalProblem.g:5456:1: rule__NegativeLiteral__AtomAssignment_1 : ( ruleAtom ) ;
    public final void rule__NegativeLiteral__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5460:1: ( ( ruleAtom ) )
            // InternalProblem.g:5461:2: ( ruleAtom )
            {
            // InternalProblem.g:5461:2: ( ruleAtom )
            // InternalProblem.g:5462:3: ruleAtom
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
    // InternalProblem.g:5471:1: rule__Atom__RelationAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Atom__RelationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5475:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5476:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5476:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5477:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAtomAccess().getRelationRelationCrossReference_0_0()); 
            // InternalProblem.g:5478:3: ( ruleQualifiedName )
            // InternalProblem.g:5479:4: ruleQualifiedName
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
    // InternalProblem.g:5490:1: rule__Atom__TransitiveClosureAssignment_1 : ( ( '+' ) ) ;
    public final void rule__Atom__TransitiveClosureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5494:1: ( ( ( '+' ) ) )
            // InternalProblem.g:5495:2: ( ( '+' ) )
            {
            // InternalProblem.g:5495:2: ( ( '+' ) )
            // InternalProblem.g:5496:3: ( '+' )
            {
             before(grammarAccess.getAtomAccess().getTransitiveClosurePlusSignKeyword_1_0()); 
            // InternalProblem.g:5497:3: ( '+' )
            // InternalProblem.g:5498:4: '+'
            {
             before(grammarAccess.getAtomAccess().getTransitiveClosurePlusSignKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalProblem.g:5509:1: rule__Atom__ArgumentsAssignment_3_0 : ( ruleArgument ) ;
    public final void rule__Atom__ArgumentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5513:1: ( ( ruleArgument ) )
            // InternalProblem.g:5514:2: ( ruleArgument )
            {
            // InternalProblem.g:5514:2: ( ruleArgument )
            // InternalProblem.g:5515:3: ruleArgument
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
    // InternalProblem.g:5524:1: rule__Atom__ArgumentsAssignment_3_1_1 : ( ruleArgument ) ;
    public final void rule__Atom__ArgumentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5528:1: ( ( ruleArgument ) )
            // InternalProblem.g:5529:2: ( ruleArgument )
            {
            // InternalProblem.g:5529:2: ( ruleArgument )
            // InternalProblem.g:5530:3: ruleArgument
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
    // InternalProblem.g:5539:1: rule__VariableOrNodeArgument__VariableOrNodeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__VariableOrNodeArgument__VariableOrNodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5543:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5544:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5544:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5545:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getVariableOrNodeArgumentAccess().getVariableOrNodeVariableOrNodeCrossReference_0()); 
            // InternalProblem.g:5546:3: ( ruleQualifiedName )
            // InternalProblem.g:5547:4: ruleQualifiedName
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
    // InternalProblem.g:5558:1: rule__ConstantArgument__ConstantAssignment : ( ruleConstant ) ;
    public final void rule__ConstantArgument__ConstantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5562:1: ( ( ruleConstant ) )
            // InternalProblem.g:5563:2: ( ruleConstant )
            {
            // InternalProblem.g:5563:2: ( ruleConstant )
            // InternalProblem.g:5564:3: ruleConstant
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
    // InternalProblem.g:5573:1: rule__Assertion__RelationAssignment_0_0_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__RelationAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5577:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5578:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5578:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5579:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getRelationRelationCrossReference_0_0_0_0()); 
            // InternalProblem.g:5580:3: ( ruleQualifiedName )
            // InternalProblem.g:5581:4: ruleQualifiedName
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
    // InternalProblem.g:5592:1: rule__Assertion__ArgumentsAssignment_0_0_2_0 : ( ruleAssertionArgument ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5596:1: ( ( ruleAssertionArgument ) )
            // InternalProblem.g:5597:2: ( ruleAssertionArgument )
            {
            // InternalProblem.g:5597:2: ( ruleAssertionArgument )
            // InternalProblem.g:5598:3: ruleAssertionArgument
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
    // InternalProblem.g:5607:1: rule__Assertion__ArgumentsAssignment_0_0_2_1_1 : ( ruleAssertionArgument ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5611:1: ( ( ruleAssertionArgument ) )
            // InternalProblem.g:5612:2: ( ruleAssertionArgument )
            {
            // InternalProblem.g:5612:2: ( ruleAssertionArgument )
            // InternalProblem.g:5613:3: ruleAssertionArgument
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
    // InternalProblem.g:5622:1: rule__Assertion__ValueAssignment_0_0_5 : ( ruleLogicValue ) ;
    public final void rule__Assertion__ValueAssignment_0_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5626:1: ( ( ruleLogicValue ) )
            // InternalProblem.g:5627:2: ( ruleLogicValue )
            {
            // InternalProblem.g:5627:2: ( ruleLogicValue )
            // InternalProblem.g:5628:3: ruleLogicValue
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
    // InternalProblem.g:5637:1: rule__Assertion__ValueAssignment_0_1_0 : ( ruleShortLogicValue ) ;
    public final void rule__Assertion__ValueAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5641:1: ( ( ruleShortLogicValue ) )
            // InternalProblem.g:5642:2: ( ruleShortLogicValue )
            {
            // InternalProblem.g:5642:2: ( ruleShortLogicValue )
            // InternalProblem.g:5643:3: ruleShortLogicValue
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
    // InternalProblem.g:5652:1: rule__Assertion__RelationAssignment_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__RelationAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5656:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5657:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5657:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5658:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getRelationRelationCrossReference_0_1_1_0()); 
            // InternalProblem.g:5659:3: ( ruleQualifiedName )
            // InternalProblem.g:5660:4: ruleQualifiedName
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
    // InternalProblem.g:5671:1: rule__Assertion__ArgumentsAssignment_0_1_3_0 : ( ruleAssertionArgument ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5675:1: ( ( ruleAssertionArgument ) )
            // InternalProblem.g:5676:2: ( ruleAssertionArgument )
            {
            // InternalProblem.g:5676:2: ( ruleAssertionArgument )
            // InternalProblem.g:5677:3: ruleAssertionArgument
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
    // InternalProblem.g:5686:1: rule__Assertion__ArgumentsAssignment_0_1_3_1_1 : ( ruleAssertionArgument ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_1_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5690:1: ( ( ruleAssertionArgument ) )
            // InternalProblem.g:5691:2: ( ruleAssertionArgument )
            {
            // InternalProblem.g:5691:2: ( ruleAssertionArgument )
            // InternalProblem.g:5692:3: ruleAssertionArgument
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
    // InternalProblem.g:5701:1: rule__NodeAssertionArgument__NodeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__NodeAssertionArgument__NodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5705:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5706:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5706:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5707:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNodeAssertionArgumentAccess().getNodeNodeCrossReference_0()); 
            // InternalProblem.g:5708:3: ( ruleQualifiedName )
            // InternalProblem.g:5709:4: ruleQualifiedName
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
    // InternalProblem.g:5720:1: rule__ConstantAssertionArgument__ConstantAssignment : ( ruleConstant ) ;
    public final void rule__ConstantAssertionArgument__ConstantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5724:1: ( ( ruleConstant ) )
            // InternalProblem.g:5725:2: ( ruleConstant )
            {
            // InternalProblem.g:5725:2: ( ruleConstant )
            // InternalProblem.g:5726:3: ruleConstant
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
    // InternalProblem.g:5735:1: rule__NodeValueAssertion__NodeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NodeValueAssertion__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5739:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5740:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5740:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5741:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNodeValueAssertionAccess().getNodeNodeCrossReference_0_0()); 
            // InternalProblem.g:5742:3: ( ruleQualifiedName )
            // InternalProblem.g:5743:4: ruleQualifiedName
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
    // InternalProblem.g:5754:1: rule__NodeValueAssertion__ValueAssignment_2 : ( ruleConstant ) ;
    public final void rule__NodeValueAssertion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5758:1: ( ( ruleConstant ) )
            // InternalProblem.g:5759:2: ( ruleConstant )
            {
            // InternalProblem.g:5759:2: ( ruleConstant )
            // InternalProblem.g:5760:3: ruleConstant
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
    // InternalProblem.g:5769:1: rule__IntConstant__IntValueAssignment : ( ruleInteger ) ;
    public final void rule__IntConstant__IntValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5773:1: ( ( ruleInteger ) )
            // InternalProblem.g:5774:2: ( ruleInteger )
            {
            // InternalProblem.g:5774:2: ( ruleInteger )
            // InternalProblem.g:5775:3: ruleInteger
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
    // InternalProblem.g:5784:1: rule__RealConstant__RealValueAssignment : ( ruleReal ) ;
    public final void rule__RealConstant__RealValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5788:1: ( ( ruleReal ) )
            // InternalProblem.g:5789:2: ( ruleReal )
            {
            // InternalProblem.g:5789:2: ( ruleReal )
            // InternalProblem.g:5790:3: ruleReal
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
    // InternalProblem.g:5799:1: rule__StringConstant__StringValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringConstant__StringValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5803:1: ( ( RULE_STRING ) )
            // InternalProblem.g:5804:2: ( RULE_STRING )
            {
            // InternalProblem.g:5804:2: ( RULE_STRING )
            // InternalProblem.g:5805:3: RULE_STRING
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
    // InternalProblem.g:5814:1: rule__ScopeDeclaration__TypeScopesAssignment_1 : ( ruleTypeScope ) ;
    public final void rule__ScopeDeclaration__TypeScopesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5818:1: ( ( ruleTypeScope ) )
            // InternalProblem.g:5819:2: ( ruleTypeScope )
            {
            // InternalProblem.g:5819:2: ( ruleTypeScope )
            // InternalProblem.g:5820:3: ruleTypeScope
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
    // InternalProblem.g:5829:1: rule__ScopeDeclaration__TypeScopesAssignment_2_1 : ( ruleTypeScope ) ;
    public final void rule__ScopeDeclaration__TypeScopesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5833:1: ( ( ruleTypeScope ) )
            // InternalProblem.g:5834:2: ( ruleTypeScope )
            {
            // InternalProblem.g:5834:2: ( ruleTypeScope )
            // InternalProblem.g:5835:3: ruleTypeScope
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
    // InternalProblem.g:5844:1: rule__TypeScope__TargetTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeScope__TargetTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5848:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:5849:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:5849:2: ( ( RULE_ID ) )
            // InternalProblem.g:5850:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeScopeAccess().getTargetTypeClassDeclarationCrossReference_0_0()); 
            // InternalProblem.g:5851:3: ( RULE_ID )
            // InternalProblem.g:5852:4: RULE_ID
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
    // InternalProblem.g:5863:1: rule__TypeScope__IncrementAssignment_1_0 : ( ( '+=' ) ) ;
    public final void rule__TypeScope__IncrementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5867:1: ( ( ( '+=' ) ) )
            // InternalProblem.g:5868:2: ( ( '+=' ) )
            {
            // InternalProblem.g:5868:2: ( ( '+=' ) )
            // InternalProblem.g:5869:3: ( '+=' )
            {
             before(grammarAccess.getTypeScopeAccess().getIncrementPlusSignEqualsSignKeyword_1_0_0()); 
            // InternalProblem.g:5870:3: ( '+=' )
            // InternalProblem.g:5871:4: '+='
            {
             before(grammarAccess.getTypeScopeAccess().getIncrementPlusSignEqualsSignKeyword_1_0_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalProblem.g:5882:1: rule__TypeScope__MultiplicityAssignment_2 : ( ruleDefiniteMultiplicity ) ;
    public final void rule__TypeScope__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5886:1: ( ( ruleDefiniteMultiplicity ) )
            // InternalProblem.g:5887:2: ( ruleDefiniteMultiplicity )
            {
            // InternalProblem.g:5887:2: ( ruleDefiniteMultiplicity )
            // InternalProblem.g:5888:3: ruleDefiniteMultiplicity
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
    // InternalProblem.g:5897:1: rule__RangeMultiplicity__LowerBoundAssignment_0 : ( RULE_INT ) ;
    public final void rule__RangeMultiplicity__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5901:1: ( ( RULE_INT ) )
            // InternalProblem.g:5902:2: ( RULE_INT )
            {
            // InternalProblem.g:5902:2: ( RULE_INT )
            // InternalProblem.g:5903:3: RULE_INT
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
    // InternalProblem.g:5912:1: rule__RangeMultiplicity__UpperBoundAssignment_2 : ( ruleUpperBound ) ;
    public final void rule__RangeMultiplicity__UpperBoundAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5916:1: ( ( ruleUpperBound ) )
            // InternalProblem.g:5917:2: ( ruleUpperBound )
            {
            // InternalProblem.g:5917:2: ( ruleUpperBound )
            // InternalProblem.g:5918:3: ruleUpperBound
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
    // InternalProblem.g:5927:1: rule__ExactMultiplicity__ExactValueAssignment : ( RULE_INT ) ;
    public final void rule__ExactMultiplicity__ExactValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5931:1: ( ( RULE_INT ) )
            // InternalProblem.g:5932:2: ( RULE_INT )
            {
            // InternalProblem.g:5932:2: ( RULE_INT )
            // InternalProblem.g:5933:3: RULE_INT
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
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\1\5\3\uffff\6\45\3\uffff\1\6\5\45";
    static final String dfa_3s = "\1\56\3\uffff\1\50\5\53\3\uffff\1\26\5\53";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\6\uffff\1\4\1\6\1\5\6\uffff";
    static final String dfa_5s = "\23\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\5\11\uffff\1\3\2\uffff\1\6\1\7\1\10\1\11\3\uffff\2\12\1\uffff\1\1\3\uffff\1\2\7\uffff\1\13\2\uffff\1\1\1\uffff\1\3",
            "",
            "",
            "",
            "\1\12\2\uffff\1\14",
            "\1\12\2\uffff\1\14\2\uffff\1\15",
            "\1\12\2\uffff\1\14\2\uffff\1\15",
            "\1\12\2\uffff\1\14\2\uffff\1\15",
            "\1\12\2\uffff\1\14\2\uffff\1\15",
            "\1\12\2\uffff\1\14\2\uffff\1\15",
            "",
            "",
            "",
            "\1\16\14\uffff\1\17\1\20\1\21\1\22",
            "\1\12\2\uffff\1\14\2\uffff\1\15",
            "\1\12\2\uffff\1\14\2\uffff\1\15",
            "\1\12\2\uffff\1\14\2\uffff\1\15",
            "\1\12\2\uffff\1\14\2\uffff\1\15",
            "\1\12\2\uffff\1\14\2\uffff\1\15"
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
            return "1008:1: rule__Statement__Alternatives : ( ( ruleClassDeclaration ) | ( ruleEnumDeclaration ) | ( rulePredicateDefinition ) | ( ruleAssertion ) | ( ruleNodeValueAssertion ) | ( ruleScopeDeclaration ) );";
        }
    }
    static final String dfa_7s = "\76\uffff";
    static final String dfa_8s = "\1\5\6\45\1\uffff\1\4\1\6\6\15\1\4\1\14\1\15\1\14\5\45\1\4\1\6\3\4\1\uffff\6\15\1\4\1\14\7\15\2\4\1\15\1\6\3\4\6\15\2\4\1\15";
    static final String dfa_9s = "\1\33\1\45\5\53\1\uffff\1\46\1\26\1\46\5\53\1\4\2\46\1\50\5\53\1\27\1\26\1\4\2\30\1\uffff\1\46\5\53\1\4\2\46\5\53\1\46\2\4\1\46\1\26\1\4\2\30\5\53\1\46\2\4\1\46";
    static final String dfa_10s = "\7\uffff\1\2\26\uffff\1\1\37\uffff";
    static final String dfa_11s = "\76\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\2\14\uffff\1\3\1\4\1\5\1\6\3\uffff\2\7",
            "\1\10",
            "\1\10\5\uffff\1\11",
            "\1\10\5\uffff\1\11",
            "\1\10\5\uffff\1\11",
            "\1\10\5\uffff\1\11",
            "\1\10\5\uffff\1\11",
            "",
            "\1\21\1\12\1\13\1\22\13\uffff\1\14\1\15\1\16\1\17\1\20\16\uffff\1\23",
            "\1\24\14\uffff\1\25\1\26\1\27\1\30",
            "\1\31\30\uffff\1\23",
            "\1\31\30\uffff\1\23\4\uffff\1\32",
            "\1\31\30\uffff\1\23\4\uffff\1\32",
            "\1\31\30\uffff\1\23\4\uffff\1\32",
            "\1\31\30\uffff\1\23\4\uffff\1\32",
            "\1\31\30\uffff\1\23\4\uffff\1\32",
            "\1\21",
            "\1\33\1\31\7\uffff\1\34\1\35\17\uffff\1\23",
            "\1\31\30\uffff\1\23",
            "\1\7\33\uffff\1\36",
            "\1\10\5\uffff\1\11",
            "\1\10\5\uffff\1\11",
            "\1\10\5\uffff\1\11",
            "\1\10\5\uffff\1\11",
            "\1\10\5\uffff\1\11",
            "\1\46\1\37\1\40\1\47\13\uffff\1\41\1\42\1\43\1\44\1\45",
            "\1\50\14\uffff\1\51\1\52\1\53\1\54",
            "\1\55",
            "\1\60\22\uffff\1\56\1\57",
            "\1\60\22\uffff\1\56\1\57",
            "",
            "\1\31\30\uffff\1\23",
            "\1\31\30\uffff\1\23\4\uffff\1\61",
            "\1\31\30\uffff\1\23\4\uffff\1\61",
            "\1\31\30\uffff\1\23\4\uffff\1\61",
            "\1\31\30\uffff\1\23\4\uffff\1\61",
            "\1\31\30\uffff\1\23\4\uffff\1\61",
            "\1\46",
            "\1\62\1\31\7\uffff\1\63\1\64\17\uffff\1\23",
            "\1\31\30\uffff\1\23",
            "\1\31\30\uffff\1\23\4\uffff\1\32",
            "\1\31\30\uffff\1\23\4\uffff\1\32",
            "\1\31\30\uffff\1\23\4\uffff\1\32",
            "\1\31\30\uffff\1\23\4\uffff\1\32",
            "\1\31\30\uffff\1\23\4\uffff\1\32",
            "\1\31\7\uffff\1\34\1\35\17\uffff\1\23",
            "\1\60",
            "\1\60",
            "\1\31\30\uffff\1\23",
            "\1\65\14\uffff\1\66\1\67\1\70\1\71",
            "\1\72",
            "\1\75\22\uffff\1\73\1\74",
            "\1\75\22\uffff\1\73\1\74",
            "\1\31\30\uffff\1\23\4\uffff\1\61",
            "\1\31\30\uffff\1\23\4\uffff\1\61",
            "\1\31\30\uffff\1\23\4\uffff\1\61",
            "\1\31\30\uffff\1\23\4\uffff\1\61",
            "\1\31\30\uffff\1\23\4\uffff\1\61",
            "\1\31\7\uffff\1\63\1\64\17\uffff\1\23",
            "\1\75",
            "\1\75",
            "\1\31\30\uffff\1\23"
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
            return "1200:1: rule__Assertion__Alternatives_0 : ( ( ( rule__Assertion__Group_0_0__0 ) ) | ( ( rule__Assertion__Group_0_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000052022C790060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000052022C790062L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000780060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000C0001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000200100788060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200000788062L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100780060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000200000788060L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400780060L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000780060L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004780060L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000F800F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000F800F0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002180000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000000C780060L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000601000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000001800010L});

}