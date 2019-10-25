package hu.bme.mit.inf.dslreasoner.parser.antlr.internal; 

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
import hu.bme.mit.inf.dslreasoner.services.AlloyLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAlloyLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'enum'", "'{'", "','", "'}'", "'abstract'", "'sig'", "'extends'", "'in'", "'+'", "':'", "'fun'", "'['", "']'", "'pred'", "'fact'", "'disj'", "'||'", "'or'", "'<=>'", "'iff'", "'=>'", "'implies'", "'else'", "'&&'", "'and'", "'='", "'!='", "'>'", "'>='", "'<'", "'<='", "'++'", "':>'", "'<:'", "'.'", "'-'", "'&'", "'->'", "'!'", "'not'", "'~'", "'^'", "'*'", "'#'", "'sum'", "'none'", "'iden'", "'univ'", "'Int'", "'String'", "'('", "')'", "'run'", "'for'", "'exactly'", "'all'", "'no'", "'some'", "'lone'", "'one'", "'set'", "'plus'", "'sub'", "'mul'", "'rem'", "'div'"
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
    public static final int T__76=76;
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
     	
        public InternalAlloyLanguageParser(TokenStream input, AlloyLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ALSDocument";	
       	}
       	
       	@Override
       	protected AlloyLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleALSDocument"
    // InternalAlloyLanguage.g:68:1: entryRuleALSDocument returns [EObject current=null] : iv_ruleALSDocument= ruleALSDocument EOF ;
    public final EObject entryRuleALSDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSDocument = null;


        try {
            // InternalAlloyLanguage.g:69:2: (iv_ruleALSDocument= ruleALSDocument EOF )
            // InternalAlloyLanguage.g:70:2: iv_ruleALSDocument= ruleALSDocument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSDocumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSDocument=ruleALSDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSDocument; 
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
    // $ANTLR end "entryRuleALSDocument"


    // $ANTLR start "ruleALSDocument"
    // InternalAlloyLanguage.g:77:1: ruleALSDocument returns [EObject current=null] : ( ( ( (lv_enumDeclarations_0_0= ruleALSEnumDeclaration ) ) | ( (lv_signatureBodies_1_0= ruleALSSignatureBody ) ) | ( (lv_functionDefinitions_2_0= ruleALSFunctionDefinition ) ) | ( (lv_relationDefinitions_3_0= ruleALSRelationDefinition ) ) | ( (lv_factDeclarations_4_0= ruleALSFactDeclaration ) ) )+ ( (lv_runCommand_5_0= ruleALSRunCommand ) ) ) ;
    public final EObject ruleALSDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_enumDeclarations_0_0 = null;

        EObject lv_signatureBodies_1_0 = null;

        EObject lv_functionDefinitions_2_0 = null;

        EObject lv_relationDefinitions_3_0 = null;

        EObject lv_factDeclarations_4_0 = null;

        EObject lv_runCommand_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:80:28: ( ( ( ( (lv_enumDeclarations_0_0= ruleALSEnumDeclaration ) ) | ( (lv_signatureBodies_1_0= ruleALSSignatureBody ) ) | ( (lv_functionDefinitions_2_0= ruleALSFunctionDefinition ) ) | ( (lv_relationDefinitions_3_0= ruleALSRelationDefinition ) ) | ( (lv_factDeclarations_4_0= ruleALSFactDeclaration ) ) )+ ( (lv_runCommand_5_0= ruleALSRunCommand ) ) ) )
            // InternalAlloyLanguage.g:81:1: ( ( ( (lv_enumDeclarations_0_0= ruleALSEnumDeclaration ) ) | ( (lv_signatureBodies_1_0= ruleALSSignatureBody ) ) | ( (lv_functionDefinitions_2_0= ruleALSFunctionDefinition ) ) | ( (lv_relationDefinitions_3_0= ruleALSRelationDefinition ) ) | ( (lv_factDeclarations_4_0= ruleALSFactDeclaration ) ) )+ ( (lv_runCommand_5_0= ruleALSRunCommand ) ) )
            {
            // InternalAlloyLanguage.g:81:1: ( ( ( (lv_enumDeclarations_0_0= ruleALSEnumDeclaration ) ) | ( (lv_signatureBodies_1_0= ruleALSSignatureBody ) ) | ( (lv_functionDefinitions_2_0= ruleALSFunctionDefinition ) ) | ( (lv_relationDefinitions_3_0= ruleALSRelationDefinition ) ) | ( (lv_factDeclarations_4_0= ruleALSFactDeclaration ) ) )+ ( (lv_runCommand_5_0= ruleALSRunCommand ) ) )
            // InternalAlloyLanguage.g:81:2: ( ( (lv_enumDeclarations_0_0= ruleALSEnumDeclaration ) ) | ( (lv_signatureBodies_1_0= ruleALSSignatureBody ) ) | ( (lv_functionDefinitions_2_0= ruleALSFunctionDefinition ) ) | ( (lv_relationDefinitions_3_0= ruleALSRelationDefinition ) ) | ( (lv_factDeclarations_4_0= ruleALSFactDeclaration ) ) )+ ( (lv_runCommand_5_0= ruleALSRunCommand ) )
            {
            // InternalAlloyLanguage.g:81:2: ( ( (lv_enumDeclarations_0_0= ruleALSEnumDeclaration ) ) | ( (lv_signatureBodies_1_0= ruleALSSignatureBody ) ) | ( (lv_functionDefinitions_2_0= ruleALSFunctionDefinition ) ) | ( (lv_relationDefinitions_3_0= ruleALSRelationDefinition ) ) | ( (lv_factDeclarations_4_0= ruleALSFactDeclaration ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case 15:
                case 16:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                    {
                    alt1=2;
                    }
                    break;
                case 21:
                    {
                    alt1=3;
                    }
                    break;
                case 24:
                    {
                    alt1=4;
                    }
                    break;
                case 25:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalAlloyLanguage.g:81:3: ( (lv_enumDeclarations_0_0= ruleALSEnumDeclaration ) )
            	    {
            	    // InternalAlloyLanguage.g:81:3: ( (lv_enumDeclarations_0_0= ruleALSEnumDeclaration ) )
            	    // InternalAlloyLanguage.g:82:1: (lv_enumDeclarations_0_0= ruleALSEnumDeclaration )
            	    {
            	    // InternalAlloyLanguage.g:82:1: (lv_enumDeclarations_0_0= ruleALSEnumDeclaration )
            	    // InternalAlloyLanguage.g:83:3: lv_enumDeclarations_0_0= ruleALSEnumDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getALSDocumentAccess().getEnumDeclarationsALSEnumDeclarationParserRuleCall_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_enumDeclarations_0_0=ruleALSEnumDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getALSDocumentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"enumDeclarations",
            	              		lv_enumDeclarations_0_0, 
            	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSEnumDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlloyLanguage.g:100:6: ( (lv_signatureBodies_1_0= ruleALSSignatureBody ) )
            	    {
            	    // InternalAlloyLanguage.g:100:6: ( (lv_signatureBodies_1_0= ruleALSSignatureBody ) )
            	    // InternalAlloyLanguage.g:101:1: (lv_signatureBodies_1_0= ruleALSSignatureBody )
            	    {
            	    // InternalAlloyLanguage.g:101:1: (lv_signatureBodies_1_0= ruleALSSignatureBody )
            	    // InternalAlloyLanguage.g:102:3: lv_signatureBodies_1_0= ruleALSSignatureBody
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getALSDocumentAccess().getSignatureBodiesALSSignatureBodyParserRuleCall_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_signatureBodies_1_0=ruleALSSignatureBody();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getALSDocumentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"signatureBodies",
            	              		lv_signatureBodies_1_0, 
            	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSSignatureBody");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAlloyLanguage.g:119:6: ( (lv_functionDefinitions_2_0= ruleALSFunctionDefinition ) )
            	    {
            	    // InternalAlloyLanguage.g:119:6: ( (lv_functionDefinitions_2_0= ruleALSFunctionDefinition ) )
            	    // InternalAlloyLanguage.g:120:1: (lv_functionDefinitions_2_0= ruleALSFunctionDefinition )
            	    {
            	    // InternalAlloyLanguage.g:120:1: (lv_functionDefinitions_2_0= ruleALSFunctionDefinition )
            	    // InternalAlloyLanguage.g:121:3: lv_functionDefinitions_2_0= ruleALSFunctionDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getALSDocumentAccess().getFunctionDefinitionsALSFunctionDefinitionParserRuleCall_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_functionDefinitions_2_0=ruleALSFunctionDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getALSDocumentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"functionDefinitions",
            	              		lv_functionDefinitions_2_0, 
            	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSFunctionDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAlloyLanguage.g:138:6: ( (lv_relationDefinitions_3_0= ruleALSRelationDefinition ) )
            	    {
            	    // InternalAlloyLanguage.g:138:6: ( (lv_relationDefinitions_3_0= ruleALSRelationDefinition ) )
            	    // InternalAlloyLanguage.g:139:1: (lv_relationDefinitions_3_0= ruleALSRelationDefinition )
            	    {
            	    // InternalAlloyLanguage.g:139:1: (lv_relationDefinitions_3_0= ruleALSRelationDefinition )
            	    // InternalAlloyLanguage.g:140:3: lv_relationDefinitions_3_0= ruleALSRelationDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getALSDocumentAccess().getRelationDefinitionsALSRelationDefinitionParserRuleCall_0_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_relationDefinitions_3_0=ruleALSRelationDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getALSDocumentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"relationDefinitions",
            	              		lv_relationDefinitions_3_0, 
            	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSRelationDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAlloyLanguage.g:157:6: ( (lv_factDeclarations_4_0= ruleALSFactDeclaration ) )
            	    {
            	    // InternalAlloyLanguage.g:157:6: ( (lv_factDeclarations_4_0= ruleALSFactDeclaration ) )
            	    // InternalAlloyLanguage.g:158:1: (lv_factDeclarations_4_0= ruleALSFactDeclaration )
            	    {
            	    // InternalAlloyLanguage.g:158:1: (lv_factDeclarations_4_0= ruleALSFactDeclaration )
            	    // InternalAlloyLanguage.g:159:3: lv_factDeclarations_4_0= ruleALSFactDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getALSDocumentAccess().getFactDeclarationsALSFactDeclarationParserRuleCall_0_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_factDeclarations_4_0=ruleALSFactDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getALSDocumentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"factDeclarations",
            	              		lv_factDeclarations_4_0, 
            	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSFactDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalAlloyLanguage.g:175:4: ( (lv_runCommand_5_0= ruleALSRunCommand ) )
            // InternalAlloyLanguage.g:176:1: (lv_runCommand_5_0= ruleALSRunCommand )
            {
            // InternalAlloyLanguage.g:176:1: (lv_runCommand_5_0= ruleALSRunCommand )
            // InternalAlloyLanguage.g:177:3: lv_runCommand_5_0= ruleALSRunCommand
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSDocumentAccess().getRunCommandALSRunCommandParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_runCommand_5_0=ruleALSRunCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSDocumentRule());
              	        }
                     		set(
                     			current, 
                     			"runCommand",
                      		lv_runCommand_5_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSRunCommand");
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
    // $ANTLR end "ruleALSDocument"


    // $ANTLR start "entryRuleALSID"
    // InternalAlloyLanguage.g:201:1: entryRuleALSID returns [String current=null] : iv_ruleALSID= ruleALSID EOF ;
    public final String entryRuleALSID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleALSID = null;


        try {
            // InternalAlloyLanguage.g:202:2: (iv_ruleALSID= ruleALSID EOF )
            // InternalAlloyLanguage.g:203:2: iv_ruleALSID= ruleALSID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSID=ruleALSID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSID.getText(); 
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
    // $ANTLR end "entryRuleALSID"


    // $ANTLR start "ruleALSID"
    // InternalAlloyLanguage.g:210:1: ruleALSID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleALSID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:213:28: (this_ID_0= RULE_ID )
            // InternalAlloyLanguage.g:214:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getALSIDAccess().getIDTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleALSID"


    // $ANTLR start "entryRuleALSTypeDeclaration"
    // InternalAlloyLanguage.g:231:1: entryRuleALSTypeDeclaration returns [EObject current=null] : iv_ruleALSTypeDeclaration= ruleALSTypeDeclaration EOF ;
    public final EObject entryRuleALSTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSTypeDeclaration = null;


        try {
            // InternalAlloyLanguage.g:232:2: (iv_ruleALSTypeDeclaration= ruleALSTypeDeclaration EOF )
            // InternalAlloyLanguage.g:233:2: iv_ruleALSTypeDeclaration= ruleALSTypeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSTypeDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSTypeDeclaration=ruleALSTypeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSTypeDeclaration; 
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
    // $ANTLR end "entryRuleALSTypeDeclaration"


    // $ANTLR start "ruleALSTypeDeclaration"
    // InternalAlloyLanguage.g:240:1: ruleALSTypeDeclaration returns [EObject current=null] : (this_ALSEnumDeclaration_0= ruleALSEnumDeclaration | this_ALSSignatureDeclaration_1= ruleALSSignatureDeclaration ) ;
    public final EObject ruleALSTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ALSEnumDeclaration_0 = null;

        EObject this_ALSSignatureDeclaration_1 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:243:28: ( (this_ALSEnumDeclaration_0= ruleALSEnumDeclaration | this_ALSSignatureDeclaration_1= ruleALSSignatureDeclaration ) )
            // InternalAlloyLanguage.g:244:1: (this_ALSEnumDeclaration_0= ruleALSEnumDeclaration | this_ALSSignatureDeclaration_1= ruleALSSignatureDeclaration )
            {
            // InternalAlloyLanguage.g:244:1: (this_ALSEnumDeclaration_0= ruleALSEnumDeclaration | this_ALSSignatureDeclaration_1= ruleALSSignatureDeclaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAlloyLanguage.g:245:5: this_ALSEnumDeclaration_0= ruleALSEnumDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getALSTypeDeclarationAccess().getALSEnumDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ALSEnumDeclaration_0=ruleALSEnumDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ALSEnumDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:255:5: this_ALSSignatureDeclaration_1= ruleALSSignatureDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getALSTypeDeclarationAccess().getALSSignatureDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ALSSignatureDeclaration_1=ruleALSSignatureDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ALSSignatureDeclaration_1; 
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
    // $ANTLR end "ruleALSTypeDeclaration"


    // $ANTLR start "entryRuleALSEnumDeclaration"
    // InternalAlloyLanguage.g:271:1: entryRuleALSEnumDeclaration returns [EObject current=null] : iv_ruleALSEnumDeclaration= ruleALSEnumDeclaration EOF ;
    public final EObject entryRuleALSEnumDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSEnumDeclaration = null;


        try {
            // InternalAlloyLanguage.g:272:2: (iv_ruleALSEnumDeclaration= ruleALSEnumDeclaration EOF )
            // InternalAlloyLanguage.g:273:2: iv_ruleALSEnumDeclaration= ruleALSEnumDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSEnumDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSEnumDeclaration=ruleALSEnumDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSEnumDeclaration; 
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
    // $ANTLR end "entryRuleALSEnumDeclaration"


    // $ANTLR start "ruleALSEnumDeclaration"
    // InternalAlloyLanguage.g:280:1: ruleALSEnumDeclaration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= ruleALSID ) ) otherlv_2= '{' ( (lv_literal_3_0= ruleALSEnumLiteral ) ) (otherlv_4= ',' ( (lv_literal_5_0= ruleALSEnumLiteral ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleALSEnumDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_literal_3_0 = null;

        EObject lv_literal_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:283:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= ruleALSID ) ) otherlv_2= '{' ( (lv_literal_3_0= ruleALSEnumLiteral ) ) (otherlv_4= ',' ( (lv_literal_5_0= ruleALSEnumLiteral ) ) )* otherlv_6= '}' ) )
            // InternalAlloyLanguage.g:284:1: (otherlv_0= 'enum' ( (lv_name_1_0= ruleALSID ) ) otherlv_2= '{' ( (lv_literal_3_0= ruleALSEnumLiteral ) ) (otherlv_4= ',' ( (lv_literal_5_0= ruleALSEnumLiteral ) ) )* otherlv_6= '}' )
            {
            // InternalAlloyLanguage.g:284:1: (otherlv_0= 'enum' ( (lv_name_1_0= ruleALSID ) ) otherlv_2= '{' ( (lv_literal_3_0= ruleALSEnumLiteral ) ) (otherlv_4= ',' ( (lv_literal_5_0= ruleALSEnumLiteral ) ) )* otherlv_6= '}' )
            // InternalAlloyLanguage.g:284:3: otherlv_0= 'enum' ( (lv_name_1_0= ruleALSID ) ) otherlv_2= '{' ( (lv_literal_3_0= ruleALSEnumLiteral ) ) (otherlv_4= ',' ( (lv_literal_5_0= ruleALSEnumLiteral ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getALSEnumDeclarationAccess().getEnumKeyword_0());
                  
            }
            // InternalAlloyLanguage.g:288:1: ( (lv_name_1_0= ruleALSID ) )
            // InternalAlloyLanguage.g:289:1: (lv_name_1_0= ruleALSID )
            {
            // InternalAlloyLanguage.g:289:1: (lv_name_1_0= ruleALSID )
            // InternalAlloyLanguage.g:290:3: lv_name_1_0= ruleALSID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSEnumDeclarationAccess().getNameALSIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleALSID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSEnumDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getALSEnumDeclarationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalAlloyLanguage.g:310:1: ( (lv_literal_3_0= ruleALSEnumLiteral ) )
            // InternalAlloyLanguage.g:311:1: (lv_literal_3_0= ruleALSEnumLiteral )
            {
            // InternalAlloyLanguage.g:311:1: (lv_literal_3_0= ruleALSEnumLiteral )
            // InternalAlloyLanguage.g:312:3: lv_literal_3_0= ruleALSEnumLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSEnumDeclarationAccess().getLiteralALSEnumLiteralParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_6);
            lv_literal_3_0=ruleALSEnumLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSEnumDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"literal",
                      		lv_literal_3_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSEnumLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAlloyLanguage.g:328:2: (otherlv_4= ',' ( (lv_literal_5_0= ruleALSEnumLiteral ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAlloyLanguage.g:328:4: otherlv_4= ',' ( (lv_literal_5_0= ruleALSEnumLiteral ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getALSEnumDeclarationAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalAlloyLanguage.g:332:1: ( (lv_literal_5_0= ruleALSEnumLiteral ) )
            	    // InternalAlloyLanguage.g:333:1: (lv_literal_5_0= ruleALSEnumLiteral )
            	    {
            	    // InternalAlloyLanguage.g:333:1: (lv_literal_5_0= ruleALSEnumLiteral )
            	    // InternalAlloyLanguage.g:334:3: lv_literal_5_0= ruleALSEnumLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getALSEnumDeclarationAccess().getLiteralALSEnumLiteralParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_literal_5_0=ruleALSEnumLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getALSEnumDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"literal",
            	              		lv_literal_5_0, 
            	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSEnumLiteral");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getALSEnumDeclarationAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleALSEnumDeclaration"


    // $ANTLR start "entryRuleALSEnumLiteral"
    // InternalAlloyLanguage.g:362:1: entryRuleALSEnumLiteral returns [EObject current=null] : iv_ruleALSEnumLiteral= ruleALSEnumLiteral EOF ;
    public final EObject entryRuleALSEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSEnumLiteral = null;


        try {
            // InternalAlloyLanguage.g:363:2: (iv_ruleALSEnumLiteral= ruleALSEnumLiteral EOF )
            // InternalAlloyLanguage.g:364:2: iv_ruleALSEnumLiteral= ruleALSEnumLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSEnumLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSEnumLiteral=ruleALSEnumLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSEnumLiteral; 
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
    // $ANTLR end "entryRuleALSEnumLiteral"


    // $ANTLR start "ruleALSEnumLiteral"
    // InternalAlloyLanguage.g:371:1: ruleALSEnumLiteral returns [EObject current=null] : ( (lv_name_0_0= ruleALSID ) ) ;
    public final EObject ruleALSEnumLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:374:28: ( ( (lv_name_0_0= ruleALSID ) ) )
            // InternalAlloyLanguage.g:375:1: ( (lv_name_0_0= ruleALSID ) )
            {
            // InternalAlloyLanguage.g:375:1: ( (lv_name_0_0= ruleALSID ) )
            // InternalAlloyLanguage.g:376:1: (lv_name_0_0= ruleALSID )
            {
            // InternalAlloyLanguage.g:376:1: (lv_name_0_0= ruleALSID )
            // InternalAlloyLanguage.g:377:3: lv_name_0_0= ruleALSID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSEnumLiteralAccess().getNameALSIDParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleALSID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSEnumLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSID");
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
    // $ANTLR end "ruleALSEnumLiteral"


    // $ANTLR start "entryRuleALSSignatureDeclaration"
    // InternalAlloyLanguage.g:401:1: entryRuleALSSignatureDeclaration returns [EObject current=null] : iv_ruleALSSignatureDeclaration= ruleALSSignatureDeclaration EOF ;
    public final EObject entryRuleALSSignatureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSSignatureDeclaration = null;


        try {
            // InternalAlloyLanguage.g:402:2: (iv_ruleALSSignatureDeclaration= ruleALSSignatureDeclaration EOF )
            // InternalAlloyLanguage.g:403:2: iv_ruleALSSignatureDeclaration= ruleALSSignatureDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSSignatureDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSSignatureDeclaration=ruleALSSignatureDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSSignatureDeclaration; 
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
    // $ANTLR end "entryRuleALSSignatureDeclaration"


    // $ANTLR start "ruleALSSignatureDeclaration"
    // InternalAlloyLanguage.g:410:1: ruleALSSignatureDeclaration returns [EObject current=null] : ( (lv_name_0_0= ruleALSID ) ) ;
    public final EObject ruleALSSignatureDeclaration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:413:28: ( ( (lv_name_0_0= ruleALSID ) ) )
            // InternalAlloyLanguage.g:414:1: ( (lv_name_0_0= ruleALSID ) )
            {
            // InternalAlloyLanguage.g:414:1: ( (lv_name_0_0= ruleALSID ) )
            // InternalAlloyLanguage.g:415:1: (lv_name_0_0= ruleALSID )
            {
            // InternalAlloyLanguage.g:415:1: (lv_name_0_0= ruleALSID )
            // InternalAlloyLanguage.g:416:3: lv_name_0_0= ruleALSID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSSignatureDeclarationAccess().getNameALSIDParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleALSID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSSignatureDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSID");
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
    // $ANTLR end "ruleALSSignatureDeclaration"


    // $ANTLR start "entryRuleALSSignatureBody"
    // InternalAlloyLanguage.g:440:1: entryRuleALSSignatureBody returns [EObject current=null] : iv_ruleALSSignatureBody= ruleALSSignatureBody EOF ;
    public final EObject entryRuleALSSignatureBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSSignatureBody = null;


        try {
            // InternalAlloyLanguage.g:441:2: (iv_ruleALSSignatureBody= ruleALSSignatureBody EOF )
            // InternalAlloyLanguage.g:442:2: iv_ruleALSSignatureBody= ruleALSSignatureBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSSignatureBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSSignatureBody=ruleALSSignatureBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSSignatureBody; 
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
    // $ANTLR end "entryRuleALSSignatureBody"


    // $ANTLR start "ruleALSSignatureBody"
    // InternalAlloyLanguage.g:449:1: ruleALSSignatureBody returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) ) ) ) )* ) ) ) otherlv_3= 'sig' ( (lv_declarations_4_0= ruleALSSignatureDeclaration ) ) (otherlv_5= ',' ( (lv_declarations_6_0= ruleALSSignatureDeclaration ) ) )* ( (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'in' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '+' ( (otherlv_12= RULE_ID ) ) )* ) )? otherlv_13= '{' ( ( (lv_fields_14_0= ruleALSFieldDeclaration ) ) (otherlv_15= ',' ( (lv_fields_16_0= ruleALSFieldDeclaration ) ) )* )? otherlv_17= '}' ) ;
    public final EObject ruleALSSignatureBody() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Enumerator lv_multiplicity_1_0 = null;

        EObject lv_declarations_4_0 = null;

        EObject lv_declarations_6_0 = null;

        EObject lv_fields_14_0 = null;

        EObject lv_fields_16_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:452:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) ) ) ) )* ) ) ) otherlv_3= 'sig' ( (lv_declarations_4_0= ruleALSSignatureDeclaration ) ) (otherlv_5= ',' ( (lv_declarations_6_0= ruleALSSignatureDeclaration ) ) )* ( (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'in' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '+' ( (otherlv_12= RULE_ID ) ) )* ) )? otherlv_13= '{' ( ( (lv_fields_14_0= ruleALSFieldDeclaration ) ) (otherlv_15= ',' ( (lv_fields_16_0= ruleALSFieldDeclaration ) ) )* )? otherlv_17= '}' ) )
            // InternalAlloyLanguage.g:453:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) ) ) ) )* ) ) ) otherlv_3= 'sig' ( (lv_declarations_4_0= ruleALSSignatureDeclaration ) ) (otherlv_5= ',' ( (lv_declarations_6_0= ruleALSSignatureDeclaration ) ) )* ( (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'in' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '+' ( (otherlv_12= RULE_ID ) ) )* ) )? otherlv_13= '{' ( ( (lv_fields_14_0= ruleALSFieldDeclaration ) ) (otherlv_15= ',' ( (lv_fields_16_0= ruleALSFieldDeclaration ) ) )* )? otherlv_17= '}' )
            {
            // InternalAlloyLanguage.g:453:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) ) ) ) )* ) ) ) otherlv_3= 'sig' ( (lv_declarations_4_0= ruleALSSignatureDeclaration ) ) (otherlv_5= ',' ( (lv_declarations_6_0= ruleALSSignatureDeclaration ) ) )* ( (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'in' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '+' ( (otherlv_12= RULE_ID ) ) )* ) )? otherlv_13= '{' ( ( (lv_fields_14_0= ruleALSFieldDeclaration ) ) (otherlv_15= ',' ( (lv_fields_16_0= ruleALSFieldDeclaration ) ) )* )? otherlv_17= '}' )
            // InternalAlloyLanguage.g:453:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) ) ) ) )* ) ) ) otherlv_3= 'sig' ( (lv_declarations_4_0= ruleALSSignatureDeclaration ) ) (otherlv_5= ',' ( (lv_declarations_6_0= ruleALSSignatureDeclaration ) ) )* ( (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'in' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '+' ( (otherlv_12= RULE_ID ) ) )* ) )? otherlv_13= '{' ( ( (lv_fields_14_0= ruleALSFieldDeclaration ) ) (otherlv_15= ',' ( (lv_fields_16_0= ruleALSFieldDeclaration ) ) )* )? otherlv_17= '}'
            {
            // InternalAlloyLanguage.g:453:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) ) ) ) )* ) ) )
            // InternalAlloyLanguage.g:455:1: ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) ) ) ) )* ) )
            {
            // InternalAlloyLanguage.g:455:1: ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) ) ) ) )* ) )
            // InternalAlloyLanguage.g:456:2: ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0());
            // InternalAlloyLanguage.g:459:2: ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) ) ) ) )* )
            // InternalAlloyLanguage.g:460:3: ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) ) ) ) )*
            {
            // InternalAlloyLanguage.g:460:3: ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) ) ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( LA4_0 >= 66 && LA4_0 <= 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 1) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAlloyLanguage.g:462:4: ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) ) ) )
            	    {
            	    // InternalAlloyLanguage.g:462:4: ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) ) ) )
            	    // InternalAlloyLanguage.g:463:5: {...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleALSSignatureBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalAlloyLanguage.g:463:113: ( ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) ) )
            	    // InternalAlloyLanguage.g:464:6: ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 0);
            	    // InternalAlloyLanguage.g:467:6: ({...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) ) )
            	    // InternalAlloyLanguage.g:467:7: {...}? => ( (lv_multiplicity_1_0= ruleALSMultiplicity ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleALSSignatureBody", "true");
            	    }
            	    // InternalAlloyLanguage.g:467:16: ( (lv_multiplicity_1_0= ruleALSMultiplicity ) )
            	    // InternalAlloyLanguage.g:468:1: (lv_multiplicity_1_0= ruleALSMultiplicity )
            	    {
            	    // InternalAlloyLanguage.g:468:1: (lv_multiplicity_1_0= ruleALSMultiplicity )
            	    // InternalAlloyLanguage.g:469:3: lv_multiplicity_1_0= ruleALSMultiplicity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getALSSignatureBodyAccess().getMultiplicityALSMultiplicityEnumRuleCall_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_multiplicity_1_0=ruleALSMultiplicity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getALSSignatureBodyRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"multiplicity",
            	              		lv_multiplicity_1_0, 
            	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSMultiplicity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlloyLanguage.g:492:4: ({...}? => ( ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) ) ) )
            	    {
            	    // InternalAlloyLanguage.g:492:4: ({...}? => ( ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) ) ) )
            	    // InternalAlloyLanguage.g:493:5: {...}? => ( ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleALSSignatureBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalAlloyLanguage.g:493:113: ( ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) ) )
            	    // InternalAlloyLanguage.g:494:6: ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), 1);
            	    // InternalAlloyLanguage.g:497:6: ({...}? => ( (lv_abstract_2_0= 'abstract' ) ) )
            	    // InternalAlloyLanguage.g:497:7: {...}? => ( (lv_abstract_2_0= 'abstract' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleALSSignatureBody", "true");
            	    }
            	    // InternalAlloyLanguage.g:497:16: ( (lv_abstract_2_0= 'abstract' ) )
            	    // InternalAlloyLanguage.g:498:1: (lv_abstract_2_0= 'abstract' )
            	    {
            	    // InternalAlloyLanguage.g:498:1: (lv_abstract_2_0= 'abstract' )
            	    // InternalAlloyLanguage.g:499:3: lv_abstract_2_0= 'abstract'
            	    {
            	    lv_abstract_2_0=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_abstract_2_0, grammarAccess.getALSSignatureBodyAccess().getAbstractAbstractKeyword_0_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getALSSignatureBodyRule());
            	      	        }
            	             		setWithLastConsumed(current, "abstract", true, "abstract");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0());

            }

            otherlv_3=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getALSSignatureBodyAccess().getSigKeyword_1());
                  
            }
            // InternalAlloyLanguage.g:530:1: ( (lv_declarations_4_0= ruleALSSignatureDeclaration ) )
            // InternalAlloyLanguage.g:531:1: (lv_declarations_4_0= ruleALSSignatureDeclaration )
            {
            // InternalAlloyLanguage.g:531:1: (lv_declarations_4_0= ruleALSSignatureDeclaration )
            // InternalAlloyLanguage.g:532:3: lv_declarations_4_0= ruleALSSignatureDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSSignatureBodyAccess().getDeclarationsALSSignatureDeclarationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_8);
            lv_declarations_4_0=ruleALSSignatureDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSSignatureBodyRule());
              	        }
                     		add(
                     			current, 
                     			"declarations",
                      		lv_declarations_4_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSSignatureDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAlloyLanguage.g:548:2: (otherlv_5= ',' ( (lv_declarations_6_0= ruleALSSignatureDeclaration ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAlloyLanguage.g:548:4: otherlv_5= ',' ( (lv_declarations_6_0= ruleALSSignatureDeclaration ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getALSSignatureBodyAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalAlloyLanguage.g:552:1: ( (lv_declarations_6_0= ruleALSSignatureDeclaration ) )
            	    // InternalAlloyLanguage.g:553:1: (lv_declarations_6_0= ruleALSSignatureDeclaration )
            	    {
            	    // InternalAlloyLanguage.g:553:1: (lv_declarations_6_0= ruleALSSignatureDeclaration )
            	    // InternalAlloyLanguage.g:554:3: lv_declarations_6_0= ruleALSSignatureDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getALSSignatureBodyAccess().getDeclarationsALSSignatureDeclarationParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_declarations_6_0=ruleALSSignatureDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getALSSignatureBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_6_0, 
            	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSSignatureDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalAlloyLanguage.g:570:4: ( (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) ) | (otherlv_9= 'in' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '+' ( (otherlv_12= RULE_ID ) ) )* ) )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlloyLanguage.g:570:5: (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) )
                    {
                    // InternalAlloyLanguage.g:570:5: (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) )
                    // InternalAlloyLanguage.g:570:7: otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getALSSignatureBodyAccess().getExtendsKeyword_4_0_0());
                          
                    }
                    // InternalAlloyLanguage.g:574:1: ( (otherlv_8= RULE_ID ) )
                    // InternalAlloyLanguage.g:575:1: (otherlv_8= RULE_ID )
                    {
                    // InternalAlloyLanguage.g:575:1: (otherlv_8= RULE_ID )
                    // InternalAlloyLanguage.g:576:3: otherlv_8= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getALSSignatureBodyRule());
                      	        }
                              
                    }
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_8, grammarAccess.getALSSignatureBodyAccess().getSupertypeALSSignatureDeclarationCrossReference_4_0_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:588:6: (otherlv_9= 'in' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '+' ( (otherlv_12= RULE_ID ) ) )* )
                    {
                    // InternalAlloyLanguage.g:588:6: (otherlv_9= 'in' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '+' ( (otherlv_12= RULE_ID ) ) )* )
                    // InternalAlloyLanguage.g:588:8: otherlv_9= 'in' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '+' ( (otherlv_12= RULE_ID ) ) )*
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getALSSignatureBodyAccess().getInKeyword_4_1_0());
                          
                    }
                    // InternalAlloyLanguage.g:592:1: ( (otherlv_10= RULE_ID ) )
                    // InternalAlloyLanguage.g:593:1: (otherlv_10= RULE_ID )
                    {
                    // InternalAlloyLanguage.g:593:1: (otherlv_10= RULE_ID )
                    // InternalAlloyLanguage.g:594:3: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getALSSignatureBodyRule());
                      	        }
                              
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_10, grammarAccess.getALSSignatureBodyAccess().getSupersetALSSignatureDeclarationCrossReference_4_1_1_0()); 
                      	
                    }

                    }


                    }

                    // InternalAlloyLanguage.g:605:2: (otherlv_11= '+' ( (otherlv_12= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAlloyLanguage.g:605:4: otherlv_11= '+' ( (otherlv_12= RULE_ID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getALSSignatureBodyAccess().getPlusSignKeyword_4_1_2_0());
                    	          
                    	    }
                    	    // InternalAlloyLanguage.g:609:1: ( (otherlv_12= RULE_ID ) )
                    	    // InternalAlloyLanguage.g:610:1: (otherlv_12= RULE_ID )
                    	    {
                    	    // InternalAlloyLanguage.g:610:1: (otherlv_12= RULE_ID )
                    	    // InternalAlloyLanguage.g:611:3: otherlv_12= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getALSSignatureBodyRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_12, grammarAccess.getALSSignatureBodyAccess().getSupersetALSSignatureDeclarationCrossReference_4_1_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,12,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getALSSignatureBodyAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // InternalAlloyLanguage.g:626:1: ( ( (lv_fields_14_0= ruleALSFieldDeclaration ) ) (otherlv_15= ',' ( (lv_fields_16_0= ruleALSFieldDeclaration ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAlloyLanguage.g:626:2: ( (lv_fields_14_0= ruleALSFieldDeclaration ) ) (otherlv_15= ',' ( (lv_fields_16_0= ruleALSFieldDeclaration ) ) )*
                    {
                    // InternalAlloyLanguage.g:626:2: ( (lv_fields_14_0= ruleALSFieldDeclaration ) )
                    // InternalAlloyLanguage.g:627:1: (lv_fields_14_0= ruleALSFieldDeclaration )
                    {
                    // InternalAlloyLanguage.g:627:1: (lv_fields_14_0= ruleALSFieldDeclaration )
                    // InternalAlloyLanguage.g:628:3: lv_fields_14_0= ruleALSFieldDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSSignatureBodyAccess().getFieldsALSFieldDeclarationParserRuleCall_6_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_6);
                    lv_fields_14_0=ruleALSFieldDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSSignatureBodyRule());
                      	        }
                             		add(
                             			current, 
                             			"fields",
                              		lv_fields_14_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSFieldDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAlloyLanguage.g:644:2: (otherlv_15= ',' ( (lv_fields_16_0= ruleALSFieldDeclaration ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==13) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalAlloyLanguage.g:644:4: otherlv_15= ',' ( (lv_fields_16_0= ruleALSFieldDeclaration ) )
                    	    {
                    	    otherlv_15=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_15, grammarAccess.getALSSignatureBodyAccess().getCommaKeyword_6_1_0());
                    	          
                    	    }
                    	    // InternalAlloyLanguage.g:648:1: ( (lv_fields_16_0= ruleALSFieldDeclaration ) )
                    	    // InternalAlloyLanguage.g:649:1: (lv_fields_16_0= ruleALSFieldDeclaration )
                    	    {
                    	    // InternalAlloyLanguage.g:649:1: (lv_fields_16_0= ruleALSFieldDeclaration )
                    	    // InternalAlloyLanguage.g:650:3: lv_fields_16_0= ruleALSFieldDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getALSSignatureBodyAccess().getFieldsALSFieldDeclarationParserRuleCall_6_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_fields_16_0=ruleALSFieldDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getALSSignatureBodyRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"fields",
                    	              		lv_fields_16_0, 
                    	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSFieldDeclaration");
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


                    }
                    break;

            }

            otherlv_17=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getALSSignatureBodyAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleALSSignatureBody"


    // $ANTLR start "entryRuleALSFieldDeclaration"
    // InternalAlloyLanguage.g:678:1: entryRuleALSFieldDeclaration returns [EObject current=null] : iv_ruleALSFieldDeclaration= ruleALSFieldDeclaration EOF ;
    public final EObject entryRuleALSFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSFieldDeclaration = null;


        try {
            // InternalAlloyLanguage.g:679:2: (iv_ruleALSFieldDeclaration= ruleALSFieldDeclaration EOF )
            // InternalAlloyLanguage.g:680:2: iv_ruleALSFieldDeclaration= ruleALSFieldDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSFieldDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSFieldDeclaration=ruleALSFieldDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSFieldDeclaration; 
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
    // $ANTLR end "entryRuleALSFieldDeclaration"


    // $ANTLR start "ruleALSFieldDeclaration"
    // InternalAlloyLanguage.g:687:1: ruleALSFieldDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= ruleALSID ) ) otherlv_1= ':' ( (lv_multiplicity_2_0= ruleALSMultiplicity ) )? ( (lv_type_3_0= ruleALSTerm ) ) ) ;
    public final EObject ruleALSFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_multiplicity_2_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:690:28: ( ( ( (lv_name_0_0= ruleALSID ) ) otherlv_1= ':' ( (lv_multiplicity_2_0= ruleALSMultiplicity ) )? ( (lv_type_3_0= ruleALSTerm ) ) ) )
            // InternalAlloyLanguage.g:691:1: ( ( (lv_name_0_0= ruleALSID ) ) otherlv_1= ':' ( (lv_multiplicity_2_0= ruleALSMultiplicity ) )? ( (lv_type_3_0= ruleALSTerm ) ) )
            {
            // InternalAlloyLanguage.g:691:1: ( ( (lv_name_0_0= ruleALSID ) ) otherlv_1= ':' ( (lv_multiplicity_2_0= ruleALSMultiplicity ) )? ( (lv_type_3_0= ruleALSTerm ) ) )
            // InternalAlloyLanguage.g:691:2: ( (lv_name_0_0= ruleALSID ) ) otherlv_1= ':' ( (lv_multiplicity_2_0= ruleALSMultiplicity ) )? ( (lv_type_3_0= ruleALSTerm ) )
            {
            // InternalAlloyLanguage.g:691:2: ( (lv_name_0_0= ruleALSID ) )
            // InternalAlloyLanguage.g:692:1: (lv_name_0_0= ruleALSID )
            {
            // InternalAlloyLanguage.g:692:1: (lv_name_0_0= ruleALSID )
            // InternalAlloyLanguage.g:693:3: lv_name_0_0= ruleALSID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSFieldDeclarationAccess().getNameALSIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_11);
            lv_name_0_0=ruleALSID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSFieldDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getALSFieldDeclarationAccess().getColonKeyword_1());
                  
            }
            // InternalAlloyLanguage.g:713:1: ( (lv_multiplicity_2_0= ruleALSMultiplicity ) )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalAlloyLanguage.g:714:1: (lv_multiplicity_2_0= ruleALSMultiplicity )
                    {
                    // InternalAlloyLanguage.g:714:1: (lv_multiplicity_2_0= ruleALSMultiplicity )
                    // InternalAlloyLanguage.g:715:3: lv_multiplicity_2_0= ruleALSMultiplicity
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSFieldDeclarationAccess().getMultiplicityALSMultiplicityEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_12);
                    lv_multiplicity_2_0=ruleALSMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSFieldDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"multiplicity",
                              		lv_multiplicity_2_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSMultiplicity");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalAlloyLanguage.g:731:3: ( (lv_type_3_0= ruleALSTerm ) )
            // InternalAlloyLanguage.g:732:1: (lv_type_3_0= ruleALSTerm )
            {
            // InternalAlloyLanguage.g:732:1: (lv_type_3_0= ruleALSTerm )
            // InternalAlloyLanguage.g:733:3: lv_type_3_0= ruleALSTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSFieldDeclarationAccess().getTypeALSTermParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleALSTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSFieldDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSTerm");
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
    // $ANTLR end "ruleALSFieldDeclaration"


    // $ANTLR start "entryRuleALSFunctionDefinition"
    // InternalAlloyLanguage.g:759:1: entryRuleALSFunctionDefinition returns [EObject current=null] : iv_ruleALSFunctionDefinition= ruleALSFunctionDefinition EOF ;
    public final EObject entryRuleALSFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSFunctionDefinition = null;


        try {
            // InternalAlloyLanguage.g:760:2: (iv_ruleALSFunctionDefinition= ruleALSFunctionDefinition EOF )
            // InternalAlloyLanguage.g:761:2: iv_ruleALSFunctionDefinition= ruleALSFunctionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSFunctionDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSFunctionDefinition=ruleALSFunctionDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSFunctionDefinition; 
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
    // $ANTLR end "entryRuleALSFunctionDefinition"


    // $ANTLR start "ruleALSFunctionDefinition"
    // InternalAlloyLanguage.g:768:1: ruleALSFunctionDefinition returns [EObject current=null] : (otherlv_0= 'fun' ( (lv_name_1_0= ruleALSID ) ) otherlv_2= '[' ( (lv_variables_3_0= ruleALSVariableDeclaration ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )* otherlv_6= ']' otherlv_7= ':' ( (lv_type_8_0= ruleALSTerm ) ) otherlv_9= '{' ( (lv_value_10_0= ruleALSTerm ) ) otherlv_11= '}' ) ;
    public final EObject ruleALSFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_variables_3_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_type_8_0 = null;

        EObject lv_value_10_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:771:28: ( (otherlv_0= 'fun' ( (lv_name_1_0= ruleALSID ) ) otherlv_2= '[' ( (lv_variables_3_0= ruleALSVariableDeclaration ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )* otherlv_6= ']' otherlv_7= ':' ( (lv_type_8_0= ruleALSTerm ) ) otherlv_9= '{' ( (lv_value_10_0= ruleALSTerm ) ) otherlv_11= '}' ) )
            // InternalAlloyLanguage.g:772:1: (otherlv_0= 'fun' ( (lv_name_1_0= ruleALSID ) ) otherlv_2= '[' ( (lv_variables_3_0= ruleALSVariableDeclaration ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )* otherlv_6= ']' otherlv_7= ':' ( (lv_type_8_0= ruleALSTerm ) ) otherlv_9= '{' ( (lv_value_10_0= ruleALSTerm ) ) otherlv_11= '}' )
            {
            // InternalAlloyLanguage.g:772:1: (otherlv_0= 'fun' ( (lv_name_1_0= ruleALSID ) ) otherlv_2= '[' ( (lv_variables_3_0= ruleALSVariableDeclaration ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )* otherlv_6= ']' otherlv_7= ':' ( (lv_type_8_0= ruleALSTerm ) ) otherlv_9= '{' ( (lv_value_10_0= ruleALSTerm ) ) otherlv_11= '}' )
            // InternalAlloyLanguage.g:772:3: otherlv_0= 'fun' ( (lv_name_1_0= ruleALSID ) ) otherlv_2= '[' ( (lv_variables_3_0= ruleALSVariableDeclaration ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )* otherlv_6= ']' otherlv_7= ':' ( (lv_type_8_0= ruleALSTerm ) ) otherlv_9= '{' ( (lv_value_10_0= ruleALSTerm ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getALSFunctionDefinitionAccess().getFunKeyword_0());
                  
            }
            // InternalAlloyLanguage.g:776:1: ( (lv_name_1_0= ruleALSID ) )
            // InternalAlloyLanguage.g:777:1: (lv_name_1_0= ruleALSID )
            {
            // InternalAlloyLanguage.g:777:1: (lv_name_1_0= ruleALSID )
            // InternalAlloyLanguage.g:778:3: lv_name_1_0= ruleALSID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSFunctionDefinitionAccess().getNameALSIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
            lv_name_1_0=ruleALSID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSFunctionDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getALSFunctionDefinitionAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalAlloyLanguage.g:798:1: ( (lv_variables_3_0= ruleALSVariableDeclaration ) )
            // InternalAlloyLanguage.g:799:1: (lv_variables_3_0= ruleALSVariableDeclaration )
            {
            // InternalAlloyLanguage.g:799:1: (lv_variables_3_0= ruleALSVariableDeclaration )
            // InternalAlloyLanguage.g:800:3: lv_variables_3_0= ruleALSVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSFunctionDefinitionAccess().getVariablesALSVariableDeclarationParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
            lv_variables_3_0=ruleALSVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSFunctionDefinitionRule());
              	        }
                     		add(
                     			current, 
                     			"variables",
                      		lv_variables_3_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSVariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAlloyLanguage.g:816:2: (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAlloyLanguage.g:816:4: otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getALSFunctionDefinitionAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalAlloyLanguage.g:820:1: ( (lv_variables_5_0= ruleALSVariableDeclaration ) )
            	    // InternalAlloyLanguage.g:821:1: (lv_variables_5_0= ruleALSVariableDeclaration )
            	    {
            	    // InternalAlloyLanguage.g:821:1: (lv_variables_5_0= ruleALSVariableDeclaration )
            	    // InternalAlloyLanguage.g:822:3: lv_variables_5_0= ruleALSVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getALSFunctionDefinitionAccess().getVariablesALSVariableDeclarationParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_variables_5_0=ruleALSVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getALSFunctionDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variables",
            	              		lv_variables_5_0, 
            	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSVariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getALSFunctionDefinitionAccess().getRightSquareBracketKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getALSFunctionDefinitionAccess().getColonKeyword_6());
                  
            }
            // InternalAlloyLanguage.g:846:1: ( (lv_type_8_0= ruleALSTerm ) )
            // InternalAlloyLanguage.g:847:1: (lv_type_8_0= ruleALSTerm )
            {
            // InternalAlloyLanguage.g:847:1: (lv_type_8_0= ruleALSTerm )
            // InternalAlloyLanguage.g:848:3: lv_type_8_0= ruleALSTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSFunctionDefinitionAccess().getTypeALSTermParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_5);
            lv_type_8_0=ruleALSTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSFunctionDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_8_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,12,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getALSFunctionDefinitionAccess().getLeftCurlyBracketKeyword_8());
                  
            }
            // InternalAlloyLanguage.g:868:1: ( (lv_value_10_0= ruleALSTerm ) )
            // InternalAlloyLanguage.g:869:1: (lv_value_10_0= ruleALSTerm )
            {
            // InternalAlloyLanguage.g:869:1: (lv_value_10_0= ruleALSTerm )
            // InternalAlloyLanguage.g:870:3: lv_value_10_0= ruleALSTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSFunctionDefinitionAccess().getValueALSTermParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_15);
            lv_value_10_0=ruleALSTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSFunctionDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_10_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getALSFunctionDefinitionAccess().getRightCurlyBracketKeyword_10());
                  
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
    // $ANTLR end "ruleALSFunctionDefinition"


    // $ANTLR start "entryRuleALSRelationDefinition"
    // InternalAlloyLanguage.g:898:1: entryRuleALSRelationDefinition returns [EObject current=null] : iv_ruleALSRelationDefinition= ruleALSRelationDefinition EOF ;
    public final EObject entryRuleALSRelationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSRelationDefinition = null;


        try {
            // InternalAlloyLanguage.g:899:2: (iv_ruleALSRelationDefinition= ruleALSRelationDefinition EOF )
            // InternalAlloyLanguage.g:900:2: iv_ruleALSRelationDefinition= ruleALSRelationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSRelationDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSRelationDefinition=ruleALSRelationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSRelationDefinition; 
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
    // $ANTLR end "entryRuleALSRelationDefinition"


    // $ANTLR start "ruleALSRelationDefinition"
    // InternalAlloyLanguage.g:907:1: ruleALSRelationDefinition returns [EObject current=null] : (otherlv_0= 'pred' ( (lv_name_1_0= ruleALSID ) ) otherlv_2= '[' ( (lv_variables_3_0= ruleALSVariableDeclaration ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )* otherlv_6= ']' otherlv_7= '{' ( (lv_value_8_0= ruleALSTerm ) ) otherlv_9= '}' ) ;
    public final EObject ruleALSRelationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_variables_3_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_value_8_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:910:28: ( (otherlv_0= 'pred' ( (lv_name_1_0= ruleALSID ) ) otherlv_2= '[' ( (lv_variables_3_0= ruleALSVariableDeclaration ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )* otherlv_6= ']' otherlv_7= '{' ( (lv_value_8_0= ruleALSTerm ) ) otherlv_9= '}' ) )
            // InternalAlloyLanguage.g:911:1: (otherlv_0= 'pred' ( (lv_name_1_0= ruleALSID ) ) otherlv_2= '[' ( (lv_variables_3_0= ruleALSVariableDeclaration ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )* otherlv_6= ']' otherlv_7= '{' ( (lv_value_8_0= ruleALSTerm ) ) otherlv_9= '}' )
            {
            // InternalAlloyLanguage.g:911:1: (otherlv_0= 'pred' ( (lv_name_1_0= ruleALSID ) ) otherlv_2= '[' ( (lv_variables_3_0= ruleALSVariableDeclaration ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )* otherlv_6= ']' otherlv_7= '{' ( (lv_value_8_0= ruleALSTerm ) ) otherlv_9= '}' )
            // InternalAlloyLanguage.g:911:3: otherlv_0= 'pred' ( (lv_name_1_0= ruleALSID ) ) otherlv_2= '[' ( (lv_variables_3_0= ruleALSVariableDeclaration ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )* otherlv_6= ']' otherlv_7= '{' ( (lv_value_8_0= ruleALSTerm ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getALSRelationDefinitionAccess().getPredKeyword_0());
                  
            }
            // InternalAlloyLanguage.g:915:1: ( (lv_name_1_0= ruleALSID ) )
            // InternalAlloyLanguage.g:916:1: (lv_name_1_0= ruleALSID )
            {
            // InternalAlloyLanguage.g:916:1: (lv_name_1_0= ruleALSID )
            // InternalAlloyLanguage.g:917:3: lv_name_1_0= ruleALSID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSRelationDefinitionAccess().getNameALSIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
            lv_name_1_0=ruleALSID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSRelationDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getALSRelationDefinitionAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalAlloyLanguage.g:937:1: ( (lv_variables_3_0= ruleALSVariableDeclaration ) )
            // InternalAlloyLanguage.g:938:1: (lv_variables_3_0= ruleALSVariableDeclaration )
            {
            // InternalAlloyLanguage.g:938:1: (lv_variables_3_0= ruleALSVariableDeclaration )
            // InternalAlloyLanguage.g:939:3: lv_variables_3_0= ruleALSVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSRelationDefinitionAccess().getVariablesALSVariableDeclarationParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
            lv_variables_3_0=ruleALSVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSRelationDefinitionRule());
              	        }
                     		add(
                     			current, 
                     			"variables",
                      		lv_variables_3_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSVariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAlloyLanguage.g:955:2: (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAlloyLanguage.g:955:4: otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getALSRelationDefinitionAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalAlloyLanguage.g:959:1: ( (lv_variables_5_0= ruleALSVariableDeclaration ) )
            	    // InternalAlloyLanguage.g:960:1: (lv_variables_5_0= ruleALSVariableDeclaration )
            	    {
            	    // InternalAlloyLanguage.g:960:1: (lv_variables_5_0= ruleALSVariableDeclaration )
            	    // InternalAlloyLanguage.g:961:3: lv_variables_5_0= ruleALSVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getALSRelationDefinitionAccess().getVariablesALSVariableDeclarationParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_variables_5_0=ruleALSVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getALSRelationDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variables",
            	              		lv_variables_5_0, 
            	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSVariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getALSRelationDefinitionAccess().getRightSquareBracketKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,12,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getALSRelationDefinitionAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // InternalAlloyLanguage.g:985:1: ( (lv_value_8_0= ruleALSTerm ) )
            // InternalAlloyLanguage.g:986:1: (lv_value_8_0= ruleALSTerm )
            {
            // InternalAlloyLanguage.g:986:1: (lv_value_8_0= ruleALSTerm )
            // InternalAlloyLanguage.g:987:3: lv_value_8_0= ruleALSTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSRelationDefinitionAccess().getValueALSTermParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_15);
            lv_value_8_0=ruleALSTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSRelationDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_8_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getALSRelationDefinitionAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "ruleALSRelationDefinition"


    // $ANTLR start "entryRuleALSFactDeclaration"
    // InternalAlloyLanguage.g:1015:1: entryRuleALSFactDeclaration returns [EObject current=null] : iv_ruleALSFactDeclaration= ruleALSFactDeclaration EOF ;
    public final EObject entryRuleALSFactDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSFactDeclaration = null;


        try {
            // InternalAlloyLanguage.g:1016:2: (iv_ruleALSFactDeclaration= ruleALSFactDeclaration EOF )
            // InternalAlloyLanguage.g:1017:2: iv_ruleALSFactDeclaration= ruleALSFactDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSFactDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSFactDeclaration=ruleALSFactDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSFactDeclaration; 
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
    // $ANTLR end "entryRuleALSFactDeclaration"


    // $ANTLR start "ruleALSFactDeclaration"
    // InternalAlloyLanguage.g:1024:1: ruleALSFactDeclaration returns [EObject current=null] : ( () otherlv_1= 'fact' ( (lv_name_2_0= ruleALSID ) )? otherlv_3= '{' ( (lv_term_4_0= ruleALSTerm ) ) otherlv_5= '}' ) ;
    public final EObject ruleALSFactDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_term_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:1027:28: ( ( () otherlv_1= 'fact' ( (lv_name_2_0= ruleALSID ) )? otherlv_3= '{' ( (lv_term_4_0= ruleALSTerm ) ) otherlv_5= '}' ) )
            // InternalAlloyLanguage.g:1028:1: ( () otherlv_1= 'fact' ( (lv_name_2_0= ruleALSID ) )? otherlv_3= '{' ( (lv_term_4_0= ruleALSTerm ) ) otherlv_5= '}' )
            {
            // InternalAlloyLanguage.g:1028:1: ( () otherlv_1= 'fact' ( (lv_name_2_0= ruleALSID ) )? otherlv_3= '{' ( (lv_term_4_0= ruleALSTerm ) ) otherlv_5= '}' )
            // InternalAlloyLanguage.g:1028:2: () otherlv_1= 'fact' ( (lv_name_2_0= ruleALSID ) )? otherlv_3= '{' ( (lv_term_4_0= ruleALSTerm ) ) otherlv_5= '}'
            {
            // InternalAlloyLanguage.g:1028:2: ()
            // InternalAlloyLanguage.g:1029:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getALSFactDeclarationAccess().getALSFactDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getALSFactDeclarationAccess().getFactKeyword_1());
                  
            }
            // InternalAlloyLanguage.g:1038:1: ( (lv_name_2_0= ruleALSID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlloyLanguage.g:1039:1: (lv_name_2_0= ruleALSID )
                    {
                    // InternalAlloyLanguage.g:1039:1: (lv_name_2_0= ruleALSID )
                    // InternalAlloyLanguage.g:1040:3: lv_name_2_0= ruleALSID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSFactDeclarationAccess().getNameALSIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_5);
                    lv_name_2_0=ruleALSID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSFactDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getALSFactDeclarationAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalAlloyLanguage.g:1060:1: ( (lv_term_4_0= ruleALSTerm ) )
            // InternalAlloyLanguage.g:1061:1: (lv_term_4_0= ruleALSTerm )
            {
            // InternalAlloyLanguage.g:1061:1: (lv_term_4_0= ruleALSTerm )
            // InternalAlloyLanguage.g:1062:3: lv_term_4_0= ruleALSTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSFactDeclarationAccess().getTermALSTermParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_15);
            lv_term_4_0=ruleALSTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSFactDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"term",
                      		lv_term_4_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getALSFactDeclarationAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleALSFactDeclaration"


    // $ANTLR start "entryRuleALSTerm"
    // InternalAlloyLanguage.g:1090:1: entryRuleALSTerm returns [EObject current=null] : iv_ruleALSTerm= ruleALSTerm EOF ;
    public final EObject entryRuleALSTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSTerm = null;


        try {
            // InternalAlloyLanguage.g:1091:2: (iv_ruleALSTerm= ruleALSTerm EOF )
            // InternalAlloyLanguage.g:1092:2: iv_ruleALSTerm= ruleALSTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSTerm=ruleALSTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSTerm; 
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
    // $ANTLR end "entryRuleALSTerm"


    // $ANTLR start "ruleALSTerm"
    // InternalAlloyLanguage.g:1099:1: ruleALSTerm returns [EObject current=null] : this_ALSQuantified_0= ruleALSQuantified ;
    public final EObject ruleALSTerm() throws RecognitionException {
        EObject current = null;

        EObject this_ALSQuantified_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:1102:28: (this_ALSQuantified_0= ruleALSQuantified )
            // InternalAlloyLanguage.g:1104:5: this_ALSQuantified_0= ruleALSQuantified
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getALSTermAccess().getALSQuantifiedParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
            this_ALSQuantified_0=ruleALSQuantified();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ALSQuantified_0; 
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
    // $ANTLR end "ruleALSTerm"


    // $ANTLR start "entryRuleALSQuantified"
    // InternalAlloyLanguage.g:1120:1: entryRuleALSQuantified returns [EObject current=null] : iv_ruleALSQuantified= ruleALSQuantified EOF ;
    public final EObject entryRuleALSQuantified() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSQuantified = null;


        try {
            // InternalAlloyLanguage.g:1121:2: (iv_ruleALSQuantified= ruleALSQuantified EOF )
            // InternalAlloyLanguage.g:1122:2: iv_ruleALSQuantified= ruleALSQuantified EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSQuantifiedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSQuantified=ruleALSQuantified();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSQuantified; 
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
    // $ANTLR end "entryRuleALSQuantified"


    // $ANTLR start "ruleALSQuantified"
    // InternalAlloyLanguage.g:1129:1: ruleALSQuantified returns [EObject current=null] : ( ( () ( (lv_type_1_0= ruleALSMultiplicity ) ) ( (lv_disj_2_0= 'disj' ) )? ( (lv_variables_3_0= ruleALSVariableDeclaration ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )* otherlv_6= '{' ( (lv_expression_7_0= ruleALSTerm ) ) otherlv_8= '}' ) | this_ALSOr_9= ruleALSOr ) ;
    public final EObject ruleALSQuantified() throws RecognitionException {
        EObject current = null;

        Token lv_disj_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_variables_3_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_expression_7_0 = null;

        EObject this_ALSOr_9 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:1132:28: ( ( ( () ( (lv_type_1_0= ruleALSMultiplicity ) ) ( (lv_disj_2_0= 'disj' ) )? ( (lv_variables_3_0= ruleALSVariableDeclaration ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )* otherlv_6= '{' ( (lv_expression_7_0= ruleALSTerm ) ) otherlv_8= '}' ) | this_ALSOr_9= ruleALSOr ) )
            // InternalAlloyLanguage.g:1133:1: ( ( () ( (lv_type_1_0= ruleALSMultiplicity ) ) ( (lv_disj_2_0= 'disj' ) )? ( (lv_variables_3_0= ruleALSVariableDeclaration ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )* otherlv_6= '{' ( (lv_expression_7_0= ruleALSTerm ) ) otherlv_8= '}' ) | this_ALSOr_9= ruleALSOr )
            {
            // InternalAlloyLanguage.g:1133:1: ( ( () ( (lv_type_1_0= ruleALSMultiplicity ) ) ( (lv_disj_2_0= 'disj' ) )? ( (lv_variables_3_0= ruleALSVariableDeclaration ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )* otherlv_6= '{' ( (lv_expression_7_0= ruleALSTerm ) ) otherlv_8= '}' ) | this_ALSOr_9= ruleALSOr )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=66 && LA16_0<=71)) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==46||(LA16_0>=49 && LA16_0<=61)||(LA16_0>=72 && LA16_0<=76)) ) {
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
                    // InternalAlloyLanguage.g:1133:2: ( () ( (lv_type_1_0= ruleALSMultiplicity ) ) ( (lv_disj_2_0= 'disj' ) )? ( (lv_variables_3_0= ruleALSVariableDeclaration ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )* otherlv_6= '{' ( (lv_expression_7_0= ruleALSTerm ) ) otherlv_8= '}' )
                    {
                    // InternalAlloyLanguage.g:1133:2: ( () ( (lv_type_1_0= ruleALSMultiplicity ) ) ( (lv_disj_2_0= 'disj' ) )? ( (lv_variables_3_0= ruleALSVariableDeclaration ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )* otherlv_6= '{' ( (lv_expression_7_0= ruleALSTerm ) ) otherlv_8= '}' )
                    // InternalAlloyLanguage.g:1133:3: () ( (lv_type_1_0= ruleALSMultiplicity ) ) ( (lv_disj_2_0= 'disj' ) )? ( (lv_variables_3_0= ruleALSVariableDeclaration ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )* otherlv_6= '{' ( (lv_expression_7_0= ruleALSTerm ) ) otherlv_8= '}'
                    {
                    // InternalAlloyLanguage.g:1133:3: ()
                    // InternalAlloyLanguage.g:1134:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getALSQuantifiedAccess().getALSQuantifiedExAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalAlloyLanguage.g:1139:2: ( (lv_type_1_0= ruleALSMultiplicity ) )
                    // InternalAlloyLanguage.g:1140:1: (lv_type_1_0= ruleALSMultiplicity )
                    {
                    // InternalAlloyLanguage.g:1140:1: (lv_type_1_0= ruleALSMultiplicity )
                    // InternalAlloyLanguage.g:1141:3: lv_type_1_0= ruleALSMultiplicity
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSQuantifiedAccess().getTypeALSMultiplicityEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_17);
                    lv_type_1_0=ruleALSMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSQuantifiedRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_1_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSMultiplicity");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAlloyLanguage.g:1157:2: ( (lv_disj_2_0= 'disj' ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==26) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalAlloyLanguage.g:1158:1: (lv_disj_2_0= 'disj' )
                            {
                            // InternalAlloyLanguage.g:1158:1: (lv_disj_2_0= 'disj' )
                            // InternalAlloyLanguage.g:1159:3: lv_disj_2_0= 'disj'
                            {
                            lv_disj_2_0=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_disj_2_0, grammarAccess.getALSQuantifiedAccess().getDisjDisjKeyword_0_2_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getALSQuantifiedRule());
                              	        }
                                     		setWithLastConsumed(current, "disj", true, "disj");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalAlloyLanguage.g:1172:3: ( (lv_variables_3_0= ruleALSVariableDeclaration ) )
                    // InternalAlloyLanguage.g:1173:1: (lv_variables_3_0= ruleALSVariableDeclaration )
                    {
                    // InternalAlloyLanguage.g:1173:1: (lv_variables_3_0= ruleALSVariableDeclaration )
                    // InternalAlloyLanguage.g:1174:3: lv_variables_3_0= ruleALSVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSQuantifiedAccess().getVariablesALSVariableDeclarationParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_18);
                    lv_variables_3_0=ruleALSVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSQuantifiedRule());
                      	        }
                             		add(
                             			current, 
                             			"variables",
                              		lv_variables_3_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSVariableDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAlloyLanguage.g:1190:2: (otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==13) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalAlloyLanguage.g:1190:4: otherlv_4= ',' ( (lv_variables_5_0= ruleALSVariableDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getALSQuantifiedAccess().getCommaKeyword_0_4_0());
                    	          
                    	    }
                    	    // InternalAlloyLanguage.g:1194:1: ( (lv_variables_5_0= ruleALSVariableDeclaration ) )
                    	    // InternalAlloyLanguage.g:1195:1: (lv_variables_5_0= ruleALSVariableDeclaration )
                    	    {
                    	    // InternalAlloyLanguage.g:1195:1: (lv_variables_5_0= ruleALSVariableDeclaration )
                    	    // InternalAlloyLanguage.g:1196:3: lv_variables_5_0= ruleALSVariableDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getALSQuantifiedAccess().getVariablesALSVariableDeclarationParserRuleCall_0_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_variables_5_0=ruleALSVariableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getALSQuantifiedRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"variables",
                    	              		lv_variables_5_0, 
                    	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSVariableDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,12,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getALSQuantifiedAccess().getLeftCurlyBracketKeyword_0_5());
                          
                    }
                    // InternalAlloyLanguage.g:1216:1: ( (lv_expression_7_0= ruleALSTerm ) )
                    // InternalAlloyLanguage.g:1217:1: (lv_expression_7_0= ruleALSTerm )
                    {
                    // InternalAlloyLanguage.g:1217:1: (lv_expression_7_0= ruleALSTerm )
                    // InternalAlloyLanguage.g:1218:3: lv_expression_7_0= ruleALSTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSQuantifiedAccess().getExpressionALSTermParserRuleCall_0_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_15);
                    lv_expression_7_0=ruleALSTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSQuantifiedRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_7_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getALSQuantifiedAccess().getRightCurlyBracketKeyword_0_7());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:1240:5: this_ALSOr_9= ruleALSOr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getALSQuantifiedAccess().getALSOrParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ALSOr_9=ruleALSOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ALSOr_9; 
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
    // $ANTLR end "ruleALSQuantified"


    // $ANTLR start "entryRuleALSOr"
    // InternalAlloyLanguage.g:1256:1: entryRuleALSOr returns [EObject current=null] : iv_ruleALSOr= ruleALSOr EOF ;
    public final EObject entryRuleALSOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSOr = null;


        try {
            // InternalAlloyLanguage.g:1257:2: (iv_ruleALSOr= ruleALSOr EOF )
            // InternalAlloyLanguage.g:1258:2: iv_ruleALSOr= ruleALSOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSOr=ruleALSOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSOr; 
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
    // $ANTLR end "entryRuleALSOr"


    // $ANTLR start "ruleALSOr"
    // InternalAlloyLanguage.g:1265:1: ruleALSOr returns [EObject current=null] : (this_ALSIff_0= ruleALSIff ( () (otherlv_2= '||' | otherlv_3= 'or' ) ( (lv_rightOperand_4_0= ruleALSIff ) ) )? ) ;
    public final EObject ruleALSOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_ALSIff_0 = null;

        EObject lv_rightOperand_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:1268:28: ( (this_ALSIff_0= ruleALSIff ( () (otherlv_2= '||' | otherlv_3= 'or' ) ( (lv_rightOperand_4_0= ruleALSIff ) ) )? ) )
            // InternalAlloyLanguage.g:1269:1: (this_ALSIff_0= ruleALSIff ( () (otherlv_2= '||' | otherlv_3= 'or' ) ( (lv_rightOperand_4_0= ruleALSIff ) ) )? )
            {
            // InternalAlloyLanguage.g:1269:1: (this_ALSIff_0= ruleALSIff ( () (otherlv_2= '||' | otherlv_3= 'or' ) ( (lv_rightOperand_4_0= ruleALSIff ) ) )? )
            // InternalAlloyLanguage.g:1270:5: this_ALSIff_0= ruleALSIff ( () (otherlv_2= '||' | otherlv_3= 'or' ) ( (lv_rightOperand_4_0= ruleALSIff ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getALSOrAccess().getALSIffParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_19);
            this_ALSIff_0=ruleALSIff();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ALSIff_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAlloyLanguage.g:1278:1: ( () (otherlv_2= '||' | otherlv_3= 'or' ) ( (lv_rightOperand_4_0= ruleALSIff ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=27 && LA18_0<=28)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAlloyLanguage.g:1278:2: () (otherlv_2= '||' | otherlv_3= 'or' ) ( (lv_rightOperand_4_0= ruleALSIff ) )
                    {
                    // InternalAlloyLanguage.g:1278:2: ()
                    // InternalAlloyLanguage.g:1279:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getALSOrAccess().getALSOrLeftOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalAlloyLanguage.g:1284:2: (otherlv_2= '||' | otherlv_3= 'or' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==27) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==28) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalAlloyLanguage.g:1284:4: otherlv_2= '||'
                            {
                            otherlv_2=(Token)match(input,27,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getALSOrAccess().getVerticalLineVerticalLineKeyword_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalAlloyLanguage.g:1289:7: otherlv_3= 'or'
                            {
                            otherlv_3=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getALSOrAccess().getOrKeyword_1_1_1());
                                  
                            }

                            }
                            break;

                    }

                    // InternalAlloyLanguage.g:1293:2: ( (lv_rightOperand_4_0= ruleALSIff ) )
                    // InternalAlloyLanguage.g:1294:1: (lv_rightOperand_4_0= ruleALSIff )
                    {
                    // InternalAlloyLanguage.g:1294:1: (lv_rightOperand_4_0= ruleALSIff )
                    // InternalAlloyLanguage.g:1295:3: lv_rightOperand_4_0= ruleALSIff
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSOrAccess().getRightOperandALSIffParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_rightOperand_4_0=ruleALSIff();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSOrRule());
                      	        }
                             		set(
                             			current, 
                             			"rightOperand",
                              		lv_rightOperand_4_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSIff");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleALSOr"


    // $ANTLR start "entryRuleALSIff"
    // InternalAlloyLanguage.g:1319:1: entryRuleALSIff returns [EObject current=null] : iv_ruleALSIff= ruleALSIff EOF ;
    public final EObject entryRuleALSIff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSIff = null;


        try {
            // InternalAlloyLanguage.g:1320:2: (iv_ruleALSIff= ruleALSIff EOF )
            // InternalAlloyLanguage.g:1321:2: iv_ruleALSIff= ruleALSIff EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSIffRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSIff=ruleALSIff();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSIff; 
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
    // $ANTLR end "entryRuleALSIff"


    // $ANTLR start "ruleALSIff"
    // InternalAlloyLanguage.g:1328:1: ruleALSIff returns [EObject current=null] : (this_ALSImpl_0= ruleALSImpl ( () (otherlv_2= '<=>' | otherlv_3= 'iff' ) ( (lv_rightOperand_4_0= ruleALSImpl ) ) )? ) ;
    public final EObject ruleALSIff() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_ALSImpl_0 = null;

        EObject lv_rightOperand_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:1331:28: ( (this_ALSImpl_0= ruleALSImpl ( () (otherlv_2= '<=>' | otherlv_3= 'iff' ) ( (lv_rightOperand_4_0= ruleALSImpl ) ) )? ) )
            // InternalAlloyLanguage.g:1332:1: (this_ALSImpl_0= ruleALSImpl ( () (otherlv_2= '<=>' | otherlv_3= 'iff' ) ( (lv_rightOperand_4_0= ruleALSImpl ) ) )? )
            {
            // InternalAlloyLanguage.g:1332:1: (this_ALSImpl_0= ruleALSImpl ( () (otherlv_2= '<=>' | otherlv_3= 'iff' ) ( (lv_rightOperand_4_0= ruleALSImpl ) ) )? )
            // InternalAlloyLanguage.g:1333:5: this_ALSImpl_0= ruleALSImpl ( () (otherlv_2= '<=>' | otherlv_3= 'iff' ) ( (lv_rightOperand_4_0= ruleALSImpl ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getALSIffAccess().getALSImplParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_20);
            this_ALSImpl_0=ruleALSImpl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ALSImpl_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAlloyLanguage.g:1341:1: ( () (otherlv_2= '<=>' | otherlv_3= 'iff' ) ( (lv_rightOperand_4_0= ruleALSImpl ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=29 && LA20_0<=30)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAlloyLanguage.g:1341:2: () (otherlv_2= '<=>' | otherlv_3= 'iff' ) ( (lv_rightOperand_4_0= ruleALSImpl ) )
                    {
                    // InternalAlloyLanguage.g:1341:2: ()
                    // InternalAlloyLanguage.g:1342:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getALSIffAccess().getALSIffLeftOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalAlloyLanguage.g:1347:2: (otherlv_2= '<=>' | otherlv_3= 'iff' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==29) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==30) ) {
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
                            // InternalAlloyLanguage.g:1347:4: otherlv_2= '<=>'
                            {
                            otherlv_2=(Token)match(input,29,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getALSIffAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalAlloyLanguage.g:1352:7: otherlv_3= 'iff'
                            {
                            otherlv_3=(Token)match(input,30,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getALSIffAccess().getIffKeyword_1_1_1());
                                  
                            }

                            }
                            break;

                    }

                    // InternalAlloyLanguage.g:1356:2: ( (lv_rightOperand_4_0= ruleALSImpl ) )
                    // InternalAlloyLanguage.g:1357:1: (lv_rightOperand_4_0= ruleALSImpl )
                    {
                    // InternalAlloyLanguage.g:1357:1: (lv_rightOperand_4_0= ruleALSImpl )
                    // InternalAlloyLanguage.g:1358:3: lv_rightOperand_4_0= ruleALSImpl
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSIffAccess().getRightOperandALSImplParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_rightOperand_4_0=ruleALSImpl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSIffRule());
                      	        }
                             		set(
                             			current, 
                             			"rightOperand",
                              		lv_rightOperand_4_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSImpl");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleALSIff"


    // $ANTLR start "entryRuleALSImpl"
    // InternalAlloyLanguage.g:1382:1: entryRuleALSImpl returns [EObject current=null] : iv_ruleALSImpl= ruleALSImpl EOF ;
    public final EObject entryRuleALSImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSImpl = null;


        try {
            // InternalAlloyLanguage.g:1383:2: (iv_ruleALSImpl= ruleALSImpl EOF )
            // InternalAlloyLanguage.g:1384:2: iv_ruleALSImpl= ruleALSImpl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSImplRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSImpl=ruleALSImpl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSImpl; 
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
    // $ANTLR end "entryRuleALSImpl"


    // $ANTLR start "ruleALSImpl"
    // InternalAlloyLanguage.g:1391:1: ruleALSImpl returns [EObject current=null] : (this_ALSAnd_0= ruleALSAnd ( () (otherlv_2= '=>' | otherlv_3= 'implies' ) ( (lv_rightOperand_4_0= ruleALSAnd ) ) (otherlv_5= 'else' ( (lv_elseOperand_6_0= ruleALSAnd ) ) )? )? ) ;
    public final EObject ruleALSImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ALSAnd_0 = null;

        EObject lv_rightOperand_4_0 = null;

        EObject lv_elseOperand_6_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:1394:28: ( (this_ALSAnd_0= ruleALSAnd ( () (otherlv_2= '=>' | otherlv_3= 'implies' ) ( (lv_rightOperand_4_0= ruleALSAnd ) ) (otherlv_5= 'else' ( (lv_elseOperand_6_0= ruleALSAnd ) ) )? )? ) )
            // InternalAlloyLanguage.g:1395:1: (this_ALSAnd_0= ruleALSAnd ( () (otherlv_2= '=>' | otherlv_3= 'implies' ) ( (lv_rightOperand_4_0= ruleALSAnd ) ) (otherlv_5= 'else' ( (lv_elseOperand_6_0= ruleALSAnd ) ) )? )? )
            {
            // InternalAlloyLanguage.g:1395:1: (this_ALSAnd_0= ruleALSAnd ( () (otherlv_2= '=>' | otherlv_3= 'implies' ) ( (lv_rightOperand_4_0= ruleALSAnd ) ) (otherlv_5= 'else' ( (lv_elseOperand_6_0= ruleALSAnd ) ) )? )? )
            // InternalAlloyLanguage.g:1396:5: this_ALSAnd_0= ruleALSAnd ( () (otherlv_2= '=>' | otherlv_3= 'implies' ) ( (lv_rightOperand_4_0= ruleALSAnd ) ) (otherlv_5= 'else' ( (lv_elseOperand_6_0= ruleALSAnd ) ) )? )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getALSImplAccess().getALSAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_21);
            this_ALSAnd_0=ruleALSAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ALSAnd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAlloyLanguage.g:1404:1: ( () (otherlv_2= '=>' | otherlv_3= 'implies' ) ( (lv_rightOperand_4_0= ruleALSAnd ) ) (otherlv_5= 'else' ( (lv_elseOperand_6_0= ruleALSAnd ) ) )? )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=31 && LA23_0<=32)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAlloyLanguage.g:1404:2: () (otherlv_2= '=>' | otherlv_3= 'implies' ) ( (lv_rightOperand_4_0= ruleALSAnd ) ) (otherlv_5= 'else' ( (lv_elseOperand_6_0= ruleALSAnd ) ) )?
                    {
                    // InternalAlloyLanguage.g:1404:2: ()
                    // InternalAlloyLanguage.g:1405:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getALSImplAccess().getALSImplLeftOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalAlloyLanguage.g:1410:2: (otherlv_2= '=>' | otherlv_3= 'implies' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==31) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==32) ) {
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
                            // InternalAlloyLanguage.g:1410:4: otherlv_2= '=>'
                            {
                            otherlv_2=(Token)match(input,31,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getALSImplAccess().getEqualsSignGreaterThanSignKeyword_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalAlloyLanguage.g:1415:7: otherlv_3= 'implies'
                            {
                            otherlv_3=(Token)match(input,32,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getALSImplAccess().getImpliesKeyword_1_1_1());
                                  
                            }

                            }
                            break;

                    }

                    // InternalAlloyLanguage.g:1419:2: ( (lv_rightOperand_4_0= ruleALSAnd ) )
                    // InternalAlloyLanguage.g:1420:1: (lv_rightOperand_4_0= ruleALSAnd )
                    {
                    // InternalAlloyLanguage.g:1420:1: (lv_rightOperand_4_0= ruleALSAnd )
                    // InternalAlloyLanguage.g:1421:3: lv_rightOperand_4_0= ruleALSAnd
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSImplAccess().getRightOperandALSAndParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_22);
                    lv_rightOperand_4_0=ruleALSAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSImplRule());
                      	        }
                             		set(
                             			current, 
                             			"rightOperand",
                              		lv_rightOperand_4_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSAnd");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAlloyLanguage.g:1437:2: (otherlv_5= 'else' ( (lv_elseOperand_6_0= ruleALSAnd ) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==33) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalAlloyLanguage.g:1437:4: otherlv_5= 'else' ( (lv_elseOperand_6_0= ruleALSAnd ) )
                            {
                            otherlv_5=(Token)match(input,33,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getALSImplAccess().getElseKeyword_1_3_0());
                                  
                            }
                            // InternalAlloyLanguage.g:1441:1: ( (lv_elseOperand_6_0= ruleALSAnd ) )
                            // InternalAlloyLanguage.g:1442:1: (lv_elseOperand_6_0= ruleALSAnd )
                            {
                            // InternalAlloyLanguage.g:1442:1: (lv_elseOperand_6_0= ruleALSAnd )
                            // InternalAlloyLanguage.g:1443:3: lv_elseOperand_6_0= ruleALSAnd
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getALSImplAccess().getElseOperandALSAndParserRuleCall_1_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_2);
                            lv_elseOperand_6_0=ruleALSAnd();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getALSImplRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"elseOperand",
                                      		lv_elseOperand_6_0, 
                                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSAnd");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

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
    // $ANTLR end "ruleALSImpl"


    // $ANTLR start "entryRuleALSAnd"
    // InternalAlloyLanguage.g:1467:1: entryRuleALSAnd returns [EObject current=null] : iv_ruleALSAnd= ruleALSAnd EOF ;
    public final EObject entryRuleALSAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSAnd = null;


        try {
            // InternalAlloyLanguage.g:1468:2: (iv_ruleALSAnd= ruleALSAnd EOF )
            // InternalAlloyLanguage.g:1469:2: iv_ruleALSAnd= ruleALSAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSAnd=ruleALSAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSAnd; 
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
    // $ANTLR end "entryRuleALSAnd"


    // $ANTLR start "ruleALSAnd"
    // InternalAlloyLanguage.g:1476:1: ruleALSAnd returns [EObject current=null] : (this_ALSComparison_0= ruleALSComparison ( () (otherlv_2= '&&' | otherlv_3= 'and' ) ( (lv_rightOperand_4_0= ruleALSComparison ) ) )? ) ;
    public final EObject ruleALSAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_ALSComparison_0 = null;

        EObject lv_rightOperand_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:1479:28: ( (this_ALSComparison_0= ruleALSComparison ( () (otherlv_2= '&&' | otherlv_3= 'and' ) ( (lv_rightOperand_4_0= ruleALSComparison ) ) )? ) )
            // InternalAlloyLanguage.g:1480:1: (this_ALSComparison_0= ruleALSComparison ( () (otherlv_2= '&&' | otherlv_3= 'and' ) ( (lv_rightOperand_4_0= ruleALSComparison ) ) )? )
            {
            // InternalAlloyLanguage.g:1480:1: (this_ALSComparison_0= ruleALSComparison ( () (otherlv_2= '&&' | otherlv_3= 'and' ) ( (lv_rightOperand_4_0= ruleALSComparison ) ) )? )
            // InternalAlloyLanguage.g:1481:5: this_ALSComparison_0= ruleALSComparison ( () (otherlv_2= '&&' | otherlv_3= 'and' ) ( (lv_rightOperand_4_0= ruleALSComparison ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getALSAndAccess().getALSComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_23);
            this_ALSComparison_0=ruleALSComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ALSComparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAlloyLanguage.g:1489:1: ( () (otherlv_2= '&&' | otherlv_3= 'and' ) ( (lv_rightOperand_4_0= ruleALSComparison ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=34 && LA25_0<=35)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAlloyLanguage.g:1489:2: () (otherlv_2= '&&' | otherlv_3= 'and' ) ( (lv_rightOperand_4_0= ruleALSComparison ) )
                    {
                    // InternalAlloyLanguage.g:1489:2: ()
                    // InternalAlloyLanguage.g:1490:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getALSAndAccess().getALSAndLeftOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalAlloyLanguage.g:1495:2: (otherlv_2= '&&' | otherlv_3= 'and' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==34) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==35) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalAlloyLanguage.g:1495:4: otherlv_2= '&&'
                            {
                            otherlv_2=(Token)match(input,34,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getALSAndAccess().getAmpersandAmpersandKeyword_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalAlloyLanguage.g:1500:7: otherlv_3= 'and'
                            {
                            otherlv_3=(Token)match(input,35,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getALSAndAccess().getAndKeyword_1_1_1());
                                  
                            }

                            }
                            break;

                    }

                    // InternalAlloyLanguage.g:1504:2: ( (lv_rightOperand_4_0= ruleALSComparison ) )
                    // InternalAlloyLanguage.g:1505:1: (lv_rightOperand_4_0= ruleALSComparison )
                    {
                    // InternalAlloyLanguage.g:1505:1: (lv_rightOperand_4_0= ruleALSComparison )
                    // InternalAlloyLanguage.g:1506:3: lv_rightOperand_4_0= ruleALSComparison
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSAndAccess().getRightOperandALSComparisonParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_rightOperand_4_0=ruleALSComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSAndRule());
                      	        }
                             		set(
                             			current, 
                             			"rightOperand",
                              		lv_rightOperand_4_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSComparison");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleALSAnd"


    // $ANTLR start "entryRuleALSComparison"
    // InternalAlloyLanguage.g:1530:1: entryRuleALSComparison returns [EObject current=null] : iv_ruleALSComparison= ruleALSComparison EOF ;
    public final EObject entryRuleALSComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSComparison = null;


        try {
            // InternalAlloyLanguage.g:1531:2: (iv_ruleALSComparison= ruleALSComparison EOF )
            // InternalAlloyLanguage.g:1532:2: iv_ruleALSComparison= ruleALSComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSComparison=ruleALSComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSComparison; 
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
    // $ANTLR end "entryRuleALSComparison"


    // $ANTLR start "ruleALSComparison"
    // InternalAlloyLanguage.g:1539:1: ruleALSComparison returns [EObject current=null] : (this_ALSOverride_0= ruleALSOverride ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= 'in' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '>=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '<=' ) ) ( (lv_rightOperand_15_0= ruleALSOverride ) ) )? ) ;
    public final EObject ruleALSComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject this_ALSOverride_0 = null;

        EObject lv_rightOperand_15_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:1542:28: ( (this_ALSOverride_0= ruleALSOverride ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= 'in' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '>=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '<=' ) ) ( (lv_rightOperand_15_0= ruleALSOverride ) ) )? ) )
            // InternalAlloyLanguage.g:1543:1: (this_ALSOverride_0= ruleALSOverride ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= 'in' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '>=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '<=' ) ) ( (lv_rightOperand_15_0= ruleALSOverride ) ) )? )
            {
            // InternalAlloyLanguage.g:1543:1: (this_ALSOverride_0= ruleALSOverride ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= 'in' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '>=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '<=' ) ) ( (lv_rightOperand_15_0= ruleALSOverride ) ) )? )
            // InternalAlloyLanguage.g:1544:5: this_ALSOverride_0= ruleALSOverride ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= 'in' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '>=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '<=' ) ) ( (lv_rightOperand_15_0= ruleALSOverride ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getALSComparisonAccess().getALSOverrideParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_24);
            this_ALSOverride_0=ruleALSOverride();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ALSOverride_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAlloyLanguage.g:1552:1: ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= 'in' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '>=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '<=' ) ) ( (lv_rightOperand_15_0= ruleALSOverride ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18||(LA27_0>=36 && LA27_0<=41)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAlloyLanguage.g:1552:2: ( ( () otherlv_2= '=' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= 'in' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '>=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '<=' ) ) ( (lv_rightOperand_15_0= ruleALSOverride ) )
                    {
                    // InternalAlloyLanguage.g:1552:2: ( ( () otherlv_2= '=' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= 'in' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '>=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '<=' ) )
                    int alt26=7;
                    switch ( input.LA(1) ) {
                    case 36:
                        {
                        alt26=1;
                        }
                        break;
                    case 37:
                        {
                        alt26=2;
                        }
                        break;
                    case 18:
                        {
                        alt26=3;
                        }
                        break;
                    case 38:
                        {
                        alt26=4;
                        }
                        break;
                    case 39:
                        {
                        alt26=5;
                        }
                        break;
                    case 40:
                        {
                        alt26=6;
                        }
                        break;
                    case 41:
                        {
                        alt26=7;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }

                    switch (alt26) {
                        case 1 :
                            // InternalAlloyLanguage.g:1552:3: ( () otherlv_2= '=' )
                            {
                            // InternalAlloyLanguage.g:1552:3: ( () otherlv_2= '=' )
                            // InternalAlloyLanguage.g:1552:4: () otherlv_2= '='
                            {
                            // InternalAlloyLanguage.g:1552:4: ()
                            // InternalAlloyLanguage.g:1553:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getALSComparisonAccess().getALSEqualsLeftOperandAction_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_2=(Token)match(input,36,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getALSComparisonAccess().getEqualsSignKeyword_1_0_0_1());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalAlloyLanguage.g:1563:6: ( () otherlv_4= '!=' )
                            {
                            // InternalAlloyLanguage.g:1563:6: ( () otherlv_4= '!=' )
                            // InternalAlloyLanguage.g:1563:7: () otherlv_4= '!='
                            {
                            // InternalAlloyLanguage.g:1563:7: ()
                            // InternalAlloyLanguage.g:1564:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getALSComparisonAccess().getALSNotEqualsLeftOperandAction_1_0_1_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_4=(Token)match(input,37,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getALSComparisonAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1());
                                  
                            }

                            }


                            }
                            break;
                        case 3 :
                            // InternalAlloyLanguage.g:1574:6: ( () otherlv_6= 'in' )
                            {
                            // InternalAlloyLanguage.g:1574:6: ( () otherlv_6= 'in' )
                            // InternalAlloyLanguage.g:1574:7: () otherlv_6= 'in'
                            {
                            // InternalAlloyLanguage.g:1574:7: ()
                            // InternalAlloyLanguage.g:1575:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getALSComparisonAccess().getALSSubsetLeftOperandAction_1_0_2_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_6=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getALSComparisonAccess().getInKeyword_1_0_2_1());
                                  
                            }

                            }


                            }
                            break;
                        case 4 :
                            // InternalAlloyLanguage.g:1585:6: ( () otherlv_8= '>' )
                            {
                            // InternalAlloyLanguage.g:1585:6: ( () otherlv_8= '>' )
                            // InternalAlloyLanguage.g:1585:7: () otherlv_8= '>'
                            {
                            // InternalAlloyLanguage.g:1585:7: ()
                            // InternalAlloyLanguage.g:1586:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getALSComparisonAccess().getALSLessLeftOperandAction_1_0_3_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_8=(Token)match(input,38,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getALSComparisonAccess().getGreaterThanSignKeyword_1_0_3_1());
                                  
                            }

                            }


                            }
                            break;
                        case 5 :
                            // InternalAlloyLanguage.g:1596:6: ( () otherlv_10= '>=' )
                            {
                            // InternalAlloyLanguage.g:1596:6: ( () otherlv_10= '>=' )
                            // InternalAlloyLanguage.g:1596:7: () otherlv_10= '>='
                            {
                            // InternalAlloyLanguage.g:1596:7: ()
                            // InternalAlloyLanguage.g:1597:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getALSComparisonAccess().getALSLeqLeftOperandAction_1_0_4_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_10=(Token)match(input,39,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getALSComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_4_1());
                                  
                            }

                            }


                            }
                            break;
                        case 6 :
                            // InternalAlloyLanguage.g:1607:6: ( () otherlv_12= '<' )
                            {
                            // InternalAlloyLanguage.g:1607:6: ( () otherlv_12= '<' )
                            // InternalAlloyLanguage.g:1607:7: () otherlv_12= '<'
                            {
                            // InternalAlloyLanguage.g:1607:7: ()
                            // InternalAlloyLanguage.g:1608:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getALSComparisonAccess().getALSMoreLeftOperandAction_1_0_5_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_12=(Token)match(input,40,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getALSComparisonAccess().getLessThanSignKeyword_1_0_5_1());
                                  
                            }

                            }


                            }
                            break;
                        case 7 :
                            // InternalAlloyLanguage.g:1618:6: ( () otherlv_14= '<=' )
                            {
                            // InternalAlloyLanguage.g:1618:6: ( () otherlv_14= '<=' )
                            // InternalAlloyLanguage.g:1618:7: () otherlv_14= '<='
                            {
                            // InternalAlloyLanguage.g:1618:7: ()
                            // InternalAlloyLanguage.g:1619:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getALSComparisonAccess().getALSMeqLeftOperandAction_1_0_6_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_14=(Token)match(input,41,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_14, grammarAccess.getALSComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_6_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // InternalAlloyLanguage.g:1628:3: ( (lv_rightOperand_15_0= ruleALSOverride ) )
                    // InternalAlloyLanguage.g:1629:1: (lv_rightOperand_15_0= ruleALSOverride )
                    {
                    // InternalAlloyLanguage.g:1629:1: (lv_rightOperand_15_0= ruleALSOverride )
                    // InternalAlloyLanguage.g:1630:3: lv_rightOperand_15_0= ruleALSOverride
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSComparisonAccess().getRightOperandALSOverrideParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_rightOperand_15_0=ruleALSOverride();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSComparisonRule());
                      	        }
                             		set(
                             			current, 
                             			"rightOperand",
                              		lv_rightOperand_15_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSOverride");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleALSComparison"


    // $ANTLR start "entryRuleALSOverride"
    // InternalAlloyLanguage.g:1654:1: entryRuleALSOverride returns [EObject current=null] : iv_ruleALSOverride= ruleALSOverride EOF ;
    public final EObject entryRuleALSOverride() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSOverride = null;


        try {
            // InternalAlloyLanguage.g:1655:2: (iv_ruleALSOverride= ruleALSOverride EOF )
            // InternalAlloyLanguage.g:1656:2: iv_ruleALSOverride= ruleALSOverride EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSOverrideRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSOverride=ruleALSOverride();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSOverride; 
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
    // $ANTLR end "entryRuleALSOverride"


    // $ANTLR start "ruleALSOverride"
    // InternalAlloyLanguage.g:1663:1: ruleALSOverride returns [EObject current=null] : (this_ALSRangeRestrictionRight_0= ruleALSRangeRestrictionRight ( () otherlv_2= '++' ( (lv_rightOperand_3_0= ruleALSRangeRestrictionRight ) ) )? ) ;
    public final EObject ruleALSOverride() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ALSRangeRestrictionRight_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:1666:28: ( (this_ALSRangeRestrictionRight_0= ruleALSRangeRestrictionRight ( () otherlv_2= '++' ( (lv_rightOperand_3_0= ruleALSRangeRestrictionRight ) ) )? ) )
            // InternalAlloyLanguage.g:1667:1: (this_ALSRangeRestrictionRight_0= ruleALSRangeRestrictionRight ( () otherlv_2= '++' ( (lv_rightOperand_3_0= ruleALSRangeRestrictionRight ) ) )? )
            {
            // InternalAlloyLanguage.g:1667:1: (this_ALSRangeRestrictionRight_0= ruleALSRangeRestrictionRight ( () otherlv_2= '++' ( (lv_rightOperand_3_0= ruleALSRangeRestrictionRight ) ) )? )
            // InternalAlloyLanguage.g:1668:5: this_ALSRangeRestrictionRight_0= ruleALSRangeRestrictionRight ( () otherlv_2= '++' ( (lv_rightOperand_3_0= ruleALSRangeRestrictionRight ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getALSOverrideAccess().getALSRangeRestrictionRightParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_25);
            this_ALSRangeRestrictionRight_0=ruleALSRangeRestrictionRight();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ALSRangeRestrictionRight_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAlloyLanguage.g:1676:1: ( () otherlv_2= '++' ( (lv_rightOperand_3_0= ruleALSRangeRestrictionRight ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAlloyLanguage.g:1676:2: () otherlv_2= '++' ( (lv_rightOperand_3_0= ruleALSRangeRestrictionRight ) )
                    {
                    // InternalAlloyLanguage.g:1676:2: ()
                    // InternalAlloyLanguage.g:1677:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getALSOverrideAccess().getALSOverrideLeftOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,42,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getALSOverrideAccess().getPlusSignPlusSignKeyword_1_1());
                          
                    }
                    // InternalAlloyLanguage.g:1686:1: ( (lv_rightOperand_3_0= ruleALSRangeRestrictionRight ) )
                    // InternalAlloyLanguage.g:1687:1: (lv_rightOperand_3_0= ruleALSRangeRestrictionRight )
                    {
                    // InternalAlloyLanguage.g:1687:1: (lv_rightOperand_3_0= ruleALSRangeRestrictionRight )
                    // InternalAlloyLanguage.g:1688:3: lv_rightOperand_3_0= ruleALSRangeRestrictionRight
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSOverrideAccess().getRightOperandALSRangeRestrictionRightParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_rightOperand_3_0=ruleALSRangeRestrictionRight();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSOverrideRule());
                      	        }
                             		set(
                             			current, 
                             			"rightOperand",
                              		lv_rightOperand_3_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSRangeRestrictionRight");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleALSOverride"


    // $ANTLR start "entryRuleALSRangeRestrictionRight"
    // InternalAlloyLanguage.g:1712:1: entryRuleALSRangeRestrictionRight returns [EObject current=null] : iv_ruleALSRangeRestrictionRight= ruleALSRangeRestrictionRight EOF ;
    public final EObject entryRuleALSRangeRestrictionRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSRangeRestrictionRight = null;


        try {
            // InternalAlloyLanguage.g:1713:2: (iv_ruleALSRangeRestrictionRight= ruleALSRangeRestrictionRight EOF )
            // InternalAlloyLanguage.g:1714:2: iv_ruleALSRangeRestrictionRight= ruleALSRangeRestrictionRight EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSRangeRestrictionRightRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSRangeRestrictionRight=ruleALSRangeRestrictionRight();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSRangeRestrictionRight; 
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
    // $ANTLR end "entryRuleALSRangeRestrictionRight"


    // $ANTLR start "ruleALSRangeRestrictionRight"
    // InternalAlloyLanguage.g:1721:1: ruleALSRangeRestrictionRight returns [EObject current=null] : (this_ALSRangeRestrictionLeft_0= ruleALSRangeRestrictionLeft ( () otherlv_2= ':>' ( (lv_filter_3_0= ruleALSRangeRestrictionLeft ) ) )? ) ;
    public final EObject ruleALSRangeRestrictionRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ALSRangeRestrictionLeft_0 = null;

        EObject lv_filter_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:1724:28: ( (this_ALSRangeRestrictionLeft_0= ruleALSRangeRestrictionLeft ( () otherlv_2= ':>' ( (lv_filter_3_0= ruleALSRangeRestrictionLeft ) ) )? ) )
            // InternalAlloyLanguage.g:1725:1: (this_ALSRangeRestrictionLeft_0= ruleALSRangeRestrictionLeft ( () otherlv_2= ':>' ( (lv_filter_3_0= ruleALSRangeRestrictionLeft ) ) )? )
            {
            // InternalAlloyLanguage.g:1725:1: (this_ALSRangeRestrictionLeft_0= ruleALSRangeRestrictionLeft ( () otherlv_2= ':>' ( (lv_filter_3_0= ruleALSRangeRestrictionLeft ) ) )? )
            // InternalAlloyLanguage.g:1726:5: this_ALSRangeRestrictionLeft_0= ruleALSRangeRestrictionLeft ( () otherlv_2= ':>' ( (lv_filter_3_0= ruleALSRangeRestrictionLeft ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getALSRangeRestrictionRightAccess().getALSRangeRestrictionLeftParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_26);
            this_ALSRangeRestrictionLeft_0=ruleALSRangeRestrictionLeft();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ALSRangeRestrictionLeft_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAlloyLanguage.g:1734:1: ( () otherlv_2= ':>' ( (lv_filter_3_0= ruleALSRangeRestrictionLeft ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAlloyLanguage.g:1734:2: () otherlv_2= ':>' ( (lv_filter_3_0= ruleALSRangeRestrictionLeft ) )
                    {
                    // InternalAlloyLanguage.g:1734:2: ()
                    // InternalAlloyLanguage.g:1735:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getALSRangeRestrictionRightAccess().getALSRangeRestrictionRightRelationAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,43,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getALSRangeRestrictionRightAccess().getColonGreaterThanSignKeyword_1_1());
                          
                    }
                    // InternalAlloyLanguage.g:1744:1: ( (lv_filter_3_0= ruleALSRangeRestrictionLeft ) )
                    // InternalAlloyLanguage.g:1745:1: (lv_filter_3_0= ruleALSRangeRestrictionLeft )
                    {
                    // InternalAlloyLanguage.g:1745:1: (lv_filter_3_0= ruleALSRangeRestrictionLeft )
                    // InternalAlloyLanguage.g:1746:3: lv_filter_3_0= ruleALSRangeRestrictionLeft
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSRangeRestrictionRightAccess().getFilterALSRangeRestrictionLeftParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_filter_3_0=ruleALSRangeRestrictionLeft();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSRangeRestrictionRightRule());
                      	        }
                             		set(
                             			current, 
                             			"filter",
                              		lv_filter_3_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSRangeRestrictionLeft");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleALSRangeRestrictionRight"


    // $ANTLR start "entryRuleALSRangeRestrictionLeft"
    // InternalAlloyLanguage.g:1770:1: entryRuleALSRangeRestrictionLeft returns [EObject current=null] : iv_ruleALSRangeRestrictionLeft= ruleALSRangeRestrictionLeft EOF ;
    public final EObject entryRuleALSRangeRestrictionLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSRangeRestrictionLeft = null;


        try {
            // InternalAlloyLanguage.g:1771:2: (iv_ruleALSRangeRestrictionLeft= ruleALSRangeRestrictionLeft EOF )
            // InternalAlloyLanguage.g:1772:2: iv_ruleALSRangeRestrictionLeft= ruleALSRangeRestrictionLeft EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSRangeRestrictionLeftRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSRangeRestrictionLeft=ruleALSRangeRestrictionLeft();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSRangeRestrictionLeft; 
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
    // $ANTLR end "entryRuleALSRangeRestrictionLeft"


    // $ANTLR start "ruleALSRangeRestrictionLeft"
    // InternalAlloyLanguage.g:1779:1: ruleALSRangeRestrictionLeft returns [EObject current=null] : (this_ALSJoin_0= ruleALSJoin ( () otherlv_2= '<:' ( (lv_relation_3_0= ruleALSJoin ) ) )? ) ;
    public final EObject ruleALSRangeRestrictionLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ALSJoin_0 = null;

        EObject lv_relation_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:1782:28: ( (this_ALSJoin_0= ruleALSJoin ( () otherlv_2= '<:' ( (lv_relation_3_0= ruleALSJoin ) ) )? ) )
            // InternalAlloyLanguage.g:1783:1: (this_ALSJoin_0= ruleALSJoin ( () otherlv_2= '<:' ( (lv_relation_3_0= ruleALSJoin ) ) )? )
            {
            // InternalAlloyLanguage.g:1783:1: (this_ALSJoin_0= ruleALSJoin ( () otherlv_2= '<:' ( (lv_relation_3_0= ruleALSJoin ) ) )? )
            // InternalAlloyLanguage.g:1784:5: this_ALSJoin_0= ruleALSJoin ( () otherlv_2= '<:' ( (lv_relation_3_0= ruleALSJoin ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getALSRangeRestrictionLeftAccess().getALSJoinParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_27);
            this_ALSJoin_0=ruleALSJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ALSJoin_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAlloyLanguage.g:1792:1: ( () otherlv_2= '<:' ( (lv_relation_3_0= ruleALSJoin ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAlloyLanguage.g:1792:2: () otherlv_2= '<:' ( (lv_relation_3_0= ruleALSJoin ) )
                    {
                    // InternalAlloyLanguage.g:1792:2: ()
                    // InternalAlloyLanguage.g:1793:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getALSRangeRestrictionLeftAccess().getALSRangeRestrictionLeftFilterAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,44,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getALSRangeRestrictionLeftAccess().getLessThanSignColonKeyword_1_1());
                          
                    }
                    // InternalAlloyLanguage.g:1802:1: ( (lv_relation_3_0= ruleALSJoin ) )
                    // InternalAlloyLanguage.g:1803:1: (lv_relation_3_0= ruleALSJoin )
                    {
                    // InternalAlloyLanguage.g:1803:1: (lv_relation_3_0= ruleALSJoin )
                    // InternalAlloyLanguage.g:1804:3: lv_relation_3_0= ruleALSJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSRangeRestrictionLeftAccess().getRelationALSJoinParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_relation_3_0=ruleALSJoin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSRangeRestrictionLeftRule());
                      	        }
                             		set(
                             			current, 
                             			"relation",
                              		lv_relation_3_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSJoin");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleALSRangeRestrictionLeft"


    // $ANTLR start "entryRuleALSJoin"
    // InternalAlloyLanguage.g:1828:1: entryRuleALSJoin returns [EObject current=null] : iv_ruleALSJoin= ruleALSJoin EOF ;
    public final EObject entryRuleALSJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSJoin = null;


        try {
            // InternalAlloyLanguage.g:1829:2: (iv_ruleALSJoin= ruleALSJoin EOF )
            // InternalAlloyLanguage.g:1830:2: iv_ruleALSJoin= ruleALSJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSJoinRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSJoin=ruleALSJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSJoin; 
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
    // $ANTLR end "entryRuleALSJoin"


    // $ANTLR start "ruleALSJoin"
    // InternalAlloyLanguage.g:1837:1: ruleALSJoin returns [EObject current=null] : (this_ALSMinus_0= ruleALSMinus ( () otherlv_2= '.' ( (lv_rightOperand_3_0= ruleALSMinus ) ) )* ) ;
    public final EObject ruleALSJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ALSMinus_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:1840:28: ( (this_ALSMinus_0= ruleALSMinus ( () otherlv_2= '.' ( (lv_rightOperand_3_0= ruleALSMinus ) ) )* ) )
            // InternalAlloyLanguage.g:1841:1: (this_ALSMinus_0= ruleALSMinus ( () otherlv_2= '.' ( (lv_rightOperand_3_0= ruleALSMinus ) ) )* )
            {
            // InternalAlloyLanguage.g:1841:1: (this_ALSMinus_0= ruleALSMinus ( () otherlv_2= '.' ( (lv_rightOperand_3_0= ruleALSMinus ) ) )* )
            // InternalAlloyLanguage.g:1842:5: this_ALSMinus_0= ruleALSMinus ( () otherlv_2= '.' ( (lv_rightOperand_3_0= ruleALSMinus ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getALSJoinAccess().getALSMinusParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_28);
            this_ALSMinus_0=ruleALSMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ALSMinus_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAlloyLanguage.g:1850:1: ( () otherlv_2= '.' ( (lv_rightOperand_3_0= ruleALSMinus ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==45) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAlloyLanguage.g:1850:2: () otherlv_2= '.' ( (lv_rightOperand_3_0= ruleALSMinus ) )
            	    {
            	    // InternalAlloyLanguage.g:1850:2: ()
            	    // InternalAlloyLanguage.g:1851:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getALSJoinAccess().getALSJoinLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,45,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getALSJoinAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // InternalAlloyLanguage.g:1860:1: ( (lv_rightOperand_3_0= ruleALSMinus ) )
            	    // InternalAlloyLanguage.g:1861:1: (lv_rightOperand_3_0= ruleALSMinus )
            	    {
            	    // InternalAlloyLanguage.g:1861:1: (lv_rightOperand_3_0= ruleALSMinus )
            	    // InternalAlloyLanguage.g:1862:3: lv_rightOperand_3_0= ruleALSMinus
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getALSJoinAccess().getRightOperandALSMinusParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_rightOperand_3_0=ruleALSMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getALSJoinRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSMinus");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "ruleALSJoin"


    // $ANTLR start "entryRuleALSMinus"
    // InternalAlloyLanguage.g:1886:1: entryRuleALSMinus returns [EObject current=null] : iv_ruleALSMinus= ruleALSMinus EOF ;
    public final EObject entryRuleALSMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSMinus = null;


        try {
            // InternalAlloyLanguage.g:1887:2: (iv_ruleALSMinus= ruleALSMinus EOF )
            // InternalAlloyLanguage.g:1888:2: iv_ruleALSMinus= ruleALSMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSMinus=ruleALSMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSMinus; 
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
    // $ANTLR end "entryRuleALSMinus"


    // $ANTLR start "ruleALSMinus"
    // InternalAlloyLanguage.g:1895:1: ruleALSMinus returns [EObject current=null] : (this_ALSPlus_0= ruleALSPlus ( () otherlv_2= '-' ( (lv_rightOperand_3_0= ruleALSPlus ) ) )* ) ;
    public final EObject ruleALSMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ALSPlus_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:1898:28: ( (this_ALSPlus_0= ruleALSPlus ( () otherlv_2= '-' ( (lv_rightOperand_3_0= ruleALSPlus ) ) )* ) )
            // InternalAlloyLanguage.g:1899:1: (this_ALSPlus_0= ruleALSPlus ( () otherlv_2= '-' ( (lv_rightOperand_3_0= ruleALSPlus ) ) )* )
            {
            // InternalAlloyLanguage.g:1899:1: (this_ALSPlus_0= ruleALSPlus ( () otherlv_2= '-' ( (lv_rightOperand_3_0= ruleALSPlus ) ) )* )
            // InternalAlloyLanguage.g:1900:5: this_ALSPlus_0= ruleALSPlus ( () otherlv_2= '-' ( (lv_rightOperand_3_0= ruleALSPlus ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getALSMinusAccess().getALSPlusParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_29);
            this_ALSPlus_0=ruleALSPlus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ALSPlus_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAlloyLanguage.g:1908:1: ( () otherlv_2= '-' ( (lv_rightOperand_3_0= ruleALSPlus ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==46) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAlloyLanguage.g:1908:2: () otherlv_2= '-' ( (lv_rightOperand_3_0= ruleALSPlus ) )
            	    {
            	    // InternalAlloyLanguage.g:1908:2: ()
            	    // InternalAlloyLanguage.g:1909:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getALSMinusAccess().getALSMinusLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,46,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getALSMinusAccess().getHyphenMinusKeyword_1_1());
            	          
            	    }
            	    // InternalAlloyLanguage.g:1918:1: ( (lv_rightOperand_3_0= ruleALSPlus ) )
            	    // InternalAlloyLanguage.g:1919:1: (lv_rightOperand_3_0= ruleALSPlus )
            	    {
            	    // InternalAlloyLanguage.g:1919:1: (lv_rightOperand_3_0= ruleALSPlus )
            	    // InternalAlloyLanguage.g:1920:3: lv_rightOperand_3_0= ruleALSPlus
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getALSMinusAccess().getRightOperandALSPlusParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_rightOperand_3_0=ruleALSPlus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getALSMinusRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSPlus");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // $ANTLR end "ruleALSMinus"


    // $ANTLR start "entryRuleALSPlus"
    // InternalAlloyLanguage.g:1944:1: entryRuleALSPlus returns [EObject current=null] : iv_ruleALSPlus= ruleALSPlus EOF ;
    public final EObject entryRuleALSPlus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSPlus = null;


        try {
            // InternalAlloyLanguage.g:1945:2: (iv_ruleALSPlus= ruleALSPlus EOF )
            // InternalAlloyLanguage.g:1946:2: iv_ruleALSPlus= ruleALSPlus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSPlusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSPlus=ruleALSPlus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSPlus; 
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
    // $ANTLR end "entryRuleALSPlus"


    // $ANTLR start "ruleALSPlus"
    // InternalAlloyLanguage.g:1953:1: ruleALSPlus returns [EObject current=null] : (this_ALSIntersection_0= ruleALSIntersection ( () otherlv_2= '+' ( (lv_rightOperand_3_0= ruleALSIntersection ) ) )* ) ;
    public final EObject ruleALSPlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ALSIntersection_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:1956:28: ( (this_ALSIntersection_0= ruleALSIntersection ( () otherlv_2= '+' ( (lv_rightOperand_3_0= ruleALSIntersection ) ) )* ) )
            // InternalAlloyLanguage.g:1957:1: (this_ALSIntersection_0= ruleALSIntersection ( () otherlv_2= '+' ( (lv_rightOperand_3_0= ruleALSIntersection ) ) )* )
            {
            // InternalAlloyLanguage.g:1957:1: (this_ALSIntersection_0= ruleALSIntersection ( () otherlv_2= '+' ( (lv_rightOperand_3_0= ruleALSIntersection ) ) )* )
            // InternalAlloyLanguage.g:1958:5: this_ALSIntersection_0= ruleALSIntersection ( () otherlv_2= '+' ( (lv_rightOperand_3_0= ruleALSIntersection ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getALSPlusAccess().getALSIntersectionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_30);
            this_ALSIntersection_0=ruleALSIntersection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ALSIntersection_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAlloyLanguage.g:1966:1: ( () otherlv_2= '+' ( (lv_rightOperand_3_0= ruleALSIntersection ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==19) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAlloyLanguage.g:1966:2: () otherlv_2= '+' ( (lv_rightOperand_3_0= ruleALSIntersection ) )
            	    {
            	    // InternalAlloyLanguage.g:1966:2: ()
            	    // InternalAlloyLanguage.g:1967:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getALSPlusAccess().getALSPlusLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getALSPlusAccess().getPlusSignKeyword_1_1());
            	          
            	    }
            	    // InternalAlloyLanguage.g:1976:1: ( (lv_rightOperand_3_0= ruleALSIntersection ) )
            	    // InternalAlloyLanguage.g:1977:1: (lv_rightOperand_3_0= ruleALSIntersection )
            	    {
            	    // InternalAlloyLanguage.g:1977:1: (lv_rightOperand_3_0= ruleALSIntersection )
            	    // InternalAlloyLanguage.g:1978:3: lv_rightOperand_3_0= ruleALSIntersection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getALSPlusAccess().getRightOperandALSIntersectionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_rightOperand_3_0=ruleALSIntersection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getALSPlusRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSIntersection");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // $ANTLR end "ruleALSPlus"


    // $ANTLR start "entryRuleALSIntersection"
    // InternalAlloyLanguage.g:2002:1: entryRuleALSIntersection returns [EObject current=null] : iv_ruleALSIntersection= ruleALSIntersection EOF ;
    public final EObject entryRuleALSIntersection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSIntersection = null;


        try {
            // InternalAlloyLanguage.g:2003:2: (iv_ruleALSIntersection= ruleALSIntersection EOF )
            // InternalAlloyLanguage.g:2004:2: iv_ruleALSIntersection= ruleALSIntersection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSIntersectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSIntersection=ruleALSIntersection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSIntersection; 
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
    // $ANTLR end "entryRuleALSIntersection"


    // $ANTLR start "ruleALSIntersection"
    // InternalAlloyLanguage.g:2011:1: ruleALSIntersection returns [EObject current=null] : (this_ALSDirectProduct_0= ruleALSDirectProduct ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleALSDirectProduct ) ) )* ) ;
    public final EObject ruleALSIntersection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ALSDirectProduct_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:2014:28: ( (this_ALSDirectProduct_0= ruleALSDirectProduct ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleALSDirectProduct ) ) )* ) )
            // InternalAlloyLanguage.g:2015:1: (this_ALSDirectProduct_0= ruleALSDirectProduct ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleALSDirectProduct ) ) )* )
            {
            // InternalAlloyLanguage.g:2015:1: (this_ALSDirectProduct_0= ruleALSDirectProduct ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleALSDirectProduct ) ) )* )
            // InternalAlloyLanguage.g:2016:5: this_ALSDirectProduct_0= ruleALSDirectProduct ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleALSDirectProduct ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getALSIntersectionAccess().getALSDirectProductParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_31);
            this_ALSDirectProduct_0=ruleALSDirectProduct();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ALSDirectProduct_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAlloyLanguage.g:2024:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleALSDirectProduct ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==47) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAlloyLanguage.g:2024:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleALSDirectProduct ) )
            	    {
            	    // InternalAlloyLanguage.g:2024:2: ()
            	    // InternalAlloyLanguage.g:2025:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getALSIntersectionAccess().getALSIntersectionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getALSIntersectionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // InternalAlloyLanguage.g:2034:1: ( (lv_rightOperand_3_0= ruleALSDirectProduct ) )
            	    // InternalAlloyLanguage.g:2035:1: (lv_rightOperand_3_0= ruleALSDirectProduct )
            	    {
            	    // InternalAlloyLanguage.g:2035:1: (lv_rightOperand_3_0= ruleALSDirectProduct )
            	    // InternalAlloyLanguage.g:2036:3: lv_rightOperand_3_0= ruleALSDirectProduct
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getALSIntersectionAccess().getRightOperandALSDirectProductParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_rightOperand_3_0=ruleALSDirectProduct();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getALSIntersectionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSDirectProduct");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // $ANTLR end "ruleALSIntersection"


    // $ANTLR start "entryRuleALSDirectProduct"
    // InternalAlloyLanguage.g:2060:1: entryRuleALSDirectProduct returns [EObject current=null] : iv_ruleALSDirectProduct= ruleALSDirectProduct EOF ;
    public final EObject entryRuleALSDirectProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSDirectProduct = null;


        try {
            // InternalAlloyLanguage.g:2061:2: (iv_ruleALSDirectProduct= ruleALSDirectProduct EOF )
            // InternalAlloyLanguage.g:2062:2: iv_ruleALSDirectProduct= ruleALSDirectProduct EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSDirectProductRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSDirectProduct=ruleALSDirectProduct();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSDirectProduct; 
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
    // $ANTLR end "entryRuleALSDirectProduct"


    // $ANTLR start "ruleALSDirectProduct"
    // InternalAlloyLanguage.g:2069:1: ruleALSDirectProduct returns [EObject current=null] : (this_ALSPreficed_0= ruleALSPreficed ( () ( (lv_leftMultiplicit_2_0= ruleALSMultiplicity ) )? otherlv_3= '->' ( (lv_rightMultiplicit_4_0= ruleALSMultiplicity ) )? ( (lv_rightOperand_5_0= ruleALSPreficed ) ) )? ) ;
    public final EObject ruleALSDirectProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_ALSPreficed_0 = null;

        Enumerator lv_leftMultiplicit_2_0 = null;

        Enumerator lv_rightMultiplicit_4_0 = null;

        EObject lv_rightOperand_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:2072:28: ( (this_ALSPreficed_0= ruleALSPreficed ( () ( (lv_leftMultiplicit_2_0= ruleALSMultiplicity ) )? otherlv_3= '->' ( (lv_rightMultiplicit_4_0= ruleALSMultiplicity ) )? ( (lv_rightOperand_5_0= ruleALSPreficed ) ) )? ) )
            // InternalAlloyLanguage.g:2073:1: (this_ALSPreficed_0= ruleALSPreficed ( () ( (lv_leftMultiplicit_2_0= ruleALSMultiplicity ) )? otherlv_3= '->' ( (lv_rightMultiplicit_4_0= ruleALSMultiplicity ) )? ( (lv_rightOperand_5_0= ruleALSPreficed ) ) )? )
            {
            // InternalAlloyLanguage.g:2073:1: (this_ALSPreficed_0= ruleALSPreficed ( () ( (lv_leftMultiplicit_2_0= ruleALSMultiplicity ) )? otherlv_3= '->' ( (lv_rightMultiplicit_4_0= ruleALSMultiplicity ) )? ( (lv_rightOperand_5_0= ruleALSPreficed ) ) )? )
            // InternalAlloyLanguage.g:2074:5: this_ALSPreficed_0= ruleALSPreficed ( () ( (lv_leftMultiplicit_2_0= ruleALSMultiplicity ) )? otherlv_3= '->' ( (lv_rightMultiplicit_4_0= ruleALSMultiplicity ) )? ( (lv_rightOperand_5_0= ruleALSPreficed ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getALSDirectProductAccess().getALSPreficedParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_32);
            this_ALSPreficed_0=ruleALSPreficed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ALSPreficed_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAlloyLanguage.g:2082:1: ( () ( (lv_leftMultiplicit_2_0= ruleALSMultiplicity ) )? otherlv_3= '->' ( (lv_rightMultiplicit_4_0= ruleALSMultiplicity ) )? ( (lv_rightOperand_5_0= ruleALSPreficed ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48||(LA37_0>=66 && LA37_0<=71)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAlloyLanguage.g:2082:2: () ( (lv_leftMultiplicit_2_0= ruleALSMultiplicity ) )? otherlv_3= '->' ( (lv_rightMultiplicit_4_0= ruleALSMultiplicity ) )? ( (lv_rightOperand_5_0= ruleALSPreficed ) )
                    {
                    // InternalAlloyLanguage.g:2082:2: ()
                    // InternalAlloyLanguage.g:2083:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getALSDirectProductAccess().getALSDirectProductLeftOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalAlloyLanguage.g:2088:2: ( (lv_leftMultiplicit_2_0= ruleALSMultiplicity ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=66 && LA35_0<=71)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalAlloyLanguage.g:2089:1: (lv_leftMultiplicit_2_0= ruleALSMultiplicity )
                            {
                            // InternalAlloyLanguage.g:2089:1: (lv_leftMultiplicit_2_0= ruleALSMultiplicity )
                            // InternalAlloyLanguage.g:2090:3: lv_leftMultiplicit_2_0= ruleALSMultiplicity
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getALSDirectProductAccess().getLeftMultiplicitALSMultiplicityEnumRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_33);
                            lv_leftMultiplicit_2_0=ruleALSMultiplicity();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getALSDirectProductRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"leftMultiplicit",
                                      		lv_leftMultiplicit_2_0, 
                                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSMultiplicity");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,48,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getALSDirectProductAccess().getHyphenMinusGreaterThanSignKeyword_1_2());
                          
                    }
                    // InternalAlloyLanguage.g:2110:1: ( (lv_rightMultiplicit_4_0= ruleALSMultiplicity ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>=66 && LA36_0<=71)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalAlloyLanguage.g:2111:1: (lv_rightMultiplicit_4_0= ruleALSMultiplicity )
                            {
                            // InternalAlloyLanguage.g:2111:1: (lv_rightMultiplicit_4_0= ruleALSMultiplicity )
                            // InternalAlloyLanguage.g:2112:3: lv_rightMultiplicit_4_0= ruleALSMultiplicity
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getALSDirectProductAccess().getRightMultiplicitALSMultiplicityEnumRuleCall_1_3_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_12);
                            lv_rightMultiplicit_4_0=ruleALSMultiplicity();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getALSDirectProductRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightMultiplicit",
                                      		lv_rightMultiplicit_4_0, 
                                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSMultiplicity");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalAlloyLanguage.g:2128:3: ( (lv_rightOperand_5_0= ruleALSPreficed ) )
                    // InternalAlloyLanguage.g:2129:1: (lv_rightOperand_5_0= ruleALSPreficed )
                    {
                    // InternalAlloyLanguage.g:2129:1: (lv_rightOperand_5_0= ruleALSPreficed )
                    // InternalAlloyLanguage.g:2130:3: lv_rightOperand_5_0= ruleALSPreficed
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSDirectProductAccess().getRightOperandALSPreficedParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_rightOperand_5_0=ruleALSPreficed();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSDirectProductRule());
                      	        }
                             		set(
                             			current, 
                             			"rightOperand",
                              		lv_rightOperand_5_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSPreficed");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleALSDirectProduct"


    // $ANTLR start "entryRuleALSPreficed"
    // InternalAlloyLanguage.g:2154:1: entryRuleALSPreficed returns [EObject current=null] : iv_ruleALSPreficed= ruleALSPreficed EOF ;
    public final EObject entryRuleALSPreficed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSPreficed = null;


        try {
            // InternalAlloyLanguage.g:2155:2: (iv_ruleALSPreficed= ruleALSPreficed EOF )
            // InternalAlloyLanguage.g:2156:2: iv_ruleALSPreficed= ruleALSPreficed EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSPreficedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSPreficed=ruleALSPreficed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSPreficed; 
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
    // $ANTLR end "entryRuleALSPreficed"


    // $ANTLR start "ruleALSPreficed"
    // InternalAlloyLanguage.g:2163:1: ruleALSPreficed returns [EObject current=null] : ( ( () ( ( ( '!' | 'not' ) )=> (otherlv_1= '!' | otherlv_2= 'not' ) ) ( (lv_operand_3_0= ruleALSBasicRelationTerm ) ) ) | ( () ( ( '~' )=>otherlv_5= '~' ) ( (lv_operand_6_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_8= '^' ( (lv_operand_9_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_11= '*' ( (lv_operand_12_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_14= '#' ( (lv_operand_15_0= ruleALSBasicRelationTerm ) ) ) | ( () ( ( '-' )=>otherlv_17= '-' ) ( (lv_operand_18_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_20= 'sum' ( (lv_variables_21_0= ruleALSVariableDeclaration ) ) (otherlv_22= ',' ( (lv_variables_23_0= ruleALSVariableDeclaration ) ) )* otherlv_24= '{' ( (lv_expression_25_0= ruleALSTerm ) ) otherlv_26= '}' ) | ( () ( ( (otherlv_28= RULE_ID ) ) | ( (lv_referredNumericOperator_29_0= ruleALSNumericOperator ) ) ) otherlv_30= '[' ( (lv_params_31_0= ruleALSTerm ) ) (otherlv_32= ',' ( (lv_params_33_0= ruleALSTerm ) ) )* otherlv_34= ']' ) | this_ALSBasicRelationTerm_35= ruleALSBasicRelationTerm ) ;
    public final EObject ruleALSPreficed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        EObject lv_operand_3_0 = null;

        EObject lv_operand_6_0 = null;

        EObject lv_operand_9_0 = null;

        EObject lv_operand_12_0 = null;

        EObject lv_operand_15_0 = null;

        EObject lv_operand_18_0 = null;

        EObject lv_variables_21_0 = null;

        EObject lv_variables_23_0 = null;

        EObject lv_expression_25_0 = null;

        Enumerator lv_referredNumericOperator_29_0 = null;

        EObject lv_params_31_0 = null;

        EObject lv_params_33_0 = null;

        EObject this_ALSBasicRelationTerm_35 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:2166:28: ( ( ( () ( ( ( '!' | 'not' ) )=> (otherlv_1= '!' | otherlv_2= 'not' ) ) ( (lv_operand_3_0= ruleALSBasicRelationTerm ) ) ) | ( () ( ( '~' )=>otherlv_5= '~' ) ( (lv_operand_6_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_8= '^' ( (lv_operand_9_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_11= '*' ( (lv_operand_12_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_14= '#' ( (lv_operand_15_0= ruleALSBasicRelationTerm ) ) ) | ( () ( ( '-' )=>otherlv_17= '-' ) ( (lv_operand_18_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_20= 'sum' ( (lv_variables_21_0= ruleALSVariableDeclaration ) ) (otherlv_22= ',' ( (lv_variables_23_0= ruleALSVariableDeclaration ) ) )* otherlv_24= '{' ( (lv_expression_25_0= ruleALSTerm ) ) otherlv_26= '}' ) | ( () ( ( (otherlv_28= RULE_ID ) ) | ( (lv_referredNumericOperator_29_0= ruleALSNumericOperator ) ) ) otherlv_30= '[' ( (lv_params_31_0= ruleALSTerm ) ) (otherlv_32= ',' ( (lv_params_33_0= ruleALSTerm ) ) )* otherlv_34= ']' ) | this_ALSBasicRelationTerm_35= ruleALSBasicRelationTerm ) )
            // InternalAlloyLanguage.g:2167:1: ( ( () ( ( ( '!' | 'not' ) )=> (otherlv_1= '!' | otherlv_2= 'not' ) ) ( (lv_operand_3_0= ruleALSBasicRelationTerm ) ) ) | ( () ( ( '~' )=>otherlv_5= '~' ) ( (lv_operand_6_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_8= '^' ( (lv_operand_9_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_11= '*' ( (lv_operand_12_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_14= '#' ( (lv_operand_15_0= ruleALSBasicRelationTerm ) ) ) | ( () ( ( '-' )=>otherlv_17= '-' ) ( (lv_operand_18_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_20= 'sum' ( (lv_variables_21_0= ruleALSVariableDeclaration ) ) (otherlv_22= ',' ( (lv_variables_23_0= ruleALSVariableDeclaration ) ) )* otherlv_24= '{' ( (lv_expression_25_0= ruleALSTerm ) ) otherlv_26= '}' ) | ( () ( ( (otherlv_28= RULE_ID ) ) | ( (lv_referredNumericOperator_29_0= ruleALSNumericOperator ) ) ) otherlv_30= '[' ( (lv_params_31_0= ruleALSTerm ) ) (otherlv_32= ',' ( (lv_params_33_0= ruleALSTerm ) ) )* otherlv_34= ']' ) | this_ALSBasicRelationTerm_35= ruleALSBasicRelationTerm )
            {
            // InternalAlloyLanguage.g:2167:1: ( ( () ( ( ( '!' | 'not' ) )=> (otherlv_1= '!' | otherlv_2= 'not' ) ) ( (lv_operand_3_0= ruleALSBasicRelationTerm ) ) ) | ( () ( ( '~' )=>otherlv_5= '~' ) ( (lv_operand_6_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_8= '^' ( (lv_operand_9_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_11= '*' ( (lv_operand_12_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_14= '#' ( (lv_operand_15_0= ruleALSBasicRelationTerm ) ) ) | ( () ( ( '-' )=>otherlv_17= '-' ) ( (lv_operand_18_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_20= 'sum' ( (lv_variables_21_0= ruleALSVariableDeclaration ) ) (otherlv_22= ',' ( (lv_variables_23_0= ruleALSVariableDeclaration ) ) )* otherlv_24= '{' ( (lv_expression_25_0= ruleALSTerm ) ) otherlv_26= '}' ) | ( () ( ( (otherlv_28= RULE_ID ) ) | ( (lv_referredNumericOperator_29_0= ruleALSNumericOperator ) ) ) otherlv_30= '[' ( (lv_params_31_0= ruleALSTerm ) ) (otherlv_32= ',' ( (lv_params_33_0= ruleALSTerm ) ) )* otherlv_34= ']' ) | this_ALSBasicRelationTerm_35= ruleALSBasicRelationTerm )
            int alt42=9;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalAlloyLanguage.g:2167:2: ( () ( ( ( '!' | 'not' ) )=> (otherlv_1= '!' | otherlv_2= 'not' ) ) ( (lv_operand_3_0= ruleALSBasicRelationTerm ) ) )
                    {
                    // InternalAlloyLanguage.g:2167:2: ( () ( ( ( '!' | 'not' ) )=> (otherlv_1= '!' | otherlv_2= 'not' ) ) ( (lv_operand_3_0= ruleALSBasicRelationTerm ) ) )
                    // InternalAlloyLanguage.g:2167:3: () ( ( ( '!' | 'not' ) )=> (otherlv_1= '!' | otherlv_2= 'not' ) ) ( (lv_operand_3_0= ruleALSBasicRelationTerm ) )
                    {
                    // InternalAlloyLanguage.g:2167:3: ()
                    // InternalAlloyLanguage.g:2168:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getALSPreficedAccess().getALSNotAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalAlloyLanguage.g:2173:2: ( ( ( '!' | 'not' ) )=> (otherlv_1= '!' | otherlv_2= 'not' ) )
                    // InternalAlloyLanguage.g:2173:3: ( ( '!' | 'not' ) )=> (otherlv_1= '!' | otherlv_2= 'not' )
                    {
                    // InternalAlloyLanguage.g:2176:5: (otherlv_1= '!' | otherlv_2= 'not' )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==49) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==50) ) {
                        alt38=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalAlloyLanguage.g:2176:7: otherlv_1= '!'
                            {
                            otherlv_1=(Token)match(input,49,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getALSPreficedAccess().getExclamationMarkKeyword_0_1_0_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalAlloyLanguage.g:2181:7: otherlv_2= 'not'
                            {
                            otherlv_2=(Token)match(input,50,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getALSPreficedAccess().getNotKeyword_0_1_0_1());
                                  
                            }

                            }
                            break;

                    }


                    }

                    // InternalAlloyLanguage.g:2185:3: ( (lv_operand_3_0= ruleALSBasicRelationTerm ) )
                    // InternalAlloyLanguage.g:2186:1: (lv_operand_3_0= ruleALSBasicRelationTerm )
                    {
                    // InternalAlloyLanguage.g:2186:1: (lv_operand_3_0= ruleALSBasicRelationTerm )
                    // InternalAlloyLanguage.g:2187:3: lv_operand_3_0= ruleALSBasicRelationTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_3_0=ruleALSBasicRelationTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSPreficedRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_3_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSBasicRelationTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:2204:6: ( () ( ( '~' )=>otherlv_5= '~' ) ( (lv_operand_6_0= ruleALSBasicRelationTerm ) ) )
                    {
                    // InternalAlloyLanguage.g:2204:6: ( () ( ( '~' )=>otherlv_5= '~' ) ( (lv_operand_6_0= ruleALSBasicRelationTerm ) ) )
                    // InternalAlloyLanguage.g:2204:7: () ( ( '~' )=>otherlv_5= '~' ) ( (lv_operand_6_0= ruleALSBasicRelationTerm ) )
                    {
                    // InternalAlloyLanguage.g:2204:7: ()
                    // InternalAlloyLanguage.g:2205:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getALSPreficedAccess().getALSInverseRelationAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalAlloyLanguage.g:2210:2: ( ( '~' )=>otherlv_5= '~' )
                    // InternalAlloyLanguage.g:2210:3: ( '~' )=>otherlv_5= '~'
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getALSPreficedAccess().getTildeKeyword_1_1());
                          
                    }

                    }

                    // InternalAlloyLanguage.g:2215:2: ( (lv_operand_6_0= ruleALSBasicRelationTerm ) )
                    // InternalAlloyLanguage.g:2216:1: (lv_operand_6_0= ruleALSBasicRelationTerm )
                    {
                    // InternalAlloyLanguage.g:2216:1: (lv_operand_6_0= ruleALSBasicRelationTerm )
                    // InternalAlloyLanguage.g:2217:3: lv_operand_6_0= ruleALSBasicRelationTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_6_0=ruleALSBasicRelationTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSPreficedRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_6_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSBasicRelationTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlloyLanguage.g:2234:6: ( () otherlv_8= '^' ( (lv_operand_9_0= ruleALSBasicRelationTerm ) ) )
                    {
                    // InternalAlloyLanguage.g:2234:6: ( () otherlv_8= '^' ( (lv_operand_9_0= ruleALSBasicRelationTerm ) ) )
                    // InternalAlloyLanguage.g:2234:7: () otherlv_8= '^' ( (lv_operand_9_0= ruleALSBasicRelationTerm ) )
                    {
                    // InternalAlloyLanguage.g:2234:7: ()
                    // InternalAlloyLanguage.g:2235:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getALSPreficedAccess().getAlSTransitiveClosureAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_8=(Token)match(input,52,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getALSPreficedAccess().getCircumflexAccentKeyword_2_1());
                          
                    }
                    // InternalAlloyLanguage.g:2244:1: ( (lv_operand_9_0= ruleALSBasicRelationTerm ) )
                    // InternalAlloyLanguage.g:2245:1: (lv_operand_9_0= ruleALSBasicRelationTerm )
                    {
                    // InternalAlloyLanguage.g:2245:1: (lv_operand_9_0= ruleALSBasicRelationTerm )
                    // InternalAlloyLanguage.g:2246:3: lv_operand_9_0= ruleALSBasicRelationTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_9_0=ruleALSBasicRelationTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSPreficedRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_9_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSBasicRelationTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAlloyLanguage.g:2263:6: ( () otherlv_11= '*' ( (lv_operand_12_0= ruleALSBasicRelationTerm ) ) )
                    {
                    // InternalAlloyLanguage.g:2263:6: ( () otherlv_11= '*' ( (lv_operand_12_0= ruleALSBasicRelationTerm ) ) )
                    // InternalAlloyLanguage.g:2263:7: () otherlv_11= '*' ( (lv_operand_12_0= ruleALSBasicRelationTerm ) )
                    {
                    // InternalAlloyLanguage.g:2263:7: ()
                    // InternalAlloyLanguage.g:2264:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getALSPreficedAccess().getALSReflectiveTransitiveClosureAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_11=(Token)match(input,53,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getALSPreficedAccess().getAsteriskKeyword_3_1());
                          
                    }
                    // InternalAlloyLanguage.g:2273:1: ( (lv_operand_12_0= ruleALSBasicRelationTerm ) )
                    // InternalAlloyLanguage.g:2274:1: (lv_operand_12_0= ruleALSBasicRelationTerm )
                    {
                    // InternalAlloyLanguage.g:2274:1: (lv_operand_12_0= ruleALSBasicRelationTerm )
                    // InternalAlloyLanguage.g:2275:3: lv_operand_12_0= ruleALSBasicRelationTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_12_0=ruleALSBasicRelationTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSPreficedRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_12_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSBasicRelationTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAlloyLanguage.g:2292:6: ( () otherlv_14= '#' ( (lv_operand_15_0= ruleALSBasicRelationTerm ) ) )
                    {
                    // InternalAlloyLanguage.g:2292:6: ( () otherlv_14= '#' ( (lv_operand_15_0= ruleALSBasicRelationTerm ) ) )
                    // InternalAlloyLanguage.g:2292:7: () otherlv_14= '#' ( (lv_operand_15_0= ruleALSBasicRelationTerm ) )
                    {
                    // InternalAlloyLanguage.g:2292:7: ()
                    // InternalAlloyLanguage.g:2293:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getALSPreficedAccess().getALSCardinalityAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_14=(Token)match(input,54,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getALSPreficedAccess().getNumberSignKeyword_4_1());
                          
                    }
                    // InternalAlloyLanguage.g:2302:1: ( (lv_operand_15_0= ruleALSBasicRelationTerm ) )
                    // InternalAlloyLanguage.g:2303:1: (lv_operand_15_0= ruleALSBasicRelationTerm )
                    {
                    // InternalAlloyLanguage.g:2303:1: (lv_operand_15_0= ruleALSBasicRelationTerm )
                    // InternalAlloyLanguage.g:2304:3: lv_operand_15_0= ruleALSBasicRelationTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_15_0=ruleALSBasicRelationTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSPreficedRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_15_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSBasicRelationTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAlloyLanguage.g:2321:6: ( () ( ( '-' )=>otherlv_17= '-' ) ( (lv_operand_18_0= ruleALSBasicRelationTerm ) ) )
                    {
                    // InternalAlloyLanguage.g:2321:6: ( () ( ( '-' )=>otherlv_17= '-' ) ( (lv_operand_18_0= ruleALSBasicRelationTerm ) ) )
                    // InternalAlloyLanguage.g:2321:7: () ( ( '-' )=>otherlv_17= '-' ) ( (lv_operand_18_0= ruleALSBasicRelationTerm ) )
                    {
                    // InternalAlloyLanguage.g:2321:7: ()
                    // InternalAlloyLanguage.g:2322:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getALSPreficedAccess().getALSUnaryMinusAction_5_0(),
                                  current);
                          
                    }

                    }

                    // InternalAlloyLanguage.g:2327:2: ( ( '-' )=>otherlv_17= '-' )
                    // InternalAlloyLanguage.g:2327:3: ( '-' )=>otherlv_17= '-'
                    {
                    otherlv_17=(Token)match(input,46,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getALSPreficedAccess().getHyphenMinusKeyword_5_1());
                          
                    }

                    }

                    // InternalAlloyLanguage.g:2332:2: ( (lv_operand_18_0= ruleALSBasicRelationTerm ) )
                    // InternalAlloyLanguage.g:2333:1: (lv_operand_18_0= ruleALSBasicRelationTerm )
                    {
                    // InternalAlloyLanguage.g:2333:1: (lv_operand_18_0= ruleALSBasicRelationTerm )
                    // InternalAlloyLanguage.g:2334:3: lv_operand_18_0= ruleALSBasicRelationTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSPreficedAccess().getOperandALSBasicRelationTermParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_18_0=ruleALSBasicRelationTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSPreficedRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_18_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSBasicRelationTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalAlloyLanguage.g:2351:6: ( () otherlv_20= 'sum' ( (lv_variables_21_0= ruleALSVariableDeclaration ) ) (otherlv_22= ',' ( (lv_variables_23_0= ruleALSVariableDeclaration ) ) )* otherlv_24= '{' ( (lv_expression_25_0= ruleALSTerm ) ) otherlv_26= '}' )
                    {
                    // InternalAlloyLanguage.g:2351:6: ( () otherlv_20= 'sum' ( (lv_variables_21_0= ruleALSVariableDeclaration ) ) (otherlv_22= ',' ( (lv_variables_23_0= ruleALSVariableDeclaration ) ) )* otherlv_24= '{' ( (lv_expression_25_0= ruleALSTerm ) ) otherlv_26= '}' )
                    // InternalAlloyLanguage.g:2351:7: () otherlv_20= 'sum' ( (lv_variables_21_0= ruleALSVariableDeclaration ) ) (otherlv_22= ',' ( (lv_variables_23_0= ruleALSVariableDeclaration ) ) )* otherlv_24= '{' ( (lv_expression_25_0= ruleALSTerm ) ) otherlv_26= '}'
                    {
                    // InternalAlloyLanguage.g:2351:7: ()
                    // InternalAlloyLanguage.g:2352:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getALSPreficedAccess().getALSSumAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_20=(Token)match(input,55,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getALSPreficedAccess().getSumKeyword_6_1());
                          
                    }
                    // InternalAlloyLanguage.g:2361:1: ( (lv_variables_21_0= ruleALSVariableDeclaration ) )
                    // InternalAlloyLanguage.g:2362:1: (lv_variables_21_0= ruleALSVariableDeclaration )
                    {
                    // InternalAlloyLanguage.g:2362:1: (lv_variables_21_0= ruleALSVariableDeclaration )
                    // InternalAlloyLanguage.g:2363:3: lv_variables_21_0= ruleALSVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSPreficedAccess().getVariablesALSVariableDeclarationParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_18);
                    lv_variables_21_0=ruleALSVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSPreficedRule());
                      	        }
                             		add(
                             			current, 
                             			"variables",
                              		lv_variables_21_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSVariableDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAlloyLanguage.g:2379:2: (otherlv_22= ',' ( (lv_variables_23_0= ruleALSVariableDeclaration ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==13) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalAlloyLanguage.g:2379:4: otherlv_22= ',' ( (lv_variables_23_0= ruleALSVariableDeclaration ) )
                    	    {
                    	    otherlv_22=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_22, grammarAccess.getALSPreficedAccess().getCommaKeyword_6_3_0());
                    	          
                    	    }
                    	    // InternalAlloyLanguage.g:2383:1: ( (lv_variables_23_0= ruleALSVariableDeclaration ) )
                    	    // InternalAlloyLanguage.g:2384:1: (lv_variables_23_0= ruleALSVariableDeclaration )
                    	    {
                    	    // InternalAlloyLanguage.g:2384:1: (lv_variables_23_0= ruleALSVariableDeclaration )
                    	    // InternalAlloyLanguage.g:2385:3: lv_variables_23_0= ruleALSVariableDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getALSPreficedAccess().getVariablesALSVariableDeclarationParserRuleCall_6_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_variables_23_0=ruleALSVariableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getALSPreficedRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"variables",
                    	              		lv_variables_23_0, 
                    	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSVariableDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,12,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getALSPreficedAccess().getLeftCurlyBracketKeyword_6_4());
                          
                    }
                    // InternalAlloyLanguage.g:2405:1: ( (lv_expression_25_0= ruleALSTerm ) )
                    // InternalAlloyLanguage.g:2406:1: (lv_expression_25_0= ruleALSTerm )
                    {
                    // InternalAlloyLanguage.g:2406:1: (lv_expression_25_0= ruleALSTerm )
                    // InternalAlloyLanguage.g:2407:3: lv_expression_25_0= ruleALSTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSPreficedAccess().getExpressionALSTermParserRuleCall_6_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_15);
                    lv_expression_25_0=ruleALSTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSPreficedRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_25_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_26=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getALSPreficedAccess().getRightCurlyBracketKeyword_6_6());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalAlloyLanguage.g:2428:6: ( () ( ( (otherlv_28= RULE_ID ) ) | ( (lv_referredNumericOperator_29_0= ruleALSNumericOperator ) ) ) otherlv_30= '[' ( (lv_params_31_0= ruleALSTerm ) ) (otherlv_32= ',' ( (lv_params_33_0= ruleALSTerm ) ) )* otherlv_34= ']' )
                    {
                    // InternalAlloyLanguage.g:2428:6: ( () ( ( (otherlv_28= RULE_ID ) ) | ( (lv_referredNumericOperator_29_0= ruleALSNumericOperator ) ) ) otherlv_30= '[' ( (lv_params_31_0= ruleALSTerm ) ) (otherlv_32= ',' ( (lv_params_33_0= ruleALSTerm ) ) )* otherlv_34= ']' )
                    // InternalAlloyLanguage.g:2428:7: () ( ( (otherlv_28= RULE_ID ) ) | ( (lv_referredNumericOperator_29_0= ruleALSNumericOperator ) ) ) otherlv_30= '[' ( (lv_params_31_0= ruleALSTerm ) ) (otherlv_32= ',' ( (lv_params_33_0= ruleALSTerm ) ) )* otherlv_34= ']'
                    {
                    // InternalAlloyLanguage.g:2428:7: ()
                    // InternalAlloyLanguage.g:2429:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getALSPreficedAccess().getALSFunctionCallAction_7_0(),
                                  current);
                          
                    }

                    }

                    // InternalAlloyLanguage.g:2434:2: ( ( (otherlv_28= RULE_ID ) ) | ( (lv_referredNumericOperator_29_0= ruleALSNumericOperator ) ) )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID) ) {
                        alt40=1;
                    }
                    else if ( ((LA40_0>=72 && LA40_0<=76)) ) {
                        alt40=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalAlloyLanguage.g:2434:3: ( (otherlv_28= RULE_ID ) )
                            {
                            // InternalAlloyLanguage.g:2434:3: ( (otherlv_28= RULE_ID ) )
                            // InternalAlloyLanguage.g:2435:1: (otherlv_28= RULE_ID )
                            {
                            // InternalAlloyLanguage.g:2435:1: (otherlv_28= RULE_ID )
                            // InternalAlloyLanguage.g:2436:3: otherlv_28= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getALSPreficedRule());
                              	        }
                                      
                            }
                            otherlv_28=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_28, grammarAccess.getALSPreficedAccess().getReferredDefinitionALSDefinitionCrossReference_7_1_0_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlloyLanguage.g:2448:6: ( (lv_referredNumericOperator_29_0= ruleALSNumericOperator ) )
                            {
                            // InternalAlloyLanguage.g:2448:6: ( (lv_referredNumericOperator_29_0= ruleALSNumericOperator ) )
                            // InternalAlloyLanguage.g:2449:1: (lv_referredNumericOperator_29_0= ruleALSNumericOperator )
                            {
                            // InternalAlloyLanguage.g:2449:1: (lv_referredNumericOperator_29_0= ruleALSNumericOperator )
                            // InternalAlloyLanguage.g:2450:3: lv_referredNumericOperator_29_0= ruleALSNumericOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getALSPreficedAccess().getReferredNumericOperatorALSNumericOperatorEnumRuleCall_7_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_13);
                            lv_referredNumericOperator_29_0=ruleALSNumericOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getALSPreficedRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"referredNumericOperator",
                                      		lv_referredNumericOperator_29_0, 
                                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSNumericOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_30=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getALSPreficedAccess().getLeftSquareBracketKeyword_7_2());
                          
                    }
                    // InternalAlloyLanguage.g:2470:1: ( (lv_params_31_0= ruleALSTerm ) )
                    // InternalAlloyLanguage.g:2471:1: (lv_params_31_0= ruleALSTerm )
                    {
                    // InternalAlloyLanguage.g:2471:1: (lv_params_31_0= ruleALSTerm )
                    // InternalAlloyLanguage.g:2472:3: lv_params_31_0= ruleALSTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSPreficedAccess().getParamsALSTermParserRuleCall_7_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_14);
                    lv_params_31_0=ruleALSTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSPreficedRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_31_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAlloyLanguage.g:2488:2: (otherlv_32= ',' ( (lv_params_33_0= ruleALSTerm ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==13) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalAlloyLanguage.g:2488:4: otherlv_32= ',' ( (lv_params_33_0= ruleALSTerm ) )
                    	    {
                    	    otherlv_32=(Token)match(input,13,FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_32, grammarAccess.getALSPreficedAccess().getCommaKeyword_7_4_0());
                    	          
                    	    }
                    	    // InternalAlloyLanguage.g:2492:1: ( (lv_params_33_0= ruleALSTerm ) )
                    	    // InternalAlloyLanguage.g:2493:1: (lv_params_33_0= ruleALSTerm )
                    	    {
                    	    // InternalAlloyLanguage.g:2493:1: (lv_params_33_0= ruleALSTerm )
                    	    // InternalAlloyLanguage.g:2494:3: lv_params_33_0= ruleALSTerm
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getALSPreficedAccess().getParamsALSTermParserRuleCall_7_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_params_33_0=ruleALSTerm();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getALSPreficedRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_33_0, 
                    	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSTerm");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_34, grammarAccess.getALSPreficedAccess().getRightSquareBracketKeyword_7_5());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalAlloyLanguage.g:2516:5: this_ALSBasicRelationTerm_35= ruleALSBasicRelationTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getALSPreficedAccess().getALSBasicRelationTermParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ALSBasicRelationTerm_35=ruleALSBasicRelationTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ALSBasicRelationTerm_35; 
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
    // $ANTLR end "ruleALSPreficed"


    // $ANTLR start "entryRuleALSVariableDeclaration"
    // InternalAlloyLanguage.g:2532:1: entryRuleALSVariableDeclaration returns [EObject current=null] : iv_ruleALSVariableDeclaration= ruleALSVariableDeclaration EOF ;
    public final EObject entryRuleALSVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSVariableDeclaration = null;


        try {
            // InternalAlloyLanguage.g:2533:2: (iv_ruleALSVariableDeclaration= ruleALSVariableDeclaration EOF )
            // InternalAlloyLanguage.g:2534:2: iv_ruleALSVariableDeclaration= ruleALSVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSVariableDeclaration=ruleALSVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSVariableDeclaration; 
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
    // $ANTLR end "entryRuleALSVariableDeclaration"


    // $ANTLR start "ruleALSVariableDeclaration"
    // InternalAlloyLanguage.g:2541:1: ruleALSVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= ruleALSID ) ) otherlv_1= ':' ( (lv_range_2_0= ruleALSTerm ) ) ) ;
    public final EObject ruleALSVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_range_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:2544:28: ( ( ( (lv_name_0_0= ruleALSID ) ) otherlv_1= ':' ( (lv_range_2_0= ruleALSTerm ) ) ) )
            // InternalAlloyLanguage.g:2545:1: ( ( (lv_name_0_0= ruleALSID ) ) otherlv_1= ':' ( (lv_range_2_0= ruleALSTerm ) ) )
            {
            // InternalAlloyLanguage.g:2545:1: ( ( (lv_name_0_0= ruleALSID ) ) otherlv_1= ':' ( (lv_range_2_0= ruleALSTerm ) ) )
            // InternalAlloyLanguage.g:2545:2: ( (lv_name_0_0= ruleALSID ) ) otherlv_1= ':' ( (lv_range_2_0= ruleALSTerm ) )
            {
            // InternalAlloyLanguage.g:2545:2: ( (lv_name_0_0= ruleALSID ) )
            // InternalAlloyLanguage.g:2546:1: (lv_name_0_0= ruleALSID )
            {
            // InternalAlloyLanguage.g:2546:1: (lv_name_0_0= ruleALSID )
            // InternalAlloyLanguage.g:2547:3: lv_name_0_0= ruleALSID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSVariableDeclarationAccess().getNameALSIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_11);
            lv_name_0_0=ruleALSID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getALSVariableDeclarationAccess().getColonKeyword_1());
                  
            }
            // InternalAlloyLanguage.g:2567:1: ( (lv_range_2_0= ruleALSTerm ) )
            // InternalAlloyLanguage.g:2568:1: (lv_range_2_0= ruleALSTerm )
            {
            // InternalAlloyLanguage.g:2568:1: (lv_range_2_0= ruleALSTerm )
            // InternalAlloyLanguage.g:2569:3: lv_range_2_0= ruleALSTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getALSVariableDeclarationAccess().getRangeALSTermParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_range_2_0=ruleALSTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getALSVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"range",
                      		lv_range_2_0, 
                      		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSTerm");
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
    // $ANTLR end "ruleALSVariableDeclaration"


    // $ANTLR start "entryRuleALSBasicRelationTerm"
    // InternalAlloyLanguage.g:2593:1: entryRuleALSBasicRelationTerm returns [EObject current=null] : iv_ruleALSBasicRelationTerm= ruleALSBasicRelationTerm EOF ;
    public final EObject entryRuleALSBasicRelationTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSBasicRelationTerm = null;


        try {
            // InternalAlloyLanguage.g:2594:2: (iv_ruleALSBasicRelationTerm= ruleALSBasicRelationTerm EOF )
            // InternalAlloyLanguage.g:2595:2: iv_ruleALSBasicRelationTerm= ruleALSBasicRelationTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSBasicRelationTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSBasicRelationTerm=ruleALSBasicRelationTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSBasicRelationTerm; 
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
    // $ANTLR end "entryRuleALSBasicRelationTerm"


    // $ANTLR start "ruleALSBasicRelationTerm"
    // InternalAlloyLanguage.g:2602:1: ruleALSBasicRelationTerm returns [EObject current=null] : ( ( () otherlv_1= 'none' ) | ( () otherlv_3= 'iden' ) | ( () otherlv_5= 'univ' ) | ( () otherlv_7= 'Int' ) | ( () otherlv_9= 'String' ) | ( () ( (otherlv_11= RULE_ID ) ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) | (otherlv_16= '(' this_ALSTerm_17= ruleALSTerm otherlv_18= ')' ) ) ;
    public final EObject ruleALSBasicRelationTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_value_13_0=null;
        Token lv_value_15_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject this_ALSTerm_17 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:2605:28: ( ( ( () otherlv_1= 'none' ) | ( () otherlv_3= 'iden' ) | ( () otherlv_5= 'univ' ) | ( () otherlv_7= 'Int' ) | ( () otherlv_9= 'String' ) | ( () ( (otherlv_11= RULE_ID ) ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) | (otherlv_16= '(' this_ALSTerm_17= ruleALSTerm otherlv_18= ')' ) ) )
            // InternalAlloyLanguage.g:2606:1: ( ( () otherlv_1= 'none' ) | ( () otherlv_3= 'iden' ) | ( () otherlv_5= 'univ' ) | ( () otherlv_7= 'Int' ) | ( () otherlv_9= 'String' ) | ( () ( (otherlv_11= RULE_ID ) ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) | (otherlv_16= '(' this_ALSTerm_17= ruleALSTerm otherlv_18= ')' ) )
            {
            // InternalAlloyLanguage.g:2606:1: ( ( () otherlv_1= 'none' ) | ( () otherlv_3= 'iden' ) | ( () otherlv_5= 'univ' ) | ( () otherlv_7= 'Int' ) | ( () otherlv_9= 'String' ) | ( () ( (otherlv_11= RULE_ID ) ) ) | ( () ( (lv_value_13_0= RULE_INT ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) | (otherlv_16= '(' this_ALSTerm_17= ruleALSTerm otherlv_18= ')' ) )
            int alt43=9;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt43=1;
                }
                break;
            case 57:
                {
                alt43=2;
                }
                break;
            case 58:
                {
                alt43=3;
                }
                break;
            case 59:
                {
                alt43=4;
                }
                break;
            case 60:
                {
                alt43=5;
                }
                break;
            case RULE_ID:
                {
                alt43=6;
                }
                break;
            case RULE_INT:
                {
                alt43=7;
                }
                break;
            case RULE_STRING:
                {
                alt43=8;
                }
                break;
            case 61:
                {
                alt43=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalAlloyLanguage.g:2606:2: ( () otherlv_1= 'none' )
                    {
                    // InternalAlloyLanguage.g:2606:2: ( () otherlv_1= 'none' )
                    // InternalAlloyLanguage.g:2606:3: () otherlv_1= 'none'
                    {
                    // InternalAlloyLanguage.g:2606:3: ()
                    // InternalAlloyLanguage.g:2607:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getALSBasicRelationTermAccess().getALSNoneAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getALSBasicRelationTermAccess().getNoneKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:2617:6: ( () otherlv_3= 'iden' )
                    {
                    // InternalAlloyLanguage.g:2617:6: ( () otherlv_3= 'iden' )
                    // InternalAlloyLanguage.g:2617:7: () otherlv_3= 'iden'
                    {
                    // InternalAlloyLanguage.g:2617:7: ()
                    // InternalAlloyLanguage.g:2618:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getALSBasicRelationTermAccess().getALSIdenAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getALSBasicRelationTermAccess().getIdenKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAlloyLanguage.g:2628:6: ( () otherlv_5= 'univ' )
                    {
                    // InternalAlloyLanguage.g:2628:6: ( () otherlv_5= 'univ' )
                    // InternalAlloyLanguage.g:2628:7: () otherlv_5= 'univ'
                    {
                    // InternalAlloyLanguage.g:2628:7: ()
                    // InternalAlloyLanguage.g:2629:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getALSBasicRelationTermAccess().getALSUnivAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_5=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getALSBasicRelationTermAccess().getUnivKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAlloyLanguage.g:2639:6: ( () otherlv_7= 'Int' )
                    {
                    // InternalAlloyLanguage.g:2639:6: ( () otherlv_7= 'Int' )
                    // InternalAlloyLanguage.g:2639:7: () otherlv_7= 'Int'
                    {
                    // InternalAlloyLanguage.g:2639:7: ()
                    // InternalAlloyLanguage.g:2640:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getALSBasicRelationTermAccess().getALSIntAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getALSBasicRelationTermAccess().getIntKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAlloyLanguage.g:2650:6: ( () otherlv_9= 'String' )
                    {
                    // InternalAlloyLanguage.g:2650:6: ( () otherlv_9= 'String' )
                    // InternalAlloyLanguage.g:2650:7: () otherlv_9= 'String'
                    {
                    // InternalAlloyLanguage.g:2650:7: ()
                    // InternalAlloyLanguage.g:2651:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getALSBasicRelationTermAccess().getALSStringAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getALSBasicRelationTermAccess().getStringKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAlloyLanguage.g:2661:6: ( () ( (otherlv_11= RULE_ID ) ) )
                    {
                    // InternalAlloyLanguage.g:2661:6: ( () ( (otherlv_11= RULE_ID ) ) )
                    // InternalAlloyLanguage.g:2661:7: () ( (otherlv_11= RULE_ID ) )
                    {
                    // InternalAlloyLanguage.g:2661:7: ()
                    // InternalAlloyLanguage.g:2662:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getALSBasicRelationTermAccess().getALSReferenceAction_5_0(),
                                  current);
                          
                    }

                    }

                    // InternalAlloyLanguage.g:2667:2: ( (otherlv_11= RULE_ID ) )
                    // InternalAlloyLanguage.g:2668:1: (otherlv_11= RULE_ID )
                    {
                    // InternalAlloyLanguage.g:2668:1: (otherlv_11= RULE_ID )
                    // InternalAlloyLanguage.g:2669:3: otherlv_11= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getALSBasicRelationTermRule());
                      	        }
                              
                    }
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_11, grammarAccess.getALSBasicRelationTermAccess().getReferredALSRelationDeclarationCrossReference_5_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalAlloyLanguage.g:2681:6: ( () ( (lv_value_13_0= RULE_INT ) ) )
                    {
                    // InternalAlloyLanguage.g:2681:6: ( () ( (lv_value_13_0= RULE_INT ) ) )
                    // InternalAlloyLanguage.g:2681:7: () ( (lv_value_13_0= RULE_INT ) )
                    {
                    // InternalAlloyLanguage.g:2681:7: ()
                    // InternalAlloyLanguage.g:2682:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getALSBasicRelationTermAccess().getALSNumberLiteralAction_6_0(),
                                  current);
                          
                    }

                    }

                    // InternalAlloyLanguage.g:2687:2: ( (lv_value_13_0= RULE_INT ) )
                    // InternalAlloyLanguage.g:2688:1: (lv_value_13_0= RULE_INT )
                    {
                    // InternalAlloyLanguage.g:2688:1: (lv_value_13_0= RULE_INT )
                    // InternalAlloyLanguage.g:2689:3: lv_value_13_0= RULE_INT
                    {
                    lv_value_13_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_13_0, grammarAccess.getALSBasicRelationTermAccess().getValueINTTerminalRuleCall_6_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getALSBasicRelationTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_13_0, 
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalAlloyLanguage.g:2706:6: ( () ( (lv_value_15_0= RULE_STRING ) ) )
                    {
                    // InternalAlloyLanguage.g:2706:6: ( () ( (lv_value_15_0= RULE_STRING ) ) )
                    // InternalAlloyLanguage.g:2706:7: () ( (lv_value_15_0= RULE_STRING ) )
                    {
                    // InternalAlloyLanguage.g:2706:7: ()
                    // InternalAlloyLanguage.g:2707:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getALSBasicRelationTermAccess().getALSStringLiteralAction_7_0(),
                                  current);
                          
                    }

                    }

                    // InternalAlloyLanguage.g:2712:2: ( (lv_value_15_0= RULE_STRING ) )
                    // InternalAlloyLanguage.g:2713:1: (lv_value_15_0= RULE_STRING )
                    {
                    // InternalAlloyLanguage.g:2713:1: (lv_value_15_0= RULE_STRING )
                    // InternalAlloyLanguage.g:2714:3: lv_value_15_0= RULE_STRING
                    {
                    lv_value_15_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_15_0, grammarAccess.getALSBasicRelationTermAccess().getValueSTRINGTerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getALSBasicRelationTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_15_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalAlloyLanguage.g:2731:6: (otherlv_16= '(' this_ALSTerm_17= ruleALSTerm otherlv_18= ')' )
                    {
                    // InternalAlloyLanguage.g:2731:6: (otherlv_16= '(' this_ALSTerm_17= ruleALSTerm otherlv_18= ')' )
                    // InternalAlloyLanguage.g:2731:8: otherlv_16= '(' this_ALSTerm_17= ruleALSTerm otherlv_18= ')'
                    {
                    otherlv_16=(Token)match(input,61,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getALSBasicRelationTermAccess().getLeftParenthesisKeyword_8_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getALSBasicRelationTermAccess().getALSTermParserRuleCall_8_1()); 
                          
                    }
                    pushFollow(FOLLOW_34);
                    this_ALSTerm_17=ruleALSTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ALSTerm_17; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_18=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getALSBasicRelationTermAccess().getRightParenthesisKeyword_8_2());
                          
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
    // $ANTLR end "ruleALSBasicRelationTerm"


    // $ANTLR start "entryRuleALSRunCommand"
    // InternalAlloyLanguage.g:2756:1: entryRuleALSRunCommand returns [EObject current=null] : iv_ruleALSRunCommand= ruleALSRunCommand EOF ;
    public final EObject entryRuleALSRunCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSRunCommand = null;


        try {
            // InternalAlloyLanguage.g:2757:2: (iv_ruleALSRunCommand= ruleALSRunCommand EOF )
            // InternalAlloyLanguage.g:2758:2: iv_ruleALSRunCommand= ruleALSRunCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSRunCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSRunCommand=ruleALSRunCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSRunCommand; 
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
    // $ANTLR end "entryRuleALSRunCommand"


    // $ANTLR start "ruleALSRunCommand"
    // InternalAlloyLanguage.g:2765:1: ruleALSRunCommand returns [EObject current=null] : ( () otherlv_1= 'run' otherlv_2= '{' otherlv_3= '}' (otherlv_4= 'for' ( (lv_typeScopes_5_0= ruleALSTypeScope ) ) (otherlv_6= ',' ( (lv_typeScopes_7_0= ruleALSTypeScope ) ) )* )? ) ;
    public final EObject ruleALSRunCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_typeScopes_5_0 = null;

        EObject lv_typeScopes_7_0 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:2768:28: ( ( () otherlv_1= 'run' otherlv_2= '{' otherlv_3= '}' (otherlv_4= 'for' ( (lv_typeScopes_5_0= ruleALSTypeScope ) ) (otherlv_6= ',' ( (lv_typeScopes_7_0= ruleALSTypeScope ) ) )* )? ) )
            // InternalAlloyLanguage.g:2769:1: ( () otherlv_1= 'run' otherlv_2= '{' otherlv_3= '}' (otherlv_4= 'for' ( (lv_typeScopes_5_0= ruleALSTypeScope ) ) (otherlv_6= ',' ( (lv_typeScopes_7_0= ruleALSTypeScope ) ) )* )? )
            {
            // InternalAlloyLanguage.g:2769:1: ( () otherlv_1= 'run' otherlv_2= '{' otherlv_3= '}' (otherlv_4= 'for' ( (lv_typeScopes_5_0= ruleALSTypeScope ) ) (otherlv_6= ',' ( (lv_typeScopes_7_0= ruleALSTypeScope ) ) )* )? )
            // InternalAlloyLanguage.g:2769:2: () otherlv_1= 'run' otherlv_2= '{' otherlv_3= '}' (otherlv_4= 'for' ( (lv_typeScopes_5_0= ruleALSTypeScope ) ) (otherlv_6= ',' ( (lv_typeScopes_7_0= ruleALSTypeScope ) ) )* )?
            {
            // InternalAlloyLanguage.g:2769:2: ()
            // InternalAlloyLanguage.g:2770:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getALSRunCommandAccess().getALSRunCommandAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getALSRunCommandAccess().getRunKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getALSRunCommandAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getALSRunCommandAccess().getRightCurlyBracketKeyword_3());
                  
            }
            // InternalAlloyLanguage.g:2787:1: (otherlv_4= 'for' ( (lv_typeScopes_5_0= ruleALSTypeScope ) ) (otherlv_6= ',' ( (lv_typeScopes_7_0= ruleALSTypeScope ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==64) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAlloyLanguage.g:2787:3: otherlv_4= 'for' ( (lv_typeScopes_5_0= ruleALSTypeScope ) ) (otherlv_6= ',' ( (lv_typeScopes_7_0= ruleALSTypeScope ) ) )*
                    {
                    otherlv_4=(Token)match(input,64,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getALSRunCommandAccess().getForKeyword_4_0());
                          
                    }
                    // InternalAlloyLanguage.g:2791:1: ( (lv_typeScopes_5_0= ruleALSTypeScope ) )
                    // InternalAlloyLanguage.g:2792:1: (lv_typeScopes_5_0= ruleALSTypeScope )
                    {
                    // InternalAlloyLanguage.g:2792:1: (lv_typeScopes_5_0= ruleALSTypeScope )
                    // InternalAlloyLanguage.g:2793:3: lv_typeScopes_5_0= ruleALSTypeScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getALSRunCommandAccess().getTypeScopesALSTypeScopeParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_37);
                    lv_typeScopes_5_0=ruleALSTypeScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getALSRunCommandRule());
                      	        }
                             		add(
                             			current, 
                             			"typeScopes",
                              		lv_typeScopes_5_0, 
                              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSTypeScope");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAlloyLanguage.g:2809:2: (otherlv_6= ',' ( (lv_typeScopes_7_0= ruleALSTypeScope ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==13) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalAlloyLanguage.g:2809:4: otherlv_6= ',' ( (lv_typeScopes_7_0= ruleALSTypeScope ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getALSRunCommandAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // InternalAlloyLanguage.g:2813:1: ( (lv_typeScopes_7_0= ruleALSTypeScope ) )
                    	    // InternalAlloyLanguage.g:2814:1: (lv_typeScopes_7_0= ruleALSTypeScope )
                    	    {
                    	    // InternalAlloyLanguage.g:2814:1: (lv_typeScopes_7_0= ruleALSTypeScope )
                    	    // InternalAlloyLanguage.g:2815:3: lv_typeScopes_7_0= ruleALSTypeScope
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getALSRunCommandAccess().getTypeScopesALSTypeScopeParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_37);
                    	    lv_typeScopes_7_0=ruleALSTypeScope();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getALSRunCommandRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeScopes",
                    	              		lv_typeScopes_7_0, 
                    	              		"hu.bme.mit.inf.dslreasoner.AlloyLanguage.ALSTypeScope");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


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
    // $ANTLR end "ruleALSRunCommand"


    // $ANTLR start "entryRuleALSTypeScope"
    // InternalAlloyLanguage.g:2839:1: entryRuleALSTypeScope returns [EObject current=null] : iv_ruleALSTypeScope= ruleALSTypeScope EOF ;
    public final EObject entryRuleALSTypeScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSTypeScope = null;


        try {
            // InternalAlloyLanguage.g:2840:2: (iv_ruleALSTypeScope= ruleALSTypeScope EOF )
            // InternalAlloyLanguage.g:2841:2: iv_ruleALSTypeScope= ruleALSTypeScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSTypeScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSTypeScope=ruleALSTypeScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSTypeScope; 
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
    // $ANTLR end "entryRuleALSTypeScope"


    // $ANTLR start "ruleALSTypeScope"
    // InternalAlloyLanguage.g:2848:1: ruleALSTypeScope returns [EObject current=null] : (this_ALSSigScope_0= ruleALSSigScope | this_ALSIntScope_1= ruleALSIntScope | this_ALSStringScope_2= ruleALSStringScope ) ;
    public final EObject ruleALSTypeScope() throws RecognitionException {
        EObject current = null;

        EObject this_ALSSigScope_0 = null;

        EObject this_ALSIntScope_1 = null;

        EObject this_ALSStringScope_2 = null;


         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:2851:28: ( (this_ALSSigScope_0= ruleALSSigScope | this_ALSIntScope_1= ruleALSIntScope | this_ALSStringScope_2= ruleALSStringScope ) )
            // InternalAlloyLanguage.g:2852:1: (this_ALSSigScope_0= ruleALSSigScope | this_ALSIntScope_1= ruleALSIntScope | this_ALSStringScope_2= ruleALSStringScope )
            {
            // InternalAlloyLanguage.g:2852:1: (this_ALSSigScope_0= ruleALSSigScope | this_ALSIntScope_1= ruleALSIntScope | this_ALSStringScope_2= ruleALSStringScope )
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==65) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==RULE_INT) ) {
                    int LA46_3 = input.LA(3);

                    if ( (LA46_3==RULE_ID) ) {
                        alt46=1;
                    }
                    else if ( (LA46_3==60) ) {
                        alt46=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA46_0==RULE_INT) ) {
                int LA46_2 = input.LA(2);

                if ( (LA46_2==RULE_ID) ) {
                    alt46=1;
                }
                else if ( (LA46_2==59) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalAlloyLanguage.g:2853:5: this_ALSSigScope_0= ruleALSSigScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getALSTypeScopeAccess().getALSSigScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ALSSigScope_0=ruleALSSigScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ALSSigScope_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:2863:5: this_ALSIntScope_1= ruleALSIntScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getALSTypeScopeAccess().getALSIntScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ALSIntScope_1=ruleALSIntScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ALSIntScope_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalAlloyLanguage.g:2873:5: this_ALSStringScope_2= ruleALSStringScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getALSTypeScopeAccess().getALSStringScopeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ALSStringScope_2=ruleALSStringScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ALSStringScope_2; 
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
    // $ANTLR end "ruleALSTypeScope"


    // $ANTLR start "entryRuleALSSigScope"
    // InternalAlloyLanguage.g:2889:1: entryRuleALSSigScope returns [EObject current=null] : iv_ruleALSSigScope= ruleALSSigScope EOF ;
    public final EObject entryRuleALSSigScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSSigScope = null;


        try {
            // InternalAlloyLanguage.g:2890:2: (iv_ruleALSSigScope= ruleALSSigScope EOF )
            // InternalAlloyLanguage.g:2891:2: iv_ruleALSSigScope= ruleALSSigScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSSigScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSSigScope=ruleALSSigScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSSigScope; 
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
    // $ANTLR end "entryRuleALSSigScope"


    // $ANTLR start "ruleALSSigScope"
    // InternalAlloyLanguage.g:2898:1: ruleALSSigScope returns [EObject current=null] : ( ( (lv_exactly_0_0= 'exactly' ) )? ( (lv_number_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleALSSigScope() throws RecognitionException {
        EObject current = null;

        Token lv_exactly_0_0=null;
        Token lv_number_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:2901:28: ( ( ( (lv_exactly_0_0= 'exactly' ) )? ( (lv_number_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalAlloyLanguage.g:2902:1: ( ( (lv_exactly_0_0= 'exactly' ) )? ( (lv_number_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalAlloyLanguage.g:2902:1: ( ( (lv_exactly_0_0= 'exactly' ) )? ( (lv_number_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalAlloyLanguage.g:2902:2: ( (lv_exactly_0_0= 'exactly' ) )? ( (lv_number_1_0= RULE_INT ) ) ( (otherlv_2= RULE_ID ) )
            {
            // InternalAlloyLanguage.g:2902:2: ( (lv_exactly_0_0= 'exactly' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==65) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAlloyLanguage.g:2903:1: (lv_exactly_0_0= 'exactly' )
                    {
                    // InternalAlloyLanguage.g:2903:1: (lv_exactly_0_0= 'exactly' )
                    // InternalAlloyLanguage.g:2904:3: lv_exactly_0_0= 'exactly'
                    {
                    lv_exactly_0_0=(Token)match(input,65,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_exactly_0_0, grammarAccess.getALSSigScopeAccess().getExactlyExactlyKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getALSSigScopeRule());
                      	        }
                             		setWithLastConsumed(current, "exactly", true, "exactly");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalAlloyLanguage.g:2917:3: ( (lv_number_1_0= RULE_INT ) )
            // InternalAlloyLanguage.g:2918:1: (lv_number_1_0= RULE_INT )
            {
            // InternalAlloyLanguage.g:2918:1: (lv_number_1_0= RULE_INT )
            // InternalAlloyLanguage.g:2919:3: lv_number_1_0= RULE_INT
            {
            lv_number_1_0=(Token)match(input,RULE_INT,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_number_1_0, grammarAccess.getALSSigScopeAccess().getNumberINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getALSSigScopeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"number",
                      		lv_number_1_0, 
                      		"org.eclipse.xtext.common.Terminals.INT");
              	    
            }

            }


            }

            // InternalAlloyLanguage.g:2935:2: ( (otherlv_2= RULE_ID ) )
            // InternalAlloyLanguage.g:2936:1: (otherlv_2= RULE_ID )
            {
            // InternalAlloyLanguage.g:2936:1: (otherlv_2= RULE_ID )
            // InternalAlloyLanguage.g:2937:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getALSSigScopeRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getALSSigScopeAccess().getTypeALSSignatureDeclarationCrossReference_2_0()); 
              	
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
    // $ANTLR end "ruleALSSigScope"


    // $ANTLR start "entryRuleALSIntScope"
    // InternalAlloyLanguage.g:2956:1: entryRuleALSIntScope returns [EObject current=null] : iv_ruleALSIntScope= ruleALSIntScope EOF ;
    public final EObject entryRuleALSIntScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSIntScope = null;


        try {
            // InternalAlloyLanguage.g:2957:2: (iv_ruleALSIntScope= ruleALSIntScope EOF )
            // InternalAlloyLanguage.g:2958:2: iv_ruleALSIntScope= ruleALSIntScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSIntScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSIntScope=ruleALSIntScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSIntScope; 
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
    // $ANTLR end "entryRuleALSIntScope"


    // $ANTLR start "ruleALSIntScope"
    // InternalAlloyLanguage.g:2965:1: ruleALSIntScope returns [EObject current=null] : ( ( (lv_number_0_0= RULE_INT ) ) otherlv_1= 'Int' ) ;
    public final EObject ruleALSIntScope() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:2968:28: ( ( ( (lv_number_0_0= RULE_INT ) ) otherlv_1= 'Int' ) )
            // InternalAlloyLanguage.g:2969:1: ( ( (lv_number_0_0= RULE_INT ) ) otherlv_1= 'Int' )
            {
            // InternalAlloyLanguage.g:2969:1: ( ( (lv_number_0_0= RULE_INT ) ) otherlv_1= 'Int' )
            // InternalAlloyLanguage.g:2969:2: ( (lv_number_0_0= RULE_INT ) ) otherlv_1= 'Int'
            {
            // InternalAlloyLanguage.g:2969:2: ( (lv_number_0_0= RULE_INT ) )
            // InternalAlloyLanguage.g:2970:1: (lv_number_0_0= RULE_INT )
            {
            // InternalAlloyLanguage.g:2970:1: (lv_number_0_0= RULE_INT )
            // InternalAlloyLanguage.g:2971:3: lv_number_0_0= RULE_INT
            {
            lv_number_0_0=(Token)match(input,RULE_INT,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_number_0_0, grammarAccess.getALSIntScopeAccess().getNumberINTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getALSIntScopeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"number",
                      		lv_number_0_0, 
                      		"org.eclipse.xtext.common.Terminals.INT");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getALSIntScopeAccess().getIntKeyword_1());
                  
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
    // $ANTLR end "ruleALSIntScope"


    // $ANTLR start "entryRuleALSStringScope"
    // InternalAlloyLanguage.g:2999:1: entryRuleALSStringScope returns [EObject current=null] : iv_ruleALSStringScope= ruleALSStringScope EOF ;
    public final EObject entryRuleALSStringScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALSStringScope = null;


        try {
            // InternalAlloyLanguage.g:3000:2: (iv_ruleALSStringScope= ruleALSStringScope EOF )
            // InternalAlloyLanguage.g:3001:2: iv_ruleALSStringScope= ruleALSStringScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getALSStringScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleALSStringScope=ruleALSStringScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleALSStringScope; 
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
    // $ANTLR end "entryRuleALSStringScope"


    // $ANTLR start "ruleALSStringScope"
    // InternalAlloyLanguage.g:3008:1: ruleALSStringScope returns [EObject current=null] : (otherlv_0= 'exactly' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'String' ) ;
    public final EObject ruleALSStringScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalAlloyLanguage.g:3011:28: ( (otherlv_0= 'exactly' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'String' ) )
            // InternalAlloyLanguage.g:3012:1: (otherlv_0= 'exactly' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'String' )
            {
            // InternalAlloyLanguage.g:3012:1: (otherlv_0= 'exactly' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'String' )
            // InternalAlloyLanguage.g:3012:3: otherlv_0= 'exactly' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'String'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getALSStringScopeAccess().getExactlyKeyword_0());
                  
            }
            // InternalAlloyLanguage.g:3016:1: ( (lv_number_1_0= RULE_INT ) )
            // InternalAlloyLanguage.g:3017:1: (lv_number_1_0= RULE_INT )
            {
            // InternalAlloyLanguage.g:3017:1: (lv_number_1_0= RULE_INT )
            // InternalAlloyLanguage.g:3018:3: lv_number_1_0= RULE_INT
            {
            lv_number_1_0=(Token)match(input,RULE_INT,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_number_1_0, grammarAccess.getALSStringScopeAccess().getNumberINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getALSStringScopeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"number",
                      		lv_number_1_0, 
                      		"org.eclipse.xtext.common.Terminals.INT");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getALSStringScopeAccess().getStringKeyword_2());
                  
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
    // $ANTLR end "ruleALSStringScope"


    // $ANTLR start "ruleALSMultiplicity"
    // InternalAlloyLanguage.g:3046:1: ruleALSMultiplicity returns [Enumerator current=null] : ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'no' ) | (enumLiteral_2= 'some' ) | (enumLiteral_3= 'lone' ) | (enumLiteral_4= 'one' ) | (enumLiteral_5= 'set' ) ) ;
    public final Enumerator ruleALSMultiplicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // InternalAlloyLanguage.g:3048:28: ( ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'no' ) | (enumLiteral_2= 'some' ) | (enumLiteral_3= 'lone' ) | (enumLiteral_4= 'one' ) | (enumLiteral_5= 'set' ) ) )
            // InternalAlloyLanguage.g:3049:1: ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'no' ) | (enumLiteral_2= 'some' ) | (enumLiteral_3= 'lone' ) | (enumLiteral_4= 'one' ) | (enumLiteral_5= 'set' ) )
            {
            // InternalAlloyLanguage.g:3049:1: ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'no' ) | (enumLiteral_2= 'some' ) | (enumLiteral_3= 'lone' ) | (enumLiteral_4= 'one' ) | (enumLiteral_5= 'set' ) )
            int alt48=6;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt48=1;
                }
                break;
            case 67:
                {
                alt48=2;
                }
                break;
            case 68:
                {
                alt48=3;
                }
                break;
            case 69:
                {
                alt48=4;
                }
                break;
            case 70:
                {
                alt48=5;
                }
                break;
            case 71:
                {
                alt48=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalAlloyLanguage.g:3049:2: (enumLiteral_0= 'all' )
                    {
                    // InternalAlloyLanguage.g:3049:2: (enumLiteral_0= 'all' )
                    // InternalAlloyLanguage.g:3049:4: enumLiteral_0= 'all'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getALSMultiplicityAccess().getAllEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getALSMultiplicityAccess().getAllEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:3055:6: (enumLiteral_1= 'no' )
                    {
                    // InternalAlloyLanguage.g:3055:6: (enumLiteral_1= 'no' )
                    // InternalAlloyLanguage.g:3055:8: enumLiteral_1= 'no'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getALSMultiplicityAccess().getNoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getALSMultiplicityAccess().getNoEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAlloyLanguage.g:3061:6: (enumLiteral_2= 'some' )
                    {
                    // InternalAlloyLanguage.g:3061:6: (enumLiteral_2= 'some' )
                    // InternalAlloyLanguage.g:3061:8: enumLiteral_2= 'some'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getALSMultiplicityAccess().getSomeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getALSMultiplicityAccess().getSomeEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAlloyLanguage.g:3067:6: (enumLiteral_3= 'lone' )
                    {
                    // InternalAlloyLanguage.g:3067:6: (enumLiteral_3= 'lone' )
                    // InternalAlloyLanguage.g:3067:8: enumLiteral_3= 'lone'
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getALSMultiplicityAccess().getLoneEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getALSMultiplicityAccess().getLoneEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAlloyLanguage.g:3073:6: (enumLiteral_4= 'one' )
                    {
                    // InternalAlloyLanguage.g:3073:6: (enumLiteral_4= 'one' )
                    // InternalAlloyLanguage.g:3073:8: enumLiteral_4= 'one'
                    {
                    enumLiteral_4=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getALSMultiplicityAccess().getOneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getALSMultiplicityAccess().getOneEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAlloyLanguage.g:3079:6: (enumLiteral_5= 'set' )
                    {
                    // InternalAlloyLanguage.g:3079:6: (enumLiteral_5= 'set' )
                    // InternalAlloyLanguage.g:3079:8: enumLiteral_5= 'set'
                    {
                    enumLiteral_5=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getALSMultiplicityAccess().getSetEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getALSMultiplicityAccess().getSetEnumLiteralDeclaration_5()); 
                          
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
    // $ANTLR end "ruleALSMultiplicity"


    // $ANTLR start "ruleALSNumericOperator"
    // InternalAlloyLanguage.g:3089:1: ruleALSNumericOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'plus' ) | (enumLiteral_1= 'sub' ) | (enumLiteral_2= 'mul' ) | (enumLiteral_3= 'rem' ) | (enumLiteral_4= 'div' ) ) ;
    public final Enumerator ruleALSNumericOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalAlloyLanguage.g:3091:28: ( ( (enumLiteral_0= 'plus' ) | (enumLiteral_1= 'sub' ) | (enumLiteral_2= 'mul' ) | (enumLiteral_3= 'rem' ) | (enumLiteral_4= 'div' ) ) )
            // InternalAlloyLanguage.g:3092:1: ( (enumLiteral_0= 'plus' ) | (enumLiteral_1= 'sub' ) | (enumLiteral_2= 'mul' ) | (enumLiteral_3= 'rem' ) | (enumLiteral_4= 'div' ) )
            {
            // InternalAlloyLanguage.g:3092:1: ( (enumLiteral_0= 'plus' ) | (enumLiteral_1= 'sub' ) | (enumLiteral_2= 'mul' ) | (enumLiteral_3= 'rem' ) | (enumLiteral_4= 'div' ) )
            int alt49=5;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt49=1;
                }
                break;
            case 73:
                {
                alt49=2;
                }
                break;
            case 74:
                {
                alt49=3;
                }
                break;
            case 75:
                {
                alt49=4;
                }
                break;
            case 76:
                {
                alt49=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalAlloyLanguage.g:3092:2: (enumLiteral_0= 'plus' )
                    {
                    // InternalAlloyLanguage.g:3092:2: (enumLiteral_0= 'plus' )
                    // InternalAlloyLanguage.g:3092:4: enumLiteral_0= 'plus'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getALSNumericOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getALSNumericOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlloyLanguage.g:3098:6: (enumLiteral_1= 'sub' )
                    {
                    // InternalAlloyLanguage.g:3098:6: (enumLiteral_1= 'sub' )
                    // InternalAlloyLanguage.g:3098:8: enumLiteral_1= 'sub'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getALSNumericOperatorAccess().getSubEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getALSNumericOperatorAccess().getSubEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAlloyLanguage.g:3104:6: (enumLiteral_2= 'mul' )
                    {
                    // InternalAlloyLanguage.g:3104:6: (enumLiteral_2= 'mul' )
                    // InternalAlloyLanguage.g:3104:8: enumLiteral_2= 'mul'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getALSNumericOperatorAccess().getMulEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getALSNumericOperatorAccess().getMulEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAlloyLanguage.g:3110:6: (enumLiteral_3= 'rem' )
                    {
                    // InternalAlloyLanguage.g:3110:6: (enumLiteral_3= 'rem' )
                    // InternalAlloyLanguage.g:3110:8: enumLiteral_3= 'rem'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getALSNumericOperatorAccess().getRemEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getALSNumericOperatorAccess().getRemEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAlloyLanguage.g:3116:6: (enumLiteral_4= 'div' )
                    {
                    // InternalAlloyLanguage.g:3116:6: (enumLiteral_4= 'div' )
                    // InternalAlloyLanguage.g:3116:8: enumLiteral_4= 'div'
                    {
                    enumLiteral_4=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getALSNumericOperatorAccess().getDivEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getALSNumericOperatorAccess().getDivEnumLiteralDeclaration_4()); 
                          
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
    // $ANTLR end "ruleALSNumericOperator"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\11\uffff\1\10";
    static final String dfa_3s = "\7\4\2\uffff\1\15";
    static final String dfa_4s = "\7\114\2\uffff\1\107";
    static final String dfa_5s = "\7\uffff\1\2\1\1\1\uffff";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\3\7\47\uffff\1\7\2\uffff\15\7\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\5\7",
            "\1\11\2\10\23\uffff\1\7\23\uffff\1\10\2\uffff\15\10\4\uffff\13\10",
            "\1\11\2\10\23\uffff\1\7\23\uffff\1\10\2\uffff\15\10\4\uffff\13\10",
            "\1\11\2\10\23\uffff\1\7\23\uffff\1\10\2\uffff\15\10\4\uffff\13\10",
            "\1\11\2\10\23\uffff\1\7\23\uffff\1\10\2\uffff\15\10\4\uffff\13\10",
            "\1\11\2\10\23\uffff\1\7\23\uffff\1\10\2\uffff\15\10\4\uffff\13\10",
            "\1\11\2\10\23\uffff\1\7\23\uffff\1\10\2\uffff\15\10\4\uffff\13\10",
            "",
            "",
            "\2\10\3\uffff\2\10\1\7\1\uffff\1\10\4\uffff\6\10\1\uffff\17\10\21\uffff\6\10"
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
            return "713:1: ( (lv_multiplicity_2_0= ruleALSMultiplicity ) )?";
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\10\uffff\1\12\2\uffff";
    static final String dfa_10s = "\1\4\7\uffff\1\14\2\uffff";
    static final String dfa_11s = "\1\114\7\uffff\1\107\2\uffff";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11";
    static final String dfa_13s = "\13\uffff}>";
    static final String[] dfa_14s = {
            "\1\10\2\12\47\uffff\1\6\2\uffff\2\1\1\2\1\3\1\4\1\5\1\7\6\12\12\uffff\5\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\12\3\uffff\2\12\2\uffff\1\11\1\12\3\uffff\26\12\15\uffff\1\12\3\uffff\6\12",
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

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2167:1: ( ( () ( ( ( '!' | 'not' ) )=> (otherlv_1= '!' | otherlv_2= 'not' ) ) ( (lv_operand_3_0= ruleALSBasicRelationTerm ) ) ) | ( () ( ( '~' )=>otherlv_5= '~' ) ( (lv_operand_6_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_8= '^' ( (lv_operand_9_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_11= '*' ( (lv_operand_12_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_14= '#' ( (lv_operand_15_0= ruleALSBasicRelationTerm ) ) ) | ( () ( ( '-' )=>otherlv_17= '-' ) ( (lv_operand_18_0= ruleALSBasicRelationTerm ) ) ) | ( () otherlv_20= 'sum' ( (lv_variables_21_0= ruleALSVariableDeclaration ) ) (otherlv_22= ',' ( (lv_variables_23_0= ruleALSVariableDeclaration ) ) )* otherlv_24= '{' ( (lv_expression_25_0= ruleALSTerm ) ) otherlv_26= '}' ) | ( () ( ( (otherlv_28= RULE_ID ) ) | ( (lv_referredNumericOperator_29_0= ruleALSNumericOperator ) ) ) otherlv_30= '[' ( (lv_params_31_0= ruleALSTerm ) ) (otherlv_32= ',' ( (lv_params_33_0= ruleALSTerm ) ) )* otherlv_34= ']' ) | this_ALSBasicRelationTerm_35= ruleALSBasicRelationTerm )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x8000000003218800L,0x00000000000000FCL});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000063000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x3FFE400000000070L,0x0000000000001FFCL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000003F000040002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001000000000002L,0x00000000000000FCL});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1000000000000000L});

}
