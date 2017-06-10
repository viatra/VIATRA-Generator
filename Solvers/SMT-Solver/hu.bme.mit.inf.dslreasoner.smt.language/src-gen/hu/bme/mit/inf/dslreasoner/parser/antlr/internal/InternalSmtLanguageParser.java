package hu.bme.mit.inf.dslreasoner.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.inf.dslreasoner.services.SmtLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmtLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PROPERTYNAME", "RULE_INT", "RULE_REAL", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'--------------'", "'timeout'", "'('", "'set-option'", "')'", "'declare-datatypes'", "'declare-sort'", "'Int'", "'Bool'", "'Real'", "'declare-fun'", "'define-fun'", "'true'", "'false'", "'exists'", "'!'", "':pattern'", "'forall'", "'and'", "'or'", "'=>'", "'not'", "'iff'", "'ite'", "'let'", "'='", "'distinct'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'div'", "'mod'", "'assert'", "'check-sat'", "'check-sat-using'", "'get-model'", "'and-then'", "'or-else'", "'par-or'", "'par-then'", "'try-for'", "'if'", "'when'", "'fail-if'", "'using-params'", "'error'", "'unsupported'", "';'", "'sat'", "'unsat'", "'unknown'", "'model'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
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
    public static final int RULE_REAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
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
    public static final int RULE_PROPERTYNAME=5;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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


        public InternalSmtLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmtLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmtLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g"; }



     	private SmtLanguageGrammarAccess grammarAccess;
     	
        public InternalSmtLanguageParser(TokenStream input, SmtLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SMTDocument";	
       	}
       	
       	@Override
       	protected SmtLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSMTDocument"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:67:1: entryRuleSMTDocument returns [EObject current=null] : iv_ruleSMTDocument= ruleSMTDocument EOF ;
    public final EObject entryRuleSMTDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTDocument = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:68:2: (iv_ruleSMTDocument= ruleSMTDocument EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:69:2: iv_ruleSMTDocument= ruleSMTDocument EOF
            {
             newCompositeNode(grammarAccess.getSMTDocumentRule()); 
            pushFollow(FOLLOW_ruleSMTDocument_in_entryRuleSMTDocument75);
            iv_ruleSMTDocument=ruleSMTDocument();

            state._fsp--;

             current =iv_ruleSMTDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTDocument85); 

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
    // $ANTLR end "entryRuleSMTDocument"


    // $ANTLR start "ruleSMTDocument"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:76:1: ruleSMTDocument returns [EObject current=null] : ( ( (lv_input_0_0= ruleSMTInput ) ) (otherlv_1= '--------------' ( (lv_output_2_0= ruleSMTOutput ) ) )? ) ;
    public final EObject ruleSMTDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_input_0_0 = null;

        EObject lv_output_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:79:28: ( ( ( (lv_input_0_0= ruleSMTInput ) ) (otherlv_1= '--------------' ( (lv_output_2_0= ruleSMTOutput ) ) )? ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:80:1: ( ( (lv_input_0_0= ruleSMTInput ) ) (otherlv_1= '--------------' ( (lv_output_2_0= ruleSMTOutput ) ) )? )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:80:1: ( ( (lv_input_0_0= ruleSMTInput ) ) (otherlv_1= '--------------' ( (lv_output_2_0= ruleSMTOutput ) ) )? )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:80:2: ( (lv_input_0_0= ruleSMTInput ) ) (otherlv_1= '--------------' ( (lv_output_2_0= ruleSMTOutput ) ) )?
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:80:2: ( (lv_input_0_0= ruleSMTInput ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:81:1: (lv_input_0_0= ruleSMTInput )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:81:1: (lv_input_0_0= ruleSMTInput )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:82:3: lv_input_0_0= ruleSMTInput
            {
             
            	        newCompositeNode(grammarAccess.getSMTDocumentAccess().getInputSMTInputParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTInput_in_ruleSMTDocument131);
            lv_input_0_0=ruleSMTInput();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTDocumentRule());
            	        }
                   		set(
                   			current, 
                   			"input",
                    		lv_input_0_0, 
                    		"SMTInput");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:98:2: (otherlv_1= '--------------' ( (lv_output_2_0= ruleSMTOutput ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:98:4: otherlv_1= '--------------' ( (lv_output_2_0= ruleSMTOutput ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleSMTDocument144); 

                        	newLeafNode(otherlv_1, grammarAccess.getSMTDocumentAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_1_0());
                        
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:102:1: ( (lv_output_2_0= ruleSMTOutput ) )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:103:1: (lv_output_2_0= ruleSMTOutput )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:103:1: (lv_output_2_0= ruleSMTOutput )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:104:3: lv_output_2_0= ruleSMTOutput
                    {
                     
                    	        newCompositeNode(grammarAccess.getSMTDocumentAccess().getOutputSMTOutputParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSMTOutput_in_ruleSMTDocument165);
                    lv_output_2_0=ruleSMTOutput();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSMTDocumentRule());
                    	        }
                           		set(
                           			current, 
                           			"output",
                            		lv_output_2_0, 
                            		"SMTOutput");
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
    // $ANTLR end "ruleSMTDocument"


    // $ANTLR start "entryRuleSMTInput"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:128:1: entryRuleSMTInput returns [EObject current=null] : iv_ruleSMTInput= ruleSMTInput EOF ;
    public final EObject entryRuleSMTInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTInput = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:129:2: (iv_ruleSMTInput= ruleSMTInput EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:130:2: iv_ruleSMTInput= ruleSMTInput EOF
            {
             newCompositeNode(grammarAccess.getSMTInputRule()); 
            pushFollow(FOLLOW_ruleSMTInput_in_entryRuleSMTInput203);
            iv_ruleSMTInput=ruleSMTInput();

            state._fsp--;

             current =iv_ruleSMTInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTInput213); 

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
    // $ANTLR end "entryRuleSMTInput"


    // $ANTLR start "ruleSMTInput"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:137:1: ruleSMTInput returns [EObject current=null] : ( ( (lv_options_0_0= ruleSMTOption ) )* ( ( (lv_typeDeclarations_1_0= ruleSMTType ) ) | ( (lv_functionDeclarations_2_0= ruleSMTFunctionDeclaration ) ) | ( (lv_functionDefinition_3_0= ruleSMTFunctionDefinition ) ) | ( (lv_assertions_4_0= ruleSMTAssertion ) ) )* ( (lv_satCommand_5_0= ruleSMTSatCommand ) ) ( (lv_getModelCommand_6_0= ruleSMTGetModelCommand ) ) ) ;
    public final EObject ruleSMTInput() throws RecognitionException {
        EObject current = null;

        EObject lv_options_0_0 = null;

        EObject lv_typeDeclarations_1_0 = null;

        EObject lv_functionDeclarations_2_0 = null;

        EObject lv_functionDefinition_3_0 = null;

        EObject lv_assertions_4_0 = null;

        EObject lv_satCommand_5_0 = null;

        EObject lv_getModelCommand_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:140:28: ( ( ( (lv_options_0_0= ruleSMTOption ) )* ( ( (lv_typeDeclarations_1_0= ruleSMTType ) ) | ( (lv_functionDeclarations_2_0= ruleSMTFunctionDeclaration ) ) | ( (lv_functionDefinition_3_0= ruleSMTFunctionDefinition ) ) | ( (lv_assertions_4_0= ruleSMTAssertion ) ) )* ( (lv_satCommand_5_0= ruleSMTSatCommand ) ) ( (lv_getModelCommand_6_0= ruleSMTGetModelCommand ) ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:141:1: ( ( (lv_options_0_0= ruleSMTOption ) )* ( ( (lv_typeDeclarations_1_0= ruleSMTType ) ) | ( (lv_functionDeclarations_2_0= ruleSMTFunctionDeclaration ) ) | ( (lv_functionDefinition_3_0= ruleSMTFunctionDefinition ) ) | ( (lv_assertions_4_0= ruleSMTAssertion ) ) )* ( (lv_satCommand_5_0= ruleSMTSatCommand ) ) ( (lv_getModelCommand_6_0= ruleSMTGetModelCommand ) ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:141:1: ( ( (lv_options_0_0= ruleSMTOption ) )* ( ( (lv_typeDeclarations_1_0= ruleSMTType ) ) | ( (lv_functionDeclarations_2_0= ruleSMTFunctionDeclaration ) ) | ( (lv_functionDefinition_3_0= ruleSMTFunctionDefinition ) ) | ( (lv_assertions_4_0= ruleSMTAssertion ) ) )* ( (lv_satCommand_5_0= ruleSMTSatCommand ) ) ( (lv_getModelCommand_6_0= ruleSMTGetModelCommand ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:141:2: ( (lv_options_0_0= ruleSMTOption ) )* ( ( (lv_typeDeclarations_1_0= ruleSMTType ) ) | ( (lv_functionDeclarations_2_0= ruleSMTFunctionDeclaration ) ) | ( (lv_functionDefinition_3_0= ruleSMTFunctionDefinition ) ) | ( (lv_assertions_4_0= ruleSMTAssertion ) ) )* ( (lv_satCommand_5_0= ruleSMTSatCommand ) ) ( (lv_getModelCommand_6_0= ruleSMTGetModelCommand ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:141:2: ( (lv_options_0_0= ruleSMTOption ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==16) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:142:1: (lv_options_0_0= ruleSMTOption )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:142:1: (lv_options_0_0= ruleSMTOption )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:143:3: lv_options_0_0= ruleSMTOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTInputAccess().getOptionsSMTOptionParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTOption_in_ruleSMTInput259);
            	    lv_options_0_0=ruleSMTOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTInputRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_0_0, 
            	            		"SMTOption");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:159:3: ( ( (lv_typeDeclarations_1_0= ruleSMTType ) ) | ( (lv_functionDeclarations_2_0= ruleSMTFunctionDeclaration ) ) | ( (lv_functionDefinition_3_0= ruleSMTFunctionDefinition ) ) | ( (lv_assertions_4_0= ruleSMTAssertion ) ) )*
            loop3:
            do {
                int alt3=5;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    switch ( input.LA(2) ) {
                    case 23:
                        {
                        alt3=2;
                        }
                        break;
                    case 18:
                    case 19:
                        {
                        alt3=1;
                        }
                        break;
                    case 50:
                        {
                        alt3=4;
                        }
                        break;
                    case 24:
                        {
                        alt3=3;
                        }
                        break;

                    }

                }


                switch (alt3) {
            	case 1 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:159:4: ( (lv_typeDeclarations_1_0= ruleSMTType ) )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:159:4: ( (lv_typeDeclarations_1_0= ruleSMTType ) )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:160:1: (lv_typeDeclarations_1_0= ruleSMTType )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:160:1: (lv_typeDeclarations_1_0= ruleSMTType )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:161:3: lv_typeDeclarations_1_0= ruleSMTType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTInputAccess().getTypeDeclarationsSMTTypeParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTType_in_ruleSMTInput282);
            	    lv_typeDeclarations_1_0=ruleSMTType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTInputRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"typeDeclarations",
            	            		lv_typeDeclarations_1_0, 
            	            		"SMTType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:178:6: ( (lv_functionDeclarations_2_0= ruleSMTFunctionDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:178:6: ( (lv_functionDeclarations_2_0= ruleSMTFunctionDeclaration ) )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:179:1: (lv_functionDeclarations_2_0= ruleSMTFunctionDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:179:1: (lv_functionDeclarations_2_0= ruleSMTFunctionDeclaration )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:180:3: lv_functionDeclarations_2_0= ruleSMTFunctionDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTInputAccess().getFunctionDeclarationsSMTFunctionDeclarationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTFunctionDeclaration_in_ruleSMTInput309);
            	    lv_functionDeclarations_2_0=ruleSMTFunctionDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTInputRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"functionDeclarations",
            	            		lv_functionDeclarations_2_0, 
            	            		"SMTFunctionDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:197:6: ( (lv_functionDefinition_3_0= ruleSMTFunctionDefinition ) )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:197:6: ( (lv_functionDefinition_3_0= ruleSMTFunctionDefinition ) )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:198:1: (lv_functionDefinition_3_0= ruleSMTFunctionDefinition )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:198:1: (lv_functionDefinition_3_0= ruleSMTFunctionDefinition )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:199:3: lv_functionDefinition_3_0= ruleSMTFunctionDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTInputAccess().getFunctionDefinitionSMTFunctionDefinitionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTFunctionDefinition_in_ruleSMTInput336);
            	    lv_functionDefinition_3_0=ruleSMTFunctionDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTInputRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"functionDefinition",
            	            		lv_functionDefinition_3_0, 
            	            		"SMTFunctionDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:216:6: ( (lv_assertions_4_0= ruleSMTAssertion ) )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:216:6: ( (lv_assertions_4_0= ruleSMTAssertion ) )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:217:1: (lv_assertions_4_0= ruleSMTAssertion )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:217:1: (lv_assertions_4_0= ruleSMTAssertion )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:218:3: lv_assertions_4_0= ruleSMTAssertion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTInputAccess().getAssertionsSMTAssertionParserRuleCall_1_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTAssertion_in_ruleSMTInput363);
            	    lv_assertions_4_0=ruleSMTAssertion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTInputRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"assertions",
            	            		lv_assertions_4_0, 
            	            		"SMTAssertion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:234:4: ( (lv_satCommand_5_0= ruleSMTSatCommand ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:235:1: (lv_satCommand_5_0= ruleSMTSatCommand )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:235:1: (lv_satCommand_5_0= ruleSMTSatCommand )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:236:3: lv_satCommand_5_0= ruleSMTSatCommand
            {
             
            	        newCompositeNode(grammarAccess.getSMTInputAccess().getSatCommandSMTSatCommandParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTSatCommand_in_ruleSMTInput386);
            lv_satCommand_5_0=ruleSMTSatCommand();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTInputRule());
            	        }
                   		set(
                   			current, 
                   			"satCommand",
                    		lv_satCommand_5_0, 
                    		"SMTSatCommand");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:252:2: ( (lv_getModelCommand_6_0= ruleSMTGetModelCommand ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:253:1: (lv_getModelCommand_6_0= ruleSMTGetModelCommand )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:253:1: (lv_getModelCommand_6_0= ruleSMTGetModelCommand )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:254:3: lv_getModelCommand_6_0= ruleSMTGetModelCommand
            {
             
            	        newCompositeNode(grammarAccess.getSMTInputAccess().getGetModelCommandSMTGetModelCommandParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTGetModelCommand_in_ruleSMTInput407);
            lv_getModelCommand_6_0=ruleSMTGetModelCommand();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTInputRule());
            	        }
                   		set(
                   			current, 
                   			"getModelCommand",
                    		lv_getModelCommand_6_0, 
                    		"SMTGetModelCommand");
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
    // $ANTLR end "ruleSMTInput"


    // $ANTLR start "entryRuleSMTOutput"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:278:1: entryRuleSMTOutput returns [EObject current=null] : iv_ruleSMTOutput= ruleSMTOutput EOF ;
    public final EObject entryRuleSMTOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTOutput = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:279:2: (iv_ruleSMTOutput= ruleSMTOutput EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:280:2: iv_ruleSMTOutput= ruleSMTOutput EOF
            {
             newCompositeNode(grammarAccess.getSMTOutputRule()); 
            pushFollow(FOLLOW_ruleSMTOutput_in_entryRuleSMTOutput443);
            iv_ruleSMTOutput=ruleSMTOutput();

            state._fsp--;

             current =iv_ruleSMTOutput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTOutput453); 

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
    // $ANTLR end "entryRuleSMTOutput"


    // $ANTLR start "ruleSMTOutput"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:287:1: ruleSMTOutput returns [EObject current=null] : ( ( ( ( (lv_satResult_0_0= ruleSMTResult ) ) ( (lv_getModelResult_1_0= ruleSMTResult ) ) ) | (otherlv_2= 'timeout' () ) ) ( (lv_statistics_4_0= ruleSMTStatisticsSection ) )? ) ;
    public final EObject ruleSMTOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_satResult_0_0 = null;

        EObject lv_getModelResult_1_0 = null;

        EObject lv_statistics_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:290:28: ( ( ( ( ( (lv_satResult_0_0= ruleSMTResult ) ) ( (lv_getModelResult_1_0= ruleSMTResult ) ) ) | (otherlv_2= 'timeout' () ) ) ( (lv_statistics_4_0= ruleSMTStatisticsSection ) )? ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:291:1: ( ( ( ( (lv_satResult_0_0= ruleSMTResult ) ) ( (lv_getModelResult_1_0= ruleSMTResult ) ) ) | (otherlv_2= 'timeout' () ) ) ( (lv_statistics_4_0= ruleSMTStatisticsSection ) )? )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:291:1: ( ( ( ( (lv_satResult_0_0= ruleSMTResult ) ) ( (lv_getModelResult_1_0= ruleSMTResult ) ) ) | (otherlv_2= 'timeout' () ) ) ( (lv_statistics_4_0= ruleSMTStatisticsSection ) )? )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:291:2: ( ( ( (lv_satResult_0_0= ruleSMTResult ) ) ( (lv_getModelResult_1_0= ruleSMTResult ) ) ) | (otherlv_2= 'timeout' () ) ) ( (lv_statistics_4_0= ruleSMTStatisticsSection ) )?
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:291:2: ( ( ( (lv_satResult_0_0= ruleSMTResult ) ) ( (lv_getModelResult_1_0= ruleSMTResult ) ) ) | (otherlv_2= 'timeout' () ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15||LA4_0==64||(LA4_0>=66 && LA4_0<=68)) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:291:3: ( ( (lv_satResult_0_0= ruleSMTResult ) ) ( (lv_getModelResult_1_0= ruleSMTResult ) ) )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:291:3: ( ( (lv_satResult_0_0= ruleSMTResult ) ) ( (lv_getModelResult_1_0= ruleSMTResult ) ) )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:291:4: ( (lv_satResult_0_0= ruleSMTResult ) ) ( (lv_getModelResult_1_0= ruleSMTResult ) )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:291:4: ( (lv_satResult_0_0= ruleSMTResult ) )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:292:1: (lv_satResult_0_0= ruleSMTResult )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:292:1: (lv_satResult_0_0= ruleSMTResult )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:293:3: lv_satResult_0_0= ruleSMTResult
                    {
                     
                    	        newCompositeNode(grammarAccess.getSMTOutputAccess().getSatResultSMTResultParserRuleCall_0_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSMTResult_in_ruleSMTOutput501);
                    lv_satResult_0_0=ruleSMTResult();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSMTOutputRule());
                    	        }
                           		set(
                           			current, 
                           			"satResult",
                            		lv_satResult_0_0, 
                            		"SMTResult");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:309:2: ( (lv_getModelResult_1_0= ruleSMTResult ) )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:310:1: (lv_getModelResult_1_0= ruleSMTResult )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:310:1: (lv_getModelResult_1_0= ruleSMTResult )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:311:3: lv_getModelResult_1_0= ruleSMTResult
                    {
                     
                    	        newCompositeNode(grammarAccess.getSMTOutputAccess().getGetModelResultSMTResultParserRuleCall_0_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSMTResult_in_ruleSMTOutput522);
                    lv_getModelResult_1_0=ruleSMTResult();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSMTOutputRule());
                    	        }
                           		set(
                           			current, 
                           			"getModelResult",
                            		lv_getModelResult_1_0, 
                            		"SMTResult");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:328:6: (otherlv_2= 'timeout' () )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:328:6: (otherlv_2= 'timeout' () )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:328:8: otherlv_2= 'timeout' ()
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleSMTOutput542); 

                        	newLeafNode(otherlv_2, grammarAccess.getSMTOutputAccess().getTimeoutKeyword_0_1_0());
                        
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:332:1: ()
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:333:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSMTOutputAccess().getSMTOutputAction_0_1_1(),
                                current);
                        

                    }


                    }


                    }
                    break;

            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:338:4: ( (lv_statistics_4_0= ruleSMTStatisticsSection ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:339:1: (lv_statistics_4_0= ruleSMTStatisticsSection )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:339:1: (lv_statistics_4_0= ruleSMTStatisticsSection )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:340:3: lv_statistics_4_0= ruleSMTStatisticsSection
                    {
                     
                    	        newCompositeNode(grammarAccess.getSMTOutputAccess().getStatisticsSMTStatisticsSectionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSMTStatisticsSection_in_ruleSMTOutput574);
                    lv_statistics_4_0=ruleSMTStatisticsSection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSMTOutputRule());
                    	        }
                           		set(
                           			current, 
                           			"statistics",
                            		lv_statistics_4_0, 
                            		"SMTStatisticsSection");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleSMTOutput"


    // $ANTLR start "entryRuleSMTID"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:364:1: entryRuleSMTID returns [String current=null] : iv_ruleSMTID= ruleSMTID EOF ;
    public final String entryRuleSMTID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSMTID = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:365:2: (iv_ruleSMTID= ruleSMTID EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:366:2: iv_ruleSMTID= ruleSMTID EOF
            {
             newCompositeNode(grammarAccess.getSMTIDRule()); 
            pushFollow(FOLLOW_ruleSMTID_in_entryRuleSMTID612);
            iv_ruleSMTID=ruleSMTID();

            state._fsp--;

             current =iv_ruleSMTID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTID623); 

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
    // $ANTLR end "entryRuleSMTID"


    // $ANTLR start "ruleSMTID"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:373:1: ruleSMTID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSMTID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:376:28: (this_ID_0= RULE_ID )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:377:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSMTID662); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getSMTIDAccess().getIDTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleSMTID"


    // $ANTLR start "entryRuleSMTOption"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:392:1: entryRuleSMTOption returns [EObject current=null] : iv_ruleSMTOption= ruleSMTOption EOF ;
    public final EObject entryRuleSMTOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTOption = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:393:2: (iv_ruleSMTOption= ruleSMTOption EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:394:2: iv_ruleSMTOption= ruleSMTOption EOF
            {
             newCompositeNode(grammarAccess.getSMTOptionRule()); 
            pushFollow(FOLLOW_ruleSMTOption_in_entryRuleSMTOption706);
            iv_ruleSMTOption=ruleSMTOption();

            state._fsp--;

             current =iv_ruleSMTOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTOption716); 

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
    // $ANTLR end "entryRuleSMTOption"


    // $ANTLR start "ruleSMTOption"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:401:1: ruleSMTOption returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'set-option' ( (lv_name_2_0= RULE_PROPERTYNAME ) ) ( (lv_value_3_0= ruleSMTAtomicTerm ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMTOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:404:28: ( (otherlv_0= '(' otherlv_1= 'set-option' ( (lv_name_2_0= RULE_PROPERTYNAME ) ) ( (lv_value_3_0= ruleSMTAtomicTerm ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:405:1: (otherlv_0= '(' otherlv_1= 'set-option' ( (lv_name_2_0= RULE_PROPERTYNAME ) ) ( (lv_value_3_0= ruleSMTAtomicTerm ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:405:1: (otherlv_0= '(' otherlv_1= 'set-option' ( (lv_name_2_0= RULE_PROPERTYNAME ) ) ( (lv_value_3_0= ruleSMTAtomicTerm ) ) otherlv_4= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:405:3: otherlv_0= '(' otherlv_1= 'set-option' ( (lv_name_2_0= RULE_PROPERTYNAME ) ) ( (lv_value_3_0= ruleSMTAtomicTerm ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTOption753); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTOptionAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleSMTOption765); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTOptionAccess().getSetOptionKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:413:1: ( (lv_name_2_0= RULE_PROPERTYNAME ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:414:1: (lv_name_2_0= RULE_PROPERTYNAME )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:414:1: (lv_name_2_0= RULE_PROPERTYNAME )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:415:3: lv_name_2_0= RULE_PROPERTYNAME
            {
            lv_name_2_0=(Token)match(input,RULE_PROPERTYNAME,FOLLOW_RULE_PROPERTYNAME_in_ruleSMTOption782); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSMTOptionAccess().getNamePROPERTYNAMETerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSMTOptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"PROPERTYNAME");
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:431:2: ( (lv_value_3_0= ruleSMTAtomicTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:432:1: (lv_value_3_0= ruleSMTAtomicTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:432:1: (lv_value_3_0= ruleSMTAtomicTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:433:3: lv_value_3_0= ruleSMTAtomicTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTOptionAccess().getValueSMTAtomicTermParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTAtomicTerm_in_ruleSMTOption808);
            lv_value_3_0=ruleSMTAtomicTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTOptionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"SMTAtomicTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTOption820); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTOptionAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTOption"


    // $ANTLR start "entryRuleSMTType"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:461:1: entryRuleSMTType returns [EObject current=null] : iv_ruleSMTType= ruleSMTType EOF ;
    public final EObject entryRuleSMTType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTType = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:462:2: (iv_ruleSMTType= ruleSMTType EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:463:2: iv_ruleSMTType= ruleSMTType EOF
            {
             newCompositeNode(grammarAccess.getSMTTypeRule()); 
            pushFollow(FOLLOW_ruleSMTType_in_entryRuleSMTType856);
            iv_ruleSMTType=ruleSMTType();

            state._fsp--;

             current =iv_ruleSMTType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTType866); 

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
    // $ANTLR end "entryRuleSMTType"


    // $ANTLR start "ruleSMTType"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:470:1: ruleSMTType returns [EObject current=null] : (this_SMTEnumeratedTypeDeclaration_0= ruleSMTEnumeratedTypeDeclaration | this_SMTSetTypeDeclaration_1= ruleSMTSetTypeDeclaration ) ;
    public final EObject ruleSMTType() throws RecognitionException {
        EObject current = null;

        EObject this_SMTEnumeratedTypeDeclaration_0 = null;

        EObject this_SMTSetTypeDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:473:28: ( (this_SMTEnumeratedTypeDeclaration_0= ruleSMTEnumeratedTypeDeclaration | this_SMTSetTypeDeclaration_1= ruleSMTSetTypeDeclaration ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:474:1: (this_SMTEnumeratedTypeDeclaration_0= ruleSMTEnumeratedTypeDeclaration | this_SMTSetTypeDeclaration_1= ruleSMTSetTypeDeclaration )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:474:1: (this_SMTEnumeratedTypeDeclaration_0= ruleSMTEnumeratedTypeDeclaration | this_SMTSetTypeDeclaration_1= ruleSMTSetTypeDeclaration )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==19) ) {
                    alt6=2;
                }
                else if ( (LA6_1==18) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:475:5: this_SMTEnumeratedTypeDeclaration_0= ruleSMTEnumeratedTypeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getSMTTypeAccess().getSMTEnumeratedTypeDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSMTEnumeratedTypeDeclaration_in_ruleSMTType913);
                    this_SMTEnumeratedTypeDeclaration_0=ruleSMTEnumeratedTypeDeclaration();

                    state._fsp--;

                     
                            current = this_SMTEnumeratedTypeDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:485:5: this_SMTSetTypeDeclaration_1= ruleSMTSetTypeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getSMTTypeAccess().getSMTSetTypeDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSMTSetTypeDeclaration_in_ruleSMTType940);
                    this_SMTSetTypeDeclaration_1=ruleSMTSetTypeDeclaration();

                    state._fsp--;

                     
                            current = this_SMTSetTypeDeclaration_1; 
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
    // $ANTLR end "ruleSMTType"


    // $ANTLR start "entryRuleSMTEnumLiteral"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:501:1: entryRuleSMTEnumLiteral returns [EObject current=null] : iv_ruleSMTEnumLiteral= ruleSMTEnumLiteral EOF ;
    public final EObject entryRuleSMTEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTEnumLiteral = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:502:2: (iv_ruleSMTEnumLiteral= ruleSMTEnumLiteral EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:503:2: iv_ruleSMTEnumLiteral= ruleSMTEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getSMTEnumLiteralRule()); 
            pushFollow(FOLLOW_ruleSMTEnumLiteral_in_entryRuleSMTEnumLiteral975);
            iv_ruleSMTEnumLiteral=ruleSMTEnumLiteral();

            state._fsp--;

             current =iv_ruleSMTEnumLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTEnumLiteral985); 

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
    // $ANTLR end "entryRuleSMTEnumLiteral"


    // $ANTLR start "ruleSMTEnumLiteral"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:510:1: ruleSMTEnumLiteral returns [EObject current=null] : ( (lv_name_0_0= ruleSMTID ) ) ;
    public final EObject ruleSMTEnumLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:513:28: ( ( (lv_name_0_0= ruleSMTID ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:514:1: ( (lv_name_0_0= ruleSMTID ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:514:1: ( (lv_name_0_0= ruleSMTID ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:515:1: (lv_name_0_0= ruleSMTID )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:515:1: (lv_name_0_0= ruleSMTID )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:516:3: lv_name_0_0= ruleSMTID
            {
             
            	        newCompositeNode(grammarAccess.getSMTEnumLiteralAccess().getNameSMTIDParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTID_in_ruleSMTEnumLiteral1030);
            lv_name_0_0=ruleSMTID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTEnumLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"SMTID");
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
    // $ANTLR end "ruleSMTEnumLiteral"


    // $ANTLR start "entryRuleSMTEnumeratedTypeDeclaration"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:540:1: entryRuleSMTEnumeratedTypeDeclaration returns [EObject current=null] : iv_ruleSMTEnumeratedTypeDeclaration= ruleSMTEnumeratedTypeDeclaration EOF ;
    public final EObject entryRuleSMTEnumeratedTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTEnumeratedTypeDeclaration = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:541:2: (iv_ruleSMTEnumeratedTypeDeclaration= ruleSMTEnumeratedTypeDeclaration EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:542:2: iv_ruleSMTEnumeratedTypeDeclaration= ruleSMTEnumeratedTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSMTEnumeratedTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleSMTEnumeratedTypeDeclaration_in_entryRuleSMTEnumeratedTypeDeclaration1065);
            iv_ruleSMTEnumeratedTypeDeclaration=ruleSMTEnumeratedTypeDeclaration();

            state._fsp--;

             current =iv_ruleSMTEnumeratedTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTEnumeratedTypeDeclaration1075); 

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
    // $ANTLR end "entryRuleSMTEnumeratedTypeDeclaration"


    // $ANTLR start "ruleSMTEnumeratedTypeDeclaration"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:549:1: ruleSMTEnumeratedTypeDeclaration returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'declare-datatypes' otherlv_2= '(' otherlv_3= ')' otherlv_4= '(' otherlv_5= '(' ( (lv_name_6_0= ruleSMTID ) ) ( (lv_elements_7_0= ruleSMTEnumLiteral ) )+ otherlv_8= ')' otherlv_9= ')' otherlv_10= ')' ) ;
    public final EObject ruleSMTEnumeratedTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_elements_7_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:552:28: ( (otherlv_0= '(' otherlv_1= 'declare-datatypes' otherlv_2= '(' otherlv_3= ')' otherlv_4= '(' otherlv_5= '(' ( (lv_name_6_0= ruleSMTID ) ) ( (lv_elements_7_0= ruleSMTEnumLiteral ) )+ otherlv_8= ')' otherlv_9= ')' otherlv_10= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:553:1: (otherlv_0= '(' otherlv_1= 'declare-datatypes' otherlv_2= '(' otherlv_3= ')' otherlv_4= '(' otherlv_5= '(' ( (lv_name_6_0= ruleSMTID ) ) ( (lv_elements_7_0= ruleSMTEnumLiteral ) )+ otherlv_8= ')' otherlv_9= ')' otherlv_10= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:553:1: (otherlv_0= '(' otherlv_1= 'declare-datatypes' otherlv_2= '(' otherlv_3= ')' otherlv_4= '(' otherlv_5= '(' ( (lv_name_6_0= ruleSMTID ) ) ( (lv_elements_7_0= ruleSMTEnumLiteral ) )+ otherlv_8= ')' otherlv_9= ')' otherlv_10= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:553:3: otherlv_0= '(' otherlv_1= 'declare-datatypes' otherlv_2= '(' otherlv_3= ')' otherlv_4= '(' otherlv_5= '(' ( (lv_name_6_0= ruleSMTID ) ) ( (lv_elements_7_0= ruleSMTEnumLiteral ) )+ otherlv_8= ')' otherlv_9= ')' otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTEnumeratedTypeDeclaration1112); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTEnumeratedTypeDeclarationAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSMTEnumeratedTypeDeclaration1124); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTEnumeratedTypeDeclarationAccess().getDeclareDatatypesKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSMTEnumeratedTypeDeclaration1136); 

                	newLeafNode(otherlv_2, grammarAccess.getSMTEnumeratedTypeDeclarationAccess().getLeftParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTEnumeratedTypeDeclaration1148); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTEnumeratedTypeDeclarationAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleSMTEnumeratedTypeDeclaration1160); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTEnumeratedTypeDeclarationAccess().getLeftParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleSMTEnumeratedTypeDeclaration1172); 

                	newLeafNode(otherlv_5, grammarAccess.getSMTEnumeratedTypeDeclarationAccess().getLeftParenthesisKeyword_5());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:577:1: ( (lv_name_6_0= ruleSMTID ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:578:1: (lv_name_6_0= ruleSMTID )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:578:1: (lv_name_6_0= ruleSMTID )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:579:3: lv_name_6_0= ruleSMTID
            {
             
            	        newCompositeNode(grammarAccess.getSMTEnumeratedTypeDeclarationAccess().getNameSMTIDParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTID_in_ruleSMTEnumeratedTypeDeclaration1193);
            lv_name_6_0=ruleSMTID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTEnumeratedTypeDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"SMTID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:595:2: ( (lv_elements_7_0= ruleSMTEnumLiteral ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:596:1: (lv_elements_7_0= ruleSMTEnumLiteral )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:596:1: (lv_elements_7_0= ruleSMTEnumLiteral )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:597:3: lv_elements_7_0= ruleSMTEnumLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTEnumeratedTypeDeclarationAccess().getElementsSMTEnumLiteralParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTEnumLiteral_in_ruleSMTEnumeratedTypeDeclaration1214);
            	    lv_elements_7_0=ruleSMTEnumLiteral();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTEnumeratedTypeDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_7_0, 
            	            		"SMTEnumLiteral");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleSMTEnumeratedTypeDeclaration1227); 

                	newLeafNode(otherlv_8, grammarAccess.getSMTEnumeratedTypeDeclarationAccess().getRightParenthesisKeyword_8());
                
            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleSMTEnumeratedTypeDeclaration1239); 

                	newLeafNode(otherlv_9, grammarAccess.getSMTEnumeratedTypeDeclarationAccess().getRightParenthesisKeyword_9());
                
            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleSMTEnumeratedTypeDeclaration1251); 

                	newLeafNode(otherlv_10, grammarAccess.getSMTEnumeratedTypeDeclarationAccess().getRightParenthesisKeyword_10());
                

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
    // $ANTLR end "ruleSMTEnumeratedTypeDeclaration"


    // $ANTLR start "entryRuleSMTSetTypeDeclaration"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:633:1: entryRuleSMTSetTypeDeclaration returns [EObject current=null] : iv_ruleSMTSetTypeDeclaration= ruleSMTSetTypeDeclaration EOF ;
    public final EObject entryRuleSMTSetTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTSetTypeDeclaration = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:634:2: (iv_ruleSMTSetTypeDeclaration= ruleSMTSetTypeDeclaration EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:635:2: iv_ruleSMTSetTypeDeclaration= ruleSMTSetTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSMTSetTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleSMTSetTypeDeclaration_in_entryRuleSMTSetTypeDeclaration1287);
            iv_ruleSMTSetTypeDeclaration=ruleSMTSetTypeDeclaration();

            state._fsp--;

             current =iv_ruleSMTSetTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTSetTypeDeclaration1297); 

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
    // $ANTLR end "entryRuleSMTSetTypeDeclaration"


    // $ANTLR start "ruleSMTSetTypeDeclaration"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:642:1: ruleSMTSetTypeDeclaration returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'declare-sort' ( (lv_name_2_0= ruleSMTID ) ) otherlv_3= ')' ) ;
    public final EObject ruleSMTSetTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:645:28: ( (otherlv_0= '(' otherlv_1= 'declare-sort' ( (lv_name_2_0= ruleSMTID ) ) otherlv_3= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:646:1: (otherlv_0= '(' otherlv_1= 'declare-sort' ( (lv_name_2_0= ruleSMTID ) ) otherlv_3= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:646:1: (otherlv_0= '(' otherlv_1= 'declare-sort' ( (lv_name_2_0= ruleSMTID ) ) otherlv_3= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:646:3: otherlv_0= '(' otherlv_1= 'declare-sort' ( (lv_name_2_0= ruleSMTID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTSetTypeDeclaration1334); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTSetTypeDeclarationAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleSMTSetTypeDeclaration1346); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTSetTypeDeclarationAccess().getDeclareSortKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:654:1: ( (lv_name_2_0= ruleSMTID ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:655:1: (lv_name_2_0= ruleSMTID )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:655:1: (lv_name_2_0= ruleSMTID )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:656:3: lv_name_2_0= ruleSMTID
            {
             
            	        newCompositeNode(grammarAccess.getSMTSetTypeDeclarationAccess().getNameSMTIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTID_in_ruleSMTSetTypeDeclaration1367);
            lv_name_2_0=ruleSMTID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTSetTypeDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"SMTID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTSetTypeDeclaration1379); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTSetTypeDeclarationAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSMTSetTypeDeclaration"


    // $ANTLR start "entryRuleSMTTypeReference"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:684:1: entryRuleSMTTypeReference returns [EObject current=null] : iv_ruleSMTTypeReference= ruleSMTTypeReference EOF ;
    public final EObject entryRuleSMTTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTTypeReference = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:685:2: (iv_ruleSMTTypeReference= ruleSMTTypeReference EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:686:2: iv_ruleSMTTypeReference= ruleSMTTypeReference EOF
            {
             newCompositeNode(grammarAccess.getSMTTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleSMTTypeReference_in_entryRuleSMTTypeReference1415);
            iv_ruleSMTTypeReference=ruleSMTTypeReference();

            state._fsp--;

             current =iv_ruleSMTTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTTypeReference1425); 

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
    // $ANTLR end "entryRuleSMTTypeReference"


    // $ANTLR start "ruleSMTTypeReference"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:693:1: ruleSMTTypeReference returns [EObject current=null] : (this_SMTComplexTypeReference_0= ruleSMTComplexTypeReference | this_SMTPrimitiveTypeReference_1= ruleSMTPrimitiveTypeReference ) ;
    public final EObject ruleSMTTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_SMTComplexTypeReference_0 = null;

        EObject this_SMTPrimitiveTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:696:28: ( (this_SMTComplexTypeReference_0= ruleSMTComplexTypeReference | this_SMTPrimitiveTypeReference_1= ruleSMTPrimitiveTypeReference ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:697:1: (this_SMTComplexTypeReference_0= ruleSMTComplexTypeReference | this_SMTPrimitiveTypeReference_1= ruleSMTPrimitiveTypeReference )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:697:1: (this_SMTComplexTypeReference_0= ruleSMTComplexTypeReference | this_SMTPrimitiveTypeReference_1= ruleSMTPrimitiveTypeReference )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=20 && LA8_0<=22)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:698:5: this_SMTComplexTypeReference_0= ruleSMTComplexTypeReference
                    {
                     
                            newCompositeNode(grammarAccess.getSMTTypeReferenceAccess().getSMTComplexTypeReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSMTComplexTypeReference_in_ruleSMTTypeReference1472);
                    this_SMTComplexTypeReference_0=ruleSMTComplexTypeReference();

                    state._fsp--;

                     
                            current = this_SMTComplexTypeReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:708:5: this_SMTPrimitiveTypeReference_1= ruleSMTPrimitiveTypeReference
                    {
                     
                            newCompositeNode(grammarAccess.getSMTTypeReferenceAccess().getSMTPrimitiveTypeReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSMTPrimitiveTypeReference_in_ruleSMTTypeReference1499);
                    this_SMTPrimitiveTypeReference_1=ruleSMTPrimitiveTypeReference();

                    state._fsp--;

                     
                            current = this_SMTPrimitiveTypeReference_1; 
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
    // $ANTLR end "ruleSMTTypeReference"


    // $ANTLR start "entryRuleSMTComplexTypeReference"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:724:1: entryRuleSMTComplexTypeReference returns [EObject current=null] : iv_ruleSMTComplexTypeReference= ruleSMTComplexTypeReference EOF ;
    public final EObject entryRuleSMTComplexTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTComplexTypeReference = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:725:2: (iv_ruleSMTComplexTypeReference= ruleSMTComplexTypeReference EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:726:2: iv_ruleSMTComplexTypeReference= ruleSMTComplexTypeReference EOF
            {
             newCompositeNode(grammarAccess.getSMTComplexTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleSMTComplexTypeReference_in_entryRuleSMTComplexTypeReference1534);
            iv_ruleSMTComplexTypeReference=ruleSMTComplexTypeReference();

            state._fsp--;

             current =iv_ruleSMTComplexTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTComplexTypeReference1544); 

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
    // $ANTLR end "entryRuleSMTComplexTypeReference"


    // $ANTLR start "ruleSMTComplexTypeReference"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:733:1: ruleSMTComplexTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSMTComplexTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:736:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:737:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:737:1: ( (otherlv_0= RULE_ID ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:738:1: (otherlv_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:738:1: (otherlv_0= RULE_ID )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:739:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSMTComplexTypeReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSMTComplexTypeReference1588); 

            		newLeafNode(otherlv_0, grammarAccess.getSMTComplexTypeReferenceAccess().getReferredSMTTypeCrossReference_0()); 
            	

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
    // $ANTLR end "ruleSMTComplexTypeReference"


    // $ANTLR start "entryRuleSMTPrimitiveTypeReference"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:758:1: entryRuleSMTPrimitiveTypeReference returns [EObject current=null] : iv_ruleSMTPrimitiveTypeReference= ruleSMTPrimitiveTypeReference EOF ;
    public final EObject entryRuleSMTPrimitiveTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTPrimitiveTypeReference = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:759:2: (iv_ruleSMTPrimitiveTypeReference= ruleSMTPrimitiveTypeReference EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:760:2: iv_ruleSMTPrimitiveTypeReference= ruleSMTPrimitiveTypeReference EOF
            {
             newCompositeNode(grammarAccess.getSMTPrimitiveTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleSMTPrimitiveTypeReference_in_entryRuleSMTPrimitiveTypeReference1623);
            iv_ruleSMTPrimitiveTypeReference=ruleSMTPrimitiveTypeReference();

            state._fsp--;

             current =iv_ruleSMTPrimitiveTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTPrimitiveTypeReference1633); 

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
    // $ANTLR end "entryRuleSMTPrimitiveTypeReference"


    // $ANTLR start "ruleSMTPrimitiveTypeReference"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:767:1: ruleSMTPrimitiveTypeReference returns [EObject current=null] : (this_SMTIntTypeReference_0= ruleSMTIntTypeReference | this_SMTBoolTypeReference_1= ruleSMTBoolTypeReference | this_SMTRealTypeReference_2= ruleSMTRealTypeReference ) ;
    public final EObject ruleSMTPrimitiveTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_SMTIntTypeReference_0 = null;

        EObject this_SMTBoolTypeReference_1 = null;

        EObject this_SMTRealTypeReference_2 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:770:28: ( (this_SMTIntTypeReference_0= ruleSMTIntTypeReference | this_SMTBoolTypeReference_1= ruleSMTBoolTypeReference | this_SMTRealTypeReference_2= ruleSMTRealTypeReference ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:771:1: (this_SMTIntTypeReference_0= ruleSMTIntTypeReference | this_SMTBoolTypeReference_1= ruleSMTBoolTypeReference | this_SMTRealTypeReference_2= ruleSMTRealTypeReference )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:771:1: (this_SMTIntTypeReference_0= ruleSMTIntTypeReference | this_SMTBoolTypeReference_1= ruleSMTBoolTypeReference | this_SMTRealTypeReference_2= ruleSMTRealTypeReference )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
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
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:772:5: this_SMTIntTypeReference_0= ruleSMTIntTypeReference
                    {
                     
                            newCompositeNode(grammarAccess.getSMTPrimitiveTypeReferenceAccess().getSMTIntTypeReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSMTIntTypeReference_in_ruleSMTPrimitiveTypeReference1680);
                    this_SMTIntTypeReference_0=ruleSMTIntTypeReference();

                    state._fsp--;

                     
                            current = this_SMTIntTypeReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:782:5: this_SMTBoolTypeReference_1= ruleSMTBoolTypeReference
                    {
                     
                            newCompositeNode(grammarAccess.getSMTPrimitiveTypeReferenceAccess().getSMTBoolTypeReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSMTBoolTypeReference_in_ruleSMTPrimitiveTypeReference1707);
                    this_SMTBoolTypeReference_1=ruleSMTBoolTypeReference();

                    state._fsp--;

                     
                            current = this_SMTBoolTypeReference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:792:5: this_SMTRealTypeReference_2= ruleSMTRealTypeReference
                    {
                     
                            newCompositeNode(grammarAccess.getSMTPrimitiveTypeReferenceAccess().getSMTRealTypeReferenceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSMTRealTypeReference_in_ruleSMTPrimitiveTypeReference1734);
                    this_SMTRealTypeReference_2=ruleSMTRealTypeReference();

                    state._fsp--;

                     
                            current = this_SMTRealTypeReference_2; 
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
    // $ANTLR end "ruleSMTPrimitiveTypeReference"


    // $ANTLR start "entryRuleSMTIntTypeReference"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:808:1: entryRuleSMTIntTypeReference returns [EObject current=null] : iv_ruleSMTIntTypeReference= ruleSMTIntTypeReference EOF ;
    public final EObject entryRuleSMTIntTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTIntTypeReference = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:809:2: (iv_ruleSMTIntTypeReference= ruleSMTIntTypeReference EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:810:2: iv_ruleSMTIntTypeReference= ruleSMTIntTypeReference EOF
            {
             newCompositeNode(grammarAccess.getSMTIntTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleSMTIntTypeReference_in_entryRuleSMTIntTypeReference1769);
            iv_ruleSMTIntTypeReference=ruleSMTIntTypeReference();

            state._fsp--;

             current =iv_ruleSMTIntTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTIntTypeReference1779); 

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
    // $ANTLR end "entryRuleSMTIntTypeReference"


    // $ANTLR start "ruleSMTIntTypeReference"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:817:1: ruleSMTIntTypeReference returns [EObject current=null] : ( () otherlv_1= 'Int' ) ;
    public final EObject ruleSMTIntTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:820:28: ( ( () otherlv_1= 'Int' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:821:1: ( () otherlv_1= 'Int' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:821:1: ( () otherlv_1= 'Int' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:821:2: () otherlv_1= 'Int'
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:821:2: ()
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:822:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSMTIntTypeReferenceAccess().getSMTIntTypeReferenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleSMTIntTypeReference1825); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTIntTypeReferenceAccess().getIntKeyword_1());
                

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
    // $ANTLR end "ruleSMTIntTypeReference"


    // $ANTLR start "entryRuleSMTBoolTypeReference"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:839:1: entryRuleSMTBoolTypeReference returns [EObject current=null] : iv_ruleSMTBoolTypeReference= ruleSMTBoolTypeReference EOF ;
    public final EObject entryRuleSMTBoolTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTBoolTypeReference = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:840:2: (iv_ruleSMTBoolTypeReference= ruleSMTBoolTypeReference EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:841:2: iv_ruleSMTBoolTypeReference= ruleSMTBoolTypeReference EOF
            {
             newCompositeNode(grammarAccess.getSMTBoolTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleSMTBoolTypeReference_in_entryRuleSMTBoolTypeReference1861);
            iv_ruleSMTBoolTypeReference=ruleSMTBoolTypeReference();

            state._fsp--;

             current =iv_ruleSMTBoolTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTBoolTypeReference1871); 

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
    // $ANTLR end "entryRuleSMTBoolTypeReference"


    // $ANTLR start "ruleSMTBoolTypeReference"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:848:1: ruleSMTBoolTypeReference returns [EObject current=null] : ( () otherlv_1= 'Bool' ) ;
    public final EObject ruleSMTBoolTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:851:28: ( ( () otherlv_1= 'Bool' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:852:1: ( () otherlv_1= 'Bool' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:852:1: ( () otherlv_1= 'Bool' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:852:2: () otherlv_1= 'Bool'
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:852:2: ()
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:853:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSMTBoolTypeReferenceAccess().getSMTBoolTypeReferenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSMTBoolTypeReference1917); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTBoolTypeReferenceAccess().getBoolKeyword_1());
                

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
    // $ANTLR end "ruleSMTBoolTypeReference"


    // $ANTLR start "entryRuleSMTRealTypeReference"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:870:1: entryRuleSMTRealTypeReference returns [EObject current=null] : iv_ruleSMTRealTypeReference= ruleSMTRealTypeReference EOF ;
    public final EObject entryRuleSMTRealTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTRealTypeReference = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:871:2: (iv_ruleSMTRealTypeReference= ruleSMTRealTypeReference EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:872:2: iv_ruleSMTRealTypeReference= ruleSMTRealTypeReference EOF
            {
             newCompositeNode(grammarAccess.getSMTRealTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleSMTRealTypeReference_in_entryRuleSMTRealTypeReference1953);
            iv_ruleSMTRealTypeReference=ruleSMTRealTypeReference();

            state._fsp--;

             current =iv_ruleSMTRealTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTRealTypeReference1963); 

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
    // $ANTLR end "entryRuleSMTRealTypeReference"


    // $ANTLR start "ruleSMTRealTypeReference"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:879:1: ruleSMTRealTypeReference returns [EObject current=null] : ( () otherlv_1= 'Real' ) ;
    public final EObject ruleSMTRealTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:882:28: ( ( () otherlv_1= 'Real' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:883:1: ( () otherlv_1= 'Real' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:883:1: ( () otherlv_1= 'Real' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:883:2: () otherlv_1= 'Real'
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:883:2: ()
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:884:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSMTRealTypeReferenceAccess().getSMTRealTypeReferenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleSMTRealTypeReference2009); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTRealTypeReferenceAccess().getRealKeyword_1());
                

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
    // $ANTLR end "ruleSMTRealTypeReference"


    // $ANTLR start "entryRuleSMTFunctionDeclaration"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:901:1: entryRuleSMTFunctionDeclaration returns [EObject current=null] : iv_ruleSMTFunctionDeclaration= ruleSMTFunctionDeclaration EOF ;
    public final EObject entryRuleSMTFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTFunctionDeclaration = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:902:2: (iv_ruleSMTFunctionDeclaration= ruleSMTFunctionDeclaration EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:903:2: iv_ruleSMTFunctionDeclaration= ruleSMTFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSMTFunctionDeclarationRule()); 
            pushFollow(FOLLOW_ruleSMTFunctionDeclaration_in_entryRuleSMTFunctionDeclaration2045);
            iv_ruleSMTFunctionDeclaration=ruleSMTFunctionDeclaration();

            state._fsp--;

             current =iv_ruleSMTFunctionDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTFunctionDeclaration2055); 

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
    // $ANTLR end "entryRuleSMTFunctionDeclaration"


    // $ANTLR start "ruleSMTFunctionDeclaration"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:910:1: ruleSMTFunctionDeclaration returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'declare-fun' ( (lv_name_2_0= ruleSMTID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleSMTTypeReference ) )* otherlv_5= ')' ( (lv_range_6_0= ruleSMTTypeReference ) ) otherlv_7= ')' ) ;
    public final EObject ruleSMTFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_range_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:913:28: ( (otherlv_0= '(' otherlv_1= 'declare-fun' ( (lv_name_2_0= ruleSMTID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleSMTTypeReference ) )* otherlv_5= ')' ( (lv_range_6_0= ruleSMTTypeReference ) ) otherlv_7= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:914:1: (otherlv_0= '(' otherlv_1= 'declare-fun' ( (lv_name_2_0= ruleSMTID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleSMTTypeReference ) )* otherlv_5= ')' ( (lv_range_6_0= ruleSMTTypeReference ) ) otherlv_7= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:914:1: (otherlv_0= '(' otherlv_1= 'declare-fun' ( (lv_name_2_0= ruleSMTID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleSMTTypeReference ) )* otherlv_5= ')' ( (lv_range_6_0= ruleSMTTypeReference ) ) otherlv_7= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:914:3: otherlv_0= '(' otherlv_1= 'declare-fun' ( (lv_name_2_0= ruleSMTID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleSMTTypeReference ) )* otherlv_5= ')' ( (lv_range_6_0= ruleSMTTypeReference ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTFunctionDeclaration2092); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTFunctionDeclarationAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleSMTFunctionDeclaration2104); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTFunctionDeclarationAccess().getDeclareFunKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:922:1: ( (lv_name_2_0= ruleSMTID ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:923:1: (lv_name_2_0= ruleSMTID )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:923:1: (lv_name_2_0= ruleSMTID )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:924:3: lv_name_2_0= ruleSMTID
            {
             
            	        newCompositeNode(grammarAccess.getSMTFunctionDeclarationAccess().getNameSMTIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTID_in_ruleSMTFunctionDeclaration2125);
            lv_name_2_0=ruleSMTID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTFunctionDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"SMTID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSMTFunctionDeclaration2137); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTFunctionDeclarationAccess().getLeftParenthesisKeyword_3());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:944:1: ( (lv_parameters_4_0= ruleSMTTypeReference ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=20 && LA10_0<=22)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:945:1: (lv_parameters_4_0= ruleSMTTypeReference )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:945:1: (lv_parameters_4_0= ruleSMTTypeReference )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:946:3: lv_parameters_4_0= ruleSMTTypeReference
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTFunctionDeclarationAccess().getParametersSMTTypeReferenceParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTTypeReference_in_ruleSMTFunctionDeclaration2158);
            	    lv_parameters_4_0=ruleSMTTypeReference();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTFunctionDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_4_0, 
            	            		"SMTTypeReference");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSMTFunctionDeclaration2171); 

                	newLeafNode(otherlv_5, grammarAccess.getSMTFunctionDeclarationAccess().getRightParenthesisKeyword_5());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:966:1: ( (lv_range_6_0= ruleSMTTypeReference ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:967:1: (lv_range_6_0= ruleSMTTypeReference )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:967:1: (lv_range_6_0= ruleSMTTypeReference )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:968:3: lv_range_6_0= ruleSMTTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getSMTFunctionDeclarationAccess().getRangeSMTTypeReferenceParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTypeReference_in_ruleSMTFunctionDeclaration2192);
            lv_range_6_0=ruleSMTTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTFunctionDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_6_0, 
                    		"SMTTypeReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleSMTFunctionDeclaration2204); 

                	newLeafNode(otherlv_7, grammarAccess.getSMTFunctionDeclarationAccess().getRightParenthesisKeyword_7());
                

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
    // $ANTLR end "ruleSMTFunctionDeclaration"


    // $ANTLR start "entryRuleSMTFunctionDefinition"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:996:1: entryRuleSMTFunctionDefinition returns [EObject current=null] : iv_ruleSMTFunctionDefinition= ruleSMTFunctionDefinition EOF ;
    public final EObject entryRuleSMTFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTFunctionDefinition = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:997:2: (iv_ruleSMTFunctionDefinition= ruleSMTFunctionDefinition EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:998:2: iv_ruleSMTFunctionDefinition= ruleSMTFunctionDefinition EOF
            {
             newCompositeNode(grammarAccess.getSMTFunctionDefinitionRule()); 
            pushFollow(FOLLOW_ruleSMTFunctionDefinition_in_entryRuleSMTFunctionDefinition2240);
            iv_ruleSMTFunctionDefinition=ruleSMTFunctionDefinition();

            state._fsp--;

             current =iv_ruleSMTFunctionDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTFunctionDefinition2250); 

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
    // $ANTLR end "entryRuleSMTFunctionDefinition"


    // $ANTLR start "ruleSMTFunctionDefinition"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1005:1: ruleSMTFunctionDefinition returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'define-fun' ( (lv_name_2_0= ruleSMTID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleSMTSortedVariable ) )* otherlv_5= ')' ( (lv_range_6_0= ruleSMTTypeReference ) ) ( (lv_value_7_0= ruleSMTTerm ) ) otherlv_8= ')' ) ;
    public final EObject ruleSMTFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_range_6_0 = null;

        EObject lv_value_7_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1008:28: ( (otherlv_0= '(' otherlv_1= 'define-fun' ( (lv_name_2_0= ruleSMTID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleSMTSortedVariable ) )* otherlv_5= ')' ( (lv_range_6_0= ruleSMTTypeReference ) ) ( (lv_value_7_0= ruleSMTTerm ) ) otherlv_8= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1009:1: (otherlv_0= '(' otherlv_1= 'define-fun' ( (lv_name_2_0= ruleSMTID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleSMTSortedVariable ) )* otherlv_5= ')' ( (lv_range_6_0= ruleSMTTypeReference ) ) ( (lv_value_7_0= ruleSMTTerm ) ) otherlv_8= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1009:1: (otherlv_0= '(' otherlv_1= 'define-fun' ( (lv_name_2_0= ruleSMTID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleSMTSortedVariable ) )* otherlv_5= ')' ( (lv_range_6_0= ruleSMTTypeReference ) ) ( (lv_value_7_0= ruleSMTTerm ) ) otherlv_8= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1009:3: otherlv_0= '(' otherlv_1= 'define-fun' ( (lv_name_2_0= ruleSMTID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleSMTSortedVariable ) )* otherlv_5= ')' ( (lv_range_6_0= ruleSMTTypeReference ) ) ( (lv_value_7_0= ruleSMTTerm ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTFunctionDefinition2287); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTFunctionDefinitionAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleSMTFunctionDefinition2299); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTFunctionDefinitionAccess().getDefineFunKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1017:1: ( (lv_name_2_0= ruleSMTID ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1018:1: (lv_name_2_0= ruleSMTID )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1018:1: (lv_name_2_0= ruleSMTID )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1019:3: lv_name_2_0= ruleSMTID
            {
             
            	        newCompositeNode(grammarAccess.getSMTFunctionDefinitionAccess().getNameSMTIDParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTID_in_ruleSMTFunctionDefinition2320);
            lv_name_2_0=ruleSMTID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTFunctionDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"SMTID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSMTFunctionDefinition2332); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTFunctionDefinitionAccess().getLeftParenthesisKeyword_3());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1039:1: ( (lv_parameters_4_0= ruleSMTSortedVariable ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1040:1: (lv_parameters_4_0= ruleSMTSortedVariable )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1040:1: (lv_parameters_4_0= ruleSMTSortedVariable )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1041:3: lv_parameters_4_0= ruleSMTSortedVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTFunctionDefinitionAccess().getParametersSMTSortedVariableParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTSortedVariable_in_ruleSMTFunctionDefinition2353);
            	    lv_parameters_4_0=ruleSMTSortedVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTFunctionDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_4_0, 
            	            		"SMTSortedVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSMTFunctionDefinition2366); 

                	newLeafNode(otherlv_5, grammarAccess.getSMTFunctionDefinitionAccess().getRightParenthesisKeyword_5());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1061:1: ( (lv_range_6_0= ruleSMTTypeReference ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1062:1: (lv_range_6_0= ruleSMTTypeReference )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1062:1: (lv_range_6_0= ruleSMTTypeReference )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1063:3: lv_range_6_0= ruleSMTTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getSMTFunctionDefinitionAccess().getRangeSMTTypeReferenceParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTypeReference_in_ruleSMTFunctionDefinition2387);
            lv_range_6_0=ruleSMTTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTFunctionDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_6_0, 
                    		"SMTTypeReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1079:2: ( (lv_value_7_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1080:1: (lv_value_7_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1080:1: (lv_value_7_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1081:3: lv_value_7_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTFunctionDefinitionAccess().getValueSMTTermParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTFunctionDefinition2408);
            lv_value_7_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTFunctionDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_7_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleSMTFunctionDefinition2420); 

                	newLeafNode(otherlv_8, grammarAccess.getSMTFunctionDefinitionAccess().getRightParenthesisKeyword_8());
                

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
    // $ANTLR end "ruleSMTFunctionDefinition"


    // $ANTLR start "entryRuleSMTTerm"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1109:1: entryRuleSMTTerm returns [EObject current=null] : iv_ruleSMTTerm= ruleSMTTerm EOF ;
    public final EObject entryRuleSMTTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTTerm = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1110:2: (iv_ruleSMTTerm= ruleSMTTerm EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1111:2: iv_ruleSMTTerm= ruleSMTTerm EOF
            {
             newCompositeNode(grammarAccess.getSMTTermRule()); 
            pushFollow(FOLLOW_ruleSMTTerm_in_entryRuleSMTTerm2456);
            iv_ruleSMTTerm=ruleSMTTerm();

            state._fsp--;

             current =iv_ruleSMTTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTTerm2466); 

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
    // $ANTLR end "entryRuleSMTTerm"


    // $ANTLR start "ruleSMTTerm"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1118:1: ruleSMTTerm returns [EObject current=null] : (this_SMTSymbolicValue_0= ruleSMTSymbolicValue | this_SMTAtomicTerm_1= ruleSMTAtomicTerm | this_SMTBoolOperation_2= ruleSMTBoolOperation | this_SMTIntOperation_3= ruleSMTIntOperation | this_SMTITE_4= ruleSMTITE | this_SMTLet_5= ruleSMTLet | this_SMTRelation_6= ruleSMTRelation | this_SMTQuantifiedExpression_7= ruleSMTQuantifiedExpression ) ;
    public final EObject ruleSMTTerm() throws RecognitionException {
        EObject current = null;

        EObject this_SMTSymbolicValue_0 = null;

        EObject this_SMTAtomicTerm_1 = null;

        EObject this_SMTBoolOperation_2 = null;

        EObject this_SMTIntOperation_3 = null;

        EObject this_SMTITE_4 = null;

        EObject this_SMTLet_5 = null;

        EObject this_SMTRelation_6 = null;

        EObject this_SMTQuantifiedExpression_7 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1121:28: ( (this_SMTSymbolicValue_0= ruleSMTSymbolicValue | this_SMTAtomicTerm_1= ruleSMTAtomicTerm | this_SMTBoolOperation_2= ruleSMTBoolOperation | this_SMTIntOperation_3= ruleSMTIntOperation | this_SMTITE_4= ruleSMTITE | this_SMTLet_5= ruleSMTLet | this_SMTRelation_6= ruleSMTRelation | this_SMTQuantifiedExpression_7= ruleSMTQuantifiedExpression ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1122:1: (this_SMTSymbolicValue_0= ruleSMTSymbolicValue | this_SMTAtomicTerm_1= ruleSMTAtomicTerm | this_SMTBoolOperation_2= ruleSMTBoolOperation | this_SMTIntOperation_3= ruleSMTIntOperation | this_SMTITE_4= ruleSMTITE | this_SMTLet_5= ruleSMTLet | this_SMTRelation_6= ruleSMTRelation | this_SMTQuantifiedExpression_7= ruleSMTQuantifiedExpression )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1122:1: (this_SMTSymbolicValue_0= ruleSMTSymbolicValue | this_SMTAtomicTerm_1= ruleSMTAtomicTerm | this_SMTBoolOperation_2= ruleSMTBoolOperation | this_SMTIntOperation_3= ruleSMTIntOperation | this_SMTITE_4= ruleSMTITE | this_SMTLet_5= ruleSMTLet | this_SMTRelation_6= ruleSMTRelation | this_SMTQuantifiedExpression_7= ruleSMTQuantifiedExpression )
            int alt12=8;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1123:5: this_SMTSymbolicValue_0= ruleSMTSymbolicValue
                    {
                     
                            newCompositeNode(grammarAccess.getSMTTermAccess().getSMTSymbolicValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSMTSymbolicValue_in_ruleSMTTerm2513);
                    this_SMTSymbolicValue_0=ruleSMTSymbolicValue();

                    state._fsp--;

                     
                            current = this_SMTSymbolicValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1133:5: this_SMTAtomicTerm_1= ruleSMTAtomicTerm
                    {
                     
                            newCompositeNode(grammarAccess.getSMTTermAccess().getSMTAtomicTermParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSMTAtomicTerm_in_ruleSMTTerm2540);
                    this_SMTAtomicTerm_1=ruleSMTAtomicTerm();

                    state._fsp--;

                     
                            current = this_SMTAtomicTerm_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1143:5: this_SMTBoolOperation_2= ruleSMTBoolOperation
                    {
                     
                            newCompositeNode(grammarAccess.getSMTTermAccess().getSMTBoolOperationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSMTBoolOperation_in_ruleSMTTerm2567);
                    this_SMTBoolOperation_2=ruleSMTBoolOperation();

                    state._fsp--;

                     
                            current = this_SMTBoolOperation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1153:5: this_SMTIntOperation_3= ruleSMTIntOperation
                    {
                     
                            newCompositeNode(grammarAccess.getSMTTermAccess().getSMTIntOperationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSMTIntOperation_in_ruleSMTTerm2594);
                    this_SMTIntOperation_3=ruleSMTIntOperation();

                    state._fsp--;

                     
                            current = this_SMTIntOperation_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1163:5: this_SMTITE_4= ruleSMTITE
                    {
                     
                            newCompositeNode(grammarAccess.getSMTTermAccess().getSMTITEParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSMTITE_in_ruleSMTTerm2621);
                    this_SMTITE_4=ruleSMTITE();

                    state._fsp--;

                     
                            current = this_SMTITE_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1173:5: this_SMTLet_5= ruleSMTLet
                    {
                     
                            newCompositeNode(grammarAccess.getSMTTermAccess().getSMTLetParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSMTLet_in_ruleSMTTerm2648);
                    this_SMTLet_5=ruleSMTLet();

                    state._fsp--;

                     
                            current = this_SMTLet_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1183:5: this_SMTRelation_6= ruleSMTRelation
                    {
                     
                            newCompositeNode(grammarAccess.getSMTTermAccess().getSMTRelationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleSMTRelation_in_ruleSMTTerm2675);
                    this_SMTRelation_6=ruleSMTRelation();

                    state._fsp--;

                     
                            current = this_SMTRelation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1193:5: this_SMTQuantifiedExpression_7= ruleSMTQuantifiedExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSMTTermAccess().getSMTQuantifiedExpressionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleSMTQuantifiedExpression_in_ruleSMTTerm2702);
                    this_SMTQuantifiedExpression_7=ruleSMTQuantifiedExpression();

                    state._fsp--;

                     
                            current = this_SMTQuantifiedExpression_7; 
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
    // $ANTLR end "ruleSMTTerm"


    // $ANTLR start "entryRuleSMTSymbolicValue"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1211:1: entryRuleSMTSymbolicValue returns [EObject current=null] : iv_ruleSMTSymbolicValue= ruleSMTSymbolicValue EOF ;
    public final EObject entryRuleSMTSymbolicValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTSymbolicValue = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1212:2: (iv_ruleSMTSymbolicValue= ruleSMTSymbolicValue EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1213:2: iv_ruleSMTSymbolicValue= ruleSMTSymbolicValue EOF
            {
             newCompositeNode(grammarAccess.getSMTSymbolicValueRule()); 
            pushFollow(FOLLOW_ruleSMTSymbolicValue_in_entryRuleSMTSymbolicValue2739);
            iv_ruleSMTSymbolicValue=ruleSMTSymbolicValue();

            state._fsp--;

             current =iv_ruleSMTSymbolicValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTSymbolicValue2749); 

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
    // $ANTLR end "entryRuleSMTSymbolicValue"


    // $ANTLR start "ruleSMTSymbolicValue"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1220:1: ruleSMTSymbolicValue returns [EObject current=null] : ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) ( (lv_parameterSubstitutions_2_0= ruleSMTTerm ) )+ otherlv_3= ')' ) | ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleSMTSymbolicValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_parameterSubstitutions_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1223:28: ( ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) ( (lv_parameterSubstitutions_2_0= ruleSMTTerm ) )+ otherlv_3= ')' ) | ( (otherlv_4= RULE_ID ) ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1224:1: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) ( (lv_parameterSubstitutions_2_0= ruleSMTTerm ) )+ otherlv_3= ')' ) | ( (otherlv_4= RULE_ID ) ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1224:1: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) ( (lv_parameterSubstitutions_2_0= ruleSMTTerm ) )+ otherlv_3= ')' ) | ( (otherlv_4= RULE_ID ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1224:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) ( (lv_parameterSubstitutions_2_0= ruleSMTTerm ) )+ otherlv_3= ')' )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1224:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) ( (lv_parameterSubstitutions_2_0= ruleSMTTerm ) )+ otherlv_3= ')' )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1224:4: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) ( (lv_parameterSubstitutions_2_0= ruleSMTTerm ) )+ otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTSymbolicValue2787); 

                        	newLeafNode(otherlv_0, grammarAccess.getSMTSymbolicValueAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1228:1: ( (otherlv_1= RULE_ID ) )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1229:1: (otherlv_1= RULE_ID )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1229:1: (otherlv_1= RULE_ID )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1230:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSMTSymbolicValueRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSMTSymbolicValue2807); 

                    		newLeafNode(otherlv_1, grammarAccess.getSMTSymbolicValueAccess().getSymbolicReferenceSMTSymbolicDeclarationCrossReference_0_1_0()); 
                    	

                    }


                    }

                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1241:2: ( (lv_parameterSubstitutions_2_0= ruleSMTTerm ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID||(LA13_0>=RULE_INT && LA13_0<=RULE_REAL)||LA13_0==15||(LA13_0>=25 && LA13_0<=26)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1242:1: (lv_parameterSubstitutions_2_0= ruleSMTTerm )
                    	    {
                    	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1242:1: (lv_parameterSubstitutions_2_0= ruleSMTTerm )
                    	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1243:3: lv_parameterSubstitutions_2_0= ruleSMTTerm
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSMTSymbolicValueAccess().getParameterSubstitutionsSMTTermParserRuleCall_0_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTSymbolicValue2828);
                    	    lv_parameterSubstitutions_2_0=ruleSMTTerm();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSMTSymbolicValueRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameterSubstitutions",
                    	            		lv_parameterSubstitutions_2_0, 
                    	            		"SMTTerm");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTSymbolicValue2841); 

                        	newLeafNode(otherlv_3, grammarAccess.getSMTSymbolicValueAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1264:6: ( (otherlv_4= RULE_ID ) )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1264:6: ( (otherlv_4= RULE_ID ) )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1265:1: (otherlv_4= RULE_ID )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1265:1: (otherlv_4= RULE_ID )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1266:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSMTSymbolicValueRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSMTSymbolicValue2868); 

                    		newLeafNode(otherlv_4, grammarAccess.getSMTSymbolicValueAccess().getSymbolicReferenceSMTSymbolicDeclarationCrossReference_1_0()); 
                    	

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
    // $ANTLR end "ruleSMTSymbolicValue"


    // $ANTLR start "entryRuleSMTAtomicTerm"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1285:1: entryRuleSMTAtomicTerm returns [EObject current=null] : iv_ruleSMTAtomicTerm= ruleSMTAtomicTerm EOF ;
    public final EObject entryRuleSMTAtomicTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTAtomicTerm = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1286:2: (iv_ruleSMTAtomicTerm= ruleSMTAtomicTerm EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1287:2: iv_ruleSMTAtomicTerm= ruleSMTAtomicTerm EOF
            {
             newCompositeNode(grammarAccess.getSMTAtomicTermRule()); 
            pushFollow(FOLLOW_ruleSMTAtomicTerm_in_entryRuleSMTAtomicTerm2904);
            iv_ruleSMTAtomicTerm=ruleSMTAtomicTerm();

            state._fsp--;

             current =iv_ruleSMTAtomicTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTAtomicTerm2914); 

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
    // $ANTLR end "entryRuleSMTAtomicTerm"


    // $ANTLR start "ruleSMTAtomicTerm"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1294:1: ruleSMTAtomicTerm returns [EObject current=null] : (this_SMTIntLiteral_0= ruleSMTIntLiteral | this_SMTBoolLiteral_1= ruleSMTBoolLiteral | this_SMTRealLiteral_2= ruleSMTRealLiteral ) ;
    public final EObject ruleSMTAtomicTerm() throws RecognitionException {
        EObject current = null;

        EObject this_SMTIntLiteral_0 = null;

        EObject this_SMTBoolLiteral_1 = null;

        EObject this_SMTRealLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1297:28: ( (this_SMTIntLiteral_0= ruleSMTIntLiteral | this_SMTBoolLiteral_1= ruleSMTBoolLiteral | this_SMTRealLiteral_2= ruleSMTRealLiteral ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1298:1: (this_SMTIntLiteral_0= ruleSMTIntLiteral | this_SMTBoolLiteral_1= ruleSMTBoolLiteral | this_SMTRealLiteral_2= ruleSMTRealLiteral )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1298:1: (this_SMTIntLiteral_0= ruleSMTIntLiteral | this_SMTBoolLiteral_1= ruleSMTBoolLiteral | this_SMTRealLiteral_2= ruleSMTRealLiteral )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt15=1;
                }
                break;
            case 25:
            case 26:
                {
                alt15=2;
                }
                break;
            case RULE_REAL:
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
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1299:5: this_SMTIntLiteral_0= ruleSMTIntLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSMTAtomicTermAccess().getSMTIntLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSMTIntLiteral_in_ruleSMTAtomicTerm2961);
                    this_SMTIntLiteral_0=ruleSMTIntLiteral();

                    state._fsp--;

                     
                            current = this_SMTIntLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1309:5: this_SMTBoolLiteral_1= ruleSMTBoolLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSMTAtomicTermAccess().getSMTBoolLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSMTBoolLiteral_in_ruleSMTAtomicTerm2988);
                    this_SMTBoolLiteral_1=ruleSMTBoolLiteral();

                    state._fsp--;

                     
                            current = this_SMTBoolLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1319:5: this_SMTRealLiteral_2= ruleSMTRealLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSMTAtomicTermAccess().getSMTRealLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSMTRealLiteral_in_ruleSMTAtomicTerm3015);
                    this_SMTRealLiteral_2=ruleSMTRealLiteral();

                    state._fsp--;

                     
                            current = this_SMTRealLiteral_2; 
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
    // $ANTLR end "ruleSMTAtomicTerm"


    // $ANTLR start "entryRuleSMTIntLiteral"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1335:1: entryRuleSMTIntLiteral returns [EObject current=null] : iv_ruleSMTIntLiteral= ruleSMTIntLiteral EOF ;
    public final EObject entryRuleSMTIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTIntLiteral = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1336:2: (iv_ruleSMTIntLiteral= ruleSMTIntLiteral EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1337:2: iv_ruleSMTIntLiteral= ruleSMTIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getSMTIntLiteralRule()); 
            pushFollow(FOLLOW_ruleSMTIntLiteral_in_entryRuleSMTIntLiteral3050);
            iv_ruleSMTIntLiteral=ruleSMTIntLiteral();

            state._fsp--;

             current =iv_ruleSMTIntLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTIntLiteral3060); 

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
    // $ANTLR end "entryRuleSMTIntLiteral"


    // $ANTLR start "ruleSMTIntLiteral"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1344:1: ruleSMTIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleSMTIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1347:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1348:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1348:1: ( (lv_value_0_0= RULE_INT ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1349:1: (lv_value_0_0= RULE_INT )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1349:1: (lv_value_0_0= RULE_INT )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1350:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSMTIntLiteral3101); 

            			newLeafNode(lv_value_0_0, grammarAccess.getSMTIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSMTIntLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleSMTIntLiteral"


    // $ANTLR start "entryRuleBOOLEANTERMINAL"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1374:1: entryRuleBOOLEANTERMINAL returns [String current=null] : iv_ruleBOOLEANTERMINAL= ruleBOOLEANTERMINAL EOF ;
    public final String entryRuleBOOLEANTERMINAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEANTERMINAL = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1375:2: (iv_ruleBOOLEANTERMINAL= ruleBOOLEANTERMINAL EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1376:2: iv_ruleBOOLEANTERMINAL= ruleBOOLEANTERMINAL EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANTERMINALRule()); 
            pushFollow(FOLLOW_ruleBOOLEANTERMINAL_in_entryRuleBOOLEANTERMINAL3142);
            iv_ruleBOOLEANTERMINAL=ruleBOOLEANTERMINAL();

            state._fsp--;

             current =iv_ruleBOOLEANTERMINAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEANTERMINAL3153); 

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
    // $ANTLR end "entryRuleBOOLEANTERMINAL"


    // $ANTLR start "ruleBOOLEANTERMINAL"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1383:1: ruleBOOLEANTERMINAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEANTERMINAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1386:28: ( (kw= 'true' | kw= 'false' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1387:1: (kw= 'true' | kw= 'false' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1387:1: (kw= 'true' | kw= 'false' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            else if ( (LA16_0==26) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1388:2: kw= 'true'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleBOOLEANTERMINAL3191); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLEANTERMINALAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1395:2: kw= 'false'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleBOOLEANTERMINAL3210); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLEANTERMINALAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "ruleBOOLEANTERMINAL"


    // $ANTLR start "entryRuleSMTBoolLiteral"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1408:1: entryRuleSMTBoolLiteral returns [EObject current=null] : iv_ruleSMTBoolLiteral= ruleSMTBoolLiteral EOF ;
    public final EObject entryRuleSMTBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTBoolLiteral = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1409:2: (iv_ruleSMTBoolLiteral= ruleSMTBoolLiteral EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1410:2: iv_ruleSMTBoolLiteral= ruleSMTBoolLiteral EOF
            {
             newCompositeNode(grammarAccess.getSMTBoolLiteralRule()); 
            pushFollow(FOLLOW_ruleSMTBoolLiteral_in_entryRuleSMTBoolLiteral3250);
            iv_ruleSMTBoolLiteral=ruleSMTBoolLiteral();

            state._fsp--;

             current =iv_ruleSMTBoolLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTBoolLiteral3260); 

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
    // $ANTLR end "entryRuleSMTBoolLiteral"


    // $ANTLR start "ruleSMTBoolLiteral"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1417:1: ruleSMTBoolLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleBOOLEANTERMINAL ) ) ;
    public final EObject ruleSMTBoolLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1420:28: ( ( (lv_value_0_0= ruleBOOLEANTERMINAL ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1421:1: ( (lv_value_0_0= ruleBOOLEANTERMINAL ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1421:1: ( (lv_value_0_0= ruleBOOLEANTERMINAL ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1422:1: (lv_value_0_0= ruleBOOLEANTERMINAL )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1422:1: (lv_value_0_0= ruleBOOLEANTERMINAL )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1423:3: lv_value_0_0= ruleBOOLEANTERMINAL
            {
             
            	        newCompositeNode(grammarAccess.getSMTBoolLiteralAccess().getValueBOOLEANTERMINALParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOLEANTERMINAL_in_ruleSMTBoolLiteral3305);
            lv_value_0_0=ruleBOOLEANTERMINAL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTBoolLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"BOOLEANTERMINAL");
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
    // $ANTLR end "ruleSMTBoolLiteral"


    // $ANTLR start "entryRuleSMTRealLiteral"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1447:1: entryRuleSMTRealLiteral returns [EObject current=null] : iv_ruleSMTRealLiteral= ruleSMTRealLiteral EOF ;
    public final EObject entryRuleSMTRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTRealLiteral = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1448:2: (iv_ruleSMTRealLiteral= ruleSMTRealLiteral EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1449:2: iv_ruleSMTRealLiteral= ruleSMTRealLiteral EOF
            {
             newCompositeNode(grammarAccess.getSMTRealLiteralRule()); 
            pushFollow(FOLLOW_ruleSMTRealLiteral_in_entryRuleSMTRealLiteral3340);
            iv_ruleSMTRealLiteral=ruleSMTRealLiteral();

            state._fsp--;

             current =iv_ruleSMTRealLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTRealLiteral3350); 

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
    // $ANTLR end "entryRuleSMTRealLiteral"


    // $ANTLR start "ruleSMTRealLiteral"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1456:1: ruleSMTRealLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_REAL ) ) ;
    public final EObject ruleSMTRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1459:28: ( ( (lv_value_0_0= RULE_REAL ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1460:1: ( (lv_value_0_0= RULE_REAL ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1460:1: ( (lv_value_0_0= RULE_REAL ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1461:1: (lv_value_0_0= RULE_REAL )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1461:1: (lv_value_0_0= RULE_REAL )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1462:3: lv_value_0_0= RULE_REAL
            {
            lv_value_0_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleSMTRealLiteral3391); 

            			newLeafNode(lv_value_0_0, grammarAccess.getSMTRealLiteralAccess().getValueREALTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSMTRealLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"REAL");
            	    

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
    // $ANTLR end "ruleSMTRealLiteral"


    // $ANTLR start "entryRuleSMTSortedVariable"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1486:1: entryRuleSMTSortedVariable returns [EObject current=null] : iv_ruleSMTSortedVariable= ruleSMTSortedVariable EOF ;
    public final EObject entryRuleSMTSortedVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTSortedVariable = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1487:2: (iv_ruleSMTSortedVariable= ruleSMTSortedVariable EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1488:2: iv_ruleSMTSortedVariable= ruleSMTSortedVariable EOF
            {
             newCompositeNode(grammarAccess.getSMTSortedVariableRule()); 
            pushFollow(FOLLOW_ruleSMTSortedVariable_in_entryRuleSMTSortedVariable3431);
            iv_ruleSMTSortedVariable=ruleSMTSortedVariable();

            state._fsp--;

             current =iv_ruleSMTSortedVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTSortedVariable3441); 

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
    // $ANTLR end "entryRuleSMTSortedVariable"


    // $ANTLR start "ruleSMTSortedVariable"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1495:1: ruleSMTSortedVariable returns [EObject current=null] : (otherlv_0= '(' ( (lv_name_1_0= ruleSMTID ) ) ( (lv_range_2_0= ruleSMTTypeReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleSMTSortedVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_range_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1498:28: ( (otherlv_0= '(' ( (lv_name_1_0= ruleSMTID ) ) ( (lv_range_2_0= ruleSMTTypeReference ) ) otherlv_3= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1499:1: (otherlv_0= '(' ( (lv_name_1_0= ruleSMTID ) ) ( (lv_range_2_0= ruleSMTTypeReference ) ) otherlv_3= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1499:1: (otherlv_0= '(' ( (lv_name_1_0= ruleSMTID ) ) ( (lv_range_2_0= ruleSMTTypeReference ) ) otherlv_3= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1499:3: otherlv_0= '(' ( (lv_name_1_0= ruleSMTID ) ) ( (lv_range_2_0= ruleSMTTypeReference ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTSortedVariable3478); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTSortedVariableAccess().getLeftParenthesisKeyword_0());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1503:1: ( (lv_name_1_0= ruleSMTID ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1504:1: (lv_name_1_0= ruleSMTID )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1504:1: (lv_name_1_0= ruleSMTID )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1505:3: lv_name_1_0= ruleSMTID
            {
             
            	        newCompositeNode(grammarAccess.getSMTSortedVariableAccess().getNameSMTIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTID_in_ruleSMTSortedVariable3499);
            lv_name_1_0=ruleSMTID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTSortedVariableRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"SMTID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1521:2: ( (lv_range_2_0= ruleSMTTypeReference ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1522:1: (lv_range_2_0= ruleSMTTypeReference )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1522:1: (lv_range_2_0= ruleSMTTypeReference )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1523:3: lv_range_2_0= ruleSMTTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getSMTSortedVariableAccess().getRangeSMTTypeReferenceParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTypeReference_in_ruleSMTSortedVariable3520);
            lv_range_2_0=ruleSMTTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTSortedVariableRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_2_0, 
                    		"SMTTypeReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTSortedVariable3532); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTSortedVariableAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSMTSortedVariable"


    // $ANTLR start "entryRuleSMTQuantifiedExpression"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1551:1: entryRuleSMTQuantifiedExpression returns [EObject current=null] : iv_ruleSMTQuantifiedExpression= ruleSMTQuantifiedExpression EOF ;
    public final EObject entryRuleSMTQuantifiedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTQuantifiedExpression = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1552:2: (iv_ruleSMTQuantifiedExpression= ruleSMTQuantifiedExpression EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1553:2: iv_ruleSMTQuantifiedExpression= ruleSMTQuantifiedExpression EOF
            {
             newCompositeNode(grammarAccess.getSMTQuantifiedExpressionRule()); 
            pushFollow(FOLLOW_ruleSMTQuantifiedExpression_in_entryRuleSMTQuantifiedExpression3568);
            iv_ruleSMTQuantifiedExpression=ruleSMTQuantifiedExpression();

            state._fsp--;

             current =iv_ruleSMTQuantifiedExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTQuantifiedExpression3578); 

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
    // $ANTLR end "entryRuleSMTQuantifiedExpression"


    // $ANTLR start "ruleSMTQuantifiedExpression"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1560:1: ruleSMTQuantifiedExpression returns [EObject current=null] : (this_SMTExists_0= ruleSMTExists | this_SMTForall_1= ruleSMTForall ) ;
    public final EObject ruleSMTQuantifiedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SMTExists_0 = null;

        EObject this_SMTForall_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1563:28: ( (this_SMTExists_0= ruleSMTExists | this_SMTForall_1= ruleSMTForall ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1564:1: (this_SMTExists_0= ruleSMTExists | this_SMTForall_1= ruleSMTForall )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1564:1: (this_SMTExists_0= ruleSMTExists | this_SMTForall_1= ruleSMTForall )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==30) ) {
                    alt17=2;
                }
                else if ( (LA17_1==27) ) {
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
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1565:5: this_SMTExists_0= ruleSMTExists
                    {
                     
                            newCompositeNode(grammarAccess.getSMTQuantifiedExpressionAccess().getSMTExistsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSMTExists_in_ruleSMTQuantifiedExpression3625);
                    this_SMTExists_0=ruleSMTExists();

                    state._fsp--;

                     
                            current = this_SMTExists_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1575:5: this_SMTForall_1= ruleSMTForall
                    {
                     
                            newCompositeNode(grammarAccess.getSMTQuantifiedExpressionAccess().getSMTForallParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSMTForall_in_ruleSMTQuantifiedExpression3652);
                    this_SMTForall_1=ruleSMTForall();

                    state._fsp--;

                     
                            current = this_SMTForall_1; 
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
    // $ANTLR end "ruleSMTQuantifiedExpression"


    // $ANTLR start "entryRuleSMTExists"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1591:1: entryRuleSMTExists returns [EObject current=null] : iv_ruleSMTExists= ruleSMTExists EOF ;
    public final EObject entryRuleSMTExists() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTExists = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1592:2: (iv_ruleSMTExists= ruleSMTExists EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1593:2: iv_ruleSMTExists= ruleSMTExists EOF
            {
             newCompositeNode(grammarAccess.getSMTExistsRule()); 
            pushFollow(FOLLOW_ruleSMTExists_in_entryRuleSMTExists3687);
            iv_ruleSMTExists=ruleSMTExists();

            state._fsp--;

             current =iv_ruleSMTExists; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTExists3697); 

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
    // $ANTLR end "entryRuleSMTExists"


    // $ANTLR start "ruleSMTExists"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1600:1: ruleSMTExists returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'exists' otherlv_2= '(' ( (lv_quantifiedVariables_3_0= ruleSMTSortedVariable ) )+ otherlv_4= ')' ( ( (lv_expression_5_0= ruleSMTTerm ) ) | (otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')' ) ) otherlv_14= ')' ) ;
    public final EObject ruleSMTExists() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_quantifiedVariables_3_0 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_pattern_11_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1603:28: ( (otherlv_0= '(' otherlv_1= 'exists' otherlv_2= '(' ( (lv_quantifiedVariables_3_0= ruleSMTSortedVariable ) )+ otherlv_4= ')' ( ( (lv_expression_5_0= ruleSMTTerm ) ) | (otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')' ) ) otherlv_14= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1604:1: (otherlv_0= '(' otherlv_1= 'exists' otherlv_2= '(' ( (lv_quantifiedVariables_3_0= ruleSMTSortedVariable ) )+ otherlv_4= ')' ( ( (lv_expression_5_0= ruleSMTTerm ) ) | (otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')' ) ) otherlv_14= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1604:1: (otherlv_0= '(' otherlv_1= 'exists' otherlv_2= '(' ( (lv_quantifiedVariables_3_0= ruleSMTSortedVariable ) )+ otherlv_4= ')' ( ( (lv_expression_5_0= ruleSMTTerm ) ) | (otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')' ) ) otherlv_14= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1604:3: otherlv_0= '(' otherlv_1= 'exists' otherlv_2= '(' ( (lv_quantifiedVariables_3_0= ruleSMTSortedVariable ) )+ otherlv_4= ')' ( ( (lv_expression_5_0= ruleSMTTerm ) ) | (otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')' ) ) otherlv_14= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTExists3734); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTExistsAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleSMTExists3746); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTExistsAccess().getExistsKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSMTExists3758); 

                	newLeafNode(otherlv_2, grammarAccess.getSMTExistsAccess().getLeftParenthesisKeyword_2());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1616:1: ( (lv_quantifiedVariables_3_0= ruleSMTSortedVariable ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1617:1: (lv_quantifiedVariables_3_0= ruleSMTSortedVariable )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1617:1: (lv_quantifiedVariables_3_0= ruleSMTSortedVariable )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1618:3: lv_quantifiedVariables_3_0= ruleSMTSortedVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTExistsAccess().getQuantifiedVariablesSMTSortedVariableParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTSortedVariable_in_ruleSMTExists3779);
            	    lv_quantifiedVariables_3_0=ruleSMTSortedVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTExistsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"quantifiedVariables",
            	            		lv_quantifiedVariables_3_0, 
            	            		"SMTSortedVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTExists3792); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTExistsAccess().getRightParenthesisKeyword_4());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1638:1: ( ( (lv_expression_5_0= ruleSMTTerm ) ) | (otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_ID||LA19_1==27||(LA19_1>=30 && LA19_1<=49)) ) {
                    alt19=1;
                }
                else if ( (LA19_1==28) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0==RULE_ID||(LA19_0>=RULE_INT && LA19_0<=RULE_REAL)||(LA19_0>=25 && LA19_0<=26)) ) {
                alt19=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1638:2: ( (lv_expression_5_0= ruleSMTTerm ) )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1638:2: ( (lv_expression_5_0= ruleSMTTerm ) )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1639:1: (lv_expression_5_0= ruleSMTTerm )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1639:1: (lv_expression_5_0= ruleSMTTerm )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1640:3: lv_expression_5_0= ruleSMTTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getSMTExistsAccess().getExpressionSMTTermParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTExists3814);
                    lv_expression_5_0=ruleSMTTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSMTExistsRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"SMTTerm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1657:6: (otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')' )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1657:6: (otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')' )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1657:8: otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleSMTExists3833); 

                        	newLeafNode(otherlv_6, grammarAccess.getSMTExistsAccess().getLeftParenthesisKeyword_5_1_0());
                        
                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleSMTExists3845); 

                        	newLeafNode(otherlv_7, grammarAccess.getSMTExistsAccess().getExclamationMarkKeyword_5_1_1());
                        
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1665:1: ( (lv_expression_8_0= ruleSMTTerm ) )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1666:1: (lv_expression_8_0= ruleSMTTerm )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1666:1: (lv_expression_8_0= ruleSMTTerm )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1667:3: lv_expression_8_0= ruleSMTTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getSMTExistsAccess().getExpressionSMTTermParserRuleCall_5_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTExists3866);
                    lv_expression_8_0=ruleSMTTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSMTExistsRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_8_0, 
                            		"SMTTerm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleSMTExists3878); 

                        	newLeafNode(otherlv_9, grammarAccess.getSMTExistsAccess().getPatternKeyword_5_1_3());
                        
                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleSMTExists3890); 

                        	newLeafNode(otherlv_10, grammarAccess.getSMTExistsAccess().getLeftParenthesisKeyword_5_1_4());
                        
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1691:1: ( (lv_pattern_11_0= ruleSMTTerm ) )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1692:1: (lv_pattern_11_0= ruleSMTTerm )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1692:1: (lv_pattern_11_0= ruleSMTTerm )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1693:3: lv_pattern_11_0= ruleSMTTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getSMTExistsAccess().getPatternSMTTermParserRuleCall_5_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTExists3911);
                    lv_pattern_11_0=ruleSMTTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSMTExistsRule());
                    	        }
                           		set(
                           			current, 
                           			"pattern",
                            		lv_pattern_11_0, 
                            		"SMTTerm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleSMTExists3923); 

                        	newLeafNode(otherlv_12, grammarAccess.getSMTExistsAccess().getRightParenthesisKeyword_5_1_6());
                        
                    otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleSMTExists3935); 

                        	newLeafNode(otherlv_13, grammarAccess.getSMTExistsAccess().getRightParenthesisKeyword_5_1_7());
                        

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_17_in_ruleSMTExists3949); 

                	newLeafNode(otherlv_14, grammarAccess.getSMTExistsAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleSMTExists"


    // $ANTLR start "entryRuleSMTForall"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1729:1: entryRuleSMTForall returns [EObject current=null] : iv_ruleSMTForall= ruleSMTForall EOF ;
    public final EObject entryRuleSMTForall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTForall = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1730:2: (iv_ruleSMTForall= ruleSMTForall EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1731:2: iv_ruleSMTForall= ruleSMTForall EOF
            {
             newCompositeNode(grammarAccess.getSMTForallRule()); 
            pushFollow(FOLLOW_ruleSMTForall_in_entryRuleSMTForall3985);
            iv_ruleSMTForall=ruleSMTForall();

            state._fsp--;

             current =iv_ruleSMTForall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTForall3995); 

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
    // $ANTLR end "entryRuleSMTForall"


    // $ANTLR start "ruleSMTForall"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1738:1: ruleSMTForall returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'forall' otherlv_2= '(' ( (lv_quantifiedVariables_3_0= ruleSMTSortedVariable ) )+ otherlv_4= ')' ( ( (lv_expression_5_0= ruleSMTTerm ) ) | (otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')' ) ) otherlv_14= ')' ) ;
    public final EObject ruleSMTForall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_quantifiedVariables_3_0 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_pattern_11_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1741:28: ( (otherlv_0= '(' otherlv_1= 'forall' otherlv_2= '(' ( (lv_quantifiedVariables_3_0= ruleSMTSortedVariable ) )+ otherlv_4= ')' ( ( (lv_expression_5_0= ruleSMTTerm ) ) | (otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')' ) ) otherlv_14= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1742:1: (otherlv_0= '(' otherlv_1= 'forall' otherlv_2= '(' ( (lv_quantifiedVariables_3_0= ruleSMTSortedVariable ) )+ otherlv_4= ')' ( ( (lv_expression_5_0= ruleSMTTerm ) ) | (otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')' ) ) otherlv_14= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1742:1: (otherlv_0= '(' otherlv_1= 'forall' otherlv_2= '(' ( (lv_quantifiedVariables_3_0= ruleSMTSortedVariable ) )+ otherlv_4= ')' ( ( (lv_expression_5_0= ruleSMTTerm ) ) | (otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')' ) ) otherlv_14= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1742:3: otherlv_0= '(' otherlv_1= 'forall' otherlv_2= '(' ( (lv_quantifiedVariables_3_0= ruleSMTSortedVariable ) )+ otherlv_4= ')' ( ( (lv_expression_5_0= ruleSMTTerm ) ) | (otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')' ) ) otherlv_14= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTForall4032); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTForallAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleSMTForall4044); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTForallAccess().getForallKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSMTForall4056); 

                	newLeafNode(otherlv_2, grammarAccess.getSMTForallAccess().getLeftParenthesisKeyword_2());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1754:1: ( (lv_quantifiedVariables_3_0= ruleSMTSortedVariable ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1755:1: (lv_quantifiedVariables_3_0= ruleSMTSortedVariable )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1755:1: (lv_quantifiedVariables_3_0= ruleSMTSortedVariable )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1756:3: lv_quantifiedVariables_3_0= ruleSMTSortedVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTForallAccess().getQuantifiedVariablesSMTSortedVariableParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTSortedVariable_in_ruleSMTForall4077);
            	    lv_quantifiedVariables_3_0=ruleSMTSortedVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTForallRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"quantifiedVariables",
            	            		lv_quantifiedVariables_3_0, 
            	            		"SMTSortedVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTForall4090); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTForallAccess().getRightParenthesisKeyword_4());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1776:1: ( ( (lv_expression_5_0= ruleSMTTerm ) ) | (otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_ID||LA21_1==27||(LA21_1>=30 && LA21_1<=49)) ) {
                    alt21=1;
                }
                else if ( (LA21_1==28) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==RULE_ID||(LA21_0>=RULE_INT && LA21_0<=RULE_REAL)||(LA21_0>=25 && LA21_0<=26)) ) {
                alt21=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1776:2: ( (lv_expression_5_0= ruleSMTTerm ) )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1776:2: ( (lv_expression_5_0= ruleSMTTerm ) )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1777:1: (lv_expression_5_0= ruleSMTTerm )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1777:1: (lv_expression_5_0= ruleSMTTerm )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1778:3: lv_expression_5_0= ruleSMTTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getSMTForallAccess().getExpressionSMTTermParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTForall4112);
                    lv_expression_5_0=ruleSMTTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSMTForallRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"SMTTerm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1795:6: (otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')' )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1795:6: (otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')' )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1795:8: otherlv_6= '(' otherlv_7= '!' ( (lv_expression_8_0= ruleSMTTerm ) ) otherlv_9= ':pattern' otherlv_10= '(' ( (lv_pattern_11_0= ruleSMTTerm ) ) otherlv_12= ')' otherlv_13= ')'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleSMTForall4131); 

                        	newLeafNode(otherlv_6, grammarAccess.getSMTForallAccess().getLeftParenthesisKeyword_5_1_0());
                        
                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleSMTForall4143); 

                        	newLeafNode(otherlv_7, grammarAccess.getSMTForallAccess().getExclamationMarkKeyword_5_1_1());
                        
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1803:1: ( (lv_expression_8_0= ruleSMTTerm ) )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1804:1: (lv_expression_8_0= ruleSMTTerm )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1804:1: (lv_expression_8_0= ruleSMTTerm )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1805:3: lv_expression_8_0= ruleSMTTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getSMTForallAccess().getExpressionSMTTermParserRuleCall_5_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTForall4164);
                    lv_expression_8_0=ruleSMTTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSMTForallRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_8_0, 
                            		"SMTTerm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleSMTForall4176); 

                        	newLeafNode(otherlv_9, grammarAccess.getSMTForallAccess().getPatternKeyword_5_1_3());
                        
                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleSMTForall4188); 

                        	newLeafNode(otherlv_10, grammarAccess.getSMTForallAccess().getLeftParenthesisKeyword_5_1_4());
                        
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1829:1: ( (lv_pattern_11_0= ruleSMTTerm ) )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1830:1: (lv_pattern_11_0= ruleSMTTerm )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1830:1: (lv_pattern_11_0= ruleSMTTerm )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1831:3: lv_pattern_11_0= ruleSMTTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getSMTForallAccess().getPatternSMTTermParserRuleCall_5_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTForall4209);
                    lv_pattern_11_0=ruleSMTTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSMTForallRule());
                    	        }
                           		set(
                           			current, 
                           			"pattern",
                            		lv_pattern_11_0, 
                            		"SMTTerm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleSMTForall4221); 

                        	newLeafNode(otherlv_12, grammarAccess.getSMTForallAccess().getRightParenthesisKeyword_5_1_6());
                        
                    otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleSMTForall4233); 

                        	newLeafNode(otherlv_13, grammarAccess.getSMTForallAccess().getRightParenthesisKeyword_5_1_7());
                        

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_17_in_ruleSMTForall4247); 

                	newLeafNode(otherlv_14, grammarAccess.getSMTForallAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleSMTForall"


    // $ANTLR start "entryRuleSMTBoolOperation"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1867:1: entryRuleSMTBoolOperation returns [EObject current=null] : iv_ruleSMTBoolOperation= ruleSMTBoolOperation EOF ;
    public final EObject entryRuleSMTBoolOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTBoolOperation = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1868:2: (iv_ruleSMTBoolOperation= ruleSMTBoolOperation EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1869:2: iv_ruleSMTBoolOperation= ruleSMTBoolOperation EOF
            {
             newCompositeNode(grammarAccess.getSMTBoolOperationRule()); 
            pushFollow(FOLLOW_ruleSMTBoolOperation_in_entryRuleSMTBoolOperation4283);
            iv_ruleSMTBoolOperation=ruleSMTBoolOperation();

            state._fsp--;

             current =iv_ruleSMTBoolOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTBoolOperation4293); 

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
    // $ANTLR end "entryRuleSMTBoolOperation"


    // $ANTLR start "ruleSMTBoolOperation"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1876:1: ruleSMTBoolOperation returns [EObject current=null] : (this_SMTAnd_0= ruleSMTAnd | this_SMTOr_1= ruleSMTOr | this_SMTImpl_2= ruleSMTImpl | this_SMTNot_3= ruleSMTNot | this_SMTIff_4= ruleSMTIff ) ;
    public final EObject ruleSMTBoolOperation() throws RecognitionException {
        EObject current = null;

        EObject this_SMTAnd_0 = null;

        EObject this_SMTOr_1 = null;

        EObject this_SMTImpl_2 = null;

        EObject this_SMTNot_3 = null;

        EObject this_SMTIff_4 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1879:28: ( (this_SMTAnd_0= ruleSMTAnd | this_SMTOr_1= ruleSMTOr | this_SMTImpl_2= ruleSMTImpl | this_SMTNot_3= ruleSMTNot | this_SMTIff_4= ruleSMTIff ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1880:1: (this_SMTAnd_0= ruleSMTAnd | this_SMTOr_1= ruleSMTOr | this_SMTImpl_2= ruleSMTImpl | this_SMTNot_3= ruleSMTNot | this_SMTIff_4= ruleSMTIff )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1880:1: (this_SMTAnd_0= ruleSMTAnd | this_SMTOr_1= ruleSMTOr | this_SMTImpl_2= ruleSMTImpl | this_SMTNot_3= ruleSMTNot | this_SMTIff_4= ruleSMTIff )
            int alt22=5;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==15) ) {
                switch ( input.LA(2) ) {
                case 32:
                    {
                    alt22=2;
                    }
                    break;
                case 35:
                    {
                    alt22=5;
                    }
                    break;
                case 31:
                    {
                    alt22=1;
                    }
                    break;
                case 33:
                    {
                    alt22=3;
                    }
                    break;
                case 34:
                    {
                    alt22=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1881:5: this_SMTAnd_0= ruleSMTAnd
                    {
                     
                            newCompositeNode(grammarAccess.getSMTBoolOperationAccess().getSMTAndParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSMTAnd_in_ruleSMTBoolOperation4340);
                    this_SMTAnd_0=ruleSMTAnd();

                    state._fsp--;

                     
                            current = this_SMTAnd_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1891:5: this_SMTOr_1= ruleSMTOr
                    {
                     
                            newCompositeNode(grammarAccess.getSMTBoolOperationAccess().getSMTOrParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSMTOr_in_ruleSMTBoolOperation4367);
                    this_SMTOr_1=ruleSMTOr();

                    state._fsp--;

                     
                            current = this_SMTOr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1901:5: this_SMTImpl_2= ruleSMTImpl
                    {
                     
                            newCompositeNode(grammarAccess.getSMTBoolOperationAccess().getSMTImplParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSMTImpl_in_ruleSMTBoolOperation4394);
                    this_SMTImpl_2=ruleSMTImpl();

                    state._fsp--;

                     
                            current = this_SMTImpl_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1911:5: this_SMTNot_3= ruleSMTNot
                    {
                     
                            newCompositeNode(grammarAccess.getSMTBoolOperationAccess().getSMTNotParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSMTNot_in_ruleSMTBoolOperation4421);
                    this_SMTNot_3=ruleSMTNot();

                    state._fsp--;

                     
                            current = this_SMTNot_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1921:5: this_SMTIff_4= ruleSMTIff
                    {
                     
                            newCompositeNode(grammarAccess.getSMTBoolOperationAccess().getSMTIffParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSMTIff_in_ruleSMTBoolOperation4448);
                    this_SMTIff_4=ruleSMTIff();

                    state._fsp--;

                     
                            current = this_SMTIff_4; 
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
    // $ANTLR end "ruleSMTBoolOperation"


    // $ANTLR start "entryRuleSMTAnd"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1937:1: entryRuleSMTAnd returns [EObject current=null] : iv_ruleSMTAnd= ruleSMTAnd EOF ;
    public final EObject entryRuleSMTAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTAnd = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1938:2: (iv_ruleSMTAnd= ruleSMTAnd EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1939:2: iv_ruleSMTAnd= ruleSMTAnd EOF
            {
             newCompositeNode(grammarAccess.getSMTAndRule()); 
            pushFollow(FOLLOW_ruleSMTAnd_in_entryRuleSMTAnd4483);
            iv_ruleSMTAnd=ruleSMTAnd();

            state._fsp--;

             current =iv_ruleSMTAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTAnd4493); 

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
    // $ANTLR end "entryRuleSMTAnd"


    // $ANTLR start "ruleSMTAnd"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1946:1: ruleSMTAnd returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'and' ( (lv_operands_2_0= ruleSMTTerm ) )+ otherlv_3= ')' ) ;
    public final EObject ruleSMTAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operands_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1949:28: ( (otherlv_0= '(' otherlv_1= 'and' ( (lv_operands_2_0= ruleSMTTerm ) )+ otherlv_3= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1950:1: (otherlv_0= '(' otherlv_1= 'and' ( (lv_operands_2_0= ruleSMTTerm ) )+ otherlv_3= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1950:1: (otherlv_0= '(' otherlv_1= 'and' ( (lv_operands_2_0= ruleSMTTerm ) )+ otherlv_3= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1950:3: otherlv_0= '(' otherlv_1= 'and' ( (lv_operands_2_0= ruleSMTTerm ) )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTAnd4530); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTAndAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleSMTAnd4542); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTAndAccess().getAndKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1958:1: ( (lv_operands_2_0= ruleSMTTerm ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=RULE_INT && LA23_0<=RULE_REAL)||LA23_0==15||(LA23_0>=25 && LA23_0<=26)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1959:1: (lv_operands_2_0= ruleSMTTerm )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1959:1: (lv_operands_2_0= ruleSMTTerm )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1960:3: lv_operands_2_0= ruleSMTTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTAndAccess().getOperandsSMTTermParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTAnd4563);
            	    lv_operands_2_0=ruleSMTTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTAndRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operands",
            	            		lv_operands_2_0, 
            	            		"SMTTerm");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTAnd4576); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTAndAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSMTAnd"


    // $ANTLR start "entryRuleSMTOr"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1988:1: entryRuleSMTOr returns [EObject current=null] : iv_ruleSMTOr= ruleSMTOr EOF ;
    public final EObject entryRuleSMTOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTOr = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1989:2: (iv_ruleSMTOr= ruleSMTOr EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1990:2: iv_ruleSMTOr= ruleSMTOr EOF
            {
             newCompositeNode(grammarAccess.getSMTOrRule()); 
            pushFollow(FOLLOW_ruleSMTOr_in_entryRuleSMTOr4612);
            iv_ruleSMTOr=ruleSMTOr();

            state._fsp--;

             current =iv_ruleSMTOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTOr4622); 

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
    // $ANTLR end "entryRuleSMTOr"


    // $ANTLR start "ruleSMTOr"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:1997:1: ruleSMTOr returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'or' ( (lv_operands_2_0= ruleSMTTerm ) )+ otherlv_3= ')' ) ;
    public final EObject ruleSMTOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operands_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2000:28: ( (otherlv_0= '(' otherlv_1= 'or' ( (lv_operands_2_0= ruleSMTTerm ) )+ otherlv_3= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2001:1: (otherlv_0= '(' otherlv_1= 'or' ( (lv_operands_2_0= ruleSMTTerm ) )+ otherlv_3= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2001:1: (otherlv_0= '(' otherlv_1= 'or' ( (lv_operands_2_0= ruleSMTTerm ) )+ otherlv_3= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2001:3: otherlv_0= '(' otherlv_1= 'or' ( (lv_operands_2_0= ruleSMTTerm ) )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTOr4659); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTOrAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleSMTOr4671); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTOrAccess().getOrKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2009:1: ( (lv_operands_2_0= ruleSMTTerm ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||(LA24_0>=RULE_INT && LA24_0<=RULE_REAL)||LA24_0==15||(LA24_0>=25 && LA24_0<=26)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2010:1: (lv_operands_2_0= ruleSMTTerm )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2010:1: (lv_operands_2_0= ruleSMTTerm )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2011:3: lv_operands_2_0= ruleSMTTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTOrAccess().getOperandsSMTTermParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTOr4692);
            	    lv_operands_2_0=ruleSMTTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTOrRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operands",
            	            		lv_operands_2_0, 
            	            		"SMTTerm");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTOr4705); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTOrAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSMTOr"


    // $ANTLR start "entryRuleSMTImpl"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2039:1: entryRuleSMTImpl returns [EObject current=null] : iv_ruleSMTImpl= ruleSMTImpl EOF ;
    public final EObject entryRuleSMTImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTImpl = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2040:2: (iv_ruleSMTImpl= ruleSMTImpl EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2041:2: iv_ruleSMTImpl= ruleSMTImpl EOF
            {
             newCompositeNode(grammarAccess.getSMTImplRule()); 
            pushFollow(FOLLOW_ruleSMTImpl_in_entryRuleSMTImpl4741);
            iv_ruleSMTImpl=ruleSMTImpl();

            state._fsp--;

             current =iv_ruleSMTImpl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTImpl4751); 

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
    // $ANTLR end "entryRuleSMTImpl"


    // $ANTLR start "ruleSMTImpl"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2048:1: ruleSMTImpl returns [EObject current=null] : (otherlv_0= '(' otherlv_1= '=>' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMTImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2051:28: ( (otherlv_0= '(' otherlv_1= '=>' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2052:1: (otherlv_0= '(' otherlv_1= '=>' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2052:1: (otherlv_0= '(' otherlv_1= '=>' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2052:3: otherlv_0= '(' otherlv_1= '=>' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTImpl4788); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTImplAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleSMTImpl4800); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTImplAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2060:1: ( (lv_leftOperand_2_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2061:1: (lv_leftOperand_2_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2061:1: (lv_leftOperand_2_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2062:3: lv_leftOperand_2_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTImplAccess().getLeftOperandSMTTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTImpl4821);
            lv_leftOperand_2_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTImplRule());
            	        }
                   		set(
                   			current, 
                   			"leftOperand",
                    		lv_leftOperand_2_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2078:2: ( (lv_rightOperand_3_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2079:1: (lv_rightOperand_3_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2079:1: (lv_rightOperand_3_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2080:3: lv_rightOperand_3_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTImplAccess().getRightOperandSMTTermParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTImpl4842);
            lv_rightOperand_3_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTImplRule());
            	        }
                   		set(
                   			current, 
                   			"rightOperand",
                    		lv_rightOperand_3_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTImpl4854); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTImplAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTImpl"


    // $ANTLR start "entryRuleSMTNot"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2108:1: entryRuleSMTNot returns [EObject current=null] : iv_ruleSMTNot= ruleSMTNot EOF ;
    public final EObject entryRuleSMTNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTNot = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2109:2: (iv_ruleSMTNot= ruleSMTNot EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2110:2: iv_ruleSMTNot= ruleSMTNot EOF
            {
             newCompositeNode(grammarAccess.getSMTNotRule()); 
            pushFollow(FOLLOW_ruleSMTNot_in_entryRuleSMTNot4890);
            iv_ruleSMTNot=ruleSMTNot();

            state._fsp--;

             current =iv_ruleSMTNot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTNot4900); 

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
    // $ANTLR end "entryRuleSMTNot"


    // $ANTLR start "ruleSMTNot"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2117:1: ruleSMTNot returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'not' ( (lv_operand_2_0= ruleSMTTerm ) ) otherlv_3= ')' ) ;
    public final EObject ruleSMTNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2120:28: ( (otherlv_0= '(' otherlv_1= 'not' ( (lv_operand_2_0= ruleSMTTerm ) ) otherlv_3= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2121:1: (otherlv_0= '(' otherlv_1= 'not' ( (lv_operand_2_0= ruleSMTTerm ) ) otherlv_3= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2121:1: (otherlv_0= '(' otherlv_1= 'not' ( (lv_operand_2_0= ruleSMTTerm ) ) otherlv_3= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2121:3: otherlv_0= '(' otherlv_1= 'not' ( (lv_operand_2_0= ruleSMTTerm ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTNot4937); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTNotAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleSMTNot4949); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTNotAccess().getNotKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2129:1: ( (lv_operand_2_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2130:1: (lv_operand_2_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2130:1: (lv_operand_2_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2131:3: lv_operand_2_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTNotAccess().getOperandSMTTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTNot4970);
            lv_operand_2_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTNotRule());
            	        }
                   		set(
                   			current, 
                   			"operand",
                    		lv_operand_2_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTNot4982); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTNotAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSMTNot"


    // $ANTLR start "entryRuleSMTIff"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2159:1: entryRuleSMTIff returns [EObject current=null] : iv_ruleSMTIff= ruleSMTIff EOF ;
    public final EObject entryRuleSMTIff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTIff = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2160:2: (iv_ruleSMTIff= ruleSMTIff EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2161:2: iv_ruleSMTIff= ruleSMTIff EOF
            {
             newCompositeNode(grammarAccess.getSMTIffRule()); 
            pushFollow(FOLLOW_ruleSMTIff_in_entryRuleSMTIff5018);
            iv_ruleSMTIff=ruleSMTIff();

            state._fsp--;

             current =iv_ruleSMTIff; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTIff5028); 

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
    // $ANTLR end "entryRuleSMTIff"


    // $ANTLR start "ruleSMTIff"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2168:1: ruleSMTIff returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'iff' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMTIff() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2171:28: ( (otherlv_0= '(' otherlv_1= 'iff' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2172:1: (otherlv_0= '(' otherlv_1= 'iff' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2172:1: (otherlv_0= '(' otherlv_1= 'iff' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2172:3: otherlv_0= '(' otherlv_1= 'iff' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTIff5065); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTIffAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleSMTIff5077); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTIffAccess().getIffKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2180:1: ( (lv_leftOperand_2_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2181:1: (lv_leftOperand_2_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2181:1: (lv_leftOperand_2_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2182:3: lv_leftOperand_2_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTIffAccess().getLeftOperandSMTTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTIff5098);
            lv_leftOperand_2_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTIffRule());
            	        }
                   		set(
                   			current, 
                   			"leftOperand",
                    		lv_leftOperand_2_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2198:2: ( (lv_rightOperand_3_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2199:1: (lv_rightOperand_3_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2199:1: (lv_rightOperand_3_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2200:3: lv_rightOperand_3_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTIffAccess().getRightOperandSMTTermParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTIff5119);
            lv_rightOperand_3_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTIffRule());
            	        }
                   		set(
                   			current, 
                   			"rightOperand",
                    		lv_rightOperand_3_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTIff5131); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTIffAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTIff"


    // $ANTLR start "entryRuleSMTITE"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2228:1: entryRuleSMTITE returns [EObject current=null] : iv_ruleSMTITE= ruleSMTITE EOF ;
    public final EObject entryRuleSMTITE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTITE = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2229:2: (iv_ruleSMTITE= ruleSMTITE EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2230:2: iv_ruleSMTITE= ruleSMTITE EOF
            {
             newCompositeNode(grammarAccess.getSMTITERule()); 
            pushFollow(FOLLOW_ruleSMTITE_in_entryRuleSMTITE5167);
            iv_ruleSMTITE=ruleSMTITE();

            state._fsp--;

             current =iv_ruleSMTITE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTITE5177); 

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
    // $ANTLR end "entryRuleSMTITE"


    // $ANTLR start "ruleSMTITE"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2237:1: ruleSMTITE returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'ite' ( (lv_condition_2_0= ruleSMTTerm ) ) ( (lv_if_3_0= ruleSMTTerm ) ) ( (lv_else_4_0= ruleSMTTerm ) ) otherlv_5= ')' ) ;
    public final EObject ruleSMTITE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_if_3_0 = null;

        EObject lv_else_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2240:28: ( (otherlv_0= '(' otherlv_1= 'ite' ( (lv_condition_2_0= ruleSMTTerm ) ) ( (lv_if_3_0= ruleSMTTerm ) ) ( (lv_else_4_0= ruleSMTTerm ) ) otherlv_5= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2241:1: (otherlv_0= '(' otherlv_1= 'ite' ( (lv_condition_2_0= ruleSMTTerm ) ) ( (lv_if_3_0= ruleSMTTerm ) ) ( (lv_else_4_0= ruleSMTTerm ) ) otherlv_5= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2241:1: (otherlv_0= '(' otherlv_1= 'ite' ( (lv_condition_2_0= ruleSMTTerm ) ) ( (lv_if_3_0= ruleSMTTerm ) ) ( (lv_else_4_0= ruleSMTTerm ) ) otherlv_5= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2241:3: otherlv_0= '(' otherlv_1= 'ite' ( (lv_condition_2_0= ruleSMTTerm ) ) ( (lv_if_3_0= ruleSMTTerm ) ) ( (lv_else_4_0= ruleSMTTerm ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTITE5214); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTITEAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleSMTITE5226); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTITEAccess().getIteKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2249:1: ( (lv_condition_2_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2250:1: (lv_condition_2_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2250:1: (lv_condition_2_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2251:3: lv_condition_2_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTITEAccess().getConditionSMTTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTITE5247);
            lv_condition_2_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTITERule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_2_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2267:2: ( (lv_if_3_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2268:1: (lv_if_3_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2268:1: (lv_if_3_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2269:3: lv_if_3_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTITEAccess().getIfSMTTermParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTITE5268);
            lv_if_3_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTITERule());
            	        }
                   		set(
                   			current, 
                   			"if",
                    		lv_if_3_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2285:2: ( (lv_else_4_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2286:1: (lv_else_4_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2286:1: (lv_else_4_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2287:3: lv_else_4_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTITEAccess().getElseSMTTermParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTITE5289);
            lv_else_4_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTITERule());
            	        }
                   		set(
                   			current, 
                   			"else",
                    		lv_else_4_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSMTITE5301); 

                	newLeafNode(otherlv_5, grammarAccess.getSMTITEAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleSMTITE"


    // $ANTLR start "entryRuleSMTLet"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2315:1: entryRuleSMTLet returns [EObject current=null] : iv_ruleSMTLet= ruleSMTLet EOF ;
    public final EObject entryRuleSMTLet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTLet = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2316:2: (iv_ruleSMTLet= ruleSMTLet EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2317:2: iv_ruleSMTLet= ruleSMTLet EOF
            {
             newCompositeNode(grammarAccess.getSMTLetRule()); 
            pushFollow(FOLLOW_ruleSMTLet_in_entryRuleSMTLet5337);
            iv_ruleSMTLet=ruleSMTLet();

            state._fsp--;

             current =iv_ruleSMTLet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTLet5347); 

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
    // $ANTLR end "entryRuleSMTLet"


    // $ANTLR start "ruleSMTLet"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2324:1: ruleSMTLet returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'let' otherlv_2= '(' ( (lv_inlineConstantDefinitions_3_0= ruleSMTInlineConstantDefinition ) )+ otherlv_4= ')' ( (lv_term_5_0= ruleSMTTerm ) ) otherlv_6= ')' ) ;
    public final EObject ruleSMTLet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_inlineConstantDefinitions_3_0 = null;

        EObject lv_term_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2327:28: ( (otherlv_0= '(' otherlv_1= 'let' otherlv_2= '(' ( (lv_inlineConstantDefinitions_3_0= ruleSMTInlineConstantDefinition ) )+ otherlv_4= ')' ( (lv_term_5_0= ruleSMTTerm ) ) otherlv_6= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2328:1: (otherlv_0= '(' otherlv_1= 'let' otherlv_2= '(' ( (lv_inlineConstantDefinitions_3_0= ruleSMTInlineConstantDefinition ) )+ otherlv_4= ')' ( (lv_term_5_0= ruleSMTTerm ) ) otherlv_6= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2328:1: (otherlv_0= '(' otherlv_1= 'let' otherlv_2= '(' ( (lv_inlineConstantDefinitions_3_0= ruleSMTInlineConstantDefinition ) )+ otherlv_4= ')' ( (lv_term_5_0= ruleSMTTerm ) ) otherlv_6= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2328:3: otherlv_0= '(' otherlv_1= 'let' otherlv_2= '(' ( (lv_inlineConstantDefinitions_3_0= ruleSMTInlineConstantDefinition ) )+ otherlv_4= ')' ( (lv_term_5_0= ruleSMTTerm ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTLet5384); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTLetAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleSMTLet5396); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTLetAccess().getLetKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSMTLet5408); 

                	newLeafNode(otherlv_2, grammarAccess.getSMTLetAccess().getLeftParenthesisKeyword_2());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2340:1: ( (lv_inlineConstantDefinitions_3_0= ruleSMTInlineConstantDefinition ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==15) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2341:1: (lv_inlineConstantDefinitions_3_0= ruleSMTInlineConstantDefinition )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2341:1: (lv_inlineConstantDefinitions_3_0= ruleSMTInlineConstantDefinition )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2342:3: lv_inlineConstantDefinitions_3_0= ruleSMTInlineConstantDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTLetAccess().getInlineConstantDefinitionsSMTInlineConstantDefinitionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTInlineConstantDefinition_in_ruleSMTLet5429);
            	    lv_inlineConstantDefinitions_3_0=ruleSMTInlineConstantDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTLetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"inlineConstantDefinitions",
            	            		lv_inlineConstantDefinitions_3_0, 
            	            		"SMTInlineConstantDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTLet5442); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTLetAccess().getRightParenthesisKeyword_4());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2362:1: ( (lv_term_5_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2363:1: (lv_term_5_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2363:1: (lv_term_5_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2364:3: lv_term_5_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTLetAccess().getTermSMTTermParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTLet5463);
            lv_term_5_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTLetRule());
            	        }
                   		set(
                   			current, 
                   			"term",
                    		lv_term_5_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleSMTLet5475); 

                	newLeafNode(otherlv_6, grammarAccess.getSMTLetAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleSMTLet"


    // $ANTLR start "entryRuleSMTInlineConstantDefinition"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2392:1: entryRuleSMTInlineConstantDefinition returns [EObject current=null] : iv_ruleSMTInlineConstantDefinition= ruleSMTInlineConstantDefinition EOF ;
    public final EObject entryRuleSMTInlineConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTInlineConstantDefinition = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2393:2: (iv_ruleSMTInlineConstantDefinition= ruleSMTInlineConstantDefinition EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2394:2: iv_ruleSMTInlineConstantDefinition= ruleSMTInlineConstantDefinition EOF
            {
             newCompositeNode(grammarAccess.getSMTInlineConstantDefinitionRule()); 
            pushFollow(FOLLOW_ruleSMTInlineConstantDefinition_in_entryRuleSMTInlineConstantDefinition5511);
            iv_ruleSMTInlineConstantDefinition=ruleSMTInlineConstantDefinition();

            state._fsp--;

             current =iv_ruleSMTInlineConstantDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTInlineConstantDefinition5521); 

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
    // $ANTLR end "entryRuleSMTInlineConstantDefinition"


    // $ANTLR start "ruleSMTInlineConstantDefinition"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2401:1: ruleSMTInlineConstantDefinition returns [EObject current=null] : (otherlv_0= '(' ( (lv_name_1_0= ruleSMTID ) ) ( (lv_definition_2_0= ruleSMTTerm ) ) otherlv_3= ')' ) ;
    public final EObject ruleSMTInlineConstantDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_definition_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2404:28: ( (otherlv_0= '(' ( (lv_name_1_0= ruleSMTID ) ) ( (lv_definition_2_0= ruleSMTTerm ) ) otherlv_3= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2405:1: (otherlv_0= '(' ( (lv_name_1_0= ruleSMTID ) ) ( (lv_definition_2_0= ruleSMTTerm ) ) otherlv_3= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2405:1: (otherlv_0= '(' ( (lv_name_1_0= ruleSMTID ) ) ( (lv_definition_2_0= ruleSMTTerm ) ) otherlv_3= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2405:3: otherlv_0= '(' ( (lv_name_1_0= ruleSMTID ) ) ( (lv_definition_2_0= ruleSMTTerm ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTInlineConstantDefinition5558); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTInlineConstantDefinitionAccess().getLeftParenthesisKeyword_0());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2409:1: ( (lv_name_1_0= ruleSMTID ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2410:1: (lv_name_1_0= ruleSMTID )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2410:1: (lv_name_1_0= ruleSMTID )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2411:3: lv_name_1_0= ruleSMTID
            {
             
            	        newCompositeNode(grammarAccess.getSMTInlineConstantDefinitionAccess().getNameSMTIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTID_in_ruleSMTInlineConstantDefinition5579);
            lv_name_1_0=ruleSMTID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTInlineConstantDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"SMTID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2427:2: ( (lv_definition_2_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2428:1: (lv_definition_2_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2428:1: (lv_definition_2_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2429:3: lv_definition_2_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTInlineConstantDefinitionAccess().getDefinitionSMTTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTInlineConstantDefinition5600);
            lv_definition_2_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTInlineConstantDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"definition",
                    		lv_definition_2_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTInlineConstantDefinition5612); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTInlineConstantDefinitionAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSMTInlineConstantDefinition"


    // $ANTLR start "entryRuleSMTRelation"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2457:1: entryRuleSMTRelation returns [EObject current=null] : iv_ruleSMTRelation= ruleSMTRelation EOF ;
    public final EObject entryRuleSMTRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTRelation = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2458:2: (iv_ruleSMTRelation= ruleSMTRelation EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2459:2: iv_ruleSMTRelation= ruleSMTRelation EOF
            {
             newCompositeNode(grammarAccess.getSMTRelationRule()); 
            pushFollow(FOLLOW_ruleSMTRelation_in_entryRuleSMTRelation5648);
            iv_ruleSMTRelation=ruleSMTRelation();

            state._fsp--;

             current =iv_ruleSMTRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTRelation5658); 

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
    // $ANTLR end "entryRuleSMTRelation"


    // $ANTLR start "ruleSMTRelation"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2466:1: ruleSMTRelation returns [EObject current=null] : (this_SMTEquals_0= ruleSMTEquals | this_SMTDistinct_1= ruleSMTDistinct | this_SMTLT_2= ruleSMTLT | this_SMTMT_3= ruleSMTMT | this_SMTLEQ_4= ruleSMTLEQ | this_SMTMEQ_5= ruleSMTMEQ ) ;
    public final EObject ruleSMTRelation() throws RecognitionException {
        EObject current = null;

        EObject this_SMTEquals_0 = null;

        EObject this_SMTDistinct_1 = null;

        EObject this_SMTLT_2 = null;

        EObject this_SMTMT_3 = null;

        EObject this_SMTLEQ_4 = null;

        EObject this_SMTMEQ_5 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2469:28: ( (this_SMTEquals_0= ruleSMTEquals | this_SMTDistinct_1= ruleSMTDistinct | this_SMTLT_2= ruleSMTLT | this_SMTMT_3= ruleSMTMT | this_SMTLEQ_4= ruleSMTLEQ | this_SMTMEQ_5= ruleSMTMEQ ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2470:1: (this_SMTEquals_0= ruleSMTEquals | this_SMTDistinct_1= ruleSMTDistinct | this_SMTLT_2= ruleSMTLT | this_SMTMT_3= ruleSMTMT | this_SMTLEQ_4= ruleSMTLEQ | this_SMTMEQ_5= ruleSMTMEQ )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2470:1: (this_SMTEquals_0= ruleSMTEquals | this_SMTDistinct_1= ruleSMTDistinct | this_SMTLT_2= ruleSMTLT | this_SMTMT_3= ruleSMTMT | this_SMTLEQ_4= ruleSMTLEQ | this_SMTMEQ_5= ruleSMTMEQ )
            int alt26=6;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==15) ) {
                switch ( input.LA(2) ) {
                case 40:
                    {
                    alt26=3;
                    }
                    break;
                case 41:
                    {
                    alt26=4;
                    }
                    break;
                case 42:
                    {
                    alt26=5;
                    }
                    break;
                case 43:
                    {
                    alt26=6;
                    }
                    break;
                case 38:
                    {
                    alt26=1;
                    }
                    break;
                case 39:
                    {
                    alt26=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2471:5: this_SMTEquals_0= ruleSMTEquals
                    {
                     
                            newCompositeNode(grammarAccess.getSMTRelationAccess().getSMTEqualsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSMTEquals_in_ruleSMTRelation5705);
                    this_SMTEquals_0=ruleSMTEquals();

                    state._fsp--;

                     
                            current = this_SMTEquals_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2481:5: this_SMTDistinct_1= ruleSMTDistinct
                    {
                     
                            newCompositeNode(grammarAccess.getSMTRelationAccess().getSMTDistinctParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSMTDistinct_in_ruleSMTRelation5732);
                    this_SMTDistinct_1=ruleSMTDistinct();

                    state._fsp--;

                     
                            current = this_SMTDistinct_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2491:5: this_SMTLT_2= ruleSMTLT
                    {
                     
                            newCompositeNode(grammarAccess.getSMTRelationAccess().getSMTLTParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSMTLT_in_ruleSMTRelation5759);
                    this_SMTLT_2=ruleSMTLT();

                    state._fsp--;

                     
                            current = this_SMTLT_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2501:5: this_SMTMT_3= ruleSMTMT
                    {
                     
                            newCompositeNode(grammarAccess.getSMTRelationAccess().getSMTMTParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSMTMT_in_ruleSMTRelation5786);
                    this_SMTMT_3=ruleSMTMT();

                    state._fsp--;

                     
                            current = this_SMTMT_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2511:5: this_SMTLEQ_4= ruleSMTLEQ
                    {
                     
                            newCompositeNode(grammarAccess.getSMTRelationAccess().getSMTLEQParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSMTLEQ_in_ruleSMTRelation5813);
                    this_SMTLEQ_4=ruleSMTLEQ();

                    state._fsp--;

                     
                            current = this_SMTLEQ_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2521:5: this_SMTMEQ_5= ruleSMTMEQ
                    {
                     
                            newCompositeNode(grammarAccess.getSMTRelationAccess().getSMTMEQParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSMTMEQ_in_ruleSMTRelation5840);
                    this_SMTMEQ_5=ruleSMTMEQ();

                    state._fsp--;

                     
                            current = this_SMTMEQ_5; 
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
    // $ANTLR end "ruleSMTRelation"


    // $ANTLR start "entryRuleSMTEquals"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2537:1: entryRuleSMTEquals returns [EObject current=null] : iv_ruleSMTEquals= ruleSMTEquals EOF ;
    public final EObject entryRuleSMTEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTEquals = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2538:2: (iv_ruleSMTEquals= ruleSMTEquals EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2539:2: iv_ruleSMTEquals= ruleSMTEquals EOF
            {
             newCompositeNode(grammarAccess.getSMTEqualsRule()); 
            pushFollow(FOLLOW_ruleSMTEquals_in_entryRuleSMTEquals5875);
            iv_ruleSMTEquals=ruleSMTEquals();

            state._fsp--;

             current =iv_ruleSMTEquals; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTEquals5885); 

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
    // $ANTLR end "entryRuleSMTEquals"


    // $ANTLR start "ruleSMTEquals"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2546:1: ruleSMTEquals returns [EObject current=null] : (otherlv_0= '(' otherlv_1= '=' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMTEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2549:28: ( (otherlv_0= '(' otherlv_1= '=' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2550:1: (otherlv_0= '(' otherlv_1= '=' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2550:1: (otherlv_0= '(' otherlv_1= '=' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2550:3: otherlv_0= '(' otherlv_1= '=' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTEquals5922); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTEqualsAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleSMTEquals5934); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTEqualsAccess().getEqualsSignKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2558:1: ( (lv_leftOperand_2_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2559:1: (lv_leftOperand_2_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2559:1: (lv_leftOperand_2_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2560:3: lv_leftOperand_2_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTEqualsAccess().getLeftOperandSMTTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTEquals5955);
            lv_leftOperand_2_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTEqualsRule());
            	        }
                   		set(
                   			current, 
                   			"leftOperand",
                    		lv_leftOperand_2_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2576:2: ( (lv_rightOperand_3_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2577:1: (lv_rightOperand_3_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2577:1: (lv_rightOperand_3_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2578:3: lv_rightOperand_3_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTEqualsAccess().getRightOperandSMTTermParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTEquals5976);
            lv_rightOperand_3_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTEqualsRule());
            	        }
                   		set(
                   			current, 
                   			"rightOperand",
                    		lv_rightOperand_3_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTEquals5988); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTEqualsAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTEquals"


    // $ANTLR start "entryRuleSMTDistinct"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2606:1: entryRuleSMTDistinct returns [EObject current=null] : iv_ruleSMTDistinct= ruleSMTDistinct EOF ;
    public final EObject entryRuleSMTDistinct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTDistinct = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2607:2: (iv_ruleSMTDistinct= ruleSMTDistinct EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2608:2: iv_ruleSMTDistinct= ruleSMTDistinct EOF
            {
             newCompositeNode(grammarAccess.getSMTDistinctRule()); 
            pushFollow(FOLLOW_ruleSMTDistinct_in_entryRuleSMTDistinct6024);
            iv_ruleSMTDistinct=ruleSMTDistinct();

            state._fsp--;

             current =iv_ruleSMTDistinct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTDistinct6034); 

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
    // $ANTLR end "entryRuleSMTDistinct"


    // $ANTLR start "ruleSMTDistinct"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2615:1: ruleSMTDistinct returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'distinct' ( (lv_operands_2_0= ruleSMTTerm ) )+ otherlv_3= ')' ) ;
    public final EObject ruleSMTDistinct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operands_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2618:28: ( (otherlv_0= '(' otherlv_1= 'distinct' ( (lv_operands_2_0= ruleSMTTerm ) )+ otherlv_3= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2619:1: (otherlv_0= '(' otherlv_1= 'distinct' ( (lv_operands_2_0= ruleSMTTerm ) )+ otherlv_3= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2619:1: (otherlv_0= '(' otherlv_1= 'distinct' ( (lv_operands_2_0= ruleSMTTerm ) )+ otherlv_3= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2619:3: otherlv_0= '(' otherlv_1= 'distinct' ( (lv_operands_2_0= ruleSMTTerm ) )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTDistinct6071); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTDistinctAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleSMTDistinct6083); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTDistinctAccess().getDistinctKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2627:1: ( (lv_operands_2_0= ruleSMTTerm ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||(LA27_0>=RULE_INT && LA27_0<=RULE_REAL)||LA27_0==15||(LA27_0>=25 && LA27_0<=26)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2628:1: (lv_operands_2_0= ruleSMTTerm )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2628:1: (lv_operands_2_0= ruleSMTTerm )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2629:3: lv_operands_2_0= ruleSMTTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTDistinctAccess().getOperandsSMTTermParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTDistinct6104);
            	    lv_operands_2_0=ruleSMTTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTDistinctRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operands",
            	            		lv_operands_2_0, 
            	            		"SMTTerm");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTDistinct6117); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTDistinctAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSMTDistinct"


    // $ANTLR start "entryRuleSMTLT"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2657:1: entryRuleSMTLT returns [EObject current=null] : iv_ruleSMTLT= ruleSMTLT EOF ;
    public final EObject entryRuleSMTLT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTLT = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2658:2: (iv_ruleSMTLT= ruleSMTLT EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2659:2: iv_ruleSMTLT= ruleSMTLT EOF
            {
             newCompositeNode(grammarAccess.getSMTLTRule()); 
            pushFollow(FOLLOW_ruleSMTLT_in_entryRuleSMTLT6153);
            iv_ruleSMTLT=ruleSMTLT();

            state._fsp--;

             current =iv_ruleSMTLT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTLT6163); 

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
    // $ANTLR end "entryRuleSMTLT"


    // $ANTLR start "ruleSMTLT"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2666:1: ruleSMTLT returns [EObject current=null] : (otherlv_0= '(' otherlv_1= '<' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMTLT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2669:28: ( (otherlv_0= '(' otherlv_1= '<' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2670:1: (otherlv_0= '(' otherlv_1= '<' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2670:1: (otherlv_0= '(' otherlv_1= '<' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2670:3: otherlv_0= '(' otherlv_1= '<' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTLT6200); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTLTAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleSMTLT6212); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTLTAccess().getLessThanSignKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2678:1: ( (lv_leftOperand_2_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2679:1: (lv_leftOperand_2_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2679:1: (lv_leftOperand_2_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2680:3: lv_leftOperand_2_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTLTAccess().getLeftOperandSMTTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTLT6233);
            lv_leftOperand_2_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTLTRule());
            	        }
                   		set(
                   			current, 
                   			"leftOperand",
                    		lv_leftOperand_2_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2696:2: ( (lv_rightOperand_3_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2697:1: (lv_rightOperand_3_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2697:1: (lv_rightOperand_3_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2698:3: lv_rightOperand_3_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTLTAccess().getRightOperandSMTTermParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTLT6254);
            lv_rightOperand_3_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTLTRule());
            	        }
                   		set(
                   			current, 
                   			"rightOperand",
                    		lv_rightOperand_3_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTLT6266); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTLTAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTLT"


    // $ANTLR start "entryRuleSMTMT"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2726:1: entryRuleSMTMT returns [EObject current=null] : iv_ruleSMTMT= ruleSMTMT EOF ;
    public final EObject entryRuleSMTMT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTMT = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2727:2: (iv_ruleSMTMT= ruleSMTMT EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2728:2: iv_ruleSMTMT= ruleSMTMT EOF
            {
             newCompositeNode(grammarAccess.getSMTMTRule()); 
            pushFollow(FOLLOW_ruleSMTMT_in_entryRuleSMTMT6302);
            iv_ruleSMTMT=ruleSMTMT();

            state._fsp--;

             current =iv_ruleSMTMT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTMT6312); 

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
    // $ANTLR end "entryRuleSMTMT"


    // $ANTLR start "ruleSMTMT"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2735:1: ruleSMTMT returns [EObject current=null] : (otherlv_0= '(' otherlv_1= '>' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMTMT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2738:28: ( (otherlv_0= '(' otherlv_1= '>' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2739:1: (otherlv_0= '(' otherlv_1= '>' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2739:1: (otherlv_0= '(' otherlv_1= '>' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2739:3: otherlv_0= '(' otherlv_1= '>' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTMT6349); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTMTAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleSMTMT6361); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTMTAccess().getGreaterThanSignKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2747:1: ( (lv_leftOperand_2_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2748:1: (lv_leftOperand_2_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2748:1: (lv_leftOperand_2_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2749:3: lv_leftOperand_2_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTMTAccess().getLeftOperandSMTTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTMT6382);
            lv_leftOperand_2_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTMTRule());
            	        }
                   		set(
                   			current, 
                   			"leftOperand",
                    		lv_leftOperand_2_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2765:2: ( (lv_rightOperand_3_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2766:1: (lv_rightOperand_3_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2766:1: (lv_rightOperand_3_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2767:3: lv_rightOperand_3_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTMTAccess().getRightOperandSMTTermParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTMT6403);
            lv_rightOperand_3_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTMTRule());
            	        }
                   		set(
                   			current, 
                   			"rightOperand",
                    		lv_rightOperand_3_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTMT6415); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTMTAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTMT"


    // $ANTLR start "entryRuleSMTLEQ"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2795:1: entryRuleSMTLEQ returns [EObject current=null] : iv_ruleSMTLEQ= ruleSMTLEQ EOF ;
    public final EObject entryRuleSMTLEQ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTLEQ = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2796:2: (iv_ruleSMTLEQ= ruleSMTLEQ EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2797:2: iv_ruleSMTLEQ= ruleSMTLEQ EOF
            {
             newCompositeNode(grammarAccess.getSMTLEQRule()); 
            pushFollow(FOLLOW_ruleSMTLEQ_in_entryRuleSMTLEQ6451);
            iv_ruleSMTLEQ=ruleSMTLEQ();

            state._fsp--;

             current =iv_ruleSMTLEQ; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTLEQ6461); 

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
    // $ANTLR end "entryRuleSMTLEQ"


    // $ANTLR start "ruleSMTLEQ"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2804:1: ruleSMTLEQ returns [EObject current=null] : (otherlv_0= '(' otherlv_1= '<=' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMTLEQ() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2807:28: ( (otherlv_0= '(' otherlv_1= '<=' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2808:1: (otherlv_0= '(' otherlv_1= '<=' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2808:1: (otherlv_0= '(' otherlv_1= '<=' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2808:3: otherlv_0= '(' otherlv_1= '<=' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTLEQ6498); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTLEQAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleSMTLEQ6510); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTLEQAccess().getLessThanSignEqualsSignKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2816:1: ( (lv_leftOperand_2_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2817:1: (lv_leftOperand_2_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2817:1: (lv_leftOperand_2_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2818:3: lv_leftOperand_2_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTLEQAccess().getLeftOperandSMTTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTLEQ6531);
            lv_leftOperand_2_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTLEQRule());
            	        }
                   		set(
                   			current, 
                   			"leftOperand",
                    		lv_leftOperand_2_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2834:2: ( (lv_rightOperand_3_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2835:1: (lv_rightOperand_3_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2835:1: (lv_rightOperand_3_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2836:3: lv_rightOperand_3_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTLEQAccess().getRightOperandSMTTermParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTLEQ6552);
            lv_rightOperand_3_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTLEQRule());
            	        }
                   		set(
                   			current, 
                   			"rightOperand",
                    		lv_rightOperand_3_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTLEQ6564); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTLEQAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTLEQ"


    // $ANTLR start "entryRuleSMTMEQ"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2864:1: entryRuleSMTMEQ returns [EObject current=null] : iv_ruleSMTMEQ= ruleSMTMEQ EOF ;
    public final EObject entryRuleSMTMEQ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTMEQ = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2865:2: (iv_ruleSMTMEQ= ruleSMTMEQ EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2866:2: iv_ruleSMTMEQ= ruleSMTMEQ EOF
            {
             newCompositeNode(grammarAccess.getSMTMEQRule()); 
            pushFollow(FOLLOW_ruleSMTMEQ_in_entryRuleSMTMEQ6600);
            iv_ruleSMTMEQ=ruleSMTMEQ();

            state._fsp--;

             current =iv_ruleSMTMEQ; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTMEQ6610); 

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
    // $ANTLR end "entryRuleSMTMEQ"


    // $ANTLR start "ruleSMTMEQ"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2873:1: ruleSMTMEQ returns [EObject current=null] : (otherlv_0= '(' otherlv_1= '>=' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMTMEQ() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2876:28: ( (otherlv_0= '(' otherlv_1= '>=' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2877:1: (otherlv_0= '(' otherlv_1= '>=' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2877:1: (otherlv_0= '(' otherlv_1= '>=' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2877:3: otherlv_0= '(' otherlv_1= '>=' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTMEQ6647); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTMEQAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleSMTMEQ6659); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTMEQAccess().getGreaterThanSignEqualsSignKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2885:1: ( (lv_leftOperand_2_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2886:1: (lv_leftOperand_2_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2886:1: (lv_leftOperand_2_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2887:3: lv_leftOperand_2_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTMEQAccess().getLeftOperandSMTTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTMEQ6680);
            lv_leftOperand_2_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTMEQRule());
            	        }
                   		set(
                   			current, 
                   			"leftOperand",
                    		lv_leftOperand_2_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2903:2: ( (lv_rightOperand_3_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2904:1: (lv_rightOperand_3_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2904:1: (lv_rightOperand_3_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2905:3: lv_rightOperand_3_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTMEQAccess().getRightOperandSMTTermParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTMEQ6701);
            lv_rightOperand_3_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTMEQRule());
            	        }
                   		set(
                   			current, 
                   			"rightOperand",
                    		lv_rightOperand_3_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTMEQ6713); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTMEQAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTMEQ"


    // $ANTLR start "entryRuleSMTIntOperation"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2933:1: entryRuleSMTIntOperation returns [EObject current=null] : iv_ruleSMTIntOperation= ruleSMTIntOperation EOF ;
    public final EObject entryRuleSMTIntOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTIntOperation = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2934:2: (iv_ruleSMTIntOperation= ruleSMTIntOperation EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2935:2: iv_ruleSMTIntOperation= ruleSMTIntOperation EOF
            {
             newCompositeNode(grammarAccess.getSMTIntOperationRule()); 
            pushFollow(FOLLOW_ruleSMTIntOperation_in_entryRuleSMTIntOperation6749);
            iv_ruleSMTIntOperation=ruleSMTIntOperation();

            state._fsp--;

             current =iv_ruleSMTIntOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTIntOperation6759); 

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
    // $ANTLR end "entryRuleSMTIntOperation"


    // $ANTLR start "ruleSMTIntOperation"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2942:1: ruleSMTIntOperation returns [EObject current=null] : (this_SMTPlus_0= ruleSMTPlus | this_SMTMinus_1= ruleSMTMinus | this_SMTMultiply_2= ruleSMTMultiply | this_SMTDivison_3= ruleSMTDivison | this_SMTDiv_4= ruleSMTDiv | this_SMTMod_5= ruleSMTMod ) ;
    public final EObject ruleSMTIntOperation() throws RecognitionException {
        EObject current = null;

        EObject this_SMTPlus_0 = null;

        EObject this_SMTMinus_1 = null;

        EObject this_SMTMultiply_2 = null;

        EObject this_SMTDivison_3 = null;

        EObject this_SMTDiv_4 = null;

        EObject this_SMTMod_5 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2945:28: ( (this_SMTPlus_0= ruleSMTPlus | this_SMTMinus_1= ruleSMTMinus | this_SMTMultiply_2= ruleSMTMultiply | this_SMTDivison_3= ruleSMTDivison | this_SMTDiv_4= ruleSMTDiv | this_SMTMod_5= ruleSMTMod ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2946:1: (this_SMTPlus_0= ruleSMTPlus | this_SMTMinus_1= ruleSMTMinus | this_SMTMultiply_2= ruleSMTMultiply | this_SMTDivison_3= ruleSMTDivison | this_SMTDiv_4= ruleSMTDiv | this_SMTMod_5= ruleSMTMod )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2946:1: (this_SMTPlus_0= ruleSMTPlus | this_SMTMinus_1= ruleSMTMinus | this_SMTMultiply_2= ruleSMTMultiply | this_SMTDivison_3= ruleSMTDivison | this_SMTDiv_4= ruleSMTDiv | this_SMTMod_5= ruleSMTMod )
            int alt28=6;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==15) ) {
                switch ( input.LA(2) ) {
                case 44:
                    {
                    alt28=1;
                    }
                    break;
                case 45:
                    {
                    alt28=2;
                    }
                    break;
                case 46:
                    {
                    alt28=3;
                    }
                    break;
                case 47:
                    {
                    alt28=4;
                    }
                    break;
                case 48:
                    {
                    alt28=5;
                    }
                    break;
                case 49:
                    {
                    alt28=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2947:5: this_SMTPlus_0= ruleSMTPlus
                    {
                     
                            newCompositeNode(grammarAccess.getSMTIntOperationAccess().getSMTPlusParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSMTPlus_in_ruleSMTIntOperation6806);
                    this_SMTPlus_0=ruleSMTPlus();

                    state._fsp--;

                     
                            current = this_SMTPlus_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2957:5: this_SMTMinus_1= ruleSMTMinus
                    {
                     
                            newCompositeNode(grammarAccess.getSMTIntOperationAccess().getSMTMinusParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSMTMinus_in_ruleSMTIntOperation6833);
                    this_SMTMinus_1=ruleSMTMinus();

                    state._fsp--;

                     
                            current = this_SMTMinus_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2967:5: this_SMTMultiply_2= ruleSMTMultiply
                    {
                     
                            newCompositeNode(grammarAccess.getSMTIntOperationAccess().getSMTMultiplyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSMTMultiply_in_ruleSMTIntOperation6860);
                    this_SMTMultiply_2=ruleSMTMultiply();

                    state._fsp--;

                     
                            current = this_SMTMultiply_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2977:5: this_SMTDivison_3= ruleSMTDivison
                    {
                     
                            newCompositeNode(grammarAccess.getSMTIntOperationAccess().getSMTDivisonParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSMTDivison_in_ruleSMTIntOperation6887);
                    this_SMTDivison_3=ruleSMTDivison();

                    state._fsp--;

                     
                            current = this_SMTDivison_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2987:5: this_SMTDiv_4= ruleSMTDiv
                    {
                     
                            newCompositeNode(grammarAccess.getSMTIntOperationAccess().getSMTDivParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSMTDiv_in_ruleSMTIntOperation6914);
                    this_SMTDiv_4=ruleSMTDiv();

                    state._fsp--;

                     
                            current = this_SMTDiv_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:2997:5: this_SMTMod_5= ruleSMTMod
                    {
                     
                            newCompositeNode(grammarAccess.getSMTIntOperationAccess().getSMTModParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSMTMod_in_ruleSMTIntOperation6941);
                    this_SMTMod_5=ruleSMTMod();

                    state._fsp--;

                     
                            current = this_SMTMod_5; 
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
    // $ANTLR end "ruleSMTIntOperation"


    // $ANTLR start "entryRuleSMTPlus"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3013:1: entryRuleSMTPlus returns [EObject current=null] : iv_ruleSMTPlus= ruleSMTPlus EOF ;
    public final EObject entryRuleSMTPlus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTPlus = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3014:2: (iv_ruleSMTPlus= ruleSMTPlus EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3015:2: iv_ruleSMTPlus= ruleSMTPlus EOF
            {
             newCompositeNode(grammarAccess.getSMTPlusRule()); 
            pushFollow(FOLLOW_ruleSMTPlus_in_entryRuleSMTPlus6976);
            iv_ruleSMTPlus=ruleSMTPlus();

            state._fsp--;

             current =iv_ruleSMTPlus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTPlus6986); 

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
    // $ANTLR end "entryRuleSMTPlus"


    // $ANTLR start "ruleSMTPlus"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3022:1: ruleSMTPlus returns [EObject current=null] : (otherlv_0= '(' otherlv_1= '+' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMTPlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3025:28: ( (otherlv_0= '(' otherlv_1= '+' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3026:1: (otherlv_0= '(' otherlv_1= '+' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3026:1: (otherlv_0= '(' otherlv_1= '+' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3026:3: otherlv_0= '(' otherlv_1= '+' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTPlus7023); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTPlusAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleSMTPlus7035); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTPlusAccess().getPlusSignKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3034:1: ( (lv_leftOperand_2_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3035:1: (lv_leftOperand_2_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3035:1: (lv_leftOperand_2_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3036:3: lv_leftOperand_2_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTPlusAccess().getLeftOperandSMTTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTPlus7056);
            lv_leftOperand_2_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTPlusRule());
            	        }
                   		set(
                   			current, 
                   			"leftOperand",
                    		lv_leftOperand_2_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3052:2: ( (lv_rightOperand_3_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3053:1: (lv_rightOperand_3_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3053:1: (lv_rightOperand_3_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3054:3: lv_rightOperand_3_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTPlusAccess().getRightOperandSMTTermParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTPlus7077);
            lv_rightOperand_3_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTPlusRule());
            	        }
                   		set(
                   			current, 
                   			"rightOperand",
                    		lv_rightOperand_3_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTPlus7089); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTPlusAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTPlus"


    // $ANTLR start "entryRuleSMTMinus"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3082:1: entryRuleSMTMinus returns [EObject current=null] : iv_ruleSMTMinus= ruleSMTMinus EOF ;
    public final EObject entryRuleSMTMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTMinus = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3083:2: (iv_ruleSMTMinus= ruleSMTMinus EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3084:2: iv_ruleSMTMinus= ruleSMTMinus EOF
            {
             newCompositeNode(grammarAccess.getSMTMinusRule()); 
            pushFollow(FOLLOW_ruleSMTMinus_in_entryRuleSMTMinus7125);
            iv_ruleSMTMinus=ruleSMTMinus();

            state._fsp--;

             current =iv_ruleSMTMinus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTMinus7135); 

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
    // $ANTLR end "entryRuleSMTMinus"


    // $ANTLR start "ruleSMTMinus"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3091:1: ruleSMTMinus returns [EObject current=null] : (otherlv_0= '(' otherlv_1= '-' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) )? otherlv_4= ')' ) ;
    public final EObject ruleSMTMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3094:28: ( (otherlv_0= '(' otherlv_1= '-' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) )? otherlv_4= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3095:1: (otherlv_0= '(' otherlv_1= '-' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) )? otherlv_4= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3095:1: (otherlv_0= '(' otherlv_1= '-' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) )? otherlv_4= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3095:3: otherlv_0= '(' otherlv_1= '-' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTMinus7172); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTMinusAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleSMTMinus7184); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTMinusAccess().getHyphenMinusKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3103:1: ( (lv_leftOperand_2_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3104:1: (lv_leftOperand_2_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3104:1: (lv_leftOperand_2_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3105:3: lv_leftOperand_2_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTMinusAccess().getLeftOperandSMTTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTMinus7205);
            lv_leftOperand_2_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTMinusRule());
            	        }
                   		set(
                   			current, 
                   			"leftOperand",
                    		lv_leftOperand_2_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3121:2: ( (lv_rightOperand_3_0= ruleSMTTerm ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||(LA29_0>=RULE_INT && LA29_0<=RULE_REAL)||LA29_0==15||(LA29_0>=25 && LA29_0<=26)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3122:1: (lv_rightOperand_3_0= ruleSMTTerm )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3122:1: (lv_rightOperand_3_0= ruleSMTTerm )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3123:3: lv_rightOperand_3_0= ruleSMTTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getSMTMinusAccess().getRightOperandSMTTermParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTMinus7226);
                    lv_rightOperand_3_0=ruleSMTTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSMTMinusRule());
                    	        }
                           		set(
                           			current, 
                           			"rightOperand",
                            		lv_rightOperand_3_0, 
                            		"SMTTerm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTMinus7239); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTMinusAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTMinus"


    // $ANTLR start "entryRuleSMTMultiply"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3151:1: entryRuleSMTMultiply returns [EObject current=null] : iv_ruleSMTMultiply= ruleSMTMultiply EOF ;
    public final EObject entryRuleSMTMultiply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTMultiply = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3152:2: (iv_ruleSMTMultiply= ruleSMTMultiply EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3153:2: iv_ruleSMTMultiply= ruleSMTMultiply EOF
            {
             newCompositeNode(grammarAccess.getSMTMultiplyRule()); 
            pushFollow(FOLLOW_ruleSMTMultiply_in_entryRuleSMTMultiply7275);
            iv_ruleSMTMultiply=ruleSMTMultiply();

            state._fsp--;

             current =iv_ruleSMTMultiply; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTMultiply7285); 

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
    // $ANTLR end "entryRuleSMTMultiply"


    // $ANTLR start "ruleSMTMultiply"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3160:1: ruleSMTMultiply returns [EObject current=null] : (otherlv_0= '(' otherlv_1= '*' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMTMultiply() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3163:28: ( (otherlv_0= '(' otherlv_1= '*' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3164:1: (otherlv_0= '(' otherlv_1= '*' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3164:1: (otherlv_0= '(' otherlv_1= '*' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3164:3: otherlv_0= '(' otherlv_1= '*' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTMultiply7322); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTMultiplyAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleSMTMultiply7334); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTMultiplyAccess().getAsteriskKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3172:1: ( (lv_leftOperand_2_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3173:1: (lv_leftOperand_2_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3173:1: (lv_leftOperand_2_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3174:3: lv_leftOperand_2_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTMultiplyAccess().getLeftOperandSMTTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTMultiply7355);
            lv_leftOperand_2_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTMultiplyRule());
            	        }
                   		set(
                   			current, 
                   			"leftOperand",
                    		lv_leftOperand_2_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3190:2: ( (lv_rightOperand_3_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3191:1: (lv_rightOperand_3_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3191:1: (lv_rightOperand_3_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3192:3: lv_rightOperand_3_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTMultiplyAccess().getRightOperandSMTTermParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTMultiply7376);
            lv_rightOperand_3_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTMultiplyRule());
            	        }
                   		set(
                   			current, 
                   			"rightOperand",
                    		lv_rightOperand_3_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTMultiply7388); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTMultiplyAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTMultiply"


    // $ANTLR start "entryRuleSMTDivison"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3220:1: entryRuleSMTDivison returns [EObject current=null] : iv_ruleSMTDivison= ruleSMTDivison EOF ;
    public final EObject entryRuleSMTDivison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTDivison = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3221:2: (iv_ruleSMTDivison= ruleSMTDivison EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3222:2: iv_ruleSMTDivison= ruleSMTDivison EOF
            {
             newCompositeNode(grammarAccess.getSMTDivisonRule()); 
            pushFollow(FOLLOW_ruleSMTDivison_in_entryRuleSMTDivison7424);
            iv_ruleSMTDivison=ruleSMTDivison();

            state._fsp--;

             current =iv_ruleSMTDivison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTDivison7434); 

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
    // $ANTLR end "entryRuleSMTDivison"


    // $ANTLR start "ruleSMTDivison"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3229:1: ruleSMTDivison returns [EObject current=null] : (otherlv_0= '(' otherlv_1= '/' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMTDivison() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3232:28: ( (otherlv_0= '(' otherlv_1= '/' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3233:1: (otherlv_0= '(' otherlv_1= '/' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3233:1: (otherlv_0= '(' otherlv_1= '/' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3233:3: otherlv_0= '(' otherlv_1= '/' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTDivison7471); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTDivisonAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleSMTDivison7483); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTDivisonAccess().getSolidusKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3241:1: ( (lv_leftOperand_2_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3242:1: (lv_leftOperand_2_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3242:1: (lv_leftOperand_2_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3243:3: lv_leftOperand_2_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTDivisonAccess().getLeftOperandSMTTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTDivison7504);
            lv_leftOperand_2_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTDivisonRule());
            	        }
                   		set(
                   			current, 
                   			"leftOperand",
                    		lv_leftOperand_2_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3259:2: ( (lv_rightOperand_3_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3260:1: (lv_rightOperand_3_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3260:1: (lv_rightOperand_3_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3261:3: lv_rightOperand_3_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTDivisonAccess().getRightOperandSMTTermParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTDivison7525);
            lv_rightOperand_3_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTDivisonRule());
            	        }
                   		set(
                   			current, 
                   			"rightOperand",
                    		lv_rightOperand_3_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTDivison7537); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTDivisonAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTDivison"


    // $ANTLR start "entryRuleSMTDiv"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3289:1: entryRuleSMTDiv returns [EObject current=null] : iv_ruleSMTDiv= ruleSMTDiv EOF ;
    public final EObject entryRuleSMTDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTDiv = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3290:2: (iv_ruleSMTDiv= ruleSMTDiv EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3291:2: iv_ruleSMTDiv= ruleSMTDiv EOF
            {
             newCompositeNode(grammarAccess.getSMTDivRule()); 
            pushFollow(FOLLOW_ruleSMTDiv_in_entryRuleSMTDiv7573);
            iv_ruleSMTDiv=ruleSMTDiv();

            state._fsp--;

             current =iv_ruleSMTDiv; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTDiv7583); 

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
    // $ANTLR end "entryRuleSMTDiv"


    // $ANTLR start "ruleSMTDiv"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3298:1: ruleSMTDiv returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'div' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMTDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3301:28: ( (otherlv_0= '(' otherlv_1= 'div' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3302:1: (otherlv_0= '(' otherlv_1= 'div' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3302:1: (otherlv_0= '(' otherlv_1= 'div' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3302:3: otherlv_0= '(' otherlv_1= 'div' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTDiv7620); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTDivAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleSMTDiv7632); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTDivAccess().getDivKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3310:1: ( (lv_leftOperand_2_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3311:1: (lv_leftOperand_2_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3311:1: (lv_leftOperand_2_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3312:3: lv_leftOperand_2_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTDivAccess().getLeftOperandSMTTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTDiv7653);
            lv_leftOperand_2_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTDivRule());
            	        }
                   		set(
                   			current, 
                   			"leftOperand",
                    		lv_leftOperand_2_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3328:2: ( (lv_rightOperand_3_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3329:1: (lv_rightOperand_3_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3329:1: (lv_rightOperand_3_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3330:3: lv_rightOperand_3_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTDivAccess().getRightOperandSMTTermParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTDiv7674);
            lv_rightOperand_3_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTDivRule());
            	        }
                   		set(
                   			current, 
                   			"rightOperand",
                    		lv_rightOperand_3_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTDiv7686); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTDivAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTDiv"


    // $ANTLR start "entryRuleSMTMod"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3358:1: entryRuleSMTMod returns [EObject current=null] : iv_ruleSMTMod= ruleSMTMod EOF ;
    public final EObject entryRuleSMTMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTMod = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3359:2: (iv_ruleSMTMod= ruleSMTMod EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3360:2: iv_ruleSMTMod= ruleSMTMod EOF
            {
             newCompositeNode(grammarAccess.getSMTModRule()); 
            pushFollow(FOLLOW_ruleSMTMod_in_entryRuleSMTMod7722);
            iv_ruleSMTMod=ruleSMTMod();

            state._fsp--;

             current =iv_ruleSMTMod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTMod7732); 

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
    // $ANTLR end "entryRuleSMTMod"


    // $ANTLR start "ruleSMTMod"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3367:1: ruleSMTMod returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'mod' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMTMod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_leftOperand_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3370:28: ( (otherlv_0= '(' otherlv_1= 'mod' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3371:1: (otherlv_0= '(' otherlv_1= 'mod' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3371:1: (otherlv_0= '(' otherlv_1= 'mod' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3371:3: otherlv_0= '(' otherlv_1= 'mod' ( (lv_leftOperand_2_0= ruleSMTTerm ) ) ( (lv_rightOperand_3_0= ruleSMTTerm ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTMod7769); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTModAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleSMTMod7781); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTModAccess().getModKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3379:1: ( (lv_leftOperand_2_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3380:1: (lv_leftOperand_2_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3380:1: (lv_leftOperand_2_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3381:3: lv_leftOperand_2_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTModAccess().getLeftOperandSMTTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTMod7802);
            lv_leftOperand_2_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTModRule());
            	        }
                   		set(
                   			current, 
                   			"leftOperand",
                    		lv_leftOperand_2_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3397:2: ( (lv_rightOperand_3_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3398:1: (lv_rightOperand_3_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3398:1: (lv_rightOperand_3_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3399:3: lv_rightOperand_3_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTModAccess().getRightOperandSMTTermParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTMod7823);
            lv_rightOperand_3_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTModRule());
            	        }
                   		set(
                   			current, 
                   			"rightOperand",
                    		lv_rightOperand_3_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTMod7835); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTModAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTMod"


    // $ANTLR start "entryRuleSMTAssertion"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3427:1: entryRuleSMTAssertion returns [EObject current=null] : iv_ruleSMTAssertion= ruleSMTAssertion EOF ;
    public final EObject entryRuleSMTAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTAssertion = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3428:2: (iv_ruleSMTAssertion= ruleSMTAssertion EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3429:2: iv_ruleSMTAssertion= ruleSMTAssertion EOF
            {
             newCompositeNode(grammarAccess.getSMTAssertionRule()); 
            pushFollow(FOLLOW_ruleSMTAssertion_in_entryRuleSMTAssertion7871);
            iv_ruleSMTAssertion=ruleSMTAssertion();

            state._fsp--;

             current =iv_ruleSMTAssertion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTAssertion7881); 

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
    // $ANTLR end "entryRuleSMTAssertion"


    // $ANTLR start "ruleSMTAssertion"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3436:1: ruleSMTAssertion returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'assert' ( (lv_value_2_0= ruleSMTTerm ) ) otherlv_3= ')' ) ;
    public final EObject ruleSMTAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3439:28: ( (otherlv_0= '(' otherlv_1= 'assert' ( (lv_value_2_0= ruleSMTTerm ) ) otherlv_3= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3440:1: (otherlv_0= '(' otherlv_1= 'assert' ( (lv_value_2_0= ruleSMTTerm ) ) otherlv_3= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3440:1: (otherlv_0= '(' otherlv_1= 'assert' ( (lv_value_2_0= ruleSMTTerm ) ) otherlv_3= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3440:3: otherlv_0= '(' otherlv_1= 'assert' ( (lv_value_2_0= ruleSMTTerm ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTAssertion7918); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTAssertionAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleSMTAssertion7930); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTAssertionAccess().getAssertKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3448:1: ( (lv_value_2_0= ruleSMTTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3449:1: (lv_value_2_0= ruleSMTTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3449:1: (lv_value_2_0= ruleSMTTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3450:3: lv_value_2_0= ruleSMTTerm
            {
             
            	        newCompositeNode(grammarAccess.getSMTAssertionAccess().getValueSMTTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTerm_in_ruleSMTAssertion7951);
            lv_value_2_0=ruleSMTTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTAssertionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"SMTTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTAssertion7963); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTAssertionAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSMTAssertion"


    // $ANTLR start "entryRuleSMTCardinalityConstraint"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3478:1: entryRuleSMTCardinalityConstraint returns [EObject current=null] : iv_ruleSMTCardinalityConstraint= ruleSMTCardinalityConstraint EOF ;
    public final EObject entryRuleSMTCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTCardinalityConstraint = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3479:2: (iv_ruleSMTCardinalityConstraint= ruleSMTCardinalityConstraint EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3480:2: iv_ruleSMTCardinalityConstraint= ruleSMTCardinalityConstraint EOF
            {
             newCompositeNode(grammarAccess.getSMTCardinalityConstraintRule()); 
            pushFollow(FOLLOW_ruleSMTCardinalityConstraint_in_entryRuleSMTCardinalityConstraint7999);
            iv_ruleSMTCardinalityConstraint=ruleSMTCardinalityConstraint();

            state._fsp--;

             current =iv_ruleSMTCardinalityConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTCardinalityConstraint8009); 

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
    // $ANTLR end "entryRuleSMTCardinalityConstraint"


    // $ANTLR start "ruleSMTCardinalityConstraint"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3487:1: ruleSMTCardinalityConstraint returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'forall' otherlv_2= '(' otherlv_3= '(' this_ID_4= RULE_ID ( (lv_type_5_0= ruleSMTTypeReference ) ) otherlv_6= ')' otherlv_7= ')' ( (otherlv_8= '(' otherlv_9= 'or' (otherlv_10= '(' otherlv_11= '=' this_ID_12= RULE_ID ( (lv_elements_13_0= ruleSMTSymbolicValue ) ) otherlv_14= ')' )* otherlv_15= ')' ) | (otherlv_16= '(' otherlv_17= '=' this_ID_18= RULE_ID ( (lv_elements_19_0= ruleSMTSymbolicValue ) ) otherlv_20= ')' ) ) otherlv_21= ')' ) ;
    public final EObject ruleSMTCardinalityConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_ID_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_ID_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token this_ID_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_type_5_0 = null;

        EObject lv_elements_13_0 = null;

        EObject lv_elements_19_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3490:28: ( (otherlv_0= '(' otherlv_1= 'forall' otherlv_2= '(' otherlv_3= '(' this_ID_4= RULE_ID ( (lv_type_5_0= ruleSMTTypeReference ) ) otherlv_6= ')' otherlv_7= ')' ( (otherlv_8= '(' otherlv_9= 'or' (otherlv_10= '(' otherlv_11= '=' this_ID_12= RULE_ID ( (lv_elements_13_0= ruleSMTSymbolicValue ) ) otherlv_14= ')' )* otherlv_15= ')' ) | (otherlv_16= '(' otherlv_17= '=' this_ID_18= RULE_ID ( (lv_elements_19_0= ruleSMTSymbolicValue ) ) otherlv_20= ')' ) ) otherlv_21= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3491:1: (otherlv_0= '(' otherlv_1= 'forall' otherlv_2= '(' otherlv_3= '(' this_ID_4= RULE_ID ( (lv_type_5_0= ruleSMTTypeReference ) ) otherlv_6= ')' otherlv_7= ')' ( (otherlv_8= '(' otherlv_9= 'or' (otherlv_10= '(' otherlv_11= '=' this_ID_12= RULE_ID ( (lv_elements_13_0= ruleSMTSymbolicValue ) ) otherlv_14= ')' )* otherlv_15= ')' ) | (otherlv_16= '(' otherlv_17= '=' this_ID_18= RULE_ID ( (lv_elements_19_0= ruleSMTSymbolicValue ) ) otherlv_20= ')' ) ) otherlv_21= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3491:1: (otherlv_0= '(' otherlv_1= 'forall' otherlv_2= '(' otherlv_3= '(' this_ID_4= RULE_ID ( (lv_type_5_0= ruleSMTTypeReference ) ) otherlv_6= ')' otherlv_7= ')' ( (otherlv_8= '(' otherlv_9= 'or' (otherlv_10= '(' otherlv_11= '=' this_ID_12= RULE_ID ( (lv_elements_13_0= ruleSMTSymbolicValue ) ) otherlv_14= ')' )* otherlv_15= ')' ) | (otherlv_16= '(' otherlv_17= '=' this_ID_18= RULE_ID ( (lv_elements_19_0= ruleSMTSymbolicValue ) ) otherlv_20= ')' ) ) otherlv_21= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3491:3: otherlv_0= '(' otherlv_1= 'forall' otherlv_2= '(' otherlv_3= '(' this_ID_4= RULE_ID ( (lv_type_5_0= ruleSMTTypeReference ) ) otherlv_6= ')' otherlv_7= ')' ( (otherlv_8= '(' otherlv_9= 'or' (otherlv_10= '(' otherlv_11= '=' this_ID_12= RULE_ID ( (lv_elements_13_0= ruleSMTSymbolicValue ) ) otherlv_14= ')' )* otherlv_15= ')' ) | (otherlv_16= '(' otherlv_17= '=' this_ID_18= RULE_ID ( (lv_elements_19_0= ruleSMTSymbolicValue ) ) otherlv_20= ')' ) ) otherlv_21= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTCardinalityConstraint8046); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTCardinalityConstraintAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleSMTCardinalityConstraint8058); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTCardinalityConstraintAccess().getForallKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSMTCardinalityConstraint8070); 

                	newLeafNode(otherlv_2, grammarAccess.getSMTCardinalityConstraintAccess().getLeftParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSMTCardinalityConstraint8082); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTCardinalityConstraintAccess().getLeftParenthesisKeyword_3());
                
            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSMTCardinalityConstraint8093); 
             
                newLeafNode(this_ID_4, grammarAccess.getSMTCardinalityConstraintAccess().getIDTerminalRuleCall_4()); 
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3511:1: ( (lv_type_5_0= ruleSMTTypeReference ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3512:1: (lv_type_5_0= ruleSMTTypeReference )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3512:1: (lv_type_5_0= ruleSMTTypeReference )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3513:3: lv_type_5_0= ruleSMTTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getSMTCardinalityConstraintAccess().getTypeSMTTypeReferenceParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTTypeReference_in_ruleSMTCardinalityConstraint8113);
            lv_type_5_0=ruleSMTTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTCardinalityConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_5_0, 
                    		"SMTTypeReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleSMTCardinalityConstraint8125); 

                	newLeafNode(otherlv_6, grammarAccess.getSMTCardinalityConstraintAccess().getRightParenthesisKeyword_6());
                
            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleSMTCardinalityConstraint8137); 

                	newLeafNode(otherlv_7, grammarAccess.getSMTCardinalityConstraintAccess().getRightParenthesisKeyword_7());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3537:1: ( (otherlv_8= '(' otherlv_9= 'or' (otherlv_10= '(' otherlv_11= '=' this_ID_12= RULE_ID ( (lv_elements_13_0= ruleSMTSymbolicValue ) ) otherlv_14= ')' )* otherlv_15= ')' ) | (otherlv_16= '(' otherlv_17= '=' this_ID_18= RULE_ID ( (lv_elements_19_0= ruleSMTSymbolicValue ) ) otherlv_20= ')' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==15) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==38) ) {
                    alt31=2;
                }
                else if ( (LA31_1==32) ) {
                    alt31=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3537:2: (otherlv_8= '(' otherlv_9= 'or' (otherlv_10= '(' otherlv_11= '=' this_ID_12= RULE_ID ( (lv_elements_13_0= ruleSMTSymbolicValue ) ) otherlv_14= ')' )* otherlv_15= ')' )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3537:2: (otherlv_8= '(' otherlv_9= 'or' (otherlv_10= '(' otherlv_11= '=' this_ID_12= RULE_ID ( (lv_elements_13_0= ruleSMTSymbolicValue ) ) otherlv_14= ')' )* otherlv_15= ')' )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3537:4: otherlv_8= '(' otherlv_9= 'or' (otherlv_10= '(' otherlv_11= '=' this_ID_12= RULE_ID ( (lv_elements_13_0= ruleSMTSymbolicValue ) ) otherlv_14= ')' )* otherlv_15= ')'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleSMTCardinalityConstraint8151); 

                        	newLeafNode(otherlv_8, grammarAccess.getSMTCardinalityConstraintAccess().getLeftParenthesisKeyword_8_0_0());
                        
                    otherlv_9=(Token)match(input,32,FOLLOW_32_in_ruleSMTCardinalityConstraint8163); 

                        	newLeafNode(otherlv_9, grammarAccess.getSMTCardinalityConstraintAccess().getOrKeyword_8_0_1());
                        
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3545:1: (otherlv_10= '(' otherlv_11= '=' this_ID_12= RULE_ID ( (lv_elements_13_0= ruleSMTSymbolicValue ) ) otherlv_14= ')' )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==15) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3545:3: otherlv_10= '(' otherlv_11= '=' this_ID_12= RULE_ID ( (lv_elements_13_0= ruleSMTSymbolicValue ) ) otherlv_14= ')'
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleSMTCardinalityConstraint8176); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getSMTCardinalityConstraintAccess().getLeftParenthesisKeyword_8_0_2_0());
                    	        
                    	    otherlv_11=(Token)match(input,38,FOLLOW_38_in_ruleSMTCardinalityConstraint8188); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getSMTCardinalityConstraintAccess().getEqualsSignKeyword_8_0_2_1());
                    	        
                    	    this_ID_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSMTCardinalityConstraint8199); 
                    	     
                    	        newLeafNode(this_ID_12, grammarAccess.getSMTCardinalityConstraintAccess().getIDTerminalRuleCall_8_0_2_2()); 
                    	        
                    	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3557:1: ( (lv_elements_13_0= ruleSMTSymbolicValue ) )
                    	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3558:1: (lv_elements_13_0= ruleSMTSymbolicValue )
                    	    {
                    	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3558:1: (lv_elements_13_0= ruleSMTSymbolicValue )
                    	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3559:3: lv_elements_13_0= ruleSMTSymbolicValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSMTCardinalityConstraintAccess().getElementsSMTSymbolicValueParserRuleCall_8_0_2_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSMTSymbolicValue_in_ruleSMTCardinalityConstraint8219);
                    	    lv_elements_13_0=ruleSMTSymbolicValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSMTCardinalityConstraintRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_13_0, 
                    	            		"SMTSymbolicValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_14=(Token)match(input,17,FOLLOW_17_in_ruleSMTCardinalityConstraint8231); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getSMTCardinalityConstraintAccess().getRightParenthesisKeyword_8_0_2_4());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleSMTCardinalityConstraint8245); 

                        	newLeafNode(otherlv_15, grammarAccess.getSMTCardinalityConstraintAccess().getRightParenthesisKeyword_8_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3584:6: (otherlv_16= '(' otherlv_17= '=' this_ID_18= RULE_ID ( (lv_elements_19_0= ruleSMTSymbolicValue ) ) otherlv_20= ')' )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3584:6: (otherlv_16= '(' otherlv_17= '=' this_ID_18= RULE_ID ( (lv_elements_19_0= ruleSMTSymbolicValue ) ) otherlv_20= ')' )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3584:8: otherlv_16= '(' otherlv_17= '=' this_ID_18= RULE_ID ( (lv_elements_19_0= ruleSMTSymbolicValue ) ) otherlv_20= ')'
                    {
                    otherlv_16=(Token)match(input,15,FOLLOW_15_in_ruleSMTCardinalityConstraint8265); 

                        	newLeafNode(otherlv_16, grammarAccess.getSMTCardinalityConstraintAccess().getLeftParenthesisKeyword_8_1_0());
                        
                    otherlv_17=(Token)match(input,38,FOLLOW_38_in_ruleSMTCardinalityConstraint8277); 

                        	newLeafNode(otherlv_17, grammarAccess.getSMTCardinalityConstraintAccess().getEqualsSignKeyword_8_1_1());
                        
                    this_ID_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSMTCardinalityConstraint8288); 
                     
                        newLeafNode(this_ID_18, grammarAccess.getSMTCardinalityConstraintAccess().getIDTerminalRuleCall_8_1_2()); 
                        
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3596:1: ( (lv_elements_19_0= ruleSMTSymbolicValue ) )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3597:1: (lv_elements_19_0= ruleSMTSymbolicValue )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3597:1: (lv_elements_19_0= ruleSMTSymbolicValue )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3598:3: lv_elements_19_0= ruleSMTSymbolicValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getSMTCardinalityConstraintAccess().getElementsSMTSymbolicValueParserRuleCall_8_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSMTSymbolicValue_in_ruleSMTCardinalityConstraint8308);
                    lv_elements_19_0=ruleSMTSymbolicValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSMTCardinalityConstraintRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_19_0, 
                            		"SMTSymbolicValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_20=(Token)match(input,17,FOLLOW_17_in_ruleSMTCardinalityConstraint8320); 

                        	newLeafNode(otherlv_20, grammarAccess.getSMTCardinalityConstraintAccess().getRightParenthesisKeyword_8_1_4());
                        

                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,17,FOLLOW_17_in_ruleSMTCardinalityConstraint8334); 

                	newLeafNode(otherlv_21, grammarAccess.getSMTCardinalityConstraintAccess().getRightParenthesisKeyword_9());
                

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
    // $ANTLR end "ruleSMTCardinalityConstraint"


    // $ANTLR start "entryRuleSMTSatCommand"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3630:1: entryRuleSMTSatCommand returns [EObject current=null] : iv_ruleSMTSatCommand= ruleSMTSatCommand EOF ;
    public final EObject entryRuleSMTSatCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTSatCommand = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3631:2: (iv_ruleSMTSatCommand= ruleSMTSatCommand EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3632:2: iv_ruleSMTSatCommand= ruleSMTSatCommand EOF
            {
             newCompositeNode(grammarAccess.getSMTSatCommandRule()); 
            pushFollow(FOLLOW_ruleSMTSatCommand_in_entryRuleSMTSatCommand8370);
            iv_ruleSMTSatCommand=ruleSMTSatCommand();

            state._fsp--;

             current =iv_ruleSMTSatCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTSatCommand8380); 

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
    // $ANTLR end "entryRuleSMTSatCommand"


    // $ANTLR start "ruleSMTSatCommand"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3639:1: ruleSMTSatCommand returns [EObject current=null] : (this_SMTSimpleSatCommand_0= ruleSMTSimpleSatCommand | this_SMTComplexSatCommand_1= ruleSMTComplexSatCommand ) ;
    public final EObject ruleSMTSatCommand() throws RecognitionException {
        EObject current = null;

        EObject this_SMTSimpleSatCommand_0 = null;

        EObject this_SMTComplexSatCommand_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3642:28: ( (this_SMTSimpleSatCommand_0= ruleSMTSimpleSatCommand | this_SMTComplexSatCommand_1= ruleSMTComplexSatCommand ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3643:1: (this_SMTSimpleSatCommand_0= ruleSMTSimpleSatCommand | this_SMTComplexSatCommand_1= ruleSMTComplexSatCommand )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3643:1: (this_SMTSimpleSatCommand_0= ruleSMTSimpleSatCommand | this_SMTComplexSatCommand_1= ruleSMTComplexSatCommand )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==15) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==51) ) {
                    alt32=1;
                }
                else if ( (LA32_1==52) ) {
                    alt32=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3644:5: this_SMTSimpleSatCommand_0= ruleSMTSimpleSatCommand
                    {
                     
                            newCompositeNode(grammarAccess.getSMTSatCommandAccess().getSMTSimpleSatCommandParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSMTSimpleSatCommand_in_ruleSMTSatCommand8427);
                    this_SMTSimpleSatCommand_0=ruleSMTSimpleSatCommand();

                    state._fsp--;

                     
                            current = this_SMTSimpleSatCommand_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3654:5: this_SMTComplexSatCommand_1= ruleSMTComplexSatCommand
                    {
                     
                            newCompositeNode(grammarAccess.getSMTSatCommandAccess().getSMTComplexSatCommandParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSMTComplexSatCommand_in_ruleSMTSatCommand8454);
                    this_SMTComplexSatCommand_1=ruleSMTComplexSatCommand();

                    state._fsp--;

                     
                            current = this_SMTComplexSatCommand_1; 
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
    // $ANTLR end "ruleSMTSatCommand"


    // $ANTLR start "entryRuleSMTSimpleSatCommand"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3670:1: entryRuleSMTSimpleSatCommand returns [EObject current=null] : iv_ruleSMTSimpleSatCommand= ruleSMTSimpleSatCommand EOF ;
    public final EObject entryRuleSMTSimpleSatCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTSimpleSatCommand = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3671:2: (iv_ruleSMTSimpleSatCommand= ruleSMTSimpleSatCommand EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3672:2: iv_ruleSMTSimpleSatCommand= ruleSMTSimpleSatCommand EOF
            {
             newCompositeNode(grammarAccess.getSMTSimpleSatCommandRule()); 
            pushFollow(FOLLOW_ruleSMTSimpleSatCommand_in_entryRuleSMTSimpleSatCommand8489);
            iv_ruleSMTSimpleSatCommand=ruleSMTSimpleSatCommand();

            state._fsp--;

             current =iv_ruleSMTSimpleSatCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTSimpleSatCommand8499); 

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
    // $ANTLR end "entryRuleSMTSimpleSatCommand"


    // $ANTLR start "ruleSMTSimpleSatCommand"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3679:1: ruleSMTSimpleSatCommand returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'check-sat' () otherlv_3= ')' ) ;
    public final EObject ruleSMTSimpleSatCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3682:28: ( (otherlv_0= '(' otherlv_1= 'check-sat' () otherlv_3= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3683:1: (otherlv_0= '(' otherlv_1= 'check-sat' () otherlv_3= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3683:1: (otherlv_0= '(' otherlv_1= 'check-sat' () otherlv_3= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3683:3: otherlv_0= '(' otherlv_1= 'check-sat' () otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTSimpleSatCommand8536); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTSimpleSatCommandAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleSMTSimpleSatCommand8548); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTSimpleSatCommandAccess().getCheckSatKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3691:1: ()
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3692:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSMTSimpleSatCommandAccess().getSMTSimpleSatCommandAction_2(),
                        current);
                

            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTSimpleSatCommand8569); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTSimpleSatCommandAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSMTSimpleSatCommand"


    // $ANTLR start "entryRuleSMTComplexSatCommand"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3709:1: entryRuleSMTComplexSatCommand returns [EObject current=null] : iv_ruleSMTComplexSatCommand= ruleSMTComplexSatCommand EOF ;
    public final EObject entryRuleSMTComplexSatCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTComplexSatCommand = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3710:2: (iv_ruleSMTComplexSatCommand= ruleSMTComplexSatCommand EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3711:2: iv_ruleSMTComplexSatCommand= ruleSMTComplexSatCommand EOF
            {
             newCompositeNode(grammarAccess.getSMTComplexSatCommandRule()); 
            pushFollow(FOLLOW_ruleSMTComplexSatCommand_in_entryRuleSMTComplexSatCommand8605);
            iv_ruleSMTComplexSatCommand=ruleSMTComplexSatCommand();

            state._fsp--;

             current =iv_ruleSMTComplexSatCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTComplexSatCommand8615); 

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
    // $ANTLR end "entryRuleSMTComplexSatCommand"


    // $ANTLR start "ruleSMTComplexSatCommand"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3718:1: ruleSMTComplexSatCommand returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'check-sat-using' ( (lv_method_2_0= ruleSMTReasoningTactic ) ) otherlv_3= ')' ) ;
    public final EObject ruleSMTComplexSatCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_method_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3721:28: ( (otherlv_0= '(' otherlv_1= 'check-sat-using' ( (lv_method_2_0= ruleSMTReasoningTactic ) ) otherlv_3= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3722:1: (otherlv_0= '(' otherlv_1= 'check-sat-using' ( (lv_method_2_0= ruleSMTReasoningTactic ) ) otherlv_3= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3722:1: (otherlv_0= '(' otherlv_1= 'check-sat-using' ( (lv_method_2_0= ruleSMTReasoningTactic ) ) otherlv_3= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3722:3: otherlv_0= '(' otherlv_1= 'check-sat-using' ( (lv_method_2_0= ruleSMTReasoningTactic ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTComplexSatCommand8652); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTComplexSatCommandAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleSMTComplexSatCommand8664); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTComplexSatCommandAccess().getCheckSatUsingKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3730:1: ( (lv_method_2_0= ruleSMTReasoningTactic ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3731:1: (lv_method_2_0= ruleSMTReasoningTactic )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3731:1: (lv_method_2_0= ruleSMTReasoningTactic )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3732:3: lv_method_2_0= ruleSMTReasoningTactic
            {
             
            	        newCompositeNode(grammarAccess.getSMTComplexSatCommandAccess().getMethodSMTReasoningTacticParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTReasoningTactic_in_ruleSMTComplexSatCommand8685);
            lv_method_2_0=ruleSMTReasoningTactic();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTComplexSatCommandRule());
            	        }
                   		set(
                   			current, 
                   			"method",
                    		lv_method_2_0, 
                    		"SMTReasoningTactic");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTComplexSatCommand8697); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTComplexSatCommandAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSMTComplexSatCommand"


    // $ANTLR start "entryRuleSMTGetModelCommand"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3760:1: entryRuleSMTGetModelCommand returns [EObject current=null] : iv_ruleSMTGetModelCommand= ruleSMTGetModelCommand EOF ;
    public final EObject entryRuleSMTGetModelCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTGetModelCommand = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3761:2: (iv_ruleSMTGetModelCommand= ruleSMTGetModelCommand EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3762:2: iv_ruleSMTGetModelCommand= ruleSMTGetModelCommand EOF
            {
             newCompositeNode(grammarAccess.getSMTGetModelCommandRule()); 
            pushFollow(FOLLOW_ruleSMTGetModelCommand_in_entryRuleSMTGetModelCommand8733);
            iv_ruleSMTGetModelCommand=ruleSMTGetModelCommand();

            state._fsp--;

             current =iv_ruleSMTGetModelCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTGetModelCommand8743); 

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
    // $ANTLR end "entryRuleSMTGetModelCommand"


    // $ANTLR start "ruleSMTGetModelCommand"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3769:1: ruleSMTGetModelCommand returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'get-model' () otherlv_3= ')' ) ;
    public final EObject ruleSMTGetModelCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3772:28: ( (otherlv_0= '(' otherlv_1= 'get-model' () otherlv_3= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3773:1: (otherlv_0= '(' otherlv_1= 'get-model' () otherlv_3= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3773:1: (otherlv_0= '(' otherlv_1= 'get-model' () otherlv_3= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3773:3: otherlv_0= '(' otherlv_1= 'get-model' () otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTGetModelCommand8780); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTGetModelCommandAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleSMTGetModelCommand8792); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTGetModelCommandAccess().getGetModelKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3781:1: ()
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3782:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSMTGetModelCommandAccess().getSMTGetModelCommandAction_2(),
                        current);
                

            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTGetModelCommand8813); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTGetModelCommandAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSMTGetModelCommand"


    // $ANTLR start "entryRuleSMTReasoningTactic"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3799:1: entryRuleSMTReasoningTactic returns [EObject current=null] : iv_ruleSMTReasoningTactic= ruleSMTReasoningTactic EOF ;
    public final EObject entryRuleSMTReasoningTactic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTReasoningTactic = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3800:2: (iv_ruleSMTReasoningTactic= ruleSMTReasoningTactic EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3801:2: iv_ruleSMTReasoningTactic= ruleSMTReasoningTactic EOF
            {
             newCompositeNode(grammarAccess.getSMTReasoningTacticRule()); 
            pushFollow(FOLLOW_ruleSMTReasoningTactic_in_entryRuleSMTReasoningTactic8849);
            iv_ruleSMTReasoningTactic=ruleSMTReasoningTactic();

            state._fsp--;

             current =iv_ruleSMTReasoningTactic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTReasoningTactic8859); 

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
    // $ANTLR end "entryRuleSMTReasoningTactic"


    // $ANTLR start "ruleSMTReasoningTactic"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3808:1: ruleSMTReasoningTactic returns [EObject current=null] : (this_SMTBuiltinTactic_0= ruleSMTBuiltinTactic | this_SMTReasoningCombinator_1= ruleSMTReasoningCombinator ) ;
    public final EObject ruleSMTReasoningTactic() throws RecognitionException {
        EObject current = null;

        EObject this_SMTBuiltinTactic_0 = null;

        EObject this_SMTReasoningCombinator_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3811:28: ( (this_SMTBuiltinTactic_0= ruleSMTBuiltinTactic | this_SMTReasoningCombinator_1= ruleSMTReasoningCombinator ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3812:1: (this_SMTBuiltinTactic_0= ruleSMTBuiltinTactic | this_SMTReasoningCombinator_1= ruleSMTReasoningCombinator )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3812:1: (this_SMTBuiltinTactic_0= ruleSMTBuiltinTactic | this_SMTReasoningCombinator_1= ruleSMTReasoningCombinator )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            else if ( (LA33_0==15) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3813:5: this_SMTBuiltinTactic_0= ruleSMTBuiltinTactic
                    {
                     
                            newCompositeNode(grammarAccess.getSMTReasoningTacticAccess().getSMTBuiltinTacticParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSMTBuiltinTactic_in_ruleSMTReasoningTactic8906);
                    this_SMTBuiltinTactic_0=ruleSMTBuiltinTactic();

                    state._fsp--;

                     
                            current = this_SMTBuiltinTactic_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3823:5: this_SMTReasoningCombinator_1= ruleSMTReasoningCombinator
                    {
                     
                            newCompositeNode(grammarAccess.getSMTReasoningTacticAccess().getSMTReasoningCombinatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSMTReasoningCombinator_in_ruleSMTReasoningTactic8933);
                    this_SMTReasoningCombinator_1=ruleSMTReasoningCombinator();

                    state._fsp--;

                     
                            current = this_SMTReasoningCombinator_1; 
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
    // $ANTLR end "ruleSMTReasoningTactic"


    // $ANTLR start "entryRuleSMTBuiltinTactic"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3839:1: entryRuleSMTBuiltinTactic returns [EObject current=null] : iv_ruleSMTBuiltinTactic= ruleSMTBuiltinTactic EOF ;
    public final EObject entryRuleSMTBuiltinTactic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTBuiltinTactic = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3840:2: (iv_ruleSMTBuiltinTactic= ruleSMTBuiltinTactic EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3841:2: iv_ruleSMTBuiltinTactic= ruleSMTBuiltinTactic EOF
            {
             newCompositeNode(grammarAccess.getSMTBuiltinTacticRule()); 
            pushFollow(FOLLOW_ruleSMTBuiltinTactic_in_entryRuleSMTBuiltinTactic8968);
            iv_ruleSMTBuiltinTactic=ruleSMTBuiltinTactic();

            state._fsp--;

             current =iv_ruleSMTBuiltinTactic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTBuiltinTactic8978); 

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
    // $ANTLR end "entryRuleSMTBuiltinTactic"


    // $ANTLR start "ruleSMTBuiltinTactic"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3848:1: ruleSMTBuiltinTactic returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSMTBuiltinTactic() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3851:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3852:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3852:1: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3853:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3853:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3854:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSMTBuiltinTactic9019); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSMTBuiltinTacticAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSMTBuiltinTacticRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleSMTBuiltinTactic"


    // $ANTLR start "entryRuleSMTReasoningCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3878:1: entryRuleSMTReasoningCombinator returns [EObject current=null] : iv_ruleSMTReasoningCombinator= ruleSMTReasoningCombinator EOF ;
    public final EObject entryRuleSMTReasoningCombinator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTReasoningCombinator = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3879:2: (iv_ruleSMTReasoningCombinator= ruleSMTReasoningCombinator EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3880:2: iv_ruleSMTReasoningCombinator= ruleSMTReasoningCombinator EOF
            {
             newCompositeNode(grammarAccess.getSMTReasoningCombinatorRule()); 
            pushFollow(FOLLOW_ruleSMTReasoningCombinator_in_entryRuleSMTReasoningCombinator9059);
            iv_ruleSMTReasoningCombinator=ruleSMTReasoningCombinator();

            state._fsp--;

             current =iv_ruleSMTReasoningCombinator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTReasoningCombinator9069); 

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
    // $ANTLR end "entryRuleSMTReasoningCombinator"


    // $ANTLR start "ruleSMTReasoningCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3887:1: ruleSMTReasoningCombinator returns [EObject current=null] : (this_SMTAndThenCombinator_0= ruleSMTAndThenCombinator | this_SMTOrElseCombinator_1= ruleSMTOrElseCombinator | this_SMTParOrCombinator_2= ruleSMTParOrCombinator | this_SMTParThenCombinator_3= ruleSMTParThenCombinator | this_SMTTryForCombinator_4= ruleSMTTryForCombinator | this_SMTIfCombinator_5= ruleSMTIfCombinator | this_SMTWhenCombinator_6= ruleSMTWhenCombinator | this_SMTFailIfCombinator_7= ruleSMTFailIfCombinator | this_SMTUsingParamCombinator_8= ruleSMTUsingParamCombinator ) ;
    public final EObject ruleSMTReasoningCombinator() throws RecognitionException {
        EObject current = null;

        EObject this_SMTAndThenCombinator_0 = null;

        EObject this_SMTOrElseCombinator_1 = null;

        EObject this_SMTParOrCombinator_2 = null;

        EObject this_SMTParThenCombinator_3 = null;

        EObject this_SMTTryForCombinator_4 = null;

        EObject this_SMTIfCombinator_5 = null;

        EObject this_SMTWhenCombinator_6 = null;

        EObject this_SMTFailIfCombinator_7 = null;

        EObject this_SMTUsingParamCombinator_8 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3890:28: ( (this_SMTAndThenCombinator_0= ruleSMTAndThenCombinator | this_SMTOrElseCombinator_1= ruleSMTOrElseCombinator | this_SMTParOrCombinator_2= ruleSMTParOrCombinator | this_SMTParThenCombinator_3= ruleSMTParThenCombinator | this_SMTTryForCombinator_4= ruleSMTTryForCombinator | this_SMTIfCombinator_5= ruleSMTIfCombinator | this_SMTWhenCombinator_6= ruleSMTWhenCombinator | this_SMTFailIfCombinator_7= ruleSMTFailIfCombinator | this_SMTUsingParamCombinator_8= ruleSMTUsingParamCombinator ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3891:1: (this_SMTAndThenCombinator_0= ruleSMTAndThenCombinator | this_SMTOrElseCombinator_1= ruleSMTOrElseCombinator | this_SMTParOrCombinator_2= ruleSMTParOrCombinator | this_SMTParThenCombinator_3= ruleSMTParThenCombinator | this_SMTTryForCombinator_4= ruleSMTTryForCombinator | this_SMTIfCombinator_5= ruleSMTIfCombinator | this_SMTWhenCombinator_6= ruleSMTWhenCombinator | this_SMTFailIfCombinator_7= ruleSMTFailIfCombinator | this_SMTUsingParamCombinator_8= ruleSMTUsingParamCombinator )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3891:1: (this_SMTAndThenCombinator_0= ruleSMTAndThenCombinator | this_SMTOrElseCombinator_1= ruleSMTOrElseCombinator | this_SMTParOrCombinator_2= ruleSMTParOrCombinator | this_SMTParThenCombinator_3= ruleSMTParThenCombinator | this_SMTTryForCombinator_4= ruleSMTTryForCombinator | this_SMTIfCombinator_5= ruleSMTIfCombinator | this_SMTWhenCombinator_6= ruleSMTWhenCombinator | this_SMTFailIfCombinator_7= ruleSMTFailIfCombinator | this_SMTUsingParamCombinator_8= ruleSMTUsingParamCombinator )
            int alt34=9;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3892:5: this_SMTAndThenCombinator_0= ruleSMTAndThenCombinator
                    {
                     
                            newCompositeNode(grammarAccess.getSMTReasoningCombinatorAccess().getSMTAndThenCombinatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSMTAndThenCombinator_in_ruleSMTReasoningCombinator9116);
                    this_SMTAndThenCombinator_0=ruleSMTAndThenCombinator();

                    state._fsp--;

                     
                            current = this_SMTAndThenCombinator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3902:5: this_SMTOrElseCombinator_1= ruleSMTOrElseCombinator
                    {
                     
                            newCompositeNode(grammarAccess.getSMTReasoningCombinatorAccess().getSMTOrElseCombinatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSMTOrElseCombinator_in_ruleSMTReasoningCombinator9143);
                    this_SMTOrElseCombinator_1=ruleSMTOrElseCombinator();

                    state._fsp--;

                     
                            current = this_SMTOrElseCombinator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3912:5: this_SMTParOrCombinator_2= ruleSMTParOrCombinator
                    {
                     
                            newCompositeNode(grammarAccess.getSMTReasoningCombinatorAccess().getSMTParOrCombinatorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSMTParOrCombinator_in_ruleSMTReasoningCombinator9170);
                    this_SMTParOrCombinator_2=ruleSMTParOrCombinator();

                    state._fsp--;

                     
                            current = this_SMTParOrCombinator_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3922:5: this_SMTParThenCombinator_3= ruleSMTParThenCombinator
                    {
                     
                            newCompositeNode(grammarAccess.getSMTReasoningCombinatorAccess().getSMTParThenCombinatorParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSMTParThenCombinator_in_ruleSMTReasoningCombinator9197);
                    this_SMTParThenCombinator_3=ruleSMTParThenCombinator();

                    state._fsp--;

                     
                            current = this_SMTParThenCombinator_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3932:5: this_SMTTryForCombinator_4= ruleSMTTryForCombinator
                    {
                     
                            newCompositeNode(grammarAccess.getSMTReasoningCombinatorAccess().getSMTTryForCombinatorParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSMTTryForCombinator_in_ruleSMTReasoningCombinator9224);
                    this_SMTTryForCombinator_4=ruleSMTTryForCombinator();

                    state._fsp--;

                     
                            current = this_SMTTryForCombinator_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3942:5: this_SMTIfCombinator_5= ruleSMTIfCombinator
                    {
                     
                            newCompositeNode(grammarAccess.getSMTReasoningCombinatorAccess().getSMTIfCombinatorParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSMTIfCombinator_in_ruleSMTReasoningCombinator9251);
                    this_SMTIfCombinator_5=ruleSMTIfCombinator();

                    state._fsp--;

                     
                            current = this_SMTIfCombinator_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3952:5: this_SMTWhenCombinator_6= ruleSMTWhenCombinator
                    {
                     
                            newCompositeNode(grammarAccess.getSMTReasoningCombinatorAccess().getSMTWhenCombinatorParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleSMTWhenCombinator_in_ruleSMTReasoningCombinator9278);
                    this_SMTWhenCombinator_6=ruleSMTWhenCombinator();

                    state._fsp--;

                     
                            current = this_SMTWhenCombinator_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3962:5: this_SMTFailIfCombinator_7= ruleSMTFailIfCombinator
                    {
                     
                            newCompositeNode(grammarAccess.getSMTReasoningCombinatorAccess().getSMTFailIfCombinatorParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleSMTFailIfCombinator_in_ruleSMTReasoningCombinator9305);
                    this_SMTFailIfCombinator_7=ruleSMTFailIfCombinator();

                    state._fsp--;

                     
                            current = this_SMTFailIfCombinator_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3972:5: this_SMTUsingParamCombinator_8= ruleSMTUsingParamCombinator
                    {
                     
                            newCompositeNode(grammarAccess.getSMTReasoningCombinatorAccess().getSMTUsingParamCombinatorParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleSMTUsingParamCombinator_in_ruleSMTReasoningCombinator9332);
                    this_SMTUsingParamCombinator_8=ruleSMTUsingParamCombinator();

                    state._fsp--;

                     
                            current = this_SMTUsingParamCombinator_8; 
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
    // $ANTLR end "ruleSMTReasoningCombinator"


    // $ANTLR start "entryRuleSMTAndThenCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3988:1: entryRuleSMTAndThenCombinator returns [EObject current=null] : iv_ruleSMTAndThenCombinator= ruleSMTAndThenCombinator EOF ;
    public final EObject entryRuleSMTAndThenCombinator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTAndThenCombinator = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3989:2: (iv_ruleSMTAndThenCombinator= ruleSMTAndThenCombinator EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3990:2: iv_ruleSMTAndThenCombinator= ruleSMTAndThenCombinator EOF
            {
             newCompositeNode(grammarAccess.getSMTAndThenCombinatorRule()); 
            pushFollow(FOLLOW_ruleSMTAndThenCombinator_in_entryRuleSMTAndThenCombinator9367);
            iv_ruleSMTAndThenCombinator=ruleSMTAndThenCombinator();

            state._fsp--;

             current =iv_ruleSMTAndThenCombinator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTAndThenCombinator9377); 

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
    // $ANTLR end "entryRuleSMTAndThenCombinator"


    // $ANTLR start "ruleSMTAndThenCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:3997:1: ruleSMTAndThenCombinator returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'and-then' ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+ otherlv_3= ')' ) ;
    public final EObject ruleSMTAndThenCombinator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_tactics_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4000:28: ( (otherlv_0= '(' otherlv_1= 'and-then' ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+ otherlv_3= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4001:1: (otherlv_0= '(' otherlv_1= 'and-then' ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+ otherlv_3= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4001:1: (otherlv_0= '(' otherlv_1= 'and-then' ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+ otherlv_3= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4001:3: otherlv_0= '(' otherlv_1= 'and-then' ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTAndThenCombinator9414); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTAndThenCombinatorAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleSMTAndThenCombinator9426); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTAndThenCombinatorAccess().getAndThenKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4009:1: ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||LA35_0==15) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4010:1: (lv_tactics_2_0= ruleSMTReasoningTactic )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4010:1: (lv_tactics_2_0= ruleSMTReasoningTactic )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4011:3: lv_tactics_2_0= ruleSMTReasoningTactic
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTAndThenCombinatorAccess().getTacticsSMTReasoningTacticParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTReasoningTactic_in_ruleSMTAndThenCombinator9447);
            	    lv_tactics_2_0=ruleSMTReasoningTactic();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTAndThenCombinatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tactics",
            	            		lv_tactics_2_0, 
            	            		"SMTReasoningTactic");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTAndThenCombinator9460); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTAndThenCombinatorAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSMTAndThenCombinator"


    // $ANTLR start "entryRuleSMTOrElseCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4039:1: entryRuleSMTOrElseCombinator returns [EObject current=null] : iv_ruleSMTOrElseCombinator= ruleSMTOrElseCombinator EOF ;
    public final EObject entryRuleSMTOrElseCombinator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTOrElseCombinator = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4040:2: (iv_ruleSMTOrElseCombinator= ruleSMTOrElseCombinator EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4041:2: iv_ruleSMTOrElseCombinator= ruleSMTOrElseCombinator EOF
            {
             newCompositeNode(grammarAccess.getSMTOrElseCombinatorRule()); 
            pushFollow(FOLLOW_ruleSMTOrElseCombinator_in_entryRuleSMTOrElseCombinator9496);
            iv_ruleSMTOrElseCombinator=ruleSMTOrElseCombinator();

            state._fsp--;

             current =iv_ruleSMTOrElseCombinator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTOrElseCombinator9506); 

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
    // $ANTLR end "entryRuleSMTOrElseCombinator"


    // $ANTLR start "ruleSMTOrElseCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4048:1: ruleSMTOrElseCombinator returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'or-else' ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+ otherlv_3= ')' ) ;
    public final EObject ruleSMTOrElseCombinator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_tactics_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4051:28: ( (otherlv_0= '(' otherlv_1= 'or-else' ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+ otherlv_3= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4052:1: (otherlv_0= '(' otherlv_1= 'or-else' ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+ otherlv_3= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4052:1: (otherlv_0= '(' otherlv_1= 'or-else' ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+ otherlv_3= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4052:3: otherlv_0= '(' otherlv_1= 'or-else' ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTOrElseCombinator9543); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTOrElseCombinatorAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleSMTOrElseCombinator9555); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTOrElseCombinatorAccess().getOrElseKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4060:1: ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID||LA36_0==15) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4061:1: (lv_tactics_2_0= ruleSMTReasoningTactic )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4061:1: (lv_tactics_2_0= ruleSMTReasoningTactic )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4062:3: lv_tactics_2_0= ruleSMTReasoningTactic
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTOrElseCombinatorAccess().getTacticsSMTReasoningTacticParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTReasoningTactic_in_ruleSMTOrElseCombinator9576);
            	    lv_tactics_2_0=ruleSMTReasoningTactic();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTOrElseCombinatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tactics",
            	            		lv_tactics_2_0, 
            	            		"SMTReasoningTactic");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTOrElseCombinator9589); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTOrElseCombinatorAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSMTOrElseCombinator"


    // $ANTLR start "entryRuleSMTParOrCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4090:1: entryRuleSMTParOrCombinator returns [EObject current=null] : iv_ruleSMTParOrCombinator= ruleSMTParOrCombinator EOF ;
    public final EObject entryRuleSMTParOrCombinator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTParOrCombinator = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4091:2: (iv_ruleSMTParOrCombinator= ruleSMTParOrCombinator EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4092:2: iv_ruleSMTParOrCombinator= ruleSMTParOrCombinator EOF
            {
             newCompositeNode(grammarAccess.getSMTParOrCombinatorRule()); 
            pushFollow(FOLLOW_ruleSMTParOrCombinator_in_entryRuleSMTParOrCombinator9625);
            iv_ruleSMTParOrCombinator=ruleSMTParOrCombinator();

            state._fsp--;

             current =iv_ruleSMTParOrCombinator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTParOrCombinator9635); 

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
    // $ANTLR end "entryRuleSMTParOrCombinator"


    // $ANTLR start "ruleSMTParOrCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4099:1: ruleSMTParOrCombinator returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'par-or' ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+ otherlv_3= ')' ) ;
    public final EObject ruleSMTParOrCombinator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_tactics_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4102:28: ( (otherlv_0= '(' otherlv_1= 'par-or' ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+ otherlv_3= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4103:1: (otherlv_0= '(' otherlv_1= 'par-or' ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+ otherlv_3= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4103:1: (otherlv_0= '(' otherlv_1= 'par-or' ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+ otherlv_3= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4103:3: otherlv_0= '(' otherlv_1= 'par-or' ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTParOrCombinator9672); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTParOrCombinatorAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleSMTParOrCombinator9684); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTParOrCombinatorAccess().getParOrKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4111:1: ( (lv_tactics_2_0= ruleSMTReasoningTactic ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID||LA37_0==15) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4112:1: (lv_tactics_2_0= ruleSMTReasoningTactic )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4112:1: (lv_tactics_2_0= ruleSMTReasoningTactic )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4113:3: lv_tactics_2_0= ruleSMTReasoningTactic
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTParOrCombinatorAccess().getTacticsSMTReasoningTacticParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTReasoningTactic_in_ruleSMTParOrCombinator9705);
            	    lv_tactics_2_0=ruleSMTReasoningTactic();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTParOrCombinatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tactics",
            	            		lv_tactics_2_0, 
            	            		"SMTReasoningTactic");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTParOrCombinator9718); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTParOrCombinatorAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSMTParOrCombinator"


    // $ANTLR start "entryRuleSMTParThenCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4141:1: entryRuleSMTParThenCombinator returns [EObject current=null] : iv_ruleSMTParThenCombinator= ruleSMTParThenCombinator EOF ;
    public final EObject entryRuleSMTParThenCombinator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTParThenCombinator = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4142:2: (iv_ruleSMTParThenCombinator= ruleSMTParThenCombinator EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4143:2: iv_ruleSMTParThenCombinator= ruleSMTParThenCombinator EOF
            {
             newCompositeNode(grammarAccess.getSMTParThenCombinatorRule()); 
            pushFollow(FOLLOW_ruleSMTParThenCombinator_in_entryRuleSMTParThenCombinator9754);
            iv_ruleSMTParThenCombinator=ruleSMTParThenCombinator();

            state._fsp--;

             current =iv_ruleSMTParThenCombinator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTParThenCombinator9764); 

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
    // $ANTLR end "entryRuleSMTParThenCombinator"


    // $ANTLR start "ruleSMTParThenCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4150:1: ruleSMTParThenCombinator returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'par-then' ( (lv_preProcessingTactic_2_0= ruleSMTReasoningTactic ) ) ( (lv_paralellyPostpricessingTactic_3_0= ruleSMTReasoningTactic ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMTParThenCombinator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_preProcessingTactic_2_0 = null;

        EObject lv_paralellyPostpricessingTactic_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4153:28: ( (otherlv_0= '(' otherlv_1= 'par-then' ( (lv_preProcessingTactic_2_0= ruleSMTReasoningTactic ) ) ( (lv_paralellyPostpricessingTactic_3_0= ruleSMTReasoningTactic ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4154:1: (otherlv_0= '(' otherlv_1= 'par-then' ( (lv_preProcessingTactic_2_0= ruleSMTReasoningTactic ) ) ( (lv_paralellyPostpricessingTactic_3_0= ruleSMTReasoningTactic ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4154:1: (otherlv_0= '(' otherlv_1= 'par-then' ( (lv_preProcessingTactic_2_0= ruleSMTReasoningTactic ) ) ( (lv_paralellyPostpricessingTactic_3_0= ruleSMTReasoningTactic ) ) otherlv_4= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4154:3: otherlv_0= '(' otherlv_1= 'par-then' ( (lv_preProcessingTactic_2_0= ruleSMTReasoningTactic ) ) ( (lv_paralellyPostpricessingTactic_3_0= ruleSMTReasoningTactic ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTParThenCombinator9801); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTParThenCombinatorAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleSMTParThenCombinator9813); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTParThenCombinatorAccess().getParThenKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4162:1: ( (lv_preProcessingTactic_2_0= ruleSMTReasoningTactic ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4163:1: (lv_preProcessingTactic_2_0= ruleSMTReasoningTactic )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4163:1: (lv_preProcessingTactic_2_0= ruleSMTReasoningTactic )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4164:3: lv_preProcessingTactic_2_0= ruleSMTReasoningTactic
            {
             
            	        newCompositeNode(grammarAccess.getSMTParThenCombinatorAccess().getPreProcessingTacticSMTReasoningTacticParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTReasoningTactic_in_ruleSMTParThenCombinator9834);
            lv_preProcessingTactic_2_0=ruleSMTReasoningTactic();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTParThenCombinatorRule());
            	        }
                   		set(
                   			current, 
                   			"preProcessingTactic",
                    		lv_preProcessingTactic_2_0, 
                    		"SMTReasoningTactic");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4180:2: ( (lv_paralellyPostpricessingTactic_3_0= ruleSMTReasoningTactic ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4181:1: (lv_paralellyPostpricessingTactic_3_0= ruleSMTReasoningTactic )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4181:1: (lv_paralellyPostpricessingTactic_3_0= ruleSMTReasoningTactic )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4182:3: lv_paralellyPostpricessingTactic_3_0= ruleSMTReasoningTactic
            {
             
            	        newCompositeNode(grammarAccess.getSMTParThenCombinatorAccess().getParalellyPostpricessingTacticSMTReasoningTacticParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTReasoningTactic_in_ruleSMTParThenCombinator9855);
            lv_paralellyPostpricessingTactic_3_0=ruleSMTReasoningTactic();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTParThenCombinatorRule());
            	        }
                   		set(
                   			current, 
                   			"paralellyPostpricessingTactic",
                    		lv_paralellyPostpricessingTactic_3_0, 
                    		"SMTReasoningTactic");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTParThenCombinator9867); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTParThenCombinatorAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTParThenCombinator"


    // $ANTLR start "entryRuleSMTTryForCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4210:1: entryRuleSMTTryForCombinator returns [EObject current=null] : iv_ruleSMTTryForCombinator= ruleSMTTryForCombinator EOF ;
    public final EObject entryRuleSMTTryForCombinator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTTryForCombinator = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4211:2: (iv_ruleSMTTryForCombinator= ruleSMTTryForCombinator EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4212:2: iv_ruleSMTTryForCombinator= ruleSMTTryForCombinator EOF
            {
             newCompositeNode(grammarAccess.getSMTTryForCombinatorRule()); 
            pushFollow(FOLLOW_ruleSMTTryForCombinator_in_entryRuleSMTTryForCombinator9903);
            iv_ruleSMTTryForCombinator=ruleSMTTryForCombinator();

            state._fsp--;

             current =iv_ruleSMTTryForCombinator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTTryForCombinator9913); 

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
    // $ANTLR end "entryRuleSMTTryForCombinator"


    // $ANTLR start "ruleSMTTryForCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4219:1: ruleSMTTryForCombinator returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'try-for' ( (lv_tactic_2_0= ruleSMTReasoningTactic ) ) ( (lv_time_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMTTryForCombinator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_time_3_0=null;
        Token otherlv_4=null;
        EObject lv_tactic_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4222:28: ( (otherlv_0= '(' otherlv_1= 'try-for' ( (lv_tactic_2_0= ruleSMTReasoningTactic ) ) ( (lv_time_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4223:1: (otherlv_0= '(' otherlv_1= 'try-for' ( (lv_tactic_2_0= ruleSMTReasoningTactic ) ) ( (lv_time_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4223:1: (otherlv_0= '(' otherlv_1= 'try-for' ( (lv_tactic_2_0= ruleSMTReasoningTactic ) ) ( (lv_time_3_0= RULE_INT ) ) otherlv_4= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4223:3: otherlv_0= '(' otherlv_1= 'try-for' ( (lv_tactic_2_0= ruleSMTReasoningTactic ) ) ( (lv_time_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTTryForCombinator9950); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTTryForCombinatorAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleSMTTryForCombinator9962); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTTryForCombinatorAccess().getTryForKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4231:1: ( (lv_tactic_2_0= ruleSMTReasoningTactic ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4232:1: (lv_tactic_2_0= ruleSMTReasoningTactic )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4232:1: (lv_tactic_2_0= ruleSMTReasoningTactic )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4233:3: lv_tactic_2_0= ruleSMTReasoningTactic
            {
             
            	        newCompositeNode(grammarAccess.getSMTTryForCombinatorAccess().getTacticSMTReasoningTacticParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTReasoningTactic_in_ruleSMTTryForCombinator9983);
            lv_tactic_2_0=ruleSMTReasoningTactic();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTTryForCombinatorRule());
            	        }
                   		set(
                   			current, 
                   			"tactic",
                    		lv_tactic_2_0, 
                    		"SMTReasoningTactic");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4249:2: ( (lv_time_3_0= RULE_INT ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4250:1: (lv_time_3_0= RULE_INT )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4250:1: (lv_time_3_0= RULE_INT )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4251:3: lv_time_3_0= RULE_INT
            {
            lv_time_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSMTTryForCombinator10000); 

            			newLeafNode(lv_time_3_0, grammarAccess.getSMTTryForCombinatorAccess().getTimeINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSMTTryForCombinatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"time",
                    		lv_time_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTTryForCombinator10017); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTTryForCombinatorAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTTryForCombinator"


    // $ANTLR start "entryRuleSMTIfCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4279:1: entryRuleSMTIfCombinator returns [EObject current=null] : iv_ruleSMTIfCombinator= ruleSMTIfCombinator EOF ;
    public final EObject entryRuleSMTIfCombinator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTIfCombinator = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4280:2: (iv_ruleSMTIfCombinator= ruleSMTIfCombinator EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4281:2: iv_ruleSMTIfCombinator= ruleSMTIfCombinator EOF
            {
             newCompositeNode(grammarAccess.getSMTIfCombinatorRule()); 
            pushFollow(FOLLOW_ruleSMTIfCombinator_in_entryRuleSMTIfCombinator10053);
            iv_ruleSMTIfCombinator=ruleSMTIfCombinator();

            state._fsp--;

             current =iv_ruleSMTIfCombinator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTIfCombinator10063); 

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
    // $ANTLR end "entryRuleSMTIfCombinator"


    // $ANTLR start "ruleSMTIfCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4288:1: ruleSMTIfCombinator returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'if' ( (lv_probe_2_0= ruleReasoningProbe ) ) ( (lv_ifTactic_3_0= ruleSMTReasoningTactic ) ) ( (lv_elseTactic_4_0= ruleSMTReasoningTactic ) ) otherlv_5= ')' ) ;
    public final EObject ruleSMTIfCombinator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_probe_2_0 = null;

        EObject lv_ifTactic_3_0 = null;

        EObject lv_elseTactic_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4291:28: ( (otherlv_0= '(' otherlv_1= 'if' ( (lv_probe_2_0= ruleReasoningProbe ) ) ( (lv_ifTactic_3_0= ruleSMTReasoningTactic ) ) ( (lv_elseTactic_4_0= ruleSMTReasoningTactic ) ) otherlv_5= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4292:1: (otherlv_0= '(' otherlv_1= 'if' ( (lv_probe_2_0= ruleReasoningProbe ) ) ( (lv_ifTactic_3_0= ruleSMTReasoningTactic ) ) ( (lv_elseTactic_4_0= ruleSMTReasoningTactic ) ) otherlv_5= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4292:1: (otherlv_0= '(' otherlv_1= 'if' ( (lv_probe_2_0= ruleReasoningProbe ) ) ( (lv_ifTactic_3_0= ruleSMTReasoningTactic ) ) ( (lv_elseTactic_4_0= ruleSMTReasoningTactic ) ) otherlv_5= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4292:3: otherlv_0= '(' otherlv_1= 'if' ( (lv_probe_2_0= ruleReasoningProbe ) ) ( (lv_ifTactic_3_0= ruleSMTReasoningTactic ) ) ( (lv_elseTactic_4_0= ruleSMTReasoningTactic ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTIfCombinator10100); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTIfCombinatorAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleSMTIfCombinator10112); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTIfCombinatorAccess().getIfKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4300:1: ( (lv_probe_2_0= ruleReasoningProbe ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4301:1: (lv_probe_2_0= ruleReasoningProbe )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4301:1: (lv_probe_2_0= ruleReasoningProbe )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4302:3: lv_probe_2_0= ruleReasoningProbe
            {
             
            	        newCompositeNode(grammarAccess.getSMTIfCombinatorAccess().getProbeReasoningProbeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleReasoningProbe_in_ruleSMTIfCombinator10133);
            lv_probe_2_0=ruleReasoningProbe();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTIfCombinatorRule());
            	        }
                   		set(
                   			current, 
                   			"probe",
                    		lv_probe_2_0, 
                    		"ReasoningProbe");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4318:2: ( (lv_ifTactic_3_0= ruleSMTReasoningTactic ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4319:1: (lv_ifTactic_3_0= ruleSMTReasoningTactic )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4319:1: (lv_ifTactic_3_0= ruleSMTReasoningTactic )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4320:3: lv_ifTactic_3_0= ruleSMTReasoningTactic
            {
             
            	        newCompositeNode(grammarAccess.getSMTIfCombinatorAccess().getIfTacticSMTReasoningTacticParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTReasoningTactic_in_ruleSMTIfCombinator10154);
            lv_ifTactic_3_0=ruleSMTReasoningTactic();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTIfCombinatorRule());
            	        }
                   		set(
                   			current, 
                   			"ifTactic",
                    		lv_ifTactic_3_0, 
                    		"SMTReasoningTactic");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4336:2: ( (lv_elseTactic_4_0= ruleSMTReasoningTactic ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4337:1: (lv_elseTactic_4_0= ruleSMTReasoningTactic )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4337:1: (lv_elseTactic_4_0= ruleSMTReasoningTactic )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4338:3: lv_elseTactic_4_0= ruleSMTReasoningTactic
            {
             
            	        newCompositeNode(grammarAccess.getSMTIfCombinatorAccess().getElseTacticSMTReasoningTacticParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTReasoningTactic_in_ruleSMTIfCombinator10175);
            lv_elseTactic_4_0=ruleSMTReasoningTactic();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTIfCombinatorRule());
            	        }
                   		set(
                   			current, 
                   			"elseTactic",
                    		lv_elseTactic_4_0, 
                    		"SMTReasoningTactic");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSMTIfCombinator10187); 

                	newLeafNode(otherlv_5, grammarAccess.getSMTIfCombinatorAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleSMTIfCombinator"


    // $ANTLR start "entryRuleSMTWhenCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4366:1: entryRuleSMTWhenCombinator returns [EObject current=null] : iv_ruleSMTWhenCombinator= ruleSMTWhenCombinator EOF ;
    public final EObject entryRuleSMTWhenCombinator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTWhenCombinator = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4367:2: (iv_ruleSMTWhenCombinator= ruleSMTWhenCombinator EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4368:2: iv_ruleSMTWhenCombinator= ruleSMTWhenCombinator EOF
            {
             newCompositeNode(grammarAccess.getSMTWhenCombinatorRule()); 
            pushFollow(FOLLOW_ruleSMTWhenCombinator_in_entryRuleSMTWhenCombinator10223);
            iv_ruleSMTWhenCombinator=ruleSMTWhenCombinator();

            state._fsp--;

             current =iv_ruleSMTWhenCombinator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTWhenCombinator10233); 

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
    // $ANTLR end "entryRuleSMTWhenCombinator"


    // $ANTLR start "ruleSMTWhenCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4375:1: ruleSMTWhenCombinator returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'when' ( (lv_probe_2_0= ruleReasoningProbe ) ) ( (lv_tactic_3_0= ruleSMTReasoningTactic ) ) otherlv_4= ')' ) ;
    public final EObject ruleSMTWhenCombinator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_probe_2_0 = null;

        EObject lv_tactic_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4378:28: ( (otherlv_0= '(' otherlv_1= 'when' ( (lv_probe_2_0= ruleReasoningProbe ) ) ( (lv_tactic_3_0= ruleSMTReasoningTactic ) ) otherlv_4= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4379:1: (otherlv_0= '(' otherlv_1= 'when' ( (lv_probe_2_0= ruleReasoningProbe ) ) ( (lv_tactic_3_0= ruleSMTReasoningTactic ) ) otherlv_4= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4379:1: (otherlv_0= '(' otherlv_1= 'when' ( (lv_probe_2_0= ruleReasoningProbe ) ) ( (lv_tactic_3_0= ruleSMTReasoningTactic ) ) otherlv_4= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4379:3: otherlv_0= '(' otherlv_1= 'when' ( (lv_probe_2_0= ruleReasoningProbe ) ) ( (lv_tactic_3_0= ruleSMTReasoningTactic ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTWhenCombinator10270); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTWhenCombinatorAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleSMTWhenCombinator10282); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTWhenCombinatorAccess().getWhenKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4387:1: ( (lv_probe_2_0= ruleReasoningProbe ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4388:1: (lv_probe_2_0= ruleReasoningProbe )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4388:1: (lv_probe_2_0= ruleReasoningProbe )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4389:3: lv_probe_2_0= ruleReasoningProbe
            {
             
            	        newCompositeNode(grammarAccess.getSMTWhenCombinatorAccess().getProbeReasoningProbeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleReasoningProbe_in_ruleSMTWhenCombinator10303);
            lv_probe_2_0=ruleReasoningProbe();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTWhenCombinatorRule());
            	        }
                   		set(
                   			current, 
                   			"probe",
                    		lv_probe_2_0, 
                    		"ReasoningProbe");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4405:2: ( (lv_tactic_3_0= ruleSMTReasoningTactic ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4406:1: (lv_tactic_3_0= ruleSMTReasoningTactic )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4406:1: (lv_tactic_3_0= ruleSMTReasoningTactic )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4407:3: lv_tactic_3_0= ruleSMTReasoningTactic
            {
             
            	        newCompositeNode(grammarAccess.getSMTWhenCombinatorAccess().getTacticSMTReasoningTacticParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTReasoningTactic_in_ruleSMTWhenCombinator10324);
            lv_tactic_3_0=ruleSMTReasoningTactic();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTWhenCombinatorRule());
            	        }
                   		set(
                   			current, 
                   			"tactic",
                    		lv_tactic_3_0, 
                    		"SMTReasoningTactic");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSMTWhenCombinator10336); 

                	newLeafNode(otherlv_4, grammarAccess.getSMTWhenCombinatorAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTWhenCombinator"


    // $ANTLR start "entryRuleSMTFailIfCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4435:1: entryRuleSMTFailIfCombinator returns [EObject current=null] : iv_ruleSMTFailIfCombinator= ruleSMTFailIfCombinator EOF ;
    public final EObject entryRuleSMTFailIfCombinator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTFailIfCombinator = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4436:2: (iv_ruleSMTFailIfCombinator= ruleSMTFailIfCombinator EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4437:2: iv_ruleSMTFailIfCombinator= ruleSMTFailIfCombinator EOF
            {
             newCompositeNode(grammarAccess.getSMTFailIfCombinatorRule()); 
            pushFollow(FOLLOW_ruleSMTFailIfCombinator_in_entryRuleSMTFailIfCombinator10372);
            iv_ruleSMTFailIfCombinator=ruleSMTFailIfCombinator();

            state._fsp--;

             current =iv_ruleSMTFailIfCombinator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTFailIfCombinator10382); 

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
    // $ANTLR end "entryRuleSMTFailIfCombinator"


    // $ANTLR start "ruleSMTFailIfCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4444:1: ruleSMTFailIfCombinator returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'fail-if' ( (lv_probe_2_0= ruleReasoningProbe ) ) otherlv_3= ')' ) ;
    public final EObject ruleSMTFailIfCombinator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_probe_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4447:28: ( (otherlv_0= '(' otherlv_1= 'fail-if' ( (lv_probe_2_0= ruleReasoningProbe ) ) otherlv_3= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4448:1: (otherlv_0= '(' otherlv_1= 'fail-if' ( (lv_probe_2_0= ruleReasoningProbe ) ) otherlv_3= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4448:1: (otherlv_0= '(' otherlv_1= 'fail-if' ( (lv_probe_2_0= ruleReasoningProbe ) ) otherlv_3= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4448:3: otherlv_0= '(' otherlv_1= 'fail-if' ( (lv_probe_2_0= ruleReasoningProbe ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTFailIfCombinator10419); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTFailIfCombinatorAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleSMTFailIfCombinator10431); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTFailIfCombinatorAccess().getFailIfKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4456:1: ( (lv_probe_2_0= ruleReasoningProbe ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4457:1: (lv_probe_2_0= ruleReasoningProbe )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4457:1: (lv_probe_2_0= ruleReasoningProbe )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4458:3: lv_probe_2_0= ruleReasoningProbe
            {
             
            	        newCompositeNode(grammarAccess.getSMTFailIfCombinatorAccess().getProbeReasoningProbeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleReasoningProbe_in_ruleSMTFailIfCombinator10452);
            lv_probe_2_0=ruleReasoningProbe();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTFailIfCombinatorRule());
            	        }
                   		set(
                   			current, 
                   			"probe",
                    		lv_probe_2_0, 
                    		"ReasoningProbe");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTFailIfCombinator10464); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTFailIfCombinatorAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSMTFailIfCombinator"


    // $ANTLR start "entryRuleSMTUsingParamCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4486:1: entryRuleSMTUsingParamCombinator returns [EObject current=null] : iv_ruleSMTUsingParamCombinator= ruleSMTUsingParamCombinator EOF ;
    public final EObject entryRuleSMTUsingParamCombinator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTUsingParamCombinator = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4487:2: (iv_ruleSMTUsingParamCombinator= ruleSMTUsingParamCombinator EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4488:2: iv_ruleSMTUsingParamCombinator= ruleSMTUsingParamCombinator EOF
            {
             newCompositeNode(grammarAccess.getSMTUsingParamCombinatorRule()); 
            pushFollow(FOLLOW_ruleSMTUsingParamCombinator_in_entryRuleSMTUsingParamCombinator10500);
            iv_ruleSMTUsingParamCombinator=ruleSMTUsingParamCombinator();

            state._fsp--;

             current =iv_ruleSMTUsingParamCombinator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTUsingParamCombinator10510); 

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
    // $ANTLR end "entryRuleSMTUsingParamCombinator"


    // $ANTLR start "ruleSMTUsingParamCombinator"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4495:1: ruleSMTUsingParamCombinator returns [EObject current=null] : (otherlv_0= '(' (otherlv_1= 'using-params' | otherlv_2= '!' ) ( (lv_tactic_3_0= ruleSMTReasoningTactic ) ) ( (lv_parameters_4_0= ruleReasoningTacticParameter ) )* otherlv_5= ')' ) ;
    public final EObject ruleSMTUsingParamCombinator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_tactic_3_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4498:28: ( (otherlv_0= '(' (otherlv_1= 'using-params' | otherlv_2= '!' ) ( (lv_tactic_3_0= ruleSMTReasoningTactic ) ) ( (lv_parameters_4_0= ruleReasoningTacticParameter ) )* otherlv_5= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4499:1: (otherlv_0= '(' (otherlv_1= 'using-params' | otherlv_2= '!' ) ( (lv_tactic_3_0= ruleSMTReasoningTactic ) ) ( (lv_parameters_4_0= ruleReasoningTacticParameter ) )* otherlv_5= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4499:1: (otherlv_0= '(' (otherlv_1= 'using-params' | otherlv_2= '!' ) ( (lv_tactic_3_0= ruleSMTReasoningTactic ) ) ( (lv_parameters_4_0= ruleReasoningTacticParameter ) )* otherlv_5= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4499:3: otherlv_0= '(' (otherlv_1= 'using-params' | otherlv_2= '!' ) ( (lv_tactic_3_0= ruleSMTReasoningTactic ) ) ( (lv_parameters_4_0= ruleReasoningTacticParameter ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTUsingParamCombinator10547); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTUsingParamCombinatorAccess().getLeftParenthesisKeyword_0());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4503:1: (otherlv_1= 'using-params' | otherlv_2= '!' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==62) ) {
                alt38=1;
            }
            else if ( (LA38_0==28) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4503:3: otherlv_1= 'using-params'
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleSMTUsingParamCombinator10560); 

                        	newLeafNode(otherlv_1, grammarAccess.getSMTUsingParamCombinatorAccess().getUsingParamsKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4508:7: otherlv_2= '!'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleSMTUsingParamCombinator10578); 

                        	newLeafNode(otherlv_2, grammarAccess.getSMTUsingParamCombinatorAccess().getExclamationMarkKeyword_1_1());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4512:2: ( (lv_tactic_3_0= ruleSMTReasoningTactic ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4513:1: (lv_tactic_3_0= ruleSMTReasoningTactic )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4513:1: (lv_tactic_3_0= ruleSMTReasoningTactic )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4514:3: lv_tactic_3_0= ruleSMTReasoningTactic
            {
             
            	        newCompositeNode(grammarAccess.getSMTUsingParamCombinatorAccess().getTacticSMTReasoningTacticParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTReasoningTactic_in_ruleSMTUsingParamCombinator10600);
            lv_tactic_3_0=ruleSMTReasoningTactic();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMTUsingParamCombinatorRule());
            	        }
                   		set(
                   			current, 
                   			"tactic",
                    		lv_tactic_3_0, 
                    		"SMTReasoningTactic");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4530:2: ( (lv_parameters_4_0= ruleReasoningTacticParameter ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_PROPERTYNAME) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4531:1: (lv_parameters_4_0= ruleReasoningTacticParameter )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4531:1: (lv_parameters_4_0= ruleReasoningTacticParameter )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4532:3: lv_parameters_4_0= ruleReasoningTacticParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTUsingParamCombinatorAccess().getParametersReasoningTacticParameterParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleReasoningTacticParameter_in_ruleSMTUsingParamCombinator10621);
            	    lv_parameters_4_0=ruleReasoningTacticParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTUsingParamCombinatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_4_0, 
            	            		"ReasoningTacticParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSMTUsingParamCombinator10634); 

                	newLeafNode(otherlv_5, grammarAccess.getSMTUsingParamCombinatorAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTUsingParamCombinator"


    // $ANTLR start "entryRuleReasoningProbe"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4560:1: entryRuleReasoningProbe returns [EObject current=null] : iv_ruleReasoningProbe= ruleReasoningProbe EOF ;
    public final EObject entryRuleReasoningProbe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReasoningProbe = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4561:2: (iv_ruleReasoningProbe= ruleReasoningProbe EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4562:2: iv_ruleReasoningProbe= ruleReasoningProbe EOF
            {
             newCompositeNode(grammarAccess.getReasoningProbeRule()); 
            pushFollow(FOLLOW_ruleReasoningProbe_in_entryRuleReasoningProbe10670);
            iv_ruleReasoningProbe=ruleReasoningProbe();

            state._fsp--;

             current =iv_ruleReasoningProbe; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReasoningProbe10680); 

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
    // $ANTLR end "entryRuleReasoningProbe"


    // $ANTLR start "ruleReasoningProbe"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4569:1: ruleReasoningProbe returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleReasoningProbe() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4572:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4573:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4573:1: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4574:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4574:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4575:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReasoningProbe10721); 

            			newLeafNode(lv_name_0_0, grammarAccess.getReasoningProbeAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReasoningProbeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleReasoningProbe"


    // $ANTLR start "entryRuleReasoningTacticParameter"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4599:1: entryRuleReasoningTacticParameter returns [EObject current=null] : iv_ruleReasoningTacticParameter= ruleReasoningTacticParameter EOF ;
    public final EObject entryRuleReasoningTacticParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReasoningTacticParameter = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4600:2: (iv_ruleReasoningTacticParameter= ruleReasoningTacticParameter EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4601:2: iv_ruleReasoningTacticParameter= ruleReasoningTacticParameter EOF
            {
             newCompositeNode(grammarAccess.getReasoningTacticParameterRule()); 
            pushFollow(FOLLOW_ruleReasoningTacticParameter_in_entryRuleReasoningTacticParameter10761);
            iv_ruleReasoningTacticParameter=ruleReasoningTacticParameter();

            state._fsp--;

             current =iv_ruleReasoningTacticParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReasoningTacticParameter10771); 

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
    // $ANTLR end "entryRuleReasoningTacticParameter"


    // $ANTLR start "ruleReasoningTacticParameter"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4608:1: ruleReasoningTacticParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_PROPERTYNAME ) ) ( (lv_value_1_0= ruleSMTAtomicTerm ) ) ) ;
    public final EObject ruleReasoningTacticParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4611:28: ( ( ( (lv_name_0_0= RULE_PROPERTYNAME ) ) ( (lv_value_1_0= ruleSMTAtomicTerm ) ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4612:1: ( ( (lv_name_0_0= RULE_PROPERTYNAME ) ) ( (lv_value_1_0= ruleSMTAtomicTerm ) ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4612:1: ( ( (lv_name_0_0= RULE_PROPERTYNAME ) ) ( (lv_value_1_0= ruleSMTAtomicTerm ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4612:2: ( (lv_name_0_0= RULE_PROPERTYNAME ) ) ( (lv_value_1_0= ruleSMTAtomicTerm ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4612:2: ( (lv_name_0_0= RULE_PROPERTYNAME ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4613:1: (lv_name_0_0= RULE_PROPERTYNAME )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4613:1: (lv_name_0_0= RULE_PROPERTYNAME )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4614:3: lv_name_0_0= RULE_PROPERTYNAME
            {
            lv_name_0_0=(Token)match(input,RULE_PROPERTYNAME,FOLLOW_RULE_PROPERTYNAME_in_ruleReasoningTacticParameter10813); 

            			newLeafNode(lv_name_0_0, grammarAccess.getReasoningTacticParameterAccess().getNamePROPERTYNAMETerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReasoningTacticParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"PROPERTYNAME");
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4630:2: ( (lv_value_1_0= ruleSMTAtomicTerm ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4631:1: (lv_value_1_0= ruleSMTAtomicTerm )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4631:1: (lv_value_1_0= ruleSMTAtomicTerm )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4632:3: lv_value_1_0= ruleSMTAtomicTerm
            {
             
            	        newCompositeNode(grammarAccess.getReasoningTacticParameterAccess().getValueSMTAtomicTermParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSMTAtomicTerm_in_ruleReasoningTacticParameter10839);
            lv_value_1_0=ruleSMTAtomicTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReasoningTacticParameterRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"SMTAtomicTerm");
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
    // $ANTLR end "ruleReasoningTacticParameter"


    // $ANTLR start "entryRuleSMTResult"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4656:1: entryRuleSMTResult returns [EObject current=null] : iv_ruleSMTResult= ruleSMTResult EOF ;
    public final EObject entryRuleSMTResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTResult = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4657:2: (iv_ruleSMTResult= ruleSMTResult EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4658:2: iv_ruleSMTResult= ruleSMTResult EOF
            {
             newCompositeNode(grammarAccess.getSMTResultRule()); 
            pushFollow(FOLLOW_ruleSMTResult_in_entryRuleSMTResult10875);
            iv_ruleSMTResult=ruleSMTResult();

            state._fsp--;

             current =iv_ruleSMTResult; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTResult10885); 

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
    // $ANTLR end "entryRuleSMTResult"


    // $ANTLR start "ruleSMTResult"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4665:1: ruleSMTResult returns [EObject current=null] : (this_SMTUnsupportedResult_0= ruleSMTUnsupportedResult | this_SMTSatResult_1= ruleSMTSatResult | this_SMTModelResult_2= ruleSMTModelResult | this_SMTErrorResult_3= ruleSMTErrorResult ) ;
    public final EObject ruleSMTResult() throws RecognitionException {
        EObject current = null;

        EObject this_SMTUnsupportedResult_0 = null;

        EObject this_SMTSatResult_1 = null;

        EObject this_SMTModelResult_2 = null;

        EObject this_SMTErrorResult_3 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4668:28: ( (this_SMTUnsupportedResult_0= ruleSMTUnsupportedResult | this_SMTSatResult_1= ruleSMTSatResult | this_SMTModelResult_2= ruleSMTModelResult | this_SMTErrorResult_3= ruleSMTErrorResult ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4669:1: (this_SMTUnsupportedResult_0= ruleSMTUnsupportedResult | this_SMTSatResult_1= ruleSMTSatResult | this_SMTModelResult_2= ruleSMTModelResult | this_SMTErrorResult_3= ruleSMTErrorResult )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4669:1: (this_SMTUnsupportedResult_0= ruleSMTUnsupportedResult | this_SMTSatResult_1= ruleSMTSatResult | this_SMTModelResult_2= ruleSMTModelResult | this_SMTErrorResult_3= ruleSMTErrorResult )
            int alt40=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt40=1;
                }
                break;
            case 66:
            case 67:
            case 68:
                {
                alt40=2;
                }
                break;
            case 15:
                {
                int LA40_3 = input.LA(2);

                if ( (LA40_3==69) ) {
                    alt40=3;
                }
                else if ( (LA40_3==63) ) {
                    alt40=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4670:5: this_SMTUnsupportedResult_0= ruleSMTUnsupportedResult
                    {
                     
                            newCompositeNode(grammarAccess.getSMTResultAccess().getSMTUnsupportedResultParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSMTUnsupportedResult_in_ruleSMTResult10932);
                    this_SMTUnsupportedResult_0=ruleSMTUnsupportedResult();

                    state._fsp--;

                     
                            current = this_SMTUnsupportedResult_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4680:5: this_SMTSatResult_1= ruleSMTSatResult
                    {
                     
                            newCompositeNode(grammarAccess.getSMTResultAccess().getSMTSatResultParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSMTSatResult_in_ruleSMTResult10959);
                    this_SMTSatResult_1=ruleSMTSatResult();

                    state._fsp--;

                     
                            current = this_SMTSatResult_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4690:5: this_SMTModelResult_2= ruleSMTModelResult
                    {
                     
                            newCompositeNode(grammarAccess.getSMTResultAccess().getSMTModelResultParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSMTModelResult_in_ruleSMTResult10986);
                    this_SMTModelResult_2=ruleSMTModelResult();

                    state._fsp--;

                     
                            current = this_SMTModelResult_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4700:5: this_SMTErrorResult_3= ruleSMTErrorResult
                    {
                     
                            newCompositeNode(grammarAccess.getSMTResultAccess().getSMTErrorResultParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSMTErrorResult_in_ruleSMTResult11013);
                    this_SMTErrorResult_3=ruleSMTErrorResult();

                    state._fsp--;

                     
                            current = this_SMTErrorResult_3; 
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
    // $ANTLR end "ruleSMTResult"


    // $ANTLR start "entryRuleSMTErrorResult"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4716:1: entryRuleSMTErrorResult returns [EObject current=null] : iv_ruleSMTErrorResult= ruleSMTErrorResult EOF ;
    public final EObject entryRuleSMTErrorResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTErrorResult = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4717:2: (iv_ruleSMTErrorResult= ruleSMTErrorResult EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4718:2: iv_ruleSMTErrorResult= ruleSMTErrorResult EOF
            {
             newCompositeNode(grammarAccess.getSMTErrorResultRule()); 
            pushFollow(FOLLOW_ruleSMTErrorResult_in_entryRuleSMTErrorResult11048);
            iv_ruleSMTErrorResult=ruleSMTErrorResult();

            state._fsp--;

             current =iv_ruleSMTErrorResult; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTErrorResult11058); 

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
    // $ANTLR end "entryRuleSMTErrorResult"


    // $ANTLR start "ruleSMTErrorResult"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4725:1: ruleSMTErrorResult returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'error' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleSMTErrorResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_message_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4728:28: ( (otherlv_0= '(' otherlv_1= 'error' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4729:1: (otherlv_0= '(' otherlv_1= 'error' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4729:1: (otherlv_0= '(' otherlv_1= 'error' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4729:3: otherlv_0= '(' otherlv_1= 'error' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTErrorResult11095); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTErrorResultAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleSMTErrorResult11107); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTErrorResultAccess().getErrorKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4737:1: ( (lv_message_2_0= RULE_STRING ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4738:1: (lv_message_2_0= RULE_STRING )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4738:1: (lv_message_2_0= RULE_STRING )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4739:3: lv_message_2_0= RULE_STRING
            {
            lv_message_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSMTErrorResult11124); 

            			newLeafNode(lv_message_2_0, grammarAccess.getSMTErrorResultAccess().getMessageSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSMTErrorResultRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"message",
                    		lv_message_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTErrorResult11141); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTErrorResultAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSMTErrorResult"


    // $ANTLR start "entryRuleSMTUnsupportedResult"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4767:1: entryRuleSMTUnsupportedResult returns [EObject current=null] : iv_ruleSMTUnsupportedResult= ruleSMTUnsupportedResult EOF ;
    public final EObject entryRuleSMTUnsupportedResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTUnsupportedResult = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4768:2: (iv_ruleSMTUnsupportedResult= ruleSMTUnsupportedResult EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4769:2: iv_ruleSMTUnsupportedResult= ruleSMTUnsupportedResult EOF
            {
             newCompositeNode(grammarAccess.getSMTUnsupportedResultRule()); 
            pushFollow(FOLLOW_ruleSMTUnsupportedResult_in_entryRuleSMTUnsupportedResult11177);
            iv_ruleSMTUnsupportedResult=ruleSMTUnsupportedResult();

            state._fsp--;

             current =iv_ruleSMTUnsupportedResult; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTUnsupportedResult11187); 

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
    // $ANTLR end "entryRuleSMTUnsupportedResult"


    // $ANTLR start "ruleSMTUnsupportedResult"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4776:1: ruleSMTUnsupportedResult returns [EObject current=null] : (otherlv_0= 'unsupported' otherlv_1= ';' ( (lv_command_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSMTUnsupportedResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_command_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4779:28: ( (otherlv_0= 'unsupported' otherlv_1= ';' ( (lv_command_2_0= RULE_ID ) ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4780:1: (otherlv_0= 'unsupported' otherlv_1= ';' ( (lv_command_2_0= RULE_ID ) ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4780:1: (otherlv_0= 'unsupported' otherlv_1= ';' ( (lv_command_2_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4780:3: otherlv_0= 'unsupported' otherlv_1= ';' ( (lv_command_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleSMTUnsupportedResult11224); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTUnsupportedResultAccess().getUnsupportedKeyword_0());
                
            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleSMTUnsupportedResult11236); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTUnsupportedResultAccess().getSemicolonKeyword_1());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4788:1: ( (lv_command_2_0= RULE_ID ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4789:1: (lv_command_2_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4789:1: (lv_command_2_0= RULE_ID )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4790:3: lv_command_2_0= RULE_ID
            {
            lv_command_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSMTUnsupportedResult11253); 

            			newLeafNode(lv_command_2_0, grammarAccess.getSMTUnsupportedResultAccess().getCommandIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSMTUnsupportedResultRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"command",
                    		lv_command_2_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleSMTUnsupportedResult"


    // $ANTLR start "entryRuleSMTSatResult"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4814:1: entryRuleSMTSatResult returns [EObject current=null] : iv_ruleSMTSatResult= ruleSMTSatResult EOF ;
    public final EObject entryRuleSMTSatResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTSatResult = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4815:2: (iv_ruleSMTSatResult= ruleSMTSatResult EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4816:2: iv_ruleSMTSatResult= ruleSMTSatResult EOF
            {
             newCompositeNode(grammarAccess.getSMTSatResultRule()); 
            pushFollow(FOLLOW_ruleSMTSatResult_in_entryRuleSMTSatResult11294);
            iv_ruleSMTSatResult=ruleSMTSatResult();

            state._fsp--;

             current =iv_ruleSMTSatResult; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTSatResult11304); 

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
    // $ANTLR end "entryRuleSMTSatResult"


    // $ANTLR start "ruleSMTSatResult"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4823:1: ruleSMTSatResult returns [EObject current=null] : ( ( (lv_sat_0_0= 'sat' ) ) | ( (lv_unsat_1_0= 'unsat' ) ) | ( (lv_unknown_2_0= 'unknown' ) ) ) ;
    public final EObject ruleSMTSatResult() throws RecognitionException {
        EObject current = null;

        Token lv_sat_0_0=null;
        Token lv_unsat_1_0=null;
        Token lv_unknown_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4826:28: ( ( ( (lv_sat_0_0= 'sat' ) ) | ( (lv_unsat_1_0= 'unsat' ) ) | ( (lv_unknown_2_0= 'unknown' ) ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4827:1: ( ( (lv_sat_0_0= 'sat' ) ) | ( (lv_unsat_1_0= 'unsat' ) ) | ( (lv_unknown_2_0= 'unknown' ) ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4827:1: ( ( (lv_sat_0_0= 'sat' ) ) | ( (lv_unsat_1_0= 'unsat' ) ) | ( (lv_unknown_2_0= 'unknown' ) ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt41=1;
                }
                break;
            case 67:
                {
                alt41=2;
                }
                break;
            case 68:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4827:2: ( (lv_sat_0_0= 'sat' ) )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4827:2: ( (lv_sat_0_0= 'sat' ) )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4828:1: (lv_sat_0_0= 'sat' )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4828:1: (lv_sat_0_0= 'sat' )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4829:3: lv_sat_0_0= 'sat'
                    {
                    lv_sat_0_0=(Token)match(input,66,FOLLOW_66_in_ruleSMTSatResult11347); 

                            newLeafNode(lv_sat_0_0, grammarAccess.getSMTSatResultAccess().getSatSatKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSMTSatResultRule());
                    	        }
                           		setWithLastConsumed(current, "sat", true, "sat");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4843:6: ( (lv_unsat_1_0= 'unsat' ) )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4843:6: ( (lv_unsat_1_0= 'unsat' ) )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4844:1: (lv_unsat_1_0= 'unsat' )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4844:1: (lv_unsat_1_0= 'unsat' )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4845:3: lv_unsat_1_0= 'unsat'
                    {
                    lv_unsat_1_0=(Token)match(input,67,FOLLOW_67_in_ruleSMTSatResult11384); 

                            newLeafNode(lv_unsat_1_0, grammarAccess.getSMTSatResultAccess().getUnsatUnsatKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSMTSatResultRule());
                    	        }
                           		setWithLastConsumed(current, "unsat", true, "unsat");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4859:6: ( (lv_unknown_2_0= 'unknown' ) )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4859:6: ( (lv_unknown_2_0= 'unknown' ) )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4860:1: (lv_unknown_2_0= 'unknown' )
                    {
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4860:1: (lv_unknown_2_0= 'unknown' )
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4861:3: lv_unknown_2_0= 'unknown'
                    {
                    lv_unknown_2_0=(Token)match(input,68,FOLLOW_68_in_ruleSMTSatResult11421); 

                            newLeafNode(lv_unknown_2_0, grammarAccess.getSMTSatResultAccess().getUnknownUnknownKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSMTSatResultRule());
                    	        }
                           		setWithLastConsumed(current, "unknown", true, "unknown");
                    	    

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
    // $ANTLR end "ruleSMTSatResult"


    // $ANTLR start "entryRuleSMTModelResult"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4882:1: entryRuleSMTModelResult returns [EObject current=null] : iv_ruleSMTModelResult= ruleSMTModelResult EOF ;
    public final EObject entryRuleSMTModelResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTModelResult = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4883:2: (iv_ruleSMTModelResult= ruleSMTModelResult EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4884:2: iv_ruleSMTModelResult= ruleSMTModelResult EOF
            {
             newCompositeNode(grammarAccess.getSMTModelResultRule()); 
            pushFollow(FOLLOW_ruleSMTModelResult_in_entryRuleSMTModelResult11470);
            iv_ruleSMTModelResult=ruleSMTModelResult();

            state._fsp--;

             current =iv_ruleSMTModelResult; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTModelResult11480); 

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
    // $ANTLR end "entryRuleSMTModelResult"


    // $ANTLR start "ruleSMTModelResult"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4891:1: ruleSMTModelResult returns [EObject current=null] : ( () otherlv_1= '(' otherlv_2= 'model' ( ( (lv_newFunctionDeclarations_3_0= ruleSMTFunctionDeclaration ) ) | ( (lv_typeDefinitions_4_0= ruleSMTCardinalityConstraint ) ) | ( (lv_newFunctionDefinitions_5_0= ruleSMTFunctionDefinition ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleSMTModelResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_newFunctionDeclarations_3_0 = null;

        EObject lv_typeDefinitions_4_0 = null;

        EObject lv_newFunctionDefinitions_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4894:28: ( ( () otherlv_1= '(' otherlv_2= 'model' ( ( (lv_newFunctionDeclarations_3_0= ruleSMTFunctionDeclaration ) ) | ( (lv_typeDefinitions_4_0= ruleSMTCardinalityConstraint ) ) | ( (lv_newFunctionDefinitions_5_0= ruleSMTFunctionDefinition ) ) )* otherlv_6= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4895:1: ( () otherlv_1= '(' otherlv_2= 'model' ( ( (lv_newFunctionDeclarations_3_0= ruleSMTFunctionDeclaration ) ) | ( (lv_typeDefinitions_4_0= ruleSMTCardinalityConstraint ) ) | ( (lv_newFunctionDefinitions_5_0= ruleSMTFunctionDefinition ) ) )* otherlv_6= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4895:1: ( () otherlv_1= '(' otherlv_2= 'model' ( ( (lv_newFunctionDeclarations_3_0= ruleSMTFunctionDeclaration ) ) | ( (lv_typeDefinitions_4_0= ruleSMTCardinalityConstraint ) ) | ( (lv_newFunctionDefinitions_5_0= ruleSMTFunctionDefinition ) ) )* otherlv_6= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4895:2: () otherlv_1= '(' otherlv_2= 'model' ( ( (lv_newFunctionDeclarations_3_0= ruleSMTFunctionDeclaration ) ) | ( (lv_typeDefinitions_4_0= ruleSMTCardinalityConstraint ) ) | ( (lv_newFunctionDefinitions_5_0= ruleSMTFunctionDefinition ) ) )* otherlv_6= ')'
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4895:2: ()
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4896:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSMTModelResultAccess().getSMTModelResultAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleSMTModelResult11526); 

                	newLeafNode(otherlv_1, grammarAccess.getSMTModelResultAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleSMTModelResult11538); 

                	newLeafNode(otherlv_2, grammarAccess.getSMTModelResultAccess().getModelKeyword_2());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4909:1: ( ( (lv_newFunctionDeclarations_3_0= ruleSMTFunctionDeclaration ) ) | ( (lv_typeDefinitions_4_0= ruleSMTCardinalityConstraint ) ) | ( (lv_newFunctionDefinitions_5_0= ruleSMTFunctionDefinition ) ) )*
            loop42:
            do {
                int alt42=4;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==15) ) {
                    switch ( input.LA(2) ) {
                    case 30:
                        {
                        alt42=2;
                        }
                        break;
                    case 23:
                        {
                        alt42=1;
                        }
                        break;
                    case 24:
                        {
                        alt42=3;
                        }
                        break;

                    }

                }


                switch (alt42) {
            	case 1 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4909:2: ( (lv_newFunctionDeclarations_3_0= ruleSMTFunctionDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4909:2: ( (lv_newFunctionDeclarations_3_0= ruleSMTFunctionDeclaration ) )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4910:1: (lv_newFunctionDeclarations_3_0= ruleSMTFunctionDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4910:1: (lv_newFunctionDeclarations_3_0= ruleSMTFunctionDeclaration )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4911:3: lv_newFunctionDeclarations_3_0= ruleSMTFunctionDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTModelResultAccess().getNewFunctionDeclarationsSMTFunctionDeclarationParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTFunctionDeclaration_in_ruleSMTModelResult11560);
            	    lv_newFunctionDeclarations_3_0=ruleSMTFunctionDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTModelResultRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"newFunctionDeclarations",
            	            		lv_newFunctionDeclarations_3_0, 
            	            		"SMTFunctionDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4928:6: ( (lv_typeDefinitions_4_0= ruleSMTCardinalityConstraint ) )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4928:6: ( (lv_typeDefinitions_4_0= ruleSMTCardinalityConstraint ) )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4929:1: (lv_typeDefinitions_4_0= ruleSMTCardinalityConstraint )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4929:1: (lv_typeDefinitions_4_0= ruleSMTCardinalityConstraint )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4930:3: lv_typeDefinitions_4_0= ruleSMTCardinalityConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTModelResultAccess().getTypeDefinitionsSMTCardinalityConstraintParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTCardinalityConstraint_in_ruleSMTModelResult11587);
            	    lv_typeDefinitions_4_0=ruleSMTCardinalityConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTModelResultRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"typeDefinitions",
            	            		lv_typeDefinitions_4_0, 
            	            		"SMTCardinalityConstraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4947:6: ( (lv_newFunctionDefinitions_5_0= ruleSMTFunctionDefinition ) )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4947:6: ( (lv_newFunctionDefinitions_5_0= ruleSMTFunctionDefinition ) )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4948:1: (lv_newFunctionDefinitions_5_0= ruleSMTFunctionDefinition )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4948:1: (lv_newFunctionDefinitions_5_0= ruleSMTFunctionDefinition )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4949:3: lv_newFunctionDefinitions_5_0= ruleSMTFunctionDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTModelResultAccess().getNewFunctionDefinitionsSMTFunctionDefinitionParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTFunctionDefinition_in_ruleSMTModelResult11614);
            	    lv_newFunctionDefinitions_5_0=ruleSMTFunctionDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTModelResultRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"newFunctionDefinitions",
            	            		lv_newFunctionDefinitions_5_0, 
            	            		"SMTFunctionDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleSMTModelResult11628); 

                	newLeafNode(otherlv_6, grammarAccess.getSMTModelResultAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSMTModelResult"


    // $ANTLR start "entryRuleSMTStatisticValue"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4977:1: entryRuleSMTStatisticValue returns [EObject current=null] : iv_ruleSMTStatisticValue= ruleSMTStatisticValue EOF ;
    public final EObject entryRuleSMTStatisticValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTStatisticValue = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4978:2: (iv_ruleSMTStatisticValue= ruleSMTStatisticValue EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4979:2: iv_ruleSMTStatisticValue= ruleSMTStatisticValue EOF
            {
             newCompositeNode(grammarAccess.getSMTStatisticValueRule()); 
            pushFollow(FOLLOW_ruleSMTStatisticValue_in_entryRuleSMTStatisticValue11664);
            iv_ruleSMTStatisticValue=ruleSMTStatisticValue();

            state._fsp--;

             current =iv_ruleSMTStatisticValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTStatisticValue11674); 

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
    // $ANTLR end "entryRuleSMTStatisticValue"


    // $ANTLR start "ruleSMTStatisticValue"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4986:1: ruleSMTStatisticValue returns [EObject current=null] : (this_SMTStatisticIntValue_0= ruleSMTStatisticIntValue | this_SMTStatisticDoubleValue_1= ruleSMTStatisticDoubleValue ) ;
    public final EObject ruleSMTStatisticValue() throws RecognitionException {
        EObject current = null;

        EObject this_SMTStatisticIntValue_0 = null;

        EObject this_SMTStatisticDoubleValue_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4989:28: ( (this_SMTStatisticIntValue_0= ruleSMTStatisticIntValue | this_SMTStatisticDoubleValue_1= ruleSMTStatisticDoubleValue ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4990:1: (this_SMTStatisticIntValue_0= ruleSMTStatisticIntValue | this_SMTStatisticDoubleValue_1= ruleSMTStatisticDoubleValue )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4990:1: (this_SMTStatisticIntValue_0= ruleSMTStatisticIntValue | this_SMTStatisticDoubleValue_1= ruleSMTStatisticDoubleValue )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_PROPERTYNAME) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_REAL) ) {
                    alt43=2;
                }
                else if ( (LA43_1==RULE_INT) ) {
                    alt43=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:4991:5: this_SMTStatisticIntValue_0= ruleSMTStatisticIntValue
                    {
                     
                            newCompositeNode(grammarAccess.getSMTStatisticValueAccess().getSMTStatisticIntValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSMTStatisticIntValue_in_ruleSMTStatisticValue11721);
                    this_SMTStatisticIntValue_0=ruleSMTStatisticIntValue();

                    state._fsp--;

                     
                            current = this_SMTStatisticIntValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5001:5: this_SMTStatisticDoubleValue_1= ruleSMTStatisticDoubleValue
                    {
                     
                            newCompositeNode(grammarAccess.getSMTStatisticValueAccess().getSMTStatisticDoubleValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSMTStatisticDoubleValue_in_ruleSMTStatisticValue11748);
                    this_SMTStatisticDoubleValue_1=ruleSMTStatisticDoubleValue();

                    state._fsp--;

                     
                            current = this_SMTStatisticDoubleValue_1; 
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
    // $ANTLR end "ruleSMTStatisticValue"


    // $ANTLR start "entryRuleSMTStatisticIntValue"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5017:1: entryRuleSMTStatisticIntValue returns [EObject current=null] : iv_ruleSMTStatisticIntValue= ruleSMTStatisticIntValue EOF ;
    public final EObject entryRuleSMTStatisticIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTStatisticIntValue = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5018:2: (iv_ruleSMTStatisticIntValue= ruleSMTStatisticIntValue EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5019:2: iv_ruleSMTStatisticIntValue= ruleSMTStatisticIntValue EOF
            {
             newCompositeNode(grammarAccess.getSMTStatisticIntValueRule()); 
            pushFollow(FOLLOW_ruleSMTStatisticIntValue_in_entryRuleSMTStatisticIntValue11783);
            iv_ruleSMTStatisticIntValue=ruleSMTStatisticIntValue();

            state._fsp--;

             current =iv_ruleSMTStatisticIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTStatisticIntValue11793); 

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
    // $ANTLR end "entryRuleSMTStatisticIntValue"


    // $ANTLR start "ruleSMTStatisticIntValue"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5026:1: ruleSMTStatisticIntValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_PROPERTYNAME ) ) ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSMTStatisticIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5029:28: ( ( ( (lv_name_0_0= RULE_PROPERTYNAME ) ) ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5030:1: ( ( (lv_name_0_0= RULE_PROPERTYNAME ) ) ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5030:1: ( ( (lv_name_0_0= RULE_PROPERTYNAME ) ) ( (lv_value_1_0= RULE_INT ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5030:2: ( (lv_name_0_0= RULE_PROPERTYNAME ) ) ( (lv_value_1_0= RULE_INT ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5030:2: ( (lv_name_0_0= RULE_PROPERTYNAME ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5031:1: (lv_name_0_0= RULE_PROPERTYNAME )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5031:1: (lv_name_0_0= RULE_PROPERTYNAME )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5032:3: lv_name_0_0= RULE_PROPERTYNAME
            {
            lv_name_0_0=(Token)match(input,RULE_PROPERTYNAME,FOLLOW_RULE_PROPERTYNAME_in_ruleSMTStatisticIntValue11835); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSMTStatisticIntValueAccess().getNamePROPERTYNAMETerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSMTStatisticIntValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"PROPERTYNAME");
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5048:2: ( (lv_value_1_0= RULE_INT ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5049:1: (lv_value_1_0= RULE_INT )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5049:1: (lv_value_1_0= RULE_INT )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5050:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSMTStatisticIntValue11857); 

            			newLeafNode(lv_value_1_0, grammarAccess.getSMTStatisticIntValueAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSMTStatisticIntValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleSMTStatisticIntValue"


    // $ANTLR start "entryRuleSMTStatisticDoubleValue"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5074:1: entryRuleSMTStatisticDoubleValue returns [EObject current=null] : iv_ruleSMTStatisticDoubleValue= ruleSMTStatisticDoubleValue EOF ;
    public final EObject entryRuleSMTStatisticDoubleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTStatisticDoubleValue = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5075:2: (iv_ruleSMTStatisticDoubleValue= ruleSMTStatisticDoubleValue EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5076:2: iv_ruleSMTStatisticDoubleValue= ruleSMTStatisticDoubleValue EOF
            {
             newCompositeNode(grammarAccess.getSMTStatisticDoubleValueRule()); 
            pushFollow(FOLLOW_ruleSMTStatisticDoubleValue_in_entryRuleSMTStatisticDoubleValue11898);
            iv_ruleSMTStatisticDoubleValue=ruleSMTStatisticDoubleValue();

            state._fsp--;

             current =iv_ruleSMTStatisticDoubleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTStatisticDoubleValue11908); 

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
    // $ANTLR end "entryRuleSMTStatisticDoubleValue"


    // $ANTLR start "ruleSMTStatisticDoubleValue"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5083:1: ruleSMTStatisticDoubleValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_PROPERTYNAME ) ) ( (lv_value_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleSMTStatisticDoubleValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5086:28: ( ( ( (lv_name_0_0= RULE_PROPERTYNAME ) ) ( (lv_value_1_0= RULE_REAL ) ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5087:1: ( ( (lv_name_0_0= RULE_PROPERTYNAME ) ) ( (lv_value_1_0= RULE_REAL ) ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5087:1: ( ( (lv_name_0_0= RULE_PROPERTYNAME ) ) ( (lv_value_1_0= RULE_REAL ) ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5087:2: ( (lv_name_0_0= RULE_PROPERTYNAME ) ) ( (lv_value_1_0= RULE_REAL ) )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5087:2: ( (lv_name_0_0= RULE_PROPERTYNAME ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5088:1: (lv_name_0_0= RULE_PROPERTYNAME )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5088:1: (lv_name_0_0= RULE_PROPERTYNAME )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5089:3: lv_name_0_0= RULE_PROPERTYNAME
            {
            lv_name_0_0=(Token)match(input,RULE_PROPERTYNAME,FOLLOW_RULE_PROPERTYNAME_in_ruleSMTStatisticDoubleValue11950); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSMTStatisticDoubleValueAccess().getNamePROPERTYNAMETerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSMTStatisticDoubleValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"PROPERTYNAME");
            	    

            }


            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5105:2: ( (lv_value_1_0= RULE_REAL ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5106:1: (lv_value_1_0= RULE_REAL )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5106:1: (lv_value_1_0= RULE_REAL )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5107:3: lv_value_1_0= RULE_REAL
            {
            lv_value_1_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleSMTStatisticDoubleValue11972); 

            			newLeafNode(lv_value_1_0, grammarAccess.getSMTStatisticDoubleValueAccess().getValueREALTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSMTStatisticDoubleValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"REAL");
            	    

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
    // $ANTLR end "ruleSMTStatisticDoubleValue"


    // $ANTLR start "entryRuleSMTStatisticsSection"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5131:1: entryRuleSMTStatisticsSection returns [EObject current=null] : iv_ruleSMTStatisticsSection= ruleSMTStatisticsSection EOF ;
    public final EObject entryRuleSMTStatisticsSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMTStatisticsSection = null;


        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5132:2: (iv_ruleSMTStatisticsSection= ruleSMTStatisticsSection EOF )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5133:2: iv_ruleSMTStatisticsSection= ruleSMTStatisticsSection EOF
            {
             newCompositeNode(grammarAccess.getSMTStatisticsSectionRule()); 
            pushFollow(FOLLOW_ruleSMTStatisticsSection_in_entryRuleSMTStatisticsSection12013);
            iv_ruleSMTStatisticsSection=ruleSMTStatisticsSection();

            state._fsp--;

             current =iv_ruleSMTStatisticsSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSMTStatisticsSection12023); 

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
    // $ANTLR end "entryRuleSMTStatisticsSection"


    // $ANTLR start "ruleSMTStatisticsSection"
    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5140:1: ruleSMTStatisticsSection returns [EObject current=null] : (otherlv_0= '(' () ( (lv_values_2_0= ruleSMTStatisticValue ) )* otherlv_3= ')' ) ;
    public final EObject ruleSMTStatisticsSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_values_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5143:28: ( (otherlv_0= '(' () ( (lv_values_2_0= ruleSMTStatisticValue ) )* otherlv_3= ')' ) )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5144:1: (otherlv_0= '(' () ( (lv_values_2_0= ruleSMTStatisticValue ) )* otherlv_3= ')' )
            {
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5144:1: (otherlv_0= '(' () ( (lv_values_2_0= ruleSMTStatisticValue ) )* otherlv_3= ')' )
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5144:3: otherlv_0= '(' () ( (lv_values_2_0= ruleSMTStatisticValue ) )* otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSMTStatisticsSection12060); 

                	newLeafNode(otherlv_0, grammarAccess.getSMTStatisticsSectionAccess().getLeftParenthesisKeyword_0());
                
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5148:1: ()
            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5149:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSMTStatisticsSectionAccess().getSMTStatisticsSectionAction_1(),
                        current);
                

            }

            // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5154:2: ( (lv_values_2_0= ruleSMTStatisticValue ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_PROPERTYNAME) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5155:1: (lv_values_2_0= ruleSMTStatisticValue )
            	    {
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5155:1: (lv_values_2_0= ruleSMTStatisticValue )
            	    // ../hu.bme.mit.inf.dslreasoner.smt.language/src-gen/hu/bme/mit/inf/dslreasoner/parser/antlr/internal/InternalSmtLanguage.g:5156:3: lv_values_2_0= ruleSMTStatisticValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSMTStatisticsSectionAccess().getValuesSMTStatisticValueParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSMTStatisticValue_in_ruleSMTStatisticsSection12090);
            	    lv_values_2_0=ruleSMTStatisticValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSMTStatisticsSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_2_0, 
            	            		"SMTStatisticValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSMTStatisticsSection12103); 

                	newLeafNode(otherlv_3, grammarAccess.getSMTStatisticsSectionAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSMTStatisticsSection"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA12_eotS =
        "\12\uffff";
    static final String DFA12_eofS =
        "\12\uffff";
    static final String DFA12_minS =
        "\2\4\10\uffff";
    static final String DFA12_maxS =
        "\1\32\1\61\10\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\1\1\2\1\7\1\3\1\4\1\10\1\6\1\5";
    static final String DFA12_specialS =
        "\12\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\1\uffff\2\3\7\uffff\1\1\11\uffff\2\3",
            "\1\2\26\uffff\1\7\2\uffff\1\7\5\5\1\11\1\10\6\4\6\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1122:1: (this_SMTSymbolicValue_0= ruleSMTSymbolicValue | this_SMTAtomicTerm_1= ruleSMTAtomicTerm | this_SMTBoolOperation_2= ruleSMTBoolOperation | this_SMTIntOperation_3= ruleSMTIntOperation | this_SMTITE_4= ruleSMTITE | this_SMTLet_5= ruleSMTLet | this_SMTRelation_6= ruleSMTRelation | this_SMTQuantifiedExpression_7= ruleSMTQuantifiedExpression )";
        }
    }
    static final String DFA34_eotS =
        "\13\uffff";
    static final String DFA34_eofS =
        "\13\uffff";
    static final String DFA34_minS =
        "\1\17\1\34\11\uffff";
    static final String DFA34_maxS =
        "\1\17\1\76\11\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\4\1\5\1\6\1\1\1\11\1\3\1\7\1\10\1\2";
    static final String DFA34_specialS =
        "\13\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1",
            "\1\6\31\uffff\1\5\1\12\1\7\1\2\1\3\1\4\1\10\1\11\1\6",
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "3891:1: (this_SMTAndThenCombinator_0= ruleSMTAndThenCombinator | this_SMTOrElseCombinator_1= ruleSMTOrElseCombinator | this_SMTParOrCombinator_2= ruleSMTParOrCombinator | this_SMTParThenCombinator_3= ruleSMTParThenCombinator | this_SMTTryForCombinator_4= ruleSMTTryForCombinator | this_SMTIfCombinator_5= ruleSMTIfCombinator | this_SMTWhenCombinator_6= ruleSMTWhenCombinator | this_SMTFailIfCombinator_7= ruleSMTFailIfCombinator | this_SMTUsingParamCombinator_8= ruleSMTUsingParamCombinator )";
        }
    }
 

    public static final BitSet FOLLOW_ruleSMTDocument_in_entryRuleSMTDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTInput_in_ruleSMTDocument131 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleSMTDocument144 = new BitSet(new long[]{0x000000000000C000L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleSMTOutput_in_ruleSMTDocument165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTInput_in_entryRuleSMTInput203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTInput213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTOption_in_ruleSMTInput259 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSMTType_in_ruleSMTInput282 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSMTFunctionDeclaration_in_ruleSMTInput309 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSMTFunctionDefinition_in_ruleSMTInput336 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSMTAssertion_in_ruleSMTInput363 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSMTSatCommand_in_ruleSMTInput386 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSMTGetModelCommand_in_ruleSMTInput407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTOutput_in_entryRuleSMTOutput443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTOutput453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTResult_in_ruleSMTOutput501 = new BitSet(new long[]{0x0000000000008000L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleSMTResult_in_ruleSMTOutput522 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_14_in_ruleSMTOutput542 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleSMTStatisticsSection_in_ruleSMTOutput574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTID_in_entryRuleSMTID612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTID623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSMTID662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTOption_in_entryRuleSMTOption706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTOption716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTOption753 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSMTOption765 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_PROPERTYNAME_in_ruleSMTOption782 = new BitSet(new long[]{0x00000000060000C0L});
    public static final BitSet FOLLOW_ruleSMTAtomicTerm_in_ruleSMTOption808 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTOption820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTType_in_entryRuleSMTType856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTType866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTEnumeratedTypeDeclaration_in_ruleSMTType913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTSetTypeDeclaration_in_ruleSMTType940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTEnumLiteral_in_entryRuleSMTEnumLiteral975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTEnumLiteral985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTID_in_ruleSMTEnumLiteral1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTEnumeratedTypeDeclaration_in_entryRuleSMTEnumeratedTypeDeclaration1065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTEnumeratedTypeDeclaration1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTEnumeratedTypeDeclaration1112 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSMTEnumeratedTypeDeclaration1124 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSMTEnumeratedTypeDeclaration1136 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTEnumeratedTypeDeclaration1148 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSMTEnumeratedTypeDeclaration1160 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSMTEnumeratedTypeDeclaration1172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSMTID_in_ruleSMTEnumeratedTypeDeclaration1193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSMTEnumLiteral_in_ruleSMTEnumeratedTypeDeclaration1214 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleSMTEnumeratedTypeDeclaration1227 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTEnumeratedTypeDeclaration1239 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTEnumeratedTypeDeclaration1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTSetTypeDeclaration_in_entryRuleSMTSetTypeDeclaration1287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTSetTypeDeclaration1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTSetTypeDeclaration1334 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSMTSetTypeDeclaration1346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSMTID_in_ruleSMTSetTypeDeclaration1367 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTSetTypeDeclaration1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTTypeReference_in_entryRuleSMTTypeReference1415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTTypeReference1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTComplexTypeReference_in_ruleSMTTypeReference1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTPrimitiveTypeReference_in_ruleSMTTypeReference1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTComplexTypeReference_in_entryRuleSMTComplexTypeReference1534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTComplexTypeReference1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSMTComplexTypeReference1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTPrimitiveTypeReference_in_entryRuleSMTPrimitiveTypeReference1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTPrimitiveTypeReference1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTIntTypeReference_in_ruleSMTPrimitiveTypeReference1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTBoolTypeReference_in_ruleSMTPrimitiveTypeReference1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTRealTypeReference_in_ruleSMTPrimitiveTypeReference1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTIntTypeReference_in_entryRuleSMTIntTypeReference1769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTIntTypeReference1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSMTIntTypeReference1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTBoolTypeReference_in_entryRuleSMTBoolTypeReference1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTBoolTypeReference1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSMTBoolTypeReference1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTRealTypeReference_in_entryRuleSMTRealTypeReference1953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTRealTypeReference1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSMTRealTypeReference2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTFunctionDeclaration_in_entryRuleSMTFunctionDeclaration2045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTFunctionDeclaration2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTFunctionDeclaration2092 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSMTFunctionDeclaration2104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSMTID_in_ruleSMTFunctionDeclaration2125 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSMTFunctionDeclaration2137 = new BitSet(new long[]{0x0000000000720010L});
    public static final BitSet FOLLOW_ruleSMTTypeReference_in_ruleSMTFunctionDeclaration2158 = new BitSet(new long[]{0x0000000000720010L});
    public static final BitSet FOLLOW_17_in_ruleSMTFunctionDeclaration2171 = new BitSet(new long[]{0x0000000000700010L});
    public static final BitSet FOLLOW_ruleSMTTypeReference_in_ruleSMTFunctionDeclaration2192 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTFunctionDeclaration2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTFunctionDefinition_in_entryRuleSMTFunctionDefinition2240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTFunctionDefinition2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTFunctionDefinition2287 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSMTFunctionDefinition2299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSMTID_in_ruleSMTFunctionDefinition2320 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSMTFunctionDefinition2332 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_ruleSMTSortedVariable_in_ruleSMTFunctionDefinition2353 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleSMTFunctionDefinition2366 = new BitSet(new long[]{0x0000000000700010L});
    public static final BitSet FOLLOW_ruleSMTTypeReference_in_ruleSMTFunctionDefinition2387 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTFunctionDefinition2408 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTFunctionDefinition2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_entryRuleSMTTerm2456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTTerm2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTSymbolicValue_in_ruleSMTTerm2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTAtomicTerm_in_ruleSMTTerm2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTBoolOperation_in_ruleSMTTerm2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTIntOperation_in_ruleSMTTerm2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTITE_in_ruleSMTTerm2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTLet_in_ruleSMTTerm2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTRelation_in_ruleSMTTerm2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTQuantifiedExpression_in_ruleSMTTerm2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTSymbolicValue_in_entryRuleSMTSymbolicValue2739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTSymbolicValue2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTSymbolicValue2787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSMTSymbolicValue2807 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTSymbolicValue2828 = new BitSet(new long[]{0x00000000060280D0L});
    public static final BitSet FOLLOW_17_in_ruleSMTSymbolicValue2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSMTSymbolicValue2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTAtomicTerm_in_entryRuleSMTAtomicTerm2904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTAtomicTerm2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTIntLiteral_in_ruleSMTAtomicTerm2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTBoolLiteral_in_ruleSMTAtomicTerm2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTRealLiteral_in_ruleSMTAtomicTerm3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTIntLiteral_in_entryRuleSMTIntLiteral3050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTIntLiteral3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSMTIntLiteral3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEANTERMINAL_in_entryRuleBOOLEANTERMINAL3142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEANTERMINAL3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBOOLEANTERMINAL3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBOOLEANTERMINAL3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTBoolLiteral_in_entryRuleSMTBoolLiteral3250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTBoolLiteral3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEANTERMINAL_in_ruleSMTBoolLiteral3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTRealLiteral_in_entryRuleSMTRealLiteral3340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTRealLiteral3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleSMTRealLiteral3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTSortedVariable_in_entryRuleSMTSortedVariable3431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTSortedVariable3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTSortedVariable3478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSMTID_in_ruleSMTSortedVariable3499 = new BitSet(new long[]{0x0000000000700010L});
    public static final BitSet FOLLOW_ruleSMTTypeReference_in_ruleSMTSortedVariable3520 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTSortedVariable3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTQuantifiedExpression_in_entryRuleSMTQuantifiedExpression3568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTQuantifiedExpression3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTExists_in_ruleSMTQuantifiedExpression3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTForall_in_ruleSMTQuantifiedExpression3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTExists_in_entryRuleSMTExists3687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTExists3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTExists3734 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSMTExists3746 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSMTExists3758 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSMTSortedVariable_in_ruleSMTExists3779 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleSMTExists3792 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTExists3814 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15_in_ruleSMTExists3833 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSMTExists3845 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTExists3866 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSMTExists3878 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSMTExists3890 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTExists3911 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTExists3923 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTExists3935 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTExists3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTForall_in_entryRuleSMTForall3985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTForall3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTForall4032 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSMTForall4044 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSMTForall4056 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSMTSortedVariable_in_ruleSMTForall4077 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleSMTForall4090 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTForall4112 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15_in_ruleSMTForall4131 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSMTForall4143 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTForall4164 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSMTForall4176 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSMTForall4188 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTForall4209 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTForall4221 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTForall4233 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTForall4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTBoolOperation_in_entryRuleSMTBoolOperation4283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTBoolOperation4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTAnd_in_ruleSMTBoolOperation4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTOr_in_ruleSMTBoolOperation4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTImpl_in_ruleSMTBoolOperation4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTNot_in_ruleSMTBoolOperation4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTIff_in_ruleSMTBoolOperation4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTAnd_in_entryRuleSMTAnd4483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTAnd4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTAnd4530 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSMTAnd4542 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTAnd4563 = new BitSet(new long[]{0x00000000060280D0L});
    public static final BitSet FOLLOW_17_in_ruleSMTAnd4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTOr_in_entryRuleSMTOr4612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTOr4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTOr4659 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSMTOr4671 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTOr4692 = new BitSet(new long[]{0x00000000060280D0L});
    public static final BitSet FOLLOW_17_in_ruleSMTOr4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTImpl_in_entryRuleSMTImpl4741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTImpl4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTImpl4788 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSMTImpl4800 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTImpl4821 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTImpl4842 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTImpl4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTNot_in_entryRuleSMTNot4890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTNot4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTNot4937 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSMTNot4949 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTNot4970 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTNot4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTIff_in_entryRuleSMTIff5018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTIff5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTIff5065 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleSMTIff5077 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTIff5098 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTIff5119 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTIff5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTITE_in_entryRuleSMTITE5167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTITE5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTITE5214 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSMTITE5226 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTITE5247 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTITE5268 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTITE5289 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTITE5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTLet_in_entryRuleSMTLet5337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTLet5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTLet5384 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSMTLet5396 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSMTLet5408 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSMTInlineConstantDefinition_in_ruleSMTLet5429 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleSMTLet5442 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTLet5463 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTLet5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTInlineConstantDefinition_in_entryRuleSMTInlineConstantDefinition5511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTInlineConstantDefinition5521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTInlineConstantDefinition5558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSMTID_in_ruleSMTInlineConstantDefinition5579 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTInlineConstantDefinition5600 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTInlineConstantDefinition5612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTRelation_in_entryRuleSMTRelation5648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTRelation5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTEquals_in_ruleSMTRelation5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTDistinct_in_ruleSMTRelation5732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTLT_in_ruleSMTRelation5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTMT_in_ruleSMTRelation5786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTLEQ_in_ruleSMTRelation5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTMEQ_in_ruleSMTRelation5840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTEquals_in_entryRuleSMTEquals5875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTEquals5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTEquals5922 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSMTEquals5934 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTEquals5955 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTEquals5976 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTEquals5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTDistinct_in_entryRuleSMTDistinct6024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTDistinct6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTDistinct6071 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleSMTDistinct6083 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTDistinct6104 = new BitSet(new long[]{0x00000000060280D0L});
    public static final BitSet FOLLOW_17_in_ruleSMTDistinct6117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTLT_in_entryRuleSMTLT6153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTLT6163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTLT6200 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSMTLT6212 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTLT6233 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTLT6254 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTLT6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTMT_in_entryRuleSMTMT6302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTMT6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTMT6349 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSMTMT6361 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTMT6382 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTMT6403 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTMT6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTLEQ_in_entryRuleSMTLEQ6451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTLEQ6461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTLEQ6498 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSMTLEQ6510 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTLEQ6531 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTLEQ6552 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTLEQ6564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTMEQ_in_entryRuleSMTMEQ6600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTMEQ6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTMEQ6647 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleSMTMEQ6659 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTMEQ6680 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTMEQ6701 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTMEQ6713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTIntOperation_in_entryRuleSMTIntOperation6749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTIntOperation6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTPlus_in_ruleSMTIntOperation6806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTMinus_in_ruleSMTIntOperation6833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTMultiply_in_ruleSMTIntOperation6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTDivison_in_ruleSMTIntOperation6887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTDiv_in_ruleSMTIntOperation6914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTMod_in_ruleSMTIntOperation6941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTPlus_in_entryRuleSMTPlus6976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTPlus6986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTPlus7023 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleSMTPlus7035 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTPlus7056 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTPlus7077 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTPlus7089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTMinus_in_entryRuleSMTMinus7125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTMinus7135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTMinus7172 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleSMTMinus7184 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTMinus7205 = new BitSet(new long[]{0x00000000060280D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTMinus7226 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTMinus7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTMultiply_in_entryRuleSMTMultiply7275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTMultiply7285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTMultiply7322 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleSMTMultiply7334 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTMultiply7355 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTMultiply7376 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTMultiply7388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTDivison_in_entryRuleSMTDivison7424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTDivison7434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTDivison7471 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleSMTDivison7483 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTDivison7504 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTDivison7525 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTDivison7537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTDiv_in_entryRuleSMTDiv7573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTDiv7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTDiv7620 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleSMTDiv7632 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTDiv7653 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTDiv7674 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTDiv7686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTMod_in_entryRuleSMTMod7722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTMod7732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTMod7769 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleSMTMod7781 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTMod7802 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTMod7823 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTMod7835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTAssertion_in_entryRuleSMTAssertion7871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTAssertion7881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTAssertion7918 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleSMTAssertion7930 = new BitSet(new long[]{0x00000000060080D0L});
    public static final BitSet FOLLOW_ruleSMTTerm_in_ruleSMTAssertion7951 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTAssertion7963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTCardinalityConstraint_in_entryRuleSMTCardinalityConstraint7999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTCardinalityConstraint8009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTCardinalityConstraint8046 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSMTCardinalityConstraint8058 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSMTCardinalityConstraint8070 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSMTCardinalityConstraint8082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSMTCardinalityConstraint8093 = new BitSet(new long[]{0x0000000000700010L});
    public static final BitSet FOLLOW_ruleSMTTypeReference_in_ruleSMTCardinalityConstraint8113 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTCardinalityConstraint8125 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTCardinalityConstraint8137 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSMTCardinalityConstraint8151 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSMTCardinalityConstraint8163 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleSMTCardinalityConstraint8176 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSMTCardinalityConstraint8188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSMTCardinalityConstraint8199 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSMTSymbolicValue_in_ruleSMTCardinalityConstraint8219 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTCardinalityConstraint8231 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleSMTCardinalityConstraint8245 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15_in_ruleSMTCardinalityConstraint8265 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSMTCardinalityConstraint8277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSMTCardinalityConstraint8288 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSMTSymbolicValue_in_ruleSMTCardinalityConstraint8308 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTCardinalityConstraint8320 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTCardinalityConstraint8334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTSatCommand_in_entryRuleSMTSatCommand8370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTSatCommand8380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTSimpleSatCommand_in_ruleSMTSatCommand8427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTComplexSatCommand_in_ruleSMTSatCommand8454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTSimpleSatCommand_in_entryRuleSMTSimpleSatCommand8489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTSimpleSatCommand8499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTSimpleSatCommand8536 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleSMTSimpleSatCommand8548 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTSimpleSatCommand8569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTComplexSatCommand_in_entryRuleSMTComplexSatCommand8605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTComplexSatCommand8615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTComplexSatCommand8652 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleSMTComplexSatCommand8664 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSMTReasoningTactic_in_ruleSMTComplexSatCommand8685 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTComplexSatCommand8697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTGetModelCommand_in_entryRuleSMTGetModelCommand8733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTGetModelCommand8743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTGetModelCommand8780 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleSMTGetModelCommand8792 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTGetModelCommand8813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTReasoningTactic_in_entryRuleSMTReasoningTactic8849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTReasoningTactic8859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTBuiltinTactic_in_ruleSMTReasoningTactic8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTReasoningCombinator_in_ruleSMTReasoningTactic8933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTBuiltinTactic_in_entryRuleSMTBuiltinTactic8968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTBuiltinTactic8978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSMTBuiltinTactic9019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTReasoningCombinator_in_entryRuleSMTReasoningCombinator9059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTReasoningCombinator9069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTAndThenCombinator_in_ruleSMTReasoningCombinator9116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTOrElseCombinator_in_ruleSMTReasoningCombinator9143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTParOrCombinator_in_ruleSMTReasoningCombinator9170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTParThenCombinator_in_ruleSMTReasoningCombinator9197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTTryForCombinator_in_ruleSMTReasoningCombinator9224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTIfCombinator_in_ruleSMTReasoningCombinator9251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTWhenCombinator_in_ruleSMTReasoningCombinator9278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTFailIfCombinator_in_ruleSMTReasoningCombinator9305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTUsingParamCombinator_in_ruleSMTReasoningCombinator9332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTAndThenCombinator_in_entryRuleSMTAndThenCombinator9367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTAndThenCombinator9377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTAndThenCombinator9414 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleSMTAndThenCombinator9426 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSMTReasoningTactic_in_ruleSMTAndThenCombinator9447 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_17_in_ruleSMTAndThenCombinator9460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTOrElseCombinator_in_entryRuleSMTOrElseCombinator9496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTOrElseCombinator9506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTOrElseCombinator9543 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleSMTOrElseCombinator9555 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSMTReasoningTactic_in_ruleSMTOrElseCombinator9576 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_17_in_ruleSMTOrElseCombinator9589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTParOrCombinator_in_entryRuleSMTParOrCombinator9625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTParOrCombinator9635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTParOrCombinator9672 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleSMTParOrCombinator9684 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSMTReasoningTactic_in_ruleSMTParOrCombinator9705 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_17_in_ruleSMTParOrCombinator9718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTParThenCombinator_in_entryRuleSMTParThenCombinator9754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTParThenCombinator9764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTParThenCombinator9801 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleSMTParThenCombinator9813 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSMTReasoningTactic_in_ruleSMTParThenCombinator9834 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSMTReasoningTactic_in_ruleSMTParThenCombinator9855 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTParThenCombinator9867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTTryForCombinator_in_entryRuleSMTTryForCombinator9903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTTryForCombinator9913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTTryForCombinator9950 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleSMTTryForCombinator9962 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSMTReasoningTactic_in_ruleSMTTryForCombinator9983 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSMTTryForCombinator10000 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTTryForCombinator10017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTIfCombinator_in_entryRuleSMTIfCombinator10053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTIfCombinator10063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTIfCombinator10100 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleSMTIfCombinator10112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReasoningProbe_in_ruleSMTIfCombinator10133 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSMTReasoningTactic_in_ruleSMTIfCombinator10154 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSMTReasoningTactic_in_ruleSMTIfCombinator10175 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTIfCombinator10187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTWhenCombinator_in_entryRuleSMTWhenCombinator10223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTWhenCombinator10233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTWhenCombinator10270 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleSMTWhenCombinator10282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReasoningProbe_in_ruleSMTWhenCombinator10303 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSMTReasoningTactic_in_ruleSMTWhenCombinator10324 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTWhenCombinator10336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTFailIfCombinator_in_entryRuleSMTFailIfCombinator10372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTFailIfCombinator10382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTFailIfCombinator10419 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleSMTFailIfCombinator10431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReasoningProbe_in_ruleSMTFailIfCombinator10452 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTFailIfCombinator10464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTUsingParamCombinator_in_entryRuleSMTUsingParamCombinator10500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTUsingParamCombinator10510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTUsingParamCombinator10547 = new BitSet(new long[]{0x4000000010000000L});
    public static final BitSet FOLLOW_62_in_ruleSMTUsingParamCombinator10560 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_28_in_ruleSMTUsingParamCombinator10578 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSMTReasoningTactic_in_ruleSMTUsingParamCombinator10600 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_ruleReasoningTacticParameter_in_ruleSMTUsingParamCombinator10621 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_ruleSMTUsingParamCombinator10634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReasoningProbe_in_entryRuleReasoningProbe10670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReasoningProbe10680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReasoningProbe10721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReasoningTacticParameter_in_entryRuleReasoningTacticParameter10761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReasoningTacticParameter10771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROPERTYNAME_in_ruleReasoningTacticParameter10813 = new BitSet(new long[]{0x00000000060000C0L});
    public static final BitSet FOLLOW_ruleSMTAtomicTerm_in_ruleReasoningTacticParameter10839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTResult_in_entryRuleSMTResult10875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTResult10885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTUnsupportedResult_in_ruleSMTResult10932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTSatResult_in_ruleSMTResult10959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTModelResult_in_ruleSMTResult10986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTErrorResult_in_ruleSMTResult11013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTErrorResult_in_entryRuleSMTErrorResult11048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTErrorResult11058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTErrorResult11095 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleSMTErrorResult11107 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSMTErrorResult11124 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSMTErrorResult11141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTUnsupportedResult_in_entryRuleSMTUnsupportedResult11177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTUnsupportedResult11187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleSMTUnsupportedResult11224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSMTUnsupportedResult11236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSMTUnsupportedResult11253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTSatResult_in_entryRuleSMTSatResult11294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTSatResult11304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleSMTSatResult11347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleSMTSatResult11384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleSMTSatResult11421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTModelResult_in_entryRuleSMTModelResult11470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTModelResult11480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTModelResult11526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleSMTModelResult11538 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_ruleSMTFunctionDeclaration_in_ruleSMTModelResult11560 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_ruleSMTCardinalityConstraint_in_ruleSMTModelResult11587 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_ruleSMTFunctionDefinition_in_ruleSMTModelResult11614 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleSMTModelResult11628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTStatisticValue_in_entryRuleSMTStatisticValue11664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTStatisticValue11674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTStatisticIntValue_in_ruleSMTStatisticValue11721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTStatisticDoubleValue_in_ruleSMTStatisticValue11748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTStatisticIntValue_in_entryRuleSMTStatisticIntValue11783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTStatisticIntValue11793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROPERTYNAME_in_ruleSMTStatisticIntValue11835 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSMTStatisticIntValue11857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTStatisticDoubleValue_in_entryRuleSMTStatisticDoubleValue11898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTStatisticDoubleValue11908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROPERTYNAME_in_ruleSMTStatisticDoubleValue11950 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleSMTStatisticDoubleValue11972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSMTStatisticsSection_in_entryRuleSMTStatisticsSection12013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSMTStatisticsSection12023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSMTStatisticsSection12060 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_ruleSMTStatisticValue_in_ruleSMTStatisticsSection12090 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_ruleSMTStatisticsSection12103 = new BitSet(new long[]{0x0000000000000002L});

}