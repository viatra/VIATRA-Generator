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
import hu.bme.mit.inf.dslreasoner.services.VampireLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVampireLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SINGLE_COMMENT", "RULE_LOWER_WORD_ID", "RULE_SIGNED_INT_ID", "RULE_SINGLE_QUOTE", "RULE_DOLLAR_ID", "RULE_DOUBLE_DOLLAR_ID", "RULE_UPPER_WORD_ID", "RULE_DOUBLE_QUOTE", "RULE_SIGNED_REAL_ID", "RULE_SIGNED_RAT_ID", "RULE_ALPHA_NUMERIC", "RULE_INT", "RULE_UNSIGNED_INT_ID", "RULE_UNSIGNED_REAL_FRAC_ID", "RULE_UNSIGNED_REAL_EXP_ID", "RULE_UNSIGNED_RAT_ID", "RULE_ANY_OTHER", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'fof'", "'('", "','", "')'", "'.'", "'<=>'", "'=>'", "'<='", "'<~>'", "'~|'", "'~&'", "'&'", "'|'", "'!'", "'['", "']'", "':'", "'?'", "'~'", "'!='", "'='", "':='", "'axiom'", "'conjecture'", "'hypothesis'", "'definition'", "'assumption'", "'lemma'", "'theorem'", "'corollary'", "'negated_conjecture'", "'plain'", "'type'", "'fi_domain'", "'fi_functors'", "'fi_predicates'", "'unknown'"
    };
    public static final int RULE_UNSIGNED_RAT_ID=19;
    public static final int T__50=50;
    public static final int RULE_SIGNED_INT_ID=6;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_DOUBLE_QUOTE=11;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_UNSIGNED_REAL_FRAC_ID=17;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=21;
    public static final int RULE_SINGLE_QUOTE=7;
    public static final int RULE_SINGLE_COMMENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=15;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_SIGNED_RAT_ID=13;
    public static final int T__62=62;
    public static final int RULE_LOWER_WORD_ID=5;
    public static final int RULE_STRING=22;
    public static final int RULE_SL_COMMENT=24;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_UNSIGNED_REAL_EXP_ID=18;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_UPPER_WORD_ID=10;
    public static final int RULE_UNSIGNED_INT_ID=16;
    public static final int RULE_WS=25;
    public static final int RULE_DOLLAR_ID=8;
    public static final int RULE_ALPHA_NUMERIC=14;
    public static final int RULE_ANY_OTHER=20;
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
    // InternalVampireLanguage.g:65:1: entryRuleVampireModel returns [EObject current=null] : iv_ruleVampireModel= ruleVampireModel EOF ;
    public final EObject entryRuleVampireModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVampireModel = null;


        try {
            // InternalVampireLanguage.g:65:53: (iv_ruleVampireModel= ruleVampireModel EOF )
            // InternalVampireLanguage.g:66:2: iv_ruleVampireModel= ruleVampireModel EOF
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
    // InternalVampireLanguage.g:72:1: ruleVampireModel returns [EObject current=null] : ( ( (lv_comments_0_0= ruleVLSComment ) ) | ( (lv_formulas_1_0= ruleVLSFofFormula ) ) )* ;
    public final EObject ruleVampireModel() throws RecognitionException {
        EObject current = null;

        EObject lv_comments_0_0 = null;

        EObject lv_formulas_1_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:78:2: ( ( ( (lv_comments_0_0= ruleVLSComment ) ) | ( (lv_formulas_1_0= ruleVLSFofFormula ) ) )* )
            // InternalVampireLanguage.g:79:2: ( ( (lv_comments_0_0= ruleVLSComment ) ) | ( (lv_formulas_1_0= ruleVLSFofFormula ) ) )*
            {
            // InternalVampireLanguage.g:79:2: ( ( (lv_comments_0_0= ruleVLSComment ) ) | ( (lv_formulas_1_0= ruleVLSFofFormula ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SINGLE_COMMENT) ) {
                    alt1=1;
                }
                else if ( (LA1_0==26) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVampireLanguage.g:80:3: ( (lv_comments_0_0= ruleVLSComment ) )
            	    {
            	    // InternalVampireLanguage.g:80:3: ( (lv_comments_0_0= ruleVLSComment ) )
            	    // InternalVampireLanguage.g:81:4: (lv_comments_0_0= ruleVLSComment )
            	    {
            	    // InternalVampireLanguage.g:81:4: (lv_comments_0_0= ruleVLSComment )
            	    // InternalVampireLanguage.g:82:5: lv_comments_0_0= ruleVLSComment
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
            	    						"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSComment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVampireLanguage.g:100:3: ( (lv_formulas_1_0= ruleVLSFofFormula ) )
            	    {
            	    // InternalVampireLanguage.g:100:3: ( (lv_formulas_1_0= ruleVLSFofFormula ) )
            	    // InternalVampireLanguage.g:101:4: (lv_formulas_1_0= ruleVLSFofFormula )
            	    {
            	    // InternalVampireLanguage.g:101:4: (lv_formulas_1_0= ruleVLSFofFormula )
            	    // InternalVampireLanguage.g:102:5: lv_formulas_1_0= ruleVLSFofFormula
            	    {

            	    					newCompositeNode(grammarAccess.getVampireModelAccess().getFormulasVLSFofFormulaParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_formulas_1_0=ruleVLSFofFormula();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVampireModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"formulas",
            	    						lv_formulas_1_0,
            	    						"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSFofFormula");
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
    // InternalVampireLanguage.g:123:1: entryRuleVLSComment returns [EObject current=null] : iv_ruleVLSComment= ruleVLSComment EOF ;
    public final EObject entryRuleVLSComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSComment = null;


        try {
            // InternalVampireLanguage.g:123:51: (iv_ruleVLSComment= ruleVLSComment EOF )
            // InternalVampireLanguage.g:124:2: iv_ruleVLSComment= ruleVLSComment EOF
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
    // InternalVampireLanguage.g:130:1: ruleVLSComment returns [EObject current=null] : ( (lv_comment_0_0= RULE_SINGLE_COMMENT ) ) ;
    public final EObject ruleVLSComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:136:2: ( ( (lv_comment_0_0= RULE_SINGLE_COMMENT ) ) )
            // InternalVampireLanguage.g:137:2: ( (lv_comment_0_0= RULE_SINGLE_COMMENT ) )
            {
            // InternalVampireLanguage.g:137:2: ( (lv_comment_0_0= RULE_SINGLE_COMMENT ) )
            // InternalVampireLanguage.g:138:3: (lv_comment_0_0= RULE_SINGLE_COMMENT )
            {
            // InternalVampireLanguage.g:138:3: (lv_comment_0_0= RULE_SINGLE_COMMENT )
            // InternalVampireLanguage.g:139:4: lv_comment_0_0= RULE_SINGLE_COMMENT
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
            					"hu.bme.mit.inf.dslreasoner.VampireLanguage.SINGLE_COMMENT");
            			

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


    // $ANTLR start "entryRuleVLSFofFormula"
    // InternalVampireLanguage.g:158:1: entryRuleVLSFofFormula returns [EObject current=null] : iv_ruleVLSFofFormula= ruleVLSFofFormula EOF ;
    public final EObject entryRuleVLSFofFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFofFormula = null;


        try {
            // InternalVampireLanguage.g:158:54: (iv_ruleVLSFofFormula= ruleVLSFofFormula EOF )
            // InternalVampireLanguage.g:159:2: iv_ruleVLSFofFormula= ruleVLSFofFormula EOF
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
    // InternalVampireLanguage.g:165:1: ruleVLSFofFormula returns [EObject current=null] : (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_INT_ID | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' ) ;
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
        Enumerator lv_fofRole_4_0 = null;

        EObject lv_fofFormula_6_0 = null;

        EObject lv_annotations_8_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:171:2: ( (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_INT_ID | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' ) )
            // InternalVampireLanguage.g:172:2: (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_INT_ID | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' )
            {
            // InternalVampireLanguage.g:172:2: (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_INT_ID | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' )
            // InternalVampireLanguage.g:173:3: otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_INT_ID | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVLSFofFormulaAccess().getFofKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getVLSFofFormulaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalVampireLanguage.g:181:3: ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_INT_ID | lv_name_2_3= RULE_SINGLE_QUOTE ) ) )
            // InternalVampireLanguage.g:182:4: ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_INT_ID | lv_name_2_3= RULE_SINGLE_QUOTE ) )
            {
            // InternalVampireLanguage.g:182:4: ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_INT_ID | lv_name_2_3= RULE_SINGLE_QUOTE ) )
            // InternalVampireLanguage.g:183:5: (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_INT_ID | lv_name_2_3= RULE_SINGLE_QUOTE )
            {
            // InternalVampireLanguage.g:183:5: (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_INT_ID | lv_name_2_3= RULE_SINGLE_QUOTE )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt2=1;
                }
                break;
            case RULE_SIGNED_INT_ID:
                {
                alt2=2;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalVampireLanguage.g:184:6: lv_name_2_1= RULE_LOWER_WORD_ID
                    {
                    lv_name_2_1=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getVLSFofFormulaAccess().getNameLOWER_WORD_IDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFofFormulaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.LOWER_WORD_ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:199:6: lv_name_2_2= RULE_SIGNED_INT_ID
                    {
                    lv_name_2_2=(Token)match(input,RULE_SIGNED_INT_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getVLSFofFormulaAccess().getNameSIGNED_INT_IDTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFofFormulaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.SIGNED_INT_ID");
                    					

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:214:6: lv_name_2_3= RULE_SINGLE_QUOTE
                    {
                    lv_name_2_3=(Token)match(input,RULE_SINGLE_QUOTE,FOLLOW_6); 

                    						newLeafNode(lv_name_2_3, grammarAccess.getVLSFofFormulaAccess().getNameSINGLE_QUOTETerminalRuleCall_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFofFormulaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_3,
                    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.SINGLE_QUOTE");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_3());
            		
            // InternalVampireLanguage.g:235:3: ( (lv_fofRole_4_0= ruleVLSRole ) )
            // InternalVampireLanguage.g:236:4: (lv_fofRole_4_0= ruleVLSRole )
            {
            // InternalVampireLanguage.g:236:4: (lv_fofRole_4_0= ruleVLSRole )
            // InternalVampireLanguage.g:237:5: lv_fofRole_4_0= ruleVLSRole
            {

            					newCompositeNode(grammarAccess.getVLSFofFormulaAccess().getFofRoleVLSRoleEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_fofRole_4_0=ruleVLSRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSFofFormulaRule());
            					}
            					set(
            						current,
            						"fofRole",
            						lv_fofRole_4_0,
            						"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSRole");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_5());
            		
            // InternalVampireLanguage.g:258:3: ( (lv_fofFormula_6_0= ruleVLSTerm ) )
            // InternalVampireLanguage.g:259:4: (lv_fofFormula_6_0= ruleVLSTerm )
            {
            // InternalVampireLanguage.g:259:4: (lv_fofFormula_6_0= ruleVLSTerm )
            // InternalVampireLanguage.g:260:5: lv_fofFormula_6_0= ruleVLSTerm
            {

            					newCompositeNode(grammarAccess.getVLSFofFormulaAccess().getFofFormulaVLSTermParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_fofFormula_6_0=ruleVLSTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSFofFormulaRule());
            					}
            					set(
            						current,
            						"fofFormula",
            						lv_fofFormula_6_0,
            						"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVampireLanguage.g:277:3: (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalVampireLanguage.g:278:4: otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_7_0());
                    			
                    // InternalVampireLanguage.g:282:4: ( (lv_annotations_8_0= ruleVLSAnnotation ) )
                    // InternalVampireLanguage.g:283:5: (lv_annotations_8_0= ruleVLSAnnotation )
                    {
                    // InternalVampireLanguage.g:283:5: (lv_annotations_8_0= ruleVLSAnnotation )
                    // InternalVampireLanguage.g:284:6: lv_annotations_8_0= ruleVLSAnnotation
                    {

                    						newCompositeNode(grammarAccess.getVLSFofFormulaAccess().getAnnotationsVLSAnnotationParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_annotations_8_0=ruleVLSAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVLSFofFormulaRule());
                    						}
                    						set(
                    							current,
                    							"annotations",
                    							lv_annotations_8_0,
                    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getVLSFofFormulaAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,30,FOLLOW_2); 

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


    // $ANTLR start "entryRuleVLSAnnotation"
    // InternalVampireLanguage.g:314:1: entryRuleVLSAnnotation returns [EObject current=null] : iv_ruleVLSAnnotation= ruleVLSAnnotation EOF ;
    public final EObject entryRuleVLSAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAnnotation = null;


        try {
            // InternalVampireLanguage.g:314:54: (iv_ruleVLSAnnotation= ruleVLSAnnotation EOF )
            // InternalVampireLanguage.g:315:2: iv_ruleVLSAnnotation= ruleVLSAnnotation EOF
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
    // InternalVampireLanguage.g:321:1: ruleVLSAnnotation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_LOWER_WORD_ID ) )? ( (lv_closure_rule_1_0= ruleClosure_Rule ) ) ) ;
    public final EObject ruleVLSAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_closure_rule_1_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:327:2: ( ( ( (lv_name_0_0= RULE_LOWER_WORD_ID ) )? ( (lv_closure_rule_1_0= ruleClosure_Rule ) ) ) )
            // InternalVampireLanguage.g:328:2: ( ( (lv_name_0_0= RULE_LOWER_WORD_ID ) )? ( (lv_closure_rule_1_0= ruleClosure_Rule ) ) )
            {
            // InternalVampireLanguage.g:328:2: ( ( (lv_name_0_0= RULE_LOWER_WORD_ID ) )? ( (lv_closure_rule_1_0= ruleClosure_Rule ) ) )
            // InternalVampireLanguage.g:329:3: ( (lv_name_0_0= RULE_LOWER_WORD_ID ) )? ( (lv_closure_rule_1_0= ruleClosure_Rule ) )
            {
            // InternalVampireLanguage.g:329:3: ( (lv_name_0_0= RULE_LOWER_WORD_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_LOWER_WORD_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_LOWER_WORD_ID||LA4_1==27) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalVampireLanguage.g:330:4: (lv_name_0_0= RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:330:4: (lv_name_0_0= RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:331:5: lv_name_0_0= RULE_LOWER_WORD_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_10); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getVLSAnnotationAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVLSAnnotationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"hu.bme.mit.inf.dslreasoner.VampireLanguage.LOWER_WORD_ID");
                    				

                    }


                    }
                    break;

            }

            // InternalVampireLanguage.g:347:3: ( (lv_closure_rule_1_0= ruleClosure_Rule ) )
            // InternalVampireLanguage.g:348:4: (lv_closure_rule_1_0= ruleClosure_Rule )
            {
            // InternalVampireLanguage.g:348:4: (lv_closure_rule_1_0= ruleClosure_Rule )
            // InternalVampireLanguage.g:349:5: lv_closure_rule_1_0= ruleClosure_Rule
            {

            					newCompositeNode(grammarAccess.getVLSAnnotationAccess().getClosure_ruleClosure_RuleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_closure_rule_1_0=ruleClosure_Rule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSAnnotationRule());
            					}
            					set(
            						current,
            						"closure_rule",
            						lv_closure_rule_1_0,
            						"hu.bme.mit.inf.dslreasoner.VampireLanguage.Closure_Rule");
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
    // $ANTLR end "ruleVLSAnnotation"


    // $ANTLR start "entryRuleClosure_Rule"
    // InternalVampireLanguage.g:370:1: entryRuleClosure_Rule returns [EObject current=null] : iv_ruleClosure_Rule= ruleClosure_Rule EOF ;
    public final EObject entryRuleClosure_Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosure_Rule = null;


        try {
            // InternalVampireLanguage.g:370:53: (iv_ruleClosure_Rule= ruleClosure_Rule EOF )
            // InternalVampireLanguage.g:371:2: iv_ruleClosure_Rule= ruleClosure_Rule EOF
            {
             newCompositeNode(grammarAccess.getClosure_RuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClosure_Rule=ruleClosure_Rule();

            state._fsp--;

             current =iv_ruleClosure_Rule; 
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
    // $ANTLR end "entryRuleClosure_Rule"


    // $ANTLR start "ruleClosure_Rule"
    // InternalVampireLanguage.g:377:1: ruleClosure_Rule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_LOWER_WORD_ID ) ) | (otherlv_1= '(' this_VLSAnnotation_2= ruleVLSAnnotation otherlv_3= ')' ) ) ;
    public final EObject ruleClosure_Rule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_VLSAnnotation_2 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:383:2: ( ( ( (lv_name_0_0= RULE_LOWER_WORD_ID ) ) | (otherlv_1= '(' this_VLSAnnotation_2= ruleVLSAnnotation otherlv_3= ')' ) ) )
            // InternalVampireLanguage.g:384:2: ( ( (lv_name_0_0= RULE_LOWER_WORD_ID ) ) | (otherlv_1= '(' this_VLSAnnotation_2= ruleVLSAnnotation otherlv_3= ')' ) )
            {
            // InternalVampireLanguage.g:384:2: ( ( (lv_name_0_0= RULE_LOWER_WORD_ID ) ) | (otherlv_1= '(' this_VLSAnnotation_2= ruleVLSAnnotation otherlv_3= ')' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_LOWER_WORD_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalVampireLanguage.g:385:3: ( (lv_name_0_0= RULE_LOWER_WORD_ID ) )
                    {
                    // InternalVampireLanguage.g:385:3: ( (lv_name_0_0= RULE_LOWER_WORD_ID ) )
                    // InternalVampireLanguage.g:386:4: (lv_name_0_0= RULE_LOWER_WORD_ID )
                    {
                    // InternalVampireLanguage.g:386:4: (lv_name_0_0= RULE_LOWER_WORD_ID )
                    // InternalVampireLanguage.g:387:5: lv_name_0_0= RULE_LOWER_WORD_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getClosure_RuleAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClosure_RuleRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"hu.bme.mit.inf.dslreasoner.VampireLanguage.LOWER_WORD_ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:404:3: (otherlv_1= '(' this_VLSAnnotation_2= ruleVLSAnnotation otherlv_3= ')' )
                    {
                    // InternalVampireLanguage.g:404:3: (otherlv_1= '(' this_VLSAnnotation_2= ruleVLSAnnotation otherlv_3= ')' )
                    // InternalVampireLanguage.g:405:4: otherlv_1= '(' this_VLSAnnotation_2= ruleVLSAnnotation otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getClosure_RuleAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getClosure_RuleAccess().getVLSAnnotationParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_VLSAnnotation_2=ruleVLSAnnotation();

                    state._fsp--;


                    				current = this_VLSAnnotation_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getClosure_RuleAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "ruleClosure_Rule"


    // $ANTLR start "entryRuleVLSTerm"
    // InternalVampireLanguage.g:426:1: entryRuleVLSTerm returns [EObject current=null] : iv_ruleVLSTerm= ruleVLSTerm EOF ;
    public final EObject entryRuleVLSTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSTerm = null;


        try {
            // InternalVampireLanguage.g:426:48: (iv_ruleVLSTerm= ruleVLSTerm EOF )
            // InternalVampireLanguage.g:427:2: iv_ruleVLSTerm= ruleVLSTerm EOF
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
    // InternalVampireLanguage.g:433:1: ruleVLSTerm returns [EObject current=null] : this_VLSBinary_0= ruleVLSBinary ;
    public final EObject ruleVLSTerm() throws RecognitionException {
        EObject current = null;

        EObject this_VLSBinary_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:439:2: (this_VLSBinary_0= ruleVLSBinary )
            // InternalVampireLanguage.g:440:2: this_VLSBinary_0= ruleVLSBinary
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
    // InternalVampireLanguage.g:451:1: entryRuleVLSBinary returns [EObject current=null] : iv_ruleVLSBinary= ruleVLSBinary EOF ;
    public final EObject entryRuleVLSBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSBinary = null;


        try {
            // InternalVampireLanguage.g:451:50: (iv_ruleVLSBinary= ruleVLSBinary EOF )
            // InternalVampireLanguage.g:452:2: iv_ruleVLSBinary= ruleVLSBinary EOF
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
    // InternalVampireLanguage.g:458:1: ruleVLSBinary returns [EObject current=null] : (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? ) ;
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
            // InternalVampireLanguage.g:464:2: ( (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? ) )
            // InternalVampireLanguage.g:465:2: (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? )
            {
            // InternalVampireLanguage.g:465:2: (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? )
            // InternalVampireLanguage.g:466:3: this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getVLSBinaryAccess().getVLSUnitaryFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_VLSUnitaryFormula_0=ruleVLSUnitaryFormula();

            state._fsp--;


            			current = this_VLSUnitaryFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalVampireLanguage.g:474:3: ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )?
            int alt9=4;
            switch ( input.LA(1) ) {
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    {
                    alt9=1;
                    }
                    break;
                case 37:
                    {
                    alt9=2;
                    }
                    break;
                case 38:
                    {
                    alt9=3;
                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // InternalVampireLanguage.g:475:4: ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) )
                    {
                    // InternalVampireLanguage.g:475:4: ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) )
                    // InternalVampireLanguage.g:476:5: ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) )
                    {
                    // InternalVampireLanguage.g:476:5: ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) )
                    int alt6=6;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt6=1;
                        }
                        break;
                    case 32:
                        {
                        alt6=2;
                        }
                        break;
                    case 33:
                        {
                        alt6=3;
                        }
                        break;
                    case 34:
                        {
                        alt6=4;
                        }
                        break;
                    case 35:
                        {
                        alt6=5;
                        }
                        break;
                    case 36:
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
                            // InternalVampireLanguage.g:477:6: ( () otherlv_2= '<=>' )
                            {
                            // InternalVampireLanguage.g:477:6: ( () otherlv_2= '<=>' )
                            // InternalVampireLanguage.g:478:7: () otherlv_2= '<=>'
                            {
                            // InternalVampireLanguage.g:478:7: ()
                            // InternalVampireLanguage.g:479:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSEquivalentLeftAction_1_0_0_0_0(),
                            									current);
                            							

                            }

                            otherlv_2=(Token)match(input,31,FOLLOW_8); 

                            							newLeafNode(otherlv_2, grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_0_1());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalVampireLanguage.g:491:6: ( () otherlv_4= '=>' )
                            {
                            // InternalVampireLanguage.g:491:6: ( () otherlv_4= '=>' )
                            // InternalVampireLanguage.g:492:7: () otherlv_4= '=>'
                            {
                            // InternalVampireLanguage.g:492:7: ()
                            // InternalVampireLanguage.g:493:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSImpliesLeftAction_1_0_0_1_0(),
                            									current);
                            							

                            }

                            otherlv_4=(Token)match(input,32,FOLLOW_8); 

                            							newLeafNode(otherlv_4, grammarAccess.getVLSBinaryAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_1());
                            						

                            }


                            }
                            break;
                        case 3 :
                            // InternalVampireLanguage.g:505:6: ( () otherlv_6= '<=' )
                            {
                            // InternalVampireLanguage.g:505:6: ( () otherlv_6= '<=' )
                            // InternalVampireLanguage.g:506:7: () otherlv_6= '<='
                            {
                            // InternalVampireLanguage.g:506:7: ()
                            // InternalVampireLanguage.g:507:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSRevImpliesLeftAction_1_0_0_2_0(),
                            									current);
                            							

                            }

                            otherlv_6=(Token)match(input,33,FOLLOW_8); 

                            							newLeafNode(otherlv_6, grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignKeyword_1_0_0_2_1());
                            						

                            }


                            }
                            break;
                        case 4 :
                            // InternalVampireLanguage.g:519:6: ( () otherlv_8= '<~>' )
                            {
                            // InternalVampireLanguage.g:519:6: ( () otherlv_8= '<~>' )
                            // InternalVampireLanguage.g:520:7: () otherlv_8= '<~>'
                            {
                            // InternalVampireLanguage.g:520:7: ()
                            // InternalVampireLanguage.g:521:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSXnorLeftAction_1_0_0_3_0(),
                            									current);
                            							

                            }

                            otherlv_8=(Token)match(input,34,FOLLOW_8); 

                            							newLeafNode(otherlv_8, grammarAccess.getVLSBinaryAccess().getLessThanSignTildeGreaterThanSignKeyword_1_0_0_3_1());
                            						

                            }


                            }
                            break;
                        case 5 :
                            // InternalVampireLanguage.g:533:6: ( () otherlv_10= '~|' )
                            {
                            // InternalVampireLanguage.g:533:6: ( () otherlv_10= '~|' )
                            // InternalVampireLanguage.g:534:7: () otherlv_10= '~|'
                            {
                            // InternalVampireLanguage.g:534:7: ()
                            // InternalVampireLanguage.g:535:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSNorLeftAction_1_0_0_4_0(),
                            									current);
                            							

                            }

                            otherlv_10=(Token)match(input,35,FOLLOW_8); 

                            							newLeafNode(otherlv_10, grammarAccess.getVLSBinaryAccess().getTildeVerticalLineKeyword_1_0_0_4_1());
                            						

                            }


                            }
                            break;
                        case 6 :
                            // InternalVampireLanguage.g:547:6: ( () otherlv_12= '~&' )
                            {
                            // InternalVampireLanguage.g:547:6: ( () otherlv_12= '~&' )
                            // InternalVampireLanguage.g:548:7: () otherlv_12= '~&'
                            {
                            // InternalVampireLanguage.g:548:7: ()
                            // InternalVampireLanguage.g:549:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSNandLeftAction_1_0_0_5_0(),
                            									current);
                            							

                            }

                            otherlv_12=(Token)match(input,36,FOLLOW_8); 

                            							newLeafNode(otherlv_12, grammarAccess.getVLSBinaryAccess().getTildeAmpersandKeyword_1_0_0_5_1());
                            						

                            }


                            }
                            break;

                    }

                    // InternalVampireLanguage.g:561:5: ( (lv_right_13_0= ruleVLSUnitaryFormula ) )
                    // InternalVampireLanguage.g:562:6: (lv_right_13_0= ruleVLSUnitaryFormula )
                    {
                    // InternalVampireLanguage.g:562:6: (lv_right_13_0= ruleVLSUnitaryFormula )
                    // InternalVampireLanguage.g:563:7: lv_right_13_0= ruleVLSUnitaryFormula
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
                    								"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSUnitaryFormula");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:582:4: ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+
                    {
                    // InternalVampireLanguage.g:582:4: ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==37) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:583:5: () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) )
                    	    {
                    	    // InternalVampireLanguage.g:583:5: ()
                    	    // InternalVampireLanguage.g:584:6: 
                    	    {

                    	    						current = forceCreateModelElementAndSet(
                    	    							grammarAccess.getVLSBinaryAccess().getVLSAndLeftAction_1_1_0(),
                    	    							current);
                    	    					

                    	    }

                    	    otherlv_15=(Token)match(input,37,FOLLOW_8); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getVLSBinaryAccess().getAmpersandKeyword_1_1_1());
                    	    				
                    	    // InternalVampireLanguage.g:594:5: ( (lv_right_16_0= ruleVLSUnitaryFormula ) )
                    	    // InternalVampireLanguage.g:595:6: (lv_right_16_0= ruleVLSUnitaryFormula )
                    	    {
                    	    // InternalVampireLanguage.g:595:6: (lv_right_16_0= ruleVLSUnitaryFormula )
                    	    // InternalVampireLanguage.g:596:7: lv_right_16_0= ruleVLSUnitaryFormula
                    	    {

                    	    							newCompositeNode(grammarAccess.getVLSBinaryAccess().getRightVLSUnitaryFormulaParserRuleCall_1_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_right_16_0=ruleVLSUnitaryFormula();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVLSBinaryRule());
                    	    							}
                    	    							set(
                    	    								current,
                    	    								"right",
                    	    								lv_right_16_0,
                    	    								"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSUnitaryFormula");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


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


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:615:4: ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+
                    {
                    // InternalVampireLanguage.g:615:4: ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==38) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:616:5: () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) )
                    	    {
                    	    // InternalVampireLanguage.g:616:5: ()
                    	    // InternalVampireLanguage.g:617:6: 
                    	    {

                    	    						current = forceCreateModelElementAndSet(
                    	    							grammarAccess.getVLSBinaryAccess().getVLSOrLeftAction_1_2_0(),
                    	    							current);
                    	    					

                    	    }

                    	    otherlv_18=(Token)match(input,38,FOLLOW_8); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getVLSBinaryAccess().getVerticalLineKeyword_1_2_1());
                    	    				
                    	    // InternalVampireLanguage.g:627:5: ( (lv_right_19_0= ruleVLSUnitaryFormula ) )
                    	    // InternalVampireLanguage.g:628:6: (lv_right_19_0= ruleVLSUnitaryFormula )
                    	    {
                    	    // InternalVampireLanguage.g:628:6: (lv_right_19_0= ruleVLSUnitaryFormula )
                    	    // InternalVampireLanguage.g:629:7: lv_right_19_0= ruleVLSUnitaryFormula
                    	    {

                    	    							newCompositeNode(grammarAccess.getVLSBinaryAccess().getRightVLSUnitaryFormulaParserRuleCall_1_2_2_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_right_19_0=ruleVLSUnitaryFormula();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVLSBinaryRule());
                    	    							}
                    	    							set(
                    	    								current,
                    	    								"right",
                    	    								lv_right_19_0,
                    	    								"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSUnitaryFormula");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
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
    // InternalVampireLanguage.g:652:1: entryRuleVLSUnitaryFormula returns [EObject current=null] : iv_ruleVLSUnitaryFormula= ruleVLSUnitaryFormula EOF ;
    public final EObject entryRuleVLSUnitaryFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUnitaryFormula = null;


        try {
            // InternalVampireLanguage.g:652:58: (iv_ruleVLSUnitaryFormula= ruleVLSUnitaryFormula EOF )
            // InternalVampireLanguage.g:653:2: iv_ruleVLSUnitaryFormula= ruleVLSUnitaryFormula EOF
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
    // InternalVampireLanguage.g:659:1: ruleVLSUnitaryFormula returns [EObject current=null] : (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) ) ;
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
            // InternalVampireLanguage.g:665:2: ( (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) ) )
            // InternalVampireLanguage.g:666:2: (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) )
            {
            // InternalVampireLanguage.g:666:2: (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt10=1;
                }
                break;
            case 43:
                {
                alt10=2;
                }
                break;
            case 44:
                {
                alt10=3;
                }
                break;
            case RULE_LOWER_WORD_ID:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt10=4;
                }
                break;
            case 27:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalVampireLanguage.g:667:3: this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier
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
                    // InternalVampireLanguage.g:676:3: this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier
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
                    // InternalVampireLanguage.g:685:3: this_VLSUnaryNegation_2= ruleVLSUnaryNegation
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
                    // InternalVampireLanguage.g:694:3: this_VLSUnaryInfix_3= ruleVLSUnaryInfix
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
                    // InternalVampireLanguage.g:703:3: (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' )
                    {
                    // InternalVampireLanguage.g:703:3: (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' )
                    // InternalVampireLanguage.g:704:4: otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getVLSUnitaryFormulaAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getVLSUnitaryFormulaAccess().getVLSTermParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_VLSTerm_5=ruleVLSTerm();

                    state._fsp--;


                    				current = this_VLSTerm_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,29,FOLLOW_2); 

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
    // InternalVampireLanguage.g:725:1: entryRuleVLSUniversalQuantifier returns [EObject current=null] : iv_ruleVLSUniversalQuantifier= ruleVLSUniversalQuantifier EOF ;
    public final EObject entryRuleVLSUniversalQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUniversalQuantifier = null;


        try {
            // InternalVampireLanguage.g:725:63: (iv_ruleVLSUniversalQuantifier= ruleVLSUniversalQuantifier EOF )
            // InternalVampireLanguage.g:726:2: iv_ruleVLSUniversalQuantifier= ruleVLSUniversalQuantifier EOF
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
    // InternalVampireLanguage.g:732:1: ruleVLSUniversalQuantifier returns [EObject current=null] : ( () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) ;
    public final EObject ruleVLSUniversalQuantifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_variables_3_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_operand_8_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:738:2: ( ( () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) )
            // InternalVampireLanguage.g:739:2: ( () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            {
            // InternalVampireLanguage.g:739:2: ( () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            // InternalVampireLanguage.g:740:3: () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            {
            // InternalVampireLanguage.g:740:3: ()
            // InternalVampireLanguage.g:741:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSUniversalQuantifierAccess().getVLSUniversalQuantifierAction_0(),
            					current);
            			

            }

            // InternalVampireLanguage.g:747:3: (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' )
            // InternalVampireLanguage.g:748:4: otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':'
            {
            otherlv_1=(Token)match(input,39,FOLLOW_16); 

            				newLeafNode(otherlv_1, grammarAccess.getVLSUniversalQuantifierAccess().getExclamationMarkKeyword_1_0());
            			
            otherlv_2=(Token)match(input,40,FOLLOW_17); 

            				newLeafNode(otherlv_2, grammarAccess.getVLSUniversalQuantifierAccess().getLeftSquareBracketKeyword_1_1());
            			
            // InternalVampireLanguage.g:756:4: ( (lv_variables_3_0= ruleVLSVariable ) )
            // InternalVampireLanguage.g:757:5: (lv_variables_3_0= ruleVLSVariable )
            {
            // InternalVampireLanguage.g:757:5: (lv_variables_3_0= ruleVLSVariable )
            // InternalVampireLanguage.g:758:6: lv_variables_3_0= ruleVLSVariable
            {

            						newCompositeNode(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_18);
            lv_variables_3_0=ruleVLSVariable();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getVLSUniversalQuantifierRule());
            						}
            						add(
            							current,
            							"variables",
            							lv_variables_3_0,
            							"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSVariable");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalVampireLanguage.g:775:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalVampireLanguage.g:776:5: otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_17); 

            	    					newLeafNode(otherlv_4, grammarAccess.getVLSUniversalQuantifierAccess().getCommaKeyword_1_3_0());
            	    				
            	    // InternalVampireLanguage.g:780:5: ( (lv_variables_5_0= ruleVLSVariable ) )
            	    // InternalVampireLanguage.g:781:6: (lv_variables_5_0= ruleVLSVariable )
            	    {
            	    // InternalVampireLanguage.g:781:6: (lv_variables_5_0= ruleVLSVariable )
            	    // InternalVampireLanguage.g:782:7: lv_variables_5_0= ruleVLSVariable
            	    {

            	    							newCompositeNode(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_3_1_0());
            	    						
            	    pushFollow(FOLLOW_18);
            	    lv_variables_5_0=ruleVLSVariable();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVLSUniversalQuantifierRule());
            	    							}
            	    							add(
            	    								current,
            	    								"variables",
            	    								lv_variables_5_0,
            	    								"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSVariable");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,41,FOLLOW_19); 

            				newLeafNode(otherlv_6, grammarAccess.getVLSUniversalQuantifierAccess().getRightSquareBracketKeyword_1_4());
            			
            otherlv_7=(Token)match(input,42,FOLLOW_8); 

            				newLeafNode(otherlv_7, grammarAccess.getVLSUniversalQuantifierAccess().getColonKeyword_1_5());
            			

            }

            // InternalVampireLanguage.g:809:3: ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:810:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:810:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:811:5: lv_operand_8_0= ruleVLSUnitaryFormula
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
            						"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSUnitaryFormula");
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
    // InternalVampireLanguage.g:832:1: entryRuleVLSExistentialQuantifier returns [EObject current=null] : iv_ruleVLSExistentialQuantifier= ruleVLSExistentialQuantifier EOF ;
    public final EObject entryRuleVLSExistentialQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSExistentialQuantifier = null;


        try {
            // InternalVampireLanguage.g:832:65: (iv_ruleVLSExistentialQuantifier= ruleVLSExistentialQuantifier EOF )
            // InternalVampireLanguage.g:833:2: iv_ruleVLSExistentialQuantifier= ruleVLSExistentialQuantifier EOF
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
    // InternalVampireLanguage.g:839:1: ruleVLSExistentialQuantifier returns [EObject current=null] : ( () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) ;
    public final EObject ruleVLSExistentialQuantifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_variables_3_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_operand_8_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:845:2: ( ( () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) )
            // InternalVampireLanguage.g:846:2: ( () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            {
            // InternalVampireLanguage.g:846:2: ( () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            // InternalVampireLanguage.g:847:3: () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            {
            // InternalVampireLanguage.g:847:3: ()
            // InternalVampireLanguage.g:848:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSExistentialQuantifierAccess().getVLSExistentialQuantifierAction_0(),
            					current);
            			

            }

            // InternalVampireLanguage.g:854:3: (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' )
            // InternalVampireLanguage.g:855:4: otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':'
            {
            otherlv_1=(Token)match(input,43,FOLLOW_16); 

            				newLeafNode(otherlv_1, grammarAccess.getVLSExistentialQuantifierAccess().getQuestionMarkKeyword_1_0());
            			
            otherlv_2=(Token)match(input,40,FOLLOW_17); 

            				newLeafNode(otherlv_2, grammarAccess.getVLSExistentialQuantifierAccess().getLeftSquareBracketKeyword_1_1());
            			
            // InternalVampireLanguage.g:863:4: ( (lv_variables_3_0= ruleVLSVariable ) )
            // InternalVampireLanguage.g:864:5: (lv_variables_3_0= ruleVLSVariable )
            {
            // InternalVampireLanguage.g:864:5: (lv_variables_3_0= ruleVLSVariable )
            // InternalVampireLanguage.g:865:6: lv_variables_3_0= ruleVLSVariable
            {

            						newCompositeNode(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_18);
            lv_variables_3_0=ruleVLSVariable();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getVLSExistentialQuantifierRule());
            						}
            						add(
            							current,
            							"variables",
            							lv_variables_3_0,
            							"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSVariable");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalVampireLanguage.g:882:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalVampireLanguage.g:883:5: otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_17); 

            	    					newLeafNode(otherlv_4, grammarAccess.getVLSExistentialQuantifierAccess().getCommaKeyword_1_3_0());
            	    				
            	    // InternalVampireLanguage.g:887:5: ( (lv_variables_5_0= ruleVLSVariable ) )
            	    // InternalVampireLanguage.g:888:6: (lv_variables_5_0= ruleVLSVariable )
            	    {
            	    // InternalVampireLanguage.g:888:6: (lv_variables_5_0= ruleVLSVariable )
            	    // InternalVampireLanguage.g:889:7: lv_variables_5_0= ruleVLSVariable
            	    {

            	    							newCompositeNode(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_3_1_0());
            	    						
            	    pushFollow(FOLLOW_18);
            	    lv_variables_5_0=ruleVLSVariable();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVLSExistentialQuantifierRule());
            	    							}
            	    							add(
            	    								current,
            	    								"variables",
            	    								lv_variables_5_0,
            	    								"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSVariable");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,41,FOLLOW_19); 

            				newLeafNode(otherlv_6, grammarAccess.getVLSExistentialQuantifierAccess().getRightSquareBracketKeyword_1_4());
            			
            otherlv_7=(Token)match(input,42,FOLLOW_8); 

            				newLeafNode(otherlv_7, grammarAccess.getVLSExistentialQuantifierAccess().getColonKeyword_1_5());
            			

            }

            // InternalVampireLanguage.g:916:3: ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:917:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:917:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:918:5: lv_operand_8_0= ruleVLSUnitaryFormula
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
            						"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSUnitaryFormula");
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
    // InternalVampireLanguage.g:939:1: entryRuleVLSUnaryNegation returns [EObject current=null] : iv_ruleVLSUnaryNegation= ruleVLSUnaryNegation EOF ;
    public final EObject entryRuleVLSUnaryNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUnaryNegation = null;


        try {
            // InternalVampireLanguage.g:939:57: (iv_ruleVLSUnaryNegation= ruleVLSUnaryNegation EOF )
            // InternalVampireLanguage.g:940:2: iv_ruleVLSUnaryNegation= ruleVLSUnaryNegation EOF
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
    // InternalVampireLanguage.g:946:1: ruleVLSUnaryNegation returns [EObject current=null] : ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) ) ;
    public final EObject ruleVLSUnaryNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:952:2: ( ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) ) )
            // InternalVampireLanguage.g:953:2: ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) )
            {
            // InternalVampireLanguage.g:953:2: ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) )
            // InternalVampireLanguage.g:954:3: () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) )
            {
            // InternalVampireLanguage.g:954:3: ()
            // InternalVampireLanguage.g:955:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSUnaryNegationAccess().getVLSUnaryNegationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getVLSUnaryNegationAccess().getTildeKeyword_1());
            		
            // InternalVampireLanguage.g:965:3: ( (lv_operand_2_0= ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:966:4: (lv_operand_2_0= ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:966:4: (lv_operand_2_0= ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:967:5: lv_operand_2_0= ruleVLSUnitaryFormula
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
            						"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSUnitaryFormula");
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
    // InternalVampireLanguage.g:988:1: entryRuleVLSUnaryInfix returns [EObject current=null] : iv_ruleVLSUnaryInfix= ruleVLSUnaryInfix EOF ;
    public final EObject entryRuleVLSUnaryInfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUnaryInfix = null;


        try {
            // InternalVampireLanguage.g:988:54: (iv_ruleVLSUnaryInfix= ruleVLSUnaryInfix EOF )
            // InternalVampireLanguage.g:989:2: iv_ruleVLSUnaryInfix= ruleVLSUnaryInfix EOF
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
    // InternalVampireLanguage.g:995:1: ruleVLSUnaryInfix returns [EObject current=null] : (this_VLSFunction_0= ruleVLSFunction ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSFunction ) ) )? ) ;
    public final EObject ruleVLSUnaryInfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_VLSFunction_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1001:2: ( (this_VLSFunction_0= ruleVLSFunction ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSFunction ) ) )? ) )
            // InternalVampireLanguage.g:1002:2: (this_VLSFunction_0= ruleVLSFunction ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSFunction ) ) )? )
            {
            // InternalVampireLanguage.g:1002:2: (this_VLSFunction_0= ruleVLSFunction ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSFunction ) ) )? )
            // InternalVampireLanguage.g:1003:3: this_VLSFunction_0= ruleVLSFunction ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSFunction ) ) )?
            {

            			newCompositeNode(grammarAccess.getVLSUnaryInfixAccess().getVLSFunctionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_VLSFunction_0=ruleVLSFunction();

            state._fsp--;


            			current = this_VLSFunction_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalVampireLanguage.g:1011:3: ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSFunction ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=45 && LA14_0<=47)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVampireLanguage.g:1012:4: ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSFunction ) )
                    {
                    // InternalVampireLanguage.g:1012:4: ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) )
                    int alt13=3;
                    switch ( input.LA(1) ) {
                    case 45:
                        {
                        alt13=1;
                        }
                        break;
                    case 46:
                        {
                        alt13=2;
                        }
                        break;
                    case 47:
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
                            // InternalVampireLanguage.g:1013:5: ( () otherlv_2= '!=' )
                            {
                            // InternalVampireLanguage.g:1013:5: ( () otherlv_2= '!=' )
                            // InternalVampireLanguage.g:1014:6: () otherlv_2= '!='
                            {
                            // InternalVampireLanguage.g:1014:6: ()
                            // InternalVampireLanguage.g:1015:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getVLSUnaryInfixAccess().getVLSInequalityLeftAction_1_0_0_0(),
                            								current);
                            						

                            }

                            otherlv_2=(Token)match(input,45,FOLLOW_21); 

                            						newLeafNode(otherlv_2, grammarAccess.getVLSUnaryInfixAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalVampireLanguage.g:1027:5: ( () otherlv_4= '=' )
                            {
                            // InternalVampireLanguage.g:1027:5: ( () otherlv_4= '=' )
                            // InternalVampireLanguage.g:1028:6: () otherlv_4= '='
                            {
                            // InternalVampireLanguage.g:1028:6: ()
                            // InternalVampireLanguage.g:1029:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getVLSUnaryInfixAccess().getVLSEqualityLeftAction_1_0_1_0(),
                            								current);
                            						

                            }

                            otherlv_4=(Token)match(input,46,FOLLOW_21); 

                            						newLeafNode(otherlv_4, grammarAccess.getVLSUnaryInfixAccess().getEqualsSignKeyword_1_0_1_1());
                            					

                            }


                            }
                            break;
                        case 3 :
                            // InternalVampireLanguage.g:1041:5: ( () otherlv_6= ':=' )
                            {
                            // InternalVampireLanguage.g:1041:5: ( () otherlv_6= ':=' )
                            // InternalVampireLanguage.g:1042:6: () otherlv_6= ':='
                            {
                            // InternalVampireLanguage.g:1042:6: ()
                            // InternalVampireLanguage.g:1043:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getVLSUnaryInfixAccess().getVLSAssignmentLeftAction_1_0_2_0(),
                            								current);
                            						

                            }

                            otherlv_6=(Token)match(input,47,FOLLOW_21); 

                            						newLeafNode(otherlv_6, grammarAccess.getVLSUnaryInfixAccess().getColonEqualsSignKeyword_1_0_2_1());
                            					

                            }


                            }
                            break;

                    }

                    // InternalVampireLanguage.g:1055:4: ( (lv_right_7_0= ruleVLSFunction ) )
                    // InternalVampireLanguage.g:1056:5: (lv_right_7_0= ruleVLSFunction )
                    {
                    // InternalVampireLanguage.g:1056:5: (lv_right_7_0= ruleVLSFunction )
                    // InternalVampireLanguage.g:1057:6: lv_right_7_0= ruleVLSFunction
                    {

                    						newCompositeNode(grammarAccess.getVLSUnaryInfixAccess().getRightVLSFunctionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_7_0=ruleVLSFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVLSUnaryInfixRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_7_0,
                    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSFunction");
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


    // $ANTLR start "entryRuleVLSFunction"
    // InternalVampireLanguage.g:1079:1: entryRuleVLSFunction returns [EObject current=null] : iv_ruleVLSFunction= ruleVLSFunction EOF ;
    public final EObject entryRuleVLSFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFunction = null;


        try {
            // InternalVampireLanguage.g:1079:52: (iv_ruleVLSFunction= ruleVLSFunction EOF )
            // InternalVampireLanguage.g:1080:2: iv_ruleVLSFunction= ruleVLSFunction EOF
            {
             newCompositeNode(grammarAccess.getVLSFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSFunction=ruleVLSFunction();

            state._fsp--;

             current =iv_ruleVLSFunction; 
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
    // $ANTLR end "entryRuleVLSFunction"


    // $ANTLR start "ruleVLSFunction"
    // InternalVampireLanguage.g:1086:1: ruleVLSFunction returns [EObject current=null] : ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleVLSFunction() throws RecognitionException {
        EObject current = null;

        Token lv_constant_1_1=null;
        Token lv_constant_1_2=null;
        Token lv_constant_1_3=null;
        Token lv_constant_1_4=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_terms_3_0 = null;

        EObject lv_terms_5_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1092:2: ( ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )? ) )
            // InternalVampireLanguage.g:1093:2: ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )? )
            {
            // InternalVampireLanguage.g:1093:2: ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )? )
            // InternalVampireLanguage.g:1094:3: () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )?
            {
            // InternalVampireLanguage.g:1094:3: ()
            // InternalVampireLanguage.g:1095:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSFunctionAccess().getVLSFunctionAction_0(),
            					current);
            			

            }

            // InternalVampireLanguage.g:1101:3: ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID ) ) )
            // InternalVampireLanguage.g:1102:4: ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID ) )
            {
            // InternalVampireLanguage.g:1102:4: ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID ) )
            // InternalVampireLanguage.g:1103:5: (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID )
            {
            // InternalVampireLanguage.g:1103:5: (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt15=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt15=2;
                }
                break;
            case RULE_DOLLAR_ID:
                {
                alt15=3;
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalVampireLanguage.g:1104:6: lv_constant_1_1= RULE_LOWER_WORD_ID
                    {
                    lv_constant_1_1=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_22); 

                    						newLeafNode(lv_constant_1_1, grammarAccess.getVLSFunctionAccess().getConstantLOWER_WORD_IDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFunctionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"constant",
                    							lv_constant_1_1,
                    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.LOWER_WORD_ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1119:6: lv_constant_1_2= RULE_SINGLE_QUOTE
                    {
                    lv_constant_1_2=(Token)match(input,RULE_SINGLE_QUOTE,FOLLOW_22); 

                    						newLeafNode(lv_constant_1_2, grammarAccess.getVLSFunctionAccess().getConstantSINGLE_QUOTETerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFunctionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"constant",
                    							lv_constant_1_2,
                    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.SINGLE_QUOTE");
                    					

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1134:6: lv_constant_1_3= RULE_DOLLAR_ID
                    {
                    lv_constant_1_3=(Token)match(input,RULE_DOLLAR_ID,FOLLOW_22); 

                    						newLeafNode(lv_constant_1_3, grammarAccess.getVLSFunctionAccess().getConstantDOLLAR_IDTerminalRuleCall_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFunctionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"constant",
                    							lv_constant_1_3,
                    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.DOLLAR_ID");
                    					

                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1149:6: lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID
                    {
                    lv_constant_1_4=(Token)match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_22); 

                    						newLeafNode(lv_constant_1_4, grammarAccess.getVLSFunctionAccess().getConstantDOUBLE_DOLLAR_IDTerminalRuleCall_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFunctionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"constant",
                    							lv_constant_1_4,
                    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.DOUBLE_DOLLAR_ID");
                    					

                    }
                    break;

            }


            }


            }

            // InternalVampireLanguage.g:1166:3: (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVampireLanguage.g:1167:4: otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getVLSFunctionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalVampireLanguage.g:1171:4: ( (lv_terms_3_0= ruleVLSFofTerm ) )
                    // InternalVampireLanguage.g:1172:5: (lv_terms_3_0= ruleVLSFofTerm )
                    {
                    // InternalVampireLanguage.g:1172:5: (lv_terms_3_0= ruleVLSFofTerm )
                    // InternalVampireLanguage.g:1173:6: lv_terms_3_0= ruleVLSFofTerm
                    {

                    						newCompositeNode(grammarAccess.getVLSFunctionAccess().getTermsVLSFofTermParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_terms_3_0=ruleVLSFofTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVLSFunctionRule());
                    						}
                    						add(
                    							current,
                    							"terms",
                    							lv_terms_3_0,
                    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSFofTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVampireLanguage.g:1190:4: (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==28) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1191:5: otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FOLLOW_23); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getVLSFunctionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalVampireLanguage.g:1195:5: ( (lv_terms_5_0= ruleVLSFofTerm ) )
                    	    // InternalVampireLanguage.g:1196:6: (lv_terms_5_0= ruleVLSFofTerm )
                    	    {
                    	    // InternalVampireLanguage.g:1196:6: (lv_terms_5_0= ruleVLSFofTerm )
                    	    // InternalVampireLanguage.g:1197:7: lv_terms_5_0= ruleVLSFofTerm
                    	    {

                    	    							newCompositeNode(grammarAccess.getVLSFunctionAccess().getTermsVLSFofTermParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_terms_5_0=ruleVLSFofTerm();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVLSFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"terms",
                    	    								lv_terms_5_0,
                    	    								"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSFofTerm");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getVLSFunctionAccess().getRightParenthesisKeyword_2_3());
                    			

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
    // $ANTLR end "ruleVLSFunction"


    // $ANTLR start "entryRuleVLSFofTerm"
    // InternalVampireLanguage.g:1224:1: entryRuleVLSFofTerm returns [EObject current=null] : iv_ruleVLSFofTerm= ruleVLSFofTerm EOF ;
    public final EObject entryRuleVLSFofTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFofTerm = null;


        try {
            // InternalVampireLanguage.g:1224:51: (iv_ruleVLSFofTerm= ruleVLSFofTerm EOF )
            // InternalVampireLanguage.g:1225:2: iv_ruleVLSFofTerm= ruleVLSFofTerm EOF
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
    // InternalVampireLanguage.g:1231:1: ruleVLSFofTerm returns [EObject current=null] : (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionFof_1= ruleVLSFunctionFof | this_VLSDefinedTerm_2= ruleVLSDefinedTerm ) ;
    public final EObject ruleVLSFofTerm() throws RecognitionException {
        EObject current = null;

        EObject this_VLSVariable_0 = null;

        EObject this_VLSFunctionFof_1 = null;

        EObject this_VLSDefinedTerm_2 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1237:2: ( (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionFof_1= ruleVLSFunctionFof | this_VLSDefinedTerm_2= ruleVLSDefinedTerm ) )
            // InternalVampireLanguage.g:1238:2: (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionFof_1= ruleVLSFunctionFof | this_VLSDefinedTerm_2= ruleVLSDefinedTerm )
            {
            // InternalVampireLanguage.g:1238:2: (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionFof_1= ruleVLSFunctionFof | this_VLSDefinedTerm_2= ruleVLSDefinedTerm )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_UPPER_WORD_ID:
                {
                alt18=1;
                }
                break;
            case RULE_LOWER_WORD_ID:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt18=2;
                }
                break;
            case RULE_SIGNED_INT_ID:
            case RULE_DOUBLE_QUOTE:
            case RULE_SIGNED_REAL_ID:
            case RULE_SIGNED_RAT_ID:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalVampireLanguage.g:1239:3: this_VLSVariable_0= ruleVLSVariable
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
                    // InternalVampireLanguage.g:1248:3: this_VLSFunctionFof_1= ruleVLSFunctionFof
                    {

                    			newCompositeNode(grammarAccess.getVLSFofTermAccess().getVLSFunctionFofParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSFunctionFof_1=ruleVLSFunctionFof();

                    state._fsp--;


                    			current = this_VLSFunctionFof_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1257:3: this_VLSDefinedTerm_2= ruleVLSDefinedTerm
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


    // $ANTLR start "entryRuleVLSVariable"
    // InternalVampireLanguage.g:1269:1: entryRuleVLSVariable returns [EObject current=null] : iv_ruleVLSVariable= ruleVLSVariable EOF ;
    public final EObject entryRuleVLSVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSVariable = null;


        try {
            // InternalVampireLanguage.g:1269:52: (iv_ruleVLSVariable= ruleVLSVariable EOF )
            // InternalVampireLanguage.g:1270:2: iv_ruleVLSVariable= ruleVLSVariable EOF
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
    // InternalVampireLanguage.g:1276:1: ruleVLSVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_UPPER_WORD_ID ) ) ;
    public final EObject ruleVLSVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:1282:2: ( ( (lv_name_0_0= RULE_UPPER_WORD_ID ) ) )
            // InternalVampireLanguage.g:1283:2: ( (lv_name_0_0= RULE_UPPER_WORD_ID ) )
            {
            // InternalVampireLanguage.g:1283:2: ( (lv_name_0_0= RULE_UPPER_WORD_ID ) )
            // InternalVampireLanguage.g:1284:3: (lv_name_0_0= RULE_UPPER_WORD_ID )
            {
            // InternalVampireLanguage.g:1284:3: (lv_name_0_0= RULE_UPPER_WORD_ID )
            // InternalVampireLanguage.g:1285:4: lv_name_0_0= RULE_UPPER_WORD_ID
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
            					"hu.bme.mit.inf.dslreasoner.VampireLanguage.UPPER_WORD_ID");
            			

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


    // $ANTLR start "entryRuleVLSFunctionFof"
    // InternalVampireLanguage.g:1304:1: entryRuleVLSFunctionFof returns [EObject current=null] : iv_ruleVLSFunctionFof= ruleVLSFunctionFof EOF ;
    public final EObject entryRuleVLSFunctionFof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFunctionFof = null;


        try {
            // InternalVampireLanguage.g:1304:55: (iv_ruleVLSFunctionFof= ruleVLSFunctionFof EOF )
            // InternalVampireLanguage.g:1305:2: iv_ruleVLSFunctionFof= ruleVLSFunctionFof EOF
            {
             newCompositeNode(grammarAccess.getVLSFunctionFofRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSFunctionFof=ruleVLSFunctionFof();

            state._fsp--;

             current =iv_ruleVLSFunctionFof; 
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
    // $ANTLR end "entryRuleVLSFunctionFof"


    // $ANTLR start "ruleVLSFunctionFof"
    // InternalVampireLanguage.g:1311:1: ruleVLSFunctionFof returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleVLSFunctionFof() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_terms_2_0 = null;

        EObject lv_terms_4_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1317:2: ( ( ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? ) )
            // InternalVampireLanguage.g:1318:2: ( ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? )
            {
            // InternalVampireLanguage.g:1318:2: ( ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? )
            // InternalVampireLanguage.g:1319:3: ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )?
            {
            // InternalVampireLanguage.g:1319:3: ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID ) ) )
            // InternalVampireLanguage.g:1320:4: ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID ) )
            {
            // InternalVampireLanguage.g:1320:4: ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID ) )
            // InternalVampireLanguage.g:1321:5: (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID )
            {
            // InternalVampireLanguage.g:1321:5: (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt19=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt19=2;
                }
                break;
            case RULE_DOLLAR_ID:
                {
                alt19=3;
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalVampireLanguage.g:1322:6: lv_name_0_1= RULE_LOWER_WORD_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_22); 

                    						newLeafNode(lv_name_0_1, grammarAccess.getVLSFunctionFofAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFunctionFofRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_1,
                    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.LOWER_WORD_ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1337:6: lv_name_0_2= RULE_SINGLE_QUOTE
                    {
                    lv_name_0_2=(Token)match(input,RULE_SINGLE_QUOTE,FOLLOW_22); 

                    						newLeafNode(lv_name_0_2, grammarAccess.getVLSFunctionFofAccess().getNameSINGLE_QUOTETerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFunctionFofRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_2,
                    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.SINGLE_QUOTE");
                    					

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1352:6: lv_name_0_3= RULE_DOLLAR_ID
                    {
                    lv_name_0_3=(Token)match(input,RULE_DOLLAR_ID,FOLLOW_22); 

                    						newLeafNode(lv_name_0_3, grammarAccess.getVLSFunctionFofAccess().getNameDOLLAR_IDTerminalRuleCall_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFunctionFofRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_3,
                    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.DOLLAR_ID");
                    					

                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1367:6: lv_name_0_4= RULE_DOUBLE_DOLLAR_ID
                    {
                    lv_name_0_4=(Token)match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_22); 

                    						newLeafNode(lv_name_0_4, grammarAccess.getVLSFunctionFofAccess().getNameDOUBLE_DOLLAR_IDTerminalRuleCall_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFunctionFofRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_4,
                    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.DOUBLE_DOLLAR_ID");
                    					

                    }
                    break;

            }


            }


            }

            // InternalVampireLanguage.g:1384:3: (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVampireLanguage.g:1385:4: otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getVLSFunctionFofAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalVampireLanguage.g:1389:4: ( (lv_terms_2_0= ruleVLSFofTerm ) )
                    // InternalVampireLanguage.g:1390:5: (lv_terms_2_0= ruleVLSFofTerm )
                    {
                    // InternalVampireLanguage.g:1390:5: (lv_terms_2_0= ruleVLSFofTerm )
                    // InternalVampireLanguage.g:1391:6: lv_terms_2_0= ruleVLSFofTerm
                    {

                    						newCompositeNode(grammarAccess.getVLSFunctionFofAccess().getTermsVLSFofTermParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_terms_2_0=ruleVLSFofTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVLSFunctionFofRule());
                    						}
                    						add(
                    							current,
                    							"terms",
                    							lv_terms_2_0,
                    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSFofTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVampireLanguage.g:1408:4: (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==28) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1409:5: otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_23); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getVLSFunctionFofAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalVampireLanguage.g:1413:5: ( (lv_terms_4_0= ruleVLSFofTerm ) )
                    	    // InternalVampireLanguage.g:1414:6: (lv_terms_4_0= ruleVLSFofTerm )
                    	    {
                    	    // InternalVampireLanguage.g:1414:6: (lv_terms_4_0= ruleVLSFofTerm )
                    	    // InternalVampireLanguage.g:1415:7: lv_terms_4_0= ruleVLSFofTerm
                    	    {

                    	    							newCompositeNode(grammarAccess.getVLSFunctionFofAccess().getTermsVLSFofTermParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_terms_4_0=ruleVLSFofTerm();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVLSFunctionFofRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"terms",
                    	    								lv_terms_4_0,
                    	    								"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSFofTerm");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getVLSFunctionFofAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleVLSFunctionFof"


    // $ANTLR start "entryRuleVLSDefinedTerm"
    // InternalVampireLanguage.g:1442:1: entryRuleVLSDefinedTerm returns [EObject current=null] : iv_ruleVLSDefinedTerm= ruleVLSDefinedTerm EOF ;
    public final EObject entryRuleVLSDefinedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSDefinedTerm = null;


        try {
            // InternalVampireLanguage.g:1442:55: (iv_ruleVLSDefinedTerm= ruleVLSDefinedTerm EOF )
            // InternalVampireLanguage.g:1443:2: iv_ruleVLSDefinedTerm= ruleVLSDefinedTerm EOF
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
    // InternalVampireLanguage.g:1449:1: ruleVLSDefinedTerm returns [EObject current=null] : ( ( (lv_name_0_1= RULE_DOUBLE_QUOTE | lv_name_0_2= RULE_SIGNED_INT_ID | lv_name_0_3= RULE_SIGNED_REAL_ID | lv_name_0_4= RULE_SIGNED_RAT_ID ) ) ) ;
    public final EObject ruleVLSDefinedTerm() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:1455:2: ( ( ( (lv_name_0_1= RULE_DOUBLE_QUOTE | lv_name_0_2= RULE_SIGNED_INT_ID | lv_name_0_3= RULE_SIGNED_REAL_ID | lv_name_0_4= RULE_SIGNED_RAT_ID ) ) ) )
            // InternalVampireLanguage.g:1456:2: ( ( (lv_name_0_1= RULE_DOUBLE_QUOTE | lv_name_0_2= RULE_SIGNED_INT_ID | lv_name_0_3= RULE_SIGNED_REAL_ID | lv_name_0_4= RULE_SIGNED_RAT_ID ) ) )
            {
            // InternalVampireLanguage.g:1456:2: ( ( (lv_name_0_1= RULE_DOUBLE_QUOTE | lv_name_0_2= RULE_SIGNED_INT_ID | lv_name_0_3= RULE_SIGNED_REAL_ID | lv_name_0_4= RULE_SIGNED_RAT_ID ) ) )
            // InternalVampireLanguage.g:1457:3: ( (lv_name_0_1= RULE_DOUBLE_QUOTE | lv_name_0_2= RULE_SIGNED_INT_ID | lv_name_0_3= RULE_SIGNED_REAL_ID | lv_name_0_4= RULE_SIGNED_RAT_ID ) )
            {
            // InternalVampireLanguage.g:1457:3: ( (lv_name_0_1= RULE_DOUBLE_QUOTE | lv_name_0_2= RULE_SIGNED_INT_ID | lv_name_0_3= RULE_SIGNED_REAL_ID | lv_name_0_4= RULE_SIGNED_RAT_ID ) )
            // InternalVampireLanguage.g:1458:4: (lv_name_0_1= RULE_DOUBLE_QUOTE | lv_name_0_2= RULE_SIGNED_INT_ID | lv_name_0_3= RULE_SIGNED_REAL_ID | lv_name_0_4= RULE_SIGNED_RAT_ID )
            {
            // InternalVampireLanguage.g:1458:4: (lv_name_0_1= RULE_DOUBLE_QUOTE | lv_name_0_2= RULE_SIGNED_INT_ID | lv_name_0_3= RULE_SIGNED_REAL_ID | lv_name_0_4= RULE_SIGNED_RAT_ID )
            int alt22=4;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE_QUOTE:
                {
                alt22=1;
                }
                break;
            case RULE_SIGNED_INT_ID:
                {
                alt22=2;
                }
                break;
            case RULE_SIGNED_REAL_ID:
                {
                alt22=3;
                }
                break;
            case RULE_SIGNED_RAT_ID:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalVampireLanguage.g:1459:5: lv_name_0_1= RULE_DOUBLE_QUOTE
                    {
                    lv_name_0_1=(Token)match(input,RULE_DOUBLE_QUOTE,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getVLSDefinedTermAccess().getNameDOUBLE_QUOTETerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVLSDefinedTermRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_1,
                    						"hu.bme.mit.inf.dslreasoner.VampireLanguage.DOUBLE_QUOTE");
                    				

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1474:5: lv_name_0_2= RULE_SIGNED_INT_ID
                    {
                    lv_name_0_2=(Token)match(input,RULE_SIGNED_INT_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getVLSDefinedTermAccess().getNameSIGNED_INT_IDTerminalRuleCall_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVLSDefinedTermRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_2,
                    						"hu.bme.mit.inf.dslreasoner.VampireLanguage.SIGNED_INT_ID");
                    				

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1489:5: lv_name_0_3= RULE_SIGNED_REAL_ID
                    {
                    lv_name_0_3=(Token)match(input,RULE_SIGNED_REAL_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getVLSDefinedTermAccess().getNameSIGNED_REAL_IDTerminalRuleCall_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVLSDefinedTermRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_3,
                    						"hu.bme.mit.inf.dslreasoner.VampireLanguage.SIGNED_REAL_ID");
                    				

                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1504:5: lv_name_0_4= RULE_SIGNED_RAT_ID
                    {
                    lv_name_0_4=(Token)match(input,RULE_SIGNED_RAT_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_4, grammarAccess.getVLSDefinedTermAccess().getNameSIGNED_RAT_IDTerminalRuleCall_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVLSDefinedTermRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_4,
                    						"hu.bme.mit.inf.dslreasoner.VampireLanguage.SIGNED_RAT_ID");
                    				

                    }
                    break;

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
    // $ANTLR end "ruleVLSDefinedTerm"


    // $ANTLR start "ruleVLSRole"
    // InternalVampireLanguage.g:1524:1: ruleVLSRole returns [Enumerator current=null] : ( (enumLiteral_0= 'axiom' ) | (enumLiteral_1= 'conjecture' ) | (enumLiteral_2= 'hypothesis' ) | (enumLiteral_3= 'definition' ) | (enumLiteral_4= 'assumption' ) | (enumLiteral_5= 'lemma' ) | (enumLiteral_6= 'theorem' ) | (enumLiteral_7= 'corollary' ) | (enumLiteral_8= 'negated_conjecture' ) | (enumLiteral_9= 'plain' ) | (enumLiteral_10= 'type' ) | (enumLiteral_11= 'fi_domain' ) | (enumLiteral_12= 'fi_functors' ) | (enumLiteral_13= 'fi_predicates' ) | (enumLiteral_14= 'unknown' ) ) ;
    public final Enumerator ruleVLSRole() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:1530:2: ( ( (enumLiteral_0= 'axiom' ) | (enumLiteral_1= 'conjecture' ) | (enumLiteral_2= 'hypothesis' ) | (enumLiteral_3= 'definition' ) | (enumLiteral_4= 'assumption' ) | (enumLiteral_5= 'lemma' ) | (enumLiteral_6= 'theorem' ) | (enumLiteral_7= 'corollary' ) | (enumLiteral_8= 'negated_conjecture' ) | (enumLiteral_9= 'plain' ) | (enumLiteral_10= 'type' ) | (enumLiteral_11= 'fi_domain' ) | (enumLiteral_12= 'fi_functors' ) | (enumLiteral_13= 'fi_predicates' ) | (enumLiteral_14= 'unknown' ) ) )
            // InternalVampireLanguage.g:1531:2: ( (enumLiteral_0= 'axiom' ) | (enumLiteral_1= 'conjecture' ) | (enumLiteral_2= 'hypothesis' ) | (enumLiteral_3= 'definition' ) | (enumLiteral_4= 'assumption' ) | (enumLiteral_5= 'lemma' ) | (enumLiteral_6= 'theorem' ) | (enumLiteral_7= 'corollary' ) | (enumLiteral_8= 'negated_conjecture' ) | (enumLiteral_9= 'plain' ) | (enumLiteral_10= 'type' ) | (enumLiteral_11= 'fi_domain' ) | (enumLiteral_12= 'fi_functors' ) | (enumLiteral_13= 'fi_predicates' ) | (enumLiteral_14= 'unknown' ) )
            {
            // InternalVampireLanguage.g:1531:2: ( (enumLiteral_0= 'axiom' ) | (enumLiteral_1= 'conjecture' ) | (enumLiteral_2= 'hypothesis' ) | (enumLiteral_3= 'definition' ) | (enumLiteral_4= 'assumption' ) | (enumLiteral_5= 'lemma' ) | (enumLiteral_6= 'theorem' ) | (enumLiteral_7= 'corollary' ) | (enumLiteral_8= 'negated_conjecture' ) | (enumLiteral_9= 'plain' ) | (enumLiteral_10= 'type' ) | (enumLiteral_11= 'fi_domain' ) | (enumLiteral_12= 'fi_functors' ) | (enumLiteral_13= 'fi_predicates' ) | (enumLiteral_14= 'unknown' ) )
            int alt23=15;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt23=1;
                }
                break;
            case 49:
                {
                alt23=2;
                }
                break;
            case 50:
                {
                alt23=3;
                }
                break;
            case 51:
                {
                alt23=4;
                }
                break;
            case 52:
                {
                alt23=5;
                }
                break;
            case 53:
                {
                alt23=6;
                }
                break;
            case 54:
                {
                alt23=7;
                }
                break;
            case 55:
                {
                alt23=8;
                }
                break;
            case 56:
                {
                alt23=9;
                }
                break;
            case 57:
                {
                alt23=10;
                }
                break;
            case 58:
                {
                alt23=11;
                }
                break;
            case 59:
                {
                alt23=12;
                }
                break;
            case 60:
                {
                alt23=13;
                }
                break;
            case 61:
                {
                alt23=14;
                }
                break;
            case 62:
                {
                alt23=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalVampireLanguage.g:1532:3: (enumLiteral_0= 'axiom' )
                    {
                    // InternalVampireLanguage.g:1532:3: (enumLiteral_0= 'axiom' )
                    // InternalVampireLanguage.g:1533:4: enumLiteral_0= 'axiom'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getVLSRoleAccess().getAxiomEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVLSRoleAccess().getAxiomEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:1540:3: (enumLiteral_1= 'conjecture' )
                    {
                    // InternalVampireLanguage.g:1540:3: (enumLiteral_1= 'conjecture' )
                    // InternalVampireLanguage.g:1541:4: enumLiteral_1= 'conjecture'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getVLSRoleAccess().getConjectureEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVLSRoleAccess().getConjectureEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1548:3: (enumLiteral_2= 'hypothesis' )
                    {
                    // InternalVampireLanguage.g:1548:3: (enumLiteral_2= 'hypothesis' )
                    // InternalVampireLanguage.g:1549:4: enumLiteral_2= 'hypothesis'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getVLSRoleAccess().getHypothesisEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVLSRoleAccess().getHypothesisEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:1556:3: (enumLiteral_3= 'definition' )
                    {
                    // InternalVampireLanguage.g:1556:3: (enumLiteral_3= 'definition' )
                    // InternalVampireLanguage.g:1557:4: enumLiteral_3= 'definition'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getVLSRoleAccess().getDefinitionEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVLSRoleAccess().getDefinitionEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:1564:3: (enumLiteral_4= 'assumption' )
                    {
                    // InternalVampireLanguage.g:1564:3: (enumLiteral_4= 'assumption' )
                    // InternalVampireLanguage.g:1565:4: enumLiteral_4= 'assumption'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getVLSRoleAccess().getAssumptionEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVLSRoleAccess().getAssumptionEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalVampireLanguage.g:1572:3: (enumLiteral_5= 'lemma' )
                    {
                    // InternalVampireLanguage.g:1572:3: (enumLiteral_5= 'lemma' )
                    // InternalVampireLanguage.g:1573:4: enumLiteral_5= 'lemma'
                    {
                    enumLiteral_5=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getVLSRoleAccess().getLemmaEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVLSRoleAccess().getLemmaEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalVampireLanguage.g:1580:3: (enumLiteral_6= 'theorem' )
                    {
                    // InternalVampireLanguage.g:1580:3: (enumLiteral_6= 'theorem' )
                    // InternalVampireLanguage.g:1581:4: enumLiteral_6= 'theorem'
                    {
                    enumLiteral_6=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getVLSRoleAccess().getTheoremEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getVLSRoleAccess().getTheoremEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalVampireLanguage.g:1588:3: (enumLiteral_7= 'corollary' )
                    {
                    // InternalVampireLanguage.g:1588:3: (enumLiteral_7= 'corollary' )
                    // InternalVampireLanguage.g:1589:4: enumLiteral_7= 'corollary'
                    {
                    enumLiteral_7=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getVLSRoleAccess().getCorollaryEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getVLSRoleAccess().getCorollaryEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalVampireLanguage.g:1596:3: (enumLiteral_8= 'negated_conjecture' )
                    {
                    // InternalVampireLanguage.g:1596:3: (enumLiteral_8= 'negated_conjecture' )
                    // InternalVampireLanguage.g:1597:4: enumLiteral_8= 'negated_conjecture'
                    {
                    enumLiteral_8=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getVLSRoleAccess().getNegated_conjectureEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getVLSRoleAccess().getNegated_conjectureEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalVampireLanguage.g:1604:3: (enumLiteral_9= 'plain' )
                    {
                    // InternalVampireLanguage.g:1604:3: (enumLiteral_9= 'plain' )
                    // InternalVampireLanguage.g:1605:4: enumLiteral_9= 'plain'
                    {
                    enumLiteral_9=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getVLSRoleAccess().getPlainEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getVLSRoleAccess().getPlainEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalVampireLanguage.g:1612:3: (enumLiteral_10= 'type' )
                    {
                    // InternalVampireLanguage.g:1612:3: (enumLiteral_10= 'type' )
                    // InternalVampireLanguage.g:1613:4: enumLiteral_10= 'type'
                    {
                    enumLiteral_10=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getVLSRoleAccess().getTypeEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getVLSRoleAccess().getTypeEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalVampireLanguage.g:1620:3: (enumLiteral_11= 'fi_domain' )
                    {
                    // InternalVampireLanguage.g:1620:3: (enumLiteral_11= 'fi_domain' )
                    // InternalVampireLanguage.g:1621:4: enumLiteral_11= 'fi_domain'
                    {
                    enumLiteral_11=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getVLSRoleAccess().getFi_domainEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getVLSRoleAccess().getFi_domainEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalVampireLanguage.g:1628:3: (enumLiteral_12= 'fi_functors' )
                    {
                    // InternalVampireLanguage.g:1628:3: (enumLiteral_12= 'fi_functors' )
                    // InternalVampireLanguage.g:1629:4: enumLiteral_12= 'fi_functors'
                    {
                    enumLiteral_12=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getVLSRoleAccess().getFi_functorsEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getVLSRoleAccess().getFi_functorsEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalVampireLanguage.g:1636:3: (enumLiteral_13= 'fi_predicates' )
                    {
                    // InternalVampireLanguage.g:1636:3: (enumLiteral_13= 'fi_predicates' )
                    // InternalVampireLanguage.g:1637:4: enumLiteral_13= 'fi_predicates'
                    {
                    enumLiteral_13=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getVLSRoleAccess().getFi_predicatesEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getVLSRoleAccess().getFi_predicatesEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalVampireLanguage.g:1644:3: (enumLiteral_14= 'unknown' )
                    {
                    // InternalVampireLanguage.g:1644:3: (enumLiteral_14= 'unknown' )
                    // InternalVampireLanguage.g:1645:4: enumLiteral_14= 'unknown'
                    {
                    enumLiteral_14=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getVLSRoleAccess().getUnknownEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getVLSRoleAccess().getUnknownEnumLiteralDeclaration_14());
                    			

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
    // $ANTLR end "ruleVLSRole"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x7FFF000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00001880080003A0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000007F80000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000000003A0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000003FE0L});

}