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


    // $ANTLR start "entryRuleVLSDeclaration"
    // InternalVampireLanguage.g:378:1: entryRuleVLSDeclaration : ruleVLSDeclaration EOF ;
    public final void entryRuleVLSDeclaration() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:379:1: ( ruleVLSDeclaration EOF )
            // InternalVampireLanguage.g:380:1: ruleVLSDeclaration EOF
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
    // InternalVampireLanguage.g:387:1: ruleVLSDeclaration : ( ( rule__VLSDeclaration__Alternatives ) ) ;
    public final void ruleVLSDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:391:2: ( ( ( rule__VLSDeclaration__Alternatives ) ) )
            // InternalVampireLanguage.g:392:2: ( ( rule__VLSDeclaration__Alternatives ) )
            {
            // InternalVampireLanguage.g:392:2: ( ( rule__VLSDeclaration__Alternatives ) )
            // InternalVampireLanguage.g:393:3: ( rule__VLSDeclaration__Alternatives )
            {
             before(grammarAccess.getVLSDeclarationAccess().getAlternatives()); 
            // InternalVampireLanguage.g:394:3: ( rule__VLSDeclaration__Alternatives )
            // InternalVampireLanguage.g:394:4: rule__VLSDeclaration__Alternatives
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
    // InternalVampireLanguage.g:403:1: entryRuleVLSOtherDeclaration : ruleVLSOtherDeclaration EOF ;
    public final void entryRuleVLSOtherDeclaration() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:404:1: ( ruleVLSOtherDeclaration EOF )
            // InternalVampireLanguage.g:405:1: ruleVLSOtherDeclaration EOF
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
    // InternalVampireLanguage.g:412:1: ruleVLSOtherDeclaration : ( ( rule__VLSOtherDeclaration__Group__0 ) ) ;
    public final void ruleVLSOtherDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:416:2: ( ( ( rule__VLSOtherDeclaration__Group__0 ) ) )
            // InternalVampireLanguage.g:417:2: ( ( rule__VLSOtherDeclaration__Group__0 ) )
            {
            // InternalVampireLanguage.g:417:2: ( ( rule__VLSOtherDeclaration__Group__0 ) )
            // InternalVampireLanguage.g:418:3: ( rule__VLSOtherDeclaration__Group__0 )
            {
             before(grammarAccess.getVLSOtherDeclarationAccess().getGroup()); 
            // InternalVampireLanguage.g:419:3: ( rule__VLSOtherDeclaration__Group__0 )
            // InternalVampireLanguage.g:419:4: rule__VLSOtherDeclaration__Group__0
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
    // InternalVampireLanguage.g:428:1: entryRuleVLSVariableDeclaration : ruleVLSVariableDeclaration EOF ;
    public final void entryRuleVLSVariableDeclaration() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:429:1: ( ruleVLSVariableDeclaration EOF )
            // InternalVampireLanguage.g:430:1: ruleVLSVariableDeclaration EOF
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
    // InternalVampireLanguage.g:437:1: ruleVLSVariableDeclaration : ( ( rule__VLSVariableDeclaration__Group__0 ) ) ;
    public final void ruleVLSVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:441:2: ( ( ( rule__VLSVariableDeclaration__Group__0 ) ) )
            // InternalVampireLanguage.g:442:2: ( ( rule__VLSVariableDeclaration__Group__0 ) )
            {
            // InternalVampireLanguage.g:442:2: ( ( rule__VLSVariableDeclaration__Group__0 ) )
            // InternalVampireLanguage.g:443:3: ( rule__VLSVariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVLSVariableDeclarationAccess().getGroup()); 
            // InternalVampireLanguage.g:444:3: ( rule__VLSVariableDeclaration__Group__0 )
            // InternalVampireLanguage.g:444:4: rule__VLSVariableDeclaration__Group__0
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
    // InternalVampireLanguage.g:453:1: entryRuleVLSTypeDef : ruleVLSTypeDef EOF ;
    public final void entryRuleVLSTypeDef() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:454:1: ( ruleVLSTypeDef EOF )
            // InternalVampireLanguage.g:455:1: ruleVLSTypeDef EOF
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
    // InternalVampireLanguage.g:462:1: ruleVLSTypeDef : ( ( rule__VLSTypeDef__Group__0 ) ) ;
    public final void ruleVLSTypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:466:2: ( ( ( rule__VLSTypeDef__Group__0 ) ) )
            // InternalVampireLanguage.g:467:2: ( ( rule__VLSTypeDef__Group__0 ) )
            {
            // InternalVampireLanguage.g:467:2: ( ( rule__VLSTypeDef__Group__0 ) )
            // InternalVampireLanguage.g:468:3: ( rule__VLSTypeDef__Group__0 )
            {
             before(grammarAccess.getVLSTypeDefAccess().getGroup()); 
            // InternalVampireLanguage.g:469:3: ( rule__VLSTypeDef__Group__0 )
            // InternalVampireLanguage.g:469:4: rule__VLSTypeDef__Group__0
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
    // InternalVampireLanguage.g:478:1: entryRuleVLSUnitaryTerm : ruleVLSUnitaryTerm EOF ;
    public final void entryRuleVLSUnitaryTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:479:1: ( ruleVLSUnitaryTerm EOF )
            // InternalVampireLanguage.g:480:1: ruleVLSUnitaryTerm EOF
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
    // InternalVampireLanguage.g:487:1: ruleVLSUnitaryTerm : ( ( rule__VLSUnitaryTerm__Group__0 ) ) ;
    public final void ruleVLSUnitaryTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:491:2: ( ( ( rule__VLSUnitaryTerm__Group__0 ) ) )
            // InternalVampireLanguage.g:492:2: ( ( rule__VLSUnitaryTerm__Group__0 ) )
            {
            // InternalVampireLanguage.g:492:2: ( ( rule__VLSUnitaryTerm__Group__0 ) )
            // InternalVampireLanguage.g:493:3: ( rule__VLSUnitaryTerm__Group__0 )
            {
             before(grammarAccess.getVLSUnitaryTermAccess().getGroup()); 
            // InternalVampireLanguage.g:494:3: ( rule__VLSUnitaryTerm__Group__0 )
            // InternalVampireLanguage.g:494:4: rule__VLSUnitaryTerm__Group__0
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
    // InternalVampireLanguage.g:503:1: entryRuleVLSTerm : ruleVLSTerm EOF ;
    public final void entryRuleVLSTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:504:1: ( ruleVLSTerm EOF )
            // InternalVampireLanguage.g:505:1: ruleVLSTerm EOF
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
    // InternalVampireLanguage.g:512:1: ruleVLSTerm : ( ruleVLSBinary ) ;
    public final void ruleVLSTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:516:2: ( ( ruleVLSBinary ) )
            // InternalVampireLanguage.g:517:2: ( ruleVLSBinary )
            {
            // InternalVampireLanguage.g:517:2: ( ruleVLSBinary )
            // InternalVampireLanguage.g:518:3: ruleVLSBinary
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
    // InternalVampireLanguage.g:528:1: entryRuleVLSBinary : ruleVLSBinary EOF ;
    public final void entryRuleVLSBinary() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:529:1: ( ruleVLSBinary EOF )
            // InternalVampireLanguage.g:530:1: ruleVLSBinary EOF
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
    // InternalVampireLanguage.g:537:1: ruleVLSBinary : ( ( rule__VLSBinary__Group__0 ) ) ;
    public final void ruleVLSBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:541:2: ( ( ( rule__VLSBinary__Group__0 ) ) )
            // InternalVampireLanguage.g:542:2: ( ( rule__VLSBinary__Group__0 ) )
            {
            // InternalVampireLanguage.g:542:2: ( ( rule__VLSBinary__Group__0 ) )
            // InternalVampireLanguage.g:543:3: ( rule__VLSBinary__Group__0 )
            {
             before(grammarAccess.getVLSBinaryAccess().getGroup()); 
            // InternalVampireLanguage.g:544:3: ( rule__VLSBinary__Group__0 )
            // InternalVampireLanguage.g:544:4: rule__VLSBinary__Group__0
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
    // InternalVampireLanguage.g:553:1: entryRuleVLSUnitaryFormula : ruleVLSUnitaryFormula EOF ;
    public final void entryRuleVLSUnitaryFormula() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:554:1: ( ruleVLSUnitaryFormula EOF )
            // InternalVampireLanguage.g:555:1: ruleVLSUnitaryFormula EOF
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
    // InternalVampireLanguage.g:562:1: ruleVLSUnitaryFormula : ( ( rule__VLSUnitaryFormula__Alternatives ) ) ;
    public final void ruleVLSUnitaryFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:566:2: ( ( ( rule__VLSUnitaryFormula__Alternatives ) ) )
            // InternalVampireLanguage.g:567:2: ( ( rule__VLSUnitaryFormula__Alternatives ) )
            {
            // InternalVampireLanguage.g:567:2: ( ( rule__VLSUnitaryFormula__Alternatives ) )
            // InternalVampireLanguage.g:568:3: ( rule__VLSUnitaryFormula__Alternatives )
            {
             before(grammarAccess.getVLSUnitaryFormulaAccess().getAlternatives()); 
            // InternalVampireLanguage.g:569:3: ( rule__VLSUnitaryFormula__Alternatives )
            // InternalVampireLanguage.g:569:4: rule__VLSUnitaryFormula__Alternatives
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
    // InternalVampireLanguage.g:578:1: entryRuleVLSUniversalQuantifier : ruleVLSUniversalQuantifier EOF ;
    public final void entryRuleVLSUniversalQuantifier() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:579:1: ( ruleVLSUniversalQuantifier EOF )
            // InternalVampireLanguage.g:580:1: ruleVLSUniversalQuantifier EOF
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
    // InternalVampireLanguage.g:587:1: ruleVLSUniversalQuantifier : ( ( rule__VLSUniversalQuantifier__Group__0 ) ) ;
    public final void ruleVLSUniversalQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:591:2: ( ( ( rule__VLSUniversalQuantifier__Group__0 ) ) )
            // InternalVampireLanguage.g:592:2: ( ( rule__VLSUniversalQuantifier__Group__0 ) )
            {
            // InternalVampireLanguage.g:592:2: ( ( rule__VLSUniversalQuantifier__Group__0 ) )
            // InternalVampireLanguage.g:593:3: ( rule__VLSUniversalQuantifier__Group__0 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup()); 
            // InternalVampireLanguage.g:594:3: ( rule__VLSUniversalQuantifier__Group__0 )
            // InternalVampireLanguage.g:594:4: rule__VLSUniversalQuantifier__Group__0
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
    // InternalVampireLanguage.g:603:1: entryRuleVLSExistentialQuantifier : ruleVLSExistentialQuantifier EOF ;
    public final void entryRuleVLSExistentialQuantifier() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:604:1: ( ruleVLSExistentialQuantifier EOF )
            // InternalVampireLanguage.g:605:1: ruleVLSExistentialQuantifier EOF
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
    // InternalVampireLanguage.g:612:1: ruleVLSExistentialQuantifier : ( ( rule__VLSExistentialQuantifier__Group__0 ) ) ;
    public final void ruleVLSExistentialQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:616:2: ( ( ( rule__VLSExistentialQuantifier__Group__0 ) ) )
            // InternalVampireLanguage.g:617:2: ( ( rule__VLSExistentialQuantifier__Group__0 ) )
            {
            // InternalVampireLanguage.g:617:2: ( ( rule__VLSExistentialQuantifier__Group__0 ) )
            // InternalVampireLanguage.g:618:3: ( rule__VLSExistentialQuantifier__Group__0 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup()); 
            // InternalVampireLanguage.g:619:3: ( rule__VLSExistentialQuantifier__Group__0 )
            // InternalVampireLanguage.g:619:4: rule__VLSExistentialQuantifier__Group__0
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
    // InternalVampireLanguage.g:628:1: entryRuleVLSUnaryNegation : ruleVLSUnaryNegation EOF ;
    public final void entryRuleVLSUnaryNegation() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:629:1: ( ruleVLSUnaryNegation EOF )
            // InternalVampireLanguage.g:630:1: ruleVLSUnaryNegation EOF
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
    // InternalVampireLanguage.g:637:1: ruleVLSUnaryNegation : ( ( rule__VLSUnaryNegation__Group__0 ) ) ;
    public final void ruleVLSUnaryNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:641:2: ( ( ( rule__VLSUnaryNegation__Group__0 ) ) )
            // InternalVampireLanguage.g:642:2: ( ( rule__VLSUnaryNegation__Group__0 ) )
            {
            // InternalVampireLanguage.g:642:2: ( ( rule__VLSUnaryNegation__Group__0 ) )
            // InternalVampireLanguage.g:643:3: ( rule__VLSUnaryNegation__Group__0 )
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getGroup()); 
            // InternalVampireLanguage.g:644:3: ( rule__VLSUnaryNegation__Group__0 )
            // InternalVampireLanguage.g:644:4: rule__VLSUnaryNegation__Group__0
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
    // InternalVampireLanguage.g:653:1: entryRuleVLSUnaryInfix : ruleVLSUnaryInfix EOF ;
    public final void entryRuleVLSUnaryInfix() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:654:1: ( ruleVLSUnaryInfix EOF )
            // InternalVampireLanguage.g:655:1: ruleVLSUnaryInfix EOF
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
    // InternalVampireLanguage.g:662:1: ruleVLSUnaryInfix : ( ( rule__VLSUnaryInfix__Group__0 ) ) ;
    public final void ruleVLSUnaryInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:666:2: ( ( ( rule__VLSUnaryInfix__Group__0 ) ) )
            // InternalVampireLanguage.g:667:2: ( ( rule__VLSUnaryInfix__Group__0 ) )
            {
            // InternalVampireLanguage.g:667:2: ( ( rule__VLSUnaryInfix__Group__0 ) )
            // InternalVampireLanguage.g:668:3: ( rule__VLSUnaryInfix__Group__0 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getGroup()); 
            // InternalVampireLanguage.g:669:3: ( rule__VLSUnaryInfix__Group__0 )
            // InternalVampireLanguage.g:669:4: rule__VLSUnaryInfix__Group__0
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
    // InternalVampireLanguage.g:678:1: entryRuleVLSAtomic : ruleVLSAtomic EOF ;
    public final void entryRuleVLSAtomic() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:679:1: ( ruleVLSAtomic EOF )
            // InternalVampireLanguage.g:680:1: ruleVLSAtomic EOF
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
    // InternalVampireLanguage.g:687:1: ruleVLSAtomic : ( ( rule__VLSAtomic__Alternatives ) ) ;
    public final void ruleVLSAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:691:2: ( ( ( rule__VLSAtomic__Alternatives ) ) )
            // InternalVampireLanguage.g:692:2: ( ( rule__VLSAtomic__Alternatives ) )
            {
            // InternalVampireLanguage.g:692:2: ( ( rule__VLSAtomic__Alternatives ) )
            // InternalVampireLanguage.g:693:3: ( rule__VLSAtomic__Alternatives )
            {
             before(grammarAccess.getVLSAtomicAccess().getAlternatives()); 
            // InternalVampireLanguage.g:694:3: ( rule__VLSAtomic__Alternatives )
            // InternalVampireLanguage.g:694:4: rule__VLSAtomic__Alternatives
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
    // InternalVampireLanguage.g:703:1: entryRuleVLSAtomicConstant : ruleVLSAtomicConstant EOF ;
    public final void entryRuleVLSAtomicConstant() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:704:1: ( ruleVLSAtomicConstant EOF )
            // InternalVampireLanguage.g:705:1: ruleVLSAtomicConstant EOF
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
    // InternalVampireLanguage.g:712:1: ruleVLSAtomicConstant : ( ( rule__VLSAtomicConstant__Alternatives ) ) ;
    public final void ruleVLSAtomicConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:716:2: ( ( ( rule__VLSAtomicConstant__Alternatives ) ) )
            // InternalVampireLanguage.g:717:2: ( ( rule__VLSAtomicConstant__Alternatives ) )
            {
            // InternalVampireLanguage.g:717:2: ( ( rule__VLSAtomicConstant__Alternatives ) )
            // InternalVampireLanguage.g:718:3: ( rule__VLSAtomicConstant__Alternatives )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getAlternatives()); 
            // InternalVampireLanguage.g:719:3: ( rule__VLSAtomicConstant__Alternatives )
            // InternalVampireLanguage.g:719:4: rule__VLSAtomicConstant__Alternatives
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
    // InternalVampireLanguage.g:728:1: entryRuleVLSAtomicFunction : ruleVLSAtomicFunction EOF ;
    public final void entryRuleVLSAtomicFunction() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:729:1: ( ruleVLSAtomicFunction EOF )
            // InternalVampireLanguage.g:730:1: ruleVLSAtomicFunction EOF
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
    // InternalVampireLanguage.g:737:1: ruleVLSAtomicFunction : ( ( rule__VLSAtomicFunction__Alternatives ) ) ;
    public final void ruleVLSAtomicFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:741:2: ( ( ( rule__VLSAtomicFunction__Alternatives ) ) )
            // InternalVampireLanguage.g:742:2: ( ( rule__VLSAtomicFunction__Alternatives ) )
            {
            // InternalVampireLanguage.g:742:2: ( ( rule__VLSAtomicFunction__Alternatives ) )
            // InternalVampireLanguage.g:743:3: ( rule__VLSAtomicFunction__Alternatives )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getAlternatives()); 
            // InternalVampireLanguage.g:744:3: ( rule__VLSAtomicFunction__Alternatives )
            // InternalVampireLanguage.g:744:4: rule__VLSAtomicFunction__Alternatives
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
    // InternalVampireLanguage.g:753:1: entryRuleVLSVariable : ruleVLSVariable EOF ;
    public final void entryRuleVLSVariable() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:754:1: ( ruleVLSVariable EOF )
            // InternalVampireLanguage.g:755:1: ruleVLSVariable EOF
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
    // InternalVampireLanguage.g:762:1: ruleVLSVariable : ( ( rule__VLSVariable__NameAssignment ) ) ;
    public final void ruleVLSVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:766:2: ( ( ( rule__VLSVariable__NameAssignment ) ) )
            // InternalVampireLanguage.g:767:2: ( ( rule__VLSVariable__NameAssignment ) )
            {
            // InternalVampireLanguage.g:767:2: ( ( rule__VLSVariable__NameAssignment ) )
            // InternalVampireLanguage.g:768:3: ( rule__VLSVariable__NameAssignment )
            {
             before(grammarAccess.getVLSVariableAccess().getNameAssignment()); 
            // InternalVampireLanguage.g:769:3: ( rule__VLSVariable__NameAssignment )
            // InternalVampireLanguage.g:769:4: rule__VLSVariable__NameAssignment
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
    // InternalVampireLanguage.g:778:1: entryRuleVLSFofTerm : ruleVLSFofTerm EOF ;
    public final void entryRuleVLSFofTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:779:1: ( ruleVLSFofTerm EOF )
            // InternalVampireLanguage.g:780:1: ruleVLSFofTerm EOF
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
    // InternalVampireLanguage.g:787:1: ruleVLSFofTerm : ( ( rule__VLSFofTerm__Alternatives ) ) ;
    public final void ruleVLSFofTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:791:2: ( ( ( rule__VLSFofTerm__Alternatives ) ) )
            // InternalVampireLanguage.g:792:2: ( ( rule__VLSFofTerm__Alternatives ) )
            {
            // InternalVampireLanguage.g:792:2: ( ( rule__VLSFofTerm__Alternatives ) )
            // InternalVampireLanguage.g:793:3: ( rule__VLSFofTerm__Alternatives )
            {
             before(grammarAccess.getVLSFofTermAccess().getAlternatives()); 
            // InternalVampireLanguage.g:794:3: ( rule__VLSFofTerm__Alternatives )
            // InternalVampireLanguage.g:794:4: rule__VLSFofTerm__Alternatives
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
    // InternalVampireLanguage.g:803:1: entryRuleVLSFunctionAsTerm : ruleVLSFunctionAsTerm EOF ;
    public final void entryRuleVLSFunctionAsTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:804:1: ( ruleVLSFunctionAsTerm EOF )
            // InternalVampireLanguage.g:805:1: ruleVLSFunctionAsTerm EOF
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
    // InternalVampireLanguage.g:812:1: ruleVLSFunctionAsTerm : ( ( rule__VLSFunctionAsTerm__Group__0 ) ) ;
    public final void ruleVLSFunctionAsTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:816:2: ( ( ( rule__VLSFunctionAsTerm__Group__0 ) ) )
            // InternalVampireLanguage.g:817:2: ( ( rule__VLSFunctionAsTerm__Group__0 ) )
            {
            // InternalVampireLanguage.g:817:2: ( ( rule__VLSFunctionAsTerm__Group__0 ) )
            // InternalVampireLanguage.g:818:3: ( rule__VLSFunctionAsTerm__Group__0 )
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getGroup()); 
            // InternalVampireLanguage.g:819:3: ( rule__VLSFunctionAsTerm__Group__0 )
            // InternalVampireLanguage.g:819:4: rule__VLSFunctionAsTerm__Group__0
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
    // InternalVampireLanguage.g:828:1: entryRuleVLSDefinedTerm : ruleVLSDefinedTerm EOF ;
    public final void entryRuleVLSDefinedTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:829:1: ( ruleVLSDefinedTerm EOF )
            // InternalVampireLanguage.g:830:1: ruleVLSDefinedTerm EOF
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
    // InternalVampireLanguage.g:837:1: ruleVLSDefinedTerm : ( ( rule__VLSDefinedTerm__Alternatives ) ) ;
    public final void ruleVLSDefinedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:841:2: ( ( ( rule__VLSDefinedTerm__Alternatives ) ) )
            // InternalVampireLanguage.g:842:2: ( ( rule__VLSDefinedTerm__Alternatives ) )
            {
            // InternalVampireLanguage.g:842:2: ( ( rule__VLSDefinedTerm__Alternatives ) )
            // InternalVampireLanguage.g:843:3: ( rule__VLSDefinedTerm__Alternatives )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getAlternatives()); 
            // InternalVampireLanguage.g:844:3: ( rule__VLSDefinedTerm__Alternatives )
            // InternalVampireLanguage.g:844:4: rule__VLSDefinedTerm__Alternatives
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
    // InternalVampireLanguage.g:852:1: rule__VampireModel__Alternatives : ( ( ( rule__VampireModel__CommentsAssignment_0 ) ) | ( ( rule__VampireModel__ConfirmationsAssignment_1 ) ) | ( ( rule__VampireModel__FormulasAssignment_2 ) ) | ( ( rule__VampireModel__TfformulasAssignment_3 ) ) );
    public final void rule__VampireModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:856:1: ( ( ( rule__VampireModel__CommentsAssignment_0 ) ) | ( ( rule__VampireModel__ConfirmationsAssignment_1 ) ) | ( ( rule__VampireModel__FormulasAssignment_2 ) ) | ( ( rule__VampireModel__TfformulasAssignment_3 ) ) )
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
                    // InternalVampireLanguage.g:857:2: ( ( rule__VampireModel__CommentsAssignment_0 ) )
                    {
                    // InternalVampireLanguage.g:857:2: ( ( rule__VampireModel__CommentsAssignment_0 ) )
                    // InternalVampireLanguage.g:858:3: ( rule__VampireModel__CommentsAssignment_0 )
                    {
                     before(grammarAccess.getVampireModelAccess().getCommentsAssignment_0()); 
                    // InternalVampireLanguage.g:859:3: ( rule__VampireModel__CommentsAssignment_0 )
                    // InternalVampireLanguage.g:859:4: rule__VampireModel__CommentsAssignment_0
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
                    // InternalVampireLanguage.g:863:2: ( ( rule__VampireModel__ConfirmationsAssignment_1 ) )
                    {
                    // InternalVampireLanguage.g:863:2: ( ( rule__VampireModel__ConfirmationsAssignment_1 ) )
                    // InternalVampireLanguage.g:864:3: ( rule__VampireModel__ConfirmationsAssignment_1 )
                    {
                     before(grammarAccess.getVampireModelAccess().getConfirmationsAssignment_1()); 
                    // InternalVampireLanguage.g:865:3: ( rule__VampireModel__ConfirmationsAssignment_1 )
                    // InternalVampireLanguage.g:865:4: rule__VampireModel__ConfirmationsAssignment_1
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
                    // InternalVampireLanguage.g:869:2: ( ( rule__VampireModel__FormulasAssignment_2 ) )
                    {
                    // InternalVampireLanguage.g:869:2: ( ( rule__VampireModel__FormulasAssignment_2 ) )
                    // InternalVampireLanguage.g:870:3: ( rule__VampireModel__FormulasAssignment_2 )
                    {
                     before(grammarAccess.getVampireModelAccess().getFormulasAssignment_2()); 
                    // InternalVampireLanguage.g:871:3: ( rule__VampireModel__FormulasAssignment_2 )
                    // InternalVampireLanguage.g:871:4: rule__VampireModel__FormulasAssignment_2
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
                    // InternalVampireLanguage.g:875:2: ( ( rule__VampireModel__TfformulasAssignment_3 ) )
                    {
                    // InternalVampireLanguage.g:875:2: ( ( rule__VampireModel__TfformulasAssignment_3 ) )
                    // InternalVampireLanguage.g:876:3: ( rule__VampireModel__TfformulasAssignment_3 )
                    {
                     before(grammarAccess.getVampireModelAccess().getTfformulasAssignment_3()); 
                    // InternalVampireLanguage.g:877:3: ( rule__VampireModel__TfformulasAssignment_3 )
                    // InternalVampireLanguage.g:877:4: rule__VampireModel__TfformulasAssignment_3
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
    // InternalVampireLanguage.g:885:1: rule__VLSConfirmations__Alternatives : ( ( ( rule__VLSConfirmations__Group_0__0 ) ) | ( ( rule__VLSConfirmations__Group_1__0 ) ) | ( ( rule__VLSConfirmations__Group_2__0 ) ) | ( ( rule__VLSConfirmations__Group_3__0 ) ) );
    public final void rule__VLSConfirmations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:889:1: ( ( ( rule__VLSConfirmations__Group_0__0 ) ) | ( ( rule__VLSConfirmations__Group_1__0 ) ) | ( ( rule__VLSConfirmations__Group_2__0 ) ) | ( ( rule__VLSConfirmations__Group_3__0 ) ) )
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
                    // InternalVampireLanguage.g:890:2: ( ( rule__VLSConfirmations__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:890:2: ( ( rule__VLSConfirmations__Group_0__0 ) )
                    // InternalVampireLanguage.g:891:3: ( rule__VLSConfirmations__Group_0__0 )
                    {
                     before(grammarAccess.getVLSConfirmationsAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:892:3: ( rule__VLSConfirmations__Group_0__0 )
                    // InternalVampireLanguage.g:892:4: rule__VLSConfirmations__Group_0__0
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
                    // InternalVampireLanguage.g:896:2: ( ( rule__VLSConfirmations__Group_1__0 ) )
                    {
                    // InternalVampireLanguage.g:896:2: ( ( rule__VLSConfirmations__Group_1__0 ) )
                    // InternalVampireLanguage.g:897:3: ( rule__VLSConfirmations__Group_1__0 )
                    {
                     before(grammarAccess.getVLSConfirmationsAccess().getGroup_1()); 
                    // InternalVampireLanguage.g:898:3: ( rule__VLSConfirmations__Group_1__0 )
                    // InternalVampireLanguage.g:898:4: rule__VLSConfirmations__Group_1__0
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
                    // InternalVampireLanguage.g:902:2: ( ( rule__VLSConfirmations__Group_2__0 ) )
                    {
                    // InternalVampireLanguage.g:902:2: ( ( rule__VLSConfirmations__Group_2__0 ) )
                    // InternalVampireLanguage.g:903:3: ( rule__VLSConfirmations__Group_2__0 )
                    {
                     before(grammarAccess.getVLSConfirmationsAccess().getGroup_2()); 
                    // InternalVampireLanguage.g:904:3: ( rule__VLSConfirmations__Group_2__0 )
                    // InternalVampireLanguage.g:904:4: rule__VLSConfirmations__Group_2__0
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
                    // InternalVampireLanguage.g:908:2: ( ( rule__VLSConfirmations__Group_3__0 ) )
                    {
                    // InternalVampireLanguage.g:908:2: ( ( rule__VLSConfirmations__Group_3__0 ) )
                    // InternalVampireLanguage.g:909:3: ( rule__VLSConfirmations__Group_3__0 )
                    {
                     before(grammarAccess.getVLSConfirmationsAccess().getGroup_3()); 
                    // InternalVampireLanguage.g:910:3: ( rule__VLSConfirmations__Group_3__0 )
                    // InternalVampireLanguage.g:910:4: rule__VLSConfirmations__Group_3__0
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
    // InternalVampireLanguage.g:918:1: rule__VLSFofFormula__NameAlternatives_2_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SIGNED_LITERAL ) | ( RULE_SINGLE_QUOTE ) );
    public final void rule__VLSFofFormula__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:922:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SIGNED_LITERAL ) | ( RULE_SINGLE_QUOTE ) )
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
                    // InternalVampireLanguage.g:923:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:923:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:924:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSFofFormulaAccess().getNameLOWER_WORD_IDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFofFormulaAccess().getNameLOWER_WORD_IDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:929:2: ( RULE_SIGNED_LITERAL )
                    {
                    // InternalVampireLanguage.g:929:2: ( RULE_SIGNED_LITERAL )
                    // InternalVampireLanguage.g:930:3: RULE_SIGNED_LITERAL
                    {
                     before(grammarAccess.getVLSFofFormulaAccess().getNameSIGNED_LITERALTerminalRuleCall_2_0_1()); 
                    match(input,RULE_SIGNED_LITERAL,FOLLOW_2); 
                     after(grammarAccess.getVLSFofFormulaAccess().getNameSIGNED_LITERALTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:935:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:935:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:936:3: RULE_SINGLE_QUOTE
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
    // InternalVampireLanguage.g:945:1: rule__VLSTffName__Alternatives : ( ( ruleVLSTffDeclPred ) | ( ruleVLSTffFinite ) | ( ruleVLSTffDistinct ) );
    public final void rule__VLSTffName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:949:1: ( ( ruleVLSTffDeclPred ) | ( ruleVLSTffFinite ) | ( ruleVLSTffDistinct ) )
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
                    // InternalVampireLanguage.g:950:2: ( ruleVLSTffDeclPred )
                    {
                    // InternalVampireLanguage.g:950:2: ( ruleVLSTffDeclPred )
                    // InternalVampireLanguage.g:951:3: ruleVLSTffDeclPred
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
                    // InternalVampireLanguage.g:956:2: ( ruleVLSTffFinite )
                    {
                    // InternalVampireLanguage.g:956:2: ( ruleVLSTffFinite )
                    // InternalVampireLanguage.g:957:3: ruleVLSTffFinite
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
                    // InternalVampireLanguage.g:962:2: ( ruleVLSTffDistinct )
                    {
                    // InternalVampireLanguage.g:962:2: ( ruleVLSTffDistinct )
                    // InternalVampireLanguage.g:963:3: ruleVLSTffDistinct
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
    // InternalVampireLanguage.g:972:1: rule__VLSTffDeclPred__Alternatives : ( ( ( rule__VLSTffDeclPred__Group_0__0 ) ) | ( RULE_LOWER_WORD_ID ) );
    public final void rule__VLSTffDeclPred__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:976:1: ( ( ( rule__VLSTffDeclPred__Group_0__0 ) ) | ( RULE_LOWER_WORD_ID ) )
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
                    // InternalVampireLanguage.g:977:2: ( ( rule__VLSTffDeclPred__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:977:2: ( ( rule__VLSTffDeclPred__Group_0__0 ) )
                    // InternalVampireLanguage.g:978:3: ( rule__VLSTffDeclPred__Group_0__0 )
                    {
                     before(grammarAccess.getVLSTffDeclPredAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:979:3: ( rule__VLSTffDeclPred__Group_0__0 )
                    // InternalVampireLanguage.g:979:4: rule__VLSTffDeclPred__Group_0__0
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
                    // InternalVampireLanguage.g:983:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:983:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:984:3: RULE_LOWER_WORD_ID
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
    // InternalVampireLanguage.g:993:1: rule__VLSRole__Alternatives : ( ( 'axiom' ) | ( 'conjecture' ) | ( 'hypothesis' ) | ( 'definition' ) | ( 'assumption' ) | ( 'lemma' ) | ( 'theorem' ) | ( 'corollary' ) | ( 'negated_conjecture' ) | ( 'plain' ) | ( 'type' ) | ( 'fi_domain' ) | ( 'fi_functors' ) | ( 'fi_predicates' ) | ( 'unknown' ) );
    public final void rule__VLSRole__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:997:1: ( ( 'axiom' ) | ( 'conjecture' ) | ( 'hypothesis' ) | ( 'definition' ) | ( 'assumption' ) | ( 'lemma' ) | ( 'theorem' ) | ( 'corollary' ) | ( 'negated_conjecture' ) | ( 'plain' ) | ( 'type' ) | ( 'fi_domain' ) | ( 'fi_functors' ) | ( 'fi_predicates' ) | ( 'unknown' ) )
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
                    // InternalVampireLanguage.g:998:2: ( 'axiom' )
                    {
                    // InternalVampireLanguage.g:998:2: ( 'axiom' )
                    // InternalVampireLanguage.g:999:3: 'axiom'
                    {
                     before(grammarAccess.getVLSRoleAccess().getAxiomKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getAxiomKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1004:2: ( 'conjecture' )
                    {
                    // InternalVampireLanguage.g:1004:2: ( 'conjecture' )
                    // InternalVampireLanguage.g:1005:3: 'conjecture'
                    {
                     before(grammarAccess.getVLSRoleAccess().getConjectureKeyword_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getConjectureKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1010:2: ( 'hypothesis' )
                    {
                    // InternalVampireLanguage.g:1010:2: ( 'hypothesis' )
                    // InternalVampireLanguage.g:1011:3: 'hypothesis'
                    {
                     before(grammarAccess.getVLSRoleAccess().getHypothesisKeyword_2()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getHypothesisKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1016:2: ( 'definition' )
                    {
                    // InternalVampireLanguage.g:1016:2: ( 'definition' )
                    // InternalVampireLanguage.g:1017:3: 'definition'
                    {
                     before(grammarAccess.getVLSRoleAccess().getDefinitionKeyword_3()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getDefinitionKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:1022:2: ( 'assumption' )
                    {
                    // InternalVampireLanguage.g:1022:2: ( 'assumption' )
                    // InternalVampireLanguage.g:1023:3: 'assumption'
                    {
                     before(grammarAccess.getVLSRoleAccess().getAssumptionKeyword_4()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getAssumptionKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalVampireLanguage.g:1028:2: ( 'lemma' )
                    {
                    // InternalVampireLanguage.g:1028:2: ( 'lemma' )
                    // InternalVampireLanguage.g:1029:3: 'lemma'
                    {
                     before(grammarAccess.getVLSRoleAccess().getLemmaKeyword_5()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getLemmaKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalVampireLanguage.g:1034:2: ( 'theorem' )
                    {
                    // InternalVampireLanguage.g:1034:2: ( 'theorem' )
                    // InternalVampireLanguage.g:1035:3: 'theorem'
                    {
                     before(grammarAccess.getVLSRoleAccess().getTheoremKeyword_6()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getTheoremKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalVampireLanguage.g:1040:2: ( 'corollary' )
                    {
                    // InternalVampireLanguage.g:1040:2: ( 'corollary' )
                    // InternalVampireLanguage.g:1041:3: 'corollary'
                    {
                     before(grammarAccess.getVLSRoleAccess().getCorollaryKeyword_7()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getCorollaryKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalVampireLanguage.g:1046:2: ( 'negated_conjecture' )
                    {
                    // InternalVampireLanguage.g:1046:2: ( 'negated_conjecture' )
                    // InternalVampireLanguage.g:1047:3: 'negated_conjecture'
                    {
                     before(grammarAccess.getVLSRoleAccess().getNegated_conjectureKeyword_8()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getNegated_conjectureKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalVampireLanguage.g:1052:2: ( 'plain' )
                    {
                    // InternalVampireLanguage.g:1052:2: ( 'plain' )
                    // InternalVampireLanguage.g:1053:3: 'plain'
                    {
                     before(grammarAccess.getVLSRoleAccess().getPlainKeyword_9()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getPlainKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalVampireLanguage.g:1058:2: ( 'type' )
                    {
                    // InternalVampireLanguage.g:1058:2: ( 'type' )
                    // InternalVampireLanguage.g:1059:3: 'type'
                    {
                     before(grammarAccess.getVLSRoleAccess().getTypeKeyword_10()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getTypeKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalVampireLanguage.g:1064:2: ( 'fi_domain' )
                    {
                    // InternalVampireLanguage.g:1064:2: ( 'fi_domain' )
                    // InternalVampireLanguage.g:1065:3: 'fi_domain'
                    {
                     before(grammarAccess.getVLSRoleAccess().getFi_domainKeyword_11()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getFi_domainKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalVampireLanguage.g:1070:2: ( 'fi_functors' )
                    {
                    // InternalVampireLanguage.g:1070:2: ( 'fi_functors' )
                    // InternalVampireLanguage.g:1071:3: 'fi_functors'
                    {
                     before(grammarAccess.getVLSRoleAccess().getFi_functorsKeyword_12()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getFi_functorsKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalVampireLanguage.g:1076:2: ( 'fi_predicates' )
                    {
                    // InternalVampireLanguage.g:1076:2: ( 'fi_predicates' )
                    // InternalVampireLanguage.g:1077:3: 'fi_predicates'
                    {
                     before(grammarAccess.getVLSRoleAccess().getFi_predicatesKeyword_13()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getFi_predicatesKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalVampireLanguage.g:1082:2: ( 'unknown' )
                    {
                    // InternalVampireLanguage.g:1082:2: ( 'unknown' )
                    // InternalVampireLanguage.g:1083:3: 'unknown'
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
    // InternalVampireLanguage.g:1092:1: rule__VLSAnnotation__NameAlternatives_1_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( ruleVLSRole ) );
    public final void rule__VLSAnnotation__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1096:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( ruleVLSRole ) )
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
                    // InternalVampireLanguage.g:1097:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1097:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1098:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSAnnotationAccess().getNameLOWER_WORD_IDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAnnotationAccess().getNameLOWER_WORD_IDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1103:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1103:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1104:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSAnnotationAccess().getNameSINGLE_QUOTETerminalRuleCall_1_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSAnnotationAccess().getNameSINGLE_QUOTETerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1109:2: ( ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:1109:2: ( ruleVLSRole )
                    // InternalVampireLanguage.g:1110:3: ruleVLSRole
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
    // InternalVampireLanguage.g:1119:1: rule__VLSTffTerm__Alternatives : ( ( ruleVLSTerm ) | ( ruleVLSDeclaration ) );
    public final void rule__VLSTffTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1123:1: ( ( ruleVLSTerm ) | ( ruleVLSDeclaration ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalVampireLanguage.g:1124:2: ( ruleVLSTerm )
                    {
                    // InternalVampireLanguage.g:1124:2: ( ruleVLSTerm )
                    // InternalVampireLanguage.g:1125:3: ruleVLSTerm
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
                    // InternalVampireLanguage.g:1130:2: ( ruleVLSDeclaration )
                    {
                    // InternalVampireLanguage.g:1130:2: ( ruleVLSDeclaration )
                    // InternalVampireLanguage.g:1131:3: ruleVLSDeclaration
                    {
                     before(grammarAccess.getVLSTffTermAccess().getVLSDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVLSDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVLSTffTermAccess().getVLSDeclarationParserRuleCall_1()); 

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
    // InternalVampireLanguage.g:1140:1: rule__VLSDeclaration__Alternatives : ( ( ruleVLSVariableDeclaration ) | ( ruleVLSOtherDeclaration ) );
    public final void rule__VLSDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1144:1: ( ( ruleVLSVariableDeclaration ) | ( ruleVLSOtherDeclaration ) )
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
                    // InternalVampireLanguage.g:1145:2: ( ruleVLSVariableDeclaration )
                    {
                    // InternalVampireLanguage.g:1145:2: ( ruleVLSVariableDeclaration )
                    // InternalVampireLanguage.g:1146:3: ruleVLSVariableDeclaration
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
                    // InternalVampireLanguage.g:1151:2: ( ruleVLSOtherDeclaration )
                    {
                    // InternalVampireLanguage.g:1151:2: ( ruleVLSOtherDeclaration )
                    // InternalVampireLanguage.g:1152:3: ruleVLSOtherDeclaration
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
    // InternalVampireLanguage.g:1161:1: rule__VLSBinary__Alternatives_1 : ( ( ( rule__VLSBinary__Group_1_0__0 ) ) | ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) ) | ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) ) );
    public final void rule__VLSBinary__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1165:1: ( ( ( rule__VLSBinary__Group_1_0__0 ) ) | ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) ) | ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) ) )
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
                    // InternalVampireLanguage.g:1166:2: ( ( rule__VLSBinary__Group_1_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1166:2: ( ( rule__VLSBinary__Group_1_0__0 ) )
                    // InternalVampireLanguage.g:1167:3: ( rule__VLSBinary__Group_1_0__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0()); 
                    // InternalVampireLanguage.g:1168:3: ( rule__VLSBinary__Group_1_0__0 )
                    // InternalVampireLanguage.g:1168:4: rule__VLSBinary__Group_1_0__0
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
                    // InternalVampireLanguage.g:1172:2: ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) )
                    {
                    // InternalVampireLanguage.g:1172:2: ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) )
                    // InternalVampireLanguage.g:1173:3: ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* )
                    {
                    // InternalVampireLanguage.g:1173:3: ( ( rule__VLSBinary__Group_1_1__0 ) )
                    // InternalVampireLanguage.g:1174:4: ( rule__VLSBinary__Group_1_1__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 
                    // InternalVampireLanguage.g:1175:4: ( rule__VLSBinary__Group_1_1__0 )
                    // InternalVampireLanguage.g:1175:5: rule__VLSBinary__Group_1_1__0
                    {
                    pushFollow(FOLLOW_4);
                    rule__VLSBinary__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 

                    }

                    // InternalVampireLanguage.g:1178:3: ( ( rule__VLSBinary__Group_1_1__0 )* )
                    // InternalVampireLanguage.g:1179:4: ( rule__VLSBinary__Group_1_1__0 )*
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 
                    // InternalVampireLanguage.g:1180:4: ( rule__VLSBinary__Group_1_1__0 )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==70) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1180:5: rule__VLSBinary__Group_1_1__0
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
                    // InternalVampireLanguage.g:1185:2: ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) )
                    {
                    // InternalVampireLanguage.g:1185:2: ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) )
                    // InternalVampireLanguage.g:1186:3: ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* )
                    {
                    // InternalVampireLanguage.g:1186:3: ( ( rule__VLSBinary__Group_1_2__0 ) )
                    // InternalVampireLanguage.g:1187:4: ( rule__VLSBinary__Group_1_2__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 
                    // InternalVampireLanguage.g:1188:4: ( rule__VLSBinary__Group_1_2__0 )
                    // InternalVampireLanguage.g:1188:5: rule__VLSBinary__Group_1_2__0
                    {
                    pushFollow(FOLLOW_5);
                    rule__VLSBinary__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 

                    }

                    // InternalVampireLanguage.g:1191:3: ( ( rule__VLSBinary__Group_1_2__0 )* )
                    // InternalVampireLanguage.g:1192:4: ( rule__VLSBinary__Group_1_2__0 )*
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 
                    // InternalVampireLanguage.g:1193:4: ( rule__VLSBinary__Group_1_2__0 )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==71) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1193:5: rule__VLSBinary__Group_1_2__0
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
    // InternalVampireLanguage.g:1202:1: rule__VLSBinary__Alternatives_1_0_0 : ( ( ( rule__VLSBinary__Group_1_0_0_0__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_1__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_2__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_3__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_4__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_5__0 ) ) );
    public final void rule__VLSBinary__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1206:1: ( ( ( rule__VLSBinary__Group_1_0_0_0__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_1__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_2__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_3__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_4__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_5__0 ) ) )
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
                    // InternalVampireLanguage.g:1207:2: ( ( rule__VLSBinary__Group_1_0_0_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1207:2: ( ( rule__VLSBinary__Group_1_0_0_0__0 ) )
                    // InternalVampireLanguage.g:1208:3: ( rule__VLSBinary__Group_1_0_0_0__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_0()); 
                    // InternalVampireLanguage.g:1209:3: ( rule__VLSBinary__Group_1_0_0_0__0 )
                    // InternalVampireLanguage.g:1209:4: rule__VLSBinary__Group_1_0_0_0__0
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
                    // InternalVampireLanguage.g:1213:2: ( ( rule__VLSBinary__Group_1_0_0_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1213:2: ( ( rule__VLSBinary__Group_1_0_0_1__0 ) )
                    // InternalVampireLanguage.g:1214:3: ( rule__VLSBinary__Group_1_0_0_1__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_1()); 
                    // InternalVampireLanguage.g:1215:3: ( rule__VLSBinary__Group_1_0_0_1__0 )
                    // InternalVampireLanguage.g:1215:4: rule__VLSBinary__Group_1_0_0_1__0
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
                    // InternalVampireLanguage.g:1219:2: ( ( rule__VLSBinary__Group_1_0_0_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1219:2: ( ( rule__VLSBinary__Group_1_0_0_2__0 ) )
                    // InternalVampireLanguage.g:1220:3: ( rule__VLSBinary__Group_1_0_0_2__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_2()); 
                    // InternalVampireLanguage.g:1221:3: ( rule__VLSBinary__Group_1_0_0_2__0 )
                    // InternalVampireLanguage.g:1221:4: rule__VLSBinary__Group_1_0_0_2__0
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
                    // InternalVampireLanguage.g:1225:2: ( ( rule__VLSBinary__Group_1_0_0_3__0 ) )
                    {
                    // InternalVampireLanguage.g:1225:2: ( ( rule__VLSBinary__Group_1_0_0_3__0 ) )
                    // InternalVampireLanguage.g:1226:3: ( rule__VLSBinary__Group_1_0_0_3__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_3()); 
                    // InternalVampireLanguage.g:1227:3: ( rule__VLSBinary__Group_1_0_0_3__0 )
                    // InternalVampireLanguage.g:1227:4: rule__VLSBinary__Group_1_0_0_3__0
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
                    // InternalVampireLanguage.g:1231:2: ( ( rule__VLSBinary__Group_1_0_0_4__0 ) )
                    {
                    // InternalVampireLanguage.g:1231:2: ( ( rule__VLSBinary__Group_1_0_0_4__0 ) )
                    // InternalVampireLanguage.g:1232:3: ( rule__VLSBinary__Group_1_0_0_4__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_4()); 
                    // InternalVampireLanguage.g:1233:3: ( rule__VLSBinary__Group_1_0_0_4__0 )
                    // InternalVampireLanguage.g:1233:4: rule__VLSBinary__Group_1_0_0_4__0
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
                    // InternalVampireLanguage.g:1237:2: ( ( rule__VLSBinary__Group_1_0_0_5__0 ) )
                    {
                    // InternalVampireLanguage.g:1237:2: ( ( rule__VLSBinary__Group_1_0_0_5__0 ) )
                    // InternalVampireLanguage.g:1238:3: ( rule__VLSBinary__Group_1_0_0_5__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_5()); 
                    // InternalVampireLanguage.g:1239:3: ( rule__VLSBinary__Group_1_0_0_5__0 )
                    // InternalVampireLanguage.g:1239:4: rule__VLSBinary__Group_1_0_0_5__0
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
    // InternalVampireLanguage.g:1247:1: rule__VLSUnitaryFormula__Alternatives : ( ( ruleVLSUniversalQuantifier ) | ( ruleVLSExistentialQuantifier ) | ( ruleVLSUnaryNegation ) | ( ruleVLSUnaryInfix ) | ( ( rule__VLSUnitaryFormula__Group_4__0 ) ) );
    public final void rule__VLSUnitaryFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1251:1: ( ( ruleVLSUniversalQuantifier ) | ( ruleVLSExistentialQuantifier ) | ( ruleVLSUnaryNegation ) | ( ruleVLSUnaryInfix ) | ( ( rule__VLSUnitaryFormula__Group_4__0 ) ) )
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
                    // InternalVampireLanguage.g:1252:2: ( ruleVLSUniversalQuantifier )
                    {
                    // InternalVampireLanguage.g:1252:2: ( ruleVLSUniversalQuantifier )
                    // InternalVampireLanguage.g:1253:3: ruleVLSUniversalQuantifier
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
                    // InternalVampireLanguage.g:1258:2: ( ruleVLSExistentialQuantifier )
                    {
                    // InternalVampireLanguage.g:1258:2: ( ruleVLSExistentialQuantifier )
                    // InternalVampireLanguage.g:1259:3: ruleVLSExistentialQuantifier
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
                    // InternalVampireLanguage.g:1264:2: ( ruleVLSUnaryNegation )
                    {
                    // InternalVampireLanguage.g:1264:2: ( ruleVLSUnaryNegation )
                    // InternalVampireLanguage.g:1265:3: ruleVLSUnaryNegation
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
                    // InternalVampireLanguage.g:1270:2: ( ruleVLSUnaryInfix )
                    {
                    // InternalVampireLanguage.g:1270:2: ( ruleVLSUnaryInfix )
                    // InternalVampireLanguage.g:1271:3: ruleVLSUnaryInfix
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
                    // InternalVampireLanguage.g:1276:2: ( ( rule__VLSUnitaryFormula__Group_4__0 ) )
                    {
                    // InternalVampireLanguage.g:1276:2: ( ( rule__VLSUnitaryFormula__Group_4__0 ) )
                    // InternalVampireLanguage.g:1277:3: ( rule__VLSUnitaryFormula__Group_4__0 )
                    {
                     before(grammarAccess.getVLSUnitaryFormulaAccess().getGroup_4()); 
                    // InternalVampireLanguage.g:1278:3: ( rule__VLSUnitaryFormula__Group_4__0 )
                    // InternalVampireLanguage.g:1278:4: rule__VLSUnitaryFormula__Group_4__0
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
    // InternalVampireLanguage.g:1286:1: rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0 : ( ( ruleVLSVariable ) | ( ruleVLSVariableDeclaration ) );
    public final void rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1290:1: ( ( ruleVLSVariable ) | ( ruleVLSVariableDeclaration ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_UPPER_WORD_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==50||LA16_1==56) ) {
                    alt16=1;
                }
                else if ( (LA16_1==61) ) {
                    alt16=2;
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
                    // InternalVampireLanguage.g:1291:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1291:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1292:3: ruleVLSVariable
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
                    // InternalVampireLanguage.g:1297:2: ( ruleVLSVariableDeclaration )
                    {
                    // InternalVampireLanguage.g:1297:2: ( ruleVLSVariableDeclaration )
                    // InternalVampireLanguage.g:1298:3: ruleVLSVariableDeclaration
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
    // InternalVampireLanguage.g:1307:1: rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0 : ( ( ruleVLSVariable ) | ( ruleVLSVariableDeclaration ) );
    public final void rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1311:1: ( ( ruleVLSVariable ) | ( ruleVLSVariableDeclaration ) )
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
                    // InternalVampireLanguage.g:1312:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1312:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1313:3: ruleVLSVariable
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
                    // InternalVampireLanguage.g:1318:2: ( ruleVLSVariableDeclaration )
                    {
                    // InternalVampireLanguage.g:1318:2: ( ruleVLSVariableDeclaration )
                    // InternalVampireLanguage.g:1319:3: ruleVLSVariableDeclaration
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
    // InternalVampireLanguage.g:1328:1: rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0 : ( ( ruleVLSVariable ) | ( ruleVLSVariableDeclaration ) );
    public final void rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1332:1: ( ( ruleVLSVariable ) | ( ruleVLSVariableDeclaration ) )
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
                    // InternalVampireLanguage.g:1333:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1333:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1334:3: ruleVLSVariable
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
                    // InternalVampireLanguage.g:1339:2: ( ruleVLSVariableDeclaration )
                    {
                    // InternalVampireLanguage.g:1339:2: ( ruleVLSVariableDeclaration )
                    // InternalVampireLanguage.g:1340:3: ruleVLSVariableDeclaration
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
    // InternalVampireLanguage.g:1349:1: rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0 : ( ( ruleVLSVariable ) | ( ruleVLSVariableDeclaration ) );
    public final void rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1353:1: ( ( ruleVLSVariable ) | ( ruleVLSVariableDeclaration ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_UPPER_WORD_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==50||LA19_1==56) ) {
                    alt19=1;
                }
                else if ( (LA19_1==61) ) {
                    alt19=2;
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
                    // InternalVampireLanguage.g:1354:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1354:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1355:3: ruleVLSVariable
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
                    // InternalVampireLanguage.g:1360:2: ( ruleVLSVariableDeclaration )
                    {
                    // InternalVampireLanguage.g:1360:2: ( ruleVLSVariableDeclaration )
                    // InternalVampireLanguage.g:1361:3: ruleVLSVariableDeclaration
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
    // InternalVampireLanguage.g:1370:1: rule__VLSUnaryInfix__Alternatives_1_0 : ( ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) ) );
    public final void rule__VLSUnaryInfix__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1374:1: ( ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) ) )
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
                    // InternalVampireLanguage.g:1375:2: ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1375:2: ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) )
                    // InternalVampireLanguage.g:1376:3: ( rule__VLSUnaryInfix__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_0()); 
                    // InternalVampireLanguage.g:1377:3: ( rule__VLSUnaryInfix__Group_1_0_0__0 )
                    // InternalVampireLanguage.g:1377:4: rule__VLSUnaryInfix__Group_1_0_0__0
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
                    // InternalVampireLanguage.g:1381:2: ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1381:2: ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) )
                    // InternalVampireLanguage.g:1382:3: ( rule__VLSUnaryInfix__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_1()); 
                    // InternalVampireLanguage.g:1383:3: ( rule__VLSUnaryInfix__Group_1_0_1__0 )
                    // InternalVampireLanguage.g:1383:4: rule__VLSUnaryInfix__Group_1_0_1__0
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
                    // InternalVampireLanguage.g:1387:2: ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1387:2: ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) )
                    // InternalVampireLanguage.g:1388:3: ( rule__VLSUnaryInfix__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_2()); 
                    // InternalVampireLanguage.g:1389:3: ( rule__VLSUnaryInfix__Group_1_0_2__0 )
                    // InternalVampireLanguage.g:1389:4: rule__VLSUnaryInfix__Group_1_0_2__0
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
    // InternalVampireLanguage.g:1397:1: rule__VLSAtomic__Alternatives : ( ( ruleVLSAtomicConstant ) | ( ruleVLSAtomicFunction ) | ( ruleVLSVariable ) | ( ruleVLSDefinedTerm ) );
    public final void rule__VLSAtomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1401:1: ( ( ruleVLSAtomicConstant ) | ( ruleVLSAtomicFunction ) | ( ruleVLSVariable ) | ( ruleVLSDefinedTerm ) )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalVampireLanguage.g:1402:2: ( ruleVLSAtomicConstant )
                    {
                    // InternalVampireLanguage.g:1402:2: ( ruleVLSAtomicConstant )
                    // InternalVampireLanguage.g:1403:3: ruleVLSAtomicConstant
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
                    // InternalVampireLanguage.g:1408:2: ( ruleVLSAtomicFunction )
                    {
                    // InternalVampireLanguage.g:1408:2: ( ruleVLSAtomicFunction )
                    // InternalVampireLanguage.g:1409:3: ruleVLSAtomicFunction
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
                    // InternalVampireLanguage.g:1414:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1414:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1415:3: ruleVLSVariable
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
                    // InternalVampireLanguage.g:1420:2: ( ruleVLSDefinedTerm )
                    {
                    // InternalVampireLanguage.g:1420:2: ( ruleVLSDefinedTerm )
                    // InternalVampireLanguage.g:1421:3: ruleVLSDefinedTerm
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
    // InternalVampireLanguage.g:1430:1: rule__VLSAtomicConstant__Alternatives : ( ( ( rule__VLSAtomicConstant__Group_0__0 ) ) | ( ( rule__VLSAtomicConstant__Group_1__0 ) ) | ( ( rule__VLSAtomicConstant__Group_2__0 ) ) );
    public final void rule__VLSAtomicConstant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1434:1: ( ( ( rule__VLSAtomicConstant__Group_0__0 ) ) | ( ( rule__VLSAtomicConstant__Group_1__0 ) ) | ( ( rule__VLSAtomicConstant__Group_2__0 ) ) )
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
                    // InternalVampireLanguage.g:1435:2: ( ( rule__VLSAtomicConstant__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1435:2: ( ( rule__VLSAtomicConstant__Group_0__0 ) )
                    // InternalVampireLanguage.g:1436:3: ( rule__VLSAtomicConstant__Group_0__0 )
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:1437:3: ( rule__VLSAtomicConstant__Group_0__0 )
                    // InternalVampireLanguage.g:1437:4: rule__VLSAtomicConstant__Group_0__0
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
                    // InternalVampireLanguage.g:1441:2: ( ( rule__VLSAtomicConstant__Group_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1441:2: ( ( rule__VLSAtomicConstant__Group_1__0 ) )
                    // InternalVampireLanguage.g:1442:3: ( rule__VLSAtomicConstant__Group_1__0 )
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getGroup_1()); 
                    // InternalVampireLanguage.g:1443:3: ( rule__VLSAtomicConstant__Group_1__0 )
                    // InternalVampireLanguage.g:1443:4: rule__VLSAtomicConstant__Group_1__0
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
                    // InternalVampireLanguage.g:1447:2: ( ( rule__VLSAtomicConstant__Group_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1447:2: ( ( rule__VLSAtomicConstant__Group_2__0 ) )
                    // InternalVampireLanguage.g:1448:3: ( rule__VLSAtomicConstant__Group_2__0 )
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getGroup_2()); 
                    // InternalVampireLanguage.g:1449:3: ( rule__VLSAtomicConstant__Group_2__0 )
                    // InternalVampireLanguage.g:1449:4: rule__VLSAtomicConstant__Group_2__0
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
    // InternalVampireLanguage.g:1457:1: rule__VLSAtomicConstant__NameAlternatives_0_1_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) | ( ruleVLSRole ) );
    public final void rule__VLSAtomicConstant__NameAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1461:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) | ( ruleVLSRole ) )
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
                    // InternalVampireLanguage.g:1462:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1462:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1463:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1468:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1468:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1469:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1474:2: ( RULE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1474:2: ( RULE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1475:3: RULE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameDOLLAR_IDTerminalRuleCall_0_1_0_2()); 
                    match(input,RULE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameDOLLAR_IDTerminalRuleCall_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1480:2: ( RULE_DOUBLE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1480:2: ( RULE_DOUBLE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1481:3: RULE_DOUBLE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 
                    match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:1486:2: ( ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:1486:2: ( ruleVLSRole )
                    // InternalVampireLanguage.g:1487:3: ruleVLSRole
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
    // InternalVampireLanguage.g:1496:1: rule__VLSAtomicFunction__Alternatives : ( ( ( rule__VLSAtomicFunction__Group_0__0 ) ) | ( ( rule__VLSAtomicFunction__Group_1__0 ) ) );
    public final void rule__VLSAtomicFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1500:1: ( ( ( rule__VLSAtomicFunction__Group_0__0 ) ) | ( ( rule__VLSAtomicFunction__Group_1__0 ) ) )
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
                    // InternalVampireLanguage.g:1501:2: ( ( rule__VLSAtomicFunction__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1501:2: ( ( rule__VLSAtomicFunction__Group_0__0 ) )
                    // InternalVampireLanguage.g:1502:3: ( rule__VLSAtomicFunction__Group_0__0 )
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:1503:3: ( rule__VLSAtomicFunction__Group_0__0 )
                    // InternalVampireLanguage.g:1503:4: rule__VLSAtomicFunction__Group_0__0
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
                    // InternalVampireLanguage.g:1507:2: ( ( rule__VLSAtomicFunction__Group_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1507:2: ( ( rule__VLSAtomicFunction__Group_1__0 ) )
                    // InternalVampireLanguage.g:1508:3: ( rule__VLSAtomicFunction__Group_1__0 )
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_1()); 
                    // InternalVampireLanguage.g:1509:3: ( rule__VLSAtomicFunction__Group_1__0 )
                    // InternalVampireLanguage.g:1509:4: rule__VLSAtomicFunction__Group_1__0
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
    // InternalVampireLanguage.g:1517:1: rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) | ( ruleVLSRole ) );
    public final void rule__VLSAtomicFunction__ConstantAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1521:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) | ( ruleVLSRole ) )
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
                    // InternalVampireLanguage.g:1522:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1522:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1523:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1528:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1528:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1529:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1534:2: ( RULE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1534:2: ( RULE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1535:3: RULE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOLLAR_IDTerminalRuleCall_0_1_0_2()); 
                    match(input,RULE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOLLAR_IDTerminalRuleCall_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1540:2: ( RULE_DOUBLE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1540:2: ( RULE_DOUBLE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1541:3: RULE_DOUBLE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 
                    match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:1546:2: ( ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:1546:2: ( ruleVLSRole )
                    // InternalVampireLanguage.g:1547:3: ruleVLSRole
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
    // InternalVampireLanguage.g:1556:1: rule__VLSFofTerm__Alternatives : ( ( ruleVLSVariable ) | ( ruleVLSFunctionAsTerm ) | ( ruleVLSDefinedTerm ) );
    public final void rule__VLSFofTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1560:1: ( ( ruleVLSVariable ) | ( ruleVLSFunctionAsTerm ) | ( ruleVLSDefinedTerm ) )
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
                    // InternalVampireLanguage.g:1561:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1561:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1562:3: ruleVLSVariable
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
                    // InternalVampireLanguage.g:1567:2: ( ruleVLSFunctionAsTerm )
                    {
                    // InternalVampireLanguage.g:1567:2: ( ruleVLSFunctionAsTerm )
                    // InternalVampireLanguage.g:1568:3: ruleVLSFunctionAsTerm
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
                    // InternalVampireLanguage.g:1573:2: ( ruleVLSDefinedTerm )
                    {
                    // InternalVampireLanguage.g:1573:2: ( ruleVLSDefinedTerm )
                    // InternalVampireLanguage.g:1574:3: ruleVLSDefinedTerm
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
    // InternalVampireLanguage.g:1583:1: rule__VLSFunctionAsTerm__FunctorAlternatives_0_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) );
    public final void rule__VLSFunctionAsTerm__FunctorAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1587:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) )
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
                    // InternalVampireLanguage.g:1588:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1588:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1589:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSFunctionAsTermAccess().getFunctorLOWER_WORD_IDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionAsTermAccess().getFunctorLOWER_WORD_IDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1594:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1594:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1595:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSFunctionAsTermAccess().getFunctorSINGLE_QUOTETerminalRuleCall_0_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionAsTermAccess().getFunctorSINGLE_QUOTETerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1600:2: ( RULE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1600:2: ( RULE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1601:3: RULE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSFunctionAsTermAccess().getFunctorDOLLAR_IDTerminalRuleCall_0_0_2()); 
                    match(input,RULE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionAsTermAccess().getFunctorDOLLAR_IDTerminalRuleCall_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1606:2: ( RULE_DOUBLE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1606:2: ( RULE_DOUBLE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1607:3: RULE_DOUBLE_DOLLAR_ID
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
    // InternalVampireLanguage.g:1616:1: rule__VLSDefinedTerm__Alternatives : ( ( ( rule__VLSDefinedTerm__Group_0__0 ) ) | ( ( rule__VLSDefinedTerm__Group_1__0 ) ) );
    public final void rule__VLSDefinedTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1620:1: ( ( ( rule__VLSDefinedTerm__Group_0__0 ) ) | ( ( rule__VLSDefinedTerm__Group_1__0 ) ) )
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
                    // InternalVampireLanguage.g:1621:2: ( ( rule__VLSDefinedTerm__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1621:2: ( ( rule__VLSDefinedTerm__Group_0__0 ) )
                    // InternalVampireLanguage.g:1622:3: ( rule__VLSDefinedTerm__Group_0__0 )
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:1623:3: ( rule__VLSDefinedTerm__Group_0__0 )
                    // InternalVampireLanguage.g:1623:4: rule__VLSDefinedTerm__Group_0__0
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
                    // InternalVampireLanguage.g:1627:2: ( ( rule__VLSDefinedTerm__Group_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1627:2: ( ( rule__VLSDefinedTerm__Group_1__0 ) )
                    // InternalVampireLanguage.g:1628:3: ( rule__VLSDefinedTerm__Group_1__0 )
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getGroup_1()); 
                    // InternalVampireLanguage.g:1629:3: ( rule__VLSDefinedTerm__Group_1__0 )
                    // InternalVampireLanguage.g:1629:4: rule__VLSDefinedTerm__Group_1__0
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
    // InternalVampireLanguage.g:1637:1: rule__VLSConfirmations__Group_0__0 : rule__VLSConfirmations__Group_0__0__Impl rule__VLSConfirmations__Group_0__1 ;
    public final void rule__VLSConfirmations__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1641:1: ( rule__VLSConfirmations__Group_0__0__Impl rule__VLSConfirmations__Group_0__1 )
            // InternalVampireLanguage.g:1642:2: rule__VLSConfirmations__Group_0__0__Impl rule__VLSConfirmations__Group_0__1
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
    // InternalVampireLanguage.g:1649:1: rule__VLSConfirmations__Group_0__0__Impl : ( () ) ;
    public final void rule__VLSConfirmations__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1653:1: ( ( () ) )
            // InternalVampireLanguage.g:1654:1: ( () )
            {
            // InternalVampireLanguage.g:1654:1: ( () )
            // InternalVampireLanguage.g:1655:2: ()
            {
             before(grammarAccess.getVLSConfirmationsAccess().getVLSSatisfiableAction_0_0()); 
            // InternalVampireLanguage.g:1656:2: ()
            // InternalVampireLanguage.g:1656:3: 
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
    // InternalVampireLanguage.g:1664:1: rule__VLSConfirmations__Group_0__1 : rule__VLSConfirmations__Group_0__1__Impl ;
    public final void rule__VLSConfirmations__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1668:1: ( rule__VLSConfirmations__Group_0__1__Impl )
            // InternalVampireLanguage.g:1669:2: rule__VLSConfirmations__Group_0__1__Impl
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
    // InternalVampireLanguage.g:1675:1: rule__VLSConfirmations__Group_0__1__Impl : ( 'Satisfiable!' ) ;
    public final void rule__VLSConfirmations__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1679:1: ( ( 'Satisfiable!' ) )
            // InternalVampireLanguage.g:1680:1: ( 'Satisfiable!' )
            {
            // InternalVampireLanguage.g:1680:1: ( 'Satisfiable!' )
            // InternalVampireLanguage.g:1681:2: 'Satisfiable!'
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
    // InternalVampireLanguage.g:1691:1: rule__VLSConfirmations__Group_1__0 : rule__VLSConfirmations__Group_1__0__Impl rule__VLSConfirmations__Group_1__1 ;
    public final void rule__VLSConfirmations__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1695:1: ( rule__VLSConfirmations__Group_1__0__Impl rule__VLSConfirmations__Group_1__1 )
            // InternalVampireLanguage.g:1696:2: rule__VLSConfirmations__Group_1__0__Impl rule__VLSConfirmations__Group_1__1
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
    // InternalVampireLanguage.g:1703:1: rule__VLSConfirmations__Group_1__0__Impl : ( () ) ;
    public final void rule__VLSConfirmations__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1707:1: ( ( () ) )
            // InternalVampireLanguage.g:1708:1: ( () )
            {
            // InternalVampireLanguage.g:1708:1: ( () )
            // InternalVampireLanguage.g:1709:2: ()
            {
             before(grammarAccess.getVLSConfirmationsAccess().getVLSWarningAction_1_0()); 
            // InternalVampireLanguage.g:1710:2: ()
            // InternalVampireLanguage.g:1710:3: 
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
    // InternalVampireLanguage.g:1718:1: rule__VLSConfirmations__Group_1__1 : rule__VLSConfirmations__Group_1__1__Impl rule__VLSConfirmations__Group_1__2 ;
    public final void rule__VLSConfirmations__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1722:1: ( rule__VLSConfirmations__Group_1__1__Impl rule__VLSConfirmations__Group_1__2 )
            // InternalVampireLanguage.g:1723:2: rule__VLSConfirmations__Group_1__1__Impl rule__VLSConfirmations__Group_1__2
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
    // InternalVampireLanguage.g:1730:1: rule__VLSConfirmations__Group_1__1__Impl : ( 'WARNING!' ) ;
    public final void rule__VLSConfirmations__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1734:1: ( ( 'WARNING!' ) )
            // InternalVampireLanguage.g:1735:1: ( 'WARNING!' )
            {
            // InternalVampireLanguage.g:1735:1: ( 'WARNING!' )
            // InternalVampireLanguage.g:1736:2: 'WARNING!'
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
    // InternalVampireLanguage.g:1745:1: rule__VLSConfirmations__Group_1__2 : rule__VLSConfirmations__Group_1__2__Impl rule__VLSConfirmations__Group_1__3 ;
    public final void rule__VLSConfirmations__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1749:1: ( rule__VLSConfirmations__Group_1__2__Impl rule__VLSConfirmations__Group_1__3 )
            // InternalVampireLanguage.g:1750:2: rule__VLSConfirmations__Group_1__2__Impl rule__VLSConfirmations__Group_1__3
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
    // InternalVampireLanguage.g:1757:1: rule__VLSConfirmations__Group_1__2__Impl : ( 'Could' ) ;
    public final void rule__VLSConfirmations__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1761:1: ( ( 'Could' ) )
            // InternalVampireLanguage.g:1762:1: ( 'Could' )
            {
            // InternalVampireLanguage.g:1762:1: ( 'Could' )
            // InternalVampireLanguage.g:1763:2: 'Could'
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
    // InternalVampireLanguage.g:1772:1: rule__VLSConfirmations__Group_1__3 : rule__VLSConfirmations__Group_1__3__Impl rule__VLSConfirmations__Group_1__4 ;
    public final void rule__VLSConfirmations__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1776:1: ( rule__VLSConfirmations__Group_1__3__Impl rule__VLSConfirmations__Group_1__4 )
            // InternalVampireLanguage.g:1777:2: rule__VLSConfirmations__Group_1__3__Impl rule__VLSConfirmations__Group_1__4
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
    // InternalVampireLanguage.g:1784:1: rule__VLSConfirmations__Group_1__3__Impl : ( 'not' ) ;
    public final void rule__VLSConfirmations__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1788:1: ( ( 'not' ) )
            // InternalVampireLanguage.g:1789:1: ( 'not' )
            {
            // InternalVampireLanguage.g:1789:1: ( 'not' )
            // InternalVampireLanguage.g:1790:2: 'not'
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
    // InternalVampireLanguage.g:1799:1: rule__VLSConfirmations__Group_1__4 : rule__VLSConfirmations__Group_1__4__Impl rule__VLSConfirmations__Group_1__5 ;
    public final void rule__VLSConfirmations__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1803:1: ( rule__VLSConfirmations__Group_1__4__Impl rule__VLSConfirmations__Group_1__5 )
            // InternalVampireLanguage.g:1804:2: rule__VLSConfirmations__Group_1__4__Impl rule__VLSConfirmations__Group_1__5
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
    // InternalVampireLanguage.g:1811:1: rule__VLSConfirmations__Group_1__4__Impl : ( 'set' ) ;
    public final void rule__VLSConfirmations__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1815:1: ( ( 'set' ) )
            // InternalVampireLanguage.g:1816:1: ( 'set' )
            {
            // InternalVampireLanguage.g:1816:1: ( 'set' )
            // InternalVampireLanguage.g:1817:2: 'set'
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
    // InternalVampireLanguage.g:1826:1: rule__VLSConfirmations__Group_1__5 : rule__VLSConfirmations__Group_1__5__Impl rule__VLSConfirmations__Group_1__6 ;
    public final void rule__VLSConfirmations__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1830:1: ( rule__VLSConfirmations__Group_1__5__Impl rule__VLSConfirmations__Group_1__6 )
            // InternalVampireLanguage.g:1831:2: rule__VLSConfirmations__Group_1__5__Impl rule__VLSConfirmations__Group_1__6
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
    // InternalVampireLanguage.g:1838:1: rule__VLSConfirmations__Group_1__5__Impl : ( 'resource' ) ;
    public final void rule__VLSConfirmations__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1842:1: ( ( 'resource' ) )
            // InternalVampireLanguage.g:1843:1: ( 'resource' )
            {
            // InternalVampireLanguage.g:1843:1: ( 'resource' )
            // InternalVampireLanguage.g:1844:2: 'resource'
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
    // InternalVampireLanguage.g:1853:1: rule__VLSConfirmations__Group_1__6 : rule__VLSConfirmations__Group_1__6__Impl rule__VLSConfirmations__Group_1__7 ;
    public final void rule__VLSConfirmations__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1857:1: ( rule__VLSConfirmations__Group_1__6__Impl rule__VLSConfirmations__Group_1__7 )
            // InternalVampireLanguage.g:1858:2: rule__VLSConfirmations__Group_1__6__Impl rule__VLSConfirmations__Group_1__7
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
    // InternalVampireLanguage.g:1865:1: rule__VLSConfirmations__Group_1__6__Impl : ( 'limit:' ) ;
    public final void rule__VLSConfirmations__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1869:1: ( ( 'limit:' ) )
            // InternalVampireLanguage.g:1870:1: ( 'limit:' )
            {
            // InternalVampireLanguage.g:1870:1: ( 'limit:' )
            // InternalVampireLanguage.g:1871:2: 'limit:'
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
    // InternalVampireLanguage.g:1880:1: rule__VLSConfirmations__Group_1__7 : rule__VLSConfirmations__Group_1__7__Impl rule__VLSConfirmations__Group_1__8 ;
    public final void rule__VLSConfirmations__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1884:1: ( rule__VLSConfirmations__Group_1__7__Impl rule__VLSConfirmations__Group_1__8 )
            // InternalVampireLanguage.g:1885:2: rule__VLSConfirmations__Group_1__7__Impl rule__VLSConfirmations__Group_1__8
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
    // InternalVampireLanguage.g:1892:1: rule__VLSConfirmations__Group_1__7__Impl : ( 'Virtual' ) ;
    public final void rule__VLSConfirmations__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1896:1: ( ( 'Virtual' ) )
            // InternalVampireLanguage.g:1897:1: ( 'Virtual' )
            {
            // InternalVampireLanguage.g:1897:1: ( 'Virtual' )
            // InternalVampireLanguage.g:1898:2: 'Virtual'
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
    // InternalVampireLanguage.g:1907:1: rule__VLSConfirmations__Group_1__8 : rule__VLSConfirmations__Group_1__8__Impl ;
    public final void rule__VLSConfirmations__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1911:1: ( rule__VLSConfirmations__Group_1__8__Impl )
            // InternalVampireLanguage.g:1912:2: rule__VLSConfirmations__Group_1__8__Impl
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
    // InternalVampireLanguage.g:1918:1: rule__VLSConfirmations__Group_1__8__Impl : ( 'memory.' ) ;
    public final void rule__VLSConfirmations__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1922:1: ( ( 'memory.' ) )
            // InternalVampireLanguage.g:1923:1: ( 'memory.' )
            {
            // InternalVampireLanguage.g:1923:1: ( 'memory.' )
            // InternalVampireLanguage.g:1924:2: 'memory.'
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
    // InternalVampireLanguage.g:1934:1: rule__VLSConfirmations__Group_2__0 : rule__VLSConfirmations__Group_2__0__Impl rule__VLSConfirmations__Group_2__1 ;
    public final void rule__VLSConfirmations__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1938:1: ( rule__VLSConfirmations__Group_2__0__Impl rule__VLSConfirmations__Group_2__1 )
            // InternalVampireLanguage.g:1939:2: rule__VLSConfirmations__Group_2__0__Impl rule__VLSConfirmations__Group_2__1
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
    // InternalVampireLanguage.g:1946:1: rule__VLSConfirmations__Group_2__0__Impl : ( () ) ;
    public final void rule__VLSConfirmations__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1950:1: ( ( () ) )
            // InternalVampireLanguage.g:1951:1: ( () )
            {
            // InternalVampireLanguage.g:1951:1: ( () )
            // InternalVampireLanguage.g:1952:2: ()
            {
             before(grammarAccess.getVLSConfirmationsAccess().getVLSTryingAction_2_0()); 
            // InternalVampireLanguage.g:1953:2: ()
            // InternalVampireLanguage.g:1953:3: 
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
    // InternalVampireLanguage.g:1961:1: rule__VLSConfirmations__Group_2__1 : rule__VLSConfirmations__Group_2__1__Impl rule__VLSConfirmations__Group_2__2 ;
    public final void rule__VLSConfirmations__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1965:1: ( rule__VLSConfirmations__Group_2__1__Impl rule__VLSConfirmations__Group_2__2 )
            // InternalVampireLanguage.g:1966:2: rule__VLSConfirmations__Group_2__1__Impl rule__VLSConfirmations__Group_2__2
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
    // InternalVampireLanguage.g:1973:1: rule__VLSConfirmations__Group_2__1__Impl : ( 'TRYING' ) ;
    public final void rule__VLSConfirmations__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1977:1: ( ( 'TRYING' ) )
            // InternalVampireLanguage.g:1978:1: ( 'TRYING' )
            {
            // InternalVampireLanguage.g:1978:1: ( 'TRYING' )
            // InternalVampireLanguage.g:1979:2: 'TRYING'
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
    // InternalVampireLanguage.g:1988:1: rule__VLSConfirmations__Group_2__2 : rule__VLSConfirmations__Group_2__2__Impl rule__VLSConfirmations__Group_2__3 ;
    public final void rule__VLSConfirmations__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1992:1: ( rule__VLSConfirmations__Group_2__2__Impl rule__VLSConfirmations__Group_2__3 )
            // InternalVampireLanguage.g:1993:2: rule__VLSConfirmations__Group_2__2__Impl rule__VLSConfirmations__Group_2__3
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
    // InternalVampireLanguage.g:2000:1: rule__VLSConfirmations__Group_2__2__Impl : ( '[' ) ;
    public final void rule__VLSConfirmations__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2004:1: ( ( '[' ) )
            // InternalVampireLanguage.g:2005:1: ( '[' )
            {
            // InternalVampireLanguage.g:2005:1: ( '[' )
            // InternalVampireLanguage.g:2006:2: '['
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
    // InternalVampireLanguage.g:2015:1: rule__VLSConfirmations__Group_2__3 : rule__VLSConfirmations__Group_2__3__Impl rule__VLSConfirmations__Group_2__4 ;
    public final void rule__VLSConfirmations__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2019:1: ( rule__VLSConfirmations__Group_2__3__Impl rule__VLSConfirmations__Group_2__4 )
            // InternalVampireLanguage.g:2020:2: rule__VLSConfirmations__Group_2__3__Impl rule__VLSConfirmations__Group_2__4
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
    // InternalVampireLanguage.g:2027:1: rule__VLSConfirmations__Group_2__3__Impl : ( ( rule__VLSConfirmations__NameAssignment_2_3 ) ) ;
    public final void rule__VLSConfirmations__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2031:1: ( ( ( rule__VLSConfirmations__NameAssignment_2_3 ) ) )
            // InternalVampireLanguage.g:2032:1: ( ( rule__VLSConfirmations__NameAssignment_2_3 ) )
            {
            // InternalVampireLanguage.g:2032:1: ( ( rule__VLSConfirmations__NameAssignment_2_3 ) )
            // InternalVampireLanguage.g:2033:2: ( rule__VLSConfirmations__NameAssignment_2_3 )
            {
             before(grammarAccess.getVLSConfirmationsAccess().getNameAssignment_2_3()); 
            // InternalVampireLanguage.g:2034:2: ( rule__VLSConfirmations__NameAssignment_2_3 )
            // InternalVampireLanguage.g:2034:3: rule__VLSConfirmations__NameAssignment_2_3
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
    // InternalVampireLanguage.g:2042:1: rule__VLSConfirmations__Group_2__4 : rule__VLSConfirmations__Group_2__4__Impl ;
    public final void rule__VLSConfirmations__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2046:1: ( rule__VLSConfirmations__Group_2__4__Impl )
            // InternalVampireLanguage.g:2047:2: rule__VLSConfirmations__Group_2__4__Impl
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
    // InternalVampireLanguage.g:2053:1: rule__VLSConfirmations__Group_2__4__Impl : ( ']' ) ;
    public final void rule__VLSConfirmations__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2057:1: ( ( ']' ) )
            // InternalVampireLanguage.g:2058:1: ( ']' )
            {
            // InternalVampireLanguage.g:2058:1: ( ']' )
            // InternalVampireLanguage.g:2059:2: ']'
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
    // InternalVampireLanguage.g:2069:1: rule__VLSConfirmations__Group_3__0 : rule__VLSConfirmations__Group_3__0__Impl rule__VLSConfirmations__Group_3__1 ;
    public final void rule__VLSConfirmations__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2073:1: ( rule__VLSConfirmations__Group_3__0__Impl rule__VLSConfirmations__Group_3__1 )
            // InternalVampireLanguage.g:2074:2: rule__VLSConfirmations__Group_3__0__Impl rule__VLSConfirmations__Group_3__1
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
    // InternalVampireLanguage.g:2081:1: rule__VLSConfirmations__Group_3__0__Impl : ( () ) ;
    public final void rule__VLSConfirmations__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2085:1: ( ( () ) )
            // InternalVampireLanguage.g:2086:1: ( () )
            {
            // InternalVampireLanguage.g:2086:1: ( () )
            // InternalVampireLanguage.g:2087:2: ()
            {
             before(grammarAccess.getVLSConfirmationsAccess().getVLSFiniteModelAction_3_0()); 
            // InternalVampireLanguage.g:2088:2: ()
            // InternalVampireLanguage.g:2088:3: 
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
    // InternalVampireLanguage.g:2096:1: rule__VLSConfirmations__Group_3__1 : rule__VLSConfirmations__Group_3__1__Impl rule__VLSConfirmations__Group_3__2 ;
    public final void rule__VLSConfirmations__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2100:1: ( rule__VLSConfirmations__Group_3__1__Impl rule__VLSConfirmations__Group_3__2 )
            // InternalVampireLanguage.g:2101:2: rule__VLSConfirmations__Group_3__1__Impl rule__VLSConfirmations__Group_3__2
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
    // InternalVampireLanguage.g:2108:1: rule__VLSConfirmations__Group_3__1__Impl : ( 'Finite' ) ;
    public final void rule__VLSConfirmations__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2112:1: ( ( 'Finite' ) )
            // InternalVampireLanguage.g:2113:1: ( 'Finite' )
            {
            // InternalVampireLanguage.g:2113:1: ( 'Finite' )
            // InternalVampireLanguage.g:2114:2: 'Finite'
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
    // InternalVampireLanguage.g:2123:1: rule__VLSConfirmations__Group_3__2 : rule__VLSConfirmations__Group_3__2__Impl rule__VLSConfirmations__Group_3__3 ;
    public final void rule__VLSConfirmations__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2127:1: ( rule__VLSConfirmations__Group_3__2__Impl rule__VLSConfirmations__Group_3__3 )
            // InternalVampireLanguage.g:2128:2: rule__VLSConfirmations__Group_3__2__Impl rule__VLSConfirmations__Group_3__3
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
    // InternalVampireLanguage.g:2135:1: rule__VLSConfirmations__Group_3__2__Impl : ( 'Model' ) ;
    public final void rule__VLSConfirmations__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2139:1: ( ( 'Model' ) )
            // InternalVampireLanguage.g:2140:1: ( 'Model' )
            {
            // InternalVampireLanguage.g:2140:1: ( 'Model' )
            // InternalVampireLanguage.g:2141:2: 'Model'
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
    // InternalVampireLanguage.g:2150:1: rule__VLSConfirmations__Group_3__3 : rule__VLSConfirmations__Group_3__3__Impl ;
    public final void rule__VLSConfirmations__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2154:1: ( rule__VLSConfirmations__Group_3__3__Impl )
            // InternalVampireLanguage.g:2155:2: rule__VLSConfirmations__Group_3__3__Impl
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
    // InternalVampireLanguage.g:2161:1: rule__VLSConfirmations__Group_3__3__Impl : ( 'Found!' ) ;
    public final void rule__VLSConfirmations__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2165:1: ( ( 'Found!' ) )
            // InternalVampireLanguage.g:2166:1: ( 'Found!' )
            {
            // InternalVampireLanguage.g:2166:1: ( 'Found!' )
            // InternalVampireLanguage.g:2167:2: 'Found!'
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
    // InternalVampireLanguage.g:2177:1: rule__VLSFofFormula__Group__0 : rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1 ;
    public final void rule__VLSFofFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2181:1: ( rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1 )
            // InternalVampireLanguage.g:2182:2: rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1
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
    // InternalVampireLanguage.g:2189:1: rule__VLSFofFormula__Group__0__Impl : ( 'fof' ) ;
    public final void rule__VLSFofFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2193:1: ( ( 'fof' ) )
            // InternalVampireLanguage.g:2194:1: ( 'fof' )
            {
            // InternalVampireLanguage.g:2194:1: ( 'fof' )
            // InternalVampireLanguage.g:2195:2: 'fof'
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
    // InternalVampireLanguage.g:2204:1: rule__VLSFofFormula__Group__1 : rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2 ;
    public final void rule__VLSFofFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2208:1: ( rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2 )
            // InternalVampireLanguage.g:2209:2: rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2
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
    // InternalVampireLanguage.g:2216:1: rule__VLSFofFormula__Group__1__Impl : ( '(' ) ;
    public final void rule__VLSFofFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2220:1: ( ( '(' ) )
            // InternalVampireLanguage.g:2221:1: ( '(' )
            {
            // InternalVampireLanguage.g:2221:1: ( '(' )
            // InternalVampireLanguage.g:2222:2: '('
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
    // InternalVampireLanguage.g:2231:1: rule__VLSFofFormula__Group__2 : rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3 ;
    public final void rule__VLSFofFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2235:1: ( rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3 )
            // InternalVampireLanguage.g:2236:2: rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3
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
    // InternalVampireLanguage.g:2243:1: rule__VLSFofFormula__Group__2__Impl : ( ( rule__VLSFofFormula__NameAssignment_2 ) ) ;
    public final void rule__VLSFofFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2247:1: ( ( ( rule__VLSFofFormula__NameAssignment_2 ) ) )
            // InternalVampireLanguage.g:2248:1: ( ( rule__VLSFofFormula__NameAssignment_2 ) )
            {
            // InternalVampireLanguage.g:2248:1: ( ( rule__VLSFofFormula__NameAssignment_2 ) )
            // InternalVampireLanguage.g:2249:2: ( rule__VLSFofFormula__NameAssignment_2 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getNameAssignment_2()); 
            // InternalVampireLanguage.g:2250:2: ( rule__VLSFofFormula__NameAssignment_2 )
            // InternalVampireLanguage.g:2250:3: rule__VLSFofFormula__NameAssignment_2
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
    // InternalVampireLanguage.g:2258:1: rule__VLSFofFormula__Group__3 : rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4 ;
    public final void rule__VLSFofFormula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2262:1: ( rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4 )
            // InternalVampireLanguage.g:2263:2: rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4
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
    // InternalVampireLanguage.g:2270:1: rule__VLSFofFormula__Group__3__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2274:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2275:1: ( ',' )
            {
            // InternalVampireLanguage.g:2275:1: ( ',' )
            // InternalVampireLanguage.g:2276:2: ','
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
    // InternalVampireLanguage.g:2285:1: rule__VLSFofFormula__Group__4 : rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5 ;
    public final void rule__VLSFofFormula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2289:1: ( rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5 )
            // InternalVampireLanguage.g:2290:2: rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5
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
    // InternalVampireLanguage.g:2297:1: rule__VLSFofFormula__Group__4__Impl : ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) ) ;
    public final void rule__VLSFofFormula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2301:1: ( ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) ) )
            // InternalVampireLanguage.g:2302:1: ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) )
            {
            // InternalVampireLanguage.g:2302:1: ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) )
            // InternalVampireLanguage.g:2303:2: ( rule__VLSFofFormula__FofRoleAssignment_4 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofRoleAssignment_4()); 
            // InternalVampireLanguage.g:2304:2: ( rule__VLSFofFormula__FofRoleAssignment_4 )
            // InternalVampireLanguage.g:2304:3: rule__VLSFofFormula__FofRoleAssignment_4
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
    // InternalVampireLanguage.g:2312:1: rule__VLSFofFormula__Group__5 : rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6 ;
    public final void rule__VLSFofFormula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2316:1: ( rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6 )
            // InternalVampireLanguage.g:2317:2: rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6
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
    // InternalVampireLanguage.g:2324:1: rule__VLSFofFormula__Group__5__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2328:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2329:1: ( ',' )
            {
            // InternalVampireLanguage.g:2329:1: ( ',' )
            // InternalVampireLanguage.g:2330:2: ','
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
    // InternalVampireLanguage.g:2339:1: rule__VLSFofFormula__Group__6 : rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7 ;
    public final void rule__VLSFofFormula__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2343:1: ( rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7 )
            // InternalVampireLanguage.g:2344:2: rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7
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
    // InternalVampireLanguage.g:2351:1: rule__VLSFofFormula__Group__6__Impl : ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) ) ;
    public final void rule__VLSFofFormula__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2355:1: ( ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) ) )
            // InternalVampireLanguage.g:2356:1: ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) )
            {
            // InternalVampireLanguage.g:2356:1: ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) )
            // InternalVampireLanguage.g:2357:2: ( rule__VLSFofFormula__FofFormulaAssignment_6 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofFormulaAssignment_6()); 
            // InternalVampireLanguage.g:2358:2: ( rule__VLSFofFormula__FofFormulaAssignment_6 )
            // InternalVampireLanguage.g:2358:3: rule__VLSFofFormula__FofFormulaAssignment_6
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
    // InternalVampireLanguage.g:2366:1: rule__VLSFofFormula__Group__7 : rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8 ;
    public final void rule__VLSFofFormula__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2370:1: ( rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8 )
            // InternalVampireLanguage.g:2371:2: rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8
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
    // InternalVampireLanguage.g:2378:1: rule__VLSFofFormula__Group__7__Impl : ( ( rule__VLSFofFormula__Group_7__0 )? ) ;
    public final void rule__VLSFofFormula__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2382:1: ( ( ( rule__VLSFofFormula__Group_7__0 )? ) )
            // InternalVampireLanguage.g:2383:1: ( ( rule__VLSFofFormula__Group_7__0 )? )
            {
            // InternalVampireLanguage.g:2383:1: ( ( rule__VLSFofFormula__Group_7__0 )? )
            // InternalVampireLanguage.g:2384:2: ( rule__VLSFofFormula__Group_7__0 )?
            {
             before(grammarAccess.getVLSFofFormulaAccess().getGroup_7()); 
            // InternalVampireLanguage.g:2385:2: ( rule__VLSFofFormula__Group_7__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==56) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVampireLanguage.g:2385:3: rule__VLSFofFormula__Group_7__0
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
    // InternalVampireLanguage.g:2393:1: rule__VLSFofFormula__Group__8 : rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9 ;
    public final void rule__VLSFofFormula__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2397:1: ( rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9 )
            // InternalVampireLanguage.g:2398:2: rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9
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
    // InternalVampireLanguage.g:2405:1: rule__VLSFofFormula__Group__8__Impl : ( ')' ) ;
    public final void rule__VLSFofFormula__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2409:1: ( ( ')' ) )
            // InternalVampireLanguage.g:2410:1: ( ')' )
            {
            // InternalVampireLanguage.g:2410:1: ( ')' )
            // InternalVampireLanguage.g:2411:2: ')'
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
    // InternalVampireLanguage.g:2420:1: rule__VLSFofFormula__Group__9 : rule__VLSFofFormula__Group__9__Impl ;
    public final void rule__VLSFofFormula__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2424:1: ( rule__VLSFofFormula__Group__9__Impl )
            // InternalVampireLanguage.g:2425:2: rule__VLSFofFormula__Group__9__Impl
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
    // InternalVampireLanguage.g:2431:1: rule__VLSFofFormula__Group__9__Impl : ( '.' ) ;
    public final void rule__VLSFofFormula__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2435:1: ( ( '.' ) )
            // InternalVampireLanguage.g:2436:1: ( '.' )
            {
            // InternalVampireLanguage.g:2436:1: ( '.' )
            // InternalVampireLanguage.g:2437:2: '.'
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
    // InternalVampireLanguage.g:2447:1: rule__VLSFofFormula__Group_7__0 : rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1 ;
    public final void rule__VLSFofFormula__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2451:1: ( rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1 )
            // InternalVampireLanguage.g:2452:2: rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1
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
    // InternalVampireLanguage.g:2459:1: rule__VLSFofFormula__Group_7__0__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2463:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2464:1: ( ',' )
            {
            // InternalVampireLanguage.g:2464:1: ( ',' )
            // InternalVampireLanguage.g:2465:2: ','
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
    // InternalVampireLanguage.g:2474:1: rule__VLSFofFormula__Group_7__1 : rule__VLSFofFormula__Group_7__1__Impl ;
    public final void rule__VLSFofFormula__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2478:1: ( rule__VLSFofFormula__Group_7__1__Impl )
            // InternalVampireLanguage.g:2479:2: rule__VLSFofFormula__Group_7__1__Impl
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
    // InternalVampireLanguage.g:2485:1: rule__VLSFofFormula__Group_7__1__Impl : ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) ) ;
    public final void rule__VLSFofFormula__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2489:1: ( ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) ) )
            // InternalVampireLanguage.g:2490:1: ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) )
            {
            // InternalVampireLanguage.g:2490:1: ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) )
            // InternalVampireLanguage.g:2491:2: ( rule__VLSFofFormula__AnnotationsAssignment_7_1 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getAnnotationsAssignment_7_1()); 
            // InternalVampireLanguage.g:2492:2: ( rule__VLSFofFormula__AnnotationsAssignment_7_1 )
            // InternalVampireLanguage.g:2492:3: rule__VLSFofFormula__AnnotationsAssignment_7_1
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
    // InternalVampireLanguage.g:2501:1: rule__VLSTffFormula__Group__0 : rule__VLSTffFormula__Group__0__Impl rule__VLSTffFormula__Group__1 ;
    public final void rule__VLSTffFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2505:1: ( rule__VLSTffFormula__Group__0__Impl rule__VLSTffFormula__Group__1 )
            // InternalVampireLanguage.g:2506:2: rule__VLSTffFormula__Group__0__Impl rule__VLSTffFormula__Group__1
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
    // InternalVampireLanguage.g:2513:1: rule__VLSTffFormula__Group__0__Impl : ( 'tff' ) ;
    public final void rule__VLSTffFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2517:1: ( ( 'tff' ) )
            // InternalVampireLanguage.g:2518:1: ( 'tff' )
            {
            // InternalVampireLanguage.g:2518:1: ( 'tff' )
            // InternalVampireLanguage.g:2519:2: 'tff'
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
    // InternalVampireLanguage.g:2528:1: rule__VLSTffFormula__Group__1 : rule__VLSTffFormula__Group__1__Impl rule__VLSTffFormula__Group__2 ;
    public final void rule__VLSTffFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2532:1: ( rule__VLSTffFormula__Group__1__Impl rule__VLSTffFormula__Group__2 )
            // InternalVampireLanguage.g:2533:2: rule__VLSTffFormula__Group__1__Impl rule__VLSTffFormula__Group__2
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
    // InternalVampireLanguage.g:2540:1: rule__VLSTffFormula__Group__1__Impl : ( '(' ) ;
    public final void rule__VLSTffFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2544:1: ( ( '(' ) )
            // InternalVampireLanguage.g:2545:1: ( '(' )
            {
            // InternalVampireLanguage.g:2545:1: ( '(' )
            // InternalVampireLanguage.g:2546:2: '('
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
    // InternalVampireLanguage.g:2555:1: rule__VLSTffFormula__Group__2 : rule__VLSTffFormula__Group__2__Impl rule__VLSTffFormula__Group__3 ;
    public final void rule__VLSTffFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2559:1: ( rule__VLSTffFormula__Group__2__Impl rule__VLSTffFormula__Group__3 )
            // InternalVampireLanguage.g:2560:2: rule__VLSTffFormula__Group__2__Impl rule__VLSTffFormula__Group__3
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
    // InternalVampireLanguage.g:2567:1: rule__VLSTffFormula__Group__2__Impl : ( ( rule__VLSTffFormula__NameAssignment_2 ) ) ;
    public final void rule__VLSTffFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2571:1: ( ( ( rule__VLSTffFormula__NameAssignment_2 ) ) )
            // InternalVampireLanguage.g:2572:1: ( ( rule__VLSTffFormula__NameAssignment_2 ) )
            {
            // InternalVampireLanguage.g:2572:1: ( ( rule__VLSTffFormula__NameAssignment_2 ) )
            // InternalVampireLanguage.g:2573:2: ( rule__VLSTffFormula__NameAssignment_2 )
            {
             before(grammarAccess.getVLSTffFormulaAccess().getNameAssignment_2()); 
            // InternalVampireLanguage.g:2574:2: ( rule__VLSTffFormula__NameAssignment_2 )
            // InternalVampireLanguage.g:2574:3: rule__VLSTffFormula__NameAssignment_2
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
    // InternalVampireLanguage.g:2582:1: rule__VLSTffFormula__Group__3 : rule__VLSTffFormula__Group__3__Impl rule__VLSTffFormula__Group__4 ;
    public final void rule__VLSTffFormula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2586:1: ( rule__VLSTffFormula__Group__3__Impl rule__VLSTffFormula__Group__4 )
            // InternalVampireLanguage.g:2587:2: rule__VLSTffFormula__Group__3__Impl rule__VLSTffFormula__Group__4
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
    // InternalVampireLanguage.g:2594:1: rule__VLSTffFormula__Group__3__Impl : ( ',' ) ;
    public final void rule__VLSTffFormula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2598:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2599:1: ( ',' )
            {
            // InternalVampireLanguage.g:2599:1: ( ',' )
            // InternalVampireLanguage.g:2600:2: ','
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
    // InternalVampireLanguage.g:2609:1: rule__VLSTffFormula__Group__4 : rule__VLSTffFormula__Group__4__Impl rule__VLSTffFormula__Group__5 ;
    public final void rule__VLSTffFormula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2613:1: ( rule__VLSTffFormula__Group__4__Impl rule__VLSTffFormula__Group__5 )
            // InternalVampireLanguage.g:2614:2: rule__VLSTffFormula__Group__4__Impl rule__VLSTffFormula__Group__5
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
    // InternalVampireLanguage.g:2621:1: rule__VLSTffFormula__Group__4__Impl : ( ( rule__VLSTffFormula__TffRoleAssignment_4 ) ) ;
    public final void rule__VLSTffFormula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2625:1: ( ( ( rule__VLSTffFormula__TffRoleAssignment_4 ) ) )
            // InternalVampireLanguage.g:2626:1: ( ( rule__VLSTffFormula__TffRoleAssignment_4 ) )
            {
            // InternalVampireLanguage.g:2626:1: ( ( rule__VLSTffFormula__TffRoleAssignment_4 ) )
            // InternalVampireLanguage.g:2627:2: ( rule__VLSTffFormula__TffRoleAssignment_4 )
            {
             before(grammarAccess.getVLSTffFormulaAccess().getTffRoleAssignment_4()); 
            // InternalVampireLanguage.g:2628:2: ( rule__VLSTffFormula__TffRoleAssignment_4 )
            // InternalVampireLanguage.g:2628:3: rule__VLSTffFormula__TffRoleAssignment_4
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
    // InternalVampireLanguage.g:2636:1: rule__VLSTffFormula__Group__5 : rule__VLSTffFormula__Group__5__Impl rule__VLSTffFormula__Group__6 ;
    public final void rule__VLSTffFormula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2640:1: ( rule__VLSTffFormula__Group__5__Impl rule__VLSTffFormula__Group__6 )
            // InternalVampireLanguage.g:2641:2: rule__VLSTffFormula__Group__5__Impl rule__VLSTffFormula__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalVampireLanguage.g:2648:1: rule__VLSTffFormula__Group__5__Impl : ( ',' ) ;
    public final void rule__VLSTffFormula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2652:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2653:1: ( ',' )
            {
            // InternalVampireLanguage.g:2653:1: ( ',' )
            // InternalVampireLanguage.g:2654:2: ','
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
    // InternalVampireLanguage.g:2663:1: rule__VLSTffFormula__Group__6 : rule__VLSTffFormula__Group__6__Impl rule__VLSTffFormula__Group__7 ;
    public final void rule__VLSTffFormula__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2667:1: ( rule__VLSTffFormula__Group__6__Impl rule__VLSTffFormula__Group__7 )
            // InternalVampireLanguage.g:2668:2: rule__VLSTffFormula__Group__6__Impl rule__VLSTffFormula__Group__7
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
    // InternalVampireLanguage.g:2675:1: rule__VLSTffFormula__Group__6__Impl : ( ( rule__VLSTffFormula__FofFormulaAssignment_6 ) ) ;
    public final void rule__VLSTffFormula__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2679:1: ( ( ( rule__VLSTffFormula__FofFormulaAssignment_6 ) ) )
            // InternalVampireLanguage.g:2680:1: ( ( rule__VLSTffFormula__FofFormulaAssignment_6 ) )
            {
            // InternalVampireLanguage.g:2680:1: ( ( rule__VLSTffFormula__FofFormulaAssignment_6 ) )
            // InternalVampireLanguage.g:2681:2: ( rule__VLSTffFormula__FofFormulaAssignment_6 )
            {
             before(grammarAccess.getVLSTffFormulaAccess().getFofFormulaAssignment_6()); 
            // InternalVampireLanguage.g:2682:2: ( rule__VLSTffFormula__FofFormulaAssignment_6 )
            // InternalVampireLanguage.g:2682:3: rule__VLSTffFormula__FofFormulaAssignment_6
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
    // InternalVampireLanguage.g:2690:1: rule__VLSTffFormula__Group__7 : rule__VLSTffFormula__Group__7__Impl rule__VLSTffFormula__Group__8 ;
    public final void rule__VLSTffFormula__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2694:1: ( rule__VLSTffFormula__Group__7__Impl rule__VLSTffFormula__Group__8 )
            // InternalVampireLanguage.g:2695:2: rule__VLSTffFormula__Group__7__Impl rule__VLSTffFormula__Group__8
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
    // InternalVampireLanguage.g:2702:1: rule__VLSTffFormula__Group__7__Impl : ( ( rule__VLSTffFormula__Group_7__0 )? ) ;
    public final void rule__VLSTffFormula__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2706:1: ( ( ( rule__VLSTffFormula__Group_7__0 )? ) )
            // InternalVampireLanguage.g:2707:1: ( ( rule__VLSTffFormula__Group_7__0 )? )
            {
            // InternalVampireLanguage.g:2707:1: ( ( rule__VLSTffFormula__Group_7__0 )? )
            // InternalVampireLanguage.g:2708:2: ( rule__VLSTffFormula__Group_7__0 )?
            {
             before(grammarAccess.getVLSTffFormulaAccess().getGroup_7()); 
            // InternalVampireLanguage.g:2709:2: ( rule__VLSTffFormula__Group_7__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVampireLanguage.g:2709:3: rule__VLSTffFormula__Group_7__0
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
    // InternalVampireLanguage.g:2717:1: rule__VLSTffFormula__Group__8 : rule__VLSTffFormula__Group__8__Impl rule__VLSTffFormula__Group__9 ;
    public final void rule__VLSTffFormula__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2721:1: ( rule__VLSTffFormula__Group__8__Impl rule__VLSTffFormula__Group__9 )
            // InternalVampireLanguage.g:2722:2: rule__VLSTffFormula__Group__8__Impl rule__VLSTffFormula__Group__9
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
    // InternalVampireLanguage.g:2729:1: rule__VLSTffFormula__Group__8__Impl : ( ')' ) ;
    public final void rule__VLSTffFormula__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2733:1: ( ( ')' ) )
            // InternalVampireLanguage.g:2734:1: ( ')' )
            {
            // InternalVampireLanguage.g:2734:1: ( ')' )
            // InternalVampireLanguage.g:2735:2: ')'
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
    // InternalVampireLanguage.g:2744:1: rule__VLSTffFormula__Group__9 : rule__VLSTffFormula__Group__9__Impl ;
    public final void rule__VLSTffFormula__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2748:1: ( rule__VLSTffFormula__Group__9__Impl )
            // InternalVampireLanguage.g:2749:2: rule__VLSTffFormula__Group__9__Impl
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
    // InternalVampireLanguage.g:2755:1: rule__VLSTffFormula__Group__9__Impl : ( '.' ) ;
    public final void rule__VLSTffFormula__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2759:1: ( ( '.' ) )
            // InternalVampireLanguage.g:2760:1: ( '.' )
            {
            // InternalVampireLanguage.g:2760:1: ( '.' )
            // InternalVampireLanguage.g:2761:2: '.'
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
    // InternalVampireLanguage.g:2771:1: rule__VLSTffFormula__Group_7__0 : rule__VLSTffFormula__Group_7__0__Impl rule__VLSTffFormula__Group_7__1 ;
    public final void rule__VLSTffFormula__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2775:1: ( rule__VLSTffFormula__Group_7__0__Impl rule__VLSTffFormula__Group_7__1 )
            // InternalVampireLanguage.g:2776:2: rule__VLSTffFormula__Group_7__0__Impl rule__VLSTffFormula__Group_7__1
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
    // InternalVampireLanguage.g:2783:1: rule__VLSTffFormula__Group_7__0__Impl : ( ',' ) ;
    public final void rule__VLSTffFormula__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2787:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2788:1: ( ',' )
            {
            // InternalVampireLanguage.g:2788:1: ( ',' )
            // InternalVampireLanguage.g:2789:2: ','
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
    // InternalVampireLanguage.g:2798:1: rule__VLSTffFormula__Group_7__1 : rule__VLSTffFormula__Group_7__1__Impl ;
    public final void rule__VLSTffFormula__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2802:1: ( rule__VLSTffFormula__Group_7__1__Impl )
            // InternalVampireLanguage.g:2803:2: rule__VLSTffFormula__Group_7__1__Impl
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
    // InternalVampireLanguage.g:2809:1: rule__VLSTffFormula__Group_7__1__Impl : ( ( rule__VLSTffFormula__AnnotationsAssignment_7_1 ) ) ;
    public final void rule__VLSTffFormula__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2813:1: ( ( ( rule__VLSTffFormula__AnnotationsAssignment_7_1 ) ) )
            // InternalVampireLanguage.g:2814:1: ( ( rule__VLSTffFormula__AnnotationsAssignment_7_1 ) )
            {
            // InternalVampireLanguage.g:2814:1: ( ( rule__VLSTffFormula__AnnotationsAssignment_7_1 ) )
            // InternalVampireLanguage.g:2815:2: ( rule__VLSTffFormula__AnnotationsAssignment_7_1 )
            {
             before(grammarAccess.getVLSTffFormulaAccess().getAnnotationsAssignment_7_1()); 
            // InternalVampireLanguage.g:2816:2: ( rule__VLSTffFormula__AnnotationsAssignment_7_1 )
            // InternalVampireLanguage.g:2816:3: rule__VLSTffFormula__AnnotationsAssignment_7_1
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
    // InternalVampireLanguage.g:2825:1: rule__VLSTffDeclPred__Group_0__0 : rule__VLSTffDeclPred__Group_0__0__Impl rule__VLSTffDeclPred__Group_0__1 ;
    public final void rule__VLSTffDeclPred__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2829:1: ( rule__VLSTffDeclPred__Group_0__0__Impl rule__VLSTffDeclPred__Group_0__1 )
            // InternalVampireLanguage.g:2830:2: rule__VLSTffDeclPred__Group_0__0__Impl rule__VLSTffDeclPred__Group_0__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalVampireLanguage.g:2837:1: rule__VLSTffDeclPred__Group_0__0__Impl : ( 'declare_' ) ;
    public final void rule__VLSTffDeclPred__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2841:1: ( ( 'declare_' ) )
            // InternalVampireLanguage.g:2842:1: ( 'declare_' )
            {
            // InternalVampireLanguage.g:2842:1: ( 'declare_' )
            // InternalVampireLanguage.g:2843:2: 'declare_'
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
    // InternalVampireLanguage.g:2852:1: rule__VLSTffDeclPred__Group_0__1 : rule__VLSTffDeclPred__Group_0__1__Impl ;
    public final void rule__VLSTffDeclPred__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2856:1: ( rule__VLSTffDeclPred__Group_0__1__Impl )
            // InternalVampireLanguage.g:2857:2: rule__VLSTffDeclPred__Group_0__1__Impl
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
    // InternalVampireLanguage.g:2863:1: rule__VLSTffDeclPred__Group_0__1__Impl : ( RULE_DOLLAR_ID ) ;
    public final void rule__VLSTffDeclPred__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2867:1: ( ( RULE_DOLLAR_ID ) )
            // InternalVampireLanguage.g:2868:1: ( RULE_DOLLAR_ID )
            {
            // InternalVampireLanguage.g:2868:1: ( RULE_DOLLAR_ID )
            // InternalVampireLanguage.g:2869:2: RULE_DOLLAR_ID
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
    // InternalVampireLanguage.g:2879:1: rule__VLSAnnotation__Group__0 : rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1 ;
    public final void rule__VLSAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2883:1: ( rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1 )
            // InternalVampireLanguage.g:2884:2: rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1
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
    // InternalVampireLanguage.g:2891:1: rule__VLSAnnotation__Group__0__Impl : ( ( '[' )? ) ;
    public final void rule__VLSAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2895:1: ( ( ( '[' )? ) )
            // InternalVampireLanguage.g:2896:1: ( ( '[' )? )
            {
            // InternalVampireLanguage.g:2896:1: ( ( '[' )? )
            // InternalVampireLanguage.g:2897:2: ( '[' )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getLeftSquareBracketKeyword_0()); 
            // InternalVampireLanguage.g:2898:2: ( '[' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVampireLanguage.g:2898:3: '['
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
    // InternalVampireLanguage.g:2906:1: rule__VLSAnnotation__Group__1 : rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2 ;
    public final void rule__VLSAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2910:1: ( rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2 )
            // InternalVampireLanguage.g:2911:2: rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2
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
    // InternalVampireLanguage.g:2918:1: rule__VLSAnnotation__Group__1__Impl : ( ( rule__VLSAnnotation__NameAssignment_1 )? ) ;
    public final void rule__VLSAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2922:1: ( ( ( rule__VLSAnnotation__NameAssignment_1 )? ) )
            // InternalVampireLanguage.g:2923:1: ( ( rule__VLSAnnotation__NameAssignment_1 )? )
            {
            // InternalVampireLanguage.g:2923:1: ( ( rule__VLSAnnotation__NameAssignment_1 )? )
            // InternalVampireLanguage.g:2924:2: ( rule__VLSAnnotation__NameAssignment_1 )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getNameAssignment_1()); 
            // InternalVampireLanguage.g:2925:2: ( rule__VLSAnnotation__NameAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_LOWER_WORD_ID||LA32_0==RULE_SINGLE_QUOTE||(LA32_0>=24 && LA32_0<=38)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalVampireLanguage.g:2925:3: rule__VLSAnnotation__NameAssignment_1
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
    // InternalVampireLanguage.g:2933:1: rule__VLSAnnotation__Group__2 : rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3 ;
    public final void rule__VLSAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2937:1: ( rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3 )
            // InternalVampireLanguage.g:2938:2: rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3
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
    // InternalVampireLanguage.g:2945:1: rule__VLSAnnotation__Group__2__Impl : ( ( rule__VLSAnnotation__Group_2__0 )? ) ;
    public final void rule__VLSAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2949:1: ( ( ( rule__VLSAnnotation__Group_2__0 )? ) )
            // InternalVampireLanguage.g:2950:1: ( ( rule__VLSAnnotation__Group_2__0 )? )
            {
            // InternalVampireLanguage.g:2950:1: ( ( rule__VLSAnnotation__Group_2__0 )? )
            // InternalVampireLanguage.g:2951:2: ( rule__VLSAnnotation__Group_2__0 )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getGroup_2()); 
            // InternalVampireLanguage.g:2952:2: ( rule__VLSAnnotation__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==55) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalVampireLanguage.g:2952:3: rule__VLSAnnotation__Group_2__0
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
    // InternalVampireLanguage.g:2960:1: rule__VLSAnnotation__Group__3 : rule__VLSAnnotation__Group__3__Impl ;
    public final void rule__VLSAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2964:1: ( rule__VLSAnnotation__Group__3__Impl )
            // InternalVampireLanguage.g:2965:2: rule__VLSAnnotation__Group__3__Impl
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
    // InternalVampireLanguage.g:2971:1: rule__VLSAnnotation__Group__3__Impl : ( ( ']' )? ) ;
    public final void rule__VLSAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2975:1: ( ( ( ']' )? ) )
            // InternalVampireLanguage.g:2976:1: ( ( ']' )? )
            {
            // InternalVampireLanguage.g:2976:1: ( ( ']' )? )
            // InternalVampireLanguage.g:2977:2: ( ']' )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getRightSquareBracketKeyword_3()); 
            // InternalVampireLanguage.g:2978:2: ( ']' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVampireLanguage.g:2978:3: ']'
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
    // InternalVampireLanguage.g:2987:1: rule__VLSAnnotation__Group_2__0 : rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1 ;
    public final void rule__VLSAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2991:1: ( rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1 )
            // InternalVampireLanguage.g:2992:2: rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1
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
    // InternalVampireLanguage.g:2999:1: rule__VLSAnnotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__VLSAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3003:1: ( ( '(' ) )
            // InternalVampireLanguage.g:3004:1: ( '(' )
            {
            // InternalVampireLanguage.g:3004:1: ( '(' )
            // InternalVampireLanguage.g:3005:2: '('
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
    // InternalVampireLanguage.g:3014:1: rule__VLSAnnotation__Group_2__1 : rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2 ;
    public final void rule__VLSAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3018:1: ( rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2 )
            // InternalVampireLanguage.g:3019:2: rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalVampireLanguage.g:3026:1: rule__VLSAnnotation__Group_2__1__Impl : ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) ) ;
    public final void rule__VLSAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3030:1: ( ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) ) )
            // InternalVampireLanguage.g:3031:1: ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) )
            {
            // InternalVampireLanguage.g:3031:1: ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) )
            // InternalVampireLanguage.g:3032:2: ( rule__VLSAnnotation__FollowupAssignment_2_1 )
            {
             before(grammarAccess.getVLSAnnotationAccess().getFollowupAssignment_2_1()); 
            // InternalVampireLanguage.g:3033:2: ( rule__VLSAnnotation__FollowupAssignment_2_1 )
            // InternalVampireLanguage.g:3033:3: rule__VLSAnnotation__FollowupAssignment_2_1
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
    // InternalVampireLanguage.g:3041:1: rule__VLSAnnotation__Group_2__2 : rule__VLSAnnotation__Group_2__2__Impl ;
    public final void rule__VLSAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3045:1: ( rule__VLSAnnotation__Group_2__2__Impl )
            // InternalVampireLanguage.g:3046:2: rule__VLSAnnotation__Group_2__2__Impl
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
    // InternalVampireLanguage.g:3052:1: rule__VLSAnnotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__VLSAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3056:1: ( ( ')' ) )
            // InternalVampireLanguage.g:3057:1: ( ')' )
            {
            // InternalVampireLanguage.g:3057:1: ( ')' )
            // InternalVampireLanguage.g:3058:2: ')'
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
    // InternalVampireLanguage.g:3068:1: rule__VLSAnnotationTerms__Group__0 : rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1 ;
    public final void rule__VLSAnnotationTerms__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3072:1: ( rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1 )
            // InternalVampireLanguage.g:3073:2: rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1
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
    // InternalVampireLanguage.g:3080:1: rule__VLSAnnotationTerms__Group__0__Impl : ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) ) ;
    public final void rule__VLSAnnotationTerms__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3084:1: ( ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) ) )
            // InternalVampireLanguage.g:3085:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) )
            {
            // InternalVampireLanguage.g:3085:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) )
            // InternalVampireLanguage.g:3086:2: ( rule__VLSAnnotationTerms__TermsAssignment_0 )
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getTermsAssignment_0()); 
            // InternalVampireLanguage.g:3087:2: ( rule__VLSAnnotationTerms__TermsAssignment_0 )
            // InternalVampireLanguage.g:3087:3: rule__VLSAnnotationTerms__TermsAssignment_0
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
    // InternalVampireLanguage.g:3095:1: rule__VLSAnnotationTerms__Group__1 : rule__VLSAnnotationTerms__Group__1__Impl ;
    public final void rule__VLSAnnotationTerms__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3099:1: ( rule__VLSAnnotationTerms__Group__1__Impl )
            // InternalVampireLanguage.g:3100:2: rule__VLSAnnotationTerms__Group__1__Impl
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
    // InternalVampireLanguage.g:3106:1: rule__VLSAnnotationTerms__Group__1__Impl : ( ( rule__VLSAnnotationTerms__Group_1__0 )* ) ;
    public final void rule__VLSAnnotationTerms__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3110:1: ( ( ( rule__VLSAnnotationTerms__Group_1__0 )* ) )
            // InternalVampireLanguage.g:3111:1: ( ( rule__VLSAnnotationTerms__Group_1__0 )* )
            {
            // InternalVampireLanguage.g:3111:1: ( ( rule__VLSAnnotationTerms__Group_1__0 )* )
            // InternalVampireLanguage.g:3112:2: ( rule__VLSAnnotationTerms__Group_1__0 )*
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getGroup_1()); 
            // InternalVampireLanguage.g:3113:2: ( rule__VLSAnnotationTerms__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==56) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalVampireLanguage.g:3113:3: rule__VLSAnnotationTerms__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
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
    // InternalVampireLanguage.g:3122:1: rule__VLSAnnotationTerms__Group_1__0 : rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1 ;
    public final void rule__VLSAnnotationTerms__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3126:1: ( rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1 )
            // InternalVampireLanguage.g:3127:2: rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1
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
    // InternalVampireLanguage.g:3134:1: rule__VLSAnnotationTerms__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VLSAnnotationTerms__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3138:1: ( ( ',' ) )
            // InternalVampireLanguage.g:3139:1: ( ',' )
            {
            // InternalVampireLanguage.g:3139:1: ( ',' )
            // InternalVampireLanguage.g:3140:2: ','
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
    // InternalVampireLanguage.g:3149:1: rule__VLSAnnotationTerms__Group_1__1 : rule__VLSAnnotationTerms__Group_1__1__Impl ;
    public final void rule__VLSAnnotationTerms__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3153:1: ( rule__VLSAnnotationTerms__Group_1__1__Impl )
            // InternalVampireLanguage.g:3154:2: rule__VLSAnnotationTerms__Group_1__1__Impl
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
    // InternalVampireLanguage.g:3160:1: rule__VLSAnnotationTerms__Group_1__1__Impl : ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) ) ;
    public final void rule__VLSAnnotationTerms__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3164:1: ( ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:3165:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:3165:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) )
            // InternalVampireLanguage.g:3166:2: ( rule__VLSAnnotationTerms__TermsAssignment_1_1 )
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getTermsAssignment_1_1()); 
            // InternalVampireLanguage.g:3167:2: ( rule__VLSAnnotationTerms__TermsAssignment_1_1 )
            // InternalVampireLanguage.g:3167:3: rule__VLSAnnotationTerms__TermsAssignment_1_1
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
    // InternalVampireLanguage.g:3176:1: rule__VLSOtherDeclaration__Group__0 : rule__VLSOtherDeclaration__Group__0__Impl rule__VLSOtherDeclaration__Group__1 ;
    public final void rule__VLSOtherDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3180:1: ( rule__VLSOtherDeclaration__Group__0__Impl rule__VLSOtherDeclaration__Group__1 )
            // InternalVampireLanguage.g:3181:2: rule__VLSOtherDeclaration__Group__0__Impl rule__VLSOtherDeclaration__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalVampireLanguage.g:3188:1: rule__VLSOtherDeclaration__Group__0__Impl : ( ruleVLSAtomicConstant ) ;
    public final void rule__VLSOtherDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3192:1: ( ( ruleVLSAtomicConstant ) )
            // InternalVampireLanguage.g:3193:1: ( ruleVLSAtomicConstant )
            {
            // InternalVampireLanguage.g:3193:1: ( ruleVLSAtomicConstant )
            // InternalVampireLanguage.g:3194:2: ruleVLSAtomicConstant
            {
             before(grammarAccess.getVLSOtherDeclarationAccess().getVLSAtomicConstantParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSAtomicConstant();

            state._fsp--;

             after(grammarAccess.getVLSOtherDeclarationAccess().getVLSAtomicConstantParserRuleCall_0()); 

            }


            }

        }
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
    // InternalVampireLanguage.g:3203:1: rule__VLSOtherDeclaration__Group__1 : rule__VLSOtherDeclaration__Group__1__Impl rule__VLSOtherDeclaration__Group__2 ;
    public final void rule__VLSOtherDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3207:1: ( rule__VLSOtherDeclaration__Group__1__Impl rule__VLSOtherDeclaration__Group__2 )
            // InternalVampireLanguage.g:3208:2: rule__VLSOtherDeclaration__Group__1__Impl rule__VLSOtherDeclaration__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalVampireLanguage.g:3215:1: rule__VLSOtherDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__VLSOtherDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3219:1: ( ( ':' ) )
            // InternalVampireLanguage.g:3220:1: ( ':' )
            {
            // InternalVampireLanguage.g:3220:1: ( ':' )
            // InternalVampireLanguage.g:3221:2: ':'
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
    // InternalVampireLanguage.g:3230:1: rule__VLSOtherDeclaration__Group__2 : rule__VLSOtherDeclaration__Group__2__Impl ;
    public final void rule__VLSOtherDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3234:1: ( rule__VLSOtherDeclaration__Group__2__Impl )
            // InternalVampireLanguage.g:3235:2: rule__VLSOtherDeclaration__Group__2__Impl
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
    // InternalVampireLanguage.g:3241:1: rule__VLSOtherDeclaration__Group__2__Impl : ( ( rule__VLSOtherDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__VLSOtherDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3245:1: ( ( ( rule__VLSOtherDeclaration__TypeAssignment_2 ) ) )
            // InternalVampireLanguage.g:3246:1: ( ( rule__VLSOtherDeclaration__TypeAssignment_2 ) )
            {
            // InternalVampireLanguage.g:3246:1: ( ( rule__VLSOtherDeclaration__TypeAssignment_2 ) )
            // InternalVampireLanguage.g:3247:2: ( rule__VLSOtherDeclaration__TypeAssignment_2 )
            {
             before(grammarAccess.getVLSOtherDeclarationAccess().getTypeAssignment_2()); 
            // InternalVampireLanguage.g:3248:2: ( rule__VLSOtherDeclaration__TypeAssignment_2 )
            // InternalVampireLanguage.g:3248:3: rule__VLSOtherDeclaration__TypeAssignment_2
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
    // InternalVampireLanguage.g:3257:1: rule__VLSVariableDeclaration__Group__0 : rule__VLSVariableDeclaration__Group__0__Impl rule__VLSVariableDeclaration__Group__1 ;
    public final void rule__VLSVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3261:1: ( rule__VLSVariableDeclaration__Group__0__Impl rule__VLSVariableDeclaration__Group__1 )
            // InternalVampireLanguage.g:3262:2: rule__VLSVariableDeclaration__Group__0__Impl rule__VLSVariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalVampireLanguage.g:3269:1: rule__VLSVariableDeclaration__Group__0__Impl : ( ruleVLSVariable ) ;
    public final void rule__VLSVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3273:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:3274:1: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:3274:1: ( ruleVLSVariable )
            // InternalVampireLanguage.g:3275:2: ruleVLSVariable
            {
             before(grammarAccess.getVLSVariableDeclarationAccess().getVLSVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSVariable();

            state._fsp--;

             after(grammarAccess.getVLSVariableDeclarationAccess().getVLSVariableParserRuleCall_0()); 

            }


            }

        }
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
    // InternalVampireLanguage.g:3284:1: rule__VLSVariableDeclaration__Group__1 : rule__VLSVariableDeclaration__Group__1__Impl rule__VLSVariableDeclaration__Group__2 ;
    public final void rule__VLSVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3288:1: ( rule__VLSVariableDeclaration__Group__1__Impl rule__VLSVariableDeclaration__Group__2 )
            // InternalVampireLanguage.g:3289:2: rule__VLSVariableDeclaration__Group__1__Impl rule__VLSVariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalVampireLanguage.g:3296:1: rule__VLSVariableDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__VLSVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3300:1: ( ( ':' ) )
            // InternalVampireLanguage.g:3301:1: ( ':' )
            {
            // InternalVampireLanguage.g:3301:1: ( ':' )
            // InternalVampireLanguage.g:3302:2: ':'
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
    // InternalVampireLanguage.g:3311:1: rule__VLSVariableDeclaration__Group__2 : rule__VLSVariableDeclaration__Group__2__Impl ;
    public final void rule__VLSVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3315:1: ( rule__VLSVariableDeclaration__Group__2__Impl )
            // InternalVampireLanguage.g:3316:2: rule__VLSVariableDeclaration__Group__2__Impl
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
    // InternalVampireLanguage.g:3322:1: rule__VLSVariableDeclaration__Group__2__Impl : ( ( rule__VLSVariableDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__VLSVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3326:1: ( ( ( rule__VLSVariableDeclaration__TypeAssignment_2 ) ) )
            // InternalVampireLanguage.g:3327:1: ( ( rule__VLSVariableDeclaration__TypeAssignment_2 ) )
            {
            // InternalVampireLanguage.g:3327:1: ( ( rule__VLSVariableDeclaration__TypeAssignment_2 ) )
            // InternalVampireLanguage.g:3328:2: ( rule__VLSVariableDeclaration__TypeAssignment_2 )
            {
             before(grammarAccess.getVLSVariableDeclarationAccess().getTypeAssignment_2()); 
            // InternalVampireLanguage.g:3329:2: ( rule__VLSVariableDeclaration__TypeAssignment_2 )
            // InternalVampireLanguage.g:3329:3: rule__VLSVariableDeclaration__TypeAssignment_2
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
    // InternalVampireLanguage.g:3338:1: rule__VLSTypeDef__Group__0 : rule__VLSTypeDef__Group__0__Impl rule__VLSTypeDef__Group__1 ;
    public final void rule__VLSTypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3342:1: ( rule__VLSTypeDef__Group__0__Impl rule__VLSTypeDef__Group__1 )
            // InternalVampireLanguage.g:3343:2: rule__VLSTypeDef__Group__0__Impl rule__VLSTypeDef__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalVampireLanguage.g:3350:1: rule__VLSTypeDef__Group__0__Impl : ( ( rule__VLSTypeDef__TypeSigAssignment_0 ) ) ;
    public final void rule__VLSTypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3354:1: ( ( ( rule__VLSTypeDef__TypeSigAssignment_0 ) ) )
            // InternalVampireLanguage.g:3355:1: ( ( rule__VLSTypeDef__TypeSigAssignment_0 ) )
            {
            // InternalVampireLanguage.g:3355:1: ( ( rule__VLSTypeDef__TypeSigAssignment_0 ) )
            // InternalVampireLanguage.g:3356:2: ( rule__VLSTypeDef__TypeSigAssignment_0 )
            {
             before(grammarAccess.getVLSTypeDefAccess().getTypeSigAssignment_0()); 
            // InternalVampireLanguage.g:3357:2: ( rule__VLSTypeDef__TypeSigAssignment_0 )
            // InternalVampireLanguage.g:3357:3: rule__VLSTypeDef__TypeSigAssignment_0
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
    // InternalVampireLanguage.g:3365:1: rule__VLSTypeDef__Group__1 : rule__VLSTypeDef__Group__1__Impl ;
    public final void rule__VLSTypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3369:1: ( rule__VLSTypeDef__Group__1__Impl )
            // InternalVampireLanguage.g:3370:2: rule__VLSTypeDef__Group__1__Impl
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
    // InternalVampireLanguage.g:3376:1: rule__VLSTypeDef__Group__1__Impl : ( ( rule__VLSTypeDef__Group_1__0 )? ) ;
    public final void rule__VLSTypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3380:1: ( ( ( rule__VLSTypeDef__Group_1__0 )? ) )
            // InternalVampireLanguage.g:3381:1: ( ( rule__VLSTypeDef__Group_1__0 )? )
            {
            // InternalVampireLanguage.g:3381:1: ( ( rule__VLSTypeDef__Group_1__0 )? )
            // InternalVampireLanguage.g:3382:2: ( rule__VLSTypeDef__Group_1__0 )?
            {
             before(grammarAccess.getVLSTypeDefAccess().getGroup_1()); 
            // InternalVampireLanguage.g:3383:2: ( rule__VLSTypeDef__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==62) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalVampireLanguage.g:3383:3: rule__VLSTypeDef__Group_1__0
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
    // InternalVampireLanguage.g:3392:1: rule__VLSTypeDef__Group_1__0 : rule__VLSTypeDef__Group_1__0__Impl rule__VLSTypeDef__Group_1__1 ;
    public final void rule__VLSTypeDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3396:1: ( rule__VLSTypeDef__Group_1__0__Impl rule__VLSTypeDef__Group_1__1 )
            // InternalVampireLanguage.g:3397:2: rule__VLSTypeDef__Group_1__0__Impl rule__VLSTypeDef__Group_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalVampireLanguage.g:3404:1: rule__VLSTypeDef__Group_1__0__Impl : ( '>' ) ;
    public final void rule__VLSTypeDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3408:1: ( ( '>' ) )
            // InternalVampireLanguage.g:3409:1: ( '>' )
            {
            // InternalVampireLanguage.g:3409:1: ( '>' )
            // InternalVampireLanguage.g:3410:2: '>'
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
    // InternalVampireLanguage.g:3419:1: rule__VLSTypeDef__Group_1__1 : rule__VLSTypeDef__Group_1__1__Impl ;
    public final void rule__VLSTypeDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3423:1: ( rule__VLSTypeDef__Group_1__1__Impl )
            // InternalVampireLanguage.g:3424:2: rule__VLSTypeDef__Group_1__1__Impl
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
    // InternalVampireLanguage.g:3430:1: rule__VLSTypeDef__Group_1__1__Impl : ( ( rule__VLSTypeDef__MapsToAssignment_1_1 ) ) ;
    public final void rule__VLSTypeDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3434:1: ( ( ( rule__VLSTypeDef__MapsToAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:3435:1: ( ( rule__VLSTypeDef__MapsToAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:3435:1: ( ( rule__VLSTypeDef__MapsToAssignment_1_1 ) )
            // InternalVampireLanguage.g:3436:2: ( rule__VLSTypeDef__MapsToAssignment_1_1 )
            {
             before(grammarAccess.getVLSTypeDefAccess().getMapsToAssignment_1_1()); 
            // InternalVampireLanguage.g:3437:2: ( rule__VLSTypeDef__MapsToAssignment_1_1 )
            // InternalVampireLanguage.g:3437:3: rule__VLSTypeDef__MapsToAssignment_1_1
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
    // InternalVampireLanguage.g:3446:1: rule__VLSUnitaryTerm__Group__0 : rule__VLSUnitaryTerm__Group__0__Impl rule__VLSUnitaryTerm__Group__1 ;
    public final void rule__VLSUnitaryTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3450:1: ( rule__VLSUnitaryTerm__Group__0__Impl rule__VLSUnitaryTerm__Group__1 )
            // InternalVampireLanguage.g:3451:2: rule__VLSUnitaryTerm__Group__0__Impl rule__VLSUnitaryTerm__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalVampireLanguage.g:3458:1: rule__VLSUnitaryTerm__Group__0__Impl : ( ( rule__VLSUnitaryTerm__InitTypeAssignment_0 ) ) ;
    public final void rule__VLSUnitaryTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3462:1: ( ( ( rule__VLSUnitaryTerm__InitTypeAssignment_0 ) ) )
            // InternalVampireLanguage.g:3463:1: ( ( rule__VLSUnitaryTerm__InitTypeAssignment_0 ) )
            {
            // InternalVampireLanguage.g:3463:1: ( ( rule__VLSUnitaryTerm__InitTypeAssignment_0 ) )
            // InternalVampireLanguage.g:3464:2: ( rule__VLSUnitaryTerm__InitTypeAssignment_0 )
            {
             before(grammarAccess.getVLSUnitaryTermAccess().getInitTypeAssignment_0()); 
            // InternalVampireLanguage.g:3465:2: ( rule__VLSUnitaryTerm__InitTypeAssignment_0 )
            // InternalVampireLanguage.g:3465:3: rule__VLSUnitaryTerm__InitTypeAssignment_0
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
    // InternalVampireLanguage.g:3473:1: rule__VLSUnitaryTerm__Group__1 : rule__VLSUnitaryTerm__Group__1__Impl ;
    public final void rule__VLSUnitaryTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3477:1: ( rule__VLSUnitaryTerm__Group__1__Impl )
            // InternalVampireLanguage.g:3478:2: rule__VLSUnitaryTerm__Group__1__Impl
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
    // InternalVampireLanguage.g:3484:1: rule__VLSUnitaryTerm__Group__1__Impl : ( ( rule__VLSUnitaryTerm__Group_1__0 )* ) ;
    public final void rule__VLSUnitaryTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3488:1: ( ( ( rule__VLSUnitaryTerm__Group_1__0 )* ) )
            // InternalVampireLanguage.g:3489:1: ( ( rule__VLSUnitaryTerm__Group_1__0 )* )
            {
            // InternalVampireLanguage.g:3489:1: ( ( rule__VLSUnitaryTerm__Group_1__0 )* )
            // InternalVampireLanguage.g:3490:2: ( rule__VLSUnitaryTerm__Group_1__0 )*
            {
             before(grammarAccess.getVLSUnitaryTermAccess().getGroup_1()); 
            // InternalVampireLanguage.g:3491:2: ( rule__VLSUnitaryTerm__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==63) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalVampireLanguage.g:3491:3: rule__VLSUnitaryTerm__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
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
    // InternalVampireLanguage.g:3500:1: rule__VLSUnitaryTerm__Group_1__0 : rule__VLSUnitaryTerm__Group_1__0__Impl rule__VLSUnitaryTerm__Group_1__1 ;
    public final void rule__VLSUnitaryTerm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3504:1: ( rule__VLSUnitaryTerm__Group_1__0__Impl rule__VLSUnitaryTerm__Group_1__1 )
            // InternalVampireLanguage.g:3505:2: rule__VLSUnitaryTerm__Group_1__0__Impl rule__VLSUnitaryTerm__Group_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalVampireLanguage.g:3512:1: rule__VLSUnitaryTerm__Group_1__0__Impl : ( '*' ) ;
    public final void rule__VLSUnitaryTerm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3516:1: ( ( '*' ) )
            // InternalVampireLanguage.g:3517:1: ( '*' )
            {
            // InternalVampireLanguage.g:3517:1: ( '*' )
            // InternalVampireLanguage.g:3518:2: '*'
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
    // InternalVampireLanguage.g:3527:1: rule__VLSUnitaryTerm__Group_1__1 : rule__VLSUnitaryTerm__Group_1__1__Impl ;
    public final void rule__VLSUnitaryTerm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3531:1: ( rule__VLSUnitaryTerm__Group_1__1__Impl )
            // InternalVampireLanguage.g:3532:2: rule__VLSUnitaryTerm__Group_1__1__Impl
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
    // InternalVampireLanguage.g:3538:1: rule__VLSUnitaryTerm__Group_1__1__Impl : ( ( rule__VLSUnitaryTerm__NextTypeAssignment_1_1 ) ) ;
    public final void rule__VLSUnitaryTerm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3542:1: ( ( ( rule__VLSUnitaryTerm__NextTypeAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:3543:1: ( ( rule__VLSUnitaryTerm__NextTypeAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:3543:1: ( ( rule__VLSUnitaryTerm__NextTypeAssignment_1_1 ) )
            // InternalVampireLanguage.g:3544:2: ( rule__VLSUnitaryTerm__NextTypeAssignment_1_1 )
            {
             before(grammarAccess.getVLSUnitaryTermAccess().getNextTypeAssignment_1_1()); 
            // InternalVampireLanguage.g:3545:2: ( rule__VLSUnitaryTerm__NextTypeAssignment_1_1 )
            // InternalVampireLanguage.g:3545:3: rule__VLSUnitaryTerm__NextTypeAssignment_1_1
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
    // InternalVampireLanguage.g:3554:1: rule__VLSBinary__Group__0 : rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1 ;
    public final void rule__VLSBinary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3558:1: ( rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1 )
            // InternalVampireLanguage.g:3559:2: rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalVampireLanguage.g:3566:1: rule__VLSBinary__Group__0__Impl : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3570:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:3571:1: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:3571:1: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:3572:2: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:3581:1: rule__VLSBinary__Group__1 : rule__VLSBinary__Group__1__Impl ;
    public final void rule__VLSBinary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3585:1: ( rule__VLSBinary__Group__1__Impl )
            // InternalVampireLanguage.g:3586:2: rule__VLSBinary__Group__1__Impl
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
    // InternalVampireLanguage.g:3592:1: rule__VLSBinary__Group__1__Impl : ( ( rule__VLSBinary__Alternatives_1 )? ) ;
    public final void rule__VLSBinary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3596:1: ( ( ( rule__VLSBinary__Alternatives_1 )? ) )
            // InternalVampireLanguage.g:3597:1: ( ( rule__VLSBinary__Alternatives_1 )? )
            {
            // InternalVampireLanguage.g:3597:1: ( ( rule__VLSBinary__Alternatives_1 )? )
            // InternalVampireLanguage.g:3598:2: ( rule__VLSBinary__Alternatives_1 )?
            {
             before(grammarAccess.getVLSBinaryAccess().getAlternatives_1()); 
            // InternalVampireLanguage.g:3599:2: ( rule__VLSBinary__Alternatives_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=64 && LA38_0<=71)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalVampireLanguage.g:3599:3: rule__VLSBinary__Alternatives_1
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
    // InternalVampireLanguage.g:3608:1: rule__VLSBinary__Group_1_0__0 : rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1 ;
    public final void rule__VLSBinary__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3612:1: ( rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1 )
            // InternalVampireLanguage.g:3613:2: rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1
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
    // InternalVampireLanguage.g:3620:1: rule__VLSBinary__Group_1_0__0__Impl : ( ( rule__VLSBinary__Alternatives_1_0_0 ) ) ;
    public final void rule__VLSBinary__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3624:1: ( ( ( rule__VLSBinary__Alternatives_1_0_0 ) ) )
            // InternalVampireLanguage.g:3625:1: ( ( rule__VLSBinary__Alternatives_1_0_0 ) )
            {
            // InternalVampireLanguage.g:3625:1: ( ( rule__VLSBinary__Alternatives_1_0_0 ) )
            // InternalVampireLanguage.g:3626:2: ( rule__VLSBinary__Alternatives_1_0_0 )
            {
             before(grammarAccess.getVLSBinaryAccess().getAlternatives_1_0_0()); 
            // InternalVampireLanguage.g:3627:2: ( rule__VLSBinary__Alternatives_1_0_0 )
            // InternalVampireLanguage.g:3627:3: rule__VLSBinary__Alternatives_1_0_0
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
    // InternalVampireLanguage.g:3635:1: rule__VLSBinary__Group_1_0__1 : rule__VLSBinary__Group_1_0__1__Impl ;
    public final void rule__VLSBinary__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3639:1: ( rule__VLSBinary__Group_1_0__1__Impl )
            // InternalVampireLanguage.g:3640:2: rule__VLSBinary__Group_1_0__1__Impl
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
    // InternalVampireLanguage.g:3646:1: rule__VLSBinary__Group_1_0__1__Impl : ( ( rule__VLSBinary__RightAssignment_1_0_1 ) ) ;
    public final void rule__VLSBinary__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3650:1: ( ( ( rule__VLSBinary__RightAssignment_1_0_1 ) ) )
            // InternalVampireLanguage.g:3651:1: ( ( rule__VLSBinary__RightAssignment_1_0_1 ) )
            {
            // InternalVampireLanguage.g:3651:1: ( ( rule__VLSBinary__RightAssignment_1_0_1 ) )
            // InternalVampireLanguage.g:3652:2: ( rule__VLSBinary__RightAssignment_1_0_1 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_0_1()); 
            // InternalVampireLanguage.g:3653:2: ( rule__VLSBinary__RightAssignment_1_0_1 )
            // InternalVampireLanguage.g:3653:3: rule__VLSBinary__RightAssignment_1_0_1
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
    // InternalVampireLanguage.g:3662:1: rule__VLSBinary__Group_1_0_0_0__0 : rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1 ;
    public final void rule__VLSBinary__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3666:1: ( rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1 )
            // InternalVampireLanguage.g:3667:2: rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalVampireLanguage.g:3674:1: rule__VLSBinary__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3678:1: ( ( () ) )
            // InternalVampireLanguage.g:3679:1: ( () )
            {
            // InternalVampireLanguage.g:3679:1: ( () )
            // InternalVampireLanguage.g:3680:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSEquivalentLeftAction_1_0_0_0_0()); 
            // InternalVampireLanguage.g:3681:2: ()
            // InternalVampireLanguage.g:3681:3: 
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
    // InternalVampireLanguage.g:3689:1: rule__VLSBinary__Group_1_0_0_0__1 : rule__VLSBinary__Group_1_0_0_0__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3693:1: ( rule__VLSBinary__Group_1_0_0_0__1__Impl )
            // InternalVampireLanguage.g:3694:2: rule__VLSBinary__Group_1_0_0_0__1__Impl
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
    // InternalVampireLanguage.g:3700:1: rule__VLSBinary__Group_1_0_0_0__1__Impl : ( '<=>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3704:1: ( ( '<=>' ) )
            // InternalVampireLanguage.g:3705:1: ( '<=>' )
            {
            // InternalVampireLanguage.g:3705:1: ( '<=>' )
            // InternalVampireLanguage.g:3706:2: '<=>'
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
    // InternalVampireLanguage.g:3716:1: rule__VLSBinary__Group_1_0_0_1__0 : rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1 ;
    public final void rule__VLSBinary__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3720:1: ( rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1 )
            // InternalVampireLanguage.g:3721:2: rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalVampireLanguage.g:3728:1: rule__VLSBinary__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3732:1: ( ( () ) )
            // InternalVampireLanguage.g:3733:1: ( () )
            {
            // InternalVampireLanguage.g:3733:1: ( () )
            // InternalVampireLanguage.g:3734:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSImpliesLeftAction_1_0_0_1_0()); 
            // InternalVampireLanguage.g:3735:2: ()
            // InternalVampireLanguage.g:3735:3: 
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
    // InternalVampireLanguage.g:3743:1: rule__VLSBinary__Group_1_0_0_1__1 : rule__VLSBinary__Group_1_0_0_1__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3747:1: ( rule__VLSBinary__Group_1_0_0_1__1__Impl )
            // InternalVampireLanguage.g:3748:2: rule__VLSBinary__Group_1_0_0_1__1__Impl
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
    // InternalVampireLanguage.g:3754:1: rule__VLSBinary__Group_1_0_0_1__1__Impl : ( '=>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3758:1: ( ( '=>' ) )
            // InternalVampireLanguage.g:3759:1: ( '=>' )
            {
            // InternalVampireLanguage.g:3759:1: ( '=>' )
            // InternalVampireLanguage.g:3760:2: '=>'
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
    // InternalVampireLanguage.g:3770:1: rule__VLSBinary__Group_1_0_0_2__0 : rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1 ;
    public final void rule__VLSBinary__Group_1_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3774:1: ( rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1 )
            // InternalVampireLanguage.g:3775:2: rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalVampireLanguage.g:3782:1: rule__VLSBinary__Group_1_0_0_2__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3786:1: ( ( () ) )
            // InternalVampireLanguage.g:3787:1: ( () )
            {
            // InternalVampireLanguage.g:3787:1: ( () )
            // InternalVampireLanguage.g:3788:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSRevImpliesLeftAction_1_0_0_2_0()); 
            // InternalVampireLanguage.g:3789:2: ()
            // InternalVampireLanguage.g:3789:3: 
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
    // InternalVampireLanguage.g:3797:1: rule__VLSBinary__Group_1_0_0_2__1 : rule__VLSBinary__Group_1_0_0_2__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3801:1: ( rule__VLSBinary__Group_1_0_0_2__1__Impl )
            // InternalVampireLanguage.g:3802:2: rule__VLSBinary__Group_1_0_0_2__1__Impl
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
    // InternalVampireLanguage.g:3808:1: rule__VLSBinary__Group_1_0_0_2__1__Impl : ( '<=' ) ;
    public final void rule__VLSBinary__Group_1_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3812:1: ( ( '<=' ) )
            // InternalVampireLanguage.g:3813:1: ( '<=' )
            {
            // InternalVampireLanguage.g:3813:1: ( '<=' )
            // InternalVampireLanguage.g:3814:2: '<='
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
    // InternalVampireLanguage.g:3824:1: rule__VLSBinary__Group_1_0_0_3__0 : rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1 ;
    public final void rule__VLSBinary__Group_1_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3828:1: ( rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1 )
            // InternalVampireLanguage.g:3829:2: rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalVampireLanguage.g:3836:1: rule__VLSBinary__Group_1_0_0_3__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3840:1: ( ( () ) )
            // InternalVampireLanguage.g:3841:1: ( () )
            {
            // InternalVampireLanguage.g:3841:1: ( () )
            // InternalVampireLanguage.g:3842:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSXnorLeftAction_1_0_0_3_0()); 
            // InternalVampireLanguage.g:3843:2: ()
            // InternalVampireLanguage.g:3843:3: 
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
    // InternalVampireLanguage.g:3851:1: rule__VLSBinary__Group_1_0_0_3__1 : rule__VLSBinary__Group_1_0_0_3__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3855:1: ( rule__VLSBinary__Group_1_0_0_3__1__Impl )
            // InternalVampireLanguage.g:3856:2: rule__VLSBinary__Group_1_0_0_3__1__Impl
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
    // InternalVampireLanguage.g:3862:1: rule__VLSBinary__Group_1_0_0_3__1__Impl : ( '<~>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3866:1: ( ( '<~>' ) )
            // InternalVampireLanguage.g:3867:1: ( '<~>' )
            {
            // InternalVampireLanguage.g:3867:1: ( '<~>' )
            // InternalVampireLanguage.g:3868:2: '<~>'
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
    // InternalVampireLanguage.g:3878:1: rule__VLSBinary__Group_1_0_0_4__0 : rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1 ;
    public final void rule__VLSBinary__Group_1_0_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3882:1: ( rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1 )
            // InternalVampireLanguage.g:3883:2: rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalVampireLanguage.g:3890:1: rule__VLSBinary__Group_1_0_0_4__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3894:1: ( ( () ) )
            // InternalVampireLanguage.g:3895:1: ( () )
            {
            // InternalVampireLanguage.g:3895:1: ( () )
            // InternalVampireLanguage.g:3896:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSNorLeftAction_1_0_0_4_0()); 
            // InternalVampireLanguage.g:3897:2: ()
            // InternalVampireLanguage.g:3897:3: 
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
    // InternalVampireLanguage.g:3905:1: rule__VLSBinary__Group_1_0_0_4__1 : rule__VLSBinary__Group_1_0_0_4__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3909:1: ( rule__VLSBinary__Group_1_0_0_4__1__Impl )
            // InternalVampireLanguage.g:3910:2: rule__VLSBinary__Group_1_0_0_4__1__Impl
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
    // InternalVampireLanguage.g:3916:1: rule__VLSBinary__Group_1_0_0_4__1__Impl : ( '~|' ) ;
    public final void rule__VLSBinary__Group_1_0_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3920:1: ( ( '~|' ) )
            // InternalVampireLanguage.g:3921:1: ( '~|' )
            {
            // InternalVampireLanguage.g:3921:1: ( '~|' )
            // InternalVampireLanguage.g:3922:2: '~|'
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
    // InternalVampireLanguage.g:3932:1: rule__VLSBinary__Group_1_0_0_5__0 : rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1 ;
    public final void rule__VLSBinary__Group_1_0_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3936:1: ( rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1 )
            // InternalVampireLanguage.g:3937:2: rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalVampireLanguage.g:3944:1: rule__VLSBinary__Group_1_0_0_5__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3948:1: ( ( () ) )
            // InternalVampireLanguage.g:3949:1: ( () )
            {
            // InternalVampireLanguage.g:3949:1: ( () )
            // InternalVampireLanguage.g:3950:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSNandLeftAction_1_0_0_5_0()); 
            // InternalVampireLanguage.g:3951:2: ()
            // InternalVampireLanguage.g:3951:3: 
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
    // InternalVampireLanguage.g:3959:1: rule__VLSBinary__Group_1_0_0_5__1 : rule__VLSBinary__Group_1_0_0_5__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3963:1: ( rule__VLSBinary__Group_1_0_0_5__1__Impl )
            // InternalVampireLanguage.g:3964:2: rule__VLSBinary__Group_1_0_0_5__1__Impl
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
    // InternalVampireLanguage.g:3970:1: rule__VLSBinary__Group_1_0_0_5__1__Impl : ( '~&' ) ;
    public final void rule__VLSBinary__Group_1_0_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3974:1: ( ( '~&' ) )
            // InternalVampireLanguage.g:3975:1: ( '~&' )
            {
            // InternalVampireLanguage.g:3975:1: ( '~&' )
            // InternalVampireLanguage.g:3976:2: '~&'
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
    // InternalVampireLanguage.g:3986:1: rule__VLSBinary__Group_1_1__0 : rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1 ;
    public final void rule__VLSBinary__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3990:1: ( rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1 )
            // InternalVampireLanguage.g:3991:2: rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalVampireLanguage.g:3998:1: rule__VLSBinary__Group_1_1__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4002:1: ( ( () ) )
            // InternalVampireLanguage.g:4003:1: ( () )
            {
            // InternalVampireLanguage.g:4003:1: ( () )
            // InternalVampireLanguage.g:4004:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSAndLeftAction_1_1_0()); 
            // InternalVampireLanguage.g:4005:2: ()
            // InternalVampireLanguage.g:4005:3: 
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
    // InternalVampireLanguage.g:4013:1: rule__VLSBinary__Group_1_1__1 : rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2 ;
    public final void rule__VLSBinary__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4017:1: ( rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2 )
            // InternalVampireLanguage.g:4018:2: rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2
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
    // InternalVampireLanguage.g:4025:1: rule__VLSBinary__Group_1_1__1__Impl : ( '&' ) ;
    public final void rule__VLSBinary__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4029:1: ( ( '&' ) )
            // InternalVampireLanguage.g:4030:1: ( '&' )
            {
            // InternalVampireLanguage.g:4030:1: ( '&' )
            // InternalVampireLanguage.g:4031:2: '&'
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
    // InternalVampireLanguage.g:4040:1: rule__VLSBinary__Group_1_1__2 : rule__VLSBinary__Group_1_1__2__Impl ;
    public final void rule__VLSBinary__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4044:1: ( rule__VLSBinary__Group_1_1__2__Impl )
            // InternalVampireLanguage.g:4045:2: rule__VLSBinary__Group_1_1__2__Impl
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
    // InternalVampireLanguage.g:4051:1: rule__VLSBinary__Group_1_1__2__Impl : ( ( rule__VLSBinary__RightAssignment_1_1_2 ) ) ;
    public final void rule__VLSBinary__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4055:1: ( ( ( rule__VLSBinary__RightAssignment_1_1_2 ) ) )
            // InternalVampireLanguage.g:4056:1: ( ( rule__VLSBinary__RightAssignment_1_1_2 ) )
            {
            // InternalVampireLanguage.g:4056:1: ( ( rule__VLSBinary__RightAssignment_1_1_2 ) )
            // InternalVampireLanguage.g:4057:2: ( rule__VLSBinary__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_1_2()); 
            // InternalVampireLanguage.g:4058:2: ( rule__VLSBinary__RightAssignment_1_1_2 )
            // InternalVampireLanguage.g:4058:3: rule__VLSBinary__RightAssignment_1_1_2
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
    // InternalVampireLanguage.g:4067:1: rule__VLSBinary__Group_1_2__0 : rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1 ;
    public final void rule__VLSBinary__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4071:1: ( rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1 )
            // InternalVampireLanguage.g:4072:2: rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalVampireLanguage.g:4079:1: rule__VLSBinary__Group_1_2__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4083:1: ( ( () ) )
            // InternalVampireLanguage.g:4084:1: ( () )
            {
            // InternalVampireLanguage.g:4084:1: ( () )
            // InternalVampireLanguage.g:4085:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSOrLeftAction_1_2_0()); 
            // InternalVampireLanguage.g:4086:2: ()
            // InternalVampireLanguage.g:4086:3: 
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
    // InternalVampireLanguage.g:4094:1: rule__VLSBinary__Group_1_2__1 : rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2 ;
    public final void rule__VLSBinary__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4098:1: ( rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2 )
            // InternalVampireLanguage.g:4099:2: rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2
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
    // InternalVampireLanguage.g:4106:1: rule__VLSBinary__Group_1_2__1__Impl : ( '|' ) ;
    public final void rule__VLSBinary__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4110:1: ( ( '|' ) )
            // InternalVampireLanguage.g:4111:1: ( '|' )
            {
            // InternalVampireLanguage.g:4111:1: ( '|' )
            // InternalVampireLanguage.g:4112:2: '|'
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
    // InternalVampireLanguage.g:4121:1: rule__VLSBinary__Group_1_2__2 : rule__VLSBinary__Group_1_2__2__Impl ;
    public final void rule__VLSBinary__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4125:1: ( rule__VLSBinary__Group_1_2__2__Impl )
            // InternalVampireLanguage.g:4126:2: rule__VLSBinary__Group_1_2__2__Impl
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
    // InternalVampireLanguage.g:4132:1: rule__VLSBinary__Group_1_2__2__Impl : ( ( rule__VLSBinary__RightAssignment_1_2_2 ) ) ;
    public final void rule__VLSBinary__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4136:1: ( ( ( rule__VLSBinary__RightAssignment_1_2_2 ) ) )
            // InternalVampireLanguage.g:4137:1: ( ( rule__VLSBinary__RightAssignment_1_2_2 ) )
            {
            // InternalVampireLanguage.g:4137:1: ( ( rule__VLSBinary__RightAssignment_1_2_2 ) )
            // InternalVampireLanguage.g:4138:2: ( rule__VLSBinary__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_2_2()); 
            // InternalVampireLanguage.g:4139:2: ( rule__VLSBinary__RightAssignment_1_2_2 )
            // InternalVampireLanguage.g:4139:3: rule__VLSBinary__RightAssignment_1_2_2
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
    // InternalVampireLanguage.g:4148:1: rule__VLSUnitaryFormula__Group_4__0 : rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1 ;
    public final void rule__VLSUnitaryFormula__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4152:1: ( rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1 )
            // InternalVampireLanguage.g:4153:2: rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1
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
    // InternalVampireLanguage.g:4160:1: rule__VLSUnitaryFormula__Group_4__0__Impl : ( '(' ) ;
    public final void rule__VLSUnitaryFormula__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4164:1: ( ( '(' ) )
            // InternalVampireLanguage.g:4165:1: ( '(' )
            {
            // InternalVampireLanguage.g:4165:1: ( '(' )
            // InternalVampireLanguage.g:4166:2: '('
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
    // InternalVampireLanguage.g:4175:1: rule__VLSUnitaryFormula__Group_4__1 : rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2 ;
    public final void rule__VLSUnitaryFormula__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4179:1: ( rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2 )
            // InternalVampireLanguage.g:4180:2: rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalVampireLanguage.g:4187:1: rule__VLSUnitaryFormula__Group_4__1__Impl : ( ruleVLSTerm ) ;
    public final void rule__VLSUnitaryFormula__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4191:1: ( ( ruleVLSTerm ) )
            // InternalVampireLanguage.g:4192:1: ( ruleVLSTerm )
            {
            // InternalVampireLanguage.g:4192:1: ( ruleVLSTerm )
            // InternalVampireLanguage.g:4193:2: ruleVLSTerm
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
    // InternalVampireLanguage.g:4202:1: rule__VLSUnitaryFormula__Group_4__2 : rule__VLSUnitaryFormula__Group_4__2__Impl ;
    public final void rule__VLSUnitaryFormula__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4206:1: ( rule__VLSUnitaryFormula__Group_4__2__Impl )
            // InternalVampireLanguage.g:4207:2: rule__VLSUnitaryFormula__Group_4__2__Impl
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
    // InternalVampireLanguage.g:4213:1: rule__VLSUnitaryFormula__Group_4__2__Impl : ( ')' ) ;
    public final void rule__VLSUnitaryFormula__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4217:1: ( ( ')' ) )
            // InternalVampireLanguage.g:4218:1: ( ')' )
            {
            // InternalVampireLanguage.g:4218:1: ( ')' )
            // InternalVampireLanguage.g:4219:2: ')'
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
    // InternalVampireLanguage.g:4229:1: rule__VLSUniversalQuantifier__Group__0 : rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1 ;
    public final void rule__VLSUniversalQuantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4233:1: ( rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1 )
            // InternalVampireLanguage.g:4234:2: rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalVampireLanguage.g:4241:1: rule__VLSUniversalQuantifier__Group__0__Impl : ( () ) ;
    public final void rule__VLSUniversalQuantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4245:1: ( ( () ) )
            // InternalVampireLanguage.g:4246:1: ( () )
            {
            // InternalVampireLanguage.g:4246:1: ( () )
            // InternalVampireLanguage.g:4247:2: ()
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVLSUniversalQuantifierAction_0()); 
            // InternalVampireLanguage.g:4248:2: ()
            // InternalVampireLanguage.g:4248:3: 
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
    // InternalVampireLanguage.g:4256:1: rule__VLSUniversalQuantifier__Group__1 : rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2 ;
    public final void rule__VLSUniversalQuantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4260:1: ( rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2 )
            // InternalVampireLanguage.g:4261:2: rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2
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
    // InternalVampireLanguage.g:4268:1: rule__VLSUniversalQuantifier__Group__1__Impl : ( ( rule__VLSUniversalQuantifier__Group_1__0 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4272:1: ( ( ( rule__VLSUniversalQuantifier__Group_1__0 ) ) )
            // InternalVampireLanguage.g:4273:1: ( ( rule__VLSUniversalQuantifier__Group_1__0 ) )
            {
            // InternalVampireLanguage.g:4273:1: ( ( rule__VLSUniversalQuantifier__Group_1__0 ) )
            // InternalVampireLanguage.g:4274:2: ( rule__VLSUniversalQuantifier__Group_1__0 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup_1()); 
            // InternalVampireLanguage.g:4275:2: ( rule__VLSUniversalQuantifier__Group_1__0 )
            // InternalVampireLanguage.g:4275:3: rule__VLSUniversalQuantifier__Group_1__0
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
    // InternalVampireLanguage.g:4283:1: rule__VLSUniversalQuantifier__Group__2 : rule__VLSUniversalQuantifier__Group__2__Impl ;
    public final void rule__VLSUniversalQuantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4287:1: ( rule__VLSUniversalQuantifier__Group__2__Impl )
            // InternalVampireLanguage.g:4288:2: rule__VLSUniversalQuantifier__Group__2__Impl
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
    // InternalVampireLanguage.g:4294:1: rule__VLSUniversalQuantifier__Group__2__Impl : ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4298:1: ( ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:4299:1: ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:4299:1: ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:4300:2: ( rule__VLSUniversalQuantifier__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:4301:2: ( rule__VLSUniversalQuantifier__OperandAssignment_2 )
            // InternalVampireLanguage.g:4301:3: rule__VLSUniversalQuantifier__OperandAssignment_2
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
    // InternalVampireLanguage.g:4310:1: rule__VLSUniversalQuantifier__Group_1__0 : rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1 ;
    public final void rule__VLSUniversalQuantifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4314:1: ( rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1 )
            // InternalVampireLanguage.g:4315:2: rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1
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
    // InternalVampireLanguage.g:4322:1: rule__VLSUniversalQuantifier__Group_1__0__Impl : ( '!' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4326:1: ( ( '!' ) )
            // InternalVampireLanguage.g:4327:1: ( '!' )
            {
            // InternalVampireLanguage.g:4327:1: ( '!' )
            // InternalVampireLanguage.g:4328:2: '!'
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
    // InternalVampireLanguage.g:4337:1: rule__VLSUniversalQuantifier__Group_1__1 : rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2 ;
    public final void rule__VLSUniversalQuantifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4341:1: ( rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2 )
            // InternalVampireLanguage.g:4342:2: rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalVampireLanguage.g:4349:1: rule__VLSUniversalQuantifier__Group_1__1__Impl : ( '[' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4353:1: ( ( '[' ) )
            // InternalVampireLanguage.g:4354:1: ( '[' )
            {
            // InternalVampireLanguage.g:4354:1: ( '[' )
            // InternalVampireLanguage.g:4355:2: '['
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
    // InternalVampireLanguage.g:4364:1: rule__VLSUniversalQuantifier__Group_1__2 : rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3 ;
    public final void rule__VLSUniversalQuantifier__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4368:1: ( rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3 )
            // InternalVampireLanguage.g:4369:2: rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalVampireLanguage.g:4376:1: rule__VLSUniversalQuantifier__Group_1__2__Impl : ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4380:1: ( ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) ) )
            // InternalVampireLanguage.g:4381:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) )
            {
            // InternalVampireLanguage.g:4381:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) )
            // InternalVampireLanguage.g:4382:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAssignment_1_2()); 
            // InternalVampireLanguage.g:4383:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 )
            // InternalVampireLanguage.g:4383:3: rule__VLSUniversalQuantifier__VariablesAssignment_1_2
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
    // InternalVampireLanguage.g:4391:1: rule__VLSUniversalQuantifier__Group_1__3 : rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4 ;
    public final void rule__VLSUniversalQuantifier__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4395:1: ( rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4 )
            // InternalVampireLanguage.g:4396:2: rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalVampireLanguage.g:4403:1: rule__VLSUniversalQuantifier__Group_1__3__Impl : ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4407:1: ( ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* ) )
            // InternalVampireLanguage.g:4408:1: ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* )
            {
            // InternalVampireLanguage.g:4408:1: ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* )
            // InternalVampireLanguage.g:4409:2: ( rule__VLSUniversalQuantifier__Group_1_3__0 )*
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup_1_3()); 
            // InternalVampireLanguage.g:4410:2: ( rule__VLSUniversalQuantifier__Group_1_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==56) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalVampireLanguage.g:4410:3: rule__VLSUniversalQuantifier__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_33);
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
    // InternalVampireLanguage.g:4418:1: rule__VLSUniversalQuantifier__Group_1__4 : rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5 ;
    public final void rule__VLSUniversalQuantifier__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4422:1: ( rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5 )
            // InternalVampireLanguage.g:4423:2: rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalVampireLanguage.g:4430:1: rule__VLSUniversalQuantifier__Group_1__4__Impl : ( ']' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4434:1: ( ( ']' ) )
            // InternalVampireLanguage.g:4435:1: ( ']' )
            {
            // InternalVampireLanguage.g:4435:1: ( ']' )
            // InternalVampireLanguage.g:4436:2: ']'
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
    // InternalVampireLanguage.g:4445:1: rule__VLSUniversalQuantifier__Group_1__5 : rule__VLSUniversalQuantifier__Group_1__5__Impl ;
    public final void rule__VLSUniversalQuantifier__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4449:1: ( rule__VLSUniversalQuantifier__Group_1__5__Impl )
            // InternalVampireLanguage.g:4450:2: rule__VLSUniversalQuantifier__Group_1__5__Impl
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
    // InternalVampireLanguage.g:4456:1: rule__VLSUniversalQuantifier__Group_1__5__Impl : ( ':' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4460:1: ( ( ':' ) )
            // InternalVampireLanguage.g:4461:1: ( ':' )
            {
            // InternalVampireLanguage.g:4461:1: ( ':' )
            // InternalVampireLanguage.g:4462:2: ':'
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
    // InternalVampireLanguage.g:4472:1: rule__VLSUniversalQuantifier__Group_1_3__0 : rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1 ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4476:1: ( rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1 )
            // InternalVampireLanguage.g:4477:2: rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalVampireLanguage.g:4484:1: rule__VLSUniversalQuantifier__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4488:1: ( ( ',' ) )
            // InternalVampireLanguage.g:4489:1: ( ',' )
            {
            // InternalVampireLanguage.g:4489:1: ( ',' )
            // InternalVampireLanguage.g:4490:2: ','
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
    // InternalVampireLanguage.g:4499:1: rule__VLSUniversalQuantifier__Group_1_3__1 : rule__VLSUniversalQuantifier__Group_1_3__1__Impl ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4503:1: ( rule__VLSUniversalQuantifier__Group_1_3__1__Impl )
            // InternalVampireLanguage.g:4504:2: rule__VLSUniversalQuantifier__Group_1_3__1__Impl
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
    // InternalVampireLanguage.g:4510:1: rule__VLSUniversalQuantifier__Group_1_3__1__Impl : ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4514:1: ( ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) ) )
            // InternalVampireLanguage.g:4515:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) )
            {
            // InternalVampireLanguage.g:4515:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) )
            // InternalVampireLanguage.g:4516:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAssignment_1_3_1()); 
            // InternalVampireLanguage.g:4517:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 )
            // InternalVampireLanguage.g:4517:3: rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1
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
    // InternalVampireLanguage.g:4526:1: rule__VLSExistentialQuantifier__Group__0 : rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1 ;
    public final void rule__VLSExistentialQuantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4530:1: ( rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1 )
            // InternalVampireLanguage.g:4531:2: rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalVampireLanguage.g:4538:1: rule__VLSExistentialQuantifier__Group__0__Impl : ( () ) ;
    public final void rule__VLSExistentialQuantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4542:1: ( ( () ) )
            // InternalVampireLanguage.g:4543:1: ( () )
            {
            // InternalVampireLanguage.g:4543:1: ( () )
            // InternalVampireLanguage.g:4544:2: ()
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVLSExistentialQuantifierAction_0()); 
            // InternalVampireLanguage.g:4545:2: ()
            // InternalVampireLanguage.g:4545:3: 
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
    // InternalVampireLanguage.g:4553:1: rule__VLSExistentialQuantifier__Group__1 : rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2 ;
    public final void rule__VLSExistentialQuantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4557:1: ( rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2 )
            // InternalVampireLanguage.g:4558:2: rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2
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
    // InternalVampireLanguage.g:4565:1: rule__VLSExistentialQuantifier__Group__1__Impl : ( ( rule__VLSExistentialQuantifier__Group_1__0 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4569:1: ( ( ( rule__VLSExistentialQuantifier__Group_1__0 ) ) )
            // InternalVampireLanguage.g:4570:1: ( ( rule__VLSExistentialQuantifier__Group_1__0 ) )
            {
            // InternalVampireLanguage.g:4570:1: ( ( rule__VLSExistentialQuantifier__Group_1__0 ) )
            // InternalVampireLanguage.g:4571:2: ( rule__VLSExistentialQuantifier__Group_1__0 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup_1()); 
            // InternalVampireLanguage.g:4572:2: ( rule__VLSExistentialQuantifier__Group_1__0 )
            // InternalVampireLanguage.g:4572:3: rule__VLSExistentialQuantifier__Group_1__0
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
    // InternalVampireLanguage.g:4580:1: rule__VLSExistentialQuantifier__Group__2 : rule__VLSExistentialQuantifier__Group__2__Impl ;
    public final void rule__VLSExistentialQuantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4584:1: ( rule__VLSExistentialQuantifier__Group__2__Impl )
            // InternalVampireLanguage.g:4585:2: rule__VLSExistentialQuantifier__Group__2__Impl
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
    // InternalVampireLanguage.g:4591:1: rule__VLSExistentialQuantifier__Group__2__Impl : ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4595:1: ( ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:4596:1: ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:4596:1: ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:4597:2: ( rule__VLSExistentialQuantifier__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:4598:2: ( rule__VLSExistentialQuantifier__OperandAssignment_2 )
            // InternalVampireLanguage.g:4598:3: rule__VLSExistentialQuantifier__OperandAssignment_2
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
    // InternalVampireLanguage.g:4607:1: rule__VLSExistentialQuantifier__Group_1__0 : rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1 ;
    public final void rule__VLSExistentialQuantifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4611:1: ( rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1 )
            // InternalVampireLanguage.g:4612:2: rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1
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
    // InternalVampireLanguage.g:4619:1: rule__VLSExistentialQuantifier__Group_1__0__Impl : ( '?' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4623:1: ( ( '?' ) )
            // InternalVampireLanguage.g:4624:1: ( '?' )
            {
            // InternalVampireLanguage.g:4624:1: ( '?' )
            // InternalVampireLanguage.g:4625:2: '?'
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
    // InternalVampireLanguage.g:4634:1: rule__VLSExistentialQuantifier__Group_1__1 : rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2 ;
    public final void rule__VLSExistentialQuantifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4638:1: ( rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2 )
            // InternalVampireLanguage.g:4639:2: rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalVampireLanguage.g:4646:1: rule__VLSExistentialQuantifier__Group_1__1__Impl : ( '[' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4650:1: ( ( '[' ) )
            // InternalVampireLanguage.g:4651:1: ( '[' )
            {
            // InternalVampireLanguage.g:4651:1: ( '[' )
            // InternalVampireLanguage.g:4652:2: '['
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
    // InternalVampireLanguage.g:4661:1: rule__VLSExistentialQuantifier__Group_1__2 : rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3 ;
    public final void rule__VLSExistentialQuantifier__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4665:1: ( rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3 )
            // InternalVampireLanguage.g:4666:2: rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalVampireLanguage.g:4673:1: rule__VLSExistentialQuantifier__Group_1__2__Impl : ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4677:1: ( ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) ) )
            // InternalVampireLanguage.g:4678:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) )
            {
            // InternalVampireLanguage.g:4678:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) )
            // InternalVampireLanguage.g:4679:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAssignment_1_2()); 
            // InternalVampireLanguage.g:4680:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 )
            // InternalVampireLanguage.g:4680:3: rule__VLSExistentialQuantifier__VariablesAssignment_1_2
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
    // InternalVampireLanguage.g:4688:1: rule__VLSExistentialQuantifier__Group_1__3 : rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4 ;
    public final void rule__VLSExistentialQuantifier__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4692:1: ( rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4 )
            // InternalVampireLanguage.g:4693:2: rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalVampireLanguage.g:4700:1: rule__VLSExistentialQuantifier__Group_1__3__Impl : ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4704:1: ( ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* ) )
            // InternalVampireLanguage.g:4705:1: ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* )
            {
            // InternalVampireLanguage.g:4705:1: ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* )
            // InternalVampireLanguage.g:4706:2: ( rule__VLSExistentialQuantifier__Group_1_3__0 )*
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup_1_3()); 
            // InternalVampireLanguage.g:4707:2: ( rule__VLSExistentialQuantifier__Group_1_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==56) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalVampireLanguage.g:4707:3: rule__VLSExistentialQuantifier__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_33);
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
    // InternalVampireLanguage.g:4715:1: rule__VLSExistentialQuantifier__Group_1__4 : rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5 ;
    public final void rule__VLSExistentialQuantifier__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4719:1: ( rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5 )
            // InternalVampireLanguage.g:4720:2: rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalVampireLanguage.g:4727:1: rule__VLSExistentialQuantifier__Group_1__4__Impl : ( ']' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4731:1: ( ( ']' ) )
            // InternalVampireLanguage.g:4732:1: ( ']' )
            {
            // InternalVampireLanguage.g:4732:1: ( ']' )
            // InternalVampireLanguage.g:4733:2: ']'
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
    // InternalVampireLanguage.g:4742:1: rule__VLSExistentialQuantifier__Group_1__5 : rule__VLSExistentialQuantifier__Group_1__5__Impl ;
    public final void rule__VLSExistentialQuantifier__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4746:1: ( rule__VLSExistentialQuantifier__Group_1__5__Impl )
            // InternalVampireLanguage.g:4747:2: rule__VLSExistentialQuantifier__Group_1__5__Impl
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
    // InternalVampireLanguage.g:4753:1: rule__VLSExistentialQuantifier__Group_1__5__Impl : ( ':' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4757:1: ( ( ':' ) )
            // InternalVampireLanguage.g:4758:1: ( ':' )
            {
            // InternalVampireLanguage.g:4758:1: ( ':' )
            // InternalVampireLanguage.g:4759:2: ':'
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
    // InternalVampireLanguage.g:4769:1: rule__VLSExistentialQuantifier__Group_1_3__0 : rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1 ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4773:1: ( rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1 )
            // InternalVampireLanguage.g:4774:2: rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalVampireLanguage.g:4781:1: rule__VLSExistentialQuantifier__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4785:1: ( ( ',' ) )
            // InternalVampireLanguage.g:4786:1: ( ',' )
            {
            // InternalVampireLanguage.g:4786:1: ( ',' )
            // InternalVampireLanguage.g:4787:2: ','
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
    // InternalVampireLanguage.g:4796:1: rule__VLSExistentialQuantifier__Group_1_3__1 : rule__VLSExistentialQuantifier__Group_1_3__1__Impl ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4800:1: ( rule__VLSExistentialQuantifier__Group_1_3__1__Impl )
            // InternalVampireLanguage.g:4801:2: rule__VLSExistentialQuantifier__Group_1_3__1__Impl
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
    // InternalVampireLanguage.g:4807:1: rule__VLSExistentialQuantifier__Group_1_3__1__Impl : ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4811:1: ( ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) ) )
            // InternalVampireLanguage.g:4812:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) )
            {
            // InternalVampireLanguage.g:4812:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) )
            // InternalVampireLanguage.g:4813:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAssignment_1_3_1()); 
            // InternalVampireLanguage.g:4814:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 )
            // InternalVampireLanguage.g:4814:3: rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1
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
    // InternalVampireLanguage.g:4823:1: rule__VLSUnaryNegation__Group__0 : rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1 ;
    public final void rule__VLSUnaryNegation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4827:1: ( rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1 )
            // InternalVampireLanguage.g:4828:2: rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalVampireLanguage.g:4835:1: rule__VLSUnaryNegation__Group__0__Impl : ( () ) ;
    public final void rule__VLSUnaryNegation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4839:1: ( ( () ) )
            // InternalVampireLanguage.g:4840:1: ( () )
            {
            // InternalVampireLanguage.g:4840:1: ( () )
            // InternalVampireLanguage.g:4841:2: ()
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getVLSUnaryNegationAction_0()); 
            // InternalVampireLanguage.g:4842:2: ()
            // InternalVampireLanguage.g:4842:3: 
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
    // InternalVampireLanguage.g:4850:1: rule__VLSUnaryNegation__Group__1 : rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2 ;
    public final void rule__VLSUnaryNegation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4854:1: ( rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2 )
            // InternalVampireLanguage.g:4855:2: rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2
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
    // InternalVampireLanguage.g:4862:1: rule__VLSUnaryNegation__Group__1__Impl : ( '~' ) ;
    public final void rule__VLSUnaryNegation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4866:1: ( ( '~' ) )
            // InternalVampireLanguage.g:4867:1: ( '~' )
            {
            // InternalVampireLanguage.g:4867:1: ( '~' )
            // InternalVampireLanguage.g:4868:2: '~'
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
    // InternalVampireLanguage.g:4877:1: rule__VLSUnaryNegation__Group__2 : rule__VLSUnaryNegation__Group__2__Impl ;
    public final void rule__VLSUnaryNegation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4881:1: ( rule__VLSUnaryNegation__Group__2__Impl )
            // InternalVampireLanguage.g:4882:2: rule__VLSUnaryNegation__Group__2__Impl
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
    // InternalVampireLanguage.g:4888:1: rule__VLSUnaryNegation__Group__2__Impl : ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) ) ;
    public final void rule__VLSUnaryNegation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4892:1: ( ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:4893:1: ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:4893:1: ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:4894:2: ( rule__VLSUnaryNegation__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:4895:2: ( rule__VLSUnaryNegation__OperandAssignment_2 )
            // InternalVampireLanguage.g:4895:3: rule__VLSUnaryNegation__OperandAssignment_2
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
    // InternalVampireLanguage.g:4904:1: rule__VLSUnaryInfix__Group__0 : rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1 ;
    public final void rule__VLSUnaryInfix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4908:1: ( rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1 )
            // InternalVampireLanguage.g:4909:2: rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalVampireLanguage.g:4916:1: rule__VLSUnaryInfix__Group__0__Impl : ( ruleVLSAtomic ) ;
    public final void rule__VLSUnaryInfix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4920:1: ( ( ruleVLSAtomic ) )
            // InternalVampireLanguage.g:4921:1: ( ruleVLSAtomic )
            {
            // InternalVampireLanguage.g:4921:1: ( ruleVLSAtomic )
            // InternalVampireLanguage.g:4922:2: ruleVLSAtomic
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
    // InternalVampireLanguage.g:4931:1: rule__VLSUnaryInfix__Group__1 : rule__VLSUnaryInfix__Group__1__Impl ;
    public final void rule__VLSUnaryInfix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4935:1: ( rule__VLSUnaryInfix__Group__1__Impl )
            // InternalVampireLanguage.g:4936:2: rule__VLSUnaryInfix__Group__1__Impl
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
    // InternalVampireLanguage.g:4942:1: rule__VLSUnaryInfix__Group__1__Impl : ( ( rule__VLSUnaryInfix__Group_1__0 )? ) ;
    public final void rule__VLSUnaryInfix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4946:1: ( ( ( rule__VLSUnaryInfix__Group_1__0 )? ) )
            // InternalVampireLanguage.g:4947:1: ( ( rule__VLSUnaryInfix__Group_1__0 )? )
            {
            // InternalVampireLanguage.g:4947:1: ( ( rule__VLSUnaryInfix__Group_1__0 )? )
            // InternalVampireLanguage.g:4948:2: ( rule__VLSUnaryInfix__Group_1__0 )?
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1()); 
            // InternalVampireLanguage.g:4949:2: ( rule__VLSUnaryInfix__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=75 && LA41_0<=77)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalVampireLanguage.g:4949:3: rule__VLSUnaryInfix__Group_1__0
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
    // InternalVampireLanguage.g:4958:1: rule__VLSUnaryInfix__Group_1__0 : rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1 ;
    public final void rule__VLSUnaryInfix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4962:1: ( rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1 )
            // InternalVampireLanguage.g:4963:2: rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalVampireLanguage.g:4970:1: rule__VLSUnaryInfix__Group_1__0__Impl : ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) ) ;
    public final void rule__VLSUnaryInfix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4974:1: ( ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) ) )
            // InternalVampireLanguage.g:4975:1: ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) )
            {
            // InternalVampireLanguage.g:4975:1: ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) )
            // InternalVampireLanguage.g:4976:2: ( rule__VLSUnaryInfix__Alternatives_1_0 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getAlternatives_1_0()); 
            // InternalVampireLanguage.g:4977:2: ( rule__VLSUnaryInfix__Alternatives_1_0 )
            // InternalVampireLanguage.g:4977:3: rule__VLSUnaryInfix__Alternatives_1_0
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
    // InternalVampireLanguage.g:4985:1: rule__VLSUnaryInfix__Group_1__1 : rule__VLSUnaryInfix__Group_1__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4989:1: ( rule__VLSUnaryInfix__Group_1__1__Impl )
            // InternalVampireLanguage.g:4990:2: rule__VLSUnaryInfix__Group_1__1__Impl
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
    // InternalVampireLanguage.g:4996:1: rule__VLSUnaryInfix__Group_1__1__Impl : ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) ) ;
    public final void rule__VLSUnaryInfix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5000:1: ( ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:5001:1: ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:5001:1: ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) )
            // InternalVampireLanguage.g:5002:2: ( rule__VLSUnaryInfix__RightAssignment_1_1 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getRightAssignment_1_1()); 
            // InternalVampireLanguage.g:5003:2: ( rule__VLSUnaryInfix__RightAssignment_1_1 )
            // InternalVampireLanguage.g:5003:3: rule__VLSUnaryInfix__RightAssignment_1_1
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
    // InternalVampireLanguage.g:5012:1: rule__VLSUnaryInfix__Group_1_0_0__0 : rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5016:1: ( rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1 )
            // InternalVampireLanguage.g:5017:2: rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalVampireLanguage.g:5024:1: rule__VLSUnaryInfix__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5028:1: ( ( () ) )
            // InternalVampireLanguage.g:5029:1: ( () )
            {
            // InternalVampireLanguage.g:5029:1: ( () )
            // InternalVampireLanguage.g:5030:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSInequalityLeftAction_1_0_0_0()); 
            // InternalVampireLanguage.g:5031:2: ()
            // InternalVampireLanguage.g:5031:3: 
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
    // InternalVampireLanguage.g:5039:1: rule__VLSUnaryInfix__Group_1_0_0__1 : rule__VLSUnaryInfix__Group_1_0_0__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5043:1: ( rule__VLSUnaryInfix__Group_1_0_0__1__Impl )
            // InternalVampireLanguage.g:5044:2: rule__VLSUnaryInfix__Group_1_0_0__1__Impl
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
    // InternalVampireLanguage.g:5050:1: rule__VLSUnaryInfix__Group_1_0_0__1__Impl : ( '!=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5054:1: ( ( '!=' ) )
            // InternalVampireLanguage.g:5055:1: ( '!=' )
            {
            // InternalVampireLanguage.g:5055:1: ( '!=' )
            // InternalVampireLanguage.g:5056:2: '!='
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
    // InternalVampireLanguage.g:5066:1: rule__VLSUnaryInfix__Group_1_0_1__0 : rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5070:1: ( rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1 )
            // InternalVampireLanguage.g:5071:2: rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalVampireLanguage.g:5078:1: rule__VLSUnaryInfix__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5082:1: ( ( () ) )
            // InternalVampireLanguage.g:5083:1: ( () )
            {
            // InternalVampireLanguage.g:5083:1: ( () )
            // InternalVampireLanguage.g:5084:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSEqualityLeftAction_1_0_1_0()); 
            // InternalVampireLanguage.g:5085:2: ()
            // InternalVampireLanguage.g:5085:3: 
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
    // InternalVampireLanguage.g:5093:1: rule__VLSUnaryInfix__Group_1_0_1__1 : rule__VLSUnaryInfix__Group_1_0_1__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5097:1: ( rule__VLSUnaryInfix__Group_1_0_1__1__Impl )
            // InternalVampireLanguage.g:5098:2: rule__VLSUnaryInfix__Group_1_0_1__1__Impl
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
    // InternalVampireLanguage.g:5104:1: rule__VLSUnaryInfix__Group_1_0_1__1__Impl : ( '=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5108:1: ( ( '=' ) )
            // InternalVampireLanguage.g:5109:1: ( '=' )
            {
            // InternalVampireLanguage.g:5109:1: ( '=' )
            // InternalVampireLanguage.g:5110:2: '='
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
    // InternalVampireLanguage.g:5120:1: rule__VLSUnaryInfix__Group_1_0_2__0 : rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5124:1: ( rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1 )
            // InternalVampireLanguage.g:5125:2: rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalVampireLanguage.g:5132:1: rule__VLSUnaryInfix__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5136:1: ( ( () ) )
            // InternalVampireLanguage.g:5137:1: ( () )
            {
            // InternalVampireLanguage.g:5137:1: ( () )
            // InternalVampireLanguage.g:5138:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSAssignmentLeftAction_1_0_2_0()); 
            // InternalVampireLanguage.g:5139:2: ()
            // InternalVampireLanguage.g:5139:3: 
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
    // InternalVampireLanguage.g:5147:1: rule__VLSUnaryInfix__Group_1_0_2__1 : rule__VLSUnaryInfix__Group_1_0_2__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5151:1: ( rule__VLSUnaryInfix__Group_1_0_2__1__Impl )
            // InternalVampireLanguage.g:5152:2: rule__VLSUnaryInfix__Group_1_0_2__1__Impl
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
    // InternalVampireLanguage.g:5158:1: rule__VLSUnaryInfix__Group_1_0_2__1__Impl : ( ':=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5162:1: ( ( ':=' ) )
            // InternalVampireLanguage.g:5163:1: ( ':=' )
            {
            // InternalVampireLanguage.g:5163:1: ( ':=' )
            // InternalVampireLanguage.g:5164:2: ':='
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
    // InternalVampireLanguage.g:5174:1: rule__VLSAtomicConstant__Group_0__0 : rule__VLSAtomicConstant__Group_0__0__Impl rule__VLSAtomicConstant__Group_0__1 ;
    public final void rule__VLSAtomicConstant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5178:1: ( rule__VLSAtomicConstant__Group_0__0__Impl rule__VLSAtomicConstant__Group_0__1 )
            // InternalVampireLanguage.g:5179:2: rule__VLSAtomicConstant__Group_0__0__Impl rule__VLSAtomicConstant__Group_0__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalVampireLanguage.g:5186:1: rule__VLSAtomicConstant__Group_0__0__Impl : ( () ) ;
    public final void rule__VLSAtomicConstant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5190:1: ( ( () ) )
            // InternalVampireLanguage.g:5191:1: ( () )
            {
            // InternalVampireLanguage.g:5191:1: ( () )
            // InternalVampireLanguage.g:5192:2: ()
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getVLSConstantAction_0_0()); 
            // InternalVampireLanguage.g:5193:2: ()
            // InternalVampireLanguage.g:5193:3: 
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
    // InternalVampireLanguage.g:5201:1: rule__VLSAtomicConstant__Group_0__1 : rule__VLSAtomicConstant__Group_0__1__Impl ;
    public final void rule__VLSAtomicConstant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5205:1: ( rule__VLSAtomicConstant__Group_0__1__Impl )
            // InternalVampireLanguage.g:5206:2: rule__VLSAtomicConstant__Group_0__1__Impl
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
    // InternalVampireLanguage.g:5212:1: rule__VLSAtomicConstant__Group_0__1__Impl : ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) ) ;
    public final void rule__VLSAtomicConstant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5216:1: ( ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) ) )
            // InternalVampireLanguage.g:5217:1: ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) )
            {
            // InternalVampireLanguage.g:5217:1: ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) )
            // InternalVampireLanguage.g:5218:2: ( rule__VLSAtomicConstant__NameAssignment_0_1 )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getNameAssignment_0_1()); 
            // InternalVampireLanguage.g:5219:2: ( rule__VLSAtomicConstant__NameAssignment_0_1 )
            // InternalVampireLanguage.g:5219:3: rule__VLSAtomicConstant__NameAssignment_0_1
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
    // InternalVampireLanguage.g:5228:1: rule__VLSAtomicConstant__Group_1__0 : rule__VLSAtomicConstant__Group_1__0__Impl rule__VLSAtomicConstant__Group_1__1 ;
    public final void rule__VLSAtomicConstant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5232:1: ( rule__VLSAtomicConstant__Group_1__0__Impl rule__VLSAtomicConstant__Group_1__1 )
            // InternalVampireLanguage.g:5233:2: rule__VLSAtomicConstant__Group_1__0__Impl rule__VLSAtomicConstant__Group_1__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalVampireLanguage.g:5240:1: rule__VLSAtomicConstant__Group_1__0__Impl : ( () ) ;
    public final void rule__VLSAtomicConstant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5244:1: ( ( () ) )
            // InternalVampireLanguage.g:5245:1: ( () )
            {
            // InternalVampireLanguage.g:5245:1: ( () )
            // InternalVampireLanguage.g:5246:2: ()
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getVLSTrueAction_1_0()); 
            // InternalVampireLanguage.g:5247:2: ()
            // InternalVampireLanguage.g:5247:3: 
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
    // InternalVampireLanguage.g:5255:1: rule__VLSAtomicConstant__Group_1__1 : rule__VLSAtomicConstant__Group_1__1__Impl ;
    public final void rule__VLSAtomicConstant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5259:1: ( rule__VLSAtomicConstant__Group_1__1__Impl )
            // InternalVampireLanguage.g:5260:2: rule__VLSAtomicConstant__Group_1__1__Impl
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
    // InternalVampireLanguage.g:5266:1: rule__VLSAtomicConstant__Group_1__1__Impl : ( '$true' ) ;
    public final void rule__VLSAtomicConstant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5270:1: ( ( '$true' ) )
            // InternalVampireLanguage.g:5271:1: ( '$true' )
            {
            // InternalVampireLanguage.g:5271:1: ( '$true' )
            // InternalVampireLanguage.g:5272:2: '$true'
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
    // InternalVampireLanguage.g:5282:1: rule__VLSAtomicConstant__Group_2__0 : rule__VLSAtomicConstant__Group_2__0__Impl rule__VLSAtomicConstant__Group_2__1 ;
    public final void rule__VLSAtomicConstant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5286:1: ( rule__VLSAtomicConstant__Group_2__0__Impl rule__VLSAtomicConstant__Group_2__1 )
            // InternalVampireLanguage.g:5287:2: rule__VLSAtomicConstant__Group_2__0__Impl rule__VLSAtomicConstant__Group_2__1
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
    // InternalVampireLanguage.g:5294:1: rule__VLSAtomicConstant__Group_2__0__Impl : ( () ) ;
    public final void rule__VLSAtomicConstant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5298:1: ( ( () ) )
            // InternalVampireLanguage.g:5299:1: ( () )
            {
            // InternalVampireLanguage.g:5299:1: ( () )
            // InternalVampireLanguage.g:5300:2: ()
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getVLSFalseAction_2_0()); 
            // InternalVampireLanguage.g:5301:2: ()
            // InternalVampireLanguage.g:5301:3: 
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
    // InternalVampireLanguage.g:5309:1: rule__VLSAtomicConstant__Group_2__1 : rule__VLSAtomicConstant__Group_2__1__Impl ;
    public final void rule__VLSAtomicConstant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5313:1: ( rule__VLSAtomicConstant__Group_2__1__Impl )
            // InternalVampireLanguage.g:5314:2: rule__VLSAtomicConstant__Group_2__1__Impl
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
    // InternalVampireLanguage.g:5320:1: rule__VLSAtomicConstant__Group_2__1__Impl : ( '$false' ) ;
    public final void rule__VLSAtomicConstant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5324:1: ( ( '$false' ) )
            // InternalVampireLanguage.g:5325:1: ( '$false' )
            {
            // InternalVampireLanguage.g:5325:1: ( '$false' )
            // InternalVampireLanguage.g:5326:2: '$false'
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
    // InternalVampireLanguage.g:5336:1: rule__VLSAtomicFunction__Group_0__0 : rule__VLSAtomicFunction__Group_0__0__Impl rule__VLSAtomicFunction__Group_0__1 ;
    public final void rule__VLSAtomicFunction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5340:1: ( rule__VLSAtomicFunction__Group_0__0__Impl rule__VLSAtomicFunction__Group_0__1 )
            // InternalVampireLanguage.g:5341:2: rule__VLSAtomicFunction__Group_0__0__Impl rule__VLSAtomicFunction__Group_0__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalVampireLanguage.g:5348:1: rule__VLSAtomicFunction__Group_0__0__Impl : ( () ) ;
    public final void rule__VLSAtomicFunction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5352:1: ( ( () ) )
            // InternalVampireLanguage.g:5353:1: ( () )
            {
            // InternalVampireLanguage.g:5353:1: ( () )
            // InternalVampireLanguage.g:5354:2: ()
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getVLSFunctionAction_0_0()); 
            // InternalVampireLanguage.g:5355:2: ()
            // InternalVampireLanguage.g:5355:3: 
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
    // InternalVampireLanguage.g:5363:1: rule__VLSAtomicFunction__Group_0__1 : rule__VLSAtomicFunction__Group_0__1__Impl rule__VLSAtomicFunction__Group_0__2 ;
    public final void rule__VLSAtomicFunction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5367:1: ( rule__VLSAtomicFunction__Group_0__1__Impl rule__VLSAtomicFunction__Group_0__2 )
            // InternalVampireLanguage.g:5368:2: rule__VLSAtomicFunction__Group_0__1__Impl rule__VLSAtomicFunction__Group_0__2
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
    // InternalVampireLanguage.g:5375:1: rule__VLSAtomicFunction__Group_0__1__Impl : ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5379:1: ( ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) ) )
            // InternalVampireLanguage.g:5380:1: ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) )
            {
            // InternalVampireLanguage.g:5380:1: ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) )
            // InternalVampireLanguage.g:5381:2: ( rule__VLSAtomicFunction__ConstantAssignment_0_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getConstantAssignment_0_1()); 
            // InternalVampireLanguage.g:5382:2: ( rule__VLSAtomicFunction__ConstantAssignment_0_1 )
            // InternalVampireLanguage.g:5382:3: rule__VLSAtomicFunction__ConstantAssignment_0_1
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
    // InternalVampireLanguage.g:5390:1: rule__VLSAtomicFunction__Group_0__2 : rule__VLSAtomicFunction__Group_0__2__Impl ;
    public final void rule__VLSAtomicFunction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5394:1: ( rule__VLSAtomicFunction__Group_0__2__Impl )
            // InternalVampireLanguage.g:5395:2: rule__VLSAtomicFunction__Group_0__2__Impl
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
    // InternalVampireLanguage.g:5401:1: rule__VLSAtomicFunction__Group_0__2__Impl : ( ( rule__VLSAtomicFunction__Group_0_2__0 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5405:1: ( ( ( rule__VLSAtomicFunction__Group_0_2__0 ) ) )
            // InternalVampireLanguage.g:5406:1: ( ( rule__VLSAtomicFunction__Group_0_2__0 ) )
            {
            // InternalVampireLanguage.g:5406:1: ( ( rule__VLSAtomicFunction__Group_0_2__0 ) )
            // InternalVampireLanguage.g:5407:2: ( rule__VLSAtomicFunction__Group_0_2__0 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0_2()); 
            // InternalVampireLanguage.g:5408:2: ( rule__VLSAtomicFunction__Group_0_2__0 )
            // InternalVampireLanguage.g:5408:3: rule__VLSAtomicFunction__Group_0_2__0
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
    // InternalVampireLanguage.g:5417:1: rule__VLSAtomicFunction__Group_0_2__0 : rule__VLSAtomicFunction__Group_0_2__0__Impl rule__VLSAtomicFunction__Group_0_2__1 ;
    public final void rule__VLSAtomicFunction__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5421:1: ( rule__VLSAtomicFunction__Group_0_2__0__Impl rule__VLSAtomicFunction__Group_0_2__1 )
            // InternalVampireLanguage.g:5422:2: rule__VLSAtomicFunction__Group_0_2__0__Impl rule__VLSAtomicFunction__Group_0_2__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalVampireLanguage.g:5429:1: rule__VLSAtomicFunction__Group_0_2__0__Impl : ( '(' ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5433:1: ( ( '(' ) )
            // InternalVampireLanguage.g:5434:1: ( '(' )
            {
            // InternalVampireLanguage.g:5434:1: ( '(' )
            // InternalVampireLanguage.g:5435:2: '('
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
    // InternalVampireLanguage.g:5444:1: rule__VLSAtomicFunction__Group_0_2__1 : rule__VLSAtomicFunction__Group_0_2__1__Impl rule__VLSAtomicFunction__Group_0_2__2 ;
    public final void rule__VLSAtomicFunction__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5448:1: ( rule__VLSAtomicFunction__Group_0_2__1__Impl rule__VLSAtomicFunction__Group_0_2__2 )
            // InternalVampireLanguage.g:5449:2: rule__VLSAtomicFunction__Group_0_2__1__Impl rule__VLSAtomicFunction__Group_0_2__2
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
    // InternalVampireLanguage.g:5456:1: rule__VLSAtomicFunction__Group_0_2__1__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5460:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) ) )
            // InternalVampireLanguage.g:5461:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) )
            {
            // InternalVampireLanguage.g:5461:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) )
            // InternalVampireLanguage.g:5462:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_0_2_1()); 
            // InternalVampireLanguage.g:5463:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 )
            // InternalVampireLanguage.g:5463:3: rule__VLSAtomicFunction__TermsAssignment_0_2_1
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
    // InternalVampireLanguage.g:5471:1: rule__VLSAtomicFunction__Group_0_2__2 : rule__VLSAtomicFunction__Group_0_2__2__Impl rule__VLSAtomicFunction__Group_0_2__3 ;
    public final void rule__VLSAtomicFunction__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5475:1: ( rule__VLSAtomicFunction__Group_0_2__2__Impl rule__VLSAtomicFunction__Group_0_2__3 )
            // InternalVampireLanguage.g:5476:2: rule__VLSAtomicFunction__Group_0_2__2__Impl rule__VLSAtomicFunction__Group_0_2__3
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
    // InternalVampireLanguage.g:5483:1: rule__VLSAtomicFunction__Group_0_2__2__Impl : ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5487:1: ( ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* ) )
            // InternalVampireLanguage.g:5488:1: ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* )
            {
            // InternalVampireLanguage.g:5488:1: ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* )
            // InternalVampireLanguage.g:5489:2: ( rule__VLSAtomicFunction__Group_0_2_2__0 )*
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0_2_2()); 
            // InternalVampireLanguage.g:5490:2: ( rule__VLSAtomicFunction__Group_0_2_2__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==56) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalVampireLanguage.g:5490:3: rule__VLSAtomicFunction__Group_0_2_2__0
            	    {
            	    pushFollow(FOLLOW_33);
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
    // InternalVampireLanguage.g:5498:1: rule__VLSAtomicFunction__Group_0_2__3 : rule__VLSAtomicFunction__Group_0_2__3__Impl ;
    public final void rule__VLSAtomicFunction__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5502:1: ( rule__VLSAtomicFunction__Group_0_2__3__Impl )
            // InternalVampireLanguage.g:5503:2: rule__VLSAtomicFunction__Group_0_2__3__Impl
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
    // InternalVampireLanguage.g:5509:1: rule__VLSAtomicFunction__Group_0_2__3__Impl : ( ')' ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5513:1: ( ( ')' ) )
            // InternalVampireLanguage.g:5514:1: ( ')' )
            {
            // InternalVampireLanguage.g:5514:1: ( ')' )
            // InternalVampireLanguage.g:5515:2: ')'
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
    // InternalVampireLanguage.g:5525:1: rule__VLSAtomicFunction__Group_0_2_2__0 : rule__VLSAtomicFunction__Group_0_2_2__0__Impl rule__VLSAtomicFunction__Group_0_2_2__1 ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5529:1: ( rule__VLSAtomicFunction__Group_0_2_2__0__Impl rule__VLSAtomicFunction__Group_0_2_2__1 )
            // InternalVampireLanguage.g:5530:2: rule__VLSAtomicFunction__Group_0_2_2__0__Impl rule__VLSAtomicFunction__Group_0_2_2__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalVampireLanguage.g:5537:1: rule__VLSAtomicFunction__Group_0_2_2__0__Impl : ( ',' ) ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5541:1: ( ( ',' ) )
            // InternalVampireLanguage.g:5542:1: ( ',' )
            {
            // InternalVampireLanguage.g:5542:1: ( ',' )
            // InternalVampireLanguage.g:5543:2: ','
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
    // InternalVampireLanguage.g:5552:1: rule__VLSAtomicFunction__Group_0_2_2__1 : rule__VLSAtomicFunction__Group_0_2_2__1__Impl ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5556:1: ( rule__VLSAtomicFunction__Group_0_2_2__1__Impl )
            // InternalVampireLanguage.g:5557:2: rule__VLSAtomicFunction__Group_0_2_2__1__Impl
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
    // InternalVampireLanguage.g:5563:1: rule__VLSAtomicFunction__Group_0_2_2__1__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5567:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) ) )
            // InternalVampireLanguage.g:5568:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) )
            {
            // InternalVampireLanguage.g:5568:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) )
            // InternalVampireLanguage.g:5569:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_0_2_2_1()); 
            // InternalVampireLanguage.g:5570:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 )
            // InternalVampireLanguage.g:5570:3: rule__VLSAtomicFunction__TermsAssignment_0_2_2_1
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
    // InternalVampireLanguage.g:5579:1: rule__VLSAtomicFunction__Group_1__0 : rule__VLSAtomicFunction__Group_1__0__Impl rule__VLSAtomicFunction__Group_1__1 ;
    public final void rule__VLSAtomicFunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5583:1: ( rule__VLSAtomicFunction__Group_1__0__Impl rule__VLSAtomicFunction__Group_1__1 )
            // InternalVampireLanguage.g:5584:2: rule__VLSAtomicFunction__Group_1__0__Impl rule__VLSAtomicFunction__Group_1__1
            {
            pushFollow(FOLLOW_59);
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
    // InternalVampireLanguage.g:5591:1: rule__VLSAtomicFunction__Group_1__0__Impl : ( () ) ;
    public final void rule__VLSAtomicFunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5595:1: ( ( () ) )
            // InternalVampireLanguage.g:5596:1: ( () )
            {
            // InternalVampireLanguage.g:5596:1: ( () )
            // InternalVampireLanguage.g:5597:2: ()
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getVLSLessAction_1_0()); 
            // InternalVampireLanguage.g:5598:2: ()
            // InternalVampireLanguage.g:5598:3: 
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
    // InternalVampireLanguage.g:5606:1: rule__VLSAtomicFunction__Group_1__1 : rule__VLSAtomicFunction__Group_1__1__Impl rule__VLSAtomicFunction__Group_1__2 ;
    public final void rule__VLSAtomicFunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5610:1: ( rule__VLSAtomicFunction__Group_1__1__Impl rule__VLSAtomicFunction__Group_1__2 )
            // InternalVampireLanguage.g:5611:2: rule__VLSAtomicFunction__Group_1__1__Impl rule__VLSAtomicFunction__Group_1__2
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
    // InternalVampireLanguage.g:5618:1: rule__VLSAtomicFunction__Group_1__1__Impl : ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5622:1: ( ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:5623:1: ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:5623:1: ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) )
            // InternalVampireLanguage.g:5624:2: ( rule__VLSAtomicFunction__NameAssignment_1_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getNameAssignment_1_1()); 
            // InternalVampireLanguage.g:5625:2: ( rule__VLSAtomicFunction__NameAssignment_1_1 )
            // InternalVampireLanguage.g:5625:3: rule__VLSAtomicFunction__NameAssignment_1_1
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
    // InternalVampireLanguage.g:5633:1: rule__VLSAtomicFunction__Group_1__2 : rule__VLSAtomicFunction__Group_1__2__Impl rule__VLSAtomicFunction__Group_1__3 ;
    public final void rule__VLSAtomicFunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5637:1: ( rule__VLSAtomicFunction__Group_1__2__Impl rule__VLSAtomicFunction__Group_1__3 )
            // InternalVampireLanguage.g:5638:2: rule__VLSAtomicFunction__Group_1__2__Impl rule__VLSAtomicFunction__Group_1__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalVampireLanguage.g:5645:1: rule__VLSAtomicFunction__Group_1__2__Impl : ( '(' ) ;
    public final void rule__VLSAtomicFunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5649:1: ( ( '(' ) )
            // InternalVampireLanguage.g:5650:1: ( '(' )
            {
            // InternalVampireLanguage.g:5650:1: ( '(' )
            // InternalVampireLanguage.g:5651:2: '('
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
    // InternalVampireLanguage.g:5660:1: rule__VLSAtomicFunction__Group_1__3 : rule__VLSAtomicFunction__Group_1__3__Impl rule__VLSAtomicFunction__Group_1__4 ;
    public final void rule__VLSAtomicFunction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5664:1: ( rule__VLSAtomicFunction__Group_1__3__Impl rule__VLSAtomicFunction__Group_1__4 )
            // InternalVampireLanguage.g:5665:2: rule__VLSAtomicFunction__Group_1__3__Impl rule__VLSAtomicFunction__Group_1__4
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
    // InternalVampireLanguage.g:5672:1: rule__VLSAtomicFunction__Group_1__3__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) ) ;
    public final void rule__VLSAtomicFunction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5676:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) ) )
            // InternalVampireLanguage.g:5677:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) )
            {
            // InternalVampireLanguage.g:5677:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) )
            // InternalVampireLanguage.g:5678:2: ( rule__VLSAtomicFunction__TermsAssignment_1_3 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_1_3()); 
            // InternalVampireLanguage.g:5679:2: ( rule__VLSAtomicFunction__TermsAssignment_1_3 )
            // InternalVampireLanguage.g:5679:3: rule__VLSAtomicFunction__TermsAssignment_1_3
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
    // InternalVampireLanguage.g:5687:1: rule__VLSAtomicFunction__Group_1__4 : rule__VLSAtomicFunction__Group_1__4__Impl rule__VLSAtomicFunction__Group_1__5 ;
    public final void rule__VLSAtomicFunction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5691:1: ( rule__VLSAtomicFunction__Group_1__4__Impl rule__VLSAtomicFunction__Group_1__5 )
            // InternalVampireLanguage.g:5692:2: rule__VLSAtomicFunction__Group_1__4__Impl rule__VLSAtomicFunction__Group_1__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalVampireLanguage.g:5699:1: rule__VLSAtomicFunction__Group_1__4__Impl : ( ',' ) ;
    public final void rule__VLSAtomicFunction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5703:1: ( ( ',' ) )
            // InternalVampireLanguage.g:5704:1: ( ',' )
            {
            // InternalVampireLanguage.g:5704:1: ( ',' )
            // InternalVampireLanguage.g:5705:2: ','
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
    // InternalVampireLanguage.g:5714:1: rule__VLSAtomicFunction__Group_1__5 : rule__VLSAtomicFunction__Group_1__5__Impl rule__VLSAtomicFunction__Group_1__6 ;
    public final void rule__VLSAtomicFunction__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5718:1: ( rule__VLSAtomicFunction__Group_1__5__Impl rule__VLSAtomicFunction__Group_1__6 )
            // InternalVampireLanguage.g:5719:2: rule__VLSAtomicFunction__Group_1__5__Impl rule__VLSAtomicFunction__Group_1__6
            {
            pushFollow(FOLLOW_32);
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
    // InternalVampireLanguage.g:5726:1: rule__VLSAtomicFunction__Group_1__5__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) ) ;
    public final void rule__VLSAtomicFunction__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5730:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) ) )
            // InternalVampireLanguage.g:5731:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) )
            {
            // InternalVampireLanguage.g:5731:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) )
            // InternalVampireLanguage.g:5732:2: ( rule__VLSAtomicFunction__TermsAssignment_1_5 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_1_5()); 
            // InternalVampireLanguage.g:5733:2: ( rule__VLSAtomicFunction__TermsAssignment_1_5 )
            // InternalVampireLanguage.g:5733:3: rule__VLSAtomicFunction__TermsAssignment_1_5
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
    // InternalVampireLanguage.g:5741:1: rule__VLSAtomicFunction__Group_1__6 : rule__VLSAtomicFunction__Group_1__6__Impl ;
    public final void rule__VLSAtomicFunction__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5745:1: ( rule__VLSAtomicFunction__Group_1__6__Impl )
            // InternalVampireLanguage.g:5746:2: rule__VLSAtomicFunction__Group_1__6__Impl
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
    // InternalVampireLanguage.g:5752:1: rule__VLSAtomicFunction__Group_1__6__Impl : ( ')' ) ;
    public final void rule__VLSAtomicFunction__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5756:1: ( ( ')' ) )
            // InternalVampireLanguage.g:5757:1: ( ')' )
            {
            // InternalVampireLanguage.g:5757:1: ( ')' )
            // InternalVampireLanguage.g:5758:2: ')'
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
    // InternalVampireLanguage.g:5768:1: rule__VLSFunctionAsTerm__Group__0 : rule__VLSFunctionAsTerm__Group__0__Impl rule__VLSFunctionAsTerm__Group__1 ;
    public final void rule__VLSFunctionAsTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5772:1: ( rule__VLSFunctionAsTerm__Group__0__Impl rule__VLSFunctionAsTerm__Group__1 )
            // InternalVampireLanguage.g:5773:2: rule__VLSFunctionAsTerm__Group__0__Impl rule__VLSFunctionAsTerm__Group__1
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
    // InternalVampireLanguage.g:5780:1: rule__VLSFunctionAsTerm__Group__0__Impl : ( ( rule__VLSFunctionAsTerm__FunctorAssignment_0 ) ) ;
    public final void rule__VLSFunctionAsTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5784:1: ( ( ( rule__VLSFunctionAsTerm__FunctorAssignment_0 ) ) )
            // InternalVampireLanguage.g:5785:1: ( ( rule__VLSFunctionAsTerm__FunctorAssignment_0 ) )
            {
            // InternalVampireLanguage.g:5785:1: ( ( rule__VLSFunctionAsTerm__FunctorAssignment_0 ) )
            // InternalVampireLanguage.g:5786:2: ( rule__VLSFunctionAsTerm__FunctorAssignment_0 )
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getFunctorAssignment_0()); 
            // InternalVampireLanguage.g:5787:2: ( rule__VLSFunctionAsTerm__FunctorAssignment_0 )
            // InternalVampireLanguage.g:5787:3: rule__VLSFunctionAsTerm__FunctorAssignment_0
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
    // InternalVampireLanguage.g:5795:1: rule__VLSFunctionAsTerm__Group__1 : rule__VLSFunctionAsTerm__Group__1__Impl ;
    public final void rule__VLSFunctionAsTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5799:1: ( rule__VLSFunctionAsTerm__Group__1__Impl )
            // InternalVampireLanguage.g:5800:2: rule__VLSFunctionAsTerm__Group__1__Impl
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
    // InternalVampireLanguage.g:5806:1: rule__VLSFunctionAsTerm__Group__1__Impl : ( ( rule__VLSFunctionAsTerm__Group_1__0 )? ) ;
    public final void rule__VLSFunctionAsTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5810:1: ( ( ( rule__VLSFunctionAsTerm__Group_1__0 )? ) )
            // InternalVampireLanguage.g:5811:1: ( ( rule__VLSFunctionAsTerm__Group_1__0 )? )
            {
            // InternalVampireLanguage.g:5811:1: ( ( rule__VLSFunctionAsTerm__Group_1__0 )? )
            // InternalVampireLanguage.g:5812:2: ( rule__VLSFunctionAsTerm__Group_1__0 )?
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getGroup_1()); 
            // InternalVampireLanguage.g:5813:2: ( rule__VLSFunctionAsTerm__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==55) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalVampireLanguage.g:5813:3: rule__VLSFunctionAsTerm__Group_1__0
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
    // InternalVampireLanguage.g:5822:1: rule__VLSFunctionAsTerm__Group_1__0 : rule__VLSFunctionAsTerm__Group_1__0__Impl rule__VLSFunctionAsTerm__Group_1__1 ;
    public final void rule__VLSFunctionAsTerm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5826:1: ( rule__VLSFunctionAsTerm__Group_1__0__Impl rule__VLSFunctionAsTerm__Group_1__1 )
            // InternalVampireLanguage.g:5827:2: rule__VLSFunctionAsTerm__Group_1__0__Impl rule__VLSFunctionAsTerm__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalVampireLanguage.g:5834:1: rule__VLSFunctionAsTerm__Group_1__0__Impl : ( '(' ) ;
    public final void rule__VLSFunctionAsTerm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5838:1: ( ( '(' ) )
            // InternalVampireLanguage.g:5839:1: ( '(' )
            {
            // InternalVampireLanguage.g:5839:1: ( '(' )
            // InternalVampireLanguage.g:5840:2: '('
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
    // InternalVampireLanguage.g:5849:1: rule__VLSFunctionAsTerm__Group_1__1 : rule__VLSFunctionAsTerm__Group_1__1__Impl rule__VLSFunctionAsTerm__Group_1__2 ;
    public final void rule__VLSFunctionAsTerm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5853:1: ( rule__VLSFunctionAsTerm__Group_1__1__Impl rule__VLSFunctionAsTerm__Group_1__2 )
            // InternalVampireLanguage.g:5854:2: rule__VLSFunctionAsTerm__Group_1__1__Impl rule__VLSFunctionAsTerm__Group_1__2
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
    // InternalVampireLanguage.g:5861:1: rule__VLSFunctionAsTerm__Group_1__1__Impl : ( ( rule__VLSFunctionAsTerm__TermsAssignment_1_1 ) ) ;
    public final void rule__VLSFunctionAsTerm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5865:1: ( ( ( rule__VLSFunctionAsTerm__TermsAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:5866:1: ( ( rule__VLSFunctionAsTerm__TermsAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:5866:1: ( ( rule__VLSFunctionAsTerm__TermsAssignment_1_1 ) )
            // InternalVampireLanguage.g:5867:2: ( rule__VLSFunctionAsTerm__TermsAssignment_1_1 )
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getTermsAssignment_1_1()); 
            // InternalVampireLanguage.g:5868:2: ( rule__VLSFunctionAsTerm__TermsAssignment_1_1 )
            // InternalVampireLanguage.g:5868:3: rule__VLSFunctionAsTerm__TermsAssignment_1_1
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
    // InternalVampireLanguage.g:5876:1: rule__VLSFunctionAsTerm__Group_1__2 : rule__VLSFunctionAsTerm__Group_1__2__Impl rule__VLSFunctionAsTerm__Group_1__3 ;
    public final void rule__VLSFunctionAsTerm__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5880:1: ( rule__VLSFunctionAsTerm__Group_1__2__Impl rule__VLSFunctionAsTerm__Group_1__3 )
            // InternalVampireLanguage.g:5881:2: rule__VLSFunctionAsTerm__Group_1__2__Impl rule__VLSFunctionAsTerm__Group_1__3
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
    // InternalVampireLanguage.g:5888:1: rule__VLSFunctionAsTerm__Group_1__2__Impl : ( ( rule__VLSFunctionAsTerm__Group_1_2__0 )* ) ;
    public final void rule__VLSFunctionAsTerm__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5892:1: ( ( ( rule__VLSFunctionAsTerm__Group_1_2__0 )* ) )
            // InternalVampireLanguage.g:5893:1: ( ( rule__VLSFunctionAsTerm__Group_1_2__0 )* )
            {
            // InternalVampireLanguage.g:5893:1: ( ( rule__VLSFunctionAsTerm__Group_1_2__0 )* )
            // InternalVampireLanguage.g:5894:2: ( rule__VLSFunctionAsTerm__Group_1_2__0 )*
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getGroup_1_2()); 
            // InternalVampireLanguage.g:5895:2: ( rule__VLSFunctionAsTerm__Group_1_2__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==56) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalVampireLanguage.g:5895:3: rule__VLSFunctionAsTerm__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_33);
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
    // InternalVampireLanguage.g:5903:1: rule__VLSFunctionAsTerm__Group_1__3 : rule__VLSFunctionAsTerm__Group_1__3__Impl ;
    public final void rule__VLSFunctionAsTerm__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5907:1: ( rule__VLSFunctionAsTerm__Group_1__3__Impl )
            // InternalVampireLanguage.g:5908:2: rule__VLSFunctionAsTerm__Group_1__3__Impl
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
    // InternalVampireLanguage.g:5914:1: rule__VLSFunctionAsTerm__Group_1__3__Impl : ( ')' ) ;
    public final void rule__VLSFunctionAsTerm__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5918:1: ( ( ')' ) )
            // InternalVampireLanguage.g:5919:1: ( ')' )
            {
            // InternalVampireLanguage.g:5919:1: ( ')' )
            // InternalVampireLanguage.g:5920:2: ')'
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
    // InternalVampireLanguage.g:5930:1: rule__VLSFunctionAsTerm__Group_1_2__0 : rule__VLSFunctionAsTerm__Group_1_2__0__Impl rule__VLSFunctionAsTerm__Group_1_2__1 ;
    public final void rule__VLSFunctionAsTerm__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5934:1: ( rule__VLSFunctionAsTerm__Group_1_2__0__Impl rule__VLSFunctionAsTerm__Group_1_2__1 )
            // InternalVampireLanguage.g:5935:2: rule__VLSFunctionAsTerm__Group_1_2__0__Impl rule__VLSFunctionAsTerm__Group_1_2__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalVampireLanguage.g:5942:1: rule__VLSFunctionAsTerm__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__VLSFunctionAsTerm__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5946:1: ( ( ',' ) )
            // InternalVampireLanguage.g:5947:1: ( ',' )
            {
            // InternalVampireLanguage.g:5947:1: ( ',' )
            // InternalVampireLanguage.g:5948:2: ','
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
    // InternalVampireLanguage.g:5957:1: rule__VLSFunctionAsTerm__Group_1_2__1 : rule__VLSFunctionAsTerm__Group_1_2__1__Impl ;
    public final void rule__VLSFunctionAsTerm__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5961:1: ( rule__VLSFunctionAsTerm__Group_1_2__1__Impl )
            // InternalVampireLanguage.g:5962:2: rule__VLSFunctionAsTerm__Group_1_2__1__Impl
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
    // InternalVampireLanguage.g:5968:1: rule__VLSFunctionAsTerm__Group_1_2__1__Impl : ( ( rule__VLSFunctionAsTerm__TermsAssignment_1_2_1 ) ) ;
    public final void rule__VLSFunctionAsTerm__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5972:1: ( ( ( rule__VLSFunctionAsTerm__TermsAssignment_1_2_1 ) ) )
            // InternalVampireLanguage.g:5973:1: ( ( rule__VLSFunctionAsTerm__TermsAssignment_1_2_1 ) )
            {
            // InternalVampireLanguage.g:5973:1: ( ( rule__VLSFunctionAsTerm__TermsAssignment_1_2_1 ) )
            // InternalVampireLanguage.g:5974:2: ( rule__VLSFunctionAsTerm__TermsAssignment_1_2_1 )
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getTermsAssignment_1_2_1()); 
            // InternalVampireLanguage.g:5975:2: ( rule__VLSFunctionAsTerm__TermsAssignment_1_2_1 )
            // InternalVampireLanguage.g:5975:3: rule__VLSFunctionAsTerm__TermsAssignment_1_2_1
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
    // InternalVampireLanguage.g:5984:1: rule__VLSDefinedTerm__Group_0__0 : rule__VLSDefinedTerm__Group_0__0__Impl rule__VLSDefinedTerm__Group_0__1 ;
    public final void rule__VLSDefinedTerm__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5988:1: ( rule__VLSDefinedTerm__Group_0__0__Impl rule__VLSDefinedTerm__Group_0__1 )
            // InternalVampireLanguage.g:5989:2: rule__VLSDefinedTerm__Group_0__0__Impl rule__VLSDefinedTerm__Group_0__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalVampireLanguage.g:5996:1: rule__VLSDefinedTerm__Group_0__0__Impl : ( () ) ;
    public final void rule__VLSDefinedTerm__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6000:1: ( ( () ) )
            // InternalVampireLanguage.g:6001:1: ( () )
            {
            // InternalVampireLanguage.g:6001:1: ( () )
            // InternalVampireLanguage.g:6002:2: ()
            {
             before(grammarAccess.getVLSDefinedTermAccess().getVLSIntAction_0_0()); 
            // InternalVampireLanguage.g:6003:2: ()
            // InternalVampireLanguage.g:6003:3: 
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
    // InternalVampireLanguage.g:6011:1: rule__VLSDefinedTerm__Group_0__1 : rule__VLSDefinedTerm__Group_0__1__Impl ;
    public final void rule__VLSDefinedTerm__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6015:1: ( rule__VLSDefinedTerm__Group_0__1__Impl )
            // InternalVampireLanguage.g:6016:2: rule__VLSDefinedTerm__Group_0__1__Impl
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
    // InternalVampireLanguage.g:6022:1: rule__VLSDefinedTerm__Group_0__1__Impl : ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) ) ;
    public final void rule__VLSDefinedTerm__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6026:1: ( ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) ) )
            // InternalVampireLanguage.g:6027:1: ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) )
            {
            // InternalVampireLanguage.g:6027:1: ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) )
            // InternalVampireLanguage.g:6028:2: ( rule__VLSDefinedTerm__ValueAssignment_0_1 )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_0_1()); 
            // InternalVampireLanguage.g:6029:2: ( rule__VLSDefinedTerm__ValueAssignment_0_1 )
            // InternalVampireLanguage.g:6029:3: rule__VLSDefinedTerm__ValueAssignment_0_1
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
    // InternalVampireLanguage.g:6038:1: rule__VLSDefinedTerm__Group_1__0 : rule__VLSDefinedTerm__Group_1__0__Impl rule__VLSDefinedTerm__Group_1__1 ;
    public final void rule__VLSDefinedTerm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6042:1: ( rule__VLSDefinedTerm__Group_1__0__Impl rule__VLSDefinedTerm__Group_1__1 )
            // InternalVampireLanguage.g:6043:2: rule__VLSDefinedTerm__Group_1__0__Impl rule__VLSDefinedTerm__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalVampireLanguage.g:6050:1: rule__VLSDefinedTerm__Group_1__0__Impl : ( () ) ;
    public final void rule__VLSDefinedTerm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6054:1: ( ( () ) )
            // InternalVampireLanguage.g:6055:1: ( () )
            {
            // InternalVampireLanguage.g:6055:1: ( () )
            // InternalVampireLanguage.g:6056:2: ()
            {
             before(grammarAccess.getVLSDefinedTermAccess().getVLSDoubleQuoteAction_1_0()); 
            // InternalVampireLanguage.g:6057:2: ()
            // InternalVampireLanguage.g:6057:3: 
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
    // InternalVampireLanguage.g:6065:1: rule__VLSDefinedTerm__Group_1__1 : rule__VLSDefinedTerm__Group_1__1__Impl ;
    public final void rule__VLSDefinedTerm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6069:1: ( rule__VLSDefinedTerm__Group_1__1__Impl )
            // InternalVampireLanguage.g:6070:2: rule__VLSDefinedTerm__Group_1__1__Impl
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
    // InternalVampireLanguage.g:6076:1: rule__VLSDefinedTerm__Group_1__1__Impl : ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) ) ;
    public final void rule__VLSDefinedTerm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6080:1: ( ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:6081:1: ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:6081:1: ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) )
            // InternalVampireLanguage.g:6082:2: ( rule__VLSDefinedTerm__ValueAssignment_1_1 )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_1_1()); 
            // InternalVampireLanguage.g:6083:2: ( rule__VLSDefinedTerm__ValueAssignment_1_1 )
            // InternalVampireLanguage.g:6083:3: rule__VLSDefinedTerm__ValueAssignment_1_1
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
    // InternalVampireLanguage.g:6092:1: rule__VampireModel__CommentsAssignment_0 : ( ruleVLSComment ) ;
    public final void rule__VampireModel__CommentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6096:1: ( ( ruleVLSComment ) )
            // InternalVampireLanguage.g:6097:2: ( ruleVLSComment )
            {
            // InternalVampireLanguage.g:6097:2: ( ruleVLSComment )
            // InternalVampireLanguage.g:6098:3: ruleVLSComment
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
    // InternalVampireLanguage.g:6107:1: rule__VampireModel__ConfirmationsAssignment_1 : ( ruleVLSConfirmations ) ;
    public final void rule__VampireModel__ConfirmationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6111:1: ( ( ruleVLSConfirmations ) )
            // InternalVampireLanguage.g:6112:2: ( ruleVLSConfirmations )
            {
            // InternalVampireLanguage.g:6112:2: ( ruleVLSConfirmations )
            // InternalVampireLanguage.g:6113:3: ruleVLSConfirmations
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
    // InternalVampireLanguage.g:6122:1: rule__VampireModel__FormulasAssignment_2 : ( ruleVLSFofFormula ) ;
    public final void rule__VampireModel__FormulasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6126:1: ( ( ruleVLSFofFormula ) )
            // InternalVampireLanguage.g:6127:2: ( ruleVLSFofFormula )
            {
            // InternalVampireLanguage.g:6127:2: ( ruleVLSFofFormula )
            // InternalVampireLanguage.g:6128:3: ruleVLSFofFormula
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
    // InternalVampireLanguage.g:6137:1: rule__VampireModel__TfformulasAssignment_3 : ( ruleVLSTffFormula ) ;
    public final void rule__VampireModel__TfformulasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6141:1: ( ( ruleVLSTffFormula ) )
            // InternalVampireLanguage.g:6142:2: ( ruleVLSTffFormula )
            {
            // InternalVampireLanguage.g:6142:2: ( ruleVLSTffFormula )
            // InternalVampireLanguage.g:6143:3: ruleVLSTffFormula
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
    // InternalVampireLanguage.g:6152:1: rule__VLSComment__CommentAssignment : ( RULE_SINGLE_COMMENT ) ;
    public final void rule__VLSComment__CommentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6156:1: ( ( RULE_SINGLE_COMMENT ) )
            // InternalVampireLanguage.g:6157:2: ( RULE_SINGLE_COMMENT )
            {
            // InternalVampireLanguage.g:6157:2: ( RULE_SINGLE_COMMENT )
            // InternalVampireLanguage.g:6158:3: RULE_SINGLE_COMMENT
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
    // InternalVampireLanguage.g:6167:1: rule__VLSConfirmations__NameAssignment_2_3 : ( RULE_LITERAL ) ;
    public final void rule__VLSConfirmations__NameAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6171:1: ( ( RULE_LITERAL ) )
            // InternalVampireLanguage.g:6172:2: ( RULE_LITERAL )
            {
            // InternalVampireLanguage.g:6172:2: ( RULE_LITERAL )
            // InternalVampireLanguage.g:6173:3: RULE_LITERAL
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
    // InternalVampireLanguage.g:6182:1: rule__VLSFofFormula__NameAssignment_2 : ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) ) ;
    public final void rule__VLSFofFormula__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6186:1: ( ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) ) )
            // InternalVampireLanguage.g:6187:2: ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) )
            {
            // InternalVampireLanguage.g:6187:2: ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) )
            // InternalVampireLanguage.g:6188:3: ( rule__VLSFofFormula__NameAlternatives_2_0 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getNameAlternatives_2_0()); 
            // InternalVampireLanguage.g:6189:3: ( rule__VLSFofFormula__NameAlternatives_2_0 )
            // InternalVampireLanguage.g:6189:4: rule__VLSFofFormula__NameAlternatives_2_0
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
    // InternalVampireLanguage.g:6197:1: rule__VLSFofFormula__FofRoleAssignment_4 : ( ruleVLSRole ) ;
    public final void rule__VLSFofFormula__FofRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6201:1: ( ( ruleVLSRole ) )
            // InternalVampireLanguage.g:6202:2: ( ruleVLSRole )
            {
            // InternalVampireLanguage.g:6202:2: ( ruleVLSRole )
            // InternalVampireLanguage.g:6203:3: ruleVLSRole
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
    // InternalVampireLanguage.g:6212:1: rule__VLSFofFormula__FofFormulaAssignment_6 : ( ruleVLSTerm ) ;
    public final void rule__VLSFofFormula__FofFormulaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6216:1: ( ( ruleVLSTerm ) )
            // InternalVampireLanguage.g:6217:2: ( ruleVLSTerm )
            {
            // InternalVampireLanguage.g:6217:2: ( ruleVLSTerm )
            // InternalVampireLanguage.g:6218:3: ruleVLSTerm
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
    // InternalVampireLanguage.g:6227:1: rule__VLSFofFormula__AnnotationsAssignment_7_1 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSFofFormula__AnnotationsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6231:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:6232:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:6232:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:6233:3: ruleVLSAnnotation
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
    // InternalVampireLanguage.g:6242:1: rule__VLSTffFormula__NameAssignment_2 : ( ruleVLSTffName ) ;
    public final void rule__VLSTffFormula__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6246:1: ( ( ruleVLSTffName ) )
            // InternalVampireLanguage.g:6247:2: ( ruleVLSTffName )
            {
            // InternalVampireLanguage.g:6247:2: ( ruleVLSTffName )
            // InternalVampireLanguage.g:6248:3: ruleVLSTffName
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
    // InternalVampireLanguage.g:6257:1: rule__VLSTffFormula__TffRoleAssignment_4 : ( ruleVLSRole ) ;
    public final void rule__VLSTffFormula__TffRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6261:1: ( ( ruleVLSRole ) )
            // InternalVampireLanguage.g:6262:2: ( ruleVLSRole )
            {
            // InternalVampireLanguage.g:6262:2: ( ruleVLSRole )
            // InternalVampireLanguage.g:6263:3: ruleVLSRole
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
    // InternalVampireLanguage.g:6272:1: rule__VLSTffFormula__FofFormulaAssignment_6 : ( ruleVLSTffTerm ) ;
    public final void rule__VLSTffFormula__FofFormulaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6276:1: ( ( ruleVLSTffTerm ) )
            // InternalVampireLanguage.g:6277:2: ( ruleVLSTffTerm )
            {
            // InternalVampireLanguage.g:6277:2: ( ruleVLSTffTerm )
            // InternalVampireLanguage.g:6278:3: ruleVLSTffTerm
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
    // InternalVampireLanguage.g:6287:1: rule__VLSTffFormula__AnnotationsAssignment_7_1 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSTffFormula__AnnotationsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6291:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:6292:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:6292:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:6293:3: ruleVLSAnnotation
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
    // InternalVampireLanguage.g:6302:1: rule__VLSAnnotation__NameAssignment_1 : ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) ) ;
    public final void rule__VLSAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6306:1: ( ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) ) )
            // InternalVampireLanguage.g:6307:2: ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) )
            {
            // InternalVampireLanguage.g:6307:2: ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) )
            // InternalVampireLanguage.g:6308:3: ( rule__VLSAnnotation__NameAlternatives_1_0 )
            {
             before(grammarAccess.getVLSAnnotationAccess().getNameAlternatives_1_0()); 
            // InternalVampireLanguage.g:6309:3: ( rule__VLSAnnotation__NameAlternatives_1_0 )
            // InternalVampireLanguage.g:6309:4: rule__VLSAnnotation__NameAlternatives_1_0
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
    // InternalVampireLanguage.g:6317:1: rule__VLSAnnotation__FollowupAssignment_2_1 : ( ruleVLSAnnotationTerms ) ;
    public final void rule__VLSAnnotation__FollowupAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6321:1: ( ( ruleVLSAnnotationTerms ) )
            // InternalVampireLanguage.g:6322:2: ( ruleVLSAnnotationTerms )
            {
            // InternalVampireLanguage.g:6322:2: ( ruleVLSAnnotationTerms )
            // InternalVampireLanguage.g:6323:3: ruleVLSAnnotationTerms
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
    // InternalVampireLanguage.g:6332:1: rule__VLSAnnotationTerms__TermsAssignment_0 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSAnnotationTerms__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6336:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:6337:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:6337:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:6338:3: ruleVLSAnnotation
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
    // InternalVampireLanguage.g:6347:1: rule__VLSAnnotationTerms__TermsAssignment_1_1 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSAnnotationTerms__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6351:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:6352:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:6352:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:6353:3: ruleVLSAnnotation
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


    // $ANTLR start "rule__VLSOtherDeclaration__TypeAssignment_2"
    // InternalVampireLanguage.g:6362:1: rule__VLSOtherDeclaration__TypeAssignment_2 : ( ruleVLSTypeDef ) ;
    public final void rule__VLSOtherDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6366:1: ( ( ruleVLSTypeDef ) )
            // InternalVampireLanguage.g:6367:2: ( ruleVLSTypeDef )
            {
            // InternalVampireLanguage.g:6367:2: ( ruleVLSTypeDef )
            // InternalVampireLanguage.g:6368:3: ruleVLSTypeDef
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


    // $ANTLR start "rule__VLSVariableDeclaration__TypeAssignment_2"
    // InternalVampireLanguage.g:6377:1: rule__VLSVariableDeclaration__TypeAssignment_2 : ( ruleVLSTypeDef ) ;
    public final void rule__VLSVariableDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6381:1: ( ( ruleVLSTypeDef ) )
            // InternalVampireLanguage.g:6382:2: ( ruleVLSTypeDef )
            {
            // InternalVampireLanguage.g:6382:2: ( ruleVLSTypeDef )
            // InternalVampireLanguage.g:6383:3: ruleVLSTypeDef
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
    // InternalVampireLanguage.g:6392:1: rule__VLSTypeDef__TypeSigAssignment_0 : ( ruleVLSUnitaryTerm ) ;
    public final void rule__VLSTypeDef__TypeSigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6396:1: ( ( ruleVLSUnitaryTerm ) )
            // InternalVampireLanguage.g:6397:2: ( ruleVLSUnitaryTerm )
            {
            // InternalVampireLanguage.g:6397:2: ( ruleVLSUnitaryTerm )
            // InternalVampireLanguage.g:6398:3: ruleVLSUnitaryTerm
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
    // InternalVampireLanguage.g:6407:1: rule__VLSTypeDef__MapsToAssignment_1_1 : ( ruleVLSAtomicConstant ) ;
    public final void rule__VLSTypeDef__MapsToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6411:1: ( ( ruleVLSAtomicConstant ) )
            // InternalVampireLanguage.g:6412:2: ( ruleVLSAtomicConstant )
            {
            // InternalVampireLanguage.g:6412:2: ( ruleVLSAtomicConstant )
            // InternalVampireLanguage.g:6413:3: ruleVLSAtomicConstant
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
    // InternalVampireLanguage.g:6422:1: rule__VLSUnitaryTerm__InitTypeAssignment_0 : ( ruleVLSAtomic ) ;
    public final void rule__VLSUnitaryTerm__InitTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6426:1: ( ( ruleVLSAtomic ) )
            // InternalVampireLanguage.g:6427:2: ( ruleVLSAtomic )
            {
            // InternalVampireLanguage.g:6427:2: ( ruleVLSAtomic )
            // InternalVampireLanguage.g:6428:3: ruleVLSAtomic
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
    // InternalVampireLanguage.g:6437:1: rule__VLSUnitaryTerm__NextTypeAssignment_1_1 : ( ruleVLSAtomicConstant ) ;
    public final void rule__VLSUnitaryTerm__NextTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6441:1: ( ( ruleVLSAtomicConstant ) )
            // InternalVampireLanguage.g:6442:2: ( ruleVLSAtomicConstant )
            {
            // InternalVampireLanguage.g:6442:2: ( ruleVLSAtomicConstant )
            // InternalVampireLanguage.g:6443:3: ruleVLSAtomicConstant
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
    // InternalVampireLanguage.g:6452:1: rule__VLSBinary__RightAssignment_1_0_1 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6456:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:6457:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:6457:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:6458:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:6467:1: rule__VLSBinary__RightAssignment_1_1_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6471:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:6472:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:6472:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:6473:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:6482:1: rule__VLSBinary__RightAssignment_1_2_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6486:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:6487:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:6487:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:6488:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:6497:1: rule__VLSUniversalQuantifier__VariablesAssignment_1_2 : ( ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0 ) ) ;
    public final void rule__VLSUniversalQuantifier__VariablesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6501:1: ( ( ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0 ) ) )
            // InternalVampireLanguage.g:6502:2: ( ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0 ) )
            {
            // InternalVampireLanguage.g:6502:2: ( ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0 ) )
            // InternalVampireLanguage.g:6503:3: ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAlternatives_1_2_0()); 
            // InternalVampireLanguage.g:6504:3: ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0 )
            // InternalVampireLanguage.g:6504:4: rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0
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
    // InternalVampireLanguage.g:6512:1: rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 : ( ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0 ) ) ;
    public final void rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6516:1: ( ( ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0 ) ) )
            // InternalVampireLanguage.g:6517:2: ( ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0 ) )
            {
            // InternalVampireLanguage.g:6517:2: ( ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0 ) )
            // InternalVampireLanguage.g:6518:3: ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAlternatives_1_3_1_0()); 
            // InternalVampireLanguage.g:6519:3: ( rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0 )
            // InternalVampireLanguage.g:6519:4: rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0
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
    // InternalVampireLanguage.g:6527:1: rule__VLSUniversalQuantifier__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSUniversalQuantifier__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6531:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:6532:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:6532:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:6533:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:6542:1: rule__VLSExistentialQuantifier__VariablesAssignment_1_2 : ( ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0 ) ) ;
    public final void rule__VLSExistentialQuantifier__VariablesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6546:1: ( ( ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0 ) ) )
            // InternalVampireLanguage.g:6547:2: ( ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0 ) )
            {
            // InternalVampireLanguage.g:6547:2: ( ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0 ) )
            // InternalVampireLanguage.g:6548:3: ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAlternatives_1_2_0()); 
            // InternalVampireLanguage.g:6549:3: ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0 )
            // InternalVampireLanguage.g:6549:4: rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0
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
    // InternalVampireLanguage.g:6557:1: rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 : ( ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0 ) ) ;
    public final void rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6561:1: ( ( ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0 ) ) )
            // InternalVampireLanguage.g:6562:2: ( ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0 ) )
            {
            // InternalVampireLanguage.g:6562:2: ( ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0 ) )
            // InternalVampireLanguage.g:6563:3: ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAlternatives_1_3_1_0()); 
            // InternalVampireLanguage.g:6564:3: ( rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0 )
            // InternalVampireLanguage.g:6564:4: rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0
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
    // InternalVampireLanguage.g:6572:1: rule__VLSExistentialQuantifier__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSExistentialQuantifier__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6576:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:6577:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:6577:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:6578:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:6587:1: rule__VLSUnaryNegation__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSUnaryNegation__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6591:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:6592:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:6592:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:6593:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:6602:1: rule__VLSUnaryInfix__RightAssignment_1_1 : ( ruleVLSAtomic ) ;
    public final void rule__VLSUnaryInfix__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6606:1: ( ( ruleVLSAtomic ) )
            // InternalVampireLanguage.g:6607:2: ( ruleVLSAtomic )
            {
            // InternalVampireLanguage.g:6607:2: ( ruleVLSAtomic )
            // InternalVampireLanguage.g:6608:3: ruleVLSAtomic
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
    // InternalVampireLanguage.g:6617:1: rule__VLSAtomicConstant__NameAssignment_0_1 : ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) ) ;
    public final void rule__VLSAtomicConstant__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6621:1: ( ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) ) )
            // InternalVampireLanguage.g:6622:2: ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) )
            {
            // InternalVampireLanguage.g:6622:2: ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) )
            // InternalVampireLanguage.g:6623:3: ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getNameAlternatives_0_1_0()); 
            // InternalVampireLanguage.g:6624:3: ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 )
            // InternalVampireLanguage.g:6624:4: rule__VLSAtomicConstant__NameAlternatives_0_1_0
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
    // InternalVampireLanguage.g:6632:1: rule__VLSAtomicFunction__ConstantAssignment_0_1 : ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) ) ;
    public final void rule__VLSAtomicFunction__ConstantAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6636:1: ( ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) ) )
            // InternalVampireLanguage.g:6637:2: ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) )
            {
            // InternalVampireLanguage.g:6637:2: ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) )
            // InternalVampireLanguage.g:6638:3: ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getConstantAlternatives_0_1_0()); 
            // InternalVampireLanguage.g:6639:3: ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 )
            // InternalVampireLanguage.g:6639:4: rule__VLSAtomicFunction__ConstantAlternatives_0_1_0
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
    // InternalVampireLanguage.g:6647:1: rule__VLSAtomicFunction__TermsAssignment_0_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6651:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:6652:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:6652:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:6653:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:6662:1: rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_0_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6666:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:6667:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:6667:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:6668:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:6677:1: rule__VLSAtomicFunction__NameAssignment_1_1 : ( ( '$less' ) ) ;
    public final void rule__VLSAtomicFunction__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6681:1: ( ( ( '$less' ) ) )
            // InternalVampireLanguage.g:6682:2: ( ( '$less' ) )
            {
            // InternalVampireLanguage.g:6682:2: ( ( '$less' ) )
            // InternalVampireLanguage.g:6683:3: ( '$less' )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getNameLessKeyword_1_1_0()); 
            // InternalVampireLanguage.g:6684:3: ( '$less' )
            // InternalVampireLanguage.g:6685:4: '$less'
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
    // InternalVampireLanguage.g:6696:1: rule__VLSAtomicFunction__TermsAssignment_1_3 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6700:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:6701:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:6701:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:6702:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:6711:1: rule__VLSAtomicFunction__TermsAssignment_1_5 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6715:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:6716:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:6716:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:6717:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:6726:1: rule__VLSVariable__NameAssignment : ( RULE_UPPER_WORD_ID ) ;
    public final void rule__VLSVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6730:1: ( ( RULE_UPPER_WORD_ID ) )
            // InternalVampireLanguage.g:6731:2: ( RULE_UPPER_WORD_ID )
            {
            // InternalVampireLanguage.g:6731:2: ( RULE_UPPER_WORD_ID )
            // InternalVampireLanguage.g:6732:3: RULE_UPPER_WORD_ID
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
    // InternalVampireLanguage.g:6741:1: rule__VLSFunctionAsTerm__FunctorAssignment_0 : ( ( rule__VLSFunctionAsTerm__FunctorAlternatives_0_0 ) ) ;
    public final void rule__VLSFunctionAsTerm__FunctorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6745:1: ( ( ( rule__VLSFunctionAsTerm__FunctorAlternatives_0_0 ) ) )
            // InternalVampireLanguage.g:6746:2: ( ( rule__VLSFunctionAsTerm__FunctorAlternatives_0_0 ) )
            {
            // InternalVampireLanguage.g:6746:2: ( ( rule__VLSFunctionAsTerm__FunctorAlternatives_0_0 ) )
            // InternalVampireLanguage.g:6747:3: ( rule__VLSFunctionAsTerm__FunctorAlternatives_0_0 )
            {
             before(grammarAccess.getVLSFunctionAsTermAccess().getFunctorAlternatives_0_0()); 
            // InternalVampireLanguage.g:6748:3: ( rule__VLSFunctionAsTerm__FunctorAlternatives_0_0 )
            // InternalVampireLanguage.g:6748:4: rule__VLSFunctionAsTerm__FunctorAlternatives_0_0
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
    // InternalVampireLanguage.g:6756:1: rule__VLSFunctionAsTerm__TermsAssignment_1_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSFunctionAsTerm__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6760:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:6761:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:6761:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:6762:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:6771:1: rule__VLSFunctionAsTerm__TermsAssignment_1_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSFunctionAsTerm__TermsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6775:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:6776:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:6776:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:6777:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:6786:1: rule__VLSDefinedTerm__ValueAssignment_0_1 : ( RULE_SIGNED_LITERAL ) ;
    public final void rule__VLSDefinedTerm__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6790:1: ( ( RULE_SIGNED_LITERAL ) )
            // InternalVampireLanguage.g:6791:2: ( RULE_SIGNED_LITERAL )
            {
            // InternalVampireLanguage.g:6791:2: ( RULE_SIGNED_LITERAL )
            // InternalVampireLanguage.g:6792:3: RULE_SIGNED_LITERAL
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
    // InternalVampireLanguage.g:6801:1: rule__VLSDefinedTerm__ValueAssignment_1_1 : ( RULE_DOUBLE_QUOTE ) ;
    public final void rule__VLSDefinedTerm__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:6805:1: ( ( RULE_DOUBLE_QUOTE ) )
            // InternalVampireLanguage.g:6806:2: ( RULE_DOUBLE_QUOTE )
            {
            // InternalVampireLanguage.g:6806:2: ( RULE_DOUBLE_QUOTE )
            // InternalVampireLanguage.g:6807:3: RULE_DOUBLE_QUOTE
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
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\2\uffff\26\1\1\uffff";
    static final String dfa_3s = "\1\4\1\uffff\23\67\3\70\1\uffff";
    static final String dfa_4s = "\1\120\1\uffff\26\115\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\26\uffff\1\2";
    static final String dfa_6s = "\31\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\1\1\3\1\4\1\5\2\uffff\1\27\1\1\13\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\20\uffff\1\1\20\uffff\3\1\3\uffff\1\25\1\26\1\1",
            "",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\2\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\2\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\2\1\3\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
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
            return "1119:1: rule__VLSTffTerm__Alternatives : ( ( ruleVLSTerm ) | ( ruleVLSDeclaration ) );";
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
            return "1397:1: rule__VLSAtomic__Alternatives : ( ( ruleVLSAtomicConstant ) | ( ruleVLSAtomicFunction ) | ( ruleVLSVariable ) | ( ruleVLSDefinedTerm ) );";
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
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000007FFF0019F0L,0x000000000001C000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000007FFF0001D0L,0x000000000000C000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0104000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003800L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000007FFF0001D0L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000007FFF0001D0L,0x0000000000010000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000020L});

}