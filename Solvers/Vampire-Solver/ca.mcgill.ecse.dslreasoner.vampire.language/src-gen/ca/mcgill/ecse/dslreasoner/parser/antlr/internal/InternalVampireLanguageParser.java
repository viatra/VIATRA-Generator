package ca.mcgill.ecse.dslreasoner.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ca.mcgill.ecse.dslreasoner.services.VampireLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVampireLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SINGLE_COMMENT", "RULE_LITERAL", "RULE_LOWER_WORD_ID", "RULE_SIGNED_LITERAL", "RULE_SINGLE_QUOTE", "RULE_DOLLAR_ID", "RULE_DOUBLE_DOLLAR_ID", "RULE_UPPER_WORD_ID", "RULE_DOUBLE_QUOTE", "RULE_ALPHA_NUMERIC", "RULE_SIGN", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Satisfiable!'", "'WARNING!'", "'Could'", "'not'", "'set'", "'resource'", "'limit:'", "'Virtual'", "'memory.'", "'TRYING'", "'['", "']'", "'Finite'", "'Model'", "'Found!'", "'fof'", "'('", "','", "')'", "'.'", "'tff'", "'distinct_domain'", "'finite_domain'", "'declare_'", "'axiom'", "'conjecture'", "'hypothesis'", "'definition'", "'assumption'", "'lemma'", "'theorem'", "'corollary'", "'negated_conjecture'", "'plain'", "'type'", "'fi_domain'", "'fi_functors'", "'fi_predicates'", "'unknown'", "':'", "'>'", "'*'", "'<=>'", "'=>'", "'<='", "'<~>'", "'~|'", "'~&'", "'&'", "'|'", "'!'", "'?'", "'~'", "'!='", "'='", "':='", "'$true'", "'$false'", "'$less'"
    };
    public static final int T__50=50;
    public static final int RULE_SIGN=14;
    public static final int T__59=59;
    public static final int RULE_SIGNED_LITERAL=7;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_DOUBLE_QUOTE=12;
    public static final int T__52=52;
    public static final int RULE_LITERAL=5;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=16;
    public static final int RULE_SINGLE_QUOTE=8;
    public static final int RULE_SINGLE_COMMENT=4;
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
    public static final int RULE_LOWER_WORD_ID=6;
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
    public static final int RULE_DOLLAR_ID=9;
    public static final int RULE_ALPHA_NUMERIC=13;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_DOUBLE_DOLLAR_ID=10;
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

        public InternalVampireLanguageParser(TokenStream input, VampireLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "VampireModel";
       	}

       	@Override
       	protected VampireLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleVampireModel"
    // InternalVampireLanguage.g:64:1: entryRuleVampireModel returns [EObject current=null] : iv_ruleVampireModel= ruleVampireModel EOF ;
    public final EObject entryRuleVampireModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVampireModel = null;


        try {
            // InternalVampireLanguage.g:64:53: (iv_ruleVampireModel= ruleVampireModel EOF )
            // InternalVampireLanguage.g:65:2: iv_ruleVampireModel= ruleVampireModel EOF
            {
             newCompositeNode(grammarAccess.getVampireModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVampireModel=ruleVampireModel();

            state._fsp--;

             current =iv_ruleVampireModel; 
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
    // $ANTLR end "entryRuleVampireModel"


    // $ANTLR start "ruleVampireModel"
    // InternalVampireLanguage.g:71:1: ruleVampireModel returns [EObject current=null] : ( ( (lv_comments_0_0= ruleVLSComment ) ) | ( (lv_confirmations_1_0= ruleVLSConfirmations ) ) | ( (lv_formulas_2_0= ruleVLSFofFormula ) ) | ( (lv_tfformulas_3_0= ruleVLSTffFormula ) ) )* ;
    public final EObject ruleVampireModel() throws RecognitionException {
        EObject current = null;

        EObject lv_comments_0_0 = null;

        EObject lv_confirmations_1_0 = null;

        EObject lv_formulas_2_0 = null;

        EObject lv_tfformulas_3_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:77:2: ( ( ( (lv_comments_0_0= ruleVLSComment ) ) | ( (lv_confirmations_1_0= ruleVLSConfirmations ) ) | ( (lv_formulas_2_0= ruleVLSFofFormula ) ) | ( (lv_tfformulas_3_0= ruleVLSTffFormula ) ) )* )
            // InternalVampireLanguage.g:78:2: ( ( (lv_comments_0_0= ruleVLSComment ) ) | ( (lv_confirmations_1_0= ruleVLSConfirmations ) ) | ( (lv_formulas_2_0= ruleVLSFofFormula ) ) | ( (lv_tfformulas_3_0= ruleVLSTffFormula ) ) )*
            {
            // InternalVampireLanguage.g:78:2: ( ( (lv_comments_0_0= ruleVLSComment ) ) | ( (lv_confirmations_1_0= ruleVLSConfirmations ) ) | ( (lv_formulas_2_0= ruleVLSFofFormula ) ) | ( (lv_tfformulas_3_0= ruleVLSTffFormula ) ) )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case RULE_SINGLE_COMMENT:
                    {
                    alt1=1;
                    }
                    break;
                case 22:
                case 23:
                case 31:
                case 34:
                    {
                    alt1=2;
                    }
                    break;
                case 37:
                    {
                    alt1=3;
                    }
                    break;
                case 42:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalVampireLanguage.g:79:3: ( (lv_comments_0_0= ruleVLSComment ) )
            	    {
            	    // InternalVampireLanguage.g:79:3: ( (lv_comments_0_0= ruleVLSComment ) )
            	    // InternalVampireLanguage.g:80:4: (lv_comments_0_0= ruleVLSComment )
            	    {
            	    // InternalVampireLanguage.g:80:4: (lv_comments_0_0= ruleVLSComment )
            	    // InternalVampireLanguage.g:81:5: lv_comments_0_0= ruleVLSComment
            	    {

            	    					newCompositeNode(grammarAccess.getVampireModelAccess().getCommentsVLSCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_comments_0_0=ruleVLSComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVampireModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comments",
            	    						lv_comments_0_0,
            	    						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSComment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVampireLanguage.g:99:3: ( (lv_confirmations_1_0= ruleVLSConfirmations ) )
            	    {
            	    // InternalVampireLanguage.g:99:3: ( (lv_confirmations_1_0= ruleVLSConfirmations ) )
            	    // InternalVampireLanguage.g:100:4: (lv_confirmations_1_0= ruleVLSConfirmations )
            	    {
            	    // InternalVampireLanguage.g:100:4: (lv_confirmations_1_0= ruleVLSConfirmations )
            	    // InternalVampireLanguage.g:101:5: lv_confirmations_1_0= ruleVLSConfirmations
            	    {

            	    					newCompositeNode(grammarAccess.getVampireModelAccess().getConfirmationsVLSConfirmationsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_confirmations_1_0=ruleVLSConfirmations();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVampireModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"confirmations",
            	    						lv_confirmations_1_0,
            	    						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSConfirmations");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVampireLanguage.g:119:3: ( (lv_formulas_2_0= ruleVLSFofFormula ) )
            	    {
            	    // InternalVampireLanguage.g:119:3: ( (lv_formulas_2_0= ruleVLSFofFormula ) )
            	    // InternalVampireLanguage.g:120:4: (lv_formulas_2_0= ruleVLSFofFormula )
            	    {
            	    // InternalVampireLanguage.g:120:4: (lv_formulas_2_0= ruleVLSFofFormula )
            	    // InternalVampireLanguage.g:121:5: lv_formulas_2_0= ruleVLSFofFormula
            	    {

            	    					newCompositeNode(grammarAccess.getVampireModelAccess().getFormulasVLSFofFormulaParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_formulas_2_0=ruleVLSFofFormula();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVampireModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"formulas",
            	    						lv_formulas_2_0,
            	    						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSFofFormula");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVampireLanguage.g:139:3: ( (lv_tfformulas_3_0= ruleVLSTffFormula ) )
            	    {
            	    // InternalVampireLanguage.g:139:3: ( (lv_tfformulas_3_0= ruleVLSTffFormula ) )
            	    // InternalVampireLanguage.g:140:4: (lv_tfformulas_3_0= ruleVLSTffFormula )
            	    {
            	    // InternalVampireLanguage.g:140:4: (lv_tfformulas_3_0= ruleVLSTffFormula )
            	    // InternalVampireLanguage.g:141:5: lv_tfformulas_3_0= ruleVLSTffFormula
            	    {

            	    					newCompositeNode(grammarAccess.getVampireModelAccess().getTfformulasVLSTffFormulaParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_tfformulas_3_0=ruleVLSTffFormula();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVampireModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tfformulas",
            	    						lv_tfformulas_3_0,
            	    						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSTffFormula");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleVampireModel"


    // $ANTLR start "entryRuleVLSComment"
    // InternalVampireLanguage.g:162:1: entryRuleVLSComment returns [EObject current=null] : iv_ruleVLSComment= ruleVLSComment EOF ;
    public final EObject entryRuleVLSComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSComment = null;


        try {
            // InternalVampireLanguage.g:162:51: (iv_ruleVLSComment= ruleVLSComment EOF )
            // InternalVampireLanguage.g:163:2: iv_ruleVLSComment= ruleVLSComment EOF
            {
             newCompositeNode(grammarAccess.getVLSCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSComment=ruleVLSComment();

            state._fsp--;

             current =iv_ruleVLSComment; 
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
    // $ANTLR end "entryRuleVLSComment"


    // $ANTLR start "ruleVLSComment"
    // InternalVampireLanguage.g:169:1: ruleVLSComment returns [EObject current=null] : ( (lv_comment_0_0= RULE_SINGLE_COMMENT ) ) ;
    public final EObject ruleVLSComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:175:2: ( ( (lv_comment_0_0= RULE_SINGLE_COMMENT ) ) )
            // InternalVampireLanguage.g:176:2: ( (lv_comment_0_0= RULE_SINGLE_COMMENT ) )
            {
            // InternalVampireLanguage.g:176:2: ( (lv_comment_0_0= RULE_SINGLE_COMMENT ) )
            // InternalVampireLanguage.g:177:3: (lv_comment_0_0= RULE_SINGLE_COMMENT )
            {
            // InternalVampireLanguage.g:177:3: (lv_comment_0_0= RULE_SINGLE_COMMENT )
            // InternalVampireLanguage.g:178:4: lv_comment_0_0= RULE_SINGLE_COMMENT
            {
            lv_comment_0_0=(Token)match(input,RULE_SINGLE_COMMENT,FOLLOW_2); 

            				newLeafNode(lv_comment_0_0, grammarAccess.getVLSCommentAccess().getCommentSINGLE_COMMENTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVLSCommentRule());
            				}
            				setWithLastConsumed(
            					current,
            					"comment",
            					lv_comment_0_0,
            					"ca.mcgill.ecse.dslreasoner.VampireLanguage.SINGLE_COMMENT");
            			

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
    // $ANTLR end "ruleVLSComment"


    // $ANTLR start "entryRuleVLSConfirmations"
    // InternalVampireLanguage.g:197:1: entryRuleVLSConfirmations returns [EObject current=null] : iv_ruleVLSConfirmations= ruleVLSConfirmations EOF ;
    public final EObject entryRuleVLSConfirmations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSConfirmations = null;


        try {
            // InternalVampireLanguage.g:197:57: (iv_ruleVLSConfirmations= ruleVLSConfirmations EOF )
            // InternalVampireLanguage.g:198:2: iv_ruleVLSConfirmations= ruleVLSConfirmations EOF
            {
             newCompositeNode(grammarAccess.getVLSConfirmationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSConfirmations=ruleVLSConfirmations();

            state._fsp--;

             current =iv_ruleVLSConfirmations; 
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
    // $ANTLR end "entryRuleVLSConfirmations"


    // $ANTLR start "ruleVLSConfirmations"
    // InternalVampireLanguage.g:204:1: ruleVLSConfirmations returns [EObject current=null] : ( ( () otherlv_1= 'Satisfiable!' ) | ( () otherlv_3= 'WARNING!' otherlv_4= 'Could' otherlv_5= 'not' otherlv_6= 'set' otherlv_7= 'resource' otherlv_8= 'limit:' otherlv_9= 'Virtual' otherlv_10= 'memory.' ) | ( () otherlv_12= 'TRYING' otherlv_13= '[' ( (lv_name_14_0= RULE_LITERAL ) ) otherlv_15= ']' ) | ( () otherlv_17= 'Finite' otherlv_18= 'Model' otherlv_19= 'Found!' ) ) ;
    public final EObject ruleVLSConfirmations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:210:2: ( ( ( () otherlv_1= 'Satisfiable!' ) | ( () otherlv_3= 'WARNING!' otherlv_4= 'Could' otherlv_5= 'not' otherlv_6= 'set' otherlv_7= 'resource' otherlv_8= 'limit:' otherlv_9= 'Virtual' otherlv_10= 'memory.' ) | ( () otherlv_12= 'TRYING' otherlv_13= '[' ( (lv_name_14_0= RULE_LITERAL ) ) otherlv_15= ']' ) | ( () otherlv_17= 'Finite' otherlv_18= 'Model' otherlv_19= 'Found!' ) ) )
            // InternalVampireLanguage.g:211:2: ( ( () otherlv_1= 'Satisfiable!' ) | ( () otherlv_3= 'WARNING!' otherlv_4= 'Could' otherlv_5= 'not' otherlv_6= 'set' otherlv_7= 'resource' otherlv_8= 'limit:' otherlv_9= 'Virtual' otherlv_10= 'memory.' ) | ( () otherlv_12= 'TRYING' otherlv_13= '[' ( (lv_name_14_0= RULE_LITERAL ) ) otherlv_15= ']' ) | ( () otherlv_17= 'Finite' otherlv_18= 'Model' otherlv_19= 'Found!' ) )
            {
            // InternalVampireLanguage.g:211:2: ( ( () otherlv_1= 'Satisfiable!' ) | ( () otherlv_3= 'WARNING!' otherlv_4= 'Could' otherlv_5= 'not' otherlv_6= 'set' otherlv_7= 'resource' otherlv_8= 'limit:' otherlv_9= 'Virtual' otherlv_10= 'memory.' ) | ( () otherlv_12= 'TRYING' otherlv_13= '[' ( (lv_name_14_0= RULE_LITERAL ) ) otherlv_15= ']' ) | ( () otherlv_17= 'Finite' otherlv_18= 'Model' otherlv_19= 'Found!' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            case 34:
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
                    // InternalVampireLanguage.g:212:3: ( () otherlv_1= 'Satisfiable!' )
                    {
                    // InternalVampireLanguage.g:212:3: ( () otherlv_1= 'Satisfiable!' )
                    // InternalVampireLanguage.g:213:4: () otherlv_1= 'Satisfiable!'
                    {
                    // InternalVampireLanguage.g:213:4: ()
                    // InternalVampireLanguage.g:214:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSConfirmationsAccess().getVLSSatisfiableAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getVLSConfirmationsAccess().getSatisfiableKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:226:3: ( () otherlv_3= 'WARNING!' otherlv_4= 'Could' otherlv_5= 'not' otherlv_6= 'set' otherlv_7= 'resource' otherlv_8= 'limit:' otherlv_9= 'Virtual' otherlv_10= 'memory.' )
                    {
                    // InternalVampireLanguage.g:226:3: ( () otherlv_3= 'WARNING!' otherlv_4= 'Could' otherlv_5= 'not' otherlv_6= 'set' otherlv_7= 'resource' otherlv_8= 'limit:' otherlv_9= 'Virtual' otherlv_10= 'memory.' )
                    // InternalVampireLanguage.g:227:4: () otherlv_3= 'WARNING!' otherlv_4= 'Could' otherlv_5= 'not' otherlv_6= 'set' otherlv_7= 'resource' otherlv_8= 'limit:' otherlv_9= 'Virtual' otherlv_10= 'memory.'
                    {
                    // InternalVampireLanguage.g:227:4: ()
                    // InternalVampireLanguage.g:228:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSConfirmationsAccess().getVLSWarningAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getVLSConfirmationsAccess().getWARNINGKeyword_1_1());
                    			
                    otherlv_4=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getVLSConfirmationsAccess().getCouldKeyword_1_2());
                    			
                    otherlv_5=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getVLSConfirmationsAccess().getNotKeyword_1_3());
                    			
                    otherlv_6=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getVLSConfirmationsAccess().getSetKeyword_1_4());
                    			
                    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getVLSConfirmationsAccess().getResourceKeyword_1_5());
                    			
                    otherlv_8=(Token)match(input,28,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getVLSConfirmationsAccess().getLimitKeyword_1_6());
                    			
                    otherlv_9=(Token)match(input,29,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getVLSConfirmationsAccess().getVirtualKeyword_1_7());
                    			
                    otherlv_10=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getVLSConfirmationsAccess().getMemoryKeyword_1_8());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:268:3: ( () otherlv_12= 'TRYING' otherlv_13= '[' ( (lv_name_14_0= RULE_LITERAL ) ) otherlv_15= ']' )
                    {
                    // InternalVampireLanguage.g:268:3: ( () otherlv_12= 'TRYING' otherlv_13= '[' ( (lv_name_14_0= RULE_LITERAL ) ) otherlv_15= ']' )
                    // InternalVampireLanguage.g:269:4: () otherlv_12= 'TRYING' otherlv_13= '[' ( (lv_name_14_0= RULE_LITERAL ) ) otherlv_15= ']'
                    {
                    // InternalVampireLanguage.g:269:4: ()
                    // InternalVampireLanguage.g:270:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSConfirmationsAccess().getVLSTryingAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_12=(Token)match(input,31,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getVLSConfirmationsAccess().getTRYINGKeyword_2_1());
                    			
                    otherlv_13=(Token)match(input,32,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getVLSConfirmationsAccess().getLeftSquareBracketKeyword_2_2());
                    			
                    // InternalVampireLanguage.g:284:4: ( (lv_name_14_0= RULE_LITERAL ) )
                    // InternalVampireLanguage.g:285:5: (lv_name_14_0= RULE_LITERAL )
                    {
                    // InternalVampireLanguage.g:285:5: (lv_name_14_0= RULE_LITERAL )
                    // InternalVampireLanguage.g:286:6: lv_name_14_0= RULE_LITERAL
                    {
                    lv_name_14_0=(Token)match(input,RULE_LITERAL,FOLLOW_13); 

                    						newLeafNode(lv_name_14_0, grammarAccess.getVLSConfirmationsAccess().getNameLITERALTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSConfirmationsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_14_0,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.LITERAL");
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getVLSConfirmationsAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:308:3: ( () otherlv_17= 'Finite' otherlv_18= 'Model' otherlv_19= 'Found!' )
                    {
                    // InternalVampireLanguage.g:308:3: ( () otherlv_17= 'Finite' otherlv_18= 'Model' otherlv_19= 'Found!' )
                    // InternalVampireLanguage.g:309:4: () otherlv_17= 'Finite' otherlv_18= 'Model' otherlv_19= 'Found!'
                    {
                    // InternalVampireLanguage.g:309:4: ()
                    // InternalVampireLanguage.g:310:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSConfirmationsAccess().getVLSFiniteModelAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_17=(Token)match(input,34,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getVLSConfirmationsAccess().getFiniteKeyword_3_1());
                    			
                    otherlv_18=(Token)match(input,35,FOLLOW_15); 

                    				newLeafNode(otherlv_18, grammarAccess.getVLSConfirmationsAccess().getModelKeyword_3_2());
                    			
                    otherlv_19=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getVLSConfirmationsAccess().getFoundKeyword_3_3());
                    			

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
    // $ANTLR end "ruleVLSConfirmations"


    // $ANTLR start "entryRuleVLSFofFormula"
    // InternalVampireLanguage.g:333:1: entryRuleVLSFofFormula returns [EObject current=null] : iv_ruleVLSFofFormula= ruleVLSFofFormula EOF ;
    public final EObject entryRuleVLSFofFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFofFormula = null;


        try {
            // InternalVampireLanguage.g:333:54: (iv_ruleVLSFofFormula= ruleVLSFofFormula EOF )
            // InternalVampireLanguage.g:334:2: iv_ruleVLSFofFormula= ruleVLSFofFormula EOF
            {
             newCompositeNode(grammarAccess.getVLSFofFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSFofFormula=ruleVLSFofFormula();

            state._fsp--;

             current =iv_ruleVLSFofFormula; 
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
    // $ANTLR end "entryRuleVLSFofFormula"


    // $ANTLR start "ruleVLSFofFormula"
    // InternalVampireLanguage.g:340:1: ruleVLSFofFormula returns [EObject current=null] : (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' ) ;
    public final EObject ruleVLSFofFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token lv_name_2_3=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_fofRole_4_0 = null;

        EObject lv_fofFormula_6_0 = null;

        EObject lv_annotations_8_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:346:2: ( (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' ) )
            // InternalVampireLanguage.g:347:2: (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' )
            {
            // InternalVampireLanguage.g:347:2: (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' )
            // InternalVampireLanguage.g:348:3: otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getVLSFofFormulaAccess().getFofKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getVLSFofFormulaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalVampireLanguage.g:356:3: ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) )
            // InternalVampireLanguage.g:357:4: ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) )
            {
            // InternalVampireLanguage.g:357:4: ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) )
            // InternalVampireLanguage.g:358:5: (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE )
            {
            // InternalVampireLanguage.g:358:5: (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt3=1;
                }
                break;
            case RULE_SIGNED_LITERAL:
                {
                alt3=2;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalVampireLanguage.g:359:6: lv_name_2_1= RULE_LOWER_WORD_ID
                    {
                    lv_name_2_1=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_18); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getVLSFofFormulaAccess().getNameLOWER_WORD_IDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFofFormulaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.LOWER_WORD_ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:374:6: lv_name_2_2= RULE_SIGNED_LITERAL
                    {
                    lv_name_2_2=(Token)match(input,RULE_SIGNED_LITERAL,FOLLOW_18); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getVLSFofFormulaAccess().getNameSIGNED_LITERALTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFofFormulaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.SIGNED_LITERAL");
                    					

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:389:6: lv_name_2_3= RULE_SINGLE_QUOTE
                    {
                    lv_name_2_3=(Token)match(input,RULE_SINGLE_QUOTE,FOLLOW_18); 

                    						newLeafNode(lv_name_2_3, grammarAccess.getVLSFofFormulaAccess().getNameSINGLE_QUOTETerminalRuleCall_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFofFormulaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_3,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.SINGLE_QUOTE");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_3());
            		
            // InternalVampireLanguage.g:410:3: ( (lv_fofRole_4_0= ruleVLSRole ) )
            // InternalVampireLanguage.g:411:4: (lv_fofRole_4_0= ruleVLSRole )
            {
            // InternalVampireLanguage.g:411:4: (lv_fofRole_4_0= ruleVLSRole )
            // InternalVampireLanguage.g:412:5: lv_fofRole_4_0= ruleVLSRole
            {

            					newCompositeNode(grammarAccess.getVLSFofFormulaAccess().getFofRoleVLSRoleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_fofRole_4_0=ruleVLSRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSFofFormulaRule());
            					}
            					set(
            						current,
            						"fofRole",
            						lv_fofRole_4_0,
            						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSRole");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_5());
            		
            // InternalVampireLanguage.g:433:3: ( (lv_fofFormula_6_0= ruleVLSTerm ) )
            // InternalVampireLanguage.g:434:4: (lv_fofFormula_6_0= ruleVLSTerm )
            {
            // InternalVampireLanguage.g:434:4: (lv_fofFormula_6_0= ruleVLSTerm )
            // InternalVampireLanguage.g:435:5: lv_fofFormula_6_0= ruleVLSTerm
            {

            					newCompositeNode(grammarAccess.getVLSFofFormulaAccess().getFofFormulaVLSTermParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_21);
            lv_fofFormula_6_0=ruleVLSTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSFofFormulaRule());
            					}
            					set(
            						current,
            						"fofFormula",
            						lv_fofFormula_6_0,
            						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVampireLanguage.g:452:3: (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==39) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalVampireLanguage.g:453:4: otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) )
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_7_0());
                    			
                    // InternalVampireLanguage.g:457:4: ( (lv_annotations_8_0= ruleVLSAnnotation ) )
                    // InternalVampireLanguage.g:458:5: (lv_annotations_8_0= ruleVLSAnnotation )
                    {
                    // InternalVampireLanguage.g:458:5: (lv_annotations_8_0= ruleVLSAnnotation )
                    // InternalVampireLanguage.g:459:6: lv_annotations_8_0= ruleVLSAnnotation
                    {

                    						newCompositeNode(grammarAccess.getVLSFofFormulaAccess().getAnnotationsVLSAnnotationParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_annotations_8_0=ruleVLSAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVLSFofFormulaRule());
                    						}
                    						set(
                    							current,
                    							"annotations",
                    							lv_annotations_8_0,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,40,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getVLSFofFormulaAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getVLSFofFormulaAccess().getFullStopKeyword_9());
            		

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
    // $ANTLR end "ruleVLSFofFormula"


    // $ANTLR start "entryRuleVLSTffFormula"
    // InternalVampireLanguage.g:489:1: entryRuleVLSTffFormula returns [EObject current=null] : iv_ruleVLSTffFormula= ruleVLSTffFormula EOF ;
    public final EObject entryRuleVLSTffFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSTffFormula = null;


        try {
            // InternalVampireLanguage.g:489:54: (iv_ruleVLSTffFormula= ruleVLSTffFormula EOF )
            // InternalVampireLanguage.g:490:2: iv_ruleVLSTffFormula= ruleVLSTffFormula EOF
            {
             newCompositeNode(grammarAccess.getVLSTffFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSTffFormula=ruleVLSTffFormula();

            state._fsp--;

             current =iv_ruleVLSTffFormula; 
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
    // $ANTLR end "entryRuleVLSTffFormula"


    // $ANTLR start "ruleVLSTffFormula"
    // InternalVampireLanguage.g:496:1: ruleVLSTffFormula returns [EObject current=null] : (otherlv_0= 'tff' otherlv_1= '(' ( (lv_name_2_0= ruleVLSTffName ) ) otherlv_3= ',' ( (lv_tffRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTffTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' ) ;
    public final EObject ruleVLSTffFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_tffRole_4_0 = null;

        EObject lv_fofFormula_6_0 = null;

        EObject lv_annotations_8_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:502:2: ( (otherlv_0= 'tff' otherlv_1= '(' ( (lv_name_2_0= ruleVLSTffName ) ) otherlv_3= ',' ( (lv_tffRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTffTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' ) )
            // InternalVampireLanguage.g:503:2: (otherlv_0= 'tff' otherlv_1= '(' ( (lv_name_2_0= ruleVLSTffName ) ) otherlv_3= ',' ( (lv_tffRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTffTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' )
            {
            // InternalVampireLanguage.g:503:2: (otherlv_0= 'tff' otherlv_1= '(' ( (lv_name_2_0= ruleVLSTffName ) ) otherlv_3= ',' ( (lv_tffRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTffTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' )
            // InternalVampireLanguage.g:504:3: otherlv_0= 'tff' otherlv_1= '(' ( (lv_name_2_0= ruleVLSTffName ) ) otherlv_3= ',' ( (lv_tffRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTffTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getVLSTffFormulaAccess().getTffKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getVLSTffFormulaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalVampireLanguage.g:512:3: ( (lv_name_2_0= ruleVLSTffName ) )
            // InternalVampireLanguage.g:513:4: (lv_name_2_0= ruleVLSTffName )
            {
            // InternalVampireLanguage.g:513:4: (lv_name_2_0= ruleVLSTffName )
            // InternalVampireLanguage.g:514:5: lv_name_2_0= ruleVLSTffName
            {

            					newCompositeNode(grammarAccess.getVLSTffFormulaAccess().getNameVLSTffNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_2_0=ruleVLSTffName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSTffFormulaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSTffName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getVLSTffFormulaAccess().getCommaKeyword_3());
            		
            // InternalVampireLanguage.g:535:3: ( (lv_tffRole_4_0= ruleVLSRole ) )
            // InternalVampireLanguage.g:536:4: (lv_tffRole_4_0= ruleVLSRole )
            {
            // InternalVampireLanguage.g:536:4: (lv_tffRole_4_0= ruleVLSRole )
            // InternalVampireLanguage.g:537:5: lv_tffRole_4_0= ruleVLSRole
            {

            					newCompositeNode(grammarAccess.getVLSTffFormulaAccess().getTffRoleVLSRoleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_tffRole_4_0=ruleVLSRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSTffFormulaRule());
            					}
            					set(
            						current,
            						"tffRole",
            						lv_tffRole_4_0,
            						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSRole");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getVLSTffFormulaAccess().getCommaKeyword_5());
            		
            // InternalVampireLanguage.g:558:3: ( (lv_fofFormula_6_0= ruleVLSTffTerm ) )
            // InternalVampireLanguage.g:559:4: (lv_fofFormula_6_0= ruleVLSTffTerm )
            {
            // InternalVampireLanguage.g:559:4: (lv_fofFormula_6_0= ruleVLSTffTerm )
            // InternalVampireLanguage.g:560:5: lv_fofFormula_6_0= ruleVLSTffTerm
            {

            					newCompositeNode(grammarAccess.getVLSTffFormulaAccess().getFofFormulaVLSTffTermParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_21);
            lv_fofFormula_6_0=ruleVLSTffTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSTffFormulaRule());
            					}
            					set(
            						current,
            						"fofFormula",
            						lv_fofFormula_6_0,
            						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSTffTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVampireLanguage.g:577:3: (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==39) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalVampireLanguage.g:578:4: otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) )
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getVLSTffFormulaAccess().getCommaKeyword_7_0());
                    			
                    // InternalVampireLanguage.g:582:4: ( (lv_annotations_8_0= ruleVLSAnnotation ) )
                    // InternalVampireLanguage.g:583:5: (lv_annotations_8_0= ruleVLSAnnotation )
                    {
                    // InternalVampireLanguage.g:583:5: (lv_annotations_8_0= ruleVLSAnnotation )
                    // InternalVampireLanguage.g:584:6: lv_annotations_8_0= ruleVLSAnnotation
                    {

                    						newCompositeNode(grammarAccess.getVLSTffFormulaAccess().getAnnotationsVLSAnnotationParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_annotations_8_0=ruleVLSAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVLSTffFormulaRule());
                    						}
                    						set(
                    							current,
                    							"annotations",
                    							lv_annotations_8_0,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,40,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getVLSTffFormulaAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getVLSTffFormulaAccess().getFullStopKeyword_9());
            		

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
    // $ANTLR end "ruleVLSTffFormula"


    // $ANTLR start "entryRuleVLSTffName"
    // InternalVampireLanguage.g:614:1: entryRuleVLSTffName returns [String current=null] : iv_ruleVLSTffName= ruleVLSTffName EOF ;
    public final String entryRuleVLSTffName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSTffName = null;


        try {
            // InternalVampireLanguage.g:614:50: (iv_ruleVLSTffName= ruleVLSTffName EOF )
            // InternalVampireLanguage.g:615:2: iv_ruleVLSTffName= ruleVLSTffName EOF
            {
             newCompositeNode(grammarAccess.getVLSTffNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSTffName=ruleVLSTffName();

            state._fsp--;

             current =iv_ruleVLSTffName.getText(); 
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
    // $ANTLR end "entryRuleVLSTffName"


    // $ANTLR start "ruleVLSTffName"
    // InternalVampireLanguage.g:621:1: ruleVLSTffName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VLSTffDeclPred_0= ruleVLSTffDeclPred | this_VLSTffFinite_1= ruleVLSTffFinite | this_VLSTffDistinct_2= ruleVLSTffDistinct ) ;
    public final AntlrDatatypeRuleToken ruleVLSTffName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VLSTffDeclPred_0 = null;

        AntlrDatatypeRuleToken this_VLSTffFinite_1 = null;

        AntlrDatatypeRuleToken this_VLSTffDistinct_2 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:627:2: ( (this_VLSTffDeclPred_0= ruleVLSTffDeclPred | this_VLSTffFinite_1= ruleVLSTffFinite | this_VLSTffDistinct_2= ruleVLSTffDistinct ) )
            // InternalVampireLanguage.g:628:2: (this_VLSTffDeclPred_0= ruleVLSTffDeclPred | this_VLSTffFinite_1= ruleVLSTffFinite | this_VLSTffDistinct_2= ruleVLSTffDistinct )
            {
            // InternalVampireLanguage.g:628:2: (this_VLSTffDeclPred_0= ruleVLSTffDeclPred | this_VLSTffFinite_1= ruleVLSTffFinite | this_VLSTffDistinct_2= ruleVLSTffDistinct )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
            case 45:
                {
                alt6=1;
                }
                break;
            case 44:
                {
                alt6=2;
                }
                break;
            case 43:
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
                    // InternalVampireLanguage.g:629:3: this_VLSTffDeclPred_0= ruleVLSTffDeclPred
                    {

                    			newCompositeNode(grammarAccess.getVLSTffNameAccess().getVLSTffDeclPredParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSTffDeclPred_0=ruleVLSTffDeclPred();

                    state._fsp--;


                    			current.merge(this_VLSTffDeclPred_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:640:3: this_VLSTffFinite_1= ruleVLSTffFinite
                    {

                    			newCompositeNode(grammarAccess.getVLSTffNameAccess().getVLSTffFiniteParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSTffFinite_1=ruleVLSTffFinite();

                    state._fsp--;


                    			current.merge(this_VLSTffFinite_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:651:3: this_VLSTffDistinct_2= ruleVLSTffDistinct
                    {

                    			newCompositeNode(grammarAccess.getVLSTffNameAccess().getVLSTffDistinctParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSTffDistinct_2=ruleVLSTffDistinct();

                    state._fsp--;


                    			current.merge(this_VLSTffDistinct_2);
                    		

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
    // $ANTLR end "ruleVLSTffName"


    // $ANTLR start "entryRuleVLSTffDistinct"
    // InternalVampireLanguage.g:665:1: entryRuleVLSTffDistinct returns [String current=null] : iv_ruleVLSTffDistinct= ruleVLSTffDistinct EOF ;
    public final String entryRuleVLSTffDistinct() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSTffDistinct = null;


        try {
            // InternalVampireLanguage.g:665:54: (iv_ruleVLSTffDistinct= ruleVLSTffDistinct EOF )
            // InternalVampireLanguage.g:666:2: iv_ruleVLSTffDistinct= ruleVLSTffDistinct EOF
            {
             newCompositeNode(grammarAccess.getVLSTffDistinctRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSTffDistinct=ruleVLSTffDistinct();

            state._fsp--;

             current =iv_ruleVLSTffDistinct.getText(); 
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
    // $ANTLR end "entryRuleVLSTffDistinct"


    // $ANTLR start "ruleVLSTffDistinct"
    // InternalVampireLanguage.g:672:1: ruleVLSTffDistinct returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'distinct_domain' ;
    public final AntlrDatatypeRuleToken ruleVLSTffDistinct() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:678:2: (kw= 'distinct_domain' )
            // InternalVampireLanguage.g:679:2: kw= 'distinct_domain'
            {
            kw=(Token)match(input,43,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVLSTffDistinctAccess().getDistinct_domainKeyword());
            	

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
    // $ANTLR end "ruleVLSTffDistinct"


    // $ANTLR start "entryRuleVLSTffFinite"
    // InternalVampireLanguage.g:687:1: entryRuleVLSTffFinite returns [String current=null] : iv_ruleVLSTffFinite= ruleVLSTffFinite EOF ;
    public final String entryRuleVLSTffFinite() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSTffFinite = null;


        try {
            // InternalVampireLanguage.g:687:52: (iv_ruleVLSTffFinite= ruleVLSTffFinite EOF )
            // InternalVampireLanguage.g:688:2: iv_ruleVLSTffFinite= ruleVLSTffFinite EOF
            {
             newCompositeNode(grammarAccess.getVLSTffFiniteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSTffFinite=ruleVLSTffFinite();

            state._fsp--;

             current =iv_ruleVLSTffFinite.getText(); 
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
    // $ANTLR end "entryRuleVLSTffFinite"


    // $ANTLR start "ruleVLSTffFinite"
    // InternalVampireLanguage.g:694:1: ruleVLSTffFinite returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'finite_domain' ;
    public final AntlrDatatypeRuleToken ruleVLSTffFinite() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:700:2: (kw= 'finite_domain' )
            // InternalVampireLanguage.g:701:2: kw= 'finite_domain'
            {
            kw=(Token)match(input,44,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVLSTffFiniteAccess().getFinite_domainKeyword());
            	

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
    // $ANTLR end "ruleVLSTffFinite"


    // $ANTLR start "entryRuleVLSTffDeclPred"
    // InternalVampireLanguage.g:709:1: entryRuleVLSTffDeclPred returns [String current=null] : iv_ruleVLSTffDeclPred= ruleVLSTffDeclPred EOF ;
    public final String entryRuleVLSTffDeclPred() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSTffDeclPred = null;


        try {
            // InternalVampireLanguage.g:709:54: (iv_ruleVLSTffDeclPred= ruleVLSTffDeclPred EOF )
            // InternalVampireLanguage.g:710:2: iv_ruleVLSTffDeclPred= ruleVLSTffDeclPred EOF
            {
             newCompositeNode(grammarAccess.getVLSTffDeclPredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSTffDeclPred=ruleVLSTffDeclPred();

            state._fsp--;

             current =iv_ruleVLSTffDeclPred.getText(); 
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
    // $ANTLR end "entryRuleVLSTffDeclPred"


    // $ANTLR start "ruleVLSTffDeclPred"
    // InternalVampireLanguage.g:716:1: ruleVLSTffDeclPred returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'declare_' this_DOLLAR_ID_1= RULE_DOLLAR_ID ) | this_LOWER_WORD_ID_2= RULE_LOWER_WORD_ID ) ;
    public final AntlrDatatypeRuleToken ruleVLSTffDeclPred() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_DOLLAR_ID_1=null;
        Token this_LOWER_WORD_ID_2=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:722:2: ( ( (kw= 'declare_' this_DOLLAR_ID_1= RULE_DOLLAR_ID ) | this_LOWER_WORD_ID_2= RULE_LOWER_WORD_ID ) )
            // InternalVampireLanguage.g:723:2: ( (kw= 'declare_' this_DOLLAR_ID_1= RULE_DOLLAR_ID ) | this_LOWER_WORD_ID_2= RULE_LOWER_WORD_ID )
            {
            // InternalVampireLanguage.g:723:2: ( (kw= 'declare_' this_DOLLAR_ID_1= RULE_DOLLAR_ID ) | this_LOWER_WORD_ID_2= RULE_LOWER_WORD_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==45) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_LOWER_WORD_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalVampireLanguage.g:724:3: (kw= 'declare_' this_DOLLAR_ID_1= RULE_DOLLAR_ID )
                    {
                    // InternalVampireLanguage.g:724:3: (kw= 'declare_' this_DOLLAR_ID_1= RULE_DOLLAR_ID )
                    // InternalVampireLanguage.g:725:4: kw= 'declare_' this_DOLLAR_ID_1= RULE_DOLLAR_ID
                    {
                    kw=(Token)match(input,45,FOLLOW_26); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVLSTffDeclPredAccess().getDeclare_Keyword_0_0());
                    			
                    this_DOLLAR_ID_1=(Token)match(input,RULE_DOLLAR_ID,FOLLOW_2); 

                    				current.merge(this_DOLLAR_ID_1);
                    			

                    				newLeafNode(this_DOLLAR_ID_1, grammarAccess.getVLSTffDeclPredAccess().getDOLLAR_IDTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:739:3: this_LOWER_WORD_ID_2= RULE_LOWER_WORD_ID
                    {
                    this_LOWER_WORD_ID_2=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 

                    			current.merge(this_LOWER_WORD_ID_2);
                    		

                    			newLeafNode(this_LOWER_WORD_ID_2, grammarAccess.getVLSTffDeclPredAccess().getLOWER_WORD_IDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleVLSTffDeclPred"


    // $ANTLR start "entryRuleVLSRole"
    // InternalVampireLanguage.g:750:1: entryRuleVLSRole returns [String current=null] : iv_ruleVLSRole= ruleVLSRole EOF ;
    public final String entryRuleVLSRole() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSRole = null;


        try {
            // InternalVampireLanguage.g:750:47: (iv_ruleVLSRole= ruleVLSRole EOF )
            // InternalVampireLanguage.g:751:2: iv_ruleVLSRole= ruleVLSRole EOF
            {
             newCompositeNode(grammarAccess.getVLSRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSRole=ruleVLSRole();

            state._fsp--;

             current =iv_ruleVLSRole.getText(); 
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
    // $ANTLR end "entryRuleVLSRole"


    // $ANTLR start "ruleVLSRole"
    // InternalVampireLanguage.g:757:1: ruleVLSRole returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'axiom' | kw= 'conjecture' | kw= 'hypothesis' | kw= 'definition' | kw= 'assumption' | kw= 'lemma' | kw= 'theorem' | kw= 'corollary' | kw= 'negated_conjecture' | kw= 'plain' | kw= 'type' | kw= 'fi_domain' | kw= 'fi_functors' | kw= 'fi_predicates' | kw= 'unknown' ) ;
    public final AntlrDatatypeRuleToken ruleVLSRole() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:763:2: ( (kw= 'axiom' | kw= 'conjecture' | kw= 'hypothesis' | kw= 'definition' | kw= 'assumption' | kw= 'lemma' | kw= 'theorem' | kw= 'corollary' | kw= 'negated_conjecture' | kw= 'plain' | kw= 'type' | kw= 'fi_domain' | kw= 'fi_functors' | kw= 'fi_predicates' | kw= 'unknown' ) )
            // InternalVampireLanguage.g:764:2: (kw= 'axiom' | kw= 'conjecture' | kw= 'hypothesis' | kw= 'definition' | kw= 'assumption' | kw= 'lemma' | kw= 'theorem' | kw= 'corollary' | kw= 'negated_conjecture' | kw= 'plain' | kw= 'type' | kw= 'fi_domain' | kw= 'fi_functors' | kw= 'fi_predicates' | kw= 'unknown' )
            {
            // InternalVampireLanguage.g:764:2: (kw= 'axiom' | kw= 'conjecture' | kw= 'hypothesis' | kw= 'definition' | kw= 'assumption' | kw= 'lemma' | kw= 'theorem' | kw= 'corollary' | kw= 'negated_conjecture' | kw= 'plain' | kw= 'type' | kw= 'fi_domain' | kw= 'fi_functors' | kw= 'fi_predicates' | kw= 'unknown' )
            int alt8=15;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt8=1;
                }
                break;
            case 47:
                {
                alt8=2;
                }
                break;
            case 48:
                {
                alt8=3;
                }
                break;
            case 49:
                {
                alt8=4;
                }
                break;
            case 50:
                {
                alt8=5;
                }
                break;
            case 51:
                {
                alt8=6;
                }
                break;
            case 52:
                {
                alt8=7;
                }
                break;
            case 53:
                {
                alt8=8;
                }
                break;
            case 54:
                {
                alt8=9;
                }
                break;
            case 55:
                {
                alt8=10;
                }
                break;
            case 56:
                {
                alt8=11;
                }
                break;
            case 57:
                {
                alt8=12;
                }
                break;
            case 58:
                {
                alt8=13;
                }
                break;
            case 59:
                {
                alt8=14;
                }
                break;
            case 60:
                {
                alt8=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalVampireLanguage.g:765:3: kw= 'axiom'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getAxiomKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:771:3: kw= 'conjecture'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getConjectureKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:777:3: kw= 'hypothesis'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getHypothesisKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:783:3: kw= 'definition'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getDefinitionKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:789:3: kw= 'assumption'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getAssumptionKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalVampireLanguage.g:795:3: kw= 'lemma'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getLemmaKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalVampireLanguage.g:801:3: kw= 'theorem'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getTheoremKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalVampireLanguage.g:807:3: kw= 'corollary'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getCorollaryKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalVampireLanguage.g:813:3: kw= 'negated_conjecture'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getNegated_conjectureKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalVampireLanguage.g:819:3: kw= 'plain'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getPlainKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalVampireLanguage.g:825:3: kw= 'type'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getTypeKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalVampireLanguage.g:831:3: kw= 'fi_domain'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getFi_domainKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalVampireLanguage.g:837:3: kw= 'fi_functors'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getFi_functorsKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalVampireLanguage.g:843:3: kw= 'fi_predicates'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getFi_predicatesKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalVampireLanguage.g:849:3: kw= 'unknown'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getUnknownKeyword_14());
                    		

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
    // $ANTLR end "ruleVLSRole"


    // $ANTLR start "entryRuleVLSAnnotation"
    // InternalVampireLanguage.g:858:1: entryRuleVLSAnnotation returns [EObject current=null] : iv_ruleVLSAnnotation= ruleVLSAnnotation EOF ;
    public final EObject entryRuleVLSAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAnnotation = null;


        try {
            // InternalVampireLanguage.g:858:54: (iv_ruleVLSAnnotation= ruleVLSAnnotation EOF )
            // InternalVampireLanguage.g:859:2: iv_ruleVLSAnnotation= ruleVLSAnnotation EOF
            {
             newCompositeNode(grammarAccess.getVLSAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSAnnotation=ruleVLSAnnotation();

            state._fsp--;

             current =iv_ruleVLSAnnotation; 
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
    // $ANTLR end "entryRuleVLSAnnotation"


    // $ANTLR start "ruleVLSAnnotation"
    // InternalVampireLanguage.g:865:1: ruleVLSAnnotation returns [EObject current=null] : ( (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )? ) ;
    public final EObject ruleVLSAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_3 = null;

        EObject lv_followup_3_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:871:2: ( ( (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )? ) )
            // InternalVampireLanguage.g:872:2: ( (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )? )
            {
            // InternalVampireLanguage.g:872:2: ( (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )? )
            // InternalVampireLanguage.g:873:3: (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )?
            {
            // InternalVampireLanguage.g:873:3: (otherlv_0= '[' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVampireLanguage.g:874:4: otherlv_0= '['
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getVLSAnnotationAccess().getLeftSquareBracketKeyword_0());
                    			

                    }
                    break;

            }

            // InternalVampireLanguage.g:879:3: ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_LOWER_WORD_ID||LA11_0==RULE_SINGLE_QUOTE||(LA11_0>=46 && LA11_0<=60)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVampireLanguage.g:880:4: ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) )
                    {
                    // InternalVampireLanguage.g:880:4: ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) )
                    // InternalVampireLanguage.g:881:5: (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:881:5: (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole )
                    int alt10=3;
                    switch ( input.LA(1) ) {
                    case RULE_LOWER_WORD_ID:
                        {
                        alt10=1;
                        }
                        break;
                    case RULE_SINGLE_QUOTE:
                        {
                        alt10=2;
                        }
                        break;
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
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
                            // InternalVampireLanguage.g:882:6: lv_name_1_1= RULE_LOWER_WORD_ID
                            {
                            lv_name_1_1=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_28); 

                            						newLeafNode(lv_name_1_1, grammarAccess.getVLSAnnotationAccess().getNameLOWER_WORD_IDTerminalRuleCall_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVLSAnnotationRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"name",
                            							lv_name_1_1,
                            							"ca.mcgill.ecse.dslreasoner.VampireLanguage.LOWER_WORD_ID");
                            					

                            }
                            break;
                        case 2 :
                            // InternalVampireLanguage.g:897:6: lv_name_1_2= RULE_SINGLE_QUOTE
                            {
                            lv_name_1_2=(Token)match(input,RULE_SINGLE_QUOTE,FOLLOW_28); 

                            						newLeafNode(lv_name_1_2, grammarAccess.getVLSAnnotationAccess().getNameSINGLE_QUOTETerminalRuleCall_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVLSAnnotationRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"name",
                            							lv_name_1_2,
                            							"ca.mcgill.ecse.dslreasoner.VampireLanguage.SINGLE_QUOTE");
                            					

                            }
                            break;
                        case 3 :
                            // InternalVampireLanguage.g:912:6: lv_name_1_3= ruleVLSRole
                            {

                            						newCompositeNode(grammarAccess.getVLSAnnotationAccess().getNameVLSRoleParserRuleCall_1_0_2());
                            					
                            pushFollow(FOLLOW_28);
                            lv_name_1_3=ruleVLSRole();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getVLSAnnotationRule());
                            						}
                            						set(
                            							current,
                            							"name",
                            							lv_name_1_3,
                            							"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSRole");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalVampireLanguage.g:930:3: (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==38) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVampireLanguage.g:931:4: otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getVLSAnnotationAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalVampireLanguage.g:935:4: ( (lv_followup_3_0= ruleVLSAnnotationTerms ) )
                    // InternalVampireLanguage.g:936:5: (lv_followup_3_0= ruleVLSAnnotationTerms )
                    {
                    // InternalVampireLanguage.g:936:5: (lv_followup_3_0= ruleVLSAnnotationTerms )
                    // InternalVampireLanguage.g:937:6: lv_followup_3_0= ruleVLSAnnotationTerms
                    {

                    						newCompositeNode(grammarAccess.getVLSAnnotationAccess().getFollowupVLSAnnotationTermsParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_followup_3_0=ruleVLSAnnotationTerms();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVLSAnnotationRule());
                    						}
                    						set(
                    							current,
                    							"followup",
                    							lv_followup_3_0,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSAnnotationTerms");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,40,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getVLSAnnotationAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalVampireLanguage.g:959:3: (otherlv_5= ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVampireLanguage.g:960:4: otherlv_5= ']'
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getVLSAnnotationAccess().getRightSquareBracketKeyword_3());
                    			

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
    // $ANTLR end "ruleVLSAnnotation"


    // $ANTLR start "entryRuleVLSAnnotationTerms"
    // InternalVampireLanguage.g:969:1: entryRuleVLSAnnotationTerms returns [EObject current=null] : iv_ruleVLSAnnotationTerms= ruleVLSAnnotationTerms EOF ;
    public final EObject entryRuleVLSAnnotationTerms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAnnotationTerms = null;


        try {
            // InternalVampireLanguage.g:969:59: (iv_ruleVLSAnnotationTerms= ruleVLSAnnotationTerms EOF )
            // InternalVampireLanguage.g:970:2: iv_ruleVLSAnnotationTerms= ruleVLSAnnotationTerms EOF
            {
             newCompositeNode(grammarAccess.getVLSAnnotationTermsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSAnnotationTerms=ruleVLSAnnotationTerms();

            state._fsp--;

             current =iv_ruleVLSAnnotationTerms; 
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
    // $ANTLR end "entryRuleVLSAnnotationTerms"


    // $ANTLR start "ruleVLSAnnotationTerms"
    // InternalVampireLanguage.g:976:1: ruleVLSAnnotationTerms returns [EObject current=null] : ( ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )* ) ;
    public final EObject ruleVLSAnnotationTerms() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_terms_0_0 = null;

        EObject lv_terms_2_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:982:2: ( ( ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )* ) )
            // InternalVampireLanguage.g:983:2: ( ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )* )
            {
            // InternalVampireLanguage.g:983:2: ( ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )* )
            // InternalVampireLanguage.g:984:3: ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )*
            {
            // InternalVampireLanguage.g:984:3: ( (lv_terms_0_0= ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:985:4: (lv_terms_0_0= ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:985:4: (lv_terms_0_0= ruleVLSAnnotation )
            // InternalVampireLanguage.g:986:5: lv_terms_0_0= ruleVLSAnnotation
            {

            					newCompositeNode(grammarAccess.getVLSAnnotationTermsAccess().getTermsVLSAnnotationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_terms_0_0=ruleVLSAnnotation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSAnnotationTermsRule());
            					}
            					add(
            						current,
            						"terms",
            						lv_terms_0_0,
            						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSAnnotation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVampireLanguage.g:1003:3: (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalVampireLanguage.g:1004:4: otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) )
            	    {
            	    otherlv_1=(Token)match(input,39,FOLLOW_29); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVLSAnnotationTermsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalVampireLanguage.g:1008:4: ( (lv_terms_2_0= ruleVLSAnnotation ) )
            	    // InternalVampireLanguage.g:1009:5: (lv_terms_2_0= ruleVLSAnnotation )
            	    {
            	    // InternalVampireLanguage.g:1009:5: (lv_terms_2_0= ruleVLSAnnotation )
            	    // InternalVampireLanguage.g:1010:6: lv_terms_2_0= ruleVLSAnnotation
            	    {

            	    						newCompositeNode(grammarAccess.getVLSAnnotationTermsAccess().getTermsVLSAnnotationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_terms_2_0=ruleVLSAnnotation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVLSAnnotationTermsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"terms",
            	    							lv_terms_2_0,
            	    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSAnnotation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleVLSAnnotationTerms"


    // $ANTLR start "entryRuleVLSTffTerm"
    // InternalVampireLanguage.g:1032:1: entryRuleVLSTffTerm returns [EObject current=null] : iv_ruleVLSTffTerm= ruleVLSTffTerm EOF ;
    public final EObject entryRuleVLSTffTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSTffTerm = null;


        try {
            // InternalVampireLanguage.g:1032:51: (iv_ruleVLSTffTerm= ruleVLSTffTerm EOF )
            // InternalVampireLanguage.g:1033:2: iv_ruleVLSTffTerm= ruleVLSTffTerm EOF
            {
             newCompositeNode(grammarAccess.getVLSTffTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSTffTerm=ruleVLSTffTerm();

            state._fsp--;

             current =iv_ruleVLSTffTerm; 
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
    // $ANTLR end "entryRuleVLSTffTerm"


    // $ANTLR start "ruleVLSTffTerm"
    // InternalVampireLanguage.g:1039:1: ruleVLSTffTerm returns [EObject current=null] : (this_VLSTerm_0= ruleVLSTerm | this_VLSDeclaration_1= ruleVLSDeclaration ) ;
    public final EObject ruleVLSTffTerm() throws RecognitionException {
        EObject current = null;

        EObject this_VLSTerm_0 = null;

        EObject this_VLSDeclaration_1 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1045:2: ( (this_VLSTerm_0= ruleVLSTerm | this_VLSDeclaration_1= ruleVLSDeclaration ) )
            // InternalVampireLanguage.g:1046:2: (this_VLSTerm_0= ruleVLSTerm | this_VLSDeclaration_1= ruleVLSDeclaration )
            {
            // InternalVampireLanguage.g:1046:2: (this_VLSTerm_0= ruleVLSTerm | this_VLSDeclaration_1= ruleVLSDeclaration )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalVampireLanguage.g:1047:3: this_VLSTerm_0= ruleVLSTerm
                    {

                    			newCompositeNode(grammarAccess.getVLSTffTermAccess().getVLSTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSTerm_0=ruleVLSTerm();

                    state._fsp--;


                    			current = this_VLSTerm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1056:3: this_VLSDeclaration_1= ruleVLSDeclaration
                    {

                    			newCompositeNode(grammarAccess.getVLSTffTermAccess().getVLSDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSDeclaration_1=ruleVLSDeclaration();

                    state._fsp--;


                    			current = this_VLSDeclaration_1;
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
    // $ANTLR end "ruleVLSTffTerm"


    // $ANTLR start "entryRuleVLSDeclaration"
    // InternalVampireLanguage.g:1068:1: entryRuleVLSDeclaration returns [EObject current=null] : iv_ruleVLSDeclaration= ruleVLSDeclaration EOF ;
    public final EObject entryRuleVLSDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSDeclaration = null;


        try {
            // InternalVampireLanguage.g:1068:55: (iv_ruleVLSDeclaration= ruleVLSDeclaration EOF )
            // InternalVampireLanguage.g:1069:2: iv_ruleVLSDeclaration= ruleVLSDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVLSDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSDeclaration=ruleVLSDeclaration();

            state._fsp--;

             current =iv_ruleVLSDeclaration; 
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
    // $ANTLR end "entryRuleVLSDeclaration"


    // $ANTLR start "ruleVLSDeclaration"
    // InternalVampireLanguage.g:1075:1: ruleVLSDeclaration returns [EObject current=null] : (this_VLSVariableDeclaration_0= ruleVLSVariableDeclaration | this_VLSOtherDeclaration_1= ruleVLSOtherDeclaration ) ;
    public final EObject ruleVLSDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VLSVariableDeclaration_0 = null;

        EObject this_VLSOtherDeclaration_1 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1081:2: ( (this_VLSVariableDeclaration_0= ruleVLSVariableDeclaration | this_VLSOtherDeclaration_1= ruleVLSOtherDeclaration ) )
            // InternalVampireLanguage.g:1082:2: (this_VLSVariableDeclaration_0= ruleVLSVariableDeclaration | this_VLSOtherDeclaration_1= ruleVLSOtherDeclaration )
            {
            // InternalVampireLanguage.g:1082:2: (this_VLSVariableDeclaration_0= ruleVLSVariableDeclaration | this_VLSOtherDeclaration_1= ruleVLSOtherDeclaration )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_UPPER_WORD_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_LOWER_WORD_ID||(LA16_0>=RULE_SINGLE_QUOTE && LA16_0<=RULE_DOUBLE_DOLLAR_ID)||(LA16_0>=46 && LA16_0<=60)||(LA16_0>=78 && LA16_0<=79)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalVampireLanguage.g:1083:3: this_VLSVariableDeclaration_0= ruleVLSVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getVLSDeclarationAccess().getVLSVariableDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSVariableDeclaration_0=ruleVLSVariableDeclaration();

                    state._fsp--;


                    			current = this_VLSVariableDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1092:3: this_VLSOtherDeclaration_1= ruleVLSOtherDeclaration
                    {

                    			newCompositeNode(grammarAccess.getVLSDeclarationAccess().getVLSOtherDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSOtherDeclaration_1=ruleVLSOtherDeclaration();

                    state._fsp--;


                    			current = this_VLSOtherDeclaration_1;
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
    // $ANTLR end "ruleVLSDeclaration"


    // $ANTLR start "entryRuleVLSOtherDeclaration"
    // InternalVampireLanguage.g:1104:1: entryRuleVLSOtherDeclaration returns [EObject current=null] : iv_ruleVLSOtherDeclaration= ruleVLSOtherDeclaration EOF ;
    public final EObject entryRuleVLSOtherDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSOtherDeclaration = null;


        try {
            // InternalVampireLanguage.g:1104:60: (iv_ruleVLSOtherDeclaration= ruleVLSOtherDeclaration EOF )
            // InternalVampireLanguage.g:1105:2: iv_ruleVLSOtherDeclaration= ruleVLSOtherDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVLSOtherDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSOtherDeclaration=ruleVLSOtherDeclaration();

            state._fsp--;

             current =iv_ruleVLSOtherDeclaration; 
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
    // $ANTLR end "entryRuleVLSOtherDeclaration"


    // $ANTLR start "ruleVLSOtherDeclaration"
    // InternalVampireLanguage.g:1111:1: ruleVLSOtherDeclaration returns [EObject current=null] : (this_VLSAtomicConstant_0= ruleVLSAtomicConstant otherlv_1= ':' ( (lv_type_2_0= ruleVLSTypeDef ) ) ) ;
    public final EObject ruleVLSOtherDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_VLSAtomicConstant_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1117:2: ( (this_VLSAtomicConstant_0= ruleVLSAtomicConstant otherlv_1= ':' ( (lv_type_2_0= ruleVLSTypeDef ) ) ) )
            // InternalVampireLanguage.g:1118:2: (this_VLSAtomicConstant_0= ruleVLSAtomicConstant otherlv_1= ':' ( (lv_type_2_0= ruleVLSTypeDef ) ) )
            {
            // InternalVampireLanguage.g:1118:2: (this_VLSAtomicConstant_0= ruleVLSAtomicConstant otherlv_1= ':' ( (lv_type_2_0= ruleVLSTypeDef ) ) )
            // InternalVampireLanguage.g:1119:3: this_VLSAtomicConstant_0= ruleVLSAtomicConstant otherlv_1= ':' ( (lv_type_2_0= ruleVLSTypeDef ) )
            {

            			newCompositeNode(grammarAccess.getVLSOtherDeclarationAccess().getVLSAtomicConstantParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_VLSAtomicConstant_0=ruleVLSAtomicConstant();

            state._fsp--;


            			current = this_VLSAtomicConstant_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,61,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getVLSOtherDeclarationAccess().getColonKeyword_1());
            		
            // InternalVampireLanguage.g:1131:3: ( (lv_type_2_0= ruleVLSTypeDef ) )
            // InternalVampireLanguage.g:1132:4: (lv_type_2_0= ruleVLSTypeDef )
            {
            // InternalVampireLanguage.g:1132:4: (lv_type_2_0= ruleVLSTypeDef )
            // InternalVampireLanguage.g:1133:5: lv_type_2_0= ruleVLSTypeDef
            {

            					newCompositeNode(grammarAccess.getVLSOtherDeclarationAccess().getTypeVLSTypeDefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleVLSTypeDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSOtherDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSTypeDef");
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
    // $ANTLR end "ruleVLSOtherDeclaration"


    // $ANTLR start "entryRuleVLSVariableDeclaration"
    // InternalVampireLanguage.g:1154:1: entryRuleVLSVariableDeclaration returns [EObject current=null] : iv_ruleVLSVariableDeclaration= ruleVLSVariableDeclaration EOF ;
    public final EObject entryRuleVLSVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSVariableDeclaration = null;


        try {
            // InternalVampireLanguage.g:1154:63: (iv_ruleVLSVariableDeclaration= ruleVLSVariableDeclaration EOF )
            // InternalVampireLanguage.g:1155:2: iv_ruleVLSVariableDeclaration= ruleVLSVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVLSVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSVariableDeclaration=ruleVLSVariableDeclaration();

            state._fsp--;

             current =iv_ruleVLSVariableDeclaration; 
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
    // $ANTLR end "entryRuleVLSVariableDeclaration"


    // $ANTLR start "ruleVLSVariableDeclaration"
    // InternalVampireLanguage.g:1161:1: ruleVLSVariableDeclaration returns [EObject current=null] : (this_VLSVariable_0= ruleVLSVariable otherlv_1= ':' ( (lv_type_2_0= ruleVLSTypeDef ) ) ) ;
    public final EObject ruleVLSVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_VLSVariable_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1167:2: ( (this_VLSVariable_0= ruleVLSVariable otherlv_1= ':' ( (lv_type_2_0= ruleVLSTypeDef ) ) ) )
            // InternalVampireLanguage.g:1168:2: (this_VLSVariable_0= ruleVLSVariable otherlv_1= ':' ( (lv_type_2_0= ruleVLSTypeDef ) ) )
            {
            // InternalVampireLanguage.g:1168:2: (this_VLSVariable_0= ruleVLSVariable otherlv_1= ':' ( (lv_type_2_0= ruleVLSTypeDef ) ) )
            // InternalVampireLanguage.g:1169:3: this_VLSVariable_0= ruleVLSVariable otherlv_1= ':' ( (lv_type_2_0= ruleVLSTypeDef ) )
            {

            			newCompositeNode(grammarAccess.getVLSVariableDeclarationAccess().getVLSVariableParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_VLSVariable_0=ruleVLSVariable();

            state._fsp--;


            			current = this_VLSVariable_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,61,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getVLSVariableDeclarationAccess().getColonKeyword_1());
            		
            // InternalVampireLanguage.g:1181:3: ( (lv_type_2_0= ruleVLSTypeDef ) )
            // InternalVampireLanguage.g:1182:4: (lv_type_2_0= ruleVLSTypeDef )
            {
            // InternalVampireLanguage.g:1182:4: (lv_type_2_0= ruleVLSTypeDef )
            // InternalVampireLanguage.g:1183:5: lv_type_2_0= ruleVLSTypeDef
            {

            					newCompositeNode(grammarAccess.getVLSVariableDeclarationAccess().getTypeVLSTypeDefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleVLSTypeDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSVariableDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSTypeDef");
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
    // $ANTLR end "ruleVLSVariableDeclaration"


    // $ANTLR start "entryRuleVLSTypeDef"
    // InternalVampireLanguage.g:1204:1: entryRuleVLSTypeDef returns [EObject current=null] : iv_ruleVLSTypeDef= ruleVLSTypeDef EOF ;
    public final EObject entryRuleVLSTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSTypeDef = null;


        try {
            // InternalVampireLanguage.g:1204:51: (iv_ruleVLSTypeDef= ruleVLSTypeDef EOF )
            // InternalVampireLanguage.g:1205:2: iv_ruleVLSTypeDef= ruleVLSTypeDef EOF
            {
             newCompositeNode(grammarAccess.getVLSTypeDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSTypeDef=ruleVLSTypeDef();

            state._fsp--;

             current =iv_ruleVLSTypeDef; 
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
    // $ANTLR end "entryRuleVLSTypeDef"


    // $ANTLR start "ruleVLSTypeDef"
    // InternalVampireLanguage.g:1211:1: ruleVLSTypeDef returns [EObject current=null] : ( ( (lv_typeSig_0_0= ruleVLSUnitaryTerm ) ) (otherlv_1= '>' ( (lv_mapsTo_2_0= ruleVLSAtomicConstant ) ) )? ) ;
    public final EObject ruleVLSTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_typeSig_0_0 = null;

        EObject lv_mapsTo_2_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1217:2: ( ( ( (lv_typeSig_0_0= ruleVLSUnitaryTerm ) ) (otherlv_1= '>' ( (lv_mapsTo_2_0= ruleVLSAtomicConstant ) ) )? ) )
            // InternalVampireLanguage.g:1218:2: ( ( (lv_typeSig_0_0= ruleVLSUnitaryTerm ) ) (otherlv_1= '>' ( (lv_mapsTo_2_0= ruleVLSAtomicConstant ) ) )? )
            {
            // InternalVampireLanguage.g:1218:2: ( ( (lv_typeSig_0_0= ruleVLSUnitaryTerm ) ) (otherlv_1= '>' ( (lv_mapsTo_2_0= ruleVLSAtomicConstant ) ) )? )
            // InternalVampireLanguage.g:1219:3: ( (lv_typeSig_0_0= ruleVLSUnitaryTerm ) ) (otherlv_1= '>' ( (lv_mapsTo_2_0= ruleVLSAtomicConstant ) ) )?
            {
            // InternalVampireLanguage.g:1219:3: ( (lv_typeSig_0_0= ruleVLSUnitaryTerm ) )
            // InternalVampireLanguage.g:1220:4: (lv_typeSig_0_0= ruleVLSUnitaryTerm )
            {
            // InternalVampireLanguage.g:1220:4: (lv_typeSig_0_0= ruleVLSUnitaryTerm )
            // InternalVampireLanguage.g:1221:5: lv_typeSig_0_0= ruleVLSUnitaryTerm
            {

            					newCompositeNode(grammarAccess.getVLSTypeDefAccess().getTypeSigVLSUnitaryTermParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_typeSig_0_0=ruleVLSUnitaryTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSTypeDefRule());
            					}
            					set(
            						current,
            						"typeSig",
            						lv_typeSig_0_0,
            						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSUnitaryTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVampireLanguage.g:1238:3: (otherlv_1= '>' ( (lv_mapsTo_2_0= ruleVLSAtomicConstant ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==62) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVampireLanguage.g:1239:4: otherlv_1= '>' ( (lv_mapsTo_2_0= ruleVLSAtomicConstant ) )
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getVLSTypeDefAccess().getGreaterThanSignKeyword_1_0());
                    			
                    // InternalVampireLanguage.g:1243:4: ( (lv_mapsTo_2_0= ruleVLSAtomicConstant ) )
                    // InternalVampireLanguage.g:1244:5: (lv_mapsTo_2_0= ruleVLSAtomicConstant )
                    {
                    // InternalVampireLanguage.g:1244:5: (lv_mapsTo_2_0= ruleVLSAtomicConstant )
                    // InternalVampireLanguage.g:1245:6: lv_mapsTo_2_0= ruleVLSAtomicConstant
                    {

                    						newCompositeNode(grammarAccess.getVLSTypeDefAccess().getMapsToVLSAtomicConstantParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_mapsTo_2_0=ruleVLSAtomicConstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVLSTypeDefRule());
                    						}
                    						set(
                    							current,
                    							"mapsTo",
                    							lv_mapsTo_2_0,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSAtomicConstant");
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
    // $ANTLR end "ruleVLSTypeDef"


    // $ANTLR start "entryRuleVLSUnitaryTerm"
    // InternalVampireLanguage.g:1267:1: entryRuleVLSUnitaryTerm returns [EObject current=null] : iv_ruleVLSUnitaryTerm= ruleVLSUnitaryTerm EOF ;
    public final EObject entryRuleVLSUnitaryTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUnitaryTerm = null;


        try {
            // InternalVampireLanguage.g:1267:55: (iv_ruleVLSUnitaryTerm= ruleVLSUnitaryTerm EOF )
            // InternalVampireLanguage.g:1268:2: iv_ruleVLSUnitaryTerm= ruleVLSUnitaryTerm EOF
            {
             newCompositeNode(grammarAccess.getVLSUnitaryTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSUnitaryTerm=ruleVLSUnitaryTerm();

            state._fsp--;

             current =iv_ruleVLSUnitaryTerm; 
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
    // $ANTLR end "entryRuleVLSUnitaryTerm"


    // $ANTLR start "ruleVLSUnitaryTerm"
    // InternalVampireLanguage.g:1274:1: ruleVLSUnitaryTerm returns [EObject current=null] : ( ( (lv_initType_0_0= ruleVLSAtomic ) ) (otherlv_1= '*' ( (lv_nextType_2_0= ruleVLSAtomicConstant ) ) )* ) ;
    public final EObject ruleVLSUnitaryTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_initType_0_0 = null;

        EObject lv_nextType_2_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1280:2: ( ( ( (lv_initType_0_0= ruleVLSAtomic ) ) (otherlv_1= '*' ( (lv_nextType_2_0= ruleVLSAtomicConstant ) ) )* ) )
            // InternalVampireLanguage.g:1281:2: ( ( (lv_initType_0_0= ruleVLSAtomic ) ) (otherlv_1= '*' ( (lv_nextType_2_0= ruleVLSAtomicConstant ) ) )* )
            {
            // InternalVampireLanguage.g:1281:2: ( ( (lv_initType_0_0= ruleVLSAtomic ) ) (otherlv_1= '*' ( (lv_nextType_2_0= ruleVLSAtomicConstant ) ) )* )
            // InternalVampireLanguage.g:1282:3: ( (lv_initType_0_0= ruleVLSAtomic ) ) (otherlv_1= '*' ( (lv_nextType_2_0= ruleVLSAtomicConstant ) ) )*
            {
            // InternalVampireLanguage.g:1282:3: ( (lv_initType_0_0= ruleVLSAtomic ) )
            // InternalVampireLanguage.g:1283:4: (lv_initType_0_0= ruleVLSAtomic )
            {
            // InternalVampireLanguage.g:1283:4: (lv_initType_0_0= ruleVLSAtomic )
            // InternalVampireLanguage.g:1284:5: lv_initType_0_0= ruleVLSAtomic
            {

            					newCompositeNode(grammarAccess.getVLSUnitaryTermAccess().getInitTypeVLSAtomicParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_initType_0_0=ruleVLSAtomic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSUnitaryTermRule());
            					}
            					set(
            						current,
            						"initType",
            						lv_initType_0_0,
            						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSAtomic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVampireLanguage.g:1301:3: (otherlv_1= '*' ( (lv_nextType_2_0= ruleVLSAtomicConstant ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==63) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalVampireLanguage.g:1302:4: otherlv_1= '*' ( (lv_nextType_2_0= ruleVLSAtomicConstant ) )
            	    {
            	    otherlv_1=(Token)match(input,63,FOLLOW_35); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVLSUnitaryTermAccess().getAsteriskKeyword_1_0());
            	    			
            	    // InternalVampireLanguage.g:1306:4: ( (lv_nextType_2_0= ruleVLSAtomicConstant ) )
            	    // InternalVampireLanguage.g:1307:5: (lv_nextType_2_0= ruleVLSAtomicConstant )
            	    {
            	    // InternalVampireLanguage.g:1307:5: (lv_nextType_2_0= ruleVLSAtomicConstant )
            	    // InternalVampireLanguage.g:1308:6: lv_nextType_2_0= ruleVLSAtomicConstant
            	    {

            	    						newCompositeNode(grammarAccess.getVLSUnitaryTermAccess().getNextTypeVLSAtomicConstantParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_nextType_2_0=ruleVLSAtomicConstant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVLSUnitaryTermRule());
            	    						}
            	    						set(
            	    							current,
            	    							"nextType",
            	    							lv_nextType_2_0,
            	    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSAtomicConstant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleVLSUnitaryTerm"


    // $ANTLR start "entryRuleVLSTerm"
    // InternalVampireLanguage.g:1330:1: entryRuleVLSTerm returns [EObject current=null] : iv_ruleVLSTerm= ruleVLSTerm EOF ;
    public final EObject entryRuleVLSTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSTerm = null;


        try {
            // InternalVampireLanguage.g:1330:48: (iv_ruleVLSTerm= ruleVLSTerm EOF )
            // InternalVampireLanguage.g:1331:2: iv_ruleVLSTerm= ruleVLSTerm EOF
            {
             newCompositeNode(grammarAccess.getVLSTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSTerm=ruleVLSTerm();

            state._fsp--;

             current =iv_ruleVLSTerm; 
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
    // $ANTLR end "entryRuleVLSTerm"


    // $ANTLR start "ruleVLSTerm"
    // InternalVampireLanguage.g:1337:1: ruleVLSTerm returns [EObject current=null] : this_VLSBinary_0= ruleVLSBinary ;
    public final EObject ruleVLSTerm() throws RecognitionException {
        EObject current = null;

        EObject this_VLSBinary_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1343:2: (this_VLSBinary_0= ruleVLSBinary )
            // InternalVampireLanguage.g:1344:2: this_VLSBinary_0= ruleVLSBinary
            {

            		newCompositeNode(grammarAccess.getVLSTermAccess().getVLSBinaryParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_VLSBinary_0=ruleVLSBinary();

            state._fsp--;


            		current = this_VLSBinary_0;
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
    // $ANTLR end "ruleVLSTerm"


    // $ANTLR start "entryRuleVLSBinary"
    // InternalVampireLanguage.g:1355:1: entryRuleVLSBinary returns [EObject current=null] : iv_ruleVLSBinary= ruleVLSBinary EOF ;
    public final EObject entryRuleVLSBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSBinary = null;


        try {
            // InternalVampireLanguage.g:1355:50: (iv_ruleVLSBinary= ruleVLSBinary EOF )
            // InternalVampireLanguage.g:1356:2: iv_ruleVLSBinary= ruleVLSBinary EOF
            {
             newCompositeNode(grammarAccess.getVLSBinaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSBinary=ruleVLSBinary();

            state._fsp--;

             current =iv_ruleVLSBinary; 
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
    // $ANTLR end "entryRuleVLSBinary"


    // $ANTLR start "ruleVLSBinary"
    // InternalVampireLanguage.g:1362:1: ruleVLSBinary returns [EObject current=null] : (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? ) ;
    public final EObject ruleVLSBinary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        EObject this_VLSUnitaryFormula_0 = null;

        EObject lv_right_13_0 = null;

        EObject lv_right_16_0 = null;

        EObject lv_right_19_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1368:2: ( (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? ) )
            // InternalVampireLanguage.g:1369:2: (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? )
            {
            // InternalVampireLanguage.g:1369:2: (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? )
            // InternalVampireLanguage.g:1370:3: this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getVLSBinaryAccess().getVLSUnitaryFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_VLSUnitaryFormula_0=ruleVLSUnitaryFormula();

            state._fsp--;


            			current = this_VLSUnitaryFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalVampireLanguage.g:1378:3: ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )?
            int alt22=4;
            switch ( input.LA(1) ) {
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                    {
                    alt22=1;
                    }
                    break;
                case 70:
                    {
                    alt22=2;
                    }
                    break;
                case 71:
                    {
                    alt22=3;
                    }
                    break;
            }

            switch (alt22) {
                case 1 :
                    // InternalVampireLanguage.g:1379:4: ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) )
                    {
                    // InternalVampireLanguage.g:1379:4: ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) )
                    // InternalVampireLanguage.g:1380:5: ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) )
                    {
                    // InternalVampireLanguage.g:1380:5: ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) )
                    int alt19=6;
                    switch ( input.LA(1) ) {
                    case 64:
                        {
                        alt19=1;
                        }
                        break;
                    case 65:
                        {
                        alt19=2;
                        }
                        break;
                    case 66:
                        {
                        alt19=3;
                        }
                        break;
                    case 67:
                        {
                        alt19=4;
                        }
                        break;
                    case 68:
                        {
                        alt19=5;
                        }
                        break;
                    case 69:
                        {
                        alt19=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }

                    switch (alt19) {
                        case 1 :
                            // InternalVampireLanguage.g:1381:6: ( () otherlv_2= '<=>' )
                            {
                            // InternalVampireLanguage.g:1381:6: ( () otherlv_2= '<=>' )
                            // InternalVampireLanguage.g:1382:7: () otherlv_2= '<=>'
                            {
                            // InternalVampireLanguage.g:1382:7: ()
                            // InternalVampireLanguage.g:1383:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSEquivalentLeftAction_1_0_0_0_0(),
                            									current);
                            							

                            }

                            otherlv_2=(Token)match(input,64,FOLLOW_20); 

                            							newLeafNode(otherlv_2, grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_0_1());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalVampireLanguage.g:1395:6: ( () otherlv_4= '=>' )
                            {
                            // InternalVampireLanguage.g:1395:6: ( () otherlv_4= '=>' )
                            // InternalVampireLanguage.g:1396:7: () otherlv_4= '=>'
                            {
                            // InternalVampireLanguage.g:1396:7: ()
                            // InternalVampireLanguage.g:1397:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSImpliesLeftAction_1_0_0_1_0(),
                            									current);
                            							

                            }

                            otherlv_4=(Token)match(input,65,FOLLOW_20); 

                            							newLeafNode(otherlv_4, grammarAccess.getVLSBinaryAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_1());
                            						

                            }


                            }
                            break;
                        case 3 :
                            // InternalVampireLanguage.g:1409:6: ( () otherlv_6= '<=' )
                            {
                            // InternalVampireLanguage.g:1409:6: ( () otherlv_6= '<=' )
                            // InternalVampireLanguage.g:1410:7: () otherlv_6= '<='
                            {
                            // InternalVampireLanguage.g:1410:7: ()
                            // InternalVampireLanguage.g:1411:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSRevImpliesLeftAction_1_0_0_2_0(),
                            									current);
                            							

                            }

                            otherlv_6=(Token)match(input,66,FOLLOW_20); 

                            							newLeafNode(otherlv_6, grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignKeyword_1_0_0_2_1());
                            						

                            }


                            }
                            break;
                        case 4 :
                            // InternalVampireLanguage.g:1423:6: ( () otherlv_8= '<~>' )
                            {
                            // InternalVampireLanguage.g:1423:6: ( () otherlv_8= '<~>' )
                            // InternalVampireLanguage.g:1424:7: () otherlv_8= '<~>'
                            {
                            // InternalVampireLanguage.g:1424:7: ()
                            // InternalVampireLanguage.g:1425:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSXnorLeftAction_1_0_0_3_0(),
                            									current);
                            							

                            }

                            otherlv_8=(Token)match(input,67,FOLLOW_20); 

                            							newLeafNode(otherlv_8, grammarAccess.getVLSBinaryAccess().getLessThanSignTildeGreaterThanSignKeyword_1_0_0_3_1());
                            						

                            }


                            }
                            break;
                        case 5 :
                            // InternalVampireLanguage.g:1437:6: ( () otherlv_10= '~|' )
                            {
                            // InternalVampireLanguage.g:1437:6: ( () otherlv_10= '~|' )
                            // InternalVampireLanguage.g:1438:7: () otherlv_10= '~|'
                            {
                            // InternalVampireLanguage.g:1438:7: ()
                            // InternalVampireLanguage.g:1439:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSNorLeftAction_1_0_0_4_0(),
                            									current);
                            							

                            }

                            otherlv_10=(Token)match(input,68,FOLLOW_20); 

                            							newLeafNode(otherlv_10, grammarAccess.getVLSBinaryAccess().getTildeVerticalLineKeyword_1_0_0_4_1());
                            						

                            }


                            }
                            break;
                        case 6 :
                            // InternalVampireLanguage.g:1451:6: ( () otherlv_12= '~&' )
                            {
                            // InternalVampireLanguage.g:1451:6: ( () otherlv_12= '~&' )
                            // InternalVampireLanguage.g:1452:7: () otherlv_12= '~&'
                            {
                            // InternalVampireLanguage.g:1452:7: ()
                            // InternalVampireLanguage.g:1453:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSNandLeftAction_1_0_0_5_0(),
                            									current);
                            							

                            }

                            otherlv_12=(Token)match(input,69,FOLLOW_20); 

                            							newLeafNode(otherlv_12, grammarAccess.getVLSBinaryAccess().getTildeAmpersandKeyword_1_0_0_5_1());
                            						

                            }


                            }
                            break;

                    }

                    // InternalVampireLanguage.g:1465:5: ( (lv_right_13_0= ruleVLSUnitaryFormula ) )
                    // InternalVampireLanguage.g:1466:6: (lv_right_13_0= ruleVLSUnitaryFormula )
                    {
                    // InternalVampireLanguage.g:1466:6: (lv_right_13_0= ruleVLSUnitaryFormula )
                    // InternalVampireLanguage.g:1467:7: lv_right_13_0= ruleVLSUnitaryFormula
                    {

                    							newCompositeNode(grammarAccess.getVLSBinaryAccess().getRightVLSUnitaryFormulaParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_right_13_0=ruleVLSUnitaryFormula();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getVLSBinaryRule());
                    							}
                    							set(
                    								current,
                    								"right",
                    								lv_right_13_0,
                    								"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSUnitaryFormula");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1486:4: ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+
                    {
                    // InternalVampireLanguage.g:1486:4: ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==70) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1487:5: () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) )
                    	    {
                    	    // InternalVampireLanguage.g:1487:5: ()
                    	    // InternalVampireLanguage.g:1488:6: 
                    	    {

                    	    						current = forceCreateModelElementAndSet(
                    	    							grammarAccess.getVLSBinaryAccess().getVLSAndLeftAction_1_1_0(),
                    	    							current);
                    	    					

                    	    }

                    	    otherlv_15=(Token)match(input,70,FOLLOW_20); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getVLSBinaryAccess().getAmpersandKeyword_1_1_1());
                    	    				
                    	    // InternalVampireLanguage.g:1498:5: ( (lv_right_16_0= ruleVLSUnitaryFormula ) )
                    	    // InternalVampireLanguage.g:1499:6: (lv_right_16_0= ruleVLSUnitaryFormula )
                    	    {
                    	    // InternalVampireLanguage.g:1499:6: (lv_right_16_0= ruleVLSUnitaryFormula )
                    	    // InternalVampireLanguage.g:1500:7: lv_right_16_0= ruleVLSUnitaryFormula
                    	    {

                    	    							newCompositeNode(grammarAccess.getVLSBinaryAccess().getRightVLSUnitaryFormulaParserRuleCall_1_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_right_16_0=ruleVLSUnitaryFormula();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVLSBinaryRule());
                    	    							}
                    	    							set(
                    	    								current,
                    	    								"right",
                    	    								lv_right_16_0,
                    	    								"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSUnitaryFormula");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


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


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1519:4: ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+
                    {
                    // InternalVampireLanguage.g:1519:4: ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==71) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1520:5: () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) )
                    	    {
                    	    // InternalVampireLanguage.g:1520:5: ()
                    	    // InternalVampireLanguage.g:1521:6: 
                    	    {

                    	    						current = forceCreateModelElementAndSet(
                    	    							grammarAccess.getVLSBinaryAccess().getVLSOrLeftAction_1_2_0(),
                    	    							current);
                    	    					

                    	    }

                    	    otherlv_18=(Token)match(input,71,FOLLOW_20); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getVLSBinaryAccess().getVerticalLineKeyword_1_2_1());
                    	    				
                    	    // InternalVampireLanguage.g:1531:5: ( (lv_right_19_0= ruleVLSUnitaryFormula ) )
                    	    // InternalVampireLanguage.g:1532:6: (lv_right_19_0= ruleVLSUnitaryFormula )
                    	    {
                    	    // InternalVampireLanguage.g:1532:6: (lv_right_19_0= ruleVLSUnitaryFormula )
                    	    // InternalVampireLanguage.g:1533:7: lv_right_19_0= ruleVLSUnitaryFormula
                    	    {

                    	    							newCompositeNode(grammarAccess.getVLSBinaryAccess().getRightVLSUnitaryFormulaParserRuleCall_1_2_2_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
                    	    lv_right_19_0=ruleVLSUnitaryFormula();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVLSBinaryRule());
                    	    							}
                    	    							set(
                    	    								current,
                    	    								"right",
                    	    								lv_right_19_0,
                    	    								"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSUnitaryFormula");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);


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
    // $ANTLR end "ruleVLSBinary"


    // $ANTLR start "entryRuleVLSUnitaryFormula"
    // InternalVampireLanguage.g:1556:1: entryRuleVLSUnitaryFormula returns [EObject current=null] : iv_ruleVLSUnitaryFormula= ruleVLSUnitaryFormula EOF ;
    public final EObject entryRuleVLSUnitaryFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUnitaryFormula = null;


        try {
            // InternalVampireLanguage.g:1556:58: (iv_ruleVLSUnitaryFormula= ruleVLSUnitaryFormula EOF )
            // InternalVampireLanguage.g:1557:2: iv_ruleVLSUnitaryFormula= ruleVLSUnitaryFormula EOF
            {
             newCompositeNode(grammarAccess.getVLSUnitaryFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSUnitaryFormula=ruleVLSUnitaryFormula();

            state._fsp--;

             current =iv_ruleVLSUnitaryFormula; 
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
    // $ANTLR end "entryRuleVLSUnitaryFormula"


    // $ANTLR start "ruleVLSUnitaryFormula"
    // InternalVampireLanguage.g:1563:1: ruleVLSUnitaryFormula returns [EObject current=null] : (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) ) ;
    public final EObject ruleVLSUnitaryFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_VLSUniversalQuantifier_0 = null;

        EObject this_VLSExistentialQuantifier_1 = null;

        EObject this_VLSUnaryNegation_2 = null;

        EObject this_VLSUnaryInfix_3 = null;

        EObject this_VLSTerm_5 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1569:2: ( (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) ) )
            // InternalVampireLanguage.g:1570:2: (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) )
            {
            // InternalVampireLanguage.g:1570:2: (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt23=1;
                }
                break;
            case 73:
                {
                alt23=2;
                }
                break;
            case 74:
                {
                alt23=3;
                }
                break;
            case RULE_LOWER_WORD_ID:
            case RULE_SIGNED_LITERAL:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
            case RULE_UPPER_WORD_ID:
            case RULE_DOUBLE_QUOTE:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 78:
            case 79:
            case 80:
                {
                alt23=4;
                }
                break;
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
                    // InternalVampireLanguage.g:1571:3: this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier
                    {

                    			newCompositeNode(grammarAccess.getVLSUnitaryFormulaAccess().getVLSUniversalQuantifierParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSUniversalQuantifier_0=ruleVLSUniversalQuantifier();

                    state._fsp--;


                    			current = this_VLSUniversalQuantifier_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1580:3: this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier
                    {

                    			newCompositeNode(grammarAccess.getVLSUnitaryFormulaAccess().getVLSExistentialQuantifierParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSExistentialQuantifier_1=ruleVLSExistentialQuantifier();

                    state._fsp--;


                    			current = this_VLSExistentialQuantifier_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1589:3: this_VLSUnaryNegation_2= ruleVLSUnaryNegation
                    {

                    			newCompositeNode(grammarAccess.getVLSUnitaryFormulaAccess().getVLSUnaryNegationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSUnaryNegation_2=ruleVLSUnaryNegation();

                    state._fsp--;


                    			current = this_VLSUnaryNegation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1598:3: this_VLSUnaryInfix_3= ruleVLSUnaryInfix
                    {

                    			newCompositeNode(grammarAccess.getVLSUnitaryFormulaAccess().getVLSUnaryInfixParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSUnaryInfix_3=ruleVLSUnaryInfix();

                    state._fsp--;


                    			current = this_VLSUnaryInfix_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:1607:3: (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' )
                    {
                    // InternalVampireLanguage.g:1607:3: (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' )
                    // InternalVampireLanguage.g:1608:4: otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getVLSUnitaryFormulaAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getVLSUnitaryFormulaAccess().getVLSTermParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_23);
                    this_VLSTerm_5=ruleVLSTerm();

                    state._fsp--;


                    				current = this_VLSTerm_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getVLSUnitaryFormulaAccess().getRightParenthesisKeyword_4_2());
                    			

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
    // $ANTLR end "ruleVLSUnitaryFormula"


    // $ANTLR start "entryRuleVLSUniversalQuantifier"
    // InternalVampireLanguage.g:1629:1: entryRuleVLSUniversalQuantifier returns [EObject current=null] : iv_ruleVLSUniversalQuantifier= ruleVLSUniversalQuantifier EOF ;
    public final EObject entryRuleVLSUniversalQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUniversalQuantifier = null;


        try {
            // InternalVampireLanguage.g:1629:63: (iv_ruleVLSUniversalQuantifier= ruleVLSUniversalQuantifier EOF )
            // InternalVampireLanguage.g:1630:2: iv_ruleVLSUniversalQuantifier= ruleVLSUniversalQuantifier EOF
            {
             newCompositeNode(grammarAccess.getVLSUniversalQuantifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSUniversalQuantifier=ruleVLSUniversalQuantifier();

            state._fsp--;

             current =iv_ruleVLSUniversalQuantifier; 
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
    // $ANTLR end "entryRuleVLSUniversalQuantifier"


    // $ANTLR start "ruleVLSUniversalQuantifier"
    // InternalVampireLanguage.g:1636:1: ruleVLSUniversalQuantifier returns [EObject current=null] : ( () (otherlv_1= '!' otherlv_2= '[' ( ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) ;
    public final EObject ruleVLSUniversalQuantifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_variables_3_1 = null;

        EObject lv_variables_3_2 = null;

        EObject lv_variables_5_1 = null;

        EObject lv_variables_5_2 = null;

        EObject lv_operand_8_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1642:2: ( ( () (otherlv_1= '!' otherlv_2= '[' ( ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) )
            // InternalVampireLanguage.g:1643:2: ( () (otherlv_1= '!' otherlv_2= '[' ( ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            {
            // InternalVampireLanguage.g:1643:2: ( () (otherlv_1= '!' otherlv_2= '[' ( ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            // InternalVampireLanguage.g:1644:3: () (otherlv_1= '!' otherlv_2= '[' ( ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            {
            // InternalVampireLanguage.g:1644:3: ()
            // InternalVampireLanguage.g:1645:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSUniversalQuantifierAccess().getVLSUniversalQuantifierAction_0(),
            					current);
            			

            }

            // InternalVampireLanguage.g:1651:3: (otherlv_1= '!' otherlv_2= '[' ( ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) ) )* otherlv_6= ']' otherlv_7= ':' )
            // InternalVampireLanguage.g:1652:4: otherlv_1= '!' otherlv_2= '[' ( ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) ) )* otherlv_6= ']' otherlv_7= ':'
            {
            otherlv_1=(Token)match(input,72,FOLLOW_11); 

            				newLeafNode(otherlv_1, grammarAccess.getVLSUniversalQuantifierAccess().getExclamationMarkKeyword_1_0());
            			
            otherlv_2=(Token)match(input,32,FOLLOW_40); 

            				newLeafNode(otherlv_2, grammarAccess.getVLSUniversalQuantifierAccess().getLeftSquareBracketKeyword_1_1());
            			
            // InternalVampireLanguage.g:1660:4: ( ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) ) )
            // InternalVampireLanguage.g:1661:5: ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) )
            {
            // InternalVampireLanguage.g:1661:5: ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) )
            // InternalVampireLanguage.g:1662:6: (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration )
            {
            // InternalVampireLanguage.g:1662:6: (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_UPPER_WORD_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==33||LA24_1==39) ) {
                    alt24=1;
                }
                else if ( (LA24_1==61) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalVampireLanguage.g:1663:7: lv_variables_3_1= ruleVLSVariable
                    {

                    							newCompositeNode(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_2_0_0());
                    						
                    pushFollow(FOLLOW_41);
                    lv_variables_3_1=ruleVLSVariable();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getVLSUniversalQuantifierRule());
                    							}
                    							add(
                    								current,
                    								"variables",
                    								lv_variables_3_1,
                    								"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSVariable");
                    							afterParserOrEnumRuleCall();
                    						

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1679:7: lv_variables_3_2= ruleVLSVariableDeclaration
                    {

                    							newCompositeNode(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableDeclarationParserRuleCall_1_2_0_1());
                    						
                    pushFollow(FOLLOW_41);
                    lv_variables_3_2=ruleVLSVariableDeclaration();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getVLSUniversalQuantifierRule());
                    							}
                    							add(
                    								current,
                    								"variables",
                    								lv_variables_3_2,
                    								"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSVariableDeclaration");
                    							afterParserOrEnumRuleCall();
                    						

                    }
                    break;

            }


            }


            }

            // InternalVampireLanguage.g:1697:4: (otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==39) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalVampireLanguage.g:1698:5: otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) )
            	    {
            	    otherlv_4=(Token)match(input,39,FOLLOW_40); 

            	    					newLeafNode(otherlv_4, grammarAccess.getVLSUniversalQuantifierAccess().getCommaKeyword_1_3_0());
            	    				
            	    // InternalVampireLanguage.g:1702:5: ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) )
            	    // InternalVampireLanguage.g:1703:6: ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) )
            	    {
            	    // InternalVampireLanguage.g:1703:6: ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) )
            	    // InternalVampireLanguage.g:1704:7: (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration )
            	    {
            	    // InternalVampireLanguage.g:1704:7: (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==RULE_UPPER_WORD_ID) ) {
            	        int LA25_1 = input.LA(2);

            	        if ( (LA25_1==33||LA25_1==39) ) {
            	            alt25=1;
            	        }
            	        else if ( (LA25_1==61) ) {
            	            alt25=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 25, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalVampireLanguage.g:1705:8: lv_variables_5_1= ruleVLSVariable
            	            {

            	            								newCompositeNode(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_3_1_0_0());
            	            							
            	            pushFollow(FOLLOW_41);
            	            lv_variables_5_1=ruleVLSVariable();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getVLSUniversalQuantifierRule());
            	            								}
            	            								add(
            	            									current,
            	            									"variables",
            	            									lv_variables_5_1,
            	            									"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSVariable");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }
            	            break;
            	        case 2 :
            	            // InternalVampireLanguage.g:1721:8: lv_variables_5_2= ruleVLSVariableDeclaration
            	            {

            	            								newCompositeNode(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableDeclarationParserRuleCall_1_3_1_0_1());
            	            							
            	            pushFollow(FOLLOW_41);
            	            lv_variables_5_2=ruleVLSVariableDeclaration();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getVLSUniversalQuantifierRule());
            	            								}
            	            								add(
            	            									current,
            	            									"variables",
            	            									lv_variables_5_2,
            	            									"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSVariableDeclaration");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_6=(Token)match(input,33,FOLLOW_32); 

            				newLeafNode(otherlv_6, grammarAccess.getVLSUniversalQuantifierAccess().getRightSquareBracketKeyword_1_4());
            			
            otherlv_7=(Token)match(input,61,FOLLOW_20); 

            				newLeafNode(otherlv_7, grammarAccess.getVLSUniversalQuantifierAccess().getColonKeyword_1_5());
            			

            }

            // InternalVampireLanguage.g:1749:3: ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:1750:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:1750:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:1751:5: lv_operand_8_0= ruleVLSUnitaryFormula
            {

            					newCompositeNode(grammarAccess.getVLSUniversalQuantifierAccess().getOperandVLSUnitaryFormulaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_operand_8_0=ruleVLSUnitaryFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSUniversalQuantifierRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_8_0,
            						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSUnitaryFormula");
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
    // $ANTLR end "ruleVLSUniversalQuantifier"


    // $ANTLR start "entryRuleVLSExistentialQuantifier"
    // InternalVampireLanguage.g:1772:1: entryRuleVLSExistentialQuantifier returns [EObject current=null] : iv_ruleVLSExistentialQuantifier= ruleVLSExistentialQuantifier EOF ;
    public final EObject entryRuleVLSExistentialQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSExistentialQuantifier = null;


        try {
            // InternalVampireLanguage.g:1772:65: (iv_ruleVLSExistentialQuantifier= ruleVLSExistentialQuantifier EOF )
            // InternalVampireLanguage.g:1773:2: iv_ruleVLSExistentialQuantifier= ruleVLSExistentialQuantifier EOF
            {
             newCompositeNode(grammarAccess.getVLSExistentialQuantifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSExistentialQuantifier=ruleVLSExistentialQuantifier();

            state._fsp--;

             current =iv_ruleVLSExistentialQuantifier; 
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
    // $ANTLR end "entryRuleVLSExistentialQuantifier"


    // $ANTLR start "ruleVLSExistentialQuantifier"
    // InternalVampireLanguage.g:1779:1: ruleVLSExistentialQuantifier returns [EObject current=null] : ( () (otherlv_1= '?' otherlv_2= '[' ( ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) ;
    public final EObject ruleVLSExistentialQuantifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_variables_3_1 = null;

        EObject lv_variables_3_2 = null;

        EObject lv_variables_5_1 = null;

        EObject lv_variables_5_2 = null;

        EObject lv_operand_8_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1785:2: ( ( () (otherlv_1= '?' otherlv_2= '[' ( ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) )
            // InternalVampireLanguage.g:1786:2: ( () (otherlv_1= '?' otherlv_2= '[' ( ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            {
            // InternalVampireLanguage.g:1786:2: ( () (otherlv_1= '?' otherlv_2= '[' ( ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            // InternalVampireLanguage.g:1787:3: () (otherlv_1= '?' otherlv_2= '[' ( ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            {
            // InternalVampireLanguage.g:1787:3: ()
            // InternalVampireLanguage.g:1788:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSExistentialQuantifierAccess().getVLSExistentialQuantifierAction_0(),
            					current);
            			

            }

            // InternalVampireLanguage.g:1794:3: (otherlv_1= '?' otherlv_2= '[' ( ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) ) )* otherlv_6= ']' otherlv_7= ':' )
            // InternalVampireLanguage.g:1795:4: otherlv_1= '?' otherlv_2= '[' ( ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) ) ) (otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) ) )* otherlv_6= ']' otherlv_7= ':'
            {
            otherlv_1=(Token)match(input,73,FOLLOW_11); 

            				newLeafNode(otherlv_1, grammarAccess.getVLSExistentialQuantifierAccess().getQuestionMarkKeyword_1_0());
            			
            otherlv_2=(Token)match(input,32,FOLLOW_40); 

            				newLeafNode(otherlv_2, grammarAccess.getVLSExistentialQuantifierAccess().getLeftSquareBracketKeyword_1_1());
            			
            // InternalVampireLanguage.g:1803:4: ( ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) ) )
            // InternalVampireLanguage.g:1804:5: ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) )
            {
            // InternalVampireLanguage.g:1804:5: ( (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration ) )
            // InternalVampireLanguage.g:1805:6: (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration )
            {
            // InternalVampireLanguage.g:1805:6: (lv_variables_3_1= ruleVLSVariable | lv_variables_3_2= ruleVLSVariableDeclaration )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_UPPER_WORD_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==33||LA27_1==39) ) {
                    alt27=1;
                }
                else if ( (LA27_1==61) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalVampireLanguage.g:1806:7: lv_variables_3_1= ruleVLSVariable
                    {

                    							newCompositeNode(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_2_0_0());
                    						
                    pushFollow(FOLLOW_41);
                    lv_variables_3_1=ruleVLSVariable();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getVLSExistentialQuantifierRule());
                    							}
                    							add(
                    								current,
                    								"variables",
                    								lv_variables_3_1,
                    								"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSVariable");
                    							afterParserOrEnumRuleCall();
                    						

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1822:7: lv_variables_3_2= ruleVLSVariableDeclaration
                    {

                    							newCompositeNode(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableDeclarationParserRuleCall_1_2_0_1());
                    						
                    pushFollow(FOLLOW_41);
                    lv_variables_3_2=ruleVLSVariableDeclaration();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getVLSExistentialQuantifierRule());
                    							}
                    							add(
                    								current,
                    								"variables",
                    								lv_variables_3_2,
                    								"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSVariableDeclaration");
                    							afterParserOrEnumRuleCall();
                    						

                    }
                    break;

            }


            }


            }

            // InternalVampireLanguage.g:1840:4: (otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==39) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalVampireLanguage.g:1841:5: otherlv_4= ',' ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) )
            	    {
            	    otherlv_4=(Token)match(input,39,FOLLOW_40); 

            	    					newLeafNode(otherlv_4, grammarAccess.getVLSExistentialQuantifierAccess().getCommaKeyword_1_3_0());
            	    				
            	    // InternalVampireLanguage.g:1845:5: ( ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) ) )
            	    // InternalVampireLanguage.g:1846:6: ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) )
            	    {
            	    // InternalVampireLanguage.g:1846:6: ( (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration ) )
            	    // InternalVampireLanguage.g:1847:7: (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration )
            	    {
            	    // InternalVampireLanguage.g:1847:7: (lv_variables_5_1= ruleVLSVariable | lv_variables_5_2= ruleVLSVariableDeclaration )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==RULE_UPPER_WORD_ID) ) {
            	        int LA28_1 = input.LA(2);

            	        if ( (LA28_1==33||LA28_1==39) ) {
            	            alt28=1;
            	        }
            	        else if ( (LA28_1==61) ) {
            	            alt28=2;
            	        }
            	        else {
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
            	            // InternalVampireLanguage.g:1848:8: lv_variables_5_1= ruleVLSVariable
            	            {

            	            								newCompositeNode(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_3_1_0_0());
            	            							
            	            pushFollow(FOLLOW_41);
            	            lv_variables_5_1=ruleVLSVariable();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getVLSExistentialQuantifierRule());
            	            								}
            	            								add(
            	            									current,
            	            									"variables",
            	            									lv_variables_5_1,
            	            									"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSVariable");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }
            	            break;
            	        case 2 :
            	            // InternalVampireLanguage.g:1864:8: lv_variables_5_2= ruleVLSVariableDeclaration
            	            {

            	            								newCompositeNode(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableDeclarationParserRuleCall_1_3_1_0_1());
            	            							
            	            pushFollow(FOLLOW_41);
            	            lv_variables_5_2=ruleVLSVariableDeclaration();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getVLSExistentialQuantifierRule());
            	            								}
            	            								add(
            	            									current,
            	            									"variables",
            	            									lv_variables_5_2,
            	            									"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSVariableDeclaration");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_6=(Token)match(input,33,FOLLOW_32); 

            				newLeafNode(otherlv_6, grammarAccess.getVLSExistentialQuantifierAccess().getRightSquareBracketKeyword_1_4());
            			
            otherlv_7=(Token)match(input,61,FOLLOW_20); 

            				newLeafNode(otherlv_7, grammarAccess.getVLSExistentialQuantifierAccess().getColonKeyword_1_5());
            			

            }

            // InternalVampireLanguage.g:1892:3: ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:1893:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:1893:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:1894:5: lv_operand_8_0= ruleVLSUnitaryFormula
            {

            					newCompositeNode(grammarAccess.getVLSExistentialQuantifierAccess().getOperandVLSUnitaryFormulaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_operand_8_0=ruleVLSUnitaryFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSExistentialQuantifierRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_8_0,
            						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSUnitaryFormula");
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
    // $ANTLR end "ruleVLSExistentialQuantifier"


    // $ANTLR start "entryRuleVLSUnaryNegation"
    // InternalVampireLanguage.g:1915:1: entryRuleVLSUnaryNegation returns [EObject current=null] : iv_ruleVLSUnaryNegation= ruleVLSUnaryNegation EOF ;
    public final EObject entryRuleVLSUnaryNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUnaryNegation = null;


        try {
            // InternalVampireLanguage.g:1915:57: (iv_ruleVLSUnaryNegation= ruleVLSUnaryNegation EOF )
            // InternalVampireLanguage.g:1916:2: iv_ruleVLSUnaryNegation= ruleVLSUnaryNegation EOF
            {
             newCompositeNode(grammarAccess.getVLSUnaryNegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSUnaryNegation=ruleVLSUnaryNegation();

            state._fsp--;

             current =iv_ruleVLSUnaryNegation; 
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
    // $ANTLR end "entryRuleVLSUnaryNegation"


    // $ANTLR start "ruleVLSUnaryNegation"
    // InternalVampireLanguage.g:1922:1: ruleVLSUnaryNegation returns [EObject current=null] : ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) ) ;
    public final EObject ruleVLSUnaryNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1928:2: ( ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) ) )
            // InternalVampireLanguage.g:1929:2: ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) )
            {
            // InternalVampireLanguage.g:1929:2: ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) )
            // InternalVampireLanguage.g:1930:3: () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) )
            {
            // InternalVampireLanguage.g:1930:3: ()
            // InternalVampireLanguage.g:1931:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSUnaryNegationAccess().getVLSUnaryNegationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getVLSUnaryNegationAccess().getTildeKeyword_1());
            		
            // InternalVampireLanguage.g:1941:3: ( (lv_operand_2_0= ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:1942:4: (lv_operand_2_0= ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:1942:4: (lv_operand_2_0= ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:1943:5: lv_operand_2_0= ruleVLSUnitaryFormula
            {

            					newCompositeNode(grammarAccess.getVLSUnaryNegationAccess().getOperandVLSUnitaryFormulaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_operand_2_0=ruleVLSUnitaryFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSUnaryNegationRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_2_0,
            						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSUnitaryFormula");
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
    // $ANTLR end "ruleVLSUnaryNegation"


    // $ANTLR start "entryRuleVLSUnaryInfix"
    // InternalVampireLanguage.g:1964:1: entryRuleVLSUnaryInfix returns [EObject current=null] : iv_ruleVLSUnaryInfix= ruleVLSUnaryInfix EOF ;
    public final EObject entryRuleVLSUnaryInfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUnaryInfix = null;


        try {
            // InternalVampireLanguage.g:1964:54: (iv_ruleVLSUnaryInfix= ruleVLSUnaryInfix EOF )
            // InternalVampireLanguage.g:1965:2: iv_ruleVLSUnaryInfix= ruleVLSUnaryInfix EOF
            {
             newCompositeNode(grammarAccess.getVLSUnaryInfixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSUnaryInfix=ruleVLSUnaryInfix();

            state._fsp--;

             current =iv_ruleVLSUnaryInfix; 
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
    // $ANTLR end "entryRuleVLSUnaryInfix"


    // $ANTLR start "ruleVLSUnaryInfix"
    // InternalVampireLanguage.g:1971:1: ruleVLSUnaryInfix returns [EObject current=null] : (this_VLSAtomic_0= ruleVLSAtomic ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )? ) ;
    public final EObject ruleVLSUnaryInfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_VLSAtomic_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1977:2: ( (this_VLSAtomic_0= ruleVLSAtomic ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )? ) )
            // InternalVampireLanguage.g:1978:2: (this_VLSAtomic_0= ruleVLSAtomic ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )? )
            {
            // InternalVampireLanguage.g:1978:2: (this_VLSAtomic_0= ruleVLSAtomic ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )? )
            // InternalVampireLanguage.g:1979:3: this_VLSAtomic_0= ruleVLSAtomic ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )?
            {

            			newCompositeNode(grammarAccess.getVLSUnaryInfixAccess().getVLSAtomicParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_VLSAtomic_0=ruleVLSAtomic();

            state._fsp--;


            			current = this_VLSAtomic_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalVampireLanguage.g:1987:3: ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=75 && LA31_0<=77)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVampireLanguage.g:1988:4: ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) )
                    {
                    // InternalVampireLanguage.g:1988:4: ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) )
                    int alt30=3;
                    switch ( input.LA(1) ) {
                    case 75:
                        {
                        alt30=1;
                        }
                        break;
                    case 76:
                        {
                        alt30=2;
                        }
                        break;
                    case 77:
                        {
                        alt30=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }

                    switch (alt30) {
                        case 1 :
                            // InternalVampireLanguage.g:1989:5: ( () otherlv_2= '!=' )
                            {
                            // InternalVampireLanguage.g:1989:5: ( () otherlv_2= '!=' )
                            // InternalVampireLanguage.g:1990:6: () otherlv_2= '!='
                            {
                            // InternalVampireLanguage.g:1990:6: ()
                            // InternalVampireLanguage.g:1991:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getVLSUnaryInfixAccess().getVLSInequalityLeftAction_1_0_0_0(),
                            								current);
                            						

                            }

                            otherlv_2=(Token)match(input,75,FOLLOW_33); 

                            						newLeafNode(otherlv_2, grammarAccess.getVLSUnaryInfixAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalVampireLanguage.g:2003:5: ( () otherlv_4= '=' )
                            {
                            // InternalVampireLanguage.g:2003:5: ( () otherlv_4= '=' )
                            // InternalVampireLanguage.g:2004:6: () otherlv_4= '='
                            {
                            // InternalVampireLanguage.g:2004:6: ()
                            // InternalVampireLanguage.g:2005:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getVLSUnaryInfixAccess().getVLSEqualityLeftAction_1_0_1_0(),
                            								current);
                            						

                            }

                            otherlv_4=(Token)match(input,76,FOLLOW_33); 

                            						newLeafNode(otherlv_4, grammarAccess.getVLSUnaryInfixAccess().getEqualsSignKeyword_1_0_1_1());
                            					

                            }


                            }
                            break;
                        case 3 :
                            // InternalVampireLanguage.g:2017:5: ( () otherlv_6= ':=' )
                            {
                            // InternalVampireLanguage.g:2017:5: ( () otherlv_6= ':=' )
                            // InternalVampireLanguage.g:2018:6: () otherlv_6= ':='
                            {
                            // InternalVampireLanguage.g:2018:6: ()
                            // InternalVampireLanguage.g:2019:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getVLSUnaryInfixAccess().getVLSAssignmentLeftAction_1_0_2_0(),
                            								current);
                            						

                            }

                            otherlv_6=(Token)match(input,77,FOLLOW_33); 

                            						newLeafNode(otherlv_6, grammarAccess.getVLSUnaryInfixAccess().getColonEqualsSignKeyword_1_0_2_1());
                            					

                            }


                            }
                            break;

                    }

                    // InternalVampireLanguage.g:2031:4: ( (lv_right_7_0= ruleVLSAtomic ) )
                    // InternalVampireLanguage.g:2032:5: (lv_right_7_0= ruleVLSAtomic )
                    {
                    // InternalVampireLanguage.g:2032:5: (lv_right_7_0= ruleVLSAtomic )
                    // InternalVampireLanguage.g:2033:6: lv_right_7_0= ruleVLSAtomic
                    {

                    						newCompositeNode(grammarAccess.getVLSUnaryInfixAccess().getRightVLSAtomicParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_7_0=ruleVLSAtomic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVLSUnaryInfixRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_7_0,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSAtomic");
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
    // $ANTLR end "ruleVLSUnaryInfix"


    // $ANTLR start "entryRuleVLSAtomic"
    // InternalVampireLanguage.g:2055:1: entryRuleVLSAtomic returns [EObject current=null] : iv_ruleVLSAtomic= ruleVLSAtomic EOF ;
    public final EObject entryRuleVLSAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAtomic = null;


        try {
            // InternalVampireLanguage.g:2055:50: (iv_ruleVLSAtomic= ruleVLSAtomic EOF )
            // InternalVampireLanguage.g:2056:2: iv_ruleVLSAtomic= ruleVLSAtomic EOF
            {
             newCompositeNode(grammarAccess.getVLSAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSAtomic=ruleVLSAtomic();

            state._fsp--;

             current =iv_ruleVLSAtomic; 
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
    // $ANTLR end "entryRuleVLSAtomic"


    // $ANTLR start "ruleVLSAtomic"
    // InternalVampireLanguage.g:2062:1: ruleVLSAtomic returns [EObject current=null] : (this_VLSAtomicConstant_0= ruleVLSAtomicConstant | this_VLSAtomicFunction_1= ruleVLSAtomicFunction | this_VLSVariable_2= ruleVLSVariable | this_VLSDefinedTerm_3= ruleVLSDefinedTerm ) ;
    public final EObject ruleVLSAtomic() throws RecognitionException {
        EObject current = null;

        EObject this_VLSAtomicConstant_0 = null;

        EObject this_VLSAtomicFunction_1 = null;

        EObject this_VLSVariable_2 = null;

        EObject this_VLSDefinedTerm_3 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:2068:2: ( (this_VLSAtomicConstant_0= ruleVLSAtomicConstant | this_VLSAtomicFunction_1= ruleVLSAtomicFunction | this_VLSVariable_2= ruleVLSVariable | this_VLSDefinedTerm_3= ruleVLSDefinedTerm ) )
            // InternalVampireLanguage.g:2069:2: (this_VLSAtomicConstant_0= ruleVLSAtomicConstant | this_VLSAtomicFunction_1= ruleVLSAtomicFunction | this_VLSVariable_2= ruleVLSVariable | this_VLSDefinedTerm_3= ruleVLSDefinedTerm )
            {
            // InternalVampireLanguage.g:2069:2: (this_VLSAtomicConstant_0= ruleVLSAtomicConstant | this_VLSAtomicFunction_1= ruleVLSAtomicFunction | this_VLSVariable_2= ruleVLSVariable | this_VLSDefinedTerm_3= ruleVLSDefinedTerm )
            int alt32=4;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalVampireLanguage.g:2070:3: this_VLSAtomicConstant_0= ruleVLSAtomicConstant
                    {

                    			newCompositeNode(grammarAccess.getVLSAtomicAccess().getVLSAtomicConstantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSAtomicConstant_0=ruleVLSAtomicConstant();

                    state._fsp--;


                    			current = this_VLSAtomicConstant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:2079:3: this_VLSAtomicFunction_1= ruleVLSAtomicFunction
                    {

                    			newCompositeNode(grammarAccess.getVLSAtomicAccess().getVLSAtomicFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSAtomicFunction_1=ruleVLSAtomicFunction();

                    state._fsp--;


                    			current = this_VLSAtomicFunction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:2088:3: this_VLSVariable_2= ruleVLSVariable
                    {

                    			newCompositeNode(grammarAccess.getVLSAtomicAccess().getVLSVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSVariable_2=ruleVLSVariable();

                    state._fsp--;


                    			current = this_VLSVariable_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:2097:3: this_VLSDefinedTerm_3= ruleVLSDefinedTerm
                    {

                    			newCompositeNode(grammarAccess.getVLSAtomicAccess().getVLSDefinedTermParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSDefinedTerm_3=ruleVLSDefinedTerm();

                    state._fsp--;


                    			current = this_VLSDefinedTerm_3;
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
    // $ANTLR end "ruleVLSAtomic"


    // $ANTLR start "entryRuleVLSAtomicConstant"
    // InternalVampireLanguage.g:2109:1: entryRuleVLSAtomicConstant returns [EObject current=null] : iv_ruleVLSAtomicConstant= ruleVLSAtomicConstant EOF ;
    public final EObject entryRuleVLSAtomicConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAtomicConstant = null;


        try {
            // InternalVampireLanguage.g:2109:58: (iv_ruleVLSAtomicConstant= ruleVLSAtomicConstant EOF )
            // InternalVampireLanguage.g:2110:2: iv_ruleVLSAtomicConstant= ruleVLSAtomicConstant EOF
            {
             newCompositeNode(grammarAccess.getVLSAtomicConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSAtomicConstant=ruleVLSAtomicConstant();

            state._fsp--;

             current =iv_ruleVLSAtomicConstant; 
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
    // $ANTLR end "entryRuleVLSAtomicConstant"


    // $ANTLR start "ruleVLSAtomicConstant"
    // InternalVampireLanguage.g:2116:1: ruleVLSAtomicConstant returns [EObject current=null] : ( ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) ) | ( () otherlv_3= '$true' ) | ( () otherlv_5= '$false' ) ) ;
    public final EObject ruleVLSAtomicConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;
        Token lv_name_1_4=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_5 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:2122:2: ( ( ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) ) | ( () otherlv_3= '$true' ) | ( () otherlv_5= '$false' ) ) )
            // InternalVampireLanguage.g:2123:2: ( ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) ) | ( () otherlv_3= '$true' ) | ( () otherlv_5= '$false' ) )
            {
            // InternalVampireLanguage.g:2123:2: ( ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) ) | ( () otherlv_3= '$true' ) | ( () otherlv_5= '$false' ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt34=1;
                }
                break;
            case 78:
                {
                alt34=2;
                }
                break;
            case 79:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalVampireLanguage.g:2124:3: ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) )
                    {
                    // InternalVampireLanguage.g:2124:3: ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) )
                    // InternalVampireLanguage.g:2125:4: () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) )
                    {
                    // InternalVampireLanguage.g:2125:4: ()
                    // InternalVampireLanguage.g:2126:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSAtomicConstantAccess().getVLSConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:2132:4: ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) )
                    // InternalVampireLanguage.g:2133:5: ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) )
                    {
                    // InternalVampireLanguage.g:2133:5: ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) )
                    // InternalVampireLanguage.g:2134:6: (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:2134:6: (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole )
                    int alt33=5;
                    switch ( input.LA(1) ) {
                    case RULE_LOWER_WORD_ID:
                        {
                        alt33=1;
                        }
                        break;
                    case RULE_SINGLE_QUOTE:
                        {
                        alt33=2;
                        }
                        break;
                    case RULE_DOLLAR_ID:
                        {
                        alt33=3;
                        }
                        break;
                    case RULE_DOUBLE_DOLLAR_ID:
                        {
                        alt33=4;
                        }
                        break;
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        {
                        alt33=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }

                    switch (alt33) {
                        case 1 :
                            // InternalVampireLanguage.g:2135:7: lv_name_1_1= RULE_LOWER_WORD_ID
                            {
                            lv_name_1_1=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 

                            							newLeafNode(lv_name_1_1, grammarAccess.getVLSAtomicConstantAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVLSAtomicConstantRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_1_1,
                            								"ca.mcgill.ecse.dslreasoner.VampireLanguage.LOWER_WORD_ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalVampireLanguage.g:2150:7: lv_name_1_2= RULE_SINGLE_QUOTE
                            {
                            lv_name_1_2=(Token)match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 

                            							newLeafNode(lv_name_1_2, grammarAccess.getVLSAtomicConstantAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVLSAtomicConstantRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_1_2,
                            								"ca.mcgill.ecse.dslreasoner.VampireLanguage.SINGLE_QUOTE");
                            						

                            }
                            break;
                        case 3 :
                            // InternalVampireLanguage.g:2165:7: lv_name_1_3= RULE_DOLLAR_ID
                            {
                            lv_name_1_3=(Token)match(input,RULE_DOLLAR_ID,FOLLOW_2); 

                            							newLeafNode(lv_name_1_3, grammarAccess.getVLSAtomicConstantAccess().getNameDOLLAR_IDTerminalRuleCall_0_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVLSAtomicConstantRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_1_3,
                            								"ca.mcgill.ecse.dslreasoner.VampireLanguage.DOLLAR_ID");
                            						

                            }
                            break;
                        case 4 :
                            // InternalVampireLanguage.g:2180:7: lv_name_1_4= RULE_DOUBLE_DOLLAR_ID
                            {
                            lv_name_1_4=(Token)match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_2); 

                            							newLeafNode(lv_name_1_4, grammarAccess.getVLSAtomicConstantAccess().getNameDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVLSAtomicConstantRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_1_4,
                            								"ca.mcgill.ecse.dslreasoner.VampireLanguage.DOUBLE_DOLLAR_ID");
                            						

                            }
                            break;
                        case 5 :
                            // InternalVampireLanguage.g:2195:7: lv_name_1_5= ruleVLSRole
                            {

                            							newCompositeNode(grammarAccess.getVLSAtomicConstantAccess().getNameVLSRoleParserRuleCall_0_1_0_4());
                            						
                            pushFollow(FOLLOW_2);
                            lv_name_1_5=ruleVLSRole();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVLSAtomicConstantRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_1_5,
                            								"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSRole");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:2215:3: ( () otherlv_3= '$true' )
                    {
                    // InternalVampireLanguage.g:2215:3: ( () otherlv_3= '$true' )
                    // InternalVampireLanguage.g:2216:4: () otherlv_3= '$true'
                    {
                    // InternalVampireLanguage.g:2216:4: ()
                    // InternalVampireLanguage.g:2217:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSAtomicConstantAccess().getVLSTrueAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,78,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getVLSAtomicConstantAccess().getTrueKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:2229:3: ( () otherlv_5= '$false' )
                    {
                    // InternalVampireLanguage.g:2229:3: ( () otherlv_5= '$false' )
                    // InternalVampireLanguage.g:2230:4: () otherlv_5= '$false'
                    {
                    // InternalVampireLanguage.g:2230:4: ()
                    // InternalVampireLanguage.g:2231:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSAtomicConstantAccess().getVLSFalseAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,79,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getVLSAtomicConstantAccess().getFalseKeyword_2_1());
                    			

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
    // $ANTLR end "ruleVLSAtomicConstant"


    // $ANTLR start "entryRuleVLSAtomicFunction"
    // InternalVampireLanguage.g:2246:1: entryRuleVLSAtomicFunction returns [EObject current=null] : iv_ruleVLSAtomicFunction= ruleVLSAtomicFunction EOF ;
    public final EObject entryRuleVLSAtomicFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAtomicFunction = null;


        try {
            // InternalVampireLanguage.g:2246:58: (iv_ruleVLSAtomicFunction= ruleVLSAtomicFunction EOF )
            // InternalVampireLanguage.g:2247:2: iv_ruleVLSAtomicFunction= ruleVLSAtomicFunction EOF
            {
             newCompositeNode(grammarAccess.getVLSAtomicFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSAtomicFunction=ruleVLSAtomicFunction();

            state._fsp--;

             current =iv_ruleVLSAtomicFunction; 
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
    // $ANTLR end "entryRuleVLSAtomicFunction"


    // $ANTLR start "ruleVLSAtomicFunction"
    // InternalVampireLanguage.g:2253:1: ruleVLSAtomicFunction returns [EObject current=null] : ( ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) ) | ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' ) ) ;
    public final EObject ruleVLSAtomicFunction() throws RecognitionException {
        EObject current = null;

        Token lv_constant_1_1=null;
        Token lv_constant_1_2=null;
        Token lv_constant_1_3=null;
        Token lv_constant_1_4=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_constant_1_5 = null;

        EObject lv_terms_3_0 = null;

        EObject lv_terms_5_0 = null;

        EObject lv_terms_10_0 = null;

        EObject lv_terms_12_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:2259:2: ( ( ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) ) | ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' ) ) )
            // InternalVampireLanguage.g:2260:2: ( ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) ) | ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' ) )
            {
            // InternalVampireLanguage.g:2260:2: ( ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) ) | ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_LOWER_WORD_ID||(LA37_0>=RULE_SINGLE_QUOTE && LA37_0<=RULE_DOUBLE_DOLLAR_ID)||(LA37_0>=46 && LA37_0<=60)) ) {
                alt37=1;
            }
            else if ( (LA37_0==80) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalVampireLanguage.g:2261:3: ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) )
                    {
                    // InternalVampireLanguage.g:2261:3: ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) )
                    // InternalVampireLanguage.g:2262:4: () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )
                    {
                    // InternalVampireLanguage.g:2262:4: ()
                    // InternalVampireLanguage.g:2263:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSAtomicFunctionAccess().getVLSFunctionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:2269:4: ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) )
                    // InternalVampireLanguage.g:2270:5: ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) )
                    {
                    // InternalVampireLanguage.g:2270:5: ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) )
                    // InternalVampireLanguage.g:2271:6: (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:2271:6: (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole )
                    int alt35=5;
                    switch ( input.LA(1) ) {
                    case RULE_LOWER_WORD_ID:
                        {
                        alt35=1;
                        }
                        break;
                    case RULE_SINGLE_QUOTE:
                        {
                        alt35=2;
                        }
                        break;
                    case RULE_DOLLAR_ID:
                        {
                        alt35=3;
                        }
                        break;
                    case RULE_DOUBLE_DOLLAR_ID:
                        {
                        alt35=4;
                        }
                        break;
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        {
                        alt35=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }

                    switch (alt35) {
                        case 1 :
                            // InternalVampireLanguage.g:2272:7: lv_constant_1_1= RULE_LOWER_WORD_ID
                            {
                            lv_constant_1_1=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_16); 

                            							newLeafNode(lv_constant_1_1, grammarAccess.getVLSAtomicFunctionAccess().getConstantLOWER_WORD_IDTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVLSAtomicFunctionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"constant",
                            								lv_constant_1_1,
                            								"ca.mcgill.ecse.dslreasoner.VampireLanguage.LOWER_WORD_ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalVampireLanguage.g:2287:7: lv_constant_1_2= RULE_SINGLE_QUOTE
                            {
                            lv_constant_1_2=(Token)match(input,RULE_SINGLE_QUOTE,FOLLOW_16); 

                            							newLeafNode(lv_constant_1_2, grammarAccess.getVLSAtomicFunctionAccess().getConstantSINGLE_QUOTETerminalRuleCall_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVLSAtomicFunctionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"constant",
                            								lv_constant_1_2,
                            								"ca.mcgill.ecse.dslreasoner.VampireLanguage.SINGLE_QUOTE");
                            						

                            }
                            break;
                        case 3 :
                            // InternalVampireLanguage.g:2302:7: lv_constant_1_3= RULE_DOLLAR_ID
                            {
                            lv_constant_1_3=(Token)match(input,RULE_DOLLAR_ID,FOLLOW_16); 

                            							newLeafNode(lv_constant_1_3, grammarAccess.getVLSAtomicFunctionAccess().getConstantDOLLAR_IDTerminalRuleCall_0_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVLSAtomicFunctionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"constant",
                            								lv_constant_1_3,
                            								"ca.mcgill.ecse.dslreasoner.VampireLanguage.DOLLAR_ID");
                            						

                            }
                            break;
                        case 4 :
                            // InternalVampireLanguage.g:2317:7: lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID
                            {
                            lv_constant_1_4=(Token)match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_16); 

                            							newLeafNode(lv_constant_1_4, grammarAccess.getVLSAtomicFunctionAccess().getConstantDOUBLE_DOLLAR_IDTerminalRuleCall_0_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVLSAtomicFunctionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"constant",
                            								lv_constant_1_4,
                            								"ca.mcgill.ecse.dslreasoner.VampireLanguage.DOUBLE_DOLLAR_ID");
                            						

                            }
                            break;
                        case 5 :
                            // InternalVampireLanguage.g:2332:7: lv_constant_1_5= ruleVLSRole
                            {

                            							newCompositeNode(grammarAccess.getVLSAtomicFunctionAccess().getConstantVLSRoleParserRuleCall_0_1_0_4());
                            						
                            pushFollow(FOLLOW_16);
                            lv_constant_1_5=ruleVLSRole();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVLSAtomicFunctionRule());
                            							}
                            							set(
                            								current,
                            								"constant",
                            								lv_constant_1_5,
                            								"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSRole");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalVampireLanguage.g:2350:4: (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )
                    // InternalVampireLanguage.g:2351:5: otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_33); 

                    					newLeafNode(otherlv_2, grammarAccess.getVLSAtomicFunctionAccess().getLeftParenthesisKeyword_0_2_0());
                    				
                    // InternalVampireLanguage.g:2355:5: ( (lv_terms_3_0= ruleVLSFofTerm ) )
                    // InternalVampireLanguage.g:2356:6: (lv_terms_3_0= ruleVLSFofTerm )
                    {
                    // InternalVampireLanguage.g:2356:6: (lv_terms_3_0= ruleVLSFofTerm )
                    // InternalVampireLanguage.g:2357:7: lv_terms_3_0= ruleVLSFofTerm
                    {

                    							newCompositeNode(grammarAccess.getVLSAtomicFunctionAccess().getTermsVLSFofTermParserRuleCall_0_2_1_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_terms_3_0=ruleVLSFofTerm();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getVLSAtomicFunctionRule());
                    							}
                    							add(
                    								current,
                    								"terms",
                    								lv_terms_3_0,
                    								"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSFofTerm");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalVampireLanguage.g:2374:5: (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==39) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:2375:6: otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) )
                    	    {
                    	    otherlv_4=(Token)match(input,39,FOLLOW_33); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getVLSAtomicFunctionAccess().getCommaKeyword_0_2_2_0());
                    	    					
                    	    // InternalVampireLanguage.g:2379:6: ( (lv_terms_5_0= ruleVLSFofTerm ) )
                    	    // InternalVampireLanguage.g:2380:7: (lv_terms_5_0= ruleVLSFofTerm )
                    	    {
                    	    // InternalVampireLanguage.g:2380:7: (lv_terms_5_0= ruleVLSFofTerm )
                    	    // InternalVampireLanguage.g:2381:8: lv_terms_5_0= ruleVLSFofTerm
                    	    {

                    	    								newCompositeNode(grammarAccess.getVLSAtomicFunctionAccess().getTermsVLSFofTermParserRuleCall_0_2_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_21);
                    	    lv_terms_5_0=ruleVLSFofTerm();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getVLSAtomicFunctionRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"terms",
                    	    									lv_terms_5_0,
                    	    									"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSFofTerm");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getVLSAtomicFunctionAccess().getRightParenthesisKeyword_0_2_3());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:2406:3: ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' )
                    {
                    // InternalVampireLanguage.g:2406:3: ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' )
                    // InternalVampireLanguage.g:2407:4: () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')'
                    {
                    // InternalVampireLanguage.g:2407:4: ()
                    // InternalVampireLanguage.g:2408:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSAtomicFunctionAccess().getVLSLessAction_1_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:2414:4: ( (lv_name_8_0= '$less' ) )
                    // InternalVampireLanguage.g:2415:5: (lv_name_8_0= '$less' )
                    {
                    // InternalVampireLanguage.g:2415:5: (lv_name_8_0= '$less' )
                    // InternalVampireLanguage.g:2416:6: lv_name_8_0= '$less'
                    {
                    lv_name_8_0=(Token)match(input,80,FOLLOW_16); 

                    						newLeafNode(lv_name_8_0, grammarAccess.getVLSAtomicFunctionAccess().getNameLessKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSAtomicFunctionRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_8_0, "$less");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,38,FOLLOW_33); 

                    				newLeafNode(otherlv_9, grammarAccess.getVLSAtomicFunctionAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalVampireLanguage.g:2432:4: ( (lv_terms_10_0= ruleVLSFofTerm ) )
                    // InternalVampireLanguage.g:2433:5: (lv_terms_10_0= ruleVLSFofTerm )
                    {
                    // InternalVampireLanguage.g:2433:5: (lv_terms_10_0= ruleVLSFofTerm )
                    // InternalVampireLanguage.g:2434:6: lv_terms_10_0= ruleVLSFofTerm
                    {

                    						newCompositeNode(grammarAccess.getVLSAtomicFunctionAccess().getTermsVLSFofTermParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_terms_10_0=ruleVLSFofTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVLSAtomicFunctionRule());
                    						}
                    						add(
                    							current,
                    							"terms",
                    							lv_terms_10_0,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSFofTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,39,FOLLOW_33); 

                    				newLeafNode(otherlv_11, grammarAccess.getVLSAtomicFunctionAccess().getCommaKeyword_1_4());
                    			
                    // InternalVampireLanguage.g:2455:4: ( (lv_terms_12_0= ruleVLSFofTerm ) )
                    // InternalVampireLanguage.g:2456:5: (lv_terms_12_0= ruleVLSFofTerm )
                    {
                    // InternalVampireLanguage.g:2456:5: (lv_terms_12_0= ruleVLSFofTerm )
                    // InternalVampireLanguage.g:2457:6: lv_terms_12_0= ruleVLSFofTerm
                    {

                    						newCompositeNode(grammarAccess.getVLSAtomicFunctionAccess().getTermsVLSFofTermParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_terms_12_0=ruleVLSFofTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVLSAtomicFunctionRule());
                    						}
                    						add(
                    							current,
                    							"terms",
                    							lv_terms_12_0,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSFofTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getVLSAtomicFunctionAccess().getRightParenthesisKeyword_1_6());
                    			

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
    // $ANTLR end "ruleVLSAtomicFunction"


    // $ANTLR start "entryRuleVLSVariable"
    // InternalVampireLanguage.g:2483:1: entryRuleVLSVariable returns [EObject current=null] : iv_ruleVLSVariable= ruleVLSVariable EOF ;
    public final EObject entryRuleVLSVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSVariable = null;


        try {
            // InternalVampireLanguage.g:2483:52: (iv_ruleVLSVariable= ruleVLSVariable EOF )
            // InternalVampireLanguage.g:2484:2: iv_ruleVLSVariable= ruleVLSVariable EOF
            {
             newCompositeNode(grammarAccess.getVLSVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSVariable=ruleVLSVariable();

            state._fsp--;

             current =iv_ruleVLSVariable; 
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
    // $ANTLR end "entryRuleVLSVariable"


    // $ANTLR start "ruleVLSVariable"
    // InternalVampireLanguage.g:2490:1: ruleVLSVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_UPPER_WORD_ID ) ) ;
    public final EObject ruleVLSVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:2496:2: ( ( (lv_name_0_0= RULE_UPPER_WORD_ID ) ) )
            // InternalVampireLanguage.g:2497:2: ( (lv_name_0_0= RULE_UPPER_WORD_ID ) )
            {
            // InternalVampireLanguage.g:2497:2: ( (lv_name_0_0= RULE_UPPER_WORD_ID ) )
            // InternalVampireLanguage.g:2498:3: (lv_name_0_0= RULE_UPPER_WORD_ID )
            {
            // InternalVampireLanguage.g:2498:3: (lv_name_0_0= RULE_UPPER_WORD_ID )
            // InternalVampireLanguage.g:2499:4: lv_name_0_0= RULE_UPPER_WORD_ID
            {
            lv_name_0_0=(Token)match(input,RULE_UPPER_WORD_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVLSVariableAccess().getNameUPPER_WORD_IDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVLSVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"ca.mcgill.ecse.dslreasoner.VampireLanguage.UPPER_WORD_ID");
            			

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
    // $ANTLR end "ruleVLSVariable"


    // $ANTLR start "entryRuleVLSFofTerm"
    // InternalVampireLanguage.g:2518:1: entryRuleVLSFofTerm returns [EObject current=null] : iv_ruleVLSFofTerm= ruleVLSFofTerm EOF ;
    public final EObject entryRuleVLSFofTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFofTerm = null;


        try {
            // InternalVampireLanguage.g:2518:51: (iv_ruleVLSFofTerm= ruleVLSFofTerm EOF )
            // InternalVampireLanguage.g:2519:2: iv_ruleVLSFofTerm= ruleVLSFofTerm EOF
            {
             newCompositeNode(grammarAccess.getVLSFofTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSFofTerm=ruleVLSFofTerm();

            state._fsp--;

             current =iv_ruleVLSFofTerm; 
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
    // $ANTLR end "entryRuleVLSFofTerm"


    // $ANTLR start "ruleVLSFofTerm"
    // InternalVampireLanguage.g:2525:1: ruleVLSFofTerm returns [EObject current=null] : (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionAsTerm_1= ruleVLSFunctionAsTerm | this_VLSDefinedTerm_2= ruleVLSDefinedTerm ) ;
    public final EObject ruleVLSFofTerm() throws RecognitionException {
        EObject current = null;

        EObject this_VLSVariable_0 = null;

        EObject this_VLSFunctionAsTerm_1 = null;

        EObject this_VLSDefinedTerm_2 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:2531:2: ( (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionAsTerm_1= ruleVLSFunctionAsTerm | this_VLSDefinedTerm_2= ruleVLSDefinedTerm ) )
            // InternalVampireLanguage.g:2532:2: (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionAsTerm_1= ruleVLSFunctionAsTerm | this_VLSDefinedTerm_2= ruleVLSDefinedTerm )
            {
            // InternalVampireLanguage.g:2532:2: (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionAsTerm_1= ruleVLSFunctionAsTerm | this_VLSDefinedTerm_2= ruleVLSDefinedTerm )
            int alt38=3;
            switch ( input.LA(1) ) {
            case RULE_UPPER_WORD_ID:
                {
                alt38=1;
                }
                break;
            case RULE_LOWER_WORD_ID:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt38=2;
                }
                break;
            case RULE_SIGNED_LITERAL:
            case RULE_DOUBLE_QUOTE:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalVampireLanguage.g:2533:3: this_VLSVariable_0= ruleVLSVariable
                    {

                    			newCompositeNode(grammarAccess.getVLSFofTermAccess().getVLSVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSVariable_0=ruleVLSVariable();

                    state._fsp--;


                    			current = this_VLSVariable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:2542:3: this_VLSFunctionAsTerm_1= ruleVLSFunctionAsTerm
                    {

                    			newCompositeNode(grammarAccess.getVLSFofTermAccess().getVLSFunctionAsTermParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSFunctionAsTerm_1=ruleVLSFunctionAsTerm();

                    state._fsp--;


                    			current = this_VLSFunctionAsTerm_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:2551:3: this_VLSDefinedTerm_2= ruleVLSDefinedTerm
                    {

                    			newCompositeNode(grammarAccess.getVLSFofTermAccess().getVLSDefinedTermParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSDefinedTerm_2=ruleVLSDefinedTerm();

                    state._fsp--;


                    			current = this_VLSDefinedTerm_2;
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
    // $ANTLR end "ruleVLSFofTerm"


    // $ANTLR start "entryRuleVLSFunctionAsTerm"
    // InternalVampireLanguage.g:2563:1: entryRuleVLSFunctionAsTerm returns [EObject current=null] : iv_ruleVLSFunctionAsTerm= ruleVLSFunctionAsTerm EOF ;
    public final EObject entryRuleVLSFunctionAsTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFunctionAsTerm = null;


        try {
            // InternalVampireLanguage.g:2563:58: (iv_ruleVLSFunctionAsTerm= ruleVLSFunctionAsTerm EOF )
            // InternalVampireLanguage.g:2564:2: iv_ruleVLSFunctionAsTerm= ruleVLSFunctionAsTerm EOF
            {
             newCompositeNode(grammarAccess.getVLSFunctionAsTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSFunctionAsTerm=ruleVLSFunctionAsTerm();

            state._fsp--;

             current =iv_ruleVLSFunctionAsTerm; 
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
    // $ANTLR end "entryRuleVLSFunctionAsTerm"


    // $ANTLR start "ruleVLSFunctionAsTerm"
    // InternalVampireLanguage.g:2570:1: ruleVLSFunctionAsTerm returns [EObject current=null] : ( ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleVLSFunctionAsTerm() throws RecognitionException {
        EObject current = null;

        Token lv_functor_0_1=null;
        Token lv_functor_0_2=null;
        Token lv_functor_0_3=null;
        Token lv_functor_0_4=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_terms_2_0 = null;

        EObject lv_terms_4_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:2576:2: ( ( ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? ) )
            // InternalVampireLanguage.g:2577:2: ( ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? )
            {
            // InternalVampireLanguage.g:2577:2: ( ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? )
            // InternalVampireLanguage.g:2578:3: ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )?
            {
            // InternalVampireLanguage.g:2578:3: ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) )
            // InternalVampireLanguage.g:2579:4: ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) )
            {
            // InternalVampireLanguage.g:2579:4: ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) )
            // InternalVampireLanguage.g:2580:5: (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID )
            {
            // InternalVampireLanguage.g:2580:5: (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID )
            int alt39=4;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt39=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt39=2;
                }
                break;
            case RULE_DOLLAR_ID:
                {
                alt39=3;
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalVampireLanguage.g:2581:6: lv_functor_0_1= RULE_LOWER_WORD_ID
                    {
                    lv_functor_0_1=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_43); 

                    						newLeafNode(lv_functor_0_1, grammarAccess.getVLSFunctionAsTermAccess().getFunctorLOWER_WORD_IDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFunctionAsTermRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"functor",
                    							lv_functor_0_1,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.LOWER_WORD_ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:2596:6: lv_functor_0_2= RULE_SINGLE_QUOTE
                    {
                    lv_functor_0_2=(Token)match(input,RULE_SINGLE_QUOTE,FOLLOW_43); 

                    						newLeafNode(lv_functor_0_2, grammarAccess.getVLSFunctionAsTermAccess().getFunctorSINGLE_QUOTETerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFunctionAsTermRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"functor",
                    							lv_functor_0_2,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.SINGLE_QUOTE");
                    					

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:2611:6: lv_functor_0_3= RULE_DOLLAR_ID
                    {
                    lv_functor_0_3=(Token)match(input,RULE_DOLLAR_ID,FOLLOW_43); 

                    						newLeafNode(lv_functor_0_3, grammarAccess.getVLSFunctionAsTermAccess().getFunctorDOLLAR_IDTerminalRuleCall_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFunctionAsTermRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"functor",
                    							lv_functor_0_3,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.DOLLAR_ID");
                    					

                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:2626:6: lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID
                    {
                    lv_functor_0_4=(Token)match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_43); 

                    						newLeafNode(lv_functor_0_4, grammarAccess.getVLSFunctionAsTermAccess().getFunctorDOUBLE_DOLLAR_IDTerminalRuleCall_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFunctionAsTermRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"functor",
                    							lv_functor_0_4,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.DOUBLE_DOLLAR_ID");
                    					

                    }
                    break;

            }


            }


            }

            // InternalVampireLanguage.g:2643:3: (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==38) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalVampireLanguage.g:2644:4: otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_33); 

                    				newLeafNode(otherlv_1, grammarAccess.getVLSFunctionAsTermAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalVampireLanguage.g:2648:4: ( (lv_terms_2_0= ruleVLSFofTerm ) )
                    // InternalVampireLanguage.g:2649:5: (lv_terms_2_0= ruleVLSFofTerm )
                    {
                    // InternalVampireLanguage.g:2649:5: (lv_terms_2_0= ruleVLSFofTerm )
                    // InternalVampireLanguage.g:2650:6: lv_terms_2_0= ruleVLSFofTerm
                    {

                    						newCompositeNode(grammarAccess.getVLSFunctionAsTermAccess().getTermsVLSFofTermParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_terms_2_0=ruleVLSFofTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVLSFunctionAsTermRule());
                    						}
                    						add(
                    							current,
                    							"terms",
                    							lv_terms_2_0,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSFofTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVampireLanguage.g:2667:4: (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==39) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:2668:5: otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) )
                    	    {
                    	    otherlv_3=(Token)match(input,39,FOLLOW_33); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getVLSFunctionAsTermAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalVampireLanguage.g:2672:5: ( (lv_terms_4_0= ruleVLSFofTerm ) )
                    	    // InternalVampireLanguage.g:2673:6: (lv_terms_4_0= ruleVLSFofTerm )
                    	    {
                    	    // InternalVampireLanguage.g:2673:6: (lv_terms_4_0= ruleVLSFofTerm )
                    	    // InternalVampireLanguage.g:2674:7: lv_terms_4_0= ruleVLSFofTerm
                    	    {

                    	    							newCompositeNode(grammarAccess.getVLSFunctionAsTermAccess().getTermsVLSFofTermParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_terms_4_0=ruleVLSFofTerm();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVLSFunctionAsTermRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"terms",
                    	    								lv_terms_4_0,
                    	    								"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSFofTerm");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getVLSFunctionAsTermAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleVLSFunctionAsTerm"


    // $ANTLR start "entryRuleVLSDefinedTerm"
    // InternalVampireLanguage.g:2701:1: entryRuleVLSDefinedTerm returns [EObject current=null] : iv_ruleVLSDefinedTerm= ruleVLSDefinedTerm EOF ;
    public final EObject entryRuleVLSDefinedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSDefinedTerm = null;


        try {
            // InternalVampireLanguage.g:2701:55: (iv_ruleVLSDefinedTerm= ruleVLSDefinedTerm EOF )
            // InternalVampireLanguage.g:2702:2: iv_ruleVLSDefinedTerm= ruleVLSDefinedTerm EOF
            {
             newCompositeNode(grammarAccess.getVLSDefinedTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSDefinedTerm=ruleVLSDefinedTerm();

            state._fsp--;

             current =iv_ruleVLSDefinedTerm; 
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
    // $ANTLR end "entryRuleVLSDefinedTerm"


    // $ANTLR start "ruleVLSDefinedTerm"
    // InternalVampireLanguage.g:2708:1: ruleVLSDefinedTerm returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE_QUOTE ) ) ) ) ;
    public final EObject ruleVLSDefinedTerm() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:2714:2: ( ( ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE_QUOTE ) ) ) ) )
            // InternalVampireLanguage.g:2715:2: ( ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE_QUOTE ) ) ) )
            {
            // InternalVampireLanguage.g:2715:2: ( ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE_QUOTE ) ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_SIGNED_LITERAL) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_DOUBLE_QUOTE) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalVampireLanguage.g:2716:3: ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) )
                    {
                    // InternalVampireLanguage.g:2716:3: ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) )
                    // InternalVampireLanguage.g:2717:4: () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) )
                    {
                    // InternalVampireLanguage.g:2717:4: ()
                    // InternalVampireLanguage.g:2718:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSDefinedTermAccess().getVLSIntAction_0_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:2724:4: ( (lv_value_1_0= RULE_SIGNED_LITERAL ) )
                    // InternalVampireLanguage.g:2725:5: (lv_value_1_0= RULE_SIGNED_LITERAL )
                    {
                    // InternalVampireLanguage.g:2725:5: (lv_value_1_0= RULE_SIGNED_LITERAL )
                    // InternalVampireLanguage.g:2726:6: lv_value_1_0= RULE_SIGNED_LITERAL
                    {
                    lv_value_1_0=(Token)match(input,RULE_SIGNED_LITERAL,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getVLSDefinedTermAccess().getValueSIGNED_LITERALTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSDefinedTermRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.SIGNED_LITERAL");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:2744:3: ( () ( (lv_value_3_0= RULE_DOUBLE_QUOTE ) ) )
                    {
                    // InternalVampireLanguage.g:2744:3: ( () ( (lv_value_3_0= RULE_DOUBLE_QUOTE ) ) )
                    // InternalVampireLanguage.g:2745:4: () ( (lv_value_3_0= RULE_DOUBLE_QUOTE ) )
                    {
                    // InternalVampireLanguage.g:2745:4: ()
                    // InternalVampireLanguage.g:2746:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSDefinedTermAccess().getVLSDoubleQuoteAction_1_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:2752:4: ( (lv_value_3_0= RULE_DOUBLE_QUOTE ) )
                    // InternalVampireLanguage.g:2753:5: (lv_value_3_0= RULE_DOUBLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:2753:5: (lv_value_3_0= RULE_DOUBLE_QUOTE )
                    // InternalVampireLanguage.g:2754:6: lv_value_3_0= RULE_DOUBLE_QUOTE
                    {
                    lv_value_3_0=(Token)match(input,RULE_DOUBLE_QUOTE,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getVLSDefinedTermAccess().getValueDOUBLE_QUOTETerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSDefinedTermRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.DOUBLE_QUOTE");
                    					

                    }


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
    // $ANTLR end "ruleVLSDefinedTerm"

    // Delegated rules


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\2\uffff\26\1\1\uffff";
    static final String dfa_3s = "\1\6\1\uffff\23\46\3\47\1\uffff";
    static final String dfa_4s = "\1\120\1\uffff\26\115\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\26\uffff\1\2";
    static final String dfa_6s = "\31\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\1\1\3\1\4\1\5\1\27\1\1\31\uffff\1\1\7\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\13\uffff\3\1\3\uffff\1\25\1\26\1\1",
            "",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\3\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\2\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\2\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            "\2\1\24\uffff\1\30\2\uffff\10\1\3\uffff\3\1",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1046:2: (this_VLSTerm_0= ruleVLSTerm | this_VLSDeclaration_1= ruleVLSDeclaration )";
        }
    }
    static final String dfa_8s = "\30\uffff";
    static final String dfa_9s = "\1\uffff\23\24\4\uffff";
    static final String dfa_10s = "\1\6\23\41\4\uffff";
    static final String dfa_11s = "\1\120\23\115\4\uffff";
    static final String dfa_12s = "\24\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_13s = "\30\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\27\1\2\1\3\1\4\1\26\1\27\41\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\21\uffff\2\24\1\25",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
            "\1\24\4\uffff\1\25\2\24\25\uffff\12\24\3\uffff\3\24",
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

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2069:2: (this_VLSAtomicConstant_0= ruleVLSAtomicConstant | this_VLSAtomicFunction_1= ruleVLSAtomicFunction | this_VLSVariable_2= ruleVLSVariable | this_VLSDefinedTerm_3= ruleVLSDefinedTerm )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000042480C00012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1FFFC00000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x1FFFC04000001FC0L,0x000000000001C700L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x1FFFC14300000140L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000380000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1FFFC04200000142L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004200000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1FFFC0C300000140L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1FFFC00000001FC0L,0x000000000001C000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1FFFC00000000740L,0x000000000000C000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000FFL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000000002L});

}