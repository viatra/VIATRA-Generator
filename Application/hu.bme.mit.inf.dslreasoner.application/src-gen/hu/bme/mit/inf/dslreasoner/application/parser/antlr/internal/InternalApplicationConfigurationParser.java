package hu.bme.mit.inf.dslreasoner.application.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.inf.dslreasoner.application.services.ApplicationConfigurationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalApplicationConfigurationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'import'", "'epackage'", "'viatra'", "'file'", "'='", "'{'", "','", "'}'", "'package'", "'excluding'", "'::'", "'metamodel'", "'folder'", "'partial-model'", "'patterns'", "'config'", "'<'", "'<='", "'#'", "'['", "']'", "'Object'", "'int'", "'real'", "'string'", "'scope'", "'generate'", "'number'", "'runs'", "'solver'", "'output'", "'debug'", "'log'", "'statistics'", "'SMTSolver'", "'AlloySolver'", "'ViatraSolver'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
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


        public InternalApplicationConfigurationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalApplicationConfigurationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalApplicationConfigurationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalApplicationConfiguration.g"; }



     	private ApplicationConfigurationGrammarAccess grammarAccess;

        public InternalApplicationConfigurationParser(TokenStream input, ApplicationConfigurationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ConfigurationScript";
       	}

       	@Override
       	protected ApplicationConfigurationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConfigurationScript"
    // InternalApplicationConfiguration.g:65:1: entryRuleConfigurationScript returns [EObject current=null] : iv_ruleConfigurationScript= ruleConfigurationScript EOF ;
    public final EObject entryRuleConfigurationScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationScript = null;


        try {
            // InternalApplicationConfiguration.g:65:60: (iv_ruleConfigurationScript= ruleConfigurationScript EOF )
            // InternalApplicationConfiguration.g:66:2: iv_ruleConfigurationScript= ruleConfigurationScript EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationScriptRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationScript=ruleConfigurationScript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationScript; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigurationScript"


    // $ANTLR start "ruleConfigurationScript"
    // InternalApplicationConfiguration.g:72:1: ruleConfigurationScript returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_commands_1_0= ruleCommand ) )* ) ;
    public final EObject ruleConfigurationScript() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_commands_1_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:78:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_commands_1_0= ruleCommand ) )* ) )
            // InternalApplicationConfiguration.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_commands_1_0= ruleCommand ) )* )
            {
            // InternalApplicationConfiguration.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_commands_1_0= ruleCommand ) )* )
            // InternalApplicationConfiguration.g:80:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_commands_1_0= ruleCommand ) )*
            {
            // InternalApplicationConfiguration.g:80:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:81:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalApplicationConfiguration.g:81:4: (lv_imports_0_0= ruleImport )
            	    // InternalApplicationConfiguration.g:82:5: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConfigurationScriptAccess().getImportsImportParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConfigurationScriptRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_0_0,
            	      						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalApplicationConfiguration.g:99:3: ( (lv_commands_1_0= ruleCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15||LA2_0==23||(LA2_0>=25 && LA2_0<=27)||(LA2_0>=37 && LA2_0<=38)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:100:4: (lv_commands_1_0= ruleCommand )
            	    {
            	    // InternalApplicationConfiguration.g:100:4: (lv_commands_1_0= ruleCommand )
            	    // InternalApplicationConfiguration.g:101:5: lv_commands_1_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConfigurationScriptAccess().getCommandsCommandParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_commands_1_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConfigurationScriptRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_1_0,
            	      						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.Command");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigurationScript"


    // $ANTLR start "entryRuleCommand"
    // InternalApplicationConfiguration.g:122:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalApplicationConfiguration.g:122:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalApplicationConfiguration.g:123:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalApplicationConfiguration.g:129:1: ruleCommand returns [EObject current=null] : (this_Declaration_0= ruleDeclaration | this_Task_1= ruleTask ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Declaration_0 = null;

        EObject this_Task_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:135:2: ( (this_Declaration_0= ruleDeclaration | this_Task_1= ruleTask ) )
            // InternalApplicationConfiguration.g:136:2: (this_Declaration_0= ruleDeclaration | this_Task_1= ruleTask )
            {
            // InternalApplicationConfiguration.g:136:2: (this_Declaration_0= ruleDeclaration | this_Task_1= ruleTask )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15||LA3_0==23||(LA3_0>=25 && LA3_0<=27)||LA3_0==37) ) {
                alt3=1;
            }
            else if ( (LA3_0==38) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalApplicationConfiguration.g:137:3: this_Declaration_0= ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Declaration_0=ruleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Declaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:146:3: this_Task_1= ruleTask
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getTaskParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Task_1=ruleTask();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Task_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalApplicationConfiguration.g:158:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalApplicationConfiguration.g:158:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalApplicationConfiguration.g:159:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalApplicationConfiguration.g:165:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:171:2: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalApplicationConfiguration.g:172:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalApplicationConfiguration.g:172:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalApplicationConfiguration.g:173:3: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalApplicationConfiguration.g:180:3: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) && (synpred1_InternalApplicationConfiguration())) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:181:4: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalApplicationConfiguration.g:181:4: ( ( '.' )=>kw= '.' )
            	    // InternalApplicationConfiguration.g:182:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // InternalApplicationConfiguration.g:201:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalApplicationConfiguration.g:201:47: (iv_ruleImport= ruleImport EOF )
            // InternalApplicationConfiguration.g:202:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalApplicationConfiguration.g:208:1: ruleImport returns [EObject current=null] : (this_EPackageImport_0= ruleEPackageImport | this_ViatraImport_1= ruleViatraImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_EPackageImport_0 = null;

        EObject this_ViatraImport_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:214:2: ( (this_EPackageImport_0= ruleEPackageImport | this_ViatraImport_1= ruleViatraImport ) )
            // InternalApplicationConfiguration.g:215:2: (this_EPackageImport_0= ruleEPackageImport | this_ViatraImport_1= ruleViatraImport )
            {
            // InternalApplicationConfiguration.g:215:2: (this_EPackageImport_0= ruleEPackageImport | this_ViatraImport_1= ruleViatraImport )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==13) ) {
                    alt5=1;
                }
                else if ( (LA5_1==14) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalApplicationConfiguration.g:216:3: this_EPackageImport_0= ruleEPackageImport
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImportAccess().getEPackageImportParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EPackageImport_0=ruleEPackageImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EPackageImport_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:225:3: this_ViatraImport_1= ruleViatraImport
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImportAccess().getViatraImportParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ViatraImport_1=ruleViatraImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ViatraImport_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleEPackageImport"
    // InternalApplicationConfiguration.g:237:1: entryRuleEPackageImport returns [EObject current=null] : iv_ruleEPackageImport= ruleEPackageImport EOF ;
    public final EObject entryRuleEPackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPackageImport = null;


        try {
            // InternalApplicationConfiguration.g:237:55: (iv_ruleEPackageImport= ruleEPackageImport EOF )
            // InternalApplicationConfiguration.g:238:2: iv_ruleEPackageImport= ruleEPackageImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPackageImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEPackageImport=ruleEPackageImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPackageImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPackageImport"


    // $ANTLR start "ruleEPackageImport"
    // InternalApplicationConfiguration.g:244:1: ruleEPackageImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= 'epackage' ( (otherlv_2= RULE_STRING ) ) ) ;
    public final EObject ruleEPackageImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:250:2: ( (otherlv_0= 'import' otherlv_1= 'epackage' ( (otherlv_2= RULE_STRING ) ) ) )
            // InternalApplicationConfiguration.g:251:2: (otherlv_0= 'import' otherlv_1= 'epackage' ( (otherlv_2= RULE_STRING ) ) )
            {
            // InternalApplicationConfiguration.g:251:2: (otherlv_0= 'import' otherlv_1= 'epackage' ( (otherlv_2= RULE_STRING ) ) )
            // InternalApplicationConfiguration.g:252:3: otherlv_0= 'import' otherlv_1= 'epackage' ( (otherlv_2= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEPackageImportAccess().getImportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEPackageImportAccess().getEpackageKeyword_1());
              		
            }
            // InternalApplicationConfiguration.g:260:3: ( (otherlv_2= RULE_STRING ) )
            // InternalApplicationConfiguration.g:261:4: (otherlv_2= RULE_STRING )
            {
            // InternalApplicationConfiguration.g:261:4: (otherlv_2= RULE_STRING )
            // InternalApplicationConfiguration.g:262:5: otherlv_2= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEPackageImportRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getEPackageImportAccess().getImportedPackageEPackageCrossReference_2_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPackageImport"


    // $ANTLR start "entryRuleViatraImport"
    // InternalApplicationConfiguration.g:277:1: entryRuleViatraImport returns [EObject current=null] : iv_ruleViatraImport= ruleViatraImport EOF ;
    public final EObject entryRuleViatraImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViatraImport = null;


        try {
            // InternalApplicationConfiguration.g:277:53: (iv_ruleViatraImport= ruleViatraImport EOF )
            // InternalApplicationConfiguration.g:278:2: iv_ruleViatraImport= ruleViatraImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViatraImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleViatraImport=ruleViatraImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleViatraImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViatraImport"


    // $ANTLR start "ruleViatraImport"
    // InternalApplicationConfiguration.g:284:1: ruleViatraImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= 'viatra' ( (otherlv_2= RULE_STRING ) ) ) ;
    public final EObject ruleViatraImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:290:2: ( (otherlv_0= 'import' otherlv_1= 'viatra' ( (otherlv_2= RULE_STRING ) ) ) )
            // InternalApplicationConfiguration.g:291:2: (otherlv_0= 'import' otherlv_1= 'viatra' ( (otherlv_2= RULE_STRING ) ) )
            {
            // InternalApplicationConfiguration.g:291:2: (otherlv_0= 'import' otherlv_1= 'viatra' ( (otherlv_2= RULE_STRING ) ) )
            // InternalApplicationConfiguration.g:292:3: otherlv_0= 'import' otherlv_1= 'viatra' ( (otherlv_2= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getViatraImportAccess().getImportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getViatraImportAccess().getViatraKeyword_1());
              		
            }
            // InternalApplicationConfiguration.g:300:3: ( (otherlv_2= RULE_STRING ) )
            // InternalApplicationConfiguration.g:301:4: (otherlv_2= RULE_STRING )
            {
            // InternalApplicationConfiguration.g:301:4: (otherlv_2= RULE_STRING )
            // InternalApplicationConfiguration.g:302:5: otherlv_2= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getViatraImportRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getViatraImportAccess().getImportedViatraPatternModelCrossReference_2_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViatraImport"


    // $ANTLR start "entryRuleDeclaration"
    // InternalApplicationConfiguration.g:317:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:317:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalApplicationConfiguration.g:318:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalApplicationConfiguration.g:324:1: ruleDeclaration returns [EObject current=null] : (this_FileDeclaration_0= ruleFileDeclaration | this_MetamodelDeclaration_1= ruleMetamodelDeclaration | this_PartialModelDeclaration_2= rulePartialModelDeclaration | this_GraphPatternDeclaration_3= ruleGraphPatternDeclaration | this_ConfigDeclaration_4= ruleConfigDeclaration | this_ScopeDeclaration_5= ruleScopeDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_FileDeclaration_0 = null;

        EObject this_MetamodelDeclaration_1 = null;

        EObject this_PartialModelDeclaration_2 = null;

        EObject this_GraphPatternDeclaration_3 = null;

        EObject this_ConfigDeclaration_4 = null;

        EObject this_ScopeDeclaration_5 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:330:2: ( (this_FileDeclaration_0= ruleFileDeclaration | this_MetamodelDeclaration_1= ruleMetamodelDeclaration | this_PartialModelDeclaration_2= rulePartialModelDeclaration | this_GraphPatternDeclaration_3= ruleGraphPatternDeclaration | this_ConfigDeclaration_4= ruleConfigDeclaration | this_ScopeDeclaration_5= ruleScopeDeclaration ) )
            // InternalApplicationConfiguration.g:331:2: (this_FileDeclaration_0= ruleFileDeclaration | this_MetamodelDeclaration_1= ruleMetamodelDeclaration | this_PartialModelDeclaration_2= rulePartialModelDeclaration | this_GraphPatternDeclaration_3= ruleGraphPatternDeclaration | this_ConfigDeclaration_4= ruleConfigDeclaration | this_ScopeDeclaration_5= ruleScopeDeclaration )
            {
            // InternalApplicationConfiguration.g:331:2: (this_FileDeclaration_0= ruleFileDeclaration | this_MetamodelDeclaration_1= ruleMetamodelDeclaration | this_PartialModelDeclaration_2= rulePartialModelDeclaration | this_GraphPatternDeclaration_3= ruleGraphPatternDeclaration | this_ConfigDeclaration_4= ruleConfigDeclaration | this_ScopeDeclaration_5= ruleScopeDeclaration )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
                }
                break;
            case 27:
                {
                alt6=5;
                }
                break;
            case 37:
                {
                alt6=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalApplicationConfiguration.g:332:3: this_FileDeclaration_0= ruleFileDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarationAccess().getFileDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FileDeclaration_0=ruleFileDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FileDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:341:3: this_MetamodelDeclaration_1= ruleMetamodelDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarationAccess().getMetamodelDeclarationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MetamodelDeclaration_1=ruleMetamodelDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MetamodelDeclaration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalApplicationConfiguration.g:350:3: this_PartialModelDeclaration_2= rulePartialModelDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarationAccess().getPartialModelDeclarationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PartialModelDeclaration_2=rulePartialModelDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PartialModelDeclaration_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalApplicationConfiguration.g:359:3: this_GraphPatternDeclaration_3= ruleGraphPatternDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarationAccess().getGraphPatternDeclarationParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GraphPatternDeclaration_3=ruleGraphPatternDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GraphPatternDeclaration_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalApplicationConfiguration.g:368:3: this_ConfigDeclaration_4= ruleConfigDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarationAccess().getConfigDeclarationParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigDeclaration_4=ruleConfigDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConfigDeclaration_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalApplicationConfiguration.g:377:3: this_ScopeDeclaration_5= ruleScopeDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarationAccess().getScopeDeclarationParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ScopeDeclaration_5=ruleScopeDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ScopeDeclaration_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleFileSpecification"
    // InternalApplicationConfiguration.g:389:1: entryRuleFileSpecification returns [EObject current=null] : iv_ruleFileSpecification= ruleFileSpecification EOF ;
    public final EObject entryRuleFileSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileSpecification = null;


        try {
            // InternalApplicationConfiguration.g:389:58: (iv_ruleFileSpecification= ruleFileSpecification EOF )
            // InternalApplicationConfiguration.g:390:2: iv_ruleFileSpecification= ruleFileSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFileSpecification=ruleFileSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFileSpecification"


    // $ANTLR start "ruleFileSpecification"
    // InternalApplicationConfiguration.g:396:1: ruleFileSpecification returns [EObject current=null] : ( (lv_path_0_0= RULE_STRING ) ) ;
    public final EObject ruleFileSpecification() throws RecognitionException {
        EObject current = null;

        Token lv_path_0_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:402:2: ( ( (lv_path_0_0= RULE_STRING ) ) )
            // InternalApplicationConfiguration.g:403:2: ( (lv_path_0_0= RULE_STRING ) )
            {
            // InternalApplicationConfiguration.g:403:2: ( (lv_path_0_0= RULE_STRING ) )
            // InternalApplicationConfiguration.g:404:3: (lv_path_0_0= RULE_STRING )
            {
            // InternalApplicationConfiguration.g:404:3: (lv_path_0_0= RULE_STRING )
            // InternalApplicationConfiguration.g:405:4: lv_path_0_0= RULE_STRING
            {
            lv_path_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_path_0_0, grammarAccess.getFileSpecificationAccess().getPathSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getFileSpecificationRule());
              				}
              				setWithLastConsumed(
              					current,
              					"path",
              					lv_path_0_0,
              					"org.eclipse.xtext.common.Terminals.STRING");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileSpecification"


    // $ANTLR start "entryRuleFileDeclaration"
    // InternalApplicationConfiguration.g:424:1: entryRuleFileDeclaration returns [EObject current=null] : iv_ruleFileDeclaration= ruleFileDeclaration EOF ;
    public final EObject entryRuleFileDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:424:56: (iv_ruleFileDeclaration= ruleFileDeclaration EOF )
            // InternalApplicationConfiguration.g:425:2: iv_ruleFileDeclaration= ruleFileDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFileDeclaration=ruleFileDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFileDeclaration"


    // $ANTLR start "ruleFileDeclaration"
    // InternalApplicationConfiguration.g:431:1: ruleFileDeclaration returns [EObject current=null] : (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_specification_3_0= ruleFileSpecification ) ) ) ;
    public final EObject ruleFileDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_specification_3_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:437:2: ( (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_specification_3_0= ruleFileSpecification ) ) ) )
            // InternalApplicationConfiguration.g:438:2: (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_specification_3_0= ruleFileSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:438:2: (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_specification_3_0= ruleFileSpecification ) ) )
            // InternalApplicationConfiguration.g:439:3: otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_specification_3_0= ruleFileSpecification ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFileDeclarationAccess().getFileKeyword_0());
              		
            }
            // InternalApplicationConfiguration.g:443:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:444:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:444:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:445:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFileDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFileDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFileDeclarationAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalApplicationConfiguration.g:465:3: ( (lv_specification_3_0= ruleFileSpecification ) )
            // InternalApplicationConfiguration.g:466:4: (lv_specification_3_0= ruleFileSpecification )
            {
            // InternalApplicationConfiguration.g:466:4: (lv_specification_3_0= ruleFileSpecification )
            // InternalApplicationConfiguration.g:467:5: lv_specification_3_0= ruleFileSpecification
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFileDeclarationAccess().getSpecificationFileSpecificationParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_specification_3_0=ruleFileSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFileDeclarationRule());
              					}
              					set(
              						current,
              						"specification",
              						lv_specification_3_0,
              						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.FileSpecification");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileDeclaration"


    // $ANTLR start "entryRuleFileReference"
    // InternalApplicationConfiguration.g:488:1: entryRuleFileReference returns [EObject current=null] : iv_ruleFileReference= ruleFileReference EOF ;
    public final EObject entryRuleFileReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileReference = null;


        try {
            // InternalApplicationConfiguration.g:488:54: (iv_ruleFileReference= ruleFileReference EOF )
            // InternalApplicationConfiguration.g:489:2: iv_ruleFileReference= ruleFileReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFileReference=ruleFileReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFileReference"


    // $ANTLR start "ruleFileReference"
    // InternalApplicationConfiguration.g:495:1: ruleFileReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleFileReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:501:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:502:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:502:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:503:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:503:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:504:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getFileReferenceRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getFileReferenceAccess().getReferredFileDeclarationCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileReference"


    // $ANTLR start "entryRuleFile"
    // InternalApplicationConfiguration.g:518:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalApplicationConfiguration.g:518:45: (iv_ruleFile= ruleFile EOF )
            // InternalApplicationConfiguration.g:519:2: iv_ruleFile= ruleFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalApplicationConfiguration.g:525:1: ruleFile returns [EObject current=null] : (this_FileSpecification_0= ruleFileSpecification | this_FileReference_1= ruleFileReference ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject this_FileSpecification_0 = null;

        EObject this_FileReference_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:531:2: ( (this_FileSpecification_0= ruleFileSpecification | this_FileReference_1= ruleFileReference ) )
            // InternalApplicationConfiguration.g:532:2: (this_FileSpecification_0= ruleFileSpecification | this_FileReference_1= ruleFileReference )
            {
            // InternalApplicationConfiguration.g:532:2: (this_FileSpecification_0= ruleFileSpecification | this_FileReference_1= ruleFileReference )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalApplicationConfiguration.g:533:3: this_FileSpecification_0= ruleFileSpecification
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFileAccess().getFileSpecificationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FileSpecification_0=ruleFileSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FileSpecification_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:542:3: this_FileReference_1= ruleFileReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFileAccess().getFileReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FileReference_1=ruleFileReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FileReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleMetamodelSpecification"
    // InternalApplicationConfiguration.g:554:1: entryRuleMetamodelSpecification returns [EObject current=null] : iv_ruleMetamodelSpecification= ruleMetamodelSpecification EOF ;
    public final EObject entryRuleMetamodelSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelSpecification = null;


        try {
            // InternalApplicationConfiguration.g:554:63: (iv_ruleMetamodelSpecification= ruleMetamodelSpecification EOF )
            // InternalApplicationConfiguration.g:555:2: iv_ruleMetamodelSpecification= ruleMetamodelSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetamodelSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetamodelSpecification=ruleMetamodelSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetamodelSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetamodelSpecification"


    // $ANTLR start "ruleMetamodelSpecification"
    // InternalApplicationConfiguration.g:561:1: ruleMetamodelSpecification returns [EObject current=null] : (otherlv_0= '{' ( (lv_entries_1_0= ruleMetamodelEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleMetamodelSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:567:2: ( (otherlv_0= '{' ( (lv_entries_1_0= ruleMetamodelEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )* otherlv_4= '}' ) )
            // InternalApplicationConfiguration.g:568:2: (otherlv_0= '{' ( (lv_entries_1_0= ruleMetamodelEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )* otherlv_4= '}' )
            {
            // InternalApplicationConfiguration.g:568:2: (otherlv_0= '{' ( (lv_entries_1_0= ruleMetamodelEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )* otherlv_4= '}' )
            // InternalApplicationConfiguration.g:569:3: otherlv_0= '{' ( (lv_entries_1_0= ruleMetamodelEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMetamodelSpecificationAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalApplicationConfiguration.g:573:3: ( (lv_entries_1_0= ruleMetamodelEntry ) )
            // InternalApplicationConfiguration.g:574:4: (lv_entries_1_0= ruleMetamodelEntry )
            {
            // InternalApplicationConfiguration.g:574:4: (lv_entries_1_0= ruleMetamodelEntry )
            // InternalApplicationConfiguration.g:575:5: lv_entries_1_0= ruleMetamodelEntry
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMetamodelSpecificationAccess().getEntriesMetamodelEntryParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_entries_1_0=ruleMetamodelEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMetamodelSpecificationRule());
              					}
              					add(
              						current,
              						"entries",
              						lv_entries_1_0,
              						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.MetamodelEntry");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalApplicationConfiguration.g:592:3: (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:593:4: otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getMetamodelSpecificationAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalApplicationConfiguration.g:597:4: ( (lv_entries_3_0= ruleMetamodelEntry ) )
            	    // InternalApplicationConfiguration.g:598:5: (lv_entries_3_0= ruleMetamodelEntry )
            	    {
            	    // InternalApplicationConfiguration.g:598:5: (lv_entries_3_0= ruleMetamodelEntry )
            	    // InternalApplicationConfiguration.g:599:6: lv_entries_3_0= ruleMetamodelEntry
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMetamodelSpecificationAccess().getEntriesMetamodelEntryParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_entries_3_0=ruleMetamodelEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMetamodelSpecificationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"entries",
            	      							lv_entries_3_0,
            	      							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.MetamodelEntry");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMetamodelSpecificationAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetamodelSpecification"


    // $ANTLR start "entryRuleMetamodelEntry"
    // InternalApplicationConfiguration.g:625:1: entryRuleMetamodelEntry returns [EObject current=null] : iv_ruleMetamodelEntry= ruleMetamodelEntry EOF ;
    public final EObject entryRuleMetamodelEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelEntry = null;


        try {
            // InternalApplicationConfiguration.g:625:55: (iv_ruleMetamodelEntry= ruleMetamodelEntry EOF )
            // InternalApplicationConfiguration.g:626:2: iv_ruleMetamodelEntry= ruleMetamodelEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetamodelEntryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetamodelEntry=ruleMetamodelEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetamodelEntry; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetamodelEntry"


    // $ANTLR start "ruleMetamodelEntry"
    // InternalApplicationConfiguration.g:632:1: ruleMetamodelEntry returns [EObject current=null] : (this_MetamodelElement_0= ruleMetamodelElement | this_AllPackageEntry_1= ruleAllPackageEntry ) ;
    public final EObject ruleMetamodelEntry() throws RecognitionException {
        EObject current = null;

        EObject this_MetamodelElement_0 = null;

        EObject this_AllPackageEntry_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:638:2: ( (this_MetamodelElement_0= ruleMetamodelElement | this_AllPackageEntry_1= ruleAllPackageEntry ) )
            // InternalApplicationConfiguration.g:639:2: (this_MetamodelElement_0= ruleMetamodelElement | this_AllPackageEntry_1= ruleAllPackageEntry )
            {
            // InternalApplicationConfiguration.g:639:2: (this_MetamodelElement_0= ruleMetamodelElement | this_AllPackageEntry_1= ruleAllPackageEntry )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalApplicationConfiguration.g:640:3: this_MetamodelElement_0= ruleMetamodelElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMetamodelEntryAccess().getMetamodelElementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MetamodelElement_0=ruleMetamodelElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MetamodelElement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:649:3: this_AllPackageEntry_1= ruleAllPackageEntry
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMetamodelEntryAccess().getAllPackageEntryParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AllPackageEntry_1=ruleAllPackageEntry();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AllPackageEntry_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetamodelEntry"


    // $ANTLR start "entryRuleAllPackageEntry"
    // InternalApplicationConfiguration.g:661:1: entryRuleAllPackageEntry returns [EObject current=null] : iv_ruleAllPackageEntry= ruleAllPackageEntry EOF ;
    public final EObject entryRuleAllPackageEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllPackageEntry = null;


        try {
            // InternalApplicationConfiguration.g:661:56: (iv_ruleAllPackageEntry= ruleAllPackageEntry EOF )
            // InternalApplicationConfiguration.g:662:2: iv_ruleAllPackageEntry= ruleAllPackageEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAllPackageEntryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAllPackageEntry=ruleAllPackageEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAllPackageEntry; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllPackageEntry"


    // $ANTLR start "ruleAllPackageEntry"
    // InternalApplicationConfiguration.g:668:1: ruleAllPackageEntry returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleAllPackageEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_exclusion_4_0 = null;

        EObject lv_exclusion_6_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:674:2: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )? ) )
            // InternalApplicationConfiguration.g:675:2: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )? )
            {
            // InternalApplicationConfiguration.g:675:2: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )? )
            // InternalApplicationConfiguration.g:676:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAllPackageEntryAccess().getPackageKeyword_0());
              		
            }
            // InternalApplicationConfiguration.g:680:3: ( ( ruleQualifiedName ) )
            // InternalApplicationConfiguration.g:681:4: ( ruleQualifiedName )
            {
            // InternalApplicationConfiguration.g:681:4: ( ruleQualifiedName )
            // InternalApplicationConfiguration.g:682:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAllPackageEntryRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAllPackageEntryAccess().getPackageEPackageCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalApplicationConfiguration.g:696:3: (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalApplicationConfiguration.g:697:4: otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAllPackageEntryAccess().getExcludingKeyword_2_0());
                      			
                    }
                    otherlv_3=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAllPackageEntryAccess().getLeftCurlyBracketKeyword_2_1());
                      			
                    }
                    // InternalApplicationConfiguration.g:705:4: ( (lv_exclusion_4_0= ruleMetamodelElement ) )
                    // InternalApplicationConfiguration.g:706:5: (lv_exclusion_4_0= ruleMetamodelElement )
                    {
                    // InternalApplicationConfiguration.g:706:5: (lv_exclusion_4_0= ruleMetamodelElement )
                    // InternalApplicationConfiguration.g:707:6: lv_exclusion_4_0= ruleMetamodelElement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAllPackageEntryAccess().getExclusionMetamodelElementParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_exclusion_4_0=ruleMetamodelElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAllPackageEntryRule());
                      						}
                      						add(
                      							current,
                      							"exclusion",
                      							lv_exclusion_4_0,
                      							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.MetamodelElement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalApplicationConfiguration.g:724:4: (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==18) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:725:5: otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getAllPackageEntryAccess().getCommaKeyword_2_3_0());
                    	      				
                    	    }
                    	    // InternalApplicationConfiguration.g:729:5: ( (lv_exclusion_6_0= ruleMetamodelElement ) )
                    	    // InternalApplicationConfiguration.g:730:6: (lv_exclusion_6_0= ruleMetamodelElement )
                    	    {
                    	    // InternalApplicationConfiguration.g:730:6: (lv_exclusion_6_0= ruleMetamodelElement )
                    	    // InternalApplicationConfiguration.g:731:7: lv_exclusion_6_0= ruleMetamodelElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAllPackageEntryAccess().getExclusionMetamodelElementParserRuleCall_2_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_exclusion_6_0=ruleMetamodelElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAllPackageEntryRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"exclusion",
                    	      								lv_exclusion_6_0,
                    	      								"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.MetamodelElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getAllPackageEntryAccess().getRightCurlyBracketKeyword_2_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllPackageEntry"


    // $ANTLR start "entryRuleMetamodelElement"
    // InternalApplicationConfiguration.g:758:1: entryRuleMetamodelElement returns [EObject current=null] : iv_ruleMetamodelElement= ruleMetamodelElement EOF ;
    public final EObject entryRuleMetamodelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelElement = null;


        try {
            // InternalApplicationConfiguration.g:758:57: (iv_ruleMetamodelElement= ruleMetamodelElement EOF )
            // InternalApplicationConfiguration.g:759:2: iv_ruleMetamodelElement= ruleMetamodelElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetamodelElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetamodelElement=ruleMetamodelElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetamodelElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetamodelElement"


    // $ANTLR start "ruleMetamodelElement"
    // InternalApplicationConfiguration.g:765:1: ruleMetamodelElement returns [EObject current=null] : ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleMetamodelElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:771:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalApplicationConfiguration.g:772:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalApplicationConfiguration.g:772:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? )
            // InternalApplicationConfiguration.g:773:3: ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalApplicationConfiguration.g:773:3: ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==11) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==RULE_ID) ) {
                        int LA12_5 = input.LA(4);

                        if ( (LA12_5==11||LA12_5==22) ) {
                            alt12=1;
                        }
                    }
                }
                else if ( (LA12_1==22) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalApplicationConfiguration.g:774:4: ( ( ruleQualifiedName ) ) otherlv_1= '::'
                    {
                    // InternalApplicationConfiguration.g:774:4: ( ( ruleQualifiedName ) )
                    // InternalApplicationConfiguration.g:775:5: ( ruleQualifiedName )
                    {
                    // InternalApplicationConfiguration.g:775:5: ( ruleQualifiedName )
                    // InternalApplicationConfiguration.g:776:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMetamodelElementRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMetamodelElementAccess().getPackageEPackageCrossReference_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMetamodelElementAccess().getColonColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalApplicationConfiguration.g:795:3: ( (otherlv_2= RULE_ID ) )
            // InternalApplicationConfiguration.g:796:4: (otherlv_2= RULE_ID )
            {
            // InternalApplicationConfiguration.g:796:4: (otherlv_2= RULE_ID )
            // InternalApplicationConfiguration.g:797:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMetamodelElementRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getMetamodelElementAccess().getClassifierEClassifierCrossReference_1_0());
              				
            }

            }


            }

            // InternalApplicationConfiguration.g:808:3: (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==11) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalApplicationConfiguration.g:809:4: otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMetamodelElementAccess().getFullStopKeyword_2_0());
                      			
                    }
                    // InternalApplicationConfiguration.g:813:4: ( (otherlv_4= RULE_ID ) )
                    // InternalApplicationConfiguration.g:814:5: (otherlv_4= RULE_ID )
                    {
                    // InternalApplicationConfiguration.g:814:5: (otherlv_4= RULE_ID )
                    // InternalApplicationConfiguration.g:815:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMetamodelElementRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getMetamodelElementAccess().getFeatureENamedElementCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetamodelElement"


    // $ANTLR start "entryRuleMetamodelDeclaration"
    // InternalApplicationConfiguration.g:831:1: entryRuleMetamodelDeclaration returns [EObject current=null] : iv_ruleMetamodelDeclaration= ruleMetamodelDeclaration EOF ;
    public final EObject entryRuleMetamodelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:831:61: (iv_ruleMetamodelDeclaration= ruleMetamodelDeclaration EOF )
            // InternalApplicationConfiguration.g:832:2: iv_ruleMetamodelDeclaration= ruleMetamodelDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetamodelDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetamodelDeclaration=ruleMetamodelDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetamodelDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetamodelDeclaration"


    // $ANTLR start "ruleMetamodelDeclaration"
    // InternalApplicationConfiguration.g:838:1: ruleMetamodelDeclaration returns [EObject current=null] : (otherlv_0= 'metamodel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleMetamodelSpecification ) ) ) ;
    public final EObject ruleMetamodelDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_specification_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:844:2: ( (otherlv_0= 'metamodel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleMetamodelSpecification ) ) ) )
            // InternalApplicationConfiguration.g:845:2: (otherlv_0= 'metamodel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleMetamodelSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:845:2: (otherlv_0= 'metamodel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleMetamodelSpecification ) ) )
            // InternalApplicationConfiguration.g:846:3: otherlv_0= 'metamodel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleMetamodelSpecification ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMetamodelDeclarationAccess().getMetamodelKeyword_0());
              		
            }
            // InternalApplicationConfiguration.g:850:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:851:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:851:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:852:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMetamodelDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMetamodelDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalApplicationConfiguration.g:868:3: ( (lv_specification_2_0= ruleMetamodelSpecification ) )
            // InternalApplicationConfiguration.g:869:4: (lv_specification_2_0= ruleMetamodelSpecification )
            {
            // InternalApplicationConfiguration.g:869:4: (lv_specification_2_0= ruleMetamodelSpecification )
            // InternalApplicationConfiguration.g:870:5: lv_specification_2_0= ruleMetamodelSpecification
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMetamodelDeclarationAccess().getSpecificationMetamodelSpecificationParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_specification_2_0=ruleMetamodelSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMetamodelDeclarationRule());
              					}
              					set(
              						current,
              						"specification",
              						lv_specification_2_0,
              						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.MetamodelSpecification");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetamodelDeclaration"


    // $ANTLR start "entryRuleMetamodelReference"
    // InternalApplicationConfiguration.g:891:1: entryRuleMetamodelReference returns [EObject current=null] : iv_ruleMetamodelReference= ruleMetamodelReference EOF ;
    public final EObject entryRuleMetamodelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelReference = null;


        try {
            // InternalApplicationConfiguration.g:891:59: (iv_ruleMetamodelReference= ruleMetamodelReference EOF )
            // InternalApplicationConfiguration.g:892:2: iv_ruleMetamodelReference= ruleMetamodelReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetamodelReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetamodelReference=ruleMetamodelReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetamodelReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetamodelReference"


    // $ANTLR start "ruleMetamodelReference"
    // InternalApplicationConfiguration.g:898:1: ruleMetamodelReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleMetamodelReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:904:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:905:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:905:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:906:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:906:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:907:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getMetamodelReferenceRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getMetamodelReferenceAccess().getReferredMetamodelDeclarationCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetamodelReference"


    // $ANTLR start "entryRuleMetamodel"
    // InternalApplicationConfiguration.g:921:1: entryRuleMetamodel returns [EObject current=null] : iv_ruleMetamodel= ruleMetamodel EOF ;
    public final EObject entryRuleMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodel = null;


        try {
            // InternalApplicationConfiguration.g:921:50: (iv_ruleMetamodel= ruleMetamodel EOF )
            // InternalApplicationConfiguration.g:922:2: iv_ruleMetamodel= ruleMetamodel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetamodelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetamodel=ruleMetamodel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetamodel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetamodel"


    // $ANTLR start "ruleMetamodel"
    // InternalApplicationConfiguration.g:928:1: ruleMetamodel returns [EObject current=null] : (this_MetamodelReference_0= ruleMetamodelReference | this_MetamodelSpecification_1= ruleMetamodelSpecification ) ;
    public final EObject ruleMetamodel() throws RecognitionException {
        EObject current = null;

        EObject this_MetamodelReference_0 = null;

        EObject this_MetamodelSpecification_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:934:2: ( (this_MetamodelReference_0= ruleMetamodelReference | this_MetamodelSpecification_1= ruleMetamodelSpecification ) )
            // InternalApplicationConfiguration.g:935:2: (this_MetamodelReference_0= ruleMetamodelReference | this_MetamodelSpecification_1= ruleMetamodelSpecification )
            {
            // InternalApplicationConfiguration.g:935:2: (this_MetamodelReference_0= ruleMetamodelReference | this_MetamodelSpecification_1= ruleMetamodelSpecification )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==17) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalApplicationConfiguration.g:936:3: this_MetamodelReference_0= ruleMetamodelReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMetamodelAccess().getMetamodelReferenceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MetamodelReference_0=ruleMetamodelReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MetamodelReference_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:945:3: this_MetamodelSpecification_1= ruleMetamodelSpecification
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMetamodelAccess().getMetamodelSpecificationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MetamodelSpecification_1=ruleMetamodelSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MetamodelSpecification_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetamodel"


    // $ANTLR start "entryRulePartialModelSpecification"
    // InternalApplicationConfiguration.g:957:1: entryRulePartialModelSpecification returns [EObject current=null] : iv_rulePartialModelSpecification= rulePartialModelSpecification EOF ;
    public final EObject entryRulePartialModelSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialModelSpecification = null;


        try {
            // InternalApplicationConfiguration.g:957:66: (iv_rulePartialModelSpecification= rulePartialModelSpecification EOF )
            // InternalApplicationConfiguration.g:958:2: iv_rulePartialModelSpecification= rulePartialModelSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartialModelSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePartialModelSpecification=rulePartialModelSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePartialModelSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartialModelSpecification"


    // $ANTLR start "rulePartialModelSpecification"
    // InternalApplicationConfiguration.g:964:1: rulePartialModelSpecification returns [EObject current=null] : (otherlv_0= '{' ( (lv_entry_1_0= rulePartialModelEntry ) ) (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )? otherlv_4= '}' ) ;
    public final EObject rulePartialModelSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entry_1_0 = null;

        EObject lv_entry_3_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:970:2: ( (otherlv_0= '{' ( (lv_entry_1_0= rulePartialModelEntry ) ) (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )? otherlv_4= '}' ) )
            // InternalApplicationConfiguration.g:971:2: (otherlv_0= '{' ( (lv_entry_1_0= rulePartialModelEntry ) ) (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )? otherlv_4= '}' )
            {
            // InternalApplicationConfiguration.g:971:2: (otherlv_0= '{' ( (lv_entry_1_0= rulePartialModelEntry ) ) (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )? otherlv_4= '}' )
            // InternalApplicationConfiguration.g:972:3: otherlv_0= '{' ( (lv_entry_1_0= rulePartialModelEntry ) ) (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPartialModelSpecificationAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalApplicationConfiguration.g:976:3: ( (lv_entry_1_0= rulePartialModelEntry ) )
            // InternalApplicationConfiguration.g:977:4: (lv_entry_1_0= rulePartialModelEntry )
            {
            // InternalApplicationConfiguration.g:977:4: (lv_entry_1_0= rulePartialModelEntry )
            // InternalApplicationConfiguration.g:978:5: lv_entry_1_0= rulePartialModelEntry
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPartialModelSpecificationAccess().getEntryPartialModelEntryParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_entry_1_0=rulePartialModelEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPartialModelSpecificationRule());
              					}
              					add(
              						current,
              						"entry",
              						lv_entry_1_0,
              						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.PartialModelEntry");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalApplicationConfiguration.g:995:3: (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalApplicationConfiguration.g:996:4: otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPartialModelSpecificationAccess().getCommaKeyword_2_0());
                      			
                    }
                    // InternalApplicationConfiguration.g:1000:4: ( (lv_entry_3_0= rulePartialModelEntry ) )
                    // InternalApplicationConfiguration.g:1001:5: (lv_entry_3_0= rulePartialModelEntry )
                    {
                    // InternalApplicationConfiguration.g:1001:5: (lv_entry_3_0= rulePartialModelEntry )
                    // InternalApplicationConfiguration.g:1002:6: lv_entry_3_0= rulePartialModelEntry
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPartialModelSpecificationAccess().getEntryPartialModelEntryParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_entry_3_0=rulePartialModelEntry();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPartialModelSpecificationRule());
                      						}
                      						add(
                      							current,
                      							"entry",
                      							lv_entry_3_0,
                      							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.PartialModelEntry");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPartialModelSpecificationAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartialModelSpecification"


    // $ANTLR start "entryRulePartialModelEntry"
    // InternalApplicationConfiguration.g:1028:1: entryRulePartialModelEntry returns [EObject current=null] : iv_rulePartialModelEntry= rulePartialModelEntry EOF ;
    public final EObject entryRulePartialModelEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialModelEntry = null;


        try {
            // InternalApplicationConfiguration.g:1028:58: (iv_rulePartialModelEntry= rulePartialModelEntry EOF )
            // InternalApplicationConfiguration.g:1029:2: iv_rulePartialModelEntry= rulePartialModelEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartialModelEntryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePartialModelEntry=rulePartialModelEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePartialModelEntry; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartialModelEntry"


    // $ANTLR start "rulePartialModelEntry"
    // InternalApplicationConfiguration.g:1035:1: rulePartialModelEntry returns [EObject current=null] : (this_ModelEntry_0= ruleModelEntry | this_FolderEntry_1= ruleFolderEntry ) ;
    public final EObject rulePartialModelEntry() throws RecognitionException {
        EObject current = null;

        EObject this_ModelEntry_0 = null;

        EObject this_FolderEntry_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1041:2: ( (this_ModelEntry_0= ruleModelEntry | this_FolderEntry_1= ruleFolderEntry ) )
            // InternalApplicationConfiguration.g:1042:2: (this_ModelEntry_0= ruleModelEntry | this_FolderEntry_1= ruleFolderEntry )
            {
            // InternalApplicationConfiguration.g:1042:2: (this_ModelEntry_0= ruleModelEntry | this_FolderEntry_1= ruleFolderEntry )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)) ) {
                alt16=1;
            }
            else if ( (LA16_0==24) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalApplicationConfiguration.g:1043:3: this_ModelEntry_0= ruleModelEntry
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPartialModelEntryAccess().getModelEntryParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ModelEntry_0=ruleModelEntry();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ModelEntry_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:1052:3: this_FolderEntry_1= ruleFolderEntry
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPartialModelEntryAccess().getFolderEntryParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FolderEntry_1=ruleFolderEntry();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FolderEntry_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartialModelEntry"


    // $ANTLR start "entryRuleModelEntry"
    // InternalApplicationConfiguration.g:1064:1: entryRuleModelEntry returns [EObject current=null] : iv_ruleModelEntry= ruleModelEntry EOF ;
    public final EObject entryRuleModelEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelEntry = null;


        try {
            // InternalApplicationConfiguration.g:1064:51: (iv_ruleModelEntry= ruleModelEntry EOF )
            // InternalApplicationConfiguration.g:1065:2: iv_ruleModelEntry= ruleModelEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelEntryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelEntry=ruleModelEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelEntry; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelEntry"


    // $ANTLR start "ruleModelEntry"
    // InternalApplicationConfiguration.g:1071:1: ruleModelEntry returns [EObject current=null] : ( (lv_path_0_0= ruleFile ) ) ;
    public final EObject ruleModelEntry() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1077:2: ( ( (lv_path_0_0= ruleFile ) ) )
            // InternalApplicationConfiguration.g:1078:2: ( (lv_path_0_0= ruleFile ) )
            {
            // InternalApplicationConfiguration.g:1078:2: ( (lv_path_0_0= ruleFile ) )
            // InternalApplicationConfiguration.g:1079:3: (lv_path_0_0= ruleFile )
            {
            // InternalApplicationConfiguration.g:1079:3: (lv_path_0_0= ruleFile )
            // InternalApplicationConfiguration.g:1080:4: lv_path_0_0= ruleFile
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getModelEntryAccess().getPathFileParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_path_0_0=ruleFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getModelEntryRule());
              				}
              				set(
              					current,
              					"path",
              					lv_path_0_0,
              					"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.File");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelEntry"


    // $ANTLR start "entryRuleFolderEntry"
    // InternalApplicationConfiguration.g:1100:1: entryRuleFolderEntry returns [EObject current=null] : iv_ruleFolderEntry= ruleFolderEntry EOF ;
    public final EObject entryRuleFolderEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFolderEntry = null;


        try {
            // InternalApplicationConfiguration.g:1100:52: (iv_ruleFolderEntry= ruleFolderEntry EOF )
            // InternalApplicationConfiguration.g:1101:2: iv_ruleFolderEntry= ruleFolderEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFolderEntryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFolderEntry=ruleFolderEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFolderEntry; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFolderEntry"


    // $ANTLR start "ruleFolderEntry"
    // InternalApplicationConfiguration.g:1107:1: ruleFolderEntry returns [EObject current=null] : (otherlv_0= 'folder' ( (lv_path_1_0= ruleFile ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleFolderEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_path_1_0 = null;

        EObject lv_exclusion_4_0 = null;

        EObject lv_exclusion_6_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1113:2: ( (otherlv_0= 'folder' ( (lv_path_1_0= ruleFile ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )? ) )
            // InternalApplicationConfiguration.g:1114:2: (otherlv_0= 'folder' ( (lv_path_1_0= ruleFile ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )? )
            {
            // InternalApplicationConfiguration.g:1114:2: (otherlv_0= 'folder' ( (lv_path_1_0= ruleFile ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )? )
            // InternalApplicationConfiguration.g:1115:3: otherlv_0= 'folder' ( (lv_path_1_0= ruleFile ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFolderEntryAccess().getFolderKeyword_0());
              		
            }
            // InternalApplicationConfiguration.g:1119:3: ( (lv_path_1_0= ruleFile ) )
            // InternalApplicationConfiguration.g:1120:4: (lv_path_1_0= ruleFile )
            {
            // InternalApplicationConfiguration.g:1120:4: (lv_path_1_0= ruleFile )
            // InternalApplicationConfiguration.g:1121:5: lv_path_1_0= ruleFile
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFolderEntryAccess().getPathFileParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_path_1_0=ruleFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFolderEntryRule());
              					}
              					set(
              						current,
              						"path",
              						lv_path_1_0,
              						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.File");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalApplicationConfiguration.g:1138:3: (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalApplicationConfiguration.g:1139:4: otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getFolderEntryAccess().getExcludingKeyword_2_0());
                      			
                    }
                    otherlv_3=(Token)match(input,17,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getFolderEntryAccess().getLeftCurlyBracketKeyword_2_1());
                      			
                    }
                    // InternalApplicationConfiguration.g:1147:4: ( (lv_exclusion_4_0= ruleModelEntry ) )
                    // InternalApplicationConfiguration.g:1148:5: (lv_exclusion_4_0= ruleModelEntry )
                    {
                    // InternalApplicationConfiguration.g:1148:5: (lv_exclusion_4_0= ruleModelEntry )
                    // InternalApplicationConfiguration.g:1149:6: lv_exclusion_4_0= ruleModelEntry
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFolderEntryAccess().getExclusionModelEntryParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_exclusion_4_0=ruleModelEntry();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFolderEntryRule());
                      						}
                      						add(
                      							current,
                      							"exclusion",
                      							lv_exclusion_4_0,
                      							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ModelEntry");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalApplicationConfiguration.g:1166:4: (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==18) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:1167:5: otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getFolderEntryAccess().getCommaKeyword_2_3_0());
                    	      				
                    	    }
                    	    // InternalApplicationConfiguration.g:1171:5: ( (lv_exclusion_6_0= ruleModelEntry ) )
                    	    // InternalApplicationConfiguration.g:1172:6: (lv_exclusion_6_0= ruleModelEntry )
                    	    {
                    	    // InternalApplicationConfiguration.g:1172:6: (lv_exclusion_6_0= ruleModelEntry )
                    	    // InternalApplicationConfiguration.g:1173:7: lv_exclusion_6_0= ruleModelEntry
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFolderEntryAccess().getExclusionModelEntryParserRuleCall_2_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_exclusion_6_0=ruleModelEntry();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFolderEntryRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"exclusion",
                    	      								lv_exclusion_6_0,
                    	      								"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ModelEntry");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getFolderEntryAccess().getRightCurlyBracketKeyword_2_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFolderEntry"


    // $ANTLR start "entryRulePartialModelDeclaration"
    // InternalApplicationConfiguration.g:1200:1: entryRulePartialModelDeclaration returns [EObject current=null] : iv_rulePartialModelDeclaration= rulePartialModelDeclaration EOF ;
    public final EObject entryRulePartialModelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialModelDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:1200:64: (iv_rulePartialModelDeclaration= rulePartialModelDeclaration EOF )
            // InternalApplicationConfiguration.g:1201:2: iv_rulePartialModelDeclaration= rulePartialModelDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartialModelDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePartialModelDeclaration=rulePartialModelDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePartialModelDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartialModelDeclaration"


    // $ANTLR start "rulePartialModelDeclaration"
    // InternalApplicationConfiguration.g:1207:1: rulePartialModelDeclaration returns [EObject current=null] : (otherlv_0= 'partial-model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePartialModelSpecification ) ) ) ;
    public final EObject rulePartialModelDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_specification_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1213:2: ( (otherlv_0= 'partial-model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePartialModelSpecification ) ) ) )
            // InternalApplicationConfiguration.g:1214:2: (otherlv_0= 'partial-model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePartialModelSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:1214:2: (otherlv_0= 'partial-model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePartialModelSpecification ) ) )
            // InternalApplicationConfiguration.g:1215:3: otherlv_0= 'partial-model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePartialModelSpecification ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPartialModelDeclarationAccess().getPartialModelKeyword_0());
              		
            }
            // InternalApplicationConfiguration.g:1219:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:1220:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1220:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:1221:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPartialModelDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPartialModelDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalApplicationConfiguration.g:1237:3: ( (lv_specification_2_0= rulePartialModelSpecification ) )
            // InternalApplicationConfiguration.g:1238:4: (lv_specification_2_0= rulePartialModelSpecification )
            {
            // InternalApplicationConfiguration.g:1238:4: (lv_specification_2_0= rulePartialModelSpecification )
            // InternalApplicationConfiguration.g:1239:5: lv_specification_2_0= rulePartialModelSpecification
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPartialModelDeclarationAccess().getSpecificationPartialModelSpecificationParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_specification_2_0=rulePartialModelSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPartialModelDeclarationRule());
              					}
              					set(
              						current,
              						"specification",
              						lv_specification_2_0,
              						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.PartialModelSpecification");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartialModelDeclaration"


    // $ANTLR start "entryRulePartialModelReference"
    // InternalApplicationConfiguration.g:1260:1: entryRulePartialModelReference returns [EObject current=null] : iv_rulePartialModelReference= rulePartialModelReference EOF ;
    public final EObject entryRulePartialModelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialModelReference = null;


        try {
            // InternalApplicationConfiguration.g:1260:62: (iv_rulePartialModelReference= rulePartialModelReference EOF )
            // InternalApplicationConfiguration.g:1261:2: iv_rulePartialModelReference= rulePartialModelReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartialModelReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePartialModelReference=rulePartialModelReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePartialModelReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartialModelReference"


    // $ANTLR start "rulePartialModelReference"
    // InternalApplicationConfiguration.g:1267:1: rulePartialModelReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulePartialModelReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1273:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:1274:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:1274:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:1275:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1275:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:1276:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getPartialModelReferenceRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getPartialModelReferenceAccess().getReferredPartialModelDeclarationCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartialModelReference"


    // $ANTLR start "entryRulePartialModel"
    // InternalApplicationConfiguration.g:1290:1: entryRulePartialModel returns [EObject current=null] : iv_rulePartialModel= rulePartialModel EOF ;
    public final EObject entryRulePartialModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialModel = null;


        try {
            // InternalApplicationConfiguration.g:1290:53: (iv_rulePartialModel= rulePartialModel EOF )
            // InternalApplicationConfiguration.g:1291:2: iv_rulePartialModel= rulePartialModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartialModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePartialModel=rulePartialModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePartialModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartialModel"


    // $ANTLR start "rulePartialModel"
    // InternalApplicationConfiguration.g:1297:1: rulePartialModel returns [EObject current=null] : (this_PartialModelSpecification_0= rulePartialModelSpecification | this_PartialModelReference_1= rulePartialModelReference ) ;
    public final EObject rulePartialModel() throws RecognitionException {
        EObject current = null;

        EObject this_PartialModelSpecification_0 = null;

        EObject this_PartialModelReference_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1303:2: ( (this_PartialModelSpecification_0= rulePartialModelSpecification | this_PartialModelReference_1= rulePartialModelReference ) )
            // InternalApplicationConfiguration.g:1304:2: (this_PartialModelSpecification_0= rulePartialModelSpecification | this_PartialModelReference_1= rulePartialModelReference )
            {
            // InternalApplicationConfiguration.g:1304:2: (this_PartialModelSpecification_0= rulePartialModelSpecification | this_PartialModelReference_1= rulePartialModelReference )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalApplicationConfiguration.g:1305:3: this_PartialModelSpecification_0= rulePartialModelSpecification
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPartialModelAccess().getPartialModelSpecificationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PartialModelSpecification_0=rulePartialModelSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PartialModelSpecification_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:1314:3: this_PartialModelReference_1= rulePartialModelReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPartialModelAccess().getPartialModelReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PartialModelReference_1=rulePartialModelReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PartialModelReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartialModel"


    // $ANTLR start "entryRulePatternSpecification"
    // InternalApplicationConfiguration.g:1326:1: entryRulePatternSpecification returns [EObject current=null] : iv_rulePatternSpecification= rulePatternSpecification EOF ;
    public final EObject entryRulePatternSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternSpecification = null;


        try {
            // InternalApplicationConfiguration.g:1326:61: (iv_rulePatternSpecification= rulePatternSpecification EOF )
            // InternalApplicationConfiguration.g:1327:2: iv_rulePatternSpecification= rulePatternSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePatternSpecification=rulePatternSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternSpecification"


    // $ANTLR start "rulePatternSpecification"
    // InternalApplicationConfiguration.g:1333:1: rulePatternSpecification returns [EObject current=null] : (otherlv_0= '{' ( (lv_entries_1_0= rulePatternEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )* otherlv_4= '}' ) ;
    public final EObject rulePatternSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1339:2: ( (otherlv_0= '{' ( (lv_entries_1_0= rulePatternEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )* otherlv_4= '}' ) )
            // InternalApplicationConfiguration.g:1340:2: (otherlv_0= '{' ( (lv_entries_1_0= rulePatternEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )* otherlv_4= '}' )
            {
            // InternalApplicationConfiguration.g:1340:2: (otherlv_0= '{' ( (lv_entries_1_0= rulePatternEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )* otherlv_4= '}' )
            // InternalApplicationConfiguration.g:1341:3: otherlv_0= '{' ( (lv_entries_1_0= rulePatternEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPatternSpecificationAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalApplicationConfiguration.g:1345:3: ( (lv_entries_1_0= rulePatternEntry ) )
            // InternalApplicationConfiguration.g:1346:4: (lv_entries_1_0= rulePatternEntry )
            {
            // InternalApplicationConfiguration.g:1346:4: (lv_entries_1_0= rulePatternEntry )
            // InternalApplicationConfiguration.g:1347:5: lv_entries_1_0= rulePatternEntry
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPatternSpecificationAccess().getEntriesPatternEntryParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_entries_1_0=rulePatternEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPatternSpecificationRule());
              					}
              					add(
              						current,
              						"entries",
              						lv_entries_1_0,
              						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.PatternEntry");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalApplicationConfiguration.g:1364:3: (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:1365:4: otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getPatternSpecificationAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalApplicationConfiguration.g:1369:4: ( (lv_entries_3_0= rulePatternEntry ) )
            	    // InternalApplicationConfiguration.g:1370:5: (lv_entries_3_0= rulePatternEntry )
            	    {
            	    // InternalApplicationConfiguration.g:1370:5: (lv_entries_3_0= rulePatternEntry )
            	    // InternalApplicationConfiguration.g:1371:6: lv_entries_3_0= rulePatternEntry
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPatternSpecificationAccess().getEntriesPatternEntryParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_entries_3_0=rulePatternEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPatternSpecificationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"entries",
            	      							lv_entries_3_0,
            	      							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.PatternEntry");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPatternSpecificationAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternSpecification"


    // $ANTLR start "entryRulePatternEntry"
    // InternalApplicationConfiguration.g:1397:1: entryRulePatternEntry returns [EObject current=null] : iv_rulePatternEntry= rulePatternEntry EOF ;
    public final EObject entryRulePatternEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternEntry = null;


        try {
            // InternalApplicationConfiguration.g:1397:53: (iv_rulePatternEntry= rulePatternEntry EOF )
            // InternalApplicationConfiguration.g:1398:2: iv_rulePatternEntry= rulePatternEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternEntryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePatternEntry=rulePatternEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternEntry; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternEntry"


    // $ANTLR start "rulePatternEntry"
    // InternalApplicationConfiguration.g:1404:1: rulePatternEntry returns [EObject current=null] : (this_PatternElement_0= rulePatternElement | this_AllPatternEntry_1= ruleAllPatternEntry ) ;
    public final EObject rulePatternEntry() throws RecognitionException {
        EObject current = null;

        EObject this_PatternElement_0 = null;

        EObject this_AllPatternEntry_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1410:2: ( (this_PatternElement_0= rulePatternElement | this_AllPatternEntry_1= ruleAllPatternEntry ) )
            // InternalApplicationConfiguration.g:1411:2: (this_PatternElement_0= rulePatternElement | this_AllPatternEntry_1= ruleAllPatternEntry )
            {
            // InternalApplicationConfiguration.g:1411:2: (this_PatternElement_0= rulePatternElement | this_AllPatternEntry_1= ruleAllPatternEntry )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==20) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalApplicationConfiguration.g:1412:3: this_PatternElement_0= rulePatternElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPatternEntryAccess().getPatternElementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PatternElement_0=rulePatternElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PatternElement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:1421:3: this_AllPatternEntry_1= ruleAllPatternEntry
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPatternEntryAccess().getAllPatternEntryParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AllPatternEntry_1=ruleAllPatternEntry();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AllPatternEntry_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternEntry"


    // $ANTLR start "entryRuleAllPatternEntry"
    // InternalApplicationConfiguration.g:1433:1: entryRuleAllPatternEntry returns [EObject current=null] : iv_ruleAllPatternEntry= ruleAllPatternEntry EOF ;
    public final EObject entryRuleAllPatternEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllPatternEntry = null;


        try {
            // InternalApplicationConfiguration.g:1433:56: (iv_ruleAllPatternEntry= ruleAllPatternEntry EOF )
            // InternalApplicationConfiguration.g:1434:2: iv_ruleAllPatternEntry= ruleAllPatternEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAllPatternEntryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAllPatternEntry=ruleAllPatternEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAllPatternEntry; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllPatternEntry"


    // $ANTLR start "ruleAllPatternEntry"
    // InternalApplicationConfiguration.g:1440:1: ruleAllPatternEntry returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleAllPatternEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_exclusuion_4_0 = null;

        EObject lv_exclusuion_6_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1446:2: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )? ) )
            // InternalApplicationConfiguration.g:1447:2: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )? )
            {
            // InternalApplicationConfiguration.g:1447:2: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )? )
            // InternalApplicationConfiguration.g:1448:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAllPatternEntryAccess().getPackageKeyword_0());
              		
            }
            // InternalApplicationConfiguration.g:1452:3: ( ( ruleQualifiedName ) )
            // InternalApplicationConfiguration.g:1453:4: ( ruleQualifiedName )
            {
            // InternalApplicationConfiguration.g:1453:4: ( ruleQualifiedName )
            // InternalApplicationConfiguration.g:1454:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAllPatternEntryRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAllPatternEntryAccess().getPackagePatternModelCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalApplicationConfiguration.g:1468:3: (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalApplicationConfiguration.g:1469:4: otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAllPatternEntryAccess().getExcludingKeyword_2_0());
                      			
                    }
                    otherlv_3=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAllPatternEntryAccess().getLeftCurlyBracketKeyword_2_1());
                      			
                    }
                    // InternalApplicationConfiguration.g:1477:4: ( (lv_exclusuion_4_0= rulePatternElement ) )
                    // InternalApplicationConfiguration.g:1478:5: (lv_exclusuion_4_0= rulePatternElement )
                    {
                    // InternalApplicationConfiguration.g:1478:5: (lv_exclusuion_4_0= rulePatternElement )
                    // InternalApplicationConfiguration.g:1479:6: lv_exclusuion_4_0= rulePatternElement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAllPatternEntryAccess().getExclusuionPatternElementParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_exclusuion_4_0=rulePatternElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAllPatternEntryRule());
                      						}
                      						add(
                      							current,
                      							"exclusuion",
                      							lv_exclusuion_4_0,
                      							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.PatternElement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalApplicationConfiguration.g:1496:4: (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==18) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:1497:5: otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getAllPatternEntryAccess().getCommaKeyword_2_3_0());
                    	      				
                    	    }
                    	    // InternalApplicationConfiguration.g:1501:5: ( (lv_exclusuion_6_0= rulePatternElement ) )
                    	    // InternalApplicationConfiguration.g:1502:6: (lv_exclusuion_6_0= rulePatternElement )
                    	    {
                    	    // InternalApplicationConfiguration.g:1502:6: (lv_exclusuion_6_0= rulePatternElement )
                    	    // InternalApplicationConfiguration.g:1503:7: lv_exclusuion_6_0= rulePatternElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAllPatternEntryAccess().getExclusuionPatternElementParserRuleCall_2_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_exclusuion_6_0=rulePatternElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAllPatternEntryRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"exclusuion",
                    	      								lv_exclusuion_6_0,
                    	      								"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.PatternElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getAllPatternEntryAccess().getRightCurlyBracketKeyword_2_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllPatternEntry"


    // $ANTLR start "entryRulePatternElement"
    // InternalApplicationConfiguration.g:1530:1: entryRulePatternElement returns [EObject current=null] : iv_rulePatternElement= rulePatternElement EOF ;
    public final EObject entryRulePatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternElement = null;


        try {
            // InternalApplicationConfiguration.g:1530:55: (iv_rulePatternElement= rulePatternElement EOF )
            // InternalApplicationConfiguration.g:1531:2: iv_rulePatternElement= rulePatternElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePatternElement=rulePatternElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternElement"


    // $ANTLR start "rulePatternElement"
    // InternalApplicationConfiguration.g:1537:1: rulePatternElement returns [EObject current=null] : ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject rulePatternElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1543:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) )
            // InternalApplicationConfiguration.g:1544:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalApplicationConfiguration.g:1544:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:1545:3: ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:1545:3: ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==11||LA24_1==22) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalApplicationConfiguration.g:1546:4: ( ( ruleQualifiedName ) ) otherlv_1= '::'
                    {
                    // InternalApplicationConfiguration.g:1546:4: ( ( ruleQualifiedName ) )
                    // InternalApplicationConfiguration.g:1547:5: ( ruleQualifiedName )
                    {
                    // InternalApplicationConfiguration.g:1547:5: ( ruleQualifiedName )
                    // InternalApplicationConfiguration.g:1548:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPatternElementRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPatternElementAccess().getPackagePatternModelCrossReference_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPatternElementAccess().getColonColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalApplicationConfiguration.g:1567:3: ( (otherlv_2= RULE_ID ) )
            // InternalApplicationConfiguration.g:1568:4: (otherlv_2= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1568:4: (otherlv_2= RULE_ID )
            // InternalApplicationConfiguration.g:1569:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPatternElementRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getPatternElementAccess().getPatternPatternCrossReference_1_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternElement"


    // $ANTLR start "entryRuleGraphPatternDeclaration"
    // InternalApplicationConfiguration.g:1584:1: entryRuleGraphPatternDeclaration returns [EObject current=null] : iv_ruleGraphPatternDeclaration= ruleGraphPatternDeclaration EOF ;
    public final EObject entryRuleGraphPatternDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphPatternDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:1584:64: (iv_ruleGraphPatternDeclaration= ruleGraphPatternDeclaration EOF )
            // InternalApplicationConfiguration.g:1585:2: iv_ruleGraphPatternDeclaration= ruleGraphPatternDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGraphPatternDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGraphPatternDeclaration=ruleGraphPatternDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGraphPatternDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphPatternDeclaration"


    // $ANTLR start "ruleGraphPatternDeclaration"
    // InternalApplicationConfiguration.g:1591:1: ruleGraphPatternDeclaration returns [EObject current=null] : (otherlv_0= 'patterns' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePatternSpecification ) ) ) ;
    public final EObject ruleGraphPatternDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_specification_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1597:2: ( (otherlv_0= 'patterns' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePatternSpecification ) ) ) )
            // InternalApplicationConfiguration.g:1598:2: (otherlv_0= 'patterns' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePatternSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:1598:2: (otherlv_0= 'patterns' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePatternSpecification ) ) )
            // InternalApplicationConfiguration.g:1599:3: otherlv_0= 'patterns' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePatternSpecification ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGraphPatternDeclarationAccess().getPatternsKeyword_0());
              		
            }
            // InternalApplicationConfiguration.g:1603:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:1604:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1604:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:1605:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGraphPatternDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGraphPatternDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalApplicationConfiguration.g:1621:3: ( (lv_specification_2_0= rulePatternSpecification ) )
            // InternalApplicationConfiguration.g:1622:4: (lv_specification_2_0= rulePatternSpecification )
            {
            // InternalApplicationConfiguration.g:1622:4: (lv_specification_2_0= rulePatternSpecification )
            // InternalApplicationConfiguration.g:1623:5: lv_specification_2_0= rulePatternSpecification
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGraphPatternDeclarationAccess().getSpecificationPatternSpecificationParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_specification_2_0=rulePatternSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGraphPatternDeclarationRule());
              					}
              					set(
              						current,
              						"specification",
              						lv_specification_2_0,
              						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.PatternSpecification");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphPatternDeclaration"


    // $ANTLR start "entryRuleGraphPatternReference"
    // InternalApplicationConfiguration.g:1644:1: entryRuleGraphPatternReference returns [EObject current=null] : iv_ruleGraphPatternReference= ruleGraphPatternReference EOF ;
    public final EObject entryRuleGraphPatternReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphPatternReference = null;


        try {
            // InternalApplicationConfiguration.g:1644:62: (iv_ruleGraphPatternReference= ruleGraphPatternReference EOF )
            // InternalApplicationConfiguration.g:1645:2: iv_ruleGraphPatternReference= ruleGraphPatternReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGraphPatternReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGraphPatternReference=ruleGraphPatternReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGraphPatternReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphPatternReference"


    // $ANTLR start "ruleGraphPatternReference"
    // InternalApplicationConfiguration.g:1651:1: ruleGraphPatternReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleGraphPatternReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1657:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:1658:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:1658:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:1659:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1659:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:1660:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getGraphPatternReferenceRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getGraphPatternReferenceAccess().getReferredGraphPatternDeclarationCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphPatternReference"


    // $ANTLR start "entryRuleGraphPattern"
    // InternalApplicationConfiguration.g:1674:1: entryRuleGraphPattern returns [EObject current=null] : iv_ruleGraphPattern= ruleGraphPattern EOF ;
    public final EObject entryRuleGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphPattern = null;


        try {
            // InternalApplicationConfiguration.g:1674:53: (iv_ruleGraphPattern= ruleGraphPattern EOF )
            // InternalApplicationConfiguration.g:1675:2: iv_ruleGraphPattern= ruleGraphPattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGraphPatternRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGraphPattern=ruleGraphPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGraphPattern; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphPattern"


    // $ANTLR start "ruleGraphPattern"
    // InternalApplicationConfiguration.g:1681:1: ruleGraphPattern returns [EObject current=null] : (this_GraphPatternReference_0= ruleGraphPatternReference | this_PatternSpecification_1= rulePatternSpecification ) ;
    public final EObject ruleGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject this_GraphPatternReference_0 = null;

        EObject this_PatternSpecification_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1687:2: ( (this_GraphPatternReference_0= ruleGraphPatternReference | this_PatternSpecification_1= rulePatternSpecification ) )
            // InternalApplicationConfiguration.g:1688:2: (this_GraphPatternReference_0= ruleGraphPatternReference | this_PatternSpecification_1= rulePatternSpecification )
            {
            // InternalApplicationConfiguration.g:1688:2: (this_GraphPatternReference_0= ruleGraphPatternReference | this_PatternSpecification_1= rulePatternSpecification )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==17) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalApplicationConfiguration.g:1689:3: this_GraphPatternReference_0= ruleGraphPatternReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGraphPatternAccess().getGraphPatternReferenceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GraphPatternReference_0=ruleGraphPatternReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GraphPatternReference_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:1698:3: this_PatternSpecification_1= rulePatternSpecification
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGraphPatternAccess().getPatternSpecificationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PatternSpecification_1=rulePatternSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PatternSpecification_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphPattern"


    // $ANTLR start "entryRuleConfigSpecification"
    // InternalApplicationConfiguration.g:1710:1: entryRuleConfigSpecification returns [EObject current=null] : iv_ruleConfigSpecification= ruleConfigSpecification EOF ;
    public final EObject entryRuleConfigSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigSpecification = null;


        try {
            // InternalApplicationConfiguration.g:1710:60: (iv_ruleConfigSpecification= ruleConfigSpecification EOF )
            // InternalApplicationConfiguration.g:1711:2: iv_ruleConfigSpecification= ruleConfigSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigSpecification=ruleConfigSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigSpecification"


    // $ANTLR start "ruleConfigSpecification"
    // InternalApplicationConfiguration.g:1717:1: ruleConfigSpecification returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleConfigSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_entries_2_0 = null;

        EObject lv_entries_4_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1723:2: ( ( () otherlv_1= '{' ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )? otherlv_5= '}' ) )
            // InternalApplicationConfiguration.g:1724:2: ( () otherlv_1= '{' ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )? otherlv_5= '}' )
            {
            // InternalApplicationConfiguration.g:1724:2: ( () otherlv_1= '{' ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )? otherlv_5= '}' )
            // InternalApplicationConfiguration.g:1725:3: () otherlv_1= '{' ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )? otherlv_5= '}'
            {
            // InternalApplicationConfiguration.g:1725:3: ()
            // InternalApplicationConfiguration.g:1726:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConfigSpecificationAccess().getConfigSpecificationAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigSpecificationAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalApplicationConfiguration.g:1736:3: ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalApplicationConfiguration.g:1737:4: ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )*
                    {
                    // InternalApplicationConfiguration.g:1737:4: ( (lv_entries_2_0= ruleConfigEntry ) )
                    // InternalApplicationConfiguration.g:1738:5: (lv_entries_2_0= ruleConfigEntry )
                    {
                    // InternalApplicationConfiguration.g:1738:5: (lv_entries_2_0= ruleConfigEntry )
                    // InternalApplicationConfiguration.g:1739:6: lv_entries_2_0= ruleConfigEntry
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConfigSpecificationAccess().getEntriesConfigEntryParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_entries_2_0=ruleConfigEntry();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConfigSpecificationRule());
                      						}
                      						add(
                      							current,
                      							"entries",
                      							lv_entries_2_0,
                      							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ConfigEntry");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalApplicationConfiguration.g:1756:4: (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==18) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:1757:5: otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getConfigSpecificationAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalApplicationConfiguration.g:1761:5: ( (lv_entries_4_0= ruleConfigEntry ) )
                    	    // InternalApplicationConfiguration.g:1762:6: (lv_entries_4_0= ruleConfigEntry )
                    	    {
                    	    // InternalApplicationConfiguration.g:1762:6: (lv_entries_4_0= ruleConfigEntry )
                    	    // InternalApplicationConfiguration.g:1763:7: lv_entries_4_0= ruleConfigEntry
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConfigSpecificationAccess().getEntriesConfigEntryParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_entries_4_0=ruleConfigEntry();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getConfigSpecificationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"entries",
                    	      								lv_entries_4_0,
                    	      								"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ConfigEntry");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getConfigSpecificationAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigSpecification"


    // $ANTLR start "entryRuleConfigDeclaration"
    // InternalApplicationConfiguration.g:1790:1: entryRuleConfigDeclaration returns [EObject current=null] : iv_ruleConfigDeclaration= ruleConfigDeclaration EOF ;
    public final EObject entryRuleConfigDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:1790:58: (iv_ruleConfigDeclaration= ruleConfigDeclaration EOF )
            // InternalApplicationConfiguration.g:1791:2: iv_ruleConfigDeclaration= ruleConfigDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigDeclaration=ruleConfigDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigDeclaration"


    // $ANTLR start "ruleConfigDeclaration"
    // InternalApplicationConfiguration.g:1797:1: ruleConfigDeclaration returns [EObject current=null] : (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleConfigSpecification ) ) ) ;
    public final EObject ruleConfigDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_specification_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1803:2: ( (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleConfigSpecification ) ) ) )
            // InternalApplicationConfiguration.g:1804:2: (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleConfigSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:1804:2: (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleConfigSpecification ) ) )
            // InternalApplicationConfiguration.g:1805:3: otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleConfigSpecification ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfigDeclarationAccess().getConfigKeyword_0());
              		
            }
            // InternalApplicationConfiguration.g:1809:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:1810:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1810:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:1811:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getConfigDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalApplicationConfiguration.g:1827:3: ( (lv_specification_2_0= ruleConfigSpecification ) )
            // InternalApplicationConfiguration.g:1828:4: (lv_specification_2_0= ruleConfigSpecification )
            {
            // InternalApplicationConfiguration.g:1828:4: (lv_specification_2_0= ruleConfigSpecification )
            // InternalApplicationConfiguration.g:1829:5: lv_specification_2_0= ruleConfigSpecification
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigDeclarationAccess().getSpecificationConfigSpecificationParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_specification_2_0=ruleConfigSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConfigDeclarationRule());
              					}
              					set(
              						current,
              						"specification",
              						lv_specification_2_0,
              						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ConfigSpecification");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigDeclaration"


    // $ANTLR start "entryRuleConfigEntry"
    // InternalApplicationConfiguration.g:1850:1: entryRuleConfigEntry returns [EObject current=null] : iv_ruleConfigEntry= ruleConfigEntry EOF ;
    public final EObject entryRuleConfigEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigEntry = null;


        try {
            // InternalApplicationConfiguration.g:1850:52: (iv_ruleConfigEntry= ruleConfigEntry EOF )
            // InternalApplicationConfiguration.g:1851:2: iv_ruleConfigEntry= ruleConfigEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigEntryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigEntry=ruleConfigEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigEntry; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigEntry"


    // $ANTLR start "ruleConfigEntry"
    // InternalApplicationConfiguration.g:1857:1: ruleConfigEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleConfigEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1863:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalApplicationConfiguration.g:1864:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalApplicationConfiguration.g:1864:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalApplicationConfiguration.g:1865:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalApplicationConfiguration.g:1865:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalApplicationConfiguration.g:1866:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalApplicationConfiguration.g:1866:4: (lv_key_0_0= RULE_STRING )
            // InternalApplicationConfiguration.g:1867:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_key_0_0, grammarAccess.getConfigEntryAccess().getKeySTRINGTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigEntryRule());
              					}
              					setWithLastConsumed(
              						current,
              						"key",
              						lv_key_0_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigEntryAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalApplicationConfiguration.g:1887:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalApplicationConfiguration.g:1888:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalApplicationConfiguration.g:1888:4: (lv_value_2_0= RULE_STRING )
            // InternalApplicationConfiguration.g:1889:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_2_0, grammarAccess.getConfigEntryAccess().getValueSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfigEntryRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigEntry"


    // $ANTLR start "entryRuleConfigReference"
    // InternalApplicationConfiguration.g:1909:1: entryRuleConfigReference returns [EObject current=null] : iv_ruleConfigReference= ruleConfigReference EOF ;
    public final EObject entryRuleConfigReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigReference = null;


        try {
            // InternalApplicationConfiguration.g:1909:56: (iv_ruleConfigReference= ruleConfigReference EOF )
            // InternalApplicationConfiguration.g:1910:2: iv_ruleConfigReference= ruleConfigReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigReference=ruleConfigReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigReference"


    // $ANTLR start "ruleConfigReference"
    // InternalApplicationConfiguration.g:1916:1: ruleConfigReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleConfigReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1922:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:1923:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:1923:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:1924:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1924:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:1925:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getConfigReferenceRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getConfigReferenceAccess().getConfigConfigDeclarationCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigReference"


    // $ANTLR start "entryRuleConfig"
    // InternalApplicationConfiguration.g:1939:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalApplicationConfiguration.g:1939:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalApplicationConfiguration.g:1940:2: iv_ruleConfig= ruleConfig EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfig; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalApplicationConfiguration.g:1946:1: ruleConfig returns [EObject current=null] : (this_ConfigSpecification_0= ruleConfigSpecification | this_ConfigReference_1= ruleConfigReference ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigSpecification_0 = null;

        EObject this_ConfigReference_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1952:2: ( (this_ConfigSpecification_0= ruleConfigSpecification | this_ConfigReference_1= ruleConfigReference ) )
            // InternalApplicationConfiguration.g:1953:2: (this_ConfigSpecification_0= ruleConfigSpecification | this_ConfigReference_1= ruleConfigReference )
            {
            // InternalApplicationConfiguration.g:1953:2: (this_ConfigSpecification_0= ruleConfigSpecification | this_ConfigReference_1= ruleConfigReference )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalApplicationConfiguration.g:1954:3: this_ConfigSpecification_0= ruleConfigSpecification
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConfigAccess().getConfigSpecificationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigSpecification_0=ruleConfigSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConfigSpecification_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:1963:3: this_ConfigReference_1= ruleConfigReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConfigAccess().getConfigReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigReference_1=ruleConfigReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConfigReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleScopeSpecification"
    // InternalApplicationConfiguration.g:1975:1: entryRuleScopeSpecification returns [EObject current=null] : iv_ruleScopeSpecification= ruleScopeSpecification EOF ;
    public final EObject entryRuleScopeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeSpecification = null;


        try {
            // InternalApplicationConfiguration.g:1975:59: (iv_ruleScopeSpecification= ruleScopeSpecification EOF )
            // InternalApplicationConfiguration.g:1976:2: iv_ruleScopeSpecification= ruleScopeSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopeSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScopeSpecification=ruleScopeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScopeSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScopeSpecification"


    // $ANTLR start "ruleScopeSpecification"
    // InternalApplicationConfiguration.g:1982:1: ruleScopeSpecification returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleScopeSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_scopes_2_0 = null;

        EObject lv_scopes_4_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1988:2: ( ( () otherlv_1= '{' ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )? otherlv_5= '}' ) )
            // InternalApplicationConfiguration.g:1989:2: ( () otherlv_1= '{' ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )? otherlv_5= '}' )
            {
            // InternalApplicationConfiguration.g:1989:2: ( () otherlv_1= '{' ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )? otherlv_5= '}' )
            // InternalApplicationConfiguration.g:1990:3: () otherlv_1= '{' ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )? otherlv_5= '}'
            {
            // InternalApplicationConfiguration.g:1990:3: ()
            // InternalApplicationConfiguration.g:1991:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getScopeSpecificationAccess().getScopeSpecificationAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getScopeSpecificationAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalApplicationConfiguration.g:2001:3: ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT||LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalApplicationConfiguration.g:2002:4: ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )*
                    {
                    // InternalApplicationConfiguration.g:2002:4: ( (lv_scopes_2_0= ruleTypeScope ) )
                    // InternalApplicationConfiguration.g:2003:5: (lv_scopes_2_0= ruleTypeScope )
                    {
                    // InternalApplicationConfiguration.g:2003:5: (lv_scopes_2_0= ruleTypeScope )
                    // InternalApplicationConfiguration.g:2004:6: lv_scopes_2_0= ruleTypeScope
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getScopeSpecificationAccess().getScopesTypeScopeParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_scopes_2_0=ruleTypeScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getScopeSpecificationRule());
                      						}
                      						add(
                      							current,
                      							"scopes",
                      							lv_scopes_2_0,
                      							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.TypeScope");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalApplicationConfiguration.g:2021:4: (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==18) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:2022:5: otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_21); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getScopeSpecificationAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalApplicationConfiguration.g:2026:5: ( (lv_scopes_4_0= ruleTypeScope ) )
                    	    // InternalApplicationConfiguration.g:2027:6: (lv_scopes_4_0= ruleTypeScope )
                    	    {
                    	    // InternalApplicationConfiguration.g:2027:6: (lv_scopes_4_0= ruleTypeScope )
                    	    // InternalApplicationConfiguration.g:2028:7: lv_scopes_4_0= ruleTypeScope
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getScopeSpecificationAccess().getScopesTypeScopeParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_scopes_4_0=ruleTypeScope();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getScopeSpecificationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"scopes",
                    	      								lv_scopes_4_0,
                    	      								"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.TypeScope");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getScopeSpecificationAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScopeSpecification"


    // $ANTLR start "entryRuleTypeScope"
    // InternalApplicationConfiguration.g:2055:1: entryRuleTypeScope returns [EObject current=null] : iv_ruleTypeScope= ruleTypeScope EOF ;
    public final EObject entryRuleTypeScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeScope = null;


        try {
            // InternalApplicationConfiguration.g:2055:50: (iv_ruleTypeScope= ruleTypeScope EOF )
            // InternalApplicationConfiguration.g:2056:2: iv_ruleTypeScope= ruleTypeScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeScope=ruleTypeScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeScope; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeScope"


    // $ANTLR start "ruleTypeScope"
    // InternalApplicationConfiguration.g:2062:1: ruleTypeScope returns [EObject current=null] : ( ( ( (lv_min_0_0= RULE_INT ) ) ( ( (lv_greather_1_0= '<' ) ) | ( (lv_greaterOrEqual_2_0= '<=' ) ) ) )? otherlv_3= '#' ( (lv_type_4_0= ruleTypeReference ) ) ( ( ( (lv_less_5_0= '<' ) ) | ( (lv_lessOrEqual_6_0= '<=' ) ) ) ( (lv_max_7_0= RULE_INT ) ) )? ) ;
    public final EObject ruleTypeScope() throws RecognitionException {
        EObject current = null;

        Token lv_min_0_0=null;
        Token lv_greather_1_0=null;
        Token lv_greaterOrEqual_2_0=null;
        Token otherlv_3=null;
        Token lv_less_5_0=null;
        Token lv_lessOrEqual_6_0=null;
        Token lv_max_7_0=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2068:2: ( ( ( ( (lv_min_0_0= RULE_INT ) ) ( ( (lv_greather_1_0= '<' ) ) | ( (lv_greaterOrEqual_2_0= '<=' ) ) ) )? otherlv_3= '#' ( (lv_type_4_0= ruleTypeReference ) ) ( ( ( (lv_less_5_0= '<' ) ) | ( (lv_lessOrEqual_6_0= '<=' ) ) ) ( (lv_max_7_0= RULE_INT ) ) )? ) )
            // InternalApplicationConfiguration.g:2069:2: ( ( ( (lv_min_0_0= RULE_INT ) ) ( ( (lv_greather_1_0= '<' ) ) | ( (lv_greaterOrEqual_2_0= '<=' ) ) ) )? otherlv_3= '#' ( (lv_type_4_0= ruleTypeReference ) ) ( ( ( (lv_less_5_0= '<' ) ) | ( (lv_lessOrEqual_6_0= '<=' ) ) ) ( (lv_max_7_0= RULE_INT ) ) )? )
            {
            // InternalApplicationConfiguration.g:2069:2: ( ( ( (lv_min_0_0= RULE_INT ) ) ( ( (lv_greather_1_0= '<' ) ) | ( (lv_greaterOrEqual_2_0= '<=' ) ) ) )? otherlv_3= '#' ( (lv_type_4_0= ruleTypeReference ) ) ( ( ( (lv_less_5_0= '<' ) ) | ( (lv_lessOrEqual_6_0= '<=' ) ) ) ( (lv_max_7_0= RULE_INT ) ) )? )
            // InternalApplicationConfiguration.g:2070:3: ( ( (lv_min_0_0= RULE_INT ) ) ( ( (lv_greather_1_0= '<' ) ) | ( (lv_greaterOrEqual_2_0= '<=' ) ) ) )? otherlv_3= '#' ( (lv_type_4_0= ruleTypeReference ) ) ( ( ( (lv_less_5_0= '<' ) ) | ( (lv_lessOrEqual_6_0= '<=' ) ) ) ( (lv_max_7_0= RULE_INT ) ) )?
            {
            // InternalApplicationConfiguration.g:2070:3: ( ( (lv_min_0_0= RULE_INT ) ) ( ( (lv_greather_1_0= '<' ) ) | ( (lv_greaterOrEqual_2_0= '<=' ) ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalApplicationConfiguration.g:2071:4: ( (lv_min_0_0= RULE_INT ) ) ( ( (lv_greather_1_0= '<' ) ) | ( (lv_greaterOrEqual_2_0= '<=' ) ) )
                    {
                    // InternalApplicationConfiguration.g:2071:4: ( (lv_min_0_0= RULE_INT ) )
                    // InternalApplicationConfiguration.g:2072:5: (lv_min_0_0= RULE_INT )
                    {
                    // InternalApplicationConfiguration.g:2072:5: (lv_min_0_0= RULE_INT )
                    // InternalApplicationConfiguration.g:2073:6: lv_min_0_0= RULE_INT
                    {
                    lv_min_0_0=(Token)match(input,RULE_INT,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_min_0_0, grammarAccess.getTypeScopeAccess().getMinINTTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeScopeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"min",
                      							lv_min_0_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }

                    // InternalApplicationConfiguration.g:2089:4: ( ( (lv_greather_1_0= '<' ) ) | ( (lv_greaterOrEqual_2_0= '<=' ) ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==28) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==29) ) {
                        alt31=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalApplicationConfiguration.g:2090:5: ( (lv_greather_1_0= '<' ) )
                            {
                            // InternalApplicationConfiguration.g:2090:5: ( (lv_greather_1_0= '<' ) )
                            // InternalApplicationConfiguration.g:2091:6: (lv_greather_1_0= '<' )
                            {
                            // InternalApplicationConfiguration.g:2091:6: (lv_greather_1_0= '<' )
                            // InternalApplicationConfiguration.g:2092:7: lv_greather_1_0= '<'
                            {
                            lv_greather_1_0=(Token)match(input,28,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_greather_1_0, grammarAccess.getTypeScopeAccess().getGreatherLessThanSignKeyword_0_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTypeScopeRule());
                              							}
                              							setWithLastConsumed(current, "greather", true, "<");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalApplicationConfiguration.g:2105:5: ( (lv_greaterOrEqual_2_0= '<=' ) )
                            {
                            // InternalApplicationConfiguration.g:2105:5: ( (lv_greaterOrEqual_2_0= '<=' ) )
                            // InternalApplicationConfiguration.g:2106:6: (lv_greaterOrEqual_2_0= '<=' )
                            {
                            // InternalApplicationConfiguration.g:2106:6: (lv_greaterOrEqual_2_0= '<=' )
                            // InternalApplicationConfiguration.g:2107:7: lv_greaterOrEqual_2_0= '<='
                            {
                            lv_greaterOrEqual_2_0=(Token)match(input,29,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_greaterOrEqual_2_0, grammarAccess.getTypeScopeAccess().getGreaterOrEqualLessThanSignEqualsSignKeyword_0_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTypeScopeRule());
                              							}
                              							setWithLastConsumed(current, "greaterOrEqual", true, "<=");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTypeScopeAccess().getNumberSignKeyword_1());
              		
            }
            // InternalApplicationConfiguration.g:2125:3: ( (lv_type_4_0= ruleTypeReference ) )
            // InternalApplicationConfiguration.g:2126:4: (lv_type_4_0= ruleTypeReference )
            {
            // InternalApplicationConfiguration.g:2126:4: (lv_type_4_0= ruleTypeReference )
            // InternalApplicationConfiguration.g:2127:5: lv_type_4_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeScopeAccess().getTypeTypeReferenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_type_4_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeScopeRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_4_0,
              						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.TypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalApplicationConfiguration.g:2144:3: ( ( ( (lv_less_5_0= '<' ) ) | ( (lv_lessOrEqual_6_0= '<=' ) ) ) ( (lv_max_7_0= RULE_INT ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=28 && LA34_0<=29)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalApplicationConfiguration.g:2145:4: ( ( (lv_less_5_0= '<' ) ) | ( (lv_lessOrEqual_6_0= '<=' ) ) ) ( (lv_max_7_0= RULE_INT ) )
                    {
                    // InternalApplicationConfiguration.g:2145:4: ( ( (lv_less_5_0= '<' ) ) | ( (lv_lessOrEqual_6_0= '<=' ) ) )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==28) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==29) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalApplicationConfiguration.g:2146:5: ( (lv_less_5_0= '<' ) )
                            {
                            // InternalApplicationConfiguration.g:2146:5: ( (lv_less_5_0= '<' ) )
                            // InternalApplicationConfiguration.g:2147:6: (lv_less_5_0= '<' )
                            {
                            // InternalApplicationConfiguration.g:2147:6: (lv_less_5_0= '<' )
                            // InternalApplicationConfiguration.g:2148:7: lv_less_5_0= '<'
                            {
                            lv_less_5_0=(Token)match(input,28,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_less_5_0, grammarAccess.getTypeScopeAccess().getLessLessThanSignKeyword_3_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTypeScopeRule());
                              							}
                              							setWithLastConsumed(current, "less", true, "<");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalApplicationConfiguration.g:2161:5: ( (lv_lessOrEqual_6_0= '<=' ) )
                            {
                            // InternalApplicationConfiguration.g:2161:5: ( (lv_lessOrEqual_6_0= '<=' ) )
                            // InternalApplicationConfiguration.g:2162:6: (lv_lessOrEqual_6_0= '<=' )
                            {
                            // InternalApplicationConfiguration.g:2162:6: (lv_lessOrEqual_6_0= '<=' )
                            // InternalApplicationConfiguration.g:2163:7: lv_lessOrEqual_6_0= '<='
                            {
                            lv_lessOrEqual_6_0=(Token)match(input,29,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_lessOrEqual_6_0, grammarAccess.getTypeScopeAccess().getLessOrEqualLessThanSignEqualsSignKeyword_3_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTypeScopeRule());
                              							}
                              							setWithLastConsumed(current, "lessOrEqual", true, "<=");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalApplicationConfiguration.g:2176:4: ( (lv_max_7_0= RULE_INT ) )
                    // InternalApplicationConfiguration.g:2177:5: (lv_max_7_0= RULE_INT )
                    {
                    // InternalApplicationConfiguration.g:2177:5: (lv_max_7_0= RULE_INT )
                    // InternalApplicationConfiguration.g:2178:6: lv_max_7_0= RULE_INT
                    {
                    lv_max_7_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_max_7_0, grammarAccess.getTypeScopeAccess().getMaxINTTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeScopeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"max",
                      							lv_max_7_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeScope"


    // $ANTLR start "entryRuleTypeReference"
    // InternalApplicationConfiguration.g:2199:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalApplicationConfiguration.g:2199:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalApplicationConfiguration.g:2200:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalApplicationConfiguration.g:2206:1: ruleTypeReference returns [EObject current=null] : (this_ClassReference_0= ruleClassReference | this_ObjectReference_1= ruleObjectReference | this_IntegerReference_2= ruleIntegerReference | this_RealReference_3= ruleRealReference | this_StringReference_4= ruleStringReference ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_ClassReference_0 = null;

        EObject this_ObjectReference_1 = null;

        EObject this_IntegerReference_2 = null;

        EObject this_RealReference_3 = null;

        EObject this_StringReference_4 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2212:2: ( (this_ClassReference_0= ruleClassReference | this_ObjectReference_1= ruleObjectReference | this_IntegerReference_2= ruleIntegerReference | this_RealReference_3= ruleRealReference | this_StringReference_4= ruleStringReference ) )
            // InternalApplicationConfiguration.g:2213:2: (this_ClassReference_0= ruleClassReference | this_ObjectReference_1= ruleObjectReference | this_IntegerReference_2= ruleIntegerReference | this_RealReference_3= ruleRealReference | this_StringReference_4= ruleStringReference )
            {
            // InternalApplicationConfiguration.g:2213:2: (this_ClassReference_0= ruleClassReference | this_ObjectReference_1= ruleObjectReference | this_IntegerReference_2= ruleIntegerReference | this_RealReference_3= ruleRealReference | this_StringReference_4= ruleStringReference )
            int alt35=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt35=1;
                }
                break;
            case 33:
                {
                alt35=2;
                }
                break;
            case 34:
                {
                alt35=3;
                }
                break;
            case 35:
                {
                alt35=4;
                }
                break;
            case 36:
                {
                alt35=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalApplicationConfiguration.g:2214:3: this_ClassReference_0= ruleClassReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeReferenceAccess().getClassReferenceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ClassReference_0=ruleClassReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ClassReference_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:2223:3: this_ObjectReference_1= ruleObjectReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeReferenceAccess().getObjectReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ObjectReference_1=ruleObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ObjectReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalApplicationConfiguration.g:2232:3: this_IntegerReference_2= ruleIntegerReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeReferenceAccess().getIntegerReferenceParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntegerReference_2=ruleIntegerReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerReference_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalApplicationConfiguration.g:2241:3: this_RealReference_3= ruleRealReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeReferenceAccess().getRealReferenceParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RealReference_3=ruleRealReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RealReference_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalApplicationConfiguration.g:2250:3: this_StringReference_4= ruleStringReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeReferenceAccess().getStringReferenceParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringReference_4=ruleStringReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringReference_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleClassReference"
    // InternalApplicationConfiguration.g:2262:1: entryRuleClassReference returns [EObject current=null] : iv_ruleClassReference= ruleClassReference EOF ;
    public final EObject entryRuleClassReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassReference = null;


        try {
            // InternalApplicationConfiguration.g:2262:55: (iv_ruleClassReference= ruleClassReference EOF )
            // InternalApplicationConfiguration.g:2263:2: iv_ruleClassReference= ruleClassReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassReference=ruleClassReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassReference"


    // $ANTLR start "ruleClassReference"
    // InternalApplicationConfiguration.g:2269:1: ruleClassReference returns [EObject current=null] : (otherlv_0= '[' ( (lv_element_1_0= ruleMetamodelElement ) ) otherlv_2= ']' ) ;
    public final EObject ruleClassReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2275:2: ( (otherlv_0= '[' ( (lv_element_1_0= ruleMetamodelElement ) ) otherlv_2= ']' ) )
            // InternalApplicationConfiguration.g:2276:2: (otherlv_0= '[' ( (lv_element_1_0= ruleMetamodelElement ) ) otherlv_2= ']' )
            {
            // InternalApplicationConfiguration.g:2276:2: (otherlv_0= '[' ( (lv_element_1_0= ruleMetamodelElement ) ) otherlv_2= ']' )
            // InternalApplicationConfiguration.g:2277:3: otherlv_0= '[' ( (lv_element_1_0= ruleMetamodelElement ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getClassReferenceAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalApplicationConfiguration.g:2281:3: ( (lv_element_1_0= ruleMetamodelElement ) )
            // InternalApplicationConfiguration.g:2282:4: (lv_element_1_0= ruleMetamodelElement )
            {
            // InternalApplicationConfiguration.g:2282:4: (lv_element_1_0= ruleMetamodelElement )
            // InternalApplicationConfiguration.g:2283:5: lv_element_1_0= ruleMetamodelElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassReferenceAccess().getElementMetamodelElementParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_element_1_0=ruleMetamodelElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getClassReferenceRule());
              					}
              					set(
              						current,
              						"element",
              						lv_element_1_0,
              						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.MetamodelElement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getClassReferenceAccess().getRightSquareBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassReference"


    // $ANTLR start "entryRuleObjectReference"
    // InternalApplicationConfiguration.g:2308:1: entryRuleObjectReference returns [EObject current=null] : iv_ruleObjectReference= ruleObjectReference EOF ;
    public final EObject entryRuleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectReference = null;


        try {
            // InternalApplicationConfiguration.g:2308:56: (iv_ruleObjectReference= ruleObjectReference EOF )
            // InternalApplicationConfiguration.g:2309:2: iv_ruleObjectReference= ruleObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObjectReference=ruleObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectReference"


    // $ANTLR start "ruleObjectReference"
    // InternalApplicationConfiguration.g:2315:1: ruleObjectReference returns [EObject current=null] : ( () otherlv_1= 'Object' ) ;
    public final EObject ruleObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2321:2: ( ( () otherlv_1= 'Object' ) )
            // InternalApplicationConfiguration.g:2322:2: ( () otherlv_1= 'Object' )
            {
            // InternalApplicationConfiguration.g:2322:2: ( () otherlv_1= 'Object' )
            // InternalApplicationConfiguration.g:2323:3: () otherlv_1= 'Object'
            {
            // InternalApplicationConfiguration.g:2323:3: ()
            // InternalApplicationConfiguration.g:2324:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getObjectReferenceAccess().getObjectReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getObjectReferenceAccess().getObjectKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectReference"


    // $ANTLR start "entryRuleIntegerReference"
    // InternalApplicationConfiguration.g:2338:1: entryRuleIntegerReference returns [EObject current=null] : iv_ruleIntegerReference= ruleIntegerReference EOF ;
    public final EObject entryRuleIntegerReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerReference = null;


        try {
            // InternalApplicationConfiguration.g:2338:57: (iv_ruleIntegerReference= ruleIntegerReference EOF )
            // InternalApplicationConfiguration.g:2339:2: iv_ruleIntegerReference= ruleIntegerReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntegerReference=ruleIntegerReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerReference"


    // $ANTLR start "ruleIntegerReference"
    // InternalApplicationConfiguration.g:2345:1: ruleIntegerReference returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntegerReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2351:2: ( ( () otherlv_1= 'int' ) )
            // InternalApplicationConfiguration.g:2352:2: ( () otherlv_1= 'int' )
            {
            // InternalApplicationConfiguration.g:2352:2: ( () otherlv_1= 'int' )
            // InternalApplicationConfiguration.g:2353:3: () otherlv_1= 'int'
            {
            // InternalApplicationConfiguration.g:2353:3: ()
            // InternalApplicationConfiguration.g:2354:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIntegerReferenceAccess().getIntegerScopeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIntegerReferenceAccess().getIntKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerReference"


    // $ANTLR start "entryRuleRealReference"
    // InternalApplicationConfiguration.g:2368:1: entryRuleRealReference returns [EObject current=null] : iv_ruleRealReference= ruleRealReference EOF ;
    public final EObject entryRuleRealReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealReference = null;


        try {
            // InternalApplicationConfiguration.g:2368:54: (iv_ruleRealReference= ruleRealReference EOF )
            // InternalApplicationConfiguration.g:2369:2: iv_ruleRealReference= ruleRealReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRealReference=ruleRealReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealReference"


    // $ANTLR start "ruleRealReference"
    // InternalApplicationConfiguration.g:2375:1: ruleRealReference returns [EObject current=null] : ( () otherlv_1= 'real' ) ;
    public final EObject ruleRealReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2381:2: ( ( () otherlv_1= 'real' ) )
            // InternalApplicationConfiguration.g:2382:2: ( () otherlv_1= 'real' )
            {
            // InternalApplicationConfiguration.g:2382:2: ( () otherlv_1= 'real' )
            // InternalApplicationConfiguration.g:2383:3: () otherlv_1= 'real'
            {
            // InternalApplicationConfiguration.g:2383:3: ()
            // InternalApplicationConfiguration.g:2384:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRealReferenceAccess().getRealScopeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRealReferenceAccess().getRealKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealReference"


    // $ANTLR start "entryRuleStringReference"
    // InternalApplicationConfiguration.g:2398:1: entryRuleStringReference returns [EObject current=null] : iv_ruleStringReference= ruleStringReference EOF ;
    public final EObject entryRuleStringReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringReference = null;


        try {
            // InternalApplicationConfiguration.g:2398:56: (iv_ruleStringReference= ruleStringReference EOF )
            // InternalApplicationConfiguration.g:2399:2: iv_ruleStringReference= ruleStringReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringReference=ruleStringReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringReference"


    // $ANTLR start "ruleStringReference"
    // InternalApplicationConfiguration.g:2405:1: ruleStringReference returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2411:2: ( ( () otherlv_1= 'string' ) )
            // InternalApplicationConfiguration.g:2412:2: ( () otherlv_1= 'string' )
            {
            // InternalApplicationConfiguration.g:2412:2: ( () otherlv_1= 'string' )
            // InternalApplicationConfiguration.g:2413:3: () otherlv_1= 'string'
            {
            // InternalApplicationConfiguration.g:2413:3: ()
            // InternalApplicationConfiguration.g:2414:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStringReferenceAccess().getStringScopeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStringReferenceAccess().getStringKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringReference"


    // $ANTLR start "entryRuleScopeDeclaration"
    // InternalApplicationConfiguration.g:2428:1: entryRuleScopeDeclaration returns [EObject current=null] : iv_ruleScopeDeclaration= ruleScopeDeclaration EOF ;
    public final EObject entryRuleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:2428:57: (iv_ruleScopeDeclaration= ruleScopeDeclaration EOF )
            // InternalApplicationConfiguration.g:2429:2: iv_ruleScopeDeclaration= ruleScopeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopeDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScopeDeclaration=ruleScopeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScopeDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScopeDeclaration"


    // $ANTLR start "ruleScopeDeclaration"
    // InternalApplicationConfiguration.g:2435:1: ruleScopeDeclaration returns [EObject current=null] : (otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleScopeSpecification ) ) ) ;
    public final EObject ruleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_specification_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2441:2: ( (otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleScopeSpecification ) ) ) )
            // InternalApplicationConfiguration.g:2442:2: (otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleScopeSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:2442:2: (otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleScopeSpecification ) ) )
            // InternalApplicationConfiguration.g:2443:3: otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleScopeSpecification ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getScopeDeclarationAccess().getScopeKeyword_0());
              		
            }
            // InternalApplicationConfiguration.g:2447:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:2448:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:2448:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:2449:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getScopeDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getScopeDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalApplicationConfiguration.g:2465:3: ( (lv_specification_2_0= ruleScopeSpecification ) )
            // InternalApplicationConfiguration.g:2466:4: (lv_specification_2_0= ruleScopeSpecification )
            {
            // InternalApplicationConfiguration.g:2466:4: (lv_specification_2_0= ruleScopeSpecification )
            // InternalApplicationConfiguration.g:2467:5: lv_specification_2_0= ruleScopeSpecification
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScopeDeclarationAccess().getSpecificationScopeSpecificationParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_specification_2_0=ruleScopeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getScopeDeclarationRule());
              					}
              					set(
              						current,
              						"specification",
              						lv_specification_2_0,
              						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ScopeSpecification");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScopeDeclaration"


    // $ANTLR start "entryRuleScopeReference"
    // InternalApplicationConfiguration.g:2488:1: entryRuleScopeReference returns [EObject current=null] : iv_ruleScopeReference= ruleScopeReference EOF ;
    public final EObject entryRuleScopeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeReference = null;


        try {
            // InternalApplicationConfiguration.g:2488:55: (iv_ruleScopeReference= ruleScopeReference EOF )
            // InternalApplicationConfiguration.g:2489:2: iv_ruleScopeReference= ruleScopeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScopeReference=ruleScopeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScopeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScopeReference"


    // $ANTLR start "ruleScopeReference"
    // InternalApplicationConfiguration.g:2495:1: ruleScopeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleScopeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2501:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:2502:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:2502:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:2503:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:2503:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:2504:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getScopeReferenceRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getScopeReferenceAccess().getReferredScopeDeclarationCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScopeReference"


    // $ANTLR start "entryRuleScope"
    // InternalApplicationConfiguration.g:2518:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalApplicationConfiguration.g:2518:46: (iv_ruleScope= ruleScope EOF )
            // InternalApplicationConfiguration.g:2519:2: iv_ruleScope= ruleScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScope; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalApplicationConfiguration.g:2525:1: ruleScope returns [EObject current=null] : (this_ScopeSpecification_0= ruleScopeSpecification | this_ScopeReference_1= ruleScopeReference ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        EObject this_ScopeSpecification_0 = null;

        EObject this_ScopeReference_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2531:2: ( (this_ScopeSpecification_0= ruleScopeSpecification | this_ScopeReference_1= ruleScopeReference ) )
            // InternalApplicationConfiguration.g:2532:2: (this_ScopeSpecification_0= ruleScopeSpecification | this_ScopeReference_1= ruleScopeReference )
            {
            // InternalApplicationConfiguration.g:2532:2: (this_ScopeSpecification_0= ruleScopeSpecification | this_ScopeReference_1= ruleScopeReference )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==17) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalApplicationConfiguration.g:2533:3: this_ScopeSpecification_0= ruleScopeSpecification
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getScopeAccess().getScopeSpecificationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ScopeSpecification_0=ruleScopeSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ScopeSpecification_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:2542:3: this_ScopeReference_1= ruleScopeReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getScopeAccess().getScopeReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ScopeReference_1=ruleScopeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ScopeReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleTask"
    // InternalApplicationConfiguration.g:2554:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalApplicationConfiguration.g:2554:45: (iv_ruleTask= ruleTask EOF )
            // InternalApplicationConfiguration.g:2555:2: iv_ruleTask= ruleTask EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTaskRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTask; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalApplicationConfiguration.g:2561:1: ruleTask returns [EObject current=null] : this_GenerationTask_0= ruleGenerationTask ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        EObject this_GenerationTask_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2567:2: (this_GenerationTask_0= ruleGenerationTask )
            // InternalApplicationConfiguration.g:2568:2: this_GenerationTask_0= ruleGenerationTask
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getTaskAccess().getGenerationTaskParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_GenerationTask_0=ruleGenerationTask();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_GenerationTask_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleGenerationTask"
    // InternalApplicationConfiguration.g:2579:1: entryRuleGenerationTask returns [EObject current=null] : iv_ruleGenerationTask= ruleGenerationTask EOF ;
    public final EObject entryRuleGenerationTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerationTask = null;


        try {
            // InternalApplicationConfiguration.g:2579:55: (iv_ruleGenerationTask= ruleGenerationTask EOF )
            // InternalApplicationConfiguration.g:2580:2: iv_ruleGenerationTask= ruleGenerationTask EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenerationTaskRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGenerationTask=ruleGenerationTask();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerationTask; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenerationTask"


    // $ANTLR start "ruleGenerationTask"
    // InternalApplicationConfiguration.g:2586:1: ruleGenerationTask returns [EObject current=null] : (otherlv_0= 'generate' () otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* ) ) ) otherlv_40= '}' ) ;
    public final EObject ruleGenerationTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_number_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_runs_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        EObject lv_metamodel_6_0 = null;

        EObject lv_partialModel_9_0 = null;

        EObject lv_patterns_12_0 = null;

        EObject lv_scope_15_0 = null;

        Enumerator lv_solver_24_0 = null;

        EObject lv_config_27_0 = null;

        EObject lv_tagetFolder_30_0 = null;

        EObject lv_debugFolder_33_0 = null;

        EObject lv_targetLogFile_36_0 = null;

        EObject lv_targetStatisticsFile_39_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2592:2: ( (otherlv_0= 'generate' () otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* ) ) ) otherlv_40= '}' ) )
            // InternalApplicationConfiguration.g:2593:2: (otherlv_0= 'generate' () otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* ) ) ) otherlv_40= '}' )
            {
            // InternalApplicationConfiguration.g:2593:2: (otherlv_0= 'generate' () otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* ) ) ) otherlv_40= '}' )
            // InternalApplicationConfiguration.g:2594:3: otherlv_0= 'generate' () otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* ) ) ) otherlv_40= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGenerationTaskAccess().getGenerateKeyword_0());
              		
            }
            // InternalApplicationConfiguration.g:2598:3: ()
            // InternalApplicationConfiguration.g:2599:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGenerationTaskAccess().getGenerationTaskAction_1(),
              					current);
              			
            }

            }

            otherlv_2=(Token)match(input,17,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGenerationTaskAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalApplicationConfiguration.g:2609:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* ) ) )
            // InternalApplicationConfiguration.g:2610:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* ) )
            {
            // InternalApplicationConfiguration.g:2610:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* ) )
            // InternalApplicationConfiguration.g:2611:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());
            // InternalApplicationConfiguration.g:2614:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* )
            // InternalApplicationConfiguration.g:2615:6: ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )*
            {
            // InternalApplicationConfiguration.g:2615:6: ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )*
            loop37:
            do {
                int alt37=13;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:2616:4: ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2616:4: ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2617:5: {...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalApplicationConfiguration.g:2617:111: ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2618:6: ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 0);
            	    // InternalApplicationConfiguration.g:2621:9: ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) )
            	    // InternalApplicationConfiguration.g:2621:10: {...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2621:19: (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) )
            	    // InternalApplicationConfiguration.g:2621:20: otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGenerationTaskAccess().getMetamodelKeyword_3_0_0());
            	      								
            	    }
            	    otherlv_5=(Token)match(input,16,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_0_1());
            	      								
            	    }
            	    // InternalApplicationConfiguration.g:2629:9: ( (lv_metamodel_6_0= ruleMetamodel ) )
            	    // InternalApplicationConfiguration.g:2630:10: (lv_metamodel_6_0= ruleMetamodel )
            	    {
            	    // InternalApplicationConfiguration.g:2630:10: (lv_metamodel_6_0= ruleMetamodel )
            	    // InternalApplicationConfiguration.g:2631:11: lv_metamodel_6_0= ruleMetamodel
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGenerationTaskAccess().getMetamodelMetamodelParserRuleCall_3_0_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_metamodel_6_0=ruleMetamodel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGenerationTaskRule());
            	      											}
            	      											set(
            	      												current,
            	      												"metamodel",
            	      												lv_metamodel_6_0,
            	      												"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.Metamodel");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalApplicationConfiguration.g:2654:4: ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2654:4: ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2655:5: {...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalApplicationConfiguration.g:2655:111: ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2656:6: ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 1);
            	    // InternalApplicationConfiguration.g:2659:9: ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) )
            	    // InternalApplicationConfiguration.g:2659:10: {...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2659:19: (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) )
            	    // InternalApplicationConfiguration.g:2659:20: otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) )
            	    {
            	    otherlv_7=(Token)match(input,25,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getGenerationTaskAccess().getPartialModelKeyword_3_1_0());
            	      								
            	    }
            	    otherlv_8=(Token)match(input,16,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_1_1());
            	      								
            	    }
            	    // InternalApplicationConfiguration.g:2667:9: ( (lv_partialModel_9_0= rulePartialModel ) )
            	    // InternalApplicationConfiguration.g:2668:10: (lv_partialModel_9_0= rulePartialModel )
            	    {
            	    // InternalApplicationConfiguration.g:2668:10: (lv_partialModel_9_0= rulePartialModel )
            	    // InternalApplicationConfiguration.g:2669:11: lv_partialModel_9_0= rulePartialModel
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGenerationTaskAccess().getPartialModelPartialModelParserRuleCall_3_1_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_partialModel_9_0=rulePartialModel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGenerationTaskRule());
            	      											}
            	      											set(
            	      												current,
            	      												"partialModel",
            	      												lv_partialModel_9_0,
            	      												"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.PartialModel");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalApplicationConfiguration.g:2692:4: ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2692:4: ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2693:5: {...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalApplicationConfiguration.g:2693:111: ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2694:6: ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 2);
            	    // InternalApplicationConfiguration.g:2697:9: ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) )
            	    // InternalApplicationConfiguration.g:2697:10: {...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2697:19: (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) )
            	    // InternalApplicationConfiguration.g:2697:20: otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) )
            	    {
            	    otherlv_10=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_10, grammarAccess.getGenerationTaskAccess().getPatternsKeyword_3_2_0());
            	      								
            	    }
            	    otherlv_11=(Token)match(input,16,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_2_1());
            	      								
            	    }
            	    // InternalApplicationConfiguration.g:2705:9: ( (lv_patterns_12_0= ruleGraphPattern ) )
            	    // InternalApplicationConfiguration.g:2706:10: (lv_patterns_12_0= ruleGraphPattern )
            	    {
            	    // InternalApplicationConfiguration.g:2706:10: (lv_patterns_12_0= ruleGraphPattern )
            	    // InternalApplicationConfiguration.g:2707:11: lv_patterns_12_0= ruleGraphPattern
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGenerationTaskAccess().getPatternsGraphPatternParserRuleCall_3_2_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_patterns_12_0=ruleGraphPattern();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGenerationTaskRule());
            	      											}
            	      											set(
            	      												current,
            	      												"patterns",
            	      												lv_patterns_12_0,
            	      												"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.GraphPattern");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalApplicationConfiguration.g:2730:4: ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2730:4: ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2731:5: {...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalApplicationConfiguration.g:2731:111: ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2732:6: ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 3);
            	    // InternalApplicationConfiguration.g:2735:9: ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) )
            	    // InternalApplicationConfiguration.g:2735:10: {...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2735:19: (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) )
            	    // InternalApplicationConfiguration.g:2735:20: otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) )
            	    {
            	    otherlv_13=(Token)match(input,37,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_13, grammarAccess.getGenerationTaskAccess().getScopeKeyword_3_3_0());
            	      								
            	    }
            	    otherlv_14=(Token)match(input,16,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_14, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_3_1());
            	      								
            	    }
            	    // InternalApplicationConfiguration.g:2743:9: ( (lv_scope_15_0= ruleScope ) )
            	    // InternalApplicationConfiguration.g:2744:10: (lv_scope_15_0= ruleScope )
            	    {
            	    // InternalApplicationConfiguration.g:2744:10: (lv_scope_15_0= ruleScope )
            	    // InternalApplicationConfiguration.g:2745:11: lv_scope_15_0= ruleScope
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGenerationTaskAccess().getScopeScopeParserRuleCall_3_3_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_scope_15_0=ruleScope();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGenerationTaskRule());
            	      											}
            	      											set(
            	      												current,
            	      												"scope",
            	      												lv_scope_15_0,
            	      												"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.Scope");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalApplicationConfiguration.g:2768:4: ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2768:4: ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2769:5: {...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalApplicationConfiguration.g:2769:111: ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2770:6: ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 4);
            	    // InternalApplicationConfiguration.g:2773:9: ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) )
            	    // InternalApplicationConfiguration.g:2773:10: {...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2773:19: (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) )
            	    // InternalApplicationConfiguration.g:2773:20: otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) )
            	    {
            	    otherlv_16=(Token)match(input,39,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_16, grammarAccess.getGenerationTaskAccess().getNumberKeyword_3_4_0());
            	      								
            	    }
            	    otherlv_17=(Token)match(input,16,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_17, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_4_1());
            	      								
            	    }
            	    // InternalApplicationConfiguration.g:2781:9: ( (lv_number_18_0= RULE_INT ) )
            	    // InternalApplicationConfiguration.g:2782:10: (lv_number_18_0= RULE_INT )
            	    {
            	    // InternalApplicationConfiguration.g:2782:10: (lv_number_18_0= RULE_INT )
            	    // InternalApplicationConfiguration.g:2783:11: lv_number_18_0= RULE_INT
            	    {
            	    lv_number_18_0=(Token)match(input,RULE_INT,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(lv_number_18_0, grammarAccess.getGenerationTaskAccess().getNumberINTTerminalRuleCall_3_4_2_0());
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getGenerationTaskRule());
            	      											}
            	      											setWithLastConsumed(
            	      												current,
            	      												"number",
            	      												lv_number_18_0,
            	      												"org.eclipse.xtext.common.Terminals.INT");
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalApplicationConfiguration.g:2805:4: ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2805:4: ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2806:5: {...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalApplicationConfiguration.g:2806:111: ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2807:6: ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 5);
            	    // InternalApplicationConfiguration.g:2810:9: ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) )
            	    // InternalApplicationConfiguration.g:2810:10: {...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2810:19: (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) )
            	    // InternalApplicationConfiguration.g:2810:20: otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) )
            	    {
            	    otherlv_19=(Token)match(input,40,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_19, grammarAccess.getGenerationTaskAccess().getRunsKeyword_3_5_0());
            	      								
            	    }
            	    otherlv_20=(Token)match(input,16,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_20, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_5_1());
            	      								
            	    }
            	    // InternalApplicationConfiguration.g:2818:9: ( (lv_runs_21_0= RULE_INT ) )
            	    // InternalApplicationConfiguration.g:2819:10: (lv_runs_21_0= RULE_INT )
            	    {
            	    // InternalApplicationConfiguration.g:2819:10: (lv_runs_21_0= RULE_INT )
            	    // InternalApplicationConfiguration.g:2820:11: lv_runs_21_0= RULE_INT
            	    {
            	    lv_runs_21_0=(Token)match(input,RULE_INT,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(lv_runs_21_0, grammarAccess.getGenerationTaskAccess().getRunsINTTerminalRuleCall_3_5_2_0());
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getGenerationTaskRule());
            	      											}
            	      											setWithLastConsumed(
            	      												current,
            	      												"runs",
            	      												lv_runs_21_0,
            	      												"org.eclipse.xtext.common.Terminals.INT");
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalApplicationConfiguration.g:2842:4: ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2842:4: ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2843:5: {...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalApplicationConfiguration.g:2843:111: ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2844:6: ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 6);
            	    // InternalApplicationConfiguration.g:2847:9: ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) )
            	    // InternalApplicationConfiguration.g:2847:10: {...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2847:19: (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) )
            	    // InternalApplicationConfiguration.g:2847:20: otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) )
            	    {
            	    otherlv_22=(Token)match(input,41,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_22, grammarAccess.getGenerationTaskAccess().getSolverKeyword_3_6_0());
            	      								
            	    }
            	    otherlv_23=(Token)match(input,16,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_23, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_6_1());
            	      								
            	    }
            	    // InternalApplicationConfiguration.g:2855:9: ( (lv_solver_24_0= ruleSolver ) )
            	    // InternalApplicationConfiguration.g:2856:10: (lv_solver_24_0= ruleSolver )
            	    {
            	    // InternalApplicationConfiguration.g:2856:10: (lv_solver_24_0= ruleSolver )
            	    // InternalApplicationConfiguration.g:2857:11: lv_solver_24_0= ruleSolver
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGenerationTaskAccess().getSolverSolverEnumRuleCall_3_6_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_solver_24_0=ruleSolver();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGenerationTaskRule());
            	      											}
            	      											set(
            	      												current,
            	      												"solver",
            	      												lv_solver_24_0,
            	      												"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.Solver");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalApplicationConfiguration.g:2880:4: ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2880:4: ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2881:5: {...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 7) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalApplicationConfiguration.g:2881:111: ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2882:6: ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 7);
            	    // InternalApplicationConfiguration.g:2885:9: ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) )
            	    // InternalApplicationConfiguration.g:2885:10: {...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2885:19: (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) )
            	    // InternalApplicationConfiguration.g:2885:20: otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) )
            	    {
            	    otherlv_25=(Token)match(input,27,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_25, grammarAccess.getGenerationTaskAccess().getConfigKeyword_3_7_0());
            	      								
            	    }
            	    otherlv_26=(Token)match(input,16,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_26, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_7_1());
            	      								
            	    }
            	    // InternalApplicationConfiguration.g:2893:9: ( (lv_config_27_0= ruleConfig ) )
            	    // InternalApplicationConfiguration.g:2894:10: (lv_config_27_0= ruleConfig )
            	    {
            	    // InternalApplicationConfiguration.g:2894:10: (lv_config_27_0= ruleConfig )
            	    // InternalApplicationConfiguration.g:2895:11: lv_config_27_0= ruleConfig
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGenerationTaskAccess().getConfigConfigParserRuleCall_3_7_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_config_27_0=ruleConfig();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGenerationTaskRule());
            	      											}
            	      											set(
            	      												current,
            	      												"config",
            	      												lv_config_27_0,
            	      												"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.Config");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalApplicationConfiguration.g:2918:4: ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2918:4: ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2919:5: {...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 8) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalApplicationConfiguration.g:2919:111: ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2920:6: ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 8);
            	    // InternalApplicationConfiguration.g:2923:9: ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) )
            	    // InternalApplicationConfiguration.g:2923:10: {...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2923:19: (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) )
            	    // InternalApplicationConfiguration.g:2923:20: otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) )
            	    {
            	    otherlv_28=(Token)match(input,42,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_28, grammarAccess.getGenerationTaskAccess().getOutputKeyword_3_8_0());
            	      								
            	    }
            	    otherlv_29=(Token)match(input,16,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_29, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_8_1());
            	      								
            	    }
            	    // InternalApplicationConfiguration.g:2931:9: ( (lv_tagetFolder_30_0= ruleFile ) )
            	    // InternalApplicationConfiguration.g:2932:10: (lv_tagetFolder_30_0= ruleFile )
            	    {
            	    // InternalApplicationConfiguration.g:2932:10: (lv_tagetFolder_30_0= ruleFile )
            	    // InternalApplicationConfiguration.g:2933:11: lv_tagetFolder_30_0= ruleFile
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGenerationTaskAccess().getTagetFolderFileParserRuleCall_3_8_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_tagetFolder_30_0=ruleFile();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGenerationTaskRule());
            	      											}
            	      											set(
            	      												current,
            	      												"tagetFolder",
            	      												lv_tagetFolder_30_0,
            	      												"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.File");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalApplicationConfiguration.g:2956:4: ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2956:4: ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2957:5: {...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 9) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalApplicationConfiguration.g:2957:111: ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2958:6: ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 9);
            	    // InternalApplicationConfiguration.g:2961:9: ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) )
            	    // InternalApplicationConfiguration.g:2961:10: {...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2961:19: (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) )
            	    // InternalApplicationConfiguration.g:2961:20: otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) )
            	    {
            	    otherlv_31=(Token)match(input,43,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_31, grammarAccess.getGenerationTaskAccess().getDebugKeyword_3_9_0());
            	      								
            	    }
            	    otherlv_32=(Token)match(input,16,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_32, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_9_1());
            	      								
            	    }
            	    // InternalApplicationConfiguration.g:2969:9: ( (lv_debugFolder_33_0= ruleFile ) )
            	    // InternalApplicationConfiguration.g:2970:10: (lv_debugFolder_33_0= ruleFile )
            	    {
            	    // InternalApplicationConfiguration.g:2970:10: (lv_debugFolder_33_0= ruleFile )
            	    // InternalApplicationConfiguration.g:2971:11: lv_debugFolder_33_0= ruleFile
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGenerationTaskAccess().getDebugFolderFileParserRuleCall_3_9_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_debugFolder_33_0=ruleFile();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGenerationTaskRule());
            	      											}
            	      											set(
            	      												current,
            	      												"debugFolder",
            	      												lv_debugFolder_33_0,
            	      												"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.File");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalApplicationConfiguration.g:2994:4: ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2994:4: ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2995:5: {...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 10) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // InternalApplicationConfiguration.g:2995:112: ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2996:6: ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 10);
            	    // InternalApplicationConfiguration.g:2999:9: ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) )
            	    // InternalApplicationConfiguration.g:2999:10: {...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2999:19: (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) )
            	    // InternalApplicationConfiguration.g:2999:20: otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) )
            	    {
            	    otherlv_34=(Token)match(input,44,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_34, grammarAccess.getGenerationTaskAccess().getLogKeyword_3_10_0());
            	      								
            	    }
            	    otherlv_35=(Token)match(input,16,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_35, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_10_1());
            	      								
            	    }
            	    // InternalApplicationConfiguration.g:3007:9: ( (lv_targetLogFile_36_0= ruleFile ) )
            	    // InternalApplicationConfiguration.g:3008:10: (lv_targetLogFile_36_0= ruleFile )
            	    {
            	    // InternalApplicationConfiguration.g:3008:10: (lv_targetLogFile_36_0= ruleFile )
            	    // InternalApplicationConfiguration.g:3009:11: lv_targetLogFile_36_0= ruleFile
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGenerationTaskAccess().getTargetLogFileFileParserRuleCall_3_10_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_targetLogFile_36_0=ruleFile();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGenerationTaskRule());
            	      											}
            	      											set(
            	      												current,
            	      												"targetLogFile",
            	      												lv_targetLogFile_36_0,
            	      												"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.File");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalApplicationConfiguration.g:3032:4: ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:3032:4: ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:3033:5: {...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 11) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // InternalApplicationConfiguration.g:3033:112: ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) )
            	    // InternalApplicationConfiguration.g:3034:6: ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 11);
            	    // InternalApplicationConfiguration.g:3037:9: ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) )
            	    // InternalApplicationConfiguration.g:3037:10: {...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:3037:19: (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) )
            	    // InternalApplicationConfiguration.g:3037:20: otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) )
            	    {
            	    otherlv_37=(Token)match(input,45,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_37, grammarAccess.getGenerationTaskAccess().getStatisticsKeyword_3_11_0());
            	      								
            	    }
            	    otherlv_38=(Token)match(input,16,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_38, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_11_1());
            	      								
            	    }
            	    // InternalApplicationConfiguration.g:3045:9: ( (lv_targetStatisticsFile_39_0= ruleFile ) )
            	    // InternalApplicationConfiguration.g:3046:10: (lv_targetStatisticsFile_39_0= ruleFile )
            	    {
            	    // InternalApplicationConfiguration.g:3046:10: (lv_targetStatisticsFile_39_0= ruleFile )
            	    // InternalApplicationConfiguration.g:3047:11: lv_targetStatisticsFile_39_0= ruleFile
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGenerationTaskAccess().getTargetStatisticsFileFileParserRuleCall_3_11_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_targetStatisticsFile_39_0=ruleFile();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGenerationTaskRule());
            	      											}
            	      											set(
            	      												current,
            	      												"targetStatisticsFile",
            	      												lv_targetStatisticsFile_39_0,
            	      												"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.File");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());

            }

            otherlv_40=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_40, grammarAccess.getGenerationTaskAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenerationTask"


    // $ANTLR start "ruleSolver"
    // InternalApplicationConfiguration.g:3085:1: ruleSolver returns [Enumerator current=null] : ( (enumLiteral_0= 'SMTSolver' ) | (enumLiteral_1= 'AlloySolver' ) | (enumLiteral_2= 'ViatraSolver' ) ) ;
    public final Enumerator ruleSolver() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:3091:2: ( ( (enumLiteral_0= 'SMTSolver' ) | (enumLiteral_1= 'AlloySolver' ) | (enumLiteral_2= 'ViatraSolver' ) ) )
            // InternalApplicationConfiguration.g:3092:2: ( (enumLiteral_0= 'SMTSolver' ) | (enumLiteral_1= 'AlloySolver' ) | (enumLiteral_2= 'ViatraSolver' ) )
            {
            // InternalApplicationConfiguration.g:3092:2: ( (enumLiteral_0= 'SMTSolver' ) | (enumLiteral_1= 'AlloySolver' ) | (enumLiteral_2= 'ViatraSolver' ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt38=1;
                }
                break;
            case 47:
                {
                alt38=2;
                }
                break;
            case 48:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalApplicationConfiguration.g:3093:3: (enumLiteral_0= 'SMTSolver' )
                    {
                    // InternalApplicationConfiguration.g:3093:3: (enumLiteral_0= 'SMTSolver' )
                    // InternalApplicationConfiguration.g:3094:4: enumLiteral_0= 'SMTSolver'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSolverAccess().getSMTSolverEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSolverAccess().getSMTSolverEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:3101:3: (enumLiteral_1= 'AlloySolver' )
                    {
                    // InternalApplicationConfiguration.g:3101:3: (enumLiteral_1= 'AlloySolver' )
                    // InternalApplicationConfiguration.g:3102:4: enumLiteral_1= 'AlloySolver'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSolverAccess().getAlloySolverEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getSolverAccess().getAlloySolverEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalApplicationConfiguration.g:3109:3: (enumLiteral_2= 'ViatraSolver' )
                    {
                    // InternalApplicationConfiguration.g:3109:3: (enumLiteral_2= 'ViatraSolver' )
                    // InternalApplicationConfiguration.g:3110:4: enumLiteral_2= 'ViatraSolver'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSolverAccess().getViatraSolverEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getSolverAccess().getViatraSolverEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSolver"

    // $ANTLR start synpred1_InternalApplicationConfiguration
    public final void synpred1_InternalApplicationConfiguration_fragment() throws RecognitionException {   
        // InternalApplicationConfiguration.g:182:5: ( '.' )
        // InternalApplicationConfiguration.g:182:6: '.'
        {
        match(input,11,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalApplicationConfiguration

    // Delegated rules

    public final boolean synpred1_InternalApplicationConfiguration() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalApplicationConfiguration_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA37 dfa37 = new DFA37(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\23\15\uffff";
    static final String dfa_3s = "\1\55\15\uffff";
    static final String dfa_4s = "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_5s = "\1\0\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\3\uffff\1\2\1\uffff\1\3\1\4\1\11\11\uffff\1\5\1\uffff\1\6\1\7\1\10\1\12\1\13\1\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 2615:6: ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_0 = input.LA(1);

                         
                        int index37_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA37_0==19) ) {s = 1;}

                        else if ( LA37_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA37_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA37_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA37_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA37_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA37_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA37_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA37_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA37_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA37_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                        else if ( LA37_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 10) ) {s = 12;}

                        else if ( LA37_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 11) ) {s = 13;}

                         
                        input.seek(index37_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000600E809002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000600E808002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040080040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001E80000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00003FA00E880000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001C00000000000L});

}
