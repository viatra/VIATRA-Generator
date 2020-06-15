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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LOWER_WORD_ID", "RULE_SIGNED_LITERAL", "RULE_SINGLE_QUOTE", "RULE_DOLLAR_ID", "RULE_DOUBLE_DOLLAR_ID", "RULE_SINGLE_COMMENT", "RULE_LITERAL", "RULE_UPPER_WORD_ID", "RULE_DOUBLE_QUOTE", "RULE_ALPHA_NUMERIC", "RULE_SIGN", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'distinct_domain'", "'finite_domain'", "'axiom'", "'conjecture'", "'hypothesis'", "'definition'", "'assumption'", "'lemma'", "'theorem'", "'corollary'", "'negated_conjecture'", "'plain'", "'type'", "'fi_domain'", "'fi_functors'", "'fi_predicates'", "'unknown'", "'Satisfiable!'", "'WARNING!'", "'Could'", "'not'", "'set'", "'resource'", "'limit:'", "'Virtual'", "'memory.'", "'TRYING'", "'['", "']'", "'Finite'", "'Model'", "'Found!'", "'fof'", "'('", "','", "')'", "'.'", "'tff'", "'declare_'", "':'", "'>'", "'*'", "'<=>'", "'=>'", "'<='", "'<~>'", "'~|'", "'~&'", "'&'", "'|'", "'!'", "'?'", "'~'", "'!='", "'='", "':='", "'$true'", "'$false'", "'$less'"
    };
    public static final int T__50=50;
    public static final int RULE_SIGN=14;
    public static final int T__59=59;
    public static final int RULE_SIGNED_LITERAL=5;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_DOUBLE_QUOTE=12;
    public static final int T__52=52;
    public static final int RULE_LITERAL=10;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=16;
    public static final int RULE_SINGLE_QUOTE=6;
    public static final int RULE_SINGLE_COMMENT=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=15;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_LOWER_WORD_ID=4;
    public static final int RULE_STRING=17;
    public static final int RULE_SL_COMMENT=19;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_UPPER_WORD_ID=11;
    public static final int RULE_WS=20;
    public static final int RULE_DOLLAR_ID=7;
    public static final int RULE_ALPHA_NUMERIC=13;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_DOUBLE_DOLLAR_ID=8;
    public static final int T__48=48;
    public static final int T__49=49;
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

                if ( (LA1_0==RULE_SINGLE_COMMENT||(LA1_0>=39 && LA1_0<=40)||LA1_0==48||LA1_0==51||LA1_0==54||LA1_0==59) ) {
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


    // $ANTLR start "entryRuleVLSConfirmations"
    // InternalVampireLanguage.g:103:1: entryRuleVLSConfirmations : ruleVLSConfirmations EOF ;
    public final void entryRuleVLSConfirmations() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:104:1: ( ruleVLSConfirmations EOF )
            // InternalVampireLanguage.g:105:1: ruleVLSConfirmations EOF
            {
             before(grammarAccess.getVLSConfirmationsRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSConfirmations();

            state._fsp--;

             after(grammarAccess.getVLSConfirmationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSConfirmations"


    // $ANTLR start "ruleVLSConfirmations"
    // InternalVampireLanguage.g:112:1: ruleVLSConfirmations : ( ( rule__VLSConfirmations__Alternatives ) ) ;
    public final void ruleVLSConfirmations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:116:2: ( ( ( rule__VLSConfirmations__Alternatives ) ) )
            // InternalVampireLanguage.g:117:2: ( ( rule__VLSConfirmations__Alternatives ) )
            {
            // InternalVampireLanguage.g:117:2: ( ( rule__VLSConfirmations__Alternatives ) )
            // InternalVampireLanguage.g:118:3: ( rule__VLSConfirmations__Alternatives )
            {
             before(grammarAccess.getVLSConfirmationsAccess().getAlternatives()); 
            // InternalVampireLanguage.g:119:3: ( rule__VLSConfirmations__Alternatives )
            // InternalVampireLanguage.g:119:4: rule__VLSConfirmations__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVLSConfirmationsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSConfirmations"


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


    // $ANTLR start "entryRuleVLSTffFormula"
    // InternalVampireLanguage.g:153:1: entryRuleVLSTffFormula : ruleVLSTffFormula EOF ;
    public final void entryRuleVLSTffFormula() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:154:1: ( ruleVLSTffFormula EOF )
            // InternalVampireLanguage.g:155:1: ruleVLSTffFormula EOF
            {
             before(grammarAccess.getVLSTffFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSTffFormula();

            state._fsp--;

             after(grammarAccess.getVLSTffFormulaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSTffFormula"


    // $ANTLR start "ruleVLSTffFormula"
    // InternalVampireLanguage.g:162:1: ruleVLSTffFormula : ( ( rule__VLSTffFormula__Group__0 ) ) ;
    public final void ruleVLSTffFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:166:2: ( ( ( rule__VLSTffFormula__Group__0 ) ) )
            // InternalVampireLanguage.g:167:2: ( ( rule__VLSTffFormula__Group__0 ) )
            {
            // InternalVampireLanguage.g:167:2: ( ( rule__VLSTffFormula__Group__0 ) )
            // InternalVampireLanguage.g:168:3: ( rule__VLSTffFormula__Group__0 )
            {
             before(grammarAccess.getVLSTffFormulaAccess().getGroup()); 
            // InternalVampireLanguage.g:169:3: ( rule__VLSTffFormula__Group__0 )
            // InternalVampireLanguage.g:169:4: rule__VLSTffFormula__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSTffFormulaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSTffFormula"


    // $ANTLR start "entryRuleVLSTffName"
    // InternalVampireLanguage.g:178:1: entryRuleVLSTffName : ruleVLSTffName EOF ;
    public final void entryRuleVLSTffName() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:179:1: ( ruleVLSTffName EOF )
            // InternalVampireLanguage.g:180:1: ruleVLSTffName EOF
            {
             before(grammarAccess.getVLSTffNameRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSTffName();

            state._fsp--;

             after(grammarAccess.getVLSTffNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSTffName"


    // $ANTLR start "ruleVLSTffName"
    // InternalVampireLanguage.g:187:1: ruleVLSTffName : ( ( rule__VLSTffName__Alternatives ) ) ;
    public final void ruleVLSTffName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:191:2: ( ( ( rule__VLSTffName__Alternatives ) ) )
            // InternalVampireLanguage.g:192:2: ( ( rule__VLSTffName__Alternatives ) )
            {
            // InternalVampireLanguage.g:192:2: ( ( rule__VLSTffName__Alternatives ) )
            // InternalVampireLanguage.g:193:3: ( rule__VLSTffName__Alternatives )
            {
             before(grammarAccess.getVLSTffNameAccess().getAlternatives()); 
            // InternalVampireLanguage.g:194:3: ( rule__VLSTffName__Alternatives )
            // InternalVampireLanguage.g:194:4: rule__VLSTffName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VLSTffName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVLSTffNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSTffName"


    // $ANTLR start "entryRuleVLSTffDistinct"
    // InternalVampireLanguage.g:203:1: entryRuleVLSTffDistinct : ruleVLSTffDistinct EOF ;
    public final void entryRuleVLSTffDistinct() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:204:1: ( ruleVLSTffDistinct EOF )
            // InternalVampireLanguage.g:205:1: ruleVLSTffDistinct EOF
            {
             before(grammarAccess.getVLSTffDistinctRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSTffDistinct();

            state._fsp--;

             after(grammarAccess.getVLSTffDistinctRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSTffDistinct"


    // $ANTLR start "ruleVLSTffDistinct"
    // InternalVampireLanguage.g:212:1: ruleVLSTffDistinct : ( 'distinct_domain' ) ;
    public final void ruleVLSTffDistinct() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:216:2: ( ( 'distinct_domain' ) )
            // InternalVampireLanguage.g:217:2: ( 'distinct_domain' )
            {
            // InternalVampireLanguage.g:217:2: ( 'distinct_domain' )
            // InternalVampireLanguage.g:218:3: 'distinct_domain'
            {
             before(grammarAccess.getVLSTffDistinctAccess().getDistinct_domainKeyword()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVLSTffDistinctAccess().getDistinct_domainKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSTffDistinct"


    // $ANTLR start "entryRuleVLSTffFinite"
    // InternalVampireLanguage.g:228:1: entryRuleVLSTffFinite : ruleVLSTffFinite EOF ;
    public final void entryRuleVLSTffFinite() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:229:1: ( ruleVLSTffFinite EOF )
            // InternalVampireLanguage.g:230:1: ruleVLSTffFinite EOF
            {
             before(grammarAccess.getVLSTffFiniteRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSTffFinite();

            state._fsp--;

             after(grammarAccess.getVLSTffFiniteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSTffFinite"


    // $ANTLR start "ruleVLSTffFinite"
    // InternalVampireLanguage.g:237:1: ruleVLSTffFinite : ( 'finite_domain' ) ;
    public final void ruleVLSTffFinite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:241:2: ( ( 'finite_domain' ) )
            // InternalVampireLanguage.g:242:2: ( 'finite_domain' )
            {
            // InternalVampireLanguage.g:242:2: ( 'finite_domain' )
            // InternalVampireLanguage.g:243:3: 'finite_domain'
            {
             before(grammarAccess.getVLSTffFiniteAccess().getFinite_domainKeyword()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVLSTffFiniteAccess().getFinite_domainKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSTffFinite"


    // $ANTLR start "entryRuleVLSTffDeclPred"
    // InternalVampireLanguage.g:253:1: entryRuleVLSTffDeclPred : ruleVLSTffDeclPred EOF ;
    public final void entryRuleVLSTffDeclPred() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:254:1: ( ruleVLSTffDeclPred EOF )
            // InternalVampireLanguage.g:255:1: ruleVLSTffDeclPred EOF
            {
             before(grammarAccess.getVLSTffDeclPredRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSTffDeclPred();

            state._fsp--;

             after(grammarAccess.getVLSTffDeclPredRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSTffDeclPred"


    // $ANTLR start "ruleVLSTffDeclPred"
    // InternalVampireLanguage.g:262:1: ruleVLSTffDeclPred : ( ( rule__VLSTffDeclPred__Alternatives ) ) ;
    public final void ruleVLSTffDeclPred() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:266:2: ( ( ( rule__VLSTffDeclPred__Alternatives ) ) )
            // InternalVampireLanguage.g:267:2: ( ( rule__VLSTffDeclPred__Alternatives ) )
            {
            // InternalVampireLanguage.g:267:2: ( ( rule__VLSTffDeclPred__Alternatives ) )
            // InternalVampireLanguage.g:268:3: ( rule__VLSTffDeclPred__Alternatives )
            {
             before(grammarAccess.getVLSTffDeclPredAccess().getAlternatives()); 
            // InternalVampireLanguage.g:269:3: ( rule__VLSTffDeclPred__Alternatives )
            // InternalVampireLanguage.g:269:4: rule__VLSTffDeclPred__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VLSTffDeclPred__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVLSTffDeclPredAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSTffDeclPred"


    // $ANTLR start "entryRuleVLSRole"
    // InternalVampireLanguage.g:278:1: entryRuleVLSRole : ruleVLSRole EOF ;
    public final void entryRuleVLSRole() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:279:1: ( ruleVLSRole EOF )
            // InternalVampireLanguage.g:280:1: ruleVLSRole EOF
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
    // InternalVampireLanguage.g:287:1: ruleVLSRole : ( ( rule__VLSRole__Alternatives ) ) ;
    public final void ruleVLSRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:291:2: ( ( ( rule__VLSRole__Alternatives ) ) )
            // InternalVampireLanguage.g:292:2: ( ( rule__VLSRole__Alternatives ) )
            {
            // InternalVampireLanguage.g:292:2: ( ( rule__VLSRole__Alternatives ) )
            // InternalVampireLanguage.g:293:3: ( rule__VLSRole__Alternatives )
            {
             before(grammarAccess.getVLSRoleAccess().getAlternatives()); 
            // InternalVampireLanguage.g:294:3: ( rule__VLSRole__Alternatives )
            // InternalVampireLanguage.g:294:4: rule__VLSRole__Alternatives
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


    // $ANTLR start "entryRuleVLSAnnotation"
    // InternalVampireLanguage.g:303:1: entryRuleVLSAnnotation : ruleVLSAnnotation EOF ;
    public final void entryRuleVLSAnnotation() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:304:1: ( ruleVLSAnnotation EOF )
            // InternalVampireLanguage.g:305:1: ruleVLSAnnotation EOF
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
    // InternalVampireLanguage.g:312:1: ruleVLSAnnotation : ( ( rule__VLSAnnotation__Group__0 ) ) ;
    public final void ruleVLSAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:316:2: ( ( ( rule__VLSAnnotation__Group__0 ) ) )
            // InternalVampireLanguage.g:317:2: ( ( rule__VLSAnnotation__Group__0 ) )
            {
            // InternalVampireLanguage.g:317:2: ( ( rule__VLSAnnotation__Group__0 ) )
            // InternalVampireLanguage.g:318:3: ( rule__VLSAnnotation__Group__0 )
            {
             before(grammarAccess.getVLSAnnotationAccess().getGroup()); 
            // InternalVampireLanguage.g:319:3: ( rule__VLSAnnotation__Group__0 )
            // InternalVampireLanguage.g:319:4: rule__VLSAnnotation__Group__0
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
    // InternalVampireLanguage.g:328:1: entryRuleVLSAnnotationTerms : ruleVLSAnnotationTerms EOF ;
    public final void entryRuleVLSAnnotationTerms() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:329:1: ( ruleVLSAnnotationTerms EOF )
            // InternalVampireLanguage.g:330:1: ruleVLSAnnotationTerms EOF
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
    // InternalVampireLanguage.g:337:1: ruleVLSAnnotationTerms : ( ( rule__VLSAnnotationTerms__Group__0 ) ) ;
    public final void ruleVLSAnnotationTerms() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:341:2: ( ( ( rule__VLSAnnotationTerms__Group__0 ) ) )
            // InternalVampireLanguage.g:342:2: ( ( rule__VLSAnnotationTerms__Group__0 ) )
            {
            // InternalVampireLanguage.g:342:2: ( ( rule__VLSAnnotationTerms__Group__0 ) )
            // InternalVampireLanguage.g:343:3: ( rule__VLSAnnotationTerms__Group__0 )
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getGroup()); 
            // InternalVampireLanguage.g:344:3: ( rule__VLSAnnotationTerms__Group__0 )
            // InternalVampireLanguage.g:344:4: rule__VLSAnnotationTerms__Group__0
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


    // $ANTLR start "entryRuleVLSTffTerm"
    // InternalVampireLanguage.g:353:1: entryRuleVLSTffTerm : ruleVLSTffTerm EOF ;
    public final void entryRuleVLSTffTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:354:1: ( ruleVLSTffTerm EOF )
            // InternalVampireLanguage.g:355:1: ruleVLSTffTerm EOF
            {
             before(grammarAccess.getVLSTffTermRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSTffTerm();

            state._fsp--;

             after(grammarAccess.getVLSTffTermRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSTffTerm"


    // $ANTLR start "ruleVLSTffTerm"
    // InternalVampireLanguage.g:362:1: ruleVLSTffTerm : ( ( rule__VLSTffTerm__Alternatives ) ) ;
    public final void ruleVLSTffTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:366:2: ( ( ( rule__VLSTffTerm__Alternatives ) ) )
            // InternalVampireLanguage.g:367:2: ( ( rule__VLSTffTerm__Alternatives ) )
            {
            // InternalVampireLanguage.g:367:2: ( ( rule__VLSTffTerm__Alternatives ) )
            // InternalVampireLanguage.g:368:3: ( rule__VLSTffTerm__Alternatives )
            {
             before(grammarAccess.getVLSTffTermAccess().getAlternatives()); 
            // InternalVampireLanguage.g:369:3: ( rule__VLSTffTerm__Alternatives )
            // InternalVampireLanguage.g:369:4: rule__VLSTffTerm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VLSTffTerm__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVLSTffTermAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSTffTerm"


    // $ANTLR start "entryRuleVLSCommentTerm"
    // InternalVampireLanguage.g:378:1: entryRuleVLSCommentTerm : ruleVLSCommentTerm EOF ;
    public final void entryRuleVLSCommentTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:379:1: ( ruleVLSCommentTerm EOF )
            // InternalVampireLanguage.g:380:1: ruleVLSCommentTerm EOF
            {
             before(grammarAccess.getVLSCommentTermRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSCommentTerm();

            state._fsp--;

             after(grammarAccess.getVLSCommentTermRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSCommentTerm"


    // $ANTLR start "ruleVLSCommentTerm"
    // InternalVampireLanguage.g:387:1: ruleVLSCommentTerm : ( ( rule__VLSCommentTerm__CommentAssignment ) ) ;
    public final void ruleVLSCommentTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:391:2: ( ( ( rule__VLSCommentTerm__CommentAssignment ) ) )
            // InternalVampireLanguage.g:392:2: ( ( rule__VLSCommentTerm__CommentAssignment ) )
            {
            // InternalVampireLanguage.g:392:2: ( ( rule__VLSCommentTerm__CommentAssignment ) )
            // InternalVampireLanguage.g:393:3: ( rule__VLSCommentTerm__CommentAssignment )
            {
             before(grammarAccess.getVLSCommentTermAccess().getCommentAssignment()); 
            // InternalVampireLanguage.g:394:3: ( rule__VLSCommentTerm__CommentAssignment )
            // InternalVampireLanguage.g:394:4: rule__VLSCommentTerm__CommentAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VLSCommentTerm__CommentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVLSCommentTermAccess().getCommentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSCommentTerm"


    // $ANTLR start "entryRuleVLSDeclaration"
    // InternalVampireLanguage.g:403:1: entryRuleVLSDeclaration : ruleVLSDeclaration EOF ;
    public final void entryRuleVLSDeclaration() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:404:1: ( ruleVLSDeclaration EOF )
            // InternalVampireLanguage.g:405:1: ruleVLSDeclaration EOF
            {
             before(grammarAccess.getVLSDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSDeclaration();

            state._fsp--;

             after(grammarAccess.getVLSDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSDeclaration"


    // $ANTLR start "ruleVLSDeclaration"
    // InternalVampireLanguage.g:412:1: ruleVLSDeclaration : ( ( rule__VLSDeclaration__Alternatives ) ) ;
    public final void ruleVLSDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:416:2: ( ( ( rule__VLSDeclaration__Alternatives ) ) )
            // InternalVampireLanguage.g:417:2: ( ( rule__VLSDeclaration__Alternatives ) )
            {
            // InternalVampireLanguage.g:417:2: ( ( rule__VLSDeclaration__Alternatives ) )
            // InternalVampireLanguage.g:418:3: ( rule__VLSDeclaration__Alternatives )
            {
             before(grammarAccess.getVLSDeclarationAccess().getAlternatives()); 
            // InternalVampireLanguage.g:419:3: ( rule__VLSDeclaration__Alternatives )
            // InternalVampireLanguage.g:419:4: rule__VLSDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VLSDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVLSDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSDeclaration"


    // $ANTLR start "entryRuleVLSOtherDeclaration"
    // InternalVampireLanguage.g:428:1: entryRuleVLSOtherDeclaration : ruleVLSOtherDeclaration EOF ;
    public final void entryRuleVLSOtherDeclaration() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:429:1: ( ruleVLSOtherDeclaration EOF )
            // InternalVampireLanguage.g:430:1: ruleVLSOtherDeclaration EOF
            {
             before(grammarAccess.getVLSOtherDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSOtherDeclaration();

            state._fsp--;

             after(grammarAccess.getVLSOtherDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSOtherDeclaration"


    // $ANTLR start "ruleVLSOtherDeclaration"
    // InternalVampireLanguage.g:437:1: ruleVLSOtherDeclaration : ( ( rule__VLSOtherDeclaration__Group__0 ) ) ;
    public final void ruleVLSOtherDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:441:2: ( ( ( rule__VLSOtherDeclaration__Group__0 ) ) )
            // InternalVampireLanguage.g:442:2: ( ( rule__VLSOtherDeclaration__Group__0 ) )
            {
            // InternalVampireLanguage.g:442:2: ( ( rule__VLSOtherDeclaration__Group__0 ) )
            // InternalVampireLanguage.g:443:3: ( rule__VLSOtherDeclaration__Group__0 )
            {
             before(grammarAccess.getVLSOtherDeclarationAccess().getGroup()); 
            // InternalVampireLanguage.g:444:3: ( rule__VLSOtherDeclaration__Group__0 )
            // InternalVampireLanguage.g:444:4: rule__VLSOtherDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSOtherDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSOtherDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSOtherDeclaration"


    // $ANTLR start "entryRuleVLSVariableDeclaration"
    // InternalVampireLanguage.g:453:1: entryRuleVLSVariableDeclaration : ruleVLSVariableDeclaration EOF ;
    public final void entryRuleVLSVariableDeclaration() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:454:1: ( ruleVLSVariableDeclaration EOF )
            // InternalVampireLanguage.g:455:1: ruleVLSVariableDeclaration EOF
            {
             before(grammarAccess.getVLSVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVLSVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSVariableDeclaration"


    // $ANTLR start "ruleVLSVariableDeclaration"
    // InternalVampireLanguage.g:462:1: ruleVLSVariableDeclaration : ( ( rule__VLSVariableDeclaration__Group__0 ) ) ;
    public final void ruleVLSVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:466:2: ( ( ( rule__VLSVariableDeclaration__Group__0 ) ) )
            // InternalVampireLanguage.g:467:2: ( ( rule__VLSVariableDeclaration__Group__0 ) )
            {
            // InternalVampireLanguage.g:467:2: ( ( rule__VLSVariableDeclaration__Group__0 ) )
            // InternalVampireLanguage.g:468:3: ( rule__VLSVariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVLSVariableDeclarationAccess().getGroup()); 
            // InternalVampireLanguage.g:469:3: ( rule__VLSVariableDeclaration__Group__0 )
            // InternalVampireLanguage.g:469:4: rule__VLSVariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSVariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSVariableDeclaration"


    // $ANTLR start "entryRuleVLSTypeDef"
    // InternalVampireLanguage.g:478:1: entryRuleVLSTypeDef : ruleVLSTypeDef EOF ;
    public final void entryRuleVLSTypeDef() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:479:1: ( ruleVLSTypeDef EOF )
            // InternalVampireLanguage.g:480:1: ruleVLSTypeDef EOF
            {
             before(grammarAccess.getVLSTypeDefRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSTypeDef();

            state._fsp--;

             after(grammarAccess.getVLSTypeDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSTypeDef"


    // $ANTLR start "ruleVLSTypeDef"
    // InternalVampireLanguage.g:487:1: ruleVLSTypeDef : ( ( rule__VLSTypeDef__Group__0 ) ) ;
    public final void ruleVLSTypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:491:2: ( ( ( rule__VLSTypeDef__Group__0 ) ) )
            // InternalVampireLanguage.g:492:2: ( ( rule__VLSTypeDef__Group__0 ) )
            {
            // InternalVampireLanguage.g:492:2: ( ( rule__VLSTypeDef__Group__0 ) )
            // InternalVampireLanguage.g:493:3: ( rule__VLSTypeDef__Group__0 )
            {
             before(grammarAccess.getVLSTypeDefAccess().getGroup()); 
            // InternalVampireLanguage.g:494:3: ( rule__VLSTypeDef__Group__0 )
            // InternalVampireLanguage.g:494:4: rule__VLSTypeDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSTypeDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSTypeDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSTypeDef"


    // $ANTLR start "entryRuleVLSUnitaryTerm"
    // InternalVampireLanguage.g:503:1: entryRuleVLSUnitaryTerm : ruleVLSUnitaryTerm EOF ;
    public final void entryRuleVLSUnitaryTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:504:1: ( ruleVLSUnitaryTerm EOF )
            // InternalVampireLanguage.g:505:1: ruleVLSUnitaryTerm EOF
            {
             before(grammarAccess.getVLSUnitaryTermRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSUnitaryTerm();

            state._fsp--;

             after(grammarAccess.getVLSUnitaryTermRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSUnitaryTerm"


    // $ANTLR start "ruleVLSUnitaryTerm"
    // InternalVampireLanguage.g:512:1: ruleVLSUnitaryTerm : ( ( rule__VLSUnitaryTerm__Group__0 ) ) ;
    public final void ruleVLSUnitaryTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:516:2: ( ( ( rule__VLSUnitaryTerm__Group__0 ) ) )
            // InternalVampireLanguage.g:517:2: ( ( rule__VLSUnitaryTerm__Group__0 ) )
            {
            // InternalVampireLanguage.g:517:2: ( ( rule__VLSUnitaryTerm__Group__0 ) )
            // InternalVampireLanguage.g:518:3: ( rule__VLSUnitaryTerm__Group__0 )
            {
             before(grammarAccess.getVLSUnitaryTermAccess().getGroup()); 
            // InternalVampireLanguage.g:519:3: ( rule__VLSUnitaryTerm__Group__0 )
            // InternalVampireLanguage.g:519:4: rule__VLSUnitaryTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnitaryTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSUnitaryTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSUnitaryTerm"


    // $ANTLR start "entryRuleVLSTerm"
    // InternalVampireLanguage.g:528:1: entryRuleVLSTerm : ruleVLSTerm EOF ;
    public final void entryRuleVLSTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:529:1: ( ruleVLSTerm EOF )
            // InternalVampireLanguage.g:530:1: ruleVLSTerm EOF
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
    // InternalVampireLanguage.g:537:1: ruleVLSTerm : ( ruleVLSBinary ) ;
    public final void ruleVLSTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:541:2: ( ( ruleVLSBinary ) )
            // InternalVampireLanguage.g:542:2: ( ruleVLSBinary )
            {
            // InternalVampireLanguage.g:542:2: ( ruleVLSBinary )
            // InternalVampireLanguage.g:543:3: ruleVLSBinary
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
    // InternalVampireLanguage.g:553:1: entryRuleVLSBinary : ruleVLSBinary EOF ;
    public final void entryRuleVLSBinary() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:554:1: ( ruleVLSBinary EOF )
            // InternalVampireLanguage.g:555:1: ruleVLSBinary EOF
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
    // InternalVampireLanguage.g:562:1: ruleVLSBinary : ( ( rule__VLSBinary__Group__0 ) ) ;
    public final void ruleVLSBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:566:2: ( ( ( rule__VLSBinary__Group__0 ) ) )
            // InternalVampireLanguage.g:567:2: ( ( rule__VLSBinary__Group__0 ) )
            {
            // InternalVampireLanguage.g:567:2: ( ( rule__VLSBinary__Group__0 ) )
            // InternalVampireLanguage.g:568:3: ( rule__VLSBinary__Group__0 )
            {
             before(grammarAccess.getVLSBinaryAccess().getGroup()); 
            // InternalVampireLanguage.g:569:3: ( rule__VLSBinary__Group__0 )
            // InternalVampireLanguage.g:569:4: rule__VLSBinary__Group__0
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
    // InternalVampireLanguage.g:578:1: entryRuleVLSUnitaryFormula : ruleVLSUnitaryFormula EOF ;
    public final void entryRuleVLSUnitaryFormula() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:579:1: ( ruleVLSUnitaryFormula EOF )
            // InternalVampireLanguage.g:580:1: ruleVLSUnitaryFormula EOF
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
    // InternalVampireLanguage.g:587:1: ruleVLSUnitaryFormula : ( ( rule__VLSUnitaryFormula__Alternatives ) ) ;
    public final void ruleVLSUnitaryFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:591:2: ( ( ( rule__VLSUnitaryFormula__Alternatives ) ) )
            // InternalVampireLanguage.g:592:2: ( ( rule__VLSUnitaryFormula__Alternatives ) )
            {
            // InternalVampireLanguage.g:592:2: ( ( rule__VLSUnitaryFormula__Alternatives ) )
            // InternalVampireLanguage.g:593:3: ( rule__VLSUnitaryFormula__Alternatives )
            {
             before(grammarAccess.getVLSUnitaryFormulaAccess().getAlternatives()); 
            // InternalVampireLanguage.g:594:3: ( rule__VLSUnitaryFormula__Alternatives )
            // InternalVampireLanguage.g:594:4: rule__VLSUnitaryFormula__Alternatives
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
    // InternalVampireLanguage.g:603:1: entryRuleVLSUniversalQuantifier : ruleVLSUniversalQuantifier EOF ;
    public final void entryRuleVLSUniversalQuantifier() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:604:1: ( ruleVLSUniversalQuantifier EOF )
            // InternalVampireLanguage.g:605:1: ruleVLSUniversalQuantifier EOF
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
    // InternalVampireLanguage.g:612:1: ruleVLSUniversalQuantifier : ( ( rule__VLSUniversalQuantifier__Group__0 ) ) ;
    public final void ruleVLSUniversalQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:616:2: ( ( ( rule__VLSUniversalQuantifier__Group__0 ) ) )
            // InternalVampireLanguage.g:617:2: ( ( rule__VLSUniversalQuantifier__Group__0 ) )
            {
            // InternalVampireLanguage.g:617:2: ( ( rule__VLSUniversalQuantifier__Group__0 ) )
            // InternalVampireLanguage.g:618:3: ( rule__VLSUniversalQuantifier__Group__0 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup()); 
            // InternalVampireLanguage.g:619:3: ( rule__VLSUniversalQuantifier__Group__0 )
            // InternalVampireLanguage.g:619:4: rule__VLSUniversalQuantifier__Group__0
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
    // InternalVampireLanguage.g:628:1: entryRuleVLSExistentialQuantifier : ruleVLSExistentialQuantifier EOF ;
    public final void entryRuleVLSExistentialQuantifier() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:629:1: ( ruleVLSExistentialQuantifier EOF )
            // InternalVampireLanguage.g:630:1: ruleVLSExistentialQuantifier EOF
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
    // InternalVampireLanguage.g:637:1: ruleVLSExistentialQuantifier : ( ( rule__VLSExistentialQuantifier__Group__0 ) ) ;
    public final void ruleVLSExistentialQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:641:2: ( ( ( rule__VLSExistentialQuantifier__Group__0 ) ) )
            // InternalVampireLanguage.g:642:2: ( ( rule__VLSExistentialQuantifier__Group__0 ) )
            {
            // InternalVampireLanguage.g:642:2: ( ( rule__VLSExistentialQuantifier__Group__0 ) )
            // InternalVampireLanguage.g:643:3: ( rule__VLSExistentialQuantifier__Group__0 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup()); 
            // InternalVampireLanguage.g:644:3: ( rule__VLSExistentialQuantifier__Group__0 )
            // InternalVampireLanguage.g:644:4: rule__VLSExistentialQuantifier__Group__0
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
    // InternalVampireLanguage.g:653:1: entryRuleVLSUnaryNegation : ruleVLSUnaryNegation EOF ;
    public final void entryRuleVLSUnaryNegation() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:654:1: ( ruleVLSUnaryNegation EOF )
            // InternalVampireLanguage.g:655:1: ruleVLSUnaryNegation EOF
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
    // InternalVampireLanguage.g:662:1: ruleVLSUnaryNegation : ( ( rule__VLSUnaryNegation__Group__0 ) ) ;
    public final void ruleVLSUnaryNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:666:2: ( ( ( rule__VLSUnaryNegation__Group__0 ) ) )
            // InternalVampireLanguage.g:667:2: ( ( rule__VLSUnaryNegation__Group__0 ) )
            {
            // InternalVampireLanguage.g:667:2: ( ( rule__VLSUnaryNegation__Group__0 ) )
            // InternalVampireLanguage.g:668:3: ( rule__VLSUnaryNegation__Group__0 )
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getGroup()); 
            // InternalVampireLanguage.g:669:3: ( rule__VLSUnaryNegation__Group__0 )
            // InternalVampireLanguage.g:669:4: rule__VLSUnaryNegation__Group__0
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
    // InternalVampireLanguage.g:678:1: entryRuleVLSUnaryInfix : ruleVLSUnaryInfix EOF ;
    public final void entryRuleVLSUnaryInfix() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:679:1: ( ruleVLSUnaryInfix EOF )
            // InternalVampireLanguage.g:680:1: ruleVLSUnaryInfix EOF
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
    // InternalVampireLanguage.g:687:1: ruleVLSUnaryInfix : ( ( rule__VLSUnaryInfix__Group__0 ) ) ;
    public final void ruleVLSUnaryInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:691:2: ( ( ( rule__VLSUnaryInfix__Group__0 ) ) )
            // InternalVampireLanguage.g:692:2: ( ( rule__VLSUnaryInfix__Group__0 ) )
            {
            // InternalVampireLanguage.g:692:2: ( ( rule__VLSUnaryInfix__Group__0 ) )
            // InternalVampireLanguage.g:693:3: ( rule__VLSUnaryInfix__Group__0 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getGroup()); 
            // InternalVampireLanguage.g:694:3: ( rule__VLSUnaryInfix__Group__0 )
            // InternalVampireLanguage.g:694:4: rule__VLSUnaryInfix__Group__0
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
    // InternalVampireLanguage.g:703:1: entryRuleVLSAtomic : ruleVLSAtomic EOF ;
    public final void entryRuleVLSAtomic() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:704:1: ( ruleVLSAtomic EOF )
            // InternalVampireLanguage.g:705:1: ruleVLSAtomic EOF
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
    // InternalVampireLanguage.g:712:1: ruleVLSAtomic : ( ( rule__VLSAtomic__Alternatives ) ) ;
    public final void ruleVLSAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:716:2: ( ( ( rule__VLSAtomic__Alternatives ) ) )
            // InternalVampireLanguage.g:717:2: ( ( rule__VLSAtomic__Alternatives ) )
            {
            // InternalVampireLanguage.g:717:2: ( ( rule__VLSAtomic__Alternatives ) )
            // InternalVampireLanguage.g:718:3: ( rule__VLSAtomic__Alternatives )
            {
             before(grammarAccess.getVLSAtomicAccess().getAlternatives()); 
            // InternalVampireLanguage.g:719:3: ( rule__VLSAtomic__Alternatives )
            // InternalVampireLanguage.g:719:4: rule__VLSAtomic__Alternatives
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
    // InternalVampireLanguage.g:728:1: entryRuleVLSAtomicConstant : ruleVLSAtomicConstant EOF ;
    public final void entryRuleVLSAtomicConstant() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:729:1: ( ruleVLSAtomicConstant EOF )
            // InternalVampireLanguage.g:730:1: ruleVLSAtomicConstant EOF
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
    // InternalVampireLanguage.g:737:1: ruleVLSAtomicConstant : ( ( rule__VLSAtomicConstant__Alternatives ) ) ;
    public final void ruleVLSAtomicConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:741:2: ( ( ( rule__VLSAtomicConstant__Alternatives ) ) )
            // InternalVampireLanguage.g:742:2: ( ( rule__VLSAtomicConstant__Alternatives ) )
            {
            // InternalVampireLanguage.g:742:2: ( ( rule__VLSAtomicConstant__Alternatives ) )
            // InternalVampireLanguage.g:743:3: ( rule__VLSAtomicConstant__Alternatives )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getAlternatives()); 
            // InternalVampireLanguage.g:744:3: ( rule__VLSAtomicConstant__Alternatives )
            // InternalVampireLanguage.g:744:4: rule__VLSAtomicConstant__Alternatives
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
    // InternalVampireLanguage.g:753:1: entryRuleVLSAtomicFunction : ruleVLSAtomicFunction EOF ;
    public final void entryRuleVLSAtomicFunction() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:754:1: ( ruleVLSAtomicFunction EOF )
            // InternalVampireLanguage.g:755:1: ruleVLSAtomicFunction EOF
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
    // InternalVampireLanguage.g:762:1: ruleVLSAtomicFunction : ( ( rule__VLSAtomicFunction__Alternatives ) ) ;
    public final void ruleVLSAtomicFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:766:2: ( ( ( rule__VLSAtomicFunction__Alternatives ) ) )
            // InternalVampireLanguage.g:767:2: ( ( rule__VLSAtomicFunction__Alternatives ) )
            {
            // InternalVampireLanguage.g:767:2: ( ( rule__VLSAtomicFunction__Alternatives ) )
            // InternalVampireLanguage.g:768:3: ( rule__VLSAtomicFunction__Alternatives )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getAlternatives()); 
            // InternalVampireLanguage.g:769:3: ( rule__VLSAtomicFunction__Alternatives )
            // InternalVampireLanguage.g:769:4: rule__VLSAtomicFunction__Alternatives
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
    // InternalVampireLanguage.g:778:1: entryRuleVLSVariable : ruleVLSVariable EOF ;
    public final void entryRuleVLSVariable() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:779:1: ( ruleVLSVariable EOF )
            // InternalVampireLanguage.g:780:1: ruleVLSVariable EOF
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
    // InternalVampireLanguage.g:787:1: ruleVLSVariable : ( ( rule__VLSVariable__NameAssignment ) ) ;
    public final void ruleVLSVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:791:2: ( ( ( rule__VLSVariable__NameAssignment ) ) )
            // InternalVampireLanguage.g:792:2: ( ( rule__VLSVariable__NameAssignment ) )
            {
            // InternalVampireLanguage.g:792:2: ( ( rule__VLSVariable__NameAssignment ) )
            // InternalVampireLanguage.g:793:3: ( rule__VLSVariable__NameAssignment )
            {
             before(grammarAccess.getVLSVariableAccess().getNameAssignment()); 
            // InternalVampireLanguage.g:794:3: ( rule__VLSVariable__NameAssignment )
            // InternalVampireLanguage.g:794:4: rule__VLSVariable__NameAssignment
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


    // $ANTLR start "entryRuleVLSFunctionAsTerm"
    // InternalVampireLanguage.g:828:1: entryRuleVLSFunctionAsTerm : ruleVLSFunctionAsTerm EOF ;
    public final void entryRuleVLSFunctionAsTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:829:1: ( ruleVLSFunctionAsTerm EOF )
            // InternalVampireLanguage.g:830:1: ruleVLSFunctionAsTerm EOF
            {
             before(grammarAccess.getVLSFunctionAsTermRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSFunctionAsTerm();

            state._fsp--;

             after(grammarAccess.getVLSFunctionAsTermRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSFunctionAsTerm"


    // $ANTLR start "ruleVLSFunctionAsTerm"
    // InternalVampireLanguage.g:837:1: ruleVLSFunctionAsTerm : ( ( rule__VLSFunctionAsTerm__Group__0 ) ) ;
    public final void ruleVLSFunctionAsTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:841:2: ( ( ( rule__VLSFunctionAsTerm__Group__0 ) ) )
            // InternalVampireLanguage.g:842:2: ( ( rule__VLSFunctionAsTerm__Group__0 ) )
            {
            // InternalVampireLanguage.g:842:2: ( ( rule__VLSFunctionAsTerm__Group__0 ) )
            // InternalVampireLanguage.g:843:3: ( rule__VLSFunctionAsTerm__Group__0 )
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getGroup()); 
            // InternalVampireLanguage.g:844:3: ( rule__VLSFunctionAsTerm__Group__0 )
            // InternalVampireLanguage.g:844:4: rule__VLSFunctionAsTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionAsTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSFunctionAsTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSFunctionAsTerm"


    // $ANTLR start "entryRuleVLSDefinedTerm"
    // InternalVampireLanguage.g:853:1: entryRuleVLSDefinedTerm : ruleVLSDefinedTerm EOF ;
    public final void entryRuleVLSDefinedTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:854:1: ( ruleVLSDefinedTerm EOF )
            // InternalVampireLanguage.g:855:1: ruleVLSDefinedTerm EOF
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
    // InternalVampireLanguage.g:862:1: ruleVLSDefinedTerm : ( ( rule__VLSDefinedTerm__Alternatives ) ) ;
    public final void ruleVLSDefinedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:866:2: ( ( ( rule__VLSDefinedTerm__Alternatives ) ) )
            // InternalVampireLanguage.g:867:2: ( ( rule__VLSDefinedTerm__Alternatives ) )
            {
            // InternalVampireLanguage.g:867:2: ( ( rule__VLSDefinedTerm__Alternatives ) )
            // InternalVampireLanguage.g:868:3: ( rule__VLSDefinedTerm__Alternatives )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getAlternatives()); 
            // InternalVampireLanguage.g:869:3: ( rule__VLSDefinedTerm__Alternatives )
            // InternalVampireLanguage.g:869:4: rule__VLSDefinedTerm__Alternatives
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
    // InternalVampireLanguage.g:877:1: rule__VampireModel__Alternatives : ( ( ( rule__VampireModel__CommentsAssignment_0 ) ) | ( ( rule__VampireModel__ConfirmationsAssignment_1 ) ) | ( ( rule__VampireModel__FormulasAssignment_2 ) ) | ( ( rule__VampireModel__TfformulasAssignment_3 ) ) );
    public final void rule__VampireModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:881:1: ( ( ( rule__VampireModel__CommentsAssignment_0 ) ) | ( ( rule__VampireModel__ConfirmationsAssignment_1 ) ) | ( ( rule__VampireModel__FormulasAssignment_2 ) ) | ( ( rule__VampireModel__TfformulasAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_SINGLE_COMMENT:
                {
                alt2=1;
                }
                break;
            case 39:
            case 40:
            case 48:
            case 51:
                {
                alt2=2;
                }
                break;
            case 54:
                {
                alt2=3;
                }
                break;
            case 59:
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
                    // InternalVampireLanguage.g:882:2: ( ( rule__VampireModel__CommentsAssignment_0 ) )
                    {
                    // InternalVampireLanguage.g:882:2: ( ( rule__VampireModel__CommentsAssignment_0 ) )
                    // InternalVampireLanguage.g:883:3: ( rule__VampireModel__CommentsAssignment_0 )
                    {
                     before(grammarAccess.getVampireModelAccess().getCommentsAssignment_0()); 
                    // InternalVampireLanguage.g:884:3: ( rule__VampireModel__CommentsAssignment_0 )
                    // InternalVampireLanguage.g:884:4: rule__VampireModel__CommentsAssignment_0
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
                    // InternalVampireLanguage.g:888:2: ( ( rule__VampireModel__ConfirmationsAssignment_1 ) )
                    {
                    // InternalVampireLanguage.g:888:2: ( ( rule__VampireModel__ConfirmationsAssignment_1 ) )
                    // InternalVampireLanguage.g:889:3: ( rule__VampireModel__ConfirmationsAssignment_1 )
                    {
                     before(grammarAccess.getVampireModelAccess().getConfirmationsAssignment_1()); 
                    // InternalVampireLanguage.g:890:3: ( rule__VampireModel__ConfirmationsAssignment_1 )
                    // InternalVampireLanguage.g:890:4: rule__VampireModel__ConfirmationsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VampireModel__ConfirmationsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVampireModelAccess().getConfirmationsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:894:2: ( ( rule__VampireModel__FormulasAssignment_2 ) )
                    {
                    // InternalVampireLanguage.g:894:2: ( ( rule__VampireModel__FormulasAssignment_2 ) )
                    // InternalVampireLanguage.g:895:3: ( rule__VampireModel__FormulasAssignment_2 )
                    {
                     before(grammarAccess.getVampireModelAccess().getFormulasAssignment_2()); 
                    // InternalVampireLanguage.g:896:3: ( rule__VampireModel__FormulasAssignment_2 )
                    // InternalVampireLanguage.g:896:4: rule__VampireModel__FormulasAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__VampireModel__FormulasAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getVampireModelAccess().getFormulasAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:900:2: ( ( rule__VampireModel__TfformulasAssignment_3 ) )
                    {
                    // InternalVampireLanguage.g:900:2: ( ( rule__VampireModel__TfformulasAssignment_3 ) )
                    // InternalVampireLanguage.g:901:3: ( rule__VampireModel__TfformulasAssignment_3 )
                    {
                     before(grammarAccess.getVampireModelAccess().getTfformulasAssignment_3()); 
                    // InternalVampireLanguage.g:902:3: ( rule__VampireModel__TfformulasAssignment_3 )
                    // InternalVampireLanguage.g:902:4: rule__VampireModel__TfformulasAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__VampireModel__TfformulasAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getVampireModelAccess().getTfformulasAssignment_3()); 

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


    // $ANTLR start "rule__VLSConfirmations__Alternatives"
    // InternalVampireLanguage.g:910:1: rule__VLSConfirmations__Alternatives : ( ( ( rule__VLSConfirmations__Group_0__0 ) ) | ( ( rule__VLSConfirmations__Group_1__0 ) ) | ( ( rule__VLSConfirmations__Group_2__0 ) ) | ( ( rule__VLSConfirmations__Group_3__0 ) ) );
    public final void rule__VLSConfirmations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:914:1: ( ( ( rule__VLSConfirmations__Group_0__0 ) ) | ( ( rule__VLSConfirmations__Group_1__0 ) ) | ( ( rule__VLSConfirmations__Group_2__0 ) ) | ( ( rule__VLSConfirmations__Group_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt3=1;
                }
                break;
            case 40:
                {
                alt3=2;
                }
                break;
            case 48:
                {
                alt3=3;
                }
                break;
            case 51:
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
                    // InternalVampireLanguage.g:915:2: ( ( rule__VLSConfirmations__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:915:2: ( ( rule__VLSConfirmations__Group_0__0 ) )
                    // InternalVampireLanguage.g:916:3: ( rule__VLSConfirmations__Group_0__0 )
                    {
                     before(grammarAccess.getVLSConfirmationsAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:917:3: ( rule__VLSConfirmations__Group_0__0 )
                    // InternalVampireLanguage.g:917:4: rule__VLSConfirmations__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSConfirmations__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSConfirmationsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:921:2: ( ( rule__VLSConfirmations__Group_1__0 ) )
                    {
                    // InternalVampireLanguage.g:921:2: ( ( rule__VLSConfirmations__Group_1__0 ) )
                    // InternalVampireLanguage.g:922:3: ( rule__VLSConfirmations__Group_1__0 )
                    {
                     before(grammarAccess.getVLSConfirmationsAccess().getGroup_1()); 
                    // InternalVampireLanguage.g:923:3: ( rule__VLSConfirmations__Group_1__0 )
                    // InternalVampireLanguage.g:923:4: rule__VLSConfirmations__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSConfirmations__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSConfirmationsAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:927:2: ( ( rule__VLSConfirmations__Group_2__0 ) )
                    {
                    // InternalVampireLanguage.g:927:2: ( ( rule__VLSConfirmations__Group_2__0 ) )
                    // InternalVampireLanguage.g:928:3: ( rule__VLSConfirmations__Group_2__0 )
                    {
                     before(grammarAccess.getVLSConfirmationsAccess().getGroup_2()); 
                    // InternalVampireLanguage.g:929:3: ( rule__VLSConfirmations__Group_2__0 )
                    // InternalVampireLanguage.g:929:4: rule__VLSConfirmations__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSConfirmations__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSConfirmationsAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:933:2: ( ( rule__VLSConfirmations__Group_3__0 ) )
                    {
                    // InternalVampireLanguage.g:933:2: ( ( rule__VLSConfirmations__Group_3__0 ) )
                    // InternalVampireLanguage.g:934:3: ( rule__VLSConfirmations__Group_3__0 )
                    {
                     before(grammarAccess.getVLSConfirmationsAccess().getGroup_3()); 
                    // InternalVampireLanguage.g:935:3: ( rule__VLSConfirmations__Group_3__0 )
                    // InternalVampireLanguage.g:935:4: rule__VLSConfirmations__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSConfirmations__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSConfirmationsAccess().getGroup_3()); 

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
    // $ANTLR end "rule__VLSConfirmations__Alternatives"


    // $ANTLR start "rule__VLSFofFormula__NameAlternatives_2_0"
    // InternalVampireLanguage.g:943:1: rule__VLSFofFormula__NameAlternatives_2_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SIGNED_LITERAL ) | ( RULE_SINGLE_QUOTE ) );
    public final void rule__VLSFofFormula__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:947:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SIGNED_LITERAL ) | ( RULE_SINGLE_QUOTE ) )
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
                    // InternalVampireLanguage.g:948:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:948:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:949:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSFofFormulaAccess().getNameLOWER_WORD_IDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFofFormulaAccess().getNameLOWER_WORD_IDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:954:2: ( RULE_SIGNED_LITERAL )
                    {
                    // InternalVampireLanguage.g:954:2: ( RULE_SIGNED_LITERAL )
                    // InternalVampireLanguage.g:955:3: RULE_SIGNED_LITERAL
                    {
                     before(grammarAccess.getVLSFofFormulaAccess().getNameSIGNED_LITERALTerminalRuleCall_2_0_1()); 
                    match(input,RULE_SIGNED_LITERAL,FOLLOW_2); 
                     after(grammarAccess.getVLSFofFormulaAccess().getNameSIGNED_LITERALTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:960:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:960:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:961:3: RULE_SINGLE_QUOTE
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


    // $ANTLR start "rule__VLSTffName__Alternatives"
    // InternalVampireLanguage.g:970:1: rule__VLSTffName__Alternatives : ( ( ruleVLSTffDeclPred ) | ( ruleVLSTffFinite ) | ( ruleVLSTffDistinct ) );
    public final void rule__VLSTffName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:974:1: ( ( ruleVLSTffDeclPred ) | ( ruleVLSTffFinite ) | ( ruleVLSTffDistinct ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
            case 60:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 22:
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
                    // InternalVampireLanguage.g:975:2: ( ruleVLSTffDeclPred )
                    {
                    // InternalVampireLanguage.g:975:2: ( ruleVLSTffDeclPred )
                    // InternalVampireLanguage.g:976:3: ruleVLSTffDeclPred
                    {
                     before(grammarAccess.getVLSTffNameAccess().getVLSTffDeclPredParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSTffDeclPred();

                    state._fsp--;

                     after(grammarAccess.getVLSTffNameAccess().getVLSTffDeclPredParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:981:2: ( ruleVLSTffFinite )
                    {
                    // InternalVampireLanguage.g:981:2: ( ruleVLSTffFinite )
                    // InternalVampireLanguage.g:982:3: ruleVLSTffFinite
                    {
                     before(grammarAccess.getVLSTffNameAccess().getVLSTffFiniteParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSTffFinite();

                    state._fsp--;

                     after(grammarAccess.getVLSTffNameAccess().getVLSTffFiniteParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:987:2: ( ruleVLSTffDistinct )
                    {
                    // InternalVampireLanguage.g:987:2: ( ruleVLSTffDistinct )
                    // InternalVampireLanguage.g:988:3: ruleVLSTffDistinct
                    {
                     before(grammarAccess.getVLSTffNameAccess().getVLSTffDistinctParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSTffDistinct();

                    state._fsp--;

                     after(grammarAccess.getVLSTffNameAccess().getVLSTffDistinctParserRuleCall_2()); 

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
    // $ANTLR end "rule__VLSTffName__Alternatives"


    // $ANTLR start "rule__VLSTffDeclPred__Alternatives"
    // InternalVampireLanguage.g:997:1: rule__VLSTffDeclPred__Alternatives : ( ( ( rule__VLSTffDeclPred__Group_0__0 ) ) | ( RULE_LOWER_WORD_ID ) );
    public final void rule__VLSTffDeclPred__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1001:1: ( ( ( rule__VLSTffDeclPred__Group_0__0 ) ) | ( RULE_LOWER_WORD_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==60) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_LOWER_WORD_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalVampireLanguage.g:1002:2: ( ( rule__VLSTffDeclPred__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1002:2: ( ( rule__VLSTffDeclPred__Group_0__0 ) )
                    // InternalVampireLanguage.g:1003:3: ( rule__VLSTffDeclPred__Group_0__0 )
                    {
                     before(grammarAccess.getVLSTffDeclPredAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:1004:3: ( rule__VLSTffDeclPred__Group_0__0 )
                    // InternalVampireLanguage.g:1004:4: rule__VLSTffDeclPred__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSTffDeclPred__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSTffDeclPredAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1008:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1008:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1009:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSTffDeclPredAccess().getLOWER_WORD_IDTerminalRuleCall_1()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSTffDeclPredAccess().getLOWER_WORD_IDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__VLSTffDeclPred__Alternatives"


    // $ANTLR start "rule__VLSRole__Alternatives"
    // InternalVampireLanguage.g:1018:1: rule__VLSRole__Alternatives : ( ( 'axiom' ) | ( 'conjecture' ) | ( 'hypothesis' ) | ( 'definition' ) | ( 'assumption' ) | ( 'lemma' ) | ( 'theorem' ) | ( 'corollary' ) | ( 'negated_conjecture' ) | ( 'plain' ) | ( 'type' ) | ( 'fi_domain' ) | ( 'fi_functors' ) | ( 'fi_predicates' ) | ( 'unknown' ) );
    public final void rule__VLSRole__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1022:1: ( ( 'axiom' ) | ( 'conjecture' ) | ( 'hypothesis' ) | ( 'definition' ) | ( 'assumption' ) | ( 'lemma' ) | ( 'theorem' ) | ( 'corollary' ) | ( 'negated_conjecture' ) | ( 'plain' ) | ( 'type' ) | ( 'fi_domain' ) | ( 'fi_functors' ) | ( 'fi_predicates' ) | ( 'unknown' ) )
            int alt7=15;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            case 28:
                {
                alt7=5;
                }
                break;
            case 29:
                {
                alt7=6;
                }
                break;
            case 30:
                {
                alt7=7;
                }
                break;
            case 31:
                {
                alt7=8;
                }
                break;
            case 32:
                {
                alt7=9;
                }
                break;
            case 33:
                {
                alt7=10;
                }
                break;
            case 34:
                {
                alt7=11;
                }
                break;
            case 35:
                {
                alt7=12;
                }
                break;
            case 36:
                {
                alt7=13;
                }
                break;
            case 37:
                {
                alt7=14;
                }
                break;
            case 38:
                {
                alt7=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalVampireLanguage.g:1023:2: ( 'axiom' )
                    {
                    // InternalVampireLanguage.g:1023:2: ( 'axiom' )
                    // InternalVampireLanguage.g:1024:3: 'axiom'
                    {
                     before(grammarAccess.getVLSRoleAccess().getAxiomKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getAxiomKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1029:2: ( 'conjecture' )
                    {
                    // InternalVampireLanguage.g:1029:2: ( 'conjecture' )
                    // InternalVampireLanguage.g:1030:3: 'conjecture'
                    {
                     before(grammarAccess.getVLSRoleAccess().getConjectureKeyword_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getConjectureKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1035:2: ( 'hypothesis' )
                    {
                    // InternalVampireLanguage.g:1035:2: ( 'hypothesis' )
                    // InternalVampireLanguage.g:1036:3: 'hypothesis'
                    {
                     before(grammarAccess.getVLSRoleAccess().getHypothesisKeyword_2()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getHypothesisKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1041:2: ( 'definition' )
                    {
                    // InternalVampireLanguage.g:1041:2: ( 'definition' )
                    // InternalVampireLanguage.g:1042:3: 'definition'
                    {
                     before(grammarAccess.getVLSRoleAccess().getDefinitionKeyword_3()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getDefinitionKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:1047:2: ( 'assumption' )
                    {
                    // InternalVampireLanguage.g:1047:2: ( 'assumption' )
                    // InternalVampireLanguage.g:1048:3: 'assumption'
                    {
                     before(grammarAccess.getVLSRoleAccess().getAssumptionKeyword_4()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getAssumptionKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalVampireLanguage.g:1053:2: ( 'lemma' )
                    {
                    // InternalVampireLanguage.g:1053:2: ( 'lemma' )
                    // InternalVampireLanguage.g:1054:3: 'lemma'
                    {
                     before(grammarAccess.getVLSRoleAccess().getLemmaKeyword_5()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getLemmaKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalVampireLanguage.g:1059:2: ( 'theorem' )
                    {
                    // InternalVampireLanguage.g:1059:2: ( 'theorem' )
                    // InternalVampireLanguage.g:1060:3: 'theorem'
                    {
                     before(grammarAccess.getVLSRoleAccess().getTheoremKeyword_6()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getTheoremKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalVampireLanguage.g:1065:2: ( 'corollary' )
                    {
                    // InternalVampireLanguage.g:1065:2: ( 'corollary' )
                    // InternalVampireLanguage.g:1066:3: 'corollary'
                    {
                     before(grammarAccess.getVLSRoleAccess().getCorollaryKeyword_7()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getCorollaryKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalVampireLanguage.g:1071:2: ( 'negated_conjecture' )
                    {
                    // InternalVampireLanguage.g:1071:2: ( 'negated_conjecture' )
                    // InternalVampireLanguage.g:1072:3: 'negated_conjecture'
                    {
                     before(grammarAccess.getVLSRoleAccess().getNegated_conjectureKeyword_8()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getNegated_conjectureKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalVampireLanguage.g:1077:2: ( 'plain' )
                    {
                    // InternalVampireLanguage.g:1077:2: ( 'plain' )
                    // InternalVampireLanguage.g:1078:3: 'plain'
                    {
                     before(grammarAccess.getVLSRoleAccess().getPlainKeyword_9()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getPlainKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalVampireLanguage.g:1083:2: ( 'type' )
                    {
                    // InternalVampireLanguage.g:1083:2: ( 'type' )
                    // InternalVampireLanguage.g:1084:3: 'type'
                    {
                     before(grammarAccess.getVLSRoleAccess().getTypeKeyword_10()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getTypeKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalVampireLanguage.g:1089:2: ( 'fi_domain' )
                    {
                    // InternalVampireLanguage.g:1089:2: ( 'fi_domain' )
                    // InternalVampireLanguage.g:1090:3: 'fi_domain'
                    {
                     before(grammarAccess.getVLSRoleAccess().getFi_domainKeyword_11()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getFi_domainKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalVampireLanguage.g:1095:2: ( 'fi_functors' )
                    {
                    // InternalVampireLanguage.g:1095:2: ( 'fi_functors' )
                    // InternalVampireLanguage.g:1096:3: 'fi_functors'
                    {
                     before(grammarAccess.getVLSRoleAccess().getFi_functorsKeyword_12()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getFi_functorsKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalVampireLanguage.g:1101:2: ( 'fi_predicates' )
                    {
                    // InternalVampireLanguage.g:1101:2: ( 'fi_predicates' )
                    // InternalVampireLanguage.g:1102:3: 'fi_predicates'
                    {
                     before(grammarAccess.getVLSRoleAccess().getFi_predicatesKeyword_13()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getFi_predicatesKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalVampireLanguage.g:1107:2: ( 'unknown' )
                    {
                    // InternalVampireLanguage.g:1107:2: ( 'unknown' )
                    // InternalVampireLanguage.g:1108:3: 'unknown'
                    {
                     before(grammarAccess.getVLSRoleAccess().getUnknownKeyword_14()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getUnknownKeyword_14()); 

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
    // InternalVampireLanguage.g:1117:1: rule__VLSAnnotation__NameAlternatives_1_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( ruleVLSRole ) );
    public final void rule__VLSAnnotation__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1121:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( ruleVLSRole ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt8=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt8=2;
                }
                break;
            case 24:
            case 25:
            case 26:
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
                    // InternalVampireLanguage.g:1122:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1122:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1123:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSAnnotationAccess().getNameLOWER_WORD_IDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAnnotationAccess().getNameLOWER_WORD_IDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1128:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1128:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1129:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSAnnotationAccess().getNameSINGLE_QUOTETerminalRuleCall_1_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSAnnotationAccess().getNameSINGLE_QUOTETerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1134:2: ( ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:1134:2: ( ruleVLSRole )
                    // InternalVampireLanguage.g:1135:3: ruleVLSRole
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


    // $ANTLR start "rule__VLSTffTerm__Alternatives"
    // InternalVampireLanguage.g:1144:1: rule__VLSTffTerm__Alternatives : ( ( ruleVLSTerm ) | ( ruleVLSDeclaration ) | ( ruleVLSCommentTerm ) );
    public final void rule__VLSTffTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1148:1: ( ( ruleVLSTerm ) | ( ruleVLSDeclaration ) | ( ruleVLSCommentTerm ) )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalVampireLanguage.g:1149:2: ( ruleVLSTerm )
                    {
                    // InternalVampireLanguage.g:1149:2: ( ruleVLSTerm )
                    // InternalVampireLanguage.g:1150:3: ruleVLSTerm
                    {
                     before(grammarAccess.getVLSTffTermAccess().getVLSTermParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSTerm();

                    state._fsp--;

                     after(grammarAccess.getVLSTffTermAccess().getVLSTermParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1155:2: ( ruleVLSDeclaration )
                    {
                    // InternalVampireLanguage.g:1155:2: ( ruleVLSDeclaration )
                    // InternalVampireLanguage.g:1156:3: ruleVLSDeclaration
                    {
                     before(grammarAccess.getVLSTffTermAccess().getVLSDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVLSTffTermAccess().getVLSDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1161:2: ( ruleVLSCommentTerm )
                    {
                    // InternalVampireLanguage.g:1161:2: ( ruleVLSCommentTerm )
                    // InternalVampireLanguage.g:1162:3: ruleVLSCommentTerm
                    {
                     before(grammarAccess.getVLSTffTermAccess().getVLSCommentTermParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSCommentTerm();

                    state._fsp--;

                     after(grammarAccess.getVLSTffTermAccess().getVLSCommentTermParserRuleCall_2()); 

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
    // $ANTLR end "rule__VLSTffTerm__Alternatives"


    // $ANTLR start "rule__VLSDeclaration__Alternatives"
    // InternalVampireLanguage.g:1171:1: rule__VLSDeclaration__Alternatives : ( ( ruleVLSVariableDeclaration ) | ( ruleVLSOtherDeclaration ) );
    public final void rule__VLSDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1175:1: ( ( ruleVLSVariableDeclaration ) | ( ruleVLSOtherDeclaration ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_UPPER_WORD_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_LOWER_WORD_ID||(LA10_0>=RULE_SINGLE_QUOTE && LA10_0<=RULE_DOUBLE_DOLLAR_ID)||(LA10_0>=24 && LA10_0<=38)||(LA10_0>=78 && LA10_0<=79)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalVampireLanguage.g:1176:2: ( ruleVLSVariableDeclaration )
                    {
                    // InternalVampireLanguage.g:1176:2: ( ruleVLSVariableDeclaration )
                    // InternalVampireLanguage.g:1177:3: ruleVLSVariableDeclaration
                    {
                     before(grammarAccess.getVLSDeclarationAccess().getVLSVariableDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVLSDeclarationAccess().getVLSVariableDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1182:2: ( ruleVLSOtherDeclaration )
                    {
                    // InternalVampireLanguage.g:1182:2: ( ruleVLSOtherDeclaration )
                    // InternalVampireLanguage.g:1183:3: ruleVLSOtherDeclaration
                    {
                     before(grammarAccess.getVLSDeclarationAccess().getVLSOtherDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSOtherDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVLSDeclarationAccess().getVLSOtherDeclarationParserRuleCall_1()); 

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
    // $ANTLR end "rule__VLSDeclaration__Alternatives"


    // $ANTLR start "rule__VLSBinary__Alternatives_1"
    // InternalVampireLanguage.g:1192:1: rule__VLSBinary__Alternatives_1 : ( ( ( rule__VLSBinary__Group_1_0__0 ) ) | ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) ) | ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) ) );
    public final void rule__VLSBinary__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1196:1: ( ( ( rule__VLSBinary__Group_1_0__0 ) ) | ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) ) | ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                {
                alt13=1;
                }
                break;
            case 70:
                {
                alt13=2;
                }
                break;
            case 71:
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
                    // InternalVampireLanguage.g:1197:2: ( ( rule__VLSBinary__Group_1_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1197:2: ( ( rule__VLSBinary__Group_1_0__0 ) )
                    // InternalVampireLanguage.g:1198:3: ( rule__VLSBinary__Group_1_0__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0()); 
                    // InternalVampireLanguage.g:1199:3: ( rule__VLSBinary__Group_1_0__0 )
                    // InternalVampireLanguage.g:1199:4: rule__VLSBinary__Group_1_0__0
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
                    // InternalVampireLanguage.g:1203:2: ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) )
                    {
                    // InternalVampireLanguage.g:1203:2: ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) )
                    // InternalVampireLanguage.g:1204:3: ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* )
                    {
                    // InternalVampireLanguage.g:1204:3: ( ( rule__VLSBinary__Group_1_1__0 ) )
                    // InternalVampireLanguage.g:1205:4: ( rule__VLSBinary__Group_1_1__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 
                    // InternalVampireLanguage.g:1206:4: ( rule__VLSBinary__Group_1_1__0 )
                    // InternalVampireLanguage.g:1206:5: rule__VLSBinary__Group_1_1__0
                    {
                    pushFollow(FOLLOW_4);
                    rule__VLSBinary__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 

                    }

                    // InternalVampireLanguage.g:1209:3: ( ( rule__VLSBinary__Group_1_1__0 )* )
                    // InternalVampireLanguage.g:1210:4: ( rule__VLSBinary__Group_1_1__0 )*
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 
                    // InternalVampireLanguage.g:1211:4: ( rule__VLSBinary__Group_1_1__0 )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==70) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1211:5: rule__VLSBinary__Group_1_1__0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__VLSBinary__Group_1_1__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1216:2: ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) )
                    {
                    // InternalVampireLanguage.g:1216:2: ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) )
                    // InternalVampireLanguage.g:1217:3: ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* )
                    {
                    // InternalVampireLanguage.g:1217:3: ( ( rule__VLSBinary__Group_1_2__0 ) )
                    // InternalVampireLanguage.g:1218:4: ( rule__VLSBinary__Group_1_2__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 
                    // InternalVampireLanguage.g:1219:4: ( rule__VLSBinary__Group_1_2__0 )
                    // InternalVampireLanguage.g:1219:5: rule__VLSBinary__Group_1_2__0
                    {
                    pushFollow(FOLLOW_5);
                    rule__VLSBinary__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 

                    }

                    // InternalVampireLanguage.g:1222:3: ( ( rule__VLSBinary__Group_1_2__0 )* )
                    // InternalVampireLanguage.g:1223:4: ( rule__VLSBinary__Group_1_2__0 )*
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 
                    // InternalVampireLanguage.g:1224:4: ( rule__VLSBinary__Group_1_2__0 )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==71) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1224:5: rule__VLSBinary__Group_1_2__0
                    	    {
                    	    pushFollow(FOLLOW_5);
                    	    rule__VLSBinary__Group_1_2__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
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
    // InternalVampireLanguage.g:1233:1: rule__VLSBinary__Alternatives_1_0_0 : ( ( ( rule__VLSBinary__Group_1_0_0_0__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_1__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_2__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_3__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_4__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_5__0 ) ) );
    public final void rule__VLSBinary__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1237:1: ( ( ( rule__VLSBinary__Group_1_0_0_0__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_1__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_2__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_3__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_4__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_5__0 ) ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt14=1;
                }
                break;
            case 65:
                {
                alt14=2;
                }
                break;
            case 66:
                {
                alt14=3;
                }
                break;
            case 67:
                {
                alt14=4;
                }
                break;
            case 68:
                {
                alt14=5;
                }
                break;
            case 69:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalVampireLanguage.g:1238:2: ( ( rule__VLSBinary__Group_1_0_0_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1238:2: ( ( rule__VLSBinary__Group_1_0_0_0__0 ) )
                    // InternalVampireLanguage.g:1239:3: ( rule__VLSBinary__Group_1_0_0_0__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_0()); 
                    // InternalVampireLanguage.g:1240:3: ( rule__VLSBinary__Group_1_0_0_0__0 )
                    // InternalVampireLanguage.g:1240:4: rule__VLSBinary__Group_1_0_0_0__0
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
                    // InternalVampireLanguage.g:1244:2: ( ( rule__VLSBinary__Group_1_0_0_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1244:2: ( ( rule__VLSBinary__Group_1_0_0_1__0 ) )
                    // InternalVampireLanguage.g:1245:3: ( rule__VLSBinary__Group_1_0_0_1__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_1()); 
                    // InternalVampireLanguage.g:1246:3: ( rule__VLSBinary__Group_1_0_0_1__0 )
                    // InternalVampireLanguage.g:1246:4: rule__VLSBinary__Group_1_0_0_1__0
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
                    // InternalVampireLanguage.g:1250:2: ( ( rule__VLSBinary__Group_1_0_0_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1250:2: ( ( rule__VLSBinary__Group_1_0_0_2__0 ) )
                    // InternalVampireLanguage.g:1251:3: ( rule__VLSBinary__Group_1_0_0_2__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_2()); 
                    // InternalVampireLanguage.g:1252:3: ( rule__VLSBinary__Group_1_0_0_2__0 )
                    // InternalVampireLanguage.g:1252:4: rule__VLSBinary__Group_1_0_0_2__0
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
                    // InternalVampireLanguage.g:1256:2: ( ( rule__VLSBinary__Group_1_0_0_3__0 ) )
                    {
                    // InternalVampireLanguage.g:1256:2: ( ( rule__VLSBinary__Group_1_0_0_3__0 ) )
                    // InternalVampireLanguage.g:1257:3: ( rule__VLSBinary__Group_1_0_0_3__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_3()); 
                    // InternalVampireLanguage.g:1258:3: ( rule__VLSBinary__Group_1_0_0_3__0 )
                    // InternalVampireLanguage.g:1258:4: rule__VLSBinary__Group_1_0_0_3__0
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
                    // InternalVampireLanguage.g:1262:2: ( ( rule__VLSBinary__Group_1_0_0_4__0 ) )
                    {
                    // InternalVampireLanguage.g:1262:2: ( ( rule__VLSBinary__Group_1_0_0_4__0 ) )
                    // InternalVampireLanguage.g:1263:3: ( rule__VLSBinary__Group_1_0_0_4__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_4()); 
                    // InternalVampireLanguage.g:1264:3: ( rule__VLSBinary__Group_1_0_0_4__0 )
                    // InternalVampireLanguage.g:1264:4: rule__VLSBinary__Group_1_0_0_4__0
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
                    // InternalVampireLanguage.g:1268:2: ( ( rule__VLSBinary__Group_1_0_0_5__0 ) )
                    {
                    // InternalVampireLanguage.g:1268:2: ( ( rule__VLSBinary__Group_1_0_0_5__0 ) )
                    // InternalVampireLanguage.g:1269:3: ( rule__VLSBinary__Group_1_0_0_5__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_5()); 
                    // InternalVampireLanguage.g:1270:3: ( rule__VLSBinary__Group_1_0_0_5__0 )
                    // InternalVampireLanguage.g:1270:4: rule__VLSBinary__Group_1_0_0_5__0
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
    // InternalVampireLanguage.g:1278:1: rule__VLSUnitaryFormula__Alternatives : ( ( ruleVLSUniversalQuantifier ) | ( ruleVLSExistentialQuantifier ) | ( ruleVLSUnaryNegation ) | ( ruleVLSUnaryInfix ) | ( ( rule__VLSUnitaryFormula__Group_4__0 ) ) );
    public final void rule__VLSUnitaryFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1282:1: ( ( ruleVLSUniversalQuantifier ) | ( ruleVLSExistentialQuantifier ) | ( ruleVLSUnaryNegation ) | ( ruleVLSUnaryInfix ) | ( ( rule__VLSUnitaryFormula__Group_4__0 ) ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt15=1;
                }
                break;
            case 73:
                {
                alt15=2;
                }
                break;
            case 74:
                {
                alt15=3;
                }
                break;
            case RULE_LOWER_WORD_ID:
            case RULE_SIGNED_LITERAL:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
            case RULE_UPPER_WORD_ID:
            case RULE_DOUBLE_QUOTE:
            case 24:
            case 25:
            case 26:
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
            case 78:
            case 79:
            case 80:
                {
                alt15=4;
                }
                break;
            case 55:
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
                    // InternalVampireLanguage.g:1283:2: ( ruleVLSUniversalQuantifier )
                    {
                    // InternalVampireLanguage.g:1283:2: ( ruleVLSUniversalQuantifier )
                    // InternalVampireLanguage.g:1284:3: ruleVLSUniversalQuantifier
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
                    // InternalVampireLanguage.g:1289:2: ( ruleVLSExistentialQuantifier )
                    {
                    // InternalVampireLanguage.g:1289:2: ( ruleVLSExistentialQuantifier )
                    // InternalVampireLanguage.g:1290:3: ruleVLSExistentialQuantifier
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
                    // InternalVampireLanguage.g:1295:2: ( ruleVLSUnaryNegation )
                    {
                    // InternalVampireLanguage.g:1295:2: ( ruleVLSUnaryNegation )
                    // InternalVampireLanguage.g:1296:3: ruleVLSUnaryNegation
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
                    // InternalVampireLanguage.g:1301:2: ( ruleVLSUnaryInfix )
                    {
                    // InternalVampireLanguage.g:1301:2: ( ruleVLSUnaryInfix )
                    // InternalVampireLanguage.g:1302:3: ruleVLSUnaryInfix
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
                    // InternalVampireLanguage.g:1307:2: ( ( rule__VLSUnitaryFormula__Group_4__0 ) )
                    {
                    // InternalVampireLanguage.g:1307:2: ( ( rule__VLSUnitaryFormula__Group_4__0 ) )
                    // InternalVampireLanguage.g:1308:3: ( rule__VLSUnitaryFormula__Group_4__0 )
                    {
                     before(grammarAccess.getVLSUnitaryFormulaAccess().getGroup_4()); 
                    // InternalVampireLanguage.g:1309:3: ( rule__VLSUnitaryFormula__Group_4__0 )
                    // InternalVampireLanguage.g:1309:4: rule__VLSUnitaryFormula__Group_4__0
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


    // $ANTLR start "rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0"
    // InternalVampireLanguage.g:1317:1: rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0 : ( ( ruleVLSVariable ) | ( ruleVLSVariableDeclaration ) );
    public final void rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1321:1: ( ( ruleVLSVariable ) | ( ruleVLSVariableDeclaration ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_UPPER_WORD_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==61) ) {
                    alt16=2;
                }
                else if ( (LA16_1==50||LA16_1==56) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalVampireLanguage.g:1322:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1322:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1323:3: ruleVLSVariable
                    {
                     before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSVariable();

                    state._fsp--;

                     after(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1328:2: ( ruleVLSVariableDeclaration )
                    {
                    // InternalVampireLanguage.g:1328:2: ( ruleVLSVariableDeclaration )
                    // InternalVampireLanguage.g:1329:3: ruleVLSVariableDeclaration
                    {
                     before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableDeclarationParserRuleCall_1_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableDeclarationParserRuleCall_1_2_0_1()); 

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
    // $ANTLR end "rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0"


    // $ANTLR start "rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0"
    // InternalVampireLanguage.g:1338:1: rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0 : ( ( ruleVLSVariable ) | ( ruleVLSVariableDeclaration ) );
    public final void rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1342:1: ( ( ruleVLSVariable ) | ( ruleVLSVariableDeclaration ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_UPPER_WORD_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==61) ) {
                    alt17=2;
                }
                else if ( (LA17_1==50||LA17_1==56) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalVampireLanguage.g:1343:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1343:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1344:3: ruleVLSVariable
                    {
                     before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_3_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSVariable();

                    state._fsp--;

                     after(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1349:2: ( ruleVLSVariableDeclaration )
                    {
                    // InternalVampireLanguage.g:1349:2: ( ruleVLSVariableDeclaration )
                    // InternalVampireLanguage.g:1350:3: ruleVLSVariableDeclaration
                    {
                     before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableDeclarationParserRuleCall_1_3_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableDeclarationParserRuleCall_1_3_1_0_1()); 

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
    // $ANTLR end "rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0"


    // $ANTLR start "rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0"
    // InternalVampireLanguage.g:1359:1: rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0 : ( ( ruleVLSVariable ) | ( ruleVLSVariableDeclaration ) );
    public final void rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1363:1: ( ( ruleVLSVariable ) | ( ruleVLSVariableDeclaration ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_UPPER_WORD_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==61) ) {
                    alt18=2;
                }
                else if ( (LA18_1==50||LA18_1==56) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalVampireLanguage.g:1364:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1364:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1365:3: ruleVLSVariable
                    {
                     before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSVariable();

                    state._fsp--;

                     after(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1370:2: ( ruleVLSVariableDeclaration )
                    {
                    // InternalVampireLanguage.g:1370:2: ( ruleVLSVariableDeclaration )
                    // InternalVampireLanguage.g:1371:3: ruleVLSVariableDeclaration
                    {
                     before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableDeclarationParserRuleCall_1_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableDeclarationParserRuleCall_1_2_0_1()); 

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
    // $ANTLR end "rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0"


    // $ANTLR start "rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0"
    // InternalVampireLanguage.g:1380:1: rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0 : ( ( ruleVLSVariable ) | ( ruleVLSVariableDeclaration ) );
    public final void rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1384:1: ( ( ruleVLSVariable ) | ( ruleVLSVariableDeclaration ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_UPPER_WORD_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==61) ) {
                    alt19=2;
                }
                else if ( (LA19_1==50||LA19_1==56) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalVampireLanguage.g:1385:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1385:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1386:3: ruleVLSVariable
                    {
                     before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_3_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSVariable();

                    state._fsp--;

                     after(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1391:2: ( ruleVLSVariableDeclaration )
                    {
                    // InternalVampireLanguage.g:1391:2: ( ruleVLSVariableDeclaration )
                    // InternalVampireLanguage.g:1392:3: ruleVLSVariableDeclaration
                    {
                     before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableDeclarationParserRuleCall_1_3_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableDeclarationParserRuleCall_1_3_1_0_1()); 

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
    // $ANTLR end "rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0"


    // $ANTLR start "rule__VLSUnaryInfix__Alternatives_1_0"
    // InternalVampireLanguage.g:1401:1: rule__VLSUnaryInfix__Alternatives_1_0 : ( ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) ) );
    public final void rule__VLSUnaryInfix__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1405:1: ( ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt20=1;
                }
                break;
            case 76:
                {
                alt20=2;
                }
                break;
            case 77:
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
                    // InternalVampireLanguage.g:1406:2: ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1406:2: ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) )
                    // InternalVampireLanguage.g:1407:3: ( rule__VLSUnaryInfix__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_0()); 
                    // InternalVampireLanguage.g:1408:3: ( rule__VLSUnaryInfix__Group_1_0_0__0 )
                    // InternalVampireLanguage.g:1408:4: rule__VLSUnaryInfix__Group_1_0_0__0
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
                    // InternalVampireLanguage.g:1412:2: ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1412:2: ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) )
                    // InternalVampireLanguage.g:1413:3: ( rule__VLSUnaryInfix__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_1()); 
                    // InternalVampireLanguage.g:1414:3: ( rule__VLSUnaryInfix__Group_1_0_1__0 )
                    // InternalVampireLanguage.g:1414:4: rule__VLSUnaryInfix__Group_1_0_1__0
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
                    // InternalVampireLanguage.g:1418:2: ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1418:2: ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) )
                    // InternalVampireLanguage.g:1419:3: ( rule__VLSUnaryInfix__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_2()); 
                    // InternalVampireLanguage.g:1420:3: ( rule__VLSUnaryInfix__Group_1_0_2__0 )
                    // InternalVampireLanguage.g:1420:4: rule__VLSUnaryInfix__Group_1_0_2__0
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
    // InternalVampireLanguage.g:1428:1: rule__VLSAtomic__Alternatives : ( ( ruleVLSAtomicConstant ) | ( ruleVLSAtomicFunction ) | ( ruleVLSVariable ) | ( ruleVLSDefinedTerm ) );
    public final void rule__VLSAtomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1432:1: ( ( ruleVLSAtomicConstant ) | ( ruleVLSAtomicFunction ) | ( ruleVLSVariable ) | ( ruleVLSDefinedTerm ) )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalVampireLanguage.g:1433:2: ( ruleVLSAtomicConstant )
                    {
                    // InternalVampireLanguage.g:1433:2: ( ruleVLSAtomicConstant )
                    // InternalVampireLanguage.g:1434:3: ruleVLSAtomicConstant
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
                    // InternalVampireLanguage.g:1439:2: ( ruleVLSAtomicFunction )
                    {
                    // InternalVampireLanguage.g:1439:2: ( ruleVLSAtomicFunction )
                    // InternalVampireLanguage.g:1440:3: ruleVLSAtomicFunction
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
                    // InternalVampireLanguage.g:1445:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1445:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1446:3: ruleVLSVariable
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
                    // InternalVampireLanguage.g:1451:2: ( ruleVLSDefinedTerm )
                    {
                    // InternalVampireLanguage.g:1451:2: ( ruleVLSDefinedTerm )
                    // InternalVampireLanguage.g:1452:3: ruleVLSDefinedTerm
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
    // InternalVampireLanguage.g:1461:1: rule__VLSAtomicConstant__Alternatives : ( ( ( rule__VLSAtomicConstant__Group_0__0 ) ) | ( ( rule__VLSAtomicConstant__Group_1__0 ) ) | ( ( rule__VLSAtomicConstant__Group_2__0 ) ) );
    public final void rule__VLSAtomicConstant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1465:1: ( ( ( rule__VLSAtomicConstant__Group_0__0 ) ) | ( ( rule__VLSAtomicConstant__Group_1__0 ) ) | ( ( rule__VLSAtomicConstant__Group_2__0 ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
            case 24:
            case 25:
            case 26:
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
                {
                alt22=1;
                }
                break;
            case 78:
                {
                alt22=2;
                }
                break;
            case 79:
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
                    // InternalVampireLanguage.g:1466:2: ( ( rule__VLSAtomicConstant__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1466:2: ( ( rule__VLSAtomicConstant__Group_0__0 ) )
                    // InternalVampireLanguage.g:1467:3: ( rule__VLSAtomicConstant__Group_0__0 )
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:1468:3: ( rule__VLSAtomicConstant__Group_0__0 )
                    // InternalVampireLanguage.g:1468:4: rule__VLSAtomicConstant__Group_0__0
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
                    // InternalVampireLanguage.g:1472:2: ( ( rule__VLSAtomicConstant__Group_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1472:2: ( ( rule__VLSAtomicConstant__Group_1__0 ) )
                    // InternalVampireLanguage.g:1473:3: ( rule__VLSAtomicConstant__Group_1__0 )
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getGroup_1()); 
                    // InternalVampireLanguage.g:1474:3: ( rule__VLSAtomicConstant__Group_1__0 )
                    // InternalVampireLanguage.g:1474:4: rule__VLSAtomicConstant__Group_1__0
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
                    // InternalVampireLanguage.g:1478:2: ( ( rule__VLSAtomicConstant__Group_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1478:2: ( ( rule__VLSAtomicConstant__Group_2__0 ) )
                    // InternalVampireLanguage.g:1479:3: ( rule__VLSAtomicConstant__Group_2__0 )
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getGroup_2()); 
                    // InternalVampireLanguage.g:1480:3: ( rule__VLSAtomicConstant__Group_2__0 )
                    // InternalVampireLanguage.g:1480:4: rule__VLSAtomicConstant__Group_2__0
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
    // InternalVampireLanguage.g:1488:1: rule__VLSAtomicConstant__NameAlternatives_0_1_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) | ( ruleVLSRole ) );
    public final void rule__VLSAtomicConstant__NameAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1492:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) | ( ruleVLSRole ) )
            int alt23=5;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt23=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt23=2;
                }
                break;
            case RULE_DOLLAR_ID:
                {
                alt23=3;
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt23=4;
                }
                break;
            case 24:
            case 25:
            case 26:
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
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalVampireLanguage.g:1493:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1493:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1494:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1499:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1499:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1500:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1505:2: ( RULE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1505:2: ( RULE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1506:3: RULE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameDOLLAR_IDTerminalRuleCall_0_1_0_2()); 
                    match(input,RULE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameDOLLAR_IDTerminalRuleCall_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1511:2: ( RULE_DOUBLE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1511:2: ( RULE_DOUBLE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1512:3: RULE_DOUBLE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 
                    match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:1517:2: ( ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:1517:2: ( ruleVLSRole )
                    // InternalVampireLanguage.g:1518:3: ruleVLSRole
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
    // InternalVampireLanguage.g:1527:1: rule__VLSAtomicFunction__Alternatives : ( ( ( rule__VLSAtomicFunction__Group_0__0 ) ) | ( ( rule__VLSAtomicFunction__Group_1__0 ) ) );
    public final void rule__VLSAtomicFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1531:1: ( ( ( rule__VLSAtomicFunction__Group_0__0 ) ) | ( ( rule__VLSAtomicFunction__Group_1__0 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_LOWER_WORD_ID||(LA24_0>=RULE_SINGLE_QUOTE && LA24_0<=RULE_DOUBLE_DOLLAR_ID)||(LA24_0>=24 && LA24_0<=38)) ) {
                alt24=1;
            }
            else if ( (LA24_0==80) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalVampireLanguage.g:1532:2: ( ( rule__VLSAtomicFunction__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1532:2: ( ( rule__VLSAtomicFunction__Group_0__0 ) )
                    // InternalVampireLanguage.g:1533:3: ( rule__VLSAtomicFunction__Group_0__0 )
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:1534:3: ( rule__VLSAtomicFunction__Group_0__0 )
                    // InternalVampireLanguage.g:1534:4: rule__VLSAtomicFunction__Group_0__0
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
                    // InternalVampireLanguage.g:1538:2: ( ( rule__VLSAtomicFunction__Group_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1538:2: ( ( rule__VLSAtomicFunction__Group_1__0 ) )
                    // InternalVampireLanguage.g:1539:3: ( rule__VLSAtomicFunction__Group_1__0 )
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_1()); 
                    // InternalVampireLanguage.g:1540:3: ( rule__VLSAtomicFunction__Group_1__0 )
                    // InternalVampireLanguage.g:1540:4: rule__VLSAtomicFunction__Group_1__0
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
    // InternalVampireLanguage.g:1548:1: rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) | ( ruleVLSRole ) );
    public final void rule__VLSAtomicFunction__ConstantAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1552:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) | ( ruleVLSRole ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt25=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt25=2;
                }
                break;
            case RULE_DOLLAR_ID:
                {
                alt25=3;
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt25=4;
                }
                break;
            case 24:
            case 25:
            case 26:
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
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalVampireLanguage.g:1553:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1553:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1554:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1559:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1559:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1560:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1565:2: ( RULE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1565:2: ( RULE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1566:3: RULE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOLLAR_IDTerminalRuleCall_0_1_0_2()); 
                    match(input,RULE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOLLAR_IDTerminalRuleCall_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1571:2: ( RULE_DOUBLE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1571:2: ( RULE_DOUBLE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1572:3: RULE_DOUBLE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 
                    match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:1577:2: ( ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:1577:2: ( ruleVLSRole )
                    // InternalVampireLanguage.g:1578:3: ruleVLSRole
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
    // InternalVampireLanguage.g:1587:1: rule__VLSFofTerm__Alternatives : ( ( ruleVLSVariable ) | ( ruleVLSFunctionAsTerm ) | ( ruleVLSDefinedTerm ) );
    public final void rule__VLSFofTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1591:1: ( ( ruleVLSVariable ) | ( ruleVLSFunctionAsTerm ) | ( ruleVLSDefinedTerm ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case RULE_UPPER_WORD_ID:
                {
                alt26=1;
                }
                break;
            case RULE_LOWER_WORD_ID:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt26=2;
                }
                break;
            case RULE_SIGNED_LITERAL:
            case RULE_DOUBLE_QUOTE:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalVampireLanguage.g:1592:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1592:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1593:3: ruleVLSVariable
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
                    // InternalVampireLanguage.g:1598:2: ( ruleVLSFunctionAsTerm )
                    {
                    // InternalVampireLanguage.g:1598:2: ( ruleVLSFunctionAsTerm )
                    // InternalVampireLanguage.g:1599:3: ruleVLSFunctionAsTerm
                    {
                     before(grammarAccess.getVLSFofTermAccess().getVLSFunctionAsTermParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSFunctionAsTerm();

                    state._fsp--;

                     after(grammarAccess.getVLSFofTermAccess().getVLSFunctionAsTermParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1604:2: ( ruleVLSDefinedTerm )
                    {
                    // InternalVampireLanguage.g:1604:2: ( ruleVLSDefinedTerm )
                    // InternalVampireLanguage.g:1605:3: ruleVLSDefinedTerm
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


    // $ANTLR start "rule__VLSFunctionAsTerm__FunctorAlternatives_0_0"
    // InternalVampireLanguage.g:1614:1: rule__VLSFunctionAsTerm__FunctorAlternatives_0_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) );
    public final void rule__VLSFunctionAsTerm__FunctorAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1618:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt27=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt27=2;
                }
                break;
            case RULE_DOLLAR_ID:
                {
                alt27=3;
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalVampireLanguage.g:1619:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1619:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1620:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSFunctionAsTermAccess().getFunctorLOWER_WORD_IDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionAsTermAccess().getFunctorLOWER_WORD_IDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1625:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1625:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1626:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSFunctionAsTermAccess().getFunctorSINGLE_QUOTETerminalRuleCall_0_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionAsTermAccess().getFunctorSINGLE_QUOTETerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1631:2: ( RULE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1631:2: ( RULE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1632:3: RULE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSFunctionAsTermAccess().getFunctorDOLLAR_IDTerminalRuleCall_0_0_2()); 
                    match(input,RULE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionAsTermAccess().getFunctorDOLLAR_IDTerminalRuleCall_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1637:2: ( RULE_DOUBLE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1637:2: ( RULE_DOUBLE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1638:3: RULE_DOUBLE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSFunctionAsTermAccess().getFunctorDOUBLE_DOLLAR_IDTerminalRuleCall_0_0_3()); 
                    match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionAsTermAccess().getFunctorDOUBLE_DOLLAR_IDTerminalRuleCall_0_0_3()); 

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
    // $ANTLR end "rule__VLSFunctionAsTerm__FunctorAlternatives_0_0"


    // $ANTLR start "rule__VLSDefinedTerm__Alternatives"
    // InternalVampireLanguage.g:1647:1: rule__VLSDefinedTerm__Alternatives : ( ( ( rule__VLSDefinedTerm__Group_0__0 ) ) | ( ( rule__VLSDefinedTerm__Group_1__0 ) ) );
    public final void rule__VLSDefinedTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1651:1: ( ( ( rule__VLSDefinedTerm__Group_0__0 ) ) | ( ( rule__VLSDefinedTerm__Group_1__0 ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_SIGNED_LITERAL) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_DOUBLE_QUOTE) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalVampireLanguage.g:1652:2: ( ( rule__VLSDefinedTerm__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1652:2: ( ( rule__VLSDefinedTerm__Group_0__0 ) )
                    // InternalVampireLanguage.g:1653:3: ( rule__VLSDefinedTerm__Group_0__0 )
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:1654:3: ( rule__VLSDefinedTerm__Group_0__0 )
                    // InternalVampireLanguage.g:1654:4: rule__VLSDefinedTerm__Group_0__0
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
                    // InternalVampireLanguage.g:1658:2: ( ( rule__VLSDefinedTerm__Group_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1658:2: ( ( rule__VLSDefinedTerm__Group_1__0 ) )
                    // InternalVampireLanguage.g:1659:3: ( rule__VLSDefinedTerm__Group_1__0 )
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getGroup_1()); 
                    // InternalVampireLanguage.g:1660:3: ( rule__VLSDefinedTerm__Group_1__0 )
                    // InternalVampireLanguage.g:1660:4: rule__VLSDefinedTerm__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSDefinedTerm__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSDefinedTermAccess().getGroup_1()); 

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


    // $ANTLR start "rule__VLSConfirmations__Group_0__0"
    // InternalVampireLanguage.g:1668:1: rule__VLSConfirmations__Group_0__0 : rule__VLSConfirmations__Group_0__0__Impl rule__VLSConfirmations__Group_0__1 ;
    public final void rule__VLSConfirmations__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1672:1: ( rule__VLSConfirmations__Group_0__0__Impl rule__VLSConfirmations__Group_0__1 )
            // InternalVampireLanguage.g:1673:2: rule__VLSConfirmations__Group_0__0__Impl rule__VLSConfirmations__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__VLSConfirmations__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_0__0"


    // $ANTLR start "rule__VLSConfirmations__Group_0__0__Impl"
    // InternalVampireLanguage.g:1680:1: rule__VLSConfirmations__Group_0__0__Impl : ( () ) ;
    public final void rule__VLSConfirmations__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1684:1: ( ( () ) )
            // InternalVampireLanguage.g:1685:1: ( () )
            {
            // InternalVampireLanguage.g:1685:1: ( () )
            // InternalVampireLanguage.g:1686:2: ()
            {
             before(grammarAccess.getVLSConfirmationsAccess().getVLSSatisfiableAction_0_0()); 
            // InternalVampireLanguage.g:1687:2: ()
            // InternalVampireLanguage.g:1687:3: 
            {
            }

             after(grammarAccess.getVLSConfirmationsAccess().getVLSSatisfiableAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_0__0__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_0__1"
    // InternalVampireLanguage.g:1695:1: rule__VLSConfirmations__Group_0__1 : rule__VLSConfirmations__Group_0__1__Impl ;
    public final void rule__VLSConfirmations__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1699:1: ( rule__VLSConfirmations__Group_0__1__Impl )
            // InternalVampireLanguage.g:1700:2: rule__VLSConfirmations__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_0__1"


    // $ANTLR start "rule__VLSConfirmations__Group_0__1__Impl"
    // InternalVampireLanguage.g:1706:1: rule__VLSConfirmations__Group_0__1__Impl : ( 'Satisfiable!' ) ;
    public final void rule__VLSConfirmations__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1710:1: ( ( 'Satisfiable!' ) )
            // InternalVampireLanguage.g:1711:1: ( 'Satisfiable!' )
            {
            // InternalVampireLanguage.g:1711:1: ( 'Satisfiable!' )
            // InternalVampireLanguage.g:1712:2: 'Satisfiable!'
            {
             before(grammarAccess.getVLSConfirmationsAccess().getSatisfiableKeyword_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVLSConfirmationsAccess().getSatisfiableKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_0__1__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_1__0"
    // InternalVampireLanguage.g:1722:1: rule__VLSConfirmations__Group_1__0 : rule__VLSConfirmations__Group_1__0__Impl rule__VLSConfirmations__Group_1__1 ;
    public final void rule__VLSConfirmations__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1726:1: ( rule__VLSConfirmations__Group_1__0__Impl rule__VLSConfirmations__Group_1__1 )
            // InternalVampireLanguage.g:1727:2: rule__VLSConfirmations__Group_1__0__Impl rule__VLSConfirmations__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__VLSConfirmations__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__0"


    // $ANTLR start "rule__VLSConfirmations__Group_1__0__Impl"
    // InternalVampireLanguage.g:1734:1: rule__VLSConfirmations__Group_1__0__Impl : ( () ) ;
    public final void rule__VLSConfirmations__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1738:1: ( ( () ) )
            // InternalVampireLanguage.g:1739:1: ( () )
            {
            // InternalVampireLanguage.g:1739:1: ( () )
            // InternalVampireLanguage.g:1740:2: ()
            {
             before(grammarAccess.getVLSConfirmationsAccess().getVLSWarningAction_1_0()); 
            // InternalVampireLanguage.g:1741:2: ()
            // InternalVampireLanguage.g:1741:3: 
            {
            }

             after(grammarAccess.getVLSConfirmationsAccess().getVLSWarningAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__0__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_1__1"
    // InternalVampireLanguage.g:1749:1: rule__VLSConfirmations__Group_1__1 : rule__VLSConfirmations__Group_1__1__Impl rule__VLSConfirmations__Group_1__2 ;
    public final void rule__VLSConfirmations__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1753:1: ( rule__VLSConfirmations__Group_1__1__Impl rule__VLSConfirmations__Group_1__2 )
            // InternalVampireLanguage.g:1754:2: rule__VLSConfirmations__Group_1__1__Impl rule__VLSConfirmations__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__VLSConfirmations__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__1"


    // $ANTLR start "rule__VLSConfirmations__Group_1__1__Impl"
    // InternalVampireLanguage.g:1761:1: rule__VLSConfirmations__Group_1__1__Impl : ( 'WARNING!' ) ;
    public final void rule__VLSConfirmations__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1765:1: ( ( 'WARNING!' ) )
            // InternalVampireLanguage.g:1766:1: ( 'WARNING!' )
            {
            // InternalVampireLanguage.g:1766:1: ( 'WARNING!' )
            // InternalVampireLanguage.g:1767:2: 'WARNING!'
            {
             before(grammarAccess.getVLSConfirmationsAccess().getWARNINGKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVLSConfirmationsAccess().getWARNINGKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__1__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_1__2"
    // InternalVampireLanguage.g:1776:1: rule__VLSConfirmations__Group_1__2 : rule__VLSConfirmations__Group_1__2__Impl rule__VLSConfirmations__Group_1__3 ;
    public final void rule__VLSConfirmations__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1780:1: ( rule__VLSConfirmations__Group_1__2__Impl rule__VLSConfirmations__Group_1__3 )
            // InternalVampireLanguage.g:1781:2: rule__VLSConfirmations__Group_1__2__Impl rule__VLSConfirmations__Group_1__3
            {
            pushFollow(FOLLOW_9);
            rule__VLSConfirmations__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__2"


    // $ANTLR start "rule__VLSConfirmations__Group_1__2__Impl"
    // InternalVampireLanguage.g:1788:1: rule__VLSConfirmations__Group_1__2__Impl : ( 'Could' ) ;
    public final void rule__VLSConfirmations__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1792:1: ( ( 'Could' ) )
            // InternalVampireLanguage.g:1793:1: ( 'Could' )
            {
            // InternalVampireLanguage.g:1793:1: ( 'Could' )
            // InternalVampireLanguage.g:1794:2: 'Could'
            {
             before(grammarAccess.getVLSConfirmationsAccess().getCouldKeyword_1_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVLSConfirmationsAccess().getCouldKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__2__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_1__3"
    // InternalVampireLanguage.g:1803:1: rule__VLSConfirmations__Group_1__3 : rule__VLSConfirmations__Group_1__3__Impl rule__VLSConfirmations__Group_1__4 ;
    public final void rule__VLSConfirmations__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1807:1: ( rule__VLSConfirmations__Group_1__3__Impl rule__VLSConfirmations__Group_1__4 )
            // InternalVampireLanguage.g:1808:2: rule__VLSConfirmations__Group_1__3__Impl rule__VLSConfirmations__Group_1__4
            {
            pushFollow(FOLLOW_10);
            rule__VLSConfirmations__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__3"


    // $ANTLR start "rule__VLSConfirmations__Group_1__3__Impl"
    // InternalVampireLanguage.g:1815:1: rule__VLSConfirmations__Group_1__3__Impl : ( 'not' ) ;
    public final void rule__VLSConfirmations__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1819:1: ( ( 'not' ) )
            // InternalVampireLanguage.g:1820:1: ( 'not' )
            {
            // InternalVampireLanguage.g:1820:1: ( 'not' )
            // InternalVampireLanguage.g:1821:2: 'not'
            {
             before(grammarAccess.getVLSConfirmationsAccess().getNotKeyword_1_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVLSConfirmationsAccess().getNotKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__3__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_1__4"
    // InternalVampireLanguage.g:1830:1: rule__VLSConfirmations__Group_1__4 : rule__VLSConfirmations__Group_1__4__Impl rule__VLSConfirmations__Group_1__5 ;
    public final void rule__VLSConfirmations__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1834:1: ( rule__VLSConfirmations__Group_1__4__Impl rule__VLSConfirmations__Group_1__5 )
            // InternalVampireLanguage.g:1835:2: rule__VLSConfirmations__Group_1__4__Impl rule__VLSConfirmations__Group_1__5
            {
            pushFollow(FOLLOW_11);
            rule__VLSConfirmations__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__4"


    // $ANTLR start "rule__VLSConfirmations__Group_1__4__Impl"
    // InternalVampireLanguage.g:1842:1: rule__VLSConfirmations__Group_1__4__Impl : ( 'set' ) ;
    public final void rule__VLSConfirmations__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1846:1: ( ( 'set' ) )
            // InternalVampireLanguage.g:1847:1: ( 'set' )
            {
            // InternalVampireLanguage.g:1847:1: ( 'set' )
            // InternalVampireLanguage.g:1848:2: 'set'
            {
             before(grammarAccess.getVLSConfirmationsAccess().getSetKeyword_1_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getVLSConfirmationsAccess().getSetKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__4__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_1__5"
    // InternalVampireLanguage.g:1857:1: rule__VLSConfirmations__Group_1__5 : rule__VLSConfirmations__Group_1__5__Impl rule__VLSConfirmations__Group_1__6 ;
    public final void rule__VLSConfirmations__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1861:1: ( rule__VLSConfirmations__Group_1__5__Impl rule__VLSConfirmations__Group_1__6 )
            // InternalVampireLanguage.g:1862:2: rule__VLSConfirmations__Group_1__5__Impl rule__VLSConfirmations__Group_1__6
            {
            pushFollow(FOLLOW_12);
            rule__VLSConfirmations__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__5"


    // $ANTLR start "rule__VLSConfirmations__Group_1__5__Impl"
    // InternalVampireLanguage.g:1869:1: rule__VLSConfirmations__Group_1__5__Impl : ( 'resource' ) ;
    public final void rule__VLSConfirmations__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1873:1: ( ( 'resource' ) )
            // InternalVampireLanguage.g:1874:1: ( 'resource' )
            {
            // InternalVampireLanguage.g:1874:1: ( 'resource' )
            // InternalVampireLanguage.g:1875:2: 'resource'
            {
             before(grammarAccess.getVLSConfirmationsAccess().getResourceKeyword_1_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVLSConfirmationsAccess().getResourceKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__5__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_1__6"
    // InternalVampireLanguage.g:1884:1: rule__VLSConfirmations__Group_1__6 : rule__VLSConfirmations__Group_1__6__Impl rule__VLSConfirmations__Group_1__7 ;
    public final void rule__VLSConfirmations__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1888:1: ( rule__VLSConfirmations__Group_1__6__Impl rule__VLSConfirmations__Group_1__7 )
            // InternalVampireLanguage.g:1889:2: rule__VLSConfirmations__Group_1__6__Impl rule__VLSConfirmations__Group_1__7
            {
            pushFollow(FOLLOW_13);
            rule__VLSConfirmations__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_1__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__6"


    // $ANTLR start "rule__VLSConfirmations__Group_1__6__Impl"
    // InternalVampireLanguage.g:1896:1: rule__VLSConfirmations__Group_1__6__Impl : ( 'limit:' ) ;
    public final void rule__VLSConfirmations__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1900:1: ( ( 'limit:' ) )
            // InternalVampireLanguage.g:1901:1: ( 'limit:' )
            {
            // InternalVampireLanguage.g:1901:1: ( 'limit:' )
            // InternalVampireLanguage.g:1902:2: 'limit:'
            {
             before(grammarAccess.getVLSConfirmationsAccess().getLimitKeyword_1_6()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVLSConfirmationsAccess().getLimitKeyword_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__6__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_1__7"
    // InternalVampireLanguage.g:1911:1: rule__VLSConfirmations__Group_1__7 : rule__VLSConfirmations__Group_1__7__Impl rule__VLSConfirmations__Group_1__8 ;
    public final void rule__VLSConfirmations__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1915:1: ( rule__VLSConfirmations__Group_1__7__Impl rule__VLSConfirmations__Group_1__8 )
            // InternalVampireLanguage.g:1916:2: rule__VLSConfirmations__Group_1__7__Impl rule__VLSConfirmations__Group_1__8
            {
            pushFollow(FOLLOW_14);
            rule__VLSConfirmations__Group_1__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_1__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__7"


    // $ANTLR start "rule__VLSConfirmations__Group_1__7__Impl"
    // InternalVampireLanguage.g:1923:1: rule__VLSConfirmations__Group_1__7__Impl : ( 'Virtual' ) ;
    public final void rule__VLSConfirmations__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1927:1: ( ( 'Virtual' ) )
            // InternalVampireLanguage.g:1928:1: ( 'Virtual' )
            {
            // InternalVampireLanguage.g:1928:1: ( 'Virtual' )
            // InternalVampireLanguage.g:1929:2: 'Virtual'
            {
             before(grammarAccess.getVLSConfirmationsAccess().getVirtualKeyword_1_7()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getVLSConfirmationsAccess().getVirtualKeyword_1_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__7__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_1__8"
    // InternalVampireLanguage.g:1938:1: rule__VLSConfirmations__Group_1__8 : rule__VLSConfirmations__Group_1__8__Impl ;
    public final void rule__VLSConfirmations__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1942:1: ( rule__VLSConfirmations__Group_1__8__Impl )
            // InternalVampireLanguage.g:1943:2: rule__VLSConfirmations__Group_1__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_1__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__8"


    // $ANTLR start "rule__VLSConfirmations__Group_1__8__Impl"
    // InternalVampireLanguage.g:1949:1: rule__VLSConfirmations__Group_1__8__Impl : ( 'memory.' ) ;
    public final void rule__VLSConfirmations__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1953:1: ( ( 'memory.' ) )
            // InternalVampireLanguage.g:1954:1: ( 'memory.' )
            {
            // InternalVampireLanguage.g:1954:1: ( 'memory.' )
            // InternalVampireLanguage.g:1955:2: 'memory.'
            {
             before(grammarAccess.getVLSConfirmationsAccess().getMemoryKeyword_1_8()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getVLSConfirmationsAccess().getMemoryKeyword_1_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_1__8__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_2__0"
    // InternalVampireLanguage.g:1965:1: rule__VLSConfirmations__Group_2__0 : rule__VLSConfirmations__Group_2__0__Impl rule__VLSConfirmations__Group_2__1 ;
    public final void rule__VLSConfirmations__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1969:1: ( rule__VLSConfirmations__Group_2__0__Impl rule__VLSConfirmations__Group_2__1 )
            // InternalVampireLanguage.g:1970:2: rule__VLSConfirmations__Group_2__0__Impl rule__VLSConfirmations__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__VLSConfirmations__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_2__0"


    // $ANTLR start "rule__VLSConfirmations__Group_2__0__Impl"
    // InternalVampireLanguage.g:1977:1: rule__VLSConfirmations__Group_2__0__Impl : ( () ) ;
    public final void rule__VLSConfirmations__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1981:1: ( ( () ) )
            // InternalVampireLanguage.g:1982:1: ( () )
            {
            // InternalVampireLanguage.g:1982:1: ( () )
            // InternalVampireLanguage.g:1983:2: ()
            {
             before(grammarAccess.getVLSConfirmationsAccess().getVLSTryingAction_2_0()); 
            // InternalVampireLanguage.g:1984:2: ()
            // InternalVampireLanguage.g:1984:3: 
            {
            }

             after(grammarAccess.getVLSConfirmationsAccess().getVLSTryingAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_2__0__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_2__1"
    // InternalVampireLanguage.g:1992:1: rule__VLSConfirmations__Group_2__1 : rule__VLSConfirmations__Group_2__1__Impl rule__VLSConfirmations__Group_2__2 ;
    public final void rule__VLSConfirmations__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1996:1: ( rule__VLSConfirmations__Group_2__1__Impl rule__VLSConfirmations__Group_2__2 )
            // InternalVampireLanguage.g:1997:2: rule__VLSConfirmations__Group_2__1__Impl rule__VLSConfirmations__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__VLSConfirmations__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_2__1"


    // $ANTLR start "rule__VLSConfirmations__Group_2__1__Impl"
    // InternalVampireLanguage.g:2004:1: rule__VLSConfirmations__Group_2__1__Impl : ( 'TRYING' ) ;
    public final void rule__VLSConfirmations__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2008:1: ( ( 'TRYING' ) )
            // InternalVampireLanguage.g:2009:1: ( 'TRYING' )
            {
            // InternalVampireLanguage.g:2009:1: ( 'TRYING' )
            // InternalVampireLanguage.g:2010:2: 'TRYING'
            {
             before(grammarAccess.getVLSConfirmationsAccess().getTRYINGKeyword_2_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getVLSConfirmationsAccess().getTRYINGKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_2__1__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_2__2"
    // InternalVampireLanguage.g:2019:1: rule__VLSConfirmations__Group_2__2 : rule__VLSConfirmations__Group_2__2__Impl rule__VLSConfirmations__Group_2__3 ;
    public final void rule__VLSConfirmations__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2023:1: ( rule__VLSConfirmations__Group_2__2__Impl rule__VLSConfirmations__Group_2__3 )
            // InternalVampireLanguage.g:2024:2: rule__VLSConfirmations__Group_2__2__Impl rule__VLSConfirmations__Group_2__3
            {
            pushFollow(FOLLOW_17);
            rule__VLSConfirmations__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_2__2"


    // $ANTLR start "rule__VLSConfirmations__Group_2__2__Impl"
    // InternalVampireLanguage.g:2031:1: rule__VLSConfirmations__Group_2__2__Impl : ( '[' ) ;
    public final void rule__VLSConfirmations__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2035:1: ( ( '[' ) )
            // InternalVampireLanguage.g:2036:1: ( '[' )
            {
            // InternalVampireLanguage.g:2036:1: ( '[' )
            // InternalVampireLanguage.g:2037:2: '['
            {
             before(grammarAccess.getVLSConfirmationsAccess().getLeftSquareBracketKeyword_2_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getVLSConfirmationsAccess().getLeftSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_2__2__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_2__3"
    // InternalVampireLanguage.g:2046:1: rule__VLSConfirmations__Group_2__3 : rule__VLSConfirmations__Group_2__3__Impl rule__VLSConfirmations__Group_2__4 ;
    public final void rule__VLSConfirmations__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2050:1: ( rule__VLSConfirmations__Group_2__3__Impl rule__VLSConfirmations__Group_2__4 )
            // InternalVampireLanguage.g:2051:2: rule__VLSConfirmations__Group_2__3__Impl rule__VLSConfirmations__Group_2__4
            {
            pushFollow(FOLLOW_18);
            rule__VLSConfirmations__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_2__3"


    // $ANTLR start "rule__VLSConfirmations__Group_2__3__Impl"
    // InternalVampireLanguage.g:2058:1: rule__VLSConfirmations__Group_2__3__Impl : ( ( rule__VLSConfirmations__NameAssignment_2_3 ) ) ;
    public final void rule__VLSConfirmations__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2062:1: ( ( ( rule__VLSConfirmations__NameAssignment_2_3 ) ) )
            // InternalVampireLanguage.g:2063:1: ( ( rule__VLSConfirmations__NameAssignment_2_3 ) )
            {
            // InternalVampireLanguage.g:2063:1: ( ( rule__VLSConfirmations__NameAssignment_2_3 ) )
            // InternalVampireLanguage.g:2064:2: ( rule__VLSConfirmations__NameAssignment_2_3 )
            {
             before(grammarAccess.getVLSConfirmationsAccess().getNameAssignment_2_3()); 
            // InternalVampireLanguage.g:2065:2: ( rule__VLSConfirmations__NameAssignment_2_3 )
            // InternalVampireLanguage.g:2065:3: rule__VLSConfirmations__NameAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__NameAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getVLSConfirmationsAccess().getNameAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_2__3__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_2__4"
    // InternalVampireLanguage.g:2073:1: rule__VLSConfirmations__Group_2__4 : rule__VLSConfirmations__Group_2__4__Impl ;
    public final void rule__VLSConfirmations__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2077:1: ( rule__VLSConfirmations__Group_2__4__Impl )
            // InternalVampireLanguage.g:2078:2: rule__VLSConfirmations__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_2__4"


    // $ANTLR start "rule__VLSConfirmations__Group_2__4__Impl"
    // InternalVampireLanguage.g:2084:1: rule__VLSConfirmations__Group_2__4__Impl : ( ']' ) ;
    public final void rule__VLSConfirmations__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2088:1: ( ( ']' ) )
            // InternalVampireLanguage.g:2089:1: ( ']' )
            {
            // InternalVampireLanguage.g:2089:1: ( ']' )
            // InternalVampireLanguage.g:2090:2: ']'
            {
             before(grammarAccess.getVLSConfirmationsAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getVLSConfirmationsAccess().getRightSquareBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_2__4__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_3__0"
    // InternalVampireLanguage.g:2100:1: rule__VLSConfirmations__Group_3__0 : rule__VLSConfirmations__Group_3__0__Impl rule__VLSConfirmations__Group_3__1 ;
    public final void rule__VLSConfirmations__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2104:1: ( rule__VLSConfirmations__Group_3__0__Impl rule__VLSConfirmations__Group_3__1 )
            // InternalVampireLanguage.g:2105:2: rule__VLSConfirmations__Group_3__0__Impl rule__VLSConfirmations__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__VLSConfirmations__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_3__0"


    // $ANTLR start "rule__VLSConfirmations__Group_3__0__Impl"
    // InternalVampireLanguage.g:2112:1: rule__VLSConfirmations__Group_3__0__Impl : ( () ) ;
    public final void rule__VLSConfirmations__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2116:1: ( ( () ) )
            // InternalVampireLanguage.g:2117:1: ( () )
            {
            // InternalVampireLanguage.g:2117:1: ( () )
            // InternalVampireLanguage.g:2118:2: ()
            {
             before(grammarAccess.getVLSConfirmationsAccess().getVLSFiniteModelAction_3_0()); 
            // InternalVampireLanguage.g:2119:2: ()
            // InternalVampireLanguage.g:2119:3: 
            {
            }

             after(grammarAccess.getVLSConfirmationsAccess().getVLSFiniteModelAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_3__0__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_3__1"
    // InternalVampireLanguage.g:2127:1: rule__VLSConfirmations__Group_3__1 : rule__VLSConfirmations__Group_3__1__Impl rule__VLSConfirmations__Group_3__2 ;
    public final void rule__VLSConfirmations__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2131:1: ( rule__VLSConfirmations__Group_3__1__Impl rule__VLSConfirmations__Group_3__2 )
            // InternalVampireLanguage.g:2132:2: rule__VLSConfirmations__Group_3__1__Impl rule__VLSConfirmations__Group_3__2
            {
            pushFollow(FOLLOW_20);
            rule__VLSConfirmations__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_3__1"


    // $ANTLR start "rule__VLSConfirmations__Group_3__1__Impl"
    // InternalVampireLanguage.g:2139:1: rule__VLSConfirmations__Group_3__1__Impl : ( 'Finite' ) ;
    public final void rule__VLSConfirmations__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2143:1: ( ( 'Finite' ) )
            // InternalVampireLanguage.g:2144:1: ( 'Finite' )
            {
            // InternalVampireLanguage.g:2144:1: ( 'Finite' )
            // InternalVampireLanguage.g:2145:2: 'Finite'
            {
             before(grammarAccess.getVLSConfirmationsAccess().getFiniteKeyword_3_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getVLSConfirmationsAccess().getFiniteKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_3__1__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_3__2"
    // InternalVampireLanguage.g:2154:1: rule__VLSConfirmations__Group_3__2 : rule__VLSConfirmations__Group_3__2__Impl rule__VLSConfirmations__Group_3__3 ;
    public final void rule__VLSConfirmations__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2158:1: ( rule__VLSConfirmations__Group_3__2__Impl rule__VLSConfirmations__Group_3__3 )
            // InternalVampireLanguage.g:2159:2: rule__VLSConfirmations__Group_3__2__Impl rule__VLSConfirmations__Group_3__3
            {
            pushFollow(FOLLOW_21);
            rule__VLSConfirmations__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_3__2"


    // $ANTLR start "rule__VLSConfirmations__Group_3__2__Impl"
    // InternalVampireLanguage.g:2166:1: rule__VLSConfirmations__Group_3__2__Impl : ( 'Model' ) ;
    public final void rule__VLSConfirmations__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2170:1: ( ( 'Model' ) )
            // InternalVampireLanguage.g:2171:1: ( 'Model' )
            {
            // InternalVampireLanguage.g:2171:1: ( 'Model' )
            // InternalVampireLanguage.g:2172:2: 'Model'
            {
             before(grammarAccess.getVLSConfirmationsAccess().getModelKeyword_3_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getVLSConfirmationsAccess().getModelKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_3__2__Impl"


    // $ANTLR start "rule__VLSConfirmations__Group_3__3"
    // InternalVampireLanguage.g:2181:1: rule__VLSConfirmations__Group_3__3 : rule__VLSConfirmations__Group_3__3__Impl ;
    public final void rule__VLSConfirmations__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2185:1: ( rule__VLSConfirmations__Group_3__3__Impl )
            // InternalVampireLanguage.g:2186:2: rule__VLSConfirmations__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSConfirmations__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_3__3"


    // $ANTLR start "rule__VLSConfirmations__Group_3__3__Impl"
    // InternalVampireLanguage.g:2192:1: rule__VLSConfirmations__Group_3__3__Impl : ( 'Found!' ) ;
    public final void rule__VLSConfirmations__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2196:1: ( ( 'Found!' ) )
            // InternalVampireLanguage.g:2197:1: ( 'Found!' )
            {
            // InternalVampireLanguage.g:2197:1: ( 'Found!' )
            // InternalVampireLanguage.g:2198:2: 'Found!'
            {
             before(grammarAccess.getVLSConfirmationsAccess().getFoundKeyword_3_3()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getVLSConfirmationsAccess().getFoundKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__Group_3__3__Impl"


    // $ANTLR start "rule__VLSFofFormula__Group__0"
    // InternalVampireLanguage.g:2208:1: rule__VLSFofFormula__Group__0 : rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1 ;
    public final void rule__VLSFofFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2212:1: ( rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1 )
            // InternalVampireLanguage.g:2213:2: rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVampireLanguage.g:2220:1: rule__VLSFofFormula__Group__0__Impl : ( 'fof' ) ;
    public final void rule__VLSFofFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2224:1: ( ( 'fof' ) )
            // InternalVampireLanguage.g:2225:1: ( 'fof' )
            {
            // InternalVampireLanguage.g:2225:1: ( 'fof' )
            // InternalVampireLanguage.g:2226:2: 'fof'
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2235:1: rule__VLSFofFormula__Group__1 : rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2 ;
    public final void rule__VLSFofFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2239:1: ( rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2 )
            // InternalVampireLanguage.g:2240:2: rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalVampireLanguage.g:2247:1: rule__VLSFofFormula__Group__1__Impl : ( '(' ) ;
    public final void rule__VLSFofFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2251:1: ( ( '(' ) )
            // InternalVampireLanguage.g:2252:1: ( '(' )
            {
            // InternalVampireLanguage.g:2252:1: ( '(' )
            // InternalVampireLanguage.g:2253:2: '('
            {
             before(grammarAccess.getVLSFofFormulaAccess().getLeftParenthesisKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2262:1: rule__VLSFofFormula__Group__2 : rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3 ;
    public final void rule__VLSFofFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2266:1: ( rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3 )
            // InternalVampireLanguage.g:2267:2: rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalVampireLanguage.g:2274:1: rule__VLSFofFormula__Group__2__Impl : ( ( rule__VLSFofFormula__NameAssignment_2 ) ) ;
    public final void rule__VLSFofFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2278:1: ( ( ( rule__VLSFofFormula__NameAssignment_2 ) ) )
            // InternalVampireLanguage.g:2279:1: ( ( rule__VLSFofFormula__NameAssignment_2 ) )
            {
            // InternalVampireLanguage.g:2279:1: ( ( rule__VLSFofFormula__NameAssignment_2 ) )
            // InternalVampireLanguage.g:2280:2: ( rule__VLSFofFormula__NameAssignment_2 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getNameAssignment_2()); 
            // InternalVampireLanguage.g:2281:2: ( rule__VLSFofFormula__NameAssignment_2 )
            // InternalVampireLanguage.g:2281:3: rule__VLSFofFormula__NameAssignment_2
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
    // InternalVampireLanguage.g:2289:1: rule__VLSFofFormula__Group__3 : rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4 ;
    public final void rule__VLSFofFormula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2293:1: ( rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4 )
            // InternalVampireLanguage.g:2294:2: rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalVampireLanguage.g:2301:1: rule__VLSFofFormula__Group__3__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2305:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2306:1: ( ',' )
            {
            // InternalVampireLanguage.g:2306:1: ( ',' )
            // InternalVampireLanguage.g:2307:2: ','
            {
             before(grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_3()); 
            match(input,56,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2316:1: rule__VLSFofFormula__Group__4 : rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5 ;
    public final void rule__VLSFofFormula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2320:1: ( rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5 )
            // InternalVampireLanguage.g:2321:2: rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalVampireLanguage.g:2328:1: rule__VLSFofFormula__Group__4__Impl : ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) ) ;
    public final void rule__VLSFofFormula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2332:1: ( ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) ) )
            // InternalVampireLanguage.g:2333:1: ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) )
            {
            // InternalVampireLanguage.g:2333:1: ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) )
            // InternalVampireLanguage.g:2334:2: ( rule__VLSFofFormula__FofRoleAssignment_4 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofRoleAssignment_4()); 
            // InternalVampireLanguage.g:2335:2: ( rule__VLSFofFormula__FofRoleAssignment_4 )
            // InternalVampireLanguage.g:2335:3: rule__VLSFofFormula__FofRoleAssignment_4
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
    // InternalVampireLanguage.g:2343:1: rule__VLSFofFormula__Group__5 : rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6 ;
    public final void rule__VLSFofFormula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2347:1: ( rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6 )
            // InternalVampireLanguage.g:2348:2: rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalVampireLanguage.g:2355:1: rule__VLSFofFormula__Group__5__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2359:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2360:1: ( ',' )
            {
            // InternalVampireLanguage.g:2360:1: ( ',' )
            // InternalVampireLanguage.g:2361:2: ','
            {
             before(grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_5()); 
            match(input,56,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2370:1: rule__VLSFofFormula__Group__6 : rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7 ;
    public final void rule__VLSFofFormula__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2374:1: ( rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7 )
            // InternalVampireLanguage.g:2375:2: rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalVampireLanguage.g:2382:1: rule__VLSFofFormula__Group__6__Impl : ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) ) ;
    public final void rule__VLSFofFormula__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2386:1: ( ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) ) )
            // InternalVampireLanguage.g:2387:1: ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) )
            {
            // InternalVampireLanguage.g:2387:1: ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) )
            // InternalVampireLanguage.g:2388:2: ( rule__VLSFofFormula__FofFormulaAssignment_6 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofFormulaAssignment_6()); 
            // InternalVampireLanguage.g:2389:2: ( rule__VLSFofFormula__FofFormulaAssignment_6 )
            // InternalVampireLanguage.g:2389:3: rule__VLSFofFormula__FofFormulaAssignment_6
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
    // InternalVampireLanguage.g:2397:1: rule__VLSFofFormula__Group__7 : rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8 ;
    public final void rule__VLSFofFormula__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2401:1: ( rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8 )
            // InternalVampireLanguage.g:2402:2: rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8
            {
            pushFollow(FOLLOW_27);
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
    // InternalVampireLanguage.g:2409:1: rule__VLSFofFormula__Group__7__Impl : ( ( rule__VLSFofFormula__Group_7__0 )? ) ;
    public final void rule__VLSFofFormula__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2413:1: ( ( ( rule__VLSFofFormula__Group_7__0 )? ) )
            // InternalVampireLanguage.g:2414:1: ( ( rule__VLSFofFormula__Group_7__0 )? )
            {
            // InternalVampireLanguage.g:2414:1: ( ( rule__VLSFofFormula__Group_7__0 )? )
            // InternalVampireLanguage.g:2415:2: ( rule__VLSFofFormula__Group_7__0 )?
            {
             before(grammarAccess.getVLSFofFormulaAccess().getGroup_7()); 
            // InternalVampireLanguage.g:2416:2: ( rule__VLSFofFormula__Group_7__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==56) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVampireLanguage.g:2416:3: rule__VLSFofFormula__Group_7__0
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
    // InternalVampireLanguage.g:2424:1: rule__VLSFofFormula__Group__8 : rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9 ;
    public final void rule__VLSFofFormula__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2428:1: ( rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9 )
            // InternalVampireLanguage.g:2429:2: rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9
            {
            pushFollow(FOLLOW_28);
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
    // InternalVampireLanguage.g:2436:1: rule__VLSFofFormula__Group__8__Impl : ( ')' ) ;
    public final void rule__VLSFofFormula__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2440:1: ( ( ')' ) )
            // InternalVampireLanguage.g:2441:1: ( ')' )
            {
            // InternalVampireLanguage.g:2441:1: ( ')' )
            // InternalVampireLanguage.g:2442:2: ')'
            {
             before(grammarAccess.getVLSFofFormulaAccess().getRightParenthesisKeyword_8()); 
            match(input,57,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2451:1: rule__VLSFofFormula__Group__9 : rule__VLSFofFormula__Group__9__Impl ;
    public final void rule__VLSFofFormula__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2455:1: ( rule__VLSFofFormula__Group__9__Impl )
            // InternalVampireLanguage.g:2456:2: rule__VLSFofFormula__Group__9__Impl
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
    // InternalVampireLanguage.g:2462:1: rule__VLSFofFormula__Group__9__Impl : ( '.' ) ;
    public final void rule__VLSFofFormula__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2466:1: ( ( '.' ) )
            // InternalVampireLanguage.g:2467:1: ( '.' )
            {
            // InternalVampireLanguage.g:2467:1: ( '.' )
            // InternalVampireLanguage.g:2468:2: '.'
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFullStopKeyword_9()); 
            match(input,58,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2478:1: rule__VLSFofFormula__Group_7__0 : rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1 ;
    public final void rule__VLSFofFormula__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2482:1: ( rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1 )
            // InternalVampireLanguage.g:2483:2: rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalVampireLanguage.g:2490:1: rule__VLSFofFormula__Group_7__0__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2494:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2495:1: ( ',' )
            {
            // InternalVampireLanguage.g:2495:1: ( ',' )
            // InternalVampireLanguage.g:2496:2: ','
            {
             before(grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_7_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2505:1: rule__VLSFofFormula__Group_7__1 : rule__VLSFofFormula__Group_7__1__Impl ;
    public final void rule__VLSFofFormula__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2509:1: ( rule__VLSFofFormula__Group_7__1__Impl )
            // InternalVampireLanguage.g:2510:2: rule__VLSFofFormula__Group_7__1__Impl
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
    // InternalVampireLanguage.g:2516:1: rule__VLSFofFormula__Group_7__1__Impl : ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) ) ;
    public final void rule__VLSFofFormula__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2520:1: ( ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) ) )
            // InternalVampireLanguage.g:2521:1: ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) )
            {
            // InternalVampireLanguage.g:2521:1: ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) )
            // InternalVampireLanguage.g:2522:2: ( rule__VLSFofFormula__AnnotationsAssignment_7_1 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getAnnotationsAssignment_7_1()); 
            // InternalVampireLanguage.g:2523:2: ( rule__VLSFofFormula__AnnotationsAssignment_7_1 )
            // InternalVampireLanguage.g:2523:3: rule__VLSFofFormula__AnnotationsAssignment_7_1
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


    // $ANTLR start "rule__VLSTffFormula__Group__0"
    // InternalVampireLanguage.g:2532:1: rule__VLSTffFormula__Group__0 : rule__VLSTffFormula__Group__0__Impl rule__VLSTffFormula__Group__1 ;
    public final void rule__VLSTffFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2536:1: ( rule__VLSTffFormula__Group__0__Impl rule__VLSTffFormula__Group__1 )
            // InternalVampireLanguage.g:2537:2: rule__VLSTffFormula__Group__0__Impl rule__VLSTffFormula__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__VLSTffFormula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__0"


    // $ANTLR start "rule__VLSTffFormula__Group__0__Impl"
    // InternalVampireLanguage.g:2544:1: rule__VLSTffFormula__Group__0__Impl : ( 'tff' ) ;
    public final void rule__VLSTffFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2548:1: ( ( 'tff' ) )
            // InternalVampireLanguage.g:2549:1: ( 'tff' )
            {
            // InternalVampireLanguage.g:2549:1: ( 'tff' )
            // InternalVampireLanguage.g:2550:2: 'tff'
            {
             before(grammarAccess.getVLSTffFormulaAccess().getTffKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getVLSTffFormulaAccess().getTffKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__0__Impl"


    // $ANTLR start "rule__VLSTffFormula__Group__1"
    // InternalVampireLanguage.g:2559:1: rule__VLSTffFormula__Group__1 : rule__VLSTffFormula__Group__1__Impl rule__VLSTffFormula__Group__2 ;
    public final void rule__VLSTffFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2563:1: ( rule__VLSTffFormula__Group__1__Impl rule__VLSTffFormula__Group__2 )
            // InternalVampireLanguage.g:2564:2: rule__VLSTffFormula__Group__1__Impl rule__VLSTffFormula__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__VLSTffFormula__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__1"


    // $ANTLR start "rule__VLSTffFormula__Group__1__Impl"
    // InternalVampireLanguage.g:2571:1: rule__VLSTffFormula__Group__1__Impl : ( '(' ) ;
    public final void rule__VLSTffFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2575:1: ( ( '(' ) )
            // InternalVampireLanguage.g:2576:1: ( '(' )
            {
            // InternalVampireLanguage.g:2576:1: ( '(' )
            // InternalVampireLanguage.g:2577:2: '('
            {
             before(grammarAccess.getVLSTffFormulaAccess().getLeftParenthesisKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getVLSTffFormulaAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__1__Impl"


    // $ANTLR start "rule__VLSTffFormula__Group__2"
    // InternalVampireLanguage.g:2586:1: rule__VLSTffFormula__Group__2 : rule__VLSTffFormula__Group__2__Impl rule__VLSTffFormula__Group__3 ;
    public final void rule__VLSTffFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2590:1: ( rule__VLSTffFormula__Group__2__Impl rule__VLSTffFormula__Group__3 )
            // InternalVampireLanguage.g:2591:2: rule__VLSTffFormula__Group__2__Impl rule__VLSTffFormula__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__VLSTffFormula__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__2"


    // $ANTLR start "rule__VLSTffFormula__Group__2__Impl"
    // InternalVampireLanguage.g:2598:1: rule__VLSTffFormula__Group__2__Impl : ( ( rule__VLSTffFormula__NameAssignment_2 ) ) ;
    public final void rule__VLSTffFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2602:1: ( ( ( rule__VLSTffFormula__NameAssignment_2 ) ) )
            // InternalVampireLanguage.g:2603:1: ( ( rule__VLSTffFormula__NameAssignment_2 ) )
            {
            // InternalVampireLanguage.g:2603:1: ( ( rule__VLSTffFormula__NameAssignment_2 ) )
            // InternalVampireLanguage.g:2604:2: ( rule__VLSTffFormula__NameAssignment_2 )
            {
             before(grammarAccess.getVLSTffFormulaAccess().getNameAssignment_2()); 
            // InternalVampireLanguage.g:2605:2: ( rule__VLSTffFormula__NameAssignment_2 )
            // InternalVampireLanguage.g:2605:3: rule__VLSTffFormula__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVLSTffFormulaAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__2__Impl"


    // $ANTLR start "rule__VLSTffFormula__Group__3"
    // InternalVampireLanguage.g:2613:1: rule__VLSTffFormula__Group__3 : rule__VLSTffFormula__Group__3__Impl rule__VLSTffFormula__Group__4 ;
    public final void rule__VLSTffFormula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2617:1: ( rule__VLSTffFormula__Group__3__Impl rule__VLSTffFormula__Group__4 )
            // InternalVampireLanguage.g:2618:2: rule__VLSTffFormula__Group__3__Impl rule__VLSTffFormula__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__VLSTffFormula__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__3"


    // $ANTLR start "rule__VLSTffFormula__Group__3__Impl"
    // InternalVampireLanguage.g:2625:1: rule__VLSTffFormula__Group__3__Impl : ( ',' ) ;
    public final void rule__VLSTffFormula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2629:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2630:1: ( ',' )
            {
            // InternalVampireLanguage.g:2630:1: ( ',' )
            // InternalVampireLanguage.g:2631:2: ','
            {
             before(grammarAccess.getVLSTffFormulaAccess().getCommaKeyword_3()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getVLSTffFormulaAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__3__Impl"


    // $ANTLR start "rule__VLSTffFormula__Group__4"
    // InternalVampireLanguage.g:2640:1: rule__VLSTffFormula__Group__4 : rule__VLSTffFormula__Group__4__Impl rule__VLSTffFormula__Group__5 ;
    public final void rule__VLSTffFormula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2644:1: ( rule__VLSTffFormula__Group__4__Impl rule__VLSTffFormula__Group__5 )
            // InternalVampireLanguage.g:2645:2: rule__VLSTffFormula__Group__4__Impl rule__VLSTffFormula__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__VLSTffFormula__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__4"


    // $ANTLR start "rule__VLSTffFormula__Group__4__Impl"
    // InternalVampireLanguage.g:2652:1: rule__VLSTffFormula__Group__4__Impl : ( ( rule__VLSTffFormula__TffRoleAssignment_4 ) ) ;
    public final void rule__VLSTffFormula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2656:1: ( ( ( rule__VLSTffFormula__TffRoleAssignment_4 ) ) )
            // InternalVampireLanguage.g:2657:1: ( ( rule__VLSTffFormula__TffRoleAssignment_4 ) )
            {
            // InternalVampireLanguage.g:2657:1: ( ( rule__VLSTffFormula__TffRoleAssignment_4 ) )
            // InternalVampireLanguage.g:2658:2: ( rule__VLSTffFormula__TffRoleAssignment_4 )
            {
             before(grammarAccess.getVLSTffFormulaAccess().getTffRoleAssignment_4()); 
            // InternalVampireLanguage.g:2659:2: ( rule__VLSTffFormula__TffRoleAssignment_4 )
            // InternalVampireLanguage.g:2659:3: rule__VLSTffFormula__TffRoleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__TffRoleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVLSTffFormulaAccess().getTffRoleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__4__Impl"


    // $ANTLR start "rule__VLSTffFormula__Group__5"
    // InternalVampireLanguage.g:2667:1: rule__VLSTffFormula__Group__5 : rule__VLSTffFormula__Group__5__Impl rule__VLSTffFormula__Group__6 ;
    public final void rule__VLSTffFormula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2671:1: ( rule__VLSTffFormula__Group__5__Impl rule__VLSTffFormula__Group__6 )
            // InternalVampireLanguage.g:2672:2: rule__VLSTffFormula__Group__5__Impl rule__VLSTffFormula__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__VLSTffFormula__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__5"


    // $ANTLR start "rule__VLSTffFormula__Group__5__Impl"
    // InternalVampireLanguage.g:2679:1: rule__VLSTffFormula__Group__5__Impl : ( ',' ) ;
    public final void rule__VLSTffFormula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2683:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2684:1: ( ',' )
            {
            // InternalVampireLanguage.g:2684:1: ( ',' )
            // InternalVampireLanguage.g:2685:2: ','
            {
             before(grammarAccess.getVLSTffFormulaAccess().getCommaKeyword_5()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getVLSTffFormulaAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__5__Impl"


    // $ANTLR start "rule__VLSTffFormula__Group__6"
    // InternalVampireLanguage.g:2694:1: rule__VLSTffFormula__Group__6 : rule__VLSTffFormula__Group__6__Impl rule__VLSTffFormula__Group__7 ;
    public final void rule__VLSTffFormula__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2698:1: ( rule__VLSTffFormula__Group__6__Impl rule__VLSTffFormula__Group__7 )
            // InternalVampireLanguage.g:2699:2: rule__VLSTffFormula__Group__6__Impl rule__VLSTffFormula__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__VLSTffFormula__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__6"


    // $ANTLR start "rule__VLSTffFormula__Group__6__Impl"
    // InternalVampireLanguage.g:2706:1: rule__VLSTffFormula__Group__6__Impl : ( ( rule__VLSTffFormula__FofFormulaAssignment_6 ) ) ;
    public final void rule__VLSTffFormula__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2710:1: ( ( ( rule__VLSTffFormula__FofFormulaAssignment_6 ) ) )
            // InternalVampireLanguage.g:2711:1: ( ( rule__VLSTffFormula__FofFormulaAssignment_6 ) )
            {
            // InternalVampireLanguage.g:2711:1: ( ( rule__VLSTffFormula__FofFormulaAssignment_6 ) )
            // InternalVampireLanguage.g:2712:2: ( rule__VLSTffFormula__FofFormulaAssignment_6 )
            {
             before(grammarAccess.getVLSTffFormulaAccess().getFofFormulaAssignment_6()); 
            // InternalVampireLanguage.g:2713:2: ( rule__VLSTffFormula__FofFormulaAssignment_6 )
            // InternalVampireLanguage.g:2713:3: rule__VLSTffFormula__FofFormulaAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__FofFormulaAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVLSTffFormulaAccess().getFofFormulaAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__6__Impl"


    // $ANTLR start "rule__VLSTffFormula__Group__7"
    // InternalVampireLanguage.g:2721:1: rule__VLSTffFormula__Group__7 : rule__VLSTffFormula__Group__7__Impl rule__VLSTffFormula__Group__8 ;
    public final void rule__VLSTffFormula__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2725:1: ( rule__VLSTffFormula__Group__7__Impl rule__VLSTffFormula__Group__8 )
            // InternalVampireLanguage.g:2726:2: rule__VLSTffFormula__Group__7__Impl rule__VLSTffFormula__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__VLSTffFormula__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__7"


    // $ANTLR start "rule__VLSTffFormula__Group__7__Impl"
    // InternalVampireLanguage.g:2733:1: rule__VLSTffFormula__Group__7__Impl : ( ( rule__VLSTffFormula__Group_7__0 )? ) ;
    public final void rule__VLSTffFormula__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2737:1: ( ( ( rule__VLSTffFormula__Group_7__0 )? ) )
            // InternalVampireLanguage.g:2738:1: ( ( rule__VLSTffFormula__Group_7__0 )? )
            {
            // InternalVampireLanguage.g:2738:1: ( ( rule__VLSTffFormula__Group_7__0 )? )
            // InternalVampireLanguage.g:2739:2: ( rule__VLSTffFormula__Group_7__0 )?
            {
             before(grammarAccess.getVLSTffFormulaAccess().getGroup_7()); 
            // InternalVampireLanguage.g:2740:2: ( rule__VLSTffFormula__Group_7__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVampireLanguage.g:2740:3: rule__VLSTffFormula__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSTffFormula__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVLSTffFormulaAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__7__Impl"


    // $ANTLR start "rule__VLSTffFormula__Group__8"
    // InternalVampireLanguage.g:2748:1: rule__VLSTffFormula__Group__8 : rule__VLSTffFormula__Group__8__Impl rule__VLSTffFormula__Group__9 ;
    public final void rule__VLSTffFormula__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2752:1: ( rule__VLSTffFormula__Group__8__Impl rule__VLSTffFormula__Group__9 )
            // InternalVampireLanguage.g:2753:2: rule__VLSTffFormula__Group__8__Impl rule__VLSTffFormula__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__VLSTffFormula__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__8"


    // $ANTLR start "rule__VLSTffFormula__Group__8__Impl"
    // InternalVampireLanguage.g:2760:1: rule__VLSTffFormula__Group__8__Impl : ( ')' ) ;
    public final void rule__VLSTffFormula__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2764:1: ( ( ')' ) )
            // InternalVampireLanguage.g:2765:1: ( ')' )
            {
            // InternalVampireLanguage.g:2765:1: ( ')' )
            // InternalVampireLanguage.g:2766:2: ')'
            {
             before(grammarAccess.getVLSTffFormulaAccess().getRightParenthesisKeyword_8()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getVLSTffFormulaAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__8__Impl"


    // $ANTLR start "rule__VLSTffFormula__Group__9"
    // InternalVampireLanguage.g:2775:1: rule__VLSTffFormula__Group__9 : rule__VLSTffFormula__Group__9__Impl ;
    public final void rule__VLSTffFormula__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2779:1: ( rule__VLSTffFormula__Group__9__Impl )
            // InternalVampireLanguage.g:2780:2: rule__VLSTffFormula__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__9"


    // $ANTLR start "rule__VLSTffFormula__Group__9__Impl"
    // InternalVampireLanguage.g:2786:1: rule__VLSTffFormula__Group__9__Impl : ( '.' ) ;
    public final void rule__VLSTffFormula__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2790:1: ( ( '.' ) )
            // InternalVampireLanguage.g:2791:1: ( '.' )
            {
            // InternalVampireLanguage.g:2791:1: ( '.' )
            // InternalVampireLanguage.g:2792:2: '.'
            {
             before(grammarAccess.getVLSTffFormulaAccess().getFullStopKeyword_9()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getVLSTffFormulaAccess().getFullStopKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group__9__Impl"


    // $ANTLR start "rule__VLSTffFormula__Group_7__0"
    // InternalVampireLanguage.g:2802:1: rule__VLSTffFormula__Group_7__0 : rule__VLSTffFormula__Group_7__0__Impl rule__VLSTffFormula__Group_7__1 ;
    public final void rule__VLSTffFormula__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2806:1: ( rule__VLSTffFormula__Group_7__0__Impl rule__VLSTffFormula__Group_7__1 )
            // InternalVampireLanguage.g:2807:2: rule__VLSTffFormula__Group_7__0__Impl rule__VLSTffFormula__Group_7__1
            {
            pushFollow(FOLLOW_29);
            rule__VLSTffFormula__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group_7__0"


    // $ANTLR start "rule__VLSTffFormula__Group_7__0__Impl"
    // InternalVampireLanguage.g:2814:1: rule__VLSTffFormula__Group_7__0__Impl : ( ',' ) ;
    public final void rule__VLSTffFormula__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2818:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2819:1: ( ',' )
            {
            // InternalVampireLanguage.g:2819:1: ( ',' )
            // InternalVampireLanguage.g:2820:2: ','
            {
             before(grammarAccess.getVLSTffFormulaAccess().getCommaKeyword_7_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getVLSTffFormulaAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group_7__0__Impl"


    // $ANTLR start "rule__VLSTffFormula__Group_7__1"
    // InternalVampireLanguage.g:2829:1: rule__VLSTffFormula__Group_7__1 : rule__VLSTffFormula__Group_7__1__Impl ;
    public final void rule__VLSTffFormula__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2833:1: ( rule__VLSTffFormula__Group_7__1__Impl )
            // InternalVampireLanguage.g:2834:2: rule__VLSTffFormula__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group_7__1"


    // $ANTLR start "rule__VLSTffFormula__Group_7__1__Impl"
    // InternalVampireLanguage.g:2840:1: rule__VLSTffFormula__Group_7__1__Impl : ( ( rule__VLSTffFormula__AnnotationsAssignment_7_1 ) ) ;
    public final void rule__VLSTffFormula__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2844:1: ( ( ( rule__VLSTffFormula__AnnotationsAssignment_7_1 ) ) )
            // InternalVampireLanguage.g:2845:1: ( ( rule__VLSTffFormula__AnnotationsAssignment_7_1 ) )
            {
            // InternalVampireLanguage.g:2845:1: ( ( rule__VLSTffFormula__AnnotationsAssignment_7_1 ) )
            // InternalVampireLanguage.g:2846:2: ( rule__VLSTffFormula__AnnotationsAssignment_7_1 )
            {
             before(grammarAccess.getVLSTffFormulaAccess().getAnnotationsAssignment_7_1()); 
            // InternalVampireLanguage.g:2847:2: ( rule__VLSTffFormula__AnnotationsAssignment_7_1 )
            // InternalVampireLanguage.g:2847:3: rule__VLSTffFormula__AnnotationsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__AnnotationsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSTffFormulaAccess().getAnnotationsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__Group_7__1__Impl"


    // $ANTLR start "rule__VLSTffDeclPred__Group_0__0"
    // InternalVampireLanguage.g:2856:1: rule__VLSTffDeclPred__Group_0__0 : rule__VLSTffDeclPred__Group_0__0__Impl rule__VLSTffDeclPred__Group_0__1 ;
    public final void rule__VLSTffDeclPred__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2860:1: ( rule__VLSTffDeclPred__Group_0__0__Impl rule__VLSTffDeclPred__Group_0__1 )
            // InternalVampireLanguage.g:2861:2: rule__VLSTffDeclPred__Group_0__0__Impl rule__VLSTffDeclPred__Group_0__1
            {
            pushFollow(FOLLOW_32);
            rule__VLSTffDeclPred__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSTffDeclPred__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffDeclPred__Group_0__0"


    // $ANTLR start "rule__VLSTffDeclPred__Group_0__0__Impl"
    // InternalVampireLanguage.g:2868:1: rule__VLSTffDeclPred__Group_0__0__Impl : ( 'declare_' ) ;
    public final void rule__VLSTffDeclPred__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2872:1: ( ( 'declare_' ) )
            // InternalVampireLanguage.g:2873:1: ( 'declare_' )
            {
            // InternalVampireLanguage.g:2873:1: ( 'declare_' )
            // InternalVampireLanguage.g:2874:2: 'declare_'
            {
             before(grammarAccess.getVLSTffDeclPredAccess().getDeclare_Keyword_0_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getVLSTffDeclPredAccess().getDeclare_Keyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffDeclPred__Group_0__0__Impl"


    // $ANTLR start "rule__VLSTffDeclPred__Group_0__1"
    // InternalVampireLanguage.g:2883:1: rule__VLSTffDeclPred__Group_0__1 : rule__VLSTffDeclPred__Group_0__1__Impl ;
    public final void rule__VLSTffDeclPred__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2887:1: ( rule__VLSTffDeclPred__Group_0__1__Impl )
            // InternalVampireLanguage.g:2888:2: rule__VLSTffDeclPred__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSTffDeclPred__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffDeclPred__Group_0__1"


    // $ANTLR start "rule__VLSTffDeclPred__Group_0__1__Impl"
    // InternalVampireLanguage.g:2894:1: rule__VLSTffDeclPred__Group_0__1__Impl : ( RULE_DOLLAR_ID ) ;
    public final void rule__VLSTffDeclPred__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2898:1: ( ( RULE_DOLLAR_ID ) )
            // InternalVampireLanguage.g:2899:1: ( RULE_DOLLAR_ID )
            {
            // InternalVampireLanguage.g:2899:1: ( RULE_DOLLAR_ID )
            // InternalVampireLanguage.g:2900:2: RULE_DOLLAR_ID
            {
             before(grammarAccess.getVLSTffDeclPredAccess().getDOLLAR_IDTerminalRuleCall_0_1()); 
            match(input,RULE_DOLLAR_ID,FOLLOW_2); 
             after(grammarAccess.getVLSTffDeclPredAccess().getDOLLAR_IDTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffDeclPred__Group_0__1__Impl"


    // $ANTLR start "rule__VLSAnnotation__Group__0"
    // InternalVampireLanguage.g:2910:1: rule__VLSAnnotation__Group__0 : rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1 ;
    public final void rule__VLSAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2914:1: ( rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1 )
            // InternalVampireLanguage.g:2915:2: rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalVampireLanguage.g:2922:1: rule__VLSAnnotation__Group__0__Impl : ( ( '[' )? ) ;
    public final void rule__VLSAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2926:1: ( ( ( '[' )? ) )
            // InternalVampireLanguage.g:2927:1: ( ( '[' )? )
            {
            // InternalVampireLanguage.g:2927:1: ( ( '[' )? )
            // InternalVampireLanguage.g:2928:2: ( '[' )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getLeftSquareBracketKeyword_0()); 
            // InternalVampireLanguage.g:2929:2: ( '[' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVampireLanguage.g:2929:3: '['
                    {
                    match(input,49,FOLLOW_2); 

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
    // InternalVampireLanguage.g:2937:1: rule__VLSAnnotation__Group__1 : rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2 ;
    public final void rule__VLSAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2941:1: ( rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2 )
            // InternalVampireLanguage.g:2942:2: rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalVampireLanguage.g:2949:1: rule__VLSAnnotation__Group__1__Impl : ( ( rule__VLSAnnotation__NameAssignment_1 )? ) ;
    public final void rule__VLSAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2953:1: ( ( ( rule__VLSAnnotation__NameAssignment_1 )? ) )
            // InternalVampireLanguage.g:2954:1: ( ( rule__VLSAnnotation__NameAssignment_1 )? )
            {
            // InternalVampireLanguage.g:2954:1: ( ( rule__VLSAnnotation__NameAssignment_1 )? )
            // InternalVampireLanguage.g:2955:2: ( rule__VLSAnnotation__NameAssignment_1 )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getNameAssignment_1()); 
            // InternalVampireLanguage.g:2956:2: ( rule__VLSAnnotation__NameAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_LOWER_WORD_ID||LA32_0==RULE_SINGLE_QUOTE||(LA32_0>=24 && LA32_0<=38)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalVampireLanguage.g:2956:3: rule__VLSAnnotation__NameAssignment_1
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
    // InternalVampireLanguage.g:2964:1: rule__VLSAnnotation__Group__2 : rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3 ;
    public final void rule__VLSAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2968:1: ( rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3 )
            // InternalVampireLanguage.g:2969:2: rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalVampireLanguage.g:2976:1: rule__VLSAnnotation__Group__2__Impl : ( ( rule__VLSAnnotation__Group_2__0 )? ) ;
    public final void rule__VLSAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2980:1: ( ( ( rule__VLSAnnotation__Group_2__0 )? ) )
            // InternalVampireLanguage.g:2981:1: ( ( rule__VLSAnnotation__Group_2__0 )? )
            {
            // InternalVampireLanguage.g:2981:1: ( ( rule__VLSAnnotation__Group_2__0 )? )
            // InternalVampireLanguage.g:2982:2: ( rule__VLSAnnotation__Group_2__0 )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getGroup_2()); 
            // InternalVampireLanguage.g:2983:2: ( rule__VLSAnnotation__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==55) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalVampireLanguage.g:2983:3: rule__VLSAnnotation__Group_2__0
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
    // InternalVampireLanguage.g:2991:1: rule__VLSAnnotation__Group__3 : rule__VLSAnnotation__Group__3__Impl ;
    public final void rule__VLSAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2995:1: ( rule__VLSAnnotation__Group__3__Impl )
            // InternalVampireLanguage.g:2996:2: rule__VLSAnnotation__Group__3__Impl
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
    // InternalVampireLanguage.g:3002:1: rule__VLSAnnotation__Group__3__Impl : ( ( ']' )? ) ;
    public final void rule__VLSAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3006:1: ( ( ( ']' )? ) )
            // InternalVampireLanguage.g:3007:1: ( ( ']' )? )
            {
            // InternalVampireLanguage.g:3007:1: ( ( ']' )? )
            // InternalVampireLanguage.g:3008:2: ( ']' )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getRightSquareBracketKeyword_3()); 
            // InternalVampireLanguage.g:3009:2: ( ']' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVampireLanguage.g:3009:3: ']'
                    {
                    match(input,50,FOLLOW_2); 

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
    // InternalVampireLanguage.g:3018:1: rule__VLSAnnotation__Group_2__0 : rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1 ;
    public final void rule__VLSAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3022:1: ( rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1 )
            // InternalVampireLanguage.g:3023:2: rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalVampireLanguage.g:3030:1: rule__VLSAnnotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__VLSAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3034:1: ( ( '(' ) )
            // InternalVampireLanguage.g:3035:1: ( '(' )
            {
            // InternalVampireLanguage.g:3035:1: ( '(' )
            // InternalVampireLanguage.g:3036:2: '('
            {
             before(grammarAccess.getVLSAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3045:1: rule__VLSAnnotation__Group_2__1 : rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2 ;
    public final void rule__VLSAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3049:1: ( rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2 )
            // InternalVampireLanguage.g:3050:2: rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalVampireLanguage.g:3057:1: rule__VLSAnnotation__Group_2__1__Impl : ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) ) ;
    public final void rule__VLSAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3061:1: ( ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) ) )
            // InternalVampireLanguage.g:3062:1: ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) )
            {
            // InternalVampireLanguage.g:3062:1: ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) )
            // InternalVampireLanguage.g:3063:2: ( rule__VLSAnnotation__FollowupAssignment_2_1 )
            {
             before(grammarAccess.getVLSAnnotationAccess().getFollowupAssignment_2_1()); 
            // InternalVampireLanguage.g:3064:2: ( rule__VLSAnnotation__FollowupAssignment_2_1 )
            // InternalVampireLanguage.g:3064:3: rule__VLSAnnotation__FollowupAssignment_2_1
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
    // InternalVampireLanguage.g:3072:1: rule__VLSAnnotation__Group_2__2 : rule__VLSAnnotation__Group_2__2__Impl ;
    public final void rule__VLSAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3076:1: ( rule__VLSAnnotation__Group_2__2__Impl )
            // InternalVampireLanguage.g:3077:2: rule__VLSAnnotation__Group_2__2__Impl
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
    // InternalVampireLanguage.g:3083:1: rule__VLSAnnotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__VLSAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3087:1: ( ( ')' ) )
            // InternalVampireLanguage.g:3088:1: ( ')' )
            {
            // InternalVampireLanguage.g:3088:1: ( ')' )
            // InternalVampireLanguage.g:3089:2: ')'
            {
             before(grammarAccess.getVLSAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3099:1: rule__VLSAnnotationTerms__Group__0 : rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1 ;
    public final void rule__VLSAnnotationTerms__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3103:1: ( rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1 )
            // InternalVampireLanguage.g:3104:2: rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalVampireLanguage.g:3111:1: rule__VLSAnnotationTerms__Group__0__Impl : ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) ) ;
    public final void rule__VLSAnnotationTerms__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3115:1: ( ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) ) )
            // InternalVampireLanguage.g:3116:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) )
            {
            // InternalVampireLanguage.g:3116:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) )
            // InternalVampireLanguage.g:3117:2: ( rule__VLSAnnotationTerms__TermsAssignment_0 )
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getTermsAssignment_0()); 
            // InternalVampireLanguage.g:3118:2: ( rule__VLSAnnotationTerms__TermsAssignment_0 )
            // InternalVampireLanguage.g:3118:3: rule__VLSAnnotationTerms__TermsAssignment_0
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
    // InternalVampireLanguage.g:3126:1: rule__VLSAnnotationTerms__Group__1 : rule__VLSAnnotationTerms__Group__1__Impl ;
    public final void rule__VLSAnnotationTerms__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3130:1: ( rule__VLSAnnotationTerms__Group__1__Impl )
            // InternalVampireLanguage.g:3131:2: rule__VLSAnnotationTerms__Group__1__Impl
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
    // InternalVampireLanguage.g:3137:1: rule__VLSAnnotationTerms__Group__1__Impl : ( ( rule__VLSAnnotationTerms__Group_1__0 )* ) ;
    public final void rule__VLSAnnotationTerms__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3141:1: ( ( ( rule__VLSAnnotationTerms__Group_1__0 )* ) )
            // InternalVampireLanguage.g:3142:1: ( ( rule__VLSAnnotationTerms__Group_1__0 )* )
            {
            // InternalVampireLanguage.g:3142:1: ( ( rule__VLSAnnotationTerms__Group_1__0 )* )
            // InternalVampireLanguage.g:3143:2: ( rule__VLSAnnotationTerms__Group_1__0 )*
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getGroup_1()); 
            // InternalVampireLanguage.g:3144:2: ( rule__VLSAnnotationTerms__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==56) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalVampireLanguage.g:3144:3: rule__VLSAnnotationTerms__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__VLSAnnotationTerms__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalVampireLanguage.g:3153:1: rule__VLSAnnotationTerms__Group_1__0 : rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1 ;
    public final void rule__VLSAnnotationTerms__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3157:1: ( rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1 )
            // InternalVampireLanguage.g:3158:2: rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalVampireLanguage.g:3165:1: rule__VLSAnnotationTerms__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VLSAnnotationTerms__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3169:1: ( ( ',' ) )
            // InternalVampireLanguage.g:3170:1: ( ',' )
            {
            // InternalVampireLanguage.g:3170:1: ( ',' )
            // InternalVampireLanguage.g:3171:2: ','
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getCommaKeyword_1_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3180:1: rule__VLSAnnotationTerms__Group_1__1 : rule__VLSAnnotationTerms__Group_1__1__Impl ;
    public final void rule__VLSAnnotationTerms__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3184:1: ( rule__VLSAnnotationTerms__Group_1__1__Impl )
            // InternalVampireLanguage.g:3185:2: rule__VLSAnnotationTerms__Group_1__1__Impl
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
    // InternalVampireLanguage.g:3191:1: rule__VLSAnnotationTerms__Group_1__1__Impl : ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) ) ;
    public final void rule__VLSAnnotationTerms__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3195:1: ( ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:3196:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:3196:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) )
            // InternalVampireLanguage.g:3197:2: ( rule__VLSAnnotationTerms__TermsAssignment_1_1 )
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getTermsAssignment_1_1()); 
            // InternalVampireLanguage.g:3198:2: ( rule__VLSAnnotationTerms__TermsAssignment_1_1 )
            // InternalVampireLanguage.g:3198:3: rule__VLSAnnotationTerms__TermsAssignment_1_1
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


    // $ANTLR start "rule__VLSOtherDeclaration__Group__0"
    // InternalVampireLanguage.g:3207:1: rule__VLSOtherDeclaration__Group__0 : rule__VLSOtherDeclaration__Group__0__Impl rule__VLSOtherDeclaration__Group__1 ;
    public final void rule__VLSOtherDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3211:1: ( rule__VLSOtherDeclaration__Group__0__Impl rule__VLSOtherDeclaration__Group__1 )
            // InternalVampireLanguage.g:3212:2: rule__VLSOtherDeclaration__Group__0__Impl rule__VLSOtherDeclaration__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__VLSOtherDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSOtherDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSOtherDeclaration__Group__0"


    // $ANTLR start "rule__VLSOtherDeclaration__Group__0__Impl"
    // InternalVampireLanguage.g:3219:1: rule__VLSOtherDeclaration__Group__0__Impl : ( ( rule__VLSOtherDeclaration__NameAssignment_0 ) ) ;
    public final void rule__VLSOtherDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3223:1: ( ( ( rule__VLSOtherDeclaration__NameAssignment_0 ) ) )
            // InternalVampireLanguage.g:3224:1: ( ( rule__VLSOtherDeclaration__NameAssignment_0 ) )
            {
            // InternalVampireLanguage.g:3224:1: ( ( rule__VLSOtherDeclaration__NameAssignment_0 ) )
            // InternalVampireLanguage.g:3225:2: ( rule__VLSOtherDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getVLSOtherDeclarationAccess().getNameAssignment_0()); 
            // InternalVampireLanguage.g:3226:2: ( rule__VLSOtherDeclaration__NameAssignment_0 )
            // InternalVampireLanguage.g:3226:3: rule__VLSOtherDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSOtherDeclaration__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSOtherDeclarationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSOtherDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VLSOtherDeclaration__Group__1"
    // InternalVampireLanguage.g:3234:1: rule__VLSOtherDeclaration__Group__1 : rule__VLSOtherDeclaration__Group__1__Impl rule__VLSOtherDeclaration__Group__2 ;
    public final void rule__VLSOtherDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3238:1: ( rule__VLSOtherDeclaration__Group__1__Impl rule__VLSOtherDeclaration__Group__2 )
            // InternalVampireLanguage.g:3239:2: rule__VLSOtherDeclaration__Group__1__Impl rule__VLSOtherDeclaration__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__VLSOtherDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSOtherDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSOtherDeclaration__Group__1"


    // $ANTLR start "rule__VLSOtherDeclaration__Group__1__Impl"
    // InternalVampireLanguage.g:3246:1: rule__VLSOtherDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__VLSOtherDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3250:1: ( ( ':' ) )
            // InternalVampireLanguage.g:3251:1: ( ':' )
            {
            // InternalVampireLanguage.g:3251:1: ( ':' )
            // InternalVampireLanguage.g:3252:2: ':'
            {
             before(grammarAccess.getVLSOtherDeclarationAccess().getColonKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getVLSOtherDeclarationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSOtherDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VLSOtherDeclaration__Group__2"
    // InternalVampireLanguage.g:3261:1: rule__VLSOtherDeclaration__Group__2 : rule__VLSOtherDeclaration__Group__2__Impl ;
    public final void rule__VLSOtherDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3265:1: ( rule__VLSOtherDeclaration__Group__2__Impl )
            // InternalVampireLanguage.g:3266:2: rule__VLSOtherDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSOtherDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSOtherDeclaration__Group__2"


    // $ANTLR start "rule__VLSOtherDeclaration__Group__2__Impl"
    // InternalVampireLanguage.g:3272:1: rule__VLSOtherDeclaration__Group__2__Impl : ( ( rule__VLSOtherDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__VLSOtherDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3276:1: ( ( ( rule__VLSOtherDeclaration__TypeAssignment_2 ) ) )
            // InternalVampireLanguage.g:3277:1: ( ( rule__VLSOtherDeclaration__TypeAssignment_2 ) )
            {
            // InternalVampireLanguage.g:3277:1: ( ( rule__VLSOtherDeclaration__TypeAssignment_2 ) )
            // InternalVampireLanguage.g:3278:2: ( rule__VLSOtherDeclaration__TypeAssignment_2 )
            {
             before(grammarAccess.getVLSOtherDeclarationAccess().getTypeAssignment_2()); 
            // InternalVampireLanguage.g:3279:2: ( rule__VLSOtherDeclaration__TypeAssignment_2 )
            // InternalVampireLanguage.g:3279:3: rule__VLSOtherDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VLSOtherDeclaration__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVLSOtherDeclarationAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSOtherDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VLSVariableDeclaration__Group__0"
    // InternalVampireLanguage.g:3288:1: rule__VLSVariableDeclaration__Group__0 : rule__VLSVariableDeclaration__Group__0__Impl rule__VLSVariableDeclaration__Group__1 ;
    public final void rule__VLSVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3292:1: ( rule__VLSVariableDeclaration__Group__0__Impl rule__VLSVariableDeclaration__Group__1 )
            // InternalVampireLanguage.g:3293:2: rule__VLSVariableDeclaration__Group__0__Impl rule__VLSVariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__VLSVariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSVariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSVariableDeclaration__Group__0"


    // $ANTLR start "rule__VLSVariableDeclaration__Group__0__Impl"
    // InternalVampireLanguage.g:3300:1: rule__VLSVariableDeclaration__Group__0__Impl : ( ( rule__VLSVariableDeclaration__NameAssignment_0 ) ) ;
    public final void rule__VLSVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3304:1: ( ( ( rule__VLSVariableDeclaration__NameAssignment_0 ) ) )
            // InternalVampireLanguage.g:3305:1: ( ( rule__VLSVariableDeclaration__NameAssignment_0 ) )
            {
            // InternalVampireLanguage.g:3305:1: ( ( rule__VLSVariableDeclaration__NameAssignment_0 ) )
            // InternalVampireLanguage.g:3306:2: ( rule__VLSVariableDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getVLSVariableDeclarationAccess().getNameAssignment_0()); 
            // InternalVampireLanguage.g:3307:2: ( rule__VLSVariableDeclaration__NameAssignment_0 )
            // InternalVampireLanguage.g:3307:3: rule__VLSVariableDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSVariableDeclaration__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSVariableDeclarationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSVariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VLSVariableDeclaration__Group__1"
    // InternalVampireLanguage.g:3315:1: rule__VLSVariableDeclaration__Group__1 : rule__VLSVariableDeclaration__Group__1__Impl rule__VLSVariableDeclaration__Group__2 ;
    public final void rule__VLSVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3319:1: ( rule__VLSVariableDeclaration__Group__1__Impl rule__VLSVariableDeclaration__Group__2 )
            // InternalVampireLanguage.g:3320:2: rule__VLSVariableDeclaration__Group__1__Impl rule__VLSVariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__VLSVariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSVariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSVariableDeclaration__Group__1"


    // $ANTLR start "rule__VLSVariableDeclaration__Group__1__Impl"
    // InternalVampireLanguage.g:3327:1: rule__VLSVariableDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__VLSVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3331:1: ( ( ':' ) )
            // InternalVampireLanguage.g:3332:1: ( ':' )
            {
            // InternalVampireLanguage.g:3332:1: ( ':' )
            // InternalVampireLanguage.g:3333:2: ':'
            {
             before(grammarAccess.getVLSVariableDeclarationAccess().getColonKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getVLSVariableDeclarationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSVariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VLSVariableDeclaration__Group__2"
    // InternalVampireLanguage.g:3342:1: rule__VLSVariableDeclaration__Group__2 : rule__VLSVariableDeclaration__Group__2__Impl ;
    public final void rule__VLSVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3346:1: ( rule__VLSVariableDeclaration__Group__2__Impl )
            // InternalVampireLanguage.g:3347:2: rule__VLSVariableDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSVariableDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSVariableDeclaration__Group__2"


    // $ANTLR start "rule__VLSVariableDeclaration__Group__2__Impl"
    // InternalVampireLanguage.g:3353:1: rule__VLSVariableDeclaration__Group__2__Impl : ( ( rule__VLSVariableDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__VLSVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3357:1: ( ( ( rule__VLSVariableDeclaration__TypeAssignment_2 ) ) )
            // InternalVampireLanguage.g:3358:1: ( ( rule__VLSVariableDeclaration__TypeAssignment_2 ) )
            {
            // InternalVampireLanguage.g:3358:1: ( ( rule__VLSVariableDeclaration__TypeAssignment_2 ) )
            // InternalVampireLanguage.g:3359:2: ( rule__VLSVariableDeclaration__TypeAssignment_2 )
            {
             before(grammarAccess.getVLSVariableDeclarationAccess().getTypeAssignment_2()); 
            // InternalVampireLanguage.g:3360:2: ( rule__VLSVariableDeclaration__TypeAssignment_2 )
            // InternalVampireLanguage.g:3360:3: rule__VLSVariableDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VLSVariableDeclaration__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVLSVariableDeclarationAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSVariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VLSTypeDef__Group__0"
    // InternalVampireLanguage.g:3369:1: rule__VLSTypeDef__Group__0 : rule__VLSTypeDef__Group__0__Impl rule__VLSTypeDef__Group__1 ;
    public final void rule__VLSTypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3373:1: ( rule__VLSTypeDef__Group__0__Impl rule__VLSTypeDef__Group__1 )
            // InternalVampireLanguage.g:3374:2: rule__VLSTypeDef__Group__0__Impl rule__VLSTypeDef__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__VLSTypeDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSTypeDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTypeDef__Group__0"


    // $ANTLR start "rule__VLSTypeDef__Group__0__Impl"
    // InternalVampireLanguage.g:3381:1: rule__VLSTypeDef__Group__0__Impl : ( ( rule__VLSTypeDef__TypeSigAssignment_0 ) ) ;
    public final void rule__VLSTypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3385:1: ( ( ( rule__VLSTypeDef__TypeSigAssignment_0 ) ) )
            // InternalVampireLanguage.g:3386:1: ( ( rule__VLSTypeDef__TypeSigAssignment_0 ) )
            {
            // InternalVampireLanguage.g:3386:1: ( ( rule__VLSTypeDef__TypeSigAssignment_0 ) )
            // InternalVampireLanguage.g:3387:2: ( rule__VLSTypeDef__TypeSigAssignment_0 )
            {
             before(grammarAccess.getVLSTypeDefAccess().getTypeSigAssignment_0()); 
            // InternalVampireLanguage.g:3388:2: ( rule__VLSTypeDef__TypeSigAssignment_0 )
            // InternalVampireLanguage.g:3388:3: rule__VLSTypeDef__TypeSigAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSTypeDef__TypeSigAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSTypeDefAccess().getTypeSigAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTypeDef__Group__0__Impl"


    // $ANTLR start "rule__VLSTypeDef__Group__1"
    // InternalVampireLanguage.g:3396:1: rule__VLSTypeDef__Group__1 : rule__VLSTypeDef__Group__1__Impl ;
    public final void rule__VLSTypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3400:1: ( rule__VLSTypeDef__Group__1__Impl )
            // InternalVampireLanguage.g:3401:2: rule__VLSTypeDef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSTypeDef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTypeDef__Group__1"


    // $ANTLR start "rule__VLSTypeDef__Group__1__Impl"
    // InternalVampireLanguage.g:3407:1: rule__VLSTypeDef__Group__1__Impl : ( ( rule__VLSTypeDef__Group_1__0 )? ) ;
    public final void rule__VLSTypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3411:1: ( ( ( rule__VLSTypeDef__Group_1__0 )? ) )
            // InternalVampireLanguage.g:3412:1: ( ( rule__VLSTypeDef__Group_1__0 )? )
            {
            // InternalVampireLanguage.g:3412:1: ( ( rule__VLSTypeDef__Group_1__0 )? )
            // InternalVampireLanguage.g:3413:2: ( rule__VLSTypeDef__Group_1__0 )?
            {
             before(grammarAccess.getVLSTypeDefAccess().getGroup_1()); 
            // InternalVampireLanguage.g:3414:2: ( rule__VLSTypeDef__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==62) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalVampireLanguage.g:3414:3: rule__VLSTypeDef__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSTypeDef__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVLSTypeDefAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTypeDef__Group__1__Impl"


    // $ANTLR start "rule__VLSTypeDef__Group_1__0"
    // InternalVampireLanguage.g:3423:1: rule__VLSTypeDef__Group_1__0 : rule__VLSTypeDef__Group_1__0__Impl rule__VLSTypeDef__Group_1__1 ;
    public final void rule__VLSTypeDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3427:1: ( rule__VLSTypeDef__Group_1__0__Impl rule__VLSTypeDef__Group_1__1 )
            // InternalVampireLanguage.g:3428:2: rule__VLSTypeDef__Group_1__0__Impl rule__VLSTypeDef__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__VLSTypeDef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSTypeDef__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTypeDef__Group_1__0"


    // $ANTLR start "rule__VLSTypeDef__Group_1__0__Impl"
    // InternalVampireLanguage.g:3435:1: rule__VLSTypeDef__Group_1__0__Impl : ( '>' ) ;
    public final void rule__VLSTypeDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3439:1: ( ( '>' ) )
            // InternalVampireLanguage.g:3440:1: ( '>' )
            {
            // InternalVampireLanguage.g:3440:1: ( '>' )
            // InternalVampireLanguage.g:3441:2: '>'
            {
             before(grammarAccess.getVLSTypeDefAccess().getGreaterThanSignKeyword_1_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getVLSTypeDefAccess().getGreaterThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTypeDef__Group_1__0__Impl"


    // $ANTLR start "rule__VLSTypeDef__Group_1__1"
    // InternalVampireLanguage.g:3450:1: rule__VLSTypeDef__Group_1__1 : rule__VLSTypeDef__Group_1__1__Impl ;
    public final void rule__VLSTypeDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3454:1: ( rule__VLSTypeDef__Group_1__1__Impl )
            // InternalVampireLanguage.g:3455:2: rule__VLSTypeDef__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSTypeDef__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTypeDef__Group_1__1"


    // $ANTLR start "rule__VLSTypeDef__Group_1__1__Impl"
    // InternalVampireLanguage.g:3461:1: rule__VLSTypeDef__Group_1__1__Impl : ( ( rule__VLSTypeDef__MapsToAssignment_1_1 ) ) ;
    public final void rule__VLSTypeDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3465:1: ( ( ( rule__VLSTypeDef__MapsToAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:3466:1: ( ( rule__VLSTypeDef__MapsToAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:3466:1: ( ( rule__VLSTypeDef__MapsToAssignment_1_1 ) )
            // InternalVampireLanguage.g:3467:2: ( rule__VLSTypeDef__MapsToAssignment_1_1 )
            {
             before(grammarAccess.getVLSTypeDefAccess().getMapsToAssignment_1_1()); 
            // InternalVampireLanguage.g:3468:2: ( rule__VLSTypeDef__MapsToAssignment_1_1 )
            // InternalVampireLanguage.g:3468:3: rule__VLSTypeDef__MapsToAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSTypeDef__MapsToAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSTypeDefAccess().getMapsToAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTypeDef__Group_1__1__Impl"


    // $ANTLR start "rule__VLSUnitaryTerm__Group__0"
    // InternalVampireLanguage.g:3477:1: rule__VLSUnitaryTerm__Group__0 : rule__VLSUnitaryTerm__Group__0__Impl rule__VLSUnitaryTerm__Group__1 ;
    public final void rule__VLSUnitaryTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3481:1: ( rule__VLSUnitaryTerm__Group__0__Impl rule__VLSUnitaryTerm__Group__1 )
            // InternalVampireLanguage.g:3482:2: rule__VLSUnitaryTerm__Group__0__Impl rule__VLSUnitaryTerm__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__VLSUnitaryTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUnitaryTerm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnitaryTerm__Group__0"


    // $ANTLR start "rule__VLSUnitaryTerm__Group__0__Impl"
    // InternalVampireLanguage.g:3489:1: rule__VLSUnitaryTerm__Group__0__Impl : ( ( rule__VLSUnitaryTerm__InitTypeAssignment_0 ) ) ;
    public final void rule__VLSUnitaryTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3493:1: ( ( ( rule__VLSUnitaryTerm__InitTypeAssignment_0 ) ) )
            // InternalVampireLanguage.g:3494:1: ( ( rule__VLSUnitaryTerm__InitTypeAssignment_0 ) )
            {
            // InternalVampireLanguage.g:3494:1: ( ( rule__VLSUnitaryTerm__InitTypeAssignment_0 ) )
            // InternalVampireLanguage.g:3495:2: ( rule__VLSUnitaryTerm__InitTypeAssignment_0 )
            {
             before(grammarAccess.getVLSUnitaryTermAccess().getInitTypeAssignment_0()); 
            // InternalVampireLanguage.g:3496:2: ( rule__VLSUnitaryTerm__InitTypeAssignment_0 )
            // InternalVampireLanguage.g:3496:3: rule__VLSUnitaryTerm__InitTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnitaryTerm__InitTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSUnitaryTermAccess().getInitTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnitaryTerm__Group__0__Impl"


    // $ANTLR start "rule__VLSUnitaryTerm__Group__1"
    // InternalVampireLanguage.g:3504:1: rule__VLSUnitaryTerm__Group__1 : rule__VLSUnitaryTerm__Group__1__Impl ;
    public final void rule__VLSUnitaryTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3508:1: ( rule__VLSUnitaryTerm__Group__1__Impl )
            // InternalVampireLanguage.g:3509:2: rule__VLSUnitaryTerm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnitaryTerm__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnitaryTerm__Group__1"


    // $ANTLR start "rule__VLSUnitaryTerm__Group__1__Impl"
    // InternalVampireLanguage.g:3515:1: rule__VLSUnitaryTerm__Group__1__Impl : ( ( rule__VLSUnitaryTerm__Group_1__0 )* ) ;
    public final void rule__VLSUnitaryTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3519:1: ( ( ( rule__VLSUnitaryTerm__Group_1__0 )* ) )
            // InternalVampireLanguage.g:3520:1: ( ( rule__VLSUnitaryTerm__Group_1__0 )* )
            {
            // InternalVampireLanguage.g:3520:1: ( ( rule__VLSUnitaryTerm__Group_1__0 )* )
            // InternalVampireLanguage.g:3521:2: ( rule__VLSUnitaryTerm__Group_1__0 )*
            {
             before(grammarAccess.getVLSUnitaryTermAccess().getGroup_1()); 
            // InternalVampireLanguage.g:3522:2: ( rule__VLSUnitaryTerm__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==63) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalVampireLanguage.g:3522:3: rule__VLSUnitaryTerm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__VLSUnitaryTerm__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getVLSUnitaryTermAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnitaryTerm__Group__1__Impl"


    // $ANTLR start "rule__VLSUnitaryTerm__Group_1__0"
    // InternalVampireLanguage.g:3531:1: rule__VLSUnitaryTerm__Group_1__0 : rule__VLSUnitaryTerm__Group_1__0__Impl rule__VLSUnitaryTerm__Group_1__1 ;
    public final void rule__VLSUnitaryTerm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3535:1: ( rule__VLSUnitaryTerm__Group_1__0__Impl rule__VLSUnitaryTerm__Group_1__1 )
            // InternalVampireLanguage.g:3536:2: rule__VLSUnitaryTerm__Group_1__0__Impl rule__VLSUnitaryTerm__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__VLSUnitaryTerm__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSUnitaryTerm__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnitaryTerm__Group_1__0"


    // $ANTLR start "rule__VLSUnitaryTerm__Group_1__0__Impl"
    // InternalVampireLanguage.g:3543:1: rule__VLSUnitaryTerm__Group_1__0__Impl : ( '*' ) ;
    public final void rule__VLSUnitaryTerm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3547:1: ( ( '*' ) )
            // InternalVampireLanguage.g:3548:1: ( '*' )
            {
            // InternalVampireLanguage.g:3548:1: ( '*' )
            // InternalVampireLanguage.g:3549:2: '*'
            {
             before(grammarAccess.getVLSUnitaryTermAccess().getAsteriskKeyword_1_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getVLSUnitaryTermAccess().getAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnitaryTerm__Group_1__0__Impl"


    // $ANTLR start "rule__VLSUnitaryTerm__Group_1__1"
    // InternalVampireLanguage.g:3558:1: rule__VLSUnitaryTerm__Group_1__1 : rule__VLSUnitaryTerm__Group_1__1__Impl ;
    public final void rule__VLSUnitaryTerm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3562:1: ( rule__VLSUnitaryTerm__Group_1__1__Impl )
            // InternalVampireLanguage.g:3563:2: rule__VLSUnitaryTerm__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnitaryTerm__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnitaryTerm__Group_1__1"


    // $ANTLR start "rule__VLSUnitaryTerm__Group_1__1__Impl"
    // InternalVampireLanguage.g:3569:1: rule__VLSUnitaryTerm__Group_1__1__Impl : ( ( rule__VLSUnitaryTerm__NextTypeAssignment_1_1 ) ) ;
    public final void rule__VLSUnitaryTerm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3573:1: ( ( ( rule__VLSUnitaryTerm__NextTypeAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:3574:1: ( ( rule__VLSUnitaryTerm__NextTypeAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:3574:1: ( ( rule__VLSUnitaryTerm__NextTypeAssignment_1_1 ) )
            // InternalVampireLanguage.g:3575:2: ( rule__VLSUnitaryTerm__NextTypeAssignment_1_1 )
            {
             before(grammarAccess.getVLSUnitaryTermAccess().getNextTypeAssignment_1_1()); 
            // InternalVampireLanguage.g:3576:2: ( rule__VLSUnitaryTerm__NextTypeAssignment_1_1 )
            // InternalVampireLanguage.g:3576:3: rule__VLSUnitaryTerm__NextTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSUnitaryTerm__NextTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSUnitaryTermAccess().getNextTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnitaryTerm__Group_1__1__Impl"


    // $ANTLR start "rule__VLSBinary__Group__0"
    // InternalVampireLanguage.g:3585:1: rule__VLSBinary__Group__0 : rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1 ;
    public final void rule__VLSBinary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3589:1: ( rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1 )
            // InternalVampireLanguage.g:3590:2: rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalVampireLanguage.g:3597:1: rule__VLSBinary__Group__0__Impl : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3601:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:3602:1: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:3602:1: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:3603:2: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:3612:1: rule__VLSBinary__Group__1 : rule__VLSBinary__Group__1__Impl ;
    public final void rule__VLSBinary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3616:1: ( rule__VLSBinary__Group__1__Impl )
            // InternalVampireLanguage.g:3617:2: rule__VLSBinary__Group__1__Impl
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
    // InternalVampireLanguage.g:3623:1: rule__VLSBinary__Group__1__Impl : ( ( rule__VLSBinary__Alternatives_1 )? ) ;
    public final void rule__VLSBinary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3627:1: ( ( ( rule__VLSBinary__Alternatives_1 )? ) )
            // InternalVampireLanguage.g:3628:1: ( ( rule__VLSBinary__Alternatives_1 )? )
            {
            // InternalVampireLanguage.g:3628:1: ( ( rule__VLSBinary__Alternatives_1 )? )
            // InternalVampireLanguage.g:3629:2: ( rule__VLSBinary__Alternatives_1 )?
            {
             before(grammarAccess.getVLSBinaryAccess().getAlternatives_1()); 
            // InternalVampireLanguage.g:3630:2: ( rule__VLSBinary__Alternatives_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=64 && LA38_0<=71)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalVampireLanguage.g:3630:3: rule__VLSBinary__Alternatives_1
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
    // InternalVampireLanguage.g:3639:1: rule__VLSBinary__Group_1_0__0 : rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1 ;
    public final void rule__VLSBinary__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3643:1: ( rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1 )
            // InternalVampireLanguage.g:3644:2: rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalVampireLanguage.g:3651:1: rule__VLSBinary__Group_1_0__0__Impl : ( ( rule__VLSBinary__Alternatives_1_0_0 ) ) ;
    public final void rule__VLSBinary__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3655:1: ( ( ( rule__VLSBinary__Alternatives_1_0_0 ) ) )
            // InternalVampireLanguage.g:3656:1: ( ( rule__VLSBinary__Alternatives_1_0_0 ) )
            {
            // InternalVampireLanguage.g:3656:1: ( ( rule__VLSBinary__Alternatives_1_0_0 ) )
            // InternalVampireLanguage.g:3657:2: ( rule__VLSBinary__Alternatives_1_0_0 )
            {
             before(grammarAccess.getVLSBinaryAccess().getAlternatives_1_0_0()); 
            // InternalVampireLanguage.g:3658:2: ( rule__VLSBinary__Alternatives_1_0_0 )
            // InternalVampireLanguage.g:3658:3: rule__VLSBinary__Alternatives_1_0_0
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
    // InternalVampireLanguage.g:3666:1: rule__VLSBinary__Group_1_0__1 : rule__VLSBinary__Group_1_0__1__Impl ;
    public final void rule__VLSBinary__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3670:1: ( rule__VLSBinary__Group_1_0__1__Impl )
            // InternalVampireLanguage.g:3671:2: rule__VLSBinary__Group_1_0__1__Impl
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
    // InternalVampireLanguage.g:3677:1: rule__VLSBinary__Group_1_0__1__Impl : ( ( rule__VLSBinary__RightAssignment_1_0_1 ) ) ;
    public final void rule__VLSBinary__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3681:1: ( ( ( rule__VLSBinary__RightAssignment_1_0_1 ) ) )
            // InternalVampireLanguage.g:3682:1: ( ( rule__VLSBinary__RightAssignment_1_0_1 ) )
            {
            // InternalVampireLanguage.g:3682:1: ( ( rule__VLSBinary__RightAssignment_1_0_1 ) )
            // InternalVampireLanguage.g:3683:2: ( rule__VLSBinary__RightAssignment_1_0_1 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_0_1()); 
            // InternalVampireLanguage.g:3684:2: ( rule__VLSBinary__RightAssignment_1_0_1 )
            // InternalVampireLanguage.g:3684:3: rule__VLSBinary__RightAssignment_1_0_1
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
    // InternalVampireLanguage.g:3693:1: rule__VLSBinary__Group_1_0_0_0__0 : rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1 ;
    public final void rule__VLSBinary__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3697:1: ( rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1 )
            // InternalVampireLanguage.g:3698:2: rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalVampireLanguage.g:3705:1: rule__VLSBinary__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3709:1: ( ( () ) )
            // InternalVampireLanguage.g:3710:1: ( () )
            {
            // InternalVampireLanguage.g:3710:1: ( () )
            // InternalVampireLanguage.g:3711:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSEquivalentLeftAction_1_0_0_0_0()); 
            // InternalVampireLanguage.g:3712:2: ()
            // InternalVampireLanguage.g:3712:3: 
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
    // InternalVampireLanguage.g:3720:1: rule__VLSBinary__Group_1_0_0_0__1 : rule__VLSBinary__Group_1_0_0_0__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3724:1: ( rule__VLSBinary__Group_1_0_0_0__1__Impl )
            // InternalVampireLanguage.g:3725:2: rule__VLSBinary__Group_1_0_0_0__1__Impl
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
    // InternalVampireLanguage.g:3731:1: rule__VLSBinary__Group_1_0_0_0__1__Impl : ( '<=>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3735:1: ( ( '<=>' ) )
            // InternalVampireLanguage.g:3736:1: ( '<=>' )
            {
            // InternalVampireLanguage.g:3736:1: ( '<=>' )
            // InternalVampireLanguage.g:3737:2: '<=>'
            {
             before(grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_0_1()); 
            match(input,64,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3747:1: rule__VLSBinary__Group_1_0_0_1__0 : rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1 ;
    public final void rule__VLSBinary__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3751:1: ( rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1 )
            // InternalVampireLanguage.g:3752:2: rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalVampireLanguage.g:3759:1: rule__VLSBinary__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3763:1: ( ( () ) )
            // InternalVampireLanguage.g:3764:1: ( () )
            {
            // InternalVampireLanguage.g:3764:1: ( () )
            // InternalVampireLanguage.g:3765:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSImpliesLeftAction_1_0_0_1_0()); 
            // InternalVampireLanguage.g:3766:2: ()
            // InternalVampireLanguage.g:3766:3: 
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
    // InternalVampireLanguage.g:3774:1: rule__VLSBinary__Group_1_0_0_1__1 : rule__VLSBinary__Group_1_0_0_1__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3778:1: ( rule__VLSBinary__Group_1_0_0_1__1__Impl )
            // InternalVampireLanguage.g:3779:2: rule__VLSBinary__Group_1_0_0_1__1__Impl
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
    // InternalVampireLanguage.g:3785:1: rule__VLSBinary__Group_1_0_0_1__1__Impl : ( '=>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3789:1: ( ( '=>' ) )
            // InternalVampireLanguage.g:3790:1: ( '=>' )
            {
            // InternalVampireLanguage.g:3790:1: ( '=>' )
            // InternalVampireLanguage.g:3791:2: '=>'
            {
             before(grammarAccess.getVLSBinaryAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3801:1: rule__VLSBinary__Group_1_0_0_2__0 : rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1 ;
    public final void rule__VLSBinary__Group_1_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3805:1: ( rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1 )
            // InternalVampireLanguage.g:3806:2: rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalVampireLanguage.g:3813:1: rule__VLSBinary__Group_1_0_0_2__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3817:1: ( ( () ) )
            // InternalVampireLanguage.g:3818:1: ( () )
            {
            // InternalVampireLanguage.g:3818:1: ( () )
            // InternalVampireLanguage.g:3819:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSRevImpliesLeftAction_1_0_0_2_0()); 
            // InternalVampireLanguage.g:3820:2: ()
            // InternalVampireLanguage.g:3820:3: 
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
    // InternalVampireLanguage.g:3828:1: rule__VLSBinary__Group_1_0_0_2__1 : rule__VLSBinary__Group_1_0_0_2__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3832:1: ( rule__VLSBinary__Group_1_0_0_2__1__Impl )
            // InternalVampireLanguage.g:3833:2: rule__VLSBinary__Group_1_0_0_2__1__Impl
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
    // InternalVampireLanguage.g:3839:1: rule__VLSBinary__Group_1_0_0_2__1__Impl : ( '<=' ) ;
    public final void rule__VLSBinary__Group_1_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3843:1: ( ( '<=' ) )
            // InternalVampireLanguage.g:3844:1: ( '<=' )
            {
            // InternalVampireLanguage.g:3844:1: ( '<=' )
            // InternalVampireLanguage.g:3845:2: '<='
            {
             before(grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignKeyword_1_0_0_2_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3855:1: rule__VLSBinary__Group_1_0_0_3__0 : rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1 ;
    public final void rule__VLSBinary__Group_1_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3859:1: ( rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1 )
            // InternalVampireLanguage.g:3860:2: rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalVampireLanguage.g:3867:1: rule__VLSBinary__Group_1_0_0_3__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3871:1: ( ( () ) )
            // InternalVampireLanguage.g:3872:1: ( () )
            {
            // InternalVampireLanguage.g:3872:1: ( () )
            // InternalVampireLanguage.g:3873:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSXnorLeftAction_1_0_0_3_0()); 
            // InternalVampireLanguage.g:3874:2: ()
            // InternalVampireLanguage.g:3874:3: 
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
    // InternalVampireLanguage.g:3882:1: rule__VLSBinary__Group_1_0_0_3__1 : rule__VLSBinary__Group_1_0_0_3__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3886:1: ( rule__VLSBinary__Group_1_0_0_3__1__Impl )
            // InternalVampireLanguage.g:3887:2: rule__VLSBinary__Group_1_0_0_3__1__Impl
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
    // InternalVampireLanguage.g:3893:1: rule__VLSBinary__Group_1_0_0_3__1__Impl : ( '<~>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3897:1: ( ( '<~>' ) )
            // InternalVampireLanguage.g:3898:1: ( '<~>' )
            {
            // InternalVampireLanguage.g:3898:1: ( '<~>' )
            // InternalVampireLanguage.g:3899:2: '<~>'
            {
             before(grammarAccess.getVLSBinaryAccess().getLessThanSignTildeGreaterThanSignKeyword_1_0_0_3_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3909:1: rule__VLSBinary__Group_1_0_0_4__0 : rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1 ;
    public final void rule__VLSBinary__Group_1_0_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3913:1: ( rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1 )
            // InternalVampireLanguage.g:3914:2: rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalVampireLanguage.g:3921:1: rule__VLSBinary__Group_1_0_0_4__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3925:1: ( ( () ) )
            // InternalVampireLanguage.g:3926:1: ( () )
            {
            // InternalVampireLanguage.g:3926:1: ( () )
            // InternalVampireLanguage.g:3927:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSNorLeftAction_1_0_0_4_0()); 
            // InternalVampireLanguage.g:3928:2: ()
            // InternalVampireLanguage.g:3928:3: 
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
    // InternalVampireLanguage.g:3936:1: rule__VLSBinary__Group_1_0_0_4__1 : rule__VLSBinary__Group_1_0_0_4__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3940:1: ( rule__VLSBinary__Group_1_0_0_4__1__Impl )
            // InternalVampireLanguage.g:3941:2: rule__VLSBinary__Group_1_0_0_4__1__Impl
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
    // InternalVampireLanguage.g:3947:1: rule__VLSBinary__Group_1_0_0_4__1__Impl : ( '~|' ) ;
    public final void rule__VLSBinary__Group_1_0_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3951:1: ( ( '~|' ) )
            // InternalVampireLanguage.g:3952:1: ( '~|' )
            {
            // InternalVampireLanguage.g:3952:1: ( '~|' )
            // InternalVampireLanguage.g:3953:2: '~|'
            {
             before(grammarAccess.getVLSBinaryAccess().getTildeVerticalLineKeyword_1_0_0_4_1()); 
            match(input,68,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3963:1: rule__VLSBinary__Group_1_0_0_5__0 : rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1 ;
    public final void rule__VLSBinary__Group_1_0_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3967:1: ( rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1 )
            // InternalVampireLanguage.g:3968:2: rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalVampireLanguage.g:3975:1: rule__VLSBinary__Group_1_0_0_5__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3979:1: ( ( () ) )
            // InternalVampireLanguage.g:3980:1: ( () )
            {
            // InternalVampireLanguage.g:3980:1: ( () )
            // InternalVampireLanguage.g:3981:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSNandLeftAction_1_0_0_5_0()); 
            // InternalVampireLanguage.g:3982:2: ()
            // InternalVampireLanguage.g:3982:3: 
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
    // InternalVampireLanguage.g:3990:1: rule__VLSBinary__Group_1_0_0_5__1 : rule__VLSBinary__Group_1_0_0_5__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3994:1: ( rule__VLSBinary__Group_1_0_0_5__1__Impl )
            // InternalVampireLanguage.g:3995:2: rule__VLSBinary__Group_1_0_0_5__1__Impl
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
    // InternalVampireLanguage.g:4001:1: rule__VLSBinary__Group_1_0_0_5__1__Impl : ( '~&' ) ;
    public final void rule__VLSBinary__Group_1_0_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4005:1: ( ( '~&' ) )
            // InternalVampireLanguage.g:4006:1: ( '~&' )
            {
            // InternalVampireLanguage.g:4006:1: ( '~&' )
            // InternalVampireLanguage.g:4007:2: '~&'
            {
             before(grammarAccess.getVLSBinaryAccess().getTildeAmpersandKeyword_1_0_0_5_1()); 
            match(input,69,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4017:1: rule__VLSBinary__Group_1_1__0 : rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1 ;
    public final void rule__VLSBinary__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4021:1: ( rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1 )
            // InternalVampireLanguage.g:4022:2: rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalVampireLanguage.g:4029:1: rule__VLSBinary__Group_1_1__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4033:1: ( ( () ) )
            // InternalVampireLanguage.g:4034:1: ( () )
            {
            // InternalVampireLanguage.g:4034:1: ( () )
            // InternalVampireLanguage.g:4035:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSAndLeftAction_1_1_0()); 
            // InternalVampireLanguage.g:4036:2: ()
            // InternalVampireLanguage.g:4036:3: 
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
    // InternalVampireLanguage.g:4044:1: rule__VLSBinary__Group_1_1__1 : rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2 ;
    public final void rule__VLSBinary__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4048:1: ( rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2 )
            // InternalVampireLanguage.g:4049:2: rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalVampireLanguage.g:4056:1: rule__VLSBinary__Group_1_1__1__Impl : ( '&' ) ;
    public final void rule__VLSBinary__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4060:1: ( ( '&' ) )
            // InternalVampireLanguage.g:4061:1: ( '&' )
            {
            // InternalVampireLanguage.g:4061:1: ( '&' )
            // InternalVampireLanguage.g:4062:2: '&'
            {
             before(grammarAccess.getVLSBinaryAccess().getAmpersandKeyword_1_1_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4071:1: rule__VLSBinary__Group_1_1__2 : rule__VLSBinary__Group_1_1__2__Impl ;
    public final void rule__VLSBinary__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4075:1: ( rule__VLSBinary__Group_1_1__2__Impl )
            // InternalVampireLanguage.g:4076:2: rule__VLSBinary__Group_1_1__2__Impl
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
    // InternalVampireLanguage.g:4082:1: rule__VLSBinary__Group_1_1__2__Impl : ( ( rule__VLSBinary__RightAssignment_1_1_2 ) ) ;
    public final void rule__VLSBinary__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4086:1: ( ( ( rule__VLSBinary__RightAssignment_1_1_2 ) ) )
            // InternalVampireLanguage.g:4087:1: ( ( rule__VLSBinary__RightAssignment_1_1_2 ) )
            {
            // InternalVampireLanguage.g:4087:1: ( ( rule__VLSBinary__RightAssignment_1_1_2 ) )
            // InternalVampireLanguage.g:4088:2: ( rule__VLSBinary__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_1_2()); 
            // InternalVampireLanguage.g:4089:2: ( rule__VLSBinary__RightAssignment_1_1_2 )
            // InternalVampireLanguage.g:4089:3: rule__VLSBinary__RightAssignment_1_1_2
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
    // InternalVampireLanguage.g:4098:1: rule__VLSBinary__Group_1_2__0 : rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1 ;
    public final void rule__VLSBinary__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4102:1: ( rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1 )
            // InternalVampireLanguage.g:4103:2: rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalVampireLanguage.g:4110:1: rule__VLSBinary__Group_1_2__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4114:1: ( ( () ) )
            // InternalVampireLanguage.g:4115:1: ( () )
            {
            // InternalVampireLanguage.g:4115:1: ( () )
            // InternalVampireLanguage.g:4116:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSOrLeftAction_1_2_0()); 
            // InternalVampireLanguage.g:4117:2: ()
            // InternalVampireLanguage.g:4117:3: 
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
    // InternalVampireLanguage.g:4125:1: rule__VLSBinary__Group_1_2__1 : rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2 ;
    public final void rule__VLSBinary__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4129:1: ( rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2 )
            // InternalVampireLanguage.g:4130:2: rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalVampireLanguage.g:4137:1: rule__VLSBinary__Group_1_2__1__Impl : ( '|' ) ;
    public final void rule__VLSBinary__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4141:1: ( ( '|' ) )
            // InternalVampireLanguage.g:4142:1: ( '|' )
            {
            // InternalVampireLanguage.g:4142:1: ( '|' )
            // InternalVampireLanguage.g:4143:2: '|'
            {
             before(grammarAccess.getVLSBinaryAccess().getVerticalLineKeyword_1_2_1()); 
            match(input,71,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4152:1: rule__VLSBinary__Group_1_2__2 : rule__VLSBinary__Group_1_2__2__Impl ;
    public final void rule__VLSBinary__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4156:1: ( rule__VLSBinary__Group_1_2__2__Impl )
            // InternalVampireLanguage.g:4157:2: rule__VLSBinary__Group_1_2__2__Impl
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
    // InternalVampireLanguage.g:4163:1: rule__VLSBinary__Group_1_2__2__Impl : ( ( rule__VLSBinary__RightAssignment_1_2_2 ) ) ;
    public final void rule__VLSBinary__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4167:1: ( ( ( rule__VLSBinary__RightAssignment_1_2_2 ) ) )
            // InternalVampireLanguage.g:4168:1: ( ( rule__VLSBinary__RightAssignment_1_2_2 ) )
            {
            // InternalVampireLanguage.g:4168:1: ( ( rule__VLSBinary__RightAssignment_1_2_2 ) )
            // InternalVampireLanguage.g:4169:2: ( rule__VLSBinary__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_2_2()); 
            // InternalVampireLanguage.g:4170:2: ( rule__VLSBinary__RightAssignment_1_2_2 )
            // InternalVampireLanguage.g:4170:3: rule__VLSBinary__RightAssignment_1_2_2
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
    // InternalVampireLanguage.g:4179:1: rule__VLSUnitaryFormula__Group_4__0 : rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1 ;
    public final void rule__VLSUnitaryFormula__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4183:1: ( rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1 )
            // InternalVampireLanguage.g:4184:2: rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalVampireLanguage.g:4191:1: rule__VLSUnitaryFormula__Group_4__0__Impl : ( '(' ) ;
    public final void rule__VLSUnitaryFormula__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4195:1: ( ( '(' ) )
            // InternalVampireLanguage.g:4196:1: ( '(' )
            {
            // InternalVampireLanguage.g:4196:1: ( '(' )
            // InternalVampireLanguage.g:4197:2: '('
            {
             before(grammarAccess.getVLSUnitaryFormulaAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4206:1: rule__VLSUnitaryFormula__Group_4__1 : rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2 ;
    public final void rule__VLSUnitaryFormula__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4210:1: ( rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2 )
            // InternalVampireLanguage.g:4211:2: rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalVampireLanguage.g:4218:1: rule__VLSUnitaryFormula__Group_4__1__Impl : ( ruleVLSTerm ) ;
    public final void rule__VLSUnitaryFormula__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4222:1: ( ( ruleVLSTerm ) )
            // InternalVampireLanguage.g:4223:1: ( ruleVLSTerm )
            {
            // InternalVampireLanguage.g:4223:1: ( ruleVLSTerm )
            // InternalVampireLanguage.g:4224:2: ruleVLSTerm
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
    // InternalVampireLanguage.g:4233:1: rule__VLSUnitaryFormula__Group_4__2 : rule__VLSUnitaryFormula__Group_4__2__Impl ;
    public final void rule__VLSUnitaryFormula__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4237:1: ( rule__VLSUnitaryFormula__Group_4__2__Impl )
            // InternalVampireLanguage.g:4238:2: rule__VLSUnitaryFormula__Group_4__2__Impl
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
    // InternalVampireLanguage.g:4244:1: rule__VLSUnitaryFormula__Group_4__2__Impl : ( ')' ) ;
    public final void rule__VLSUnitaryFormula__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4248:1: ( ( ')' ) )
            // InternalVampireLanguage.g:4249:1: ( ')' )
            {
            // InternalVampireLanguage.g:4249:1: ( ')' )
            // InternalVampireLanguage.g:4250:2: ')'
            {
             before(grammarAccess.getVLSUnitaryFormulaAccess().getRightParenthesisKeyword_4_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4260:1: rule__VLSUniversalQuantifier__Group__0 : rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1 ;
    public final void rule__VLSUniversalQuantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4264:1: ( rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1 )
            // InternalVampireLanguage.g:4265:2: rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalVampireLanguage.g:4272:1: rule__VLSUniversalQuantifier__Group__0__Impl : ( () ) ;
    public final void rule__VLSUniversalQuantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4276:1: ( ( () ) )
            // InternalVampireLanguage.g:4277:1: ( () )
            {
            // InternalVampireLanguage.g:4277:1: ( () )
            // InternalVampireLanguage.g:4278:2: ()
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVLSUniversalQuantifierAction_0()); 
            // InternalVampireLanguage.g:4279:2: ()
            // InternalVampireLanguage.g:4279:3: 
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
    // InternalVampireLanguage.g:4287:1: rule__VLSUniversalQuantifier__Group__1 : rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2 ;
    public final void rule__VLSUniversalQuantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4291:1: ( rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2 )
            // InternalVampireLanguage.g:4292:2: rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalVampireLanguage.g:4299:1: rule__VLSUniversalQuantifier__Group__1__Impl : ( ( rule__VLSUniversalQuantifier__Group_1__0 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4303:1: ( ( ( rule__VLSUniversalQuantifier__Group_1__0 ) ) )
            // InternalVampireLanguage.g:4304:1: ( ( rule__VLSUniversalQuantifier__Group_1__0 ) )
            {
            // InternalVampireLanguage.g:4304:1: ( ( rule__VLSUniversalQuantifier__Group_1__0 ) )
            // InternalVampireLanguage.g:4305:2: ( rule__VLSUniversalQuantifier__Group_1__0 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup_1()); 
            // InternalVampireLanguage.g:4306:2: ( rule__VLSUniversalQuantifier__Group_1__0 )
            // InternalVampireLanguage.g:4306:3: rule__VLSUniversalQuantifier__Group_1__0
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
    // InternalVampireLanguage.g:4314:1: rule__VLSUniversalQuantifier__Group__2 : rule__VLSUniversalQuantifier__Group__2__Impl ;
    public final void rule__VLSUniversalQuantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4318:1: ( rule__VLSUniversalQuantifier__Group__2__Impl )
            // InternalVampireLanguage.g:4319:2: rule__VLSUniversalQuantifier__Group__2__Impl
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
    // InternalVampireLanguage.g:4325:1: rule__VLSUniversalQuantifier__Group__2__Impl : ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4329:1: ( ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:4330:1: ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:4330:1: ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:4331:2: ( rule__VLSUniversalQuantifier__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:4332:2: ( rule__VLSUniversalQuantifier__OperandAssignment_2 )
            // InternalVampireLanguage.g:4332:3: rule__VLSUniversalQuantifier__OperandAssignment_2
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
    // InternalVampireLanguage.g:4341:1: rule__VLSUniversalQuantifier__Group_1__0 : rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1 ;
    public final void rule__VLSUniversalQuantifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4345:1: ( rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1 )
            // InternalVampireLanguage.g:4346:2: rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalVampireLanguage.g:4353:1: rule__VLSUniversalQuantifier__Group_1__0__Impl : ( '!' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4357:1: ( ( '!' ) )
            // InternalVampireLanguage.g:4358:1: ( '!' )
            {
            // InternalVampireLanguage.g:4358:1: ( '!' )
            // InternalVampireLanguage.g:4359:2: '!'
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getExclamationMarkKeyword_1_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4368:1: rule__VLSUniversalQuantifier__Group_1__1 : rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2 ;
    public final void rule__VLSUniversalQuantifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4372:1: ( rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2 )
            // InternalVampireLanguage.g:4373:2: rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2
            {
            pushFollow(FOLLOW_51);
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
    // InternalVampireLanguage.g:4380:1: rule__VLSUniversalQuantifier__Group_1__1__Impl : ( '[' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4384:1: ( ( '[' ) )
            // InternalVampireLanguage.g:4385:1: ( '[' )
            {
            // InternalVampireLanguage.g:4385:1: ( '[' )
            // InternalVampireLanguage.g:4386:2: '['
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4395:1: rule__VLSUniversalQuantifier__Group_1__2 : rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3 ;
    public final void rule__VLSUniversalQuantifier__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4399:1: ( rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3 )
            // InternalVampireLanguage.g:4400:2: rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3
            {
            pushFollow(FOLLOW_52);
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
    // InternalVampireLanguage.g:4407:1: rule__VLSUniversalQuantifier__Group_1__2__Impl : ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4411:1: ( ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) ) )
            // InternalVampireLanguage.g:4412:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) )
            {
            // InternalVampireLanguage.g:4412:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) )
            // InternalVampireLanguage.g:4413:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAssignment_1_2()); 
            // InternalVampireLanguage.g:4414:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 )
            // InternalVampireLanguage.g:4414:3: rule__VLSUniversalQuantifier__VariablesAssignment_1_2
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
    // InternalVampireLanguage.g:4422:1: rule__VLSUniversalQuantifier__Group_1__3 : rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4 ;
    public final void rule__VLSUniversalQuantifier__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4426:1: ( rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4 )
            // InternalVampireLanguage.g:4427:2: rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4
            {
            pushFollow(FOLLOW_52);
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
    // InternalVampireLanguage.g:4434:1: rule__VLSUniversalQuantifier__Group_1__3__Impl : ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4438:1: ( ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* ) )
            // InternalVampireLanguage.g:4439:1: ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* )
            {
            // InternalVampireLanguage.g:4439:1: ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* )
            // InternalVampireLanguage.g:4440:2: ( rule__VLSUniversalQuantifier__Group_1_3__0 )*
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup_1_3()); 
            // InternalVampireLanguage.g:4441:2: ( rule__VLSUniversalQuantifier__Group_1_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==56) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalVampireLanguage.g:4441:3: rule__VLSUniversalQuantifier__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__VLSUniversalQuantifier__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalVampireLanguage.g:4449:1: rule__VLSUniversalQuantifier__Group_1__4 : rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5 ;
    public final void rule__VLSUniversalQuantifier__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4453:1: ( rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5 )
            // InternalVampireLanguage.g:4454:2: rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalVampireLanguage.g:4461:1: rule__VLSUniversalQuantifier__Group_1__4__Impl : ( ']' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4465:1: ( ( ']' ) )
            // InternalVampireLanguage.g:4466:1: ( ']' )
            {
            // InternalVampireLanguage.g:4466:1: ( ']' )
            // InternalVampireLanguage.g:4467:2: ']'
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,50,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4476:1: rule__VLSUniversalQuantifier__Group_1__5 : rule__VLSUniversalQuantifier__Group_1__5__Impl ;
    public final void rule__VLSUniversalQuantifier__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4480:1: ( rule__VLSUniversalQuantifier__Group_1__5__Impl )
            // InternalVampireLanguage.g:4481:2: rule__VLSUniversalQuantifier__Group_1__5__Impl
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
    // InternalVampireLanguage.g:4487:1: rule__VLSUniversalQuantifier__Group_1__5__Impl : ( ':' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4491:1: ( ( ':' ) )
            // InternalVampireLanguage.g:4492:1: ( ':' )
            {
            // InternalVampireLanguage.g:4492:1: ( ':' )
            // InternalVampireLanguage.g:4493:2: ':'
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
    // InternalVampireLanguage.g:4503:1: rule__VLSUniversalQuantifier__Group_1_3__0 : rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1 ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4507:1: ( rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1 )
            // InternalVampireLanguage.g:4508:2: rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalVampireLanguage.g:4515:1: rule__VLSUniversalQuantifier__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4519:1: ( ( ',' ) )
            // InternalVampireLanguage.g:4520:1: ( ',' )
            {
            // InternalVampireLanguage.g:4520:1: ( ',' )
            // InternalVampireLanguage.g:4521:2: ','
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getCommaKeyword_1_3_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4530:1: rule__VLSUniversalQuantifier__Group_1_3__1 : rule__VLSUniversalQuantifier__Group_1_3__1__Impl ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4534:1: ( rule__VLSUniversalQuantifier__Group_1_3__1__Impl )
            // InternalVampireLanguage.g:4535:2: rule__VLSUniversalQuantifier__Group_1_3__1__Impl
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
    // InternalVampireLanguage.g:4541:1: rule__VLSUniversalQuantifier__Group_1_3__1__Impl : ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4545:1: ( ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) ) )
            // InternalVampireLanguage.g:4546:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) )
            {
            // InternalVampireLanguage.g:4546:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) )
            // InternalVampireLanguage.g:4547:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAssignment_1_3_1()); 
            // InternalVampireLanguage.g:4548:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 )
            // InternalVampireLanguage.g:4548:3: rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1
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
    // InternalVampireLanguage.g:4557:1: rule__VLSExistentialQuantifier__Group__0 : rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1 ;
    public final void rule__VLSExistentialQuantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4561:1: ( rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1 )
            // InternalVampireLanguage.g:4562:2: rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalVampireLanguage.g:4569:1: rule__VLSExistentialQuantifier__Group__0__Impl : ( () ) ;
    public final void rule__VLSExistentialQuantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4573:1: ( ( () ) )
            // InternalVampireLanguage.g:4574:1: ( () )
            {
            // InternalVampireLanguage.g:4574:1: ( () )
            // InternalVampireLanguage.g:4575:2: ()
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVLSExistentialQuantifierAction_0()); 
            // InternalVampireLanguage.g:4576:2: ()
            // InternalVampireLanguage.g:4576:3: 
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
    // InternalVampireLanguage.g:4584:1: rule__VLSExistentialQuantifier__Group__1 : rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2 ;
    public final void rule__VLSExistentialQuantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4588:1: ( rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2 )
            // InternalVampireLanguage.g:4589:2: rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalVampireLanguage.g:4596:1: rule__VLSExistentialQuantifier__Group__1__Impl : ( ( rule__VLSExistentialQuantifier__Group_1__0 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4600:1: ( ( ( rule__VLSExistentialQuantifier__Group_1__0 ) ) )
            // InternalVampireLanguage.g:4601:1: ( ( rule__VLSExistentialQuantifier__Group_1__0 ) )
            {
            // InternalVampireLanguage.g:4601:1: ( ( rule__VLSExistentialQuantifier__Group_1__0 ) )
            // InternalVampireLanguage.g:4602:2: ( rule__VLSExistentialQuantifier__Group_1__0 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup_1()); 
            // InternalVampireLanguage.g:4603:2: ( rule__VLSExistentialQuantifier__Group_1__0 )
            // InternalVampireLanguage.g:4603:3: rule__VLSExistentialQuantifier__Group_1__0
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
    // InternalVampireLanguage.g:4611:1: rule__VLSExistentialQuantifier__Group__2 : rule__VLSExistentialQuantifier__Group__2__Impl ;
    public final void rule__VLSExistentialQuantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4615:1: ( rule__VLSExistentialQuantifier__Group__2__Impl )
            // InternalVampireLanguage.g:4616:2: rule__VLSExistentialQuantifier__Group__2__Impl
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
    // InternalVampireLanguage.g:4622:1: rule__VLSExistentialQuantifier__Group__2__Impl : ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4626:1: ( ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:4627:1: ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:4627:1: ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:4628:2: ( rule__VLSExistentialQuantifier__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:4629:2: ( rule__VLSExistentialQuantifier__OperandAssignment_2 )
            // InternalVampireLanguage.g:4629:3: rule__VLSExistentialQuantifier__OperandAssignment_2
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
    // InternalVampireLanguage.g:4638:1: rule__VLSExistentialQuantifier__Group_1__0 : rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1 ;
    public final void rule__VLSExistentialQuantifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4642:1: ( rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1 )
            // InternalVampireLanguage.g:4643:2: rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalVampireLanguage.g:4650:1: rule__VLSExistentialQuantifier__Group_1__0__Impl : ( '?' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4654:1: ( ( '?' ) )
            // InternalVampireLanguage.g:4655:1: ( '?' )
            {
            // InternalVampireLanguage.g:4655:1: ( '?' )
            // InternalVampireLanguage.g:4656:2: '?'
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getQuestionMarkKeyword_1_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4665:1: rule__VLSExistentialQuantifier__Group_1__1 : rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2 ;
    public final void rule__VLSExistentialQuantifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4669:1: ( rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2 )
            // InternalVampireLanguage.g:4670:2: rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2
            {
            pushFollow(FOLLOW_51);
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
    // InternalVampireLanguage.g:4677:1: rule__VLSExistentialQuantifier__Group_1__1__Impl : ( '[' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4681:1: ( ( '[' ) )
            // InternalVampireLanguage.g:4682:1: ( '[' )
            {
            // InternalVampireLanguage.g:4682:1: ( '[' )
            // InternalVampireLanguage.g:4683:2: '['
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4692:1: rule__VLSExistentialQuantifier__Group_1__2 : rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3 ;
    public final void rule__VLSExistentialQuantifier__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4696:1: ( rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3 )
            // InternalVampireLanguage.g:4697:2: rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3
            {
            pushFollow(FOLLOW_52);
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
    // InternalVampireLanguage.g:4704:1: rule__VLSExistentialQuantifier__Group_1__2__Impl : ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4708:1: ( ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) ) )
            // InternalVampireLanguage.g:4709:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) )
            {
            // InternalVampireLanguage.g:4709:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) )
            // InternalVampireLanguage.g:4710:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAssignment_1_2()); 
            // InternalVampireLanguage.g:4711:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 )
            // InternalVampireLanguage.g:4711:3: rule__VLSExistentialQuantifier__VariablesAssignment_1_2
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
    // InternalVampireLanguage.g:4719:1: rule__VLSExistentialQuantifier__Group_1__3 : rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4 ;
    public final void rule__VLSExistentialQuantifier__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4723:1: ( rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4 )
            // InternalVampireLanguage.g:4724:2: rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4
            {
            pushFollow(FOLLOW_52);
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
    // InternalVampireLanguage.g:4731:1: rule__VLSExistentialQuantifier__Group_1__3__Impl : ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4735:1: ( ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* ) )
            // InternalVampireLanguage.g:4736:1: ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* )
            {
            // InternalVampireLanguage.g:4736:1: ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* )
            // InternalVampireLanguage.g:4737:2: ( rule__VLSExistentialQuantifier__Group_1_3__0 )*
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup_1_3()); 
            // InternalVampireLanguage.g:4738:2: ( rule__VLSExistentialQuantifier__Group_1_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==56) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalVampireLanguage.g:4738:3: rule__VLSExistentialQuantifier__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__VLSExistentialQuantifier__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalVampireLanguage.g:4746:1: rule__VLSExistentialQuantifier__Group_1__4 : rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5 ;
    public final void rule__VLSExistentialQuantifier__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4750:1: ( rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5 )
            // InternalVampireLanguage.g:4751:2: rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalVampireLanguage.g:4758:1: rule__VLSExistentialQuantifier__Group_1__4__Impl : ( ']' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4762:1: ( ( ']' ) )
            // InternalVampireLanguage.g:4763:1: ( ']' )
            {
            // InternalVampireLanguage.g:4763:1: ( ']' )
            // InternalVampireLanguage.g:4764:2: ']'
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,50,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4773:1: rule__VLSExistentialQuantifier__Group_1__5 : rule__VLSExistentialQuantifier__Group_1__5__Impl ;
    public final void rule__VLSExistentialQuantifier__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4777:1: ( rule__VLSExistentialQuantifier__Group_1__5__Impl )
            // InternalVampireLanguage.g:4778:2: rule__VLSExistentialQuantifier__Group_1__5__Impl
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
    // InternalVampireLanguage.g:4784:1: rule__VLSExistentialQuantifier__Group_1__5__Impl : ( ':' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4788:1: ( ( ':' ) )
            // InternalVampireLanguage.g:4789:1: ( ':' )
            {
            // InternalVampireLanguage.g:4789:1: ( ':' )
            // InternalVampireLanguage.g:4790:2: ':'
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
    // InternalVampireLanguage.g:4800:1: rule__VLSExistentialQuantifier__Group_1_3__0 : rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1 ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4804:1: ( rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1 )
            // InternalVampireLanguage.g:4805:2: rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalVampireLanguage.g:4812:1: rule__VLSExistentialQuantifier__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4816:1: ( ( ',' ) )
            // InternalVampireLanguage.g:4817:1: ( ',' )
            {
            // InternalVampireLanguage.g:4817:1: ( ',' )
            // InternalVampireLanguage.g:4818:2: ','
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getCommaKeyword_1_3_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4827:1: rule__VLSExistentialQuantifier__Group_1_3__1 : rule__VLSExistentialQuantifier__Group_1_3__1__Impl ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4831:1: ( rule__VLSExistentialQuantifier__Group_1_3__1__Impl )
            // InternalVampireLanguage.g:4832:2: rule__VLSExistentialQuantifier__Group_1_3__1__Impl
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
    // InternalVampireLanguage.g:4838:1: rule__VLSExistentialQuantifier__Group_1_3__1__Impl : ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4842:1: ( ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) ) )
            // InternalVampireLanguage.g:4843:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) )
            {
            // InternalVampireLanguage.g:4843:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) )
            // InternalVampireLanguage.g:4844:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAssignment_1_3_1()); 
            // InternalVampireLanguage.g:4845:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 )
            // InternalVampireLanguage.g:4845:3: rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1
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
    // InternalVampireLanguage.g:4854:1: rule__VLSUnaryNegation__Group__0 : rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1 ;
    public final void rule__VLSUnaryNegation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4858:1: ( rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1 )
            // InternalVampireLanguage.g:4859:2: rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalVampireLanguage.g:4866:1: rule__VLSUnaryNegation__Group__0__Impl : ( () ) ;
    public final void rule__VLSUnaryNegation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4870:1: ( ( () ) )
            // InternalVampireLanguage.g:4871:1: ( () )
            {
            // InternalVampireLanguage.g:4871:1: ( () )
            // InternalVampireLanguage.g:4872:2: ()
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getVLSUnaryNegationAction_0()); 
            // InternalVampireLanguage.g:4873:2: ()
            // InternalVampireLanguage.g:4873:3: 
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
    // InternalVampireLanguage.g:4881:1: rule__VLSUnaryNegation__Group__1 : rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2 ;
    public final void rule__VLSUnaryNegation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4885:1: ( rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2 )
            // InternalVampireLanguage.g:4886:2: rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalVampireLanguage.g:4893:1: rule__VLSUnaryNegation__Group__1__Impl : ( '~' ) ;
    public final void rule__VLSUnaryNegation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4897:1: ( ( '~' ) )
            // InternalVampireLanguage.g:4898:1: ( '~' )
            {
            // InternalVampireLanguage.g:4898:1: ( '~' )
            // InternalVampireLanguage.g:4899:2: '~'
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getTildeKeyword_1()); 
            match(input,74,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4908:1: rule__VLSUnaryNegation__Group__2 : rule__VLSUnaryNegation__Group__2__Impl ;
    public final void rule__VLSUnaryNegation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4912:1: ( rule__VLSUnaryNegation__Group__2__Impl )
            // InternalVampireLanguage.g:4913:2: rule__VLSUnaryNegation__Group__2__Impl
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
    // InternalVampireLanguage.g:4919:1: rule__VLSUnaryNegation__Group__2__Impl : ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) ) ;
    public final void rule__VLSUnaryNegation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4923:1: ( ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:4924:1: ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:4924:1: ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:4925:2: ( rule__VLSUnaryNegation__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:4926:2: ( rule__VLSUnaryNegation__OperandAssignment_2 )
            // InternalVampireLanguage.g:4926:3: rule__VLSUnaryNegation__OperandAssignment_2
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
    // InternalVampireLanguage.g:4935:1: rule__VLSUnaryInfix__Group__0 : rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1 ;
    public final void rule__VLSUnaryInfix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4939:1: ( rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1 )
            // InternalVampireLanguage.g:4940:2: rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalVampireLanguage.g:4947:1: rule__VLSUnaryInfix__Group__0__Impl : ( ruleVLSAtomic ) ;
    public final void rule__VLSUnaryInfix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4951:1: ( ( ruleVLSAtomic ) )
            // InternalVampireLanguage.g:4952:1: ( ruleVLSAtomic )
            {
            // InternalVampireLanguage.g:4952:1: ( ruleVLSAtomic )
            // InternalVampireLanguage.g:4953:2: ruleVLSAtomic
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
    // InternalVampireLanguage.g:4962:1: rule__VLSUnaryInfix__Group__1 : rule__VLSUnaryInfix__Group__1__Impl ;
    public final void rule__VLSUnaryInfix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4966:1: ( rule__VLSUnaryInfix__Group__1__Impl )
            // InternalVampireLanguage.g:4967:2: rule__VLSUnaryInfix__Group__1__Impl
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
    // InternalVampireLanguage.g:4973:1: rule__VLSUnaryInfix__Group__1__Impl : ( ( rule__VLSUnaryInfix__Group_1__0 )? ) ;
    public final void rule__VLSUnaryInfix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4977:1: ( ( ( rule__VLSUnaryInfix__Group_1__0 )? ) )
            // InternalVampireLanguage.g:4978:1: ( ( rule__VLSUnaryInfix__Group_1__0 )? )
            {
            // InternalVampireLanguage.g:4978:1: ( ( rule__VLSUnaryInfix__Group_1__0 )? )
            // InternalVampireLanguage.g:4979:2: ( rule__VLSUnaryInfix__Group_1__0 )?
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1()); 
            // InternalVampireLanguage.g:4980:2: ( rule__VLSUnaryInfix__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=75 && LA41_0<=77)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalVampireLanguage.g:4980:3: rule__VLSUnaryInfix__Group_1__0
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
    // InternalVampireLanguage.g:4989:1: rule__VLSUnaryInfix__Group_1__0 : rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1 ;
    public final void rule__VLSUnaryInfix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4993:1: ( rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1 )
            // InternalVampireLanguage.g:4994:2: rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalVampireLanguage.g:5001:1: rule__VLSUnaryInfix__Group_1__0__Impl : ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) ) ;
    public final void rule__VLSUnaryInfix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5005:1: ( ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) ) )
            // InternalVampireLanguage.g:5006:1: ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) )
            {
            // InternalVampireLanguage.g:5006:1: ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) )
            // InternalVampireLanguage.g:5007:2: ( rule__VLSUnaryInfix__Alternatives_1_0 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getAlternatives_1_0()); 
            // InternalVampireLanguage.g:5008:2: ( rule__VLSUnaryInfix__Alternatives_1_0 )
            // InternalVampireLanguage.g:5008:3: rule__VLSUnaryInfix__Alternatives_1_0
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
    // InternalVampireLanguage.g:5016:1: rule__VLSUnaryInfix__Group_1__1 : rule__VLSUnaryInfix__Group_1__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5020:1: ( rule__VLSUnaryInfix__Group_1__1__Impl )
            // InternalVampireLanguage.g:5021:2: rule__VLSUnaryInfix__Group_1__1__Impl
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
    // InternalVampireLanguage.g:5027:1: rule__VLSUnaryInfix__Group_1__1__Impl : ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) ) ;
    public final void rule__VLSUnaryInfix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5031:1: ( ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:5032:1: ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:5032:1: ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) )
            // InternalVampireLanguage.g:5033:2: ( rule__VLSUnaryInfix__RightAssignment_1_1 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getRightAssignment_1_1()); 
            // InternalVampireLanguage.g:5034:2: ( rule__VLSUnaryInfix__RightAssignment_1_1 )
            // InternalVampireLanguage.g:5034:3: rule__VLSUnaryInfix__RightAssignment_1_1
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
    // InternalVampireLanguage.g:5043:1: rule__VLSUnaryInfix__Group_1_0_0__0 : rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5047:1: ( rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1 )
            // InternalVampireLanguage.g:5048:2: rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalVampireLanguage.g:5055:1: rule__VLSUnaryInfix__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5059:1: ( ( () ) )
            // InternalVampireLanguage.g:5060:1: ( () )
            {
            // InternalVampireLanguage.g:5060:1: ( () )
            // InternalVampireLanguage.g:5061:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSInequalityLeftAction_1_0_0_0()); 
            // InternalVampireLanguage.g:5062:2: ()
            // InternalVampireLanguage.g:5062:3: 
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
    // InternalVampireLanguage.g:5070:1: rule__VLSUnaryInfix__Group_1_0_0__1 : rule__VLSUnaryInfix__Group_1_0_0__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5074:1: ( rule__VLSUnaryInfix__Group_1_0_0__1__Impl )
            // InternalVampireLanguage.g:5075:2: rule__VLSUnaryInfix__Group_1_0_0__1__Impl
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
    // InternalVampireLanguage.g:5081:1: rule__VLSUnaryInfix__Group_1_0_0__1__Impl : ( '!=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5085:1: ( ( '!=' ) )
            // InternalVampireLanguage.g:5086:1: ( '!=' )
            {
            // InternalVampireLanguage.g:5086:1: ( '!=' )
            // InternalVampireLanguage.g:5087:2: '!='
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1()); 
            match(input,75,FOLLOW_2); 
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
    // InternalVampireLanguage.g:5097:1: rule__VLSUnaryInfix__Group_1_0_1__0 : rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5101:1: ( rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1 )
            // InternalVampireLanguage.g:5102:2: rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalVampireLanguage.g:5109:1: rule__VLSUnaryInfix__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5113:1: ( ( () ) )
            // InternalVampireLanguage.g:5114:1: ( () )
            {
            // InternalVampireLanguage.g:5114:1: ( () )
            // InternalVampireLanguage.g:5115:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSEqualityLeftAction_1_0_1_0()); 
            // InternalVampireLanguage.g:5116:2: ()
            // InternalVampireLanguage.g:5116:3: 
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
    // InternalVampireLanguage.g:5124:1: rule__VLSUnaryInfix__Group_1_0_1__1 : rule__VLSUnaryInfix__Group_1_0_1__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5128:1: ( rule__VLSUnaryInfix__Group_1_0_1__1__Impl )
            // InternalVampireLanguage.g:5129:2: rule__VLSUnaryInfix__Group_1_0_1__1__Impl
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
    // InternalVampireLanguage.g:5135:1: rule__VLSUnaryInfix__Group_1_0_1__1__Impl : ( '=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5139:1: ( ( '=' ) )
            // InternalVampireLanguage.g:5140:1: ( '=' )
            {
            // InternalVampireLanguage.g:5140:1: ( '=' )
            // InternalVampireLanguage.g:5141:2: '='
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getEqualsSignKeyword_1_0_1_1()); 
            match(input,76,FOLLOW_2); 
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
    // InternalVampireLanguage.g:5151:1: rule__VLSUnaryInfix__Group_1_0_2__0 : rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5155:1: ( rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1 )
            // InternalVampireLanguage.g:5156:2: rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalVampireLanguage.g:5163:1: rule__VLSUnaryInfix__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5167:1: ( ( () ) )
            // InternalVampireLanguage.g:5168:1: ( () )
            {
            // InternalVampireLanguage.g:5168:1: ( () )
            // InternalVampireLanguage.g:5169:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSAssignmentLeftAction_1_0_2_0()); 
            // InternalVampireLanguage.g:5170:2: ()
            // InternalVampireLanguage.g:5170:3: 
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
    // InternalVampireLanguage.g:5178:1: rule__VLSUnaryInfix__Group_1_0_2__1 : rule__VLSUnaryInfix__Group_1_0_2__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5182:1: ( rule__VLSUnaryInfix__Group_1_0_2__1__Impl )
            // InternalVampireLanguage.g:5183:2: rule__VLSUnaryInfix__Group_1_0_2__1__Impl
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
    // InternalVampireLanguage.g:5189:1: rule__VLSUnaryInfix__Group_1_0_2__1__Impl : ( ':=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5193:1: ( ( ':=' ) )
            // InternalVampireLanguage.g:5194:1: ( ':=' )
            {
            // InternalVampireLanguage.g:5194:1: ( ':=' )
            // InternalVampireLanguage.g:5195:2: ':='
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getColonEqualsSignKeyword_1_0_2_1()); 
            match(input,77,FOLLOW_2); 
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
    // InternalVampireLanguage.g:5205:1: rule__VLSAtomicConstant__Group_0__0 : rule__VLSAtomicConstant__Group_0__0__Impl rule__VLSAtomicConstant__Group_0__1 ;
    public final void rule__VLSAtomicConstant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5209:1: ( rule__VLSAtomicConstant__Group_0__0__Impl rule__VLSAtomicConstant__Group_0__1 )
            // InternalVampireLanguage.g:5210:2: rule__VLSAtomicConstant__Group_0__0__Impl rule__VLSAtomicConstant__Group_0__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalVampireLanguage.g:5217:1: rule__VLSAtomicConstant__Group_0__0__Impl : ( () ) ;
    public final void rule__VLSAtomicConstant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5221:1: ( ( () ) )
            // InternalVampireLanguage.g:5222:1: ( () )
            {
            // InternalVampireLanguage.g:5222:1: ( () )
            // InternalVampireLanguage.g:5223:2: ()
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getVLSConstantAction_0_0()); 
            // InternalVampireLanguage.g:5224:2: ()
            // InternalVampireLanguage.g:5224:3: 
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
    // InternalVampireLanguage.g:5232:1: rule__VLSAtomicConstant__Group_0__1 : rule__VLSAtomicConstant__Group_0__1__Impl ;
    public final void rule__VLSAtomicConstant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5236:1: ( rule__VLSAtomicConstant__Group_0__1__Impl )
            // InternalVampireLanguage.g:5237:2: rule__VLSAtomicConstant__Group_0__1__Impl
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
    // InternalVampireLanguage.g:5243:1: rule__VLSAtomicConstant__Group_0__1__Impl : ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) ) ;
    public final void rule__VLSAtomicConstant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5247:1: ( ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) ) )
            // InternalVampireLanguage.g:5248:1: ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) )
            {
            // InternalVampireLanguage.g:5248:1: ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) )
            // InternalVampireLanguage.g:5249:2: ( rule__VLSAtomicConstant__NameAssignment_0_1 )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getNameAssignment_0_1()); 
            // InternalVampireLanguage.g:5250:2: ( rule__VLSAtomicConstant__NameAssignment_0_1 )
            // InternalVampireLanguage.g:5250:3: rule__VLSAtomicConstant__NameAssignment_0_1
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
    // InternalVampireLanguage.g:5259:1: rule__VLSAtomicConstant__Group_1__0 : rule__VLSAtomicConstant__Group_1__0__Impl rule__VLSAtomicConstant__Group_1__1 ;
    public final void rule__VLSAtomicConstant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5263:1: ( rule__VLSAtomicConstant__Group_1__0__Impl rule__VLSAtomicConstant__Group_1__1 )
            // InternalVampireLanguage.g:5264:2: rule__VLSAtomicConstant__Group_1__0__Impl rule__VLSAtomicConstant__Group_1__1
            {
            pushFollow(FOLLOW_59);
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
    // InternalVampireLanguage.g:5271:1: rule__VLSAtomicConstant__Group_1__0__Impl : ( () ) ;
    public final void rule__VLSAtomicConstant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5275:1: ( ( () ) )
            // InternalVampireLanguage.g:5276:1: ( () )
            {
            // InternalVampireLanguage.g:5276:1: ( () )
            // InternalVampireLanguage.g:5277:2: ()
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getVLSTrueAction_1_0()); 
            // InternalVampireLanguage.g:5278:2: ()
            // InternalVampireLanguage.g:5278:3: 
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
    // InternalVampireLanguage.g:5286:1: rule__VLSAtomicConstant__Group_1__1 : rule__VLSAtomicConstant__Group_1__1__Impl ;
    public final void rule__VLSAtomicConstant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5290:1: ( rule__VLSAtomicConstant__Group_1__1__Impl )
            // InternalVampireLanguage.g:5291:2: rule__VLSAtomicConstant__Group_1__1__Impl
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
    // InternalVampireLanguage.g:5297:1: rule__VLSAtomicConstant__Group_1__1__Impl : ( '$true' ) ;
    public final void rule__VLSAtomicConstant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5301:1: ( ( '$true' ) )
            // InternalVampireLanguage.g:5302:1: ( '$true' )
            {
            // InternalVampireLanguage.g:5302:1: ( '$true' )
            // InternalVampireLanguage.g:5303:2: '$true'
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getTrueKeyword_1_1()); 
            match(input,78,FOLLOW_2); 
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
    // InternalVampireLanguage.g:5313:1: rule__VLSAtomicConstant__Group_2__0 : rule__VLSAtomicConstant__Group_2__0__Impl rule__VLSAtomicConstant__Group_2__1 ;
    public final void rule__VLSAtomicConstant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5317:1: ( rule__VLSAtomicConstant__Group_2__0__Impl rule__VLSAtomicConstant__Group_2__1 )
            // InternalVampireLanguage.g:5318:2: rule__VLSAtomicConstant__Group_2__0__Impl rule__VLSAtomicConstant__Group_2__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalVampireLanguage.g:5325:1: rule__VLSAtomicConstant__Group_2__0__Impl : ( () ) ;
    public final void rule__VLSAtomicConstant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5329:1: ( ( () ) )
            // InternalVampireLanguage.g:5330:1: ( () )
            {
            // InternalVampireLanguage.g:5330:1: ( () )
            // InternalVampireLanguage.g:5331:2: ()
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getVLSFalseAction_2_0()); 
            // InternalVampireLanguage.g:5332:2: ()
            // InternalVampireLanguage.g:5332:3: 
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
    // InternalVampireLanguage.g:5340:1: rule__VLSAtomicConstant__Group_2__1 : rule__VLSAtomicConstant__Group_2__1__Impl ;
    public final void rule__VLSAtomicConstant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5344:1: ( rule__VLSAtomicConstant__Group_2__1__Impl )
            // InternalVampireLanguage.g:5345:2: rule__VLSAtomicConstant__Group_2__1__Impl
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
    // InternalVampireLanguage.g:5351:1: rule__VLSAtomicConstant__Group_2__1__Impl : ( '$false' ) ;
    public final void rule__VLSAtomicConstant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5355:1: ( ( '$false' ) )
            // InternalVampireLanguage.g:5356:1: ( '$false' )
            {
            // InternalVampireLanguage.g:5356:1: ( '$false' )
            // InternalVampireLanguage.g:5357:2: '$false'
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getFalseKeyword_2_1()); 
            match(input,79,FOLLOW_2); 
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
    // InternalVampireLanguage.g:5367:1: rule__VLSAtomicFunction__Group_0__0 : rule__VLSAtomicFunction__Group_0__0__Impl rule__VLSAtomicFunction__Group_0__1 ;
    public final void rule__VLSAtomicFunction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5371:1: ( rule__VLSAtomicFunction__Group_0__0__Impl rule__VLSAtomicFunction__Group_0__1 )
            // InternalVampireLanguage.g:5372:2: rule__VLSAtomicFunction__Group_0__0__Impl rule__VLSAtomicFunction__Group_0__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalVampireLanguage.g:5379:1: rule__VLSAtomicFunction__Group_0__0__Impl : ( () ) ;
    public final void rule__VLSAtomicFunction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5383:1: ( ( () ) )
            // InternalVampireLanguage.g:5384:1: ( () )
            {
            // InternalVampireLanguage.g:5384:1: ( () )
            // InternalVampireLanguage.g:5385:2: ()
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getVLSFunctionAction_0_0()); 
            // InternalVampireLanguage.g:5386:2: ()
            // InternalVampireLanguage.g:5386:3: 
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
    // InternalVampireLanguage.g:5394:1: rule__VLSAtomicFunction__Group_0__1 : rule__VLSAtomicFunction__Group_0__1__Impl rule__VLSAtomicFunction__Group_0__2 ;
    public final void rule__VLSAtomicFunction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5398:1: ( rule__VLSAtomicFunction__Group_0__1__Impl rule__VLSAtomicFunction__Group_0__2 )
            // InternalVampireLanguage.g:5399:2: rule__VLSAtomicFunction__Group_0__1__Impl rule__VLSAtomicFunction__Group_0__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalVampireLanguage.g:5406:1: rule__VLSAtomicFunction__Group_0__1__Impl : ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5410:1: ( ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) ) )
            // InternalVampireLanguage.g:5411:1: ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) )
            {
            // InternalVampireLanguage.g:5411:1: ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) )
            // InternalVampireLanguage.g:5412:2: ( rule__VLSAtomicFunction__ConstantAssignment_0_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getConstantAssignment_0_1()); 
            // InternalVampireLanguage.g:5413:2: ( rule__VLSAtomicFunction__ConstantAssignment_0_1 )
            // InternalVampireLanguage.g:5413:3: rule__VLSAtomicFunction__ConstantAssignment_0_1
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
    // InternalVampireLanguage.g:5421:1: rule__VLSAtomicFunction__Group_0__2 : rule__VLSAtomicFunction__Group_0__2__Impl ;
    public final void rule__VLSAtomicFunction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5425:1: ( rule__VLSAtomicFunction__Group_0__2__Impl )
            // InternalVampireLanguage.g:5426:2: rule__VLSAtomicFunction__Group_0__2__Impl
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
    // InternalVampireLanguage.g:5432:1: rule__VLSAtomicFunction__Group_0__2__Impl : ( ( rule__VLSAtomicFunction__Group_0_2__0 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5436:1: ( ( ( rule__VLSAtomicFunction__Group_0_2__0 ) ) )
            // InternalVampireLanguage.g:5437:1: ( ( rule__VLSAtomicFunction__Group_0_2__0 ) )
            {
            // InternalVampireLanguage.g:5437:1: ( ( rule__VLSAtomicFunction__Group_0_2__0 ) )
            // InternalVampireLanguage.g:5438:2: ( rule__VLSAtomicFunction__Group_0_2__0 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0_2()); 
            // InternalVampireLanguage.g:5439:2: ( rule__VLSAtomicFunction__Group_0_2__0 )
            // InternalVampireLanguage.g:5439:3: rule__VLSAtomicFunction__Group_0_2__0
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
    // InternalVampireLanguage.g:5448:1: rule__VLSAtomicFunction__Group_0_2__0 : rule__VLSAtomicFunction__Group_0_2__0__Impl rule__VLSAtomicFunction__Group_0_2__1 ;
    public final void rule__VLSAtomicFunction__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5452:1: ( rule__VLSAtomicFunction__Group_0_2__0__Impl rule__VLSAtomicFunction__Group_0_2__1 )
            // InternalVampireLanguage.g:5453:2: rule__VLSAtomicFunction__Group_0_2__0__Impl rule__VLSAtomicFunction__Group_0_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalVampireLanguage.g:5460:1: rule__VLSAtomicFunction__Group_0_2__0__Impl : ( '(' ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5464:1: ( ( '(' ) )
            // InternalVampireLanguage.g:5465:1: ( '(' )
            {
            // InternalVampireLanguage.g:5465:1: ( '(' )
            // InternalVampireLanguage.g:5466:2: '('
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getLeftParenthesisKeyword_0_2_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalVampireLanguage.g:5475:1: rule__VLSAtomicFunction__Group_0_2__1 : rule__VLSAtomicFunction__Group_0_2__1__Impl rule__VLSAtomicFunction__Group_0_2__2 ;
    public final void rule__VLSAtomicFunction__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5479:1: ( rule__VLSAtomicFunction__Group_0_2__1__Impl rule__VLSAtomicFunction__Group_0_2__2 )
            // InternalVampireLanguage.g:5480:2: rule__VLSAtomicFunction__Group_0_2__1__Impl rule__VLSAtomicFunction__Group_0_2__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalVampireLanguage.g:5487:1: rule__VLSAtomicFunction__Group_0_2__1__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5491:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) ) )
            // InternalVampireLanguage.g:5492:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) )
            {
            // InternalVampireLanguage.g:5492:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) )
            // InternalVampireLanguage.g:5493:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_0_2_1()); 
            // InternalVampireLanguage.g:5494:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 )
            // InternalVampireLanguage.g:5494:3: rule__VLSAtomicFunction__TermsAssignment_0_2_1
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
    // InternalVampireLanguage.g:5502:1: rule__VLSAtomicFunction__Group_0_2__2 : rule__VLSAtomicFunction__Group_0_2__2__Impl rule__VLSAtomicFunction__Group_0_2__3 ;
    public final void rule__VLSAtomicFunction__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5506:1: ( rule__VLSAtomicFunction__Group_0_2__2__Impl rule__VLSAtomicFunction__Group_0_2__3 )
            // InternalVampireLanguage.g:5507:2: rule__VLSAtomicFunction__Group_0_2__2__Impl rule__VLSAtomicFunction__Group_0_2__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalVampireLanguage.g:5514:1: rule__VLSAtomicFunction__Group_0_2__2__Impl : ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5518:1: ( ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* ) )
            // InternalVampireLanguage.g:5519:1: ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* )
            {
            // InternalVampireLanguage.g:5519:1: ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* )
            // InternalVampireLanguage.g:5520:2: ( rule__VLSAtomicFunction__Group_0_2_2__0 )*
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0_2_2()); 
            // InternalVampireLanguage.g:5521:2: ( rule__VLSAtomicFunction__Group_0_2_2__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==56) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalVampireLanguage.g:5521:3: rule__VLSAtomicFunction__Group_0_2_2__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__VLSAtomicFunction__Group_0_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalVampireLanguage.g:5529:1: rule__VLSAtomicFunction__Group_0_2__3 : rule__VLSAtomicFunction__Group_0_2__3__Impl ;
    public final void rule__VLSAtomicFunction__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5533:1: ( rule__VLSAtomicFunction__Group_0_2__3__Impl )
            // InternalVampireLanguage.g:5534:2: rule__VLSAtomicFunction__Group_0_2__3__Impl
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
    // InternalVampireLanguage.g:5540:1: rule__VLSAtomicFunction__Group_0_2__3__Impl : ( ')' ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5544:1: ( ( ')' ) )
            // InternalVampireLanguage.g:5545:1: ( ')' )
            {
            // InternalVampireLanguage.g:5545:1: ( ')' )
            // InternalVampireLanguage.g:5546:2: ')'
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getRightParenthesisKeyword_0_2_3()); 
            match(input,57,FOLLOW_2); 
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
    // InternalVampireLanguage.g:5556:1: rule__VLSAtomicFunction__Group_0_2_2__0 : rule__VLSAtomicFunction__Group_0_2_2__0__Impl rule__VLSAtomicFunction__Group_0_2_2__1 ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5560:1: ( rule__VLSAtomicFunction__Group_0_2_2__0__Impl rule__VLSAtomicFunction__Group_0_2_2__1 )
            // InternalVampireLanguage.g:5561:2: rule__VLSAtomicFunction__Group_0_2_2__0__Impl rule__VLSAtomicFunction__Group_0_2_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalVampireLanguage.g:5568:1: rule__VLSAtomicFunction__Group_0_2_2__0__Impl : ( ',' ) ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5572:1: ( ( ',' ) )
            // InternalVampireLanguage.g:5573:1: ( ',' )
            {
            // InternalVampireLanguage.g:5573:1: ( ',' )
            // InternalVampireLanguage.g:5574:2: ','
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getCommaKeyword_0_2_2_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalVampireLanguage.g:5583:1: rule__VLSAtomicFunction__Group_0_2_2__1 : rule__VLSAtomicFunction__Group_0_2_2__1__Impl ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5587:1: ( rule__VLSAtomicFunction__Group_0_2_2__1__Impl )
            // InternalVampireLanguage.g:5588:2: rule__VLSAtomicFunction__Group_0_2_2__1__Impl
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
    // InternalVampireLanguage.g:5594:1: rule__VLSAtomicFunction__Group_0_2_2__1__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5598:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) ) )
            // InternalVampireLanguage.g:5599:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) )
            {
            // InternalVampireLanguage.g:5599:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) )
            // InternalVampireLanguage.g:5600:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_0_2_2_1()); 
            // InternalVampireLanguage.g:5601:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 )
            // InternalVampireLanguage.g:5601:3: rule__VLSAtomicFunction__TermsAssignment_0_2_2_1
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
    // InternalVampireLanguage.g:5610:1: rule__VLSAtomicFunction__Group_1__0 : rule__VLSAtomicFunction__Group_1__0__Impl rule__VLSAtomicFunction__Group_1__1 ;
    public final void rule__VLSAtomicFunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5614:1: ( rule__VLSAtomicFunction__Group_1__0__Impl rule__VLSAtomicFunction__Group_1__1 )
            // InternalVampireLanguage.g:5615:2: rule__VLSAtomicFunction__Group_1__0__Impl rule__VLSAtomicFunction__Group_1__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalVampireLanguage.g:5622:1: rule__VLSAtomicFunction__Group_1__0__Impl : ( () ) ;
    public final void rule__VLSAtomicFunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5626:1: ( ( () ) )
            // InternalVampireLanguage.g:5627:1: ( () )
            {
            // InternalVampireLanguage.g:5627:1: ( () )
            // InternalVampireLanguage.g:5628:2: ()
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getVLSLessAction_1_0()); 
            // InternalVampireLanguage.g:5629:2: ()
            // InternalVampireLanguage.g:5629:3: 
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
    // InternalVampireLanguage.g:5637:1: rule__VLSAtomicFunction__Group_1__1 : rule__VLSAtomicFunction__Group_1__1__Impl rule__VLSAtomicFunction__Group_1__2 ;
    public final void rule__VLSAtomicFunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5641:1: ( rule__VLSAtomicFunction__Group_1__1__Impl rule__VLSAtomicFunction__Group_1__2 )
            // InternalVampireLanguage.g:5642:2: rule__VLSAtomicFunction__Group_1__1__Impl rule__VLSAtomicFunction__Group_1__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalVampireLanguage.g:5649:1: rule__VLSAtomicFunction__Group_1__1__Impl : ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5653:1: ( ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:5654:1: ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:5654:1: ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) )
            // InternalVampireLanguage.g:5655:2: ( rule__VLSAtomicFunction__NameAssignment_1_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getNameAssignment_1_1()); 
            // InternalVampireLanguage.g:5656:2: ( rule__VLSAtomicFunction__NameAssignment_1_1 )
            // InternalVampireLanguage.g:5656:3: rule__VLSAtomicFunction__NameAssignment_1_1
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
    // InternalVampireLanguage.g:5664:1: rule__VLSAtomicFunction__Group_1__2 : rule__VLSAtomicFunction__Group_1__2__Impl rule__VLSAtomicFunction__Group_1__3 ;
    public final void rule__VLSAtomicFunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5668:1: ( rule__VLSAtomicFunction__Group_1__2__Impl rule__VLSAtomicFunction__Group_1__3 )
            // InternalVampireLanguage.g:5669:2: rule__VLSAtomicFunction__Group_1__2__Impl rule__VLSAtomicFunction__Group_1__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalVampireLanguage.g:5676:1: rule__VLSAtomicFunction__Group_1__2__Impl : ( '(' ) ;
    public final void rule__VLSAtomicFunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5680:1: ( ( '(' ) )
            // InternalVampireLanguage.g:5681:1: ( '(' )
            {
            // InternalVampireLanguage.g:5681:1: ( '(' )
            // InternalVampireLanguage.g:5682:2: '('
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,55,FOLLOW_2); 
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
    // InternalVampireLanguage.g:5691:1: rule__VLSAtomicFunction__Group_1__3 : rule__VLSAtomicFunction__Group_1__3__Impl rule__VLSAtomicFunction__Group_1__4 ;
    public final void rule__VLSAtomicFunction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5695:1: ( rule__VLSAtomicFunction__Group_1__3__Impl rule__VLSAtomicFunction__Group_1__4 )
            // InternalVampireLanguage.g:5696:2: rule__VLSAtomicFunction__Group_1__3__Impl rule__VLSAtomicFunction__Group_1__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalVampireLanguage.g:5703:1: rule__VLSAtomicFunction__Group_1__3__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) ) ;
    public final void rule__VLSAtomicFunction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5707:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) ) )
            // InternalVampireLanguage.g:5708:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) )
            {
            // InternalVampireLanguage.g:5708:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) )
            // InternalVampireLanguage.g:5709:2: ( rule__VLSAtomicFunction__TermsAssignment_1_3 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_1_3()); 
            // InternalVampireLanguage.g:5710:2: ( rule__VLSAtomicFunction__TermsAssignment_1_3 )
            // InternalVampireLanguage.g:5710:3: rule__VLSAtomicFunction__TermsAssignment_1_3
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
    // InternalVampireLanguage.g:5718:1: rule__VLSAtomicFunction__Group_1__4 : rule__VLSAtomicFunction__Group_1__4__Impl rule__VLSAtomicFunction__Group_1__5 ;
    public final void rule__VLSAtomicFunction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5722:1: ( rule__VLSAtomicFunction__Group_1__4__Impl rule__VLSAtomicFunction__Group_1__5 )
            // InternalVampireLanguage.g:5723:2: rule__VLSAtomicFunction__Group_1__4__Impl rule__VLSAtomicFunction__Group_1__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalVampireLanguage.g:5730:1: rule__VLSAtomicFunction__Group_1__4__Impl : ( ',' ) ;
    public final void rule__VLSAtomicFunction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5734:1: ( ( ',' ) )
            // InternalVampireLanguage.g:5735:1: ( ',' )
            {
            // InternalVampireLanguage.g:5735:1: ( ',' )
            // InternalVampireLanguage.g:5736:2: ','
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getCommaKeyword_1_4()); 
            match(input,56,FOLLOW_2); 
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
    // InternalVampireLanguage.g:5745:1: rule__VLSAtomicFunction__Group_1__5 : rule__VLSAtomicFunction__Group_1__5__Impl rule__VLSAtomicFunction__Group_1__6 ;
    public final void rule__VLSAtomicFunction__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5749:1: ( rule__VLSAtomicFunction__Group_1__5__Impl rule__VLSAtomicFunction__Group_1__6 )
            // InternalVampireLanguage.g:5750:2: rule__VLSAtomicFunction__Group_1__5__Impl rule__VLSAtomicFunction__Group_1__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalVampireLanguage.g:5757:1: rule__VLSAtomicFunction__Group_1__5__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) ) ;
    public final void rule__VLSAtomicFunction__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5761:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) ) )
            // InternalVampireLanguage.g:5762:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) )
            {
            // InternalVampireLanguage.g:5762:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) )
            // InternalVampireLanguage.g:5763:2: ( rule__VLSAtomicFunction__TermsAssignment_1_5 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_1_5()); 
            // InternalVampireLanguage.g:5764:2: ( rule__VLSAtomicFunction__TermsAssignment_1_5 )
            // InternalVampireLanguage.g:5764:3: rule__VLSAtomicFunction__TermsAssignment_1_5
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
    // InternalVampireLanguage.g:5772:1: rule__VLSAtomicFunction__Group_1__6 : rule__VLSAtomicFunction__Group_1__6__Impl ;
    public final void rule__VLSAtomicFunction__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5776:1: ( rule__VLSAtomicFunction__Group_1__6__Impl )
            // InternalVampireLanguage.g:5777:2: rule__VLSAtomicFunction__Group_1__6__Impl
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
    // InternalVampireLanguage.g:5783:1: rule__VLSAtomicFunction__Group_1__6__Impl : ( ')' ) ;
    public final void rule__VLSAtomicFunction__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5787:1: ( ( ')' ) )
            // InternalVampireLanguage.g:5788:1: ( ')' )
            {
            // InternalVampireLanguage.g:5788:1: ( ')' )
            // InternalVampireLanguage.g:5789:2: ')'
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getRightParenthesisKeyword_1_6()); 
            match(input,57,FOLLOW_2); 
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


    // $ANTLR start "rule__VLSFunctionAsTerm__Group__0"
    // InternalVampireLanguage.g:5799:1: rule__VLSFunctionAsTerm__Group__0 : rule__VLSFunctionAsTerm__Group__0__Impl rule__VLSFunctionAsTerm__Group__1 ;
    public final void rule__VLSFunctionAsTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5803:1: ( rule__VLSFunctionAsTerm__Group__0__Impl rule__VLSFunctionAsTerm__Group__1 )
            // InternalVampireLanguage.g:5804:2: rule__VLSFunctionAsTerm__Group__0__Impl rule__VLSFunctionAsTerm__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__VLSFunctionAsTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFunctionAsTerm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__Group__0"


    // $ANTLR start "rule__VLSFunctionAsTerm__Group__0__Impl"
    // InternalVampireLanguage.g:5811:1: rule__VLSFunctionAsTerm__Group__0__Impl : ( ( rule__VLSFunctionAsTerm__FunctorAssignment_0 ) ) ;
    public final void rule__VLSFunctionAsTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5815:1: ( ( ( rule__VLSFunctionAsTerm__FunctorAssignment_0 ) ) )
            // InternalVampireLanguage.g:5816:1: ( ( rule__VLSFunctionAsTerm__FunctorAssignment_0 ) )
            {
            // InternalVampireLanguage.g:5816:1: ( ( rule__VLSFunctionAsTerm__FunctorAssignment_0 ) )
            // InternalVampireLanguage.g:5817:2: ( rule__VLSFunctionAsTerm__FunctorAssignment_0 )
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getFunctorAssignment_0()); 
            // InternalVampireLanguage.g:5818:2: ( rule__VLSFunctionAsTerm__FunctorAssignment_0 )
            // InternalVampireLanguage.g:5818:3: rule__VLSFunctionAsTerm__FunctorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionAsTerm__FunctorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSFunctionAsTermAccess().getFunctorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__Group__0__Impl"


    // $ANTLR start "rule__VLSFunctionAsTerm__Group__1"
    // InternalVampireLanguage.g:5826:1: rule__VLSFunctionAsTerm__Group__1 : rule__VLSFunctionAsTerm__Group__1__Impl ;
    public final void rule__VLSFunctionAsTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5830:1: ( rule__VLSFunctionAsTerm__Group__1__Impl )
            // InternalVampireLanguage.g:5831:2: rule__VLSFunctionAsTerm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionAsTerm__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__Group__1"


    // $ANTLR start "rule__VLSFunctionAsTerm__Group__1__Impl"
    // InternalVampireLanguage.g:5837:1: rule__VLSFunctionAsTerm__Group__1__Impl : ( ( rule__VLSFunctionAsTerm__Group_1__0 )? ) ;
    public final void rule__VLSFunctionAsTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5841:1: ( ( ( rule__VLSFunctionAsTerm__Group_1__0 )? ) )
            // InternalVampireLanguage.g:5842:1: ( ( rule__VLSFunctionAsTerm__Group_1__0 )? )
            {
            // InternalVampireLanguage.g:5842:1: ( ( rule__VLSFunctionAsTerm__Group_1__0 )? )
            // InternalVampireLanguage.g:5843:2: ( rule__VLSFunctionAsTerm__Group_1__0 )?
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getGroup_1()); 
            // InternalVampireLanguage.g:5844:2: ( rule__VLSFunctionAsTerm__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==55) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalVampireLanguage.g:5844:3: rule__VLSFunctionAsTerm__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VLSFunctionAsTerm__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVLSFunctionAsTermAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__Group__1__Impl"


    // $ANTLR start "rule__VLSFunctionAsTerm__Group_1__0"
    // InternalVampireLanguage.g:5853:1: rule__VLSFunctionAsTerm__Group_1__0 : rule__VLSFunctionAsTerm__Group_1__0__Impl rule__VLSFunctionAsTerm__Group_1__1 ;
    public final void rule__VLSFunctionAsTerm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5857:1: ( rule__VLSFunctionAsTerm__Group_1__0__Impl rule__VLSFunctionAsTerm__Group_1__1 )
            // InternalVampireLanguage.g:5858:2: rule__VLSFunctionAsTerm__Group_1__0__Impl rule__VLSFunctionAsTerm__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__VLSFunctionAsTerm__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFunctionAsTerm__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__Group_1__0"


    // $ANTLR start "rule__VLSFunctionAsTerm__Group_1__0__Impl"
    // InternalVampireLanguage.g:5865:1: rule__VLSFunctionAsTerm__Group_1__0__Impl : ( '(' ) ;
    public final void rule__VLSFunctionAsTerm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5869:1: ( ( '(' ) )
            // InternalVampireLanguage.g:5870:1: ( '(' )
            {
            // InternalVampireLanguage.g:5870:1: ( '(' )
            // InternalVampireLanguage.g:5871:2: '('
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getVLSFunctionAsTermAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__Group_1__0__Impl"


    // $ANTLR start "rule__VLSFunctionAsTerm__Group_1__1"
    // InternalVampireLanguage.g:5880:1: rule__VLSFunctionAsTerm__Group_1__1 : rule__VLSFunctionAsTerm__Group_1__1__Impl rule__VLSFunctionAsTerm__Group_1__2 ;
    public final void rule__VLSFunctionAsTerm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5884:1: ( rule__VLSFunctionAsTerm__Group_1__1__Impl rule__VLSFunctionAsTerm__Group_1__2 )
            // InternalVampireLanguage.g:5885:2: rule__VLSFunctionAsTerm__Group_1__1__Impl rule__VLSFunctionAsTerm__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__VLSFunctionAsTerm__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFunctionAsTerm__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__Group_1__1"


    // $ANTLR start "rule__VLSFunctionAsTerm__Group_1__1__Impl"
    // InternalVampireLanguage.g:5892:1: rule__VLSFunctionAsTerm__Group_1__1__Impl : ( ( rule__VLSFunctionAsTerm__TermsAssignment_1_1 ) ) ;
    public final void rule__VLSFunctionAsTerm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5896:1: ( ( ( rule__VLSFunctionAsTerm__TermsAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:5897:1: ( ( rule__VLSFunctionAsTerm__TermsAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:5897:1: ( ( rule__VLSFunctionAsTerm__TermsAssignment_1_1 ) )
            // InternalVampireLanguage.g:5898:2: ( rule__VLSFunctionAsTerm__TermsAssignment_1_1 )
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getTermsAssignment_1_1()); 
            // InternalVampireLanguage.g:5899:2: ( rule__VLSFunctionAsTerm__TermsAssignment_1_1 )
            // InternalVampireLanguage.g:5899:3: rule__VLSFunctionAsTerm__TermsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionAsTerm__TermsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSFunctionAsTermAccess().getTermsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__Group_1__1__Impl"


    // $ANTLR start "rule__VLSFunctionAsTerm__Group_1__2"
    // InternalVampireLanguage.g:5907:1: rule__VLSFunctionAsTerm__Group_1__2 : rule__VLSFunctionAsTerm__Group_1__2__Impl rule__VLSFunctionAsTerm__Group_1__3 ;
    public final void rule__VLSFunctionAsTerm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5911:1: ( rule__VLSFunctionAsTerm__Group_1__2__Impl rule__VLSFunctionAsTerm__Group_1__3 )
            // InternalVampireLanguage.g:5912:2: rule__VLSFunctionAsTerm__Group_1__2__Impl rule__VLSFunctionAsTerm__Group_1__3
            {
            pushFollow(FOLLOW_27);
            rule__VLSFunctionAsTerm__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFunctionAsTerm__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__Group_1__2"


    // $ANTLR start "rule__VLSFunctionAsTerm__Group_1__2__Impl"
    // InternalVampireLanguage.g:5919:1: rule__VLSFunctionAsTerm__Group_1__2__Impl : ( ( rule__VLSFunctionAsTerm__Group_1_2__0 )* ) ;
    public final void rule__VLSFunctionAsTerm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5923:1: ( ( ( rule__VLSFunctionAsTerm__Group_1_2__0 )* ) )
            // InternalVampireLanguage.g:5924:1: ( ( rule__VLSFunctionAsTerm__Group_1_2__0 )* )
            {
            // InternalVampireLanguage.g:5924:1: ( ( rule__VLSFunctionAsTerm__Group_1_2__0 )* )
            // InternalVampireLanguage.g:5925:2: ( rule__VLSFunctionAsTerm__Group_1_2__0 )*
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getGroup_1_2()); 
            // InternalVampireLanguage.g:5926:2: ( rule__VLSFunctionAsTerm__Group_1_2__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==56) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalVampireLanguage.g:5926:3: rule__VLSFunctionAsTerm__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__VLSFunctionAsTerm__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getVLSFunctionAsTermAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__Group_1__2__Impl"


    // $ANTLR start "rule__VLSFunctionAsTerm__Group_1__3"
    // InternalVampireLanguage.g:5934:1: rule__VLSFunctionAsTerm__Group_1__3 : rule__VLSFunctionAsTerm__Group_1__3__Impl ;
    public final void rule__VLSFunctionAsTerm__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5938:1: ( rule__VLSFunctionAsTerm__Group_1__3__Impl )
            // InternalVampireLanguage.g:5939:2: rule__VLSFunctionAsTerm__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionAsTerm__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__Group_1__3"


    // $ANTLR start "rule__VLSFunctionAsTerm__Group_1__3__Impl"
    // InternalVampireLanguage.g:5945:1: rule__VLSFunctionAsTerm__Group_1__3__Impl : ( ')' ) ;
    public final void rule__VLSFunctionAsTerm__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5949:1: ( ( ')' ) )
            // InternalVampireLanguage.g:5950:1: ( ')' )
            {
            // InternalVampireLanguage.g:5950:1: ( ')' )
            // InternalVampireLanguage.g:5951:2: ')'
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getRightParenthesisKeyword_1_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getVLSFunctionAsTermAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__Group_1__3__Impl"


    // $ANTLR start "rule__VLSFunctionAsTerm__Group_1_2__0"
    // InternalVampireLanguage.g:5961:1: rule__VLSFunctionAsTerm__Group_1_2__0 : rule__VLSFunctionAsTerm__Group_1_2__0__Impl rule__VLSFunctionAsTerm__Group_1_2__1 ;
    public final void rule__VLSFunctionAsTerm__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5965:1: ( rule__VLSFunctionAsTerm__Group_1_2__0__Impl rule__VLSFunctionAsTerm__Group_1_2__1 )
            // InternalVampireLanguage.g:5966:2: rule__VLSFunctionAsTerm__Group_1_2__0__Impl rule__VLSFunctionAsTerm__Group_1_2__1
            {
            pushFollow(FOLLOW_36);
            rule__VLSFunctionAsTerm__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSFunctionAsTerm__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__Group_1_2__0"


    // $ANTLR start "rule__VLSFunctionAsTerm__Group_1_2__0__Impl"
    // InternalVampireLanguage.g:5973:1: rule__VLSFunctionAsTerm__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__VLSFunctionAsTerm__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5977:1: ( ( ',' ) )
            // InternalVampireLanguage.g:5978:1: ( ',' )
            {
            // InternalVampireLanguage.g:5978:1: ( ',' )
            // InternalVampireLanguage.g:5979:2: ','
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getCommaKeyword_1_2_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getVLSFunctionAsTermAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__Group_1_2__0__Impl"


    // $ANTLR start "rule__VLSFunctionAsTerm__Group_1_2__1"
    // InternalVampireLanguage.g:5988:1: rule__VLSFunctionAsTerm__Group_1_2__1 : rule__VLSFunctionAsTerm__Group_1_2__1__Impl ;
    public final void rule__VLSFunctionAsTerm__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5992:1: ( rule__VLSFunctionAsTerm__Group_1_2__1__Impl )
            // InternalVampireLanguage.g:5993:2: rule__VLSFunctionAsTerm__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionAsTerm__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__Group_1_2__1"


    // $ANTLR start "rule__VLSFunctionAsTerm__Group_1_2__1__Impl"
    // InternalVampireLanguage.g:5999:1: rule__VLSFunctionAsTerm__Group_1_2__1__Impl : ( ( rule__VLSFunctionAsTerm__TermsAssignment_1_2_1 ) ) ;
    public final void rule__VLSFunctionAsTerm__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6003:1: ( ( ( rule__VLSFunctionAsTerm__TermsAssignment_1_2_1 ) ) )
            // InternalVampireLanguage.g:6004:1: ( ( rule__VLSFunctionAsTerm__TermsAssignment_1_2_1 ) )
            {
            // InternalVampireLanguage.g:6004:1: ( ( rule__VLSFunctionAsTerm__TermsAssignment_1_2_1 ) )
            // InternalVampireLanguage.g:6005:2: ( rule__VLSFunctionAsTerm__TermsAssignment_1_2_1 )
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getTermsAssignment_1_2_1()); 
            // InternalVampireLanguage.g:6006:2: ( rule__VLSFunctionAsTerm__TermsAssignment_1_2_1 )
            // InternalVampireLanguage.g:6006:3: rule__VLSFunctionAsTerm__TermsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionAsTerm__TermsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVLSFunctionAsTermAccess().getTermsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__Group_1_2__1__Impl"


    // $ANTLR start "rule__VLSDefinedTerm__Group_0__0"
    // InternalVampireLanguage.g:6015:1: rule__VLSDefinedTerm__Group_0__0 : rule__VLSDefinedTerm__Group_0__0__Impl rule__VLSDefinedTerm__Group_0__1 ;
    public final void rule__VLSDefinedTerm__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6019:1: ( rule__VLSDefinedTerm__Group_0__0__Impl rule__VLSDefinedTerm__Group_0__1 )
            // InternalVampireLanguage.g:6020:2: rule__VLSDefinedTerm__Group_0__0__Impl rule__VLSDefinedTerm__Group_0__1
            {
            pushFollow(FOLLOW_61);
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
    // InternalVampireLanguage.g:6027:1: rule__VLSDefinedTerm__Group_0__0__Impl : ( () ) ;
    public final void rule__VLSDefinedTerm__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6031:1: ( ( () ) )
            // InternalVampireLanguage.g:6032:1: ( () )
            {
            // InternalVampireLanguage.g:6032:1: ( () )
            // InternalVampireLanguage.g:6033:2: ()
            {
             before(grammarAccess.getVLSDefinedTermAccess().getVLSIntAction_0_0()); 
            // InternalVampireLanguage.g:6034:2: ()
            // InternalVampireLanguage.g:6034:3: 
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
    // InternalVampireLanguage.g:6042:1: rule__VLSDefinedTerm__Group_0__1 : rule__VLSDefinedTerm__Group_0__1__Impl ;
    public final void rule__VLSDefinedTerm__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6046:1: ( rule__VLSDefinedTerm__Group_0__1__Impl )
            // InternalVampireLanguage.g:6047:2: rule__VLSDefinedTerm__Group_0__1__Impl
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
    // InternalVampireLanguage.g:6053:1: rule__VLSDefinedTerm__Group_0__1__Impl : ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) ) ;
    public final void rule__VLSDefinedTerm__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6057:1: ( ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) ) )
            // InternalVampireLanguage.g:6058:1: ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) )
            {
            // InternalVampireLanguage.g:6058:1: ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) )
            // InternalVampireLanguage.g:6059:2: ( rule__VLSDefinedTerm__ValueAssignment_0_1 )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_0_1()); 
            // InternalVampireLanguage.g:6060:2: ( rule__VLSDefinedTerm__ValueAssignment_0_1 )
            // InternalVampireLanguage.g:6060:3: rule__VLSDefinedTerm__ValueAssignment_0_1
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
    // InternalVampireLanguage.g:6069:1: rule__VLSDefinedTerm__Group_1__0 : rule__VLSDefinedTerm__Group_1__0__Impl rule__VLSDefinedTerm__Group_1__1 ;
    public final void rule__VLSDefinedTerm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6073:1: ( rule__VLSDefinedTerm__Group_1__0__Impl rule__VLSDefinedTerm__Group_1__1 )
            // InternalVampireLanguage.g:6074:2: rule__VLSDefinedTerm__Group_1__0__Impl rule__VLSDefinedTerm__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalVampireLanguage.g:6081:1: rule__VLSDefinedTerm__Group_1__0__Impl : ( () ) ;
    public final void rule__VLSDefinedTerm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6085:1: ( ( () ) )
            // InternalVampireLanguage.g:6086:1: ( () )
            {
            // InternalVampireLanguage.g:6086:1: ( () )
            // InternalVampireLanguage.g:6087:2: ()
            {
             before(grammarAccess.getVLSDefinedTermAccess().getVLSDoubleQuoteAction_1_0()); 
            // InternalVampireLanguage.g:6088:2: ()
            // InternalVampireLanguage.g:6088:3: 
            {
            }

             after(grammarAccess.getVLSDefinedTermAccess().getVLSDoubleQuoteAction_1_0()); 

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
    // InternalVampireLanguage.g:6096:1: rule__VLSDefinedTerm__Group_1__1 : rule__VLSDefinedTerm__Group_1__1__Impl ;
    public final void rule__VLSDefinedTerm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6100:1: ( rule__VLSDefinedTerm__Group_1__1__Impl )
            // InternalVampireLanguage.g:6101:2: rule__VLSDefinedTerm__Group_1__1__Impl
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
    // InternalVampireLanguage.g:6107:1: rule__VLSDefinedTerm__Group_1__1__Impl : ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) ) ;
    public final void rule__VLSDefinedTerm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6111:1: ( ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:6112:1: ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:6112:1: ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) )
            // InternalVampireLanguage.g:6113:2: ( rule__VLSDefinedTerm__ValueAssignment_1_1 )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_1_1()); 
            // InternalVampireLanguage.g:6114:2: ( rule__VLSDefinedTerm__ValueAssignment_1_1 )
            // InternalVampireLanguage.g:6114:3: rule__VLSDefinedTerm__ValueAssignment_1_1
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


    // $ANTLR start "rule__VampireModel__CommentsAssignment_0"
    // InternalVampireLanguage.g:6123:1: rule__VampireModel__CommentsAssignment_0 : ( ruleVLSComment ) ;
    public final void rule__VampireModel__CommentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6127:1: ( ( ruleVLSComment ) )
            // InternalVampireLanguage.g:6128:2: ( ruleVLSComment )
            {
            // InternalVampireLanguage.g:6128:2: ( ruleVLSComment )
            // InternalVampireLanguage.g:6129:3: ruleVLSComment
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


    // $ANTLR start "rule__VampireModel__ConfirmationsAssignment_1"
    // InternalVampireLanguage.g:6138:1: rule__VampireModel__ConfirmationsAssignment_1 : ( ruleVLSConfirmations ) ;
    public final void rule__VampireModel__ConfirmationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6142:1: ( ( ruleVLSConfirmations ) )
            // InternalVampireLanguage.g:6143:2: ( ruleVLSConfirmations )
            {
            // InternalVampireLanguage.g:6143:2: ( ruleVLSConfirmations )
            // InternalVampireLanguage.g:6144:3: ruleVLSConfirmations
            {
             before(grammarAccess.getVampireModelAccess().getConfirmationsVLSConfirmationsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSConfirmations();

            state._fsp--;

             after(grammarAccess.getVampireModelAccess().getConfirmationsVLSConfirmationsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VampireModel__ConfirmationsAssignment_1"


    // $ANTLR start "rule__VampireModel__FormulasAssignment_2"
    // InternalVampireLanguage.g:6153:1: rule__VampireModel__FormulasAssignment_2 : ( ruleVLSFofFormula ) ;
    public final void rule__VampireModel__FormulasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6157:1: ( ( ruleVLSFofFormula ) )
            // InternalVampireLanguage.g:6158:2: ( ruleVLSFofFormula )
            {
            // InternalVampireLanguage.g:6158:2: ( ruleVLSFofFormula )
            // InternalVampireLanguage.g:6159:3: ruleVLSFofFormula
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


    // $ANTLR start "rule__VampireModel__TfformulasAssignment_3"
    // InternalVampireLanguage.g:6168:1: rule__VampireModel__TfformulasAssignment_3 : ( ruleVLSTffFormula ) ;
    public final void rule__VampireModel__TfformulasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6172:1: ( ( ruleVLSTffFormula ) )
            // InternalVampireLanguage.g:6173:2: ( ruleVLSTffFormula )
            {
            // InternalVampireLanguage.g:6173:2: ( ruleVLSTffFormula )
            // InternalVampireLanguage.g:6174:3: ruleVLSTffFormula
            {
             before(grammarAccess.getVampireModelAccess().getTfformulasVLSTffFormulaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSTffFormula();

            state._fsp--;

             after(grammarAccess.getVampireModelAccess().getTfformulasVLSTffFormulaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VampireModel__TfformulasAssignment_3"


    // $ANTLR start "rule__VLSComment__CommentAssignment"
    // InternalVampireLanguage.g:6183:1: rule__VLSComment__CommentAssignment : ( RULE_SINGLE_COMMENT ) ;
    public final void rule__VLSComment__CommentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6187:1: ( ( RULE_SINGLE_COMMENT ) )
            // InternalVampireLanguage.g:6188:2: ( RULE_SINGLE_COMMENT )
            {
            // InternalVampireLanguage.g:6188:2: ( RULE_SINGLE_COMMENT )
            // InternalVampireLanguage.g:6189:3: RULE_SINGLE_COMMENT
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


    // $ANTLR start "rule__VLSConfirmations__NameAssignment_2_3"
    // InternalVampireLanguage.g:6198:1: rule__VLSConfirmations__NameAssignment_2_3 : ( RULE_LITERAL ) ;
    public final void rule__VLSConfirmations__NameAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6202:1: ( ( RULE_LITERAL ) )
            // InternalVampireLanguage.g:6203:2: ( RULE_LITERAL )
            {
            // InternalVampireLanguage.g:6203:2: ( RULE_LITERAL )
            // InternalVampireLanguage.g:6204:3: RULE_LITERAL
            {
             before(grammarAccess.getVLSConfirmationsAccess().getNameLITERALTerminalRuleCall_2_3_0()); 
            match(input,RULE_LITERAL,FOLLOW_2); 
             after(grammarAccess.getVLSConfirmationsAccess().getNameLITERALTerminalRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSConfirmations__NameAssignment_2_3"


    // $ANTLR start "rule__VLSFofFormula__NameAssignment_2"
    // InternalVampireLanguage.g:6213:1: rule__VLSFofFormula__NameAssignment_2 : ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) ) ;
    public final void rule__VLSFofFormula__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6217:1: ( ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) ) )
            // InternalVampireLanguage.g:6218:2: ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) )
            {
            // InternalVampireLanguage.g:6218:2: ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) )
            // InternalVampireLanguage.g:6219:3: ( rule__VLSFofFormula__NameAlternatives_2_0 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getNameAlternatives_2_0()); 
            // InternalVampireLanguage.g:6220:3: ( rule__VLSFofFormula__NameAlternatives_2_0 )
            // InternalVampireLanguage.g:6220:4: rule__VLSFofFormula__NameAlternatives_2_0
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
    // InternalVampireLanguage.g:6228:1: rule__VLSFofFormula__FofRoleAssignment_4 : ( ruleVLSRole ) ;
    public final void rule__VLSFofFormula__FofRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6232:1: ( ( ruleVLSRole ) )
            // InternalVampireLanguage.g:6233:2: ( ruleVLSRole )
            {
            // InternalVampireLanguage.g:6233:2: ( ruleVLSRole )
            // InternalVampireLanguage.g:6234:3: ruleVLSRole
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
    // InternalVampireLanguage.g:6243:1: rule__VLSFofFormula__FofFormulaAssignment_6 : ( ruleVLSTerm ) ;
    public final void rule__VLSFofFormula__FofFormulaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6247:1: ( ( ruleVLSTerm ) )
            // InternalVampireLanguage.g:6248:2: ( ruleVLSTerm )
            {
            // InternalVampireLanguage.g:6248:2: ( ruleVLSTerm )
            // InternalVampireLanguage.g:6249:3: ruleVLSTerm
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
    // InternalVampireLanguage.g:6258:1: rule__VLSFofFormula__AnnotationsAssignment_7_1 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSFofFormula__AnnotationsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6262:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:6263:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:6263:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:6264:3: ruleVLSAnnotation
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


    // $ANTLR start "rule__VLSTffFormula__NameAssignment_2"
    // InternalVampireLanguage.g:6273:1: rule__VLSTffFormula__NameAssignment_2 : ( ruleVLSTffName ) ;
    public final void rule__VLSTffFormula__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6277:1: ( ( ruleVLSTffName ) )
            // InternalVampireLanguage.g:6278:2: ( ruleVLSTffName )
            {
            // InternalVampireLanguage.g:6278:2: ( ruleVLSTffName )
            // InternalVampireLanguage.g:6279:3: ruleVLSTffName
            {
             before(grammarAccess.getVLSTffFormulaAccess().getNameVLSTffNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSTffName();

            state._fsp--;

             after(grammarAccess.getVLSTffFormulaAccess().getNameVLSTffNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__NameAssignment_2"


    // $ANTLR start "rule__VLSTffFormula__TffRoleAssignment_4"
    // InternalVampireLanguage.g:6288:1: rule__VLSTffFormula__TffRoleAssignment_4 : ( ruleVLSRole ) ;
    public final void rule__VLSTffFormula__TffRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6292:1: ( ( ruleVLSRole ) )
            // InternalVampireLanguage.g:6293:2: ( ruleVLSRole )
            {
            // InternalVampireLanguage.g:6293:2: ( ruleVLSRole )
            // InternalVampireLanguage.g:6294:3: ruleVLSRole
            {
             before(grammarAccess.getVLSTffFormulaAccess().getTffRoleVLSRoleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSRole();

            state._fsp--;

             after(grammarAccess.getVLSTffFormulaAccess().getTffRoleVLSRoleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__TffRoleAssignment_4"


    // $ANTLR start "rule__VLSTffFormula__FofFormulaAssignment_6"
    // InternalVampireLanguage.g:6303:1: rule__VLSTffFormula__FofFormulaAssignment_6 : ( ruleVLSTffTerm ) ;
    public final void rule__VLSTffFormula__FofFormulaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6307:1: ( ( ruleVLSTffTerm ) )
            // InternalVampireLanguage.g:6308:2: ( ruleVLSTffTerm )
            {
            // InternalVampireLanguage.g:6308:2: ( ruleVLSTffTerm )
            // InternalVampireLanguage.g:6309:3: ruleVLSTffTerm
            {
             before(grammarAccess.getVLSTffFormulaAccess().getFofFormulaVLSTffTermParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSTffTerm();

            state._fsp--;

             after(grammarAccess.getVLSTffFormulaAccess().getFofFormulaVLSTffTermParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__FofFormulaAssignment_6"


    // $ANTLR start "rule__VLSTffFormula__AnnotationsAssignment_7_1"
    // InternalVampireLanguage.g:6318:1: rule__VLSTffFormula__AnnotationsAssignment_7_1 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSTffFormula__AnnotationsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6322:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:6323:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:6323:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:6324:3: ruleVLSAnnotation
            {
             before(grammarAccess.getVLSTffFormulaAccess().getAnnotationsVLSAnnotationParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSAnnotation();

            state._fsp--;

             after(grammarAccess.getVLSTffFormulaAccess().getAnnotationsVLSAnnotationParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__AnnotationsAssignment_7_1"


    // $ANTLR start "rule__VLSAnnotation__NameAssignment_1"
    // InternalVampireLanguage.g:6333:1: rule__VLSAnnotation__NameAssignment_1 : ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) ) ;
    public final void rule__VLSAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6337:1: ( ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) ) )
            // InternalVampireLanguage.g:6338:2: ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) )
            {
            // InternalVampireLanguage.g:6338:2: ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) )
            // InternalVampireLanguage.g:6339:3: ( rule__VLSAnnotation__NameAlternatives_1_0 )
            {
             before(grammarAccess.getVLSAnnotationAccess().getNameAlternatives_1_0()); 
            // InternalVampireLanguage.g:6340:3: ( rule__VLSAnnotation__NameAlternatives_1_0 )
            // InternalVampireLanguage.g:6340:4: rule__VLSAnnotation__NameAlternatives_1_0
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
    // InternalVampireLanguage.g:6348:1: rule__VLSAnnotation__FollowupAssignment_2_1 : ( ruleVLSAnnotationTerms ) ;
    public final void rule__VLSAnnotation__FollowupAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6352:1: ( ( ruleVLSAnnotationTerms ) )
            // InternalVampireLanguage.g:6353:2: ( ruleVLSAnnotationTerms )
            {
            // InternalVampireLanguage.g:6353:2: ( ruleVLSAnnotationTerms )
            // InternalVampireLanguage.g:6354:3: ruleVLSAnnotationTerms
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
    // InternalVampireLanguage.g:6363:1: rule__VLSAnnotationTerms__TermsAssignment_0 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSAnnotationTerms__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6367:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:6368:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:6368:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:6369:3: ruleVLSAnnotation
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
    // InternalVampireLanguage.g:6378:1: rule__VLSAnnotationTerms__TermsAssignment_1_1 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSAnnotationTerms__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6382:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:6383:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:6383:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:6384:3: ruleVLSAnnotation
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


    // $ANTLR start "rule__VLSCommentTerm__CommentAssignment"
    // InternalVampireLanguage.g:6393:1: rule__VLSCommentTerm__CommentAssignment : ( RULE_SINGLE_COMMENT ) ;
    public final void rule__VLSCommentTerm__CommentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6397:1: ( ( RULE_SINGLE_COMMENT ) )
            // InternalVampireLanguage.g:6398:2: ( RULE_SINGLE_COMMENT )
            {
            // InternalVampireLanguage.g:6398:2: ( RULE_SINGLE_COMMENT )
            // InternalVampireLanguage.g:6399:3: RULE_SINGLE_COMMENT
            {
             before(grammarAccess.getVLSCommentTermAccess().getCommentSINGLE_COMMENTTerminalRuleCall_0()); 
            match(input,RULE_SINGLE_COMMENT,FOLLOW_2); 
             after(grammarAccess.getVLSCommentTermAccess().getCommentSINGLE_COMMENTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSCommentTerm__CommentAssignment"


    // $ANTLR start "rule__VLSOtherDeclaration__NameAssignment_0"
    // InternalVampireLanguage.g:6408:1: rule__VLSOtherDeclaration__NameAssignment_0 : ( ruleVLSAtomicConstant ) ;
    public final void rule__VLSOtherDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6412:1: ( ( ruleVLSAtomicConstant ) )
            // InternalVampireLanguage.g:6413:2: ( ruleVLSAtomicConstant )
            {
            // InternalVampireLanguage.g:6413:2: ( ruleVLSAtomicConstant )
            // InternalVampireLanguage.g:6414:3: ruleVLSAtomicConstant
            {
             before(grammarAccess.getVLSOtherDeclarationAccess().getNameVLSAtomicConstantParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSAtomicConstant();

            state._fsp--;

             after(grammarAccess.getVLSOtherDeclarationAccess().getNameVLSAtomicConstantParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSOtherDeclaration__NameAssignment_0"


    // $ANTLR start "rule__VLSOtherDeclaration__TypeAssignment_2"
    // InternalVampireLanguage.g:6423:1: rule__VLSOtherDeclaration__TypeAssignment_2 : ( ruleVLSTypeDef ) ;
    public final void rule__VLSOtherDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6427:1: ( ( ruleVLSTypeDef ) )
            // InternalVampireLanguage.g:6428:2: ( ruleVLSTypeDef )
            {
            // InternalVampireLanguage.g:6428:2: ( ruleVLSTypeDef )
            // InternalVampireLanguage.g:6429:3: ruleVLSTypeDef
            {
             before(grammarAccess.getVLSOtherDeclarationAccess().getTypeVLSTypeDefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSTypeDef();

            state._fsp--;

             after(grammarAccess.getVLSOtherDeclarationAccess().getTypeVLSTypeDefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSOtherDeclaration__TypeAssignment_2"


    // $ANTLR start "rule__VLSVariableDeclaration__NameAssignment_0"
    // InternalVampireLanguage.g:6438:1: rule__VLSVariableDeclaration__NameAssignment_0 : ( ruleVLSVariable ) ;
    public final void rule__VLSVariableDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6442:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:6443:2: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:6443:2: ( ruleVLSVariable )
            // InternalVampireLanguage.g:6444:3: ruleVLSVariable
            {
             before(grammarAccess.getVLSVariableDeclarationAccess().getNameVLSVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSVariable();

            state._fsp--;

             after(grammarAccess.getVLSVariableDeclarationAccess().getNameVLSVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSVariableDeclaration__NameAssignment_0"


    // $ANTLR start "rule__VLSVariableDeclaration__TypeAssignment_2"
    // InternalVampireLanguage.g:6453:1: rule__VLSVariableDeclaration__TypeAssignment_2 : ( ruleVLSTypeDef ) ;
    public final void rule__VLSVariableDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6457:1: ( ( ruleVLSTypeDef ) )
            // InternalVampireLanguage.g:6458:2: ( ruleVLSTypeDef )
            {
            // InternalVampireLanguage.g:6458:2: ( ruleVLSTypeDef )
            // InternalVampireLanguage.g:6459:3: ruleVLSTypeDef
            {
             before(grammarAccess.getVLSVariableDeclarationAccess().getTypeVLSTypeDefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSTypeDef();

            state._fsp--;

             after(grammarAccess.getVLSVariableDeclarationAccess().getTypeVLSTypeDefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSVariableDeclaration__TypeAssignment_2"


    // $ANTLR start "rule__VLSTypeDef__TypeSigAssignment_0"
    // InternalVampireLanguage.g:6468:1: rule__VLSTypeDef__TypeSigAssignment_0 : ( ruleVLSUnitaryTerm ) ;
    public final void rule__VLSTypeDef__TypeSigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6472:1: ( ( ruleVLSUnitaryTerm ) )
            // InternalVampireLanguage.g:6473:2: ( ruleVLSUnitaryTerm )
            {
            // InternalVampireLanguage.g:6473:2: ( ruleVLSUnitaryTerm )
            // InternalVampireLanguage.g:6474:3: ruleVLSUnitaryTerm
            {
             before(grammarAccess.getVLSTypeDefAccess().getTypeSigVLSUnitaryTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSUnitaryTerm();

            state._fsp--;

             after(grammarAccess.getVLSTypeDefAccess().getTypeSigVLSUnitaryTermParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTypeDef__TypeSigAssignment_0"


    // $ANTLR start "rule__VLSTypeDef__MapsToAssignment_1_1"
    // InternalVampireLanguage.g:6483:1: rule__VLSTypeDef__MapsToAssignment_1_1 : ( ruleVLSAtomicConstant ) ;
    public final void rule__VLSTypeDef__MapsToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6487:1: ( ( ruleVLSAtomicConstant ) )
            // InternalVampireLanguage.g:6488:2: ( ruleVLSAtomicConstant )
            {
            // InternalVampireLanguage.g:6488:2: ( ruleVLSAtomicConstant )
            // InternalVampireLanguage.g:6489:3: ruleVLSAtomicConstant
            {
             before(grammarAccess.getVLSTypeDefAccess().getMapsToVLSAtomicConstantParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSAtomicConstant();

            state._fsp--;

             after(grammarAccess.getVLSTypeDefAccess().getMapsToVLSAtomicConstantParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTypeDef__MapsToAssignment_1_1"


    // $ANTLR start "rule__VLSUnitaryTerm__InitTypeAssignment_0"
    // InternalVampireLanguage.g:6498:1: rule__VLSUnitaryTerm__InitTypeAssignment_0 : ( ruleVLSAtomic ) ;
    public final void rule__VLSUnitaryTerm__InitTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6502:1: ( ( ruleVLSAtomic ) )
            // InternalVampireLanguage.g:6503:2: ( ruleVLSAtomic )
            {
            // InternalVampireLanguage.g:6503:2: ( ruleVLSAtomic )
            // InternalVampireLanguage.g:6504:3: ruleVLSAtomic
            {
             before(grammarAccess.getVLSUnitaryTermAccess().getInitTypeVLSAtomicParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSAtomic();

            state._fsp--;

             after(grammarAccess.getVLSUnitaryTermAccess().getInitTypeVLSAtomicParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnitaryTerm__InitTypeAssignment_0"


    // $ANTLR start "rule__VLSUnitaryTerm__NextTypeAssignment_1_1"
    // InternalVampireLanguage.g:6513:1: rule__VLSUnitaryTerm__NextTypeAssignment_1_1 : ( ruleVLSAtomicConstant ) ;
    public final void rule__VLSUnitaryTerm__NextTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6517:1: ( ( ruleVLSAtomicConstant ) )
            // InternalVampireLanguage.g:6518:2: ( ruleVLSAtomicConstant )
            {
            // InternalVampireLanguage.g:6518:2: ( ruleVLSAtomicConstant )
            // InternalVampireLanguage.g:6519:3: ruleVLSAtomicConstant
            {
             before(grammarAccess.getVLSUnitaryTermAccess().getNextTypeVLSAtomicConstantParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSAtomicConstant();

            state._fsp--;

             after(grammarAccess.getVLSUnitaryTermAccess().getNextTypeVLSAtomicConstantParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSUnitaryTerm__NextTypeAssignment_1_1"


    // $ANTLR start "rule__VLSBinary__RightAssignment_1_0_1"
    // InternalVampireLanguage.g:6528:1: rule__VLSBinary__RightAssignment_1_0_1 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6532:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:6533:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:6533:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:6534:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:6543:1: rule__VLSBinary__RightAssignment_1_1_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6547:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:6548:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:6548:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:6549:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:6558:1: rule__VLSBinary__RightAssignment_1_2_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6562:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:6563:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:6563:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:6564:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:6573:1: rule__VLSUniversalQuantifier__VariablesAssignment_1_2 : ( ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0 ) ) ;
    public final void rule__VLSUniversalQuantifier__VariablesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6577:1: ( ( ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0 ) ) )
            // InternalVampireLanguage.g:6578:2: ( ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0 ) )
            {
            // InternalVampireLanguage.g:6578:2: ( ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0 ) )
            // InternalVampireLanguage.g:6579:3: ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAlternatives_1_2_0()); 
            // InternalVampireLanguage.g:6580:3: ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0 )
            // InternalVampireLanguage.g:6580:4: rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAlternatives_1_2_0()); 

            }


            }

        }
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
    // InternalVampireLanguage.g:6588:1: rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 : ( ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0 ) ) ;
    public final void rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6592:1: ( ( ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0 ) ) )
            // InternalVampireLanguage.g:6593:2: ( ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0 ) )
            {
            // InternalVampireLanguage.g:6593:2: ( ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0 ) )
            // InternalVampireLanguage.g:6594:3: ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAlternatives_1_3_1_0()); 
            // InternalVampireLanguage.g:6595:3: ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0 )
            // InternalVampireLanguage.g:6595:4: rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAlternatives_1_3_1_0()); 

            }


            }

        }
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
    // InternalVampireLanguage.g:6603:1: rule__VLSUniversalQuantifier__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSUniversalQuantifier__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6607:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:6608:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:6608:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:6609:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:6618:1: rule__VLSExistentialQuantifier__VariablesAssignment_1_2 : ( ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0 ) ) ;
    public final void rule__VLSExistentialQuantifier__VariablesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6622:1: ( ( ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0 ) ) )
            // InternalVampireLanguage.g:6623:2: ( ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0 ) )
            {
            // InternalVampireLanguage.g:6623:2: ( ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0 ) )
            // InternalVampireLanguage.g:6624:3: ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAlternatives_1_2_0()); 
            // InternalVampireLanguage.g:6625:3: ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0 )
            // InternalVampireLanguage.g:6625:4: rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAlternatives_1_2_0()); 

            }


            }

        }
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
    // InternalVampireLanguage.g:6633:1: rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 : ( ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0 ) ) ;
    public final void rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6637:1: ( ( ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0 ) ) )
            // InternalVampireLanguage.g:6638:2: ( ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0 ) )
            {
            // InternalVampireLanguage.g:6638:2: ( ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0 ) )
            // InternalVampireLanguage.g:6639:3: ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAlternatives_1_3_1_0()); 
            // InternalVampireLanguage.g:6640:3: ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0 )
            // InternalVampireLanguage.g:6640:4: rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAlternatives_1_3_1_0()); 

            }


            }

        }
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
    // InternalVampireLanguage.g:6648:1: rule__VLSExistentialQuantifier__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSExistentialQuantifier__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6652:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:6653:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:6653:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:6654:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:6663:1: rule__VLSUnaryNegation__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSUnaryNegation__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6667:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:6668:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:6668:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:6669:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:6678:1: rule__VLSUnaryInfix__RightAssignment_1_1 : ( ruleVLSAtomic ) ;
    public final void rule__VLSUnaryInfix__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6682:1: ( ( ruleVLSAtomic ) )
            // InternalVampireLanguage.g:6683:2: ( ruleVLSAtomic )
            {
            // InternalVampireLanguage.g:6683:2: ( ruleVLSAtomic )
            // InternalVampireLanguage.g:6684:3: ruleVLSAtomic
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
    // InternalVampireLanguage.g:6693:1: rule__VLSAtomicConstant__NameAssignment_0_1 : ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) ) ;
    public final void rule__VLSAtomicConstant__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6697:1: ( ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) ) )
            // InternalVampireLanguage.g:6698:2: ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) )
            {
            // InternalVampireLanguage.g:6698:2: ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) )
            // InternalVampireLanguage.g:6699:3: ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getNameAlternatives_0_1_0()); 
            // InternalVampireLanguage.g:6700:3: ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 )
            // InternalVampireLanguage.g:6700:4: rule__VLSAtomicConstant__NameAlternatives_0_1_0
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
    // InternalVampireLanguage.g:6708:1: rule__VLSAtomicFunction__ConstantAssignment_0_1 : ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) ) ;
    public final void rule__VLSAtomicFunction__ConstantAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6712:1: ( ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) ) )
            // InternalVampireLanguage.g:6713:2: ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) )
            {
            // InternalVampireLanguage.g:6713:2: ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) )
            // InternalVampireLanguage.g:6714:3: ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getConstantAlternatives_0_1_0()); 
            // InternalVampireLanguage.g:6715:3: ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 )
            // InternalVampireLanguage.g:6715:4: rule__VLSAtomicFunction__ConstantAlternatives_0_1_0
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
    // InternalVampireLanguage.g:6723:1: rule__VLSAtomicFunction__TermsAssignment_0_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6727:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:6728:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:6728:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:6729:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:6738:1: rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_0_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6742:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:6743:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:6743:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:6744:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:6753:1: rule__VLSAtomicFunction__NameAssignment_1_1 : ( ( '$less' ) ) ;
    public final void rule__VLSAtomicFunction__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6757:1: ( ( ( '$less' ) ) )
            // InternalVampireLanguage.g:6758:2: ( ( '$less' ) )
            {
            // InternalVampireLanguage.g:6758:2: ( ( '$less' ) )
            // InternalVampireLanguage.g:6759:3: ( '$less' )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getNameLessKeyword_1_1_0()); 
            // InternalVampireLanguage.g:6760:3: ( '$less' )
            // InternalVampireLanguage.g:6761:4: '$less'
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getNameLessKeyword_1_1_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalVampireLanguage.g:6772:1: rule__VLSAtomicFunction__TermsAssignment_1_3 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6776:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:6777:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:6777:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:6778:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:6787:1: rule__VLSAtomicFunction__TermsAssignment_1_5 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6791:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:6792:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:6792:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:6793:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:6802:1: rule__VLSVariable__NameAssignment : ( RULE_UPPER_WORD_ID ) ;
    public final void rule__VLSVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6806:1: ( ( RULE_UPPER_WORD_ID ) )
            // InternalVampireLanguage.g:6807:2: ( RULE_UPPER_WORD_ID )
            {
            // InternalVampireLanguage.g:6807:2: ( RULE_UPPER_WORD_ID )
            // InternalVampireLanguage.g:6808:3: RULE_UPPER_WORD_ID
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


    // $ANTLR start "rule__VLSFunctionAsTerm__FunctorAssignment_0"
    // InternalVampireLanguage.g:6817:1: rule__VLSFunctionAsTerm__FunctorAssignment_0 : ( ( rule__VLSFunctionAsTerm__FunctorAlternatives_0_0 ) ) ;
    public final void rule__VLSFunctionAsTerm__FunctorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6821:1: ( ( ( rule__VLSFunctionAsTerm__FunctorAlternatives_0_0 ) ) )
            // InternalVampireLanguage.g:6822:2: ( ( rule__VLSFunctionAsTerm__FunctorAlternatives_0_0 ) )
            {
            // InternalVampireLanguage.g:6822:2: ( ( rule__VLSFunctionAsTerm__FunctorAlternatives_0_0 ) )
            // InternalVampireLanguage.g:6823:3: ( rule__VLSFunctionAsTerm__FunctorAlternatives_0_0 )
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getFunctorAlternatives_0_0()); 
            // InternalVampireLanguage.g:6824:3: ( rule__VLSFunctionAsTerm__FunctorAlternatives_0_0 )
            // InternalVampireLanguage.g:6824:4: rule__VLSFunctionAsTerm__FunctorAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSFunctionAsTerm__FunctorAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSFunctionAsTermAccess().getFunctorAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__FunctorAssignment_0"


    // $ANTLR start "rule__VLSFunctionAsTerm__TermsAssignment_1_1"
    // InternalVampireLanguage.g:6832:1: rule__VLSFunctionAsTerm__TermsAssignment_1_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSFunctionAsTerm__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6836:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:6837:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:6837:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:6838:3: ruleVLSFofTerm
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getTermsVLSFofTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSFofTerm();

            state._fsp--;

             after(grammarAccess.getVLSFunctionAsTermAccess().getTermsVLSFofTermParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__TermsAssignment_1_1"


    // $ANTLR start "rule__VLSFunctionAsTerm__TermsAssignment_1_2_1"
    // InternalVampireLanguage.g:6847:1: rule__VLSFunctionAsTerm__TermsAssignment_1_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSFunctionAsTerm__TermsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6851:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:6852:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:6852:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:6853:3: ruleVLSFofTerm
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getTermsVLSFofTermParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSFofTerm();

            state._fsp--;

             after(grammarAccess.getVLSFunctionAsTermAccess().getTermsVLSFofTermParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSFunctionAsTerm__TermsAssignment_1_2_1"


    // $ANTLR start "rule__VLSDefinedTerm__ValueAssignment_0_1"
    // InternalVampireLanguage.g:6862:1: rule__VLSDefinedTerm__ValueAssignment_0_1 : ( RULE_SIGNED_LITERAL ) ;
    public final void rule__VLSDefinedTerm__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6866:1: ( ( RULE_SIGNED_LITERAL ) )
            // InternalVampireLanguage.g:6867:2: ( RULE_SIGNED_LITERAL )
            {
            // InternalVampireLanguage.g:6867:2: ( RULE_SIGNED_LITERAL )
            // InternalVampireLanguage.g:6868:3: RULE_SIGNED_LITERAL
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
    // InternalVampireLanguage.g:6877:1: rule__VLSDefinedTerm__ValueAssignment_1_1 : ( RULE_DOUBLE_QUOTE ) ;
    public final void rule__VLSDefinedTerm__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6881:1: ( ( RULE_DOUBLE_QUOTE ) )
            // InternalVampireLanguage.g:6882:2: ( RULE_DOUBLE_QUOTE )
            {
            // InternalVampireLanguage.g:6882:2: ( RULE_DOUBLE_QUOTE )
            // InternalVampireLanguage.g:6883:3: RULE_DOUBLE_QUOTE
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueDOUBLE_QUOTETerminalRuleCall_1_1_0()); 
            match(input,RULE_DOUBLE_QUOTE,FOLLOW_2); 
             after(grammarAccess.getVLSDefinedTermAccess().getValueDOUBLE_QUOTETerminalRuleCall_1_1_0()); 

            }


            }

        }
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

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\2\uffff\26\1\2\uffff";
    static final String dfa_3s = "\1\4\1\uffff\23\67\3\70\2\uffff";
    static final String dfa_4s = "\1\120\1\uffff\26\115\2\uffff";
    static final String dfa_5s = "\1\uffff\1\1\26\uffff\1\3\1\2";
    static final String dfa_6s = "\32\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\1\1\3\1\4\1\5\1\30\1\uffff\1\27\1\1\13\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\20\uffff\1\1\20\uffff\3\1\3\uffff\1\25\1\26\1\1",
            "",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\2\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\2\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
            "\2\1\3\uffff\1\31\2\uffff\10\1\3\uffff\3\1",
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

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1144:1: rule__VLSTffTerm__Alternatives : ( ( ruleVLSTerm ) | ( ruleVLSDeclaration ) | ( ruleVLSCommentTerm ) );";
        }
    }
    static final String dfa_8s = "\30\uffff";
    static final String dfa_9s = "\1\uffff\23\24\4\uffff";
    static final String dfa_10s = "\1\4\23\62\4\uffff";
    static final String dfa_11s = "\1\120\23\115\4\uffff";
    static final String dfa_12s = "\24\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_13s = "\30\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\27\1\2\1\3\1\4\2\uffff\1\26\1\27\13\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\47\uffff\2\24\1\25",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\4\uffff\12\24\3\uffff\3\24",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1428:1: rule__VLSAtomic__Alternatives : ( ( ruleVLSAtomicConstant ) | ( ruleVLSAtomicFunction ) | ( ruleVLSVariable ) | ( ruleVLSDefinedTerm ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0849018000000202L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0009018000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000007FFF000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0080007FFF0019F0L,0x000000000001C700L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0086007FFF000050L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x1000000000C00010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0080007FFF001BF0L,0x000000000001C700L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000007FFF0019F0L,0x000000000001C000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000007FFF0001D0L,0x000000000000C000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0104000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003800L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000007FFF0001D0L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000007FFF0001D0L,0x0000000000010000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000020L});

}