package hu.bme.mit.inf.dslreasoner.ide.contentassist.antlr.internal;

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
import hu.bme.mit.inf.dslreasoner.services.VampireLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVampireLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LOWER_WORD_ID", "RULE_SIGNED_LITERAL", "RULE_SINGLE_QUOTE", "RULE_DOLLAR_ID", "RULE_DOUBLE_DOLLAR_ID", "RULE_SINGLE_COMMENT", "RULE_UPPER_WORD_ID", "RULE_SIGNED_REAL_ID", "RULE_SIGNED_RAT_ID", "RULE_DOUBLE_QUOTE", "RULE_ALPHA_NUMERIC", "RULE_SIGN", "RULE_INT", "RULE_LITERAL", "RULE_UNSIGNED_REAL_FRAC_ID", "RULE_UNSIGNED_REAL_EXP_ID", "RULE_UNSIGNED_RAT_ID", "RULE_ANY_OTHER", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'axiom'", "'conjecture'", "'hypothesis'", "'definition'", "'assumption'", "'lemma'", "'theorem'", "'corollary'", "'negated_conjecture'", "'plain'", "'type'", "'fi_domain'", "'fi_functors'", "'fi_predicates'", "'unknown'", "'fof'", "'('", "','", "')'", "'.'", "'['", "']'", "'<=>'", "'=>'", "'<='", "'<~>'", "'~|'", "'~&'", "'&'", "'|'", "'!'", "':'", "'?'", "'~'", "'!='", "'='", "':='", "'$true'", "'$false'", "'$less'"
    };
    public static final int RULE_UNSIGNED_RAT_ID=20;
    public static final int T__50=50;
    public static final int RULE_SIGN=15;
    public static final int T__59=59;
    public static final int RULE_SIGNED_LITERAL=5;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_DOUBLE_QUOTE=13;
    public static final int T__52=52;
    public static final int RULE_LITERAL=17;
    public static final int T__53=53;
    public static final int RULE_UNSIGNED_REAL_FRAC_ID=18;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=22;
    public static final int RULE_SINGLE_QUOTE=6;
    public static final int RULE_SINGLE_COMMENT=9;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=16;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=24;
    public static final int RULE_SIGNED_RAT_ID=12;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_LOWER_WORD_ID=4;
    public static final int RULE_STRING=23;
    public static final int RULE_SL_COMMENT=25;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_UNSIGNED_REAL_EXP_ID=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_UPPER_WORD_ID=10;
    public static final int RULE_WS=26;
    public static final int RULE_DOLLAR_ID=7;
    public static final int RULE_ALPHA_NUMERIC=14;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_DOUBLE_DOLLAR_ID=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SIGNED_REAL_ID=11;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalVampireLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVampireLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVampireLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVampireLanguage.g"; }


    	private VampireLanguageGrammarAccess grammarAccess;

    	public void setGrammarAccess(VampireLanguageGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleVampireModel"
    // InternalVampireLanguage.g:53:1: entryRuleVampireModel : ruleVampireModel EOF ;
    public final void entryRuleVampireModel() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:54:1: ( ruleVampireModel EOF )
            // InternalVampireLanguage.g:55:1: ruleVampireModel EOF
            {
             before(grammarAccess.getVampireModelRule()); 
            pushFollow(FOLLOW_1);
            ruleVampireModel();

            state._fsp--;

             after(grammarAccess.getVampireModelRule()); 
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
    // $ANTLR end "entryRuleVampireModel"


    // $ANTLR start "ruleVampireModel"
    // InternalVampireLanguage.g:62:1: ruleVampireModel : ( ( rule__VampireModel__Alternatives )* ) ;
    public final void ruleVampireModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:66:2: ( ( ( rule__VampireModel__Alternatives )* ) )
            // InternalVampireLanguage.g:67:2: ( ( rule__VampireModel__Alternatives )* )
            {
            // InternalVampireLanguage.g:67:2: ( ( rule__VampireModel__Alternatives )* )
            // InternalVampireLanguage.g:68:3: ( rule__VampireModel__Alternatives )*
            {
             before(grammarAccess.getVampireModelAccess().getAlternatives()); 
            // InternalVampireLanguage.g:69:3: ( rule__VampireModel__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SINGLE_COMMENT||LA1_0==42) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVampireLanguage.g:69:4: rule__VampireModel__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__VampireModel__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getVampireModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVampireModel"


    // $ANTLR start "entryRuleVLSComment"
    // InternalVampireLanguage.g:78:1: entryRuleVLSComment : ruleVLSComment EOF ;
    public final void entryRuleVLSComment() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:79:1: ( ruleVLSComment EOF )
            // InternalVampireLanguage.g:80:1: ruleVLSComment EOF
            {
             before(grammarAccess.getVLSCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSComment();

            state._fsp--;

             after(grammarAccess.getVLSCommentRule()); 
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
    // $ANTLR end "entryRuleVLSComment"


    // $ANTLR start "ruleVLSComment"
    // InternalVampireLanguage.g:87:1: ruleVLSComment : ( ( rule__VLSComment__CommentAssignment ) ) ;
    public final void ruleVLSComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:91:2: ( ( ( rule__VLSComment__CommentAssignment ) ) )
            // InternalVampireLanguage.g:92:2: ( ( rule__VLSComment__CommentAssignment ) )
            {
            // InternalVampireLanguage.g:92:2: ( ( rule__VLSComment__CommentAssignment ) )
            // InternalVampireLanguage.g:93:3: ( rule__VLSComment__CommentAssignment )
            {
             before(grammarAccess.getVLSCommentAccess().getCommentAssignment()); 
            // InternalVampireLanguage.g:94:3: ( rule__VLSComment__CommentAssignment )
            // InternalVampireLanguage.g:94:4: rule__VLSComment__CommentAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VLSComment__CommentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVLSCommentAccess().getCommentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSComment"


    // $ANTLR start "entryRuleVLSFofFormula"
    // InternalVampireLanguage.g:103:1: entryRuleVLSFofFormula : ruleVLSFofFormula EOF ;
    public final void entryRuleVLSFofFormula() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:104:1: ( ruleVLSFofFormula EOF )
            // InternalVampireLanguage.g:105:1: ruleVLSFofFormula EOF
            {
             before(grammarAccess.getVLSFofFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSFofFormula();

            state._fsp--;

             after(grammarAccess.getVLSFofFormulaRule()); 
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
    // $ANTLR end "entryRuleVLSFofFormula"


    // $ANTLR start "ruleVLSFofFormula"
    // InternalVampireLanguage.g:112:1: ruleVLSFofFormula : ( ( rule__VLSFofFormula__Group__0 ) ) ;
    public final void ruleVLSFofFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:116:2: ( ( ( rule__VLSFofFormula__Group__0 ) ) )
            // InternalVampireLanguage.g:117:2: ( ( rule__VLSFofFormula__Group__0 ) )
            {
            // InternalVampireLanguage.g:117:2: ( ( rule__VLSFofFormula__Group__0 ) )
            // InternalVampireLanguage.g:118:3: ( rule__VLSFofFormula__Group__0 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getGroup()); 
            // InternalVampireLanguage.g:119:3: ( rule__VLSFofFormula__Group__0 )
            // InternalVampireLanguage.g:119:4: rule__VLSFofFormula__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSFofFormulaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSFofFormula"


    // $ANTLR start "entryRuleVLSRole"
    // InternalVampireLanguage.g:128:1: entryRuleVLSRole : ruleVLSRole EOF ;
    public final void entryRuleVLSRole() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:129:1: ( ruleVLSRole EOF )
            // InternalVampireLanguage.g:130:1: ruleVLSRole EOF
            {
             before(grammarAccess.getVLSRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSRole();

            state._fsp--;

             after(grammarAccess.getVLSRoleRule()); 
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
    // $ANTLR end "entryRuleVLSRole"


    // $ANTLR start "ruleVLSRole"
    // InternalVampireLanguage.g:137:1: ruleVLSRole : ( ( rule__VLSRole__Alternatives ) ) ;
    public final void ruleVLSRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:141:2: ( ( ( rule__VLSRole__Alternatives ) ) )
            // InternalVampireLanguage.g:142:2: ( ( rule__VLSRole__Alternatives ) )
            {
            // InternalVampireLanguage.g:142:2: ( ( rule__VLSRole__Alternatives ) )
            // InternalVampireLanguage.g:143:3: ( rule__VLSRole__Alternatives )
            {
             before(grammarAccess.getVLSRoleAccess().getAlternatives()); 
            // InternalVampireLanguage.g:144:3: ( rule__VLSRole__Alternatives )
            // InternalVampireLanguage.g:144:4: rule__VLSRole__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VLSRole__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVLSRoleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSRole"


    // $ANTLR start "entryRuleVLSAxiom"
    // InternalVampireLanguage.g:153:1: entryRuleVLSAxiom : ruleVLSAxiom EOF ;
    public final void entryRuleVLSAxiom() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:154:1: ( ruleVLSAxiom EOF )
            // InternalVampireLanguage.g:155:1: ruleVLSAxiom EOF
            {
             before(grammarAccess.getVLSAxiomRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSAxiom();

            state._fsp--;

             after(grammarAccess.getVLSAxiomRule()); 
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
    // $ANTLR end "entryRuleVLSAxiom"


    // $ANTLR start "ruleVLSAxiom"
    // InternalVampireLanguage.g:162:1: ruleVLSAxiom : ( 'axiom' ) ;
    public final void ruleVLSAxiom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:166:2: ( ( 'axiom' ) )
            // InternalVampireLanguage.g:167:2: ( 'axiom' )
            {
            // InternalVampireLanguage.g:167:2: ( 'axiom' )
            // InternalVampireLanguage.g:168:3: 'axiom'
            {
             before(grammarAccess.getVLSAxiomAccess().getAxiomKeyword()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVLSAxiomAccess().getAxiomKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSAxiom"


    // $ANTLR start "entryRuleVLSConjecture"
    // InternalVampireLanguage.g:178:1: entryRuleVLSConjecture : ruleVLSConjecture EOF ;
    public final void entryRuleVLSConjecture() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:179:1: ( ruleVLSConjecture EOF )
            // InternalVampireLanguage.g:180:1: ruleVLSConjecture EOF
            {
             before(grammarAccess.getVLSConjectureRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSConjecture();

            state._fsp--;

             after(grammarAccess.getVLSConjectureRule()); 
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
    // $ANTLR end "entryRuleVLSConjecture"


    // $ANTLR start "ruleVLSConjecture"
    // InternalVampireLanguage.g:187:1: ruleVLSConjecture : ( 'conjecture' ) ;
    public final void ruleVLSConjecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:191:2: ( ( 'conjecture' ) )
            // InternalVampireLanguage.g:192:2: ( 'conjecture' )
            {
            // InternalVampireLanguage.g:192:2: ( 'conjecture' )
            // InternalVampireLanguage.g:193:3: 'conjecture'
            {
             before(grammarAccess.getVLSConjectureAccess().getConjectureKeyword()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVLSConjectureAccess().getConjectureKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSConjecture"


    // $ANTLR start "entryRuleVLSHypothesis"
    // InternalVampireLanguage.g:203:1: entryRuleVLSHypothesis : ruleVLSHypothesis EOF ;
    public final void entryRuleVLSHypothesis() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:204:1: ( ruleVLSHypothesis EOF )
            // InternalVampireLanguage.g:205:1: ruleVLSHypothesis EOF
            {
             before(grammarAccess.getVLSHypothesisRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSHypothesis();

            state._fsp--;

             after(grammarAccess.getVLSHypothesisRule()); 
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
    // $ANTLR end "entryRuleVLSHypothesis"


    // $ANTLR start "ruleVLSHypothesis"
    // InternalVampireLanguage.g:212:1: ruleVLSHypothesis : ( 'hypothesis' ) ;
    public final void ruleVLSHypothesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:216:2: ( ( 'hypothesis' ) )
            // InternalVampireLanguage.g:217:2: ( 'hypothesis' )
            {
            // InternalVampireLanguage.g:217:2: ( 'hypothesis' )
            // InternalVampireLanguage.g:218:3: 'hypothesis'
            {
             before(grammarAccess.getVLSHypothesisAccess().getHypothesisKeyword()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVLSHypothesisAccess().getHypothesisKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSHypothesis"


    // $ANTLR start "entryRuleVLSDefinition"
    // InternalVampireLanguage.g:228:1: entryRuleVLSDefinition : ruleVLSDefinition EOF ;
    public final void entryRuleVLSDefinition() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:229:1: ( ruleVLSDefinition EOF )
            // InternalVampireLanguage.g:230:1: ruleVLSDefinition EOF
            {
             before(grammarAccess.getVLSDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSDefinition();

            state._fsp--;

             after(grammarAccess.getVLSDefinitionRule()); 
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
    // $ANTLR end "entryRuleVLSDefinition"


    // $ANTLR start "ruleVLSDefinition"
    // InternalVampireLanguage.g:237:1: ruleVLSDefinition : ( 'definition' ) ;
    public final void ruleVLSDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:241:2: ( ( 'definition' ) )
            // InternalVampireLanguage.g:242:2: ( 'definition' )
            {
            // InternalVampireLanguage.g:242:2: ( 'definition' )
            // InternalVampireLanguage.g:243:3: 'definition'
            {
             before(grammarAccess.getVLSDefinitionAccess().getDefinitionKeyword()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVLSDefinitionAccess().getDefinitionKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSDefinition"


    // $ANTLR start "entryRuleVLSAssumption"
    // InternalVampireLanguage.g:253:1: entryRuleVLSAssumption : ruleVLSAssumption EOF ;
    public final void entryRuleVLSAssumption() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:254:1: ( ruleVLSAssumption EOF )
            // InternalVampireLanguage.g:255:1: ruleVLSAssumption EOF
            {
             before(grammarAccess.getVLSAssumptionRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSAssumption();

            state._fsp--;

             after(grammarAccess.getVLSAssumptionRule()); 
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
    // $ANTLR end "entryRuleVLSAssumption"


    // $ANTLR start "ruleVLSAssumption"
    // InternalVampireLanguage.g:262:1: ruleVLSAssumption : ( 'assumption' ) ;
    public final void ruleVLSAssumption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:266:2: ( ( 'assumption' ) )
            // InternalVampireLanguage.g:267:2: ( 'assumption' )
            {
            // InternalVampireLanguage.g:267:2: ( 'assumption' )
            // InternalVampireLanguage.g:268:3: 'assumption'
            {
             before(grammarAccess.getVLSAssumptionAccess().getAssumptionKeyword()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVLSAssumptionAccess().getAssumptionKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSAssumption"


    // $ANTLR start "entryRuleVLSLemma"
    // InternalVampireLanguage.g:278:1: entryRuleVLSLemma : ruleVLSLemma EOF ;
    public final void entryRuleVLSLemma() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:279:1: ( ruleVLSLemma EOF )
            // InternalVampireLanguage.g:280:1: ruleVLSLemma EOF
            {
             before(grammarAccess.getVLSLemmaRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSLemma();

            state._fsp--;

             after(grammarAccess.getVLSLemmaRule()); 
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
    // $ANTLR end "entryRuleVLSLemma"


    // $ANTLR start "ruleVLSLemma"
    // InternalVampireLanguage.g:287:1: ruleVLSLemma : ( 'lemma' ) ;
    public final void ruleVLSLemma() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:291:2: ( ( 'lemma' ) )
            // InternalVampireLanguage.g:292:2: ( 'lemma' )
            {
            // InternalVampireLanguage.g:292:2: ( 'lemma' )
            // InternalVampireLanguage.g:293:3: 'lemma'
            {
             before(grammarAccess.getVLSLemmaAccess().getLemmaKeyword()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVLSLemmaAccess().getLemmaKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSLemma"


    // $ANTLR start "entryRuleVLSTheorem"
    // InternalVampireLanguage.g:303:1: entryRuleVLSTheorem : ruleVLSTheorem EOF ;
    public final void entryRuleVLSTheorem() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:304:1: ( ruleVLSTheorem EOF )
            // InternalVampireLanguage.g:305:1: ruleVLSTheorem EOF
            {
             before(grammarAccess.getVLSTheoremRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSTheorem();

            state._fsp--;

             after(grammarAccess.getVLSTheoremRule()); 
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
    // $ANTLR end "entryRuleVLSTheorem"


    // $ANTLR start "ruleVLSTheorem"
    // InternalVampireLanguage.g:312:1: ruleVLSTheorem : ( 'theorem' ) ;
    public final void ruleVLSTheorem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:316:2: ( ( 'theorem' ) )
            // InternalVampireLanguage.g:317:2: ( 'theorem' )
            {
            // InternalVampireLanguage.g:317:2: ( 'theorem' )
            // InternalVampireLanguage.g:318:3: 'theorem'
            {
             before(grammarAccess.getVLSTheoremAccess().getTheoremKeyword()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVLSTheoremAccess().getTheoremKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSTheorem"


    // $ANTLR start "entryRuleVLSCorollary"
    // InternalVampireLanguage.g:328:1: entryRuleVLSCorollary : ruleVLSCorollary EOF ;
    public final void entryRuleVLSCorollary() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:329:1: ( ruleVLSCorollary EOF )
            // InternalVampireLanguage.g:330:1: ruleVLSCorollary EOF
            {
             before(grammarAccess.getVLSCorollaryRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSCorollary();

            state._fsp--;

             after(grammarAccess.getVLSCorollaryRule()); 
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
    // $ANTLR end "entryRuleVLSCorollary"


    // $ANTLR start "ruleVLSCorollary"
    // InternalVampireLanguage.g:337:1: ruleVLSCorollary : ( 'corollary' ) ;
    public final void ruleVLSCorollary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:341:2: ( ( 'corollary' ) )
            // InternalVampireLanguage.g:342:2: ( 'corollary' )
            {
            // InternalVampireLanguage.g:342:2: ( 'corollary' )
            // InternalVampireLanguage.g:343:3: 'corollary'
            {
             before(grammarAccess.getVLSCorollaryAccess().getCorollaryKeyword()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVLSCorollaryAccess().getCorollaryKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSCorollary"


    // $ANTLR start "entryRuleVLSNegated_Conjecture"
    // InternalVampireLanguage.g:353:1: entryRuleVLSNegated_Conjecture : ruleVLSNegated_Conjecture EOF ;
    public final void entryRuleVLSNegated_Conjecture() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:354:1: ( ruleVLSNegated_Conjecture EOF )
            // InternalVampireLanguage.g:355:1: ruleVLSNegated_Conjecture EOF
            {
             before(grammarAccess.getVLSNegated_ConjectureRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSNegated_Conjecture();

            state._fsp--;

             after(grammarAccess.getVLSNegated_ConjectureRule()); 
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
    // $ANTLR end "entryRuleVLSNegated_Conjecture"


    // $ANTLR start "ruleVLSNegated_Conjecture"
    // InternalVampireLanguage.g:362:1: ruleVLSNegated_Conjecture : ( 'negated_conjecture' ) ;
    public final void ruleVLSNegated_Conjecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:366:2: ( ( 'negated_conjecture' ) )
            // InternalVampireLanguage.g:367:2: ( 'negated_conjecture' )
            {
            // InternalVampireLanguage.g:367:2: ( 'negated_conjecture' )
            // InternalVampireLanguage.g:368:3: 'negated_conjecture'
            {
             before(grammarAccess.getVLSNegated_ConjectureAccess().getNegated_conjectureKeyword()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVLSNegated_ConjectureAccess().getNegated_conjectureKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSNegated_Conjecture"


    // $ANTLR start "entryRuleVLSPlain"
    // InternalVampireLanguage.g:378:1: entryRuleVLSPlain : ruleVLSPlain EOF ;
    public final void entryRuleVLSPlain() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:379:1: ( ruleVLSPlain EOF )
            // InternalVampireLanguage.g:380:1: ruleVLSPlain EOF
            {
             before(grammarAccess.getVLSPlainRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSPlain();

            state._fsp--;

             after(grammarAccess.getVLSPlainRule()); 
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
    // $ANTLR end "entryRuleVLSPlain"


    // $ANTLR start "ruleVLSPlain"
    // InternalVampireLanguage.g:387:1: ruleVLSPlain : ( 'plain' ) ;
    public final void ruleVLSPlain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:391:2: ( ( 'plain' ) )
            // InternalVampireLanguage.g:392:2: ( 'plain' )
            {
            // InternalVampireLanguage.g:392:2: ( 'plain' )
            // InternalVampireLanguage.g:393:3: 'plain'
            {
             before(grammarAccess.getVLSPlainAccess().getPlainKeyword()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVLSPlainAccess().getPlainKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSPlain"


    // $ANTLR start "entryRuleVLSType"
    // InternalVampireLanguage.g:403:1: entryRuleVLSType : ruleVLSType EOF ;
    public final void entryRuleVLSType() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:404:1: ( ruleVLSType EOF )
            // InternalVampireLanguage.g:405:1: ruleVLSType EOF
            {
             before(grammarAccess.getVLSTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSType();

            state._fsp--;

             after(grammarAccess.getVLSTypeRule()); 
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
    // $ANTLR end "entryRuleVLSType"


    // $ANTLR start "ruleVLSType"
    // InternalVampireLanguage.g:412:1: ruleVLSType : ( 'type' ) ;
    public final void ruleVLSType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:416:2: ( ( 'type' ) )
            // InternalVampireLanguage.g:417:2: ( 'type' )
            {
            // InternalVampireLanguage.g:417:2: ( 'type' )
            // InternalVampireLanguage.g:418:3: 'type'
            {
             before(grammarAccess.getVLSTypeAccess().getTypeKeyword()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVLSTypeAccess().getTypeKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSType"


    // $ANTLR start "entryRuleVLSFi_Domain"
    // InternalVampireLanguage.g:428:1: entryRuleVLSFi_Domain : ruleVLSFi_Domain EOF ;
    public final void entryRuleVLSFi_Domain() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:429:1: ( ruleVLSFi_Domain EOF )
            // InternalVampireLanguage.g:430:1: ruleVLSFi_Domain EOF
            {
             before(grammarAccess.getVLSFi_DomainRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSFi_Domain();

            state._fsp--;

             after(grammarAccess.getVLSFi_DomainRule()); 
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
    // $ANTLR end "entryRuleVLSFi_Domain"


    // $ANTLR start "ruleVLSFi_Domain"
    // InternalVampireLanguage.g:437:1: ruleVLSFi_Domain : ( 'fi_domain' ) ;
    public final void ruleVLSFi_Domain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:441:2: ( ( 'fi_domain' ) )
            // InternalVampireLanguage.g:442:2: ( 'fi_domain' )
            {
            // InternalVampireLanguage.g:442:2: ( 'fi_domain' )
            // InternalVampireLanguage.g:443:3: 'fi_domain'
            {
             before(grammarAccess.getVLSFi_DomainAccess().getFi_domainKeyword()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVLSFi_DomainAccess().getFi_domainKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSFi_Domain"


    // $ANTLR start "entryRuleVLSFi_Functors"
    // InternalVampireLanguage.g:453:1: entryRuleVLSFi_Functors : ruleVLSFi_Functors EOF ;
    public final void entryRuleVLSFi_Functors() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:454:1: ( ruleVLSFi_Functors EOF )
            // InternalVampireLanguage.g:455:1: ruleVLSFi_Functors EOF
            {
             before(grammarAccess.getVLSFi_FunctorsRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSFi_Functors();

            state._fsp--;

             after(grammarAccess.getVLSFi_FunctorsRule()); 
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
    // $ANTLR end "entryRuleVLSFi_Functors"


    // $ANTLR start "ruleVLSFi_Functors"
    // InternalVampireLanguage.g:462:1: ruleVLSFi_Functors : ( 'fi_functors' ) ;
    public final void ruleVLSFi_Functors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:466:2: ( ( 'fi_functors' ) )
            // InternalVampireLanguage.g:467:2: ( 'fi_functors' )
            {
            // InternalVampireLanguage.g:467:2: ( 'fi_functors' )
            // InternalVampireLanguage.g:468:3: 'fi_functors'
            {
             before(grammarAccess.getVLSFi_FunctorsAccess().getFi_functorsKeyword()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVLSFi_FunctorsAccess().getFi_functorsKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSFi_Functors"


    // $ANTLR start "entryRuleVLSFi_Predicates"
    // InternalVampireLanguage.g:478:1: entryRuleVLSFi_Predicates : ruleVLSFi_Predicates EOF ;
    public final void entryRuleVLSFi_Predicates() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:479:1: ( ruleVLSFi_Predicates EOF )
            // InternalVampireLanguage.g:480:1: ruleVLSFi_Predicates EOF
            {
             before(grammarAccess.getVLSFi_PredicatesRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSFi_Predicates();

            state._fsp--;

             after(grammarAccess.getVLSFi_PredicatesRule()); 
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
    // $ANTLR end "entryRuleVLSFi_Predicates"


    // $ANTLR start "ruleVLSFi_Predicates"
    // InternalVampireLanguage.g:487:1: ruleVLSFi_Predicates : ( 'fi_predicates' ) ;
    public final void ruleVLSFi_Predicates() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:491:2: ( ( 'fi_predicates' ) )
            // InternalVampireLanguage.g:492:2: ( 'fi_predicates' )
            {
            // InternalVampireLanguage.g:492:2: ( 'fi_predicates' )
            // InternalVampireLanguage.g:493:3: 'fi_predicates'
            {
             before(grammarAccess.getVLSFi_PredicatesAccess().getFi_predicatesKeyword()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVLSFi_PredicatesAccess().getFi_predicatesKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSFi_Predicates"


    // $ANTLR start "entryRuleVLSUnknown"
    // InternalVampireLanguage.g:503:1: entryRuleVLSUnknown : ruleVLSUnknown EOF ;
    public final void entryRuleVLSUnknown() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:504:1: ( ruleVLSUnknown EOF )
            // InternalVampireLanguage.g:505:1: ruleVLSUnknown EOF
            {
             before(grammarAccess.getVLSUnknownRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSUnknown();

            state._fsp--;

             after(grammarAccess.getVLSUnknownRule()); 
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
    // $ANTLR end "entryRuleVLSUnknown"


    // $ANTLR start "ruleVLSUnknown"
    // InternalVampireLanguage.g:512:1: ruleVLSUnknown : ( 'unknown' ) ;
    public final void ruleVLSUnknown() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:516:2: ( ( 'unknown' ) )
            // InternalVampireLanguage.g:517:2: ( 'unknown' )
            {
            // InternalVampireLanguage.g:517:2: ( 'unknown' )
            // InternalVampireLanguage.g:518:3: 'unknown'
            {
             before(grammarAccess.getVLSUnknownAccess().getUnknownKeyword()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVLSUnknownAccess().getUnknownKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSUnknown"


    // $ANTLR start "entryRuleVLSAnnotation"
    // InternalVampireLanguage.g:528:1: entryRuleVLSAnnotation : ruleVLSAnnotation EOF ;
    public final void entryRuleVLSAnnotation() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:529:1: ( ruleVLSAnnotation EOF )
            // InternalVampireLanguage.g:530:1: ruleVLSAnnotation EOF
            {
             before(grammarAccess.getVLSAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSAnnotation();

            state._fsp--;

             after(grammarAccess.getVLSAnnotationRule()); 
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
    // $ANTLR end "entryRuleVLSAnnotation"


    // $ANTLR start "ruleVLSAnnotation"
    // InternalVampireLanguage.g:537:1: ruleVLSAnnotation : ( ( rule__VLSAnnotation__Group__0 ) ) ;
    public final void ruleVLSAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:541:2: ( ( ( rule__VLSAnnotation__Group__0 ) ) )
            // InternalVampireLanguage.g:542:2: ( ( rule__VLSAnnotation__Group__0 ) )
            {
            // InternalVampireLanguage.g:542:2: ( ( rule__VLSAnnotation__Group__0 ) )
            // InternalVampireLanguage.g:543:3: ( rule__VLSAnnotation__Group__0 )
            {
             before(grammarAccess.getVLSAnnotationAccess().getGroup()); 
            // InternalVampireLanguage.g:544:3: ( rule__VLSAnnotation__Group__0 )
            // InternalVampireLanguage.g:544:4: rule__VLSAnnotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSAnnotation"


    // $ANTLR start "entryRuleVLSAnnotationTerms"
    // InternalVampireLanguage.g:553:1: entryRuleVLSAnnotationTerms : ruleVLSAnnotationTerms EOF ;
    public final void entryRuleVLSAnnotationTerms() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:554:1: ( ruleVLSAnnotationTerms EOF )
            // InternalVampireLanguage.g:555:1: ruleVLSAnnotationTerms EOF
            {
             before(grammarAccess.getVLSAnnotationTermsRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSAnnotationTerms();

            state._fsp--;

             after(grammarAccess.getVLSAnnotationTermsRule()); 
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
    // $ANTLR end "entryRuleVLSAnnotationTerms"


    // $ANTLR start "ruleVLSAnnotationTerms"
    // InternalVampireLanguage.g:562:1: ruleVLSAnnotationTerms : ( ( rule__VLSAnnotationTerms__Group__0 ) ) ;
    public final void ruleVLSAnnotationTerms() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:566:2: ( ( ( rule__VLSAnnotationTerms__Group__0 ) ) )
            // InternalVampireLanguage.g:567:2: ( ( rule__VLSAnnotationTerms__Group__0 ) )
            {
            // InternalVampireLanguage.g:567:2: ( ( rule__VLSAnnotationTerms__Group__0 ) )
            // InternalVampireLanguage.g:568:3: ( rule__VLSAnnotationTerms__Group__0 )
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getGroup()); 
            // InternalVampireLanguage.g:569:3: ( rule__VLSAnnotationTerms__Group__0 )
            // InternalVampireLanguage.g:569:4: rule__VLSAnnotationTerms__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSAnnotationTerms__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSAnnotationTermsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSAnnotationTerms"


    // $ANTLR start "entryRuleVLSTerm"
    // InternalVampireLanguage.g:578:1: entryRuleVLSTerm : ruleVLSTerm EOF ;
    public final void entryRuleVLSTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:579:1: ( ruleVLSTerm EOF )
            // InternalVampireLanguage.g:580:1: ruleVLSTerm EOF
            {
             before(grammarAccess.getVLSTermRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSTerm();

            state._fsp--;

             after(grammarAccess.getVLSTermRule()); 
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
    // $ANTLR end "entryRuleVLSTerm"


    // $ANTLR start "ruleVLSTerm"
    // InternalVampireLanguage.g:587:1: ruleVLSTerm : ( ruleVLSBinary ) ;
    public final void ruleVLSTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:591:2: ( ( ruleVLSBinary ) )
            // InternalVampireLanguage.g:592:2: ( ruleVLSBinary )
            {
            // InternalVampireLanguage.g:592:2: ( ruleVLSBinary )
            // InternalVampireLanguage.g:593:3: ruleVLSBinary
            {
             before(grammarAccess.getVLSTermAccess().getVLSBinaryParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleVLSBinary();

            state._fsp--;

             after(grammarAccess.getVLSTermAccess().getVLSBinaryParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSTerm"


    // $ANTLR start "entryRuleVLSBinary"
    // InternalVampireLanguage.g:603:1: entryRuleVLSBinary : ruleVLSBinary EOF ;
    public final void entryRuleVLSBinary() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:604:1: ( ruleVLSBinary EOF )
            // InternalVampireLanguage.g:605:1: ruleVLSBinary EOF
            {
             before(grammarAccess.getVLSBinaryRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSBinary();

            state._fsp--;

             after(grammarAccess.getVLSBinaryRule()); 
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
    // $ANTLR end "entryRuleVLSBinary"


    // $ANTLR start "ruleVLSBinary"
    // InternalVampireLanguage.g:612:1: ruleVLSBinary : ( ( rule__VLSBinary__Group__0 ) ) ;
    public final void ruleVLSBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:616:2: ( ( ( rule__VLSBinary__Group__0 ) ) )
            // InternalVampireLanguage.g:617:2: ( ( rule__VLSBinary__Group__0 ) )
            {
            // InternalVampireLanguage.g:617:2: ( ( rule__VLSBinary__Group__0 ) )
            // InternalVampireLanguage.g:618:3: ( rule__VLSBinary__Group__0 )
            {
             before(grammarAccess.getVLSBinaryAccess().getGroup()); 
            // InternalVampireLanguage.g:619:3: ( rule__VLSBinary__Group__0 )
            // InternalVampireLanguage.g:619:4: rule__VLSBinary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSBinaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSBinary"


    // $ANTLR start "entryRuleVLSUnitaryFormula"
    // InternalVampireLanguage.g:628:1: entryRuleVLSUnitaryFormula : ruleVLSUnitaryFormula EOF ;
    public final void entryRuleVLSUnitaryFormula() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:629:1: ( ruleVLSUnitaryFormula EOF )
            // InternalVampireLanguage.g:630:1: ruleVLSUnitaryFormula EOF
            {
             before(grammarAccess.getVLSUnitaryFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSUnitaryFormula();

            state._fsp--;

             after(grammarAccess.getVLSUnitaryFormulaRule()); 
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
    // $ANTLR end "entryRuleVLSUnitaryFormula"


    // $ANTLR start "ruleVLSUnitaryFormula"
    // InternalVampireLanguage.g:637:1: ruleVLSUnitaryFormula : ( ( rule__VLSUnitaryFormula__Alternatives ) ) ;
    public final void ruleVLSUnitaryFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:641:2: ( ( ( rule__VLSUnitaryFormula__Alternatives ) ) )
            // InternalVampireLanguage.g:642:2: ( ( rule__VLSUnitaryFormula__Alternatives ) )
            {
            // InternalVampireLanguage.g:642:2: ( ( rule__VLSUnitaryFormula__Alternatives ) )
            // InternalVampireLanguage.g:643:3: ( rule__VLSUnitaryFormula__Alternatives )
            {
             before(grammarAccess.getVLSUnitaryFormulaAccess().getAlternatives()); 
            // InternalVampireLanguage.g:644:3: ( rule__VLSUnitaryFormula__Alternatives )
            // InternalVampireLanguage.g:644:4: rule__VLSUnitaryFormula__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnitaryFormula__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVLSUnitaryFormulaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSUnitaryFormula"


    // $ANTLR start "entryRuleVLSUniversalQuantifier"
    // InternalVampireLanguage.g:653:1: entryRuleVLSUniversalQuantifier : ruleVLSUniversalQuantifier EOF ;
    public final void entryRuleVLSUniversalQuantifier() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:654:1: ( ruleVLSUniversalQuantifier EOF )
            // InternalVampireLanguage.g:655:1: ruleVLSUniversalQuantifier EOF
            {
             before(grammarAccess.getVLSUniversalQuantifierRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSUniversalQuantifier();

            state._fsp--;

             after(grammarAccess.getVLSUniversalQuantifierRule()); 
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
    // $ANTLR end "entryRuleVLSUniversalQuantifier"


    // $ANTLR start "ruleVLSUniversalQuantifier"
    // InternalVampireLanguage.g:662:1: ruleVLSUniversalQuantifier : ( ( rule__VLSUniversalQuantifier__Group__0 ) ) ;
    public final void ruleVLSUniversalQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:666:2: ( ( ( rule__VLSUniversalQuantifier__Group__0 ) ) )
            // InternalVampireLanguage.g:667:2: ( ( rule__VLSUniversalQuantifier__Group__0 ) )
            {
            // InternalVampireLanguage.g:667:2: ( ( rule__VLSUniversalQuantifier__Group__0 ) )
            // InternalVampireLanguage.g:668:3: ( rule__VLSUniversalQuantifier__Group__0 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup()); 
            // InternalVampireLanguage.g:669:3: ( rule__VLSUniversalQuantifier__Group__0 )
            // InternalVampireLanguage.g:669:4: rule__VLSUniversalQuantifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSUniversalQuantifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSUniversalQuantifier"


    // $ANTLR start "entryRuleVLSExistentialQuantifier"
    // InternalVampireLanguage.g:678:1: entryRuleVLSExistentialQuantifier : ruleVLSExistentialQuantifier EOF ;
    public final void entryRuleVLSExistentialQuantifier() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:679:1: ( ruleVLSExistentialQuantifier EOF )
            // InternalVampireLanguage.g:680:1: ruleVLSExistentialQuantifier EOF
            {
             before(grammarAccess.getVLSExistentialQuantifierRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSExistentialQuantifier();

            state._fsp--;

             after(grammarAccess.getVLSExistentialQuantifierRule()); 
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
    // $ANTLR end "entryRuleVLSExistentialQuantifier"


    // $ANTLR start "ruleVLSExistentialQuantifier"
    // InternalVampireLanguage.g:687:1: ruleVLSExistentialQuantifier : ( ( rule__VLSExistentialQuantifier__Group__0 ) ) ;
    public final void ruleVLSExistentialQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:691:2: ( ( ( rule__VLSExistentialQuantifier__Group__0 ) ) )
            // InternalVampireLanguage.g:692:2: ( ( rule__VLSExistentialQuantifier__Group__0 ) )
            {
            // InternalVampireLanguage.g:692:2: ( ( rule__VLSExistentialQuantifier__Group__0 ) )
            // InternalVampireLanguage.g:693:3: ( rule__VLSExistentialQuantifier__Group__0 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup()); 
            // InternalVampireLanguage.g:694:3: ( rule__VLSExistentialQuantifier__Group__0 )
            // InternalVampireLanguage.g:694:4: rule__VLSExistentialQuantifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSExistentialQuantifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSExistentialQuantifier"


    // $ANTLR start "entryRuleVLSUnaryNegation"
    // InternalVampireLanguage.g:703:1: entryRuleVLSUnaryNegation : ruleVLSUnaryNegation EOF ;
    public final void entryRuleVLSUnaryNegation() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:704:1: ( ruleVLSUnaryNegation EOF )
            // InternalVampireLanguage.g:705:1: ruleVLSUnaryNegation EOF
            {
             before(grammarAccess.getVLSUnaryNegationRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSUnaryNegation();

            state._fsp--;

             after(grammarAccess.getVLSUnaryNegationRule()); 
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
    // $ANTLR end "entryRuleVLSUnaryNegation"


    // $ANTLR start "ruleVLSUnaryNegation"
    // InternalVampireLanguage.g:712:1: ruleVLSUnaryNegation : ( ( rule__VLSUnaryNegation__Group__0 ) ) ;
    public final void ruleVLSUnaryNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:716:2: ( ( ( rule__VLSUnaryNegation__Group__0 ) ) )
            // InternalVampireLanguage.g:717:2: ( ( rule__VLSUnaryNegation__Group__0 ) )
            {
            // InternalVampireLanguage.g:717:2: ( ( rule__VLSUnaryNegation__Group__0 ) )
            // InternalVampireLanguage.g:718:3: ( rule__VLSUnaryNegation__Group__0 )
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getGroup()); 
            // InternalVampireLanguage.g:719:3: ( rule__VLSUnaryNegation__Group__0 )
            // InternalVampireLanguage.g:719:4: rule__VLSUnaryNegation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnaryNegation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSUnaryNegationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSUnaryNegation"


    // $ANTLR start "entryRuleVLSUnaryInfix"
    // InternalVampireLanguage.g:728:1: entryRuleVLSUnaryInfix : ruleVLSUnaryInfix EOF ;
    public final void entryRuleVLSUnaryInfix() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:729:1: ( ruleVLSUnaryInfix EOF )
            // InternalVampireLanguage.g:730:1: ruleVLSUnaryInfix EOF
            {
             before(grammarAccess.getVLSUnaryInfixRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSUnaryInfix();

            state._fsp--;

             after(grammarAccess.getVLSUnaryInfixRule()); 
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
    // $ANTLR end "entryRuleVLSUnaryInfix"


    // $ANTLR start "ruleVLSUnaryInfix"
    // InternalVampireLanguage.g:737:1: ruleVLSUnaryInfix : ( ( rule__VLSUnaryInfix__Group__0 ) ) ;
    public final void ruleVLSUnaryInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:741:2: ( ( ( rule__VLSUnaryInfix__Group__0 ) ) )
            // InternalVampireLanguage.g:742:2: ( ( rule__VLSUnaryInfix__Group__0 ) )
            {
            // InternalVampireLanguage.g:742:2: ( ( rule__VLSUnaryInfix__Group__0 ) )
            // InternalVampireLanguage.g:743:3: ( rule__VLSUnaryInfix__Group__0 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getGroup()); 
            // InternalVampireLanguage.g:744:3: ( rule__VLSUnaryInfix__Group__0 )
            // InternalVampireLanguage.g:744:4: rule__VLSUnaryInfix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnaryInfix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSUnaryInfixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSUnaryInfix"


    // $ANTLR start "entryRuleVLSAtomic"
    // InternalVampireLanguage.g:753:1: entryRuleVLSAtomic : ruleVLSAtomic EOF ;
    public final void entryRuleVLSAtomic() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:754:1: ( ruleVLSAtomic EOF )
            // InternalVampireLanguage.g:755:1: ruleVLSAtomic EOF
            {
             before(grammarAccess.getVLSAtomicRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSAtomic();

            state._fsp--;

             after(grammarAccess.getVLSAtomicRule()); 
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
    // $ANTLR end "entryRuleVLSAtomic"


    // $ANTLR start "ruleVLSAtomic"
    // InternalVampireLanguage.g:762:1: ruleVLSAtomic : ( ( rule__VLSAtomic__Alternatives ) ) ;
    public final void ruleVLSAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:766:2: ( ( ( rule__VLSAtomic__Alternatives ) ) )
            // InternalVampireLanguage.g:767:2: ( ( rule__VLSAtomic__Alternatives ) )
            {
            // InternalVampireLanguage.g:767:2: ( ( rule__VLSAtomic__Alternatives ) )
            // InternalVampireLanguage.g:768:3: ( rule__VLSAtomic__Alternatives )
            {
             before(grammarAccess.getVLSAtomicAccess().getAlternatives()); 
            // InternalVampireLanguage.g:769:3: ( rule__VLSAtomic__Alternatives )
            // InternalVampireLanguage.g:769:4: rule__VLSAtomic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVLSAtomicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSAtomic"


    // $ANTLR start "entryRuleVLSAtomicConstant"
    // InternalVampireLanguage.g:778:1: entryRuleVLSAtomicConstant : ruleVLSAtomicConstant EOF ;
    public final void entryRuleVLSAtomicConstant() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:779:1: ( ruleVLSAtomicConstant EOF )
            // InternalVampireLanguage.g:780:1: ruleVLSAtomicConstant EOF
            {
             before(grammarAccess.getVLSAtomicConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSAtomicConstant();

            state._fsp--;

             after(grammarAccess.getVLSAtomicConstantRule()); 
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
    // $ANTLR end "entryRuleVLSAtomicConstant"


    // $ANTLR start "ruleVLSAtomicConstant"
    // InternalVampireLanguage.g:787:1: ruleVLSAtomicConstant : ( ( rule__VLSAtomicConstant__Alternatives ) ) ;
    public final void ruleVLSAtomicConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:791:2: ( ( ( rule__VLSAtomicConstant__Alternatives ) ) )
            // InternalVampireLanguage.g:792:2: ( ( rule__VLSAtomicConstant__Alternatives ) )
            {
            // InternalVampireLanguage.g:792:2: ( ( rule__VLSAtomicConstant__Alternatives ) )
            // InternalVampireLanguage.g:793:3: ( rule__VLSAtomicConstant__Alternatives )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getAlternatives()); 
            // InternalVampireLanguage.g:794:3: ( rule__VLSAtomicConstant__Alternatives )
            // InternalVampireLanguage.g:794:4: rule__VLSAtomicConstant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicConstant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVLSAtomicConstantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSAtomicConstant"


    // $ANTLR start "entryRuleVLSAtomicFunction"
    // InternalVampireLanguage.g:803:1: entryRuleVLSAtomicFunction : ruleVLSAtomicFunction EOF ;
    public final void entryRuleVLSAtomicFunction() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:804:1: ( ruleVLSAtomicFunction EOF )
            // InternalVampireLanguage.g:805:1: ruleVLSAtomicFunction EOF
            {
             before(grammarAccess.getVLSAtomicFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSAtomicFunction();

            state._fsp--;

             after(grammarAccess.getVLSAtomicFunctionRule()); 
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
    // $ANTLR end "entryRuleVLSAtomicFunction"


    // $ANTLR start "ruleVLSAtomicFunction"
    // InternalVampireLanguage.g:812:1: ruleVLSAtomicFunction : ( ( rule__VLSAtomicFunction__Alternatives ) ) ;
    public final void ruleVLSAtomicFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:816:2: ( ( ( rule__VLSAtomicFunction__Alternatives ) ) )
            // InternalVampireLanguage.g:817:2: ( ( rule__VLSAtomicFunction__Alternatives ) )
            {
            // InternalVampireLanguage.g:817:2: ( ( rule__VLSAtomicFunction__Alternatives ) )
            // InternalVampireLanguage.g:818:3: ( rule__VLSAtomicFunction__Alternatives )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getAlternatives()); 
            // InternalVampireLanguage.g:819:3: ( rule__VLSAtomicFunction__Alternatives )
            // InternalVampireLanguage.g:819:4: rule__VLSAtomicFunction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVLSAtomicFunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSAtomicFunction"


    // $ANTLR start "entryRuleVLSFofTerm"
    // InternalVampireLanguage.g:828:1: entryRuleVLSFofTerm : ruleVLSFofTerm EOF ;
    public final void entryRuleVLSFofTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:829:1: ( ruleVLSFofTerm EOF )
            // InternalVampireLanguage.g:830:1: ruleVLSFofTerm EOF
            {
             before(grammarAccess.getVLSFofTermRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSFofTerm();

            state._fsp--;

             after(grammarAccess.getVLSFofTermRule()); 
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
    // $ANTLR end "entryRuleVLSFofTerm"


    // $ANTLR start "ruleVLSFofTerm"
    // InternalVampireLanguage.g:837:1: ruleVLSFofTerm : ( ( rule__VLSFofTerm__Alternatives ) ) ;
    public final void ruleVLSFofTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:841:2: ( ( ( rule__VLSFofTerm__Alternatives ) ) )
            // InternalVampireLanguage.g:842:2: ( ( rule__VLSFofTerm__Alternatives ) )
            {
            // InternalVampireLanguage.g:842:2: ( ( rule__VLSFofTerm__Alternatives ) )
            // InternalVampireLanguage.g:843:3: ( rule__VLSFofTerm__Alternatives )
            {
             before(grammarAccess.getVLSFofTermAccess().getAlternatives()); 
            // InternalVampireLanguage.g:844:3: ( rule__VLSFofTerm__Alternatives )
            // InternalVampireLanguage.g:844:4: rule__VLSFofTerm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VLSFofTerm__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVLSFofTermAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSFofTerm"


    // $ANTLR start "entryRuleVLSVariable"
    // InternalVampireLanguage.g:853:1: entryRuleVLSVariable : ruleVLSVariable EOF ;
    public final void entryRuleVLSVariable() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:854:1: ( ruleVLSVariable EOF )
            // InternalVampireLanguage.g:855:1: ruleVLSVariable EOF
            {
             before(grammarAccess.getVLSVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSVariable();

            state._fsp--;

             after(grammarAccess.getVLSVariableRule()); 
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
    // $ANTLR end "entryRuleVLSVariable"


    // $ANTLR start "ruleVLSVariable"
    // InternalVampireLanguage.g:862:1: ruleVLSVariable : ( ( rule__VLSVariable__NameAssignment ) ) ;
    public final void ruleVLSVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:866:2: ( ( ( rule__VLSVariable__NameAssignment ) ) )
            // InternalVampireLanguage.g:867:2: ( ( rule__VLSVariable__NameAssignment ) )
            {
            // InternalVampireLanguage.g:867:2: ( ( rule__VLSVariable__NameAssignment ) )
            // InternalVampireLanguage.g:868:3: ( rule__VLSVariable__NameAssignment )
            {
             before(grammarAccess.getVLSVariableAccess().getNameAssignment()); 
            // InternalVampireLanguage.g:869:3: ( rule__VLSVariable__NameAssignment )
            // InternalVampireLanguage.g:869:4: rule__VLSVariable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VLSVariable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVLSVariableAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSVariable"


    // $ANTLR start "entryRuleVLSFunctionFof"
    // InternalVampireLanguage.g:878:1: entryRuleVLSFunctionFof : ruleVLSFunctionFof EOF ;
    public final void entryRuleVLSFunctionFof() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:879:1: ( ruleVLSFunctionFof EOF )
            // InternalVampireLanguage.g:880:1: ruleVLSFunctionFof EOF
            {
             before(grammarAccess.getVLSFunctionFofRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSFunctionFof();

            state._fsp--;

             after(grammarAccess.getVLSFunctionFofRule()); 
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
    // $ANTLR end "entryRuleVLSFunctionFof"


    // $ANTLR start "ruleVLSFunctionFof"
    // InternalVampireLanguage.g:887:1: ruleVLSFunctionFof : ( ( rule__VLSFunctionFof__Group__0 ) ) ;
    public final void ruleVLSFunctionFof() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:891:2: ( ( ( rule__VLSFunctionFof__Group__0 ) ) )
            // InternalVampireLanguage.g:892:2: ( ( rule__VLSFunctionFof__Group__0 ) )
            {
            // InternalVampireLanguage.g:892:2: ( ( rule__VLSFunctionFof__Group__0 ) )
            // InternalVampireLanguage.g:893:3: ( rule__VLSFunctionFof__Group__0 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getGroup()); 
            // InternalVampireLanguage.g:894:3: ( rule__VLSFunctionFof__Group__0 )
            // InternalVampireLanguage.g:894:4: rule__VLSFunctionFof__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionFof__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSFunctionFofAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSFunctionFof"


    // $ANTLR start "entryRuleVLSDefinedTerm"
    // InternalVampireLanguage.g:903:1: entryRuleVLSDefinedTerm : ruleVLSDefinedTerm EOF ;
    public final void entryRuleVLSDefinedTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:904:1: ( ruleVLSDefinedTerm EOF )
            // InternalVampireLanguage.g:905:1: ruleVLSDefinedTerm EOF
            {
             before(grammarAccess.getVLSDefinedTermRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSDefinedTerm();

            state._fsp--;

             after(grammarAccess.getVLSDefinedTermRule()); 
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
    // $ANTLR end "entryRuleVLSDefinedTerm"


    // $ANTLR start "ruleVLSDefinedTerm"
    // InternalVampireLanguage.g:912:1: ruleVLSDefinedTerm : ( ( rule__VLSDefinedTerm__Alternatives ) ) ;
    public final void ruleVLSDefinedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:916:2: ( ( ( rule__VLSDefinedTerm__Alternatives ) ) )
            // InternalVampireLanguage.g:917:2: ( ( rule__VLSDefinedTerm__Alternatives ) )
            {
            // InternalVampireLanguage.g:917:2: ( ( rule__VLSDefinedTerm__Alternatives ) )
            // InternalVampireLanguage.g:918:3: ( rule__VLSDefinedTerm__Alternatives )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getAlternatives()); 
            // InternalVampireLanguage.g:919:3: ( rule__VLSDefinedTerm__Alternatives )
            // InternalVampireLanguage.g:919:4: rule__VLSDefinedTerm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VLSDefinedTerm__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVLSDefinedTermAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSDefinedTerm"


    // $ANTLR start "rule__VampireModel__Alternatives"
    // InternalVampireLanguage.g:927:1: rule__VampireModel__Alternatives : ( ( ( rule__VampireModel__CommentsAssignment_0 ) ) | ( ( rule__VampireModel__FormulasAssignment_1 ) ) );
    public final void rule__VampireModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:931:1: ( ( ( rule__VampireModel__CommentsAssignment_0 ) ) | ( ( rule__VampireModel__FormulasAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SINGLE_COMMENT) ) {
                alt2=1;
            }
            else if ( (LA2_0==42) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalVampireLanguage.g:932:2: ( ( rule__VampireModel__CommentsAssignment_0 ) )
                    {
                    // InternalVampireLanguage.g:932:2: ( ( rule__VampireModel__CommentsAssignment_0 ) )
                    // InternalVampireLanguage.g:933:3: ( rule__VampireModel__CommentsAssignment_0 )
                    {
                     before(grammarAccess.getVampireModelAccess().getCommentsAssignment_0()); 
                    // InternalVampireLanguage.g:934:3: ( rule__VampireModel__CommentsAssignment_0 )
                    // InternalVampireLanguage.g:934:4: rule__VampireModel__CommentsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VampireModel__CommentsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVampireModelAccess().getCommentsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:938:2: ( ( rule__VampireModel__FormulasAssignment_1 ) )
                    {
                    // InternalVampireLanguage.g:938:2: ( ( rule__VampireModel__FormulasAssignment_1 ) )
                    // InternalVampireLanguage.g:939:3: ( rule__VampireModel__FormulasAssignment_1 )
                    {
                     before(grammarAccess.getVampireModelAccess().getFormulasAssignment_1()); 
                    // InternalVampireLanguage.g:940:3: ( rule__VampireModel__FormulasAssignment_1 )
                    // InternalVampireLanguage.g:940:4: rule__VampireModel__FormulasAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VampireModel__FormulasAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVampireModelAccess().getFormulasAssignment_1()); 

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
    // $ANTLR end "rule__VampireModel__Alternatives"


    // $ANTLR start "rule__VLSFofFormula__NameAlternatives_2_0"
    // InternalVampireLanguage.g:948:1: rule__VLSFofFormula__NameAlternatives_2_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SIGNED_LITERAL ) | ( RULE_SINGLE_QUOTE ) );
    public final void rule__VLSFofFormula__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:952:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SIGNED_LITERAL ) | ( RULE_SINGLE_QUOTE ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt3=1;
                }
                break;
            case RULE_SIGNED_LITERAL:
                {
                alt3=2;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalVampireLanguage.g:953:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:953:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:954:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSFofFormulaAccess().getNameLOWER_WORD_IDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFofFormulaAccess().getNameLOWER_WORD_IDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:959:2: ( RULE_SIGNED_LITERAL )
                    {
                    // InternalVampireLanguage.g:959:2: ( RULE_SIGNED_LITERAL )
                    // InternalVampireLanguage.g:960:3: RULE_SIGNED_LITERAL
                    {
                     before(grammarAccess.getVLSFofFormulaAccess().getNameSIGNED_LITERALTerminalRuleCall_2_0_1()); 
                    match(input,RULE_SIGNED_LITERAL,FOLLOW_2); 
                     after(grammarAccess.getVLSFofFormulaAccess().getNameSIGNED_LITERALTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:965:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:965:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:966:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSFofFormulaAccess().getNameSINGLE_QUOTETerminalRuleCall_2_0_2()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSFofFormulaAccess().getNameSINGLE_QUOTETerminalRuleCall_2_0_2()); 

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
    // $ANTLR end "rule__VLSFofFormula__NameAlternatives_2_0"


    // $ANTLR start "rule__VLSRole__Alternatives"
    // InternalVampireLanguage.g:975:1: rule__VLSRole__Alternatives : ( ( ruleVLSAxiom ) | ( ruleVLSConjecture ) | ( ruleVLSHypothesis ) | ( ruleVLSDefinition ) | ( ruleVLSAssumption ) | ( ruleVLSLemma ) | ( ruleVLSTheorem ) | ( ruleVLSCorollary ) | ( ruleVLSNegated_Conjecture ) | ( ruleVLSPlain ) | ( ruleVLSType ) | ( ruleVLSFi_Domain ) | ( ruleVLSFi_Functors ) | ( ruleVLSFi_Predicates ) | ( ruleVLSUnknown ) );
    public final void rule__VLSRole__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:979:1: ( ( ruleVLSAxiom ) | ( ruleVLSConjecture ) | ( ruleVLSHypothesis ) | ( ruleVLSDefinition ) | ( ruleVLSAssumption ) | ( ruleVLSLemma ) | ( ruleVLSTheorem ) | ( ruleVLSCorollary ) | ( ruleVLSNegated_Conjecture ) | ( ruleVLSPlain ) | ( ruleVLSType ) | ( ruleVLSFi_Domain ) | ( ruleVLSFi_Functors ) | ( ruleVLSFi_Predicates ) | ( ruleVLSUnknown ) )
            int alt4=15;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt4=1;
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case 29:
                {
                alt4=3;
                }
                break;
            case 30:
                {
                alt4=4;
                }
                break;
            case 31:
                {
                alt4=5;
                }
                break;
            case 32:
                {
                alt4=6;
                }
                break;
            case 33:
                {
                alt4=7;
                }
                break;
            case 34:
                {
                alt4=8;
                }
                break;
            case 35:
                {
                alt4=9;
                }
                break;
            case 36:
                {
                alt4=10;
                }
                break;
            case 37:
                {
                alt4=11;
                }
                break;
            case 38:
                {
                alt4=12;
                }
                break;
            case 39:
                {
                alt4=13;
                }
                break;
            case 40:
                {
                alt4=14;
                }
                break;
            case 41:
                {
                alt4=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalVampireLanguage.g:980:2: ( ruleVLSAxiom )
                    {
                    // InternalVampireLanguage.g:980:2: ( ruleVLSAxiom )
                    // InternalVampireLanguage.g:981:3: ruleVLSAxiom
                    {
                     before(grammarAccess.getVLSRoleAccess().getVLSAxiomParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSAxiom();

                    state._fsp--;

                     after(grammarAccess.getVLSRoleAccess().getVLSAxiomParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:986:2: ( ruleVLSConjecture )
                    {
                    // InternalVampireLanguage.g:986:2: ( ruleVLSConjecture )
                    // InternalVampireLanguage.g:987:3: ruleVLSConjecture
                    {
                     before(grammarAccess.getVLSRoleAccess().getVLSConjectureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSConjecture();

                    state._fsp--;

                     after(grammarAccess.getVLSRoleAccess().getVLSConjectureParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:992:2: ( ruleVLSHypothesis )
                    {
                    // InternalVampireLanguage.g:992:2: ( ruleVLSHypothesis )
                    // InternalVampireLanguage.g:993:3: ruleVLSHypothesis
                    {
                     before(grammarAccess.getVLSRoleAccess().getVLSHypothesisParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSHypothesis();

                    state._fsp--;

                     after(grammarAccess.getVLSRoleAccess().getVLSHypothesisParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:998:2: ( ruleVLSDefinition )
                    {
                    // InternalVampireLanguage.g:998:2: ( ruleVLSDefinition )
                    // InternalVampireLanguage.g:999:3: ruleVLSDefinition
                    {
                     before(grammarAccess.getVLSRoleAccess().getVLSDefinitionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSDefinition();

                    state._fsp--;

                     after(grammarAccess.getVLSRoleAccess().getVLSDefinitionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:1004:2: ( ruleVLSAssumption )
                    {
                    // InternalVampireLanguage.g:1004:2: ( ruleVLSAssumption )
                    // InternalVampireLanguage.g:1005:3: ruleVLSAssumption
                    {
                     before(grammarAccess.getVLSRoleAccess().getVLSAssumptionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSAssumption();

                    state._fsp--;

                     after(grammarAccess.getVLSRoleAccess().getVLSAssumptionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalVampireLanguage.g:1010:2: ( ruleVLSLemma )
                    {
                    // InternalVampireLanguage.g:1010:2: ( ruleVLSLemma )
                    // InternalVampireLanguage.g:1011:3: ruleVLSLemma
                    {
                     before(grammarAccess.getVLSRoleAccess().getVLSLemmaParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSLemma();

                    state._fsp--;

                     after(grammarAccess.getVLSRoleAccess().getVLSLemmaParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalVampireLanguage.g:1016:2: ( ruleVLSTheorem )
                    {
                    // InternalVampireLanguage.g:1016:2: ( ruleVLSTheorem )
                    // InternalVampireLanguage.g:1017:3: ruleVLSTheorem
                    {
                     before(grammarAccess.getVLSRoleAccess().getVLSTheoremParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSTheorem();

                    state._fsp--;

                     after(grammarAccess.getVLSRoleAccess().getVLSTheoremParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalVampireLanguage.g:1022:2: ( ruleVLSCorollary )
                    {
                    // InternalVampireLanguage.g:1022:2: ( ruleVLSCorollary )
                    // InternalVampireLanguage.g:1023:3: ruleVLSCorollary
                    {
                     before(grammarAccess.getVLSRoleAccess().getVLSCorollaryParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSCorollary();

                    state._fsp--;

                     after(grammarAccess.getVLSRoleAccess().getVLSCorollaryParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalVampireLanguage.g:1028:2: ( ruleVLSNegated_Conjecture )
                    {
                    // InternalVampireLanguage.g:1028:2: ( ruleVLSNegated_Conjecture )
                    // InternalVampireLanguage.g:1029:3: ruleVLSNegated_Conjecture
                    {
                     before(grammarAccess.getVLSRoleAccess().getVLSNegated_ConjectureParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSNegated_Conjecture();

                    state._fsp--;

                     after(grammarAccess.getVLSRoleAccess().getVLSNegated_ConjectureParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalVampireLanguage.g:1034:2: ( ruleVLSPlain )
                    {
                    // InternalVampireLanguage.g:1034:2: ( ruleVLSPlain )
                    // InternalVampireLanguage.g:1035:3: ruleVLSPlain
                    {
                     before(grammarAccess.getVLSRoleAccess().getVLSPlainParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSPlain();

                    state._fsp--;

                     after(grammarAccess.getVLSRoleAccess().getVLSPlainParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalVampireLanguage.g:1040:2: ( ruleVLSType )
                    {
                    // InternalVampireLanguage.g:1040:2: ( ruleVLSType )
                    // InternalVampireLanguage.g:1041:3: ruleVLSType
                    {
                     before(grammarAccess.getVLSRoleAccess().getVLSTypeParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSType();

                    state._fsp--;

                     after(grammarAccess.getVLSRoleAccess().getVLSTypeParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalVampireLanguage.g:1046:2: ( ruleVLSFi_Domain )
                    {
                    // InternalVampireLanguage.g:1046:2: ( ruleVLSFi_Domain )
                    // InternalVampireLanguage.g:1047:3: ruleVLSFi_Domain
                    {
                     before(grammarAccess.getVLSRoleAccess().getVLSFi_DomainParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSFi_Domain();

                    state._fsp--;

                     after(grammarAccess.getVLSRoleAccess().getVLSFi_DomainParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalVampireLanguage.g:1052:2: ( ruleVLSFi_Functors )
                    {
                    // InternalVampireLanguage.g:1052:2: ( ruleVLSFi_Functors )
                    // InternalVampireLanguage.g:1053:3: ruleVLSFi_Functors
                    {
                     before(grammarAccess.getVLSRoleAccess().getVLSFi_FunctorsParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSFi_Functors();

                    state._fsp--;

                     after(grammarAccess.getVLSRoleAccess().getVLSFi_FunctorsParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalVampireLanguage.g:1058:2: ( ruleVLSFi_Predicates )
                    {
                    // InternalVampireLanguage.g:1058:2: ( ruleVLSFi_Predicates )
                    // InternalVampireLanguage.g:1059:3: ruleVLSFi_Predicates
                    {
                     before(grammarAccess.getVLSRoleAccess().getVLSFi_PredicatesParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSFi_Predicates();

                    state._fsp--;

                     after(grammarAccess.getVLSRoleAccess().getVLSFi_PredicatesParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalVampireLanguage.g:1064:2: ( ruleVLSUnknown )
                    {
                    // InternalVampireLanguage.g:1064:2: ( ruleVLSUnknown )
                    // InternalVampireLanguage.g:1065:3: ruleVLSUnknown
                    {
                     before(grammarAccess.getVLSRoleAccess().getVLSUnknownParserRuleCall_14()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSUnknown();

                    state._fsp--;

                     after(grammarAccess.getVLSRoleAccess().getVLSUnknownParserRuleCall_14()); 

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
    // $ANTLR end "rule__VLSRole__Alternatives"


    // $ANTLR start "rule__VLSAnnotation__NameAlternatives_1_0"
    // InternalVampireLanguage.g:1074:1: rule__VLSAnnotation__NameAlternatives_1_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( ruleVLSRole ) );
    public final void rule__VLSAnnotation__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1078:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( ruleVLSRole ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt5=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt5=2;
                }
                break;
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
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
                    // InternalVampireLanguage.g:1079:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1079:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1080:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSAnnotationAccess().getNameLOWER_WORD_IDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAnnotationAccess().getNameLOWER_WORD_IDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1085:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1085:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1086:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSAnnotationAccess().getNameSINGLE_QUOTETerminalRuleCall_1_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSAnnotationAccess().getNameSINGLE_QUOTETerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1091:2: ( ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:1091:2: ( ruleVLSRole )
                    // InternalVampireLanguage.g:1092:3: ruleVLSRole
                    {
                     before(grammarAccess.getVLSAnnotationAccess().getNameVLSRoleParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSRole();

                    state._fsp--;

                     after(grammarAccess.getVLSAnnotationAccess().getNameVLSRoleParserRuleCall_1_0_2()); 

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
    // $ANTLR end "rule__VLSAnnotation__NameAlternatives_1_0"


    // $ANTLR start "rule__VLSBinary__Alternatives_1"
    // InternalVampireLanguage.g:1101:1: rule__VLSBinary__Alternatives_1 : ( ( ( rule__VLSBinary__Group_1_0__0 ) ) | ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) ) | ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) ) );
    public final void rule__VLSBinary__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1105:1: ( ( ( rule__VLSBinary__Group_1_0__0 ) ) | ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) ) | ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                {
                alt8=1;
                }
                break;
            case 55:
                {
                alt8=2;
                }
                break;
            case 56:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalVampireLanguage.g:1106:2: ( ( rule__VLSBinary__Group_1_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1106:2: ( ( rule__VLSBinary__Group_1_0__0 ) )
                    // InternalVampireLanguage.g:1107:3: ( rule__VLSBinary__Group_1_0__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0()); 
                    // InternalVampireLanguage.g:1108:3: ( rule__VLSBinary__Group_1_0__0 )
                    // InternalVampireLanguage.g:1108:4: rule__VLSBinary__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSBinary__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1112:2: ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) )
                    {
                    // InternalVampireLanguage.g:1112:2: ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) )
                    // InternalVampireLanguage.g:1113:3: ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* )
                    {
                    // InternalVampireLanguage.g:1113:3: ( ( rule__VLSBinary__Group_1_1__0 ) )
                    // InternalVampireLanguage.g:1114:4: ( rule__VLSBinary__Group_1_1__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 
                    // InternalVampireLanguage.g:1115:4: ( rule__VLSBinary__Group_1_1__0 )
                    // InternalVampireLanguage.g:1115:5: rule__VLSBinary__Group_1_1__0
                    {
                    pushFollow(FOLLOW_4);
                    rule__VLSBinary__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 

                    }

                    // InternalVampireLanguage.g:1118:3: ( ( rule__VLSBinary__Group_1_1__0 )* )
                    // InternalVampireLanguage.g:1119:4: ( rule__VLSBinary__Group_1_1__0 )*
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 
                    // InternalVampireLanguage.g:1120:4: ( rule__VLSBinary__Group_1_1__0 )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==55) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1120:5: rule__VLSBinary__Group_1_1__0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__VLSBinary__Group_1_1__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1125:2: ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) )
                    {
                    // InternalVampireLanguage.g:1125:2: ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) )
                    // InternalVampireLanguage.g:1126:3: ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* )
                    {
                    // InternalVampireLanguage.g:1126:3: ( ( rule__VLSBinary__Group_1_2__0 ) )
                    // InternalVampireLanguage.g:1127:4: ( rule__VLSBinary__Group_1_2__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 
                    // InternalVampireLanguage.g:1128:4: ( rule__VLSBinary__Group_1_2__0 )
                    // InternalVampireLanguage.g:1128:5: rule__VLSBinary__Group_1_2__0
                    {
                    pushFollow(FOLLOW_5);
                    rule__VLSBinary__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 

                    }

                    // InternalVampireLanguage.g:1131:3: ( ( rule__VLSBinary__Group_1_2__0 )* )
                    // InternalVampireLanguage.g:1132:4: ( rule__VLSBinary__Group_1_2__0 )*
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 
                    // InternalVampireLanguage.g:1133:4: ( rule__VLSBinary__Group_1_2__0 )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==56) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1133:5: rule__VLSBinary__Group_1_2__0
                    	    {
                    	    pushFollow(FOLLOW_5);
                    	    rule__VLSBinary__Group_1_2__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 

                    }


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
    // $ANTLR end "rule__VLSBinary__Alternatives_1"


    // $ANTLR start "rule__VLSBinary__Alternatives_1_0_0"
    // InternalVampireLanguage.g:1142:1: rule__VLSBinary__Alternatives_1_0_0 : ( ( ( rule__VLSBinary__Group_1_0_0_0__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_1__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_2__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_3__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_4__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_5__0 ) ) );
    public final void rule__VLSBinary__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1146:1: ( ( ( rule__VLSBinary__Group_1_0_0_0__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_1__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_2__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_3__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_4__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_5__0 ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt9=1;
                }
                break;
            case 50:
                {
                alt9=2;
                }
                break;
            case 51:
                {
                alt9=3;
                }
                break;
            case 52:
                {
                alt9=4;
                }
                break;
            case 53:
                {
                alt9=5;
                }
                break;
            case 54:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalVampireLanguage.g:1147:2: ( ( rule__VLSBinary__Group_1_0_0_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1147:2: ( ( rule__VLSBinary__Group_1_0_0_0__0 ) )
                    // InternalVampireLanguage.g:1148:3: ( rule__VLSBinary__Group_1_0_0_0__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_0()); 
                    // InternalVampireLanguage.g:1149:3: ( rule__VLSBinary__Group_1_0_0_0__0 )
                    // InternalVampireLanguage.g:1149:4: rule__VLSBinary__Group_1_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSBinary__Group_1_0_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1153:2: ( ( rule__VLSBinary__Group_1_0_0_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1153:2: ( ( rule__VLSBinary__Group_1_0_0_1__0 ) )
                    // InternalVampireLanguage.g:1154:3: ( rule__VLSBinary__Group_1_0_0_1__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_1()); 
                    // InternalVampireLanguage.g:1155:3: ( rule__VLSBinary__Group_1_0_0_1__0 )
                    // InternalVampireLanguage.g:1155:4: rule__VLSBinary__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSBinary__Group_1_0_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1159:2: ( ( rule__VLSBinary__Group_1_0_0_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1159:2: ( ( rule__VLSBinary__Group_1_0_0_2__0 ) )
                    // InternalVampireLanguage.g:1160:3: ( rule__VLSBinary__Group_1_0_0_2__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_2()); 
                    // InternalVampireLanguage.g:1161:3: ( rule__VLSBinary__Group_1_0_0_2__0 )
                    // InternalVampireLanguage.g:1161:4: rule__VLSBinary__Group_1_0_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSBinary__Group_1_0_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1165:2: ( ( rule__VLSBinary__Group_1_0_0_3__0 ) )
                    {
                    // InternalVampireLanguage.g:1165:2: ( ( rule__VLSBinary__Group_1_0_0_3__0 ) )
                    // InternalVampireLanguage.g:1166:3: ( rule__VLSBinary__Group_1_0_0_3__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_3()); 
                    // InternalVampireLanguage.g:1167:3: ( rule__VLSBinary__Group_1_0_0_3__0 )
                    // InternalVampireLanguage.g:1167:4: rule__VLSBinary__Group_1_0_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSBinary__Group_1_0_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:1171:2: ( ( rule__VLSBinary__Group_1_0_0_4__0 ) )
                    {
                    // InternalVampireLanguage.g:1171:2: ( ( rule__VLSBinary__Group_1_0_0_4__0 ) )
                    // InternalVampireLanguage.g:1172:3: ( rule__VLSBinary__Group_1_0_0_4__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_4()); 
                    // InternalVampireLanguage.g:1173:3: ( rule__VLSBinary__Group_1_0_0_4__0 )
                    // InternalVampireLanguage.g:1173:4: rule__VLSBinary__Group_1_0_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSBinary__Group_1_0_0_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalVampireLanguage.g:1177:2: ( ( rule__VLSBinary__Group_1_0_0_5__0 ) )
                    {
                    // InternalVampireLanguage.g:1177:2: ( ( rule__VLSBinary__Group_1_0_0_5__0 ) )
                    // InternalVampireLanguage.g:1178:3: ( rule__VLSBinary__Group_1_0_0_5__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_5()); 
                    // InternalVampireLanguage.g:1179:3: ( rule__VLSBinary__Group_1_0_0_5__0 )
                    // InternalVampireLanguage.g:1179:4: rule__VLSBinary__Group_1_0_0_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSBinary__Group_1_0_0_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_5()); 

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
    // $ANTLR end "rule__VLSBinary__Alternatives_1_0_0"


    // $ANTLR start "rule__VLSUnitaryFormula__Alternatives"
    // InternalVampireLanguage.g:1187:1: rule__VLSUnitaryFormula__Alternatives : ( ( ruleVLSUniversalQuantifier ) | ( ruleVLSExistentialQuantifier ) | ( ruleVLSUnaryNegation ) | ( ruleVLSUnaryInfix ) | ( ( rule__VLSUnitaryFormula__Group_4__0 ) ) );
    public final void rule__VLSUnitaryFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1191:1: ( ( ruleVLSUniversalQuantifier ) | ( ruleVLSExistentialQuantifier ) | ( ruleVLSUnaryNegation ) | ( ruleVLSUnaryInfix ) | ( ( rule__VLSUnitaryFormula__Group_4__0 ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt10=1;
                }
                break;
            case 59:
                {
                alt10=2;
                }
                break;
            case 60:
                {
                alt10=3;
                }
                break;
            case RULE_LOWER_WORD_ID:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
            case RULE_UPPER_WORD_ID:
            case 64:
            case 65:
            case 66:
                {
                alt10=4;
                }
                break;
            case 43:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalVampireLanguage.g:1192:2: ( ruleVLSUniversalQuantifier )
                    {
                    // InternalVampireLanguage.g:1192:2: ( ruleVLSUniversalQuantifier )
                    // InternalVampireLanguage.g:1193:3: ruleVLSUniversalQuantifier
                    {
                     before(grammarAccess.getVLSUnitaryFormulaAccess().getVLSUniversalQuantifierParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSUniversalQuantifier();

                    state._fsp--;

                     after(grammarAccess.getVLSUnitaryFormulaAccess().getVLSUniversalQuantifierParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1198:2: ( ruleVLSExistentialQuantifier )
                    {
                    // InternalVampireLanguage.g:1198:2: ( ruleVLSExistentialQuantifier )
                    // InternalVampireLanguage.g:1199:3: ruleVLSExistentialQuantifier
                    {
                     before(grammarAccess.getVLSUnitaryFormulaAccess().getVLSExistentialQuantifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSExistentialQuantifier();

                    state._fsp--;

                     after(grammarAccess.getVLSUnitaryFormulaAccess().getVLSExistentialQuantifierParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1204:2: ( ruleVLSUnaryNegation )
                    {
                    // InternalVampireLanguage.g:1204:2: ( ruleVLSUnaryNegation )
                    // InternalVampireLanguage.g:1205:3: ruleVLSUnaryNegation
                    {
                     before(grammarAccess.getVLSUnitaryFormulaAccess().getVLSUnaryNegationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSUnaryNegation();

                    state._fsp--;

                     after(grammarAccess.getVLSUnitaryFormulaAccess().getVLSUnaryNegationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1210:2: ( ruleVLSUnaryInfix )
                    {
                    // InternalVampireLanguage.g:1210:2: ( ruleVLSUnaryInfix )
                    // InternalVampireLanguage.g:1211:3: ruleVLSUnaryInfix
                    {
                     before(grammarAccess.getVLSUnitaryFormulaAccess().getVLSUnaryInfixParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSUnaryInfix();

                    state._fsp--;

                     after(grammarAccess.getVLSUnitaryFormulaAccess().getVLSUnaryInfixParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:1216:2: ( ( rule__VLSUnitaryFormula__Group_4__0 ) )
                    {
                    // InternalVampireLanguage.g:1216:2: ( ( rule__VLSUnitaryFormula__Group_4__0 ) )
                    // InternalVampireLanguage.g:1217:3: ( rule__VLSUnitaryFormula__Group_4__0 )
                    {
                     before(grammarAccess.getVLSUnitaryFormulaAccess().getGroup_4()); 
                    // InternalVampireLanguage.g:1218:3: ( rule__VLSUnitaryFormula__Group_4__0 )
                    // InternalVampireLanguage.g:1218:4: rule__VLSUnitaryFormula__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSUnitaryFormula__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSUnitaryFormulaAccess().getGroup_4()); 

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
    // $ANTLR end "rule__VLSUnitaryFormula__Alternatives"


    // $ANTLR start "rule__VLSUnaryInfix__Alternatives_1_0"
    // InternalVampireLanguage.g:1226:1: rule__VLSUnaryInfix__Alternatives_1_0 : ( ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) ) );
    public final void rule__VLSUnaryInfix__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1230:1: ( ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt11=1;
                }
                break;
            case 62:
                {
                alt11=2;
                }
                break;
            case 63:
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
                    // InternalVampireLanguage.g:1231:2: ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1231:2: ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) )
                    // InternalVampireLanguage.g:1232:3: ( rule__VLSUnaryInfix__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_0()); 
                    // InternalVampireLanguage.g:1233:3: ( rule__VLSUnaryInfix__Group_1_0_0__0 )
                    // InternalVampireLanguage.g:1233:4: rule__VLSUnaryInfix__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSUnaryInfix__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1237:2: ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1237:2: ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) )
                    // InternalVampireLanguage.g:1238:3: ( rule__VLSUnaryInfix__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_1()); 
                    // InternalVampireLanguage.g:1239:3: ( rule__VLSUnaryInfix__Group_1_0_1__0 )
                    // InternalVampireLanguage.g:1239:4: rule__VLSUnaryInfix__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSUnaryInfix__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1243:2: ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1243:2: ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) )
                    // InternalVampireLanguage.g:1244:3: ( rule__VLSUnaryInfix__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_2()); 
                    // InternalVampireLanguage.g:1245:3: ( rule__VLSUnaryInfix__Group_1_0_2__0 )
                    // InternalVampireLanguage.g:1245:4: rule__VLSUnaryInfix__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSUnaryInfix__Group_1_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_2()); 

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
    // $ANTLR end "rule__VLSUnaryInfix__Alternatives_1_0"


    // $ANTLR start "rule__VLSAtomic__Alternatives"
    // InternalVampireLanguage.g:1253:1: rule__VLSAtomic__Alternatives : ( ( ruleVLSAtomicConstant ) | ( ruleVLSAtomicFunction ) | ( ruleVLSVariable ) );
    public final void rule__VLSAtomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1257:1: ( ( ruleVLSAtomicConstant ) | ( ruleVLSAtomicFunction ) | ( ruleVLSVariable ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==43) ) {
                    alt12=2;
                }
                else if ( (LA12_1==EOF||(LA12_1>=44 && LA12_1<=45)||(LA12_1>=49 && LA12_1<=56)||(LA12_1>=61 && LA12_1<=63)) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==EOF||(LA12_2>=44 && LA12_2<=45)||(LA12_2>=49 && LA12_2<=56)||(LA12_2>=61 && LA12_2<=63)) ) {
                    alt12=1;
                }
                else if ( (LA12_2==43) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_DOLLAR_ID:
                {
                int LA12_3 = input.LA(2);

                if ( (LA12_3==43) ) {
                    alt12=2;
                }
                else if ( (LA12_3==EOF||(LA12_3>=44 && LA12_3<=45)||(LA12_3>=49 && LA12_3<=56)||(LA12_3>=61 && LA12_3<=63)) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
                {
                int LA12_4 = input.LA(2);

                if ( (LA12_4==43) ) {
                    alt12=2;
                }
                else if ( (LA12_4==EOF||(LA12_4>=44 && LA12_4<=45)||(LA12_4>=49 && LA12_4<=56)||(LA12_4>=61 && LA12_4<=63)) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 4, input);

                    throw nvae;
                }
                }
                break;
            case 64:
            case 65:
                {
                alt12=1;
                }
                break;
            case 66:
                {
                alt12=2;
                }
                break;
            case RULE_UPPER_WORD_ID:
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
                    // InternalVampireLanguage.g:1258:2: ( ruleVLSAtomicConstant )
                    {
                    // InternalVampireLanguage.g:1258:2: ( ruleVLSAtomicConstant )
                    // InternalVampireLanguage.g:1259:3: ruleVLSAtomicConstant
                    {
                     before(grammarAccess.getVLSAtomicAccess().getVLSAtomicConstantParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSAtomicConstant();

                    state._fsp--;

                     after(grammarAccess.getVLSAtomicAccess().getVLSAtomicConstantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1264:2: ( ruleVLSAtomicFunction )
                    {
                    // InternalVampireLanguage.g:1264:2: ( ruleVLSAtomicFunction )
                    // InternalVampireLanguage.g:1265:3: ruleVLSAtomicFunction
                    {
                     before(grammarAccess.getVLSAtomicAccess().getVLSAtomicFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSAtomicFunction();

                    state._fsp--;

                     after(grammarAccess.getVLSAtomicAccess().getVLSAtomicFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1270:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1270:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1271:3: ruleVLSVariable
                    {
                     before(grammarAccess.getVLSAtomicAccess().getVLSVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSVariable();

                    state._fsp--;

                     after(grammarAccess.getVLSAtomicAccess().getVLSVariableParserRuleCall_2()); 

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
    // $ANTLR end "rule__VLSAtomic__Alternatives"


    // $ANTLR start "rule__VLSAtomicConstant__Alternatives"
    // InternalVampireLanguage.g:1280:1: rule__VLSAtomicConstant__Alternatives : ( ( ( rule__VLSAtomicConstant__Group_0__0 ) ) | ( ( rule__VLSAtomicConstant__Group_1__0 ) ) | ( ( rule__VLSAtomicConstant__Group_2__0 ) ) );
    public final void rule__VLSAtomicConstant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1284:1: ( ( ( rule__VLSAtomicConstant__Group_0__0 ) ) | ( ( rule__VLSAtomicConstant__Group_1__0 ) ) | ( ( rule__VLSAtomicConstant__Group_2__0 ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt13=1;
                }
                break;
            case 64:
                {
                alt13=2;
                }
                break;
            case 65:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalVampireLanguage.g:1285:2: ( ( rule__VLSAtomicConstant__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1285:2: ( ( rule__VLSAtomicConstant__Group_0__0 ) )
                    // InternalVampireLanguage.g:1286:3: ( rule__VLSAtomicConstant__Group_0__0 )
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:1287:3: ( rule__VLSAtomicConstant__Group_0__0 )
                    // InternalVampireLanguage.g:1287:4: rule__VLSAtomicConstant__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSAtomicConstant__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSAtomicConstantAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1291:2: ( ( rule__VLSAtomicConstant__Group_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1291:2: ( ( rule__VLSAtomicConstant__Group_1__0 ) )
                    // InternalVampireLanguage.g:1292:3: ( rule__VLSAtomicConstant__Group_1__0 )
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getGroup_1()); 
                    // InternalVampireLanguage.g:1293:3: ( rule__VLSAtomicConstant__Group_1__0 )
                    // InternalVampireLanguage.g:1293:4: rule__VLSAtomicConstant__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSAtomicConstant__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSAtomicConstantAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1297:2: ( ( rule__VLSAtomicConstant__Group_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1297:2: ( ( rule__VLSAtomicConstant__Group_2__0 ) )
                    // InternalVampireLanguage.g:1298:3: ( rule__VLSAtomicConstant__Group_2__0 )
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getGroup_2()); 
                    // InternalVampireLanguage.g:1299:3: ( rule__VLSAtomicConstant__Group_2__0 )
                    // InternalVampireLanguage.g:1299:4: rule__VLSAtomicConstant__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSAtomicConstant__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSAtomicConstantAccess().getGroup_2()); 

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
    // $ANTLR end "rule__VLSAtomicConstant__Alternatives"


    // $ANTLR start "rule__VLSAtomicConstant__NameAlternatives_0_1_0"
    // InternalVampireLanguage.g:1307:1: rule__VLSAtomicConstant__NameAlternatives_0_1_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) );
    public final void rule__VLSAtomicConstant__NameAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1311:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt14=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt14=2;
                }
                break;
            case RULE_DOLLAR_ID:
                {
                alt14=3;
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalVampireLanguage.g:1312:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1312:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1313:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1318:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1318:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1319:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1324:2: ( RULE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1324:2: ( RULE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1325:3: RULE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameDOLLAR_IDTerminalRuleCall_0_1_0_2()); 
                    match(input,RULE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameDOLLAR_IDTerminalRuleCall_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1330:2: ( RULE_DOUBLE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1330:2: ( RULE_DOUBLE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1331:3: RULE_DOUBLE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 
                    match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 

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
    // $ANTLR end "rule__VLSAtomicConstant__NameAlternatives_0_1_0"


    // $ANTLR start "rule__VLSAtomicFunction__Alternatives"
    // InternalVampireLanguage.g:1340:1: rule__VLSAtomicFunction__Alternatives : ( ( ( rule__VLSAtomicFunction__Group_0__0 ) ) | ( ( rule__VLSAtomicFunction__Group_1__0 ) ) );
    public final void rule__VLSAtomicFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1344:1: ( ( ( rule__VLSAtomicFunction__Group_0__0 ) ) | ( ( rule__VLSAtomicFunction__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LOWER_WORD_ID||(LA15_0>=RULE_SINGLE_QUOTE && LA15_0<=RULE_DOUBLE_DOLLAR_ID)) ) {
                alt15=1;
            }
            else if ( (LA15_0==66) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalVampireLanguage.g:1345:2: ( ( rule__VLSAtomicFunction__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1345:2: ( ( rule__VLSAtomicFunction__Group_0__0 ) )
                    // InternalVampireLanguage.g:1346:3: ( rule__VLSAtomicFunction__Group_0__0 )
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:1347:3: ( rule__VLSAtomicFunction__Group_0__0 )
                    // InternalVampireLanguage.g:1347:4: rule__VLSAtomicFunction__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSAtomicFunction__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1351:2: ( ( rule__VLSAtomicFunction__Group_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1351:2: ( ( rule__VLSAtomicFunction__Group_1__0 ) )
                    // InternalVampireLanguage.g:1352:3: ( rule__VLSAtomicFunction__Group_1__0 )
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_1()); 
                    // InternalVampireLanguage.g:1353:3: ( rule__VLSAtomicFunction__Group_1__0 )
                    // InternalVampireLanguage.g:1353:4: rule__VLSAtomicFunction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSAtomicFunction__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSAtomicFunctionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__VLSAtomicFunction__Alternatives"


    // $ANTLR start "rule__VLSAtomicFunction__ConstantAlternatives_0_1_0"
    // InternalVampireLanguage.g:1361:1: rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) );
    public final void rule__VLSAtomicFunction__ConstantAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1365:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt16=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt16=2;
                }
                break;
            case RULE_DOLLAR_ID:
                {
                alt16=3;
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalVampireLanguage.g:1366:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1366:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1367:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1372:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1372:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1373:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1378:2: ( RULE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1378:2: ( RULE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1379:3: RULE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOLLAR_IDTerminalRuleCall_0_1_0_2()); 
                    match(input,RULE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOLLAR_IDTerminalRuleCall_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1384:2: ( RULE_DOUBLE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1384:2: ( RULE_DOUBLE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1385:3: RULE_DOUBLE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 
                    match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 

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
    // $ANTLR end "rule__VLSAtomicFunction__ConstantAlternatives_0_1_0"


    // $ANTLR start "rule__VLSFofTerm__Alternatives"
    // InternalVampireLanguage.g:1394:1: rule__VLSFofTerm__Alternatives : ( ( ruleVLSVariable ) | ( ruleVLSFunctionFof ) | ( ruleVLSDefinedTerm ) );
    public final void rule__VLSFofTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1398:1: ( ( ruleVLSVariable ) | ( ruleVLSFunctionFof ) | ( ruleVLSDefinedTerm ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_UPPER_WORD_ID:
                {
                alt17=1;
                }
                break;
            case RULE_LOWER_WORD_ID:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt17=2;
                }
                break;
            case RULE_SIGNED_LITERAL:
            case RULE_SIGNED_REAL_ID:
            case RULE_SIGNED_RAT_ID:
            case RULE_DOUBLE_QUOTE:
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
                    // InternalVampireLanguage.g:1399:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1399:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1400:3: ruleVLSVariable
                    {
                     before(grammarAccess.getVLSFofTermAccess().getVLSVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSVariable();

                    state._fsp--;

                     after(grammarAccess.getVLSFofTermAccess().getVLSVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1405:2: ( ruleVLSFunctionFof )
                    {
                    // InternalVampireLanguage.g:1405:2: ( ruleVLSFunctionFof )
                    // InternalVampireLanguage.g:1406:3: ruleVLSFunctionFof
                    {
                     before(grammarAccess.getVLSFofTermAccess().getVLSFunctionFofParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSFunctionFof();

                    state._fsp--;

                     after(grammarAccess.getVLSFofTermAccess().getVLSFunctionFofParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1411:2: ( ruleVLSDefinedTerm )
                    {
                    // InternalVampireLanguage.g:1411:2: ( ruleVLSDefinedTerm )
                    // InternalVampireLanguage.g:1412:3: ruleVLSDefinedTerm
                    {
                     before(grammarAccess.getVLSFofTermAccess().getVLSDefinedTermParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSDefinedTerm();

                    state._fsp--;

                     after(grammarAccess.getVLSFofTermAccess().getVLSDefinedTermParserRuleCall_2()); 

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
    // $ANTLR end "rule__VLSFofTerm__Alternatives"


    // $ANTLR start "rule__VLSFunctionFof__FunctorAlternatives_0_0"
    // InternalVampireLanguage.g:1421:1: rule__VLSFunctionFof__FunctorAlternatives_0_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) );
    public final void rule__VLSFunctionFof__FunctorAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1425:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt18=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt18=2;
                }
                break;
            case RULE_DOLLAR_ID:
                {
                alt18=3;
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalVampireLanguage.g:1426:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1426:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1427:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSFunctionFofAccess().getFunctorLOWER_WORD_IDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionFofAccess().getFunctorLOWER_WORD_IDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1432:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1432:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1433:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSFunctionFofAccess().getFunctorSINGLE_QUOTETerminalRuleCall_0_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionFofAccess().getFunctorSINGLE_QUOTETerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1438:2: ( RULE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1438:2: ( RULE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1439:3: RULE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSFunctionFofAccess().getFunctorDOLLAR_IDTerminalRuleCall_0_0_2()); 
                    match(input,RULE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionFofAccess().getFunctorDOLLAR_IDTerminalRuleCall_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1444:2: ( RULE_DOUBLE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1444:2: ( RULE_DOUBLE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1445:3: RULE_DOUBLE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSFunctionFofAccess().getFunctorDOUBLE_DOLLAR_IDTerminalRuleCall_0_0_3()); 
                    match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionFofAccess().getFunctorDOUBLE_DOLLAR_IDTerminalRuleCall_0_0_3()); 

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
    // $ANTLR end "rule__VLSFunctionFof__FunctorAlternatives_0_0"


    // $ANTLR start "rule__VLSDefinedTerm__Alternatives"
    // InternalVampireLanguage.g:1454:1: rule__VLSDefinedTerm__Alternatives : ( ( ( rule__VLSDefinedTerm__Group_0__0 ) ) | ( ( rule__VLSDefinedTerm__Group_1__0 ) ) | ( ( rule__VLSDefinedTerm__Group_2__0 ) ) | ( ( rule__VLSDefinedTerm__Group_3__0 ) ) );
    public final void rule__VLSDefinedTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1458:1: ( ( ( rule__VLSDefinedTerm__Group_0__0 ) ) | ( ( rule__VLSDefinedTerm__Group_1__0 ) ) | ( ( rule__VLSDefinedTerm__Group_2__0 ) ) | ( ( rule__VLSDefinedTerm__Group_3__0 ) ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_LITERAL:
                {
                alt19=1;
                }
                break;
            case RULE_SIGNED_REAL_ID:
                {
                alt19=2;
                }
                break;
            case RULE_SIGNED_RAT_ID:
                {
                alt19=3;
                }
                break;
            case RULE_DOUBLE_QUOTE:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalVampireLanguage.g:1459:2: ( ( rule__VLSDefinedTerm__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1459:2: ( ( rule__VLSDefinedTerm__Group_0__0 ) )
                    // InternalVampireLanguage.g:1460:3: ( rule__VLSDefinedTerm__Group_0__0 )
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:1461:3: ( rule__VLSDefinedTerm__Group_0__0 )
                    // InternalVampireLanguage.g:1461:4: rule__VLSDefinedTerm__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSDefinedTerm__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSDefinedTermAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1465:2: ( ( rule__VLSDefinedTerm__Group_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1465:2: ( ( rule__VLSDefinedTerm__Group_1__0 ) )
                    // InternalVampireLanguage.g:1466:3: ( rule__VLSDefinedTerm__Group_1__0 )
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getGroup_1()); 
                    // InternalVampireLanguage.g:1467:3: ( rule__VLSDefinedTerm__Group_1__0 )
                    // InternalVampireLanguage.g:1467:4: rule__VLSDefinedTerm__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSDefinedTerm__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSDefinedTermAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1471:2: ( ( rule__VLSDefinedTerm__Group_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1471:2: ( ( rule__VLSDefinedTerm__Group_2__0 ) )
                    // InternalVampireLanguage.g:1472:3: ( rule__VLSDefinedTerm__Group_2__0 )
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getGroup_2()); 
                    // InternalVampireLanguage.g:1473:3: ( rule__VLSDefinedTerm__Group_2__0 )
                    // InternalVampireLanguage.g:1473:4: rule__VLSDefinedTerm__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSDefinedTerm__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSDefinedTermAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1477:2: ( ( rule__VLSDefinedTerm__Group_3__0 ) )
                    {
                    // InternalVampireLanguage.g:1477:2: ( ( rule__VLSDefinedTerm__Group_3__0 ) )
                    // InternalVampireLanguage.g:1478:3: ( rule__VLSDefinedTerm__Group_3__0 )
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getGroup_3()); 
                    // InternalVampireLanguage.g:1479:3: ( rule__VLSDefinedTerm__Group_3__0 )
                    // InternalVampireLanguage.g:1479:4: rule__VLSDefinedTerm__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSDefinedTerm__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSDefinedTermAccess().getGroup_3()); 

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
    // $ANTLR end "rule__VLSDefinedTerm__Alternatives"


    // $ANTLR start "rule__VLSFofFormula__Group__0"
    // InternalVampireLanguage.g:1487:1: rule__VLSFofFormula__Group__0 : rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1 ;
    public final void rule__VLSFofFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1491:1: ( rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1 )
            // InternalVampireLanguage.g:1492:2: rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VLSFofFormula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__0"


    // $ANTLR start "rule__VLSFofFormula__Group__0__Impl"
    // InternalVampireLanguage.g:1499:1: rule__VLSFofFormula__Group__0__Impl : ( 'fof' ) ;
    public final void rule__VLSFofFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1503:1: ( ( 'fof' ) )
            // InternalVampireLanguage.g:1504:1: ( 'fof' )
            {
            // InternalVampireLanguage.g:1504:1: ( 'fof' )
            // InternalVampireLanguage.g:1505:2: 'fof'
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVLSFofFormulaAccess().getFofKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__0__Impl"


    // $ANTLR start "rule__VLSFofFormula__Group__1"
    // InternalVampireLanguage.g:1514:1: rule__VLSFofFormula__Group__1 : rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2 ;
    public final void rule__VLSFofFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1518:1: ( rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2 )
            // InternalVampireLanguage.g:1519:2: rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__VLSFofFormula__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__1"


    // $ANTLR start "rule__VLSFofFormula__Group__1__Impl"
    // InternalVampireLanguage.g:1526:1: rule__VLSFofFormula__Group__1__Impl : ( '(' ) ;
    public final void rule__VLSFofFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1530:1: ( ( '(' ) )
            // InternalVampireLanguage.g:1531:1: ( '(' )
            {
            // InternalVampireLanguage.g:1531:1: ( '(' )
            // InternalVampireLanguage.g:1532:2: '('
            {
             before(grammarAccess.getVLSFofFormulaAccess().getLeftParenthesisKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getVLSFofFormulaAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__1__Impl"


    // $ANTLR start "rule__VLSFofFormula__Group__2"
    // InternalVampireLanguage.g:1541:1: rule__VLSFofFormula__Group__2 : rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3 ;
    public final void rule__VLSFofFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1545:1: ( rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3 )
            // InternalVampireLanguage.g:1546:2: rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__VLSFofFormula__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__2"


    // $ANTLR start "rule__VLSFofFormula__Group__2__Impl"
    // InternalVampireLanguage.g:1553:1: rule__VLSFofFormula__Group__2__Impl : ( ( rule__VLSFofFormula__NameAssignment_2 ) ) ;
    public final void rule__VLSFofFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1557:1: ( ( ( rule__VLSFofFormula__NameAssignment_2 ) ) )
            // InternalVampireLanguage.g:1558:1: ( ( rule__VLSFofFormula__NameAssignment_2 ) )
            {
            // InternalVampireLanguage.g:1558:1: ( ( rule__VLSFofFormula__NameAssignment_2 ) )
            // InternalVampireLanguage.g:1559:2: ( rule__VLSFofFormula__NameAssignment_2 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getNameAssignment_2()); 
            // InternalVampireLanguage.g:1560:2: ( rule__VLSFofFormula__NameAssignment_2 )
            // InternalVampireLanguage.g:1560:3: rule__VLSFofFormula__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVLSFofFormulaAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__2__Impl"


    // $ANTLR start "rule__VLSFofFormula__Group__3"
    // InternalVampireLanguage.g:1568:1: rule__VLSFofFormula__Group__3 : rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4 ;
    public final void rule__VLSFofFormula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1572:1: ( rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4 )
            // InternalVampireLanguage.g:1573:2: rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__VLSFofFormula__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__3"


    // $ANTLR start "rule__VLSFofFormula__Group__3__Impl"
    // InternalVampireLanguage.g:1580:1: rule__VLSFofFormula__Group__3__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1584:1: ( ( ',' ) )
            // InternalVampireLanguage.g:1585:1: ( ',' )
            {
            // InternalVampireLanguage.g:1585:1: ( ',' )
            // InternalVampireLanguage.g:1586:2: ','
            {
             before(grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__3__Impl"


    // $ANTLR start "rule__VLSFofFormula__Group__4"
    // InternalVampireLanguage.g:1595:1: rule__VLSFofFormula__Group__4 : rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5 ;
    public final void rule__VLSFofFormula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1599:1: ( rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5 )
            // InternalVampireLanguage.g:1600:2: rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__VLSFofFormula__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__4"


    // $ANTLR start "rule__VLSFofFormula__Group__4__Impl"
    // InternalVampireLanguage.g:1607:1: rule__VLSFofFormula__Group__4__Impl : ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) ) ;
    public final void rule__VLSFofFormula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1611:1: ( ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) ) )
            // InternalVampireLanguage.g:1612:1: ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) )
            {
            // InternalVampireLanguage.g:1612:1: ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) )
            // InternalVampireLanguage.g:1613:2: ( rule__VLSFofFormula__FofRoleAssignment_4 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofRoleAssignment_4()); 
            // InternalVampireLanguage.g:1614:2: ( rule__VLSFofFormula__FofRoleAssignment_4 )
            // InternalVampireLanguage.g:1614:3: rule__VLSFofFormula__FofRoleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__FofRoleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVLSFofFormulaAccess().getFofRoleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__4__Impl"


    // $ANTLR start "rule__VLSFofFormula__Group__5"
    // InternalVampireLanguage.g:1622:1: rule__VLSFofFormula__Group__5 : rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6 ;
    public final void rule__VLSFofFormula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1626:1: ( rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6 )
            // InternalVampireLanguage.g:1627:2: rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__VLSFofFormula__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__5"


    // $ANTLR start "rule__VLSFofFormula__Group__5__Impl"
    // InternalVampireLanguage.g:1634:1: rule__VLSFofFormula__Group__5__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1638:1: ( ( ',' ) )
            // InternalVampireLanguage.g:1639:1: ( ',' )
            {
            // InternalVampireLanguage.g:1639:1: ( ',' )
            // InternalVampireLanguage.g:1640:2: ','
            {
             before(grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__5__Impl"


    // $ANTLR start "rule__VLSFofFormula__Group__6"
    // InternalVampireLanguage.g:1649:1: rule__VLSFofFormula__Group__6 : rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7 ;
    public final void rule__VLSFofFormula__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1653:1: ( rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7 )
            // InternalVampireLanguage.g:1654:2: rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__VLSFofFormula__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__6"


    // $ANTLR start "rule__VLSFofFormula__Group__6__Impl"
    // InternalVampireLanguage.g:1661:1: rule__VLSFofFormula__Group__6__Impl : ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) ) ;
    public final void rule__VLSFofFormula__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1665:1: ( ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) ) )
            // InternalVampireLanguage.g:1666:1: ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) )
            {
            // InternalVampireLanguage.g:1666:1: ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) )
            // InternalVampireLanguage.g:1667:2: ( rule__VLSFofFormula__FofFormulaAssignment_6 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofFormulaAssignment_6()); 
            // InternalVampireLanguage.g:1668:2: ( rule__VLSFofFormula__FofFormulaAssignment_6 )
            // InternalVampireLanguage.g:1668:3: rule__VLSFofFormula__FofFormulaAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__FofFormulaAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVLSFofFormulaAccess().getFofFormulaAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__6__Impl"


    // $ANTLR start "rule__VLSFofFormula__Group__7"
    // InternalVampireLanguage.g:1676:1: rule__VLSFofFormula__Group__7 : rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8 ;
    public final void rule__VLSFofFormula__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1680:1: ( rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8 )
            // InternalVampireLanguage.g:1681:2: rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__VLSFofFormula__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__7"


    // $ANTLR start "rule__VLSFofFormula__Group__7__Impl"
    // InternalVampireLanguage.g:1688:1: rule__VLSFofFormula__Group__7__Impl : ( ( rule__VLSFofFormula__Group_7__0 )? ) ;
    public final void rule__VLSFofFormula__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1692:1: ( ( ( rule__VLSFofFormula__Group_7__0 )? ) )
            // InternalVampireLanguage.g:1693:1: ( ( rule__VLSFofFormula__Group_7__0 )? )
            {
            // InternalVampireLanguage.g:1693:1: ( ( rule__VLSFofFormula__Group_7__0 )? )
            // InternalVampireLanguage.g:1694:2: ( rule__VLSFofFormula__Group_7__0 )?
            {
             before(grammarAccess.getVLSFofFormulaAccess().getGroup_7()); 
            // InternalVampireLanguage.g:1695:2: ( rule__VLSFofFormula__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVampireLanguage.g:1695:3: rule__VLSFofFormula__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSFofFormula__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVLSFofFormulaAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__7__Impl"


    // $ANTLR start "rule__VLSFofFormula__Group__8"
    // InternalVampireLanguage.g:1703:1: rule__VLSFofFormula__Group__8 : rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9 ;
    public final void rule__VLSFofFormula__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1707:1: ( rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9 )
            // InternalVampireLanguage.g:1708:2: rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__VLSFofFormula__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__8"


    // $ANTLR start "rule__VLSFofFormula__Group__8__Impl"
    // InternalVampireLanguage.g:1715:1: rule__VLSFofFormula__Group__8__Impl : ( ')' ) ;
    public final void rule__VLSFofFormula__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1719:1: ( ( ')' ) )
            // InternalVampireLanguage.g:1720:1: ( ')' )
            {
            // InternalVampireLanguage.g:1720:1: ( ')' )
            // InternalVampireLanguage.g:1721:2: ')'
            {
             before(grammarAccess.getVLSFofFormulaAccess().getRightParenthesisKeyword_8()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVLSFofFormulaAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__8__Impl"


    // $ANTLR start "rule__VLSFofFormula__Group__9"
    // InternalVampireLanguage.g:1730:1: rule__VLSFofFormula__Group__9 : rule__VLSFofFormula__Group__9__Impl ;
    public final void rule__VLSFofFormula__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1734:1: ( rule__VLSFofFormula__Group__9__Impl )
            // InternalVampireLanguage.g:1735:2: rule__VLSFofFormula__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__9"


    // $ANTLR start "rule__VLSFofFormula__Group__9__Impl"
    // InternalVampireLanguage.g:1741:1: rule__VLSFofFormula__Group__9__Impl : ( '.' ) ;
    public final void rule__VLSFofFormula__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1745:1: ( ( '.' ) )
            // InternalVampireLanguage.g:1746:1: ( '.' )
            {
            // InternalVampireLanguage.g:1746:1: ( '.' )
            // InternalVampireLanguage.g:1747:2: '.'
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFullStopKeyword_9()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getVLSFofFormulaAccess().getFullStopKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group__9__Impl"


    // $ANTLR start "rule__VLSFofFormula__Group_7__0"
    // InternalVampireLanguage.g:1757:1: rule__VLSFofFormula__Group_7__0 : rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1 ;
    public final void rule__VLSFofFormula__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1761:1: ( rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1 )
            // InternalVampireLanguage.g:1762:2: rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__VLSFofFormula__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group_7__0"


    // $ANTLR start "rule__VLSFofFormula__Group_7__0__Impl"
    // InternalVampireLanguage.g:1769:1: rule__VLSFofFormula__Group_7__0__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1773:1: ( ( ',' ) )
            // InternalVampireLanguage.g:1774:1: ( ',' )
            {
            // InternalVampireLanguage.g:1774:1: ( ',' )
            // InternalVampireLanguage.g:1775:2: ','
            {
             before(grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_7_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group_7__0__Impl"


    // $ANTLR start "rule__VLSFofFormula__Group_7__1"
    // InternalVampireLanguage.g:1784:1: rule__VLSFofFormula__Group_7__1 : rule__VLSFofFormula__Group_7__1__Impl ;
    public final void rule__VLSFofFormula__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1788:1: ( rule__VLSFofFormula__Group_7__1__Impl )
            // InternalVampireLanguage.g:1789:2: rule__VLSFofFormula__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group_7__1"


    // $ANTLR start "rule__VLSFofFormula__Group_7__1__Impl"
    // InternalVampireLanguage.g:1795:1: rule__VLSFofFormula__Group_7__1__Impl : ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) ) ;
    public final void rule__VLSFofFormula__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1799:1: ( ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) ) )
            // InternalVampireLanguage.g:1800:1: ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) )
            {
            // InternalVampireLanguage.g:1800:1: ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) )
            // InternalVampireLanguage.g:1801:2: ( rule__VLSFofFormula__AnnotationsAssignment_7_1 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getAnnotationsAssignment_7_1()); 
            // InternalVampireLanguage.g:1802:2: ( rule__VLSFofFormula__AnnotationsAssignment_7_1 )
            // InternalVampireLanguage.g:1802:3: rule__VLSFofFormula__AnnotationsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__AnnotationsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSFofFormulaAccess().getAnnotationsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__Group_7__1__Impl"


    // $ANTLR start "rule__VLSAnnotation__Group__0"
    // InternalVampireLanguage.g:1811:1: rule__VLSAnnotation__Group__0 : rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1 ;
    public final void rule__VLSAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1815:1: ( rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1 )
            // InternalVampireLanguage.g:1816:2: rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__VLSAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAnnotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotation__Group__0"


    // $ANTLR start "rule__VLSAnnotation__Group__0__Impl"
    // InternalVampireLanguage.g:1823:1: rule__VLSAnnotation__Group__0__Impl : ( ( '[' )? ) ;
    public final void rule__VLSAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1827:1: ( ( ( '[' )? ) )
            // InternalVampireLanguage.g:1828:1: ( ( '[' )? )
            {
            // InternalVampireLanguage.g:1828:1: ( ( '[' )? )
            // InternalVampireLanguage.g:1829:2: ( '[' )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getLeftSquareBracketKeyword_0()); 
            // InternalVampireLanguage.g:1830:2: ( '[' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVampireLanguage.g:1830:3: '['
                    {
                    match(input,47,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getVLSAnnotationAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotation__Group__0__Impl"


    // $ANTLR start "rule__VLSAnnotation__Group__1"
    // InternalVampireLanguage.g:1838:1: rule__VLSAnnotation__Group__1 : rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2 ;
    public final void rule__VLSAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1842:1: ( rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2 )
            // InternalVampireLanguage.g:1843:2: rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__VLSAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAnnotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotation__Group__1"


    // $ANTLR start "rule__VLSAnnotation__Group__1__Impl"
    // InternalVampireLanguage.g:1850:1: rule__VLSAnnotation__Group__1__Impl : ( ( rule__VLSAnnotation__NameAssignment_1 )? ) ;
    public final void rule__VLSAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1854:1: ( ( ( rule__VLSAnnotation__NameAssignment_1 )? ) )
            // InternalVampireLanguage.g:1855:1: ( ( rule__VLSAnnotation__NameAssignment_1 )? )
            {
            // InternalVampireLanguage.g:1855:1: ( ( rule__VLSAnnotation__NameAssignment_1 )? )
            // InternalVampireLanguage.g:1856:2: ( rule__VLSAnnotation__NameAssignment_1 )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getNameAssignment_1()); 
            // InternalVampireLanguage.g:1857:2: ( rule__VLSAnnotation__NameAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_LOWER_WORD_ID||LA22_0==RULE_SINGLE_QUOTE||(LA22_0>=27 && LA22_0<=41)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVampireLanguage.g:1857:3: rule__VLSAnnotation__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSAnnotation__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVLSAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotation__Group__1__Impl"


    // $ANTLR start "rule__VLSAnnotation__Group__2"
    // InternalVampireLanguage.g:1865:1: rule__VLSAnnotation__Group__2 : rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3 ;
    public final void rule__VLSAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1869:1: ( rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3 )
            // InternalVampireLanguage.g:1870:2: rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__VLSAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAnnotation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotation__Group__2"


    // $ANTLR start "rule__VLSAnnotation__Group__2__Impl"
    // InternalVampireLanguage.g:1877:1: rule__VLSAnnotation__Group__2__Impl : ( ( rule__VLSAnnotation__Group_2__0 )? ) ;
    public final void rule__VLSAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1881:1: ( ( ( rule__VLSAnnotation__Group_2__0 )? ) )
            // InternalVampireLanguage.g:1882:1: ( ( rule__VLSAnnotation__Group_2__0 )? )
            {
            // InternalVampireLanguage.g:1882:1: ( ( rule__VLSAnnotation__Group_2__0 )? )
            // InternalVampireLanguage.g:1883:2: ( rule__VLSAnnotation__Group_2__0 )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getGroup_2()); 
            // InternalVampireLanguage.g:1884:2: ( rule__VLSAnnotation__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalVampireLanguage.g:1884:3: rule__VLSAnnotation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSAnnotation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVLSAnnotationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotation__Group__2__Impl"


    // $ANTLR start "rule__VLSAnnotation__Group__3"
    // InternalVampireLanguage.g:1892:1: rule__VLSAnnotation__Group__3 : rule__VLSAnnotation__Group__3__Impl ;
    public final void rule__VLSAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1896:1: ( rule__VLSAnnotation__Group__3__Impl )
            // InternalVampireLanguage.g:1897:2: rule__VLSAnnotation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSAnnotation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotation__Group__3"


    // $ANTLR start "rule__VLSAnnotation__Group__3__Impl"
    // InternalVampireLanguage.g:1903:1: rule__VLSAnnotation__Group__3__Impl : ( ( ']' )? ) ;
    public final void rule__VLSAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1907:1: ( ( ( ']' )? ) )
            // InternalVampireLanguage.g:1908:1: ( ( ']' )? )
            {
            // InternalVampireLanguage.g:1908:1: ( ( ']' )? )
            // InternalVampireLanguage.g:1909:2: ( ']' )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getRightSquareBracketKeyword_3()); 
            // InternalVampireLanguage.g:1910:2: ( ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==48) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVampireLanguage.g:1910:3: ']'
                    {
                    match(input,48,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getVLSAnnotationAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotation__Group__3__Impl"


    // $ANTLR start "rule__VLSAnnotation__Group_2__0"
    // InternalVampireLanguage.g:1919:1: rule__VLSAnnotation__Group_2__0 : rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1 ;
    public final void rule__VLSAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1923:1: ( rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1 )
            // InternalVampireLanguage.g:1924:2: rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__VLSAnnotation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAnnotation__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotation__Group_2__0"


    // $ANTLR start "rule__VLSAnnotation__Group_2__0__Impl"
    // InternalVampireLanguage.g:1931:1: rule__VLSAnnotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__VLSAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1935:1: ( ( '(' ) )
            // InternalVampireLanguage.g:1936:1: ( '(' )
            {
            // InternalVampireLanguage.g:1936:1: ( '(' )
            // InternalVampireLanguage.g:1937:2: '('
            {
             before(grammarAccess.getVLSAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getVLSAnnotationAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotation__Group_2__0__Impl"


    // $ANTLR start "rule__VLSAnnotation__Group_2__1"
    // InternalVampireLanguage.g:1946:1: rule__VLSAnnotation__Group_2__1 : rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2 ;
    public final void rule__VLSAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1950:1: ( rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2 )
            // InternalVampireLanguage.g:1951:2: rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2
            {
            pushFollow(FOLLOW_14);
            rule__VLSAnnotation__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAnnotation__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotation__Group_2__1"


    // $ANTLR start "rule__VLSAnnotation__Group_2__1__Impl"
    // InternalVampireLanguage.g:1958:1: rule__VLSAnnotation__Group_2__1__Impl : ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) ) ;
    public final void rule__VLSAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1962:1: ( ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) ) )
            // InternalVampireLanguage.g:1963:1: ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) )
            {
            // InternalVampireLanguage.g:1963:1: ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) )
            // InternalVampireLanguage.g:1964:2: ( rule__VLSAnnotation__FollowupAssignment_2_1 )
            {
             before(grammarAccess.getVLSAnnotationAccess().getFollowupAssignment_2_1()); 
            // InternalVampireLanguage.g:1965:2: ( rule__VLSAnnotation__FollowupAssignment_2_1 )
            // InternalVampireLanguage.g:1965:3: rule__VLSAnnotation__FollowupAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSAnnotation__FollowupAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSAnnotationAccess().getFollowupAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotation__Group_2__1__Impl"


    // $ANTLR start "rule__VLSAnnotation__Group_2__2"
    // InternalVampireLanguage.g:1973:1: rule__VLSAnnotation__Group_2__2 : rule__VLSAnnotation__Group_2__2__Impl ;
    public final void rule__VLSAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1977:1: ( rule__VLSAnnotation__Group_2__2__Impl )
            // InternalVampireLanguage.g:1978:2: rule__VLSAnnotation__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSAnnotation__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotation__Group_2__2"


    // $ANTLR start "rule__VLSAnnotation__Group_2__2__Impl"
    // InternalVampireLanguage.g:1984:1: rule__VLSAnnotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__VLSAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1988:1: ( ( ')' ) )
            // InternalVampireLanguage.g:1989:1: ( ')' )
            {
            // InternalVampireLanguage.g:1989:1: ( ')' )
            // InternalVampireLanguage.g:1990:2: ')'
            {
             before(grammarAccess.getVLSAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVLSAnnotationAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotation__Group_2__2__Impl"


    // $ANTLR start "rule__VLSAnnotationTerms__Group__0"
    // InternalVampireLanguage.g:2000:1: rule__VLSAnnotationTerms__Group__0 : rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1 ;
    public final void rule__VLSAnnotationTerms__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2004:1: ( rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1 )
            // InternalVampireLanguage.g:2005:2: rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__VLSAnnotationTerms__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAnnotationTerms__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotationTerms__Group__0"


    // $ANTLR start "rule__VLSAnnotationTerms__Group__0__Impl"
    // InternalVampireLanguage.g:2012:1: rule__VLSAnnotationTerms__Group__0__Impl : ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) ) ;
    public final void rule__VLSAnnotationTerms__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2016:1: ( ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) ) )
            // InternalVampireLanguage.g:2017:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) )
            {
            // InternalVampireLanguage.g:2017:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) )
            // InternalVampireLanguage.g:2018:2: ( rule__VLSAnnotationTerms__TermsAssignment_0 )
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getTermsAssignment_0()); 
            // InternalVampireLanguage.g:2019:2: ( rule__VLSAnnotationTerms__TermsAssignment_0 )
            // InternalVampireLanguage.g:2019:3: rule__VLSAnnotationTerms__TermsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSAnnotationTerms__TermsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSAnnotationTermsAccess().getTermsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotationTerms__Group__0__Impl"


    // $ANTLR start "rule__VLSAnnotationTerms__Group__1"
    // InternalVampireLanguage.g:2027:1: rule__VLSAnnotationTerms__Group__1 : rule__VLSAnnotationTerms__Group__1__Impl ;
    public final void rule__VLSAnnotationTerms__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2031:1: ( rule__VLSAnnotationTerms__Group__1__Impl )
            // InternalVampireLanguage.g:2032:2: rule__VLSAnnotationTerms__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSAnnotationTerms__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotationTerms__Group__1"


    // $ANTLR start "rule__VLSAnnotationTerms__Group__1__Impl"
    // InternalVampireLanguage.g:2038:1: rule__VLSAnnotationTerms__Group__1__Impl : ( ( rule__VLSAnnotationTerms__Group_1__0 )* ) ;
    public final void rule__VLSAnnotationTerms__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2042:1: ( ( ( rule__VLSAnnotationTerms__Group_1__0 )* ) )
            // InternalVampireLanguage.g:2043:1: ( ( rule__VLSAnnotationTerms__Group_1__0 )* )
            {
            // InternalVampireLanguage.g:2043:1: ( ( rule__VLSAnnotationTerms__Group_1__0 )* )
            // InternalVampireLanguage.g:2044:2: ( rule__VLSAnnotationTerms__Group_1__0 )*
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getGroup_1()); 
            // InternalVampireLanguage.g:2045:2: ( rule__VLSAnnotationTerms__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==44) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalVampireLanguage.g:2045:3: rule__VLSAnnotationTerms__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__VLSAnnotationTerms__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getVLSAnnotationTermsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotationTerms__Group__1__Impl"


    // $ANTLR start "rule__VLSAnnotationTerms__Group_1__0"
    // InternalVampireLanguage.g:2054:1: rule__VLSAnnotationTerms__Group_1__0 : rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1 ;
    public final void rule__VLSAnnotationTerms__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2058:1: ( rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1 )
            // InternalVampireLanguage.g:2059:2: rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__VLSAnnotationTerms__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAnnotationTerms__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotationTerms__Group_1__0"


    // $ANTLR start "rule__VLSAnnotationTerms__Group_1__0__Impl"
    // InternalVampireLanguage.g:2066:1: rule__VLSAnnotationTerms__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VLSAnnotationTerms__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2070:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2071:1: ( ',' )
            {
            // InternalVampireLanguage.g:2071:1: ( ',' )
            // InternalVampireLanguage.g:2072:2: ','
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getCommaKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVLSAnnotationTermsAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotationTerms__Group_1__0__Impl"


    // $ANTLR start "rule__VLSAnnotationTerms__Group_1__1"
    // InternalVampireLanguage.g:2081:1: rule__VLSAnnotationTerms__Group_1__1 : rule__VLSAnnotationTerms__Group_1__1__Impl ;
    public final void rule__VLSAnnotationTerms__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2085:1: ( rule__VLSAnnotationTerms__Group_1__1__Impl )
            // InternalVampireLanguage.g:2086:2: rule__VLSAnnotationTerms__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSAnnotationTerms__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotationTerms__Group_1__1"


    // $ANTLR start "rule__VLSAnnotationTerms__Group_1__1__Impl"
    // InternalVampireLanguage.g:2092:1: rule__VLSAnnotationTerms__Group_1__1__Impl : ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) ) ;
    public final void rule__VLSAnnotationTerms__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2096:1: ( ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:2097:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:2097:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) )
            // InternalVampireLanguage.g:2098:2: ( rule__VLSAnnotationTerms__TermsAssignment_1_1 )
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getTermsAssignment_1_1()); 
            // InternalVampireLanguage.g:2099:2: ( rule__VLSAnnotationTerms__TermsAssignment_1_1 )
            // InternalVampireLanguage.g:2099:3: rule__VLSAnnotationTerms__TermsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSAnnotationTerms__TermsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSAnnotationTermsAccess().getTermsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotationTerms__Group_1__1__Impl"


    // $ANTLR start "rule__VLSBinary__Group__0"
    // InternalVampireLanguage.g:2108:1: rule__VLSBinary__Group__0 : rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1 ;
    public final void rule__VLSBinary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2112:1: ( rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1 )
            // InternalVampireLanguage.g:2113:2: rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__VLSBinary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group__0"


    // $ANTLR start "rule__VLSBinary__Group__0__Impl"
    // InternalVampireLanguage.g:2120:1: rule__VLSBinary__Group__0__Impl : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2124:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:2125:1: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:2125:1: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:2126:2: ruleVLSUnitaryFormula
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSUnitaryFormulaParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSUnitaryFormula();

            state._fsp--;

             after(grammarAccess.getVLSBinaryAccess().getVLSUnitaryFormulaParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group__0__Impl"


    // $ANTLR start "rule__VLSBinary__Group__1"
    // InternalVampireLanguage.g:2135:1: rule__VLSBinary__Group__1 : rule__VLSBinary__Group__1__Impl ;
    public final void rule__VLSBinary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2139:1: ( rule__VLSBinary__Group__1__Impl )
            // InternalVampireLanguage.g:2140:2: rule__VLSBinary__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group__1"


    // $ANTLR start "rule__VLSBinary__Group__1__Impl"
    // InternalVampireLanguage.g:2146:1: rule__VLSBinary__Group__1__Impl : ( ( rule__VLSBinary__Alternatives_1 )? ) ;
    public final void rule__VLSBinary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2150:1: ( ( ( rule__VLSBinary__Alternatives_1 )? ) )
            // InternalVampireLanguage.g:2151:1: ( ( rule__VLSBinary__Alternatives_1 )? )
            {
            // InternalVampireLanguage.g:2151:1: ( ( rule__VLSBinary__Alternatives_1 )? )
            // InternalVampireLanguage.g:2152:2: ( rule__VLSBinary__Alternatives_1 )?
            {
             before(grammarAccess.getVLSBinaryAccess().getAlternatives_1()); 
            // InternalVampireLanguage.g:2153:2: ( rule__VLSBinary__Alternatives_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=49 && LA26_0<=56)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVampireLanguage.g:2153:3: rule__VLSBinary__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSBinary__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVLSBinaryAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group__1__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_0__0"
    // InternalVampireLanguage.g:2162:1: rule__VLSBinary__Group_1_0__0 : rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1 ;
    public final void rule__VLSBinary__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2166:1: ( rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1 )
            // InternalVampireLanguage.g:2167:2: rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1
            {
            pushFollow(FOLLOW_10);
            rule__VLSBinary__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0__0"


    // $ANTLR start "rule__VLSBinary__Group_1_0__0__Impl"
    // InternalVampireLanguage.g:2174:1: rule__VLSBinary__Group_1_0__0__Impl : ( ( rule__VLSBinary__Alternatives_1_0_0 ) ) ;
    public final void rule__VLSBinary__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2178:1: ( ( ( rule__VLSBinary__Alternatives_1_0_0 ) ) )
            // InternalVampireLanguage.g:2179:1: ( ( rule__VLSBinary__Alternatives_1_0_0 ) )
            {
            // InternalVampireLanguage.g:2179:1: ( ( rule__VLSBinary__Alternatives_1_0_0 ) )
            // InternalVampireLanguage.g:2180:2: ( rule__VLSBinary__Alternatives_1_0_0 )
            {
             before(grammarAccess.getVLSBinaryAccess().getAlternatives_1_0_0()); 
            // InternalVampireLanguage.g:2181:2: ( rule__VLSBinary__Alternatives_1_0_0 )
            // InternalVampireLanguage.g:2181:3: rule__VLSBinary__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSBinary__Alternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSBinaryAccess().getAlternatives_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0__0__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_0__1"
    // InternalVampireLanguage.g:2189:1: rule__VLSBinary__Group_1_0__1 : rule__VLSBinary__Group_1_0__1__Impl ;
    public final void rule__VLSBinary__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2193:1: ( rule__VLSBinary__Group_1_0__1__Impl )
            // InternalVampireLanguage.g:2194:2: rule__VLSBinary__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0__1"


    // $ANTLR start "rule__VLSBinary__Group_1_0__1__Impl"
    // InternalVampireLanguage.g:2200:1: rule__VLSBinary__Group_1_0__1__Impl : ( ( rule__VLSBinary__RightAssignment_1_0_1 ) ) ;
    public final void rule__VLSBinary__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2204:1: ( ( ( rule__VLSBinary__RightAssignment_1_0_1 ) ) )
            // InternalVampireLanguage.g:2205:1: ( ( rule__VLSBinary__RightAssignment_1_0_1 ) )
            {
            // InternalVampireLanguage.g:2205:1: ( ( rule__VLSBinary__RightAssignment_1_0_1 ) )
            // InternalVampireLanguage.g:2206:2: ( rule__VLSBinary__RightAssignment_1_0_1 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_0_1()); 
            // InternalVampireLanguage.g:2207:2: ( rule__VLSBinary__RightAssignment_1_0_1 )
            // InternalVampireLanguage.g:2207:3: rule__VLSBinary__RightAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSBinary__RightAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0__1__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_0__0"
    // InternalVampireLanguage.g:2216:1: rule__VLSBinary__Group_1_0_0_0__0 : rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1 ;
    public final void rule__VLSBinary__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2220:1: ( rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1 )
            // InternalVampireLanguage.g:2221:2: rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_17);
            rule__VLSBinary__Group_1_0_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_0_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_0__0"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_0__0__Impl"
    // InternalVampireLanguage.g:2228:1: rule__VLSBinary__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2232:1: ( ( () ) )
            // InternalVampireLanguage.g:2233:1: ( () )
            {
            // InternalVampireLanguage.g:2233:1: ( () )
            // InternalVampireLanguage.g:2234:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSEquivalentLeftAction_1_0_0_0_0()); 
            // InternalVampireLanguage.g:2235:2: ()
            // InternalVampireLanguage.g:2235:3: 
            {
            }

             after(grammarAccess.getVLSBinaryAccess().getVLSEquivalentLeftAction_1_0_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_0__1"
    // InternalVampireLanguage.g:2243:1: rule__VLSBinary__Group_1_0_0_0__1 : rule__VLSBinary__Group_1_0_0_0__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2247:1: ( rule__VLSBinary__Group_1_0_0_0__1__Impl )
            // InternalVampireLanguage.g:2248:2: rule__VLSBinary__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_0_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_0__1"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_0__1__Impl"
    // InternalVampireLanguage.g:2254:1: rule__VLSBinary__Group_1_0_0_0__1__Impl : ( '<=>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2258:1: ( ( '<=>' ) )
            // InternalVampireLanguage.g:2259:1: ( '<=>' )
            {
            // InternalVampireLanguage.g:2259:1: ( '<=>' )
            // InternalVampireLanguage.g:2260:2: '<=>'
            {
             before(grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_0_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_1__0"
    // InternalVampireLanguage.g:2270:1: rule__VLSBinary__Group_1_0_0_1__0 : rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1 ;
    public final void rule__VLSBinary__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2274:1: ( rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1 )
            // InternalVampireLanguage.g:2275:2: rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_18);
            rule__VLSBinary__Group_1_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_0_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_1__0"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_1__0__Impl"
    // InternalVampireLanguage.g:2282:1: rule__VLSBinary__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2286:1: ( ( () ) )
            // InternalVampireLanguage.g:2287:1: ( () )
            {
            // InternalVampireLanguage.g:2287:1: ( () )
            // InternalVampireLanguage.g:2288:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSImpliesLeftAction_1_0_0_1_0()); 
            // InternalVampireLanguage.g:2289:2: ()
            // InternalVampireLanguage.g:2289:3: 
            {
            }

             after(grammarAccess.getVLSBinaryAccess().getVLSImpliesLeftAction_1_0_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_1__1"
    // InternalVampireLanguage.g:2297:1: rule__VLSBinary__Group_1_0_0_1__1 : rule__VLSBinary__Group_1_0_0_1__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2301:1: ( rule__VLSBinary__Group_1_0_0_1__1__Impl )
            // InternalVampireLanguage.g:2302:2: rule__VLSBinary__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_0_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_1__1"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_1__1__Impl"
    // InternalVampireLanguage.g:2308:1: rule__VLSBinary__Group_1_0_0_1__1__Impl : ( '=>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2312:1: ( ( '=>' ) )
            // InternalVampireLanguage.g:2313:1: ( '=>' )
            {
            // InternalVampireLanguage.g:2313:1: ( '=>' )
            // InternalVampireLanguage.g:2314:2: '=>'
            {
             before(grammarAccess.getVLSBinaryAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getVLSBinaryAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_2__0"
    // InternalVampireLanguage.g:2324:1: rule__VLSBinary__Group_1_0_0_2__0 : rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1 ;
    public final void rule__VLSBinary__Group_1_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2328:1: ( rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1 )
            // InternalVampireLanguage.g:2329:2: rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1
            {
            pushFollow(FOLLOW_19);
            rule__VLSBinary__Group_1_0_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_0_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_2__0"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_2__0__Impl"
    // InternalVampireLanguage.g:2336:1: rule__VLSBinary__Group_1_0_0_2__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2340:1: ( ( () ) )
            // InternalVampireLanguage.g:2341:1: ( () )
            {
            // InternalVampireLanguage.g:2341:1: ( () )
            // InternalVampireLanguage.g:2342:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSRevImpliesLeftAction_1_0_0_2_0()); 
            // InternalVampireLanguage.g:2343:2: ()
            // InternalVampireLanguage.g:2343:3: 
            {
            }

             after(grammarAccess.getVLSBinaryAccess().getVLSRevImpliesLeftAction_1_0_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_2__0__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_2__1"
    // InternalVampireLanguage.g:2351:1: rule__VLSBinary__Group_1_0_0_2__1 : rule__VLSBinary__Group_1_0_0_2__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2355:1: ( rule__VLSBinary__Group_1_0_0_2__1__Impl )
            // InternalVampireLanguage.g:2356:2: rule__VLSBinary__Group_1_0_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_0_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_2__1"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_2__1__Impl"
    // InternalVampireLanguage.g:2362:1: rule__VLSBinary__Group_1_0_0_2__1__Impl : ( '<=' ) ;
    public final void rule__VLSBinary__Group_1_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2366:1: ( ( '<=' ) )
            // InternalVampireLanguage.g:2367:1: ( '<=' )
            {
            // InternalVampireLanguage.g:2367:1: ( '<=' )
            // InternalVampireLanguage.g:2368:2: '<='
            {
             before(grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignKeyword_1_0_0_2_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignKeyword_1_0_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_2__1__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_3__0"
    // InternalVampireLanguage.g:2378:1: rule__VLSBinary__Group_1_0_0_3__0 : rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1 ;
    public final void rule__VLSBinary__Group_1_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2382:1: ( rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1 )
            // InternalVampireLanguage.g:2383:2: rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1
            {
            pushFollow(FOLLOW_20);
            rule__VLSBinary__Group_1_0_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_0_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_3__0"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_3__0__Impl"
    // InternalVampireLanguage.g:2390:1: rule__VLSBinary__Group_1_0_0_3__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2394:1: ( ( () ) )
            // InternalVampireLanguage.g:2395:1: ( () )
            {
            // InternalVampireLanguage.g:2395:1: ( () )
            // InternalVampireLanguage.g:2396:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSXnorLeftAction_1_0_0_3_0()); 
            // InternalVampireLanguage.g:2397:2: ()
            // InternalVampireLanguage.g:2397:3: 
            {
            }

             after(grammarAccess.getVLSBinaryAccess().getVLSXnorLeftAction_1_0_0_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_3__0__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_3__1"
    // InternalVampireLanguage.g:2405:1: rule__VLSBinary__Group_1_0_0_3__1 : rule__VLSBinary__Group_1_0_0_3__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2409:1: ( rule__VLSBinary__Group_1_0_0_3__1__Impl )
            // InternalVampireLanguage.g:2410:2: rule__VLSBinary__Group_1_0_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_0_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_3__1"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_3__1__Impl"
    // InternalVampireLanguage.g:2416:1: rule__VLSBinary__Group_1_0_0_3__1__Impl : ( '<~>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2420:1: ( ( '<~>' ) )
            // InternalVampireLanguage.g:2421:1: ( '<~>' )
            {
            // InternalVampireLanguage.g:2421:1: ( '<~>' )
            // InternalVampireLanguage.g:2422:2: '<~>'
            {
             before(grammarAccess.getVLSBinaryAccess().getLessThanSignTildeGreaterThanSignKeyword_1_0_0_3_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getVLSBinaryAccess().getLessThanSignTildeGreaterThanSignKeyword_1_0_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_3__1__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_4__0"
    // InternalVampireLanguage.g:2432:1: rule__VLSBinary__Group_1_0_0_4__0 : rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1 ;
    public final void rule__VLSBinary__Group_1_0_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2436:1: ( rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1 )
            // InternalVampireLanguage.g:2437:2: rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1
            {
            pushFollow(FOLLOW_21);
            rule__VLSBinary__Group_1_0_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_0_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_4__0"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_4__0__Impl"
    // InternalVampireLanguage.g:2444:1: rule__VLSBinary__Group_1_0_0_4__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2448:1: ( ( () ) )
            // InternalVampireLanguage.g:2449:1: ( () )
            {
            // InternalVampireLanguage.g:2449:1: ( () )
            // InternalVampireLanguage.g:2450:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSNorLeftAction_1_0_0_4_0()); 
            // InternalVampireLanguage.g:2451:2: ()
            // InternalVampireLanguage.g:2451:3: 
            {
            }

             after(grammarAccess.getVLSBinaryAccess().getVLSNorLeftAction_1_0_0_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_4__0__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_4__1"
    // InternalVampireLanguage.g:2459:1: rule__VLSBinary__Group_1_0_0_4__1 : rule__VLSBinary__Group_1_0_0_4__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2463:1: ( rule__VLSBinary__Group_1_0_0_4__1__Impl )
            // InternalVampireLanguage.g:2464:2: rule__VLSBinary__Group_1_0_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_0_0_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_4__1"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_4__1__Impl"
    // InternalVampireLanguage.g:2470:1: rule__VLSBinary__Group_1_0_0_4__1__Impl : ( '~|' ) ;
    public final void rule__VLSBinary__Group_1_0_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2474:1: ( ( '~|' ) )
            // InternalVampireLanguage.g:2475:1: ( '~|' )
            {
            // InternalVampireLanguage.g:2475:1: ( '~|' )
            // InternalVampireLanguage.g:2476:2: '~|'
            {
             before(grammarAccess.getVLSBinaryAccess().getTildeVerticalLineKeyword_1_0_0_4_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getVLSBinaryAccess().getTildeVerticalLineKeyword_1_0_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_4__1__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_5__0"
    // InternalVampireLanguage.g:2486:1: rule__VLSBinary__Group_1_0_0_5__0 : rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1 ;
    public final void rule__VLSBinary__Group_1_0_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2490:1: ( rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1 )
            // InternalVampireLanguage.g:2491:2: rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1
            {
            pushFollow(FOLLOW_22);
            rule__VLSBinary__Group_1_0_0_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_0_0_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_5__0"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_5__0__Impl"
    // InternalVampireLanguage.g:2498:1: rule__VLSBinary__Group_1_0_0_5__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2502:1: ( ( () ) )
            // InternalVampireLanguage.g:2503:1: ( () )
            {
            // InternalVampireLanguage.g:2503:1: ( () )
            // InternalVampireLanguage.g:2504:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSNandLeftAction_1_0_0_5_0()); 
            // InternalVampireLanguage.g:2505:2: ()
            // InternalVampireLanguage.g:2505:3: 
            {
            }

             after(grammarAccess.getVLSBinaryAccess().getVLSNandLeftAction_1_0_0_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_5__0__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_5__1"
    // InternalVampireLanguage.g:2513:1: rule__VLSBinary__Group_1_0_0_5__1 : rule__VLSBinary__Group_1_0_0_5__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2517:1: ( rule__VLSBinary__Group_1_0_0_5__1__Impl )
            // InternalVampireLanguage.g:2518:2: rule__VLSBinary__Group_1_0_0_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_0_0_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_5__1"


    // $ANTLR start "rule__VLSBinary__Group_1_0_0_5__1__Impl"
    // InternalVampireLanguage.g:2524:1: rule__VLSBinary__Group_1_0_0_5__1__Impl : ( '~&' ) ;
    public final void rule__VLSBinary__Group_1_0_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2528:1: ( ( '~&' ) )
            // InternalVampireLanguage.g:2529:1: ( '~&' )
            {
            // InternalVampireLanguage.g:2529:1: ( '~&' )
            // InternalVampireLanguage.g:2530:2: '~&'
            {
             before(grammarAccess.getVLSBinaryAccess().getTildeAmpersandKeyword_1_0_0_5_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getVLSBinaryAccess().getTildeAmpersandKeyword_1_0_0_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_0_0_5__1__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_1__0"
    // InternalVampireLanguage.g:2540:1: rule__VLSBinary__Group_1_1__0 : rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1 ;
    public final void rule__VLSBinary__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2544:1: ( rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1 )
            // InternalVampireLanguage.g:2545:2: rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1
            {
            pushFollow(FOLLOW_23);
            rule__VLSBinary__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_1__0"


    // $ANTLR start "rule__VLSBinary__Group_1_1__0__Impl"
    // InternalVampireLanguage.g:2552:1: rule__VLSBinary__Group_1_1__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2556:1: ( ( () ) )
            // InternalVampireLanguage.g:2557:1: ( () )
            {
            // InternalVampireLanguage.g:2557:1: ( () )
            // InternalVampireLanguage.g:2558:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSAndLeftAction_1_1_0()); 
            // InternalVampireLanguage.g:2559:2: ()
            // InternalVampireLanguage.g:2559:3: 
            {
            }

             after(grammarAccess.getVLSBinaryAccess().getVLSAndLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_1__0__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_1__1"
    // InternalVampireLanguage.g:2567:1: rule__VLSBinary__Group_1_1__1 : rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2 ;
    public final void rule__VLSBinary__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2571:1: ( rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2 )
            // InternalVampireLanguage.g:2572:2: rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2
            {
            pushFollow(FOLLOW_10);
            rule__VLSBinary__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_1__1"


    // $ANTLR start "rule__VLSBinary__Group_1_1__1__Impl"
    // InternalVampireLanguage.g:2579:1: rule__VLSBinary__Group_1_1__1__Impl : ( '&' ) ;
    public final void rule__VLSBinary__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2583:1: ( ( '&' ) )
            // InternalVampireLanguage.g:2584:1: ( '&' )
            {
            // InternalVampireLanguage.g:2584:1: ( '&' )
            // InternalVampireLanguage.g:2585:2: '&'
            {
             before(grammarAccess.getVLSBinaryAccess().getAmpersandKeyword_1_1_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getVLSBinaryAccess().getAmpersandKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_1__1__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_1__2"
    // InternalVampireLanguage.g:2594:1: rule__VLSBinary__Group_1_1__2 : rule__VLSBinary__Group_1_1__2__Impl ;
    public final void rule__VLSBinary__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2598:1: ( rule__VLSBinary__Group_1_1__2__Impl )
            // InternalVampireLanguage.g:2599:2: rule__VLSBinary__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_1__2"


    // $ANTLR start "rule__VLSBinary__Group_1_1__2__Impl"
    // InternalVampireLanguage.g:2605:1: rule__VLSBinary__Group_1_1__2__Impl : ( ( rule__VLSBinary__RightAssignment_1_1_2 ) ) ;
    public final void rule__VLSBinary__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2609:1: ( ( ( rule__VLSBinary__RightAssignment_1_1_2 ) ) )
            // InternalVampireLanguage.g:2610:1: ( ( rule__VLSBinary__RightAssignment_1_1_2 ) )
            {
            // InternalVampireLanguage.g:2610:1: ( ( rule__VLSBinary__RightAssignment_1_1_2 ) )
            // InternalVampireLanguage.g:2611:2: ( rule__VLSBinary__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_1_2()); 
            // InternalVampireLanguage.g:2612:2: ( rule__VLSBinary__RightAssignment_1_1_2 )
            // InternalVampireLanguage.g:2612:3: rule__VLSBinary__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__VLSBinary__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_1__2__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_2__0"
    // InternalVampireLanguage.g:2621:1: rule__VLSBinary__Group_1_2__0 : rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1 ;
    public final void rule__VLSBinary__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2625:1: ( rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1 )
            // InternalVampireLanguage.g:2626:2: rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1
            {
            pushFollow(FOLLOW_24);
            rule__VLSBinary__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_2__0"


    // $ANTLR start "rule__VLSBinary__Group_1_2__0__Impl"
    // InternalVampireLanguage.g:2633:1: rule__VLSBinary__Group_1_2__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2637:1: ( ( () ) )
            // InternalVampireLanguage.g:2638:1: ( () )
            {
            // InternalVampireLanguage.g:2638:1: ( () )
            // InternalVampireLanguage.g:2639:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSOrLeftAction_1_2_0()); 
            // InternalVampireLanguage.g:2640:2: ()
            // InternalVampireLanguage.g:2640:3: 
            {
            }

             after(grammarAccess.getVLSBinaryAccess().getVLSOrLeftAction_1_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_2__0__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_2__1"
    // InternalVampireLanguage.g:2648:1: rule__VLSBinary__Group_1_2__1 : rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2 ;
    public final void rule__VLSBinary__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2652:1: ( rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2 )
            // InternalVampireLanguage.g:2653:2: rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2
            {
            pushFollow(FOLLOW_10);
            rule__VLSBinary__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_2__1"


    // $ANTLR start "rule__VLSBinary__Group_1_2__1__Impl"
    // InternalVampireLanguage.g:2660:1: rule__VLSBinary__Group_1_2__1__Impl : ( '|' ) ;
    public final void rule__VLSBinary__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2664:1: ( ( '|' ) )
            // InternalVampireLanguage.g:2665:1: ( '|' )
            {
            // InternalVampireLanguage.g:2665:1: ( '|' )
            // InternalVampireLanguage.g:2666:2: '|'
            {
             before(grammarAccess.getVLSBinaryAccess().getVerticalLineKeyword_1_2_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getVLSBinaryAccess().getVerticalLineKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_2__1__Impl"


    // $ANTLR start "rule__VLSBinary__Group_1_2__2"
    // InternalVampireLanguage.g:2675:1: rule__VLSBinary__Group_1_2__2 : rule__VLSBinary__Group_1_2__2__Impl ;
    public final void rule__VLSBinary__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2679:1: ( rule__VLSBinary__Group_1_2__2__Impl )
            // InternalVampireLanguage.g:2680:2: rule__VLSBinary__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSBinary__Group_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_2__2"


    // $ANTLR start "rule__VLSBinary__Group_1_2__2__Impl"
    // InternalVampireLanguage.g:2686:1: rule__VLSBinary__Group_1_2__2__Impl : ( ( rule__VLSBinary__RightAssignment_1_2_2 ) ) ;
    public final void rule__VLSBinary__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2690:1: ( ( ( rule__VLSBinary__RightAssignment_1_2_2 ) ) )
            // InternalVampireLanguage.g:2691:1: ( ( rule__VLSBinary__RightAssignment_1_2_2 ) )
            {
            // InternalVampireLanguage.g:2691:1: ( ( rule__VLSBinary__RightAssignment_1_2_2 ) )
            // InternalVampireLanguage.g:2692:2: ( rule__VLSBinary__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_2_2()); 
            // InternalVampireLanguage.g:2693:2: ( rule__VLSBinary__RightAssignment_1_2_2 )
            // InternalVampireLanguage.g:2693:3: rule__VLSBinary__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__VLSBinary__RightAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__Group_1_2__2__Impl"


    // $ANTLR start "rule__VLSUnitaryFormula__Group_4__0"
    // InternalVampireLanguage.g:2702:1: rule__VLSUnitaryFormula__Group_4__0 : rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1 ;
    public final void rule__VLSUnitaryFormula__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2706:1: ( rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1 )
            // InternalVampireLanguage.g:2707:2: rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__VLSUnitaryFormula__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUnitaryFormula__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnitaryFormula__Group_4__0"


    // $ANTLR start "rule__VLSUnitaryFormula__Group_4__0__Impl"
    // InternalVampireLanguage.g:2714:1: rule__VLSUnitaryFormula__Group_4__0__Impl : ( '(' ) ;
    public final void rule__VLSUnitaryFormula__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2718:1: ( ( '(' ) )
            // InternalVampireLanguage.g:2719:1: ( '(' )
            {
            // InternalVampireLanguage.g:2719:1: ( '(' )
            // InternalVampireLanguage.g:2720:2: '('
            {
             before(grammarAccess.getVLSUnitaryFormulaAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getVLSUnitaryFormulaAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnitaryFormula__Group_4__0__Impl"


    // $ANTLR start "rule__VLSUnitaryFormula__Group_4__1"
    // InternalVampireLanguage.g:2729:1: rule__VLSUnitaryFormula__Group_4__1 : rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2 ;
    public final void rule__VLSUnitaryFormula__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2733:1: ( rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2 )
            // InternalVampireLanguage.g:2734:2: rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2
            {
            pushFollow(FOLLOW_14);
            rule__VLSUnitaryFormula__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUnitaryFormula__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnitaryFormula__Group_4__1"


    // $ANTLR start "rule__VLSUnitaryFormula__Group_4__1__Impl"
    // InternalVampireLanguage.g:2741:1: rule__VLSUnitaryFormula__Group_4__1__Impl : ( ruleVLSTerm ) ;
    public final void rule__VLSUnitaryFormula__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2745:1: ( ( ruleVLSTerm ) )
            // InternalVampireLanguage.g:2746:1: ( ruleVLSTerm )
            {
            // InternalVampireLanguage.g:2746:1: ( ruleVLSTerm )
            // InternalVampireLanguage.g:2747:2: ruleVLSTerm
            {
             before(grammarAccess.getVLSUnitaryFormulaAccess().getVLSTermParserRuleCall_4_1()); 
            pushFollow(FOLLOW_2);
            ruleVLSTerm();

            state._fsp--;

             after(grammarAccess.getVLSUnitaryFormulaAccess().getVLSTermParserRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnitaryFormula__Group_4__1__Impl"


    // $ANTLR start "rule__VLSUnitaryFormula__Group_4__2"
    // InternalVampireLanguage.g:2756:1: rule__VLSUnitaryFormula__Group_4__2 : rule__VLSUnitaryFormula__Group_4__2__Impl ;
    public final void rule__VLSUnitaryFormula__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2760:1: ( rule__VLSUnitaryFormula__Group_4__2__Impl )
            // InternalVampireLanguage.g:2761:2: rule__VLSUnitaryFormula__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnitaryFormula__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnitaryFormula__Group_4__2"


    // $ANTLR start "rule__VLSUnitaryFormula__Group_4__2__Impl"
    // InternalVampireLanguage.g:2767:1: rule__VLSUnitaryFormula__Group_4__2__Impl : ( ')' ) ;
    public final void rule__VLSUnitaryFormula__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2771:1: ( ( ')' ) )
            // InternalVampireLanguage.g:2772:1: ( ')' )
            {
            // InternalVampireLanguage.g:2772:1: ( ')' )
            // InternalVampireLanguage.g:2773:2: ')'
            {
             before(grammarAccess.getVLSUnitaryFormulaAccess().getRightParenthesisKeyword_4_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVLSUnitaryFormulaAccess().getRightParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnitaryFormula__Group_4__2__Impl"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group__0"
    // InternalVampireLanguage.g:2783:1: rule__VLSUniversalQuantifier__Group__0 : rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1 ;
    public final void rule__VLSUniversalQuantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2787:1: ( rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1 )
            // InternalVampireLanguage.g:2788:2: rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__VLSUniversalQuantifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group__0"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group__0__Impl"
    // InternalVampireLanguage.g:2795:1: rule__VLSUniversalQuantifier__Group__0__Impl : ( () ) ;
    public final void rule__VLSUniversalQuantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2799:1: ( ( () ) )
            // InternalVampireLanguage.g:2800:1: ( () )
            {
            // InternalVampireLanguage.g:2800:1: ( () )
            // InternalVampireLanguage.g:2801:2: ()
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVLSUniversalQuantifierAction_0()); 
            // InternalVampireLanguage.g:2802:2: ()
            // InternalVampireLanguage.g:2802:3: 
            {
            }

             after(grammarAccess.getVLSUniversalQuantifierAccess().getVLSUniversalQuantifierAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group__0__Impl"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group__1"
    // InternalVampireLanguage.g:2810:1: rule__VLSUniversalQuantifier__Group__1 : rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2 ;
    public final void rule__VLSUniversalQuantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2814:1: ( rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2 )
            // InternalVampireLanguage.g:2815:2: rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__VLSUniversalQuantifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group__1"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group__1__Impl"
    // InternalVampireLanguage.g:2822:1: rule__VLSUniversalQuantifier__Group__1__Impl : ( ( rule__VLSUniversalQuantifier__Group_1__0 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2826:1: ( ( ( rule__VLSUniversalQuantifier__Group_1__0 ) ) )
            // InternalVampireLanguage.g:2827:1: ( ( rule__VLSUniversalQuantifier__Group_1__0 ) )
            {
            // InternalVampireLanguage.g:2827:1: ( ( rule__VLSUniversalQuantifier__Group_1__0 ) )
            // InternalVampireLanguage.g:2828:2: ( rule__VLSUniversalQuantifier__Group_1__0 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup_1()); 
            // InternalVampireLanguage.g:2829:2: ( rule__VLSUniversalQuantifier__Group_1__0 )
            // InternalVampireLanguage.g:2829:3: rule__VLSUniversalQuantifier__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSUniversalQuantifierAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group__1__Impl"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group__2"
    // InternalVampireLanguage.g:2837:1: rule__VLSUniversalQuantifier__Group__2 : rule__VLSUniversalQuantifier__Group__2__Impl ;
    public final void rule__VLSUniversalQuantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2841:1: ( rule__VLSUniversalQuantifier__Group__2__Impl )
            // InternalVampireLanguage.g:2842:2: rule__VLSUniversalQuantifier__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group__2"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group__2__Impl"
    // InternalVampireLanguage.g:2848:1: rule__VLSUniversalQuantifier__Group__2__Impl : ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2852:1: ( ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:2853:1: ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:2853:1: ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:2854:2: ( rule__VLSUniversalQuantifier__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:2855:2: ( rule__VLSUniversalQuantifier__OperandAssignment_2 )
            // InternalVampireLanguage.g:2855:3: rule__VLSUniversalQuantifier__OperandAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__OperandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVLSUniversalQuantifierAccess().getOperandAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group__2__Impl"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group_1__0"
    // InternalVampireLanguage.g:2864:1: rule__VLSUniversalQuantifier__Group_1__0 : rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1 ;
    public final void rule__VLSUniversalQuantifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2868:1: ( rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1 )
            // InternalVampireLanguage.g:2869:2: rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__VLSUniversalQuantifier__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group_1__0"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group_1__0__Impl"
    // InternalVampireLanguage.g:2876:1: rule__VLSUniversalQuantifier__Group_1__0__Impl : ( '!' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2880:1: ( ( '!' ) )
            // InternalVampireLanguage.g:2881:1: ( '!' )
            {
            // InternalVampireLanguage.g:2881:1: ( '!' )
            // InternalVampireLanguage.g:2882:2: '!'
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getExclamationMarkKeyword_1_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getVLSUniversalQuantifierAccess().getExclamationMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group_1__0__Impl"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group_1__1"
    // InternalVampireLanguage.g:2891:1: rule__VLSUniversalQuantifier__Group_1__1 : rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2 ;
    public final void rule__VLSUniversalQuantifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2895:1: ( rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2 )
            // InternalVampireLanguage.g:2896:2: rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__VLSUniversalQuantifier__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group_1__1"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group_1__1__Impl"
    // InternalVampireLanguage.g:2903:1: rule__VLSUniversalQuantifier__Group_1__1__Impl : ( '[' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2907:1: ( ( '[' ) )
            // InternalVampireLanguage.g:2908:1: ( '[' )
            {
            // InternalVampireLanguage.g:2908:1: ( '[' )
            // InternalVampireLanguage.g:2909:2: '['
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getVLSUniversalQuantifierAccess().getLeftSquareBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group_1__1__Impl"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group_1__2"
    // InternalVampireLanguage.g:2918:1: rule__VLSUniversalQuantifier__Group_1__2 : rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3 ;
    public final void rule__VLSUniversalQuantifier__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2922:1: ( rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3 )
            // InternalVampireLanguage.g:2923:2: rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3
            {
            pushFollow(FOLLOW_28);
            rule__VLSUniversalQuantifier__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group_1__2"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group_1__2__Impl"
    // InternalVampireLanguage.g:2930:1: rule__VLSUniversalQuantifier__Group_1__2__Impl : ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2934:1: ( ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) ) )
            // InternalVampireLanguage.g:2935:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) )
            {
            // InternalVampireLanguage.g:2935:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) )
            // InternalVampireLanguage.g:2936:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAssignment_1_2()); 
            // InternalVampireLanguage.g:2937:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 )
            // InternalVampireLanguage.g:2937:3: rule__VLSUniversalQuantifier__VariablesAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__VariablesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group_1__2__Impl"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group_1__3"
    // InternalVampireLanguage.g:2945:1: rule__VLSUniversalQuantifier__Group_1__3 : rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4 ;
    public final void rule__VLSUniversalQuantifier__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2949:1: ( rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4 )
            // InternalVampireLanguage.g:2950:2: rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4
            {
            pushFollow(FOLLOW_28);
            rule__VLSUniversalQuantifier__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group_1__3"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group_1__3__Impl"
    // InternalVampireLanguage.g:2957:1: rule__VLSUniversalQuantifier__Group_1__3__Impl : ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2961:1: ( ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* ) )
            // InternalVampireLanguage.g:2962:1: ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* )
            {
            // InternalVampireLanguage.g:2962:1: ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* )
            // InternalVampireLanguage.g:2963:2: ( rule__VLSUniversalQuantifier__Group_1_3__0 )*
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup_1_3()); 
            // InternalVampireLanguage.g:2964:2: ( rule__VLSUniversalQuantifier__Group_1_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==44) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalVampireLanguage.g:2964:3: rule__VLSUniversalQuantifier__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__VLSUniversalQuantifier__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getVLSUniversalQuantifierAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group_1__3__Impl"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group_1__4"
    // InternalVampireLanguage.g:2972:1: rule__VLSUniversalQuantifier__Group_1__4 : rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5 ;
    public final void rule__VLSUniversalQuantifier__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2976:1: ( rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5 )
            // InternalVampireLanguage.g:2977:2: rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5
            {
            pushFollow(FOLLOW_29);
            rule__VLSUniversalQuantifier__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group_1__4"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group_1__4__Impl"
    // InternalVampireLanguage.g:2984:1: rule__VLSUniversalQuantifier__Group_1__4__Impl : ( ']' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2988:1: ( ( ']' ) )
            // InternalVampireLanguage.g:2989:1: ( ']' )
            {
            // InternalVampireLanguage.g:2989:1: ( ']' )
            // InternalVampireLanguage.g:2990:2: ']'
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getVLSUniversalQuantifierAccess().getRightSquareBracketKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group_1__4__Impl"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group_1__5"
    // InternalVampireLanguage.g:2999:1: rule__VLSUniversalQuantifier__Group_1__5 : rule__VLSUniversalQuantifier__Group_1__5__Impl ;
    public final void rule__VLSUniversalQuantifier__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3003:1: ( rule__VLSUniversalQuantifier__Group_1__5__Impl )
            // InternalVampireLanguage.g:3004:2: rule__VLSUniversalQuantifier__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group_1__5"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group_1__5__Impl"
    // InternalVampireLanguage.g:3010:1: rule__VLSUniversalQuantifier__Group_1__5__Impl : ( ':' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3014:1: ( ( ':' ) )
            // InternalVampireLanguage.g:3015:1: ( ':' )
            {
            // InternalVampireLanguage.g:3015:1: ( ':' )
            // InternalVampireLanguage.g:3016:2: ':'
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getColonKeyword_1_5()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getVLSUniversalQuantifierAccess().getColonKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group_1__5__Impl"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group_1_3__0"
    // InternalVampireLanguage.g:3026:1: rule__VLSUniversalQuantifier__Group_1_3__0 : rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1 ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3030:1: ( rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1 )
            // InternalVampireLanguage.g:3031:2: rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1
            {
            pushFollow(FOLLOW_27);
            rule__VLSUniversalQuantifier__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group_1_3__0"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group_1_3__0__Impl"
    // InternalVampireLanguage.g:3038:1: rule__VLSUniversalQuantifier__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3042:1: ( ( ',' ) )
            // InternalVampireLanguage.g:3043:1: ( ',' )
            {
            // InternalVampireLanguage.g:3043:1: ( ',' )
            // InternalVampireLanguage.g:3044:2: ','
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getCommaKeyword_1_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVLSUniversalQuantifierAccess().getCommaKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group_1_3__0__Impl"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group_1_3__1"
    // InternalVampireLanguage.g:3053:1: rule__VLSUniversalQuantifier__Group_1_3__1 : rule__VLSUniversalQuantifier__Group_1_3__1__Impl ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3057:1: ( rule__VLSUniversalQuantifier__Group_1_3__1__Impl )
            // InternalVampireLanguage.g:3058:2: rule__VLSUniversalQuantifier__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group_1_3__1"


    // $ANTLR start "rule__VLSUniversalQuantifier__Group_1_3__1__Impl"
    // InternalVampireLanguage.g:3064:1: rule__VLSUniversalQuantifier__Group_1_3__1__Impl : ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3068:1: ( ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) ) )
            // InternalVampireLanguage.g:3069:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) )
            {
            // InternalVampireLanguage.g:3069:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) )
            // InternalVampireLanguage.g:3070:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAssignment_1_3_1()); 
            // InternalVampireLanguage.g:3071:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 )
            // InternalVampireLanguage.g:3071:3: rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__Group_1_3__1__Impl"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group__0"
    // InternalVampireLanguage.g:3080:1: rule__VLSExistentialQuantifier__Group__0 : rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1 ;
    public final void rule__VLSExistentialQuantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3084:1: ( rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1 )
            // InternalVampireLanguage.g:3085:2: rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__VLSExistentialQuantifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group__0"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group__0__Impl"
    // InternalVampireLanguage.g:3092:1: rule__VLSExistentialQuantifier__Group__0__Impl : ( () ) ;
    public final void rule__VLSExistentialQuantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3096:1: ( ( () ) )
            // InternalVampireLanguage.g:3097:1: ( () )
            {
            // InternalVampireLanguage.g:3097:1: ( () )
            // InternalVampireLanguage.g:3098:2: ()
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVLSExistentialQuantifierAction_0()); 
            // InternalVampireLanguage.g:3099:2: ()
            // InternalVampireLanguage.g:3099:3: 
            {
            }

             after(grammarAccess.getVLSExistentialQuantifierAccess().getVLSExistentialQuantifierAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group__0__Impl"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group__1"
    // InternalVampireLanguage.g:3107:1: rule__VLSExistentialQuantifier__Group__1 : rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2 ;
    public final void rule__VLSExistentialQuantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3111:1: ( rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2 )
            // InternalVampireLanguage.g:3112:2: rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__VLSExistentialQuantifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group__1"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group__1__Impl"
    // InternalVampireLanguage.g:3119:1: rule__VLSExistentialQuantifier__Group__1__Impl : ( ( rule__VLSExistentialQuantifier__Group_1__0 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3123:1: ( ( ( rule__VLSExistentialQuantifier__Group_1__0 ) ) )
            // InternalVampireLanguage.g:3124:1: ( ( rule__VLSExistentialQuantifier__Group_1__0 ) )
            {
            // InternalVampireLanguage.g:3124:1: ( ( rule__VLSExistentialQuantifier__Group_1__0 ) )
            // InternalVampireLanguage.g:3125:2: ( rule__VLSExistentialQuantifier__Group_1__0 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup_1()); 
            // InternalVampireLanguage.g:3126:2: ( rule__VLSExistentialQuantifier__Group_1__0 )
            // InternalVampireLanguage.g:3126:3: rule__VLSExistentialQuantifier__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSExistentialQuantifierAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group__1__Impl"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group__2"
    // InternalVampireLanguage.g:3134:1: rule__VLSExistentialQuantifier__Group__2 : rule__VLSExistentialQuantifier__Group__2__Impl ;
    public final void rule__VLSExistentialQuantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3138:1: ( rule__VLSExistentialQuantifier__Group__2__Impl )
            // InternalVampireLanguage.g:3139:2: rule__VLSExistentialQuantifier__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group__2"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group__2__Impl"
    // InternalVampireLanguage.g:3145:1: rule__VLSExistentialQuantifier__Group__2__Impl : ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3149:1: ( ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:3150:1: ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:3150:1: ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:3151:2: ( rule__VLSExistentialQuantifier__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:3152:2: ( rule__VLSExistentialQuantifier__OperandAssignment_2 )
            // InternalVampireLanguage.g:3152:3: rule__VLSExistentialQuantifier__OperandAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__OperandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVLSExistentialQuantifierAccess().getOperandAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group__2__Impl"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group_1__0"
    // InternalVampireLanguage.g:3161:1: rule__VLSExistentialQuantifier__Group_1__0 : rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1 ;
    public final void rule__VLSExistentialQuantifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3165:1: ( rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1 )
            // InternalVampireLanguage.g:3166:2: rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__VLSExistentialQuantifier__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group_1__0"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group_1__0__Impl"
    // InternalVampireLanguage.g:3173:1: rule__VLSExistentialQuantifier__Group_1__0__Impl : ( '?' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3177:1: ( ( '?' ) )
            // InternalVampireLanguage.g:3178:1: ( '?' )
            {
            // InternalVampireLanguage.g:3178:1: ( '?' )
            // InternalVampireLanguage.g:3179:2: '?'
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getQuestionMarkKeyword_1_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getVLSExistentialQuantifierAccess().getQuestionMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group_1__0__Impl"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group_1__1"
    // InternalVampireLanguage.g:3188:1: rule__VLSExistentialQuantifier__Group_1__1 : rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2 ;
    public final void rule__VLSExistentialQuantifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3192:1: ( rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2 )
            // InternalVampireLanguage.g:3193:2: rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__VLSExistentialQuantifier__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group_1__1"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group_1__1__Impl"
    // InternalVampireLanguage.g:3200:1: rule__VLSExistentialQuantifier__Group_1__1__Impl : ( '[' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3204:1: ( ( '[' ) )
            // InternalVampireLanguage.g:3205:1: ( '[' )
            {
            // InternalVampireLanguage.g:3205:1: ( '[' )
            // InternalVampireLanguage.g:3206:2: '['
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getVLSExistentialQuantifierAccess().getLeftSquareBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group_1__1__Impl"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group_1__2"
    // InternalVampireLanguage.g:3215:1: rule__VLSExistentialQuantifier__Group_1__2 : rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3 ;
    public final void rule__VLSExistentialQuantifier__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3219:1: ( rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3 )
            // InternalVampireLanguage.g:3220:2: rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3
            {
            pushFollow(FOLLOW_28);
            rule__VLSExistentialQuantifier__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group_1__2"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group_1__2__Impl"
    // InternalVampireLanguage.g:3227:1: rule__VLSExistentialQuantifier__Group_1__2__Impl : ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3231:1: ( ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) ) )
            // InternalVampireLanguage.g:3232:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) )
            {
            // InternalVampireLanguage.g:3232:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) )
            // InternalVampireLanguage.g:3233:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAssignment_1_2()); 
            // InternalVampireLanguage.g:3234:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 )
            // InternalVampireLanguage.g:3234:3: rule__VLSExistentialQuantifier__VariablesAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__VariablesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group_1__2__Impl"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group_1__3"
    // InternalVampireLanguage.g:3242:1: rule__VLSExistentialQuantifier__Group_1__3 : rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4 ;
    public final void rule__VLSExistentialQuantifier__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3246:1: ( rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4 )
            // InternalVampireLanguage.g:3247:2: rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4
            {
            pushFollow(FOLLOW_28);
            rule__VLSExistentialQuantifier__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group_1__3"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group_1__3__Impl"
    // InternalVampireLanguage.g:3254:1: rule__VLSExistentialQuantifier__Group_1__3__Impl : ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3258:1: ( ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* ) )
            // InternalVampireLanguage.g:3259:1: ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* )
            {
            // InternalVampireLanguage.g:3259:1: ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* )
            // InternalVampireLanguage.g:3260:2: ( rule__VLSExistentialQuantifier__Group_1_3__0 )*
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup_1_3()); 
            // InternalVampireLanguage.g:3261:2: ( rule__VLSExistentialQuantifier__Group_1_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==44) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalVampireLanguage.g:3261:3: rule__VLSExistentialQuantifier__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__VLSExistentialQuantifier__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getVLSExistentialQuantifierAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group_1__3__Impl"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group_1__4"
    // InternalVampireLanguage.g:3269:1: rule__VLSExistentialQuantifier__Group_1__4 : rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5 ;
    public final void rule__VLSExistentialQuantifier__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3273:1: ( rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5 )
            // InternalVampireLanguage.g:3274:2: rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5
            {
            pushFollow(FOLLOW_29);
            rule__VLSExistentialQuantifier__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group_1__4"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group_1__4__Impl"
    // InternalVampireLanguage.g:3281:1: rule__VLSExistentialQuantifier__Group_1__4__Impl : ( ']' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3285:1: ( ( ']' ) )
            // InternalVampireLanguage.g:3286:1: ( ']' )
            {
            // InternalVampireLanguage.g:3286:1: ( ']' )
            // InternalVampireLanguage.g:3287:2: ']'
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getVLSExistentialQuantifierAccess().getRightSquareBracketKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group_1__4__Impl"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group_1__5"
    // InternalVampireLanguage.g:3296:1: rule__VLSExistentialQuantifier__Group_1__5 : rule__VLSExistentialQuantifier__Group_1__5__Impl ;
    public final void rule__VLSExistentialQuantifier__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3300:1: ( rule__VLSExistentialQuantifier__Group_1__5__Impl )
            // InternalVampireLanguage.g:3301:2: rule__VLSExistentialQuantifier__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group_1__5"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group_1__5__Impl"
    // InternalVampireLanguage.g:3307:1: rule__VLSExistentialQuantifier__Group_1__5__Impl : ( ':' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3311:1: ( ( ':' ) )
            // InternalVampireLanguage.g:3312:1: ( ':' )
            {
            // InternalVampireLanguage.g:3312:1: ( ':' )
            // InternalVampireLanguage.g:3313:2: ':'
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getColonKeyword_1_5()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getVLSExistentialQuantifierAccess().getColonKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group_1__5__Impl"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group_1_3__0"
    // InternalVampireLanguage.g:3323:1: rule__VLSExistentialQuantifier__Group_1_3__0 : rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1 ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3327:1: ( rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1 )
            // InternalVampireLanguage.g:3328:2: rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1
            {
            pushFollow(FOLLOW_27);
            rule__VLSExistentialQuantifier__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group_1_3__0"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group_1_3__0__Impl"
    // InternalVampireLanguage.g:3335:1: rule__VLSExistentialQuantifier__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3339:1: ( ( ',' ) )
            // InternalVampireLanguage.g:3340:1: ( ',' )
            {
            // InternalVampireLanguage.g:3340:1: ( ',' )
            // InternalVampireLanguage.g:3341:2: ','
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getCommaKeyword_1_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVLSExistentialQuantifierAccess().getCommaKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group_1_3__0__Impl"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group_1_3__1"
    // InternalVampireLanguage.g:3350:1: rule__VLSExistentialQuantifier__Group_1_3__1 : rule__VLSExistentialQuantifier__Group_1_3__1__Impl ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3354:1: ( rule__VLSExistentialQuantifier__Group_1_3__1__Impl )
            // InternalVampireLanguage.g:3355:2: rule__VLSExistentialQuantifier__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group_1_3__1"


    // $ANTLR start "rule__VLSExistentialQuantifier__Group_1_3__1__Impl"
    // InternalVampireLanguage.g:3361:1: rule__VLSExistentialQuantifier__Group_1_3__1__Impl : ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3365:1: ( ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) ) )
            // InternalVampireLanguage.g:3366:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) )
            {
            // InternalVampireLanguage.g:3366:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) )
            // InternalVampireLanguage.g:3367:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAssignment_1_3_1()); 
            // InternalVampireLanguage.g:3368:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 )
            // InternalVampireLanguage.g:3368:3: rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__Group_1_3__1__Impl"


    // $ANTLR start "rule__VLSUnaryNegation__Group__0"
    // InternalVampireLanguage.g:3377:1: rule__VLSUnaryNegation__Group__0 : rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1 ;
    public final void rule__VLSUnaryNegation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3381:1: ( rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1 )
            // InternalVampireLanguage.g:3382:2: rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__VLSUnaryNegation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUnaryNegation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryNegation__Group__0"


    // $ANTLR start "rule__VLSUnaryNegation__Group__0__Impl"
    // InternalVampireLanguage.g:3389:1: rule__VLSUnaryNegation__Group__0__Impl : ( () ) ;
    public final void rule__VLSUnaryNegation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3393:1: ( ( () ) )
            // InternalVampireLanguage.g:3394:1: ( () )
            {
            // InternalVampireLanguage.g:3394:1: ( () )
            // InternalVampireLanguage.g:3395:2: ()
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getVLSUnaryNegationAction_0()); 
            // InternalVampireLanguage.g:3396:2: ()
            // InternalVampireLanguage.g:3396:3: 
            {
            }

             after(grammarAccess.getVLSUnaryNegationAccess().getVLSUnaryNegationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryNegation__Group__0__Impl"


    // $ANTLR start "rule__VLSUnaryNegation__Group__1"
    // InternalVampireLanguage.g:3404:1: rule__VLSUnaryNegation__Group__1 : rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2 ;
    public final void rule__VLSUnaryNegation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3408:1: ( rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2 )
            // InternalVampireLanguage.g:3409:2: rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__VLSUnaryNegation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUnaryNegation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryNegation__Group__1"


    // $ANTLR start "rule__VLSUnaryNegation__Group__1__Impl"
    // InternalVampireLanguage.g:3416:1: rule__VLSUnaryNegation__Group__1__Impl : ( '~' ) ;
    public final void rule__VLSUnaryNegation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3420:1: ( ( '~' ) )
            // InternalVampireLanguage.g:3421:1: ( '~' )
            {
            // InternalVampireLanguage.g:3421:1: ( '~' )
            // InternalVampireLanguage.g:3422:2: '~'
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getTildeKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getVLSUnaryNegationAccess().getTildeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryNegation__Group__1__Impl"


    // $ANTLR start "rule__VLSUnaryNegation__Group__2"
    // InternalVampireLanguage.g:3431:1: rule__VLSUnaryNegation__Group__2 : rule__VLSUnaryNegation__Group__2__Impl ;
    public final void rule__VLSUnaryNegation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3435:1: ( rule__VLSUnaryNegation__Group__2__Impl )
            // InternalVampireLanguage.g:3436:2: rule__VLSUnaryNegation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnaryNegation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryNegation__Group__2"


    // $ANTLR start "rule__VLSUnaryNegation__Group__2__Impl"
    // InternalVampireLanguage.g:3442:1: rule__VLSUnaryNegation__Group__2__Impl : ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) ) ;
    public final void rule__VLSUnaryNegation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3446:1: ( ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:3447:1: ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:3447:1: ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:3448:2: ( rule__VLSUnaryNegation__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:3449:2: ( rule__VLSUnaryNegation__OperandAssignment_2 )
            // InternalVampireLanguage.g:3449:3: rule__VLSUnaryNegation__OperandAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnaryNegation__OperandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVLSUnaryNegationAccess().getOperandAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryNegation__Group__2__Impl"


    // $ANTLR start "rule__VLSUnaryInfix__Group__0"
    // InternalVampireLanguage.g:3458:1: rule__VLSUnaryInfix__Group__0 : rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1 ;
    public final void rule__VLSUnaryInfix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3462:1: ( rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1 )
            // InternalVampireLanguage.g:3463:2: rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__VLSUnaryInfix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUnaryInfix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group__0"


    // $ANTLR start "rule__VLSUnaryInfix__Group__0__Impl"
    // InternalVampireLanguage.g:3470:1: rule__VLSUnaryInfix__Group__0__Impl : ( ruleVLSAtomic ) ;
    public final void rule__VLSUnaryInfix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3474:1: ( ( ruleVLSAtomic ) )
            // InternalVampireLanguage.g:3475:1: ( ruleVLSAtomic )
            {
            // InternalVampireLanguage.g:3475:1: ( ruleVLSAtomic )
            // InternalVampireLanguage.g:3476:2: ruleVLSAtomic
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSAtomicParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSAtomic();

            state._fsp--;

             after(grammarAccess.getVLSUnaryInfixAccess().getVLSAtomicParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group__0__Impl"


    // $ANTLR start "rule__VLSUnaryInfix__Group__1"
    // InternalVampireLanguage.g:3485:1: rule__VLSUnaryInfix__Group__1 : rule__VLSUnaryInfix__Group__1__Impl ;
    public final void rule__VLSUnaryInfix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3489:1: ( rule__VLSUnaryInfix__Group__1__Impl )
            // InternalVampireLanguage.g:3490:2: rule__VLSUnaryInfix__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnaryInfix__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group__1"


    // $ANTLR start "rule__VLSUnaryInfix__Group__1__Impl"
    // InternalVampireLanguage.g:3496:1: rule__VLSUnaryInfix__Group__1__Impl : ( ( rule__VLSUnaryInfix__Group_1__0 )? ) ;
    public final void rule__VLSUnaryInfix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3500:1: ( ( ( rule__VLSUnaryInfix__Group_1__0 )? ) )
            // InternalVampireLanguage.g:3501:1: ( ( rule__VLSUnaryInfix__Group_1__0 )? )
            {
            // InternalVampireLanguage.g:3501:1: ( ( rule__VLSUnaryInfix__Group_1__0 )? )
            // InternalVampireLanguage.g:3502:2: ( rule__VLSUnaryInfix__Group_1__0 )?
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1()); 
            // InternalVampireLanguage.g:3503:2: ( rule__VLSUnaryInfix__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=61 && LA29_0<=63)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVampireLanguage.g:3503:3: rule__VLSUnaryInfix__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSUnaryInfix__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVLSUnaryInfixAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group__1__Impl"


    // $ANTLR start "rule__VLSUnaryInfix__Group_1__0"
    // InternalVampireLanguage.g:3512:1: rule__VLSUnaryInfix__Group_1__0 : rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1 ;
    public final void rule__VLSUnaryInfix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3516:1: ( rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1 )
            // InternalVampireLanguage.g:3517:2: rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__VLSUnaryInfix__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUnaryInfix__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group_1__0"


    // $ANTLR start "rule__VLSUnaryInfix__Group_1__0__Impl"
    // InternalVampireLanguage.g:3524:1: rule__VLSUnaryInfix__Group_1__0__Impl : ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) ) ;
    public final void rule__VLSUnaryInfix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3528:1: ( ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) ) )
            // InternalVampireLanguage.g:3529:1: ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) )
            {
            // InternalVampireLanguage.g:3529:1: ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) )
            // InternalVampireLanguage.g:3530:2: ( rule__VLSUnaryInfix__Alternatives_1_0 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getAlternatives_1_0()); 
            // InternalVampireLanguage.g:3531:2: ( rule__VLSUnaryInfix__Alternatives_1_0 )
            // InternalVampireLanguage.g:3531:3: rule__VLSUnaryInfix__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnaryInfix__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSUnaryInfixAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group_1__0__Impl"


    // $ANTLR start "rule__VLSUnaryInfix__Group_1__1"
    // InternalVampireLanguage.g:3539:1: rule__VLSUnaryInfix__Group_1__1 : rule__VLSUnaryInfix__Group_1__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3543:1: ( rule__VLSUnaryInfix__Group_1__1__Impl )
            // InternalVampireLanguage.g:3544:2: rule__VLSUnaryInfix__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnaryInfix__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group_1__1"


    // $ANTLR start "rule__VLSUnaryInfix__Group_1__1__Impl"
    // InternalVampireLanguage.g:3550:1: rule__VLSUnaryInfix__Group_1__1__Impl : ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) ) ;
    public final void rule__VLSUnaryInfix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3554:1: ( ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:3555:1: ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:3555:1: ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) )
            // InternalVampireLanguage.g:3556:2: ( rule__VLSUnaryInfix__RightAssignment_1_1 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getRightAssignment_1_1()); 
            // InternalVampireLanguage.g:3557:2: ( rule__VLSUnaryInfix__RightAssignment_1_1 )
            // InternalVampireLanguage.g:3557:3: rule__VLSUnaryInfix__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnaryInfix__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSUnaryInfixAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group_1__1__Impl"


    // $ANTLR start "rule__VLSUnaryInfix__Group_1_0_0__0"
    // InternalVampireLanguage.g:3566:1: rule__VLSUnaryInfix__Group_1_0_0__0 : rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3570:1: ( rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1 )
            // InternalVampireLanguage.g:3571:2: rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1
            {
            pushFollow(FOLLOW_33);
            rule__VLSUnaryInfix__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUnaryInfix__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group_1_0_0__0"


    // $ANTLR start "rule__VLSUnaryInfix__Group_1_0_0__0__Impl"
    // InternalVampireLanguage.g:3578:1: rule__VLSUnaryInfix__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3582:1: ( ( () ) )
            // InternalVampireLanguage.g:3583:1: ( () )
            {
            // InternalVampireLanguage.g:3583:1: ( () )
            // InternalVampireLanguage.g:3584:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSInequalityLeftAction_1_0_0_0()); 
            // InternalVampireLanguage.g:3585:2: ()
            // InternalVampireLanguage.g:3585:3: 
            {
            }

             after(grammarAccess.getVLSUnaryInfixAccess().getVLSInequalityLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__VLSUnaryInfix__Group_1_0_0__1"
    // InternalVampireLanguage.g:3593:1: rule__VLSUnaryInfix__Group_1_0_0__1 : rule__VLSUnaryInfix__Group_1_0_0__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3597:1: ( rule__VLSUnaryInfix__Group_1_0_0__1__Impl )
            // InternalVampireLanguage.g:3598:2: rule__VLSUnaryInfix__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnaryInfix__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group_1_0_0__1"


    // $ANTLR start "rule__VLSUnaryInfix__Group_1_0_0__1__Impl"
    // InternalVampireLanguage.g:3604:1: rule__VLSUnaryInfix__Group_1_0_0__1__Impl : ( '!=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3608:1: ( ( '!=' ) )
            // InternalVampireLanguage.g:3609:1: ( '!=' )
            {
            // InternalVampireLanguage.g:3609:1: ( '!=' )
            // InternalVampireLanguage.g:3610:2: '!='
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getVLSUnaryInfixAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__VLSUnaryInfix__Group_1_0_1__0"
    // InternalVampireLanguage.g:3620:1: rule__VLSUnaryInfix__Group_1_0_1__0 : rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3624:1: ( rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1 )
            // InternalVampireLanguage.g:3625:2: rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1
            {
            pushFollow(FOLLOW_34);
            rule__VLSUnaryInfix__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUnaryInfix__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group_1_0_1__0"


    // $ANTLR start "rule__VLSUnaryInfix__Group_1_0_1__0__Impl"
    // InternalVampireLanguage.g:3632:1: rule__VLSUnaryInfix__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3636:1: ( ( () ) )
            // InternalVampireLanguage.g:3637:1: ( () )
            {
            // InternalVampireLanguage.g:3637:1: ( () )
            // InternalVampireLanguage.g:3638:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSEqualityLeftAction_1_0_1_0()); 
            // InternalVampireLanguage.g:3639:2: ()
            // InternalVampireLanguage.g:3639:3: 
            {
            }

             after(grammarAccess.getVLSUnaryInfixAccess().getVLSEqualityLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__VLSUnaryInfix__Group_1_0_1__1"
    // InternalVampireLanguage.g:3647:1: rule__VLSUnaryInfix__Group_1_0_1__1 : rule__VLSUnaryInfix__Group_1_0_1__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3651:1: ( rule__VLSUnaryInfix__Group_1_0_1__1__Impl )
            // InternalVampireLanguage.g:3652:2: rule__VLSUnaryInfix__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnaryInfix__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group_1_0_1__1"


    // $ANTLR start "rule__VLSUnaryInfix__Group_1_0_1__1__Impl"
    // InternalVampireLanguage.g:3658:1: rule__VLSUnaryInfix__Group_1_0_1__1__Impl : ( '=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3662:1: ( ( '=' ) )
            // InternalVampireLanguage.g:3663:1: ( '=' )
            {
            // InternalVampireLanguage.g:3663:1: ( '=' )
            // InternalVampireLanguage.g:3664:2: '='
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getEqualsSignKeyword_1_0_1_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getVLSUnaryInfixAccess().getEqualsSignKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__VLSUnaryInfix__Group_1_0_2__0"
    // InternalVampireLanguage.g:3674:1: rule__VLSUnaryInfix__Group_1_0_2__0 : rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3678:1: ( rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1 )
            // InternalVampireLanguage.g:3679:2: rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1
            {
            pushFollow(FOLLOW_32);
            rule__VLSUnaryInfix__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUnaryInfix__Group_1_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group_1_0_2__0"


    // $ANTLR start "rule__VLSUnaryInfix__Group_1_0_2__0__Impl"
    // InternalVampireLanguage.g:3686:1: rule__VLSUnaryInfix__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3690:1: ( ( () ) )
            // InternalVampireLanguage.g:3691:1: ( () )
            {
            // InternalVampireLanguage.g:3691:1: ( () )
            // InternalVampireLanguage.g:3692:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSAssignmentLeftAction_1_0_2_0()); 
            // InternalVampireLanguage.g:3693:2: ()
            // InternalVampireLanguage.g:3693:3: 
            {
            }

             after(grammarAccess.getVLSUnaryInfixAccess().getVLSAssignmentLeftAction_1_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__VLSUnaryInfix__Group_1_0_2__1"
    // InternalVampireLanguage.g:3701:1: rule__VLSUnaryInfix__Group_1_0_2__1 : rule__VLSUnaryInfix__Group_1_0_2__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3705:1: ( rule__VLSUnaryInfix__Group_1_0_2__1__Impl )
            // InternalVampireLanguage.g:3706:2: rule__VLSUnaryInfix__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnaryInfix__Group_1_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group_1_0_2__1"


    // $ANTLR start "rule__VLSUnaryInfix__Group_1_0_2__1__Impl"
    // InternalVampireLanguage.g:3712:1: rule__VLSUnaryInfix__Group_1_0_2__1__Impl : ( ':=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3716:1: ( ( ':=' ) )
            // InternalVampireLanguage.g:3717:1: ( ':=' )
            {
            // InternalVampireLanguage.g:3717:1: ( ':=' )
            // InternalVampireLanguage.g:3718:2: ':='
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getColonEqualsSignKeyword_1_0_2_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getVLSUnaryInfixAccess().getColonEqualsSignKeyword_1_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__VLSAtomicConstant__Group_0__0"
    // InternalVampireLanguage.g:3728:1: rule__VLSAtomicConstant__Group_0__0 : rule__VLSAtomicConstant__Group_0__0__Impl rule__VLSAtomicConstant__Group_0__1 ;
    public final void rule__VLSAtomicConstant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3732:1: ( rule__VLSAtomicConstant__Group_0__0__Impl rule__VLSAtomicConstant__Group_0__1 )
            // InternalVampireLanguage.g:3733:2: rule__VLSAtomicConstant__Group_0__0__Impl rule__VLSAtomicConstant__Group_0__1
            {
            pushFollow(FOLLOW_35);
            rule__VLSAtomicConstant__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAtomicConstant__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicConstant__Group_0__0"


    // $ANTLR start "rule__VLSAtomicConstant__Group_0__0__Impl"
    // InternalVampireLanguage.g:3740:1: rule__VLSAtomicConstant__Group_0__0__Impl : ( () ) ;
    public final void rule__VLSAtomicConstant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3744:1: ( ( () ) )
            // InternalVampireLanguage.g:3745:1: ( () )
            {
            // InternalVampireLanguage.g:3745:1: ( () )
            // InternalVampireLanguage.g:3746:2: ()
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getVLSConstantAction_0_0()); 
            // InternalVampireLanguage.g:3747:2: ()
            // InternalVampireLanguage.g:3747:3: 
            {
            }

             after(grammarAccess.getVLSAtomicConstantAccess().getVLSConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicConstant__Group_0__0__Impl"


    // $ANTLR start "rule__VLSAtomicConstant__Group_0__1"
    // InternalVampireLanguage.g:3755:1: rule__VLSAtomicConstant__Group_0__1 : rule__VLSAtomicConstant__Group_0__1__Impl ;
    public final void rule__VLSAtomicConstant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3759:1: ( rule__VLSAtomicConstant__Group_0__1__Impl )
            // InternalVampireLanguage.g:3760:2: rule__VLSAtomicConstant__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicConstant__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicConstant__Group_0__1"


    // $ANTLR start "rule__VLSAtomicConstant__Group_0__1__Impl"
    // InternalVampireLanguage.g:3766:1: rule__VLSAtomicConstant__Group_0__1__Impl : ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) ) ;
    public final void rule__VLSAtomicConstant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3770:1: ( ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) ) )
            // InternalVampireLanguage.g:3771:1: ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) )
            {
            // InternalVampireLanguage.g:3771:1: ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) )
            // InternalVampireLanguage.g:3772:2: ( rule__VLSAtomicConstant__NameAssignment_0_1 )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getNameAssignment_0_1()); 
            // InternalVampireLanguage.g:3773:2: ( rule__VLSAtomicConstant__NameAssignment_0_1 )
            // InternalVampireLanguage.g:3773:3: rule__VLSAtomicConstant__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicConstant__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSAtomicConstantAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicConstant__Group_0__1__Impl"


    // $ANTLR start "rule__VLSAtomicConstant__Group_1__0"
    // InternalVampireLanguage.g:3782:1: rule__VLSAtomicConstant__Group_1__0 : rule__VLSAtomicConstant__Group_1__0__Impl rule__VLSAtomicConstant__Group_1__1 ;
    public final void rule__VLSAtomicConstant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3786:1: ( rule__VLSAtomicConstant__Group_1__0__Impl rule__VLSAtomicConstant__Group_1__1 )
            // InternalVampireLanguage.g:3787:2: rule__VLSAtomicConstant__Group_1__0__Impl rule__VLSAtomicConstant__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__VLSAtomicConstant__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAtomicConstant__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicConstant__Group_1__0"


    // $ANTLR start "rule__VLSAtomicConstant__Group_1__0__Impl"
    // InternalVampireLanguage.g:3794:1: rule__VLSAtomicConstant__Group_1__0__Impl : ( () ) ;
    public final void rule__VLSAtomicConstant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3798:1: ( ( () ) )
            // InternalVampireLanguage.g:3799:1: ( () )
            {
            // InternalVampireLanguage.g:3799:1: ( () )
            // InternalVampireLanguage.g:3800:2: ()
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getVLSTrueAction_1_0()); 
            // InternalVampireLanguage.g:3801:2: ()
            // InternalVampireLanguage.g:3801:3: 
            {
            }

             after(grammarAccess.getVLSAtomicConstantAccess().getVLSTrueAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicConstant__Group_1__0__Impl"


    // $ANTLR start "rule__VLSAtomicConstant__Group_1__1"
    // InternalVampireLanguage.g:3809:1: rule__VLSAtomicConstant__Group_1__1 : rule__VLSAtomicConstant__Group_1__1__Impl ;
    public final void rule__VLSAtomicConstant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3813:1: ( rule__VLSAtomicConstant__Group_1__1__Impl )
            // InternalVampireLanguage.g:3814:2: rule__VLSAtomicConstant__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicConstant__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicConstant__Group_1__1"


    // $ANTLR start "rule__VLSAtomicConstant__Group_1__1__Impl"
    // InternalVampireLanguage.g:3820:1: rule__VLSAtomicConstant__Group_1__1__Impl : ( ( rule__VLSAtomicConstant__NameAssignment_1_1 ) ) ;
    public final void rule__VLSAtomicConstant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3824:1: ( ( ( rule__VLSAtomicConstant__NameAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:3825:1: ( ( rule__VLSAtomicConstant__NameAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:3825:1: ( ( rule__VLSAtomicConstant__NameAssignment_1_1 ) )
            // InternalVampireLanguage.g:3826:2: ( rule__VLSAtomicConstant__NameAssignment_1_1 )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getNameAssignment_1_1()); 
            // InternalVampireLanguage.g:3827:2: ( rule__VLSAtomicConstant__NameAssignment_1_1 )
            // InternalVampireLanguage.g:3827:3: rule__VLSAtomicConstant__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicConstant__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSAtomicConstantAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicConstant__Group_1__1__Impl"


    // $ANTLR start "rule__VLSAtomicConstant__Group_2__0"
    // InternalVampireLanguage.g:3836:1: rule__VLSAtomicConstant__Group_2__0 : rule__VLSAtomicConstant__Group_2__0__Impl rule__VLSAtomicConstant__Group_2__1 ;
    public final void rule__VLSAtomicConstant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3840:1: ( rule__VLSAtomicConstant__Group_2__0__Impl rule__VLSAtomicConstant__Group_2__1 )
            // InternalVampireLanguage.g:3841:2: rule__VLSAtomicConstant__Group_2__0__Impl rule__VLSAtomicConstant__Group_2__1
            {
            pushFollow(FOLLOW_37);
            rule__VLSAtomicConstant__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAtomicConstant__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicConstant__Group_2__0"


    // $ANTLR start "rule__VLSAtomicConstant__Group_2__0__Impl"
    // InternalVampireLanguage.g:3848:1: rule__VLSAtomicConstant__Group_2__0__Impl : ( () ) ;
    public final void rule__VLSAtomicConstant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3852:1: ( ( () ) )
            // InternalVampireLanguage.g:3853:1: ( () )
            {
            // InternalVampireLanguage.g:3853:1: ( () )
            // InternalVampireLanguage.g:3854:2: ()
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getVLSFalseAction_2_0()); 
            // InternalVampireLanguage.g:3855:2: ()
            // InternalVampireLanguage.g:3855:3: 
            {
            }

             after(grammarAccess.getVLSAtomicConstantAccess().getVLSFalseAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicConstant__Group_2__0__Impl"


    // $ANTLR start "rule__VLSAtomicConstant__Group_2__1"
    // InternalVampireLanguage.g:3863:1: rule__VLSAtomicConstant__Group_2__1 : rule__VLSAtomicConstant__Group_2__1__Impl ;
    public final void rule__VLSAtomicConstant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3867:1: ( rule__VLSAtomicConstant__Group_2__1__Impl )
            // InternalVampireLanguage.g:3868:2: rule__VLSAtomicConstant__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicConstant__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicConstant__Group_2__1"


    // $ANTLR start "rule__VLSAtomicConstant__Group_2__1__Impl"
    // InternalVampireLanguage.g:3874:1: rule__VLSAtomicConstant__Group_2__1__Impl : ( ( rule__VLSAtomicConstant__NameAssignment_2_1 ) ) ;
    public final void rule__VLSAtomicConstant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3878:1: ( ( ( rule__VLSAtomicConstant__NameAssignment_2_1 ) ) )
            // InternalVampireLanguage.g:3879:1: ( ( rule__VLSAtomicConstant__NameAssignment_2_1 ) )
            {
            // InternalVampireLanguage.g:3879:1: ( ( rule__VLSAtomicConstant__NameAssignment_2_1 ) )
            // InternalVampireLanguage.g:3880:2: ( rule__VLSAtomicConstant__NameAssignment_2_1 )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getNameAssignment_2_1()); 
            // InternalVampireLanguage.g:3881:2: ( rule__VLSAtomicConstant__NameAssignment_2_1 )
            // InternalVampireLanguage.g:3881:3: rule__VLSAtomicConstant__NameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicConstant__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSAtomicConstantAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicConstant__Group_2__1__Impl"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0__0"
    // InternalVampireLanguage.g:3890:1: rule__VLSAtomicFunction__Group_0__0 : rule__VLSAtomicFunction__Group_0__0__Impl rule__VLSAtomicFunction__Group_0__1 ;
    public final void rule__VLSAtomicFunction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3894:1: ( rule__VLSAtomicFunction__Group_0__0__Impl rule__VLSAtomicFunction__Group_0__1 )
            // InternalVampireLanguage.g:3895:2: rule__VLSAtomicFunction__Group_0__0__Impl rule__VLSAtomicFunction__Group_0__1
            {
            pushFollow(FOLLOW_35);
            rule__VLSAtomicFunction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0__0"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0__0__Impl"
    // InternalVampireLanguage.g:3902:1: rule__VLSAtomicFunction__Group_0__0__Impl : ( () ) ;
    public final void rule__VLSAtomicFunction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3906:1: ( ( () ) )
            // InternalVampireLanguage.g:3907:1: ( () )
            {
            // InternalVampireLanguage.g:3907:1: ( () )
            // InternalVampireLanguage.g:3908:2: ()
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getVLSFunctionAction_0_0()); 
            // InternalVampireLanguage.g:3909:2: ()
            // InternalVampireLanguage.g:3909:3: 
            {
            }

             after(grammarAccess.getVLSAtomicFunctionAccess().getVLSFunctionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0__0__Impl"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0__1"
    // InternalVampireLanguage.g:3917:1: rule__VLSAtomicFunction__Group_0__1 : rule__VLSAtomicFunction__Group_0__1__Impl rule__VLSAtomicFunction__Group_0__2 ;
    public final void rule__VLSAtomicFunction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3921:1: ( rule__VLSAtomicFunction__Group_0__1__Impl rule__VLSAtomicFunction__Group_0__2 )
            // InternalVampireLanguage.g:3922:2: rule__VLSAtomicFunction__Group_0__1__Impl rule__VLSAtomicFunction__Group_0__2
            {
            pushFollow(FOLLOW_6);
            rule__VLSAtomicFunction__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0__1"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0__1__Impl"
    // InternalVampireLanguage.g:3929:1: rule__VLSAtomicFunction__Group_0__1__Impl : ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3933:1: ( ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) ) )
            // InternalVampireLanguage.g:3934:1: ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) )
            {
            // InternalVampireLanguage.g:3934:1: ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) )
            // InternalVampireLanguage.g:3935:2: ( rule__VLSAtomicFunction__ConstantAssignment_0_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getConstantAssignment_0_1()); 
            // InternalVampireLanguage.g:3936:2: ( rule__VLSAtomicFunction__ConstantAssignment_0_1 )
            // InternalVampireLanguage.g:3936:3: rule__VLSAtomicFunction__ConstantAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__ConstantAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSAtomicFunctionAccess().getConstantAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0__1__Impl"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0__2"
    // InternalVampireLanguage.g:3944:1: rule__VLSAtomicFunction__Group_0__2 : rule__VLSAtomicFunction__Group_0__2__Impl ;
    public final void rule__VLSAtomicFunction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3948:1: ( rule__VLSAtomicFunction__Group_0__2__Impl )
            // InternalVampireLanguage.g:3949:2: rule__VLSAtomicFunction__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0__2"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0__2__Impl"
    // InternalVampireLanguage.g:3955:1: rule__VLSAtomicFunction__Group_0__2__Impl : ( ( rule__VLSAtomicFunction__Group_0_2__0 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3959:1: ( ( ( rule__VLSAtomicFunction__Group_0_2__0 ) ) )
            // InternalVampireLanguage.g:3960:1: ( ( rule__VLSAtomicFunction__Group_0_2__0 ) )
            {
            // InternalVampireLanguage.g:3960:1: ( ( rule__VLSAtomicFunction__Group_0_2__0 ) )
            // InternalVampireLanguage.g:3961:2: ( rule__VLSAtomicFunction__Group_0_2__0 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0_2()); 
            // InternalVampireLanguage.g:3962:2: ( rule__VLSAtomicFunction__Group_0_2__0 )
            // InternalVampireLanguage.g:3962:3: rule__VLSAtomicFunction__Group_0_2__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Group_0_2__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0__2__Impl"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0_2__0"
    // InternalVampireLanguage.g:3971:1: rule__VLSAtomicFunction__Group_0_2__0 : rule__VLSAtomicFunction__Group_0_2__0__Impl rule__VLSAtomicFunction__Group_0_2__1 ;
    public final void rule__VLSAtomicFunction__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3975:1: ( rule__VLSAtomicFunction__Group_0_2__0__Impl rule__VLSAtomicFunction__Group_0_2__1 )
            // InternalVampireLanguage.g:3976:2: rule__VLSAtomicFunction__Group_0_2__0__Impl rule__VLSAtomicFunction__Group_0_2__1
            {
            pushFollow(FOLLOW_38);
            rule__VLSAtomicFunction__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0_2__0"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0_2__0__Impl"
    // InternalVampireLanguage.g:3983:1: rule__VLSAtomicFunction__Group_0_2__0__Impl : ( '(' ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3987:1: ( ( '(' ) )
            // InternalVampireLanguage.g:3988:1: ( '(' )
            {
            // InternalVampireLanguage.g:3988:1: ( '(' )
            // InternalVampireLanguage.g:3989:2: '('
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getLeftParenthesisKeyword_0_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getVLSAtomicFunctionAccess().getLeftParenthesisKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0_2__0__Impl"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0_2__1"
    // InternalVampireLanguage.g:3998:1: rule__VLSAtomicFunction__Group_0_2__1 : rule__VLSAtomicFunction__Group_0_2__1__Impl rule__VLSAtomicFunction__Group_0_2__2 ;
    public final void rule__VLSAtomicFunction__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4002:1: ( rule__VLSAtomicFunction__Group_0_2__1__Impl rule__VLSAtomicFunction__Group_0_2__2 )
            // InternalVampireLanguage.g:4003:2: rule__VLSAtomicFunction__Group_0_2__1__Impl rule__VLSAtomicFunction__Group_0_2__2
            {
            pushFollow(FOLLOW_11);
            rule__VLSAtomicFunction__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Group_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0_2__1"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0_2__1__Impl"
    // InternalVampireLanguage.g:4010:1: rule__VLSAtomicFunction__Group_0_2__1__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4014:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) ) )
            // InternalVampireLanguage.g:4015:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) )
            {
            // InternalVampireLanguage.g:4015:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) )
            // InternalVampireLanguage.g:4016:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_0_2_1()); 
            // InternalVampireLanguage.g:4017:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 )
            // InternalVampireLanguage.g:4017:3: rule__VLSAtomicFunction__TermsAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__TermsAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0_2__1__Impl"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0_2__2"
    // InternalVampireLanguage.g:4025:1: rule__VLSAtomicFunction__Group_0_2__2 : rule__VLSAtomicFunction__Group_0_2__2__Impl rule__VLSAtomicFunction__Group_0_2__3 ;
    public final void rule__VLSAtomicFunction__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4029:1: ( rule__VLSAtomicFunction__Group_0_2__2__Impl rule__VLSAtomicFunction__Group_0_2__3 )
            // InternalVampireLanguage.g:4030:2: rule__VLSAtomicFunction__Group_0_2__2__Impl rule__VLSAtomicFunction__Group_0_2__3
            {
            pushFollow(FOLLOW_11);
            rule__VLSAtomicFunction__Group_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Group_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0_2__2"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0_2__2__Impl"
    // InternalVampireLanguage.g:4037:1: rule__VLSAtomicFunction__Group_0_2__2__Impl : ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4041:1: ( ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* ) )
            // InternalVampireLanguage.g:4042:1: ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* )
            {
            // InternalVampireLanguage.g:4042:1: ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* )
            // InternalVampireLanguage.g:4043:2: ( rule__VLSAtomicFunction__Group_0_2_2__0 )*
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0_2_2()); 
            // InternalVampireLanguage.g:4044:2: ( rule__VLSAtomicFunction__Group_0_2_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==44) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalVampireLanguage.g:4044:3: rule__VLSAtomicFunction__Group_0_2_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__VLSAtomicFunction__Group_0_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0_2__2__Impl"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0_2__3"
    // InternalVampireLanguage.g:4052:1: rule__VLSAtomicFunction__Group_0_2__3 : rule__VLSAtomicFunction__Group_0_2__3__Impl ;
    public final void rule__VLSAtomicFunction__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4056:1: ( rule__VLSAtomicFunction__Group_0_2__3__Impl )
            // InternalVampireLanguage.g:4057:2: rule__VLSAtomicFunction__Group_0_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Group_0_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0_2__3"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0_2__3__Impl"
    // InternalVampireLanguage.g:4063:1: rule__VLSAtomicFunction__Group_0_2__3__Impl : ( ')' ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4067:1: ( ( ')' ) )
            // InternalVampireLanguage.g:4068:1: ( ')' )
            {
            // InternalVampireLanguage.g:4068:1: ( ')' )
            // InternalVampireLanguage.g:4069:2: ')'
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getRightParenthesisKeyword_0_2_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVLSAtomicFunctionAccess().getRightParenthesisKeyword_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0_2__3__Impl"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0_2_2__0"
    // InternalVampireLanguage.g:4079:1: rule__VLSAtomicFunction__Group_0_2_2__0 : rule__VLSAtomicFunction__Group_0_2_2__0__Impl rule__VLSAtomicFunction__Group_0_2_2__1 ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4083:1: ( rule__VLSAtomicFunction__Group_0_2_2__0__Impl rule__VLSAtomicFunction__Group_0_2_2__1 )
            // InternalVampireLanguage.g:4084:2: rule__VLSAtomicFunction__Group_0_2_2__0__Impl rule__VLSAtomicFunction__Group_0_2_2__1
            {
            pushFollow(FOLLOW_38);
            rule__VLSAtomicFunction__Group_0_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Group_0_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0_2_2__0"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0_2_2__0__Impl"
    // InternalVampireLanguage.g:4091:1: rule__VLSAtomicFunction__Group_0_2_2__0__Impl : ( ',' ) ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4095:1: ( ( ',' ) )
            // InternalVampireLanguage.g:4096:1: ( ',' )
            {
            // InternalVampireLanguage.g:4096:1: ( ',' )
            // InternalVampireLanguage.g:4097:2: ','
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getCommaKeyword_0_2_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVLSAtomicFunctionAccess().getCommaKeyword_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0_2_2__0__Impl"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0_2_2__1"
    // InternalVampireLanguage.g:4106:1: rule__VLSAtomicFunction__Group_0_2_2__1 : rule__VLSAtomicFunction__Group_0_2_2__1__Impl ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4110:1: ( rule__VLSAtomicFunction__Group_0_2_2__1__Impl )
            // InternalVampireLanguage.g:4111:2: rule__VLSAtomicFunction__Group_0_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Group_0_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0_2_2__1"


    // $ANTLR start "rule__VLSAtomicFunction__Group_0_2_2__1__Impl"
    // InternalVampireLanguage.g:4117:1: rule__VLSAtomicFunction__Group_0_2_2__1__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4121:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) ) )
            // InternalVampireLanguage.g:4122:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) )
            {
            // InternalVampireLanguage.g:4122:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) )
            // InternalVampireLanguage.g:4123:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_0_2_2_1()); 
            // InternalVampireLanguage.g:4124:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 )
            // InternalVampireLanguage.g:4124:3: rule__VLSAtomicFunction__TermsAssignment_0_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__TermsAssignment_0_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_0_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_0_2_2__1__Impl"


    // $ANTLR start "rule__VLSAtomicFunction__Group_1__0"
    // InternalVampireLanguage.g:4133:1: rule__VLSAtomicFunction__Group_1__0 : rule__VLSAtomicFunction__Group_1__0__Impl rule__VLSAtomicFunction__Group_1__1 ;
    public final void rule__VLSAtomicFunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4137:1: ( rule__VLSAtomicFunction__Group_1__0__Impl rule__VLSAtomicFunction__Group_1__1 )
            // InternalVampireLanguage.g:4138:2: rule__VLSAtomicFunction__Group_1__0__Impl rule__VLSAtomicFunction__Group_1__1
            {
            pushFollow(FOLLOW_39);
            rule__VLSAtomicFunction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_1__0"


    // $ANTLR start "rule__VLSAtomicFunction__Group_1__0__Impl"
    // InternalVampireLanguage.g:4145:1: rule__VLSAtomicFunction__Group_1__0__Impl : ( () ) ;
    public final void rule__VLSAtomicFunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4149:1: ( ( () ) )
            // InternalVampireLanguage.g:4150:1: ( () )
            {
            // InternalVampireLanguage.g:4150:1: ( () )
            // InternalVampireLanguage.g:4151:2: ()
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getVLSLessAction_1_0()); 
            // InternalVampireLanguage.g:4152:2: ()
            // InternalVampireLanguage.g:4152:3: 
            {
            }

             after(grammarAccess.getVLSAtomicFunctionAccess().getVLSLessAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_1__0__Impl"


    // $ANTLR start "rule__VLSAtomicFunction__Group_1__1"
    // InternalVampireLanguage.g:4160:1: rule__VLSAtomicFunction__Group_1__1 : rule__VLSAtomicFunction__Group_1__1__Impl rule__VLSAtomicFunction__Group_1__2 ;
    public final void rule__VLSAtomicFunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4164:1: ( rule__VLSAtomicFunction__Group_1__1__Impl rule__VLSAtomicFunction__Group_1__2 )
            // InternalVampireLanguage.g:4165:2: rule__VLSAtomicFunction__Group_1__1__Impl rule__VLSAtomicFunction__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__VLSAtomicFunction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_1__1"


    // $ANTLR start "rule__VLSAtomicFunction__Group_1__1__Impl"
    // InternalVampireLanguage.g:4172:1: rule__VLSAtomicFunction__Group_1__1__Impl : ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4176:1: ( ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:4177:1: ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:4177:1: ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) )
            // InternalVampireLanguage.g:4178:2: ( rule__VLSAtomicFunction__NameAssignment_1_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getNameAssignment_1_1()); 
            // InternalVampireLanguage.g:4179:2: ( rule__VLSAtomicFunction__NameAssignment_1_1 )
            // InternalVampireLanguage.g:4179:3: rule__VLSAtomicFunction__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSAtomicFunctionAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_1__1__Impl"


    // $ANTLR start "rule__VLSAtomicFunction__Group_1__2"
    // InternalVampireLanguage.g:4187:1: rule__VLSAtomicFunction__Group_1__2 : rule__VLSAtomicFunction__Group_1__2__Impl rule__VLSAtomicFunction__Group_1__3 ;
    public final void rule__VLSAtomicFunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4191:1: ( rule__VLSAtomicFunction__Group_1__2__Impl rule__VLSAtomicFunction__Group_1__3 )
            // InternalVampireLanguage.g:4192:2: rule__VLSAtomicFunction__Group_1__2__Impl rule__VLSAtomicFunction__Group_1__3
            {
            pushFollow(FOLLOW_38);
            rule__VLSAtomicFunction__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_1__2"


    // $ANTLR start "rule__VLSAtomicFunction__Group_1__2__Impl"
    // InternalVampireLanguage.g:4199:1: rule__VLSAtomicFunction__Group_1__2__Impl : ( '(' ) ;
    public final void rule__VLSAtomicFunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4203:1: ( ( '(' ) )
            // InternalVampireLanguage.g:4204:1: ( '(' )
            {
            // InternalVampireLanguage.g:4204:1: ( '(' )
            // InternalVampireLanguage.g:4205:2: '('
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getVLSAtomicFunctionAccess().getLeftParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_1__2__Impl"


    // $ANTLR start "rule__VLSAtomicFunction__Group_1__3"
    // InternalVampireLanguage.g:4214:1: rule__VLSAtomicFunction__Group_1__3 : rule__VLSAtomicFunction__Group_1__3__Impl rule__VLSAtomicFunction__Group_1__4 ;
    public final void rule__VLSAtomicFunction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4218:1: ( rule__VLSAtomicFunction__Group_1__3__Impl rule__VLSAtomicFunction__Group_1__4 )
            // InternalVampireLanguage.g:4219:2: rule__VLSAtomicFunction__Group_1__3__Impl rule__VLSAtomicFunction__Group_1__4
            {
            pushFollow(FOLLOW_8);
            rule__VLSAtomicFunction__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_1__3"


    // $ANTLR start "rule__VLSAtomicFunction__Group_1__3__Impl"
    // InternalVampireLanguage.g:4226:1: rule__VLSAtomicFunction__Group_1__3__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) ) ;
    public final void rule__VLSAtomicFunction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4230:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) ) )
            // InternalVampireLanguage.g:4231:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) )
            {
            // InternalVampireLanguage.g:4231:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) )
            // InternalVampireLanguage.g:4232:2: ( rule__VLSAtomicFunction__TermsAssignment_1_3 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_1_3()); 
            // InternalVampireLanguage.g:4233:2: ( rule__VLSAtomicFunction__TermsAssignment_1_3 )
            // InternalVampireLanguage.g:4233:3: rule__VLSAtomicFunction__TermsAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__TermsAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_1__3__Impl"


    // $ANTLR start "rule__VLSAtomicFunction__Group_1__4"
    // InternalVampireLanguage.g:4241:1: rule__VLSAtomicFunction__Group_1__4 : rule__VLSAtomicFunction__Group_1__4__Impl rule__VLSAtomicFunction__Group_1__5 ;
    public final void rule__VLSAtomicFunction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4245:1: ( rule__VLSAtomicFunction__Group_1__4__Impl rule__VLSAtomicFunction__Group_1__5 )
            // InternalVampireLanguage.g:4246:2: rule__VLSAtomicFunction__Group_1__4__Impl rule__VLSAtomicFunction__Group_1__5
            {
            pushFollow(FOLLOW_38);
            rule__VLSAtomicFunction__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_1__4"


    // $ANTLR start "rule__VLSAtomicFunction__Group_1__4__Impl"
    // InternalVampireLanguage.g:4253:1: rule__VLSAtomicFunction__Group_1__4__Impl : ( ',' ) ;
    public final void rule__VLSAtomicFunction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4257:1: ( ( ',' ) )
            // InternalVampireLanguage.g:4258:1: ( ',' )
            {
            // InternalVampireLanguage.g:4258:1: ( ',' )
            // InternalVampireLanguage.g:4259:2: ','
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getCommaKeyword_1_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVLSAtomicFunctionAccess().getCommaKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_1__4__Impl"


    // $ANTLR start "rule__VLSAtomicFunction__Group_1__5"
    // InternalVampireLanguage.g:4268:1: rule__VLSAtomicFunction__Group_1__5 : rule__VLSAtomicFunction__Group_1__5__Impl rule__VLSAtomicFunction__Group_1__6 ;
    public final void rule__VLSAtomicFunction__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4272:1: ( rule__VLSAtomicFunction__Group_1__5__Impl rule__VLSAtomicFunction__Group_1__6 )
            // InternalVampireLanguage.g:4273:2: rule__VLSAtomicFunction__Group_1__5__Impl rule__VLSAtomicFunction__Group_1__6
            {
            pushFollow(FOLLOW_14);
            rule__VLSAtomicFunction__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_1__5"


    // $ANTLR start "rule__VLSAtomicFunction__Group_1__5__Impl"
    // InternalVampireLanguage.g:4280:1: rule__VLSAtomicFunction__Group_1__5__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) ) ;
    public final void rule__VLSAtomicFunction__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4284:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) ) )
            // InternalVampireLanguage.g:4285:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) )
            {
            // InternalVampireLanguage.g:4285:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) )
            // InternalVampireLanguage.g:4286:2: ( rule__VLSAtomicFunction__TermsAssignment_1_5 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_1_5()); 
            // InternalVampireLanguage.g:4287:2: ( rule__VLSAtomicFunction__TermsAssignment_1_5 )
            // InternalVampireLanguage.g:4287:3: rule__VLSAtomicFunction__TermsAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__TermsAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_1__5__Impl"


    // $ANTLR start "rule__VLSAtomicFunction__Group_1__6"
    // InternalVampireLanguage.g:4295:1: rule__VLSAtomicFunction__Group_1__6 : rule__VLSAtomicFunction__Group_1__6__Impl ;
    public final void rule__VLSAtomicFunction__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4299:1: ( rule__VLSAtomicFunction__Group_1__6__Impl )
            // InternalVampireLanguage.g:4300:2: rule__VLSAtomicFunction__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__Group_1__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_1__6"


    // $ANTLR start "rule__VLSAtomicFunction__Group_1__6__Impl"
    // InternalVampireLanguage.g:4306:1: rule__VLSAtomicFunction__Group_1__6__Impl : ( ')' ) ;
    public final void rule__VLSAtomicFunction__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4310:1: ( ( ')' ) )
            // InternalVampireLanguage.g:4311:1: ( ')' )
            {
            // InternalVampireLanguage.g:4311:1: ( ')' )
            // InternalVampireLanguage.g:4312:2: ')'
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getRightParenthesisKeyword_1_6()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVLSAtomicFunctionAccess().getRightParenthesisKeyword_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__Group_1__6__Impl"


    // $ANTLR start "rule__VLSFunctionFof__Group__0"
    // InternalVampireLanguage.g:4322:1: rule__VLSFunctionFof__Group__0 : rule__VLSFunctionFof__Group__0__Impl rule__VLSFunctionFof__Group__1 ;
    public final void rule__VLSFunctionFof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4326:1: ( rule__VLSFunctionFof__Group__0__Impl rule__VLSFunctionFof__Group__1 )
            // InternalVampireLanguage.g:4327:2: rule__VLSFunctionFof__Group__0__Impl rule__VLSFunctionFof__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VLSFunctionFof__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFunctionFof__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__Group__0"


    // $ANTLR start "rule__VLSFunctionFof__Group__0__Impl"
    // InternalVampireLanguage.g:4334:1: rule__VLSFunctionFof__Group__0__Impl : ( ( rule__VLSFunctionFof__FunctorAssignment_0 ) ) ;
    public final void rule__VLSFunctionFof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4338:1: ( ( ( rule__VLSFunctionFof__FunctorAssignment_0 ) ) )
            // InternalVampireLanguage.g:4339:1: ( ( rule__VLSFunctionFof__FunctorAssignment_0 ) )
            {
            // InternalVampireLanguage.g:4339:1: ( ( rule__VLSFunctionFof__FunctorAssignment_0 ) )
            // InternalVampireLanguage.g:4340:2: ( rule__VLSFunctionFof__FunctorAssignment_0 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getFunctorAssignment_0()); 
            // InternalVampireLanguage.g:4341:2: ( rule__VLSFunctionFof__FunctorAssignment_0 )
            // InternalVampireLanguage.g:4341:3: rule__VLSFunctionFof__FunctorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionFof__FunctorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSFunctionFofAccess().getFunctorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__Group__0__Impl"


    // $ANTLR start "rule__VLSFunctionFof__Group__1"
    // InternalVampireLanguage.g:4349:1: rule__VLSFunctionFof__Group__1 : rule__VLSFunctionFof__Group__1__Impl ;
    public final void rule__VLSFunctionFof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4353:1: ( rule__VLSFunctionFof__Group__1__Impl )
            // InternalVampireLanguage.g:4354:2: rule__VLSFunctionFof__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionFof__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__Group__1"


    // $ANTLR start "rule__VLSFunctionFof__Group__1__Impl"
    // InternalVampireLanguage.g:4360:1: rule__VLSFunctionFof__Group__1__Impl : ( ( rule__VLSFunctionFof__Group_1__0 )? ) ;
    public final void rule__VLSFunctionFof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4364:1: ( ( ( rule__VLSFunctionFof__Group_1__0 )? ) )
            // InternalVampireLanguage.g:4365:1: ( ( rule__VLSFunctionFof__Group_1__0 )? )
            {
            // InternalVampireLanguage.g:4365:1: ( ( rule__VLSFunctionFof__Group_1__0 )? )
            // InternalVampireLanguage.g:4366:2: ( rule__VLSFunctionFof__Group_1__0 )?
            {
             before(grammarAccess.getVLSFunctionFofAccess().getGroup_1()); 
            // InternalVampireLanguage.g:4367:2: ( rule__VLSFunctionFof__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVampireLanguage.g:4367:3: rule__VLSFunctionFof__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSFunctionFof__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVLSFunctionFofAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__Group__1__Impl"


    // $ANTLR start "rule__VLSFunctionFof__Group_1__0"
    // InternalVampireLanguage.g:4376:1: rule__VLSFunctionFof__Group_1__0 : rule__VLSFunctionFof__Group_1__0__Impl rule__VLSFunctionFof__Group_1__1 ;
    public final void rule__VLSFunctionFof__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4380:1: ( rule__VLSFunctionFof__Group_1__0__Impl rule__VLSFunctionFof__Group_1__1 )
            // InternalVampireLanguage.g:4381:2: rule__VLSFunctionFof__Group_1__0__Impl rule__VLSFunctionFof__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__VLSFunctionFof__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFunctionFof__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__Group_1__0"


    // $ANTLR start "rule__VLSFunctionFof__Group_1__0__Impl"
    // InternalVampireLanguage.g:4388:1: rule__VLSFunctionFof__Group_1__0__Impl : ( '(' ) ;
    public final void rule__VLSFunctionFof__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4392:1: ( ( '(' ) )
            // InternalVampireLanguage.g:4393:1: ( '(' )
            {
            // InternalVampireLanguage.g:4393:1: ( '(' )
            // InternalVampireLanguage.g:4394:2: '('
            {
             before(grammarAccess.getVLSFunctionFofAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getVLSFunctionFofAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__Group_1__0__Impl"


    // $ANTLR start "rule__VLSFunctionFof__Group_1__1"
    // InternalVampireLanguage.g:4403:1: rule__VLSFunctionFof__Group_1__1 : rule__VLSFunctionFof__Group_1__1__Impl rule__VLSFunctionFof__Group_1__2 ;
    public final void rule__VLSFunctionFof__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4407:1: ( rule__VLSFunctionFof__Group_1__1__Impl rule__VLSFunctionFof__Group_1__2 )
            // InternalVampireLanguage.g:4408:2: rule__VLSFunctionFof__Group_1__1__Impl rule__VLSFunctionFof__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__VLSFunctionFof__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFunctionFof__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__Group_1__1"


    // $ANTLR start "rule__VLSFunctionFof__Group_1__1__Impl"
    // InternalVampireLanguage.g:4415:1: rule__VLSFunctionFof__Group_1__1__Impl : ( ( rule__VLSFunctionFof__TermsAssignment_1_1 ) ) ;
    public final void rule__VLSFunctionFof__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4419:1: ( ( ( rule__VLSFunctionFof__TermsAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:4420:1: ( ( rule__VLSFunctionFof__TermsAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:4420:1: ( ( rule__VLSFunctionFof__TermsAssignment_1_1 ) )
            // InternalVampireLanguage.g:4421:2: ( rule__VLSFunctionFof__TermsAssignment_1_1 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getTermsAssignment_1_1()); 
            // InternalVampireLanguage.g:4422:2: ( rule__VLSFunctionFof__TermsAssignment_1_1 )
            // InternalVampireLanguage.g:4422:3: rule__VLSFunctionFof__TermsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionFof__TermsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSFunctionFofAccess().getTermsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__Group_1__1__Impl"


    // $ANTLR start "rule__VLSFunctionFof__Group_1__2"
    // InternalVampireLanguage.g:4430:1: rule__VLSFunctionFof__Group_1__2 : rule__VLSFunctionFof__Group_1__2__Impl rule__VLSFunctionFof__Group_1__3 ;
    public final void rule__VLSFunctionFof__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4434:1: ( rule__VLSFunctionFof__Group_1__2__Impl rule__VLSFunctionFof__Group_1__3 )
            // InternalVampireLanguage.g:4435:2: rule__VLSFunctionFof__Group_1__2__Impl rule__VLSFunctionFof__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__VLSFunctionFof__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFunctionFof__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__Group_1__2"


    // $ANTLR start "rule__VLSFunctionFof__Group_1__2__Impl"
    // InternalVampireLanguage.g:4442:1: rule__VLSFunctionFof__Group_1__2__Impl : ( ( rule__VLSFunctionFof__Group_1_2__0 )* ) ;
    public final void rule__VLSFunctionFof__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4446:1: ( ( ( rule__VLSFunctionFof__Group_1_2__0 )* ) )
            // InternalVampireLanguage.g:4447:1: ( ( rule__VLSFunctionFof__Group_1_2__0 )* )
            {
            // InternalVampireLanguage.g:4447:1: ( ( rule__VLSFunctionFof__Group_1_2__0 )* )
            // InternalVampireLanguage.g:4448:2: ( rule__VLSFunctionFof__Group_1_2__0 )*
            {
             before(grammarAccess.getVLSFunctionFofAccess().getGroup_1_2()); 
            // InternalVampireLanguage.g:4449:2: ( rule__VLSFunctionFof__Group_1_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==44) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalVampireLanguage.g:4449:3: rule__VLSFunctionFof__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__VLSFunctionFof__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getVLSFunctionFofAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__Group_1__2__Impl"


    // $ANTLR start "rule__VLSFunctionFof__Group_1__3"
    // InternalVampireLanguage.g:4457:1: rule__VLSFunctionFof__Group_1__3 : rule__VLSFunctionFof__Group_1__3__Impl ;
    public final void rule__VLSFunctionFof__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4461:1: ( rule__VLSFunctionFof__Group_1__3__Impl )
            // InternalVampireLanguage.g:4462:2: rule__VLSFunctionFof__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionFof__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__Group_1__3"


    // $ANTLR start "rule__VLSFunctionFof__Group_1__3__Impl"
    // InternalVampireLanguage.g:4468:1: rule__VLSFunctionFof__Group_1__3__Impl : ( ')' ) ;
    public final void rule__VLSFunctionFof__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4472:1: ( ( ')' ) )
            // InternalVampireLanguage.g:4473:1: ( ')' )
            {
            // InternalVampireLanguage.g:4473:1: ( ')' )
            // InternalVampireLanguage.g:4474:2: ')'
            {
             before(grammarAccess.getVLSFunctionFofAccess().getRightParenthesisKeyword_1_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVLSFunctionFofAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__Group_1__3__Impl"


    // $ANTLR start "rule__VLSFunctionFof__Group_1_2__0"
    // InternalVampireLanguage.g:4484:1: rule__VLSFunctionFof__Group_1_2__0 : rule__VLSFunctionFof__Group_1_2__0__Impl rule__VLSFunctionFof__Group_1_2__1 ;
    public final void rule__VLSFunctionFof__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4488:1: ( rule__VLSFunctionFof__Group_1_2__0__Impl rule__VLSFunctionFof__Group_1_2__1 )
            // InternalVampireLanguage.g:4489:2: rule__VLSFunctionFof__Group_1_2__0__Impl rule__VLSFunctionFof__Group_1_2__1
            {
            pushFollow(FOLLOW_38);
            rule__VLSFunctionFof__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFunctionFof__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__Group_1_2__0"


    // $ANTLR start "rule__VLSFunctionFof__Group_1_2__0__Impl"
    // InternalVampireLanguage.g:4496:1: rule__VLSFunctionFof__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__VLSFunctionFof__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4500:1: ( ( ',' ) )
            // InternalVampireLanguage.g:4501:1: ( ',' )
            {
            // InternalVampireLanguage.g:4501:1: ( ',' )
            // InternalVampireLanguage.g:4502:2: ','
            {
             before(grammarAccess.getVLSFunctionFofAccess().getCommaKeyword_1_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVLSFunctionFofAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__Group_1_2__0__Impl"


    // $ANTLR start "rule__VLSFunctionFof__Group_1_2__1"
    // InternalVampireLanguage.g:4511:1: rule__VLSFunctionFof__Group_1_2__1 : rule__VLSFunctionFof__Group_1_2__1__Impl ;
    public final void rule__VLSFunctionFof__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4515:1: ( rule__VLSFunctionFof__Group_1_2__1__Impl )
            // InternalVampireLanguage.g:4516:2: rule__VLSFunctionFof__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionFof__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__Group_1_2__1"


    // $ANTLR start "rule__VLSFunctionFof__Group_1_2__1__Impl"
    // InternalVampireLanguage.g:4522:1: rule__VLSFunctionFof__Group_1_2__1__Impl : ( ( rule__VLSFunctionFof__TermsAssignment_1_2_1 ) ) ;
    public final void rule__VLSFunctionFof__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4526:1: ( ( ( rule__VLSFunctionFof__TermsAssignment_1_2_1 ) ) )
            // InternalVampireLanguage.g:4527:1: ( ( rule__VLSFunctionFof__TermsAssignment_1_2_1 ) )
            {
            // InternalVampireLanguage.g:4527:1: ( ( rule__VLSFunctionFof__TermsAssignment_1_2_1 ) )
            // InternalVampireLanguage.g:4528:2: ( rule__VLSFunctionFof__TermsAssignment_1_2_1 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getTermsAssignment_1_2_1()); 
            // InternalVampireLanguage.g:4529:2: ( rule__VLSFunctionFof__TermsAssignment_1_2_1 )
            // InternalVampireLanguage.g:4529:3: rule__VLSFunctionFof__TermsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionFof__TermsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSFunctionFofAccess().getTermsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__Group_1_2__1__Impl"


    // $ANTLR start "rule__VLSDefinedTerm__Group_0__0"
    // InternalVampireLanguage.g:4538:1: rule__VLSDefinedTerm__Group_0__0 : rule__VLSDefinedTerm__Group_0__0__Impl rule__VLSDefinedTerm__Group_0__1 ;
    public final void rule__VLSDefinedTerm__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4542:1: ( rule__VLSDefinedTerm__Group_0__0__Impl rule__VLSDefinedTerm__Group_0__1 )
            // InternalVampireLanguage.g:4543:2: rule__VLSDefinedTerm__Group_0__0__Impl rule__VLSDefinedTerm__Group_0__1
            {
            pushFollow(FOLLOW_40);
            rule__VLSDefinedTerm__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSDefinedTerm__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__Group_0__0"


    // $ANTLR start "rule__VLSDefinedTerm__Group_0__0__Impl"
    // InternalVampireLanguage.g:4550:1: rule__VLSDefinedTerm__Group_0__0__Impl : ( () ) ;
    public final void rule__VLSDefinedTerm__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4554:1: ( ( () ) )
            // InternalVampireLanguage.g:4555:1: ( () )
            {
            // InternalVampireLanguage.g:4555:1: ( () )
            // InternalVampireLanguage.g:4556:2: ()
            {
             before(grammarAccess.getVLSDefinedTermAccess().getVLSIntAction_0_0()); 
            // InternalVampireLanguage.g:4557:2: ()
            // InternalVampireLanguage.g:4557:3: 
            {
            }

             after(grammarAccess.getVLSDefinedTermAccess().getVLSIntAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__Group_0__0__Impl"


    // $ANTLR start "rule__VLSDefinedTerm__Group_0__1"
    // InternalVampireLanguage.g:4565:1: rule__VLSDefinedTerm__Group_0__1 : rule__VLSDefinedTerm__Group_0__1__Impl ;
    public final void rule__VLSDefinedTerm__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4569:1: ( rule__VLSDefinedTerm__Group_0__1__Impl )
            // InternalVampireLanguage.g:4570:2: rule__VLSDefinedTerm__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSDefinedTerm__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__Group_0__1"


    // $ANTLR start "rule__VLSDefinedTerm__Group_0__1__Impl"
    // InternalVampireLanguage.g:4576:1: rule__VLSDefinedTerm__Group_0__1__Impl : ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) ) ;
    public final void rule__VLSDefinedTerm__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4580:1: ( ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) ) )
            // InternalVampireLanguage.g:4581:1: ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) )
            {
            // InternalVampireLanguage.g:4581:1: ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) )
            // InternalVampireLanguage.g:4582:2: ( rule__VLSDefinedTerm__ValueAssignment_0_1 )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_0_1()); 
            // InternalVampireLanguage.g:4583:2: ( rule__VLSDefinedTerm__ValueAssignment_0_1 )
            // InternalVampireLanguage.g:4583:3: rule__VLSDefinedTerm__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSDefinedTerm__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__Group_0__1__Impl"


    // $ANTLR start "rule__VLSDefinedTerm__Group_1__0"
    // InternalVampireLanguage.g:4592:1: rule__VLSDefinedTerm__Group_1__0 : rule__VLSDefinedTerm__Group_1__0__Impl rule__VLSDefinedTerm__Group_1__1 ;
    public final void rule__VLSDefinedTerm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4596:1: ( rule__VLSDefinedTerm__Group_1__0__Impl rule__VLSDefinedTerm__Group_1__1 )
            // InternalVampireLanguage.g:4597:2: rule__VLSDefinedTerm__Group_1__0__Impl rule__VLSDefinedTerm__Group_1__1
            {
            pushFollow(FOLLOW_41);
            rule__VLSDefinedTerm__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSDefinedTerm__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__Group_1__0"


    // $ANTLR start "rule__VLSDefinedTerm__Group_1__0__Impl"
    // InternalVampireLanguage.g:4604:1: rule__VLSDefinedTerm__Group_1__0__Impl : ( () ) ;
    public final void rule__VLSDefinedTerm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4608:1: ( ( () ) )
            // InternalVampireLanguage.g:4609:1: ( () )
            {
            // InternalVampireLanguage.g:4609:1: ( () )
            // InternalVampireLanguage.g:4610:2: ()
            {
             before(grammarAccess.getVLSDefinedTermAccess().getVLSRealAction_1_0()); 
            // InternalVampireLanguage.g:4611:2: ()
            // InternalVampireLanguage.g:4611:3: 
            {
            }

             after(grammarAccess.getVLSDefinedTermAccess().getVLSRealAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__Group_1__0__Impl"


    // $ANTLR start "rule__VLSDefinedTerm__Group_1__1"
    // InternalVampireLanguage.g:4619:1: rule__VLSDefinedTerm__Group_1__1 : rule__VLSDefinedTerm__Group_1__1__Impl ;
    public final void rule__VLSDefinedTerm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4623:1: ( rule__VLSDefinedTerm__Group_1__1__Impl )
            // InternalVampireLanguage.g:4624:2: rule__VLSDefinedTerm__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSDefinedTerm__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__Group_1__1"


    // $ANTLR start "rule__VLSDefinedTerm__Group_1__1__Impl"
    // InternalVampireLanguage.g:4630:1: rule__VLSDefinedTerm__Group_1__1__Impl : ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) ) ;
    public final void rule__VLSDefinedTerm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4634:1: ( ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:4635:1: ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:4635:1: ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) )
            // InternalVampireLanguage.g:4636:2: ( rule__VLSDefinedTerm__ValueAssignment_1_1 )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_1_1()); 
            // InternalVampireLanguage.g:4637:2: ( rule__VLSDefinedTerm__ValueAssignment_1_1 )
            // InternalVampireLanguage.g:4637:3: rule__VLSDefinedTerm__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSDefinedTerm__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__Group_1__1__Impl"


    // $ANTLR start "rule__VLSDefinedTerm__Group_2__0"
    // InternalVampireLanguage.g:4646:1: rule__VLSDefinedTerm__Group_2__0 : rule__VLSDefinedTerm__Group_2__0__Impl rule__VLSDefinedTerm__Group_2__1 ;
    public final void rule__VLSDefinedTerm__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4650:1: ( rule__VLSDefinedTerm__Group_2__0__Impl rule__VLSDefinedTerm__Group_2__1 )
            // InternalVampireLanguage.g:4651:2: rule__VLSDefinedTerm__Group_2__0__Impl rule__VLSDefinedTerm__Group_2__1
            {
            pushFollow(FOLLOW_42);
            rule__VLSDefinedTerm__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSDefinedTerm__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__Group_2__0"


    // $ANTLR start "rule__VLSDefinedTerm__Group_2__0__Impl"
    // InternalVampireLanguage.g:4658:1: rule__VLSDefinedTerm__Group_2__0__Impl : ( () ) ;
    public final void rule__VLSDefinedTerm__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4662:1: ( ( () ) )
            // InternalVampireLanguage.g:4663:1: ( () )
            {
            // InternalVampireLanguage.g:4663:1: ( () )
            // InternalVampireLanguage.g:4664:2: ()
            {
             before(grammarAccess.getVLSDefinedTermAccess().getVLSRationalAction_2_0()); 
            // InternalVampireLanguage.g:4665:2: ()
            // InternalVampireLanguage.g:4665:3: 
            {
            }

             after(grammarAccess.getVLSDefinedTermAccess().getVLSRationalAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__Group_2__0__Impl"


    // $ANTLR start "rule__VLSDefinedTerm__Group_2__1"
    // InternalVampireLanguage.g:4673:1: rule__VLSDefinedTerm__Group_2__1 : rule__VLSDefinedTerm__Group_2__1__Impl ;
    public final void rule__VLSDefinedTerm__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4677:1: ( rule__VLSDefinedTerm__Group_2__1__Impl )
            // InternalVampireLanguage.g:4678:2: rule__VLSDefinedTerm__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSDefinedTerm__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__Group_2__1"


    // $ANTLR start "rule__VLSDefinedTerm__Group_2__1__Impl"
    // InternalVampireLanguage.g:4684:1: rule__VLSDefinedTerm__Group_2__1__Impl : ( ( rule__VLSDefinedTerm__ValueAssignment_2_1 ) ) ;
    public final void rule__VLSDefinedTerm__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4688:1: ( ( ( rule__VLSDefinedTerm__ValueAssignment_2_1 ) ) )
            // InternalVampireLanguage.g:4689:1: ( ( rule__VLSDefinedTerm__ValueAssignment_2_1 ) )
            {
            // InternalVampireLanguage.g:4689:1: ( ( rule__VLSDefinedTerm__ValueAssignment_2_1 ) )
            // InternalVampireLanguage.g:4690:2: ( rule__VLSDefinedTerm__ValueAssignment_2_1 )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_2_1()); 
            // InternalVampireLanguage.g:4691:2: ( rule__VLSDefinedTerm__ValueAssignment_2_1 )
            // InternalVampireLanguage.g:4691:3: rule__VLSDefinedTerm__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSDefinedTerm__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__Group_2__1__Impl"


    // $ANTLR start "rule__VLSDefinedTerm__Group_3__0"
    // InternalVampireLanguage.g:4700:1: rule__VLSDefinedTerm__Group_3__0 : rule__VLSDefinedTerm__Group_3__0__Impl rule__VLSDefinedTerm__Group_3__1 ;
    public final void rule__VLSDefinedTerm__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4704:1: ( rule__VLSDefinedTerm__Group_3__0__Impl rule__VLSDefinedTerm__Group_3__1 )
            // InternalVampireLanguage.g:4705:2: rule__VLSDefinedTerm__Group_3__0__Impl rule__VLSDefinedTerm__Group_3__1
            {
            pushFollow(FOLLOW_38);
            rule__VLSDefinedTerm__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSDefinedTerm__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__Group_3__0"


    // $ANTLR start "rule__VLSDefinedTerm__Group_3__0__Impl"
    // InternalVampireLanguage.g:4712:1: rule__VLSDefinedTerm__Group_3__0__Impl : ( () ) ;
    public final void rule__VLSDefinedTerm__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4716:1: ( ( () ) )
            // InternalVampireLanguage.g:4717:1: ( () )
            {
            // InternalVampireLanguage.g:4717:1: ( () )
            // InternalVampireLanguage.g:4718:2: ()
            {
             before(grammarAccess.getVLSDefinedTermAccess().getVLSDoubleQuoteAction_3_0()); 
            // InternalVampireLanguage.g:4719:2: ()
            // InternalVampireLanguage.g:4719:3: 
            {
            }

             after(grammarAccess.getVLSDefinedTermAccess().getVLSDoubleQuoteAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__Group_3__0__Impl"


    // $ANTLR start "rule__VLSDefinedTerm__Group_3__1"
    // InternalVampireLanguage.g:4727:1: rule__VLSDefinedTerm__Group_3__1 : rule__VLSDefinedTerm__Group_3__1__Impl ;
    public final void rule__VLSDefinedTerm__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4731:1: ( rule__VLSDefinedTerm__Group_3__1__Impl )
            // InternalVampireLanguage.g:4732:2: rule__VLSDefinedTerm__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSDefinedTerm__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__Group_3__1"


    // $ANTLR start "rule__VLSDefinedTerm__Group_3__1__Impl"
    // InternalVampireLanguage.g:4738:1: rule__VLSDefinedTerm__Group_3__1__Impl : ( ( rule__VLSDefinedTerm__ValueAssignment_3_1 ) ) ;
    public final void rule__VLSDefinedTerm__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4742:1: ( ( ( rule__VLSDefinedTerm__ValueAssignment_3_1 ) ) )
            // InternalVampireLanguage.g:4743:1: ( ( rule__VLSDefinedTerm__ValueAssignment_3_1 ) )
            {
            // InternalVampireLanguage.g:4743:1: ( ( rule__VLSDefinedTerm__ValueAssignment_3_1 ) )
            // InternalVampireLanguage.g:4744:2: ( rule__VLSDefinedTerm__ValueAssignment_3_1 )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_3_1()); 
            // InternalVampireLanguage.g:4745:2: ( rule__VLSDefinedTerm__ValueAssignment_3_1 )
            // InternalVampireLanguage.g:4745:3: rule__VLSDefinedTerm__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSDefinedTerm__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__Group_3__1__Impl"


    // $ANTLR start "rule__VampireModel__CommentsAssignment_0"
    // InternalVampireLanguage.g:4754:1: rule__VampireModel__CommentsAssignment_0 : ( ruleVLSComment ) ;
    public final void rule__VampireModel__CommentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4758:1: ( ( ruleVLSComment ) )
            // InternalVampireLanguage.g:4759:2: ( ruleVLSComment )
            {
            // InternalVampireLanguage.g:4759:2: ( ruleVLSComment )
            // InternalVampireLanguage.g:4760:3: ruleVLSComment
            {
             before(grammarAccess.getVampireModelAccess().getCommentsVLSCommentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSComment();

            state._fsp--;

             after(grammarAccess.getVampireModelAccess().getCommentsVLSCommentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VampireModel__CommentsAssignment_0"


    // $ANTLR start "rule__VampireModel__FormulasAssignment_1"
    // InternalVampireLanguage.g:4769:1: rule__VampireModel__FormulasAssignment_1 : ( ruleVLSFofFormula ) ;
    public final void rule__VampireModel__FormulasAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4773:1: ( ( ruleVLSFofFormula ) )
            // InternalVampireLanguage.g:4774:2: ( ruleVLSFofFormula )
            {
            // InternalVampireLanguage.g:4774:2: ( ruleVLSFofFormula )
            // InternalVampireLanguage.g:4775:3: ruleVLSFofFormula
            {
             before(grammarAccess.getVampireModelAccess().getFormulasVLSFofFormulaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSFofFormula();

            state._fsp--;

             after(grammarAccess.getVampireModelAccess().getFormulasVLSFofFormulaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VampireModel__FormulasAssignment_1"


    // $ANTLR start "rule__VLSComment__CommentAssignment"
    // InternalVampireLanguage.g:4784:1: rule__VLSComment__CommentAssignment : ( RULE_SINGLE_COMMENT ) ;
    public final void rule__VLSComment__CommentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4788:1: ( ( RULE_SINGLE_COMMENT ) )
            // InternalVampireLanguage.g:4789:2: ( RULE_SINGLE_COMMENT )
            {
            // InternalVampireLanguage.g:4789:2: ( RULE_SINGLE_COMMENT )
            // InternalVampireLanguage.g:4790:3: RULE_SINGLE_COMMENT
            {
             before(grammarAccess.getVLSCommentAccess().getCommentSINGLE_COMMENTTerminalRuleCall_0()); 
            match(input,RULE_SINGLE_COMMENT,FOLLOW_2); 
             after(grammarAccess.getVLSCommentAccess().getCommentSINGLE_COMMENTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSComment__CommentAssignment"


    // $ANTLR start "rule__VLSFofFormula__NameAssignment_2"
    // InternalVampireLanguage.g:4799:1: rule__VLSFofFormula__NameAssignment_2 : ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) ) ;
    public final void rule__VLSFofFormula__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4803:1: ( ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) ) )
            // InternalVampireLanguage.g:4804:2: ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) )
            {
            // InternalVampireLanguage.g:4804:2: ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) )
            // InternalVampireLanguage.g:4805:3: ( rule__VLSFofFormula__NameAlternatives_2_0 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getNameAlternatives_2_0()); 
            // InternalVampireLanguage.g:4806:3: ( rule__VLSFofFormula__NameAlternatives_2_0 )
            // InternalVampireLanguage.g:4806:4: rule__VLSFofFormula__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSFofFormula__NameAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSFofFormulaAccess().getNameAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__NameAssignment_2"


    // $ANTLR start "rule__VLSFofFormula__FofRoleAssignment_4"
    // InternalVampireLanguage.g:4814:1: rule__VLSFofFormula__FofRoleAssignment_4 : ( ruleVLSRole ) ;
    public final void rule__VLSFofFormula__FofRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4818:1: ( ( ruleVLSRole ) )
            // InternalVampireLanguage.g:4819:2: ( ruleVLSRole )
            {
            // InternalVampireLanguage.g:4819:2: ( ruleVLSRole )
            // InternalVampireLanguage.g:4820:3: ruleVLSRole
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofRoleVLSRoleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSRole();

            state._fsp--;

             after(grammarAccess.getVLSFofFormulaAccess().getFofRoleVLSRoleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__FofRoleAssignment_4"


    // $ANTLR start "rule__VLSFofFormula__FofFormulaAssignment_6"
    // InternalVampireLanguage.g:4829:1: rule__VLSFofFormula__FofFormulaAssignment_6 : ( ruleVLSTerm ) ;
    public final void rule__VLSFofFormula__FofFormulaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4833:1: ( ( ruleVLSTerm ) )
            // InternalVampireLanguage.g:4834:2: ( ruleVLSTerm )
            {
            // InternalVampireLanguage.g:4834:2: ( ruleVLSTerm )
            // InternalVampireLanguage.g:4835:3: ruleVLSTerm
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofFormulaVLSTermParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSTerm();

            state._fsp--;

             after(grammarAccess.getVLSFofFormulaAccess().getFofFormulaVLSTermParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__FofFormulaAssignment_6"


    // $ANTLR start "rule__VLSFofFormula__AnnotationsAssignment_7_1"
    // InternalVampireLanguage.g:4844:1: rule__VLSFofFormula__AnnotationsAssignment_7_1 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSFofFormula__AnnotationsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4848:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:4849:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:4849:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:4850:3: ruleVLSAnnotation
            {
             before(grammarAccess.getVLSFofFormulaAccess().getAnnotationsVLSAnnotationParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSAnnotation();

            state._fsp--;

             after(grammarAccess.getVLSFofFormulaAccess().getAnnotationsVLSAnnotationParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFofFormula__AnnotationsAssignment_7_1"


    // $ANTLR start "rule__VLSAnnotation__NameAssignment_1"
    // InternalVampireLanguage.g:4859:1: rule__VLSAnnotation__NameAssignment_1 : ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) ) ;
    public final void rule__VLSAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4863:1: ( ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) ) )
            // InternalVampireLanguage.g:4864:2: ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) )
            {
            // InternalVampireLanguage.g:4864:2: ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) )
            // InternalVampireLanguage.g:4865:3: ( rule__VLSAnnotation__NameAlternatives_1_0 )
            {
             before(grammarAccess.getVLSAnnotationAccess().getNameAlternatives_1_0()); 
            // InternalVampireLanguage.g:4866:3: ( rule__VLSAnnotation__NameAlternatives_1_0 )
            // InternalVampireLanguage.g:4866:4: rule__VLSAnnotation__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSAnnotation__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSAnnotationAccess().getNameAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotation__NameAssignment_1"


    // $ANTLR start "rule__VLSAnnotation__FollowupAssignment_2_1"
    // InternalVampireLanguage.g:4874:1: rule__VLSAnnotation__FollowupAssignment_2_1 : ( ruleVLSAnnotationTerms ) ;
    public final void rule__VLSAnnotation__FollowupAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4878:1: ( ( ruleVLSAnnotationTerms ) )
            // InternalVampireLanguage.g:4879:2: ( ruleVLSAnnotationTerms )
            {
            // InternalVampireLanguage.g:4879:2: ( ruleVLSAnnotationTerms )
            // InternalVampireLanguage.g:4880:3: ruleVLSAnnotationTerms
            {
             before(grammarAccess.getVLSAnnotationAccess().getFollowupVLSAnnotationTermsParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSAnnotationTerms();

            state._fsp--;

             after(grammarAccess.getVLSAnnotationAccess().getFollowupVLSAnnotationTermsParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotation__FollowupAssignment_2_1"


    // $ANTLR start "rule__VLSAnnotationTerms__TermsAssignment_0"
    // InternalVampireLanguage.g:4889:1: rule__VLSAnnotationTerms__TermsAssignment_0 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSAnnotationTerms__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4893:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:4894:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:4894:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:4895:3: ruleVLSAnnotation
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getTermsVLSAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSAnnotation();

            state._fsp--;

             after(grammarAccess.getVLSAnnotationTermsAccess().getTermsVLSAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotationTerms__TermsAssignment_0"


    // $ANTLR start "rule__VLSAnnotationTerms__TermsAssignment_1_1"
    // InternalVampireLanguage.g:4904:1: rule__VLSAnnotationTerms__TermsAssignment_1_1 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSAnnotationTerms__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4908:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:4909:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:4909:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:4910:3: ruleVLSAnnotation
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getTermsVLSAnnotationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSAnnotation();

            state._fsp--;

             after(grammarAccess.getVLSAnnotationTermsAccess().getTermsVLSAnnotationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAnnotationTerms__TermsAssignment_1_1"


    // $ANTLR start "rule__VLSBinary__RightAssignment_1_0_1"
    // InternalVampireLanguage.g:4919:1: rule__VLSBinary__RightAssignment_1_0_1 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4923:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:4924:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:4924:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:4925:3: ruleVLSUnitaryFormula
            {
             before(grammarAccess.getVLSBinaryAccess().getRightVLSUnitaryFormulaParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSUnitaryFormula();

            state._fsp--;

             after(grammarAccess.getVLSBinaryAccess().getRightVLSUnitaryFormulaParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__RightAssignment_1_0_1"


    // $ANTLR start "rule__VLSBinary__RightAssignment_1_1_2"
    // InternalVampireLanguage.g:4934:1: rule__VLSBinary__RightAssignment_1_1_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4938:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:4939:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:4939:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:4940:3: ruleVLSUnitaryFormula
            {
             before(grammarAccess.getVLSBinaryAccess().getRightVLSUnitaryFormulaParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSUnitaryFormula();

            state._fsp--;

             after(grammarAccess.getVLSBinaryAccess().getRightVLSUnitaryFormulaParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__RightAssignment_1_1_2"


    // $ANTLR start "rule__VLSBinary__RightAssignment_1_2_2"
    // InternalVampireLanguage.g:4949:1: rule__VLSBinary__RightAssignment_1_2_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4953:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:4954:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:4954:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:4955:3: ruleVLSUnitaryFormula
            {
             before(grammarAccess.getVLSBinaryAccess().getRightVLSUnitaryFormulaParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSUnitaryFormula();

            state._fsp--;

             after(grammarAccess.getVLSBinaryAccess().getRightVLSUnitaryFormulaParserRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSBinary__RightAssignment_1_2_2"


    // $ANTLR start "rule__VLSUniversalQuantifier__VariablesAssignment_1_2"
    // InternalVampireLanguage.g:4964:1: rule__VLSUniversalQuantifier__VariablesAssignment_1_2 : ( ruleVLSVariable ) ;
    public final void rule__VLSUniversalQuantifier__VariablesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4968:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:4969:2: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:4969:2: ( ruleVLSVariable )
            // InternalVampireLanguage.g:4970:3: ruleVLSVariable
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSVariable();

            state._fsp--;

             after(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__VariablesAssignment_1_2"


    // $ANTLR start "rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1"
    // InternalVampireLanguage.g:4979:1: rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 : ( ruleVLSVariable ) ;
    public final void rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4983:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:4984:2: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:4984:2: ( ruleVLSVariable )
            // InternalVampireLanguage.g:4985:3: ruleVLSVariable
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSVariable();

            state._fsp--;

             after(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1"


    // $ANTLR start "rule__VLSUniversalQuantifier__OperandAssignment_2"
    // InternalVampireLanguage.g:4994:1: rule__VLSUniversalQuantifier__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSUniversalQuantifier__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4998:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:4999:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:4999:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:5000:3: ruleVLSUnitaryFormula
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getOperandVLSUnitaryFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSUnitaryFormula();

            state._fsp--;

             after(grammarAccess.getVLSUniversalQuantifierAccess().getOperandVLSUnitaryFormulaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUniversalQuantifier__OperandAssignment_2"


    // $ANTLR start "rule__VLSExistentialQuantifier__VariablesAssignment_1_2"
    // InternalVampireLanguage.g:5009:1: rule__VLSExistentialQuantifier__VariablesAssignment_1_2 : ( ruleVLSVariable ) ;
    public final void rule__VLSExistentialQuantifier__VariablesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5013:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:5014:2: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:5014:2: ( ruleVLSVariable )
            // InternalVampireLanguage.g:5015:3: ruleVLSVariable
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSVariable();

            state._fsp--;

             after(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__VariablesAssignment_1_2"


    // $ANTLR start "rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1"
    // InternalVampireLanguage.g:5024:1: rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 : ( ruleVLSVariable ) ;
    public final void rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5028:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:5029:2: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:5029:2: ( ruleVLSVariable )
            // InternalVampireLanguage.g:5030:3: ruleVLSVariable
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSVariable();

            state._fsp--;

             after(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1"


    // $ANTLR start "rule__VLSExistentialQuantifier__OperandAssignment_2"
    // InternalVampireLanguage.g:5039:1: rule__VLSExistentialQuantifier__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSExistentialQuantifier__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5043:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:5044:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:5044:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:5045:3: ruleVLSUnitaryFormula
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getOperandVLSUnitaryFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSUnitaryFormula();

            state._fsp--;

             after(grammarAccess.getVLSExistentialQuantifierAccess().getOperandVLSUnitaryFormulaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSExistentialQuantifier__OperandAssignment_2"


    // $ANTLR start "rule__VLSUnaryNegation__OperandAssignment_2"
    // InternalVampireLanguage.g:5054:1: rule__VLSUnaryNegation__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSUnaryNegation__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5058:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:5059:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:5059:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:5060:3: ruleVLSUnitaryFormula
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getOperandVLSUnitaryFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSUnitaryFormula();

            state._fsp--;

             after(grammarAccess.getVLSUnaryNegationAccess().getOperandVLSUnitaryFormulaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryNegation__OperandAssignment_2"


    // $ANTLR start "rule__VLSUnaryInfix__RightAssignment_1_1"
    // InternalVampireLanguage.g:5069:1: rule__VLSUnaryInfix__RightAssignment_1_1 : ( ruleVLSAtomic ) ;
    public final void rule__VLSUnaryInfix__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5073:1: ( ( ruleVLSAtomic ) )
            // InternalVampireLanguage.g:5074:2: ( ruleVLSAtomic )
            {
            // InternalVampireLanguage.g:5074:2: ( ruleVLSAtomic )
            // InternalVampireLanguage.g:5075:3: ruleVLSAtomic
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getRightVLSAtomicParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSAtomic();

            state._fsp--;

             after(grammarAccess.getVLSUnaryInfixAccess().getRightVLSAtomicParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnaryInfix__RightAssignment_1_1"


    // $ANTLR start "rule__VLSAtomicConstant__NameAssignment_0_1"
    // InternalVampireLanguage.g:5084:1: rule__VLSAtomicConstant__NameAssignment_0_1 : ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) ) ;
    public final void rule__VLSAtomicConstant__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5088:1: ( ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) ) )
            // InternalVampireLanguage.g:5089:2: ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) )
            {
            // InternalVampireLanguage.g:5089:2: ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) )
            // InternalVampireLanguage.g:5090:3: ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getNameAlternatives_0_1_0()); 
            // InternalVampireLanguage.g:5091:3: ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 )
            // InternalVampireLanguage.g:5091:4: rule__VLSAtomicConstant__NameAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicConstant__NameAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSAtomicConstantAccess().getNameAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicConstant__NameAssignment_0_1"


    // $ANTLR start "rule__VLSAtomicConstant__NameAssignment_1_1"
    // InternalVampireLanguage.g:5099:1: rule__VLSAtomicConstant__NameAssignment_1_1 : ( ( '$true' ) ) ;
    public final void rule__VLSAtomicConstant__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5103:1: ( ( ( '$true' ) ) )
            // InternalVampireLanguage.g:5104:2: ( ( '$true' ) )
            {
            // InternalVampireLanguage.g:5104:2: ( ( '$true' ) )
            // InternalVampireLanguage.g:5105:3: ( '$true' )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getNameTrueKeyword_1_1_0()); 
            // InternalVampireLanguage.g:5106:3: ( '$true' )
            // InternalVampireLanguage.g:5107:4: '$true'
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getNameTrueKeyword_1_1_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getVLSAtomicConstantAccess().getNameTrueKeyword_1_1_0()); 

            }

             after(grammarAccess.getVLSAtomicConstantAccess().getNameTrueKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicConstant__NameAssignment_1_1"


    // $ANTLR start "rule__VLSAtomicConstant__NameAssignment_2_1"
    // InternalVampireLanguage.g:5118:1: rule__VLSAtomicConstant__NameAssignment_2_1 : ( ( '$false' ) ) ;
    public final void rule__VLSAtomicConstant__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5122:1: ( ( ( '$false' ) ) )
            // InternalVampireLanguage.g:5123:2: ( ( '$false' ) )
            {
            // InternalVampireLanguage.g:5123:2: ( ( '$false' ) )
            // InternalVampireLanguage.g:5124:3: ( '$false' )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getNameFalseKeyword_2_1_0()); 
            // InternalVampireLanguage.g:5125:3: ( '$false' )
            // InternalVampireLanguage.g:5126:4: '$false'
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getNameFalseKeyword_2_1_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getVLSAtomicConstantAccess().getNameFalseKeyword_2_1_0()); 

            }

             after(grammarAccess.getVLSAtomicConstantAccess().getNameFalseKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicConstant__NameAssignment_2_1"


    // $ANTLR start "rule__VLSAtomicFunction__ConstantAssignment_0_1"
    // InternalVampireLanguage.g:5137:1: rule__VLSAtomicFunction__ConstantAssignment_0_1 : ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) ) ;
    public final void rule__VLSAtomicFunction__ConstantAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5141:1: ( ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) ) )
            // InternalVampireLanguage.g:5142:2: ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) )
            {
            // InternalVampireLanguage.g:5142:2: ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) )
            // InternalVampireLanguage.g:5143:3: ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getConstantAlternatives_0_1_0()); 
            // InternalVampireLanguage.g:5144:3: ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 )
            // InternalVampireLanguage.g:5144:4: rule__VLSAtomicFunction__ConstantAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSAtomicFunction__ConstantAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSAtomicFunctionAccess().getConstantAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__ConstantAssignment_0_1"


    // $ANTLR start "rule__VLSAtomicFunction__TermsAssignment_0_2_1"
    // InternalVampireLanguage.g:5152:1: rule__VLSAtomicFunction__TermsAssignment_0_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5156:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5157:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5157:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5158:3: ruleVLSFofTerm
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsVLSFofTermParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSFofTerm();

            state._fsp--;

             after(grammarAccess.getVLSAtomicFunctionAccess().getTermsVLSFofTermParserRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__TermsAssignment_0_2_1"


    // $ANTLR start "rule__VLSAtomicFunction__TermsAssignment_0_2_2_1"
    // InternalVampireLanguage.g:5167:1: rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_0_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5171:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5172:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5172:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5173:3: ruleVLSFofTerm
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsVLSFofTermParserRuleCall_0_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSFofTerm();

            state._fsp--;

             after(grammarAccess.getVLSAtomicFunctionAccess().getTermsVLSFofTermParserRuleCall_0_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__TermsAssignment_0_2_2_1"


    // $ANTLR start "rule__VLSAtomicFunction__NameAssignment_1_1"
    // InternalVampireLanguage.g:5182:1: rule__VLSAtomicFunction__NameAssignment_1_1 : ( ( '$less' ) ) ;
    public final void rule__VLSAtomicFunction__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5186:1: ( ( ( '$less' ) ) )
            // InternalVampireLanguage.g:5187:2: ( ( '$less' ) )
            {
            // InternalVampireLanguage.g:5187:2: ( ( '$less' ) )
            // InternalVampireLanguage.g:5188:3: ( '$less' )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getNameLessKeyword_1_1_0()); 
            // InternalVampireLanguage.g:5189:3: ( '$less' )
            // InternalVampireLanguage.g:5190:4: '$less'
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getNameLessKeyword_1_1_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getVLSAtomicFunctionAccess().getNameLessKeyword_1_1_0()); 

            }

             after(grammarAccess.getVLSAtomicFunctionAccess().getNameLessKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__NameAssignment_1_1"


    // $ANTLR start "rule__VLSAtomicFunction__TermsAssignment_1_3"
    // InternalVampireLanguage.g:5201:1: rule__VLSAtomicFunction__TermsAssignment_1_3 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5205:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5206:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5206:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5207:3: ruleVLSFofTerm
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsVLSFofTermParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSFofTerm();

            state._fsp--;

             after(grammarAccess.getVLSAtomicFunctionAccess().getTermsVLSFofTermParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__TermsAssignment_1_3"


    // $ANTLR start "rule__VLSAtomicFunction__TermsAssignment_1_5"
    // InternalVampireLanguage.g:5216:1: rule__VLSAtomicFunction__TermsAssignment_1_5 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5220:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5221:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5221:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5222:3: ruleVLSFofTerm
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsVLSFofTermParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSFofTerm();

            state._fsp--;

             after(grammarAccess.getVLSAtomicFunctionAccess().getTermsVLSFofTermParserRuleCall_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSAtomicFunction__TermsAssignment_1_5"


    // $ANTLR start "rule__VLSVariable__NameAssignment"
    // InternalVampireLanguage.g:5231:1: rule__VLSVariable__NameAssignment : ( RULE_UPPER_WORD_ID ) ;
    public final void rule__VLSVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5235:1: ( ( RULE_UPPER_WORD_ID ) )
            // InternalVampireLanguage.g:5236:2: ( RULE_UPPER_WORD_ID )
            {
            // InternalVampireLanguage.g:5236:2: ( RULE_UPPER_WORD_ID )
            // InternalVampireLanguage.g:5237:3: RULE_UPPER_WORD_ID
            {
             before(grammarAccess.getVLSVariableAccess().getNameUPPER_WORD_IDTerminalRuleCall_0()); 
            match(input,RULE_UPPER_WORD_ID,FOLLOW_2); 
             after(grammarAccess.getVLSVariableAccess().getNameUPPER_WORD_IDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSVariable__NameAssignment"


    // $ANTLR start "rule__VLSFunctionFof__FunctorAssignment_0"
    // InternalVampireLanguage.g:5246:1: rule__VLSFunctionFof__FunctorAssignment_0 : ( ( rule__VLSFunctionFof__FunctorAlternatives_0_0 ) ) ;
    public final void rule__VLSFunctionFof__FunctorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5250:1: ( ( ( rule__VLSFunctionFof__FunctorAlternatives_0_0 ) ) )
            // InternalVampireLanguage.g:5251:2: ( ( rule__VLSFunctionFof__FunctorAlternatives_0_0 ) )
            {
            // InternalVampireLanguage.g:5251:2: ( ( rule__VLSFunctionFof__FunctorAlternatives_0_0 ) )
            // InternalVampireLanguage.g:5252:3: ( rule__VLSFunctionFof__FunctorAlternatives_0_0 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getFunctorAlternatives_0_0()); 
            // InternalVampireLanguage.g:5253:3: ( rule__VLSFunctionFof__FunctorAlternatives_0_0 )
            // InternalVampireLanguage.g:5253:4: rule__VLSFunctionFof__FunctorAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionFof__FunctorAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSFunctionFofAccess().getFunctorAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__FunctorAssignment_0"


    // $ANTLR start "rule__VLSFunctionFof__TermsAssignment_1_1"
    // InternalVampireLanguage.g:5261:1: rule__VLSFunctionFof__TermsAssignment_1_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSFunctionFof__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5265:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5266:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5266:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5267:3: ruleVLSFofTerm
            {
             before(grammarAccess.getVLSFunctionFofAccess().getTermsVLSFofTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSFofTerm();

            state._fsp--;

             after(grammarAccess.getVLSFunctionFofAccess().getTermsVLSFofTermParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__TermsAssignment_1_1"


    // $ANTLR start "rule__VLSFunctionFof__TermsAssignment_1_2_1"
    // InternalVampireLanguage.g:5276:1: rule__VLSFunctionFof__TermsAssignment_1_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSFunctionFof__TermsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5280:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5281:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5281:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5282:3: ruleVLSFofTerm
            {
             before(grammarAccess.getVLSFunctionFofAccess().getTermsVLSFofTermParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSFofTerm();

            state._fsp--;

             after(grammarAccess.getVLSFunctionFofAccess().getTermsVLSFofTermParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionFof__TermsAssignment_1_2_1"


    // $ANTLR start "rule__VLSDefinedTerm__ValueAssignment_0_1"
    // InternalVampireLanguage.g:5291:1: rule__VLSDefinedTerm__ValueAssignment_0_1 : ( RULE_SIGNED_LITERAL ) ;
    public final void rule__VLSDefinedTerm__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5295:1: ( ( RULE_SIGNED_LITERAL ) )
            // InternalVampireLanguage.g:5296:2: ( RULE_SIGNED_LITERAL )
            {
            // InternalVampireLanguage.g:5296:2: ( RULE_SIGNED_LITERAL )
            // InternalVampireLanguage.g:5297:3: RULE_SIGNED_LITERAL
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueSIGNED_LITERALTerminalRuleCall_0_1_0()); 
            match(input,RULE_SIGNED_LITERAL,FOLLOW_2); 
             after(grammarAccess.getVLSDefinedTermAccess().getValueSIGNED_LITERALTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__ValueAssignment_0_1"


    // $ANTLR start "rule__VLSDefinedTerm__ValueAssignment_1_1"
    // InternalVampireLanguage.g:5306:1: rule__VLSDefinedTerm__ValueAssignment_1_1 : ( RULE_SIGNED_REAL_ID ) ;
    public final void rule__VLSDefinedTerm__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5310:1: ( ( RULE_SIGNED_REAL_ID ) )
            // InternalVampireLanguage.g:5311:2: ( RULE_SIGNED_REAL_ID )
            {
            // InternalVampireLanguage.g:5311:2: ( RULE_SIGNED_REAL_ID )
            // InternalVampireLanguage.g:5312:3: RULE_SIGNED_REAL_ID
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueSIGNED_REAL_IDTerminalRuleCall_1_1_0()); 
            match(input,RULE_SIGNED_REAL_ID,FOLLOW_2); 
             after(grammarAccess.getVLSDefinedTermAccess().getValueSIGNED_REAL_IDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__ValueAssignment_1_1"


    // $ANTLR start "rule__VLSDefinedTerm__ValueAssignment_2_1"
    // InternalVampireLanguage.g:5321:1: rule__VLSDefinedTerm__ValueAssignment_2_1 : ( RULE_SIGNED_RAT_ID ) ;
    public final void rule__VLSDefinedTerm__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5325:1: ( ( RULE_SIGNED_RAT_ID ) )
            // InternalVampireLanguage.g:5326:2: ( RULE_SIGNED_RAT_ID )
            {
            // InternalVampireLanguage.g:5326:2: ( RULE_SIGNED_RAT_ID )
            // InternalVampireLanguage.g:5327:3: RULE_SIGNED_RAT_ID
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueSIGNED_RAT_IDTerminalRuleCall_2_1_0()); 
            match(input,RULE_SIGNED_RAT_ID,FOLLOW_2); 
             after(grammarAccess.getVLSDefinedTermAccess().getValueSIGNED_RAT_IDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__ValueAssignment_2_1"


    // $ANTLR start "rule__VLSDefinedTerm__ValueAssignment_3_1"
    // InternalVampireLanguage.g:5336:1: rule__VLSDefinedTerm__ValueAssignment_3_1 : ( RULE_DOUBLE_QUOTE ) ;
    public final void rule__VLSDefinedTerm__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5340:1: ( ( RULE_DOUBLE_QUOTE ) )
            // InternalVampireLanguage.g:5341:2: ( RULE_DOUBLE_QUOTE )
            {
            // InternalVampireLanguage.g:5341:2: ( RULE_DOUBLE_QUOTE )
            // InternalVampireLanguage.g:5342:3: RULE_DOUBLE_QUOTE
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueDOUBLE_QUOTETerminalRuleCall_3_1_0()); 
            match(input,RULE_DOUBLE_QUOTE,FOLLOW_2); 
             after(grammarAccess.getVLSDefinedTermAccess().getValueDOUBLE_QUOTETerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__ValueAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000040000000202L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000003FFF8000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x1A000800000005D0L,0x0000000000000007L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00018BFFF8000050L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x01FE000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x007E000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000000005D0L,0x0000000000000007L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000000001D0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000000001D0L,0x0000000000000003L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000003DF0L,0x0000000000000007L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000000000001D0L,0x0000000000000004L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000001000L});

}