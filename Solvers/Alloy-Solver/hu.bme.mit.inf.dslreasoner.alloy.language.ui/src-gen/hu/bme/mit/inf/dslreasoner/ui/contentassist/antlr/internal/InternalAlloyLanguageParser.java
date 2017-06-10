package hu.bme.mit.inf.dslreasoner.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import hu.bme.mit.inf.dslreasoner.services.AlloyLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAlloyLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'or'", "'<=>'", "'iff'", "'=>'", "'implies'", "'&&'", "'and'", "'!'", "'not'", "'all'", "'no'", "'some'", "'lone'", "'one'", "'set'", "'plus'", "'sub'", "'mul'", "'rem'", "'div'", "'enum'", "'{'", "'}'", "','", "'sig'", "'extends'", "'in'", "'+'", "':'", "'fun'", "'['", "']'", "'pred'", "'fact'", "'else'", "'='", "'!='", "'>'", "'>='", "'<'", "'<='", "'++'", "':>'", "'<:'", "'.'", "'-'", "'&'", "'->'", "'~'", "'^'", "'*'", "'#'", "'sum'", "'none'", "'iden'", "'univ'", "'Int'", "'('", "')'", "'run'", "'for'", "'abstract'", "'disj'", "'exactly'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


        public InternalAlloyLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAlloyLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAlloyLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAlloyLanguage.g"; }


     
     	private AlloyLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AlloyLanguageGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleALSDocument"
    // InternalAlloyLanguage.g:61:1: entryRuleALSDocument : ruleALSDocument EOF ;
    public final void entryRuleALSDocument() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:62:1: ( ruleALSDocument EOF )
            // InternalAlloyLanguage.g:63:1: ruleALSDocument EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDocumentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDocumentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSDocument"


    // $ANTLR start "ruleALSDocument"
    // InternalAlloyLanguage.g:70:1: ruleALSDocument : ( ( rule__ALSDocument__Group__0 ) ) ;
    public final void ruleALSDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:74:2: ( ( ( rule__ALSDocument__Group__0 ) ) )
            // InternalAlloyLanguage.g:75:1: ( ( rule__ALSDocument__Group__0 ) )
            {
            // InternalAlloyLanguage.g:75:1: ( ( rule__ALSDocument__Group__0 ) )
            // InternalAlloyLanguage.g:76:1: ( rule__ALSDocument__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDocumentAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:77:1: ( rule__ALSDocument__Group__0 )
            // InternalAlloyLanguage.g:77:2: rule__ALSDocument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSDocument__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDocumentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSDocument"


    // $ANTLR start "entryRuleALSID"
    // InternalAlloyLanguage.g:89:1: entryRuleALSID : ruleALSID EOF ;
    public final void entryRuleALSID() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:90:1: ( ruleALSID EOF )
            // InternalAlloyLanguage.g:91:1: ruleALSID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSID"


    // $ANTLR start "ruleALSID"
    // InternalAlloyLanguage.g:98:1: ruleALSID : ( RULE_ID ) ;
    public final void ruleALSID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:102:2: ( ( RULE_ID ) )
            // InternalAlloyLanguage.g:103:1: ( RULE_ID )
            {
            // InternalAlloyLanguage.g:103:1: ( RULE_ID )
            // InternalAlloyLanguage.g:104:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIDAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIDAccess().getIDTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSID"


    // $ANTLR start "entryRuleALSTypeDeclaration"
    // InternalAlloyLanguage.g:119:1: entryRuleALSTypeDeclaration : ruleALSTypeDeclaration EOF ;
    public final void entryRuleALSTypeDeclaration() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:120:1: ( ruleALSTypeDeclaration EOF )
            // InternalAlloyLanguage.g:121:1: ruleALSTypeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSTypeDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSTypeDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSTypeDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSTypeDeclaration"


    // $ANTLR start "ruleALSTypeDeclaration"
    // InternalAlloyLanguage.g:128:1: ruleALSTypeDeclaration : ( ( rule__ALSTypeDeclaration__Alternatives ) ) ;
    public final void ruleALSTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:132:2: ( ( ( rule__ALSTypeDeclaration__Alternatives ) ) )
            // InternalAlloyLanguage.g:133:1: ( ( rule__ALSTypeDeclaration__Alternatives ) )
            {
            // InternalAlloyLanguage.g:133:1: ( ( rule__ALSTypeDeclaration__Alternatives ) )
            // InternalAlloyLanguage.g:134:1: ( rule__ALSTypeDeclaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSTypeDeclarationAccess().getAlternatives()); 
            }
            // InternalAlloyLanguage.g:135:1: ( rule__ALSTypeDeclaration__Alternatives )
            // InternalAlloyLanguage.g:135:2: rule__ALSTypeDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ALSTypeDeclaration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSTypeDeclarationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSTypeDeclaration"


    // $ANTLR start "entryRuleALSEnumDeclaration"
    // InternalAlloyLanguage.g:147:1: entryRuleALSEnumDeclaration : ruleALSEnumDeclaration EOF ;
    public final void entryRuleALSEnumDeclaration() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:148:1: ( ruleALSEnumDeclaration EOF )
            // InternalAlloyLanguage.g:149:1: ruleALSEnumDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSEnumDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSEnumDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSEnumDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSEnumDeclaration"


    // $ANTLR start "ruleALSEnumDeclaration"
    // InternalAlloyLanguage.g:156:1: ruleALSEnumDeclaration : ( ( rule__ALSEnumDeclaration__Group__0 ) ) ;
    public final void ruleALSEnumDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:160:2: ( ( ( rule__ALSEnumDeclaration__Group__0 ) ) )
            // InternalAlloyLanguage.g:161:1: ( ( rule__ALSEnumDeclaration__Group__0 ) )
            {
            // InternalAlloyLanguage.g:161:1: ( ( rule__ALSEnumDeclaration__Group__0 ) )
            // InternalAlloyLanguage.g:162:1: ( rule__ALSEnumDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSEnumDeclarationAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:163:1: ( rule__ALSEnumDeclaration__Group__0 )
            // InternalAlloyLanguage.g:163:2: rule__ALSEnumDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSEnumDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSEnumDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSEnumDeclaration"


    // $ANTLR start "entryRuleALSEnumLiteral"
    // InternalAlloyLanguage.g:175:1: entryRuleALSEnumLiteral : ruleALSEnumLiteral EOF ;
    public final void entryRuleALSEnumLiteral() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:176:1: ( ruleALSEnumLiteral EOF )
            // InternalAlloyLanguage.g:177:1: ruleALSEnumLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSEnumLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSEnumLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSEnumLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSEnumLiteral"


    // $ANTLR start "ruleALSEnumLiteral"
    // InternalAlloyLanguage.g:184:1: ruleALSEnumLiteral : ( ( rule__ALSEnumLiteral__NameAssignment ) ) ;
    public final void ruleALSEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:188:2: ( ( ( rule__ALSEnumLiteral__NameAssignment ) ) )
            // InternalAlloyLanguage.g:189:1: ( ( rule__ALSEnumLiteral__NameAssignment ) )
            {
            // InternalAlloyLanguage.g:189:1: ( ( rule__ALSEnumLiteral__NameAssignment ) )
            // InternalAlloyLanguage.g:190:1: ( rule__ALSEnumLiteral__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSEnumLiteralAccess().getNameAssignment()); 
            }
            // InternalAlloyLanguage.g:191:1: ( rule__ALSEnumLiteral__NameAssignment )
            // InternalAlloyLanguage.g:191:2: rule__ALSEnumLiteral__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ALSEnumLiteral__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSEnumLiteralAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSEnumLiteral"


    // $ANTLR start "entryRuleALSSignatureDeclaration"
    // InternalAlloyLanguage.g:203:1: entryRuleALSSignatureDeclaration : ruleALSSignatureDeclaration EOF ;
    public final void entryRuleALSSignatureDeclaration() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:204:1: ( ruleALSSignatureDeclaration EOF )
            // InternalAlloyLanguage.g:205:1: ruleALSSignatureDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSSignatureDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSSignatureDeclaration"


    // $ANTLR start "ruleALSSignatureDeclaration"
    // InternalAlloyLanguage.g:212:1: ruleALSSignatureDeclaration : ( ( rule__ALSSignatureDeclaration__NameAssignment ) ) ;
    public final void ruleALSSignatureDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:216:2: ( ( ( rule__ALSSignatureDeclaration__NameAssignment ) ) )
            // InternalAlloyLanguage.g:217:1: ( ( rule__ALSSignatureDeclaration__NameAssignment ) )
            {
            // InternalAlloyLanguage.g:217:1: ( ( rule__ALSSignatureDeclaration__NameAssignment ) )
            // InternalAlloyLanguage.g:218:1: ( rule__ALSSignatureDeclaration__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureDeclarationAccess().getNameAssignment()); 
            }
            // InternalAlloyLanguage.g:219:1: ( rule__ALSSignatureDeclaration__NameAssignment )
            // InternalAlloyLanguage.g:219:2: rule__ALSSignatureDeclaration__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureDeclaration__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureDeclarationAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSSignatureDeclaration"


    // $ANTLR start "entryRuleALSSignatureBody"
    // InternalAlloyLanguage.g:231:1: entryRuleALSSignatureBody : ruleALSSignatureBody EOF ;
    public final void entryRuleALSSignatureBody() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:232:1: ( ruleALSSignatureBody EOF )
            // InternalAlloyLanguage.g:233:1: ruleALSSignatureBody EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSSignatureBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSSignatureBody"


    // $ANTLR start "ruleALSSignatureBody"
    // InternalAlloyLanguage.g:240:1: ruleALSSignatureBody : ( ( rule__ALSSignatureBody__Group__0 ) ) ;
    public final void ruleALSSignatureBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:244:2: ( ( ( rule__ALSSignatureBody__Group__0 ) ) )
            // InternalAlloyLanguage.g:245:1: ( ( rule__ALSSignatureBody__Group__0 ) )
            {
            // InternalAlloyLanguage.g:245:1: ( ( rule__ALSSignatureBody__Group__0 ) )
            // InternalAlloyLanguage.g:246:1: ( rule__ALSSignatureBody__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:247:1: ( rule__ALSSignatureBody__Group__0 )
            // InternalAlloyLanguage.g:247:2: rule__ALSSignatureBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSSignatureBody"


    // $ANTLR start "entryRuleALSFieldDeclaration"
    // InternalAlloyLanguage.g:259:1: entryRuleALSFieldDeclaration : ruleALSFieldDeclaration EOF ;
    public final void entryRuleALSFieldDeclaration() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:260:1: ( ruleALSFieldDeclaration EOF )
            // InternalAlloyLanguage.g:261:1: ruleALSFieldDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFieldDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSFieldDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFieldDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSFieldDeclaration"


    // $ANTLR start "ruleALSFieldDeclaration"
    // InternalAlloyLanguage.g:268:1: ruleALSFieldDeclaration : ( ( rule__ALSFieldDeclaration__Group__0 ) ) ;
    public final void ruleALSFieldDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:272:2: ( ( ( rule__ALSFieldDeclaration__Group__0 ) ) )
            // InternalAlloyLanguage.g:273:1: ( ( rule__ALSFieldDeclaration__Group__0 ) )
            {
            // InternalAlloyLanguage.g:273:1: ( ( rule__ALSFieldDeclaration__Group__0 ) )
            // InternalAlloyLanguage.g:274:1: ( rule__ALSFieldDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFieldDeclarationAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:275:1: ( rule__ALSFieldDeclaration__Group__0 )
            // InternalAlloyLanguage.g:275:2: rule__ALSFieldDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSFieldDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFieldDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSFieldDeclaration"


    // $ANTLR start "entryRuleALSFunctionDefinition"
    // InternalAlloyLanguage.g:289:1: entryRuleALSFunctionDefinition : ruleALSFunctionDefinition EOF ;
    public final void entryRuleALSFunctionDefinition() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:290:1: ( ruleALSFunctionDefinition EOF )
            // InternalAlloyLanguage.g:291:1: ruleALSFunctionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSFunctionDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSFunctionDefinition"


    // $ANTLR start "ruleALSFunctionDefinition"
    // InternalAlloyLanguage.g:298:1: ruleALSFunctionDefinition : ( ( rule__ALSFunctionDefinition__Group__0 ) ) ;
    public final void ruleALSFunctionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:302:2: ( ( ( rule__ALSFunctionDefinition__Group__0 ) ) )
            // InternalAlloyLanguage.g:303:1: ( ( rule__ALSFunctionDefinition__Group__0 ) )
            {
            // InternalAlloyLanguage.g:303:1: ( ( rule__ALSFunctionDefinition__Group__0 ) )
            // InternalAlloyLanguage.g:304:1: ( rule__ALSFunctionDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:305:1: ( rule__ALSFunctionDefinition__Group__0 )
            // InternalAlloyLanguage.g:305:2: rule__ALSFunctionDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSFunctionDefinition"


    // $ANTLR start "entryRuleALSRelationDefinition"
    // InternalAlloyLanguage.g:317:1: entryRuleALSRelationDefinition : ruleALSRelationDefinition EOF ;
    public final void entryRuleALSRelationDefinition() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:318:1: ( ruleALSRelationDefinition EOF )
            // InternalAlloyLanguage.g:319:1: ruleALSRelationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRelationDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSRelationDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRelationDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSRelationDefinition"


    // $ANTLR start "ruleALSRelationDefinition"
    // InternalAlloyLanguage.g:326:1: ruleALSRelationDefinition : ( ( rule__ALSRelationDefinition__Group__0 ) ) ;
    public final void ruleALSRelationDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:330:2: ( ( ( rule__ALSRelationDefinition__Group__0 ) ) )
            // InternalAlloyLanguage.g:331:1: ( ( rule__ALSRelationDefinition__Group__0 ) )
            {
            // InternalAlloyLanguage.g:331:1: ( ( rule__ALSRelationDefinition__Group__0 ) )
            // InternalAlloyLanguage.g:332:1: ( rule__ALSRelationDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRelationDefinitionAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:333:1: ( rule__ALSRelationDefinition__Group__0 )
            // InternalAlloyLanguage.g:333:2: rule__ALSRelationDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSRelationDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRelationDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSRelationDefinition"


    // $ANTLR start "entryRuleALSFactDeclaration"
    // InternalAlloyLanguage.g:345:1: entryRuleALSFactDeclaration : ruleALSFactDeclaration EOF ;
    public final void entryRuleALSFactDeclaration() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:346:1: ( ruleALSFactDeclaration EOF )
            // InternalAlloyLanguage.g:347:1: ruleALSFactDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFactDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSFactDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFactDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSFactDeclaration"


    // $ANTLR start "ruleALSFactDeclaration"
    // InternalAlloyLanguage.g:354:1: ruleALSFactDeclaration : ( ( rule__ALSFactDeclaration__Group__0 ) ) ;
    public final void ruleALSFactDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:358:2: ( ( ( rule__ALSFactDeclaration__Group__0 ) ) )
            // InternalAlloyLanguage.g:359:1: ( ( rule__ALSFactDeclaration__Group__0 ) )
            {
            // InternalAlloyLanguage.g:359:1: ( ( rule__ALSFactDeclaration__Group__0 ) )
            // InternalAlloyLanguage.g:360:1: ( rule__ALSFactDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFactDeclarationAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:361:1: ( rule__ALSFactDeclaration__Group__0 )
            // InternalAlloyLanguage.g:361:2: rule__ALSFactDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSFactDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFactDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSFactDeclaration"


    // $ANTLR start "entryRuleALSTerm"
    // InternalAlloyLanguage.g:373:1: entryRuleALSTerm : ruleALSTerm EOF ;
    public final void entryRuleALSTerm() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:374:1: ( ruleALSTerm EOF )
            // InternalAlloyLanguage.g:375:1: ruleALSTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSTerm"


    // $ANTLR start "ruleALSTerm"
    // InternalAlloyLanguage.g:382:1: ruleALSTerm : ( ruleALSQuantified ) ;
    public final void ruleALSTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:386:2: ( ( ruleALSQuantified ) )
            // InternalAlloyLanguage.g:387:1: ( ruleALSQuantified )
            {
            // InternalAlloyLanguage.g:387:1: ( ruleALSQuantified )
            // InternalAlloyLanguage.g:388:1: ruleALSQuantified
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSTermAccess().getALSQuantifiedParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSQuantified();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSTermAccess().getALSQuantifiedParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSTerm"


    // $ANTLR start "entryRuleALSQuantified"
    // InternalAlloyLanguage.g:401:1: entryRuleALSQuantified : ruleALSQuantified EOF ;
    public final void entryRuleALSQuantified() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:402:1: ( ruleALSQuantified EOF )
            // InternalAlloyLanguage.g:403:1: ruleALSQuantified EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSQuantified();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSQuantified"


    // $ANTLR start "ruleALSQuantified"
    // InternalAlloyLanguage.g:410:1: ruleALSQuantified : ( ( rule__ALSQuantified__Alternatives ) ) ;
    public final void ruleALSQuantified() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:414:2: ( ( ( rule__ALSQuantified__Alternatives ) ) )
            // InternalAlloyLanguage.g:415:1: ( ( rule__ALSQuantified__Alternatives ) )
            {
            // InternalAlloyLanguage.g:415:1: ( ( rule__ALSQuantified__Alternatives ) )
            // InternalAlloyLanguage.g:416:1: ( rule__ALSQuantified__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedAccess().getAlternatives()); 
            }
            // InternalAlloyLanguage.g:417:1: ( rule__ALSQuantified__Alternatives )
            // InternalAlloyLanguage.g:417:2: rule__ALSQuantified__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ALSQuantified__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSQuantified"


    // $ANTLR start "entryRuleALSOr"
    // InternalAlloyLanguage.g:429:1: entryRuleALSOr : ruleALSOr EOF ;
    public final void entryRuleALSOr() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:430:1: ( ruleALSOr EOF )
            // InternalAlloyLanguage.g:431:1: ruleALSOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSOrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSOrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSOr"


    // $ANTLR start "ruleALSOr"
    // InternalAlloyLanguage.g:438:1: ruleALSOr : ( ( rule__ALSOr__Group__0 ) ) ;
    public final void ruleALSOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:442:2: ( ( ( rule__ALSOr__Group__0 ) ) )
            // InternalAlloyLanguage.g:443:1: ( ( rule__ALSOr__Group__0 ) )
            {
            // InternalAlloyLanguage.g:443:1: ( ( rule__ALSOr__Group__0 ) )
            // InternalAlloyLanguage.g:444:1: ( rule__ALSOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSOrAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:445:1: ( rule__ALSOr__Group__0 )
            // InternalAlloyLanguage.g:445:2: rule__ALSOr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSOr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSOrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSOr"


    // $ANTLR start "entryRuleALSIff"
    // InternalAlloyLanguage.g:457:1: entryRuleALSIff : ruleALSIff EOF ;
    public final void entryRuleALSIff() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:458:1: ( ruleALSIff EOF )
            // InternalAlloyLanguage.g:459:1: ruleALSIff EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIffRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSIff();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIffRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSIff"


    // $ANTLR start "ruleALSIff"
    // InternalAlloyLanguage.g:466:1: ruleALSIff : ( ( rule__ALSIff__Group__0 ) ) ;
    public final void ruleALSIff() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:470:2: ( ( ( rule__ALSIff__Group__0 ) ) )
            // InternalAlloyLanguage.g:471:1: ( ( rule__ALSIff__Group__0 ) )
            {
            // InternalAlloyLanguage.g:471:1: ( ( rule__ALSIff__Group__0 ) )
            // InternalAlloyLanguage.g:472:1: ( rule__ALSIff__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIffAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:473:1: ( rule__ALSIff__Group__0 )
            // InternalAlloyLanguage.g:473:2: rule__ALSIff__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSIff__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIffAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSIff"


    // $ANTLR start "entryRuleALSImpl"
    // InternalAlloyLanguage.g:485:1: entryRuleALSImpl : ruleALSImpl EOF ;
    public final void entryRuleALSImpl() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:486:1: ( ruleALSImpl EOF )
            // InternalAlloyLanguage.g:487:1: ruleALSImpl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSImplRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSImpl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSImplRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSImpl"


    // $ANTLR start "ruleALSImpl"
    // InternalAlloyLanguage.g:494:1: ruleALSImpl : ( ( rule__ALSImpl__Group__0 ) ) ;
    public final void ruleALSImpl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:498:2: ( ( ( rule__ALSImpl__Group__0 ) ) )
            // InternalAlloyLanguage.g:499:1: ( ( rule__ALSImpl__Group__0 ) )
            {
            // InternalAlloyLanguage.g:499:1: ( ( rule__ALSImpl__Group__0 ) )
            // InternalAlloyLanguage.g:500:1: ( rule__ALSImpl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSImplAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:501:1: ( rule__ALSImpl__Group__0 )
            // InternalAlloyLanguage.g:501:2: rule__ALSImpl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSImpl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSImplAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSImpl"


    // $ANTLR start "entryRuleALSAnd"
    // InternalAlloyLanguage.g:513:1: entryRuleALSAnd : ruleALSAnd EOF ;
    public final void entryRuleALSAnd() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:514:1: ( ruleALSAnd EOF )
            // InternalAlloyLanguage.g:515:1: ruleALSAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSAndRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSAndRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSAnd"


    // $ANTLR start "ruleALSAnd"
    // InternalAlloyLanguage.g:522:1: ruleALSAnd : ( ( rule__ALSAnd__Group__0 ) ) ;
    public final void ruleALSAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:526:2: ( ( ( rule__ALSAnd__Group__0 ) ) )
            // InternalAlloyLanguage.g:527:1: ( ( rule__ALSAnd__Group__0 ) )
            {
            // InternalAlloyLanguage.g:527:1: ( ( rule__ALSAnd__Group__0 ) )
            // InternalAlloyLanguage.g:528:1: ( rule__ALSAnd__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSAndAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:529:1: ( rule__ALSAnd__Group__0 )
            // InternalAlloyLanguage.g:529:2: rule__ALSAnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSAnd__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSAndAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSAnd"


    // $ANTLR start "entryRuleALSComparison"
    // InternalAlloyLanguage.g:541:1: entryRuleALSComparison : ruleALSComparison EOF ;
    public final void entryRuleALSComparison() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:542:1: ( ruleALSComparison EOF )
            // InternalAlloyLanguage.g:543:1: ruleALSComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSComparison"


    // $ANTLR start "ruleALSComparison"
    // InternalAlloyLanguage.g:550:1: ruleALSComparison : ( ( rule__ALSComparison__Group__0 ) ) ;
    public final void ruleALSComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:554:2: ( ( ( rule__ALSComparison__Group__0 ) ) )
            // InternalAlloyLanguage.g:555:1: ( ( rule__ALSComparison__Group__0 ) )
            {
            // InternalAlloyLanguage.g:555:1: ( ( rule__ALSComparison__Group__0 ) )
            // InternalAlloyLanguage.g:556:1: ( rule__ALSComparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:557:1: ( rule__ALSComparison__Group__0 )
            // InternalAlloyLanguage.g:557:2: rule__ALSComparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSComparison"


    // $ANTLR start "entryRuleALSOverride"
    // InternalAlloyLanguage.g:569:1: entryRuleALSOverride : ruleALSOverride EOF ;
    public final void entryRuleALSOverride() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:570:1: ( ruleALSOverride EOF )
            // InternalAlloyLanguage.g:571:1: ruleALSOverride EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSOverrideRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSOverride();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSOverrideRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSOverride"


    // $ANTLR start "ruleALSOverride"
    // InternalAlloyLanguage.g:578:1: ruleALSOverride : ( ( rule__ALSOverride__Group__0 ) ) ;
    public final void ruleALSOverride() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:582:2: ( ( ( rule__ALSOverride__Group__0 ) ) )
            // InternalAlloyLanguage.g:583:1: ( ( rule__ALSOverride__Group__0 ) )
            {
            // InternalAlloyLanguage.g:583:1: ( ( rule__ALSOverride__Group__0 ) )
            // InternalAlloyLanguage.g:584:1: ( rule__ALSOverride__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSOverrideAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:585:1: ( rule__ALSOverride__Group__0 )
            // InternalAlloyLanguage.g:585:2: rule__ALSOverride__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSOverride__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSOverrideAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSOverride"


    // $ANTLR start "entryRuleALSRangeRestrictionRight"
    // InternalAlloyLanguage.g:597:1: entryRuleALSRangeRestrictionRight : ruleALSRangeRestrictionRight EOF ;
    public final void entryRuleALSRangeRestrictionRight() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:598:1: ( ruleALSRangeRestrictionRight EOF )
            // InternalAlloyLanguage.g:599:1: ruleALSRangeRestrictionRight EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRangeRestrictionRightRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSRangeRestrictionRight();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRangeRestrictionRightRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSRangeRestrictionRight"


    // $ANTLR start "ruleALSRangeRestrictionRight"
    // InternalAlloyLanguage.g:606:1: ruleALSRangeRestrictionRight : ( ( rule__ALSRangeRestrictionRight__Group__0 ) ) ;
    public final void ruleALSRangeRestrictionRight() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:610:2: ( ( ( rule__ALSRangeRestrictionRight__Group__0 ) ) )
            // InternalAlloyLanguage.g:611:1: ( ( rule__ALSRangeRestrictionRight__Group__0 ) )
            {
            // InternalAlloyLanguage.g:611:1: ( ( rule__ALSRangeRestrictionRight__Group__0 ) )
            // InternalAlloyLanguage.g:612:1: ( rule__ALSRangeRestrictionRight__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRangeRestrictionRightAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:613:1: ( rule__ALSRangeRestrictionRight__Group__0 )
            // InternalAlloyLanguage.g:613:2: rule__ALSRangeRestrictionRight__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSRangeRestrictionRight__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRangeRestrictionRightAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSRangeRestrictionRight"


    // $ANTLR start "entryRuleALSRangeRestrictionLeft"
    // InternalAlloyLanguage.g:625:1: entryRuleALSRangeRestrictionLeft : ruleALSRangeRestrictionLeft EOF ;
    public final void entryRuleALSRangeRestrictionLeft() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:626:1: ( ruleALSRangeRestrictionLeft EOF )
            // InternalAlloyLanguage.g:627:1: ruleALSRangeRestrictionLeft EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRangeRestrictionLeftRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSRangeRestrictionLeft();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRangeRestrictionLeftRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSRangeRestrictionLeft"


    // $ANTLR start "ruleALSRangeRestrictionLeft"
    // InternalAlloyLanguage.g:634:1: ruleALSRangeRestrictionLeft : ( ( rule__ALSRangeRestrictionLeft__Group__0 ) ) ;
    public final void ruleALSRangeRestrictionLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:638:2: ( ( ( rule__ALSRangeRestrictionLeft__Group__0 ) ) )
            // InternalAlloyLanguage.g:639:1: ( ( rule__ALSRangeRestrictionLeft__Group__0 ) )
            {
            // InternalAlloyLanguage.g:639:1: ( ( rule__ALSRangeRestrictionLeft__Group__0 ) )
            // InternalAlloyLanguage.g:640:1: ( rule__ALSRangeRestrictionLeft__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRangeRestrictionLeftAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:641:1: ( rule__ALSRangeRestrictionLeft__Group__0 )
            // InternalAlloyLanguage.g:641:2: rule__ALSRangeRestrictionLeft__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSRangeRestrictionLeft__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRangeRestrictionLeftAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSRangeRestrictionLeft"


    // $ANTLR start "entryRuleALSJoin"
    // InternalAlloyLanguage.g:653:1: entryRuleALSJoin : ruleALSJoin EOF ;
    public final void entryRuleALSJoin() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:654:1: ( ruleALSJoin EOF )
            // InternalAlloyLanguage.g:655:1: ruleALSJoin EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSJoinRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSJoin();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSJoinRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSJoin"


    // $ANTLR start "ruleALSJoin"
    // InternalAlloyLanguage.g:662:1: ruleALSJoin : ( ( rule__ALSJoin__Group__0 ) ) ;
    public final void ruleALSJoin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:666:2: ( ( ( rule__ALSJoin__Group__0 ) ) )
            // InternalAlloyLanguage.g:667:1: ( ( rule__ALSJoin__Group__0 ) )
            {
            // InternalAlloyLanguage.g:667:1: ( ( rule__ALSJoin__Group__0 ) )
            // InternalAlloyLanguage.g:668:1: ( rule__ALSJoin__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSJoinAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:669:1: ( rule__ALSJoin__Group__0 )
            // InternalAlloyLanguage.g:669:2: rule__ALSJoin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSJoin__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSJoinAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSJoin"


    // $ANTLR start "entryRuleALSMinus"
    // InternalAlloyLanguage.g:681:1: entryRuleALSMinus : ruleALSMinus EOF ;
    public final void entryRuleALSMinus() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:682:1: ( ruleALSMinus EOF )
            // InternalAlloyLanguage.g:683:1: ruleALSMinus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSMinusRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSMinus"


    // $ANTLR start "ruleALSMinus"
    // InternalAlloyLanguage.g:690:1: ruleALSMinus : ( ( rule__ALSMinus__Group__0 ) ) ;
    public final void ruleALSMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:694:2: ( ( ( rule__ALSMinus__Group__0 ) ) )
            // InternalAlloyLanguage.g:695:1: ( ( rule__ALSMinus__Group__0 ) )
            {
            // InternalAlloyLanguage.g:695:1: ( ( rule__ALSMinus__Group__0 ) )
            // InternalAlloyLanguage.g:696:1: ( rule__ALSMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSMinusAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:697:1: ( rule__ALSMinus__Group__0 )
            // InternalAlloyLanguage.g:697:2: rule__ALSMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSMinus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSMinusAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSMinus"


    // $ANTLR start "entryRuleALSPlus"
    // InternalAlloyLanguage.g:709:1: entryRuleALSPlus : ruleALSPlus EOF ;
    public final void entryRuleALSPlus() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:710:1: ( ruleALSPlus EOF )
            // InternalAlloyLanguage.g:711:1: ruleALSPlus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPlusRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSPlus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPlusRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSPlus"


    // $ANTLR start "ruleALSPlus"
    // InternalAlloyLanguage.g:718:1: ruleALSPlus : ( ( rule__ALSPlus__Group__0 ) ) ;
    public final void ruleALSPlus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:722:2: ( ( ( rule__ALSPlus__Group__0 ) ) )
            // InternalAlloyLanguage.g:723:1: ( ( rule__ALSPlus__Group__0 ) )
            {
            // InternalAlloyLanguage.g:723:1: ( ( rule__ALSPlus__Group__0 ) )
            // InternalAlloyLanguage.g:724:1: ( rule__ALSPlus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPlusAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:725:1: ( rule__ALSPlus__Group__0 )
            // InternalAlloyLanguage.g:725:2: rule__ALSPlus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSPlus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPlusAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSPlus"


    // $ANTLR start "entryRuleALSIntersection"
    // InternalAlloyLanguage.g:737:1: entryRuleALSIntersection : ruleALSIntersection EOF ;
    public final void entryRuleALSIntersection() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:738:1: ( ruleALSIntersection EOF )
            // InternalAlloyLanguage.g:739:1: ruleALSIntersection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIntersectionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSIntersection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIntersectionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSIntersection"


    // $ANTLR start "ruleALSIntersection"
    // InternalAlloyLanguage.g:746:1: ruleALSIntersection : ( ( rule__ALSIntersection__Group__0 ) ) ;
    public final void ruleALSIntersection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:750:2: ( ( ( rule__ALSIntersection__Group__0 ) ) )
            // InternalAlloyLanguage.g:751:1: ( ( rule__ALSIntersection__Group__0 ) )
            {
            // InternalAlloyLanguage.g:751:1: ( ( rule__ALSIntersection__Group__0 ) )
            // InternalAlloyLanguage.g:752:1: ( rule__ALSIntersection__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIntersectionAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:753:1: ( rule__ALSIntersection__Group__0 )
            // InternalAlloyLanguage.g:753:2: rule__ALSIntersection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSIntersection__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIntersectionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSIntersection"


    // $ANTLR start "entryRuleALSDirectProduct"
    // InternalAlloyLanguage.g:765:1: entryRuleALSDirectProduct : ruleALSDirectProduct EOF ;
    public final void entryRuleALSDirectProduct() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:766:1: ( ruleALSDirectProduct EOF )
            // InternalAlloyLanguage.g:767:1: ruleALSDirectProduct EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDirectProductRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSDirectProduct();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDirectProductRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSDirectProduct"


    // $ANTLR start "ruleALSDirectProduct"
    // InternalAlloyLanguage.g:774:1: ruleALSDirectProduct : ( ( rule__ALSDirectProduct__Group__0 ) ) ;
    public final void ruleALSDirectProduct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:778:2: ( ( ( rule__ALSDirectProduct__Group__0 ) ) )
            // InternalAlloyLanguage.g:779:1: ( ( rule__ALSDirectProduct__Group__0 ) )
            {
            // InternalAlloyLanguage.g:779:1: ( ( rule__ALSDirectProduct__Group__0 ) )
            // InternalAlloyLanguage.g:780:1: ( rule__ALSDirectProduct__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDirectProductAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:781:1: ( rule__ALSDirectProduct__Group__0 )
            // InternalAlloyLanguage.g:781:2: rule__ALSDirectProduct__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSDirectProduct__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDirectProductAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSDirectProduct"


    // $ANTLR start "entryRuleALSPreficed"
    // InternalAlloyLanguage.g:793:1: entryRuleALSPreficed : ruleALSPreficed EOF ;
    public final void entryRuleALSPreficed() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:794:1: ( ruleALSPreficed EOF )
            // InternalAlloyLanguage.g:795:1: ruleALSPreficed EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSPreficed();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSPreficed"


    // $ANTLR start "ruleALSPreficed"
    // InternalAlloyLanguage.g:802:1: ruleALSPreficed : ( ( rule__ALSPreficed__Alternatives ) ) ;
    public final void ruleALSPreficed() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:806:2: ( ( ( rule__ALSPreficed__Alternatives ) ) )
            // InternalAlloyLanguage.g:807:1: ( ( rule__ALSPreficed__Alternatives ) )
            {
            // InternalAlloyLanguage.g:807:1: ( ( rule__ALSPreficed__Alternatives ) )
            // InternalAlloyLanguage.g:808:1: ( rule__ALSPreficed__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getAlternatives()); 
            }
            // InternalAlloyLanguage.g:809:1: ( rule__ALSPreficed__Alternatives )
            // InternalAlloyLanguage.g:809:2: rule__ALSPreficed__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSPreficed"


    // $ANTLR start "entryRuleALSVariableDeclaration"
    // InternalAlloyLanguage.g:821:1: entryRuleALSVariableDeclaration : ruleALSVariableDeclaration EOF ;
    public final void entryRuleALSVariableDeclaration() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:822:1: ( ruleALSVariableDeclaration EOF )
            // InternalAlloyLanguage.g:823:1: ruleALSVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSVariableDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSVariableDeclaration"


    // $ANTLR start "ruleALSVariableDeclaration"
    // InternalAlloyLanguage.g:830:1: ruleALSVariableDeclaration : ( ( rule__ALSVariableDeclaration__Group__0 ) ) ;
    public final void ruleALSVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:834:2: ( ( ( rule__ALSVariableDeclaration__Group__0 ) ) )
            // InternalAlloyLanguage.g:835:1: ( ( rule__ALSVariableDeclaration__Group__0 ) )
            {
            // InternalAlloyLanguage.g:835:1: ( ( rule__ALSVariableDeclaration__Group__0 ) )
            // InternalAlloyLanguage.g:836:1: ( rule__ALSVariableDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSVariableDeclarationAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:837:1: ( rule__ALSVariableDeclaration__Group__0 )
            // InternalAlloyLanguage.g:837:2: rule__ALSVariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSVariableDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSVariableDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSVariableDeclaration"


    // $ANTLR start "entryRuleALSBasicRelationTerm"
    // InternalAlloyLanguage.g:849:1: entryRuleALSBasicRelationTerm : ruleALSBasicRelationTerm EOF ;
    public final void entryRuleALSBasicRelationTerm() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:850:1: ( ruleALSBasicRelationTerm EOF )
            // InternalAlloyLanguage.g:851:1: ruleALSBasicRelationTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSBasicRelationTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSBasicRelationTerm"


    // $ANTLR start "ruleALSBasicRelationTerm"
    // InternalAlloyLanguage.g:858:1: ruleALSBasicRelationTerm : ( ( rule__ALSBasicRelationTerm__Alternatives ) ) ;
    public final void ruleALSBasicRelationTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:862:2: ( ( ( rule__ALSBasicRelationTerm__Alternatives ) ) )
            // InternalAlloyLanguage.g:863:1: ( ( rule__ALSBasicRelationTerm__Alternatives ) )
            {
            // InternalAlloyLanguage.g:863:1: ( ( rule__ALSBasicRelationTerm__Alternatives ) )
            // InternalAlloyLanguage.g:864:1: ( rule__ALSBasicRelationTerm__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getAlternatives()); 
            }
            // InternalAlloyLanguage.g:865:1: ( rule__ALSBasicRelationTerm__Alternatives )
            // InternalAlloyLanguage.g:865:2: rule__ALSBasicRelationTerm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSBasicRelationTerm"


    // $ANTLR start "entryRuleALSRunCommand"
    // InternalAlloyLanguage.g:877:1: entryRuleALSRunCommand : ruleALSRunCommand EOF ;
    public final void entryRuleALSRunCommand() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:878:1: ( ruleALSRunCommand EOF )
            // InternalAlloyLanguage.g:879:1: ruleALSRunCommand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRunCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSRunCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRunCommandRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSRunCommand"


    // $ANTLR start "ruleALSRunCommand"
    // InternalAlloyLanguage.g:886:1: ruleALSRunCommand : ( ( rule__ALSRunCommand__Group__0 ) ) ;
    public final void ruleALSRunCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:890:2: ( ( ( rule__ALSRunCommand__Group__0 ) ) )
            // InternalAlloyLanguage.g:891:1: ( ( rule__ALSRunCommand__Group__0 ) )
            {
            // InternalAlloyLanguage.g:891:1: ( ( rule__ALSRunCommand__Group__0 ) )
            // InternalAlloyLanguage.g:892:1: ( rule__ALSRunCommand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRunCommandAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:893:1: ( rule__ALSRunCommand__Group__0 )
            // InternalAlloyLanguage.g:893:2: rule__ALSRunCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSRunCommand__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRunCommandAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSRunCommand"


    // $ANTLR start "entryRuleALSTypeScope"
    // InternalAlloyLanguage.g:905:1: entryRuleALSTypeScope : ruleALSTypeScope EOF ;
    public final void entryRuleALSTypeScope() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:906:1: ( ruleALSTypeScope EOF )
            // InternalAlloyLanguage.g:907:1: ruleALSTypeScope EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSTypeScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSTypeScope();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSTypeScopeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSTypeScope"


    // $ANTLR start "ruleALSTypeScope"
    // InternalAlloyLanguage.g:914:1: ruleALSTypeScope : ( ( rule__ALSTypeScope__Alternatives ) ) ;
    public final void ruleALSTypeScope() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:918:2: ( ( ( rule__ALSTypeScope__Alternatives ) ) )
            // InternalAlloyLanguage.g:919:1: ( ( rule__ALSTypeScope__Alternatives ) )
            {
            // InternalAlloyLanguage.g:919:1: ( ( rule__ALSTypeScope__Alternatives ) )
            // InternalAlloyLanguage.g:920:1: ( rule__ALSTypeScope__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSTypeScopeAccess().getAlternatives()); 
            }
            // InternalAlloyLanguage.g:921:1: ( rule__ALSTypeScope__Alternatives )
            // InternalAlloyLanguage.g:921:2: rule__ALSTypeScope__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ALSTypeScope__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSTypeScopeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSTypeScope"


    // $ANTLR start "entryRuleALSSigScope"
    // InternalAlloyLanguage.g:933:1: entryRuleALSSigScope : ruleALSSigScope EOF ;
    public final void entryRuleALSSigScope() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:934:1: ( ruleALSSigScope EOF )
            // InternalAlloyLanguage.g:935:1: ruleALSSigScope EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSigScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSSigScope();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSigScopeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSSigScope"


    // $ANTLR start "ruleALSSigScope"
    // InternalAlloyLanguage.g:942:1: ruleALSSigScope : ( ( rule__ALSSigScope__Group__0 ) ) ;
    public final void ruleALSSigScope() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:946:2: ( ( ( rule__ALSSigScope__Group__0 ) ) )
            // InternalAlloyLanguage.g:947:1: ( ( rule__ALSSigScope__Group__0 ) )
            {
            // InternalAlloyLanguage.g:947:1: ( ( rule__ALSSigScope__Group__0 ) )
            // InternalAlloyLanguage.g:948:1: ( rule__ALSSigScope__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSigScopeAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:949:1: ( rule__ALSSigScope__Group__0 )
            // InternalAlloyLanguage.g:949:2: rule__ALSSigScope__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSSigScope__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSigScopeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSSigScope"


    // $ANTLR start "entryRuleALSIntScope"
    // InternalAlloyLanguage.g:961:1: entryRuleALSIntScope : ruleALSIntScope EOF ;
    public final void entryRuleALSIntScope() throws RecognitionException {
        try {
            // InternalAlloyLanguage.g:962:1: ( ruleALSIntScope EOF )
            // InternalAlloyLanguage.g:963:1: ruleALSIntScope EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIntScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleALSIntScope();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIntScopeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALSIntScope"


    // $ANTLR start "ruleALSIntScope"
    // InternalAlloyLanguage.g:970:1: ruleALSIntScope : ( ( rule__ALSIntScope__Group__0 ) ) ;
    public final void ruleALSIntScope() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:974:2: ( ( ( rule__ALSIntScope__Group__0 ) ) )
            // InternalAlloyLanguage.g:975:1: ( ( rule__ALSIntScope__Group__0 ) )
            {
            // InternalAlloyLanguage.g:975:1: ( ( rule__ALSIntScope__Group__0 ) )
            // InternalAlloyLanguage.g:976:1: ( rule__ALSIntScope__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIntScopeAccess().getGroup()); 
            }
            // InternalAlloyLanguage.g:977:1: ( rule__ALSIntScope__Group__0 )
            // InternalAlloyLanguage.g:977:2: rule__ALSIntScope__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSIntScope__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIntScopeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSIntScope"


    // $ANTLR start "ruleALSMultiplicity"
    // InternalAlloyLanguage.g:990:1: ruleALSMultiplicity : ( ( rule__ALSMultiplicity__Alternatives ) ) ;
    public final void ruleALSMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:994:1: ( ( ( rule__ALSMultiplicity__Alternatives ) ) )
            // InternalAlloyLanguage.g:995:1: ( ( rule__ALSMultiplicity__Alternatives ) )
            {
            // InternalAlloyLanguage.g:995:1: ( ( rule__ALSMultiplicity__Alternatives ) )
            // InternalAlloyLanguage.g:996:1: ( rule__ALSMultiplicity__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSMultiplicityAccess().getAlternatives()); 
            }
            // InternalAlloyLanguage.g:997:1: ( rule__ALSMultiplicity__Alternatives )
            // InternalAlloyLanguage.g:997:2: rule__ALSMultiplicity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ALSMultiplicity__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSMultiplicityAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSMultiplicity"


    // $ANTLR start "ruleALSNumericOperator"
    // InternalAlloyLanguage.g:1009:1: ruleALSNumericOperator : ( ( rule__ALSNumericOperator__Alternatives ) ) ;
    public final void ruleALSNumericOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1013:1: ( ( ( rule__ALSNumericOperator__Alternatives ) ) )
            // InternalAlloyLanguage.g:1014:1: ( ( rule__ALSNumericOperator__Alternatives ) )
            {
            // InternalAlloyLanguage.g:1014:1: ( ( rule__ALSNumericOperator__Alternatives ) )
            // InternalAlloyLanguage.g:1015:1: ( rule__ALSNumericOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSNumericOperatorAccess().getAlternatives()); 
            }
            // InternalAlloyLanguage.g:1016:1: ( rule__ALSNumericOperator__Alternatives )
            // InternalAlloyLanguage.g:1016:2: rule__ALSNumericOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ALSNumericOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSNumericOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALSNumericOperator"


    // $ANTLR start "rule__ALSDocument__Alternatives_0"
    // InternalAlloyLanguage.g:1027:1: rule__ALSDocument__Alternatives_0 : ( ( ( rule__ALSDocument__EnumDeclarationsAssignment_0_0 ) ) | ( ( rule__ALSDocument__SignatureBodiesAssignment_0_1 ) ) | ( ( rule__ALSDocument__FunctionDefinitionsAssignment_0_2 ) ) | ( ( rule__ALSDocument__RelationDefinitionsAssignment_0_3 ) ) | ( ( rule__ALSDocument__FactDeclarationsAssignment_0_4 ) ) );
    public final void rule__ALSDocument__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1031:1: ( ( ( rule__ALSDocument__EnumDeclarationsAssignment_0_0 ) ) | ( ( rule__ALSDocument__SignatureBodiesAssignment_0_1 ) ) | ( ( rule__ALSDocument__FunctionDefinitionsAssignment_0_2 ) ) | ( ( rule__ALSDocument__RelationDefinitionsAssignment_0_3 ) ) | ( ( rule__ALSDocument__FactDeclarationsAssignment_0_4 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt1=1;
                }
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 36:
            case 73:
                {
                alt1=2;
                }
                break;
            case 41:
                {
                alt1=3;
                }
                break;
            case 44:
                {
                alt1=4;
                }
                break;
            case 45:
                {
                alt1=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalAlloyLanguage.g:1032:1: ( ( rule__ALSDocument__EnumDeclarationsAssignment_0_0 ) )
                    {
                    // InternalAlloyLanguage.g:1032:1: ( ( rule__ALSDocument__EnumDeclarationsAssignment_0_0 ) )
                    // InternalAlloyLanguage.g:1033:1: ( rule__ALSDocument__EnumDeclarationsAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSDocumentAccess().getEnumDeclarationsAssignment_0_0()); 
                    }
                    // InternalAlloyLanguage.g:1034:1: ( rule__ALSDocument__EnumDeclarationsAssignment_0_0 )
                    // InternalAlloyLanguage.g:1034:2: rule__ALSDocument__EnumDeclarationsAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSDocument__EnumDeclarationsAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSDocumentAccess().getEnumDeclarationsAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:1038:6: ( ( rule__ALSDocument__SignatureBodiesAssignment_0_1 ) )
                    {
                    // InternalAlloyLanguage.g:1038:6: ( ( rule__ALSDocument__SignatureBodiesAssignment_0_1 ) )
                    // InternalAlloyLanguage.g:1039:1: ( rule__ALSDocument__SignatureBodiesAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSDocumentAccess().getSignatureBodiesAssignment_0_1()); 
                    }
                    // InternalAlloyLanguage.g:1040:1: ( rule__ALSDocument__SignatureBodiesAssignment_0_1 )
                    // InternalAlloyLanguage.g:1040:2: rule__ALSDocument__SignatureBodiesAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSDocument__SignatureBodiesAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSDocumentAccess().getSignatureBodiesAssignment_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAlloyLanguage.g:1044:6: ( ( rule__ALSDocument__FunctionDefinitionsAssignment_0_2 ) )
                    {
                    // InternalAlloyLanguage.g:1044:6: ( ( rule__ALSDocument__FunctionDefinitionsAssignment_0_2 ) )
                    // InternalAlloyLanguage.g:1045:1: ( rule__ALSDocument__FunctionDefinitionsAssignment_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSDocumentAccess().getFunctionDefinitionsAssignment_0_2()); 
                    }
                    // InternalAlloyLanguage.g:1046:1: ( rule__ALSDocument__FunctionDefinitionsAssignment_0_2 )
                    // InternalAlloyLanguage.g:1046:2: rule__ALSDocument__FunctionDefinitionsAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSDocument__FunctionDefinitionsAssignment_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSDocumentAccess().getFunctionDefinitionsAssignment_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAlloyLanguage.g:1050:6: ( ( rule__ALSDocument__RelationDefinitionsAssignment_0_3 ) )
                    {
                    // InternalAlloyLanguage.g:1050:6: ( ( rule__ALSDocument__RelationDefinitionsAssignment_0_3 ) )
                    // InternalAlloyLanguage.g:1051:1: ( rule__ALSDocument__RelationDefinitionsAssignment_0_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSDocumentAccess().getRelationDefinitionsAssignment_0_3()); 
                    }
                    // InternalAlloyLanguage.g:1052:1: ( rule__ALSDocument__RelationDefinitionsAssignment_0_3 )
                    // InternalAlloyLanguage.g:1052:2: rule__ALSDocument__RelationDefinitionsAssignment_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSDocument__RelationDefinitionsAssignment_0_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSDocumentAccess().getRelationDefinitionsAssignment_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAlloyLanguage.g:1056:6: ( ( rule__ALSDocument__FactDeclarationsAssignment_0_4 ) )
                    {
                    // InternalAlloyLanguage.g:1056:6: ( ( rule__ALSDocument__FactDeclarationsAssignment_0_4 ) )
                    // InternalAlloyLanguage.g:1057:1: ( rule__ALSDocument__FactDeclarationsAssignment_0_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSDocumentAccess().getFactDeclarationsAssignment_0_4()); 
                    }
                    // InternalAlloyLanguage.g:1058:1: ( rule__ALSDocument__FactDeclarationsAssignment_0_4 )
                    // InternalAlloyLanguage.g:1058:2: rule__ALSDocument__FactDeclarationsAssignment_0_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSDocument__FactDeclarationsAssignment_0_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSDocumentAccess().getFactDeclarationsAssignment_0_4()); 
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
    // $ANTLR end "rule__ALSDocument__Alternatives_0"


    // $ANTLR start "rule__ALSTypeDeclaration__Alternatives"
    // InternalAlloyLanguage.g:1068:1: rule__ALSTypeDeclaration__Alternatives : ( ( ruleALSEnumDeclaration ) | ( ruleALSSignatureDeclaration ) );
    public final void rule__ALSTypeDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1072:1: ( ( ruleALSEnumDeclaration ) | ( ruleALSSignatureDeclaration ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==32) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAlloyLanguage.g:1073:1: ( ruleALSEnumDeclaration )
                    {
                    // InternalAlloyLanguage.g:1073:1: ( ruleALSEnumDeclaration )
                    // InternalAlloyLanguage.g:1074:1: ruleALSEnumDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSTypeDeclarationAccess().getALSEnumDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleALSEnumDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSTypeDeclarationAccess().getALSEnumDeclarationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:1079:6: ( ruleALSSignatureDeclaration )
                    {
                    // InternalAlloyLanguage.g:1079:6: ( ruleALSSignatureDeclaration )
                    // InternalAlloyLanguage.g:1080:1: ruleALSSignatureDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSTypeDeclarationAccess().getALSSignatureDeclarationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleALSSignatureDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSTypeDeclarationAccess().getALSSignatureDeclarationParserRuleCall_1()); 
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
    // $ANTLR end "rule__ALSTypeDeclaration__Alternatives"


    // $ANTLR start "rule__ALSSignatureBody__Alternatives_4"
    // InternalAlloyLanguage.g:1090:1: rule__ALSSignatureBody__Alternatives_4 : ( ( ( rule__ALSSignatureBody__Group_4_0__0 ) ) | ( ( rule__ALSSignatureBody__Group_4_1__0 ) ) );
    public final void rule__ALSSignatureBody__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1094:1: ( ( ( rule__ALSSignatureBody__Group_4_0__0 ) ) | ( ( rule__ALSSignatureBody__Group_4_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37) ) {
                alt3=1;
            }
            else if ( (LA3_0==38) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAlloyLanguage.g:1095:1: ( ( rule__ALSSignatureBody__Group_4_0__0 ) )
                    {
                    // InternalAlloyLanguage.g:1095:1: ( ( rule__ALSSignatureBody__Group_4_0__0 ) )
                    // InternalAlloyLanguage.g:1096:1: ( rule__ALSSignatureBody__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSSignatureBodyAccess().getGroup_4_0()); 
                    }
                    // InternalAlloyLanguage.g:1097:1: ( rule__ALSSignatureBody__Group_4_0__0 )
                    // InternalAlloyLanguage.g:1097:2: rule__ALSSignatureBody__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSSignatureBody__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSSignatureBodyAccess().getGroup_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:1101:6: ( ( rule__ALSSignatureBody__Group_4_1__0 ) )
                    {
                    // InternalAlloyLanguage.g:1101:6: ( ( rule__ALSSignatureBody__Group_4_1__0 ) )
                    // InternalAlloyLanguage.g:1102:1: ( rule__ALSSignatureBody__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSSignatureBodyAccess().getGroup_4_1()); 
                    }
                    // InternalAlloyLanguage.g:1103:1: ( rule__ALSSignatureBody__Group_4_1__0 )
                    // InternalAlloyLanguage.g:1103:2: rule__ALSSignatureBody__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSSignatureBody__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSSignatureBodyAccess().getGroup_4_1()); 
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
    // $ANTLR end "rule__ALSSignatureBody__Alternatives_4"


    // $ANTLR start "rule__ALSQuantified__Alternatives"
    // InternalAlloyLanguage.g:1113:1: rule__ALSQuantified__Alternatives : ( ( ( rule__ALSQuantified__Group_0__0 ) ) | ( ruleALSOr ) );
    public final void rule__ALSQuantified__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1117:1: ( ( ( rule__ALSQuantified__Group_0__0 ) ) | ( ruleALSOr ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=21 && LA4_0<=26)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_INT)||(LA4_0>=19 && LA4_0<=20)||(LA4_0>=27 && LA4_0<=31)||LA4_0==57||(LA4_0>=60 && LA4_0<=69)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAlloyLanguage.g:1118:1: ( ( rule__ALSQuantified__Group_0__0 ) )
                    {
                    // InternalAlloyLanguage.g:1118:1: ( ( rule__ALSQuantified__Group_0__0 ) )
                    // InternalAlloyLanguage.g:1119:1: ( rule__ALSQuantified__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSQuantifiedAccess().getGroup_0()); 
                    }
                    // InternalAlloyLanguage.g:1120:1: ( rule__ALSQuantified__Group_0__0 )
                    // InternalAlloyLanguage.g:1120:2: rule__ALSQuantified__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSQuantified__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSQuantifiedAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:1124:6: ( ruleALSOr )
                    {
                    // InternalAlloyLanguage.g:1124:6: ( ruleALSOr )
                    // InternalAlloyLanguage.g:1125:1: ruleALSOr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSQuantifiedAccess().getALSOrParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleALSOr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSQuantifiedAccess().getALSOrParserRuleCall_1()); 
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
    // $ANTLR end "rule__ALSQuantified__Alternatives"


    // $ANTLR start "rule__ALSOr__Alternatives_1_1"
    // InternalAlloyLanguage.g:1135:1: rule__ALSOr__Alternatives_1_1 : ( ( '||' ) | ( 'or' ) );
    public final void rule__ALSOr__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1139:1: ( ( '||' ) | ( 'or' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlloyLanguage.g:1140:1: ( '||' )
                    {
                    // InternalAlloyLanguage.g:1140:1: ( '||' )
                    // InternalAlloyLanguage.g:1141:1: '||'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSOrAccess().getVerticalLineVerticalLineKeyword_1_1_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSOrAccess().getVerticalLineVerticalLineKeyword_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:1148:6: ( 'or' )
                    {
                    // InternalAlloyLanguage.g:1148:6: ( 'or' )
                    // InternalAlloyLanguage.g:1149:1: 'or'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSOrAccess().getOrKeyword_1_1_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSOrAccess().getOrKeyword_1_1_1()); 
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
    // $ANTLR end "rule__ALSOr__Alternatives_1_1"


    // $ANTLR start "rule__ALSIff__Alternatives_1_1"
    // InternalAlloyLanguage.g:1161:1: rule__ALSIff__Alternatives_1_1 : ( ( '<=>' ) | ( 'iff' ) );
    public final void rule__ALSIff__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1165:1: ( ( '<=>' ) | ( 'iff' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAlloyLanguage.g:1166:1: ( '<=>' )
                    {
                    // InternalAlloyLanguage.g:1166:1: ( '<=>' )
                    // InternalAlloyLanguage.g:1167:1: '<=>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSIffAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSIffAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:1174:6: ( 'iff' )
                    {
                    // InternalAlloyLanguage.g:1174:6: ( 'iff' )
                    // InternalAlloyLanguage.g:1175:1: 'iff'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSIffAccess().getIffKeyword_1_1_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSIffAccess().getIffKeyword_1_1_1()); 
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
    // $ANTLR end "rule__ALSIff__Alternatives_1_1"


    // $ANTLR start "rule__ALSImpl__Alternatives_1_1"
    // InternalAlloyLanguage.g:1187:1: rule__ALSImpl__Alternatives_1_1 : ( ( '=>' ) | ( 'implies' ) );
    public final void rule__ALSImpl__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1191:1: ( ( '=>' ) | ( 'implies' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlloyLanguage.g:1192:1: ( '=>' )
                    {
                    // InternalAlloyLanguage.g:1192:1: ( '=>' )
                    // InternalAlloyLanguage.g:1193:1: '=>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSImplAccess().getEqualsSignGreaterThanSignKeyword_1_1_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSImplAccess().getEqualsSignGreaterThanSignKeyword_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:1200:6: ( 'implies' )
                    {
                    // InternalAlloyLanguage.g:1200:6: ( 'implies' )
                    // InternalAlloyLanguage.g:1201:1: 'implies'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSImplAccess().getImpliesKeyword_1_1_1()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSImplAccess().getImpliesKeyword_1_1_1()); 
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
    // $ANTLR end "rule__ALSImpl__Alternatives_1_1"


    // $ANTLR start "rule__ALSAnd__Alternatives_1_1"
    // InternalAlloyLanguage.g:1213:1: rule__ALSAnd__Alternatives_1_1 : ( ( '&&' ) | ( 'and' ) );
    public final void rule__ALSAnd__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1217:1: ( ( '&&' ) | ( 'and' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlloyLanguage.g:1218:1: ( '&&' )
                    {
                    // InternalAlloyLanguage.g:1218:1: ( '&&' )
                    // InternalAlloyLanguage.g:1219:1: '&&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSAndAccess().getAmpersandAmpersandKeyword_1_1_0()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSAndAccess().getAmpersandAmpersandKeyword_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:1226:6: ( 'and' )
                    {
                    // InternalAlloyLanguage.g:1226:6: ( 'and' )
                    // InternalAlloyLanguage.g:1227:1: 'and'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSAndAccess().getAndKeyword_1_1_1()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSAndAccess().getAndKeyword_1_1_1()); 
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
    // $ANTLR end "rule__ALSAnd__Alternatives_1_1"


    // $ANTLR start "rule__ALSComparison__Alternatives_1_0"
    // InternalAlloyLanguage.g:1239:1: rule__ALSComparison__Alternatives_1_0 : ( ( ( rule__ALSComparison__Group_1_0_0__0 ) ) | ( ( rule__ALSComparison__Group_1_0_1__0 ) ) | ( ( rule__ALSComparison__Group_1_0_2__0 ) ) | ( ( rule__ALSComparison__Group_1_0_3__0 ) ) | ( ( rule__ALSComparison__Group_1_0_4__0 ) ) | ( ( rule__ALSComparison__Group_1_0_5__0 ) ) | ( ( rule__ALSComparison__Group_1_0_6__0 ) ) );
    public final void rule__ALSComparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1243:1: ( ( ( rule__ALSComparison__Group_1_0_0__0 ) ) | ( ( rule__ALSComparison__Group_1_0_1__0 ) ) | ( ( rule__ALSComparison__Group_1_0_2__0 ) ) | ( ( rule__ALSComparison__Group_1_0_3__0 ) ) | ( ( rule__ALSComparison__Group_1_0_4__0 ) ) | ( ( rule__ALSComparison__Group_1_0_5__0 ) ) | ( ( rule__ALSComparison__Group_1_0_6__0 ) ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt9=1;
                }
                break;
            case 48:
                {
                alt9=2;
                }
                break;
            case 38:
                {
                alt9=3;
                }
                break;
            case 49:
                {
                alt9=4;
                }
                break;
            case 50:
                {
                alt9=5;
                }
                break;
            case 51:
                {
                alt9=6;
                }
                break;
            case 52:
                {
                alt9=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAlloyLanguage.g:1244:1: ( ( rule__ALSComparison__Group_1_0_0__0 ) )
                    {
                    // InternalAlloyLanguage.g:1244:1: ( ( rule__ALSComparison__Group_1_0_0__0 ) )
                    // InternalAlloyLanguage.g:1245:1: ( rule__ALSComparison__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSComparisonAccess().getGroup_1_0_0()); 
                    }
                    // InternalAlloyLanguage.g:1246:1: ( rule__ALSComparison__Group_1_0_0__0 )
                    // InternalAlloyLanguage.g:1246:2: rule__ALSComparison__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSComparison__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSComparisonAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:1250:6: ( ( rule__ALSComparison__Group_1_0_1__0 ) )
                    {
                    // InternalAlloyLanguage.g:1250:6: ( ( rule__ALSComparison__Group_1_0_1__0 ) )
                    // InternalAlloyLanguage.g:1251:1: ( rule__ALSComparison__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSComparisonAccess().getGroup_1_0_1()); 
                    }
                    // InternalAlloyLanguage.g:1252:1: ( rule__ALSComparison__Group_1_0_1__0 )
                    // InternalAlloyLanguage.g:1252:2: rule__ALSComparison__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSComparison__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSComparisonAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAlloyLanguage.g:1256:6: ( ( rule__ALSComparison__Group_1_0_2__0 ) )
                    {
                    // InternalAlloyLanguage.g:1256:6: ( ( rule__ALSComparison__Group_1_0_2__0 ) )
                    // InternalAlloyLanguage.g:1257:1: ( rule__ALSComparison__Group_1_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSComparisonAccess().getGroup_1_0_2()); 
                    }
                    // InternalAlloyLanguage.g:1258:1: ( rule__ALSComparison__Group_1_0_2__0 )
                    // InternalAlloyLanguage.g:1258:2: rule__ALSComparison__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSComparison__Group_1_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSComparisonAccess().getGroup_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAlloyLanguage.g:1262:6: ( ( rule__ALSComparison__Group_1_0_3__0 ) )
                    {
                    // InternalAlloyLanguage.g:1262:6: ( ( rule__ALSComparison__Group_1_0_3__0 ) )
                    // InternalAlloyLanguage.g:1263:1: ( rule__ALSComparison__Group_1_0_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSComparisonAccess().getGroup_1_0_3()); 
                    }
                    // InternalAlloyLanguage.g:1264:1: ( rule__ALSComparison__Group_1_0_3__0 )
                    // InternalAlloyLanguage.g:1264:2: rule__ALSComparison__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSComparison__Group_1_0_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSComparisonAccess().getGroup_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAlloyLanguage.g:1268:6: ( ( rule__ALSComparison__Group_1_0_4__0 ) )
                    {
                    // InternalAlloyLanguage.g:1268:6: ( ( rule__ALSComparison__Group_1_0_4__0 ) )
                    // InternalAlloyLanguage.g:1269:1: ( rule__ALSComparison__Group_1_0_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSComparisonAccess().getGroup_1_0_4()); 
                    }
                    // InternalAlloyLanguage.g:1270:1: ( rule__ALSComparison__Group_1_0_4__0 )
                    // InternalAlloyLanguage.g:1270:2: rule__ALSComparison__Group_1_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSComparison__Group_1_0_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSComparisonAccess().getGroup_1_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAlloyLanguage.g:1274:6: ( ( rule__ALSComparison__Group_1_0_5__0 ) )
                    {
                    // InternalAlloyLanguage.g:1274:6: ( ( rule__ALSComparison__Group_1_0_5__0 ) )
                    // InternalAlloyLanguage.g:1275:1: ( rule__ALSComparison__Group_1_0_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSComparisonAccess().getGroup_1_0_5()); 
                    }
                    // InternalAlloyLanguage.g:1276:1: ( rule__ALSComparison__Group_1_0_5__0 )
                    // InternalAlloyLanguage.g:1276:2: rule__ALSComparison__Group_1_0_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSComparison__Group_1_0_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSComparisonAccess().getGroup_1_0_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAlloyLanguage.g:1280:6: ( ( rule__ALSComparison__Group_1_0_6__0 ) )
                    {
                    // InternalAlloyLanguage.g:1280:6: ( ( rule__ALSComparison__Group_1_0_6__0 ) )
                    // InternalAlloyLanguage.g:1281:1: ( rule__ALSComparison__Group_1_0_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSComparisonAccess().getGroup_1_0_6()); 
                    }
                    // InternalAlloyLanguage.g:1282:1: ( rule__ALSComparison__Group_1_0_6__0 )
                    // InternalAlloyLanguage.g:1282:2: rule__ALSComparison__Group_1_0_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSComparison__Group_1_0_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSComparisonAccess().getGroup_1_0_6()); 
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
    // $ANTLR end "rule__ALSComparison__Alternatives_1_0"


    // $ANTLR start "rule__ALSPreficed__Alternatives"
    // InternalAlloyLanguage.g:1291:1: rule__ALSPreficed__Alternatives : ( ( ( rule__ALSPreficed__Group_0__0 ) ) | ( ( rule__ALSPreficed__Group_1__0 ) ) | ( ( rule__ALSPreficed__Group_2__0 ) ) | ( ( rule__ALSPreficed__Group_3__0 ) ) | ( ( rule__ALSPreficed__Group_4__0 ) ) | ( ( rule__ALSPreficed__Group_5__0 ) ) | ( ( rule__ALSPreficed__Group_6__0 ) ) | ( ( rule__ALSPreficed__Group_7__0 ) ) | ( ruleALSBasicRelationTerm ) );
    public final void rule__ALSPreficed__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1295:1: ( ( ( rule__ALSPreficed__Group_0__0 ) ) | ( ( rule__ALSPreficed__Group_1__0 ) ) | ( ( rule__ALSPreficed__Group_2__0 ) ) | ( ( rule__ALSPreficed__Group_3__0 ) ) | ( ( rule__ALSPreficed__Group_4__0 ) ) | ( ( rule__ALSPreficed__Group_5__0 ) ) | ( ( rule__ALSPreficed__Group_6__0 ) ) | ( ( rule__ALSPreficed__Group_7__0 ) ) | ( ruleALSBasicRelationTerm ) )
            int alt10=9;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalAlloyLanguage.g:1296:1: ( ( rule__ALSPreficed__Group_0__0 ) )
                    {
                    // InternalAlloyLanguage.g:1296:1: ( ( rule__ALSPreficed__Group_0__0 ) )
                    // InternalAlloyLanguage.g:1297:1: ( rule__ALSPreficed__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSPreficedAccess().getGroup_0()); 
                    }
                    // InternalAlloyLanguage.g:1298:1: ( rule__ALSPreficed__Group_0__0 )
                    // InternalAlloyLanguage.g:1298:2: rule__ALSPreficed__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSPreficed__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSPreficedAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:1302:6: ( ( rule__ALSPreficed__Group_1__0 ) )
                    {
                    // InternalAlloyLanguage.g:1302:6: ( ( rule__ALSPreficed__Group_1__0 ) )
                    // InternalAlloyLanguage.g:1303:1: ( rule__ALSPreficed__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSPreficedAccess().getGroup_1()); 
                    }
                    // InternalAlloyLanguage.g:1304:1: ( rule__ALSPreficed__Group_1__0 )
                    // InternalAlloyLanguage.g:1304:2: rule__ALSPreficed__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSPreficed__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSPreficedAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAlloyLanguage.g:1308:6: ( ( rule__ALSPreficed__Group_2__0 ) )
                    {
                    // InternalAlloyLanguage.g:1308:6: ( ( rule__ALSPreficed__Group_2__0 ) )
                    // InternalAlloyLanguage.g:1309:1: ( rule__ALSPreficed__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSPreficedAccess().getGroup_2()); 
                    }
                    // InternalAlloyLanguage.g:1310:1: ( rule__ALSPreficed__Group_2__0 )
                    // InternalAlloyLanguage.g:1310:2: rule__ALSPreficed__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSPreficed__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSPreficedAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAlloyLanguage.g:1314:6: ( ( rule__ALSPreficed__Group_3__0 ) )
                    {
                    // InternalAlloyLanguage.g:1314:6: ( ( rule__ALSPreficed__Group_3__0 ) )
                    // InternalAlloyLanguage.g:1315:1: ( rule__ALSPreficed__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSPreficedAccess().getGroup_3()); 
                    }
                    // InternalAlloyLanguage.g:1316:1: ( rule__ALSPreficed__Group_3__0 )
                    // InternalAlloyLanguage.g:1316:2: rule__ALSPreficed__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSPreficed__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSPreficedAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAlloyLanguage.g:1320:6: ( ( rule__ALSPreficed__Group_4__0 ) )
                    {
                    // InternalAlloyLanguage.g:1320:6: ( ( rule__ALSPreficed__Group_4__0 ) )
                    // InternalAlloyLanguage.g:1321:1: ( rule__ALSPreficed__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSPreficedAccess().getGroup_4()); 
                    }
                    // InternalAlloyLanguage.g:1322:1: ( rule__ALSPreficed__Group_4__0 )
                    // InternalAlloyLanguage.g:1322:2: rule__ALSPreficed__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSPreficed__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSPreficedAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAlloyLanguage.g:1326:6: ( ( rule__ALSPreficed__Group_5__0 ) )
                    {
                    // InternalAlloyLanguage.g:1326:6: ( ( rule__ALSPreficed__Group_5__0 ) )
                    // InternalAlloyLanguage.g:1327:1: ( rule__ALSPreficed__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSPreficedAccess().getGroup_5()); 
                    }
                    // InternalAlloyLanguage.g:1328:1: ( rule__ALSPreficed__Group_5__0 )
                    // InternalAlloyLanguage.g:1328:2: rule__ALSPreficed__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSPreficed__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSPreficedAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAlloyLanguage.g:1332:6: ( ( rule__ALSPreficed__Group_6__0 ) )
                    {
                    // InternalAlloyLanguage.g:1332:6: ( ( rule__ALSPreficed__Group_6__0 ) )
                    // InternalAlloyLanguage.g:1333:1: ( rule__ALSPreficed__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSPreficedAccess().getGroup_6()); 
                    }
                    // InternalAlloyLanguage.g:1334:1: ( rule__ALSPreficed__Group_6__0 )
                    // InternalAlloyLanguage.g:1334:2: rule__ALSPreficed__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSPreficed__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSPreficedAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalAlloyLanguage.g:1338:6: ( ( rule__ALSPreficed__Group_7__0 ) )
                    {
                    // InternalAlloyLanguage.g:1338:6: ( ( rule__ALSPreficed__Group_7__0 ) )
                    // InternalAlloyLanguage.g:1339:1: ( rule__ALSPreficed__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSPreficedAccess().getGroup_7()); 
                    }
                    // InternalAlloyLanguage.g:1340:1: ( rule__ALSPreficed__Group_7__0 )
                    // InternalAlloyLanguage.g:1340:2: rule__ALSPreficed__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSPreficed__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSPreficedAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalAlloyLanguage.g:1344:6: ( ruleALSBasicRelationTerm )
                    {
                    // InternalAlloyLanguage.g:1344:6: ( ruleALSBasicRelationTerm )
                    // InternalAlloyLanguage.g:1345:1: ruleALSBasicRelationTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSPreficedAccess().getALSBasicRelationTermParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleALSBasicRelationTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSPreficedAccess().getALSBasicRelationTermParserRuleCall_8()); 
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
    // $ANTLR end "rule__ALSPreficed__Alternatives"


    // $ANTLR start "rule__ALSPreficed__Alternatives_0_1_0"
    // InternalAlloyLanguage.g:1355:1: rule__ALSPreficed__Alternatives_0_1_0 : ( ( '!' ) | ( 'not' ) );
    public final void rule__ALSPreficed__Alternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1359:1: ( ( '!' ) | ( 'not' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            else if ( (LA11_0==20) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlloyLanguage.g:1360:1: ( '!' )
                    {
                    // InternalAlloyLanguage.g:1360:1: ( '!' )
                    // InternalAlloyLanguage.g:1361:1: '!'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSPreficedAccess().getExclamationMarkKeyword_0_1_0_0()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSPreficedAccess().getExclamationMarkKeyword_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:1368:6: ( 'not' )
                    {
                    // InternalAlloyLanguage.g:1368:6: ( 'not' )
                    // InternalAlloyLanguage.g:1369:1: 'not'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSPreficedAccess().getNotKeyword_0_1_0_1()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSPreficedAccess().getNotKeyword_0_1_0_1()); 
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
    // $ANTLR end "rule__ALSPreficed__Alternatives_0_1_0"


    // $ANTLR start "rule__ALSPreficed__Alternatives_7_1"
    // InternalAlloyLanguage.g:1381:1: rule__ALSPreficed__Alternatives_7_1 : ( ( ( rule__ALSPreficed__ReferredDefinitionAssignment_7_1_0 ) ) | ( ( rule__ALSPreficed__ReferredNumericOperatorAssignment_7_1_1 ) ) );
    public final void rule__ALSPreficed__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1385:1: ( ( ( rule__ALSPreficed__ReferredDefinitionAssignment_7_1_0 ) ) | ( ( rule__ALSPreficed__ReferredNumericOperatorAssignment_7_1_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=27 && LA12_0<=31)) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalAlloyLanguage.g:1386:1: ( ( rule__ALSPreficed__ReferredDefinitionAssignment_7_1_0 ) )
                    {
                    // InternalAlloyLanguage.g:1386:1: ( ( rule__ALSPreficed__ReferredDefinitionAssignment_7_1_0 ) )
                    // InternalAlloyLanguage.g:1387:1: ( rule__ALSPreficed__ReferredDefinitionAssignment_7_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSPreficedAccess().getReferredDefinitionAssignment_7_1_0()); 
                    }
                    // InternalAlloyLanguage.g:1388:1: ( rule__ALSPreficed__ReferredDefinitionAssignment_7_1_0 )
                    // InternalAlloyLanguage.g:1388:2: rule__ALSPreficed__ReferredDefinitionAssignment_7_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSPreficed__ReferredDefinitionAssignment_7_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSPreficedAccess().getReferredDefinitionAssignment_7_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:1392:6: ( ( rule__ALSPreficed__ReferredNumericOperatorAssignment_7_1_1 ) )
                    {
                    // InternalAlloyLanguage.g:1392:6: ( ( rule__ALSPreficed__ReferredNumericOperatorAssignment_7_1_1 ) )
                    // InternalAlloyLanguage.g:1393:1: ( rule__ALSPreficed__ReferredNumericOperatorAssignment_7_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSPreficedAccess().getReferredNumericOperatorAssignment_7_1_1()); 
                    }
                    // InternalAlloyLanguage.g:1394:1: ( rule__ALSPreficed__ReferredNumericOperatorAssignment_7_1_1 )
                    // InternalAlloyLanguage.g:1394:2: rule__ALSPreficed__ReferredNumericOperatorAssignment_7_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSPreficed__ReferredNumericOperatorAssignment_7_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSPreficedAccess().getReferredNumericOperatorAssignment_7_1_1()); 
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
    // $ANTLR end "rule__ALSPreficed__Alternatives_7_1"


    // $ANTLR start "rule__ALSBasicRelationTerm__Alternatives"
    // InternalAlloyLanguage.g:1403:1: rule__ALSBasicRelationTerm__Alternatives : ( ( ( rule__ALSBasicRelationTerm__Group_0__0 ) ) | ( ( rule__ALSBasicRelationTerm__Group_1__0 ) ) | ( ( rule__ALSBasicRelationTerm__Group_2__0 ) ) | ( ( rule__ALSBasicRelationTerm__Group_3__0 ) ) | ( ( rule__ALSBasicRelationTerm__Group_4__0 ) ) | ( ( rule__ALSBasicRelationTerm__Group_5__0 ) ) | ( ( rule__ALSBasicRelationTerm__Group_6__0 ) ) );
    public final void rule__ALSBasicRelationTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1407:1: ( ( ( rule__ALSBasicRelationTerm__Group_0__0 ) ) | ( ( rule__ALSBasicRelationTerm__Group_1__0 ) ) | ( ( rule__ALSBasicRelationTerm__Group_2__0 ) ) | ( ( rule__ALSBasicRelationTerm__Group_3__0 ) ) | ( ( rule__ALSBasicRelationTerm__Group_4__0 ) ) | ( ( rule__ALSBasicRelationTerm__Group_5__0 ) ) | ( ( rule__ALSBasicRelationTerm__Group_6__0 ) ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt13=1;
                }
                break;
            case 66:
                {
                alt13=2;
                }
                break;
            case 67:
                {
                alt13=3;
                }
                break;
            case 68:
                {
                alt13=4;
                }
                break;
            case RULE_ID:
                {
                alt13=5;
                }
                break;
            case RULE_INT:
                {
                alt13=6;
                }
                break;
            case 69:
                {
                alt13=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAlloyLanguage.g:1408:1: ( ( rule__ALSBasicRelationTerm__Group_0__0 ) )
                    {
                    // InternalAlloyLanguage.g:1408:1: ( ( rule__ALSBasicRelationTerm__Group_0__0 ) )
                    // InternalAlloyLanguage.g:1409:1: ( rule__ALSBasicRelationTerm__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSBasicRelationTermAccess().getGroup_0()); 
                    }
                    // InternalAlloyLanguage.g:1410:1: ( rule__ALSBasicRelationTerm__Group_0__0 )
                    // InternalAlloyLanguage.g:1410:2: rule__ALSBasicRelationTerm__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSBasicRelationTerm__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSBasicRelationTermAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:1414:6: ( ( rule__ALSBasicRelationTerm__Group_1__0 ) )
                    {
                    // InternalAlloyLanguage.g:1414:6: ( ( rule__ALSBasicRelationTerm__Group_1__0 ) )
                    // InternalAlloyLanguage.g:1415:1: ( rule__ALSBasicRelationTerm__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSBasicRelationTermAccess().getGroup_1()); 
                    }
                    // InternalAlloyLanguage.g:1416:1: ( rule__ALSBasicRelationTerm__Group_1__0 )
                    // InternalAlloyLanguage.g:1416:2: rule__ALSBasicRelationTerm__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSBasicRelationTerm__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSBasicRelationTermAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAlloyLanguage.g:1420:6: ( ( rule__ALSBasicRelationTerm__Group_2__0 ) )
                    {
                    // InternalAlloyLanguage.g:1420:6: ( ( rule__ALSBasicRelationTerm__Group_2__0 ) )
                    // InternalAlloyLanguage.g:1421:1: ( rule__ALSBasicRelationTerm__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSBasicRelationTermAccess().getGroup_2()); 
                    }
                    // InternalAlloyLanguage.g:1422:1: ( rule__ALSBasicRelationTerm__Group_2__0 )
                    // InternalAlloyLanguage.g:1422:2: rule__ALSBasicRelationTerm__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSBasicRelationTerm__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSBasicRelationTermAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAlloyLanguage.g:1426:6: ( ( rule__ALSBasicRelationTerm__Group_3__0 ) )
                    {
                    // InternalAlloyLanguage.g:1426:6: ( ( rule__ALSBasicRelationTerm__Group_3__0 ) )
                    // InternalAlloyLanguage.g:1427:1: ( rule__ALSBasicRelationTerm__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSBasicRelationTermAccess().getGroup_3()); 
                    }
                    // InternalAlloyLanguage.g:1428:1: ( rule__ALSBasicRelationTerm__Group_3__0 )
                    // InternalAlloyLanguage.g:1428:2: rule__ALSBasicRelationTerm__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSBasicRelationTerm__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSBasicRelationTermAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAlloyLanguage.g:1432:6: ( ( rule__ALSBasicRelationTerm__Group_4__0 ) )
                    {
                    // InternalAlloyLanguage.g:1432:6: ( ( rule__ALSBasicRelationTerm__Group_4__0 ) )
                    // InternalAlloyLanguage.g:1433:1: ( rule__ALSBasicRelationTerm__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSBasicRelationTermAccess().getGroup_4()); 
                    }
                    // InternalAlloyLanguage.g:1434:1: ( rule__ALSBasicRelationTerm__Group_4__0 )
                    // InternalAlloyLanguage.g:1434:2: rule__ALSBasicRelationTerm__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSBasicRelationTerm__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSBasicRelationTermAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAlloyLanguage.g:1438:6: ( ( rule__ALSBasicRelationTerm__Group_5__0 ) )
                    {
                    // InternalAlloyLanguage.g:1438:6: ( ( rule__ALSBasicRelationTerm__Group_5__0 ) )
                    // InternalAlloyLanguage.g:1439:1: ( rule__ALSBasicRelationTerm__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSBasicRelationTermAccess().getGroup_5()); 
                    }
                    // InternalAlloyLanguage.g:1440:1: ( rule__ALSBasicRelationTerm__Group_5__0 )
                    // InternalAlloyLanguage.g:1440:2: rule__ALSBasicRelationTerm__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSBasicRelationTerm__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSBasicRelationTermAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAlloyLanguage.g:1444:6: ( ( rule__ALSBasicRelationTerm__Group_6__0 ) )
                    {
                    // InternalAlloyLanguage.g:1444:6: ( ( rule__ALSBasicRelationTerm__Group_6__0 ) )
                    // InternalAlloyLanguage.g:1445:1: ( rule__ALSBasicRelationTerm__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSBasicRelationTermAccess().getGroup_6()); 
                    }
                    // InternalAlloyLanguage.g:1446:1: ( rule__ALSBasicRelationTerm__Group_6__0 )
                    // InternalAlloyLanguage.g:1446:2: rule__ALSBasicRelationTerm__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSBasicRelationTerm__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSBasicRelationTermAccess().getGroup_6()); 
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
    // $ANTLR end "rule__ALSBasicRelationTerm__Alternatives"


    // $ANTLR start "rule__ALSTypeScope__Alternatives"
    // InternalAlloyLanguage.g:1455:1: rule__ALSTypeScope__Alternatives : ( ( ruleALSSigScope ) | ( ruleALSIntScope ) );
    public final void rule__ALSTypeScope__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1459:1: ( ( ruleALSSigScope ) | ( ruleALSIntScope ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==75) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_INT) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==RULE_ID) ) {
                    alt14=1;
                }
                else if ( (LA14_2==68) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlloyLanguage.g:1460:1: ( ruleALSSigScope )
                    {
                    // InternalAlloyLanguage.g:1460:1: ( ruleALSSigScope )
                    // InternalAlloyLanguage.g:1461:1: ruleALSSigScope
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSTypeScopeAccess().getALSSigScopeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleALSSigScope();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSTypeScopeAccess().getALSSigScopeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:1466:6: ( ruleALSIntScope )
                    {
                    // InternalAlloyLanguage.g:1466:6: ( ruleALSIntScope )
                    // InternalAlloyLanguage.g:1467:1: ruleALSIntScope
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSTypeScopeAccess().getALSIntScopeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleALSIntScope();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSTypeScopeAccess().getALSIntScopeParserRuleCall_1()); 
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
    // $ANTLR end "rule__ALSTypeScope__Alternatives"


    // $ANTLR start "rule__ALSMultiplicity__Alternatives"
    // InternalAlloyLanguage.g:1477:1: rule__ALSMultiplicity__Alternatives : ( ( ( 'all' ) ) | ( ( 'no' ) ) | ( ( 'some' ) ) | ( ( 'lone' ) ) | ( ( 'one' ) ) | ( ( 'set' ) ) );
    public final void rule__ALSMultiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1481:1: ( ( ( 'all' ) ) | ( ( 'no' ) ) | ( ( 'some' ) ) | ( ( 'lone' ) ) | ( ( 'one' ) ) | ( ( 'set' ) ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt15=1;
                }
                break;
            case 22:
                {
                alt15=2;
                }
                break;
            case 23:
                {
                alt15=3;
                }
                break;
            case 24:
                {
                alt15=4;
                }
                break;
            case 25:
                {
                alt15=5;
                }
                break;
            case 26:
                {
                alt15=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalAlloyLanguage.g:1482:1: ( ( 'all' ) )
                    {
                    // InternalAlloyLanguage.g:1482:1: ( ( 'all' ) )
                    // InternalAlloyLanguage.g:1483:1: ( 'all' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSMultiplicityAccess().getAllEnumLiteralDeclaration_0()); 
                    }
                    // InternalAlloyLanguage.g:1484:1: ( 'all' )
                    // InternalAlloyLanguage.g:1484:3: 'all'
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSMultiplicityAccess().getAllEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:1489:6: ( ( 'no' ) )
                    {
                    // InternalAlloyLanguage.g:1489:6: ( ( 'no' ) )
                    // InternalAlloyLanguage.g:1490:1: ( 'no' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSMultiplicityAccess().getNoEnumLiteralDeclaration_1()); 
                    }
                    // InternalAlloyLanguage.g:1491:1: ( 'no' )
                    // InternalAlloyLanguage.g:1491:3: 'no'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSMultiplicityAccess().getNoEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAlloyLanguage.g:1496:6: ( ( 'some' ) )
                    {
                    // InternalAlloyLanguage.g:1496:6: ( ( 'some' ) )
                    // InternalAlloyLanguage.g:1497:1: ( 'some' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSMultiplicityAccess().getSomeEnumLiteralDeclaration_2()); 
                    }
                    // InternalAlloyLanguage.g:1498:1: ( 'some' )
                    // InternalAlloyLanguage.g:1498:3: 'some'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSMultiplicityAccess().getSomeEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAlloyLanguage.g:1503:6: ( ( 'lone' ) )
                    {
                    // InternalAlloyLanguage.g:1503:6: ( ( 'lone' ) )
                    // InternalAlloyLanguage.g:1504:1: ( 'lone' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSMultiplicityAccess().getLoneEnumLiteralDeclaration_3()); 
                    }
                    // InternalAlloyLanguage.g:1505:1: ( 'lone' )
                    // InternalAlloyLanguage.g:1505:3: 'lone'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSMultiplicityAccess().getLoneEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAlloyLanguage.g:1510:6: ( ( 'one' ) )
                    {
                    // InternalAlloyLanguage.g:1510:6: ( ( 'one' ) )
                    // InternalAlloyLanguage.g:1511:1: ( 'one' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSMultiplicityAccess().getOneEnumLiteralDeclaration_4()); 
                    }
                    // InternalAlloyLanguage.g:1512:1: ( 'one' )
                    // InternalAlloyLanguage.g:1512:3: 'one'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSMultiplicityAccess().getOneEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAlloyLanguage.g:1517:6: ( ( 'set' ) )
                    {
                    // InternalAlloyLanguage.g:1517:6: ( ( 'set' ) )
                    // InternalAlloyLanguage.g:1518:1: ( 'set' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSMultiplicityAccess().getSetEnumLiteralDeclaration_5()); 
                    }
                    // InternalAlloyLanguage.g:1519:1: ( 'set' )
                    // InternalAlloyLanguage.g:1519:3: 'set'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSMultiplicityAccess().getSetEnumLiteralDeclaration_5()); 
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
    // $ANTLR end "rule__ALSMultiplicity__Alternatives"


    // $ANTLR start "rule__ALSNumericOperator__Alternatives"
    // InternalAlloyLanguage.g:1529:1: rule__ALSNumericOperator__Alternatives : ( ( ( 'plus' ) ) | ( ( 'sub' ) ) | ( ( 'mul' ) ) | ( ( 'rem' ) ) | ( ( 'div' ) ) );
    public final void rule__ALSNumericOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1533:1: ( ( ( 'plus' ) ) | ( ( 'sub' ) ) | ( ( 'mul' ) ) | ( ( 'rem' ) ) | ( ( 'div' ) ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt16=1;
                }
                break;
            case 28:
                {
                alt16=2;
                }
                break;
            case 29:
                {
                alt16=3;
                }
                break;
            case 30:
                {
                alt16=4;
                }
                break;
            case 31:
                {
                alt16=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalAlloyLanguage.g:1534:1: ( ( 'plus' ) )
                    {
                    // InternalAlloyLanguage.g:1534:1: ( ( 'plus' ) )
                    // InternalAlloyLanguage.g:1535:1: ( 'plus' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSNumericOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                    }
                    // InternalAlloyLanguage.g:1536:1: ( 'plus' )
                    // InternalAlloyLanguage.g:1536:3: 'plus'
                    {
                    match(input,27,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSNumericOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:1541:6: ( ( 'sub' ) )
                    {
                    // InternalAlloyLanguage.g:1541:6: ( ( 'sub' ) )
                    // InternalAlloyLanguage.g:1542:1: ( 'sub' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSNumericOperatorAccess().getSubEnumLiteralDeclaration_1()); 
                    }
                    // InternalAlloyLanguage.g:1543:1: ( 'sub' )
                    // InternalAlloyLanguage.g:1543:3: 'sub'
                    {
                    match(input,28,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSNumericOperatorAccess().getSubEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAlloyLanguage.g:1548:6: ( ( 'mul' ) )
                    {
                    // InternalAlloyLanguage.g:1548:6: ( ( 'mul' ) )
                    // InternalAlloyLanguage.g:1549:1: ( 'mul' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSNumericOperatorAccess().getMulEnumLiteralDeclaration_2()); 
                    }
                    // InternalAlloyLanguage.g:1550:1: ( 'mul' )
                    // InternalAlloyLanguage.g:1550:3: 'mul'
                    {
                    match(input,29,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSNumericOperatorAccess().getMulEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAlloyLanguage.g:1555:6: ( ( 'rem' ) )
                    {
                    // InternalAlloyLanguage.g:1555:6: ( ( 'rem' ) )
                    // InternalAlloyLanguage.g:1556:1: ( 'rem' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSNumericOperatorAccess().getRemEnumLiteralDeclaration_3()); 
                    }
                    // InternalAlloyLanguage.g:1557:1: ( 'rem' )
                    // InternalAlloyLanguage.g:1557:3: 'rem'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSNumericOperatorAccess().getRemEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAlloyLanguage.g:1562:6: ( ( 'div' ) )
                    {
                    // InternalAlloyLanguage.g:1562:6: ( ( 'div' ) )
                    // InternalAlloyLanguage.g:1563:1: ( 'div' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSNumericOperatorAccess().getDivEnumLiteralDeclaration_4()); 
                    }
                    // InternalAlloyLanguage.g:1564:1: ( 'div' )
                    // InternalAlloyLanguage.g:1564:3: 'div'
                    {
                    match(input,31,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSNumericOperatorAccess().getDivEnumLiteralDeclaration_4()); 
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
    // $ANTLR end "rule__ALSNumericOperator__Alternatives"


    // $ANTLR start "rule__ALSDocument__Group__0"
    // InternalAlloyLanguage.g:1576:1: rule__ALSDocument__Group__0 : rule__ALSDocument__Group__0__Impl rule__ALSDocument__Group__1 ;
    public final void rule__ALSDocument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1580:1: ( rule__ALSDocument__Group__0__Impl rule__ALSDocument__Group__1 )
            // InternalAlloyLanguage.g:1581:2: rule__ALSDocument__Group__0__Impl rule__ALSDocument__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ALSDocument__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSDocument__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDocument__Group__0"


    // $ANTLR start "rule__ALSDocument__Group__0__Impl"
    // InternalAlloyLanguage.g:1588:1: rule__ALSDocument__Group__0__Impl : ( ( ( rule__ALSDocument__Alternatives_0 ) ) ( ( rule__ALSDocument__Alternatives_0 )* ) ) ;
    public final void rule__ALSDocument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1592:1: ( ( ( ( rule__ALSDocument__Alternatives_0 ) ) ( ( rule__ALSDocument__Alternatives_0 )* ) ) )
            // InternalAlloyLanguage.g:1593:1: ( ( ( rule__ALSDocument__Alternatives_0 ) ) ( ( rule__ALSDocument__Alternatives_0 )* ) )
            {
            // InternalAlloyLanguage.g:1593:1: ( ( ( rule__ALSDocument__Alternatives_0 ) ) ( ( rule__ALSDocument__Alternatives_0 )* ) )
            // InternalAlloyLanguage.g:1594:1: ( ( rule__ALSDocument__Alternatives_0 ) ) ( ( rule__ALSDocument__Alternatives_0 )* )
            {
            // InternalAlloyLanguage.g:1594:1: ( ( rule__ALSDocument__Alternatives_0 ) )
            // InternalAlloyLanguage.g:1595:1: ( rule__ALSDocument__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDocumentAccess().getAlternatives_0()); 
            }
            // InternalAlloyLanguage.g:1596:1: ( rule__ALSDocument__Alternatives_0 )
            // InternalAlloyLanguage.g:1596:2: rule__ALSDocument__Alternatives_0
            {
            pushFollow(FOLLOW_4);
            rule__ALSDocument__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDocumentAccess().getAlternatives_0()); 
            }

            }

            // InternalAlloyLanguage.g:1599:1: ( ( rule__ALSDocument__Alternatives_0 )* )
            // InternalAlloyLanguage.g:1600:1: ( rule__ALSDocument__Alternatives_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDocumentAccess().getAlternatives_0()); 
            }
            // InternalAlloyLanguage.g:1601:1: ( rule__ALSDocument__Alternatives_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=21 && LA17_0<=26)||LA17_0==32||LA17_0==36||LA17_0==41||(LA17_0>=44 && LA17_0<=45)||LA17_0==73) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAlloyLanguage.g:1601:2: rule__ALSDocument__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ALSDocument__Alternatives_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDocumentAccess().getAlternatives_0()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDocument__Group__0__Impl"


    // $ANTLR start "rule__ALSDocument__Group__1"
    // InternalAlloyLanguage.g:1612:1: rule__ALSDocument__Group__1 : rule__ALSDocument__Group__1__Impl ;
    public final void rule__ALSDocument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1616:1: ( rule__ALSDocument__Group__1__Impl )
            // InternalAlloyLanguage.g:1617:2: rule__ALSDocument__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSDocument__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDocument__Group__1"


    // $ANTLR start "rule__ALSDocument__Group__1__Impl"
    // InternalAlloyLanguage.g:1623:1: rule__ALSDocument__Group__1__Impl : ( ( rule__ALSDocument__RunCommandAssignment_1 ) ) ;
    public final void rule__ALSDocument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1627:1: ( ( ( rule__ALSDocument__RunCommandAssignment_1 ) ) )
            // InternalAlloyLanguage.g:1628:1: ( ( rule__ALSDocument__RunCommandAssignment_1 ) )
            {
            // InternalAlloyLanguage.g:1628:1: ( ( rule__ALSDocument__RunCommandAssignment_1 ) )
            // InternalAlloyLanguage.g:1629:1: ( rule__ALSDocument__RunCommandAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDocumentAccess().getRunCommandAssignment_1()); 
            }
            // InternalAlloyLanguage.g:1630:1: ( rule__ALSDocument__RunCommandAssignment_1 )
            // InternalAlloyLanguage.g:1630:2: rule__ALSDocument__RunCommandAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSDocument__RunCommandAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDocumentAccess().getRunCommandAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDocument__Group__1__Impl"


    // $ANTLR start "rule__ALSEnumDeclaration__Group__0"
    // InternalAlloyLanguage.g:1644:1: rule__ALSEnumDeclaration__Group__0 : rule__ALSEnumDeclaration__Group__0__Impl rule__ALSEnumDeclaration__Group__1 ;
    public final void rule__ALSEnumDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1648:1: ( rule__ALSEnumDeclaration__Group__0__Impl rule__ALSEnumDeclaration__Group__1 )
            // InternalAlloyLanguage.g:1649:2: rule__ALSEnumDeclaration__Group__0__Impl rule__ALSEnumDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ALSEnumDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSEnumDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__Group__0"


    // $ANTLR start "rule__ALSEnumDeclaration__Group__0__Impl"
    // InternalAlloyLanguage.g:1656:1: rule__ALSEnumDeclaration__Group__0__Impl : ( 'enum' ) ;
    public final void rule__ALSEnumDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1660:1: ( ( 'enum' ) )
            // InternalAlloyLanguage.g:1661:1: ( 'enum' )
            {
            // InternalAlloyLanguage.g:1661:1: ( 'enum' )
            // InternalAlloyLanguage.g:1662:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSEnumDeclarationAccess().getEnumKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSEnumDeclarationAccess().getEnumKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ALSEnumDeclaration__Group__1"
    // InternalAlloyLanguage.g:1675:1: rule__ALSEnumDeclaration__Group__1 : rule__ALSEnumDeclaration__Group__1__Impl rule__ALSEnumDeclaration__Group__2 ;
    public final void rule__ALSEnumDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1679:1: ( rule__ALSEnumDeclaration__Group__1__Impl rule__ALSEnumDeclaration__Group__2 )
            // InternalAlloyLanguage.g:1680:2: rule__ALSEnumDeclaration__Group__1__Impl rule__ALSEnumDeclaration__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ALSEnumDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSEnumDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__Group__1"


    // $ANTLR start "rule__ALSEnumDeclaration__Group__1__Impl"
    // InternalAlloyLanguage.g:1687:1: rule__ALSEnumDeclaration__Group__1__Impl : ( ( rule__ALSEnumDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ALSEnumDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1691:1: ( ( ( rule__ALSEnumDeclaration__NameAssignment_1 ) ) )
            // InternalAlloyLanguage.g:1692:1: ( ( rule__ALSEnumDeclaration__NameAssignment_1 ) )
            {
            // InternalAlloyLanguage.g:1692:1: ( ( rule__ALSEnumDeclaration__NameAssignment_1 ) )
            // InternalAlloyLanguage.g:1693:1: ( rule__ALSEnumDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSEnumDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalAlloyLanguage.g:1694:1: ( rule__ALSEnumDeclaration__NameAssignment_1 )
            // InternalAlloyLanguage.g:1694:2: rule__ALSEnumDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSEnumDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSEnumDeclarationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ALSEnumDeclaration__Group__2"
    // InternalAlloyLanguage.g:1704:1: rule__ALSEnumDeclaration__Group__2 : rule__ALSEnumDeclaration__Group__2__Impl rule__ALSEnumDeclaration__Group__3 ;
    public final void rule__ALSEnumDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1708:1: ( rule__ALSEnumDeclaration__Group__2__Impl rule__ALSEnumDeclaration__Group__3 )
            // InternalAlloyLanguage.g:1709:2: rule__ALSEnumDeclaration__Group__2__Impl rule__ALSEnumDeclaration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ALSEnumDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSEnumDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__Group__2"


    // $ANTLR start "rule__ALSEnumDeclaration__Group__2__Impl"
    // InternalAlloyLanguage.g:1716:1: rule__ALSEnumDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__ALSEnumDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1720:1: ( ( '{' ) )
            // InternalAlloyLanguage.g:1721:1: ( '{' )
            {
            // InternalAlloyLanguage.g:1721:1: ( '{' )
            // InternalAlloyLanguage.g:1722:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ALSEnumDeclaration__Group__3"
    // InternalAlloyLanguage.g:1735:1: rule__ALSEnumDeclaration__Group__3 : rule__ALSEnumDeclaration__Group__3__Impl rule__ALSEnumDeclaration__Group__4 ;
    public final void rule__ALSEnumDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1739:1: ( rule__ALSEnumDeclaration__Group__3__Impl rule__ALSEnumDeclaration__Group__4 )
            // InternalAlloyLanguage.g:1740:2: rule__ALSEnumDeclaration__Group__3__Impl rule__ALSEnumDeclaration__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ALSEnumDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSEnumDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__Group__3"


    // $ANTLR start "rule__ALSEnumDeclaration__Group__3__Impl"
    // InternalAlloyLanguage.g:1747:1: rule__ALSEnumDeclaration__Group__3__Impl : ( ( rule__ALSEnumDeclaration__LiteralAssignment_3 ) ) ;
    public final void rule__ALSEnumDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1751:1: ( ( ( rule__ALSEnumDeclaration__LiteralAssignment_3 ) ) )
            // InternalAlloyLanguage.g:1752:1: ( ( rule__ALSEnumDeclaration__LiteralAssignment_3 ) )
            {
            // InternalAlloyLanguage.g:1752:1: ( ( rule__ALSEnumDeclaration__LiteralAssignment_3 ) )
            // InternalAlloyLanguage.g:1753:1: ( rule__ALSEnumDeclaration__LiteralAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSEnumDeclarationAccess().getLiteralAssignment_3()); 
            }
            // InternalAlloyLanguage.g:1754:1: ( rule__ALSEnumDeclaration__LiteralAssignment_3 )
            // InternalAlloyLanguage.g:1754:2: rule__ALSEnumDeclaration__LiteralAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ALSEnumDeclaration__LiteralAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSEnumDeclarationAccess().getLiteralAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ALSEnumDeclaration__Group__4"
    // InternalAlloyLanguage.g:1764:1: rule__ALSEnumDeclaration__Group__4 : rule__ALSEnumDeclaration__Group__4__Impl rule__ALSEnumDeclaration__Group__5 ;
    public final void rule__ALSEnumDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1768:1: ( rule__ALSEnumDeclaration__Group__4__Impl rule__ALSEnumDeclaration__Group__5 )
            // InternalAlloyLanguage.g:1769:2: rule__ALSEnumDeclaration__Group__4__Impl rule__ALSEnumDeclaration__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ALSEnumDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSEnumDeclaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__Group__4"


    // $ANTLR start "rule__ALSEnumDeclaration__Group__4__Impl"
    // InternalAlloyLanguage.g:1776:1: rule__ALSEnumDeclaration__Group__4__Impl : ( ( rule__ALSEnumDeclaration__Group_4__0 )* ) ;
    public final void rule__ALSEnumDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1780:1: ( ( ( rule__ALSEnumDeclaration__Group_4__0 )* ) )
            // InternalAlloyLanguage.g:1781:1: ( ( rule__ALSEnumDeclaration__Group_4__0 )* )
            {
            // InternalAlloyLanguage.g:1781:1: ( ( rule__ALSEnumDeclaration__Group_4__0 )* )
            // InternalAlloyLanguage.g:1782:1: ( rule__ALSEnumDeclaration__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSEnumDeclarationAccess().getGroup_4()); 
            }
            // InternalAlloyLanguage.g:1783:1: ( rule__ALSEnumDeclaration__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAlloyLanguage.g:1783:2: rule__ALSEnumDeclaration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ALSEnumDeclaration__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSEnumDeclarationAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ALSEnumDeclaration__Group__5"
    // InternalAlloyLanguage.g:1793:1: rule__ALSEnumDeclaration__Group__5 : rule__ALSEnumDeclaration__Group__5__Impl ;
    public final void rule__ALSEnumDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1797:1: ( rule__ALSEnumDeclaration__Group__5__Impl )
            // InternalAlloyLanguage.g:1798:2: rule__ALSEnumDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSEnumDeclaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__Group__5"


    // $ANTLR start "rule__ALSEnumDeclaration__Group__5__Impl"
    // InternalAlloyLanguage.g:1804:1: rule__ALSEnumDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__ALSEnumDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1808:1: ( ( '}' ) )
            // InternalAlloyLanguage.g:1809:1: ( '}' )
            {
            // InternalAlloyLanguage.g:1809:1: ( '}' )
            // InternalAlloyLanguage.g:1810:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSEnumDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSEnumDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ALSEnumDeclaration__Group_4__0"
    // InternalAlloyLanguage.g:1835:1: rule__ALSEnumDeclaration__Group_4__0 : rule__ALSEnumDeclaration__Group_4__0__Impl rule__ALSEnumDeclaration__Group_4__1 ;
    public final void rule__ALSEnumDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1839:1: ( rule__ALSEnumDeclaration__Group_4__0__Impl rule__ALSEnumDeclaration__Group_4__1 )
            // InternalAlloyLanguage.g:1840:2: rule__ALSEnumDeclaration__Group_4__0__Impl rule__ALSEnumDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ALSEnumDeclaration__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSEnumDeclaration__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__Group_4__0"


    // $ANTLR start "rule__ALSEnumDeclaration__Group_4__0__Impl"
    // InternalAlloyLanguage.g:1847:1: rule__ALSEnumDeclaration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ALSEnumDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1851:1: ( ( ',' ) )
            // InternalAlloyLanguage.g:1852:1: ( ',' )
            {
            // InternalAlloyLanguage.g:1852:1: ( ',' )
            // InternalAlloyLanguage.g:1853:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSEnumDeclarationAccess().getCommaKeyword_4_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSEnumDeclarationAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__ALSEnumDeclaration__Group_4__1"
    // InternalAlloyLanguage.g:1866:1: rule__ALSEnumDeclaration__Group_4__1 : rule__ALSEnumDeclaration__Group_4__1__Impl ;
    public final void rule__ALSEnumDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1870:1: ( rule__ALSEnumDeclaration__Group_4__1__Impl )
            // InternalAlloyLanguage.g:1871:2: rule__ALSEnumDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSEnumDeclaration__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__Group_4__1"


    // $ANTLR start "rule__ALSEnumDeclaration__Group_4__1__Impl"
    // InternalAlloyLanguage.g:1877:1: rule__ALSEnumDeclaration__Group_4__1__Impl : ( ( rule__ALSEnumDeclaration__LiteralAssignment_4_1 ) ) ;
    public final void rule__ALSEnumDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1881:1: ( ( ( rule__ALSEnumDeclaration__LiteralAssignment_4_1 ) ) )
            // InternalAlloyLanguage.g:1882:1: ( ( rule__ALSEnumDeclaration__LiteralAssignment_4_1 ) )
            {
            // InternalAlloyLanguage.g:1882:1: ( ( rule__ALSEnumDeclaration__LiteralAssignment_4_1 ) )
            // InternalAlloyLanguage.g:1883:1: ( rule__ALSEnumDeclaration__LiteralAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSEnumDeclarationAccess().getLiteralAssignment_4_1()); 
            }
            // InternalAlloyLanguage.g:1884:1: ( rule__ALSEnumDeclaration__LiteralAssignment_4_1 )
            // InternalAlloyLanguage.g:1884:2: rule__ALSEnumDeclaration__LiteralAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSEnumDeclaration__LiteralAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSEnumDeclarationAccess().getLiteralAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group__0"
    // InternalAlloyLanguage.g:1898:1: rule__ALSSignatureBody__Group__0 : rule__ALSSignatureBody__Group__0__Impl rule__ALSSignatureBody__Group__1 ;
    public final void rule__ALSSignatureBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1902:1: ( rule__ALSSignatureBody__Group__0__Impl rule__ALSSignatureBody__Group__1 )
            // InternalAlloyLanguage.g:1903:2: rule__ALSSignatureBody__Group__0__Impl rule__ALSSignatureBody__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ALSSignatureBody__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group__0"


    // $ANTLR start "rule__ALSSignatureBody__Group__0__Impl"
    // InternalAlloyLanguage.g:1910:1: rule__ALSSignatureBody__Group__0__Impl : ( ( rule__ALSSignatureBody__UnorderedGroup_0 ) ) ;
    public final void rule__ALSSignatureBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1914:1: ( ( ( rule__ALSSignatureBody__UnorderedGroup_0 ) ) )
            // InternalAlloyLanguage.g:1915:1: ( ( rule__ALSSignatureBody__UnorderedGroup_0 ) )
            {
            // InternalAlloyLanguage.g:1915:1: ( ( rule__ALSSignatureBody__UnorderedGroup_0 ) )
            // InternalAlloyLanguage.g:1916:1: ( rule__ALSSignatureBody__UnorderedGroup_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0()); 
            }
            // InternalAlloyLanguage.g:1917:1: ( rule__ALSSignatureBody__UnorderedGroup_0 )
            // InternalAlloyLanguage.g:1917:2: rule__ALSSignatureBody__UnorderedGroup_0
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__UnorderedGroup_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group__0__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group__1"
    // InternalAlloyLanguage.g:1927:1: rule__ALSSignatureBody__Group__1 : rule__ALSSignatureBody__Group__1__Impl rule__ALSSignatureBody__Group__2 ;
    public final void rule__ALSSignatureBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1931:1: ( rule__ALSSignatureBody__Group__1__Impl rule__ALSSignatureBody__Group__2 )
            // InternalAlloyLanguage.g:1932:2: rule__ALSSignatureBody__Group__1__Impl rule__ALSSignatureBody__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ALSSignatureBody__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group__1"


    // $ANTLR start "rule__ALSSignatureBody__Group__1__Impl"
    // InternalAlloyLanguage.g:1939:1: rule__ALSSignatureBody__Group__1__Impl : ( 'sig' ) ;
    public final void rule__ALSSignatureBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1943:1: ( ( 'sig' ) )
            // InternalAlloyLanguage.g:1944:1: ( 'sig' )
            {
            // InternalAlloyLanguage.g:1944:1: ( 'sig' )
            // InternalAlloyLanguage.g:1945:1: 'sig'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getSigKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getSigKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group__1__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group__2"
    // InternalAlloyLanguage.g:1958:1: rule__ALSSignatureBody__Group__2 : rule__ALSSignatureBody__Group__2__Impl rule__ALSSignatureBody__Group__3 ;
    public final void rule__ALSSignatureBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1962:1: ( rule__ALSSignatureBody__Group__2__Impl rule__ALSSignatureBody__Group__3 )
            // InternalAlloyLanguage.g:1963:2: rule__ALSSignatureBody__Group__2__Impl rule__ALSSignatureBody__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ALSSignatureBody__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group__2"


    // $ANTLR start "rule__ALSSignatureBody__Group__2__Impl"
    // InternalAlloyLanguage.g:1970:1: rule__ALSSignatureBody__Group__2__Impl : ( ( rule__ALSSignatureBody__DeclarationsAssignment_2 ) ) ;
    public final void rule__ALSSignatureBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1974:1: ( ( ( rule__ALSSignatureBody__DeclarationsAssignment_2 ) ) )
            // InternalAlloyLanguage.g:1975:1: ( ( rule__ALSSignatureBody__DeclarationsAssignment_2 ) )
            {
            // InternalAlloyLanguage.g:1975:1: ( ( rule__ALSSignatureBody__DeclarationsAssignment_2 ) )
            // InternalAlloyLanguage.g:1976:1: ( rule__ALSSignatureBody__DeclarationsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getDeclarationsAssignment_2()); 
            }
            // InternalAlloyLanguage.g:1977:1: ( rule__ALSSignatureBody__DeclarationsAssignment_2 )
            // InternalAlloyLanguage.g:1977:2: rule__ALSSignatureBody__DeclarationsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__DeclarationsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getDeclarationsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group__2__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group__3"
    // InternalAlloyLanguage.g:1987:1: rule__ALSSignatureBody__Group__3 : rule__ALSSignatureBody__Group__3__Impl rule__ALSSignatureBody__Group__4 ;
    public final void rule__ALSSignatureBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:1991:1: ( rule__ALSSignatureBody__Group__3__Impl rule__ALSSignatureBody__Group__4 )
            // InternalAlloyLanguage.g:1992:2: rule__ALSSignatureBody__Group__3__Impl rule__ALSSignatureBody__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ALSSignatureBody__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group__3"


    // $ANTLR start "rule__ALSSignatureBody__Group__3__Impl"
    // InternalAlloyLanguage.g:1999:1: rule__ALSSignatureBody__Group__3__Impl : ( ( rule__ALSSignatureBody__Group_3__0 )* ) ;
    public final void rule__ALSSignatureBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2003:1: ( ( ( rule__ALSSignatureBody__Group_3__0 )* ) )
            // InternalAlloyLanguage.g:2004:1: ( ( rule__ALSSignatureBody__Group_3__0 )* )
            {
            // InternalAlloyLanguage.g:2004:1: ( ( rule__ALSSignatureBody__Group_3__0 )* )
            // InternalAlloyLanguage.g:2005:1: ( rule__ALSSignatureBody__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getGroup_3()); 
            }
            // InternalAlloyLanguage.g:2006:1: ( rule__ALSSignatureBody__Group_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAlloyLanguage.g:2006:2: rule__ALSSignatureBody__Group_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ALSSignatureBody__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group__3__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group__4"
    // InternalAlloyLanguage.g:2016:1: rule__ALSSignatureBody__Group__4 : rule__ALSSignatureBody__Group__4__Impl rule__ALSSignatureBody__Group__5 ;
    public final void rule__ALSSignatureBody__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2020:1: ( rule__ALSSignatureBody__Group__4__Impl rule__ALSSignatureBody__Group__5 )
            // InternalAlloyLanguage.g:2021:2: rule__ALSSignatureBody__Group__4__Impl rule__ALSSignatureBody__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__ALSSignatureBody__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group__4"


    // $ANTLR start "rule__ALSSignatureBody__Group__4__Impl"
    // InternalAlloyLanguage.g:2028:1: rule__ALSSignatureBody__Group__4__Impl : ( ( rule__ALSSignatureBody__Alternatives_4 )? ) ;
    public final void rule__ALSSignatureBody__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2032:1: ( ( ( rule__ALSSignatureBody__Alternatives_4 )? ) )
            // InternalAlloyLanguage.g:2033:1: ( ( rule__ALSSignatureBody__Alternatives_4 )? )
            {
            // InternalAlloyLanguage.g:2033:1: ( ( rule__ALSSignatureBody__Alternatives_4 )? )
            // InternalAlloyLanguage.g:2034:1: ( rule__ALSSignatureBody__Alternatives_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getAlternatives_4()); 
            }
            // InternalAlloyLanguage.g:2035:1: ( rule__ALSSignatureBody__Alternatives_4 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=37 && LA20_0<=38)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAlloyLanguage.g:2035:2: rule__ALSSignatureBody__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSSignatureBody__Alternatives_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getAlternatives_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group__4__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group__5"
    // InternalAlloyLanguage.g:2045:1: rule__ALSSignatureBody__Group__5 : rule__ALSSignatureBody__Group__5__Impl rule__ALSSignatureBody__Group__6 ;
    public final void rule__ALSSignatureBody__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2049:1: ( rule__ALSSignatureBody__Group__5__Impl rule__ALSSignatureBody__Group__6 )
            // InternalAlloyLanguage.g:2050:2: rule__ALSSignatureBody__Group__5__Impl rule__ALSSignatureBody__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__ALSSignatureBody__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group__5"


    // $ANTLR start "rule__ALSSignatureBody__Group__5__Impl"
    // InternalAlloyLanguage.g:2057:1: rule__ALSSignatureBody__Group__5__Impl : ( '{' ) ;
    public final void rule__ALSSignatureBody__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2061:1: ( ( '{' ) )
            // InternalAlloyLanguage.g:2062:1: ( '{' )
            {
            // InternalAlloyLanguage.g:2062:1: ( '{' )
            // InternalAlloyLanguage.g:2063:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getLeftCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group__5__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group__6"
    // InternalAlloyLanguage.g:2076:1: rule__ALSSignatureBody__Group__6 : rule__ALSSignatureBody__Group__6__Impl rule__ALSSignatureBody__Group__7 ;
    public final void rule__ALSSignatureBody__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2080:1: ( rule__ALSSignatureBody__Group__6__Impl rule__ALSSignatureBody__Group__7 )
            // InternalAlloyLanguage.g:2081:2: rule__ALSSignatureBody__Group__6__Impl rule__ALSSignatureBody__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__ALSSignatureBody__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group__6"


    // $ANTLR start "rule__ALSSignatureBody__Group__6__Impl"
    // InternalAlloyLanguage.g:2088:1: rule__ALSSignatureBody__Group__6__Impl : ( ( rule__ALSSignatureBody__Group_6__0 )? ) ;
    public final void rule__ALSSignatureBody__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2092:1: ( ( ( rule__ALSSignatureBody__Group_6__0 )? ) )
            // InternalAlloyLanguage.g:2093:1: ( ( rule__ALSSignatureBody__Group_6__0 )? )
            {
            // InternalAlloyLanguage.g:2093:1: ( ( rule__ALSSignatureBody__Group_6__0 )? )
            // InternalAlloyLanguage.g:2094:1: ( rule__ALSSignatureBody__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getGroup_6()); 
            }
            // InternalAlloyLanguage.g:2095:1: ( rule__ALSSignatureBody__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAlloyLanguage.g:2095:2: rule__ALSSignatureBody__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSSignatureBody__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group__6__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group__7"
    // InternalAlloyLanguage.g:2105:1: rule__ALSSignatureBody__Group__7 : rule__ALSSignatureBody__Group__7__Impl ;
    public final void rule__ALSSignatureBody__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2109:1: ( rule__ALSSignatureBody__Group__7__Impl )
            // InternalAlloyLanguage.g:2110:2: rule__ALSSignatureBody__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group__7"


    // $ANTLR start "rule__ALSSignatureBody__Group__7__Impl"
    // InternalAlloyLanguage.g:2116:1: rule__ALSSignatureBody__Group__7__Impl : ( '}' ) ;
    public final void rule__ALSSignatureBody__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2120:1: ( ( '}' ) )
            // InternalAlloyLanguage.g:2121:1: ( '}' )
            {
            // InternalAlloyLanguage.g:2121:1: ( '}' )
            // InternalAlloyLanguage.g:2122:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group__7__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group_3__0"
    // InternalAlloyLanguage.g:2151:1: rule__ALSSignatureBody__Group_3__0 : rule__ALSSignatureBody__Group_3__0__Impl rule__ALSSignatureBody__Group_3__1 ;
    public final void rule__ALSSignatureBody__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2155:1: ( rule__ALSSignatureBody__Group_3__0__Impl rule__ALSSignatureBody__Group_3__1 )
            // InternalAlloyLanguage.g:2156:2: rule__ALSSignatureBody__Group_3__0__Impl rule__ALSSignatureBody__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ALSSignatureBody__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_3__0"


    // $ANTLR start "rule__ALSSignatureBody__Group_3__0__Impl"
    // InternalAlloyLanguage.g:2163:1: rule__ALSSignatureBody__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ALSSignatureBody__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2167:1: ( ( ',' ) )
            // InternalAlloyLanguage.g:2168:1: ( ',' )
            {
            // InternalAlloyLanguage.g:2168:1: ( ',' )
            // InternalAlloyLanguage.g:2169:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getCommaKeyword_3_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_3__0__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group_3__1"
    // InternalAlloyLanguage.g:2182:1: rule__ALSSignatureBody__Group_3__1 : rule__ALSSignatureBody__Group_3__1__Impl ;
    public final void rule__ALSSignatureBody__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2186:1: ( rule__ALSSignatureBody__Group_3__1__Impl )
            // InternalAlloyLanguage.g:2187:2: rule__ALSSignatureBody__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_3__1"


    // $ANTLR start "rule__ALSSignatureBody__Group_3__1__Impl"
    // InternalAlloyLanguage.g:2193:1: rule__ALSSignatureBody__Group_3__1__Impl : ( ( rule__ALSSignatureBody__DeclarationsAssignment_3_1 ) ) ;
    public final void rule__ALSSignatureBody__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2197:1: ( ( ( rule__ALSSignatureBody__DeclarationsAssignment_3_1 ) ) )
            // InternalAlloyLanguage.g:2198:1: ( ( rule__ALSSignatureBody__DeclarationsAssignment_3_1 ) )
            {
            // InternalAlloyLanguage.g:2198:1: ( ( rule__ALSSignatureBody__DeclarationsAssignment_3_1 ) )
            // InternalAlloyLanguage.g:2199:1: ( rule__ALSSignatureBody__DeclarationsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getDeclarationsAssignment_3_1()); 
            }
            // InternalAlloyLanguage.g:2200:1: ( rule__ALSSignatureBody__DeclarationsAssignment_3_1 )
            // InternalAlloyLanguage.g:2200:2: rule__ALSSignatureBody__DeclarationsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__DeclarationsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getDeclarationsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_3__1__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group_4_0__0"
    // InternalAlloyLanguage.g:2214:1: rule__ALSSignatureBody__Group_4_0__0 : rule__ALSSignatureBody__Group_4_0__0__Impl rule__ALSSignatureBody__Group_4_0__1 ;
    public final void rule__ALSSignatureBody__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2218:1: ( rule__ALSSignatureBody__Group_4_0__0__Impl rule__ALSSignatureBody__Group_4_0__1 )
            // InternalAlloyLanguage.g:2219:2: rule__ALSSignatureBody__Group_4_0__0__Impl rule__ALSSignatureBody__Group_4_0__1
            {
            pushFollow(FOLLOW_5);
            rule__ALSSignatureBody__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group_4_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_4_0__0"


    // $ANTLR start "rule__ALSSignatureBody__Group_4_0__0__Impl"
    // InternalAlloyLanguage.g:2226:1: rule__ALSSignatureBody__Group_4_0__0__Impl : ( 'extends' ) ;
    public final void rule__ALSSignatureBody__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2230:1: ( ( 'extends' ) )
            // InternalAlloyLanguage.g:2231:1: ( 'extends' )
            {
            // InternalAlloyLanguage.g:2231:1: ( 'extends' )
            // InternalAlloyLanguage.g:2232:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getExtendsKeyword_4_0_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getExtendsKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_4_0__0__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group_4_0__1"
    // InternalAlloyLanguage.g:2245:1: rule__ALSSignatureBody__Group_4_0__1 : rule__ALSSignatureBody__Group_4_0__1__Impl ;
    public final void rule__ALSSignatureBody__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2249:1: ( rule__ALSSignatureBody__Group_4_0__1__Impl )
            // InternalAlloyLanguage.g:2250:2: rule__ALSSignatureBody__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_4_0__1"


    // $ANTLR start "rule__ALSSignatureBody__Group_4_0__1__Impl"
    // InternalAlloyLanguage.g:2256:1: rule__ALSSignatureBody__Group_4_0__1__Impl : ( ( rule__ALSSignatureBody__SupertypeAssignment_4_0_1 ) ) ;
    public final void rule__ALSSignatureBody__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2260:1: ( ( ( rule__ALSSignatureBody__SupertypeAssignment_4_0_1 ) ) )
            // InternalAlloyLanguage.g:2261:1: ( ( rule__ALSSignatureBody__SupertypeAssignment_4_0_1 ) )
            {
            // InternalAlloyLanguage.g:2261:1: ( ( rule__ALSSignatureBody__SupertypeAssignment_4_0_1 ) )
            // InternalAlloyLanguage.g:2262:1: ( rule__ALSSignatureBody__SupertypeAssignment_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getSupertypeAssignment_4_0_1()); 
            }
            // InternalAlloyLanguage.g:2263:1: ( rule__ALSSignatureBody__SupertypeAssignment_4_0_1 )
            // InternalAlloyLanguage.g:2263:2: rule__ALSSignatureBody__SupertypeAssignment_4_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__SupertypeAssignment_4_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getSupertypeAssignment_4_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_4_0__1__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group_4_1__0"
    // InternalAlloyLanguage.g:2277:1: rule__ALSSignatureBody__Group_4_1__0 : rule__ALSSignatureBody__Group_4_1__0__Impl rule__ALSSignatureBody__Group_4_1__1 ;
    public final void rule__ALSSignatureBody__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2281:1: ( rule__ALSSignatureBody__Group_4_1__0__Impl rule__ALSSignatureBody__Group_4_1__1 )
            // InternalAlloyLanguage.g:2282:2: rule__ALSSignatureBody__Group_4_1__0__Impl rule__ALSSignatureBody__Group_4_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ALSSignatureBody__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_4_1__0"


    // $ANTLR start "rule__ALSSignatureBody__Group_4_1__0__Impl"
    // InternalAlloyLanguage.g:2289:1: rule__ALSSignatureBody__Group_4_1__0__Impl : ( 'in' ) ;
    public final void rule__ALSSignatureBody__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2293:1: ( ( 'in' ) )
            // InternalAlloyLanguage.g:2294:1: ( 'in' )
            {
            // InternalAlloyLanguage.g:2294:1: ( 'in' )
            // InternalAlloyLanguage.g:2295:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getInKeyword_4_1_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getInKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_4_1__0__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group_4_1__1"
    // InternalAlloyLanguage.g:2308:1: rule__ALSSignatureBody__Group_4_1__1 : rule__ALSSignatureBody__Group_4_1__1__Impl rule__ALSSignatureBody__Group_4_1__2 ;
    public final void rule__ALSSignatureBody__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2312:1: ( rule__ALSSignatureBody__Group_4_1__1__Impl rule__ALSSignatureBody__Group_4_1__2 )
            // InternalAlloyLanguage.g:2313:2: rule__ALSSignatureBody__Group_4_1__1__Impl rule__ALSSignatureBody__Group_4_1__2
            {
            pushFollow(FOLLOW_12);
            rule__ALSSignatureBody__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group_4_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_4_1__1"


    // $ANTLR start "rule__ALSSignatureBody__Group_4_1__1__Impl"
    // InternalAlloyLanguage.g:2320:1: rule__ALSSignatureBody__Group_4_1__1__Impl : ( ( rule__ALSSignatureBody__SupersetAssignment_4_1_1 ) ) ;
    public final void rule__ALSSignatureBody__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2324:1: ( ( ( rule__ALSSignatureBody__SupersetAssignment_4_1_1 ) ) )
            // InternalAlloyLanguage.g:2325:1: ( ( rule__ALSSignatureBody__SupersetAssignment_4_1_1 ) )
            {
            // InternalAlloyLanguage.g:2325:1: ( ( rule__ALSSignatureBody__SupersetAssignment_4_1_1 ) )
            // InternalAlloyLanguage.g:2326:1: ( rule__ALSSignatureBody__SupersetAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getSupersetAssignment_4_1_1()); 
            }
            // InternalAlloyLanguage.g:2327:1: ( rule__ALSSignatureBody__SupersetAssignment_4_1_1 )
            // InternalAlloyLanguage.g:2327:2: rule__ALSSignatureBody__SupersetAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__SupersetAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getSupersetAssignment_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_4_1__1__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group_4_1__2"
    // InternalAlloyLanguage.g:2337:1: rule__ALSSignatureBody__Group_4_1__2 : rule__ALSSignatureBody__Group_4_1__2__Impl ;
    public final void rule__ALSSignatureBody__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2341:1: ( rule__ALSSignatureBody__Group_4_1__2__Impl )
            // InternalAlloyLanguage.g:2342:2: rule__ALSSignatureBody__Group_4_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group_4_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_4_1__2"


    // $ANTLR start "rule__ALSSignatureBody__Group_4_1__2__Impl"
    // InternalAlloyLanguage.g:2348:1: rule__ALSSignatureBody__Group_4_1__2__Impl : ( ( rule__ALSSignatureBody__Group_4_1_2__0 )* ) ;
    public final void rule__ALSSignatureBody__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2352:1: ( ( ( rule__ALSSignatureBody__Group_4_1_2__0 )* ) )
            // InternalAlloyLanguage.g:2353:1: ( ( rule__ALSSignatureBody__Group_4_1_2__0 )* )
            {
            // InternalAlloyLanguage.g:2353:1: ( ( rule__ALSSignatureBody__Group_4_1_2__0 )* )
            // InternalAlloyLanguage.g:2354:1: ( rule__ALSSignatureBody__Group_4_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getGroup_4_1_2()); 
            }
            // InternalAlloyLanguage.g:2355:1: ( rule__ALSSignatureBody__Group_4_1_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==39) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAlloyLanguage.g:2355:2: rule__ALSSignatureBody__Group_4_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ALSSignatureBody__Group_4_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getGroup_4_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_4_1__2__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group_4_1_2__0"
    // InternalAlloyLanguage.g:2371:1: rule__ALSSignatureBody__Group_4_1_2__0 : rule__ALSSignatureBody__Group_4_1_2__0__Impl rule__ALSSignatureBody__Group_4_1_2__1 ;
    public final void rule__ALSSignatureBody__Group_4_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2375:1: ( rule__ALSSignatureBody__Group_4_1_2__0__Impl rule__ALSSignatureBody__Group_4_1_2__1 )
            // InternalAlloyLanguage.g:2376:2: rule__ALSSignatureBody__Group_4_1_2__0__Impl rule__ALSSignatureBody__Group_4_1_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ALSSignatureBody__Group_4_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group_4_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_4_1_2__0"


    // $ANTLR start "rule__ALSSignatureBody__Group_4_1_2__0__Impl"
    // InternalAlloyLanguage.g:2383:1: rule__ALSSignatureBody__Group_4_1_2__0__Impl : ( '+' ) ;
    public final void rule__ALSSignatureBody__Group_4_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2387:1: ( ( '+' ) )
            // InternalAlloyLanguage.g:2388:1: ( '+' )
            {
            // InternalAlloyLanguage.g:2388:1: ( '+' )
            // InternalAlloyLanguage.g:2389:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getPlusSignKeyword_4_1_2_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getPlusSignKeyword_4_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_4_1_2__0__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group_4_1_2__1"
    // InternalAlloyLanguage.g:2402:1: rule__ALSSignatureBody__Group_4_1_2__1 : rule__ALSSignatureBody__Group_4_1_2__1__Impl ;
    public final void rule__ALSSignatureBody__Group_4_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2406:1: ( rule__ALSSignatureBody__Group_4_1_2__1__Impl )
            // InternalAlloyLanguage.g:2407:2: rule__ALSSignatureBody__Group_4_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group_4_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_4_1_2__1"


    // $ANTLR start "rule__ALSSignatureBody__Group_4_1_2__1__Impl"
    // InternalAlloyLanguage.g:2413:1: rule__ALSSignatureBody__Group_4_1_2__1__Impl : ( ( rule__ALSSignatureBody__SupersetAssignment_4_1_2_1 ) ) ;
    public final void rule__ALSSignatureBody__Group_4_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2417:1: ( ( ( rule__ALSSignatureBody__SupersetAssignment_4_1_2_1 ) ) )
            // InternalAlloyLanguage.g:2418:1: ( ( rule__ALSSignatureBody__SupersetAssignment_4_1_2_1 ) )
            {
            // InternalAlloyLanguage.g:2418:1: ( ( rule__ALSSignatureBody__SupersetAssignment_4_1_2_1 ) )
            // InternalAlloyLanguage.g:2419:1: ( rule__ALSSignatureBody__SupersetAssignment_4_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getSupersetAssignment_4_1_2_1()); 
            }
            // InternalAlloyLanguage.g:2420:1: ( rule__ALSSignatureBody__SupersetAssignment_4_1_2_1 )
            // InternalAlloyLanguage.g:2420:2: rule__ALSSignatureBody__SupersetAssignment_4_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__SupersetAssignment_4_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getSupersetAssignment_4_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_4_1_2__1__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group_6__0"
    // InternalAlloyLanguage.g:2434:1: rule__ALSSignatureBody__Group_6__0 : rule__ALSSignatureBody__Group_6__0__Impl rule__ALSSignatureBody__Group_6__1 ;
    public final void rule__ALSSignatureBody__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2438:1: ( rule__ALSSignatureBody__Group_6__0__Impl rule__ALSSignatureBody__Group_6__1 )
            // InternalAlloyLanguage.g:2439:2: rule__ALSSignatureBody__Group_6__0__Impl rule__ALSSignatureBody__Group_6__1
            {
            pushFollow(FOLLOW_14);
            rule__ALSSignatureBody__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_6__0"


    // $ANTLR start "rule__ALSSignatureBody__Group_6__0__Impl"
    // InternalAlloyLanguage.g:2446:1: rule__ALSSignatureBody__Group_6__0__Impl : ( ( rule__ALSSignatureBody__FieldsAssignment_6_0 ) ) ;
    public final void rule__ALSSignatureBody__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2450:1: ( ( ( rule__ALSSignatureBody__FieldsAssignment_6_0 ) ) )
            // InternalAlloyLanguage.g:2451:1: ( ( rule__ALSSignatureBody__FieldsAssignment_6_0 ) )
            {
            // InternalAlloyLanguage.g:2451:1: ( ( rule__ALSSignatureBody__FieldsAssignment_6_0 ) )
            // InternalAlloyLanguage.g:2452:1: ( rule__ALSSignatureBody__FieldsAssignment_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getFieldsAssignment_6_0()); 
            }
            // InternalAlloyLanguage.g:2453:1: ( rule__ALSSignatureBody__FieldsAssignment_6_0 )
            // InternalAlloyLanguage.g:2453:2: rule__ALSSignatureBody__FieldsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__FieldsAssignment_6_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getFieldsAssignment_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_6__0__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group_6__1"
    // InternalAlloyLanguage.g:2463:1: rule__ALSSignatureBody__Group_6__1 : rule__ALSSignatureBody__Group_6__1__Impl ;
    public final void rule__ALSSignatureBody__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2467:1: ( rule__ALSSignatureBody__Group_6__1__Impl )
            // InternalAlloyLanguage.g:2468:2: rule__ALSSignatureBody__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_6__1"


    // $ANTLR start "rule__ALSSignatureBody__Group_6__1__Impl"
    // InternalAlloyLanguage.g:2474:1: rule__ALSSignatureBody__Group_6__1__Impl : ( ( rule__ALSSignatureBody__Group_6_1__0 )* ) ;
    public final void rule__ALSSignatureBody__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2478:1: ( ( ( rule__ALSSignatureBody__Group_6_1__0 )* ) )
            // InternalAlloyLanguage.g:2479:1: ( ( rule__ALSSignatureBody__Group_6_1__0 )* )
            {
            // InternalAlloyLanguage.g:2479:1: ( ( rule__ALSSignatureBody__Group_6_1__0 )* )
            // InternalAlloyLanguage.g:2480:1: ( rule__ALSSignatureBody__Group_6_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getGroup_6_1()); 
            }
            // InternalAlloyLanguage.g:2481:1: ( rule__ALSSignatureBody__Group_6_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAlloyLanguage.g:2481:2: rule__ALSSignatureBody__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ALSSignatureBody__Group_6_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getGroup_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_6__1__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group_6_1__0"
    // InternalAlloyLanguage.g:2495:1: rule__ALSSignatureBody__Group_6_1__0 : rule__ALSSignatureBody__Group_6_1__0__Impl rule__ALSSignatureBody__Group_6_1__1 ;
    public final void rule__ALSSignatureBody__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2499:1: ( rule__ALSSignatureBody__Group_6_1__0__Impl rule__ALSSignatureBody__Group_6_1__1 )
            // InternalAlloyLanguage.g:2500:2: rule__ALSSignatureBody__Group_6_1__0__Impl rule__ALSSignatureBody__Group_6_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ALSSignatureBody__Group_6_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group_6_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_6_1__0"


    // $ANTLR start "rule__ALSSignatureBody__Group_6_1__0__Impl"
    // InternalAlloyLanguage.g:2507:1: rule__ALSSignatureBody__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__ALSSignatureBody__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2511:1: ( ( ',' ) )
            // InternalAlloyLanguage.g:2512:1: ( ',' )
            {
            // InternalAlloyLanguage.g:2512:1: ( ',' )
            // InternalAlloyLanguage.g:2513:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getCommaKeyword_6_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getCommaKeyword_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_6_1__0__Impl"


    // $ANTLR start "rule__ALSSignatureBody__Group_6_1__1"
    // InternalAlloyLanguage.g:2526:1: rule__ALSSignatureBody__Group_6_1__1 : rule__ALSSignatureBody__Group_6_1__1__Impl ;
    public final void rule__ALSSignatureBody__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2530:1: ( rule__ALSSignatureBody__Group_6_1__1__Impl )
            // InternalAlloyLanguage.g:2531:2: rule__ALSSignatureBody__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__Group_6_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_6_1__1"


    // $ANTLR start "rule__ALSSignatureBody__Group_6_1__1__Impl"
    // InternalAlloyLanguage.g:2537:1: rule__ALSSignatureBody__Group_6_1__1__Impl : ( ( rule__ALSSignatureBody__FieldsAssignment_6_1_1 ) ) ;
    public final void rule__ALSSignatureBody__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2541:1: ( ( ( rule__ALSSignatureBody__FieldsAssignment_6_1_1 ) ) )
            // InternalAlloyLanguage.g:2542:1: ( ( rule__ALSSignatureBody__FieldsAssignment_6_1_1 ) )
            {
            // InternalAlloyLanguage.g:2542:1: ( ( rule__ALSSignatureBody__FieldsAssignment_6_1_1 ) )
            // InternalAlloyLanguage.g:2543:1: ( rule__ALSSignatureBody__FieldsAssignment_6_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getFieldsAssignment_6_1_1()); 
            }
            // InternalAlloyLanguage.g:2544:1: ( rule__ALSSignatureBody__FieldsAssignment_6_1_1 )
            // InternalAlloyLanguage.g:2544:2: rule__ALSSignatureBody__FieldsAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__FieldsAssignment_6_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getFieldsAssignment_6_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__Group_6_1__1__Impl"


    // $ANTLR start "rule__ALSFieldDeclaration__Group__0"
    // InternalAlloyLanguage.g:2558:1: rule__ALSFieldDeclaration__Group__0 : rule__ALSFieldDeclaration__Group__0__Impl rule__ALSFieldDeclaration__Group__1 ;
    public final void rule__ALSFieldDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2562:1: ( rule__ALSFieldDeclaration__Group__0__Impl rule__ALSFieldDeclaration__Group__1 )
            // InternalAlloyLanguage.g:2563:2: rule__ALSFieldDeclaration__Group__0__Impl rule__ALSFieldDeclaration__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ALSFieldDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFieldDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFieldDeclaration__Group__0"


    // $ANTLR start "rule__ALSFieldDeclaration__Group__0__Impl"
    // InternalAlloyLanguage.g:2570:1: rule__ALSFieldDeclaration__Group__0__Impl : ( ( rule__ALSFieldDeclaration__NameAssignment_0 ) ) ;
    public final void rule__ALSFieldDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2574:1: ( ( ( rule__ALSFieldDeclaration__NameAssignment_0 ) ) )
            // InternalAlloyLanguage.g:2575:1: ( ( rule__ALSFieldDeclaration__NameAssignment_0 ) )
            {
            // InternalAlloyLanguage.g:2575:1: ( ( rule__ALSFieldDeclaration__NameAssignment_0 ) )
            // InternalAlloyLanguage.g:2576:1: ( rule__ALSFieldDeclaration__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFieldDeclarationAccess().getNameAssignment_0()); 
            }
            // InternalAlloyLanguage.g:2577:1: ( rule__ALSFieldDeclaration__NameAssignment_0 )
            // InternalAlloyLanguage.g:2577:2: rule__ALSFieldDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ALSFieldDeclaration__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFieldDeclarationAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFieldDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ALSFieldDeclaration__Group__1"
    // InternalAlloyLanguage.g:2587:1: rule__ALSFieldDeclaration__Group__1 : rule__ALSFieldDeclaration__Group__1__Impl rule__ALSFieldDeclaration__Group__2 ;
    public final void rule__ALSFieldDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2591:1: ( rule__ALSFieldDeclaration__Group__1__Impl rule__ALSFieldDeclaration__Group__2 )
            // InternalAlloyLanguage.g:2592:2: rule__ALSFieldDeclaration__Group__1__Impl rule__ALSFieldDeclaration__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSFieldDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFieldDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFieldDeclaration__Group__1"


    // $ANTLR start "rule__ALSFieldDeclaration__Group__1__Impl"
    // InternalAlloyLanguage.g:2599:1: rule__ALSFieldDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__ALSFieldDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2603:1: ( ( ':' ) )
            // InternalAlloyLanguage.g:2604:1: ( ':' )
            {
            // InternalAlloyLanguage.g:2604:1: ( ':' )
            // InternalAlloyLanguage.g:2605:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFieldDeclarationAccess().getColonKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFieldDeclarationAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFieldDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ALSFieldDeclaration__Group__2"
    // InternalAlloyLanguage.g:2618:1: rule__ALSFieldDeclaration__Group__2 : rule__ALSFieldDeclaration__Group__2__Impl rule__ALSFieldDeclaration__Group__3 ;
    public final void rule__ALSFieldDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2622:1: ( rule__ALSFieldDeclaration__Group__2__Impl rule__ALSFieldDeclaration__Group__3 )
            // InternalAlloyLanguage.g:2623:2: rule__ALSFieldDeclaration__Group__2__Impl rule__ALSFieldDeclaration__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ALSFieldDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFieldDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFieldDeclaration__Group__2"


    // $ANTLR start "rule__ALSFieldDeclaration__Group__2__Impl"
    // InternalAlloyLanguage.g:2630:1: rule__ALSFieldDeclaration__Group__2__Impl : ( ( rule__ALSFieldDeclaration__MultiplicityAssignment_2 )? ) ;
    public final void rule__ALSFieldDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2634:1: ( ( ( rule__ALSFieldDeclaration__MultiplicityAssignment_2 )? ) )
            // InternalAlloyLanguage.g:2635:1: ( ( rule__ALSFieldDeclaration__MultiplicityAssignment_2 )? )
            {
            // InternalAlloyLanguage.g:2635:1: ( ( rule__ALSFieldDeclaration__MultiplicityAssignment_2 )? )
            // InternalAlloyLanguage.g:2636:1: ( rule__ALSFieldDeclaration__MultiplicityAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFieldDeclarationAccess().getMultiplicityAssignment_2()); 
            }
            // InternalAlloyLanguage.g:2637:1: ( rule__ALSFieldDeclaration__MultiplicityAssignment_2 )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalAlloyLanguage.g:2637:2: rule__ALSFieldDeclaration__MultiplicityAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSFieldDeclaration__MultiplicityAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFieldDeclarationAccess().getMultiplicityAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFieldDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ALSFieldDeclaration__Group__3"
    // InternalAlloyLanguage.g:2647:1: rule__ALSFieldDeclaration__Group__3 : rule__ALSFieldDeclaration__Group__3__Impl ;
    public final void rule__ALSFieldDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2651:1: ( rule__ALSFieldDeclaration__Group__3__Impl )
            // InternalAlloyLanguage.g:2652:2: rule__ALSFieldDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSFieldDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFieldDeclaration__Group__3"


    // $ANTLR start "rule__ALSFieldDeclaration__Group__3__Impl"
    // InternalAlloyLanguage.g:2658:1: rule__ALSFieldDeclaration__Group__3__Impl : ( ( rule__ALSFieldDeclaration__TypeAssignment_3 ) ) ;
    public final void rule__ALSFieldDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2662:1: ( ( ( rule__ALSFieldDeclaration__TypeAssignment_3 ) ) )
            // InternalAlloyLanguage.g:2663:1: ( ( rule__ALSFieldDeclaration__TypeAssignment_3 ) )
            {
            // InternalAlloyLanguage.g:2663:1: ( ( rule__ALSFieldDeclaration__TypeAssignment_3 ) )
            // InternalAlloyLanguage.g:2664:1: ( rule__ALSFieldDeclaration__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFieldDeclarationAccess().getTypeAssignment_3()); 
            }
            // InternalAlloyLanguage.g:2665:1: ( rule__ALSFieldDeclaration__TypeAssignment_3 )
            // InternalAlloyLanguage.g:2665:2: rule__ALSFieldDeclaration__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ALSFieldDeclaration__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFieldDeclarationAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFieldDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__0"
    // InternalAlloyLanguage.g:2683:1: rule__ALSFunctionDefinition__Group__0 : rule__ALSFunctionDefinition__Group__0__Impl rule__ALSFunctionDefinition__Group__1 ;
    public final void rule__ALSFunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2687:1: ( rule__ALSFunctionDefinition__Group__0__Impl rule__ALSFunctionDefinition__Group__1 )
            // InternalAlloyLanguage.g:2688:2: rule__ALSFunctionDefinition__Group__0__Impl rule__ALSFunctionDefinition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ALSFunctionDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__0"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__0__Impl"
    // InternalAlloyLanguage.g:2695:1: rule__ALSFunctionDefinition__Group__0__Impl : ( 'fun' ) ;
    public final void rule__ALSFunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2699:1: ( ( 'fun' ) )
            // InternalAlloyLanguage.g:2700:1: ( 'fun' )
            {
            // InternalAlloyLanguage.g:2700:1: ( 'fun' )
            // InternalAlloyLanguage.g:2701:1: 'fun'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getFunKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getFunKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__0__Impl"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__1"
    // InternalAlloyLanguage.g:2714:1: rule__ALSFunctionDefinition__Group__1 : rule__ALSFunctionDefinition__Group__1__Impl rule__ALSFunctionDefinition__Group__2 ;
    public final void rule__ALSFunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2718:1: ( rule__ALSFunctionDefinition__Group__1__Impl rule__ALSFunctionDefinition__Group__2 )
            // InternalAlloyLanguage.g:2719:2: rule__ALSFunctionDefinition__Group__1__Impl rule__ALSFunctionDefinition__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ALSFunctionDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__1"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__1__Impl"
    // InternalAlloyLanguage.g:2726:1: rule__ALSFunctionDefinition__Group__1__Impl : ( ( rule__ALSFunctionDefinition__NameAssignment_1 ) ) ;
    public final void rule__ALSFunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2730:1: ( ( ( rule__ALSFunctionDefinition__NameAssignment_1 ) ) )
            // InternalAlloyLanguage.g:2731:1: ( ( rule__ALSFunctionDefinition__NameAssignment_1 ) )
            {
            // InternalAlloyLanguage.g:2731:1: ( ( rule__ALSFunctionDefinition__NameAssignment_1 ) )
            // InternalAlloyLanguage.g:2732:1: ( rule__ALSFunctionDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getNameAssignment_1()); 
            }
            // InternalAlloyLanguage.g:2733:1: ( rule__ALSFunctionDefinition__NameAssignment_1 )
            // InternalAlloyLanguage.g:2733:2: rule__ALSFunctionDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__1__Impl"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__2"
    // InternalAlloyLanguage.g:2743:1: rule__ALSFunctionDefinition__Group__2 : rule__ALSFunctionDefinition__Group__2__Impl rule__ALSFunctionDefinition__Group__3 ;
    public final void rule__ALSFunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2747:1: ( rule__ALSFunctionDefinition__Group__2__Impl rule__ALSFunctionDefinition__Group__3 )
            // InternalAlloyLanguage.g:2748:2: rule__ALSFunctionDefinition__Group__2__Impl rule__ALSFunctionDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ALSFunctionDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__2"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__2__Impl"
    // InternalAlloyLanguage.g:2755:1: rule__ALSFunctionDefinition__Group__2__Impl : ( '[' ) ;
    public final void rule__ALSFunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2759:1: ( ( '[' ) )
            // InternalAlloyLanguage.g:2760:1: ( '[' )
            {
            // InternalAlloyLanguage.g:2760:1: ( '[' )
            // InternalAlloyLanguage.g:2761:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getLeftSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__2__Impl"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__3"
    // InternalAlloyLanguage.g:2774:1: rule__ALSFunctionDefinition__Group__3 : rule__ALSFunctionDefinition__Group__3__Impl rule__ALSFunctionDefinition__Group__4 ;
    public final void rule__ALSFunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2778:1: ( rule__ALSFunctionDefinition__Group__3__Impl rule__ALSFunctionDefinition__Group__4 )
            // InternalAlloyLanguage.g:2779:2: rule__ALSFunctionDefinition__Group__3__Impl rule__ALSFunctionDefinition__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__ALSFunctionDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__3"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__3__Impl"
    // InternalAlloyLanguage.g:2786:1: rule__ALSFunctionDefinition__Group__3__Impl : ( ( rule__ALSFunctionDefinition__VariablesAssignment_3 ) ) ;
    public final void rule__ALSFunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2790:1: ( ( ( rule__ALSFunctionDefinition__VariablesAssignment_3 ) ) )
            // InternalAlloyLanguage.g:2791:1: ( ( rule__ALSFunctionDefinition__VariablesAssignment_3 ) )
            {
            // InternalAlloyLanguage.g:2791:1: ( ( rule__ALSFunctionDefinition__VariablesAssignment_3 ) )
            // InternalAlloyLanguage.g:2792:1: ( rule__ALSFunctionDefinition__VariablesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getVariablesAssignment_3()); 
            }
            // InternalAlloyLanguage.g:2793:1: ( rule__ALSFunctionDefinition__VariablesAssignment_3 )
            // InternalAlloyLanguage.g:2793:2: rule__ALSFunctionDefinition__VariablesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__VariablesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getVariablesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__3__Impl"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__4"
    // InternalAlloyLanguage.g:2803:1: rule__ALSFunctionDefinition__Group__4 : rule__ALSFunctionDefinition__Group__4__Impl rule__ALSFunctionDefinition__Group__5 ;
    public final void rule__ALSFunctionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2807:1: ( rule__ALSFunctionDefinition__Group__4__Impl rule__ALSFunctionDefinition__Group__5 )
            // InternalAlloyLanguage.g:2808:2: rule__ALSFunctionDefinition__Group__4__Impl rule__ALSFunctionDefinition__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__ALSFunctionDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__4"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__4__Impl"
    // InternalAlloyLanguage.g:2815:1: rule__ALSFunctionDefinition__Group__4__Impl : ( ( rule__ALSFunctionDefinition__Group_4__0 )* ) ;
    public final void rule__ALSFunctionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2819:1: ( ( ( rule__ALSFunctionDefinition__Group_4__0 )* ) )
            // InternalAlloyLanguage.g:2820:1: ( ( rule__ALSFunctionDefinition__Group_4__0 )* )
            {
            // InternalAlloyLanguage.g:2820:1: ( ( rule__ALSFunctionDefinition__Group_4__0 )* )
            // InternalAlloyLanguage.g:2821:1: ( rule__ALSFunctionDefinition__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getGroup_4()); 
            }
            // InternalAlloyLanguage.g:2822:1: ( rule__ALSFunctionDefinition__Group_4__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==35) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAlloyLanguage.g:2822:2: rule__ALSFunctionDefinition__Group_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ALSFunctionDefinition__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__4__Impl"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__5"
    // InternalAlloyLanguage.g:2832:1: rule__ALSFunctionDefinition__Group__5 : rule__ALSFunctionDefinition__Group__5__Impl rule__ALSFunctionDefinition__Group__6 ;
    public final void rule__ALSFunctionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2836:1: ( rule__ALSFunctionDefinition__Group__5__Impl rule__ALSFunctionDefinition__Group__6 )
            // InternalAlloyLanguage.g:2837:2: rule__ALSFunctionDefinition__Group__5__Impl rule__ALSFunctionDefinition__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__ALSFunctionDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__5"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__5__Impl"
    // InternalAlloyLanguage.g:2844:1: rule__ALSFunctionDefinition__Group__5__Impl : ( ']' ) ;
    public final void rule__ALSFunctionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2848:1: ( ( ']' ) )
            // InternalAlloyLanguage.g:2849:1: ( ']' )
            {
            // InternalAlloyLanguage.g:2849:1: ( ']' )
            // InternalAlloyLanguage.g:2850:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getRightSquareBracketKeyword_5()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getRightSquareBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__5__Impl"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__6"
    // InternalAlloyLanguage.g:2863:1: rule__ALSFunctionDefinition__Group__6 : rule__ALSFunctionDefinition__Group__6__Impl rule__ALSFunctionDefinition__Group__7 ;
    public final void rule__ALSFunctionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2867:1: ( rule__ALSFunctionDefinition__Group__6__Impl rule__ALSFunctionDefinition__Group__7 )
            // InternalAlloyLanguage.g:2868:2: rule__ALSFunctionDefinition__Group__6__Impl rule__ALSFunctionDefinition__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__ALSFunctionDefinition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__6"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__6__Impl"
    // InternalAlloyLanguage.g:2875:1: rule__ALSFunctionDefinition__Group__6__Impl : ( ':' ) ;
    public final void rule__ALSFunctionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2879:1: ( ( ':' ) )
            // InternalAlloyLanguage.g:2880:1: ( ':' )
            {
            // InternalAlloyLanguage.g:2880:1: ( ':' )
            // InternalAlloyLanguage.g:2881:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getColonKeyword_6()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getColonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__6__Impl"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__7"
    // InternalAlloyLanguage.g:2894:1: rule__ALSFunctionDefinition__Group__7 : rule__ALSFunctionDefinition__Group__7__Impl rule__ALSFunctionDefinition__Group__8 ;
    public final void rule__ALSFunctionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2898:1: ( rule__ALSFunctionDefinition__Group__7__Impl rule__ALSFunctionDefinition__Group__8 )
            // InternalAlloyLanguage.g:2899:2: rule__ALSFunctionDefinition__Group__7__Impl rule__ALSFunctionDefinition__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ALSFunctionDefinition__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__7"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__7__Impl"
    // InternalAlloyLanguage.g:2906:1: rule__ALSFunctionDefinition__Group__7__Impl : ( ( rule__ALSFunctionDefinition__TypeAssignment_7 ) ) ;
    public final void rule__ALSFunctionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2910:1: ( ( ( rule__ALSFunctionDefinition__TypeAssignment_7 ) ) )
            // InternalAlloyLanguage.g:2911:1: ( ( rule__ALSFunctionDefinition__TypeAssignment_7 ) )
            {
            // InternalAlloyLanguage.g:2911:1: ( ( rule__ALSFunctionDefinition__TypeAssignment_7 ) )
            // InternalAlloyLanguage.g:2912:1: ( rule__ALSFunctionDefinition__TypeAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getTypeAssignment_7()); 
            }
            // InternalAlloyLanguage.g:2913:1: ( rule__ALSFunctionDefinition__TypeAssignment_7 )
            // InternalAlloyLanguage.g:2913:2: rule__ALSFunctionDefinition__TypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__TypeAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getTypeAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__7__Impl"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__8"
    // InternalAlloyLanguage.g:2923:1: rule__ALSFunctionDefinition__Group__8 : rule__ALSFunctionDefinition__Group__8__Impl rule__ALSFunctionDefinition__Group__9 ;
    public final void rule__ALSFunctionDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2927:1: ( rule__ALSFunctionDefinition__Group__8__Impl rule__ALSFunctionDefinition__Group__9 )
            // InternalAlloyLanguage.g:2928:2: rule__ALSFunctionDefinition__Group__8__Impl rule__ALSFunctionDefinition__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__ALSFunctionDefinition__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__8"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__8__Impl"
    // InternalAlloyLanguage.g:2935:1: rule__ALSFunctionDefinition__Group__8__Impl : ( '{' ) ;
    public final void rule__ALSFunctionDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2939:1: ( ( '{' ) )
            // InternalAlloyLanguage.g:2940:1: ( '{' )
            {
            // InternalAlloyLanguage.g:2940:1: ( '{' )
            // InternalAlloyLanguage.g:2941:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getLeftCurlyBracketKeyword_8()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getLeftCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__8__Impl"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__9"
    // InternalAlloyLanguage.g:2954:1: rule__ALSFunctionDefinition__Group__9 : rule__ALSFunctionDefinition__Group__9__Impl rule__ALSFunctionDefinition__Group__10 ;
    public final void rule__ALSFunctionDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2958:1: ( rule__ALSFunctionDefinition__Group__9__Impl rule__ALSFunctionDefinition__Group__10 )
            // InternalAlloyLanguage.g:2959:2: rule__ALSFunctionDefinition__Group__9__Impl rule__ALSFunctionDefinition__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__ALSFunctionDefinition__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__9"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__9__Impl"
    // InternalAlloyLanguage.g:2966:1: rule__ALSFunctionDefinition__Group__9__Impl : ( ( rule__ALSFunctionDefinition__ValueAssignment_9 ) ) ;
    public final void rule__ALSFunctionDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2970:1: ( ( ( rule__ALSFunctionDefinition__ValueAssignment_9 ) ) )
            // InternalAlloyLanguage.g:2971:1: ( ( rule__ALSFunctionDefinition__ValueAssignment_9 ) )
            {
            // InternalAlloyLanguage.g:2971:1: ( ( rule__ALSFunctionDefinition__ValueAssignment_9 ) )
            // InternalAlloyLanguage.g:2972:1: ( rule__ALSFunctionDefinition__ValueAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getValueAssignment_9()); 
            }
            // InternalAlloyLanguage.g:2973:1: ( rule__ALSFunctionDefinition__ValueAssignment_9 )
            // InternalAlloyLanguage.g:2973:2: rule__ALSFunctionDefinition__ValueAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__ValueAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getValueAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__9__Impl"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__10"
    // InternalAlloyLanguage.g:2983:1: rule__ALSFunctionDefinition__Group__10 : rule__ALSFunctionDefinition__Group__10__Impl ;
    public final void rule__ALSFunctionDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2987:1: ( rule__ALSFunctionDefinition__Group__10__Impl )
            // InternalAlloyLanguage.g:2988:2: rule__ALSFunctionDefinition__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__10"


    // $ANTLR start "rule__ALSFunctionDefinition__Group__10__Impl"
    // InternalAlloyLanguage.g:2994:1: rule__ALSFunctionDefinition__Group__10__Impl : ( '}' ) ;
    public final void rule__ALSFunctionDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:2998:1: ( ( '}' ) )
            // InternalAlloyLanguage.g:2999:1: ( '}' )
            {
            // InternalAlloyLanguage.g:2999:1: ( '}' )
            // InternalAlloyLanguage.g:3000:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getRightCurlyBracketKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group__10__Impl"


    // $ANTLR start "rule__ALSFunctionDefinition__Group_4__0"
    // InternalAlloyLanguage.g:3035:1: rule__ALSFunctionDefinition__Group_4__0 : rule__ALSFunctionDefinition__Group_4__0__Impl rule__ALSFunctionDefinition__Group_4__1 ;
    public final void rule__ALSFunctionDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3039:1: ( rule__ALSFunctionDefinition__Group_4__0__Impl rule__ALSFunctionDefinition__Group_4__1 )
            // InternalAlloyLanguage.g:3040:2: rule__ALSFunctionDefinition__Group_4__0__Impl rule__ALSFunctionDefinition__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ALSFunctionDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group_4__0"


    // $ANTLR start "rule__ALSFunctionDefinition__Group_4__0__Impl"
    // InternalAlloyLanguage.g:3047:1: rule__ALSFunctionDefinition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ALSFunctionDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3051:1: ( ( ',' ) )
            // InternalAlloyLanguage.g:3052:1: ( ',' )
            {
            // InternalAlloyLanguage.g:3052:1: ( ',' )
            // InternalAlloyLanguage.g:3053:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getCommaKeyword_4_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__ALSFunctionDefinition__Group_4__1"
    // InternalAlloyLanguage.g:3066:1: rule__ALSFunctionDefinition__Group_4__1 : rule__ALSFunctionDefinition__Group_4__1__Impl ;
    public final void rule__ALSFunctionDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3070:1: ( rule__ALSFunctionDefinition__Group_4__1__Impl )
            // InternalAlloyLanguage.g:3071:2: rule__ALSFunctionDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group_4__1"


    // $ANTLR start "rule__ALSFunctionDefinition__Group_4__1__Impl"
    // InternalAlloyLanguage.g:3077:1: rule__ALSFunctionDefinition__Group_4__1__Impl : ( ( rule__ALSFunctionDefinition__VariablesAssignment_4_1 ) ) ;
    public final void rule__ALSFunctionDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3081:1: ( ( ( rule__ALSFunctionDefinition__VariablesAssignment_4_1 ) ) )
            // InternalAlloyLanguage.g:3082:1: ( ( rule__ALSFunctionDefinition__VariablesAssignment_4_1 ) )
            {
            // InternalAlloyLanguage.g:3082:1: ( ( rule__ALSFunctionDefinition__VariablesAssignment_4_1 ) )
            // InternalAlloyLanguage.g:3083:1: ( rule__ALSFunctionDefinition__VariablesAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getVariablesAssignment_4_1()); 
            }
            // InternalAlloyLanguage.g:3084:1: ( rule__ALSFunctionDefinition__VariablesAssignment_4_1 )
            // InternalAlloyLanguage.g:3084:2: rule__ALSFunctionDefinition__VariablesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSFunctionDefinition__VariablesAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getVariablesAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__ALSRelationDefinition__Group__0"
    // InternalAlloyLanguage.g:3098:1: rule__ALSRelationDefinition__Group__0 : rule__ALSRelationDefinition__Group__0__Impl rule__ALSRelationDefinition__Group__1 ;
    public final void rule__ALSRelationDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3102:1: ( rule__ALSRelationDefinition__Group__0__Impl rule__ALSRelationDefinition__Group__1 )
            // InternalAlloyLanguage.g:3103:2: rule__ALSRelationDefinition__Group__0__Impl rule__ALSRelationDefinition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ALSRelationDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRelationDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__0"


    // $ANTLR start "rule__ALSRelationDefinition__Group__0__Impl"
    // InternalAlloyLanguage.g:3110:1: rule__ALSRelationDefinition__Group__0__Impl : ( 'pred' ) ;
    public final void rule__ALSRelationDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3114:1: ( ( 'pred' ) )
            // InternalAlloyLanguage.g:3115:1: ( 'pred' )
            {
            // InternalAlloyLanguage.g:3115:1: ( 'pred' )
            // InternalAlloyLanguage.g:3116:1: 'pred'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRelationDefinitionAccess().getPredKeyword_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRelationDefinitionAccess().getPredKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__0__Impl"


    // $ANTLR start "rule__ALSRelationDefinition__Group__1"
    // InternalAlloyLanguage.g:3129:1: rule__ALSRelationDefinition__Group__1 : rule__ALSRelationDefinition__Group__1__Impl rule__ALSRelationDefinition__Group__2 ;
    public final void rule__ALSRelationDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3133:1: ( rule__ALSRelationDefinition__Group__1__Impl rule__ALSRelationDefinition__Group__2 )
            // InternalAlloyLanguage.g:3134:2: rule__ALSRelationDefinition__Group__1__Impl rule__ALSRelationDefinition__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ALSRelationDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRelationDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__1"


    // $ANTLR start "rule__ALSRelationDefinition__Group__1__Impl"
    // InternalAlloyLanguage.g:3141:1: rule__ALSRelationDefinition__Group__1__Impl : ( ( rule__ALSRelationDefinition__NameAssignment_1 ) ) ;
    public final void rule__ALSRelationDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3145:1: ( ( ( rule__ALSRelationDefinition__NameAssignment_1 ) ) )
            // InternalAlloyLanguage.g:3146:1: ( ( rule__ALSRelationDefinition__NameAssignment_1 ) )
            {
            // InternalAlloyLanguage.g:3146:1: ( ( rule__ALSRelationDefinition__NameAssignment_1 ) )
            // InternalAlloyLanguage.g:3147:1: ( rule__ALSRelationDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRelationDefinitionAccess().getNameAssignment_1()); 
            }
            // InternalAlloyLanguage.g:3148:1: ( rule__ALSRelationDefinition__NameAssignment_1 )
            // InternalAlloyLanguage.g:3148:2: rule__ALSRelationDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSRelationDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRelationDefinitionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__1__Impl"


    // $ANTLR start "rule__ALSRelationDefinition__Group__2"
    // InternalAlloyLanguage.g:3158:1: rule__ALSRelationDefinition__Group__2 : rule__ALSRelationDefinition__Group__2__Impl rule__ALSRelationDefinition__Group__3 ;
    public final void rule__ALSRelationDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3162:1: ( rule__ALSRelationDefinition__Group__2__Impl rule__ALSRelationDefinition__Group__3 )
            // InternalAlloyLanguage.g:3163:2: rule__ALSRelationDefinition__Group__2__Impl rule__ALSRelationDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ALSRelationDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRelationDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__2"


    // $ANTLR start "rule__ALSRelationDefinition__Group__2__Impl"
    // InternalAlloyLanguage.g:3170:1: rule__ALSRelationDefinition__Group__2__Impl : ( '[' ) ;
    public final void rule__ALSRelationDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3174:1: ( ( '[' ) )
            // InternalAlloyLanguage.g:3175:1: ( '[' )
            {
            // InternalAlloyLanguage.g:3175:1: ( '[' )
            // InternalAlloyLanguage.g:3176:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRelationDefinitionAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRelationDefinitionAccess().getLeftSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__2__Impl"


    // $ANTLR start "rule__ALSRelationDefinition__Group__3"
    // InternalAlloyLanguage.g:3189:1: rule__ALSRelationDefinition__Group__3 : rule__ALSRelationDefinition__Group__3__Impl rule__ALSRelationDefinition__Group__4 ;
    public final void rule__ALSRelationDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3193:1: ( rule__ALSRelationDefinition__Group__3__Impl rule__ALSRelationDefinition__Group__4 )
            // InternalAlloyLanguage.g:3194:2: rule__ALSRelationDefinition__Group__3__Impl rule__ALSRelationDefinition__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__ALSRelationDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRelationDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__3"


    // $ANTLR start "rule__ALSRelationDefinition__Group__3__Impl"
    // InternalAlloyLanguage.g:3201:1: rule__ALSRelationDefinition__Group__3__Impl : ( ( rule__ALSRelationDefinition__VariablesAssignment_3 ) ) ;
    public final void rule__ALSRelationDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3205:1: ( ( ( rule__ALSRelationDefinition__VariablesAssignment_3 ) ) )
            // InternalAlloyLanguage.g:3206:1: ( ( rule__ALSRelationDefinition__VariablesAssignment_3 ) )
            {
            // InternalAlloyLanguage.g:3206:1: ( ( rule__ALSRelationDefinition__VariablesAssignment_3 ) )
            // InternalAlloyLanguage.g:3207:1: ( rule__ALSRelationDefinition__VariablesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRelationDefinitionAccess().getVariablesAssignment_3()); 
            }
            // InternalAlloyLanguage.g:3208:1: ( rule__ALSRelationDefinition__VariablesAssignment_3 )
            // InternalAlloyLanguage.g:3208:2: rule__ALSRelationDefinition__VariablesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ALSRelationDefinition__VariablesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRelationDefinitionAccess().getVariablesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__3__Impl"


    // $ANTLR start "rule__ALSRelationDefinition__Group__4"
    // InternalAlloyLanguage.g:3218:1: rule__ALSRelationDefinition__Group__4 : rule__ALSRelationDefinition__Group__4__Impl rule__ALSRelationDefinition__Group__5 ;
    public final void rule__ALSRelationDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3222:1: ( rule__ALSRelationDefinition__Group__4__Impl rule__ALSRelationDefinition__Group__5 )
            // InternalAlloyLanguage.g:3223:2: rule__ALSRelationDefinition__Group__4__Impl rule__ALSRelationDefinition__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__ALSRelationDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRelationDefinition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__4"


    // $ANTLR start "rule__ALSRelationDefinition__Group__4__Impl"
    // InternalAlloyLanguage.g:3230:1: rule__ALSRelationDefinition__Group__4__Impl : ( ( rule__ALSRelationDefinition__Group_4__0 )* ) ;
    public final void rule__ALSRelationDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3234:1: ( ( ( rule__ALSRelationDefinition__Group_4__0 )* ) )
            // InternalAlloyLanguage.g:3235:1: ( ( rule__ALSRelationDefinition__Group_4__0 )* )
            {
            // InternalAlloyLanguage.g:3235:1: ( ( rule__ALSRelationDefinition__Group_4__0 )* )
            // InternalAlloyLanguage.g:3236:1: ( rule__ALSRelationDefinition__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRelationDefinitionAccess().getGroup_4()); 
            }
            // InternalAlloyLanguage.g:3237:1: ( rule__ALSRelationDefinition__Group_4__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAlloyLanguage.g:3237:2: rule__ALSRelationDefinition__Group_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ALSRelationDefinition__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRelationDefinitionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__4__Impl"


    // $ANTLR start "rule__ALSRelationDefinition__Group__5"
    // InternalAlloyLanguage.g:3247:1: rule__ALSRelationDefinition__Group__5 : rule__ALSRelationDefinition__Group__5__Impl rule__ALSRelationDefinition__Group__6 ;
    public final void rule__ALSRelationDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3251:1: ( rule__ALSRelationDefinition__Group__5__Impl rule__ALSRelationDefinition__Group__6 )
            // InternalAlloyLanguage.g:3252:2: rule__ALSRelationDefinition__Group__5__Impl rule__ALSRelationDefinition__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ALSRelationDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRelationDefinition__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__5"


    // $ANTLR start "rule__ALSRelationDefinition__Group__5__Impl"
    // InternalAlloyLanguage.g:3259:1: rule__ALSRelationDefinition__Group__5__Impl : ( ']' ) ;
    public final void rule__ALSRelationDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3263:1: ( ( ']' ) )
            // InternalAlloyLanguage.g:3264:1: ( ']' )
            {
            // InternalAlloyLanguage.g:3264:1: ( ']' )
            // InternalAlloyLanguage.g:3265:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRelationDefinitionAccess().getRightSquareBracketKeyword_5()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRelationDefinitionAccess().getRightSquareBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__5__Impl"


    // $ANTLR start "rule__ALSRelationDefinition__Group__6"
    // InternalAlloyLanguage.g:3278:1: rule__ALSRelationDefinition__Group__6 : rule__ALSRelationDefinition__Group__6__Impl rule__ALSRelationDefinition__Group__7 ;
    public final void rule__ALSRelationDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3282:1: ( rule__ALSRelationDefinition__Group__6__Impl rule__ALSRelationDefinition__Group__7 )
            // InternalAlloyLanguage.g:3283:2: rule__ALSRelationDefinition__Group__6__Impl rule__ALSRelationDefinition__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__ALSRelationDefinition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRelationDefinition__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__6"


    // $ANTLR start "rule__ALSRelationDefinition__Group__6__Impl"
    // InternalAlloyLanguage.g:3290:1: rule__ALSRelationDefinition__Group__6__Impl : ( '{' ) ;
    public final void rule__ALSRelationDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3294:1: ( ( '{' ) )
            // InternalAlloyLanguage.g:3295:1: ( '{' )
            {
            // InternalAlloyLanguage.g:3295:1: ( '{' )
            // InternalAlloyLanguage.g:3296:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRelationDefinitionAccess().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRelationDefinitionAccess().getLeftCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__6__Impl"


    // $ANTLR start "rule__ALSRelationDefinition__Group__7"
    // InternalAlloyLanguage.g:3309:1: rule__ALSRelationDefinition__Group__7 : rule__ALSRelationDefinition__Group__7__Impl rule__ALSRelationDefinition__Group__8 ;
    public final void rule__ALSRelationDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3313:1: ( rule__ALSRelationDefinition__Group__7__Impl rule__ALSRelationDefinition__Group__8 )
            // InternalAlloyLanguage.g:3314:2: rule__ALSRelationDefinition__Group__7__Impl rule__ALSRelationDefinition__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__ALSRelationDefinition__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRelationDefinition__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__7"


    // $ANTLR start "rule__ALSRelationDefinition__Group__7__Impl"
    // InternalAlloyLanguage.g:3321:1: rule__ALSRelationDefinition__Group__7__Impl : ( ( rule__ALSRelationDefinition__ValueAssignment_7 ) ) ;
    public final void rule__ALSRelationDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3325:1: ( ( ( rule__ALSRelationDefinition__ValueAssignment_7 ) ) )
            // InternalAlloyLanguage.g:3326:1: ( ( rule__ALSRelationDefinition__ValueAssignment_7 ) )
            {
            // InternalAlloyLanguage.g:3326:1: ( ( rule__ALSRelationDefinition__ValueAssignment_7 ) )
            // InternalAlloyLanguage.g:3327:1: ( rule__ALSRelationDefinition__ValueAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRelationDefinitionAccess().getValueAssignment_7()); 
            }
            // InternalAlloyLanguage.g:3328:1: ( rule__ALSRelationDefinition__ValueAssignment_7 )
            // InternalAlloyLanguage.g:3328:2: rule__ALSRelationDefinition__ValueAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ALSRelationDefinition__ValueAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRelationDefinitionAccess().getValueAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__7__Impl"


    // $ANTLR start "rule__ALSRelationDefinition__Group__8"
    // InternalAlloyLanguage.g:3338:1: rule__ALSRelationDefinition__Group__8 : rule__ALSRelationDefinition__Group__8__Impl ;
    public final void rule__ALSRelationDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3342:1: ( rule__ALSRelationDefinition__Group__8__Impl )
            // InternalAlloyLanguage.g:3343:2: rule__ALSRelationDefinition__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSRelationDefinition__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__8"


    // $ANTLR start "rule__ALSRelationDefinition__Group__8__Impl"
    // InternalAlloyLanguage.g:3349:1: rule__ALSRelationDefinition__Group__8__Impl : ( '}' ) ;
    public final void rule__ALSRelationDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3353:1: ( ( '}' ) )
            // InternalAlloyLanguage.g:3354:1: ( '}' )
            {
            // InternalAlloyLanguage.g:3354:1: ( '}' )
            // InternalAlloyLanguage.g:3355:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRelationDefinitionAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRelationDefinitionAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group__8__Impl"


    // $ANTLR start "rule__ALSRelationDefinition__Group_4__0"
    // InternalAlloyLanguage.g:3386:1: rule__ALSRelationDefinition__Group_4__0 : rule__ALSRelationDefinition__Group_4__0__Impl rule__ALSRelationDefinition__Group_4__1 ;
    public final void rule__ALSRelationDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3390:1: ( rule__ALSRelationDefinition__Group_4__0__Impl rule__ALSRelationDefinition__Group_4__1 )
            // InternalAlloyLanguage.g:3391:2: rule__ALSRelationDefinition__Group_4__0__Impl rule__ALSRelationDefinition__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ALSRelationDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRelationDefinition__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group_4__0"


    // $ANTLR start "rule__ALSRelationDefinition__Group_4__0__Impl"
    // InternalAlloyLanguage.g:3398:1: rule__ALSRelationDefinition__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ALSRelationDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3402:1: ( ( ',' ) )
            // InternalAlloyLanguage.g:3403:1: ( ',' )
            {
            // InternalAlloyLanguage.g:3403:1: ( ',' )
            // InternalAlloyLanguage.g:3404:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRelationDefinitionAccess().getCommaKeyword_4_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRelationDefinitionAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__ALSRelationDefinition__Group_4__1"
    // InternalAlloyLanguage.g:3417:1: rule__ALSRelationDefinition__Group_4__1 : rule__ALSRelationDefinition__Group_4__1__Impl ;
    public final void rule__ALSRelationDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3421:1: ( rule__ALSRelationDefinition__Group_4__1__Impl )
            // InternalAlloyLanguage.g:3422:2: rule__ALSRelationDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSRelationDefinition__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group_4__1"


    // $ANTLR start "rule__ALSRelationDefinition__Group_4__1__Impl"
    // InternalAlloyLanguage.g:3428:1: rule__ALSRelationDefinition__Group_4__1__Impl : ( ( rule__ALSRelationDefinition__VariablesAssignment_4_1 ) ) ;
    public final void rule__ALSRelationDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3432:1: ( ( ( rule__ALSRelationDefinition__VariablesAssignment_4_1 ) ) )
            // InternalAlloyLanguage.g:3433:1: ( ( rule__ALSRelationDefinition__VariablesAssignment_4_1 ) )
            {
            // InternalAlloyLanguage.g:3433:1: ( ( rule__ALSRelationDefinition__VariablesAssignment_4_1 ) )
            // InternalAlloyLanguage.g:3434:1: ( rule__ALSRelationDefinition__VariablesAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRelationDefinitionAccess().getVariablesAssignment_4_1()); 
            }
            // InternalAlloyLanguage.g:3435:1: ( rule__ALSRelationDefinition__VariablesAssignment_4_1 )
            // InternalAlloyLanguage.g:3435:2: rule__ALSRelationDefinition__VariablesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSRelationDefinition__VariablesAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRelationDefinitionAccess().getVariablesAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__ALSFactDeclaration__Group__0"
    // InternalAlloyLanguage.g:3449:1: rule__ALSFactDeclaration__Group__0 : rule__ALSFactDeclaration__Group__0__Impl rule__ALSFactDeclaration__Group__1 ;
    public final void rule__ALSFactDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3453:1: ( rule__ALSFactDeclaration__Group__0__Impl rule__ALSFactDeclaration__Group__1 )
            // InternalAlloyLanguage.g:3454:2: rule__ALSFactDeclaration__Group__0__Impl rule__ALSFactDeclaration__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ALSFactDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFactDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFactDeclaration__Group__0"


    // $ANTLR start "rule__ALSFactDeclaration__Group__0__Impl"
    // InternalAlloyLanguage.g:3461:1: rule__ALSFactDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ALSFactDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3465:1: ( ( () ) )
            // InternalAlloyLanguage.g:3466:1: ( () )
            {
            // InternalAlloyLanguage.g:3466:1: ( () )
            // InternalAlloyLanguage.g:3467:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFactDeclarationAccess().getALSFactDeclarationAction_0()); 
            }
            // InternalAlloyLanguage.g:3468:1: ()
            // InternalAlloyLanguage.g:3470:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFactDeclarationAccess().getALSFactDeclarationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFactDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ALSFactDeclaration__Group__1"
    // InternalAlloyLanguage.g:3480:1: rule__ALSFactDeclaration__Group__1 : rule__ALSFactDeclaration__Group__1__Impl rule__ALSFactDeclaration__Group__2 ;
    public final void rule__ALSFactDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3484:1: ( rule__ALSFactDeclaration__Group__1__Impl rule__ALSFactDeclaration__Group__2 )
            // InternalAlloyLanguage.g:3485:2: rule__ALSFactDeclaration__Group__1__Impl rule__ALSFactDeclaration__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ALSFactDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFactDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFactDeclaration__Group__1"


    // $ANTLR start "rule__ALSFactDeclaration__Group__1__Impl"
    // InternalAlloyLanguage.g:3492:1: rule__ALSFactDeclaration__Group__1__Impl : ( 'fact' ) ;
    public final void rule__ALSFactDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3496:1: ( ( 'fact' ) )
            // InternalAlloyLanguage.g:3497:1: ( 'fact' )
            {
            // InternalAlloyLanguage.g:3497:1: ( 'fact' )
            // InternalAlloyLanguage.g:3498:1: 'fact'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFactDeclarationAccess().getFactKeyword_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFactDeclarationAccess().getFactKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFactDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ALSFactDeclaration__Group__2"
    // InternalAlloyLanguage.g:3511:1: rule__ALSFactDeclaration__Group__2 : rule__ALSFactDeclaration__Group__2__Impl rule__ALSFactDeclaration__Group__3 ;
    public final void rule__ALSFactDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3515:1: ( rule__ALSFactDeclaration__Group__2__Impl rule__ALSFactDeclaration__Group__3 )
            // InternalAlloyLanguage.g:3516:2: rule__ALSFactDeclaration__Group__2__Impl rule__ALSFactDeclaration__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ALSFactDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFactDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFactDeclaration__Group__2"


    // $ANTLR start "rule__ALSFactDeclaration__Group__2__Impl"
    // InternalAlloyLanguage.g:3523:1: rule__ALSFactDeclaration__Group__2__Impl : ( ( rule__ALSFactDeclaration__NameAssignment_2 )? ) ;
    public final void rule__ALSFactDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3527:1: ( ( ( rule__ALSFactDeclaration__NameAssignment_2 )? ) )
            // InternalAlloyLanguage.g:3528:1: ( ( rule__ALSFactDeclaration__NameAssignment_2 )? )
            {
            // InternalAlloyLanguage.g:3528:1: ( ( rule__ALSFactDeclaration__NameAssignment_2 )? )
            // InternalAlloyLanguage.g:3529:1: ( rule__ALSFactDeclaration__NameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFactDeclarationAccess().getNameAssignment_2()); 
            }
            // InternalAlloyLanguage.g:3530:1: ( rule__ALSFactDeclaration__NameAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAlloyLanguage.g:3530:2: rule__ALSFactDeclaration__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSFactDeclaration__NameAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFactDeclarationAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFactDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ALSFactDeclaration__Group__3"
    // InternalAlloyLanguage.g:3540:1: rule__ALSFactDeclaration__Group__3 : rule__ALSFactDeclaration__Group__3__Impl rule__ALSFactDeclaration__Group__4 ;
    public final void rule__ALSFactDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3544:1: ( rule__ALSFactDeclaration__Group__3__Impl rule__ALSFactDeclaration__Group__4 )
            // InternalAlloyLanguage.g:3545:2: rule__ALSFactDeclaration__Group__3__Impl rule__ALSFactDeclaration__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ALSFactDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFactDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFactDeclaration__Group__3"


    // $ANTLR start "rule__ALSFactDeclaration__Group__3__Impl"
    // InternalAlloyLanguage.g:3552:1: rule__ALSFactDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__ALSFactDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3556:1: ( ( '{' ) )
            // InternalAlloyLanguage.g:3557:1: ( '{' )
            {
            // InternalAlloyLanguage.g:3557:1: ( '{' )
            // InternalAlloyLanguage.g:3558:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFactDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFactDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFactDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ALSFactDeclaration__Group__4"
    // InternalAlloyLanguage.g:3571:1: rule__ALSFactDeclaration__Group__4 : rule__ALSFactDeclaration__Group__4__Impl rule__ALSFactDeclaration__Group__5 ;
    public final void rule__ALSFactDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3575:1: ( rule__ALSFactDeclaration__Group__4__Impl rule__ALSFactDeclaration__Group__5 )
            // InternalAlloyLanguage.g:3576:2: rule__ALSFactDeclaration__Group__4__Impl rule__ALSFactDeclaration__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__ALSFactDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSFactDeclaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFactDeclaration__Group__4"


    // $ANTLR start "rule__ALSFactDeclaration__Group__4__Impl"
    // InternalAlloyLanguage.g:3583:1: rule__ALSFactDeclaration__Group__4__Impl : ( ( rule__ALSFactDeclaration__TermAssignment_4 ) ) ;
    public final void rule__ALSFactDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3587:1: ( ( ( rule__ALSFactDeclaration__TermAssignment_4 ) ) )
            // InternalAlloyLanguage.g:3588:1: ( ( rule__ALSFactDeclaration__TermAssignment_4 ) )
            {
            // InternalAlloyLanguage.g:3588:1: ( ( rule__ALSFactDeclaration__TermAssignment_4 ) )
            // InternalAlloyLanguage.g:3589:1: ( rule__ALSFactDeclaration__TermAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFactDeclarationAccess().getTermAssignment_4()); 
            }
            // InternalAlloyLanguage.g:3590:1: ( rule__ALSFactDeclaration__TermAssignment_4 )
            // InternalAlloyLanguage.g:3590:2: rule__ALSFactDeclaration__TermAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ALSFactDeclaration__TermAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFactDeclarationAccess().getTermAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFactDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ALSFactDeclaration__Group__5"
    // InternalAlloyLanguage.g:3600:1: rule__ALSFactDeclaration__Group__5 : rule__ALSFactDeclaration__Group__5__Impl ;
    public final void rule__ALSFactDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3604:1: ( rule__ALSFactDeclaration__Group__5__Impl )
            // InternalAlloyLanguage.g:3605:2: rule__ALSFactDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSFactDeclaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFactDeclaration__Group__5"


    // $ANTLR start "rule__ALSFactDeclaration__Group__5__Impl"
    // InternalAlloyLanguage.g:3611:1: rule__ALSFactDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__ALSFactDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3615:1: ( ( '}' ) )
            // InternalAlloyLanguage.g:3616:1: ( '}' )
            {
            // InternalAlloyLanguage.g:3616:1: ( '}' )
            // InternalAlloyLanguage.g:3617:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFactDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFactDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFactDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ALSQuantified__Group_0__0"
    // InternalAlloyLanguage.g:3642:1: rule__ALSQuantified__Group_0__0 : rule__ALSQuantified__Group_0__0__Impl rule__ALSQuantified__Group_0__1 ;
    public final void rule__ALSQuantified__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3646:1: ( rule__ALSQuantified__Group_0__0__Impl rule__ALSQuantified__Group_0__1 )
            // InternalAlloyLanguage.g:3647:2: rule__ALSQuantified__Group_0__0__Impl rule__ALSQuantified__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__ALSQuantified__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSQuantified__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0__0"


    // $ANTLR start "rule__ALSQuantified__Group_0__0__Impl"
    // InternalAlloyLanguage.g:3654:1: rule__ALSQuantified__Group_0__0__Impl : ( () ) ;
    public final void rule__ALSQuantified__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3658:1: ( ( () ) )
            // InternalAlloyLanguage.g:3659:1: ( () )
            {
            // InternalAlloyLanguage.g:3659:1: ( () )
            // InternalAlloyLanguage.g:3660:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedAccess().getALSQuantifiedExAction_0_0()); 
            }
            // InternalAlloyLanguage.g:3661:1: ()
            // InternalAlloyLanguage.g:3663:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedAccess().getALSQuantifiedExAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0__0__Impl"


    // $ANTLR start "rule__ALSQuantified__Group_0__1"
    // InternalAlloyLanguage.g:3673:1: rule__ALSQuantified__Group_0__1 : rule__ALSQuantified__Group_0__1__Impl rule__ALSQuantified__Group_0__2 ;
    public final void rule__ALSQuantified__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3677:1: ( rule__ALSQuantified__Group_0__1__Impl rule__ALSQuantified__Group_0__2 )
            // InternalAlloyLanguage.g:3678:2: rule__ALSQuantified__Group_0__1__Impl rule__ALSQuantified__Group_0__2
            {
            pushFollow(FOLLOW_23);
            rule__ALSQuantified__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSQuantified__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0__1"


    // $ANTLR start "rule__ALSQuantified__Group_0__1__Impl"
    // InternalAlloyLanguage.g:3685:1: rule__ALSQuantified__Group_0__1__Impl : ( ( rule__ALSQuantified__TypeAssignment_0_1 ) ) ;
    public final void rule__ALSQuantified__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3689:1: ( ( ( rule__ALSQuantified__TypeAssignment_0_1 ) ) )
            // InternalAlloyLanguage.g:3690:1: ( ( rule__ALSQuantified__TypeAssignment_0_1 ) )
            {
            // InternalAlloyLanguage.g:3690:1: ( ( rule__ALSQuantified__TypeAssignment_0_1 ) )
            // InternalAlloyLanguage.g:3691:1: ( rule__ALSQuantified__TypeAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedAccess().getTypeAssignment_0_1()); 
            }
            // InternalAlloyLanguage.g:3692:1: ( rule__ALSQuantified__TypeAssignment_0_1 )
            // InternalAlloyLanguage.g:3692:2: rule__ALSQuantified__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSQuantified__TypeAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedAccess().getTypeAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0__1__Impl"


    // $ANTLR start "rule__ALSQuantified__Group_0__2"
    // InternalAlloyLanguage.g:3702:1: rule__ALSQuantified__Group_0__2 : rule__ALSQuantified__Group_0__2__Impl rule__ALSQuantified__Group_0__3 ;
    public final void rule__ALSQuantified__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3706:1: ( rule__ALSQuantified__Group_0__2__Impl rule__ALSQuantified__Group_0__3 )
            // InternalAlloyLanguage.g:3707:2: rule__ALSQuantified__Group_0__2__Impl rule__ALSQuantified__Group_0__3
            {
            pushFollow(FOLLOW_23);
            rule__ALSQuantified__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSQuantified__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0__2"


    // $ANTLR start "rule__ALSQuantified__Group_0__2__Impl"
    // InternalAlloyLanguage.g:3714:1: rule__ALSQuantified__Group_0__2__Impl : ( ( rule__ALSQuantified__DisjAssignment_0_2 )? ) ;
    public final void rule__ALSQuantified__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3718:1: ( ( ( rule__ALSQuantified__DisjAssignment_0_2 )? ) )
            // InternalAlloyLanguage.g:3719:1: ( ( rule__ALSQuantified__DisjAssignment_0_2 )? )
            {
            // InternalAlloyLanguage.g:3719:1: ( ( rule__ALSQuantified__DisjAssignment_0_2 )? )
            // InternalAlloyLanguage.g:3720:1: ( rule__ALSQuantified__DisjAssignment_0_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedAccess().getDisjAssignment_0_2()); 
            }
            // InternalAlloyLanguage.g:3721:1: ( rule__ALSQuantified__DisjAssignment_0_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==74) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAlloyLanguage.g:3721:2: rule__ALSQuantified__DisjAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSQuantified__DisjAssignment_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedAccess().getDisjAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0__2__Impl"


    // $ANTLR start "rule__ALSQuantified__Group_0__3"
    // InternalAlloyLanguage.g:3731:1: rule__ALSQuantified__Group_0__3 : rule__ALSQuantified__Group_0__3__Impl rule__ALSQuantified__Group_0__4 ;
    public final void rule__ALSQuantified__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3735:1: ( rule__ALSQuantified__Group_0__3__Impl rule__ALSQuantified__Group_0__4 )
            // InternalAlloyLanguage.g:3736:2: rule__ALSQuantified__Group_0__3__Impl rule__ALSQuantified__Group_0__4
            {
            pushFollow(FOLLOW_24);
            rule__ALSQuantified__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSQuantified__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0__3"


    // $ANTLR start "rule__ALSQuantified__Group_0__3__Impl"
    // InternalAlloyLanguage.g:3743:1: rule__ALSQuantified__Group_0__3__Impl : ( ( rule__ALSQuantified__VariablesAssignment_0_3 ) ) ;
    public final void rule__ALSQuantified__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3747:1: ( ( ( rule__ALSQuantified__VariablesAssignment_0_3 ) ) )
            // InternalAlloyLanguage.g:3748:1: ( ( rule__ALSQuantified__VariablesAssignment_0_3 ) )
            {
            // InternalAlloyLanguage.g:3748:1: ( ( rule__ALSQuantified__VariablesAssignment_0_3 ) )
            // InternalAlloyLanguage.g:3749:1: ( rule__ALSQuantified__VariablesAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedAccess().getVariablesAssignment_0_3()); 
            }
            // InternalAlloyLanguage.g:3750:1: ( rule__ALSQuantified__VariablesAssignment_0_3 )
            // InternalAlloyLanguage.g:3750:2: rule__ALSQuantified__VariablesAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__ALSQuantified__VariablesAssignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedAccess().getVariablesAssignment_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0__3__Impl"


    // $ANTLR start "rule__ALSQuantified__Group_0__4"
    // InternalAlloyLanguage.g:3760:1: rule__ALSQuantified__Group_0__4 : rule__ALSQuantified__Group_0__4__Impl rule__ALSQuantified__Group_0__5 ;
    public final void rule__ALSQuantified__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3764:1: ( rule__ALSQuantified__Group_0__4__Impl rule__ALSQuantified__Group_0__5 )
            // InternalAlloyLanguage.g:3765:2: rule__ALSQuantified__Group_0__4__Impl rule__ALSQuantified__Group_0__5
            {
            pushFollow(FOLLOW_24);
            rule__ALSQuantified__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSQuantified__Group_0__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0__4"


    // $ANTLR start "rule__ALSQuantified__Group_0__4__Impl"
    // InternalAlloyLanguage.g:3772:1: rule__ALSQuantified__Group_0__4__Impl : ( ( rule__ALSQuantified__Group_0_4__0 )* ) ;
    public final void rule__ALSQuantified__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3776:1: ( ( ( rule__ALSQuantified__Group_0_4__0 )* ) )
            // InternalAlloyLanguage.g:3777:1: ( ( rule__ALSQuantified__Group_0_4__0 )* )
            {
            // InternalAlloyLanguage.g:3777:1: ( ( rule__ALSQuantified__Group_0_4__0 )* )
            // InternalAlloyLanguage.g:3778:1: ( rule__ALSQuantified__Group_0_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedAccess().getGroup_0_4()); 
            }
            // InternalAlloyLanguage.g:3779:1: ( rule__ALSQuantified__Group_0_4__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==35) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAlloyLanguage.g:3779:2: rule__ALSQuantified__Group_0_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ALSQuantified__Group_0_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedAccess().getGroup_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0__4__Impl"


    // $ANTLR start "rule__ALSQuantified__Group_0__5"
    // InternalAlloyLanguage.g:3789:1: rule__ALSQuantified__Group_0__5 : rule__ALSQuantified__Group_0__5__Impl rule__ALSQuantified__Group_0__6 ;
    public final void rule__ALSQuantified__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3793:1: ( rule__ALSQuantified__Group_0__5__Impl rule__ALSQuantified__Group_0__6 )
            // InternalAlloyLanguage.g:3794:2: rule__ALSQuantified__Group_0__5__Impl rule__ALSQuantified__Group_0__6
            {
            pushFollow(FOLLOW_16);
            rule__ALSQuantified__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSQuantified__Group_0__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0__5"


    // $ANTLR start "rule__ALSQuantified__Group_0__5__Impl"
    // InternalAlloyLanguage.g:3801:1: rule__ALSQuantified__Group_0__5__Impl : ( '{' ) ;
    public final void rule__ALSQuantified__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3805:1: ( ( '{' ) )
            // InternalAlloyLanguage.g:3806:1: ( '{' )
            {
            // InternalAlloyLanguage.g:3806:1: ( '{' )
            // InternalAlloyLanguage.g:3807:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedAccess().getLeftCurlyBracketKeyword_0_5()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedAccess().getLeftCurlyBracketKeyword_0_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0__5__Impl"


    // $ANTLR start "rule__ALSQuantified__Group_0__6"
    // InternalAlloyLanguage.g:3820:1: rule__ALSQuantified__Group_0__6 : rule__ALSQuantified__Group_0__6__Impl rule__ALSQuantified__Group_0__7 ;
    public final void rule__ALSQuantified__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3824:1: ( rule__ALSQuantified__Group_0__6__Impl rule__ALSQuantified__Group_0__7 )
            // InternalAlloyLanguage.g:3825:2: rule__ALSQuantified__Group_0__6__Impl rule__ALSQuantified__Group_0__7
            {
            pushFollow(FOLLOW_19);
            rule__ALSQuantified__Group_0__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSQuantified__Group_0__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0__6"


    // $ANTLR start "rule__ALSQuantified__Group_0__6__Impl"
    // InternalAlloyLanguage.g:3832:1: rule__ALSQuantified__Group_0__6__Impl : ( ( rule__ALSQuantified__ExpressionAssignment_0_6 ) ) ;
    public final void rule__ALSQuantified__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3836:1: ( ( ( rule__ALSQuantified__ExpressionAssignment_0_6 ) ) )
            // InternalAlloyLanguage.g:3837:1: ( ( rule__ALSQuantified__ExpressionAssignment_0_6 ) )
            {
            // InternalAlloyLanguage.g:3837:1: ( ( rule__ALSQuantified__ExpressionAssignment_0_6 ) )
            // InternalAlloyLanguage.g:3838:1: ( rule__ALSQuantified__ExpressionAssignment_0_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedAccess().getExpressionAssignment_0_6()); 
            }
            // InternalAlloyLanguage.g:3839:1: ( rule__ALSQuantified__ExpressionAssignment_0_6 )
            // InternalAlloyLanguage.g:3839:2: rule__ALSQuantified__ExpressionAssignment_0_6
            {
            pushFollow(FOLLOW_2);
            rule__ALSQuantified__ExpressionAssignment_0_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedAccess().getExpressionAssignment_0_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0__6__Impl"


    // $ANTLR start "rule__ALSQuantified__Group_0__7"
    // InternalAlloyLanguage.g:3849:1: rule__ALSQuantified__Group_0__7 : rule__ALSQuantified__Group_0__7__Impl ;
    public final void rule__ALSQuantified__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3853:1: ( rule__ALSQuantified__Group_0__7__Impl )
            // InternalAlloyLanguage.g:3854:2: rule__ALSQuantified__Group_0__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSQuantified__Group_0__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0__7"


    // $ANTLR start "rule__ALSQuantified__Group_0__7__Impl"
    // InternalAlloyLanguage.g:3860:1: rule__ALSQuantified__Group_0__7__Impl : ( '}' ) ;
    public final void rule__ALSQuantified__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3864:1: ( ( '}' ) )
            // InternalAlloyLanguage.g:3865:1: ( '}' )
            {
            // InternalAlloyLanguage.g:3865:1: ( '}' )
            // InternalAlloyLanguage.g:3866:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedAccess().getRightCurlyBracketKeyword_0_7()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedAccess().getRightCurlyBracketKeyword_0_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0__7__Impl"


    // $ANTLR start "rule__ALSQuantified__Group_0_4__0"
    // InternalAlloyLanguage.g:3895:1: rule__ALSQuantified__Group_0_4__0 : rule__ALSQuantified__Group_0_4__0__Impl rule__ALSQuantified__Group_0_4__1 ;
    public final void rule__ALSQuantified__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3899:1: ( rule__ALSQuantified__Group_0_4__0__Impl rule__ALSQuantified__Group_0_4__1 )
            // InternalAlloyLanguage.g:3900:2: rule__ALSQuantified__Group_0_4__0__Impl rule__ALSQuantified__Group_0_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ALSQuantified__Group_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSQuantified__Group_0_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0_4__0"


    // $ANTLR start "rule__ALSQuantified__Group_0_4__0__Impl"
    // InternalAlloyLanguage.g:3907:1: rule__ALSQuantified__Group_0_4__0__Impl : ( ',' ) ;
    public final void rule__ALSQuantified__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3911:1: ( ( ',' ) )
            // InternalAlloyLanguage.g:3912:1: ( ',' )
            {
            // InternalAlloyLanguage.g:3912:1: ( ',' )
            // InternalAlloyLanguage.g:3913:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedAccess().getCommaKeyword_0_4_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedAccess().getCommaKeyword_0_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0_4__0__Impl"


    // $ANTLR start "rule__ALSQuantified__Group_0_4__1"
    // InternalAlloyLanguage.g:3926:1: rule__ALSQuantified__Group_0_4__1 : rule__ALSQuantified__Group_0_4__1__Impl ;
    public final void rule__ALSQuantified__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3930:1: ( rule__ALSQuantified__Group_0_4__1__Impl )
            // InternalAlloyLanguage.g:3931:2: rule__ALSQuantified__Group_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSQuantified__Group_0_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0_4__1"


    // $ANTLR start "rule__ALSQuantified__Group_0_4__1__Impl"
    // InternalAlloyLanguage.g:3937:1: rule__ALSQuantified__Group_0_4__1__Impl : ( ( rule__ALSQuantified__VariablesAssignment_0_4_1 ) ) ;
    public final void rule__ALSQuantified__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3941:1: ( ( ( rule__ALSQuantified__VariablesAssignment_0_4_1 ) ) )
            // InternalAlloyLanguage.g:3942:1: ( ( rule__ALSQuantified__VariablesAssignment_0_4_1 ) )
            {
            // InternalAlloyLanguage.g:3942:1: ( ( rule__ALSQuantified__VariablesAssignment_0_4_1 ) )
            // InternalAlloyLanguage.g:3943:1: ( rule__ALSQuantified__VariablesAssignment_0_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedAccess().getVariablesAssignment_0_4_1()); 
            }
            // InternalAlloyLanguage.g:3944:1: ( rule__ALSQuantified__VariablesAssignment_0_4_1 )
            // InternalAlloyLanguage.g:3944:2: rule__ALSQuantified__VariablesAssignment_0_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSQuantified__VariablesAssignment_0_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedAccess().getVariablesAssignment_0_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__Group_0_4__1__Impl"


    // $ANTLR start "rule__ALSOr__Group__0"
    // InternalAlloyLanguage.g:3958:1: rule__ALSOr__Group__0 : rule__ALSOr__Group__0__Impl rule__ALSOr__Group__1 ;
    public final void rule__ALSOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3962:1: ( rule__ALSOr__Group__0__Impl rule__ALSOr__Group__1 )
            // InternalAlloyLanguage.g:3963:2: rule__ALSOr__Group__0__Impl rule__ALSOr__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ALSOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSOr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOr__Group__0"


    // $ANTLR start "rule__ALSOr__Group__0__Impl"
    // InternalAlloyLanguage.g:3970:1: rule__ALSOr__Group__0__Impl : ( ruleALSIff ) ;
    public final void rule__ALSOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3974:1: ( ( ruleALSIff ) )
            // InternalAlloyLanguage.g:3975:1: ( ruleALSIff )
            {
            // InternalAlloyLanguage.g:3975:1: ( ruleALSIff )
            // InternalAlloyLanguage.g:3976:1: ruleALSIff
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSOrAccess().getALSIffParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSIff();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSOrAccess().getALSIffParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOr__Group__0__Impl"


    // $ANTLR start "rule__ALSOr__Group__1"
    // InternalAlloyLanguage.g:3987:1: rule__ALSOr__Group__1 : rule__ALSOr__Group__1__Impl ;
    public final void rule__ALSOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:3991:1: ( rule__ALSOr__Group__1__Impl )
            // InternalAlloyLanguage.g:3992:2: rule__ALSOr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSOr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOr__Group__1"


    // $ANTLR start "rule__ALSOr__Group__1__Impl"
    // InternalAlloyLanguage.g:3998:1: rule__ALSOr__Group__1__Impl : ( ( rule__ALSOr__Group_1__0 )? ) ;
    public final void rule__ALSOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4002:1: ( ( ( rule__ALSOr__Group_1__0 )? ) )
            // InternalAlloyLanguage.g:4003:1: ( ( rule__ALSOr__Group_1__0 )? )
            {
            // InternalAlloyLanguage.g:4003:1: ( ( rule__ALSOr__Group_1__0 )? )
            // InternalAlloyLanguage.g:4004:1: ( rule__ALSOr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSOrAccess().getGroup_1()); 
            }
            // InternalAlloyLanguage.g:4005:1: ( rule__ALSOr__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=11 && LA30_0<=12)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAlloyLanguage.g:4005:2: rule__ALSOr__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSOr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSOrAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOr__Group__1__Impl"


    // $ANTLR start "rule__ALSOr__Group_1__0"
    // InternalAlloyLanguage.g:4019:1: rule__ALSOr__Group_1__0 : rule__ALSOr__Group_1__0__Impl rule__ALSOr__Group_1__1 ;
    public final void rule__ALSOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4023:1: ( rule__ALSOr__Group_1__0__Impl rule__ALSOr__Group_1__1 )
            // InternalAlloyLanguage.g:4024:2: rule__ALSOr__Group_1__0__Impl rule__ALSOr__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__ALSOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSOr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOr__Group_1__0"


    // $ANTLR start "rule__ALSOr__Group_1__0__Impl"
    // InternalAlloyLanguage.g:4031:1: rule__ALSOr__Group_1__0__Impl : ( () ) ;
    public final void rule__ALSOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4035:1: ( ( () ) )
            // InternalAlloyLanguage.g:4036:1: ( () )
            {
            // InternalAlloyLanguage.g:4036:1: ( () )
            // InternalAlloyLanguage.g:4037:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSOrAccess().getALSOrLeftOperandAction_1_0()); 
            }
            // InternalAlloyLanguage.g:4038:1: ()
            // InternalAlloyLanguage.g:4040:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSOrAccess().getALSOrLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOr__Group_1__0__Impl"


    // $ANTLR start "rule__ALSOr__Group_1__1"
    // InternalAlloyLanguage.g:4050:1: rule__ALSOr__Group_1__1 : rule__ALSOr__Group_1__1__Impl rule__ALSOr__Group_1__2 ;
    public final void rule__ALSOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4054:1: ( rule__ALSOr__Group_1__1__Impl rule__ALSOr__Group_1__2 )
            // InternalAlloyLanguage.g:4055:2: rule__ALSOr__Group_1__1__Impl rule__ALSOr__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSOr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSOr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOr__Group_1__1"


    // $ANTLR start "rule__ALSOr__Group_1__1__Impl"
    // InternalAlloyLanguage.g:4062:1: rule__ALSOr__Group_1__1__Impl : ( ( rule__ALSOr__Alternatives_1_1 ) ) ;
    public final void rule__ALSOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4066:1: ( ( ( rule__ALSOr__Alternatives_1_1 ) ) )
            // InternalAlloyLanguage.g:4067:1: ( ( rule__ALSOr__Alternatives_1_1 ) )
            {
            // InternalAlloyLanguage.g:4067:1: ( ( rule__ALSOr__Alternatives_1_1 ) )
            // InternalAlloyLanguage.g:4068:1: ( rule__ALSOr__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSOrAccess().getAlternatives_1_1()); 
            }
            // InternalAlloyLanguage.g:4069:1: ( rule__ALSOr__Alternatives_1_1 )
            // InternalAlloyLanguage.g:4069:2: rule__ALSOr__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSOr__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSOrAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOr__Group_1__1__Impl"


    // $ANTLR start "rule__ALSOr__Group_1__2"
    // InternalAlloyLanguage.g:4079:1: rule__ALSOr__Group_1__2 : rule__ALSOr__Group_1__2__Impl ;
    public final void rule__ALSOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4083:1: ( rule__ALSOr__Group_1__2__Impl )
            // InternalAlloyLanguage.g:4084:2: rule__ALSOr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSOr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOr__Group_1__2"


    // $ANTLR start "rule__ALSOr__Group_1__2__Impl"
    // InternalAlloyLanguage.g:4090:1: rule__ALSOr__Group_1__2__Impl : ( ( rule__ALSOr__RightOperandAssignment_1_2 ) ) ;
    public final void rule__ALSOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4094:1: ( ( ( rule__ALSOr__RightOperandAssignment_1_2 ) ) )
            // InternalAlloyLanguage.g:4095:1: ( ( rule__ALSOr__RightOperandAssignment_1_2 ) )
            {
            // InternalAlloyLanguage.g:4095:1: ( ( rule__ALSOr__RightOperandAssignment_1_2 ) )
            // InternalAlloyLanguage.g:4096:1: ( rule__ALSOr__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSOrAccess().getRightOperandAssignment_1_2()); 
            }
            // InternalAlloyLanguage.g:4097:1: ( rule__ALSOr__RightOperandAssignment_1_2 )
            // InternalAlloyLanguage.g:4097:2: rule__ALSOr__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSOr__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSOrAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOr__Group_1__2__Impl"


    // $ANTLR start "rule__ALSIff__Group__0"
    // InternalAlloyLanguage.g:4113:1: rule__ALSIff__Group__0 : rule__ALSIff__Group__0__Impl rule__ALSIff__Group__1 ;
    public final void rule__ALSIff__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4117:1: ( rule__ALSIff__Group__0__Impl rule__ALSIff__Group__1 )
            // InternalAlloyLanguage.g:4118:2: rule__ALSIff__Group__0__Impl rule__ALSIff__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ALSIff__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSIff__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIff__Group__0"


    // $ANTLR start "rule__ALSIff__Group__0__Impl"
    // InternalAlloyLanguage.g:4125:1: rule__ALSIff__Group__0__Impl : ( ruleALSImpl ) ;
    public final void rule__ALSIff__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4129:1: ( ( ruleALSImpl ) )
            // InternalAlloyLanguage.g:4130:1: ( ruleALSImpl )
            {
            // InternalAlloyLanguage.g:4130:1: ( ruleALSImpl )
            // InternalAlloyLanguage.g:4131:1: ruleALSImpl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIffAccess().getALSImplParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSImpl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIffAccess().getALSImplParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIff__Group__0__Impl"


    // $ANTLR start "rule__ALSIff__Group__1"
    // InternalAlloyLanguage.g:4142:1: rule__ALSIff__Group__1 : rule__ALSIff__Group__1__Impl ;
    public final void rule__ALSIff__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4146:1: ( rule__ALSIff__Group__1__Impl )
            // InternalAlloyLanguage.g:4147:2: rule__ALSIff__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSIff__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIff__Group__1"


    // $ANTLR start "rule__ALSIff__Group__1__Impl"
    // InternalAlloyLanguage.g:4153:1: rule__ALSIff__Group__1__Impl : ( ( rule__ALSIff__Group_1__0 )? ) ;
    public final void rule__ALSIff__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4157:1: ( ( ( rule__ALSIff__Group_1__0 )? ) )
            // InternalAlloyLanguage.g:4158:1: ( ( rule__ALSIff__Group_1__0 )? )
            {
            // InternalAlloyLanguage.g:4158:1: ( ( rule__ALSIff__Group_1__0 )? )
            // InternalAlloyLanguage.g:4159:1: ( rule__ALSIff__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIffAccess().getGroup_1()); 
            }
            // InternalAlloyLanguage.g:4160:1: ( rule__ALSIff__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=13 && LA31_0<=14)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAlloyLanguage.g:4160:2: rule__ALSIff__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSIff__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIffAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIff__Group__1__Impl"


    // $ANTLR start "rule__ALSIff__Group_1__0"
    // InternalAlloyLanguage.g:4174:1: rule__ALSIff__Group_1__0 : rule__ALSIff__Group_1__0__Impl rule__ALSIff__Group_1__1 ;
    public final void rule__ALSIff__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4178:1: ( rule__ALSIff__Group_1__0__Impl rule__ALSIff__Group_1__1 )
            // InternalAlloyLanguage.g:4179:2: rule__ALSIff__Group_1__0__Impl rule__ALSIff__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__ALSIff__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSIff__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIff__Group_1__0"


    // $ANTLR start "rule__ALSIff__Group_1__0__Impl"
    // InternalAlloyLanguage.g:4186:1: rule__ALSIff__Group_1__0__Impl : ( () ) ;
    public final void rule__ALSIff__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4190:1: ( ( () ) )
            // InternalAlloyLanguage.g:4191:1: ( () )
            {
            // InternalAlloyLanguage.g:4191:1: ( () )
            // InternalAlloyLanguage.g:4192:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIffAccess().getALSIffLeftOperandAction_1_0()); 
            }
            // InternalAlloyLanguage.g:4193:1: ()
            // InternalAlloyLanguage.g:4195:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIffAccess().getALSIffLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIff__Group_1__0__Impl"


    // $ANTLR start "rule__ALSIff__Group_1__1"
    // InternalAlloyLanguage.g:4205:1: rule__ALSIff__Group_1__1 : rule__ALSIff__Group_1__1__Impl rule__ALSIff__Group_1__2 ;
    public final void rule__ALSIff__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4209:1: ( rule__ALSIff__Group_1__1__Impl rule__ALSIff__Group_1__2 )
            // InternalAlloyLanguage.g:4210:2: rule__ALSIff__Group_1__1__Impl rule__ALSIff__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSIff__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSIff__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIff__Group_1__1"


    // $ANTLR start "rule__ALSIff__Group_1__1__Impl"
    // InternalAlloyLanguage.g:4217:1: rule__ALSIff__Group_1__1__Impl : ( ( rule__ALSIff__Alternatives_1_1 ) ) ;
    public final void rule__ALSIff__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4221:1: ( ( ( rule__ALSIff__Alternatives_1_1 ) ) )
            // InternalAlloyLanguage.g:4222:1: ( ( rule__ALSIff__Alternatives_1_1 ) )
            {
            // InternalAlloyLanguage.g:4222:1: ( ( rule__ALSIff__Alternatives_1_1 ) )
            // InternalAlloyLanguage.g:4223:1: ( rule__ALSIff__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIffAccess().getAlternatives_1_1()); 
            }
            // InternalAlloyLanguage.g:4224:1: ( rule__ALSIff__Alternatives_1_1 )
            // InternalAlloyLanguage.g:4224:2: rule__ALSIff__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSIff__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIffAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIff__Group_1__1__Impl"


    // $ANTLR start "rule__ALSIff__Group_1__2"
    // InternalAlloyLanguage.g:4234:1: rule__ALSIff__Group_1__2 : rule__ALSIff__Group_1__2__Impl ;
    public final void rule__ALSIff__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4238:1: ( rule__ALSIff__Group_1__2__Impl )
            // InternalAlloyLanguage.g:4239:2: rule__ALSIff__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSIff__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIff__Group_1__2"


    // $ANTLR start "rule__ALSIff__Group_1__2__Impl"
    // InternalAlloyLanguage.g:4245:1: rule__ALSIff__Group_1__2__Impl : ( ( rule__ALSIff__RightOperandAssignment_1_2 ) ) ;
    public final void rule__ALSIff__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4249:1: ( ( ( rule__ALSIff__RightOperandAssignment_1_2 ) ) )
            // InternalAlloyLanguage.g:4250:1: ( ( rule__ALSIff__RightOperandAssignment_1_2 ) )
            {
            // InternalAlloyLanguage.g:4250:1: ( ( rule__ALSIff__RightOperandAssignment_1_2 ) )
            // InternalAlloyLanguage.g:4251:1: ( rule__ALSIff__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIffAccess().getRightOperandAssignment_1_2()); 
            }
            // InternalAlloyLanguage.g:4252:1: ( rule__ALSIff__RightOperandAssignment_1_2 )
            // InternalAlloyLanguage.g:4252:2: rule__ALSIff__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSIff__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIffAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIff__Group_1__2__Impl"


    // $ANTLR start "rule__ALSImpl__Group__0"
    // InternalAlloyLanguage.g:4268:1: rule__ALSImpl__Group__0 : rule__ALSImpl__Group__0__Impl rule__ALSImpl__Group__1 ;
    public final void rule__ALSImpl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4272:1: ( rule__ALSImpl__Group__0__Impl rule__ALSImpl__Group__1 )
            // InternalAlloyLanguage.g:4273:2: rule__ALSImpl__Group__0__Impl rule__ALSImpl__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ALSImpl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSImpl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__Group__0"


    // $ANTLR start "rule__ALSImpl__Group__0__Impl"
    // InternalAlloyLanguage.g:4280:1: rule__ALSImpl__Group__0__Impl : ( ruleALSAnd ) ;
    public final void rule__ALSImpl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4284:1: ( ( ruleALSAnd ) )
            // InternalAlloyLanguage.g:4285:1: ( ruleALSAnd )
            {
            // InternalAlloyLanguage.g:4285:1: ( ruleALSAnd )
            // InternalAlloyLanguage.g:4286:1: ruleALSAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSImplAccess().getALSAndParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSImplAccess().getALSAndParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__Group__0__Impl"


    // $ANTLR start "rule__ALSImpl__Group__1"
    // InternalAlloyLanguage.g:4297:1: rule__ALSImpl__Group__1 : rule__ALSImpl__Group__1__Impl ;
    public final void rule__ALSImpl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4301:1: ( rule__ALSImpl__Group__1__Impl )
            // InternalAlloyLanguage.g:4302:2: rule__ALSImpl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSImpl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__Group__1"


    // $ANTLR start "rule__ALSImpl__Group__1__Impl"
    // InternalAlloyLanguage.g:4308:1: rule__ALSImpl__Group__1__Impl : ( ( rule__ALSImpl__Group_1__0 )? ) ;
    public final void rule__ALSImpl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4312:1: ( ( ( rule__ALSImpl__Group_1__0 )? ) )
            // InternalAlloyLanguage.g:4313:1: ( ( rule__ALSImpl__Group_1__0 )? )
            {
            // InternalAlloyLanguage.g:4313:1: ( ( rule__ALSImpl__Group_1__0 )? )
            // InternalAlloyLanguage.g:4314:1: ( rule__ALSImpl__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSImplAccess().getGroup_1()); 
            }
            // InternalAlloyLanguage.g:4315:1: ( rule__ALSImpl__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=15 && LA32_0<=16)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAlloyLanguage.g:4315:2: rule__ALSImpl__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSImpl__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSImplAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__Group__1__Impl"


    // $ANTLR start "rule__ALSImpl__Group_1__0"
    // InternalAlloyLanguage.g:4329:1: rule__ALSImpl__Group_1__0 : rule__ALSImpl__Group_1__0__Impl rule__ALSImpl__Group_1__1 ;
    public final void rule__ALSImpl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4333:1: ( rule__ALSImpl__Group_1__0__Impl rule__ALSImpl__Group_1__1 )
            // InternalAlloyLanguage.g:4334:2: rule__ALSImpl__Group_1__0__Impl rule__ALSImpl__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__ALSImpl__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSImpl__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__Group_1__0"


    // $ANTLR start "rule__ALSImpl__Group_1__0__Impl"
    // InternalAlloyLanguage.g:4341:1: rule__ALSImpl__Group_1__0__Impl : ( () ) ;
    public final void rule__ALSImpl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4345:1: ( ( () ) )
            // InternalAlloyLanguage.g:4346:1: ( () )
            {
            // InternalAlloyLanguage.g:4346:1: ( () )
            // InternalAlloyLanguage.g:4347:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSImplAccess().getALSImplLeftOperandAction_1_0()); 
            }
            // InternalAlloyLanguage.g:4348:1: ()
            // InternalAlloyLanguage.g:4350:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSImplAccess().getALSImplLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__Group_1__0__Impl"


    // $ANTLR start "rule__ALSImpl__Group_1__1"
    // InternalAlloyLanguage.g:4360:1: rule__ALSImpl__Group_1__1 : rule__ALSImpl__Group_1__1__Impl rule__ALSImpl__Group_1__2 ;
    public final void rule__ALSImpl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4364:1: ( rule__ALSImpl__Group_1__1__Impl rule__ALSImpl__Group_1__2 )
            // InternalAlloyLanguage.g:4365:2: rule__ALSImpl__Group_1__1__Impl rule__ALSImpl__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSImpl__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSImpl__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__Group_1__1"


    // $ANTLR start "rule__ALSImpl__Group_1__1__Impl"
    // InternalAlloyLanguage.g:4372:1: rule__ALSImpl__Group_1__1__Impl : ( ( rule__ALSImpl__Alternatives_1_1 ) ) ;
    public final void rule__ALSImpl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4376:1: ( ( ( rule__ALSImpl__Alternatives_1_1 ) ) )
            // InternalAlloyLanguage.g:4377:1: ( ( rule__ALSImpl__Alternatives_1_1 ) )
            {
            // InternalAlloyLanguage.g:4377:1: ( ( rule__ALSImpl__Alternatives_1_1 ) )
            // InternalAlloyLanguage.g:4378:1: ( rule__ALSImpl__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSImplAccess().getAlternatives_1_1()); 
            }
            // InternalAlloyLanguage.g:4379:1: ( rule__ALSImpl__Alternatives_1_1 )
            // InternalAlloyLanguage.g:4379:2: rule__ALSImpl__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSImpl__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSImplAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__Group_1__1__Impl"


    // $ANTLR start "rule__ALSImpl__Group_1__2"
    // InternalAlloyLanguage.g:4389:1: rule__ALSImpl__Group_1__2 : rule__ALSImpl__Group_1__2__Impl rule__ALSImpl__Group_1__3 ;
    public final void rule__ALSImpl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4393:1: ( rule__ALSImpl__Group_1__2__Impl rule__ALSImpl__Group_1__3 )
            // InternalAlloyLanguage.g:4394:2: rule__ALSImpl__Group_1__2__Impl rule__ALSImpl__Group_1__3
            {
            pushFollow(FOLLOW_28);
            rule__ALSImpl__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSImpl__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__Group_1__2"


    // $ANTLR start "rule__ALSImpl__Group_1__2__Impl"
    // InternalAlloyLanguage.g:4401:1: rule__ALSImpl__Group_1__2__Impl : ( ( rule__ALSImpl__RightOperandAssignment_1_2 ) ) ;
    public final void rule__ALSImpl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4405:1: ( ( ( rule__ALSImpl__RightOperandAssignment_1_2 ) ) )
            // InternalAlloyLanguage.g:4406:1: ( ( rule__ALSImpl__RightOperandAssignment_1_2 ) )
            {
            // InternalAlloyLanguage.g:4406:1: ( ( rule__ALSImpl__RightOperandAssignment_1_2 ) )
            // InternalAlloyLanguage.g:4407:1: ( rule__ALSImpl__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSImplAccess().getRightOperandAssignment_1_2()); 
            }
            // InternalAlloyLanguage.g:4408:1: ( rule__ALSImpl__RightOperandAssignment_1_2 )
            // InternalAlloyLanguage.g:4408:2: rule__ALSImpl__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSImpl__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSImplAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__Group_1__2__Impl"


    // $ANTLR start "rule__ALSImpl__Group_1__3"
    // InternalAlloyLanguage.g:4418:1: rule__ALSImpl__Group_1__3 : rule__ALSImpl__Group_1__3__Impl ;
    public final void rule__ALSImpl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4422:1: ( rule__ALSImpl__Group_1__3__Impl )
            // InternalAlloyLanguage.g:4423:2: rule__ALSImpl__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSImpl__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__Group_1__3"


    // $ANTLR start "rule__ALSImpl__Group_1__3__Impl"
    // InternalAlloyLanguage.g:4429:1: rule__ALSImpl__Group_1__3__Impl : ( ( rule__ALSImpl__Group_1_3__0 )? ) ;
    public final void rule__ALSImpl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4433:1: ( ( ( rule__ALSImpl__Group_1_3__0 )? ) )
            // InternalAlloyLanguage.g:4434:1: ( ( rule__ALSImpl__Group_1_3__0 )? )
            {
            // InternalAlloyLanguage.g:4434:1: ( ( rule__ALSImpl__Group_1_3__0 )? )
            // InternalAlloyLanguage.g:4435:1: ( rule__ALSImpl__Group_1_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSImplAccess().getGroup_1_3()); 
            }
            // InternalAlloyLanguage.g:4436:1: ( rule__ALSImpl__Group_1_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAlloyLanguage.g:4436:2: rule__ALSImpl__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSImpl__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSImplAccess().getGroup_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__Group_1__3__Impl"


    // $ANTLR start "rule__ALSImpl__Group_1_3__0"
    // InternalAlloyLanguage.g:4454:1: rule__ALSImpl__Group_1_3__0 : rule__ALSImpl__Group_1_3__0__Impl rule__ALSImpl__Group_1_3__1 ;
    public final void rule__ALSImpl__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4458:1: ( rule__ALSImpl__Group_1_3__0__Impl rule__ALSImpl__Group_1_3__1 )
            // InternalAlloyLanguage.g:4459:2: rule__ALSImpl__Group_1_3__0__Impl rule__ALSImpl__Group_1_3__1
            {
            pushFollow(FOLLOW_16);
            rule__ALSImpl__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSImpl__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__Group_1_3__0"


    // $ANTLR start "rule__ALSImpl__Group_1_3__0__Impl"
    // InternalAlloyLanguage.g:4466:1: rule__ALSImpl__Group_1_3__0__Impl : ( 'else' ) ;
    public final void rule__ALSImpl__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4470:1: ( ( 'else' ) )
            // InternalAlloyLanguage.g:4471:1: ( 'else' )
            {
            // InternalAlloyLanguage.g:4471:1: ( 'else' )
            // InternalAlloyLanguage.g:4472:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSImplAccess().getElseKeyword_1_3_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSImplAccess().getElseKeyword_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__Group_1_3__0__Impl"


    // $ANTLR start "rule__ALSImpl__Group_1_3__1"
    // InternalAlloyLanguage.g:4485:1: rule__ALSImpl__Group_1_3__1 : rule__ALSImpl__Group_1_3__1__Impl ;
    public final void rule__ALSImpl__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4489:1: ( rule__ALSImpl__Group_1_3__1__Impl )
            // InternalAlloyLanguage.g:4490:2: rule__ALSImpl__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSImpl__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__Group_1_3__1"


    // $ANTLR start "rule__ALSImpl__Group_1_3__1__Impl"
    // InternalAlloyLanguage.g:4496:1: rule__ALSImpl__Group_1_3__1__Impl : ( ( rule__ALSImpl__ElseOperandAssignment_1_3_1 ) ) ;
    public final void rule__ALSImpl__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4500:1: ( ( ( rule__ALSImpl__ElseOperandAssignment_1_3_1 ) ) )
            // InternalAlloyLanguage.g:4501:1: ( ( rule__ALSImpl__ElseOperandAssignment_1_3_1 ) )
            {
            // InternalAlloyLanguage.g:4501:1: ( ( rule__ALSImpl__ElseOperandAssignment_1_3_1 ) )
            // InternalAlloyLanguage.g:4502:1: ( rule__ALSImpl__ElseOperandAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSImplAccess().getElseOperandAssignment_1_3_1()); 
            }
            // InternalAlloyLanguage.g:4503:1: ( rule__ALSImpl__ElseOperandAssignment_1_3_1 )
            // InternalAlloyLanguage.g:4503:2: rule__ALSImpl__ElseOperandAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSImpl__ElseOperandAssignment_1_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSImplAccess().getElseOperandAssignment_1_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__Group_1_3__1__Impl"


    // $ANTLR start "rule__ALSAnd__Group__0"
    // InternalAlloyLanguage.g:4517:1: rule__ALSAnd__Group__0 : rule__ALSAnd__Group__0__Impl rule__ALSAnd__Group__1 ;
    public final void rule__ALSAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4521:1: ( rule__ALSAnd__Group__0__Impl rule__ALSAnd__Group__1 )
            // InternalAlloyLanguage.g:4522:2: rule__ALSAnd__Group__0__Impl rule__ALSAnd__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__ALSAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSAnd__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSAnd__Group__0"


    // $ANTLR start "rule__ALSAnd__Group__0__Impl"
    // InternalAlloyLanguage.g:4529:1: rule__ALSAnd__Group__0__Impl : ( ruleALSComparison ) ;
    public final void rule__ALSAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4533:1: ( ( ruleALSComparison ) )
            // InternalAlloyLanguage.g:4534:1: ( ruleALSComparison )
            {
            // InternalAlloyLanguage.g:4534:1: ( ruleALSComparison )
            // InternalAlloyLanguage.g:4535:1: ruleALSComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSAndAccess().getALSComparisonParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSAndAccess().getALSComparisonParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSAnd__Group__0__Impl"


    // $ANTLR start "rule__ALSAnd__Group__1"
    // InternalAlloyLanguage.g:4546:1: rule__ALSAnd__Group__1 : rule__ALSAnd__Group__1__Impl ;
    public final void rule__ALSAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4550:1: ( rule__ALSAnd__Group__1__Impl )
            // InternalAlloyLanguage.g:4551:2: rule__ALSAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSAnd__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSAnd__Group__1"


    // $ANTLR start "rule__ALSAnd__Group__1__Impl"
    // InternalAlloyLanguage.g:4557:1: rule__ALSAnd__Group__1__Impl : ( ( rule__ALSAnd__Group_1__0 )? ) ;
    public final void rule__ALSAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4561:1: ( ( ( rule__ALSAnd__Group_1__0 )? ) )
            // InternalAlloyLanguage.g:4562:1: ( ( rule__ALSAnd__Group_1__0 )? )
            {
            // InternalAlloyLanguage.g:4562:1: ( ( rule__ALSAnd__Group_1__0 )? )
            // InternalAlloyLanguage.g:4563:1: ( rule__ALSAnd__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSAndAccess().getGroup_1()); 
            }
            // InternalAlloyLanguage.g:4564:1: ( rule__ALSAnd__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=17 && LA34_0<=18)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAlloyLanguage.g:4564:2: rule__ALSAnd__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSAnd__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSAndAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSAnd__Group__1__Impl"


    // $ANTLR start "rule__ALSAnd__Group_1__0"
    // InternalAlloyLanguage.g:4578:1: rule__ALSAnd__Group_1__0 : rule__ALSAnd__Group_1__0__Impl rule__ALSAnd__Group_1__1 ;
    public final void rule__ALSAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4582:1: ( rule__ALSAnd__Group_1__0__Impl rule__ALSAnd__Group_1__1 )
            // InternalAlloyLanguage.g:4583:2: rule__ALSAnd__Group_1__0__Impl rule__ALSAnd__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__ALSAnd__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSAnd__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSAnd__Group_1__0"


    // $ANTLR start "rule__ALSAnd__Group_1__0__Impl"
    // InternalAlloyLanguage.g:4590:1: rule__ALSAnd__Group_1__0__Impl : ( () ) ;
    public final void rule__ALSAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4594:1: ( ( () ) )
            // InternalAlloyLanguage.g:4595:1: ( () )
            {
            // InternalAlloyLanguage.g:4595:1: ( () )
            // InternalAlloyLanguage.g:4596:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSAndAccess().getALSAndLeftOperandAction_1_0()); 
            }
            // InternalAlloyLanguage.g:4597:1: ()
            // InternalAlloyLanguage.g:4599:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSAndAccess().getALSAndLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSAnd__Group_1__0__Impl"


    // $ANTLR start "rule__ALSAnd__Group_1__1"
    // InternalAlloyLanguage.g:4609:1: rule__ALSAnd__Group_1__1 : rule__ALSAnd__Group_1__1__Impl rule__ALSAnd__Group_1__2 ;
    public final void rule__ALSAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4613:1: ( rule__ALSAnd__Group_1__1__Impl rule__ALSAnd__Group_1__2 )
            // InternalAlloyLanguage.g:4614:2: rule__ALSAnd__Group_1__1__Impl rule__ALSAnd__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSAnd__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSAnd__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSAnd__Group_1__1"


    // $ANTLR start "rule__ALSAnd__Group_1__1__Impl"
    // InternalAlloyLanguage.g:4621:1: rule__ALSAnd__Group_1__1__Impl : ( ( rule__ALSAnd__Alternatives_1_1 ) ) ;
    public final void rule__ALSAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4625:1: ( ( ( rule__ALSAnd__Alternatives_1_1 ) ) )
            // InternalAlloyLanguage.g:4626:1: ( ( rule__ALSAnd__Alternatives_1_1 ) )
            {
            // InternalAlloyLanguage.g:4626:1: ( ( rule__ALSAnd__Alternatives_1_1 ) )
            // InternalAlloyLanguage.g:4627:1: ( rule__ALSAnd__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSAndAccess().getAlternatives_1_1()); 
            }
            // InternalAlloyLanguage.g:4628:1: ( rule__ALSAnd__Alternatives_1_1 )
            // InternalAlloyLanguage.g:4628:2: rule__ALSAnd__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSAnd__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSAndAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSAnd__Group_1__1__Impl"


    // $ANTLR start "rule__ALSAnd__Group_1__2"
    // InternalAlloyLanguage.g:4638:1: rule__ALSAnd__Group_1__2 : rule__ALSAnd__Group_1__2__Impl ;
    public final void rule__ALSAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4642:1: ( rule__ALSAnd__Group_1__2__Impl )
            // InternalAlloyLanguage.g:4643:2: rule__ALSAnd__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSAnd__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSAnd__Group_1__2"


    // $ANTLR start "rule__ALSAnd__Group_1__2__Impl"
    // InternalAlloyLanguage.g:4649:1: rule__ALSAnd__Group_1__2__Impl : ( ( rule__ALSAnd__RightOperandAssignment_1_2 ) ) ;
    public final void rule__ALSAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4653:1: ( ( ( rule__ALSAnd__RightOperandAssignment_1_2 ) ) )
            // InternalAlloyLanguage.g:4654:1: ( ( rule__ALSAnd__RightOperandAssignment_1_2 ) )
            {
            // InternalAlloyLanguage.g:4654:1: ( ( rule__ALSAnd__RightOperandAssignment_1_2 ) )
            // InternalAlloyLanguage.g:4655:1: ( rule__ALSAnd__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSAndAccess().getRightOperandAssignment_1_2()); 
            }
            // InternalAlloyLanguage.g:4656:1: ( rule__ALSAnd__RightOperandAssignment_1_2 )
            // InternalAlloyLanguage.g:4656:2: rule__ALSAnd__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSAnd__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSAndAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSAnd__Group_1__2__Impl"


    // $ANTLR start "rule__ALSComparison__Group__0"
    // InternalAlloyLanguage.g:4672:1: rule__ALSComparison__Group__0 : rule__ALSComparison__Group__0__Impl rule__ALSComparison__Group__1 ;
    public final void rule__ALSComparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4676:1: ( rule__ALSComparison__Group__0__Impl rule__ALSComparison__Group__1 )
            // InternalAlloyLanguage.g:4677:2: rule__ALSComparison__Group__0__Impl rule__ALSComparison__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ALSComparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group__0"


    // $ANTLR start "rule__ALSComparison__Group__0__Impl"
    // InternalAlloyLanguage.g:4684:1: rule__ALSComparison__Group__0__Impl : ( ruleALSOverride ) ;
    public final void rule__ALSComparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4688:1: ( ( ruleALSOverride ) )
            // InternalAlloyLanguage.g:4689:1: ( ruleALSOverride )
            {
            // InternalAlloyLanguage.g:4689:1: ( ruleALSOverride )
            // InternalAlloyLanguage.g:4690:1: ruleALSOverride
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getALSOverrideParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSOverride();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getALSOverrideParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group__0__Impl"


    // $ANTLR start "rule__ALSComparison__Group__1"
    // InternalAlloyLanguage.g:4701:1: rule__ALSComparison__Group__1 : rule__ALSComparison__Group__1__Impl ;
    public final void rule__ALSComparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4705:1: ( rule__ALSComparison__Group__1__Impl )
            // InternalAlloyLanguage.g:4706:2: rule__ALSComparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group__1"


    // $ANTLR start "rule__ALSComparison__Group__1__Impl"
    // InternalAlloyLanguage.g:4712:1: rule__ALSComparison__Group__1__Impl : ( ( rule__ALSComparison__Group_1__0 )? ) ;
    public final void rule__ALSComparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4716:1: ( ( ( rule__ALSComparison__Group_1__0 )? ) )
            // InternalAlloyLanguage.g:4717:1: ( ( rule__ALSComparison__Group_1__0 )? )
            {
            // InternalAlloyLanguage.g:4717:1: ( ( rule__ALSComparison__Group_1__0 )? )
            // InternalAlloyLanguage.g:4718:1: ( rule__ALSComparison__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getGroup_1()); 
            }
            // InternalAlloyLanguage.g:4719:1: ( rule__ALSComparison__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38||(LA35_0>=47 && LA35_0<=52)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAlloyLanguage.g:4719:2: rule__ALSComparison__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSComparison__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group__1__Impl"


    // $ANTLR start "rule__ALSComparison__Group_1__0"
    // InternalAlloyLanguage.g:4733:1: rule__ALSComparison__Group_1__0 : rule__ALSComparison__Group_1__0__Impl rule__ALSComparison__Group_1__1 ;
    public final void rule__ALSComparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4737:1: ( rule__ALSComparison__Group_1__0__Impl rule__ALSComparison__Group_1__1 )
            // InternalAlloyLanguage.g:4738:2: rule__ALSComparison__Group_1__0__Impl rule__ALSComparison__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__ALSComparison__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1__0"


    // $ANTLR start "rule__ALSComparison__Group_1__0__Impl"
    // InternalAlloyLanguage.g:4745:1: rule__ALSComparison__Group_1__0__Impl : ( ( rule__ALSComparison__Alternatives_1_0 ) ) ;
    public final void rule__ALSComparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4749:1: ( ( ( rule__ALSComparison__Alternatives_1_0 ) ) )
            // InternalAlloyLanguage.g:4750:1: ( ( rule__ALSComparison__Alternatives_1_0 ) )
            {
            // InternalAlloyLanguage.g:4750:1: ( ( rule__ALSComparison__Alternatives_1_0 ) )
            // InternalAlloyLanguage.g:4751:1: ( rule__ALSComparison__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getAlternatives_1_0()); 
            }
            // InternalAlloyLanguage.g:4752:1: ( rule__ALSComparison__Alternatives_1_0 )
            // InternalAlloyLanguage.g:4752:2: rule__ALSComparison__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1__0__Impl"


    // $ANTLR start "rule__ALSComparison__Group_1__1"
    // InternalAlloyLanguage.g:4762:1: rule__ALSComparison__Group_1__1 : rule__ALSComparison__Group_1__1__Impl ;
    public final void rule__ALSComparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4766:1: ( rule__ALSComparison__Group_1__1__Impl )
            // InternalAlloyLanguage.g:4767:2: rule__ALSComparison__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1__1"


    // $ANTLR start "rule__ALSComparison__Group_1__1__Impl"
    // InternalAlloyLanguage.g:4773:1: rule__ALSComparison__Group_1__1__Impl : ( ( rule__ALSComparison__RightOperandAssignment_1_1 ) ) ;
    public final void rule__ALSComparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4777:1: ( ( ( rule__ALSComparison__RightOperandAssignment_1_1 ) ) )
            // InternalAlloyLanguage.g:4778:1: ( ( rule__ALSComparison__RightOperandAssignment_1_1 ) )
            {
            // InternalAlloyLanguage.g:4778:1: ( ( rule__ALSComparison__RightOperandAssignment_1_1 ) )
            // InternalAlloyLanguage.g:4779:1: ( rule__ALSComparison__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalAlloyLanguage.g:4780:1: ( rule__ALSComparison__RightOperandAssignment_1_1 )
            // InternalAlloyLanguage.g:4780:2: rule__ALSComparison__RightOperandAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSComparison__RightOperandAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getRightOperandAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1__1__Impl"


    // $ANTLR start "rule__ALSComparison__Group_1_0_0__0"
    // InternalAlloyLanguage.g:4794:1: rule__ALSComparison__Group_1_0_0__0 : rule__ALSComparison__Group_1_0_0__0__Impl rule__ALSComparison__Group_1_0_0__1 ;
    public final void rule__ALSComparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4798:1: ( rule__ALSComparison__Group_1_0_0__0__Impl rule__ALSComparison__Group_1_0_0__1 )
            // InternalAlloyLanguage.g:4799:2: rule__ALSComparison__Group_1_0_0__0__Impl rule__ALSComparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_31);
            rule__ALSComparison__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_0__0"


    // $ANTLR start "rule__ALSComparison__Group_1_0_0__0__Impl"
    // InternalAlloyLanguage.g:4806:1: rule__ALSComparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ALSComparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4810:1: ( ( () ) )
            // InternalAlloyLanguage.g:4811:1: ( () )
            {
            // InternalAlloyLanguage.g:4811:1: ( () )
            // InternalAlloyLanguage.g:4812:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getALSEqualsLeftOperandAction_1_0_0_0()); 
            }
            // InternalAlloyLanguage.g:4813:1: ()
            // InternalAlloyLanguage.g:4815:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getALSEqualsLeftOperandAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__ALSComparison__Group_1_0_0__1"
    // InternalAlloyLanguage.g:4825:1: rule__ALSComparison__Group_1_0_0__1 : rule__ALSComparison__Group_1_0_0__1__Impl ;
    public final void rule__ALSComparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4829:1: ( rule__ALSComparison__Group_1_0_0__1__Impl )
            // InternalAlloyLanguage.g:4830:2: rule__ALSComparison__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_0__1"


    // $ANTLR start "rule__ALSComparison__Group_1_0_0__1__Impl"
    // InternalAlloyLanguage.g:4836:1: rule__ALSComparison__Group_1_0_0__1__Impl : ( '=' ) ;
    public final void rule__ALSComparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4840:1: ( ( '=' ) )
            // InternalAlloyLanguage.g:4841:1: ( '=' )
            {
            // InternalAlloyLanguage.g:4841:1: ( '=' )
            // InternalAlloyLanguage.g:4842:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getEqualsSignKeyword_1_0_0_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getEqualsSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__ALSComparison__Group_1_0_1__0"
    // InternalAlloyLanguage.g:4859:1: rule__ALSComparison__Group_1_0_1__0 : rule__ALSComparison__Group_1_0_1__0__Impl rule__ALSComparison__Group_1_0_1__1 ;
    public final void rule__ALSComparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4863:1: ( rule__ALSComparison__Group_1_0_1__0__Impl rule__ALSComparison__Group_1_0_1__1 )
            // InternalAlloyLanguage.g:4864:2: rule__ALSComparison__Group_1_0_1__0__Impl rule__ALSComparison__Group_1_0_1__1
            {
            pushFollow(FOLLOW_32);
            rule__ALSComparison__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_1__0"


    // $ANTLR start "rule__ALSComparison__Group_1_0_1__0__Impl"
    // InternalAlloyLanguage.g:4871:1: rule__ALSComparison__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__ALSComparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4875:1: ( ( () ) )
            // InternalAlloyLanguage.g:4876:1: ( () )
            {
            // InternalAlloyLanguage.g:4876:1: ( () )
            // InternalAlloyLanguage.g:4877:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getALSNotEqualsLeftOperandAction_1_0_1_0()); 
            }
            // InternalAlloyLanguage.g:4878:1: ()
            // InternalAlloyLanguage.g:4880:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getALSNotEqualsLeftOperandAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__ALSComparison__Group_1_0_1__1"
    // InternalAlloyLanguage.g:4890:1: rule__ALSComparison__Group_1_0_1__1 : rule__ALSComparison__Group_1_0_1__1__Impl ;
    public final void rule__ALSComparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4894:1: ( rule__ALSComparison__Group_1_0_1__1__Impl )
            // InternalAlloyLanguage.g:4895:2: rule__ALSComparison__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_1__1"


    // $ANTLR start "rule__ALSComparison__Group_1_0_1__1__Impl"
    // InternalAlloyLanguage.g:4901:1: rule__ALSComparison__Group_1_0_1__1__Impl : ( '!=' ) ;
    public final void rule__ALSComparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4905:1: ( ( '!=' ) )
            // InternalAlloyLanguage.g:4906:1: ( '!=' )
            {
            // InternalAlloyLanguage.g:4906:1: ( '!=' )
            // InternalAlloyLanguage.g:4907:1: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__ALSComparison__Group_1_0_2__0"
    // InternalAlloyLanguage.g:4924:1: rule__ALSComparison__Group_1_0_2__0 : rule__ALSComparison__Group_1_0_2__0__Impl rule__ALSComparison__Group_1_0_2__1 ;
    public final void rule__ALSComparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4928:1: ( rule__ALSComparison__Group_1_0_2__0__Impl rule__ALSComparison__Group_1_0_2__1 )
            // InternalAlloyLanguage.g:4929:2: rule__ALSComparison__Group_1_0_2__0__Impl rule__ALSComparison__Group_1_0_2__1
            {
            pushFollow(FOLLOW_33);
            rule__ALSComparison__Group_1_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group_1_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_2__0"


    // $ANTLR start "rule__ALSComparison__Group_1_0_2__0__Impl"
    // InternalAlloyLanguage.g:4936:1: rule__ALSComparison__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__ALSComparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4940:1: ( ( () ) )
            // InternalAlloyLanguage.g:4941:1: ( () )
            {
            // InternalAlloyLanguage.g:4941:1: ( () )
            // InternalAlloyLanguage.g:4942:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getALSSubsetLeftOperandAction_1_0_2_0()); 
            }
            // InternalAlloyLanguage.g:4943:1: ()
            // InternalAlloyLanguage.g:4945:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getALSSubsetLeftOperandAction_1_0_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__ALSComparison__Group_1_0_2__1"
    // InternalAlloyLanguage.g:4955:1: rule__ALSComparison__Group_1_0_2__1 : rule__ALSComparison__Group_1_0_2__1__Impl ;
    public final void rule__ALSComparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4959:1: ( rule__ALSComparison__Group_1_0_2__1__Impl )
            // InternalAlloyLanguage.g:4960:2: rule__ALSComparison__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group_1_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_2__1"


    // $ANTLR start "rule__ALSComparison__Group_1_0_2__1__Impl"
    // InternalAlloyLanguage.g:4966:1: rule__ALSComparison__Group_1_0_2__1__Impl : ( 'in' ) ;
    public final void rule__ALSComparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4970:1: ( ( 'in' ) )
            // InternalAlloyLanguage.g:4971:1: ( 'in' )
            {
            // InternalAlloyLanguage.g:4971:1: ( 'in' )
            // InternalAlloyLanguage.g:4972:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getInKeyword_1_0_2_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getInKeyword_1_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__ALSComparison__Group_1_0_3__0"
    // InternalAlloyLanguage.g:4989:1: rule__ALSComparison__Group_1_0_3__0 : rule__ALSComparison__Group_1_0_3__0__Impl rule__ALSComparison__Group_1_0_3__1 ;
    public final void rule__ALSComparison__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:4993:1: ( rule__ALSComparison__Group_1_0_3__0__Impl rule__ALSComparison__Group_1_0_3__1 )
            // InternalAlloyLanguage.g:4994:2: rule__ALSComparison__Group_1_0_3__0__Impl rule__ALSComparison__Group_1_0_3__1
            {
            pushFollow(FOLLOW_34);
            rule__ALSComparison__Group_1_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group_1_0_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_3__0"


    // $ANTLR start "rule__ALSComparison__Group_1_0_3__0__Impl"
    // InternalAlloyLanguage.g:5001:1: rule__ALSComparison__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__ALSComparison__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5005:1: ( ( () ) )
            // InternalAlloyLanguage.g:5006:1: ( () )
            {
            // InternalAlloyLanguage.g:5006:1: ( () )
            // InternalAlloyLanguage.g:5007:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getALSLessLeftOperandAction_1_0_3_0()); 
            }
            // InternalAlloyLanguage.g:5008:1: ()
            // InternalAlloyLanguage.g:5010:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getALSLessLeftOperandAction_1_0_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__ALSComparison__Group_1_0_3__1"
    // InternalAlloyLanguage.g:5020:1: rule__ALSComparison__Group_1_0_3__1 : rule__ALSComparison__Group_1_0_3__1__Impl ;
    public final void rule__ALSComparison__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5024:1: ( rule__ALSComparison__Group_1_0_3__1__Impl )
            // InternalAlloyLanguage.g:5025:2: rule__ALSComparison__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group_1_0_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_3__1"


    // $ANTLR start "rule__ALSComparison__Group_1_0_3__1__Impl"
    // InternalAlloyLanguage.g:5031:1: rule__ALSComparison__Group_1_0_3__1__Impl : ( '>' ) ;
    public final void rule__ALSComparison__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5035:1: ( ( '>' ) )
            // InternalAlloyLanguage.g:5036:1: ( '>' )
            {
            // InternalAlloyLanguage.g:5036:1: ( '>' )
            // InternalAlloyLanguage.g:5037:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getGreaterThanSignKeyword_1_0_3_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getGreaterThanSignKeyword_1_0_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__ALSComparison__Group_1_0_4__0"
    // InternalAlloyLanguage.g:5054:1: rule__ALSComparison__Group_1_0_4__0 : rule__ALSComparison__Group_1_0_4__0__Impl rule__ALSComparison__Group_1_0_4__1 ;
    public final void rule__ALSComparison__Group_1_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5058:1: ( rule__ALSComparison__Group_1_0_4__0__Impl rule__ALSComparison__Group_1_0_4__1 )
            // InternalAlloyLanguage.g:5059:2: rule__ALSComparison__Group_1_0_4__0__Impl rule__ALSComparison__Group_1_0_4__1
            {
            pushFollow(FOLLOW_35);
            rule__ALSComparison__Group_1_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group_1_0_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_4__0"


    // $ANTLR start "rule__ALSComparison__Group_1_0_4__0__Impl"
    // InternalAlloyLanguage.g:5066:1: rule__ALSComparison__Group_1_0_4__0__Impl : ( () ) ;
    public final void rule__ALSComparison__Group_1_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5070:1: ( ( () ) )
            // InternalAlloyLanguage.g:5071:1: ( () )
            {
            // InternalAlloyLanguage.g:5071:1: ( () )
            // InternalAlloyLanguage.g:5072:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getALSLeqLeftOperandAction_1_0_4_0()); 
            }
            // InternalAlloyLanguage.g:5073:1: ()
            // InternalAlloyLanguage.g:5075:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getALSLeqLeftOperandAction_1_0_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_4__0__Impl"


    // $ANTLR start "rule__ALSComparison__Group_1_0_4__1"
    // InternalAlloyLanguage.g:5085:1: rule__ALSComparison__Group_1_0_4__1 : rule__ALSComparison__Group_1_0_4__1__Impl ;
    public final void rule__ALSComparison__Group_1_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5089:1: ( rule__ALSComparison__Group_1_0_4__1__Impl )
            // InternalAlloyLanguage.g:5090:2: rule__ALSComparison__Group_1_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group_1_0_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_4__1"


    // $ANTLR start "rule__ALSComparison__Group_1_0_4__1__Impl"
    // InternalAlloyLanguage.g:5096:1: rule__ALSComparison__Group_1_0_4__1__Impl : ( '>=' ) ;
    public final void rule__ALSComparison__Group_1_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5100:1: ( ( '>=' ) )
            // InternalAlloyLanguage.g:5101:1: ( '>=' )
            {
            // InternalAlloyLanguage.g:5101:1: ( '>=' )
            // InternalAlloyLanguage.g:5102:1: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_4_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_4__1__Impl"


    // $ANTLR start "rule__ALSComparison__Group_1_0_5__0"
    // InternalAlloyLanguage.g:5119:1: rule__ALSComparison__Group_1_0_5__0 : rule__ALSComparison__Group_1_0_5__0__Impl rule__ALSComparison__Group_1_0_5__1 ;
    public final void rule__ALSComparison__Group_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5123:1: ( rule__ALSComparison__Group_1_0_5__0__Impl rule__ALSComparison__Group_1_0_5__1 )
            // InternalAlloyLanguage.g:5124:2: rule__ALSComparison__Group_1_0_5__0__Impl rule__ALSComparison__Group_1_0_5__1
            {
            pushFollow(FOLLOW_36);
            rule__ALSComparison__Group_1_0_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group_1_0_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_5__0"


    // $ANTLR start "rule__ALSComparison__Group_1_0_5__0__Impl"
    // InternalAlloyLanguage.g:5131:1: rule__ALSComparison__Group_1_0_5__0__Impl : ( () ) ;
    public final void rule__ALSComparison__Group_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5135:1: ( ( () ) )
            // InternalAlloyLanguage.g:5136:1: ( () )
            {
            // InternalAlloyLanguage.g:5136:1: ( () )
            // InternalAlloyLanguage.g:5137:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getALSMoreLeftOperandAction_1_0_5_0()); 
            }
            // InternalAlloyLanguage.g:5138:1: ()
            // InternalAlloyLanguage.g:5140:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getALSMoreLeftOperandAction_1_0_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_5__0__Impl"


    // $ANTLR start "rule__ALSComparison__Group_1_0_5__1"
    // InternalAlloyLanguage.g:5150:1: rule__ALSComparison__Group_1_0_5__1 : rule__ALSComparison__Group_1_0_5__1__Impl ;
    public final void rule__ALSComparison__Group_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5154:1: ( rule__ALSComparison__Group_1_0_5__1__Impl )
            // InternalAlloyLanguage.g:5155:2: rule__ALSComparison__Group_1_0_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group_1_0_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_5__1"


    // $ANTLR start "rule__ALSComparison__Group_1_0_5__1__Impl"
    // InternalAlloyLanguage.g:5161:1: rule__ALSComparison__Group_1_0_5__1__Impl : ( '<' ) ;
    public final void rule__ALSComparison__Group_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5165:1: ( ( '<' ) )
            // InternalAlloyLanguage.g:5166:1: ( '<' )
            {
            // InternalAlloyLanguage.g:5166:1: ( '<' )
            // InternalAlloyLanguage.g:5167:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getLessThanSignKeyword_1_0_5_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getLessThanSignKeyword_1_0_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_5__1__Impl"


    // $ANTLR start "rule__ALSComparison__Group_1_0_6__0"
    // InternalAlloyLanguage.g:5184:1: rule__ALSComparison__Group_1_0_6__0 : rule__ALSComparison__Group_1_0_6__0__Impl rule__ALSComparison__Group_1_0_6__1 ;
    public final void rule__ALSComparison__Group_1_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5188:1: ( rule__ALSComparison__Group_1_0_6__0__Impl rule__ALSComparison__Group_1_0_6__1 )
            // InternalAlloyLanguage.g:5189:2: rule__ALSComparison__Group_1_0_6__0__Impl rule__ALSComparison__Group_1_0_6__1
            {
            pushFollow(FOLLOW_30);
            rule__ALSComparison__Group_1_0_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group_1_0_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_6__0"


    // $ANTLR start "rule__ALSComparison__Group_1_0_6__0__Impl"
    // InternalAlloyLanguage.g:5196:1: rule__ALSComparison__Group_1_0_6__0__Impl : ( () ) ;
    public final void rule__ALSComparison__Group_1_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5200:1: ( ( () ) )
            // InternalAlloyLanguage.g:5201:1: ( () )
            {
            // InternalAlloyLanguage.g:5201:1: ( () )
            // InternalAlloyLanguage.g:5202:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getALSMeqLeftOperandAction_1_0_6_0()); 
            }
            // InternalAlloyLanguage.g:5203:1: ()
            // InternalAlloyLanguage.g:5205:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getALSMeqLeftOperandAction_1_0_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_6__0__Impl"


    // $ANTLR start "rule__ALSComparison__Group_1_0_6__1"
    // InternalAlloyLanguage.g:5215:1: rule__ALSComparison__Group_1_0_6__1 : rule__ALSComparison__Group_1_0_6__1__Impl ;
    public final void rule__ALSComparison__Group_1_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5219:1: ( rule__ALSComparison__Group_1_0_6__1__Impl )
            // InternalAlloyLanguage.g:5220:2: rule__ALSComparison__Group_1_0_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSComparison__Group_1_0_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_6__1"


    // $ANTLR start "rule__ALSComparison__Group_1_0_6__1__Impl"
    // InternalAlloyLanguage.g:5226:1: rule__ALSComparison__Group_1_0_6__1__Impl : ( '<=' ) ;
    public final void rule__ALSComparison__Group_1_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5230:1: ( ( '<=' ) )
            // InternalAlloyLanguage.g:5231:1: ( '<=' )
            {
            // InternalAlloyLanguage.g:5231:1: ( '<=' )
            // InternalAlloyLanguage.g:5232:1: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_6_1()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__Group_1_0_6__1__Impl"


    // $ANTLR start "rule__ALSOverride__Group__0"
    // InternalAlloyLanguage.g:5249:1: rule__ALSOverride__Group__0 : rule__ALSOverride__Group__0__Impl rule__ALSOverride__Group__1 ;
    public final void rule__ALSOverride__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5253:1: ( rule__ALSOverride__Group__0__Impl rule__ALSOverride__Group__1 )
            // InternalAlloyLanguage.g:5254:2: rule__ALSOverride__Group__0__Impl rule__ALSOverride__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__ALSOverride__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSOverride__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOverride__Group__0"


    // $ANTLR start "rule__ALSOverride__Group__0__Impl"
    // InternalAlloyLanguage.g:5261:1: rule__ALSOverride__Group__0__Impl : ( ruleALSRangeRestrictionRight ) ;
    public final void rule__ALSOverride__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5265:1: ( ( ruleALSRangeRestrictionRight ) )
            // InternalAlloyLanguage.g:5266:1: ( ruleALSRangeRestrictionRight )
            {
            // InternalAlloyLanguage.g:5266:1: ( ruleALSRangeRestrictionRight )
            // InternalAlloyLanguage.g:5267:1: ruleALSRangeRestrictionRight
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSOverrideAccess().getALSRangeRestrictionRightParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSRangeRestrictionRight();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSOverrideAccess().getALSRangeRestrictionRightParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOverride__Group__0__Impl"


    // $ANTLR start "rule__ALSOverride__Group__1"
    // InternalAlloyLanguage.g:5278:1: rule__ALSOverride__Group__1 : rule__ALSOverride__Group__1__Impl ;
    public final void rule__ALSOverride__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5282:1: ( rule__ALSOverride__Group__1__Impl )
            // InternalAlloyLanguage.g:5283:2: rule__ALSOverride__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSOverride__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOverride__Group__1"


    // $ANTLR start "rule__ALSOverride__Group__1__Impl"
    // InternalAlloyLanguage.g:5289:1: rule__ALSOverride__Group__1__Impl : ( ( rule__ALSOverride__Group_1__0 )? ) ;
    public final void rule__ALSOverride__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5293:1: ( ( ( rule__ALSOverride__Group_1__0 )? ) )
            // InternalAlloyLanguage.g:5294:1: ( ( rule__ALSOverride__Group_1__0 )? )
            {
            // InternalAlloyLanguage.g:5294:1: ( ( rule__ALSOverride__Group_1__0 )? )
            // InternalAlloyLanguage.g:5295:1: ( rule__ALSOverride__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSOverrideAccess().getGroup_1()); 
            }
            // InternalAlloyLanguage.g:5296:1: ( rule__ALSOverride__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==53) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAlloyLanguage.g:5296:2: rule__ALSOverride__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSOverride__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSOverrideAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOverride__Group__1__Impl"


    // $ANTLR start "rule__ALSOverride__Group_1__0"
    // InternalAlloyLanguage.g:5310:1: rule__ALSOverride__Group_1__0 : rule__ALSOverride__Group_1__0__Impl rule__ALSOverride__Group_1__1 ;
    public final void rule__ALSOverride__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5314:1: ( rule__ALSOverride__Group_1__0__Impl rule__ALSOverride__Group_1__1 )
            // InternalAlloyLanguage.g:5315:2: rule__ALSOverride__Group_1__0__Impl rule__ALSOverride__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__ALSOverride__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSOverride__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOverride__Group_1__0"


    // $ANTLR start "rule__ALSOverride__Group_1__0__Impl"
    // InternalAlloyLanguage.g:5322:1: rule__ALSOverride__Group_1__0__Impl : ( () ) ;
    public final void rule__ALSOverride__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5326:1: ( ( () ) )
            // InternalAlloyLanguage.g:5327:1: ( () )
            {
            // InternalAlloyLanguage.g:5327:1: ( () )
            // InternalAlloyLanguage.g:5328:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSOverrideAccess().getALSOverrideLeftOperandAction_1_0()); 
            }
            // InternalAlloyLanguage.g:5329:1: ()
            // InternalAlloyLanguage.g:5331:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSOverrideAccess().getALSOverrideLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOverride__Group_1__0__Impl"


    // $ANTLR start "rule__ALSOverride__Group_1__1"
    // InternalAlloyLanguage.g:5341:1: rule__ALSOverride__Group_1__1 : rule__ALSOverride__Group_1__1__Impl rule__ALSOverride__Group_1__2 ;
    public final void rule__ALSOverride__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5345:1: ( rule__ALSOverride__Group_1__1__Impl rule__ALSOverride__Group_1__2 )
            // InternalAlloyLanguage.g:5346:2: rule__ALSOverride__Group_1__1__Impl rule__ALSOverride__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSOverride__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSOverride__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOverride__Group_1__1"


    // $ANTLR start "rule__ALSOverride__Group_1__1__Impl"
    // InternalAlloyLanguage.g:5353:1: rule__ALSOverride__Group_1__1__Impl : ( '++' ) ;
    public final void rule__ALSOverride__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5357:1: ( ( '++' ) )
            // InternalAlloyLanguage.g:5358:1: ( '++' )
            {
            // InternalAlloyLanguage.g:5358:1: ( '++' )
            // InternalAlloyLanguage.g:5359:1: '++'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSOverrideAccess().getPlusSignPlusSignKeyword_1_1()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSOverrideAccess().getPlusSignPlusSignKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOverride__Group_1__1__Impl"


    // $ANTLR start "rule__ALSOverride__Group_1__2"
    // InternalAlloyLanguage.g:5372:1: rule__ALSOverride__Group_1__2 : rule__ALSOverride__Group_1__2__Impl ;
    public final void rule__ALSOverride__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5376:1: ( rule__ALSOverride__Group_1__2__Impl )
            // InternalAlloyLanguage.g:5377:2: rule__ALSOverride__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSOverride__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOverride__Group_1__2"


    // $ANTLR start "rule__ALSOverride__Group_1__2__Impl"
    // InternalAlloyLanguage.g:5383:1: rule__ALSOverride__Group_1__2__Impl : ( ( rule__ALSOverride__RightOperandAssignment_1_2 ) ) ;
    public final void rule__ALSOverride__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5387:1: ( ( ( rule__ALSOverride__RightOperandAssignment_1_2 ) ) )
            // InternalAlloyLanguage.g:5388:1: ( ( rule__ALSOverride__RightOperandAssignment_1_2 ) )
            {
            // InternalAlloyLanguage.g:5388:1: ( ( rule__ALSOverride__RightOperandAssignment_1_2 ) )
            // InternalAlloyLanguage.g:5389:1: ( rule__ALSOverride__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSOverrideAccess().getRightOperandAssignment_1_2()); 
            }
            // InternalAlloyLanguage.g:5390:1: ( rule__ALSOverride__RightOperandAssignment_1_2 )
            // InternalAlloyLanguage.g:5390:2: rule__ALSOverride__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSOverride__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSOverrideAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOverride__Group_1__2__Impl"


    // $ANTLR start "rule__ALSRangeRestrictionRight__Group__0"
    // InternalAlloyLanguage.g:5406:1: rule__ALSRangeRestrictionRight__Group__0 : rule__ALSRangeRestrictionRight__Group__0__Impl rule__ALSRangeRestrictionRight__Group__1 ;
    public final void rule__ALSRangeRestrictionRight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5410:1: ( rule__ALSRangeRestrictionRight__Group__0__Impl rule__ALSRangeRestrictionRight__Group__1 )
            // InternalAlloyLanguage.g:5411:2: rule__ALSRangeRestrictionRight__Group__0__Impl rule__ALSRangeRestrictionRight__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__ALSRangeRestrictionRight__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRangeRestrictionRight__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionRight__Group__0"


    // $ANTLR start "rule__ALSRangeRestrictionRight__Group__0__Impl"
    // InternalAlloyLanguage.g:5418:1: rule__ALSRangeRestrictionRight__Group__0__Impl : ( ruleALSRangeRestrictionLeft ) ;
    public final void rule__ALSRangeRestrictionRight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5422:1: ( ( ruleALSRangeRestrictionLeft ) )
            // InternalAlloyLanguage.g:5423:1: ( ruleALSRangeRestrictionLeft )
            {
            // InternalAlloyLanguage.g:5423:1: ( ruleALSRangeRestrictionLeft )
            // InternalAlloyLanguage.g:5424:1: ruleALSRangeRestrictionLeft
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRangeRestrictionRightAccess().getALSRangeRestrictionLeftParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSRangeRestrictionLeft();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRangeRestrictionRightAccess().getALSRangeRestrictionLeftParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionRight__Group__0__Impl"


    // $ANTLR start "rule__ALSRangeRestrictionRight__Group__1"
    // InternalAlloyLanguage.g:5435:1: rule__ALSRangeRestrictionRight__Group__1 : rule__ALSRangeRestrictionRight__Group__1__Impl ;
    public final void rule__ALSRangeRestrictionRight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5439:1: ( rule__ALSRangeRestrictionRight__Group__1__Impl )
            // InternalAlloyLanguage.g:5440:2: rule__ALSRangeRestrictionRight__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSRangeRestrictionRight__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionRight__Group__1"


    // $ANTLR start "rule__ALSRangeRestrictionRight__Group__1__Impl"
    // InternalAlloyLanguage.g:5446:1: rule__ALSRangeRestrictionRight__Group__1__Impl : ( ( rule__ALSRangeRestrictionRight__Group_1__0 )? ) ;
    public final void rule__ALSRangeRestrictionRight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5450:1: ( ( ( rule__ALSRangeRestrictionRight__Group_1__0 )? ) )
            // InternalAlloyLanguage.g:5451:1: ( ( rule__ALSRangeRestrictionRight__Group_1__0 )? )
            {
            // InternalAlloyLanguage.g:5451:1: ( ( rule__ALSRangeRestrictionRight__Group_1__0 )? )
            // InternalAlloyLanguage.g:5452:1: ( rule__ALSRangeRestrictionRight__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRangeRestrictionRightAccess().getGroup_1()); 
            }
            // InternalAlloyLanguage.g:5453:1: ( rule__ALSRangeRestrictionRight__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==54) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAlloyLanguage.g:5453:2: rule__ALSRangeRestrictionRight__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSRangeRestrictionRight__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRangeRestrictionRightAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionRight__Group__1__Impl"


    // $ANTLR start "rule__ALSRangeRestrictionRight__Group_1__0"
    // InternalAlloyLanguage.g:5467:1: rule__ALSRangeRestrictionRight__Group_1__0 : rule__ALSRangeRestrictionRight__Group_1__0__Impl rule__ALSRangeRestrictionRight__Group_1__1 ;
    public final void rule__ALSRangeRestrictionRight__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5471:1: ( rule__ALSRangeRestrictionRight__Group_1__0__Impl rule__ALSRangeRestrictionRight__Group_1__1 )
            // InternalAlloyLanguage.g:5472:2: rule__ALSRangeRestrictionRight__Group_1__0__Impl rule__ALSRangeRestrictionRight__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__ALSRangeRestrictionRight__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRangeRestrictionRight__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionRight__Group_1__0"


    // $ANTLR start "rule__ALSRangeRestrictionRight__Group_1__0__Impl"
    // InternalAlloyLanguage.g:5479:1: rule__ALSRangeRestrictionRight__Group_1__0__Impl : ( () ) ;
    public final void rule__ALSRangeRestrictionRight__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5483:1: ( ( () ) )
            // InternalAlloyLanguage.g:5484:1: ( () )
            {
            // InternalAlloyLanguage.g:5484:1: ( () )
            // InternalAlloyLanguage.g:5485:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRangeRestrictionRightAccess().getALSRangeRestrictionRightRelationAction_1_0()); 
            }
            // InternalAlloyLanguage.g:5486:1: ()
            // InternalAlloyLanguage.g:5488:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRangeRestrictionRightAccess().getALSRangeRestrictionRightRelationAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionRight__Group_1__0__Impl"


    // $ANTLR start "rule__ALSRangeRestrictionRight__Group_1__1"
    // InternalAlloyLanguage.g:5498:1: rule__ALSRangeRestrictionRight__Group_1__1 : rule__ALSRangeRestrictionRight__Group_1__1__Impl rule__ALSRangeRestrictionRight__Group_1__2 ;
    public final void rule__ALSRangeRestrictionRight__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5502:1: ( rule__ALSRangeRestrictionRight__Group_1__1__Impl rule__ALSRangeRestrictionRight__Group_1__2 )
            // InternalAlloyLanguage.g:5503:2: rule__ALSRangeRestrictionRight__Group_1__1__Impl rule__ALSRangeRestrictionRight__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSRangeRestrictionRight__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRangeRestrictionRight__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionRight__Group_1__1"


    // $ANTLR start "rule__ALSRangeRestrictionRight__Group_1__1__Impl"
    // InternalAlloyLanguage.g:5510:1: rule__ALSRangeRestrictionRight__Group_1__1__Impl : ( ':>' ) ;
    public final void rule__ALSRangeRestrictionRight__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5514:1: ( ( ':>' ) )
            // InternalAlloyLanguage.g:5515:1: ( ':>' )
            {
            // InternalAlloyLanguage.g:5515:1: ( ':>' )
            // InternalAlloyLanguage.g:5516:1: ':>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRangeRestrictionRightAccess().getColonGreaterThanSignKeyword_1_1()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRangeRestrictionRightAccess().getColonGreaterThanSignKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionRight__Group_1__1__Impl"


    // $ANTLR start "rule__ALSRangeRestrictionRight__Group_1__2"
    // InternalAlloyLanguage.g:5529:1: rule__ALSRangeRestrictionRight__Group_1__2 : rule__ALSRangeRestrictionRight__Group_1__2__Impl ;
    public final void rule__ALSRangeRestrictionRight__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5533:1: ( rule__ALSRangeRestrictionRight__Group_1__2__Impl )
            // InternalAlloyLanguage.g:5534:2: rule__ALSRangeRestrictionRight__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSRangeRestrictionRight__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionRight__Group_1__2"


    // $ANTLR start "rule__ALSRangeRestrictionRight__Group_1__2__Impl"
    // InternalAlloyLanguage.g:5540:1: rule__ALSRangeRestrictionRight__Group_1__2__Impl : ( ( rule__ALSRangeRestrictionRight__FilterAssignment_1_2 ) ) ;
    public final void rule__ALSRangeRestrictionRight__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5544:1: ( ( ( rule__ALSRangeRestrictionRight__FilterAssignment_1_2 ) ) )
            // InternalAlloyLanguage.g:5545:1: ( ( rule__ALSRangeRestrictionRight__FilterAssignment_1_2 ) )
            {
            // InternalAlloyLanguage.g:5545:1: ( ( rule__ALSRangeRestrictionRight__FilterAssignment_1_2 ) )
            // InternalAlloyLanguage.g:5546:1: ( rule__ALSRangeRestrictionRight__FilterAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRangeRestrictionRightAccess().getFilterAssignment_1_2()); 
            }
            // InternalAlloyLanguage.g:5547:1: ( rule__ALSRangeRestrictionRight__FilterAssignment_1_2 )
            // InternalAlloyLanguage.g:5547:2: rule__ALSRangeRestrictionRight__FilterAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSRangeRestrictionRight__FilterAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRangeRestrictionRightAccess().getFilterAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionRight__Group_1__2__Impl"


    // $ANTLR start "rule__ALSRangeRestrictionLeft__Group__0"
    // InternalAlloyLanguage.g:5563:1: rule__ALSRangeRestrictionLeft__Group__0 : rule__ALSRangeRestrictionLeft__Group__0__Impl rule__ALSRangeRestrictionLeft__Group__1 ;
    public final void rule__ALSRangeRestrictionLeft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5567:1: ( rule__ALSRangeRestrictionLeft__Group__0__Impl rule__ALSRangeRestrictionLeft__Group__1 )
            // InternalAlloyLanguage.g:5568:2: rule__ALSRangeRestrictionLeft__Group__0__Impl rule__ALSRangeRestrictionLeft__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__ALSRangeRestrictionLeft__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRangeRestrictionLeft__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionLeft__Group__0"


    // $ANTLR start "rule__ALSRangeRestrictionLeft__Group__0__Impl"
    // InternalAlloyLanguage.g:5575:1: rule__ALSRangeRestrictionLeft__Group__0__Impl : ( ruleALSJoin ) ;
    public final void rule__ALSRangeRestrictionLeft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5579:1: ( ( ruleALSJoin ) )
            // InternalAlloyLanguage.g:5580:1: ( ruleALSJoin )
            {
            // InternalAlloyLanguage.g:5580:1: ( ruleALSJoin )
            // InternalAlloyLanguage.g:5581:1: ruleALSJoin
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRangeRestrictionLeftAccess().getALSJoinParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSJoin();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRangeRestrictionLeftAccess().getALSJoinParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionLeft__Group__0__Impl"


    // $ANTLR start "rule__ALSRangeRestrictionLeft__Group__1"
    // InternalAlloyLanguage.g:5592:1: rule__ALSRangeRestrictionLeft__Group__1 : rule__ALSRangeRestrictionLeft__Group__1__Impl ;
    public final void rule__ALSRangeRestrictionLeft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5596:1: ( rule__ALSRangeRestrictionLeft__Group__1__Impl )
            // InternalAlloyLanguage.g:5597:2: rule__ALSRangeRestrictionLeft__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSRangeRestrictionLeft__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionLeft__Group__1"


    // $ANTLR start "rule__ALSRangeRestrictionLeft__Group__1__Impl"
    // InternalAlloyLanguage.g:5603:1: rule__ALSRangeRestrictionLeft__Group__1__Impl : ( ( rule__ALSRangeRestrictionLeft__Group_1__0 )? ) ;
    public final void rule__ALSRangeRestrictionLeft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5607:1: ( ( ( rule__ALSRangeRestrictionLeft__Group_1__0 )? ) )
            // InternalAlloyLanguage.g:5608:1: ( ( rule__ALSRangeRestrictionLeft__Group_1__0 )? )
            {
            // InternalAlloyLanguage.g:5608:1: ( ( rule__ALSRangeRestrictionLeft__Group_1__0 )? )
            // InternalAlloyLanguage.g:5609:1: ( rule__ALSRangeRestrictionLeft__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRangeRestrictionLeftAccess().getGroup_1()); 
            }
            // InternalAlloyLanguage.g:5610:1: ( rule__ALSRangeRestrictionLeft__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==55) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAlloyLanguage.g:5610:2: rule__ALSRangeRestrictionLeft__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSRangeRestrictionLeft__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRangeRestrictionLeftAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionLeft__Group__1__Impl"


    // $ANTLR start "rule__ALSRangeRestrictionLeft__Group_1__0"
    // InternalAlloyLanguage.g:5624:1: rule__ALSRangeRestrictionLeft__Group_1__0 : rule__ALSRangeRestrictionLeft__Group_1__0__Impl rule__ALSRangeRestrictionLeft__Group_1__1 ;
    public final void rule__ALSRangeRestrictionLeft__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5628:1: ( rule__ALSRangeRestrictionLeft__Group_1__0__Impl rule__ALSRangeRestrictionLeft__Group_1__1 )
            // InternalAlloyLanguage.g:5629:2: rule__ALSRangeRestrictionLeft__Group_1__0__Impl rule__ALSRangeRestrictionLeft__Group_1__1
            {
            pushFollow(FOLLOW_39);
            rule__ALSRangeRestrictionLeft__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRangeRestrictionLeft__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionLeft__Group_1__0"


    // $ANTLR start "rule__ALSRangeRestrictionLeft__Group_1__0__Impl"
    // InternalAlloyLanguage.g:5636:1: rule__ALSRangeRestrictionLeft__Group_1__0__Impl : ( () ) ;
    public final void rule__ALSRangeRestrictionLeft__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5640:1: ( ( () ) )
            // InternalAlloyLanguage.g:5641:1: ( () )
            {
            // InternalAlloyLanguage.g:5641:1: ( () )
            // InternalAlloyLanguage.g:5642:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRangeRestrictionLeftAccess().getALSRangeRestrictionLeftFilterAction_1_0()); 
            }
            // InternalAlloyLanguage.g:5643:1: ()
            // InternalAlloyLanguage.g:5645:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRangeRestrictionLeftAccess().getALSRangeRestrictionLeftFilterAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionLeft__Group_1__0__Impl"


    // $ANTLR start "rule__ALSRangeRestrictionLeft__Group_1__1"
    // InternalAlloyLanguage.g:5655:1: rule__ALSRangeRestrictionLeft__Group_1__1 : rule__ALSRangeRestrictionLeft__Group_1__1__Impl rule__ALSRangeRestrictionLeft__Group_1__2 ;
    public final void rule__ALSRangeRestrictionLeft__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5659:1: ( rule__ALSRangeRestrictionLeft__Group_1__1__Impl rule__ALSRangeRestrictionLeft__Group_1__2 )
            // InternalAlloyLanguage.g:5660:2: rule__ALSRangeRestrictionLeft__Group_1__1__Impl rule__ALSRangeRestrictionLeft__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSRangeRestrictionLeft__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRangeRestrictionLeft__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionLeft__Group_1__1"


    // $ANTLR start "rule__ALSRangeRestrictionLeft__Group_1__1__Impl"
    // InternalAlloyLanguage.g:5667:1: rule__ALSRangeRestrictionLeft__Group_1__1__Impl : ( '<:' ) ;
    public final void rule__ALSRangeRestrictionLeft__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5671:1: ( ( '<:' ) )
            // InternalAlloyLanguage.g:5672:1: ( '<:' )
            {
            // InternalAlloyLanguage.g:5672:1: ( '<:' )
            // InternalAlloyLanguage.g:5673:1: '<:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRangeRestrictionLeftAccess().getLessThanSignColonKeyword_1_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRangeRestrictionLeftAccess().getLessThanSignColonKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionLeft__Group_1__1__Impl"


    // $ANTLR start "rule__ALSRangeRestrictionLeft__Group_1__2"
    // InternalAlloyLanguage.g:5686:1: rule__ALSRangeRestrictionLeft__Group_1__2 : rule__ALSRangeRestrictionLeft__Group_1__2__Impl ;
    public final void rule__ALSRangeRestrictionLeft__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5690:1: ( rule__ALSRangeRestrictionLeft__Group_1__2__Impl )
            // InternalAlloyLanguage.g:5691:2: rule__ALSRangeRestrictionLeft__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSRangeRestrictionLeft__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionLeft__Group_1__2"


    // $ANTLR start "rule__ALSRangeRestrictionLeft__Group_1__2__Impl"
    // InternalAlloyLanguage.g:5697:1: rule__ALSRangeRestrictionLeft__Group_1__2__Impl : ( ( rule__ALSRangeRestrictionLeft__RelationAssignment_1_2 ) ) ;
    public final void rule__ALSRangeRestrictionLeft__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5701:1: ( ( ( rule__ALSRangeRestrictionLeft__RelationAssignment_1_2 ) ) )
            // InternalAlloyLanguage.g:5702:1: ( ( rule__ALSRangeRestrictionLeft__RelationAssignment_1_2 ) )
            {
            // InternalAlloyLanguage.g:5702:1: ( ( rule__ALSRangeRestrictionLeft__RelationAssignment_1_2 ) )
            // InternalAlloyLanguage.g:5703:1: ( rule__ALSRangeRestrictionLeft__RelationAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRangeRestrictionLeftAccess().getRelationAssignment_1_2()); 
            }
            // InternalAlloyLanguage.g:5704:1: ( rule__ALSRangeRestrictionLeft__RelationAssignment_1_2 )
            // InternalAlloyLanguage.g:5704:2: rule__ALSRangeRestrictionLeft__RelationAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSRangeRestrictionLeft__RelationAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRangeRestrictionLeftAccess().getRelationAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionLeft__Group_1__2__Impl"


    // $ANTLR start "rule__ALSJoin__Group__0"
    // InternalAlloyLanguage.g:5720:1: rule__ALSJoin__Group__0 : rule__ALSJoin__Group__0__Impl rule__ALSJoin__Group__1 ;
    public final void rule__ALSJoin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5724:1: ( rule__ALSJoin__Group__0__Impl rule__ALSJoin__Group__1 )
            // InternalAlloyLanguage.g:5725:2: rule__ALSJoin__Group__0__Impl rule__ALSJoin__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__ALSJoin__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSJoin__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSJoin__Group__0"


    // $ANTLR start "rule__ALSJoin__Group__0__Impl"
    // InternalAlloyLanguage.g:5732:1: rule__ALSJoin__Group__0__Impl : ( ruleALSMinus ) ;
    public final void rule__ALSJoin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5736:1: ( ( ruleALSMinus ) )
            // InternalAlloyLanguage.g:5737:1: ( ruleALSMinus )
            {
            // InternalAlloyLanguage.g:5737:1: ( ruleALSMinus )
            // InternalAlloyLanguage.g:5738:1: ruleALSMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSJoinAccess().getALSMinusParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSJoinAccess().getALSMinusParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSJoin__Group__0__Impl"


    // $ANTLR start "rule__ALSJoin__Group__1"
    // InternalAlloyLanguage.g:5749:1: rule__ALSJoin__Group__1 : rule__ALSJoin__Group__1__Impl ;
    public final void rule__ALSJoin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5753:1: ( rule__ALSJoin__Group__1__Impl )
            // InternalAlloyLanguage.g:5754:2: rule__ALSJoin__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSJoin__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSJoin__Group__1"


    // $ANTLR start "rule__ALSJoin__Group__1__Impl"
    // InternalAlloyLanguage.g:5760:1: rule__ALSJoin__Group__1__Impl : ( ( rule__ALSJoin__Group_1__0 )* ) ;
    public final void rule__ALSJoin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5764:1: ( ( ( rule__ALSJoin__Group_1__0 )* ) )
            // InternalAlloyLanguage.g:5765:1: ( ( rule__ALSJoin__Group_1__0 )* )
            {
            // InternalAlloyLanguage.g:5765:1: ( ( rule__ALSJoin__Group_1__0 )* )
            // InternalAlloyLanguage.g:5766:1: ( rule__ALSJoin__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSJoinAccess().getGroup_1()); 
            }
            // InternalAlloyLanguage.g:5767:1: ( rule__ALSJoin__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==56) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAlloyLanguage.g:5767:2: rule__ALSJoin__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__ALSJoin__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSJoinAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSJoin__Group__1__Impl"


    // $ANTLR start "rule__ALSJoin__Group_1__0"
    // InternalAlloyLanguage.g:5781:1: rule__ALSJoin__Group_1__0 : rule__ALSJoin__Group_1__0__Impl rule__ALSJoin__Group_1__1 ;
    public final void rule__ALSJoin__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5785:1: ( rule__ALSJoin__Group_1__0__Impl rule__ALSJoin__Group_1__1 )
            // InternalAlloyLanguage.g:5786:2: rule__ALSJoin__Group_1__0__Impl rule__ALSJoin__Group_1__1
            {
            pushFollow(FOLLOW_40);
            rule__ALSJoin__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSJoin__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSJoin__Group_1__0"


    // $ANTLR start "rule__ALSJoin__Group_1__0__Impl"
    // InternalAlloyLanguage.g:5793:1: rule__ALSJoin__Group_1__0__Impl : ( () ) ;
    public final void rule__ALSJoin__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5797:1: ( ( () ) )
            // InternalAlloyLanguage.g:5798:1: ( () )
            {
            // InternalAlloyLanguage.g:5798:1: ( () )
            // InternalAlloyLanguage.g:5799:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSJoinAccess().getALSJoinLeftOperandAction_1_0()); 
            }
            // InternalAlloyLanguage.g:5800:1: ()
            // InternalAlloyLanguage.g:5802:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSJoinAccess().getALSJoinLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSJoin__Group_1__0__Impl"


    // $ANTLR start "rule__ALSJoin__Group_1__1"
    // InternalAlloyLanguage.g:5812:1: rule__ALSJoin__Group_1__1 : rule__ALSJoin__Group_1__1__Impl rule__ALSJoin__Group_1__2 ;
    public final void rule__ALSJoin__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5816:1: ( rule__ALSJoin__Group_1__1__Impl rule__ALSJoin__Group_1__2 )
            // InternalAlloyLanguage.g:5817:2: rule__ALSJoin__Group_1__1__Impl rule__ALSJoin__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSJoin__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSJoin__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSJoin__Group_1__1"


    // $ANTLR start "rule__ALSJoin__Group_1__1__Impl"
    // InternalAlloyLanguage.g:5824:1: rule__ALSJoin__Group_1__1__Impl : ( '.' ) ;
    public final void rule__ALSJoin__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5828:1: ( ( '.' ) )
            // InternalAlloyLanguage.g:5829:1: ( '.' )
            {
            // InternalAlloyLanguage.g:5829:1: ( '.' )
            // InternalAlloyLanguage.g:5830:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSJoinAccess().getFullStopKeyword_1_1()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSJoinAccess().getFullStopKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSJoin__Group_1__1__Impl"


    // $ANTLR start "rule__ALSJoin__Group_1__2"
    // InternalAlloyLanguage.g:5843:1: rule__ALSJoin__Group_1__2 : rule__ALSJoin__Group_1__2__Impl ;
    public final void rule__ALSJoin__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5847:1: ( rule__ALSJoin__Group_1__2__Impl )
            // InternalAlloyLanguage.g:5848:2: rule__ALSJoin__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSJoin__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSJoin__Group_1__2"


    // $ANTLR start "rule__ALSJoin__Group_1__2__Impl"
    // InternalAlloyLanguage.g:5854:1: rule__ALSJoin__Group_1__2__Impl : ( ( rule__ALSJoin__RightOperandAssignment_1_2 ) ) ;
    public final void rule__ALSJoin__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5858:1: ( ( ( rule__ALSJoin__RightOperandAssignment_1_2 ) ) )
            // InternalAlloyLanguage.g:5859:1: ( ( rule__ALSJoin__RightOperandAssignment_1_2 ) )
            {
            // InternalAlloyLanguage.g:5859:1: ( ( rule__ALSJoin__RightOperandAssignment_1_2 ) )
            // InternalAlloyLanguage.g:5860:1: ( rule__ALSJoin__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSJoinAccess().getRightOperandAssignment_1_2()); 
            }
            // InternalAlloyLanguage.g:5861:1: ( rule__ALSJoin__RightOperandAssignment_1_2 )
            // InternalAlloyLanguage.g:5861:2: rule__ALSJoin__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSJoin__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSJoinAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSJoin__Group_1__2__Impl"


    // $ANTLR start "rule__ALSMinus__Group__0"
    // InternalAlloyLanguage.g:5877:1: rule__ALSMinus__Group__0 : rule__ALSMinus__Group__0__Impl rule__ALSMinus__Group__1 ;
    public final void rule__ALSMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5881:1: ( rule__ALSMinus__Group__0__Impl rule__ALSMinus__Group__1 )
            // InternalAlloyLanguage.g:5882:2: rule__ALSMinus__Group__0__Impl rule__ALSMinus__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__ALSMinus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSMinus__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSMinus__Group__0"


    // $ANTLR start "rule__ALSMinus__Group__0__Impl"
    // InternalAlloyLanguage.g:5889:1: rule__ALSMinus__Group__0__Impl : ( ruleALSPlus ) ;
    public final void rule__ALSMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5893:1: ( ( ruleALSPlus ) )
            // InternalAlloyLanguage.g:5894:1: ( ruleALSPlus )
            {
            // InternalAlloyLanguage.g:5894:1: ( ruleALSPlus )
            // InternalAlloyLanguage.g:5895:1: ruleALSPlus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSMinusAccess().getALSPlusParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSPlus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSMinusAccess().getALSPlusParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSMinus__Group__0__Impl"


    // $ANTLR start "rule__ALSMinus__Group__1"
    // InternalAlloyLanguage.g:5906:1: rule__ALSMinus__Group__1 : rule__ALSMinus__Group__1__Impl ;
    public final void rule__ALSMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5910:1: ( rule__ALSMinus__Group__1__Impl )
            // InternalAlloyLanguage.g:5911:2: rule__ALSMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSMinus__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSMinus__Group__1"


    // $ANTLR start "rule__ALSMinus__Group__1__Impl"
    // InternalAlloyLanguage.g:5917:1: rule__ALSMinus__Group__1__Impl : ( ( rule__ALSMinus__Group_1__0 )* ) ;
    public final void rule__ALSMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5921:1: ( ( ( rule__ALSMinus__Group_1__0 )* ) )
            // InternalAlloyLanguage.g:5922:1: ( ( rule__ALSMinus__Group_1__0 )* )
            {
            // InternalAlloyLanguage.g:5922:1: ( ( rule__ALSMinus__Group_1__0 )* )
            // InternalAlloyLanguage.g:5923:1: ( rule__ALSMinus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSMinusAccess().getGroup_1()); 
            }
            // InternalAlloyLanguage.g:5924:1: ( rule__ALSMinus__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==57) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAlloyLanguage.g:5924:2: rule__ALSMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__ALSMinus__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSMinusAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSMinus__Group__1__Impl"


    // $ANTLR start "rule__ALSMinus__Group_1__0"
    // InternalAlloyLanguage.g:5938:1: rule__ALSMinus__Group_1__0 : rule__ALSMinus__Group_1__0__Impl rule__ALSMinus__Group_1__1 ;
    public final void rule__ALSMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5942:1: ( rule__ALSMinus__Group_1__0__Impl rule__ALSMinus__Group_1__1 )
            // InternalAlloyLanguage.g:5943:2: rule__ALSMinus__Group_1__0__Impl rule__ALSMinus__Group_1__1
            {
            pushFollow(FOLLOW_42);
            rule__ALSMinus__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSMinus__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSMinus__Group_1__0"


    // $ANTLR start "rule__ALSMinus__Group_1__0__Impl"
    // InternalAlloyLanguage.g:5950:1: rule__ALSMinus__Group_1__0__Impl : ( () ) ;
    public final void rule__ALSMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5954:1: ( ( () ) )
            // InternalAlloyLanguage.g:5955:1: ( () )
            {
            // InternalAlloyLanguage.g:5955:1: ( () )
            // InternalAlloyLanguage.g:5956:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSMinusAccess().getALSMinusLeftOperandAction_1_0()); 
            }
            // InternalAlloyLanguage.g:5957:1: ()
            // InternalAlloyLanguage.g:5959:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSMinusAccess().getALSMinusLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSMinus__Group_1__0__Impl"


    // $ANTLR start "rule__ALSMinus__Group_1__1"
    // InternalAlloyLanguage.g:5969:1: rule__ALSMinus__Group_1__1 : rule__ALSMinus__Group_1__1__Impl rule__ALSMinus__Group_1__2 ;
    public final void rule__ALSMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5973:1: ( rule__ALSMinus__Group_1__1__Impl rule__ALSMinus__Group_1__2 )
            // InternalAlloyLanguage.g:5974:2: rule__ALSMinus__Group_1__1__Impl rule__ALSMinus__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSMinus__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSMinus__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSMinus__Group_1__1"


    // $ANTLR start "rule__ALSMinus__Group_1__1__Impl"
    // InternalAlloyLanguage.g:5981:1: rule__ALSMinus__Group_1__1__Impl : ( '-' ) ;
    public final void rule__ALSMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:5985:1: ( ( '-' ) )
            // InternalAlloyLanguage.g:5986:1: ( '-' )
            {
            // InternalAlloyLanguage.g:5986:1: ( '-' )
            // InternalAlloyLanguage.g:5987:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSMinusAccess().getHyphenMinusKeyword_1_1()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSMinusAccess().getHyphenMinusKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSMinus__Group_1__1__Impl"


    // $ANTLR start "rule__ALSMinus__Group_1__2"
    // InternalAlloyLanguage.g:6000:1: rule__ALSMinus__Group_1__2 : rule__ALSMinus__Group_1__2__Impl ;
    public final void rule__ALSMinus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6004:1: ( rule__ALSMinus__Group_1__2__Impl )
            // InternalAlloyLanguage.g:6005:2: rule__ALSMinus__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSMinus__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSMinus__Group_1__2"


    // $ANTLR start "rule__ALSMinus__Group_1__2__Impl"
    // InternalAlloyLanguage.g:6011:1: rule__ALSMinus__Group_1__2__Impl : ( ( rule__ALSMinus__RightOperandAssignment_1_2 ) ) ;
    public final void rule__ALSMinus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6015:1: ( ( ( rule__ALSMinus__RightOperandAssignment_1_2 ) ) )
            // InternalAlloyLanguage.g:6016:1: ( ( rule__ALSMinus__RightOperandAssignment_1_2 ) )
            {
            // InternalAlloyLanguage.g:6016:1: ( ( rule__ALSMinus__RightOperandAssignment_1_2 ) )
            // InternalAlloyLanguage.g:6017:1: ( rule__ALSMinus__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSMinusAccess().getRightOperandAssignment_1_2()); 
            }
            // InternalAlloyLanguage.g:6018:1: ( rule__ALSMinus__RightOperandAssignment_1_2 )
            // InternalAlloyLanguage.g:6018:2: rule__ALSMinus__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSMinus__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSMinusAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSMinus__Group_1__2__Impl"


    // $ANTLR start "rule__ALSPlus__Group__0"
    // InternalAlloyLanguage.g:6034:1: rule__ALSPlus__Group__0 : rule__ALSPlus__Group__0__Impl rule__ALSPlus__Group__1 ;
    public final void rule__ALSPlus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6038:1: ( rule__ALSPlus__Group__0__Impl rule__ALSPlus__Group__1 )
            // InternalAlloyLanguage.g:6039:2: rule__ALSPlus__Group__0__Impl rule__ALSPlus__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ALSPlus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPlus__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPlus__Group__0"


    // $ANTLR start "rule__ALSPlus__Group__0__Impl"
    // InternalAlloyLanguage.g:6046:1: rule__ALSPlus__Group__0__Impl : ( ruleALSIntersection ) ;
    public final void rule__ALSPlus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6050:1: ( ( ruleALSIntersection ) )
            // InternalAlloyLanguage.g:6051:1: ( ruleALSIntersection )
            {
            // InternalAlloyLanguage.g:6051:1: ( ruleALSIntersection )
            // InternalAlloyLanguage.g:6052:1: ruleALSIntersection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPlusAccess().getALSIntersectionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSIntersection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPlusAccess().getALSIntersectionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPlus__Group__0__Impl"


    // $ANTLR start "rule__ALSPlus__Group__1"
    // InternalAlloyLanguage.g:6063:1: rule__ALSPlus__Group__1 : rule__ALSPlus__Group__1__Impl ;
    public final void rule__ALSPlus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6067:1: ( rule__ALSPlus__Group__1__Impl )
            // InternalAlloyLanguage.g:6068:2: rule__ALSPlus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSPlus__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPlus__Group__1"


    // $ANTLR start "rule__ALSPlus__Group__1__Impl"
    // InternalAlloyLanguage.g:6074:1: rule__ALSPlus__Group__1__Impl : ( ( rule__ALSPlus__Group_1__0 )* ) ;
    public final void rule__ALSPlus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6078:1: ( ( ( rule__ALSPlus__Group_1__0 )* ) )
            // InternalAlloyLanguage.g:6079:1: ( ( rule__ALSPlus__Group_1__0 )* )
            {
            // InternalAlloyLanguage.g:6079:1: ( ( rule__ALSPlus__Group_1__0 )* )
            // InternalAlloyLanguage.g:6080:1: ( rule__ALSPlus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPlusAccess().getGroup_1()); 
            }
            // InternalAlloyLanguage.g:6081:1: ( rule__ALSPlus__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==39) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAlloyLanguage.g:6081:2: rule__ALSPlus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ALSPlus__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPlusAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPlus__Group__1__Impl"


    // $ANTLR start "rule__ALSPlus__Group_1__0"
    // InternalAlloyLanguage.g:6095:1: rule__ALSPlus__Group_1__0 : rule__ALSPlus__Group_1__0__Impl rule__ALSPlus__Group_1__1 ;
    public final void rule__ALSPlus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6099:1: ( rule__ALSPlus__Group_1__0__Impl rule__ALSPlus__Group_1__1 )
            // InternalAlloyLanguage.g:6100:2: rule__ALSPlus__Group_1__0__Impl rule__ALSPlus__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__ALSPlus__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPlus__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPlus__Group_1__0"


    // $ANTLR start "rule__ALSPlus__Group_1__0__Impl"
    // InternalAlloyLanguage.g:6107:1: rule__ALSPlus__Group_1__0__Impl : ( () ) ;
    public final void rule__ALSPlus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6111:1: ( ( () ) )
            // InternalAlloyLanguage.g:6112:1: ( () )
            {
            // InternalAlloyLanguage.g:6112:1: ( () )
            // InternalAlloyLanguage.g:6113:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPlusAccess().getALSPlusLeftOperandAction_1_0()); 
            }
            // InternalAlloyLanguage.g:6114:1: ()
            // InternalAlloyLanguage.g:6116:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPlusAccess().getALSPlusLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPlus__Group_1__0__Impl"


    // $ANTLR start "rule__ALSPlus__Group_1__1"
    // InternalAlloyLanguage.g:6126:1: rule__ALSPlus__Group_1__1 : rule__ALSPlus__Group_1__1__Impl rule__ALSPlus__Group_1__2 ;
    public final void rule__ALSPlus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6130:1: ( rule__ALSPlus__Group_1__1__Impl rule__ALSPlus__Group_1__2 )
            // InternalAlloyLanguage.g:6131:2: rule__ALSPlus__Group_1__1__Impl rule__ALSPlus__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSPlus__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPlus__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPlus__Group_1__1"


    // $ANTLR start "rule__ALSPlus__Group_1__1__Impl"
    // InternalAlloyLanguage.g:6138:1: rule__ALSPlus__Group_1__1__Impl : ( '+' ) ;
    public final void rule__ALSPlus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6142:1: ( ( '+' ) )
            // InternalAlloyLanguage.g:6143:1: ( '+' )
            {
            // InternalAlloyLanguage.g:6143:1: ( '+' )
            // InternalAlloyLanguage.g:6144:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPlusAccess().getPlusSignKeyword_1_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPlusAccess().getPlusSignKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPlus__Group_1__1__Impl"


    // $ANTLR start "rule__ALSPlus__Group_1__2"
    // InternalAlloyLanguage.g:6157:1: rule__ALSPlus__Group_1__2 : rule__ALSPlus__Group_1__2__Impl ;
    public final void rule__ALSPlus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6161:1: ( rule__ALSPlus__Group_1__2__Impl )
            // InternalAlloyLanguage.g:6162:2: rule__ALSPlus__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSPlus__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPlus__Group_1__2"


    // $ANTLR start "rule__ALSPlus__Group_1__2__Impl"
    // InternalAlloyLanguage.g:6168:1: rule__ALSPlus__Group_1__2__Impl : ( ( rule__ALSPlus__RightOperandAssignment_1_2 ) ) ;
    public final void rule__ALSPlus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6172:1: ( ( ( rule__ALSPlus__RightOperandAssignment_1_2 ) ) )
            // InternalAlloyLanguage.g:6173:1: ( ( rule__ALSPlus__RightOperandAssignment_1_2 ) )
            {
            // InternalAlloyLanguage.g:6173:1: ( ( rule__ALSPlus__RightOperandAssignment_1_2 ) )
            // InternalAlloyLanguage.g:6174:1: ( rule__ALSPlus__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPlusAccess().getRightOperandAssignment_1_2()); 
            }
            // InternalAlloyLanguage.g:6175:1: ( rule__ALSPlus__RightOperandAssignment_1_2 )
            // InternalAlloyLanguage.g:6175:2: rule__ALSPlus__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSPlus__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPlusAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPlus__Group_1__2__Impl"


    // $ANTLR start "rule__ALSIntersection__Group__0"
    // InternalAlloyLanguage.g:6191:1: rule__ALSIntersection__Group__0 : rule__ALSIntersection__Group__0__Impl rule__ALSIntersection__Group__1 ;
    public final void rule__ALSIntersection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6195:1: ( rule__ALSIntersection__Group__0__Impl rule__ALSIntersection__Group__1 )
            // InternalAlloyLanguage.g:6196:2: rule__ALSIntersection__Group__0__Impl rule__ALSIntersection__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__ALSIntersection__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSIntersection__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIntersection__Group__0"


    // $ANTLR start "rule__ALSIntersection__Group__0__Impl"
    // InternalAlloyLanguage.g:6203:1: rule__ALSIntersection__Group__0__Impl : ( ruleALSDirectProduct ) ;
    public final void rule__ALSIntersection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6207:1: ( ( ruleALSDirectProduct ) )
            // InternalAlloyLanguage.g:6208:1: ( ruleALSDirectProduct )
            {
            // InternalAlloyLanguage.g:6208:1: ( ruleALSDirectProduct )
            // InternalAlloyLanguage.g:6209:1: ruleALSDirectProduct
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIntersectionAccess().getALSDirectProductParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSDirectProduct();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIntersectionAccess().getALSDirectProductParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIntersection__Group__0__Impl"


    // $ANTLR start "rule__ALSIntersection__Group__1"
    // InternalAlloyLanguage.g:6220:1: rule__ALSIntersection__Group__1 : rule__ALSIntersection__Group__1__Impl ;
    public final void rule__ALSIntersection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6224:1: ( rule__ALSIntersection__Group__1__Impl )
            // InternalAlloyLanguage.g:6225:2: rule__ALSIntersection__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSIntersection__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIntersection__Group__1"


    // $ANTLR start "rule__ALSIntersection__Group__1__Impl"
    // InternalAlloyLanguage.g:6231:1: rule__ALSIntersection__Group__1__Impl : ( ( rule__ALSIntersection__Group_1__0 )* ) ;
    public final void rule__ALSIntersection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6235:1: ( ( ( rule__ALSIntersection__Group_1__0 )* ) )
            // InternalAlloyLanguage.g:6236:1: ( ( rule__ALSIntersection__Group_1__0 )* )
            {
            // InternalAlloyLanguage.g:6236:1: ( ( rule__ALSIntersection__Group_1__0 )* )
            // InternalAlloyLanguage.g:6237:1: ( rule__ALSIntersection__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIntersectionAccess().getGroup_1()); 
            }
            // InternalAlloyLanguage.g:6238:1: ( rule__ALSIntersection__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==58) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAlloyLanguage.g:6238:2: rule__ALSIntersection__Group_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__ALSIntersection__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIntersectionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIntersection__Group__1__Impl"


    // $ANTLR start "rule__ALSIntersection__Group_1__0"
    // InternalAlloyLanguage.g:6252:1: rule__ALSIntersection__Group_1__0 : rule__ALSIntersection__Group_1__0__Impl rule__ALSIntersection__Group_1__1 ;
    public final void rule__ALSIntersection__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6256:1: ( rule__ALSIntersection__Group_1__0__Impl rule__ALSIntersection__Group_1__1 )
            // InternalAlloyLanguage.g:6257:2: rule__ALSIntersection__Group_1__0__Impl rule__ALSIntersection__Group_1__1
            {
            pushFollow(FOLLOW_44);
            rule__ALSIntersection__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSIntersection__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIntersection__Group_1__0"


    // $ANTLR start "rule__ALSIntersection__Group_1__0__Impl"
    // InternalAlloyLanguage.g:6264:1: rule__ALSIntersection__Group_1__0__Impl : ( () ) ;
    public final void rule__ALSIntersection__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6268:1: ( ( () ) )
            // InternalAlloyLanguage.g:6269:1: ( () )
            {
            // InternalAlloyLanguage.g:6269:1: ( () )
            // InternalAlloyLanguage.g:6270:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIntersectionAccess().getALSIntersectionLeftOperandAction_1_0()); 
            }
            // InternalAlloyLanguage.g:6271:1: ()
            // InternalAlloyLanguage.g:6273:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIntersectionAccess().getALSIntersectionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIntersection__Group_1__0__Impl"


    // $ANTLR start "rule__ALSIntersection__Group_1__1"
    // InternalAlloyLanguage.g:6283:1: rule__ALSIntersection__Group_1__1 : rule__ALSIntersection__Group_1__1__Impl rule__ALSIntersection__Group_1__2 ;
    public final void rule__ALSIntersection__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6287:1: ( rule__ALSIntersection__Group_1__1__Impl rule__ALSIntersection__Group_1__2 )
            // InternalAlloyLanguage.g:6288:2: rule__ALSIntersection__Group_1__1__Impl rule__ALSIntersection__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSIntersection__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSIntersection__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIntersection__Group_1__1"


    // $ANTLR start "rule__ALSIntersection__Group_1__1__Impl"
    // InternalAlloyLanguage.g:6295:1: rule__ALSIntersection__Group_1__1__Impl : ( '&' ) ;
    public final void rule__ALSIntersection__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6299:1: ( ( '&' ) )
            // InternalAlloyLanguage.g:6300:1: ( '&' )
            {
            // InternalAlloyLanguage.g:6300:1: ( '&' )
            // InternalAlloyLanguage.g:6301:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIntersectionAccess().getAmpersandKeyword_1_1()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIntersectionAccess().getAmpersandKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIntersection__Group_1__1__Impl"


    // $ANTLR start "rule__ALSIntersection__Group_1__2"
    // InternalAlloyLanguage.g:6314:1: rule__ALSIntersection__Group_1__2 : rule__ALSIntersection__Group_1__2__Impl ;
    public final void rule__ALSIntersection__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6318:1: ( rule__ALSIntersection__Group_1__2__Impl )
            // InternalAlloyLanguage.g:6319:2: rule__ALSIntersection__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSIntersection__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIntersection__Group_1__2"


    // $ANTLR start "rule__ALSIntersection__Group_1__2__Impl"
    // InternalAlloyLanguage.g:6325:1: rule__ALSIntersection__Group_1__2__Impl : ( ( rule__ALSIntersection__RightOperandAssignment_1_2 ) ) ;
    public final void rule__ALSIntersection__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6329:1: ( ( ( rule__ALSIntersection__RightOperandAssignment_1_2 ) ) )
            // InternalAlloyLanguage.g:6330:1: ( ( rule__ALSIntersection__RightOperandAssignment_1_2 ) )
            {
            // InternalAlloyLanguage.g:6330:1: ( ( rule__ALSIntersection__RightOperandAssignment_1_2 ) )
            // InternalAlloyLanguage.g:6331:1: ( rule__ALSIntersection__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIntersectionAccess().getRightOperandAssignment_1_2()); 
            }
            // InternalAlloyLanguage.g:6332:1: ( rule__ALSIntersection__RightOperandAssignment_1_2 )
            // InternalAlloyLanguage.g:6332:2: rule__ALSIntersection__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSIntersection__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIntersectionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIntersection__Group_1__2__Impl"


    // $ANTLR start "rule__ALSDirectProduct__Group__0"
    // InternalAlloyLanguage.g:6348:1: rule__ALSDirectProduct__Group__0 : rule__ALSDirectProduct__Group__0__Impl rule__ALSDirectProduct__Group__1 ;
    public final void rule__ALSDirectProduct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6352:1: ( rule__ALSDirectProduct__Group__0__Impl rule__ALSDirectProduct__Group__1 )
            // InternalAlloyLanguage.g:6353:2: rule__ALSDirectProduct__Group__0__Impl rule__ALSDirectProduct__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__ALSDirectProduct__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSDirectProduct__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDirectProduct__Group__0"


    // $ANTLR start "rule__ALSDirectProduct__Group__0__Impl"
    // InternalAlloyLanguage.g:6360:1: rule__ALSDirectProduct__Group__0__Impl : ( ruleALSPreficed ) ;
    public final void rule__ALSDirectProduct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6364:1: ( ( ruleALSPreficed ) )
            // InternalAlloyLanguage.g:6365:1: ( ruleALSPreficed )
            {
            // InternalAlloyLanguage.g:6365:1: ( ruleALSPreficed )
            // InternalAlloyLanguage.g:6366:1: ruleALSPreficed
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDirectProductAccess().getALSPreficedParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSPreficed();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDirectProductAccess().getALSPreficedParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDirectProduct__Group__0__Impl"


    // $ANTLR start "rule__ALSDirectProduct__Group__1"
    // InternalAlloyLanguage.g:6377:1: rule__ALSDirectProduct__Group__1 : rule__ALSDirectProduct__Group__1__Impl ;
    public final void rule__ALSDirectProduct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6381:1: ( rule__ALSDirectProduct__Group__1__Impl )
            // InternalAlloyLanguage.g:6382:2: rule__ALSDirectProduct__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSDirectProduct__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDirectProduct__Group__1"


    // $ANTLR start "rule__ALSDirectProduct__Group__1__Impl"
    // InternalAlloyLanguage.g:6388:1: rule__ALSDirectProduct__Group__1__Impl : ( ( rule__ALSDirectProduct__Group_1__0 )? ) ;
    public final void rule__ALSDirectProduct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6392:1: ( ( ( rule__ALSDirectProduct__Group_1__0 )? ) )
            // InternalAlloyLanguage.g:6393:1: ( ( rule__ALSDirectProduct__Group_1__0 )? )
            {
            // InternalAlloyLanguage.g:6393:1: ( ( rule__ALSDirectProduct__Group_1__0 )? )
            // InternalAlloyLanguage.g:6394:1: ( rule__ALSDirectProduct__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDirectProductAccess().getGroup_1()); 
            }
            // InternalAlloyLanguage.g:6395:1: ( rule__ALSDirectProduct__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=21 && LA43_0<=26)||LA43_0==59) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAlloyLanguage.g:6395:2: rule__ALSDirectProduct__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSDirectProduct__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDirectProductAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDirectProduct__Group__1__Impl"


    // $ANTLR start "rule__ALSDirectProduct__Group_1__0"
    // InternalAlloyLanguage.g:6409:1: rule__ALSDirectProduct__Group_1__0 : rule__ALSDirectProduct__Group_1__0__Impl rule__ALSDirectProduct__Group_1__1 ;
    public final void rule__ALSDirectProduct__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6413:1: ( rule__ALSDirectProduct__Group_1__0__Impl rule__ALSDirectProduct__Group_1__1 )
            // InternalAlloyLanguage.g:6414:2: rule__ALSDirectProduct__Group_1__0__Impl rule__ALSDirectProduct__Group_1__1
            {
            pushFollow(FOLLOW_46);
            rule__ALSDirectProduct__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSDirectProduct__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDirectProduct__Group_1__0"


    // $ANTLR start "rule__ALSDirectProduct__Group_1__0__Impl"
    // InternalAlloyLanguage.g:6421:1: rule__ALSDirectProduct__Group_1__0__Impl : ( () ) ;
    public final void rule__ALSDirectProduct__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6425:1: ( ( () ) )
            // InternalAlloyLanguage.g:6426:1: ( () )
            {
            // InternalAlloyLanguage.g:6426:1: ( () )
            // InternalAlloyLanguage.g:6427:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDirectProductAccess().getALSDirectProductLeftOperandAction_1_0()); 
            }
            // InternalAlloyLanguage.g:6428:1: ()
            // InternalAlloyLanguage.g:6430:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDirectProductAccess().getALSDirectProductLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDirectProduct__Group_1__0__Impl"


    // $ANTLR start "rule__ALSDirectProduct__Group_1__1"
    // InternalAlloyLanguage.g:6440:1: rule__ALSDirectProduct__Group_1__1 : rule__ALSDirectProduct__Group_1__1__Impl rule__ALSDirectProduct__Group_1__2 ;
    public final void rule__ALSDirectProduct__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6444:1: ( rule__ALSDirectProduct__Group_1__1__Impl rule__ALSDirectProduct__Group_1__2 )
            // InternalAlloyLanguage.g:6445:2: rule__ALSDirectProduct__Group_1__1__Impl rule__ALSDirectProduct__Group_1__2
            {
            pushFollow(FOLLOW_46);
            rule__ALSDirectProduct__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSDirectProduct__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDirectProduct__Group_1__1"


    // $ANTLR start "rule__ALSDirectProduct__Group_1__1__Impl"
    // InternalAlloyLanguage.g:6452:1: rule__ALSDirectProduct__Group_1__1__Impl : ( ( rule__ALSDirectProduct__LeftMultiplicitAssignment_1_1 )? ) ;
    public final void rule__ALSDirectProduct__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6456:1: ( ( ( rule__ALSDirectProduct__LeftMultiplicitAssignment_1_1 )? ) )
            // InternalAlloyLanguage.g:6457:1: ( ( rule__ALSDirectProduct__LeftMultiplicitAssignment_1_1 )? )
            {
            // InternalAlloyLanguage.g:6457:1: ( ( rule__ALSDirectProduct__LeftMultiplicitAssignment_1_1 )? )
            // InternalAlloyLanguage.g:6458:1: ( rule__ALSDirectProduct__LeftMultiplicitAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDirectProductAccess().getLeftMultiplicitAssignment_1_1()); 
            }
            // InternalAlloyLanguage.g:6459:1: ( rule__ALSDirectProduct__LeftMultiplicitAssignment_1_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=21 && LA44_0<=26)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAlloyLanguage.g:6459:2: rule__ALSDirectProduct__LeftMultiplicitAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSDirectProduct__LeftMultiplicitAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDirectProductAccess().getLeftMultiplicitAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDirectProduct__Group_1__1__Impl"


    // $ANTLR start "rule__ALSDirectProduct__Group_1__2"
    // InternalAlloyLanguage.g:6469:1: rule__ALSDirectProduct__Group_1__2 : rule__ALSDirectProduct__Group_1__2__Impl rule__ALSDirectProduct__Group_1__3 ;
    public final void rule__ALSDirectProduct__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6473:1: ( rule__ALSDirectProduct__Group_1__2__Impl rule__ALSDirectProduct__Group_1__3 )
            // InternalAlloyLanguage.g:6474:2: rule__ALSDirectProduct__Group_1__2__Impl rule__ALSDirectProduct__Group_1__3
            {
            pushFollow(FOLLOW_16);
            rule__ALSDirectProduct__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSDirectProduct__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDirectProduct__Group_1__2"


    // $ANTLR start "rule__ALSDirectProduct__Group_1__2__Impl"
    // InternalAlloyLanguage.g:6481:1: rule__ALSDirectProduct__Group_1__2__Impl : ( '->' ) ;
    public final void rule__ALSDirectProduct__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6485:1: ( ( '->' ) )
            // InternalAlloyLanguage.g:6486:1: ( '->' )
            {
            // InternalAlloyLanguage.g:6486:1: ( '->' )
            // InternalAlloyLanguage.g:6487:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDirectProductAccess().getHyphenMinusGreaterThanSignKeyword_1_2()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDirectProductAccess().getHyphenMinusGreaterThanSignKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDirectProduct__Group_1__2__Impl"


    // $ANTLR start "rule__ALSDirectProduct__Group_1__3"
    // InternalAlloyLanguage.g:6500:1: rule__ALSDirectProduct__Group_1__3 : rule__ALSDirectProduct__Group_1__3__Impl rule__ALSDirectProduct__Group_1__4 ;
    public final void rule__ALSDirectProduct__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6504:1: ( rule__ALSDirectProduct__Group_1__3__Impl rule__ALSDirectProduct__Group_1__4 )
            // InternalAlloyLanguage.g:6505:2: rule__ALSDirectProduct__Group_1__3__Impl rule__ALSDirectProduct__Group_1__4
            {
            pushFollow(FOLLOW_16);
            rule__ALSDirectProduct__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSDirectProduct__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDirectProduct__Group_1__3"


    // $ANTLR start "rule__ALSDirectProduct__Group_1__3__Impl"
    // InternalAlloyLanguage.g:6512:1: rule__ALSDirectProduct__Group_1__3__Impl : ( ( rule__ALSDirectProduct__RightMultiplicitAssignment_1_3 )? ) ;
    public final void rule__ALSDirectProduct__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6516:1: ( ( ( rule__ALSDirectProduct__RightMultiplicitAssignment_1_3 )? ) )
            // InternalAlloyLanguage.g:6517:1: ( ( rule__ALSDirectProduct__RightMultiplicitAssignment_1_3 )? )
            {
            // InternalAlloyLanguage.g:6517:1: ( ( rule__ALSDirectProduct__RightMultiplicitAssignment_1_3 )? )
            // InternalAlloyLanguage.g:6518:1: ( rule__ALSDirectProduct__RightMultiplicitAssignment_1_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDirectProductAccess().getRightMultiplicitAssignment_1_3()); 
            }
            // InternalAlloyLanguage.g:6519:1: ( rule__ALSDirectProduct__RightMultiplicitAssignment_1_3 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=21 && LA45_0<=26)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAlloyLanguage.g:6519:2: rule__ALSDirectProduct__RightMultiplicitAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSDirectProduct__RightMultiplicitAssignment_1_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDirectProductAccess().getRightMultiplicitAssignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDirectProduct__Group_1__3__Impl"


    // $ANTLR start "rule__ALSDirectProduct__Group_1__4"
    // InternalAlloyLanguage.g:6529:1: rule__ALSDirectProduct__Group_1__4 : rule__ALSDirectProduct__Group_1__4__Impl ;
    public final void rule__ALSDirectProduct__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6533:1: ( rule__ALSDirectProduct__Group_1__4__Impl )
            // InternalAlloyLanguage.g:6534:2: rule__ALSDirectProduct__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSDirectProduct__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDirectProduct__Group_1__4"


    // $ANTLR start "rule__ALSDirectProduct__Group_1__4__Impl"
    // InternalAlloyLanguage.g:6540:1: rule__ALSDirectProduct__Group_1__4__Impl : ( ( rule__ALSDirectProduct__RightOperandAssignment_1_4 ) ) ;
    public final void rule__ALSDirectProduct__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6544:1: ( ( ( rule__ALSDirectProduct__RightOperandAssignment_1_4 ) ) )
            // InternalAlloyLanguage.g:6545:1: ( ( rule__ALSDirectProduct__RightOperandAssignment_1_4 ) )
            {
            // InternalAlloyLanguage.g:6545:1: ( ( rule__ALSDirectProduct__RightOperandAssignment_1_4 ) )
            // InternalAlloyLanguage.g:6546:1: ( rule__ALSDirectProduct__RightOperandAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDirectProductAccess().getRightOperandAssignment_1_4()); 
            }
            // InternalAlloyLanguage.g:6547:1: ( rule__ALSDirectProduct__RightOperandAssignment_1_4 )
            // InternalAlloyLanguage.g:6547:2: rule__ALSDirectProduct__RightOperandAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__ALSDirectProduct__RightOperandAssignment_1_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDirectProductAccess().getRightOperandAssignment_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDirectProduct__Group_1__4__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_0__0"
    // InternalAlloyLanguage.g:6567:1: rule__ALSPreficed__Group_0__0 : rule__ALSPreficed__Group_0__0__Impl rule__ALSPreficed__Group_0__1 ;
    public final void rule__ALSPreficed__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6571:1: ( rule__ALSPreficed__Group_0__0__Impl rule__ALSPreficed__Group_0__1 )
            // InternalAlloyLanguage.g:6572:2: rule__ALSPreficed__Group_0__0__Impl rule__ALSPreficed__Group_0__1
            {
            pushFollow(FOLLOW_47);
            rule__ALSPreficed__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_0__0"


    // $ANTLR start "rule__ALSPreficed__Group_0__0__Impl"
    // InternalAlloyLanguage.g:6579:1: rule__ALSPreficed__Group_0__0__Impl : ( () ) ;
    public final void rule__ALSPreficed__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6583:1: ( ( () ) )
            // InternalAlloyLanguage.g:6584:1: ( () )
            {
            // InternalAlloyLanguage.g:6584:1: ( () )
            // InternalAlloyLanguage.g:6585:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getALSNotAction_0_0()); 
            }
            // InternalAlloyLanguage.g:6586:1: ()
            // InternalAlloyLanguage.g:6588:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getALSNotAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_0__0__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_0__1"
    // InternalAlloyLanguage.g:6598:1: rule__ALSPreficed__Group_0__1 : rule__ALSPreficed__Group_0__1__Impl rule__ALSPreficed__Group_0__2 ;
    public final void rule__ALSPreficed__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6602:1: ( rule__ALSPreficed__Group_0__1__Impl rule__ALSPreficed__Group_0__2 )
            // InternalAlloyLanguage.g:6603:2: rule__ALSPreficed__Group_0__1__Impl rule__ALSPreficed__Group_0__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSPreficed__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_0__1"


    // $ANTLR start "rule__ALSPreficed__Group_0__1__Impl"
    // InternalAlloyLanguage.g:6610:1: rule__ALSPreficed__Group_0__1__Impl : ( ( rule__ALSPreficed__Group_0_1__0 ) ) ;
    public final void rule__ALSPreficed__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6614:1: ( ( ( rule__ALSPreficed__Group_0_1__0 ) ) )
            // InternalAlloyLanguage.g:6615:1: ( ( rule__ALSPreficed__Group_0_1__0 ) )
            {
            // InternalAlloyLanguage.g:6615:1: ( ( rule__ALSPreficed__Group_0_1__0 ) )
            // InternalAlloyLanguage.g:6616:1: ( rule__ALSPreficed__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getGroup_0_1()); 
            }
            // InternalAlloyLanguage.g:6617:1: ( rule__ALSPreficed__Group_0_1__0 )
            // InternalAlloyLanguage.g:6617:2: rule__ALSPreficed__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_0_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getGroup_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_0__1__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_0__2"
    // InternalAlloyLanguage.g:6627:1: rule__ALSPreficed__Group_0__2 : rule__ALSPreficed__Group_0__2__Impl ;
    public final void rule__ALSPreficed__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6631:1: ( rule__ALSPreficed__Group_0__2__Impl )
            // InternalAlloyLanguage.g:6632:2: rule__ALSPreficed__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_0__2"


    // $ANTLR start "rule__ALSPreficed__Group_0__2__Impl"
    // InternalAlloyLanguage.g:6638:1: rule__ALSPreficed__Group_0__2__Impl : ( ( rule__ALSPreficed__OperandAssignment_0_2 ) ) ;
    public final void rule__ALSPreficed__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6642:1: ( ( ( rule__ALSPreficed__OperandAssignment_0_2 ) ) )
            // InternalAlloyLanguage.g:6643:1: ( ( rule__ALSPreficed__OperandAssignment_0_2 ) )
            {
            // InternalAlloyLanguage.g:6643:1: ( ( rule__ALSPreficed__OperandAssignment_0_2 ) )
            // InternalAlloyLanguage.g:6644:1: ( rule__ALSPreficed__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getOperandAssignment_0_2()); 
            }
            // InternalAlloyLanguage.g:6645:1: ( rule__ALSPreficed__OperandAssignment_0_2 )
            // InternalAlloyLanguage.g:6645:2: rule__ALSPreficed__OperandAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__OperandAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getOperandAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_0__2__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_0_1__0"
    // InternalAlloyLanguage.g:6661:1: rule__ALSPreficed__Group_0_1__0 : rule__ALSPreficed__Group_0_1__0__Impl ;
    public final void rule__ALSPreficed__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6665:1: ( rule__ALSPreficed__Group_0_1__0__Impl )
            // InternalAlloyLanguage.g:6666:2: rule__ALSPreficed__Group_0_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_0_1__0"


    // $ANTLR start "rule__ALSPreficed__Group_0_1__0__Impl"
    // InternalAlloyLanguage.g:6672:1: rule__ALSPreficed__Group_0_1__0__Impl : ( ( rule__ALSPreficed__Alternatives_0_1_0 ) ) ;
    public final void rule__ALSPreficed__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6676:1: ( ( ( rule__ALSPreficed__Alternatives_0_1_0 ) ) )
            // InternalAlloyLanguage.g:6677:1: ( ( rule__ALSPreficed__Alternatives_0_1_0 ) )
            {
            // InternalAlloyLanguage.g:6677:1: ( ( rule__ALSPreficed__Alternatives_0_1_0 ) )
            // InternalAlloyLanguage.g:6678:1: ( rule__ALSPreficed__Alternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getAlternatives_0_1_0()); 
            }
            // InternalAlloyLanguage.g:6679:1: ( rule__ALSPreficed__Alternatives_0_1_0 )
            // InternalAlloyLanguage.g:6679:2: rule__ALSPreficed__Alternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Alternatives_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getAlternatives_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_0_1__0__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_1__0"
    // InternalAlloyLanguage.g:6691:1: rule__ALSPreficed__Group_1__0 : rule__ALSPreficed__Group_1__0__Impl rule__ALSPreficed__Group_1__1 ;
    public final void rule__ALSPreficed__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6695:1: ( rule__ALSPreficed__Group_1__0__Impl rule__ALSPreficed__Group_1__1 )
            // InternalAlloyLanguage.g:6696:2: rule__ALSPreficed__Group_1__0__Impl rule__ALSPreficed__Group_1__1
            {
            pushFollow(FOLLOW_48);
            rule__ALSPreficed__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_1__0"


    // $ANTLR start "rule__ALSPreficed__Group_1__0__Impl"
    // InternalAlloyLanguage.g:6703:1: rule__ALSPreficed__Group_1__0__Impl : ( () ) ;
    public final void rule__ALSPreficed__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6707:1: ( ( () ) )
            // InternalAlloyLanguage.g:6708:1: ( () )
            {
            // InternalAlloyLanguage.g:6708:1: ( () )
            // InternalAlloyLanguage.g:6709:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getALSInverseRelationAction_1_0()); 
            }
            // InternalAlloyLanguage.g:6710:1: ()
            // InternalAlloyLanguage.g:6712:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getALSInverseRelationAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_1__0__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_1__1"
    // InternalAlloyLanguage.g:6722:1: rule__ALSPreficed__Group_1__1 : rule__ALSPreficed__Group_1__1__Impl rule__ALSPreficed__Group_1__2 ;
    public final void rule__ALSPreficed__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6726:1: ( rule__ALSPreficed__Group_1__1__Impl rule__ALSPreficed__Group_1__2 )
            // InternalAlloyLanguage.g:6727:2: rule__ALSPreficed__Group_1__1__Impl rule__ALSPreficed__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSPreficed__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_1__1"


    // $ANTLR start "rule__ALSPreficed__Group_1__1__Impl"
    // InternalAlloyLanguage.g:6734:1: rule__ALSPreficed__Group_1__1__Impl : ( ( '~' ) ) ;
    public final void rule__ALSPreficed__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6738:1: ( ( ( '~' ) ) )
            // InternalAlloyLanguage.g:6739:1: ( ( '~' ) )
            {
            // InternalAlloyLanguage.g:6739:1: ( ( '~' ) )
            // InternalAlloyLanguage.g:6740:1: ( '~' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getTildeKeyword_1_1()); 
            }
            // InternalAlloyLanguage.g:6741:1: ( '~' )
            // InternalAlloyLanguage.g:6742:2: '~'
            {
            match(input,60,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getTildeKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_1__1__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_1__2"
    // InternalAlloyLanguage.g:6753:1: rule__ALSPreficed__Group_1__2 : rule__ALSPreficed__Group_1__2__Impl ;
    public final void rule__ALSPreficed__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6757:1: ( rule__ALSPreficed__Group_1__2__Impl )
            // InternalAlloyLanguage.g:6758:2: rule__ALSPreficed__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_1__2"


    // $ANTLR start "rule__ALSPreficed__Group_1__2__Impl"
    // InternalAlloyLanguage.g:6764:1: rule__ALSPreficed__Group_1__2__Impl : ( ( rule__ALSPreficed__OperandAssignment_1_2 ) ) ;
    public final void rule__ALSPreficed__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6768:1: ( ( ( rule__ALSPreficed__OperandAssignment_1_2 ) ) )
            // InternalAlloyLanguage.g:6769:1: ( ( rule__ALSPreficed__OperandAssignment_1_2 ) )
            {
            // InternalAlloyLanguage.g:6769:1: ( ( rule__ALSPreficed__OperandAssignment_1_2 ) )
            // InternalAlloyLanguage.g:6770:1: ( rule__ALSPreficed__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getOperandAssignment_1_2()); 
            }
            // InternalAlloyLanguage.g:6771:1: ( rule__ALSPreficed__OperandAssignment_1_2 )
            // InternalAlloyLanguage.g:6771:2: rule__ALSPreficed__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_1__2__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_2__0"
    // InternalAlloyLanguage.g:6787:1: rule__ALSPreficed__Group_2__0 : rule__ALSPreficed__Group_2__0__Impl rule__ALSPreficed__Group_2__1 ;
    public final void rule__ALSPreficed__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6791:1: ( rule__ALSPreficed__Group_2__0__Impl rule__ALSPreficed__Group_2__1 )
            // InternalAlloyLanguage.g:6792:2: rule__ALSPreficed__Group_2__0__Impl rule__ALSPreficed__Group_2__1
            {
            pushFollow(FOLLOW_49);
            rule__ALSPreficed__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_2__0"


    // $ANTLR start "rule__ALSPreficed__Group_2__0__Impl"
    // InternalAlloyLanguage.g:6799:1: rule__ALSPreficed__Group_2__0__Impl : ( () ) ;
    public final void rule__ALSPreficed__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6803:1: ( ( () ) )
            // InternalAlloyLanguage.g:6804:1: ( () )
            {
            // InternalAlloyLanguage.g:6804:1: ( () )
            // InternalAlloyLanguage.g:6805:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getAlSTransitiveClosureAction_2_0()); 
            }
            // InternalAlloyLanguage.g:6806:1: ()
            // InternalAlloyLanguage.g:6808:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getAlSTransitiveClosureAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_2__0__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_2__1"
    // InternalAlloyLanguage.g:6818:1: rule__ALSPreficed__Group_2__1 : rule__ALSPreficed__Group_2__1__Impl rule__ALSPreficed__Group_2__2 ;
    public final void rule__ALSPreficed__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6822:1: ( rule__ALSPreficed__Group_2__1__Impl rule__ALSPreficed__Group_2__2 )
            // InternalAlloyLanguage.g:6823:2: rule__ALSPreficed__Group_2__1__Impl rule__ALSPreficed__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSPreficed__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_2__1"


    // $ANTLR start "rule__ALSPreficed__Group_2__1__Impl"
    // InternalAlloyLanguage.g:6830:1: rule__ALSPreficed__Group_2__1__Impl : ( '^' ) ;
    public final void rule__ALSPreficed__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6834:1: ( ( '^' ) )
            // InternalAlloyLanguage.g:6835:1: ( '^' )
            {
            // InternalAlloyLanguage.g:6835:1: ( '^' )
            // InternalAlloyLanguage.g:6836:1: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getCircumflexAccentKeyword_2_1()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getCircumflexAccentKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_2__1__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_2__2"
    // InternalAlloyLanguage.g:6849:1: rule__ALSPreficed__Group_2__2 : rule__ALSPreficed__Group_2__2__Impl ;
    public final void rule__ALSPreficed__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6853:1: ( rule__ALSPreficed__Group_2__2__Impl )
            // InternalAlloyLanguage.g:6854:2: rule__ALSPreficed__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_2__2"


    // $ANTLR start "rule__ALSPreficed__Group_2__2__Impl"
    // InternalAlloyLanguage.g:6860:1: rule__ALSPreficed__Group_2__2__Impl : ( ( rule__ALSPreficed__OperandAssignment_2_2 ) ) ;
    public final void rule__ALSPreficed__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6864:1: ( ( ( rule__ALSPreficed__OperandAssignment_2_2 ) ) )
            // InternalAlloyLanguage.g:6865:1: ( ( rule__ALSPreficed__OperandAssignment_2_2 ) )
            {
            // InternalAlloyLanguage.g:6865:1: ( ( rule__ALSPreficed__OperandAssignment_2_2 ) )
            // InternalAlloyLanguage.g:6866:1: ( rule__ALSPreficed__OperandAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getOperandAssignment_2_2()); 
            }
            // InternalAlloyLanguage.g:6867:1: ( rule__ALSPreficed__OperandAssignment_2_2 )
            // InternalAlloyLanguage.g:6867:2: rule__ALSPreficed__OperandAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__OperandAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getOperandAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_2__2__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_3__0"
    // InternalAlloyLanguage.g:6883:1: rule__ALSPreficed__Group_3__0 : rule__ALSPreficed__Group_3__0__Impl rule__ALSPreficed__Group_3__1 ;
    public final void rule__ALSPreficed__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6887:1: ( rule__ALSPreficed__Group_3__0__Impl rule__ALSPreficed__Group_3__1 )
            // InternalAlloyLanguage.g:6888:2: rule__ALSPreficed__Group_3__0__Impl rule__ALSPreficed__Group_3__1
            {
            pushFollow(FOLLOW_50);
            rule__ALSPreficed__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_3__0"


    // $ANTLR start "rule__ALSPreficed__Group_3__0__Impl"
    // InternalAlloyLanguage.g:6895:1: rule__ALSPreficed__Group_3__0__Impl : ( () ) ;
    public final void rule__ALSPreficed__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6899:1: ( ( () ) )
            // InternalAlloyLanguage.g:6900:1: ( () )
            {
            // InternalAlloyLanguage.g:6900:1: ( () )
            // InternalAlloyLanguage.g:6901:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getALSReflectiveTransitiveClosureAction_3_0()); 
            }
            // InternalAlloyLanguage.g:6902:1: ()
            // InternalAlloyLanguage.g:6904:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getALSReflectiveTransitiveClosureAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_3__0__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_3__1"
    // InternalAlloyLanguage.g:6914:1: rule__ALSPreficed__Group_3__1 : rule__ALSPreficed__Group_3__1__Impl rule__ALSPreficed__Group_3__2 ;
    public final void rule__ALSPreficed__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6918:1: ( rule__ALSPreficed__Group_3__1__Impl rule__ALSPreficed__Group_3__2 )
            // InternalAlloyLanguage.g:6919:2: rule__ALSPreficed__Group_3__1__Impl rule__ALSPreficed__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSPreficed__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_3__1"


    // $ANTLR start "rule__ALSPreficed__Group_3__1__Impl"
    // InternalAlloyLanguage.g:6926:1: rule__ALSPreficed__Group_3__1__Impl : ( '*' ) ;
    public final void rule__ALSPreficed__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6930:1: ( ( '*' ) )
            // InternalAlloyLanguage.g:6931:1: ( '*' )
            {
            // InternalAlloyLanguage.g:6931:1: ( '*' )
            // InternalAlloyLanguage.g:6932:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getAsteriskKeyword_3_1()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getAsteriskKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_3__1__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_3__2"
    // InternalAlloyLanguage.g:6945:1: rule__ALSPreficed__Group_3__2 : rule__ALSPreficed__Group_3__2__Impl ;
    public final void rule__ALSPreficed__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6949:1: ( rule__ALSPreficed__Group_3__2__Impl )
            // InternalAlloyLanguage.g:6950:2: rule__ALSPreficed__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_3__2"


    // $ANTLR start "rule__ALSPreficed__Group_3__2__Impl"
    // InternalAlloyLanguage.g:6956:1: rule__ALSPreficed__Group_3__2__Impl : ( ( rule__ALSPreficed__OperandAssignment_3_2 ) ) ;
    public final void rule__ALSPreficed__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6960:1: ( ( ( rule__ALSPreficed__OperandAssignment_3_2 ) ) )
            // InternalAlloyLanguage.g:6961:1: ( ( rule__ALSPreficed__OperandAssignment_3_2 ) )
            {
            // InternalAlloyLanguage.g:6961:1: ( ( rule__ALSPreficed__OperandAssignment_3_2 ) )
            // InternalAlloyLanguage.g:6962:1: ( rule__ALSPreficed__OperandAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getOperandAssignment_3_2()); 
            }
            // InternalAlloyLanguage.g:6963:1: ( rule__ALSPreficed__OperandAssignment_3_2 )
            // InternalAlloyLanguage.g:6963:2: rule__ALSPreficed__OperandAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__OperandAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getOperandAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_3__2__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_4__0"
    // InternalAlloyLanguage.g:6979:1: rule__ALSPreficed__Group_4__0 : rule__ALSPreficed__Group_4__0__Impl rule__ALSPreficed__Group_4__1 ;
    public final void rule__ALSPreficed__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6983:1: ( rule__ALSPreficed__Group_4__0__Impl rule__ALSPreficed__Group_4__1 )
            // InternalAlloyLanguage.g:6984:2: rule__ALSPreficed__Group_4__0__Impl rule__ALSPreficed__Group_4__1
            {
            pushFollow(FOLLOW_51);
            rule__ALSPreficed__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_4__0"


    // $ANTLR start "rule__ALSPreficed__Group_4__0__Impl"
    // InternalAlloyLanguage.g:6991:1: rule__ALSPreficed__Group_4__0__Impl : ( () ) ;
    public final void rule__ALSPreficed__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:6995:1: ( ( () ) )
            // InternalAlloyLanguage.g:6996:1: ( () )
            {
            // InternalAlloyLanguage.g:6996:1: ( () )
            // InternalAlloyLanguage.g:6997:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getALSCardinalityAction_4_0()); 
            }
            // InternalAlloyLanguage.g:6998:1: ()
            // InternalAlloyLanguage.g:7000:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getALSCardinalityAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_4__0__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_4__1"
    // InternalAlloyLanguage.g:7010:1: rule__ALSPreficed__Group_4__1 : rule__ALSPreficed__Group_4__1__Impl rule__ALSPreficed__Group_4__2 ;
    public final void rule__ALSPreficed__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7014:1: ( rule__ALSPreficed__Group_4__1__Impl rule__ALSPreficed__Group_4__2 )
            // InternalAlloyLanguage.g:7015:2: rule__ALSPreficed__Group_4__1__Impl rule__ALSPreficed__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSPreficed__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_4__1"


    // $ANTLR start "rule__ALSPreficed__Group_4__1__Impl"
    // InternalAlloyLanguage.g:7022:1: rule__ALSPreficed__Group_4__1__Impl : ( '#' ) ;
    public final void rule__ALSPreficed__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7026:1: ( ( '#' ) )
            // InternalAlloyLanguage.g:7027:1: ( '#' )
            {
            // InternalAlloyLanguage.g:7027:1: ( '#' )
            // InternalAlloyLanguage.g:7028:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getNumberSignKeyword_4_1()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getNumberSignKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_4__1__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_4__2"
    // InternalAlloyLanguage.g:7041:1: rule__ALSPreficed__Group_4__2 : rule__ALSPreficed__Group_4__2__Impl ;
    public final void rule__ALSPreficed__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7045:1: ( rule__ALSPreficed__Group_4__2__Impl )
            // InternalAlloyLanguage.g:7046:2: rule__ALSPreficed__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_4__2"


    // $ANTLR start "rule__ALSPreficed__Group_4__2__Impl"
    // InternalAlloyLanguage.g:7052:1: rule__ALSPreficed__Group_4__2__Impl : ( ( rule__ALSPreficed__OperandAssignment_4_2 ) ) ;
    public final void rule__ALSPreficed__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7056:1: ( ( ( rule__ALSPreficed__OperandAssignment_4_2 ) ) )
            // InternalAlloyLanguage.g:7057:1: ( ( rule__ALSPreficed__OperandAssignment_4_2 ) )
            {
            // InternalAlloyLanguage.g:7057:1: ( ( rule__ALSPreficed__OperandAssignment_4_2 ) )
            // InternalAlloyLanguage.g:7058:1: ( rule__ALSPreficed__OperandAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getOperandAssignment_4_2()); 
            }
            // InternalAlloyLanguage.g:7059:1: ( rule__ALSPreficed__OperandAssignment_4_2 )
            // InternalAlloyLanguage.g:7059:2: rule__ALSPreficed__OperandAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__OperandAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getOperandAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_4__2__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_5__0"
    // InternalAlloyLanguage.g:7075:1: rule__ALSPreficed__Group_5__0 : rule__ALSPreficed__Group_5__0__Impl rule__ALSPreficed__Group_5__1 ;
    public final void rule__ALSPreficed__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7079:1: ( rule__ALSPreficed__Group_5__0__Impl rule__ALSPreficed__Group_5__1 )
            // InternalAlloyLanguage.g:7080:2: rule__ALSPreficed__Group_5__0__Impl rule__ALSPreficed__Group_5__1
            {
            pushFollow(FOLLOW_42);
            rule__ALSPreficed__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_5__0"


    // $ANTLR start "rule__ALSPreficed__Group_5__0__Impl"
    // InternalAlloyLanguage.g:7087:1: rule__ALSPreficed__Group_5__0__Impl : ( () ) ;
    public final void rule__ALSPreficed__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7091:1: ( ( () ) )
            // InternalAlloyLanguage.g:7092:1: ( () )
            {
            // InternalAlloyLanguage.g:7092:1: ( () )
            // InternalAlloyLanguage.g:7093:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getALSUnaryMinusAction_5_0()); 
            }
            // InternalAlloyLanguage.g:7094:1: ()
            // InternalAlloyLanguage.g:7096:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getALSUnaryMinusAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_5__0__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_5__1"
    // InternalAlloyLanguage.g:7106:1: rule__ALSPreficed__Group_5__1 : rule__ALSPreficed__Group_5__1__Impl rule__ALSPreficed__Group_5__2 ;
    public final void rule__ALSPreficed__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7110:1: ( rule__ALSPreficed__Group_5__1__Impl rule__ALSPreficed__Group_5__2 )
            // InternalAlloyLanguage.g:7111:2: rule__ALSPreficed__Group_5__1__Impl rule__ALSPreficed__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSPreficed__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_5__1"


    // $ANTLR start "rule__ALSPreficed__Group_5__1__Impl"
    // InternalAlloyLanguage.g:7118:1: rule__ALSPreficed__Group_5__1__Impl : ( ( '-' ) ) ;
    public final void rule__ALSPreficed__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7122:1: ( ( ( '-' ) ) )
            // InternalAlloyLanguage.g:7123:1: ( ( '-' ) )
            {
            // InternalAlloyLanguage.g:7123:1: ( ( '-' ) )
            // InternalAlloyLanguage.g:7124:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getHyphenMinusKeyword_5_1()); 
            }
            // InternalAlloyLanguage.g:7125:1: ( '-' )
            // InternalAlloyLanguage.g:7126:2: '-'
            {
            match(input,57,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getHyphenMinusKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_5__1__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_5__2"
    // InternalAlloyLanguage.g:7137:1: rule__ALSPreficed__Group_5__2 : rule__ALSPreficed__Group_5__2__Impl ;
    public final void rule__ALSPreficed__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7141:1: ( rule__ALSPreficed__Group_5__2__Impl )
            // InternalAlloyLanguage.g:7142:2: rule__ALSPreficed__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_5__2"


    // $ANTLR start "rule__ALSPreficed__Group_5__2__Impl"
    // InternalAlloyLanguage.g:7148:1: rule__ALSPreficed__Group_5__2__Impl : ( ( rule__ALSPreficed__OperandAssignment_5_2 ) ) ;
    public final void rule__ALSPreficed__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7152:1: ( ( ( rule__ALSPreficed__OperandAssignment_5_2 ) ) )
            // InternalAlloyLanguage.g:7153:1: ( ( rule__ALSPreficed__OperandAssignment_5_2 ) )
            {
            // InternalAlloyLanguage.g:7153:1: ( ( rule__ALSPreficed__OperandAssignment_5_2 ) )
            // InternalAlloyLanguage.g:7154:1: ( rule__ALSPreficed__OperandAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getOperandAssignment_5_2()); 
            }
            // InternalAlloyLanguage.g:7155:1: ( rule__ALSPreficed__OperandAssignment_5_2 )
            // InternalAlloyLanguage.g:7155:2: rule__ALSPreficed__OperandAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__OperandAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getOperandAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_5__2__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_6__0"
    // InternalAlloyLanguage.g:7171:1: rule__ALSPreficed__Group_6__0 : rule__ALSPreficed__Group_6__0__Impl rule__ALSPreficed__Group_6__1 ;
    public final void rule__ALSPreficed__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7175:1: ( rule__ALSPreficed__Group_6__0__Impl rule__ALSPreficed__Group_6__1 )
            // InternalAlloyLanguage.g:7176:2: rule__ALSPreficed__Group_6__0__Impl rule__ALSPreficed__Group_6__1
            {
            pushFollow(FOLLOW_52);
            rule__ALSPreficed__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6__0"


    // $ANTLR start "rule__ALSPreficed__Group_6__0__Impl"
    // InternalAlloyLanguage.g:7183:1: rule__ALSPreficed__Group_6__0__Impl : ( () ) ;
    public final void rule__ALSPreficed__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7187:1: ( ( () ) )
            // InternalAlloyLanguage.g:7188:1: ( () )
            {
            // InternalAlloyLanguage.g:7188:1: ( () )
            // InternalAlloyLanguage.g:7189:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getALSSumAction_6_0()); 
            }
            // InternalAlloyLanguage.g:7190:1: ()
            // InternalAlloyLanguage.g:7192:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getALSSumAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6__0__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_6__1"
    // InternalAlloyLanguage.g:7202:1: rule__ALSPreficed__Group_6__1 : rule__ALSPreficed__Group_6__1__Impl rule__ALSPreficed__Group_6__2 ;
    public final void rule__ALSPreficed__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7206:1: ( rule__ALSPreficed__Group_6__1__Impl rule__ALSPreficed__Group_6__2 )
            // InternalAlloyLanguage.g:7207:2: rule__ALSPreficed__Group_6__1__Impl rule__ALSPreficed__Group_6__2
            {
            pushFollow(FOLLOW_5);
            rule__ALSPreficed__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6__1"


    // $ANTLR start "rule__ALSPreficed__Group_6__1__Impl"
    // InternalAlloyLanguage.g:7214:1: rule__ALSPreficed__Group_6__1__Impl : ( 'sum' ) ;
    public final void rule__ALSPreficed__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7218:1: ( ( 'sum' ) )
            // InternalAlloyLanguage.g:7219:1: ( 'sum' )
            {
            // InternalAlloyLanguage.g:7219:1: ( 'sum' )
            // InternalAlloyLanguage.g:7220:1: 'sum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getSumKeyword_6_1()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getSumKeyword_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6__1__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_6__2"
    // InternalAlloyLanguage.g:7233:1: rule__ALSPreficed__Group_6__2 : rule__ALSPreficed__Group_6__2__Impl rule__ALSPreficed__Group_6__3 ;
    public final void rule__ALSPreficed__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7237:1: ( rule__ALSPreficed__Group_6__2__Impl rule__ALSPreficed__Group_6__3 )
            // InternalAlloyLanguage.g:7238:2: rule__ALSPreficed__Group_6__2__Impl rule__ALSPreficed__Group_6__3
            {
            pushFollow(FOLLOW_24);
            rule__ALSPreficed__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_6__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6__2"


    // $ANTLR start "rule__ALSPreficed__Group_6__2__Impl"
    // InternalAlloyLanguage.g:7245:1: rule__ALSPreficed__Group_6__2__Impl : ( ( rule__ALSPreficed__VariablesAssignment_6_2 ) ) ;
    public final void rule__ALSPreficed__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7249:1: ( ( ( rule__ALSPreficed__VariablesAssignment_6_2 ) ) )
            // InternalAlloyLanguage.g:7250:1: ( ( rule__ALSPreficed__VariablesAssignment_6_2 ) )
            {
            // InternalAlloyLanguage.g:7250:1: ( ( rule__ALSPreficed__VariablesAssignment_6_2 ) )
            // InternalAlloyLanguage.g:7251:1: ( rule__ALSPreficed__VariablesAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getVariablesAssignment_6_2()); 
            }
            // InternalAlloyLanguage.g:7252:1: ( rule__ALSPreficed__VariablesAssignment_6_2 )
            // InternalAlloyLanguage.g:7252:2: rule__ALSPreficed__VariablesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__VariablesAssignment_6_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getVariablesAssignment_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6__2__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_6__3"
    // InternalAlloyLanguage.g:7262:1: rule__ALSPreficed__Group_6__3 : rule__ALSPreficed__Group_6__3__Impl rule__ALSPreficed__Group_6__4 ;
    public final void rule__ALSPreficed__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7266:1: ( rule__ALSPreficed__Group_6__3__Impl rule__ALSPreficed__Group_6__4 )
            // InternalAlloyLanguage.g:7267:2: rule__ALSPreficed__Group_6__3__Impl rule__ALSPreficed__Group_6__4
            {
            pushFollow(FOLLOW_24);
            rule__ALSPreficed__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_6__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6__3"


    // $ANTLR start "rule__ALSPreficed__Group_6__3__Impl"
    // InternalAlloyLanguage.g:7274:1: rule__ALSPreficed__Group_6__3__Impl : ( ( rule__ALSPreficed__Group_6_3__0 )* ) ;
    public final void rule__ALSPreficed__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7278:1: ( ( ( rule__ALSPreficed__Group_6_3__0 )* ) )
            // InternalAlloyLanguage.g:7279:1: ( ( rule__ALSPreficed__Group_6_3__0 )* )
            {
            // InternalAlloyLanguage.g:7279:1: ( ( rule__ALSPreficed__Group_6_3__0 )* )
            // InternalAlloyLanguage.g:7280:1: ( rule__ALSPreficed__Group_6_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getGroup_6_3()); 
            }
            // InternalAlloyLanguage.g:7281:1: ( rule__ALSPreficed__Group_6_3__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==35) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalAlloyLanguage.g:7281:2: rule__ALSPreficed__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ALSPreficed__Group_6_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getGroup_6_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6__3__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_6__4"
    // InternalAlloyLanguage.g:7291:1: rule__ALSPreficed__Group_6__4 : rule__ALSPreficed__Group_6__4__Impl rule__ALSPreficed__Group_6__5 ;
    public final void rule__ALSPreficed__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7295:1: ( rule__ALSPreficed__Group_6__4__Impl rule__ALSPreficed__Group_6__5 )
            // InternalAlloyLanguage.g:7296:2: rule__ALSPreficed__Group_6__4__Impl rule__ALSPreficed__Group_6__5
            {
            pushFollow(FOLLOW_16);
            rule__ALSPreficed__Group_6__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_6__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6__4"


    // $ANTLR start "rule__ALSPreficed__Group_6__4__Impl"
    // InternalAlloyLanguage.g:7303:1: rule__ALSPreficed__Group_6__4__Impl : ( '{' ) ;
    public final void rule__ALSPreficed__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7307:1: ( ( '{' ) )
            // InternalAlloyLanguage.g:7308:1: ( '{' )
            {
            // InternalAlloyLanguage.g:7308:1: ( '{' )
            // InternalAlloyLanguage.g:7309:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getLeftCurlyBracketKeyword_6_4()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getLeftCurlyBracketKeyword_6_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6__4__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_6__5"
    // InternalAlloyLanguage.g:7322:1: rule__ALSPreficed__Group_6__5 : rule__ALSPreficed__Group_6__5__Impl rule__ALSPreficed__Group_6__6 ;
    public final void rule__ALSPreficed__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7326:1: ( rule__ALSPreficed__Group_6__5__Impl rule__ALSPreficed__Group_6__6 )
            // InternalAlloyLanguage.g:7327:2: rule__ALSPreficed__Group_6__5__Impl rule__ALSPreficed__Group_6__6
            {
            pushFollow(FOLLOW_19);
            rule__ALSPreficed__Group_6__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_6__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6__5"


    // $ANTLR start "rule__ALSPreficed__Group_6__5__Impl"
    // InternalAlloyLanguage.g:7334:1: rule__ALSPreficed__Group_6__5__Impl : ( ( rule__ALSPreficed__ExpressionAssignment_6_5 ) ) ;
    public final void rule__ALSPreficed__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7338:1: ( ( ( rule__ALSPreficed__ExpressionAssignment_6_5 ) ) )
            // InternalAlloyLanguage.g:7339:1: ( ( rule__ALSPreficed__ExpressionAssignment_6_5 ) )
            {
            // InternalAlloyLanguage.g:7339:1: ( ( rule__ALSPreficed__ExpressionAssignment_6_5 ) )
            // InternalAlloyLanguage.g:7340:1: ( rule__ALSPreficed__ExpressionAssignment_6_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getExpressionAssignment_6_5()); 
            }
            // InternalAlloyLanguage.g:7341:1: ( rule__ALSPreficed__ExpressionAssignment_6_5 )
            // InternalAlloyLanguage.g:7341:2: rule__ALSPreficed__ExpressionAssignment_6_5
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__ExpressionAssignment_6_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getExpressionAssignment_6_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6__5__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_6__6"
    // InternalAlloyLanguage.g:7351:1: rule__ALSPreficed__Group_6__6 : rule__ALSPreficed__Group_6__6__Impl ;
    public final void rule__ALSPreficed__Group_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7355:1: ( rule__ALSPreficed__Group_6__6__Impl )
            // InternalAlloyLanguage.g:7356:2: rule__ALSPreficed__Group_6__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_6__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6__6"


    // $ANTLR start "rule__ALSPreficed__Group_6__6__Impl"
    // InternalAlloyLanguage.g:7362:1: rule__ALSPreficed__Group_6__6__Impl : ( '}' ) ;
    public final void rule__ALSPreficed__Group_6__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7366:1: ( ( '}' ) )
            // InternalAlloyLanguage.g:7367:1: ( '}' )
            {
            // InternalAlloyLanguage.g:7367:1: ( '}' )
            // InternalAlloyLanguage.g:7368:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getRightCurlyBracketKeyword_6_6()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getRightCurlyBracketKeyword_6_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6__6__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_6_3__0"
    // InternalAlloyLanguage.g:7395:1: rule__ALSPreficed__Group_6_3__0 : rule__ALSPreficed__Group_6_3__0__Impl rule__ALSPreficed__Group_6_3__1 ;
    public final void rule__ALSPreficed__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7399:1: ( rule__ALSPreficed__Group_6_3__0__Impl rule__ALSPreficed__Group_6_3__1 )
            // InternalAlloyLanguage.g:7400:2: rule__ALSPreficed__Group_6_3__0__Impl rule__ALSPreficed__Group_6_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ALSPreficed__Group_6_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_6_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6_3__0"


    // $ANTLR start "rule__ALSPreficed__Group_6_3__0__Impl"
    // InternalAlloyLanguage.g:7407:1: rule__ALSPreficed__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ALSPreficed__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7411:1: ( ( ',' ) )
            // InternalAlloyLanguage.g:7412:1: ( ',' )
            {
            // InternalAlloyLanguage.g:7412:1: ( ',' )
            // InternalAlloyLanguage.g:7413:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getCommaKeyword_6_3_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getCommaKeyword_6_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6_3__0__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_6_3__1"
    // InternalAlloyLanguage.g:7426:1: rule__ALSPreficed__Group_6_3__1 : rule__ALSPreficed__Group_6_3__1__Impl ;
    public final void rule__ALSPreficed__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7430:1: ( rule__ALSPreficed__Group_6_3__1__Impl )
            // InternalAlloyLanguage.g:7431:2: rule__ALSPreficed__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_6_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6_3__1"


    // $ANTLR start "rule__ALSPreficed__Group_6_3__1__Impl"
    // InternalAlloyLanguage.g:7437:1: rule__ALSPreficed__Group_6_3__1__Impl : ( ( rule__ALSPreficed__VariablesAssignment_6_3_1 ) ) ;
    public final void rule__ALSPreficed__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7441:1: ( ( ( rule__ALSPreficed__VariablesAssignment_6_3_1 ) ) )
            // InternalAlloyLanguage.g:7442:1: ( ( rule__ALSPreficed__VariablesAssignment_6_3_1 ) )
            {
            // InternalAlloyLanguage.g:7442:1: ( ( rule__ALSPreficed__VariablesAssignment_6_3_1 ) )
            // InternalAlloyLanguage.g:7443:1: ( rule__ALSPreficed__VariablesAssignment_6_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getVariablesAssignment_6_3_1()); 
            }
            // InternalAlloyLanguage.g:7444:1: ( rule__ALSPreficed__VariablesAssignment_6_3_1 )
            // InternalAlloyLanguage.g:7444:2: rule__ALSPreficed__VariablesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__VariablesAssignment_6_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getVariablesAssignment_6_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_6_3__1__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_7__0"
    // InternalAlloyLanguage.g:7458:1: rule__ALSPreficed__Group_7__0 : rule__ALSPreficed__Group_7__0__Impl rule__ALSPreficed__Group_7__1 ;
    public final void rule__ALSPreficed__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7462:1: ( rule__ALSPreficed__Group_7__0__Impl rule__ALSPreficed__Group_7__1 )
            // InternalAlloyLanguage.g:7463:2: rule__ALSPreficed__Group_7__0__Impl rule__ALSPreficed__Group_7__1
            {
            pushFollow(FOLLOW_53);
            rule__ALSPreficed__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_7__0"


    // $ANTLR start "rule__ALSPreficed__Group_7__0__Impl"
    // InternalAlloyLanguage.g:7470:1: rule__ALSPreficed__Group_7__0__Impl : ( () ) ;
    public final void rule__ALSPreficed__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7474:1: ( ( () ) )
            // InternalAlloyLanguage.g:7475:1: ( () )
            {
            // InternalAlloyLanguage.g:7475:1: ( () )
            // InternalAlloyLanguage.g:7476:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getALSFunctionCallAction_7_0()); 
            }
            // InternalAlloyLanguage.g:7477:1: ()
            // InternalAlloyLanguage.g:7479:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getALSFunctionCallAction_7_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_7__0__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_7__1"
    // InternalAlloyLanguage.g:7489:1: rule__ALSPreficed__Group_7__1 : rule__ALSPreficed__Group_7__1__Impl rule__ALSPreficed__Group_7__2 ;
    public final void rule__ALSPreficed__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7493:1: ( rule__ALSPreficed__Group_7__1__Impl rule__ALSPreficed__Group_7__2 )
            // InternalAlloyLanguage.g:7494:2: rule__ALSPreficed__Group_7__1__Impl rule__ALSPreficed__Group_7__2
            {
            pushFollow(FOLLOW_17);
            rule__ALSPreficed__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_7__1"


    // $ANTLR start "rule__ALSPreficed__Group_7__1__Impl"
    // InternalAlloyLanguage.g:7501:1: rule__ALSPreficed__Group_7__1__Impl : ( ( rule__ALSPreficed__Alternatives_7_1 ) ) ;
    public final void rule__ALSPreficed__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7505:1: ( ( ( rule__ALSPreficed__Alternatives_7_1 ) ) )
            // InternalAlloyLanguage.g:7506:1: ( ( rule__ALSPreficed__Alternatives_7_1 ) )
            {
            // InternalAlloyLanguage.g:7506:1: ( ( rule__ALSPreficed__Alternatives_7_1 ) )
            // InternalAlloyLanguage.g:7507:1: ( rule__ALSPreficed__Alternatives_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getAlternatives_7_1()); 
            }
            // InternalAlloyLanguage.g:7508:1: ( rule__ALSPreficed__Alternatives_7_1 )
            // InternalAlloyLanguage.g:7508:2: rule__ALSPreficed__Alternatives_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Alternatives_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getAlternatives_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_7__1__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_7__2"
    // InternalAlloyLanguage.g:7518:1: rule__ALSPreficed__Group_7__2 : rule__ALSPreficed__Group_7__2__Impl rule__ALSPreficed__Group_7__3 ;
    public final void rule__ALSPreficed__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7522:1: ( rule__ALSPreficed__Group_7__2__Impl rule__ALSPreficed__Group_7__3 )
            // InternalAlloyLanguage.g:7523:2: rule__ALSPreficed__Group_7__2__Impl rule__ALSPreficed__Group_7__3
            {
            pushFollow(FOLLOW_16);
            rule__ALSPreficed__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_7__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_7__2"


    // $ANTLR start "rule__ALSPreficed__Group_7__2__Impl"
    // InternalAlloyLanguage.g:7530:1: rule__ALSPreficed__Group_7__2__Impl : ( '[' ) ;
    public final void rule__ALSPreficed__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7534:1: ( ( '[' ) )
            // InternalAlloyLanguage.g:7535:1: ( '[' )
            {
            // InternalAlloyLanguage.g:7535:1: ( '[' )
            // InternalAlloyLanguage.g:7536:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getLeftSquareBracketKeyword_7_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getLeftSquareBracketKeyword_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_7__2__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_7__3"
    // InternalAlloyLanguage.g:7549:1: rule__ALSPreficed__Group_7__3 : rule__ALSPreficed__Group_7__3__Impl rule__ALSPreficed__Group_7__4 ;
    public final void rule__ALSPreficed__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7553:1: ( rule__ALSPreficed__Group_7__3__Impl rule__ALSPreficed__Group_7__4 )
            // InternalAlloyLanguage.g:7554:2: rule__ALSPreficed__Group_7__3__Impl rule__ALSPreficed__Group_7__4
            {
            pushFollow(FOLLOW_18);
            rule__ALSPreficed__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_7__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_7__3"


    // $ANTLR start "rule__ALSPreficed__Group_7__3__Impl"
    // InternalAlloyLanguage.g:7561:1: rule__ALSPreficed__Group_7__3__Impl : ( ( rule__ALSPreficed__ParamsAssignment_7_3 ) ) ;
    public final void rule__ALSPreficed__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7565:1: ( ( ( rule__ALSPreficed__ParamsAssignment_7_3 ) ) )
            // InternalAlloyLanguage.g:7566:1: ( ( rule__ALSPreficed__ParamsAssignment_7_3 ) )
            {
            // InternalAlloyLanguage.g:7566:1: ( ( rule__ALSPreficed__ParamsAssignment_7_3 ) )
            // InternalAlloyLanguage.g:7567:1: ( rule__ALSPreficed__ParamsAssignment_7_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getParamsAssignment_7_3()); 
            }
            // InternalAlloyLanguage.g:7568:1: ( rule__ALSPreficed__ParamsAssignment_7_3 )
            // InternalAlloyLanguage.g:7568:2: rule__ALSPreficed__ParamsAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__ParamsAssignment_7_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getParamsAssignment_7_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_7__3__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_7__4"
    // InternalAlloyLanguage.g:7578:1: rule__ALSPreficed__Group_7__4 : rule__ALSPreficed__Group_7__4__Impl rule__ALSPreficed__Group_7__5 ;
    public final void rule__ALSPreficed__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7582:1: ( rule__ALSPreficed__Group_7__4__Impl rule__ALSPreficed__Group_7__5 )
            // InternalAlloyLanguage.g:7583:2: rule__ALSPreficed__Group_7__4__Impl rule__ALSPreficed__Group_7__5
            {
            pushFollow(FOLLOW_18);
            rule__ALSPreficed__Group_7__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_7__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_7__4"


    // $ANTLR start "rule__ALSPreficed__Group_7__4__Impl"
    // InternalAlloyLanguage.g:7590:1: rule__ALSPreficed__Group_7__4__Impl : ( ( rule__ALSPreficed__Group_7_4__0 )* ) ;
    public final void rule__ALSPreficed__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7594:1: ( ( ( rule__ALSPreficed__Group_7_4__0 )* ) )
            // InternalAlloyLanguage.g:7595:1: ( ( rule__ALSPreficed__Group_7_4__0 )* )
            {
            // InternalAlloyLanguage.g:7595:1: ( ( rule__ALSPreficed__Group_7_4__0 )* )
            // InternalAlloyLanguage.g:7596:1: ( rule__ALSPreficed__Group_7_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getGroup_7_4()); 
            }
            // InternalAlloyLanguage.g:7597:1: ( rule__ALSPreficed__Group_7_4__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==35) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalAlloyLanguage.g:7597:2: rule__ALSPreficed__Group_7_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ALSPreficed__Group_7_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getGroup_7_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_7__4__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_7__5"
    // InternalAlloyLanguage.g:7607:1: rule__ALSPreficed__Group_7__5 : rule__ALSPreficed__Group_7__5__Impl ;
    public final void rule__ALSPreficed__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7611:1: ( rule__ALSPreficed__Group_7__5__Impl )
            // InternalAlloyLanguage.g:7612:2: rule__ALSPreficed__Group_7__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_7__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_7__5"


    // $ANTLR start "rule__ALSPreficed__Group_7__5__Impl"
    // InternalAlloyLanguage.g:7618:1: rule__ALSPreficed__Group_7__5__Impl : ( ']' ) ;
    public final void rule__ALSPreficed__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7622:1: ( ( ']' ) )
            // InternalAlloyLanguage.g:7623:1: ( ']' )
            {
            // InternalAlloyLanguage.g:7623:1: ( ']' )
            // InternalAlloyLanguage.g:7624:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getRightSquareBracketKeyword_7_5()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getRightSquareBracketKeyword_7_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_7__5__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_7_4__0"
    // InternalAlloyLanguage.g:7649:1: rule__ALSPreficed__Group_7_4__0 : rule__ALSPreficed__Group_7_4__0__Impl rule__ALSPreficed__Group_7_4__1 ;
    public final void rule__ALSPreficed__Group_7_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7653:1: ( rule__ALSPreficed__Group_7_4__0__Impl rule__ALSPreficed__Group_7_4__1 )
            // InternalAlloyLanguage.g:7654:2: rule__ALSPreficed__Group_7_4__0__Impl rule__ALSPreficed__Group_7_4__1
            {
            pushFollow(FOLLOW_16);
            rule__ALSPreficed__Group_7_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_7_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_7_4__0"


    // $ANTLR start "rule__ALSPreficed__Group_7_4__0__Impl"
    // InternalAlloyLanguage.g:7661:1: rule__ALSPreficed__Group_7_4__0__Impl : ( ',' ) ;
    public final void rule__ALSPreficed__Group_7_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7665:1: ( ( ',' ) )
            // InternalAlloyLanguage.g:7666:1: ( ',' )
            {
            // InternalAlloyLanguage.g:7666:1: ( ',' )
            // InternalAlloyLanguage.g:7667:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getCommaKeyword_7_4_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getCommaKeyword_7_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_7_4__0__Impl"


    // $ANTLR start "rule__ALSPreficed__Group_7_4__1"
    // InternalAlloyLanguage.g:7680:1: rule__ALSPreficed__Group_7_4__1 : rule__ALSPreficed__Group_7_4__1__Impl ;
    public final void rule__ALSPreficed__Group_7_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7684:1: ( rule__ALSPreficed__Group_7_4__1__Impl )
            // InternalAlloyLanguage.g:7685:2: rule__ALSPreficed__Group_7_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__Group_7_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_7_4__1"


    // $ANTLR start "rule__ALSPreficed__Group_7_4__1__Impl"
    // InternalAlloyLanguage.g:7691:1: rule__ALSPreficed__Group_7_4__1__Impl : ( ( rule__ALSPreficed__ParamsAssignment_7_4_1 ) ) ;
    public final void rule__ALSPreficed__Group_7_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7695:1: ( ( ( rule__ALSPreficed__ParamsAssignment_7_4_1 ) ) )
            // InternalAlloyLanguage.g:7696:1: ( ( rule__ALSPreficed__ParamsAssignment_7_4_1 ) )
            {
            // InternalAlloyLanguage.g:7696:1: ( ( rule__ALSPreficed__ParamsAssignment_7_4_1 ) )
            // InternalAlloyLanguage.g:7697:1: ( rule__ALSPreficed__ParamsAssignment_7_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getParamsAssignment_7_4_1()); 
            }
            // InternalAlloyLanguage.g:7698:1: ( rule__ALSPreficed__ParamsAssignment_7_4_1 )
            // InternalAlloyLanguage.g:7698:2: rule__ALSPreficed__ParamsAssignment_7_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSPreficed__ParamsAssignment_7_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getParamsAssignment_7_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__Group_7_4__1__Impl"


    // $ANTLR start "rule__ALSVariableDeclaration__Group__0"
    // InternalAlloyLanguage.g:7712:1: rule__ALSVariableDeclaration__Group__0 : rule__ALSVariableDeclaration__Group__0__Impl rule__ALSVariableDeclaration__Group__1 ;
    public final void rule__ALSVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7716:1: ( rule__ALSVariableDeclaration__Group__0__Impl rule__ALSVariableDeclaration__Group__1 )
            // InternalAlloyLanguage.g:7717:2: rule__ALSVariableDeclaration__Group__0__Impl rule__ALSVariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ALSVariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSVariableDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSVariableDeclaration__Group__0"


    // $ANTLR start "rule__ALSVariableDeclaration__Group__0__Impl"
    // InternalAlloyLanguage.g:7724:1: rule__ALSVariableDeclaration__Group__0__Impl : ( ( rule__ALSVariableDeclaration__NameAssignment_0 ) ) ;
    public final void rule__ALSVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7728:1: ( ( ( rule__ALSVariableDeclaration__NameAssignment_0 ) ) )
            // InternalAlloyLanguage.g:7729:1: ( ( rule__ALSVariableDeclaration__NameAssignment_0 ) )
            {
            // InternalAlloyLanguage.g:7729:1: ( ( rule__ALSVariableDeclaration__NameAssignment_0 ) )
            // InternalAlloyLanguage.g:7730:1: ( rule__ALSVariableDeclaration__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSVariableDeclarationAccess().getNameAssignment_0()); 
            }
            // InternalAlloyLanguage.g:7731:1: ( rule__ALSVariableDeclaration__NameAssignment_0 )
            // InternalAlloyLanguage.g:7731:2: rule__ALSVariableDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ALSVariableDeclaration__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSVariableDeclarationAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSVariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ALSVariableDeclaration__Group__1"
    // InternalAlloyLanguage.g:7741:1: rule__ALSVariableDeclaration__Group__1 : rule__ALSVariableDeclaration__Group__1__Impl rule__ALSVariableDeclaration__Group__2 ;
    public final void rule__ALSVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7745:1: ( rule__ALSVariableDeclaration__Group__1__Impl rule__ALSVariableDeclaration__Group__2 )
            // InternalAlloyLanguage.g:7746:2: rule__ALSVariableDeclaration__Group__1__Impl rule__ALSVariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ALSVariableDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSVariableDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSVariableDeclaration__Group__1"


    // $ANTLR start "rule__ALSVariableDeclaration__Group__1__Impl"
    // InternalAlloyLanguage.g:7753:1: rule__ALSVariableDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__ALSVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7757:1: ( ( ':' ) )
            // InternalAlloyLanguage.g:7758:1: ( ':' )
            {
            // InternalAlloyLanguage.g:7758:1: ( ':' )
            // InternalAlloyLanguage.g:7759:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSVariableDeclarationAccess().getColonKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSVariableDeclarationAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSVariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ALSVariableDeclaration__Group__2"
    // InternalAlloyLanguage.g:7772:1: rule__ALSVariableDeclaration__Group__2 : rule__ALSVariableDeclaration__Group__2__Impl ;
    public final void rule__ALSVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7776:1: ( rule__ALSVariableDeclaration__Group__2__Impl )
            // InternalAlloyLanguage.g:7777:2: rule__ALSVariableDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSVariableDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSVariableDeclaration__Group__2"


    // $ANTLR start "rule__ALSVariableDeclaration__Group__2__Impl"
    // InternalAlloyLanguage.g:7783:1: rule__ALSVariableDeclaration__Group__2__Impl : ( ( rule__ALSVariableDeclaration__RangeAssignment_2 ) ) ;
    public final void rule__ALSVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7787:1: ( ( ( rule__ALSVariableDeclaration__RangeAssignment_2 ) ) )
            // InternalAlloyLanguage.g:7788:1: ( ( rule__ALSVariableDeclaration__RangeAssignment_2 ) )
            {
            // InternalAlloyLanguage.g:7788:1: ( ( rule__ALSVariableDeclaration__RangeAssignment_2 ) )
            // InternalAlloyLanguage.g:7789:1: ( rule__ALSVariableDeclaration__RangeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSVariableDeclarationAccess().getRangeAssignment_2()); 
            }
            // InternalAlloyLanguage.g:7790:1: ( rule__ALSVariableDeclaration__RangeAssignment_2 )
            // InternalAlloyLanguage.g:7790:2: rule__ALSVariableDeclaration__RangeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSVariableDeclaration__RangeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSVariableDeclarationAccess().getRangeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSVariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_0__0"
    // InternalAlloyLanguage.g:7806:1: rule__ALSBasicRelationTerm__Group_0__0 : rule__ALSBasicRelationTerm__Group_0__0__Impl rule__ALSBasicRelationTerm__Group_0__1 ;
    public final void rule__ALSBasicRelationTerm__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7810:1: ( rule__ALSBasicRelationTerm__Group_0__0__Impl rule__ALSBasicRelationTerm__Group_0__1 )
            // InternalAlloyLanguage.g:7811:2: rule__ALSBasicRelationTerm__Group_0__0__Impl rule__ALSBasicRelationTerm__Group_0__1
            {
            pushFollow(FOLLOW_54);
            rule__ALSBasicRelationTerm__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_0__0"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_0__0__Impl"
    // InternalAlloyLanguage.g:7818:1: rule__ALSBasicRelationTerm__Group_0__0__Impl : ( () ) ;
    public final void rule__ALSBasicRelationTerm__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7822:1: ( ( () ) )
            // InternalAlloyLanguage.g:7823:1: ( () )
            {
            // InternalAlloyLanguage.g:7823:1: ( () )
            // InternalAlloyLanguage.g:7824:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getALSNoneAction_0_0()); 
            }
            // InternalAlloyLanguage.g:7825:1: ()
            // InternalAlloyLanguage.g:7827:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getALSNoneAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_0__0__Impl"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_0__1"
    // InternalAlloyLanguage.g:7837:1: rule__ALSBasicRelationTerm__Group_0__1 : rule__ALSBasicRelationTerm__Group_0__1__Impl ;
    public final void rule__ALSBasicRelationTerm__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7841:1: ( rule__ALSBasicRelationTerm__Group_0__1__Impl )
            // InternalAlloyLanguage.g:7842:2: rule__ALSBasicRelationTerm__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_0__1"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_0__1__Impl"
    // InternalAlloyLanguage.g:7848:1: rule__ALSBasicRelationTerm__Group_0__1__Impl : ( 'none' ) ;
    public final void rule__ALSBasicRelationTerm__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7852:1: ( ( 'none' ) )
            // InternalAlloyLanguage.g:7853:1: ( 'none' )
            {
            // InternalAlloyLanguage.g:7853:1: ( 'none' )
            // InternalAlloyLanguage.g:7854:1: 'none'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getNoneKeyword_0_1()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getNoneKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_0__1__Impl"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_1__0"
    // InternalAlloyLanguage.g:7871:1: rule__ALSBasicRelationTerm__Group_1__0 : rule__ALSBasicRelationTerm__Group_1__0__Impl rule__ALSBasicRelationTerm__Group_1__1 ;
    public final void rule__ALSBasicRelationTerm__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7875:1: ( rule__ALSBasicRelationTerm__Group_1__0__Impl rule__ALSBasicRelationTerm__Group_1__1 )
            // InternalAlloyLanguage.g:7876:2: rule__ALSBasicRelationTerm__Group_1__0__Impl rule__ALSBasicRelationTerm__Group_1__1
            {
            pushFollow(FOLLOW_55);
            rule__ALSBasicRelationTerm__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_1__0"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_1__0__Impl"
    // InternalAlloyLanguage.g:7883:1: rule__ALSBasicRelationTerm__Group_1__0__Impl : ( () ) ;
    public final void rule__ALSBasicRelationTerm__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7887:1: ( ( () ) )
            // InternalAlloyLanguage.g:7888:1: ( () )
            {
            // InternalAlloyLanguage.g:7888:1: ( () )
            // InternalAlloyLanguage.g:7889:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getALSIdenAction_1_0()); 
            }
            // InternalAlloyLanguage.g:7890:1: ()
            // InternalAlloyLanguage.g:7892:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getALSIdenAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_1__0__Impl"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_1__1"
    // InternalAlloyLanguage.g:7902:1: rule__ALSBasicRelationTerm__Group_1__1 : rule__ALSBasicRelationTerm__Group_1__1__Impl ;
    public final void rule__ALSBasicRelationTerm__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7906:1: ( rule__ALSBasicRelationTerm__Group_1__1__Impl )
            // InternalAlloyLanguage.g:7907:2: rule__ALSBasicRelationTerm__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_1__1"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_1__1__Impl"
    // InternalAlloyLanguage.g:7913:1: rule__ALSBasicRelationTerm__Group_1__1__Impl : ( 'iden' ) ;
    public final void rule__ALSBasicRelationTerm__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7917:1: ( ( 'iden' ) )
            // InternalAlloyLanguage.g:7918:1: ( 'iden' )
            {
            // InternalAlloyLanguage.g:7918:1: ( 'iden' )
            // InternalAlloyLanguage.g:7919:1: 'iden'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getIdenKeyword_1_1()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getIdenKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_1__1__Impl"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_2__0"
    // InternalAlloyLanguage.g:7936:1: rule__ALSBasicRelationTerm__Group_2__0 : rule__ALSBasicRelationTerm__Group_2__0__Impl rule__ALSBasicRelationTerm__Group_2__1 ;
    public final void rule__ALSBasicRelationTerm__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7940:1: ( rule__ALSBasicRelationTerm__Group_2__0__Impl rule__ALSBasicRelationTerm__Group_2__1 )
            // InternalAlloyLanguage.g:7941:2: rule__ALSBasicRelationTerm__Group_2__0__Impl rule__ALSBasicRelationTerm__Group_2__1
            {
            pushFollow(FOLLOW_56);
            rule__ALSBasicRelationTerm__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_2__0"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_2__0__Impl"
    // InternalAlloyLanguage.g:7948:1: rule__ALSBasicRelationTerm__Group_2__0__Impl : ( () ) ;
    public final void rule__ALSBasicRelationTerm__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7952:1: ( ( () ) )
            // InternalAlloyLanguage.g:7953:1: ( () )
            {
            // InternalAlloyLanguage.g:7953:1: ( () )
            // InternalAlloyLanguage.g:7954:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getALSUnivAction_2_0()); 
            }
            // InternalAlloyLanguage.g:7955:1: ()
            // InternalAlloyLanguage.g:7957:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getALSUnivAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_2__0__Impl"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_2__1"
    // InternalAlloyLanguage.g:7967:1: rule__ALSBasicRelationTerm__Group_2__1 : rule__ALSBasicRelationTerm__Group_2__1__Impl ;
    public final void rule__ALSBasicRelationTerm__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7971:1: ( rule__ALSBasicRelationTerm__Group_2__1__Impl )
            // InternalAlloyLanguage.g:7972:2: rule__ALSBasicRelationTerm__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_2__1"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_2__1__Impl"
    // InternalAlloyLanguage.g:7978:1: rule__ALSBasicRelationTerm__Group_2__1__Impl : ( 'univ' ) ;
    public final void rule__ALSBasicRelationTerm__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:7982:1: ( ( 'univ' ) )
            // InternalAlloyLanguage.g:7983:1: ( 'univ' )
            {
            // InternalAlloyLanguage.g:7983:1: ( 'univ' )
            // InternalAlloyLanguage.g:7984:1: 'univ'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getUnivKeyword_2_1()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getUnivKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_2__1__Impl"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_3__0"
    // InternalAlloyLanguage.g:8001:1: rule__ALSBasicRelationTerm__Group_3__0 : rule__ALSBasicRelationTerm__Group_3__0__Impl rule__ALSBasicRelationTerm__Group_3__1 ;
    public final void rule__ALSBasicRelationTerm__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8005:1: ( rule__ALSBasicRelationTerm__Group_3__0__Impl rule__ALSBasicRelationTerm__Group_3__1 )
            // InternalAlloyLanguage.g:8006:2: rule__ALSBasicRelationTerm__Group_3__0__Impl rule__ALSBasicRelationTerm__Group_3__1
            {
            pushFollow(FOLLOW_57);
            rule__ALSBasicRelationTerm__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_3__0"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_3__0__Impl"
    // InternalAlloyLanguage.g:8013:1: rule__ALSBasicRelationTerm__Group_3__0__Impl : ( () ) ;
    public final void rule__ALSBasicRelationTerm__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8017:1: ( ( () ) )
            // InternalAlloyLanguage.g:8018:1: ( () )
            {
            // InternalAlloyLanguage.g:8018:1: ( () )
            // InternalAlloyLanguage.g:8019:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getALSIntAction_3_0()); 
            }
            // InternalAlloyLanguage.g:8020:1: ()
            // InternalAlloyLanguage.g:8022:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getALSIntAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_3__0__Impl"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_3__1"
    // InternalAlloyLanguage.g:8032:1: rule__ALSBasicRelationTerm__Group_3__1 : rule__ALSBasicRelationTerm__Group_3__1__Impl ;
    public final void rule__ALSBasicRelationTerm__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8036:1: ( rule__ALSBasicRelationTerm__Group_3__1__Impl )
            // InternalAlloyLanguage.g:8037:2: rule__ALSBasicRelationTerm__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_3__1"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_3__1__Impl"
    // InternalAlloyLanguage.g:8043:1: rule__ALSBasicRelationTerm__Group_3__1__Impl : ( 'Int' ) ;
    public final void rule__ALSBasicRelationTerm__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8047:1: ( ( 'Int' ) )
            // InternalAlloyLanguage.g:8048:1: ( 'Int' )
            {
            // InternalAlloyLanguage.g:8048:1: ( 'Int' )
            // InternalAlloyLanguage.g:8049:1: 'Int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getIntKeyword_3_1()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getIntKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_3__1__Impl"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_4__0"
    // InternalAlloyLanguage.g:8066:1: rule__ALSBasicRelationTerm__Group_4__0 : rule__ALSBasicRelationTerm__Group_4__0__Impl rule__ALSBasicRelationTerm__Group_4__1 ;
    public final void rule__ALSBasicRelationTerm__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8070:1: ( rule__ALSBasicRelationTerm__Group_4__0__Impl rule__ALSBasicRelationTerm__Group_4__1 )
            // InternalAlloyLanguage.g:8071:2: rule__ALSBasicRelationTerm__Group_4__0__Impl rule__ALSBasicRelationTerm__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ALSBasicRelationTerm__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_4__0"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_4__0__Impl"
    // InternalAlloyLanguage.g:8078:1: rule__ALSBasicRelationTerm__Group_4__0__Impl : ( () ) ;
    public final void rule__ALSBasicRelationTerm__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8082:1: ( ( () ) )
            // InternalAlloyLanguage.g:8083:1: ( () )
            {
            // InternalAlloyLanguage.g:8083:1: ( () )
            // InternalAlloyLanguage.g:8084:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getALSReferenceAction_4_0()); 
            }
            // InternalAlloyLanguage.g:8085:1: ()
            // InternalAlloyLanguage.g:8087:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getALSReferenceAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_4__0__Impl"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_4__1"
    // InternalAlloyLanguage.g:8097:1: rule__ALSBasicRelationTerm__Group_4__1 : rule__ALSBasicRelationTerm__Group_4__1__Impl ;
    public final void rule__ALSBasicRelationTerm__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8101:1: ( rule__ALSBasicRelationTerm__Group_4__1__Impl )
            // InternalAlloyLanguage.g:8102:2: rule__ALSBasicRelationTerm__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_4__1"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_4__1__Impl"
    // InternalAlloyLanguage.g:8108:1: rule__ALSBasicRelationTerm__Group_4__1__Impl : ( ( rule__ALSBasicRelationTerm__ReferredAssignment_4_1 ) ) ;
    public final void rule__ALSBasicRelationTerm__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8112:1: ( ( ( rule__ALSBasicRelationTerm__ReferredAssignment_4_1 ) ) )
            // InternalAlloyLanguage.g:8113:1: ( ( rule__ALSBasicRelationTerm__ReferredAssignment_4_1 ) )
            {
            // InternalAlloyLanguage.g:8113:1: ( ( rule__ALSBasicRelationTerm__ReferredAssignment_4_1 ) )
            // InternalAlloyLanguage.g:8114:1: ( rule__ALSBasicRelationTerm__ReferredAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getReferredAssignment_4_1()); 
            }
            // InternalAlloyLanguage.g:8115:1: ( rule__ALSBasicRelationTerm__ReferredAssignment_4_1 )
            // InternalAlloyLanguage.g:8115:2: rule__ALSBasicRelationTerm__ReferredAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__ReferredAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getReferredAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_4__1__Impl"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_5__0"
    // InternalAlloyLanguage.g:8129:1: rule__ALSBasicRelationTerm__Group_5__0 : rule__ALSBasicRelationTerm__Group_5__0__Impl rule__ALSBasicRelationTerm__Group_5__1 ;
    public final void rule__ALSBasicRelationTerm__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8133:1: ( rule__ALSBasicRelationTerm__Group_5__0__Impl rule__ALSBasicRelationTerm__Group_5__1 )
            // InternalAlloyLanguage.g:8134:2: rule__ALSBasicRelationTerm__Group_5__0__Impl rule__ALSBasicRelationTerm__Group_5__1
            {
            pushFollow(FOLLOW_58);
            rule__ALSBasicRelationTerm__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_5__0"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_5__0__Impl"
    // InternalAlloyLanguage.g:8141:1: rule__ALSBasicRelationTerm__Group_5__0__Impl : ( () ) ;
    public final void rule__ALSBasicRelationTerm__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8145:1: ( ( () ) )
            // InternalAlloyLanguage.g:8146:1: ( () )
            {
            // InternalAlloyLanguage.g:8146:1: ( () )
            // InternalAlloyLanguage.g:8147:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getALSNumberLiteralAction_5_0()); 
            }
            // InternalAlloyLanguage.g:8148:1: ()
            // InternalAlloyLanguage.g:8150:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getALSNumberLiteralAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_5__0__Impl"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_5__1"
    // InternalAlloyLanguage.g:8160:1: rule__ALSBasicRelationTerm__Group_5__1 : rule__ALSBasicRelationTerm__Group_5__1__Impl ;
    public final void rule__ALSBasicRelationTerm__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8164:1: ( rule__ALSBasicRelationTerm__Group_5__1__Impl )
            // InternalAlloyLanguage.g:8165:2: rule__ALSBasicRelationTerm__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_5__1"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_5__1__Impl"
    // InternalAlloyLanguage.g:8171:1: rule__ALSBasicRelationTerm__Group_5__1__Impl : ( ( rule__ALSBasicRelationTerm__ValueAssignment_5_1 ) ) ;
    public final void rule__ALSBasicRelationTerm__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8175:1: ( ( ( rule__ALSBasicRelationTerm__ValueAssignment_5_1 ) ) )
            // InternalAlloyLanguage.g:8176:1: ( ( rule__ALSBasicRelationTerm__ValueAssignment_5_1 ) )
            {
            // InternalAlloyLanguage.g:8176:1: ( ( rule__ALSBasicRelationTerm__ValueAssignment_5_1 ) )
            // InternalAlloyLanguage.g:8177:1: ( rule__ALSBasicRelationTerm__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getValueAssignment_5_1()); 
            }
            // InternalAlloyLanguage.g:8178:1: ( rule__ALSBasicRelationTerm__ValueAssignment_5_1 )
            // InternalAlloyLanguage.g:8178:2: rule__ALSBasicRelationTerm__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__ValueAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getValueAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_5__1__Impl"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_6__0"
    // InternalAlloyLanguage.g:8192:1: rule__ALSBasicRelationTerm__Group_6__0 : rule__ALSBasicRelationTerm__Group_6__0__Impl rule__ALSBasicRelationTerm__Group_6__1 ;
    public final void rule__ALSBasicRelationTerm__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8196:1: ( rule__ALSBasicRelationTerm__Group_6__0__Impl rule__ALSBasicRelationTerm__Group_6__1 )
            // InternalAlloyLanguage.g:8197:2: rule__ALSBasicRelationTerm__Group_6__0__Impl rule__ALSBasicRelationTerm__Group_6__1
            {
            pushFollow(FOLLOW_16);
            rule__ALSBasicRelationTerm__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_6__0"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_6__0__Impl"
    // InternalAlloyLanguage.g:8204:1: rule__ALSBasicRelationTerm__Group_6__0__Impl : ( '(' ) ;
    public final void rule__ALSBasicRelationTerm__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8208:1: ( ( '(' ) )
            // InternalAlloyLanguage.g:8209:1: ( '(' )
            {
            // InternalAlloyLanguage.g:8209:1: ( '(' )
            // InternalAlloyLanguage.g:8210:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getLeftParenthesisKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_6__0__Impl"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_6__1"
    // InternalAlloyLanguage.g:8223:1: rule__ALSBasicRelationTerm__Group_6__1 : rule__ALSBasicRelationTerm__Group_6__1__Impl rule__ALSBasicRelationTerm__Group_6__2 ;
    public final void rule__ALSBasicRelationTerm__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8227:1: ( rule__ALSBasicRelationTerm__Group_6__1__Impl rule__ALSBasicRelationTerm__Group_6__2 )
            // InternalAlloyLanguage.g:8228:2: rule__ALSBasicRelationTerm__Group_6__1__Impl rule__ALSBasicRelationTerm__Group_6__2
            {
            pushFollow(FOLLOW_59);
            rule__ALSBasicRelationTerm__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_6__1"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_6__1__Impl"
    // InternalAlloyLanguage.g:8235:1: rule__ALSBasicRelationTerm__Group_6__1__Impl : ( ruleALSTerm ) ;
    public final void rule__ALSBasicRelationTerm__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8239:1: ( ( ruleALSTerm ) )
            // InternalAlloyLanguage.g:8240:1: ( ruleALSTerm )
            {
            // InternalAlloyLanguage.g:8240:1: ( ruleALSTerm )
            // InternalAlloyLanguage.g:8241:1: ruleALSTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getALSTermParserRuleCall_6_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getALSTermParserRuleCall_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_6__1__Impl"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_6__2"
    // InternalAlloyLanguage.g:8252:1: rule__ALSBasicRelationTerm__Group_6__2 : rule__ALSBasicRelationTerm__Group_6__2__Impl ;
    public final void rule__ALSBasicRelationTerm__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8256:1: ( rule__ALSBasicRelationTerm__Group_6__2__Impl )
            // InternalAlloyLanguage.g:8257:2: rule__ALSBasicRelationTerm__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSBasicRelationTerm__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_6__2"


    // $ANTLR start "rule__ALSBasicRelationTerm__Group_6__2__Impl"
    // InternalAlloyLanguage.g:8263:1: rule__ALSBasicRelationTerm__Group_6__2__Impl : ( ')' ) ;
    public final void rule__ALSBasicRelationTerm__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8267:1: ( ( ')' ) )
            // InternalAlloyLanguage.g:8268:1: ( ')' )
            {
            // InternalAlloyLanguage.g:8268:1: ( ')' )
            // InternalAlloyLanguage.g:8269:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,70,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getRightParenthesisKeyword_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__Group_6__2__Impl"


    // $ANTLR start "rule__ALSRunCommand__Group__0"
    // InternalAlloyLanguage.g:8288:1: rule__ALSRunCommand__Group__0 : rule__ALSRunCommand__Group__0__Impl rule__ALSRunCommand__Group__1 ;
    public final void rule__ALSRunCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8292:1: ( rule__ALSRunCommand__Group__0__Impl rule__ALSRunCommand__Group__1 )
            // InternalAlloyLanguage.g:8293:2: rule__ALSRunCommand__Group__0__Impl rule__ALSRunCommand__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ALSRunCommand__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRunCommand__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group__0"


    // $ANTLR start "rule__ALSRunCommand__Group__0__Impl"
    // InternalAlloyLanguage.g:8300:1: rule__ALSRunCommand__Group__0__Impl : ( () ) ;
    public final void rule__ALSRunCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8304:1: ( ( () ) )
            // InternalAlloyLanguage.g:8305:1: ( () )
            {
            // InternalAlloyLanguage.g:8305:1: ( () )
            // InternalAlloyLanguage.g:8306:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRunCommandAccess().getALSRunCommandAction_0()); 
            }
            // InternalAlloyLanguage.g:8307:1: ()
            // InternalAlloyLanguage.g:8309:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRunCommandAccess().getALSRunCommandAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group__0__Impl"


    // $ANTLR start "rule__ALSRunCommand__Group__1"
    // InternalAlloyLanguage.g:8319:1: rule__ALSRunCommand__Group__1 : rule__ALSRunCommand__Group__1__Impl rule__ALSRunCommand__Group__2 ;
    public final void rule__ALSRunCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8323:1: ( rule__ALSRunCommand__Group__1__Impl rule__ALSRunCommand__Group__2 )
            // InternalAlloyLanguage.g:8324:2: rule__ALSRunCommand__Group__1__Impl rule__ALSRunCommand__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ALSRunCommand__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRunCommand__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group__1"


    // $ANTLR start "rule__ALSRunCommand__Group__1__Impl"
    // InternalAlloyLanguage.g:8331:1: rule__ALSRunCommand__Group__1__Impl : ( 'run' ) ;
    public final void rule__ALSRunCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8335:1: ( ( 'run' ) )
            // InternalAlloyLanguage.g:8336:1: ( 'run' )
            {
            // InternalAlloyLanguage.g:8336:1: ( 'run' )
            // InternalAlloyLanguage.g:8337:1: 'run'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRunCommandAccess().getRunKeyword_1()); 
            }
            match(input,71,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRunCommandAccess().getRunKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group__1__Impl"


    // $ANTLR start "rule__ALSRunCommand__Group__2"
    // InternalAlloyLanguage.g:8350:1: rule__ALSRunCommand__Group__2 : rule__ALSRunCommand__Group__2__Impl rule__ALSRunCommand__Group__3 ;
    public final void rule__ALSRunCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8354:1: ( rule__ALSRunCommand__Group__2__Impl rule__ALSRunCommand__Group__3 )
            // InternalAlloyLanguage.g:8355:2: rule__ALSRunCommand__Group__2__Impl rule__ALSRunCommand__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ALSRunCommand__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRunCommand__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group__2"


    // $ANTLR start "rule__ALSRunCommand__Group__2__Impl"
    // InternalAlloyLanguage.g:8362:1: rule__ALSRunCommand__Group__2__Impl : ( '{' ) ;
    public final void rule__ALSRunCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8366:1: ( ( '{' ) )
            // InternalAlloyLanguage.g:8367:1: ( '{' )
            {
            // InternalAlloyLanguage.g:8367:1: ( '{' )
            // InternalAlloyLanguage.g:8368:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRunCommandAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRunCommandAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group__2__Impl"


    // $ANTLR start "rule__ALSRunCommand__Group__3"
    // InternalAlloyLanguage.g:8381:1: rule__ALSRunCommand__Group__3 : rule__ALSRunCommand__Group__3__Impl rule__ALSRunCommand__Group__4 ;
    public final void rule__ALSRunCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8385:1: ( rule__ALSRunCommand__Group__3__Impl rule__ALSRunCommand__Group__4 )
            // InternalAlloyLanguage.g:8386:2: rule__ALSRunCommand__Group__3__Impl rule__ALSRunCommand__Group__4
            {
            pushFollow(FOLLOW_60);
            rule__ALSRunCommand__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRunCommand__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group__3"


    // $ANTLR start "rule__ALSRunCommand__Group__3__Impl"
    // InternalAlloyLanguage.g:8393:1: rule__ALSRunCommand__Group__3__Impl : ( '}' ) ;
    public final void rule__ALSRunCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8397:1: ( ( '}' ) )
            // InternalAlloyLanguage.g:8398:1: ( '}' )
            {
            // InternalAlloyLanguage.g:8398:1: ( '}' )
            // InternalAlloyLanguage.g:8399:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRunCommandAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRunCommandAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group__3__Impl"


    // $ANTLR start "rule__ALSRunCommand__Group__4"
    // InternalAlloyLanguage.g:8412:1: rule__ALSRunCommand__Group__4 : rule__ALSRunCommand__Group__4__Impl ;
    public final void rule__ALSRunCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8416:1: ( rule__ALSRunCommand__Group__4__Impl )
            // InternalAlloyLanguage.g:8417:2: rule__ALSRunCommand__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSRunCommand__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group__4"


    // $ANTLR start "rule__ALSRunCommand__Group__4__Impl"
    // InternalAlloyLanguage.g:8423:1: rule__ALSRunCommand__Group__4__Impl : ( ( rule__ALSRunCommand__Group_4__0 )? ) ;
    public final void rule__ALSRunCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8427:1: ( ( ( rule__ALSRunCommand__Group_4__0 )? ) )
            // InternalAlloyLanguage.g:8428:1: ( ( rule__ALSRunCommand__Group_4__0 )? )
            {
            // InternalAlloyLanguage.g:8428:1: ( ( rule__ALSRunCommand__Group_4__0 )? )
            // InternalAlloyLanguage.g:8429:1: ( rule__ALSRunCommand__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRunCommandAccess().getGroup_4()); 
            }
            // InternalAlloyLanguage.g:8430:1: ( rule__ALSRunCommand__Group_4__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==72) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAlloyLanguage.g:8430:2: rule__ALSRunCommand__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSRunCommand__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRunCommandAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group__4__Impl"


    // $ANTLR start "rule__ALSRunCommand__Group_4__0"
    // InternalAlloyLanguage.g:8450:1: rule__ALSRunCommand__Group_4__0 : rule__ALSRunCommand__Group_4__0__Impl rule__ALSRunCommand__Group_4__1 ;
    public final void rule__ALSRunCommand__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8454:1: ( rule__ALSRunCommand__Group_4__0__Impl rule__ALSRunCommand__Group_4__1 )
            // InternalAlloyLanguage.g:8455:2: rule__ALSRunCommand__Group_4__0__Impl rule__ALSRunCommand__Group_4__1
            {
            pushFollow(FOLLOW_61);
            rule__ALSRunCommand__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRunCommand__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group_4__0"


    // $ANTLR start "rule__ALSRunCommand__Group_4__0__Impl"
    // InternalAlloyLanguage.g:8462:1: rule__ALSRunCommand__Group_4__0__Impl : ( 'for' ) ;
    public final void rule__ALSRunCommand__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8466:1: ( ( 'for' ) )
            // InternalAlloyLanguage.g:8467:1: ( 'for' )
            {
            // InternalAlloyLanguage.g:8467:1: ( 'for' )
            // InternalAlloyLanguage.g:8468:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRunCommandAccess().getForKeyword_4_0()); 
            }
            match(input,72,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRunCommandAccess().getForKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group_4__0__Impl"


    // $ANTLR start "rule__ALSRunCommand__Group_4__1"
    // InternalAlloyLanguage.g:8481:1: rule__ALSRunCommand__Group_4__1 : rule__ALSRunCommand__Group_4__1__Impl rule__ALSRunCommand__Group_4__2 ;
    public final void rule__ALSRunCommand__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8485:1: ( rule__ALSRunCommand__Group_4__1__Impl rule__ALSRunCommand__Group_4__2 )
            // InternalAlloyLanguage.g:8486:2: rule__ALSRunCommand__Group_4__1__Impl rule__ALSRunCommand__Group_4__2
            {
            pushFollow(FOLLOW_14);
            rule__ALSRunCommand__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRunCommand__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group_4__1"


    // $ANTLR start "rule__ALSRunCommand__Group_4__1__Impl"
    // InternalAlloyLanguage.g:8493:1: rule__ALSRunCommand__Group_4__1__Impl : ( ( rule__ALSRunCommand__TypeScopesAssignment_4_1 ) ) ;
    public final void rule__ALSRunCommand__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8497:1: ( ( ( rule__ALSRunCommand__TypeScopesAssignment_4_1 ) ) )
            // InternalAlloyLanguage.g:8498:1: ( ( rule__ALSRunCommand__TypeScopesAssignment_4_1 ) )
            {
            // InternalAlloyLanguage.g:8498:1: ( ( rule__ALSRunCommand__TypeScopesAssignment_4_1 ) )
            // InternalAlloyLanguage.g:8499:1: ( rule__ALSRunCommand__TypeScopesAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRunCommandAccess().getTypeScopesAssignment_4_1()); 
            }
            // InternalAlloyLanguage.g:8500:1: ( rule__ALSRunCommand__TypeScopesAssignment_4_1 )
            // InternalAlloyLanguage.g:8500:2: rule__ALSRunCommand__TypeScopesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSRunCommand__TypeScopesAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRunCommandAccess().getTypeScopesAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group_4__1__Impl"


    // $ANTLR start "rule__ALSRunCommand__Group_4__2"
    // InternalAlloyLanguage.g:8510:1: rule__ALSRunCommand__Group_4__2 : rule__ALSRunCommand__Group_4__2__Impl ;
    public final void rule__ALSRunCommand__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8514:1: ( rule__ALSRunCommand__Group_4__2__Impl )
            // InternalAlloyLanguage.g:8515:2: rule__ALSRunCommand__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSRunCommand__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group_4__2"


    // $ANTLR start "rule__ALSRunCommand__Group_4__2__Impl"
    // InternalAlloyLanguage.g:8521:1: rule__ALSRunCommand__Group_4__2__Impl : ( ( rule__ALSRunCommand__Group_4_2__0 )* ) ;
    public final void rule__ALSRunCommand__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8525:1: ( ( ( rule__ALSRunCommand__Group_4_2__0 )* ) )
            // InternalAlloyLanguage.g:8526:1: ( ( rule__ALSRunCommand__Group_4_2__0 )* )
            {
            // InternalAlloyLanguage.g:8526:1: ( ( rule__ALSRunCommand__Group_4_2__0 )* )
            // InternalAlloyLanguage.g:8527:1: ( rule__ALSRunCommand__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRunCommandAccess().getGroup_4_2()); 
            }
            // InternalAlloyLanguage.g:8528:1: ( rule__ALSRunCommand__Group_4_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==35) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalAlloyLanguage.g:8528:2: rule__ALSRunCommand__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ALSRunCommand__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRunCommandAccess().getGroup_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group_4__2__Impl"


    // $ANTLR start "rule__ALSRunCommand__Group_4_2__0"
    // InternalAlloyLanguage.g:8544:1: rule__ALSRunCommand__Group_4_2__0 : rule__ALSRunCommand__Group_4_2__0__Impl rule__ALSRunCommand__Group_4_2__1 ;
    public final void rule__ALSRunCommand__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8548:1: ( rule__ALSRunCommand__Group_4_2__0__Impl rule__ALSRunCommand__Group_4_2__1 )
            // InternalAlloyLanguage.g:8549:2: rule__ALSRunCommand__Group_4_2__0__Impl rule__ALSRunCommand__Group_4_2__1
            {
            pushFollow(FOLLOW_61);
            rule__ALSRunCommand__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSRunCommand__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group_4_2__0"


    // $ANTLR start "rule__ALSRunCommand__Group_4_2__0__Impl"
    // InternalAlloyLanguage.g:8556:1: rule__ALSRunCommand__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__ALSRunCommand__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8560:1: ( ( ',' ) )
            // InternalAlloyLanguage.g:8561:1: ( ',' )
            {
            // InternalAlloyLanguage.g:8561:1: ( ',' )
            // InternalAlloyLanguage.g:8562:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRunCommandAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRunCommandAccess().getCommaKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group_4_2__0__Impl"


    // $ANTLR start "rule__ALSRunCommand__Group_4_2__1"
    // InternalAlloyLanguage.g:8575:1: rule__ALSRunCommand__Group_4_2__1 : rule__ALSRunCommand__Group_4_2__1__Impl ;
    public final void rule__ALSRunCommand__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8579:1: ( rule__ALSRunCommand__Group_4_2__1__Impl )
            // InternalAlloyLanguage.g:8580:2: rule__ALSRunCommand__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSRunCommand__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group_4_2__1"


    // $ANTLR start "rule__ALSRunCommand__Group_4_2__1__Impl"
    // InternalAlloyLanguage.g:8586:1: rule__ALSRunCommand__Group_4_2__1__Impl : ( ( rule__ALSRunCommand__TypeScopesAssignment_4_2_1 ) ) ;
    public final void rule__ALSRunCommand__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8590:1: ( ( ( rule__ALSRunCommand__TypeScopesAssignment_4_2_1 ) ) )
            // InternalAlloyLanguage.g:8591:1: ( ( rule__ALSRunCommand__TypeScopesAssignment_4_2_1 ) )
            {
            // InternalAlloyLanguage.g:8591:1: ( ( rule__ALSRunCommand__TypeScopesAssignment_4_2_1 ) )
            // InternalAlloyLanguage.g:8592:1: ( rule__ALSRunCommand__TypeScopesAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRunCommandAccess().getTypeScopesAssignment_4_2_1()); 
            }
            // InternalAlloyLanguage.g:8593:1: ( rule__ALSRunCommand__TypeScopesAssignment_4_2_1 )
            // InternalAlloyLanguage.g:8593:2: rule__ALSRunCommand__TypeScopesAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSRunCommand__TypeScopesAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRunCommandAccess().getTypeScopesAssignment_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__Group_4_2__1__Impl"


    // $ANTLR start "rule__ALSSigScope__Group__0"
    // InternalAlloyLanguage.g:8607:1: rule__ALSSigScope__Group__0 : rule__ALSSigScope__Group__0__Impl rule__ALSSigScope__Group__1 ;
    public final void rule__ALSSigScope__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8611:1: ( rule__ALSSigScope__Group__0__Impl rule__ALSSigScope__Group__1 )
            // InternalAlloyLanguage.g:8612:2: rule__ALSSigScope__Group__0__Impl rule__ALSSigScope__Group__1
            {
            pushFollow(FOLLOW_61);
            rule__ALSSigScope__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSSigScope__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSigScope__Group__0"


    // $ANTLR start "rule__ALSSigScope__Group__0__Impl"
    // InternalAlloyLanguage.g:8619:1: rule__ALSSigScope__Group__0__Impl : ( ( rule__ALSSigScope__ExactlyAssignment_0 )? ) ;
    public final void rule__ALSSigScope__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8623:1: ( ( ( rule__ALSSigScope__ExactlyAssignment_0 )? ) )
            // InternalAlloyLanguage.g:8624:1: ( ( rule__ALSSigScope__ExactlyAssignment_0 )? )
            {
            // InternalAlloyLanguage.g:8624:1: ( ( rule__ALSSigScope__ExactlyAssignment_0 )? )
            // InternalAlloyLanguage.g:8625:1: ( rule__ALSSigScope__ExactlyAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSigScopeAccess().getExactlyAssignment_0()); 
            }
            // InternalAlloyLanguage.g:8626:1: ( rule__ALSSigScope__ExactlyAssignment_0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==75) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAlloyLanguage.g:8626:2: rule__ALSSigScope__ExactlyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSSigScope__ExactlyAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSigScopeAccess().getExactlyAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSigScope__Group__0__Impl"


    // $ANTLR start "rule__ALSSigScope__Group__1"
    // InternalAlloyLanguage.g:8636:1: rule__ALSSigScope__Group__1 : rule__ALSSigScope__Group__1__Impl rule__ALSSigScope__Group__2 ;
    public final void rule__ALSSigScope__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8640:1: ( rule__ALSSigScope__Group__1__Impl rule__ALSSigScope__Group__2 )
            // InternalAlloyLanguage.g:8641:2: rule__ALSSigScope__Group__1__Impl rule__ALSSigScope__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ALSSigScope__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSSigScope__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSigScope__Group__1"


    // $ANTLR start "rule__ALSSigScope__Group__1__Impl"
    // InternalAlloyLanguage.g:8648:1: rule__ALSSigScope__Group__1__Impl : ( ( rule__ALSSigScope__NumberAssignment_1 ) ) ;
    public final void rule__ALSSigScope__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8652:1: ( ( ( rule__ALSSigScope__NumberAssignment_1 ) ) )
            // InternalAlloyLanguage.g:8653:1: ( ( rule__ALSSigScope__NumberAssignment_1 ) )
            {
            // InternalAlloyLanguage.g:8653:1: ( ( rule__ALSSigScope__NumberAssignment_1 ) )
            // InternalAlloyLanguage.g:8654:1: ( rule__ALSSigScope__NumberAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSigScopeAccess().getNumberAssignment_1()); 
            }
            // InternalAlloyLanguage.g:8655:1: ( rule__ALSSigScope__NumberAssignment_1 )
            // InternalAlloyLanguage.g:8655:2: rule__ALSSigScope__NumberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ALSSigScope__NumberAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSigScopeAccess().getNumberAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSigScope__Group__1__Impl"


    // $ANTLR start "rule__ALSSigScope__Group__2"
    // InternalAlloyLanguage.g:8665:1: rule__ALSSigScope__Group__2 : rule__ALSSigScope__Group__2__Impl ;
    public final void rule__ALSSigScope__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8669:1: ( rule__ALSSigScope__Group__2__Impl )
            // InternalAlloyLanguage.g:8670:2: rule__ALSSigScope__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSSigScope__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSigScope__Group__2"


    // $ANTLR start "rule__ALSSigScope__Group__2__Impl"
    // InternalAlloyLanguage.g:8676:1: rule__ALSSigScope__Group__2__Impl : ( ( rule__ALSSigScope__TypeAssignment_2 ) ) ;
    public final void rule__ALSSigScope__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8680:1: ( ( ( rule__ALSSigScope__TypeAssignment_2 ) ) )
            // InternalAlloyLanguage.g:8681:1: ( ( rule__ALSSigScope__TypeAssignment_2 ) )
            {
            // InternalAlloyLanguage.g:8681:1: ( ( rule__ALSSigScope__TypeAssignment_2 ) )
            // InternalAlloyLanguage.g:8682:1: ( rule__ALSSigScope__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSigScopeAccess().getTypeAssignment_2()); 
            }
            // InternalAlloyLanguage.g:8683:1: ( rule__ALSSigScope__TypeAssignment_2 )
            // InternalAlloyLanguage.g:8683:2: rule__ALSSigScope__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ALSSigScope__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSigScopeAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSigScope__Group__2__Impl"


    // $ANTLR start "rule__ALSIntScope__Group__0"
    // InternalAlloyLanguage.g:8699:1: rule__ALSIntScope__Group__0 : rule__ALSIntScope__Group__0__Impl rule__ALSIntScope__Group__1 ;
    public final void rule__ALSIntScope__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8703:1: ( rule__ALSIntScope__Group__0__Impl rule__ALSIntScope__Group__1 )
            // InternalAlloyLanguage.g:8704:2: rule__ALSIntScope__Group__0__Impl rule__ALSIntScope__Group__1
            {
            pushFollow(FOLLOW_57);
            rule__ALSIntScope__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ALSIntScope__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIntScope__Group__0"


    // $ANTLR start "rule__ALSIntScope__Group__0__Impl"
    // InternalAlloyLanguage.g:8711:1: rule__ALSIntScope__Group__0__Impl : ( ( rule__ALSIntScope__NumberAssignment_0 ) ) ;
    public final void rule__ALSIntScope__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8715:1: ( ( ( rule__ALSIntScope__NumberAssignment_0 ) ) )
            // InternalAlloyLanguage.g:8716:1: ( ( rule__ALSIntScope__NumberAssignment_0 ) )
            {
            // InternalAlloyLanguage.g:8716:1: ( ( rule__ALSIntScope__NumberAssignment_0 ) )
            // InternalAlloyLanguage.g:8717:1: ( rule__ALSIntScope__NumberAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIntScopeAccess().getNumberAssignment_0()); 
            }
            // InternalAlloyLanguage.g:8718:1: ( rule__ALSIntScope__NumberAssignment_0 )
            // InternalAlloyLanguage.g:8718:2: rule__ALSIntScope__NumberAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ALSIntScope__NumberAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIntScopeAccess().getNumberAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIntScope__Group__0__Impl"


    // $ANTLR start "rule__ALSIntScope__Group__1"
    // InternalAlloyLanguage.g:8728:1: rule__ALSIntScope__Group__1 : rule__ALSIntScope__Group__1__Impl ;
    public final void rule__ALSIntScope__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8732:1: ( rule__ALSIntScope__Group__1__Impl )
            // InternalAlloyLanguage.g:8733:2: rule__ALSIntScope__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSIntScope__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIntScope__Group__1"


    // $ANTLR start "rule__ALSIntScope__Group__1__Impl"
    // InternalAlloyLanguage.g:8739:1: rule__ALSIntScope__Group__1__Impl : ( 'Int' ) ;
    public final void rule__ALSIntScope__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8743:1: ( ( 'Int' ) )
            // InternalAlloyLanguage.g:8744:1: ( 'Int' )
            {
            // InternalAlloyLanguage.g:8744:1: ( 'Int' )
            // InternalAlloyLanguage.g:8745:1: 'Int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIntScopeAccess().getIntKeyword_1()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIntScopeAccess().getIntKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIntScope__Group__1__Impl"


    // $ANTLR start "rule__ALSSignatureBody__UnorderedGroup_0"
    // InternalAlloyLanguage.g:8763:1: rule__ALSSignatureBody__UnorderedGroup_0 : ( rule__ALSSignatureBody__UnorderedGroup_0__0 )? ;
    public final void rule__ALSSignatureBody__UnorderedGroup_0() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0());
            
        try {
            // InternalAlloyLanguage.g:8768:1: ( ( rule__ALSSignatureBody__UnorderedGroup_0__0 )? )
            // InternalAlloyLanguage.g:8769:2: ( rule__ALSSignatureBody__UnorderedGroup_0__0 )?
            {
            // InternalAlloyLanguage.g:8769:2: ( rule__ALSSignatureBody__UnorderedGroup_0__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 1) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAlloyLanguage.g:0:0: rule__ALSSignatureBody__UnorderedGroup_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSSignatureBody__UnorderedGroup_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__UnorderedGroup_0"


    // $ANTLR start "rule__ALSSignatureBody__UnorderedGroup_0__Impl"
    // InternalAlloyLanguage.g:8779:1: rule__ALSSignatureBody__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__ALSSignatureBody__AbstractAssignment_0_1 ) ) ) ) ) ;
    public final void rule__ALSSignatureBody__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // InternalAlloyLanguage.g:8784:1: ( ( ({...}? => ( ( ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__ALSSignatureBody__AbstractAssignment_0_1 ) ) ) ) ) )
            // InternalAlloyLanguage.g:8785:3: ( ({...}? => ( ( ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__ALSSignatureBody__AbstractAssignment_0_1 ) ) ) ) )
            {
            // InternalAlloyLanguage.g:8785:3: ( ({...}? => ( ( ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__ALSSignatureBody__AbstractAssignment_0_1 ) ) ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( LA52_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 1) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalAlloyLanguage.g:8787:4: ({...}? => ( ( ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 ) ) ) )
                    {
                    // InternalAlloyLanguage.g:8787:4: ({...}? => ( ( ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 ) ) ) )
                    // InternalAlloyLanguage.g:8788:5: {...}? => ( ( ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ALSSignatureBody__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0)");
                    }
                    // InternalAlloyLanguage.g:8788:113: ( ( ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 ) ) )
                    // InternalAlloyLanguage.g:8789:6: ( ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0);
                    selected = true;
                    // InternalAlloyLanguage.g:8795:6: ( ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 ) )
                    // InternalAlloyLanguage.g:8797:7: ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSSignatureBodyAccess().getMultiplicityAssignment_0_0()); 
                    }
                    // InternalAlloyLanguage.g:8798:7: ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 )
                    // InternalAlloyLanguage.g:8798:8: rule__ALSSignatureBody__MultiplicityAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSSignatureBody__MultiplicityAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSSignatureBodyAccess().getMultiplicityAssignment_0_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:8804:4: ({...}? => ( ( ( rule__ALSSignatureBody__AbstractAssignment_0_1 ) ) ) )
                    {
                    // InternalAlloyLanguage.g:8804:4: ({...}? => ( ( ( rule__ALSSignatureBody__AbstractAssignment_0_1 ) ) ) )
                    // InternalAlloyLanguage.g:8805:5: {...}? => ( ( ( rule__ALSSignatureBody__AbstractAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ALSSignatureBody__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 1)");
                    }
                    // InternalAlloyLanguage.g:8805:113: ( ( ( rule__ALSSignatureBody__AbstractAssignment_0_1 ) ) )
                    // InternalAlloyLanguage.g:8806:6: ( ( rule__ALSSignatureBody__AbstractAssignment_0_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 1);
                    selected = true;
                    // InternalAlloyLanguage.g:8812:6: ( ( rule__ALSSignatureBody__AbstractAssignment_0_1 ) )
                    // InternalAlloyLanguage.g:8814:7: ( rule__ALSSignatureBody__AbstractAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getALSSignatureBodyAccess().getAbstractAssignment_0_1()); 
                    }
                    // InternalAlloyLanguage.g:8815:7: ( rule__ALSSignatureBody__AbstractAssignment_0_1 )
                    // InternalAlloyLanguage.g:8815:8: rule__ALSSignatureBody__AbstractAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSSignatureBody__AbstractAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getALSSignatureBodyAccess().getAbstractAssignment_0_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__UnorderedGroup_0__Impl"


    // $ANTLR start "rule__ALSSignatureBody__UnorderedGroup_0__0"
    // InternalAlloyLanguage.g:8830:1: rule__ALSSignatureBody__UnorderedGroup_0__0 : rule__ALSSignatureBody__UnorderedGroup_0__Impl ( rule__ALSSignatureBody__UnorderedGroup_0__1 )? ;
    public final void rule__ALSSignatureBody__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8834:1: ( rule__ALSSignatureBody__UnorderedGroup_0__Impl ( rule__ALSSignatureBody__UnorderedGroup_0__1 )? )
            // InternalAlloyLanguage.g:8835:2: rule__ALSSignatureBody__UnorderedGroup_0__Impl ( rule__ALSSignatureBody__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_62);
            rule__ALSSignatureBody__UnorderedGroup_0__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalAlloyLanguage.g:8836:2: ( rule__ALSSignatureBody__UnorderedGroup_0__1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( LA53_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 1) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAlloyLanguage.g:0:0: rule__ALSSignatureBody__UnorderedGroup_0__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALSSignatureBody__UnorderedGroup_0__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__UnorderedGroup_0__0"


    // $ANTLR start "rule__ALSSignatureBody__UnorderedGroup_0__1"
    // InternalAlloyLanguage.g:8843:1: rule__ALSSignatureBody__UnorderedGroup_0__1 : rule__ALSSignatureBody__UnorderedGroup_0__Impl ;
    public final void rule__ALSSignatureBody__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8847:1: ( rule__ALSSignatureBody__UnorderedGroup_0__Impl )
            // InternalAlloyLanguage.g:8848:2: rule__ALSSignatureBody__UnorderedGroup_0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALSSignatureBody__UnorderedGroup_0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__UnorderedGroup_0__1"


    // $ANTLR start "rule__ALSDocument__EnumDeclarationsAssignment_0_0"
    // InternalAlloyLanguage.g:8859:1: rule__ALSDocument__EnumDeclarationsAssignment_0_0 : ( ruleALSEnumDeclaration ) ;
    public final void rule__ALSDocument__EnumDeclarationsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8863:1: ( ( ruleALSEnumDeclaration ) )
            // InternalAlloyLanguage.g:8864:1: ( ruleALSEnumDeclaration )
            {
            // InternalAlloyLanguage.g:8864:1: ( ruleALSEnumDeclaration )
            // InternalAlloyLanguage.g:8865:1: ruleALSEnumDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDocumentAccess().getEnumDeclarationsALSEnumDeclarationParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSEnumDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDocumentAccess().getEnumDeclarationsALSEnumDeclarationParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDocument__EnumDeclarationsAssignment_0_0"


    // $ANTLR start "rule__ALSDocument__SignatureBodiesAssignment_0_1"
    // InternalAlloyLanguage.g:8874:1: rule__ALSDocument__SignatureBodiesAssignment_0_1 : ( ruleALSSignatureBody ) ;
    public final void rule__ALSDocument__SignatureBodiesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8878:1: ( ( ruleALSSignatureBody ) )
            // InternalAlloyLanguage.g:8879:1: ( ruleALSSignatureBody )
            {
            // InternalAlloyLanguage.g:8879:1: ( ruleALSSignatureBody )
            // InternalAlloyLanguage.g:8880:1: ruleALSSignatureBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDocumentAccess().getSignatureBodiesALSSignatureBodyParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSSignatureBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDocumentAccess().getSignatureBodiesALSSignatureBodyParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDocument__SignatureBodiesAssignment_0_1"


    // $ANTLR start "rule__ALSDocument__FunctionDefinitionsAssignment_0_2"
    // InternalAlloyLanguage.g:8889:1: rule__ALSDocument__FunctionDefinitionsAssignment_0_2 : ( ruleALSFunctionDefinition ) ;
    public final void rule__ALSDocument__FunctionDefinitionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8893:1: ( ( ruleALSFunctionDefinition ) )
            // InternalAlloyLanguage.g:8894:1: ( ruleALSFunctionDefinition )
            {
            // InternalAlloyLanguage.g:8894:1: ( ruleALSFunctionDefinition )
            // InternalAlloyLanguage.g:8895:1: ruleALSFunctionDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDocumentAccess().getFunctionDefinitionsALSFunctionDefinitionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSFunctionDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDocumentAccess().getFunctionDefinitionsALSFunctionDefinitionParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDocument__FunctionDefinitionsAssignment_0_2"


    // $ANTLR start "rule__ALSDocument__RelationDefinitionsAssignment_0_3"
    // InternalAlloyLanguage.g:8904:1: rule__ALSDocument__RelationDefinitionsAssignment_0_3 : ( ruleALSRelationDefinition ) ;
    public final void rule__ALSDocument__RelationDefinitionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8908:1: ( ( ruleALSRelationDefinition ) )
            // InternalAlloyLanguage.g:8909:1: ( ruleALSRelationDefinition )
            {
            // InternalAlloyLanguage.g:8909:1: ( ruleALSRelationDefinition )
            // InternalAlloyLanguage.g:8910:1: ruleALSRelationDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDocumentAccess().getRelationDefinitionsALSRelationDefinitionParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSRelationDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDocumentAccess().getRelationDefinitionsALSRelationDefinitionParserRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDocument__RelationDefinitionsAssignment_0_3"


    // $ANTLR start "rule__ALSDocument__FactDeclarationsAssignment_0_4"
    // InternalAlloyLanguage.g:8919:1: rule__ALSDocument__FactDeclarationsAssignment_0_4 : ( ruleALSFactDeclaration ) ;
    public final void rule__ALSDocument__FactDeclarationsAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8923:1: ( ( ruleALSFactDeclaration ) )
            // InternalAlloyLanguage.g:8924:1: ( ruleALSFactDeclaration )
            {
            // InternalAlloyLanguage.g:8924:1: ( ruleALSFactDeclaration )
            // InternalAlloyLanguage.g:8925:1: ruleALSFactDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDocumentAccess().getFactDeclarationsALSFactDeclarationParserRuleCall_0_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSFactDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDocumentAccess().getFactDeclarationsALSFactDeclarationParserRuleCall_0_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDocument__FactDeclarationsAssignment_0_4"


    // $ANTLR start "rule__ALSDocument__RunCommandAssignment_1"
    // InternalAlloyLanguage.g:8934:1: rule__ALSDocument__RunCommandAssignment_1 : ( ruleALSRunCommand ) ;
    public final void rule__ALSDocument__RunCommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8938:1: ( ( ruleALSRunCommand ) )
            // InternalAlloyLanguage.g:8939:1: ( ruleALSRunCommand )
            {
            // InternalAlloyLanguage.g:8939:1: ( ruleALSRunCommand )
            // InternalAlloyLanguage.g:8940:1: ruleALSRunCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDocumentAccess().getRunCommandALSRunCommandParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSRunCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDocumentAccess().getRunCommandALSRunCommandParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDocument__RunCommandAssignment_1"


    // $ANTLR start "rule__ALSEnumDeclaration__NameAssignment_1"
    // InternalAlloyLanguage.g:8949:1: rule__ALSEnumDeclaration__NameAssignment_1 : ( ruleALSID ) ;
    public final void rule__ALSEnumDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8953:1: ( ( ruleALSID ) )
            // InternalAlloyLanguage.g:8954:1: ( ruleALSID )
            {
            // InternalAlloyLanguage.g:8954:1: ( ruleALSID )
            // InternalAlloyLanguage.g:8955:1: ruleALSID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSEnumDeclarationAccess().getNameALSIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSEnumDeclarationAccess().getNameALSIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ALSEnumDeclaration__LiteralAssignment_3"
    // InternalAlloyLanguage.g:8964:1: rule__ALSEnumDeclaration__LiteralAssignment_3 : ( ruleALSEnumLiteral ) ;
    public final void rule__ALSEnumDeclaration__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8968:1: ( ( ruleALSEnumLiteral ) )
            // InternalAlloyLanguage.g:8969:1: ( ruleALSEnumLiteral )
            {
            // InternalAlloyLanguage.g:8969:1: ( ruleALSEnumLiteral )
            // InternalAlloyLanguage.g:8970:1: ruleALSEnumLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSEnumDeclarationAccess().getLiteralALSEnumLiteralParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSEnumLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSEnumDeclarationAccess().getLiteralALSEnumLiteralParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__LiteralAssignment_3"


    // $ANTLR start "rule__ALSEnumDeclaration__LiteralAssignment_4_1"
    // InternalAlloyLanguage.g:8979:1: rule__ALSEnumDeclaration__LiteralAssignment_4_1 : ( ruleALSEnumLiteral ) ;
    public final void rule__ALSEnumDeclaration__LiteralAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8983:1: ( ( ruleALSEnumLiteral ) )
            // InternalAlloyLanguage.g:8984:1: ( ruleALSEnumLiteral )
            {
            // InternalAlloyLanguage.g:8984:1: ( ruleALSEnumLiteral )
            // InternalAlloyLanguage.g:8985:1: ruleALSEnumLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSEnumDeclarationAccess().getLiteralALSEnumLiteralParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSEnumLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSEnumDeclarationAccess().getLiteralALSEnumLiteralParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumDeclaration__LiteralAssignment_4_1"


    // $ANTLR start "rule__ALSEnumLiteral__NameAssignment"
    // InternalAlloyLanguage.g:8994:1: rule__ALSEnumLiteral__NameAssignment : ( ruleALSID ) ;
    public final void rule__ALSEnumLiteral__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:8998:1: ( ( ruleALSID ) )
            // InternalAlloyLanguage.g:8999:1: ( ruleALSID )
            {
            // InternalAlloyLanguage.g:8999:1: ( ruleALSID )
            // InternalAlloyLanguage.g:9000:1: ruleALSID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSEnumLiteralAccess().getNameALSIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSEnumLiteralAccess().getNameALSIDParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSEnumLiteral__NameAssignment"


    // $ANTLR start "rule__ALSSignatureDeclaration__NameAssignment"
    // InternalAlloyLanguage.g:9009:1: rule__ALSSignatureDeclaration__NameAssignment : ( ruleALSID ) ;
    public final void rule__ALSSignatureDeclaration__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9013:1: ( ( ruleALSID ) )
            // InternalAlloyLanguage.g:9014:1: ( ruleALSID )
            {
            // InternalAlloyLanguage.g:9014:1: ( ruleALSID )
            // InternalAlloyLanguage.g:9015:1: ruleALSID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureDeclarationAccess().getNameALSIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureDeclarationAccess().getNameALSIDParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureDeclaration__NameAssignment"


    // $ANTLR start "rule__ALSSignatureBody__MultiplicityAssignment_0_0"
    // InternalAlloyLanguage.g:9024:1: rule__ALSSignatureBody__MultiplicityAssignment_0_0 : ( ruleALSMultiplicity ) ;
    public final void rule__ALSSignatureBody__MultiplicityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9028:1: ( ( ruleALSMultiplicity ) )
            // InternalAlloyLanguage.g:9029:1: ( ruleALSMultiplicity )
            {
            // InternalAlloyLanguage.g:9029:1: ( ruleALSMultiplicity )
            // InternalAlloyLanguage.g:9030:1: ruleALSMultiplicity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getMultiplicityALSMultiplicityEnumRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSMultiplicity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getMultiplicityALSMultiplicityEnumRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__MultiplicityAssignment_0_0"


    // $ANTLR start "rule__ALSSignatureBody__AbstractAssignment_0_1"
    // InternalAlloyLanguage.g:9039:1: rule__ALSSignatureBody__AbstractAssignment_0_1 : ( ( 'abstract' ) ) ;
    public final void rule__ALSSignatureBody__AbstractAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9043:1: ( ( ( 'abstract' ) ) )
            // InternalAlloyLanguage.g:9044:1: ( ( 'abstract' ) )
            {
            // InternalAlloyLanguage.g:9044:1: ( ( 'abstract' ) )
            // InternalAlloyLanguage.g:9045:1: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getAbstractAbstractKeyword_0_1_0()); 
            }
            // InternalAlloyLanguage.g:9046:1: ( 'abstract' )
            // InternalAlloyLanguage.g:9047:1: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getAbstractAbstractKeyword_0_1_0()); 
            }
            match(input,73,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getAbstractAbstractKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getAbstractAbstractKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__AbstractAssignment_0_1"


    // $ANTLR start "rule__ALSSignatureBody__DeclarationsAssignment_2"
    // InternalAlloyLanguage.g:9062:1: rule__ALSSignatureBody__DeclarationsAssignment_2 : ( ruleALSSignatureDeclaration ) ;
    public final void rule__ALSSignatureBody__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9066:1: ( ( ruleALSSignatureDeclaration ) )
            // InternalAlloyLanguage.g:9067:1: ( ruleALSSignatureDeclaration )
            {
            // InternalAlloyLanguage.g:9067:1: ( ruleALSSignatureDeclaration )
            // InternalAlloyLanguage.g:9068:1: ruleALSSignatureDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getDeclarationsALSSignatureDeclarationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSSignatureDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getDeclarationsALSSignatureDeclarationParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__DeclarationsAssignment_2"


    // $ANTLR start "rule__ALSSignatureBody__DeclarationsAssignment_3_1"
    // InternalAlloyLanguage.g:9077:1: rule__ALSSignatureBody__DeclarationsAssignment_3_1 : ( ruleALSSignatureDeclaration ) ;
    public final void rule__ALSSignatureBody__DeclarationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9081:1: ( ( ruleALSSignatureDeclaration ) )
            // InternalAlloyLanguage.g:9082:1: ( ruleALSSignatureDeclaration )
            {
            // InternalAlloyLanguage.g:9082:1: ( ruleALSSignatureDeclaration )
            // InternalAlloyLanguage.g:9083:1: ruleALSSignatureDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getDeclarationsALSSignatureDeclarationParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSSignatureDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getDeclarationsALSSignatureDeclarationParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__DeclarationsAssignment_3_1"


    // $ANTLR start "rule__ALSSignatureBody__SupertypeAssignment_4_0_1"
    // InternalAlloyLanguage.g:9092:1: rule__ALSSignatureBody__SupertypeAssignment_4_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__ALSSignatureBody__SupertypeAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9096:1: ( ( ( RULE_ID ) ) )
            // InternalAlloyLanguage.g:9097:1: ( ( RULE_ID ) )
            {
            // InternalAlloyLanguage.g:9097:1: ( ( RULE_ID ) )
            // InternalAlloyLanguage.g:9098:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getSupertypeALSSignatureDeclarationCrossReference_4_0_1_0()); 
            }
            // InternalAlloyLanguage.g:9099:1: ( RULE_ID )
            // InternalAlloyLanguage.g:9100:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getSupertypeALSSignatureDeclarationIDTerminalRuleCall_4_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getSupertypeALSSignatureDeclarationIDTerminalRuleCall_4_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getSupertypeALSSignatureDeclarationCrossReference_4_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__SupertypeAssignment_4_0_1"


    // $ANTLR start "rule__ALSSignatureBody__SupersetAssignment_4_1_1"
    // InternalAlloyLanguage.g:9111:1: rule__ALSSignatureBody__SupersetAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__ALSSignatureBody__SupersetAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9115:1: ( ( ( RULE_ID ) ) )
            // InternalAlloyLanguage.g:9116:1: ( ( RULE_ID ) )
            {
            // InternalAlloyLanguage.g:9116:1: ( ( RULE_ID ) )
            // InternalAlloyLanguage.g:9117:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getSupersetALSSignatureDeclarationCrossReference_4_1_1_0()); 
            }
            // InternalAlloyLanguage.g:9118:1: ( RULE_ID )
            // InternalAlloyLanguage.g:9119:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getSupersetALSSignatureDeclarationIDTerminalRuleCall_4_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getSupersetALSSignatureDeclarationIDTerminalRuleCall_4_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getSupersetALSSignatureDeclarationCrossReference_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__SupersetAssignment_4_1_1"


    // $ANTLR start "rule__ALSSignatureBody__SupersetAssignment_4_1_2_1"
    // InternalAlloyLanguage.g:9130:1: rule__ALSSignatureBody__SupersetAssignment_4_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ALSSignatureBody__SupersetAssignment_4_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9134:1: ( ( ( RULE_ID ) ) )
            // InternalAlloyLanguage.g:9135:1: ( ( RULE_ID ) )
            {
            // InternalAlloyLanguage.g:9135:1: ( ( RULE_ID ) )
            // InternalAlloyLanguage.g:9136:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getSupersetALSSignatureDeclarationCrossReference_4_1_2_1_0()); 
            }
            // InternalAlloyLanguage.g:9137:1: ( RULE_ID )
            // InternalAlloyLanguage.g:9138:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getSupersetALSSignatureDeclarationIDTerminalRuleCall_4_1_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getSupersetALSSignatureDeclarationIDTerminalRuleCall_4_1_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getSupersetALSSignatureDeclarationCrossReference_4_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__SupersetAssignment_4_1_2_1"


    // $ANTLR start "rule__ALSSignatureBody__FieldsAssignment_6_0"
    // InternalAlloyLanguage.g:9149:1: rule__ALSSignatureBody__FieldsAssignment_6_0 : ( ruleALSFieldDeclaration ) ;
    public final void rule__ALSSignatureBody__FieldsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9153:1: ( ( ruleALSFieldDeclaration ) )
            // InternalAlloyLanguage.g:9154:1: ( ruleALSFieldDeclaration )
            {
            // InternalAlloyLanguage.g:9154:1: ( ruleALSFieldDeclaration )
            // InternalAlloyLanguage.g:9155:1: ruleALSFieldDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getFieldsALSFieldDeclarationParserRuleCall_6_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSFieldDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getFieldsALSFieldDeclarationParserRuleCall_6_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__FieldsAssignment_6_0"


    // $ANTLR start "rule__ALSSignatureBody__FieldsAssignment_6_1_1"
    // InternalAlloyLanguage.g:9164:1: rule__ALSSignatureBody__FieldsAssignment_6_1_1 : ( ruleALSFieldDeclaration ) ;
    public final void rule__ALSSignatureBody__FieldsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9168:1: ( ( ruleALSFieldDeclaration ) )
            // InternalAlloyLanguage.g:9169:1: ( ruleALSFieldDeclaration )
            {
            // InternalAlloyLanguage.g:9169:1: ( ruleALSFieldDeclaration )
            // InternalAlloyLanguage.g:9170:1: ruleALSFieldDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSignatureBodyAccess().getFieldsALSFieldDeclarationParserRuleCall_6_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSFieldDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSignatureBodyAccess().getFieldsALSFieldDeclarationParserRuleCall_6_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSignatureBody__FieldsAssignment_6_1_1"


    // $ANTLR start "rule__ALSFieldDeclaration__NameAssignment_0"
    // InternalAlloyLanguage.g:9179:1: rule__ALSFieldDeclaration__NameAssignment_0 : ( ruleALSID ) ;
    public final void rule__ALSFieldDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9183:1: ( ( ruleALSID ) )
            // InternalAlloyLanguage.g:9184:1: ( ruleALSID )
            {
            // InternalAlloyLanguage.g:9184:1: ( ruleALSID )
            // InternalAlloyLanguage.g:9185:1: ruleALSID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFieldDeclarationAccess().getNameALSIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFieldDeclarationAccess().getNameALSIDParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFieldDeclaration__NameAssignment_0"


    // $ANTLR start "rule__ALSFieldDeclaration__MultiplicityAssignment_2"
    // InternalAlloyLanguage.g:9194:1: rule__ALSFieldDeclaration__MultiplicityAssignment_2 : ( ruleALSMultiplicity ) ;
    public final void rule__ALSFieldDeclaration__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9198:1: ( ( ruleALSMultiplicity ) )
            // InternalAlloyLanguage.g:9199:1: ( ruleALSMultiplicity )
            {
            // InternalAlloyLanguage.g:9199:1: ( ruleALSMultiplicity )
            // InternalAlloyLanguage.g:9200:1: ruleALSMultiplicity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFieldDeclarationAccess().getMultiplicityALSMultiplicityEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSMultiplicity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFieldDeclarationAccess().getMultiplicityALSMultiplicityEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFieldDeclaration__MultiplicityAssignment_2"


    // $ANTLR start "rule__ALSFieldDeclaration__TypeAssignment_3"
    // InternalAlloyLanguage.g:9209:1: rule__ALSFieldDeclaration__TypeAssignment_3 : ( ruleALSTerm ) ;
    public final void rule__ALSFieldDeclaration__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9213:1: ( ( ruleALSTerm ) )
            // InternalAlloyLanguage.g:9214:1: ( ruleALSTerm )
            {
            // InternalAlloyLanguage.g:9214:1: ( ruleALSTerm )
            // InternalAlloyLanguage.g:9215:1: ruleALSTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFieldDeclarationAccess().getTypeALSTermParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFieldDeclarationAccess().getTypeALSTermParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFieldDeclaration__TypeAssignment_3"


    // $ANTLR start "rule__ALSFunctionDefinition__NameAssignment_1"
    // InternalAlloyLanguage.g:9224:1: rule__ALSFunctionDefinition__NameAssignment_1 : ( ruleALSID ) ;
    public final void rule__ALSFunctionDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9228:1: ( ( ruleALSID ) )
            // InternalAlloyLanguage.g:9229:1: ( ruleALSID )
            {
            // InternalAlloyLanguage.g:9229:1: ( ruleALSID )
            // InternalAlloyLanguage.g:9230:1: ruleALSID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getNameALSIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getNameALSIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__NameAssignment_1"


    // $ANTLR start "rule__ALSFunctionDefinition__VariablesAssignment_3"
    // InternalAlloyLanguage.g:9239:1: rule__ALSFunctionDefinition__VariablesAssignment_3 : ( ruleALSVariableDeclaration ) ;
    public final void rule__ALSFunctionDefinition__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9243:1: ( ( ruleALSVariableDeclaration ) )
            // InternalAlloyLanguage.g:9244:1: ( ruleALSVariableDeclaration )
            {
            // InternalAlloyLanguage.g:9244:1: ( ruleALSVariableDeclaration )
            // InternalAlloyLanguage.g:9245:1: ruleALSVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getVariablesALSVariableDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getVariablesALSVariableDeclarationParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__VariablesAssignment_3"


    // $ANTLR start "rule__ALSFunctionDefinition__VariablesAssignment_4_1"
    // InternalAlloyLanguage.g:9254:1: rule__ALSFunctionDefinition__VariablesAssignment_4_1 : ( ruleALSVariableDeclaration ) ;
    public final void rule__ALSFunctionDefinition__VariablesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9258:1: ( ( ruleALSVariableDeclaration ) )
            // InternalAlloyLanguage.g:9259:1: ( ruleALSVariableDeclaration )
            {
            // InternalAlloyLanguage.g:9259:1: ( ruleALSVariableDeclaration )
            // InternalAlloyLanguage.g:9260:1: ruleALSVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getVariablesALSVariableDeclarationParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getVariablesALSVariableDeclarationParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__VariablesAssignment_4_1"


    // $ANTLR start "rule__ALSFunctionDefinition__TypeAssignment_7"
    // InternalAlloyLanguage.g:9269:1: rule__ALSFunctionDefinition__TypeAssignment_7 : ( ruleALSTerm ) ;
    public final void rule__ALSFunctionDefinition__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9273:1: ( ( ruleALSTerm ) )
            // InternalAlloyLanguage.g:9274:1: ( ruleALSTerm )
            {
            // InternalAlloyLanguage.g:9274:1: ( ruleALSTerm )
            // InternalAlloyLanguage.g:9275:1: ruleALSTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getTypeALSTermParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getTypeALSTermParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__TypeAssignment_7"


    // $ANTLR start "rule__ALSFunctionDefinition__ValueAssignment_9"
    // InternalAlloyLanguage.g:9284:1: rule__ALSFunctionDefinition__ValueAssignment_9 : ( ruleALSTerm ) ;
    public final void rule__ALSFunctionDefinition__ValueAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9288:1: ( ( ruleALSTerm ) )
            // InternalAlloyLanguage.g:9289:1: ( ruleALSTerm )
            {
            // InternalAlloyLanguage.g:9289:1: ( ruleALSTerm )
            // InternalAlloyLanguage.g:9290:1: ruleALSTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFunctionDefinitionAccess().getValueALSTermParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFunctionDefinitionAccess().getValueALSTermParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFunctionDefinition__ValueAssignment_9"


    // $ANTLR start "rule__ALSRelationDefinition__NameAssignment_1"
    // InternalAlloyLanguage.g:9299:1: rule__ALSRelationDefinition__NameAssignment_1 : ( ruleALSID ) ;
    public final void rule__ALSRelationDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9303:1: ( ( ruleALSID ) )
            // InternalAlloyLanguage.g:9304:1: ( ruleALSID )
            {
            // InternalAlloyLanguage.g:9304:1: ( ruleALSID )
            // InternalAlloyLanguage.g:9305:1: ruleALSID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRelationDefinitionAccess().getNameALSIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRelationDefinitionAccess().getNameALSIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__NameAssignment_1"


    // $ANTLR start "rule__ALSRelationDefinition__VariablesAssignment_3"
    // InternalAlloyLanguage.g:9314:1: rule__ALSRelationDefinition__VariablesAssignment_3 : ( ruleALSVariableDeclaration ) ;
    public final void rule__ALSRelationDefinition__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9318:1: ( ( ruleALSVariableDeclaration ) )
            // InternalAlloyLanguage.g:9319:1: ( ruleALSVariableDeclaration )
            {
            // InternalAlloyLanguage.g:9319:1: ( ruleALSVariableDeclaration )
            // InternalAlloyLanguage.g:9320:1: ruleALSVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRelationDefinitionAccess().getVariablesALSVariableDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRelationDefinitionAccess().getVariablesALSVariableDeclarationParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__VariablesAssignment_3"


    // $ANTLR start "rule__ALSRelationDefinition__VariablesAssignment_4_1"
    // InternalAlloyLanguage.g:9329:1: rule__ALSRelationDefinition__VariablesAssignment_4_1 : ( ruleALSVariableDeclaration ) ;
    public final void rule__ALSRelationDefinition__VariablesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9333:1: ( ( ruleALSVariableDeclaration ) )
            // InternalAlloyLanguage.g:9334:1: ( ruleALSVariableDeclaration )
            {
            // InternalAlloyLanguage.g:9334:1: ( ruleALSVariableDeclaration )
            // InternalAlloyLanguage.g:9335:1: ruleALSVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRelationDefinitionAccess().getVariablesALSVariableDeclarationParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRelationDefinitionAccess().getVariablesALSVariableDeclarationParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__VariablesAssignment_4_1"


    // $ANTLR start "rule__ALSRelationDefinition__ValueAssignment_7"
    // InternalAlloyLanguage.g:9344:1: rule__ALSRelationDefinition__ValueAssignment_7 : ( ruleALSTerm ) ;
    public final void rule__ALSRelationDefinition__ValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9348:1: ( ( ruleALSTerm ) )
            // InternalAlloyLanguage.g:9349:1: ( ruleALSTerm )
            {
            // InternalAlloyLanguage.g:9349:1: ( ruleALSTerm )
            // InternalAlloyLanguage.g:9350:1: ruleALSTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRelationDefinitionAccess().getValueALSTermParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRelationDefinitionAccess().getValueALSTermParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRelationDefinition__ValueAssignment_7"


    // $ANTLR start "rule__ALSFactDeclaration__NameAssignment_2"
    // InternalAlloyLanguage.g:9359:1: rule__ALSFactDeclaration__NameAssignment_2 : ( ruleALSID ) ;
    public final void rule__ALSFactDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9363:1: ( ( ruleALSID ) )
            // InternalAlloyLanguage.g:9364:1: ( ruleALSID )
            {
            // InternalAlloyLanguage.g:9364:1: ( ruleALSID )
            // InternalAlloyLanguage.g:9365:1: ruleALSID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFactDeclarationAccess().getNameALSIDParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFactDeclarationAccess().getNameALSIDParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFactDeclaration__NameAssignment_2"


    // $ANTLR start "rule__ALSFactDeclaration__TermAssignment_4"
    // InternalAlloyLanguage.g:9374:1: rule__ALSFactDeclaration__TermAssignment_4 : ( ruleALSTerm ) ;
    public final void rule__ALSFactDeclaration__TermAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9378:1: ( ( ruleALSTerm ) )
            // InternalAlloyLanguage.g:9379:1: ( ruleALSTerm )
            {
            // InternalAlloyLanguage.g:9379:1: ( ruleALSTerm )
            // InternalAlloyLanguage.g:9380:1: ruleALSTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSFactDeclarationAccess().getTermALSTermParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSFactDeclarationAccess().getTermALSTermParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSFactDeclaration__TermAssignment_4"


    // $ANTLR start "rule__ALSQuantified__TypeAssignment_0_1"
    // InternalAlloyLanguage.g:9389:1: rule__ALSQuantified__TypeAssignment_0_1 : ( ruleALSMultiplicity ) ;
    public final void rule__ALSQuantified__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9393:1: ( ( ruleALSMultiplicity ) )
            // InternalAlloyLanguage.g:9394:1: ( ruleALSMultiplicity )
            {
            // InternalAlloyLanguage.g:9394:1: ( ruleALSMultiplicity )
            // InternalAlloyLanguage.g:9395:1: ruleALSMultiplicity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedAccess().getTypeALSMultiplicityEnumRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSMultiplicity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedAccess().getTypeALSMultiplicityEnumRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__TypeAssignment_0_1"


    // $ANTLR start "rule__ALSQuantified__DisjAssignment_0_2"
    // InternalAlloyLanguage.g:9404:1: rule__ALSQuantified__DisjAssignment_0_2 : ( ( 'disj' ) ) ;
    public final void rule__ALSQuantified__DisjAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9408:1: ( ( ( 'disj' ) ) )
            // InternalAlloyLanguage.g:9409:1: ( ( 'disj' ) )
            {
            // InternalAlloyLanguage.g:9409:1: ( ( 'disj' ) )
            // InternalAlloyLanguage.g:9410:1: ( 'disj' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedAccess().getDisjDisjKeyword_0_2_0()); 
            }
            // InternalAlloyLanguage.g:9411:1: ( 'disj' )
            // InternalAlloyLanguage.g:9412:1: 'disj'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedAccess().getDisjDisjKeyword_0_2_0()); 
            }
            match(input,74,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedAccess().getDisjDisjKeyword_0_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedAccess().getDisjDisjKeyword_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__DisjAssignment_0_2"


    // $ANTLR start "rule__ALSQuantified__VariablesAssignment_0_3"
    // InternalAlloyLanguage.g:9427:1: rule__ALSQuantified__VariablesAssignment_0_3 : ( ruleALSVariableDeclaration ) ;
    public final void rule__ALSQuantified__VariablesAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9431:1: ( ( ruleALSVariableDeclaration ) )
            // InternalAlloyLanguage.g:9432:1: ( ruleALSVariableDeclaration )
            {
            // InternalAlloyLanguage.g:9432:1: ( ruleALSVariableDeclaration )
            // InternalAlloyLanguage.g:9433:1: ruleALSVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedAccess().getVariablesALSVariableDeclarationParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedAccess().getVariablesALSVariableDeclarationParserRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__VariablesAssignment_0_3"


    // $ANTLR start "rule__ALSQuantified__VariablesAssignment_0_4_1"
    // InternalAlloyLanguage.g:9442:1: rule__ALSQuantified__VariablesAssignment_0_4_1 : ( ruleALSVariableDeclaration ) ;
    public final void rule__ALSQuantified__VariablesAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9446:1: ( ( ruleALSVariableDeclaration ) )
            // InternalAlloyLanguage.g:9447:1: ( ruleALSVariableDeclaration )
            {
            // InternalAlloyLanguage.g:9447:1: ( ruleALSVariableDeclaration )
            // InternalAlloyLanguage.g:9448:1: ruleALSVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedAccess().getVariablesALSVariableDeclarationParserRuleCall_0_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedAccess().getVariablesALSVariableDeclarationParserRuleCall_0_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__VariablesAssignment_0_4_1"


    // $ANTLR start "rule__ALSQuantified__ExpressionAssignment_0_6"
    // InternalAlloyLanguage.g:9457:1: rule__ALSQuantified__ExpressionAssignment_0_6 : ( ruleALSTerm ) ;
    public final void rule__ALSQuantified__ExpressionAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9461:1: ( ( ruleALSTerm ) )
            // InternalAlloyLanguage.g:9462:1: ( ruleALSTerm )
            {
            // InternalAlloyLanguage.g:9462:1: ( ruleALSTerm )
            // InternalAlloyLanguage.g:9463:1: ruleALSTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSQuantifiedAccess().getExpressionALSTermParserRuleCall_0_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSQuantifiedAccess().getExpressionALSTermParserRuleCall_0_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSQuantified__ExpressionAssignment_0_6"


    // $ANTLR start "rule__ALSOr__RightOperandAssignment_1_2"
    // InternalAlloyLanguage.g:9472:1: rule__ALSOr__RightOperandAssignment_1_2 : ( ruleALSIff ) ;
    public final void rule__ALSOr__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9476:1: ( ( ruleALSIff ) )
            // InternalAlloyLanguage.g:9477:1: ( ruleALSIff )
            {
            // InternalAlloyLanguage.g:9477:1: ( ruleALSIff )
            // InternalAlloyLanguage.g:9478:1: ruleALSIff
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSOrAccess().getRightOperandALSIffParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSIff();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSOrAccess().getRightOperandALSIffParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOr__RightOperandAssignment_1_2"


    // $ANTLR start "rule__ALSIff__RightOperandAssignment_1_2"
    // InternalAlloyLanguage.g:9487:1: rule__ALSIff__RightOperandAssignment_1_2 : ( ruleALSImpl ) ;
    public final void rule__ALSIff__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9491:1: ( ( ruleALSImpl ) )
            // InternalAlloyLanguage.g:9492:1: ( ruleALSImpl )
            {
            // InternalAlloyLanguage.g:9492:1: ( ruleALSImpl )
            // InternalAlloyLanguage.g:9493:1: ruleALSImpl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIffAccess().getRightOperandALSImplParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSImpl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIffAccess().getRightOperandALSImplParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIff__RightOperandAssignment_1_2"


    // $ANTLR start "rule__ALSImpl__RightOperandAssignment_1_2"
    // InternalAlloyLanguage.g:9502:1: rule__ALSImpl__RightOperandAssignment_1_2 : ( ruleALSAnd ) ;
    public final void rule__ALSImpl__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9506:1: ( ( ruleALSAnd ) )
            // InternalAlloyLanguage.g:9507:1: ( ruleALSAnd )
            {
            // InternalAlloyLanguage.g:9507:1: ( ruleALSAnd )
            // InternalAlloyLanguage.g:9508:1: ruleALSAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSImplAccess().getRightOperandALSAndParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSImplAccess().getRightOperandALSAndParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__RightOperandAssignment_1_2"


    // $ANTLR start "rule__ALSImpl__ElseOperandAssignment_1_3_1"
    // InternalAlloyLanguage.g:9517:1: rule__ALSImpl__ElseOperandAssignment_1_3_1 : ( ruleALSAnd ) ;
    public final void rule__ALSImpl__ElseOperandAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9521:1: ( ( ruleALSAnd ) )
            // InternalAlloyLanguage.g:9522:1: ( ruleALSAnd )
            {
            // InternalAlloyLanguage.g:9522:1: ( ruleALSAnd )
            // InternalAlloyLanguage.g:9523:1: ruleALSAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSImplAccess().getElseOperandALSAndParserRuleCall_1_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSImplAccess().getElseOperandALSAndParserRuleCall_1_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSImpl__ElseOperandAssignment_1_3_1"


    // $ANTLR start "rule__ALSAnd__RightOperandAssignment_1_2"
    // InternalAlloyLanguage.g:9532:1: rule__ALSAnd__RightOperandAssignment_1_2 : ( ruleALSComparison ) ;
    public final void rule__ALSAnd__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9536:1: ( ( ruleALSComparison ) )
            // InternalAlloyLanguage.g:9537:1: ( ruleALSComparison )
            {
            // InternalAlloyLanguage.g:9537:1: ( ruleALSComparison )
            // InternalAlloyLanguage.g:9538:1: ruleALSComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSAndAccess().getRightOperandALSComparisonParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSAndAccess().getRightOperandALSComparisonParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSAnd__RightOperandAssignment_1_2"


    // $ANTLR start "rule__ALSComparison__RightOperandAssignment_1_1"
    // InternalAlloyLanguage.g:9547:1: rule__ALSComparison__RightOperandAssignment_1_1 : ( ruleALSOverride ) ;
    public final void rule__ALSComparison__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9551:1: ( ( ruleALSOverride ) )
            // InternalAlloyLanguage.g:9552:1: ( ruleALSOverride )
            {
            // InternalAlloyLanguage.g:9552:1: ( ruleALSOverride )
            // InternalAlloyLanguage.g:9553:1: ruleALSOverride
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSComparisonAccess().getRightOperandALSOverrideParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSOverride();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSComparisonAccess().getRightOperandALSOverrideParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSComparison__RightOperandAssignment_1_1"


    // $ANTLR start "rule__ALSOverride__RightOperandAssignment_1_2"
    // InternalAlloyLanguage.g:9562:1: rule__ALSOverride__RightOperandAssignment_1_2 : ( ruleALSRangeRestrictionRight ) ;
    public final void rule__ALSOverride__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9566:1: ( ( ruleALSRangeRestrictionRight ) )
            // InternalAlloyLanguage.g:9567:1: ( ruleALSRangeRestrictionRight )
            {
            // InternalAlloyLanguage.g:9567:1: ( ruleALSRangeRestrictionRight )
            // InternalAlloyLanguage.g:9568:1: ruleALSRangeRestrictionRight
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSOverrideAccess().getRightOperandALSRangeRestrictionRightParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSRangeRestrictionRight();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSOverrideAccess().getRightOperandALSRangeRestrictionRightParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSOverride__RightOperandAssignment_1_2"


    // $ANTLR start "rule__ALSRangeRestrictionRight__FilterAssignment_1_2"
    // InternalAlloyLanguage.g:9577:1: rule__ALSRangeRestrictionRight__FilterAssignment_1_2 : ( ruleALSRangeRestrictionLeft ) ;
    public final void rule__ALSRangeRestrictionRight__FilterAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9581:1: ( ( ruleALSRangeRestrictionLeft ) )
            // InternalAlloyLanguage.g:9582:1: ( ruleALSRangeRestrictionLeft )
            {
            // InternalAlloyLanguage.g:9582:1: ( ruleALSRangeRestrictionLeft )
            // InternalAlloyLanguage.g:9583:1: ruleALSRangeRestrictionLeft
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRangeRestrictionRightAccess().getFilterALSRangeRestrictionLeftParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSRangeRestrictionLeft();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRangeRestrictionRightAccess().getFilterALSRangeRestrictionLeftParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionRight__FilterAssignment_1_2"


    // $ANTLR start "rule__ALSRangeRestrictionLeft__RelationAssignment_1_2"
    // InternalAlloyLanguage.g:9592:1: rule__ALSRangeRestrictionLeft__RelationAssignment_1_2 : ( ruleALSJoin ) ;
    public final void rule__ALSRangeRestrictionLeft__RelationAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9596:1: ( ( ruleALSJoin ) )
            // InternalAlloyLanguage.g:9597:1: ( ruleALSJoin )
            {
            // InternalAlloyLanguage.g:9597:1: ( ruleALSJoin )
            // InternalAlloyLanguage.g:9598:1: ruleALSJoin
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRangeRestrictionLeftAccess().getRelationALSJoinParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSJoin();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRangeRestrictionLeftAccess().getRelationALSJoinParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRangeRestrictionLeft__RelationAssignment_1_2"


    // $ANTLR start "rule__ALSJoin__RightOperandAssignment_1_2"
    // InternalAlloyLanguage.g:9607:1: rule__ALSJoin__RightOperandAssignment_1_2 : ( ruleALSMinus ) ;
    public final void rule__ALSJoin__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9611:1: ( ( ruleALSMinus ) )
            // InternalAlloyLanguage.g:9612:1: ( ruleALSMinus )
            {
            // InternalAlloyLanguage.g:9612:1: ( ruleALSMinus )
            // InternalAlloyLanguage.g:9613:1: ruleALSMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSJoinAccess().getRightOperandALSMinusParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSJoinAccess().getRightOperandALSMinusParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSJoin__RightOperandAssignment_1_2"


    // $ANTLR start "rule__ALSMinus__RightOperandAssignment_1_2"
    // InternalAlloyLanguage.g:9622:1: rule__ALSMinus__RightOperandAssignment_1_2 : ( ruleALSPlus ) ;
    public final void rule__ALSMinus__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9626:1: ( ( ruleALSPlus ) )
            // InternalAlloyLanguage.g:9627:1: ( ruleALSPlus )
            {
            // InternalAlloyLanguage.g:9627:1: ( ruleALSPlus )
            // InternalAlloyLanguage.g:9628:1: ruleALSPlus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSMinusAccess().getRightOperandALSPlusParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSPlus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSMinusAccess().getRightOperandALSPlusParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSMinus__RightOperandAssignment_1_2"


    // $ANTLR start "rule__ALSPlus__RightOperandAssignment_1_2"
    // InternalAlloyLanguage.g:9637:1: rule__ALSPlus__RightOperandAssignment_1_2 : ( ruleALSIntersection ) ;
    public final void rule__ALSPlus__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9641:1: ( ( ruleALSIntersection ) )
            // InternalAlloyLanguage.g:9642:1: ( ruleALSIntersection )
            {
            // InternalAlloyLanguage.g:9642:1: ( ruleALSIntersection )
            // InternalAlloyLanguage.g:9643:1: ruleALSIntersection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPlusAccess().getRightOperandALSIntersectionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSIntersection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPlusAccess().getRightOperandALSIntersectionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPlus__RightOperandAssignment_1_2"


    // $ANTLR start "rule__ALSIntersection__RightOperandAssignment_1_2"
    // InternalAlloyLanguage.g:9652:1: rule__ALSIntersection__RightOperandAssignment_1_2 : ( ruleALSDirectProduct ) ;
    public final void rule__ALSIntersection__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9656:1: ( ( ruleALSDirectProduct ) )
            // InternalAlloyLanguage.g:9657:1: ( ruleALSDirectProduct )
            {
            // InternalAlloyLanguage.g:9657:1: ( ruleALSDirectProduct )
            // InternalAlloyLanguage.g:9658:1: ruleALSDirectProduct
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIntersectionAccess().getRightOperandALSDirectProductParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSDirectProduct();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIntersectionAccess().getRightOperandALSDirectProductParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIntersection__RightOperandAssignment_1_2"


    // $ANTLR start "rule__ALSDirectProduct__LeftMultiplicitAssignment_1_1"
    // InternalAlloyLanguage.g:9667:1: rule__ALSDirectProduct__LeftMultiplicitAssignment_1_1 : ( ruleALSMultiplicity ) ;
    public final void rule__ALSDirectProduct__LeftMultiplicitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9671:1: ( ( ruleALSMultiplicity ) )
            // InternalAlloyLanguage.g:9672:1: ( ruleALSMultiplicity )
            {
            // InternalAlloyLanguage.g:9672:1: ( ruleALSMultiplicity )
            // InternalAlloyLanguage.g:9673:1: ruleALSMultiplicity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDirectProductAccess().getLeftMultiplicitALSMultiplicityEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSMultiplicity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDirectProductAccess().getLeftMultiplicitALSMultiplicityEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDirectProduct__LeftMultiplicitAssignment_1_1"


    // $ANTLR start "rule__ALSDirectProduct__RightMultiplicitAssignment_1_3"
    // InternalAlloyLanguage.g:9682:1: rule__ALSDirectProduct__RightMultiplicitAssignment_1_3 : ( ruleALSMultiplicity ) ;
    public final void rule__ALSDirectProduct__RightMultiplicitAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9686:1: ( ( ruleALSMultiplicity ) )
            // InternalAlloyLanguage.g:9687:1: ( ruleALSMultiplicity )
            {
            // InternalAlloyLanguage.g:9687:1: ( ruleALSMultiplicity )
            // InternalAlloyLanguage.g:9688:1: ruleALSMultiplicity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDirectProductAccess().getRightMultiplicitALSMultiplicityEnumRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSMultiplicity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDirectProductAccess().getRightMultiplicitALSMultiplicityEnumRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDirectProduct__RightMultiplicitAssignment_1_3"


    // $ANTLR start "rule__ALSDirectProduct__RightOperandAssignment_1_4"
    // InternalAlloyLanguage.g:9697:1: rule__ALSDirectProduct__RightOperandAssignment_1_4 : ( ruleALSPreficed ) ;
    public final void rule__ALSDirectProduct__RightOperandAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9701:1: ( ( ruleALSPreficed ) )
            // InternalAlloyLanguage.g:9702:1: ( ruleALSPreficed )
            {
            // InternalAlloyLanguage.g:9702:1: ( ruleALSPreficed )
            // InternalAlloyLanguage.g:9703:1: ruleALSPreficed
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSDirectProductAccess().getRightOperandALSPreficedParserRuleCall_1_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSPreficed();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSDirectProductAccess().getRightOperandALSPreficedParserRuleCall_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSDirectProduct__RightOperandAssignment_1_4"


    // $ANTLR start "rule__ALSPreficed__OperandAssignment_0_2"
    // InternalAlloyLanguage.g:9712:1: rule__ALSPreficed__OperandAssignment_0_2 : ( ruleALSBasicRelationTerm ) ;
    public final void rule__ALSPreficed__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9716:1: ( ( ruleALSBasicRelationTerm ) )
            // InternalAlloyLanguage.g:9717:1: ( ruleALSBasicRelationTerm )
            {
            // InternalAlloyLanguage.g:9717:1: ( ruleALSBasicRelationTerm )
            // InternalAlloyLanguage.g:9718:1: ruleALSBasicRelationTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSBasicRelationTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__OperandAssignment_0_2"


    // $ANTLR start "rule__ALSPreficed__OperandAssignment_1_2"
    // InternalAlloyLanguage.g:9727:1: rule__ALSPreficed__OperandAssignment_1_2 : ( ruleALSBasicRelationTerm ) ;
    public final void rule__ALSPreficed__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9731:1: ( ( ruleALSBasicRelationTerm ) )
            // InternalAlloyLanguage.g:9732:1: ( ruleALSBasicRelationTerm )
            {
            // InternalAlloyLanguage.g:9732:1: ( ruleALSBasicRelationTerm )
            // InternalAlloyLanguage.g:9733:1: ruleALSBasicRelationTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSBasicRelationTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__OperandAssignment_1_2"


    // $ANTLR start "rule__ALSPreficed__OperandAssignment_2_2"
    // InternalAlloyLanguage.g:9742:1: rule__ALSPreficed__OperandAssignment_2_2 : ( ruleALSBasicRelationTerm ) ;
    public final void rule__ALSPreficed__OperandAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9746:1: ( ( ruleALSBasicRelationTerm ) )
            // InternalAlloyLanguage.g:9747:1: ( ruleALSBasicRelationTerm )
            {
            // InternalAlloyLanguage.g:9747:1: ( ruleALSBasicRelationTerm )
            // InternalAlloyLanguage.g:9748:1: ruleALSBasicRelationTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSBasicRelationTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__OperandAssignment_2_2"


    // $ANTLR start "rule__ALSPreficed__OperandAssignment_3_2"
    // InternalAlloyLanguage.g:9757:1: rule__ALSPreficed__OperandAssignment_3_2 : ( ruleALSBasicRelationTerm ) ;
    public final void rule__ALSPreficed__OperandAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9761:1: ( ( ruleALSBasicRelationTerm ) )
            // InternalAlloyLanguage.g:9762:1: ( ruleALSBasicRelationTerm )
            {
            // InternalAlloyLanguage.g:9762:1: ( ruleALSBasicRelationTerm )
            // InternalAlloyLanguage.g:9763:1: ruleALSBasicRelationTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSBasicRelationTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__OperandAssignment_3_2"


    // $ANTLR start "rule__ALSPreficed__OperandAssignment_4_2"
    // InternalAlloyLanguage.g:9772:1: rule__ALSPreficed__OperandAssignment_4_2 : ( ruleALSBasicRelationTerm ) ;
    public final void rule__ALSPreficed__OperandAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9776:1: ( ( ruleALSBasicRelationTerm ) )
            // InternalAlloyLanguage.g:9777:1: ( ruleALSBasicRelationTerm )
            {
            // InternalAlloyLanguage.g:9777:1: ( ruleALSBasicRelationTerm )
            // InternalAlloyLanguage.g:9778:1: ruleALSBasicRelationTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSBasicRelationTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__OperandAssignment_4_2"


    // $ANTLR start "rule__ALSPreficed__OperandAssignment_5_2"
    // InternalAlloyLanguage.g:9787:1: rule__ALSPreficed__OperandAssignment_5_2 : ( ruleALSBasicRelationTerm ) ;
    public final void rule__ALSPreficed__OperandAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9791:1: ( ( ruleALSBasicRelationTerm ) )
            // InternalAlloyLanguage.g:9792:1: ( ruleALSBasicRelationTerm )
            {
            // InternalAlloyLanguage.g:9792:1: ( ruleALSBasicRelationTerm )
            // InternalAlloyLanguage.g:9793:1: ruleALSBasicRelationTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSBasicRelationTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__OperandAssignment_5_2"


    // $ANTLR start "rule__ALSPreficed__VariablesAssignment_6_2"
    // InternalAlloyLanguage.g:9802:1: rule__ALSPreficed__VariablesAssignment_6_2 : ( ruleALSVariableDeclaration ) ;
    public final void rule__ALSPreficed__VariablesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9806:1: ( ( ruleALSVariableDeclaration ) )
            // InternalAlloyLanguage.g:9807:1: ( ruleALSVariableDeclaration )
            {
            // InternalAlloyLanguage.g:9807:1: ( ruleALSVariableDeclaration )
            // InternalAlloyLanguage.g:9808:1: ruleALSVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getVariablesALSVariableDeclarationParserRuleCall_6_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getVariablesALSVariableDeclarationParserRuleCall_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__VariablesAssignment_6_2"


    // $ANTLR start "rule__ALSPreficed__VariablesAssignment_6_3_1"
    // InternalAlloyLanguage.g:9817:1: rule__ALSPreficed__VariablesAssignment_6_3_1 : ( ruleALSVariableDeclaration ) ;
    public final void rule__ALSPreficed__VariablesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9821:1: ( ( ruleALSVariableDeclaration ) )
            // InternalAlloyLanguage.g:9822:1: ( ruleALSVariableDeclaration )
            {
            // InternalAlloyLanguage.g:9822:1: ( ruleALSVariableDeclaration )
            // InternalAlloyLanguage.g:9823:1: ruleALSVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getVariablesALSVariableDeclarationParserRuleCall_6_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getVariablesALSVariableDeclarationParserRuleCall_6_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__VariablesAssignment_6_3_1"


    // $ANTLR start "rule__ALSPreficed__ExpressionAssignment_6_5"
    // InternalAlloyLanguage.g:9832:1: rule__ALSPreficed__ExpressionAssignment_6_5 : ( ruleALSTerm ) ;
    public final void rule__ALSPreficed__ExpressionAssignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9836:1: ( ( ruleALSTerm ) )
            // InternalAlloyLanguage.g:9837:1: ( ruleALSTerm )
            {
            // InternalAlloyLanguage.g:9837:1: ( ruleALSTerm )
            // InternalAlloyLanguage.g:9838:1: ruleALSTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getExpressionALSTermParserRuleCall_6_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getExpressionALSTermParserRuleCall_6_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__ExpressionAssignment_6_5"


    // $ANTLR start "rule__ALSPreficed__ReferredDefinitionAssignment_7_1_0"
    // InternalAlloyLanguage.g:9847:1: rule__ALSPreficed__ReferredDefinitionAssignment_7_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__ALSPreficed__ReferredDefinitionAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9851:1: ( ( ( RULE_ID ) ) )
            // InternalAlloyLanguage.g:9852:1: ( ( RULE_ID ) )
            {
            // InternalAlloyLanguage.g:9852:1: ( ( RULE_ID ) )
            // InternalAlloyLanguage.g:9853:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getReferredDefinitionALSDefinitionCrossReference_7_1_0_0()); 
            }
            // InternalAlloyLanguage.g:9854:1: ( RULE_ID )
            // InternalAlloyLanguage.g:9855:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getReferredDefinitionALSDefinitionIDTerminalRuleCall_7_1_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getReferredDefinitionALSDefinitionIDTerminalRuleCall_7_1_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getReferredDefinitionALSDefinitionCrossReference_7_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__ReferredDefinitionAssignment_7_1_0"


    // $ANTLR start "rule__ALSPreficed__ReferredNumericOperatorAssignment_7_1_1"
    // InternalAlloyLanguage.g:9866:1: rule__ALSPreficed__ReferredNumericOperatorAssignment_7_1_1 : ( ruleALSNumericOperator ) ;
    public final void rule__ALSPreficed__ReferredNumericOperatorAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9870:1: ( ( ruleALSNumericOperator ) )
            // InternalAlloyLanguage.g:9871:1: ( ruleALSNumericOperator )
            {
            // InternalAlloyLanguage.g:9871:1: ( ruleALSNumericOperator )
            // InternalAlloyLanguage.g:9872:1: ruleALSNumericOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getReferredNumericOperatorALSNumericOperatorEnumRuleCall_7_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSNumericOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getReferredNumericOperatorALSNumericOperatorEnumRuleCall_7_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__ReferredNumericOperatorAssignment_7_1_1"


    // $ANTLR start "rule__ALSPreficed__ParamsAssignment_7_3"
    // InternalAlloyLanguage.g:9881:1: rule__ALSPreficed__ParamsAssignment_7_3 : ( ruleALSTerm ) ;
    public final void rule__ALSPreficed__ParamsAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9885:1: ( ( ruleALSTerm ) )
            // InternalAlloyLanguage.g:9886:1: ( ruleALSTerm )
            {
            // InternalAlloyLanguage.g:9886:1: ( ruleALSTerm )
            // InternalAlloyLanguage.g:9887:1: ruleALSTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getParamsALSTermParserRuleCall_7_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getParamsALSTermParserRuleCall_7_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__ParamsAssignment_7_3"


    // $ANTLR start "rule__ALSPreficed__ParamsAssignment_7_4_1"
    // InternalAlloyLanguage.g:9896:1: rule__ALSPreficed__ParamsAssignment_7_4_1 : ( ruleALSTerm ) ;
    public final void rule__ALSPreficed__ParamsAssignment_7_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9900:1: ( ( ruleALSTerm ) )
            // InternalAlloyLanguage.g:9901:1: ( ruleALSTerm )
            {
            // InternalAlloyLanguage.g:9901:1: ( ruleALSTerm )
            // InternalAlloyLanguage.g:9902:1: ruleALSTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSPreficedAccess().getParamsALSTermParserRuleCall_7_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSPreficedAccess().getParamsALSTermParserRuleCall_7_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSPreficed__ParamsAssignment_7_4_1"


    // $ANTLR start "rule__ALSVariableDeclaration__NameAssignment_0"
    // InternalAlloyLanguage.g:9911:1: rule__ALSVariableDeclaration__NameAssignment_0 : ( ruleALSID ) ;
    public final void rule__ALSVariableDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9915:1: ( ( ruleALSID ) )
            // InternalAlloyLanguage.g:9916:1: ( ruleALSID )
            {
            // InternalAlloyLanguage.g:9916:1: ( ruleALSID )
            // InternalAlloyLanguage.g:9917:1: ruleALSID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSVariableDeclarationAccess().getNameALSIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSVariableDeclarationAccess().getNameALSIDParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSVariableDeclaration__NameAssignment_0"


    // $ANTLR start "rule__ALSVariableDeclaration__RangeAssignment_2"
    // InternalAlloyLanguage.g:9926:1: rule__ALSVariableDeclaration__RangeAssignment_2 : ( ruleALSTerm ) ;
    public final void rule__ALSVariableDeclaration__RangeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9930:1: ( ( ruleALSTerm ) )
            // InternalAlloyLanguage.g:9931:1: ( ruleALSTerm )
            {
            // InternalAlloyLanguage.g:9931:1: ( ruleALSTerm )
            // InternalAlloyLanguage.g:9932:1: ruleALSTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSVariableDeclarationAccess().getRangeALSTermParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSVariableDeclarationAccess().getRangeALSTermParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSVariableDeclaration__RangeAssignment_2"


    // $ANTLR start "rule__ALSBasicRelationTerm__ReferredAssignment_4_1"
    // InternalAlloyLanguage.g:9941:1: rule__ALSBasicRelationTerm__ReferredAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ALSBasicRelationTerm__ReferredAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9945:1: ( ( ( RULE_ID ) ) )
            // InternalAlloyLanguage.g:9946:1: ( ( RULE_ID ) )
            {
            // InternalAlloyLanguage.g:9946:1: ( ( RULE_ID ) )
            // InternalAlloyLanguage.g:9947:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getReferredALSRelationDeclarationCrossReference_4_1_0()); 
            }
            // InternalAlloyLanguage.g:9948:1: ( RULE_ID )
            // InternalAlloyLanguage.g:9949:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getReferredALSRelationDeclarationIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getReferredALSRelationDeclarationIDTerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getReferredALSRelationDeclarationCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__ReferredAssignment_4_1"


    // $ANTLR start "rule__ALSBasicRelationTerm__ValueAssignment_5_1"
    // InternalAlloyLanguage.g:9960:1: rule__ALSBasicRelationTerm__ValueAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__ALSBasicRelationTerm__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9964:1: ( ( RULE_INT ) )
            // InternalAlloyLanguage.g:9965:1: ( RULE_INT )
            {
            // InternalAlloyLanguage.g:9965:1: ( RULE_INT )
            // InternalAlloyLanguage.g:9966:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSBasicRelationTermAccess().getValueINTTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSBasicRelationTermAccess().getValueINTTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSBasicRelationTerm__ValueAssignment_5_1"


    // $ANTLR start "rule__ALSRunCommand__TypeScopesAssignment_4_1"
    // InternalAlloyLanguage.g:9975:1: rule__ALSRunCommand__TypeScopesAssignment_4_1 : ( ruleALSTypeScope ) ;
    public final void rule__ALSRunCommand__TypeScopesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9979:1: ( ( ruleALSTypeScope ) )
            // InternalAlloyLanguage.g:9980:1: ( ruleALSTypeScope )
            {
            // InternalAlloyLanguage.g:9980:1: ( ruleALSTypeScope )
            // InternalAlloyLanguage.g:9981:1: ruleALSTypeScope
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRunCommandAccess().getTypeScopesALSTypeScopeParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSTypeScope();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRunCommandAccess().getTypeScopesALSTypeScopeParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__TypeScopesAssignment_4_1"


    // $ANTLR start "rule__ALSRunCommand__TypeScopesAssignment_4_2_1"
    // InternalAlloyLanguage.g:9990:1: rule__ALSRunCommand__TypeScopesAssignment_4_2_1 : ( ruleALSTypeScope ) ;
    public final void rule__ALSRunCommand__TypeScopesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:9994:1: ( ( ruleALSTypeScope ) )
            // InternalAlloyLanguage.g:9995:1: ( ruleALSTypeScope )
            {
            // InternalAlloyLanguage.g:9995:1: ( ruleALSTypeScope )
            // InternalAlloyLanguage.g:9996:1: ruleALSTypeScope
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSRunCommandAccess().getTypeScopesALSTypeScopeParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleALSTypeScope();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSRunCommandAccess().getTypeScopesALSTypeScopeParserRuleCall_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSRunCommand__TypeScopesAssignment_4_2_1"


    // $ANTLR start "rule__ALSSigScope__ExactlyAssignment_0"
    // InternalAlloyLanguage.g:10005:1: rule__ALSSigScope__ExactlyAssignment_0 : ( ( 'exactly' ) ) ;
    public final void rule__ALSSigScope__ExactlyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:10009:1: ( ( ( 'exactly' ) ) )
            // InternalAlloyLanguage.g:10010:1: ( ( 'exactly' ) )
            {
            // InternalAlloyLanguage.g:10010:1: ( ( 'exactly' ) )
            // InternalAlloyLanguage.g:10011:1: ( 'exactly' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSigScopeAccess().getExactlyExactlyKeyword_0_0()); 
            }
            // InternalAlloyLanguage.g:10012:1: ( 'exactly' )
            // InternalAlloyLanguage.g:10013:1: 'exactly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSigScopeAccess().getExactlyExactlyKeyword_0_0()); 
            }
            match(input,75,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSigScopeAccess().getExactlyExactlyKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSigScopeAccess().getExactlyExactlyKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSigScope__ExactlyAssignment_0"


    // $ANTLR start "rule__ALSSigScope__NumberAssignment_1"
    // InternalAlloyLanguage.g:10028:1: rule__ALSSigScope__NumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__ALSSigScope__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:10032:1: ( ( RULE_INT ) )
            // InternalAlloyLanguage.g:10033:1: ( RULE_INT )
            {
            // InternalAlloyLanguage.g:10033:1: ( RULE_INT )
            // InternalAlloyLanguage.g:10034:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSigScopeAccess().getNumberINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSigScopeAccess().getNumberINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSigScope__NumberAssignment_1"


    // $ANTLR start "rule__ALSSigScope__TypeAssignment_2"
    // InternalAlloyLanguage.g:10043:1: rule__ALSSigScope__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ALSSigScope__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:10047:1: ( ( ( RULE_ID ) ) )
            // InternalAlloyLanguage.g:10048:1: ( ( RULE_ID ) )
            {
            // InternalAlloyLanguage.g:10048:1: ( ( RULE_ID ) )
            // InternalAlloyLanguage.g:10049:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSigScopeAccess().getTypeALSSignatureDeclarationCrossReference_2_0()); 
            }
            // InternalAlloyLanguage.g:10050:1: ( RULE_ID )
            // InternalAlloyLanguage.g:10051:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSSigScopeAccess().getTypeALSSignatureDeclarationIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSigScopeAccess().getTypeALSSignatureDeclarationIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSSigScopeAccess().getTypeALSSignatureDeclarationCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSSigScope__TypeAssignment_2"


    // $ANTLR start "rule__ALSIntScope__NumberAssignment_0"
    // InternalAlloyLanguage.g:10062:1: rule__ALSIntScope__NumberAssignment_0 : ( RULE_INT ) ;
    public final void rule__ALSIntScope__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAlloyLanguage.g:10066:1: ( ( RULE_INT ) )
            // InternalAlloyLanguage.g:10067:1: ( RULE_INT )
            {
            // InternalAlloyLanguage.g:10067:1: ( RULE_INT )
            // InternalAlloyLanguage.g:10068:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getALSIntScopeAccess().getNumberINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getALSIntScopeAccess().getNumberINTTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALSIntScope__NumberAssignment_0"

    // $ANTLR start synpred78_InternalAlloyLanguage
    public final void synpred78_InternalAlloyLanguage_fragment() throws RecognitionException {   
        // InternalAlloyLanguage.g:8769:2: ( rule__ALSSignatureBody__UnorderedGroup_0__0 )
        // InternalAlloyLanguage.g:8769:2: rule__ALSSignatureBody__UnorderedGroup_0__0
        {
        pushFollow(FOLLOW_2);
        rule__ALSSignatureBody__UnorderedGroup_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred78_InternalAlloyLanguage

    // $ANTLR start synpred79_InternalAlloyLanguage
    public final void synpred79_InternalAlloyLanguage_fragment() throws RecognitionException {   
        // InternalAlloyLanguage.g:8787:4: ( ({...}? => ( ( ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 ) ) ) ) )
        // InternalAlloyLanguage.g:8787:4: ({...}? => ( ( ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 ) ) ) )
        {
        // InternalAlloyLanguage.g:8787:4: ({...}? => ( ( ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 ) ) ) )
        // InternalAlloyLanguage.g:8788:5: {...}? => ( ( ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred79_InternalAlloyLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0)");
        }
        // InternalAlloyLanguage.g:8788:113: ( ( ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 ) ) )
        // InternalAlloyLanguage.g:8789:6: ( ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0);
        // InternalAlloyLanguage.g:8795:6: ( ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 ) )
        // InternalAlloyLanguage.g:8797:7: ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getALSSignatureBodyAccess().getMultiplicityAssignment_0_0()); 
        }
        // InternalAlloyLanguage.g:8798:7: ( rule__ALSSignatureBody__MultiplicityAssignment_0_0 )
        // InternalAlloyLanguage.g:8798:8: rule__ALSSignatureBody__MultiplicityAssignment_0_0
        {
        pushFollow(FOLLOW_2);
        rule__ALSSignatureBody__MultiplicityAssignment_0_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred79_InternalAlloyLanguage

    // $ANTLR start synpred80_InternalAlloyLanguage
    public final void synpred80_InternalAlloyLanguage_fragment() throws RecognitionException {   
        // InternalAlloyLanguage.g:8836:2: ( rule__ALSSignatureBody__UnorderedGroup_0__1 )
        // InternalAlloyLanguage.g:8836:2: rule__ALSSignatureBody__UnorderedGroup_0__1
        {
        pushFollow(FOLLOW_2);
        rule__ALSSignatureBody__UnorderedGroup_0__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred80_InternalAlloyLanguage

    // Delegated rules

    public final boolean synpred80_InternalAlloyLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_InternalAlloyLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalAlloyLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalAlloyLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalAlloyLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalAlloyLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\10\uffff\1\12\2\uffff";
    static final String dfa_3s = "\1\4\7\uffff\1\13\2\uffff";
    static final String dfa_4s = "\1\105\7\uffff\1\106\2\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\10\1\12\15\uffff\2\1\6\uffff\5\11\31\uffff\1\6\2\uffff\1\2\1\3\1\4\1\5\1\7\5\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\10\12\2\uffff\6\12\6\uffff\3\12\2\uffff\2\12\2\uffff\1\11\1\12\2\uffff\16\12\12\uffff\1\12",
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

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1291:1: rule__ALSPreficed__Alternatives : ( ( ( rule__ALSPreficed__Group_0__0 ) ) | ( ( rule__ALSPreficed__Group_1__0 ) ) | ( ( rule__ALSPreficed__Group_2__0 ) ) | ( ( rule__ALSPreficed__Group_3__0 ) ) | ( ( rule__ALSPreficed__Group_4__0 ) ) | ( ( rule__ALSPreficed__Group_5__0 ) ) | ( ( rule__ALSPreficed__Group_6__0 ) ) | ( ( rule__ALSPreficed__Group_7__0 ) ) | ( ruleALSBasicRelationTerm ) );";
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\10\uffff\1\11\1\uffff";
    static final String dfa_10s = "\7\4\1\uffff\1\13\1\uffff";
    static final String dfa_11s = "\1\105\6\112\1\uffff\1\73\1\uffff";
    static final String dfa_12s = "\7\uffff\1\2\1\uffff\1\1";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\2\7\15\uffff\2\7\1\1\1\2\1\3\1\4\1\5\1\6\5\7\31\uffff\1\7\2\uffff\12\7",
            "\1\10\1\11\15\uffff\15\11\31\uffff\1\11\2\uffff\12\11\4\uffff\1\7",
            "\1\10\1\11\15\uffff\15\11\31\uffff\1\11\2\uffff\12\11\4\uffff\1\7",
            "\1\10\1\11\15\uffff\15\11\31\uffff\1\11\2\uffff\12\11\4\uffff\1\7",
            "\1\10\1\11\15\uffff\15\11\31\uffff\1\11\2\uffff\12\11\4\uffff\1\7",
            "\1\10\1\11\15\uffff\15\11\31\uffff\1\11\2\uffff\12\11\4\uffff\1\7",
            "\1\10\1\11\15\uffff\15\11\31\uffff\1\11\2\uffff\12\11\4\uffff\1\7",
            "",
            "\10\11\2\uffff\6\11\7\uffff\2\11\2\uffff\2\11\1\7\1\uffff\1\11\4\uffff\15\11",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2637:1: ( rule__ALSFieldDeclaration__MultiplicityAssignment_2 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000320107E00002L,0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000006A00000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0xF2000000FFF80030L,0x000000000000003FL});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000080800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000320107E00000L,0x0000000000000200L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000007E00000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x001F804000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000007E00000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00000000F8000010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000800L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000007E00002L,0x0000000000000200L});

}
