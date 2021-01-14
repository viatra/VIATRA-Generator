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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'-'", "'import'", "'epackage'", "'viatra'", "'file'", "'='", "'{'", "','", "'}'", "'package'", "'excluding'", "'::'", "'metamodel'", "'folder'", "'models'", "'constraints'", "'cost'", "'objectives'", "'config'", "'log-level'", "'runtime'", "'memory'", "'#'", "'+='", "'<'", "'>'", "'node'", "'int'", "'real'", "'string'", "'*'", "'..'", "'scope'", "'generate'", "'partial-model'", "'number'", "'runs'", "'solver'", "'debug'", "'log'", "'statistics'", "'output'", "'minimize'", "'maximize'", "'<='", "'>='", "'none'", "'normal'", "'full'", "'SMTSolver'", "'AlloySolver'", "'ViatraSolver'"
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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

                if ( (LA1_0==13) ) {
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

                if ( (LA2_0==16||LA2_0==24||(LA2_0>=26 && LA2_0<=27)||(LA2_0>=29 && LA2_0<=30)||(LA2_0>=44 && LA2_0<=45)) ) {
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

            if ( (LA3_0==16||LA3_0==24||(LA3_0>=26 && LA3_0<=27)||(LA3_0>=29 && LA3_0<=30)||LA3_0==44) ) {
                alt3=1;
            }
            else if ( (LA3_0==45) ) {
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


    // $ANTLR start "entryRuleREALLiteral"
    // InternalApplicationConfiguration.g:198:1: entryRuleREALLiteral returns [String current=null] : iv_ruleREALLiteral= ruleREALLiteral EOF ;
    public final String entryRuleREALLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREALLiteral = null;


        try {
            // InternalApplicationConfiguration.g:198:51: (iv_ruleREALLiteral= ruleREALLiteral EOF )
            // InternalApplicationConfiguration.g:199:2: iv_ruleREALLiteral= ruleREALLiteral EOF
            {
             newCompositeNode(grammarAccess.getREALLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREALLiteral=ruleREALLiteral();

            state._fsp--;

             current =iv_ruleREALLiteral.getText(); 
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
    // $ANTLR end "entryRuleREALLiteral"


    // $ANTLR start "ruleREALLiteral"
    // InternalApplicationConfiguration.g:205:1: ruleREALLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREALLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:211:2: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            // InternalApplicationConfiguration.g:212:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            {
            // InternalApplicationConfiguration.g:212:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // InternalApplicationConfiguration.g:213:3: (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            // InternalApplicationConfiguration.g:213:3: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalApplicationConfiguration.g:214:4: kw= '-'
                    {
                    kw=(Token)match(input,12,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getREALLiteralAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_8); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getREALLiteralAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,11,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALLiteralAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getREALLiteralAccess().getINTTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleREALLiteral"


    // $ANTLR start "entryRuleINTLiteral"
    // InternalApplicationConfiguration.g:243:1: entryRuleINTLiteral returns [String current=null] : iv_ruleINTLiteral= ruleINTLiteral EOF ;
    public final String entryRuleINTLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTLiteral = null;


        try {
            // InternalApplicationConfiguration.g:243:50: (iv_ruleINTLiteral= ruleINTLiteral EOF )
            // InternalApplicationConfiguration.g:244:2: iv_ruleINTLiteral= ruleINTLiteral EOF
            {
             newCompositeNode(grammarAccess.getINTLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINTLiteral=ruleINTLiteral();

            state._fsp--;

             current =iv_ruleINTLiteral.getText(); 
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
    // $ANTLR end "entryRuleINTLiteral"


    // $ANTLR start "ruleINTLiteral"
    // InternalApplicationConfiguration.g:250:1: ruleINTLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleINTLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:256:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalApplicationConfiguration.g:257:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalApplicationConfiguration.g:257:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalApplicationConfiguration.g:258:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalApplicationConfiguration.g:258:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalApplicationConfiguration.g:259:4: kw= '-'
                    {
                    kw=(Token)match(input,12,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getINTLiteralAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getINTLiteralAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleINTLiteral"


    // $ANTLR start "entryRuleImport"
    // InternalApplicationConfiguration.g:276:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalApplicationConfiguration.g:276:47: (iv_ruleImport= ruleImport EOF )
            // InternalApplicationConfiguration.g:277:2: iv_ruleImport= ruleImport EOF
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
    // InternalApplicationConfiguration.g:283:1: ruleImport returns [EObject current=null] : (this_EPackageImport_0= ruleEPackageImport | this_ViatraImport_1= ruleViatraImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_EPackageImport_0 = null;

        EObject this_ViatraImport_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:289:2: ( (this_EPackageImport_0= ruleEPackageImport | this_ViatraImport_1= ruleViatraImport ) )
            // InternalApplicationConfiguration.g:290:2: (this_EPackageImport_0= ruleEPackageImport | this_ViatraImport_1= ruleViatraImport )
            {
            // InternalApplicationConfiguration.g:290:2: (this_EPackageImport_0= ruleEPackageImport | this_ViatraImport_1= ruleViatraImport )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==14) ) {
                    alt7=1;
                }
                else if ( (LA7_1==15) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalApplicationConfiguration.g:291:3: this_EPackageImport_0= ruleEPackageImport
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
                    // InternalApplicationConfiguration.g:300:3: this_ViatraImport_1= ruleViatraImport
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
    // InternalApplicationConfiguration.g:312:1: entryRuleEPackageImport returns [EObject current=null] : iv_ruleEPackageImport= ruleEPackageImport EOF ;
    public final EObject entryRuleEPackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPackageImport = null;


        try {
            // InternalApplicationConfiguration.g:312:55: (iv_ruleEPackageImport= ruleEPackageImport EOF )
            // InternalApplicationConfiguration.g:313:2: iv_ruleEPackageImport= ruleEPackageImport EOF
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
    // InternalApplicationConfiguration.g:319:1: ruleEPackageImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= 'epackage' ( (otherlv_2= RULE_STRING ) ) ) ;
    public final EObject ruleEPackageImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:325:2: ( (otherlv_0= 'import' otherlv_1= 'epackage' ( (otherlv_2= RULE_STRING ) ) ) )
            // InternalApplicationConfiguration.g:326:2: (otherlv_0= 'import' otherlv_1= 'epackage' ( (otherlv_2= RULE_STRING ) ) )
            {
            // InternalApplicationConfiguration.g:326:2: (otherlv_0= 'import' otherlv_1= 'epackage' ( (otherlv_2= RULE_STRING ) ) )
            // InternalApplicationConfiguration.g:327:3: otherlv_0= 'import' otherlv_1= 'epackage' ( (otherlv_2= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEPackageImportAccess().getImportKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEPackageImportAccess().getEpackageKeyword_1());
            		
            // InternalApplicationConfiguration.g:335:3: ( (otherlv_2= RULE_STRING ) )
            // InternalApplicationConfiguration.g:336:4: (otherlv_2= RULE_STRING )
            {
            // InternalApplicationConfiguration.g:336:4: (otherlv_2= RULE_STRING )
            // InternalApplicationConfiguration.g:337:5: otherlv_2= RULE_STRING
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
    // InternalApplicationConfiguration.g:352:1: entryRuleViatraImport returns [EObject current=null] : iv_ruleViatraImport= ruleViatraImport EOF ;
    public final EObject entryRuleViatraImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViatraImport = null;


        try {
            // InternalApplicationConfiguration.g:352:53: (iv_ruleViatraImport= ruleViatraImport EOF )
            // InternalApplicationConfiguration.g:353:2: iv_ruleViatraImport= ruleViatraImport EOF
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
    // InternalApplicationConfiguration.g:359:1: ruleViatraImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= 'viatra' ( (otherlv_2= RULE_STRING ) ) ) ;
    public final EObject ruleViatraImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:365:2: ( (otherlv_0= 'import' otherlv_1= 'viatra' ( (otherlv_2= RULE_STRING ) ) ) )
            // InternalApplicationConfiguration.g:366:2: (otherlv_0= 'import' otherlv_1= 'viatra' ( (otherlv_2= RULE_STRING ) ) )
            {
            // InternalApplicationConfiguration.g:366:2: (otherlv_0= 'import' otherlv_1= 'viatra' ( (otherlv_2= RULE_STRING ) ) )
            // InternalApplicationConfiguration.g:367:3: otherlv_0= 'import' otherlv_1= 'viatra' ( (otherlv_2= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getViatraImportAccess().getImportKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getViatraImportAccess().getViatraKeyword_1());
            		
            // InternalApplicationConfiguration.g:375:3: ( (otherlv_2= RULE_STRING ) )
            // InternalApplicationConfiguration.g:376:4: (otherlv_2= RULE_STRING )
            {
            // InternalApplicationConfiguration.g:376:4: (otherlv_2= RULE_STRING )
            // InternalApplicationConfiguration.g:377:5: otherlv_2= RULE_STRING
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
    // InternalApplicationConfiguration.g:392:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:392:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalApplicationConfiguration.g:393:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalApplicationConfiguration.g:399:1: ruleDeclaration returns [EObject current=null] : (this_FileDeclaration_0= ruleFileDeclaration | this_MetamodelDeclaration_1= ruleMetamodelDeclaration | this_PartialModelDeclaration_2= rulePartialModelDeclaration | this_GraphPatternDeclaration_3= ruleGraphPatternDeclaration | this_ConfigDeclaration_4= ruleConfigDeclaration | this_ScopeDeclaration_5= ruleScopeDeclaration | this_ObjectiveDeclaration_6= ruleObjectiveDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_FileDeclaration_0 = null;

        EObject this_MetamodelDeclaration_1 = null;

        EObject this_PartialModelDeclaration_2 = null;

        EObject this_GraphPatternDeclaration_3 = null;

        EObject this_ConfigDeclaration_4 = null;

        EObject this_ScopeDeclaration_5 = null;

        EObject this_ObjectiveDeclaration_6 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:405:2: ( (this_FileDeclaration_0= ruleFileDeclaration | this_MetamodelDeclaration_1= ruleMetamodelDeclaration | this_PartialModelDeclaration_2= rulePartialModelDeclaration | this_GraphPatternDeclaration_3= ruleGraphPatternDeclaration | this_ConfigDeclaration_4= ruleConfigDeclaration | this_ScopeDeclaration_5= ruleScopeDeclaration | this_ObjectiveDeclaration_6= ruleObjectiveDeclaration ) )
            // InternalApplicationConfiguration.g:406:2: (this_FileDeclaration_0= ruleFileDeclaration | this_MetamodelDeclaration_1= ruleMetamodelDeclaration | this_PartialModelDeclaration_2= rulePartialModelDeclaration | this_GraphPatternDeclaration_3= ruleGraphPatternDeclaration | this_ConfigDeclaration_4= ruleConfigDeclaration | this_ScopeDeclaration_5= ruleScopeDeclaration | this_ObjectiveDeclaration_6= ruleObjectiveDeclaration )
            {
            // InternalApplicationConfiguration.g:406:2: (this_FileDeclaration_0= ruleFileDeclaration | this_MetamodelDeclaration_1= ruleMetamodelDeclaration | this_PartialModelDeclaration_2= rulePartialModelDeclaration | this_GraphPatternDeclaration_3= ruleGraphPatternDeclaration | this_ConfigDeclaration_4= ruleConfigDeclaration | this_ScopeDeclaration_5= ruleScopeDeclaration | this_ObjectiveDeclaration_6= ruleObjectiveDeclaration )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case 27:
                {
                alt8=4;
                }
                break;
            case 30:
                {
                alt8=5;
                }
                break;
            case 44:
                {
                alt8=6;
                }
                break;
            case 29:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalApplicationConfiguration.g:407:3: this_FileDeclaration_0= ruleFileDeclaration
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
                    // InternalApplicationConfiguration.g:416:3: this_MetamodelDeclaration_1= ruleMetamodelDeclaration
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
                    // InternalApplicationConfiguration.g:425:3: this_PartialModelDeclaration_2= rulePartialModelDeclaration
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
                    // InternalApplicationConfiguration.g:434:3: this_GraphPatternDeclaration_3= ruleGraphPatternDeclaration
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
                    // InternalApplicationConfiguration.g:443:3: this_ConfigDeclaration_4= ruleConfigDeclaration
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
                    // InternalApplicationConfiguration.g:452:3: this_ScopeDeclaration_5= ruleScopeDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getScopeDeclarationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScopeDeclaration_5=ruleScopeDeclaration();

                    state._fsp--;


                    			current = this_ScopeDeclaration_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalApplicationConfiguration.g:461:3: this_ObjectiveDeclaration_6= ruleObjectiveDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getObjectiveDeclarationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectiveDeclaration_6=ruleObjectiveDeclaration();

                    state._fsp--;


                    			current = this_ObjectiveDeclaration_6;
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
    // InternalApplicationConfiguration.g:473:1: entryRuleFileSpecification returns [EObject current=null] : iv_ruleFileSpecification= ruleFileSpecification EOF ;
    public final EObject entryRuleFileSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileSpecification = null;


        try {
            // InternalApplicationConfiguration.g:473:58: (iv_ruleFileSpecification= ruleFileSpecification EOF )
            // InternalApplicationConfiguration.g:474:2: iv_ruleFileSpecification= ruleFileSpecification EOF
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
    // InternalApplicationConfiguration.g:480:1: ruleFileSpecification returns [EObject current=null] : ( (lv_path_0_0= RULE_STRING ) ) ;
    public final EObject ruleFileSpecification() throws RecognitionException {
        EObject current = null;

        Token lv_path_0_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:486:2: ( ( (lv_path_0_0= RULE_STRING ) ) )
            // InternalApplicationConfiguration.g:487:2: ( (lv_path_0_0= RULE_STRING ) )
            {
            // InternalApplicationConfiguration.g:487:2: ( (lv_path_0_0= RULE_STRING ) )
            // InternalApplicationConfiguration.g:488:3: (lv_path_0_0= RULE_STRING )
            {
            // InternalApplicationConfiguration.g:488:3: (lv_path_0_0= RULE_STRING )
            // InternalApplicationConfiguration.g:489:4: lv_path_0_0= RULE_STRING
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
    // InternalApplicationConfiguration.g:508:1: entryRuleFileDeclaration returns [EObject current=null] : iv_ruleFileDeclaration= ruleFileDeclaration EOF ;
    public final EObject entryRuleFileDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:508:56: (iv_ruleFileDeclaration= ruleFileDeclaration EOF )
            // InternalApplicationConfiguration.g:509:2: iv_ruleFileDeclaration= ruleFileDeclaration EOF
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
    // InternalApplicationConfiguration.g:515:1: ruleFileDeclaration returns [EObject current=null] : (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_specification_3_0= ruleFileSpecification ) ) ) ;
    public final EObject ruleFileDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_specification_3_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:521:2: ( (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_specification_3_0= ruleFileSpecification ) ) ) )
            // InternalApplicationConfiguration.g:522:2: (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_specification_3_0= ruleFileSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:522:2: (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_specification_3_0= ruleFileSpecification ) ) )
            // InternalApplicationConfiguration.g:523:3: otherlv_0= 'file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_specification_3_0= ruleFileSpecification ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFileDeclarationAccess().getFileKeyword_0());
            		
            // InternalApplicationConfiguration.g:527:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:528:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:528:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:529:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getFileDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalApplicationConfiguration.g:549:3: ( (lv_specification_3_0= ruleFileSpecification ) )
            // InternalApplicationConfiguration.g:550:4: (lv_specification_3_0= ruleFileSpecification )
            {
            // InternalApplicationConfiguration.g:550:4: (lv_specification_3_0= ruleFileSpecification )
            // InternalApplicationConfiguration.g:551:5: lv_specification_3_0= ruleFileSpecification
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
    // InternalApplicationConfiguration.g:572:1: entryRuleFileReference returns [EObject current=null] : iv_ruleFileReference= ruleFileReference EOF ;
    public final EObject entryRuleFileReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileReference = null;


        try {
            // InternalApplicationConfiguration.g:572:54: (iv_ruleFileReference= ruleFileReference EOF )
            // InternalApplicationConfiguration.g:573:2: iv_ruleFileReference= ruleFileReference EOF
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
    // InternalApplicationConfiguration.g:579:1: ruleFileReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleFileReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:585:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:586:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:586:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:587:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:587:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:588:4: otherlv_0= RULE_ID
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
    // InternalApplicationConfiguration.g:602:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalApplicationConfiguration.g:602:45: (iv_ruleFile= ruleFile EOF )
            // InternalApplicationConfiguration.g:603:2: iv_ruleFile= ruleFile EOF
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
    // InternalApplicationConfiguration.g:609:1: ruleFile returns [EObject current=null] : (this_FileSpecification_0= ruleFileSpecification | this_FileReference_1= ruleFileReference ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject this_FileSpecification_0 = null;

        EObject this_FileReference_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:615:2: ( (this_FileSpecification_0= ruleFileSpecification | this_FileReference_1= ruleFileReference ) )
            // InternalApplicationConfiguration.g:616:2: (this_FileSpecification_0= ruleFileSpecification | this_FileReference_1= ruleFileReference )
            {
            // InternalApplicationConfiguration.g:616:2: (this_FileSpecification_0= ruleFileSpecification | this_FileReference_1= ruleFileReference )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalApplicationConfiguration.g:617:3: this_FileSpecification_0= ruleFileSpecification
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
                    // InternalApplicationConfiguration.g:626:3: this_FileReference_1= ruleFileReference
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
    // InternalApplicationConfiguration.g:638:1: entryRuleMetamodelSpecification returns [EObject current=null] : iv_ruleMetamodelSpecification= ruleMetamodelSpecification EOF ;
    public final EObject entryRuleMetamodelSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelSpecification = null;


        try {
            // InternalApplicationConfiguration.g:638:63: (iv_ruleMetamodelSpecification= ruleMetamodelSpecification EOF )
            // InternalApplicationConfiguration.g:639:2: iv_ruleMetamodelSpecification= ruleMetamodelSpecification EOF
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
    // InternalApplicationConfiguration.g:645:1: ruleMetamodelSpecification returns [EObject current=null] : (otherlv_0= '{' ( (lv_entries_1_0= ruleMetamodelEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleMetamodelSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:651:2: ( (otherlv_0= '{' ( (lv_entries_1_0= ruleMetamodelEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )* otherlv_4= '}' ) )
            // InternalApplicationConfiguration.g:652:2: (otherlv_0= '{' ( (lv_entries_1_0= ruleMetamodelEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )* otherlv_4= '}' )
            {
            // InternalApplicationConfiguration.g:652:2: (otherlv_0= '{' ( (lv_entries_1_0= ruleMetamodelEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )* otherlv_4= '}' )
            // InternalApplicationConfiguration.g:653:3: otherlv_0= '{' ( (lv_entries_1_0= ruleMetamodelEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getMetamodelSpecificationAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalApplicationConfiguration.g:657:3: ( (lv_entries_1_0= ruleMetamodelEntry ) )
            // InternalApplicationConfiguration.g:658:4: (lv_entries_1_0= ruleMetamodelEntry )
            {
            // InternalApplicationConfiguration.g:658:4: (lv_entries_1_0= ruleMetamodelEntry )
            // InternalApplicationConfiguration.g:659:5: lv_entries_1_0= ruleMetamodelEntry
            {

            					newCompositeNode(grammarAccess.getMetamodelSpecificationAccess().getEntriesMetamodelEntryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalApplicationConfiguration.g:676:3: (otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:677:4: otherlv_2= ',' ( (lv_entries_3_0= ruleMetamodelEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMetamodelSpecificationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalApplicationConfiguration.g:681:4: ( (lv_entries_3_0= ruleMetamodelEntry ) )
            	    // InternalApplicationConfiguration.g:682:5: (lv_entries_3_0= ruleMetamodelEntry )
            	    {
            	    // InternalApplicationConfiguration.g:682:5: (lv_entries_3_0= ruleMetamodelEntry )
            	    // InternalApplicationConfiguration.g:683:6: lv_entries_3_0= ruleMetamodelEntry
            	    {

            	    						newCompositeNode(grammarAccess.getMetamodelSpecificationAccess().getEntriesMetamodelEntryParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:709:1: entryRuleMetamodelEntry returns [EObject current=null] : iv_ruleMetamodelEntry= ruleMetamodelEntry EOF ;
    public final EObject entryRuleMetamodelEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelEntry = null;


        try {
            // InternalApplicationConfiguration.g:709:55: (iv_ruleMetamodelEntry= ruleMetamodelEntry EOF )
            // InternalApplicationConfiguration.g:710:2: iv_ruleMetamodelEntry= ruleMetamodelEntry EOF
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
    // InternalApplicationConfiguration.g:716:1: ruleMetamodelEntry returns [EObject current=null] : (this_MetamodelElement_0= ruleMetamodelElement | this_AllPackageEntry_1= ruleAllPackageEntry ) ;
    public final EObject ruleMetamodelEntry() throws RecognitionException {
        EObject current = null;

        EObject this_MetamodelElement_0 = null;

        EObject this_AllPackageEntry_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:722:2: ( (this_MetamodelElement_0= ruleMetamodelElement | this_AllPackageEntry_1= ruleAllPackageEntry ) )
            // InternalApplicationConfiguration.g:723:2: (this_MetamodelElement_0= ruleMetamodelElement | this_AllPackageEntry_1= ruleAllPackageEntry )
            {
            // InternalApplicationConfiguration.g:723:2: (this_MetamodelElement_0= ruleMetamodelElement | this_AllPackageEntry_1= ruleAllPackageEntry )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalApplicationConfiguration.g:724:3: this_MetamodelElement_0= ruleMetamodelElement
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
                    // InternalApplicationConfiguration.g:733:3: this_AllPackageEntry_1= ruleAllPackageEntry
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
    // InternalApplicationConfiguration.g:745:1: entryRuleAllPackageEntry returns [EObject current=null] : iv_ruleAllPackageEntry= ruleAllPackageEntry EOF ;
    public final EObject entryRuleAllPackageEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllPackageEntry = null;


        try {
            // InternalApplicationConfiguration.g:745:56: (iv_ruleAllPackageEntry= ruleAllPackageEntry EOF )
            // InternalApplicationConfiguration.g:746:2: iv_ruleAllPackageEntry= ruleAllPackageEntry EOF
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
    // InternalApplicationConfiguration.g:752:1: ruleAllPackageEntry returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )? ) ;
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
            // InternalApplicationConfiguration.g:758:2: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )? ) )
            // InternalApplicationConfiguration.g:759:2: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )? )
            {
            // InternalApplicationConfiguration.g:759:2: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )? )
            // InternalApplicationConfiguration.g:760:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAllPackageEntryAccess().getPackageKeyword_0());
            		
            // InternalApplicationConfiguration.g:764:3: ( ( ruleQualifiedName ) )
            // InternalApplicationConfiguration.g:765:4: ( ruleQualifiedName )
            {
            // InternalApplicationConfiguration.g:765:4: ( ruleQualifiedName )
            // InternalApplicationConfiguration.g:766:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllPackageEntryRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllPackageEntryAccess().getPackageEPackageCrossReference_1_0());
            				
            pushFollow(FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApplicationConfiguration.g:780:3: (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalApplicationConfiguration.g:781:4: otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleMetamodelElement ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getAllPackageEntryAccess().getExcludingKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllPackageEntryAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalApplicationConfiguration.g:789:4: ( (lv_exclusion_4_0= ruleMetamodelElement ) )
                    // InternalApplicationConfiguration.g:790:5: (lv_exclusion_4_0= ruleMetamodelElement )
                    {
                    // InternalApplicationConfiguration.g:790:5: (lv_exclusion_4_0= ruleMetamodelElement )
                    // InternalApplicationConfiguration.g:791:6: lv_exclusion_4_0= ruleMetamodelElement
                    {

                    						newCompositeNode(grammarAccess.getAllPackageEntryAccess().getExclusionMetamodelElementParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalApplicationConfiguration.g:808:4: (otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==19) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:809:5: otherlv_5= ',' ( (lv_exclusion_6_0= ruleMetamodelElement ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAllPackageEntryAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalApplicationConfiguration.g:813:5: ( (lv_exclusion_6_0= ruleMetamodelElement ) )
                    	    // InternalApplicationConfiguration.g:814:6: (lv_exclusion_6_0= ruleMetamodelElement )
                    	    {
                    	    // InternalApplicationConfiguration.g:814:6: (lv_exclusion_6_0= ruleMetamodelElement )
                    	    // InternalApplicationConfiguration.g:815:7: lv_exclusion_6_0= ruleMetamodelElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getAllPackageEntryAccess().getExclusionMetamodelElementParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:842:1: entryRuleMetamodelElement returns [EObject current=null] : iv_ruleMetamodelElement= ruleMetamodelElement EOF ;
    public final EObject entryRuleMetamodelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelElement = null;


        try {
            // InternalApplicationConfiguration.g:842:57: (iv_ruleMetamodelElement= ruleMetamodelElement EOF )
            // InternalApplicationConfiguration.g:843:2: iv_ruleMetamodelElement= ruleMetamodelElement EOF
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
    // InternalApplicationConfiguration.g:849:1: ruleMetamodelElement returns [EObject current=null] : ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleMetamodelElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:855:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalApplicationConfiguration.g:856:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalApplicationConfiguration.g:856:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )? )
            // InternalApplicationConfiguration.g:857:3: ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalApplicationConfiguration.g:857:3: ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==11) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==RULE_ID) ) {
                        int LA14_5 = input.LA(4);

                        if ( (LA14_5==11||LA14_5==23) ) {
                            alt14=1;
                        }
                    }
                }
                else if ( (LA14_1==23) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalApplicationConfiguration.g:858:4: ( ( ruleQualifiedName ) ) otherlv_1= '::'
                    {
                    // InternalApplicationConfiguration.g:858:4: ( ( ruleQualifiedName ) )
                    // InternalApplicationConfiguration.g:859:5: ( ruleQualifiedName )
                    {
                    // InternalApplicationConfiguration.g:859:5: ( ruleQualifiedName )
                    // InternalApplicationConfiguration.g:860:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMetamodelElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMetamodelElementAccess().getPackageEPackageCrossReference_0_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getMetamodelElementAccess().getColonColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalApplicationConfiguration.g:879:3: ( (otherlv_2= RULE_ID ) )
            // InternalApplicationConfiguration.g:880:4: (otherlv_2= RULE_ID )
            {
            // InternalApplicationConfiguration.g:880:4: (otherlv_2= RULE_ID )
            // InternalApplicationConfiguration.g:881:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetamodelElementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_2, grammarAccess.getMetamodelElementAccess().getClassifierEClassifierCrossReference_1_0());
            				

            }


            }

            // InternalApplicationConfiguration.g:892:3: (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==11) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalApplicationConfiguration.g:893:4: otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,11,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getMetamodelElementAccess().getFullStopKeyword_2_0());
                    			
                    // InternalApplicationConfiguration.g:897:4: ( (otherlv_4= RULE_ID ) )
                    // InternalApplicationConfiguration.g:898:5: (otherlv_4= RULE_ID )
                    {
                    // InternalApplicationConfiguration.g:898:5: (otherlv_4= RULE_ID )
                    // InternalApplicationConfiguration.g:899:6: otherlv_4= RULE_ID
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
    // InternalApplicationConfiguration.g:915:1: entryRuleMetamodelDeclaration returns [EObject current=null] : iv_ruleMetamodelDeclaration= ruleMetamodelDeclaration EOF ;
    public final EObject entryRuleMetamodelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:915:61: (iv_ruleMetamodelDeclaration= ruleMetamodelDeclaration EOF )
            // InternalApplicationConfiguration.g:916:2: iv_ruleMetamodelDeclaration= ruleMetamodelDeclaration EOF
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
    // InternalApplicationConfiguration.g:922:1: ruleMetamodelDeclaration returns [EObject current=null] : (otherlv_0= 'metamodel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleMetamodelSpecification ) ) ) ;
    public final EObject ruleMetamodelDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_specification_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:928:2: ( (otherlv_0= 'metamodel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleMetamodelSpecification ) ) ) )
            // InternalApplicationConfiguration.g:929:2: (otherlv_0= 'metamodel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleMetamodelSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:929:2: (otherlv_0= 'metamodel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleMetamodelSpecification ) ) )
            // InternalApplicationConfiguration.g:930:3: otherlv_0= 'metamodel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleMetamodelSpecification ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMetamodelDeclarationAccess().getMetamodelKeyword_0());
            		
            // InternalApplicationConfiguration.g:934:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:935:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:935:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:936:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            // InternalApplicationConfiguration.g:952:3: ( (lv_specification_2_0= ruleMetamodelSpecification ) )
            // InternalApplicationConfiguration.g:953:4: (lv_specification_2_0= ruleMetamodelSpecification )
            {
            // InternalApplicationConfiguration.g:953:4: (lv_specification_2_0= ruleMetamodelSpecification )
            // InternalApplicationConfiguration.g:954:5: lv_specification_2_0= ruleMetamodelSpecification
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
    // InternalApplicationConfiguration.g:975:1: entryRuleMetamodelReference returns [EObject current=null] : iv_ruleMetamodelReference= ruleMetamodelReference EOF ;
    public final EObject entryRuleMetamodelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelReference = null;


        try {
            // InternalApplicationConfiguration.g:975:59: (iv_ruleMetamodelReference= ruleMetamodelReference EOF )
            // InternalApplicationConfiguration.g:976:2: iv_ruleMetamodelReference= ruleMetamodelReference EOF
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
    // InternalApplicationConfiguration.g:982:1: ruleMetamodelReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleMetamodelReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:988:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:989:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:989:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:990:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:990:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:991:4: otherlv_0= RULE_ID
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
    // InternalApplicationConfiguration.g:1005:1: entryRuleMetamodel returns [EObject current=null] : iv_ruleMetamodel= ruleMetamodel EOF ;
    public final EObject entryRuleMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodel = null;


        try {
            // InternalApplicationConfiguration.g:1005:50: (iv_ruleMetamodel= ruleMetamodel EOF )
            // InternalApplicationConfiguration.g:1006:2: iv_ruleMetamodel= ruleMetamodel EOF
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
    // InternalApplicationConfiguration.g:1012:1: ruleMetamodel returns [EObject current=null] : (this_MetamodelReference_0= ruleMetamodelReference | this_MetamodelSpecification_1= ruleMetamodelSpecification ) ;
    public final EObject ruleMetamodel() throws RecognitionException {
        EObject current = null;

        EObject this_MetamodelReference_0 = null;

        EObject this_MetamodelSpecification_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1018:2: ( (this_MetamodelReference_0= ruleMetamodelReference | this_MetamodelSpecification_1= ruleMetamodelSpecification ) )
            // InternalApplicationConfiguration.g:1019:2: (this_MetamodelReference_0= ruleMetamodelReference | this_MetamodelSpecification_1= ruleMetamodelSpecification )
            {
            // InternalApplicationConfiguration.g:1019:2: (this_MetamodelReference_0= ruleMetamodelReference | this_MetamodelSpecification_1= ruleMetamodelSpecification )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==18) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalApplicationConfiguration.g:1020:3: this_MetamodelReference_0= ruleMetamodelReference
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
                    // InternalApplicationConfiguration.g:1029:3: this_MetamodelSpecification_1= ruleMetamodelSpecification
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
    // InternalApplicationConfiguration.g:1041:1: entryRulePartialModelSpecification returns [EObject current=null] : iv_rulePartialModelSpecification= rulePartialModelSpecification EOF ;
    public final EObject entryRulePartialModelSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialModelSpecification = null;


        try {
            // InternalApplicationConfiguration.g:1041:66: (iv_rulePartialModelSpecification= rulePartialModelSpecification EOF )
            // InternalApplicationConfiguration.g:1042:2: iv_rulePartialModelSpecification= rulePartialModelSpecification EOF
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
    // InternalApplicationConfiguration.g:1048:1: rulePartialModelSpecification returns [EObject current=null] : (otherlv_0= '{' ( (lv_entry_1_0= rulePartialModelEntry ) ) (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )? otherlv_4= '}' ) ;
    public final EObject rulePartialModelSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entry_1_0 = null;

        EObject lv_entry_3_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1054:2: ( (otherlv_0= '{' ( (lv_entry_1_0= rulePartialModelEntry ) ) (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )? otherlv_4= '}' ) )
            // InternalApplicationConfiguration.g:1055:2: (otherlv_0= '{' ( (lv_entry_1_0= rulePartialModelEntry ) ) (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )? otherlv_4= '}' )
            {
            // InternalApplicationConfiguration.g:1055:2: (otherlv_0= '{' ( (lv_entry_1_0= rulePartialModelEntry ) ) (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )? otherlv_4= '}' )
            // InternalApplicationConfiguration.g:1056:3: otherlv_0= '{' ( (lv_entry_1_0= rulePartialModelEntry ) ) (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getPartialModelSpecificationAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalApplicationConfiguration.g:1060:3: ( (lv_entry_1_0= rulePartialModelEntry ) )
            // InternalApplicationConfiguration.g:1061:4: (lv_entry_1_0= rulePartialModelEntry )
            {
            // InternalApplicationConfiguration.g:1061:4: (lv_entry_1_0= rulePartialModelEntry )
            // InternalApplicationConfiguration.g:1062:5: lv_entry_1_0= rulePartialModelEntry
            {

            					newCompositeNode(grammarAccess.getPartialModelSpecificationAccess().getEntryPartialModelEntryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalApplicationConfiguration.g:1079:3: (otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalApplicationConfiguration.g:1080:4: otherlv_2= ',' ( (lv_entry_3_0= rulePartialModelEntry ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getPartialModelSpecificationAccess().getCommaKeyword_2_0());
                    			
                    // InternalApplicationConfiguration.g:1084:4: ( (lv_entry_3_0= rulePartialModelEntry ) )
                    // InternalApplicationConfiguration.g:1085:5: (lv_entry_3_0= rulePartialModelEntry )
                    {
                    // InternalApplicationConfiguration.g:1085:5: (lv_entry_3_0= rulePartialModelEntry )
                    // InternalApplicationConfiguration.g:1086:6: lv_entry_3_0= rulePartialModelEntry
                    {

                    						newCompositeNode(grammarAccess.getPartialModelSpecificationAccess().getEntryPartialModelEntryParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_19);
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

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1112:1: entryRulePartialModelEntry returns [EObject current=null] : iv_rulePartialModelEntry= rulePartialModelEntry EOF ;
    public final EObject entryRulePartialModelEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialModelEntry = null;


        try {
            // InternalApplicationConfiguration.g:1112:58: (iv_rulePartialModelEntry= rulePartialModelEntry EOF )
            // InternalApplicationConfiguration.g:1113:2: iv_rulePartialModelEntry= rulePartialModelEntry EOF
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
    // InternalApplicationConfiguration.g:1119:1: rulePartialModelEntry returns [EObject current=null] : (this_ModelEntry_0= ruleModelEntry | this_FolderEntry_1= ruleFolderEntry ) ;
    public final EObject rulePartialModelEntry() throws RecognitionException {
        EObject current = null;

        EObject this_ModelEntry_0 = null;

        EObject this_FolderEntry_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1125:2: ( (this_ModelEntry_0= ruleModelEntry | this_FolderEntry_1= ruleFolderEntry ) )
            // InternalApplicationConfiguration.g:1126:2: (this_ModelEntry_0= ruleModelEntry | this_FolderEntry_1= ruleFolderEntry )
            {
            // InternalApplicationConfiguration.g:1126:2: (this_ModelEntry_0= ruleModelEntry | this_FolderEntry_1= ruleFolderEntry )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==25) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalApplicationConfiguration.g:1127:3: this_ModelEntry_0= ruleModelEntry
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
                    // InternalApplicationConfiguration.g:1136:3: this_FolderEntry_1= ruleFolderEntry
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
    // InternalApplicationConfiguration.g:1148:1: entryRuleModelEntry returns [EObject current=null] : iv_ruleModelEntry= ruleModelEntry EOF ;
    public final EObject entryRuleModelEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelEntry = null;


        try {
            // InternalApplicationConfiguration.g:1148:51: (iv_ruleModelEntry= ruleModelEntry EOF )
            // InternalApplicationConfiguration.g:1149:2: iv_ruleModelEntry= ruleModelEntry EOF
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
    // InternalApplicationConfiguration.g:1155:1: ruleModelEntry returns [EObject current=null] : ( (lv_path_0_0= ruleFile ) ) ;
    public final EObject ruleModelEntry() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1161:2: ( ( (lv_path_0_0= ruleFile ) ) )
            // InternalApplicationConfiguration.g:1162:2: ( (lv_path_0_0= ruleFile ) )
            {
            // InternalApplicationConfiguration.g:1162:2: ( (lv_path_0_0= ruleFile ) )
            // InternalApplicationConfiguration.g:1163:3: (lv_path_0_0= ruleFile )
            {
            // InternalApplicationConfiguration.g:1163:3: (lv_path_0_0= ruleFile )
            // InternalApplicationConfiguration.g:1164:4: lv_path_0_0= ruleFile
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
    // InternalApplicationConfiguration.g:1184:1: entryRuleFolderEntry returns [EObject current=null] : iv_ruleFolderEntry= ruleFolderEntry EOF ;
    public final EObject entryRuleFolderEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFolderEntry = null;


        try {
            // InternalApplicationConfiguration.g:1184:52: (iv_ruleFolderEntry= ruleFolderEntry EOF )
            // InternalApplicationConfiguration.g:1185:2: iv_ruleFolderEntry= ruleFolderEntry EOF
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
    // InternalApplicationConfiguration.g:1191:1: ruleFolderEntry returns [EObject current=null] : (otherlv_0= 'folder' ( (lv_path_1_0= ruleFile ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )? ) ;
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
            // InternalApplicationConfiguration.g:1197:2: ( (otherlv_0= 'folder' ( (lv_path_1_0= ruleFile ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )? ) )
            // InternalApplicationConfiguration.g:1198:2: (otherlv_0= 'folder' ( (lv_path_1_0= ruleFile ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )? )
            {
            // InternalApplicationConfiguration.g:1198:2: (otherlv_0= 'folder' ( (lv_path_1_0= ruleFile ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )? )
            // InternalApplicationConfiguration.g:1199:3: otherlv_0= 'folder' ( (lv_path_1_0= ruleFile ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getFolderEntryAccess().getFolderKeyword_0());
            		
            // InternalApplicationConfiguration.g:1203:3: ( (lv_path_1_0= ruleFile ) )
            // InternalApplicationConfiguration.g:1204:4: (lv_path_1_0= ruleFile )
            {
            // InternalApplicationConfiguration.g:1204:4: (lv_path_1_0= ruleFile )
            // InternalApplicationConfiguration.g:1205:5: lv_path_1_0= ruleFile
            {

            					newCompositeNode(grammarAccess.getFolderEntryAccess().getPathFileParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalApplicationConfiguration.g:1222:3: (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalApplicationConfiguration.g:1223:4: otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusion_4_0= ruleModelEntry ) ) (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getFolderEntryAccess().getExcludingKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,18,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getFolderEntryAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalApplicationConfiguration.g:1231:4: ( (lv_exclusion_4_0= ruleModelEntry ) )
                    // InternalApplicationConfiguration.g:1232:5: (lv_exclusion_4_0= ruleModelEntry )
                    {
                    // InternalApplicationConfiguration.g:1232:5: (lv_exclusion_4_0= ruleModelEntry )
                    // InternalApplicationConfiguration.g:1233:6: lv_exclusion_4_0= ruleModelEntry
                    {

                    						newCompositeNode(grammarAccess.getFolderEntryAccess().getExclusionModelEntryParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalApplicationConfiguration.g:1250:4: (otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==19) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:1251:5: otherlv_5= ',' ( (lv_exclusion_6_0= ruleModelEntry ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_20); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFolderEntryAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalApplicationConfiguration.g:1255:5: ( (lv_exclusion_6_0= ruleModelEntry ) )
                    	    // InternalApplicationConfiguration.g:1256:6: (lv_exclusion_6_0= ruleModelEntry )
                    	    {
                    	    // InternalApplicationConfiguration.g:1256:6: (lv_exclusion_6_0= ruleModelEntry )
                    	    // InternalApplicationConfiguration.g:1257:7: lv_exclusion_6_0= ruleModelEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getFolderEntryAccess().getExclusionModelEntryParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1284:1: entryRulePartialModelDeclaration returns [EObject current=null] : iv_rulePartialModelDeclaration= rulePartialModelDeclaration EOF ;
    public final EObject entryRulePartialModelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialModelDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:1284:64: (iv_rulePartialModelDeclaration= rulePartialModelDeclaration EOF )
            // InternalApplicationConfiguration.g:1285:2: iv_rulePartialModelDeclaration= rulePartialModelDeclaration EOF
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
    // InternalApplicationConfiguration.g:1291:1: rulePartialModelDeclaration returns [EObject current=null] : (otherlv_0= 'models' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePartialModelSpecification ) ) ) ;
    public final EObject rulePartialModelDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_specification_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1297:2: ( (otherlv_0= 'models' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePartialModelSpecification ) ) ) )
            // InternalApplicationConfiguration.g:1298:2: (otherlv_0= 'models' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePartialModelSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:1298:2: (otherlv_0= 'models' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePartialModelSpecification ) ) )
            // InternalApplicationConfiguration.g:1299:3: otherlv_0= 'models' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePartialModelSpecification ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPartialModelDeclarationAccess().getModelsKeyword_0());
            		
            // InternalApplicationConfiguration.g:1303:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:1304:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1304:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:1305:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            // InternalApplicationConfiguration.g:1321:3: ( (lv_specification_2_0= rulePartialModelSpecification ) )
            // InternalApplicationConfiguration.g:1322:4: (lv_specification_2_0= rulePartialModelSpecification )
            {
            // InternalApplicationConfiguration.g:1322:4: (lv_specification_2_0= rulePartialModelSpecification )
            // InternalApplicationConfiguration.g:1323:5: lv_specification_2_0= rulePartialModelSpecification
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
    // InternalApplicationConfiguration.g:1344:1: entryRulePartialModelReference returns [EObject current=null] : iv_rulePartialModelReference= rulePartialModelReference EOF ;
    public final EObject entryRulePartialModelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialModelReference = null;


        try {
            // InternalApplicationConfiguration.g:1344:62: (iv_rulePartialModelReference= rulePartialModelReference EOF )
            // InternalApplicationConfiguration.g:1345:2: iv_rulePartialModelReference= rulePartialModelReference EOF
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
    // InternalApplicationConfiguration.g:1351:1: rulePartialModelReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulePartialModelReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1357:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:1358:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:1358:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:1359:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1359:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:1360:4: otherlv_0= RULE_ID
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
    // InternalApplicationConfiguration.g:1374:1: entryRulePartialModel returns [EObject current=null] : iv_rulePartialModel= rulePartialModel EOF ;
    public final EObject entryRulePartialModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialModel = null;


        try {
            // InternalApplicationConfiguration.g:1374:53: (iv_rulePartialModel= rulePartialModel EOF )
            // InternalApplicationConfiguration.g:1375:2: iv_rulePartialModel= rulePartialModel EOF
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
    // InternalApplicationConfiguration.g:1381:1: rulePartialModel returns [EObject current=null] : (this_PartialModelSpecification_0= rulePartialModelSpecification | this_PartialModelReference_1= rulePartialModelReference ) ;
    public final EObject rulePartialModel() throws RecognitionException {
        EObject current = null;

        EObject this_PartialModelSpecification_0 = null;

        EObject this_PartialModelReference_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1387:2: ( (this_PartialModelSpecification_0= rulePartialModelSpecification | this_PartialModelReference_1= rulePartialModelReference ) )
            // InternalApplicationConfiguration.g:1388:2: (this_PartialModelSpecification_0= rulePartialModelSpecification | this_PartialModelReference_1= rulePartialModelReference )
            {
            // InternalApplicationConfiguration.g:1388:2: (this_PartialModelSpecification_0= rulePartialModelSpecification | this_PartialModelReference_1= rulePartialModelReference )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalApplicationConfiguration.g:1389:3: this_PartialModelSpecification_0= rulePartialModelSpecification
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
                    // InternalApplicationConfiguration.g:1398:3: this_PartialModelReference_1= rulePartialModelReference
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
    // InternalApplicationConfiguration.g:1410:1: entryRulePatternSpecification returns [EObject current=null] : iv_rulePatternSpecification= rulePatternSpecification EOF ;
    public final EObject entryRulePatternSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternSpecification = null;


        try {
            // InternalApplicationConfiguration.g:1410:61: (iv_rulePatternSpecification= rulePatternSpecification EOF )
            // InternalApplicationConfiguration.g:1411:2: iv_rulePatternSpecification= rulePatternSpecification EOF
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
    // InternalApplicationConfiguration.g:1417:1: rulePatternSpecification returns [EObject current=null] : (otherlv_0= '{' ( (lv_entries_1_0= rulePatternEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )* otherlv_4= '}' ) ;
    public final EObject rulePatternSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1423:2: ( (otherlv_0= '{' ( (lv_entries_1_0= rulePatternEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )* otherlv_4= '}' ) )
            // InternalApplicationConfiguration.g:1424:2: (otherlv_0= '{' ( (lv_entries_1_0= rulePatternEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )* otherlv_4= '}' )
            {
            // InternalApplicationConfiguration.g:1424:2: (otherlv_0= '{' ( (lv_entries_1_0= rulePatternEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )* otherlv_4= '}' )
            // InternalApplicationConfiguration.g:1425:3: otherlv_0= '{' ( (lv_entries_1_0= rulePatternEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternSpecificationAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalApplicationConfiguration.g:1429:3: ( (lv_entries_1_0= rulePatternEntry ) )
            // InternalApplicationConfiguration.g:1430:4: (lv_entries_1_0= rulePatternEntry )
            {
            // InternalApplicationConfiguration.g:1430:4: (lv_entries_1_0= rulePatternEntry )
            // InternalApplicationConfiguration.g:1431:5: lv_entries_1_0= rulePatternEntry
            {

            					newCompositeNode(grammarAccess.getPatternSpecificationAccess().getEntriesPatternEntryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalApplicationConfiguration.g:1448:3: (otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:1449:4: otherlv_2= ',' ( (lv_entries_3_0= rulePatternEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPatternSpecificationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalApplicationConfiguration.g:1453:4: ( (lv_entries_3_0= rulePatternEntry ) )
            	    // InternalApplicationConfiguration.g:1454:5: (lv_entries_3_0= rulePatternEntry )
            	    {
            	    // InternalApplicationConfiguration.g:1454:5: (lv_entries_3_0= rulePatternEntry )
            	    // InternalApplicationConfiguration.g:1455:6: lv_entries_3_0= rulePatternEntry
            	    {

            	    						newCompositeNode(grammarAccess.getPatternSpecificationAccess().getEntriesPatternEntryParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
            	    break loop22;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1481:1: entryRulePatternEntry returns [EObject current=null] : iv_rulePatternEntry= rulePatternEntry EOF ;
    public final EObject entryRulePatternEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternEntry = null;


        try {
            // InternalApplicationConfiguration.g:1481:53: (iv_rulePatternEntry= rulePatternEntry EOF )
            // InternalApplicationConfiguration.g:1482:2: iv_rulePatternEntry= rulePatternEntry EOF
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
    // InternalApplicationConfiguration.g:1488:1: rulePatternEntry returns [EObject current=null] : (this_PatternElement_0= rulePatternElement | this_AllPatternEntry_1= ruleAllPatternEntry ) ;
    public final EObject rulePatternEntry() throws RecognitionException {
        EObject current = null;

        EObject this_PatternElement_0 = null;

        EObject this_AllPatternEntry_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1494:2: ( (this_PatternElement_0= rulePatternElement | this_AllPatternEntry_1= ruleAllPatternEntry ) )
            // InternalApplicationConfiguration.g:1495:2: (this_PatternElement_0= rulePatternElement | this_AllPatternEntry_1= ruleAllPatternEntry )
            {
            // InternalApplicationConfiguration.g:1495:2: (this_PatternElement_0= rulePatternElement | this_AllPatternEntry_1= ruleAllPatternEntry )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==21) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalApplicationConfiguration.g:1496:3: this_PatternElement_0= rulePatternElement
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
                    // InternalApplicationConfiguration.g:1505:3: this_AllPatternEntry_1= ruleAllPatternEntry
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
    // InternalApplicationConfiguration.g:1517:1: entryRuleAllPatternEntry returns [EObject current=null] : iv_ruleAllPatternEntry= ruleAllPatternEntry EOF ;
    public final EObject entryRuleAllPatternEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllPatternEntry = null;


        try {
            // InternalApplicationConfiguration.g:1517:56: (iv_ruleAllPatternEntry= ruleAllPatternEntry EOF )
            // InternalApplicationConfiguration.g:1518:2: iv_ruleAllPatternEntry= ruleAllPatternEntry EOF
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
    // InternalApplicationConfiguration.g:1524:1: ruleAllPatternEntry returns [EObject current=null] : (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )? ) ;
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
            // InternalApplicationConfiguration.g:1530:2: ( (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )? ) )
            // InternalApplicationConfiguration.g:1531:2: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )? )
            {
            // InternalApplicationConfiguration.g:1531:2: (otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )? )
            // InternalApplicationConfiguration.g:1532:3: otherlv_0= 'package' ( ( ruleQualifiedName ) ) (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAllPatternEntryAccess().getPackageKeyword_0());
            		
            // InternalApplicationConfiguration.g:1536:3: ( ( ruleQualifiedName ) )
            // InternalApplicationConfiguration.g:1537:4: ( ruleQualifiedName )
            {
            // InternalApplicationConfiguration.g:1537:4: ( ruleQualifiedName )
            // InternalApplicationConfiguration.g:1538:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllPatternEntryRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllPatternEntryAccess().getPackagePatternModelCrossReference_1_0());
            				
            pushFollow(FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApplicationConfiguration.g:1552:3: (otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalApplicationConfiguration.g:1553:4: otherlv_2= 'excluding' otherlv_3= '{' ( (lv_exclusuion_4_0= rulePatternElement ) ) (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getAllPatternEntryAccess().getExcludingKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllPatternEntryAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalApplicationConfiguration.g:1561:4: ( (lv_exclusuion_4_0= rulePatternElement ) )
                    // InternalApplicationConfiguration.g:1562:5: (lv_exclusuion_4_0= rulePatternElement )
                    {
                    // InternalApplicationConfiguration.g:1562:5: (lv_exclusuion_4_0= rulePatternElement )
                    // InternalApplicationConfiguration.g:1563:6: lv_exclusuion_4_0= rulePatternElement
                    {

                    						newCompositeNode(grammarAccess.getAllPatternEntryAccess().getExclusuionPatternElementParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalApplicationConfiguration.g:1580:4: (otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==19) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:1581:5: otherlv_5= ',' ( (lv_exclusuion_6_0= rulePatternElement ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAllPatternEntryAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalApplicationConfiguration.g:1585:5: ( (lv_exclusuion_6_0= rulePatternElement ) )
                    	    // InternalApplicationConfiguration.g:1586:6: (lv_exclusuion_6_0= rulePatternElement )
                    	    {
                    	    // InternalApplicationConfiguration.g:1586:6: (lv_exclusuion_6_0= rulePatternElement )
                    	    // InternalApplicationConfiguration.g:1587:7: lv_exclusuion_6_0= rulePatternElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getAllPatternEntryAccess().getExclusuionPatternElementParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:1614:1: entryRulePatternElement returns [EObject current=null] : iv_rulePatternElement= rulePatternElement EOF ;
    public final EObject entryRulePatternElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternElement = null;


        try {
            // InternalApplicationConfiguration.g:1614:55: (iv_rulePatternElement= rulePatternElement EOF )
            // InternalApplicationConfiguration.g:1615:2: iv_rulePatternElement= rulePatternElement EOF
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
    // InternalApplicationConfiguration.g:1621:1: rulePatternElement returns [EObject current=null] : ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject rulePatternElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1627:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) )
            // InternalApplicationConfiguration.g:1628:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalApplicationConfiguration.g:1628:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:1629:3: ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:1629:3: ( ( ( ruleQualifiedName ) ) otherlv_1= '::' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==11||LA26_1==23) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalApplicationConfiguration.g:1630:4: ( ( ruleQualifiedName ) ) otherlv_1= '::'
                    {
                    // InternalApplicationConfiguration.g:1630:4: ( ( ruleQualifiedName ) )
                    // InternalApplicationConfiguration.g:1631:5: ( ruleQualifiedName )
                    {
                    // InternalApplicationConfiguration.g:1631:5: ( ruleQualifiedName )
                    // InternalApplicationConfiguration.g:1632:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPatternElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPatternElementAccess().getPackagePatternModelCrossReference_0_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getPatternElementAccess().getColonColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalApplicationConfiguration.g:1651:3: ( (otherlv_2= RULE_ID ) )
            // InternalApplicationConfiguration.g:1652:4: (otherlv_2= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1652:4: (otherlv_2= RULE_ID )
            // InternalApplicationConfiguration.g:1653:5: otherlv_2= RULE_ID
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
    // InternalApplicationConfiguration.g:1668:1: entryRuleGraphPatternDeclaration returns [EObject current=null] : iv_ruleGraphPatternDeclaration= ruleGraphPatternDeclaration EOF ;
    public final EObject entryRuleGraphPatternDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphPatternDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:1668:64: (iv_ruleGraphPatternDeclaration= ruleGraphPatternDeclaration EOF )
            // InternalApplicationConfiguration.g:1669:2: iv_ruleGraphPatternDeclaration= ruleGraphPatternDeclaration EOF
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
    // InternalApplicationConfiguration.g:1675:1: ruleGraphPatternDeclaration returns [EObject current=null] : (otherlv_0= 'constraints' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePatternSpecification ) ) ) ;
    public final EObject ruleGraphPatternDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_specification_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1681:2: ( (otherlv_0= 'constraints' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePatternSpecification ) ) ) )
            // InternalApplicationConfiguration.g:1682:2: (otherlv_0= 'constraints' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePatternSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:1682:2: (otherlv_0= 'constraints' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePatternSpecification ) ) )
            // InternalApplicationConfiguration.g:1683:3: otherlv_0= 'constraints' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= rulePatternSpecification ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphPatternDeclarationAccess().getConstraintsKeyword_0());
            		
            // InternalApplicationConfiguration.g:1687:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:1688:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1688:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:1689:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            // InternalApplicationConfiguration.g:1705:3: ( (lv_specification_2_0= rulePatternSpecification ) )
            // InternalApplicationConfiguration.g:1706:4: (lv_specification_2_0= rulePatternSpecification )
            {
            // InternalApplicationConfiguration.g:1706:4: (lv_specification_2_0= rulePatternSpecification )
            // InternalApplicationConfiguration.g:1707:5: lv_specification_2_0= rulePatternSpecification
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
    // InternalApplicationConfiguration.g:1728:1: entryRuleGraphPatternReference returns [EObject current=null] : iv_ruleGraphPatternReference= ruleGraphPatternReference EOF ;
    public final EObject entryRuleGraphPatternReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphPatternReference = null;


        try {
            // InternalApplicationConfiguration.g:1728:62: (iv_ruleGraphPatternReference= ruleGraphPatternReference EOF )
            // InternalApplicationConfiguration.g:1729:2: iv_ruleGraphPatternReference= ruleGraphPatternReference EOF
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
    // InternalApplicationConfiguration.g:1735:1: ruleGraphPatternReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleGraphPatternReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1741:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:1742:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:1742:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:1743:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:1743:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:1744:4: otherlv_0= RULE_ID
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
    // InternalApplicationConfiguration.g:1758:1: entryRuleGraphPattern returns [EObject current=null] : iv_ruleGraphPattern= ruleGraphPattern EOF ;
    public final EObject entryRuleGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphPattern = null;


        try {
            // InternalApplicationConfiguration.g:1758:53: (iv_ruleGraphPattern= ruleGraphPattern EOF )
            // InternalApplicationConfiguration.g:1759:2: iv_ruleGraphPattern= ruleGraphPattern EOF
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
    // InternalApplicationConfiguration.g:1765:1: ruleGraphPattern returns [EObject current=null] : (this_GraphPatternReference_0= ruleGraphPatternReference | this_PatternSpecification_1= rulePatternSpecification ) ;
    public final EObject ruleGraphPattern() throws RecognitionException {
        EObject current = null;

        EObject this_GraphPatternReference_0 = null;

        EObject this_PatternSpecification_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1771:2: ( (this_GraphPatternReference_0= ruleGraphPatternReference | this_PatternSpecification_1= rulePatternSpecification ) )
            // InternalApplicationConfiguration.g:1772:2: (this_GraphPatternReference_0= ruleGraphPatternReference | this_PatternSpecification_1= rulePatternSpecification )
            {
            // InternalApplicationConfiguration.g:1772:2: (this_GraphPatternReference_0= ruleGraphPatternReference | this_PatternSpecification_1= rulePatternSpecification )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==18) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalApplicationConfiguration.g:1773:3: this_GraphPatternReference_0= ruleGraphPatternReference
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
                    // InternalApplicationConfiguration.g:1782:3: this_PatternSpecification_1= rulePatternSpecification
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


    // $ANTLR start "entryRuleObjectiveSpecification"
    // InternalApplicationConfiguration.g:1794:1: entryRuleObjectiveSpecification returns [EObject current=null] : iv_ruleObjectiveSpecification= ruleObjectiveSpecification EOF ;
    public final EObject entryRuleObjectiveSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectiveSpecification = null;


        try {
            // InternalApplicationConfiguration.g:1794:63: (iv_ruleObjectiveSpecification= ruleObjectiveSpecification EOF )
            // InternalApplicationConfiguration.g:1795:2: iv_ruleObjectiveSpecification= ruleObjectiveSpecification EOF
            {
             newCompositeNode(grammarAccess.getObjectiveSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectiveSpecification=ruleObjectiveSpecification();

            state._fsp--;

             current =iv_ruleObjectiveSpecification; 
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
    // $ANTLR end "entryRuleObjectiveSpecification"


    // $ANTLR start "ruleObjectiveSpecification"
    // InternalApplicationConfiguration.g:1801:1: ruleObjectiveSpecification returns [EObject current=null] : (otherlv_0= '{' ( (lv_entries_1_0= ruleObjectiveEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleObjectiveEntry ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleObjectiveSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1807:2: ( (otherlv_0= '{' ( (lv_entries_1_0= ruleObjectiveEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleObjectiveEntry ) ) )* otherlv_4= '}' ) )
            // InternalApplicationConfiguration.g:1808:2: (otherlv_0= '{' ( (lv_entries_1_0= ruleObjectiveEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleObjectiveEntry ) ) )* otherlv_4= '}' )
            {
            // InternalApplicationConfiguration.g:1808:2: (otherlv_0= '{' ( (lv_entries_1_0= ruleObjectiveEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleObjectiveEntry ) ) )* otherlv_4= '}' )
            // InternalApplicationConfiguration.g:1809:3: otherlv_0= '{' ( (lv_entries_1_0= ruleObjectiveEntry ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleObjectiveEntry ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectiveSpecificationAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalApplicationConfiguration.g:1813:3: ( (lv_entries_1_0= ruleObjectiveEntry ) )
            // InternalApplicationConfiguration.g:1814:4: (lv_entries_1_0= ruleObjectiveEntry )
            {
            // InternalApplicationConfiguration.g:1814:4: (lv_entries_1_0= ruleObjectiveEntry )
            // InternalApplicationConfiguration.g:1815:5: lv_entries_1_0= ruleObjectiveEntry
            {

            					newCompositeNode(grammarAccess.getObjectiveSpecificationAccess().getEntriesObjectiveEntryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_entries_1_0=ruleObjectiveEntry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectiveSpecificationRule());
            					}
            					add(
            						current,
            						"entries",
            						lv_entries_1_0,
            						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ObjectiveEntry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApplicationConfiguration.g:1832:3: (otherlv_2= ',' ( (lv_entries_3_0= ruleObjectiveEntry ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==19) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:1833:4: otherlv_2= ',' ( (lv_entries_3_0= ruleObjectiveEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getObjectiveSpecificationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalApplicationConfiguration.g:1837:4: ( (lv_entries_3_0= ruleObjectiveEntry ) )
            	    // InternalApplicationConfiguration.g:1838:5: (lv_entries_3_0= ruleObjectiveEntry )
            	    {
            	    // InternalApplicationConfiguration.g:1838:5: (lv_entries_3_0= ruleObjectiveEntry )
            	    // InternalApplicationConfiguration.g:1839:6: lv_entries_3_0= ruleObjectiveEntry
            	    {

            	    						newCompositeNode(grammarAccess.getObjectiveSpecificationAccess().getEntriesObjectiveEntryParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_entries_3_0=ruleObjectiveEntry();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getObjectiveSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entries",
            	    							lv_entries_3_0,
            	    							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ObjectiveEntry");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getObjectiveSpecificationAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleObjectiveSpecification"


    // $ANTLR start "entryRuleObjectiveEntry"
    // InternalApplicationConfiguration.g:1865:1: entryRuleObjectiveEntry returns [EObject current=null] : iv_ruleObjectiveEntry= ruleObjectiveEntry EOF ;
    public final EObject entryRuleObjectiveEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectiveEntry = null;


        try {
            // InternalApplicationConfiguration.g:1865:55: (iv_ruleObjectiveEntry= ruleObjectiveEntry EOF )
            // InternalApplicationConfiguration.g:1866:2: iv_ruleObjectiveEntry= ruleObjectiveEntry EOF
            {
             newCompositeNode(grammarAccess.getObjectiveEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectiveEntry=ruleObjectiveEntry();

            state._fsp--;

             current =iv_ruleObjectiveEntry; 
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
    // $ANTLR end "entryRuleObjectiveEntry"


    // $ANTLR start "ruleObjectiveEntry"
    // InternalApplicationConfiguration.g:1872:1: ruleObjectiveEntry returns [EObject current=null] : (this_OptimizationEntry_0= ruleOptimizationEntry | this_ThresholdEntry_1= ruleThresholdEntry ) ;
    public final EObject ruleObjectiveEntry() throws RecognitionException {
        EObject current = null;

        EObject this_OptimizationEntry_0 = null;

        EObject this_ThresholdEntry_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1878:2: ( (this_OptimizationEntry_0= ruleOptimizationEntry | this_ThresholdEntry_1= ruleThresholdEntry ) )
            // InternalApplicationConfiguration.g:1879:2: (this_OptimizationEntry_0= ruleOptimizationEntry | this_ThresholdEntry_1= ruleThresholdEntry )
            {
            // InternalApplicationConfiguration.g:1879:2: (this_OptimizationEntry_0= ruleOptimizationEntry | this_ThresholdEntry_1= ruleThresholdEntry )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=54 && LA29_0<=55)) ) {
                alt29=1;
            }
            else if ( (LA29_0==28) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalApplicationConfiguration.g:1880:3: this_OptimizationEntry_0= ruleOptimizationEntry
                    {

                    			newCompositeNode(grammarAccess.getObjectiveEntryAccess().getOptimizationEntryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OptimizationEntry_0=ruleOptimizationEntry();

                    state._fsp--;


                    			current = this_OptimizationEntry_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:1889:3: this_ThresholdEntry_1= ruleThresholdEntry
                    {

                    			newCompositeNode(grammarAccess.getObjectiveEntryAccess().getThresholdEntryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ThresholdEntry_1=ruleThresholdEntry();

                    state._fsp--;


                    			current = this_ThresholdEntry_1;
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
    // $ANTLR end "ruleObjectiveEntry"


    // $ANTLR start "entryRuleOptimizationEntry"
    // InternalApplicationConfiguration.g:1901:1: entryRuleOptimizationEntry returns [EObject current=null] : iv_ruleOptimizationEntry= ruleOptimizationEntry EOF ;
    public final EObject entryRuleOptimizationEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptimizationEntry = null;


        try {
            // InternalApplicationConfiguration.g:1901:58: (iv_ruleOptimizationEntry= ruleOptimizationEntry EOF )
            // InternalApplicationConfiguration.g:1902:2: iv_ruleOptimizationEntry= ruleOptimizationEntry EOF
            {
             newCompositeNode(grammarAccess.getOptimizationEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptimizationEntry=ruleOptimizationEntry();

            state._fsp--;

             current =iv_ruleOptimizationEntry; 
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
    // $ANTLR end "entryRuleOptimizationEntry"


    // $ANTLR start "ruleOptimizationEntry"
    // InternalApplicationConfiguration.g:1908:1: ruleOptimizationEntry returns [EObject current=null] : ( ( (lv_direction_0_0= ruleOptimizationDirection ) ) ( (lv_function_1_0= ruleObjectiveFunction ) ) ) ;
    public final EObject ruleOptimizationEntry() throws RecognitionException {
        EObject current = null;

        Enumerator lv_direction_0_0 = null;

        EObject lv_function_1_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1914:2: ( ( ( (lv_direction_0_0= ruleOptimizationDirection ) ) ( (lv_function_1_0= ruleObjectiveFunction ) ) ) )
            // InternalApplicationConfiguration.g:1915:2: ( ( (lv_direction_0_0= ruleOptimizationDirection ) ) ( (lv_function_1_0= ruleObjectiveFunction ) ) )
            {
            // InternalApplicationConfiguration.g:1915:2: ( ( (lv_direction_0_0= ruleOptimizationDirection ) ) ( (lv_function_1_0= ruleObjectiveFunction ) ) )
            // InternalApplicationConfiguration.g:1916:3: ( (lv_direction_0_0= ruleOptimizationDirection ) ) ( (lv_function_1_0= ruleObjectiveFunction ) )
            {
            // InternalApplicationConfiguration.g:1916:3: ( (lv_direction_0_0= ruleOptimizationDirection ) )
            // InternalApplicationConfiguration.g:1917:4: (lv_direction_0_0= ruleOptimizationDirection )
            {
            // InternalApplicationConfiguration.g:1917:4: (lv_direction_0_0= ruleOptimizationDirection )
            // InternalApplicationConfiguration.g:1918:5: lv_direction_0_0= ruleOptimizationDirection
            {

            					newCompositeNode(grammarAccess.getOptimizationEntryAccess().getDirectionOptimizationDirectionEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_direction_0_0=ruleOptimizationDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptimizationEntryRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_0_0,
            						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.OptimizationDirection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApplicationConfiguration.g:1935:3: ( (lv_function_1_0= ruleObjectiveFunction ) )
            // InternalApplicationConfiguration.g:1936:4: (lv_function_1_0= ruleObjectiveFunction )
            {
            // InternalApplicationConfiguration.g:1936:4: (lv_function_1_0= ruleObjectiveFunction )
            // InternalApplicationConfiguration.g:1937:5: lv_function_1_0= ruleObjectiveFunction
            {

            					newCompositeNode(grammarAccess.getOptimizationEntryAccess().getFunctionObjectiveFunctionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_function_1_0=ruleObjectiveFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptimizationEntryRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_1_0,
            						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ObjectiveFunction");
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
    // $ANTLR end "ruleOptimizationEntry"


    // $ANTLR start "entryRuleThresholdEntry"
    // InternalApplicationConfiguration.g:1958:1: entryRuleThresholdEntry returns [EObject current=null] : iv_ruleThresholdEntry= ruleThresholdEntry EOF ;
    public final EObject entryRuleThresholdEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThresholdEntry = null;


        try {
            // InternalApplicationConfiguration.g:1958:55: (iv_ruleThresholdEntry= ruleThresholdEntry EOF )
            // InternalApplicationConfiguration.g:1959:2: iv_ruleThresholdEntry= ruleThresholdEntry EOF
            {
             newCompositeNode(grammarAccess.getThresholdEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThresholdEntry=ruleThresholdEntry();

            state._fsp--;

             current =iv_ruleThresholdEntry; 
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
    // $ANTLR end "entryRuleThresholdEntry"


    // $ANTLR start "ruleThresholdEntry"
    // InternalApplicationConfiguration.g:1965:1: ruleThresholdEntry returns [EObject current=null] : ( ( (lv_function_0_0= ruleObjectiveFunction ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_threshold_2_0= ruleREALLiteral ) ) ) ;
    public final EObject ruleThresholdEntry() throws RecognitionException {
        EObject current = null;

        EObject lv_function_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_threshold_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:1971:2: ( ( ( (lv_function_0_0= ruleObjectiveFunction ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_threshold_2_0= ruleREALLiteral ) ) ) )
            // InternalApplicationConfiguration.g:1972:2: ( ( (lv_function_0_0= ruleObjectiveFunction ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_threshold_2_0= ruleREALLiteral ) ) )
            {
            // InternalApplicationConfiguration.g:1972:2: ( ( (lv_function_0_0= ruleObjectiveFunction ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_threshold_2_0= ruleREALLiteral ) ) )
            // InternalApplicationConfiguration.g:1973:3: ( (lv_function_0_0= ruleObjectiveFunction ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_threshold_2_0= ruleREALLiteral ) )
            {
            // InternalApplicationConfiguration.g:1973:3: ( (lv_function_0_0= ruleObjectiveFunction ) )
            // InternalApplicationConfiguration.g:1974:4: (lv_function_0_0= ruleObjectiveFunction )
            {
            // InternalApplicationConfiguration.g:1974:4: (lv_function_0_0= ruleObjectiveFunction )
            // InternalApplicationConfiguration.g:1975:5: lv_function_0_0= ruleObjectiveFunction
            {

            					newCompositeNode(grammarAccess.getThresholdEntryAccess().getFunctionObjectiveFunctionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_function_0_0=ruleObjectiveFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThresholdEntryRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_0_0,
            						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ObjectiveFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApplicationConfiguration.g:1992:3: ( (lv_operator_1_0= ruleComparisonOperator ) )
            // InternalApplicationConfiguration.g:1993:4: (lv_operator_1_0= ruleComparisonOperator )
            {
            // InternalApplicationConfiguration.g:1993:4: (lv_operator_1_0= ruleComparisonOperator )
            // InternalApplicationConfiguration.g:1994:5: lv_operator_1_0= ruleComparisonOperator
            {

            					newCompositeNode(grammarAccess.getThresholdEntryAccess().getOperatorComparisonOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_operator_1_0=ruleComparisonOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThresholdEntryRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ComparisonOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApplicationConfiguration.g:2011:3: ( (lv_threshold_2_0= ruleREALLiteral ) )
            // InternalApplicationConfiguration.g:2012:4: (lv_threshold_2_0= ruleREALLiteral )
            {
            // InternalApplicationConfiguration.g:2012:4: (lv_threshold_2_0= ruleREALLiteral )
            // InternalApplicationConfiguration.g:2013:5: lv_threshold_2_0= ruleREALLiteral
            {

            					newCompositeNode(grammarAccess.getThresholdEntryAccess().getThresholdREALLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_threshold_2_0=ruleREALLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThresholdEntryRule());
            					}
            					set(
            						current,
            						"threshold",
            						lv_threshold_2_0,
            						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.REALLiteral");
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
    // $ANTLR end "ruleThresholdEntry"


    // $ANTLR start "entryRuleObjectiveFunction"
    // InternalApplicationConfiguration.g:2034:1: entryRuleObjectiveFunction returns [EObject current=null] : iv_ruleObjectiveFunction= ruleObjectiveFunction EOF ;
    public final EObject entryRuleObjectiveFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectiveFunction = null;


        try {
            // InternalApplicationConfiguration.g:2034:58: (iv_ruleObjectiveFunction= ruleObjectiveFunction EOF )
            // InternalApplicationConfiguration.g:2035:2: iv_ruleObjectiveFunction= ruleObjectiveFunction EOF
            {
             newCompositeNode(grammarAccess.getObjectiveFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectiveFunction=ruleObjectiveFunction();

            state._fsp--;

             current =iv_ruleObjectiveFunction; 
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
    // $ANTLR end "entryRuleObjectiveFunction"


    // $ANTLR start "ruleObjectiveFunction"
    // InternalApplicationConfiguration.g:2041:1: ruleObjectiveFunction returns [EObject current=null] : this_CostObjectiveFunction_0= ruleCostObjectiveFunction ;
    public final EObject ruleObjectiveFunction() throws RecognitionException {
        EObject current = null;

        EObject this_CostObjectiveFunction_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2047:2: (this_CostObjectiveFunction_0= ruleCostObjectiveFunction )
            // InternalApplicationConfiguration.g:2048:2: this_CostObjectiveFunction_0= ruleCostObjectiveFunction
            {

            		newCompositeNode(grammarAccess.getObjectiveFunctionAccess().getCostObjectiveFunctionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CostObjectiveFunction_0=ruleCostObjectiveFunction();

            state._fsp--;


            		current = this_CostObjectiveFunction_0;
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
    // $ANTLR end "ruleObjectiveFunction"


    // $ANTLR start "entryRuleCostObjectiveFunction"
    // InternalApplicationConfiguration.g:2059:1: entryRuleCostObjectiveFunction returns [EObject current=null] : iv_ruleCostObjectiveFunction= ruleCostObjectiveFunction EOF ;
    public final EObject entryRuleCostObjectiveFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCostObjectiveFunction = null;


        try {
            // InternalApplicationConfiguration.g:2059:62: (iv_ruleCostObjectiveFunction= ruleCostObjectiveFunction EOF )
            // InternalApplicationConfiguration.g:2060:2: iv_ruleCostObjectiveFunction= ruleCostObjectiveFunction EOF
            {
             newCompositeNode(grammarAccess.getCostObjectiveFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCostObjectiveFunction=ruleCostObjectiveFunction();

            state._fsp--;

             current =iv_ruleCostObjectiveFunction; 
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
    // $ANTLR end "entryRuleCostObjectiveFunction"


    // $ANTLR start "ruleCostObjectiveFunction"
    // InternalApplicationConfiguration.g:2066:1: ruleCostObjectiveFunction returns [EObject current=null] : (otherlv_0= 'cost' otherlv_1= '{' ( (lv_entries_2_0= ruleCostEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleCostEntry ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleCostObjectiveFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_entries_2_0 = null;

        EObject lv_entries_4_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2072:2: ( (otherlv_0= 'cost' otherlv_1= '{' ( (lv_entries_2_0= ruleCostEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleCostEntry ) ) )* otherlv_5= '}' ) )
            // InternalApplicationConfiguration.g:2073:2: (otherlv_0= 'cost' otherlv_1= '{' ( (lv_entries_2_0= ruleCostEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleCostEntry ) ) )* otherlv_5= '}' )
            {
            // InternalApplicationConfiguration.g:2073:2: (otherlv_0= 'cost' otherlv_1= '{' ( (lv_entries_2_0= ruleCostEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleCostEntry ) ) )* otherlv_5= '}' )
            // InternalApplicationConfiguration.g:2074:3: otherlv_0= 'cost' otherlv_1= '{' ( (lv_entries_2_0= ruleCostEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleCostEntry ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCostObjectiveFunctionAccess().getCostKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCostObjectiveFunctionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalApplicationConfiguration.g:2082:3: ( (lv_entries_2_0= ruleCostEntry ) )
            // InternalApplicationConfiguration.g:2083:4: (lv_entries_2_0= ruleCostEntry )
            {
            // InternalApplicationConfiguration.g:2083:4: (lv_entries_2_0= ruleCostEntry )
            // InternalApplicationConfiguration.g:2084:5: lv_entries_2_0= ruleCostEntry
            {

            					newCompositeNode(grammarAccess.getCostObjectiveFunctionAccess().getEntriesCostEntryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_entries_2_0=ruleCostEntry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCostObjectiveFunctionRule());
            					}
            					add(
            						current,
            						"entries",
            						lv_entries_2_0,
            						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.CostEntry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApplicationConfiguration.g:2101:3: (otherlv_3= ',' ( (lv_entries_4_0= ruleCostEntry ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==19) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:2102:4: otherlv_3= ',' ( (lv_entries_4_0= ruleCostEntry ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCostObjectiveFunctionAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalApplicationConfiguration.g:2106:4: ( (lv_entries_4_0= ruleCostEntry ) )
            	    // InternalApplicationConfiguration.g:2107:5: (lv_entries_4_0= ruleCostEntry )
            	    {
            	    // InternalApplicationConfiguration.g:2107:5: (lv_entries_4_0= ruleCostEntry )
            	    // InternalApplicationConfiguration.g:2108:6: lv_entries_4_0= ruleCostEntry
            	    {

            	    						newCompositeNode(grammarAccess.getCostObjectiveFunctionAccess().getEntriesCostEntryParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_entries_4_0=ruleCostEntry();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCostObjectiveFunctionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entries",
            	    							lv_entries_4_0,
            	    							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.CostEntry");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCostObjectiveFunctionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCostObjectiveFunction"


    // $ANTLR start "entryRuleCostEntry"
    // InternalApplicationConfiguration.g:2134:1: entryRuleCostEntry returns [EObject current=null] : iv_ruleCostEntry= ruleCostEntry EOF ;
    public final EObject entryRuleCostEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCostEntry = null;


        try {
            // InternalApplicationConfiguration.g:2134:50: (iv_ruleCostEntry= ruleCostEntry EOF )
            // InternalApplicationConfiguration.g:2135:2: iv_ruleCostEntry= ruleCostEntry EOF
            {
             newCompositeNode(grammarAccess.getCostEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCostEntry=ruleCostEntry();

            state._fsp--;

             current =iv_ruleCostEntry; 
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
    // $ANTLR end "entryRuleCostEntry"


    // $ANTLR start "ruleCostEntry"
    // InternalApplicationConfiguration.g:2141:1: ruleCostEntry returns [EObject current=null] : ( ( (lv_patternElement_0_0= rulePatternElement ) ) otherlv_1= '=' ( (lv_weight_2_0= ruleINTLiteral ) ) ) ;
    public final EObject ruleCostEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_patternElement_0_0 = null;

        AntlrDatatypeRuleToken lv_weight_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2147:2: ( ( ( (lv_patternElement_0_0= rulePatternElement ) ) otherlv_1= '=' ( (lv_weight_2_0= ruleINTLiteral ) ) ) )
            // InternalApplicationConfiguration.g:2148:2: ( ( (lv_patternElement_0_0= rulePatternElement ) ) otherlv_1= '=' ( (lv_weight_2_0= ruleINTLiteral ) ) )
            {
            // InternalApplicationConfiguration.g:2148:2: ( ( (lv_patternElement_0_0= rulePatternElement ) ) otherlv_1= '=' ( (lv_weight_2_0= ruleINTLiteral ) ) )
            // InternalApplicationConfiguration.g:2149:3: ( (lv_patternElement_0_0= rulePatternElement ) ) otherlv_1= '=' ( (lv_weight_2_0= ruleINTLiteral ) )
            {
            // InternalApplicationConfiguration.g:2149:3: ( (lv_patternElement_0_0= rulePatternElement ) )
            // InternalApplicationConfiguration.g:2150:4: (lv_patternElement_0_0= rulePatternElement )
            {
            // InternalApplicationConfiguration.g:2150:4: (lv_patternElement_0_0= rulePatternElement )
            // InternalApplicationConfiguration.g:2151:5: lv_patternElement_0_0= rulePatternElement
            {

            					newCompositeNode(grammarAccess.getCostEntryAccess().getPatternElementPatternElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_patternElement_0_0=rulePatternElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCostEntryRule());
            					}
            					set(
            						current,
            						"patternElement",
            						lv_patternElement_0_0,
            						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.PatternElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getCostEntryAccess().getEqualsSignKeyword_1());
            		
            // InternalApplicationConfiguration.g:2172:3: ( (lv_weight_2_0= ruleINTLiteral ) )
            // InternalApplicationConfiguration.g:2173:4: (lv_weight_2_0= ruleINTLiteral )
            {
            // InternalApplicationConfiguration.g:2173:4: (lv_weight_2_0= ruleINTLiteral )
            // InternalApplicationConfiguration.g:2174:5: lv_weight_2_0= ruleINTLiteral
            {

            					newCompositeNode(grammarAccess.getCostEntryAccess().getWeightINTLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_weight_2_0=ruleINTLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCostEntryRule());
            					}
            					set(
            						current,
            						"weight",
            						lv_weight_2_0,
            						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.INTLiteral");
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
    // $ANTLR end "ruleCostEntry"


    // $ANTLR start "entryRuleObjectiveDeclaration"
    // InternalApplicationConfiguration.g:2195:1: entryRuleObjectiveDeclaration returns [EObject current=null] : iv_ruleObjectiveDeclaration= ruleObjectiveDeclaration EOF ;
    public final EObject entryRuleObjectiveDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectiveDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:2195:61: (iv_ruleObjectiveDeclaration= ruleObjectiveDeclaration EOF )
            // InternalApplicationConfiguration.g:2196:2: iv_ruleObjectiveDeclaration= ruleObjectiveDeclaration EOF
            {
             newCompositeNode(grammarAccess.getObjectiveDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectiveDeclaration=ruleObjectiveDeclaration();

            state._fsp--;

             current =iv_ruleObjectiveDeclaration; 
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
    // $ANTLR end "entryRuleObjectiveDeclaration"


    // $ANTLR start "ruleObjectiveDeclaration"
    // InternalApplicationConfiguration.g:2202:1: ruleObjectiveDeclaration returns [EObject current=null] : (otherlv_0= 'objectives' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleObjectiveSpecification ) ) ) ;
    public final EObject ruleObjectiveDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_specification_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2208:2: ( (otherlv_0= 'objectives' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleObjectiveSpecification ) ) ) )
            // InternalApplicationConfiguration.g:2209:2: (otherlv_0= 'objectives' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleObjectiveSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:2209:2: (otherlv_0= 'objectives' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleObjectiveSpecification ) ) )
            // InternalApplicationConfiguration.g:2210:3: otherlv_0= 'objectives' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleObjectiveSpecification ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectiveDeclarationAccess().getObjectivesKeyword_0());
            		
            // InternalApplicationConfiguration.g:2214:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:2215:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:2215:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:2216:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObjectiveDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectiveDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalApplicationConfiguration.g:2232:3: ( (lv_specification_2_0= ruleObjectiveSpecification ) )
            // InternalApplicationConfiguration.g:2233:4: (lv_specification_2_0= ruleObjectiveSpecification )
            {
            // InternalApplicationConfiguration.g:2233:4: (lv_specification_2_0= ruleObjectiveSpecification )
            // InternalApplicationConfiguration.g:2234:5: lv_specification_2_0= ruleObjectiveSpecification
            {

            					newCompositeNode(grammarAccess.getObjectiveDeclarationAccess().getSpecificationObjectiveSpecificationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_specification_2_0=ruleObjectiveSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectiveDeclarationRule());
            					}
            					set(
            						current,
            						"specification",
            						lv_specification_2_0,
            						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ObjectiveSpecification");
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
    // $ANTLR end "ruleObjectiveDeclaration"


    // $ANTLR start "entryRuleObjectiveReference"
    // InternalApplicationConfiguration.g:2255:1: entryRuleObjectiveReference returns [EObject current=null] : iv_ruleObjectiveReference= ruleObjectiveReference EOF ;
    public final EObject entryRuleObjectiveReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectiveReference = null;


        try {
            // InternalApplicationConfiguration.g:2255:59: (iv_ruleObjectiveReference= ruleObjectiveReference EOF )
            // InternalApplicationConfiguration.g:2256:2: iv_ruleObjectiveReference= ruleObjectiveReference EOF
            {
             newCompositeNode(grammarAccess.getObjectiveReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectiveReference=ruleObjectiveReference();

            state._fsp--;

             current =iv_ruleObjectiveReference; 
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
    // $ANTLR end "entryRuleObjectiveReference"


    // $ANTLR start "ruleObjectiveReference"
    // InternalApplicationConfiguration.g:2262:1: ruleObjectiveReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleObjectiveReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2268:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:2269:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:2269:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:2270:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:2270:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:2271:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getObjectiveReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getObjectiveReferenceAccess().getReferredObjectiveDeclarationCrossReference_0());
            			

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
    // $ANTLR end "ruleObjectiveReference"


    // $ANTLR start "entryRuleObjective"
    // InternalApplicationConfiguration.g:2285:1: entryRuleObjective returns [EObject current=null] : iv_ruleObjective= ruleObjective EOF ;
    public final EObject entryRuleObjective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjective = null;


        try {
            // InternalApplicationConfiguration.g:2285:50: (iv_ruleObjective= ruleObjective EOF )
            // InternalApplicationConfiguration.g:2286:2: iv_ruleObjective= ruleObjective EOF
            {
             newCompositeNode(grammarAccess.getObjectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjective=ruleObjective();

            state._fsp--;

             current =iv_ruleObjective; 
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
    // $ANTLR end "entryRuleObjective"


    // $ANTLR start "ruleObjective"
    // InternalApplicationConfiguration.g:2292:1: ruleObjective returns [EObject current=null] : (this_ObjectiveReference_0= ruleObjectiveReference | this_ObjectiveSpecification_1= ruleObjectiveSpecification ) ;
    public final EObject ruleObjective() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectiveReference_0 = null;

        EObject this_ObjectiveSpecification_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2298:2: ( (this_ObjectiveReference_0= ruleObjectiveReference | this_ObjectiveSpecification_1= ruleObjectiveSpecification ) )
            // InternalApplicationConfiguration.g:2299:2: (this_ObjectiveReference_0= ruleObjectiveReference | this_ObjectiveSpecification_1= ruleObjectiveSpecification )
            {
            // InternalApplicationConfiguration.g:2299:2: (this_ObjectiveReference_0= ruleObjectiveReference | this_ObjectiveSpecification_1= ruleObjectiveSpecification )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            else if ( (LA31_0==18) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalApplicationConfiguration.g:2300:3: this_ObjectiveReference_0= ruleObjectiveReference
                    {

                    			newCompositeNode(grammarAccess.getObjectiveAccess().getObjectiveReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectiveReference_0=ruleObjectiveReference();

                    state._fsp--;


                    			current = this_ObjectiveReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:2309:3: this_ObjectiveSpecification_1= ruleObjectiveSpecification
                    {

                    			newCompositeNode(grammarAccess.getObjectiveAccess().getObjectiveSpecificationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectiveSpecification_1=ruleObjectiveSpecification();

                    state._fsp--;


                    			current = this_ObjectiveSpecification_1;
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
    // $ANTLR end "ruleObjective"


    // $ANTLR start "entryRuleConfigSpecification"
    // InternalApplicationConfiguration.g:2321:1: entryRuleConfigSpecification returns [EObject current=null] : iv_ruleConfigSpecification= ruleConfigSpecification EOF ;
    public final EObject entryRuleConfigSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigSpecification = null;


        try {
            // InternalApplicationConfiguration.g:2321:60: (iv_ruleConfigSpecification= ruleConfigSpecification EOF )
            // InternalApplicationConfiguration.g:2322:2: iv_ruleConfigSpecification= ruleConfigSpecification EOF
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
    // InternalApplicationConfiguration.g:2328:1: ruleConfigSpecification returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleConfigSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_entries_2_0 = null;

        EObject lv_entries_4_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2334:2: ( ( () otherlv_1= '{' ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )? otherlv_5= '}' ) )
            // InternalApplicationConfiguration.g:2335:2: ( () otherlv_1= '{' ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )? otherlv_5= '}' )
            {
            // InternalApplicationConfiguration.g:2335:2: ( () otherlv_1= '{' ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )? otherlv_5= '}' )
            // InternalApplicationConfiguration.g:2336:3: () otherlv_1= '{' ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )? otherlv_5= '}'
            {
            // InternalApplicationConfiguration.g:2336:3: ()
            // InternalApplicationConfiguration.g:2337:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigSpecificationAccess().getConfigSpecificationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigSpecificationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalApplicationConfiguration.g:2347:3: ( ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING||(LA33_0>=31 && LA33_0<=33)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalApplicationConfiguration.g:2348:4: ( (lv_entries_2_0= ruleConfigEntry ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )*
                    {
                    // InternalApplicationConfiguration.g:2348:4: ( (lv_entries_2_0= ruleConfigEntry ) )
                    // InternalApplicationConfiguration.g:2349:5: (lv_entries_2_0= ruleConfigEntry )
                    {
                    // InternalApplicationConfiguration.g:2349:5: (lv_entries_2_0= ruleConfigEntry )
                    // InternalApplicationConfiguration.g:2350:6: lv_entries_2_0= ruleConfigEntry
                    {

                    						newCompositeNode(grammarAccess.getConfigSpecificationAccess().getEntriesConfigEntryParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalApplicationConfiguration.g:2367:4: (otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==19) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:2368:5: otherlv_3= ',' ( (lv_entries_4_0= ruleConfigEntry ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_25); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getConfigSpecificationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalApplicationConfiguration.g:2372:5: ( (lv_entries_4_0= ruleConfigEntry ) )
                    	    // InternalApplicationConfiguration.g:2373:6: (lv_entries_4_0= ruleConfigEntry )
                    	    {
                    	    // InternalApplicationConfiguration.g:2373:6: (lv_entries_4_0= ruleConfigEntry )
                    	    // InternalApplicationConfiguration.g:2374:7: lv_entries_4_0= ruleConfigEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getConfigSpecificationAccess().getEntriesConfigEntryParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:2401:1: entryRuleConfigDeclaration returns [EObject current=null] : iv_ruleConfigDeclaration= ruleConfigDeclaration EOF ;
    public final EObject entryRuleConfigDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:2401:58: (iv_ruleConfigDeclaration= ruleConfigDeclaration EOF )
            // InternalApplicationConfiguration.g:2402:2: iv_ruleConfigDeclaration= ruleConfigDeclaration EOF
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
    // InternalApplicationConfiguration.g:2408:1: ruleConfigDeclaration returns [EObject current=null] : (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleConfigSpecification ) ) ) ;
    public final EObject ruleConfigDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_specification_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2414:2: ( (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleConfigSpecification ) ) ) )
            // InternalApplicationConfiguration.g:2415:2: (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleConfigSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:2415:2: (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleConfigSpecification ) ) )
            // InternalApplicationConfiguration.g:2416:3: otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleConfigSpecification ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigDeclarationAccess().getConfigKeyword_0());
            		
            // InternalApplicationConfiguration.g:2420:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:2421:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:2421:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:2422:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            // InternalApplicationConfiguration.g:2438:3: ( (lv_specification_2_0= ruleConfigSpecification ) )
            // InternalApplicationConfiguration.g:2439:4: (lv_specification_2_0= ruleConfigSpecification )
            {
            // InternalApplicationConfiguration.g:2439:4: (lv_specification_2_0= ruleConfigSpecification )
            // InternalApplicationConfiguration.g:2440:5: lv_specification_2_0= ruleConfigSpecification
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
    // InternalApplicationConfiguration.g:2461:1: entryRuleConfigEntry returns [EObject current=null] : iv_ruleConfigEntry= ruleConfigEntry EOF ;
    public final EObject entryRuleConfigEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigEntry = null;


        try {
            // InternalApplicationConfiguration.g:2461:52: (iv_ruleConfigEntry= ruleConfigEntry EOF )
            // InternalApplicationConfiguration.g:2462:2: iv_ruleConfigEntry= ruleConfigEntry EOF
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
    // InternalApplicationConfiguration.g:2468:1: ruleConfigEntry returns [EObject current=null] : (this_DocumentationEntry_0= ruleDocumentationEntry | this_RuntimeEntry_1= ruleRuntimeEntry | this_MemoryEntry_2= ruleMemoryEntry | this_CustomEntry_3= ruleCustomEntry ) ;
    public final EObject ruleConfigEntry() throws RecognitionException {
        EObject current = null;

        EObject this_DocumentationEntry_0 = null;

        EObject this_RuntimeEntry_1 = null;

        EObject this_MemoryEntry_2 = null;

        EObject this_CustomEntry_3 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2474:2: ( (this_DocumentationEntry_0= ruleDocumentationEntry | this_RuntimeEntry_1= ruleRuntimeEntry | this_MemoryEntry_2= ruleMemoryEntry | this_CustomEntry_3= ruleCustomEntry ) )
            // InternalApplicationConfiguration.g:2475:2: (this_DocumentationEntry_0= ruleDocumentationEntry | this_RuntimeEntry_1= ruleRuntimeEntry | this_MemoryEntry_2= ruleMemoryEntry | this_CustomEntry_3= ruleCustomEntry )
            {
            // InternalApplicationConfiguration.g:2475:2: (this_DocumentationEntry_0= ruleDocumentationEntry | this_RuntimeEntry_1= ruleRuntimeEntry | this_MemoryEntry_2= ruleMemoryEntry | this_CustomEntry_3= ruleCustomEntry )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt34=1;
                }
                break;
            case 32:
                {
                alt34=2;
                }
                break;
            case 33:
                {
                alt34=3;
                }
                break;
            case RULE_STRING:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalApplicationConfiguration.g:2476:3: this_DocumentationEntry_0= ruleDocumentationEntry
                    {

                    			newCompositeNode(grammarAccess.getConfigEntryAccess().getDocumentationEntryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DocumentationEntry_0=ruleDocumentationEntry();

                    state._fsp--;


                    			current = this_DocumentationEntry_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:2485:3: this_RuntimeEntry_1= ruleRuntimeEntry
                    {

                    			newCompositeNode(grammarAccess.getConfigEntryAccess().getRuntimeEntryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RuntimeEntry_1=ruleRuntimeEntry();

                    state._fsp--;


                    			current = this_RuntimeEntry_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalApplicationConfiguration.g:2494:3: this_MemoryEntry_2= ruleMemoryEntry
                    {

                    			newCompositeNode(grammarAccess.getConfigEntryAccess().getMemoryEntryParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MemoryEntry_2=ruleMemoryEntry();

                    state._fsp--;


                    			current = this_MemoryEntry_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalApplicationConfiguration.g:2503:3: this_CustomEntry_3= ruleCustomEntry
                    {

                    			newCompositeNode(grammarAccess.getConfigEntryAccess().getCustomEntryParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomEntry_3=ruleCustomEntry();

                    state._fsp--;


                    			current = this_CustomEntry_3;
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
    // $ANTLR end "ruleConfigEntry"


    // $ANTLR start "entryRuleDocumentationEntry"
    // InternalApplicationConfiguration.g:2515:1: entryRuleDocumentationEntry returns [EObject current=null] : iv_ruleDocumentationEntry= ruleDocumentationEntry EOF ;
    public final EObject entryRuleDocumentationEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentationEntry = null;


        try {
            // InternalApplicationConfiguration.g:2515:59: (iv_ruleDocumentationEntry= ruleDocumentationEntry EOF )
            // InternalApplicationConfiguration.g:2516:2: iv_ruleDocumentationEntry= ruleDocumentationEntry EOF
            {
             newCompositeNode(grammarAccess.getDocumentationEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocumentationEntry=ruleDocumentationEntry();

            state._fsp--;

             current =iv_ruleDocumentationEntry; 
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
    // $ANTLR end "entryRuleDocumentationEntry"


    // $ANTLR start "ruleDocumentationEntry"
    // InternalApplicationConfiguration.g:2522:1: ruleDocumentationEntry returns [EObject current=null] : (otherlv_0= 'log-level' otherlv_1= '=' ( (lv_level_2_0= ruleDocumentLevelSpecification ) ) ) ;
    public final EObject ruleDocumentationEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_level_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2528:2: ( (otherlv_0= 'log-level' otherlv_1= '=' ( (lv_level_2_0= ruleDocumentLevelSpecification ) ) ) )
            // InternalApplicationConfiguration.g:2529:2: (otherlv_0= 'log-level' otherlv_1= '=' ( (lv_level_2_0= ruleDocumentLevelSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:2529:2: (otherlv_0= 'log-level' otherlv_1= '=' ( (lv_level_2_0= ruleDocumentLevelSpecification ) ) )
            // InternalApplicationConfiguration.g:2530:3: otherlv_0= 'log-level' otherlv_1= '=' ( (lv_level_2_0= ruleDocumentLevelSpecification ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDocumentationEntryAccess().getLogLevelKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getDocumentationEntryAccess().getEqualsSignKeyword_1());
            		
            // InternalApplicationConfiguration.g:2538:3: ( (lv_level_2_0= ruleDocumentLevelSpecification ) )
            // InternalApplicationConfiguration.g:2539:4: (lv_level_2_0= ruleDocumentLevelSpecification )
            {
            // InternalApplicationConfiguration.g:2539:4: (lv_level_2_0= ruleDocumentLevelSpecification )
            // InternalApplicationConfiguration.g:2540:5: lv_level_2_0= ruleDocumentLevelSpecification
            {

            					newCompositeNode(grammarAccess.getDocumentationEntryAccess().getLevelDocumentLevelSpecificationEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_level_2_0=ruleDocumentLevelSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocumentationEntryRule());
            					}
            					set(
            						current,
            						"level",
            						lv_level_2_0,
            						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.DocumentLevelSpecification");
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
    // $ANTLR end "ruleDocumentationEntry"


    // $ANTLR start "entryRuleRuntimeEntry"
    // InternalApplicationConfiguration.g:2561:1: entryRuleRuntimeEntry returns [EObject current=null] : iv_ruleRuntimeEntry= ruleRuntimeEntry EOF ;
    public final EObject entryRuleRuntimeEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuntimeEntry = null;


        try {
            // InternalApplicationConfiguration.g:2561:53: (iv_ruleRuntimeEntry= ruleRuntimeEntry EOF )
            // InternalApplicationConfiguration.g:2562:2: iv_ruleRuntimeEntry= ruleRuntimeEntry EOF
            {
             newCompositeNode(grammarAccess.getRuntimeEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuntimeEntry=ruleRuntimeEntry();

            state._fsp--;

             current =iv_ruleRuntimeEntry; 
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
    // $ANTLR end "entryRuleRuntimeEntry"


    // $ANTLR start "ruleRuntimeEntry"
    // InternalApplicationConfiguration.g:2568:1: ruleRuntimeEntry returns [EObject current=null] : (otherlv_0= 'runtime' otherlv_1= '=' ( (lv_millisecLimit_2_0= RULE_INT ) ) ) ;
    public final EObject ruleRuntimeEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_millisecLimit_2_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2574:2: ( (otherlv_0= 'runtime' otherlv_1= '=' ( (lv_millisecLimit_2_0= RULE_INT ) ) ) )
            // InternalApplicationConfiguration.g:2575:2: (otherlv_0= 'runtime' otherlv_1= '=' ( (lv_millisecLimit_2_0= RULE_INT ) ) )
            {
            // InternalApplicationConfiguration.g:2575:2: (otherlv_0= 'runtime' otherlv_1= '=' ( (lv_millisecLimit_2_0= RULE_INT ) ) )
            // InternalApplicationConfiguration.g:2576:3: otherlv_0= 'runtime' otherlv_1= '=' ( (lv_millisecLimit_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRuntimeEntryAccess().getRuntimeKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRuntimeEntryAccess().getEqualsSignKeyword_1());
            		
            // InternalApplicationConfiguration.g:2584:3: ( (lv_millisecLimit_2_0= RULE_INT ) )
            // InternalApplicationConfiguration.g:2585:4: (lv_millisecLimit_2_0= RULE_INT )
            {
            // InternalApplicationConfiguration.g:2585:4: (lv_millisecLimit_2_0= RULE_INT )
            // InternalApplicationConfiguration.g:2586:5: lv_millisecLimit_2_0= RULE_INT
            {
            lv_millisecLimit_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_millisecLimit_2_0, grammarAccess.getRuntimeEntryAccess().getMillisecLimitINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuntimeEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"millisecLimit",
            						lv_millisecLimit_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleRuntimeEntry"


    // $ANTLR start "entryRuleMemoryEntry"
    // InternalApplicationConfiguration.g:2606:1: entryRuleMemoryEntry returns [EObject current=null] : iv_ruleMemoryEntry= ruleMemoryEntry EOF ;
    public final EObject entryRuleMemoryEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoryEntry = null;


        try {
            // InternalApplicationConfiguration.g:2606:52: (iv_ruleMemoryEntry= ruleMemoryEntry EOF )
            // InternalApplicationConfiguration.g:2607:2: iv_ruleMemoryEntry= ruleMemoryEntry EOF
            {
             newCompositeNode(grammarAccess.getMemoryEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemoryEntry=ruleMemoryEntry();

            state._fsp--;

             current =iv_ruleMemoryEntry; 
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
    // $ANTLR end "entryRuleMemoryEntry"


    // $ANTLR start "ruleMemoryEntry"
    // InternalApplicationConfiguration.g:2613:1: ruleMemoryEntry returns [EObject current=null] : (otherlv_0= 'memory' otherlv_1= '=' ( (lv_megabyteLimit_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMemoryEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_megabyteLimit_2_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2619:2: ( (otherlv_0= 'memory' otherlv_1= '=' ( (lv_megabyteLimit_2_0= RULE_INT ) ) ) )
            // InternalApplicationConfiguration.g:2620:2: (otherlv_0= 'memory' otherlv_1= '=' ( (lv_megabyteLimit_2_0= RULE_INT ) ) )
            {
            // InternalApplicationConfiguration.g:2620:2: (otherlv_0= 'memory' otherlv_1= '=' ( (lv_megabyteLimit_2_0= RULE_INT ) ) )
            // InternalApplicationConfiguration.g:2621:3: otherlv_0= 'memory' otherlv_1= '=' ( (lv_megabyteLimit_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMemoryEntryAccess().getMemoryKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMemoryEntryAccess().getEqualsSignKeyword_1());
            		
            // InternalApplicationConfiguration.g:2629:3: ( (lv_megabyteLimit_2_0= RULE_INT ) )
            // InternalApplicationConfiguration.g:2630:4: (lv_megabyteLimit_2_0= RULE_INT )
            {
            // InternalApplicationConfiguration.g:2630:4: (lv_megabyteLimit_2_0= RULE_INT )
            // InternalApplicationConfiguration.g:2631:5: lv_megabyteLimit_2_0= RULE_INT
            {
            lv_megabyteLimit_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_megabyteLimit_2_0, grammarAccess.getMemoryEntryAccess().getMegabyteLimitINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemoryEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"megabyteLimit",
            						lv_megabyteLimit_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleMemoryEntry"


    // $ANTLR start "entryRuleCustomEntry"
    // InternalApplicationConfiguration.g:2651:1: entryRuleCustomEntry returns [EObject current=null] : iv_ruleCustomEntry= ruleCustomEntry EOF ;
    public final EObject entryRuleCustomEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomEntry = null;


        try {
            // InternalApplicationConfiguration.g:2651:52: (iv_ruleCustomEntry= ruleCustomEntry EOF )
            // InternalApplicationConfiguration.g:2652:2: iv_ruleCustomEntry= ruleCustomEntry EOF
            {
             newCompositeNode(grammarAccess.getCustomEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomEntry=ruleCustomEntry();

            state._fsp--;

             current =iv_ruleCustomEntry; 
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
    // $ANTLR end "entryRuleCustomEntry"


    // $ANTLR start "ruleCustomEntry"
    // InternalApplicationConfiguration.g:2658:1: ruleCustomEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleCustomEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2664:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalApplicationConfiguration.g:2665:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalApplicationConfiguration.g:2665:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalApplicationConfiguration.g:2666:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalApplicationConfiguration.g:2666:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalApplicationConfiguration.g:2667:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalApplicationConfiguration.g:2667:4: (lv_key_0_0= RULE_STRING )
            // InternalApplicationConfiguration.g:2668:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_key_0_0, grammarAccess.getCustomEntryAccess().getKeySTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomEntryAccess().getEqualsSignKeyword_1());
            		
            // InternalApplicationConfiguration.g:2688:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalApplicationConfiguration.g:2689:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalApplicationConfiguration.g:2689:4: (lv_value_2_0= RULE_STRING )
            // InternalApplicationConfiguration.g:2690:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getCustomEntryAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomEntryRule());
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
    // $ANTLR end "ruleCustomEntry"


    // $ANTLR start "entryRuleConfigReference"
    // InternalApplicationConfiguration.g:2710:1: entryRuleConfigReference returns [EObject current=null] : iv_ruleConfigReference= ruleConfigReference EOF ;
    public final EObject entryRuleConfigReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigReference = null;


        try {
            // InternalApplicationConfiguration.g:2710:56: (iv_ruleConfigReference= ruleConfigReference EOF )
            // InternalApplicationConfiguration.g:2711:2: iv_ruleConfigReference= ruleConfigReference EOF
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
    // InternalApplicationConfiguration.g:2717:1: ruleConfigReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleConfigReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2723:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:2724:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:2724:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:2725:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:2725:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:2726:4: otherlv_0= RULE_ID
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
    // InternalApplicationConfiguration.g:2740:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalApplicationConfiguration.g:2740:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalApplicationConfiguration.g:2741:2: iv_ruleConfig= ruleConfig EOF
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
    // InternalApplicationConfiguration.g:2747:1: ruleConfig returns [EObject current=null] : (this_ConfigSpecification_0= ruleConfigSpecification | this_ConfigReference_1= ruleConfigReference ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigSpecification_0 = null;

        EObject this_ConfigReference_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2753:2: ( (this_ConfigSpecification_0= ruleConfigSpecification | this_ConfigReference_1= ruleConfigReference ) )
            // InternalApplicationConfiguration.g:2754:2: (this_ConfigSpecification_0= ruleConfigSpecification | this_ConfigReference_1= ruleConfigReference )
            {
            // InternalApplicationConfiguration.g:2754:2: (this_ConfigSpecification_0= ruleConfigSpecification | this_ConfigReference_1= ruleConfigReference )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
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
                    // InternalApplicationConfiguration.g:2755:3: this_ConfigSpecification_0= ruleConfigSpecification
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
                    // InternalApplicationConfiguration.g:2764:3: this_ConfigReference_1= ruleConfigReference
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
    // InternalApplicationConfiguration.g:2776:1: entryRuleScopeSpecification returns [EObject current=null] : iv_ruleScopeSpecification= ruleScopeSpecification EOF ;
    public final EObject entryRuleScopeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeSpecification = null;


        try {
            // InternalApplicationConfiguration.g:2776:59: (iv_ruleScopeSpecification= ruleScopeSpecification EOF )
            // InternalApplicationConfiguration.g:2777:2: iv_ruleScopeSpecification= ruleScopeSpecification EOF
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
    // InternalApplicationConfiguration.g:2783:1: ruleScopeSpecification returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleScopeSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_scopes_2_0 = null;

        EObject lv_scopes_4_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2789:2: ( ( () otherlv_1= '{' ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )? otherlv_5= '}' ) )
            // InternalApplicationConfiguration.g:2790:2: ( () otherlv_1= '{' ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )? otherlv_5= '}' )
            {
            // InternalApplicationConfiguration.g:2790:2: ( () otherlv_1= '{' ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )? otherlv_5= '}' )
            // InternalApplicationConfiguration.g:2791:3: () otherlv_1= '{' ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )? otherlv_5= '}'
            {
            // InternalApplicationConfiguration.g:2791:3: ()
            // InternalApplicationConfiguration.g:2792:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScopeSpecificationAccess().getScopeSpecificationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getScopeSpecificationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalApplicationConfiguration.g:2802:3: ( ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalApplicationConfiguration.g:2803:4: ( (lv_scopes_2_0= ruleTypeScope ) ) (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )*
                    {
                    // InternalApplicationConfiguration.g:2803:4: ( (lv_scopes_2_0= ruleTypeScope ) )
                    // InternalApplicationConfiguration.g:2804:5: (lv_scopes_2_0= ruleTypeScope )
                    {
                    // InternalApplicationConfiguration.g:2804:5: (lv_scopes_2_0= ruleTypeScope )
                    // InternalApplicationConfiguration.g:2805:6: lv_scopes_2_0= ruleTypeScope
                    {

                    						newCompositeNode(grammarAccess.getScopeSpecificationAccess().getScopesTypeScopeParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalApplicationConfiguration.g:2822:4: (otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==19) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:2823:5: otherlv_3= ',' ( (lv_scopes_4_0= ruleTypeScope ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_28); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getScopeSpecificationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalApplicationConfiguration.g:2827:5: ( (lv_scopes_4_0= ruleTypeScope ) )
                    	    // InternalApplicationConfiguration.g:2828:6: (lv_scopes_4_0= ruleTypeScope )
                    	    {
                    	    // InternalApplicationConfiguration.g:2828:6: (lv_scopes_4_0= ruleTypeScope )
                    	    // InternalApplicationConfiguration.g:2829:7: lv_scopes_4_0= ruleTypeScope
                    	    {

                    	    							newCompositeNode(grammarAccess.getScopeSpecificationAccess().getScopesTypeScopeParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:2856:1: entryRuleTypeScope returns [EObject current=null] : iv_ruleTypeScope= ruleTypeScope EOF ;
    public final EObject entryRuleTypeScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeScope = null;


        try {
            // InternalApplicationConfiguration.g:2856:50: (iv_ruleTypeScope= ruleTypeScope EOF )
            // InternalApplicationConfiguration.g:2857:2: iv_ruleTypeScope= ruleTypeScope EOF
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
    // InternalApplicationConfiguration.g:2863:1: ruleTypeScope returns [EObject current=null] : (this_ClassTypeScope_0= ruleClassTypeScope | this_ObjectTypeScope_1= ruleObjectTypeScope | this_IntegerTypeScope_2= ruleIntegerTypeScope | this_RealTypeScope_3= ruleRealTypeScope | this_StringTypeScope_4= ruleStringTypeScope ) ;
    public final EObject ruleTypeScope() throws RecognitionException {
        EObject current = null;

        EObject this_ClassTypeScope_0 = null;

        EObject this_ObjectTypeScope_1 = null;

        EObject this_IntegerTypeScope_2 = null;

        EObject this_RealTypeScope_3 = null;

        EObject this_StringTypeScope_4 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2869:2: ( (this_ClassTypeScope_0= ruleClassTypeScope | this_ObjectTypeScope_1= ruleObjectTypeScope | this_IntegerTypeScope_2= ruleIntegerTypeScope | this_RealTypeScope_3= ruleRealTypeScope | this_StringTypeScope_4= ruleStringTypeScope ) )
            // InternalApplicationConfiguration.g:2870:2: (this_ClassTypeScope_0= ruleClassTypeScope | this_ObjectTypeScope_1= ruleObjectTypeScope | this_IntegerTypeScope_2= ruleIntegerTypeScope | this_RealTypeScope_3= ruleRealTypeScope | this_StringTypeScope_4= ruleStringTypeScope )
            {
            // InternalApplicationConfiguration.g:2870:2: (this_ClassTypeScope_0= ruleClassTypeScope | this_ObjectTypeScope_1= ruleObjectTypeScope | this_IntegerTypeScope_2= ruleIntegerTypeScope | this_RealTypeScope_3= ruleRealTypeScope | this_StringTypeScope_4= ruleStringTypeScope )
            int alt38=5;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                switch ( input.LA(2) ) {
                case 39:
                    {
                    alt38=3;
                    }
                    break;
                case 40:
                    {
                    alt38=4;
                    }
                    break;
                case 41:
                    {
                    alt38=5;
                    }
                    break;
                case 36:
                    {
                    alt38=1;
                    }
                    break;
                case 38:
                    {
                    alt38=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalApplicationConfiguration.g:2871:3: this_ClassTypeScope_0= ruleClassTypeScope
                    {

                    			newCompositeNode(grammarAccess.getTypeScopeAccess().getClassTypeScopeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassTypeScope_0=ruleClassTypeScope();

                    state._fsp--;


                    			current = this_ClassTypeScope_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:2880:3: this_ObjectTypeScope_1= ruleObjectTypeScope
                    {

                    			newCompositeNode(grammarAccess.getTypeScopeAccess().getObjectTypeScopeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectTypeScope_1=ruleObjectTypeScope();

                    state._fsp--;


                    			current = this_ObjectTypeScope_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalApplicationConfiguration.g:2889:3: this_IntegerTypeScope_2= ruleIntegerTypeScope
                    {

                    			newCompositeNode(grammarAccess.getTypeScopeAccess().getIntegerTypeScopeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerTypeScope_2=ruleIntegerTypeScope();

                    state._fsp--;


                    			current = this_IntegerTypeScope_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalApplicationConfiguration.g:2898:3: this_RealTypeScope_3= ruleRealTypeScope
                    {

                    			newCompositeNode(grammarAccess.getTypeScopeAccess().getRealTypeScopeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealTypeScope_3=ruleRealTypeScope();

                    state._fsp--;


                    			current = this_RealTypeScope_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalApplicationConfiguration.g:2907:3: this_StringTypeScope_4= ruleStringTypeScope
                    {

                    			newCompositeNode(grammarAccess.getTypeScopeAccess().getStringTypeScopeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringTypeScope_4=ruleStringTypeScope();

                    state._fsp--;


                    			current = this_StringTypeScope_4;
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
    // $ANTLR end "ruleTypeScope"


    // $ANTLR start "entryRuleClassTypeScope"
    // InternalApplicationConfiguration.g:2919:1: entryRuleClassTypeScope returns [EObject current=null] : iv_ruleClassTypeScope= ruleClassTypeScope EOF ;
    public final EObject entryRuleClassTypeScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassTypeScope = null;


        try {
            // InternalApplicationConfiguration.g:2919:55: (iv_ruleClassTypeScope= ruleClassTypeScope EOF )
            // InternalApplicationConfiguration.g:2920:2: iv_ruleClassTypeScope= ruleClassTypeScope EOF
            {
             newCompositeNode(grammarAccess.getClassTypeScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassTypeScope=ruleClassTypeScope();

            state._fsp--;

             current =iv_ruleClassTypeScope; 
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
    // $ANTLR end "entryRuleClassTypeScope"


    // $ANTLR start "ruleClassTypeScope"
    // InternalApplicationConfiguration.g:2926:1: ruleClassTypeScope returns [EObject current=null] : (otherlv_0= '#' ( (lv_type_1_0= ruleClassReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) ) ) ;
    public final EObject ruleClassTypeScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_setsNew_2_0=null;
        Token lv_setsSum_3_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_number_4_0 = null;

        EObject lv_number_5_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:2932:2: ( (otherlv_0= '#' ( (lv_type_1_0= ruleClassReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) ) ) )
            // InternalApplicationConfiguration.g:2933:2: (otherlv_0= '#' ( (lv_type_1_0= ruleClassReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) ) )
            {
            // InternalApplicationConfiguration.g:2933:2: (otherlv_0= '#' ( (lv_type_1_0= ruleClassReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) ) )
            // InternalApplicationConfiguration.g:2934:3: otherlv_0= '#' ( (lv_type_1_0= ruleClassReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getClassTypeScopeAccess().getNumberSignKeyword_0());
            		
            // InternalApplicationConfiguration.g:2938:3: ( (lv_type_1_0= ruleClassReference ) )
            // InternalApplicationConfiguration.g:2939:4: (lv_type_1_0= ruleClassReference )
            {
            // InternalApplicationConfiguration.g:2939:4: (lv_type_1_0= ruleClassReference )
            // InternalApplicationConfiguration.g:2940:5: lv_type_1_0= ruleClassReference
            {

            					newCompositeNode(grammarAccess.getClassTypeScopeAccess().getTypeClassReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_type_1_0=ruleClassReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassTypeScopeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ClassReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApplicationConfiguration.g:2957:3: ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            else if ( (LA39_0==17) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalApplicationConfiguration.g:2958:4: ( (lv_setsNew_2_0= '+=' ) )
                    {
                    // InternalApplicationConfiguration.g:2958:4: ( (lv_setsNew_2_0= '+=' ) )
                    // InternalApplicationConfiguration.g:2959:5: (lv_setsNew_2_0= '+=' )
                    {
                    // InternalApplicationConfiguration.g:2959:5: (lv_setsNew_2_0= '+=' )
                    // InternalApplicationConfiguration.g:2960:6: lv_setsNew_2_0= '+='
                    {
                    lv_setsNew_2_0=(Token)match(input,35,FOLLOW_31); 

                    						newLeafNode(lv_setsNew_2_0, grammarAccess.getClassTypeScopeAccess().getSetsNewPlusSignEqualsSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassTypeScopeRule());
                    						}
                    						setWithLastConsumed(current, "setsNew", true, "+=");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:2973:4: ( (lv_setsSum_3_0= '=' ) )
                    {
                    // InternalApplicationConfiguration.g:2973:4: ( (lv_setsSum_3_0= '=' ) )
                    // InternalApplicationConfiguration.g:2974:5: (lv_setsSum_3_0= '=' )
                    {
                    // InternalApplicationConfiguration.g:2974:5: (lv_setsSum_3_0= '=' )
                    // InternalApplicationConfiguration.g:2975:6: lv_setsSum_3_0= '='
                    {
                    lv_setsSum_3_0=(Token)match(input,17,FOLLOW_31); 

                    						newLeafNode(lv_setsSum_3_0, grammarAccess.getClassTypeScopeAccess().getSetsSumEqualsSignKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassTypeScopeRule());
                    						}
                    						setWithLastConsumed(current, "setsSum", true, "=");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalApplicationConfiguration.g:2988:3: ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==EOF||(LA40_1>=19 && LA40_1<=20)) ) {
                    alt40=1;
                }
                else if ( (LA40_1==43) ) {
                    alt40=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA40_0==42) ) {
                alt40=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalApplicationConfiguration.g:2989:4: ( (lv_number_4_0= ruleExactNumber ) )
                    {
                    // InternalApplicationConfiguration.g:2989:4: ( (lv_number_4_0= ruleExactNumber ) )
                    // InternalApplicationConfiguration.g:2990:5: (lv_number_4_0= ruleExactNumber )
                    {
                    // InternalApplicationConfiguration.g:2990:5: (lv_number_4_0= ruleExactNumber )
                    // InternalApplicationConfiguration.g:2991:6: lv_number_4_0= ruleExactNumber
                    {

                    						newCompositeNode(grammarAccess.getClassTypeScopeAccess().getNumberExactNumberParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_4_0=ruleExactNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassTypeScopeRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_4_0,
                    							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ExactNumber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:3009:4: ( (lv_number_5_0= ruleIntervallNumber ) )
                    {
                    // InternalApplicationConfiguration.g:3009:4: ( (lv_number_5_0= ruleIntervallNumber ) )
                    // InternalApplicationConfiguration.g:3010:5: (lv_number_5_0= ruleIntervallNumber )
                    {
                    // InternalApplicationConfiguration.g:3010:5: (lv_number_5_0= ruleIntervallNumber )
                    // InternalApplicationConfiguration.g:3011:6: lv_number_5_0= ruleIntervallNumber
                    {

                    						newCompositeNode(grammarAccess.getClassTypeScopeAccess().getNumberIntervallNumberParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_5_0=ruleIntervallNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassTypeScopeRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_5_0,
                    							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.IntervallNumber");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleClassTypeScope"


    // $ANTLR start "entryRuleObjectTypeScope"
    // InternalApplicationConfiguration.g:3033:1: entryRuleObjectTypeScope returns [EObject current=null] : iv_ruleObjectTypeScope= ruleObjectTypeScope EOF ;
    public final EObject entryRuleObjectTypeScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectTypeScope = null;


        try {
            // InternalApplicationConfiguration.g:3033:56: (iv_ruleObjectTypeScope= ruleObjectTypeScope EOF )
            // InternalApplicationConfiguration.g:3034:2: iv_ruleObjectTypeScope= ruleObjectTypeScope EOF
            {
             newCompositeNode(grammarAccess.getObjectTypeScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectTypeScope=ruleObjectTypeScope();

            state._fsp--;

             current =iv_ruleObjectTypeScope; 
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
    // $ANTLR end "entryRuleObjectTypeScope"


    // $ANTLR start "ruleObjectTypeScope"
    // InternalApplicationConfiguration.g:3040:1: ruleObjectTypeScope returns [EObject current=null] : (otherlv_0= '#' ( (lv_type_1_0= ruleObjectReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) ) ) ;
    public final EObject ruleObjectTypeScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_setsNew_2_0=null;
        Token lv_setsSum_3_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_number_4_0 = null;

        EObject lv_number_5_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:3046:2: ( (otherlv_0= '#' ( (lv_type_1_0= ruleObjectReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) ) ) )
            // InternalApplicationConfiguration.g:3047:2: (otherlv_0= '#' ( (lv_type_1_0= ruleObjectReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) ) )
            {
            // InternalApplicationConfiguration.g:3047:2: (otherlv_0= '#' ( (lv_type_1_0= ruleObjectReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) ) )
            // InternalApplicationConfiguration.g:3048:3: otherlv_0= '#' ( (lv_type_1_0= ruleObjectReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectTypeScopeAccess().getNumberSignKeyword_0());
            		
            // InternalApplicationConfiguration.g:3052:3: ( (lv_type_1_0= ruleObjectReference ) )
            // InternalApplicationConfiguration.g:3053:4: (lv_type_1_0= ruleObjectReference )
            {
            // InternalApplicationConfiguration.g:3053:4: (lv_type_1_0= ruleObjectReference )
            // InternalApplicationConfiguration.g:3054:5: lv_type_1_0= ruleObjectReference
            {

            					newCompositeNode(grammarAccess.getObjectTypeScopeAccess().getTypeObjectReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_type_1_0=ruleObjectReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectTypeScopeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ObjectReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApplicationConfiguration.g:3071:3: ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==35) ) {
                alt41=1;
            }
            else if ( (LA41_0==17) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalApplicationConfiguration.g:3072:4: ( (lv_setsNew_2_0= '+=' ) )
                    {
                    // InternalApplicationConfiguration.g:3072:4: ( (lv_setsNew_2_0= '+=' ) )
                    // InternalApplicationConfiguration.g:3073:5: (lv_setsNew_2_0= '+=' )
                    {
                    // InternalApplicationConfiguration.g:3073:5: (lv_setsNew_2_0= '+=' )
                    // InternalApplicationConfiguration.g:3074:6: lv_setsNew_2_0= '+='
                    {
                    lv_setsNew_2_0=(Token)match(input,35,FOLLOW_31); 

                    						newLeafNode(lv_setsNew_2_0, grammarAccess.getObjectTypeScopeAccess().getSetsNewPlusSignEqualsSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectTypeScopeRule());
                    						}
                    						setWithLastConsumed(current, "setsNew", true, "+=");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:3087:4: ( (lv_setsSum_3_0= '=' ) )
                    {
                    // InternalApplicationConfiguration.g:3087:4: ( (lv_setsSum_3_0= '=' ) )
                    // InternalApplicationConfiguration.g:3088:5: (lv_setsSum_3_0= '=' )
                    {
                    // InternalApplicationConfiguration.g:3088:5: (lv_setsSum_3_0= '=' )
                    // InternalApplicationConfiguration.g:3089:6: lv_setsSum_3_0= '='
                    {
                    lv_setsSum_3_0=(Token)match(input,17,FOLLOW_31); 

                    						newLeafNode(lv_setsSum_3_0, grammarAccess.getObjectTypeScopeAccess().getSetsSumEqualsSignKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectTypeScopeRule());
                    						}
                    						setWithLastConsumed(current, "setsSum", true, "=");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalApplicationConfiguration.g:3102:3: ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==EOF||(LA42_1>=19 && LA42_1<=20)) ) {
                    alt42=1;
                }
                else if ( (LA42_1==43) ) {
                    alt42=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA42_0==42) ) {
                alt42=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalApplicationConfiguration.g:3103:4: ( (lv_number_4_0= ruleExactNumber ) )
                    {
                    // InternalApplicationConfiguration.g:3103:4: ( (lv_number_4_0= ruleExactNumber ) )
                    // InternalApplicationConfiguration.g:3104:5: (lv_number_4_0= ruleExactNumber )
                    {
                    // InternalApplicationConfiguration.g:3104:5: (lv_number_4_0= ruleExactNumber )
                    // InternalApplicationConfiguration.g:3105:6: lv_number_4_0= ruleExactNumber
                    {

                    						newCompositeNode(grammarAccess.getObjectTypeScopeAccess().getNumberExactNumberParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_4_0=ruleExactNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectTypeScopeRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_4_0,
                    							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ExactNumber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:3123:4: ( (lv_number_5_0= ruleIntervallNumber ) )
                    {
                    // InternalApplicationConfiguration.g:3123:4: ( (lv_number_5_0= ruleIntervallNumber ) )
                    // InternalApplicationConfiguration.g:3124:5: (lv_number_5_0= ruleIntervallNumber )
                    {
                    // InternalApplicationConfiguration.g:3124:5: (lv_number_5_0= ruleIntervallNumber )
                    // InternalApplicationConfiguration.g:3125:6: lv_number_5_0= ruleIntervallNumber
                    {

                    						newCompositeNode(grammarAccess.getObjectTypeScopeAccess().getNumberIntervallNumberParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_5_0=ruleIntervallNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectTypeScopeRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_5_0,
                    							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.IntervallNumber");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleObjectTypeScope"


    // $ANTLR start "entryRuleIntegerTypeScope"
    // InternalApplicationConfiguration.g:3147:1: entryRuleIntegerTypeScope returns [EObject current=null] : iv_ruleIntegerTypeScope= ruleIntegerTypeScope EOF ;
    public final EObject entryRuleIntegerTypeScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTypeScope = null;


        try {
            // InternalApplicationConfiguration.g:3147:57: (iv_ruleIntegerTypeScope= ruleIntegerTypeScope EOF )
            // InternalApplicationConfiguration.g:3148:2: iv_ruleIntegerTypeScope= ruleIntegerTypeScope EOF
            {
             newCompositeNode(grammarAccess.getIntegerTypeScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerTypeScope=ruleIntegerTypeScope();

            state._fsp--;

             current =iv_ruleIntegerTypeScope; 
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
    // $ANTLR end "entryRuleIntegerTypeScope"


    // $ANTLR start "ruleIntegerTypeScope"
    // InternalApplicationConfiguration.g:3154:1: ruleIntegerTypeScope returns [EObject current=null] : (otherlv_0= '#' ( (lv_type_1_0= ruleIntegerReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleIntEnumberation ) ) ) ) ;
    public final EObject ruleIntegerTypeScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_setsNew_2_0=null;
        Token lv_setsSum_3_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_number_4_0 = null;

        EObject lv_number_5_0 = null;

        EObject lv_number_6_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:3160:2: ( (otherlv_0= '#' ( (lv_type_1_0= ruleIntegerReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleIntEnumberation ) ) ) ) )
            // InternalApplicationConfiguration.g:3161:2: (otherlv_0= '#' ( (lv_type_1_0= ruleIntegerReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleIntEnumberation ) ) ) )
            {
            // InternalApplicationConfiguration.g:3161:2: (otherlv_0= '#' ( (lv_type_1_0= ruleIntegerReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleIntEnumberation ) ) ) )
            // InternalApplicationConfiguration.g:3162:3: otherlv_0= '#' ( (lv_type_1_0= ruleIntegerReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleIntEnumberation ) ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getIntegerTypeScopeAccess().getNumberSignKeyword_0());
            		
            // InternalApplicationConfiguration.g:3166:3: ( (lv_type_1_0= ruleIntegerReference ) )
            // InternalApplicationConfiguration.g:3167:4: (lv_type_1_0= ruleIntegerReference )
            {
            // InternalApplicationConfiguration.g:3167:4: (lv_type_1_0= ruleIntegerReference )
            // InternalApplicationConfiguration.g:3168:5: lv_type_1_0= ruleIntegerReference
            {

            					newCompositeNode(grammarAccess.getIntegerTypeScopeAccess().getTypeIntegerReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_type_1_0=ruleIntegerReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerTypeScopeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.IntegerReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApplicationConfiguration.g:3185:3: ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==35) ) {
                alt43=1;
            }
            else if ( (LA43_0==17) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalApplicationConfiguration.g:3186:4: ( (lv_setsNew_2_0= '+=' ) )
                    {
                    // InternalApplicationConfiguration.g:3186:4: ( (lv_setsNew_2_0= '+=' ) )
                    // InternalApplicationConfiguration.g:3187:5: (lv_setsNew_2_0= '+=' )
                    {
                    // InternalApplicationConfiguration.g:3187:5: (lv_setsNew_2_0= '+=' )
                    // InternalApplicationConfiguration.g:3188:6: lv_setsNew_2_0= '+='
                    {
                    lv_setsNew_2_0=(Token)match(input,35,FOLLOW_34); 

                    						newLeafNode(lv_setsNew_2_0, grammarAccess.getIntegerTypeScopeAccess().getSetsNewPlusSignEqualsSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntegerTypeScopeRule());
                    						}
                    						setWithLastConsumed(current, "setsNew", true, "+=");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:3201:4: ( (lv_setsSum_3_0= '=' ) )
                    {
                    // InternalApplicationConfiguration.g:3201:4: ( (lv_setsSum_3_0= '=' ) )
                    // InternalApplicationConfiguration.g:3202:5: (lv_setsSum_3_0= '=' )
                    {
                    // InternalApplicationConfiguration.g:3202:5: (lv_setsSum_3_0= '=' )
                    // InternalApplicationConfiguration.g:3203:6: lv_setsSum_3_0= '='
                    {
                    lv_setsSum_3_0=(Token)match(input,17,FOLLOW_34); 

                    						newLeafNode(lv_setsSum_3_0, grammarAccess.getIntegerTypeScopeAccess().getSetsSumEqualsSignKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntegerTypeScopeRule());
                    						}
                    						setWithLastConsumed(current, "setsSum", true, "=");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalApplicationConfiguration.g:3216:3: ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleIntEnumberation ) ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==EOF||(LA44_1>=19 && LA44_1<=20)) ) {
                    alt44=1;
                }
                else if ( (LA44_1==43) ) {
                    alt44=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                alt44=1;
                }
                break;
            case 18:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalApplicationConfiguration.g:3217:4: ( (lv_number_4_0= ruleExactNumber ) )
                    {
                    // InternalApplicationConfiguration.g:3217:4: ( (lv_number_4_0= ruleExactNumber ) )
                    // InternalApplicationConfiguration.g:3218:5: (lv_number_4_0= ruleExactNumber )
                    {
                    // InternalApplicationConfiguration.g:3218:5: (lv_number_4_0= ruleExactNumber )
                    // InternalApplicationConfiguration.g:3219:6: lv_number_4_0= ruleExactNumber
                    {

                    						newCompositeNode(grammarAccess.getIntegerTypeScopeAccess().getNumberExactNumberParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_4_0=ruleExactNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerTypeScopeRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_4_0,
                    							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ExactNumber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:3237:4: ( (lv_number_5_0= ruleIntervallNumber ) )
                    {
                    // InternalApplicationConfiguration.g:3237:4: ( (lv_number_5_0= ruleIntervallNumber ) )
                    // InternalApplicationConfiguration.g:3238:5: (lv_number_5_0= ruleIntervallNumber )
                    {
                    // InternalApplicationConfiguration.g:3238:5: (lv_number_5_0= ruleIntervallNumber )
                    // InternalApplicationConfiguration.g:3239:6: lv_number_5_0= ruleIntervallNumber
                    {

                    						newCompositeNode(grammarAccess.getIntegerTypeScopeAccess().getNumberIntervallNumberParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_5_0=ruleIntervallNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerTypeScopeRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_5_0,
                    							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.IntervallNumber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalApplicationConfiguration.g:3257:4: ( (lv_number_6_0= ruleIntEnumberation ) )
                    {
                    // InternalApplicationConfiguration.g:3257:4: ( (lv_number_6_0= ruleIntEnumberation ) )
                    // InternalApplicationConfiguration.g:3258:5: (lv_number_6_0= ruleIntEnumberation )
                    {
                    // InternalApplicationConfiguration.g:3258:5: (lv_number_6_0= ruleIntEnumberation )
                    // InternalApplicationConfiguration.g:3259:6: lv_number_6_0= ruleIntEnumberation
                    {

                    						newCompositeNode(grammarAccess.getIntegerTypeScopeAccess().getNumberIntEnumberationParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_6_0=ruleIntEnumberation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerTypeScopeRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_6_0,
                    							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.IntEnumberation");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleIntegerTypeScope"


    // $ANTLR start "entryRuleRealTypeScope"
    // InternalApplicationConfiguration.g:3281:1: entryRuleRealTypeScope returns [EObject current=null] : iv_ruleRealTypeScope= ruleRealTypeScope EOF ;
    public final EObject entryRuleRealTypeScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTypeScope = null;


        try {
            // InternalApplicationConfiguration.g:3281:54: (iv_ruleRealTypeScope= ruleRealTypeScope EOF )
            // InternalApplicationConfiguration.g:3282:2: iv_ruleRealTypeScope= ruleRealTypeScope EOF
            {
             newCompositeNode(grammarAccess.getRealTypeScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealTypeScope=ruleRealTypeScope();

            state._fsp--;

             current =iv_ruleRealTypeScope; 
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
    // $ANTLR end "entryRuleRealTypeScope"


    // $ANTLR start "ruleRealTypeScope"
    // InternalApplicationConfiguration.g:3288:1: ruleRealTypeScope returns [EObject current=null] : (otherlv_0= '#' ( (lv_type_1_0= ruleRealReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleRealEnumeration ) ) ) ) ;
    public final EObject ruleRealTypeScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_setsNew_2_0=null;
        Token lv_setsSum_3_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_number_4_0 = null;

        EObject lv_number_5_0 = null;

        EObject lv_number_6_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:3294:2: ( (otherlv_0= '#' ( (lv_type_1_0= ruleRealReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleRealEnumeration ) ) ) ) )
            // InternalApplicationConfiguration.g:3295:2: (otherlv_0= '#' ( (lv_type_1_0= ruleRealReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleRealEnumeration ) ) ) )
            {
            // InternalApplicationConfiguration.g:3295:2: (otherlv_0= '#' ( (lv_type_1_0= ruleRealReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleRealEnumeration ) ) ) )
            // InternalApplicationConfiguration.g:3296:3: otherlv_0= '#' ( (lv_type_1_0= ruleRealReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleRealEnumeration ) ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getRealTypeScopeAccess().getNumberSignKeyword_0());
            		
            // InternalApplicationConfiguration.g:3300:3: ( (lv_type_1_0= ruleRealReference ) )
            // InternalApplicationConfiguration.g:3301:4: (lv_type_1_0= ruleRealReference )
            {
            // InternalApplicationConfiguration.g:3301:4: (lv_type_1_0= ruleRealReference )
            // InternalApplicationConfiguration.g:3302:5: lv_type_1_0= ruleRealReference
            {

            					newCompositeNode(grammarAccess.getRealTypeScopeAccess().getTypeRealReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_type_1_0=ruleRealReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRealTypeScopeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.RealReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApplicationConfiguration.g:3319:3: ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==35) ) {
                alt45=1;
            }
            else if ( (LA45_0==17) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalApplicationConfiguration.g:3320:4: ( (lv_setsNew_2_0= '+=' ) )
                    {
                    // InternalApplicationConfiguration.g:3320:4: ( (lv_setsNew_2_0= '+=' ) )
                    // InternalApplicationConfiguration.g:3321:5: (lv_setsNew_2_0= '+=' )
                    {
                    // InternalApplicationConfiguration.g:3321:5: (lv_setsNew_2_0= '+=' )
                    // InternalApplicationConfiguration.g:3322:6: lv_setsNew_2_0= '+='
                    {
                    lv_setsNew_2_0=(Token)match(input,35,FOLLOW_34); 

                    						newLeafNode(lv_setsNew_2_0, grammarAccess.getRealTypeScopeAccess().getSetsNewPlusSignEqualsSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRealTypeScopeRule());
                    						}
                    						setWithLastConsumed(current, "setsNew", true, "+=");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:3335:4: ( (lv_setsSum_3_0= '=' ) )
                    {
                    // InternalApplicationConfiguration.g:3335:4: ( (lv_setsSum_3_0= '=' ) )
                    // InternalApplicationConfiguration.g:3336:5: (lv_setsSum_3_0= '=' )
                    {
                    // InternalApplicationConfiguration.g:3336:5: (lv_setsSum_3_0= '=' )
                    // InternalApplicationConfiguration.g:3337:6: lv_setsSum_3_0= '='
                    {
                    lv_setsSum_3_0=(Token)match(input,17,FOLLOW_34); 

                    						newLeafNode(lv_setsSum_3_0, grammarAccess.getRealTypeScopeAccess().getSetsSumEqualsSignKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRealTypeScopeRule());
                    						}
                    						setWithLastConsumed(current, "setsSum", true, "=");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalApplicationConfiguration.g:3350:3: ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleRealEnumeration ) ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==43) ) {
                    alt46=2;
                }
                else if ( (LA46_1==EOF||(LA46_1>=19 && LA46_1<=20)) ) {
                    alt46=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                alt46=1;
                }
                break;
            case 18:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalApplicationConfiguration.g:3351:4: ( (lv_number_4_0= ruleExactNumber ) )
                    {
                    // InternalApplicationConfiguration.g:3351:4: ( (lv_number_4_0= ruleExactNumber ) )
                    // InternalApplicationConfiguration.g:3352:5: (lv_number_4_0= ruleExactNumber )
                    {
                    // InternalApplicationConfiguration.g:3352:5: (lv_number_4_0= ruleExactNumber )
                    // InternalApplicationConfiguration.g:3353:6: lv_number_4_0= ruleExactNumber
                    {

                    						newCompositeNode(grammarAccess.getRealTypeScopeAccess().getNumberExactNumberParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_4_0=ruleExactNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRealTypeScopeRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_4_0,
                    							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ExactNumber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:3371:4: ( (lv_number_5_0= ruleIntervallNumber ) )
                    {
                    // InternalApplicationConfiguration.g:3371:4: ( (lv_number_5_0= ruleIntervallNumber ) )
                    // InternalApplicationConfiguration.g:3372:5: (lv_number_5_0= ruleIntervallNumber )
                    {
                    // InternalApplicationConfiguration.g:3372:5: (lv_number_5_0= ruleIntervallNumber )
                    // InternalApplicationConfiguration.g:3373:6: lv_number_5_0= ruleIntervallNumber
                    {

                    						newCompositeNode(grammarAccess.getRealTypeScopeAccess().getNumberIntervallNumberParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_5_0=ruleIntervallNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRealTypeScopeRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_5_0,
                    							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.IntervallNumber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalApplicationConfiguration.g:3391:4: ( (lv_number_6_0= ruleRealEnumeration ) )
                    {
                    // InternalApplicationConfiguration.g:3391:4: ( (lv_number_6_0= ruleRealEnumeration ) )
                    // InternalApplicationConfiguration.g:3392:5: (lv_number_6_0= ruleRealEnumeration )
                    {
                    // InternalApplicationConfiguration.g:3392:5: (lv_number_6_0= ruleRealEnumeration )
                    // InternalApplicationConfiguration.g:3393:6: lv_number_6_0= ruleRealEnumeration
                    {

                    						newCompositeNode(grammarAccess.getRealTypeScopeAccess().getNumberRealEnumerationParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_6_0=ruleRealEnumeration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRealTypeScopeRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_6_0,
                    							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.RealEnumeration");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleRealTypeScope"


    // $ANTLR start "entryRuleStringTypeScope"
    // InternalApplicationConfiguration.g:3415:1: entryRuleStringTypeScope returns [EObject current=null] : iv_ruleStringTypeScope= ruleStringTypeScope EOF ;
    public final EObject entryRuleStringTypeScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTypeScope = null;


        try {
            // InternalApplicationConfiguration.g:3415:56: (iv_ruleStringTypeScope= ruleStringTypeScope EOF )
            // InternalApplicationConfiguration.g:3416:2: iv_ruleStringTypeScope= ruleStringTypeScope EOF
            {
             newCompositeNode(grammarAccess.getStringTypeScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringTypeScope=ruleStringTypeScope();

            state._fsp--;

             current =iv_ruleStringTypeScope; 
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
    // $ANTLR end "entryRuleStringTypeScope"


    // $ANTLR start "ruleStringTypeScope"
    // InternalApplicationConfiguration.g:3422:1: ruleStringTypeScope returns [EObject current=null] : (otherlv_0= '#' ( (lv_type_1_0= ruleStringReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleStringEnumeration ) ) ) ) ;
    public final EObject ruleStringTypeScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_setsNew_2_0=null;
        Token lv_setsSum_3_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_number_4_0 = null;

        EObject lv_number_5_0 = null;

        EObject lv_number_6_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:3428:2: ( (otherlv_0= '#' ( (lv_type_1_0= ruleStringReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleStringEnumeration ) ) ) ) )
            // InternalApplicationConfiguration.g:3429:2: (otherlv_0= '#' ( (lv_type_1_0= ruleStringReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleStringEnumeration ) ) ) )
            {
            // InternalApplicationConfiguration.g:3429:2: (otherlv_0= '#' ( (lv_type_1_0= ruleStringReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleStringEnumeration ) ) ) )
            // InternalApplicationConfiguration.g:3430:3: otherlv_0= '#' ( (lv_type_1_0= ruleStringReference ) ) ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) ) ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleStringEnumeration ) ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getStringTypeScopeAccess().getNumberSignKeyword_0());
            		
            // InternalApplicationConfiguration.g:3434:3: ( (lv_type_1_0= ruleStringReference ) )
            // InternalApplicationConfiguration.g:3435:4: (lv_type_1_0= ruleStringReference )
            {
            // InternalApplicationConfiguration.g:3435:4: (lv_type_1_0= ruleStringReference )
            // InternalApplicationConfiguration.g:3436:5: lv_type_1_0= ruleStringReference
            {

            					newCompositeNode(grammarAccess.getStringTypeScopeAccess().getTypeStringReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_type_1_0=ruleStringReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringTypeScopeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.StringReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApplicationConfiguration.g:3453:3: ( ( (lv_setsNew_2_0= '+=' ) ) | ( (lv_setsSum_3_0= '=' ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==35) ) {
                alt47=1;
            }
            else if ( (LA47_0==17) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalApplicationConfiguration.g:3454:4: ( (lv_setsNew_2_0= '+=' ) )
                    {
                    // InternalApplicationConfiguration.g:3454:4: ( (lv_setsNew_2_0= '+=' ) )
                    // InternalApplicationConfiguration.g:3455:5: (lv_setsNew_2_0= '+=' )
                    {
                    // InternalApplicationConfiguration.g:3455:5: (lv_setsNew_2_0= '+=' )
                    // InternalApplicationConfiguration.g:3456:6: lv_setsNew_2_0= '+='
                    {
                    lv_setsNew_2_0=(Token)match(input,35,FOLLOW_34); 

                    						newLeafNode(lv_setsNew_2_0, grammarAccess.getStringTypeScopeAccess().getSetsNewPlusSignEqualsSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringTypeScopeRule());
                    						}
                    						setWithLastConsumed(current, "setsNew", true, "+=");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:3469:4: ( (lv_setsSum_3_0= '=' ) )
                    {
                    // InternalApplicationConfiguration.g:3469:4: ( (lv_setsSum_3_0= '=' ) )
                    // InternalApplicationConfiguration.g:3470:5: (lv_setsSum_3_0= '=' )
                    {
                    // InternalApplicationConfiguration.g:3470:5: (lv_setsSum_3_0= '=' )
                    // InternalApplicationConfiguration.g:3471:6: lv_setsSum_3_0= '='
                    {
                    lv_setsSum_3_0=(Token)match(input,17,FOLLOW_34); 

                    						newLeafNode(lv_setsSum_3_0, grammarAccess.getStringTypeScopeAccess().getSetsSumEqualsSignKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringTypeScopeRule());
                    						}
                    						setWithLastConsumed(current, "setsSum", true, "=");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalApplicationConfiguration.g:3484:3: ( ( (lv_number_4_0= ruleExactNumber ) ) | ( (lv_number_5_0= ruleIntervallNumber ) ) | ( (lv_number_6_0= ruleStringEnumeration ) ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==EOF||(LA48_1>=19 && LA48_1<=20)) ) {
                    alt48=1;
                }
                else if ( (LA48_1==43) ) {
                    alt48=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                alt48=1;
                }
                break;
            case 18:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalApplicationConfiguration.g:3485:4: ( (lv_number_4_0= ruleExactNumber ) )
                    {
                    // InternalApplicationConfiguration.g:3485:4: ( (lv_number_4_0= ruleExactNumber ) )
                    // InternalApplicationConfiguration.g:3486:5: (lv_number_4_0= ruleExactNumber )
                    {
                    // InternalApplicationConfiguration.g:3486:5: (lv_number_4_0= ruleExactNumber )
                    // InternalApplicationConfiguration.g:3487:6: lv_number_4_0= ruleExactNumber
                    {

                    						newCompositeNode(grammarAccess.getStringTypeScopeAccess().getNumberExactNumberParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_4_0=ruleExactNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringTypeScopeRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_4_0,
                    							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.ExactNumber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:3505:4: ( (lv_number_5_0= ruleIntervallNumber ) )
                    {
                    // InternalApplicationConfiguration.g:3505:4: ( (lv_number_5_0= ruleIntervallNumber ) )
                    // InternalApplicationConfiguration.g:3506:5: (lv_number_5_0= ruleIntervallNumber )
                    {
                    // InternalApplicationConfiguration.g:3506:5: (lv_number_5_0= ruleIntervallNumber )
                    // InternalApplicationConfiguration.g:3507:6: lv_number_5_0= ruleIntervallNumber
                    {

                    						newCompositeNode(grammarAccess.getStringTypeScopeAccess().getNumberIntervallNumberParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_5_0=ruleIntervallNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringTypeScopeRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_5_0,
                    							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.IntervallNumber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalApplicationConfiguration.g:3525:4: ( (lv_number_6_0= ruleStringEnumeration ) )
                    {
                    // InternalApplicationConfiguration.g:3525:4: ( (lv_number_6_0= ruleStringEnumeration ) )
                    // InternalApplicationConfiguration.g:3526:5: (lv_number_6_0= ruleStringEnumeration )
                    {
                    // InternalApplicationConfiguration.g:3526:5: (lv_number_6_0= ruleStringEnumeration )
                    // InternalApplicationConfiguration.g:3527:6: lv_number_6_0= ruleStringEnumeration
                    {

                    						newCompositeNode(grammarAccess.getStringTypeScopeAccess().getNumberStringEnumerationParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_6_0=ruleStringEnumeration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringTypeScopeRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_6_0,
                    							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.StringEnumeration");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleStringTypeScope"


    // $ANTLR start "entryRuleClassReference"
    // InternalApplicationConfiguration.g:3549:1: entryRuleClassReference returns [EObject current=null] : iv_ruleClassReference= ruleClassReference EOF ;
    public final EObject entryRuleClassReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassReference = null;


        try {
            // InternalApplicationConfiguration.g:3549:55: (iv_ruleClassReference= ruleClassReference EOF )
            // InternalApplicationConfiguration.g:3550:2: iv_ruleClassReference= ruleClassReference EOF
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
    // InternalApplicationConfiguration.g:3556:1: ruleClassReference returns [EObject current=null] : (otherlv_0= '<' ( (lv_element_1_0= ruleMetamodelElement ) ) otherlv_2= '>' ) ;
    public final EObject ruleClassReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:3562:2: ( (otherlv_0= '<' ( (lv_element_1_0= ruleMetamodelElement ) ) otherlv_2= '>' ) )
            // InternalApplicationConfiguration.g:3563:2: (otherlv_0= '<' ( (lv_element_1_0= ruleMetamodelElement ) ) otherlv_2= '>' )
            {
            // InternalApplicationConfiguration.g:3563:2: (otherlv_0= '<' ( (lv_element_1_0= ruleMetamodelElement ) ) otherlv_2= '>' )
            // InternalApplicationConfiguration.g:3564:3: otherlv_0= '<' ( (lv_element_1_0= ruleMetamodelElement ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getClassReferenceAccess().getLessThanSignKeyword_0());
            		
            // InternalApplicationConfiguration.g:3568:3: ( (lv_element_1_0= ruleMetamodelElement ) )
            // InternalApplicationConfiguration.g:3569:4: (lv_element_1_0= ruleMetamodelElement )
            {
            // InternalApplicationConfiguration.g:3569:4: (lv_element_1_0= ruleMetamodelElement )
            // InternalApplicationConfiguration.g:3570:5: lv_element_1_0= ruleMetamodelElement
            {

            					newCompositeNode(grammarAccess.getClassReferenceAccess().getElementMetamodelElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
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

            otherlv_2=(Token)match(input,37,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:3595:1: entryRuleObjectReference returns [EObject current=null] : iv_ruleObjectReference= ruleObjectReference EOF ;
    public final EObject entryRuleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectReference = null;


        try {
            // InternalApplicationConfiguration.g:3595:56: (iv_ruleObjectReference= ruleObjectReference EOF )
            // InternalApplicationConfiguration.g:3596:2: iv_ruleObjectReference= ruleObjectReference EOF
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
    // InternalApplicationConfiguration.g:3602:1: ruleObjectReference returns [EObject current=null] : ( () otherlv_1= 'node' ) ;
    public final EObject ruleObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:3608:2: ( ( () otherlv_1= 'node' ) )
            // InternalApplicationConfiguration.g:3609:2: ( () otherlv_1= 'node' )
            {
            // InternalApplicationConfiguration.g:3609:2: ( () otherlv_1= 'node' )
            // InternalApplicationConfiguration.g:3610:3: () otherlv_1= 'node'
            {
            // InternalApplicationConfiguration.g:3610:3: ()
            // InternalApplicationConfiguration.g:3611:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectReferenceAccess().getObjectReferenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:3625:1: entryRuleIntegerReference returns [EObject current=null] : iv_ruleIntegerReference= ruleIntegerReference EOF ;
    public final EObject entryRuleIntegerReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerReference = null;


        try {
            // InternalApplicationConfiguration.g:3625:57: (iv_ruleIntegerReference= ruleIntegerReference EOF )
            // InternalApplicationConfiguration.g:3626:2: iv_ruleIntegerReference= ruleIntegerReference EOF
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
    // InternalApplicationConfiguration.g:3632:1: ruleIntegerReference returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntegerReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:3638:2: ( ( () otherlv_1= 'int' ) )
            // InternalApplicationConfiguration.g:3639:2: ( () otherlv_1= 'int' )
            {
            // InternalApplicationConfiguration.g:3639:2: ( () otherlv_1= 'int' )
            // InternalApplicationConfiguration.g:3640:3: () otherlv_1= 'int'
            {
            // InternalApplicationConfiguration.g:3640:3: ()
            // InternalApplicationConfiguration.g:3641:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerReferenceAccess().getIntegerScopeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:3655:1: entryRuleRealReference returns [EObject current=null] : iv_ruleRealReference= ruleRealReference EOF ;
    public final EObject entryRuleRealReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealReference = null;


        try {
            // InternalApplicationConfiguration.g:3655:54: (iv_ruleRealReference= ruleRealReference EOF )
            // InternalApplicationConfiguration.g:3656:2: iv_ruleRealReference= ruleRealReference EOF
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
    // InternalApplicationConfiguration.g:3662:1: ruleRealReference returns [EObject current=null] : ( () otherlv_1= 'real' ) ;
    public final EObject ruleRealReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:3668:2: ( ( () otherlv_1= 'real' ) )
            // InternalApplicationConfiguration.g:3669:2: ( () otherlv_1= 'real' )
            {
            // InternalApplicationConfiguration.g:3669:2: ( () otherlv_1= 'real' )
            // InternalApplicationConfiguration.g:3670:3: () otherlv_1= 'real'
            {
            // InternalApplicationConfiguration.g:3670:3: ()
            // InternalApplicationConfiguration.g:3671:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealReferenceAccess().getRealScopeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

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
    // InternalApplicationConfiguration.g:3685:1: entryRuleStringReference returns [EObject current=null] : iv_ruleStringReference= ruleStringReference EOF ;
    public final EObject entryRuleStringReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringReference = null;


        try {
            // InternalApplicationConfiguration.g:3685:56: (iv_ruleStringReference= ruleStringReference EOF )
            // InternalApplicationConfiguration.g:3686:2: iv_ruleStringReference= ruleStringReference EOF
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
    // InternalApplicationConfiguration.g:3692:1: ruleStringReference returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:3698:2: ( ( () otherlv_1= 'string' ) )
            // InternalApplicationConfiguration.g:3699:2: ( () otherlv_1= 'string' )
            {
            // InternalApplicationConfiguration.g:3699:2: ( () otherlv_1= 'string' )
            // InternalApplicationConfiguration.g:3700:3: () otherlv_1= 'string'
            {
            // InternalApplicationConfiguration.g:3700:3: ()
            // InternalApplicationConfiguration.g:3701:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringReferenceAccess().getStringScopeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExactNumber"
    // InternalApplicationConfiguration.g:3715:1: entryRuleExactNumber returns [EObject current=null] : iv_ruleExactNumber= ruleExactNumber EOF ;
    public final EObject entryRuleExactNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactNumber = null;


        try {
            // InternalApplicationConfiguration.g:3715:52: (iv_ruleExactNumber= ruleExactNumber EOF )
            // InternalApplicationConfiguration.g:3716:2: iv_ruleExactNumber= ruleExactNumber EOF
            {
             newCompositeNode(grammarAccess.getExactNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExactNumber=ruleExactNumber();

            state._fsp--;

             current =iv_ruleExactNumber; 
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
    // $ANTLR end "entryRuleExactNumber"


    // $ANTLR start "ruleExactNumber"
    // InternalApplicationConfiguration.g:3722:1: ruleExactNumber returns [EObject current=null] : ( ( (lv_exactNumber_0_0= RULE_INT ) ) | ( (lv_exactUnlimited_1_0= '*' ) ) ) ;
    public final EObject ruleExactNumber() throws RecognitionException {
        EObject current = null;

        Token lv_exactNumber_0_0=null;
        Token lv_exactUnlimited_1_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:3728:2: ( ( ( (lv_exactNumber_0_0= RULE_INT ) ) | ( (lv_exactUnlimited_1_0= '*' ) ) ) )
            // InternalApplicationConfiguration.g:3729:2: ( ( (lv_exactNumber_0_0= RULE_INT ) ) | ( (lv_exactUnlimited_1_0= '*' ) ) )
            {
            // InternalApplicationConfiguration.g:3729:2: ( ( (lv_exactNumber_0_0= RULE_INT ) ) | ( (lv_exactUnlimited_1_0= '*' ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_INT) ) {
                alt49=1;
            }
            else if ( (LA49_0==42) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalApplicationConfiguration.g:3730:3: ( (lv_exactNumber_0_0= RULE_INT ) )
                    {
                    // InternalApplicationConfiguration.g:3730:3: ( (lv_exactNumber_0_0= RULE_INT ) )
                    // InternalApplicationConfiguration.g:3731:4: (lv_exactNumber_0_0= RULE_INT )
                    {
                    // InternalApplicationConfiguration.g:3731:4: (lv_exactNumber_0_0= RULE_INT )
                    // InternalApplicationConfiguration.g:3732:5: lv_exactNumber_0_0= RULE_INT
                    {
                    lv_exactNumber_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_exactNumber_0_0, grammarAccess.getExactNumberAccess().getExactNumberINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExactNumberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"exactNumber",
                    						lv_exactNumber_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:3749:3: ( (lv_exactUnlimited_1_0= '*' ) )
                    {
                    // InternalApplicationConfiguration.g:3749:3: ( (lv_exactUnlimited_1_0= '*' ) )
                    // InternalApplicationConfiguration.g:3750:4: (lv_exactUnlimited_1_0= '*' )
                    {
                    // InternalApplicationConfiguration.g:3750:4: (lv_exactUnlimited_1_0= '*' )
                    // InternalApplicationConfiguration.g:3751:5: lv_exactUnlimited_1_0= '*'
                    {
                    lv_exactUnlimited_1_0=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_exactUnlimited_1_0, grammarAccess.getExactNumberAccess().getExactUnlimitedAsteriskKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExactNumberRule());
                    					}
                    					setWithLastConsumed(current, "exactUnlimited", true, "*");
                    				

                    }


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
    // $ANTLR end "ruleExactNumber"


    // $ANTLR start "entryRuleIntervallNumber"
    // InternalApplicationConfiguration.g:3767:1: entryRuleIntervallNumber returns [EObject current=null] : iv_ruleIntervallNumber= ruleIntervallNumber EOF ;
    public final EObject entryRuleIntervallNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntervallNumber = null;


        try {
            // InternalApplicationConfiguration.g:3767:56: (iv_ruleIntervallNumber= ruleIntervallNumber EOF )
            // InternalApplicationConfiguration.g:3768:2: iv_ruleIntervallNumber= ruleIntervallNumber EOF
            {
             newCompositeNode(grammarAccess.getIntervallNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntervallNumber=ruleIntervallNumber();

            state._fsp--;

             current =iv_ruleIntervallNumber; 
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
    // $ANTLR end "entryRuleIntervallNumber"


    // $ANTLR start "ruleIntervallNumber"
    // InternalApplicationConfiguration.g:3774:1: ruleIntervallNumber returns [EObject current=null] : ( ( (lv_min_0_0= RULE_INT ) ) otherlv_1= '..' ( ( (lv_maxNumber_2_0= RULE_INT ) ) | ( (lv_maxUnlimited_3_0= '*' ) ) ) ) ;
    public final EObject ruleIntervallNumber() throws RecognitionException {
        EObject current = null;

        Token lv_min_0_0=null;
        Token otherlv_1=null;
        Token lv_maxNumber_2_0=null;
        Token lv_maxUnlimited_3_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:3780:2: ( ( ( (lv_min_0_0= RULE_INT ) ) otherlv_1= '..' ( ( (lv_maxNumber_2_0= RULE_INT ) ) | ( (lv_maxUnlimited_3_0= '*' ) ) ) ) )
            // InternalApplicationConfiguration.g:3781:2: ( ( (lv_min_0_0= RULE_INT ) ) otherlv_1= '..' ( ( (lv_maxNumber_2_0= RULE_INT ) ) | ( (lv_maxUnlimited_3_0= '*' ) ) ) )
            {
            // InternalApplicationConfiguration.g:3781:2: ( ( (lv_min_0_0= RULE_INT ) ) otherlv_1= '..' ( ( (lv_maxNumber_2_0= RULE_INT ) ) | ( (lv_maxUnlimited_3_0= '*' ) ) ) )
            // InternalApplicationConfiguration.g:3782:3: ( (lv_min_0_0= RULE_INT ) ) otherlv_1= '..' ( ( (lv_maxNumber_2_0= RULE_INT ) ) | ( (lv_maxUnlimited_3_0= '*' ) ) )
            {
            // InternalApplicationConfiguration.g:3782:3: ( (lv_min_0_0= RULE_INT ) )
            // InternalApplicationConfiguration.g:3783:4: (lv_min_0_0= RULE_INT )
            {
            // InternalApplicationConfiguration.g:3783:4: (lv_min_0_0= RULE_INT )
            // InternalApplicationConfiguration.g:3784:5: lv_min_0_0= RULE_INT
            {
            lv_min_0_0=(Token)match(input,RULE_INT,FOLLOW_38); 

            					newLeafNode(lv_min_0_0, grammarAccess.getIntervallNumberAccess().getMinINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntervallNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervallNumberAccess().getFullStopFullStopKeyword_1());
            		
            // InternalApplicationConfiguration.g:3804:3: ( ( (lv_maxNumber_2_0= RULE_INT ) ) | ( (lv_maxUnlimited_3_0= '*' ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_INT) ) {
                alt50=1;
            }
            else if ( (LA50_0==42) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalApplicationConfiguration.g:3805:4: ( (lv_maxNumber_2_0= RULE_INT ) )
                    {
                    // InternalApplicationConfiguration.g:3805:4: ( (lv_maxNumber_2_0= RULE_INT ) )
                    // InternalApplicationConfiguration.g:3806:5: (lv_maxNumber_2_0= RULE_INT )
                    {
                    // InternalApplicationConfiguration.g:3806:5: (lv_maxNumber_2_0= RULE_INT )
                    // InternalApplicationConfiguration.g:3807:6: lv_maxNumber_2_0= RULE_INT
                    {
                    lv_maxNumber_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_maxNumber_2_0, grammarAccess.getIntervallNumberAccess().getMaxNumberINTTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntervallNumberRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxNumber",
                    							lv_maxNumber_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:3824:4: ( (lv_maxUnlimited_3_0= '*' ) )
                    {
                    // InternalApplicationConfiguration.g:3824:4: ( (lv_maxUnlimited_3_0= '*' ) )
                    // InternalApplicationConfiguration.g:3825:5: (lv_maxUnlimited_3_0= '*' )
                    {
                    // InternalApplicationConfiguration.g:3825:5: (lv_maxUnlimited_3_0= '*' )
                    // InternalApplicationConfiguration.g:3826:6: lv_maxUnlimited_3_0= '*'
                    {
                    lv_maxUnlimited_3_0=(Token)match(input,42,FOLLOW_2); 

                    						newLeafNode(lv_maxUnlimited_3_0, grammarAccess.getIntervallNumberAccess().getMaxUnlimitedAsteriskKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntervallNumberRule());
                    						}
                    						setWithLastConsumed(current, "maxUnlimited", true, "*");
                    					

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
    // $ANTLR end "ruleIntervallNumber"


    // $ANTLR start "entryRuleIntEnumberation"
    // InternalApplicationConfiguration.g:3843:1: entryRuleIntEnumberation returns [EObject current=null] : iv_ruleIntEnumberation= ruleIntEnumberation EOF ;
    public final EObject entryRuleIntEnumberation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntEnumberation = null;


        try {
            // InternalApplicationConfiguration.g:3843:56: (iv_ruleIntEnumberation= ruleIntEnumberation EOF )
            // InternalApplicationConfiguration.g:3844:2: iv_ruleIntEnumberation= ruleIntEnumberation EOF
            {
             newCompositeNode(grammarAccess.getIntEnumberationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntEnumberation=ruleIntEnumberation();

            state._fsp--;

             current =iv_ruleIntEnumberation; 
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
    // $ANTLR end "entryRuleIntEnumberation"


    // $ANTLR start "ruleIntEnumberation"
    // InternalApplicationConfiguration.g:3850:1: ruleIntEnumberation returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_entry_2_0= ruleINTLiteral ) ) (otherlv_3= ',' ( (lv_entry_4_0= ruleINTLiteral ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleIntEnumberation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_entry_2_0 = null;

        AntlrDatatypeRuleToken lv_entry_4_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:3856:2: ( ( () otherlv_1= '{' ( ( (lv_entry_2_0= ruleINTLiteral ) ) (otherlv_3= ',' ( (lv_entry_4_0= ruleINTLiteral ) ) )* )? otherlv_5= '}' ) )
            // InternalApplicationConfiguration.g:3857:2: ( () otherlv_1= '{' ( ( (lv_entry_2_0= ruleINTLiteral ) ) (otherlv_3= ',' ( (lv_entry_4_0= ruleINTLiteral ) ) )* )? otherlv_5= '}' )
            {
            // InternalApplicationConfiguration.g:3857:2: ( () otherlv_1= '{' ( ( (lv_entry_2_0= ruleINTLiteral ) ) (otherlv_3= ',' ( (lv_entry_4_0= ruleINTLiteral ) ) )* )? otherlv_5= '}' )
            // InternalApplicationConfiguration.g:3858:3: () otherlv_1= '{' ( ( (lv_entry_2_0= ruleINTLiteral ) ) (otherlv_3= ',' ( (lv_entry_4_0= ruleINTLiteral ) ) )* )? otherlv_5= '}'
            {
            // InternalApplicationConfiguration.g:3858:3: ()
            // InternalApplicationConfiguration.g:3859:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntEnumberationAccess().getIntEnumberationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getIntEnumberationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalApplicationConfiguration.g:3869:3: ( ( (lv_entry_2_0= ruleINTLiteral ) ) (otherlv_3= ',' ( (lv_entry_4_0= ruleINTLiteral ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_INT||LA52_0==12) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalApplicationConfiguration.g:3870:4: ( (lv_entry_2_0= ruleINTLiteral ) ) (otherlv_3= ',' ( (lv_entry_4_0= ruleINTLiteral ) ) )*
                    {
                    // InternalApplicationConfiguration.g:3870:4: ( (lv_entry_2_0= ruleINTLiteral ) )
                    // InternalApplicationConfiguration.g:3871:5: (lv_entry_2_0= ruleINTLiteral )
                    {
                    // InternalApplicationConfiguration.g:3871:5: (lv_entry_2_0= ruleINTLiteral )
                    // InternalApplicationConfiguration.g:3872:6: lv_entry_2_0= ruleINTLiteral
                    {

                    						newCompositeNode(grammarAccess.getIntEnumberationAccess().getEntryINTLiteralParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_entry_2_0=ruleINTLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntEnumberationRule());
                    						}
                    						add(
                    							current,
                    							"entry",
                    							lv_entry_2_0,
                    							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.INTLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalApplicationConfiguration.g:3889:4: (otherlv_3= ',' ( (lv_entry_4_0= ruleINTLiteral ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==19) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:3890:5: otherlv_3= ',' ( (lv_entry_4_0= ruleINTLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_23); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getIntEnumberationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalApplicationConfiguration.g:3894:5: ( (lv_entry_4_0= ruleINTLiteral ) )
                    	    // InternalApplicationConfiguration.g:3895:6: (lv_entry_4_0= ruleINTLiteral )
                    	    {
                    	    // InternalApplicationConfiguration.g:3895:6: (lv_entry_4_0= ruleINTLiteral )
                    	    // InternalApplicationConfiguration.g:3896:7: lv_entry_4_0= ruleINTLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getIntEnumberationAccess().getEntryINTLiteralParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_entry_4_0=ruleINTLiteral();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIntEnumberationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entry",
                    	    								lv_entry_4_0,
                    	    								"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.INTLiteral");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIntEnumberationAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleIntEnumberation"


    // $ANTLR start "entryRuleRealEnumeration"
    // InternalApplicationConfiguration.g:3923:1: entryRuleRealEnumeration returns [EObject current=null] : iv_ruleRealEnumeration= ruleRealEnumeration EOF ;
    public final EObject entryRuleRealEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealEnumeration = null;


        try {
            // InternalApplicationConfiguration.g:3923:56: (iv_ruleRealEnumeration= ruleRealEnumeration EOF )
            // InternalApplicationConfiguration.g:3924:2: iv_ruleRealEnumeration= ruleRealEnumeration EOF
            {
             newCompositeNode(grammarAccess.getRealEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealEnumeration=ruleRealEnumeration();

            state._fsp--;

             current =iv_ruleRealEnumeration; 
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
    // $ANTLR end "entryRuleRealEnumeration"


    // $ANTLR start "ruleRealEnumeration"
    // InternalApplicationConfiguration.g:3930:1: ruleRealEnumeration returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_entry_2_0= ruleREALLiteral ) ) (otherlv_3= ',' ( (lv_entry_4_0= ruleREALLiteral ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleRealEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_entry_2_0 = null;

        AntlrDatatypeRuleToken lv_entry_4_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:3936:2: ( ( () otherlv_1= '{' ( ( (lv_entry_2_0= ruleREALLiteral ) ) (otherlv_3= ',' ( (lv_entry_4_0= ruleREALLiteral ) ) )* )? otherlv_5= '}' ) )
            // InternalApplicationConfiguration.g:3937:2: ( () otherlv_1= '{' ( ( (lv_entry_2_0= ruleREALLiteral ) ) (otherlv_3= ',' ( (lv_entry_4_0= ruleREALLiteral ) ) )* )? otherlv_5= '}' )
            {
            // InternalApplicationConfiguration.g:3937:2: ( () otherlv_1= '{' ( ( (lv_entry_2_0= ruleREALLiteral ) ) (otherlv_3= ',' ( (lv_entry_4_0= ruleREALLiteral ) ) )* )? otherlv_5= '}' )
            // InternalApplicationConfiguration.g:3938:3: () otherlv_1= '{' ( ( (lv_entry_2_0= ruleREALLiteral ) ) (otherlv_3= ',' ( (lv_entry_4_0= ruleREALLiteral ) ) )* )? otherlv_5= '}'
            {
            // InternalApplicationConfiguration.g:3938:3: ()
            // InternalApplicationConfiguration.g:3939:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealEnumerationAccess().getRealEnumerationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getRealEnumerationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalApplicationConfiguration.g:3949:3: ( ( (lv_entry_2_0= ruleREALLiteral ) ) (otherlv_3= ',' ( (lv_entry_4_0= ruleREALLiteral ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_INT||LA54_0==12) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalApplicationConfiguration.g:3950:4: ( (lv_entry_2_0= ruleREALLiteral ) ) (otherlv_3= ',' ( (lv_entry_4_0= ruleREALLiteral ) ) )*
                    {
                    // InternalApplicationConfiguration.g:3950:4: ( (lv_entry_2_0= ruleREALLiteral ) )
                    // InternalApplicationConfiguration.g:3951:5: (lv_entry_2_0= ruleREALLiteral )
                    {
                    // InternalApplicationConfiguration.g:3951:5: (lv_entry_2_0= ruleREALLiteral )
                    // InternalApplicationConfiguration.g:3952:6: lv_entry_2_0= ruleREALLiteral
                    {

                    						newCompositeNode(grammarAccess.getRealEnumerationAccess().getEntryREALLiteralParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_entry_2_0=ruleREALLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRealEnumerationRule());
                    						}
                    						add(
                    							current,
                    							"entry",
                    							lv_entry_2_0,
                    							"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.REALLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalApplicationConfiguration.g:3969:4: (otherlv_3= ',' ( (lv_entry_4_0= ruleREALLiteral ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==19) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:3970:5: otherlv_3= ',' ( (lv_entry_4_0= ruleREALLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_23); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getRealEnumerationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalApplicationConfiguration.g:3974:5: ( (lv_entry_4_0= ruleREALLiteral ) )
                    	    // InternalApplicationConfiguration.g:3975:6: (lv_entry_4_0= ruleREALLiteral )
                    	    {
                    	    // InternalApplicationConfiguration.g:3975:6: (lv_entry_4_0= ruleREALLiteral )
                    	    // InternalApplicationConfiguration.g:3976:7: lv_entry_4_0= ruleREALLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getRealEnumerationAccess().getEntryREALLiteralParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_entry_4_0=ruleREALLiteral();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRealEnumerationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entry",
                    	    								lv_entry_4_0,
                    	    								"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.REALLiteral");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRealEnumerationAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleRealEnumeration"


    // $ANTLR start "entryRuleStringEnumeration"
    // InternalApplicationConfiguration.g:4003:1: entryRuleStringEnumeration returns [EObject current=null] : iv_ruleStringEnumeration= ruleStringEnumeration EOF ;
    public final EObject entryRuleStringEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringEnumeration = null;


        try {
            // InternalApplicationConfiguration.g:4003:58: (iv_ruleStringEnumeration= ruleStringEnumeration EOF )
            // InternalApplicationConfiguration.g:4004:2: iv_ruleStringEnumeration= ruleStringEnumeration EOF
            {
             newCompositeNode(grammarAccess.getStringEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringEnumeration=ruleStringEnumeration();

            state._fsp--;

             current =iv_ruleStringEnumeration; 
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
    // $ANTLR end "entryRuleStringEnumeration"


    // $ANTLR start "ruleStringEnumeration"
    // InternalApplicationConfiguration.g:4010:1: ruleStringEnumeration returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_entry_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_entry_4_0= RULE_STRING ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleStringEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_entry_2_0=null;
        Token otherlv_3=null;
        Token lv_entry_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:4016:2: ( ( () otherlv_1= '{' ( ( (lv_entry_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_entry_4_0= RULE_STRING ) ) )* )? otherlv_5= '}' ) )
            // InternalApplicationConfiguration.g:4017:2: ( () otherlv_1= '{' ( ( (lv_entry_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_entry_4_0= RULE_STRING ) ) )* )? otherlv_5= '}' )
            {
            // InternalApplicationConfiguration.g:4017:2: ( () otherlv_1= '{' ( ( (lv_entry_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_entry_4_0= RULE_STRING ) ) )* )? otherlv_5= '}' )
            // InternalApplicationConfiguration.g:4018:3: () otherlv_1= '{' ( ( (lv_entry_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_entry_4_0= RULE_STRING ) ) )* )? otherlv_5= '}'
            {
            // InternalApplicationConfiguration.g:4018:3: ()
            // InternalApplicationConfiguration.g:4019:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringEnumerationAccess().getStringEnumerationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getStringEnumerationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalApplicationConfiguration.g:4029:3: ( ( (lv_entry_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_entry_4_0= RULE_STRING ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_STRING) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalApplicationConfiguration.g:4030:4: ( (lv_entry_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_entry_4_0= RULE_STRING ) ) )*
                    {
                    // InternalApplicationConfiguration.g:4030:4: ( (lv_entry_2_0= RULE_STRING ) )
                    // InternalApplicationConfiguration.g:4031:5: (lv_entry_2_0= RULE_STRING )
                    {
                    // InternalApplicationConfiguration.g:4031:5: (lv_entry_2_0= RULE_STRING )
                    // InternalApplicationConfiguration.g:4032:6: lv_entry_2_0= RULE_STRING
                    {
                    lv_entry_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_entry_2_0, grammarAccess.getStringEnumerationAccess().getEntrySTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringEnumerationRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"entry",
                    							lv_entry_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalApplicationConfiguration.g:4048:4: (otherlv_3= ',' ( (lv_entry_4_0= RULE_STRING ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==19) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalApplicationConfiguration.g:4049:5: otherlv_3= ',' ( (lv_entry_4_0= RULE_STRING ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_10); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getStringEnumerationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalApplicationConfiguration.g:4053:5: ( (lv_entry_4_0= RULE_STRING ) )
                    	    // InternalApplicationConfiguration.g:4054:6: (lv_entry_4_0= RULE_STRING )
                    	    {
                    	    // InternalApplicationConfiguration.g:4054:6: (lv_entry_4_0= RULE_STRING )
                    	    // InternalApplicationConfiguration.g:4055:7: lv_entry_4_0= RULE_STRING
                    	    {
                    	    lv_entry_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    	    							newLeafNode(lv_entry_4_0, grammarAccess.getStringEnumerationAccess().getEntrySTRINGTerminalRuleCall_2_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStringEnumerationRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"entry",
                    	    								lv_entry_4_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStringEnumerationAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleStringEnumeration"


    // $ANTLR start "entryRuleScopeDeclaration"
    // InternalApplicationConfiguration.g:4081:1: entryRuleScopeDeclaration returns [EObject current=null] : iv_ruleScopeDeclaration= ruleScopeDeclaration EOF ;
    public final EObject entryRuleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeDeclaration = null;


        try {
            // InternalApplicationConfiguration.g:4081:57: (iv_ruleScopeDeclaration= ruleScopeDeclaration EOF )
            // InternalApplicationConfiguration.g:4082:2: iv_ruleScopeDeclaration= ruleScopeDeclaration EOF
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
    // InternalApplicationConfiguration.g:4088:1: ruleScopeDeclaration returns [EObject current=null] : (otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleScopeSpecification ) ) ) ;
    public final EObject ruleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_specification_2_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:4094:2: ( (otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleScopeSpecification ) ) ) )
            // InternalApplicationConfiguration.g:4095:2: (otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleScopeSpecification ) ) )
            {
            // InternalApplicationConfiguration.g:4095:2: (otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleScopeSpecification ) ) )
            // InternalApplicationConfiguration.g:4096:3: otherlv_0= 'scope' ( (lv_name_1_0= RULE_ID ) ) ( (lv_specification_2_0= ruleScopeSpecification ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getScopeDeclarationAccess().getScopeKeyword_0());
            		
            // InternalApplicationConfiguration.g:4100:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:4101:4: (lv_name_1_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:4101:4: (lv_name_1_0= RULE_ID )
            // InternalApplicationConfiguration.g:4102:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            // InternalApplicationConfiguration.g:4118:3: ( (lv_specification_2_0= ruleScopeSpecification ) )
            // InternalApplicationConfiguration.g:4119:4: (lv_specification_2_0= ruleScopeSpecification )
            {
            // InternalApplicationConfiguration.g:4119:4: (lv_specification_2_0= ruleScopeSpecification )
            // InternalApplicationConfiguration.g:4120:5: lv_specification_2_0= ruleScopeSpecification
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
    // InternalApplicationConfiguration.g:4141:1: entryRuleScopeReference returns [EObject current=null] : iv_ruleScopeReference= ruleScopeReference EOF ;
    public final EObject entryRuleScopeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeReference = null;


        try {
            // InternalApplicationConfiguration.g:4141:55: (iv_ruleScopeReference= ruleScopeReference EOF )
            // InternalApplicationConfiguration.g:4142:2: iv_ruleScopeReference= ruleScopeReference EOF
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
    // InternalApplicationConfiguration.g:4148:1: ruleScopeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleScopeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:4154:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalApplicationConfiguration.g:4155:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:4155:2: ( (otherlv_0= RULE_ID ) )
            // InternalApplicationConfiguration.g:4156:3: (otherlv_0= RULE_ID )
            {
            // InternalApplicationConfiguration.g:4156:3: (otherlv_0= RULE_ID )
            // InternalApplicationConfiguration.g:4157:4: otherlv_0= RULE_ID
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
    // InternalApplicationConfiguration.g:4171:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalApplicationConfiguration.g:4171:46: (iv_ruleScope= ruleScope EOF )
            // InternalApplicationConfiguration.g:4172:2: iv_ruleScope= ruleScope EOF
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
    // InternalApplicationConfiguration.g:4178:1: ruleScope returns [EObject current=null] : (this_ScopeSpecification_0= ruleScopeSpecification | this_ScopeReference_1= ruleScopeReference ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        EObject this_ScopeSpecification_0 = null;

        EObject this_ScopeReference_1 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:4184:2: ( (this_ScopeSpecification_0= ruleScopeSpecification | this_ScopeReference_1= ruleScopeReference ) )
            // InternalApplicationConfiguration.g:4185:2: (this_ScopeSpecification_0= ruleScopeSpecification | this_ScopeReference_1= ruleScopeReference )
            {
            // InternalApplicationConfiguration.g:4185:2: (this_ScopeSpecification_0= ruleScopeSpecification | this_ScopeReference_1= ruleScopeReference )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==18) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_ID) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalApplicationConfiguration.g:4186:3: this_ScopeSpecification_0= ruleScopeSpecification
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
                    // InternalApplicationConfiguration.g:4195:3: this_ScopeReference_1= ruleScopeReference
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
    // InternalApplicationConfiguration.g:4207:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalApplicationConfiguration.g:4207:45: (iv_ruleTask= ruleTask EOF )
            // InternalApplicationConfiguration.g:4208:2: iv_ruleTask= ruleTask EOF
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
    // InternalApplicationConfiguration.g:4214:1: ruleTask returns [EObject current=null] : this_GenerationTask_0= ruleGenerationTask ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        EObject this_GenerationTask_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:4220:2: (this_GenerationTask_0= ruleGenerationTask )
            // InternalApplicationConfiguration.g:4221:2: this_GenerationTask_0= ruleGenerationTask
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
    // InternalApplicationConfiguration.g:4232:1: entryRuleGenerationTask returns [EObject current=null] : iv_ruleGenerationTask= ruleGenerationTask EOF ;
    public final EObject entryRuleGenerationTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerationTask = null;


        try {
            // InternalApplicationConfiguration.g:4232:55: (iv_ruleGenerationTask= ruleGenerationTask EOF )
            // InternalApplicationConfiguration.g:4233:2: iv_ruleGenerationTask= ruleGenerationTask EOF
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
    // InternalApplicationConfiguration.g:4239:1: ruleGenerationTask returns [EObject current=null] : (otherlv_0= 'generate' () otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) ) ) ) )* ) ) ) otherlv_43= '}' ) ;
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
        Token lv_numberSpecified_19_0=null;
        Token otherlv_20=null;
        Token lv_number_21_0=null;
        Token lv_runSpecified_22_0=null;
        Token otherlv_23=null;
        Token lv_runs_24_0=null;
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
        Token otherlv_41=null;
        Token otherlv_43=null;
        EObject lv_metamodel_6_0 = null;

        EObject lv_partialModel_9_0 = null;

        EObject lv_patterns_12_0 = null;

        EObject lv_objectives_15_0 = null;

        EObject lv_scope_18_0 = null;

        Enumerator lv_solver_27_0 = null;

        EObject lv_config_30_0 = null;

        EObject lv_debugFolder_33_0 = null;

        EObject lv_targetLogFile_36_0 = null;

        EObject lv_targetStatisticsFile_39_0 = null;

        EObject lv_tagetFolder_42_0 = null;



        	enterRule();

        try {
            // InternalApplicationConfiguration.g:4245:2: ( (otherlv_0= 'generate' () otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) ) ) ) )* ) ) ) otherlv_43= '}' ) )
            // InternalApplicationConfiguration.g:4246:2: (otherlv_0= 'generate' () otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) ) ) ) )* ) ) ) otherlv_43= '}' )
            {
            // InternalApplicationConfiguration.g:4246:2: (otherlv_0= 'generate' () otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) ) ) ) )* ) ) ) otherlv_43= '}' )
            // InternalApplicationConfiguration.g:4247:3: otherlv_0= 'generate' () otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) ) ) ) )* ) ) ) otherlv_43= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getGenerationTaskAccess().getGenerateKeyword_0());
            		
            // InternalApplicationConfiguration.g:4251:3: ()
            // InternalApplicationConfiguration.g:4252:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenerationTaskAccess().getGenerationTaskAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,18,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getGenerationTaskAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalApplicationConfiguration.g:4262:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) ) ) ) )* ) ) )
            // InternalApplicationConfiguration.g:4263:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) ) ) ) )* ) )
            {
            // InternalApplicationConfiguration.g:4263:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) ) ) ) )* ) )
            // InternalApplicationConfiguration.g:4264:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());
            				
            // InternalApplicationConfiguration.g:4267:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) ) ) ) )* )
            // InternalApplicationConfiguration.g:4268:6: ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) ) ) ) )*
            {
            // InternalApplicationConfiguration.g:4268:6: ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) ) ) ) )*
            loop58:
            do {
                int alt58=14;
                alt58 = dfa58.predict(input);
                switch (alt58) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:4269:4: ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:4269:4: ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4270:5: {...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalApplicationConfiguration.g:4270:111: ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4271:6: ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalApplicationConfiguration.g:4274:9: ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) )
            	    // InternalApplicationConfiguration.g:4274:10: {...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:4274:19: (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) )
            	    // InternalApplicationConfiguration.g:4274:20: otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) )
            	    {
            	    otherlv_4=(Token)match(input,24,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getGenerationTaskAccess().getMetamodelKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,17,FOLLOW_42); 

            	    									newLeafNode(otherlv_5, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_0_1());
            	    								
            	    // InternalApplicationConfiguration.g:4282:9: ( (lv_metamodel_6_0= ruleMetamodel ) )
            	    // InternalApplicationConfiguration.g:4283:10: (lv_metamodel_6_0= ruleMetamodel )
            	    {
            	    // InternalApplicationConfiguration.g:4283:10: (lv_metamodel_6_0= ruleMetamodel )
            	    // InternalApplicationConfiguration.g:4284:11: lv_metamodel_6_0= ruleMetamodel
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getMetamodelMetamodelParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalApplicationConfiguration.g:4307:4: ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:4307:4: ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4308:5: {...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalApplicationConfiguration.g:4308:111: ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4309:6: ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalApplicationConfiguration.g:4312:9: ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) )
            	    // InternalApplicationConfiguration.g:4312:10: {...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:4312:19: (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) )
            	    // InternalApplicationConfiguration.g:4312:20: otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) )
            	    {
            	    otherlv_7=(Token)match(input,46,FOLLOW_12); 

            	    									newLeafNode(otherlv_7, grammarAccess.getGenerationTaskAccess().getPartialModelKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,17,FOLLOW_42); 

            	    									newLeafNode(otherlv_8, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_1_1());
            	    								
            	    // InternalApplicationConfiguration.g:4320:9: ( (lv_partialModel_9_0= rulePartialModel ) )
            	    // InternalApplicationConfiguration.g:4321:10: (lv_partialModel_9_0= rulePartialModel )
            	    {
            	    // InternalApplicationConfiguration.g:4321:10: (lv_partialModel_9_0= rulePartialModel )
            	    // InternalApplicationConfiguration.g:4322:11: lv_partialModel_9_0= rulePartialModel
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getPartialModelPartialModelParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalApplicationConfiguration.g:4345:4: ({...}? => ( ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:4345:4: ({...}? => ( ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4346:5: {...}? => ( ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalApplicationConfiguration.g:4346:111: ( ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4347:6: ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalApplicationConfiguration.g:4350:9: ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) )
            	    // InternalApplicationConfiguration.g:4350:10: {...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:4350:19: (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) )
            	    // InternalApplicationConfiguration.g:4350:20: otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) )
            	    {
            	    otherlv_10=(Token)match(input,27,FOLLOW_12); 

            	    									newLeafNode(otherlv_10, grammarAccess.getGenerationTaskAccess().getConstraintsKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,17,FOLLOW_42); 

            	    									newLeafNode(otherlv_11, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_2_1());
            	    								
            	    // InternalApplicationConfiguration.g:4358:9: ( (lv_patterns_12_0= ruleGraphPattern ) )
            	    // InternalApplicationConfiguration.g:4359:10: (lv_patterns_12_0= ruleGraphPattern )
            	    {
            	    // InternalApplicationConfiguration.g:4359:10: (lv_patterns_12_0= ruleGraphPattern )
            	    // InternalApplicationConfiguration.g:4360:11: lv_patterns_12_0= ruleGraphPattern
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getPatternsGraphPatternParserRuleCall_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalApplicationConfiguration.g:4383:4: ({...}? => ( ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:4383:4: ({...}? => ( ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4384:5: {...}? => ( ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalApplicationConfiguration.g:4384:111: ( ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4385:6: ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalApplicationConfiguration.g:4388:9: ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) )
            	    // InternalApplicationConfiguration.g:4388:10: {...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:4388:19: (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) )
            	    // InternalApplicationConfiguration.g:4388:20: otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) )
            	    {
            	    otherlv_13=(Token)match(input,29,FOLLOW_12); 

            	    									newLeafNode(otherlv_13, grammarAccess.getGenerationTaskAccess().getObjectivesKeyword_3_3_0());
            	    								
            	    otherlv_14=(Token)match(input,17,FOLLOW_42); 

            	    									newLeafNode(otherlv_14, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_3_1());
            	    								
            	    // InternalApplicationConfiguration.g:4396:9: ( (lv_objectives_15_0= ruleObjective ) )
            	    // InternalApplicationConfiguration.g:4397:10: (lv_objectives_15_0= ruleObjective )
            	    {
            	    // InternalApplicationConfiguration.g:4397:10: (lv_objectives_15_0= ruleObjective )
            	    // InternalApplicationConfiguration.g:4398:11: lv_objectives_15_0= ruleObjective
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getObjectivesObjectiveParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
            	    lv_objectives_15_0=ruleObjective();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGenerationTaskRule());
            	    											}
            	    											set(
            	    												current,
            	    												"objectives",
            	    												lv_objectives_15_0,
            	    												"hu.bme.mit.inf.dslreasoner.application.ApplicationConfiguration.Objective");
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
            	    // InternalApplicationConfiguration.g:4421:4: ({...}? => ( ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:4421:4: ({...}? => ( ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4422:5: {...}? => ( ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalApplicationConfiguration.g:4422:111: ( ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4423:6: ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalApplicationConfiguration.g:4426:9: ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) )
            	    // InternalApplicationConfiguration.g:4426:10: {...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:4426:19: (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) )
            	    // InternalApplicationConfiguration.g:4426:20: otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) )
            	    {
            	    otherlv_16=(Token)match(input,44,FOLLOW_12); 

            	    									newLeafNode(otherlv_16, grammarAccess.getGenerationTaskAccess().getScopeKeyword_3_4_0());
            	    								
            	    otherlv_17=(Token)match(input,17,FOLLOW_42); 

            	    									newLeafNode(otherlv_17, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_4_1());
            	    								
            	    // InternalApplicationConfiguration.g:4434:9: ( (lv_scope_18_0= ruleScope ) )
            	    // InternalApplicationConfiguration.g:4435:10: (lv_scope_18_0= ruleScope )
            	    {
            	    // InternalApplicationConfiguration.g:4435:10: (lv_scope_18_0= ruleScope )
            	    // InternalApplicationConfiguration.g:4436:11: lv_scope_18_0= ruleScope
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getScopeScopeParserRuleCall_3_4_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
            	    lv_scope_18_0=ruleScope();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGenerationTaskRule());
            	    											}
            	    											set(
            	    												current,
            	    												"scope",
            	    												lv_scope_18_0,
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
            	case 6 :
            	    // InternalApplicationConfiguration.g:4459:4: ({...}? => ( ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:4459:4: ({...}? => ( ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4460:5: {...}? => ( ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalApplicationConfiguration.g:4460:111: ( ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4461:6: ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalApplicationConfiguration.g:4464:9: ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) )
            	    // InternalApplicationConfiguration.g:4464:10: {...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:4464:19: ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) )
            	    // InternalApplicationConfiguration.g:4464:20: ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) )
            	    {
            	    // InternalApplicationConfiguration.g:4464:20: ( (lv_numberSpecified_19_0= 'number' ) )
            	    // InternalApplicationConfiguration.g:4465:10: (lv_numberSpecified_19_0= 'number' )
            	    {
            	    // InternalApplicationConfiguration.g:4465:10: (lv_numberSpecified_19_0= 'number' )
            	    // InternalApplicationConfiguration.g:4466:11: lv_numberSpecified_19_0= 'number'
            	    {
            	    lv_numberSpecified_19_0=(Token)match(input,47,FOLLOW_12); 

            	    											newLeafNode(lv_numberSpecified_19_0, grammarAccess.getGenerationTaskAccess().getNumberSpecifiedNumberKeyword_3_5_0_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getGenerationTaskRule());
            	    											}
            	    											setWithLastConsumed(current, "numberSpecified", true, "number");
            	    										

            	    }


            	    }

            	    otherlv_20=(Token)match(input,17,FOLLOW_7); 

            	    									newLeafNode(otherlv_20, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_5_1());
            	    								
            	    // InternalApplicationConfiguration.g:4482:9: ( (lv_number_21_0= RULE_INT ) )
            	    // InternalApplicationConfiguration.g:4483:10: (lv_number_21_0= RULE_INT )
            	    {
            	    // InternalApplicationConfiguration.g:4483:10: (lv_number_21_0= RULE_INT )
            	    // InternalApplicationConfiguration.g:4484:11: lv_number_21_0= RULE_INT
            	    {
            	    lv_number_21_0=(Token)match(input,RULE_INT,FOLLOW_41); 

            	    											newLeafNode(lv_number_21_0, grammarAccess.getGenerationTaskAccess().getNumberINTTerminalRuleCall_3_5_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getGenerationTaskRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"number",
            	    												lv_number_21_0,
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
            	    // InternalApplicationConfiguration.g:4506:4: ({...}? => ( ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:4506:4: ({...}? => ( ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4507:5: {...}? => ( ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalApplicationConfiguration.g:4507:111: ( ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4508:6: ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalApplicationConfiguration.g:4511:9: ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) )
            	    // InternalApplicationConfiguration.g:4511:10: {...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:4511:19: ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) )
            	    // InternalApplicationConfiguration.g:4511:20: ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) )
            	    {
            	    // InternalApplicationConfiguration.g:4511:20: ( (lv_runSpecified_22_0= 'runs' ) )
            	    // InternalApplicationConfiguration.g:4512:10: (lv_runSpecified_22_0= 'runs' )
            	    {
            	    // InternalApplicationConfiguration.g:4512:10: (lv_runSpecified_22_0= 'runs' )
            	    // InternalApplicationConfiguration.g:4513:11: lv_runSpecified_22_0= 'runs'
            	    {
            	    lv_runSpecified_22_0=(Token)match(input,48,FOLLOW_12); 

            	    											newLeafNode(lv_runSpecified_22_0, grammarAccess.getGenerationTaskAccess().getRunSpecifiedRunsKeyword_3_6_0_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getGenerationTaskRule());
            	    											}
            	    											setWithLastConsumed(current, "runSpecified", true, "runs");
            	    										

            	    }


            	    }

            	    otherlv_23=(Token)match(input,17,FOLLOW_7); 

            	    									newLeafNode(otherlv_23, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_6_1());
            	    								
            	    // InternalApplicationConfiguration.g:4529:9: ( (lv_runs_24_0= RULE_INT ) )
            	    // InternalApplicationConfiguration.g:4530:10: (lv_runs_24_0= RULE_INT )
            	    {
            	    // InternalApplicationConfiguration.g:4530:10: (lv_runs_24_0= RULE_INT )
            	    // InternalApplicationConfiguration.g:4531:11: lv_runs_24_0= RULE_INT
            	    {
            	    lv_runs_24_0=(Token)match(input,RULE_INT,FOLLOW_41); 

            	    											newLeafNode(lv_runs_24_0, grammarAccess.getGenerationTaskAccess().getRunsINTTerminalRuleCall_3_6_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getGenerationTaskRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"runs",
            	    												lv_runs_24_0,
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
            	case 8 :
            	    // InternalApplicationConfiguration.g:4553:4: ({...}? => ( ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:4553:4: ({...}? => ( ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4554:5: {...}? => ( ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalApplicationConfiguration.g:4554:111: ( ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4555:6: ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalApplicationConfiguration.g:4558:9: ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) )
            	    // InternalApplicationConfiguration.g:4558:10: {...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:4558:19: (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) )
            	    // InternalApplicationConfiguration.g:4558:20: otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) )
            	    {
            	    otherlv_25=(Token)match(input,49,FOLLOW_12); 

            	    									newLeafNode(otherlv_25, grammarAccess.getGenerationTaskAccess().getSolverKeyword_3_7_0());
            	    								
            	    otherlv_26=(Token)match(input,17,FOLLOW_43); 

            	    									newLeafNode(otherlv_26, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_7_1());
            	    								
            	    // InternalApplicationConfiguration.g:4566:9: ( (lv_solver_27_0= ruleSolver ) )
            	    // InternalApplicationConfiguration.g:4567:10: (lv_solver_27_0= ruleSolver )
            	    {
            	    // InternalApplicationConfiguration.g:4567:10: (lv_solver_27_0= ruleSolver )
            	    // InternalApplicationConfiguration.g:4568:11: lv_solver_27_0= ruleSolver
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getSolverSolverEnumRuleCall_3_7_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
            	    lv_solver_27_0=ruleSolver();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGenerationTaskRule());
            	    											}
            	    											set(
            	    												current,
            	    												"solver",
            	    												lv_solver_27_0,
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
            	case 9 :
            	    // InternalApplicationConfiguration.g:4591:4: ({...}? => ( ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:4591:4: ({...}? => ( ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4592:5: {...}? => ( ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalApplicationConfiguration.g:4592:111: ( ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4593:6: ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalApplicationConfiguration.g:4596:9: ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) )
            	    // InternalApplicationConfiguration.g:4596:10: {...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:4596:19: (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) )
            	    // InternalApplicationConfiguration.g:4596:20: otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) )
            	    {
            	    otherlv_28=(Token)match(input,30,FOLLOW_12); 

            	    									newLeafNode(otherlv_28, grammarAccess.getGenerationTaskAccess().getConfigKeyword_3_8_0());
            	    								
            	    otherlv_29=(Token)match(input,17,FOLLOW_42); 

            	    									newLeafNode(otherlv_29, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_8_1());
            	    								
            	    // InternalApplicationConfiguration.g:4604:9: ( (lv_config_30_0= ruleConfig ) )
            	    // InternalApplicationConfiguration.g:4605:10: (lv_config_30_0= ruleConfig )
            	    {
            	    // InternalApplicationConfiguration.g:4605:10: (lv_config_30_0= ruleConfig )
            	    // InternalApplicationConfiguration.g:4606:11: lv_config_30_0= ruleConfig
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getConfigConfigParserRuleCall_3_8_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
            	    lv_config_30_0=ruleConfig();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGenerationTaskRule());
            	    											}
            	    											set(
            	    												current,
            	    												"config",
            	    												lv_config_30_0,
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
            	case 10 :
            	    // InternalApplicationConfiguration.g:4629:4: ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:4629:4: ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4630:5: {...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalApplicationConfiguration.g:4630:111: ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4631:6: ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalApplicationConfiguration.g:4634:9: ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) )
            	    // InternalApplicationConfiguration.g:4634:10: {...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:4634:19: (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) )
            	    // InternalApplicationConfiguration.g:4634:20: otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) )
            	    {
            	    otherlv_31=(Token)match(input,50,FOLLOW_12); 

            	    									newLeafNode(otherlv_31, grammarAccess.getGenerationTaskAccess().getDebugKeyword_3_9_0());
            	    								
            	    otherlv_32=(Token)match(input,17,FOLLOW_20); 

            	    									newLeafNode(otherlv_32, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_9_1());
            	    								
            	    // InternalApplicationConfiguration.g:4642:9: ( (lv_debugFolder_33_0= ruleFile ) )
            	    // InternalApplicationConfiguration.g:4643:10: (lv_debugFolder_33_0= ruleFile )
            	    {
            	    // InternalApplicationConfiguration.g:4643:10: (lv_debugFolder_33_0= ruleFile )
            	    // InternalApplicationConfiguration.g:4644:11: lv_debugFolder_33_0= ruleFile
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getDebugFolderFileParserRuleCall_3_9_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalApplicationConfiguration.g:4667:4: ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:4667:4: ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4668:5: {...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // InternalApplicationConfiguration.g:4668:112: ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4669:6: ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 10);
            	    					
            	    // InternalApplicationConfiguration.g:4672:9: ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) )
            	    // InternalApplicationConfiguration.g:4672:10: {...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:4672:19: (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) )
            	    // InternalApplicationConfiguration.g:4672:20: otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) )
            	    {
            	    otherlv_34=(Token)match(input,51,FOLLOW_12); 

            	    									newLeafNode(otherlv_34, grammarAccess.getGenerationTaskAccess().getLogKeyword_3_10_0());
            	    								
            	    otherlv_35=(Token)match(input,17,FOLLOW_20); 

            	    									newLeafNode(otherlv_35, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_10_1());
            	    								
            	    // InternalApplicationConfiguration.g:4680:9: ( (lv_targetLogFile_36_0= ruleFile ) )
            	    // InternalApplicationConfiguration.g:4681:10: (lv_targetLogFile_36_0= ruleFile )
            	    {
            	    // InternalApplicationConfiguration.g:4681:10: (lv_targetLogFile_36_0= ruleFile )
            	    // InternalApplicationConfiguration.g:4682:11: lv_targetLogFile_36_0= ruleFile
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getTargetLogFileFileParserRuleCall_3_10_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalApplicationConfiguration.g:4705:4: ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:4705:4: ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4706:5: {...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // InternalApplicationConfiguration.g:4706:112: ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4707:6: ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 11);
            	    					
            	    // InternalApplicationConfiguration.g:4710:9: ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) )
            	    // InternalApplicationConfiguration.g:4710:10: {...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:4710:19: (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) )
            	    // InternalApplicationConfiguration.g:4710:20: otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) )
            	    {
            	    otherlv_37=(Token)match(input,52,FOLLOW_12); 

            	    									newLeafNode(otherlv_37, grammarAccess.getGenerationTaskAccess().getStatisticsKeyword_3_11_0());
            	    								
            	    otherlv_38=(Token)match(input,17,FOLLOW_20); 

            	    									newLeafNode(otherlv_38, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_11_1());
            	    								
            	    // InternalApplicationConfiguration.g:4718:9: ( (lv_targetStatisticsFile_39_0= ruleFile ) )
            	    // InternalApplicationConfiguration.g:4719:10: (lv_targetStatisticsFile_39_0= ruleFile )
            	    {
            	    // InternalApplicationConfiguration.g:4719:10: (lv_targetStatisticsFile_39_0= ruleFile )
            	    // InternalApplicationConfiguration.g:4720:11: lv_targetStatisticsFile_39_0= ruleFile
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getTargetStatisticsFileFileParserRuleCall_3_11_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	case 13 :
            	    // InternalApplicationConfiguration.g:4743:4: ({...}? => ( ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) ) ) )
            	    {
            	    // InternalApplicationConfiguration.g:4743:4: ({...}? => ( ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4744:5: {...}? => ( ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 12)");
            	    }
            	    // InternalApplicationConfiguration.g:4744:112: ( ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) ) )
            	    // InternalApplicationConfiguration.g:4745:6: ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 12);
            	    					
            	    // InternalApplicationConfiguration.g:4748:9: ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) )
            	    // InternalApplicationConfiguration.g:4748:10: {...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationTask", "true");
            	    }
            	    // InternalApplicationConfiguration.g:4748:19: (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) )
            	    // InternalApplicationConfiguration.g:4748:20: otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) )
            	    {
            	    otherlv_40=(Token)match(input,53,FOLLOW_12); 

            	    									newLeafNode(otherlv_40, grammarAccess.getGenerationTaskAccess().getOutputKeyword_3_12_0());
            	    								
            	    otherlv_41=(Token)match(input,17,FOLLOW_20); 

            	    									newLeafNode(otherlv_41, grammarAccess.getGenerationTaskAccess().getEqualsSignKeyword_3_12_1());
            	    								
            	    // InternalApplicationConfiguration.g:4756:9: ( (lv_tagetFolder_42_0= ruleFile ) )
            	    // InternalApplicationConfiguration.g:4757:10: (lv_tagetFolder_42_0= ruleFile )
            	    {
            	    // InternalApplicationConfiguration.g:4757:10: (lv_tagetFolder_42_0= ruleFile )
            	    // InternalApplicationConfiguration.g:4758:11: lv_tagetFolder_42_0= ruleFile
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationTaskAccess().getTagetFolderFileParserRuleCall_3_12_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
            	    lv_tagetFolder_42_0=ruleFile();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGenerationTaskRule());
            	    											}
            	    											set(
            	    												current,
            	    												"tagetFolder",
            	    												lv_tagetFolder_42_0,
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
            	    break loop58;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3());
            				

            }

            otherlv_43=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_43, grammarAccess.getGenerationTaskAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "ruleOptimizationDirection"
    // InternalApplicationConfiguration.g:4796:1: ruleOptimizationDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'minimize' ) | (enumLiteral_1= 'maximize' ) ) ;
    public final Enumerator ruleOptimizationDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:4802:2: ( ( (enumLiteral_0= 'minimize' ) | (enumLiteral_1= 'maximize' ) ) )
            // InternalApplicationConfiguration.g:4803:2: ( (enumLiteral_0= 'minimize' ) | (enumLiteral_1= 'maximize' ) )
            {
            // InternalApplicationConfiguration.g:4803:2: ( (enumLiteral_0= 'minimize' ) | (enumLiteral_1= 'maximize' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==54) ) {
                alt59=1;
            }
            else if ( (LA59_0==55) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalApplicationConfiguration.g:4804:3: (enumLiteral_0= 'minimize' )
                    {
                    // InternalApplicationConfiguration.g:4804:3: (enumLiteral_0= 'minimize' )
                    // InternalApplicationConfiguration.g:4805:4: enumLiteral_0= 'minimize'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getOptimizationDirectionAccess().getMINIMIZEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOptimizationDirectionAccess().getMINIMIZEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:4812:3: (enumLiteral_1= 'maximize' )
                    {
                    // InternalApplicationConfiguration.g:4812:3: (enumLiteral_1= 'maximize' )
                    // InternalApplicationConfiguration.g:4813:4: enumLiteral_1= 'maximize'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getOptimizationDirectionAccess().getMAXIMIZEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOptimizationDirectionAccess().getMAXIMIZEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleOptimizationDirection"


    // $ANTLR start "ruleComparisonOperator"
    // InternalApplicationConfiguration.g:4823:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:4829:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // InternalApplicationConfiguration.g:4830:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalApplicationConfiguration.g:4830:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            int alt60=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt60=1;
                }
                break;
            case 37:
                {
                alt60=2;
                }
                break;
            case 56:
                {
                alt60=3;
                }
                break;
            case 57:
                {
                alt60=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalApplicationConfiguration.g:4831:3: (enumLiteral_0= '<' )
                    {
                    // InternalApplicationConfiguration.g:4831:3: (enumLiteral_0= '<' )
                    // InternalApplicationConfiguration.g:4832:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:4839:3: (enumLiteral_1= '>' )
                    {
                    // InternalApplicationConfiguration.g:4839:3: (enumLiteral_1= '>' )
                    // InternalApplicationConfiguration.g:4840:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalApplicationConfiguration.g:4847:3: (enumLiteral_2= '<=' )
                    {
                    // InternalApplicationConfiguration.g:4847:3: (enumLiteral_2= '<=' )
                    // InternalApplicationConfiguration.g:4848:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESS_EQUALSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLESS_EQUALSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalApplicationConfiguration.g:4855:3: (enumLiteral_3= '>=' )
                    {
                    // InternalApplicationConfiguration.g:4855:3: (enumLiteral_3= '>=' )
                    // InternalApplicationConfiguration.g:4856:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALSEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleDocumentLevelSpecification"
    // InternalApplicationConfiguration.g:4866:1: ruleDocumentLevelSpecification returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'normal' ) | (enumLiteral_2= 'full' ) ) ;
    public final Enumerator ruleDocumentLevelSpecification() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:4872:2: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'normal' ) | (enumLiteral_2= 'full' ) ) )
            // InternalApplicationConfiguration.g:4873:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'normal' ) | (enumLiteral_2= 'full' ) )
            {
            // InternalApplicationConfiguration.g:4873:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'normal' ) | (enumLiteral_2= 'full' ) )
            int alt61=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt61=1;
                }
                break;
            case 59:
                {
                alt61=2;
                }
                break;
            case 60:
                {
                alt61=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalApplicationConfiguration.g:4874:3: (enumLiteral_0= 'none' )
                    {
                    // InternalApplicationConfiguration.g:4874:3: (enumLiteral_0= 'none' )
                    // InternalApplicationConfiguration.g:4875:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getDocumentLevelSpecificationAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDocumentLevelSpecificationAccess().getNoneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:4882:3: (enumLiteral_1= 'normal' )
                    {
                    // InternalApplicationConfiguration.g:4882:3: (enumLiteral_1= 'normal' )
                    // InternalApplicationConfiguration.g:4883:4: enumLiteral_1= 'normal'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getDocumentLevelSpecificationAccess().getNormalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDocumentLevelSpecificationAccess().getNormalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalApplicationConfiguration.g:4890:3: (enumLiteral_2= 'full' )
                    {
                    // InternalApplicationConfiguration.g:4890:3: (enumLiteral_2= 'full' )
                    // InternalApplicationConfiguration.g:4891:4: enumLiteral_2= 'full'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getDocumentLevelSpecificationAccess().getFullEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDocumentLevelSpecificationAccess().getFullEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleDocumentLevelSpecification"


    // $ANTLR start "ruleSolver"
    // InternalApplicationConfiguration.g:4901:1: ruleSolver returns [Enumerator current=null] : ( (enumLiteral_0= 'SMTSolver' ) | (enumLiteral_1= 'AlloySolver' ) | (enumLiteral_2= 'ViatraSolver' ) ) ;
    public final Enumerator ruleSolver() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalApplicationConfiguration.g:4907:2: ( ( (enumLiteral_0= 'SMTSolver' ) | (enumLiteral_1= 'AlloySolver' ) | (enumLiteral_2= 'ViatraSolver' ) ) )
            // InternalApplicationConfiguration.g:4908:2: ( (enumLiteral_0= 'SMTSolver' ) | (enumLiteral_1= 'AlloySolver' ) | (enumLiteral_2= 'ViatraSolver' ) )
            {
            // InternalApplicationConfiguration.g:4908:2: ( (enumLiteral_0= 'SMTSolver' ) | (enumLiteral_1= 'AlloySolver' ) | (enumLiteral_2= 'ViatraSolver' ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt62=1;
                }
                break;
            case 62:
                {
                alt62=2;
                }
                break;
            case 63:
                {
                alt62=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalApplicationConfiguration.g:4909:3: (enumLiteral_0= 'SMTSolver' )
                    {
                    // InternalApplicationConfiguration.g:4909:3: (enumLiteral_0= 'SMTSolver' )
                    // InternalApplicationConfiguration.g:4910:4: enumLiteral_0= 'SMTSolver'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getSolverAccess().getSMTSolverEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSolverAccess().getSMTSolverEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:4917:3: (enumLiteral_1= 'AlloySolver' )
                    {
                    // InternalApplicationConfiguration.g:4917:3: (enumLiteral_1= 'AlloySolver' )
                    // InternalApplicationConfiguration.g:4918:4: enumLiteral_1= 'AlloySolver'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getSolverAccess().getAlloySolverEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSolverAccess().getAlloySolverEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalApplicationConfiguration.g:4925:3: (enumLiteral_2= 'ViatraSolver' )
                    {
                    // InternalApplicationConfiguration.g:4925:3: (enumLiteral_2= 'ViatraSolver' )
                    // InternalApplicationConfiguration.g:4926:4: enumLiteral_2= 'ViatraSolver'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

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


    protected DFA58 dfa58 = new DFA58(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\24\16\uffff";
    static final String dfa_3s = "\1\65\16\uffff";
    static final String dfa_4s = "\1\uffff\1\16\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15";
    static final String dfa_5s = "\1\0\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\3\uffff\1\2\2\uffff\1\4\1\uffff\1\5\1\12\15\uffff\1\6\1\uffff\1\3\1\7\1\10\1\11\1\13\1\14\1\15\1\16",
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
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 4268:6: ( ({...}? => ( ({...}? => (otherlv_4= 'metamodel' otherlv_5= '=' ( (lv_metamodel_6_0= ruleMetamodel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'partial-model' otherlv_8= '=' ( (lv_partialModel_9_0= rulePartialModel ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'constraints' otherlv_11= '=' ( (lv_patterns_12_0= ruleGraphPattern ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'objectives' otherlv_14= '=' ( (lv_objectives_15_0= ruleObjective ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'scope' otherlv_17= '=' ( (lv_scope_18_0= ruleScope ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_numberSpecified_19_0= 'number' ) ) otherlv_20= '=' ( (lv_number_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_runSpecified_22_0= 'runs' ) ) otherlv_23= '=' ( (lv_runs_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'solver' otherlv_26= '=' ( (lv_solver_27_0= ruleSolver ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'config' otherlv_29= '=' ( (lv_config_30_0= ruleConfig ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'debug' otherlv_32= '=' ( (lv_debugFolder_33_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'log' otherlv_35= '=' ( (lv_targetLogFile_36_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'statistics' otherlv_38= '=' ( (lv_targetStatisticsFile_39_0= ruleFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'output' otherlv_41= '=' ( (lv_tagetFolder_42_0= ruleFile ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_0 = input.LA(1);

                         
                        int index58_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA58_0==20) ) {s = 1;}

                        else if ( LA58_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA58_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA58_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA58_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA58_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA58_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA58_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA58_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA58_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA58_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                        else if ( LA58_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 10) ) {s = 12;}

                        else if ( LA58_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 11) ) {s = 13;}

                        else if ( LA58_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationTaskAccess().getUnorderedGroup_3(), 12) ) {s = 14;}

                         
                        input.seek(index58_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000030006D012002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000030006D010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000050L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00C0000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0300003000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000380100040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000380000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000040020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000101020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x003FD00069100000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0xE000000000000000L});

}
