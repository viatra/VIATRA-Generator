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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LOWER_WORD_ID", "RULE_SINGLE_QUOTE", "RULE_DOLLAR_ID", "RULE_DOUBLE_DOLLAR_ID", "RULE_SIGNED_LITERAL", "RULE_DOUBLE_QUOTE", "RULE_SIGNED_REAL_ID", "RULE_SIGNED_RAT_ID", "RULE_SINGLE_COMMENT", "RULE_UPPER_WORD_ID", "RULE_ALPHA_NUMERIC", "RULE_SIGN", "RULE_INT", "RULE_LITERAL", "RULE_UNSIGNED_REAL_FRAC_ID", "RULE_UNSIGNED_REAL_EXP_ID", "RULE_UNSIGNED_RAT_ID", "RULE_ANY_OTHER", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'axiom'", "'conjecture'", "'hypothesis'", "'definition'", "'assumption'", "'lemma'", "'theorem'", "'corollary'", "'negated_conjecture'", "'plain'", "'type'", "'fi_domain'", "'fi_functors'", "'fi_predicates'", "'unknown'", "'fof'", "'('", "','", "')'", "'.'", "'['", "']'", "'<=>'", "'=>'", "'<='", "'<~>'", "'~|'", "'~&'", "'&'", "'|'", "'!'", "':'", "'?'", "'~'", "'!='", "'='", "':='"
    };
    public static final int RULE_UNSIGNED_RAT_ID=20;
    public static final int T__50=50;
    public static final int RULE_SIGN=15;
    public static final int T__59=59;
    public static final int RULE_SIGNED_LITERAL=8;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_DOUBLE_QUOTE=9;
    public static final int T__52=52;
    public static final int RULE_LITERAL=17;
    public static final int T__53=53;
    public static final int RULE_UNSIGNED_REAL_FRAC_ID=18;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=22;
    public static final int RULE_SINGLE_QUOTE=5;
    public static final int RULE_SINGLE_COMMENT=12;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=16;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=24;
    public static final int RULE_SIGNED_RAT_ID=11;
    public static final int T__62=62;
    public static final int T__63=63;
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
    public static final int RULE_UPPER_WORD_ID=13;
    public static final int RULE_WS=26;
    public static final int RULE_DOLLAR_ID=6;
    public static final int RULE_ALPHA_NUMERIC=14;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_DOUBLE_DOLLAR_ID=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SIGNED_REAL_ID=10;
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


    // $ANTLR start "entryRuleVLSFunctionDeclaration"
    // InternalVampireLanguage.g:103:1: entryRuleVLSFunctionDeclaration : ruleVLSFunctionDeclaration EOF ;
    public final void entryRuleVLSFunctionDeclaration() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:104:1: ( ruleVLSFunctionDeclaration EOF )
            // InternalVampireLanguage.g:105:1: ruleVLSFunctionDeclaration EOF
            {
             before(grammarAccess.getVLSFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSFunctionDeclaration();

            state._fsp--;

             after(grammarAccess.getVLSFunctionDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSFunctionDeclaration"


    // $ANTLR start "ruleVLSFunctionDeclaration"
    // InternalVampireLanguage.g:112:1: ruleVLSFunctionDeclaration : ( ( rule__VLSFunctionDeclaration__NameAssignment ) ) ;
    public final void ruleVLSFunctionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:116:2: ( ( ( rule__VLSFunctionDeclaration__NameAssignment ) ) )
            // InternalVampireLanguage.g:117:2: ( ( rule__VLSFunctionDeclaration__NameAssignment ) )
            {
            // InternalVampireLanguage.g:117:2: ( ( rule__VLSFunctionDeclaration__NameAssignment ) )
            // InternalVampireLanguage.g:118:3: ( rule__VLSFunctionDeclaration__NameAssignment )
            {
             before(grammarAccess.getVLSFunctionDeclarationAccess().getNameAssignment()); 
            // InternalVampireLanguage.g:119:3: ( rule__VLSFunctionDeclaration__NameAssignment )
            // InternalVampireLanguage.g:119:4: rule__VLSFunctionDeclaration__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionDeclaration__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVLSFunctionDeclarationAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSFunctionDeclaration"


    // $ANTLR start "entryRuleVLSFofFormula"
    // InternalVampireLanguage.g:128:1: entryRuleVLSFofFormula : ruleVLSFofFormula EOF ;
    public final void entryRuleVLSFofFormula() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:129:1: ( ruleVLSFofFormula EOF )
            // InternalVampireLanguage.g:130:1: ruleVLSFofFormula EOF
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
    // InternalVampireLanguage.g:137:1: ruleVLSFofFormula : ( ( rule__VLSFofFormula__Group__0 ) ) ;
    public final void ruleVLSFofFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:141:2: ( ( ( rule__VLSFofFormula__Group__0 ) ) )
            // InternalVampireLanguage.g:142:2: ( ( rule__VLSFofFormula__Group__0 ) )
            {
            // InternalVampireLanguage.g:142:2: ( ( rule__VLSFofFormula__Group__0 ) )
            // InternalVampireLanguage.g:143:3: ( rule__VLSFofFormula__Group__0 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getGroup()); 
            // InternalVampireLanguage.g:144:3: ( rule__VLSFofFormula__Group__0 )
            // InternalVampireLanguage.g:144:4: rule__VLSFofFormula__Group__0
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
    // InternalVampireLanguage.g:153:1: entryRuleVLSRole : ruleVLSRole EOF ;
    public final void entryRuleVLSRole() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:154:1: ( ruleVLSRole EOF )
            // InternalVampireLanguage.g:155:1: ruleVLSRole EOF
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
    // InternalVampireLanguage.g:162:1: ruleVLSRole : ( ( rule__VLSRole__Alternatives ) ) ;
    public final void ruleVLSRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:166:2: ( ( ( rule__VLSRole__Alternatives ) ) )
            // InternalVampireLanguage.g:167:2: ( ( rule__VLSRole__Alternatives ) )
            {
            // InternalVampireLanguage.g:167:2: ( ( rule__VLSRole__Alternatives ) )
            // InternalVampireLanguage.g:168:3: ( rule__VLSRole__Alternatives )
            {
             before(grammarAccess.getVLSRoleAccess().getAlternatives()); 
            // InternalVampireLanguage.g:169:3: ( rule__VLSRole__Alternatives )
            // InternalVampireLanguage.g:169:4: rule__VLSRole__Alternatives
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
    // InternalVampireLanguage.g:178:1: entryRuleVLSAxiom : ruleVLSAxiom EOF ;
    public final void entryRuleVLSAxiom() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:179:1: ( ruleVLSAxiom EOF )
            // InternalVampireLanguage.g:180:1: ruleVLSAxiom EOF
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
    // InternalVampireLanguage.g:187:1: ruleVLSAxiom : ( 'axiom' ) ;
    public final void ruleVLSAxiom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:191:2: ( ( 'axiom' ) )
            // InternalVampireLanguage.g:192:2: ( 'axiom' )
            {
            // InternalVampireLanguage.g:192:2: ( 'axiom' )
            // InternalVampireLanguage.g:193:3: 'axiom'
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
    // InternalVampireLanguage.g:203:1: entryRuleVLSConjecture : ruleVLSConjecture EOF ;
    public final void entryRuleVLSConjecture() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:204:1: ( ruleVLSConjecture EOF )
            // InternalVampireLanguage.g:205:1: ruleVLSConjecture EOF
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
    // InternalVampireLanguage.g:212:1: ruleVLSConjecture : ( 'conjecture' ) ;
    public final void ruleVLSConjecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:216:2: ( ( 'conjecture' ) )
            // InternalVampireLanguage.g:217:2: ( 'conjecture' )
            {
            // InternalVampireLanguage.g:217:2: ( 'conjecture' )
            // InternalVampireLanguage.g:218:3: 'conjecture'
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
    // InternalVampireLanguage.g:228:1: entryRuleVLSHypothesis : ruleVLSHypothesis EOF ;
    public final void entryRuleVLSHypothesis() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:229:1: ( ruleVLSHypothesis EOF )
            // InternalVampireLanguage.g:230:1: ruleVLSHypothesis EOF
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
    // InternalVampireLanguage.g:237:1: ruleVLSHypothesis : ( 'hypothesis' ) ;
    public final void ruleVLSHypothesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:241:2: ( ( 'hypothesis' ) )
            // InternalVampireLanguage.g:242:2: ( 'hypothesis' )
            {
            // InternalVampireLanguage.g:242:2: ( 'hypothesis' )
            // InternalVampireLanguage.g:243:3: 'hypothesis'
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
    // InternalVampireLanguage.g:253:1: entryRuleVLSDefinition : ruleVLSDefinition EOF ;
    public final void entryRuleVLSDefinition() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:254:1: ( ruleVLSDefinition EOF )
            // InternalVampireLanguage.g:255:1: ruleVLSDefinition EOF
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
    // InternalVampireLanguage.g:262:1: ruleVLSDefinition : ( 'definition' ) ;
    public final void ruleVLSDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:266:2: ( ( 'definition' ) )
            // InternalVampireLanguage.g:267:2: ( 'definition' )
            {
            // InternalVampireLanguage.g:267:2: ( 'definition' )
            // InternalVampireLanguage.g:268:3: 'definition'
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
    // InternalVampireLanguage.g:278:1: entryRuleVLSAssumption : ruleVLSAssumption EOF ;
    public final void entryRuleVLSAssumption() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:279:1: ( ruleVLSAssumption EOF )
            // InternalVampireLanguage.g:280:1: ruleVLSAssumption EOF
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
    // InternalVampireLanguage.g:287:1: ruleVLSAssumption : ( 'assumption' ) ;
    public final void ruleVLSAssumption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:291:2: ( ( 'assumption' ) )
            // InternalVampireLanguage.g:292:2: ( 'assumption' )
            {
            // InternalVampireLanguage.g:292:2: ( 'assumption' )
            // InternalVampireLanguage.g:293:3: 'assumption'
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
    // InternalVampireLanguage.g:303:1: entryRuleVLSLemma : ruleVLSLemma EOF ;
    public final void entryRuleVLSLemma() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:304:1: ( ruleVLSLemma EOF )
            // InternalVampireLanguage.g:305:1: ruleVLSLemma EOF
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
    // InternalVampireLanguage.g:312:1: ruleVLSLemma : ( 'lemma' ) ;
    public final void ruleVLSLemma() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:316:2: ( ( 'lemma' ) )
            // InternalVampireLanguage.g:317:2: ( 'lemma' )
            {
            // InternalVampireLanguage.g:317:2: ( 'lemma' )
            // InternalVampireLanguage.g:318:3: 'lemma'
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
    // InternalVampireLanguage.g:328:1: entryRuleVLSTheorem : ruleVLSTheorem EOF ;
    public final void entryRuleVLSTheorem() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:329:1: ( ruleVLSTheorem EOF )
            // InternalVampireLanguage.g:330:1: ruleVLSTheorem EOF
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
    // InternalVampireLanguage.g:337:1: ruleVLSTheorem : ( 'theorem' ) ;
    public final void ruleVLSTheorem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:341:2: ( ( 'theorem' ) )
            // InternalVampireLanguage.g:342:2: ( 'theorem' )
            {
            // InternalVampireLanguage.g:342:2: ( 'theorem' )
            // InternalVampireLanguage.g:343:3: 'theorem'
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
    // InternalVampireLanguage.g:353:1: entryRuleVLSCorollary : ruleVLSCorollary EOF ;
    public final void entryRuleVLSCorollary() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:354:1: ( ruleVLSCorollary EOF )
            // InternalVampireLanguage.g:355:1: ruleVLSCorollary EOF
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
    // InternalVampireLanguage.g:362:1: ruleVLSCorollary : ( 'corollary' ) ;
    public final void ruleVLSCorollary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:366:2: ( ( 'corollary' ) )
            // InternalVampireLanguage.g:367:2: ( 'corollary' )
            {
            // InternalVampireLanguage.g:367:2: ( 'corollary' )
            // InternalVampireLanguage.g:368:3: 'corollary'
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
    // InternalVampireLanguage.g:378:1: entryRuleVLSNegated_Conjecture : ruleVLSNegated_Conjecture EOF ;
    public final void entryRuleVLSNegated_Conjecture() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:379:1: ( ruleVLSNegated_Conjecture EOF )
            // InternalVampireLanguage.g:380:1: ruleVLSNegated_Conjecture EOF
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
    // InternalVampireLanguage.g:387:1: ruleVLSNegated_Conjecture : ( 'negated_conjecture' ) ;
    public final void ruleVLSNegated_Conjecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:391:2: ( ( 'negated_conjecture' ) )
            // InternalVampireLanguage.g:392:2: ( 'negated_conjecture' )
            {
            // InternalVampireLanguage.g:392:2: ( 'negated_conjecture' )
            // InternalVampireLanguage.g:393:3: 'negated_conjecture'
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
    // InternalVampireLanguage.g:403:1: entryRuleVLSPlain : ruleVLSPlain EOF ;
    public final void entryRuleVLSPlain() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:404:1: ( ruleVLSPlain EOF )
            // InternalVampireLanguage.g:405:1: ruleVLSPlain EOF
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
    // InternalVampireLanguage.g:412:1: ruleVLSPlain : ( 'plain' ) ;
    public final void ruleVLSPlain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:416:2: ( ( 'plain' ) )
            // InternalVampireLanguage.g:417:2: ( 'plain' )
            {
            // InternalVampireLanguage.g:417:2: ( 'plain' )
            // InternalVampireLanguage.g:418:3: 'plain'
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
    // InternalVampireLanguage.g:428:1: entryRuleVLSType : ruleVLSType EOF ;
    public final void entryRuleVLSType() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:429:1: ( ruleVLSType EOF )
            // InternalVampireLanguage.g:430:1: ruleVLSType EOF
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
    // InternalVampireLanguage.g:437:1: ruleVLSType : ( 'type' ) ;
    public final void ruleVLSType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:441:2: ( ( 'type' ) )
            // InternalVampireLanguage.g:442:2: ( 'type' )
            {
            // InternalVampireLanguage.g:442:2: ( 'type' )
            // InternalVampireLanguage.g:443:3: 'type'
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
    // InternalVampireLanguage.g:453:1: entryRuleVLSFi_Domain : ruleVLSFi_Domain EOF ;
    public final void entryRuleVLSFi_Domain() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:454:1: ( ruleVLSFi_Domain EOF )
            // InternalVampireLanguage.g:455:1: ruleVLSFi_Domain EOF
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
    // InternalVampireLanguage.g:462:1: ruleVLSFi_Domain : ( 'fi_domain' ) ;
    public final void ruleVLSFi_Domain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:466:2: ( ( 'fi_domain' ) )
            // InternalVampireLanguage.g:467:2: ( 'fi_domain' )
            {
            // InternalVampireLanguage.g:467:2: ( 'fi_domain' )
            // InternalVampireLanguage.g:468:3: 'fi_domain'
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
    // InternalVampireLanguage.g:478:1: entryRuleVLSFi_Functors : ruleVLSFi_Functors EOF ;
    public final void entryRuleVLSFi_Functors() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:479:1: ( ruleVLSFi_Functors EOF )
            // InternalVampireLanguage.g:480:1: ruleVLSFi_Functors EOF
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
    // InternalVampireLanguage.g:487:1: ruleVLSFi_Functors : ( 'fi_functors' ) ;
    public final void ruleVLSFi_Functors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:491:2: ( ( 'fi_functors' ) )
            // InternalVampireLanguage.g:492:2: ( 'fi_functors' )
            {
            // InternalVampireLanguage.g:492:2: ( 'fi_functors' )
            // InternalVampireLanguage.g:493:3: 'fi_functors'
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
    // InternalVampireLanguage.g:503:1: entryRuleVLSFi_Predicates : ruleVLSFi_Predicates EOF ;
    public final void entryRuleVLSFi_Predicates() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:504:1: ( ruleVLSFi_Predicates EOF )
            // InternalVampireLanguage.g:505:1: ruleVLSFi_Predicates EOF
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
    // InternalVampireLanguage.g:512:1: ruleVLSFi_Predicates : ( 'fi_predicates' ) ;
    public final void ruleVLSFi_Predicates() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:516:2: ( ( 'fi_predicates' ) )
            // InternalVampireLanguage.g:517:2: ( 'fi_predicates' )
            {
            // InternalVampireLanguage.g:517:2: ( 'fi_predicates' )
            // InternalVampireLanguage.g:518:3: 'fi_predicates'
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
    // InternalVampireLanguage.g:528:1: entryRuleVLSUnknown : ruleVLSUnknown EOF ;
    public final void entryRuleVLSUnknown() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:529:1: ( ruleVLSUnknown EOF )
            // InternalVampireLanguage.g:530:1: ruleVLSUnknown EOF
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
    // InternalVampireLanguage.g:537:1: ruleVLSUnknown : ( 'unknown' ) ;
    public final void ruleVLSUnknown() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:541:2: ( ( 'unknown' ) )
            // InternalVampireLanguage.g:542:2: ( 'unknown' )
            {
            // InternalVampireLanguage.g:542:2: ( 'unknown' )
            // InternalVampireLanguage.g:543:3: 'unknown'
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
    // InternalVampireLanguage.g:553:1: entryRuleVLSAnnotation : ruleVLSAnnotation EOF ;
    public final void entryRuleVLSAnnotation() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:554:1: ( ruleVLSAnnotation EOF )
            // InternalVampireLanguage.g:555:1: ruleVLSAnnotation EOF
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
    // InternalVampireLanguage.g:562:1: ruleVLSAnnotation : ( ( rule__VLSAnnotation__Group__0 ) ) ;
    public final void ruleVLSAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:566:2: ( ( ( rule__VLSAnnotation__Group__0 ) ) )
            // InternalVampireLanguage.g:567:2: ( ( rule__VLSAnnotation__Group__0 ) )
            {
            // InternalVampireLanguage.g:567:2: ( ( rule__VLSAnnotation__Group__0 ) )
            // InternalVampireLanguage.g:568:3: ( rule__VLSAnnotation__Group__0 )
            {
             before(grammarAccess.getVLSAnnotationAccess().getGroup()); 
            // InternalVampireLanguage.g:569:3: ( rule__VLSAnnotation__Group__0 )
            // InternalVampireLanguage.g:569:4: rule__VLSAnnotation__Group__0
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
    // InternalVampireLanguage.g:578:1: entryRuleVLSAnnotationTerms : ruleVLSAnnotationTerms EOF ;
    public final void entryRuleVLSAnnotationTerms() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:579:1: ( ruleVLSAnnotationTerms EOF )
            // InternalVampireLanguage.g:580:1: ruleVLSAnnotationTerms EOF
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
    // InternalVampireLanguage.g:587:1: ruleVLSAnnotationTerms : ( ( rule__VLSAnnotationTerms__Group__0 ) ) ;
    public final void ruleVLSAnnotationTerms() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:591:2: ( ( ( rule__VLSAnnotationTerms__Group__0 ) ) )
            // InternalVampireLanguage.g:592:2: ( ( rule__VLSAnnotationTerms__Group__0 ) )
            {
            // InternalVampireLanguage.g:592:2: ( ( rule__VLSAnnotationTerms__Group__0 ) )
            // InternalVampireLanguage.g:593:3: ( rule__VLSAnnotationTerms__Group__0 )
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getGroup()); 
            // InternalVampireLanguage.g:594:3: ( rule__VLSAnnotationTerms__Group__0 )
            // InternalVampireLanguage.g:594:4: rule__VLSAnnotationTerms__Group__0
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
    // InternalVampireLanguage.g:603:1: entryRuleVLSTerm : ruleVLSTerm EOF ;
    public final void entryRuleVLSTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:604:1: ( ruleVLSTerm EOF )
            // InternalVampireLanguage.g:605:1: ruleVLSTerm EOF
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
    // InternalVampireLanguage.g:612:1: ruleVLSTerm : ( ruleVLSBinary ) ;
    public final void ruleVLSTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:616:2: ( ( ruleVLSBinary ) )
            // InternalVampireLanguage.g:617:2: ( ruleVLSBinary )
            {
            // InternalVampireLanguage.g:617:2: ( ruleVLSBinary )
            // InternalVampireLanguage.g:618:3: ruleVLSBinary
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
    // InternalVampireLanguage.g:628:1: entryRuleVLSBinary : ruleVLSBinary EOF ;
    public final void entryRuleVLSBinary() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:629:1: ( ruleVLSBinary EOF )
            // InternalVampireLanguage.g:630:1: ruleVLSBinary EOF
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
    // InternalVampireLanguage.g:637:1: ruleVLSBinary : ( ( rule__VLSBinary__Group__0 ) ) ;
    public final void ruleVLSBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:641:2: ( ( ( rule__VLSBinary__Group__0 ) ) )
            // InternalVampireLanguage.g:642:2: ( ( rule__VLSBinary__Group__0 ) )
            {
            // InternalVampireLanguage.g:642:2: ( ( rule__VLSBinary__Group__0 ) )
            // InternalVampireLanguage.g:643:3: ( rule__VLSBinary__Group__0 )
            {
             before(grammarAccess.getVLSBinaryAccess().getGroup()); 
            // InternalVampireLanguage.g:644:3: ( rule__VLSBinary__Group__0 )
            // InternalVampireLanguage.g:644:4: rule__VLSBinary__Group__0
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
    // InternalVampireLanguage.g:653:1: entryRuleVLSUnitaryFormula : ruleVLSUnitaryFormula EOF ;
    public final void entryRuleVLSUnitaryFormula() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:654:1: ( ruleVLSUnitaryFormula EOF )
            // InternalVampireLanguage.g:655:1: ruleVLSUnitaryFormula EOF
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
    // InternalVampireLanguage.g:662:1: ruleVLSUnitaryFormula : ( ( rule__VLSUnitaryFormula__Alternatives ) ) ;
    public final void ruleVLSUnitaryFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:666:2: ( ( ( rule__VLSUnitaryFormula__Alternatives ) ) )
            // InternalVampireLanguage.g:667:2: ( ( rule__VLSUnitaryFormula__Alternatives ) )
            {
            // InternalVampireLanguage.g:667:2: ( ( rule__VLSUnitaryFormula__Alternatives ) )
            // InternalVampireLanguage.g:668:3: ( rule__VLSUnitaryFormula__Alternatives )
            {
             before(grammarAccess.getVLSUnitaryFormulaAccess().getAlternatives()); 
            // InternalVampireLanguage.g:669:3: ( rule__VLSUnitaryFormula__Alternatives )
            // InternalVampireLanguage.g:669:4: rule__VLSUnitaryFormula__Alternatives
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
    // InternalVampireLanguage.g:678:1: entryRuleVLSUniversalQuantifier : ruleVLSUniversalQuantifier EOF ;
    public final void entryRuleVLSUniversalQuantifier() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:679:1: ( ruleVLSUniversalQuantifier EOF )
            // InternalVampireLanguage.g:680:1: ruleVLSUniversalQuantifier EOF
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
    // InternalVampireLanguage.g:687:1: ruleVLSUniversalQuantifier : ( ( rule__VLSUniversalQuantifier__Group__0 ) ) ;
    public final void ruleVLSUniversalQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:691:2: ( ( ( rule__VLSUniversalQuantifier__Group__0 ) ) )
            // InternalVampireLanguage.g:692:2: ( ( rule__VLSUniversalQuantifier__Group__0 ) )
            {
            // InternalVampireLanguage.g:692:2: ( ( rule__VLSUniversalQuantifier__Group__0 ) )
            // InternalVampireLanguage.g:693:3: ( rule__VLSUniversalQuantifier__Group__0 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup()); 
            // InternalVampireLanguage.g:694:3: ( rule__VLSUniversalQuantifier__Group__0 )
            // InternalVampireLanguage.g:694:4: rule__VLSUniversalQuantifier__Group__0
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
    // InternalVampireLanguage.g:703:1: entryRuleVLSExistentialQuantifier : ruleVLSExistentialQuantifier EOF ;
    public final void entryRuleVLSExistentialQuantifier() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:704:1: ( ruleVLSExistentialQuantifier EOF )
            // InternalVampireLanguage.g:705:1: ruleVLSExistentialQuantifier EOF
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
    // InternalVampireLanguage.g:712:1: ruleVLSExistentialQuantifier : ( ( rule__VLSExistentialQuantifier__Group__0 ) ) ;
    public final void ruleVLSExistentialQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:716:2: ( ( ( rule__VLSExistentialQuantifier__Group__0 ) ) )
            // InternalVampireLanguage.g:717:2: ( ( rule__VLSExistentialQuantifier__Group__0 ) )
            {
            // InternalVampireLanguage.g:717:2: ( ( rule__VLSExistentialQuantifier__Group__0 ) )
            // InternalVampireLanguage.g:718:3: ( rule__VLSExistentialQuantifier__Group__0 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup()); 
            // InternalVampireLanguage.g:719:3: ( rule__VLSExistentialQuantifier__Group__0 )
            // InternalVampireLanguage.g:719:4: rule__VLSExistentialQuantifier__Group__0
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
    // InternalVampireLanguage.g:728:1: entryRuleVLSUnaryNegation : ruleVLSUnaryNegation EOF ;
    public final void entryRuleVLSUnaryNegation() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:729:1: ( ruleVLSUnaryNegation EOF )
            // InternalVampireLanguage.g:730:1: ruleVLSUnaryNegation EOF
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
    // InternalVampireLanguage.g:737:1: ruleVLSUnaryNegation : ( ( rule__VLSUnaryNegation__Group__0 ) ) ;
    public final void ruleVLSUnaryNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:741:2: ( ( ( rule__VLSUnaryNegation__Group__0 ) ) )
            // InternalVampireLanguage.g:742:2: ( ( rule__VLSUnaryNegation__Group__0 ) )
            {
            // InternalVampireLanguage.g:742:2: ( ( rule__VLSUnaryNegation__Group__0 ) )
            // InternalVampireLanguage.g:743:3: ( rule__VLSUnaryNegation__Group__0 )
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getGroup()); 
            // InternalVampireLanguage.g:744:3: ( rule__VLSUnaryNegation__Group__0 )
            // InternalVampireLanguage.g:744:4: rule__VLSUnaryNegation__Group__0
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
    // InternalVampireLanguage.g:753:1: entryRuleVLSUnaryInfix : ruleVLSUnaryInfix EOF ;
    public final void entryRuleVLSUnaryInfix() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:754:1: ( ruleVLSUnaryInfix EOF )
            // InternalVampireLanguage.g:755:1: ruleVLSUnaryInfix EOF
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
    // InternalVampireLanguage.g:762:1: ruleVLSUnaryInfix : ( ( rule__VLSUnaryInfix__Group__0 ) ) ;
    public final void ruleVLSUnaryInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:766:2: ( ( ( rule__VLSUnaryInfix__Group__0 ) ) )
            // InternalVampireLanguage.g:767:2: ( ( rule__VLSUnaryInfix__Group__0 ) )
            {
            // InternalVampireLanguage.g:767:2: ( ( rule__VLSUnaryInfix__Group__0 ) )
            // InternalVampireLanguage.g:768:3: ( rule__VLSUnaryInfix__Group__0 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getGroup()); 
            // InternalVampireLanguage.g:769:3: ( rule__VLSUnaryInfix__Group__0 )
            // InternalVampireLanguage.g:769:4: rule__VLSUnaryInfix__Group__0
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


    // $ANTLR start "entryRuleVLSFunction"
    // InternalVampireLanguage.g:778:1: entryRuleVLSFunction : ruleVLSFunction EOF ;
    public final void entryRuleVLSFunction() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:779:1: ( ruleVLSFunction EOF )
            // InternalVampireLanguage.g:780:1: ruleVLSFunction EOF
            {
             before(grammarAccess.getVLSFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSFunction();

            state._fsp--;

             after(grammarAccess.getVLSFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSFunction"


    // $ANTLR start "ruleVLSFunction"
    // InternalVampireLanguage.g:787:1: ruleVLSFunction : ( ( rule__VLSFunction__Group__0 ) ) ;
    public final void ruleVLSFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:791:2: ( ( ( rule__VLSFunction__Group__0 ) ) )
            // InternalVampireLanguage.g:792:2: ( ( rule__VLSFunction__Group__0 ) )
            {
            // InternalVampireLanguage.g:792:2: ( ( rule__VLSFunction__Group__0 ) )
            // InternalVampireLanguage.g:793:3: ( rule__VLSFunction__Group__0 )
            {
             before(grammarAccess.getVLSFunctionAccess().getGroup()); 
            // InternalVampireLanguage.g:794:3: ( rule__VLSFunction__Group__0 )
            // InternalVampireLanguage.g:794:4: rule__VLSFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSFunction"


    // $ANTLR start "entryRuleVLSFofTerm"
    // InternalVampireLanguage.g:803:1: entryRuleVLSFofTerm : ruleVLSFofTerm EOF ;
    public final void entryRuleVLSFofTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:804:1: ( ruleVLSFofTerm EOF )
            // InternalVampireLanguage.g:805:1: ruleVLSFofTerm EOF
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
    // InternalVampireLanguage.g:812:1: ruleVLSFofTerm : ( ( rule__VLSFofTerm__Alternatives ) ) ;
    public final void ruleVLSFofTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:816:2: ( ( ( rule__VLSFofTerm__Alternatives ) ) )
            // InternalVampireLanguage.g:817:2: ( ( rule__VLSFofTerm__Alternatives ) )
            {
            // InternalVampireLanguage.g:817:2: ( ( rule__VLSFofTerm__Alternatives ) )
            // InternalVampireLanguage.g:818:3: ( rule__VLSFofTerm__Alternatives )
            {
             before(grammarAccess.getVLSFofTermAccess().getAlternatives()); 
            // InternalVampireLanguage.g:819:3: ( rule__VLSFofTerm__Alternatives )
            // InternalVampireLanguage.g:819:4: rule__VLSFofTerm__Alternatives
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
    // InternalVampireLanguage.g:828:1: entryRuleVLSVariable : ruleVLSVariable EOF ;
    public final void entryRuleVLSVariable() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:829:1: ( ruleVLSVariable EOF )
            // InternalVampireLanguage.g:830:1: ruleVLSVariable EOF
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
    // InternalVampireLanguage.g:837:1: ruleVLSVariable : ( ( rule__VLSVariable__NameAssignment ) ) ;
    public final void ruleVLSVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:841:2: ( ( ( rule__VLSVariable__NameAssignment ) ) )
            // InternalVampireLanguage.g:842:2: ( ( rule__VLSVariable__NameAssignment ) )
            {
            // InternalVampireLanguage.g:842:2: ( ( rule__VLSVariable__NameAssignment ) )
            // InternalVampireLanguage.g:843:3: ( rule__VLSVariable__NameAssignment )
            {
             before(grammarAccess.getVLSVariableAccess().getNameAssignment()); 
            // InternalVampireLanguage.g:844:3: ( rule__VLSVariable__NameAssignment )
            // InternalVampireLanguage.g:844:4: rule__VLSVariable__NameAssignment
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
    // InternalVampireLanguage.g:853:1: entryRuleVLSFunctionFof : ruleVLSFunctionFof EOF ;
    public final void entryRuleVLSFunctionFof() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:854:1: ( ruleVLSFunctionFof EOF )
            // InternalVampireLanguage.g:855:1: ruleVLSFunctionFof EOF
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
    // InternalVampireLanguage.g:862:1: ruleVLSFunctionFof : ( ( rule__VLSFunctionFof__Group__0 ) ) ;
    public final void ruleVLSFunctionFof() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:866:2: ( ( ( rule__VLSFunctionFof__Group__0 ) ) )
            // InternalVampireLanguage.g:867:2: ( ( rule__VLSFunctionFof__Group__0 ) )
            {
            // InternalVampireLanguage.g:867:2: ( ( rule__VLSFunctionFof__Group__0 ) )
            // InternalVampireLanguage.g:868:3: ( rule__VLSFunctionFof__Group__0 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getGroup()); 
            // InternalVampireLanguage.g:869:3: ( rule__VLSFunctionFof__Group__0 )
            // InternalVampireLanguage.g:869:4: rule__VLSFunctionFof__Group__0
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
    // InternalVampireLanguage.g:878:1: entryRuleVLSDefinedTerm : ruleVLSDefinedTerm EOF ;
    public final void entryRuleVLSDefinedTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:879:1: ( ruleVLSDefinedTerm EOF )
            // InternalVampireLanguage.g:880:1: ruleVLSDefinedTerm EOF
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
    // InternalVampireLanguage.g:887:1: ruleVLSDefinedTerm : ( ( rule__VLSDefinedTerm__NameAssignment ) ) ;
    public final void ruleVLSDefinedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:891:2: ( ( ( rule__VLSDefinedTerm__NameAssignment ) ) )
            // InternalVampireLanguage.g:892:2: ( ( rule__VLSDefinedTerm__NameAssignment ) )
            {
            // InternalVampireLanguage.g:892:2: ( ( rule__VLSDefinedTerm__NameAssignment ) )
            // InternalVampireLanguage.g:893:3: ( rule__VLSDefinedTerm__NameAssignment )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getNameAssignment()); 
            // InternalVampireLanguage.g:894:3: ( rule__VLSDefinedTerm__NameAssignment )
            // InternalVampireLanguage.g:894:4: rule__VLSDefinedTerm__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VLSDefinedTerm__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVLSDefinedTermAccess().getNameAssignment()); 

            }


            }

        }
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
    // InternalVampireLanguage.g:902:1: rule__VampireModel__Alternatives : ( ( ( rule__VampireModel__CommentsAssignment_0 ) ) | ( ( rule__VampireModel__FormulasAssignment_1 ) ) );
    public final void rule__VampireModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:906:1: ( ( ( rule__VampireModel__CommentsAssignment_0 ) ) | ( ( rule__VampireModel__FormulasAssignment_1 ) ) )
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
                    // InternalVampireLanguage.g:907:2: ( ( rule__VampireModel__CommentsAssignment_0 ) )
                    {
                    // InternalVampireLanguage.g:907:2: ( ( rule__VampireModel__CommentsAssignment_0 ) )
                    // InternalVampireLanguage.g:908:3: ( rule__VampireModel__CommentsAssignment_0 )
                    {
                     before(grammarAccess.getVampireModelAccess().getCommentsAssignment_0()); 
                    // InternalVampireLanguage.g:909:3: ( rule__VampireModel__CommentsAssignment_0 )
                    // InternalVampireLanguage.g:909:4: rule__VampireModel__CommentsAssignment_0
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
                    // InternalVampireLanguage.g:913:2: ( ( rule__VampireModel__FormulasAssignment_1 ) )
                    {
                    // InternalVampireLanguage.g:913:2: ( ( rule__VampireModel__FormulasAssignment_1 ) )
                    // InternalVampireLanguage.g:914:3: ( rule__VampireModel__FormulasAssignment_1 )
                    {
                     before(grammarAccess.getVampireModelAccess().getFormulasAssignment_1()); 
                    // InternalVampireLanguage.g:915:3: ( rule__VampireModel__FormulasAssignment_1 )
                    // InternalVampireLanguage.g:915:4: rule__VampireModel__FormulasAssignment_1
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


    // $ANTLR start "rule__VLSFunctionDeclaration__NameAlternatives_0"
    // InternalVampireLanguage.g:923:1: rule__VLSFunctionDeclaration__NameAlternatives_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) );
    public final void rule__VLSFunctionDeclaration__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:927:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) )
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
            case RULE_DOLLAR_ID:
                {
                alt3=3;
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
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
                    // InternalVampireLanguage.g:928:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:928:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:929:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSFunctionDeclarationAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionDeclarationAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:934:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:934:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:935:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSFunctionDeclarationAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionDeclarationAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:940:2: ( RULE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:940:2: ( RULE_DOLLAR_ID )
                    // InternalVampireLanguage.g:941:3: RULE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSFunctionDeclarationAccess().getNameDOLLAR_IDTerminalRuleCall_0_2()); 
                    match(input,RULE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionDeclarationAccess().getNameDOLLAR_IDTerminalRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:946:2: ( RULE_DOUBLE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:946:2: ( RULE_DOUBLE_DOLLAR_ID )
                    // InternalVampireLanguage.g:947:3: RULE_DOUBLE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSFunctionDeclarationAccess().getNameDOUBLE_DOLLAR_IDTerminalRuleCall_0_3()); 
                    match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionDeclarationAccess().getNameDOUBLE_DOLLAR_IDTerminalRuleCall_0_3()); 

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
    // $ANTLR end "rule__VLSFunctionDeclaration__NameAlternatives_0"


    // $ANTLR start "rule__VLSFofFormula__NameAlternatives_2_0"
    // InternalVampireLanguage.g:956:1: rule__VLSFofFormula__NameAlternatives_2_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SIGNED_LITERAL ) | ( RULE_SINGLE_QUOTE ) );
    public final void rule__VLSFofFormula__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:960:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SIGNED_LITERAL ) | ( RULE_SINGLE_QUOTE ) )
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
                    // InternalVampireLanguage.g:961:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:961:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:962:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSFofFormulaAccess().getNameLOWER_WORD_IDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFofFormulaAccess().getNameLOWER_WORD_IDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:967:2: ( RULE_SIGNED_LITERAL )
                    {
                    // InternalVampireLanguage.g:967:2: ( RULE_SIGNED_LITERAL )
                    // InternalVampireLanguage.g:968:3: RULE_SIGNED_LITERAL
                    {
                     before(grammarAccess.getVLSFofFormulaAccess().getNameSIGNED_LITERALTerminalRuleCall_2_0_1()); 
                    match(input,RULE_SIGNED_LITERAL,FOLLOW_2); 
                     after(grammarAccess.getVLSFofFormulaAccess().getNameSIGNED_LITERALTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:973:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:973:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:974:3: RULE_SINGLE_QUOTE
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
    // InternalVampireLanguage.g:983:1: rule__VLSRole__Alternatives : ( ( ruleVLSAxiom ) | ( ruleVLSConjecture ) | ( ruleVLSHypothesis ) | ( ruleVLSDefinition ) | ( ruleVLSAssumption ) | ( ruleVLSLemma ) | ( ruleVLSTheorem ) | ( ruleVLSCorollary ) | ( ruleVLSNegated_Conjecture ) | ( ruleVLSPlain ) | ( ruleVLSType ) | ( ruleVLSFi_Domain ) | ( ruleVLSFi_Functors ) | ( ruleVLSFi_Predicates ) | ( ruleVLSUnknown ) );
    public final void rule__VLSRole__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:987:1: ( ( ruleVLSAxiom ) | ( ruleVLSConjecture ) | ( ruleVLSHypothesis ) | ( ruleVLSDefinition ) | ( ruleVLSAssumption ) | ( ruleVLSLemma ) | ( ruleVLSTheorem ) | ( ruleVLSCorollary ) | ( ruleVLSNegated_Conjecture ) | ( ruleVLSPlain ) | ( ruleVLSType ) | ( ruleVLSFi_Domain ) | ( ruleVLSFi_Functors ) | ( ruleVLSFi_Predicates ) | ( ruleVLSUnknown ) )
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
                    // InternalVampireLanguage.g:988:2: ( ruleVLSAxiom )
                    {
                    // InternalVampireLanguage.g:988:2: ( ruleVLSAxiom )
                    // InternalVampireLanguage.g:989:3: ruleVLSAxiom
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
                    // InternalVampireLanguage.g:994:2: ( ruleVLSConjecture )
                    {
                    // InternalVampireLanguage.g:994:2: ( ruleVLSConjecture )
                    // InternalVampireLanguage.g:995:3: ruleVLSConjecture
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
                    // InternalVampireLanguage.g:1000:2: ( ruleVLSHypothesis )
                    {
                    // InternalVampireLanguage.g:1000:2: ( ruleVLSHypothesis )
                    // InternalVampireLanguage.g:1001:3: ruleVLSHypothesis
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
                    // InternalVampireLanguage.g:1006:2: ( ruleVLSDefinition )
                    {
                    // InternalVampireLanguage.g:1006:2: ( ruleVLSDefinition )
                    // InternalVampireLanguage.g:1007:3: ruleVLSDefinition
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
                    // InternalVampireLanguage.g:1012:2: ( ruleVLSAssumption )
                    {
                    // InternalVampireLanguage.g:1012:2: ( ruleVLSAssumption )
                    // InternalVampireLanguage.g:1013:3: ruleVLSAssumption
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
                    // InternalVampireLanguage.g:1018:2: ( ruleVLSLemma )
                    {
                    // InternalVampireLanguage.g:1018:2: ( ruleVLSLemma )
                    // InternalVampireLanguage.g:1019:3: ruleVLSLemma
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
                    // InternalVampireLanguage.g:1024:2: ( ruleVLSTheorem )
                    {
                    // InternalVampireLanguage.g:1024:2: ( ruleVLSTheorem )
                    // InternalVampireLanguage.g:1025:3: ruleVLSTheorem
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
                    // InternalVampireLanguage.g:1030:2: ( ruleVLSCorollary )
                    {
                    // InternalVampireLanguage.g:1030:2: ( ruleVLSCorollary )
                    // InternalVampireLanguage.g:1031:3: ruleVLSCorollary
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
                    // InternalVampireLanguage.g:1036:2: ( ruleVLSNegated_Conjecture )
                    {
                    // InternalVampireLanguage.g:1036:2: ( ruleVLSNegated_Conjecture )
                    // InternalVampireLanguage.g:1037:3: ruleVLSNegated_Conjecture
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
                    // InternalVampireLanguage.g:1042:2: ( ruleVLSPlain )
                    {
                    // InternalVampireLanguage.g:1042:2: ( ruleVLSPlain )
                    // InternalVampireLanguage.g:1043:3: ruleVLSPlain
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
                    // InternalVampireLanguage.g:1048:2: ( ruleVLSType )
                    {
                    // InternalVampireLanguage.g:1048:2: ( ruleVLSType )
                    // InternalVampireLanguage.g:1049:3: ruleVLSType
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
                    // InternalVampireLanguage.g:1054:2: ( ruleVLSFi_Domain )
                    {
                    // InternalVampireLanguage.g:1054:2: ( ruleVLSFi_Domain )
                    // InternalVampireLanguage.g:1055:3: ruleVLSFi_Domain
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
                    // InternalVampireLanguage.g:1060:2: ( ruleVLSFi_Functors )
                    {
                    // InternalVampireLanguage.g:1060:2: ( ruleVLSFi_Functors )
                    // InternalVampireLanguage.g:1061:3: ruleVLSFi_Functors
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
                    // InternalVampireLanguage.g:1066:2: ( ruleVLSFi_Predicates )
                    {
                    // InternalVampireLanguage.g:1066:2: ( ruleVLSFi_Predicates )
                    // InternalVampireLanguage.g:1067:3: ruleVLSFi_Predicates
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
                    // InternalVampireLanguage.g:1072:2: ( ruleVLSUnknown )
                    {
                    // InternalVampireLanguage.g:1072:2: ( ruleVLSUnknown )
                    // InternalVampireLanguage.g:1073:3: ruleVLSUnknown
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
    // InternalVampireLanguage.g:1082:1: rule__VLSAnnotation__NameAlternatives_1_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( ruleVLSRole ) );
    public final void rule__VLSAnnotation__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1086:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( ruleVLSRole ) )
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
                    // InternalVampireLanguage.g:1087:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1087:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1088:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSAnnotationAccess().getNameLOWER_WORD_IDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAnnotationAccess().getNameLOWER_WORD_IDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1093:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1093:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1094:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSAnnotationAccess().getNameSINGLE_QUOTETerminalRuleCall_1_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSAnnotationAccess().getNameSINGLE_QUOTETerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1099:2: ( ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:1099:2: ( ruleVLSRole )
                    // InternalVampireLanguage.g:1100:3: ruleVLSRole
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
    // InternalVampireLanguage.g:1109:1: rule__VLSBinary__Alternatives_1 : ( ( ( rule__VLSBinary__Group_1_0__0 ) ) | ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) ) | ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) ) );
    public final void rule__VLSBinary__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1113:1: ( ( ( rule__VLSBinary__Group_1_0__0 ) ) | ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) ) | ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                {
                alt9=1;
                }
                break;
            case 55:
                {
                alt9=2;
                }
                break;
            case 56:
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
                    // InternalVampireLanguage.g:1114:2: ( ( rule__VLSBinary__Group_1_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1114:2: ( ( rule__VLSBinary__Group_1_0__0 ) )
                    // InternalVampireLanguage.g:1115:3: ( rule__VLSBinary__Group_1_0__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0()); 
                    // InternalVampireLanguage.g:1116:3: ( rule__VLSBinary__Group_1_0__0 )
                    // InternalVampireLanguage.g:1116:4: rule__VLSBinary__Group_1_0__0
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
                    // InternalVampireLanguage.g:1120:2: ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) )
                    {
                    // InternalVampireLanguage.g:1120:2: ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) )
                    // InternalVampireLanguage.g:1121:3: ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* )
                    {
                    // InternalVampireLanguage.g:1121:3: ( ( rule__VLSBinary__Group_1_1__0 ) )
                    // InternalVampireLanguage.g:1122:4: ( rule__VLSBinary__Group_1_1__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 
                    // InternalVampireLanguage.g:1123:4: ( rule__VLSBinary__Group_1_1__0 )
                    // InternalVampireLanguage.g:1123:5: rule__VLSBinary__Group_1_1__0
                    {
                    pushFollow(FOLLOW_4);
                    rule__VLSBinary__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 

                    }

                    // InternalVampireLanguage.g:1126:3: ( ( rule__VLSBinary__Group_1_1__0 )* )
                    // InternalVampireLanguage.g:1127:4: ( rule__VLSBinary__Group_1_1__0 )*
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 
                    // InternalVampireLanguage.g:1128:4: ( rule__VLSBinary__Group_1_1__0 )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==55) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1128:5: rule__VLSBinary__Group_1_1__0
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
                    // InternalVampireLanguage.g:1133:2: ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) )
                    {
                    // InternalVampireLanguage.g:1133:2: ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) )
                    // InternalVampireLanguage.g:1134:3: ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* )
                    {
                    // InternalVampireLanguage.g:1134:3: ( ( rule__VLSBinary__Group_1_2__0 ) )
                    // InternalVampireLanguage.g:1135:4: ( rule__VLSBinary__Group_1_2__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 
                    // InternalVampireLanguage.g:1136:4: ( rule__VLSBinary__Group_1_2__0 )
                    // InternalVampireLanguage.g:1136:5: rule__VLSBinary__Group_1_2__0
                    {
                    pushFollow(FOLLOW_5);
                    rule__VLSBinary__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 

                    }

                    // InternalVampireLanguage.g:1139:3: ( ( rule__VLSBinary__Group_1_2__0 )* )
                    // InternalVampireLanguage.g:1140:4: ( rule__VLSBinary__Group_1_2__0 )*
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 
                    // InternalVampireLanguage.g:1141:4: ( rule__VLSBinary__Group_1_2__0 )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==56) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1141:5: rule__VLSBinary__Group_1_2__0
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
    // InternalVampireLanguage.g:1150:1: rule__VLSBinary__Alternatives_1_0_0 : ( ( ( rule__VLSBinary__Group_1_0_0_0__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_1__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_2__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_3__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_4__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_5__0 ) ) );
    public final void rule__VLSBinary__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1154:1: ( ( ( rule__VLSBinary__Group_1_0_0_0__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_1__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_2__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_3__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_4__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_5__0 ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt10=1;
                }
                break;
            case 50:
                {
                alt10=2;
                }
                break;
            case 51:
                {
                alt10=3;
                }
                break;
            case 52:
                {
                alt10=4;
                }
                break;
            case 53:
                {
                alt10=5;
                }
                break;
            case 54:
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
                    // InternalVampireLanguage.g:1155:2: ( ( rule__VLSBinary__Group_1_0_0_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1155:2: ( ( rule__VLSBinary__Group_1_0_0_0__0 ) )
                    // InternalVampireLanguage.g:1156:3: ( rule__VLSBinary__Group_1_0_0_0__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_0()); 
                    // InternalVampireLanguage.g:1157:3: ( rule__VLSBinary__Group_1_0_0_0__0 )
                    // InternalVampireLanguage.g:1157:4: rule__VLSBinary__Group_1_0_0_0__0
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
                    // InternalVampireLanguage.g:1161:2: ( ( rule__VLSBinary__Group_1_0_0_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1161:2: ( ( rule__VLSBinary__Group_1_0_0_1__0 ) )
                    // InternalVampireLanguage.g:1162:3: ( rule__VLSBinary__Group_1_0_0_1__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_1()); 
                    // InternalVampireLanguage.g:1163:3: ( rule__VLSBinary__Group_1_0_0_1__0 )
                    // InternalVampireLanguage.g:1163:4: rule__VLSBinary__Group_1_0_0_1__0
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
                    // InternalVampireLanguage.g:1167:2: ( ( rule__VLSBinary__Group_1_0_0_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1167:2: ( ( rule__VLSBinary__Group_1_0_0_2__0 ) )
                    // InternalVampireLanguage.g:1168:3: ( rule__VLSBinary__Group_1_0_0_2__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_2()); 
                    // InternalVampireLanguage.g:1169:3: ( rule__VLSBinary__Group_1_0_0_2__0 )
                    // InternalVampireLanguage.g:1169:4: rule__VLSBinary__Group_1_0_0_2__0
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
                    // InternalVampireLanguage.g:1173:2: ( ( rule__VLSBinary__Group_1_0_0_3__0 ) )
                    {
                    // InternalVampireLanguage.g:1173:2: ( ( rule__VLSBinary__Group_1_0_0_3__0 ) )
                    // InternalVampireLanguage.g:1174:3: ( rule__VLSBinary__Group_1_0_0_3__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_3()); 
                    // InternalVampireLanguage.g:1175:3: ( rule__VLSBinary__Group_1_0_0_3__0 )
                    // InternalVampireLanguage.g:1175:4: rule__VLSBinary__Group_1_0_0_3__0
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
                    // InternalVampireLanguage.g:1179:2: ( ( rule__VLSBinary__Group_1_0_0_4__0 ) )
                    {
                    // InternalVampireLanguage.g:1179:2: ( ( rule__VLSBinary__Group_1_0_0_4__0 ) )
                    // InternalVampireLanguage.g:1180:3: ( rule__VLSBinary__Group_1_0_0_4__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_4()); 
                    // InternalVampireLanguage.g:1181:3: ( rule__VLSBinary__Group_1_0_0_4__0 )
                    // InternalVampireLanguage.g:1181:4: rule__VLSBinary__Group_1_0_0_4__0
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
                    // InternalVampireLanguage.g:1185:2: ( ( rule__VLSBinary__Group_1_0_0_5__0 ) )
                    {
                    // InternalVampireLanguage.g:1185:2: ( ( rule__VLSBinary__Group_1_0_0_5__0 ) )
                    // InternalVampireLanguage.g:1186:3: ( rule__VLSBinary__Group_1_0_0_5__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_5()); 
                    // InternalVampireLanguage.g:1187:3: ( rule__VLSBinary__Group_1_0_0_5__0 )
                    // InternalVampireLanguage.g:1187:4: rule__VLSBinary__Group_1_0_0_5__0
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
    // InternalVampireLanguage.g:1195:1: rule__VLSUnitaryFormula__Alternatives : ( ( ruleVLSUniversalQuantifier ) | ( ruleVLSExistentialQuantifier ) | ( ruleVLSUnaryNegation ) | ( ruleVLSUnaryInfix ) | ( ( rule__VLSUnitaryFormula__Group_4__0 ) ) );
    public final void rule__VLSUnitaryFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1199:1: ( ( ruleVLSUniversalQuantifier ) | ( ruleVLSExistentialQuantifier ) | ( ruleVLSUnaryNegation ) | ( ruleVLSUnaryInfix ) | ( ( rule__VLSUnitaryFormula__Group_4__0 ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt11=1;
                }
                break;
            case 59:
                {
                alt11=2;
                }
                break;
            case 60:
                {
                alt11=3;
                }
                break;
            case RULE_LOWER_WORD_ID:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt11=4;
                }
                break;
            case 43:
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
                    // InternalVampireLanguage.g:1200:2: ( ruleVLSUniversalQuantifier )
                    {
                    // InternalVampireLanguage.g:1200:2: ( ruleVLSUniversalQuantifier )
                    // InternalVampireLanguage.g:1201:3: ruleVLSUniversalQuantifier
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
                    // InternalVampireLanguage.g:1206:2: ( ruleVLSExistentialQuantifier )
                    {
                    // InternalVampireLanguage.g:1206:2: ( ruleVLSExistentialQuantifier )
                    // InternalVampireLanguage.g:1207:3: ruleVLSExistentialQuantifier
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
                    // InternalVampireLanguage.g:1212:2: ( ruleVLSUnaryNegation )
                    {
                    // InternalVampireLanguage.g:1212:2: ( ruleVLSUnaryNegation )
                    // InternalVampireLanguage.g:1213:3: ruleVLSUnaryNegation
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
                    // InternalVampireLanguage.g:1218:2: ( ruleVLSUnaryInfix )
                    {
                    // InternalVampireLanguage.g:1218:2: ( ruleVLSUnaryInfix )
                    // InternalVampireLanguage.g:1219:3: ruleVLSUnaryInfix
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
                    // InternalVampireLanguage.g:1224:2: ( ( rule__VLSUnitaryFormula__Group_4__0 ) )
                    {
                    // InternalVampireLanguage.g:1224:2: ( ( rule__VLSUnitaryFormula__Group_4__0 ) )
                    // InternalVampireLanguage.g:1225:3: ( rule__VLSUnitaryFormula__Group_4__0 )
                    {
                     before(grammarAccess.getVLSUnitaryFormulaAccess().getGroup_4()); 
                    // InternalVampireLanguage.g:1226:3: ( rule__VLSUnitaryFormula__Group_4__0 )
                    // InternalVampireLanguage.g:1226:4: rule__VLSUnitaryFormula__Group_4__0
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
    // InternalVampireLanguage.g:1234:1: rule__VLSUnaryInfix__Alternatives_1_0 : ( ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) ) );
    public final void rule__VLSUnaryInfix__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1238:1: ( ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt12=1;
                }
                break;
            case 62:
                {
                alt12=2;
                }
                break;
            case 63:
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
                    // InternalVampireLanguage.g:1239:2: ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1239:2: ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) )
                    // InternalVampireLanguage.g:1240:3: ( rule__VLSUnaryInfix__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_0()); 
                    // InternalVampireLanguage.g:1241:3: ( rule__VLSUnaryInfix__Group_1_0_0__0 )
                    // InternalVampireLanguage.g:1241:4: rule__VLSUnaryInfix__Group_1_0_0__0
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
                    // InternalVampireLanguage.g:1245:2: ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1245:2: ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) )
                    // InternalVampireLanguage.g:1246:3: ( rule__VLSUnaryInfix__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_1()); 
                    // InternalVampireLanguage.g:1247:3: ( rule__VLSUnaryInfix__Group_1_0_1__0 )
                    // InternalVampireLanguage.g:1247:4: rule__VLSUnaryInfix__Group_1_0_1__0
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
                    // InternalVampireLanguage.g:1251:2: ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1251:2: ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) )
                    // InternalVampireLanguage.g:1252:3: ( rule__VLSUnaryInfix__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_2()); 
                    // InternalVampireLanguage.g:1253:3: ( rule__VLSUnaryInfix__Group_1_0_2__0 )
                    // InternalVampireLanguage.g:1253:4: rule__VLSUnaryInfix__Group_1_0_2__0
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


    // $ANTLR start "rule__VLSFofTerm__Alternatives"
    // InternalVampireLanguage.g:1261:1: rule__VLSFofTerm__Alternatives : ( ( ruleVLSVariable ) | ( ruleVLSFunctionFof ) | ( ruleVLSDefinedTerm ) );
    public final void rule__VLSFofTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1265:1: ( ( ruleVLSVariable ) | ( ruleVLSFunctionFof ) | ( ruleVLSDefinedTerm ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_UPPER_WORD_ID:
                {
                alt13=1;
                }
                break;
            case RULE_LOWER_WORD_ID:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt13=2;
                }
                break;
            case RULE_SIGNED_LITERAL:
            case RULE_DOUBLE_QUOTE:
            case RULE_SIGNED_REAL_ID:
            case RULE_SIGNED_RAT_ID:
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
                    // InternalVampireLanguage.g:1266:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1266:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1267:3: ruleVLSVariable
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
                    // InternalVampireLanguage.g:1272:2: ( ruleVLSFunctionFof )
                    {
                    // InternalVampireLanguage.g:1272:2: ( ruleVLSFunctionFof )
                    // InternalVampireLanguage.g:1273:3: ruleVLSFunctionFof
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
                    // InternalVampireLanguage.g:1278:2: ( ruleVLSDefinedTerm )
                    {
                    // InternalVampireLanguage.g:1278:2: ( ruleVLSDefinedTerm )
                    // InternalVampireLanguage.g:1279:3: ruleVLSDefinedTerm
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


    // $ANTLR start "rule__VLSDefinedTerm__NameAlternatives_0"
    // InternalVampireLanguage.g:1288:1: rule__VLSDefinedTerm__NameAlternatives_0 : ( ( RULE_DOUBLE_QUOTE ) | ( RULE_SIGNED_LITERAL ) | ( RULE_SIGNED_REAL_ID ) | ( RULE_SIGNED_RAT_ID ) );
    public final void rule__VLSDefinedTerm__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1292:1: ( ( RULE_DOUBLE_QUOTE ) | ( RULE_SIGNED_LITERAL ) | ( RULE_SIGNED_REAL_ID ) | ( RULE_SIGNED_RAT_ID ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE_QUOTE:
                {
                alt14=1;
                }
                break;
            case RULE_SIGNED_LITERAL:
                {
                alt14=2;
                }
                break;
            case RULE_SIGNED_REAL_ID:
                {
                alt14=3;
                }
                break;
            case RULE_SIGNED_RAT_ID:
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
                    // InternalVampireLanguage.g:1293:2: ( RULE_DOUBLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1293:2: ( RULE_DOUBLE_QUOTE )
                    // InternalVampireLanguage.g:1294:3: RULE_DOUBLE_QUOTE
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getNameDOUBLE_QUOTETerminalRuleCall_0_0()); 
                    match(input,RULE_DOUBLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSDefinedTermAccess().getNameDOUBLE_QUOTETerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1299:2: ( RULE_SIGNED_LITERAL )
                    {
                    // InternalVampireLanguage.g:1299:2: ( RULE_SIGNED_LITERAL )
                    // InternalVampireLanguage.g:1300:3: RULE_SIGNED_LITERAL
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getNameSIGNED_LITERALTerminalRuleCall_0_1()); 
                    match(input,RULE_SIGNED_LITERAL,FOLLOW_2); 
                     after(grammarAccess.getVLSDefinedTermAccess().getNameSIGNED_LITERALTerminalRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1305:2: ( RULE_SIGNED_REAL_ID )
                    {
                    // InternalVampireLanguage.g:1305:2: ( RULE_SIGNED_REAL_ID )
                    // InternalVampireLanguage.g:1306:3: RULE_SIGNED_REAL_ID
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getNameSIGNED_REAL_IDTerminalRuleCall_0_2()); 
                    match(input,RULE_SIGNED_REAL_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSDefinedTermAccess().getNameSIGNED_REAL_IDTerminalRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1311:2: ( RULE_SIGNED_RAT_ID )
                    {
                    // InternalVampireLanguage.g:1311:2: ( RULE_SIGNED_RAT_ID )
                    // InternalVampireLanguage.g:1312:3: RULE_SIGNED_RAT_ID
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getNameSIGNED_RAT_IDTerminalRuleCall_0_3()); 
                    match(input,RULE_SIGNED_RAT_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSDefinedTermAccess().getNameSIGNED_RAT_IDTerminalRuleCall_0_3()); 

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
    // $ANTLR end "rule__VLSDefinedTerm__NameAlternatives_0"


    // $ANTLR start "rule__VLSFofFormula__Group__0"
    // InternalVampireLanguage.g:1321:1: rule__VLSFofFormula__Group__0 : rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1 ;
    public final void rule__VLSFofFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1325:1: ( rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1 )
            // InternalVampireLanguage.g:1326:2: rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1
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
    // InternalVampireLanguage.g:1333:1: rule__VLSFofFormula__Group__0__Impl : ( 'fof' ) ;
    public final void rule__VLSFofFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1337:1: ( ( 'fof' ) )
            // InternalVampireLanguage.g:1338:1: ( 'fof' )
            {
            // InternalVampireLanguage.g:1338:1: ( 'fof' )
            // InternalVampireLanguage.g:1339:2: 'fof'
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
    // InternalVampireLanguage.g:1348:1: rule__VLSFofFormula__Group__1 : rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2 ;
    public final void rule__VLSFofFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1352:1: ( rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2 )
            // InternalVampireLanguage.g:1353:2: rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2
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
    // InternalVampireLanguage.g:1360:1: rule__VLSFofFormula__Group__1__Impl : ( '(' ) ;
    public final void rule__VLSFofFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1364:1: ( ( '(' ) )
            // InternalVampireLanguage.g:1365:1: ( '(' )
            {
            // InternalVampireLanguage.g:1365:1: ( '(' )
            // InternalVampireLanguage.g:1366:2: '('
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
    // InternalVampireLanguage.g:1375:1: rule__VLSFofFormula__Group__2 : rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3 ;
    public final void rule__VLSFofFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1379:1: ( rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3 )
            // InternalVampireLanguage.g:1380:2: rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3
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
    // InternalVampireLanguage.g:1387:1: rule__VLSFofFormula__Group__2__Impl : ( ( rule__VLSFofFormula__NameAssignment_2 ) ) ;
    public final void rule__VLSFofFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1391:1: ( ( ( rule__VLSFofFormula__NameAssignment_2 ) ) )
            // InternalVampireLanguage.g:1392:1: ( ( rule__VLSFofFormula__NameAssignment_2 ) )
            {
            // InternalVampireLanguage.g:1392:1: ( ( rule__VLSFofFormula__NameAssignment_2 ) )
            // InternalVampireLanguage.g:1393:2: ( rule__VLSFofFormula__NameAssignment_2 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getNameAssignment_2()); 
            // InternalVampireLanguage.g:1394:2: ( rule__VLSFofFormula__NameAssignment_2 )
            // InternalVampireLanguage.g:1394:3: rule__VLSFofFormula__NameAssignment_2
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
    // InternalVampireLanguage.g:1402:1: rule__VLSFofFormula__Group__3 : rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4 ;
    public final void rule__VLSFofFormula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1406:1: ( rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4 )
            // InternalVampireLanguage.g:1407:2: rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4
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
    // InternalVampireLanguage.g:1414:1: rule__VLSFofFormula__Group__3__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1418:1: ( ( ',' ) )
            // InternalVampireLanguage.g:1419:1: ( ',' )
            {
            // InternalVampireLanguage.g:1419:1: ( ',' )
            // InternalVampireLanguage.g:1420:2: ','
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
    // InternalVampireLanguage.g:1429:1: rule__VLSFofFormula__Group__4 : rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5 ;
    public final void rule__VLSFofFormula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1433:1: ( rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5 )
            // InternalVampireLanguage.g:1434:2: rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5
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
    // InternalVampireLanguage.g:1441:1: rule__VLSFofFormula__Group__4__Impl : ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) ) ;
    public final void rule__VLSFofFormula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1445:1: ( ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) ) )
            // InternalVampireLanguage.g:1446:1: ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) )
            {
            // InternalVampireLanguage.g:1446:1: ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) )
            // InternalVampireLanguage.g:1447:2: ( rule__VLSFofFormula__FofRoleAssignment_4 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofRoleAssignment_4()); 
            // InternalVampireLanguage.g:1448:2: ( rule__VLSFofFormula__FofRoleAssignment_4 )
            // InternalVampireLanguage.g:1448:3: rule__VLSFofFormula__FofRoleAssignment_4
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
    // InternalVampireLanguage.g:1456:1: rule__VLSFofFormula__Group__5 : rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6 ;
    public final void rule__VLSFofFormula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1460:1: ( rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6 )
            // InternalVampireLanguage.g:1461:2: rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6
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
    // InternalVampireLanguage.g:1468:1: rule__VLSFofFormula__Group__5__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1472:1: ( ( ',' ) )
            // InternalVampireLanguage.g:1473:1: ( ',' )
            {
            // InternalVampireLanguage.g:1473:1: ( ',' )
            // InternalVampireLanguage.g:1474:2: ','
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
    // InternalVampireLanguage.g:1483:1: rule__VLSFofFormula__Group__6 : rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7 ;
    public final void rule__VLSFofFormula__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1487:1: ( rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7 )
            // InternalVampireLanguage.g:1488:2: rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7
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
    // InternalVampireLanguage.g:1495:1: rule__VLSFofFormula__Group__6__Impl : ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) ) ;
    public final void rule__VLSFofFormula__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1499:1: ( ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) ) )
            // InternalVampireLanguage.g:1500:1: ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) )
            {
            // InternalVampireLanguage.g:1500:1: ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) )
            // InternalVampireLanguage.g:1501:2: ( rule__VLSFofFormula__FofFormulaAssignment_6 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofFormulaAssignment_6()); 
            // InternalVampireLanguage.g:1502:2: ( rule__VLSFofFormula__FofFormulaAssignment_6 )
            // InternalVampireLanguage.g:1502:3: rule__VLSFofFormula__FofFormulaAssignment_6
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
    // InternalVampireLanguage.g:1510:1: rule__VLSFofFormula__Group__7 : rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8 ;
    public final void rule__VLSFofFormula__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1514:1: ( rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8 )
            // InternalVampireLanguage.g:1515:2: rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8
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
    // InternalVampireLanguage.g:1522:1: rule__VLSFofFormula__Group__7__Impl : ( ( rule__VLSFofFormula__Group_7__0 )? ) ;
    public final void rule__VLSFofFormula__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1526:1: ( ( ( rule__VLSFofFormula__Group_7__0 )? ) )
            // InternalVampireLanguage.g:1527:1: ( ( rule__VLSFofFormula__Group_7__0 )? )
            {
            // InternalVampireLanguage.g:1527:1: ( ( rule__VLSFofFormula__Group_7__0 )? )
            // InternalVampireLanguage.g:1528:2: ( rule__VLSFofFormula__Group_7__0 )?
            {
             before(grammarAccess.getVLSFofFormulaAccess().getGroup_7()); 
            // InternalVampireLanguage.g:1529:2: ( rule__VLSFofFormula__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==44) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVampireLanguage.g:1529:3: rule__VLSFofFormula__Group_7__0
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
    // InternalVampireLanguage.g:1537:1: rule__VLSFofFormula__Group__8 : rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9 ;
    public final void rule__VLSFofFormula__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1541:1: ( rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9 )
            // InternalVampireLanguage.g:1542:2: rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9
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
    // InternalVampireLanguage.g:1549:1: rule__VLSFofFormula__Group__8__Impl : ( ')' ) ;
    public final void rule__VLSFofFormula__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1553:1: ( ( ')' ) )
            // InternalVampireLanguage.g:1554:1: ( ')' )
            {
            // InternalVampireLanguage.g:1554:1: ( ')' )
            // InternalVampireLanguage.g:1555:2: ')'
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
    // InternalVampireLanguage.g:1564:1: rule__VLSFofFormula__Group__9 : rule__VLSFofFormula__Group__9__Impl ;
    public final void rule__VLSFofFormula__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1568:1: ( rule__VLSFofFormula__Group__9__Impl )
            // InternalVampireLanguage.g:1569:2: rule__VLSFofFormula__Group__9__Impl
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
    // InternalVampireLanguage.g:1575:1: rule__VLSFofFormula__Group__9__Impl : ( '.' ) ;
    public final void rule__VLSFofFormula__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1579:1: ( ( '.' ) )
            // InternalVampireLanguage.g:1580:1: ( '.' )
            {
            // InternalVampireLanguage.g:1580:1: ( '.' )
            // InternalVampireLanguage.g:1581:2: '.'
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
    // InternalVampireLanguage.g:1591:1: rule__VLSFofFormula__Group_7__0 : rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1 ;
    public final void rule__VLSFofFormula__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1595:1: ( rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1 )
            // InternalVampireLanguage.g:1596:2: rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1
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
    // InternalVampireLanguage.g:1603:1: rule__VLSFofFormula__Group_7__0__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1607:1: ( ( ',' ) )
            // InternalVampireLanguage.g:1608:1: ( ',' )
            {
            // InternalVampireLanguage.g:1608:1: ( ',' )
            // InternalVampireLanguage.g:1609:2: ','
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
    // InternalVampireLanguage.g:1618:1: rule__VLSFofFormula__Group_7__1 : rule__VLSFofFormula__Group_7__1__Impl ;
    public final void rule__VLSFofFormula__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1622:1: ( rule__VLSFofFormula__Group_7__1__Impl )
            // InternalVampireLanguage.g:1623:2: rule__VLSFofFormula__Group_7__1__Impl
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
    // InternalVampireLanguage.g:1629:1: rule__VLSFofFormula__Group_7__1__Impl : ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) ) ;
    public final void rule__VLSFofFormula__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1633:1: ( ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) ) )
            // InternalVampireLanguage.g:1634:1: ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) )
            {
            // InternalVampireLanguage.g:1634:1: ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) )
            // InternalVampireLanguage.g:1635:2: ( rule__VLSFofFormula__AnnotationsAssignment_7_1 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getAnnotationsAssignment_7_1()); 
            // InternalVampireLanguage.g:1636:2: ( rule__VLSFofFormula__AnnotationsAssignment_7_1 )
            // InternalVampireLanguage.g:1636:3: rule__VLSFofFormula__AnnotationsAssignment_7_1
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
    // InternalVampireLanguage.g:1645:1: rule__VLSAnnotation__Group__0 : rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1 ;
    public final void rule__VLSAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1649:1: ( rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1 )
            // InternalVampireLanguage.g:1650:2: rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1
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
    // InternalVampireLanguage.g:1657:1: rule__VLSAnnotation__Group__0__Impl : ( ( '[' )? ) ;
    public final void rule__VLSAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1661:1: ( ( ( '[' )? ) )
            // InternalVampireLanguage.g:1662:1: ( ( '[' )? )
            {
            // InternalVampireLanguage.g:1662:1: ( ( '[' )? )
            // InternalVampireLanguage.g:1663:2: ( '[' )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getLeftSquareBracketKeyword_0()); 
            // InternalVampireLanguage.g:1664:2: ( '[' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==47) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVampireLanguage.g:1664:3: '['
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
    // InternalVampireLanguage.g:1672:1: rule__VLSAnnotation__Group__1 : rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2 ;
    public final void rule__VLSAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1676:1: ( rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2 )
            // InternalVampireLanguage.g:1677:2: rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2
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
    // InternalVampireLanguage.g:1684:1: rule__VLSAnnotation__Group__1__Impl : ( ( rule__VLSAnnotation__NameAssignment_1 )? ) ;
    public final void rule__VLSAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1688:1: ( ( ( rule__VLSAnnotation__NameAssignment_1 )? ) )
            // InternalVampireLanguage.g:1689:1: ( ( rule__VLSAnnotation__NameAssignment_1 )? )
            {
            // InternalVampireLanguage.g:1689:1: ( ( rule__VLSAnnotation__NameAssignment_1 )? )
            // InternalVampireLanguage.g:1690:2: ( rule__VLSAnnotation__NameAssignment_1 )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getNameAssignment_1()); 
            // InternalVampireLanguage.g:1691:2: ( rule__VLSAnnotation__NameAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_LOWER_WORD_ID && LA17_0<=RULE_SINGLE_QUOTE)||(LA17_0>=27 && LA17_0<=41)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVampireLanguage.g:1691:3: rule__VLSAnnotation__NameAssignment_1
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
    // InternalVampireLanguage.g:1699:1: rule__VLSAnnotation__Group__2 : rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3 ;
    public final void rule__VLSAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1703:1: ( rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3 )
            // InternalVampireLanguage.g:1704:2: rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3
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
    // InternalVampireLanguage.g:1711:1: rule__VLSAnnotation__Group__2__Impl : ( ( rule__VLSAnnotation__Group_2__0 )? ) ;
    public final void rule__VLSAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1715:1: ( ( ( rule__VLSAnnotation__Group_2__0 )? ) )
            // InternalVampireLanguage.g:1716:1: ( ( rule__VLSAnnotation__Group_2__0 )? )
            {
            // InternalVampireLanguage.g:1716:1: ( ( rule__VLSAnnotation__Group_2__0 )? )
            // InternalVampireLanguage.g:1717:2: ( rule__VLSAnnotation__Group_2__0 )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getGroup_2()); 
            // InternalVampireLanguage.g:1718:2: ( rule__VLSAnnotation__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVampireLanguage.g:1718:3: rule__VLSAnnotation__Group_2__0
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
    // InternalVampireLanguage.g:1726:1: rule__VLSAnnotation__Group__3 : rule__VLSAnnotation__Group__3__Impl ;
    public final void rule__VLSAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1730:1: ( rule__VLSAnnotation__Group__3__Impl )
            // InternalVampireLanguage.g:1731:2: rule__VLSAnnotation__Group__3__Impl
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
    // InternalVampireLanguage.g:1737:1: rule__VLSAnnotation__Group__3__Impl : ( ( ']' )? ) ;
    public final void rule__VLSAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1741:1: ( ( ( ']' )? ) )
            // InternalVampireLanguage.g:1742:1: ( ( ']' )? )
            {
            // InternalVampireLanguage.g:1742:1: ( ( ']' )? )
            // InternalVampireLanguage.g:1743:2: ( ']' )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getRightSquareBracketKeyword_3()); 
            // InternalVampireLanguage.g:1744:2: ( ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==48) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVampireLanguage.g:1744:3: ']'
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
    // InternalVampireLanguage.g:1753:1: rule__VLSAnnotation__Group_2__0 : rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1 ;
    public final void rule__VLSAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1757:1: ( rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1 )
            // InternalVampireLanguage.g:1758:2: rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1
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
    // InternalVampireLanguage.g:1765:1: rule__VLSAnnotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__VLSAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1769:1: ( ( '(' ) )
            // InternalVampireLanguage.g:1770:1: ( '(' )
            {
            // InternalVampireLanguage.g:1770:1: ( '(' )
            // InternalVampireLanguage.g:1771:2: '('
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
    // InternalVampireLanguage.g:1780:1: rule__VLSAnnotation__Group_2__1 : rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2 ;
    public final void rule__VLSAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1784:1: ( rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2 )
            // InternalVampireLanguage.g:1785:2: rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2
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
    // InternalVampireLanguage.g:1792:1: rule__VLSAnnotation__Group_2__1__Impl : ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) ) ;
    public final void rule__VLSAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1796:1: ( ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) ) )
            // InternalVampireLanguage.g:1797:1: ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) )
            {
            // InternalVampireLanguage.g:1797:1: ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) )
            // InternalVampireLanguage.g:1798:2: ( rule__VLSAnnotation__FollowupAssignment_2_1 )
            {
             before(grammarAccess.getVLSAnnotationAccess().getFollowupAssignment_2_1()); 
            // InternalVampireLanguage.g:1799:2: ( rule__VLSAnnotation__FollowupAssignment_2_1 )
            // InternalVampireLanguage.g:1799:3: rule__VLSAnnotation__FollowupAssignment_2_1
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
    // InternalVampireLanguage.g:1807:1: rule__VLSAnnotation__Group_2__2 : rule__VLSAnnotation__Group_2__2__Impl ;
    public final void rule__VLSAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1811:1: ( rule__VLSAnnotation__Group_2__2__Impl )
            // InternalVampireLanguage.g:1812:2: rule__VLSAnnotation__Group_2__2__Impl
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
    // InternalVampireLanguage.g:1818:1: rule__VLSAnnotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__VLSAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1822:1: ( ( ')' ) )
            // InternalVampireLanguage.g:1823:1: ( ')' )
            {
            // InternalVampireLanguage.g:1823:1: ( ')' )
            // InternalVampireLanguage.g:1824:2: ')'
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
    // InternalVampireLanguage.g:1834:1: rule__VLSAnnotationTerms__Group__0 : rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1 ;
    public final void rule__VLSAnnotationTerms__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1838:1: ( rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1 )
            // InternalVampireLanguage.g:1839:2: rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1
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
    // InternalVampireLanguage.g:1846:1: rule__VLSAnnotationTerms__Group__0__Impl : ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) ) ;
    public final void rule__VLSAnnotationTerms__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1850:1: ( ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) ) )
            // InternalVampireLanguage.g:1851:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) )
            {
            // InternalVampireLanguage.g:1851:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) )
            // InternalVampireLanguage.g:1852:2: ( rule__VLSAnnotationTerms__TermsAssignment_0 )
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getTermsAssignment_0()); 
            // InternalVampireLanguage.g:1853:2: ( rule__VLSAnnotationTerms__TermsAssignment_0 )
            // InternalVampireLanguage.g:1853:3: rule__VLSAnnotationTerms__TermsAssignment_0
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
    // InternalVampireLanguage.g:1861:1: rule__VLSAnnotationTerms__Group__1 : rule__VLSAnnotationTerms__Group__1__Impl ;
    public final void rule__VLSAnnotationTerms__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1865:1: ( rule__VLSAnnotationTerms__Group__1__Impl )
            // InternalVampireLanguage.g:1866:2: rule__VLSAnnotationTerms__Group__1__Impl
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
    // InternalVampireLanguage.g:1872:1: rule__VLSAnnotationTerms__Group__1__Impl : ( ( rule__VLSAnnotationTerms__Group_1__0 )* ) ;
    public final void rule__VLSAnnotationTerms__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1876:1: ( ( ( rule__VLSAnnotationTerms__Group_1__0 )* ) )
            // InternalVampireLanguage.g:1877:1: ( ( rule__VLSAnnotationTerms__Group_1__0 )* )
            {
            // InternalVampireLanguage.g:1877:1: ( ( rule__VLSAnnotationTerms__Group_1__0 )* )
            // InternalVampireLanguage.g:1878:2: ( rule__VLSAnnotationTerms__Group_1__0 )*
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getGroup_1()); 
            // InternalVampireLanguage.g:1879:2: ( rule__VLSAnnotationTerms__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==44) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalVampireLanguage.g:1879:3: rule__VLSAnnotationTerms__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__VLSAnnotationTerms__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalVampireLanguage.g:1888:1: rule__VLSAnnotationTerms__Group_1__0 : rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1 ;
    public final void rule__VLSAnnotationTerms__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1892:1: ( rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1 )
            // InternalVampireLanguage.g:1893:2: rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1
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
    // InternalVampireLanguage.g:1900:1: rule__VLSAnnotationTerms__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VLSAnnotationTerms__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1904:1: ( ( ',' ) )
            // InternalVampireLanguage.g:1905:1: ( ',' )
            {
            // InternalVampireLanguage.g:1905:1: ( ',' )
            // InternalVampireLanguage.g:1906:2: ','
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
    // InternalVampireLanguage.g:1915:1: rule__VLSAnnotationTerms__Group_1__1 : rule__VLSAnnotationTerms__Group_1__1__Impl ;
    public final void rule__VLSAnnotationTerms__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1919:1: ( rule__VLSAnnotationTerms__Group_1__1__Impl )
            // InternalVampireLanguage.g:1920:2: rule__VLSAnnotationTerms__Group_1__1__Impl
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
    // InternalVampireLanguage.g:1926:1: rule__VLSAnnotationTerms__Group_1__1__Impl : ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) ) ;
    public final void rule__VLSAnnotationTerms__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1930:1: ( ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:1931:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:1931:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) )
            // InternalVampireLanguage.g:1932:2: ( rule__VLSAnnotationTerms__TermsAssignment_1_1 )
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getTermsAssignment_1_1()); 
            // InternalVampireLanguage.g:1933:2: ( rule__VLSAnnotationTerms__TermsAssignment_1_1 )
            // InternalVampireLanguage.g:1933:3: rule__VLSAnnotationTerms__TermsAssignment_1_1
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
    // InternalVampireLanguage.g:1942:1: rule__VLSBinary__Group__0 : rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1 ;
    public final void rule__VLSBinary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1946:1: ( rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1 )
            // InternalVampireLanguage.g:1947:2: rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1
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
    // InternalVampireLanguage.g:1954:1: rule__VLSBinary__Group__0__Impl : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1958:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:1959:1: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:1959:1: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:1960:2: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:1969:1: rule__VLSBinary__Group__1 : rule__VLSBinary__Group__1__Impl ;
    public final void rule__VLSBinary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1973:1: ( rule__VLSBinary__Group__1__Impl )
            // InternalVampireLanguage.g:1974:2: rule__VLSBinary__Group__1__Impl
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
    // InternalVampireLanguage.g:1980:1: rule__VLSBinary__Group__1__Impl : ( ( rule__VLSBinary__Alternatives_1 )? ) ;
    public final void rule__VLSBinary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1984:1: ( ( ( rule__VLSBinary__Alternatives_1 )? ) )
            // InternalVampireLanguage.g:1985:1: ( ( rule__VLSBinary__Alternatives_1 )? )
            {
            // InternalVampireLanguage.g:1985:1: ( ( rule__VLSBinary__Alternatives_1 )? )
            // InternalVampireLanguage.g:1986:2: ( rule__VLSBinary__Alternatives_1 )?
            {
             before(grammarAccess.getVLSBinaryAccess().getAlternatives_1()); 
            // InternalVampireLanguage.g:1987:2: ( rule__VLSBinary__Alternatives_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=49 && LA21_0<=56)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVampireLanguage.g:1987:3: rule__VLSBinary__Alternatives_1
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
    // InternalVampireLanguage.g:1996:1: rule__VLSBinary__Group_1_0__0 : rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1 ;
    public final void rule__VLSBinary__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2000:1: ( rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1 )
            // InternalVampireLanguage.g:2001:2: rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1
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
    // InternalVampireLanguage.g:2008:1: rule__VLSBinary__Group_1_0__0__Impl : ( ( rule__VLSBinary__Alternatives_1_0_0 ) ) ;
    public final void rule__VLSBinary__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2012:1: ( ( ( rule__VLSBinary__Alternatives_1_0_0 ) ) )
            // InternalVampireLanguage.g:2013:1: ( ( rule__VLSBinary__Alternatives_1_0_0 ) )
            {
            // InternalVampireLanguage.g:2013:1: ( ( rule__VLSBinary__Alternatives_1_0_0 ) )
            // InternalVampireLanguage.g:2014:2: ( rule__VLSBinary__Alternatives_1_0_0 )
            {
             before(grammarAccess.getVLSBinaryAccess().getAlternatives_1_0_0()); 
            // InternalVampireLanguage.g:2015:2: ( rule__VLSBinary__Alternatives_1_0_0 )
            // InternalVampireLanguage.g:2015:3: rule__VLSBinary__Alternatives_1_0_0
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
    // InternalVampireLanguage.g:2023:1: rule__VLSBinary__Group_1_0__1 : rule__VLSBinary__Group_1_0__1__Impl ;
    public final void rule__VLSBinary__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2027:1: ( rule__VLSBinary__Group_1_0__1__Impl )
            // InternalVampireLanguage.g:2028:2: rule__VLSBinary__Group_1_0__1__Impl
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
    // InternalVampireLanguage.g:2034:1: rule__VLSBinary__Group_1_0__1__Impl : ( ( rule__VLSBinary__RightAssignment_1_0_1 ) ) ;
    public final void rule__VLSBinary__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2038:1: ( ( ( rule__VLSBinary__RightAssignment_1_0_1 ) ) )
            // InternalVampireLanguage.g:2039:1: ( ( rule__VLSBinary__RightAssignment_1_0_1 ) )
            {
            // InternalVampireLanguage.g:2039:1: ( ( rule__VLSBinary__RightAssignment_1_0_1 ) )
            // InternalVampireLanguage.g:2040:2: ( rule__VLSBinary__RightAssignment_1_0_1 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_0_1()); 
            // InternalVampireLanguage.g:2041:2: ( rule__VLSBinary__RightAssignment_1_0_1 )
            // InternalVampireLanguage.g:2041:3: rule__VLSBinary__RightAssignment_1_0_1
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
    // InternalVampireLanguage.g:2050:1: rule__VLSBinary__Group_1_0_0_0__0 : rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1 ;
    public final void rule__VLSBinary__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2054:1: ( rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1 )
            // InternalVampireLanguage.g:2055:2: rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1
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
    // InternalVampireLanguage.g:2062:1: rule__VLSBinary__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2066:1: ( ( () ) )
            // InternalVampireLanguage.g:2067:1: ( () )
            {
            // InternalVampireLanguage.g:2067:1: ( () )
            // InternalVampireLanguage.g:2068:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSEquivalentLeftAction_1_0_0_0_0()); 
            // InternalVampireLanguage.g:2069:2: ()
            // InternalVampireLanguage.g:2069:3: 
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
    // InternalVampireLanguage.g:2077:1: rule__VLSBinary__Group_1_0_0_0__1 : rule__VLSBinary__Group_1_0_0_0__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2081:1: ( rule__VLSBinary__Group_1_0_0_0__1__Impl )
            // InternalVampireLanguage.g:2082:2: rule__VLSBinary__Group_1_0_0_0__1__Impl
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
    // InternalVampireLanguage.g:2088:1: rule__VLSBinary__Group_1_0_0_0__1__Impl : ( '<=>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2092:1: ( ( '<=>' ) )
            // InternalVampireLanguage.g:2093:1: ( '<=>' )
            {
            // InternalVampireLanguage.g:2093:1: ( '<=>' )
            // InternalVampireLanguage.g:2094:2: '<=>'
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
    // InternalVampireLanguage.g:2104:1: rule__VLSBinary__Group_1_0_0_1__0 : rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1 ;
    public final void rule__VLSBinary__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2108:1: ( rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1 )
            // InternalVampireLanguage.g:2109:2: rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1
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
    // InternalVampireLanguage.g:2116:1: rule__VLSBinary__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2120:1: ( ( () ) )
            // InternalVampireLanguage.g:2121:1: ( () )
            {
            // InternalVampireLanguage.g:2121:1: ( () )
            // InternalVampireLanguage.g:2122:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSImpliesLeftAction_1_0_0_1_0()); 
            // InternalVampireLanguage.g:2123:2: ()
            // InternalVampireLanguage.g:2123:3: 
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
    // InternalVampireLanguage.g:2131:1: rule__VLSBinary__Group_1_0_0_1__1 : rule__VLSBinary__Group_1_0_0_1__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2135:1: ( rule__VLSBinary__Group_1_0_0_1__1__Impl )
            // InternalVampireLanguage.g:2136:2: rule__VLSBinary__Group_1_0_0_1__1__Impl
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
    // InternalVampireLanguage.g:2142:1: rule__VLSBinary__Group_1_0_0_1__1__Impl : ( '=>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2146:1: ( ( '=>' ) )
            // InternalVampireLanguage.g:2147:1: ( '=>' )
            {
            // InternalVampireLanguage.g:2147:1: ( '=>' )
            // InternalVampireLanguage.g:2148:2: '=>'
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
    // InternalVampireLanguage.g:2158:1: rule__VLSBinary__Group_1_0_0_2__0 : rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1 ;
    public final void rule__VLSBinary__Group_1_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2162:1: ( rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1 )
            // InternalVampireLanguage.g:2163:2: rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1
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
    // InternalVampireLanguage.g:2170:1: rule__VLSBinary__Group_1_0_0_2__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2174:1: ( ( () ) )
            // InternalVampireLanguage.g:2175:1: ( () )
            {
            // InternalVampireLanguage.g:2175:1: ( () )
            // InternalVampireLanguage.g:2176:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSRevImpliesLeftAction_1_0_0_2_0()); 
            // InternalVampireLanguage.g:2177:2: ()
            // InternalVampireLanguage.g:2177:3: 
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
    // InternalVampireLanguage.g:2185:1: rule__VLSBinary__Group_1_0_0_2__1 : rule__VLSBinary__Group_1_0_0_2__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2189:1: ( rule__VLSBinary__Group_1_0_0_2__1__Impl )
            // InternalVampireLanguage.g:2190:2: rule__VLSBinary__Group_1_0_0_2__1__Impl
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
    // InternalVampireLanguage.g:2196:1: rule__VLSBinary__Group_1_0_0_2__1__Impl : ( '<=' ) ;
    public final void rule__VLSBinary__Group_1_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2200:1: ( ( '<=' ) )
            // InternalVampireLanguage.g:2201:1: ( '<=' )
            {
            // InternalVampireLanguage.g:2201:1: ( '<=' )
            // InternalVampireLanguage.g:2202:2: '<='
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
    // InternalVampireLanguage.g:2212:1: rule__VLSBinary__Group_1_0_0_3__0 : rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1 ;
    public final void rule__VLSBinary__Group_1_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2216:1: ( rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1 )
            // InternalVampireLanguage.g:2217:2: rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1
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
    // InternalVampireLanguage.g:2224:1: rule__VLSBinary__Group_1_0_0_3__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2228:1: ( ( () ) )
            // InternalVampireLanguage.g:2229:1: ( () )
            {
            // InternalVampireLanguage.g:2229:1: ( () )
            // InternalVampireLanguage.g:2230:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSXnorLeftAction_1_0_0_3_0()); 
            // InternalVampireLanguage.g:2231:2: ()
            // InternalVampireLanguage.g:2231:3: 
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
    // InternalVampireLanguage.g:2239:1: rule__VLSBinary__Group_1_0_0_3__1 : rule__VLSBinary__Group_1_0_0_3__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2243:1: ( rule__VLSBinary__Group_1_0_0_3__1__Impl )
            // InternalVampireLanguage.g:2244:2: rule__VLSBinary__Group_1_0_0_3__1__Impl
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
    // InternalVampireLanguage.g:2250:1: rule__VLSBinary__Group_1_0_0_3__1__Impl : ( '<~>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2254:1: ( ( '<~>' ) )
            // InternalVampireLanguage.g:2255:1: ( '<~>' )
            {
            // InternalVampireLanguage.g:2255:1: ( '<~>' )
            // InternalVampireLanguage.g:2256:2: '<~>'
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
    // InternalVampireLanguage.g:2266:1: rule__VLSBinary__Group_1_0_0_4__0 : rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1 ;
    public final void rule__VLSBinary__Group_1_0_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2270:1: ( rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1 )
            // InternalVampireLanguage.g:2271:2: rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1
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
    // InternalVampireLanguage.g:2278:1: rule__VLSBinary__Group_1_0_0_4__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2282:1: ( ( () ) )
            // InternalVampireLanguage.g:2283:1: ( () )
            {
            // InternalVampireLanguage.g:2283:1: ( () )
            // InternalVampireLanguage.g:2284:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSNorLeftAction_1_0_0_4_0()); 
            // InternalVampireLanguage.g:2285:2: ()
            // InternalVampireLanguage.g:2285:3: 
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
    // InternalVampireLanguage.g:2293:1: rule__VLSBinary__Group_1_0_0_4__1 : rule__VLSBinary__Group_1_0_0_4__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2297:1: ( rule__VLSBinary__Group_1_0_0_4__1__Impl )
            // InternalVampireLanguage.g:2298:2: rule__VLSBinary__Group_1_0_0_4__1__Impl
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
    // InternalVampireLanguage.g:2304:1: rule__VLSBinary__Group_1_0_0_4__1__Impl : ( '~|' ) ;
    public final void rule__VLSBinary__Group_1_0_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2308:1: ( ( '~|' ) )
            // InternalVampireLanguage.g:2309:1: ( '~|' )
            {
            // InternalVampireLanguage.g:2309:1: ( '~|' )
            // InternalVampireLanguage.g:2310:2: '~|'
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
    // InternalVampireLanguage.g:2320:1: rule__VLSBinary__Group_1_0_0_5__0 : rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1 ;
    public final void rule__VLSBinary__Group_1_0_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2324:1: ( rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1 )
            // InternalVampireLanguage.g:2325:2: rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1
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
    // InternalVampireLanguage.g:2332:1: rule__VLSBinary__Group_1_0_0_5__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2336:1: ( ( () ) )
            // InternalVampireLanguage.g:2337:1: ( () )
            {
            // InternalVampireLanguage.g:2337:1: ( () )
            // InternalVampireLanguage.g:2338:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSNandLeftAction_1_0_0_5_0()); 
            // InternalVampireLanguage.g:2339:2: ()
            // InternalVampireLanguage.g:2339:3: 
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
    // InternalVampireLanguage.g:2347:1: rule__VLSBinary__Group_1_0_0_5__1 : rule__VLSBinary__Group_1_0_0_5__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2351:1: ( rule__VLSBinary__Group_1_0_0_5__1__Impl )
            // InternalVampireLanguage.g:2352:2: rule__VLSBinary__Group_1_0_0_5__1__Impl
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
    // InternalVampireLanguage.g:2358:1: rule__VLSBinary__Group_1_0_0_5__1__Impl : ( '~&' ) ;
    public final void rule__VLSBinary__Group_1_0_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2362:1: ( ( '~&' ) )
            // InternalVampireLanguage.g:2363:1: ( '~&' )
            {
            // InternalVampireLanguage.g:2363:1: ( '~&' )
            // InternalVampireLanguage.g:2364:2: '~&'
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
    // InternalVampireLanguage.g:2374:1: rule__VLSBinary__Group_1_1__0 : rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1 ;
    public final void rule__VLSBinary__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2378:1: ( rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1 )
            // InternalVampireLanguage.g:2379:2: rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1
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
    // InternalVampireLanguage.g:2386:1: rule__VLSBinary__Group_1_1__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2390:1: ( ( () ) )
            // InternalVampireLanguage.g:2391:1: ( () )
            {
            // InternalVampireLanguage.g:2391:1: ( () )
            // InternalVampireLanguage.g:2392:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSAndLeftAction_1_1_0()); 
            // InternalVampireLanguage.g:2393:2: ()
            // InternalVampireLanguage.g:2393:3: 
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
    // InternalVampireLanguage.g:2401:1: rule__VLSBinary__Group_1_1__1 : rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2 ;
    public final void rule__VLSBinary__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2405:1: ( rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2 )
            // InternalVampireLanguage.g:2406:2: rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2
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
    // InternalVampireLanguage.g:2413:1: rule__VLSBinary__Group_1_1__1__Impl : ( '&' ) ;
    public final void rule__VLSBinary__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2417:1: ( ( '&' ) )
            // InternalVampireLanguage.g:2418:1: ( '&' )
            {
            // InternalVampireLanguage.g:2418:1: ( '&' )
            // InternalVampireLanguage.g:2419:2: '&'
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
    // InternalVampireLanguage.g:2428:1: rule__VLSBinary__Group_1_1__2 : rule__VLSBinary__Group_1_1__2__Impl ;
    public final void rule__VLSBinary__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2432:1: ( rule__VLSBinary__Group_1_1__2__Impl )
            // InternalVampireLanguage.g:2433:2: rule__VLSBinary__Group_1_1__2__Impl
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
    // InternalVampireLanguage.g:2439:1: rule__VLSBinary__Group_1_1__2__Impl : ( ( rule__VLSBinary__RightAssignment_1_1_2 ) ) ;
    public final void rule__VLSBinary__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2443:1: ( ( ( rule__VLSBinary__RightAssignment_1_1_2 ) ) )
            // InternalVampireLanguage.g:2444:1: ( ( rule__VLSBinary__RightAssignment_1_1_2 ) )
            {
            // InternalVampireLanguage.g:2444:1: ( ( rule__VLSBinary__RightAssignment_1_1_2 ) )
            // InternalVampireLanguage.g:2445:2: ( rule__VLSBinary__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_1_2()); 
            // InternalVampireLanguage.g:2446:2: ( rule__VLSBinary__RightAssignment_1_1_2 )
            // InternalVampireLanguage.g:2446:3: rule__VLSBinary__RightAssignment_1_1_2
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
    // InternalVampireLanguage.g:2455:1: rule__VLSBinary__Group_1_2__0 : rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1 ;
    public final void rule__VLSBinary__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2459:1: ( rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1 )
            // InternalVampireLanguage.g:2460:2: rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1
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
    // InternalVampireLanguage.g:2467:1: rule__VLSBinary__Group_1_2__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2471:1: ( ( () ) )
            // InternalVampireLanguage.g:2472:1: ( () )
            {
            // InternalVampireLanguage.g:2472:1: ( () )
            // InternalVampireLanguage.g:2473:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSOrLeftAction_1_2_0()); 
            // InternalVampireLanguage.g:2474:2: ()
            // InternalVampireLanguage.g:2474:3: 
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
    // InternalVampireLanguage.g:2482:1: rule__VLSBinary__Group_1_2__1 : rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2 ;
    public final void rule__VLSBinary__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2486:1: ( rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2 )
            // InternalVampireLanguage.g:2487:2: rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2
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
    // InternalVampireLanguage.g:2494:1: rule__VLSBinary__Group_1_2__1__Impl : ( '|' ) ;
    public final void rule__VLSBinary__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2498:1: ( ( '|' ) )
            // InternalVampireLanguage.g:2499:1: ( '|' )
            {
            // InternalVampireLanguage.g:2499:1: ( '|' )
            // InternalVampireLanguage.g:2500:2: '|'
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
    // InternalVampireLanguage.g:2509:1: rule__VLSBinary__Group_1_2__2 : rule__VLSBinary__Group_1_2__2__Impl ;
    public final void rule__VLSBinary__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2513:1: ( rule__VLSBinary__Group_1_2__2__Impl )
            // InternalVampireLanguage.g:2514:2: rule__VLSBinary__Group_1_2__2__Impl
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
    // InternalVampireLanguage.g:2520:1: rule__VLSBinary__Group_1_2__2__Impl : ( ( rule__VLSBinary__RightAssignment_1_2_2 ) ) ;
    public final void rule__VLSBinary__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2524:1: ( ( ( rule__VLSBinary__RightAssignment_1_2_2 ) ) )
            // InternalVampireLanguage.g:2525:1: ( ( rule__VLSBinary__RightAssignment_1_2_2 ) )
            {
            // InternalVampireLanguage.g:2525:1: ( ( rule__VLSBinary__RightAssignment_1_2_2 ) )
            // InternalVampireLanguage.g:2526:2: ( rule__VLSBinary__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_2_2()); 
            // InternalVampireLanguage.g:2527:2: ( rule__VLSBinary__RightAssignment_1_2_2 )
            // InternalVampireLanguage.g:2527:3: rule__VLSBinary__RightAssignment_1_2_2
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
    // InternalVampireLanguage.g:2536:1: rule__VLSUnitaryFormula__Group_4__0 : rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1 ;
    public final void rule__VLSUnitaryFormula__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2540:1: ( rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1 )
            // InternalVampireLanguage.g:2541:2: rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1
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
    // InternalVampireLanguage.g:2548:1: rule__VLSUnitaryFormula__Group_4__0__Impl : ( '(' ) ;
    public final void rule__VLSUnitaryFormula__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2552:1: ( ( '(' ) )
            // InternalVampireLanguage.g:2553:1: ( '(' )
            {
            // InternalVampireLanguage.g:2553:1: ( '(' )
            // InternalVampireLanguage.g:2554:2: '('
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
    // InternalVampireLanguage.g:2563:1: rule__VLSUnitaryFormula__Group_4__1 : rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2 ;
    public final void rule__VLSUnitaryFormula__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2567:1: ( rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2 )
            // InternalVampireLanguage.g:2568:2: rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2
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
    // InternalVampireLanguage.g:2575:1: rule__VLSUnitaryFormula__Group_4__1__Impl : ( ruleVLSTerm ) ;
    public final void rule__VLSUnitaryFormula__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2579:1: ( ( ruleVLSTerm ) )
            // InternalVampireLanguage.g:2580:1: ( ruleVLSTerm )
            {
            // InternalVampireLanguage.g:2580:1: ( ruleVLSTerm )
            // InternalVampireLanguage.g:2581:2: ruleVLSTerm
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
    // InternalVampireLanguage.g:2590:1: rule__VLSUnitaryFormula__Group_4__2 : rule__VLSUnitaryFormula__Group_4__2__Impl ;
    public final void rule__VLSUnitaryFormula__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2594:1: ( rule__VLSUnitaryFormula__Group_4__2__Impl )
            // InternalVampireLanguage.g:2595:2: rule__VLSUnitaryFormula__Group_4__2__Impl
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
    // InternalVampireLanguage.g:2601:1: rule__VLSUnitaryFormula__Group_4__2__Impl : ( ')' ) ;
    public final void rule__VLSUnitaryFormula__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2605:1: ( ( ')' ) )
            // InternalVampireLanguage.g:2606:1: ( ')' )
            {
            // InternalVampireLanguage.g:2606:1: ( ')' )
            // InternalVampireLanguage.g:2607:2: ')'
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
    // InternalVampireLanguage.g:2617:1: rule__VLSUniversalQuantifier__Group__0 : rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1 ;
    public final void rule__VLSUniversalQuantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2621:1: ( rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1 )
            // InternalVampireLanguage.g:2622:2: rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1
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
    // InternalVampireLanguage.g:2629:1: rule__VLSUniversalQuantifier__Group__0__Impl : ( () ) ;
    public final void rule__VLSUniversalQuantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2633:1: ( ( () ) )
            // InternalVampireLanguage.g:2634:1: ( () )
            {
            // InternalVampireLanguage.g:2634:1: ( () )
            // InternalVampireLanguage.g:2635:2: ()
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVLSUniversalQuantifierAction_0()); 
            // InternalVampireLanguage.g:2636:2: ()
            // InternalVampireLanguage.g:2636:3: 
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
    // InternalVampireLanguage.g:2644:1: rule__VLSUniversalQuantifier__Group__1 : rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2 ;
    public final void rule__VLSUniversalQuantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2648:1: ( rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2 )
            // InternalVampireLanguage.g:2649:2: rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2
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
    // InternalVampireLanguage.g:2656:1: rule__VLSUniversalQuantifier__Group__1__Impl : ( ( rule__VLSUniversalQuantifier__Group_1__0 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2660:1: ( ( ( rule__VLSUniversalQuantifier__Group_1__0 ) ) )
            // InternalVampireLanguage.g:2661:1: ( ( rule__VLSUniversalQuantifier__Group_1__0 ) )
            {
            // InternalVampireLanguage.g:2661:1: ( ( rule__VLSUniversalQuantifier__Group_1__0 ) )
            // InternalVampireLanguage.g:2662:2: ( rule__VLSUniversalQuantifier__Group_1__0 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup_1()); 
            // InternalVampireLanguage.g:2663:2: ( rule__VLSUniversalQuantifier__Group_1__0 )
            // InternalVampireLanguage.g:2663:3: rule__VLSUniversalQuantifier__Group_1__0
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
    // InternalVampireLanguage.g:2671:1: rule__VLSUniversalQuantifier__Group__2 : rule__VLSUniversalQuantifier__Group__2__Impl ;
    public final void rule__VLSUniversalQuantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2675:1: ( rule__VLSUniversalQuantifier__Group__2__Impl )
            // InternalVampireLanguage.g:2676:2: rule__VLSUniversalQuantifier__Group__2__Impl
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
    // InternalVampireLanguage.g:2682:1: rule__VLSUniversalQuantifier__Group__2__Impl : ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2686:1: ( ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:2687:1: ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:2687:1: ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:2688:2: ( rule__VLSUniversalQuantifier__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:2689:2: ( rule__VLSUniversalQuantifier__OperandAssignment_2 )
            // InternalVampireLanguage.g:2689:3: rule__VLSUniversalQuantifier__OperandAssignment_2
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
    // InternalVampireLanguage.g:2698:1: rule__VLSUniversalQuantifier__Group_1__0 : rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1 ;
    public final void rule__VLSUniversalQuantifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2702:1: ( rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1 )
            // InternalVampireLanguage.g:2703:2: rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1
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
    // InternalVampireLanguage.g:2710:1: rule__VLSUniversalQuantifier__Group_1__0__Impl : ( '!' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2714:1: ( ( '!' ) )
            // InternalVampireLanguage.g:2715:1: ( '!' )
            {
            // InternalVampireLanguage.g:2715:1: ( '!' )
            // InternalVampireLanguage.g:2716:2: '!'
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
    // InternalVampireLanguage.g:2725:1: rule__VLSUniversalQuantifier__Group_1__1 : rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2 ;
    public final void rule__VLSUniversalQuantifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2729:1: ( rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2 )
            // InternalVampireLanguage.g:2730:2: rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2
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
    // InternalVampireLanguage.g:2737:1: rule__VLSUniversalQuantifier__Group_1__1__Impl : ( '[' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2741:1: ( ( '[' ) )
            // InternalVampireLanguage.g:2742:1: ( '[' )
            {
            // InternalVampireLanguage.g:2742:1: ( '[' )
            // InternalVampireLanguage.g:2743:2: '['
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
    // InternalVampireLanguage.g:2752:1: rule__VLSUniversalQuantifier__Group_1__2 : rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3 ;
    public final void rule__VLSUniversalQuantifier__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2756:1: ( rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3 )
            // InternalVampireLanguage.g:2757:2: rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3
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
    // InternalVampireLanguage.g:2764:1: rule__VLSUniversalQuantifier__Group_1__2__Impl : ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2768:1: ( ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) ) )
            // InternalVampireLanguage.g:2769:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) )
            {
            // InternalVampireLanguage.g:2769:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) )
            // InternalVampireLanguage.g:2770:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAssignment_1_2()); 
            // InternalVampireLanguage.g:2771:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 )
            // InternalVampireLanguage.g:2771:3: rule__VLSUniversalQuantifier__VariablesAssignment_1_2
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
    // InternalVampireLanguage.g:2779:1: rule__VLSUniversalQuantifier__Group_1__3 : rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4 ;
    public final void rule__VLSUniversalQuantifier__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2783:1: ( rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4 )
            // InternalVampireLanguage.g:2784:2: rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4
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
    // InternalVampireLanguage.g:2791:1: rule__VLSUniversalQuantifier__Group_1__3__Impl : ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2795:1: ( ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* ) )
            // InternalVampireLanguage.g:2796:1: ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* )
            {
            // InternalVampireLanguage.g:2796:1: ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* )
            // InternalVampireLanguage.g:2797:2: ( rule__VLSUniversalQuantifier__Group_1_3__0 )*
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup_1_3()); 
            // InternalVampireLanguage.g:2798:2: ( rule__VLSUniversalQuantifier__Group_1_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==44) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalVampireLanguage.g:2798:3: rule__VLSUniversalQuantifier__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__VLSUniversalQuantifier__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalVampireLanguage.g:2806:1: rule__VLSUniversalQuantifier__Group_1__4 : rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5 ;
    public final void rule__VLSUniversalQuantifier__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2810:1: ( rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5 )
            // InternalVampireLanguage.g:2811:2: rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5
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
    // InternalVampireLanguage.g:2818:1: rule__VLSUniversalQuantifier__Group_1__4__Impl : ( ']' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2822:1: ( ( ']' ) )
            // InternalVampireLanguage.g:2823:1: ( ']' )
            {
            // InternalVampireLanguage.g:2823:1: ( ']' )
            // InternalVampireLanguage.g:2824:2: ']'
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
    // InternalVampireLanguage.g:2833:1: rule__VLSUniversalQuantifier__Group_1__5 : rule__VLSUniversalQuantifier__Group_1__5__Impl ;
    public final void rule__VLSUniversalQuantifier__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2837:1: ( rule__VLSUniversalQuantifier__Group_1__5__Impl )
            // InternalVampireLanguage.g:2838:2: rule__VLSUniversalQuantifier__Group_1__5__Impl
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
    // InternalVampireLanguage.g:2844:1: rule__VLSUniversalQuantifier__Group_1__5__Impl : ( ':' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2848:1: ( ( ':' ) )
            // InternalVampireLanguage.g:2849:1: ( ':' )
            {
            // InternalVampireLanguage.g:2849:1: ( ':' )
            // InternalVampireLanguage.g:2850:2: ':'
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
    // InternalVampireLanguage.g:2860:1: rule__VLSUniversalQuantifier__Group_1_3__0 : rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1 ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2864:1: ( rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1 )
            // InternalVampireLanguage.g:2865:2: rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1
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
    // InternalVampireLanguage.g:2872:1: rule__VLSUniversalQuantifier__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2876:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2877:1: ( ',' )
            {
            // InternalVampireLanguage.g:2877:1: ( ',' )
            // InternalVampireLanguage.g:2878:2: ','
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
    // InternalVampireLanguage.g:2887:1: rule__VLSUniversalQuantifier__Group_1_3__1 : rule__VLSUniversalQuantifier__Group_1_3__1__Impl ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2891:1: ( rule__VLSUniversalQuantifier__Group_1_3__1__Impl )
            // InternalVampireLanguage.g:2892:2: rule__VLSUniversalQuantifier__Group_1_3__1__Impl
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
    // InternalVampireLanguage.g:2898:1: rule__VLSUniversalQuantifier__Group_1_3__1__Impl : ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2902:1: ( ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) ) )
            // InternalVampireLanguage.g:2903:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) )
            {
            // InternalVampireLanguage.g:2903:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) )
            // InternalVampireLanguage.g:2904:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAssignment_1_3_1()); 
            // InternalVampireLanguage.g:2905:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 )
            // InternalVampireLanguage.g:2905:3: rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1
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
    // InternalVampireLanguage.g:2914:1: rule__VLSExistentialQuantifier__Group__0 : rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1 ;
    public final void rule__VLSExistentialQuantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2918:1: ( rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1 )
            // InternalVampireLanguage.g:2919:2: rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1
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
    // InternalVampireLanguage.g:2926:1: rule__VLSExistentialQuantifier__Group__0__Impl : ( () ) ;
    public final void rule__VLSExistentialQuantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2930:1: ( ( () ) )
            // InternalVampireLanguage.g:2931:1: ( () )
            {
            // InternalVampireLanguage.g:2931:1: ( () )
            // InternalVampireLanguage.g:2932:2: ()
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVLSExistentialQuantifierAction_0()); 
            // InternalVampireLanguage.g:2933:2: ()
            // InternalVampireLanguage.g:2933:3: 
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
    // InternalVampireLanguage.g:2941:1: rule__VLSExistentialQuantifier__Group__1 : rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2 ;
    public final void rule__VLSExistentialQuantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2945:1: ( rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2 )
            // InternalVampireLanguage.g:2946:2: rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2
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
    // InternalVampireLanguage.g:2953:1: rule__VLSExistentialQuantifier__Group__1__Impl : ( ( rule__VLSExistentialQuantifier__Group_1__0 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2957:1: ( ( ( rule__VLSExistentialQuantifier__Group_1__0 ) ) )
            // InternalVampireLanguage.g:2958:1: ( ( rule__VLSExistentialQuantifier__Group_1__0 ) )
            {
            // InternalVampireLanguage.g:2958:1: ( ( rule__VLSExistentialQuantifier__Group_1__0 ) )
            // InternalVampireLanguage.g:2959:2: ( rule__VLSExistentialQuantifier__Group_1__0 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup_1()); 
            // InternalVampireLanguage.g:2960:2: ( rule__VLSExistentialQuantifier__Group_1__0 )
            // InternalVampireLanguage.g:2960:3: rule__VLSExistentialQuantifier__Group_1__0
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
    // InternalVampireLanguage.g:2968:1: rule__VLSExistentialQuantifier__Group__2 : rule__VLSExistentialQuantifier__Group__2__Impl ;
    public final void rule__VLSExistentialQuantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2972:1: ( rule__VLSExistentialQuantifier__Group__2__Impl )
            // InternalVampireLanguage.g:2973:2: rule__VLSExistentialQuantifier__Group__2__Impl
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
    // InternalVampireLanguage.g:2979:1: rule__VLSExistentialQuantifier__Group__2__Impl : ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2983:1: ( ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:2984:1: ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:2984:1: ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:2985:2: ( rule__VLSExistentialQuantifier__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:2986:2: ( rule__VLSExistentialQuantifier__OperandAssignment_2 )
            // InternalVampireLanguage.g:2986:3: rule__VLSExistentialQuantifier__OperandAssignment_2
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
    // InternalVampireLanguage.g:2995:1: rule__VLSExistentialQuantifier__Group_1__0 : rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1 ;
    public final void rule__VLSExistentialQuantifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2999:1: ( rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1 )
            // InternalVampireLanguage.g:3000:2: rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1
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
    // InternalVampireLanguage.g:3007:1: rule__VLSExistentialQuantifier__Group_1__0__Impl : ( '?' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3011:1: ( ( '?' ) )
            // InternalVampireLanguage.g:3012:1: ( '?' )
            {
            // InternalVampireLanguage.g:3012:1: ( '?' )
            // InternalVampireLanguage.g:3013:2: '?'
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
    // InternalVampireLanguage.g:3022:1: rule__VLSExistentialQuantifier__Group_1__1 : rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2 ;
    public final void rule__VLSExistentialQuantifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3026:1: ( rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2 )
            // InternalVampireLanguage.g:3027:2: rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2
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
    // InternalVampireLanguage.g:3034:1: rule__VLSExistentialQuantifier__Group_1__1__Impl : ( '[' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3038:1: ( ( '[' ) )
            // InternalVampireLanguage.g:3039:1: ( '[' )
            {
            // InternalVampireLanguage.g:3039:1: ( '[' )
            // InternalVampireLanguage.g:3040:2: '['
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
    // InternalVampireLanguage.g:3049:1: rule__VLSExistentialQuantifier__Group_1__2 : rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3 ;
    public final void rule__VLSExistentialQuantifier__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3053:1: ( rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3 )
            // InternalVampireLanguage.g:3054:2: rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3
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
    // InternalVampireLanguage.g:3061:1: rule__VLSExistentialQuantifier__Group_1__2__Impl : ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3065:1: ( ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) ) )
            // InternalVampireLanguage.g:3066:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) )
            {
            // InternalVampireLanguage.g:3066:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) )
            // InternalVampireLanguage.g:3067:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAssignment_1_2()); 
            // InternalVampireLanguage.g:3068:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 )
            // InternalVampireLanguage.g:3068:3: rule__VLSExistentialQuantifier__VariablesAssignment_1_2
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
    // InternalVampireLanguage.g:3076:1: rule__VLSExistentialQuantifier__Group_1__3 : rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4 ;
    public final void rule__VLSExistentialQuantifier__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3080:1: ( rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4 )
            // InternalVampireLanguage.g:3081:2: rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4
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
    // InternalVampireLanguage.g:3088:1: rule__VLSExistentialQuantifier__Group_1__3__Impl : ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3092:1: ( ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* ) )
            // InternalVampireLanguage.g:3093:1: ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* )
            {
            // InternalVampireLanguage.g:3093:1: ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* )
            // InternalVampireLanguage.g:3094:2: ( rule__VLSExistentialQuantifier__Group_1_3__0 )*
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup_1_3()); 
            // InternalVampireLanguage.g:3095:2: ( rule__VLSExistentialQuantifier__Group_1_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==44) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalVampireLanguage.g:3095:3: rule__VLSExistentialQuantifier__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__VLSExistentialQuantifier__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalVampireLanguage.g:3103:1: rule__VLSExistentialQuantifier__Group_1__4 : rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5 ;
    public final void rule__VLSExistentialQuantifier__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3107:1: ( rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5 )
            // InternalVampireLanguage.g:3108:2: rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5
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
    // InternalVampireLanguage.g:3115:1: rule__VLSExistentialQuantifier__Group_1__4__Impl : ( ']' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3119:1: ( ( ']' ) )
            // InternalVampireLanguage.g:3120:1: ( ']' )
            {
            // InternalVampireLanguage.g:3120:1: ( ']' )
            // InternalVampireLanguage.g:3121:2: ']'
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
    // InternalVampireLanguage.g:3130:1: rule__VLSExistentialQuantifier__Group_1__5 : rule__VLSExistentialQuantifier__Group_1__5__Impl ;
    public final void rule__VLSExistentialQuantifier__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3134:1: ( rule__VLSExistentialQuantifier__Group_1__5__Impl )
            // InternalVampireLanguage.g:3135:2: rule__VLSExistentialQuantifier__Group_1__5__Impl
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
    // InternalVampireLanguage.g:3141:1: rule__VLSExistentialQuantifier__Group_1__5__Impl : ( ':' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3145:1: ( ( ':' ) )
            // InternalVampireLanguage.g:3146:1: ( ':' )
            {
            // InternalVampireLanguage.g:3146:1: ( ':' )
            // InternalVampireLanguage.g:3147:2: ':'
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
    // InternalVampireLanguage.g:3157:1: rule__VLSExistentialQuantifier__Group_1_3__0 : rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1 ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3161:1: ( rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1 )
            // InternalVampireLanguage.g:3162:2: rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1
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
    // InternalVampireLanguage.g:3169:1: rule__VLSExistentialQuantifier__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3173:1: ( ( ',' ) )
            // InternalVampireLanguage.g:3174:1: ( ',' )
            {
            // InternalVampireLanguage.g:3174:1: ( ',' )
            // InternalVampireLanguage.g:3175:2: ','
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
    // InternalVampireLanguage.g:3184:1: rule__VLSExistentialQuantifier__Group_1_3__1 : rule__VLSExistentialQuantifier__Group_1_3__1__Impl ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3188:1: ( rule__VLSExistentialQuantifier__Group_1_3__1__Impl )
            // InternalVampireLanguage.g:3189:2: rule__VLSExistentialQuantifier__Group_1_3__1__Impl
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
    // InternalVampireLanguage.g:3195:1: rule__VLSExistentialQuantifier__Group_1_3__1__Impl : ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3199:1: ( ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) ) )
            // InternalVampireLanguage.g:3200:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) )
            {
            // InternalVampireLanguage.g:3200:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) )
            // InternalVampireLanguage.g:3201:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAssignment_1_3_1()); 
            // InternalVampireLanguage.g:3202:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 )
            // InternalVampireLanguage.g:3202:3: rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1
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
    // InternalVampireLanguage.g:3211:1: rule__VLSUnaryNegation__Group__0 : rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1 ;
    public final void rule__VLSUnaryNegation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3215:1: ( rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1 )
            // InternalVampireLanguage.g:3216:2: rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1
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
    // InternalVampireLanguage.g:3223:1: rule__VLSUnaryNegation__Group__0__Impl : ( () ) ;
    public final void rule__VLSUnaryNegation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3227:1: ( ( () ) )
            // InternalVampireLanguage.g:3228:1: ( () )
            {
            // InternalVampireLanguage.g:3228:1: ( () )
            // InternalVampireLanguage.g:3229:2: ()
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getVLSUnaryNegationAction_0()); 
            // InternalVampireLanguage.g:3230:2: ()
            // InternalVampireLanguage.g:3230:3: 
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
    // InternalVampireLanguage.g:3238:1: rule__VLSUnaryNegation__Group__1 : rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2 ;
    public final void rule__VLSUnaryNegation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3242:1: ( rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2 )
            // InternalVampireLanguage.g:3243:2: rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2
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
    // InternalVampireLanguage.g:3250:1: rule__VLSUnaryNegation__Group__1__Impl : ( '~' ) ;
    public final void rule__VLSUnaryNegation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3254:1: ( ( '~' ) )
            // InternalVampireLanguage.g:3255:1: ( '~' )
            {
            // InternalVampireLanguage.g:3255:1: ( '~' )
            // InternalVampireLanguage.g:3256:2: '~'
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
    // InternalVampireLanguage.g:3265:1: rule__VLSUnaryNegation__Group__2 : rule__VLSUnaryNegation__Group__2__Impl ;
    public final void rule__VLSUnaryNegation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3269:1: ( rule__VLSUnaryNegation__Group__2__Impl )
            // InternalVampireLanguage.g:3270:2: rule__VLSUnaryNegation__Group__2__Impl
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
    // InternalVampireLanguage.g:3276:1: rule__VLSUnaryNegation__Group__2__Impl : ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) ) ;
    public final void rule__VLSUnaryNegation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3280:1: ( ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:3281:1: ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:3281:1: ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:3282:2: ( rule__VLSUnaryNegation__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:3283:2: ( rule__VLSUnaryNegation__OperandAssignment_2 )
            // InternalVampireLanguage.g:3283:3: rule__VLSUnaryNegation__OperandAssignment_2
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
    // InternalVampireLanguage.g:3292:1: rule__VLSUnaryInfix__Group__0 : rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1 ;
    public final void rule__VLSUnaryInfix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3296:1: ( rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1 )
            // InternalVampireLanguage.g:3297:2: rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1
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
    // InternalVampireLanguage.g:3304:1: rule__VLSUnaryInfix__Group__0__Impl : ( ruleVLSFunction ) ;
    public final void rule__VLSUnaryInfix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3308:1: ( ( ruleVLSFunction ) )
            // InternalVampireLanguage.g:3309:1: ( ruleVLSFunction )
            {
            // InternalVampireLanguage.g:3309:1: ( ruleVLSFunction )
            // InternalVampireLanguage.g:3310:2: ruleVLSFunction
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSFunctionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSFunction();

            state._fsp--;

             after(grammarAccess.getVLSUnaryInfixAccess().getVLSFunctionParserRuleCall_0()); 

            }


            }

        }
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
    // InternalVampireLanguage.g:3319:1: rule__VLSUnaryInfix__Group__1 : rule__VLSUnaryInfix__Group__1__Impl ;
    public final void rule__VLSUnaryInfix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3323:1: ( rule__VLSUnaryInfix__Group__1__Impl )
            // InternalVampireLanguage.g:3324:2: rule__VLSUnaryInfix__Group__1__Impl
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
    // InternalVampireLanguage.g:3330:1: rule__VLSUnaryInfix__Group__1__Impl : ( ( rule__VLSUnaryInfix__Group_1__0 )? ) ;
    public final void rule__VLSUnaryInfix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3334:1: ( ( ( rule__VLSUnaryInfix__Group_1__0 )? ) )
            // InternalVampireLanguage.g:3335:1: ( ( rule__VLSUnaryInfix__Group_1__0 )? )
            {
            // InternalVampireLanguage.g:3335:1: ( ( rule__VLSUnaryInfix__Group_1__0 )? )
            // InternalVampireLanguage.g:3336:2: ( rule__VLSUnaryInfix__Group_1__0 )?
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1()); 
            // InternalVampireLanguage.g:3337:2: ( rule__VLSUnaryInfix__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=61 && LA24_0<=63)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVampireLanguage.g:3337:3: rule__VLSUnaryInfix__Group_1__0
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
    // InternalVampireLanguage.g:3346:1: rule__VLSUnaryInfix__Group_1__0 : rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1 ;
    public final void rule__VLSUnaryInfix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3350:1: ( rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1 )
            // InternalVampireLanguage.g:3351:2: rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalVampireLanguage.g:3358:1: rule__VLSUnaryInfix__Group_1__0__Impl : ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) ) ;
    public final void rule__VLSUnaryInfix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3362:1: ( ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) ) )
            // InternalVampireLanguage.g:3363:1: ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) )
            {
            // InternalVampireLanguage.g:3363:1: ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) )
            // InternalVampireLanguage.g:3364:2: ( rule__VLSUnaryInfix__Alternatives_1_0 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getAlternatives_1_0()); 
            // InternalVampireLanguage.g:3365:2: ( rule__VLSUnaryInfix__Alternatives_1_0 )
            // InternalVampireLanguage.g:3365:3: rule__VLSUnaryInfix__Alternatives_1_0
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
    // InternalVampireLanguage.g:3373:1: rule__VLSUnaryInfix__Group_1__1 : rule__VLSUnaryInfix__Group_1__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3377:1: ( rule__VLSUnaryInfix__Group_1__1__Impl )
            // InternalVampireLanguage.g:3378:2: rule__VLSUnaryInfix__Group_1__1__Impl
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
    // InternalVampireLanguage.g:3384:1: rule__VLSUnaryInfix__Group_1__1__Impl : ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) ) ;
    public final void rule__VLSUnaryInfix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3388:1: ( ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:3389:1: ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:3389:1: ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) )
            // InternalVampireLanguage.g:3390:2: ( rule__VLSUnaryInfix__RightAssignment_1_1 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getRightAssignment_1_1()); 
            // InternalVampireLanguage.g:3391:2: ( rule__VLSUnaryInfix__RightAssignment_1_1 )
            // InternalVampireLanguage.g:3391:3: rule__VLSUnaryInfix__RightAssignment_1_1
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
    // InternalVampireLanguage.g:3400:1: rule__VLSUnaryInfix__Group_1_0_0__0 : rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3404:1: ( rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1 )
            // InternalVampireLanguage.g:3405:2: rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalVampireLanguage.g:3412:1: rule__VLSUnaryInfix__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3416:1: ( ( () ) )
            // InternalVampireLanguage.g:3417:1: ( () )
            {
            // InternalVampireLanguage.g:3417:1: ( () )
            // InternalVampireLanguage.g:3418:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSInequalityLeftAction_1_0_0_0()); 
            // InternalVampireLanguage.g:3419:2: ()
            // InternalVampireLanguage.g:3419:3: 
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
    // InternalVampireLanguage.g:3427:1: rule__VLSUnaryInfix__Group_1_0_0__1 : rule__VLSUnaryInfix__Group_1_0_0__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3431:1: ( rule__VLSUnaryInfix__Group_1_0_0__1__Impl )
            // InternalVampireLanguage.g:3432:2: rule__VLSUnaryInfix__Group_1_0_0__1__Impl
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
    // InternalVampireLanguage.g:3438:1: rule__VLSUnaryInfix__Group_1_0_0__1__Impl : ( '!=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3442:1: ( ( '!=' ) )
            // InternalVampireLanguage.g:3443:1: ( '!=' )
            {
            // InternalVampireLanguage.g:3443:1: ( '!=' )
            // InternalVampireLanguage.g:3444:2: '!='
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
    // InternalVampireLanguage.g:3454:1: rule__VLSUnaryInfix__Group_1_0_1__0 : rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3458:1: ( rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1 )
            // InternalVampireLanguage.g:3459:2: rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalVampireLanguage.g:3466:1: rule__VLSUnaryInfix__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3470:1: ( ( () ) )
            // InternalVampireLanguage.g:3471:1: ( () )
            {
            // InternalVampireLanguage.g:3471:1: ( () )
            // InternalVampireLanguage.g:3472:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSEqualityLeftAction_1_0_1_0()); 
            // InternalVampireLanguage.g:3473:2: ()
            // InternalVampireLanguage.g:3473:3: 
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
    // InternalVampireLanguage.g:3481:1: rule__VLSUnaryInfix__Group_1_0_1__1 : rule__VLSUnaryInfix__Group_1_0_1__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3485:1: ( rule__VLSUnaryInfix__Group_1_0_1__1__Impl )
            // InternalVampireLanguage.g:3486:2: rule__VLSUnaryInfix__Group_1_0_1__1__Impl
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
    // InternalVampireLanguage.g:3492:1: rule__VLSUnaryInfix__Group_1_0_1__1__Impl : ( '=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3496:1: ( ( '=' ) )
            // InternalVampireLanguage.g:3497:1: ( '=' )
            {
            // InternalVampireLanguage.g:3497:1: ( '=' )
            // InternalVampireLanguage.g:3498:2: '='
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
    // InternalVampireLanguage.g:3508:1: rule__VLSUnaryInfix__Group_1_0_2__0 : rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3512:1: ( rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1 )
            // InternalVampireLanguage.g:3513:2: rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1
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
    // InternalVampireLanguage.g:3520:1: rule__VLSUnaryInfix__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3524:1: ( ( () ) )
            // InternalVampireLanguage.g:3525:1: ( () )
            {
            // InternalVampireLanguage.g:3525:1: ( () )
            // InternalVampireLanguage.g:3526:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSAssignmentLeftAction_1_0_2_0()); 
            // InternalVampireLanguage.g:3527:2: ()
            // InternalVampireLanguage.g:3527:3: 
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
    // InternalVampireLanguage.g:3535:1: rule__VLSUnaryInfix__Group_1_0_2__1 : rule__VLSUnaryInfix__Group_1_0_2__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3539:1: ( rule__VLSUnaryInfix__Group_1_0_2__1__Impl )
            // InternalVampireLanguage.g:3540:2: rule__VLSUnaryInfix__Group_1_0_2__1__Impl
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
    // InternalVampireLanguage.g:3546:1: rule__VLSUnaryInfix__Group_1_0_2__1__Impl : ( ':=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3550:1: ( ( ':=' ) )
            // InternalVampireLanguage.g:3551:1: ( ':=' )
            {
            // InternalVampireLanguage.g:3551:1: ( ':=' )
            // InternalVampireLanguage.g:3552:2: ':='
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


    // $ANTLR start "rule__VLSFunction__Group__0"
    // InternalVampireLanguage.g:3562:1: rule__VLSFunction__Group__0 : rule__VLSFunction__Group__0__Impl rule__VLSFunction__Group__1 ;
    public final void rule__VLSFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3566:1: ( rule__VLSFunction__Group__0__Impl rule__VLSFunction__Group__1 )
            // InternalVampireLanguage.g:3567:2: rule__VLSFunction__Group__0__Impl rule__VLSFunction__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__VLSFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group__0"


    // $ANTLR start "rule__VLSFunction__Group__0__Impl"
    // InternalVampireLanguage.g:3574:1: rule__VLSFunction__Group__0__Impl : ( () ) ;
    public final void rule__VLSFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3578:1: ( ( () ) )
            // InternalVampireLanguage.g:3579:1: ( () )
            {
            // InternalVampireLanguage.g:3579:1: ( () )
            // InternalVampireLanguage.g:3580:2: ()
            {
             before(grammarAccess.getVLSFunctionAccess().getVLSFunctionAction_0()); 
            // InternalVampireLanguage.g:3581:2: ()
            // InternalVampireLanguage.g:3581:3: 
            {
            }

             after(grammarAccess.getVLSFunctionAccess().getVLSFunctionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group__0__Impl"


    // $ANTLR start "rule__VLSFunction__Group__1"
    // InternalVampireLanguage.g:3589:1: rule__VLSFunction__Group__1 : rule__VLSFunction__Group__1__Impl rule__VLSFunction__Group__2 ;
    public final void rule__VLSFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3593:1: ( rule__VLSFunction__Group__1__Impl rule__VLSFunction__Group__2 )
            // InternalVampireLanguage.g:3594:2: rule__VLSFunction__Group__1__Impl rule__VLSFunction__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__VLSFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group__1"


    // $ANTLR start "rule__VLSFunction__Group__1__Impl"
    // InternalVampireLanguage.g:3601:1: rule__VLSFunction__Group__1__Impl : ( ( rule__VLSFunction__ConstantAssignment_1 ) ) ;
    public final void rule__VLSFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3605:1: ( ( ( rule__VLSFunction__ConstantAssignment_1 ) ) )
            // InternalVampireLanguage.g:3606:1: ( ( rule__VLSFunction__ConstantAssignment_1 ) )
            {
            // InternalVampireLanguage.g:3606:1: ( ( rule__VLSFunction__ConstantAssignment_1 ) )
            // InternalVampireLanguage.g:3607:2: ( rule__VLSFunction__ConstantAssignment_1 )
            {
             before(grammarAccess.getVLSFunctionAccess().getConstantAssignment_1()); 
            // InternalVampireLanguage.g:3608:2: ( rule__VLSFunction__ConstantAssignment_1 )
            // InternalVampireLanguage.g:3608:3: rule__VLSFunction__ConstantAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunction__ConstantAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSFunctionAccess().getConstantAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group__1__Impl"


    // $ANTLR start "rule__VLSFunction__Group__2"
    // InternalVampireLanguage.g:3616:1: rule__VLSFunction__Group__2 : rule__VLSFunction__Group__2__Impl ;
    public final void rule__VLSFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3620:1: ( rule__VLSFunction__Group__2__Impl )
            // InternalVampireLanguage.g:3621:2: rule__VLSFunction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group__2"


    // $ANTLR start "rule__VLSFunction__Group__2__Impl"
    // InternalVampireLanguage.g:3627:1: rule__VLSFunction__Group__2__Impl : ( ( rule__VLSFunction__Group_2__0 )? ) ;
    public final void rule__VLSFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3631:1: ( ( ( rule__VLSFunction__Group_2__0 )? ) )
            // InternalVampireLanguage.g:3632:1: ( ( rule__VLSFunction__Group_2__0 )? )
            {
            // InternalVampireLanguage.g:3632:1: ( ( rule__VLSFunction__Group_2__0 )? )
            // InternalVampireLanguage.g:3633:2: ( rule__VLSFunction__Group_2__0 )?
            {
             before(grammarAccess.getVLSFunctionAccess().getGroup_2()); 
            // InternalVampireLanguage.g:3634:2: ( rule__VLSFunction__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVampireLanguage.g:3634:3: rule__VLSFunction__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSFunction__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVLSFunctionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group__2__Impl"


    // $ANTLR start "rule__VLSFunction__Group_2__0"
    // InternalVampireLanguage.g:3643:1: rule__VLSFunction__Group_2__0 : rule__VLSFunction__Group_2__0__Impl rule__VLSFunction__Group_2__1 ;
    public final void rule__VLSFunction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3647:1: ( rule__VLSFunction__Group_2__0__Impl rule__VLSFunction__Group_2__1 )
            // InternalVampireLanguage.g:3648:2: rule__VLSFunction__Group_2__0__Impl rule__VLSFunction__Group_2__1
            {
            pushFollow(FOLLOW_36);
            rule__VLSFunction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFunction__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group_2__0"


    // $ANTLR start "rule__VLSFunction__Group_2__0__Impl"
    // InternalVampireLanguage.g:3655:1: rule__VLSFunction__Group_2__0__Impl : ( '(' ) ;
    public final void rule__VLSFunction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3659:1: ( ( '(' ) )
            // InternalVampireLanguage.g:3660:1: ( '(' )
            {
            // InternalVampireLanguage.g:3660:1: ( '(' )
            // InternalVampireLanguage.g:3661:2: '('
            {
             before(grammarAccess.getVLSFunctionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getVLSFunctionAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group_2__0__Impl"


    // $ANTLR start "rule__VLSFunction__Group_2__1"
    // InternalVampireLanguage.g:3670:1: rule__VLSFunction__Group_2__1 : rule__VLSFunction__Group_2__1__Impl rule__VLSFunction__Group_2__2 ;
    public final void rule__VLSFunction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3674:1: ( rule__VLSFunction__Group_2__1__Impl rule__VLSFunction__Group_2__2 )
            // InternalVampireLanguage.g:3675:2: rule__VLSFunction__Group_2__1__Impl rule__VLSFunction__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__VLSFunction__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFunction__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group_2__1"


    // $ANTLR start "rule__VLSFunction__Group_2__1__Impl"
    // InternalVampireLanguage.g:3682:1: rule__VLSFunction__Group_2__1__Impl : ( ( rule__VLSFunction__TermsAssignment_2_1 ) ) ;
    public final void rule__VLSFunction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3686:1: ( ( ( rule__VLSFunction__TermsAssignment_2_1 ) ) )
            // InternalVampireLanguage.g:3687:1: ( ( rule__VLSFunction__TermsAssignment_2_1 ) )
            {
            // InternalVampireLanguage.g:3687:1: ( ( rule__VLSFunction__TermsAssignment_2_1 ) )
            // InternalVampireLanguage.g:3688:2: ( rule__VLSFunction__TermsAssignment_2_1 )
            {
             before(grammarAccess.getVLSFunctionAccess().getTermsAssignment_2_1()); 
            // InternalVampireLanguage.g:3689:2: ( rule__VLSFunction__TermsAssignment_2_1 )
            // InternalVampireLanguage.g:3689:3: rule__VLSFunction__TermsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunction__TermsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSFunctionAccess().getTermsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group_2__1__Impl"


    // $ANTLR start "rule__VLSFunction__Group_2__2"
    // InternalVampireLanguage.g:3697:1: rule__VLSFunction__Group_2__2 : rule__VLSFunction__Group_2__2__Impl rule__VLSFunction__Group_2__3 ;
    public final void rule__VLSFunction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3701:1: ( rule__VLSFunction__Group_2__2__Impl rule__VLSFunction__Group_2__3 )
            // InternalVampireLanguage.g:3702:2: rule__VLSFunction__Group_2__2__Impl rule__VLSFunction__Group_2__3
            {
            pushFollow(FOLLOW_11);
            rule__VLSFunction__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFunction__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group_2__2"


    // $ANTLR start "rule__VLSFunction__Group_2__2__Impl"
    // InternalVampireLanguage.g:3709:1: rule__VLSFunction__Group_2__2__Impl : ( ( rule__VLSFunction__Group_2_2__0 )* ) ;
    public final void rule__VLSFunction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3713:1: ( ( ( rule__VLSFunction__Group_2_2__0 )* ) )
            // InternalVampireLanguage.g:3714:1: ( ( rule__VLSFunction__Group_2_2__0 )* )
            {
            // InternalVampireLanguage.g:3714:1: ( ( rule__VLSFunction__Group_2_2__0 )* )
            // InternalVampireLanguage.g:3715:2: ( rule__VLSFunction__Group_2_2__0 )*
            {
             before(grammarAccess.getVLSFunctionAccess().getGroup_2_2()); 
            // InternalVampireLanguage.g:3716:2: ( rule__VLSFunction__Group_2_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==44) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalVampireLanguage.g:3716:3: rule__VLSFunction__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__VLSFunction__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getVLSFunctionAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group_2__2__Impl"


    // $ANTLR start "rule__VLSFunction__Group_2__3"
    // InternalVampireLanguage.g:3724:1: rule__VLSFunction__Group_2__3 : rule__VLSFunction__Group_2__3__Impl ;
    public final void rule__VLSFunction__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3728:1: ( rule__VLSFunction__Group_2__3__Impl )
            // InternalVampireLanguage.g:3729:2: rule__VLSFunction__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunction__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group_2__3"


    // $ANTLR start "rule__VLSFunction__Group_2__3__Impl"
    // InternalVampireLanguage.g:3735:1: rule__VLSFunction__Group_2__3__Impl : ( ')' ) ;
    public final void rule__VLSFunction__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3739:1: ( ( ')' ) )
            // InternalVampireLanguage.g:3740:1: ( ')' )
            {
            // InternalVampireLanguage.g:3740:1: ( ')' )
            // InternalVampireLanguage.g:3741:2: ')'
            {
             before(grammarAccess.getVLSFunctionAccess().getRightParenthesisKeyword_2_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVLSFunctionAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group_2__3__Impl"


    // $ANTLR start "rule__VLSFunction__Group_2_2__0"
    // InternalVampireLanguage.g:3751:1: rule__VLSFunction__Group_2_2__0 : rule__VLSFunction__Group_2_2__0__Impl rule__VLSFunction__Group_2_2__1 ;
    public final void rule__VLSFunction__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3755:1: ( rule__VLSFunction__Group_2_2__0__Impl rule__VLSFunction__Group_2_2__1 )
            // InternalVampireLanguage.g:3756:2: rule__VLSFunction__Group_2_2__0__Impl rule__VLSFunction__Group_2_2__1
            {
            pushFollow(FOLLOW_36);
            rule__VLSFunction__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFunction__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group_2_2__0"


    // $ANTLR start "rule__VLSFunction__Group_2_2__0__Impl"
    // InternalVampireLanguage.g:3763:1: rule__VLSFunction__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__VLSFunction__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3767:1: ( ( ',' ) )
            // InternalVampireLanguage.g:3768:1: ( ',' )
            {
            // InternalVampireLanguage.g:3768:1: ( ',' )
            // InternalVampireLanguage.g:3769:2: ','
            {
             before(grammarAccess.getVLSFunctionAccess().getCommaKeyword_2_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVLSFunctionAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group_2_2__0__Impl"


    // $ANTLR start "rule__VLSFunction__Group_2_2__1"
    // InternalVampireLanguage.g:3778:1: rule__VLSFunction__Group_2_2__1 : rule__VLSFunction__Group_2_2__1__Impl ;
    public final void rule__VLSFunction__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3782:1: ( rule__VLSFunction__Group_2_2__1__Impl )
            // InternalVampireLanguage.g:3783:2: rule__VLSFunction__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunction__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group_2_2__1"


    // $ANTLR start "rule__VLSFunction__Group_2_2__1__Impl"
    // InternalVampireLanguage.g:3789:1: rule__VLSFunction__Group_2_2__1__Impl : ( ( rule__VLSFunction__TermsAssignment_2_2_1 ) ) ;
    public final void rule__VLSFunction__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3793:1: ( ( ( rule__VLSFunction__TermsAssignment_2_2_1 ) ) )
            // InternalVampireLanguage.g:3794:1: ( ( rule__VLSFunction__TermsAssignment_2_2_1 ) )
            {
            // InternalVampireLanguage.g:3794:1: ( ( rule__VLSFunction__TermsAssignment_2_2_1 ) )
            // InternalVampireLanguage.g:3795:2: ( rule__VLSFunction__TermsAssignment_2_2_1 )
            {
             before(grammarAccess.getVLSFunctionAccess().getTermsAssignment_2_2_1()); 
            // InternalVampireLanguage.g:3796:2: ( rule__VLSFunction__TermsAssignment_2_2_1 )
            // InternalVampireLanguage.g:3796:3: rule__VLSFunction__TermsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunction__TermsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSFunctionAccess().getTermsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__Group_2_2__1__Impl"


    // $ANTLR start "rule__VLSFunctionFof__Group__0"
    // InternalVampireLanguage.g:3805:1: rule__VLSFunctionFof__Group__0 : rule__VLSFunctionFof__Group__0__Impl rule__VLSFunctionFof__Group__1 ;
    public final void rule__VLSFunctionFof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3809:1: ( rule__VLSFunctionFof__Group__0__Impl rule__VLSFunctionFof__Group__1 )
            // InternalVampireLanguage.g:3810:2: rule__VLSFunctionFof__Group__0__Impl rule__VLSFunctionFof__Group__1
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
    // InternalVampireLanguage.g:3817:1: rule__VLSFunctionFof__Group__0__Impl : ( ( rule__VLSFunctionFof__FunctorAssignment_0 ) ) ;
    public final void rule__VLSFunctionFof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3821:1: ( ( ( rule__VLSFunctionFof__FunctorAssignment_0 ) ) )
            // InternalVampireLanguage.g:3822:1: ( ( rule__VLSFunctionFof__FunctorAssignment_0 ) )
            {
            // InternalVampireLanguage.g:3822:1: ( ( rule__VLSFunctionFof__FunctorAssignment_0 ) )
            // InternalVampireLanguage.g:3823:2: ( rule__VLSFunctionFof__FunctorAssignment_0 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getFunctorAssignment_0()); 
            // InternalVampireLanguage.g:3824:2: ( rule__VLSFunctionFof__FunctorAssignment_0 )
            // InternalVampireLanguage.g:3824:3: rule__VLSFunctionFof__FunctorAssignment_0
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
    // InternalVampireLanguage.g:3832:1: rule__VLSFunctionFof__Group__1 : rule__VLSFunctionFof__Group__1__Impl ;
    public final void rule__VLSFunctionFof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3836:1: ( rule__VLSFunctionFof__Group__1__Impl )
            // InternalVampireLanguage.g:3837:2: rule__VLSFunctionFof__Group__1__Impl
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
    // InternalVampireLanguage.g:3843:1: rule__VLSFunctionFof__Group__1__Impl : ( ( rule__VLSFunctionFof__Group_1__0 )? ) ;
    public final void rule__VLSFunctionFof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3847:1: ( ( ( rule__VLSFunctionFof__Group_1__0 )? ) )
            // InternalVampireLanguage.g:3848:1: ( ( rule__VLSFunctionFof__Group_1__0 )? )
            {
            // InternalVampireLanguage.g:3848:1: ( ( rule__VLSFunctionFof__Group_1__0 )? )
            // InternalVampireLanguage.g:3849:2: ( rule__VLSFunctionFof__Group_1__0 )?
            {
             before(grammarAccess.getVLSFunctionFofAccess().getGroup_1()); 
            // InternalVampireLanguage.g:3850:2: ( rule__VLSFunctionFof__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVampireLanguage.g:3850:3: rule__VLSFunctionFof__Group_1__0
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
    // InternalVampireLanguage.g:3859:1: rule__VLSFunctionFof__Group_1__0 : rule__VLSFunctionFof__Group_1__0__Impl rule__VLSFunctionFof__Group_1__1 ;
    public final void rule__VLSFunctionFof__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3863:1: ( rule__VLSFunctionFof__Group_1__0__Impl rule__VLSFunctionFof__Group_1__1 )
            // InternalVampireLanguage.g:3864:2: rule__VLSFunctionFof__Group_1__0__Impl rule__VLSFunctionFof__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalVampireLanguage.g:3871:1: rule__VLSFunctionFof__Group_1__0__Impl : ( '(' ) ;
    public final void rule__VLSFunctionFof__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3875:1: ( ( '(' ) )
            // InternalVampireLanguage.g:3876:1: ( '(' )
            {
            // InternalVampireLanguage.g:3876:1: ( '(' )
            // InternalVampireLanguage.g:3877:2: '('
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
    // InternalVampireLanguage.g:3886:1: rule__VLSFunctionFof__Group_1__1 : rule__VLSFunctionFof__Group_1__1__Impl rule__VLSFunctionFof__Group_1__2 ;
    public final void rule__VLSFunctionFof__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3890:1: ( rule__VLSFunctionFof__Group_1__1__Impl rule__VLSFunctionFof__Group_1__2 )
            // InternalVampireLanguage.g:3891:2: rule__VLSFunctionFof__Group_1__1__Impl rule__VLSFunctionFof__Group_1__2
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
    // InternalVampireLanguage.g:3898:1: rule__VLSFunctionFof__Group_1__1__Impl : ( ( rule__VLSFunctionFof__TermsAssignment_1_1 ) ) ;
    public final void rule__VLSFunctionFof__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3902:1: ( ( ( rule__VLSFunctionFof__TermsAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:3903:1: ( ( rule__VLSFunctionFof__TermsAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:3903:1: ( ( rule__VLSFunctionFof__TermsAssignment_1_1 ) )
            // InternalVampireLanguage.g:3904:2: ( rule__VLSFunctionFof__TermsAssignment_1_1 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getTermsAssignment_1_1()); 
            // InternalVampireLanguage.g:3905:2: ( rule__VLSFunctionFof__TermsAssignment_1_1 )
            // InternalVampireLanguage.g:3905:3: rule__VLSFunctionFof__TermsAssignment_1_1
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
    // InternalVampireLanguage.g:3913:1: rule__VLSFunctionFof__Group_1__2 : rule__VLSFunctionFof__Group_1__2__Impl rule__VLSFunctionFof__Group_1__3 ;
    public final void rule__VLSFunctionFof__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3917:1: ( rule__VLSFunctionFof__Group_1__2__Impl rule__VLSFunctionFof__Group_1__3 )
            // InternalVampireLanguage.g:3918:2: rule__VLSFunctionFof__Group_1__2__Impl rule__VLSFunctionFof__Group_1__3
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
    // InternalVampireLanguage.g:3925:1: rule__VLSFunctionFof__Group_1__2__Impl : ( ( rule__VLSFunctionFof__Group_1_2__0 )* ) ;
    public final void rule__VLSFunctionFof__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3929:1: ( ( ( rule__VLSFunctionFof__Group_1_2__0 )* ) )
            // InternalVampireLanguage.g:3930:1: ( ( rule__VLSFunctionFof__Group_1_2__0 )* )
            {
            // InternalVampireLanguage.g:3930:1: ( ( rule__VLSFunctionFof__Group_1_2__0 )* )
            // InternalVampireLanguage.g:3931:2: ( rule__VLSFunctionFof__Group_1_2__0 )*
            {
             before(grammarAccess.getVLSFunctionFofAccess().getGroup_1_2()); 
            // InternalVampireLanguage.g:3932:2: ( rule__VLSFunctionFof__Group_1_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==44) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalVampireLanguage.g:3932:3: rule__VLSFunctionFof__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__VLSFunctionFof__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalVampireLanguage.g:3940:1: rule__VLSFunctionFof__Group_1__3 : rule__VLSFunctionFof__Group_1__3__Impl ;
    public final void rule__VLSFunctionFof__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3944:1: ( rule__VLSFunctionFof__Group_1__3__Impl )
            // InternalVampireLanguage.g:3945:2: rule__VLSFunctionFof__Group_1__3__Impl
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
    // InternalVampireLanguage.g:3951:1: rule__VLSFunctionFof__Group_1__3__Impl : ( ')' ) ;
    public final void rule__VLSFunctionFof__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3955:1: ( ( ')' ) )
            // InternalVampireLanguage.g:3956:1: ( ')' )
            {
            // InternalVampireLanguage.g:3956:1: ( ')' )
            // InternalVampireLanguage.g:3957:2: ')'
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
    // InternalVampireLanguage.g:3967:1: rule__VLSFunctionFof__Group_1_2__0 : rule__VLSFunctionFof__Group_1_2__0__Impl rule__VLSFunctionFof__Group_1_2__1 ;
    public final void rule__VLSFunctionFof__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3971:1: ( rule__VLSFunctionFof__Group_1_2__0__Impl rule__VLSFunctionFof__Group_1_2__1 )
            // InternalVampireLanguage.g:3972:2: rule__VLSFunctionFof__Group_1_2__0__Impl rule__VLSFunctionFof__Group_1_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalVampireLanguage.g:3979:1: rule__VLSFunctionFof__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__VLSFunctionFof__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3983:1: ( ( ',' ) )
            // InternalVampireLanguage.g:3984:1: ( ',' )
            {
            // InternalVampireLanguage.g:3984:1: ( ',' )
            // InternalVampireLanguage.g:3985:2: ','
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
    // InternalVampireLanguage.g:3994:1: rule__VLSFunctionFof__Group_1_2__1 : rule__VLSFunctionFof__Group_1_2__1__Impl ;
    public final void rule__VLSFunctionFof__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3998:1: ( rule__VLSFunctionFof__Group_1_2__1__Impl )
            // InternalVampireLanguage.g:3999:2: rule__VLSFunctionFof__Group_1_2__1__Impl
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
    // InternalVampireLanguage.g:4005:1: rule__VLSFunctionFof__Group_1_2__1__Impl : ( ( rule__VLSFunctionFof__TermsAssignment_1_2_1 ) ) ;
    public final void rule__VLSFunctionFof__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4009:1: ( ( ( rule__VLSFunctionFof__TermsAssignment_1_2_1 ) ) )
            // InternalVampireLanguage.g:4010:1: ( ( rule__VLSFunctionFof__TermsAssignment_1_2_1 ) )
            {
            // InternalVampireLanguage.g:4010:1: ( ( rule__VLSFunctionFof__TermsAssignment_1_2_1 ) )
            // InternalVampireLanguage.g:4011:2: ( rule__VLSFunctionFof__TermsAssignment_1_2_1 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getTermsAssignment_1_2_1()); 
            // InternalVampireLanguage.g:4012:2: ( rule__VLSFunctionFof__TermsAssignment_1_2_1 )
            // InternalVampireLanguage.g:4012:3: rule__VLSFunctionFof__TermsAssignment_1_2_1
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


    // $ANTLR start "rule__VampireModel__CommentsAssignment_0"
    // InternalVampireLanguage.g:4021:1: rule__VampireModel__CommentsAssignment_0 : ( ruleVLSComment ) ;
    public final void rule__VampireModel__CommentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4025:1: ( ( ruleVLSComment ) )
            // InternalVampireLanguage.g:4026:2: ( ruleVLSComment )
            {
            // InternalVampireLanguage.g:4026:2: ( ruleVLSComment )
            // InternalVampireLanguage.g:4027:3: ruleVLSComment
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
    // InternalVampireLanguage.g:4036:1: rule__VampireModel__FormulasAssignment_1 : ( ruleVLSFofFormula ) ;
    public final void rule__VampireModel__FormulasAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4040:1: ( ( ruleVLSFofFormula ) )
            // InternalVampireLanguage.g:4041:2: ( ruleVLSFofFormula )
            {
            // InternalVampireLanguage.g:4041:2: ( ruleVLSFofFormula )
            // InternalVampireLanguage.g:4042:3: ruleVLSFofFormula
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
    // InternalVampireLanguage.g:4051:1: rule__VLSComment__CommentAssignment : ( RULE_SINGLE_COMMENT ) ;
    public final void rule__VLSComment__CommentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4055:1: ( ( RULE_SINGLE_COMMENT ) )
            // InternalVampireLanguage.g:4056:2: ( RULE_SINGLE_COMMENT )
            {
            // InternalVampireLanguage.g:4056:2: ( RULE_SINGLE_COMMENT )
            // InternalVampireLanguage.g:4057:3: RULE_SINGLE_COMMENT
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


    // $ANTLR start "rule__VLSFunctionDeclaration__NameAssignment"
    // InternalVampireLanguage.g:4066:1: rule__VLSFunctionDeclaration__NameAssignment : ( ( rule__VLSFunctionDeclaration__NameAlternatives_0 ) ) ;
    public final void rule__VLSFunctionDeclaration__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4070:1: ( ( ( rule__VLSFunctionDeclaration__NameAlternatives_0 ) ) )
            // InternalVampireLanguage.g:4071:2: ( ( rule__VLSFunctionDeclaration__NameAlternatives_0 ) )
            {
            // InternalVampireLanguage.g:4071:2: ( ( rule__VLSFunctionDeclaration__NameAlternatives_0 ) )
            // InternalVampireLanguage.g:4072:3: ( rule__VLSFunctionDeclaration__NameAlternatives_0 )
            {
             before(grammarAccess.getVLSFunctionDeclarationAccess().getNameAlternatives_0()); 
            // InternalVampireLanguage.g:4073:3: ( rule__VLSFunctionDeclaration__NameAlternatives_0 )
            // InternalVampireLanguage.g:4073:4: rule__VLSFunctionDeclaration__NameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionDeclaration__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSFunctionDeclarationAccess().getNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionDeclaration__NameAssignment"


    // $ANTLR start "rule__VLSFofFormula__NameAssignment_2"
    // InternalVampireLanguage.g:4081:1: rule__VLSFofFormula__NameAssignment_2 : ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) ) ;
    public final void rule__VLSFofFormula__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4085:1: ( ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) ) )
            // InternalVampireLanguage.g:4086:2: ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) )
            {
            // InternalVampireLanguage.g:4086:2: ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) )
            // InternalVampireLanguage.g:4087:3: ( rule__VLSFofFormula__NameAlternatives_2_0 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getNameAlternatives_2_0()); 
            // InternalVampireLanguage.g:4088:3: ( rule__VLSFofFormula__NameAlternatives_2_0 )
            // InternalVampireLanguage.g:4088:4: rule__VLSFofFormula__NameAlternatives_2_0
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
    // InternalVampireLanguage.g:4096:1: rule__VLSFofFormula__FofRoleAssignment_4 : ( ruleVLSRole ) ;
    public final void rule__VLSFofFormula__FofRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4100:1: ( ( ruleVLSRole ) )
            // InternalVampireLanguage.g:4101:2: ( ruleVLSRole )
            {
            // InternalVampireLanguage.g:4101:2: ( ruleVLSRole )
            // InternalVampireLanguage.g:4102:3: ruleVLSRole
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
    // InternalVampireLanguage.g:4111:1: rule__VLSFofFormula__FofFormulaAssignment_6 : ( ruleVLSTerm ) ;
    public final void rule__VLSFofFormula__FofFormulaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4115:1: ( ( ruleVLSTerm ) )
            // InternalVampireLanguage.g:4116:2: ( ruleVLSTerm )
            {
            // InternalVampireLanguage.g:4116:2: ( ruleVLSTerm )
            // InternalVampireLanguage.g:4117:3: ruleVLSTerm
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
    // InternalVampireLanguage.g:4126:1: rule__VLSFofFormula__AnnotationsAssignment_7_1 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSFofFormula__AnnotationsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4130:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:4131:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:4131:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:4132:3: ruleVLSAnnotation
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
    // InternalVampireLanguage.g:4141:1: rule__VLSAnnotation__NameAssignment_1 : ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) ) ;
    public final void rule__VLSAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4145:1: ( ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) ) )
            // InternalVampireLanguage.g:4146:2: ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) )
            {
            // InternalVampireLanguage.g:4146:2: ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) )
            // InternalVampireLanguage.g:4147:3: ( rule__VLSAnnotation__NameAlternatives_1_0 )
            {
             before(grammarAccess.getVLSAnnotationAccess().getNameAlternatives_1_0()); 
            // InternalVampireLanguage.g:4148:3: ( rule__VLSAnnotation__NameAlternatives_1_0 )
            // InternalVampireLanguage.g:4148:4: rule__VLSAnnotation__NameAlternatives_1_0
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
    // InternalVampireLanguage.g:4156:1: rule__VLSAnnotation__FollowupAssignment_2_1 : ( ruleVLSAnnotationTerms ) ;
    public final void rule__VLSAnnotation__FollowupAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4160:1: ( ( ruleVLSAnnotationTerms ) )
            // InternalVampireLanguage.g:4161:2: ( ruleVLSAnnotationTerms )
            {
            // InternalVampireLanguage.g:4161:2: ( ruleVLSAnnotationTerms )
            // InternalVampireLanguage.g:4162:3: ruleVLSAnnotationTerms
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
    // InternalVampireLanguage.g:4171:1: rule__VLSAnnotationTerms__TermsAssignment_0 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSAnnotationTerms__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4175:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:4176:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:4176:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:4177:3: ruleVLSAnnotation
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
    // InternalVampireLanguage.g:4186:1: rule__VLSAnnotationTerms__TermsAssignment_1_1 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSAnnotationTerms__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4190:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:4191:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:4191:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:4192:3: ruleVLSAnnotation
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
    // InternalVampireLanguage.g:4201:1: rule__VLSBinary__RightAssignment_1_0_1 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4205:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:4206:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:4206:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:4207:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:4216:1: rule__VLSBinary__RightAssignment_1_1_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4220:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:4221:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:4221:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:4222:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:4231:1: rule__VLSBinary__RightAssignment_1_2_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4235:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:4236:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:4236:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:4237:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:4246:1: rule__VLSUniversalQuantifier__VariablesAssignment_1_2 : ( ruleVLSVariable ) ;
    public final void rule__VLSUniversalQuantifier__VariablesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4250:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:4251:2: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:4251:2: ( ruleVLSVariable )
            // InternalVampireLanguage.g:4252:3: ruleVLSVariable
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
    // InternalVampireLanguage.g:4261:1: rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 : ( ruleVLSVariable ) ;
    public final void rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4265:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:4266:2: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:4266:2: ( ruleVLSVariable )
            // InternalVampireLanguage.g:4267:3: ruleVLSVariable
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
    // InternalVampireLanguage.g:4276:1: rule__VLSUniversalQuantifier__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSUniversalQuantifier__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4280:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:4281:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:4281:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:4282:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:4291:1: rule__VLSExistentialQuantifier__VariablesAssignment_1_2 : ( ruleVLSVariable ) ;
    public final void rule__VLSExistentialQuantifier__VariablesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4295:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:4296:2: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:4296:2: ( ruleVLSVariable )
            // InternalVampireLanguage.g:4297:3: ruleVLSVariable
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
    // InternalVampireLanguage.g:4306:1: rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 : ( ruleVLSVariable ) ;
    public final void rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4310:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:4311:2: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:4311:2: ( ruleVLSVariable )
            // InternalVampireLanguage.g:4312:3: ruleVLSVariable
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
    // InternalVampireLanguage.g:4321:1: rule__VLSExistentialQuantifier__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSExistentialQuantifier__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4325:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:4326:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:4326:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:4327:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:4336:1: rule__VLSUnaryNegation__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSUnaryNegation__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4340:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:4341:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:4341:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:4342:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:4351:1: rule__VLSUnaryInfix__RightAssignment_1_1 : ( ruleVLSFunction ) ;
    public final void rule__VLSUnaryInfix__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4355:1: ( ( ruleVLSFunction ) )
            // InternalVampireLanguage.g:4356:2: ( ruleVLSFunction )
            {
            // InternalVampireLanguage.g:4356:2: ( ruleVLSFunction )
            // InternalVampireLanguage.g:4357:3: ruleVLSFunction
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getRightVLSFunctionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSFunction();

            state._fsp--;

             after(grammarAccess.getVLSUnaryInfixAccess().getRightVLSFunctionParserRuleCall_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__VLSFunction__ConstantAssignment_1"
    // InternalVampireLanguage.g:4366:1: rule__VLSFunction__ConstantAssignment_1 : ( ruleVLSFunctionDeclaration ) ;
    public final void rule__VLSFunction__ConstantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4370:1: ( ( ruleVLSFunctionDeclaration ) )
            // InternalVampireLanguage.g:4371:2: ( ruleVLSFunctionDeclaration )
            {
            // InternalVampireLanguage.g:4371:2: ( ruleVLSFunctionDeclaration )
            // InternalVampireLanguage.g:4372:3: ruleVLSFunctionDeclaration
            {
             before(grammarAccess.getVLSFunctionAccess().getConstantVLSFunctionDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSFunctionDeclaration();

            state._fsp--;

             after(grammarAccess.getVLSFunctionAccess().getConstantVLSFunctionDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__ConstantAssignment_1"


    // $ANTLR start "rule__VLSFunction__TermsAssignment_2_1"
    // InternalVampireLanguage.g:4381:1: rule__VLSFunction__TermsAssignment_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSFunction__TermsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4385:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:4386:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:4386:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:4387:3: ruleVLSFofTerm
            {
             before(grammarAccess.getVLSFunctionAccess().getTermsVLSFofTermParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSFofTerm();

            state._fsp--;

             after(grammarAccess.getVLSFunctionAccess().getTermsVLSFofTermParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__TermsAssignment_2_1"


    // $ANTLR start "rule__VLSFunction__TermsAssignment_2_2_1"
    // InternalVampireLanguage.g:4396:1: rule__VLSFunction__TermsAssignment_2_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSFunction__TermsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4400:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:4401:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:4401:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:4402:3: ruleVLSFofTerm
            {
             before(grammarAccess.getVLSFunctionAccess().getTermsVLSFofTermParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSFofTerm();

            state._fsp--;

             after(grammarAccess.getVLSFunctionAccess().getTermsVLSFofTermParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunction__TermsAssignment_2_2_1"


    // $ANTLR start "rule__VLSVariable__NameAssignment"
    // InternalVampireLanguage.g:4411:1: rule__VLSVariable__NameAssignment : ( RULE_UPPER_WORD_ID ) ;
    public final void rule__VLSVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4415:1: ( ( RULE_UPPER_WORD_ID ) )
            // InternalVampireLanguage.g:4416:2: ( RULE_UPPER_WORD_ID )
            {
            // InternalVampireLanguage.g:4416:2: ( RULE_UPPER_WORD_ID )
            // InternalVampireLanguage.g:4417:3: RULE_UPPER_WORD_ID
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
    // InternalVampireLanguage.g:4426:1: rule__VLSFunctionFof__FunctorAssignment_0 : ( ruleVLSFunctionDeclaration ) ;
    public final void rule__VLSFunctionFof__FunctorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4430:1: ( ( ruleVLSFunctionDeclaration ) )
            // InternalVampireLanguage.g:4431:2: ( ruleVLSFunctionDeclaration )
            {
            // InternalVampireLanguage.g:4431:2: ( ruleVLSFunctionDeclaration )
            // InternalVampireLanguage.g:4432:3: ruleVLSFunctionDeclaration
            {
             before(grammarAccess.getVLSFunctionFofAccess().getFunctorVLSFunctionDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSFunctionDeclaration();

            state._fsp--;

             after(grammarAccess.getVLSFunctionFofAccess().getFunctorVLSFunctionDeclarationParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalVampireLanguage.g:4441:1: rule__VLSFunctionFof__TermsAssignment_1_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSFunctionFof__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4445:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:4446:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:4446:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:4447:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:4456:1: rule__VLSFunctionFof__TermsAssignment_1_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSFunctionFof__TermsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4460:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:4461:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:4461:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:4462:3: ruleVLSFofTerm
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


    // $ANTLR start "rule__VLSDefinedTerm__NameAssignment"
    // InternalVampireLanguage.g:4471:1: rule__VLSDefinedTerm__NameAssignment : ( ( rule__VLSDefinedTerm__NameAlternatives_0 ) ) ;
    public final void rule__VLSDefinedTerm__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4475:1: ( ( ( rule__VLSDefinedTerm__NameAlternatives_0 ) ) )
            // InternalVampireLanguage.g:4476:2: ( ( rule__VLSDefinedTerm__NameAlternatives_0 ) )
            {
            // InternalVampireLanguage.g:4476:2: ( ( rule__VLSDefinedTerm__NameAlternatives_0 ) )
            // InternalVampireLanguage.g:4477:3: ( rule__VLSDefinedTerm__NameAlternatives_0 )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getNameAlternatives_0()); 
            // InternalVampireLanguage.g:4478:3: ( rule__VLSDefinedTerm__NameAlternatives_0 )
            // InternalVampireLanguage.g:4478:4: rule__VLSDefinedTerm__NameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSDefinedTerm__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSDefinedTermAccess().getNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSDefinedTerm__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000040000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000003FFF8000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x1A000800000000F0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00018BFFF8000030L});
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
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000002FF0L});

}