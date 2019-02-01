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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SINGLE_QUOTE", "RULE_LOWER_WORD_ID", "RULE_LITERAL", "RULE_SIGNED_LITERAL", "RULE_SINGLE_COMMENT", "RULE_DOLLAR_ID", "RULE_DOUBLE_DOLLAR_ID", "RULE_UPPER_WORD_ID", "RULE_SIGNED_REAL_ID", "RULE_SIGNED_RAT_ID", "RULE_DOUBLE_QUOTE", "RULE_ALPHA_NUMERIC", "RULE_SIGN", "RULE_INT", "RULE_UNSIGNED_REAL_FRAC_ID", "RULE_UNSIGNED_REAL_EXP_ID", "RULE_UNSIGNED_RAT_ID", "RULE_ID", "RULE_ANY_OTHER", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'include('", "',['", "','", "']'", "'%'", "'Satisfiable!'", "'fof'", "'('", "')'", "'.'", "'tff'", "'axiom'", "'conjecture'", "'hypothesis'", "'definition'", "'assumption'", "'lemma'", "'theorem'", "'corollary'", "'negated_conjecture'", "'plain'", "'type'", "'fi_domain'", "'fi_functors'", "'fi_predicates'", "'unknown'", "'['", "'<=>'", "'=>'", "'<='", "'<~>'", "'~|'", "'~&'", "'&'", "'|'", "'!'", "':'", "'?'", "'~'", "'!='", "'='", "':='", "'$true'", "'$false'", "'$less'"
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
    public static final int RULE_SINGLE_QUOTE=4;
    public static final int RULE_SINGLE_COMMENT=8;
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
    public static final int RULE_UPPER_WORD_ID=11;
    public static final int RULE_WS=26;
    public static final int RULE_DOLLAR_ID=9;
    public static final int RULE_ALPHA_NUMERIC=15;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_DOUBLE_DOLLAR_ID=10;
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
    // InternalVampireLanguage.g:71:1: ruleVampireModel returns [EObject current=null] : ( ( (lv_includes_0_0= ruleVLSInclude ) ) | ( (lv_comments_1_0= ruleVLSComment ) ) | ( (lv_confirmations_2_0= ruleVLSConfirmations ) ) | ( (lv_formulas_3_0= ruleVLSFofFormula ) ) | ( (lv_tfformulas_4_0= ruleVLSTffFormula ) ) )* ;
    public final EObject ruleVampireModel() throws RecognitionException {
        EObject current = null;

        EObject lv_includes_0_0 = null;

        EObject lv_comments_1_0 = null;

        EObject lv_confirmations_2_0 = null;

        EObject lv_formulas_3_0 = null;

        EObject lv_tfformulas_4_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:77:2: ( ( ( (lv_includes_0_0= ruleVLSInclude ) ) | ( (lv_comments_1_0= ruleVLSComment ) ) | ( (lv_confirmations_2_0= ruleVLSConfirmations ) ) | ( (lv_formulas_3_0= ruleVLSFofFormula ) ) | ( (lv_tfformulas_4_0= ruleVLSTffFormula ) ) )* )
            // InternalVampireLanguage.g:78:2: ( ( (lv_includes_0_0= ruleVLSInclude ) ) | ( (lv_comments_1_0= ruleVLSComment ) ) | ( (lv_confirmations_2_0= ruleVLSConfirmations ) ) | ( (lv_formulas_3_0= ruleVLSFofFormula ) ) | ( (lv_tfformulas_4_0= ruleVLSTffFormula ) ) )*
            {
            // InternalVampireLanguage.g:78:2: ( ( (lv_includes_0_0= ruleVLSInclude ) ) | ( (lv_comments_1_0= ruleVLSComment ) ) | ( (lv_confirmations_2_0= ruleVLSConfirmations ) ) | ( (lv_formulas_3_0= ruleVLSFofFormula ) ) | ( (lv_tfformulas_4_0= ruleVLSTffFormula ) ) )*
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 27:
                    {
                    alt1=1;
                    }
                    break;
                case 31:
                    {
                    alt1=2;
                    }
                    break;
                case 32:
                    {
                    alt1=3;
                    }
                    break;
                case 33:
                    {
                    alt1=4;
                    }
                    break;
                case 37:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalVampireLanguage.g:79:3: ( (lv_includes_0_0= ruleVLSInclude ) )
            	    {
            	    // InternalVampireLanguage.g:79:3: ( (lv_includes_0_0= ruleVLSInclude ) )
            	    // InternalVampireLanguage.g:80:4: (lv_includes_0_0= ruleVLSInclude )
            	    {
            	    // InternalVampireLanguage.g:80:4: (lv_includes_0_0= ruleVLSInclude )
            	    // InternalVampireLanguage.g:81:5: lv_includes_0_0= ruleVLSInclude
            	    {

            	    					newCompositeNode(grammarAccess.getVampireModelAccess().getIncludesVLSIncludeParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_includes_0_0=ruleVLSInclude();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVampireModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"includes",
            	    						lv_includes_0_0,
            	    						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSInclude");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVampireLanguage.g:99:3: ( (lv_comments_1_0= ruleVLSComment ) )
            	    {
            	    // InternalVampireLanguage.g:99:3: ( (lv_comments_1_0= ruleVLSComment ) )
            	    // InternalVampireLanguage.g:100:4: (lv_comments_1_0= ruleVLSComment )
            	    {
            	    // InternalVampireLanguage.g:100:4: (lv_comments_1_0= ruleVLSComment )
            	    // InternalVampireLanguage.g:101:5: lv_comments_1_0= ruleVLSComment
            	    {

            	    					newCompositeNode(grammarAccess.getVampireModelAccess().getCommentsVLSCommentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_comments_1_0=ruleVLSComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVampireModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comments",
            	    						lv_comments_1_0,
            	    						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSComment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVampireLanguage.g:119:3: ( (lv_confirmations_2_0= ruleVLSConfirmations ) )
            	    {
            	    // InternalVampireLanguage.g:119:3: ( (lv_confirmations_2_0= ruleVLSConfirmations ) )
            	    // InternalVampireLanguage.g:120:4: (lv_confirmations_2_0= ruleVLSConfirmations )
            	    {
            	    // InternalVampireLanguage.g:120:4: (lv_confirmations_2_0= ruleVLSConfirmations )
            	    // InternalVampireLanguage.g:121:5: lv_confirmations_2_0= ruleVLSConfirmations
            	    {

            	    					newCompositeNode(grammarAccess.getVampireModelAccess().getConfirmationsVLSConfirmationsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_confirmations_2_0=ruleVLSConfirmations();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVampireModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"confirmations",
            	    						lv_confirmations_2_0,
            	    						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSConfirmations");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVampireLanguage.g:139:3: ( (lv_formulas_3_0= ruleVLSFofFormula ) )
            	    {
            	    // InternalVampireLanguage.g:139:3: ( (lv_formulas_3_0= ruleVLSFofFormula ) )
            	    // InternalVampireLanguage.g:140:4: (lv_formulas_3_0= ruleVLSFofFormula )
            	    {
            	    // InternalVampireLanguage.g:140:4: (lv_formulas_3_0= ruleVLSFofFormula )
            	    // InternalVampireLanguage.g:141:5: lv_formulas_3_0= ruleVLSFofFormula
            	    {

            	    					newCompositeNode(grammarAccess.getVampireModelAccess().getFormulasVLSFofFormulaParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_formulas_3_0=ruleVLSFofFormula();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVampireModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"formulas",
            	    						lv_formulas_3_0,
            	    						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSFofFormula");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalVampireLanguage.g:159:3: ( (lv_tfformulas_4_0= ruleVLSTffFormula ) )
            	    {
            	    // InternalVampireLanguage.g:159:3: ( (lv_tfformulas_4_0= ruleVLSTffFormula ) )
            	    // InternalVampireLanguage.g:160:4: (lv_tfformulas_4_0= ruleVLSTffFormula )
            	    {
            	    // InternalVampireLanguage.g:160:4: (lv_tfformulas_4_0= ruleVLSTffFormula )
            	    // InternalVampireLanguage.g:161:5: lv_tfformulas_4_0= ruleVLSTffFormula
            	    {

            	    					newCompositeNode(grammarAccess.getVampireModelAccess().getTfformulasVLSTffFormulaParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_tfformulas_4_0=ruleVLSTffFormula();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVampireModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tfformulas",
            	    						lv_tfformulas_4_0,
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


    // $ANTLR start "entryRuleVLSInclude"
    // InternalVampireLanguage.g:182:1: entryRuleVLSInclude returns [EObject current=null] : iv_ruleVLSInclude= ruleVLSInclude EOF ;
    public final EObject entryRuleVLSInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSInclude = null;


        try {
            // InternalVampireLanguage.g:182:51: (iv_ruleVLSInclude= ruleVLSInclude EOF )
            // InternalVampireLanguage.g:183:2: iv_ruleVLSInclude= ruleVLSInclude EOF
            {
             newCompositeNode(grammarAccess.getVLSIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSInclude=ruleVLSInclude();

            state._fsp--;

             current =iv_ruleVLSInclude; 
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
    // $ANTLR end "entryRuleVLSInclude"


    // $ANTLR start "ruleVLSInclude"
    // InternalVampireLanguage.g:189:1: ruleVLSInclude returns [EObject current=null] : (otherlv_0= 'include(' ( (lv_fileName_1_0= RULE_SINGLE_QUOTE ) ) (otherlv_2= ',[' ( (lv_names_3_0= ruleVLSName ) ) (otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) ) )* otherlv_6= ']' )? ) ;
    public final EObject ruleVLSInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fileName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_names_3_0 = null;

        EObject lv_names_5_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:195:2: ( (otherlv_0= 'include(' ( (lv_fileName_1_0= RULE_SINGLE_QUOTE ) ) (otherlv_2= ',[' ( (lv_names_3_0= ruleVLSName ) ) (otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) ) )* otherlv_6= ']' )? ) )
            // InternalVampireLanguage.g:196:2: (otherlv_0= 'include(' ( (lv_fileName_1_0= RULE_SINGLE_QUOTE ) ) (otherlv_2= ',[' ( (lv_names_3_0= ruleVLSName ) ) (otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) ) )* otherlv_6= ']' )? )
            {
            // InternalVampireLanguage.g:196:2: (otherlv_0= 'include(' ( (lv_fileName_1_0= RULE_SINGLE_QUOTE ) ) (otherlv_2= ',[' ( (lv_names_3_0= ruleVLSName ) ) (otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) ) )* otherlv_6= ']' )? )
            // InternalVampireLanguage.g:197:3: otherlv_0= 'include(' ( (lv_fileName_1_0= RULE_SINGLE_QUOTE ) ) (otherlv_2= ',[' ( (lv_names_3_0= ruleVLSName ) ) (otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) ) )* otherlv_6= ']' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVLSIncludeAccess().getIncludeKeyword_0());
            		
            // InternalVampireLanguage.g:201:3: ( (lv_fileName_1_0= RULE_SINGLE_QUOTE ) )
            // InternalVampireLanguage.g:202:4: (lv_fileName_1_0= RULE_SINGLE_QUOTE )
            {
            // InternalVampireLanguage.g:202:4: (lv_fileName_1_0= RULE_SINGLE_QUOTE )
            // InternalVampireLanguage.g:203:5: lv_fileName_1_0= RULE_SINGLE_QUOTE
            {
            lv_fileName_1_0=(Token)match(input,RULE_SINGLE_QUOTE,FOLLOW_5); 

            					newLeafNode(lv_fileName_1_0, grammarAccess.getVLSIncludeAccess().getFileNameSINGLE_QUOTETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVLSIncludeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fileName",
            						lv_fileName_1_0,
            						"ca.mcgill.ecse.dslreasoner.VampireLanguage.SINGLE_QUOTE");
            				

            }


            }

            // InternalVampireLanguage.g:219:3: (otherlv_2= ',[' ( (lv_names_3_0= ruleVLSName ) ) (otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) ) )* otherlv_6= ']' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalVampireLanguage.g:220:4: otherlv_2= ',[' ( (lv_names_3_0= ruleVLSName ) ) (otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) ) )* otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getVLSIncludeAccess().getCommaLeftSquareBracketKeyword_2_0());
                    			
                    // InternalVampireLanguage.g:224:4: ( (lv_names_3_0= ruleVLSName ) )
                    // InternalVampireLanguage.g:225:5: (lv_names_3_0= ruleVLSName )
                    {
                    // InternalVampireLanguage.g:225:5: (lv_names_3_0= ruleVLSName )
                    // InternalVampireLanguage.g:226:6: lv_names_3_0= ruleVLSName
                    {

                    						newCompositeNode(grammarAccess.getVLSIncludeAccess().getNamesVLSNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_names_3_0=ruleVLSName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVLSIncludeRule());
                    						}
                    						add(
                    							current,
                    							"names",
                    							lv_names_3_0,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVampireLanguage.g:243:4: (otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==29) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:244:5: otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getVLSIncludeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalVampireLanguage.g:248:5: ( (lv_names_5_0= ruleVLSName ) )
                    	    // InternalVampireLanguage.g:249:6: (lv_names_5_0= ruleVLSName )
                    	    {
                    	    // InternalVampireLanguage.g:249:6: (lv_names_5_0= ruleVLSName )
                    	    // InternalVampireLanguage.g:250:7: lv_names_5_0= ruleVLSName
                    	    {

                    	    							newCompositeNode(grammarAccess.getVLSIncludeAccess().getNamesVLSNameParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_names_5_0=ruleVLSName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVLSIncludeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"names",
                    	    								lv_names_5_0,
                    	    								"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getVLSIncludeAccess().getRightSquareBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleVLSInclude"


    // $ANTLR start "entryRuleVLSName"
    // InternalVampireLanguage.g:277:1: entryRuleVLSName returns [EObject current=null] : iv_ruleVLSName= ruleVLSName EOF ;
    public final EObject entryRuleVLSName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSName = null;


        try {
            // InternalVampireLanguage.g:277:48: (iv_ruleVLSName= ruleVLSName EOF )
            // InternalVampireLanguage.g:278:2: iv_ruleVLSName= ruleVLSName EOF
            {
             newCompositeNode(grammarAccess.getVLSNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSName=ruleVLSName();

            state._fsp--;

             current =iv_ruleVLSName; 
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
    // $ANTLR end "entryRuleVLSName"


    // $ANTLR start "ruleVLSName"
    // InternalVampireLanguage.g:284:1: ruleVLSName returns [EObject current=null] : ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_LITERAL | lv_name_0_4= RULE_SIGNED_LITERAL ) ) ) ;
    public final EObject ruleVLSName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:290:2: ( ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_LITERAL | lv_name_0_4= RULE_SIGNED_LITERAL ) ) ) )
            // InternalVampireLanguage.g:291:2: ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_LITERAL | lv_name_0_4= RULE_SIGNED_LITERAL ) ) )
            {
            // InternalVampireLanguage.g:291:2: ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_LITERAL | lv_name_0_4= RULE_SIGNED_LITERAL ) ) )
            // InternalVampireLanguage.g:292:3: ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_LITERAL | lv_name_0_4= RULE_SIGNED_LITERAL ) )
            {
            // InternalVampireLanguage.g:292:3: ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_LITERAL | lv_name_0_4= RULE_SIGNED_LITERAL ) )
            // InternalVampireLanguage.g:293:4: (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_LITERAL | lv_name_0_4= RULE_SIGNED_LITERAL )
            {
            // InternalVampireLanguage.g:293:4: (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_LITERAL | lv_name_0_4= RULE_SIGNED_LITERAL )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt4=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt4=2;
                }
                break;
            case RULE_LITERAL:
                {
                alt4=3;
                }
                break;
            case RULE_SIGNED_LITERAL:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalVampireLanguage.g:294:5: lv_name_0_1= RULE_LOWER_WORD_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getVLSNameAccess().getNameLOWER_WORD_IDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVLSNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_1,
                    						"ca.mcgill.ecse.dslreasoner.VampireLanguage.LOWER_WORD_ID");
                    				

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:309:5: lv_name_0_2= RULE_SINGLE_QUOTE
                    {
                    lv_name_0_2=(Token)match(input,RULE_SINGLE_QUOTE,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getVLSNameAccess().getNameSINGLE_QUOTETerminalRuleCall_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVLSNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_2,
                    						"ca.mcgill.ecse.dslreasoner.VampireLanguage.SINGLE_QUOTE");
                    				

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:324:5: lv_name_0_3= RULE_LITERAL
                    {
                    lv_name_0_3=(Token)match(input,RULE_LITERAL,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getVLSNameAccess().getNameLITERALTerminalRuleCall_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVLSNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_3,
                    						"ca.mcgill.ecse.dslreasoner.VampireLanguage.LITERAL");
                    				

                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:339:5: lv_name_0_4= RULE_SIGNED_LITERAL
                    {
                    lv_name_0_4=(Token)match(input,RULE_SIGNED_LITERAL,FOLLOW_2); 

                    					newLeafNode(lv_name_0_4, grammarAccess.getVLSNameAccess().getNameSIGNED_LITERALTerminalRuleCall_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVLSNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_4,
                    						"ca.mcgill.ecse.dslreasoner.VampireLanguage.SIGNED_LITERAL");
                    				

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
    // $ANTLR end "ruleVLSName"


    // $ANTLR start "entryRuleVLSComment"
    // InternalVampireLanguage.g:359:1: entryRuleVLSComment returns [EObject current=null] : iv_ruleVLSComment= ruleVLSComment EOF ;
    public final EObject entryRuleVLSComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSComment = null;


        try {
            // InternalVampireLanguage.g:359:51: (iv_ruleVLSComment= ruleVLSComment EOF )
            // InternalVampireLanguage.g:360:2: iv_ruleVLSComment= ruleVLSComment EOF
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
    // InternalVampireLanguage.g:366:1: ruleVLSComment returns [EObject current=null] : (otherlv_0= '%' ( (lv_comment_1_0= RULE_SINGLE_COMMENT ) ) ) ;
    public final EObject ruleVLSComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_comment_1_0=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:372:2: ( (otherlv_0= '%' ( (lv_comment_1_0= RULE_SINGLE_COMMENT ) ) ) )
            // InternalVampireLanguage.g:373:2: (otherlv_0= '%' ( (lv_comment_1_0= RULE_SINGLE_COMMENT ) ) )
            {
            // InternalVampireLanguage.g:373:2: (otherlv_0= '%' ( (lv_comment_1_0= RULE_SINGLE_COMMENT ) ) )
            // InternalVampireLanguage.g:374:3: otherlv_0= '%' ( (lv_comment_1_0= RULE_SINGLE_COMMENT ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVLSCommentAccess().getPercentSignKeyword_0());
            		
            // InternalVampireLanguage.g:378:3: ( (lv_comment_1_0= RULE_SINGLE_COMMENT ) )
            // InternalVampireLanguage.g:379:4: (lv_comment_1_0= RULE_SINGLE_COMMENT )
            {
            // InternalVampireLanguage.g:379:4: (lv_comment_1_0= RULE_SINGLE_COMMENT )
            // InternalVampireLanguage.g:380:5: lv_comment_1_0= RULE_SINGLE_COMMENT
            {
            lv_comment_1_0=(Token)match(input,RULE_SINGLE_COMMENT,FOLLOW_2); 

            					newLeafNode(lv_comment_1_0, grammarAccess.getVLSCommentAccess().getCommentSINGLE_COMMENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVLSCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"ca.mcgill.ecse.dslreasoner.VampireLanguage.SINGLE_COMMENT");
            				

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
    // $ANTLR end "ruleVLSComment"


    // $ANTLR start "entryRuleVLSConfirmations"
    // InternalVampireLanguage.g:400:1: entryRuleVLSConfirmations returns [EObject current=null] : iv_ruleVLSConfirmations= ruleVLSConfirmations EOF ;
    public final EObject entryRuleVLSConfirmations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSConfirmations = null;


        try {
            // InternalVampireLanguage.g:400:57: (iv_ruleVLSConfirmations= ruleVLSConfirmations EOF )
            // InternalVampireLanguage.g:401:2: iv_ruleVLSConfirmations= ruleVLSConfirmations EOF
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
    // InternalVampireLanguage.g:407:1: ruleVLSConfirmations returns [EObject current=null] : this_VLSSatisfiable_0= ruleVLSSatisfiable ;
    public final EObject ruleVLSConfirmations() throws RecognitionException {
        EObject current = null;

        EObject this_VLSSatisfiable_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:413:2: (this_VLSSatisfiable_0= ruleVLSSatisfiable )
            // InternalVampireLanguage.g:414:2: this_VLSSatisfiable_0= ruleVLSSatisfiable
            {

            		newCompositeNode(grammarAccess.getVLSConfirmationsAccess().getVLSSatisfiableParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_VLSSatisfiable_0=ruleVLSSatisfiable();

            state._fsp--;


            		current = this_VLSSatisfiable_0;
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
    // $ANTLR end "ruleVLSConfirmations"


    // $ANTLR start "entryRuleVLSSatisfiable"
    // InternalVampireLanguage.g:425:1: entryRuleVLSSatisfiable returns [EObject current=null] : iv_ruleVLSSatisfiable= ruleVLSSatisfiable EOF ;
    public final EObject entryRuleVLSSatisfiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSSatisfiable = null;


        try {
            // InternalVampireLanguage.g:425:55: (iv_ruleVLSSatisfiable= ruleVLSSatisfiable EOF )
            // InternalVampireLanguage.g:426:2: iv_ruleVLSSatisfiable= ruleVLSSatisfiable EOF
            {
             newCompositeNode(grammarAccess.getVLSSatisfiableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVLSSatisfiable=ruleVLSSatisfiable();

            state._fsp--;

             current =iv_ruleVLSSatisfiable; 
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
    // $ANTLR end "entryRuleVLSSatisfiable"


    // $ANTLR start "ruleVLSSatisfiable"
    // InternalVampireLanguage.g:432:1: ruleVLSSatisfiable returns [EObject current=null] : ( () otherlv_1= 'Satisfiable!' ) ;
    public final EObject ruleVLSSatisfiable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:438:2: ( ( () otherlv_1= 'Satisfiable!' ) )
            // InternalVampireLanguage.g:439:2: ( () otherlv_1= 'Satisfiable!' )
            {
            // InternalVampireLanguage.g:439:2: ( () otherlv_1= 'Satisfiable!' )
            // InternalVampireLanguage.g:440:3: () otherlv_1= 'Satisfiable!'
            {
            // InternalVampireLanguage.g:440:3: ()
            // InternalVampireLanguage.g:441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSSatisfiableAccess().getVLSSatisfiableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getVLSSatisfiableAccess().getSatisfiableKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVLSSatisfiable"


    // $ANTLR start "entryRuleVLSFofFormula"
    // InternalVampireLanguage.g:455:1: entryRuleVLSFofFormula returns [EObject current=null] : iv_ruleVLSFofFormula= ruleVLSFofFormula EOF ;
    public final EObject entryRuleVLSFofFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFofFormula = null;


        try {
            // InternalVampireLanguage.g:455:54: (iv_ruleVLSFofFormula= ruleVLSFofFormula EOF )
            // InternalVampireLanguage.g:456:2: iv_ruleVLSFofFormula= ruleVLSFofFormula EOF
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
    // InternalVampireLanguage.g:462:1: ruleVLSFofFormula returns [EObject current=null] : (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' ) ;
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
            // InternalVampireLanguage.g:468:2: ( (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' ) )
            // InternalVampireLanguage.g:469:2: (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' )
            {
            // InternalVampireLanguage.g:469:2: (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' )
            // InternalVampireLanguage.g:470:3: otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getVLSFofFormulaAccess().getFofKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getVLSFofFormulaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalVampireLanguage.g:478:3: ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) )
            // InternalVampireLanguage.g:479:4: ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) )
            {
            // InternalVampireLanguage.g:479:4: ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) )
            // InternalVampireLanguage.g:480:5: (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE )
            {
            // InternalVampireLanguage.g:480:5: (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE )
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
                    // InternalVampireLanguage.g:481:6: lv_name_2_1= RULE_LOWER_WORD_ID
                    {
                    lv_name_2_1=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_11); 

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
                    // InternalVampireLanguage.g:496:6: lv_name_2_2= RULE_SIGNED_LITERAL
                    {
                    lv_name_2_2=(Token)match(input,RULE_SIGNED_LITERAL,FOLLOW_11); 

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
                    // InternalVampireLanguage.g:511:6: lv_name_2_3= RULE_SINGLE_QUOTE
                    {
                    lv_name_2_3=(Token)match(input,RULE_SINGLE_QUOTE,FOLLOW_11); 

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

            otherlv_3=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_3());
            		
            // InternalVampireLanguage.g:532:3: ( (lv_fofRole_4_0= ruleVLSRole ) )
            // InternalVampireLanguage.g:533:4: (lv_fofRole_4_0= ruleVLSRole )
            {
            // InternalVampireLanguage.g:533:4: (lv_fofRole_4_0= ruleVLSRole )
            // InternalVampireLanguage.g:534:5: lv_fofRole_4_0= ruleVLSRole
            {

            					newCompositeNode(grammarAccess.getVLSFofFormulaAccess().getFofRoleVLSRoleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_5=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_5());
            		
            // InternalVampireLanguage.g:555:3: ( (lv_fofFormula_6_0= ruleVLSTerm ) )
            // InternalVampireLanguage.g:556:4: (lv_fofFormula_6_0= ruleVLSTerm )
            {
            // InternalVampireLanguage.g:556:4: (lv_fofFormula_6_0= ruleVLSTerm )
            // InternalVampireLanguage.g:557:5: lv_fofFormula_6_0= ruleVLSTerm
            {

            					newCompositeNode(grammarAccess.getVLSFofFormulaAccess().getFofFormulaVLSTermParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalVampireLanguage.g:574:3: (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVampireLanguage.g:575:4: otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_7_0());
                    			
                    // InternalVampireLanguage.g:579:4: ( (lv_annotations_8_0= ruleVLSAnnotation ) )
                    // InternalVampireLanguage.g:580:5: (lv_annotations_8_0= ruleVLSAnnotation )
                    {
                    // InternalVampireLanguage.g:580:5: (lv_annotations_8_0= ruleVLSAnnotation )
                    // InternalVampireLanguage.g:581:6: lv_annotations_8_0= ruleVLSAnnotation
                    {

                    						newCompositeNode(grammarAccess.getVLSFofFormulaAccess().getAnnotationsVLSAnnotationParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_9=(Token)match(input,35,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getVLSFofFormulaAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,36,FOLLOW_2); 

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
    // InternalVampireLanguage.g:611:1: entryRuleVLSTffFormula returns [EObject current=null] : iv_ruleVLSTffFormula= ruleVLSTffFormula EOF ;
    public final EObject entryRuleVLSTffFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSTffFormula = null;


        try {
            // InternalVampireLanguage.g:611:54: (iv_ruleVLSTffFormula= ruleVLSTffFormula EOF )
            // InternalVampireLanguage.g:612:2: iv_ruleVLSTffFormula= ruleVLSTffFormula EOF
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
    // InternalVampireLanguage.g:618:1: ruleVLSTffFormula returns [EObject current=null] : (otherlv_0= 'tff' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' ) ;
    public final EObject ruleVLSTffFormula() throws RecognitionException {
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
            // InternalVampireLanguage.g:624:2: ( (otherlv_0= 'tff' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' ) )
            // InternalVampireLanguage.g:625:2: (otherlv_0= 'tff' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' )
            {
            // InternalVampireLanguage.g:625:2: (otherlv_0= 'tff' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' )
            // InternalVampireLanguage.g:626:3: otherlv_0= 'tff' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getVLSTffFormulaAccess().getTffKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getVLSTffFormulaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalVampireLanguage.g:634:3: ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) )
            // InternalVampireLanguage.g:635:4: ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) )
            {
            // InternalVampireLanguage.g:635:4: ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) )
            // InternalVampireLanguage.g:636:5: (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE )
            {
            // InternalVampireLanguage.g:636:5: (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt7=1;
                }
                break;
            case RULE_SIGNED_LITERAL:
                {
                alt7=2;
                }
                break;
            case RULE_SINGLE_QUOTE:
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
                    // InternalVampireLanguage.g:637:6: lv_name_2_1= RULE_LOWER_WORD_ID
                    {
                    lv_name_2_1=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_11); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getVLSTffFormulaAccess().getNameLOWER_WORD_IDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSTffFormulaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.LOWER_WORD_ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:652:6: lv_name_2_2= RULE_SIGNED_LITERAL
                    {
                    lv_name_2_2=(Token)match(input,RULE_SIGNED_LITERAL,FOLLOW_11); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getVLSTffFormulaAccess().getNameSIGNED_LITERALTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSTffFormulaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.SIGNED_LITERAL");
                    					

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:667:6: lv_name_2_3= RULE_SINGLE_QUOTE
                    {
                    lv_name_2_3=(Token)match(input,RULE_SINGLE_QUOTE,FOLLOW_11); 

                    						newLeafNode(lv_name_2_3, grammarAccess.getVLSTffFormulaAccess().getNameSINGLE_QUOTETerminalRuleCall_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSTffFormulaRule());
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

            otherlv_3=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getVLSTffFormulaAccess().getCommaKeyword_3());
            		
            // InternalVampireLanguage.g:688:3: ( (lv_fofRole_4_0= ruleVLSRole ) )
            // InternalVampireLanguage.g:689:4: (lv_fofRole_4_0= ruleVLSRole )
            {
            // InternalVampireLanguage.g:689:4: (lv_fofRole_4_0= ruleVLSRole )
            // InternalVampireLanguage.g:690:5: lv_fofRole_4_0= ruleVLSRole
            {

            					newCompositeNode(grammarAccess.getVLSTffFormulaAccess().getFofRoleVLSRoleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_fofRole_4_0=ruleVLSRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSTffFormulaRule());
            					}
            					set(
            						current,
            						"fofRole",
            						lv_fofRole_4_0,
            						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSRole");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getVLSTffFormulaAccess().getCommaKeyword_5());
            		
            // InternalVampireLanguage.g:711:3: ( (lv_fofFormula_6_0= ruleVLSTerm ) )
            // InternalVampireLanguage.g:712:4: (lv_fofFormula_6_0= ruleVLSTerm )
            {
            // InternalVampireLanguage.g:712:4: (lv_fofFormula_6_0= ruleVLSTerm )
            // InternalVampireLanguage.g:713:5: lv_fofFormula_6_0= ruleVLSTerm
            {

            					newCompositeNode(grammarAccess.getVLSTffFormulaAccess().getFofFormulaVLSTermParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_fofFormula_6_0=ruleVLSTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVLSTffFormulaRule());
            					}
            					set(
            						current,
            						"fofFormula",
            						lv_fofFormula_6_0,
            						"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVampireLanguage.g:730:3: (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVampireLanguage.g:731:4: otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getVLSTffFormulaAccess().getCommaKeyword_7_0());
                    			
                    // InternalVampireLanguage.g:735:4: ( (lv_annotations_8_0= ruleVLSAnnotation ) )
                    // InternalVampireLanguage.g:736:5: (lv_annotations_8_0= ruleVLSAnnotation )
                    {
                    // InternalVampireLanguage.g:736:5: (lv_annotations_8_0= ruleVLSAnnotation )
                    // InternalVampireLanguage.g:737:6: lv_annotations_8_0= ruleVLSAnnotation
                    {

                    						newCompositeNode(grammarAccess.getVLSTffFormulaAccess().getAnnotationsVLSAnnotationParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_9=(Token)match(input,35,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getVLSTffFormulaAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,36,FOLLOW_2); 

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


    // $ANTLR start "entryRuleVLSRole"
    // InternalVampireLanguage.g:767:1: entryRuleVLSRole returns [String current=null] : iv_ruleVLSRole= ruleVLSRole EOF ;
    public final String entryRuleVLSRole() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSRole = null;


        try {
            // InternalVampireLanguage.g:767:47: (iv_ruleVLSRole= ruleVLSRole EOF )
            // InternalVampireLanguage.g:768:2: iv_ruleVLSRole= ruleVLSRole EOF
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
    // InternalVampireLanguage.g:774:1: ruleVLSRole returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'axiom' | kw= 'conjecture' | kw= 'hypothesis' | kw= 'definition' | kw= 'assumption' | kw= 'lemma' | kw= 'theorem' | kw= 'corollary' | kw= 'negated_conjecture' | kw= 'plain' | kw= 'type' | kw= 'fi_domain' | kw= 'fi_functors' | kw= 'fi_predicates' | kw= 'unknown' ) ;
    public final AntlrDatatypeRuleToken ruleVLSRole() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:780:2: ( (kw= 'axiom' | kw= 'conjecture' | kw= 'hypothesis' | kw= 'definition' | kw= 'assumption' | kw= 'lemma' | kw= 'theorem' | kw= 'corollary' | kw= 'negated_conjecture' | kw= 'plain' | kw= 'type' | kw= 'fi_domain' | kw= 'fi_functors' | kw= 'fi_predicates' | kw= 'unknown' ) )
            // InternalVampireLanguage.g:781:2: (kw= 'axiom' | kw= 'conjecture' | kw= 'hypothesis' | kw= 'definition' | kw= 'assumption' | kw= 'lemma' | kw= 'theorem' | kw= 'corollary' | kw= 'negated_conjecture' | kw= 'plain' | kw= 'type' | kw= 'fi_domain' | kw= 'fi_functors' | kw= 'fi_predicates' | kw= 'unknown' )
            {
            // InternalVampireLanguage.g:781:2: (kw= 'axiom' | kw= 'conjecture' | kw= 'hypothesis' | kw= 'definition' | kw= 'assumption' | kw= 'lemma' | kw= 'theorem' | kw= 'corollary' | kw= 'negated_conjecture' | kw= 'plain' | kw= 'type' | kw= 'fi_domain' | kw= 'fi_functors' | kw= 'fi_predicates' | kw= 'unknown' )
            int alt9=15;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt9=1;
                }
                break;
            case 39:
                {
                alt9=2;
                }
                break;
            case 40:
                {
                alt9=3;
                }
                break;
            case 41:
                {
                alt9=4;
                }
                break;
            case 42:
                {
                alt9=5;
                }
                break;
            case 43:
                {
                alt9=6;
                }
                break;
            case 44:
                {
                alt9=7;
                }
                break;
            case 45:
                {
                alt9=8;
                }
                break;
            case 46:
                {
                alt9=9;
                }
                break;
            case 47:
                {
                alt9=10;
                }
                break;
            case 48:
                {
                alt9=11;
                }
                break;
            case 49:
                {
                alt9=12;
                }
                break;
            case 50:
                {
                alt9=13;
                }
                break;
            case 51:
                {
                alt9=14;
                }
                break;
            case 52:
                {
                alt9=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalVampireLanguage.g:782:3: kw= 'axiom'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getAxiomKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:788:3: kw= 'conjecture'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getConjectureKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:794:3: kw= 'hypothesis'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getHypothesisKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:800:3: kw= 'definition'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getDefinitionKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalVampireLanguage.g:806:3: kw= 'assumption'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getAssumptionKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalVampireLanguage.g:812:3: kw= 'lemma'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getLemmaKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalVampireLanguage.g:818:3: kw= 'theorem'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getTheoremKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalVampireLanguage.g:824:3: kw= 'corollary'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getCorollaryKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalVampireLanguage.g:830:3: kw= 'negated_conjecture'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getNegated_conjectureKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalVampireLanguage.g:836:3: kw= 'plain'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getPlainKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalVampireLanguage.g:842:3: kw= 'type'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getTypeKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalVampireLanguage.g:848:3: kw= 'fi_domain'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getFi_domainKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalVampireLanguage.g:854:3: kw= 'fi_functors'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getFi_functorsKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalVampireLanguage.g:860:3: kw= 'fi_predicates'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVLSRoleAccess().getFi_predicatesKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalVampireLanguage.g:866:3: kw= 'unknown'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

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
    // InternalVampireLanguage.g:875:1: entryRuleVLSAnnotation returns [EObject current=null] : iv_ruleVLSAnnotation= ruleVLSAnnotation EOF ;
    public final EObject entryRuleVLSAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAnnotation = null;


        try {
            // InternalVampireLanguage.g:875:54: (iv_ruleVLSAnnotation= ruleVLSAnnotation EOF )
            // InternalVampireLanguage.g:876:2: iv_ruleVLSAnnotation= ruleVLSAnnotation EOF
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
    // InternalVampireLanguage.g:882:1: ruleVLSAnnotation returns [EObject current=null] : ( (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )? ) ;
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
            // InternalVampireLanguage.g:888:2: ( ( (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )? ) )
            // InternalVampireLanguage.g:889:2: ( (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )? )
            {
            // InternalVampireLanguage.g:889:2: ( (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )? )
            // InternalVampireLanguage.g:890:3: (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )?
            {
            // InternalVampireLanguage.g:890:3: (otherlv_0= '[' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==53) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVampireLanguage.g:891:4: otherlv_0= '['
                    {
                    otherlv_0=(Token)match(input,53,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getVLSAnnotationAccess().getLeftSquareBracketKeyword_0());
                    			

                    }
                    break;

            }

            // InternalVampireLanguage.g:896:3: ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_SINGLE_QUOTE && LA12_0<=RULE_LOWER_WORD_ID)||(LA12_0>=38 && LA12_0<=52)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVampireLanguage.g:897:4: ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) )
                    {
                    // InternalVampireLanguage.g:897:4: ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) )
                    // InternalVampireLanguage.g:898:5: (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:898:5: (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole )
                    int alt11=3;
                    switch ( input.LA(1) ) {
                    case RULE_LOWER_WORD_ID:
                        {
                        alt11=1;
                        }
                        break;
                    case RULE_SINGLE_QUOTE:
                        {
                        alt11=2;
                        }
                        break;
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                        {
                        alt11=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }

                    switch (alt11) {
                        case 1 :
                            // InternalVampireLanguage.g:899:6: lv_name_1_1= RULE_LOWER_WORD_ID
                            {
                            lv_name_1_1=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_19); 

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
                            // InternalVampireLanguage.g:914:6: lv_name_1_2= RULE_SINGLE_QUOTE
                            {
                            lv_name_1_2=(Token)match(input,RULE_SINGLE_QUOTE,FOLLOW_19); 

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
                            // InternalVampireLanguage.g:929:6: lv_name_1_3= ruleVLSRole
                            {

                            						newCompositeNode(grammarAccess.getVLSAnnotationAccess().getNameVLSRoleParserRuleCall_1_0_2());
                            					
                            pushFollow(FOLLOW_19);
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

            // InternalVampireLanguage.g:947:3: (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVampireLanguage.g:948:4: otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getVLSAnnotationAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalVampireLanguage.g:952:4: ( (lv_followup_3_0= ruleVLSAnnotationTerms ) )
                    // InternalVampireLanguage.g:953:5: (lv_followup_3_0= ruleVLSAnnotationTerms )
                    {
                    // InternalVampireLanguage.g:953:5: (lv_followup_3_0= ruleVLSAnnotationTerms )
                    // InternalVampireLanguage.g:954:6: lv_followup_3_0= ruleVLSAnnotationTerms
                    {

                    						newCompositeNode(grammarAccess.getVLSAnnotationAccess().getFollowupVLSAnnotationTermsParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    otherlv_4=(Token)match(input,35,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getVLSAnnotationAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalVampireLanguage.g:976:3: (otherlv_5= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVampireLanguage.g:977:4: otherlv_5= ']'
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_2); 

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
    // InternalVampireLanguage.g:986:1: entryRuleVLSAnnotationTerms returns [EObject current=null] : iv_ruleVLSAnnotationTerms= ruleVLSAnnotationTerms EOF ;
    public final EObject entryRuleVLSAnnotationTerms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAnnotationTerms = null;


        try {
            // InternalVampireLanguage.g:986:59: (iv_ruleVLSAnnotationTerms= ruleVLSAnnotationTerms EOF )
            // InternalVampireLanguage.g:987:2: iv_ruleVLSAnnotationTerms= ruleVLSAnnotationTerms EOF
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
    // InternalVampireLanguage.g:993:1: ruleVLSAnnotationTerms returns [EObject current=null] : ( ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )* ) ;
    public final EObject ruleVLSAnnotationTerms() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_terms_0_0 = null;

        EObject lv_terms_2_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:999:2: ( ( ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )* ) )
            // InternalVampireLanguage.g:1000:2: ( ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )* )
            {
            // InternalVampireLanguage.g:1000:2: ( ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )* )
            // InternalVampireLanguage.g:1001:3: ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )*
            {
            // InternalVampireLanguage.g:1001:3: ( (lv_terms_0_0= ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:1002:4: (lv_terms_0_0= ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:1002:4: (lv_terms_0_0= ruleVLSAnnotation )
            // InternalVampireLanguage.g:1003:5: lv_terms_0_0= ruleVLSAnnotation
            {

            					newCompositeNode(grammarAccess.getVLSAnnotationTermsAccess().getTermsVLSAnnotationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalVampireLanguage.g:1020:3: (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalVampireLanguage.g:1021:4: otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) )
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_20); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVLSAnnotationTermsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalVampireLanguage.g:1025:4: ( (lv_terms_2_0= ruleVLSAnnotation ) )
            	    // InternalVampireLanguage.g:1026:5: (lv_terms_2_0= ruleVLSAnnotation )
            	    {
            	    // InternalVampireLanguage.g:1026:5: (lv_terms_2_0= ruleVLSAnnotation )
            	    // InternalVampireLanguage.g:1027:6: lv_terms_2_0= ruleVLSAnnotation
            	    {

            	    						newCompositeNode(grammarAccess.getVLSAnnotationTermsAccess().getTermsVLSAnnotationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
            	    break loop15;
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
    // InternalVampireLanguage.g:1049:1: entryRuleVLSTerm returns [EObject current=null] : iv_ruleVLSTerm= ruleVLSTerm EOF ;
    public final EObject entryRuleVLSTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSTerm = null;


        try {
            // InternalVampireLanguage.g:1049:48: (iv_ruleVLSTerm= ruleVLSTerm EOF )
            // InternalVampireLanguage.g:1050:2: iv_ruleVLSTerm= ruleVLSTerm EOF
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
    // InternalVampireLanguage.g:1056:1: ruleVLSTerm returns [EObject current=null] : this_VLSBinary_0= ruleVLSBinary ;
    public final EObject ruleVLSTerm() throws RecognitionException {
        EObject current = null;

        EObject this_VLSBinary_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1062:2: (this_VLSBinary_0= ruleVLSBinary )
            // InternalVampireLanguage.g:1063:2: this_VLSBinary_0= ruleVLSBinary
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
    // InternalVampireLanguage.g:1074:1: entryRuleVLSBinary returns [EObject current=null] : iv_ruleVLSBinary= ruleVLSBinary EOF ;
    public final EObject entryRuleVLSBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSBinary = null;


        try {
            // InternalVampireLanguage.g:1074:50: (iv_ruleVLSBinary= ruleVLSBinary EOF )
            // InternalVampireLanguage.g:1075:2: iv_ruleVLSBinary= ruleVLSBinary EOF
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
    // InternalVampireLanguage.g:1081:1: ruleVLSBinary returns [EObject current=null] : (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? ) ;
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
            // InternalVampireLanguage.g:1087:2: ( (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? ) )
            // InternalVampireLanguage.g:1088:2: (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? )
            {
            // InternalVampireLanguage.g:1088:2: (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? )
            // InternalVampireLanguage.g:1089:3: this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getVLSBinaryAccess().getVLSUnitaryFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_VLSUnitaryFormula_0=ruleVLSUnitaryFormula();

            state._fsp--;


            			current = this_VLSUnitaryFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalVampireLanguage.g:1097:3: ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )?
            int alt19=4;
            switch ( input.LA(1) ) {
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    {
                    alt19=1;
                    }
                    break;
                case 60:
                    {
                    alt19=2;
                    }
                    break;
                case 61:
                    {
                    alt19=3;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // InternalVampireLanguage.g:1098:4: ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) )
                    {
                    // InternalVampireLanguage.g:1098:4: ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) )
                    // InternalVampireLanguage.g:1099:5: ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) )
                    {
                    // InternalVampireLanguage.g:1099:5: ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) )
                    int alt16=6;
                    switch ( input.LA(1) ) {
                    case 54:
                        {
                        alt16=1;
                        }
                        break;
                    case 55:
                        {
                        alt16=2;
                        }
                        break;
                    case 56:
                        {
                        alt16=3;
                        }
                        break;
                    case 57:
                        {
                        alt16=4;
                        }
                        break;
                    case 58:
                        {
                        alt16=5;
                        }
                        break;
                    case 59:
                        {
                        alt16=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }

                    switch (alt16) {
                        case 1 :
                            // InternalVampireLanguage.g:1100:6: ( () otherlv_2= '<=>' )
                            {
                            // InternalVampireLanguage.g:1100:6: ( () otherlv_2= '<=>' )
                            // InternalVampireLanguage.g:1101:7: () otherlv_2= '<=>'
                            {
                            // InternalVampireLanguage.g:1101:7: ()
                            // InternalVampireLanguage.g:1102:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSEquivalentLeftAction_1_0_0_0_0(),
                            									current);
                            							

                            }

                            otherlv_2=(Token)match(input,54,FOLLOW_13); 

                            							newLeafNode(otherlv_2, grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_0_1());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalVampireLanguage.g:1114:6: ( () otherlv_4= '=>' )
                            {
                            // InternalVampireLanguage.g:1114:6: ( () otherlv_4= '=>' )
                            // InternalVampireLanguage.g:1115:7: () otherlv_4= '=>'
                            {
                            // InternalVampireLanguage.g:1115:7: ()
                            // InternalVampireLanguage.g:1116:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSImpliesLeftAction_1_0_0_1_0(),
                            									current);
                            							

                            }

                            otherlv_4=(Token)match(input,55,FOLLOW_13); 

                            							newLeafNode(otherlv_4, grammarAccess.getVLSBinaryAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_1());
                            						

                            }


                            }
                            break;
                        case 3 :
                            // InternalVampireLanguage.g:1128:6: ( () otherlv_6= '<=' )
                            {
                            // InternalVampireLanguage.g:1128:6: ( () otherlv_6= '<=' )
                            // InternalVampireLanguage.g:1129:7: () otherlv_6= '<='
                            {
                            // InternalVampireLanguage.g:1129:7: ()
                            // InternalVampireLanguage.g:1130:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSRevImpliesLeftAction_1_0_0_2_0(),
                            									current);
                            							

                            }

                            otherlv_6=(Token)match(input,56,FOLLOW_13); 

                            							newLeafNode(otherlv_6, grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignKeyword_1_0_0_2_1());
                            						

                            }


                            }
                            break;
                        case 4 :
                            // InternalVampireLanguage.g:1142:6: ( () otherlv_8= '<~>' )
                            {
                            // InternalVampireLanguage.g:1142:6: ( () otherlv_8= '<~>' )
                            // InternalVampireLanguage.g:1143:7: () otherlv_8= '<~>'
                            {
                            // InternalVampireLanguage.g:1143:7: ()
                            // InternalVampireLanguage.g:1144:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSXnorLeftAction_1_0_0_3_0(),
                            									current);
                            							

                            }

                            otherlv_8=(Token)match(input,57,FOLLOW_13); 

                            							newLeafNode(otherlv_8, grammarAccess.getVLSBinaryAccess().getLessThanSignTildeGreaterThanSignKeyword_1_0_0_3_1());
                            						

                            }


                            }
                            break;
                        case 5 :
                            // InternalVampireLanguage.g:1156:6: ( () otherlv_10= '~|' )
                            {
                            // InternalVampireLanguage.g:1156:6: ( () otherlv_10= '~|' )
                            // InternalVampireLanguage.g:1157:7: () otherlv_10= '~|'
                            {
                            // InternalVampireLanguage.g:1157:7: ()
                            // InternalVampireLanguage.g:1158:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSNorLeftAction_1_0_0_4_0(),
                            									current);
                            							

                            }

                            otherlv_10=(Token)match(input,58,FOLLOW_13); 

                            							newLeafNode(otherlv_10, grammarAccess.getVLSBinaryAccess().getTildeVerticalLineKeyword_1_0_0_4_1());
                            						

                            }


                            }
                            break;
                        case 6 :
                            // InternalVampireLanguage.g:1170:6: ( () otherlv_12= '~&' )
                            {
                            // InternalVampireLanguage.g:1170:6: ( () otherlv_12= '~&' )
                            // InternalVampireLanguage.g:1171:7: () otherlv_12= '~&'
                            {
                            // InternalVampireLanguage.g:1171:7: ()
                            // InternalVampireLanguage.g:1172:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSNandLeftAction_1_0_0_5_0(),
                            									current);
                            							

                            }

                            otherlv_12=(Token)match(input,59,FOLLOW_13); 

                            							newLeafNode(otherlv_12, grammarAccess.getVLSBinaryAccess().getTildeAmpersandKeyword_1_0_0_5_1());
                            						

                            }


                            }
                            break;

                    }

                    // InternalVampireLanguage.g:1184:5: ( (lv_right_13_0= ruleVLSUnitaryFormula ) )
                    // InternalVampireLanguage.g:1185:6: (lv_right_13_0= ruleVLSUnitaryFormula )
                    {
                    // InternalVampireLanguage.g:1185:6: (lv_right_13_0= ruleVLSUnitaryFormula )
                    // InternalVampireLanguage.g:1186:7: lv_right_13_0= ruleVLSUnitaryFormula
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
                    // InternalVampireLanguage.g:1205:4: ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+
                    {
                    // InternalVampireLanguage.g:1205:4: ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==60) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1206:5: () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) )
                    	    {
                    	    // InternalVampireLanguage.g:1206:5: ()
                    	    // InternalVampireLanguage.g:1207:6: 
                    	    {

                    	    						current = forceCreateModelElementAndSet(
                    	    							grammarAccess.getVLSBinaryAccess().getVLSAndLeftAction_1_1_0(),
                    	    							current);
                    	    					

                    	    }

                    	    otherlv_15=(Token)match(input,60,FOLLOW_13); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getVLSBinaryAccess().getAmpersandKeyword_1_1_1());
                    	    				
                    	    // InternalVampireLanguage.g:1217:5: ( (lv_right_16_0= ruleVLSUnitaryFormula ) )
                    	    // InternalVampireLanguage.g:1218:6: (lv_right_16_0= ruleVLSUnitaryFormula )
                    	    {
                    	    // InternalVampireLanguage.g:1218:6: (lv_right_16_0= ruleVLSUnitaryFormula )
                    	    // InternalVampireLanguage.g:1219:7: lv_right_16_0= ruleVLSUnitaryFormula
                    	    {

                    	    							newCompositeNode(grammarAccess.getVLSBinaryAccess().getRightVLSUnitaryFormulaParserRuleCall_1_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
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
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1238:4: ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+
                    {
                    // InternalVampireLanguage.g:1238:4: ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==61) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1239:5: () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) )
                    	    {
                    	    // InternalVampireLanguage.g:1239:5: ()
                    	    // InternalVampireLanguage.g:1240:6: 
                    	    {

                    	    						current = forceCreateModelElementAndSet(
                    	    							grammarAccess.getVLSBinaryAccess().getVLSOrLeftAction_1_2_0(),
                    	    							current);
                    	    					

                    	    }

                    	    otherlv_18=(Token)match(input,61,FOLLOW_13); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getVLSBinaryAccess().getVerticalLineKeyword_1_2_1());
                    	    				
                    	    // InternalVampireLanguage.g:1250:5: ( (lv_right_19_0= ruleVLSUnitaryFormula ) )
                    	    // InternalVampireLanguage.g:1251:6: (lv_right_19_0= ruleVLSUnitaryFormula )
                    	    {
                    	    // InternalVampireLanguage.g:1251:6: (lv_right_19_0= ruleVLSUnitaryFormula )
                    	    // InternalVampireLanguage.g:1252:7: lv_right_19_0= ruleVLSUnitaryFormula
                    	    {

                    	    							newCompositeNode(grammarAccess.getVLSBinaryAccess().getRightVLSUnitaryFormulaParserRuleCall_1_2_2_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
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
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
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
    // InternalVampireLanguage.g:1275:1: entryRuleVLSUnitaryFormula returns [EObject current=null] : iv_ruleVLSUnitaryFormula= ruleVLSUnitaryFormula EOF ;
    public final EObject entryRuleVLSUnitaryFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUnitaryFormula = null;


        try {
            // InternalVampireLanguage.g:1275:58: (iv_ruleVLSUnitaryFormula= ruleVLSUnitaryFormula EOF )
            // InternalVampireLanguage.g:1276:2: iv_ruleVLSUnitaryFormula= ruleVLSUnitaryFormula EOF
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
    // InternalVampireLanguage.g:1282:1: ruleVLSUnitaryFormula returns [EObject current=null] : (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) ) ;
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
            // InternalVampireLanguage.g:1288:2: ( (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) ) )
            // InternalVampireLanguage.g:1289:2: (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) )
            {
            // InternalVampireLanguage.g:1289:2: (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt20=1;
                }
                break;
            case 64:
                {
                alt20=2;
                }
                break;
            case 65:
                {
                alt20=3;
                }
                break;
            case RULE_SINGLE_QUOTE:
            case RULE_LOWER_WORD_ID:
            case RULE_SIGNED_LITERAL:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
            case RULE_UPPER_WORD_ID:
            case RULE_SIGNED_REAL_ID:
            case RULE_SIGNED_RAT_ID:
            case RULE_DOUBLE_QUOTE:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 69:
            case 70:
            case 71:
                {
                alt20=4;
                }
                break;
            case 34:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalVampireLanguage.g:1290:3: this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier
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
                    // InternalVampireLanguage.g:1299:3: this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier
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
                    // InternalVampireLanguage.g:1308:3: this_VLSUnaryNegation_2= ruleVLSUnaryNegation
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
                    // InternalVampireLanguage.g:1317:3: this_VLSUnaryInfix_3= ruleVLSUnaryInfix
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
                    // InternalVampireLanguage.g:1326:3: (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' )
                    {
                    // InternalVampireLanguage.g:1326:3: (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' )
                    // InternalVampireLanguage.g:1327:4: otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getVLSUnitaryFormulaAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getVLSUnitaryFormulaAccess().getVLSTermParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_16);
                    this_VLSTerm_5=ruleVLSTerm();

                    state._fsp--;


                    				current = this_VLSTerm_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,35,FOLLOW_2); 

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
    // InternalVampireLanguage.g:1348:1: entryRuleVLSUniversalQuantifier returns [EObject current=null] : iv_ruleVLSUniversalQuantifier= ruleVLSUniversalQuantifier EOF ;
    public final EObject entryRuleVLSUniversalQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUniversalQuantifier = null;


        try {
            // InternalVampireLanguage.g:1348:63: (iv_ruleVLSUniversalQuantifier= ruleVLSUniversalQuantifier EOF )
            // InternalVampireLanguage.g:1349:2: iv_ruleVLSUniversalQuantifier= ruleVLSUniversalQuantifier EOF
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
    // InternalVampireLanguage.g:1355:1: ruleVLSUniversalQuantifier returns [EObject current=null] : ( () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) ;
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
            // InternalVampireLanguage.g:1361:2: ( ( () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) )
            // InternalVampireLanguage.g:1362:2: ( () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            {
            // InternalVampireLanguage.g:1362:2: ( () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            // InternalVampireLanguage.g:1363:3: () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            {
            // InternalVampireLanguage.g:1363:3: ()
            // InternalVampireLanguage.g:1364:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSUniversalQuantifierAccess().getVLSUniversalQuantifierAction_0(),
            					current);
            			

            }

            // InternalVampireLanguage.g:1370:3: (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' )
            // InternalVampireLanguage.g:1371:4: otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':'
            {
            otherlv_1=(Token)match(input,62,FOLLOW_26); 

            				newLeafNode(otherlv_1, grammarAccess.getVLSUniversalQuantifierAccess().getExclamationMarkKeyword_1_0());
            			
            otherlv_2=(Token)match(input,53,FOLLOW_27); 

            				newLeafNode(otherlv_2, grammarAccess.getVLSUniversalQuantifierAccess().getLeftSquareBracketKeyword_1_1());
            			
            // InternalVampireLanguage.g:1379:4: ( (lv_variables_3_0= ruleVLSVariable ) )
            // InternalVampireLanguage.g:1380:5: (lv_variables_3_0= ruleVLSVariable )
            {
            // InternalVampireLanguage.g:1380:5: (lv_variables_3_0= ruleVLSVariable )
            // InternalVampireLanguage.g:1381:6: lv_variables_3_0= ruleVLSVariable
            {

            						newCompositeNode(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_7);
            lv_variables_3_0=ruleVLSVariable();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getVLSUniversalQuantifierRule());
            						}
            						add(
            							current,
            							"variables",
            							lv_variables_3_0,
            							"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSVariable");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalVampireLanguage.g:1398:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalVampireLanguage.g:1399:5: otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_27); 

            	    					newLeafNode(otherlv_4, grammarAccess.getVLSUniversalQuantifierAccess().getCommaKeyword_1_3_0());
            	    				
            	    // InternalVampireLanguage.g:1403:5: ( (lv_variables_5_0= ruleVLSVariable ) )
            	    // InternalVampireLanguage.g:1404:6: (lv_variables_5_0= ruleVLSVariable )
            	    {
            	    // InternalVampireLanguage.g:1404:6: (lv_variables_5_0= ruleVLSVariable )
            	    // InternalVampireLanguage.g:1405:7: lv_variables_5_0= ruleVLSVariable
            	    {

            	    							newCompositeNode(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_3_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_variables_5_0=ruleVLSVariable();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVLSUniversalQuantifierRule());
            	    							}
            	    							add(
            	    								current,
            	    								"variables",
            	    								lv_variables_5_0,
            	    								"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSVariable");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_28); 

            				newLeafNode(otherlv_6, grammarAccess.getVLSUniversalQuantifierAccess().getRightSquareBracketKeyword_1_4());
            			
            otherlv_7=(Token)match(input,63,FOLLOW_13); 

            				newLeafNode(otherlv_7, grammarAccess.getVLSUniversalQuantifierAccess().getColonKeyword_1_5());
            			

            }

            // InternalVampireLanguage.g:1432:3: ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:1433:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:1433:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:1434:5: lv_operand_8_0= ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:1455:1: entryRuleVLSExistentialQuantifier returns [EObject current=null] : iv_ruleVLSExistentialQuantifier= ruleVLSExistentialQuantifier EOF ;
    public final EObject entryRuleVLSExistentialQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSExistentialQuantifier = null;


        try {
            // InternalVampireLanguage.g:1455:65: (iv_ruleVLSExistentialQuantifier= ruleVLSExistentialQuantifier EOF )
            // InternalVampireLanguage.g:1456:2: iv_ruleVLSExistentialQuantifier= ruleVLSExistentialQuantifier EOF
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
    // InternalVampireLanguage.g:1462:1: ruleVLSExistentialQuantifier returns [EObject current=null] : ( () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) ;
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
            // InternalVampireLanguage.g:1468:2: ( ( () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) )
            // InternalVampireLanguage.g:1469:2: ( () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            {
            // InternalVampireLanguage.g:1469:2: ( () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            // InternalVampireLanguage.g:1470:3: () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            {
            // InternalVampireLanguage.g:1470:3: ()
            // InternalVampireLanguage.g:1471:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSExistentialQuantifierAccess().getVLSExistentialQuantifierAction_0(),
            					current);
            			

            }

            // InternalVampireLanguage.g:1477:3: (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' )
            // InternalVampireLanguage.g:1478:4: otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':'
            {
            otherlv_1=(Token)match(input,64,FOLLOW_26); 

            				newLeafNode(otherlv_1, grammarAccess.getVLSExistentialQuantifierAccess().getQuestionMarkKeyword_1_0());
            			
            otherlv_2=(Token)match(input,53,FOLLOW_27); 

            				newLeafNode(otherlv_2, grammarAccess.getVLSExistentialQuantifierAccess().getLeftSquareBracketKeyword_1_1());
            			
            // InternalVampireLanguage.g:1486:4: ( (lv_variables_3_0= ruleVLSVariable ) )
            // InternalVampireLanguage.g:1487:5: (lv_variables_3_0= ruleVLSVariable )
            {
            // InternalVampireLanguage.g:1487:5: (lv_variables_3_0= ruleVLSVariable )
            // InternalVampireLanguage.g:1488:6: lv_variables_3_0= ruleVLSVariable
            {

            						newCompositeNode(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_7);
            lv_variables_3_0=ruleVLSVariable();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getVLSExistentialQuantifierRule());
            						}
            						add(
            							current,
            							"variables",
            							lv_variables_3_0,
            							"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSVariable");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalVampireLanguage.g:1505:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalVampireLanguage.g:1506:5: otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_27); 

            	    					newLeafNode(otherlv_4, grammarAccess.getVLSExistentialQuantifierAccess().getCommaKeyword_1_3_0());
            	    				
            	    // InternalVampireLanguage.g:1510:5: ( (lv_variables_5_0= ruleVLSVariable ) )
            	    // InternalVampireLanguage.g:1511:6: (lv_variables_5_0= ruleVLSVariable )
            	    {
            	    // InternalVampireLanguage.g:1511:6: (lv_variables_5_0= ruleVLSVariable )
            	    // InternalVampireLanguage.g:1512:7: lv_variables_5_0= ruleVLSVariable
            	    {

            	    							newCompositeNode(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesVLSVariableParserRuleCall_1_3_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_variables_5_0=ruleVLSVariable();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVLSExistentialQuantifierRule());
            	    							}
            	    							add(
            	    								current,
            	    								"variables",
            	    								lv_variables_5_0,
            	    								"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSVariable");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_28); 

            				newLeafNode(otherlv_6, grammarAccess.getVLSExistentialQuantifierAccess().getRightSquareBracketKeyword_1_4());
            			
            otherlv_7=(Token)match(input,63,FOLLOW_13); 

            				newLeafNode(otherlv_7, grammarAccess.getVLSExistentialQuantifierAccess().getColonKeyword_1_5());
            			

            }

            // InternalVampireLanguage.g:1539:3: ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:1540:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:1540:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:1541:5: lv_operand_8_0= ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:1562:1: entryRuleVLSUnaryNegation returns [EObject current=null] : iv_ruleVLSUnaryNegation= ruleVLSUnaryNegation EOF ;
    public final EObject entryRuleVLSUnaryNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUnaryNegation = null;


        try {
            // InternalVampireLanguage.g:1562:57: (iv_ruleVLSUnaryNegation= ruleVLSUnaryNegation EOF )
            // InternalVampireLanguage.g:1563:2: iv_ruleVLSUnaryNegation= ruleVLSUnaryNegation EOF
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
    // InternalVampireLanguage.g:1569:1: ruleVLSUnaryNegation returns [EObject current=null] : ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) ) ;
    public final EObject ruleVLSUnaryNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1575:2: ( ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) ) )
            // InternalVampireLanguage.g:1576:2: ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) )
            {
            // InternalVampireLanguage.g:1576:2: ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) )
            // InternalVampireLanguage.g:1577:3: () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) )
            {
            // InternalVampireLanguage.g:1577:3: ()
            // InternalVampireLanguage.g:1578:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSUnaryNegationAccess().getVLSUnaryNegationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getVLSUnaryNegationAccess().getTildeKeyword_1());
            		
            // InternalVampireLanguage.g:1588:3: ( (lv_operand_2_0= ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:1589:4: (lv_operand_2_0= ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:1589:4: (lv_operand_2_0= ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:1590:5: lv_operand_2_0= ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:1611:1: entryRuleVLSUnaryInfix returns [EObject current=null] : iv_ruleVLSUnaryInfix= ruleVLSUnaryInfix EOF ;
    public final EObject entryRuleVLSUnaryInfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUnaryInfix = null;


        try {
            // InternalVampireLanguage.g:1611:54: (iv_ruleVLSUnaryInfix= ruleVLSUnaryInfix EOF )
            // InternalVampireLanguage.g:1612:2: iv_ruleVLSUnaryInfix= ruleVLSUnaryInfix EOF
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
    // InternalVampireLanguage.g:1618:1: ruleVLSUnaryInfix returns [EObject current=null] : (this_VLSAtomic_0= ruleVLSAtomic ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )? ) ;
    public final EObject ruleVLSUnaryInfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_VLSAtomic_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1624:2: ( (this_VLSAtomic_0= ruleVLSAtomic ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )? ) )
            // InternalVampireLanguage.g:1625:2: (this_VLSAtomic_0= ruleVLSAtomic ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )? )
            {
            // InternalVampireLanguage.g:1625:2: (this_VLSAtomic_0= ruleVLSAtomic ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )? )
            // InternalVampireLanguage.g:1626:3: this_VLSAtomic_0= ruleVLSAtomic ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )?
            {

            			newCompositeNode(grammarAccess.getVLSUnaryInfixAccess().getVLSAtomicParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_VLSAtomic_0=ruleVLSAtomic();

            state._fsp--;


            			current = this_VLSAtomic_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalVampireLanguage.g:1634:3: ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=66 && LA24_0<=68)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVampireLanguage.g:1635:4: ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) )
                    {
                    // InternalVampireLanguage.g:1635:4: ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) )
                    int alt23=3;
                    switch ( input.LA(1) ) {
                    case 66:
                        {
                        alt23=1;
                        }
                        break;
                    case 67:
                        {
                        alt23=2;
                        }
                        break;
                    case 68:
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
                            // InternalVampireLanguage.g:1636:5: ( () otherlv_2= '!=' )
                            {
                            // InternalVampireLanguage.g:1636:5: ( () otherlv_2= '!=' )
                            // InternalVampireLanguage.g:1637:6: () otherlv_2= '!='
                            {
                            // InternalVampireLanguage.g:1637:6: ()
                            // InternalVampireLanguage.g:1638:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getVLSUnaryInfixAccess().getVLSInequalityLeftAction_1_0_0_0(),
                            								current);
                            						

                            }

                            otherlv_2=(Token)match(input,66,FOLLOW_30); 

                            						newLeafNode(otherlv_2, grammarAccess.getVLSUnaryInfixAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalVampireLanguage.g:1650:5: ( () otherlv_4= '=' )
                            {
                            // InternalVampireLanguage.g:1650:5: ( () otherlv_4= '=' )
                            // InternalVampireLanguage.g:1651:6: () otherlv_4= '='
                            {
                            // InternalVampireLanguage.g:1651:6: ()
                            // InternalVampireLanguage.g:1652:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getVLSUnaryInfixAccess().getVLSEqualityLeftAction_1_0_1_0(),
                            								current);
                            						

                            }

                            otherlv_4=(Token)match(input,67,FOLLOW_30); 

                            						newLeafNode(otherlv_4, grammarAccess.getVLSUnaryInfixAccess().getEqualsSignKeyword_1_0_1_1());
                            					

                            }


                            }
                            break;
                        case 3 :
                            // InternalVampireLanguage.g:1664:5: ( () otherlv_6= ':=' )
                            {
                            // InternalVampireLanguage.g:1664:5: ( () otherlv_6= ':=' )
                            // InternalVampireLanguage.g:1665:6: () otherlv_6= ':='
                            {
                            // InternalVampireLanguage.g:1665:6: ()
                            // InternalVampireLanguage.g:1666:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getVLSUnaryInfixAccess().getVLSAssignmentLeftAction_1_0_2_0(),
                            								current);
                            						

                            }

                            otherlv_6=(Token)match(input,68,FOLLOW_30); 

                            						newLeafNode(otherlv_6, grammarAccess.getVLSUnaryInfixAccess().getColonEqualsSignKeyword_1_0_2_1());
                            					

                            }


                            }
                            break;

                    }

                    // InternalVampireLanguage.g:1678:4: ( (lv_right_7_0= ruleVLSAtomic ) )
                    // InternalVampireLanguage.g:1679:5: (lv_right_7_0= ruleVLSAtomic )
                    {
                    // InternalVampireLanguage.g:1679:5: (lv_right_7_0= ruleVLSAtomic )
                    // InternalVampireLanguage.g:1680:6: lv_right_7_0= ruleVLSAtomic
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
    // InternalVampireLanguage.g:1702:1: entryRuleVLSAtomic returns [EObject current=null] : iv_ruleVLSAtomic= ruleVLSAtomic EOF ;
    public final EObject entryRuleVLSAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAtomic = null;


        try {
            // InternalVampireLanguage.g:1702:50: (iv_ruleVLSAtomic= ruleVLSAtomic EOF )
            // InternalVampireLanguage.g:1703:2: iv_ruleVLSAtomic= ruleVLSAtomic EOF
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
    // InternalVampireLanguage.g:1709:1: ruleVLSAtomic returns [EObject current=null] : (this_VLSAtomicConstant_0= ruleVLSAtomicConstant | this_VLSAtomicFunction_1= ruleVLSAtomicFunction | this_VLSVariable_2= ruleVLSVariable | this_VLSDefinedTerm_3= ruleVLSDefinedTerm ) ;
    public final EObject ruleVLSAtomic() throws RecognitionException {
        EObject current = null;

        EObject this_VLSAtomicConstant_0 = null;

        EObject this_VLSAtomicFunction_1 = null;

        EObject this_VLSVariable_2 = null;

        EObject this_VLSDefinedTerm_3 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1715:2: ( (this_VLSAtomicConstant_0= ruleVLSAtomicConstant | this_VLSAtomicFunction_1= ruleVLSAtomicFunction | this_VLSVariable_2= ruleVLSVariable | this_VLSDefinedTerm_3= ruleVLSDefinedTerm ) )
            // InternalVampireLanguage.g:1716:2: (this_VLSAtomicConstant_0= ruleVLSAtomicConstant | this_VLSAtomicFunction_1= ruleVLSAtomicFunction | this_VLSVariable_2= ruleVLSVariable | this_VLSDefinedTerm_3= ruleVLSDefinedTerm )
            {
            // InternalVampireLanguage.g:1716:2: (this_VLSAtomicConstant_0= ruleVLSAtomicConstant | this_VLSAtomicFunction_1= ruleVLSAtomicFunction | this_VLSVariable_2= ruleVLSVariable | this_VLSDefinedTerm_3= ruleVLSDefinedTerm )
            int alt25=4;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalVampireLanguage.g:1717:3: this_VLSAtomicConstant_0= ruleVLSAtomicConstant
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
                    // InternalVampireLanguage.g:1726:3: this_VLSAtomicFunction_1= ruleVLSAtomicFunction
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
                    // InternalVampireLanguage.g:1735:3: this_VLSVariable_2= ruleVLSVariable
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
                    // InternalVampireLanguage.g:1744:3: this_VLSDefinedTerm_3= ruleVLSDefinedTerm
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
    // InternalVampireLanguage.g:1756:1: entryRuleVLSAtomicConstant returns [EObject current=null] : iv_ruleVLSAtomicConstant= ruleVLSAtomicConstant EOF ;
    public final EObject entryRuleVLSAtomicConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAtomicConstant = null;


        try {
            // InternalVampireLanguage.g:1756:58: (iv_ruleVLSAtomicConstant= ruleVLSAtomicConstant EOF )
            // InternalVampireLanguage.g:1757:2: iv_ruleVLSAtomicConstant= ruleVLSAtomicConstant EOF
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
    // InternalVampireLanguage.g:1763:1: ruleVLSAtomicConstant returns [EObject current=null] : ( ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) ) | ( () otherlv_3= '$true' ) | ( () otherlv_5= '$false' ) ) ;
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
            // InternalVampireLanguage.g:1769:2: ( ( ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) ) | ( () otherlv_3= '$true' ) | ( () otherlv_5= '$false' ) ) )
            // InternalVampireLanguage.g:1770:2: ( ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) ) | ( () otherlv_3= '$true' ) | ( () otherlv_5= '$false' ) )
            {
            // InternalVampireLanguage.g:1770:2: ( ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) ) | ( () otherlv_3= '$true' ) | ( () otherlv_5= '$false' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_SINGLE_QUOTE:
            case RULE_LOWER_WORD_ID:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt27=1;
                }
                break;
            case 69:
                {
                alt27=2;
                }
                break;
            case 70:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalVampireLanguage.g:1771:3: ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) )
                    {
                    // InternalVampireLanguage.g:1771:3: ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) )
                    // InternalVampireLanguage.g:1772:4: () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) )
                    {
                    // InternalVampireLanguage.g:1772:4: ()
                    // InternalVampireLanguage.g:1773:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSAtomicConstantAccess().getVLSConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:1779:4: ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) )
                    // InternalVampireLanguage.g:1780:5: ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) )
                    {
                    // InternalVampireLanguage.g:1780:5: ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) )
                    // InternalVampireLanguage.g:1781:6: (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:1781:6: (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole )
                    int alt26=5;
                    switch ( input.LA(1) ) {
                    case RULE_LOWER_WORD_ID:
                        {
                        alt26=1;
                        }
                        break;
                    case RULE_SINGLE_QUOTE:
                        {
                        alt26=2;
                        }
                        break;
                    case RULE_DOLLAR_ID:
                        {
                        alt26=3;
                        }
                        break;
                    case RULE_DOUBLE_DOLLAR_ID:
                        {
                        alt26=4;
                        }
                        break;
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                        {
                        alt26=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }

                    switch (alt26) {
                        case 1 :
                            // InternalVampireLanguage.g:1782:7: lv_name_1_1= RULE_LOWER_WORD_ID
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
                            // InternalVampireLanguage.g:1797:7: lv_name_1_2= RULE_SINGLE_QUOTE
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
                            // InternalVampireLanguage.g:1812:7: lv_name_1_3= RULE_DOLLAR_ID
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
                            // InternalVampireLanguage.g:1827:7: lv_name_1_4= RULE_DOUBLE_DOLLAR_ID
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
                            // InternalVampireLanguage.g:1842:7: lv_name_1_5= ruleVLSRole
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
                    // InternalVampireLanguage.g:1862:3: ( () otherlv_3= '$true' )
                    {
                    // InternalVampireLanguage.g:1862:3: ( () otherlv_3= '$true' )
                    // InternalVampireLanguage.g:1863:4: () otherlv_3= '$true'
                    {
                    // InternalVampireLanguage.g:1863:4: ()
                    // InternalVampireLanguage.g:1864:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSAtomicConstantAccess().getVLSTrueAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,69,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getVLSAtomicConstantAccess().getTrueKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1876:3: ( () otherlv_5= '$false' )
                    {
                    // InternalVampireLanguage.g:1876:3: ( () otherlv_5= '$false' )
                    // InternalVampireLanguage.g:1877:4: () otherlv_5= '$false'
                    {
                    // InternalVampireLanguage.g:1877:4: ()
                    // InternalVampireLanguage.g:1878:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSAtomicConstantAccess().getVLSFalseAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,70,FOLLOW_2); 

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
    // InternalVampireLanguage.g:1893:1: entryRuleVLSAtomicFunction returns [EObject current=null] : iv_ruleVLSAtomicFunction= ruleVLSAtomicFunction EOF ;
    public final EObject entryRuleVLSAtomicFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAtomicFunction = null;


        try {
            // InternalVampireLanguage.g:1893:58: (iv_ruleVLSAtomicFunction= ruleVLSAtomicFunction EOF )
            // InternalVampireLanguage.g:1894:2: iv_ruleVLSAtomicFunction= ruleVLSAtomicFunction EOF
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
    // InternalVampireLanguage.g:1900:1: ruleVLSAtomicFunction returns [EObject current=null] : ( ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) ) | ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' ) ) ;
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
            // InternalVampireLanguage.g:1906:2: ( ( ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) ) | ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' ) ) )
            // InternalVampireLanguage.g:1907:2: ( ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) ) | ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' ) )
            {
            // InternalVampireLanguage.g:1907:2: ( ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) ) | ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_SINGLE_QUOTE && LA30_0<=RULE_LOWER_WORD_ID)||(LA30_0>=RULE_DOLLAR_ID && LA30_0<=RULE_DOUBLE_DOLLAR_ID)||(LA30_0>=38 && LA30_0<=52)) ) {
                alt30=1;
            }
            else if ( (LA30_0==71) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalVampireLanguage.g:1908:3: ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) )
                    {
                    // InternalVampireLanguage.g:1908:3: ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) )
                    // InternalVampireLanguage.g:1909:4: () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )
                    {
                    // InternalVampireLanguage.g:1909:4: ()
                    // InternalVampireLanguage.g:1910:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSAtomicFunctionAccess().getVLSFunctionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:1916:4: ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) )
                    // InternalVampireLanguage.g:1917:5: ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) )
                    {
                    // InternalVampireLanguage.g:1917:5: ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) )
                    // InternalVampireLanguage.g:1918:6: (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:1918:6: (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole )
                    int alt28=5;
                    switch ( input.LA(1) ) {
                    case RULE_LOWER_WORD_ID:
                        {
                        alt28=1;
                        }
                        break;
                    case RULE_SINGLE_QUOTE:
                        {
                        alt28=2;
                        }
                        break;
                    case RULE_DOLLAR_ID:
                        {
                        alt28=3;
                        }
                        break;
                    case RULE_DOUBLE_DOLLAR_ID:
                        {
                        alt28=4;
                        }
                        break;
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                        {
                        alt28=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }

                    switch (alt28) {
                        case 1 :
                            // InternalVampireLanguage.g:1919:7: lv_constant_1_1= RULE_LOWER_WORD_ID
                            {
                            lv_constant_1_1=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_9); 

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
                            // InternalVampireLanguage.g:1934:7: lv_constant_1_2= RULE_SINGLE_QUOTE
                            {
                            lv_constant_1_2=(Token)match(input,RULE_SINGLE_QUOTE,FOLLOW_9); 

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
                            // InternalVampireLanguage.g:1949:7: lv_constant_1_3= RULE_DOLLAR_ID
                            {
                            lv_constant_1_3=(Token)match(input,RULE_DOLLAR_ID,FOLLOW_9); 

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
                            // InternalVampireLanguage.g:1964:7: lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID
                            {
                            lv_constant_1_4=(Token)match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_9); 

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
                            // InternalVampireLanguage.g:1979:7: lv_constant_1_5= ruleVLSRole
                            {

                            							newCompositeNode(grammarAccess.getVLSAtomicFunctionAccess().getConstantVLSRoleParserRuleCall_0_1_0_4());
                            						
                            pushFollow(FOLLOW_9);
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

                    // InternalVampireLanguage.g:1997:4: (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )
                    // InternalVampireLanguage.g:1998:5: otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_30); 

                    					newLeafNode(otherlv_2, grammarAccess.getVLSAtomicFunctionAccess().getLeftParenthesisKeyword_0_2_0());
                    				
                    // InternalVampireLanguage.g:2002:5: ( (lv_terms_3_0= ruleVLSFofTerm ) )
                    // InternalVampireLanguage.g:2003:6: (lv_terms_3_0= ruleVLSFofTerm )
                    {
                    // InternalVampireLanguage.g:2003:6: (lv_terms_3_0= ruleVLSFofTerm )
                    // InternalVampireLanguage.g:2004:7: lv_terms_3_0= ruleVLSFofTerm
                    {

                    							newCompositeNode(grammarAccess.getVLSAtomicFunctionAccess().getTermsVLSFofTermParserRuleCall_0_2_1_0());
                    						
                    pushFollow(FOLLOW_14);
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

                    // InternalVampireLanguage.g:2021:5: (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==29) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:2022:6: otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FOLLOW_30); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getVLSAtomicFunctionAccess().getCommaKeyword_0_2_2_0());
                    	    					
                    	    // InternalVampireLanguage.g:2026:6: ( (lv_terms_5_0= ruleVLSFofTerm ) )
                    	    // InternalVampireLanguage.g:2027:7: (lv_terms_5_0= ruleVLSFofTerm )
                    	    {
                    	    // InternalVampireLanguage.g:2027:7: (lv_terms_5_0= ruleVLSFofTerm )
                    	    // InternalVampireLanguage.g:2028:8: lv_terms_5_0= ruleVLSFofTerm
                    	    {

                    	    								newCompositeNode(grammarAccess.getVLSAtomicFunctionAccess().getTermsVLSFofTermParserRuleCall_0_2_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getVLSAtomicFunctionAccess().getRightParenthesisKeyword_0_2_3());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:2053:3: ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' )
                    {
                    // InternalVampireLanguage.g:2053:3: ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' )
                    // InternalVampireLanguage.g:2054:4: () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')'
                    {
                    // InternalVampireLanguage.g:2054:4: ()
                    // InternalVampireLanguage.g:2055:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSAtomicFunctionAccess().getVLSLessAction_1_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:2061:4: ( (lv_name_8_0= '$less' ) )
                    // InternalVampireLanguage.g:2062:5: (lv_name_8_0= '$less' )
                    {
                    // InternalVampireLanguage.g:2062:5: (lv_name_8_0= '$less' )
                    // InternalVampireLanguage.g:2063:6: lv_name_8_0= '$less'
                    {
                    lv_name_8_0=(Token)match(input,71,FOLLOW_9); 

                    						newLeafNode(lv_name_8_0, grammarAccess.getVLSAtomicFunctionAccess().getNameLessKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSAtomicFunctionRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_8_0, "$less");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,34,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getVLSAtomicFunctionAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalVampireLanguage.g:2079:4: ( (lv_terms_10_0= ruleVLSFofTerm ) )
                    // InternalVampireLanguage.g:2080:5: (lv_terms_10_0= ruleVLSFofTerm )
                    {
                    // InternalVampireLanguage.g:2080:5: (lv_terms_10_0= ruleVLSFofTerm )
                    // InternalVampireLanguage.g:2081:6: lv_terms_10_0= ruleVLSFofTerm
                    {

                    						newCompositeNode(grammarAccess.getVLSAtomicFunctionAccess().getTermsVLSFofTermParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_11=(Token)match(input,29,FOLLOW_30); 

                    				newLeafNode(otherlv_11, grammarAccess.getVLSAtomicFunctionAccess().getCommaKeyword_1_4());
                    			
                    // InternalVampireLanguage.g:2102:4: ( (lv_terms_12_0= ruleVLSFofTerm ) )
                    // InternalVampireLanguage.g:2103:5: (lv_terms_12_0= ruleVLSFofTerm )
                    {
                    // InternalVampireLanguage.g:2103:5: (lv_terms_12_0= ruleVLSFofTerm )
                    // InternalVampireLanguage.g:2104:6: lv_terms_12_0= ruleVLSFofTerm
                    {

                    						newCompositeNode(grammarAccess.getVLSAtomicFunctionAccess().getTermsVLSFofTermParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    otherlv_13=(Token)match(input,35,FOLLOW_2); 

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
    // InternalVampireLanguage.g:2130:1: entryRuleVLSVariable returns [EObject current=null] : iv_ruleVLSVariable= ruleVLSVariable EOF ;
    public final EObject entryRuleVLSVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSVariable = null;


        try {
            // InternalVampireLanguage.g:2130:52: (iv_ruleVLSVariable= ruleVLSVariable EOF )
            // InternalVampireLanguage.g:2131:2: iv_ruleVLSVariable= ruleVLSVariable EOF
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
    // InternalVampireLanguage.g:2137:1: ruleVLSVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_UPPER_WORD_ID ) ) ;
    public final EObject ruleVLSVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:2143:2: ( ( (lv_name_0_0= RULE_UPPER_WORD_ID ) ) )
            // InternalVampireLanguage.g:2144:2: ( (lv_name_0_0= RULE_UPPER_WORD_ID ) )
            {
            // InternalVampireLanguage.g:2144:2: ( (lv_name_0_0= RULE_UPPER_WORD_ID ) )
            // InternalVampireLanguage.g:2145:3: (lv_name_0_0= RULE_UPPER_WORD_ID )
            {
            // InternalVampireLanguage.g:2145:3: (lv_name_0_0= RULE_UPPER_WORD_ID )
            // InternalVampireLanguage.g:2146:4: lv_name_0_0= RULE_UPPER_WORD_ID
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
    // InternalVampireLanguage.g:2165:1: entryRuleVLSFofTerm returns [EObject current=null] : iv_ruleVLSFofTerm= ruleVLSFofTerm EOF ;
    public final EObject entryRuleVLSFofTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFofTerm = null;


        try {
            // InternalVampireLanguage.g:2165:51: (iv_ruleVLSFofTerm= ruleVLSFofTerm EOF )
            // InternalVampireLanguage.g:2166:2: iv_ruleVLSFofTerm= ruleVLSFofTerm EOF
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
    // InternalVampireLanguage.g:2172:1: ruleVLSFofTerm returns [EObject current=null] : (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionFof_1= ruleVLSFunctionFof | this_VLSDefinedTerm_2= ruleVLSDefinedTerm ) ;
    public final EObject ruleVLSFofTerm() throws RecognitionException {
        EObject current = null;

        EObject this_VLSVariable_0 = null;

        EObject this_VLSFunctionFof_1 = null;

        EObject this_VLSDefinedTerm_2 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:2178:2: ( (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionFof_1= ruleVLSFunctionFof | this_VLSDefinedTerm_2= ruleVLSDefinedTerm ) )
            // InternalVampireLanguage.g:2179:2: (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionFof_1= ruleVLSFunctionFof | this_VLSDefinedTerm_2= ruleVLSDefinedTerm )
            {
            // InternalVampireLanguage.g:2179:2: (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionFof_1= ruleVLSFunctionFof | this_VLSDefinedTerm_2= ruleVLSDefinedTerm )
            int alt31=3;
            switch ( input.LA(1) ) {
            case RULE_UPPER_WORD_ID:
                {
                alt31=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
            case RULE_LOWER_WORD_ID:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt31=2;
                }
                break;
            case RULE_SIGNED_LITERAL:
            case RULE_SIGNED_REAL_ID:
            case RULE_SIGNED_RAT_ID:
            case RULE_DOUBLE_QUOTE:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalVampireLanguage.g:2180:3: this_VLSVariable_0= ruleVLSVariable
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
                    // InternalVampireLanguage.g:2189:3: this_VLSFunctionFof_1= ruleVLSFunctionFof
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
                    // InternalVampireLanguage.g:2198:3: this_VLSDefinedTerm_2= ruleVLSDefinedTerm
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


    // $ANTLR start "entryRuleVLSFunctionFof"
    // InternalVampireLanguage.g:2210:1: entryRuleVLSFunctionFof returns [EObject current=null] : iv_ruleVLSFunctionFof= ruleVLSFunctionFof EOF ;
    public final EObject entryRuleVLSFunctionFof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFunctionFof = null;


        try {
            // InternalVampireLanguage.g:2210:55: (iv_ruleVLSFunctionFof= ruleVLSFunctionFof EOF )
            // InternalVampireLanguage.g:2211:2: iv_ruleVLSFunctionFof= ruleVLSFunctionFof EOF
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
    // InternalVampireLanguage.g:2217:1: ruleVLSFunctionFof returns [EObject current=null] : ( ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleVLSFunctionFof() throws RecognitionException {
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
            // InternalVampireLanguage.g:2223:2: ( ( ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? ) )
            // InternalVampireLanguage.g:2224:2: ( ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? )
            {
            // InternalVampireLanguage.g:2224:2: ( ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? )
            // InternalVampireLanguage.g:2225:3: ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )?
            {
            // InternalVampireLanguage.g:2225:3: ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) )
            // InternalVampireLanguage.g:2226:4: ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) )
            {
            // InternalVampireLanguage.g:2226:4: ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) )
            // InternalVampireLanguage.g:2227:5: (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID )
            {
            // InternalVampireLanguage.g:2227:5: (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID )
            int alt32=4;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt32=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt32=2;
                }
                break;
            case RULE_DOLLAR_ID:
                {
                alt32=3;
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalVampireLanguage.g:2228:6: lv_functor_0_1= RULE_LOWER_WORD_ID
                    {
                    lv_functor_0_1=(Token)match(input,RULE_LOWER_WORD_ID,FOLLOW_31); 

                    						newLeafNode(lv_functor_0_1, grammarAccess.getVLSFunctionFofAccess().getFunctorLOWER_WORD_IDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFunctionFofRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"functor",
                    							lv_functor_0_1,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.LOWER_WORD_ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:2243:6: lv_functor_0_2= RULE_SINGLE_QUOTE
                    {
                    lv_functor_0_2=(Token)match(input,RULE_SINGLE_QUOTE,FOLLOW_31); 

                    						newLeafNode(lv_functor_0_2, grammarAccess.getVLSFunctionFofAccess().getFunctorSINGLE_QUOTETerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFunctionFofRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"functor",
                    							lv_functor_0_2,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.SINGLE_QUOTE");
                    					

                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:2258:6: lv_functor_0_3= RULE_DOLLAR_ID
                    {
                    lv_functor_0_3=(Token)match(input,RULE_DOLLAR_ID,FOLLOW_31); 

                    						newLeafNode(lv_functor_0_3, grammarAccess.getVLSFunctionFofAccess().getFunctorDOLLAR_IDTerminalRuleCall_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFunctionFofRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"functor",
                    							lv_functor_0_3,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.DOLLAR_ID");
                    					

                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:2273:6: lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID
                    {
                    lv_functor_0_4=(Token)match(input,RULE_DOUBLE_DOLLAR_ID,FOLLOW_31); 

                    						newLeafNode(lv_functor_0_4, grammarAccess.getVLSFunctionFofAccess().getFunctorDOUBLE_DOLLAR_IDTerminalRuleCall_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSFunctionFofRule());
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

            // InternalVampireLanguage.g:2290:3: (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVampireLanguage.g:2291:4: otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getVLSFunctionFofAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalVampireLanguage.g:2295:4: ( (lv_terms_2_0= ruleVLSFofTerm ) )
                    // InternalVampireLanguage.g:2296:5: (lv_terms_2_0= ruleVLSFofTerm )
                    {
                    // InternalVampireLanguage.g:2296:5: (lv_terms_2_0= ruleVLSFofTerm )
                    // InternalVampireLanguage.g:2297:6: lv_terms_2_0= ruleVLSFofTerm
                    {

                    						newCompositeNode(grammarAccess.getVLSFunctionFofAccess().getTermsVLSFofTermParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_terms_2_0=ruleVLSFofTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVLSFunctionFofRule());
                    						}
                    						add(
                    							current,
                    							"terms",
                    							lv_terms_2_0,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.VLSFofTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVampireLanguage.g:2314:4: (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==29) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:2315:5: otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FOLLOW_30); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getVLSFunctionFofAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalVampireLanguage.g:2319:5: ( (lv_terms_4_0= ruleVLSFofTerm ) )
                    	    // InternalVampireLanguage.g:2320:6: (lv_terms_4_0= ruleVLSFofTerm )
                    	    {
                    	    // InternalVampireLanguage.g:2320:6: (lv_terms_4_0= ruleVLSFofTerm )
                    	    // InternalVampireLanguage.g:2321:7: lv_terms_4_0= ruleVLSFofTerm
                    	    {

                    	    							newCompositeNode(grammarAccess.getVLSFunctionFofAccess().getTermsVLSFofTermParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_terms_4_0=ruleVLSFofTerm();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVLSFunctionFofRule());
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
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,35,FOLLOW_2); 

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
    // InternalVampireLanguage.g:2348:1: entryRuleVLSDefinedTerm returns [EObject current=null] : iv_ruleVLSDefinedTerm= ruleVLSDefinedTerm EOF ;
    public final EObject entryRuleVLSDefinedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSDefinedTerm = null;


        try {
            // InternalVampireLanguage.g:2348:55: (iv_ruleVLSDefinedTerm= ruleVLSDefinedTerm EOF )
            // InternalVampireLanguage.g:2349:2: iv_ruleVLSDefinedTerm= ruleVLSDefinedTerm EOF
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
    // InternalVampireLanguage.g:2355:1: ruleVLSDefinedTerm returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) ) | ( () ( (lv_value_3_0= RULE_SIGNED_REAL_ID ) ) ) | ( () ( (lv_value_5_0= RULE_SIGNED_RAT_ID ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE_QUOTE ) ) ) ) ;
    public final EObject ruleVLSDefinedTerm() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:2361:2: ( ( ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) ) | ( () ( (lv_value_3_0= RULE_SIGNED_REAL_ID ) ) ) | ( () ( (lv_value_5_0= RULE_SIGNED_RAT_ID ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE_QUOTE ) ) ) ) )
            // InternalVampireLanguage.g:2362:2: ( ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) ) | ( () ( (lv_value_3_0= RULE_SIGNED_REAL_ID ) ) ) | ( () ( (lv_value_5_0= RULE_SIGNED_RAT_ID ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE_QUOTE ) ) ) )
            {
            // InternalVampireLanguage.g:2362:2: ( ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) ) | ( () ( (lv_value_3_0= RULE_SIGNED_REAL_ID ) ) ) | ( () ( (lv_value_5_0= RULE_SIGNED_RAT_ID ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE_QUOTE ) ) ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_LITERAL:
                {
                alt35=1;
                }
                break;
            case RULE_SIGNED_REAL_ID:
                {
                alt35=2;
                }
                break;
            case RULE_SIGNED_RAT_ID:
                {
                alt35=3;
                }
                break;
            case RULE_DOUBLE_QUOTE:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalVampireLanguage.g:2363:3: ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) )
                    {
                    // InternalVampireLanguage.g:2363:3: ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) )
                    // InternalVampireLanguage.g:2364:4: () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) )
                    {
                    // InternalVampireLanguage.g:2364:4: ()
                    // InternalVampireLanguage.g:2365:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSDefinedTermAccess().getVLSIntAction_0_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:2371:4: ( (lv_value_1_0= RULE_SIGNED_LITERAL ) )
                    // InternalVampireLanguage.g:2372:5: (lv_value_1_0= RULE_SIGNED_LITERAL )
                    {
                    // InternalVampireLanguage.g:2372:5: (lv_value_1_0= RULE_SIGNED_LITERAL )
                    // InternalVampireLanguage.g:2373:6: lv_value_1_0= RULE_SIGNED_LITERAL
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
                    // InternalVampireLanguage.g:2391:3: ( () ( (lv_value_3_0= RULE_SIGNED_REAL_ID ) ) )
                    {
                    // InternalVampireLanguage.g:2391:3: ( () ( (lv_value_3_0= RULE_SIGNED_REAL_ID ) ) )
                    // InternalVampireLanguage.g:2392:4: () ( (lv_value_3_0= RULE_SIGNED_REAL_ID ) )
                    {
                    // InternalVampireLanguage.g:2392:4: ()
                    // InternalVampireLanguage.g:2393:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSDefinedTermAccess().getVLSRealAction_1_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:2399:4: ( (lv_value_3_0= RULE_SIGNED_REAL_ID ) )
                    // InternalVampireLanguage.g:2400:5: (lv_value_3_0= RULE_SIGNED_REAL_ID )
                    {
                    // InternalVampireLanguage.g:2400:5: (lv_value_3_0= RULE_SIGNED_REAL_ID )
                    // InternalVampireLanguage.g:2401:6: lv_value_3_0= RULE_SIGNED_REAL_ID
                    {
                    lv_value_3_0=(Token)match(input,RULE_SIGNED_REAL_ID,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getVLSDefinedTermAccess().getValueSIGNED_REAL_IDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSDefinedTermRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.SIGNED_REAL_ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:2419:3: ( () ( (lv_value_5_0= RULE_SIGNED_RAT_ID ) ) )
                    {
                    // InternalVampireLanguage.g:2419:3: ( () ( (lv_value_5_0= RULE_SIGNED_RAT_ID ) ) )
                    // InternalVampireLanguage.g:2420:4: () ( (lv_value_5_0= RULE_SIGNED_RAT_ID ) )
                    {
                    // InternalVampireLanguage.g:2420:4: ()
                    // InternalVampireLanguage.g:2421:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSDefinedTermAccess().getVLSRationalAction_2_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:2427:4: ( (lv_value_5_0= RULE_SIGNED_RAT_ID ) )
                    // InternalVampireLanguage.g:2428:5: (lv_value_5_0= RULE_SIGNED_RAT_ID )
                    {
                    // InternalVampireLanguage.g:2428:5: (lv_value_5_0= RULE_SIGNED_RAT_ID )
                    // InternalVampireLanguage.g:2429:6: lv_value_5_0= RULE_SIGNED_RAT_ID
                    {
                    lv_value_5_0=(Token)match(input,RULE_SIGNED_RAT_ID,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getVLSDefinedTermAccess().getValueSIGNED_RAT_IDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSDefinedTermRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"ca.mcgill.ecse.dslreasoner.VampireLanguage.SIGNED_RAT_ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalVampireLanguage.g:2447:3: ( () ( (lv_value_7_0= RULE_DOUBLE_QUOTE ) ) )
                    {
                    // InternalVampireLanguage.g:2447:3: ( () ( (lv_value_7_0= RULE_DOUBLE_QUOTE ) ) )
                    // InternalVampireLanguage.g:2448:4: () ( (lv_value_7_0= RULE_DOUBLE_QUOTE ) )
                    {
                    // InternalVampireLanguage.g:2448:4: ()
                    // InternalVampireLanguage.g:2449:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSDefinedTermAccess().getVLSDoubleQuoteAction_3_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:2455:4: ( (lv_value_7_0= RULE_DOUBLE_QUOTE ) )
                    // InternalVampireLanguage.g:2456:5: (lv_value_7_0= RULE_DOUBLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:2456:5: (lv_value_7_0= RULE_DOUBLE_QUOTE )
                    // InternalVampireLanguage.g:2457:6: lv_value_7_0= RULE_DOUBLE_QUOTE
                    {
                    lv_value_7_0=(Token)match(input,RULE_DOUBLE_QUOTE,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getVLSDefinedTermAccess().getValueDOUBLE_QUOTETerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSDefinedTermRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_7_0,
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


    protected DFA25 dfa25 = new DFA25(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\uffff\23\24\4\uffff";
    static final String dfa_3s = "\1\4\23\35\4\uffff";
    static final String dfa_4s = "\1\107\23\104\4\uffff";
    static final String dfa_5s = "\24\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_6s = "\30\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\1\1\uffff\1\27\1\uffff\1\3\1\4\1\26\3\27\27\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\20\uffff\2\24\1\25",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
            "\1\24\4\uffff\1\25\1\24\22\uffff\10\24\4\uffff\3\24",
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

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1716:2: (this_VLSAtomicConstant_0= ruleVLSAtomicConstant | this_VLSAtomicFunction_1= ruleVLSAtomicFunction | this_VLSVariable_2= ruleVLSVariable | this_VLSDefinedTerm_3= ruleVLSDefinedTerm )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002388000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x001FFFC000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x401FFFC400007EB0L,0x00000000000000E3L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x003FFFCC40000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x001FFFC440000032L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000440000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x003FFFC460000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x3FC0000000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001CL});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x001FFFC000007EB0L,0x00000000000000E0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000002L});

}