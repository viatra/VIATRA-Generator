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
import hu.bme.mit.inf.dslreasoner.services.VampireLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVampireLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SINGLE_COMMENT", "RULE_LOWER_WORD_ID", "RULE_SINGLE_QUOTE", "RULE_DOLLAR_ID", "RULE_DOUBLE_DOLLAR_ID", "RULE_SIGNED_LITERAL", "RULE_UPPER_WORD_ID", "RULE_DOUBLE_QUOTE", "RULE_SIGNED_REAL_ID", "RULE_SIGNED_RAT_ID", "RULE_ALPHA_NUMERIC", "RULE_SIGN", "RULE_INT", "RULE_LITERAL", "RULE_UNSIGNED_REAL_FRAC_ID", "RULE_UNSIGNED_REAL_EXP_ID", "RULE_UNSIGNED_RAT_ID", "RULE_ANY_OTHER", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'fof'", "'('", "','", "')'", "'.'", "'axiom'", "'conjecture'", "'hypothesis'", "'definition'", "'assumption'", "'lemma'", "'theorem'", "'corollary'", "'negated_conjecture'", "'plain'", "'type'", "'fi_domain'", "'fi_functors'", "'fi_predicates'", "'unknown'", "'['", "']'", "'<=>'", "'=>'", "'<='", "'<~>'", "'~|'", "'~&'", "'&'", "'|'", "'!'", "':'", "'?'", "'~'", "'!='", "'='", "':='"
    };
    public static final int RULE_UNSIGNED_RAT_ID=20;
    public static final int T__50=50;
    public static final int RULE_SIGN=15;
    public static final int T__59=59;
    public static final int RULE_SIGNED_LITERAL=9;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_DOUBLE_QUOTE=11;
    public static final int T__52=52;
    public static final int RULE_LITERAL=17;
    public static final int T__53=53;
    public static final int RULE_UNSIGNED_REAL_FRAC_ID=18;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=22;
    public static final int RULE_SINGLE_QUOTE=6;
    public static final int RULE_SINGLE_COMMENT=4;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=16;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=24;
    public static final int RULE_SIGNED_RAT_ID=13;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_LOWER_WORD_ID=5;
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
    public static final int RULE_UPPER_WORD_ID=10;
    public static final int RULE_WS=26;
    public static final int RULE_DOLLAR_ID=7;
    public static final int RULE_ALPHA_NUMERIC=14;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_DOUBLE_DOLLAR_ID=8;
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
    // InternalVampireLanguage.g:71:1: ruleVampireModel returns [EObject current=null] : ( ( (lv_comments_0_0= ruleVLSComment ) ) | ( (lv_formulas_1_0= ruleVLSFofFormula ) ) )* ;
    public final EObject ruleVampireModel() throws RecognitionException {
        EObject current = null;

        EObject lv_comments_0_0 = null;

        EObject lv_formulas_1_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:77:2: ( ( ( (lv_comments_0_0= ruleVLSComment ) ) | ( (lv_formulas_1_0= ruleVLSFofFormula ) ) )* )
            // InternalVampireLanguage.g:78:2: ( ( (lv_comments_0_0= ruleVLSComment ) ) | ( (lv_formulas_1_0= ruleVLSFofFormula ) ) )*
            {
            // InternalVampireLanguage.g:78:2: ( ( (lv_comments_0_0= ruleVLSComment ) ) | ( (lv_formulas_1_0= ruleVLSFofFormula ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SINGLE_COMMENT) ) {
                    alt1=1;
                }
                else if ( (LA1_0==27) ) {
                    alt1=2;
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
            	    						"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSComment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVampireLanguage.g:99:3: ( (lv_formulas_1_0= ruleVLSFofFormula ) )
            	    {
            	    // InternalVampireLanguage.g:99:3: ( (lv_formulas_1_0= ruleVLSFofFormula ) )
            	    // InternalVampireLanguage.g:100:4: (lv_formulas_1_0= ruleVLSFofFormula )
            	    {
            	    // InternalVampireLanguage.g:100:4: (lv_formulas_1_0= ruleVLSFofFormula )
            	    // InternalVampireLanguage.g:101:5: lv_formulas_1_0= ruleVLSFofFormula
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
    // InternalVampireLanguage.g:122:1: entryRuleVLSComment returns [EObject current=null] : iv_ruleVLSComment= ruleVLSComment EOF ;
    public final EObject entryRuleVLSComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSComment = null;


        try {
            // InternalVampireLanguage.g:122:51: (iv_ruleVLSComment= ruleVLSComment EOF )
            // InternalVampireLanguage.g:123:2: iv_ruleVLSComment= ruleVLSComment EOF
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
    // InternalVampireLanguage.g:129:1: ruleVLSComment returns [EObject current=null] : ( (lv_comment_0_0= RULE_SINGLE_COMMENT ) ) ;
    public final EObject ruleVLSComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:135:2: ( ( (lv_comment_0_0= RULE_SINGLE_COMMENT ) ) )
            // InternalVampireLanguage.g:136:2: ( (lv_comment_0_0= RULE_SINGLE_COMMENT ) )
            {
            // InternalVampireLanguage.g:136:2: ( (lv_comment_0_0= RULE_SINGLE_COMMENT ) )
            // InternalVampireLanguage.g:137:3: (lv_comment_0_0= RULE_SINGLE_COMMENT )
            {
            // InternalVampireLanguage.g:137:3: (lv_comment_0_0= RULE_SINGLE_COMMENT )
            // InternalVampireLanguage.g:138:4: lv_comment_0_0= RULE_SINGLE_COMMENT
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


    // $ANTLR start "entryRuleVLSFunctionDeclaration"
    // InternalVampireLanguage.g:157:1: entryRuleVLSFunctionDeclaration returns [EObject current=null] : iv_ruleVLSFunctionDeclaration= ruleVLSFunctionDeclaration EOF ;
    public final EObject entryRuleVLSFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFunctionDeclaration = null;


        try {
            // InternalVampireLanguage.g:157:63: (iv_ruleVLSFunctionDeclaration= ruleVLSFunctionDeclaration EOF )
            // InternalVampireLanguage.g:158:2: iv_ruleVLSFunctionDeclaration= ruleVLSFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVLSFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSFunctionDeclaration=ruleVLSFunctionDeclaration();

            state._fsp--;

             current =iv_ruleVLSFunctionDeclaration; 
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
    // $ANTLR end "entryRuleVLSFunctionDeclaration"


    // $ANTLR start "ruleVLSFunctionDeclaration"
    // InternalVampireLanguage.g:164:1: ruleVLSFunctionDeclaration returns [EObject current=null] : ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) ;
    public final EObject ruleVLSFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:170:2: ( ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) )
            // InternalVampireLanguage.g:171:2: ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID ) ) )
            {
            // InternalVampireLanguage.g:171:2: ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID ) ) )
            // InternalVampireLanguage.g:172:3: ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID ) )
            {
            // InternalVampireLanguage.g:172:3: ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID ) )
            // InternalVampireLanguage.g:173:4: (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID )
            {
            // InternalVampireLanguage.g:173:4: (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_DOLLAR_ID | lv_name_0_4= RULE_DOUBLE_DOLLAR_ID )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt2=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt2=2;
                }
                break;
            case RULE_DOLLAR_ID:
                {
                alt2=3;
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
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
                    // InternalVampireLanguage.g:174:5: lv_name_0_1= RULE_LOWER_WORD_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getVLSFunctionDeclarationAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVLSFunctionDeclarationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_1,
                    						"hu.bme.mit.inf.dslreasoner.VampireLanguage.LOWER_WORD_ID");
                    				

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:189:5: lv_name_0_2= RULE_SINGLE_QUOTE
                    {
                    lv_name_0_2=(Token)match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getVLSFunctionDeclarationAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVLSFunctionDeclarationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_2,
                    						"hu.bme.mit.inf.dslreasoner.VampireLanguage.SINGLE_QUOTE");
                    				

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:204:5: lv_name_0_3= RULE_DOLLAR_ID
                    {
                    lv_name_0_3=(Token)match(input,RULE_DOLLAR_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getVLSFunctionDeclarationAccess().getNameDOLLAR_IDTerminalRuleCall_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVLSFunctionDeclarationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_3,
                    						"hu.bme.mit.inf.dslreasoner.VampireLanguage.DOLLAR_ID");
                    				

                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:219:5: lv_name_0_4= RULE_DOUBLE_DOLLAR_ID
                    {
                    lv_name_0_4=(Token)match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_4, grammarAccess.getVLSFunctionDeclarationAccess().getNameDOUBLE_DOLLAR_IDTerminalRuleCall_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVLSFunctionDeclarationRule());
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


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVLSFunctionDeclaration"


    // $ANTLR start "entryRuleVLSFofFormula"
    // InternalVampireLanguage.g:239:1: entryRuleVLSFofFormula returns [EObject current=null] : iv_ruleVLSFofFormula= ruleVLSFofFormula EOF ;
    public final EObject entryRuleVLSFofFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFofFormula = null;


        try {
            // InternalVampireLanguage.g:239:54: (iv_ruleVLSFofFormula= ruleVLSFofFormula EOF )
            // InternalVampireLanguage.g:240:2: iv_ruleVLSFofFormula= ruleVLSFofFormula EOF
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
    // InternalVampireLanguage.g:246:1: ruleVLSFofFormula returns [EObject current=null] : (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' ) ;
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
            // InternalVampireLanguage.g:252:2: ( (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' ) )
            // InternalVampireLanguage.g:253:2: (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' )
            {
            // InternalVampireLanguage.g:253:2: (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' )
            // InternalVampireLanguage.g:254:3: otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVLSFofFormulaAccess().getFofKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getVLSFofFormulaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalVampireLanguage.g:262:3: ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) )
            // InternalVampireLanguage.g:263:4: ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) )
            {
            // InternalVampireLanguage.g:263:4: ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) )
            // InternalVampireLanguage.g:264:5: (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE )
            {
            // InternalVampireLanguage.g:264:5: (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE )
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
                    // InternalVampireLanguage.g:265:6: lv_name_2_1= RULE_LOWER_WORD_ID
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
                    // InternalVampireLanguage.g:280:6: lv_name_2_2= RULE_SIGNED_LITERAL
                    {
                    lv_name_2_2=(Token)match(input,RULE_SIGNED_LITERAL,FOLLOW_6); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getVLSFofFormulaAccess().getNameSIGNED_LITERALTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFofFormulaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.SIGNED_LITERAL");
                    					

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:295:6: lv_name_2_3= RULE_SINGLE_QUOTE
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

            otherlv_3=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_3());
            		
            // InternalVampireLanguage.g:316:3: ( (lv_fofRole_4_0= ruleVLSRole ) )
            // InternalVampireLanguage.g:317:4: (lv_fofRole_4_0= ruleVLSRole )
            {
            // InternalVampireLanguage.g:317:4: (lv_fofRole_4_0= ruleVLSRole )
            // InternalVampireLanguage.g:318:5: lv_fofRole_4_0= ruleVLSRole
            {

            					newCompositeNode(grammarAccess.getVLSFofFormulaAccess().getFofRoleVLSRoleParserRuleCall_4_0());
            				
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

            otherlv_5=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_5());
            		
            // InternalVampireLanguage.g:339:3: ( (lv_fofFormula_6_0= ruleVLSTerm ) )
            // InternalVampireLanguage.g:340:4: (lv_fofFormula_6_0= ruleVLSTerm )
            {
            // InternalVampireLanguage.g:340:4: (lv_fofFormula_6_0= ruleVLSTerm )
            // InternalVampireLanguage.g:341:5: lv_fofFormula_6_0= ruleVLSTerm
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

            // InternalVampireLanguage.g:358:3: (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalVampireLanguage.g:359:4: otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_7_0());
                    			
                    // InternalVampireLanguage.g:363:4: ( (lv_annotations_8_0= ruleVLSAnnotation ) )
                    // InternalVampireLanguage.g:364:5: (lv_annotations_8_0= ruleVLSAnnotation )
                    {
                    // InternalVampireLanguage.g:364:5: (lv_annotations_8_0= ruleVLSAnnotation )
                    // InternalVampireLanguage.g:365:6: lv_annotations_8_0= ruleVLSAnnotation
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

            otherlv_9=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getVLSFofFormulaAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,31,FOLLOW_2); 

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


    // $ANTLR start "entryRuleVLSRole"
    // InternalVampireLanguage.g:395:1: entryRuleVLSRole returns [String current=null] : iv_ruleVLSRole= ruleVLSRole EOF ;
    public final String entryRuleVLSRole() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSRole = null;


        try {
            // InternalVampireLanguage.g:395:47: (iv_ruleVLSRole= ruleVLSRole EOF )
            // InternalVampireLanguage.g:396:2: iv_ruleVLSRole= ruleVLSRole EOF
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
    // InternalVampireLanguage.g:402:1: ruleVLSRole returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VLSAxiom_0= ruleVLSAxiom | this_VLSConjecture_1= ruleVLSConjecture | this_VLSHypothesis_2= ruleVLSHypothesis | this_VLSDefinition_3= ruleVLSDefinition | this_VLSAssumption_4= ruleVLSAssumption | this_VLSLemma_5= ruleVLSLemma | this_VLSTheorem_6= ruleVLSTheorem | this_VLSCorollary_7= ruleVLSCorollary | this_VLSNegated_Conjecture_8= ruleVLSNegated_Conjecture | this_VLSPlain_9= ruleVLSPlain | this_VLSType_10= ruleVLSType | this_VLSFi_Domain_11= ruleVLSFi_Domain | this_VLSFi_Functors_12= ruleVLSFi_Functors | this_VLSFi_Predicates_13= ruleVLSFi_Predicates | this_VLSUnknown_14= ruleVLSUnknown ) ;
    public final AntlrDatatypeRuleToken ruleVLSRole() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VLSAxiom_0 = null;

        AntlrDatatypeRuleToken this_VLSConjecture_1 = null;

        AntlrDatatypeRuleToken this_VLSHypothesis_2 = null;

        AntlrDatatypeRuleToken this_VLSDefinition_3 = null;

        AntlrDatatypeRuleToken this_VLSAssumption_4 = null;

        AntlrDatatypeRuleToken this_VLSLemma_5 = null;

        AntlrDatatypeRuleToken this_VLSTheorem_6 = null;

        AntlrDatatypeRuleToken this_VLSCorollary_7 = null;

        AntlrDatatypeRuleToken this_VLSNegated_Conjecture_8 = null;

        AntlrDatatypeRuleToken this_VLSPlain_9 = null;

        AntlrDatatypeRuleToken this_VLSType_10 = null;

        AntlrDatatypeRuleToken this_VLSFi_Domain_11 = null;

        AntlrDatatypeRuleToken this_VLSFi_Functors_12 = null;

        AntlrDatatypeRuleToken this_VLSFi_Predicates_13 = null;

        AntlrDatatypeRuleToken this_VLSUnknown_14 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:408:2: ( (this_VLSAxiom_0= ruleVLSAxiom | this_VLSConjecture_1= ruleVLSConjecture | this_VLSHypothesis_2= ruleVLSHypothesis | this_VLSDefinition_3= ruleVLSDefinition | this_VLSAssumption_4= ruleVLSAssumption | this_VLSLemma_5= ruleVLSLemma | this_VLSTheorem_6= ruleVLSTheorem | this_VLSCorollary_7= ruleVLSCorollary | this_VLSNegated_Conjecture_8= ruleVLSNegated_Conjecture | this_VLSPlain_9= ruleVLSPlain | this_VLSType_10= ruleVLSType | this_VLSFi_Domain_11= ruleVLSFi_Domain | this_VLSFi_Functors_12= ruleVLSFi_Functors | this_VLSFi_Predicates_13= ruleVLSFi_Predicates | this_VLSUnknown_14= ruleVLSUnknown ) )
            // InternalVampireLanguage.g:409:2: (this_VLSAxiom_0= ruleVLSAxiom | this_VLSConjecture_1= ruleVLSConjecture | this_VLSHypothesis_2= ruleVLSHypothesis | this_VLSDefinition_3= ruleVLSDefinition | this_VLSAssumption_4= ruleVLSAssumption | this_VLSLemma_5= ruleVLSLemma | this_VLSTheorem_6= ruleVLSTheorem | this_VLSCorollary_7= ruleVLSCorollary | this_VLSNegated_Conjecture_8= ruleVLSNegated_Conjecture | this_VLSPlain_9= ruleVLSPlain | this_VLSType_10= ruleVLSType | this_VLSFi_Domain_11= ruleVLSFi_Domain | this_VLSFi_Functors_12= ruleVLSFi_Functors | this_VLSFi_Predicates_13= ruleVLSFi_Predicates | this_VLSUnknown_14= ruleVLSUnknown )
            {
            // InternalVampireLanguage.g:409:2: (this_VLSAxiom_0= ruleVLSAxiom | this_VLSConjecture_1= ruleVLSConjecture | this_VLSHypothesis_2= ruleVLSHypothesis | this_VLSDefinition_3= ruleVLSDefinition | this_VLSAssumption_4= ruleVLSAssumption | this_VLSLemma_5= ruleVLSLemma | this_VLSTheorem_6= ruleVLSTheorem | this_VLSCorollary_7= ruleVLSCorollary | this_VLSNegated_Conjecture_8= ruleVLSNegated_Conjecture | this_VLSPlain_9= ruleVLSPlain | this_VLSType_10= ruleVLSType | this_VLSFi_Domain_11= ruleVLSFi_Domain | this_VLSFi_Functors_12= ruleVLSFi_Functors | this_VLSFi_Predicates_13= ruleVLSFi_Predicates | this_VLSUnknown_14= ruleVLSUnknown )
            int alt5=15;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt5=1;
                }
                break;
            case 33:
                {
                alt5=2;
                }
                break;
            case 34:
                {
                alt5=3;
                }
                break;
            case 35:
                {
                alt5=4;
                }
                break;
            case 36:
                {
                alt5=5;
                }
                break;
            case 37:
                {
                alt5=6;
                }
                break;
            case 38:
                {
                alt5=7;
                }
                break;
            case 39:
                {
                alt5=8;
                }
                break;
            case 40:
                {
                alt5=9;
                }
                break;
            case 41:
                {
                alt5=10;
                }
                break;
            case 42:
                {
                alt5=11;
                }
                break;
            case 43:
                {
                alt5=12;
                }
                break;
            case 44:
                {
                alt5=13;
                }
                break;
            case 45:
                {
                alt5=14;
                }
                break;
            case 46:
                {
                alt5=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalVampireLanguage.g:410:3: this_VLSAxiom_0= ruleVLSAxiom
                    {

                    			newCompositeNode(grammarAccess.getVLSRoleAccess().getVLSAxiomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSAxiom_0=ruleVLSAxiom();

                    state._fsp--;


                    			current.merge(this_VLSAxiom_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:421:3: this_VLSConjecture_1= ruleVLSConjecture
                    {

                    			newCompositeNode(grammarAccess.getVLSRoleAccess().getVLSConjectureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSConjecture_1=ruleVLSConjecture();

                    state._fsp--;


                    			current.merge(this_VLSConjecture_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:432:3: this_VLSHypothesis_2= ruleVLSHypothesis
                    {

                    			newCompositeNode(grammarAccess.getVLSRoleAccess().getVLSHypothesisParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSHypothesis_2=ruleVLSHypothesis();

                    state._fsp--;


                    			current.merge(this_VLSHypothesis_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:443:3: this_VLSDefinition_3= ruleVLSDefinition
                    {

                    			newCompositeNode(grammarAccess.getVLSRoleAccess().getVLSDefinitionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSDefinition_3=ruleVLSDefinition();

                    state._fsp--;


                    			current.merge(this_VLSDefinition_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:454:3: this_VLSAssumption_4= ruleVLSAssumption
                    {

                    			newCompositeNode(grammarAccess.getVLSRoleAccess().getVLSAssumptionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSAssumption_4=ruleVLSAssumption();

                    state._fsp--;


                    			current.merge(this_VLSAssumption_4);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalVampireLanguage.g:465:3: this_VLSLemma_5= ruleVLSLemma
                    {

                    			newCompositeNode(grammarAccess.getVLSRoleAccess().getVLSLemmaParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSLemma_5=ruleVLSLemma();

                    state._fsp--;


                    			current.merge(this_VLSLemma_5);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalVampireLanguage.g:476:3: this_VLSTheorem_6= ruleVLSTheorem
                    {

                    			newCompositeNode(grammarAccess.getVLSRoleAccess().getVLSTheoremParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSTheorem_6=ruleVLSTheorem();

                    state._fsp--;


                    			current.merge(this_VLSTheorem_6);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalVampireLanguage.g:487:3: this_VLSCorollary_7= ruleVLSCorollary
                    {

                    			newCompositeNode(grammarAccess.getVLSRoleAccess().getVLSCorollaryParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSCorollary_7=ruleVLSCorollary();

                    state._fsp--;


                    			current.merge(this_VLSCorollary_7);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalVampireLanguage.g:498:3: this_VLSNegated_Conjecture_8= ruleVLSNegated_Conjecture
                    {

                    			newCompositeNode(grammarAccess.getVLSRoleAccess().getVLSNegated_ConjectureParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSNegated_Conjecture_8=ruleVLSNegated_Conjecture();

                    state._fsp--;


                    			current.merge(this_VLSNegated_Conjecture_8);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalVampireLanguage.g:509:3: this_VLSPlain_9= ruleVLSPlain
                    {

                    			newCompositeNode(grammarAccess.getVLSRoleAccess().getVLSPlainParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSPlain_9=ruleVLSPlain();

                    state._fsp--;


                    			current.merge(this_VLSPlain_9);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalVampireLanguage.g:520:3: this_VLSType_10= ruleVLSType
                    {

                    			newCompositeNode(grammarAccess.getVLSRoleAccess().getVLSTypeParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSType_10=ruleVLSType();

                    state._fsp--;


                    			current.merge(this_VLSType_10);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalVampireLanguage.g:531:3: this_VLSFi_Domain_11= ruleVLSFi_Domain
                    {

                    			newCompositeNode(grammarAccess.getVLSRoleAccess().getVLSFi_DomainParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSFi_Domain_11=ruleVLSFi_Domain();

                    state._fsp--;


                    			current.merge(this_VLSFi_Domain_11);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalVampireLanguage.g:542:3: this_VLSFi_Functors_12= ruleVLSFi_Functors
                    {

                    			newCompositeNode(grammarAccess.getVLSRoleAccess().getVLSFi_FunctorsParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSFi_Functors_12=ruleVLSFi_Functors();

                    state._fsp--;


                    			current.merge(this_VLSFi_Functors_12);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalVampireLanguage.g:553:3: this_VLSFi_Predicates_13= ruleVLSFi_Predicates
                    {

                    			newCompositeNode(grammarAccess.getVLSRoleAccess().getVLSFi_PredicatesParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSFi_Predicates_13=ruleVLSFi_Predicates();

                    state._fsp--;


                    			current.merge(this_VLSFi_Predicates_13);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalVampireLanguage.g:564:3: this_VLSUnknown_14= ruleVLSUnknown
                    {

                    			newCompositeNode(grammarAccess.getVLSRoleAccess().getVLSUnknownParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_VLSUnknown_14=ruleVLSUnknown();

                    state._fsp--;


                    			current.merge(this_VLSUnknown_14);
                    		

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
    // $ANTLR end "ruleVLSRole"


    // $ANTLR start "entryRuleVLSAxiom"
    // InternalVampireLanguage.g:578:1: entryRuleVLSAxiom returns [String current=null] : iv_ruleVLSAxiom= ruleVLSAxiom EOF ;
    public final String entryRuleVLSAxiom() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSAxiom = null;


        try {
            // InternalVampireLanguage.g:578:48: (iv_ruleVLSAxiom= ruleVLSAxiom EOF )
            // InternalVampireLanguage.g:579:2: iv_ruleVLSAxiom= ruleVLSAxiom EOF
            {
             newCompositeNode(grammarAccess.getVLSAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSAxiom=ruleVLSAxiom();

            state._fsp--;

             current =iv_ruleVLSAxiom.getText(); 
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
    // $ANTLR end "entryRuleVLSAxiom"


    // $ANTLR start "ruleVLSAxiom"
    // InternalVampireLanguage.g:585:1: ruleVLSAxiom returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'axiom' ;
    public final AntlrDatatypeRuleToken ruleVLSAxiom() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:591:2: (kw= 'axiom' )
            // InternalVampireLanguage.g:592:2: kw= 'axiom'
            {
            kw=(Token)match(input,32,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVLSAxiomAccess().getAxiomKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVLSAxiom"


    // $ANTLR start "entryRuleVLSConjecture"
    // InternalVampireLanguage.g:600:1: entryRuleVLSConjecture returns [String current=null] : iv_ruleVLSConjecture= ruleVLSConjecture EOF ;
    public final String entryRuleVLSConjecture() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSConjecture = null;


        try {
            // InternalVampireLanguage.g:600:53: (iv_ruleVLSConjecture= ruleVLSConjecture EOF )
            // InternalVampireLanguage.g:601:2: iv_ruleVLSConjecture= ruleVLSConjecture EOF
            {
             newCompositeNode(grammarAccess.getVLSConjectureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSConjecture=ruleVLSConjecture();

            state._fsp--;

             current =iv_ruleVLSConjecture.getText(); 
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
    // $ANTLR end "entryRuleVLSConjecture"


    // $ANTLR start "ruleVLSConjecture"
    // InternalVampireLanguage.g:607:1: ruleVLSConjecture returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'conjecture' ;
    public final AntlrDatatypeRuleToken ruleVLSConjecture() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:613:2: (kw= 'conjecture' )
            // InternalVampireLanguage.g:614:2: kw= 'conjecture'
            {
            kw=(Token)match(input,33,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVLSConjectureAccess().getConjectureKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVLSConjecture"


    // $ANTLR start "entryRuleVLSHypothesis"
    // InternalVampireLanguage.g:622:1: entryRuleVLSHypothesis returns [String current=null] : iv_ruleVLSHypothesis= ruleVLSHypothesis EOF ;
    public final String entryRuleVLSHypothesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSHypothesis = null;


        try {
            // InternalVampireLanguage.g:622:53: (iv_ruleVLSHypothesis= ruleVLSHypothesis EOF )
            // InternalVampireLanguage.g:623:2: iv_ruleVLSHypothesis= ruleVLSHypothesis EOF
            {
             newCompositeNode(grammarAccess.getVLSHypothesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSHypothesis=ruleVLSHypothesis();

            state._fsp--;

             current =iv_ruleVLSHypothesis.getText(); 
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
    // $ANTLR end "entryRuleVLSHypothesis"


    // $ANTLR start "ruleVLSHypothesis"
    // InternalVampireLanguage.g:629:1: ruleVLSHypothesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'hypothesis' ;
    public final AntlrDatatypeRuleToken ruleVLSHypothesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:635:2: (kw= 'hypothesis' )
            // InternalVampireLanguage.g:636:2: kw= 'hypothesis'
            {
            kw=(Token)match(input,34,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVLSHypothesisAccess().getHypothesisKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVLSHypothesis"


    // $ANTLR start "entryRuleVLSDefinition"
    // InternalVampireLanguage.g:644:1: entryRuleVLSDefinition returns [String current=null] : iv_ruleVLSDefinition= ruleVLSDefinition EOF ;
    public final String entryRuleVLSDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSDefinition = null;


        try {
            // InternalVampireLanguage.g:644:53: (iv_ruleVLSDefinition= ruleVLSDefinition EOF )
            // InternalVampireLanguage.g:645:2: iv_ruleVLSDefinition= ruleVLSDefinition EOF
            {
             newCompositeNode(grammarAccess.getVLSDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSDefinition=ruleVLSDefinition();

            state._fsp--;

             current =iv_ruleVLSDefinition.getText(); 
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
    // $ANTLR end "entryRuleVLSDefinition"


    // $ANTLR start "ruleVLSDefinition"
    // InternalVampireLanguage.g:651:1: ruleVLSDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'definition' ;
    public final AntlrDatatypeRuleToken ruleVLSDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:657:2: (kw= 'definition' )
            // InternalVampireLanguage.g:658:2: kw= 'definition'
            {
            kw=(Token)match(input,35,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVLSDefinitionAccess().getDefinitionKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVLSDefinition"


    // $ANTLR start "entryRuleVLSAssumption"
    // InternalVampireLanguage.g:666:1: entryRuleVLSAssumption returns [String current=null] : iv_ruleVLSAssumption= ruleVLSAssumption EOF ;
    public final String entryRuleVLSAssumption() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSAssumption = null;


        try {
            // InternalVampireLanguage.g:666:53: (iv_ruleVLSAssumption= ruleVLSAssumption EOF )
            // InternalVampireLanguage.g:667:2: iv_ruleVLSAssumption= ruleVLSAssumption EOF
            {
             newCompositeNode(grammarAccess.getVLSAssumptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSAssumption=ruleVLSAssumption();

            state._fsp--;

             current =iv_ruleVLSAssumption.getText(); 
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
    // $ANTLR end "entryRuleVLSAssumption"


    // $ANTLR start "ruleVLSAssumption"
    // InternalVampireLanguage.g:673:1: ruleVLSAssumption returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'assumption' ;
    public final AntlrDatatypeRuleToken ruleVLSAssumption() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:679:2: (kw= 'assumption' )
            // InternalVampireLanguage.g:680:2: kw= 'assumption'
            {
            kw=(Token)match(input,36,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVLSAssumptionAccess().getAssumptionKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVLSAssumption"


    // $ANTLR start "entryRuleVLSLemma"
    // InternalVampireLanguage.g:688:1: entryRuleVLSLemma returns [String current=null] : iv_ruleVLSLemma= ruleVLSLemma EOF ;
    public final String entryRuleVLSLemma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSLemma = null;


        try {
            // InternalVampireLanguage.g:688:48: (iv_ruleVLSLemma= ruleVLSLemma EOF )
            // InternalVampireLanguage.g:689:2: iv_ruleVLSLemma= ruleVLSLemma EOF
            {
             newCompositeNode(grammarAccess.getVLSLemmaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSLemma=ruleVLSLemma();

            state._fsp--;

             current =iv_ruleVLSLemma.getText(); 
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
    // $ANTLR end "entryRuleVLSLemma"


    // $ANTLR start "ruleVLSLemma"
    // InternalVampireLanguage.g:695:1: ruleVLSLemma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'lemma' ;
    public final AntlrDatatypeRuleToken ruleVLSLemma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:701:2: (kw= 'lemma' )
            // InternalVampireLanguage.g:702:2: kw= 'lemma'
            {
            kw=(Token)match(input,37,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVLSLemmaAccess().getLemmaKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVLSLemma"


    // $ANTLR start "entryRuleVLSTheorem"
    // InternalVampireLanguage.g:710:1: entryRuleVLSTheorem returns [String current=null] : iv_ruleVLSTheorem= ruleVLSTheorem EOF ;
    public final String entryRuleVLSTheorem() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSTheorem = null;


        try {
            // InternalVampireLanguage.g:710:50: (iv_ruleVLSTheorem= ruleVLSTheorem EOF )
            // InternalVampireLanguage.g:711:2: iv_ruleVLSTheorem= ruleVLSTheorem EOF
            {
             newCompositeNode(grammarAccess.getVLSTheoremRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSTheorem=ruleVLSTheorem();

            state._fsp--;

             current =iv_ruleVLSTheorem.getText(); 
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
    // $ANTLR end "entryRuleVLSTheorem"


    // $ANTLR start "ruleVLSTheorem"
    // InternalVampireLanguage.g:717:1: ruleVLSTheorem returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'theorem' ;
    public final AntlrDatatypeRuleToken ruleVLSTheorem() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:723:2: (kw= 'theorem' )
            // InternalVampireLanguage.g:724:2: kw= 'theorem'
            {
            kw=(Token)match(input,38,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVLSTheoremAccess().getTheoremKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVLSTheorem"


    // $ANTLR start "entryRuleVLSCorollary"
    // InternalVampireLanguage.g:732:1: entryRuleVLSCorollary returns [String current=null] : iv_ruleVLSCorollary= ruleVLSCorollary EOF ;
    public final String entryRuleVLSCorollary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSCorollary = null;


        try {
            // InternalVampireLanguage.g:732:52: (iv_ruleVLSCorollary= ruleVLSCorollary EOF )
            // InternalVampireLanguage.g:733:2: iv_ruleVLSCorollary= ruleVLSCorollary EOF
            {
             newCompositeNode(grammarAccess.getVLSCorollaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSCorollary=ruleVLSCorollary();

            state._fsp--;

             current =iv_ruleVLSCorollary.getText(); 
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
    // $ANTLR end "entryRuleVLSCorollary"


    // $ANTLR start "ruleVLSCorollary"
    // InternalVampireLanguage.g:739:1: ruleVLSCorollary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'corollary' ;
    public final AntlrDatatypeRuleToken ruleVLSCorollary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:745:2: (kw= 'corollary' )
            // InternalVampireLanguage.g:746:2: kw= 'corollary'
            {
            kw=(Token)match(input,39,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVLSCorollaryAccess().getCorollaryKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVLSCorollary"


    // $ANTLR start "entryRuleVLSNegated_Conjecture"
    // InternalVampireLanguage.g:754:1: entryRuleVLSNegated_Conjecture returns [String current=null] : iv_ruleVLSNegated_Conjecture= ruleVLSNegated_Conjecture EOF ;
    public final String entryRuleVLSNegated_Conjecture() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSNegated_Conjecture = null;


        try {
            // InternalVampireLanguage.g:754:61: (iv_ruleVLSNegated_Conjecture= ruleVLSNegated_Conjecture EOF )
            // InternalVampireLanguage.g:755:2: iv_ruleVLSNegated_Conjecture= ruleVLSNegated_Conjecture EOF
            {
             newCompositeNode(grammarAccess.getVLSNegated_ConjectureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSNegated_Conjecture=ruleVLSNegated_Conjecture();

            state._fsp--;

             current =iv_ruleVLSNegated_Conjecture.getText(); 
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
    // $ANTLR end "entryRuleVLSNegated_Conjecture"


    // $ANTLR start "ruleVLSNegated_Conjecture"
    // InternalVampireLanguage.g:761:1: ruleVLSNegated_Conjecture returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'negated_conjecture' ;
    public final AntlrDatatypeRuleToken ruleVLSNegated_Conjecture() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:767:2: (kw= 'negated_conjecture' )
            // InternalVampireLanguage.g:768:2: kw= 'negated_conjecture'
            {
            kw=(Token)match(input,40,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVLSNegated_ConjectureAccess().getNegated_conjectureKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVLSNegated_Conjecture"


    // $ANTLR start "entryRuleVLSPlain"
    // InternalVampireLanguage.g:776:1: entryRuleVLSPlain returns [String current=null] : iv_ruleVLSPlain= ruleVLSPlain EOF ;
    public final String entryRuleVLSPlain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSPlain = null;


        try {
            // InternalVampireLanguage.g:776:48: (iv_ruleVLSPlain= ruleVLSPlain EOF )
            // InternalVampireLanguage.g:777:2: iv_ruleVLSPlain= ruleVLSPlain EOF
            {
             newCompositeNode(grammarAccess.getVLSPlainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSPlain=ruleVLSPlain();

            state._fsp--;

             current =iv_ruleVLSPlain.getText(); 
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
    // $ANTLR end "entryRuleVLSPlain"


    // $ANTLR start "ruleVLSPlain"
    // InternalVampireLanguage.g:783:1: ruleVLSPlain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'plain' ;
    public final AntlrDatatypeRuleToken ruleVLSPlain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:789:2: (kw= 'plain' )
            // InternalVampireLanguage.g:790:2: kw= 'plain'
            {
            kw=(Token)match(input,41,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVLSPlainAccess().getPlainKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVLSPlain"


    // $ANTLR start "entryRuleVLSType"
    // InternalVampireLanguage.g:798:1: entryRuleVLSType returns [String current=null] : iv_ruleVLSType= ruleVLSType EOF ;
    public final String entryRuleVLSType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSType = null;


        try {
            // InternalVampireLanguage.g:798:47: (iv_ruleVLSType= ruleVLSType EOF )
            // InternalVampireLanguage.g:799:2: iv_ruleVLSType= ruleVLSType EOF
            {
             newCompositeNode(grammarAccess.getVLSTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSType=ruleVLSType();

            state._fsp--;

             current =iv_ruleVLSType.getText(); 
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
    // $ANTLR end "entryRuleVLSType"


    // $ANTLR start "ruleVLSType"
    // InternalVampireLanguage.g:805:1: ruleVLSType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'type' ;
    public final AntlrDatatypeRuleToken ruleVLSType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:811:2: (kw= 'type' )
            // InternalVampireLanguage.g:812:2: kw= 'type'
            {
            kw=(Token)match(input,42,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVLSTypeAccess().getTypeKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVLSType"


    // $ANTLR start "entryRuleVLSFi_Domain"
    // InternalVampireLanguage.g:820:1: entryRuleVLSFi_Domain returns [String current=null] : iv_ruleVLSFi_Domain= ruleVLSFi_Domain EOF ;
    public final String entryRuleVLSFi_Domain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSFi_Domain = null;


        try {
            // InternalVampireLanguage.g:820:52: (iv_ruleVLSFi_Domain= ruleVLSFi_Domain EOF )
            // InternalVampireLanguage.g:821:2: iv_ruleVLSFi_Domain= ruleVLSFi_Domain EOF
            {
             newCompositeNode(grammarAccess.getVLSFi_DomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSFi_Domain=ruleVLSFi_Domain();

            state._fsp--;

             current =iv_ruleVLSFi_Domain.getText(); 
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
    // $ANTLR end "entryRuleVLSFi_Domain"


    // $ANTLR start "ruleVLSFi_Domain"
    // InternalVampireLanguage.g:827:1: ruleVLSFi_Domain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'fi_domain' ;
    public final AntlrDatatypeRuleToken ruleVLSFi_Domain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:833:2: (kw= 'fi_domain' )
            // InternalVampireLanguage.g:834:2: kw= 'fi_domain'
            {
            kw=(Token)match(input,43,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVLSFi_DomainAccess().getFi_domainKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVLSFi_Domain"


    // $ANTLR start "entryRuleVLSFi_Functors"
    // InternalVampireLanguage.g:842:1: entryRuleVLSFi_Functors returns [String current=null] : iv_ruleVLSFi_Functors= ruleVLSFi_Functors EOF ;
    public final String entryRuleVLSFi_Functors() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSFi_Functors = null;


        try {
            // InternalVampireLanguage.g:842:54: (iv_ruleVLSFi_Functors= ruleVLSFi_Functors EOF )
            // InternalVampireLanguage.g:843:2: iv_ruleVLSFi_Functors= ruleVLSFi_Functors EOF
            {
             newCompositeNode(grammarAccess.getVLSFi_FunctorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSFi_Functors=ruleVLSFi_Functors();

            state._fsp--;

             current =iv_ruleVLSFi_Functors.getText(); 
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
    // $ANTLR end "entryRuleVLSFi_Functors"


    // $ANTLR start "ruleVLSFi_Functors"
    // InternalVampireLanguage.g:849:1: ruleVLSFi_Functors returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'fi_functors' ;
    public final AntlrDatatypeRuleToken ruleVLSFi_Functors() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:855:2: (kw= 'fi_functors' )
            // InternalVampireLanguage.g:856:2: kw= 'fi_functors'
            {
            kw=(Token)match(input,44,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVLSFi_FunctorsAccess().getFi_functorsKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVLSFi_Functors"


    // $ANTLR start "entryRuleVLSFi_Predicates"
    // InternalVampireLanguage.g:864:1: entryRuleVLSFi_Predicates returns [String current=null] : iv_ruleVLSFi_Predicates= ruleVLSFi_Predicates EOF ;
    public final String entryRuleVLSFi_Predicates() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSFi_Predicates = null;


        try {
            // InternalVampireLanguage.g:864:56: (iv_ruleVLSFi_Predicates= ruleVLSFi_Predicates EOF )
            // InternalVampireLanguage.g:865:2: iv_ruleVLSFi_Predicates= ruleVLSFi_Predicates EOF
            {
             newCompositeNode(grammarAccess.getVLSFi_PredicatesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSFi_Predicates=ruleVLSFi_Predicates();

            state._fsp--;

             current =iv_ruleVLSFi_Predicates.getText(); 
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
    // $ANTLR end "entryRuleVLSFi_Predicates"


    // $ANTLR start "ruleVLSFi_Predicates"
    // InternalVampireLanguage.g:871:1: ruleVLSFi_Predicates returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'fi_predicates' ;
    public final AntlrDatatypeRuleToken ruleVLSFi_Predicates() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:877:2: (kw= 'fi_predicates' )
            // InternalVampireLanguage.g:878:2: kw= 'fi_predicates'
            {
            kw=(Token)match(input,45,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVLSFi_PredicatesAccess().getFi_predicatesKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVLSFi_Predicates"


    // $ANTLR start "entryRuleVLSUnknown"
    // InternalVampireLanguage.g:886:1: entryRuleVLSUnknown returns [String current=null] : iv_ruleVLSUnknown= ruleVLSUnknown EOF ;
    public final String entryRuleVLSUnknown() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSUnknown = null;


        try {
            // InternalVampireLanguage.g:886:50: (iv_ruleVLSUnknown= ruleVLSUnknown EOF )
            // InternalVampireLanguage.g:887:2: iv_ruleVLSUnknown= ruleVLSUnknown EOF
            {
             newCompositeNode(grammarAccess.getVLSUnknownRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSUnknown=ruleVLSUnknown();

            state._fsp--;

             current =iv_ruleVLSUnknown.getText(); 
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
    // $ANTLR end "entryRuleVLSUnknown"


    // $ANTLR start "ruleVLSUnknown"
    // InternalVampireLanguage.g:893:1: ruleVLSUnknown returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'unknown' ;
    public final AntlrDatatypeRuleToken ruleVLSUnknown() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:899:2: (kw= 'unknown' )
            // InternalVampireLanguage.g:900:2: kw= 'unknown'
            {
            kw=(Token)match(input,46,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVLSUnknownAccess().getUnknownKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVLSUnknown"


    // $ANTLR start "entryRuleVLSAnnotation"
    // InternalVampireLanguage.g:908:1: entryRuleVLSAnnotation returns [EObject current=null] : iv_ruleVLSAnnotation= ruleVLSAnnotation EOF ;
    public final EObject entryRuleVLSAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAnnotation = null;


        try {
            // InternalVampireLanguage.g:908:54: (iv_ruleVLSAnnotation= ruleVLSAnnotation EOF )
            // InternalVampireLanguage.g:909:2: iv_ruleVLSAnnotation= ruleVLSAnnotation EOF
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
    // InternalVampireLanguage.g:915:1: ruleVLSAnnotation returns [EObject current=null] : ( (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )? ) ;
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
            // InternalVampireLanguage.g:921:2: ( ( (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )? ) )
            // InternalVampireLanguage.g:922:2: ( (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )? )
            {
            // InternalVampireLanguage.g:922:2: ( (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )? )
            // InternalVampireLanguage.g:923:3: (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )?
            {
            // InternalVampireLanguage.g:923:3: (otherlv_0= '[' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==47) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVampireLanguage.g:924:4: otherlv_0= '['
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getVLSAnnotationAccess().getLeftSquareBracketKeyword_0());
                    			

                    }
                    break;

            }

            // InternalVampireLanguage.g:929:3: ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_LOWER_WORD_ID && LA8_0<=RULE_SINGLE_QUOTE)||(LA8_0>=32 && LA8_0<=46)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVampireLanguage.g:930:4: ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) )
                    {
                    // InternalVampireLanguage.g:930:4: ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) )
                    // InternalVampireLanguage.g:931:5: (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:931:5: (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole )
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
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
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
                            // InternalVampireLanguage.g:932:6: lv_name_1_1= RULE_LOWER_WORD_ID
                            {
                            lv_name_1_1=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_14); 

                            						newLeafNode(lv_name_1_1, grammarAccess.getVLSAnnotationAccess().getNameLOWER_WORD_IDTerminalRuleCall_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVLSAnnotationRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"name",
                            							lv_name_1_1,
                            							"hu.bme.mit.inf.dslreasoner.VampireLanguage.LOWER_WORD_ID");
                            					

                            }
                            break;
                        case 2 :
                            // InternalVampireLanguage.g:947:6: lv_name_1_2= RULE_SINGLE_QUOTE
                            {
                            lv_name_1_2=(Token)match(input,RULE_SINGLE_QUOTE,FOLLOW_14); 

                            						newLeafNode(lv_name_1_2, grammarAccess.getVLSAnnotationAccess().getNameSINGLE_QUOTETerminalRuleCall_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVLSAnnotationRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"name",
                            							lv_name_1_2,
                            							"hu.bme.mit.inf.dslreasoner.VampireLanguage.SINGLE_QUOTE");
                            					

                            }
                            break;
                        case 3 :
                            // InternalVampireLanguage.g:962:6: lv_name_1_3= ruleVLSRole
                            {

                            						newCompositeNode(grammarAccess.getVLSAnnotationAccess().getNameVLSRoleParserRuleCall_1_0_2());
                            					
                            pushFollow(FOLLOW_14);
                            lv_name_1_3=ruleVLSRole();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getVLSAnnotationRule());
                            						}
                            						set(
                            							current,
                            							"name",
                            							lv_name_1_3,
                            							"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSRole");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalVampireLanguage.g:980:3: (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVampireLanguage.g:981:4: otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getVLSAnnotationAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalVampireLanguage.g:985:4: ( (lv_followup_3_0= ruleVLSAnnotationTerms ) )
                    // InternalVampireLanguage.g:986:5: (lv_followup_3_0= ruleVLSAnnotationTerms )
                    {
                    // InternalVampireLanguage.g:986:5: (lv_followup_3_0= ruleVLSAnnotationTerms )
                    // InternalVampireLanguage.g:987:6: lv_followup_3_0= ruleVLSAnnotationTerms
                    {

                    						newCompositeNode(grammarAccess.getVLSAnnotationAccess().getFollowupVLSAnnotationTermsParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_followup_3_0=ruleVLSAnnotationTerms();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVLSAnnotationRule());
                    						}
                    						set(
                    							current,
                    							"followup",
                    							lv_followup_3_0,
                    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSAnnotationTerms");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,30,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getVLSAnnotationAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalVampireLanguage.g:1009:3: (otherlv_5= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==48) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVampireLanguage.g:1010:4: otherlv_5= ']'
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_2); 

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
    // InternalVampireLanguage.g:1019:1: entryRuleVLSAnnotationTerms returns [EObject current=null] : iv_ruleVLSAnnotationTerms= ruleVLSAnnotationTerms EOF ;
    public final EObject entryRuleVLSAnnotationTerms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAnnotationTerms = null;


        try {
            // InternalVampireLanguage.g:1019:59: (iv_ruleVLSAnnotationTerms= ruleVLSAnnotationTerms EOF )
            // InternalVampireLanguage.g:1020:2: iv_ruleVLSAnnotationTerms= ruleVLSAnnotationTerms EOF
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
    // InternalVampireLanguage.g:1026:1: ruleVLSAnnotationTerms returns [EObject current=null] : ( ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )* ) ;
    public final EObject ruleVLSAnnotationTerms() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_terms_0_0 = null;

        EObject lv_terms_2_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1032:2: ( ( ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )* ) )
            // InternalVampireLanguage.g:1033:2: ( ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )* )
            {
            // InternalVampireLanguage.g:1033:2: ( ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )* )
            // InternalVampireLanguage.g:1034:3: ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )*
            {
            // InternalVampireLanguage.g:1034:3: ( (lv_terms_0_0= ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:1035:4: (lv_terms_0_0= ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:1035:4: (lv_terms_0_0= ruleVLSAnnotation )
            // InternalVampireLanguage.g:1036:5: lv_terms_0_0= ruleVLSAnnotation
            {

            					newCompositeNode(grammarAccess.getVLSAnnotationTermsAccess().getTermsVLSAnnotationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_terms_0_0=ruleVLSAnnotation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSAnnotationTermsRule());
            					}
            					add(
            						current,
            						"terms",
            						lv_terms_0_0,
            						"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSAnnotation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVampireLanguage.g:1053:3: (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalVampireLanguage.g:1054:4: otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) )
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVLSAnnotationTermsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalVampireLanguage.g:1058:4: ( (lv_terms_2_0= ruleVLSAnnotation ) )
            	    // InternalVampireLanguage.g:1059:5: (lv_terms_2_0= ruleVLSAnnotation )
            	    {
            	    // InternalVampireLanguage.g:1059:5: (lv_terms_2_0= ruleVLSAnnotation )
            	    // InternalVampireLanguage.g:1060:6: lv_terms_2_0= ruleVLSAnnotation
            	    {

            	    						newCompositeNode(grammarAccess.getVLSAnnotationTermsAccess().getTermsVLSAnnotationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_terms_2_0=ruleVLSAnnotation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVLSAnnotationTermsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"terms",
            	    							lv_terms_2_0,
            	    							"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSAnnotation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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


    // $ANTLR start "entryRuleVLSTerm"
    // InternalVampireLanguage.g:1082:1: entryRuleVLSTerm returns [EObject current=null] : iv_ruleVLSTerm= ruleVLSTerm EOF ;
    public final EObject entryRuleVLSTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSTerm = null;


        try {
            // InternalVampireLanguage.g:1082:48: (iv_ruleVLSTerm= ruleVLSTerm EOF )
            // InternalVampireLanguage.g:1083:2: iv_ruleVLSTerm= ruleVLSTerm EOF
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
    // InternalVampireLanguage.g:1089:1: ruleVLSTerm returns [EObject current=null] : this_VLSBinary_0= ruleVLSBinary ;
    public final EObject ruleVLSTerm() throws RecognitionException {
        EObject current = null;

        EObject this_VLSBinary_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1095:2: (this_VLSBinary_0= ruleVLSBinary )
            // InternalVampireLanguage.g:1096:2: this_VLSBinary_0= ruleVLSBinary
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
    // InternalVampireLanguage.g:1107:1: entryRuleVLSBinary returns [EObject current=null] : iv_ruleVLSBinary= ruleVLSBinary EOF ;
    public final EObject entryRuleVLSBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSBinary = null;


        try {
            // InternalVampireLanguage.g:1107:50: (iv_ruleVLSBinary= ruleVLSBinary EOF )
            // InternalVampireLanguage.g:1108:2: iv_ruleVLSBinary= ruleVLSBinary EOF
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
    // InternalVampireLanguage.g:1114:1: ruleVLSBinary returns [EObject current=null] : (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? ) ;
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
            // InternalVampireLanguage.g:1120:2: ( (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? ) )
            // InternalVampireLanguage.g:1121:2: (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? )
            {
            // InternalVampireLanguage.g:1121:2: (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? )
            // InternalVampireLanguage.g:1122:3: this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getVLSBinaryAccess().getVLSUnitaryFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_VLSUnitaryFormula_0=ruleVLSUnitaryFormula();

            state._fsp--;


            			current = this_VLSUnitaryFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalVampireLanguage.g:1130:3: ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )?
            int alt15=4;
            switch ( input.LA(1) ) {
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                    {
                    alt15=1;
                    }
                    break;
                case 55:
                    {
                    alt15=2;
                    }
                    break;
                case 56:
                    {
                    alt15=3;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // InternalVampireLanguage.g:1131:4: ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) )
                    {
                    // InternalVampireLanguage.g:1131:4: ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) )
                    // InternalVampireLanguage.g:1132:5: ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) )
                    {
                    // InternalVampireLanguage.g:1132:5: ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) )
                    int alt12=6;
                    switch ( input.LA(1) ) {
                    case 49:
                        {
                        alt12=1;
                        }
                        break;
                    case 50:
                        {
                        alt12=2;
                        }
                        break;
                    case 51:
                        {
                        alt12=3;
                        }
                        break;
                    case 52:
                        {
                        alt12=4;
                        }
                        break;
                    case 53:
                        {
                        alt12=5;
                        }
                        break;
                    case 54:
                        {
                        alt12=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // InternalVampireLanguage.g:1133:6: ( () otherlv_2= '<=>' )
                            {
                            // InternalVampireLanguage.g:1133:6: ( () otherlv_2= '<=>' )
                            // InternalVampireLanguage.g:1134:7: () otherlv_2= '<=>'
                            {
                            // InternalVampireLanguage.g:1134:7: ()
                            // InternalVampireLanguage.g:1135:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSEquivalentLeftAction_1_0_0_0_0(),
                            									current);
                            							

                            }

                            otherlv_2=(Token)match(input,49,FOLLOW_8); 

                            							newLeafNode(otherlv_2, grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_0_1());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalVampireLanguage.g:1147:6: ( () otherlv_4= '=>' )
                            {
                            // InternalVampireLanguage.g:1147:6: ( () otherlv_4= '=>' )
                            // InternalVampireLanguage.g:1148:7: () otherlv_4= '=>'
                            {
                            // InternalVampireLanguage.g:1148:7: ()
                            // InternalVampireLanguage.g:1149:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSImpliesLeftAction_1_0_0_1_0(),
                            									current);
                            							

                            }

                            otherlv_4=(Token)match(input,50,FOLLOW_8); 

                            							newLeafNode(otherlv_4, grammarAccess.getVLSBinaryAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_1());
                            						

                            }


                            }
                            break;
                        case 3 :
                            // InternalVampireLanguage.g:1161:6: ( () otherlv_6= '<=' )
                            {
                            // InternalVampireLanguage.g:1161:6: ( () otherlv_6= '<=' )
                            // InternalVampireLanguage.g:1162:7: () otherlv_6= '<='
                            {
                            // InternalVampireLanguage.g:1162:7: ()
                            // InternalVampireLanguage.g:1163:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSRevImpliesLeftAction_1_0_0_2_0(),
                            									current);
                            							

                            }

                            otherlv_6=(Token)match(input,51,FOLLOW_8); 

                            							newLeafNode(otherlv_6, grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignKeyword_1_0_0_2_1());
                            						

                            }


                            }
                            break;
                        case 4 :
                            // InternalVampireLanguage.g:1175:6: ( () otherlv_8= '<~>' )
                            {
                            // InternalVampireLanguage.g:1175:6: ( () otherlv_8= '<~>' )
                            // InternalVampireLanguage.g:1176:7: () otherlv_8= '<~>'
                            {
                            // InternalVampireLanguage.g:1176:7: ()
                            // InternalVampireLanguage.g:1177:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSXnorLeftAction_1_0_0_3_0(),
                            									current);
                            							

                            }

                            otherlv_8=(Token)match(input,52,FOLLOW_8); 

                            							newLeafNode(otherlv_8, grammarAccess.getVLSBinaryAccess().getLessThanSignTildeGreaterThanSignKeyword_1_0_0_3_1());
                            						

                            }


                            }
                            break;
                        case 5 :
                            // InternalVampireLanguage.g:1189:6: ( () otherlv_10= '~|' )
                            {
                            // InternalVampireLanguage.g:1189:6: ( () otherlv_10= '~|' )
                            // InternalVampireLanguage.g:1190:7: () otherlv_10= '~|'
                            {
                            // InternalVampireLanguage.g:1190:7: ()
                            // InternalVampireLanguage.g:1191:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSNorLeftAction_1_0_0_4_0(),
                            									current);
                            							

                            }

                            otherlv_10=(Token)match(input,53,FOLLOW_8); 

                            							newLeafNode(otherlv_10, grammarAccess.getVLSBinaryAccess().getTildeVerticalLineKeyword_1_0_0_4_1());
                            						

                            }


                            }
                            break;
                        case 6 :
                            // InternalVampireLanguage.g:1203:6: ( () otherlv_12= '~&' )
                            {
                            // InternalVampireLanguage.g:1203:6: ( () otherlv_12= '~&' )
                            // InternalVampireLanguage.g:1204:7: () otherlv_12= '~&'
                            {
                            // InternalVampireLanguage.g:1204:7: ()
                            // InternalVampireLanguage.g:1205:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSNandLeftAction_1_0_0_5_0(),
                            									current);
                            							

                            }

                            otherlv_12=(Token)match(input,54,FOLLOW_8); 

                            							newLeafNode(otherlv_12, grammarAccess.getVLSBinaryAccess().getTildeAmpersandKeyword_1_0_0_5_1());
                            						

                            }


                            }
                            break;

                    }

                    // InternalVampireLanguage.g:1217:5: ( (lv_right_13_0= ruleVLSUnitaryFormula ) )
                    // InternalVampireLanguage.g:1218:6: (lv_right_13_0= ruleVLSUnitaryFormula )
                    {
                    // InternalVampireLanguage.g:1218:6: (lv_right_13_0= ruleVLSUnitaryFormula )
                    // InternalVampireLanguage.g:1219:7: lv_right_13_0= ruleVLSUnitaryFormula
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
                    // InternalVampireLanguage.g:1238:4: ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+
                    {
                    // InternalVampireLanguage.g:1238:4: ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==55) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1239:5: () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) )
                    	    {
                    	    // InternalVampireLanguage.g:1239:5: ()
                    	    // InternalVampireLanguage.g:1240:6: 
                    	    {

                    	    						current = forceCreateModelElementAndSet(
                    	    							grammarAccess.getVLSBinaryAccess().getVLSAndLeftAction_1_1_0(),
                    	    							current);
                    	    					

                    	    }

                    	    otherlv_15=(Token)match(input,55,FOLLOW_8); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getVLSBinaryAccess().getAmpersandKeyword_1_1_1());
                    	    				
                    	    // InternalVampireLanguage.g:1250:5: ( (lv_right_16_0= ruleVLSUnitaryFormula ) )
                    	    // InternalVampireLanguage.g:1251:6: (lv_right_16_0= ruleVLSUnitaryFormula )
                    	    {
                    	    // InternalVampireLanguage.g:1251:6: (lv_right_16_0= ruleVLSUnitaryFormula )
                    	    // InternalVampireLanguage.g:1252:7: lv_right_16_0= ruleVLSUnitaryFormula
                    	    {

                    	    							newCompositeNode(grammarAccess.getVLSBinaryAccess().getRightVLSUnitaryFormulaParserRuleCall_1_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1271:4: ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+
                    {
                    // InternalVampireLanguage.g:1271:4: ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==56) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1272:5: () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) )
                    	    {
                    	    // InternalVampireLanguage.g:1272:5: ()
                    	    // InternalVampireLanguage.g:1273:6: 
                    	    {

                    	    						current = forceCreateModelElementAndSet(
                    	    							grammarAccess.getVLSBinaryAccess().getVLSOrLeftAction_1_2_0(),
                    	    							current);
                    	    					

                    	    }

                    	    otherlv_18=(Token)match(input,56,FOLLOW_8); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getVLSBinaryAccess().getVerticalLineKeyword_1_2_1());
                    	    				
                    	    // InternalVampireLanguage.g:1283:5: ( (lv_right_19_0= ruleVLSUnitaryFormula ) )
                    	    // InternalVampireLanguage.g:1284:6: (lv_right_19_0= ruleVLSUnitaryFormula )
                    	    {
                    	    // InternalVampireLanguage.g:1284:6: (lv_right_19_0= ruleVLSUnitaryFormula )
                    	    // InternalVampireLanguage.g:1285:7: lv_right_19_0= ruleVLSUnitaryFormula
                    	    {

                    	    							newCompositeNode(grammarAccess.getVLSBinaryAccess().getRightVLSUnitaryFormulaParserRuleCall_1_2_2_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
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
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
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
    // InternalVampireLanguage.g:1308:1: entryRuleVLSUnitaryFormula returns [EObject current=null] : iv_ruleVLSUnitaryFormula= ruleVLSUnitaryFormula EOF ;
    public final EObject entryRuleVLSUnitaryFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUnitaryFormula = null;


        try {
            // InternalVampireLanguage.g:1308:58: (iv_ruleVLSUnitaryFormula= ruleVLSUnitaryFormula EOF )
            // InternalVampireLanguage.g:1309:2: iv_ruleVLSUnitaryFormula= ruleVLSUnitaryFormula EOF
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
    // InternalVampireLanguage.g:1315:1: ruleVLSUnitaryFormula returns [EObject current=null] : (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) ) ;
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
            // InternalVampireLanguage.g:1321:2: ( (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) ) )
            // InternalVampireLanguage.g:1322:2: (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) )
            {
            // InternalVampireLanguage.g:1322:2: (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt16=1;
                }
                break;
            case 59:
                {
                alt16=2;
                }
                break;
            case 60:
                {
                alt16=3;
                }
                break;
            case RULE_LOWER_WORD_ID:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt16=4;
                }
                break;
            case 28:
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
                    // InternalVampireLanguage.g:1323:3: this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier
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
                    // InternalVampireLanguage.g:1332:3: this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier
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
                    // InternalVampireLanguage.g:1341:3: this_VLSUnaryNegation_2= ruleVLSUnaryNegation
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
                    // InternalVampireLanguage.g:1350:3: this_VLSUnaryInfix_3= ruleVLSUnaryInfix
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
                    // InternalVampireLanguage.g:1359:3: (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' )
                    {
                    // InternalVampireLanguage.g:1359:3: (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' )
                    // InternalVampireLanguage.g:1360:4: otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getVLSUnitaryFormulaAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getVLSUnitaryFormulaAccess().getVLSTermParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_VLSTerm_5=ruleVLSTerm();

                    state._fsp--;


                    				current = this_VLSTerm_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,30,FOLLOW_2); 

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
    // InternalVampireLanguage.g:1381:1: entryRuleVLSUniversalQuantifier returns [EObject current=null] : iv_ruleVLSUniversalQuantifier= ruleVLSUniversalQuantifier EOF ;
    public final EObject entryRuleVLSUniversalQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUniversalQuantifier = null;


        try {
            // InternalVampireLanguage.g:1381:63: (iv_ruleVLSUniversalQuantifier= ruleVLSUniversalQuantifier EOF )
            // InternalVampireLanguage.g:1382:2: iv_ruleVLSUniversalQuantifier= ruleVLSUniversalQuantifier EOF
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
    // InternalVampireLanguage.g:1388:1: ruleVLSUniversalQuantifier returns [EObject current=null] : ( () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) ;
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
            // InternalVampireLanguage.g:1394:2: ( ( () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) )
            // InternalVampireLanguage.g:1395:2: ( () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            {
            // InternalVampireLanguage.g:1395:2: ( () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            // InternalVampireLanguage.g:1396:3: () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            {
            // InternalVampireLanguage.g:1396:3: ()
            // InternalVampireLanguage.g:1397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSUniversalQuantifierAccess().getVLSUniversalQuantifierAction_0(),
            					current);
            			

            }

            // InternalVampireLanguage.g:1403:3: (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' )
            // InternalVampireLanguage.g:1404:4: otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':'
            {
            otherlv_1=(Token)match(input,57,FOLLOW_21); 

            				newLeafNode(otherlv_1, grammarAccess.getVLSUniversalQuantifierAccess().getExclamationMarkKeyword_1_0());
            			
            otherlv_2=(Token)match(input,47,FOLLOW_22); 

            				newLeafNode(otherlv_2, grammarAccess.getVLSUniversalQuantifierAccess().getLeftSquareBracketKeyword_1_1());
            			
            // InternalVampireLanguage.g:1412:4: ( (lv_variables_3_0= ruleVLSVariable ) )
            // InternalVampireLanguage.g:1413:5: (lv_variables_3_0= ruleVLSVariable )
            {
            // InternalVampireLanguage.g:1413:5: (lv_variables_3_0= ruleVLSVariable )
            // InternalVampireLanguage.g:1414:6: lv_variables_3_0= ruleVLSVariable
            {

            						newCompositeNode(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_23);
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

            // InternalVampireLanguage.g:1431:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalVampireLanguage.g:1432:5: otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_22); 

            	    					newLeafNode(otherlv_4, grammarAccess.getVLSUniversalQuantifierAccess().getCommaKeyword_1_3_0());
            	    				
            	    // InternalVampireLanguage.g:1436:5: ( (lv_variables_5_0= ruleVLSVariable ) )
            	    // InternalVampireLanguage.g:1437:6: (lv_variables_5_0= ruleVLSVariable )
            	    {
            	    // InternalVampireLanguage.g:1437:6: (lv_variables_5_0= ruleVLSVariable )
            	    // InternalVampireLanguage.g:1438:7: lv_variables_5_0= ruleVLSVariable
            	    {

            	    							newCompositeNode(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_3_1_0());
            	    						
            	    pushFollow(FOLLOW_23);
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
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,48,FOLLOW_24); 

            				newLeafNode(otherlv_6, grammarAccess.getVLSUniversalQuantifierAccess().getRightSquareBracketKeyword_1_4());
            			
            otherlv_7=(Token)match(input,58,FOLLOW_8); 

            				newLeafNode(otherlv_7, grammarAccess.getVLSUniversalQuantifierAccess().getColonKeyword_1_5());
            			

            }

            // InternalVampireLanguage.g:1465:3: ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:1466:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:1466:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:1467:5: lv_operand_8_0= ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:1488:1: entryRuleVLSExistentialQuantifier returns [EObject current=null] : iv_ruleVLSExistentialQuantifier= ruleVLSExistentialQuantifier EOF ;
    public final EObject entryRuleVLSExistentialQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSExistentialQuantifier = null;


        try {
            // InternalVampireLanguage.g:1488:65: (iv_ruleVLSExistentialQuantifier= ruleVLSExistentialQuantifier EOF )
            // InternalVampireLanguage.g:1489:2: iv_ruleVLSExistentialQuantifier= ruleVLSExistentialQuantifier EOF
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
    // InternalVampireLanguage.g:1495:1: ruleVLSExistentialQuantifier returns [EObject current=null] : ( () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) ;
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
            // InternalVampireLanguage.g:1501:2: ( ( () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) )
            // InternalVampireLanguage.g:1502:2: ( () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            {
            // InternalVampireLanguage.g:1502:2: ( () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            // InternalVampireLanguage.g:1503:3: () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            {
            // InternalVampireLanguage.g:1503:3: ()
            // InternalVampireLanguage.g:1504:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSExistentialQuantifierAccess().getVLSExistentialQuantifierAction_0(),
            					current);
            			

            }

            // InternalVampireLanguage.g:1510:3: (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' )
            // InternalVampireLanguage.g:1511:4: otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':'
            {
            otherlv_1=(Token)match(input,59,FOLLOW_21); 

            				newLeafNode(otherlv_1, grammarAccess.getVLSExistentialQuantifierAccess().getQuestionMarkKeyword_1_0());
            			
            otherlv_2=(Token)match(input,47,FOLLOW_22); 

            				newLeafNode(otherlv_2, grammarAccess.getVLSExistentialQuantifierAccess().getLeftSquareBracketKeyword_1_1());
            			
            // InternalVampireLanguage.g:1519:4: ( (lv_variables_3_0= ruleVLSVariable ) )
            // InternalVampireLanguage.g:1520:5: (lv_variables_3_0= ruleVLSVariable )
            {
            // InternalVampireLanguage.g:1520:5: (lv_variables_3_0= ruleVLSVariable )
            // InternalVampireLanguage.g:1521:6: lv_variables_3_0= ruleVLSVariable
            {

            						newCompositeNode(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_23);
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

            // InternalVampireLanguage.g:1538:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalVampireLanguage.g:1539:5: otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_22); 

            	    					newLeafNode(otherlv_4, grammarAccess.getVLSExistentialQuantifierAccess().getCommaKeyword_1_3_0());
            	    				
            	    // InternalVampireLanguage.g:1543:5: ( (lv_variables_5_0= ruleVLSVariable ) )
            	    // InternalVampireLanguage.g:1544:6: (lv_variables_5_0= ruleVLSVariable )
            	    {
            	    // InternalVampireLanguage.g:1544:6: (lv_variables_5_0= ruleVLSVariable )
            	    // InternalVampireLanguage.g:1545:7: lv_variables_5_0= ruleVLSVariable
            	    {

            	    							newCompositeNode(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_3_1_0());
            	    						
            	    pushFollow(FOLLOW_23);
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
            	    break loop18;
                }
            } while (true);

            otherlv_6=(Token)match(input,48,FOLLOW_24); 

            				newLeafNode(otherlv_6, grammarAccess.getVLSExistentialQuantifierAccess().getRightSquareBracketKeyword_1_4());
            			
            otherlv_7=(Token)match(input,58,FOLLOW_8); 

            				newLeafNode(otherlv_7, grammarAccess.getVLSExistentialQuantifierAccess().getColonKeyword_1_5());
            			

            }

            // InternalVampireLanguage.g:1572:3: ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:1573:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:1573:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:1574:5: lv_operand_8_0= ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:1595:1: entryRuleVLSUnaryNegation returns [EObject current=null] : iv_ruleVLSUnaryNegation= ruleVLSUnaryNegation EOF ;
    public final EObject entryRuleVLSUnaryNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUnaryNegation = null;


        try {
            // InternalVampireLanguage.g:1595:57: (iv_ruleVLSUnaryNegation= ruleVLSUnaryNegation EOF )
            // InternalVampireLanguage.g:1596:2: iv_ruleVLSUnaryNegation= ruleVLSUnaryNegation EOF
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
    // InternalVampireLanguage.g:1602:1: ruleVLSUnaryNegation returns [EObject current=null] : ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) ) ;
    public final EObject ruleVLSUnaryNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1608:2: ( ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) ) )
            // InternalVampireLanguage.g:1609:2: ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) )
            {
            // InternalVampireLanguage.g:1609:2: ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) )
            // InternalVampireLanguage.g:1610:3: () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) )
            {
            // InternalVampireLanguage.g:1610:3: ()
            // InternalVampireLanguage.g:1611:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSUnaryNegationAccess().getVLSUnaryNegationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getVLSUnaryNegationAccess().getTildeKeyword_1());
            		
            // InternalVampireLanguage.g:1621:3: ( (lv_operand_2_0= ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:1622:4: (lv_operand_2_0= ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:1622:4: (lv_operand_2_0= ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:1623:5: lv_operand_2_0= ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:1644:1: entryRuleVLSUnaryInfix returns [EObject current=null] : iv_ruleVLSUnaryInfix= ruleVLSUnaryInfix EOF ;
    public final EObject entryRuleVLSUnaryInfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUnaryInfix = null;


        try {
            // InternalVampireLanguage.g:1644:54: (iv_ruleVLSUnaryInfix= ruleVLSUnaryInfix EOF )
            // InternalVampireLanguage.g:1645:2: iv_ruleVLSUnaryInfix= ruleVLSUnaryInfix EOF
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
    // InternalVampireLanguage.g:1651:1: ruleVLSUnaryInfix returns [EObject current=null] : (this_VLSFunction_0= ruleVLSFunction ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSFunction ) ) )? ) ;
    public final EObject ruleVLSUnaryInfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_VLSFunction_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1657:2: ( (this_VLSFunction_0= ruleVLSFunction ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSFunction ) ) )? ) )
            // InternalVampireLanguage.g:1658:2: (this_VLSFunction_0= ruleVLSFunction ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSFunction ) ) )? )
            {
            // InternalVampireLanguage.g:1658:2: (this_VLSFunction_0= ruleVLSFunction ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSFunction ) ) )? )
            // InternalVampireLanguage.g:1659:3: this_VLSFunction_0= ruleVLSFunction ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSFunction ) ) )?
            {

            			newCompositeNode(grammarAccess.getVLSUnaryInfixAccess().getVLSFunctionParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_VLSFunction_0=ruleVLSFunction();

            state._fsp--;


            			current = this_VLSFunction_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalVampireLanguage.g:1667:3: ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSFunction ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=61 && LA20_0<=63)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVampireLanguage.g:1668:4: ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSFunction ) )
                    {
                    // InternalVampireLanguage.g:1668:4: ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) )
                    int alt19=3;
                    switch ( input.LA(1) ) {
                    case 61:
                        {
                        alt19=1;
                        }
                        break;
                    case 62:
                        {
                        alt19=2;
                        }
                        break;
                    case 63:
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
                            // InternalVampireLanguage.g:1669:5: ( () otherlv_2= '!=' )
                            {
                            // InternalVampireLanguage.g:1669:5: ( () otherlv_2= '!=' )
                            // InternalVampireLanguage.g:1670:6: () otherlv_2= '!='
                            {
                            // InternalVampireLanguage.g:1670:6: ()
                            // InternalVampireLanguage.g:1671:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getVLSUnaryInfixAccess().getVLSInequalityLeftAction_1_0_0_0(),
                            								current);
                            						

                            }

                            otherlv_2=(Token)match(input,61,FOLLOW_26); 

                            						newLeafNode(otherlv_2, grammarAccess.getVLSUnaryInfixAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalVampireLanguage.g:1683:5: ( () otherlv_4= '=' )
                            {
                            // InternalVampireLanguage.g:1683:5: ( () otherlv_4= '=' )
                            // InternalVampireLanguage.g:1684:6: () otherlv_4= '='
                            {
                            // InternalVampireLanguage.g:1684:6: ()
                            // InternalVampireLanguage.g:1685:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getVLSUnaryInfixAccess().getVLSEqualityLeftAction_1_0_1_0(),
                            								current);
                            						

                            }

                            otherlv_4=(Token)match(input,62,FOLLOW_26); 

                            						newLeafNode(otherlv_4, grammarAccess.getVLSUnaryInfixAccess().getEqualsSignKeyword_1_0_1_1());
                            					

                            }


                            }
                            break;
                        case 3 :
                            // InternalVampireLanguage.g:1697:5: ( () otherlv_6= ':=' )
                            {
                            // InternalVampireLanguage.g:1697:5: ( () otherlv_6= ':=' )
                            // InternalVampireLanguage.g:1698:6: () otherlv_6= ':='
                            {
                            // InternalVampireLanguage.g:1698:6: ()
                            // InternalVampireLanguage.g:1699:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getVLSUnaryInfixAccess().getVLSAssignmentLeftAction_1_0_2_0(),
                            								current);
                            						

                            }

                            otherlv_6=(Token)match(input,63,FOLLOW_26); 

                            						newLeafNode(otherlv_6, grammarAccess.getVLSUnaryInfixAccess().getColonEqualsSignKeyword_1_0_2_1());
                            					

                            }


                            }
                            break;

                    }

                    // InternalVampireLanguage.g:1711:4: ( (lv_right_7_0= ruleVLSFunction ) )
                    // InternalVampireLanguage.g:1712:5: (lv_right_7_0= ruleVLSFunction )
                    {
                    // InternalVampireLanguage.g:1712:5: (lv_right_7_0= ruleVLSFunction )
                    // InternalVampireLanguage.g:1713:6: lv_right_7_0= ruleVLSFunction
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
    // InternalVampireLanguage.g:1735:1: entryRuleVLSFunction returns [EObject current=null] : iv_ruleVLSFunction= ruleVLSFunction EOF ;
    public final EObject entryRuleVLSFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFunction = null;


        try {
            // InternalVampireLanguage.g:1735:52: (iv_ruleVLSFunction= ruleVLSFunction EOF )
            // InternalVampireLanguage.g:1736:2: iv_ruleVLSFunction= ruleVLSFunction EOF
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
    // InternalVampireLanguage.g:1742:1: ruleVLSFunction returns [EObject current=null] : ( () ( (lv_constant_1_0= ruleVLSFunctionDeclaration ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleVLSFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_constant_1_0 = null;

        EObject lv_terms_3_0 = null;

        EObject lv_terms_5_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1748:2: ( ( () ( (lv_constant_1_0= ruleVLSFunctionDeclaration ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )? ) )
            // InternalVampireLanguage.g:1749:2: ( () ( (lv_constant_1_0= ruleVLSFunctionDeclaration ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )? )
            {
            // InternalVampireLanguage.g:1749:2: ( () ( (lv_constant_1_0= ruleVLSFunctionDeclaration ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )? )
            // InternalVampireLanguage.g:1750:3: () ( (lv_constant_1_0= ruleVLSFunctionDeclaration ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )?
            {
            // InternalVampireLanguage.g:1750:3: ()
            // InternalVampireLanguage.g:1751:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSFunctionAccess().getVLSFunctionAction_0(),
            					current);
            			

            }

            // InternalVampireLanguage.g:1757:3: ( (lv_constant_1_0= ruleVLSFunctionDeclaration ) )
            // InternalVampireLanguage.g:1758:4: (lv_constant_1_0= ruleVLSFunctionDeclaration )
            {
            // InternalVampireLanguage.g:1758:4: (lv_constant_1_0= ruleVLSFunctionDeclaration )
            // InternalVampireLanguage.g:1759:5: lv_constant_1_0= ruleVLSFunctionDeclaration
            {

            					newCompositeNode(grammarAccess.getVLSFunctionAccess().getConstantVLSFunctionDeclarationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_constant_1_0=ruleVLSFunctionDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSFunctionRule());
            					}
            					set(
            						current,
            						"constant",
            						lv_constant_1_0,
            						"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSFunctionDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVampireLanguage.g:1776:3: (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVampireLanguage.g:1777:4: otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getVLSFunctionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalVampireLanguage.g:1781:4: ( (lv_terms_3_0= ruleVLSFofTerm ) )
                    // InternalVampireLanguage.g:1782:5: (lv_terms_3_0= ruleVLSFofTerm )
                    {
                    // InternalVampireLanguage.g:1782:5: (lv_terms_3_0= ruleVLSFofTerm )
                    // InternalVampireLanguage.g:1783:6: lv_terms_3_0= ruleVLSFofTerm
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

                    // InternalVampireLanguage.g:1800:4: (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==29) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1801:5: otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FOLLOW_28); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getVLSFunctionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalVampireLanguage.g:1805:5: ( (lv_terms_5_0= ruleVLSFofTerm ) )
                    	    // InternalVampireLanguage.g:1806:6: (lv_terms_5_0= ruleVLSFofTerm )
                    	    {
                    	    // InternalVampireLanguage.g:1806:6: (lv_terms_5_0= ruleVLSFofTerm )
                    	    // InternalVampireLanguage.g:1807:7: lv_terms_5_0= ruleVLSFofTerm
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
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,30,FOLLOW_2); 

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
    // InternalVampireLanguage.g:1834:1: entryRuleVLSFofTerm returns [EObject current=null] : iv_ruleVLSFofTerm= ruleVLSFofTerm EOF ;
    public final EObject entryRuleVLSFofTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFofTerm = null;


        try {
            // InternalVampireLanguage.g:1834:51: (iv_ruleVLSFofTerm= ruleVLSFofTerm EOF )
            // InternalVampireLanguage.g:1835:2: iv_ruleVLSFofTerm= ruleVLSFofTerm EOF
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
    // InternalVampireLanguage.g:1841:1: ruleVLSFofTerm returns [EObject current=null] : (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionFof_1= ruleVLSFunctionFof | this_VLSDefinedTerm_2= ruleVLSDefinedTerm ) ;
    public final EObject ruleVLSFofTerm() throws RecognitionException {
        EObject current = null;

        EObject this_VLSVariable_0 = null;

        EObject this_VLSFunctionFof_1 = null;

        EObject this_VLSDefinedTerm_2 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1847:2: ( (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionFof_1= ruleVLSFunctionFof | this_VLSDefinedTerm_2= ruleVLSDefinedTerm ) )
            // InternalVampireLanguage.g:1848:2: (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionFof_1= ruleVLSFunctionFof | this_VLSDefinedTerm_2= ruleVLSDefinedTerm )
            {
            // InternalVampireLanguage.g:1848:2: (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionFof_1= ruleVLSFunctionFof | this_VLSDefinedTerm_2= ruleVLSDefinedTerm )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_UPPER_WORD_ID:
                {
                alt23=1;
                }
                break;
            case RULE_LOWER_WORD_ID:
            case RULE_SINGLE_QUOTE:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt23=2;
                }
                break;
            case RULE_SIGNED_LITERAL:
            case RULE_DOUBLE_QUOTE:
            case RULE_SIGNED_REAL_ID:
            case RULE_SIGNED_RAT_ID:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalVampireLanguage.g:1849:3: this_VLSVariable_0= ruleVLSVariable
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
                    // InternalVampireLanguage.g:1858:3: this_VLSFunctionFof_1= ruleVLSFunctionFof
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
                    // InternalVampireLanguage.g:1867:3: this_VLSDefinedTerm_2= ruleVLSDefinedTerm
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
    // InternalVampireLanguage.g:1879:1: entryRuleVLSVariable returns [EObject current=null] : iv_ruleVLSVariable= ruleVLSVariable EOF ;
    public final EObject entryRuleVLSVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSVariable = null;


        try {
            // InternalVampireLanguage.g:1879:52: (iv_ruleVLSVariable= ruleVLSVariable EOF )
            // InternalVampireLanguage.g:1880:2: iv_ruleVLSVariable= ruleVLSVariable EOF
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
    // InternalVampireLanguage.g:1886:1: ruleVLSVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_UPPER_WORD_ID ) ) ;
    public final EObject ruleVLSVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:1892:2: ( ( (lv_name_0_0= RULE_UPPER_WORD_ID ) ) )
            // InternalVampireLanguage.g:1893:2: ( (lv_name_0_0= RULE_UPPER_WORD_ID ) )
            {
            // InternalVampireLanguage.g:1893:2: ( (lv_name_0_0= RULE_UPPER_WORD_ID ) )
            // InternalVampireLanguage.g:1894:3: (lv_name_0_0= RULE_UPPER_WORD_ID )
            {
            // InternalVampireLanguage.g:1894:3: (lv_name_0_0= RULE_UPPER_WORD_ID )
            // InternalVampireLanguage.g:1895:4: lv_name_0_0= RULE_UPPER_WORD_ID
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
    // InternalVampireLanguage.g:1914:1: entryRuleVLSFunctionFof returns [EObject current=null] : iv_ruleVLSFunctionFof= ruleVLSFunctionFof EOF ;
    public final EObject entryRuleVLSFunctionFof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFunctionFof = null;


        try {
            // InternalVampireLanguage.g:1914:55: (iv_ruleVLSFunctionFof= ruleVLSFunctionFof EOF )
            // InternalVampireLanguage.g:1915:2: iv_ruleVLSFunctionFof= ruleVLSFunctionFof EOF
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
    // InternalVampireLanguage.g:1921:1: ruleVLSFunctionFof returns [EObject current=null] : ( ( (lv_functor_0_0= ruleVLSFunctionDeclaration ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleVLSFunctionFof() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_functor_0_0 = null;

        EObject lv_terms_2_0 = null;

        EObject lv_terms_4_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1927:2: ( ( ( (lv_functor_0_0= ruleVLSFunctionDeclaration ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? ) )
            // InternalVampireLanguage.g:1928:2: ( ( (lv_functor_0_0= ruleVLSFunctionDeclaration ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? )
            {
            // InternalVampireLanguage.g:1928:2: ( ( (lv_functor_0_0= ruleVLSFunctionDeclaration ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? )
            // InternalVampireLanguage.g:1929:3: ( (lv_functor_0_0= ruleVLSFunctionDeclaration ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )?
            {
            // InternalVampireLanguage.g:1929:3: ( (lv_functor_0_0= ruleVLSFunctionDeclaration ) )
            // InternalVampireLanguage.g:1930:4: (lv_functor_0_0= ruleVLSFunctionDeclaration )
            {
            // InternalVampireLanguage.g:1930:4: (lv_functor_0_0= ruleVLSFunctionDeclaration )
            // InternalVampireLanguage.g:1931:5: lv_functor_0_0= ruleVLSFunctionDeclaration
            {

            					newCompositeNode(grammarAccess.getVLSFunctionFofAccess().getFunctorVLSFunctionDeclarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_functor_0_0=ruleVLSFunctionDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSFunctionFofRule());
            					}
            					set(
            						current,
            						"functor",
            						lv_functor_0_0,
            						"hu.bme.mit.inf.dslreasoner.VampireLanguage.VLSFunctionDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVampireLanguage.g:1948:3: (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVampireLanguage.g:1949:4: otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getVLSFunctionFofAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalVampireLanguage.g:1953:4: ( (lv_terms_2_0= ruleVLSFofTerm ) )
                    // InternalVampireLanguage.g:1954:5: (lv_terms_2_0= ruleVLSFofTerm )
                    {
                    // InternalVampireLanguage.g:1954:5: (lv_terms_2_0= ruleVLSFofTerm )
                    // InternalVampireLanguage.g:1955:6: lv_terms_2_0= ruleVLSFofTerm
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

                    // InternalVampireLanguage.g:1972:4: (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==29) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1973:5: otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FOLLOW_28); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getVLSFunctionFofAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalVampireLanguage.g:1977:5: ( (lv_terms_4_0= ruleVLSFofTerm ) )
                    	    // InternalVampireLanguage.g:1978:6: (lv_terms_4_0= ruleVLSFofTerm )
                    	    {
                    	    // InternalVampireLanguage.g:1978:6: (lv_terms_4_0= ruleVLSFofTerm )
                    	    // InternalVampireLanguage.g:1979:7: lv_terms_4_0= ruleVLSFofTerm
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
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,30,FOLLOW_2); 

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
    // InternalVampireLanguage.g:2006:1: entryRuleVLSDefinedTerm returns [EObject current=null] : iv_ruleVLSDefinedTerm= ruleVLSDefinedTerm EOF ;
    public final EObject entryRuleVLSDefinedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSDefinedTerm = null;


        try {
            // InternalVampireLanguage.g:2006:55: (iv_ruleVLSDefinedTerm= ruleVLSDefinedTerm EOF )
            // InternalVampireLanguage.g:2007:2: iv_ruleVLSDefinedTerm= ruleVLSDefinedTerm EOF
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
    // InternalVampireLanguage.g:2013:1: ruleVLSDefinedTerm returns [EObject current=null] : ( ( (lv_name_0_1= RULE_DOUBLE_QUOTE | lv_name_0_2= RULE_SIGNED_LITERAL | lv_name_0_3= RULE_SIGNED_REAL_ID | lv_name_0_4= RULE_SIGNED_RAT_ID ) ) ) ;
    public final EObject ruleVLSDefinedTerm() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:2019:2: ( ( ( (lv_name_0_1= RULE_DOUBLE_QUOTE | lv_name_0_2= RULE_SIGNED_LITERAL | lv_name_0_3= RULE_SIGNED_REAL_ID | lv_name_0_4= RULE_SIGNED_RAT_ID ) ) ) )
            // InternalVampireLanguage.g:2020:2: ( ( (lv_name_0_1= RULE_DOUBLE_QUOTE | lv_name_0_2= RULE_SIGNED_LITERAL | lv_name_0_3= RULE_SIGNED_REAL_ID | lv_name_0_4= RULE_SIGNED_RAT_ID ) ) )
            {
            // InternalVampireLanguage.g:2020:2: ( ( (lv_name_0_1= RULE_DOUBLE_QUOTE | lv_name_0_2= RULE_SIGNED_LITERAL | lv_name_0_3= RULE_SIGNED_REAL_ID | lv_name_0_4= RULE_SIGNED_RAT_ID ) ) )
            // InternalVampireLanguage.g:2021:3: ( (lv_name_0_1= RULE_DOUBLE_QUOTE | lv_name_0_2= RULE_SIGNED_LITERAL | lv_name_0_3= RULE_SIGNED_REAL_ID | lv_name_0_4= RULE_SIGNED_RAT_ID ) )
            {
            // InternalVampireLanguage.g:2021:3: ( (lv_name_0_1= RULE_DOUBLE_QUOTE | lv_name_0_2= RULE_SIGNED_LITERAL | lv_name_0_3= RULE_SIGNED_REAL_ID | lv_name_0_4= RULE_SIGNED_RAT_ID ) )
            // InternalVampireLanguage.g:2022:4: (lv_name_0_1= RULE_DOUBLE_QUOTE | lv_name_0_2= RULE_SIGNED_LITERAL | lv_name_0_3= RULE_SIGNED_REAL_ID | lv_name_0_4= RULE_SIGNED_RAT_ID )
            {
            // InternalVampireLanguage.g:2022:4: (lv_name_0_1= RULE_DOUBLE_QUOTE | lv_name_0_2= RULE_SIGNED_LITERAL | lv_name_0_3= RULE_SIGNED_REAL_ID | lv_name_0_4= RULE_SIGNED_RAT_ID )
            int alt26=4;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE_QUOTE:
                {
                alt26=1;
                }
                break;
            case RULE_SIGNED_LITERAL:
                {
                alt26=2;
                }
                break;
            case RULE_SIGNED_REAL_ID:
                {
                alt26=3;
                }
                break;
            case RULE_SIGNED_RAT_ID:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalVampireLanguage.g:2023:5: lv_name_0_1= RULE_DOUBLE_QUOTE
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
                    // InternalVampireLanguage.g:2038:5: lv_name_0_2= RULE_SIGNED_LITERAL
                    {
                    lv_name_0_2=(Token)match(input,RULE_SIGNED_LITERAL,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getVLSDefinedTermAccess().getNameSIGNED_LITERALTerminalRuleCall_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVLSDefinedTermRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_2,
                    						"hu.bme.mit.inf.dslreasoner.VampireLanguage.SIGNED_LITERAL");
                    				

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:2053:5: lv_name_0_3= RULE_SIGNED_REAL_ID
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
                    // InternalVampireLanguage.g:2068:5: lv_name_0_4= RULE_SIGNED_RAT_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000260L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00007FFF00000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x1A000000100001E0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001FFFF50000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00017FFF10000062L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001000010000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001FFFF30000060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x01FE000000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xE000000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000003FE0L});

}