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


    // $ANTLR start "entryRuleQuotedOrUnquotedId"
    // InternalProblem.g:853:1: entryRuleQuotedOrUnquotedId : ruleQuotedOrUnquotedId EOF ;
    public final void entryRuleQuotedOrUnquotedId() throws RecognitionException {
        try {
            // InternalProblem.g:854:1: ( ruleQuotedOrUnquotedId EOF )
            // InternalProblem.g:855:1: ruleQuotedOrUnquotedId EOF
            {
             before(grammarAccess.getQuotedOrUnquotedIdRule()); 
            pushFollow(FOLLOW_1);
            ruleQuotedOrUnquotedId();

            state._fsp--;

             after(grammarAccess.getQuotedOrUnquotedIdRule()); 
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
    // $ANTLR end "entryRuleQuotedOrUnquotedId"


    // $ANTLR start "ruleQuotedOrUnquotedId"
    // InternalProblem.g:862:1: ruleQuotedOrUnquotedId : ( ( rule__QuotedOrUnquotedId__Alternatives ) ) ;
    public final void ruleQuotedOrUnquotedId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:866:2: ( ( ( rule__QuotedOrUnquotedId__Alternatives ) ) )
            // InternalProblem.g:867:2: ( ( rule__QuotedOrUnquotedId__Alternatives ) )
            {
            // InternalProblem.g:867:2: ( ( rule__QuotedOrUnquotedId__Alternatives ) )
            // InternalProblem.g:868:3: ( rule__QuotedOrUnquotedId__Alternatives )
            {
             before(grammarAccess.getQuotedOrUnquotedIdAccess().getAlternatives()); 
            // InternalProblem.g:869:3: ( rule__QuotedOrUnquotedId__Alternatives )
            // InternalProblem.g:869:4: rule__QuotedOrUnquotedId__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QuotedOrUnquotedId__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuotedOrUnquotedIdAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuotedOrUnquotedId"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalProblem.g:878:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalProblem.g:882:1: ( ruleQualifiedName EOF )
            // InternalProblem.g:883:1: ruleQualifiedName EOF
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
    // InternalProblem.g:893:1: ruleQualifiedName : ( ( rule__QualifiedName__Alternatives ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:898:2: ( ( ( rule__QualifiedName__Alternatives ) ) )
            // InternalProblem.g:899:2: ( ( rule__QualifiedName__Alternatives ) )
            {
            // InternalProblem.g:899:2: ( ( rule__QualifiedName__Alternatives ) )
            // InternalProblem.g:900:3: ( rule__QualifiedName__Alternatives )
            {
             before(grammarAccess.getQualifiedNameAccess().getAlternatives()); 
            // InternalProblem.g:901:3: ( rule__QualifiedName__Alternatives )
            // InternalProblem.g:901:4: rule__QualifiedName__Alternatives
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
    // InternalProblem.g:911:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // InternalProblem.g:912:1: ( ruleIdentifier EOF )
            // InternalProblem.g:913:1: ruleIdentifier EOF
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
    // InternalProblem.g:920:1: ruleIdentifier : ( ( rule__Identifier__Alternatives ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:924:2: ( ( ( rule__Identifier__Alternatives ) ) )
            // InternalProblem.g:925:2: ( ( rule__Identifier__Alternatives ) )
            {
            // InternalProblem.g:925:2: ( ( rule__Identifier__Alternatives ) )
            // InternalProblem.g:926:3: ( rule__Identifier__Alternatives )
            {
             before(grammarAccess.getIdentifierAccess().getAlternatives()); 
            // InternalProblem.g:927:3: ( rule__Identifier__Alternatives )
            // InternalProblem.g:927:4: rule__Identifier__Alternatives
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
    // InternalProblem.g:936:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalProblem.g:940:1: ( ruleInteger EOF )
            // InternalProblem.g:941:1: ruleInteger EOF
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
    // InternalProblem.g:951:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:956:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalProblem.g:957:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalProblem.g:957:2: ( ( rule__Integer__Group__0 ) )
            // InternalProblem.g:958:3: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // InternalProblem.g:959:3: ( rule__Integer__Group__0 )
            // InternalProblem.g:959:4: rule__Integer__Group__0
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
    // InternalProblem.g:969:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalProblem.g:973:1: ( ruleReal EOF )
            // InternalProblem.g:974:1: ruleReal EOF
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
    // InternalProblem.g:984:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:989:2: ( ( ( rule__Real__Group__0 ) ) )
            // InternalProblem.g:990:2: ( ( rule__Real__Group__0 ) )
            {
            // InternalProblem.g:990:2: ( ( rule__Real__Group__0 ) )
            // InternalProblem.g:991:3: ( rule__Real__Group__0 )
            {
             before(grammarAccess.getRealAccess().getGroup()); 
            // InternalProblem.g:992:3: ( rule__Real__Group__0 )
            // InternalProblem.g:992:4: rule__Real__Group__0
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
    // InternalProblem.g:1002:1: ruleLogicValue : ( ( rule__LogicValue__Alternatives ) ) ;
    public final void ruleLogicValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1006:1: ( ( ( rule__LogicValue__Alternatives ) ) )
            // InternalProblem.g:1007:2: ( ( rule__LogicValue__Alternatives ) )
            {
            // InternalProblem.g:1007:2: ( ( rule__LogicValue__Alternatives ) )
            // InternalProblem.g:1008:3: ( rule__LogicValue__Alternatives )
            {
             before(grammarAccess.getLogicValueAccess().getAlternatives()); 
            // InternalProblem.g:1009:3: ( rule__LogicValue__Alternatives )
            // InternalProblem.g:1009:4: rule__LogicValue__Alternatives
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
    // InternalProblem.g:1018:1: ruleShortLogicValue : ( ( rule__ShortLogicValue__Alternatives ) ) ;
    public final void ruleShortLogicValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1022:1: ( ( ( rule__ShortLogicValue__Alternatives ) ) )
            // InternalProblem.g:1023:2: ( ( rule__ShortLogicValue__Alternatives ) )
            {
            // InternalProblem.g:1023:2: ( ( rule__ShortLogicValue__Alternatives ) )
            // InternalProblem.g:1024:3: ( rule__ShortLogicValue__Alternatives )
            {
             before(grammarAccess.getShortLogicValueAccess().getAlternatives()); 
            // InternalProblem.g:1025:3: ( rule__ShortLogicValue__Alternatives )
            // InternalProblem.g:1025:4: rule__ShortLogicValue__Alternatives
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
    // InternalProblem.g:1033:1: rule__Statement__Alternatives : ( ( ruleClassDeclaration ) | ( ruleEnumDeclaration ) | ( rulePredicateDefinition ) | ( ruleAssertion ) | ( ruleNodeValueAssertion ) | ( ruleScopeDeclaration ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1037:1: ( ( ruleClassDeclaration ) | ( ruleEnumDeclaration ) | ( rulePredicateDefinition ) | ( ruleAssertion ) | ( ruleNodeValueAssertion ) | ( ruleScopeDeclaration ) )
            int alt1=6;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalProblem.g:1038:2: ( ruleClassDeclaration )
                    {
                    // InternalProblem.g:1038:2: ( ruleClassDeclaration )
                    // InternalProblem.g:1039:3: ruleClassDeclaration
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
                    // InternalProblem.g:1044:2: ( ruleEnumDeclaration )
                    {
                    // InternalProblem.g:1044:2: ( ruleEnumDeclaration )
                    // InternalProblem.g:1045:3: ruleEnumDeclaration
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
                    // InternalProblem.g:1050:2: ( rulePredicateDefinition )
                    {
                    // InternalProblem.g:1050:2: ( rulePredicateDefinition )
                    // InternalProblem.g:1051:3: rulePredicateDefinition
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
                    // InternalProblem.g:1056:2: ( ruleAssertion )
                    {
                    // InternalProblem.g:1056:2: ( ruleAssertion )
                    // InternalProblem.g:1057:3: ruleAssertion
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
                    // InternalProblem.g:1062:2: ( ruleNodeValueAssertion )
                    {
                    // InternalProblem.g:1062:2: ( ruleNodeValueAssertion )
                    // InternalProblem.g:1063:3: ruleNodeValueAssertion
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
                    // InternalProblem.g:1068:2: ( ruleScopeDeclaration )
                    {
                    // InternalProblem.g:1068:2: ( ruleScopeDeclaration )
                    // InternalProblem.g:1069:3: ruleScopeDeclaration
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
    // InternalProblem.g:1078:1: rule__ClassDeclaration__Alternatives_4 : ( ( ( rule__ClassDeclaration__Group_4_0__0 ) ) | ( '.' ) );
    public final void rule__ClassDeclaration__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1082:1: ( ( ( rule__ClassDeclaration__Group_4_0__0 ) ) | ( '.' ) )
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
                    // InternalProblem.g:1083:2: ( ( rule__ClassDeclaration__Group_4_0__0 ) )
                    {
                    // InternalProblem.g:1083:2: ( ( rule__ClassDeclaration__Group_4_0__0 ) )
                    // InternalProblem.g:1084:3: ( rule__ClassDeclaration__Group_4_0__0 )
                    {
                     before(grammarAccess.getClassDeclarationAccess().getGroup_4_0()); 
                    // InternalProblem.g:1085:3: ( rule__ClassDeclaration__Group_4_0__0 )
                    // InternalProblem.g:1085:4: rule__ClassDeclaration__Group_4_0__0
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
                    // InternalProblem.g:1089:2: ( '.' )
                    {
                    // InternalProblem.g:1089:2: ( '.' )
                    // InternalProblem.g:1090:3: '.'
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
    // InternalProblem.g:1099:1: rule__EnumDeclaration__Alternatives_2 : ( ( ( rule__EnumDeclaration__Group_2_0__0 ) ) | ( '.' ) );
    public final void rule__EnumDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1103:1: ( ( ( rule__EnumDeclaration__Group_2_0__0 ) ) | ( '.' ) )
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
                    // InternalProblem.g:1104:2: ( ( rule__EnumDeclaration__Group_2_0__0 ) )
                    {
                    // InternalProblem.g:1104:2: ( ( rule__EnumDeclaration__Group_2_0__0 ) )
                    // InternalProblem.g:1105:3: ( rule__EnumDeclaration__Group_2_0__0 )
                    {
                     before(grammarAccess.getEnumDeclarationAccess().getGroup_2_0()); 
                    // InternalProblem.g:1106:3: ( rule__EnumDeclaration__Group_2_0__0 )
                    // InternalProblem.g:1106:4: rule__EnumDeclaration__Group_2_0__0
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
                    // InternalProblem.g:1110:2: ( '.' )
                    {
                    // InternalProblem.g:1110:2: ( '.' )
                    // InternalProblem.g:1111:3: '.'
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
    // InternalProblem.g:1120:1: rule__EnumDeclaration__Alternatives_2_0_1_2 : ( ( ',' ) | ( ';' ) );
    public final void rule__EnumDeclaration__Alternatives_2_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1124:1: ( ( ',' ) | ( ';' ) )
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
                    // InternalProblem.g:1125:2: ( ',' )
                    {
                    // InternalProblem.g:1125:2: ( ',' )
                    // InternalProblem.g:1126:3: ','
                    {
                     before(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_2_0_1_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_2_0_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1131:2: ( ';' )
                    {
                    // InternalProblem.g:1131:2: ( ';' )
                    // InternalProblem.g:1132:3: ';'
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
    // InternalProblem.g:1141:1: rule__ReferenceDeclaration__Alternatives_0 : ( ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) ) | ( 'refers' ) );
    public final void rule__ReferenceDeclaration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1145:1: ( ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) ) | ( 'refers' ) )
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
                    // InternalProblem.g:1146:2: ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) )
                    {
                    // InternalProblem.g:1146:2: ( ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 ) )
                    // InternalProblem.g:1147:3: ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 )
                    {
                     before(grammarAccess.getReferenceDeclarationAccess().getContainmentAssignment_0_0()); 
                    // InternalProblem.g:1148:3: ( rule__ReferenceDeclaration__ContainmentAssignment_0_0 )
                    // InternalProblem.g:1148:4: rule__ReferenceDeclaration__ContainmentAssignment_0_0
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
                    // InternalProblem.g:1152:2: ( 'refers' )
                    {
                    // InternalProblem.g:1152:2: ( 'refers' )
                    // InternalProblem.g:1153:3: 'refers'
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
    // InternalProblem.g:1162:1: rule__PredicateDefinition__Alternatives_0 : ( ( ( rule__PredicateDefinition__Group_0_0__0 ) ) | ( 'pred' ) );
    public final void rule__PredicateDefinition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1166:1: ( ( ( rule__PredicateDefinition__Group_0_0__0 ) ) | ( 'pred' ) )
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
                    // InternalProblem.g:1167:2: ( ( rule__PredicateDefinition__Group_0_0__0 ) )
                    {
                    // InternalProblem.g:1167:2: ( ( rule__PredicateDefinition__Group_0_0__0 ) )
                    // InternalProblem.g:1168:3: ( rule__PredicateDefinition__Group_0_0__0 )
                    {
                     before(grammarAccess.getPredicateDefinitionAccess().getGroup_0_0()); 
                    // InternalProblem.g:1169:3: ( rule__PredicateDefinition__Group_0_0__0 )
                    // InternalProblem.g:1169:4: rule__PredicateDefinition__Group_0_0__0
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
                    // InternalProblem.g:1173:2: ( 'pred' )
                    {
                    // InternalProblem.g:1173:2: ( 'pred' )
                    // InternalProblem.g:1174:3: 'pred'
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
    // InternalProblem.g:1183:1: rule__Literal__Alternatives : ( ( ruleAtom ) | ( ruleNegativeLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1187:1: ( ( ruleAtom ) | ( ruleNegativeLiteral ) )
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
                    // InternalProblem.g:1188:2: ( ruleAtom )
                    {
                    // InternalProblem.g:1188:2: ( ruleAtom )
                    // InternalProblem.g:1189:3: ruleAtom
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
                    // InternalProblem.g:1194:2: ( ruleNegativeLiteral )
                    {
                    // InternalProblem.g:1194:2: ( ruleNegativeLiteral )
                    // InternalProblem.g:1195:3: ruleNegativeLiteral
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
    // InternalProblem.g:1204:1: rule__Argument__Alternatives : ( ( ruleVariableOrNodeArgument ) | ( ruleConstantArgument ) );
    public final void rule__Argument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1208:1: ( ( ruleVariableOrNodeArgument ) | ( ruleConstantArgument ) )
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
                    // InternalProblem.g:1209:2: ( ruleVariableOrNodeArgument )
                    {
                    // InternalProblem.g:1209:2: ( ruleVariableOrNodeArgument )
                    // InternalProblem.g:1210:3: ruleVariableOrNodeArgument
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
                    // InternalProblem.g:1215:2: ( ruleConstantArgument )
                    {
                    // InternalProblem.g:1215:2: ( ruleConstantArgument )
                    // InternalProblem.g:1216:3: ruleConstantArgument
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
    // InternalProblem.g:1225:1: rule__Assertion__Alternatives_0 : ( ( ( rule__Assertion__Group_0_0__0 ) ) | ( ( rule__Assertion__Group_0_1__0 ) ) );
    public final void rule__Assertion__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1229:1: ( ( ( rule__Assertion__Group_0_0__0 ) ) | ( ( rule__Assertion__Group_0_1__0 ) ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalProblem.g:1230:2: ( ( rule__Assertion__Group_0_0__0 ) )
                    {
                    // InternalProblem.g:1230:2: ( ( rule__Assertion__Group_0_0__0 ) )
                    // InternalProblem.g:1231:3: ( rule__Assertion__Group_0_0__0 )
                    {
                     before(grammarAccess.getAssertionAccess().getGroup_0_0()); 
                    // InternalProblem.g:1232:3: ( rule__Assertion__Group_0_0__0 )
                    // InternalProblem.g:1232:4: rule__Assertion__Group_0_0__0
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
                    // InternalProblem.g:1236:2: ( ( rule__Assertion__Group_0_1__0 ) )
                    {
                    // InternalProblem.g:1236:2: ( ( rule__Assertion__Group_0_1__0 ) )
                    // InternalProblem.g:1237:3: ( rule__Assertion__Group_0_1__0 )
                    {
                     before(grammarAccess.getAssertionAccess().getGroup_0_1()); 
                    // InternalProblem.g:1238:3: ( rule__Assertion__Group_0_1__0 )
                    // InternalProblem.g:1238:4: rule__Assertion__Group_0_1__0
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
    // InternalProblem.g:1246:1: rule__AssertionArgument__Alternatives : ( ( ruleNodeAssertionArgument ) | ( ruleConstantAssertionArgument ) );
    public final void rule__AssertionArgument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1250:1: ( ( ruleNodeAssertionArgument ) | ( ruleConstantAssertionArgument ) )
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
                    // InternalProblem.g:1251:2: ( ruleNodeAssertionArgument )
                    {
                    // InternalProblem.g:1251:2: ( ruleNodeAssertionArgument )
                    // InternalProblem.g:1252:3: ruleNodeAssertionArgument
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
                    // InternalProblem.g:1257:2: ( ruleConstantAssertionArgument )
                    {
                    // InternalProblem.g:1257:2: ( ruleConstantAssertionArgument )
                    // InternalProblem.g:1258:3: ruleConstantAssertionArgument
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
    // InternalProblem.g:1267:1: rule__Constant__Alternatives : ( ( ruleIntConstant ) | ( ruleRealConstant ) | ( ruleStringConstant ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1271:1: ( ( ruleIntConstant ) | ( ruleRealConstant ) | ( ruleStringConstant ) )
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
                    // InternalProblem.g:1272:2: ( ruleIntConstant )
                    {
                    // InternalProblem.g:1272:2: ( ruleIntConstant )
                    // InternalProblem.g:1273:3: ruleIntConstant
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
                    // InternalProblem.g:1278:2: ( ruleRealConstant )
                    {
                    // InternalProblem.g:1278:2: ( ruleRealConstant )
                    // InternalProblem.g:1279:3: ruleRealConstant
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
                    // InternalProblem.g:1284:2: ( ruleStringConstant )
                    {
                    // InternalProblem.g:1284:2: ( ruleStringConstant )
                    // InternalProblem.g:1285:3: ruleStringConstant
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
    // InternalProblem.g:1294:1: rule__TypeScope__Alternatives_1 : ( ( ( rule__TypeScope__IncrementAssignment_1_0 ) ) | ( '=' ) );
    public final void rule__TypeScope__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1298:1: ( ( ( rule__TypeScope__IncrementAssignment_1_0 ) ) | ( '=' ) )
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
                    // InternalProblem.g:1299:2: ( ( rule__TypeScope__IncrementAssignment_1_0 ) )
                    {
                    // InternalProblem.g:1299:2: ( ( rule__TypeScope__IncrementAssignment_1_0 ) )
                    // InternalProblem.g:1300:3: ( rule__TypeScope__IncrementAssignment_1_0 )
                    {
                     before(grammarAccess.getTypeScopeAccess().getIncrementAssignment_1_0()); 
                    // InternalProblem.g:1301:3: ( rule__TypeScope__IncrementAssignment_1_0 )
                    // InternalProblem.g:1301:4: rule__TypeScope__IncrementAssignment_1_0
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
                    // InternalProblem.g:1305:2: ( '=' )
                    {
                    // InternalProblem.g:1305:2: ( '=' )
                    // InternalProblem.g:1306:3: '='
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
    // InternalProblem.g:1315:1: rule__Multiplicity__Alternatives : ( ( ruleUnboundedMultiplicity ) | ( ruleDefiniteMultiplicity ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1319:1: ( ( ruleUnboundedMultiplicity ) | ( ruleDefiniteMultiplicity ) )
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
                    // InternalProblem.g:1320:2: ( ruleUnboundedMultiplicity )
                    {
                    // InternalProblem.g:1320:2: ( ruleUnboundedMultiplicity )
                    // InternalProblem.g:1321:3: ruleUnboundedMultiplicity
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
                    // InternalProblem.g:1326:2: ( ruleDefiniteMultiplicity )
                    {
                    // InternalProblem.g:1326:2: ( ruleDefiniteMultiplicity )
                    // InternalProblem.g:1327:3: ruleDefiniteMultiplicity
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
    // InternalProblem.g:1336:1: rule__DefiniteMultiplicity__Alternatives : ( ( ruleRangeMultiplicity ) | ( ruleExactMultiplicity ) );
    public final void rule__DefiniteMultiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1340:1: ( ( ruleRangeMultiplicity ) | ( ruleExactMultiplicity ) )
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
                    // InternalProblem.g:1341:2: ( ruleRangeMultiplicity )
                    {
                    // InternalProblem.g:1341:2: ( ruleRangeMultiplicity )
                    // InternalProblem.g:1342:3: ruleRangeMultiplicity
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
                    // InternalProblem.g:1347:2: ( ruleExactMultiplicity )
                    {
                    // InternalProblem.g:1347:2: ( ruleExactMultiplicity )
                    // InternalProblem.g:1348:3: ruleExactMultiplicity
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
    // InternalProblem.g:1357:1: rule__UpperBound__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__UpperBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1361:1: ( ( RULE_INT ) | ( '*' ) )
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
                    // InternalProblem.g:1362:2: ( RULE_INT )
                    {
                    // InternalProblem.g:1362:2: ( RULE_INT )
                    // InternalProblem.g:1363:3: RULE_INT
                    {
                     before(grammarAccess.getUpperBoundAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getUpperBoundAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1368:2: ( '*' )
                    {
                    // InternalProblem.g:1368:2: ( '*' )
                    // InternalProblem.g:1369:3: '*'
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


    // $ANTLR start "rule__QuotedOrUnquotedId__Alternatives"
    // InternalProblem.g:1378:1: rule__QuotedOrUnquotedId__Alternatives : ( ( RULE_QUOTED_ID ) | ( ruleIdentifier ) );
    public final void rule__QuotedOrUnquotedId__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1382:1: ( ( RULE_QUOTED_ID ) | ( ruleIdentifier ) )
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
                    // InternalProblem.g:1383:2: ( RULE_QUOTED_ID )
                    {
                    // InternalProblem.g:1383:2: ( RULE_QUOTED_ID )
                    // InternalProblem.g:1384:3: RULE_QUOTED_ID
                    {
                     before(grammarAccess.getQuotedOrUnquotedIdAccess().getQUOTED_IDTerminalRuleCall_0()); 
                    match(input,RULE_QUOTED_ID,FOLLOW_2); 
                     after(grammarAccess.getQuotedOrUnquotedIdAccess().getQUOTED_IDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1389:2: ( ruleIdentifier )
                    {
                    // InternalProblem.g:1389:2: ( ruleIdentifier )
                    // InternalProblem.g:1390:3: ruleIdentifier
                    {
                     before(grammarAccess.getQuotedOrUnquotedIdAccess().getIdentifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getQuotedOrUnquotedIdAccess().getIdentifierParserRuleCall_1()); 

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
    // $ANTLR end "rule__QuotedOrUnquotedId__Alternatives"


    // $ANTLR start "rule__QualifiedName__Alternatives"
    // InternalProblem.g:1399:1: rule__QualifiedName__Alternatives : ( ( RULE_QUOTED_ID ) | ( ( rule__QualifiedName__Group_1__0 ) ) );
    public final void rule__QualifiedName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1403:1: ( ( RULE_QUOTED_ID ) | ( ( rule__QualifiedName__Group_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_QUOTED_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID||(LA17_0>=19 && LA17_0<=22)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalProblem.g:1404:2: ( RULE_QUOTED_ID )
                    {
                    // InternalProblem.g:1404:2: ( RULE_QUOTED_ID )
                    // InternalProblem.g:1405:3: RULE_QUOTED_ID
                    {
                     before(grammarAccess.getQualifiedNameAccess().getQUOTED_IDTerminalRuleCall_0()); 
                    match(input,RULE_QUOTED_ID,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getQUOTED_IDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1410:2: ( ( rule__QualifiedName__Group_1__0 ) )
                    {
                    // InternalProblem.g:1410:2: ( ( rule__QualifiedName__Group_1__0 ) )
                    // InternalProblem.g:1411:3: ( rule__QualifiedName__Group_1__0 )
                    {
                     before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
                    // InternalProblem.g:1412:3: ( rule__QualifiedName__Group_1__0 )
                    // InternalProblem.g:1412:4: rule__QualifiedName__Group_1__0
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
    // InternalProblem.g:1420:1: rule__Identifier__Alternatives : ( ( RULE_ID ) | ( 'true' ) | ( 'false' ) | ( 'e' ) | ( 'E' ) );
    public final void rule__Identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1424:1: ( ( RULE_ID ) | ( 'true' ) | ( 'false' ) | ( 'e' ) | ( 'E' ) )
            int alt18=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case 19:
                {
                alt18=2;
                }
                break;
            case 20:
                {
                alt18=3;
                }
                break;
            case 21:
                {
                alt18=4;
                }
                break;
            case 22:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalProblem.g:1425:2: ( RULE_ID )
                    {
                    // InternalProblem.g:1425:2: ( RULE_ID )
                    // InternalProblem.g:1426:3: RULE_ID
                    {
                     before(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1431:2: ( 'true' )
                    {
                    // InternalProblem.g:1431:2: ( 'true' )
                    // InternalProblem.g:1432:3: 'true'
                    {
                     before(grammarAccess.getIdentifierAccess().getTrueKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getIdentifierAccess().getTrueKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:1437:2: ( 'false' )
                    {
                    // InternalProblem.g:1437:2: ( 'false' )
                    // InternalProblem.g:1438:3: 'false'
                    {
                     before(grammarAccess.getIdentifierAccess().getFalseKeyword_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getIdentifierAccess().getFalseKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProblem.g:1443:2: ( 'e' )
                    {
                    // InternalProblem.g:1443:2: ( 'e' )
                    // InternalProblem.g:1444:3: 'e'
                    {
                     before(grammarAccess.getIdentifierAccess().getEKeyword_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getIdentifierAccess().getEKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProblem.g:1449:2: ( 'E' )
                    {
                    // InternalProblem.g:1449:2: ( 'E' )
                    // InternalProblem.g:1450:3: 'E'
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
    // InternalProblem.g:1459:1: rule__Real__Alternatives_2 : ( ( ( rule__Real__Group_2_0__0 ) ) | ( ( rule__Real__Group_2_1__0 ) ) );
    public final void rule__Real__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1463:1: ( ( ( rule__Real__Group_2_0__0 ) ) | ( ( rule__Real__Group_2_1__0 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==12) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_INT) ) {
                    int LA19_3 = input.LA(3);

                    if ( ((LA19_3>=21 && LA19_3<=22)) ) {
                        alt19=2;
                    }
                    else if ( (LA19_3==EOF||(LA19_3>=12 && LA19_3<=13)||LA19_3==38) ) {
                        alt19=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA19_0>=21 && LA19_0<=22)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalProblem.g:1464:2: ( ( rule__Real__Group_2_0__0 ) )
                    {
                    // InternalProblem.g:1464:2: ( ( rule__Real__Group_2_0__0 ) )
                    // InternalProblem.g:1465:3: ( rule__Real__Group_2_0__0 )
                    {
                     before(grammarAccess.getRealAccess().getGroup_2_0()); 
                    // InternalProblem.g:1466:3: ( rule__Real__Group_2_0__0 )
                    // InternalProblem.g:1466:4: rule__Real__Group_2_0__0
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
                    // InternalProblem.g:1470:2: ( ( rule__Real__Group_2_1__0 ) )
                    {
                    // InternalProblem.g:1470:2: ( ( rule__Real__Group_2_1__0 ) )
                    // InternalProblem.g:1471:3: ( rule__Real__Group_2_1__0 )
                    {
                     before(grammarAccess.getRealAccess().getGroup_2_1()); 
                    // InternalProblem.g:1472:3: ( rule__Real__Group_2_1__0 )
                    // InternalProblem.g:1472:4: rule__Real__Group_2_1__0
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
    // InternalProblem.g:1480:1: rule__Real__Alternatives_2_1_1 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__Real__Alternatives_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1484:1: ( ( 'e' ) | ( 'E' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            else if ( (LA20_0==22) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalProblem.g:1485:2: ( 'e' )
                    {
                    // InternalProblem.g:1485:2: ( 'e' )
                    // InternalProblem.g:1486:3: 'e'
                    {
                     before(grammarAccess.getRealAccess().getEKeyword_2_1_1_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getRealAccess().getEKeyword_2_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1491:2: ( 'E' )
                    {
                    // InternalProblem.g:1491:2: ( 'E' )
                    // InternalProblem.g:1492:3: 'E'
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
    // InternalProblem.g:1501:1: rule__Real__Alternatives_2_1_2 : ( ( '-' ) | ( '+' ) );
    public final void rule__Real__Alternatives_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1505:1: ( ( '-' ) | ( '+' ) )
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
                    // InternalProblem.g:1506:2: ( '-' )
                    {
                    // InternalProblem.g:1506:2: ( '-' )
                    // InternalProblem.g:1507:3: '-'
                    {
                     before(grammarAccess.getRealAccess().getHyphenMinusKeyword_2_1_2_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getRealAccess().getHyphenMinusKeyword_2_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1512:2: ( '+' )
                    {
                    // InternalProblem.g:1512:2: ( '+' )
                    // InternalProblem.g:1513:3: '+'
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
    // InternalProblem.g:1522:1: rule__LogicValue__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) | ( ( 'unknown' ) ) );
    public final void rule__LogicValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1526:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) | ( ( 'unknown' ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt22=1;
                }
                break;
            case 20:
                {
                alt22=2;
                }
                break;
            case 25:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalProblem.g:1527:2: ( ( 'true' ) )
                    {
                    // InternalProblem.g:1527:2: ( ( 'true' ) )
                    // InternalProblem.g:1528:3: ( 'true' )
                    {
                     before(grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:1529:3: ( 'true' )
                    // InternalProblem.g:1529:4: 'true'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1533:2: ( ( 'false' ) )
                    {
                    // InternalProblem.g:1533:2: ( ( 'false' ) )
                    // InternalProblem.g:1534:3: ( 'false' )
                    {
                     before(grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:1535:3: ( 'false' )
                    // InternalProblem.g:1535:4: 'false'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:1539:2: ( ( 'unknown' ) )
                    {
                    // InternalProblem.g:1539:2: ( ( 'unknown' ) )
                    // InternalProblem.g:1540:3: ( 'unknown' )
                    {
                     before(grammarAccess.getLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_2()); 
                    // InternalProblem.g:1541:3: ( 'unknown' )
                    // InternalProblem.g:1541:4: 'unknown'
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
    // InternalProblem.g:1549:1: rule__ShortLogicValue__Alternatives : ( ( ( '!' ) ) | ( ( '?' ) ) );
    public final void rule__ShortLogicValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1553:1: ( ( ( '!' ) ) | ( ( '?' ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            else if ( (LA23_0==27) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalProblem.g:1554:2: ( ( '!' ) )
                    {
                    // InternalProblem.g:1554:2: ( ( '!' ) )
                    // InternalProblem.g:1555:3: ( '!' )
                    {
                     before(grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:1556:3: ( '!' )
                    // InternalProblem.g:1556:4: '!'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1560:2: ( ( '?' ) )
                    {
                    // InternalProblem.g:1560:2: ( ( '?' ) )
                    // InternalProblem.g:1561:3: ( '?' )
                    {
                     before(grammarAccess.getShortLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:1562:3: ( '?' )
                    // InternalProblem.g:1562:4: '?'
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
    // InternalProblem.g:1570:1: rule__Problem__Group__0 : rule__Problem__Group__0__Impl rule__Problem__Group__1 ;
    public final void rule__Problem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1574:1: ( rule__Problem__Group__0__Impl rule__Problem__Group__1 )
            // InternalProblem.g:1575:2: rule__Problem__Group__0__Impl rule__Problem__Group__1
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
    // InternalProblem.g:1582:1: rule__Problem__Group__0__Impl : ( ( rule__Problem__Group_0__0 )? ) ;
    public final void rule__Problem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1586:1: ( ( ( rule__Problem__Group_0__0 )? ) )
            // InternalProblem.g:1587:1: ( ( rule__Problem__Group_0__0 )? )
            {
            // InternalProblem.g:1587:1: ( ( rule__Problem__Group_0__0 )? )
            // InternalProblem.g:1588:2: ( rule__Problem__Group_0__0 )?
            {
             before(grammarAccess.getProblemAccess().getGroup_0()); 
            // InternalProblem.g:1589:2: ( rule__Problem__Group_0__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProblem.g:1589:3: rule__Problem__Group_0__0
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
    // InternalProblem.g:1597:1: rule__Problem__Group__1 : rule__Problem__Group__1__Impl ;
    public final void rule__Problem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1601:1: ( rule__Problem__Group__1__Impl )
            // InternalProblem.g:1602:2: rule__Problem__Group__1__Impl
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
    // InternalProblem.g:1608:1: rule__Problem__Group__1__Impl : ( ( rule__Problem__StatementsAssignment_1 )* ) ;
    public final void rule__Problem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1612:1: ( ( ( rule__Problem__StatementsAssignment_1 )* ) )
            // InternalProblem.g:1613:1: ( ( rule__Problem__StatementsAssignment_1 )* )
            {
            // InternalProblem.g:1613:1: ( ( rule__Problem__StatementsAssignment_1 )* )
            // InternalProblem.g:1614:2: ( rule__Problem__StatementsAssignment_1 )*
            {
             before(grammarAccess.getProblemAccess().getStatementsAssignment_1()); 
            // InternalProblem.g:1615:2: ( rule__Problem__StatementsAssignment_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_QUOTED_ID && LA25_0<=RULE_ID)||LA25_0==16||(LA25_0>=19 && LA25_0<=22)||(LA25_0>=26 && LA25_0<=27)||LA25_0==29||LA25_0==33||LA25_0==41||LA25_0==44||LA25_0==46) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalProblem.g:1615:3: rule__Problem__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Problem__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalProblem.g:1624:1: rule__Problem__Group_0__0 : rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1 ;
    public final void rule__Problem__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1628:1: ( rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1 )
            // InternalProblem.g:1629:2: rule__Problem__Group_0__0__Impl rule__Problem__Group_0__1
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
    // InternalProblem.g:1636:1: rule__Problem__Group_0__0__Impl : ( 'problem' ) ;
    public final void rule__Problem__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1640:1: ( ( 'problem' ) )
            // InternalProblem.g:1641:1: ( 'problem' )
            {
            // InternalProblem.g:1641:1: ( 'problem' )
            // InternalProblem.g:1642:2: 'problem'
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
    // InternalProblem.g:1651:1: rule__Problem__Group_0__1 : rule__Problem__Group_0__1__Impl rule__Problem__Group_0__2 ;
    public final void rule__Problem__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1655:1: ( rule__Problem__Group_0__1__Impl rule__Problem__Group_0__2 )
            // InternalProblem.g:1656:2: rule__Problem__Group_0__1__Impl rule__Problem__Group_0__2
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
    // InternalProblem.g:1663:1: rule__Problem__Group_0__1__Impl : ( ( rule__Problem__NameAssignment_0_1 ) ) ;
    public final void rule__Problem__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1667:1: ( ( ( rule__Problem__NameAssignment_0_1 ) ) )
            // InternalProblem.g:1668:1: ( ( rule__Problem__NameAssignment_0_1 ) )
            {
            // InternalProblem.g:1668:1: ( ( rule__Problem__NameAssignment_0_1 ) )
            // InternalProblem.g:1669:2: ( rule__Problem__NameAssignment_0_1 )
            {
             before(grammarAccess.getProblemAccess().getNameAssignment_0_1()); 
            // InternalProblem.g:1670:2: ( rule__Problem__NameAssignment_0_1 )
            // InternalProblem.g:1670:3: rule__Problem__NameAssignment_0_1
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
    // InternalProblem.g:1678:1: rule__Problem__Group_0__2 : rule__Problem__Group_0__2__Impl ;
    public final void rule__Problem__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1682:1: ( rule__Problem__Group_0__2__Impl )
            // InternalProblem.g:1683:2: rule__Problem__Group_0__2__Impl
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
    // InternalProblem.g:1689:1: rule__Problem__Group_0__2__Impl : ( '.' ) ;
    public final void rule__Problem__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1693:1: ( ( '.' ) )
            // InternalProblem.g:1694:1: ( '.' )
            {
            // InternalProblem.g:1694:1: ( '.' )
            // InternalProblem.g:1695:2: '.'
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
    // InternalProblem.g:1705:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1709:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalProblem.g:1710:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
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
    // InternalProblem.g:1717:1: rule__ClassDeclaration__Group__0__Impl : ( ( rule__ClassDeclaration__AbstractAssignment_0 )? ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1721:1: ( ( ( rule__ClassDeclaration__AbstractAssignment_0 )? ) )
            // InternalProblem.g:1722:1: ( ( rule__ClassDeclaration__AbstractAssignment_0 )? )
            {
            // InternalProblem.g:1722:1: ( ( rule__ClassDeclaration__AbstractAssignment_0 )? )
            // InternalProblem.g:1723:2: ( rule__ClassDeclaration__AbstractAssignment_0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getAbstractAssignment_0()); 
            // InternalProblem.g:1724:2: ( rule__ClassDeclaration__AbstractAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProblem.g:1724:3: rule__ClassDeclaration__AbstractAssignment_0
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
    // InternalProblem.g:1732:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1736:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalProblem.g:1737:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
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
    // InternalProblem.g:1744:1: rule__ClassDeclaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1748:1: ( ( 'class' ) )
            // InternalProblem.g:1749:1: ( 'class' )
            {
            // InternalProblem.g:1749:1: ( 'class' )
            // InternalProblem.g:1750:2: 'class'
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
    // InternalProblem.g:1759:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1763:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalProblem.g:1764:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
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
    // InternalProblem.g:1771:1: rule__ClassDeclaration__Group__2__Impl : ( ( rule__ClassDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1775:1: ( ( ( rule__ClassDeclaration__NameAssignment_2 ) ) )
            // InternalProblem.g:1776:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            {
            // InternalProblem.g:1776:1: ( ( rule__ClassDeclaration__NameAssignment_2 ) )
            // InternalProblem.g:1777:2: ( rule__ClassDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getClassDeclarationAccess().getNameAssignment_2()); 
            // InternalProblem.g:1778:2: ( rule__ClassDeclaration__NameAssignment_2 )
            // InternalProblem.g:1778:3: rule__ClassDeclaration__NameAssignment_2
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
    // InternalProblem.g:1786:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1790:1: ( rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 )
            // InternalProblem.g:1791:2: rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4
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
    // InternalProblem.g:1798:1: rule__ClassDeclaration__Group__3__Impl : ( ( rule__ClassDeclaration__Group_3__0 )? ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1802:1: ( ( ( rule__ClassDeclaration__Group_3__0 )? ) )
            // InternalProblem.g:1803:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            {
            // InternalProblem.g:1803:1: ( ( rule__ClassDeclaration__Group_3__0 )? )
            // InternalProblem.g:1804:2: ( rule__ClassDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3()); 
            // InternalProblem.g:1805:2: ( rule__ClassDeclaration__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalProblem.g:1805:3: rule__ClassDeclaration__Group_3__0
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
    // InternalProblem.g:1813:1: rule__ClassDeclaration__Group__4 : rule__ClassDeclaration__Group__4__Impl ;
    public final void rule__ClassDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1817:1: ( rule__ClassDeclaration__Group__4__Impl )
            // InternalProblem.g:1818:2: rule__ClassDeclaration__Group__4__Impl
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
    // InternalProblem.g:1824:1: rule__ClassDeclaration__Group__4__Impl : ( ( rule__ClassDeclaration__Alternatives_4 ) ) ;
    public final void rule__ClassDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1828:1: ( ( ( rule__ClassDeclaration__Alternatives_4 ) ) )
            // InternalProblem.g:1829:1: ( ( rule__ClassDeclaration__Alternatives_4 ) )
            {
            // InternalProblem.g:1829:1: ( ( rule__ClassDeclaration__Alternatives_4 ) )
            // InternalProblem.g:1830:2: ( rule__ClassDeclaration__Alternatives_4 )
            {
             before(grammarAccess.getClassDeclarationAccess().getAlternatives_4()); 
            // InternalProblem.g:1831:2: ( rule__ClassDeclaration__Alternatives_4 )
            // InternalProblem.g:1831:3: rule__ClassDeclaration__Alternatives_4
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
    // InternalProblem.g:1840:1: rule__ClassDeclaration__Group_3__0 : rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 ;
    public final void rule__ClassDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1844:1: ( rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1 )
            // InternalProblem.g:1845:2: rule__ClassDeclaration__Group_3__0__Impl rule__ClassDeclaration__Group_3__1
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
    // InternalProblem.g:1852:1: rule__ClassDeclaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__ClassDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1856:1: ( ( 'extends' ) )
            // InternalProblem.g:1857:1: ( 'extends' )
            {
            // InternalProblem.g:1857:1: ( 'extends' )
            // InternalProblem.g:1858:2: 'extends'
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
    // InternalProblem.g:1867:1: rule__ClassDeclaration__Group_3__1 : rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 ;
    public final void rule__ClassDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1871:1: ( rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2 )
            // InternalProblem.g:1872:2: rule__ClassDeclaration__Group_3__1__Impl rule__ClassDeclaration__Group_3__2
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
    // InternalProblem.g:1879:1: rule__ClassDeclaration__Group_3__1__Impl : ( ( rule__ClassDeclaration__SuperTypesAssignment_3_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1883:1: ( ( ( rule__ClassDeclaration__SuperTypesAssignment_3_1 ) ) )
            // InternalProblem.g:1884:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_1 ) )
            {
            // InternalProblem.g:1884:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_1 ) )
            // InternalProblem.g:1885:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesAssignment_3_1()); 
            // InternalProblem.g:1886:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_1 )
            // InternalProblem.g:1886:3: rule__ClassDeclaration__SuperTypesAssignment_3_1
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
    // InternalProblem.g:1894:1: rule__ClassDeclaration__Group_3__2 : rule__ClassDeclaration__Group_3__2__Impl ;
    public final void rule__ClassDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1898:1: ( rule__ClassDeclaration__Group_3__2__Impl )
            // InternalProblem.g:1899:2: rule__ClassDeclaration__Group_3__2__Impl
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
    // InternalProblem.g:1905:1: rule__ClassDeclaration__Group_3__2__Impl : ( ( rule__ClassDeclaration__Group_3_2__0 )* ) ;
    public final void rule__ClassDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1909:1: ( ( ( rule__ClassDeclaration__Group_3_2__0 )* ) )
            // InternalProblem.g:1910:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            {
            // InternalProblem.g:1910:1: ( ( rule__ClassDeclaration__Group_3_2__0 )* )
            // InternalProblem.g:1911:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_3_2()); 
            // InternalProblem.g:1912:2: ( rule__ClassDeclaration__Group_3_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==13) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalProblem.g:1912:3: rule__ClassDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ClassDeclaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalProblem.g:1921:1: rule__ClassDeclaration__Group_3_2__0 : rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 ;
    public final void rule__ClassDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1925:1: ( rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1 )
            // InternalProblem.g:1926:2: rule__ClassDeclaration__Group_3_2__0__Impl rule__ClassDeclaration__Group_3_2__1
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
    // InternalProblem.g:1933:1: rule__ClassDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1937:1: ( ( ',' ) )
            // InternalProblem.g:1938:1: ( ',' )
            {
            // InternalProblem.g:1938:1: ( ',' )
            // InternalProblem.g:1939:2: ','
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
    // InternalProblem.g:1948:1: rule__ClassDeclaration__Group_3_2__1 : rule__ClassDeclaration__Group_3_2__1__Impl ;
    public final void rule__ClassDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1952:1: ( rule__ClassDeclaration__Group_3_2__1__Impl )
            // InternalProblem.g:1953:2: rule__ClassDeclaration__Group_3_2__1__Impl
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
    // InternalProblem.g:1959:1: rule__ClassDeclaration__Group_3_2__1__Impl : ( ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 ) ) ;
    public final void rule__ClassDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1963:1: ( ( ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 ) ) )
            // InternalProblem.g:1964:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 ) )
            {
            // InternalProblem.g:1964:1: ( ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 ) )
            // InternalProblem.g:1965:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesAssignment_3_2_1()); 
            // InternalProblem.g:1966:2: ( rule__ClassDeclaration__SuperTypesAssignment_3_2_1 )
            // InternalProblem.g:1966:3: rule__ClassDeclaration__SuperTypesAssignment_3_2_1
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
    // InternalProblem.g:1975:1: rule__ClassDeclaration__Group_4_0__0 : rule__ClassDeclaration__Group_4_0__0__Impl rule__ClassDeclaration__Group_4_0__1 ;
    public final void rule__ClassDeclaration__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1979:1: ( rule__ClassDeclaration__Group_4_0__0__Impl rule__ClassDeclaration__Group_4_0__1 )
            // InternalProblem.g:1980:2: rule__ClassDeclaration__Group_4_0__0__Impl rule__ClassDeclaration__Group_4_0__1
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
    // InternalProblem.g:1987:1: rule__ClassDeclaration__Group_4_0__0__Impl : ( '{' ) ;
    public final void rule__ClassDeclaration__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1991:1: ( ( '{' ) )
            // InternalProblem.g:1992:1: ( '{' )
            {
            // InternalProblem.g:1992:1: ( '{' )
            // InternalProblem.g:1993:2: '{'
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
    // InternalProblem.g:2002:1: rule__ClassDeclaration__Group_4_0__1 : rule__ClassDeclaration__Group_4_0__1__Impl rule__ClassDeclaration__Group_4_0__2 ;
    public final void rule__ClassDeclaration__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2006:1: ( rule__ClassDeclaration__Group_4_0__1__Impl rule__ClassDeclaration__Group_4_0__2 )
            // InternalProblem.g:2007:2: rule__ClassDeclaration__Group_4_0__1__Impl rule__ClassDeclaration__Group_4_0__2
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
    // InternalProblem.g:2014:1: rule__ClassDeclaration__Group_4_0__1__Impl : ( ( rule__ClassDeclaration__Group_4_0_1__0 )* ) ;
    public final void rule__ClassDeclaration__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2018:1: ( ( ( rule__ClassDeclaration__Group_4_0_1__0 )* ) )
            // InternalProblem.g:2019:1: ( ( rule__ClassDeclaration__Group_4_0_1__0 )* )
            {
            // InternalProblem.g:2019:1: ( ( rule__ClassDeclaration__Group_4_0_1__0 )* )
            // InternalProblem.g:2020:2: ( rule__ClassDeclaration__Group_4_0_1__0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup_4_0_1()); 
            // InternalProblem.g:2021:2: ( rule__ClassDeclaration__Group_4_0_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_QUOTED_ID && LA29_0<=RULE_ID)||LA29_0==15||(LA29_0>=19 && LA29_0<=22)||LA29_0==45) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalProblem.g:2021:3: rule__ClassDeclaration__Group_4_0_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ClassDeclaration__Group_4_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalProblem.g:2029:1: rule__ClassDeclaration__Group_4_0__2 : rule__ClassDeclaration__Group_4_0__2__Impl ;
    public final void rule__ClassDeclaration__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2033:1: ( rule__ClassDeclaration__Group_4_0__2__Impl )
            // InternalProblem.g:2034:2: rule__ClassDeclaration__Group_4_0__2__Impl
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
    // InternalProblem.g:2040:1: rule__ClassDeclaration__Group_4_0__2__Impl : ( '}' ) ;
    public final void rule__ClassDeclaration__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2044:1: ( ( '}' ) )
            // InternalProblem.g:2045:1: ( '}' )
            {
            // InternalProblem.g:2045:1: ( '}' )
            // InternalProblem.g:2046:2: '}'
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
    // InternalProblem.g:2056:1: rule__ClassDeclaration__Group_4_0_1__0 : rule__ClassDeclaration__Group_4_0_1__0__Impl rule__ClassDeclaration__Group_4_0_1__1 ;
    public final void rule__ClassDeclaration__Group_4_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2060:1: ( rule__ClassDeclaration__Group_4_0_1__0__Impl rule__ClassDeclaration__Group_4_0_1__1 )
            // InternalProblem.g:2061:2: rule__ClassDeclaration__Group_4_0_1__0__Impl rule__ClassDeclaration__Group_4_0_1__1
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
    // InternalProblem.g:2068:1: rule__ClassDeclaration__Group_4_0_1__0__Impl : ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 ) ) ;
    public final void rule__ClassDeclaration__Group_4_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2072:1: ( ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 ) ) )
            // InternalProblem.g:2073:1: ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 ) )
            {
            // InternalProblem.g:2073:1: ( ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 ) )
            // InternalProblem.g:2074:2: ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsAssignment_4_0_1_0()); 
            // InternalProblem.g:2075:2: ( rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 )
            // InternalProblem.g:2075:3: rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0
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
    // InternalProblem.g:2083:1: rule__ClassDeclaration__Group_4_0_1__1 : rule__ClassDeclaration__Group_4_0_1__1__Impl ;
    public final void rule__ClassDeclaration__Group_4_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2087:1: ( rule__ClassDeclaration__Group_4_0_1__1__Impl )
            // InternalProblem.g:2088:2: rule__ClassDeclaration__Group_4_0_1__1__Impl
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
    // InternalProblem.g:2094:1: rule__ClassDeclaration__Group_4_0_1__1__Impl : ( ( ';' )? ) ;
    public final void rule__ClassDeclaration__Group_4_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2098:1: ( ( ( ';' )? ) )
            // InternalProblem.g:2099:1: ( ( ';' )? )
            {
            // InternalProblem.g:2099:1: ( ( ';' )? )
            // InternalProblem.g:2100:2: ( ';' )?
            {
             before(grammarAccess.getClassDeclarationAccess().getSemicolonKeyword_4_0_1_1()); 
            // InternalProblem.g:2101:2: ( ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==14) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalProblem.g:2101:3: ';'
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
    // InternalProblem.g:2110:1: rule__EnumDeclaration__Group__0 : rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 ;
    public final void rule__EnumDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2114:1: ( rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 )
            // InternalProblem.g:2115:2: rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1
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
    // InternalProblem.g:2122:1: rule__EnumDeclaration__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2126:1: ( ( 'enum' ) )
            // InternalProblem.g:2127:1: ( 'enum' )
            {
            // InternalProblem.g:2127:1: ( 'enum' )
            // InternalProblem.g:2128:2: 'enum'
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
    // InternalProblem.g:2137:1: rule__EnumDeclaration__Group__1 : rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 ;
    public final void rule__EnumDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2141:1: ( rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 )
            // InternalProblem.g:2142:2: rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2
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
    // InternalProblem.g:2149:1: rule__EnumDeclaration__Group__1__Impl : ( ( rule__EnumDeclaration__NameAssignment_1 ) ) ;
    public final void rule__EnumDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2153:1: ( ( ( rule__EnumDeclaration__NameAssignment_1 ) ) )
            // InternalProblem.g:2154:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            {
            // InternalProblem.g:2154:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            // InternalProblem.g:2155:2: ( rule__EnumDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 
            // InternalProblem.g:2156:2: ( rule__EnumDeclaration__NameAssignment_1 )
            // InternalProblem.g:2156:3: rule__EnumDeclaration__NameAssignment_1
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
    // InternalProblem.g:2164:1: rule__EnumDeclaration__Group__2 : rule__EnumDeclaration__Group__2__Impl ;
    public final void rule__EnumDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2168:1: ( rule__EnumDeclaration__Group__2__Impl )
            // InternalProblem.g:2169:2: rule__EnumDeclaration__Group__2__Impl
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
    // InternalProblem.g:2175:1: rule__EnumDeclaration__Group__2__Impl : ( ( rule__EnumDeclaration__Alternatives_2 ) ) ;
    public final void rule__EnumDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2179:1: ( ( ( rule__EnumDeclaration__Alternatives_2 ) ) )
            // InternalProblem.g:2180:1: ( ( rule__EnumDeclaration__Alternatives_2 ) )
            {
            // InternalProblem.g:2180:1: ( ( rule__EnumDeclaration__Alternatives_2 ) )
            // InternalProblem.g:2181:2: ( rule__EnumDeclaration__Alternatives_2 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getAlternatives_2()); 
            // InternalProblem.g:2182:2: ( rule__EnumDeclaration__Alternatives_2 )
            // InternalProblem.g:2182:3: rule__EnumDeclaration__Alternatives_2
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
    // InternalProblem.g:2191:1: rule__EnumDeclaration__Group_2_0__0 : rule__EnumDeclaration__Group_2_0__0__Impl rule__EnumDeclaration__Group_2_0__1 ;
    public final void rule__EnumDeclaration__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2195:1: ( rule__EnumDeclaration__Group_2_0__0__Impl rule__EnumDeclaration__Group_2_0__1 )
            // InternalProblem.g:2196:2: rule__EnumDeclaration__Group_2_0__0__Impl rule__EnumDeclaration__Group_2_0__1
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
    // InternalProblem.g:2203:1: rule__EnumDeclaration__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__EnumDeclaration__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2207:1: ( ( '{' ) )
            // InternalProblem.g:2208:1: ( '{' )
            {
            // InternalProblem.g:2208:1: ( '{' )
            // InternalProblem.g:2209:2: '{'
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
    // InternalProblem.g:2218:1: rule__EnumDeclaration__Group_2_0__1 : rule__EnumDeclaration__Group_2_0__1__Impl rule__EnumDeclaration__Group_2_0__2 ;
    public final void rule__EnumDeclaration__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2222:1: ( rule__EnumDeclaration__Group_2_0__1__Impl rule__EnumDeclaration__Group_2_0__2 )
            // InternalProblem.g:2223:2: rule__EnumDeclaration__Group_2_0__1__Impl rule__EnumDeclaration__Group_2_0__2
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
    // InternalProblem.g:2230:1: rule__EnumDeclaration__Group_2_0__1__Impl : ( ( rule__EnumDeclaration__Group_2_0_1__0 )? ) ;
    public final void rule__EnumDeclaration__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2234:1: ( ( ( rule__EnumDeclaration__Group_2_0_1__0 )? ) )
            // InternalProblem.g:2235:1: ( ( rule__EnumDeclaration__Group_2_0_1__0 )? )
            {
            // InternalProblem.g:2235:1: ( ( rule__EnumDeclaration__Group_2_0_1__0 )? )
            // InternalProblem.g:2236:2: ( rule__EnumDeclaration__Group_2_0_1__0 )?
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup_2_0_1()); 
            // InternalProblem.g:2237:2: ( rule__EnumDeclaration__Group_2_0_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_QUOTED_ID && LA31_0<=RULE_ID)||(LA31_0>=19 && LA31_0<=22)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalProblem.g:2237:3: rule__EnumDeclaration__Group_2_0_1__0
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
    // InternalProblem.g:2245:1: rule__EnumDeclaration__Group_2_0__2 : rule__EnumDeclaration__Group_2_0__2__Impl ;
    public final void rule__EnumDeclaration__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2249:1: ( rule__EnumDeclaration__Group_2_0__2__Impl )
            // InternalProblem.g:2250:2: rule__EnumDeclaration__Group_2_0__2__Impl
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
    // InternalProblem.g:2256:1: rule__EnumDeclaration__Group_2_0__2__Impl : ( '}' ) ;
    public final void rule__EnumDeclaration__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2260:1: ( ( '}' ) )
            // InternalProblem.g:2261:1: ( '}' )
            {
            // InternalProblem.g:2261:1: ( '}' )
            // InternalProblem.g:2262:2: '}'
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
    // InternalProblem.g:2272:1: rule__EnumDeclaration__Group_2_0_1__0 : rule__EnumDeclaration__Group_2_0_1__0__Impl rule__EnumDeclaration__Group_2_0_1__1 ;
    public final void rule__EnumDeclaration__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2276:1: ( rule__EnumDeclaration__Group_2_0_1__0__Impl rule__EnumDeclaration__Group_2_0_1__1 )
            // InternalProblem.g:2277:2: rule__EnumDeclaration__Group_2_0_1__0__Impl rule__EnumDeclaration__Group_2_0_1__1
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
    // InternalProblem.g:2284:1: rule__EnumDeclaration__Group_2_0_1__0__Impl : ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 ) ) ;
    public final void rule__EnumDeclaration__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2288:1: ( ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 ) ) )
            // InternalProblem.g:2289:1: ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 ) )
            {
            // InternalProblem.g:2289:1: ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 ) )
            // InternalProblem.g:2290:2: ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getLiteralsAssignment_2_0_1_0()); 
            // InternalProblem.g:2291:2: ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 )
            // InternalProblem.g:2291:3: rule__EnumDeclaration__LiteralsAssignment_2_0_1_0
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
    // InternalProblem.g:2299:1: rule__EnumDeclaration__Group_2_0_1__1 : rule__EnumDeclaration__Group_2_0_1__1__Impl rule__EnumDeclaration__Group_2_0_1__2 ;
    public final void rule__EnumDeclaration__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2303:1: ( rule__EnumDeclaration__Group_2_0_1__1__Impl rule__EnumDeclaration__Group_2_0_1__2 )
            // InternalProblem.g:2304:2: rule__EnumDeclaration__Group_2_0_1__1__Impl rule__EnumDeclaration__Group_2_0_1__2
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
    // InternalProblem.g:2311:1: rule__EnumDeclaration__Group_2_0_1__1__Impl : ( ( rule__EnumDeclaration__Group_2_0_1_1__0 )* ) ;
    public final void rule__EnumDeclaration__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2315:1: ( ( ( rule__EnumDeclaration__Group_2_0_1_1__0 )* ) )
            // InternalProblem.g:2316:1: ( ( rule__EnumDeclaration__Group_2_0_1_1__0 )* )
            {
            // InternalProblem.g:2316:1: ( ( rule__EnumDeclaration__Group_2_0_1_1__0 )* )
            // InternalProblem.g:2317:2: ( rule__EnumDeclaration__Group_2_0_1_1__0 )*
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup_2_0_1_1()); 
            // InternalProblem.g:2318:2: ( rule__EnumDeclaration__Group_2_0_1_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==13) ) {
                    int LA32_1 = input.LA(2);

                    if ( ((LA32_1>=RULE_QUOTED_ID && LA32_1<=RULE_ID)||(LA32_1>=19 && LA32_1<=22)) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalProblem.g:2318:3: rule__EnumDeclaration__Group_2_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__EnumDeclaration__Group_2_0_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalProblem.g:2326:1: rule__EnumDeclaration__Group_2_0_1__2 : rule__EnumDeclaration__Group_2_0_1__2__Impl ;
    public final void rule__EnumDeclaration__Group_2_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2330:1: ( rule__EnumDeclaration__Group_2_0_1__2__Impl )
            // InternalProblem.g:2331:2: rule__EnumDeclaration__Group_2_0_1__2__Impl
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
    // InternalProblem.g:2337:1: rule__EnumDeclaration__Group_2_0_1__2__Impl : ( ( rule__EnumDeclaration__Alternatives_2_0_1_2 )? ) ;
    public final void rule__EnumDeclaration__Group_2_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2341:1: ( ( ( rule__EnumDeclaration__Alternatives_2_0_1_2 )? ) )
            // InternalProblem.g:2342:1: ( ( rule__EnumDeclaration__Alternatives_2_0_1_2 )? )
            {
            // InternalProblem.g:2342:1: ( ( rule__EnumDeclaration__Alternatives_2_0_1_2 )? )
            // InternalProblem.g:2343:2: ( rule__EnumDeclaration__Alternatives_2_0_1_2 )?
            {
             before(grammarAccess.getEnumDeclarationAccess().getAlternatives_2_0_1_2()); 
            // InternalProblem.g:2344:2: ( rule__EnumDeclaration__Alternatives_2_0_1_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=13 && LA33_0<=14)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalProblem.g:2344:3: rule__EnumDeclaration__Alternatives_2_0_1_2
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
    // InternalProblem.g:2353:1: rule__EnumDeclaration__Group_2_0_1_1__0 : rule__EnumDeclaration__Group_2_0_1_1__0__Impl rule__EnumDeclaration__Group_2_0_1_1__1 ;
    public final void rule__EnumDeclaration__Group_2_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2357:1: ( rule__EnumDeclaration__Group_2_0_1_1__0__Impl rule__EnumDeclaration__Group_2_0_1_1__1 )
            // InternalProblem.g:2358:2: rule__EnumDeclaration__Group_2_0_1_1__0__Impl rule__EnumDeclaration__Group_2_0_1_1__1
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
    // InternalProblem.g:2365:1: rule__EnumDeclaration__Group_2_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__EnumDeclaration__Group_2_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2369:1: ( ( ',' ) )
            // InternalProblem.g:2370:1: ( ',' )
            {
            // InternalProblem.g:2370:1: ( ',' )
            // InternalProblem.g:2371:2: ','
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
    // InternalProblem.g:2380:1: rule__EnumDeclaration__Group_2_0_1_1__1 : rule__EnumDeclaration__Group_2_0_1_1__1__Impl ;
    public final void rule__EnumDeclaration__Group_2_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2384:1: ( rule__EnumDeclaration__Group_2_0_1_1__1__Impl )
            // InternalProblem.g:2385:2: rule__EnumDeclaration__Group_2_0_1_1__1__Impl
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
    // InternalProblem.g:2391:1: rule__EnumDeclaration__Group_2_0_1_1__1__Impl : ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 ) ) ;
    public final void rule__EnumDeclaration__Group_2_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2395:1: ( ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 ) ) )
            // InternalProblem.g:2396:1: ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 ) )
            {
            // InternalProblem.g:2396:1: ( ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 ) )
            // InternalProblem.g:2397:2: ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getLiteralsAssignment_2_0_1_1_1()); 
            // InternalProblem.g:2398:2: ( rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 )
            // InternalProblem.g:2398:3: rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1
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
    // InternalProblem.g:2407:1: rule__ReferenceDeclaration__Group__0 : rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1 ;
    public final void rule__ReferenceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2411:1: ( rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1 )
            // InternalProblem.g:2412:2: rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1
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
    // InternalProblem.g:2419:1: rule__ReferenceDeclaration__Group__0__Impl : ( ( rule__ReferenceDeclaration__Alternatives_0 )? ) ;
    public final void rule__ReferenceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2423:1: ( ( ( rule__ReferenceDeclaration__Alternatives_0 )? ) )
            // InternalProblem.g:2424:1: ( ( rule__ReferenceDeclaration__Alternatives_0 )? )
            {
            // InternalProblem.g:2424:1: ( ( rule__ReferenceDeclaration__Alternatives_0 )? )
            // InternalProblem.g:2425:2: ( rule__ReferenceDeclaration__Alternatives_0 )?
            {
             before(grammarAccess.getReferenceDeclarationAccess().getAlternatives_0()); 
            // InternalProblem.g:2426:2: ( rule__ReferenceDeclaration__Alternatives_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==15||LA34_0==45) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalProblem.g:2426:3: rule__ReferenceDeclaration__Alternatives_0
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
    // InternalProblem.g:2434:1: rule__ReferenceDeclaration__Group__1 : rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2 ;
    public final void rule__ReferenceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2438:1: ( rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2 )
            // InternalProblem.g:2439:2: rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2
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
    // InternalProblem.g:2446:1: rule__ReferenceDeclaration__Group__1__Impl : ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) ) ;
    public final void rule__ReferenceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2450:1: ( ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) ) )
            // InternalProblem.g:2451:1: ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) )
            {
            // InternalProblem.g:2451:1: ( ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 ) )
            // InternalProblem.g:2452:2: ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeAssignment_1()); 
            // InternalProblem.g:2453:2: ( rule__ReferenceDeclaration__ReferenceTypeAssignment_1 )
            // InternalProblem.g:2453:3: rule__ReferenceDeclaration__ReferenceTypeAssignment_1
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
    // InternalProblem.g:2461:1: rule__ReferenceDeclaration__Group__2 : rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3 ;
    public final void rule__ReferenceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2465:1: ( rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3 )
            // InternalProblem.g:2466:2: rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3
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
    // InternalProblem.g:2473:1: rule__ReferenceDeclaration__Group__2__Impl : ( ( rule__ReferenceDeclaration__Group_2__0 )? ) ;
    public final void rule__ReferenceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2477:1: ( ( ( rule__ReferenceDeclaration__Group_2__0 )? ) )
            // InternalProblem.g:2478:1: ( ( rule__ReferenceDeclaration__Group_2__0 )? )
            {
            // InternalProblem.g:2478:1: ( ( rule__ReferenceDeclaration__Group_2__0 )? )
            // InternalProblem.g:2479:2: ( rule__ReferenceDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getReferenceDeclarationAccess().getGroup_2()); 
            // InternalProblem.g:2480:2: ( rule__ReferenceDeclaration__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalProblem.g:2480:3: rule__ReferenceDeclaration__Group_2__0
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
    // InternalProblem.g:2488:1: rule__ReferenceDeclaration__Group__3 : rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4 ;
    public final void rule__ReferenceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2492:1: ( rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4 )
            // InternalProblem.g:2493:2: rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4
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
    // InternalProblem.g:2500:1: rule__ReferenceDeclaration__Group__3__Impl : ( ( rule__ReferenceDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ReferenceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2504:1: ( ( ( rule__ReferenceDeclaration__NameAssignment_3 ) ) )
            // InternalProblem.g:2505:1: ( ( rule__ReferenceDeclaration__NameAssignment_3 ) )
            {
            // InternalProblem.g:2505:1: ( ( rule__ReferenceDeclaration__NameAssignment_3 ) )
            // InternalProblem.g:2506:2: ( rule__ReferenceDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getNameAssignment_3()); 
            // InternalProblem.g:2507:2: ( rule__ReferenceDeclaration__NameAssignment_3 )
            // InternalProblem.g:2507:3: rule__ReferenceDeclaration__NameAssignment_3
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
    // InternalProblem.g:2515:1: rule__ReferenceDeclaration__Group__4 : rule__ReferenceDeclaration__Group__4__Impl ;
    public final void rule__ReferenceDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2519:1: ( rule__ReferenceDeclaration__Group__4__Impl )
            // InternalProblem.g:2520:2: rule__ReferenceDeclaration__Group__4__Impl
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
    // InternalProblem.g:2526:1: rule__ReferenceDeclaration__Group__4__Impl : ( ( rule__ReferenceDeclaration__Group_4__0 )? ) ;
    public final void rule__ReferenceDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2530:1: ( ( ( rule__ReferenceDeclaration__Group_4__0 )? ) )
            // InternalProblem.g:2531:1: ( ( rule__ReferenceDeclaration__Group_4__0 )? )
            {
            // InternalProblem.g:2531:1: ( ( rule__ReferenceDeclaration__Group_4__0 )? )
            // InternalProblem.g:2532:2: ( rule__ReferenceDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getReferenceDeclarationAccess().getGroup_4()); 
            // InternalProblem.g:2533:2: ( rule__ReferenceDeclaration__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalProblem.g:2533:3: rule__ReferenceDeclaration__Group_4__0
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
    // InternalProblem.g:2542:1: rule__ReferenceDeclaration__Group_2__0 : rule__ReferenceDeclaration__Group_2__0__Impl rule__ReferenceDeclaration__Group_2__1 ;
    public final void rule__ReferenceDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2546:1: ( rule__ReferenceDeclaration__Group_2__0__Impl rule__ReferenceDeclaration__Group_2__1 )
            // InternalProblem.g:2547:2: rule__ReferenceDeclaration__Group_2__0__Impl rule__ReferenceDeclaration__Group_2__1
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
    // InternalProblem.g:2554:1: rule__ReferenceDeclaration__Group_2__0__Impl : ( '[' ) ;
    public final void rule__ReferenceDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2558:1: ( ( '[' ) )
            // InternalProblem.g:2559:1: ( '[' )
            {
            // InternalProblem.g:2559:1: ( '[' )
            // InternalProblem.g:2560:2: '['
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
    // InternalProblem.g:2569:1: rule__ReferenceDeclaration__Group_2__1 : rule__ReferenceDeclaration__Group_2__1__Impl rule__ReferenceDeclaration__Group_2__2 ;
    public final void rule__ReferenceDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2573:1: ( rule__ReferenceDeclaration__Group_2__1__Impl rule__ReferenceDeclaration__Group_2__2 )
            // InternalProblem.g:2574:2: rule__ReferenceDeclaration__Group_2__1__Impl rule__ReferenceDeclaration__Group_2__2
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
    // InternalProblem.g:2581:1: rule__ReferenceDeclaration__Group_2__1__Impl : ( ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 ) ) ;
    public final void rule__ReferenceDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2585:1: ( ( ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 ) ) )
            // InternalProblem.g:2586:1: ( ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 ) )
            {
            // InternalProblem.g:2586:1: ( ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 ) )
            // InternalProblem.g:2587:2: ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getMultiplicityAssignment_2_1()); 
            // InternalProblem.g:2588:2: ( rule__ReferenceDeclaration__MultiplicityAssignment_2_1 )
            // InternalProblem.g:2588:3: rule__ReferenceDeclaration__MultiplicityAssignment_2_1
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
    // InternalProblem.g:2596:1: rule__ReferenceDeclaration__Group_2__2 : rule__ReferenceDeclaration__Group_2__2__Impl ;
    public final void rule__ReferenceDeclaration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2600:1: ( rule__ReferenceDeclaration__Group_2__2__Impl )
            // InternalProblem.g:2601:2: rule__ReferenceDeclaration__Group_2__2__Impl
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
    // InternalProblem.g:2607:1: rule__ReferenceDeclaration__Group_2__2__Impl : ( ']' ) ;
    public final void rule__ReferenceDeclaration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2611:1: ( ( ']' ) )
            // InternalProblem.g:2612:1: ( ']' )
            {
            // InternalProblem.g:2612:1: ( ']' )
            // InternalProblem.g:2613:2: ']'
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
    // InternalProblem.g:2623:1: rule__ReferenceDeclaration__Group_4__0 : rule__ReferenceDeclaration__Group_4__0__Impl rule__ReferenceDeclaration__Group_4__1 ;
    public final void rule__ReferenceDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2627:1: ( rule__ReferenceDeclaration__Group_4__0__Impl rule__ReferenceDeclaration__Group_4__1 )
            // InternalProblem.g:2628:2: rule__ReferenceDeclaration__Group_4__0__Impl rule__ReferenceDeclaration__Group_4__1
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
    // InternalProblem.g:2635:1: rule__ReferenceDeclaration__Group_4__0__Impl : ( 'opposite' ) ;
    public final void rule__ReferenceDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2639:1: ( ( 'opposite' ) )
            // InternalProblem.g:2640:1: ( 'opposite' )
            {
            // InternalProblem.g:2640:1: ( 'opposite' )
            // InternalProblem.g:2641:2: 'opposite'
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
    // InternalProblem.g:2650:1: rule__ReferenceDeclaration__Group_4__1 : rule__ReferenceDeclaration__Group_4__1__Impl ;
    public final void rule__ReferenceDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2654:1: ( rule__ReferenceDeclaration__Group_4__1__Impl )
            // InternalProblem.g:2655:2: rule__ReferenceDeclaration__Group_4__1__Impl
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
    // InternalProblem.g:2661:1: rule__ReferenceDeclaration__Group_4__1__Impl : ( ( rule__ReferenceDeclaration__OppositeAssignment_4_1 ) ) ;
    public final void rule__ReferenceDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2665:1: ( ( ( rule__ReferenceDeclaration__OppositeAssignment_4_1 ) ) )
            // InternalProblem.g:2666:1: ( ( rule__ReferenceDeclaration__OppositeAssignment_4_1 ) )
            {
            // InternalProblem.g:2666:1: ( ( rule__ReferenceDeclaration__OppositeAssignment_4_1 ) )
            // InternalProblem.g:2667:2: ( rule__ReferenceDeclaration__OppositeAssignment_4_1 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getOppositeAssignment_4_1()); 
            // InternalProblem.g:2668:2: ( rule__ReferenceDeclaration__OppositeAssignment_4_1 )
            // InternalProblem.g:2668:3: rule__ReferenceDeclaration__OppositeAssignment_4_1
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
    // InternalProblem.g:2677:1: rule__PredicateDefinition__Group__0 : rule__PredicateDefinition__Group__0__Impl rule__PredicateDefinition__Group__1 ;
    public final void rule__PredicateDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2681:1: ( rule__PredicateDefinition__Group__0__Impl rule__PredicateDefinition__Group__1 )
            // InternalProblem.g:2682:2: rule__PredicateDefinition__Group__0__Impl rule__PredicateDefinition__Group__1
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
    // InternalProblem.g:2689:1: rule__PredicateDefinition__Group__0__Impl : ( ( rule__PredicateDefinition__Alternatives_0 ) ) ;
    public final void rule__PredicateDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2693:1: ( ( ( rule__PredicateDefinition__Alternatives_0 ) ) )
            // InternalProblem.g:2694:1: ( ( rule__PredicateDefinition__Alternatives_0 ) )
            {
            // InternalProblem.g:2694:1: ( ( rule__PredicateDefinition__Alternatives_0 ) )
            // InternalProblem.g:2695:2: ( rule__PredicateDefinition__Alternatives_0 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getAlternatives_0()); 
            // InternalProblem.g:2696:2: ( rule__PredicateDefinition__Alternatives_0 )
            // InternalProblem.g:2696:3: rule__PredicateDefinition__Alternatives_0
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
    // InternalProblem.g:2704:1: rule__PredicateDefinition__Group__1 : rule__PredicateDefinition__Group__1__Impl rule__PredicateDefinition__Group__2 ;
    public final void rule__PredicateDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2708:1: ( rule__PredicateDefinition__Group__1__Impl rule__PredicateDefinition__Group__2 )
            // InternalProblem.g:2709:2: rule__PredicateDefinition__Group__1__Impl rule__PredicateDefinition__Group__2
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
    // InternalProblem.g:2716:1: rule__PredicateDefinition__Group__1__Impl : ( ( rule__PredicateDefinition__NameAssignment_1 ) ) ;
    public final void rule__PredicateDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2720:1: ( ( ( rule__PredicateDefinition__NameAssignment_1 ) ) )
            // InternalProblem.g:2721:1: ( ( rule__PredicateDefinition__NameAssignment_1 ) )
            {
            // InternalProblem.g:2721:1: ( ( rule__PredicateDefinition__NameAssignment_1 ) )
            // InternalProblem.g:2722:2: ( rule__PredicateDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getNameAssignment_1()); 
            // InternalProblem.g:2723:2: ( rule__PredicateDefinition__NameAssignment_1 )
            // InternalProblem.g:2723:3: rule__PredicateDefinition__NameAssignment_1
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
    // InternalProblem.g:2731:1: rule__PredicateDefinition__Group__2 : rule__PredicateDefinition__Group__2__Impl rule__PredicateDefinition__Group__3 ;
    public final void rule__PredicateDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2735:1: ( rule__PredicateDefinition__Group__2__Impl rule__PredicateDefinition__Group__3 )
            // InternalProblem.g:2736:2: rule__PredicateDefinition__Group__2__Impl rule__PredicateDefinition__Group__3
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
    // InternalProblem.g:2743:1: rule__PredicateDefinition__Group__2__Impl : ( '(' ) ;
    public final void rule__PredicateDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2747:1: ( ( '(' ) )
            // InternalProblem.g:2748:1: ( '(' )
            {
            // InternalProblem.g:2748:1: ( '(' )
            // InternalProblem.g:2749:2: '('
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
    // InternalProblem.g:2758:1: rule__PredicateDefinition__Group__3 : rule__PredicateDefinition__Group__3__Impl rule__PredicateDefinition__Group__4 ;
    public final void rule__PredicateDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2762:1: ( rule__PredicateDefinition__Group__3__Impl rule__PredicateDefinition__Group__4 )
            // InternalProblem.g:2763:2: rule__PredicateDefinition__Group__3__Impl rule__PredicateDefinition__Group__4
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
    // InternalProblem.g:2770:1: rule__PredicateDefinition__Group__3__Impl : ( ( rule__PredicateDefinition__Group_3__0 )? ) ;
    public final void rule__PredicateDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2774:1: ( ( ( rule__PredicateDefinition__Group_3__0 )? ) )
            // InternalProblem.g:2775:1: ( ( rule__PredicateDefinition__Group_3__0 )? )
            {
            // InternalProblem.g:2775:1: ( ( rule__PredicateDefinition__Group_3__0 )? )
            // InternalProblem.g:2776:2: ( rule__PredicateDefinition__Group_3__0 )?
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_3()); 
            // InternalProblem.g:2777:2: ( rule__PredicateDefinition__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_QUOTED_ID && LA37_0<=RULE_ID)||(LA37_0>=19 && LA37_0<=22)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalProblem.g:2777:3: rule__PredicateDefinition__Group_3__0
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
    // InternalProblem.g:2785:1: rule__PredicateDefinition__Group__4 : rule__PredicateDefinition__Group__4__Impl rule__PredicateDefinition__Group__5 ;
    public final void rule__PredicateDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2789:1: ( rule__PredicateDefinition__Group__4__Impl rule__PredicateDefinition__Group__5 )
            // InternalProblem.g:2790:2: rule__PredicateDefinition__Group__4__Impl rule__PredicateDefinition__Group__5
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
    // InternalProblem.g:2797:1: rule__PredicateDefinition__Group__4__Impl : ( ')' ) ;
    public final void rule__PredicateDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2801:1: ( ( ')' ) )
            // InternalProblem.g:2802:1: ( ')' )
            {
            // InternalProblem.g:2802:1: ( ')' )
            // InternalProblem.g:2803:2: ')'
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
    // InternalProblem.g:2812:1: rule__PredicateDefinition__Group__5 : rule__PredicateDefinition__Group__5__Impl rule__PredicateDefinition__Group__6 ;
    public final void rule__PredicateDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2816:1: ( rule__PredicateDefinition__Group__5__Impl rule__PredicateDefinition__Group__6 )
            // InternalProblem.g:2817:2: rule__PredicateDefinition__Group__5__Impl rule__PredicateDefinition__Group__6
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
    // InternalProblem.g:2824:1: rule__PredicateDefinition__Group__5__Impl : ( ( rule__PredicateDefinition__Group_5__0 )? ) ;
    public final void rule__PredicateDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2828:1: ( ( ( rule__PredicateDefinition__Group_5__0 )? ) )
            // InternalProblem.g:2829:1: ( ( rule__PredicateDefinition__Group_5__0 )? )
            {
            // InternalProblem.g:2829:1: ( ( rule__PredicateDefinition__Group_5__0 )? )
            // InternalProblem.g:2830:2: ( rule__PredicateDefinition__Group_5__0 )?
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_5()); 
            // InternalProblem.g:2831:2: ( rule__PredicateDefinition__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalProblem.g:2831:3: rule__PredicateDefinition__Group_5__0
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
    // InternalProblem.g:2839:1: rule__PredicateDefinition__Group__6 : rule__PredicateDefinition__Group__6__Impl ;
    public final void rule__PredicateDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2843:1: ( rule__PredicateDefinition__Group__6__Impl )
            // InternalProblem.g:2844:2: rule__PredicateDefinition__Group__6__Impl
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
    // InternalProblem.g:2850:1: rule__PredicateDefinition__Group__6__Impl : ( '.' ) ;
    public final void rule__PredicateDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2854:1: ( ( '.' ) )
            // InternalProblem.g:2855:1: ( '.' )
            {
            // InternalProblem.g:2855:1: ( '.' )
            // InternalProblem.g:2856:2: '.'
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
    // InternalProblem.g:2866:1: rule__PredicateDefinition__Group_0_0__0 : rule__PredicateDefinition__Group_0_0__0__Impl rule__PredicateDefinition__Group_0_0__1 ;
    public final void rule__PredicateDefinition__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2870:1: ( rule__PredicateDefinition__Group_0_0__0__Impl rule__PredicateDefinition__Group_0_0__1 )
            // InternalProblem.g:2871:2: rule__PredicateDefinition__Group_0_0__0__Impl rule__PredicateDefinition__Group_0_0__1
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
    // InternalProblem.g:2878:1: rule__PredicateDefinition__Group_0_0__0__Impl : ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) ) ;
    public final void rule__PredicateDefinition__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2882:1: ( ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) ) )
            // InternalProblem.g:2883:1: ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) )
            {
            // InternalProblem.g:2883:1: ( ( rule__PredicateDefinition__ErrorAssignment_0_0_0 ) )
            // InternalProblem.g:2884:2: ( rule__PredicateDefinition__ErrorAssignment_0_0_0 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getErrorAssignment_0_0_0()); 
            // InternalProblem.g:2885:2: ( rule__PredicateDefinition__ErrorAssignment_0_0_0 )
            // InternalProblem.g:2885:3: rule__PredicateDefinition__ErrorAssignment_0_0_0
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
    // InternalProblem.g:2893:1: rule__PredicateDefinition__Group_0_0__1 : rule__PredicateDefinition__Group_0_0__1__Impl ;
    public final void rule__PredicateDefinition__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2897:1: ( rule__PredicateDefinition__Group_0_0__1__Impl )
            // InternalProblem.g:2898:2: rule__PredicateDefinition__Group_0_0__1__Impl
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
    // InternalProblem.g:2904:1: rule__PredicateDefinition__Group_0_0__1__Impl : ( ( 'pred' )? ) ;
    public final void rule__PredicateDefinition__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2908:1: ( ( ( 'pred' )? ) )
            // InternalProblem.g:2909:1: ( ( 'pred' )? )
            {
            // InternalProblem.g:2909:1: ( ( 'pred' )? )
            // InternalProblem.g:2910:2: ( 'pred' )?
            {
             before(grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_0_1()); 
            // InternalProblem.g:2911:2: ( 'pred' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==16) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalProblem.g:2911:3: 'pred'
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
    // InternalProblem.g:2920:1: rule__PredicateDefinition__Group_3__0 : rule__PredicateDefinition__Group_3__0__Impl rule__PredicateDefinition__Group_3__1 ;
    public final void rule__PredicateDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2924:1: ( rule__PredicateDefinition__Group_3__0__Impl rule__PredicateDefinition__Group_3__1 )
            // InternalProblem.g:2925:2: rule__PredicateDefinition__Group_3__0__Impl rule__PredicateDefinition__Group_3__1
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
    // InternalProblem.g:2932:1: rule__PredicateDefinition__Group_3__0__Impl : ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) ) ;
    public final void rule__PredicateDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2936:1: ( ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) ) )
            // InternalProblem.g:2937:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) )
            {
            // InternalProblem.g:2937:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_0 ) )
            // InternalProblem.g:2938:2: ( rule__PredicateDefinition__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getParametersAssignment_3_0()); 
            // InternalProblem.g:2939:2: ( rule__PredicateDefinition__ParametersAssignment_3_0 )
            // InternalProblem.g:2939:3: rule__PredicateDefinition__ParametersAssignment_3_0
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
    // InternalProblem.g:2947:1: rule__PredicateDefinition__Group_3__1 : rule__PredicateDefinition__Group_3__1__Impl ;
    public final void rule__PredicateDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2951:1: ( rule__PredicateDefinition__Group_3__1__Impl )
            // InternalProblem.g:2952:2: rule__PredicateDefinition__Group_3__1__Impl
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
    // InternalProblem.g:2958:1: rule__PredicateDefinition__Group_3__1__Impl : ( ( rule__PredicateDefinition__Group_3_1__0 )* ) ;
    public final void rule__PredicateDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2962:1: ( ( ( rule__PredicateDefinition__Group_3_1__0 )* ) )
            // InternalProblem.g:2963:1: ( ( rule__PredicateDefinition__Group_3_1__0 )* )
            {
            // InternalProblem.g:2963:1: ( ( rule__PredicateDefinition__Group_3_1__0 )* )
            // InternalProblem.g:2964:2: ( rule__PredicateDefinition__Group_3_1__0 )*
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_3_1()); 
            // InternalProblem.g:2965:2: ( rule__PredicateDefinition__Group_3_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==13) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalProblem.g:2965:3: rule__PredicateDefinition__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PredicateDefinition__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalProblem.g:2974:1: rule__PredicateDefinition__Group_3_1__0 : rule__PredicateDefinition__Group_3_1__0__Impl rule__PredicateDefinition__Group_3_1__1 ;
    public final void rule__PredicateDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2978:1: ( rule__PredicateDefinition__Group_3_1__0__Impl rule__PredicateDefinition__Group_3_1__1 )
            // InternalProblem.g:2979:2: rule__PredicateDefinition__Group_3_1__0__Impl rule__PredicateDefinition__Group_3_1__1
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
    // InternalProblem.g:2986:1: rule__PredicateDefinition__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__PredicateDefinition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2990:1: ( ( ',' ) )
            // InternalProblem.g:2991:1: ( ',' )
            {
            // InternalProblem.g:2991:1: ( ',' )
            // InternalProblem.g:2992:2: ','
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
    // InternalProblem.g:3001:1: rule__PredicateDefinition__Group_3_1__1 : rule__PredicateDefinition__Group_3_1__1__Impl ;
    public final void rule__PredicateDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3005:1: ( rule__PredicateDefinition__Group_3_1__1__Impl )
            // InternalProblem.g:3006:2: rule__PredicateDefinition__Group_3_1__1__Impl
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
    // InternalProblem.g:3012:1: rule__PredicateDefinition__Group_3_1__1__Impl : ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__PredicateDefinition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3016:1: ( ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) ) )
            // InternalProblem.g:3017:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) )
            {
            // InternalProblem.g:3017:1: ( ( rule__PredicateDefinition__ParametersAssignment_3_1_1 ) )
            // InternalProblem.g:3018:2: ( rule__PredicateDefinition__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getParametersAssignment_3_1_1()); 
            // InternalProblem.g:3019:2: ( rule__PredicateDefinition__ParametersAssignment_3_1_1 )
            // InternalProblem.g:3019:3: rule__PredicateDefinition__ParametersAssignment_3_1_1
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
    // InternalProblem.g:3028:1: rule__PredicateDefinition__Group_5__0 : rule__PredicateDefinition__Group_5__0__Impl rule__PredicateDefinition__Group_5__1 ;
    public final void rule__PredicateDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3032:1: ( rule__PredicateDefinition__Group_5__0__Impl rule__PredicateDefinition__Group_5__1 )
            // InternalProblem.g:3033:2: rule__PredicateDefinition__Group_5__0__Impl rule__PredicateDefinition__Group_5__1
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
    // InternalProblem.g:3040:1: rule__PredicateDefinition__Group_5__0__Impl : ( ':-' ) ;
    public final void rule__PredicateDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3044:1: ( ( ':-' ) )
            // InternalProblem.g:3045:1: ( ':-' )
            {
            // InternalProblem.g:3045:1: ( ':-' )
            // InternalProblem.g:3046:2: ':-'
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
    // InternalProblem.g:3055:1: rule__PredicateDefinition__Group_5__1 : rule__PredicateDefinition__Group_5__1__Impl rule__PredicateDefinition__Group_5__2 ;
    public final void rule__PredicateDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3059:1: ( rule__PredicateDefinition__Group_5__1__Impl rule__PredicateDefinition__Group_5__2 )
            // InternalProblem.g:3060:2: rule__PredicateDefinition__Group_5__1__Impl rule__PredicateDefinition__Group_5__2
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
    // InternalProblem.g:3067:1: rule__PredicateDefinition__Group_5__1__Impl : ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) ) ;
    public final void rule__PredicateDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3071:1: ( ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) ) )
            // InternalProblem.g:3072:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) )
            {
            // InternalProblem.g:3072:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_1 ) )
            // InternalProblem.g:3073:2: ( rule__PredicateDefinition__BodiesAssignment_5_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getBodiesAssignment_5_1()); 
            // InternalProblem.g:3074:2: ( rule__PredicateDefinition__BodiesAssignment_5_1 )
            // InternalProblem.g:3074:3: rule__PredicateDefinition__BodiesAssignment_5_1
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
    // InternalProblem.g:3082:1: rule__PredicateDefinition__Group_5__2 : rule__PredicateDefinition__Group_5__2__Impl ;
    public final void rule__PredicateDefinition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3086:1: ( rule__PredicateDefinition__Group_5__2__Impl )
            // InternalProblem.g:3087:2: rule__PredicateDefinition__Group_5__2__Impl
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
    // InternalProblem.g:3093:1: rule__PredicateDefinition__Group_5__2__Impl : ( ( rule__PredicateDefinition__Group_5_2__0 )* ) ;
    public final void rule__PredicateDefinition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3097:1: ( ( ( rule__PredicateDefinition__Group_5_2__0 )* ) )
            // InternalProblem.g:3098:1: ( ( rule__PredicateDefinition__Group_5_2__0 )* )
            {
            // InternalProblem.g:3098:1: ( ( rule__PredicateDefinition__Group_5_2__0 )* )
            // InternalProblem.g:3099:2: ( rule__PredicateDefinition__Group_5_2__0 )*
            {
             before(grammarAccess.getPredicateDefinitionAccess().getGroup_5_2()); 
            // InternalProblem.g:3100:2: ( rule__PredicateDefinition__Group_5_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==14) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalProblem.g:3100:3: rule__PredicateDefinition__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__PredicateDefinition__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalProblem.g:3109:1: rule__PredicateDefinition__Group_5_2__0 : rule__PredicateDefinition__Group_5_2__0__Impl rule__PredicateDefinition__Group_5_2__1 ;
    public final void rule__PredicateDefinition__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3113:1: ( rule__PredicateDefinition__Group_5_2__0__Impl rule__PredicateDefinition__Group_5_2__1 )
            // InternalProblem.g:3114:2: rule__PredicateDefinition__Group_5_2__0__Impl rule__PredicateDefinition__Group_5_2__1
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
    // InternalProblem.g:3121:1: rule__PredicateDefinition__Group_5_2__0__Impl : ( ';' ) ;
    public final void rule__PredicateDefinition__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3125:1: ( ( ';' ) )
            // InternalProblem.g:3126:1: ( ';' )
            {
            // InternalProblem.g:3126:1: ( ';' )
            // InternalProblem.g:3127:2: ';'
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
    // InternalProblem.g:3136:1: rule__PredicateDefinition__Group_5_2__1 : rule__PredicateDefinition__Group_5_2__1__Impl ;
    public final void rule__PredicateDefinition__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3140:1: ( rule__PredicateDefinition__Group_5_2__1__Impl )
            // InternalProblem.g:3141:2: rule__PredicateDefinition__Group_5_2__1__Impl
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
    // InternalProblem.g:3147:1: rule__PredicateDefinition__Group_5_2__1__Impl : ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) ) ;
    public final void rule__PredicateDefinition__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3151:1: ( ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) ) )
            // InternalProblem.g:3152:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) )
            {
            // InternalProblem.g:3152:1: ( ( rule__PredicateDefinition__BodiesAssignment_5_2_1 ) )
            // InternalProblem.g:3153:2: ( rule__PredicateDefinition__BodiesAssignment_5_2_1 )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getBodiesAssignment_5_2_1()); 
            // InternalProblem.g:3154:2: ( rule__PredicateDefinition__BodiesAssignment_5_2_1 )
            // InternalProblem.g:3154:3: rule__PredicateDefinition__BodiesAssignment_5_2_1
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
    // InternalProblem.g:3163:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3167:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalProblem.g:3168:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalProblem.g:3175:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__ParameterTypeAssignment_0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3179:1: ( ( ( rule__Parameter__ParameterTypeAssignment_0 )? ) )
            // InternalProblem.g:3180:1: ( ( rule__Parameter__ParameterTypeAssignment_0 )? )
            {
            // InternalProblem.g:3180:1: ( ( rule__Parameter__ParameterTypeAssignment_0 )? )
            // InternalProblem.g:3181:2: ( rule__Parameter__ParameterTypeAssignment_0 )?
            {
             before(grammarAccess.getParameterAccess().getParameterTypeAssignment_0()); 
            // InternalProblem.g:3182:2: ( rule__Parameter__ParameterTypeAssignment_0 )?
            int alt42=2;
            switch ( input.LA(1) ) {
                case RULE_QUOTED_ID:
                    {
                    alt42=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA42_2 = input.LA(2);

                    if ( (LA42_2==RULE_ID||(LA42_2>=19 && LA42_2<=22)||LA42_2==43) ) {
                        alt42=1;
                    }
                    }
                    break;
                case 19:
                    {
                    int LA42_3 = input.LA(2);

                    if ( (LA42_3==RULE_ID||(LA42_3>=19 && LA42_3<=22)||LA42_3==43) ) {
                        alt42=1;
                    }
                    }
                    break;
                case 20:
                    {
                    int LA42_4 = input.LA(2);

                    if ( (LA42_4==RULE_ID||(LA42_4>=19 && LA42_4<=22)||LA42_4==43) ) {
                        alt42=1;
                    }
                    }
                    break;
                case 21:
                    {
                    int LA42_5 = input.LA(2);

                    if ( (LA42_5==RULE_ID||(LA42_5>=19 && LA42_5<=22)||LA42_5==43) ) {
                        alt42=1;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA42_6 = input.LA(2);

                    if ( (LA42_6==RULE_ID||(LA42_6>=19 && LA42_6<=22)||LA42_6==43) ) {
                        alt42=1;
                    }
                    }
                    break;
            }

            switch (alt42) {
                case 1 :
                    // InternalProblem.g:3182:3: rule__Parameter__ParameterTypeAssignment_0
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
    // InternalProblem.g:3190:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3194:1: ( rule__Parameter__Group__1__Impl )
            // InternalProblem.g:3195:2: rule__Parameter__Group__1__Impl
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
    // InternalProblem.g:3201:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3205:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalProblem.g:3206:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalProblem.g:3206:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalProblem.g:3207:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalProblem.g:3208:2: ( rule__Parameter__NameAssignment_1 )
            // InternalProblem.g:3208:3: rule__Parameter__NameAssignment_1
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
    // InternalProblem.g:3217:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3221:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // InternalProblem.g:3222:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
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
    // InternalProblem.g:3229:1: rule__Conjunction__Group__0__Impl : ( ( rule__Conjunction__LiteralsAssignment_0 ) ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3233:1: ( ( ( rule__Conjunction__LiteralsAssignment_0 ) ) )
            // InternalProblem.g:3234:1: ( ( rule__Conjunction__LiteralsAssignment_0 ) )
            {
            // InternalProblem.g:3234:1: ( ( rule__Conjunction__LiteralsAssignment_0 ) )
            // InternalProblem.g:3235:2: ( rule__Conjunction__LiteralsAssignment_0 )
            {
             before(grammarAccess.getConjunctionAccess().getLiteralsAssignment_0()); 
            // InternalProblem.g:3236:2: ( rule__Conjunction__LiteralsAssignment_0 )
            // InternalProblem.g:3236:3: rule__Conjunction__LiteralsAssignment_0
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
    // InternalProblem.g:3244:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3248:1: ( rule__Conjunction__Group__1__Impl )
            // InternalProblem.g:3249:2: rule__Conjunction__Group__1__Impl
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
    // InternalProblem.g:3255:1: rule__Conjunction__Group__1__Impl : ( ( rule__Conjunction__Group_1__0 )* ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3259:1: ( ( ( rule__Conjunction__Group_1__0 )* ) )
            // InternalProblem.g:3260:1: ( ( rule__Conjunction__Group_1__0 )* )
            {
            // InternalProblem.g:3260:1: ( ( rule__Conjunction__Group_1__0 )* )
            // InternalProblem.g:3261:2: ( rule__Conjunction__Group_1__0 )*
            {
             before(grammarAccess.getConjunctionAccess().getGroup_1()); 
            // InternalProblem.g:3262:2: ( rule__Conjunction__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==13) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalProblem.g:3262:3: rule__Conjunction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Conjunction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalProblem.g:3271:1: rule__Conjunction__Group_1__0 : rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 ;
    public final void rule__Conjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3275:1: ( rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 )
            // InternalProblem.g:3276:2: rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1
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
    // InternalProblem.g:3283:1: rule__Conjunction__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Conjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3287:1: ( ( ',' ) )
            // InternalProblem.g:3288:1: ( ',' )
            {
            // InternalProblem.g:3288:1: ( ',' )
            // InternalProblem.g:3289:2: ','
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
    // InternalProblem.g:3298:1: rule__Conjunction__Group_1__1 : rule__Conjunction__Group_1__1__Impl ;
    public final void rule__Conjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3302:1: ( rule__Conjunction__Group_1__1__Impl )
            // InternalProblem.g:3303:2: rule__Conjunction__Group_1__1__Impl
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
    // InternalProblem.g:3309:1: rule__Conjunction__Group_1__1__Impl : ( ( rule__Conjunction__LiteralsAssignment_1_1 ) ) ;
    public final void rule__Conjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3313:1: ( ( ( rule__Conjunction__LiteralsAssignment_1_1 ) ) )
            // InternalProblem.g:3314:1: ( ( rule__Conjunction__LiteralsAssignment_1_1 ) )
            {
            // InternalProblem.g:3314:1: ( ( rule__Conjunction__LiteralsAssignment_1_1 ) )
            // InternalProblem.g:3315:2: ( rule__Conjunction__LiteralsAssignment_1_1 )
            {
             before(grammarAccess.getConjunctionAccess().getLiteralsAssignment_1_1()); 
            // InternalProblem.g:3316:2: ( rule__Conjunction__LiteralsAssignment_1_1 )
            // InternalProblem.g:3316:3: rule__Conjunction__LiteralsAssignment_1_1
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
    // InternalProblem.g:3325:1: rule__NegativeLiteral__Group__0 : rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1 ;
    public final void rule__NegativeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3329:1: ( rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1 )
            // InternalProblem.g:3330:2: rule__NegativeLiteral__Group__0__Impl rule__NegativeLiteral__Group__1
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
    // InternalProblem.g:3337:1: rule__NegativeLiteral__Group__0__Impl : ( '!' ) ;
    public final void rule__NegativeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3341:1: ( ( '!' ) )
            // InternalProblem.g:3342:1: ( '!' )
            {
            // InternalProblem.g:3342:1: ( '!' )
            // InternalProblem.g:3343:2: '!'
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
    // InternalProblem.g:3352:1: rule__NegativeLiteral__Group__1 : rule__NegativeLiteral__Group__1__Impl ;
    public final void rule__NegativeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3356:1: ( rule__NegativeLiteral__Group__1__Impl )
            // InternalProblem.g:3357:2: rule__NegativeLiteral__Group__1__Impl
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
    // InternalProblem.g:3363:1: rule__NegativeLiteral__Group__1__Impl : ( ( rule__NegativeLiteral__AtomAssignment_1 ) ) ;
    public final void rule__NegativeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3367:1: ( ( ( rule__NegativeLiteral__AtomAssignment_1 ) ) )
            // InternalProblem.g:3368:1: ( ( rule__NegativeLiteral__AtomAssignment_1 ) )
            {
            // InternalProblem.g:3368:1: ( ( rule__NegativeLiteral__AtomAssignment_1 ) )
            // InternalProblem.g:3369:2: ( rule__NegativeLiteral__AtomAssignment_1 )
            {
             before(grammarAccess.getNegativeLiteralAccess().getAtomAssignment_1()); 
            // InternalProblem.g:3370:2: ( rule__NegativeLiteral__AtomAssignment_1 )
            // InternalProblem.g:3370:3: rule__NegativeLiteral__AtomAssignment_1
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
    // InternalProblem.g:3379:1: rule__Atom__Group__0 : rule__Atom__Group__0__Impl rule__Atom__Group__1 ;
    public final void rule__Atom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3383:1: ( rule__Atom__Group__0__Impl rule__Atom__Group__1 )
            // InternalProblem.g:3384:2: rule__Atom__Group__0__Impl rule__Atom__Group__1
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
    // InternalProblem.g:3391:1: rule__Atom__Group__0__Impl : ( ( rule__Atom__RelationAssignment_0 ) ) ;
    public final void rule__Atom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3395:1: ( ( ( rule__Atom__RelationAssignment_0 ) ) )
            // InternalProblem.g:3396:1: ( ( rule__Atom__RelationAssignment_0 ) )
            {
            // InternalProblem.g:3396:1: ( ( rule__Atom__RelationAssignment_0 ) )
            // InternalProblem.g:3397:2: ( rule__Atom__RelationAssignment_0 )
            {
             before(grammarAccess.getAtomAccess().getRelationAssignment_0()); 
            // InternalProblem.g:3398:2: ( rule__Atom__RelationAssignment_0 )
            // InternalProblem.g:3398:3: rule__Atom__RelationAssignment_0
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
    // InternalProblem.g:3406:1: rule__Atom__Group__1 : rule__Atom__Group__1__Impl rule__Atom__Group__2 ;
    public final void rule__Atom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3410:1: ( rule__Atom__Group__1__Impl rule__Atom__Group__2 )
            // InternalProblem.g:3411:2: rule__Atom__Group__1__Impl rule__Atom__Group__2
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
    // InternalProblem.g:3418:1: rule__Atom__Group__1__Impl : ( ( rule__Atom__TransitiveClosureAssignment_1 )? ) ;
    public final void rule__Atom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3422:1: ( ( ( rule__Atom__TransitiveClosureAssignment_1 )? ) )
            // InternalProblem.g:3423:1: ( ( rule__Atom__TransitiveClosureAssignment_1 )? )
            {
            // InternalProblem.g:3423:1: ( ( rule__Atom__TransitiveClosureAssignment_1 )? )
            // InternalProblem.g:3424:2: ( rule__Atom__TransitiveClosureAssignment_1 )?
            {
             before(grammarAccess.getAtomAccess().getTransitiveClosureAssignment_1()); 
            // InternalProblem.g:3425:2: ( rule__Atom__TransitiveClosureAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==24) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalProblem.g:3425:3: rule__Atom__TransitiveClosureAssignment_1
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
    // InternalProblem.g:3433:1: rule__Atom__Group__2 : rule__Atom__Group__2__Impl rule__Atom__Group__3 ;
    public final void rule__Atom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3437:1: ( rule__Atom__Group__2__Impl rule__Atom__Group__3 )
            // InternalProblem.g:3438:2: rule__Atom__Group__2__Impl rule__Atom__Group__3
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
    // InternalProblem.g:3445:1: rule__Atom__Group__2__Impl : ( '(' ) ;
    public final void rule__Atom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3449:1: ( ( '(' ) )
            // InternalProblem.g:3450:1: ( '(' )
            {
            // InternalProblem.g:3450:1: ( '(' )
            // InternalProblem.g:3451:2: '('
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
    // InternalProblem.g:3460:1: rule__Atom__Group__3 : rule__Atom__Group__3__Impl rule__Atom__Group__4 ;
    public final void rule__Atom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3464:1: ( rule__Atom__Group__3__Impl rule__Atom__Group__4 )
            // InternalProblem.g:3465:2: rule__Atom__Group__3__Impl rule__Atom__Group__4
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
    // InternalProblem.g:3472:1: rule__Atom__Group__3__Impl : ( ( rule__Atom__Group_3__0 )? ) ;
    public final void rule__Atom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3476:1: ( ( ( rule__Atom__Group_3__0 )? ) )
            // InternalProblem.g:3477:1: ( ( rule__Atom__Group_3__0 )? )
            {
            // InternalProblem.g:3477:1: ( ( rule__Atom__Group_3__0 )? )
            // InternalProblem.g:3478:2: ( rule__Atom__Group_3__0 )?
            {
             before(grammarAccess.getAtomAccess().getGroup_3()); 
            // InternalProblem.g:3479:2: ( rule__Atom__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_INT && LA45_0<=RULE_STRING)||(LA45_0>=19 && LA45_0<=23)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalProblem.g:3479:3: rule__Atom__Group_3__0
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
    // InternalProblem.g:3487:1: rule__Atom__Group__4 : rule__Atom__Group__4__Impl ;
    public final void rule__Atom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3491:1: ( rule__Atom__Group__4__Impl )
            // InternalProblem.g:3492:2: rule__Atom__Group__4__Impl
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
    // InternalProblem.g:3498:1: rule__Atom__Group__4__Impl : ( ')' ) ;
    public final void rule__Atom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3502:1: ( ( ')' ) )
            // InternalProblem.g:3503:1: ( ')' )
            {
            // InternalProblem.g:3503:1: ( ')' )
            // InternalProblem.g:3504:2: ')'
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
    // InternalProblem.g:3514:1: rule__Atom__Group_3__0 : rule__Atom__Group_3__0__Impl rule__Atom__Group_3__1 ;
    public final void rule__Atom__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3518:1: ( rule__Atom__Group_3__0__Impl rule__Atom__Group_3__1 )
            // InternalProblem.g:3519:2: rule__Atom__Group_3__0__Impl rule__Atom__Group_3__1
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
    // InternalProblem.g:3526:1: rule__Atom__Group_3__0__Impl : ( ( rule__Atom__ArgumentsAssignment_3_0 ) ) ;
    public final void rule__Atom__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3530:1: ( ( ( rule__Atom__ArgumentsAssignment_3_0 ) ) )
            // InternalProblem.g:3531:1: ( ( rule__Atom__ArgumentsAssignment_3_0 ) )
            {
            // InternalProblem.g:3531:1: ( ( rule__Atom__ArgumentsAssignment_3_0 ) )
            // InternalProblem.g:3532:2: ( rule__Atom__ArgumentsAssignment_3_0 )
            {
             before(grammarAccess.getAtomAccess().getArgumentsAssignment_3_0()); 
            // InternalProblem.g:3533:2: ( rule__Atom__ArgumentsAssignment_3_0 )
            // InternalProblem.g:3533:3: rule__Atom__ArgumentsAssignment_3_0
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
    // InternalProblem.g:3541:1: rule__Atom__Group_3__1 : rule__Atom__Group_3__1__Impl ;
    public final void rule__Atom__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3545:1: ( rule__Atom__Group_3__1__Impl )
            // InternalProblem.g:3546:2: rule__Atom__Group_3__1__Impl
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
    // InternalProblem.g:3552:1: rule__Atom__Group_3__1__Impl : ( ( rule__Atom__Group_3_1__0 )* ) ;
    public final void rule__Atom__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3556:1: ( ( ( rule__Atom__Group_3_1__0 )* ) )
            // InternalProblem.g:3557:1: ( ( rule__Atom__Group_3_1__0 )* )
            {
            // InternalProblem.g:3557:1: ( ( rule__Atom__Group_3_1__0 )* )
            // InternalProblem.g:3558:2: ( rule__Atom__Group_3_1__0 )*
            {
             before(grammarAccess.getAtomAccess().getGroup_3_1()); 
            // InternalProblem.g:3559:2: ( rule__Atom__Group_3_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==13) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalProblem.g:3559:3: rule__Atom__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Atom__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalProblem.g:3568:1: rule__Atom__Group_3_1__0 : rule__Atom__Group_3_1__0__Impl rule__Atom__Group_3_1__1 ;
    public final void rule__Atom__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3572:1: ( rule__Atom__Group_3_1__0__Impl rule__Atom__Group_3_1__1 )
            // InternalProblem.g:3573:2: rule__Atom__Group_3_1__0__Impl rule__Atom__Group_3_1__1
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
    // InternalProblem.g:3580:1: rule__Atom__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Atom__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3584:1: ( ( ',' ) )
            // InternalProblem.g:3585:1: ( ',' )
            {
            // InternalProblem.g:3585:1: ( ',' )
            // InternalProblem.g:3586:2: ','
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
    // InternalProblem.g:3595:1: rule__Atom__Group_3_1__1 : rule__Atom__Group_3_1__1__Impl ;
    public final void rule__Atom__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3599:1: ( rule__Atom__Group_3_1__1__Impl )
            // InternalProblem.g:3600:2: rule__Atom__Group_3_1__1__Impl
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
    // InternalProblem.g:3606:1: rule__Atom__Group_3_1__1__Impl : ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) ) ;
    public final void rule__Atom__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3610:1: ( ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) ) )
            // InternalProblem.g:3611:1: ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) )
            {
            // InternalProblem.g:3611:1: ( ( rule__Atom__ArgumentsAssignment_3_1_1 ) )
            // InternalProblem.g:3612:2: ( rule__Atom__ArgumentsAssignment_3_1_1 )
            {
             before(grammarAccess.getAtomAccess().getArgumentsAssignment_3_1_1()); 
            // InternalProblem.g:3613:2: ( rule__Atom__ArgumentsAssignment_3_1_1 )
            // InternalProblem.g:3613:3: rule__Atom__ArgumentsAssignment_3_1_1
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
    // InternalProblem.g:3622:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3626:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // InternalProblem.g:3627:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
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
    // InternalProblem.g:3634:1: rule__Assertion__Group__0__Impl : ( ( rule__Assertion__Alternatives_0 ) ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3638:1: ( ( ( rule__Assertion__Alternatives_0 ) ) )
            // InternalProblem.g:3639:1: ( ( rule__Assertion__Alternatives_0 ) )
            {
            // InternalProblem.g:3639:1: ( ( rule__Assertion__Alternatives_0 ) )
            // InternalProblem.g:3640:2: ( rule__Assertion__Alternatives_0 )
            {
             before(grammarAccess.getAssertionAccess().getAlternatives_0()); 
            // InternalProblem.g:3641:2: ( rule__Assertion__Alternatives_0 )
            // InternalProblem.g:3641:3: rule__Assertion__Alternatives_0
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
    // InternalProblem.g:3649:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3653:1: ( rule__Assertion__Group__1__Impl )
            // InternalProblem.g:3654:2: rule__Assertion__Group__1__Impl
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
    // InternalProblem.g:3660:1: rule__Assertion__Group__1__Impl : ( '.' ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3664:1: ( ( '.' ) )
            // InternalProblem.g:3665:1: ( '.' )
            {
            // InternalProblem.g:3665:1: ( '.' )
            // InternalProblem.g:3666:2: '.'
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
    // InternalProblem.g:3676:1: rule__Assertion__Group_0_0__0 : rule__Assertion__Group_0_0__0__Impl rule__Assertion__Group_0_0__1 ;
    public final void rule__Assertion__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3680:1: ( rule__Assertion__Group_0_0__0__Impl rule__Assertion__Group_0_0__1 )
            // InternalProblem.g:3681:2: rule__Assertion__Group_0_0__0__Impl rule__Assertion__Group_0_0__1
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
    // InternalProblem.g:3688:1: rule__Assertion__Group_0_0__0__Impl : ( ( rule__Assertion__RelationAssignment_0_0_0 ) ) ;
    public final void rule__Assertion__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3692:1: ( ( ( rule__Assertion__RelationAssignment_0_0_0 ) ) )
            // InternalProblem.g:3693:1: ( ( rule__Assertion__RelationAssignment_0_0_0 ) )
            {
            // InternalProblem.g:3693:1: ( ( rule__Assertion__RelationAssignment_0_0_0 ) )
            // InternalProblem.g:3694:2: ( rule__Assertion__RelationAssignment_0_0_0 )
            {
             before(grammarAccess.getAssertionAccess().getRelationAssignment_0_0_0()); 
            // InternalProblem.g:3695:2: ( rule__Assertion__RelationAssignment_0_0_0 )
            // InternalProblem.g:3695:3: rule__Assertion__RelationAssignment_0_0_0
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
    // InternalProblem.g:3703:1: rule__Assertion__Group_0_0__1 : rule__Assertion__Group_0_0__1__Impl rule__Assertion__Group_0_0__2 ;
    public final void rule__Assertion__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3707:1: ( rule__Assertion__Group_0_0__1__Impl rule__Assertion__Group_0_0__2 )
            // InternalProblem.g:3708:2: rule__Assertion__Group_0_0__1__Impl rule__Assertion__Group_0_0__2
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
    // InternalProblem.g:3715:1: rule__Assertion__Group_0_0__1__Impl : ( '(' ) ;
    public final void rule__Assertion__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3719:1: ( ( '(' ) )
            // InternalProblem.g:3720:1: ( '(' )
            {
            // InternalProblem.g:3720:1: ( '(' )
            // InternalProblem.g:3721:2: '('
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
    // InternalProblem.g:3730:1: rule__Assertion__Group_0_0__2 : rule__Assertion__Group_0_0__2__Impl rule__Assertion__Group_0_0__3 ;
    public final void rule__Assertion__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3734:1: ( rule__Assertion__Group_0_0__2__Impl rule__Assertion__Group_0_0__3 )
            // InternalProblem.g:3735:2: rule__Assertion__Group_0_0__2__Impl rule__Assertion__Group_0_0__3
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
    // InternalProblem.g:3742:1: rule__Assertion__Group_0_0__2__Impl : ( ( rule__Assertion__Group_0_0_2__0 )? ) ;
    public final void rule__Assertion__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3746:1: ( ( ( rule__Assertion__Group_0_0_2__0 )? ) )
            // InternalProblem.g:3747:1: ( ( rule__Assertion__Group_0_0_2__0 )? )
            {
            // InternalProblem.g:3747:1: ( ( rule__Assertion__Group_0_0_2__0 )? )
            // InternalProblem.g:3748:2: ( rule__Assertion__Group_0_0_2__0 )?
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_0_2()); 
            // InternalProblem.g:3749:2: ( rule__Assertion__Group_0_0_2__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_INT && LA47_0<=RULE_STRING)||(LA47_0>=19 && LA47_0<=23)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalProblem.g:3749:3: rule__Assertion__Group_0_0_2__0
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
    // InternalProblem.g:3757:1: rule__Assertion__Group_0_0__3 : rule__Assertion__Group_0_0__3__Impl rule__Assertion__Group_0_0__4 ;
    public final void rule__Assertion__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3761:1: ( rule__Assertion__Group_0_0__3__Impl rule__Assertion__Group_0_0__4 )
            // InternalProblem.g:3762:2: rule__Assertion__Group_0_0__3__Impl rule__Assertion__Group_0_0__4
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
    // InternalProblem.g:3769:1: rule__Assertion__Group_0_0__3__Impl : ( ')' ) ;
    public final void rule__Assertion__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3773:1: ( ( ')' ) )
            // InternalProblem.g:3774:1: ( ')' )
            {
            // InternalProblem.g:3774:1: ( ')' )
            // InternalProblem.g:3775:2: ')'
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
    // InternalProblem.g:3784:1: rule__Assertion__Group_0_0__4 : rule__Assertion__Group_0_0__4__Impl rule__Assertion__Group_0_0__5 ;
    public final void rule__Assertion__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3788:1: ( rule__Assertion__Group_0_0__4__Impl rule__Assertion__Group_0_0__5 )
            // InternalProblem.g:3789:2: rule__Assertion__Group_0_0__4__Impl rule__Assertion__Group_0_0__5
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
    // InternalProblem.g:3796:1: rule__Assertion__Group_0_0__4__Impl : ( ':' ) ;
    public final void rule__Assertion__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3800:1: ( ( ':' ) )
            // InternalProblem.g:3801:1: ( ':' )
            {
            // InternalProblem.g:3801:1: ( ':' )
            // InternalProblem.g:3802:2: ':'
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
    // InternalProblem.g:3811:1: rule__Assertion__Group_0_0__5 : rule__Assertion__Group_0_0__5__Impl ;
    public final void rule__Assertion__Group_0_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3815:1: ( rule__Assertion__Group_0_0__5__Impl )
            // InternalProblem.g:3816:2: rule__Assertion__Group_0_0__5__Impl
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
    // InternalProblem.g:3822:1: rule__Assertion__Group_0_0__5__Impl : ( ( rule__Assertion__ValueAssignment_0_0_5 ) ) ;
    public final void rule__Assertion__Group_0_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3826:1: ( ( ( rule__Assertion__ValueAssignment_0_0_5 ) ) )
            // InternalProblem.g:3827:1: ( ( rule__Assertion__ValueAssignment_0_0_5 ) )
            {
            // InternalProblem.g:3827:1: ( ( rule__Assertion__ValueAssignment_0_0_5 ) )
            // InternalProblem.g:3828:2: ( rule__Assertion__ValueAssignment_0_0_5 )
            {
             before(grammarAccess.getAssertionAccess().getValueAssignment_0_0_5()); 
            // InternalProblem.g:3829:2: ( rule__Assertion__ValueAssignment_0_0_5 )
            // InternalProblem.g:3829:3: rule__Assertion__ValueAssignment_0_0_5
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
    // InternalProblem.g:3838:1: rule__Assertion__Group_0_0_2__0 : rule__Assertion__Group_0_0_2__0__Impl rule__Assertion__Group_0_0_2__1 ;
    public final void rule__Assertion__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3842:1: ( rule__Assertion__Group_0_0_2__0__Impl rule__Assertion__Group_0_0_2__1 )
            // InternalProblem.g:3843:2: rule__Assertion__Group_0_0_2__0__Impl rule__Assertion__Group_0_0_2__1
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
    // InternalProblem.g:3850:1: rule__Assertion__Group_0_0_2__0__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) ) ;
    public final void rule__Assertion__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3854:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) ) )
            // InternalProblem.g:3855:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) )
            {
            // InternalProblem.g:3855:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_0 ) )
            // InternalProblem.g:3856:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_0 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_0_2_0()); 
            // InternalProblem.g:3857:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_0 )
            // InternalProblem.g:3857:3: rule__Assertion__ArgumentsAssignment_0_0_2_0
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
    // InternalProblem.g:3865:1: rule__Assertion__Group_0_0_2__1 : rule__Assertion__Group_0_0_2__1__Impl ;
    public final void rule__Assertion__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3869:1: ( rule__Assertion__Group_0_0_2__1__Impl )
            // InternalProblem.g:3870:2: rule__Assertion__Group_0_0_2__1__Impl
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
    // InternalProblem.g:3876:1: rule__Assertion__Group_0_0_2__1__Impl : ( ( rule__Assertion__Group_0_0_2_1__0 )* ) ;
    public final void rule__Assertion__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3880:1: ( ( ( rule__Assertion__Group_0_0_2_1__0 )* ) )
            // InternalProblem.g:3881:1: ( ( rule__Assertion__Group_0_0_2_1__0 )* )
            {
            // InternalProblem.g:3881:1: ( ( rule__Assertion__Group_0_0_2_1__0 )* )
            // InternalProblem.g:3882:2: ( rule__Assertion__Group_0_0_2_1__0 )*
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_0_2_1()); 
            // InternalProblem.g:3883:2: ( rule__Assertion__Group_0_0_2_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==13) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalProblem.g:3883:3: rule__Assertion__Group_0_0_2_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Assertion__Group_0_0_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalProblem.g:3892:1: rule__Assertion__Group_0_0_2_1__0 : rule__Assertion__Group_0_0_2_1__0__Impl rule__Assertion__Group_0_0_2_1__1 ;
    public final void rule__Assertion__Group_0_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3896:1: ( rule__Assertion__Group_0_0_2_1__0__Impl rule__Assertion__Group_0_0_2_1__1 )
            // InternalProblem.g:3897:2: rule__Assertion__Group_0_0_2_1__0__Impl rule__Assertion__Group_0_0_2_1__1
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
    // InternalProblem.g:3904:1: rule__Assertion__Group_0_0_2_1__0__Impl : ( ',' ) ;
    public final void rule__Assertion__Group_0_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3908:1: ( ( ',' ) )
            // InternalProblem.g:3909:1: ( ',' )
            {
            // InternalProblem.g:3909:1: ( ',' )
            // InternalProblem.g:3910:2: ','
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
    // InternalProblem.g:3919:1: rule__Assertion__Group_0_0_2_1__1 : rule__Assertion__Group_0_0_2_1__1__Impl ;
    public final void rule__Assertion__Group_0_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3923:1: ( rule__Assertion__Group_0_0_2_1__1__Impl )
            // InternalProblem.g:3924:2: rule__Assertion__Group_0_0_2_1__1__Impl
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
    // InternalProblem.g:3930:1: rule__Assertion__Group_0_0_2_1__1__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) ) ;
    public final void rule__Assertion__Group_0_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3934:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) ) )
            // InternalProblem.g:3935:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) )
            {
            // InternalProblem.g:3935:1: ( ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 ) )
            // InternalProblem.g:3936:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_0_2_1_1()); 
            // InternalProblem.g:3937:2: ( rule__Assertion__ArgumentsAssignment_0_0_2_1_1 )
            // InternalProblem.g:3937:3: rule__Assertion__ArgumentsAssignment_0_0_2_1_1
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
    // InternalProblem.g:3946:1: rule__Assertion__Group_0_1__0 : rule__Assertion__Group_0_1__0__Impl rule__Assertion__Group_0_1__1 ;
    public final void rule__Assertion__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3950:1: ( rule__Assertion__Group_0_1__0__Impl rule__Assertion__Group_0_1__1 )
            // InternalProblem.g:3951:2: rule__Assertion__Group_0_1__0__Impl rule__Assertion__Group_0_1__1
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
    // InternalProblem.g:3958:1: rule__Assertion__Group_0_1__0__Impl : ( ( rule__Assertion__ValueAssignment_0_1_0 )? ) ;
    public final void rule__Assertion__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3962:1: ( ( ( rule__Assertion__ValueAssignment_0_1_0 )? ) )
            // InternalProblem.g:3963:1: ( ( rule__Assertion__ValueAssignment_0_1_0 )? )
            {
            // InternalProblem.g:3963:1: ( ( rule__Assertion__ValueAssignment_0_1_0 )? )
            // InternalProblem.g:3964:2: ( rule__Assertion__ValueAssignment_0_1_0 )?
            {
             before(grammarAccess.getAssertionAccess().getValueAssignment_0_1_0()); 
            // InternalProblem.g:3965:2: ( rule__Assertion__ValueAssignment_0_1_0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=26 && LA49_0<=27)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalProblem.g:3965:3: rule__Assertion__ValueAssignment_0_1_0
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
    // InternalProblem.g:3973:1: rule__Assertion__Group_0_1__1 : rule__Assertion__Group_0_1__1__Impl rule__Assertion__Group_0_1__2 ;
    public final void rule__Assertion__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3977:1: ( rule__Assertion__Group_0_1__1__Impl rule__Assertion__Group_0_1__2 )
            // InternalProblem.g:3978:2: rule__Assertion__Group_0_1__1__Impl rule__Assertion__Group_0_1__2
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
    // InternalProblem.g:3985:1: rule__Assertion__Group_0_1__1__Impl : ( ( rule__Assertion__RelationAssignment_0_1_1 ) ) ;
    public final void rule__Assertion__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:3989:1: ( ( ( rule__Assertion__RelationAssignment_0_1_1 ) ) )
            // InternalProblem.g:3990:1: ( ( rule__Assertion__RelationAssignment_0_1_1 ) )
            {
            // InternalProblem.g:3990:1: ( ( rule__Assertion__RelationAssignment_0_1_1 ) )
            // InternalProblem.g:3991:2: ( rule__Assertion__RelationAssignment_0_1_1 )
            {
             before(grammarAccess.getAssertionAccess().getRelationAssignment_0_1_1()); 
            // InternalProblem.g:3992:2: ( rule__Assertion__RelationAssignment_0_1_1 )
            // InternalProblem.g:3992:3: rule__Assertion__RelationAssignment_0_1_1
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
    // InternalProblem.g:4000:1: rule__Assertion__Group_0_1__2 : rule__Assertion__Group_0_1__2__Impl rule__Assertion__Group_0_1__3 ;
    public final void rule__Assertion__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4004:1: ( rule__Assertion__Group_0_1__2__Impl rule__Assertion__Group_0_1__3 )
            // InternalProblem.g:4005:2: rule__Assertion__Group_0_1__2__Impl rule__Assertion__Group_0_1__3
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
    // InternalProblem.g:4012:1: rule__Assertion__Group_0_1__2__Impl : ( '(' ) ;
    public final void rule__Assertion__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4016:1: ( ( '(' ) )
            // InternalProblem.g:4017:1: ( '(' )
            {
            // InternalProblem.g:4017:1: ( '(' )
            // InternalProblem.g:4018:2: '('
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
    // InternalProblem.g:4027:1: rule__Assertion__Group_0_1__3 : rule__Assertion__Group_0_1__3__Impl rule__Assertion__Group_0_1__4 ;
    public final void rule__Assertion__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4031:1: ( rule__Assertion__Group_0_1__3__Impl rule__Assertion__Group_0_1__4 )
            // InternalProblem.g:4032:2: rule__Assertion__Group_0_1__3__Impl rule__Assertion__Group_0_1__4
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
    // InternalProblem.g:4039:1: rule__Assertion__Group_0_1__3__Impl : ( ( rule__Assertion__Group_0_1_3__0 )? ) ;
    public final void rule__Assertion__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4043:1: ( ( ( rule__Assertion__Group_0_1_3__0 )? ) )
            // InternalProblem.g:4044:1: ( ( rule__Assertion__Group_0_1_3__0 )? )
            {
            // InternalProblem.g:4044:1: ( ( rule__Assertion__Group_0_1_3__0 )? )
            // InternalProblem.g:4045:2: ( rule__Assertion__Group_0_1_3__0 )?
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_1_3()); 
            // InternalProblem.g:4046:2: ( rule__Assertion__Group_0_1_3__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_INT && LA50_0<=RULE_STRING)||(LA50_0>=19 && LA50_0<=23)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalProblem.g:4046:3: rule__Assertion__Group_0_1_3__0
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
    // InternalProblem.g:4054:1: rule__Assertion__Group_0_1__4 : rule__Assertion__Group_0_1__4__Impl ;
    public final void rule__Assertion__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4058:1: ( rule__Assertion__Group_0_1__4__Impl )
            // InternalProblem.g:4059:2: rule__Assertion__Group_0_1__4__Impl
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
    // InternalProblem.g:4065:1: rule__Assertion__Group_0_1__4__Impl : ( ')' ) ;
    public final void rule__Assertion__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4069:1: ( ( ')' ) )
            // InternalProblem.g:4070:1: ( ')' )
            {
            // InternalProblem.g:4070:1: ( ')' )
            // InternalProblem.g:4071:2: ')'
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
    // InternalProblem.g:4081:1: rule__Assertion__Group_0_1_3__0 : rule__Assertion__Group_0_1_3__0__Impl rule__Assertion__Group_0_1_3__1 ;
    public final void rule__Assertion__Group_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4085:1: ( rule__Assertion__Group_0_1_3__0__Impl rule__Assertion__Group_0_1_3__1 )
            // InternalProblem.g:4086:2: rule__Assertion__Group_0_1_3__0__Impl rule__Assertion__Group_0_1_3__1
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
    // InternalProblem.g:4093:1: rule__Assertion__Group_0_1_3__0__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) ) ;
    public final void rule__Assertion__Group_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4097:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) ) )
            // InternalProblem.g:4098:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) )
            {
            // InternalProblem.g:4098:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_0 ) )
            // InternalProblem.g:4099:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_0 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_1_3_0()); 
            // InternalProblem.g:4100:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_0 )
            // InternalProblem.g:4100:3: rule__Assertion__ArgumentsAssignment_0_1_3_0
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
    // InternalProblem.g:4108:1: rule__Assertion__Group_0_1_3__1 : rule__Assertion__Group_0_1_3__1__Impl ;
    public final void rule__Assertion__Group_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4112:1: ( rule__Assertion__Group_0_1_3__1__Impl )
            // InternalProblem.g:4113:2: rule__Assertion__Group_0_1_3__1__Impl
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
    // InternalProblem.g:4119:1: rule__Assertion__Group_0_1_3__1__Impl : ( ( rule__Assertion__Group_0_1_3_1__0 )* ) ;
    public final void rule__Assertion__Group_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4123:1: ( ( ( rule__Assertion__Group_0_1_3_1__0 )* ) )
            // InternalProblem.g:4124:1: ( ( rule__Assertion__Group_0_1_3_1__0 )* )
            {
            // InternalProblem.g:4124:1: ( ( rule__Assertion__Group_0_1_3_1__0 )* )
            // InternalProblem.g:4125:2: ( rule__Assertion__Group_0_1_3_1__0 )*
            {
             before(grammarAccess.getAssertionAccess().getGroup_0_1_3_1()); 
            // InternalProblem.g:4126:2: ( rule__Assertion__Group_0_1_3_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==13) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalProblem.g:4126:3: rule__Assertion__Group_0_1_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Assertion__Group_0_1_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalProblem.g:4135:1: rule__Assertion__Group_0_1_3_1__0 : rule__Assertion__Group_0_1_3_1__0__Impl rule__Assertion__Group_0_1_3_1__1 ;
    public final void rule__Assertion__Group_0_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4139:1: ( rule__Assertion__Group_0_1_3_1__0__Impl rule__Assertion__Group_0_1_3_1__1 )
            // InternalProblem.g:4140:2: rule__Assertion__Group_0_1_3_1__0__Impl rule__Assertion__Group_0_1_3_1__1
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
    // InternalProblem.g:4147:1: rule__Assertion__Group_0_1_3_1__0__Impl : ( ',' ) ;
    public final void rule__Assertion__Group_0_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4151:1: ( ( ',' ) )
            // InternalProblem.g:4152:1: ( ',' )
            {
            // InternalProblem.g:4152:1: ( ',' )
            // InternalProblem.g:4153:2: ','
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
    // InternalProblem.g:4162:1: rule__Assertion__Group_0_1_3_1__1 : rule__Assertion__Group_0_1_3_1__1__Impl ;
    public final void rule__Assertion__Group_0_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4166:1: ( rule__Assertion__Group_0_1_3_1__1__Impl )
            // InternalProblem.g:4167:2: rule__Assertion__Group_0_1_3_1__1__Impl
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
    // InternalProblem.g:4173:1: rule__Assertion__Group_0_1_3_1__1__Impl : ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) ) ;
    public final void rule__Assertion__Group_0_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4177:1: ( ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) ) )
            // InternalProblem.g:4178:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) )
            {
            // InternalProblem.g:4178:1: ( ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 ) )
            // InternalProblem.g:4179:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 )
            {
             before(grammarAccess.getAssertionAccess().getArgumentsAssignment_0_1_3_1_1()); 
            // InternalProblem.g:4180:2: ( rule__Assertion__ArgumentsAssignment_0_1_3_1_1 )
            // InternalProblem.g:4180:3: rule__Assertion__ArgumentsAssignment_0_1_3_1_1
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
    // InternalProblem.g:4189:1: rule__NodeValueAssertion__Group__0 : rule__NodeValueAssertion__Group__0__Impl rule__NodeValueAssertion__Group__1 ;
    public final void rule__NodeValueAssertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4193:1: ( rule__NodeValueAssertion__Group__0__Impl rule__NodeValueAssertion__Group__1 )
            // InternalProblem.g:4194:2: rule__NodeValueAssertion__Group__0__Impl rule__NodeValueAssertion__Group__1
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
    // InternalProblem.g:4201:1: rule__NodeValueAssertion__Group__0__Impl : ( ( rule__NodeValueAssertion__NodeAssignment_0 ) ) ;
    public final void rule__NodeValueAssertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4205:1: ( ( ( rule__NodeValueAssertion__NodeAssignment_0 ) ) )
            // InternalProblem.g:4206:1: ( ( rule__NodeValueAssertion__NodeAssignment_0 ) )
            {
            // InternalProblem.g:4206:1: ( ( rule__NodeValueAssertion__NodeAssignment_0 ) )
            // InternalProblem.g:4207:2: ( rule__NodeValueAssertion__NodeAssignment_0 )
            {
             before(grammarAccess.getNodeValueAssertionAccess().getNodeAssignment_0()); 
            // InternalProblem.g:4208:2: ( rule__NodeValueAssertion__NodeAssignment_0 )
            // InternalProblem.g:4208:3: rule__NodeValueAssertion__NodeAssignment_0
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
    // InternalProblem.g:4216:1: rule__NodeValueAssertion__Group__1 : rule__NodeValueAssertion__Group__1__Impl rule__NodeValueAssertion__Group__2 ;
    public final void rule__NodeValueAssertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4220:1: ( rule__NodeValueAssertion__Group__1__Impl rule__NodeValueAssertion__Group__2 )
            // InternalProblem.g:4221:2: rule__NodeValueAssertion__Group__1__Impl rule__NodeValueAssertion__Group__2
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
    // InternalProblem.g:4228:1: rule__NodeValueAssertion__Group__1__Impl : ( ':' ) ;
    public final void rule__NodeValueAssertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4232:1: ( ( ':' ) )
            // InternalProblem.g:4233:1: ( ':' )
            {
            // InternalProblem.g:4233:1: ( ':' )
            // InternalProblem.g:4234:2: ':'
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
    // InternalProblem.g:4243:1: rule__NodeValueAssertion__Group__2 : rule__NodeValueAssertion__Group__2__Impl rule__NodeValueAssertion__Group__3 ;
    public final void rule__NodeValueAssertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4247:1: ( rule__NodeValueAssertion__Group__2__Impl rule__NodeValueAssertion__Group__3 )
            // InternalProblem.g:4248:2: rule__NodeValueAssertion__Group__2__Impl rule__NodeValueAssertion__Group__3
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
    // InternalProblem.g:4255:1: rule__NodeValueAssertion__Group__2__Impl : ( ( rule__NodeValueAssertion__ValueAssignment_2 ) ) ;
    public final void rule__NodeValueAssertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4259:1: ( ( ( rule__NodeValueAssertion__ValueAssignment_2 ) ) )
            // InternalProblem.g:4260:1: ( ( rule__NodeValueAssertion__ValueAssignment_2 ) )
            {
            // InternalProblem.g:4260:1: ( ( rule__NodeValueAssertion__ValueAssignment_2 ) )
            // InternalProblem.g:4261:2: ( rule__NodeValueAssertion__ValueAssignment_2 )
            {
             before(grammarAccess.getNodeValueAssertionAccess().getValueAssignment_2()); 
            // InternalProblem.g:4262:2: ( rule__NodeValueAssertion__ValueAssignment_2 )
            // InternalProblem.g:4262:3: rule__NodeValueAssertion__ValueAssignment_2
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
    // InternalProblem.g:4270:1: rule__NodeValueAssertion__Group__3 : rule__NodeValueAssertion__Group__3__Impl ;
    public final void rule__NodeValueAssertion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4274:1: ( rule__NodeValueAssertion__Group__3__Impl )
            // InternalProblem.g:4275:2: rule__NodeValueAssertion__Group__3__Impl
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
    // InternalProblem.g:4281:1: rule__NodeValueAssertion__Group__3__Impl : ( '.' ) ;
    public final void rule__NodeValueAssertion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4285:1: ( ( '.' ) )
            // InternalProblem.g:4286:1: ( '.' )
            {
            // InternalProblem.g:4286:1: ( '.' )
            // InternalProblem.g:4287:2: '.'
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
    // InternalProblem.g:4297:1: rule__ScopeDeclaration__Group__0 : rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1 ;
    public final void rule__ScopeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4301:1: ( rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1 )
            // InternalProblem.g:4302:2: rule__ScopeDeclaration__Group__0__Impl rule__ScopeDeclaration__Group__1
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
    // InternalProblem.g:4309:1: rule__ScopeDeclaration__Group__0__Impl : ( 'scope' ) ;
    public final void rule__ScopeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4313:1: ( ( 'scope' ) )
            // InternalProblem.g:4314:1: ( 'scope' )
            {
            // InternalProblem.g:4314:1: ( 'scope' )
            // InternalProblem.g:4315:2: 'scope'
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
    // InternalProblem.g:4324:1: rule__ScopeDeclaration__Group__1 : rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2 ;
    public final void rule__ScopeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4328:1: ( rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2 )
            // InternalProblem.g:4329:2: rule__ScopeDeclaration__Group__1__Impl rule__ScopeDeclaration__Group__2
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
    // InternalProblem.g:4336:1: rule__ScopeDeclaration__Group__1__Impl : ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) ) ;
    public final void rule__ScopeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4340:1: ( ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) ) )
            // InternalProblem.g:4341:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) )
            {
            // InternalProblem.g:4341:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_1 ) )
            // InternalProblem.g:4342:2: ( rule__ScopeDeclaration__TypeScopesAssignment_1 )
            {
             before(grammarAccess.getScopeDeclarationAccess().getTypeScopesAssignment_1()); 
            // InternalProblem.g:4343:2: ( rule__ScopeDeclaration__TypeScopesAssignment_1 )
            // InternalProblem.g:4343:3: rule__ScopeDeclaration__TypeScopesAssignment_1
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
    // InternalProblem.g:4351:1: rule__ScopeDeclaration__Group__2 : rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3 ;
    public final void rule__ScopeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4355:1: ( rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3 )
            // InternalProblem.g:4356:2: rule__ScopeDeclaration__Group__2__Impl rule__ScopeDeclaration__Group__3
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
    // InternalProblem.g:4363:1: rule__ScopeDeclaration__Group__2__Impl : ( ( rule__ScopeDeclaration__Group_2__0 )* ) ;
    public final void rule__ScopeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4367:1: ( ( ( rule__ScopeDeclaration__Group_2__0 )* ) )
            // InternalProblem.g:4368:1: ( ( rule__ScopeDeclaration__Group_2__0 )* )
            {
            // InternalProblem.g:4368:1: ( ( rule__ScopeDeclaration__Group_2__0 )* )
            // InternalProblem.g:4369:2: ( rule__ScopeDeclaration__Group_2__0 )*
            {
             before(grammarAccess.getScopeDeclarationAccess().getGroup_2()); 
            // InternalProblem.g:4370:2: ( rule__ScopeDeclaration__Group_2__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==13) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalProblem.g:4370:3: rule__ScopeDeclaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ScopeDeclaration__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalProblem.g:4378:1: rule__ScopeDeclaration__Group__3 : rule__ScopeDeclaration__Group__3__Impl ;
    public final void rule__ScopeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4382:1: ( rule__ScopeDeclaration__Group__3__Impl )
            // InternalProblem.g:4383:2: rule__ScopeDeclaration__Group__3__Impl
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
    // InternalProblem.g:4389:1: rule__ScopeDeclaration__Group__3__Impl : ( '.' ) ;
    public final void rule__ScopeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4393:1: ( ( '.' ) )
            // InternalProblem.g:4394:1: ( '.' )
            {
            // InternalProblem.g:4394:1: ( '.' )
            // InternalProblem.g:4395:2: '.'
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
    // InternalProblem.g:4405:1: rule__ScopeDeclaration__Group_2__0 : rule__ScopeDeclaration__Group_2__0__Impl rule__ScopeDeclaration__Group_2__1 ;
    public final void rule__ScopeDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4409:1: ( rule__ScopeDeclaration__Group_2__0__Impl rule__ScopeDeclaration__Group_2__1 )
            // InternalProblem.g:4410:2: rule__ScopeDeclaration__Group_2__0__Impl rule__ScopeDeclaration__Group_2__1
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
    // InternalProblem.g:4417:1: rule__ScopeDeclaration__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ScopeDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4421:1: ( ( ',' ) )
            // InternalProblem.g:4422:1: ( ',' )
            {
            // InternalProblem.g:4422:1: ( ',' )
            // InternalProblem.g:4423:2: ','
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
    // InternalProblem.g:4432:1: rule__ScopeDeclaration__Group_2__1 : rule__ScopeDeclaration__Group_2__1__Impl ;
    public final void rule__ScopeDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4436:1: ( rule__ScopeDeclaration__Group_2__1__Impl )
            // InternalProblem.g:4437:2: rule__ScopeDeclaration__Group_2__1__Impl
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
    // InternalProblem.g:4443:1: rule__ScopeDeclaration__Group_2__1__Impl : ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) ) ;
    public final void rule__ScopeDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4447:1: ( ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) ) )
            // InternalProblem.g:4448:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) )
            {
            // InternalProblem.g:4448:1: ( ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 ) )
            // InternalProblem.g:4449:2: ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 )
            {
             before(grammarAccess.getScopeDeclarationAccess().getTypeScopesAssignment_2_1()); 
            // InternalProblem.g:4450:2: ( rule__ScopeDeclaration__TypeScopesAssignment_2_1 )
            // InternalProblem.g:4450:3: rule__ScopeDeclaration__TypeScopesAssignment_2_1
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
    // InternalProblem.g:4459:1: rule__TypeScope__Group__0 : rule__TypeScope__Group__0__Impl rule__TypeScope__Group__1 ;
    public final void rule__TypeScope__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4463:1: ( rule__TypeScope__Group__0__Impl rule__TypeScope__Group__1 )
            // InternalProblem.g:4464:2: rule__TypeScope__Group__0__Impl rule__TypeScope__Group__1
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
    // InternalProblem.g:4471:1: rule__TypeScope__Group__0__Impl : ( ( rule__TypeScope__TargetTypeAssignment_0 ) ) ;
    public final void rule__TypeScope__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4475:1: ( ( ( rule__TypeScope__TargetTypeAssignment_0 ) ) )
            // InternalProblem.g:4476:1: ( ( rule__TypeScope__TargetTypeAssignment_0 ) )
            {
            // InternalProblem.g:4476:1: ( ( rule__TypeScope__TargetTypeAssignment_0 ) )
            // InternalProblem.g:4477:2: ( rule__TypeScope__TargetTypeAssignment_0 )
            {
             before(grammarAccess.getTypeScopeAccess().getTargetTypeAssignment_0()); 
            // InternalProblem.g:4478:2: ( rule__TypeScope__TargetTypeAssignment_0 )
            // InternalProblem.g:4478:3: rule__TypeScope__TargetTypeAssignment_0
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
    // InternalProblem.g:4486:1: rule__TypeScope__Group__1 : rule__TypeScope__Group__1__Impl rule__TypeScope__Group__2 ;
    public final void rule__TypeScope__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4490:1: ( rule__TypeScope__Group__1__Impl rule__TypeScope__Group__2 )
            // InternalProblem.g:4491:2: rule__TypeScope__Group__1__Impl rule__TypeScope__Group__2
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
    // InternalProblem.g:4498:1: rule__TypeScope__Group__1__Impl : ( ( rule__TypeScope__Alternatives_1 ) ) ;
    public final void rule__TypeScope__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4502:1: ( ( ( rule__TypeScope__Alternatives_1 ) ) )
            // InternalProblem.g:4503:1: ( ( rule__TypeScope__Alternatives_1 ) )
            {
            // InternalProblem.g:4503:1: ( ( rule__TypeScope__Alternatives_1 ) )
            // InternalProblem.g:4504:2: ( rule__TypeScope__Alternatives_1 )
            {
             before(grammarAccess.getTypeScopeAccess().getAlternatives_1()); 
            // InternalProblem.g:4505:2: ( rule__TypeScope__Alternatives_1 )
            // InternalProblem.g:4505:3: rule__TypeScope__Alternatives_1
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
    // InternalProblem.g:4513:1: rule__TypeScope__Group__2 : rule__TypeScope__Group__2__Impl ;
    public final void rule__TypeScope__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4517:1: ( rule__TypeScope__Group__2__Impl )
            // InternalProblem.g:4518:2: rule__TypeScope__Group__2__Impl
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
    // InternalProblem.g:4524:1: rule__TypeScope__Group__2__Impl : ( ( rule__TypeScope__MultiplicityAssignment_2 ) ) ;
    public final void rule__TypeScope__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4528:1: ( ( ( rule__TypeScope__MultiplicityAssignment_2 ) ) )
            // InternalProblem.g:4529:1: ( ( rule__TypeScope__MultiplicityAssignment_2 ) )
            {
            // InternalProblem.g:4529:1: ( ( rule__TypeScope__MultiplicityAssignment_2 ) )
            // InternalProblem.g:4530:2: ( rule__TypeScope__MultiplicityAssignment_2 )
            {
             before(grammarAccess.getTypeScopeAccess().getMultiplicityAssignment_2()); 
            // InternalProblem.g:4531:2: ( rule__TypeScope__MultiplicityAssignment_2 )
            // InternalProblem.g:4531:3: rule__TypeScope__MultiplicityAssignment_2
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
    // InternalProblem.g:4540:1: rule__RangeMultiplicity__Group__0 : rule__RangeMultiplicity__Group__0__Impl rule__RangeMultiplicity__Group__1 ;
    public final void rule__RangeMultiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4544:1: ( rule__RangeMultiplicity__Group__0__Impl rule__RangeMultiplicity__Group__1 )
            // InternalProblem.g:4545:2: rule__RangeMultiplicity__Group__0__Impl rule__RangeMultiplicity__Group__1
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
    // InternalProblem.g:4552:1: rule__RangeMultiplicity__Group__0__Impl : ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) ) ;
    public final void rule__RangeMultiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4556:1: ( ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) ) )
            // InternalProblem.g:4557:1: ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) )
            {
            // InternalProblem.g:4557:1: ( ( rule__RangeMultiplicity__LowerBoundAssignment_0 ) )
            // InternalProblem.g:4558:2: ( rule__RangeMultiplicity__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getRangeMultiplicityAccess().getLowerBoundAssignment_0()); 
            // InternalProblem.g:4559:2: ( rule__RangeMultiplicity__LowerBoundAssignment_0 )
            // InternalProblem.g:4559:3: rule__RangeMultiplicity__LowerBoundAssignment_0
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
    // InternalProblem.g:4567:1: rule__RangeMultiplicity__Group__1 : rule__RangeMultiplicity__Group__1__Impl rule__RangeMultiplicity__Group__2 ;
    public final void rule__RangeMultiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4571:1: ( rule__RangeMultiplicity__Group__1__Impl rule__RangeMultiplicity__Group__2 )
            // InternalProblem.g:4572:2: rule__RangeMultiplicity__Group__1__Impl rule__RangeMultiplicity__Group__2
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
    // InternalProblem.g:4579:1: rule__RangeMultiplicity__Group__1__Impl : ( '..' ) ;
    public final void rule__RangeMultiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4583:1: ( ( '..' ) )
            // InternalProblem.g:4584:1: ( '..' )
            {
            // InternalProblem.g:4584:1: ( '..' )
            // InternalProblem.g:4585:2: '..'
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
    // InternalProblem.g:4594:1: rule__RangeMultiplicity__Group__2 : rule__RangeMultiplicity__Group__2__Impl ;
    public final void rule__RangeMultiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4598:1: ( rule__RangeMultiplicity__Group__2__Impl )
            // InternalProblem.g:4599:2: rule__RangeMultiplicity__Group__2__Impl
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
    // InternalProblem.g:4605:1: rule__RangeMultiplicity__Group__2__Impl : ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) ) ;
    public final void rule__RangeMultiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4609:1: ( ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) ) )
            // InternalProblem.g:4610:1: ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) )
            {
            // InternalProblem.g:4610:1: ( ( rule__RangeMultiplicity__UpperBoundAssignment_2 ) )
            // InternalProblem.g:4611:2: ( rule__RangeMultiplicity__UpperBoundAssignment_2 )
            {
             before(grammarAccess.getRangeMultiplicityAccess().getUpperBoundAssignment_2()); 
            // InternalProblem.g:4612:2: ( rule__RangeMultiplicity__UpperBoundAssignment_2 )
            // InternalProblem.g:4612:3: rule__RangeMultiplicity__UpperBoundAssignment_2
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
    // InternalProblem.g:4621:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4625:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalProblem.g:4626:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalProblem.g:4633:1: rule__QualifiedName__Group_1__0__Impl : ( ruleIdentifier ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4637:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:4638:1: ( ruleIdentifier )
            {
            // InternalProblem.g:4638:1: ( ruleIdentifier )
            // InternalProblem.g:4639:2: ruleIdentifier
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
    // InternalProblem.g:4648:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2 ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4652:1: ( rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2 )
            // InternalProblem.g:4653:2: rule__QualifiedName__Group_1__1__Impl rule__QualifiedName__Group_1__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalProblem.g:4660:1: rule__QualifiedName__Group_1__1__Impl : ( ( rule__QualifiedName__Group_1_1__0 )* ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4664:1: ( ( ( rule__QualifiedName__Group_1_1__0 )* ) )
            // InternalProblem.g:4665:1: ( ( rule__QualifiedName__Group_1_1__0 )* )
            {
            // InternalProblem.g:4665:1: ( ( rule__QualifiedName__Group_1_1__0 )* )
            // InternalProblem.g:4666:2: ( rule__QualifiedName__Group_1_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1_1()); 
            // InternalProblem.g:4667:2: ( rule__QualifiedName__Group_1_1__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==43) ) {
                    int LA53_1 = input.LA(2);

                    if ( (LA53_1==RULE_ID||(LA53_1>=19 && LA53_1<=22)) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // InternalProblem.g:4667:3: rule__QualifiedName__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__QualifiedName__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalProblem.g:4675:1: rule__QualifiedName__Group_1__2 : rule__QualifiedName__Group_1__2__Impl ;
    public final void rule__QualifiedName__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4679:1: ( rule__QualifiedName__Group_1__2__Impl )
            // InternalProblem.g:4680:2: rule__QualifiedName__Group_1__2__Impl
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
    // InternalProblem.g:4686:1: rule__QualifiedName__Group_1__2__Impl : ( ( rule__QualifiedName__Group_1_2__0 )? ) ;
    public final void rule__QualifiedName__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4690:1: ( ( ( rule__QualifiedName__Group_1_2__0 )? ) )
            // InternalProblem.g:4691:1: ( ( rule__QualifiedName__Group_1_2__0 )? )
            {
            // InternalProblem.g:4691:1: ( ( rule__QualifiedName__Group_1_2__0 )? )
            // InternalProblem.g:4692:2: ( rule__QualifiedName__Group_1_2__0 )?
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1_2()); 
            // InternalProblem.g:4693:2: ( rule__QualifiedName__Group_1_2__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==43) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalProblem.g:4693:3: rule__QualifiedName__Group_1_2__0
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
    // InternalProblem.g:4702:1: rule__QualifiedName__Group_1_1__0 : rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1 ;
    public final void rule__QualifiedName__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4706:1: ( rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1 )
            // InternalProblem.g:4707:2: rule__QualifiedName__Group_1_1__0__Impl rule__QualifiedName__Group_1_1__1
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
    // InternalProblem.g:4714:1: rule__QualifiedName__Group_1_1__0__Impl : ( '::' ) ;
    public final void rule__QualifiedName__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4718:1: ( ( '::' ) )
            // InternalProblem.g:4719:1: ( '::' )
            {
            // InternalProblem.g:4719:1: ( '::' )
            // InternalProblem.g:4720:2: '::'
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
    // InternalProblem.g:4729:1: rule__QualifiedName__Group_1_1__1 : rule__QualifiedName__Group_1_1__1__Impl ;
    public final void rule__QualifiedName__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4733:1: ( rule__QualifiedName__Group_1_1__1__Impl )
            // InternalProblem.g:4734:2: rule__QualifiedName__Group_1_1__1__Impl
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
    // InternalProblem.g:4740:1: rule__QualifiedName__Group_1_1__1__Impl : ( ruleIdentifier ) ;
    public final void rule__QualifiedName__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4744:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:4745:1: ( ruleIdentifier )
            {
            // InternalProblem.g:4745:1: ( ruleIdentifier )
            // InternalProblem.g:4746:2: ruleIdentifier
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


    // $ANTLR start "rule__QualifiedName__Group_1_2__0"
    // InternalProblem.g:4756:1: rule__QualifiedName__Group_1_2__0 : rule__QualifiedName__Group_1_2__0__Impl rule__QualifiedName__Group_1_2__1 ;
    public final void rule__QualifiedName__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4760:1: ( rule__QualifiedName__Group_1_2__0__Impl rule__QualifiedName__Group_1_2__1 )
            // InternalProblem.g:4761:2: rule__QualifiedName__Group_1_2__0__Impl rule__QualifiedName__Group_1_2__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalProblem.g:4768:1: rule__QualifiedName__Group_1_2__0__Impl : ( '::' ) ;
    public final void rule__QualifiedName__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4772:1: ( ( '::' ) )
            // InternalProblem.g:4773:1: ( '::' )
            {
            // InternalProblem.g:4773:1: ( '::' )
            // InternalProblem.g:4774:2: '::'
            {
             before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_2_0()); 

            }


            }

        }
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
    // InternalProblem.g:4783:1: rule__QualifiedName__Group_1_2__1 : rule__QualifiedName__Group_1_2__1__Impl ;
    public final void rule__QualifiedName__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4787:1: ( rule__QualifiedName__Group_1_2__1__Impl )
            // InternalProblem.g:4788:2: rule__QualifiedName__Group_1_2__1__Impl
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
    // InternalProblem.g:4794:1: rule__QualifiedName__Group_1_2__1__Impl : ( RULE_QUOTED_ID ) ;
    public final void rule__QualifiedName__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4798:1: ( ( RULE_QUOTED_ID ) )
            // InternalProblem.g:4799:1: ( RULE_QUOTED_ID )
            {
            // InternalProblem.g:4799:1: ( RULE_QUOTED_ID )
            // InternalProblem.g:4800:2: RULE_QUOTED_ID
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


    // $ANTLR start "rule__Integer__Group__0"
    // InternalProblem.g:4810:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4814:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalProblem.g:4815:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalProblem.g:4822:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4826:1: ( ( ( '-' )? ) )
            // InternalProblem.g:4827:1: ( ( '-' )? )
            {
            // InternalProblem.g:4827:1: ( ( '-' )? )
            // InternalProblem.g:4828:2: ( '-' )?
            {
             before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            // InternalProblem.g:4829:2: ( '-' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==23) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalProblem.g:4829:3: '-'
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
    // InternalProblem.g:4837:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4841:1: ( rule__Integer__Group__1__Impl )
            // InternalProblem.g:4842:2: rule__Integer__Group__1__Impl
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
    // InternalProblem.g:4848:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4852:1: ( ( RULE_INT ) )
            // InternalProblem.g:4853:1: ( RULE_INT )
            {
            // InternalProblem.g:4853:1: ( RULE_INT )
            // InternalProblem.g:4854:2: RULE_INT
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
    // InternalProblem.g:4864:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4868:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // InternalProblem.g:4869:2: rule__Real__Group__0__Impl rule__Real__Group__1
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
    // InternalProblem.g:4876:1: rule__Real__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4880:1: ( ( ( '-' )? ) )
            // InternalProblem.g:4881:1: ( ( '-' )? )
            {
            // InternalProblem.g:4881:1: ( ( '-' )? )
            // InternalProblem.g:4882:2: ( '-' )?
            {
             before(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
            // InternalProblem.g:4883:2: ( '-' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==23) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalProblem.g:4883:3: '-'
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
    // InternalProblem.g:4891:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4895:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // InternalProblem.g:4896:2: rule__Real__Group__1__Impl rule__Real__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalProblem.g:4903:1: rule__Real__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4907:1: ( ( RULE_INT ) )
            // InternalProblem.g:4908:1: ( RULE_INT )
            {
            // InternalProblem.g:4908:1: ( RULE_INT )
            // InternalProblem.g:4909:2: RULE_INT
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
    // InternalProblem.g:4918:1: rule__Real__Group__2 : rule__Real__Group__2__Impl ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4922:1: ( rule__Real__Group__2__Impl )
            // InternalProblem.g:4923:2: rule__Real__Group__2__Impl
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
    // InternalProblem.g:4929:1: rule__Real__Group__2__Impl : ( ( rule__Real__Alternatives_2 ) ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4933:1: ( ( ( rule__Real__Alternatives_2 ) ) )
            // InternalProblem.g:4934:1: ( ( rule__Real__Alternatives_2 ) )
            {
            // InternalProblem.g:4934:1: ( ( rule__Real__Alternatives_2 ) )
            // InternalProblem.g:4935:2: ( rule__Real__Alternatives_2 )
            {
             before(grammarAccess.getRealAccess().getAlternatives_2()); 
            // InternalProblem.g:4936:2: ( rule__Real__Alternatives_2 )
            // InternalProblem.g:4936:3: rule__Real__Alternatives_2
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
    // InternalProblem.g:4945:1: rule__Real__Group_2_0__0 : rule__Real__Group_2_0__0__Impl rule__Real__Group_2_0__1 ;
    public final void rule__Real__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4949:1: ( rule__Real__Group_2_0__0__Impl rule__Real__Group_2_0__1 )
            // InternalProblem.g:4950:2: rule__Real__Group_2_0__0__Impl rule__Real__Group_2_0__1
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
    // InternalProblem.g:4957:1: rule__Real__Group_2_0__0__Impl : ( '.' ) ;
    public final void rule__Real__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4961:1: ( ( '.' ) )
            // InternalProblem.g:4962:1: ( '.' )
            {
            // InternalProblem.g:4962:1: ( '.' )
            // InternalProblem.g:4963:2: '.'
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
    // InternalProblem.g:4972:1: rule__Real__Group_2_0__1 : rule__Real__Group_2_0__1__Impl ;
    public final void rule__Real__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4976:1: ( rule__Real__Group_2_0__1__Impl )
            // InternalProblem.g:4977:2: rule__Real__Group_2_0__1__Impl
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
    // InternalProblem.g:4983:1: rule__Real__Group_2_0__1__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:4987:1: ( ( RULE_INT ) )
            // InternalProblem.g:4988:1: ( RULE_INT )
            {
            // InternalProblem.g:4988:1: ( RULE_INT )
            // InternalProblem.g:4989:2: RULE_INT
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
    // InternalProblem.g:4999:1: rule__Real__Group_2_1__0 : rule__Real__Group_2_1__0__Impl rule__Real__Group_2_1__1 ;
    public final void rule__Real__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5003:1: ( rule__Real__Group_2_1__0__Impl rule__Real__Group_2_1__1 )
            // InternalProblem.g:5004:2: rule__Real__Group_2_1__0__Impl rule__Real__Group_2_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalProblem.g:5011:1: rule__Real__Group_2_1__0__Impl : ( ( rule__Real__Group_2_1_0__0 )? ) ;
    public final void rule__Real__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5015:1: ( ( ( rule__Real__Group_2_1_0__0 )? ) )
            // InternalProblem.g:5016:1: ( ( rule__Real__Group_2_1_0__0 )? )
            {
            // InternalProblem.g:5016:1: ( ( rule__Real__Group_2_1_0__0 )? )
            // InternalProblem.g:5017:2: ( rule__Real__Group_2_1_0__0 )?
            {
             before(grammarAccess.getRealAccess().getGroup_2_1_0()); 
            // InternalProblem.g:5018:2: ( rule__Real__Group_2_1_0__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==12) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalProblem.g:5018:3: rule__Real__Group_2_1_0__0
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
    // InternalProblem.g:5026:1: rule__Real__Group_2_1__1 : rule__Real__Group_2_1__1__Impl rule__Real__Group_2_1__2 ;
    public final void rule__Real__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5030:1: ( rule__Real__Group_2_1__1__Impl rule__Real__Group_2_1__2 )
            // InternalProblem.g:5031:2: rule__Real__Group_2_1__1__Impl rule__Real__Group_2_1__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalProblem.g:5038:1: rule__Real__Group_2_1__1__Impl : ( ( rule__Real__Alternatives_2_1_1 ) ) ;
    public final void rule__Real__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5042:1: ( ( ( rule__Real__Alternatives_2_1_1 ) ) )
            // InternalProblem.g:5043:1: ( ( rule__Real__Alternatives_2_1_1 ) )
            {
            // InternalProblem.g:5043:1: ( ( rule__Real__Alternatives_2_1_1 ) )
            // InternalProblem.g:5044:2: ( rule__Real__Alternatives_2_1_1 )
            {
             before(grammarAccess.getRealAccess().getAlternatives_2_1_1()); 
            // InternalProblem.g:5045:2: ( rule__Real__Alternatives_2_1_1 )
            // InternalProblem.g:5045:3: rule__Real__Alternatives_2_1_1
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
    // InternalProblem.g:5053:1: rule__Real__Group_2_1__2 : rule__Real__Group_2_1__2__Impl rule__Real__Group_2_1__3 ;
    public final void rule__Real__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5057:1: ( rule__Real__Group_2_1__2__Impl rule__Real__Group_2_1__3 )
            // InternalProblem.g:5058:2: rule__Real__Group_2_1__2__Impl rule__Real__Group_2_1__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalProblem.g:5065:1: rule__Real__Group_2_1__2__Impl : ( ( rule__Real__Alternatives_2_1_2 )? ) ;
    public final void rule__Real__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5069:1: ( ( ( rule__Real__Alternatives_2_1_2 )? ) )
            // InternalProblem.g:5070:1: ( ( rule__Real__Alternatives_2_1_2 )? )
            {
            // InternalProblem.g:5070:1: ( ( rule__Real__Alternatives_2_1_2 )? )
            // InternalProblem.g:5071:2: ( rule__Real__Alternatives_2_1_2 )?
            {
             before(grammarAccess.getRealAccess().getAlternatives_2_1_2()); 
            // InternalProblem.g:5072:2: ( rule__Real__Alternatives_2_1_2 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=23 && LA58_0<=24)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalProblem.g:5072:3: rule__Real__Alternatives_2_1_2
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
    // InternalProblem.g:5080:1: rule__Real__Group_2_1__3 : rule__Real__Group_2_1__3__Impl ;
    public final void rule__Real__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5084:1: ( rule__Real__Group_2_1__3__Impl )
            // InternalProblem.g:5085:2: rule__Real__Group_2_1__3__Impl
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
    // InternalProblem.g:5091:1: rule__Real__Group_2_1__3__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5095:1: ( ( RULE_INT ) )
            // InternalProblem.g:5096:1: ( RULE_INT )
            {
            // InternalProblem.g:5096:1: ( RULE_INT )
            // InternalProblem.g:5097:2: RULE_INT
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
    // InternalProblem.g:5107:1: rule__Real__Group_2_1_0__0 : rule__Real__Group_2_1_0__0__Impl rule__Real__Group_2_1_0__1 ;
    public final void rule__Real__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5111:1: ( rule__Real__Group_2_1_0__0__Impl rule__Real__Group_2_1_0__1 )
            // InternalProblem.g:5112:2: rule__Real__Group_2_1_0__0__Impl rule__Real__Group_2_1_0__1
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
    // InternalProblem.g:5119:1: rule__Real__Group_2_1_0__0__Impl : ( '.' ) ;
    public final void rule__Real__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5123:1: ( ( '.' ) )
            // InternalProblem.g:5124:1: ( '.' )
            {
            // InternalProblem.g:5124:1: ( '.' )
            // InternalProblem.g:5125:2: '.'
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
    // InternalProblem.g:5134:1: rule__Real__Group_2_1_0__1 : rule__Real__Group_2_1_0__1__Impl ;
    public final void rule__Real__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5138:1: ( rule__Real__Group_2_1_0__1__Impl )
            // InternalProblem.g:5139:2: rule__Real__Group_2_1_0__1__Impl
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
    // InternalProblem.g:5145:1: rule__Real__Group_2_1_0__1__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5149:1: ( ( RULE_INT ) )
            // InternalProblem.g:5150:1: ( RULE_INT )
            {
            // InternalProblem.g:5150:1: ( RULE_INT )
            // InternalProblem.g:5151:2: RULE_INT
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
    // InternalProblem.g:5161:1: rule__Problem__NameAssignment_0_1 : ( ruleIdentifier ) ;
    public final void rule__Problem__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5165:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:5166:2: ( ruleIdentifier )
            {
            // InternalProblem.g:5166:2: ( ruleIdentifier )
            // InternalProblem.g:5167:3: ruleIdentifier
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
    // InternalProblem.g:5176:1: rule__Problem__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Problem__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5180:1: ( ( ruleStatement ) )
            // InternalProblem.g:5181:2: ( ruleStatement )
            {
            // InternalProblem.g:5181:2: ( ruleStatement )
            // InternalProblem.g:5182:3: ruleStatement
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
    // InternalProblem.g:5191:1: rule__ClassDeclaration__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__ClassDeclaration__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5195:1: ( ( ( 'abstract' ) ) )
            // InternalProblem.g:5196:2: ( ( 'abstract' ) )
            {
            // InternalProblem.g:5196:2: ( ( 'abstract' ) )
            // InternalProblem.g:5197:3: ( 'abstract' )
            {
             before(grammarAccess.getClassDeclarationAccess().getAbstractAbstractKeyword_0_0()); 
            // InternalProblem.g:5198:3: ( 'abstract' )
            // InternalProblem.g:5199:4: 'abstract'
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
    // InternalProblem.g:5210:1: rule__ClassDeclaration__NameAssignment_2 : ( ruleIdentifier ) ;
    public final void rule__ClassDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5214:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:5215:2: ( ruleIdentifier )
            {
            // InternalProblem.g:5215:2: ( ruleIdentifier )
            // InternalProblem.g:5216:3: ruleIdentifier
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
    // InternalProblem.g:5225:1: rule__ClassDeclaration__SuperTypesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassDeclaration__SuperTypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5229:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5230:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5230:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5231:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesRelationCrossReference_3_1_0()); 
            // InternalProblem.g:5232:3: ( ruleQualifiedName )
            // InternalProblem.g:5233:4: ruleQualifiedName
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
    // InternalProblem.g:5244:1: rule__ClassDeclaration__SuperTypesAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassDeclaration__SuperTypesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5248:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5249:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5249:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5250:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassDeclarationAccess().getSuperTypesRelationCrossReference_3_2_1_0()); 
            // InternalProblem.g:5251:3: ( ruleQualifiedName )
            // InternalProblem.g:5252:4: ruleQualifiedName
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
    // InternalProblem.g:5263:1: rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0 : ( ruleReferenceDeclaration ) ;
    public final void rule__ClassDeclaration__ReferenceDeclarationsAssignment_4_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5267:1: ( ( ruleReferenceDeclaration ) )
            // InternalProblem.g:5268:2: ( ruleReferenceDeclaration )
            {
            // InternalProblem.g:5268:2: ( ruleReferenceDeclaration )
            // InternalProblem.g:5269:3: ruleReferenceDeclaration
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
    // InternalProblem.g:5278:1: rule__EnumDeclaration__NameAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__EnumDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5282:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:5283:2: ( ruleIdentifier )
            {
            // InternalProblem.g:5283:2: ( ruleIdentifier )
            // InternalProblem.g:5284:3: ruleIdentifier
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
    // InternalProblem.g:5293:1: rule__EnumDeclaration__LiteralsAssignment_2_0_1_0 : ( ruleEnumLiteral ) ;
    public final void rule__EnumDeclaration__LiteralsAssignment_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5297:1: ( ( ruleEnumLiteral ) )
            // InternalProblem.g:5298:2: ( ruleEnumLiteral )
            {
            // InternalProblem.g:5298:2: ( ruleEnumLiteral )
            // InternalProblem.g:5299:3: ruleEnumLiteral
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
    // InternalProblem.g:5308:1: rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1 : ( ruleEnumLiteral ) ;
    public final void rule__EnumDeclaration__LiteralsAssignment_2_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5312:1: ( ( ruleEnumLiteral ) )
            // InternalProblem.g:5313:2: ( ruleEnumLiteral )
            {
            // InternalProblem.g:5313:2: ( ruleEnumLiteral )
            // InternalProblem.g:5314:3: ruleEnumLiteral
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
    // InternalProblem.g:5323:1: rule__EnumLiteral__NameAssignment : ( ruleQuotedOrUnquotedId ) ;
    public final void rule__EnumLiteral__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5327:1: ( ( ruleQuotedOrUnquotedId ) )
            // InternalProblem.g:5328:2: ( ruleQuotedOrUnquotedId )
            {
            // InternalProblem.g:5328:2: ( ruleQuotedOrUnquotedId )
            // InternalProblem.g:5329:3: ruleQuotedOrUnquotedId
            {
             before(grammarAccess.getEnumLiteralAccess().getNameQuotedOrUnquotedIdParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQuotedOrUnquotedId();

            state._fsp--;

             after(grammarAccess.getEnumLiteralAccess().getNameQuotedOrUnquotedIdParserRuleCall_0()); 

            }


            }

        }
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
    // InternalProblem.g:5338:1: rule__ReferenceDeclaration__ContainmentAssignment_0_0 : ( ( 'contains' ) ) ;
    public final void rule__ReferenceDeclaration__ContainmentAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5342:1: ( ( ( 'contains' ) ) )
            // InternalProblem.g:5343:2: ( ( 'contains' ) )
            {
            // InternalProblem.g:5343:2: ( ( 'contains' ) )
            // InternalProblem.g:5344:3: ( 'contains' )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getContainmentContainsKeyword_0_0_0()); 
            // InternalProblem.g:5345:3: ( 'contains' )
            // InternalProblem.g:5346:4: 'contains'
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
    // InternalProblem.g:5357:1: rule__ReferenceDeclaration__ReferenceTypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceDeclaration__ReferenceTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5361:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5362:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5362:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5363:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeRelationCrossReference_1_0()); 
            // InternalProblem.g:5364:3: ( ruleQualifiedName )
            // InternalProblem.g:5365:4: ruleQualifiedName
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
    // InternalProblem.g:5376:1: rule__ReferenceDeclaration__MultiplicityAssignment_2_1 : ( ruleMultiplicity ) ;
    public final void rule__ReferenceDeclaration__MultiplicityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5380:1: ( ( ruleMultiplicity ) )
            // InternalProblem.g:5381:2: ( ruleMultiplicity )
            {
            // InternalProblem.g:5381:2: ( ruleMultiplicity )
            // InternalProblem.g:5382:3: ruleMultiplicity
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
    // InternalProblem.g:5391:1: rule__ReferenceDeclaration__NameAssignment_3 : ( ruleIdentifier ) ;
    public final void rule__ReferenceDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5395:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:5396:2: ( ruleIdentifier )
            {
            // InternalProblem.g:5396:2: ( ruleIdentifier )
            // InternalProblem.g:5397:3: ruleIdentifier
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
    // InternalProblem.g:5406:1: rule__ReferenceDeclaration__OppositeAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceDeclaration__OppositeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5410:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5411:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5411:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5412:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getOppositeReferenceDeclarationCrossReference_4_1_0()); 
            // InternalProblem.g:5413:3: ( ruleQualifiedName )
            // InternalProblem.g:5414:4: ruleQualifiedName
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
    // InternalProblem.g:5425:1: rule__PredicateDefinition__ErrorAssignment_0_0_0 : ( ( 'error' ) ) ;
    public final void rule__PredicateDefinition__ErrorAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5429:1: ( ( ( 'error' ) ) )
            // InternalProblem.g:5430:2: ( ( 'error' ) )
            {
            // InternalProblem.g:5430:2: ( ( 'error' ) )
            // InternalProblem.g:5431:3: ( 'error' )
            {
             before(grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_0_0_0()); 
            // InternalProblem.g:5432:3: ( 'error' )
            // InternalProblem.g:5433:4: 'error'
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
    // InternalProblem.g:5444:1: rule__PredicateDefinition__NameAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__PredicateDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5448:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:5449:2: ( ruleIdentifier )
            {
            // InternalProblem.g:5449:2: ( ruleIdentifier )
            // InternalProblem.g:5450:3: ruleIdentifier
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
    // InternalProblem.g:5459:1: rule__PredicateDefinition__ParametersAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__PredicateDefinition__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5463:1: ( ( ruleParameter ) )
            // InternalProblem.g:5464:2: ( ruleParameter )
            {
            // InternalProblem.g:5464:2: ( ruleParameter )
            // InternalProblem.g:5465:3: ruleParameter
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
    // InternalProblem.g:5474:1: rule__PredicateDefinition__ParametersAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__PredicateDefinition__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5478:1: ( ( ruleParameter ) )
            // InternalProblem.g:5479:2: ( ruleParameter )
            {
            // InternalProblem.g:5479:2: ( ruleParameter )
            // InternalProblem.g:5480:3: ruleParameter
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
    // InternalProblem.g:5489:1: rule__PredicateDefinition__BodiesAssignment_5_1 : ( ruleConjunction ) ;
    public final void rule__PredicateDefinition__BodiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5493:1: ( ( ruleConjunction ) )
            // InternalProblem.g:5494:2: ( ruleConjunction )
            {
            // InternalProblem.g:5494:2: ( ruleConjunction )
            // InternalProblem.g:5495:3: ruleConjunction
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
    // InternalProblem.g:5504:1: rule__PredicateDefinition__BodiesAssignment_5_2_1 : ( ruleConjunction ) ;
    public final void rule__PredicateDefinition__BodiesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5508:1: ( ( ruleConjunction ) )
            // InternalProblem.g:5509:2: ( ruleConjunction )
            {
            // InternalProblem.g:5509:2: ( ruleConjunction )
            // InternalProblem.g:5510:3: ruleConjunction
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
    // InternalProblem.g:5519:1: rule__Parameter__ParameterTypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Parameter__ParameterTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5523:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5524:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5524:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5525:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getParameterAccess().getParameterTypeRelationCrossReference_0_0()); 
            // InternalProblem.g:5526:3: ( ruleQualifiedName )
            // InternalProblem.g:5527:4: ruleQualifiedName
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
    // InternalProblem.g:5538:1: rule__Parameter__NameAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5542:1: ( ( ruleIdentifier ) )
            // InternalProblem.g:5543:2: ( ruleIdentifier )
            {
            // InternalProblem.g:5543:2: ( ruleIdentifier )
            // InternalProblem.g:5544:3: ruleIdentifier
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
    // InternalProblem.g:5553:1: rule__Conjunction__LiteralsAssignment_0 : ( ruleLiteral ) ;
    public final void rule__Conjunction__LiteralsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5557:1: ( ( ruleLiteral ) )
            // InternalProblem.g:5558:2: ( ruleLiteral )
            {
            // InternalProblem.g:5558:2: ( ruleLiteral )
            // InternalProblem.g:5559:3: ruleLiteral
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
    // InternalProblem.g:5568:1: rule__Conjunction__LiteralsAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__Conjunction__LiteralsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5572:1: ( ( ruleLiteral ) )
            // InternalProblem.g:5573:2: ( ruleLiteral )
            {
            // InternalProblem.g:5573:2: ( ruleLiteral )
            // InternalProblem.g:5574:3: ruleLiteral
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
    // InternalProblem.g:5583:1: rule__NegativeLiteral__AtomAssignment_1 : ( ruleAtom ) ;
    public final void rule__NegativeLiteral__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5587:1: ( ( ruleAtom ) )
            // InternalProblem.g:5588:2: ( ruleAtom )
            {
            // InternalProblem.g:5588:2: ( ruleAtom )
            // InternalProblem.g:5589:3: ruleAtom
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
    // InternalProblem.g:5598:1: rule__Atom__RelationAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Atom__RelationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5602:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5603:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5603:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5604:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAtomAccess().getRelationRelationCrossReference_0_0()); 
            // InternalProblem.g:5605:3: ( ruleQualifiedName )
            // InternalProblem.g:5606:4: ruleQualifiedName
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
    // InternalProblem.g:5617:1: rule__Atom__TransitiveClosureAssignment_1 : ( ( '+' ) ) ;
    public final void rule__Atom__TransitiveClosureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5621:1: ( ( ( '+' ) ) )
            // InternalProblem.g:5622:2: ( ( '+' ) )
            {
            // InternalProblem.g:5622:2: ( ( '+' ) )
            // InternalProblem.g:5623:3: ( '+' )
            {
             before(grammarAccess.getAtomAccess().getTransitiveClosurePlusSignKeyword_1_0()); 
            // InternalProblem.g:5624:3: ( '+' )
            // InternalProblem.g:5625:4: '+'
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
    // InternalProblem.g:5636:1: rule__Atom__ArgumentsAssignment_3_0 : ( ruleArgument ) ;
    public final void rule__Atom__ArgumentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5640:1: ( ( ruleArgument ) )
            // InternalProblem.g:5641:2: ( ruleArgument )
            {
            // InternalProblem.g:5641:2: ( ruleArgument )
            // InternalProblem.g:5642:3: ruleArgument
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
    // InternalProblem.g:5651:1: rule__Atom__ArgumentsAssignment_3_1_1 : ( ruleArgument ) ;
    public final void rule__Atom__ArgumentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5655:1: ( ( ruleArgument ) )
            // InternalProblem.g:5656:2: ( ruleArgument )
            {
            // InternalProblem.g:5656:2: ( ruleArgument )
            // InternalProblem.g:5657:3: ruleArgument
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
    // InternalProblem.g:5666:1: rule__VariableOrNodeArgument__VariableOrNodeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__VariableOrNodeArgument__VariableOrNodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5670:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5671:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5671:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5672:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getVariableOrNodeArgumentAccess().getVariableOrNodeVariableOrNodeCrossReference_0()); 
            // InternalProblem.g:5673:3: ( ruleQualifiedName )
            // InternalProblem.g:5674:4: ruleQualifiedName
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
    // InternalProblem.g:5685:1: rule__ConstantArgument__ConstantAssignment : ( ruleConstant ) ;
    public final void rule__ConstantArgument__ConstantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5689:1: ( ( ruleConstant ) )
            // InternalProblem.g:5690:2: ( ruleConstant )
            {
            // InternalProblem.g:5690:2: ( ruleConstant )
            // InternalProblem.g:5691:3: ruleConstant
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
    // InternalProblem.g:5700:1: rule__Assertion__RelationAssignment_0_0_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__RelationAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5704:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5705:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5705:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5706:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getRelationRelationCrossReference_0_0_0_0()); 
            // InternalProblem.g:5707:3: ( ruleQualifiedName )
            // InternalProblem.g:5708:4: ruleQualifiedName
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
    // InternalProblem.g:5719:1: rule__Assertion__ArgumentsAssignment_0_0_2_0 : ( ruleAssertionArgument ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5723:1: ( ( ruleAssertionArgument ) )
            // InternalProblem.g:5724:2: ( ruleAssertionArgument )
            {
            // InternalProblem.g:5724:2: ( ruleAssertionArgument )
            // InternalProblem.g:5725:3: ruleAssertionArgument
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
    // InternalProblem.g:5734:1: rule__Assertion__ArgumentsAssignment_0_0_2_1_1 : ( ruleAssertionArgument ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5738:1: ( ( ruleAssertionArgument ) )
            // InternalProblem.g:5739:2: ( ruleAssertionArgument )
            {
            // InternalProblem.g:5739:2: ( ruleAssertionArgument )
            // InternalProblem.g:5740:3: ruleAssertionArgument
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
    // InternalProblem.g:5749:1: rule__Assertion__ValueAssignment_0_0_5 : ( ruleLogicValue ) ;
    public final void rule__Assertion__ValueAssignment_0_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5753:1: ( ( ruleLogicValue ) )
            // InternalProblem.g:5754:2: ( ruleLogicValue )
            {
            // InternalProblem.g:5754:2: ( ruleLogicValue )
            // InternalProblem.g:5755:3: ruleLogicValue
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
    // InternalProblem.g:5764:1: rule__Assertion__ValueAssignment_0_1_0 : ( ruleShortLogicValue ) ;
    public final void rule__Assertion__ValueAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5768:1: ( ( ruleShortLogicValue ) )
            // InternalProblem.g:5769:2: ( ruleShortLogicValue )
            {
            // InternalProblem.g:5769:2: ( ruleShortLogicValue )
            // InternalProblem.g:5770:3: ruleShortLogicValue
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
    // InternalProblem.g:5779:1: rule__Assertion__RelationAssignment_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Assertion__RelationAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5783:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5784:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5784:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5785:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssertionAccess().getRelationRelationCrossReference_0_1_1_0()); 
            // InternalProblem.g:5786:3: ( ruleQualifiedName )
            // InternalProblem.g:5787:4: ruleQualifiedName
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
    // InternalProblem.g:5798:1: rule__Assertion__ArgumentsAssignment_0_1_3_0 : ( ruleAssertionArgument ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5802:1: ( ( ruleAssertionArgument ) )
            // InternalProblem.g:5803:2: ( ruleAssertionArgument )
            {
            // InternalProblem.g:5803:2: ( ruleAssertionArgument )
            // InternalProblem.g:5804:3: ruleAssertionArgument
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
    // InternalProblem.g:5813:1: rule__Assertion__ArgumentsAssignment_0_1_3_1_1 : ( ruleAssertionArgument ) ;
    public final void rule__Assertion__ArgumentsAssignment_0_1_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5817:1: ( ( ruleAssertionArgument ) )
            // InternalProblem.g:5818:2: ( ruleAssertionArgument )
            {
            // InternalProblem.g:5818:2: ( ruleAssertionArgument )
            // InternalProblem.g:5819:3: ruleAssertionArgument
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
    // InternalProblem.g:5828:1: rule__NodeAssertionArgument__NodeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__NodeAssertionArgument__NodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5832:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5833:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5833:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5834:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNodeAssertionArgumentAccess().getNodeNodeCrossReference_0()); 
            // InternalProblem.g:5835:3: ( ruleQualifiedName )
            // InternalProblem.g:5836:4: ruleQualifiedName
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
    // InternalProblem.g:5847:1: rule__ConstantAssertionArgument__ConstantAssignment : ( ruleConstant ) ;
    public final void rule__ConstantAssertionArgument__ConstantAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5851:1: ( ( ruleConstant ) )
            // InternalProblem.g:5852:2: ( ruleConstant )
            {
            // InternalProblem.g:5852:2: ( ruleConstant )
            // InternalProblem.g:5853:3: ruleConstant
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
    // InternalProblem.g:5862:1: rule__NodeValueAssertion__NodeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NodeValueAssertion__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5866:1: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:5867:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:5867:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:5868:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNodeValueAssertionAccess().getNodeNodeCrossReference_0_0()); 
            // InternalProblem.g:5869:3: ( ruleQualifiedName )
            // InternalProblem.g:5870:4: ruleQualifiedName
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
    // InternalProblem.g:5881:1: rule__NodeValueAssertion__ValueAssignment_2 : ( ruleConstant ) ;
    public final void rule__NodeValueAssertion__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5885:1: ( ( ruleConstant ) )
            // InternalProblem.g:5886:2: ( ruleConstant )
            {
            // InternalProblem.g:5886:2: ( ruleConstant )
            // InternalProblem.g:5887:3: ruleConstant
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
    // InternalProblem.g:5896:1: rule__IntConstant__IntValueAssignment : ( ruleInteger ) ;
    public final void rule__IntConstant__IntValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5900:1: ( ( ruleInteger ) )
            // InternalProblem.g:5901:2: ( ruleInteger )
            {
            // InternalProblem.g:5901:2: ( ruleInteger )
            // InternalProblem.g:5902:3: ruleInteger
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
    // InternalProblem.g:5911:1: rule__RealConstant__RealValueAssignment : ( ruleReal ) ;
    public final void rule__RealConstant__RealValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5915:1: ( ( ruleReal ) )
            // InternalProblem.g:5916:2: ( ruleReal )
            {
            // InternalProblem.g:5916:2: ( ruleReal )
            // InternalProblem.g:5917:3: ruleReal
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
    // InternalProblem.g:5926:1: rule__StringConstant__StringValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringConstant__StringValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5930:1: ( ( RULE_STRING ) )
            // InternalProblem.g:5931:2: ( RULE_STRING )
            {
            // InternalProblem.g:5931:2: ( RULE_STRING )
            // InternalProblem.g:5932:3: RULE_STRING
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
    // InternalProblem.g:5941:1: rule__ScopeDeclaration__TypeScopesAssignment_1 : ( ruleTypeScope ) ;
    public final void rule__ScopeDeclaration__TypeScopesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5945:1: ( ( ruleTypeScope ) )
            // InternalProblem.g:5946:2: ( ruleTypeScope )
            {
            // InternalProblem.g:5946:2: ( ruleTypeScope )
            // InternalProblem.g:5947:3: ruleTypeScope
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
    // InternalProblem.g:5956:1: rule__ScopeDeclaration__TypeScopesAssignment_2_1 : ( ruleTypeScope ) ;
    public final void rule__ScopeDeclaration__TypeScopesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5960:1: ( ( ruleTypeScope ) )
            // InternalProblem.g:5961:2: ( ruleTypeScope )
            {
            // InternalProblem.g:5961:2: ( ruleTypeScope )
            // InternalProblem.g:5962:3: ruleTypeScope
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
    // InternalProblem.g:5971:1: rule__TypeScope__TargetTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeScope__TargetTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5975:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:5976:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:5976:2: ( ( RULE_ID ) )
            // InternalProblem.g:5977:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeScopeAccess().getTargetTypeClassDeclarationCrossReference_0_0()); 
            // InternalProblem.g:5978:3: ( RULE_ID )
            // InternalProblem.g:5979:4: RULE_ID
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
    // InternalProblem.g:5990:1: rule__TypeScope__IncrementAssignment_1_0 : ( ( '+=' ) ) ;
    public final void rule__TypeScope__IncrementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:5994:1: ( ( ( '+=' ) ) )
            // InternalProblem.g:5995:2: ( ( '+=' ) )
            {
            // InternalProblem.g:5995:2: ( ( '+=' ) )
            // InternalProblem.g:5996:3: ( '+=' )
            {
             before(grammarAccess.getTypeScopeAccess().getIncrementPlusSignEqualsSignKeyword_1_0_0()); 
            // InternalProblem.g:5997:3: ( '+=' )
            // InternalProblem.g:5998:4: '+='
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
    // InternalProblem.g:6009:1: rule__TypeScope__MultiplicityAssignment_2 : ( ruleDefiniteMultiplicity ) ;
    public final void rule__TypeScope__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:6013:1: ( ( ruleDefiniteMultiplicity ) )
            // InternalProblem.g:6014:2: ( ruleDefiniteMultiplicity )
            {
            // InternalProblem.g:6014:2: ( ruleDefiniteMultiplicity )
            // InternalProblem.g:6015:3: ruleDefiniteMultiplicity
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
    // InternalProblem.g:6024:1: rule__RangeMultiplicity__LowerBoundAssignment_0 : ( RULE_INT ) ;
    public final void rule__RangeMultiplicity__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:6028:1: ( ( RULE_INT ) )
            // InternalProblem.g:6029:2: ( RULE_INT )
            {
            // InternalProblem.g:6029:2: ( RULE_INT )
            // InternalProblem.g:6030:3: RULE_INT
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
    // InternalProblem.g:6039:1: rule__RangeMultiplicity__UpperBoundAssignment_2 : ( ruleUpperBound ) ;
    public final void rule__RangeMultiplicity__UpperBoundAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:6043:1: ( ( ruleUpperBound ) )
            // InternalProblem.g:6044:2: ( ruleUpperBound )
            {
            // InternalProblem.g:6044:2: ( ruleUpperBound )
            // InternalProblem.g:6045:3: ruleUpperBound
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
    // InternalProblem.g:6054:1: rule__ExactMultiplicity__ExactValueAssignment : ( RULE_INT ) ;
    public final void rule__ExactMultiplicity__ExactValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:6058:1: ( ( RULE_INT ) )
            // InternalProblem.g:6059:2: ( RULE_INT )
            {
            // InternalProblem.g:6059:2: ( RULE_INT )
            // InternalProblem.g:6060:3: RULE_INT
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
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\1\5\3\uffff\6\45\3\uffff\1\5\6\45";
    static final String dfa_3s = "\1\56\3\uffff\1\50\5\53\3\uffff\1\26\5\53\1\50";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\6\uffff\1\4\1\6\1\5\7\uffff";
    static final String dfa_5s = "\24\uffff}>";
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
            "\1\23\1\16\14\uffff\1\17\1\20\1\21\1\22",
            "\1\12\2\uffff\1\14\2\uffff\1\15",
            "\1\12\2\uffff\1\14\2\uffff\1\15",
            "\1\12\2\uffff\1\14\2\uffff\1\15",
            "\1\12\2\uffff\1\14\2\uffff\1\15",
            "\1\12\2\uffff\1\14\2\uffff\1\15",
            "\1\12\2\uffff\1\14"
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
            return "1033:1: rule__Statement__Alternatives : ( ( ruleClassDeclaration ) | ( ruleEnumDeclaration ) | ( rulePredicateDefinition ) | ( ruleAssertion ) | ( ruleNodeValueAssertion ) | ( ruleScopeDeclaration ) );";
        }
    }
    static final String dfa_7s = "\101\uffff";
    static final String dfa_8s = "\1\5\6\45\1\uffff\1\4\1\5\6\15\1\4\1\14\1\15\1\14\6\45\1\4\1\5\3\4\1\uffff\6\15\1\4\1\14\10\15\2\4\1\15\1\5\3\4\7\15\2\4\1\15";
    static final String dfa_9s = "\1\33\1\45\5\53\1\uffff\1\46\1\26\1\46\5\53\1\4\2\46\1\50\1\45\5\53\1\27\1\26\1\4\2\30\1\uffff\1\46\5\53\1\4\3\46\5\53\1\46\2\4\1\46\1\26\1\4\2\30\5\53\2\46\2\4\1\46";
    static final String dfa_10s = "\7\uffff\1\2\27\uffff\1\1\41\uffff";
    static final String dfa_11s = "\101\uffff}>";
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
            "\1\24\1\25\14\uffff\1\26\1\27\1\30\1\31",
            "\1\32\30\uffff\1\23",
            "\1\32\30\uffff\1\23\4\uffff\1\33",
            "\1\32\30\uffff\1\23\4\uffff\1\33",
            "\1\32\30\uffff\1\23\4\uffff\1\33",
            "\1\32\30\uffff\1\23\4\uffff\1\33",
            "\1\32\30\uffff\1\23\4\uffff\1\33",
            "\1\21",
            "\1\34\1\32\7\uffff\1\35\1\36\17\uffff\1\23",
            "\1\32\30\uffff\1\23",
            "\1\7\33\uffff\1\37",
            "\1\10",
            "\1\10\5\uffff\1\11",
            "\1\10\5\uffff\1\11",
            "\1\10\5\uffff\1\11",
            "\1\10\5\uffff\1\11",
            "\1\10\5\uffff\1\11",
            "\1\47\1\40\1\41\1\50\13\uffff\1\42\1\43\1\44\1\45\1\46",
            "\1\51\1\52\14\uffff\1\53\1\54\1\55\1\56",
            "\1\57",
            "\1\62\22\uffff\1\60\1\61",
            "\1\62\22\uffff\1\60\1\61",
            "",
            "\1\32\30\uffff\1\23",
            "\1\32\30\uffff\1\23\4\uffff\1\63",
            "\1\32\30\uffff\1\23\4\uffff\1\63",
            "\1\32\30\uffff\1\23\4\uffff\1\63",
            "\1\32\30\uffff\1\23\4\uffff\1\63",
            "\1\32\30\uffff\1\23\4\uffff\1\63",
            "\1\47",
            "\1\64\1\32\7\uffff\1\65\1\66\17\uffff\1\23",
            "\1\32\30\uffff\1\23",
            "\1\32\30\uffff\1\23",
            "\1\32\30\uffff\1\23\4\uffff\1\33",
            "\1\32\30\uffff\1\23\4\uffff\1\33",
            "\1\32\30\uffff\1\23\4\uffff\1\33",
            "\1\32\30\uffff\1\23\4\uffff\1\33",
            "\1\32\30\uffff\1\23\4\uffff\1\33",
            "\1\32\7\uffff\1\35\1\36\17\uffff\1\23",
            "\1\62",
            "\1\62",
            "\1\32\30\uffff\1\23",
            "\1\74\1\67\14\uffff\1\70\1\71\1\72\1\73",
            "\1\75",
            "\1\100\22\uffff\1\76\1\77",
            "\1\100\22\uffff\1\76\1\77",
            "\1\32\30\uffff\1\23\4\uffff\1\63",
            "\1\32\30\uffff\1\23\4\uffff\1\63",
            "\1\32\30\uffff\1\23\4\uffff\1\63",
            "\1\32\30\uffff\1\23\4\uffff\1\63",
            "\1\32\30\uffff\1\23\4\uffff\1\63",
            "\1\32\30\uffff\1\23",
            "\1\32\7\uffff\1\65\1\66\17\uffff\1\23",
            "\1\100",
            "\1\100",
            "\1\32\30\uffff\1\23"
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
            return "1225:1: rule__Assertion__Alternatives_0 : ( ( ( rule__Assertion__Group_0_0__0 ) ) | ( ( rule__Assertion__Group_0_1__0 ) ) );";
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
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000601000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000001800010L});

}