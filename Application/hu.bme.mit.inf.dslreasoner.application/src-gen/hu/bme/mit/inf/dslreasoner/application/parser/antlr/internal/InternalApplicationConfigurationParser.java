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

@SuppressWarnings("all")
public class InternalApplicationConfigurationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'import'", "'epackage'", "'viatra'", "'file'", "'='", "'{'", "','", "'}'", "'package'", "'excluding'", "'::'", "'metamodel'", "'folder'", "'models'", "'patterns'", "'config'", "'#'", "'+='", "'..'", "'*'", "'<'", "'>'", "'node'", "'int'", "'real'", "'string'", "'scope'", "'generate'", "'partial-model'", "'number'", "'runs'", "'solver'", "'output'", "'debug'", "'log'", "'statistics'", "'SMTSolver'", "'AlloySolver'", "'ViatraSolver'"
    };
    public static final int T__50=50;
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
             newCompositeNode(grammarAccess.getConfigurationScriptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationScript=ruleConfigurationScript();

            state._fsp--;

             current =iv_ruleConfigurationScript; 
            match(input,EOF,FOLLOW_2); 

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

            	    					newCompositeNode(grammarAccess.getConfigurationScriptAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


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

                if ( (LA2_0==15||LA2_0==23||(LA2_0>=25 && LA2_0<=27)||(LA2_0>=38 && LA2_0<=39)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:100:4: (lv_commands_1_0= ruleCommand )
            	    {
            	    // InternalApplicationConfiguration.g:100:4: (lv_commands_1_0= ruleCommand )
            	    // InternalApplicationConfiguration.g:101:5: lv_commands_1_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationScriptAccess().getCommandsCommandParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_commands_1_0=ruleCommand();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

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

            if ( (LA3_0==15||LA3_0==23||(LA3_0>=25 && LA3_0<=27)||LA3_0==38) ) {
                alt3=1;
            }
            else if ( (LA3_0==39) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalApplicationConfiguration.g:137:3: this_Declaration_0= ruleDeclaration
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Declaration_0=ruleDeclaration();

                    state._fsp--;


                    			current = this_Declaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:146:3: this_Task_1= ruleTask
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getTaskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Task_1=ruleTask();

                    state._fsp--;


                    			current = this_Task_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:165:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:171:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalApplicationConfiguration.g:172:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalApplicationConfiguration.g:172:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalApplicationConfiguration.g:173:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalApplicationConfiguration.g:180:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:181:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:198:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalApplicationConfiguration.g:198:47: (iv_ruleImport= ruleImport EOF )
            // InternalApplicationConfiguration.g:199:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:205:1: ruleImport returns [EObject current=null] : (this_EPackageImport_0= ruleEPackageImport | this_ViatraImport_1= ruleViatraImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_EPackageImport_0 = null;

        EObject this_ViatraImport_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:211:2: ( (this_EPackageImport_0= ruleEPackageImport | this_ViatraImport_1= ruleViatraImport ) )
            // InternalApplicationConfiguration.g:212:2: (this_EPackageImport_0= ruleEPackageImport | this_ViatraImport_1= ruleViatraImport )
            {
            // InternalApplicationConfiguration.g:212:2: (this_EPackageImport_0= ruleEPackageImport | this_ViatraImport_1= ruleViatraImport )
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
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalApplicationConfiguration.g:213:3: this_EPackageImport_0= ruleEPackageImport
                    {

                    			newCompositeNode(grammarAccess.getImportAccess().getEPackageImportParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EPackageImport_0=ruleEPackageImport();

                    state._fsp--;


                    			current = this_EPackageImport_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:222:3: this_ViatraImport_1= ruleViatraImport
                    {

                    			newCompositeNode(grammarAccess.getImportAccess().getViatraImportParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ViatraImport_1=ruleViatraImport();

                    state._fsp--;


                    			current = this_ViatraImport_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:234:1: entryRuleEPackageImport returns [EObject current=null] : iv_ruleEPackageImport= ruleEPackageImport EOF ;
    public final EObject entryRuleEPackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPackageImport = null;


        try {
            // InternalApplicationConfiguration.g:234:55: (iv_ruleEPackageImport= ruleEPackageImport EOF )
            // InternalApplicationConfiguration.g:235:2: iv_ruleEPackageImport= ruleEPackageImport EOF
            {
             newCompositeNode(grammarAccess.getEPackageImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPackageImport=ruleEPackageImport();

            state._fsp--;

             current =iv_ruleEPackageImport; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:241:1: ruleEPackageImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= 'epackage' ( (otherlv_2= RULE_STRING ) ) ) ;
    public final EObject ruleEPackageImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:247:2: ( (otherlv_0= 'import' otherlv_1= 'epackage' ( (otherlv_2= RULE_STRING ) ) ) )
            // InternalApplicationConfiguration.g:248:2: (otherlv_0= 'import' otherlv_1= 'epackage' ( (otherlv_2= RULE_STRING ) ) )
            {
            // InternalApplicationConfiguration.g:248:2: (otherlv_0= 'import' otherlv_1= 'epackage' ( (otherlv_2= RULE_STRING ) ) )
            // InternalApplicationConfiguration.g:249:3: otherlv_0= 'import' otherlv_1= 'epackage' ( (otherlv_2= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getEPackageImportAccess().getImportKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getEPackageImportAccess().getEpackageKeyword_1());
            		
            // InternalApplicationConfiguration.g:257:3: ( (otherlv_2= RULE_STRING ) )
            // InternalApplicationConfiguration.g:258:4: (otherlv_2= RULE_STRING )
            {
            // InternalApplicationConfiguration.g:258:4: (otherlv_2= RULE_STRING )
            // InternalApplicationConfiguration.g:259:5: otherlv_2= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPackageImportRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getEPackageImportAccess().getImportedPackageEPackageCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:274:1: entryRuleViatraImport returns [EObject current=null] : iv_ruleViatraImport= ruleViatraImport EOF ;
    public final EObject entryRuleViatraImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViatraImport = null;


        try {
            // InternalApplicationConfiguration.g:274:53: (iv_ruleViatraImport= ruleViatraImport EOF )
            // InternalApplicationConfiguration.g:275:2: iv_ruleViatraImport= ruleViatraImport EOF
            {
             newCompositeNode(grammarAccess.getViatraImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViatraImport=ruleViatraImport();

            state._fsp--;

             current =iv_ruleViatraImport; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:281:1: ruleViatraImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= 'viatra' ( (otherlv_2= RULE_STRING ) ) ) ;
    public final EObject ruleViatraImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:287:2: ( (otherlv_0= 'import' otherlv_1= 'viatra' ( (otherlv_2= RULE_STRING ) ) ) )
            // InternalApplicationConfiguration.g:288:2: (otherlv_0= 'import' otherlv_1= 'viatra' ( (otherlv_2= RULE_STRING ) ) )
            {
            // InternalApplicationConfiguration.g:288:2: (otherlv_0= 'import' otherlv_1= 'viatra' ( (otherlv_2= RULE_STRING ) ) )
            // InternalApplicationConfiguration.g:289:3: otherlv_0= 'import' otherlv_1= 'viatra' ( (otherlv_2= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getViatraImportAccess().getImportKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getViatraImportAccess().getViatraKeyword_1());
            		
            // InternalApplicationConfiguration.g:297:3: ( (otherlv_2= RULE_STRING ) )
            // InternalApplicationConfiguration.g:298:4: (otherlv_2= RULE_STRING )
            {
            // InternalApplicationConfiguration.g:298:4: (otherlv_2= RULE_STRING )
            // InternalApplicationConfiguration.g:299:5: otherlv_2= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getViatraImportRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getViatraImportAccess().getImportedViatraPatternModelCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:314:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:314:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalApplicationConfiguration.g:315:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:321:1: ruleDeclaration returns [EObject current=null] : (this_FileDeclaration_0= ruleFileDeclaration | this_MetamodelDeclaration_1= ruleMetamodelDeclaration | this_PartialModelDeclaration_2= rulePartialModelDeclaration | this_GraphPatternDeclaration_3= ruleGraphPatternDeclaration | this_ConfigDeclaration_4= ruleConfigDeclaration | this_ScopeDeclaration_5= ruleScopeDeclaration ) ;
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
            // InternalApplicationConfiguration.g:327:2: ( (this_FileDeclaration_0= ruleFileDeclaration | this_MetamodelDeclaration_1= ruleMetamodelDeclaration | this_PartialModelDeclaration_2= rulePartialModelDeclaration | this_GraphPatternDeclaration_3= ruleGraphPatternDeclaration | this_ConfigDeclaration_4= ruleConfigDeclaration | this_ScopeDeclaration_5= ruleScopeDeclaration ) )
            // InternalApplicationConfiguration.g:328:2: (this_FileDeclaration_0= ruleFileDeclaration | this_MetamodelDeclaration_1= ruleMetamodelDeclaration | this_PartialModelDeclaration_2= rulePartialModelDeclaration | this_GraphPatternDeclaration_3= ruleGraphPatternDeclaration | this_ConfigDeclaration_4= ruleConfigDeclaration | this_ScopeDeclaration_5= ruleScopeDeclaration )
            {
            // InternalApplicationConfiguration.g:328:2: (this_FileDeclaration_0= ruleFileDeclaration | this_MetamodelDeclaration_1= ruleMetamodelDeclaration | this_PartialModelDeclaration_2= rulePartialModelDeclaration | this_GraphPatternDeclaration_3= ruleGraphPatternDeclaration | this_ConfigDeclaration_4= ruleConfigDeclaration | this_ScopeDeclaration_5= ruleScopeDeclaration )
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
            case 38:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalApplicationConfiguration.g:329:3: this_FileDeclaration_0= ruleFileDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getFileDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FileDeclaration_0=ruleFileDeclaration();

                    state._fsp--;


                    			current = this_FileDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:338:3: this_MetamodelDeclaration_1= ruleMetamodelDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getMetamodelDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MetamodelDeclaration_1=ruleMetamodelDeclaration();

                    state._fsp--;


                    			current = this_MetamodelDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalApplicationConfiguration.g:347:3: this_PartialModelDeclaration_2= rulePartialModelDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getPartialModelDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PartialModelDeclaration_2=rulePartialModelDeclaration();

                    state._fsp--;


                    			current = this_PartialModelDeclaration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalApplicationConfiguration.g:356:3: this_GraphPatternDeclaration_3= ruleGraphPatternDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getGraphPatternDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphPatternDeclaration_3=ruleGraphPatternDeclaration();

                    state._fsp--;


                    			current = this_GraphPatternDeclaration_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalApplicationConfiguration.g:365:3: this_ConfigDeclaration_4= ruleConfigDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getConfigDeclarationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConfigDeclaration_4=ruleConfigDeclaration();

                    state._fsp--;


                    			current = this_ConfigDeclaration_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalApplicationConfiguration.g:374:3: this_ScopeDeclaration_5= ruleScopeDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getScopeDeclarationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScopeDeclaration_5=ruleScopeDeclaration();

                    state._fsp--;


                    			current = this_ScopeDeclaration_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:386:1: entryRuleFileSpecification returns [EObject current=null] : iv_ruleFileSpecification= ruleFileSpecification EOF ;
    public final EObject entryRuleFileSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileSpecification = null;


        try {
            // InternalApplicationConfiguration.g:386:58: (iv_ruleFileSpecification= ruleFileSpecification EOF )
            // InternalApplicationConfiguration.g:387:2: iv_ruleFileSpecification= ruleFileSpecification EOF
            {
             newCompositeNode(grammarAccess.getFileSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileSpecification=ruleFileSpecification();

            state._fsp--;

             current =iv_ruleFileSpecification; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:393:1: ruleFileSpecification returns [EObject current=null] : ( (lv_path_0_0= RULE_STRING ) ) ;
    public final EObject ruleFileSpecification() throws RecognitionException {
        EObject current = null;

        Token lv_path_0_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:399:2: ( ( (lv_path_0_0= RULE_STRING ) ) )
            // InternalApplicationConfiguration.g:400:2: ( (lv_path_0_0= RULE_STRING ) )
            {
            // InternalApplicationConfiguration.g:400:2: ( (lv_path_0_0= RULE_STRING ) )
            // InternalApplicationConfiguration.g:401:3: (lv_path_0_0= RULE_STRING )
            {
            // InternalApplicationConfiguration.g:401:3: (lv_path_0_0= RULE_STRING )
            // InternalApplicationConfiguration.g:402:4: lv_path_0_0= RULE_STRING
            {
            lv_path_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_path_0_0, grammarAccess.getFileSpecificationAccess().getPathSTRINGTerminalRuleCall_0());
            			

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


            	leaveRule();

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
    // InternalApplicationConfiguration.g:421:1: entryRuleFileDeclaration returns [EObject current=null] : iv_ruleFileDeclaration= ruleFileDeclaration EOF ;
    public final EObject entryRuleFileDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:421:56: (iv_ruleFileDeclaration= ruleFileDeclaration EOF )
            // InternalApplicationConfiguration.g:422:2: iv_ruleFileDeclaration= ruleFileDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFileDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileDeclaration=ruleFileDeclaration();

            state._fsp--;

             current =iv_ruleFileDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:428:1: ruleFileDeclaration returns [EObject current=null] : (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_specification_3_0= ruleFileSpecification ) ) ) ;
    public final EObject ruleFileDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_specification_3_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:434:2: ( (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_specification_3_0= ruleFileSpecification ) ) ) )
            // InternalApplicationConfiguration.g:435:2: (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_specification_3_0= ruleFileSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:435:2: (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_specification_3_0= ruleFileSpecification ) ) )
            // InternalApplicationConfiguration.g:436:3: otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_specification_3_0= ruleFileSpecification ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFileDeclarationAccess().getFileKeyword_0());
            		
            // InternalApplicationConfiguration.g:440:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:441:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:441:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:442:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFileDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFileDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalApplicationConfiguration.g:462:3: ( (lv_specification_3_0= ruleFileSpecification ) )
            // InternalApplicationConfiguration.g:463:4: (lv_specification_3_0= ruleFileSpecification )
            {
            // InternalApplicationConfiguration.g:463:4: (lv_specification_3_0= ruleFileSpecification )
            // InternalApplicationConfiguration.g:464:5: lv_specification_3_0= ruleFileSpecification
            {

            					newCompositeNode(grammarAccess.getFileDeclarationAccess().getSpecificationFileSpecificationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_specification_3_0=ruleFileSpecification();

            state._fsp--;


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


            	leaveRule();

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
    // InternalApplicationConfiguration.g:485:1: entryRuleFileReference returns [EObject current=null] : iv_ruleFileReference= ruleFileReference EOF ;
    public final EObject entryRuleFileReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileReference = null;


        try {
            // InternalApplicationConfiguration.g:485:54: (iv_ruleFileReference= ruleFileReference EOF )
            // InternalApplicationConfiguration.g:486:2: iv_ruleFileReference= ruleFileReference EOF
            {
             newCompositeNode(grammarAccess.getFileReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileReference=ruleFileReference();

            state._fsp--;

             current =iv_ruleFileReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:492:1: ruleFileReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleFileReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:498:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:499:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:499:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:500:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:500:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:501:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFileReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getFileReferenceAccess().getReferredFileDeclarationCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:515:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalApplicationConfiguration.g:515:45: (iv_ruleFile= ruleFile EOF )
            // InternalApplicationConfiguration.g:516:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:522:1: ruleFile returns [EObject current=null] : (this_FileSpecification_0= ruleFileSpecification | this_FileReference_1= ruleFileReference ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject this_FileSpecification_0 = null;

        EObject this_FileReference_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:528:2: ( (this_FileSpecification_0= ruleFileSpecification | this_FileReference_1= ruleFileReference ) )
            // InternalApplicationConfiguration.g:529:2: (this_FileSpecification_0= ruleFileSpecification | this_FileReference_1= ruleFileReference )
            {
            // InternalApplicationConfiguration.g:529:2: (this_FileSpecification_0= ruleFileSpecification | this_FileReference_1= ruleFileReference )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalApplicationConfiguration.g:530:3: this_FileSpecification_0= ruleFileSpecification
                    {

                    			newCompositeNode(grammarAccess.getFileAccess().getFileSpecificationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FileSpecification_0=ruleFileSpecification();

                    state._fsp--;


                    			current = this_FileSpecification_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:539:3: this_FileReference_1= ruleFileReference
                    {

                    			newCompositeNode(grammarAccess.getFileAccess().getFileReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FileReference_1=ruleFileReference();

                    state._fsp--;


                    			current = this_FileReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:551:1: entryRuleMetamodelSpecification returns [EObject current=null] : iv_ruleMetamodelSpecification= ruleMetamodelSpecification EOF ;
    public final EObject entryRuleMetamodelSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelSpecification = null;


        try {
            // InternalApplicationConfiguration.g:551:63: (iv_ruleMetamodelSpecification= ruleMetamodelSpecification EOF )
            // InternalApplicationConfiguration.g:552:2: iv_ruleMetamodelSpecification= ruleMetamodelSpecification EOF
            {
             newCompositeNode(grammarAccess.getMetamodelSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetamodelSpecification=ruleMetamodelSpecification();

            state._fsp--;

             current =iv_ruleMetamodelSpecification; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:558:1: ruleMetamodelSpecification returns [EObject current=null] : (otherlv_0= '{' ( (lv_entries_1_0= ruleMetamodelEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleMetamodelSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:564:2: ( (otherlv_0= '{' ( (lv_entries_1_0= ruleMetamodelEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )* otherlv_4= '}' ) )
            // InternalApplicationConfiguration.g:565:2: (otherlv_0= '{' ( (lv_entries_1_0= ruleMetamodelEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )* otherlv_4= '}' )
            {
            // InternalApplicationConfiguration.g:565:2: (otherlv_0= '{' ( (lv_entries_1_0= ruleMetamodelEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )* otherlv_4= '}' )
            // InternalApplicationConfiguration.g:566:3: otherlv_0= '{' ( (lv_entries_1_0= ruleMetamodelEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getMetamodelSpecificationAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalApplicationConfiguration.g:570:3: ( (lv_entries_1_0= ruleMetamodelEntry ) )
            // InternalApplicationConfiguration.g:571:4: (lv_entries_1_0= ruleMetamodelEntry )
            {
            // InternalApplicationConfiguration.g:571:4: (lv_entries_1_0= ruleMetamodelEntry )
            // InternalApplicationConfiguration.g:572:5: lv_entries_1_0= ruleMetamodelEntry
            {

            					newCompositeNode(grammarAccess.getMetamodelSpecificationAccess().getEntriesMetamodelEntryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_entries_1_0=ruleMetamodelEntry();

            state._fsp--;


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

            // InternalApplicationConfiguration.g:589:3: (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:590:4: otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMetamodelSpecificationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalApplicationConfiguration.g:594:4: ( (lv_entries_3_0= ruleMetamodelEntry ) )
            	    // InternalApplicationConfiguration.g:595:5: (lv_entries_3_0= ruleMetamodelEntry )
            	    {
            	    // InternalApplicationConfiguration.g:595:5: (lv_entries_3_0= ruleMetamodelEntry )
            	    // InternalApplicationConfiguration.g:596:6: lv_entries_3_0= ruleMetamodelEntry
            	    {

            	    						newCompositeNode(grammarAccess.getMetamodelSpecificationAccess().getEntriesMetamodelEntryParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_entries_3_0=ruleMetamodelEntry();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMetamodelSpecificationAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:622:1: entryRuleMetamodelEntry returns [EObject current=null] : iv_ruleMetamodelEntry= ruleMetamodelEntry EOF ;
    public final EObject entryRuleMetamodelEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelEntry = null;


        try {
            // InternalApplicationConfiguration.g:622:55: (iv_ruleMetamodelEntry= ruleMetamodelEntry EOF )
            // InternalApplicationConfiguration.g:623:2: iv_ruleMetamodelEntry= ruleMetamodelEntry EOF
            {
             newCompositeNode(grammarAccess.getMetamodelEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetamodelEntry=ruleMetamodelEntry();

            state._fsp--;

             current =iv_ruleMetamodelEntry; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:629:1: ruleMetamodelEntry returns [EObject current=null] : (this_MetamodelElement_0= ruleMetamodelElement | this_AllPackageEntry_1= ruleAllPackageEntry ) ;
    public final EObject ruleMetamodelEntry() throws RecognitionException {
        EObject current = null;

        EObject this_MetamodelElement_0 = null;

        EObject this_AllPackageEntry_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:635:2: ( (this_MetamodelElement_0= ruleMetamodelElement | this_AllPackageEntry_1= ruleAllPackageEntry ) )
            // InternalApplicationConfiguration.g:636:2: (this_MetamodelElement_0= ruleMetamodelElement | this_AllPackageEntry_1= ruleAllPackageEntry )
            {
            // InternalApplicationConfiguration.g:636:2: (this_MetamodelElement_0= ruleMetamodelElement | this_AllPackageEntry_1= ruleAllPackageEntry )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalApplicationConfiguration.g:637:3: this_MetamodelElement_0= ruleMetamodelElement
                    {

                    			newCompositeNode(grammarAccess.getMetamodelEntryAccess().getMetamodelElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MetamodelElement_0=ruleMetamodelElement();

                    state._fsp--;


                    			current = this_MetamodelElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:646:3: this_AllPackageEntry_1= ruleAllPackageEntry
                    {

                    			newCompositeNode(grammarAccess.getMetamodelEntryAccess().getAllPackageEntryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllPackageEntry_1=ruleAllPackageEntry();

                    state._fsp--;


                    			current = this_AllPackageEntry_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:658:1: entryRuleAllPackageEntry returns [EObject current=null] : iv_ruleAllPackageEntry= ruleAllPackageEntry EOF ;
    public final EObject entryRuleAllPackageEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllPackageEntry = null;


        try {
            // InternalApplicationConfiguration.g:658:56: (iv_ruleAllPackageEntry= ruleAllPackageEntry EOF )
            // InternalApplicationConfiguration.g:659:2: iv_ruleAllPackageEntry= ruleAllPackageEntry EOF
            {
             newCompositeNode(grammarAccess.getAllPackageEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllPackageEntry=ruleAllPackageEntry();

            state._fsp--;

             current =iv_ruleAllPackageEntry; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:665:1: ruleAllPackageEntry returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )? ) ;
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
            // InternalApplicationConfiguration.g:671:2: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )? ) )
            // InternalApplicationConfiguration.g:672:2: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )? )
            {
            // InternalApplicationConfiguration.g:672:2: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )? )
            // InternalApplicationConfiguration.g:673:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAllPackageEntryAccess().getPackageKeyword_0());
            		
            // InternalApplicationConfiguration.g:677:3: ( ( ruleQualifiedName ) )
            // InternalApplicationConfiguration.g:678:4: ( ruleQualifiedName )
            {
            // InternalApplicationConfiguration.g:678:4: ( ruleQualifiedName )
            // InternalApplicationConfiguration.g:679:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllPackageEntryRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllPackageEntryAccess().getPackageEPackageCrossReference_1_0());
            				
            pushFollow(FOLLOW_13);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApplicationConfiguration.g:693:3: (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalApplicationConfiguration.g:694:4: otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getAllPackageEntryAccess().getExcludingKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllPackageEntryAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalApplicationConfiguration.g:702:4: ( (lv_exclusion_4_0= ruleMetamodelElement ) )
                    // InternalApplicationConfiguration.g:703:5: (lv_exclusion_4_0= ruleMetamodelElement )
                    {
                    // InternalApplicationConfiguration.g:703:5: (lv_exclusion_4_0= ruleMetamodelElement )
                    // InternalApplicationConfiguration.g:704:6: lv_exclusion_4_0= ruleMetamodelElement
                    {

                    						newCompositeNode(grammarAccess.getAllPackageEntryAccess().getExclusionMetamodelElementParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_exclusion_4_0=ruleMetamodelElement();

                    state._fsp--;


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

                    // InternalApplicationConfiguration.g:721:4: (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==18) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:722:5: otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAllPackageEntryAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalApplicationConfiguration.g:726:5: ( (lv_exclusion_6_0= ruleMetamodelElement ) )
                    	    // InternalApplicationConfiguration.g:727:6: (lv_exclusion_6_0= ruleMetamodelElement )
                    	    {
                    	    // InternalApplicationConfiguration.g:727:6: (lv_exclusion_6_0= ruleMetamodelElement )
                    	    // InternalApplicationConfiguration.g:728:7: lv_exclusion_6_0= ruleMetamodelElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getAllPackageEntryAccess().getExclusionMetamodelElementParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_exclusion_6_0=ruleMetamodelElement();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getAllPackageEntryAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:755:1: entryRuleMetamodelElement returns [EObject current=null] : iv_ruleMetamodelElement= ruleMetamodelElement EOF ;
    public final EObject entryRuleMetamodelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelElement = null;


        try {
            // InternalApplicationConfiguration.g:755:57: (iv_ruleMetamodelElement= ruleMetamodelElement EOF )
            // InternalApplicationConfiguration.g:756:2: iv_ruleMetamodelElement= ruleMetamodelElement EOF
            {
             newCompositeNode(grammarAccess.getMetamodelElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetamodelElement=ruleMetamodelElement();

            state._fsp--;

             current =iv_ruleMetamodelElement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:762:1: ruleMetamodelElement returns [EObject current=null] : ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleMetamodelElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:768:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalApplicationConfiguration.g:769:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalApplicationConfiguration.g:769:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? )
            // InternalApplicationConfiguration.g:770:3: ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalApplicationConfiguration.g:770:3: ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )?
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
                    // InternalApplicationConfiguration.g:771:4: ( ( ruleQualifiedName ) ) otherlv_1= '::'
                    {
                    // InternalApplicationConfiguration.g:771:4: ( ( ruleQualifiedName ) )
                    // InternalApplicationConfiguration.g:772:5: ( ruleQualifiedName )
                    {
                    // InternalApplicationConfiguration.g:772:5: ( ruleQualifiedName )
                    // InternalApplicationConfiguration.g:773:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMetamodelElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMetamodelElementAccess().getPackageEPackageCrossReference_0_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getMetamodelElementAccess().getColonColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalApplicationConfiguration.g:792:3: ( (otherlv_2= RULE_ID ) )
            // InternalApplicationConfiguration.g:793:4: (otherlv_2= RULE_ID )
            {
            // InternalApplicationConfiguration.g:793:4: (otherlv_2= RULE_ID )
            // InternalApplicationConfiguration.g:794:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetamodelElementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_2, grammarAccess.getMetamodelElementAccess().getClassifierEClassifierCrossReference_1_0());
            				

            }


            }

            // InternalApplicationConfiguration.g:805:3: (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==11) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalApplicationConfiguration.g:806:4: otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,11,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getMetamodelElementAccess().getFullStopKeyword_2_0());
                    			
                    // InternalApplicationConfiguration.g:810:4: ( (otherlv_4= RULE_ID ) )
                    // InternalApplicationConfiguration.g:811:5: (otherlv_4= RULE_ID )
                    {
                    // InternalApplicationConfiguration.g:811:5: (otherlv_4= RULE_ID )
                    // InternalApplicationConfiguration.g:812:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMetamodelElementRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getMetamodelElementAccess().getFeatureENamedElementCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:828:1: entryRuleMetamodelDeclaration returns [EObject current=null] : iv_ruleMetamodelDeclaration= ruleMetamodelDeclaration EOF ;
    public final EObject entryRuleMetamodelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:828:61: (iv_ruleMetamodelDeclaration= ruleMetamodelDeclaration EOF )
            // InternalApplicationConfiguration.g:829:2: iv_ruleMetamodelDeclaration= ruleMetamodelDeclaration EOF
            {
             newCompositeNode(grammarAccess.getMetamodelDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetamodelDeclaration=ruleMetamodelDeclaration();

            state._fsp--;

             current =iv_ruleMetamodelDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:835:1: ruleMetamodelDeclaration returns [EObject current=null] : (otherlv_0= 'metamodel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleMetamodelSpecification ) ) ) ;
    public final EObject ruleMetamodelDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_specification_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:841:2: ( (otherlv_0= 'metamodel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleMetamodelSpecification ) ) ) )
            // InternalApplicationConfiguration.g:842:2: (otherlv_0= 'metamodel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleMetamodelSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:842:2: (otherlv_0= 'metamodel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleMetamodelSpecification ) ) )
            // InternalApplicationConfiguration.g:843:3: otherlv_0= 'metamodel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleMetamodelSpecification ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMetamodelDeclarationAccess().getMetamodelKeyword_0());
            		
            // InternalApplicationConfiguration.g:847:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:848:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:848:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:849:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMetamodelDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalApplicationConfiguration.g:865:3: ( (lv_specification_2_0= ruleMetamodelSpecification ) )
            // InternalApplicationConfiguration.g:866:4: (lv_specification_2_0= ruleMetamodelSpecification )
            {
            // InternalApplicationConfiguration.g:866:4: (lv_specification_2_0= ruleMetamodelSpecification )
            // InternalApplicationConfiguration.g:867:5: lv_specification_2_0= ruleMetamodelSpecification
            {

            					newCompositeNode(grammarAccess.getMetamodelDeclarationAccess().getSpecificationMetamodelSpecificationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_specification_2_0=ruleMetamodelSpecification();

            state._fsp--;


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


            	leaveRule();

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
    // InternalApplicationConfiguration.g:888:1: entryRuleMetamodelReference returns [EObject current=null] : iv_ruleMetamodelReference= ruleMetamodelReference EOF ;
    public final EObject entryRuleMetamodelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelReference = null;


        try {
            // InternalApplicationConfiguration.g:888:59: (iv_ruleMetamodelReference= ruleMetamodelReference EOF )
            // InternalApplicationConfiguration.g:889:2: iv_ruleMetamodelReference= ruleMetamodelReference EOF
            {
             newCompositeNode(grammarAccess.getMetamodelReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetamodelReference=ruleMetamodelReference();

            state._fsp--;

             current =iv_ruleMetamodelReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:895:1: ruleMetamodelReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleMetamodelReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:901:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:902:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:902:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:903:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:903:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:904:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMetamodelReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getMetamodelReferenceAccess().getReferredMetamodelDeclarationCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:918:1: entryRuleMetamodel returns [EObject current=null] : iv_ruleMetamodel= ruleMetamodel EOF ;
    public final EObject entryRuleMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodel = null;


        try {
            // InternalApplicationConfiguration.g:918:50: (iv_ruleMetamodel= ruleMetamodel EOF )
            // InternalApplicationConfiguration.g:919:2: iv_ruleMetamodel= ruleMetamodel EOF
            {
             newCompositeNode(grammarAccess.getMetamodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetamodel=ruleMetamodel();

            state._fsp--;

             current =iv_ruleMetamodel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:925:1: ruleMetamodel returns [EObject current=null] : (this_MetamodelReference_0= ruleMetamodelReference | this_MetamodelSpecification_1= ruleMetamodelSpecification ) ;
    public final EObject ruleMetamodel() throws RecognitionException {
        EObject current = null;

        EObject this_MetamodelReference_0 = null;

        EObject this_MetamodelSpecification_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:931:2: ( (this_MetamodelReference_0= ruleMetamodelReference | this_MetamodelSpecification_1= ruleMetamodelSpecification ) )
            // InternalApplicationConfiguration.g:932:2: (this_MetamodelReference_0= ruleMetamodelReference | this_MetamodelSpecification_1= ruleMetamodelSpecification )
            {
            // InternalApplicationConfiguration.g:932:2: (this_MetamodelReference_0= ruleMetamodelReference | this_MetamodelSpecification_1= ruleMetamodelSpecification )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==17) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalApplicationConfiguration.g:933:3: this_MetamodelReference_0= ruleMetamodelReference
                    {

                    			newCompositeNode(grammarAccess.getMetamodelAccess().getMetamodelReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MetamodelReference_0=ruleMetamodelReference();

                    state._fsp--;


                    			current = this_MetamodelReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:942:3: this_MetamodelSpecification_1= ruleMetamodelSpecification
                    {

                    			newCompositeNode(grammarAccess.getMetamodelAccess().getMetamodelSpecificationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MetamodelSpecification_1=ruleMetamodelSpecification();

                    state._fsp--;


                    			current = this_MetamodelSpecification_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:954:1: entryRulePartialModelSpecification returns [EObject current=null] : iv_rulePartialModelSpecification= rulePartialModelSpecification EOF ;
    public final EObject entryRulePartialModelSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialModelSpecification = null;


        try {
            // InternalApplicationConfiguration.g:954:66: (iv_rulePartialModelSpecification= rulePartialModelSpecification EOF )
            // InternalApplicationConfiguration.g:955:2: iv_rulePartialModelSpecification= rulePartialModelSpecification EOF
            {
             newCompositeNode(grammarAccess.getPartialModelSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartialModelSpecification=rulePartialModelSpecification();

            state._fsp--;

             current =iv_rulePartialModelSpecification; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:961:1: rulePartialModelSpecification returns [EObject current=null] : (otherlv_0= '{' ( (lv_entry_1_0= rulePartialModelEntry ) ) (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )? otherlv_4= '}' ) ;
    public final EObject rulePartialModelSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entry_1_0 = null;

        EObject lv_entry_3_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:967:2: ( (otherlv_0= '{' ( (lv_entry_1_0= rulePartialModelEntry ) ) (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )? otherlv_4= '}' ) )
            // InternalApplicationConfiguration.g:968:2: (otherlv_0= '{' ( (lv_entry_1_0= rulePartialModelEntry ) ) (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )? otherlv_4= '}' )
            {
            // InternalApplicationConfiguration.g:968:2: (otherlv_0= '{' ( (lv_entry_1_0= rulePartialModelEntry ) ) (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )? otherlv_4= '}' )
            // InternalApplicationConfiguration.g:969:3: otherlv_0= '{' ( (lv_entry_1_0= rulePartialModelEntry ) ) (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getPartialModelSpecificationAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalApplicationConfiguration.g:973:3: ( (lv_entry_1_0= rulePartialModelEntry ) )
            // InternalApplicationConfiguration.g:974:4: (lv_entry_1_0= rulePartialModelEntry )
            {
            // InternalApplicationConfiguration.g:974:4: (lv_entry_1_0= rulePartialModelEntry )
            // InternalApplicationConfiguration.g:975:5: lv_entry_1_0= rulePartialModelEntry
            {

            					newCompositeNode(grammarAccess.getPartialModelSpecificationAccess().getEntryPartialModelEntryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_entry_1_0=rulePartialModelEntry();

            state._fsp--;


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

            // InternalApplicationConfiguration.g:992:3: (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalApplicationConfiguration.g:993:4: otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getPartialModelSpecificationAccess().getCommaKeyword_2_0());
                    			
                    // InternalApplicationConfiguration.g:997:4: ( (lv_entry_3_0= rulePartialModelEntry ) )
                    // InternalApplicationConfiguration.g:998:5: (lv_entry_3_0= rulePartialModelEntry )
                    {
                    // InternalApplicationConfiguration.g:998:5: (lv_entry_3_0= rulePartialModelEntry )
                    // InternalApplicationConfiguration.g:999:6: lv_entry_3_0= rulePartialModelEntry
                    {

                    						newCompositeNode(grammarAccess.getPartialModelSpecificationAccess().getEntryPartialModelEntryParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_entry_3_0=rulePartialModelEntry();

                    state._fsp--;


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
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPartialModelSpecificationAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1025:1: entryRulePartialModelEntry returns [EObject current=null] : iv_rulePartialModelEntry= rulePartialModelEntry EOF ;
    public final EObject entryRulePartialModelEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialModelEntry = null;


        try {
            // InternalApplicationConfiguration.g:1025:58: (iv_rulePartialModelEntry= rulePartialModelEntry EOF )
            // InternalApplicationConfiguration.g:1026:2: iv_rulePartialModelEntry= rulePartialModelEntry EOF
            {
             newCompositeNode(grammarAccess.getPartialModelEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartialModelEntry=rulePartialModelEntry();

            state._fsp--;

             current =iv_rulePartialModelEntry; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1032:1: rulePartialModelEntry returns [EObject current=null] : (this_ModelEntry_0= ruleModelEntry | this_FolderEntry_1= ruleFolderEntry ) ;
    public final EObject rulePartialModelEntry() throws RecognitionException {
        EObject current = null;

        EObject this_ModelEntry_0 = null;

        EObject this_FolderEntry_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1038:2: ( (this_ModelEntry_0= ruleModelEntry | this_FolderEntry_1= ruleFolderEntry ) )
            // InternalApplicationConfiguration.g:1039:2: (this_ModelEntry_0= ruleModelEntry | this_FolderEntry_1= ruleFolderEntry )
            {
            // InternalApplicationConfiguration.g:1039:2: (this_ModelEntry_0= ruleModelEntry | this_FolderEntry_1= ruleFolderEntry )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)) ) {
                alt16=1;
            }
            else if ( (LA16_0==24) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalApplicationConfiguration.g:1040:3: this_ModelEntry_0= ruleModelEntry
                    {

                    			newCompositeNode(grammarAccess.getPartialModelEntryAccess().getModelEntryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModelEntry_0=ruleModelEntry();

                    state._fsp--;


                    			current = this_ModelEntry_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:1049:3: this_FolderEntry_1= ruleFolderEntry
                    {

                    			newCompositeNode(grammarAccess.getPartialModelEntryAccess().getFolderEntryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FolderEntry_1=ruleFolderEntry();

                    state._fsp--;


                    			current = this_FolderEntry_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1061:1: entryRuleModelEntry returns [EObject current=null] : iv_ruleModelEntry= ruleModelEntry EOF ;
    public final EObject entryRuleModelEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelEntry = null;


        try {
            // InternalApplicationConfiguration.g:1061:51: (iv_ruleModelEntry= ruleModelEntry EOF )
            // InternalApplicationConfiguration.g:1062:2: iv_ruleModelEntry= ruleModelEntry EOF
            {
             newCompositeNode(grammarAccess.getModelEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelEntry=ruleModelEntry();

            state._fsp--;

             current =iv_ruleModelEntry; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1068:1: ruleModelEntry returns [EObject current=null] : ( (lv_path_0_0= ruleFile ) ) ;
    public final EObject ruleModelEntry() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1074:2: ( ( (lv_path_0_0= ruleFile ) ) )
            // InternalApplicationConfiguration.g:1075:2: ( (lv_path_0_0= ruleFile ) )
            {
            // InternalApplicationConfiguration.g:1075:2: ( (lv_path_0_0= ruleFile ) )
            // InternalApplicationConfiguration.g:1076:3: (lv_path_0_0= ruleFile )
            {
            // InternalApplicationConfiguration.g:1076:3: (lv_path_0_0= ruleFile )
            // InternalApplicationConfiguration.g:1077:4: lv_path_0_0= ruleFile
            {

            				newCompositeNode(grammarAccess.getModelEntryAccess().getPathFileParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_path_0_0=ruleFile();

            state._fsp--;


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


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1097:1: entryRuleFolderEntry returns [EObject current=null] : iv_ruleFolderEntry= ruleFolderEntry EOF ;
    public final EObject entryRuleFolderEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFolderEntry = null;


        try {
            // InternalApplicationConfiguration.g:1097:52: (iv_ruleFolderEntry= ruleFolderEntry EOF )
            // InternalApplicationConfiguration.g:1098:2: iv_ruleFolderEntry= ruleFolderEntry EOF
            {
             newCompositeNode(grammarAccess.getFolderEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFolderEntry=ruleFolderEntry();

            state._fsp--;

             current =iv_ruleFolderEntry; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1104:1: ruleFolderEntry returns [EObject current=null] : (otherlv_0= 'folder' ( (lv_path_1_0= ruleFile ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )? ) ;
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
            // InternalApplicationConfiguration.g:1110:2: ( (otherlv_0= 'folder' ( (lv_path_1_0= ruleFile ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )? ) )
            // InternalApplicationConfiguration.g:1111:2: (otherlv_0= 'folder' ( (lv_path_1_0= ruleFile ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )? )
            {
            // InternalApplicationConfiguration.g:1111:2: (otherlv_0= 'folder' ( (lv_path_1_0= ruleFile ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )? )
            // InternalApplicationConfiguration.g:1112:3: otherlv_0= 'folder' ( (lv_path_1_0= ruleFile ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getFolderEntryAccess().getFolderKeyword_0());
            		
            // InternalApplicationConfiguration.g:1116:3: ( (lv_path_1_0= ruleFile ) )
            // InternalApplicationConfiguration.g:1117:4: (lv_path_1_0= ruleFile )
            {
            // InternalApplicationConfiguration.g:1117:4: (lv_path_1_0= ruleFile )
            // InternalApplicationConfiguration.g:1118:5: lv_path_1_0= ruleFile
            {

            					newCompositeNode(grammarAccess.getFolderEntryAccess().getPathFileParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_path_1_0=ruleFile();

            state._fsp--;


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

            // InternalApplicationConfiguration.g:1135:3: (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalApplicationConfiguration.g:1136:4: otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getFolderEntryAccess().getExcludingKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,17,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getFolderEntryAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalApplicationConfiguration.g:1144:4: ( (lv_exclusion_4_0= ruleModelEntry ) )
                    // InternalApplicationConfiguration.g:1145:5: (lv_exclusion_4_0= ruleModelEntry )
                    {
                    // InternalApplicationConfiguration.g:1145:5: (lv_exclusion_4_0= ruleModelEntry )
                    // InternalApplicationConfiguration.g:1146:6: lv_exclusion_4_0= ruleModelEntry
                    {

                    						newCompositeNode(grammarAccess.getFolderEntryAccess().getExclusionModelEntryParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_exclusion_4_0=ruleModelEntry();

                    state._fsp--;


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

                    // InternalApplicationConfiguration.g:1163:4: (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==18) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:1164:5: otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFolderEntryAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalApplicationConfiguration.g:1168:5: ( (lv_exclusion_6_0= ruleModelEntry ) )
                    	    // InternalApplicationConfiguration.g:1169:6: (lv_exclusion_6_0= ruleModelEntry )
                    	    {
                    	    // InternalApplicationConfiguration.g:1169:6: (lv_exclusion_6_0= ruleModelEntry )
                    	    // InternalApplicationConfiguration.g:1170:7: lv_exclusion_6_0= ruleModelEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getFolderEntryAccess().getExclusionModelEntryParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_exclusion_6_0=ruleModelEntry();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getFolderEntryAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1197:1: entryRulePartialModelDeclaration returns [EObject current=null] : iv_rulePartialModelDeclaration= rulePartialModelDeclaration EOF ;
    public final EObject entryRulePartialModelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialModelDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:1197:64: (iv_rulePartialModelDeclaration= rulePartialModelDeclaration EOF )
            // InternalApplicationConfiguration.g:1198:2: iv_rulePartialModelDeclaration= rulePartialModelDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPartialModelDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartialModelDeclaration=rulePartialModelDeclaration();

            state._fsp--;

             current =iv_rulePartialModelDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1204:1: rulePartialModelDeclaration returns [EObject current=null] : (otherlv_0= 'models' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePartialModelSpecification ) ) ) ;
    public final EObject rulePartialModelDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_specification_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1210:2: ( (otherlv_0= 'models' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePartialModelSpecification ) ) ) )
            // InternalApplicationConfiguration.g:1211:2: (otherlv_0= 'models' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePartialModelSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:1211:2: (otherlv_0= 'models' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePartialModelSpecification ) ) )
            // InternalApplicationConfiguration.g:1212:3: otherlv_0= 'models' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePartialModelSpecification ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPartialModelDeclarationAccess().getModelsKeyword_0());
            		
            // InternalApplicationConfiguration.g:1216:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:1217:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1217:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:1218:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPartialModelDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalApplicationConfiguration.g:1234:3: ( (lv_specification_2_0= rulePartialModelSpecification ) )
            // InternalApplicationConfiguration.g:1235:4: (lv_specification_2_0= rulePartialModelSpecification )
            {
            // InternalApplicationConfiguration.g:1235:4: (lv_specification_2_0= rulePartialModelSpecification )
            // InternalApplicationConfiguration.g:1236:5: lv_specification_2_0= rulePartialModelSpecification
            {

            					newCompositeNode(grammarAccess.getPartialModelDeclarationAccess().getSpecificationPartialModelSpecificationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_specification_2_0=rulePartialModelSpecification();

            state._fsp--;


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


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1257:1: entryRulePartialModelReference returns [EObject current=null] : iv_rulePartialModelReference= rulePartialModelReference EOF ;
    public final EObject entryRulePartialModelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialModelReference = null;


        try {
            // InternalApplicationConfiguration.g:1257:62: (iv_rulePartialModelReference= rulePartialModelReference EOF )
            // InternalApplicationConfiguration.g:1258:2: iv_rulePartialModelReference= rulePartialModelReference EOF
            {
             newCompositeNode(grammarAccess.getPartialModelReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartialModelReference=rulePartialModelReference();

            state._fsp--;

             current =iv_rulePartialModelReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1264:1: rulePartialModelReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulePartialModelReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1270:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:1271:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:1271:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:1272:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1272:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:1273:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPartialModelReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getPartialModelReferenceAccess().getReferredPartialModelDeclarationCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1287:1: entryRulePartialModel returns [EObject current=null] : iv_rulePartialModel= rulePartialModel EOF ;
    public final EObject entryRulePartialModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialModel = null;


        try {
            // InternalApplicationConfiguration.g:1287:53: (iv_rulePartialModel= rulePartialModel EOF )
            // InternalApplicationConfiguration.g:1288:2: iv_rulePartialModel= rulePartialModel EOF
            {
             newCompositeNode(grammarAccess.getPartialModelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartialModel=rulePartialModel();

            state._fsp--;

             current =iv_rulePartialModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1294:1: rulePartialModel returns [EObject current=null] : (this_PartialModelSpecification_0= rulePartialModelSpecification | this_PartialModelReference_1= rulePartialModelReference ) ;
    public final EObject rulePartialModel() throws RecognitionException {
        EObject current = null;

        EObject this_PartialModelSpecification_0 = null;

        EObject this_PartialModelReference_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1300:2: ( (this_PartialModelSpecification_0= rulePartialModelSpecification | this_PartialModelReference_1= rulePartialModelReference ) )
            // InternalApplicationConfiguration.g:1301:2: (this_PartialModelSpecification_0= rulePartialModelSpecification | this_PartialModelReference_1= rulePartialModelReference )
            {
            // InternalApplicationConfiguration.g:1301:2: (this_PartialModelSpecification_0= rulePartialModelSpecification | this_PartialModelReference_1= rulePartialModelReference )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalApplicationConfiguration.g:1302:3: this_PartialModelSpecification_0= rulePartialModelSpecification
                    {

                    			newCompositeNode(grammarAccess.getPartialModelAccess().getPartialModelSpecificationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PartialModelSpecification_0=rulePartialModelSpecification();

                    state._fsp--;


                    			current = this_PartialModelSpecification_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:1311:3: this_PartialModelReference_1= rulePartialModelReference
                    {

                    			newCompositeNode(grammarAccess.getPartialModelAccess().getPartialModelReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PartialModelReference_1=rulePartialModelReference();

                    state._fsp--;


                    			current = this_PartialModelReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1323:1: entryRulePatternSpecification returns [EObject current=null] : iv_rulePatternSpecification= rulePatternSpecification EOF ;
    public final EObject entryRulePatternSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternSpecification = null;


        try {
            // InternalApplicationConfiguration.g:1323:61: (iv_rulePatternSpecification= rulePatternSpecification EOF )
            // InternalApplicationConfiguration.g:1324:2: iv_rulePatternSpecification= rulePatternSpecification EOF
            {
             newCompositeNode(grammarAccess.getPatternSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternSpecification=rulePatternSpecification();

            state._fsp--;

             current =iv_rulePatternSpecification; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1330:1: rulePatternSpecification returns [EObject current=null] : (otherlv_0= '{' ( (lv_entries_1_0= rulePatternEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )* otherlv_4= '}' ) ;
    public final EObject rulePatternSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1336:2: ( (otherlv_0= '{' ( (lv_entries_1_0= rulePatternEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )* otherlv_4= '}' ) )
            // InternalApplicationConfiguration.g:1337:2: (otherlv_0= '{' ( (lv_entries_1_0= rulePatternEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )* otherlv_4= '}' )
            {
            // InternalApplicationConfiguration.g:1337:2: (otherlv_0= '{' ( (lv_entries_1_0= rulePatternEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )* otherlv_4= '}' )
            // InternalApplicationConfiguration.g:1338:3: otherlv_0= '{' ( (lv_entries_1_0= rulePatternEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternSpecificationAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalApplicationConfiguration.g:1342:3: ( (lv_entries_1_0= rulePatternEntry ) )
            // InternalApplicationConfiguration.g:1343:4: (lv_entries_1_0= rulePatternEntry )
            {
            // InternalApplicationConfiguration.g:1343:4: (lv_entries_1_0= rulePatternEntry )
            // InternalApplicationConfiguration.g:1344:5: lv_entries_1_0= rulePatternEntry
            {

            					newCompositeNode(grammarAccess.getPatternSpecificationAccess().getEntriesPatternEntryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_entries_1_0=rulePatternEntry();

            state._fsp--;


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

            // InternalApplicationConfiguration.g:1361:3: (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:1362:4: otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPatternSpecificationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalApplicationConfiguration.g:1366:4: ( (lv_entries_3_0= rulePatternEntry ) )
            	    // InternalApplicationConfiguration.g:1367:5: (lv_entries_3_0= rulePatternEntry )
            	    {
            	    // InternalApplicationConfiguration.g:1367:5: (lv_entries_3_0= rulePatternEntry )
            	    // InternalApplicationConfiguration.g:1368:6: lv_entries_3_0= rulePatternEntry
            	    {

            	    						newCompositeNode(grammarAccess.getPatternSpecificationAccess().getEntriesPatternEntryParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_entries_3_0=rulePatternEntry();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPatternSpecificationAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1394:1: entryRulePatternEntry returns [EObject current=null] : iv_rulePatternEntry= rulePatternEntry EOF ;
    public final EObject entryRulePatternEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternEntry = null;


        try {
            // InternalApplicationConfiguration.g:1394:53: (iv_rulePatternEntry= rulePatternEntry EOF )
            // InternalApplicationConfiguration.g:1395:2: iv_rulePatternEntry= rulePatternEntry EOF
            {
             newCompositeNode(grammarAccess.getPatternEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternEntry=rulePatternEntry();

            state._fsp--;

             current =iv_rulePatternEntry; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1401:1: rulePatternEntry returns [EObject current=null] : (this_PatternElement_0= rulePatternElement | this_AllPatternEntry_1= ruleAllPatternEntry ) ;
    public final EObject rulePatternEntry() throws RecognitionException {
        EObject current = null;

        EObject this_PatternElement_0 = null;

        EObject this_AllPatternEntry_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1407:2: ( (this_PatternElement_0= rulePatternElement | this_AllPatternEntry_1= ruleAllPatternEntry ) )
            // InternalApplicationConfiguration.g:1408:2: (this_PatternElement_0= rulePatternElement | this_AllPatternEntry_1= ruleAllPatternEntry )
            {
            // InternalApplicationConfiguration.g:1408:2: (this_PatternElement_0= rulePatternElement | this_AllPatternEntry_1= ruleAllPatternEntry )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==20) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalApplicationConfiguration.g:1409:3: this_PatternElement_0= rulePatternElement
                    {

                    			newCompositeNode(grammarAccess.getPatternEntryAccess().getPatternElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PatternElement_0=rulePatternElement();

                    state._fsp--;


                    			current = this_PatternElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:1418:3: this_AllPatternEntry_1= ruleAllPatternEntry
                    {

                    			newCompositeNode(grammarAccess.getPatternEntryAccess().getAllPatternEntryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllPatternEntry_1=ruleAllPatternEntry();

                    state._fsp--;


                    			current = this_AllPatternEntry_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1430:1: entryRuleAllPatternEntry returns [EObject current=null] : iv_ruleAllPatternEntry= ruleAllPatternEntry EOF ;
    public final EObject entryRuleAllPatternEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllPatternEntry = null;


        try {
            // InternalApplicationConfiguration.g:1430:56: (iv_ruleAllPatternEntry= ruleAllPatternEntry EOF )
            // InternalApplicationConfiguration.g:1431:2: iv_ruleAllPatternEntry= ruleAllPatternEntry EOF
            {
             newCompositeNode(grammarAccess.getAllPatternEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllPatternEntry=ruleAllPatternEntry();

            state._fsp--;

             current =iv_ruleAllPatternEntry; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1437:1: ruleAllPatternEntry returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )? ) ;
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
            // InternalApplicationConfiguration.g:1443:2: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )? ) )
            // InternalApplicationConfiguration.g:1444:2: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )? )
            {
            // InternalApplicationConfiguration.g:1444:2: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )? )
            // InternalApplicationConfiguration.g:1445:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAllPatternEntryAccess().getPackageKeyword_0());
            		
            // InternalApplicationConfiguration.g:1449:3: ( ( ruleQualifiedName ) )
            // InternalApplicationConfiguration.g:1450:4: ( ruleQualifiedName )
            {
            // InternalApplicationConfiguration.g:1450:4: ( ruleQualifiedName )
            // InternalApplicationConfiguration.g:1451:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllPatternEntryRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllPatternEntryAccess().getPackagePatternModelCrossReference_1_0());
            				
            pushFollow(FOLLOW_13);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApplicationConfiguration.g:1465:3: (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalApplicationConfiguration.g:1466:4: otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getAllPatternEntryAccess().getExcludingKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllPatternEntryAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalApplicationConfiguration.g:1474:4: ( (lv_exclusuion_4_0= rulePatternElement ) )
                    // InternalApplicationConfiguration.g:1475:5: (lv_exclusuion_4_0= rulePatternElement )
                    {
                    // InternalApplicationConfiguration.g:1475:5: (lv_exclusuion_4_0= rulePatternElement )
                    // InternalApplicationConfiguration.g:1476:6: lv_exclusuion_4_0= rulePatternElement
                    {

                    						newCompositeNode(grammarAccess.getAllPatternEntryAccess().getExclusuionPatternElementParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_exclusuion_4_0=rulePatternElement();

                    state._fsp--;


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

                    // InternalApplicationConfiguration.g:1493:4: (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==18) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:1494:5: otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAllPatternEntryAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalApplicationConfiguration.g:1498:5: ( (lv_exclusuion_6_0= rulePatternElement ) )
                    	    // InternalApplicationConfiguration.g:1499:6: (lv_exclusuion_6_0= rulePatternElement )
                    	    {
                    	    // InternalApplicationConfiguration.g:1499:6: (lv_exclusuion_6_0= rulePatternElement )
                    	    // InternalApplicationConfiguration.g:1500:7: lv_exclusuion_6_0= rulePatternElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getAllPatternEntryAccess().getExclusuionPatternElementParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_exclusuion_6_0=rulePatternElement();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getAllPatternEntryAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1527:1: entryRulePatternElement returns [EObject current=null] : iv_rulePatternElement= rulePatternElement EOF ;
    public final EObject entryRulePatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternElement = null;


        try {
            // InternalApplicationConfiguration.g:1527:55: (iv_rulePatternElement= rulePatternElement EOF )
            // InternalApplicationConfiguration.g:1528:2: iv_rulePatternElement= rulePatternElement EOF
            {
             newCompositeNode(grammarAccess.getPatternElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternElement=rulePatternElement();

            state._fsp--;

             current =iv_rulePatternElement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1534:1: rulePatternElement returns [EObject current=null] : ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject rulePatternElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1540:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) )
            // InternalApplicationConfiguration.g:1541:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalApplicationConfiguration.g:1541:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:1542:3: ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:1542:3: ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )?
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
                    // InternalApplicationConfiguration.g:1543:4: ( ( ruleQualifiedName ) ) otherlv_1= '::'
                    {
                    // InternalApplicationConfiguration.g:1543:4: ( ( ruleQualifiedName ) )
                    // InternalApplicationConfiguration.g:1544:5: ( ruleQualifiedName )
                    {
                    // InternalApplicationConfiguration.g:1544:5: ( ruleQualifiedName )
                    // InternalApplicationConfiguration.g:1545:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPatternElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPatternElementAccess().getPackagePatternModelCrossReference_0_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getPatternElementAccess().getColonColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalApplicationConfiguration.g:1564:3: ( (otherlv_2= RULE_ID ) )
            // InternalApplicationConfiguration.g:1565:4: (otherlv_2= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1565:4: (otherlv_2= RULE_ID )
            // InternalApplicationConfiguration.g:1566:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternElementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getPatternElementAccess().getPatternPatternCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1581:1: entryRuleGraphPatternDeclaration returns [EObject current=null] : iv_ruleGraphPatternDeclaration= ruleGraphPatternDeclaration EOF ;
    public final EObject entryRuleGraphPatternDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphPatternDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:1581:64: (iv_ruleGraphPatternDeclaration= ruleGraphPatternDeclaration EOF )
            // InternalApplicationConfiguration.g:1582:2: iv_ruleGraphPatternDeclaration= ruleGraphPatternDeclaration EOF
            {
             newCompositeNode(grammarAccess.getGraphPatternDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphPatternDeclaration=ruleGraphPatternDeclaration();

            state._fsp--;

             current =iv_ruleGraphPatternDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1588:1: ruleGraphPatternDeclaration returns [EObject current=null] : (otherlv_0= 'patterns' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePatternSpecification ) ) ) ;
    public final EObject ruleGraphPatternDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_specification_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1594:2: ( (otherlv_0= 'patterns' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePatternSpecification ) ) ) )
            // InternalApplicationConfiguration.g:1595:2: (otherlv_0= 'patterns' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePatternSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:1595:2: (otherlv_0= 'patterns' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePatternSpecification ) ) )
            // InternalApplicationConfiguration.g:1596:3: otherlv_0= 'patterns' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePatternSpecification ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphPatternDeclarationAccess().getPatternsKeyword_0());
            		
            // InternalApplicationConfiguration.g:1600:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:1601:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1601:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:1602:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGraphPatternDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalApplicationConfiguration.g:1618:3: ( (lv_specification_2_0= rulePatternSpecification ) )
            // InternalApplicationConfiguration.g:1619:4: (lv_specification_2_0= rulePatternSpecification )
            {
            // InternalApplicationConfiguration.g:1619:4: (lv_specification_2_0= rulePatternSpecification )
            // InternalApplicationConfiguration.g:1620:5: lv_specification_2_0= rulePatternSpecification
            {

            					newCompositeNode(grammarAccess.getGraphPatternDeclarationAccess().getSpecificationPatternSpecificationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_specification_2_0=rulePatternSpecification();

            state._fsp--;


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


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1641:1: entryRuleGraphPatternReference returns [EObject current=null] : iv_ruleGraphPatternReference= ruleGraphPatternReference EOF ;
    public final EObject entryRuleGraphPatternReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphPatternReference = null;


        try {
            // InternalApplicationConfiguration.g:1641:62: (iv_ruleGraphPatternReference= ruleGraphPatternReference EOF )
            // InternalApplicationConfiguration.g:1642:2: iv_ruleGraphPatternReference= ruleGraphPatternReference EOF
            {
             newCompositeNode(grammarAccess.getGraphPatternReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphPatternReference=ruleGraphPatternReference();

            state._fsp--;

             current =iv_ruleGraphPatternReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1648:1: ruleGraphPatternReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleGraphPatternReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1654:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:1655:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:1655:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:1656:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1656:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:1657:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getGraphPatternReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getGraphPatternReferenceAccess().getReferredGraphPatternDeclarationCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1671:1: entryRuleGraphPattern returns [EObject current=null] : iv_ruleGraphPattern= ruleGraphPattern EOF ;
    public final EObject entryRuleGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphPattern = null;


        try {
            // InternalApplicationConfiguration.g:1671:53: (iv_ruleGraphPattern= ruleGraphPattern EOF )
            // InternalApplicationConfiguration.g:1672:2: iv_ruleGraphPattern= ruleGraphPattern EOF
            {
             newCompositeNode(grammarAccess.getGraphPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphPattern=ruleGraphPattern();

            state._fsp--;

             current =iv_ruleGraphPattern; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1678:1: ruleGraphPattern returns [EObject current=null] : (this_GraphPatternReference_0= ruleGraphPatternReference | this_PatternSpecification_1= rulePatternSpecification ) ;
    public final EObject ruleGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject this_GraphPatternReference_0 = null;

        EObject this_PatternSpecification_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1684:2: ( (this_GraphPatternReference_0= ruleGraphPatternReference | this_PatternSpecification_1= rulePatternSpecification ) )
            // InternalApplicationConfiguration.g:1685:2: (this_GraphPatternReference_0= ruleGraphPatternReference | this_PatternSpecification_1= rulePatternSpecification )
            {
            // InternalApplicationConfiguration.g:1685:2: (this_GraphPatternReference_0= ruleGraphPatternReference | this_PatternSpecification_1= rulePatternSpecification )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==17) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalApplicationConfiguration.g:1686:3: this_GraphPatternReference_0= ruleGraphPatternReference
                    {

                    			newCompositeNode(grammarAccess.getGraphPatternAccess().getGraphPatternReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphPatternReference_0=ruleGraphPatternReference();

                    state._fsp--;


                    			current = this_GraphPatternReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:1695:3: this_PatternSpecification_1= rulePatternSpecification
                    {

                    			newCompositeNode(grammarAccess.getGraphPatternAccess().getPatternSpecificationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PatternSpecification_1=rulePatternSpecification();

                    state._fsp--;


                    			current = this_PatternSpecification_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1707:1: entryRuleConfigSpecification returns [EObject current=null] : iv_ruleConfigSpecification= ruleConfigSpecification EOF ;
    public final EObject entryRuleConfigSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigSpecification = null;


        try {
            // InternalApplicationConfiguration.g:1707:60: (iv_ruleConfigSpecification= ruleConfigSpecification EOF )
            // InternalApplicationConfiguration.g:1708:2: iv_ruleConfigSpecification= ruleConfigSpecification EOF
            {
             newCompositeNode(grammarAccess.getConfigSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigSpecification=ruleConfigSpecification();

            state._fsp--;

             current =iv_ruleConfigSpecification; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1714:1: ruleConfigSpecification returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleConfigSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_entries_2_0 = null;

        EObject lv_entries_4_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1720:2: ( ( () otherlv_1= '{' ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )? otherlv_5= '}' ) )
            // InternalApplicationConfiguration.g:1721:2: ( () otherlv_1= '{' ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )? otherlv_5= '}' )
            {
            // InternalApplicationConfiguration.g:1721:2: ( () otherlv_1= '{' ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )? otherlv_5= '}' )
            // InternalApplicationConfiguration.g:1722:3: () otherlv_1= '{' ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )? otherlv_5= '}'
            {
            // InternalApplicationConfiguration.g:1722:3: ()
            // InternalApplicationConfiguration.g:1723:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigSpecificationAccess().getConfigSpecificationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigSpecificationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalApplicationConfiguration.g:1733:3: ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalApplicationConfiguration.g:1734:4: ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )*
                    {
                    // InternalApplicationConfiguration.g:1734:4: ( (lv_entries_2_0= ruleConfigEntry ) )
                    // InternalApplicationConfiguration.g:1735:5: (lv_entries_2_0= ruleConfigEntry )
                    {
                    // InternalApplicationConfiguration.g:1735:5: (lv_entries_2_0= ruleConfigEntry )
                    // InternalApplicationConfiguration.g:1736:6: lv_entries_2_0= ruleConfigEntry
                    {

                    						newCompositeNode(grammarAccess.getConfigSpecificationAccess().getEntriesConfigEntryParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_entries_2_0=ruleConfigEntry();

                    state._fsp--;


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

                    // InternalApplicationConfiguration.g:1753:4: (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==18) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:1754:5: otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_8); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getConfigSpecificationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalApplicationConfiguration.g:1758:5: ( (lv_entries_4_0= ruleConfigEntry ) )
                    	    // InternalApplicationConfiguration.g:1759:6: (lv_entries_4_0= ruleConfigEntry )
                    	    {
                    	    // InternalApplicationConfiguration.g:1759:6: (lv_entries_4_0= ruleConfigEntry )
                    	    // InternalApplicationConfiguration.g:1760:7: lv_entries_4_0= ruleConfigEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getConfigSpecificationAccess().getEntriesConfigEntryParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_entries_4_0=ruleConfigEntry();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getConfigSpecificationAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1787:1: entryRuleConfigDeclaration returns [EObject current=null] : iv_ruleConfigDeclaration= ruleConfigDeclaration EOF ;
    public final EObject entryRuleConfigDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:1787:58: (iv_ruleConfigDeclaration= ruleConfigDeclaration EOF )
            // InternalApplicationConfiguration.g:1788:2: iv_ruleConfigDeclaration= ruleConfigDeclaration EOF
            {
             newCompositeNode(grammarAccess.getConfigDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigDeclaration=ruleConfigDeclaration();

            state._fsp--;

             current =iv_ruleConfigDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1794:1: ruleConfigDeclaration returns [EObject current=null] : (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleConfigSpecification ) ) ) ;
    public final EObject ruleConfigDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_specification_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1800:2: ( (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleConfigSpecification ) ) ) )
            // InternalApplicationConfiguration.g:1801:2: (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleConfigSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:1801:2: (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleConfigSpecification ) ) )
            // InternalApplicationConfiguration.g:1802:3: otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleConfigSpecification ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigDeclarationAccess().getConfigKeyword_0());
            		
            // InternalApplicationConfiguration.g:1806:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:1807:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1807:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:1808:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConfigDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalApplicationConfiguration.g:1824:3: ( (lv_specification_2_0= ruleConfigSpecification ) )
            // InternalApplicationConfiguration.g:1825:4: (lv_specification_2_0= ruleConfigSpecification )
            {
            // InternalApplicationConfiguration.g:1825:4: (lv_specification_2_0= ruleConfigSpecification )
            // InternalApplicationConfiguration.g:1826:5: lv_specification_2_0= ruleConfigSpecification
            {

            					newCompositeNode(grammarAccess.getConfigDeclarationAccess().getSpecificationConfigSpecificationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_specification_2_0=ruleConfigSpecification();

            state._fsp--;


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


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1847:1: entryRuleConfigEntry returns [EObject current=null] : iv_ruleConfigEntry= ruleConfigEntry EOF ;
    public final EObject entryRuleConfigEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigEntry = null;


        try {
            // InternalApplicationConfiguration.g:1847:52: (iv_ruleConfigEntry= ruleConfigEntry EOF )
            // InternalApplicationConfiguration.g:1848:2: iv_ruleConfigEntry= ruleConfigEntry EOF
            {
             newCompositeNode(grammarAccess.getConfigEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigEntry=ruleConfigEntry();

            state._fsp--;

             current =iv_ruleConfigEntry; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1854:1: ruleConfigEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleConfigEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1860:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalApplicationConfiguration.g:1861:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalApplicationConfiguration.g:1861:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalApplicationConfiguration.g:1862:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalApplicationConfiguration.g:1862:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalApplicationConfiguration.g:1863:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalApplicationConfiguration.g:1863:4: (lv_key_0_0= RULE_STRING )
            // InternalApplicationConfiguration.g:1864:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getConfigEntryAccess().getKeySTRINGTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigEntryAccess().getEqualsSignKeyword_1());
            		
            // InternalApplicationConfiguration.g:1884:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalApplicationConfiguration.g:1885:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalApplicationConfiguration.g:1885:4: (lv_value_2_0= RULE_STRING )
            // InternalApplicationConfiguration.g:1886:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getConfigEntryAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

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


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1906:1: entryRuleConfigReference returns [EObject current=null] : iv_ruleConfigReference= ruleConfigReference EOF ;
    public final EObject entryRuleConfigReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigReference = null;


        try {
            // InternalApplicationConfiguration.g:1906:56: (iv_ruleConfigReference= ruleConfigReference EOF )
            // InternalApplicationConfiguration.g:1907:2: iv_ruleConfigReference= ruleConfigReference EOF
            {
             newCompositeNode(grammarAccess.getConfigReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigReference=ruleConfigReference();

            state._fsp--;

             current =iv_ruleConfigReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1913:1: ruleConfigReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleConfigReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1919:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:1920:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:1920:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:1921:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1921:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:1922:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getConfigReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getConfigReferenceAccess().getConfigConfigDeclarationCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1936:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalApplicationConfiguration.g:1936:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalApplicationConfiguration.g:1937:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1943:1: ruleConfig returns [EObject current=null] : (this_ConfigSpecification_0= ruleConfigSpecification | this_ConfigReference_1= ruleConfigReference ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigSpecification_0 = null;

        EObject this_ConfigReference_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1949:2: ( (this_ConfigSpecification_0= ruleConfigSpecification | this_ConfigReference_1= ruleConfigReference ) )
            // InternalApplicationConfiguration.g:1950:2: (this_ConfigSpecification_0= ruleConfigSpecification | this_ConfigReference_1= ruleConfigReference )
            {
            // InternalApplicationConfiguration.g:1950:2: (this_ConfigSpecification_0= ruleConfigSpecification | this_ConfigReference_1= ruleConfigReference )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalApplicationConfiguration.g:1951:3: this_ConfigSpecification_0= ruleConfigSpecification
                    {

                    			newCompositeNode(grammarAccess.getConfigAccess().getConfigSpecificationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConfigSpecification_0=ruleConfigSpecification();

                    state._fsp--;


                    			current = this_ConfigSpecification_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:1960:3: this_ConfigReference_1= ruleConfigReference
                    {

                    			newCompositeNode(grammarAccess.getConfigAccess().getConfigReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConfigReference_1=ruleConfigReference();

                    state._fsp--;


                    			current = this_ConfigReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:1972:1: entryRuleScopeSpecification returns [EObject current=null] : iv_ruleScopeSpecification= ruleScopeSpecification EOF ;
    public final EObject entryRuleScopeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeSpecification = null;


        try {
            // InternalApplicationConfiguration.g:1972:59: (iv_ruleScopeSpecification= ruleScopeSpecification EOF )
            // InternalApplicationConfiguration.g:1973:2: iv_ruleScopeSpecification= ruleScopeSpecification EOF
            {
             newCompositeNode(grammarAccess.getScopeSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScopeSpecification=ruleScopeSpecification();

            state._fsp--;

             current =iv_ruleScopeSpecification; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1979:1: ruleScopeSpecification returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleScopeSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_scopes_2_0 = null;

        EObject lv_scopes_4_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1985:2: ( ( () otherlv_1= '{' ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )? otherlv_5= '}' ) )
            // InternalApplicationConfiguration.g:1986:2: ( () otherlv_1= '{' ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )? otherlv_5= '}' )
            {
            // InternalApplicationConfiguration.g:1986:2: ( () otherlv_1= '{' ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )? otherlv_5= '}' )
            // InternalApplicationConfiguration.g:1987:3: () otherlv_1= '{' ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )? otherlv_5= '}'
            {
            // InternalApplicationConfiguration.g:1987:3: ()
            // InternalApplicationConfiguration.g:1988:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScopeSpecificationAccess().getScopeSpecificationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getScopeSpecificationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalApplicationConfiguration.g:1998:3: ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalApplicationConfiguration.g:1999:4: ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )*
                    {
                    // InternalApplicationConfiguration.g:1999:4: ( (lv_scopes_2_0= ruleTypeScope ) )
                    // InternalApplicationConfiguration.g:2000:5: (lv_scopes_2_0= ruleTypeScope )
                    {
                    // InternalApplicationConfiguration.g:2000:5: (lv_scopes_2_0= ruleTypeScope )
                    // InternalApplicationConfiguration.g:2001:6: lv_scopes_2_0= ruleTypeScope
                    {

                    						newCompositeNode(grammarAccess.getScopeSpecificationAccess().getScopesTypeScopeParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_scopes_2_0=ruleTypeScope();

                    state._fsp--;


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

                    // InternalApplicationConfiguration.g:2018:4: (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==18) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:2019:5: otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_21); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getScopeSpecificationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalApplicationConfiguration.g:2023:5: ( (lv_scopes_4_0= ruleTypeScope ) )
                    	    // InternalApplicationConfiguration.g:2024:6: (lv_scopes_4_0= ruleTypeScope )
                    	    {
                    	    // InternalApplicationConfiguration.g:2024:6: (lv_scopes_4_0= ruleTypeScope )
                    	    // InternalApplicationConfiguration.g:2025:7: lv_scopes_4_0= ruleTypeScope
                    	    {

                    	    							newCompositeNode(grammarAccess.getScopeSpecificationAccess().getScopesTypeScopeParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_scopes_4_0=ruleTypeScope();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScopeSpecificationAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:2052:1: entryRuleTypeScope returns [EObject current=null] : iv_ruleTypeScope= ruleTypeScope EOF ;
    public final EObject entryRuleTypeScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeScope = null;


        try {
            // InternalApplicationConfiguration.g:2052:50: (iv_ruleTypeScope= ruleTypeScope EOF )
            // InternalApplicationConfiguration.g:2053:2: iv_ruleTypeScope= ruleTypeScope EOF
            {
             newCompositeNode(grammarAccess.getTypeScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeScope=ruleTypeScope();

            state._fsp--;

             current =iv_ruleTypeScope; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:2059:1: ruleTypeScope returns [EObject current=null] : (otherlv_0= '#' ( (lv_type_1_0= ruleTypeReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( (lv_min_4_0= RULE_INT ) ) (otherlv_5= '..' ( ( (lv_maxUnlimited_6_0= '*' ) ) | ( (lv_max_7_0= RULE_INT ) ) ) )? ) ;
    public final EObject ruleTypeScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_setsNew_2_0=null;
        Token lv_setsSum_3_0=null;
        Token lv_min_4_0=null;
        Token otherlv_5=null;
        Token lv_maxUnlimited_6_0=null;
        Token lv_max_7_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2065:2: ( (otherlv_0= '#' ( (lv_type_1_0= ruleTypeReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( (lv_min_4_0= RULE_INT ) ) (otherlv_5= '..' ( ( (lv_maxUnlimited_6_0= '*' ) ) | ( (lv_max_7_0= RULE_INT ) ) ) )? ) )
            // InternalApplicationConfiguration.g:2066:2: (otherlv_0= '#' ( (lv_type_1_0= ruleTypeReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( (lv_min_4_0= RULE_INT ) ) (otherlv_5= '..' ( ( (lv_maxUnlimited_6_0= '*' ) ) | ( (lv_max_7_0= RULE_INT ) ) ) )? )
            {
            // InternalApplicationConfiguration.g:2066:2: (otherlv_0= '#' ( (lv_type_1_0= ruleTypeReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( (lv_min_4_0= RULE_INT ) ) (otherlv_5= '..' ( ( (lv_maxUnlimited_6_0= '*' ) ) | ( (lv_max_7_0= RULE_INT ) ) ) )? )
            // InternalApplicationConfiguration.g:2067:3: otherlv_0= '#' ( (lv_type_1_0= ruleTypeReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( (lv_min_4_0= RULE_INT ) ) (otherlv_5= '..' ( ( (lv_maxUnlimited_6_0= '*' ) ) | ( (lv_max_7_0= RULE_INT ) ) ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeScopeAccess().getNumberSignKeyword_0());
            		
            // InternalApplicationConfiguration.g:2071:3: ( (lv_type_1_0= ruleTypeReference ) )
            // InternalApplicationConfiguration.g:2072:4: (lv_type_1_0= ruleTypeReference )
            {
            // InternalApplicationConfiguration.g:2072:4: (lv_type_1_0= ruleTypeReference )
            // InternalApplicationConfiguration.g:2073:5: lv_type_1_0= ruleTypeReference
            {

            					newCompositeNode(grammarAccess.getTypeScopeAccess().getTypeTypeReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_type_1_0=ruleTypeReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeScopeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.TypeReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApplicationConfiguration.g:2090:3: ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            else if ( (LA31_0==16) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalApplicationConfiguration.g:2091:4: ( (lv_setsNew_2_0= '+=' ) )
                    {
                    // InternalApplicationConfiguration.g:2091:4: ( (lv_setsNew_2_0= '+=' ) )
                    // InternalApplicationConfiguration.g:2092:5: (lv_setsNew_2_0= '+=' )
                    {
                    // InternalApplicationConfiguration.g:2092:5: (lv_setsNew_2_0= '+=' )
                    // InternalApplicationConfiguration.g:2093:6: lv_setsNew_2_0= '+='
                    {
                    lv_setsNew_2_0=(Token)match(input,29,FOLLOW_24); 

                    						newLeafNode(lv_setsNew_2_0, grammarAccess.getTypeScopeAccess().getSetsNewPlusSignEqualsSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeScopeRule());
                    						}
                    						setWithLastConsumed(current, "setsNew", true, "+=");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:2106:4: ( (lv_setsSum_3_0= '=' ) )
                    {
                    // InternalApplicationConfiguration.g:2106:4: ( (lv_setsSum_3_0= '=' ) )
                    // InternalApplicationConfiguration.g:2107:5: (lv_setsSum_3_0= '=' )
                    {
                    // InternalApplicationConfiguration.g:2107:5: (lv_setsSum_3_0= '=' )
                    // InternalApplicationConfiguration.g:2108:6: lv_setsSum_3_0= '='
                    {
                    lv_setsSum_3_0=(Token)match(input,16,FOLLOW_24); 

                    						newLeafNode(lv_setsSum_3_0, grammarAccess.getTypeScopeAccess().getSetsSumEqualsSignKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeScopeRule());
                    						}
                    						setWithLastConsumed(current, "setsSum", true, "=");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalApplicationConfiguration.g:2121:3: ( (lv_min_4_0= RULE_INT ) )
            // InternalApplicationConfiguration.g:2122:4: (lv_min_4_0= RULE_INT )
            {
            // InternalApplicationConfiguration.g:2122:4: (lv_min_4_0= RULE_INT )
            // InternalApplicationConfiguration.g:2123:5: lv_min_4_0= RULE_INT
            {
            lv_min_4_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_min_4_0, grammarAccess.getTypeScopeAccess().getMinINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeScopeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalApplicationConfiguration.g:2139:3: (otherlv_5= '..' ( ( (lv_maxUnlimited_6_0= '*' ) ) | ( (lv_max_7_0= RULE_INT ) ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalApplicationConfiguration.g:2140:4: otherlv_5= '..' ( ( (lv_maxUnlimited_6_0= '*' ) ) | ( (lv_max_7_0= RULE_INT ) ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeScopeAccess().getFullStopFullStopKeyword_4_0());
                    			
                    // InternalApplicationConfiguration.g:2144:4: ( ( (lv_maxUnlimited_6_0= '*' ) ) | ( (lv_max_7_0= RULE_INT ) ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==31) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==RULE_INT) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalApplicationConfiguration.g:2145:5: ( (lv_maxUnlimited_6_0= '*' ) )
                            {
                            // InternalApplicationConfiguration.g:2145:5: ( (lv_maxUnlimited_6_0= '*' ) )
                            // InternalApplicationConfiguration.g:2146:6: (lv_maxUnlimited_6_0= '*' )
                            {
                            // InternalApplicationConfiguration.g:2146:6: (lv_maxUnlimited_6_0= '*' )
                            // InternalApplicationConfiguration.g:2147:7: lv_maxUnlimited_6_0= '*'
                            {
                            lv_maxUnlimited_6_0=(Token)match(input,31,FOLLOW_2); 

                            							newLeafNode(lv_maxUnlimited_6_0, grammarAccess.getTypeScopeAccess().getMaxUnlimitedAsteriskKeyword_4_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypeScopeRule());
                            							}
                            							setWithLastConsumed(current, "maxUnlimited", true, "*");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalApplicationConfiguration.g:2160:5: ( (lv_max_7_0= RULE_INT ) )
                            {
                            // InternalApplicationConfiguration.g:2160:5: ( (lv_max_7_0= RULE_INT ) )
                            // InternalApplicationConfiguration.g:2161:6: (lv_max_7_0= RULE_INT )
                            {
                            // InternalApplicationConfiguration.g:2161:6: (lv_max_7_0= RULE_INT )
                            // InternalApplicationConfiguration.g:2162:7: lv_max_7_0= RULE_INT
                            {
                            lv_max_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                            							newLeafNode(lv_max_7_0, grammarAccess.getTypeScopeAccess().getMaxINTTerminalRuleCall_4_1_1_0());
                            						

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
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:2184:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalApplicationConfiguration.g:2184:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalApplicationConfiguration.g:2185:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
             newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;

             current =iv_ruleTypeReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:2191:1: ruleTypeReference returns [EObject current=null] : (this_ClassReference_0= ruleClassReference | this_ObjectReference_1= ruleObjectReference | this_IntegerReference_2= ruleIntegerReference | this_RealReference_3= ruleRealReference | this_StringReference_4= ruleStringReference ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_ClassReference_0 = null;

        EObject this_ObjectReference_1 = null;

        EObject this_IntegerReference_2 = null;

        EObject this_RealReference_3 = null;

        EObject this_StringReference_4 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2197:2: ( (this_ClassReference_0= ruleClassReference | this_ObjectReference_1= ruleObjectReference | this_IntegerReference_2= ruleIntegerReference | this_RealReference_3= ruleRealReference | this_StringReference_4= ruleStringReference ) )
            // InternalApplicationConfiguration.g:2198:2: (this_ClassReference_0= ruleClassReference | this_ObjectReference_1= ruleObjectReference | this_IntegerReference_2= ruleIntegerReference | this_RealReference_3= ruleRealReference | this_StringReference_4= ruleStringReference )
            {
            // InternalApplicationConfiguration.g:2198:2: (this_ClassReference_0= ruleClassReference | this_ObjectReference_1= ruleObjectReference | this_IntegerReference_2= ruleIntegerReference | this_RealReference_3= ruleRealReference | this_StringReference_4= ruleStringReference )
            int alt34=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt34=1;
                }
                break;
            case 34:
                {
                alt34=2;
                }
                break;
            case 35:
                {
                alt34=3;
                }
                break;
            case 36:
                {
                alt34=4;
                }
                break;
            case 37:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalApplicationConfiguration.g:2199:3: this_ClassReference_0= ruleClassReference
                    {

                    			newCompositeNode(grammarAccess.getTypeReferenceAccess().getClassReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassReference_0=ruleClassReference();

                    state._fsp--;


                    			current = this_ClassReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:2208:3: this_ObjectReference_1= ruleObjectReference
                    {

                    			newCompositeNode(grammarAccess.getTypeReferenceAccess().getObjectReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectReference_1=ruleObjectReference();

                    state._fsp--;


                    			current = this_ObjectReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalApplicationConfiguration.g:2217:3: this_IntegerReference_2= ruleIntegerReference
                    {

                    			newCompositeNode(grammarAccess.getTypeReferenceAccess().getIntegerReferenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerReference_2=ruleIntegerReference();

                    state._fsp--;


                    			current = this_IntegerReference_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalApplicationConfiguration.g:2226:3: this_RealReference_3= ruleRealReference
                    {

                    			newCompositeNode(grammarAccess.getTypeReferenceAccess().getRealReferenceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealReference_3=ruleRealReference();

                    state._fsp--;


                    			current = this_RealReference_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalApplicationConfiguration.g:2235:3: this_StringReference_4= ruleStringReference
                    {

                    			newCompositeNode(grammarAccess.getTypeReferenceAccess().getStringReferenceParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringReference_4=ruleStringReference();

                    state._fsp--;


                    			current = this_StringReference_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:2247:1: entryRuleClassReference returns [EObject current=null] : iv_ruleClassReference= ruleClassReference EOF ;
    public final EObject entryRuleClassReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassReference = null;


        try {
            // InternalApplicationConfiguration.g:2247:55: (iv_ruleClassReference= ruleClassReference EOF )
            // InternalApplicationConfiguration.g:2248:2: iv_ruleClassReference= ruleClassReference EOF
            {
             newCompositeNode(grammarAccess.getClassReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassReference=ruleClassReference();

            state._fsp--;

             current =iv_ruleClassReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:2254:1: ruleClassReference returns [EObject current=null] : (otherlv_0= '<' ( (lv_element_1_0= ruleMetamodelElement ) ) otherlv_2= '>' ) ;
    public final EObject ruleClassReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2260:2: ( (otherlv_0= '<' ( (lv_element_1_0= ruleMetamodelElement ) ) otherlv_2= '>' ) )
            // InternalApplicationConfiguration.g:2261:2: (otherlv_0= '<' ( (lv_element_1_0= ruleMetamodelElement ) ) otherlv_2= '>' )
            {
            // InternalApplicationConfiguration.g:2261:2: (otherlv_0= '<' ( (lv_element_1_0= ruleMetamodelElement ) ) otherlv_2= '>' )
            // InternalApplicationConfiguration.g:2262:3: otherlv_0= '<' ( (lv_element_1_0= ruleMetamodelElement ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getClassReferenceAccess().getLessThanSignKeyword_0());
            		
            // InternalApplicationConfiguration.g:2266:3: ( (lv_element_1_0= ruleMetamodelElement ) )
            // InternalApplicationConfiguration.g:2267:4: (lv_element_1_0= ruleMetamodelElement )
            {
            // InternalApplicationConfiguration.g:2267:4: (lv_element_1_0= ruleMetamodelElement )
            // InternalApplicationConfiguration.g:2268:5: lv_element_1_0= ruleMetamodelElement
            {

            					newCompositeNode(grammarAccess.getClassReferenceAccess().getElementMetamodelElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_element_1_0=ruleMetamodelElement();

            state._fsp--;


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

            otherlv_2=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getClassReferenceAccess().getGreaterThanSignKeyword_2());
            		

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:2293:1: entryRuleObjectReference returns [EObject current=null] : iv_ruleObjectReference= ruleObjectReference EOF ;
    public final EObject entryRuleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectReference = null;


        try {
            // InternalApplicationConfiguration.g:2293:56: (iv_ruleObjectReference= ruleObjectReference EOF )
            // InternalApplicationConfiguration.g:2294:2: iv_ruleObjectReference= ruleObjectReference EOF
            {
             newCompositeNode(grammarAccess.getObjectReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectReference=ruleObjectReference();

            state._fsp--;

             current =iv_ruleObjectReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:2300:1: ruleObjectReference returns [EObject current=null] : ( () otherlv_1= 'node' ) ;
    public final EObject ruleObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2306:2: ( ( () otherlv_1= 'node' ) )
            // InternalApplicationConfiguration.g:2307:2: ( () otherlv_1= 'node' )
            {
            // InternalApplicationConfiguration.g:2307:2: ( () otherlv_1= 'node' )
            // InternalApplicationConfiguration.g:2308:3: () otherlv_1= 'node'
            {
            // InternalApplicationConfiguration.g:2308:3: ()
            // InternalApplicationConfiguration.g:2309:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectReferenceAccess().getObjectReferenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectReferenceAccess().getNodeKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:2323:1: entryRuleIntegerReference returns [EObject current=null] : iv_ruleIntegerReference= ruleIntegerReference EOF ;
    public final EObject entryRuleIntegerReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerReference = null;


        try {
            // InternalApplicationConfiguration.g:2323:57: (iv_ruleIntegerReference= ruleIntegerReference EOF )
            // InternalApplicationConfiguration.g:2324:2: iv_ruleIntegerReference= ruleIntegerReference EOF
            {
             newCompositeNode(grammarAccess.getIntegerReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerReference=ruleIntegerReference();

            state._fsp--;

             current =iv_ruleIntegerReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:2330:1: ruleIntegerReference returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntegerReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2336:2: ( ( () otherlv_1= 'int' ) )
            // InternalApplicationConfiguration.g:2337:2: ( () otherlv_1= 'int' )
            {
            // InternalApplicationConfiguration.g:2337:2: ( () otherlv_1= 'int' )
            // InternalApplicationConfiguration.g:2338:3: () otherlv_1= 'int'
            {
            // InternalApplicationConfiguration.g:2338:3: ()
            // InternalApplicationConfiguration.g:2339:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerReferenceAccess().getIntegerScopeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerReferenceAccess().getIntKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:2353:1: entryRuleRealReference returns [EObject current=null] : iv_ruleRealReference= ruleRealReference EOF ;
    public final EObject entryRuleRealReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealReference = null;


        try {
            // InternalApplicationConfiguration.g:2353:54: (iv_ruleRealReference= ruleRealReference EOF )
            // InternalApplicationConfiguration.g:2354:2: iv_ruleRealReference= ruleRealReference EOF
            {
             newCompositeNode(grammarAccess.getRealReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealReference=ruleRealReference();

            state._fsp--;

             current =iv_ruleRealReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:2360:1: ruleRealReference returns [EObject current=null] : ( () otherlv_1= 'real' ) ;
    public final EObject ruleRealReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2366:2: ( ( () otherlv_1= 'real' ) )
            // InternalApplicationConfiguration.g:2367:2: ( () otherlv_1= 'real' )
            {
            // InternalApplicationConfiguration.g:2367:2: ( () otherlv_1= 'real' )
            // InternalApplicationConfiguration.g:2368:3: () otherlv_1= 'real'
            {
            // InternalApplicationConfiguration.g:2368:3: ()
            // InternalApplicationConfiguration.g:2369:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealReferenceAccess().getRealScopeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRealReferenceAccess().getRealKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:2383:1: entryRuleStringReference returns [EObject current=null] : iv_ruleStringReference= ruleStringReference EOF ;
    public final EObject entryRuleStringReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringReference = null;


        try {
            // InternalApplicationConfiguration.g:2383:56: (iv_ruleStringReference= ruleStringReference EOF )
            // InternalApplicationConfiguration.g:2384:2: iv_ruleStringReference= ruleStringReference EOF
            {
             newCompositeNode(grammarAccess.getStringReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringReference=ruleStringReference();

            state._fsp--;

             current =iv_ruleStringReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:2390:1: ruleStringReference returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2396:2: ( ( () otherlv_1= 'string' ) )
            // InternalApplicationConfiguration.g:2397:2: ( () otherlv_1= 'string' )
            {
            // InternalApplicationConfiguration.g:2397:2: ( () otherlv_1= 'string' )
            // InternalApplicationConfiguration.g:2398:3: () otherlv_1= 'string'
            {
            // InternalApplicationConfiguration.g:2398:3: ()
            // InternalApplicationConfiguration.g:2399:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringReferenceAccess().getStringScopeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStringReferenceAccess().getStringKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:2413:1: entryRuleScopeDeclaration returns [EObject current=null] : iv_ruleScopeDeclaration= ruleScopeDeclaration EOF ;
    public final EObject entryRuleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:2413:57: (iv_ruleScopeDeclaration= ruleScopeDeclaration EOF )
            // InternalApplicationConfiguration.g:2414:2: iv_ruleScopeDeclaration= ruleScopeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getScopeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScopeDeclaration=ruleScopeDeclaration();

            state._fsp--;

             current =iv_ruleScopeDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:2420:1: ruleScopeDeclaration returns [EObject current=null] : (otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleScopeSpecification ) ) ) ;
    public final EObject ruleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_specification_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2426:2: ( (otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleScopeSpecification ) ) ) )
            // InternalApplicationConfiguration.g:2427:2: (otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleScopeSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:2427:2: (otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleScopeSpecification ) ) )
            // InternalApplicationConfiguration.g:2428:3: otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleScopeSpecification ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getScopeDeclarationAccess().getScopeKeyword_0());
            		
            // InternalApplicationConfiguration.g:2432:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:2433:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:2433:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:2434:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScopeDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalApplicationConfiguration.g:2450:3: ( (lv_specification_2_0= ruleScopeSpecification ) )
            // InternalApplicationConfiguration.g:2451:4: (lv_specification_2_0= ruleScopeSpecification )
            {
            // InternalApplicationConfiguration.g:2451:4: (lv_specification_2_0= ruleScopeSpecification )
            // InternalApplicationConfiguration.g:2452:5: lv_specification_2_0= ruleScopeSpecification
            {

            					newCompositeNode(grammarAccess.getScopeDeclarationAccess().getSpecificationScopeSpecificationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_specification_2_0=ruleScopeSpecification();

            state._fsp--;


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


            	leaveRule();

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
    // InternalApplicationConfiguration.g:2473:1: entryRuleScopeReference returns [EObject current=null] : iv_ruleScopeReference= ruleScopeReference EOF ;
    public final EObject entryRuleScopeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeReference = null;


        try {
            // InternalApplicationConfiguration.g:2473:55: (iv_ruleScopeReference= ruleScopeReference EOF )
            // InternalApplicationConfiguration.g:2474:2: iv_ruleScopeReference= ruleScopeReference EOF
            {
             newCompositeNode(grammarAccess.getScopeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScopeReference=ruleScopeReference();

            state._fsp--;

             current =iv_ruleScopeReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:2480:1: ruleScopeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleScopeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2486:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:2487:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:2487:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:2488:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:2488:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:2489:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getScopeReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getScopeReferenceAccess().getReferredScopeDeclarationCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:2503:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalApplicationConfiguration.g:2503:46: (iv_ruleScope= ruleScope EOF )
            // InternalApplicationConfiguration.g:2504:2: iv_ruleScope= ruleScope EOF
            {
             newCompositeNode(grammarAccess.getScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;

             current =iv_ruleScope; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:2510:1: ruleScope returns [EObject current=null] : (this_ScopeSpecification_0= ruleScopeSpecification | this_ScopeReference_1= ruleScopeReference ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        EObject this_ScopeSpecification_0 = null;

        EObject this_ScopeReference_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2516:2: ( (this_ScopeSpecification_0= ruleScopeSpecification | this_ScopeReference_1= ruleScopeReference ) )
            // InternalApplicationConfiguration.g:2517:2: (this_ScopeSpecification_0= ruleScopeSpecification | this_ScopeReference_1= ruleScopeReference )
            {
            // InternalApplicationConfiguration.g:2517:2: (this_ScopeSpecification_0= ruleScopeSpecification | this_ScopeReference_1= ruleScopeReference )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==17) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalApplicationConfiguration.g:2518:3: this_ScopeSpecification_0= ruleScopeSpecification
                    {

                    			newCompositeNode(grammarAccess.getScopeAccess().getScopeSpecificationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScopeSpecification_0=ruleScopeSpecification();

                    state._fsp--;


                    			current = this_ScopeSpecification_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:2527:3: this_ScopeReference_1= ruleScopeReference
                    {

                    			newCompositeNode(grammarAccess.getScopeAccess().getScopeReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScopeReference_1=ruleScopeReference();

                    state._fsp--;


                    			current = this_ScopeReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:2539:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalApplicationConfiguration.g:2539:45: (iv_ruleTask= ruleTask EOF )
            // InternalApplicationConfiguration.g:2540:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:2546:1: ruleTask returns [EObject current=null] : this_GenerationTask_0= ruleGenerationTask ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        EObject this_GenerationTask_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2552:2: (this_GenerationTask_0= ruleGenerationTask )
            // InternalApplicationConfiguration.g:2553:2: this_GenerationTask_0= ruleGenerationTask
            {

            		newCompositeNode(grammarAccess.getTaskAccess().getGenerationTaskParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_GenerationTask_0=ruleGenerationTask();

            state._fsp--;


            		current = this_GenerationTask_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:2564:1: entryRuleGenerationTask returns [EObject current=null] : iv_ruleGenerationTask= ruleGenerationTask EOF ;
    public final EObject entryRuleGenerationTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerationTask = null;


        try {
            // InternalApplicationConfiguration.g:2564:55: (iv_ruleGenerationTask= ruleGenerationTask EOF )
            // InternalApplicationConfiguration.g:2565:2: iv_ruleGenerationTask= ruleGenerationTask EOF
            {
             newCompositeNode(grammarAccess.getGenerationTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenerationTask=ruleGenerationTask();

            state._fsp--;

             current =iv_ruleGenerationTask; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:2571:1: ruleGenerationTask returns [EObject current=null] : (otherlv_0= 'generate' () otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* ) ) ) otherlv_40= '}' ) ;
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
            // InternalApplicationConfiguration.g:2577:2: ( (otherlv_0= 'generate' () otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* ) ) ) otherlv_40= '}' ) )
            // InternalApplicationConfiguration.g:2578:2: (otherlv_0= 'generate' () otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* ) ) ) otherlv_40= '}' )
            {
            // InternalApplicationConfiguration.g:2578:2: (otherlv_0= 'generate' () otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* ) ) ) otherlv_40= '}' )
            // InternalApplicationConfiguration.g:2579:3: otherlv_0= 'generate' () otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* ) ) ) otherlv_40= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getGenerationTaskAccess().getGenerateKeyword_0());
            		
            // InternalApplicationConfiguration.g:2583:3: ()
            // InternalApplicationConfiguration.g:2584:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenerationTaskAccess().getGenerationTaskAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,17,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getGenerationTaskAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalApplicationConfiguration.g:2594:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* ) ) )
            // InternalApplicationConfiguration.g:2595:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* ) )
            {
            // InternalApplicationConfiguration.g:2595:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* ) )
            // InternalApplicationConfiguration.g:2596:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());
            				
            // InternalApplicationConfiguration.g:2599:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )* )
            // InternalApplicationConfiguration.g:2600:6: ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )*
            {
            // InternalApplicationConfiguration.g:2600:6: ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )*
            loop36:
            do {
                int alt36=13;
                alt36 = dfa36.predict(input);
                switch (alt36) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:2601:4: ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2601:4: ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2602:5: {...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalApplicationConfiguration.g:2602:111: ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2603:6: ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalApplicationConfiguration.g:2606:9: ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) )
            	    // InternalApplicationConfiguration.g:2606:10: {...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2606:19: (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) )
            	    // InternalApplicationConfiguration.g:2606:20: otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FOLLOW_10); 

            	    									newLeafNode(otherlv_4, grammarAccess.getGenerationTaskAccess().getMetamodelKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,16,FOLLOW_29); 

            	    									newLeafNode(otherlv_5, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_0_1());
            	    								
            	    // InternalApplicationConfiguration.g:2614:9: ( (lv_metamodel_6_0= ruleMetamodel ) )
            	    // InternalApplicationConfiguration.g:2615:10: (lv_metamodel_6_0= ruleMetamodel )
            	    {
            	    // InternalApplicationConfiguration.g:2615:10: (lv_metamodel_6_0= ruleMetamodel )
            	    // InternalApplicationConfiguration.g:2616:11: lv_metamodel_6_0= ruleMetamodel
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getMetamodelMetamodelParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_metamodel_6_0=ruleMetamodel();

            	    state._fsp--;


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalApplicationConfiguration.g:2639:4: ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2639:4: ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2640:5: {...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalApplicationConfiguration.g:2640:111: ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2641:6: ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalApplicationConfiguration.g:2644:9: ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) )
            	    // InternalApplicationConfiguration.g:2644:10: {...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2644:19: (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) )
            	    // InternalApplicationConfiguration.g:2644:20: otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) )
            	    {
            	    otherlv_7=(Token)match(input,40,FOLLOW_10); 

            	    									newLeafNode(otherlv_7, grammarAccess.getGenerationTaskAccess().getPartialModelKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,16,FOLLOW_29); 

            	    									newLeafNode(otherlv_8, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_1_1());
            	    								
            	    // InternalApplicationConfiguration.g:2652:9: ( (lv_partialModel_9_0= rulePartialModel ) )
            	    // InternalApplicationConfiguration.g:2653:10: (lv_partialModel_9_0= rulePartialModel )
            	    {
            	    // InternalApplicationConfiguration.g:2653:10: (lv_partialModel_9_0= rulePartialModel )
            	    // InternalApplicationConfiguration.g:2654:11: lv_partialModel_9_0= rulePartialModel
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getPartialModelPartialModelParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_partialModel_9_0=rulePartialModel();

            	    state._fsp--;


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalApplicationConfiguration.g:2677:4: ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2677:4: ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2678:5: {...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalApplicationConfiguration.g:2678:111: ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2679:6: ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalApplicationConfiguration.g:2682:9: ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) )
            	    // InternalApplicationConfiguration.g:2682:10: {...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2682:19: (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) )
            	    // InternalApplicationConfiguration.g:2682:20: otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) )
            	    {
            	    otherlv_10=(Token)match(input,26,FOLLOW_10); 

            	    									newLeafNode(otherlv_10, grammarAccess.getGenerationTaskAccess().getPatternsKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,16,FOLLOW_29); 

            	    									newLeafNode(otherlv_11, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_2_1());
            	    								
            	    // InternalApplicationConfiguration.g:2690:9: ( (lv_patterns_12_0= ruleGraphPattern ) )
            	    // InternalApplicationConfiguration.g:2691:10: (lv_patterns_12_0= ruleGraphPattern )
            	    {
            	    // InternalApplicationConfiguration.g:2691:10: (lv_patterns_12_0= ruleGraphPattern )
            	    // InternalApplicationConfiguration.g:2692:11: lv_patterns_12_0= ruleGraphPattern
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getPatternsGraphPatternParserRuleCall_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_patterns_12_0=ruleGraphPattern();

            	    state._fsp--;


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalApplicationConfiguration.g:2715:4: ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2715:4: ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2716:5: {...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalApplicationConfiguration.g:2716:111: ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2717:6: ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalApplicationConfiguration.g:2720:9: ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) )
            	    // InternalApplicationConfiguration.g:2720:10: {...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2720:19: (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) )
            	    // InternalApplicationConfiguration.g:2720:20: otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) )
            	    {
            	    otherlv_13=(Token)match(input,38,FOLLOW_10); 

            	    									newLeafNode(otherlv_13, grammarAccess.getGenerationTaskAccess().getScopeKeyword_3_3_0());
            	    								
            	    otherlv_14=(Token)match(input,16,FOLLOW_29); 

            	    									newLeafNode(otherlv_14, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_3_1());
            	    								
            	    // InternalApplicationConfiguration.g:2728:9: ( (lv_scope_15_0= ruleScope ) )
            	    // InternalApplicationConfiguration.g:2729:10: (lv_scope_15_0= ruleScope )
            	    {
            	    // InternalApplicationConfiguration.g:2729:10: (lv_scope_15_0= ruleScope )
            	    // InternalApplicationConfiguration.g:2730:11: lv_scope_15_0= ruleScope
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getScopeScopeParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_scope_15_0=ruleScope();

            	    state._fsp--;


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalApplicationConfiguration.g:2753:4: ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2753:4: ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2754:5: {...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalApplicationConfiguration.g:2754:111: ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2755:6: ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalApplicationConfiguration.g:2758:9: ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) )
            	    // InternalApplicationConfiguration.g:2758:10: {...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2758:19: (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) )
            	    // InternalApplicationConfiguration.g:2758:20: otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) )
            	    {
            	    otherlv_16=(Token)match(input,41,FOLLOW_10); 

            	    									newLeafNode(otherlv_16, grammarAccess.getGenerationTaskAccess().getNumberKeyword_3_4_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_24); 

            	    									newLeafNode(otherlv_17, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_4_1());
            	    								
            	    // InternalApplicationConfiguration.g:2766:9: ( (lv_number_18_0= RULE_INT ) )
            	    // InternalApplicationConfiguration.g:2767:10: (lv_number_18_0= RULE_INT )
            	    {
            	    // InternalApplicationConfiguration.g:2767:10: (lv_number_18_0= RULE_INT )
            	    // InternalApplicationConfiguration.g:2768:11: lv_number_18_0= RULE_INT
            	    {
            	    lv_number_18_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            	    											newLeafNode(lv_number_18_0, grammarAccess.getGenerationTaskAccess().getNumberINTTerminalRuleCall_3_4_2_0());
            	    										

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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalApplicationConfiguration.g:2790:4: ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2790:4: ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2791:5: {...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalApplicationConfiguration.g:2791:111: ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2792:6: ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalApplicationConfiguration.g:2795:9: ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) )
            	    // InternalApplicationConfiguration.g:2795:10: {...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2795:19: (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) )
            	    // InternalApplicationConfiguration.g:2795:20: otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) )
            	    {
            	    otherlv_19=(Token)match(input,42,FOLLOW_10); 

            	    									newLeafNode(otherlv_19, grammarAccess.getGenerationTaskAccess().getRunsKeyword_3_5_0());
            	    								
            	    otherlv_20=(Token)match(input,16,FOLLOW_24); 

            	    									newLeafNode(otherlv_20, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_5_1());
            	    								
            	    // InternalApplicationConfiguration.g:2803:9: ( (lv_runs_21_0= RULE_INT ) )
            	    // InternalApplicationConfiguration.g:2804:10: (lv_runs_21_0= RULE_INT )
            	    {
            	    // InternalApplicationConfiguration.g:2804:10: (lv_runs_21_0= RULE_INT )
            	    // InternalApplicationConfiguration.g:2805:11: lv_runs_21_0= RULE_INT
            	    {
            	    lv_runs_21_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            	    											newLeafNode(lv_runs_21_0, grammarAccess.getGenerationTaskAccess().getRunsINTTerminalRuleCall_3_5_2_0());
            	    										

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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalApplicationConfiguration.g:2827:4: ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2827:4: ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2828:5: {...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalApplicationConfiguration.g:2828:111: ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2829:6: ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalApplicationConfiguration.g:2832:9: ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) )
            	    // InternalApplicationConfiguration.g:2832:10: {...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2832:19: (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) )
            	    // InternalApplicationConfiguration.g:2832:20: otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) )
            	    {
            	    otherlv_22=(Token)match(input,43,FOLLOW_10); 

            	    									newLeafNode(otherlv_22, grammarAccess.getGenerationTaskAccess().getSolverKeyword_3_6_0());
            	    								
            	    otherlv_23=(Token)match(input,16,FOLLOW_30); 

            	    									newLeafNode(otherlv_23, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_6_1());
            	    								
            	    // InternalApplicationConfiguration.g:2840:9: ( (lv_solver_24_0= ruleSolver ) )
            	    // InternalApplicationConfiguration.g:2841:10: (lv_solver_24_0= ruleSolver )
            	    {
            	    // InternalApplicationConfiguration.g:2841:10: (lv_solver_24_0= ruleSolver )
            	    // InternalApplicationConfiguration.g:2842:11: lv_solver_24_0= ruleSolver
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getSolverSolverEnumRuleCall_3_6_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_solver_24_0=ruleSolver();

            	    state._fsp--;


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalApplicationConfiguration.g:2865:4: ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2865:4: ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2866:5: {...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalApplicationConfiguration.g:2866:111: ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2867:6: ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalApplicationConfiguration.g:2870:9: ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) )
            	    // InternalApplicationConfiguration.g:2870:10: {...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2870:19: (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) )
            	    // InternalApplicationConfiguration.g:2870:20: otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) )
            	    {
            	    otherlv_25=(Token)match(input,27,FOLLOW_10); 

            	    									newLeafNode(otherlv_25, grammarAccess.getGenerationTaskAccess().getConfigKeyword_3_7_0());
            	    								
            	    otherlv_26=(Token)match(input,16,FOLLOW_29); 

            	    									newLeafNode(otherlv_26, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_7_1());
            	    								
            	    // InternalApplicationConfiguration.g:2878:9: ( (lv_config_27_0= ruleConfig ) )
            	    // InternalApplicationConfiguration.g:2879:10: (lv_config_27_0= ruleConfig )
            	    {
            	    // InternalApplicationConfiguration.g:2879:10: (lv_config_27_0= ruleConfig )
            	    // InternalApplicationConfiguration.g:2880:11: lv_config_27_0= ruleConfig
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getConfigConfigParserRuleCall_3_7_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_config_27_0=ruleConfig();

            	    state._fsp--;


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalApplicationConfiguration.g:2903:4: ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2903:4: ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2904:5: {...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalApplicationConfiguration.g:2904:111: ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2905:6: ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalApplicationConfiguration.g:2908:9: ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) )
            	    // InternalApplicationConfiguration.g:2908:10: {...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2908:19: (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) )
            	    // InternalApplicationConfiguration.g:2908:20: otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) )
            	    {
            	    otherlv_28=(Token)match(input,44,FOLLOW_10); 

            	    									newLeafNode(otherlv_28, grammarAccess.getGenerationTaskAccess().getOutputKeyword_3_8_0());
            	    								
            	    otherlv_29=(Token)match(input,16,FOLLOW_18); 

            	    									newLeafNode(otherlv_29, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_8_1());
            	    								
            	    // InternalApplicationConfiguration.g:2916:9: ( (lv_tagetFolder_30_0= ruleFile ) )
            	    // InternalApplicationConfiguration.g:2917:10: (lv_tagetFolder_30_0= ruleFile )
            	    {
            	    // InternalApplicationConfiguration.g:2917:10: (lv_tagetFolder_30_0= ruleFile )
            	    // InternalApplicationConfiguration.g:2918:11: lv_tagetFolder_30_0= ruleFile
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getTagetFolderFileParserRuleCall_3_8_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_tagetFolder_30_0=ruleFile();

            	    state._fsp--;


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalApplicationConfiguration.g:2941:4: ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2941:4: ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2942:5: {...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalApplicationConfiguration.g:2942:111: ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2943:6: ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalApplicationConfiguration.g:2946:9: ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) )
            	    // InternalApplicationConfiguration.g:2946:10: {...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2946:19: (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) )
            	    // InternalApplicationConfiguration.g:2946:20: otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) )
            	    {
            	    otherlv_31=(Token)match(input,45,FOLLOW_10); 

            	    									newLeafNode(otherlv_31, grammarAccess.getGenerationTaskAccess().getDebugKeyword_3_9_0());
            	    								
            	    otherlv_32=(Token)match(input,16,FOLLOW_18); 

            	    									newLeafNode(otherlv_32, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_9_1());
            	    								
            	    // InternalApplicationConfiguration.g:2954:9: ( (lv_debugFolder_33_0= ruleFile ) )
            	    // InternalApplicationConfiguration.g:2955:10: (lv_debugFolder_33_0= ruleFile )
            	    {
            	    // InternalApplicationConfiguration.g:2955:10: (lv_debugFolder_33_0= ruleFile )
            	    // InternalApplicationConfiguration.g:2956:11: lv_debugFolder_33_0= ruleFile
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getDebugFolderFileParserRuleCall_3_9_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_debugFolder_33_0=ruleFile();

            	    state._fsp--;


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalApplicationConfiguration.g:2979:4: ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:2979:4: ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2980:5: {...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // InternalApplicationConfiguration.g:2980:112: ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) )
            	    // InternalApplicationConfiguration.g:2981:6: ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 10);
            	    					
            	    // InternalApplicationConfiguration.g:2984:9: ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) )
            	    // InternalApplicationConfiguration.g:2984:10: {...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:2984:19: (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) )
            	    // InternalApplicationConfiguration.g:2984:20: otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) )
            	    {
            	    otherlv_34=(Token)match(input,46,FOLLOW_10); 

            	    									newLeafNode(otherlv_34, grammarAccess.getGenerationTaskAccess().getLogKeyword_3_10_0());
            	    								
            	    otherlv_35=(Token)match(input,16,FOLLOW_18); 

            	    									newLeafNode(otherlv_35, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_10_1());
            	    								
            	    // InternalApplicationConfiguration.g:2992:9: ( (lv_targetLogFile_36_0= ruleFile ) )
            	    // InternalApplicationConfiguration.g:2993:10: (lv_targetLogFile_36_0= ruleFile )
            	    {
            	    // InternalApplicationConfiguration.g:2993:10: (lv_targetLogFile_36_0= ruleFile )
            	    // InternalApplicationConfiguration.g:2994:11: lv_targetLogFile_36_0= ruleFile
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getTargetLogFileFileParserRuleCall_3_10_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_targetLogFile_36_0=ruleFile();

            	    state._fsp--;


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalApplicationConfiguration.g:3017:4: ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:3017:4: ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:3018:5: {...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // InternalApplicationConfiguration.g:3018:112: ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) )
            	    // InternalApplicationConfiguration.g:3019:6: ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 11);
            	    					
            	    // InternalApplicationConfiguration.g:3022:9: ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) )
            	    // InternalApplicationConfiguration.g:3022:10: {...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:3022:19: (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) )
            	    // InternalApplicationConfiguration.g:3022:20: otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) )
            	    {
            	    otherlv_37=(Token)match(input,47,FOLLOW_10); 

            	    									newLeafNode(otherlv_37, grammarAccess.getGenerationTaskAccess().getStatisticsKeyword_3_11_0());
            	    								
            	    otherlv_38=(Token)match(input,16,FOLLOW_18); 

            	    									newLeafNode(otherlv_38, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_11_1());
            	    								
            	    // InternalApplicationConfiguration.g:3030:9: ( (lv_targetStatisticsFile_39_0= ruleFile ) )
            	    // InternalApplicationConfiguration.g:3031:10: (lv_targetStatisticsFile_39_0= ruleFile )
            	    {
            	    // InternalApplicationConfiguration.g:3031:10: (lv_targetStatisticsFile_39_0= ruleFile )
            	    // InternalApplicationConfiguration.g:3032:11: lv_targetStatisticsFile_39_0= ruleFile
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getTargetStatisticsFileFileParserRuleCall_3_11_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_targetStatisticsFile_39_0=ruleFile();

            	    state._fsp--;


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());
            				

            }

            otherlv_40=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_40, grammarAccess.getGenerationTaskAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalApplicationConfiguration.g:3070:1: ruleSolver returns [Enumerator current=null] : ( (enumLiteral_0= 'SMTSolver' ) | (enumLiteral_1= 'AlloySolver' ) | (enumLiteral_2= 'ViatraSolver' ) ) ;
    public final Enumerator ruleSolver() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:3076:2: ( ( (enumLiteral_0= 'SMTSolver' ) | (enumLiteral_1= 'AlloySolver' ) | (enumLiteral_2= 'ViatraSolver' ) ) )
            // InternalApplicationConfiguration.g:3077:2: ( (enumLiteral_0= 'SMTSolver' ) | (enumLiteral_1= 'AlloySolver' ) | (enumLiteral_2= 'ViatraSolver' ) )
            {
            // InternalApplicationConfiguration.g:3077:2: ( (enumLiteral_0= 'SMTSolver' ) | (enumLiteral_1= 'AlloySolver' ) | (enumLiteral_2= 'ViatraSolver' ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt37=1;
                }
                break;
            case 49:
                {
                alt37=2;
                }
                break;
            case 50:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalApplicationConfiguration.g:3078:3: (enumLiteral_0= 'SMTSolver' )
                    {
                    // InternalApplicationConfiguration.g:3078:3: (enumLiteral_0= 'SMTSolver' )
                    // InternalApplicationConfiguration.g:3079:4: enumLiteral_0= 'SMTSolver'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getSolverAccess().getSMTSolverEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSolverAccess().getSMTSolverEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:3086:3: (enumLiteral_1= 'AlloySolver' )
                    {
                    // InternalApplicationConfiguration.g:3086:3: (enumLiteral_1= 'AlloySolver' )
                    // InternalApplicationConfiguration.g:3087:4: enumLiteral_1= 'AlloySolver'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getSolverAccess().getAlloySolverEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSolverAccess().getAlloySolverEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalApplicationConfiguration.g:3094:3: (enumLiteral_2= 'ViatraSolver' )
                    {
                    // InternalApplicationConfiguration.g:3094:3: (enumLiteral_2= 'ViatraSolver' )
                    // InternalApplicationConfiguration.g:3095:4: enumLiteral_2= 'ViatraSolver'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getSolverAccess().getViatraSolverEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSolverAccess().getViatraSolverEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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

    // Delegated rules


    protected DFA36 dfa36 = new DFA36(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\23\15\uffff";
    static final String dfa_3s = "\1\57\15\uffff";
    static final String dfa_4s = "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_5s = "\1\0\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\3\uffff\1\2\2\uffff\1\4\1\11\12\uffff\1\5\1\uffff\1\3\1\6\1\7\1\10\1\12\1\13\1\14\1\15",
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

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 2600:6: ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'patterns' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'scope' otherlv_14= '=' ( (lv_scope_15_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'number' otherlv_17= '=' ( (lv_number_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'runs' otherlv_20= '=' ( (lv_runs_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'solver' otherlv_23= '=' ( (lv_solver_24_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'config' otherlv_26= '=' ( (lv_config_27_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'output' otherlv_29= '=' ( (lv_tagetFolder_30_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_0 = input.LA(1);

                         
                        int index36_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA36_0==19) ) {s = 1;}

                        else if ( LA36_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA36_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA36_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA36_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA36_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA36_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA36_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA36_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA36_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA36_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                        else if ( LA36_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 10) ) {s = 12;}

                        else if ( LA36_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 11) ) {s = 13;}

                         
                        input.seek(index36_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000C00E809002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000C00E808002L});
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
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000003D00000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000FF400C880000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0007000000000000L});

}
