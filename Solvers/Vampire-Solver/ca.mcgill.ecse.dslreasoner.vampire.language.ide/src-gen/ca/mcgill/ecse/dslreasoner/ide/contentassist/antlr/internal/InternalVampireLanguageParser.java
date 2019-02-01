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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LOWER_WORD_ID", "RULE_SINGLE_QUOTE", "RULE_LITERAL", "RULE_SIGNED_LITERAL", "RULE_DOLLAR_ID", "RULE_DOUBLE_DOLLAR_ID", "RULE_SINGLE_COMMENT", "RULE_UPPER_WORD_ID", "RULE_SIGNED_REAL_ID", "RULE_SIGNED_RAT_ID", "RULE_DOUBLE_QUOTE", "RULE_ALPHA_NUMERIC", "RULE_SIGN", "RULE_INT", "RULE_UNSIGNED_REAL_FRAC_ID", "RULE_UNSIGNED_REAL_EXP_ID", "RULE_UNSIGNED_RAT_ID", "RULE_ID", "RULE_ANY_OTHER", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'axiom'", "'conjecture'", "'hypothesis'", "'definition'", "'assumption'", "'lemma'", "'theorem'", "'corollary'", "'negated_conjecture'", "'plain'", "'type'", "'fi_domain'", "'fi_functors'", "'fi_predicates'", "'unknown'", "'include('", "',['", "']'", "','", "'%'", "'Satisfiable!'", "'fof'", "'('", "')'", "'.'", "'tff'", "'['", "'<=>'", "'=>'", "'<='", "'<~>'", "'~|'", "'~&'", "'&'", "'|'", "'!'", "':'", "'?'", "'~'", "'!='", "'='", "':='", "'$true'", "'$false'", "'$less'"
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
    public static final int T__70=70;
    public static final int T__71=71;
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

                if ( (LA1_0==42||(LA1_0>=46 && LA1_0<=48)||LA1_0==52) ) {
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


    // $ANTLR start "entryRuleVLSConfirmations"
    // InternalVampireLanguage.g:153:1: entryRuleVLSConfirmations : ruleVLSConfirmations EOF ;
    public final void entryRuleVLSConfirmations() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:154:1: ( ruleVLSConfirmations EOF )
            // InternalVampireLanguage.g:155:1: ruleVLSConfirmations EOF
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
    // InternalVampireLanguage.g:162:1: ruleVLSConfirmations : ( ruleVLSSatisfiable ) ;
    public final void ruleVLSConfirmations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:166:2: ( ( ruleVLSSatisfiable ) )
            // InternalVampireLanguage.g:167:2: ( ruleVLSSatisfiable )
            {
            // InternalVampireLanguage.g:167:2: ( ruleVLSSatisfiable )
            // InternalVampireLanguage.g:168:3: ruleVLSSatisfiable
            {
             before(grammarAccess.getVLSConfirmationsAccess().getVLSSatisfiableParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleVLSSatisfiable();

            state._fsp--;

             after(grammarAccess.getVLSConfirmationsAccess().getVLSSatisfiableParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleVLSSatisfiable"
    // InternalVampireLanguage.g:178:1: entryRuleVLSSatisfiable : ruleVLSSatisfiable EOF ;
    public final void entryRuleVLSSatisfiable() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:179:1: ( ruleVLSSatisfiable EOF )
            // InternalVampireLanguage.g:180:1: ruleVLSSatisfiable EOF
            {
             before(grammarAccess.getVLSSatisfiableRule()); 
            pushFollow(FOLLOW_1);
            ruleVLSSatisfiable();

            state._fsp--;

             after(grammarAccess.getVLSSatisfiableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVLSSatisfiable"


    // $ANTLR start "ruleVLSSatisfiable"
    // InternalVampireLanguage.g:187:1: ruleVLSSatisfiable : ( ( rule__VLSSatisfiable__Group__0 ) ) ;
    public final void ruleVLSSatisfiable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:191:2: ( ( ( rule__VLSSatisfiable__Group__0 ) ) )
            // InternalVampireLanguage.g:192:2: ( ( rule__VLSSatisfiable__Group__0 ) )
            {
            // InternalVampireLanguage.g:192:2: ( ( rule__VLSSatisfiable__Group__0 ) )
            // InternalVampireLanguage.g:193:3: ( rule__VLSSatisfiable__Group__0 )
            {
             before(grammarAccess.getVLSSatisfiableAccess().getGroup()); 
            // InternalVampireLanguage.g:194:3: ( rule__VLSSatisfiable__Group__0 )
            // InternalVampireLanguage.g:194:4: rule__VLSSatisfiable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VLSSatisfiable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVLSSatisfiableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVLSSatisfiable"


    // $ANTLR start "entryRuleVLSFofFormula"
    // InternalVampireLanguage.g:203:1: entryRuleVLSFofFormula : ruleVLSFofFormula EOF ;
    public final void entryRuleVLSFofFormula() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:204:1: ( ruleVLSFofFormula EOF )
            // InternalVampireLanguage.g:205:1: ruleVLSFofFormula EOF
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
    // InternalVampireLanguage.g:212:1: ruleVLSFofFormula : ( ( rule__VLSFofFormula__Group__0 ) ) ;
    public final void ruleVLSFofFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:216:2: ( ( ( rule__VLSFofFormula__Group__0 ) ) )
            // InternalVampireLanguage.g:217:2: ( ( rule__VLSFofFormula__Group__0 ) )
            {
            // InternalVampireLanguage.g:217:2: ( ( rule__VLSFofFormula__Group__0 ) )
            // InternalVampireLanguage.g:218:3: ( rule__VLSFofFormula__Group__0 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getGroup()); 
            // InternalVampireLanguage.g:219:3: ( rule__VLSFofFormula__Group__0 )
            // InternalVampireLanguage.g:219:4: rule__VLSFofFormula__Group__0
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
    // InternalVampireLanguage.g:228:1: entryRuleVLSTffFormula : ruleVLSTffFormula EOF ;
    public final void entryRuleVLSTffFormula() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:229:1: ( ruleVLSTffFormula EOF )
            // InternalVampireLanguage.g:230:1: ruleVLSTffFormula EOF
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
    // InternalVampireLanguage.g:237:1: ruleVLSTffFormula : ( ( rule__VLSTffFormula__Group__0 ) ) ;
    public final void ruleVLSTffFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:241:2: ( ( ( rule__VLSTffFormula__Group__0 ) ) )
            // InternalVampireLanguage.g:242:2: ( ( rule__VLSTffFormula__Group__0 ) )
            {
            // InternalVampireLanguage.g:242:2: ( ( rule__VLSTffFormula__Group__0 ) )
            // InternalVampireLanguage.g:243:3: ( rule__VLSTffFormula__Group__0 )
            {
             before(grammarAccess.getVLSTffFormulaAccess().getGroup()); 
            // InternalVampireLanguage.g:244:3: ( rule__VLSTffFormula__Group__0 )
            // InternalVampireLanguage.g:244:4: rule__VLSTffFormula__Group__0
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


    // $ANTLR start "entryRuleVLSRole"
    // InternalVampireLanguage.g:253:1: entryRuleVLSRole : ruleVLSRole EOF ;
    public final void entryRuleVLSRole() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:254:1: ( ruleVLSRole EOF )
            // InternalVampireLanguage.g:255:1: ruleVLSRole EOF
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
    // InternalVampireLanguage.g:262:1: ruleVLSRole : ( ( rule__VLSRole__Alternatives ) ) ;
    public final void ruleVLSRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:266:2: ( ( ( rule__VLSRole__Alternatives ) ) )
            // InternalVampireLanguage.g:267:2: ( ( rule__VLSRole__Alternatives ) )
            {
            // InternalVampireLanguage.g:267:2: ( ( rule__VLSRole__Alternatives ) )
            // InternalVampireLanguage.g:268:3: ( rule__VLSRole__Alternatives )
            {
             before(grammarAccess.getVLSRoleAccess().getAlternatives()); 
            // InternalVampireLanguage.g:269:3: ( rule__VLSRole__Alternatives )
            // InternalVampireLanguage.g:269:4: rule__VLSRole__Alternatives
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
    // InternalVampireLanguage.g:278:1: entryRuleVLSAnnotation : ruleVLSAnnotation EOF ;
    public final void entryRuleVLSAnnotation() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:279:1: ( ruleVLSAnnotation EOF )
            // InternalVampireLanguage.g:280:1: ruleVLSAnnotation EOF
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
    // InternalVampireLanguage.g:287:1: ruleVLSAnnotation : ( ( rule__VLSAnnotation__Group__0 ) ) ;
    public final void ruleVLSAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:291:2: ( ( ( rule__VLSAnnotation__Group__0 ) ) )
            // InternalVampireLanguage.g:292:2: ( ( rule__VLSAnnotation__Group__0 ) )
            {
            // InternalVampireLanguage.g:292:2: ( ( rule__VLSAnnotation__Group__0 ) )
            // InternalVampireLanguage.g:293:3: ( rule__VLSAnnotation__Group__0 )
            {
             before(grammarAccess.getVLSAnnotationAccess().getGroup()); 
            // InternalVampireLanguage.g:294:3: ( rule__VLSAnnotation__Group__0 )
            // InternalVampireLanguage.g:294:4: rule__VLSAnnotation__Group__0
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
    // InternalVampireLanguage.g:303:1: entryRuleVLSAnnotationTerms : ruleVLSAnnotationTerms EOF ;
    public final void entryRuleVLSAnnotationTerms() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:304:1: ( ruleVLSAnnotationTerms EOF )
            // InternalVampireLanguage.g:305:1: ruleVLSAnnotationTerms EOF
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
    // InternalVampireLanguage.g:312:1: ruleVLSAnnotationTerms : ( ( rule__VLSAnnotationTerms__Group__0 ) ) ;
    public final void ruleVLSAnnotationTerms() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:316:2: ( ( ( rule__VLSAnnotationTerms__Group__0 ) ) )
            // InternalVampireLanguage.g:317:2: ( ( rule__VLSAnnotationTerms__Group__0 ) )
            {
            // InternalVampireLanguage.g:317:2: ( ( rule__VLSAnnotationTerms__Group__0 ) )
            // InternalVampireLanguage.g:318:3: ( rule__VLSAnnotationTerms__Group__0 )
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getGroup()); 
            // InternalVampireLanguage.g:319:3: ( rule__VLSAnnotationTerms__Group__0 )
            // InternalVampireLanguage.g:319:4: rule__VLSAnnotationTerms__Group__0
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
    // InternalVampireLanguage.g:328:1: entryRuleVLSTerm : ruleVLSTerm EOF ;
    public final void entryRuleVLSTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:329:1: ( ruleVLSTerm EOF )
            // InternalVampireLanguage.g:330:1: ruleVLSTerm EOF
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
    // InternalVampireLanguage.g:337:1: ruleVLSTerm : ( ruleVLSBinary ) ;
    public final void ruleVLSTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:341:2: ( ( ruleVLSBinary ) )
            // InternalVampireLanguage.g:342:2: ( ruleVLSBinary )
            {
            // InternalVampireLanguage.g:342:2: ( ruleVLSBinary )
            // InternalVampireLanguage.g:343:3: ruleVLSBinary
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
    // InternalVampireLanguage.g:353:1: entryRuleVLSBinary : ruleVLSBinary EOF ;
    public final void entryRuleVLSBinary() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:354:1: ( ruleVLSBinary EOF )
            // InternalVampireLanguage.g:355:1: ruleVLSBinary EOF
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
    // InternalVampireLanguage.g:362:1: ruleVLSBinary : ( ( rule__VLSBinary__Group__0 ) ) ;
    public final void ruleVLSBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:366:2: ( ( ( rule__VLSBinary__Group__0 ) ) )
            // InternalVampireLanguage.g:367:2: ( ( rule__VLSBinary__Group__0 ) )
            {
            // InternalVampireLanguage.g:367:2: ( ( rule__VLSBinary__Group__0 ) )
            // InternalVampireLanguage.g:368:3: ( rule__VLSBinary__Group__0 )
            {
             before(grammarAccess.getVLSBinaryAccess().getGroup()); 
            // InternalVampireLanguage.g:369:3: ( rule__VLSBinary__Group__0 )
            // InternalVampireLanguage.g:369:4: rule__VLSBinary__Group__0
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
    // InternalVampireLanguage.g:378:1: entryRuleVLSUnitaryFormula : ruleVLSUnitaryFormula EOF ;
    public final void entryRuleVLSUnitaryFormula() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:379:1: ( ruleVLSUnitaryFormula EOF )
            // InternalVampireLanguage.g:380:1: ruleVLSUnitaryFormula EOF
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
    // InternalVampireLanguage.g:387:1: ruleVLSUnitaryFormula : ( ( rule__VLSUnitaryFormula__Alternatives ) ) ;
    public final void ruleVLSUnitaryFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:391:2: ( ( ( rule__VLSUnitaryFormula__Alternatives ) ) )
            // InternalVampireLanguage.g:392:2: ( ( rule__VLSUnitaryFormula__Alternatives ) )
            {
            // InternalVampireLanguage.g:392:2: ( ( rule__VLSUnitaryFormula__Alternatives ) )
            // InternalVampireLanguage.g:393:3: ( rule__VLSUnitaryFormula__Alternatives )
            {
             before(grammarAccess.getVLSUnitaryFormulaAccess().getAlternatives()); 
            // InternalVampireLanguage.g:394:3: ( rule__VLSUnitaryFormula__Alternatives )
            // InternalVampireLanguage.g:394:4: rule__VLSUnitaryFormula__Alternatives
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
    // InternalVampireLanguage.g:403:1: entryRuleVLSUniversalQuantifier : ruleVLSUniversalQuantifier EOF ;
    public final void entryRuleVLSUniversalQuantifier() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:404:1: ( ruleVLSUniversalQuantifier EOF )
            // InternalVampireLanguage.g:405:1: ruleVLSUniversalQuantifier EOF
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
    // InternalVampireLanguage.g:412:1: ruleVLSUniversalQuantifier : ( ( rule__VLSUniversalQuantifier__Group__0 ) ) ;
    public final void ruleVLSUniversalQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:416:2: ( ( ( rule__VLSUniversalQuantifier__Group__0 ) ) )
            // InternalVampireLanguage.g:417:2: ( ( rule__VLSUniversalQuantifier__Group__0 ) )
            {
            // InternalVampireLanguage.g:417:2: ( ( rule__VLSUniversalQuantifier__Group__0 ) )
            // InternalVampireLanguage.g:418:3: ( rule__VLSUniversalQuantifier__Group__0 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup()); 
            // InternalVampireLanguage.g:419:3: ( rule__VLSUniversalQuantifier__Group__0 )
            // InternalVampireLanguage.g:419:4: rule__VLSUniversalQuantifier__Group__0
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
    // InternalVampireLanguage.g:428:1: entryRuleVLSExistentialQuantifier : ruleVLSExistentialQuantifier EOF ;
    public final void entryRuleVLSExistentialQuantifier() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:429:1: ( ruleVLSExistentialQuantifier EOF )
            // InternalVampireLanguage.g:430:1: ruleVLSExistentialQuantifier EOF
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
    // InternalVampireLanguage.g:437:1: ruleVLSExistentialQuantifier : ( ( rule__VLSExistentialQuantifier__Group__0 ) ) ;
    public final void ruleVLSExistentialQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:441:2: ( ( ( rule__VLSExistentialQuantifier__Group__0 ) ) )
            // InternalVampireLanguage.g:442:2: ( ( rule__VLSExistentialQuantifier__Group__0 ) )
            {
            // InternalVampireLanguage.g:442:2: ( ( rule__VLSExistentialQuantifier__Group__0 ) )
            // InternalVampireLanguage.g:443:3: ( rule__VLSExistentialQuantifier__Group__0 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup()); 
            // InternalVampireLanguage.g:444:3: ( rule__VLSExistentialQuantifier__Group__0 )
            // InternalVampireLanguage.g:444:4: rule__VLSExistentialQuantifier__Group__0
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
    // InternalVampireLanguage.g:453:1: entryRuleVLSUnaryNegation : ruleVLSUnaryNegation EOF ;
    public final void entryRuleVLSUnaryNegation() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:454:1: ( ruleVLSUnaryNegation EOF )
            // InternalVampireLanguage.g:455:1: ruleVLSUnaryNegation EOF
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
    // InternalVampireLanguage.g:462:1: ruleVLSUnaryNegation : ( ( rule__VLSUnaryNegation__Group__0 ) ) ;
    public final void ruleVLSUnaryNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:466:2: ( ( ( rule__VLSUnaryNegation__Group__0 ) ) )
            // InternalVampireLanguage.g:467:2: ( ( rule__VLSUnaryNegation__Group__0 ) )
            {
            // InternalVampireLanguage.g:467:2: ( ( rule__VLSUnaryNegation__Group__0 ) )
            // InternalVampireLanguage.g:468:3: ( rule__VLSUnaryNegation__Group__0 )
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getGroup()); 
            // InternalVampireLanguage.g:469:3: ( rule__VLSUnaryNegation__Group__0 )
            // InternalVampireLanguage.g:469:4: rule__VLSUnaryNegation__Group__0
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
    // InternalVampireLanguage.g:478:1: entryRuleVLSUnaryInfix : ruleVLSUnaryInfix EOF ;
    public final void entryRuleVLSUnaryInfix() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:479:1: ( ruleVLSUnaryInfix EOF )
            // InternalVampireLanguage.g:480:1: ruleVLSUnaryInfix EOF
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
    // InternalVampireLanguage.g:487:1: ruleVLSUnaryInfix : ( ( rule__VLSUnaryInfix__Group__0 ) ) ;
    public final void ruleVLSUnaryInfix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:491:2: ( ( ( rule__VLSUnaryInfix__Group__0 ) ) )
            // InternalVampireLanguage.g:492:2: ( ( rule__VLSUnaryInfix__Group__0 ) )
            {
            // InternalVampireLanguage.g:492:2: ( ( rule__VLSUnaryInfix__Group__0 ) )
            // InternalVampireLanguage.g:493:3: ( rule__VLSUnaryInfix__Group__0 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getGroup()); 
            // InternalVampireLanguage.g:494:3: ( rule__VLSUnaryInfix__Group__0 )
            // InternalVampireLanguage.g:494:4: rule__VLSUnaryInfix__Group__0
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
    // InternalVampireLanguage.g:503:1: entryRuleVLSAtomic : ruleVLSAtomic EOF ;
    public final void entryRuleVLSAtomic() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:504:1: ( ruleVLSAtomic EOF )
            // InternalVampireLanguage.g:505:1: ruleVLSAtomic EOF
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
    // InternalVampireLanguage.g:512:1: ruleVLSAtomic : ( ( rule__VLSAtomic__Alternatives ) ) ;
    public final void ruleVLSAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:516:2: ( ( ( rule__VLSAtomic__Alternatives ) ) )
            // InternalVampireLanguage.g:517:2: ( ( rule__VLSAtomic__Alternatives ) )
            {
            // InternalVampireLanguage.g:517:2: ( ( rule__VLSAtomic__Alternatives ) )
            // InternalVampireLanguage.g:518:3: ( rule__VLSAtomic__Alternatives )
            {
             before(grammarAccess.getVLSAtomicAccess().getAlternatives()); 
            // InternalVampireLanguage.g:519:3: ( rule__VLSAtomic__Alternatives )
            // InternalVampireLanguage.g:519:4: rule__VLSAtomic__Alternatives
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
    // InternalVampireLanguage.g:528:1: entryRuleVLSAtomicConstant : ruleVLSAtomicConstant EOF ;
    public final void entryRuleVLSAtomicConstant() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:529:1: ( ruleVLSAtomicConstant EOF )
            // InternalVampireLanguage.g:530:1: ruleVLSAtomicConstant EOF
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
    // InternalVampireLanguage.g:537:1: ruleVLSAtomicConstant : ( ( rule__VLSAtomicConstant__Alternatives ) ) ;
    public final void ruleVLSAtomicConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:541:2: ( ( ( rule__VLSAtomicConstant__Alternatives ) ) )
            // InternalVampireLanguage.g:542:2: ( ( rule__VLSAtomicConstant__Alternatives ) )
            {
            // InternalVampireLanguage.g:542:2: ( ( rule__VLSAtomicConstant__Alternatives ) )
            // InternalVampireLanguage.g:543:3: ( rule__VLSAtomicConstant__Alternatives )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getAlternatives()); 
            // InternalVampireLanguage.g:544:3: ( rule__VLSAtomicConstant__Alternatives )
            // InternalVampireLanguage.g:544:4: rule__VLSAtomicConstant__Alternatives
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
    // InternalVampireLanguage.g:553:1: entryRuleVLSAtomicFunction : ruleVLSAtomicFunction EOF ;
    public final void entryRuleVLSAtomicFunction() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:554:1: ( ruleVLSAtomicFunction EOF )
            // InternalVampireLanguage.g:555:1: ruleVLSAtomicFunction EOF
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
    // InternalVampireLanguage.g:562:1: ruleVLSAtomicFunction : ( ( rule__VLSAtomicFunction__Alternatives ) ) ;
    public final void ruleVLSAtomicFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:566:2: ( ( ( rule__VLSAtomicFunction__Alternatives ) ) )
            // InternalVampireLanguage.g:567:2: ( ( rule__VLSAtomicFunction__Alternatives ) )
            {
            // InternalVampireLanguage.g:567:2: ( ( rule__VLSAtomicFunction__Alternatives ) )
            // InternalVampireLanguage.g:568:3: ( rule__VLSAtomicFunction__Alternatives )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getAlternatives()); 
            // InternalVampireLanguage.g:569:3: ( rule__VLSAtomicFunction__Alternatives )
            // InternalVampireLanguage.g:569:4: rule__VLSAtomicFunction__Alternatives
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
    // InternalVampireLanguage.g:578:1: entryRuleVLSVariable : ruleVLSVariable EOF ;
    public final void entryRuleVLSVariable() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:579:1: ( ruleVLSVariable EOF )
            // InternalVampireLanguage.g:580:1: ruleVLSVariable EOF
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
    // InternalVampireLanguage.g:587:1: ruleVLSVariable : ( ( rule__VLSVariable__NameAssignment ) ) ;
    public final void ruleVLSVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:591:2: ( ( ( rule__VLSVariable__NameAssignment ) ) )
            // InternalVampireLanguage.g:592:2: ( ( rule__VLSVariable__NameAssignment ) )
            {
            // InternalVampireLanguage.g:592:2: ( ( rule__VLSVariable__NameAssignment ) )
            // InternalVampireLanguage.g:593:3: ( rule__VLSVariable__NameAssignment )
            {
             before(grammarAccess.getVLSVariableAccess().getNameAssignment()); 
            // InternalVampireLanguage.g:594:3: ( rule__VLSVariable__NameAssignment )
            // InternalVampireLanguage.g:594:4: rule__VLSVariable__NameAssignment
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
    // InternalVampireLanguage.g:603:1: entryRuleVLSFofTerm : ruleVLSFofTerm EOF ;
    public final void entryRuleVLSFofTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:604:1: ( ruleVLSFofTerm EOF )
            // InternalVampireLanguage.g:605:1: ruleVLSFofTerm EOF
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
    // InternalVampireLanguage.g:612:1: ruleVLSFofTerm : ( ( rule__VLSFofTerm__Alternatives ) ) ;
    public final void ruleVLSFofTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:616:2: ( ( ( rule__VLSFofTerm__Alternatives ) ) )
            // InternalVampireLanguage.g:617:2: ( ( rule__VLSFofTerm__Alternatives ) )
            {
            // InternalVampireLanguage.g:617:2: ( ( rule__VLSFofTerm__Alternatives ) )
            // InternalVampireLanguage.g:618:3: ( rule__VLSFofTerm__Alternatives )
            {
             before(grammarAccess.getVLSFofTermAccess().getAlternatives()); 
            // InternalVampireLanguage.g:619:3: ( rule__VLSFofTerm__Alternatives )
            // InternalVampireLanguage.g:619:4: rule__VLSFofTerm__Alternatives
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
    // InternalVampireLanguage.g:628:1: entryRuleVLSFunctionFof : ruleVLSFunctionFof EOF ;
    public final void entryRuleVLSFunctionFof() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:629:1: ( ruleVLSFunctionFof EOF )
            // InternalVampireLanguage.g:630:1: ruleVLSFunctionFof EOF
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
    // InternalVampireLanguage.g:637:1: ruleVLSFunctionFof : ( ( rule__VLSFunctionFof__Group__0 ) ) ;
    public final void ruleVLSFunctionFof() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:641:2: ( ( ( rule__VLSFunctionFof__Group__0 ) ) )
            // InternalVampireLanguage.g:642:2: ( ( rule__VLSFunctionFof__Group__0 ) )
            {
            // InternalVampireLanguage.g:642:2: ( ( rule__VLSFunctionFof__Group__0 ) )
            // InternalVampireLanguage.g:643:3: ( rule__VLSFunctionFof__Group__0 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getGroup()); 
            // InternalVampireLanguage.g:644:3: ( rule__VLSFunctionFof__Group__0 )
            // InternalVampireLanguage.g:644:4: rule__VLSFunctionFof__Group__0
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
    // InternalVampireLanguage.g:653:1: entryRuleVLSDefinedTerm : ruleVLSDefinedTerm EOF ;
    public final void entryRuleVLSDefinedTerm() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:654:1: ( ruleVLSDefinedTerm EOF )
            // InternalVampireLanguage.g:655:1: ruleVLSDefinedTerm EOF
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
    // InternalVampireLanguage.g:662:1: ruleVLSDefinedTerm : ( ( rule__VLSDefinedTerm__Alternatives ) ) ;
    public final void ruleVLSDefinedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:666:2: ( ( ( rule__VLSDefinedTerm__Alternatives ) ) )
            // InternalVampireLanguage.g:667:2: ( ( rule__VLSDefinedTerm__Alternatives ) )
            {
            // InternalVampireLanguage.g:667:2: ( ( rule__VLSDefinedTerm__Alternatives ) )
            // InternalVampireLanguage.g:668:3: ( rule__VLSDefinedTerm__Alternatives )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getAlternatives()); 
            // InternalVampireLanguage.g:669:3: ( rule__VLSDefinedTerm__Alternatives )
            // InternalVampireLanguage.g:669:4: rule__VLSDefinedTerm__Alternatives
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
    // InternalVampireLanguage.g:677:1: rule__VampireModel__Alternatives : ( ( ( rule__VampireModel__IncludesAssignment_0 ) ) | ( ( rule__VampireModel__CommentsAssignment_1 ) ) | ( ( rule__VampireModel__ConfirmationsAssignment_2 ) ) | ( ( rule__VampireModel__FormulasAssignment_3 ) ) | ( ( rule__VampireModel__TfformulasAssignment_4 ) ) );
    public final void rule__VampireModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:681:1: ( ( ( rule__VampireModel__IncludesAssignment_0 ) ) | ( ( rule__VampireModel__CommentsAssignment_1 ) ) | ( ( rule__VampireModel__ConfirmationsAssignment_2 ) ) | ( ( rule__VampireModel__FormulasAssignment_3 ) ) | ( ( rule__VampireModel__TfformulasAssignment_4 ) ) )
            int alt2=5;
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
            case 48:
                {
                alt2=4;
                }
                break;
            case 52:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalVampireLanguage.g:682:2: ( ( rule__VampireModel__IncludesAssignment_0 ) )
                    {
                    // InternalVampireLanguage.g:682:2: ( ( rule__VampireModel__IncludesAssignment_0 ) )
                    // InternalVampireLanguage.g:683:3: ( rule__VampireModel__IncludesAssignment_0 )
                    {
                     before(grammarAccess.getVampireModelAccess().getIncludesAssignment_0()); 
                    // InternalVampireLanguage.g:684:3: ( rule__VampireModel__IncludesAssignment_0 )
                    // InternalVampireLanguage.g:684:4: rule__VampireModel__IncludesAssignment_0
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
                    // InternalVampireLanguage.g:688:2: ( ( rule__VampireModel__CommentsAssignment_1 ) )
                    {
                    // InternalVampireLanguage.g:688:2: ( ( rule__VampireModel__CommentsAssignment_1 ) )
                    // InternalVampireLanguage.g:689:3: ( rule__VampireModel__CommentsAssignment_1 )
                    {
                     before(grammarAccess.getVampireModelAccess().getCommentsAssignment_1()); 
                    // InternalVampireLanguage.g:690:3: ( rule__VampireModel__CommentsAssignment_1 )
                    // InternalVampireLanguage.g:690:4: rule__VampireModel__CommentsAssignment_1
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
                    // InternalVampireLanguage.g:694:2: ( ( rule__VampireModel__ConfirmationsAssignment_2 ) )
                    {
                    // InternalVampireLanguage.g:694:2: ( ( rule__VampireModel__ConfirmationsAssignment_2 ) )
                    // InternalVampireLanguage.g:695:3: ( rule__VampireModel__ConfirmationsAssignment_2 )
                    {
                     before(grammarAccess.getVampireModelAccess().getConfirmationsAssignment_2()); 
                    // InternalVampireLanguage.g:696:3: ( rule__VampireModel__ConfirmationsAssignment_2 )
                    // InternalVampireLanguage.g:696:4: rule__VampireModel__ConfirmationsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__VampireModel__ConfirmationsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getVampireModelAccess().getConfirmationsAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:700:2: ( ( rule__VampireModel__FormulasAssignment_3 ) )
                    {
                    // InternalVampireLanguage.g:700:2: ( ( rule__VampireModel__FormulasAssignment_3 ) )
                    // InternalVampireLanguage.g:701:3: ( rule__VampireModel__FormulasAssignment_3 )
                    {
                     before(grammarAccess.getVampireModelAccess().getFormulasAssignment_3()); 
                    // InternalVampireLanguage.g:702:3: ( rule__VampireModel__FormulasAssignment_3 )
                    // InternalVampireLanguage.g:702:4: rule__VampireModel__FormulasAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__VampireModel__FormulasAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getVampireModelAccess().getFormulasAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:706:2: ( ( rule__VampireModel__TfformulasAssignment_4 ) )
                    {
                    // InternalVampireLanguage.g:706:2: ( ( rule__VampireModel__TfformulasAssignment_4 ) )
                    // InternalVampireLanguage.g:707:3: ( rule__VampireModel__TfformulasAssignment_4 )
                    {
                     before(grammarAccess.getVampireModelAccess().getTfformulasAssignment_4()); 
                    // InternalVampireLanguage.g:708:3: ( rule__VampireModel__TfformulasAssignment_4 )
                    // InternalVampireLanguage.g:708:4: rule__VampireModel__TfformulasAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__VampireModel__TfformulasAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getVampireModelAccess().getTfformulasAssignment_4()); 

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
    // InternalVampireLanguage.g:716:1: rule__VLSName__NameAlternatives_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_LITERAL ) | ( RULE_SIGNED_LITERAL ) );
    public final void rule__VLSName__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:720:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_LITERAL ) | ( RULE_SIGNED_LITERAL ) )
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
                    // InternalVampireLanguage.g:721:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:721:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:722:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSNameAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSNameAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:727:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:727:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:728:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSNameAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSNameAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:733:2: ( RULE_LITERAL )
                    {
                    // InternalVampireLanguage.g:733:2: ( RULE_LITERAL )
                    // InternalVampireLanguage.g:734:3: RULE_LITERAL
                    {
                     before(grammarAccess.getVLSNameAccess().getNameLITERALTerminalRuleCall_0_2()); 
                    match(input,RULE_LITERAL,FOLLOW_2); 
                     after(grammarAccess.getVLSNameAccess().getNameLITERALTerminalRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:739:2: ( RULE_SIGNED_LITERAL )
                    {
                    // InternalVampireLanguage.g:739:2: ( RULE_SIGNED_LITERAL )
                    // InternalVampireLanguage.g:740:3: RULE_SIGNED_LITERAL
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
    // InternalVampireLanguage.g:749:1: rule__VLSFofFormula__NameAlternatives_2_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SIGNED_LITERAL ) | ( RULE_SINGLE_QUOTE ) );
    public final void rule__VLSFofFormula__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:753:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SIGNED_LITERAL ) | ( RULE_SINGLE_QUOTE ) )
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
                    // InternalVampireLanguage.g:754:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:754:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:755:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSFofFormulaAccess().getNameLOWER_WORD_IDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFofFormulaAccess().getNameLOWER_WORD_IDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:760:2: ( RULE_SIGNED_LITERAL )
                    {
                    // InternalVampireLanguage.g:760:2: ( RULE_SIGNED_LITERAL )
                    // InternalVampireLanguage.g:761:3: RULE_SIGNED_LITERAL
                    {
                     before(grammarAccess.getVLSFofFormulaAccess().getNameSIGNED_LITERALTerminalRuleCall_2_0_1()); 
                    match(input,RULE_SIGNED_LITERAL,FOLLOW_2); 
                     after(grammarAccess.getVLSFofFormulaAccess().getNameSIGNED_LITERALTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:766:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:766:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:767:3: RULE_SINGLE_QUOTE
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


    // $ANTLR start "rule__VLSTffFormula__NameAlternatives_2_0"
    // InternalVampireLanguage.g:776:1: rule__VLSTffFormula__NameAlternatives_2_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SIGNED_LITERAL ) | ( RULE_SINGLE_QUOTE ) );
    public final void rule__VLSTffFormula__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:780:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SIGNED_LITERAL ) | ( RULE_SINGLE_QUOTE ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt5=1;
                }
                break;
            case RULE_SIGNED_LITERAL:
                {
                alt5=2;
                }
                break;
            case RULE_SINGLE_QUOTE:
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
                    // InternalVampireLanguage.g:781:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:781:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:782:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSTffFormulaAccess().getNameLOWER_WORD_IDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSTffFormulaAccess().getNameLOWER_WORD_IDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:787:2: ( RULE_SIGNED_LITERAL )
                    {
                    // InternalVampireLanguage.g:787:2: ( RULE_SIGNED_LITERAL )
                    // InternalVampireLanguage.g:788:3: RULE_SIGNED_LITERAL
                    {
                     before(grammarAccess.getVLSTffFormulaAccess().getNameSIGNED_LITERALTerminalRuleCall_2_0_1()); 
                    match(input,RULE_SIGNED_LITERAL,FOLLOW_2); 
                     after(grammarAccess.getVLSTffFormulaAccess().getNameSIGNED_LITERALTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:793:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:793:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:794:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSTffFormulaAccess().getNameSINGLE_QUOTETerminalRuleCall_2_0_2()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSTffFormulaAccess().getNameSINGLE_QUOTETerminalRuleCall_2_0_2()); 

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
    // $ANTLR end "rule__VLSTffFormula__NameAlternatives_2_0"


    // $ANTLR start "rule__VLSRole__Alternatives"
    // InternalVampireLanguage.g:803:1: rule__VLSRole__Alternatives : ( ( 'axiom' ) | ( 'conjecture' ) | ( 'hypothesis' ) | ( 'definition' ) | ( 'assumption' ) | ( 'lemma' ) | ( 'theorem' ) | ( 'corollary' ) | ( 'negated_conjecture' ) | ( 'plain' ) | ( 'type' ) | ( 'fi_domain' ) | ( 'fi_functors' ) | ( 'fi_predicates' ) | ( 'unknown' ) );
    public final void rule__VLSRole__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:807:1: ( ( 'axiom' ) | ( 'conjecture' ) | ( 'hypothesis' ) | ( 'definition' ) | ( 'assumption' ) | ( 'lemma' ) | ( 'theorem' ) | ( 'corollary' ) | ( 'negated_conjecture' ) | ( 'plain' ) | ( 'type' ) | ( 'fi_domain' ) | ( 'fi_functors' ) | ( 'fi_predicates' ) | ( 'unknown' ) )
            int alt6=15;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            case 30:
                {
                alt6=4;
                }
                break;
            case 31:
                {
                alt6=5;
                }
                break;
            case 32:
                {
                alt6=6;
                }
                break;
            case 33:
                {
                alt6=7;
                }
                break;
            case 34:
                {
                alt6=8;
                }
                break;
            case 35:
                {
                alt6=9;
                }
                break;
            case 36:
                {
                alt6=10;
                }
                break;
            case 37:
                {
                alt6=11;
                }
                break;
            case 38:
                {
                alt6=12;
                }
                break;
            case 39:
                {
                alt6=13;
                }
                break;
            case 40:
                {
                alt6=14;
                }
                break;
            case 41:
                {
                alt6=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalVampireLanguage.g:808:2: ( 'axiom' )
                    {
                    // InternalVampireLanguage.g:808:2: ( 'axiom' )
                    // InternalVampireLanguage.g:809:3: 'axiom'
                    {
                     before(grammarAccess.getVLSRoleAccess().getAxiomKeyword_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getAxiomKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:814:2: ( 'conjecture' )
                    {
                    // InternalVampireLanguage.g:814:2: ( 'conjecture' )
                    // InternalVampireLanguage.g:815:3: 'conjecture'
                    {
                     before(grammarAccess.getVLSRoleAccess().getConjectureKeyword_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getConjectureKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:820:2: ( 'hypothesis' )
                    {
                    // InternalVampireLanguage.g:820:2: ( 'hypothesis' )
                    // InternalVampireLanguage.g:821:3: 'hypothesis'
                    {
                     before(grammarAccess.getVLSRoleAccess().getHypothesisKeyword_2()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getHypothesisKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:826:2: ( 'definition' )
                    {
                    // InternalVampireLanguage.g:826:2: ( 'definition' )
                    // InternalVampireLanguage.g:827:3: 'definition'
                    {
                     before(grammarAccess.getVLSRoleAccess().getDefinitionKeyword_3()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getDefinitionKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:832:2: ( 'assumption' )
                    {
                    // InternalVampireLanguage.g:832:2: ( 'assumption' )
                    // InternalVampireLanguage.g:833:3: 'assumption'
                    {
                     before(grammarAccess.getVLSRoleAccess().getAssumptionKeyword_4()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getAssumptionKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalVampireLanguage.g:838:2: ( 'lemma' )
                    {
                    // InternalVampireLanguage.g:838:2: ( 'lemma' )
                    // InternalVampireLanguage.g:839:3: 'lemma'
                    {
                     before(grammarAccess.getVLSRoleAccess().getLemmaKeyword_5()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getLemmaKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalVampireLanguage.g:844:2: ( 'theorem' )
                    {
                    // InternalVampireLanguage.g:844:2: ( 'theorem' )
                    // InternalVampireLanguage.g:845:3: 'theorem'
                    {
                     before(grammarAccess.getVLSRoleAccess().getTheoremKeyword_6()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getTheoremKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalVampireLanguage.g:850:2: ( 'corollary' )
                    {
                    // InternalVampireLanguage.g:850:2: ( 'corollary' )
                    // InternalVampireLanguage.g:851:3: 'corollary'
                    {
                     before(grammarAccess.getVLSRoleAccess().getCorollaryKeyword_7()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getCorollaryKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalVampireLanguage.g:856:2: ( 'negated_conjecture' )
                    {
                    // InternalVampireLanguage.g:856:2: ( 'negated_conjecture' )
                    // InternalVampireLanguage.g:857:3: 'negated_conjecture'
                    {
                     before(grammarAccess.getVLSRoleAccess().getNegated_conjectureKeyword_8()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getNegated_conjectureKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalVampireLanguage.g:862:2: ( 'plain' )
                    {
                    // InternalVampireLanguage.g:862:2: ( 'plain' )
                    // InternalVampireLanguage.g:863:3: 'plain'
                    {
                     before(grammarAccess.getVLSRoleAccess().getPlainKeyword_9()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getPlainKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalVampireLanguage.g:868:2: ( 'type' )
                    {
                    // InternalVampireLanguage.g:868:2: ( 'type' )
                    // InternalVampireLanguage.g:869:3: 'type'
                    {
                     before(grammarAccess.getVLSRoleAccess().getTypeKeyword_10()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getTypeKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalVampireLanguage.g:874:2: ( 'fi_domain' )
                    {
                    // InternalVampireLanguage.g:874:2: ( 'fi_domain' )
                    // InternalVampireLanguage.g:875:3: 'fi_domain'
                    {
                     before(grammarAccess.getVLSRoleAccess().getFi_domainKeyword_11()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getFi_domainKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalVampireLanguage.g:880:2: ( 'fi_functors' )
                    {
                    // InternalVampireLanguage.g:880:2: ( 'fi_functors' )
                    // InternalVampireLanguage.g:881:3: 'fi_functors'
                    {
                     before(grammarAccess.getVLSRoleAccess().getFi_functorsKeyword_12()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getFi_functorsKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalVampireLanguage.g:886:2: ( 'fi_predicates' )
                    {
                    // InternalVampireLanguage.g:886:2: ( 'fi_predicates' )
                    // InternalVampireLanguage.g:887:3: 'fi_predicates'
                    {
                     before(grammarAccess.getVLSRoleAccess().getFi_predicatesKeyword_13()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getVLSRoleAccess().getFi_predicatesKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalVampireLanguage.g:892:2: ( 'unknown' )
                    {
                    // InternalVampireLanguage.g:892:2: ( 'unknown' )
                    // InternalVampireLanguage.g:893:3: 'unknown'
                    {
                     before(grammarAccess.getVLSRoleAccess().getUnknownKeyword_14()); 
                    match(input,41,FOLLOW_2); 
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
    // InternalVampireLanguage.g:902:1: rule__VLSAnnotation__NameAlternatives_1_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( ruleVLSRole ) );
    public final void rule__VLSAnnotation__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:906:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( ruleVLSRole ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt7=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt7=2;
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
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalVampireLanguage.g:907:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:907:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:908:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSAnnotationAccess().getNameLOWER_WORD_IDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAnnotationAccess().getNameLOWER_WORD_IDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:913:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:913:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:914:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSAnnotationAccess().getNameSINGLE_QUOTETerminalRuleCall_1_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSAnnotationAccess().getNameSINGLE_QUOTETerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:919:2: ( ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:919:2: ( ruleVLSRole )
                    // InternalVampireLanguage.g:920:3: ruleVLSRole
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
    // InternalVampireLanguage.g:929:1: rule__VLSBinary__Alternatives_1 : ( ( ( rule__VLSBinary__Group_1_0__0 ) ) | ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) ) | ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) ) );
    public final void rule__VLSBinary__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:933:1: ( ( ( rule__VLSBinary__Group_1_0__0 ) ) | ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) ) | ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                {
                alt10=1;
                }
                break;
            case 60:
                {
                alt10=2;
                }
                break;
            case 61:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalVampireLanguage.g:934:2: ( ( rule__VLSBinary__Group_1_0__0 ) )
                    {
                    // InternalVampireLanguage.g:934:2: ( ( rule__VLSBinary__Group_1_0__0 ) )
                    // InternalVampireLanguage.g:935:3: ( rule__VLSBinary__Group_1_0__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0()); 
                    // InternalVampireLanguage.g:936:3: ( rule__VLSBinary__Group_1_0__0 )
                    // InternalVampireLanguage.g:936:4: rule__VLSBinary__Group_1_0__0
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
                    // InternalVampireLanguage.g:940:2: ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) )
                    {
                    // InternalVampireLanguage.g:940:2: ( ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* ) )
                    // InternalVampireLanguage.g:941:3: ( ( rule__VLSBinary__Group_1_1__0 ) ) ( ( rule__VLSBinary__Group_1_1__0 )* )
                    {
                    // InternalVampireLanguage.g:941:3: ( ( rule__VLSBinary__Group_1_1__0 ) )
                    // InternalVampireLanguage.g:942:4: ( rule__VLSBinary__Group_1_1__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 
                    // InternalVampireLanguage.g:943:4: ( rule__VLSBinary__Group_1_1__0 )
                    // InternalVampireLanguage.g:943:5: rule__VLSBinary__Group_1_1__0
                    {
                    pushFollow(FOLLOW_4);
                    rule__VLSBinary__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 

                    }

                    // InternalVampireLanguage.g:946:3: ( ( rule__VLSBinary__Group_1_1__0 )* )
                    // InternalVampireLanguage.g:947:4: ( rule__VLSBinary__Group_1_1__0 )*
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 
                    // InternalVampireLanguage.g:948:4: ( rule__VLSBinary__Group_1_1__0 )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==60) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:948:5: rule__VLSBinary__Group_1_1__0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__VLSBinary__Group_1_1__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_1()); 

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:953:2: ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) )
                    {
                    // InternalVampireLanguage.g:953:2: ( ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* ) )
                    // InternalVampireLanguage.g:954:3: ( ( rule__VLSBinary__Group_1_2__0 ) ) ( ( rule__VLSBinary__Group_1_2__0 )* )
                    {
                    // InternalVampireLanguage.g:954:3: ( ( rule__VLSBinary__Group_1_2__0 ) )
                    // InternalVampireLanguage.g:955:4: ( rule__VLSBinary__Group_1_2__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 
                    // InternalVampireLanguage.g:956:4: ( rule__VLSBinary__Group_1_2__0 )
                    // InternalVampireLanguage.g:956:5: rule__VLSBinary__Group_1_2__0
                    {
                    pushFollow(FOLLOW_5);
                    rule__VLSBinary__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 

                    }

                    // InternalVampireLanguage.g:959:3: ( ( rule__VLSBinary__Group_1_2__0 )* )
                    // InternalVampireLanguage.g:960:4: ( rule__VLSBinary__Group_1_2__0 )*
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_2()); 
                    // InternalVampireLanguage.g:961:4: ( rule__VLSBinary__Group_1_2__0 )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==61) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:961:5: rule__VLSBinary__Group_1_2__0
                    	    {
                    	    pushFollow(FOLLOW_5);
                    	    rule__VLSBinary__Group_1_2__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
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
    // InternalVampireLanguage.g:970:1: rule__VLSBinary__Alternatives_1_0_0 : ( ( ( rule__VLSBinary__Group_1_0_0_0__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_1__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_2__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_3__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_4__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_5__0 ) ) );
    public final void rule__VLSBinary__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:974:1: ( ( ( rule__VLSBinary__Group_1_0_0_0__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_1__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_2__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_3__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_4__0 ) ) | ( ( rule__VLSBinary__Group_1_0_0_5__0 ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt11=1;
                }
                break;
            case 55:
                {
                alt11=2;
                }
                break;
            case 56:
                {
                alt11=3;
                }
                break;
            case 57:
                {
                alt11=4;
                }
                break;
            case 58:
                {
                alt11=5;
                }
                break;
            case 59:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalVampireLanguage.g:975:2: ( ( rule__VLSBinary__Group_1_0_0_0__0 ) )
                    {
                    // InternalVampireLanguage.g:975:2: ( ( rule__VLSBinary__Group_1_0_0_0__0 ) )
                    // InternalVampireLanguage.g:976:3: ( rule__VLSBinary__Group_1_0_0_0__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_0()); 
                    // InternalVampireLanguage.g:977:3: ( rule__VLSBinary__Group_1_0_0_0__0 )
                    // InternalVampireLanguage.g:977:4: rule__VLSBinary__Group_1_0_0_0__0
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
                    // InternalVampireLanguage.g:981:2: ( ( rule__VLSBinary__Group_1_0_0_1__0 ) )
                    {
                    // InternalVampireLanguage.g:981:2: ( ( rule__VLSBinary__Group_1_0_0_1__0 ) )
                    // InternalVampireLanguage.g:982:3: ( rule__VLSBinary__Group_1_0_0_1__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_1()); 
                    // InternalVampireLanguage.g:983:3: ( rule__VLSBinary__Group_1_0_0_1__0 )
                    // InternalVampireLanguage.g:983:4: rule__VLSBinary__Group_1_0_0_1__0
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
                    // InternalVampireLanguage.g:987:2: ( ( rule__VLSBinary__Group_1_0_0_2__0 ) )
                    {
                    // InternalVampireLanguage.g:987:2: ( ( rule__VLSBinary__Group_1_0_0_2__0 ) )
                    // InternalVampireLanguage.g:988:3: ( rule__VLSBinary__Group_1_0_0_2__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_2()); 
                    // InternalVampireLanguage.g:989:3: ( rule__VLSBinary__Group_1_0_0_2__0 )
                    // InternalVampireLanguage.g:989:4: rule__VLSBinary__Group_1_0_0_2__0
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
                    // InternalVampireLanguage.g:993:2: ( ( rule__VLSBinary__Group_1_0_0_3__0 ) )
                    {
                    // InternalVampireLanguage.g:993:2: ( ( rule__VLSBinary__Group_1_0_0_3__0 ) )
                    // InternalVampireLanguage.g:994:3: ( rule__VLSBinary__Group_1_0_0_3__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_3()); 
                    // InternalVampireLanguage.g:995:3: ( rule__VLSBinary__Group_1_0_0_3__0 )
                    // InternalVampireLanguage.g:995:4: rule__VLSBinary__Group_1_0_0_3__0
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
                    // InternalVampireLanguage.g:999:2: ( ( rule__VLSBinary__Group_1_0_0_4__0 ) )
                    {
                    // InternalVampireLanguage.g:999:2: ( ( rule__VLSBinary__Group_1_0_0_4__0 ) )
                    // InternalVampireLanguage.g:1000:3: ( rule__VLSBinary__Group_1_0_0_4__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_4()); 
                    // InternalVampireLanguage.g:1001:3: ( rule__VLSBinary__Group_1_0_0_4__0 )
                    // InternalVampireLanguage.g:1001:4: rule__VLSBinary__Group_1_0_0_4__0
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
                    // InternalVampireLanguage.g:1005:2: ( ( rule__VLSBinary__Group_1_0_0_5__0 ) )
                    {
                    // InternalVampireLanguage.g:1005:2: ( ( rule__VLSBinary__Group_1_0_0_5__0 ) )
                    // InternalVampireLanguage.g:1006:3: ( rule__VLSBinary__Group_1_0_0_5__0 )
                    {
                     before(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_5()); 
                    // InternalVampireLanguage.g:1007:3: ( rule__VLSBinary__Group_1_0_0_5__0 )
                    // InternalVampireLanguage.g:1007:4: rule__VLSBinary__Group_1_0_0_5__0
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
    // InternalVampireLanguage.g:1015:1: rule__VLSUnitaryFormula__Alternatives : ( ( ruleVLSUniversalQuantifier ) | ( ruleVLSExistentialQuantifier ) | ( ruleVLSUnaryNegation ) | ( ruleVLSUnaryInfix ) | ( ( rule__VLSUnitaryFormula__Group_4__0 ) ) );
    public final void rule__VLSUnitaryFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1019:1: ( ( ruleVLSUniversalQuantifier ) | ( ruleVLSExistentialQuantifier ) | ( ruleVLSUnaryNegation ) | ( ruleVLSUnaryInfix ) | ( ( rule__VLSUnitaryFormula__Group_4__0 ) ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt12=1;
                }
                break;
            case 64:
                {
                alt12=2;
                }
                break;
            case 65:
                {
                alt12=3;
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
            case 69:
            case 70:
            case 71:
                {
                alt12=4;
                }
                break;
            case 49:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalVampireLanguage.g:1020:2: ( ruleVLSUniversalQuantifier )
                    {
                    // InternalVampireLanguage.g:1020:2: ( ruleVLSUniversalQuantifier )
                    // InternalVampireLanguage.g:1021:3: ruleVLSUniversalQuantifier
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
                    // InternalVampireLanguage.g:1026:2: ( ruleVLSExistentialQuantifier )
                    {
                    // InternalVampireLanguage.g:1026:2: ( ruleVLSExistentialQuantifier )
                    // InternalVampireLanguage.g:1027:3: ruleVLSExistentialQuantifier
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
                    // InternalVampireLanguage.g:1032:2: ( ruleVLSUnaryNegation )
                    {
                    // InternalVampireLanguage.g:1032:2: ( ruleVLSUnaryNegation )
                    // InternalVampireLanguage.g:1033:3: ruleVLSUnaryNegation
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
                    // InternalVampireLanguage.g:1038:2: ( ruleVLSUnaryInfix )
                    {
                    // InternalVampireLanguage.g:1038:2: ( ruleVLSUnaryInfix )
                    // InternalVampireLanguage.g:1039:3: ruleVLSUnaryInfix
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
                    // InternalVampireLanguage.g:1044:2: ( ( rule__VLSUnitaryFormula__Group_4__0 ) )
                    {
                    // InternalVampireLanguage.g:1044:2: ( ( rule__VLSUnitaryFormula__Group_4__0 ) )
                    // InternalVampireLanguage.g:1045:3: ( rule__VLSUnitaryFormula__Group_4__0 )
                    {
                     before(grammarAccess.getVLSUnitaryFormulaAccess().getGroup_4()); 
                    // InternalVampireLanguage.g:1046:3: ( rule__VLSUnitaryFormula__Group_4__0 )
                    // InternalVampireLanguage.g:1046:4: rule__VLSUnitaryFormula__Group_4__0
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
    // InternalVampireLanguage.g:1054:1: rule__VLSUnaryInfix__Alternatives_1_0 : ( ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) ) );
    public final void rule__VLSUnaryInfix__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1058:1: ( ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) ) | ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt13=1;
                }
                break;
            case 67:
                {
                alt13=2;
                }
                break;
            case 68:
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
                    // InternalVampireLanguage.g:1059:2: ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1059:2: ( ( rule__VLSUnaryInfix__Group_1_0_0__0 ) )
                    // InternalVampireLanguage.g:1060:3: ( rule__VLSUnaryInfix__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_0()); 
                    // InternalVampireLanguage.g:1061:3: ( rule__VLSUnaryInfix__Group_1_0_0__0 )
                    // InternalVampireLanguage.g:1061:4: rule__VLSUnaryInfix__Group_1_0_0__0
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
                    // InternalVampireLanguage.g:1065:2: ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1065:2: ( ( rule__VLSUnaryInfix__Group_1_0_1__0 ) )
                    // InternalVampireLanguage.g:1066:3: ( rule__VLSUnaryInfix__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_1()); 
                    // InternalVampireLanguage.g:1067:3: ( rule__VLSUnaryInfix__Group_1_0_1__0 )
                    // InternalVampireLanguage.g:1067:4: rule__VLSUnaryInfix__Group_1_0_1__0
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
                    // InternalVampireLanguage.g:1071:2: ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1071:2: ( ( rule__VLSUnaryInfix__Group_1_0_2__0 ) )
                    // InternalVampireLanguage.g:1072:3: ( rule__VLSUnaryInfix__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_2()); 
                    // InternalVampireLanguage.g:1073:3: ( rule__VLSUnaryInfix__Group_1_0_2__0 )
                    // InternalVampireLanguage.g:1073:4: rule__VLSUnaryInfix__Group_1_0_2__0
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
    // InternalVampireLanguage.g:1081:1: rule__VLSAtomic__Alternatives : ( ( ruleVLSAtomicConstant ) | ( ruleVLSAtomicFunction ) | ( ruleVLSVariable ) | ( ruleVLSDefinedTerm ) );
    public final void rule__VLSAtomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1085:1: ( ( ruleVLSAtomicConstant ) | ( ruleVLSAtomicFunction ) | ( ruleVLSVariable ) | ( ruleVLSDefinedTerm ) )
            int alt14=4;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalVampireLanguage.g:1086:2: ( ruleVLSAtomicConstant )
                    {
                    // InternalVampireLanguage.g:1086:2: ( ruleVLSAtomicConstant )
                    // InternalVampireLanguage.g:1087:3: ruleVLSAtomicConstant
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
                    // InternalVampireLanguage.g:1092:2: ( ruleVLSAtomicFunction )
                    {
                    // InternalVampireLanguage.g:1092:2: ( ruleVLSAtomicFunction )
                    // InternalVampireLanguage.g:1093:3: ruleVLSAtomicFunction
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
                    // InternalVampireLanguage.g:1098:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1098:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1099:3: ruleVLSVariable
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
                    // InternalVampireLanguage.g:1104:2: ( ruleVLSDefinedTerm )
                    {
                    // InternalVampireLanguage.g:1104:2: ( ruleVLSDefinedTerm )
                    // InternalVampireLanguage.g:1105:3: ruleVLSDefinedTerm
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
    // InternalVampireLanguage.g:1114:1: rule__VLSAtomicConstant__Alternatives : ( ( ( rule__VLSAtomicConstant__Group_0__0 ) ) | ( ( rule__VLSAtomicConstant__Group_1__0 ) ) | ( ( rule__VLSAtomicConstant__Group_2__0 ) ) );
    public final void rule__VLSAtomicConstant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1118:1: ( ( ( rule__VLSAtomicConstant__Group_0__0 ) ) | ( ( rule__VLSAtomicConstant__Group_1__0 ) ) | ( ( rule__VLSAtomicConstant__Group_2__0 ) ) )
            int alt15=3;
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
                alt15=1;
                }
                break;
            case 69:
                {
                alt15=2;
                }
                break;
            case 70:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalVampireLanguage.g:1119:2: ( ( rule__VLSAtomicConstant__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1119:2: ( ( rule__VLSAtomicConstant__Group_0__0 ) )
                    // InternalVampireLanguage.g:1120:3: ( rule__VLSAtomicConstant__Group_0__0 )
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:1121:3: ( rule__VLSAtomicConstant__Group_0__0 )
                    // InternalVampireLanguage.g:1121:4: rule__VLSAtomicConstant__Group_0__0
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
                    // InternalVampireLanguage.g:1125:2: ( ( rule__VLSAtomicConstant__Group_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1125:2: ( ( rule__VLSAtomicConstant__Group_1__0 ) )
                    // InternalVampireLanguage.g:1126:3: ( rule__VLSAtomicConstant__Group_1__0 )
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getGroup_1()); 
                    // InternalVampireLanguage.g:1127:3: ( rule__VLSAtomicConstant__Group_1__0 )
                    // InternalVampireLanguage.g:1127:4: rule__VLSAtomicConstant__Group_1__0
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
                    // InternalVampireLanguage.g:1131:2: ( ( rule__VLSAtomicConstant__Group_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1131:2: ( ( rule__VLSAtomicConstant__Group_2__0 ) )
                    // InternalVampireLanguage.g:1132:3: ( rule__VLSAtomicConstant__Group_2__0 )
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getGroup_2()); 
                    // InternalVampireLanguage.g:1133:3: ( rule__VLSAtomicConstant__Group_2__0 )
                    // InternalVampireLanguage.g:1133:4: rule__VLSAtomicConstant__Group_2__0
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
    // InternalVampireLanguage.g:1141:1: rule__VLSAtomicConstant__NameAlternatives_0_1_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) | ( ruleVLSRole ) );
    public final void rule__VLSAtomicConstant__NameAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1145:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) | ( ruleVLSRole ) )
            int alt16=5;
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
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalVampireLanguage.g:1146:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1146:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1147:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1152:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1152:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1153:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1158:2: ( RULE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1158:2: ( RULE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1159:3: RULE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameDOLLAR_IDTerminalRuleCall_0_1_0_2()); 
                    match(input,RULE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameDOLLAR_IDTerminalRuleCall_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1164:2: ( RULE_DOUBLE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1164:2: ( RULE_DOUBLE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1165:3: RULE_DOUBLE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicConstantAccess().getNameDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 
                    match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicConstantAccess().getNameDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:1170:2: ( ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:1170:2: ( ruleVLSRole )
                    // InternalVampireLanguage.g:1171:3: ruleVLSRole
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
    // InternalVampireLanguage.g:1180:1: rule__VLSAtomicFunction__Alternatives : ( ( ( rule__VLSAtomicFunction__Group_0__0 ) ) | ( ( rule__VLSAtomicFunction__Group_1__0 ) ) );
    public final void rule__VLSAtomicFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1184:1: ( ( ( rule__VLSAtomicFunction__Group_0__0 ) ) | ( ( rule__VLSAtomicFunction__Group_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_LOWER_WORD_ID && LA17_0<=RULE_SINGLE_QUOTE)||(LA17_0>=RULE_DOLLAR_ID && LA17_0<=RULE_DOUBLE_DOLLAR_ID)||(LA17_0>=27 && LA17_0<=41)) ) {
                alt17=1;
            }
            else if ( (LA17_0==71) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalVampireLanguage.g:1185:2: ( ( rule__VLSAtomicFunction__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1185:2: ( ( rule__VLSAtomicFunction__Group_0__0 ) )
                    // InternalVampireLanguage.g:1186:3: ( rule__VLSAtomicFunction__Group_0__0 )
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:1187:3: ( rule__VLSAtomicFunction__Group_0__0 )
                    // InternalVampireLanguage.g:1187:4: rule__VLSAtomicFunction__Group_0__0
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
                    // InternalVampireLanguage.g:1191:2: ( ( rule__VLSAtomicFunction__Group_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1191:2: ( ( rule__VLSAtomicFunction__Group_1__0 ) )
                    // InternalVampireLanguage.g:1192:3: ( rule__VLSAtomicFunction__Group_1__0 )
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_1()); 
                    // InternalVampireLanguage.g:1193:3: ( rule__VLSAtomicFunction__Group_1__0 )
                    // InternalVampireLanguage.g:1193:4: rule__VLSAtomicFunction__Group_1__0
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
    // InternalVampireLanguage.g:1201:1: rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) | ( ruleVLSRole ) );
    public final void rule__VLSAtomicFunction__ConstantAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1205:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) | ( ruleVLSRole ) )
            int alt18=5;
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
                    // InternalVampireLanguage.g:1206:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1206:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1207:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantLOWER_WORD_IDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1212:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1212:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1213:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantSINGLE_QUOTETerminalRuleCall_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1218:2: ( RULE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1218:2: ( RULE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1219:3: RULE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOLLAR_IDTerminalRuleCall_0_1_0_2()); 
                    match(input,RULE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOLLAR_IDTerminalRuleCall_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1224:2: ( RULE_DOUBLE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1224:2: ( RULE_DOUBLE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1225:3: RULE_DOUBLE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 
                    match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSAtomicFunctionAccess().getConstantDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:1230:2: ( ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:1230:2: ( ruleVLSRole )
                    // InternalVampireLanguage.g:1231:3: ruleVLSRole
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
    // InternalVampireLanguage.g:1240:1: rule__VLSFofTerm__Alternatives : ( ( ruleVLSVariable ) | ( ruleVLSFunctionFof ) | ( ruleVLSDefinedTerm ) );
    public final void rule__VLSFofTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1244:1: ( ( ruleVLSVariable ) | ( ruleVLSFunctionFof ) | ( ruleVLSDefinedTerm ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_UPPER_WORD_ID:
                {
                alt19=1;
                }
                break;
            case RULE_LOWER_WORD_ID:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt19=2;
                }
                break;
            case RULE_SIGNED_LITERAL:
            case RULE_SIGNED_REAL_ID:
            case RULE_SIGNED_RAT_ID:
            case RULE_DOUBLE_QUOTE:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalVampireLanguage.g:1245:2: ( ruleVLSVariable )
                    {
                    // InternalVampireLanguage.g:1245:2: ( ruleVLSVariable )
                    // InternalVampireLanguage.g:1246:3: ruleVLSVariable
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
                    // InternalVampireLanguage.g:1251:2: ( ruleVLSFunctionFof )
                    {
                    // InternalVampireLanguage.g:1251:2: ( ruleVLSFunctionFof )
                    // InternalVampireLanguage.g:1252:3: ruleVLSFunctionFof
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
                    // InternalVampireLanguage.g:1257:2: ( ruleVLSDefinedTerm )
                    {
                    // InternalVampireLanguage.g:1257:2: ( ruleVLSDefinedTerm )
                    // InternalVampireLanguage.g:1258:3: ruleVLSDefinedTerm
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
    // InternalVampireLanguage.g:1267:1: rule__VLSFunctionFof__FunctorAlternatives_0_0 : ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) );
    public final void rule__VLSFunctionFof__FunctorAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1271:1: ( ( RULE_LOWER_WORD_ID ) | ( RULE_SINGLE_QUOTE ) | ( RULE_DOLLAR_ID ) | ( RULE_DOUBLE_DOLLAR_ID ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt20=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt20=2;
                }
                break;
            case RULE_DOLLAR_ID:
                {
                alt20=3;
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
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
                    // InternalVampireLanguage.g:1272:2: ( RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:1272:2: ( RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:1273:3: RULE_LOWER_WORD_ID
                    {
                     before(grammarAccess.getVLSFunctionFofAccess().getFunctorLOWER_WORD_IDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionFofAccess().getFunctorLOWER_WORD_IDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1278:2: ( RULE_SINGLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:1278:2: ( RULE_SINGLE_QUOTE )
                    // InternalVampireLanguage.g:1279:3: RULE_SINGLE_QUOTE
                    {
                     before(grammarAccess.getVLSFunctionFofAccess().getFunctorSINGLE_QUOTETerminalRuleCall_0_0_1()); 
                    match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionFofAccess().getFunctorSINGLE_QUOTETerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1284:2: ( RULE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1284:2: ( RULE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1285:3: RULE_DOLLAR_ID
                    {
                     before(grammarAccess.getVLSFunctionFofAccess().getFunctorDOLLAR_IDTerminalRuleCall_0_0_2()); 
                    match(input,RULE_DOLLAR_ID,FOLLOW_2); 
                     after(grammarAccess.getVLSFunctionFofAccess().getFunctorDOLLAR_IDTerminalRuleCall_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1290:2: ( RULE_DOUBLE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:1290:2: ( RULE_DOUBLE_DOLLAR_ID )
                    // InternalVampireLanguage.g:1291:3: RULE_DOUBLE_DOLLAR_ID
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
    // InternalVampireLanguage.g:1300:1: rule__VLSDefinedTerm__Alternatives : ( ( ( rule__VLSDefinedTerm__Group_0__0 ) ) | ( ( rule__VLSDefinedTerm__Group_1__0 ) ) | ( ( rule__VLSDefinedTerm__Group_2__0 ) ) | ( ( rule__VLSDefinedTerm__Group_3__0 ) ) );
    public final void rule__VLSDefinedTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1304:1: ( ( ( rule__VLSDefinedTerm__Group_0__0 ) ) | ( ( rule__VLSDefinedTerm__Group_1__0 ) ) | ( ( rule__VLSDefinedTerm__Group_2__0 ) ) | ( ( rule__VLSDefinedTerm__Group_3__0 ) ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_LITERAL:
                {
                alt21=1;
                }
                break;
            case RULE_SIGNED_REAL_ID:
                {
                alt21=2;
                }
                break;
            case RULE_SIGNED_RAT_ID:
                {
                alt21=3;
                }
                break;
            case RULE_DOUBLE_QUOTE:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalVampireLanguage.g:1305:2: ( ( rule__VLSDefinedTerm__Group_0__0 ) )
                    {
                    // InternalVampireLanguage.g:1305:2: ( ( rule__VLSDefinedTerm__Group_0__0 ) )
                    // InternalVampireLanguage.g:1306:3: ( rule__VLSDefinedTerm__Group_0__0 )
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getGroup_0()); 
                    // InternalVampireLanguage.g:1307:3: ( rule__VLSDefinedTerm__Group_0__0 )
                    // InternalVampireLanguage.g:1307:4: rule__VLSDefinedTerm__Group_0__0
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
                    // InternalVampireLanguage.g:1311:2: ( ( rule__VLSDefinedTerm__Group_1__0 ) )
                    {
                    // InternalVampireLanguage.g:1311:2: ( ( rule__VLSDefinedTerm__Group_1__0 ) )
                    // InternalVampireLanguage.g:1312:3: ( rule__VLSDefinedTerm__Group_1__0 )
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getGroup_1()); 
                    // InternalVampireLanguage.g:1313:3: ( rule__VLSDefinedTerm__Group_1__0 )
                    // InternalVampireLanguage.g:1313:4: rule__VLSDefinedTerm__Group_1__0
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
                    // InternalVampireLanguage.g:1317:2: ( ( rule__VLSDefinedTerm__Group_2__0 ) )
                    {
                    // InternalVampireLanguage.g:1317:2: ( ( rule__VLSDefinedTerm__Group_2__0 ) )
                    // InternalVampireLanguage.g:1318:3: ( rule__VLSDefinedTerm__Group_2__0 )
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getGroup_2()); 
                    // InternalVampireLanguage.g:1319:3: ( rule__VLSDefinedTerm__Group_2__0 )
                    // InternalVampireLanguage.g:1319:4: rule__VLSDefinedTerm__Group_2__0
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
                    // InternalVampireLanguage.g:1323:2: ( ( rule__VLSDefinedTerm__Group_3__0 ) )
                    {
                    // InternalVampireLanguage.g:1323:2: ( ( rule__VLSDefinedTerm__Group_3__0 ) )
                    // InternalVampireLanguage.g:1324:3: ( rule__VLSDefinedTerm__Group_3__0 )
                    {
                     before(grammarAccess.getVLSDefinedTermAccess().getGroup_3()); 
                    // InternalVampireLanguage.g:1325:3: ( rule__VLSDefinedTerm__Group_3__0 )
                    // InternalVampireLanguage.g:1325:4: rule__VLSDefinedTerm__Group_3__0
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
    // InternalVampireLanguage.g:1333:1: rule__VLSInclude__Group__0 : rule__VLSInclude__Group__0__Impl rule__VLSInclude__Group__1 ;
    public final void rule__VLSInclude__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1337:1: ( rule__VLSInclude__Group__0__Impl rule__VLSInclude__Group__1 )
            // InternalVampireLanguage.g:1338:2: rule__VLSInclude__Group__0__Impl rule__VLSInclude__Group__1
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
    // InternalVampireLanguage.g:1345:1: rule__VLSInclude__Group__0__Impl : ( 'include(' ) ;
    public final void rule__VLSInclude__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1349:1: ( ( 'include(' ) )
            // InternalVampireLanguage.g:1350:1: ( 'include(' )
            {
            // InternalVampireLanguage.g:1350:1: ( 'include(' )
            // InternalVampireLanguage.g:1351:2: 'include('
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
    // InternalVampireLanguage.g:1360:1: rule__VLSInclude__Group__1 : rule__VLSInclude__Group__1__Impl rule__VLSInclude__Group__2 ;
    public final void rule__VLSInclude__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1364:1: ( rule__VLSInclude__Group__1__Impl rule__VLSInclude__Group__2 )
            // InternalVampireLanguage.g:1365:2: rule__VLSInclude__Group__1__Impl rule__VLSInclude__Group__2
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
    // InternalVampireLanguage.g:1372:1: rule__VLSInclude__Group__1__Impl : ( ( rule__VLSInclude__FileNameAssignment_1 ) ) ;
    public final void rule__VLSInclude__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1376:1: ( ( ( rule__VLSInclude__FileNameAssignment_1 ) ) )
            // InternalVampireLanguage.g:1377:1: ( ( rule__VLSInclude__FileNameAssignment_1 ) )
            {
            // InternalVampireLanguage.g:1377:1: ( ( rule__VLSInclude__FileNameAssignment_1 ) )
            // InternalVampireLanguage.g:1378:2: ( rule__VLSInclude__FileNameAssignment_1 )
            {
             before(grammarAccess.getVLSIncludeAccess().getFileNameAssignment_1()); 
            // InternalVampireLanguage.g:1379:2: ( rule__VLSInclude__FileNameAssignment_1 )
            // InternalVampireLanguage.g:1379:3: rule__VLSInclude__FileNameAssignment_1
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
    // InternalVampireLanguage.g:1387:1: rule__VLSInclude__Group__2 : rule__VLSInclude__Group__2__Impl ;
    public final void rule__VLSInclude__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1391:1: ( rule__VLSInclude__Group__2__Impl )
            // InternalVampireLanguage.g:1392:2: rule__VLSInclude__Group__2__Impl
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
    // InternalVampireLanguage.g:1398:1: rule__VLSInclude__Group__2__Impl : ( ( rule__VLSInclude__Group_2__0 )? ) ;
    public final void rule__VLSInclude__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1402:1: ( ( ( rule__VLSInclude__Group_2__0 )? ) )
            // InternalVampireLanguage.g:1403:1: ( ( rule__VLSInclude__Group_2__0 )? )
            {
            // InternalVampireLanguage.g:1403:1: ( ( rule__VLSInclude__Group_2__0 )? )
            // InternalVampireLanguage.g:1404:2: ( rule__VLSInclude__Group_2__0 )?
            {
             before(grammarAccess.getVLSIncludeAccess().getGroup_2()); 
            // InternalVampireLanguage.g:1405:2: ( rule__VLSInclude__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVampireLanguage.g:1405:3: rule__VLSInclude__Group_2__0
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
    // InternalVampireLanguage.g:1414:1: rule__VLSInclude__Group_2__0 : rule__VLSInclude__Group_2__0__Impl rule__VLSInclude__Group_2__1 ;
    public final void rule__VLSInclude__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1418:1: ( rule__VLSInclude__Group_2__0__Impl rule__VLSInclude__Group_2__1 )
            // InternalVampireLanguage.g:1419:2: rule__VLSInclude__Group_2__0__Impl rule__VLSInclude__Group_2__1
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
    // InternalVampireLanguage.g:1426:1: rule__VLSInclude__Group_2__0__Impl : ( ',[' ) ;
    public final void rule__VLSInclude__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1430:1: ( ( ',[' ) )
            // InternalVampireLanguage.g:1431:1: ( ',[' )
            {
            // InternalVampireLanguage.g:1431:1: ( ',[' )
            // InternalVampireLanguage.g:1432:2: ',['
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
    // InternalVampireLanguage.g:1441:1: rule__VLSInclude__Group_2__1 : rule__VLSInclude__Group_2__1__Impl rule__VLSInclude__Group_2__2 ;
    public final void rule__VLSInclude__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1445:1: ( rule__VLSInclude__Group_2__1__Impl rule__VLSInclude__Group_2__2 )
            // InternalVampireLanguage.g:1446:2: rule__VLSInclude__Group_2__1__Impl rule__VLSInclude__Group_2__2
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
    // InternalVampireLanguage.g:1453:1: rule__VLSInclude__Group_2__1__Impl : ( ( rule__VLSInclude__NamesAssignment_2_1 ) ) ;
    public final void rule__VLSInclude__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1457:1: ( ( ( rule__VLSInclude__NamesAssignment_2_1 ) ) )
            // InternalVampireLanguage.g:1458:1: ( ( rule__VLSInclude__NamesAssignment_2_1 ) )
            {
            // InternalVampireLanguage.g:1458:1: ( ( rule__VLSInclude__NamesAssignment_2_1 ) )
            // InternalVampireLanguage.g:1459:2: ( rule__VLSInclude__NamesAssignment_2_1 )
            {
             before(grammarAccess.getVLSIncludeAccess().getNamesAssignment_2_1()); 
            // InternalVampireLanguage.g:1460:2: ( rule__VLSInclude__NamesAssignment_2_1 )
            // InternalVampireLanguage.g:1460:3: rule__VLSInclude__NamesAssignment_2_1
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
    // InternalVampireLanguage.g:1468:1: rule__VLSInclude__Group_2__2 : rule__VLSInclude__Group_2__2__Impl rule__VLSInclude__Group_2__3 ;
    public final void rule__VLSInclude__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1472:1: ( rule__VLSInclude__Group_2__2__Impl rule__VLSInclude__Group_2__3 )
            // InternalVampireLanguage.g:1473:2: rule__VLSInclude__Group_2__2__Impl rule__VLSInclude__Group_2__3
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
    // InternalVampireLanguage.g:1480:1: rule__VLSInclude__Group_2__2__Impl : ( ( rule__VLSInclude__Group_2_2__0 )* ) ;
    public final void rule__VLSInclude__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1484:1: ( ( ( rule__VLSInclude__Group_2_2__0 )* ) )
            // InternalVampireLanguage.g:1485:1: ( ( rule__VLSInclude__Group_2_2__0 )* )
            {
            // InternalVampireLanguage.g:1485:1: ( ( rule__VLSInclude__Group_2_2__0 )* )
            // InternalVampireLanguage.g:1486:2: ( rule__VLSInclude__Group_2_2__0 )*
            {
             before(grammarAccess.getVLSIncludeAccess().getGroup_2_2()); 
            // InternalVampireLanguage.g:1487:2: ( rule__VLSInclude__Group_2_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==45) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalVampireLanguage.g:1487:3: rule__VLSInclude__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__VLSInclude__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalVampireLanguage.g:1495:1: rule__VLSInclude__Group_2__3 : rule__VLSInclude__Group_2__3__Impl ;
    public final void rule__VLSInclude__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1499:1: ( rule__VLSInclude__Group_2__3__Impl )
            // InternalVampireLanguage.g:1500:2: rule__VLSInclude__Group_2__3__Impl
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
    // InternalVampireLanguage.g:1506:1: rule__VLSInclude__Group_2__3__Impl : ( ']' ) ;
    public final void rule__VLSInclude__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1510:1: ( ( ']' ) )
            // InternalVampireLanguage.g:1511:1: ( ']' )
            {
            // InternalVampireLanguage.g:1511:1: ( ']' )
            // InternalVampireLanguage.g:1512:2: ']'
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
    // InternalVampireLanguage.g:1522:1: rule__VLSInclude__Group_2_2__0 : rule__VLSInclude__Group_2_2__0__Impl rule__VLSInclude__Group_2_2__1 ;
    public final void rule__VLSInclude__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1526:1: ( rule__VLSInclude__Group_2_2__0__Impl rule__VLSInclude__Group_2_2__1 )
            // InternalVampireLanguage.g:1527:2: rule__VLSInclude__Group_2_2__0__Impl rule__VLSInclude__Group_2_2__1
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
    // InternalVampireLanguage.g:1534:1: rule__VLSInclude__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__VLSInclude__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1538:1: ( ( ',' ) )
            // InternalVampireLanguage.g:1539:1: ( ',' )
            {
            // InternalVampireLanguage.g:1539:1: ( ',' )
            // InternalVampireLanguage.g:1540:2: ','
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
    // InternalVampireLanguage.g:1549:1: rule__VLSInclude__Group_2_2__1 : rule__VLSInclude__Group_2_2__1__Impl ;
    public final void rule__VLSInclude__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1553:1: ( rule__VLSInclude__Group_2_2__1__Impl )
            // InternalVampireLanguage.g:1554:2: rule__VLSInclude__Group_2_2__1__Impl
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
    // InternalVampireLanguage.g:1560:1: rule__VLSInclude__Group_2_2__1__Impl : ( ( rule__VLSInclude__NamesAssignment_2_2_1 ) ) ;
    public final void rule__VLSInclude__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1564:1: ( ( ( rule__VLSInclude__NamesAssignment_2_2_1 ) ) )
            // InternalVampireLanguage.g:1565:1: ( ( rule__VLSInclude__NamesAssignment_2_2_1 ) )
            {
            // InternalVampireLanguage.g:1565:1: ( ( rule__VLSInclude__NamesAssignment_2_2_1 ) )
            // InternalVampireLanguage.g:1566:2: ( rule__VLSInclude__NamesAssignment_2_2_1 )
            {
             before(grammarAccess.getVLSIncludeAccess().getNamesAssignment_2_2_1()); 
            // InternalVampireLanguage.g:1567:2: ( rule__VLSInclude__NamesAssignment_2_2_1 )
            // InternalVampireLanguage.g:1567:3: rule__VLSInclude__NamesAssignment_2_2_1
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
    // InternalVampireLanguage.g:1576:1: rule__VLSComment__Group__0 : rule__VLSComment__Group__0__Impl rule__VLSComment__Group__1 ;
    public final void rule__VLSComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1580:1: ( rule__VLSComment__Group__0__Impl rule__VLSComment__Group__1 )
            // InternalVampireLanguage.g:1581:2: rule__VLSComment__Group__0__Impl rule__VLSComment__Group__1
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
    // InternalVampireLanguage.g:1588:1: rule__VLSComment__Group__0__Impl : ( '%' ) ;
    public final void rule__VLSComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1592:1: ( ( '%' ) )
            // InternalVampireLanguage.g:1593:1: ( '%' )
            {
            // InternalVampireLanguage.g:1593:1: ( '%' )
            // InternalVampireLanguage.g:1594:2: '%'
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
    // InternalVampireLanguage.g:1603:1: rule__VLSComment__Group__1 : rule__VLSComment__Group__1__Impl ;
    public final void rule__VLSComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1607:1: ( rule__VLSComment__Group__1__Impl )
            // InternalVampireLanguage.g:1608:2: rule__VLSComment__Group__1__Impl
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
    // InternalVampireLanguage.g:1614:1: rule__VLSComment__Group__1__Impl : ( ( rule__VLSComment__CommentAssignment_1 ) ) ;
    public final void rule__VLSComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1618:1: ( ( ( rule__VLSComment__CommentAssignment_1 ) ) )
            // InternalVampireLanguage.g:1619:1: ( ( rule__VLSComment__CommentAssignment_1 ) )
            {
            // InternalVampireLanguage.g:1619:1: ( ( rule__VLSComment__CommentAssignment_1 ) )
            // InternalVampireLanguage.g:1620:2: ( rule__VLSComment__CommentAssignment_1 )
            {
             before(grammarAccess.getVLSCommentAccess().getCommentAssignment_1()); 
            // InternalVampireLanguage.g:1621:2: ( rule__VLSComment__CommentAssignment_1 )
            // InternalVampireLanguage.g:1621:3: rule__VLSComment__CommentAssignment_1
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


    // $ANTLR start "rule__VLSSatisfiable__Group__0"
    // InternalVampireLanguage.g:1630:1: rule__VLSSatisfiable__Group__0 : rule__VLSSatisfiable__Group__0__Impl rule__VLSSatisfiable__Group__1 ;
    public final void rule__VLSSatisfiable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1634:1: ( rule__VLSSatisfiable__Group__0__Impl rule__VLSSatisfiable__Group__1 )
            // InternalVampireLanguage.g:1635:2: rule__VLSSatisfiable__Group__0__Impl rule__VLSSatisfiable__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__VLSSatisfiable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VLSSatisfiable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSSatisfiable__Group__0"


    // $ANTLR start "rule__VLSSatisfiable__Group__0__Impl"
    // InternalVampireLanguage.g:1642:1: rule__VLSSatisfiable__Group__0__Impl : ( () ) ;
    public final void rule__VLSSatisfiable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1646:1: ( ( () ) )
            // InternalVampireLanguage.g:1647:1: ( () )
            {
            // InternalVampireLanguage.g:1647:1: ( () )
            // InternalVampireLanguage.g:1648:2: ()
            {
             before(grammarAccess.getVLSSatisfiableAccess().getVLSSatisfiableAction_0()); 
            // InternalVampireLanguage.g:1649:2: ()
            // InternalVampireLanguage.g:1649:3: 
            {
            }

             after(grammarAccess.getVLSSatisfiableAccess().getVLSSatisfiableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSSatisfiable__Group__0__Impl"


    // $ANTLR start "rule__VLSSatisfiable__Group__1"
    // InternalVampireLanguage.g:1657:1: rule__VLSSatisfiable__Group__1 : rule__VLSSatisfiable__Group__1__Impl ;
    public final void rule__VLSSatisfiable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1661:1: ( rule__VLSSatisfiable__Group__1__Impl )
            // InternalVampireLanguage.g:1662:2: rule__VLSSatisfiable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VLSSatisfiable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSSatisfiable__Group__1"


    // $ANTLR start "rule__VLSSatisfiable__Group__1__Impl"
    // InternalVampireLanguage.g:1668:1: rule__VLSSatisfiable__Group__1__Impl : ( 'Satisfiable!' ) ;
    public final void rule__VLSSatisfiable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1672:1: ( ( 'Satisfiable!' ) )
            // InternalVampireLanguage.g:1673:1: ( 'Satisfiable!' )
            {
            // InternalVampireLanguage.g:1673:1: ( 'Satisfiable!' )
            // InternalVampireLanguage.g:1674:2: 'Satisfiable!'
            {
             before(grammarAccess.getVLSSatisfiableAccess().getSatisfiableKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getVLSSatisfiableAccess().getSatisfiableKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSSatisfiable__Group__1__Impl"


    // $ANTLR start "rule__VLSFofFormula__Group__0"
    // InternalVampireLanguage.g:1684:1: rule__VLSFofFormula__Group__0 : rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1 ;
    public final void rule__VLSFofFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1688:1: ( rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1 )
            // InternalVampireLanguage.g:1689:2: rule__VLSFofFormula__Group__0__Impl rule__VLSFofFormula__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalVampireLanguage.g:1696:1: rule__VLSFofFormula__Group__0__Impl : ( 'fof' ) ;
    public final void rule__VLSFofFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1700:1: ( ( 'fof' ) )
            // InternalVampireLanguage.g:1701:1: ( 'fof' )
            {
            // InternalVampireLanguage.g:1701:1: ( 'fof' )
            // InternalVampireLanguage.g:1702:2: 'fof'
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalVampireLanguage.g:1711:1: rule__VLSFofFormula__Group__1 : rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2 ;
    public final void rule__VLSFofFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1715:1: ( rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2 )
            // InternalVampireLanguage.g:1716:2: rule__VLSFofFormula__Group__1__Impl rule__VLSFofFormula__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalVampireLanguage.g:1723:1: rule__VLSFofFormula__Group__1__Impl : ( '(' ) ;
    public final void rule__VLSFofFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1727:1: ( ( '(' ) )
            // InternalVampireLanguage.g:1728:1: ( '(' )
            {
            // InternalVampireLanguage.g:1728:1: ( '(' )
            // InternalVampireLanguage.g:1729:2: '('
            {
             before(grammarAccess.getVLSFofFormulaAccess().getLeftParenthesisKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalVampireLanguage.g:1738:1: rule__VLSFofFormula__Group__2 : rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3 ;
    public final void rule__VLSFofFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1742:1: ( rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3 )
            // InternalVampireLanguage.g:1743:2: rule__VLSFofFormula__Group__2__Impl rule__VLSFofFormula__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalVampireLanguage.g:1750:1: rule__VLSFofFormula__Group__2__Impl : ( ( rule__VLSFofFormula__NameAssignment_2 ) ) ;
    public final void rule__VLSFofFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1754:1: ( ( ( rule__VLSFofFormula__NameAssignment_2 ) ) )
            // InternalVampireLanguage.g:1755:1: ( ( rule__VLSFofFormula__NameAssignment_2 ) )
            {
            // InternalVampireLanguage.g:1755:1: ( ( rule__VLSFofFormula__NameAssignment_2 ) )
            // InternalVampireLanguage.g:1756:2: ( rule__VLSFofFormula__NameAssignment_2 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getNameAssignment_2()); 
            // InternalVampireLanguage.g:1757:2: ( rule__VLSFofFormula__NameAssignment_2 )
            // InternalVampireLanguage.g:1757:3: rule__VLSFofFormula__NameAssignment_2
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
    // InternalVampireLanguage.g:1765:1: rule__VLSFofFormula__Group__3 : rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4 ;
    public final void rule__VLSFofFormula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1769:1: ( rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4 )
            // InternalVampireLanguage.g:1770:2: rule__VLSFofFormula__Group__3__Impl rule__VLSFofFormula__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalVampireLanguage.g:1777:1: rule__VLSFofFormula__Group__3__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1781:1: ( ( ',' ) )
            // InternalVampireLanguage.g:1782:1: ( ',' )
            {
            // InternalVampireLanguage.g:1782:1: ( ',' )
            // InternalVampireLanguage.g:1783:2: ','
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
    // InternalVampireLanguage.g:1792:1: rule__VLSFofFormula__Group__4 : rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5 ;
    public final void rule__VLSFofFormula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1796:1: ( rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5 )
            // InternalVampireLanguage.g:1797:2: rule__VLSFofFormula__Group__4__Impl rule__VLSFofFormula__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalVampireLanguage.g:1804:1: rule__VLSFofFormula__Group__4__Impl : ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) ) ;
    public final void rule__VLSFofFormula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1808:1: ( ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) ) )
            // InternalVampireLanguage.g:1809:1: ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) )
            {
            // InternalVampireLanguage.g:1809:1: ( ( rule__VLSFofFormula__FofRoleAssignment_4 ) )
            // InternalVampireLanguage.g:1810:2: ( rule__VLSFofFormula__FofRoleAssignment_4 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofRoleAssignment_4()); 
            // InternalVampireLanguage.g:1811:2: ( rule__VLSFofFormula__FofRoleAssignment_4 )
            // InternalVampireLanguage.g:1811:3: rule__VLSFofFormula__FofRoleAssignment_4
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
    // InternalVampireLanguage.g:1819:1: rule__VLSFofFormula__Group__5 : rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6 ;
    public final void rule__VLSFofFormula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1823:1: ( rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6 )
            // InternalVampireLanguage.g:1824:2: rule__VLSFofFormula__Group__5__Impl rule__VLSFofFormula__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalVampireLanguage.g:1831:1: rule__VLSFofFormula__Group__5__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1835:1: ( ( ',' ) )
            // InternalVampireLanguage.g:1836:1: ( ',' )
            {
            // InternalVampireLanguage.g:1836:1: ( ',' )
            // InternalVampireLanguage.g:1837:2: ','
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
    // InternalVampireLanguage.g:1846:1: rule__VLSFofFormula__Group__6 : rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7 ;
    public final void rule__VLSFofFormula__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1850:1: ( rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7 )
            // InternalVampireLanguage.g:1851:2: rule__VLSFofFormula__Group__6__Impl rule__VLSFofFormula__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalVampireLanguage.g:1858:1: rule__VLSFofFormula__Group__6__Impl : ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) ) ;
    public final void rule__VLSFofFormula__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1862:1: ( ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) ) )
            // InternalVampireLanguage.g:1863:1: ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) )
            {
            // InternalVampireLanguage.g:1863:1: ( ( rule__VLSFofFormula__FofFormulaAssignment_6 ) )
            // InternalVampireLanguage.g:1864:2: ( rule__VLSFofFormula__FofFormulaAssignment_6 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFofFormulaAssignment_6()); 
            // InternalVampireLanguage.g:1865:2: ( rule__VLSFofFormula__FofFormulaAssignment_6 )
            // InternalVampireLanguage.g:1865:3: rule__VLSFofFormula__FofFormulaAssignment_6
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
    // InternalVampireLanguage.g:1873:1: rule__VLSFofFormula__Group__7 : rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8 ;
    public final void rule__VLSFofFormula__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1877:1: ( rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8 )
            // InternalVampireLanguage.g:1878:2: rule__VLSFofFormula__Group__7__Impl rule__VLSFofFormula__Group__8
            {
            pushFollow(FOLLOW_18);
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
    // InternalVampireLanguage.g:1885:1: rule__VLSFofFormula__Group__7__Impl : ( ( rule__VLSFofFormula__Group_7__0 )? ) ;
    public final void rule__VLSFofFormula__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1889:1: ( ( ( rule__VLSFofFormula__Group_7__0 )? ) )
            // InternalVampireLanguage.g:1890:1: ( ( rule__VLSFofFormula__Group_7__0 )? )
            {
            // InternalVampireLanguage.g:1890:1: ( ( rule__VLSFofFormula__Group_7__0 )? )
            // InternalVampireLanguage.g:1891:2: ( rule__VLSFofFormula__Group_7__0 )?
            {
             before(grammarAccess.getVLSFofFormulaAccess().getGroup_7()); 
            // InternalVampireLanguage.g:1892:2: ( rule__VLSFofFormula__Group_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVampireLanguage.g:1892:3: rule__VLSFofFormula__Group_7__0
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
    // InternalVampireLanguage.g:1900:1: rule__VLSFofFormula__Group__8 : rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9 ;
    public final void rule__VLSFofFormula__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1904:1: ( rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9 )
            // InternalVampireLanguage.g:1905:2: rule__VLSFofFormula__Group__8__Impl rule__VLSFofFormula__Group__9
            {
            pushFollow(FOLLOW_19);
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
    // InternalVampireLanguage.g:1912:1: rule__VLSFofFormula__Group__8__Impl : ( ')' ) ;
    public final void rule__VLSFofFormula__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1916:1: ( ( ')' ) )
            // InternalVampireLanguage.g:1917:1: ( ')' )
            {
            // InternalVampireLanguage.g:1917:1: ( ')' )
            // InternalVampireLanguage.g:1918:2: ')'
            {
             before(grammarAccess.getVLSFofFormulaAccess().getRightParenthesisKeyword_8()); 
            match(input,50,FOLLOW_2); 
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
    // InternalVampireLanguage.g:1927:1: rule__VLSFofFormula__Group__9 : rule__VLSFofFormula__Group__9__Impl ;
    public final void rule__VLSFofFormula__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1931:1: ( rule__VLSFofFormula__Group__9__Impl )
            // InternalVampireLanguage.g:1932:2: rule__VLSFofFormula__Group__9__Impl
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
    // InternalVampireLanguage.g:1938:1: rule__VLSFofFormula__Group__9__Impl : ( '.' ) ;
    public final void rule__VLSFofFormula__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1942:1: ( ( '.' ) )
            // InternalVampireLanguage.g:1943:1: ( '.' )
            {
            // InternalVampireLanguage.g:1943:1: ( '.' )
            // InternalVampireLanguage.g:1944:2: '.'
            {
             before(grammarAccess.getVLSFofFormulaAccess().getFullStopKeyword_9()); 
            match(input,51,FOLLOW_2); 
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
    // InternalVampireLanguage.g:1954:1: rule__VLSFofFormula__Group_7__0 : rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1 ;
    public final void rule__VLSFofFormula__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1958:1: ( rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1 )
            // InternalVampireLanguage.g:1959:2: rule__VLSFofFormula__Group_7__0__Impl rule__VLSFofFormula__Group_7__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalVampireLanguage.g:1966:1: rule__VLSFofFormula__Group_7__0__Impl : ( ',' ) ;
    public final void rule__VLSFofFormula__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1970:1: ( ( ',' ) )
            // InternalVampireLanguage.g:1971:1: ( ',' )
            {
            // InternalVampireLanguage.g:1971:1: ( ',' )
            // InternalVampireLanguage.g:1972:2: ','
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
    // InternalVampireLanguage.g:1981:1: rule__VLSFofFormula__Group_7__1 : rule__VLSFofFormula__Group_7__1__Impl ;
    public final void rule__VLSFofFormula__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1985:1: ( rule__VLSFofFormula__Group_7__1__Impl )
            // InternalVampireLanguage.g:1986:2: rule__VLSFofFormula__Group_7__1__Impl
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
    // InternalVampireLanguage.g:1992:1: rule__VLSFofFormula__Group_7__1__Impl : ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) ) ;
    public final void rule__VLSFofFormula__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:1996:1: ( ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) ) )
            // InternalVampireLanguage.g:1997:1: ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) )
            {
            // InternalVampireLanguage.g:1997:1: ( ( rule__VLSFofFormula__AnnotationsAssignment_7_1 ) )
            // InternalVampireLanguage.g:1998:2: ( rule__VLSFofFormula__AnnotationsAssignment_7_1 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getAnnotationsAssignment_7_1()); 
            // InternalVampireLanguage.g:1999:2: ( rule__VLSFofFormula__AnnotationsAssignment_7_1 )
            // InternalVampireLanguage.g:1999:3: rule__VLSFofFormula__AnnotationsAssignment_7_1
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
    // InternalVampireLanguage.g:2008:1: rule__VLSTffFormula__Group__0 : rule__VLSTffFormula__Group__0__Impl rule__VLSTffFormula__Group__1 ;
    public final void rule__VLSTffFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2012:1: ( rule__VLSTffFormula__Group__0__Impl rule__VLSTffFormula__Group__1 )
            // InternalVampireLanguage.g:2013:2: rule__VLSTffFormula__Group__0__Impl rule__VLSTffFormula__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalVampireLanguage.g:2020:1: rule__VLSTffFormula__Group__0__Impl : ( 'tff' ) ;
    public final void rule__VLSTffFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2024:1: ( ( 'tff' ) )
            // InternalVampireLanguage.g:2025:1: ( 'tff' )
            {
            // InternalVampireLanguage.g:2025:1: ( 'tff' )
            // InternalVampireLanguage.g:2026:2: 'tff'
            {
             before(grammarAccess.getVLSTffFormulaAccess().getTffKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2035:1: rule__VLSTffFormula__Group__1 : rule__VLSTffFormula__Group__1__Impl rule__VLSTffFormula__Group__2 ;
    public final void rule__VLSTffFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2039:1: ( rule__VLSTffFormula__Group__1__Impl rule__VLSTffFormula__Group__2 )
            // InternalVampireLanguage.g:2040:2: rule__VLSTffFormula__Group__1__Impl rule__VLSTffFormula__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalVampireLanguage.g:2047:1: rule__VLSTffFormula__Group__1__Impl : ( '(' ) ;
    public final void rule__VLSTffFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2051:1: ( ( '(' ) )
            // InternalVampireLanguage.g:2052:1: ( '(' )
            {
            // InternalVampireLanguage.g:2052:1: ( '(' )
            // InternalVampireLanguage.g:2053:2: '('
            {
             before(grammarAccess.getVLSTffFormulaAccess().getLeftParenthesisKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2062:1: rule__VLSTffFormula__Group__2 : rule__VLSTffFormula__Group__2__Impl rule__VLSTffFormula__Group__3 ;
    public final void rule__VLSTffFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2066:1: ( rule__VLSTffFormula__Group__2__Impl rule__VLSTffFormula__Group__3 )
            // InternalVampireLanguage.g:2067:2: rule__VLSTffFormula__Group__2__Impl rule__VLSTffFormula__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalVampireLanguage.g:2074:1: rule__VLSTffFormula__Group__2__Impl : ( ( rule__VLSTffFormula__NameAssignment_2 ) ) ;
    public final void rule__VLSTffFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2078:1: ( ( ( rule__VLSTffFormula__NameAssignment_2 ) ) )
            // InternalVampireLanguage.g:2079:1: ( ( rule__VLSTffFormula__NameAssignment_2 ) )
            {
            // InternalVampireLanguage.g:2079:1: ( ( rule__VLSTffFormula__NameAssignment_2 ) )
            // InternalVampireLanguage.g:2080:2: ( rule__VLSTffFormula__NameAssignment_2 )
            {
             before(grammarAccess.getVLSTffFormulaAccess().getNameAssignment_2()); 
            // InternalVampireLanguage.g:2081:2: ( rule__VLSTffFormula__NameAssignment_2 )
            // InternalVampireLanguage.g:2081:3: rule__VLSTffFormula__NameAssignment_2
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
    // InternalVampireLanguage.g:2089:1: rule__VLSTffFormula__Group__3 : rule__VLSTffFormula__Group__3__Impl rule__VLSTffFormula__Group__4 ;
    public final void rule__VLSTffFormula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2093:1: ( rule__VLSTffFormula__Group__3__Impl rule__VLSTffFormula__Group__4 )
            // InternalVampireLanguage.g:2094:2: rule__VLSTffFormula__Group__3__Impl rule__VLSTffFormula__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalVampireLanguage.g:2101:1: rule__VLSTffFormula__Group__3__Impl : ( ',' ) ;
    public final void rule__VLSTffFormula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2105:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2106:1: ( ',' )
            {
            // InternalVampireLanguage.g:2106:1: ( ',' )
            // InternalVampireLanguage.g:2107:2: ','
            {
             before(grammarAccess.getVLSTffFormulaAccess().getCommaKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2116:1: rule__VLSTffFormula__Group__4 : rule__VLSTffFormula__Group__4__Impl rule__VLSTffFormula__Group__5 ;
    public final void rule__VLSTffFormula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2120:1: ( rule__VLSTffFormula__Group__4__Impl rule__VLSTffFormula__Group__5 )
            // InternalVampireLanguage.g:2121:2: rule__VLSTffFormula__Group__4__Impl rule__VLSTffFormula__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalVampireLanguage.g:2128:1: rule__VLSTffFormula__Group__4__Impl : ( ( rule__VLSTffFormula__FofRoleAssignment_4 ) ) ;
    public final void rule__VLSTffFormula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2132:1: ( ( ( rule__VLSTffFormula__FofRoleAssignment_4 ) ) )
            // InternalVampireLanguage.g:2133:1: ( ( rule__VLSTffFormula__FofRoleAssignment_4 ) )
            {
            // InternalVampireLanguage.g:2133:1: ( ( rule__VLSTffFormula__FofRoleAssignment_4 ) )
            // InternalVampireLanguage.g:2134:2: ( rule__VLSTffFormula__FofRoleAssignment_4 )
            {
             before(grammarAccess.getVLSTffFormulaAccess().getFofRoleAssignment_4()); 
            // InternalVampireLanguage.g:2135:2: ( rule__VLSTffFormula__FofRoleAssignment_4 )
            // InternalVampireLanguage.g:2135:3: rule__VLSTffFormula__FofRoleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__FofRoleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVLSTffFormulaAccess().getFofRoleAssignment_4()); 

            }


            }

        }
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
    // InternalVampireLanguage.g:2143:1: rule__VLSTffFormula__Group__5 : rule__VLSTffFormula__Group__5__Impl rule__VLSTffFormula__Group__6 ;
    public final void rule__VLSTffFormula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2147:1: ( rule__VLSTffFormula__Group__5__Impl rule__VLSTffFormula__Group__6 )
            // InternalVampireLanguage.g:2148:2: rule__VLSTffFormula__Group__5__Impl rule__VLSTffFormula__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalVampireLanguage.g:2155:1: rule__VLSTffFormula__Group__5__Impl : ( ',' ) ;
    public final void rule__VLSTffFormula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2159:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2160:1: ( ',' )
            {
            // InternalVampireLanguage.g:2160:1: ( ',' )
            // InternalVampireLanguage.g:2161:2: ','
            {
             before(grammarAccess.getVLSTffFormulaAccess().getCommaKeyword_5()); 
            match(input,45,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2170:1: rule__VLSTffFormula__Group__6 : rule__VLSTffFormula__Group__6__Impl rule__VLSTffFormula__Group__7 ;
    public final void rule__VLSTffFormula__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2174:1: ( rule__VLSTffFormula__Group__6__Impl rule__VLSTffFormula__Group__7 )
            // InternalVampireLanguage.g:2175:2: rule__VLSTffFormula__Group__6__Impl rule__VLSTffFormula__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalVampireLanguage.g:2182:1: rule__VLSTffFormula__Group__6__Impl : ( ( rule__VLSTffFormula__FofFormulaAssignment_6 ) ) ;
    public final void rule__VLSTffFormula__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2186:1: ( ( ( rule__VLSTffFormula__FofFormulaAssignment_6 ) ) )
            // InternalVampireLanguage.g:2187:1: ( ( rule__VLSTffFormula__FofFormulaAssignment_6 ) )
            {
            // InternalVampireLanguage.g:2187:1: ( ( rule__VLSTffFormula__FofFormulaAssignment_6 ) )
            // InternalVampireLanguage.g:2188:2: ( rule__VLSTffFormula__FofFormulaAssignment_6 )
            {
             before(grammarAccess.getVLSTffFormulaAccess().getFofFormulaAssignment_6()); 
            // InternalVampireLanguage.g:2189:2: ( rule__VLSTffFormula__FofFormulaAssignment_6 )
            // InternalVampireLanguage.g:2189:3: rule__VLSTffFormula__FofFormulaAssignment_6
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
    // InternalVampireLanguage.g:2197:1: rule__VLSTffFormula__Group__7 : rule__VLSTffFormula__Group__7__Impl rule__VLSTffFormula__Group__8 ;
    public final void rule__VLSTffFormula__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2201:1: ( rule__VLSTffFormula__Group__7__Impl rule__VLSTffFormula__Group__8 )
            // InternalVampireLanguage.g:2202:2: rule__VLSTffFormula__Group__7__Impl rule__VLSTffFormula__Group__8
            {
            pushFollow(FOLLOW_18);
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
    // InternalVampireLanguage.g:2209:1: rule__VLSTffFormula__Group__7__Impl : ( ( rule__VLSTffFormula__Group_7__0 )? ) ;
    public final void rule__VLSTffFormula__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2213:1: ( ( ( rule__VLSTffFormula__Group_7__0 )? ) )
            // InternalVampireLanguage.g:2214:1: ( ( rule__VLSTffFormula__Group_7__0 )? )
            {
            // InternalVampireLanguage.g:2214:1: ( ( rule__VLSTffFormula__Group_7__0 )? )
            // InternalVampireLanguage.g:2215:2: ( rule__VLSTffFormula__Group_7__0 )?
            {
             before(grammarAccess.getVLSTffFormulaAccess().getGroup_7()); 
            // InternalVampireLanguage.g:2216:2: ( rule__VLSTffFormula__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVampireLanguage.g:2216:3: rule__VLSTffFormula__Group_7__0
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
    // InternalVampireLanguage.g:2224:1: rule__VLSTffFormula__Group__8 : rule__VLSTffFormula__Group__8__Impl rule__VLSTffFormula__Group__9 ;
    public final void rule__VLSTffFormula__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2228:1: ( rule__VLSTffFormula__Group__8__Impl rule__VLSTffFormula__Group__9 )
            // InternalVampireLanguage.g:2229:2: rule__VLSTffFormula__Group__8__Impl rule__VLSTffFormula__Group__9
            {
            pushFollow(FOLLOW_19);
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
    // InternalVampireLanguage.g:2236:1: rule__VLSTffFormula__Group__8__Impl : ( ')' ) ;
    public final void rule__VLSTffFormula__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2240:1: ( ( ')' ) )
            // InternalVampireLanguage.g:2241:1: ( ')' )
            {
            // InternalVampireLanguage.g:2241:1: ( ')' )
            // InternalVampireLanguage.g:2242:2: ')'
            {
             before(grammarAccess.getVLSTffFormulaAccess().getRightParenthesisKeyword_8()); 
            match(input,50,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2251:1: rule__VLSTffFormula__Group__9 : rule__VLSTffFormula__Group__9__Impl ;
    public final void rule__VLSTffFormula__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2255:1: ( rule__VLSTffFormula__Group__9__Impl )
            // InternalVampireLanguage.g:2256:2: rule__VLSTffFormula__Group__9__Impl
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
    // InternalVampireLanguage.g:2262:1: rule__VLSTffFormula__Group__9__Impl : ( '.' ) ;
    public final void rule__VLSTffFormula__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2266:1: ( ( '.' ) )
            // InternalVampireLanguage.g:2267:1: ( '.' )
            {
            // InternalVampireLanguage.g:2267:1: ( '.' )
            // InternalVampireLanguage.g:2268:2: '.'
            {
             before(grammarAccess.getVLSTffFormulaAccess().getFullStopKeyword_9()); 
            match(input,51,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2278:1: rule__VLSTffFormula__Group_7__0 : rule__VLSTffFormula__Group_7__0__Impl rule__VLSTffFormula__Group_7__1 ;
    public final void rule__VLSTffFormula__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2282:1: ( rule__VLSTffFormula__Group_7__0__Impl rule__VLSTffFormula__Group_7__1 )
            // InternalVampireLanguage.g:2283:2: rule__VLSTffFormula__Group_7__0__Impl rule__VLSTffFormula__Group_7__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalVampireLanguage.g:2290:1: rule__VLSTffFormula__Group_7__0__Impl : ( ',' ) ;
    public final void rule__VLSTffFormula__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2294:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2295:1: ( ',' )
            {
            // InternalVampireLanguage.g:2295:1: ( ',' )
            // InternalVampireLanguage.g:2296:2: ','
            {
             before(grammarAccess.getVLSTffFormulaAccess().getCommaKeyword_7_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2305:1: rule__VLSTffFormula__Group_7__1 : rule__VLSTffFormula__Group_7__1__Impl ;
    public final void rule__VLSTffFormula__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2309:1: ( rule__VLSTffFormula__Group_7__1__Impl )
            // InternalVampireLanguage.g:2310:2: rule__VLSTffFormula__Group_7__1__Impl
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
    // InternalVampireLanguage.g:2316:1: rule__VLSTffFormula__Group_7__1__Impl : ( ( rule__VLSTffFormula__AnnotationsAssignment_7_1 ) ) ;
    public final void rule__VLSTffFormula__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2320:1: ( ( ( rule__VLSTffFormula__AnnotationsAssignment_7_1 ) ) )
            // InternalVampireLanguage.g:2321:1: ( ( rule__VLSTffFormula__AnnotationsAssignment_7_1 ) )
            {
            // InternalVampireLanguage.g:2321:1: ( ( rule__VLSTffFormula__AnnotationsAssignment_7_1 ) )
            // InternalVampireLanguage.g:2322:2: ( rule__VLSTffFormula__AnnotationsAssignment_7_1 )
            {
             before(grammarAccess.getVLSTffFormulaAccess().getAnnotationsAssignment_7_1()); 
            // InternalVampireLanguage.g:2323:2: ( rule__VLSTffFormula__AnnotationsAssignment_7_1 )
            // InternalVampireLanguage.g:2323:3: rule__VLSTffFormula__AnnotationsAssignment_7_1
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


    // $ANTLR start "rule__VLSAnnotation__Group__0"
    // InternalVampireLanguage.g:2332:1: rule__VLSAnnotation__Group__0 : rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1 ;
    public final void rule__VLSAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2336:1: ( rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1 )
            // InternalVampireLanguage.g:2337:2: rule__VLSAnnotation__Group__0__Impl rule__VLSAnnotation__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalVampireLanguage.g:2344:1: rule__VLSAnnotation__Group__0__Impl : ( ( '[' )? ) ;
    public final void rule__VLSAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2348:1: ( ( ( '[' )? ) )
            // InternalVampireLanguage.g:2349:1: ( ( '[' )? )
            {
            // InternalVampireLanguage.g:2349:1: ( ( '[' )? )
            // InternalVampireLanguage.g:2350:2: ( '[' )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getLeftSquareBracketKeyword_0()); 
            // InternalVampireLanguage.g:2351:2: ( '[' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==53) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVampireLanguage.g:2351:3: '['
                    {
                    match(input,53,FOLLOW_2); 

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
    // InternalVampireLanguage.g:2359:1: rule__VLSAnnotation__Group__1 : rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2 ;
    public final void rule__VLSAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2363:1: ( rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2 )
            // InternalVampireLanguage.g:2364:2: rule__VLSAnnotation__Group__1__Impl rule__VLSAnnotation__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalVampireLanguage.g:2371:1: rule__VLSAnnotation__Group__1__Impl : ( ( rule__VLSAnnotation__NameAssignment_1 )? ) ;
    public final void rule__VLSAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2375:1: ( ( ( rule__VLSAnnotation__NameAssignment_1 )? ) )
            // InternalVampireLanguage.g:2376:1: ( ( rule__VLSAnnotation__NameAssignment_1 )? )
            {
            // InternalVampireLanguage.g:2376:1: ( ( rule__VLSAnnotation__NameAssignment_1 )? )
            // InternalVampireLanguage.g:2377:2: ( rule__VLSAnnotation__NameAssignment_1 )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getNameAssignment_1()); 
            // InternalVampireLanguage.g:2378:2: ( rule__VLSAnnotation__NameAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_LOWER_WORD_ID && LA27_0<=RULE_SINGLE_QUOTE)||(LA27_0>=27 && LA27_0<=41)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVampireLanguage.g:2378:3: rule__VLSAnnotation__NameAssignment_1
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
    // InternalVampireLanguage.g:2386:1: rule__VLSAnnotation__Group__2 : rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3 ;
    public final void rule__VLSAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2390:1: ( rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3 )
            // InternalVampireLanguage.g:2391:2: rule__VLSAnnotation__Group__2__Impl rule__VLSAnnotation__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalVampireLanguage.g:2398:1: rule__VLSAnnotation__Group__2__Impl : ( ( rule__VLSAnnotation__Group_2__0 )? ) ;
    public final void rule__VLSAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2402:1: ( ( ( rule__VLSAnnotation__Group_2__0 )? ) )
            // InternalVampireLanguage.g:2403:1: ( ( rule__VLSAnnotation__Group_2__0 )? )
            {
            // InternalVampireLanguage.g:2403:1: ( ( rule__VLSAnnotation__Group_2__0 )? )
            // InternalVampireLanguage.g:2404:2: ( rule__VLSAnnotation__Group_2__0 )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getGroup_2()); 
            // InternalVampireLanguage.g:2405:2: ( rule__VLSAnnotation__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==49) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVampireLanguage.g:2405:3: rule__VLSAnnotation__Group_2__0
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
    // InternalVampireLanguage.g:2413:1: rule__VLSAnnotation__Group__3 : rule__VLSAnnotation__Group__3__Impl ;
    public final void rule__VLSAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2417:1: ( rule__VLSAnnotation__Group__3__Impl )
            // InternalVampireLanguage.g:2418:2: rule__VLSAnnotation__Group__3__Impl
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
    // InternalVampireLanguage.g:2424:1: rule__VLSAnnotation__Group__3__Impl : ( ( ']' )? ) ;
    public final void rule__VLSAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2428:1: ( ( ( ']' )? ) )
            // InternalVampireLanguage.g:2429:1: ( ( ']' )? )
            {
            // InternalVampireLanguage.g:2429:1: ( ( ']' )? )
            // InternalVampireLanguage.g:2430:2: ( ']' )?
            {
             before(grammarAccess.getVLSAnnotationAccess().getRightSquareBracketKeyword_3()); 
            // InternalVampireLanguage.g:2431:2: ( ']' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVampireLanguage.g:2431:3: ']'
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
    // InternalVampireLanguage.g:2440:1: rule__VLSAnnotation__Group_2__0 : rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1 ;
    public final void rule__VLSAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2444:1: ( rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1 )
            // InternalVampireLanguage.g:2445:2: rule__VLSAnnotation__Group_2__0__Impl rule__VLSAnnotation__Group_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalVampireLanguage.g:2452:1: rule__VLSAnnotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__VLSAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2456:1: ( ( '(' ) )
            // InternalVampireLanguage.g:2457:1: ( '(' )
            {
            // InternalVampireLanguage.g:2457:1: ( '(' )
            // InternalVampireLanguage.g:2458:2: '('
            {
             before(grammarAccess.getVLSAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2467:1: rule__VLSAnnotation__Group_2__1 : rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2 ;
    public final void rule__VLSAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2471:1: ( rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2 )
            // InternalVampireLanguage.g:2472:2: rule__VLSAnnotation__Group_2__1__Impl rule__VLSAnnotation__Group_2__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalVampireLanguage.g:2479:1: rule__VLSAnnotation__Group_2__1__Impl : ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) ) ;
    public final void rule__VLSAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2483:1: ( ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) ) )
            // InternalVampireLanguage.g:2484:1: ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) )
            {
            // InternalVampireLanguage.g:2484:1: ( ( rule__VLSAnnotation__FollowupAssignment_2_1 ) )
            // InternalVampireLanguage.g:2485:2: ( rule__VLSAnnotation__FollowupAssignment_2_1 )
            {
             before(grammarAccess.getVLSAnnotationAccess().getFollowupAssignment_2_1()); 
            // InternalVampireLanguage.g:2486:2: ( rule__VLSAnnotation__FollowupAssignment_2_1 )
            // InternalVampireLanguage.g:2486:3: rule__VLSAnnotation__FollowupAssignment_2_1
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
    // InternalVampireLanguage.g:2494:1: rule__VLSAnnotation__Group_2__2 : rule__VLSAnnotation__Group_2__2__Impl ;
    public final void rule__VLSAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2498:1: ( rule__VLSAnnotation__Group_2__2__Impl )
            // InternalVampireLanguage.g:2499:2: rule__VLSAnnotation__Group_2__2__Impl
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
    // InternalVampireLanguage.g:2505:1: rule__VLSAnnotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__VLSAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2509:1: ( ( ')' ) )
            // InternalVampireLanguage.g:2510:1: ( ')' )
            {
            // InternalVampireLanguage.g:2510:1: ( ')' )
            // InternalVampireLanguage.g:2511:2: ')'
            {
             before(grammarAccess.getVLSAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2521:1: rule__VLSAnnotationTerms__Group__0 : rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1 ;
    public final void rule__VLSAnnotationTerms__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2525:1: ( rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1 )
            // InternalVampireLanguage.g:2526:2: rule__VLSAnnotationTerms__Group__0__Impl rule__VLSAnnotationTerms__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalVampireLanguage.g:2533:1: rule__VLSAnnotationTerms__Group__0__Impl : ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) ) ;
    public final void rule__VLSAnnotationTerms__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2537:1: ( ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) ) )
            // InternalVampireLanguage.g:2538:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) )
            {
            // InternalVampireLanguage.g:2538:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_0 ) )
            // InternalVampireLanguage.g:2539:2: ( rule__VLSAnnotationTerms__TermsAssignment_0 )
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getTermsAssignment_0()); 
            // InternalVampireLanguage.g:2540:2: ( rule__VLSAnnotationTerms__TermsAssignment_0 )
            // InternalVampireLanguage.g:2540:3: rule__VLSAnnotationTerms__TermsAssignment_0
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
    // InternalVampireLanguage.g:2548:1: rule__VLSAnnotationTerms__Group__1 : rule__VLSAnnotationTerms__Group__1__Impl ;
    public final void rule__VLSAnnotationTerms__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2552:1: ( rule__VLSAnnotationTerms__Group__1__Impl )
            // InternalVampireLanguage.g:2553:2: rule__VLSAnnotationTerms__Group__1__Impl
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
    // InternalVampireLanguage.g:2559:1: rule__VLSAnnotationTerms__Group__1__Impl : ( ( rule__VLSAnnotationTerms__Group_1__0 )* ) ;
    public final void rule__VLSAnnotationTerms__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2563:1: ( ( ( rule__VLSAnnotationTerms__Group_1__0 )* ) )
            // InternalVampireLanguage.g:2564:1: ( ( rule__VLSAnnotationTerms__Group_1__0 )* )
            {
            // InternalVampireLanguage.g:2564:1: ( ( rule__VLSAnnotationTerms__Group_1__0 )* )
            // InternalVampireLanguage.g:2565:2: ( rule__VLSAnnotationTerms__Group_1__0 )*
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getGroup_1()); 
            // InternalVampireLanguage.g:2566:2: ( rule__VLSAnnotationTerms__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==45) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalVampireLanguage.g:2566:3: rule__VLSAnnotationTerms__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__VLSAnnotationTerms__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalVampireLanguage.g:2575:1: rule__VLSAnnotationTerms__Group_1__0 : rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1 ;
    public final void rule__VLSAnnotationTerms__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2579:1: ( rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1 )
            // InternalVampireLanguage.g:2580:2: rule__VLSAnnotationTerms__Group_1__0__Impl rule__VLSAnnotationTerms__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalVampireLanguage.g:2587:1: rule__VLSAnnotationTerms__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VLSAnnotationTerms__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2591:1: ( ( ',' ) )
            // InternalVampireLanguage.g:2592:1: ( ',' )
            {
            // InternalVampireLanguage.g:2592:1: ( ',' )
            // InternalVampireLanguage.g:2593:2: ','
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
    // InternalVampireLanguage.g:2602:1: rule__VLSAnnotationTerms__Group_1__1 : rule__VLSAnnotationTerms__Group_1__1__Impl ;
    public final void rule__VLSAnnotationTerms__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2606:1: ( rule__VLSAnnotationTerms__Group_1__1__Impl )
            // InternalVampireLanguage.g:2607:2: rule__VLSAnnotationTerms__Group_1__1__Impl
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
    // InternalVampireLanguage.g:2613:1: rule__VLSAnnotationTerms__Group_1__1__Impl : ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) ) ;
    public final void rule__VLSAnnotationTerms__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2617:1: ( ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:2618:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:2618:1: ( ( rule__VLSAnnotationTerms__TermsAssignment_1_1 ) )
            // InternalVampireLanguage.g:2619:2: ( rule__VLSAnnotationTerms__TermsAssignment_1_1 )
            {
             before(grammarAccess.getVLSAnnotationTermsAccess().getTermsAssignment_1_1()); 
            // InternalVampireLanguage.g:2620:2: ( rule__VLSAnnotationTerms__TermsAssignment_1_1 )
            // InternalVampireLanguage.g:2620:3: rule__VLSAnnotationTerms__TermsAssignment_1_1
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
    // InternalVampireLanguage.g:2629:1: rule__VLSBinary__Group__0 : rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1 ;
    public final void rule__VLSBinary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2633:1: ( rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1 )
            // InternalVampireLanguage.g:2634:2: rule__VLSBinary__Group__0__Impl rule__VLSBinary__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVampireLanguage.g:2641:1: rule__VLSBinary__Group__0__Impl : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2645:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:2646:1: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:2646:1: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:2647:2: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:2656:1: rule__VLSBinary__Group__1 : rule__VLSBinary__Group__1__Impl ;
    public final void rule__VLSBinary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2660:1: ( rule__VLSBinary__Group__1__Impl )
            // InternalVampireLanguage.g:2661:2: rule__VLSBinary__Group__1__Impl
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
    // InternalVampireLanguage.g:2667:1: rule__VLSBinary__Group__1__Impl : ( ( rule__VLSBinary__Alternatives_1 )? ) ;
    public final void rule__VLSBinary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2671:1: ( ( ( rule__VLSBinary__Alternatives_1 )? ) )
            // InternalVampireLanguage.g:2672:1: ( ( rule__VLSBinary__Alternatives_1 )? )
            {
            // InternalVampireLanguage.g:2672:1: ( ( rule__VLSBinary__Alternatives_1 )? )
            // InternalVampireLanguage.g:2673:2: ( rule__VLSBinary__Alternatives_1 )?
            {
             before(grammarAccess.getVLSBinaryAccess().getAlternatives_1()); 
            // InternalVampireLanguage.g:2674:2: ( rule__VLSBinary__Alternatives_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=54 && LA31_0<=61)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVampireLanguage.g:2674:3: rule__VLSBinary__Alternatives_1
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
    // InternalVampireLanguage.g:2683:1: rule__VLSBinary__Group_1_0__0 : rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1 ;
    public final void rule__VLSBinary__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2687:1: ( rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1 )
            // InternalVampireLanguage.g:2688:2: rule__VLSBinary__Group_1_0__0__Impl rule__VLSBinary__Group_1_0__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalVampireLanguage.g:2695:1: rule__VLSBinary__Group_1_0__0__Impl : ( ( rule__VLSBinary__Alternatives_1_0_0 ) ) ;
    public final void rule__VLSBinary__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2699:1: ( ( ( rule__VLSBinary__Alternatives_1_0_0 ) ) )
            // InternalVampireLanguage.g:2700:1: ( ( rule__VLSBinary__Alternatives_1_0_0 ) )
            {
            // InternalVampireLanguage.g:2700:1: ( ( rule__VLSBinary__Alternatives_1_0_0 ) )
            // InternalVampireLanguage.g:2701:2: ( rule__VLSBinary__Alternatives_1_0_0 )
            {
             before(grammarAccess.getVLSBinaryAccess().getAlternatives_1_0_0()); 
            // InternalVampireLanguage.g:2702:2: ( rule__VLSBinary__Alternatives_1_0_0 )
            // InternalVampireLanguage.g:2702:3: rule__VLSBinary__Alternatives_1_0_0
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
    // InternalVampireLanguage.g:2710:1: rule__VLSBinary__Group_1_0__1 : rule__VLSBinary__Group_1_0__1__Impl ;
    public final void rule__VLSBinary__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2714:1: ( rule__VLSBinary__Group_1_0__1__Impl )
            // InternalVampireLanguage.g:2715:2: rule__VLSBinary__Group_1_0__1__Impl
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
    // InternalVampireLanguage.g:2721:1: rule__VLSBinary__Group_1_0__1__Impl : ( ( rule__VLSBinary__RightAssignment_1_0_1 ) ) ;
    public final void rule__VLSBinary__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2725:1: ( ( ( rule__VLSBinary__RightAssignment_1_0_1 ) ) )
            // InternalVampireLanguage.g:2726:1: ( ( rule__VLSBinary__RightAssignment_1_0_1 ) )
            {
            // InternalVampireLanguage.g:2726:1: ( ( rule__VLSBinary__RightAssignment_1_0_1 ) )
            // InternalVampireLanguage.g:2727:2: ( rule__VLSBinary__RightAssignment_1_0_1 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_0_1()); 
            // InternalVampireLanguage.g:2728:2: ( rule__VLSBinary__RightAssignment_1_0_1 )
            // InternalVampireLanguage.g:2728:3: rule__VLSBinary__RightAssignment_1_0_1
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
    // InternalVampireLanguage.g:2737:1: rule__VLSBinary__Group_1_0_0_0__0 : rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1 ;
    public final void rule__VLSBinary__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2741:1: ( rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1 )
            // InternalVampireLanguage.g:2742:2: rule__VLSBinary__Group_1_0_0_0__0__Impl rule__VLSBinary__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalVampireLanguage.g:2749:1: rule__VLSBinary__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2753:1: ( ( () ) )
            // InternalVampireLanguage.g:2754:1: ( () )
            {
            // InternalVampireLanguage.g:2754:1: ( () )
            // InternalVampireLanguage.g:2755:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSEquivalentLeftAction_1_0_0_0_0()); 
            // InternalVampireLanguage.g:2756:2: ()
            // InternalVampireLanguage.g:2756:3: 
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
    // InternalVampireLanguage.g:2764:1: rule__VLSBinary__Group_1_0_0_0__1 : rule__VLSBinary__Group_1_0_0_0__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2768:1: ( rule__VLSBinary__Group_1_0_0_0__1__Impl )
            // InternalVampireLanguage.g:2769:2: rule__VLSBinary__Group_1_0_0_0__1__Impl
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
    // InternalVampireLanguage.g:2775:1: rule__VLSBinary__Group_1_0_0_0__1__Impl : ( '<=>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2779:1: ( ( '<=>' ) )
            // InternalVampireLanguage.g:2780:1: ( '<=>' )
            {
            // InternalVampireLanguage.g:2780:1: ( '<=>' )
            // InternalVampireLanguage.g:2781:2: '<=>'
            {
             before(grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_0_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2791:1: rule__VLSBinary__Group_1_0_0_1__0 : rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1 ;
    public final void rule__VLSBinary__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2795:1: ( rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1 )
            // InternalVampireLanguage.g:2796:2: rule__VLSBinary__Group_1_0_0_1__0__Impl rule__VLSBinary__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalVampireLanguage.g:2803:1: rule__VLSBinary__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2807:1: ( ( () ) )
            // InternalVampireLanguage.g:2808:1: ( () )
            {
            // InternalVampireLanguage.g:2808:1: ( () )
            // InternalVampireLanguage.g:2809:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSImpliesLeftAction_1_0_0_1_0()); 
            // InternalVampireLanguage.g:2810:2: ()
            // InternalVampireLanguage.g:2810:3: 
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
    // InternalVampireLanguage.g:2818:1: rule__VLSBinary__Group_1_0_0_1__1 : rule__VLSBinary__Group_1_0_0_1__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2822:1: ( rule__VLSBinary__Group_1_0_0_1__1__Impl )
            // InternalVampireLanguage.g:2823:2: rule__VLSBinary__Group_1_0_0_1__1__Impl
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
    // InternalVampireLanguage.g:2829:1: rule__VLSBinary__Group_1_0_0_1__1__Impl : ( '=>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2833:1: ( ( '=>' ) )
            // InternalVampireLanguage.g:2834:1: ( '=>' )
            {
            // InternalVampireLanguage.g:2834:1: ( '=>' )
            // InternalVampireLanguage.g:2835:2: '=>'
            {
             before(grammarAccess.getVLSBinaryAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2845:1: rule__VLSBinary__Group_1_0_0_2__0 : rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1 ;
    public final void rule__VLSBinary__Group_1_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2849:1: ( rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1 )
            // InternalVampireLanguage.g:2850:2: rule__VLSBinary__Group_1_0_0_2__0__Impl rule__VLSBinary__Group_1_0_0_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalVampireLanguage.g:2857:1: rule__VLSBinary__Group_1_0_0_2__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2861:1: ( ( () ) )
            // InternalVampireLanguage.g:2862:1: ( () )
            {
            // InternalVampireLanguage.g:2862:1: ( () )
            // InternalVampireLanguage.g:2863:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSRevImpliesLeftAction_1_0_0_2_0()); 
            // InternalVampireLanguage.g:2864:2: ()
            // InternalVampireLanguage.g:2864:3: 
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
    // InternalVampireLanguage.g:2872:1: rule__VLSBinary__Group_1_0_0_2__1 : rule__VLSBinary__Group_1_0_0_2__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2876:1: ( rule__VLSBinary__Group_1_0_0_2__1__Impl )
            // InternalVampireLanguage.g:2877:2: rule__VLSBinary__Group_1_0_0_2__1__Impl
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
    // InternalVampireLanguage.g:2883:1: rule__VLSBinary__Group_1_0_0_2__1__Impl : ( '<=' ) ;
    public final void rule__VLSBinary__Group_1_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2887:1: ( ( '<=' ) )
            // InternalVampireLanguage.g:2888:1: ( '<=' )
            {
            // InternalVampireLanguage.g:2888:1: ( '<=' )
            // InternalVampireLanguage.g:2889:2: '<='
            {
             before(grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignKeyword_1_0_0_2_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2899:1: rule__VLSBinary__Group_1_0_0_3__0 : rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1 ;
    public final void rule__VLSBinary__Group_1_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2903:1: ( rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1 )
            // InternalVampireLanguage.g:2904:2: rule__VLSBinary__Group_1_0_0_3__0__Impl rule__VLSBinary__Group_1_0_0_3__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalVampireLanguage.g:2911:1: rule__VLSBinary__Group_1_0_0_3__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2915:1: ( ( () ) )
            // InternalVampireLanguage.g:2916:1: ( () )
            {
            // InternalVampireLanguage.g:2916:1: ( () )
            // InternalVampireLanguage.g:2917:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSXnorLeftAction_1_0_0_3_0()); 
            // InternalVampireLanguage.g:2918:2: ()
            // InternalVampireLanguage.g:2918:3: 
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
    // InternalVampireLanguage.g:2926:1: rule__VLSBinary__Group_1_0_0_3__1 : rule__VLSBinary__Group_1_0_0_3__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2930:1: ( rule__VLSBinary__Group_1_0_0_3__1__Impl )
            // InternalVampireLanguage.g:2931:2: rule__VLSBinary__Group_1_0_0_3__1__Impl
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
    // InternalVampireLanguage.g:2937:1: rule__VLSBinary__Group_1_0_0_3__1__Impl : ( '<~>' ) ;
    public final void rule__VLSBinary__Group_1_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2941:1: ( ( '<~>' ) )
            // InternalVampireLanguage.g:2942:1: ( '<~>' )
            {
            // InternalVampireLanguage.g:2942:1: ( '<~>' )
            // InternalVampireLanguage.g:2943:2: '<~>'
            {
             before(grammarAccess.getVLSBinaryAccess().getLessThanSignTildeGreaterThanSignKeyword_1_0_0_3_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalVampireLanguage.g:2953:1: rule__VLSBinary__Group_1_0_0_4__0 : rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1 ;
    public final void rule__VLSBinary__Group_1_0_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2957:1: ( rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1 )
            // InternalVampireLanguage.g:2958:2: rule__VLSBinary__Group_1_0_0_4__0__Impl rule__VLSBinary__Group_1_0_0_4__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalVampireLanguage.g:2965:1: rule__VLSBinary__Group_1_0_0_4__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2969:1: ( ( () ) )
            // InternalVampireLanguage.g:2970:1: ( () )
            {
            // InternalVampireLanguage.g:2970:1: ( () )
            // InternalVampireLanguage.g:2971:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSNorLeftAction_1_0_0_4_0()); 
            // InternalVampireLanguage.g:2972:2: ()
            // InternalVampireLanguage.g:2972:3: 
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
    // InternalVampireLanguage.g:2980:1: rule__VLSBinary__Group_1_0_0_4__1 : rule__VLSBinary__Group_1_0_0_4__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2984:1: ( rule__VLSBinary__Group_1_0_0_4__1__Impl )
            // InternalVampireLanguage.g:2985:2: rule__VLSBinary__Group_1_0_0_4__1__Impl
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
    // InternalVampireLanguage.g:2991:1: rule__VLSBinary__Group_1_0_0_4__1__Impl : ( '~|' ) ;
    public final void rule__VLSBinary__Group_1_0_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:2995:1: ( ( '~|' ) )
            // InternalVampireLanguage.g:2996:1: ( '~|' )
            {
            // InternalVampireLanguage.g:2996:1: ( '~|' )
            // InternalVampireLanguage.g:2997:2: '~|'
            {
             before(grammarAccess.getVLSBinaryAccess().getTildeVerticalLineKeyword_1_0_0_4_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3007:1: rule__VLSBinary__Group_1_0_0_5__0 : rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1 ;
    public final void rule__VLSBinary__Group_1_0_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3011:1: ( rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1 )
            // InternalVampireLanguage.g:3012:2: rule__VLSBinary__Group_1_0_0_5__0__Impl rule__VLSBinary__Group_1_0_0_5__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalVampireLanguage.g:3019:1: rule__VLSBinary__Group_1_0_0_5__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_0_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3023:1: ( ( () ) )
            // InternalVampireLanguage.g:3024:1: ( () )
            {
            // InternalVampireLanguage.g:3024:1: ( () )
            // InternalVampireLanguage.g:3025:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSNandLeftAction_1_0_0_5_0()); 
            // InternalVampireLanguage.g:3026:2: ()
            // InternalVampireLanguage.g:3026:3: 
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
    // InternalVampireLanguage.g:3034:1: rule__VLSBinary__Group_1_0_0_5__1 : rule__VLSBinary__Group_1_0_0_5__1__Impl ;
    public final void rule__VLSBinary__Group_1_0_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3038:1: ( rule__VLSBinary__Group_1_0_0_5__1__Impl )
            // InternalVampireLanguage.g:3039:2: rule__VLSBinary__Group_1_0_0_5__1__Impl
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
    // InternalVampireLanguage.g:3045:1: rule__VLSBinary__Group_1_0_0_5__1__Impl : ( '~&' ) ;
    public final void rule__VLSBinary__Group_1_0_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3049:1: ( ( '~&' ) )
            // InternalVampireLanguage.g:3050:1: ( '~&' )
            {
            // InternalVampireLanguage.g:3050:1: ( '~&' )
            // InternalVampireLanguage.g:3051:2: '~&'
            {
             before(grammarAccess.getVLSBinaryAccess().getTildeAmpersandKeyword_1_0_0_5_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3061:1: rule__VLSBinary__Group_1_1__0 : rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1 ;
    public final void rule__VLSBinary__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3065:1: ( rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1 )
            // InternalVampireLanguage.g:3066:2: rule__VLSBinary__Group_1_1__0__Impl rule__VLSBinary__Group_1_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalVampireLanguage.g:3073:1: rule__VLSBinary__Group_1_1__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3077:1: ( ( () ) )
            // InternalVampireLanguage.g:3078:1: ( () )
            {
            // InternalVampireLanguage.g:3078:1: ( () )
            // InternalVampireLanguage.g:3079:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSAndLeftAction_1_1_0()); 
            // InternalVampireLanguage.g:3080:2: ()
            // InternalVampireLanguage.g:3080:3: 
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
    // InternalVampireLanguage.g:3088:1: rule__VLSBinary__Group_1_1__1 : rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2 ;
    public final void rule__VLSBinary__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3092:1: ( rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2 )
            // InternalVampireLanguage.g:3093:2: rule__VLSBinary__Group_1_1__1__Impl rule__VLSBinary__Group_1_1__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalVampireLanguage.g:3100:1: rule__VLSBinary__Group_1_1__1__Impl : ( '&' ) ;
    public final void rule__VLSBinary__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3104:1: ( ( '&' ) )
            // InternalVampireLanguage.g:3105:1: ( '&' )
            {
            // InternalVampireLanguage.g:3105:1: ( '&' )
            // InternalVampireLanguage.g:3106:2: '&'
            {
             before(grammarAccess.getVLSBinaryAccess().getAmpersandKeyword_1_1_1()); 
            match(input,60,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3115:1: rule__VLSBinary__Group_1_1__2 : rule__VLSBinary__Group_1_1__2__Impl ;
    public final void rule__VLSBinary__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3119:1: ( rule__VLSBinary__Group_1_1__2__Impl )
            // InternalVampireLanguage.g:3120:2: rule__VLSBinary__Group_1_1__2__Impl
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
    // InternalVampireLanguage.g:3126:1: rule__VLSBinary__Group_1_1__2__Impl : ( ( rule__VLSBinary__RightAssignment_1_1_2 ) ) ;
    public final void rule__VLSBinary__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3130:1: ( ( ( rule__VLSBinary__RightAssignment_1_1_2 ) ) )
            // InternalVampireLanguage.g:3131:1: ( ( rule__VLSBinary__RightAssignment_1_1_2 ) )
            {
            // InternalVampireLanguage.g:3131:1: ( ( rule__VLSBinary__RightAssignment_1_1_2 ) )
            // InternalVampireLanguage.g:3132:2: ( rule__VLSBinary__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_1_2()); 
            // InternalVampireLanguage.g:3133:2: ( rule__VLSBinary__RightAssignment_1_1_2 )
            // InternalVampireLanguage.g:3133:3: rule__VLSBinary__RightAssignment_1_1_2
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
    // InternalVampireLanguage.g:3142:1: rule__VLSBinary__Group_1_2__0 : rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1 ;
    public final void rule__VLSBinary__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3146:1: ( rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1 )
            // InternalVampireLanguage.g:3147:2: rule__VLSBinary__Group_1_2__0__Impl rule__VLSBinary__Group_1_2__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalVampireLanguage.g:3154:1: rule__VLSBinary__Group_1_2__0__Impl : ( () ) ;
    public final void rule__VLSBinary__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3158:1: ( ( () ) )
            // InternalVampireLanguage.g:3159:1: ( () )
            {
            // InternalVampireLanguage.g:3159:1: ( () )
            // InternalVampireLanguage.g:3160:2: ()
            {
             before(grammarAccess.getVLSBinaryAccess().getVLSOrLeftAction_1_2_0()); 
            // InternalVampireLanguage.g:3161:2: ()
            // InternalVampireLanguage.g:3161:3: 
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
    // InternalVampireLanguage.g:3169:1: rule__VLSBinary__Group_1_2__1 : rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2 ;
    public final void rule__VLSBinary__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3173:1: ( rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2 )
            // InternalVampireLanguage.g:3174:2: rule__VLSBinary__Group_1_2__1__Impl rule__VLSBinary__Group_1_2__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalVampireLanguage.g:3181:1: rule__VLSBinary__Group_1_2__1__Impl : ( '|' ) ;
    public final void rule__VLSBinary__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3185:1: ( ( '|' ) )
            // InternalVampireLanguage.g:3186:1: ( '|' )
            {
            // InternalVampireLanguage.g:3186:1: ( '|' )
            // InternalVampireLanguage.g:3187:2: '|'
            {
             before(grammarAccess.getVLSBinaryAccess().getVerticalLineKeyword_1_2_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3196:1: rule__VLSBinary__Group_1_2__2 : rule__VLSBinary__Group_1_2__2__Impl ;
    public final void rule__VLSBinary__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3200:1: ( rule__VLSBinary__Group_1_2__2__Impl )
            // InternalVampireLanguage.g:3201:2: rule__VLSBinary__Group_1_2__2__Impl
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
    // InternalVampireLanguage.g:3207:1: rule__VLSBinary__Group_1_2__2__Impl : ( ( rule__VLSBinary__RightAssignment_1_2_2 ) ) ;
    public final void rule__VLSBinary__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3211:1: ( ( ( rule__VLSBinary__RightAssignment_1_2_2 ) ) )
            // InternalVampireLanguage.g:3212:1: ( ( rule__VLSBinary__RightAssignment_1_2_2 ) )
            {
            // InternalVampireLanguage.g:3212:1: ( ( rule__VLSBinary__RightAssignment_1_2_2 ) )
            // InternalVampireLanguage.g:3213:2: ( rule__VLSBinary__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_2_2()); 
            // InternalVampireLanguage.g:3214:2: ( rule__VLSBinary__RightAssignment_1_2_2 )
            // InternalVampireLanguage.g:3214:3: rule__VLSBinary__RightAssignment_1_2_2
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
    // InternalVampireLanguage.g:3223:1: rule__VLSUnitaryFormula__Group_4__0 : rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1 ;
    public final void rule__VLSUnitaryFormula__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3227:1: ( rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1 )
            // InternalVampireLanguage.g:3228:2: rule__VLSUnitaryFormula__Group_4__0__Impl rule__VLSUnitaryFormula__Group_4__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalVampireLanguage.g:3235:1: rule__VLSUnitaryFormula__Group_4__0__Impl : ( '(' ) ;
    public final void rule__VLSUnitaryFormula__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3239:1: ( ( '(' ) )
            // InternalVampireLanguage.g:3240:1: ( '(' )
            {
            // InternalVampireLanguage.g:3240:1: ( '(' )
            // InternalVampireLanguage.g:3241:2: '('
            {
             before(grammarAccess.getVLSUnitaryFormulaAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3250:1: rule__VLSUnitaryFormula__Group_4__1 : rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2 ;
    public final void rule__VLSUnitaryFormula__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3254:1: ( rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2 )
            // InternalVampireLanguage.g:3255:2: rule__VLSUnitaryFormula__Group_4__1__Impl rule__VLSUnitaryFormula__Group_4__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalVampireLanguage.g:3262:1: rule__VLSUnitaryFormula__Group_4__1__Impl : ( ruleVLSTerm ) ;
    public final void rule__VLSUnitaryFormula__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3266:1: ( ( ruleVLSTerm ) )
            // InternalVampireLanguage.g:3267:1: ( ruleVLSTerm )
            {
            // InternalVampireLanguage.g:3267:1: ( ruleVLSTerm )
            // InternalVampireLanguage.g:3268:2: ruleVLSTerm
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
    // InternalVampireLanguage.g:3277:1: rule__VLSUnitaryFormula__Group_4__2 : rule__VLSUnitaryFormula__Group_4__2__Impl ;
    public final void rule__VLSUnitaryFormula__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3281:1: ( rule__VLSUnitaryFormula__Group_4__2__Impl )
            // InternalVampireLanguage.g:3282:2: rule__VLSUnitaryFormula__Group_4__2__Impl
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
    // InternalVampireLanguage.g:3288:1: rule__VLSUnitaryFormula__Group_4__2__Impl : ( ')' ) ;
    public final void rule__VLSUnitaryFormula__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3292:1: ( ( ')' ) )
            // InternalVampireLanguage.g:3293:1: ( ')' )
            {
            // InternalVampireLanguage.g:3293:1: ( ')' )
            // InternalVampireLanguage.g:3294:2: ')'
            {
             before(grammarAccess.getVLSUnitaryFormulaAccess().getRightParenthesisKeyword_4_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3304:1: rule__VLSUniversalQuantifier__Group__0 : rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1 ;
    public final void rule__VLSUniversalQuantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3308:1: ( rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1 )
            // InternalVampireLanguage.g:3309:2: rule__VLSUniversalQuantifier__Group__0__Impl rule__VLSUniversalQuantifier__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalVampireLanguage.g:3316:1: rule__VLSUniversalQuantifier__Group__0__Impl : ( () ) ;
    public final void rule__VLSUniversalQuantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3320:1: ( ( () ) )
            // InternalVampireLanguage.g:3321:1: ( () )
            {
            // InternalVampireLanguage.g:3321:1: ( () )
            // InternalVampireLanguage.g:3322:2: ()
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVLSUniversalQuantifierAction_0()); 
            // InternalVampireLanguage.g:3323:2: ()
            // InternalVampireLanguage.g:3323:3: 
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
    // InternalVampireLanguage.g:3331:1: rule__VLSUniversalQuantifier__Group__1 : rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2 ;
    public final void rule__VLSUniversalQuantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3335:1: ( rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2 )
            // InternalVampireLanguage.g:3336:2: rule__VLSUniversalQuantifier__Group__1__Impl rule__VLSUniversalQuantifier__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalVampireLanguage.g:3343:1: rule__VLSUniversalQuantifier__Group__1__Impl : ( ( rule__VLSUniversalQuantifier__Group_1__0 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3347:1: ( ( ( rule__VLSUniversalQuantifier__Group_1__0 ) ) )
            // InternalVampireLanguage.g:3348:1: ( ( rule__VLSUniversalQuantifier__Group_1__0 ) )
            {
            // InternalVampireLanguage.g:3348:1: ( ( rule__VLSUniversalQuantifier__Group_1__0 ) )
            // InternalVampireLanguage.g:3349:2: ( rule__VLSUniversalQuantifier__Group_1__0 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup_1()); 
            // InternalVampireLanguage.g:3350:2: ( rule__VLSUniversalQuantifier__Group_1__0 )
            // InternalVampireLanguage.g:3350:3: rule__VLSUniversalQuantifier__Group_1__0
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
    // InternalVampireLanguage.g:3358:1: rule__VLSUniversalQuantifier__Group__2 : rule__VLSUniversalQuantifier__Group__2__Impl ;
    public final void rule__VLSUniversalQuantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3362:1: ( rule__VLSUniversalQuantifier__Group__2__Impl )
            // InternalVampireLanguage.g:3363:2: rule__VLSUniversalQuantifier__Group__2__Impl
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
    // InternalVampireLanguage.g:3369:1: rule__VLSUniversalQuantifier__Group__2__Impl : ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3373:1: ( ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:3374:1: ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:3374:1: ( ( rule__VLSUniversalQuantifier__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:3375:2: ( rule__VLSUniversalQuantifier__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:3376:2: ( rule__VLSUniversalQuantifier__OperandAssignment_2 )
            // InternalVampireLanguage.g:3376:3: rule__VLSUniversalQuantifier__OperandAssignment_2
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
    // InternalVampireLanguage.g:3385:1: rule__VLSUniversalQuantifier__Group_1__0 : rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1 ;
    public final void rule__VLSUniversalQuantifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3389:1: ( rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1 )
            // InternalVampireLanguage.g:3390:2: rule__VLSUniversalQuantifier__Group_1__0__Impl rule__VLSUniversalQuantifier__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalVampireLanguage.g:3397:1: rule__VLSUniversalQuantifier__Group_1__0__Impl : ( '!' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3401:1: ( ( '!' ) )
            // InternalVampireLanguage.g:3402:1: ( '!' )
            {
            // InternalVampireLanguage.g:3402:1: ( '!' )
            // InternalVampireLanguage.g:3403:2: '!'
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getExclamationMarkKeyword_1_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3412:1: rule__VLSUniversalQuantifier__Group_1__1 : rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2 ;
    public final void rule__VLSUniversalQuantifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3416:1: ( rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2 )
            // InternalVampireLanguage.g:3417:2: rule__VLSUniversalQuantifier__Group_1__1__Impl rule__VLSUniversalQuantifier__Group_1__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalVampireLanguage.g:3424:1: rule__VLSUniversalQuantifier__Group_1__1__Impl : ( '[' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3428:1: ( ( '[' ) )
            // InternalVampireLanguage.g:3429:1: ( '[' )
            {
            // InternalVampireLanguage.g:3429:1: ( '[' )
            // InternalVampireLanguage.g:3430:2: '['
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3439:1: rule__VLSUniversalQuantifier__Group_1__2 : rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3 ;
    public final void rule__VLSUniversalQuantifier__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3443:1: ( rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3 )
            // InternalVampireLanguage.g:3444:2: rule__VLSUniversalQuantifier__Group_1__2__Impl rule__VLSUniversalQuantifier__Group_1__3
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
    // InternalVampireLanguage.g:3451:1: rule__VLSUniversalQuantifier__Group_1__2__Impl : ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3455:1: ( ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) ) )
            // InternalVampireLanguage.g:3456:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) )
            {
            // InternalVampireLanguage.g:3456:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 ) )
            // InternalVampireLanguage.g:3457:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAssignment_1_2()); 
            // InternalVampireLanguage.g:3458:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_2 )
            // InternalVampireLanguage.g:3458:3: rule__VLSUniversalQuantifier__VariablesAssignment_1_2
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
    // InternalVampireLanguage.g:3466:1: rule__VLSUniversalQuantifier__Group_1__3 : rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4 ;
    public final void rule__VLSUniversalQuantifier__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3470:1: ( rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4 )
            // InternalVampireLanguage.g:3471:2: rule__VLSUniversalQuantifier__Group_1__3__Impl rule__VLSUniversalQuantifier__Group_1__4
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
    // InternalVampireLanguage.g:3478:1: rule__VLSUniversalQuantifier__Group_1__3__Impl : ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3482:1: ( ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* ) )
            // InternalVampireLanguage.g:3483:1: ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* )
            {
            // InternalVampireLanguage.g:3483:1: ( ( rule__VLSUniversalQuantifier__Group_1_3__0 )* )
            // InternalVampireLanguage.g:3484:2: ( rule__VLSUniversalQuantifier__Group_1_3__0 )*
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getGroup_1_3()); 
            // InternalVampireLanguage.g:3485:2: ( rule__VLSUniversalQuantifier__Group_1_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==45) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalVampireLanguage.g:3485:3: rule__VLSUniversalQuantifier__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__VLSUniversalQuantifier__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalVampireLanguage.g:3493:1: rule__VLSUniversalQuantifier__Group_1__4 : rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5 ;
    public final void rule__VLSUniversalQuantifier__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3497:1: ( rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5 )
            // InternalVampireLanguage.g:3498:2: rule__VLSUniversalQuantifier__Group_1__4__Impl rule__VLSUniversalQuantifier__Group_1__5
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
    // InternalVampireLanguage.g:3505:1: rule__VLSUniversalQuantifier__Group_1__4__Impl : ( ']' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3509:1: ( ( ']' ) )
            // InternalVampireLanguage.g:3510:1: ( ']' )
            {
            // InternalVampireLanguage.g:3510:1: ( ']' )
            // InternalVampireLanguage.g:3511:2: ']'
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
    // InternalVampireLanguage.g:3520:1: rule__VLSUniversalQuantifier__Group_1__5 : rule__VLSUniversalQuantifier__Group_1__5__Impl ;
    public final void rule__VLSUniversalQuantifier__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3524:1: ( rule__VLSUniversalQuantifier__Group_1__5__Impl )
            // InternalVampireLanguage.g:3525:2: rule__VLSUniversalQuantifier__Group_1__5__Impl
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
    // InternalVampireLanguage.g:3531:1: rule__VLSUniversalQuantifier__Group_1__5__Impl : ( ':' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3535:1: ( ( ':' ) )
            // InternalVampireLanguage.g:3536:1: ( ':' )
            {
            // InternalVampireLanguage.g:3536:1: ( ':' )
            // InternalVampireLanguage.g:3537:2: ':'
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getColonKeyword_1_5()); 
            match(input,63,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3547:1: rule__VLSUniversalQuantifier__Group_1_3__0 : rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1 ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3551:1: ( rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1 )
            // InternalVampireLanguage.g:3552:2: rule__VLSUniversalQuantifier__Group_1_3__0__Impl rule__VLSUniversalQuantifier__Group_1_3__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalVampireLanguage.g:3559:1: rule__VLSUniversalQuantifier__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3563:1: ( ( ',' ) )
            // InternalVampireLanguage.g:3564:1: ( ',' )
            {
            // InternalVampireLanguage.g:3564:1: ( ',' )
            // InternalVampireLanguage.g:3565:2: ','
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
    // InternalVampireLanguage.g:3574:1: rule__VLSUniversalQuantifier__Group_1_3__1 : rule__VLSUniversalQuantifier__Group_1_3__1__Impl ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3578:1: ( rule__VLSUniversalQuantifier__Group_1_3__1__Impl )
            // InternalVampireLanguage.g:3579:2: rule__VLSUniversalQuantifier__Group_1_3__1__Impl
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
    // InternalVampireLanguage.g:3585:1: rule__VLSUniversalQuantifier__Group_1_3__1__Impl : ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) ) ;
    public final void rule__VLSUniversalQuantifier__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3589:1: ( ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) ) )
            // InternalVampireLanguage.g:3590:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) )
            {
            // InternalVampireLanguage.g:3590:1: ( ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 ) )
            // InternalVampireLanguage.g:3591:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 )
            {
             before(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAssignment_1_3_1()); 
            // InternalVampireLanguage.g:3592:2: ( rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 )
            // InternalVampireLanguage.g:3592:3: rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1
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
    // InternalVampireLanguage.g:3601:1: rule__VLSExistentialQuantifier__Group__0 : rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1 ;
    public final void rule__VLSExistentialQuantifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3605:1: ( rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1 )
            // InternalVampireLanguage.g:3606:2: rule__VLSExistentialQuantifier__Group__0__Impl rule__VLSExistentialQuantifier__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalVampireLanguage.g:3613:1: rule__VLSExistentialQuantifier__Group__0__Impl : ( () ) ;
    public final void rule__VLSExistentialQuantifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3617:1: ( ( () ) )
            // InternalVampireLanguage.g:3618:1: ( () )
            {
            // InternalVampireLanguage.g:3618:1: ( () )
            // InternalVampireLanguage.g:3619:2: ()
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVLSExistentialQuantifierAction_0()); 
            // InternalVampireLanguage.g:3620:2: ()
            // InternalVampireLanguage.g:3620:3: 
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
    // InternalVampireLanguage.g:3628:1: rule__VLSExistentialQuantifier__Group__1 : rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2 ;
    public final void rule__VLSExistentialQuantifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3632:1: ( rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2 )
            // InternalVampireLanguage.g:3633:2: rule__VLSExistentialQuantifier__Group__1__Impl rule__VLSExistentialQuantifier__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalVampireLanguage.g:3640:1: rule__VLSExistentialQuantifier__Group__1__Impl : ( ( rule__VLSExistentialQuantifier__Group_1__0 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3644:1: ( ( ( rule__VLSExistentialQuantifier__Group_1__0 ) ) )
            // InternalVampireLanguage.g:3645:1: ( ( rule__VLSExistentialQuantifier__Group_1__0 ) )
            {
            // InternalVampireLanguage.g:3645:1: ( ( rule__VLSExistentialQuantifier__Group_1__0 ) )
            // InternalVampireLanguage.g:3646:2: ( rule__VLSExistentialQuantifier__Group_1__0 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup_1()); 
            // InternalVampireLanguage.g:3647:2: ( rule__VLSExistentialQuantifier__Group_1__0 )
            // InternalVampireLanguage.g:3647:3: rule__VLSExistentialQuantifier__Group_1__0
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
    // InternalVampireLanguage.g:3655:1: rule__VLSExistentialQuantifier__Group__2 : rule__VLSExistentialQuantifier__Group__2__Impl ;
    public final void rule__VLSExistentialQuantifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3659:1: ( rule__VLSExistentialQuantifier__Group__2__Impl )
            // InternalVampireLanguage.g:3660:2: rule__VLSExistentialQuantifier__Group__2__Impl
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
    // InternalVampireLanguage.g:3666:1: rule__VLSExistentialQuantifier__Group__2__Impl : ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3670:1: ( ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:3671:1: ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:3671:1: ( ( rule__VLSExistentialQuantifier__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:3672:2: ( rule__VLSExistentialQuantifier__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:3673:2: ( rule__VLSExistentialQuantifier__OperandAssignment_2 )
            // InternalVampireLanguage.g:3673:3: rule__VLSExistentialQuantifier__OperandAssignment_2
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
    // InternalVampireLanguage.g:3682:1: rule__VLSExistentialQuantifier__Group_1__0 : rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1 ;
    public final void rule__VLSExistentialQuantifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3686:1: ( rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1 )
            // InternalVampireLanguage.g:3687:2: rule__VLSExistentialQuantifier__Group_1__0__Impl rule__VLSExistentialQuantifier__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalVampireLanguage.g:3694:1: rule__VLSExistentialQuantifier__Group_1__0__Impl : ( '?' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3698:1: ( ( '?' ) )
            // InternalVampireLanguage.g:3699:1: ( '?' )
            {
            // InternalVampireLanguage.g:3699:1: ( '?' )
            // InternalVampireLanguage.g:3700:2: '?'
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getQuestionMarkKeyword_1_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3709:1: rule__VLSExistentialQuantifier__Group_1__1 : rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2 ;
    public final void rule__VLSExistentialQuantifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3713:1: ( rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2 )
            // InternalVampireLanguage.g:3714:2: rule__VLSExistentialQuantifier__Group_1__1__Impl rule__VLSExistentialQuantifier__Group_1__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalVampireLanguage.g:3721:1: rule__VLSExistentialQuantifier__Group_1__1__Impl : ( '[' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3725:1: ( ( '[' ) )
            // InternalVampireLanguage.g:3726:1: ( '[' )
            {
            // InternalVampireLanguage.g:3726:1: ( '[' )
            // InternalVampireLanguage.g:3727:2: '['
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3736:1: rule__VLSExistentialQuantifier__Group_1__2 : rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3 ;
    public final void rule__VLSExistentialQuantifier__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3740:1: ( rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3 )
            // InternalVampireLanguage.g:3741:2: rule__VLSExistentialQuantifier__Group_1__2__Impl rule__VLSExistentialQuantifier__Group_1__3
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
    // InternalVampireLanguage.g:3748:1: rule__VLSExistentialQuantifier__Group_1__2__Impl : ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3752:1: ( ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) ) )
            // InternalVampireLanguage.g:3753:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) )
            {
            // InternalVampireLanguage.g:3753:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 ) )
            // InternalVampireLanguage.g:3754:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAssignment_1_2()); 
            // InternalVampireLanguage.g:3755:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_2 )
            // InternalVampireLanguage.g:3755:3: rule__VLSExistentialQuantifier__VariablesAssignment_1_2
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
    // InternalVampireLanguage.g:3763:1: rule__VLSExistentialQuantifier__Group_1__3 : rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4 ;
    public final void rule__VLSExistentialQuantifier__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3767:1: ( rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4 )
            // InternalVampireLanguage.g:3768:2: rule__VLSExistentialQuantifier__Group_1__3__Impl rule__VLSExistentialQuantifier__Group_1__4
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
    // InternalVampireLanguage.g:3775:1: rule__VLSExistentialQuantifier__Group_1__3__Impl : ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3779:1: ( ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* ) )
            // InternalVampireLanguage.g:3780:1: ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* )
            {
            // InternalVampireLanguage.g:3780:1: ( ( rule__VLSExistentialQuantifier__Group_1_3__0 )* )
            // InternalVampireLanguage.g:3781:2: ( rule__VLSExistentialQuantifier__Group_1_3__0 )*
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getGroup_1_3()); 
            // InternalVampireLanguage.g:3782:2: ( rule__VLSExistentialQuantifier__Group_1_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==45) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalVampireLanguage.g:3782:3: rule__VLSExistentialQuantifier__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__VLSExistentialQuantifier__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalVampireLanguage.g:3790:1: rule__VLSExistentialQuantifier__Group_1__4 : rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5 ;
    public final void rule__VLSExistentialQuantifier__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3794:1: ( rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5 )
            // InternalVampireLanguage.g:3795:2: rule__VLSExistentialQuantifier__Group_1__4__Impl rule__VLSExistentialQuantifier__Group_1__5
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
    // InternalVampireLanguage.g:3802:1: rule__VLSExistentialQuantifier__Group_1__4__Impl : ( ']' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3806:1: ( ( ']' ) )
            // InternalVampireLanguage.g:3807:1: ( ']' )
            {
            // InternalVampireLanguage.g:3807:1: ( ']' )
            // InternalVampireLanguage.g:3808:2: ']'
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
    // InternalVampireLanguage.g:3817:1: rule__VLSExistentialQuantifier__Group_1__5 : rule__VLSExistentialQuantifier__Group_1__5__Impl ;
    public final void rule__VLSExistentialQuantifier__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3821:1: ( rule__VLSExistentialQuantifier__Group_1__5__Impl )
            // InternalVampireLanguage.g:3822:2: rule__VLSExistentialQuantifier__Group_1__5__Impl
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
    // InternalVampireLanguage.g:3828:1: rule__VLSExistentialQuantifier__Group_1__5__Impl : ( ':' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3832:1: ( ( ':' ) )
            // InternalVampireLanguage.g:3833:1: ( ':' )
            {
            // InternalVampireLanguage.g:3833:1: ( ':' )
            // InternalVampireLanguage.g:3834:2: ':'
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getColonKeyword_1_5()); 
            match(input,63,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3844:1: rule__VLSExistentialQuantifier__Group_1_3__0 : rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1 ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3848:1: ( rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1 )
            // InternalVampireLanguage.g:3849:2: rule__VLSExistentialQuantifier__Group_1_3__0__Impl rule__VLSExistentialQuantifier__Group_1_3__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalVampireLanguage.g:3856:1: rule__VLSExistentialQuantifier__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3860:1: ( ( ',' ) )
            // InternalVampireLanguage.g:3861:1: ( ',' )
            {
            // InternalVampireLanguage.g:3861:1: ( ',' )
            // InternalVampireLanguage.g:3862:2: ','
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
    // InternalVampireLanguage.g:3871:1: rule__VLSExistentialQuantifier__Group_1_3__1 : rule__VLSExistentialQuantifier__Group_1_3__1__Impl ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3875:1: ( rule__VLSExistentialQuantifier__Group_1_3__1__Impl )
            // InternalVampireLanguage.g:3876:2: rule__VLSExistentialQuantifier__Group_1_3__1__Impl
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
    // InternalVampireLanguage.g:3882:1: rule__VLSExistentialQuantifier__Group_1_3__1__Impl : ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) ) ;
    public final void rule__VLSExistentialQuantifier__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3886:1: ( ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) ) )
            // InternalVampireLanguage.g:3887:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) )
            {
            // InternalVampireLanguage.g:3887:1: ( ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 ) )
            // InternalVampireLanguage.g:3888:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 )
            {
             before(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAssignment_1_3_1()); 
            // InternalVampireLanguage.g:3889:2: ( rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 )
            // InternalVampireLanguage.g:3889:3: rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1
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
    // InternalVampireLanguage.g:3898:1: rule__VLSUnaryNegation__Group__0 : rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1 ;
    public final void rule__VLSUnaryNegation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3902:1: ( rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1 )
            // InternalVampireLanguage.g:3903:2: rule__VLSUnaryNegation__Group__0__Impl rule__VLSUnaryNegation__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalVampireLanguage.g:3910:1: rule__VLSUnaryNegation__Group__0__Impl : ( () ) ;
    public final void rule__VLSUnaryNegation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3914:1: ( ( () ) )
            // InternalVampireLanguage.g:3915:1: ( () )
            {
            // InternalVampireLanguage.g:3915:1: ( () )
            // InternalVampireLanguage.g:3916:2: ()
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getVLSUnaryNegationAction_0()); 
            // InternalVampireLanguage.g:3917:2: ()
            // InternalVampireLanguage.g:3917:3: 
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
    // InternalVampireLanguage.g:3925:1: rule__VLSUnaryNegation__Group__1 : rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2 ;
    public final void rule__VLSUnaryNegation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3929:1: ( rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2 )
            // InternalVampireLanguage.g:3930:2: rule__VLSUnaryNegation__Group__1__Impl rule__VLSUnaryNegation__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalVampireLanguage.g:3937:1: rule__VLSUnaryNegation__Group__1__Impl : ( '~' ) ;
    public final void rule__VLSUnaryNegation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3941:1: ( ( '~' ) )
            // InternalVampireLanguage.g:3942:1: ( '~' )
            {
            // InternalVampireLanguage.g:3942:1: ( '~' )
            // InternalVampireLanguage.g:3943:2: '~'
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getTildeKeyword_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalVampireLanguage.g:3952:1: rule__VLSUnaryNegation__Group__2 : rule__VLSUnaryNegation__Group__2__Impl ;
    public final void rule__VLSUnaryNegation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3956:1: ( rule__VLSUnaryNegation__Group__2__Impl )
            // InternalVampireLanguage.g:3957:2: rule__VLSUnaryNegation__Group__2__Impl
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
    // InternalVampireLanguage.g:3963:1: rule__VLSUnaryNegation__Group__2__Impl : ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) ) ;
    public final void rule__VLSUnaryNegation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3967:1: ( ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) ) )
            // InternalVampireLanguage.g:3968:1: ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) )
            {
            // InternalVampireLanguage.g:3968:1: ( ( rule__VLSUnaryNegation__OperandAssignment_2 ) )
            // InternalVampireLanguage.g:3969:2: ( rule__VLSUnaryNegation__OperandAssignment_2 )
            {
             before(grammarAccess.getVLSUnaryNegationAccess().getOperandAssignment_2()); 
            // InternalVampireLanguage.g:3970:2: ( rule__VLSUnaryNegation__OperandAssignment_2 )
            // InternalVampireLanguage.g:3970:3: rule__VLSUnaryNegation__OperandAssignment_2
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
    // InternalVampireLanguage.g:3979:1: rule__VLSUnaryInfix__Group__0 : rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1 ;
    public final void rule__VLSUnaryInfix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3983:1: ( rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1 )
            // InternalVampireLanguage.g:3984:2: rule__VLSUnaryInfix__Group__0__Impl rule__VLSUnaryInfix__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalVampireLanguage.g:3991:1: rule__VLSUnaryInfix__Group__0__Impl : ( ruleVLSAtomic ) ;
    public final void rule__VLSUnaryInfix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:3995:1: ( ( ruleVLSAtomic ) )
            // InternalVampireLanguage.g:3996:1: ( ruleVLSAtomic )
            {
            // InternalVampireLanguage.g:3996:1: ( ruleVLSAtomic )
            // InternalVampireLanguage.g:3997:2: ruleVLSAtomic
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
    // InternalVampireLanguage.g:4006:1: rule__VLSUnaryInfix__Group__1 : rule__VLSUnaryInfix__Group__1__Impl ;
    public final void rule__VLSUnaryInfix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4010:1: ( rule__VLSUnaryInfix__Group__1__Impl )
            // InternalVampireLanguage.g:4011:2: rule__VLSUnaryInfix__Group__1__Impl
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
    // InternalVampireLanguage.g:4017:1: rule__VLSUnaryInfix__Group__1__Impl : ( ( rule__VLSUnaryInfix__Group_1__0 )? ) ;
    public final void rule__VLSUnaryInfix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4021:1: ( ( ( rule__VLSUnaryInfix__Group_1__0 )? ) )
            // InternalVampireLanguage.g:4022:1: ( ( rule__VLSUnaryInfix__Group_1__0 )? )
            {
            // InternalVampireLanguage.g:4022:1: ( ( rule__VLSUnaryInfix__Group_1__0 )? )
            // InternalVampireLanguage.g:4023:2: ( rule__VLSUnaryInfix__Group_1__0 )?
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getGroup_1()); 
            // InternalVampireLanguage.g:4024:2: ( rule__VLSUnaryInfix__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=66 && LA34_0<=68)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVampireLanguage.g:4024:3: rule__VLSUnaryInfix__Group_1__0
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
    // InternalVampireLanguage.g:4033:1: rule__VLSUnaryInfix__Group_1__0 : rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1 ;
    public final void rule__VLSUnaryInfix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4037:1: ( rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1 )
            // InternalVampireLanguage.g:4038:2: rule__VLSUnaryInfix__Group_1__0__Impl rule__VLSUnaryInfix__Group_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalVampireLanguage.g:4045:1: rule__VLSUnaryInfix__Group_1__0__Impl : ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) ) ;
    public final void rule__VLSUnaryInfix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4049:1: ( ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) ) )
            // InternalVampireLanguage.g:4050:1: ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) )
            {
            // InternalVampireLanguage.g:4050:1: ( ( rule__VLSUnaryInfix__Alternatives_1_0 ) )
            // InternalVampireLanguage.g:4051:2: ( rule__VLSUnaryInfix__Alternatives_1_0 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getAlternatives_1_0()); 
            // InternalVampireLanguage.g:4052:2: ( rule__VLSUnaryInfix__Alternatives_1_0 )
            // InternalVampireLanguage.g:4052:3: rule__VLSUnaryInfix__Alternatives_1_0
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
    // InternalVampireLanguage.g:4060:1: rule__VLSUnaryInfix__Group_1__1 : rule__VLSUnaryInfix__Group_1__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4064:1: ( rule__VLSUnaryInfix__Group_1__1__Impl )
            // InternalVampireLanguage.g:4065:2: rule__VLSUnaryInfix__Group_1__1__Impl
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
    // InternalVampireLanguage.g:4071:1: rule__VLSUnaryInfix__Group_1__1__Impl : ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) ) ;
    public final void rule__VLSUnaryInfix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4075:1: ( ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:4076:1: ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:4076:1: ( ( rule__VLSUnaryInfix__RightAssignment_1_1 ) )
            // InternalVampireLanguage.g:4077:2: ( rule__VLSUnaryInfix__RightAssignment_1_1 )
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getRightAssignment_1_1()); 
            // InternalVampireLanguage.g:4078:2: ( rule__VLSUnaryInfix__RightAssignment_1_1 )
            // InternalVampireLanguage.g:4078:3: rule__VLSUnaryInfix__RightAssignment_1_1
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
    // InternalVampireLanguage.g:4087:1: rule__VLSUnaryInfix__Group_1_0_0__0 : rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4091:1: ( rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1 )
            // InternalVampireLanguage.g:4092:2: rule__VLSUnaryInfix__Group_1_0_0__0__Impl rule__VLSUnaryInfix__Group_1_0_0__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalVampireLanguage.g:4099:1: rule__VLSUnaryInfix__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4103:1: ( ( () ) )
            // InternalVampireLanguage.g:4104:1: ( () )
            {
            // InternalVampireLanguage.g:4104:1: ( () )
            // InternalVampireLanguage.g:4105:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSInequalityLeftAction_1_0_0_0()); 
            // InternalVampireLanguage.g:4106:2: ()
            // InternalVampireLanguage.g:4106:3: 
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
    // InternalVampireLanguage.g:4114:1: rule__VLSUnaryInfix__Group_1_0_0__1 : rule__VLSUnaryInfix__Group_1_0_0__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4118:1: ( rule__VLSUnaryInfix__Group_1_0_0__1__Impl )
            // InternalVampireLanguage.g:4119:2: rule__VLSUnaryInfix__Group_1_0_0__1__Impl
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
    // InternalVampireLanguage.g:4125:1: rule__VLSUnaryInfix__Group_1_0_0__1__Impl : ( '!=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4129:1: ( ( '!=' ) )
            // InternalVampireLanguage.g:4130:1: ( '!=' )
            {
            // InternalVampireLanguage.g:4130:1: ( '!=' )
            // InternalVampireLanguage.g:4131:2: '!='
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4141:1: rule__VLSUnaryInfix__Group_1_0_1__0 : rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4145:1: ( rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1 )
            // InternalVampireLanguage.g:4146:2: rule__VLSUnaryInfix__Group_1_0_1__0__Impl rule__VLSUnaryInfix__Group_1_0_1__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalVampireLanguage.g:4153:1: rule__VLSUnaryInfix__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4157:1: ( ( () ) )
            // InternalVampireLanguage.g:4158:1: ( () )
            {
            // InternalVampireLanguage.g:4158:1: ( () )
            // InternalVampireLanguage.g:4159:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSEqualityLeftAction_1_0_1_0()); 
            // InternalVampireLanguage.g:4160:2: ()
            // InternalVampireLanguage.g:4160:3: 
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
    // InternalVampireLanguage.g:4168:1: rule__VLSUnaryInfix__Group_1_0_1__1 : rule__VLSUnaryInfix__Group_1_0_1__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4172:1: ( rule__VLSUnaryInfix__Group_1_0_1__1__Impl )
            // InternalVampireLanguage.g:4173:2: rule__VLSUnaryInfix__Group_1_0_1__1__Impl
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
    // InternalVampireLanguage.g:4179:1: rule__VLSUnaryInfix__Group_1_0_1__1__Impl : ( '=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4183:1: ( ( '=' ) )
            // InternalVampireLanguage.g:4184:1: ( '=' )
            {
            // InternalVampireLanguage.g:4184:1: ( '=' )
            // InternalVampireLanguage.g:4185:2: '='
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getEqualsSignKeyword_1_0_1_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4195:1: rule__VLSUnaryInfix__Group_1_0_2__0 : rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1 ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4199:1: ( rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1 )
            // InternalVampireLanguage.g:4200:2: rule__VLSUnaryInfix__Group_1_0_2__0__Impl rule__VLSUnaryInfix__Group_1_0_2__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalVampireLanguage.g:4207:1: rule__VLSUnaryInfix__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4211:1: ( ( () ) )
            // InternalVampireLanguage.g:4212:1: ( () )
            {
            // InternalVampireLanguage.g:4212:1: ( () )
            // InternalVampireLanguage.g:4213:2: ()
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getVLSAssignmentLeftAction_1_0_2_0()); 
            // InternalVampireLanguage.g:4214:2: ()
            // InternalVampireLanguage.g:4214:3: 
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
    // InternalVampireLanguage.g:4222:1: rule__VLSUnaryInfix__Group_1_0_2__1 : rule__VLSUnaryInfix__Group_1_0_2__1__Impl ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4226:1: ( rule__VLSUnaryInfix__Group_1_0_2__1__Impl )
            // InternalVampireLanguage.g:4227:2: rule__VLSUnaryInfix__Group_1_0_2__1__Impl
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
    // InternalVampireLanguage.g:4233:1: rule__VLSUnaryInfix__Group_1_0_2__1__Impl : ( ':=' ) ;
    public final void rule__VLSUnaryInfix__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4237:1: ( ( ':=' ) )
            // InternalVampireLanguage.g:4238:1: ( ':=' )
            {
            // InternalVampireLanguage.g:4238:1: ( ':=' )
            // InternalVampireLanguage.g:4239:2: ':='
            {
             before(grammarAccess.getVLSUnaryInfixAccess().getColonEqualsSignKeyword_1_0_2_1()); 
            match(input,68,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4249:1: rule__VLSAtomicConstant__Group_0__0 : rule__VLSAtomicConstant__Group_0__0__Impl rule__VLSAtomicConstant__Group_0__1 ;
    public final void rule__VLSAtomicConstant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4253:1: ( rule__VLSAtomicConstant__Group_0__0__Impl rule__VLSAtomicConstant__Group_0__1 )
            // InternalVampireLanguage.g:4254:2: rule__VLSAtomicConstant__Group_0__0__Impl rule__VLSAtomicConstant__Group_0__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalVampireLanguage.g:4261:1: rule__VLSAtomicConstant__Group_0__0__Impl : ( () ) ;
    public final void rule__VLSAtomicConstant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4265:1: ( ( () ) )
            // InternalVampireLanguage.g:4266:1: ( () )
            {
            // InternalVampireLanguage.g:4266:1: ( () )
            // InternalVampireLanguage.g:4267:2: ()
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getVLSConstantAction_0_0()); 
            // InternalVampireLanguage.g:4268:2: ()
            // InternalVampireLanguage.g:4268:3: 
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
    // InternalVampireLanguage.g:4276:1: rule__VLSAtomicConstant__Group_0__1 : rule__VLSAtomicConstant__Group_0__1__Impl ;
    public final void rule__VLSAtomicConstant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4280:1: ( rule__VLSAtomicConstant__Group_0__1__Impl )
            // InternalVampireLanguage.g:4281:2: rule__VLSAtomicConstant__Group_0__1__Impl
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
    // InternalVampireLanguage.g:4287:1: rule__VLSAtomicConstant__Group_0__1__Impl : ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) ) ;
    public final void rule__VLSAtomicConstant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4291:1: ( ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) ) )
            // InternalVampireLanguage.g:4292:1: ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) )
            {
            // InternalVampireLanguage.g:4292:1: ( ( rule__VLSAtomicConstant__NameAssignment_0_1 ) )
            // InternalVampireLanguage.g:4293:2: ( rule__VLSAtomicConstant__NameAssignment_0_1 )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getNameAssignment_0_1()); 
            // InternalVampireLanguage.g:4294:2: ( rule__VLSAtomicConstant__NameAssignment_0_1 )
            // InternalVampireLanguage.g:4294:3: rule__VLSAtomicConstant__NameAssignment_0_1
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
    // InternalVampireLanguage.g:4303:1: rule__VLSAtomicConstant__Group_1__0 : rule__VLSAtomicConstant__Group_1__0__Impl rule__VLSAtomicConstant__Group_1__1 ;
    public final void rule__VLSAtomicConstant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4307:1: ( rule__VLSAtomicConstant__Group_1__0__Impl rule__VLSAtomicConstant__Group_1__1 )
            // InternalVampireLanguage.g:4308:2: rule__VLSAtomicConstant__Group_1__0__Impl rule__VLSAtomicConstant__Group_1__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalVampireLanguage.g:4315:1: rule__VLSAtomicConstant__Group_1__0__Impl : ( () ) ;
    public final void rule__VLSAtomicConstant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4319:1: ( ( () ) )
            // InternalVampireLanguage.g:4320:1: ( () )
            {
            // InternalVampireLanguage.g:4320:1: ( () )
            // InternalVampireLanguage.g:4321:2: ()
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getVLSTrueAction_1_0()); 
            // InternalVampireLanguage.g:4322:2: ()
            // InternalVampireLanguage.g:4322:3: 
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
    // InternalVampireLanguage.g:4330:1: rule__VLSAtomicConstant__Group_1__1 : rule__VLSAtomicConstant__Group_1__1__Impl ;
    public final void rule__VLSAtomicConstant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4334:1: ( rule__VLSAtomicConstant__Group_1__1__Impl )
            // InternalVampireLanguage.g:4335:2: rule__VLSAtomicConstant__Group_1__1__Impl
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
    // InternalVampireLanguage.g:4341:1: rule__VLSAtomicConstant__Group_1__1__Impl : ( '$true' ) ;
    public final void rule__VLSAtomicConstant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4345:1: ( ( '$true' ) )
            // InternalVampireLanguage.g:4346:1: ( '$true' )
            {
            // InternalVampireLanguage.g:4346:1: ( '$true' )
            // InternalVampireLanguage.g:4347:2: '$true'
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getTrueKeyword_1_1()); 
            match(input,69,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4357:1: rule__VLSAtomicConstant__Group_2__0 : rule__VLSAtomicConstant__Group_2__0__Impl rule__VLSAtomicConstant__Group_2__1 ;
    public final void rule__VLSAtomicConstant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4361:1: ( rule__VLSAtomicConstant__Group_2__0__Impl rule__VLSAtomicConstant__Group_2__1 )
            // InternalVampireLanguage.g:4362:2: rule__VLSAtomicConstant__Group_2__0__Impl rule__VLSAtomicConstant__Group_2__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalVampireLanguage.g:4369:1: rule__VLSAtomicConstant__Group_2__0__Impl : ( () ) ;
    public final void rule__VLSAtomicConstant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4373:1: ( ( () ) )
            // InternalVampireLanguage.g:4374:1: ( () )
            {
            // InternalVampireLanguage.g:4374:1: ( () )
            // InternalVampireLanguage.g:4375:2: ()
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getVLSFalseAction_2_0()); 
            // InternalVampireLanguage.g:4376:2: ()
            // InternalVampireLanguage.g:4376:3: 
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
    // InternalVampireLanguage.g:4384:1: rule__VLSAtomicConstant__Group_2__1 : rule__VLSAtomicConstant__Group_2__1__Impl ;
    public final void rule__VLSAtomicConstant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4388:1: ( rule__VLSAtomicConstant__Group_2__1__Impl )
            // InternalVampireLanguage.g:4389:2: rule__VLSAtomicConstant__Group_2__1__Impl
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
    // InternalVampireLanguage.g:4395:1: rule__VLSAtomicConstant__Group_2__1__Impl : ( '$false' ) ;
    public final void rule__VLSAtomicConstant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4399:1: ( ( '$false' ) )
            // InternalVampireLanguage.g:4400:1: ( '$false' )
            {
            // InternalVampireLanguage.g:4400:1: ( '$false' )
            // InternalVampireLanguage.g:4401:2: '$false'
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getFalseKeyword_2_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4411:1: rule__VLSAtomicFunction__Group_0__0 : rule__VLSAtomicFunction__Group_0__0__Impl rule__VLSAtomicFunction__Group_0__1 ;
    public final void rule__VLSAtomicFunction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4415:1: ( rule__VLSAtomicFunction__Group_0__0__Impl rule__VLSAtomicFunction__Group_0__1 )
            // InternalVampireLanguage.g:4416:2: rule__VLSAtomicFunction__Group_0__0__Impl rule__VLSAtomicFunction__Group_0__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalVampireLanguage.g:4423:1: rule__VLSAtomicFunction__Group_0__0__Impl : ( () ) ;
    public final void rule__VLSAtomicFunction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4427:1: ( ( () ) )
            // InternalVampireLanguage.g:4428:1: ( () )
            {
            // InternalVampireLanguage.g:4428:1: ( () )
            // InternalVampireLanguage.g:4429:2: ()
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getVLSFunctionAction_0_0()); 
            // InternalVampireLanguage.g:4430:2: ()
            // InternalVampireLanguage.g:4430:3: 
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
    // InternalVampireLanguage.g:4438:1: rule__VLSAtomicFunction__Group_0__1 : rule__VLSAtomicFunction__Group_0__1__Impl rule__VLSAtomicFunction__Group_0__2 ;
    public final void rule__VLSAtomicFunction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4442:1: ( rule__VLSAtomicFunction__Group_0__1__Impl rule__VLSAtomicFunction__Group_0__2 )
            // InternalVampireLanguage.g:4443:2: rule__VLSAtomicFunction__Group_0__1__Impl rule__VLSAtomicFunction__Group_0__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalVampireLanguage.g:4450:1: rule__VLSAtomicFunction__Group_0__1__Impl : ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4454:1: ( ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) ) )
            // InternalVampireLanguage.g:4455:1: ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) )
            {
            // InternalVampireLanguage.g:4455:1: ( ( rule__VLSAtomicFunction__ConstantAssignment_0_1 ) )
            // InternalVampireLanguage.g:4456:2: ( rule__VLSAtomicFunction__ConstantAssignment_0_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getConstantAssignment_0_1()); 
            // InternalVampireLanguage.g:4457:2: ( rule__VLSAtomicFunction__ConstantAssignment_0_1 )
            // InternalVampireLanguage.g:4457:3: rule__VLSAtomicFunction__ConstantAssignment_0_1
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
    // InternalVampireLanguage.g:4465:1: rule__VLSAtomicFunction__Group_0__2 : rule__VLSAtomicFunction__Group_0__2__Impl ;
    public final void rule__VLSAtomicFunction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4469:1: ( rule__VLSAtomicFunction__Group_0__2__Impl )
            // InternalVampireLanguage.g:4470:2: rule__VLSAtomicFunction__Group_0__2__Impl
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
    // InternalVampireLanguage.g:4476:1: rule__VLSAtomicFunction__Group_0__2__Impl : ( ( rule__VLSAtomicFunction__Group_0_2__0 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4480:1: ( ( ( rule__VLSAtomicFunction__Group_0_2__0 ) ) )
            // InternalVampireLanguage.g:4481:1: ( ( rule__VLSAtomicFunction__Group_0_2__0 ) )
            {
            // InternalVampireLanguage.g:4481:1: ( ( rule__VLSAtomicFunction__Group_0_2__0 ) )
            // InternalVampireLanguage.g:4482:2: ( rule__VLSAtomicFunction__Group_0_2__0 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0_2()); 
            // InternalVampireLanguage.g:4483:2: ( rule__VLSAtomicFunction__Group_0_2__0 )
            // InternalVampireLanguage.g:4483:3: rule__VLSAtomicFunction__Group_0_2__0
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
    // InternalVampireLanguage.g:4492:1: rule__VLSAtomicFunction__Group_0_2__0 : rule__VLSAtomicFunction__Group_0_2__0__Impl rule__VLSAtomicFunction__Group_0_2__1 ;
    public final void rule__VLSAtomicFunction__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4496:1: ( rule__VLSAtomicFunction__Group_0_2__0__Impl rule__VLSAtomicFunction__Group_0_2__1 )
            // InternalVampireLanguage.g:4497:2: rule__VLSAtomicFunction__Group_0_2__0__Impl rule__VLSAtomicFunction__Group_0_2__1
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
    // InternalVampireLanguage.g:4504:1: rule__VLSAtomicFunction__Group_0_2__0__Impl : ( '(' ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4508:1: ( ( '(' ) )
            // InternalVampireLanguage.g:4509:1: ( '(' )
            {
            // InternalVampireLanguage.g:4509:1: ( '(' )
            // InternalVampireLanguage.g:4510:2: '('
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getLeftParenthesisKeyword_0_2_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4519:1: rule__VLSAtomicFunction__Group_0_2__1 : rule__VLSAtomicFunction__Group_0_2__1__Impl rule__VLSAtomicFunction__Group_0_2__2 ;
    public final void rule__VLSAtomicFunction__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4523:1: ( rule__VLSAtomicFunction__Group_0_2__1__Impl rule__VLSAtomicFunction__Group_0_2__2 )
            // InternalVampireLanguage.g:4524:2: rule__VLSAtomicFunction__Group_0_2__1__Impl rule__VLSAtomicFunction__Group_0_2__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalVampireLanguage.g:4531:1: rule__VLSAtomicFunction__Group_0_2__1__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4535:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) ) )
            // InternalVampireLanguage.g:4536:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) )
            {
            // InternalVampireLanguage.g:4536:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 ) )
            // InternalVampireLanguage.g:4537:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_0_2_1()); 
            // InternalVampireLanguage.g:4538:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_1 )
            // InternalVampireLanguage.g:4538:3: rule__VLSAtomicFunction__TermsAssignment_0_2_1
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
    // InternalVampireLanguage.g:4546:1: rule__VLSAtomicFunction__Group_0_2__2 : rule__VLSAtomicFunction__Group_0_2__2__Impl rule__VLSAtomicFunction__Group_0_2__3 ;
    public final void rule__VLSAtomicFunction__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4550:1: ( rule__VLSAtomicFunction__Group_0_2__2__Impl rule__VLSAtomicFunction__Group_0_2__3 )
            // InternalVampireLanguage.g:4551:2: rule__VLSAtomicFunction__Group_0_2__2__Impl rule__VLSAtomicFunction__Group_0_2__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalVampireLanguage.g:4558:1: rule__VLSAtomicFunction__Group_0_2__2__Impl : ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4562:1: ( ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* ) )
            // InternalVampireLanguage.g:4563:1: ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* )
            {
            // InternalVampireLanguage.g:4563:1: ( ( rule__VLSAtomicFunction__Group_0_2_2__0 )* )
            // InternalVampireLanguage.g:4564:2: ( rule__VLSAtomicFunction__Group_0_2_2__0 )*
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0_2_2()); 
            // InternalVampireLanguage.g:4565:2: ( rule__VLSAtomicFunction__Group_0_2_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==45) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalVampireLanguage.g:4565:3: rule__VLSAtomicFunction__Group_0_2_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__VLSAtomicFunction__Group_0_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalVampireLanguage.g:4573:1: rule__VLSAtomicFunction__Group_0_2__3 : rule__VLSAtomicFunction__Group_0_2__3__Impl ;
    public final void rule__VLSAtomicFunction__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4577:1: ( rule__VLSAtomicFunction__Group_0_2__3__Impl )
            // InternalVampireLanguage.g:4578:2: rule__VLSAtomicFunction__Group_0_2__3__Impl
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
    // InternalVampireLanguage.g:4584:1: rule__VLSAtomicFunction__Group_0_2__3__Impl : ( ')' ) ;
    public final void rule__VLSAtomicFunction__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4588:1: ( ( ')' ) )
            // InternalVampireLanguage.g:4589:1: ( ')' )
            {
            // InternalVampireLanguage.g:4589:1: ( ')' )
            // InternalVampireLanguage.g:4590:2: ')'
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getRightParenthesisKeyword_0_2_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4600:1: rule__VLSAtomicFunction__Group_0_2_2__0 : rule__VLSAtomicFunction__Group_0_2_2__0__Impl rule__VLSAtomicFunction__Group_0_2_2__1 ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4604:1: ( rule__VLSAtomicFunction__Group_0_2_2__0__Impl rule__VLSAtomicFunction__Group_0_2_2__1 )
            // InternalVampireLanguage.g:4605:2: rule__VLSAtomicFunction__Group_0_2_2__0__Impl rule__VLSAtomicFunction__Group_0_2_2__1
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
    // InternalVampireLanguage.g:4612:1: rule__VLSAtomicFunction__Group_0_2_2__0__Impl : ( ',' ) ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4616:1: ( ( ',' ) )
            // InternalVampireLanguage.g:4617:1: ( ',' )
            {
            // InternalVampireLanguage.g:4617:1: ( ',' )
            // InternalVampireLanguage.g:4618:2: ','
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
    // InternalVampireLanguage.g:4627:1: rule__VLSAtomicFunction__Group_0_2_2__1 : rule__VLSAtomicFunction__Group_0_2_2__1__Impl ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4631:1: ( rule__VLSAtomicFunction__Group_0_2_2__1__Impl )
            // InternalVampireLanguage.g:4632:2: rule__VLSAtomicFunction__Group_0_2_2__1__Impl
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
    // InternalVampireLanguage.g:4638:1: rule__VLSAtomicFunction__Group_0_2_2__1__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_0_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4642:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) ) )
            // InternalVampireLanguage.g:4643:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) )
            {
            // InternalVampireLanguage.g:4643:1: ( ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 ) )
            // InternalVampireLanguage.g:4644:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_0_2_2_1()); 
            // InternalVampireLanguage.g:4645:2: ( rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 )
            // InternalVampireLanguage.g:4645:3: rule__VLSAtomicFunction__TermsAssignment_0_2_2_1
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
    // InternalVampireLanguage.g:4654:1: rule__VLSAtomicFunction__Group_1__0 : rule__VLSAtomicFunction__Group_1__0__Impl rule__VLSAtomicFunction__Group_1__1 ;
    public final void rule__VLSAtomicFunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4658:1: ( rule__VLSAtomicFunction__Group_1__0__Impl rule__VLSAtomicFunction__Group_1__1 )
            // InternalVampireLanguage.g:4659:2: rule__VLSAtomicFunction__Group_1__0__Impl rule__VLSAtomicFunction__Group_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalVampireLanguage.g:4666:1: rule__VLSAtomicFunction__Group_1__0__Impl : ( () ) ;
    public final void rule__VLSAtomicFunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4670:1: ( ( () ) )
            // InternalVampireLanguage.g:4671:1: ( () )
            {
            // InternalVampireLanguage.g:4671:1: ( () )
            // InternalVampireLanguage.g:4672:2: ()
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getVLSLessAction_1_0()); 
            // InternalVampireLanguage.g:4673:2: ()
            // InternalVampireLanguage.g:4673:3: 
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
    // InternalVampireLanguage.g:4681:1: rule__VLSAtomicFunction__Group_1__1 : rule__VLSAtomicFunction__Group_1__1__Impl rule__VLSAtomicFunction__Group_1__2 ;
    public final void rule__VLSAtomicFunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4685:1: ( rule__VLSAtomicFunction__Group_1__1__Impl rule__VLSAtomicFunction__Group_1__2 )
            // InternalVampireLanguage.g:4686:2: rule__VLSAtomicFunction__Group_1__1__Impl rule__VLSAtomicFunction__Group_1__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalVampireLanguage.g:4693:1: rule__VLSAtomicFunction__Group_1__1__Impl : ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) ) ;
    public final void rule__VLSAtomicFunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4697:1: ( ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:4698:1: ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:4698:1: ( ( rule__VLSAtomicFunction__NameAssignment_1_1 ) )
            // InternalVampireLanguage.g:4699:2: ( rule__VLSAtomicFunction__NameAssignment_1_1 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getNameAssignment_1_1()); 
            // InternalVampireLanguage.g:4700:2: ( rule__VLSAtomicFunction__NameAssignment_1_1 )
            // InternalVampireLanguage.g:4700:3: rule__VLSAtomicFunction__NameAssignment_1_1
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
    // InternalVampireLanguage.g:4708:1: rule__VLSAtomicFunction__Group_1__2 : rule__VLSAtomicFunction__Group_1__2__Impl rule__VLSAtomicFunction__Group_1__3 ;
    public final void rule__VLSAtomicFunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4712:1: ( rule__VLSAtomicFunction__Group_1__2__Impl rule__VLSAtomicFunction__Group_1__3 )
            // InternalVampireLanguage.g:4713:2: rule__VLSAtomicFunction__Group_1__2__Impl rule__VLSAtomicFunction__Group_1__3
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
    // InternalVampireLanguage.g:4720:1: rule__VLSAtomicFunction__Group_1__2__Impl : ( '(' ) ;
    public final void rule__VLSAtomicFunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4724:1: ( ( '(' ) )
            // InternalVampireLanguage.g:4725:1: ( '(' )
            {
            // InternalVampireLanguage.g:4725:1: ( '(' )
            // InternalVampireLanguage.g:4726:2: '('
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4735:1: rule__VLSAtomicFunction__Group_1__3 : rule__VLSAtomicFunction__Group_1__3__Impl rule__VLSAtomicFunction__Group_1__4 ;
    public final void rule__VLSAtomicFunction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4739:1: ( rule__VLSAtomicFunction__Group_1__3__Impl rule__VLSAtomicFunction__Group_1__4 )
            // InternalVampireLanguage.g:4740:2: rule__VLSAtomicFunction__Group_1__3__Impl rule__VLSAtomicFunction__Group_1__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalVampireLanguage.g:4747:1: rule__VLSAtomicFunction__Group_1__3__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) ) ;
    public final void rule__VLSAtomicFunction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4751:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) ) )
            // InternalVampireLanguage.g:4752:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) )
            {
            // InternalVampireLanguage.g:4752:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_3 ) )
            // InternalVampireLanguage.g:4753:2: ( rule__VLSAtomicFunction__TermsAssignment_1_3 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_1_3()); 
            // InternalVampireLanguage.g:4754:2: ( rule__VLSAtomicFunction__TermsAssignment_1_3 )
            // InternalVampireLanguage.g:4754:3: rule__VLSAtomicFunction__TermsAssignment_1_3
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
    // InternalVampireLanguage.g:4762:1: rule__VLSAtomicFunction__Group_1__4 : rule__VLSAtomicFunction__Group_1__4__Impl rule__VLSAtomicFunction__Group_1__5 ;
    public final void rule__VLSAtomicFunction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4766:1: ( rule__VLSAtomicFunction__Group_1__4__Impl rule__VLSAtomicFunction__Group_1__5 )
            // InternalVampireLanguage.g:4767:2: rule__VLSAtomicFunction__Group_1__4__Impl rule__VLSAtomicFunction__Group_1__5
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
    // InternalVampireLanguage.g:4774:1: rule__VLSAtomicFunction__Group_1__4__Impl : ( ',' ) ;
    public final void rule__VLSAtomicFunction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4778:1: ( ( ',' ) )
            // InternalVampireLanguage.g:4779:1: ( ',' )
            {
            // InternalVampireLanguage.g:4779:1: ( ',' )
            // InternalVampireLanguage.g:4780:2: ','
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
    // InternalVampireLanguage.g:4789:1: rule__VLSAtomicFunction__Group_1__5 : rule__VLSAtomicFunction__Group_1__5__Impl rule__VLSAtomicFunction__Group_1__6 ;
    public final void rule__VLSAtomicFunction__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4793:1: ( rule__VLSAtomicFunction__Group_1__5__Impl rule__VLSAtomicFunction__Group_1__6 )
            // InternalVampireLanguage.g:4794:2: rule__VLSAtomicFunction__Group_1__5__Impl rule__VLSAtomicFunction__Group_1__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalVampireLanguage.g:4801:1: rule__VLSAtomicFunction__Group_1__5__Impl : ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) ) ;
    public final void rule__VLSAtomicFunction__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4805:1: ( ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) ) )
            // InternalVampireLanguage.g:4806:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) )
            {
            // InternalVampireLanguage.g:4806:1: ( ( rule__VLSAtomicFunction__TermsAssignment_1_5 ) )
            // InternalVampireLanguage.g:4807:2: ( rule__VLSAtomicFunction__TermsAssignment_1_5 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_1_5()); 
            // InternalVampireLanguage.g:4808:2: ( rule__VLSAtomicFunction__TermsAssignment_1_5 )
            // InternalVampireLanguage.g:4808:3: rule__VLSAtomicFunction__TermsAssignment_1_5
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
    // InternalVampireLanguage.g:4816:1: rule__VLSAtomicFunction__Group_1__6 : rule__VLSAtomicFunction__Group_1__6__Impl ;
    public final void rule__VLSAtomicFunction__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4820:1: ( rule__VLSAtomicFunction__Group_1__6__Impl )
            // InternalVampireLanguage.g:4821:2: rule__VLSAtomicFunction__Group_1__6__Impl
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
    // InternalVampireLanguage.g:4827:1: rule__VLSAtomicFunction__Group_1__6__Impl : ( ')' ) ;
    public final void rule__VLSAtomicFunction__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4831:1: ( ( ')' ) )
            // InternalVampireLanguage.g:4832:1: ( ')' )
            {
            // InternalVampireLanguage.g:4832:1: ( ')' )
            // InternalVampireLanguage.g:4833:2: ')'
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getRightParenthesisKeyword_1_6()); 
            match(input,50,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4843:1: rule__VLSFunctionFof__Group__0 : rule__VLSFunctionFof__Group__0__Impl rule__VLSFunctionFof__Group__1 ;
    public final void rule__VLSFunctionFof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4847:1: ( rule__VLSFunctionFof__Group__0__Impl rule__VLSFunctionFof__Group__1 )
            // InternalVampireLanguage.g:4848:2: rule__VLSFunctionFof__Group__0__Impl rule__VLSFunctionFof__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalVampireLanguage.g:4855:1: rule__VLSFunctionFof__Group__0__Impl : ( ( rule__VLSFunctionFof__FunctorAssignment_0 ) ) ;
    public final void rule__VLSFunctionFof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4859:1: ( ( ( rule__VLSFunctionFof__FunctorAssignment_0 ) ) )
            // InternalVampireLanguage.g:4860:1: ( ( rule__VLSFunctionFof__FunctorAssignment_0 ) )
            {
            // InternalVampireLanguage.g:4860:1: ( ( rule__VLSFunctionFof__FunctorAssignment_0 ) )
            // InternalVampireLanguage.g:4861:2: ( rule__VLSFunctionFof__FunctorAssignment_0 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getFunctorAssignment_0()); 
            // InternalVampireLanguage.g:4862:2: ( rule__VLSFunctionFof__FunctorAssignment_0 )
            // InternalVampireLanguage.g:4862:3: rule__VLSFunctionFof__FunctorAssignment_0
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
    // InternalVampireLanguage.g:4870:1: rule__VLSFunctionFof__Group__1 : rule__VLSFunctionFof__Group__1__Impl ;
    public final void rule__VLSFunctionFof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4874:1: ( rule__VLSFunctionFof__Group__1__Impl )
            // InternalVampireLanguage.g:4875:2: rule__VLSFunctionFof__Group__1__Impl
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
    // InternalVampireLanguage.g:4881:1: rule__VLSFunctionFof__Group__1__Impl : ( ( rule__VLSFunctionFof__Group_1__0 )? ) ;
    public final void rule__VLSFunctionFof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4885:1: ( ( ( rule__VLSFunctionFof__Group_1__0 )? ) )
            // InternalVampireLanguage.g:4886:1: ( ( rule__VLSFunctionFof__Group_1__0 )? )
            {
            // InternalVampireLanguage.g:4886:1: ( ( rule__VLSFunctionFof__Group_1__0 )? )
            // InternalVampireLanguage.g:4887:2: ( rule__VLSFunctionFof__Group_1__0 )?
            {
             before(grammarAccess.getVLSFunctionFofAccess().getGroup_1()); 
            // InternalVampireLanguage.g:4888:2: ( rule__VLSFunctionFof__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalVampireLanguage.g:4888:3: rule__VLSFunctionFof__Group_1__0
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
    // InternalVampireLanguage.g:4897:1: rule__VLSFunctionFof__Group_1__0 : rule__VLSFunctionFof__Group_1__0__Impl rule__VLSFunctionFof__Group_1__1 ;
    public final void rule__VLSFunctionFof__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4901:1: ( rule__VLSFunctionFof__Group_1__0__Impl rule__VLSFunctionFof__Group_1__1 )
            // InternalVampireLanguage.g:4902:2: rule__VLSFunctionFof__Group_1__0__Impl rule__VLSFunctionFof__Group_1__1
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
    // InternalVampireLanguage.g:4909:1: rule__VLSFunctionFof__Group_1__0__Impl : ( '(' ) ;
    public final void rule__VLSFunctionFof__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4913:1: ( ( '(' ) )
            // InternalVampireLanguage.g:4914:1: ( '(' )
            {
            // InternalVampireLanguage.g:4914:1: ( '(' )
            // InternalVampireLanguage.g:4915:2: '('
            {
             before(grammarAccess.getVLSFunctionFofAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalVampireLanguage.g:4924:1: rule__VLSFunctionFof__Group_1__1 : rule__VLSFunctionFof__Group_1__1__Impl rule__VLSFunctionFof__Group_1__2 ;
    public final void rule__VLSFunctionFof__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4928:1: ( rule__VLSFunctionFof__Group_1__1__Impl rule__VLSFunctionFof__Group_1__2 )
            // InternalVampireLanguage.g:4929:2: rule__VLSFunctionFof__Group_1__1__Impl rule__VLSFunctionFof__Group_1__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalVampireLanguage.g:4936:1: rule__VLSFunctionFof__Group_1__1__Impl : ( ( rule__VLSFunctionFof__TermsAssignment_1_1 ) ) ;
    public final void rule__VLSFunctionFof__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4940:1: ( ( ( rule__VLSFunctionFof__TermsAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:4941:1: ( ( rule__VLSFunctionFof__TermsAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:4941:1: ( ( rule__VLSFunctionFof__TermsAssignment_1_1 ) )
            // InternalVampireLanguage.g:4942:2: ( rule__VLSFunctionFof__TermsAssignment_1_1 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getTermsAssignment_1_1()); 
            // InternalVampireLanguage.g:4943:2: ( rule__VLSFunctionFof__TermsAssignment_1_1 )
            // InternalVampireLanguage.g:4943:3: rule__VLSFunctionFof__TermsAssignment_1_1
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
    // InternalVampireLanguage.g:4951:1: rule__VLSFunctionFof__Group_1__2 : rule__VLSFunctionFof__Group_1__2__Impl rule__VLSFunctionFof__Group_1__3 ;
    public final void rule__VLSFunctionFof__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4955:1: ( rule__VLSFunctionFof__Group_1__2__Impl rule__VLSFunctionFof__Group_1__3 )
            // InternalVampireLanguage.g:4956:2: rule__VLSFunctionFof__Group_1__2__Impl rule__VLSFunctionFof__Group_1__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalVampireLanguage.g:4963:1: rule__VLSFunctionFof__Group_1__2__Impl : ( ( rule__VLSFunctionFof__Group_1_2__0 )* ) ;
    public final void rule__VLSFunctionFof__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4967:1: ( ( ( rule__VLSFunctionFof__Group_1_2__0 )* ) )
            // InternalVampireLanguage.g:4968:1: ( ( rule__VLSFunctionFof__Group_1_2__0 )* )
            {
            // InternalVampireLanguage.g:4968:1: ( ( rule__VLSFunctionFof__Group_1_2__0 )* )
            // InternalVampireLanguage.g:4969:2: ( rule__VLSFunctionFof__Group_1_2__0 )*
            {
             before(grammarAccess.getVLSFunctionFofAccess().getGroup_1_2()); 
            // InternalVampireLanguage.g:4970:2: ( rule__VLSFunctionFof__Group_1_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==45) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalVampireLanguage.g:4970:3: rule__VLSFunctionFof__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__VLSFunctionFof__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalVampireLanguage.g:4978:1: rule__VLSFunctionFof__Group_1__3 : rule__VLSFunctionFof__Group_1__3__Impl ;
    public final void rule__VLSFunctionFof__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4982:1: ( rule__VLSFunctionFof__Group_1__3__Impl )
            // InternalVampireLanguage.g:4983:2: rule__VLSFunctionFof__Group_1__3__Impl
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
    // InternalVampireLanguage.g:4989:1: rule__VLSFunctionFof__Group_1__3__Impl : ( ')' ) ;
    public final void rule__VLSFunctionFof__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:4993:1: ( ( ')' ) )
            // InternalVampireLanguage.g:4994:1: ( ')' )
            {
            // InternalVampireLanguage.g:4994:1: ( ')' )
            // InternalVampireLanguage.g:4995:2: ')'
            {
             before(grammarAccess.getVLSFunctionFofAccess().getRightParenthesisKeyword_1_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalVampireLanguage.g:5005:1: rule__VLSFunctionFof__Group_1_2__0 : rule__VLSFunctionFof__Group_1_2__0__Impl rule__VLSFunctionFof__Group_1_2__1 ;
    public final void rule__VLSFunctionFof__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5009:1: ( rule__VLSFunctionFof__Group_1_2__0__Impl rule__VLSFunctionFof__Group_1_2__1 )
            // InternalVampireLanguage.g:5010:2: rule__VLSFunctionFof__Group_1_2__0__Impl rule__VLSFunctionFof__Group_1_2__1
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
    // InternalVampireLanguage.g:5017:1: rule__VLSFunctionFof__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__VLSFunctionFof__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5021:1: ( ( ',' ) )
            // InternalVampireLanguage.g:5022:1: ( ',' )
            {
            // InternalVampireLanguage.g:5022:1: ( ',' )
            // InternalVampireLanguage.g:5023:2: ','
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
    // InternalVampireLanguage.g:5032:1: rule__VLSFunctionFof__Group_1_2__1 : rule__VLSFunctionFof__Group_1_2__1__Impl ;
    public final void rule__VLSFunctionFof__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5036:1: ( rule__VLSFunctionFof__Group_1_2__1__Impl )
            // InternalVampireLanguage.g:5037:2: rule__VLSFunctionFof__Group_1_2__1__Impl
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
    // InternalVampireLanguage.g:5043:1: rule__VLSFunctionFof__Group_1_2__1__Impl : ( ( rule__VLSFunctionFof__TermsAssignment_1_2_1 ) ) ;
    public final void rule__VLSFunctionFof__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5047:1: ( ( ( rule__VLSFunctionFof__TermsAssignment_1_2_1 ) ) )
            // InternalVampireLanguage.g:5048:1: ( ( rule__VLSFunctionFof__TermsAssignment_1_2_1 ) )
            {
            // InternalVampireLanguage.g:5048:1: ( ( rule__VLSFunctionFof__TermsAssignment_1_2_1 ) )
            // InternalVampireLanguage.g:5049:2: ( rule__VLSFunctionFof__TermsAssignment_1_2_1 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getTermsAssignment_1_2_1()); 
            // InternalVampireLanguage.g:5050:2: ( rule__VLSFunctionFof__TermsAssignment_1_2_1 )
            // InternalVampireLanguage.g:5050:3: rule__VLSFunctionFof__TermsAssignment_1_2_1
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
    // InternalVampireLanguage.g:5059:1: rule__VLSDefinedTerm__Group_0__0 : rule__VLSDefinedTerm__Group_0__0__Impl rule__VLSDefinedTerm__Group_0__1 ;
    public final void rule__VLSDefinedTerm__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5063:1: ( rule__VLSDefinedTerm__Group_0__0__Impl rule__VLSDefinedTerm__Group_0__1 )
            // InternalVampireLanguage.g:5064:2: rule__VLSDefinedTerm__Group_0__0__Impl rule__VLSDefinedTerm__Group_0__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalVampireLanguage.g:5071:1: rule__VLSDefinedTerm__Group_0__0__Impl : ( () ) ;
    public final void rule__VLSDefinedTerm__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5075:1: ( ( () ) )
            // InternalVampireLanguage.g:5076:1: ( () )
            {
            // InternalVampireLanguage.g:5076:1: ( () )
            // InternalVampireLanguage.g:5077:2: ()
            {
             before(grammarAccess.getVLSDefinedTermAccess().getVLSIntAction_0_0()); 
            // InternalVampireLanguage.g:5078:2: ()
            // InternalVampireLanguage.g:5078:3: 
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
    // InternalVampireLanguage.g:5086:1: rule__VLSDefinedTerm__Group_0__1 : rule__VLSDefinedTerm__Group_0__1__Impl ;
    public final void rule__VLSDefinedTerm__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5090:1: ( rule__VLSDefinedTerm__Group_0__1__Impl )
            // InternalVampireLanguage.g:5091:2: rule__VLSDefinedTerm__Group_0__1__Impl
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
    // InternalVampireLanguage.g:5097:1: rule__VLSDefinedTerm__Group_0__1__Impl : ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) ) ;
    public final void rule__VLSDefinedTerm__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5101:1: ( ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) ) )
            // InternalVampireLanguage.g:5102:1: ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) )
            {
            // InternalVampireLanguage.g:5102:1: ( ( rule__VLSDefinedTerm__ValueAssignment_0_1 ) )
            // InternalVampireLanguage.g:5103:2: ( rule__VLSDefinedTerm__ValueAssignment_0_1 )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_0_1()); 
            // InternalVampireLanguage.g:5104:2: ( rule__VLSDefinedTerm__ValueAssignment_0_1 )
            // InternalVampireLanguage.g:5104:3: rule__VLSDefinedTerm__ValueAssignment_0_1
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
    // InternalVampireLanguage.g:5113:1: rule__VLSDefinedTerm__Group_1__0 : rule__VLSDefinedTerm__Group_1__0__Impl rule__VLSDefinedTerm__Group_1__1 ;
    public final void rule__VLSDefinedTerm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5117:1: ( rule__VLSDefinedTerm__Group_1__0__Impl rule__VLSDefinedTerm__Group_1__1 )
            // InternalVampireLanguage.g:5118:2: rule__VLSDefinedTerm__Group_1__0__Impl rule__VLSDefinedTerm__Group_1__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalVampireLanguage.g:5125:1: rule__VLSDefinedTerm__Group_1__0__Impl : ( () ) ;
    public final void rule__VLSDefinedTerm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5129:1: ( ( () ) )
            // InternalVampireLanguage.g:5130:1: ( () )
            {
            // InternalVampireLanguage.g:5130:1: ( () )
            // InternalVampireLanguage.g:5131:2: ()
            {
             before(grammarAccess.getVLSDefinedTermAccess().getVLSRealAction_1_0()); 
            // InternalVampireLanguage.g:5132:2: ()
            // InternalVampireLanguage.g:5132:3: 
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
    // InternalVampireLanguage.g:5140:1: rule__VLSDefinedTerm__Group_1__1 : rule__VLSDefinedTerm__Group_1__1__Impl ;
    public final void rule__VLSDefinedTerm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5144:1: ( rule__VLSDefinedTerm__Group_1__1__Impl )
            // InternalVampireLanguage.g:5145:2: rule__VLSDefinedTerm__Group_1__1__Impl
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
    // InternalVampireLanguage.g:5151:1: rule__VLSDefinedTerm__Group_1__1__Impl : ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) ) ;
    public final void rule__VLSDefinedTerm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5155:1: ( ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) ) )
            // InternalVampireLanguage.g:5156:1: ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) )
            {
            // InternalVampireLanguage.g:5156:1: ( ( rule__VLSDefinedTerm__ValueAssignment_1_1 ) )
            // InternalVampireLanguage.g:5157:2: ( rule__VLSDefinedTerm__ValueAssignment_1_1 )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_1_1()); 
            // InternalVampireLanguage.g:5158:2: ( rule__VLSDefinedTerm__ValueAssignment_1_1 )
            // InternalVampireLanguage.g:5158:3: rule__VLSDefinedTerm__ValueAssignment_1_1
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
    // InternalVampireLanguage.g:5167:1: rule__VLSDefinedTerm__Group_2__0 : rule__VLSDefinedTerm__Group_2__0__Impl rule__VLSDefinedTerm__Group_2__1 ;
    public final void rule__VLSDefinedTerm__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5171:1: ( rule__VLSDefinedTerm__Group_2__0__Impl rule__VLSDefinedTerm__Group_2__1 )
            // InternalVampireLanguage.g:5172:2: rule__VLSDefinedTerm__Group_2__0__Impl rule__VLSDefinedTerm__Group_2__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalVampireLanguage.g:5179:1: rule__VLSDefinedTerm__Group_2__0__Impl : ( () ) ;
    public final void rule__VLSDefinedTerm__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5183:1: ( ( () ) )
            // InternalVampireLanguage.g:5184:1: ( () )
            {
            // InternalVampireLanguage.g:5184:1: ( () )
            // InternalVampireLanguage.g:5185:2: ()
            {
             before(grammarAccess.getVLSDefinedTermAccess().getVLSRationalAction_2_0()); 
            // InternalVampireLanguage.g:5186:2: ()
            // InternalVampireLanguage.g:5186:3: 
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
    // InternalVampireLanguage.g:5194:1: rule__VLSDefinedTerm__Group_2__1 : rule__VLSDefinedTerm__Group_2__1__Impl ;
    public final void rule__VLSDefinedTerm__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5198:1: ( rule__VLSDefinedTerm__Group_2__1__Impl )
            // InternalVampireLanguage.g:5199:2: rule__VLSDefinedTerm__Group_2__1__Impl
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
    // InternalVampireLanguage.g:5205:1: rule__VLSDefinedTerm__Group_2__1__Impl : ( ( rule__VLSDefinedTerm__ValueAssignment_2_1 ) ) ;
    public final void rule__VLSDefinedTerm__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5209:1: ( ( ( rule__VLSDefinedTerm__ValueAssignment_2_1 ) ) )
            // InternalVampireLanguage.g:5210:1: ( ( rule__VLSDefinedTerm__ValueAssignment_2_1 ) )
            {
            // InternalVampireLanguage.g:5210:1: ( ( rule__VLSDefinedTerm__ValueAssignment_2_1 ) )
            // InternalVampireLanguage.g:5211:2: ( rule__VLSDefinedTerm__ValueAssignment_2_1 )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_2_1()); 
            // InternalVampireLanguage.g:5212:2: ( rule__VLSDefinedTerm__ValueAssignment_2_1 )
            // InternalVampireLanguage.g:5212:3: rule__VLSDefinedTerm__ValueAssignment_2_1
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
    // InternalVampireLanguage.g:5221:1: rule__VLSDefinedTerm__Group_3__0 : rule__VLSDefinedTerm__Group_3__0__Impl rule__VLSDefinedTerm__Group_3__1 ;
    public final void rule__VLSDefinedTerm__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5225:1: ( rule__VLSDefinedTerm__Group_3__0__Impl rule__VLSDefinedTerm__Group_3__1 )
            // InternalVampireLanguage.g:5226:2: rule__VLSDefinedTerm__Group_3__0__Impl rule__VLSDefinedTerm__Group_3__1
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
    // InternalVampireLanguage.g:5233:1: rule__VLSDefinedTerm__Group_3__0__Impl : ( () ) ;
    public final void rule__VLSDefinedTerm__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5237:1: ( ( () ) )
            // InternalVampireLanguage.g:5238:1: ( () )
            {
            // InternalVampireLanguage.g:5238:1: ( () )
            // InternalVampireLanguage.g:5239:2: ()
            {
             before(grammarAccess.getVLSDefinedTermAccess().getVLSDoubleQuoteAction_3_0()); 
            // InternalVampireLanguage.g:5240:2: ()
            // InternalVampireLanguage.g:5240:3: 
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
    // InternalVampireLanguage.g:5248:1: rule__VLSDefinedTerm__Group_3__1 : rule__VLSDefinedTerm__Group_3__1__Impl ;
    public final void rule__VLSDefinedTerm__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5252:1: ( rule__VLSDefinedTerm__Group_3__1__Impl )
            // InternalVampireLanguage.g:5253:2: rule__VLSDefinedTerm__Group_3__1__Impl
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
    // InternalVampireLanguage.g:5259:1: rule__VLSDefinedTerm__Group_3__1__Impl : ( ( rule__VLSDefinedTerm__ValueAssignment_3_1 ) ) ;
    public final void rule__VLSDefinedTerm__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5263:1: ( ( ( rule__VLSDefinedTerm__ValueAssignment_3_1 ) ) )
            // InternalVampireLanguage.g:5264:1: ( ( rule__VLSDefinedTerm__ValueAssignment_3_1 ) )
            {
            // InternalVampireLanguage.g:5264:1: ( ( rule__VLSDefinedTerm__ValueAssignment_3_1 ) )
            // InternalVampireLanguage.g:5265:2: ( rule__VLSDefinedTerm__ValueAssignment_3_1 )
            {
             before(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_3_1()); 
            // InternalVampireLanguage.g:5266:2: ( rule__VLSDefinedTerm__ValueAssignment_3_1 )
            // InternalVampireLanguage.g:5266:3: rule__VLSDefinedTerm__ValueAssignment_3_1
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
    // InternalVampireLanguage.g:5275:1: rule__VampireModel__IncludesAssignment_0 : ( ruleVLSInclude ) ;
    public final void rule__VampireModel__IncludesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5279:1: ( ( ruleVLSInclude ) )
            // InternalVampireLanguage.g:5280:2: ( ruleVLSInclude )
            {
            // InternalVampireLanguage.g:5280:2: ( ruleVLSInclude )
            // InternalVampireLanguage.g:5281:3: ruleVLSInclude
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
    // InternalVampireLanguage.g:5290:1: rule__VampireModel__CommentsAssignment_1 : ( ruleVLSComment ) ;
    public final void rule__VampireModel__CommentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5294:1: ( ( ruleVLSComment ) )
            // InternalVampireLanguage.g:5295:2: ( ruleVLSComment )
            {
            // InternalVampireLanguage.g:5295:2: ( ruleVLSComment )
            // InternalVampireLanguage.g:5296:3: ruleVLSComment
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


    // $ANTLR start "rule__VampireModel__ConfirmationsAssignment_2"
    // InternalVampireLanguage.g:5305:1: rule__VampireModel__ConfirmationsAssignment_2 : ( ruleVLSConfirmations ) ;
    public final void rule__VampireModel__ConfirmationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5309:1: ( ( ruleVLSConfirmations ) )
            // InternalVampireLanguage.g:5310:2: ( ruleVLSConfirmations )
            {
            // InternalVampireLanguage.g:5310:2: ( ruleVLSConfirmations )
            // InternalVampireLanguage.g:5311:3: ruleVLSConfirmations
            {
             before(grammarAccess.getVampireModelAccess().getConfirmationsVLSConfirmationsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSConfirmations();

            state._fsp--;

             after(grammarAccess.getVampireModelAccess().getConfirmationsVLSConfirmationsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VampireModel__ConfirmationsAssignment_2"


    // $ANTLR start "rule__VampireModel__FormulasAssignment_3"
    // InternalVampireLanguage.g:5320:1: rule__VampireModel__FormulasAssignment_3 : ( ruleVLSFofFormula ) ;
    public final void rule__VampireModel__FormulasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5324:1: ( ( ruleVLSFofFormula ) )
            // InternalVampireLanguage.g:5325:2: ( ruleVLSFofFormula )
            {
            // InternalVampireLanguage.g:5325:2: ( ruleVLSFofFormula )
            // InternalVampireLanguage.g:5326:3: ruleVLSFofFormula
            {
             before(grammarAccess.getVampireModelAccess().getFormulasVLSFofFormulaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSFofFormula();

            state._fsp--;

             after(grammarAccess.getVampireModelAccess().getFormulasVLSFofFormulaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VampireModel__FormulasAssignment_3"


    // $ANTLR start "rule__VampireModel__TfformulasAssignment_4"
    // InternalVampireLanguage.g:5335:1: rule__VampireModel__TfformulasAssignment_4 : ( ruleVLSTffFormula ) ;
    public final void rule__VampireModel__TfformulasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5339:1: ( ( ruleVLSTffFormula ) )
            // InternalVampireLanguage.g:5340:2: ( ruleVLSTffFormula )
            {
            // InternalVampireLanguage.g:5340:2: ( ruleVLSTffFormula )
            // InternalVampireLanguage.g:5341:3: ruleVLSTffFormula
            {
             before(grammarAccess.getVampireModelAccess().getTfformulasVLSTffFormulaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSTffFormula();

            state._fsp--;

             after(grammarAccess.getVampireModelAccess().getTfformulasVLSTffFormulaParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VampireModel__TfformulasAssignment_4"


    // $ANTLR start "rule__VLSInclude__FileNameAssignment_1"
    // InternalVampireLanguage.g:5350:1: rule__VLSInclude__FileNameAssignment_1 : ( RULE_SINGLE_QUOTE ) ;
    public final void rule__VLSInclude__FileNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5354:1: ( ( RULE_SINGLE_QUOTE ) )
            // InternalVampireLanguage.g:5355:2: ( RULE_SINGLE_QUOTE )
            {
            // InternalVampireLanguage.g:5355:2: ( RULE_SINGLE_QUOTE )
            // InternalVampireLanguage.g:5356:3: RULE_SINGLE_QUOTE
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
    // InternalVampireLanguage.g:5365:1: rule__VLSInclude__NamesAssignment_2_1 : ( ruleVLSName ) ;
    public final void rule__VLSInclude__NamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5369:1: ( ( ruleVLSName ) )
            // InternalVampireLanguage.g:5370:2: ( ruleVLSName )
            {
            // InternalVampireLanguage.g:5370:2: ( ruleVLSName )
            // InternalVampireLanguage.g:5371:3: ruleVLSName
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
    // InternalVampireLanguage.g:5380:1: rule__VLSInclude__NamesAssignment_2_2_1 : ( ruleVLSName ) ;
    public final void rule__VLSInclude__NamesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5384:1: ( ( ruleVLSName ) )
            // InternalVampireLanguage.g:5385:2: ( ruleVLSName )
            {
            // InternalVampireLanguage.g:5385:2: ( ruleVLSName )
            // InternalVampireLanguage.g:5386:3: ruleVLSName
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
    // InternalVampireLanguage.g:5395:1: rule__VLSName__NameAssignment : ( ( rule__VLSName__NameAlternatives_0 ) ) ;
    public final void rule__VLSName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5399:1: ( ( ( rule__VLSName__NameAlternatives_0 ) ) )
            // InternalVampireLanguage.g:5400:2: ( ( rule__VLSName__NameAlternatives_0 ) )
            {
            // InternalVampireLanguage.g:5400:2: ( ( rule__VLSName__NameAlternatives_0 ) )
            // InternalVampireLanguage.g:5401:3: ( rule__VLSName__NameAlternatives_0 )
            {
             before(grammarAccess.getVLSNameAccess().getNameAlternatives_0()); 
            // InternalVampireLanguage.g:5402:3: ( rule__VLSName__NameAlternatives_0 )
            // InternalVampireLanguage.g:5402:4: rule__VLSName__NameAlternatives_0
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
    // InternalVampireLanguage.g:5410:1: rule__VLSComment__CommentAssignment_1 : ( RULE_SINGLE_COMMENT ) ;
    public final void rule__VLSComment__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5414:1: ( ( RULE_SINGLE_COMMENT ) )
            // InternalVampireLanguage.g:5415:2: ( RULE_SINGLE_COMMENT )
            {
            // InternalVampireLanguage.g:5415:2: ( RULE_SINGLE_COMMENT )
            // InternalVampireLanguage.g:5416:3: RULE_SINGLE_COMMENT
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
    // InternalVampireLanguage.g:5425:1: rule__VLSFofFormula__NameAssignment_2 : ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) ) ;
    public final void rule__VLSFofFormula__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5429:1: ( ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) ) )
            // InternalVampireLanguage.g:5430:2: ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) )
            {
            // InternalVampireLanguage.g:5430:2: ( ( rule__VLSFofFormula__NameAlternatives_2_0 ) )
            // InternalVampireLanguage.g:5431:3: ( rule__VLSFofFormula__NameAlternatives_2_0 )
            {
             before(grammarAccess.getVLSFofFormulaAccess().getNameAlternatives_2_0()); 
            // InternalVampireLanguage.g:5432:3: ( rule__VLSFofFormula__NameAlternatives_2_0 )
            // InternalVampireLanguage.g:5432:4: rule__VLSFofFormula__NameAlternatives_2_0
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
    // InternalVampireLanguage.g:5440:1: rule__VLSFofFormula__FofRoleAssignment_4 : ( ruleVLSRole ) ;
    public final void rule__VLSFofFormula__FofRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5444:1: ( ( ruleVLSRole ) )
            // InternalVampireLanguage.g:5445:2: ( ruleVLSRole )
            {
            // InternalVampireLanguage.g:5445:2: ( ruleVLSRole )
            // InternalVampireLanguage.g:5446:3: ruleVLSRole
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
    // InternalVampireLanguage.g:5455:1: rule__VLSFofFormula__FofFormulaAssignment_6 : ( ruleVLSTerm ) ;
    public final void rule__VLSFofFormula__FofFormulaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5459:1: ( ( ruleVLSTerm ) )
            // InternalVampireLanguage.g:5460:2: ( ruleVLSTerm )
            {
            // InternalVampireLanguage.g:5460:2: ( ruleVLSTerm )
            // InternalVampireLanguage.g:5461:3: ruleVLSTerm
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
    // InternalVampireLanguage.g:5470:1: rule__VLSFofFormula__AnnotationsAssignment_7_1 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSFofFormula__AnnotationsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5474:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:5475:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:5475:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:5476:3: ruleVLSAnnotation
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
    // InternalVampireLanguage.g:5485:1: rule__VLSTffFormula__NameAssignment_2 : ( ( rule__VLSTffFormula__NameAlternatives_2_0 ) ) ;
    public final void rule__VLSTffFormula__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5489:1: ( ( ( rule__VLSTffFormula__NameAlternatives_2_0 ) ) )
            // InternalVampireLanguage.g:5490:2: ( ( rule__VLSTffFormula__NameAlternatives_2_0 ) )
            {
            // InternalVampireLanguage.g:5490:2: ( ( rule__VLSTffFormula__NameAlternatives_2_0 ) )
            // InternalVampireLanguage.g:5491:3: ( rule__VLSTffFormula__NameAlternatives_2_0 )
            {
             before(grammarAccess.getVLSTffFormulaAccess().getNameAlternatives_2_0()); 
            // InternalVampireLanguage.g:5492:3: ( rule__VLSTffFormula__NameAlternatives_2_0 )
            // InternalVampireLanguage.g:5492:4: rule__VLSTffFormula__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__VLSTffFormula__NameAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getVLSTffFormulaAccess().getNameAlternatives_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__VLSTffFormula__FofRoleAssignment_4"
    // InternalVampireLanguage.g:5500:1: rule__VLSTffFormula__FofRoleAssignment_4 : ( ruleVLSRole ) ;
    public final void rule__VLSTffFormula__FofRoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5504:1: ( ( ruleVLSRole ) )
            // InternalVampireLanguage.g:5505:2: ( ruleVLSRole )
            {
            // InternalVampireLanguage.g:5505:2: ( ruleVLSRole )
            // InternalVampireLanguage.g:5506:3: ruleVLSRole
            {
             before(grammarAccess.getVLSTffFormulaAccess().getFofRoleVLSRoleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSRole();

            state._fsp--;

             after(grammarAccess.getVLSTffFormulaAccess().getFofRoleVLSRoleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VLSTffFormula__FofRoleAssignment_4"


    // $ANTLR start "rule__VLSTffFormula__FofFormulaAssignment_6"
    // InternalVampireLanguage.g:5515:1: rule__VLSTffFormula__FofFormulaAssignment_6 : ( ruleVLSTerm ) ;
    public final void rule__VLSTffFormula__FofFormulaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5519:1: ( ( ruleVLSTerm ) )
            // InternalVampireLanguage.g:5520:2: ( ruleVLSTerm )
            {
            // InternalVampireLanguage.g:5520:2: ( ruleVLSTerm )
            // InternalVampireLanguage.g:5521:3: ruleVLSTerm
            {
             before(grammarAccess.getVLSTffFormulaAccess().getFofFormulaVLSTermParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleVLSTerm();

            state._fsp--;

             after(grammarAccess.getVLSTffFormulaAccess().getFofFormulaVLSTermParserRuleCall_6_0()); 

            }


            }

        }
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
    // InternalVampireLanguage.g:5530:1: rule__VLSTffFormula__AnnotationsAssignment_7_1 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSTffFormula__AnnotationsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5534:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:5535:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:5535:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:5536:3: ruleVLSAnnotation
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
    // InternalVampireLanguage.g:5545:1: rule__VLSAnnotation__NameAssignment_1 : ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) ) ;
    public final void rule__VLSAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5549:1: ( ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) ) )
            // InternalVampireLanguage.g:5550:2: ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) )
            {
            // InternalVampireLanguage.g:5550:2: ( ( rule__VLSAnnotation__NameAlternatives_1_0 ) )
            // InternalVampireLanguage.g:5551:3: ( rule__VLSAnnotation__NameAlternatives_1_0 )
            {
             before(grammarAccess.getVLSAnnotationAccess().getNameAlternatives_1_0()); 
            // InternalVampireLanguage.g:5552:3: ( rule__VLSAnnotation__NameAlternatives_1_0 )
            // InternalVampireLanguage.g:5552:4: rule__VLSAnnotation__NameAlternatives_1_0
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
    // InternalVampireLanguage.g:5560:1: rule__VLSAnnotation__FollowupAssignment_2_1 : ( ruleVLSAnnotationTerms ) ;
    public final void rule__VLSAnnotation__FollowupAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5564:1: ( ( ruleVLSAnnotationTerms ) )
            // InternalVampireLanguage.g:5565:2: ( ruleVLSAnnotationTerms )
            {
            // InternalVampireLanguage.g:5565:2: ( ruleVLSAnnotationTerms )
            // InternalVampireLanguage.g:5566:3: ruleVLSAnnotationTerms
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
    // InternalVampireLanguage.g:5575:1: rule__VLSAnnotationTerms__TermsAssignment_0 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSAnnotationTerms__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5579:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:5580:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:5580:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:5581:3: ruleVLSAnnotation
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
    // InternalVampireLanguage.g:5590:1: rule__VLSAnnotationTerms__TermsAssignment_1_1 : ( ruleVLSAnnotation ) ;
    public final void rule__VLSAnnotationTerms__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5594:1: ( ( ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:5595:2: ( ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:5595:2: ( ruleVLSAnnotation )
            // InternalVampireLanguage.g:5596:3: ruleVLSAnnotation
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
    // InternalVampireLanguage.g:5605:1: rule__VLSBinary__RightAssignment_1_0_1 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5609:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:5610:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:5610:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:5611:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:5620:1: rule__VLSBinary__RightAssignment_1_1_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5624:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:5625:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:5625:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:5626:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:5635:1: rule__VLSBinary__RightAssignment_1_2_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSBinary__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5639:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:5640:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:5640:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:5641:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:5650:1: rule__VLSUniversalQuantifier__VariablesAssignment_1_2 : ( ruleVLSVariable ) ;
    public final void rule__VLSUniversalQuantifier__VariablesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5654:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:5655:2: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:5655:2: ( ruleVLSVariable )
            // InternalVampireLanguage.g:5656:3: ruleVLSVariable
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
    // InternalVampireLanguage.g:5665:1: rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1 : ( ruleVLSVariable ) ;
    public final void rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5669:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:5670:2: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:5670:2: ( ruleVLSVariable )
            // InternalVampireLanguage.g:5671:3: ruleVLSVariable
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
    // InternalVampireLanguage.g:5680:1: rule__VLSUniversalQuantifier__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSUniversalQuantifier__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5684:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:5685:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:5685:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:5686:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:5695:1: rule__VLSExistentialQuantifier__VariablesAssignment_1_2 : ( ruleVLSVariable ) ;
    public final void rule__VLSExistentialQuantifier__VariablesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5699:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:5700:2: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:5700:2: ( ruleVLSVariable )
            // InternalVampireLanguage.g:5701:3: ruleVLSVariable
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
    // InternalVampireLanguage.g:5710:1: rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1 : ( ruleVLSVariable ) ;
    public final void rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5714:1: ( ( ruleVLSVariable ) )
            // InternalVampireLanguage.g:5715:2: ( ruleVLSVariable )
            {
            // InternalVampireLanguage.g:5715:2: ( ruleVLSVariable )
            // InternalVampireLanguage.g:5716:3: ruleVLSVariable
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
    // InternalVampireLanguage.g:5725:1: rule__VLSExistentialQuantifier__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSExistentialQuantifier__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5729:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:5730:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:5730:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:5731:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:5740:1: rule__VLSUnaryNegation__OperandAssignment_2 : ( ruleVLSUnitaryFormula ) ;
    public final void rule__VLSUnaryNegation__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5744:1: ( ( ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:5745:2: ( ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:5745:2: ( ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:5746:3: ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:5755:1: rule__VLSUnaryInfix__RightAssignment_1_1 : ( ruleVLSAtomic ) ;
    public final void rule__VLSUnaryInfix__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5759:1: ( ( ruleVLSAtomic ) )
            // InternalVampireLanguage.g:5760:2: ( ruleVLSAtomic )
            {
            // InternalVampireLanguage.g:5760:2: ( ruleVLSAtomic )
            // InternalVampireLanguage.g:5761:3: ruleVLSAtomic
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
    // InternalVampireLanguage.g:5770:1: rule__VLSAtomicConstant__NameAssignment_0_1 : ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) ) ;
    public final void rule__VLSAtomicConstant__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5774:1: ( ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) ) )
            // InternalVampireLanguage.g:5775:2: ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) )
            {
            // InternalVampireLanguage.g:5775:2: ( ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 ) )
            // InternalVampireLanguage.g:5776:3: ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 )
            {
             before(grammarAccess.getVLSAtomicConstantAccess().getNameAlternatives_0_1_0()); 
            // InternalVampireLanguage.g:5777:3: ( rule__VLSAtomicConstant__NameAlternatives_0_1_0 )
            // InternalVampireLanguage.g:5777:4: rule__VLSAtomicConstant__NameAlternatives_0_1_0
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
    // InternalVampireLanguage.g:5785:1: rule__VLSAtomicFunction__ConstantAssignment_0_1 : ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) ) ;
    public final void rule__VLSAtomicFunction__ConstantAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5789:1: ( ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) ) )
            // InternalVampireLanguage.g:5790:2: ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) )
            {
            // InternalVampireLanguage.g:5790:2: ( ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 ) )
            // InternalVampireLanguage.g:5791:3: ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getConstantAlternatives_0_1_0()); 
            // InternalVampireLanguage.g:5792:3: ( rule__VLSAtomicFunction__ConstantAlternatives_0_1_0 )
            // InternalVampireLanguage.g:5792:4: rule__VLSAtomicFunction__ConstantAlternatives_0_1_0
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
    // InternalVampireLanguage.g:5800:1: rule__VLSAtomicFunction__TermsAssignment_0_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5804:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5805:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5805:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5806:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:5815:1: rule__VLSAtomicFunction__TermsAssignment_0_2_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_0_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5819:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5820:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5820:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5821:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:5830:1: rule__VLSAtomicFunction__NameAssignment_1_1 : ( ( '$less' ) ) ;
    public final void rule__VLSAtomicFunction__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5834:1: ( ( ( '$less' ) ) )
            // InternalVampireLanguage.g:5835:2: ( ( '$less' ) )
            {
            // InternalVampireLanguage.g:5835:2: ( ( '$less' ) )
            // InternalVampireLanguage.g:5836:3: ( '$less' )
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getNameLessKeyword_1_1_0()); 
            // InternalVampireLanguage.g:5837:3: ( '$less' )
            // InternalVampireLanguage.g:5838:4: '$less'
            {
             before(grammarAccess.getVLSAtomicFunctionAccess().getNameLessKeyword_1_1_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalVampireLanguage.g:5849:1: rule__VLSAtomicFunction__TermsAssignment_1_3 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5853:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5854:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5854:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5855:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:5864:1: rule__VLSAtomicFunction__TermsAssignment_1_5 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSAtomicFunction__TermsAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5868:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5869:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5869:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5870:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:5879:1: rule__VLSVariable__NameAssignment : ( RULE_UPPER_WORD_ID ) ;
    public final void rule__VLSVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5883:1: ( ( RULE_UPPER_WORD_ID ) )
            // InternalVampireLanguage.g:5884:2: ( RULE_UPPER_WORD_ID )
            {
            // InternalVampireLanguage.g:5884:2: ( RULE_UPPER_WORD_ID )
            // InternalVampireLanguage.g:5885:3: RULE_UPPER_WORD_ID
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
    // InternalVampireLanguage.g:5894:1: rule__VLSFunctionFof__FunctorAssignment_0 : ( ( rule__VLSFunctionFof__FunctorAlternatives_0_0 ) ) ;
    public final void rule__VLSFunctionFof__FunctorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5898:1: ( ( ( rule__VLSFunctionFof__FunctorAlternatives_0_0 ) ) )
            // InternalVampireLanguage.g:5899:2: ( ( rule__VLSFunctionFof__FunctorAlternatives_0_0 ) )
            {
            // InternalVampireLanguage.g:5899:2: ( ( rule__VLSFunctionFof__FunctorAlternatives_0_0 ) )
            // InternalVampireLanguage.g:5900:3: ( rule__VLSFunctionFof__FunctorAlternatives_0_0 )
            {
             before(grammarAccess.getVLSFunctionFofAccess().getFunctorAlternatives_0_0()); 
            // InternalVampireLanguage.g:5901:3: ( rule__VLSFunctionFof__FunctorAlternatives_0_0 )
            // InternalVampireLanguage.g:5901:4: rule__VLSFunctionFof__FunctorAlternatives_0_0
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
    // InternalVampireLanguage.g:5909:1: rule__VLSFunctionFof__TermsAssignment_1_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSFunctionFof__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5913:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5914:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5914:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5915:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:5924:1: rule__VLSFunctionFof__TermsAssignment_1_2_1 : ( ruleVLSFofTerm ) ;
    public final void rule__VLSFunctionFof__TermsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5928:1: ( ( ruleVLSFofTerm ) )
            // InternalVampireLanguage.g:5929:2: ( ruleVLSFofTerm )
            {
            // InternalVampireLanguage.g:5929:2: ( ruleVLSFofTerm )
            // InternalVampireLanguage.g:5930:3: ruleVLSFofTerm
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
    // InternalVampireLanguage.g:5939:1: rule__VLSDefinedTerm__ValueAssignment_0_1 : ( RULE_SIGNED_LITERAL ) ;
    public final void rule__VLSDefinedTerm__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5943:1: ( ( RULE_SIGNED_LITERAL ) )
            // InternalVampireLanguage.g:5944:2: ( RULE_SIGNED_LITERAL )
            {
            // InternalVampireLanguage.g:5944:2: ( RULE_SIGNED_LITERAL )
            // InternalVampireLanguage.g:5945:3: RULE_SIGNED_LITERAL
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
    // InternalVampireLanguage.g:5954:1: rule__VLSDefinedTerm__ValueAssignment_1_1 : ( RULE_SIGNED_REAL_ID ) ;
    public final void rule__VLSDefinedTerm__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5958:1: ( ( RULE_SIGNED_REAL_ID ) )
            // InternalVampireLanguage.g:5959:2: ( RULE_SIGNED_REAL_ID )
            {
            // InternalVampireLanguage.g:5959:2: ( RULE_SIGNED_REAL_ID )
            // InternalVampireLanguage.g:5960:3: RULE_SIGNED_REAL_ID
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
    // InternalVampireLanguage.g:5969:1: rule__VLSDefinedTerm__ValueAssignment_2_1 : ( RULE_SIGNED_RAT_ID ) ;
    public final void rule__VLSDefinedTerm__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5973:1: ( ( RULE_SIGNED_RAT_ID ) )
            // InternalVampireLanguage.g:5974:2: ( RULE_SIGNED_RAT_ID )
            {
            // InternalVampireLanguage.g:5974:2: ( RULE_SIGNED_RAT_ID )
            // InternalVampireLanguage.g:5975:3: RULE_SIGNED_RAT_ID
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
    // InternalVampireLanguage.g:5984:1: rule__VLSDefinedTerm__ValueAssignment_3_1 : ( RULE_DOUBLE_QUOTE ) ;
    public final void rule__VLSDefinedTerm__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVampireLanguage.g:5988:1: ( ( RULE_DOUBLE_QUOTE ) )
            // InternalVampireLanguage.g:5989:2: ( RULE_DOUBLE_QUOTE )
            {
            // InternalVampireLanguage.g:5989:2: ( RULE_DOUBLE_QUOTE )
            // InternalVampireLanguage.g:5990:3: RULE_DOUBLE_QUOTE
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


    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\uffff\23\24\4\uffff";
    static final String dfa_3s = "\1\4\23\55\4\uffff";
    static final String dfa_4s = "\1\107\23\104\4\uffff";
    static final String dfa_5s = "\24\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_6s = "\30\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\uffff\1\27\1\3\1\4\1\uffff\1\26\3\27\14\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\33\uffff\2\24\1\25",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\3\uffff\10\24\4\uffff\3\24",
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

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1081:1: rule__VLSAtomic__Alternatives : ( ( ruleVLSAtomicConstant ) | ( ruleVLSAtomicFunction ) | ( ruleVLSVariable ) | ( ruleVLSDefinedTerm ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0011C40000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000003FFF8000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x400203FFF8007BB0L,0x00000000000000E3L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0004200000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x002213FFF8000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x3FC0000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0FC0000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000003FFF8007BB0L,0x00000000000000E0L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000003FFF8000330L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000003FFF8000330L,0x0000000000000060L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000003FFF8000330L,0x0000000000000080L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000002000L});

}