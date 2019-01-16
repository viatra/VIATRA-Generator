package ca.mcgill.ecse.dslreasoner.ide.contentassist.antlr.internal;

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
import ca.mcgill.ecse.dslreasoner.services.VampireLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVampireLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LOWER_WORD_ID", "RULE_SINGLE_QUOTE", "RULE_LITERAL", "RULE_SIGNED_LITERAL", "RULE_DOLLAR_ID", "RULE_DOUBLE_DOLLAR_ID", "RULE_SINGLE_COMMENT", "RULE_UPPER_WORD_ID", "RULE_SIGNED_REAL_ID", "RULE_SIGNED_RAT_ID", "RULE_DOUBLE_QUOTE", "RULE_ALPHA_NUMERIC", "RULE_SIGN", "RULE_INT", "RULE_UNSIGNED_REAL_FRAC_ID", "RULE_UNSIGNED_REAL_EXP_ID", "RULE_UNSIGNED_RAT_ID", "RULE_ID", "RULE_ANY_OTHER", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'axiom'", "'conjecture'", "'hypothesis'", "'definition'", "'assumption'", "'lemma'", "'theorem'", "'corollary'", "'negated_conjecture'", "'plain'", "'type'", "'fi_domain'", "'fi_functors'", "'fi_predicates'", "'unknown'", "'include('", "',['", "']'", "','", "'%'", "'fof'", "'('", "')'", "'.'", "'['", "'<=>'", "'=>'", "'<='", "'<~>'", "'~|'", "'~&'", "'&'", "'|'", "'!'", "':'", "'?'", "'~'", "'!='", "'='", "':='", "'$true'", "'$false'", "'$less'"
    };
    public static final int RULE_UNSIGNED_RAT_ID=20;
    public static final int T__50=50;
    public static final int RULE_SIGN=16;
    public static final int T__59=59;
    public static final int RULE_SIGNED_LITERAL=7;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_DOUBLE_QUOTE=14;
    public static final int T__52=52;
    public static final int RULE_LITERAL=6;
    public static final int T__53=53;
    public static final int RULE_UNSIGNED_REAL_FRAC_ID=18;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=21;
    public static final int RULE_SINGLE_QUOTE=5;
    public static final int RULE_SINGLE_COMMENT=10;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=17;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=24;
    public static final int T__67=67;
    public static final int RULE_SIGNED_RAT_ID=13;
    public static final int T__68=68;
    public static final int T__69=69;
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
    public static final int RULE_UPPER_WORD_ID=11;
    public static final int RULE_WS=26;
    public static final int RULE_DOLLAR_ID=8;
    public static final int RULE_ALPHA_NUMERIC=15;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_DOUBLE_DOLLAR_ID=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SIGNED_REAL_ID=12;
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

                if ( (LA1_0==42||(LA1_0>=46 && LA1_0<=47)) ) {
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


    // $ANTLR start "entryRuleVLSInclude"
    // InternalVampireLanguage.g:78:1: entryRuleVLSInclude : ruleVLSInclude EOF ;
    public final void entryRuleVLSInclude() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:79:1: ( ruleVLSInclude EOF )
            // InternalVampireLanguage.g:80:1: ruleVLSInclude EOF
            {
             before(grammarAccess.getVLSIncludeRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSInclude();

            state._fsp--;

             after(grammarAccess.getVLSIncludeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSInclude"


    // $ANTLR start "ruleVLSInclude"
    // InternalVampireLanguage.g:87:1: ruleVLSInclude : ( ( rule__VLSInclude__Group__0 ) ) ;
    public final void ruleVLSInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:91:2: ( ( ( rule__VLSInclude__Group__0 ) ) )
            // InternalVampireLanguage.g:92:2: ( ( rule__VLSInclude__Group__0 ) )
            {
            // InternalVampireLanguage.g:92:2: ( ( rule__VLSInclude__Group__0 ) )
            // InternalVampireLanguage.g:93:3: ( rule__VLSInclude__Group__0 )
            {
             before(grammarAccess.getVLSIncludeAccess().getGroup()); 
            // InternalVampireLanguage.g:94:3: ( rule__VLSInclude__Group__0 )
            // InternalVampireLanguage.g:94:4: rule__VLSInclude__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSInclude__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSIncludeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSInclude"


    // $ANTLR start "entryRuleVLSName"
    // InternalVampireLanguage.g:103:1: entryRuleVLSName : ruleVLSName EOF ;
    public final void entryRuleVLSName() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:104:1: ( ruleVLSName EOF )
            // InternalVampireLanguage.g:105:1: ruleVLSName EOF
            {
             before(grammarAccess.getVLSNameRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSName();

            state._fsp--;

             after(grammarAccess.getVLSNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSName"


    // $ANTLR start "ruleVLSName"
    // InternalVampireLanguage.g:112:1: ruleVLSName : ( ( rule__VLSName__NameAssignment ) ) ;
    public final void ruleVLSName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:116:2: ( ( ( rule__VLSName__NameAssignment ) ) )
            // InternalVampireLanguage.g:117:2: ( ( rule__VLSName__NameAssignment ) )
            {
            // InternalVampireLanguage.g:117:2: ( ( rule__VLSName__NameAssignment ) )
            // InternalVampireLanguage.g:118:3: ( rule__VLSName__NameAssignment )
            {
             before(grammarAccess.getVLSNameAccess().getNameAssignment()); 
            // InternalVampireLanguage.g:119:3: ( rule__VLSName__NameAssignment )
            // InternalVampireLanguage.g:119:4: rule__VLSName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VLSName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVLSNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSName"


    // $ANTLR start "entryRuleVLSComment"
    // InternalVampireLanguage.g:128:1: entryRuleVLSComment : ruleVLSComment EOF ;
    public final void entryRuleVLSComment() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:129:1: ( ruleVLSComment EOF )
            // InternalVampireLanguage.g:130:1: ruleVLSComment EOF
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
    // InternalVampireLanguage.g:137:1: ruleVLSComment : ( ( rule__VLSComment__Group__0 ) ) ;
    public final void ruleVLSComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:141:2: ( ( ( rule__VLSComment__Group__0 ) ) )
            // InternalVampireLanguage.g:142:2: ( ( rule__VLSComment__Group__0 ) )
            {
            // InternalVampireLanguage.g:142:2: ( ( rule__VLSComment__Group__0 ) )
            // InternalVampireLanguage.g:143:3: ( rule__VLSComment__Group__0 )
            {
             before(grammarAccess.getVLSCommentAccess().getGroup()); 
            // InternalVampireLanguage.g:144:3: ( rule__VLSComment__Group__0 )
            // InternalVampireLanguage.g:144:4: rule__VLSComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSCommentAccess().getGroup()); 

            }


            }

        }
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
    // InternalVampireLanguage.g:153:1: entryRuleVLSFofFormula : ruleVLSFofFormula EOF ;
    public final void entryRuleVLSFofFormula() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:154:1: ( ruleVLSFofFormula EOF )
            // InternalVampireLanguage.g:155:1: ruleVLSFofFormula EOF
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
    // InternalVampireLanguage.g:162:1: ruleVLSFofFormula : ( ( rule__VLSFofFormula__Group__0 ) ) ;
    public final void ruleVLSFofFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:166:2: ( ( ( rule__VLSFofFormula__Group__0 ) ) )
            // InternalVampireLanguage.g:167:2: ( ( rule__VLSFofFormula__Group__0 ) )
            {
            // InternalVampireLanguage.g:167:2: ( ( rule__VLSFofFormula__Group__0 ) )
            // InternalVampireLanguage.g:168:3: ( rule__VLSFofFormula__Group__0 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getGroup()); 
            // InternalVampireLanguage.g:169:3: ( rule__VLSFofFormula__Group__0 )
            // InternalVampireLanguage.g:169:4: rule__VLSFofFormula__Group__0
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
    // InternalVampireLanguage.g:178:1: entryRuleVLSRole : ruleVLSRole EOF ;
    public final void entryRuleVLSRole() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:179:1: ( ruleVLSRole EOF )
            // InternalVampireLanguage.g:180:1: ruleVLSRole EOF
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
    // InternalVampireLanguage.g:187:1: ruleVLSRole : ( ( rule__VLSRole__Alternatives ) ) ;
    public final void ruleVLSRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:191:2: ( ( ( rule__VLSRole__Alternatives ) ) )
            // InternalVampireLanguage.g:192:2: ( ( rule__VLSRole__Alternatives ) )
            {
            // InternalVampireLanguage.g:192:2: ( ( rule__VLSRole__Alternatives ) )
            // InternalVampireLanguage.g:193:3: ( rule__VLSRole__Alternatives )
            {
             before(grammarAccess.getVLSRoleAccess().getAlternatives()); 
            // InternalVampireLanguage.g:194:3: ( rule__VLSRole__Alternatives )
            // InternalVampireLanguage.g:194:4: rule__VLSRole__Alternatives
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
    // InternalVampireLanguage.g:203:1: entryRuleVLSAxiom : ruleVLSAxiom EOF ;
    public final void entryRuleVLSAxiom() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:204:1: ( ruleVLSAxiom EOF )
            // InternalVampireLanguage.g:205:1: ruleVLSAxiom EOF
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
    // InternalVampireLanguage.g:212:1: ruleVLSAxiom : ( 'axiom' ) ;
    public final void ruleVLSAxiom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:216:2: ( ( 'axiom' ) )
            // InternalVampireLanguage.g:217:2: ( 'axiom' )
            {
            // InternalVampireLanguage.g:217:2: ( 'axiom' )
            // InternalVampireLanguage.g:218:3: 'axiom'
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
    // InternalVampireLanguage.g:228:1: entryRuleVLSConjecture : ruleVLSConjecture EOF ;
    public final void entryRuleVLSConjecture() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:229:1: ( ruleVLSConjecture EOF )
            // InternalVampireLanguage.g:230:1: ruleVLSConjecture EOF
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
    // InternalVampireLanguage.g:237:1: ruleVLSConjecture : ( 'conjecture' ) ;
    public final void ruleVLSConjecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:241:2: ( ( 'conjecture' ) )
            // InternalVampireLanguage.g:242:2: ( 'conjecture' )
            {
            // InternalVampireLanguage.g:242:2: ( 'conjecture' )
            // InternalVampireLanguage.g:243:3: 'conjecture'
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
    // InternalVampireLanguage.g:253:1: entryRuleVLSHypothesis : ruleVLSHypothesis EOF ;
    public final void entryRuleVLSHypothesis() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:254:1: ( ruleVLSHypothesis EOF )
            // InternalVampireLanguage.g:255:1: ruleVLSHypothesis EOF
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
    // InternalVampireLanguage.g:262:1: ruleVLSHypothesis : ( 'hypothesis' ) ;
    public final void ruleVLSHypothesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:266:2: ( ( 'hypothesis' ) )
            // InternalVampireLanguage.g:267:2: ( 'hypothesis' )
            {
            // InternalVampireLanguage.g:267:2: ( 'hypothesis' )
            // InternalVampireLanguage.g:268:3: 'hypothesis'
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
    // InternalVampireLanguage.g:278:1: entryRuleVLSDefinition : ruleVLSDefinition EOF ;
    public final void entryRuleVLSDefinition() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:279:1: ( ruleVLSDefinition EOF )
            // InternalVampireLanguage.g:280:1: ruleVLSDefinition EOF
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
    // InternalVampireLanguage.g:287:1: ruleVLSDefinition : ( 'definition' ) ;
    public final void ruleVLSDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:291:2: ( ( 'definition' ) )
            // InternalVampireLanguage.g:292:2: ( 'definition' )
            {
            // InternalVampireLanguage.g:292:2: ( 'definition' )
            // InternalVampireLanguage.g:293:3: 'definition'
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
    // InternalVampireLanguage.g:303:1: entryRuleVLSAssumption : ruleVLSAssumption EOF ;
    public final void entryRuleVLSAssumption() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:304:1: ( ruleVLSAssumption EOF )
            // InternalVampireLanguage.g:305:1: ruleVLSAssumption EOF
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
    // InternalVampireLanguage.g:312:1: ruleVLSAssumption : ( 'assumption' ) ;
    public final void ruleVLSAssumption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:316:2: ( ( 'assumption' ) )
            // InternalVampireLanguage.g:317:2: ( 'assumption' )
            {
            // InternalVampireLanguage.g:317:2: ( 'assumption' )
            // InternalVampireLanguage.g:318:3: 'assumption'
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
    // InternalVampireLanguage.g:328:1: entryRuleVLSLemma : ruleVLSLemma EOF ;
    public final void entryRuleVLSLemma() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:329:1: ( ruleVLSLemma EOF )
            // InternalVampireLanguage.g:330:1: ruleVLSLemma EOF
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
    // InternalVampireLanguage.g:337:1: ruleVLSLemma : ( 'lemma' ) ;
    public final void ruleVLSLemma() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:341:2: ( ( 'lemma' ) )
            // InternalVampireLanguage.g:342:2: ( 'lemma' )
            {
            // InternalVampireLanguage.g:342:2: ( 'lemma' )
            // InternalVampireLanguage.g:343:3: 'lemma'
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
    // InternalVampireLanguage.g:353:1: entryRuleVLSTheorem : ruleVLSTheorem EOF ;
    public final void entryRuleVLSTheorem() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:354:1: ( ruleVLSTheorem EOF )
            // InternalVampireLanguage.g:355:1: ruleVLSTheorem EOF
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
    // InternalVampireLanguage.g:362:1: ruleVLSTheorem : ( 'theorem' ) ;
    public final void ruleVLSTheorem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:366:2: ( ( 'theorem' ) )
            // InternalVampireLanguage.g:367:2: ( 'theorem' )
            {
            // InternalVampireLanguage.g:367:2: ( 'theorem' )
            // InternalVampireLanguage.g:368:3: 'theorem'
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
    // InternalVampireLanguage.g:378:1: entryRuleVLSCorollary : ruleVLSCorollary EOF ;
    public final void entryRuleVLSCorollary() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:379:1: ( ruleVLSCorollary EOF )
            // InternalVampireLanguage.g:380:1: ruleVLSCorollary EOF
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
    // InternalVampireLanguage.g:387:1: ruleVLSCorollary : ( 'corollary' ) ;
    public final void ruleVLSCorollary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:391:2: ( ( 'corollary' ) )
            // InternalVampireLanguage.g:392:2: ( 'corollary' )
            {
            // InternalVampireLanguage.g:392:2: ( 'corollary' )
            // InternalVampireLanguage.g:393:3: 'corollary'
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
    // InternalVampireLanguage.g:403:1: entryRuleVLSNegated_Conjecture : ruleVLSNegated_Conjecture EOF ;
    public final void entryRuleVLSNegated_Conjecture() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:404:1: ( ruleVLSNegated_Conjecture EOF )
            // InternalVampireLanguage.g:405:1: ruleVLSNegated_Conjecture EOF
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
    // InternalVampireLanguage.g:412:1: ruleVLSNegated_Conjecture : ( 'negated_conjecture' ) ;
    public final void ruleVLSNegated_Conjecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:416:2: ( ( 'negated_conjecture' ) )
            // InternalVampireLanguage.g:417:2: ( 'negated_conjecture' )
            {
            // InternalVampireLanguage.g:417:2: ( 'negated_conjecture' )
            // InternalVampireLanguage.g:418:3: 'negated_conjecture'
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
    // InternalVampireLanguage.g:428:1: entryRuleVLSPlain : ruleVLSPlain EOF ;
    public final void entryRuleVLSPlain() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:429:1: ( ruleVLSPlain EOF )
            // InternalVampireLanguage.g:430:1: ruleVLSPlain EOF
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
    // InternalVampireLanguage.g:437:1: ruleVLSPlain : ( 'plain' ) ;
    public final void ruleVLSPlain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:441:2: ( ( 'plain' ) )
            // InternalVampireLanguage.g:442:2: ( 'plain' )
            {
            // InternalVampireLanguage.g:442:2: ( 'plain' )
            // InternalVampireLanguage.g:443:3: 'plain'
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
    // InternalVampireLanguage.g:453:1: entryRuleVLSType : ruleVLSType EOF ;
    public final void entryRuleVLSType() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:454:1: ( ruleVLSType EOF )
            // InternalVampireLanguage.g:455:1: ruleVLSType EOF
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
    // InternalVampireLanguage.g:462:1: ruleVLSType : ( 'type' ) ;
    public final void ruleVLSType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:466:2: ( ( 'type' ) )
            // InternalVampireLanguage.g:467:2: ( 'type' )
            {
            // InternalVampireLanguage.g:467:2: ( 'type' )
            // InternalVampireLanguage.g:468:3: 'type'
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
    // InternalVampireLanguage.g:478:1: entryRuleVLSFi_Domain : ruleVLSFi_Domain EOF ;
    public final void entryRuleVLSFi_Domain() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:479:1: ( ruleVLSFi_Domain EOF )
            // InternalVampireLanguage.g:480:1: ruleVLSFi_Domain EOF
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
    // InternalVampireLanguage.g:487:1: ruleVLSFi_Domain : ( 'fi_domain' ) ;
    public final void ruleVLSFi_Domain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:491:2: ( ( 'fi_domain' ) )
            // InternalVampireLanguage.g:492:2: ( 'fi_domain' )
            {
            // InternalVampireLanguage.g:492:2: ( 'fi_domain' )
            // InternalVampireLanguage.g:493:3: 'fi_domain'
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
    // InternalVampireLanguage.g:503:1: entryRuleVLSFi_Functors : ruleVLSFi_Functors EOF ;
    public final void entryRuleVLSFi_Functors() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:504:1: ( ruleVLSFi_Functors EOF )
            // InternalVampireLanguage.g:505:1: ruleVLSFi_Functors EOF
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
    // InternalVampireLanguage.g:512:1: ruleVLSFi_Functors : ( 'fi_functors' ) ;
    public final void ruleVLSFi_Functors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:516:2: ( ( 'fi_functors' ) )
            // InternalVampireLanguage.g:517:2: ( 'fi_functors' )
            {
            // InternalVampireLanguage.g:517:2: ( 'fi_functors' )
            // InternalVampireLanguage.g:518:3: 'fi_functors'
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
    // InternalVampireLanguage.g:528:1: entryRuleVLSFi_Predicates : ruleVLSFi_Predicates EOF ;
    public final void entryRuleVLSFi_Predicates() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:529:1: ( ruleVLSFi_Predicates EOF )
            // InternalVampireLanguage.g:530:1: ruleVLSFi_Predicates EOF
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
    // InternalVampireLanguage.g:537:1: ruleVLSFi_Predicates : ( 'fi_predicates' ) ;
    public final void ruleVLSFi_Predicates() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:541:2: ( ( 'fi_predicates' ) )
            // InternalVampireLanguage.g:542:2: ( 'fi_predicates' )
            {
            // InternalVampireLanguage.g:542:2: ( 'fi_predicates' )
            // InternalVampireLanguage.g:543:3: 'fi_predicates'
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
    // InternalVampireLanguage.g:553:1: entryRuleVLSUnknown : ruleVLSUnknown EOF ;
    public final void entryRuleVLSUnknown() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:554:1: ( ruleVLSUnknown EOF )
            // InternalVampireLanguage.g:555:1: ruleVLSUnknown EOF
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
    // InternalVampireLanguage.g:562:1: ruleVLSUnknown : ( 'unknown' ) ;
    public final void ruleVLSUnknown() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:566:2: ( ( 'unknown' ) )
            // InternalVampireLanguage.g:567:2: ( 'unknown' )
            {
            // InternalVampireLanguage.g:567:2: ( 'unknown' )
            // InternalVampireLanguage.g:568:3: 'unknown'
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
    // InternalVampireLanguage.g:578:1: entryRuleVLSAnnotation : ruleVLSAnnotation EOF ;
    public final void entryRuleVLSAnnotation() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:579:1: ( ruleVLSAnnotation EOF )
            // InternalVampireLanguage.g:580:1: ruleVLSAnnotation EOF
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
    // InternalVampireLanguage.g:587:1: ruleVLSAnnotation : ( ( rule__VLSAnnotation__Group__0 ) ) ;
    public final void ruleVLSAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:591:2: ( ( ( rule__VLSAnnotation__Group__0 ) ) )
            // InternalVampireLanguage.g:592:2: ( ( rule__VLSAnnotation__Group__0 ) )
            {
            // InternalVampireLanguage.g:592:2: ( ( rule__VLSAnnotation__Group__0 ) )
            // InternalVampireLanguage.g:593:3: ( rule__VLSAnnotation__Group__0 )
            {
             before(grammarAccess.getVLSAnnotationAccess().getGroup()); 
            // InternalVampireLanguage.g:594:3: ( rule__VLSAnnotation__Group__0 )
            // InternalVampireLanguage.g:594:4: rule__VLSAnnotation__Group__0
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
    // InternalVampireLanguage.g:603:1: entryRuleVLSAnnotationTerms : ruleVLSAnnotationTerms EOF ;
    public final void entryRuleVLSAnnotationTerms() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:604:1: ( ruleVLSAnnotationTerms EOF )
            // InternalVampireLanguage.g:605:1: ruleVLSAnnotationTerms EOF
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
    // InternalVampireLanguage.g:612:1: ruleVLSAnnotationTerms : ( ( rule__VLSAnnotationTerms__Group__0 ) ) ;
    public final void ruleVLSAnnotationTerms() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:616:2: ( ( ( rule__VLSAnnotationTerms__Group__0 ) ) )
            // InternalVampireLanguage.g:617:2: ( ( rule__VLSAnnotationTerms__Group__0 ) )
            {
            // InternalVampireLanguage.g:617:2: ( ( rule__VLSAnnotationTerms__Group__0 ) )
            // InternalVampireLanguage.g:618:3: ( rule__VLSAnnotationTerms__Group__0 )
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getGroup()); 
            // InternalVampireLanguage.g:619:3: ( rule__VLSAnnotationTerms__Group__0 )
            // InternalVampireLanguage.g:619:4: rule__VLSAnnotationTerms__Group__0
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
    // InternalVampireLanguage.g:628:1: entryRuleVLSTerm : ruleVLSTerm EOF ;
    public final void entryRuleVLSTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:629:1: ( ruleVLSTerm EOF )
            // InternalVampireLanguage.g:630:1: ruleVLSTerm EOF
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
    // InternalVampireLanguage.g:637:1: ruleVLSTerm : ( ruleVLSBinary ) ;
    public final void ruleVLSTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:641:2: ( ( ruleVLSBinary ) )
            // InternalVampireLanguage.g:642:2: ( ruleVLSBinary )
            {
            // InternalVampireLanguage.g:642:2: ( ruleVLSBinary )
            // InternalVampireLanguage.g:643:3: ruleVLSBinary
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
    // InternalVampireLanguage.g:653:1: entryRuleVLSBinary : ruleVLSBinary EOF ;
    public final void entryRuleVLSBinary() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:654:1: ( ruleVLSBinary EOF )
            // InternalVampireLanguage.g:655:1: ruleVLSBinary EOF
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
    // InternalVampireLanguage.g:662:1: ruleVLSBinary : ( ( rule__VLSBinary__Group__0 ) ) ;
    public final void ruleVLSBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:666:2: ( ( ( rule__VLSBinary__Group__0 ) ) )
            // InternalVampireLanguage.g:667:2: ( ( rule__VLSBinary__Group__0 ) )
            {
            // InternalVampireLanguage.g:667:2: ( ( rule__VLSBinary__Group__0 ) )
            // InternalVampireLanguage.g:668:3: ( rule__VLSBinary__Group__0 )
            {
             before(grammarAccess.getVLSBinaryAccess().getGroup()); 
            // InternalVampireLanguage.g:669:3: ( rule__VLSBinary__Group__0 )
            // InternalVampireLanguage.g:669:4: rule__VLSBinary__Group__0
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
    // InternalVampireLanguage.g:678:1: entryRuleVLSUnitaryFormula : ruleVLSUnitaryFormula EOF ;
    public final void entryRuleVLSUnitaryFormula() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:679:1: ( ruleVLSUnitaryFormula EOF )
            // InternalVampireLanguage.g:680:1: ruleVLSUnitaryFormula EOF
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
    // InternalVampireLanguage.g:687:1: ruleVLSUnitaryFormula : ( ( rule__VLSUnitaryFormula__Alternatives ) ) ;
    public final void ruleVLSUnitaryFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:691:2: ( ( ( rule__VLSUnitaryFormula__Alternatives ) ) )
            // InternalVampireLanguage.g:692:2: ( ( rule__VLSUnitaryFormula__Alternatives ) )
            {
            // InternalVampireLanguage.g:692:2: ( ( rule__VLSUnitaryFormula__Alternatives ) )
            // InternalVampireLanguage.g:693:3: ( rule__VLSUnitaryFormula__Alternatives )
            {
             before(grammarAccess.getVLSUnitaryFormulaAccess().getAlternatives()); 
            // InternalVampireLanguage.g:694:3: ( rule__VLSUnitaryFormula__Alternatives )
            // InternalVampireLanguage.g:694:4: rule__VLSUnitaryFormula__Alternatives
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
    // InternalVampireLanguage.g:703:1: entryRuleVLSUniversalQuantifier : ruleVLSUniversalQuantifier EOF ;
    public final void entryRuleVLSUniversalQuantifier() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:704:1: ( ruleVLSUniversalQuantifier EOF )
            // InternalVampireLanguage.g:705:1: ruleVLSUniversalQuantifier EOF
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
    // InternalVampireLanguage.g:712:1: ruleVLSUniversalQuantifier : ( ( rule__VLSUniversalQuantifier__Group__0 ) ) ;
    public final void ruleVLSUniversalQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:716:2: ( ( ( rule__VLSUniversalQuantifier__Group__0 ) ) )
            // InternalVampireLanguage.g:717:2: ( ( rule__VLSUniversalQuantifier__Group__0 ) )
            {
            // InternalVampireLanguage.g:717:2: ( ( rule__VLSUniversalQuantifier__Group__0 ) )
            // InternalVampireLanguage.g:718:3: ( rule__VLSUniversalQuantifier__Group__0 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup()); 
            // InternalVampireLanguage.g:719:3: ( rule__VLSUniversalQuantifier__Group__0 )
            // InternalVampireLanguage.g:719:4: rule__VLSUniversalQuantifier__Group__0
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
    // InternalVampireLanguage.g:728:1: entryRuleVLSExistentialQuantifier : ruleVLSExistentialQuantifier EOF ;
    public final void entryRuleVLSExistentialQuantifier() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:729:1: ( ruleVLSExistentialQuantifier EOF )
            // InternalVampireLanguage.g:730:1: ruleVLSExistentialQuantifier EOF
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
    // InternalVampireLanguage.g:737:1: ruleVLSExistentialQuantifier : ( ( rule__VLSExistentialQuantifier__Group__0 ) ) ;
    public final void ruleVLSExistentialQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:741:2: ( ( ( rule__VLSExistentialQuantifier__Group__0 ) ) )
            // InternalVampireLanguage.g:742:2: ( ( rule__VLSExistentialQuantifier__Group__0 ) )
            {
            // InternalVampireLanguage.g:742:2: ( ( rule__VLSExistentialQuantifier__Group__0 ) )
            // InternalVampireLanguage.g:743:3: ( rule__VLSExistentialQuantifier__Group__0 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup()); 
            // InternalVampireLanguage.g:744:3: ( rule__VLSExistentialQuantifier__Group__0 )
            // InternalVampireLanguage.g:744:4: rule__VLSExistentialQuantifier__Group__0
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
    // InternalVampireLanguage.g:753:1: entryRuleVLSUnaryNegation : ruleVLSUnaryNegation EOF ;
    public final void entryRuleVLSUnaryNegation() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:754:1: ( ruleVLSUnaryNegation EOF )
            // InternalVampireLanguage.g:755:1: ruleVLSUnaryNegation EOF
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
    // InternalVampireLanguage.g:762:1: ruleVLSUnaryNegation : ( ( rule__VLSUnaryNegation__Group__0 ) ) ;
    public final void ruleVLSUnaryNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:766:2: ( ( ( rule__VLSUnaryNegation__Group__0 ) ) )
            // InternalVampireLanguage.g:767:2: ( ( rule__VLSUnaryNegation__Group__0 ) )
            {
            // InternalVampireLanguage.g:767:2: ( ( rule__VLSUnaryNegation__Group__0 ) )
            // InternalVampireLanguage.g:768:3: ( rule__VLSUnaryNegation__Group__0 )
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getGroup()); 
            // InternalVampireLanguage.g:769:3: ( rule__VLSUnaryNegation__Group__0 )
            // InternalVampireLanguage.g:769:4: rule__VLSUnaryNegation__Group__0
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
    // InternalVampireLanguage.g:778:1: entryRuleVLSUnaryInfix : ruleVLSUnaryInfix EOF ;
    public final void entryRuleVLSUnaryInfix() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:779:1: ( ruleVLSUnaryInfix EOF )
            // InternalVampireLanguage.g:780:1: ruleVLSUnaryInfix EOF
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
    // InternalVampireLanguage.g:787:1: ruleVLSUnaryInfix : ( ( rule__VLSUnaryInfix__Group__0 ) ) ;
    public final void ruleVLSUnaryInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:791:2: ( ( ( rule__VLSUnaryInfix__Group__0 ) ) )
            // InternalVampireLanguage.g:792:2: ( ( rule__VLSUnaryInfix__Group__0 ) )
            {
            // InternalVampireLanguage.g:792:2: ( ( rule__VLSUnaryInfix__Group__0 ) )
            // InternalVampireLanguage.g:793:3: ( rule__VLSUnaryInfix__Group__0 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getGroup()); 
            // InternalVampireLanguage.g:794:3: ( rule__VLSUnaryInfix__Group__0 )
            // InternalVampireLanguage.g:794:4: rule__VLSUnaryInfix__Group__0
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
    // InternalVampireLanguage.g:803:1: entryRuleVLSAtomic : ruleVLSAtomic EOF ;
    public final void entryRuleVLSAtomic() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:804:1: ( ruleVLSAtomic EOF )
            // InternalVampireLanguage.g:805:1: ruleVLSAtomic EOF
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
    // InternalVampireLanguage.g:812:1: ruleVLSAtomic : ( ( rule__VLSAtomic__Alternatives ) ) ;
    public final void ruleVLSAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:816:2: ( ( ( rule__VLSAtomic__Alternatives ) ) )
            // InternalVampireLanguage.g:817:2: ( ( rule__VLSAtomic__Alternatives ) )
            {
            // InternalVampireLanguage.g:817:2: ( ( rule__VLSAtomic__Alternatives ) )
            // InternalVampireLanguage.g:818:3: ( rule__VLSAtomic__Alternatives )
            {
             before(grammarAccess.getVLSAtomicAccess().getAlternatives()); 
            // InternalVampireLanguage.g:819:3: ( rule__VLSAtomic__Alternatives )
            // InternalVampireLanguage.g:819:4: rule__VLSAtomic__Alternatives
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
    // InternalVampireLanguage.g:828:1: entryRuleVLSAtomicConstant : ruleVLSAtomicConstant EOF ;
    public final void entryRuleVLSAtomicConstant() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:829:1: ( ruleVLSAtomicConstant EOF )
            // InternalVampireLanguage.g:830:1: ruleVLSAtomicConstant EOF
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
    // InternalVampireLanguage.g:837:1: ruleVLSAtomicConstant : ( ( rule__VLSAtomicConstant__Alternatives ) ) ;
    public final void ruleVLSAtomicConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:841:2: ( ( ( rule__VLSAtomicConstant__Alternatives ) ) )
            // InternalVampireLanguage.g:842:2: ( ( rule__VLSAtomicConstant__Alternatives ) )
            {
            // InternalVampireLanguage.g:842:2: ( ( rule__VLSAtomicConstant__Alternatives ) )
            // InternalVampireLanguage.g:843:3: ( rule__VLSAtomicConstant__Alternatives )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getAlternatives()); 
            // InternalVampireLanguage.g:844:3: ( rule__VLSAtomicConstant__Alternatives )
            // InternalVampireLanguage.g:844:4: rule__VLSAtomicConstant__Alternatives
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
    // InternalVampireLanguage.g:853:1: entryRuleVLSAtomicFunction : ruleVLSAtomicFunction EOF ;
    public final void entryRuleVLSAtomicFunction() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:854:1: ( ruleVLSAtomicFunction EOF )
            // InternalVampireLanguage.g:855:1: ruleVLSAtomicFunction EOF
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
    // InternalVampireLanguage.g:862:1: ruleVLSAtomicFunction : ( ( rule__VLSAtomicFunction__Alternatives ) ) ;
    public final void ruleVLSAtomicFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:866:2: ( ( ( rule__VLSAtomicFunction__Alternatives ) ) )
            // InternalVampireLanguage.g:867:2: ( ( rule__VLSAtomicFunction__Alternatives ) )
            {
            // InternalVampireLanguage.g:867:2: ( ( rule__VLSAtomicFunction__Alternatives ) )
            // InternalVampireLanguage.g:868:3: ( rule__VLSAtomicFunction__Alternatives )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getAlternatives()); 
            // InternalVampireLanguage.g:869:3: ( rule__VLSAtomicFunction__Alternatives )
            // InternalVampireLanguage.g:869:4: rule__VLSAtomicFunction__Alternatives
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


    // $ANTLR start "entryRuleVLSVariable"
    // InternalVampireLanguage.g:878:1: entryRuleVLSVariable : ruleVLSVariable EOF ;
    public final void entryRuleVLSVariable() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:879:1: ( ruleVLSVariable EOF )
            // InternalVampireLanguage.g:880:1: ruleVLSVariable EOF
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
    // InternalVampireLanguage.g:887:1: ruleVLSVariable : ( ( rule__VLSVariable__NameAssignment ) ) ;
    public final void ruleVLSVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:891:2: ( ( ( rule__VLSVariable__NameAssignment ) ) )
            // InternalVampireLanguage.g:892:2: ( ( rule__VLSVariable__NameAssignment ) )
            {
            // InternalVampireLanguage.g:892:2: ( ( rule__VLSVariable__NameAssignment ) )
            // InternalVampireLanguage.g:893:3: ( rule__VLSVariable__NameAssignment )
            {
             before(grammarAccess.getVLSVariableAccess().getNameAssignment()); 
            // InternalVampireLanguage.g:894:3: ( rule__VLSVariable__NameAssignment )
            // InternalVampireLanguage.g:894:4: rule__VLSVariable__NameAssignment
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


    // $ANTLR start "entryRuleVLSFofTerm"
    // InternalVampireLanguage.g:903:1: entryRuleVLSFofTerm : ruleVLSFofTerm EOF ;
    public final void entryRuleVLSFofTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:904:1: ( ruleVLSFofTerm EOF )
            // InternalVampireLanguage.g:905:1: ruleVLSFofTerm EOF
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
    // InternalVampireLanguage.g:912:1: ruleVLSFofTerm : ( ( rule__VLSFofTerm__Alternatives ) ) ;
    public final void ruleVLSFofTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:916:2: ( ( ( rule__VLSFofTerm__Alternatives ) ) )
            // InternalVampireLanguage.g:917:2: ( ( rule__VLSFofTerm__Alternatives ) )
            {
            // InternalVampireLanguage.g:917:2: ( ( rule__VLSFofTerm__Alternatives ) )
            // InternalVampireLanguage.g:918:3: ( rule__VLSFofTerm__Alternatives )
            {
             before(grammarAccess.getVLSFofTermAccess().getAlternatives()); 
            // InternalVampireLanguage.g:919:3: ( rule__VLSFofTerm__Alternatives )
            // InternalVampireLanguage.g:919:4: rule__VLSFofTerm__Alternatives
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


    // $ANTLR start "entryRuleVLSFunctionFof"
    // InternalVampireLanguage.g:928:1: entryRuleVLSFunctionFof : ruleVLSFunctionFof EOF ;
    public final void entryRuleVLSFunctionFof() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:929:1: ( ruleVLSFunctionFof EOF )
            // InternalVampireLanguage.g:930:1: ruleVLSFunctionFof EOF
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
    // InternalVampireLanguage.g:937:1: ruleVLSFunctionFof : ( ( rule__VLSFunctionFof__Group__0 ) ) ;
    public final void ruleVLSFunctionFof() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:941:2: ( ( ( rule__VLSFunctionFof__Group__0 ) ) )
            // InternalVampireLanguage.g:942:2: ( ( rule__VLSFunctionFof__Group__0 ) )
            {
            // InternalVampireLanguage.g:942:2: ( ( rule__VLSFunctionFof__Group__0 ) )
            // InternalVampireLanguage.g:943:3: ( rule__VLSFunctionFof__Group__0 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getGroup()); 
            // InternalVampireLanguage.g:944:3: ( rule__VLSFunctionFof__Group__0 )
            // InternalVampireLanguage.g:944:4: rule__VLSFunctionFof__Group__0
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
    // InternalVampireLanguage.g:953:1: entryRuleVLSDefinedTerm : ruleVLSDefinedTerm EOF ;
    public final void entryRuleVLSDefinedTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:954:1: ( ruleVLSDefinedTerm EOF )
            // InternalVampireLanguage.g:955:1: ruleVLSDefinedTerm EOF
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
    // InternalVampireLanguage.g:962:1: ruleVLSDefinedTerm : ( ( rule__VLSDefinedTerm__Alternatives ) ) ;
    public final void ruleVLSDefinedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:966:2: ( ( ( rule__VLSDefinedTerm__Alternatives ) ) )
            // InternalVampireLanguage.g:967:2: ( ( rule__VLSDefinedTerm__Alternatives ) )
            {
            // InternalVampireLanguage.g:967:2: ( ( rule__VLSDefinedTerm__Alternatives ) )
            // InternalVampireLanguage.g:968:3: ( rule__VLSDefinedTerm__Alternatives )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getAlternatives()); 
            // InternalVampireLanguage.g:969:3: ( rule__VLSDefinedTerm__Alternatives )
            // InternalVampireLanguage.g:969:4: rule__VLSDefinedTerm__Alternatives
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
    // InternalVampireLanguage.g:977:1: rule__VampireModel__Alternatives : ( ( ( rule__VampireModel__IncludesAssignment_0 ) ) | ( ( rule__VampireModel__CommentsAssignment_1 ) ) | ( ( rule__VampireModel__FormulasAssignment_2 ) ) );
    public final void rule__VampireModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:981:1: ( ( ( rule__VampireModel__IncludesAssignment_0 ) ) | ( ( rule__VampireModel__CommentsAssignment_1 ) ) | ( ( rule__VampireModel__FormulasAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt2=1;
                }
                break;
            case 46:
                {
                alt2=2;
                }
                break;
            case 47:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalVampireLanguage.g:982:2: ( ( rule__VampireModel__IncludesAssignment_0 ) )
                    {
                    // InternalVampireLanguage.g:982:2: ( ( rule__VampireModel__IncludesAssignment_0 ) )
                    // InternalVampireLanguage.g:983:3: ( rule__VampireModel__IncludesAssignment_0 )
                    {
                     before(grammarAccess.getVampireModelAccess().getIncludesAssignment_0()); 
                    // InternalVampireLanguage.g:984:3: ( rule__VampireModel__IncludesAssignment_0 )
                    // InternalVampireLanguage.g:984:4: rule__VampireModel__IncludesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VampireModel__IncludesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVampireModelAccess().getIncludesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:988:2: ( ( rule__VampireModel__CommentsAssignment_1 ) )
                    {
                    // InternalVampireLanguage.g:988:2: ( ( rule__VampireModel__CommentsAssignment_1 ) )
                    // InternalVampireLanguage.g:989:3: ( rule__VampireModel__CommentsAssignment_1 )
                    {
                     before(grammarAccess.getVampireModelAccess().getCommentsAssignment_1()); 
                    // InternalVampireLanguage.g:990:3: ( rule__VampireModel__CommentsAssignment_1 )
                    // InternalVampireLanguage.g:990:4: rule__VampireModel__CommentsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VampireModel__CommentsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVampireModelAccess().getCommentsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:994:2: ( ( rule__VampireModel__FormulasAssignment_2 ) )
                    {
                    // InternalVampireLanguage.g:994:2: ( ( rule__VampireModel__FormulasAssignment_2 ) )
                    // InternalVampireLanguage.g:995:3: ( rule__VampireModel__FormulasAssignment_2 )
                    {
                     before(grammarAccess.getVampireModelAccess().getFormulasAssignment_2()); 
                    // InternalVampireLanguage.g:996:3: ( rule__VampireModel__FormulasAssignment_2 )
                    // InternalVampireLanguage.g:996:4: rule__VampireModel__FormulasAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__VampireModel__FormulasAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getVampireModelAccess().getFormulasAssignment_2()); 

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


    // $ANTLR start "rule__VLSName__NameAlternatives_0"
    // InternalVampireLanguage.g:1004:1: rule__VLSName__NameAlternatives_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_LITERAL ) | ( RULE_SIGNED_LITERAL ) );
    public final void rule__VLSName__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1008:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_LITERAL ) | ( RULE_SIGNED_LITERAL ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt3=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt3=2;
                }
                break;
            case RULE_LITERAL:
                {
                alt3=3;
                }
                break;
            case RULE_SIGNED_LITERAL:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalVampireLanguage.g:1009:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1009:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1010:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSNameAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSNameAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1015:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1015:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1016:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSNameAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSNameAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1021:2: ( RULE_LITERAL )
                    {
                    // InternalVampireLanguage.g:1021:2: ( RULE_LITERAL )
                    // InternalVampireLanguage.g:1022:3: RULE_LITERAL
                    {
                     before(grammarAccess.getVLSNameAccess().getNameLITERALTerminalRuleCall_0_2()); 
                    match(input,RULE_LITERAL,FOLLOW_2); 
                     after(grammarAccess.getVLSNameAccess().getNameLITERALTerminalRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1027:2: ( RULE_SIGNED_LITERAL )
                    {
                    // InternalVampireLanguage.g:1027:2: ( RULE_SIGNED_LITERAL )
                    // InternalVampireLanguage.g:1028:3: RULE_SIGNED_LITERAL
                    {
                     before(grammarAccess.getVLSNameAccess().getNameSIGNED_LITERALTerminalRuleCall_0_3()); 
                    match(input,RULE_SIGNED_LITERAL,FOLLOW_2); 
                     after(grammarAccess.getVLSNameAccess().getNameSIGNED_LITERALTerminalRuleCall_0_3()); 

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
    // $ANTLR end "rule__VLSName__NameAlternatives_0"


    // $ANTLR start "rule__VLSFofFormula__NameAlternatives_2_0"
    // InternalVampireLanguage.g:1037:1: rule__VLSFofFormula__NameAlternatives_2_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SIGNED_LITERAL ) | ( RULE_SINGLE_QUOTE ) );
    public final void rule__VLSFofFormula__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1041:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SIGNED_LITERAL ) | ( RULE_SINGLE_QUOTE ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt4=1;
                }
                break;
            case RULE_SIGNED_LITERAL:
                {
                alt4=2;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalVampireLanguage.g:1042:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1042:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1043:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSFofFormulaAccess().getNameLOWER_WORD_IDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFofFormulaAccess().getNameLOWER_WORD_IDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1048:2: ( RULE_SIGNED_LITERAL )
                    {
                    // InternalVampireLanguage.g:1048:2: ( RULE_SIGNED_LITERAL )
                    // InternalVampireLanguage.g:1049:3: RULE_SIGNED_LITERAL
                    {
                     before(grammarAccess.getVLSFofFormulaAccess().getNameSIGNED_LITERALTerminalRuleCall_2_0_1()); 
                    match(input,RULE_SIGNED_LITERAL,FOLLOW_2); 
                     after(grammarAccess.getVLSFofFormulaAccess().getNameSIGNED_LITERALTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1054:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1054:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1055:3: RULE_SINGLE_QUOTE
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
    // InternalVampireLanguage.g:1064:1: rule__VLSRole__Alternatives : ( ( ruleVLSAxiom ) | ( ruleVLSConjecture ) | ( ruleVLSHypothesis ) | ( ruleVLSDefinition ) | ( ruleVLSAssumption ) | ( ruleVLSLemma ) | ( ruleVLSTheorem ) | ( ruleVLSCorollary ) | ( ruleVLSNegated_Conjecture ) | ( ruleVLSPlain ) | ( ruleVLSType ) | ( ruleVLSFi_Domain ) | ( ruleVLSFi_Functors ) | ( ruleVLSFi_Predicates ) | ( ruleVLSUnknown ) );
    public final void rule__VLSRole__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1068:1: ( ( ruleVLSAxiom ) | ( ruleVLSConjecture ) | ( ruleVLSHypothesis ) | ( ruleVLSDefinition ) | ( ruleVLSAssumption ) | ( ruleVLSLemma ) | ( ruleVLSTheorem ) | ( ruleVLSCorollary ) | ( ruleVLSNegated_Conjecture ) | ( ruleVLSPlain ) | ( ruleVLSType ) | ( ruleVLSFi_Domain ) | ( ruleVLSFi_Functors ) | ( ruleVLSFi_Predicates ) | ( ruleVLSUnknown ) )
            int alt5=15;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt5=1;
                }
                break;
            case 28:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            case 30:
                {
                alt5=4;
                }
                break;
            case 31:
                {
                alt5=5;
                }
                break;
            case 32:
                {
                alt5=6;
                }
                break;
            case 33:
                {
                alt5=7;
                }
                break;
            case 34:
                {
                alt5=8;
                }
                break;
            case 35:
                {
                alt5=9;
                }
                break;
            case 36:
                {
                alt5=10;
                }
                break;
            case 37:
                {
                alt5=11;
                }
                break;
            case 38:
                {
                alt5=12;
                }
                break;
            case 39:
                {
                alt5=13;
                }
                break;
            case 40:
                {
                alt5=14;
                }
                break;
            case 41:
                {
                alt5=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalVampireLanguage.g:1069:2: ( ruleVLSAxiom )
                    {
                    // InternalVampireLanguage.g:1069:2: ( ruleVLSAxiom )
                    // InternalVampireLanguage.g:1070:3: ruleVLSAxiom
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
                    // InternalVampireLanguage.g:1075:2: ( ruleVLSConjecture )
                    {
                    // InternalVampireLanguage.g:1075:2: ( ruleVLSConjecture )
                    // InternalVampireLanguage.g:1076:3: ruleVLSConjecture
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
                    // InternalVampireLanguage.g:1081:2: ( ruleVLSHypothesis )
                    {
                    // InternalVampireLanguage.g:1081:2: ( ruleVLSHypothesis )
                    // InternalVampireLanguage.g:1082:3: ruleVLSHypothesis
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
                    // InternalVampireLanguage.g:1087:2: ( ruleVLSDefinition )
                    {
                    // InternalVampireLanguage.g:1087:2: ( ruleVLSDefinition )
                    // InternalVampireLanguage.g:1088:3: ruleVLSDefinition
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
                    // InternalVampireLanguage.g:1093:2: ( ruleVLSAssumption )
                    {
                    // InternalVampireLanguage.g:1093:2: ( ruleVLSAssumption )
                    // InternalVampireLanguage.g:1094:3: ruleVLSAssumption
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
                    // InternalVampireLanguage.g:1099:2: ( ruleVLSLemma )
                    {
                    // InternalVampireLanguage.g:1099:2: ( ruleVLSLemma )
                    // InternalVampireLanguage.g:1100:3: ruleVLSLemma
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
                    // InternalVampireLanguage.g:1105:2: ( ruleVLSTheorem )
                    {
                    // InternalVampireLanguage.g:1105:2: ( ruleVLSTheorem )
                    // InternalVampireLanguage.g:1106:3: ruleVLSTheorem
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
                    // InternalVampireLanguage.g:1111:2: ( ruleVLSCorollary )
                    {
                    // InternalVampireLanguage.g:1111:2: ( ruleVLSCorollary )
                    // InternalVampireLanguage.g:1112:3: ruleVLSCorollary
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
                    // InternalVampireLanguage.g:1117:2: ( ruleVLSNegated_Conjecture )
                    {
                    // InternalVampireLanguage.g:1117:2: ( ruleVLSNegated_Conjecture )
                    // InternalVampireLanguage.g:1118:3: ruleVLSNegated_Conjecture
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
                    // InternalVampireLanguage.g:1123:2: ( ruleVLSPlain )
                    {
                    // InternalVampireLanguage.g:1123:2: ( ruleVLSPlain )
                    // InternalVampireLanguage.g:1124:3: ruleVLSPlain
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
                    // InternalVampireLanguage.g:1129:2: ( ruleVLSType )
                    {
                    // InternalVampireLanguage.g:1129:2: ( ruleVLSType )
                    // InternalVampireLanguage.g:1130:3: ruleVLSType
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
                    // InternalVampireLanguage.g:1135:2: ( ruleVLSFi_Domain )
                    {
                    // InternalVampireLanguage.g:1135:2: ( ruleVLSFi_Domain )
                    // InternalVampireLanguage.g:1136:3: ruleVLSFi_Domain
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
                    // InternalVampireLanguage.g:1141:2: ( ruleVLSFi_Functors )
                    {
                    // InternalVampireLanguage.g:1141:2: ( ruleVLSFi_Functors )
                    // InternalVampireLanguage.g:1142:3: ruleVLSFi_Functors
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
                    // InternalVampireLanguage.g:1147:2: ( ruleVLSFi_Predicates )
                    {
                    // InternalVampireLanguage.g:1147:2: ( ruleVLSFi_Predicates )
                    // InternalVampireLanguage.g:1148:3: ruleVLSFi_Predicates
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
                    // InternalVampireLanguage.g:1153:2: ( ruleVLSUnknown )
                    {
                    // InternalVampireLanguage.g:1153:2: ( ruleVLSUnknown )
                    // InternalVampireLanguage.g:1154:3: ruleVLSUnknown
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
    // InternalVampireLanguage.g:1163:1: rule__VLSAnnotation__NameAlternatives_1_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( ruleVLSRole ) );
    public final void rule__VLSAnnotation__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1167:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( ruleVLSRole ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt6=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt6=2;
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
                    // InternalVampireLanguage.g:1168:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1168:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1169:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSAnnotationAccess().getNameLOWER_WORD_IDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAnnotationAccess().getNameLOWER_WORD_IDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1174:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1174:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1175:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSAnnotationAccess().getNameSINGLE_QUOTETerminalRuleCall_1_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSAnnotationAccess().getNameSINGLE_QUOTETerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1180:2: ( ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:1180:2: ( ruleVLSRole )
                    // InternalVampireLanguage.g:1181:3: ruleVLSRole
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
    // InternalVampireLanguage.g:1190:1: rule__VLSBinary__Alternatives_1 : ( ( ( rule__VLSBinary__Group_1_0__0 ) ) | ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) ) | ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) ) );
    public final void rule__VLSBinary__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1194:1: ( ( ( rule__VLSBinary__Group_1_0__0 ) ) | ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) ) | ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt9=1;
                }
                break;
            case 58:
                {
                alt9=2;
                }
                break;
            case 59:
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
                    // InternalVampireLanguage.g:1195:2: ( ( rule__VLSBinary__Group_1_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1195:2: ( ( rule__VLSBinary__Group_1_0__0 ) )
                    // InternalVampireLanguage.g:1196:3: ( rule__VLSBinary__Group_1_0__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0()); 
                    // InternalVampireLanguage.g:1197:3: ( rule__VLSBinary__Group_1_0__0 )
                    // InternalVampireLanguage.g:1197:4: rule__VLSBinary__Group_1_0__0
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
                    // InternalVampireLanguage.g:1201:2: ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) )
                    {
                    // InternalVampireLanguage.g:1201:2: ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) )
                    // InternalVampireLanguage.g:1202:3: ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* )
                    {
                    // InternalVampireLanguage.g:1202:3: ( ( rule__VLSBinary__Group_1_1__0 ) )
                    // InternalVampireLanguage.g:1203:4: ( rule__VLSBinary__Group_1_1__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 
                    // InternalVampireLanguage.g:1204:4: ( rule__VLSBinary__Group_1_1__0 )
                    // InternalVampireLanguage.g:1204:5: rule__VLSBinary__Group_1_1__0
                    {
                    pushFollow(FOLLOW_4);
                    rule__VLSBinary__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 

                    }

                    // InternalVampireLanguage.g:1207:3: ( ( rule__VLSBinary__Group_1_1__0 )* )
                    // InternalVampireLanguage.g:1208:4: ( rule__VLSBinary__Group_1_1__0 )*
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 
                    // InternalVampireLanguage.g:1209:4: ( rule__VLSBinary__Group_1_1__0 )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==58) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1209:5: rule__VLSBinary__Group_1_1__0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__VLSBinary__Group_1_1__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1214:2: ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) )
                    {
                    // InternalVampireLanguage.g:1214:2: ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) )
                    // InternalVampireLanguage.g:1215:3: ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* )
                    {
                    // InternalVampireLanguage.g:1215:3: ( ( rule__VLSBinary__Group_1_2__0 ) )
                    // InternalVampireLanguage.g:1216:4: ( rule__VLSBinary__Group_1_2__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 
                    // InternalVampireLanguage.g:1217:4: ( rule__VLSBinary__Group_1_2__0 )
                    // InternalVampireLanguage.g:1217:5: rule__VLSBinary__Group_1_2__0
                    {
                    pushFollow(FOLLOW_5);
                    rule__VLSBinary__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 

                    }

                    // InternalVampireLanguage.g:1220:3: ( ( rule__VLSBinary__Group_1_2__0 )* )
                    // InternalVampireLanguage.g:1221:4: ( rule__VLSBinary__Group_1_2__0 )*
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 
                    // InternalVampireLanguage.g:1222:4: ( rule__VLSBinary__Group_1_2__0 )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==59) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1222:5: rule__VLSBinary__Group_1_2__0
                    	    {
                    	    pushFollow(FOLLOW_5);
                    	    rule__VLSBinary__Group_1_2__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
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
    // InternalVampireLanguage.g:1231:1: rule__VLSBinary__Alternatives_1_0_0 : ( ( ( rule__VLSBinary__Group_1_0_0_0__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_1__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_2__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_3__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_4__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_5__0 ) ) );
    public final void rule__VLSBinary__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1235:1: ( ( ( rule__VLSBinary__Group_1_0_0_0__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_1__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_2__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_3__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_4__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_5__0 ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt10=1;
                }
                break;
            case 53:
                {
                alt10=2;
                }
                break;
            case 54:
                {
                alt10=3;
                }
                break;
            case 55:
                {
                alt10=4;
                }
                break;
            case 56:
                {
                alt10=5;
                }
                break;
            case 57:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalVampireLanguage.g:1236:2: ( ( rule__VLSBinary__Group_1_0_0_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1236:2: ( ( rule__VLSBinary__Group_1_0_0_0__0 ) )
                    // InternalVampireLanguage.g:1237:3: ( rule__VLSBinary__Group_1_0_0_0__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_0()); 
                    // InternalVampireLanguage.g:1238:3: ( rule__VLSBinary__Group_1_0_0_0__0 )
                    // InternalVampireLanguage.g:1238:4: rule__VLSBinary__Group_1_0_0_0__0
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
                    // InternalVampireLanguage.g:1242:2: ( ( rule__VLSBinary__Group_1_0_0_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1242:2: ( ( rule__VLSBinary__Group_1_0_0_1__0 ) )
                    // InternalVampireLanguage.g:1243:3: ( rule__VLSBinary__Group_1_0_0_1__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_1()); 
                    // InternalVampireLanguage.g:1244:3: ( rule__VLSBinary__Group_1_0_0_1__0 )
                    // InternalVampireLanguage.g:1244:4: rule__VLSBinary__Group_1_0_0_1__0
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
                    // InternalVampireLanguage.g:1248:2: ( ( rule__VLSBinary__Group_1_0_0_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1248:2: ( ( rule__VLSBinary__Group_1_0_0_2__0 ) )
                    // InternalVampireLanguage.g:1249:3: ( rule__VLSBinary__Group_1_0_0_2__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_2()); 
                    // InternalVampireLanguage.g:1250:3: ( rule__VLSBinary__Group_1_0_0_2__0 )
                    // InternalVampireLanguage.g:1250:4: rule__VLSBinary__Group_1_0_0_2__0
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
                    // InternalVampireLanguage.g:1254:2: ( ( rule__VLSBinary__Group_1_0_0_3__0 ) )
                    {
                    // InternalVampireLanguage.g:1254:2: ( ( rule__VLSBinary__Group_1_0_0_3__0 ) )
                    // InternalVampireLanguage.g:1255:3: ( rule__VLSBinary__Group_1_0_0_3__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_3()); 
                    // InternalVampireLanguage.g:1256:3: ( rule__VLSBinary__Group_1_0_0_3__0 )
                    // InternalVampireLanguage.g:1256:4: rule__VLSBinary__Group_1_0_0_3__0
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
                    // InternalVampireLanguage.g:1260:2: ( ( rule__VLSBinary__Group_1_0_0_4__0 ) )
                    {
                    // InternalVampireLanguage.g:1260:2: ( ( rule__VLSBinary__Group_1_0_0_4__0 ) )
                    // InternalVampireLanguage.g:1261:3: ( rule__VLSBinary__Group_1_0_0_4__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_4()); 
                    // InternalVampireLanguage.g:1262:3: ( rule__VLSBinary__Group_1_0_0_4__0 )
                    // InternalVampireLanguage.g:1262:4: rule__VLSBinary__Group_1_0_0_4__0
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
                    // InternalVampireLanguage.g:1266:2: ( ( rule__VLSBinary__Group_1_0_0_5__0 ) )
                    {
                    // InternalVampireLanguage.g:1266:2: ( ( rule__VLSBinary__Group_1_0_0_5__0 ) )
                    // InternalVampireLanguage.g:1267:3: ( rule__VLSBinary__Group_1_0_0_5__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_5()); 
                    // InternalVampireLanguage.g:1268:3: ( rule__VLSBinary__Group_1_0_0_5__0 )
                    // InternalVampireLanguage.g:1268:4: rule__VLSBinary__Group_1_0_0_5__0
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
    // InternalVampireLanguage.g:1276:1: rule__VLSUnitaryFormula__Alternatives : ( ( ruleVLSUniversalQuantifier ) | ( ruleVLSExistentialQuantifier ) | ( ruleVLSUnaryNegation ) | ( ruleVLSUnaryInfix ) | ( ( rule__VLSUnitaryFormula__Group_4__0 ) ) );
    public final void rule__VLSUnitaryFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1280:1: ( ( ruleVLSUniversalQuantifier ) | ( ruleVLSExistentialQuantifier ) | ( ruleVLSUnaryNegation ) | ( ruleVLSUnaryInfix ) | ( ( rule__VLSUnitaryFormula__Group_4__0 ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 60:
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
            case RULE_LOWER_WORD_ID:
            case RULE_SINGLE_QUOTE:
            case RULE_SIGNED_LITERAL:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
            case RULE_UPPER_WORD_ID:
            case RULE_SIGNED_REAL_ID:
            case RULE_SIGNED_RAT_ID:
            case RULE_DOUBLE_QUOTE:
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
            case 67:
            case 68:
            case 69:
                {
                alt11=4;
                }
                break;
            case 48:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalVampireLanguage.g:1281:2: ( ruleVLSUniversalQuantifier )
                    {
                    // InternalVampireLanguage.g:1281:2: ( ruleVLSUniversalQuantifier )
                    // InternalVampireLanguage.g:1282:3: ruleVLSUniversalQuantifier
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
                    // InternalVampireLanguage.g:1287:2: ( ruleVLSExistentialQuantifier )
                    {
                    // InternalVampireLanguage.g:1287:2: ( ruleVLSExistentialQuantifier )
                    // InternalVampireLanguage.g:1288:3: ruleVLSExistentialQuantifier
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
                    // InternalVampireLanguage.g:1293:2: ( ruleVLSUnaryNegation )
                    {
                    // InternalVampireLanguage.g:1293:2: ( ruleVLSUnaryNegation )
                    // InternalVampireLanguage.g:1294:3: ruleVLSUnaryNegation
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
                    // InternalVampireLanguage.g:1299:2: ( ruleVLSUnaryInfix )
                    {
                    // InternalVampireLanguage.g:1299:2: ( ruleVLSUnaryInfix )
                    // InternalVampireLanguage.g:1300:3: ruleVLSUnaryInfix
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
                    // InternalVampireLanguage.g:1305:2: ( ( rule__VLSUnitaryFormula__Group_4__0 ) )
                    {
                    // InternalVampireLanguage.g:1305:2: ( ( rule__VLSUnitaryFormula__Group_4__0 ) )
                    // InternalVampireLanguage.g:1306:3: ( rule__VLSUnitaryFormula__Group_4__0 )
                    {
                     before(grammarAccess.getVLSUnitaryFormulaAccess().getGroup_4()); 
                    // InternalVampireLanguage.g:1307:3: ( rule__VLSUnitaryFormula__Group_4__0 )
                    // InternalVampireLanguage.g:1307:4: rule__VLSUnitaryFormula__Group_4__0
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
    // InternalVampireLanguage.g:1315:1: rule__VLSUnaryInfix__Alternatives_1_0 : ( ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) ) );
    public final void rule__VLSUnaryInfix__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1319:1: ( ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt12=1;
                }
                break;
            case 65:
                {
                alt12=2;
                }
                break;
            case 66:
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
                    // InternalVampireLanguage.g:1320:2: ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1320:2: ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) )
                    // InternalVampireLanguage.g:1321:3: ( rule__VLSUnaryInfix__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_0()); 
                    // InternalVampireLanguage.g:1322:3: ( rule__VLSUnaryInfix__Group_1_0_0__0 )
                    // InternalVampireLanguage.g:1322:4: rule__VLSUnaryInfix__Group_1_0_0__0
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
                    // InternalVampireLanguage.g:1326:2: ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1326:2: ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) )
                    // InternalVampireLanguage.g:1327:3: ( rule__VLSUnaryInfix__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_1()); 
                    // InternalVampireLanguage.g:1328:3: ( rule__VLSUnaryInfix__Group_1_0_1__0 )
                    // InternalVampireLanguage.g:1328:4: rule__VLSUnaryInfix__Group_1_0_1__0
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
                    // InternalVampireLanguage.g:1332:2: ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1332:2: ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) )
                    // InternalVampireLanguage.g:1333:3: ( rule__VLSUnaryInfix__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_2()); 
                    // InternalVampireLanguage.g:1334:3: ( rule__VLSUnaryInfix__Group_1_0_2__0 )
                    // InternalVampireLanguage.g:1334:4: rule__VLSUnaryInfix__Group_1_0_2__0
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
    // InternalVampireLanguage.g:1342:1: rule__VLSAtomic__Alternatives : ( ( ruleVLSAtomicConstant ) | ( ruleVLSAtomicFunction ) | ( ruleVLSVariable ) | ( ruleVLSDefinedTerm ) );
    public final void rule__VLSAtomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1346:1: ( ( ruleVLSAtomicConstant ) | ( ruleVLSAtomicFunction ) | ( ruleVLSVariable ) | ( ruleVLSDefinedTerm ) )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalVampireLanguage.g:1347:2: ( ruleVLSAtomicConstant )
                    {
                    // InternalVampireLanguage.g:1347:2: ( ruleVLSAtomicConstant )
                    // InternalVampireLanguage.g:1348:3: ruleVLSAtomicConstant
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
                    // InternalVampireLanguage.g:1353:2: ( ruleVLSAtomicFunction )
                    {
                    // InternalVampireLanguage.g:1353:2: ( ruleVLSAtomicFunction )
                    // InternalVampireLanguage.g:1354:3: ruleVLSAtomicFunction
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
                    // InternalVampireLanguage.g:1359:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1359:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1360:3: ruleVLSVariable
                    {
                     before(grammarAccess.getVLSAtomicAccess().getVLSVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSVariable();

                    state._fsp--;

                     after(grammarAccess.getVLSAtomicAccess().getVLSVariableParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1365:2: ( ruleVLSDefinedTerm )
                    {
                    // InternalVampireLanguage.g:1365:2: ( ruleVLSDefinedTerm )
                    // InternalVampireLanguage.g:1366:3: ruleVLSDefinedTerm
                    {
                     before(grammarAccess.getVLSAtomicAccess().getVLSDefinedTermParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSDefinedTerm();

                    state._fsp--;

                     after(grammarAccess.getVLSAtomicAccess().getVLSDefinedTermParserRuleCall_3()); 

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
    // InternalVampireLanguage.g:1375:1: rule__VLSAtomicConstant__Alternatives : ( ( ( rule__VLSAtomicConstant__Group_0__0 ) ) | ( ( rule__VLSAtomicConstant__Group_1__0 ) ) | ( ( rule__VLSAtomicConstant__Group_2__0 ) ) );
    public final void rule__VLSAtomicConstant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1379:1: ( ( ( rule__VLSAtomicConstant__Group_0__0 ) ) | ( ( rule__VLSAtomicConstant__Group_1__0 ) ) | ( ( rule__VLSAtomicConstant__Group_2__0 ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
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
                alt14=1;
                }
                break;
            case 67:
                {
                alt14=2;
                }
                break;
            case 68:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalVampireLanguage.g:1380:2: ( ( rule__VLSAtomicConstant__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1380:2: ( ( rule__VLSAtomicConstant__Group_0__0 ) )
                    // InternalVampireLanguage.g:1381:3: ( rule__VLSAtomicConstant__Group_0__0 )
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:1382:3: ( rule__VLSAtomicConstant__Group_0__0 )
                    // InternalVampireLanguage.g:1382:4: rule__VLSAtomicConstant__Group_0__0
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
                    // InternalVampireLanguage.g:1386:2: ( ( rule__VLSAtomicConstant__Group_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1386:2: ( ( rule__VLSAtomicConstant__Group_1__0 ) )
                    // InternalVampireLanguage.g:1387:3: ( rule__VLSAtomicConstant__Group_1__0 )
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getGroup_1()); 
                    // InternalVampireLanguage.g:1388:3: ( rule__VLSAtomicConstant__Group_1__0 )
                    // InternalVampireLanguage.g:1388:4: rule__VLSAtomicConstant__Group_1__0
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
                    // InternalVampireLanguage.g:1392:2: ( ( rule__VLSAtomicConstant__Group_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1392:2: ( ( rule__VLSAtomicConstant__Group_2__0 ) )
                    // InternalVampireLanguage.g:1393:3: ( rule__VLSAtomicConstant__Group_2__0 )
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getGroup_2()); 
                    // InternalVampireLanguage.g:1394:3: ( rule__VLSAtomicConstant__Group_2__0 )
                    // InternalVampireLanguage.g:1394:4: rule__VLSAtomicConstant__Group_2__0
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
    // InternalVampireLanguage.g:1402:1: rule__VLSAtomicConstant__NameAlternatives_0_1_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) | ( ruleVLSRole ) );
    public final void rule__VLSAtomicConstant__NameAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1406:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) | ( ruleVLSRole ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt15=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt15=2;
                }
                break;
            case RULE_DOLLAR_ID:
                {
                alt15=3;
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt15=4;
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
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalVampireLanguage.g:1407:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1407:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1408:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1413:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1413:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1414:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1419:2: ( RULE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1419:2: ( RULE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1420:3: RULE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameDOLLAR_IDTerminalRuleCall_0_1_0_2()); 
                    match(input,RULE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameDOLLAR_IDTerminalRuleCall_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1425:2: ( RULE_DOUBLE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1425:2: ( RULE_DOUBLE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1426:3: RULE_DOUBLE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 
                    match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:1431:2: ( ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:1431:2: ( ruleVLSRole )
                    // InternalVampireLanguage.g:1432:3: ruleVLSRole
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameVLSRoleParserRuleCall_0_1_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSRole();

                    state._fsp--;

                     after(grammarAccess.getVLSAtomicConstantAccess().getNameVLSRoleParserRuleCall_0_1_0_4()); 

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
    // InternalVampireLanguage.g:1441:1: rule__VLSAtomicFunction__Alternatives : ( ( ( rule__VLSAtomicFunction__Group_0__0 ) ) | ( ( rule__VLSAtomicFunction__Group_1__0 ) ) );
    public final void rule__VLSAtomicFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1445:1: ( ( ( rule__VLSAtomicFunction__Group_0__0 ) ) | ( ( rule__VLSAtomicFunction__Group_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_LOWER_WORD_ID && LA16_0<=RULE_SINGLE_QUOTE)||(LA16_0>=RULE_DOLLAR_ID && LA16_0<=RULE_DOUBLE_DOLLAR_ID)||(LA16_0>=27 && LA16_0<=41)) ) {
                alt16=1;
            }
            else if ( (LA16_0==69) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalVampireLanguage.g:1446:2: ( ( rule__VLSAtomicFunction__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1446:2: ( ( rule__VLSAtomicFunction__Group_0__0 ) )
                    // InternalVampireLanguage.g:1447:3: ( rule__VLSAtomicFunction__Group_0__0 )
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:1448:3: ( rule__VLSAtomicFunction__Group_0__0 )
                    // InternalVampireLanguage.g:1448:4: rule__VLSAtomicFunction__Group_0__0
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
                    // InternalVampireLanguage.g:1452:2: ( ( rule__VLSAtomicFunction__Group_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1452:2: ( ( rule__VLSAtomicFunction__Group_1__0 ) )
                    // InternalVampireLanguage.g:1453:3: ( rule__VLSAtomicFunction__Group_1__0 )
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_1()); 
                    // InternalVampireLanguage.g:1454:3: ( rule__VLSAtomicFunction__Group_1__0 )
                    // InternalVampireLanguage.g:1454:4: rule__VLSAtomicFunction__Group_1__0
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
    // InternalVampireLanguage.g:1462:1: rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) | ( ruleVLSRole ) );
    public final void rule__VLSAtomicFunction__ConstantAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1466:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) | ( ruleVLSRole ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt17=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt17=2;
                }
                break;
            case RULE_DOLLAR_ID:
                {
                alt17=3;
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt17=4;
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
                    // InternalVampireLanguage.g:1467:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1467:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1468:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1473:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1473:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1474:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1479:2: ( RULE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1479:2: ( RULE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1480:3: RULE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOLLAR_IDTerminalRuleCall_0_1_0_2()); 
                    match(input,RULE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOLLAR_IDTerminalRuleCall_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1485:2: ( RULE_DOUBLE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1485:2: ( RULE_DOUBLE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1486:3: RULE_DOUBLE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 
                    match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:1491:2: ( ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:1491:2: ( ruleVLSRole )
                    // InternalVampireLanguage.g:1492:3: ruleVLSRole
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantVLSRoleParserRuleCall_0_1_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSRole();

                    state._fsp--;

                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantVLSRoleParserRuleCall_0_1_0_4()); 

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
    // InternalVampireLanguage.g:1501:1: rule__VLSFofTerm__Alternatives : ( ( ruleVLSVariable ) | ( ruleVLSFunctionFof ) | ( ruleVLSDefinedTerm ) );
    public final void rule__VLSFofTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1505:1: ( ( ruleVLSVariable ) | ( ruleVLSFunctionFof ) | ( ruleVLSDefinedTerm ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_UPPER_WORD_ID:
                {
                alt18=1;
                }
                break;
            case RULE_LOWER_WORD_ID:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt18=2;
                }
                break;
            case RULE_SIGNED_LITERAL:
            case RULE_SIGNED_REAL_ID:
            case RULE_SIGNED_RAT_ID:
            case RULE_DOUBLE_QUOTE:
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
                    // InternalVampireLanguage.g:1506:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1506:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1507:3: ruleVLSVariable
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
                    // InternalVampireLanguage.g:1512:2: ( ruleVLSFunctionFof )
                    {
                    // InternalVampireLanguage.g:1512:2: ( ruleVLSFunctionFof )
                    // InternalVampireLanguage.g:1513:3: ruleVLSFunctionFof
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
                    // InternalVampireLanguage.g:1518:2: ( ruleVLSDefinedTerm )
                    {
                    // InternalVampireLanguage.g:1518:2: ( ruleVLSDefinedTerm )
                    // InternalVampireLanguage.g:1519:3: ruleVLSDefinedTerm
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
    // InternalVampireLanguage.g:1528:1: rule__VLSFunctionFof__FunctorAlternatives_0_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) );
    public final void rule__VLSFunctionFof__FunctorAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1532:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt19=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt19=2;
                }
                break;
            case RULE_DOLLAR_ID:
                {
                alt19=3;
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
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
                    // InternalVampireLanguage.g:1533:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1533:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1534:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSFunctionFofAccess().getFunctorLOWER_WORD_IDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionFofAccess().getFunctorLOWER_WORD_IDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1539:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1539:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1540:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSFunctionFofAccess().getFunctorSINGLE_QUOTETerminalRuleCall_0_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionFofAccess().getFunctorSINGLE_QUOTETerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1545:2: ( RULE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1545:2: ( RULE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1546:3: RULE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSFunctionFofAccess().getFunctorDOLLAR_IDTerminalRuleCall_0_0_2()); 
                    match(input,RULE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionFofAccess().getFunctorDOLLAR_IDTerminalRuleCall_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1551:2: ( RULE_DOUBLE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1551:2: ( RULE_DOUBLE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1552:3: RULE_DOUBLE_DOLLAR_ID
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
    // InternalVampireLanguage.g:1561:1: rule__VLSDefinedTerm__Alternatives : ( ( ( rule__VLSDefinedTerm__Group_0__0 ) ) | ( ( rule__VLSDefinedTerm__Group_1__0 ) ) | ( ( rule__VLSDefinedTerm__Group_2__0 ) ) | ( ( rule__VLSDefinedTerm__Group_3__0 ) ) );
    public final void rule__VLSDefinedTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1565:1: ( ( ( rule__VLSDefinedTerm__Group_0__0 ) ) | ( ( rule__VLSDefinedTerm__Group_1__0 ) ) | ( ( rule__VLSDefinedTerm__Group_2__0 ) ) | ( ( rule__VLSDefinedTerm__Group_3__0 ) ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_LITERAL:
                {
                alt20=1;
                }
                break;
            case RULE_SIGNED_REAL_ID:
                {
                alt20=2;
                }
                break;
            case RULE_SIGNED_RAT_ID:
                {
                alt20=3;
                }
                break;
            case RULE_DOUBLE_QUOTE:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalVampireLanguage.g:1566:2: ( ( rule__VLSDefinedTerm__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1566:2: ( ( rule__VLSDefinedTerm__Group_0__0 ) )
                    // InternalVampireLanguage.g:1567:3: ( rule__VLSDefinedTerm__Group_0__0 )
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:1568:3: ( rule__VLSDefinedTerm__Group_0__0 )
                    // InternalVampireLanguage.g:1568:4: rule__VLSDefinedTerm__Group_0__0
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
                    // InternalVampireLanguage.g:1572:2: ( ( rule__VLSDefinedTerm__Group_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1572:2: ( ( rule__VLSDefinedTerm__Group_1__0 ) )
                    // InternalVampireLanguage.g:1573:3: ( rule__VLSDefinedTerm__Group_1__0 )
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getGroup_1()); 
                    // InternalVampireLanguage.g:1574:3: ( rule__VLSDefinedTerm__Group_1__0 )
                    // InternalVampireLanguage.g:1574:4: rule__VLSDefinedTerm__Group_1__0
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
                    // InternalVampireLanguage.g:1578:2: ( ( rule__VLSDefinedTerm__Group_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1578:2: ( ( rule__VLSDefinedTerm__Group_2__0 ) )
                    // InternalVampireLanguage.g:1579:3: ( rule__VLSDefinedTerm__Group_2__0 )
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getGroup_2()); 
                    // InternalVampireLanguage.g:1580:3: ( rule__VLSDefinedTerm__Group_2__0 )
                    // InternalVampireLanguage.g:1580:4: rule__VLSDefinedTerm__Group_2__0
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
                    // InternalVampireLanguage.g:1584:2: ( ( rule__VLSDefinedTerm__Group_3__0 ) )
                    {
                    // InternalVampireLanguage.g:1584:2: ( ( rule__VLSDefinedTerm__Group_3__0 ) )
                    // InternalVampireLanguage.g:1585:3: ( rule__VLSDefinedTerm__Group_3__0 )
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getGroup_3()); 
                    // InternalVampireLanguage.g:1586:3: ( rule__VLSDefinedTerm__Group_3__0 )
                    // InternalVampireLanguage.g:1586:4: rule__VLSDefinedTerm__Group_3__0
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


    // $ANTLR start "rule__VLSInclude__Group__0"
    // InternalVampireLanguage.g:1594:1: rule__VLSInclude__Group__0 : rule__VLSInclude__Group__0__Impl rule__VLSInclude__Group__1 ;
    public final void rule__VLSInclude__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1598:1: ( rule__VLSInclude__Group__0__Impl rule__VLSInclude__Group__1 )
            // InternalVampireLanguage.g:1599:2: rule__VLSInclude__Group__0__Impl rule__VLSInclude__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VLSInclude__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSInclude__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group__0"


    // $ANTLR start "rule__VLSInclude__Group__0__Impl"
    // InternalVampireLanguage.g:1606:1: rule__VLSInclude__Group__0__Impl : ( 'include(' ) ;
    public final void rule__VLSInclude__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1610:1: ( ( 'include(' ) )
            // InternalVampireLanguage.g:1611:1: ( 'include(' )
            {
            // InternalVampireLanguage.g:1611:1: ( 'include(' )
            // InternalVampireLanguage.g:1612:2: 'include('
            {
             before(grammarAccess.getVLSIncludeAccess().getIncludeKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVLSIncludeAccess().getIncludeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group__0__Impl"


    // $ANTLR start "rule__VLSInclude__Group__1"
    // InternalVampireLanguage.g:1621:1: rule__VLSInclude__Group__1 : rule__VLSInclude__Group__1__Impl rule__VLSInclude__Group__2 ;
    public final void rule__VLSInclude__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1625:1: ( rule__VLSInclude__Group__1__Impl rule__VLSInclude__Group__2 )
            // InternalVampireLanguage.g:1626:2: rule__VLSInclude__Group__1__Impl rule__VLSInclude__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__VLSInclude__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSInclude__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group__1"


    // $ANTLR start "rule__VLSInclude__Group__1__Impl"
    // InternalVampireLanguage.g:1633:1: rule__VLSInclude__Group__1__Impl : ( ( rule__VLSInclude__FileNameAssignment_1 ) ) ;
    public final void rule__VLSInclude__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1637:1: ( ( ( rule__VLSInclude__FileNameAssignment_1 ) ) )
            // InternalVampireLanguage.g:1638:1: ( ( rule__VLSInclude__FileNameAssignment_1 ) )
            {
            // InternalVampireLanguage.g:1638:1: ( ( rule__VLSInclude__FileNameAssignment_1 ) )
            // InternalVampireLanguage.g:1639:2: ( rule__VLSInclude__FileNameAssignment_1 )
            {
             before(grammarAccess.getVLSIncludeAccess().getFileNameAssignment_1()); 
            // InternalVampireLanguage.g:1640:2: ( rule__VLSInclude__FileNameAssignment_1 )
            // InternalVampireLanguage.g:1640:3: rule__VLSInclude__FileNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSInclude__FileNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSIncludeAccess().getFileNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group__1__Impl"


    // $ANTLR start "rule__VLSInclude__Group__2"
    // InternalVampireLanguage.g:1648:1: rule__VLSInclude__Group__2 : rule__VLSInclude__Group__2__Impl ;
    public final void rule__VLSInclude__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1652:1: ( rule__VLSInclude__Group__2__Impl )
            // InternalVampireLanguage.g:1653:2: rule__VLSInclude__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSInclude__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group__2"


    // $ANTLR start "rule__VLSInclude__Group__2__Impl"
    // InternalVampireLanguage.g:1659:1: rule__VLSInclude__Group__2__Impl : ( ( rule__VLSInclude__Group_2__0 )? ) ;
    public final void rule__VLSInclude__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1663:1: ( ( ( rule__VLSInclude__Group_2__0 )? ) )
            // InternalVampireLanguage.g:1664:1: ( ( rule__VLSInclude__Group_2__0 )? )
            {
            // InternalVampireLanguage.g:1664:1: ( ( rule__VLSInclude__Group_2__0 )? )
            // InternalVampireLanguage.g:1665:2: ( rule__VLSInclude__Group_2__0 )?
            {
             before(grammarAccess.getVLSIncludeAccess().getGroup_2()); 
            // InternalVampireLanguage.g:1666:2: ( rule__VLSInclude__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVampireLanguage.g:1666:3: rule__VLSInclude__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSInclude__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVLSIncludeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group__2__Impl"


    // $ANTLR start "rule__VLSInclude__Group_2__0"
    // InternalVampireLanguage.g:1675:1: rule__VLSInclude__Group_2__0 : rule__VLSInclude__Group_2__0__Impl rule__VLSInclude__Group_2__1 ;
    public final void rule__VLSInclude__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1679:1: ( rule__VLSInclude__Group_2__0__Impl rule__VLSInclude__Group_2__1 )
            // InternalVampireLanguage.g:1680:2: rule__VLSInclude__Group_2__0__Impl rule__VLSInclude__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__VLSInclude__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSInclude__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group_2__0"


    // $ANTLR start "rule__VLSInclude__Group_2__0__Impl"
    // InternalVampireLanguage.g:1687:1: rule__VLSInclude__Group_2__0__Impl : ( ',[' ) ;
    public final void rule__VLSInclude__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1691:1: ( ( ',[' ) )
            // InternalVampireLanguage.g:1692:1: ( ',[' )
            {
            // InternalVampireLanguage.g:1692:1: ( ',[' )
            // InternalVampireLanguage.g:1693:2: ',['
            {
             before(grammarAccess.getVLSIncludeAccess().getCommaLeftSquareBracketKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getVLSIncludeAccess().getCommaLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group_2__0__Impl"


    // $ANTLR start "rule__VLSInclude__Group_2__1"
    // InternalVampireLanguage.g:1702:1: rule__VLSInclude__Group_2__1 : rule__VLSInclude__Group_2__1__Impl rule__VLSInclude__Group_2__2 ;
    public final void rule__VLSInclude__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1706:1: ( rule__VLSInclude__Group_2__1__Impl rule__VLSInclude__Group_2__2 )
            // InternalVampireLanguage.g:1707:2: rule__VLSInclude__Group_2__1__Impl rule__VLSInclude__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__VLSInclude__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSInclude__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group_2__1"


    // $ANTLR start "rule__VLSInclude__Group_2__1__Impl"
    // InternalVampireLanguage.g:1714:1: rule__VLSInclude__Group_2__1__Impl : ( ( rule__VLSInclude__NamesAssignment_2_1 ) ) ;
    public final void rule__VLSInclude__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1718:1: ( ( ( rule__VLSInclude__NamesAssignment_2_1 ) ) )
            // InternalVampireLanguage.g:1719:1: ( ( rule__VLSInclude__NamesAssignment_2_1 ) )
            {
            // InternalVampireLanguage.g:1719:1: ( ( rule__VLSInclude__NamesAssignment_2_1 ) )
            // InternalVampireLanguage.g:1720:2: ( rule__VLSInclude__NamesAssignment_2_1 )
            {
             before(grammarAccess.getVLSIncludeAccess().getNamesAssignment_2_1()); 
            // InternalVampireLanguage.g:1721:2: ( rule__VLSInclude__NamesAssignment_2_1 )
            // InternalVampireLanguage.g:1721:3: rule__VLSInclude__NamesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSInclude__NamesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSIncludeAccess().getNamesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group_2__1__Impl"


    // $ANTLR start "rule__VLSInclude__Group_2__2"
    // InternalVampireLanguage.g:1729:1: rule__VLSInclude__Group_2__2 : rule__VLSInclude__Group_2__2__Impl rule__VLSInclude__Group_2__3 ;
    public final void rule__VLSInclude__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1733:1: ( rule__VLSInclude__Group_2__2__Impl rule__VLSInclude__Group_2__3 )
            // InternalVampireLanguage.g:1734:2: rule__VLSInclude__Group_2__2__Impl rule__VLSInclude__Group_2__3
            {
            pushFollow(FOLLOW_9);
            rule__VLSInclude__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSInclude__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group_2__2"


    // $ANTLR start "rule__VLSInclude__Group_2__2__Impl"
    // InternalVampireLanguage.g:1741:1: rule__VLSInclude__Group_2__2__Impl : ( ( rule__VLSInclude__Group_2_2__0 )* ) ;
    public final void rule__VLSInclude__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1745:1: ( ( ( rule__VLSInclude__Group_2_2__0 )* ) )
            // InternalVampireLanguage.g:1746:1: ( ( rule__VLSInclude__Group_2_2__0 )* )
            {
            // InternalVampireLanguage.g:1746:1: ( ( rule__VLSInclude__Group_2_2__0 )* )
            // InternalVampireLanguage.g:1747:2: ( rule__VLSInclude__Group_2_2__0 )*
            {
             before(grammarAccess.getVLSIncludeAccess().getGroup_2_2()); 
            // InternalVampireLanguage.g:1748:2: ( rule__VLSInclude__Group_2_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==45) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalVampireLanguage.g:1748:3: rule__VLSInclude__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__VLSInclude__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getVLSIncludeAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group_2__2__Impl"


    // $ANTLR start "rule__VLSInclude__Group_2__3"
    // InternalVampireLanguage.g:1756:1: rule__VLSInclude__Group_2__3 : rule__VLSInclude__Group_2__3__Impl ;
    public final void rule__VLSInclude__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1760:1: ( rule__VLSInclude__Group_2__3__Impl )
            // InternalVampireLanguage.g:1761:2: rule__VLSInclude__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSInclude__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group_2__3"


    // $ANTLR start "rule__VLSInclude__Group_2__3__Impl"
    // InternalVampireLanguage.g:1767:1: rule__VLSInclude__Group_2__3__Impl : ( ']' ) ;
    public final void rule__VLSInclude__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1771:1: ( ( ']' ) )
            // InternalVampireLanguage.g:1772:1: ( ']' )
            {
            // InternalVampireLanguage.g:1772:1: ( ']' )
            // InternalVampireLanguage.g:1773:2: ']'
            {
             before(grammarAccess.getVLSIncludeAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVLSIncludeAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group_2__3__Impl"


    // $ANTLR start "rule__VLSInclude__Group_2_2__0"
    // InternalVampireLanguage.g:1783:1: rule__VLSInclude__Group_2_2__0 : rule__VLSInclude__Group_2_2__0__Impl rule__VLSInclude__Group_2_2__1 ;
    public final void rule__VLSInclude__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1787:1: ( rule__VLSInclude__Group_2_2__0__Impl rule__VLSInclude__Group_2_2__1 )
            // InternalVampireLanguage.g:1788:2: rule__VLSInclude__Group_2_2__0__Impl rule__VLSInclude__Group_2_2__1
            {
            pushFollow(FOLLOW_8);
            rule__VLSInclude__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSInclude__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group_2_2__0"


    // $ANTLR start "rule__VLSInclude__Group_2_2__0__Impl"
    // InternalVampireLanguage.g:1795:1: rule__VLSInclude__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__VLSInclude__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1799:1: ( ( ',' ) )
            // InternalVampireLanguage.g:1800:1: ( ',' )
            {
            // InternalVampireLanguage.g:1800:1: ( ',' )
            // InternalVampireLanguage.g:1801:2: ','
            {
             before(grammarAccess.getVLSIncludeAccess().getCommaKeyword_2_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVLSIncludeAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group_2_2__0__Impl"


    // $ANTLR start "rule__VLSInclude__Group_2_2__1"
    // InternalVampireLanguage.g:1810:1: rule__VLSInclude__Group_2_2__1 : rule__VLSInclude__Group_2_2__1__Impl ;
    public final void rule__VLSInclude__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1814:1: ( rule__VLSInclude__Group_2_2__1__Impl )
            // InternalVampireLanguage.g:1815:2: rule__VLSInclude__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSInclude__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group_2_2__1"


    // $ANTLR start "rule__VLSInclude__Group_2_2__1__Impl"
    // InternalVampireLanguage.g:1821:1: rule__VLSInclude__Group_2_2__1__Impl : ( ( rule__VLSInclude__NamesAssignment_2_2_1 ) ) ;
    public final void rule__VLSInclude__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1825:1: ( ( ( rule__VLSInclude__NamesAssignment_2_2_1 ) ) )
            // InternalVampireLanguage.g:1826:1: ( ( rule__VLSInclude__NamesAssignment_2_2_1 ) )
            {
            // InternalVampireLanguage.g:1826:1: ( ( rule__VLSInclude__NamesAssignment_2_2_1 ) )
            // InternalVampireLanguage.g:1827:2: ( rule__VLSInclude__NamesAssignment_2_2_1 )
            {
             before(grammarAccess.getVLSIncludeAccess().getNamesAssignment_2_2_1()); 
            // InternalVampireLanguage.g:1828:2: ( rule__VLSInclude__NamesAssignment_2_2_1 )
            // InternalVampireLanguage.g:1828:3: rule__VLSInclude__NamesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSInclude__NamesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSIncludeAccess().getNamesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__Group_2_2__1__Impl"


    // $ANTLR start "rule__VLSComment__Group__0"
    // InternalVampireLanguage.g:1837:1: rule__VLSComment__Group__0 : rule__VLSComment__Group__0__Impl rule__VLSComment__Group__1 ;
    public final void rule__VLSComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1841:1: ( rule__VLSComment__Group__0__Impl rule__VLSComment__Group__1 )
            // InternalVampireLanguage.g:1842:2: rule__VLSComment__Group__0__Impl rule__VLSComment__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__VLSComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSComment__Group__0"


    // $ANTLR start "rule__VLSComment__Group__0__Impl"
    // InternalVampireLanguage.g:1849:1: rule__VLSComment__Group__0__Impl : ( '%' ) ;
    public final void rule__VLSComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1853:1: ( ( '%' ) )
            // InternalVampireLanguage.g:1854:1: ( '%' )
            {
            // InternalVampireLanguage.g:1854:1: ( '%' )
            // InternalVampireLanguage.g:1855:2: '%'
            {
             before(grammarAccess.getVLSCommentAccess().getPercentSignKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getVLSCommentAccess().getPercentSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSComment__Group__0__Impl"


    // $ANTLR start "rule__VLSComment__Group__1"
    // InternalVampireLanguage.g:1864:1: rule__VLSComment__Group__1 : rule__VLSComment__Group__1__Impl ;
    public final void rule__VLSComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1868:1: ( rule__VLSComment__Group__1__Impl )
            // InternalVampireLanguage.g:1869:2: rule__VLSComment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSComment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSComment__Group__1"


    // $ANTLR start "rule__VLSComment__Group__1__Impl"
    // InternalVampireLanguage.g:1875:1: rule__VLSComment__Group__1__Impl : ( ( rule__VLSComment__CommentAssignment_1 ) ) ;
    public final void rule__VLSComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1879:1: ( ( ( rule__VLSComment__CommentAssignment_1 ) ) )
            // InternalVampireLanguage.g:1880:1: ( ( rule__VLSComment__CommentAssignment_1 ) )
            {
            // InternalVampireLanguage.g:1880:1: ( ( rule__VLSComment__CommentAssignment_1 ) )
            // InternalVampireLanguage.g:1881:2: ( rule__VLSComment__CommentAssignment_1 )
            {
             before(grammarAccess.getVLSCommentAccess().getCommentAssignment_1()); 
            // InternalVampireLanguage.g:1882:2: ( rule__VLSComment__CommentAssignment_1 )
            // InternalVampireLanguage.g:1882:3: rule__VLSComment__CommentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSComment__CommentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSCommentAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSComment__Group__1__Impl"


    // $ANTLR start "rule__VLSFofFormula__Group__0"
    // InternalVampireLanguage.g:1891:1: rule__VLSFofFormula__Group__0 : rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1 ;
    public final void rule__VLSFofFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1895:1: ( rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1 )
            // InternalVampireLanguage.g:1896:2: rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalVampireLanguage.g:1903:1: rule__VLSFofFormula__Group__0__Impl : ( 'fof' ) ;
    public final void rule__VLSFofFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1907:1: ( ( 'fof' ) )
            // InternalVampireLanguage.g:1908:1: ( 'fof' )
            {
            // InternalVampireLanguage.g:1908:1: ( 'fof' )
            // InternalVampireLanguage.g:1909:2: 'fof'
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalVampireLanguage.g:1918:1: rule__VLSFofFormula__Group__1 : rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2 ;
    public final void rule__VLSFofFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1922:1: ( rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2 )
            // InternalVampireLanguage.g:1923:2: rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalVampireLanguage.g:1930:1: rule__VLSFofFormula__Group__1__Impl : ( '(' ) ;
    public final void rule__VLSFofFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1934:1: ( ( '(' ) )
            // InternalVampireLanguage.g:1935:1: ( '(' )
            {
            // InternalVampireLanguage.g:1935:1: ( '(' )
            // InternalVampireLanguage.g:1936:2: '('
            {
             before(grammarAccess.getVLSFofFormulaAccess().getLeftParenthesisKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalVampireLanguage.g:1945:1: rule__VLSFofFormula__Group__2 : rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3 ;
    public final void rule__VLSFofFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1949:1: ( rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3 )
            // InternalVampireLanguage.g:1950:2: rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalVampireLanguage.g:1957:1: rule__VLSFofFormula__Group__2__Impl : ( ( rule__VLSFofFormula__NameAssignment_2 ) ) ;
    public final void rule__VLSFofFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1961:1: ( ( ( rule__VLSFofFormula__NameAssignment_2 ) ) )
            // InternalVampireLanguage.g:1962:1: ( ( rule__VLSFofFormula__NameAssignment_2 ) )
            {
            // InternalVampireLanguage.g:1962:1: ( ( rule__VLSFofFormula__NameAssignment_2 ) )
            // InternalVampireLanguage.g:1963:2: ( rule__VLSFofFormula__NameAssignment_2 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getNameAssignment_2()); 
            // InternalVampireLanguage.g:1964:2: ( rule__VLSFofFormula__NameAssignment_2 )
            // InternalVampireLanguage.g:1964:3: rule__VLSFofFormula__NameAssignment_2
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
    // InternalVampireLanguage.g:1972:1: rule__VLSFofFormula__Group__3 : rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4 ;
    public final void rule__VLSFofFormula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1976:1: ( rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4 )
            // InternalVampireLanguage.g:1977:2: rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalVampireLanguage.g:1984:1: rule__VLSFofFormula__Group__3__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1988:1: ( ( ',' ) )
            // InternalVampireLanguage.g:1989:1: ( ',' )
            {
            // InternalVampireLanguage.g:1989:1: ( ',' )
            // InternalVampireLanguage.g:1990:2: ','
            {
             before(grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalVampireLanguage.g:1999:1: rule__VLSFofFormula__Group__4 : rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5 ;
    public final void rule__VLSFofFormula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2003:1: ( rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5 )
            // InternalVampireLanguage.g:2004:2: rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalVampireLanguage.g:2011:1: rule__VLSFofFormula__Group__4__Impl : ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) ) ;
    public final void rule__VLSFofFormula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2015:1: ( ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) ) )
            // InternalVampireLanguage.g:2016:1: ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) )
            {
            // InternalVampireLanguage.g:2016:1: ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) )
            // InternalVampireLanguage.g:2017:2: ( rule__VLSFofFormula__FofRoleAssignment_4 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofRoleAssignment_4()); 
            // InternalVampireLanguage.g:2018:2: ( rule__VLSFofFormula__FofRoleAssignment_4 )
            // InternalVampireLanguage.g:2018:3: rule__VLSFofFormula__FofRoleAssignment_4
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
    // InternalVampireLanguage.g:2026:1: rule__VLSFofFormula__Group__5 : rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6 ;
    public final void rule__VLSFofFormula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2030:1: ( rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6 )
            // InternalVampireLanguage.g:2031:2: rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalVampireLanguage.g:2038:1: rule__VLSFofFormula__Group__5__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2042:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2043:1: ( ',' )
            {
            // InternalVampireLanguage.g:2043:1: ( ',' )
            // InternalVampireLanguage.g:2044:2: ','
            {
             before(grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_5()); 
            match(input,45,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2053:1: rule__VLSFofFormula__Group__6 : rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7 ;
    public final void rule__VLSFofFormula__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2057:1: ( rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7 )
            // InternalVampireLanguage.g:2058:2: rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalVampireLanguage.g:2065:1: rule__VLSFofFormula__Group__6__Impl : ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) ) ;
    public final void rule__VLSFofFormula__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2069:1: ( ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) ) )
            // InternalVampireLanguage.g:2070:1: ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) )
            {
            // InternalVampireLanguage.g:2070:1: ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) )
            // InternalVampireLanguage.g:2071:2: ( rule__VLSFofFormula__FofFormulaAssignment_6 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofFormulaAssignment_6()); 
            // InternalVampireLanguage.g:2072:2: ( rule__VLSFofFormula__FofFormulaAssignment_6 )
            // InternalVampireLanguage.g:2072:3: rule__VLSFofFormula__FofFormulaAssignment_6
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
    // InternalVampireLanguage.g:2080:1: rule__VLSFofFormula__Group__7 : rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8 ;
    public final void rule__VLSFofFormula__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2084:1: ( rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8 )
            // InternalVampireLanguage.g:2085:2: rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8
            {
            pushFollow(FOLLOW_17);
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
    // InternalVampireLanguage.g:2092:1: rule__VLSFofFormula__Group__7__Impl : ( ( rule__VLSFofFormula__Group_7__0 )? ) ;
    public final void rule__VLSFofFormula__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2096:1: ( ( ( rule__VLSFofFormula__Group_7__0 )? ) )
            // InternalVampireLanguage.g:2097:1: ( ( rule__VLSFofFormula__Group_7__0 )? )
            {
            // InternalVampireLanguage.g:2097:1: ( ( rule__VLSFofFormula__Group_7__0 )? )
            // InternalVampireLanguage.g:2098:2: ( rule__VLSFofFormula__Group_7__0 )?
            {
             before(grammarAccess.getVLSFofFormulaAccess().getGroup_7()); 
            // InternalVampireLanguage.g:2099:2: ( rule__VLSFofFormula__Group_7__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalVampireLanguage.g:2099:3: rule__VLSFofFormula__Group_7__0
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
    // InternalVampireLanguage.g:2107:1: rule__VLSFofFormula__Group__8 : rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9 ;
    public final void rule__VLSFofFormula__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2111:1: ( rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9 )
            // InternalVampireLanguage.g:2112:2: rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9
            {
            pushFollow(FOLLOW_18);
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
    // InternalVampireLanguage.g:2119:1: rule__VLSFofFormula__Group__8__Impl : ( ')' ) ;
    public final void rule__VLSFofFormula__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2123:1: ( ( ')' ) )
            // InternalVampireLanguage.g:2124:1: ( ')' )
            {
            // InternalVampireLanguage.g:2124:1: ( ')' )
            // InternalVampireLanguage.g:2125:2: ')'
            {
             before(grammarAccess.getVLSFofFormulaAccess().getRightParenthesisKeyword_8()); 
            match(input,49,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2134:1: rule__VLSFofFormula__Group__9 : rule__VLSFofFormula__Group__9__Impl ;
    public final void rule__VLSFofFormula__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2138:1: ( rule__VLSFofFormula__Group__9__Impl )
            // InternalVampireLanguage.g:2139:2: rule__VLSFofFormula__Group__9__Impl
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
    // InternalVampireLanguage.g:2145:1: rule__VLSFofFormula__Group__9__Impl : ( '.' ) ;
    public final void rule__VLSFofFormula__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2149:1: ( ( '.' ) )
            // InternalVampireLanguage.g:2150:1: ( '.' )
            {
            // InternalVampireLanguage.g:2150:1: ( '.' )
            // InternalVampireLanguage.g:2151:2: '.'
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFullStopKeyword_9()); 
            match(input,50,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2161:1: rule__VLSFofFormula__Group_7__0 : rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1 ;
    public final void rule__VLSFofFormula__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2165:1: ( rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1 )
            // InternalVampireLanguage.g:2166:2: rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalVampireLanguage.g:2173:1: rule__VLSFofFormula__Group_7__0__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2177:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2178:1: ( ',' )
            {
            // InternalVampireLanguage.g:2178:1: ( ',' )
            // InternalVampireLanguage.g:2179:2: ','
            {
             before(grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_7_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2188:1: rule__VLSFofFormula__Group_7__1 : rule__VLSFofFormula__Group_7__1__Impl ;
    public final void rule__VLSFofFormula__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2192:1: ( rule__VLSFofFormula__Group_7__1__Impl )
            // InternalVampireLanguage.g:2193:2: rule__VLSFofFormula__Group_7__1__Impl
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
    // InternalVampireLanguage.g:2199:1: rule__VLSFofFormula__Group_7__1__Impl : ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) ) ;
    public final void rule__VLSFofFormula__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2203:1: ( ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) ) )
            // InternalVampireLanguage.g:2204:1: ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) )
            {
            // InternalVampireLanguage.g:2204:1: ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) )
            // InternalVampireLanguage.g:2205:2: ( rule__VLSFofFormula__AnnotationsAssignment_7_1 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getAnnotationsAssignment_7_1()); 
            // InternalVampireLanguage.g:2206:2: ( rule__VLSFofFormula__AnnotationsAssignment_7_1 )
            // InternalVampireLanguage.g:2206:3: rule__VLSFofFormula__AnnotationsAssignment_7_1
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
    // InternalVampireLanguage.g:2215:1: rule__VLSAnnotation__Group__0 : rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1 ;
    public final void rule__VLSAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2219:1: ( rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1 )
            // InternalVampireLanguage.g:2220:2: rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalVampireLanguage.g:2227:1: rule__VLSAnnotation__Group__0__Impl : ( ( '[' )? ) ;
    public final void rule__VLSAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2231:1: ( ( ( '[' )? ) )
            // InternalVampireLanguage.g:2232:1: ( ( '[' )? )
            {
            // InternalVampireLanguage.g:2232:1: ( ( '[' )? )
            // InternalVampireLanguage.g:2233:2: ( '[' )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getLeftSquareBracketKeyword_0()); 
            // InternalVampireLanguage.g:2234:2: ( '[' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==51) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVampireLanguage.g:2234:3: '['
                    {
                    match(input,51,FOLLOW_2); 

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
    // InternalVampireLanguage.g:2242:1: rule__VLSAnnotation__Group__1 : rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2 ;
    public final void rule__VLSAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2246:1: ( rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2 )
            // InternalVampireLanguage.g:2247:2: rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalVampireLanguage.g:2254:1: rule__VLSAnnotation__Group__1__Impl : ( ( rule__VLSAnnotation__NameAssignment_1 )? ) ;
    public final void rule__VLSAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2258:1: ( ( ( rule__VLSAnnotation__NameAssignment_1 )? ) )
            // InternalVampireLanguage.g:2259:1: ( ( rule__VLSAnnotation__NameAssignment_1 )? )
            {
            // InternalVampireLanguage.g:2259:1: ( ( rule__VLSAnnotation__NameAssignment_1 )? )
            // InternalVampireLanguage.g:2260:2: ( rule__VLSAnnotation__NameAssignment_1 )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getNameAssignment_1()); 
            // InternalVampireLanguage.g:2261:2: ( rule__VLSAnnotation__NameAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_LOWER_WORD_ID && LA25_0<=RULE_SINGLE_QUOTE)||(LA25_0>=27 && LA25_0<=41)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVampireLanguage.g:2261:3: rule__VLSAnnotation__NameAssignment_1
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
    // InternalVampireLanguage.g:2269:1: rule__VLSAnnotation__Group__2 : rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3 ;
    public final void rule__VLSAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2273:1: ( rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3 )
            // InternalVampireLanguage.g:2274:2: rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalVampireLanguage.g:2281:1: rule__VLSAnnotation__Group__2__Impl : ( ( rule__VLSAnnotation__Group_2__0 )? ) ;
    public final void rule__VLSAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2285:1: ( ( ( rule__VLSAnnotation__Group_2__0 )? ) )
            // InternalVampireLanguage.g:2286:1: ( ( rule__VLSAnnotation__Group_2__0 )? )
            {
            // InternalVampireLanguage.g:2286:1: ( ( rule__VLSAnnotation__Group_2__0 )? )
            // InternalVampireLanguage.g:2287:2: ( rule__VLSAnnotation__Group_2__0 )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getGroup_2()); 
            // InternalVampireLanguage.g:2288:2: ( rule__VLSAnnotation__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==48) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVampireLanguage.g:2288:3: rule__VLSAnnotation__Group_2__0
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
    // InternalVampireLanguage.g:2296:1: rule__VLSAnnotation__Group__3 : rule__VLSAnnotation__Group__3__Impl ;
    public final void rule__VLSAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2300:1: ( rule__VLSAnnotation__Group__3__Impl )
            // InternalVampireLanguage.g:2301:2: rule__VLSAnnotation__Group__3__Impl
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
    // InternalVampireLanguage.g:2307:1: rule__VLSAnnotation__Group__3__Impl : ( ( ']' )? ) ;
    public final void rule__VLSAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2311:1: ( ( ( ']' )? ) )
            // InternalVampireLanguage.g:2312:1: ( ( ']' )? )
            {
            // InternalVampireLanguage.g:2312:1: ( ( ']' )? )
            // InternalVampireLanguage.g:2313:2: ( ']' )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getRightSquareBracketKeyword_3()); 
            // InternalVampireLanguage.g:2314:2: ( ']' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVampireLanguage.g:2314:3: ']'
                    {
                    match(input,44,FOLLOW_2); 

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
    // InternalVampireLanguage.g:2323:1: rule__VLSAnnotation__Group_2__0 : rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1 ;
    public final void rule__VLSAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2327:1: ( rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1 )
            // InternalVampireLanguage.g:2328:2: rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalVampireLanguage.g:2335:1: rule__VLSAnnotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__VLSAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2339:1: ( ( '(' ) )
            // InternalVampireLanguage.g:2340:1: ( '(' )
            {
            // InternalVampireLanguage.g:2340:1: ( '(' )
            // InternalVampireLanguage.g:2341:2: '('
            {
             before(grammarAccess.getVLSAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2350:1: rule__VLSAnnotation__Group_2__1 : rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2 ;
    public final void rule__VLSAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2354:1: ( rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2 )
            // InternalVampireLanguage.g:2355:2: rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalVampireLanguage.g:2362:1: rule__VLSAnnotation__Group_2__1__Impl : ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) ) ;
    public final void rule__VLSAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2366:1: ( ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) ) )
            // InternalVampireLanguage.g:2367:1: ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) )
            {
            // InternalVampireLanguage.g:2367:1: ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) )
            // InternalVampireLanguage.g:2368:2: ( rule__VLSAnnotation__FollowupAssignment_2_1 )
            {
             before(grammarAccess.getVLSAnnotationAccess().getFollowupAssignment_2_1()); 
            // InternalVampireLanguage.g:2369:2: ( rule__VLSAnnotation__FollowupAssignment_2_1 )
            // InternalVampireLanguage.g:2369:3: rule__VLSAnnotation__FollowupAssignment_2_1
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
    // InternalVampireLanguage.g:2377:1: rule__VLSAnnotation__Group_2__2 : rule__VLSAnnotation__Group_2__2__Impl ;
    public final void rule__VLSAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2381:1: ( rule__VLSAnnotation__Group_2__2__Impl )
            // InternalVampireLanguage.g:2382:2: rule__VLSAnnotation__Group_2__2__Impl
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
    // InternalVampireLanguage.g:2388:1: rule__VLSAnnotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__VLSAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2392:1: ( ( ')' ) )
            // InternalVampireLanguage.g:2393:1: ( ')' )
            {
            // InternalVampireLanguage.g:2393:1: ( ')' )
            // InternalVampireLanguage.g:2394:2: ')'
            {
             before(grammarAccess.getVLSAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2404:1: rule__VLSAnnotationTerms__Group__0 : rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1 ;
    public final void rule__VLSAnnotationTerms__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2408:1: ( rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1 )
            // InternalVampireLanguage.g:2409:2: rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalVampireLanguage.g:2416:1: rule__VLSAnnotationTerms__Group__0__Impl : ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) ) ;
    public final void rule__VLSAnnotationTerms__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2420:1: ( ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) ) )
            // InternalVampireLanguage.g:2421:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) )
            {
            // InternalVampireLanguage.g:2421:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) )
            // InternalVampireLanguage.g:2422:2: ( rule__VLSAnnotationTerms__TermsAssignment_0 )
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getTermsAssignment_0()); 
            // InternalVampireLanguage.g:2423:2: ( rule__VLSAnnotationTerms__TermsAssignment_0 )
            // InternalVampireLanguage.g:2423:3: rule__VLSAnnotationTerms__TermsAssignment_0
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
    // InternalVampireLanguage.g:2431:1: rule__VLSAnnotationTerms__Group__1 : rule__VLSAnnotationTerms__Group__1__Impl ;
    public final void rule__VLSAnnotationTerms__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2435:1: ( rule__VLSAnnotationTerms__Group__1__Impl )
            // InternalVampireLanguage.g:2436:2: rule__VLSAnnotationTerms__Group__1__Impl
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
    // InternalVampireLanguage.g:2442:1: rule__VLSAnnotationTerms__Group__1__Impl : ( ( rule__VLSAnnotationTerms__Group_1__0 )* ) ;
    public final void rule__VLSAnnotationTerms__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2446:1: ( ( ( rule__VLSAnnotationTerms__Group_1__0 )* ) )
            // InternalVampireLanguage.g:2447:1: ( ( rule__VLSAnnotationTerms__Group_1__0 )* )
            {
            // InternalVampireLanguage.g:2447:1: ( ( rule__VLSAnnotationTerms__Group_1__0 )* )
            // InternalVampireLanguage.g:2448:2: ( rule__VLSAnnotationTerms__Group_1__0 )*
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getGroup_1()); 
            // InternalVampireLanguage.g:2449:2: ( rule__VLSAnnotationTerms__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==45) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalVampireLanguage.g:2449:3: rule__VLSAnnotationTerms__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__VLSAnnotationTerms__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalVampireLanguage.g:2458:1: rule__VLSAnnotationTerms__Group_1__0 : rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1 ;
    public final void rule__VLSAnnotationTerms__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2462:1: ( rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1 )
            // InternalVampireLanguage.g:2463:2: rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalVampireLanguage.g:2470:1: rule__VLSAnnotationTerms__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VLSAnnotationTerms__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2474:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2475:1: ( ',' )
            {
            // InternalVampireLanguage.g:2475:1: ( ',' )
            // InternalVampireLanguage.g:2476:2: ','
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getCommaKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2485:1: rule__VLSAnnotationTerms__Group_1__1 : rule__VLSAnnotationTerms__Group_1__1__Impl ;
    public final void rule__VLSAnnotationTerms__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2489:1: ( rule__VLSAnnotationTerms__Group_1__1__Impl )
            // InternalVampireLanguage.g:2490:2: rule__VLSAnnotationTerms__Group_1__1__Impl
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
    // InternalVampireLanguage.g:2496:1: rule__VLSAnnotationTerms__Group_1__1__Impl : ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) ) ;
    public final void rule__VLSAnnotationTerms__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2500:1: ( ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:2501:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:2501:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) )
            // InternalVampireLanguage.g:2502:2: ( rule__VLSAnnotationTerms__TermsAssignment_1_1 )
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getTermsAssignment_1_1()); 
            // InternalVampireLanguage.g:2503:2: ( rule__VLSAnnotationTerms__TermsAssignment_1_1 )
            // InternalVampireLanguage.g:2503:3: rule__VLSAnnotationTerms__TermsAssignment_1_1
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
    // InternalVampireLanguage.g:2512:1: rule__VLSBinary__Group__0 : rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1 ;
    public final void rule__VLSBinary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2516:1: ( rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1 )
            // InternalVampireLanguage.g:2517:2: rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalVampireLanguage.g:2524:1: rule__VLSBinary__Group__0__Impl : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2528:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:2529:1: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:2529:1: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:2530:2: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:2539:1: rule__VLSBinary__Group__1 : rule__VLSBinary__Group__1__Impl ;
    public final void rule__VLSBinary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2543:1: ( rule__VLSBinary__Group__1__Impl )
            // InternalVampireLanguage.g:2544:2: rule__VLSBinary__Group__1__Impl
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
    // InternalVampireLanguage.g:2550:1: rule__VLSBinary__Group__1__Impl : ( ( rule__VLSBinary__Alternatives_1 )? ) ;
    public final void rule__VLSBinary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2554:1: ( ( ( rule__VLSBinary__Alternatives_1 )? ) )
            // InternalVampireLanguage.g:2555:1: ( ( rule__VLSBinary__Alternatives_1 )? )
            {
            // InternalVampireLanguage.g:2555:1: ( ( rule__VLSBinary__Alternatives_1 )? )
            // InternalVampireLanguage.g:2556:2: ( rule__VLSBinary__Alternatives_1 )?
            {
             before(grammarAccess.getVLSBinaryAccess().getAlternatives_1()); 
            // InternalVampireLanguage.g:2557:2: ( rule__VLSBinary__Alternatives_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=52 && LA29_0<=59)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVampireLanguage.g:2557:3: rule__VLSBinary__Alternatives_1
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
    // InternalVampireLanguage.g:2566:1: rule__VLSBinary__Group_1_0__0 : rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1 ;
    public final void rule__VLSBinary__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2570:1: ( rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1 )
            // InternalVampireLanguage.g:2571:2: rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalVampireLanguage.g:2578:1: rule__VLSBinary__Group_1_0__0__Impl : ( ( rule__VLSBinary__Alternatives_1_0_0 ) ) ;
    public final void rule__VLSBinary__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2582:1: ( ( ( rule__VLSBinary__Alternatives_1_0_0 ) ) )
            // InternalVampireLanguage.g:2583:1: ( ( rule__VLSBinary__Alternatives_1_0_0 ) )
            {
            // InternalVampireLanguage.g:2583:1: ( ( rule__VLSBinary__Alternatives_1_0_0 ) )
            // InternalVampireLanguage.g:2584:2: ( rule__VLSBinary__Alternatives_1_0_0 )
            {
             before(grammarAccess.getVLSBinaryAccess().getAlternatives_1_0_0()); 
            // InternalVampireLanguage.g:2585:2: ( rule__VLSBinary__Alternatives_1_0_0 )
            // InternalVampireLanguage.g:2585:3: rule__VLSBinary__Alternatives_1_0_0
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
    // InternalVampireLanguage.g:2593:1: rule__VLSBinary__Group_1_0__1 : rule__VLSBinary__Group_1_0__1__Impl ;
    public final void rule__VLSBinary__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2597:1: ( rule__VLSBinary__Group_1_0__1__Impl )
            // InternalVampireLanguage.g:2598:2: rule__VLSBinary__Group_1_0__1__Impl
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
    // InternalVampireLanguage.g:2604:1: rule__VLSBinary__Group_1_0__1__Impl : ( ( rule__VLSBinary__RightAssignment_1_0_1 ) ) ;
    public final void rule__VLSBinary__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2608:1: ( ( ( rule__VLSBinary__RightAssignment_1_0_1 ) ) )
            // InternalVampireLanguage.g:2609:1: ( ( rule__VLSBinary__RightAssignment_1_0_1 ) )
            {
            // InternalVampireLanguage.g:2609:1: ( ( rule__VLSBinary__RightAssignment_1_0_1 ) )
            // InternalVampireLanguage.g:2610:2: ( rule__VLSBinary__RightAssignment_1_0_1 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_0_1()); 
            // InternalVampireLanguage.g:2611:2: ( rule__VLSBinary__RightAssignment_1_0_1 )
            // InternalVampireLanguage.g:2611:3: rule__VLSBinary__RightAssignment_1_0_1
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
    // InternalVampireLanguage.g:2620:1: rule__VLSBinary__Group_1_0_0_0__0 : rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1 ;
    public final void rule__VLSBinary__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2624:1: ( rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1 )
            // InternalVampireLanguage.g:2625:2: rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVampireLanguage.g:2632:1: rule__VLSBinary__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2636:1: ( ( () ) )
            // InternalVampireLanguage.g:2637:1: ( () )
            {
            // InternalVampireLanguage.g:2637:1: ( () )
            // InternalVampireLanguage.g:2638:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSEquivalentLeftAction_1_0_0_0_0()); 
            // InternalVampireLanguage.g:2639:2: ()
            // InternalVampireLanguage.g:2639:3: 
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
    // InternalVampireLanguage.g:2647:1: rule__VLSBinary__Group_1_0_0_0__1 : rule__VLSBinary__Group_1_0_0_0__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2651:1: ( rule__VLSBinary__Group_1_0_0_0__1__Impl )
            // InternalVampireLanguage.g:2652:2: rule__VLSBinary__Group_1_0_0_0__1__Impl
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
    // InternalVampireLanguage.g:2658:1: rule__VLSBinary__Group_1_0_0_0__1__Impl : ( '<=>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2662:1: ( ( '<=>' ) )
            // InternalVampireLanguage.g:2663:1: ( '<=>' )
            {
            // InternalVampireLanguage.g:2663:1: ( '<=>' )
            // InternalVampireLanguage.g:2664:2: '<=>'
            {
             before(grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_0_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2674:1: rule__VLSBinary__Group_1_0_0_1__0 : rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1 ;
    public final void rule__VLSBinary__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2678:1: ( rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1 )
            // InternalVampireLanguage.g:2679:2: rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalVampireLanguage.g:2686:1: rule__VLSBinary__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2690:1: ( ( () ) )
            // InternalVampireLanguage.g:2691:1: ( () )
            {
            // InternalVampireLanguage.g:2691:1: ( () )
            // InternalVampireLanguage.g:2692:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSImpliesLeftAction_1_0_0_1_0()); 
            // InternalVampireLanguage.g:2693:2: ()
            // InternalVampireLanguage.g:2693:3: 
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
    // InternalVampireLanguage.g:2701:1: rule__VLSBinary__Group_1_0_0_1__1 : rule__VLSBinary__Group_1_0_0_1__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2705:1: ( rule__VLSBinary__Group_1_0_0_1__1__Impl )
            // InternalVampireLanguage.g:2706:2: rule__VLSBinary__Group_1_0_0_1__1__Impl
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
    // InternalVampireLanguage.g:2712:1: rule__VLSBinary__Group_1_0_0_1__1__Impl : ( '=>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2716:1: ( ( '=>' ) )
            // InternalVampireLanguage.g:2717:1: ( '=>' )
            {
            // InternalVampireLanguage.g:2717:1: ( '=>' )
            // InternalVampireLanguage.g:2718:2: '=>'
            {
             before(grammarAccess.getVLSBinaryAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2728:1: rule__VLSBinary__Group_1_0_0_2__0 : rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1 ;
    public final void rule__VLSBinary__Group_1_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2732:1: ( rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1 )
            // InternalVampireLanguage.g:2733:2: rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalVampireLanguage.g:2740:1: rule__VLSBinary__Group_1_0_0_2__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2744:1: ( ( () ) )
            // InternalVampireLanguage.g:2745:1: ( () )
            {
            // InternalVampireLanguage.g:2745:1: ( () )
            // InternalVampireLanguage.g:2746:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSRevImpliesLeftAction_1_0_0_2_0()); 
            // InternalVampireLanguage.g:2747:2: ()
            // InternalVampireLanguage.g:2747:3: 
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
    // InternalVampireLanguage.g:2755:1: rule__VLSBinary__Group_1_0_0_2__1 : rule__VLSBinary__Group_1_0_0_2__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2759:1: ( rule__VLSBinary__Group_1_0_0_2__1__Impl )
            // InternalVampireLanguage.g:2760:2: rule__VLSBinary__Group_1_0_0_2__1__Impl
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
    // InternalVampireLanguage.g:2766:1: rule__VLSBinary__Group_1_0_0_2__1__Impl : ( '<=' ) ;
    public final void rule__VLSBinary__Group_1_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2770:1: ( ( '<=' ) )
            // InternalVampireLanguage.g:2771:1: ( '<=' )
            {
            // InternalVampireLanguage.g:2771:1: ( '<=' )
            // InternalVampireLanguage.g:2772:2: '<='
            {
             before(grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignKeyword_1_0_0_2_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2782:1: rule__VLSBinary__Group_1_0_0_3__0 : rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1 ;
    public final void rule__VLSBinary__Group_1_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2786:1: ( rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1 )
            // InternalVampireLanguage.g:2787:2: rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalVampireLanguage.g:2794:1: rule__VLSBinary__Group_1_0_0_3__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2798:1: ( ( () ) )
            // InternalVampireLanguage.g:2799:1: ( () )
            {
            // InternalVampireLanguage.g:2799:1: ( () )
            // InternalVampireLanguage.g:2800:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSXnorLeftAction_1_0_0_3_0()); 
            // InternalVampireLanguage.g:2801:2: ()
            // InternalVampireLanguage.g:2801:3: 
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
    // InternalVampireLanguage.g:2809:1: rule__VLSBinary__Group_1_0_0_3__1 : rule__VLSBinary__Group_1_0_0_3__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2813:1: ( rule__VLSBinary__Group_1_0_0_3__1__Impl )
            // InternalVampireLanguage.g:2814:2: rule__VLSBinary__Group_1_0_0_3__1__Impl
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
    // InternalVampireLanguage.g:2820:1: rule__VLSBinary__Group_1_0_0_3__1__Impl : ( '<~>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2824:1: ( ( '<~>' ) )
            // InternalVampireLanguage.g:2825:1: ( '<~>' )
            {
            // InternalVampireLanguage.g:2825:1: ( '<~>' )
            // InternalVampireLanguage.g:2826:2: '<~>'
            {
             before(grammarAccess.getVLSBinaryAccess().getLessThanSignTildeGreaterThanSignKeyword_1_0_0_3_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2836:1: rule__VLSBinary__Group_1_0_0_4__0 : rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1 ;
    public final void rule__VLSBinary__Group_1_0_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2840:1: ( rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1 )
            // InternalVampireLanguage.g:2841:2: rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalVampireLanguage.g:2848:1: rule__VLSBinary__Group_1_0_0_4__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2852:1: ( ( () ) )
            // InternalVampireLanguage.g:2853:1: ( () )
            {
            // InternalVampireLanguage.g:2853:1: ( () )
            // InternalVampireLanguage.g:2854:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSNorLeftAction_1_0_0_4_0()); 
            // InternalVampireLanguage.g:2855:2: ()
            // InternalVampireLanguage.g:2855:3: 
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
    // InternalVampireLanguage.g:2863:1: rule__VLSBinary__Group_1_0_0_4__1 : rule__VLSBinary__Group_1_0_0_4__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2867:1: ( rule__VLSBinary__Group_1_0_0_4__1__Impl )
            // InternalVampireLanguage.g:2868:2: rule__VLSBinary__Group_1_0_0_4__1__Impl
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
    // InternalVampireLanguage.g:2874:1: rule__VLSBinary__Group_1_0_0_4__1__Impl : ( '~|' ) ;
    public final void rule__VLSBinary__Group_1_0_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2878:1: ( ( '~|' ) )
            // InternalVampireLanguage.g:2879:1: ( '~|' )
            {
            // InternalVampireLanguage.g:2879:1: ( '~|' )
            // InternalVampireLanguage.g:2880:2: '~|'
            {
             before(grammarAccess.getVLSBinaryAccess().getTildeVerticalLineKeyword_1_0_0_4_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2890:1: rule__VLSBinary__Group_1_0_0_5__0 : rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1 ;
    public final void rule__VLSBinary__Group_1_0_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2894:1: ( rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1 )
            // InternalVampireLanguage.g:2895:2: rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalVampireLanguage.g:2902:1: rule__VLSBinary__Group_1_0_0_5__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2906:1: ( ( () ) )
            // InternalVampireLanguage.g:2907:1: ( () )
            {
            // InternalVampireLanguage.g:2907:1: ( () )
            // InternalVampireLanguage.g:2908:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSNandLeftAction_1_0_0_5_0()); 
            // InternalVampireLanguage.g:2909:2: ()
            // InternalVampireLanguage.g:2909:3: 
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
    // InternalVampireLanguage.g:2917:1: rule__VLSBinary__Group_1_0_0_5__1 : rule__VLSBinary__Group_1_0_0_5__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2921:1: ( rule__VLSBinary__Group_1_0_0_5__1__Impl )
            // InternalVampireLanguage.g:2922:2: rule__VLSBinary__Group_1_0_0_5__1__Impl
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
    // InternalVampireLanguage.g:2928:1: rule__VLSBinary__Group_1_0_0_5__1__Impl : ( '~&' ) ;
    public final void rule__VLSBinary__Group_1_0_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2932:1: ( ( '~&' ) )
            // InternalVampireLanguage.g:2933:1: ( '~&' )
            {
            // InternalVampireLanguage.g:2933:1: ( '~&' )
            // InternalVampireLanguage.g:2934:2: '~&'
            {
             before(grammarAccess.getVLSBinaryAccess().getTildeAmpersandKeyword_1_0_0_5_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2944:1: rule__VLSBinary__Group_1_1__0 : rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1 ;
    public final void rule__VLSBinary__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2948:1: ( rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1 )
            // InternalVampireLanguage.g:2949:2: rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalVampireLanguage.g:2956:1: rule__VLSBinary__Group_1_1__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2960:1: ( ( () ) )
            // InternalVampireLanguage.g:2961:1: ( () )
            {
            // InternalVampireLanguage.g:2961:1: ( () )
            // InternalVampireLanguage.g:2962:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSAndLeftAction_1_1_0()); 
            // InternalVampireLanguage.g:2963:2: ()
            // InternalVampireLanguage.g:2963:3: 
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
    // InternalVampireLanguage.g:2971:1: rule__VLSBinary__Group_1_1__1 : rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2 ;
    public final void rule__VLSBinary__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2975:1: ( rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2 )
            // InternalVampireLanguage.g:2976:2: rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalVampireLanguage.g:2983:1: rule__VLSBinary__Group_1_1__1__Impl : ( '&' ) ;
    public final void rule__VLSBinary__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2987:1: ( ( '&' ) )
            // InternalVampireLanguage.g:2988:1: ( '&' )
            {
            // InternalVampireLanguage.g:2988:1: ( '&' )
            // InternalVampireLanguage.g:2989:2: '&'
            {
             before(grammarAccess.getVLSBinaryAccess().getAmpersandKeyword_1_1_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2998:1: rule__VLSBinary__Group_1_1__2 : rule__VLSBinary__Group_1_1__2__Impl ;
    public final void rule__VLSBinary__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3002:1: ( rule__VLSBinary__Group_1_1__2__Impl )
            // InternalVampireLanguage.g:3003:2: rule__VLSBinary__Group_1_1__2__Impl
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
    // InternalVampireLanguage.g:3009:1: rule__VLSBinary__Group_1_1__2__Impl : ( ( rule__VLSBinary__RightAssignment_1_1_2 ) ) ;
    public final void rule__VLSBinary__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3013:1: ( ( ( rule__VLSBinary__RightAssignment_1_1_2 ) ) )
            // InternalVampireLanguage.g:3014:1: ( ( rule__VLSBinary__RightAssignment_1_1_2 ) )
            {
            // InternalVampireLanguage.g:3014:1: ( ( rule__VLSBinary__RightAssignment_1_1_2 ) )
            // InternalVampireLanguage.g:3015:2: ( rule__VLSBinary__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_1_2()); 
            // InternalVampireLanguage.g:3016:2: ( rule__VLSBinary__RightAssignment_1_1_2 )
            // InternalVampireLanguage.g:3016:3: rule__VLSBinary__RightAssignment_1_1_2
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
    // InternalVampireLanguage.g:3025:1: rule__VLSBinary__Group_1_2__0 : rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1 ;
    public final void rule__VLSBinary__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3029:1: ( rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1 )
            // InternalVampireLanguage.g:3030:2: rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalVampireLanguage.g:3037:1: rule__VLSBinary__Group_1_2__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3041:1: ( ( () ) )
            // InternalVampireLanguage.g:3042:1: ( () )
            {
            // InternalVampireLanguage.g:3042:1: ( () )
            // InternalVampireLanguage.g:3043:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSOrLeftAction_1_2_0()); 
            // InternalVampireLanguage.g:3044:2: ()
            // InternalVampireLanguage.g:3044:3: 
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
    // InternalVampireLanguage.g:3052:1: rule__VLSBinary__Group_1_2__1 : rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2 ;
    public final void rule__VLSBinary__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3056:1: ( rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2 )
            // InternalVampireLanguage.g:3057:2: rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalVampireLanguage.g:3064:1: rule__VLSBinary__Group_1_2__1__Impl : ( '|' ) ;
    public final void rule__VLSBinary__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3068:1: ( ( '|' ) )
            // InternalVampireLanguage.g:3069:1: ( '|' )
            {
            // InternalVampireLanguage.g:3069:1: ( '|' )
            // InternalVampireLanguage.g:3070:2: '|'
            {
             before(grammarAccess.getVLSBinaryAccess().getVerticalLineKeyword_1_2_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3079:1: rule__VLSBinary__Group_1_2__2 : rule__VLSBinary__Group_1_2__2__Impl ;
    public final void rule__VLSBinary__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3083:1: ( rule__VLSBinary__Group_1_2__2__Impl )
            // InternalVampireLanguage.g:3084:2: rule__VLSBinary__Group_1_2__2__Impl
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
    // InternalVampireLanguage.g:3090:1: rule__VLSBinary__Group_1_2__2__Impl : ( ( rule__VLSBinary__RightAssignment_1_2_2 ) ) ;
    public final void rule__VLSBinary__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3094:1: ( ( ( rule__VLSBinary__RightAssignment_1_2_2 ) ) )
            // InternalVampireLanguage.g:3095:1: ( ( rule__VLSBinary__RightAssignment_1_2_2 ) )
            {
            // InternalVampireLanguage.g:3095:1: ( ( rule__VLSBinary__RightAssignment_1_2_2 ) )
            // InternalVampireLanguage.g:3096:2: ( rule__VLSBinary__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_2_2()); 
            // InternalVampireLanguage.g:3097:2: ( rule__VLSBinary__RightAssignment_1_2_2 )
            // InternalVampireLanguage.g:3097:3: rule__VLSBinary__RightAssignment_1_2_2
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
    // InternalVampireLanguage.g:3106:1: rule__VLSUnitaryFormula__Group_4__0 : rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1 ;
    public final void rule__VLSUnitaryFormula__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3110:1: ( rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1 )
            // InternalVampireLanguage.g:3111:2: rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalVampireLanguage.g:3118:1: rule__VLSUnitaryFormula__Group_4__0__Impl : ( '(' ) ;
    public final void rule__VLSUnitaryFormula__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3122:1: ( ( '(' ) )
            // InternalVampireLanguage.g:3123:1: ( '(' )
            {
            // InternalVampireLanguage.g:3123:1: ( '(' )
            // InternalVampireLanguage.g:3124:2: '('
            {
             before(grammarAccess.getVLSUnitaryFormulaAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3133:1: rule__VLSUnitaryFormula__Group_4__1 : rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2 ;
    public final void rule__VLSUnitaryFormula__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3137:1: ( rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2 )
            // InternalVampireLanguage.g:3138:2: rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalVampireLanguage.g:3145:1: rule__VLSUnitaryFormula__Group_4__1__Impl : ( ruleVLSTerm ) ;
    public final void rule__VLSUnitaryFormula__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3149:1: ( ( ruleVLSTerm ) )
            // InternalVampireLanguage.g:3150:1: ( ruleVLSTerm )
            {
            // InternalVampireLanguage.g:3150:1: ( ruleVLSTerm )
            // InternalVampireLanguage.g:3151:2: ruleVLSTerm
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
    // InternalVampireLanguage.g:3160:1: rule__VLSUnitaryFormula__Group_4__2 : rule__VLSUnitaryFormula__Group_4__2__Impl ;
    public final void rule__VLSUnitaryFormula__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3164:1: ( rule__VLSUnitaryFormula__Group_4__2__Impl )
            // InternalVampireLanguage.g:3165:2: rule__VLSUnitaryFormula__Group_4__2__Impl
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
    // InternalVampireLanguage.g:3171:1: rule__VLSUnitaryFormula__Group_4__2__Impl : ( ')' ) ;
    public final void rule__VLSUnitaryFormula__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3175:1: ( ( ')' ) )
            // InternalVampireLanguage.g:3176:1: ( ')' )
            {
            // InternalVampireLanguage.g:3176:1: ( ')' )
            // InternalVampireLanguage.g:3177:2: ')'
            {
             before(grammarAccess.getVLSUnitaryFormulaAccess().getRightParenthesisKeyword_4_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3187:1: rule__VLSUniversalQuantifier__Group__0 : rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1 ;
    public final void rule__VLSUniversalQuantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3191:1: ( rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1 )
            // InternalVampireLanguage.g:3192:2: rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalVampireLanguage.g:3199:1: rule__VLSUniversalQuantifier__Group__0__Impl : ( () ) ;
    public final void rule__VLSUniversalQuantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3203:1: ( ( () ) )
            // InternalVampireLanguage.g:3204:1: ( () )
            {
            // InternalVampireLanguage.g:3204:1: ( () )
            // InternalVampireLanguage.g:3205:2: ()
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVLSUniversalQuantifierAction_0()); 
            // InternalVampireLanguage.g:3206:2: ()
            // InternalVampireLanguage.g:3206:3: 
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
    // InternalVampireLanguage.g:3214:1: rule__VLSUniversalQuantifier__Group__1 : rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2 ;
    public final void rule__VLSUniversalQuantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3218:1: ( rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2 )
            // InternalVampireLanguage.g:3219:2: rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalVampireLanguage.g:3226:1: rule__VLSUniversalQuantifier__Group__1__Impl : ( ( rule__VLSUniversalQuantifier__Group_1__0 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3230:1: ( ( ( rule__VLSUniversalQuantifier__Group_1__0 ) ) )
            // InternalVampireLanguage.g:3231:1: ( ( rule__VLSUniversalQuantifier__Group_1__0 ) )
            {
            // InternalVampireLanguage.g:3231:1: ( ( rule__VLSUniversalQuantifier__Group_1__0 ) )
            // InternalVampireLanguage.g:3232:2: ( rule__VLSUniversalQuantifier__Group_1__0 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup_1()); 
            // InternalVampireLanguage.g:3233:2: ( rule__VLSUniversalQuantifier__Group_1__0 )
            // InternalVampireLanguage.g:3233:3: rule__VLSUniversalQuantifier__Group_1__0
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
    // InternalVampireLanguage.g:3241:1: rule__VLSUniversalQuantifier__Group__2 : rule__VLSUniversalQuantifier__Group__2__Impl ;
    public final void rule__VLSUniversalQuantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3245:1: ( rule__VLSUniversalQuantifier__Group__2__Impl )
            // InternalVampireLanguage.g:3246:2: rule__VLSUniversalQuantifier__Group__2__Impl
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
    // InternalVampireLanguage.g:3252:1: rule__VLSUniversalQuantifier__Group__2__Impl : ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3256:1: ( ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:3257:1: ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:3257:1: ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:3258:2: ( rule__VLSUniversalQuantifier__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:3259:2: ( rule__VLSUniversalQuantifier__OperandAssignment_2 )
            // InternalVampireLanguage.g:3259:3: rule__VLSUniversalQuantifier__OperandAssignment_2
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
    // InternalVampireLanguage.g:3268:1: rule__VLSUniversalQuantifier__Group_1__0 : rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1 ;
    public final void rule__VLSUniversalQuantifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3272:1: ( rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1 )
            // InternalVampireLanguage.g:3273:2: rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalVampireLanguage.g:3280:1: rule__VLSUniversalQuantifier__Group_1__0__Impl : ( '!' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3284:1: ( ( '!' ) )
            // InternalVampireLanguage.g:3285:1: ( '!' )
            {
            // InternalVampireLanguage.g:3285:1: ( '!' )
            // InternalVampireLanguage.g:3286:2: '!'
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getExclamationMarkKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3295:1: rule__VLSUniversalQuantifier__Group_1__1 : rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2 ;
    public final void rule__VLSUniversalQuantifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3299:1: ( rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2 )
            // InternalVampireLanguage.g:3300:2: rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalVampireLanguage.g:3307:1: rule__VLSUniversalQuantifier__Group_1__1__Impl : ( '[' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3311:1: ( ( '[' ) )
            // InternalVampireLanguage.g:3312:1: ( '[' )
            {
            // InternalVampireLanguage.g:3312:1: ( '[' )
            // InternalVampireLanguage.g:3313:2: '['
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3322:1: rule__VLSUniversalQuantifier__Group_1__2 : rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3 ;
    public final void rule__VLSUniversalQuantifier__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3326:1: ( rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3 )
            // InternalVampireLanguage.g:3327:2: rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalVampireLanguage.g:3334:1: rule__VLSUniversalQuantifier__Group_1__2__Impl : ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3338:1: ( ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) ) )
            // InternalVampireLanguage.g:3339:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) )
            {
            // InternalVampireLanguage.g:3339:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) )
            // InternalVampireLanguage.g:3340:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAssignment_1_2()); 
            // InternalVampireLanguage.g:3341:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 )
            // InternalVampireLanguage.g:3341:3: rule__VLSUniversalQuantifier__VariablesAssignment_1_2
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
    // InternalVampireLanguage.g:3349:1: rule__VLSUniversalQuantifier__Group_1__3 : rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4 ;
    public final void rule__VLSUniversalQuantifier__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3353:1: ( rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4 )
            // InternalVampireLanguage.g:3354:2: rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalVampireLanguage.g:3361:1: rule__VLSUniversalQuantifier__Group_1__3__Impl : ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3365:1: ( ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* ) )
            // InternalVampireLanguage.g:3366:1: ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* )
            {
            // InternalVampireLanguage.g:3366:1: ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* )
            // InternalVampireLanguage.g:3367:2: ( rule__VLSUniversalQuantifier__Group_1_3__0 )*
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup_1_3()); 
            // InternalVampireLanguage.g:3368:2: ( rule__VLSUniversalQuantifier__Group_1_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==45) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalVampireLanguage.g:3368:3: rule__VLSUniversalQuantifier__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__VLSUniversalQuantifier__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalVampireLanguage.g:3376:1: rule__VLSUniversalQuantifier__Group_1__4 : rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5 ;
    public final void rule__VLSUniversalQuantifier__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3380:1: ( rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5 )
            // InternalVampireLanguage.g:3381:2: rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalVampireLanguage.g:3388:1: rule__VLSUniversalQuantifier__Group_1__4__Impl : ( ']' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3392:1: ( ( ']' ) )
            // InternalVampireLanguage.g:3393:1: ( ']' )
            {
            // InternalVampireLanguage.g:3393:1: ( ']' )
            // InternalVampireLanguage.g:3394:2: ']'
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,44,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3403:1: rule__VLSUniversalQuantifier__Group_1__5 : rule__VLSUniversalQuantifier__Group_1__5__Impl ;
    public final void rule__VLSUniversalQuantifier__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3407:1: ( rule__VLSUniversalQuantifier__Group_1__5__Impl )
            // InternalVampireLanguage.g:3408:2: rule__VLSUniversalQuantifier__Group_1__5__Impl
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
    // InternalVampireLanguage.g:3414:1: rule__VLSUniversalQuantifier__Group_1__5__Impl : ( ':' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3418:1: ( ( ':' ) )
            // InternalVampireLanguage.g:3419:1: ( ':' )
            {
            // InternalVampireLanguage.g:3419:1: ( ':' )
            // InternalVampireLanguage.g:3420:2: ':'
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getColonKeyword_1_5()); 
            match(input,61,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3430:1: rule__VLSUniversalQuantifier__Group_1_3__0 : rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1 ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3434:1: ( rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1 )
            // InternalVampireLanguage.g:3435:2: rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalVampireLanguage.g:3442:1: rule__VLSUniversalQuantifier__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3446:1: ( ( ',' ) )
            // InternalVampireLanguage.g:3447:1: ( ',' )
            {
            // InternalVampireLanguage.g:3447:1: ( ',' )
            // InternalVampireLanguage.g:3448:2: ','
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getCommaKeyword_1_3_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3457:1: rule__VLSUniversalQuantifier__Group_1_3__1 : rule__VLSUniversalQuantifier__Group_1_3__1__Impl ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3461:1: ( rule__VLSUniversalQuantifier__Group_1_3__1__Impl )
            // InternalVampireLanguage.g:3462:2: rule__VLSUniversalQuantifier__Group_1_3__1__Impl
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
    // InternalVampireLanguage.g:3468:1: rule__VLSUniversalQuantifier__Group_1_3__1__Impl : ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3472:1: ( ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) ) )
            // InternalVampireLanguage.g:3473:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) )
            {
            // InternalVampireLanguage.g:3473:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) )
            // InternalVampireLanguage.g:3474:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAssignment_1_3_1()); 
            // InternalVampireLanguage.g:3475:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 )
            // InternalVampireLanguage.g:3475:3: rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1
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
    // InternalVampireLanguage.g:3484:1: rule__VLSExistentialQuantifier__Group__0 : rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1 ;
    public final void rule__VLSExistentialQuantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3488:1: ( rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1 )
            // InternalVampireLanguage.g:3489:2: rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalVampireLanguage.g:3496:1: rule__VLSExistentialQuantifier__Group__0__Impl : ( () ) ;
    public final void rule__VLSExistentialQuantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3500:1: ( ( () ) )
            // InternalVampireLanguage.g:3501:1: ( () )
            {
            // InternalVampireLanguage.g:3501:1: ( () )
            // InternalVampireLanguage.g:3502:2: ()
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVLSExistentialQuantifierAction_0()); 
            // InternalVampireLanguage.g:3503:2: ()
            // InternalVampireLanguage.g:3503:3: 
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
    // InternalVampireLanguage.g:3511:1: rule__VLSExistentialQuantifier__Group__1 : rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2 ;
    public final void rule__VLSExistentialQuantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3515:1: ( rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2 )
            // InternalVampireLanguage.g:3516:2: rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalVampireLanguage.g:3523:1: rule__VLSExistentialQuantifier__Group__1__Impl : ( ( rule__VLSExistentialQuantifier__Group_1__0 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3527:1: ( ( ( rule__VLSExistentialQuantifier__Group_1__0 ) ) )
            // InternalVampireLanguage.g:3528:1: ( ( rule__VLSExistentialQuantifier__Group_1__0 ) )
            {
            // InternalVampireLanguage.g:3528:1: ( ( rule__VLSExistentialQuantifier__Group_1__0 ) )
            // InternalVampireLanguage.g:3529:2: ( rule__VLSExistentialQuantifier__Group_1__0 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup_1()); 
            // InternalVampireLanguage.g:3530:2: ( rule__VLSExistentialQuantifier__Group_1__0 )
            // InternalVampireLanguage.g:3530:3: rule__VLSExistentialQuantifier__Group_1__0
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
    // InternalVampireLanguage.g:3538:1: rule__VLSExistentialQuantifier__Group__2 : rule__VLSExistentialQuantifier__Group__2__Impl ;
    public final void rule__VLSExistentialQuantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3542:1: ( rule__VLSExistentialQuantifier__Group__2__Impl )
            // InternalVampireLanguage.g:3543:2: rule__VLSExistentialQuantifier__Group__2__Impl
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
    // InternalVampireLanguage.g:3549:1: rule__VLSExistentialQuantifier__Group__2__Impl : ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3553:1: ( ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:3554:1: ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:3554:1: ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:3555:2: ( rule__VLSExistentialQuantifier__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:3556:2: ( rule__VLSExistentialQuantifier__OperandAssignment_2 )
            // InternalVampireLanguage.g:3556:3: rule__VLSExistentialQuantifier__OperandAssignment_2
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
    // InternalVampireLanguage.g:3565:1: rule__VLSExistentialQuantifier__Group_1__0 : rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1 ;
    public final void rule__VLSExistentialQuantifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3569:1: ( rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1 )
            // InternalVampireLanguage.g:3570:2: rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalVampireLanguage.g:3577:1: rule__VLSExistentialQuantifier__Group_1__0__Impl : ( '?' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3581:1: ( ( '?' ) )
            // InternalVampireLanguage.g:3582:1: ( '?' )
            {
            // InternalVampireLanguage.g:3582:1: ( '?' )
            // InternalVampireLanguage.g:3583:2: '?'
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getQuestionMarkKeyword_1_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3592:1: rule__VLSExistentialQuantifier__Group_1__1 : rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2 ;
    public final void rule__VLSExistentialQuantifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3596:1: ( rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2 )
            // InternalVampireLanguage.g:3597:2: rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalVampireLanguage.g:3604:1: rule__VLSExistentialQuantifier__Group_1__1__Impl : ( '[' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3608:1: ( ( '[' ) )
            // InternalVampireLanguage.g:3609:1: ( '[' )
            {
            // InternalVampireLanguage.g:3609:1: ( '[' )
            // InternalVampireLanguage.g:3610:2: '['
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3619:1: rule__VLSExistentialQuantifier__Group_1__2 : rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3 ;
    public final void rule__VLSExistentialQuantifier__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3623:1: ( rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3 )
            // InternalVampireLanguage.g:3624:2: rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalVampireLanguage.g:3631:1: rule__VLSExistentialQuantifier__Group_1__2__Impl : ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3635:1: ( ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) ) )
            // InternalVampireLanguage.g:3636:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) )
            {
            // InternalVampireLanguage.g:3636:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) )
            // InternalVampireLanguage.g:3637:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAssignment_1_2()); 
            // InternalVampireLanguage.g:3638:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 )
            // InternalVampireLanguage.g:3638:3: rule__VLSExistentialQuantifier__VariablesAssignment_1_2
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
    // InternalVampireLanguage.g:3646:1: rule__VLSExistentialQuantifier__Group_1__3 : rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4 ;
    public final void rule__VLSExistentialQuantifier__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3650:1: ( rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4 )
            // InternalVampireLanguage.g:3651:2: rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalVampireLanguage.g:3658:1: rule__VLSExistentialQuantifier__Group_1__3__Impl : ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3662:1: ( ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* ) )
            // InternalVampireLanguage.g:3663:1: ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* )
            {
            // InternalVampireLanguage.g:3663:1: ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* )
            // InternalVampireLanguage.g:3664:2: ( rule__VLSExistentialQuantifier__Group_1_3__0 )*
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup_1_3()); 
            // InternalVampireLanguage.g:3665:2: ( rule__VLSExistentialQuantifier__Group_1_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==45) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalVampireLanguage.g:3665:3: rule__VLSExistentialQuantifier__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__VLSExistentialQuantifier__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalVampireLanguage.g:3673:1: rule__VLSExistentialQuantifier__Group_1__4 : rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5 ;
    public final void rule__VLSExistentialQuantifier__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3677:1: ( rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5 )
            // InternalVampireLanguage.g:3678:2: rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalVampireLanguage.g:3685:1: rule__VLSExistentialQuantifier__Group_1__4__Impl : ( ']' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3689:1: ( ( ']' ) )
            // InternalVampireLanguage.g:3690:1: ( ']' )
            {
            // InternalVampireLanguage.g:3690:1: ( ']' )
            // InternalVampireLanguage.g:3691:2: ']'
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,44,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3700:1: rule__VLSExistentialQuantifier__Group_1__5 : rule__VLSExistentialQuantifier__Group_1__5__Impl ;
    public final void rule__VLSExistentialQuantifier__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3704:1: ( rule__VLSExistentialQuantifier__Group_1__5__Impl )
            // InternalVampireLanguage.g:3705:2: rule__VLSExistentialQuantifier__Group_1__5__Impl
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
    // InternalVampireLanguage.g:3711:1: rule__VLSExistentialQuantifier__Group_1__5__Impl : ( ':' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3715:1: ( ( ':' ) )
            // InternalVampireLanguage.g:3716:1: ( ':' )
            {
            // InternalVampireLanguage.g:3716:1: ( ':' )
            // InternalVampireLanguage.g:3717:2: ':'
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getColonKeyword_1_5()); 
            match(input,61,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3727:1: rule__VLSExistentialQuantifier__Group_1_3__0 : rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1 ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3731:1: ( rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1 )
            // InternalVampireLanguage.g:3732:2: rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalVampireLanguage.g:3739:1: rule__VLSExistentialQuantifier__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3743:1: ( ( ',' ) )
            // InternalVampireLanguage.g:3744:1: ( ',' )
            {
            // InternalVampireLanguage.g:3744:1: ( ',' )
            // InternalVampireLanguage.g:3745:2: ','
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getCommaKeyword_1_3_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3754:1: rule__VLSExistentialQuantifier__Group_1_3__1 : rule__VLSExistentialQuantifier__Group_1_3__1__Impl ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3758:1: ( rule__VLSExistentialQuantifier__Group_1_3__1__Impl )
            // InternalVampireLanguage.g:3759:2: rule__VLSExistentialQuantifier__Group_1_3__1__Impl
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
    // InternalVampireLanguage.g:3765:1: rule__VLSExistentialQuantifier__Group_1_3__1__Impl : ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3769:1: ( ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) ) )
            // InternalVampireLanguage.g:3770:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) )
            {
            // InternalVampireLanguage.g:3770:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) )
            // InternalVampireLanguage.g:3771:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAssignment_1_3_1()); 
            // InternalVampireLanguage.g:3772:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 )
            // InternalVampireLanguage.g:3772:3: rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1
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
    // InternalVampireLanguage.g:3781:1: rule__VLSUnaryNegation__Group__0 : rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1 ;
    public final void rule__VLSUnaryNegation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3785:1: ( rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1 )
            // InternalVampireLanguage.g:3786:2: rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalVampireLanguage.g:3793:1: rule__VLSUnaryNegation__Group__0__Impl : ( () ) ;
    public final void rule__VLSUnaryNegation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3797:1: ( ( () ) )
            // InternalVampireLanguage.g:3798:1: ( () )
            {
            // InternalVampireLanguage.g:3798:1: ( () )
            // InternalVampireLanguage.g:3799:2: ()
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getVLSUnaryNegationAction_0()); 
            // InternalVampireLanguage.g:3800:2: ()
            // InternalVampireLanguage.g:3800:3: 
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
    // InternalVampireLanguage.g:3808:1: rule__VLSUnaryNegation__Group__1 : rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2 ;
    public final void rule__VLSUnaryNegation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3812:1: ( rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2 )
            // InternalVampireLanguage.g:3813:2: rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalVampireLanguage.g:3820:1: rule__VLSUnaryNegation__Group__1__Impl : ( '~' ) ;
    public final void rule__VLSUnaryNegation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3824:1: ( ( '~' ) )
            // InternalVampireLanguage.g:3825:1: ( '~' )
            {
            // InternalVampireLanguage.g:3825:1: ( '~' )
            // InternalVampireLanguage.g:3826:2: '~'
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getTildeKeyword_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3835:1: rule__VLSUnaryNegation__Group__2 : rule__VLSUnaryNegation__Group__2__Impl ;
    public final void rule__VLSUnaryNegation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3839:1: ( rule__VLSUnaryNegation__Group__2__Impl )
            // InternalVampireLanguage.g:3840:2: rule__VLSUnaryNegation__Group__2__Impl
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
    // InternalVampireLanguage.g:3846:1: rule__VLSUnaryNegation__Group__2__Impl : ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) ) ;
    public final void rule__VLSUnaryNegation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3850:1: ( ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:3851:1: ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:3851:1: ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:3852:2: ( rule__VLSUnaryNegation__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:3853:2: ( rule__VLSUnaryNegation__OperandAssignment_2 )
            // InternalVampireLanguage.g:3853:3: rule__VLSUnaryNegation__OperandAssignment_2
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
    // InternalVampireLanguage.g:3862:1: rule__VLSUnaryInfix__Group__0 : rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1 ;
    public final void rule__VLSUnaryInfix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3866:1: ( rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1 )
            // InternalVampireLanguage.g:3867:2: rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalVampireLanguage.g:3874:1: rule__VLSUnaryInfix__Group__0__Impl : ( ruleVLSAtomic ) ;
    public final void rule__VLSUnaryInfix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3878:1: ( ( ruleVLSAtomic ) )
            // InternalVampireLanguage.g:3879:1: ( ruleVLSAtomic )
            {
            // InternalVampireLanguage.g:3879:1: ( ruleVLSAtomic )
            // InternalVampireLanguage.g:3880:2: ruleVLSAtomic
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
    // InternalVampireLanguage.g:3889:1: rule__VLSUnaryInfix__Group__1 : rule__VLSUnaryInfix__Group__1__Impl ;
    public final void rule__VLSUnaryInfix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3893:1: ( rule__VLSUnaryInfix__Group__1__Impl )
            // InternalVampireLanguage.g:3894:2: rule__VLSUnaryInfix__Group__1__Impl
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
    // InternalVampireLanguage.g:3900:1: rule__VLSUnaryInfix__Group__1__Impl : ( ( rule__VLSUnaryInfix__Group_1__0 )? ) ;
    public final void rule__VLSUnaryInfix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3904:1: ( ( ( rule__VLSUnaryInfix__Group_1__0 )? ) )
            // InternalVampireLanguage.g:3905:1: ( ( rule__VLSUnaryInfix__Group_1__0 )? )
            {
            // InternalVampireLanguage.g:3905:1: ( ( rule__VLSUnaryInfix__Group_1__0 )? )
            // InternalVampireLanguage.g:3906:2: ( rule__VLSUnaryInfix__Group_1__0 )?
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1()); 
            // InternalVampireLanguage.g:3907:2: ( rule__VLSUnaryInfix__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=64 && LA32_0<=66)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalVampireLanguage.g:3907:3: rule__VLSUnaryInfix__Group_1__0
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
    // InternalVampireLanguage.g:3916:1: rule__VLSUnaryInfix__Group_1__0 : rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1 ;
    public final void rule__VLSUnaryInfix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3920:1: ( rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1 )
            // InternalVampireLanguage.g:3921:2: rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalVampireLanguage.g:3928:1: rule__VLSUnaryInfix__Group_1__0__Impl : ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) ) ;
    public final void rule__VLSUnaryInfix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3932:1: ( ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) ) )
            // InternalVampireLanguage.g:3933:1: ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) )
            {
            // InternalVampireLanguage.g:3933:1: ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) )
            // InternalVampireLanguage.g:3934:2: ( rule__VLSUnaryInfix__Alternatives_1_0 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getAlternatives_1_0()); 
            // InternalVampireLanguage.g:3935:2: ( rule__VLSUnaryInfix__Alternatives_1_0 )
            // InternalVampireLanguage.g:3935:3: rule__VLSUnaryInfix__Alternatives_1_0
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
    // InternalVampireLanguage.g:3943:1: rule__VLSUnaryInfix__Group_1__1 : rule__VLSUnaryInfix__Group_1__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3947:1: ( rule__VLSUnaryInfix__Group_1__1__Impl )
            // InternalVampireLanguage.g:3948:2: rule__VLSUnaryInfix__Group_1__1__Impl
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
    // InternalVampireLanguage.g:3954:1: rule__VLSUnaryInfix__Group_1__1__Impl : ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) ) ;
    public final void rule__VLSUnaryInfix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3958:1: ( ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:3959:1: ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:3959:1: ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) )
            // InternalVampireLanguage.g:3960:2: ( rule__VLSUnaryInfix__RightAssignment_1_1 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getRightAssignment_1_1()); 
            // InternalVampireLanguage.g:3961:2: ( rule__VLSUnaryInfix__RightAssignment_1_1 )
            // InternalVampireLanguage.g:3961:3: rule__VLSUnaryInfix__RightAssignment_1_1
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
    // InternalVampireLanguage.g:3970:1: rule__VLSUnaryInfix__Group_1_0_0__0 : rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3974:1: ( rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1 )
            // InternalVampireLanguage.g:3975:2: rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalVampireLanguage.g:3982:1: rule__VLSUnaryInfix__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3986:1: ( ( () ) )
            // InternalVampireLanguage.g:3987:1: ( () )
            {
            // InternalVampireLanguage.g:3987:1: ( () )
            // InternalVampireLanguage.g:3988:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSInequalityLeftAction_1_0_0_0()); 
            // InternalVampireLanguage.g:3989:2: ()
            // InternalVampireLanguage.g:3989:3: 
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
    // InternalVampireLanguage.g:3997:1: rule__VLSUnaryInfix__Group_1_0_0__1 : rule__VLSUnaryInfix__Group_1_0_0__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4001:1: ( rule__VLSUnaryInfix__Group_1_0_0__1__Impl )
            // InternalVampireLanguage.g:4002:2: rule__VLSUnaryInfix__Group_1_0_0__1__Impl
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
    // InternalVampireLanguage.g:4008:1: rule__VLSUnaryInfix__Group_1_0_0__1__Impl : ( '!=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4012:1: ( ( '!=' ) )
            // InternalVampireLanguage.g:4013:1: ( '!=' )
            {
            // InternalVampireLanguage.g:4013:1: ( '!=' )
            // InternalVampireLanguage.g:4014:2: '!='
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1()); 
            match(input,64,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4024:1: rule__VLSUnaryInfix__Group_1_0_1__0 : rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4028:1: ( rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1 )
            // InternalVampireLanguage.g:4029:2: rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalVampireLanguage.g:4036:1: rule__VLSUnaryInfix__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4040:1: ( ( () ) )
            // InternalVampireLanguage.g:4041:1: ( () )
            {
            // InternalVampireLanguage.g:4041:1: ( () )
            // InternalVampireLanguage.g:4042:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSEqualityLeftAction_1_0_1_0()); 
            // InternalVampireLanguage.g:4043:2: ()
            // InternalVampireLanguage.g:4043:3: 
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
    // InternalVampireLanguage.g:4051:1: rule__VLSUnaryInfix__Group_1_0_1__1 : rule__VLSUnaryInfix__Group_1_0_1__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4055:1: ( rule__VLSUnaryInfix__Group_1_0_1__1__Impl )
            // InternalVampireLanguage.g:4056:2: rule__VLSUnaryInfix__Group_1_0_1__1__Impl
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
    // InternalVampireLanguage.g:4062:1: rule__VLSUnaryInfix__Group_1_0_1__1__Impl : ( '=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4066:1: ( ( '=' ) )
            // InternalVampireLanguage.g:4067:1: ( '=' )
            {
            // InternalVampireLanguage.g:4067:1: ( '=' )
            // InternalVampireLanguage.g:4068:2: '='
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getEqualsSignKeyword_1_0_1_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4078:1: rule__VLSUnaryInfix__Group_1_0_2__0 : rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4082:1: ( rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1 )
            // InternalVampireLanguage.g:4083:2: rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalVampireLanguage.g:4090:1: rule__VLSUnaryInfix__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4094:1: ( ( () ) )
            // InternalVampireLanguage.g:4095:1: ( () )
            {
            // InternalVampireLanguage.g:4095:1: ( () )
            // InternalVampireLanguage.g:4096:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSAssignmentLeftAction_1_0_2_0()); 
            // InternalVampireLanguage.g:4097:2: ()
            // InternalVampireLanguage.g:4097:3: 
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
    // InternalVampireLanguage.g:4105:1: rule__VLSUnaryInfix__Group_1_0_2__1 : rule__VLSUnaryInfix__Group_1_0_2__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4109:1: ( rule__VLSUnaryInfix__Group_1_0_2__1__Impl )
            // InternalVampireLanguage.g:4110:2: rule__VLSUnaryInfix__Group_1_0_2__1__Impl
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
    // InternalVampireLanguage.g:4116:1: rule__VLSUnaryInfix__Group_1_0_2__1__Impl : ( ':=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4120:1: ( ( ':=' ) )
            // InternalVampireLanguage.g:4121:1: ( ':=' )
            {
            // InternalVampireLanguage.g:4121:1: ( ':=' )
            // InternalVampireLanguage.g:4122:2: ':='
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getColonEqualsSignKeyword_1_0_2_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4132:1: rule__VLSAtomicConstant__Group_0__0 : rule__VLSAtomicConstant__Group_0__0__Impl rule__VLSAtomicConstant__Group_0__1 ;
    public final void rule__VLSAtomicConstant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4136:1: ( rule__VLSAtomicConstant__Group_0__0__Impl rule__VLSAtomicConstant__Group_0__1 )
            // InternalVampireLanguage.g:4137:2: rule__VLSAtomicConstant__Group_0__0__Impl rule__VLSAtomicConstant__Group_0__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalVampireLanguage.g:4144:1: rule__VLSAtomicConstant__Group_0__0__Impl : ( () ) ;
    public final void rule__VLSAtomicConstant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4148:1: ( ( () ) )
            // InternalVampireLanguage.g:4149:1: ( () )
            {
            // InternalVampireLanguage.g:4149:1: ( () )
            // InternalVampireLanguage.g:4150:2: ()
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getVLSConstantAction_0_0()); 
            // InternalVampireLanguage.g:4151:2: ()
            // InternalVampireLanguage.g:4151:3: 
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
    // InternalVampireLanguage.g:4159:1: rule__VLSAtomicConstant__Group_0__1 : rule__VLSAtomicConstant__Group_0__1__Impl ;
    public final void rule__VLSAtomicConstant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4163:1: ( rule__VLSAtomicConstant__Group_0__1__Impl )
            // InternalVampireLanguage.g:4164:2: rule__VLSAtomicConstant__Group_0__1__Impl
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
    // InternalVampireLanguage.g:4170:1: rule__VLSAtomicConstant__Group_0__1__Impl : ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) ) ;
    public final void rule__VLSAtomicConstant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4174:1: ( ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) ) )
            // InternalVampireLanguage.g:4175:1: ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) )
            {
            // InternalVampireLanguage.g:4175:1: ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) )
            // InternalVampireLanguage.g:4176:2: ( rule__VLSAtomicConstant__NameAssignment_0_1 )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getNameAssignment_0_1()); 
            // InternalVampireLanguage.g:4177:2: ( rule__VLSAtomicConstant__NameAssignment_0_1 )
            // InternalVampireLanguage.g:4177:3: rule__VLSAtomicConstant__NameAssignment_0_1
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
    // InternalVampireLanguage.g:4186:1: rule__VLSAtomicConstant__Group_1__0 : rule__VLSAtomicConstant__Group_1__0__Impl rule__VLSAtomicConstant__Group_1__1 ;
    public final void rule__VLSAtomicConstant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4190:1: ( rule__VLSAtomicConstant__Group_1__0__Impl rule__VLSAtomicConstant__Group_1__1 )
            // InternalVampireLanguage.g:4191:2: rule__VLSAtomicConstant__Group_1__0__Impl rule__VLSAtomicConstant__Group_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalVampireLanguage.g:4198:1: rule__VLSAtomicConstant__Group_1__0__Impl : ( () ) ;
    public final void rule__VLSAtomicConstant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4202:1: ( ( () ) )
            // InternalVampireLanguage.g:4203:1: ( () )
            {
            // InternalVampireLanguage.g:4203:1: ( () )
            // InternalVampireLanguage.g:4204:2: ()
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getVLSTrueAction_1_0()); 
            // InternalVampireLanguage.g:4205:2: ()
            // InternalVampireLanguage.g:4205:3: 
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
    // InternalVampireLanguage.g:4213:1: rule__VLSAtomicConstant__Group_1__1 : rule__VLSAtomicConstant__Group_1__1__Impl ;
    public final void rule__VLSAtomicConstant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4217:1: ( rule__VLSAtomicConstant__Group_1__1__Impl )
            // InternalVampireLanguage.g:4218:2: rule__VLSAtomicConstant__Group_1__1__Impl
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
    // InternalVampireLanguage.g:4224:1: rule__VLSAtomicConstant__Group_1__1__Impl : ( '$true' ) ;
    public final void rule__VLSAtomicConstant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4228:1: ( ( '$true' ) )
            // InternalVampireLanguage.g:4229:1: ( '$true' )
            {
            // InternalVampireLanguage.g:4229:1: ( '$true' )
            // InternalVampireLanguage.g:4230:2: '$true'
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getTrueKeyword_1_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getVLSAtomicConstantAccess().getTrueKeyword_1_1()); 

            }


            }

        }
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
    // InternalVampireLanguage.g:4240:1: rule__VLSAtomicConstant__Group_2__0 : rule__VLSAtomicConstant__Group_2__0__Impl rule__VLSAtomicConstant__Group_2__1 ;
    public final void rule__VLSAtomicConstant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4244:1: ( rule__VLSAtomicConstant__Group_2__0__Impl rule__VLSAtomicConstant__Group_2__1 )
            // InternalVampireLanguage.g:4245:2: rule__VLSAtomicConstant__Group_2__0__Impl rule__VLSAtomicConstant__Group_2__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalVampireLanguage.g:4252:1: rule__VLSAtomicConstant__Group_2__0__Impl : ( () ) ;
    public final void rule__VLSAtomicConstant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4256:1: ( ( () ) )
            // InternalVampireLanguage.g:4257:1: ( () )
            {
            // InternalVampireLanguage.g:4257:1: ( () )
            // InternalVampireLanguage.g:4258:2: ()
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getVLSFalseAction_2_0()); 
            // InternalVampireLanguage.g:4259:2: ()
            // InternalVampireLanguage.g:4259:3: 
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
    // InternalVampireLanguage.g:4267:1: rule__VLSAtomicConstant__Group_2__1 : rule__VLSAtomicConstant__Group_2__1__Impl ;
    public final void rule__VLSAtomicConstant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4271:1: ( rule__VLSAtomicConstant__Group_2__1__Impl )
            // InternalVampireLanguage.g:4272:2: rule__VLSAtomicConstant__Group_2__1__Impl
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
    // InternalVampireLanguage.g:4278:1: rule__VLSAtomicConstant__Group_2__1__Impl : ( '$false' ) ;
    public final void rule__VLSAtomicConstant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4282:1: ( ( '$false' ) )
            // InternalVampireLanguage.g:4283:1: ( '$false' )
            {
            // InternalVampireLanguage.g:4283:1: ( '$false' )
            // InternalVampireLanguage.g:4284:2: '$false'
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getFalseKeyword_2_1()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getVLSAtomicConstantAccess().getFalseKeyword_2_1()); 

            }


            }

        }
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
    // InternalVampireLanguage.g:4294:1: rule__VLSAtomicFunction__Group_0__0 : rule__VLSAtomicFunction__Group_0__0__Impl rule__VLSAtomicFunction__Group_0__1 ;
    public final void rule__VLSAtomicFunction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4298:1: ( rule__VLSAtomicFunction__Group_0__0__Impl rule__VLSAtomicFunction__Group_0__1 )
            // InternalVampireLanguage.g:4299:2: rule__VLSAtomicFunction__Group_0__0__Impl rule__VLSAtomicFunction__Group_0__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalVampireLanguage.g:4306:1: rule__VLSAtomicFunction__Group_0__0__Impl : ( () ) ;
    public final void rule__VLSAtomicFunction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4310:1: ( ( () ) )
            // InternalVampireLanguage.g:4311:1: ( () )
            {
            // InternalVampireLanguage.g:4311:1: ( () )
            // InternalVampireLanguage.g:4312:2: ()
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getVLSFunctionAction_0_0()); 
            // InternalVampireLanguage.g:4313:2: ()
            // InternalVampireLanguage.g:4313:3: 
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
    // InternalVampireLanguage.g:4321:1: rule__VLSAtomicFunction__Group_0__1 : rule__VLSAtomicFunction__Group_0__1__Impl rule__VLSAtomicFunction__Group_0__2 ;
    public final void rule__VLSAtomicFunction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4325:1: ( rule__VLSAtomicFunction__Group_0__1__Impl rule__VLSAtomicFunction__Group_0__2 )
            // InternalVampireLanguage.g:4326:2: rule__VLSAtomicFunction__Group_0__1__Impl rule__VLSAtomicFunction__Group_0__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalVampireLanguage.g:4333:1: rule__VLSAtomicFunction__Group_0__1__Impl : ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4337:1: ( ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) ) )
            // InternalVampireLanguage.g:4338:1: ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) )
            {
            // InternalVampireLanguage.g:4338:1: ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) )
            // InternalVampireLanguage.g:4339:2: ( rule__VLSAtomicFunction__ConstantAssignment_0_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getConstantAssignment_0_1()); 
            // InternalVampireLanguage.g:4340:2: ( rule__VLSAtomicFunction__ConstantAssignment_0_1 )
            // InternalVampireLanguage.g:4340:3: rule__VLSAtomicFunction__ConstantAssignment_0_1
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
    // InternalVampireLanguage.g:4348:1: rule__VLSAtomicFunction__Group_0__2 : rule__VLSAtomicFunction__Group_0__2__Impl ;
    public final void rule__VLSAtomicFunction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4352:1: ( rule__VLSAtomicFunction__Group_0__2__Impl )
            // InternalVampireLanguage.g:4353:2: rule__VLSAtomicFunction__Group_0__2__Impl
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
    // InternalVampireLanguage.g:4359:1: rule__VLSAtomicFunction__Group_0__2__Impl : ( ( rule__VLSAtomicFunction__Group_0_2__0 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4363:1: ( ( ( rule__VLSAtomicFunction__Group_0_2__0 ) ) )
            // InternalVampireLanguage.g:4364:1: ( ( rule__VLSAtomicFunction__Group_0_2__0 ) )
            {
            // InternalVampireLanguage.g:4364:1: ( ( rule__VLSAtomicFunction__Group_0_2__0 ) )
            // InternalVampireLanguage.g:4365:2: ( rule__VLSAtomicFunction__Group_0_2__0 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0_2()); 
            // InternalVampireLanguage.g:4366:2: ( rule__VLSAtomicFunction__Group_0_2__0 )
            // InternalVampireLanguage.g:4366:3: rule__VLSAtomicFunction__Group_0_2__0
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
    // InternalVampireLanguage.g:4375:1: rule__VLSAtomicFunction__Group_0_2__0 : rule__VLSAtomicFunction__Group_0_2__0__Impl rule__VLSAtomicFunction__Group_0_2__1 ;
    public final void rule__VLSAtomicFunction__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4379:1: ( rule__VLSAtomicFunction__Group_0_2__0__Impl rule__VLSAtomicFunction__Group_0_2__1 )
            // InternalVampireLanguage.g:4380:2: rule__VLSAtomicFunction__Group_0_2__0__Impl rule__VLSAtomicFunction__Group_0_2__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalVampireLanguage.g:4387:1: rule__VLSAtomicFunction__Group_0_2__0__Impl : ( '(' ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4391:1: ( ( '(' ) )
            // InternalVampireLanguage.g:4392:1: ( '(' )
            {
            // InternalVampireLanguage.g:4392:1: ( '(' )
            // InternalVampireLanguage.g:4393:2: '('
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getLeftParenthesisKeyword_0_2_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4402:1: rule__VLSAtomicFunction__Group_0_2__1 : rule__VLSAtomicFunction__Group_0_2__1__Impl rule__VLSAtomicFunction__Group_0_2__2 ;
    public final void rule__VLSAtomicFunction__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4406:1: ( rule__VLSAtomicFunction__Group_0_2__1__Impl rule__VLSAtomicFunction__Group_0_2__2 )
            // InternalVampireLanguage.g:4407:2: rule__VLSAtomicFunction__Group_0_2__1__Impl rule__VLSAtomicFunction__Group_0_2__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalVampireLanguage.g:4414:1: rule__VLSAtomicFunction__Group_0_2__1__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4418:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) ) )
            // InternalVampireLanguage.g:4419:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) )
            {
            // InternalVampireLanguage.g:4419:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) )
            // InternalVampireLanguage.g:4420:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_0_2_1()); 
            // InternalVampireLanguage.g:4421:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 )
            // InternalVampireLanguage.g:4421:3: rule__VLSAtomicFunction__TermsAssignment_0_2_1
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
    // InternalVampireLanguage.g:4429:1: rule__VLSAtomicFunction__Group_0_2__2 : rule__VLSAtomicFunction__Group_0_2__2__Impl rule__VLSAtomicFunction__Group_0_2__3 ;
    public final void rule__VLSAtomicFunction__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4433:1: ( rule__VLSAtomicFunction__Group_0_2__2__Impl rule__VLSAtomicFunction__Group_0_2__3 )
            // InternalVampireLanguage.g:4434:2: rule__VLSAtomicFunction__Group_0_2__2__Impl rule__VLSAtomicFunction__Group_0_2__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalVampireLanguage.g:4441:1: rule__VLSAtomicFunction__Group_0_2__2__Impl : ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4445:1: ( ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* ) )
            // InternalVampireLanguage.g:4446:1: ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* )
            {
            // InternalVampireLanguage.g:4446:1: ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* )
            // InternalVampireLanguage.g:4447:2: ( rule__VLSAtomicFunction__Group_0_2_2__0 )*
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0_2_2()); 
            // InternalVampireLanguage.g:4448:2: ( rule__VLSAtomicFunction__Group_0_2_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==45) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalVampireLanguage.g:4448:3: rule__VLSAtomicFunction__Group_0_2_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__VLSAtomicFunction__Group_0_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalVampireLanguage.g:4456:1: rule__VLSAtomicFunction__Group_0_2__3 : rule__VLSAtomicFunction__Group_0_2__3__Impl ;
    public final void rule__VLSAtomicFunction__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4460:1: ( rule__VLSAtomicFunction__Group_0_2__3__Impl )
            // InternalVampireLanguage.g:4461:2: rule__VLSAtomicFunction__Group_0_2__3__Impl
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
    // InternalVampireLanguage.g:4467:1: rule__VLSAtomicFunction__Group_0_2__3__Impl : ( ')' ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4471:1: ( ( ')' ) )
            // InternalVampireLanguage.g:4472:1: ( ')' )
            {
            // InternalVampireLanguage.g:4472:1: ( ')' )
            // InternalVampireLanguage.g:4473:2: ')'
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getRightParenthesisKeyword_0_2_3()); 
            match(input,49,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4483:1: rule__VLSAtomicFunction__Group_0_2_2__0 : rule__VLSAtomicFunction__Group_0_2_2__0__Impl rule__VLSAtomicFunction__Group_0_2_2__1 ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4487:1: ( rule__VLSAtomicFunction__Group_0_2_2__0__Impl rule__VLSAtomicFunction__Group_0_2_2__1 )
            // InternalVampireLanguage.g:4488:2: rule__VLSAtomicFunction__Group_0_2_2__0__Impl rule__VLSAtomicFunction__Group_0_2_2__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalVampireLanguage.g:4495:1: rule__VLSAtomicFunction__Group_0_2_2__0__Impl : ( ',' ) ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4499:1: ( ( ',' ) )
            // InternalVampireLanguage.g:4500:1: ( ',' )
            {
            // InternalVampireLanguage.g:4500:1: ( ',' )
            // InternalVampireLanguage.g:4501:2: ','
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getCommaKeyword_0_2_2_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4510:1: rule__VLSAtomicFunction__Group_0_2_2__1 : rule__VLSAtomicFunction__Group_0_2_2__1__Impl ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4514:1: ( rule__VLSAtomicFunction__Group_0_2_2__1__Impl )
            // InternalVampireLanguage.g:4515:2: rule__VLSAtomicFunction__Group_0_2_2__1__Impl
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
    // InternalVampireLanguage.g:4521:1: rule__VLSAtomicFunction__Group_0_2_2__1__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4525:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) ) )
            // InternalVampireLanguage.g:4526:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) )
            {
            // InternalVampireLanguage.g:4526:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) )
            // InternalVampireLanguage.g:4527:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_0_2_2_1()); 
            // InternalVampireLanguage.g:4528:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 )
            // InternalVampireLanguage.g:4528:3: rule__VLSAtomicFunction__TermsAssignment_0_2_2_1
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
    // InternalVampireLanguage.g:4537:1: rule__VLSAtomicFunction__Group_1__0 : rule__VLSAtomicFunction__Group_1__0__Impl rule__VLSAtomicFunction__Group_1__1 ;
    public final void rule__VLSAtomicFunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4541:1: ( rule__VLSAtomicFunction__Group_1__0__Impl rule__VLSAtomicFunction__Group_1__1 )
            // InternalVampireLanguage.g:4542:2: rule__VLSAtomicFunction__Group_1__0__Impl rule__VLSAtomicFunction__Group_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalVampireLanguage.g:4549:1: rule__VLSAtomicFunction__Group_1__0__Impl : ( () ) ;
    public final void rule__VLSAtomicFunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4553:1: ( ( () ) )
            // InternalVampireLanguage.g:4554:1: ( () )
            {
            // InternalVampireLanguage.g:4554:1: ( () )
            // InternalVampireLanguage.g:4555:2: ()
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getVLSLessAction_1_0()); 
            // InternalVampireLanguage.g:4556:2: ()
            // InternalVampireLanguage.g:4556:3: 
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
    // InternalVampireLanguage.g:4564:1: rule__VLSAtomicFunction__Group_1__1 : rule__VLSAtomicFunction__Group_1__1__Impl rule__VLSAtomicFunction__Group_1__2 ;
    public final void rule__VLSAtomicFunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4568:1: ( rule__VLSAtomicFunction__Group_1__1__Impl rule__VLSAtomicFunction__Group_1__2 )
            // InternalVampireLanguage.g:4569:2: rule__VLSAtomicFunction__Group_1__1__Impl rule__VLSAtomicFunction__Group_1__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalVampireLanguage.g:4576:1: rule__VLSAtomicFunction__Group_1__1__Impl : ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4580:1: ( ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:4581:1: ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:4581:1: ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) )
            // InternalVampireLanguage.g:4582:2: ( rule__VLSAtomicFunction__NameAssignment_1_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getNameAssignment_1_1()); 
            // InternalVampireLanguage.g:4583:2: ( rule__VLSAtomicFunction__NameAssignment_1_1 )
            // InternalVampireLanguage.g:4583:3: rule__VLSAtomicFunction__NameAssignment_1_1
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
    // InternalVampireLanguage.g:4591:1: rule__VLSAtomicFunction__Group_1__2 : rule__VLSAtomicFunction__Group_1__2__Impl rule__VLSAtomicFunction__Group_1__3 ;
    public final void rule__VLSAtomicFunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4595:1: ( rule__VLSAtomicFunction__Group_1__2__Impl rule__VLSAtomicFunction__Group_1__3 )
            // InternalVampireLanguage.g:4596:2: rule__VLSAtomicFunction__Group_1__2__Impl rule__VLSAtomicFunction__Group_1__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalVampireLanguage.g:4603:1: rule__VLSAtomicFunction__Group_1__2__Impl : ( '(' ) ;
    public final void rule__VLSAtomicFunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4607:1: ( ( '(' ) )
            // InternalVampireLanguage.g:4608:1: ( '(' )
            {
            // InternalVampireLanguage.g:4608:1: ( '(' )
            // InternalVampireLanguage.g:4609:2: '('
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,48,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4618:1: rule__VLSAtomicFunction__Group_1__3 : rule__VLSAtomicFunction__Group_1__3__Impl rule__VLSAtomicFunction__Group_1__4 ;
    public final void rule__VLSAtomicFunction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4622:1: ( rule__VLSAtomicFunction__Group_1__3__Impl rule__VLSAtomicFunction__Group_1__4 )
            // InternalVampireLanguage.g:4623:2: rule__VLSAtomicFunction__Group_1__3__Impl rule__VLSAtomicFunction__Group_1__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalVampireLanguage.g:4630:1: rule__VLSAtomicFunction__Group_1__3__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) ) ;
    public final void rule__VLSAtomicFunction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4634:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) ) )
            // InternalVampireLanguage.g:4635:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) )
            {
            // InternalVampireLanguage.g:4635:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) )
            // InternalVampireLanguage.g:4636:2: ( rule__VLSAtomicFunction__TermsAssignment_1_3 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_1_3()); 
            // InternalVampireLanguage.g:4637:2: ( rule__VLSAtomicFunction__TermsAssignment_1_3 )
            // InternalVampireLanguage.g:4637:3: rule__VLSAtomicFunction__TermsAssignment_1_3
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
    // InternalVampireLanguage.g:4645:1: rule__VLSAtomicFunction__Group_1__4 : rule__VLSAtomicFunction__Group_1__4__Impl rule__VLSAtomicFunction__Group_1__5 ;
    public final void rule__VLSAtomicFunction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4649:1: ( rule__VLSAtomicFunction__Group_1__4__Impl rule__VLSAtomicFunction__Group_1__5 )
            // InternalVampireLanguage.g:4650:2: rule__VLSAtomicFunction__Group_1__4__Impl rule__VLSAtomicFunction__Group_1__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalVampireLanguage.g:4657:1: rule__VLSAtomicFunction__Group_1__4__Impl : ( ',' ) ;
    public final void rule__VLSAtomicFunction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4661:1: ( ( ',' ) )
            // InternalVampireLanguage.g:4662:1: ( ',' )
            {
            // InternalVampireLanguage.g:4662:1: ( ',' )
            // InternalVampireLanguage.g:4663:2: ','
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getCommaKeyword_1_4()); 
            match(input,45,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4672:1: rule__VLSAtomicFunction__Group_1__5 : rule__VLSAtomicFunction__Group_1__5__Impl rule__VLSAtomicFunction__Group_1__6 ;
    public final void rule__VLSAtomicFunction__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4676:1: ( rule__VLSAtomicFunction__Group_1__5__Impl rule__VLSAtomicFunction__Group_1__6 )
            // InternalVampireLanguage.g:4677:2: rule__VLSAtomicFunction__Group_1__5__Impl rule__VLSAtomicFunction__Group_1__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalVampireLanguage.g:4684:1: rule__VLSAtomicFunction__Group_1__5__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) ) ;
    public final void rule__VLSAtomicFunction__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4688:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) ) )
            // InternalVampireLanguage.g:4689:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) )
            {
            // InternalVampireLanguage.g:4689:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) )
            // InternalVampireLanguage.g:4690:2: ( rule__VLSAtomicFunction__TermsAssignment_1_5 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_1_5()); 
            // InternalVampireLanguage.g:4691:2: ( rule__VLSAtomicFunction__TermsAssignment_1_5 )
            // InternalVampireLanguage.g:4691:3: rule__VLSAtomicFunction__TermsAssignment_1_5
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
    // InternalVampireLanguage.g:4699:1: rule__VLSAtomicFunction__Group_1__6 : rule__VLSAtomicFunction__Group_1__6__Impl ;
    public final void rule__VLSAtomicFunction__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4703:1: ( rule__VLSAtomicFunction__Group_1__6__Impl )
            // InternalVampireLanguage.g:4704:2: rule__VLSAtomicFunction__Group_1__6__Impl
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
    // InternalVampireLanguage.g:4710:1: rule__VLSAtomicFunction__Group_1__6__Impl : ( ')' ) ;
    public final void rule__VLSAtomicFunction__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4714:1: ( ( ')' ) )
            // InternalVampireLanguage.g:4715:1: ( ')' )
            {
            // InternalVampireLanguage.g:4715:1: ( ')' )
            // InternalVampireLanguage.g:4716:2: ')'
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getRightParenthesisKeyword_1_6()); 
            match(input,49,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4726:1: rule__VLSFunctionFof__Group__0 : rule__VLSFunctionFof__Group__0__Impl rule__VLSFunctionFof__Group__1 ;
    public final void rule__VLSFunctionFof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4730:1: ( rule__VLSFunctionFof__Group__0__Impl rule__VLSFunctionFof__Group__1 )
            // InternalVampireLanguage.g:4731:2: rule__VLSFunctionFof__Group__0__Impl rule__VLSFunctionFof__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalVampireLanguage.g:4738:1: rule__VLSFunctionFof__Group__0__Impl : ( ( rule__VLSFunctionFof__FunctorAssignment_0 ) ) ;
    public final void rule__VLSFunctionFof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4742:1: ( ( ( rule__VLSFunctionFof__FunctorAssignment_0 ) ) )
            // InternalVampireLanguage.g:4743:1: ( ( rule__VLSFunctionFof__FunctorAssignment_0 ) )
            {
            // InternalVampireLanguage.g:4743:1: ( ( rule__VLSFunctionFof__FunctorAssignment_0 ) )
            // InternalVampireLanguage.g:4744:2: ( rule__VLSFunctionFof__FunctorAssignment_0 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getFunctorAssignment_0()); 
            // InternalVampireLanguage.g:4745:2: ( rule__VLSFunctionFof__FunctorAssignment_0 )
            // InternalVampireLanguage.g:4745:3: rule__VLSFunctionFof__FunctorAssignment_0
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
    // InternalVampireLanguage.g:4753:1: rule__VLSFunctionFof__Group__1 : rule__VLSFunctionFof__Group__1__Impl ;
    public final void rule__VLSFunctionFof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4757:1: ( rule__VLSFunctionFof__Group__1__Impl )
            // InternalVampireLanguage.g:4758:2: rule__VLSFunctionFof__Group__1__Impl
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
    // InternalVampireLanguage.g:4764:1: rule__VLSFunctionFof__Group__1__Impl : ( ( rule__VLSFunctionFof__Group_1__0 )? ) ;
    public final void rule__VLSFunctionFof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4768:1: ( ( ( rule__VLSFunctionFof__Group_1__0 )? ) )
            // InternalVampireLanguage.g:4769:1: ( ( rule__VLSFunctionFof__Group_1__0 )? )
            {
            // InternalVampireLanguage.g:4769:1: ( ( rule__VLSFunctionFof__Group_1__0 )? )
            // InternalVampireLanguage.g:4770:2: ( rule__VLSFunctionFof__Group_1__0 )?
            {
             before(grammarAccess.getVLSFunctionFofAccess().getGroup_1()); 
            // InternalVampireLanguage.g:4771:2: ( rule__VLSFunctionFof__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==48) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVampireLanguage.g:4771:3: rule__VLSFunctionFof__Group_1__0
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
    // InternalVampireLanguage.g:4780:1: rule__VLSFunctionFof__Group_1__0 : rule__VLSFunctionFof__Group_1__0__Impl rule__VLSFunctionFof__Group_1__1 ;
    public final void rule__VLSFunctionFof__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4784:1: ( rule__VLSFunctionFof__Group_1__0__Impl rule__VLSFunctionFof__Group_1__1 )
            // InternalVampireLanguage.g:4785:2: rule__VLSFunctionFof__Group_1__0__Impl rule__VLSFunctionFof__Group_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalVampireLanguage.g:4792:1: rule__VLSFunctionFof__Group_1__0__Impl : ( '(' ) ;
    public final void rule__VLSFunctionFof__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4796:1: ( ( '(' ) )
            // InternalVampireLanguage.g:4797:1: ( '(' )
            {
            // InternalVampireLanguage.g:4797:1: ( '(' )
            // InternalVampireLanguage.g:4798:2: '('
            {
             before(grammarAccess.getVLSFunctionFofAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4807:1: rule__VLSFunctionFof__Group_1__1 : rule__VLSFunctionFof__Group_1__1__Impl rule__VLSFunctionFof__Group_1__2 ;
    public final void rule__VLSFunctionFof__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4811:1: ( rule__VLSFunctionFof__Group_1__1__Impl rule__VLSFunctionFof__Group_1__2 )
            // InternalVampireLanguage.g:4812:2: rule__VLSFunctionFof__Group_1__1__Impl rule__VLSFunctionFof__Group_1__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalVampireLanguage.g:4819:1: rule__VLSFunctionFof__Group_1__1__Impl : ( ( rule__VLSFunctionFof__TermsAssignment_1_1 ) ) ;
    public final void rule__VLSFunctionFof__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4823:1: ( ( ( rule__VLSFunctionFof__TermsAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:4824:1: ( ( rule__VLSFunctionFof__TermsAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:4824:1: ( ( rule__VLSFunctionFof__TermsAssignment_1_1 ) )
            // InternalVampireLanguage.g:4825:2: ( rule__VLSFunctionFof__TermsAssignment_1_1 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getTermsAssignment_1_1()); 
            // InternalVampireLanguage.g:4826:2: ( rule__VLSFunctionFof__TermsAssignment_1_1 )
            // InternalVampireLanguage.g:4826:3: rule__VLSFunctionFof__TermsAssignment_1_1
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
    // InternalVampireLanguage.g:4834:1: rule__VLSFunctionFof__Group_1__2 : rule__VLSFunctionFof__Group_1__2__Impl rule__VLSFunctionFof__Group_1__3 ;
    public final void rule__VLSFunctionFof__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4838:1: ( rule__VLSFunctionFof__Group_1__2__Impl rule__VLSFunctionFof__Group_1__3 )
            // InternalVampireLanguage.g:4839:2: rule__VLSFunctionFof__Group_1__2__Impl rule__VLSFunctionFof__Group_1__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalVampireLanguage.g:4846:1: rule__VLSFunctionFof__Group_1__2__Impl : ( ( rule__VLSFunctionFof__Group_1_2__0 )* ) ;
    public final void rule__VLSFunctionFof__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4850:1: ( ( ( rule__VLSFunctionFof__Group_1_2__0 )* ) )
            // InternalVampireLanguage.g:4851:1: ( ( rule__VLSFunctionFof__Group_1_2__0 )* )
            {
            // InternalVampireLanguage.g:4851:1: ( ( rule__VLSFunctionFof__Group_1_2__0 )* )
            // InternalVampireLanguage.g:4852:2: ( rule__VLSFunctionFof__Group_1_2__0 )*
            {
             before(grammarAccess.getVLSFunctionFofAccess().getGroup_1_2()); 
            // InternalVampireLanguage.g:4853:2: ( rule__VLSFunctionFof__Group_1_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==45) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalVampireLanguage.g:4853:3: rule__VLSFunctionFof__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__VLSFunctionFof__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalVampireLanguage.g:4861:1: rule__VLSFunctionFof__Group_1__3 : rule__VLSFunctionFof__Group_1__3__Impl ;
    public final void rule__VLSFunctionFof__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4865:1: ( rule__VLSFunctionFof__Group_1__3__Impl )
            // InternalVampireLanguage.g:4866:2: rule__VLSFunctionFof__Group_1__3__Impl
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
    // InternalVampireLanguage.g:4872:1: rule__VLSFunctionFof__Group_1__3__Impl : ( ')' ) ;
    public final void rule__VLSFunctionFof__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4876:1: ( ( ')' ) )
            // InternalVampireLanguage.g:4877:1: ( ')' )
            {
            // InternalVampireLanguage.g:4877:1: ( ')' )
            // InternalVampireLanguage.g:4878:2: ')'
            {
             before(grammarAccess.getVLSFunctionFofAccess().getRightParenthesisKeyword_1_3()); 
            match(input,49,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4888:1: rule__VLSFunctionFof__Group_1_2__0 : rule__VLSFunctionFof__Group_1_2__0__Impl rule__VLSFunctionFof__Group_1_2__1 ;
    public final void rule__VLSFunctionFof__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4892:1: ( rule__VLSFunctionFof__Group_1_2__0__Impl rule__VLSFunctionFof__Group_1_2__1 )
            // InternalVampireLanguage.g:4893:2: rule__VLSFunctionFof__Group_1_2__0__Impl rule__VLSFunctionFof__Group_1_2__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalVampireLanguage.g:4900:1: rule__VLSFunctionFof__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__VLSFunctionFof__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4904:1: ( ( ',' ) )
            // InternalVampireLanguage.g:4905:1: ( ',' )
            {
            // InternalVampireLanguage.g:4905:1: ( ',' )
            // InternalVampireLanguage.g:4906:2: ','
            {
             before(grammarAccess.getVLSFunctionFofAccess().getCommaKeyword_1_2_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4915:1: rule__VLSFunctionFof__Group_1_2__1 : rule__VLSFunctionFof__Group_1_2__1__Impl ;
    public final void rule__VLSFunctionFof__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4919:1: ( rule__VLSFunctionFof__Group_1_2__1__Impl )
            // InternalVampireLanguage.g:4920:2: rule__VLSFunctionFof__Group_1_2__1__Impl
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
    // InternalVampireLanguage.g:4926:1: rule__VLSFunctionFof__Group_1_2__1__Impl : ( ( rule__VLSFunctionFof__TermsAssignment_1_2_1 ) ) ;
    public final void rule__VLSFunctionFof__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4930:1: ( ( ( rule__VLSFunctionFof__TermsAssignment_1_2_1 ) ) )
            // InternalVampireLanguage.g:4931:1: ( ( rule__VLSFunctionFof__TermsAssignment_1_2_1 ) )
            {
            // InternalVampireLanguage.g:4931:1: ( ( rule__VLSFunctionFof__TermsAssignment_1_2_1 ) )
            // InternalVampireLanguage.g:4932:2: ( rule__VLSFunctionFof__TermsAssignment_1_2_1 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getTermsAssignment_1_2_1()); 
            // InternalVampireLanguage.g:4933:2: ( rule__VLSFunctionFof__TermsAssignment_1_2_1 )
            // InternalVampireLanguage.g:4933:3: rule__VLSFunctionFof__TermsAssignment_1_2_1
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
    // InternalVampireLanguage.g:4942:1: rule__VLSDefinedTerm__Group_0__0 : rule__VLSDefinedTerm__Group_0__0__Impl rule__VLSDefinedTerm__Group_0__1 ;
    public final void rule__VLSDefinedTerm__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4946:1: ( rule__VLSDefinedTerm__Group_0__0__Impl rule__VLSDefinedTerm__Group_0__1 )
            // InternalVampireLanguage.g:4947:2: rule__VLSDefinedTerm__Group_0__0__Impl rule__VLSDefinedTerm__Group_0__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalVampireLanguage.g:4954:1: rule__VLSDefinedTerm__Group_0__0__Impl : ( () ) ;
    public final void rule__VLSDefinedTerm__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4958:1: ( ( () ) )
            // InternalVampireLanguage.g:4959:1: ( () )
            {
            // InternalVampireLanguage.g:4959:1: ( () )
            // InternalVampireLanguage.g:4960:2: ()
            {
             before(grammarAccess.getVLSDefinedTermAccess().getVLSIntAction_0_0()); 
            // InternalVampireLanguage.g:4961:2: ()
            // InternalVampireLanguage.g:4961:3: 
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
    // InternalVampireLanguage.g:4969:1: rule__VLSDefinedTerm__Group_0__1 : rule__VLSDefinedTerm__Group_0__1__Impl ;
    public final void rule__VLSDefinedTerm__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4973:1: ( rule__VLSDefinedTerm__Group_0__1__Impl )
            // InternalVampireLanguage.g:4974:2: rule__VLSDefinedTerm__Group_0__1__Impl
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
    // InternalVampireLanguage.g:4980:1: rule__VLSDefinedTerm__Group_0__1__Impl : ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) ) ;
    public final void rule__VLSDefinedTerm__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4984:1: ( ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) ) )
            // InternalVampireLanguage.g:4985:1: ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) )
            {
            // InternalVampireLanguage.g:4985:1: ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) )
            // InternalVampireLanguage.g:4986:2: ( rule__VLSDefinedTerm__ValueAssignment_0_1 )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_0_1()); 
            // InternalVampireLanguage.g:4987:2: ( rule__VLSDefinedTerm__ValueAssignment_0_1 )
            // InternalVampireLanguage.g:4987:3: rule__VLSDefinedTerm__ValueAssignment_0_1
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
    // InternalVampireLanguage.g:4996:1: rule__VLSDefinedTerm__Group_1__0 : rule__VLSDefinedTerm__Group_1__0__Impl rule__VLSDefinedTerm__Group_1__1 ;
    public final void rule__VLSDefinedTerm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5000:1: ( rule__VLSDefinedTerm__Group_1__0__Impl rule__VLSDefinedTerm__Group_1__1 )
            // InternalVampireLanguage.g:5001:2: rule__VLSDefinedTerm__Group_1__0__Impl rule__VLSDefinedTerm__Group_1__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalVampireLanguage.g:5008:1: rule__VLSDefinedTerm__Group_1__0__Impl : ( () ) ;
    public final void rule__VLSDefinedTerm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5012:1: ( ( () ) )
            // InternalVampireLanguage.g:5013:1: ( () )
            {
            // InternalVampireLanguage.g:5013:1: ( () )
            // InternalVampireLanguage.g:5014:2: ()
            {
             before(grammarAccess.getVLSDefinedTermAccess().getVLSRealAction_1_0()); 
            // InternalVampireLanguage.g:5015:2: ()
            // InternalVampireLanguage.g:5015:3: 
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
    // InternalVampireLanguage.g:5023:1: rule__VLSDefinedTerm__Group_1__1 : rule__VLSDefinedTerm__Group_1__1__Impl ;
    public final void rule__VLSDefinedTerm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5027:1: ( rule__VLSDefinedTerm__Group_1__1__Impl )
            // InternalVampireLanguage.g:5028:2: rule__VLSDefinedTerm__Group_1__1__Impl
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
    // InternalVampireLanguage.g:5034:1: rule__VLSDefinedTerm__Group_1__1__Impl : ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) ) ;
    public final void rule__VLSDefinedTerm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5038:1: ( ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:5039:1: ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:5039:1: ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) )
            // InternalVampireLanguage.g:5040:2: ( rule__VLSDefinedTerm__ValueAssignment_1_1 )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_1_1()); 
            // InternalVampireLanguage.g:5041:2: ( rule__VLSDefinedTerm__ValueAssignment_1_1 )
            // InternalVampireLanguage.g:5041:3: rule__VLSDefinedTerm__ValueAssignment_1_1
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
    // InternalVampireLanguage.g:5050:1: rule__VLSDefinedTerm__Group_2__0 : rule__VLSDefinedTerm__Group_2__0__Impl rule__VLSDefinedTerm__Group_2__1 ;
    public final void rule__VLSDefinedTerm__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5054:1: ( rule__VLSDefinedTerm__Group_2__0__Impl rule__VLSDefinedTerm__Group_2__1 )
            // InternalVampireLanguage.g:5055:2: rule__VLSDefinedTerm__Group_2__0__Impl rule__VLSDefinedTerm__Group_2__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalVampireLanguage.g:5062:1: rule__VLSDefinedTerm__Group_2__0__Impl : ( () ) ;
    public final void rule__VLSDefinedTerm__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5066:1: ( ( () ) )
            // InternalVampireLanguage.g:5067:1: ( () )
            {
            // InternalVampireLanguage.g:5067:1: ( () )
            // InternalVampireLanguage.g:5068:2: ()
            {
             before(grammarAccess.getVLSDefinedTermAccess().getVLSRationalAction_2_0()); 
            // InternalVampireLanguage.g:5069:2: ()
            // InternalVampireLanguage.g:5069:3: 
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
    // InternalVampireLanguage.g:5077:1: rule__VLSDefinedTerm__Group_2__1 : rule__VLSDefinedTerm__Group_2__1__Impl ;
    public final void rule__VLSDefinedTerm__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5081:1: ( rule__VLSDefinedTerm__Group_2__1__Impl )
            // InternalVampireLanguage.g:5082:2: rule__VLSDefinedTerm__Group_2__1__Impl
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
    // InternalVampireLanguage.g:5088:1: rule__VLSDefinedTerm__Group_2__1__Impl : ( ( rule__VLSDefinedTerm__ValueAssignment_2_1 ) ) ;
    public final void rule__VLSDefinedTerm__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5092:1: ( ( ( rule__VLSDefinedTerm__ValueAssignment_2_1 ) ) )
            // InternalVampireLanguage.g:5093:1: ( ( rule__VLSDefinedTerm__ValueAssignment_2_1 ) )
            {
            // InternalVampireLanguage.g:5093:1: ( ( rule__VLSDefinedTerm__ValueAssignment_2_1 ) )
            // InternalVampireLanguage.g:5094:2: ( rule__VLSDefinedTerm__ValueAssignment_2_1 )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_2_1()); 
            // InternalVampireLanguage.g:5095:2: ( rule__VLSDefinedTerm__ValueAssignment_2_1 )
            // InternalVampireLanguage.g:5095:3: rule__VLSDefinedTerm__ValueAssignment_2_1
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
    // InternalVampireLanguage.g:5104:1: rule__VLSDefinedTerm__Group_3__0 : rule__VLSDefinedTerm__Group_3__0__Impl rule__VLSDefinedTerm__Group_3__1 ;
    public final void rule__VLSDefinedTerm__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5108:1: ( rule__VLSDefinedTerm__Group_3__0__Impl rule__VLSDefinedTerm__Group_3__1 )
            // InternalVampireLanguage.g:5109:2: rule__VLSDefinedTerm__Group_3__0__Impl rule__VLSDefinedTerm__Group_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalVampireLanguage.g:5116:1: rule__VLSDefinedTerm__Group_3__0__Impl : ( () ) ;
    public final void rule__VLSDefinedTerm__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5120:1: ( ( () ) )
            // InternalVampireLanguage.g:5121:1: ( () )
            {
            // InternalVampireLanguage.g:5121:1: ( () )
            // InternalVampireLanguage.g:5122:2: ()
            {
             before(grammarAccess.getVLSDefinedTermAccess().getVLSDoubleQuoteAction_3_0()); 
            // InternalVampireLanguage.g:5123:2: ()
            // InternalVampireLanguage.g:5123:3: 
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
    // InternalVampireLanguage.g:5131:1: rule__VLSDefinedTerm__Group_3__1 : rule__VLSDefinedTerm__Group_3__1__Impl ;
    public final void rule__VLSDefinedTerm__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5135:1: ( rule__VLSDefinedTerm__Group_3__1__Impl )
            // InternalVampireLanguage.g:5136:2: rule__VLSDefinedTerm__Group_3__1__Impl
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
    // InternalVampireLanguage.g:5142:1: rule__VLSDefinedTerm__Group_3__1__Impl : ( ( rule__VLSDefinedTerm__ValueAssignment_3_1 ) ) ;
    public final void rule__VLSDefinedTerm__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5146:1: ( ( ( rule__VLSDefinedTerm__ValueAssignment_3_1 ) ) )
            // InternalVampireLanguage.g:5147:1: ( ( rule__VLSDefinedTerm__ValueAssignment_3_1 ) )
            {
            // InternalVampireLanguage.g:5147:1: ( ( rule__VLSDefinedTerm__ValueAssignment_3_1 ) )
            // InternalVampireLanguage.g:5148:2: ( rule__VLSDefinedTerm__ValueAssignment_3_1 )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_3_1()); 
            // InternalVampireLanguage.g:5149:2: ( rule__VLSDefinedTerm__ValueAssignment_3_1 )
            // InternalVampireLanguage.g:5149:3: rule__VLSDefinedTerm__ValueAssignment_3_1
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


    // $ANTLR start "rule__VampireModel__IncludesAssignment_0"
    // InternalVampireLanguage.g:5158:1: rule__VampireModel__IncludesAssignment_0 : ( ruleVLSInclude ) ;
    public final void rule__VampireModel__IncludesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5162:1: ( ( ruleVLSInclude ) )
            // InternalVampireLanguage.g:5163:2: ( ruleVLSInclude )
            {
            // InternalVampireLanguage.g:5163:2: ( ruleVLSInclude )
            // InternalVampireLanguage.g:5164:3: ruleVLSInclude
            {
             before(grammarAccess.getVampireModelAccess().getIncludesVLSIncludeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSInclude();

            state._fsp--;

             after(grammarAccess.getVampireModelAccess().getIncludesVLSIncludeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VampireModel__IncludesAssignment_0"


    // $ANTLR start "rule__VampireModel__CommentsAssignment_1"
    // InternalVampireLanguage.g:5173:1: rule__VampireModel__CommentsAssignment_1 : ( ruleVLSComment ) ;
    public final void rule__VampireModel__CommentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5177:1: ( ( ruleVLSComment ) )
            // InternalVampireLanguage.g:5178:2: ( ruleVLSComment )
            {
            // InternalVampireLanguage.g:5178:2: ( ruleVLSComment )
            // InternalVampireLanguage.g:5179:3: ruleVLSComment
            {
             before(grammarAccess.getVampireModelAccess().getCommentsVLSCommentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSComment();

            state._fsp--;

             after(grammarAccess.getVampireModelAccess().getCommentsVLSCommentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VampireModel__CommentsAssignment_1"


    // $ANTLR start "rule__VampireModel__FormulasAssignment_2"
    // InternalVampireLanguage.g:5188:1: rule__VampireModel__FormulasAssignment_2 : ( ruleVLSFofFormula ) ;
    public final void rule__VampireModel__FormulasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5192:1: ( ( ruleVLSFofFormula ) )
            // InternalVampireLanguage.g:5193:2: ( ruleVLSFofFormula )
            {
            // InternalVampireLanguage.g:5193:2: ( ruleVLSFofFormula )
            // InternalVampireLanguage.g:5194:3: ruleVLSFofFormula
            {
             before(grammarAccess.getVampireModelAccess().getFormulasVLSFofFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSFofFormula();

            state._fsp--;

             after(grammarAccess.getVampireModelAccess().getFormulasVLSFofFormulaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VampireModel__FormulasAssignment_2"


    // $ANTLR start "rule__VLSInclude__FileNameAssignment_1"
    // InternalVampireLanguage.g:5203:1: rule__VLSInclude__FileNameAssignment_1 : ( RULE_SINGLE_QUOTE ) ;
    public final void rule__VLSInclude__FileNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5207:1: ( ( RULE_SINGLE_QUOTE ) )
            // InternalVampireLanguage.g:5208:2: ( RULE_SINGLE_QUOTE )
            {
            // InternalVampireLanguage.g:5208:2: ( RULE_SINGLE_QUOTE )
            // InternalVampireLanguage.g:5209:3: RULE_SINGLE_QUOTE
            {
             before(grammarAccess.getVLSIncludeAccess().getFileNameSINGLE_QUOTETerminalRuleCall_1_0()); 
            match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
             after(grammarAccess.getVLSIncludeAccess().getFileNameSINGLE_QUOTETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__FileNameAssignment_1"


    // $ANTLR start "rule__VLSInclude__NamesAssignment_2_1"
    // InternalVampireLanguage.g:5218:1: rule__VLSInclude__NamesAssignment_2_1 : ( ruleVLSName ) ;
    public final void rule__VLSInclude__NamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5222:1: ( ( ruleVLSName ) )
            // InternalVampireLanguage.g:5223:2: ( ruleVLSName )
            {
            // InternalVampireLanguage.g:5223:2: ( ruleVLSName )
            // InternalVampireLanguage.g:5224:3: ruleVLSName
            {
             before(grammarAccess.getVLSIncludeAccess().getNamesVLSNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSName();

            state._fsp--;

             after(grammarAccess.getVLSIncludeAccess().getNamesVLSNameParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__NamesAssignment_2_1"


    // $ANTLR start "rule__VLSInclude__NamesAssignment_2_2_1"
    // InternalVampireLanguage.g:5233:1: rule__VLSInclude__NamesAssignment_2_2_1 : ( ruleVLSName ) ;
    public final void rule__VLSInclude__NamesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5237:1: ( ( ruleVLSName ) )
            // InternalVampireLanguage.g:5238:2: ( ruleVLSName )
            {
            // InternalVampireLanguage.g:5238:2: ( ruleVLSName )
            // InternalVampireLanguage.g:5239:3: ruleVLSName
            {
             before(grammarAccess.getVLSIncludeAccess().getNamesVLSNameParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSName();

            state._fsp--;

             after(grammarAccess.getVLSIncludeAccess().getNamesVLSNameParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSInclude__NamesAssignment_2_2_1"


    // $ANTLR start "rule__VLSName__NameAssignment"
    // InternalVampireLanguage.g:5248:1: rule__VLSName__NameAssignment : ( ( rule__VLSName__NameAlternatives_0 ) ) ;
    public final void rule__VLSName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5252:1: ( ( ( rule__VLSName__NameAlternatives_0 ) ) )
            // InternalVampireLanguage.g:5253:2: ( ( rule__VLSName__NameAlternatives_0 ) )
            {
            // InternalVampireLanguage.g:5253:2: ( ( rule__VLSName__NameAlternatives_0 ) )
            // InternalVampireLanguage.g:5254:3: ( rule__VLSName__NameAlternatives_0 )
            {
             before(grammarAccess.getVLSNameAccess().getNameAlternatives_0()); 
            // InternalVampireLanguage.g:5255:3: ( rule__VLSName__NameAlternatives_0 )
            // InternalVampireLanguage.g:5255:4: rule__VLSName__NameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSName__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSNameAccess().getNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSName__NameAssignment"


    // $ANTLR start "rule__VLSComment__CommentAssignment_1"
    // InternalVampireLanguage.g:5263:1: rule__VLSComment__CommentAssignment_1 : ( RULE_SINGLE_COMMENT ) ;
    public final void rule__VLSComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5267:1: ( ( RULE_SINGLE_COMMENT ) )
            // InternalVampireLanguage.g:5268:2: ( RULE_SINGLE_COMMENT )
            {
            // InternalVampireLanguage.g:5268:2: ( RULE_SINGLE_COMMENT )
            // InternalVampireLanguage.g:5269:3: RULE_SINGLE_COMMENT
            {
             before(grammarAccess.getVLSCommentAccess().getCommentSINGLE_COMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_SINGLE_COMMENT,FOLLOW_2); 
             after(grammarAccess.getVLSCommentAccess().getCommentSINGLE_COMMENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSComment__CommentAssignment_1"


    // $ANTLR start "rule__VLSFofFormula__NameAssignment_2"
    // InternalVampireLanguage.g:5278:1: rule__VLSFofFormula__NameAssignment_2 : ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) ) ;
    public final void rule__VLSFofFormula__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5282:1: ( ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) ) )
            // InternalVampireLanguage.g:5283:2: ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) )
            {
            // InternalVampireLanguage.g:5283:2: ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) )
            // InternalVampireLanguage.g:5284:3: ( rule__VLSFofFormula__NameAlternatives_2_0 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getNameAlternatives_2_0()); 
            // InternalVampireLanguage.g:5285:3: ( rule__VLSFofFormula__NameAlternatives_2_0 )
            // InternalVampireLanguage.g:5285:4: rule__VLSFofFormula__NameAlternatives_2_0
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
    // InternalVampireLanguage.g:5293:1: rule__VLSFofFormula__FofRoleAssignment_4 : ( ruleVLSRole ) ;
    public final void rule__VLSFofFormula__FofRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5297:1: ( ( ruleVLSRole ) )
            // InternalVampireLanguage.g:5298:2: ( ruleVLSRole )
            {
            // InternalVampireLanguage.g:5298:2: ( ruleVLSRole )
            // InternalVampireLanguage.g:5299:3: ruleVLSRole
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
    // InternalVampireLanguage.g:5308:1: rule__VLSFofFormula__FofFormulaAssignment_6 : ( ruleVLSTerm ) ;
    public final void rule__VLSFofFormula__FofFormulaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5312:1: ( ( ruleVLSTerm ) )
            // InternalVampireLanguage.g:5313:2: ( ruleVLSTerm )
            {
            // InternalVampireLanguage.g:5313:2: ( ruleVLSTerm )
            // InternalVampireLanguage.g:5314:3: ruleVLSTerm
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
    // InternalVampireLanguage.g:5323:1: rule__VLSFofFormula__AnnotationsAssignment_7_1 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSFofFormula__AnnotationsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5327:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:5328:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:5328:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:5329:3: ruleVLSAnnotation
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
    // InternalVampireLanguage.g:5338:1: rule__VLSAnnotation__NameAssignment_1 : ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) ) ;
    public final void rule__VLSAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5342:1: ( ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) ) )
            // InternalVampireLanguage.g:5343:2: ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) )
            {
            // InternalVampireLanguage.g:5343:2: ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) )
            // InternalVampireLanguage.g:5344:3: ( rule__VLSAnnotation__NameAlternatives_1_0 )
            {
             before(grammarAccess.getVLSAnnotationAccess().getNameAlternatives_1_0()); 
            // InternalVampireLanguage.g:5345:3: ( rule__VLSAnnotation__NameAlternatives_1_0 )
            // InternalVampireLanguage.g:5345:4: rule__VLSAnnotation__NameAlternatives_1_0
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
    // InternalVampireLanguage.g:5353:1: rule__VLSAnnotation__FollowupAssignment_2_1 : ( ruleVLSAnnotationTerms ) ;
    public final void rule__VLSAnnotation__FollowupAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5357:1: ( ( ruleVLSAnnotationTerms ) )
            // InternalVampireLanguage.g:5358:2: ( ruleVLSAnnotationTerms )
            {
            // InternalVampireLanguage.g:5358:2: ( ruleVLSAnnotationTerms )
            // InternalVampireLanguage.g:5359:3: ruleVLSAnnotationTerms
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
    // InternalVampireLanguage.g:5368:1: rule__VLSAnnotationTerms__TermsAssignment_0 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSAnnotationTerms__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5372:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:5373:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:5373:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:5374:3: ruleVLSAnnotation
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
    // InternalVampireLanguage.g:5383:1: rule__VLSAnnotationTerms__TermsAssignment_1_1 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSAnnotationTerms__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5387:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:5388:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:5388:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:5389:3: ruleVLSAnnotation
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
    // InternalVampireLanguage.g:5398:1: rule__VLSBinary__RightAssignment_1_0_1 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5402:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:5403:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:5403:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:5404:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:5413:1: rule__VLSBinary__RightAssignment_1_1_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5417:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:5418:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:5418:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:5419:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:5428:1: rule__VLSBinary__RightAssignment_1_2_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5432:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:5433:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:5433:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:5434:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:5443:1: rule__VLSUniversalQuantifier__VariablesAssignment_1_2 : ( ruleVLSVariable ) ;
    public final void rule__VLSUniversalQuantifier__VariablesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5447:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:5448:2: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:5448:2: ( ruleVLSVariable )
            // InternalVampireLanguage.g:5449:3: ruleVLSVariable
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
    // InternalVampireLanguage.g:5458:1: rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 : ( ruleVLSVariable ) ;
    public final void rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5462:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:5463:2: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:5463:2: ( ruleVLSVariable )
            // InternalVampireLanguage.g:5464:3: ruleVLSVariable
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
    // InternalVampireLanguage.g:5473:1: rule__VLSUniversalQuantifier__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSUniversalQuantifier__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5477:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:5478:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:5478:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:5479:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:5488:1: rule__VLSExistentialQuantifier__VariablesAssignment_1_2 : ( ruleVLSVariable ) ;
    public final void rule__VLSExistentialQuantifier__VariablesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5492:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:5493:2: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:5493:2: ( ruleVLSVariable )
            // InternalVampireLanguage.g:5494:3: ruleVLSVariable
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
    // InternalVampireLanguage.g:5503:1: rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 : ( ruleVLSVariable ) ;
    public final void rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5507:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:5508:2: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:5508:2: ( ruleVLSVariable )
            // InternalVampireLanguage.g:5509:3: ruleVLSVariable
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
    // InternalVampireLanguage.g:5518:1: rule__VLSExistentialQuantifier__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSExistentialQuantifier__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5522:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:5523:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:5523:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:5524:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:5533:1: rule__VLSUnaryNegation__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSUnaryNegation__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5537:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:5538:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:5538:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:5539:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:5548:1: rule__VLSUnaryInfix__RightAssignment_1_1 : ( ruleVLSAtomic ) ;
    public final void rule__VLSUnaryInfix__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5552:1: ( ( ruleVLSAtomic ) )
            // InternalVampireLanguage.g:5553:2: ( ruleVLSAtomic )
            {
            // InternalVampireLanguage.g:5553:2: ( ruleVLSAtomic )
            // InternalVampireLanguage.g:5554:3: ruleVLSAtomic
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
    // InternalVampireLanguage.g:5563:1: rule__VLSAtomicConstant__NameAssignment_0_1 : ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) ) ;
    public final void rule__VLSAtomicConstant__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5567:1: ( ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) ) )
            // InternalVampireLanguage.g:5568:2: ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) )
            {
            // InternalVampireLanguage.g:5568:2: ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) )
            // InternalVampireLanguage.g:5569:3: ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getNameAlternatives_0_1_0()); 
            // InternalVampireLanguage.g:5570:3: ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 )
            // InternalVampireLanguage.g:5570:4: rule__VLSAtomicConstant__NameAlternatives_0_1_0
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


    // $ANTLR start "rule__VLSAtomicFunction__ConstantAssignment_0_1"
    // InternalVampireLanguage.g:5578:1: rule__VLSAtomicFunction__ConstantAssignment_0_1 : ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) ) ;
    public final void rule__VLSAtomicFunction__ConstantAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5582:1: ( ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) ) )
            // InternalVampireLanguage.g:5583:2: ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) )
            {
            // InternalVampireLanguage.g:5583:2: ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) )
            // InternalVampireLanguage.g:5584:3: ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getConstantAlternatives_0_1_0()); 
            // InternalVampireLanguage.g:5585:3: ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 )
            // InternalVampireLanguage.g:5585:4: rule__VLSAtomicFunction__ConstantAlternatives_0_1_0
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
    // InternalVampireLanguage.g:5593:1: rule__VLSAtomicFunction__TermsAssignment_0_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5597:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5598:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5598:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5599:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:5608:1: rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_0_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5612:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5613:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5613:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5614:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:5623:1: rule__VLSAtomicFunction__NameAssignment_1_1 : ( ( '$less' ) ) ;
    public final void rule__VLSAtomicFunction__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5627:1: ( ( ( '$less' ) ) )
            // InternalVampireLanguage.g:5628:2: ( ( '$less' ) )
            {
            // InternalVampireLanguage.g:5628:2: ( ( '$less' ) )
            // InternalVampireLanguage.g:5629:3: ( '$less' )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getNameLessKeyword_1_1_0()); 
            // InternalVampireLanguage.g:5630:3: ( '$less' )
            // InternalVampireLanguage.g:5631:4: '$less'
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getNameLessKeyword_1_1_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalVampireLanguage.g:5642:1: rule__VLSAtomicFunction__TermsAssignment_1_3 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5646:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5647:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5647:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5648:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:5657:1: rule__VLSAtomicFunction__TermsAssignment_1_5 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5661:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5662:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5662:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5663:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:5672:1: rule__VLSVariable__NameAssignment : ( RULE_UPPER_WORD_ID ) ;
    public final void rule__VLSVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5676:1: ( ( RULE_UPPER_WORD_ID ) )
            // InternalVampireLanguage.g:5677:2: ( RULE_UPPER_WORD_ID )
            {
            // InternalVampireLanguage.g:5677:2: ( RULE_UPPER_WORD_ID )
            // InternalVampireLanguage.g:5678:3: RULE_UPPER_WORD_ID
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
    // InternalVampireLanguage.g:5687:1: rule__VLSFunctionFof__FunctorAssignment_0 : ( ( rule__VLSFunctionFof__FunctorAlternatives_0_0 ) ) ;
    public final void rule__VLSFunctionFof__FunctorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5691:1: ( ( ( rule__VLSFunctionFof__FunctorAlternatives_0_0 ) ) )
            // InternalVampireLanguage.g:5692:2: ( ( rule__VLSFunctionFof__FunctorAlternatives_0_0 ) )
            {
            // InternalVampireLanguage.g:5692:2: ( ( rule__VLSFunctionFof__FunctorAlternatives_0_0 ) )
            // InternalVampireLanguage.g:5693:3: ( rule__VLSFunctionFof__FunctorAlternatives_0_0 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getFunctorAlternatives_0_0()); 
            // InternalVampireLanguage.g:5694:3: ( rule__VLSFunctionFof__FunctorAlternatives_0_0 )
            // InternalVampireLanguage.g:5694:4: rule__VLSFunctionFof__FunctorAlternatives_0_0
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
    // InternalVampireLanguage.g:5702:1: rule__VLSFunctionFof__TermsAssignment_1_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSFunctionFof__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5706:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5707:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5707:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5708:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:5717:1: rule__VLSFunctionFof__TermsAssignment_1_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSFunctionFof__TermsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5721:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5722:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5722:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5723:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:5732:1: rule__VLSDefinedTerm__ValueAssignment_0_1 : ( RULE_SIGNED_LITERAL ) ;
    public final void rule__VLSDefinedTerm__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5736:1: ( ( RULE_SIGNED_LITERAL ) )
            // InternalVampireLanguage.g:5737:2: ( RULE_SIGNED_LITERAL )
            {
            // InternalVampireLanguage.g:5737:2: ( RULE_SIGNED_LITERAL )
            // InternalVampireLanguage.g:5738:3: RULE_SIGNED_LITERAL
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
    // InternalVampireLanguage.g:5747:1: rule__VLSDefinedTerm__ValueAssignment_1_1 : ( RULE_SIGNED_REAL_ID ) ;
    public final void rule__VLSDefinedTerm__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5751:1: ( ( RULE_SIGNED_REAL_ID ) )
            // InternalVampireLanguage.g:5752:2: ( RULE_SIGNED_REAL_ID )
            {
            // InternalVampireLanguage.g:5752:2: ( RULE_SIGNED_REAL_ID )
            // InternalVampireLanguage.g:5753:3: RULE_SIGNED_REAL_ID
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
    // InternalVampireLanguage.g:5762:1: rule__VLSDefinedTerm__ValueAssignment_2_1 : ( RULE_SIGNED_RAT_ID ) ;
    public final void rule__VLSDefinedTerm__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5766:1: ( ( RULE_SIGNED_RAT_ID ) )
            // InternalVampireLanguage.g:5767:2: ( RULE_SIGNED_RAT_ID )
            {
            // InternalVampireLanguage.g:5767:2: ( RULE_SIGNED_RAT_ID )
            // InternalVampireLanguage.g:5768:3: RULE_SIGNED_RAT_ID
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
    // InternalVampireLanguage.g:5777:1: rule__VLSDefinedTerm__ValueAssignment_3_1 : ( RULE_DOUBLE_QUOTE ) ;
    public final void rule__VLSDefinedTerm__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5781:1: ( ( RULE_DOUBLE_QUOTE ) )
            // InternalVampireLanguage.g:5782:2: ( RULE_DOUBLE_QUOTE )
            {
            // InternalVampireLanguage.g:5782:2: ( RULE_DOUBLE_QUOTE )
            // InternalVampireLanguage.g:5783:3: RULE_DOUBLE_QUOTE
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


    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\uffff\23\24\4\uffff";
    static final String dfa_3s = "\1\4\23\55\4\uffff";
    static final String dfa_4s = "\1\105\23\102\4\uffff";
    static final String dfa_5s = "\24\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_6s = "\30\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\uffff\1\27\1\3\1\4\1\uffff\1\26\3\27\14\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\31\uffff\2\24\1\25",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "\1\24\2\uffff\1\25\1\24\2\uffff\10\24\4\uffff\3\24",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1342:1: rule__VLSAtomic__Alternatives : ( ( ruleVLSAtomicConstant ) | ( ruleVLSAtomicFunction ) | ( ruleVLSVariable ) | ( ruleVLSDefinedTerm ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000C40000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000003FFF8000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0xD00103FFF8007BB0L,0x0000000000000038L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000913FFF8000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0FF0000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x03F0000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000003FFF8007BB0L,0x0000000000000038L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000003FFF8000330L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000003FFF8000330L,0x0000000000000018L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000003FFF8000330L,0x0000000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000002000L});

}