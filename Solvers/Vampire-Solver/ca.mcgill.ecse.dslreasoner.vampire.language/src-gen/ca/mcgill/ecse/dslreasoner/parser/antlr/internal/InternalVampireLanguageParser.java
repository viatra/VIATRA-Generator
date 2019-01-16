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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SINGLE_QUOTE", "RULE_LOWER_WORD_ID", "RULE_LITERAL", "RULE_SIGNED_LITERAL", "RULE_SINGLE_COMMENT", "RULE_DOLLAR_ID", "RULE_DOUBLE_DOLLAR_ID", "RULE_UPPER_WORD_ID", "RULE_SIGNED_REAL_ID", "RULE_SIGNED_RAT_ID", "RULE_DOUBLE_QUOTE", "RULE_ALPHA_NUMERIC", "RULE_SIGN", "RULE_INT", "RULE_UNSIGNED_REAL_FRAC_ID", "RULE_UNSIGNED_REAL_EXP_ID", "RULE_UNSIGNED_RAT_ID", "RULE_ID", "RULE_ANY_OTHER", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'include('", "',['", "','", "']'", "'%'", "'fof'", "'('", "')'", "'.'", "'axiom'", "'conjecture'", "'hypothesis'", "'definition'", "'assumption'", "'lemma'", "'theorem'", "'corollary'", "'negated_conjecture'", "'plain'", "'type'", "'fi_domain'", "'fi_functors'", "'fi_predicates'", "'unknown'", "'['", "'<=>'", "'=>'", "'<='", "'<~>'", "'~|'", "'~&'", "'&'", "'|'", "'!'", "':'", "'?'", "'~'", "'!='", "'='", "':='", "'$true'", "'$false'", "'$less'"
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
    // InternalVampireLanguage.g:71:1: ruleVampireModel returns [EObject current=null] : ( ( (lv_includes_0_0= ruleVLSInclude ) ) | ( (lv_comments_1_0= ruleVLSComment ) ) | ( (lv_formulas_2_0= ruleVLSFofFormula ) ) )* ;
    public final EObject ruleVampireModel() throws RecognitionException {
        EObject current = null;

        EObject lv_includes_0_0 = null;

        EObject lv_comments_1_0 = null;

        EObject lv_formulas_2_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:77:2: ( ( ( (lv_includes_0_0= ruleVLSInclude ) ) | ( (lv_comments_1_0= ruleVLSComment ) ) | ( (lv_formulas_2_0= ruleVLSFofFormula ) ) )* )
            // InternalVampireLanguage.g:78:2: ( ( (lv_includes_0_0= ruleVLSInclude ) ) | ( (lv_comments_1_0= ruleVLSComment ) ) | ( (lv_formulas_2_0= ruleVLSFofFormula ) ) )*
            {
            // InternalVampireLanguage.g:78:2: ( ( (lv_includes_0_0= ruleVLSInclude ) ) | ( (lv_comments_1_0= ruleVLSComment ) ) | ( (lv_formulas_2_0= ruleVLSFofFormula ) ) )*
            loop1:
            do {
                int alt1=4;
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
    // InternalVampireLanguage.g:142:1: entryRuleVLSInclude returns [EObject current=null] : iv_ruleVLSInclude= ruleVLSInclude EOF ;
    public final EObject entryRuleVLSInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSInclude = null;


        try {
            // InternalVampireLanguage.g:142:51: (iv_ruleVLSInclude= ruleVLSInclude EOF )
            // InternalVampireLanguage.g:143:2: iv_ruleVLSInclude= ruleVLSInclude EOF
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
    // InternalVampireLanguage.g:149:1: ruleVLSInclude returns [EObject current=null] : (otherlv_0= 'include(' ( (lv_fileName_1_0= RULE_SINGLE_QUOTE ) ) (otherlv_2= ',[' ( (lv_names_3_0= ruleVLSName ) ) (otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) ) )* otherlv_6= ']' )? ) ;
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
            // InternalVampireLanguage.g:155:2: ( (otherlv_0= 'include(' ( (lv_fileName_1_0= RULE_SINGLE_QUOTE ) ) (otherlv_2= ',[' ( (lv_names_3_0= ruleVLSName ) ) (otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) ) )* otherlv_6= ']' )? ) )
            // InternalVampireLanguage.g:156:2: (otherlv_0= 'include(' ( (lv_fileName_1_0= RULE_SINGLE_QUOTE ) ) (otherlv_2= ',[' ( (lv_names_3_0= ruleVLSName ) ) (otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) ) )* otherlv_6= ']' )? )
            {
            // InternalVampireLanguage.g:156:2: (otherlv_0= 'include(' ( (lv_fileName_1_0= RULE_SINGLE_QUOTE ) ) (otherlv_2= ',[' ( (lv_names_3_0= ruleVLSName ) ) (otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) ) )* otherlv_6= ']' )? )
            // InternalVampireLanguage.g:157:3: otherlv_0= 'include(' ( (lv_fileName_1_0= RULE_SINGLE_QUOTE ) ) (otherlv_2= ',[' ( (lv_names_3_0= ruleVLSName ) ) (otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) ) )* otherlv_6= ']' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVLSIncludeAccess().getIncludeKeyword_0());
            		
            // InternalVampireLanguage.g:161:3: ( (lv_fileName_1_0= RULE_SINGLE_QUOTE ) )
            // InternalVampireLanguage.g:162:4: (lv_fileName_1_0= RULE_SINGLE_QUOTE )
            {
            // InternalVampireLanguage.g:162:4: (lv_fileName_1_0= RULE_SINGLE_QUOTE )
            // InternalVampireLanguage.g:163:5: lv_fileName_1_0= RULE_SINGLE_QUOTE
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

            // InternalVampireLanguage.g:179:3: (otherlv_2= ',[' ( (lv_names_3_0= ruleVLSName ) ) (otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) ) )* otherlv_6= ']' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalVampireLanguage.g:180:4: otherlv_2= ',[' ( (lv_names_3_0= ruleVLSName ) ) (otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) ) )* otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getVLSIncludeAccess().getCommaLeftSquareBracketKeyword_2_0());
                    			
                    // InternalVampireLanguage.g:184:4: ( (lv_names_3_0= ruleVLSName ) )
                    // InternalVampireLanguage.g:185:5: (lv_names_3_0= ruleVLSName )
                    {
                    // InternalVampireLanguage.g:185:5: (lv_names_3_0= ruleVLSName )
                    // InternalVampireLanguage.g:186:6: lv_names_3_0= ruleVLSName
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

                    // InternalVampireLanguage.g:203:4: (otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==29) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:204:5: otherlv_4= ',' ( (lv_names_5_0= ruleVLSName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getVLSIncludeAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalVampireLanguage.g:208:5: ( (lv_names_5_0= ruleVLSName ) )
                    	    // InternalVampireLanguage.g:209:6: (lv_names_5_0= ruleVLSName )
                    	    {
                    	    // InternalVampireLanguage.g:209:6: (lv_names_5_0= ruleVLSName )
                    	    // InternalVampireLanguage.g:210:7: lv_names_5_0= ruleVLSName
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
    // InternalVampireLanguage.g:237:1: entryRuleVLSName returns [EObject current=null] : iv_ruleVLSName= ruleVLSName EOF ;
    public final EObject entryRuleVLSName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSName = null;


        try {
            // InternalVampireLanguage.g:237:48: (iv_ruleVLSName= ruleVLSName EOF )
            // InternalVampireLanguage.g:238:2: iv_ruleVLSName= ruleVLSName EOF
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
    // InternalVampireLanguage.g:244:1: ruleVLSName returns [EObject current=null] : ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_LITERAL | lv_name_0_4= RULE_SIGNED_LITERAL ) ) ) ;
    public final EObject ruleVLSName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:250:2: ( ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_LITERAL | lv_name_0_4= RULE_SIGNED_LITERAL ) ) ) )
            // InternalVampireLanguage.g:251:2: ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_LITERAL | lv_name_0_4= RULE_SIGNED_LITERAL ) ) )
            {
            // InternalVampireLanguage.g:251:2: ( ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_LITERAL | lv_name_0_4= RULE_SIGNED_LITERAL ) ) )
            // InternalVampireLanguage.g:252:3: ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_LITERAL | lv_name_0_4= RULE_SIGNED_LITERAL ) )
            {
            // InternalVampireLanguage.g:252:3: ( (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_LITERAL | lv_name_0_4= RULE_SIGNED_LITERAL ) )
            // InternalVampireLanguage.g:253:4: (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_LITERAL | lv_name_0_4= RULE_SIGNED_LITERAL )
            {
            // InternalVampireLanguage.g:253:4: (lv_name_0_1= RULE_LOWER_WORD_ID | lv_name_0_2= RULE_SINGLE_QUOTE | lv_name_0_3= RULE_LITERAL | lv_name_0_4= RULE_SIGNED_LITERAL )
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
                    // InternalVampireLanguage.g:254:5: lv_name_0_1= RULE_LOWER_WORD_ID
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
                    // InternalVampireLanguage.g:269:5: lv_name_0_2= RULE_SINGLE_QUOTE
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
                    // InternalVampireLanguage.g:284:5: lv_name_0_3= RULE_LITERAL
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
                    // InternalVampireLanguage.g:299:5: lv_name_0_4= RULE_SIGNED_LITERAL
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
    // InternalVampireLanguage.g:319:1: entryRuleVLSComment returns [EObject current=null] : iv_ruleVLSComment= ruleVLSComment EOF ;
    public final EObject entryRuleVLSComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSComment = null;


        try {
            // InternalVampireLanguage.g:319:51: (iv_ruleVLSComment= ruleVLSComment EOF )
            // InternalVampireLanguage.g:320:2: iv_ruleVLSComment= ruleVLSComment EOF
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
    // InternalVampireLanguage.g:326:1: ruleVLSComment returns [EObject current=null] : (otherlv_0= '%' ( (lv_comment_1_0= RULE_SINGLE_COMMENT ) ) ) ;
    public final EObject ruleVLSComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_comment_1_0=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:332:2: ( (otherlv_0= '%' ( (lv_comment_1_0= RULE_SINGLE_COMMENT ) ) ) )
            // InternalVampireLanguage.g:333:2: (otherlv_0= '%' ( (lv_comment_1_0= RULE_SINGLE_COMMENT ) ) )
            {
            // InternalVampireLanguage.g:333:2: (otherlv_0= '%' ( (lv_comment_1_0= RULE_SINGLE_COMMENT ) ) )
            // InternalVampireLanguage.g:334:3: otherlv_0= '%' ( (lv_comment_1_0= RULE_SINGLE_COMMENT ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVLSCommentAccess().getPercentSignKeyword_0());
            		
            // InternalVampireLanguage.g:338:3: ( (lv_comment_1_0= RULE_SINGLE_COMMENT ) )
            // InternalVampireLanguage.g:339:4: (lv_comment_1_0= RULE_SINGLE_COMMENT )
            {
            // InternalVampireLanguage.g:339:4: (lv_comment_1_0= RULE_SINGLE_COMMENT )
            // InternalVampireLanguage.g:340:5: lv_comment_1_0= RULE_SINGLE_COMMENT
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


    // $ANTLR start "entryRuleVLSFofFormula"
    // InternalVampireLanguage.g:360:1: entryRuleVLSFofFormula returns [EObject current=null] : iv_ruleVLSFofFormula= ruleVLSFofFormula EOF ;
    public final EObject entryRuleVLSFofFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFofFormula = null;


        try {
            // InternalVampireLanguage.g:360:54: (iv_ruleVLSFofFormula= ruleVLSFofFormula EOF )
            // InternalVampireLanguage.g:361:2: iv_ruleVLSFofFormula= ruleVLSFofFormula EOF
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
    // InternalVampireLanguage.g:367:1: ruleVLSFofFormula returns [EObject current=null] : (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' ) ;
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
            // InternalVampireLanguage.g:373:2: ( (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' ) )
            // InternalVampireLanguage.g:374:2: (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' )
            {
            // InternalVampireLanguage.g:374:2: (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.' )
            // InternalVampireLanguage.g:375:3: otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) ) otherlv_3= ',' ( (lv_fofRole_4_0= ruleVLSRole ) ) otherlv_5= ',' ( (lv_fofFormula_6_0= ruleVLSTerm ) ) (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )? otherlv_9= ')' otherlv_10= '.'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getVLSFofFormulaAccess().getFofKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getVLSFofFormulaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalVampireLanguage.g:383:3: ( ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) ) )
            // InternalVampireLanguage.g:384:4: ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) )
            {
            // InternalVampireLanguage.g:384:4: ( (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE ) )
            // InternalVampireLanguage.g:385:5: (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE )
            {
            // InternalVampireLanguage.g:385:5: (lv_name_2_1= RULE_LOWER_WORD_ID | lv_name_2_2= RULE_SIGNED_LITERAL | lv_name_2_3= RULE_SINGLE_QUOTE )
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
                    // InternalVampireLanguage.g:386:6: lv_name_2_1= RULE_LOWER_WORD_ID
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
                    // InternalVampireLanguage.g:401:6: lv_name_2_2= RULE_SIGNED_LITERAL
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
                    // InternalVampireLanguage.g:416:6: lv_name_2_3= RULE_SINGLE_QUOTE
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
            		
            // InternalVampireLanguage.g:437:3: ( (lv_fofRole_4_0= ruleVLSRole ) )
            // InternalVampireLanguage.g:438:4: (lv_fofRole_4_0= ruleVLSRole )
            {
            // InternalVampireLanguage.g:438:4: (lv_fofRole_4_0= ruleVLSRole )
            // InternalVampireLanguage.g:439:5: lv_fofRole_4_0= ruleVLSRole
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
            		
            // InternalVampireLanguage.g:460:3: ( (lv_fofFormula_6_0= ruleVLSTerm ) )
            // InternalVampireLanguage.g:461:4: (lv_fofFormula_6_0= ruleVLSTerm )
            {
            // InternalVampireLanguage.g:461:4: (lv_fofFormula_6_0= ruleVLSTerm )
            // InternalVampireLanguage.g:462:5: lv_fofFormula_6_0= ruleVLSTerm
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

            // InternalVampireLanguage.g:479:3: (otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVampireLanguage.g:480:4: otherlv_7= ',' ( (lv_annotations_8_0= ruleVLSAnnotation ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getVLSFofFormulaAccess().getCommaKeyword_7_0());
                    			
                    // InternalVampireLanguage.g:484:4: ( (lv_annotations_8_0= ruleVLSAnnotation ) )
                    // InternalVampireLanguage.g:485:5: (lv_annotations_8_0= ruleVLSAnnotation )
                    {
                    // InternalVampireLanguage.g:485:5: (lv_annotations_8_0= ruleVLSAnnotation )
                    // InternalVampireLanguage.g:486:6: lv_annotations_8_0= ruleVLSAnnotation
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

            otherlv_9=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getVLSFofFormulaAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,35,FOLLOW_2); 

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
    // InternalVampireLanguage.g:516:1: entryRuleVLSRole returns [String current=null] : iv_ruleVLSRole= ruleVLSRole EOF ;
    public final String entryRuleVLSRole() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSRole = null;


        try {
            // InternalVampireLanguage.g:516:47: (iv_ruleVLSRole= ruleVLSRole EOF )
            // InternalVampireLanguage.g:517:2: iv_ruleVLSRole= ruleVLSRole EOF
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
    // InternalVampireLanguage.g:523:1: ruleVLSRole returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VLSAxiom_0= ruleVLSAxiom | this_VLSConjecture_1= ruleVLSConjecture | this_VLSHypothesis_2= ruleVLSHypothesis | this_VLSDefinition_3= ruleVLSDefinition | this_VLSAssumption_4= ruleVLSAssumption | this_VLSLemma_5= ruleVLSLemma | this_VLSTheorem_6= ruleVLSTheorem | this_VLSCorollary_7= ruleVLSCorollary | this_VLSNegated_Conjecture_8= ruleVLSNegated_Conjecture | this_VLSPlain_9= ruleVLSPlain | this_VLSType_10= ruleVLSType | this_VLSFi_Domain_11= ruleVLSFi_Domain | this_VLSFi_Functors_12= ruleVLSFi_Functors | this_VLSFi_Predicates_13= ruleVLSFi_Predicates | this_VLSUnknown_14= ruleVLSUnknown ) ;
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
            // InternalVampireLanguage.g:529:2: ( (this_VLSAxiom_0= ruleVLSAxiom | this_VLSConjecture_1= ruleVLSConjecture | this_VLSHypothesis_2= ruleVLSHypothesis | this_VLSDefinition_3= ruleVLSDefinition | this_VLSAssumption_4= ruleVLSAssumption | this_VLSLemma_5= ruleVLSLemma | this_VLSTheorem_6= ruleVLSTheorem | this_VLSCorollary_7= ruleVLSCorollary | this_VLSNegated_Conjecture_8= ruleVLSNegated_Conjecture | this_VLSPlain_9= ruleVLSPlain | this_VLSType_10= ruleVLSType | this_VLSFi_Domain_11= ruleVLSFi_Domain | this_VLSFi_Functors_12= ruleVLSFi_Functors | this_VLSFi_Predicates_13= ruleVLSFi_Predicates | this_VLSUnknown_14= ruleVLSUnknown ) )
            // InternalVampireLanguage.g:530:2: (this_VLSAxiom_0= ruleVLSAxiom | this_VLSConjecture_1= ruleVLSConjecture | this_VLSHypothesis_2= ruleVLSHypothesis | this_VLSDefinition_3= ruleVLSDefinition | this_VLSAssumption_4= ruleVLSAssumption | this_VLSLemma_5= ruleVLSLemma | this_VLSTheorem_6= ruleVLSTheorem | this_VLSCorollary_7= ruleVLSCorollary | this_VLSNegated_Conjecture_8= ruleVLSNegated_Conjecture | this_VLSPlain_9= ruleVLSPlain | this_VLSType_10= ruleVLSType | this_VLSFi_Domain_11= ruleVLSFi_Domain | this_VLSFi_Functors_12= ruleVLSFi_Functors | this_VLSFi_Predicates_13= ruleVLSFi_Predicates | this_VLSUnknown_14= ruleVLSUnknown )
            {
            // InternalVampireLanguage.g:530:2: (this_VLSAxiom_0= ruleVLSAxiom | this_VLSConjecture_1= ruleVLSConjecture | this_VLSHypothesis_2= ruleVLSHypothesis | this_VLSDefinition_3= ruleVLSDefinition | this_VLSAssumption_4= ruleVLSAssumption | this_VLSLemma_5= ruleVLSLemma | this_VLSTheorem_6= ruleVLSTheorem | this_VLSCorollary_7= ruleVLSCorollary | this_VLSNegated_Conjecture_8= ruleVLSNegated_Conjecture | this_VLSPlain_9= ruleVLSPlain | this_VLSType_10= ruleVLSType | this_VLSFi_Domain_11= ruleVLSFi_Domain | this_VLSFi_Functors_12= ruleVLSFi_Functors | this_VLSFi_Predicates_13= ruleVLSFi_Predicates | this_VLSUnknown_14= ruleVLSUnknown )
            int alt7=15;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt7=1;
                }
                break;
            case 37:
                {
                alt7=2;
                }
                break;
            case 38:
                {
                alt7=3;
                }
                break;
            case 39:
                {
                alt7=4;
                }
                break;
            case 40:
                {
                alt7=5;
                }
                break;
            case 41:
                {
                alt7=6;
                }
                break;
            case 42:
                {
                alt7=7;
                }
                break;
            case 43:
                {
                alt7=8;
                }
                break;
            case 44:
                {
                alt7=9;
                }
                break;
            case 45:
                {
                alt7=10;
                }
                break;
            case 46:
                {
                alt7=11;
                }
                break;
            case 47:
                {
                alt7=12;
                }
                break;
            case 48:
                {
                alt7=13;
                }
                break;
            case 49:
                {
                alt7=14;
                }
                break;
            case 50:
                {
                alt7=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalVampireLanguage.g:531:3: this_VLSAxiom_0= ruleVLSAxiom
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
                    // InternalVampireLanguage.g:542:3: this_VLSConjecture_1= ruleVLSConjecture
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
                    // InternalVampireLanguage.g:553:3: this_VLSHypothesis_2= ruleVLSHypothesis
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
                    // InternalVampireLanguage.g:564:3: this_VLSDefinition_3= ruleVLSDefinition
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
                    // InternalVampireLanguage.g:575:3: this_VLSAssumption_4= ruleVLSAssumption
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
                    // InternalVampireLanguage.g:586:3: this_VLSLemma_5= ruleVLSLemma
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
                    // InternalVampireLanguage.g:597:3: this_VLSTheorem_6= ruleVLSTheorem
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
                    // InternalVampireLanguage.g:608:3: this_VLSCorollary_7= ruleVLSCorollary
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
                    // InternalVampireLanguage.g:619:3: this_VLSNegated_Conjecture_8= ruleVLSNegated_Conjecture
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
                    // InternalVampireLanguage.g:630:3: this_VLSPlain_9= ruleVLSPlain
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
                    // InternalVampireLanguage.g:641:3: this_VLSType_10= ruleVLSType
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
                    // InternalVampireLanguage.g:652:3: this_VLSFi_Domain_11= ruleVLSFi_Domain
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
                    // InternalVampireLanguage.g:663:3: this_VLSFi_Functors_12= ruleVLSFi_Functors
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
                    // InternalVampireLanguage.g:674:3: this_VLSFi_Predicates_13= ruleVLSFi_Predicates
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
                    // InternalVampireLanguage.g:685:3: this_VLSUnknown_14= ruleVLSUnknown
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
    // InternalVampireLanguage.g:699:1: entryRuleVLSAxiom returns [String current=null] : iv_ruleVLSAxiom= ruleVLSAxiom EOF ;
    public final String entryRuleVLSAxiom() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSAxiom = null;


        try {
            // InternalVampireLanguage.g:699:48: (iv_ruleVLSAxiom= ruleVLSAxiom EOF )
            // InternalVampireLanguage.g:700:2: iv_ruleVLSAxiom= ruleVLSAxiom EOF
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
    // InternalVampireLanguage.g:706:1: ruleVLSAxiom returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'axiom' ;
    public final AntlrDatatypeRuleToken ruleVLSAxiom() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:712:2: (kw= 'axiom' )
            // InternalVampireLanguage.g:713:2: kw= 'axiom'
            {
            kw=(Token)match(input,36,FOLLOW_2); 

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
    // InternalVampireLanguage.g:721:1: entryRuleVLSConjecture returns [String current=null] : iv_ruleVLSConjecture= ruleVLSConjecture EOF ;
    public final String entryRuleVLSConjecture() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSConjecture = null;


        try {
            // InternalVampireLanguage.g:721:53: (iv_ruleVLSConjecture= ruleVLSConjecture EOF )
            // InternalVampireLanguage.g:722:2: iv_ruleVLSConjecture= ruleVLSConjecture EOF
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
    // InternalVampireLanguage.g:728:1: ruleVLSConjecture returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'conjecture' ;
    public final AntlrDatatypeRuleToken ruleVLSConjecture() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:734:2: (kw= 'conjecture' )
            // InternalVampireLanguage.g:735:2: kw= 'conjecture'
            {
            kw=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVampireLanguage.g:743:1: entryRuleVLSHypothesis returns [String current=null] : iv_ruleVLSHypothesis= ruleVLSHypothesis EOF ;
    public final String entryRuleVLSHypothesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSHypothesis = null;


        try {
            // InternalVampireLanguage.g:743:53: (iv_ruleVLSHypothesis= ruleVLSHypothesis EOF )
            // InternalVampireLanguage.g:744:2: iv_ruleVLSHypothesis= ruleVLSHypothesis EOF
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
    // InternalVampireLanguage.g:750:1: ruleVLSHypothesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'hypothesis' ;
    public final AntlrDatatypeRuleToken ruleVLSHypothesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:756:2: (kw= 'hypothesis' )
            // InternalVampireLanguage.g:757:2: kw= 'hypothesis'
            {
            kw=(Token)match(input,38,FOLLOW_2); 

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
    // InternalVampireLanguage.g:765:1: entryRuleVLSDefinition returns [String current=null] : iv_ruleVLSDefinition= ruleVLSDefinition EOF ;
    public final String entryRuleVLSDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSDefinition = null;


        try {
            // InternalVampireLanguage.g:765:53: (iv_ruleVLSDefinition= ruleVLSDefinition EOF )
            // InternalVampireLanguage.g:766:2: iv_ruleVLSDefinition= ruleVLSDefinition EOF
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
    // InternalVampireLanguage.g:772:1: ruleVLSDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'definition' ;
    public final AntlrDatatypeRuleToken ruleVLSDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:778:2: (kw= 'definition' )
            // InternalVampireLanguage.g:779:2: kw= 'definition'
            {
            kw=(Token)match(input,39,FOLLOW_2); 

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
    // InternalVampireLanguage.g:787:1: entryRuleVLSAssumption returns [String current=null] : iv_ruleVLSAssumption= ruleVLSAssumption EOF ;
    public final String entryRuleVLSAssumption() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSAssumption = null;


        try {
            // InternalVampireLanguage.g:787:53: (iv_ruleVLSAssumption= ruleVLSAssumption EOF )
            // InternalVampireLanguage.g:788:2: iv_ruleVLSAssumption= ruleVLSAssumption EOF
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
    // InternalVampireLanguage.g:794:1: ruleVLSAssumption returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'assumption' ;
    public final AntlrDatatypeRuleToken ruleVLSAssumption() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:800:2: (kw= 'assumption' )
            // InternalVampireLanguage.g:801:2: kw= 'assumption'
            {
            kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalVampireLanguage.g:809:1: entryRuleVLSLemma returns [String current=null] : iv_ruleVLSLemma= ruleVLSLemma EOF ;
    public final String entryRuleVLSLemma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSLemma = null;


        try {
            // InternalVampireLanguage.g:809:48: (iv_ruleVLSLemma= ruleVLSLemma EOF )
            // InternalVampireLanguage.g:810:2: iv_ruleVLSLemma= ruleVLSLemma EOF
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
    // InternalVampireLanguage.g:816:1: ruleVLSLemma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'lemma' ;
    public final AntlrDatatypeRuleToken ruleVLSLemma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:822:2: (kw= 'lemma' )
            // InternalVampireLanguage.g:823:2: kw= 'lemma'
            {
            kw=(Token)match(input,41,FOLLOW_2); 

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
    // InternalVampireLanguage.g:831:1: entryRuleVLSTheorem returns [String current=null] : iv_ruleVLSTheorem= ruleVLSTheorem EOF ;
    public final String entryRuleVLSTheorem() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSTheorem = null;


        try {
            // InternalVampireLanguage.g:831:50: (iv_ruleVLSTheorem= ruleVLSTheorem EOF )
            // InternalVampireLanguage.g:832:2: iv_ruleVLSTheorem= ruleVLSTheorem EOF
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
    // InternalVampireLanguage.g:838:1: ruleVLSTheorem returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'theorem' ;
    public final AntlrDatatypeRuleToken ruleVLSTheorem() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:844:2: (kw= 'theorem' )
            // InternalVampireLanguage.g:845:2: kw= 'theorem'
            {
            kw=(Token)match(input,42,FOLLOW_2); 

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
    // InternalVampireLanguage.g:853:1: entryRuleVLSCorollary returns [String current=null] : iv_ruleVLSCorollary= ruleVLSCorollary EOF ;
    public final String entryRuleVLSCorollary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSCorollary = null;


        try {
            // InternalVampireLanguage.g:853:52: (iv_ruleVLSCorollary= ruleVLSCorollary EOF )
            // InternalVampireLanguage.g:854:2: iv_ruleVLSCorollary= ruleVLSCorollary EOF
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
    // InternalVampireLanguage.g:860:1: ruleVLSCorollary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'corollary' ;
    public final AntlrDatatypeRuleToken ruleVLSCorollary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:866:2: (kw= 'corollary' )
            // InternalVampireLanguage.g:867:2: kw= 'corollary'
            {
            kw=(Token)match(input,43,FOLLOW_2); 

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
    // InternalVampireLanguage.g:875:1: entryRuleVLSNegated_Conjecture returns [String current=null] : iv_ruleVLSNegated_Conjecture= ruleVLSNegated_Conjecture EOF ;
    public final String entryRuleVLSNegated_Conjecture() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSNegated_Conjecture = null;


        try {
            // InternalVampireLanguage.g:875:61: (iv_ruleVLSNegated_Conjecture= ruleVLSNegated_Conjecture EOF )
            // InternalVampireLanguage.g:876:2: iv_ruleVLSNegated_Conjecture= ruleVLSNegated_Conjecture EOF
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
    // InternalVampireLanguage.g:882:1: ruleVLSNegated_Conjecture returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'negated_conjecture' ;
    public final AntlrDatatypeRuleToken ruleVLSNegated_Conjecture() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:888:2: (kw= 'negated_conjecture' )
            // InternalVampireLanguage.g:889:2: kw= 'negated_conjecture'
            {
            kw=(Token)match(input,44,FOLLOW_2); 

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
    // InternalVampireLanguage.g:897:1: entryRuleVLSPlain returns [String current=null] : iv_ruleVLSPlain= ruleVLSPlain EOF ;
    public final String entryRuleVLSPlain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSPlain = null;


        try {
            // InternalVampireLanguage.g:897:48: (iv_ruleVLSPlain= ruleVLSPlain EOF )
            // InternalVampireLanguage.g:898:2: iv_ruleVLSPlain= ruleVLSPlain EOF
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
    // InternalVampireLanguage.g:904:1: ruleVLSPlain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'plain' ;
    public final AntlrDatatypeRuleToken ruleVLSPlain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:910:2: (kw= 'plain' )
            // InternalVampireLanguage.g:911:2: kw= 'plain'
            {
            kw=(Token)match(input,45,FOLLOW_2); 

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
    // InternalVampireLanguage.g:919:1: entryRuleVLSType returns [String current=null] : iv_ruleVLSType= ruleVLSType EOF ;
    public final String entryRuleVLSType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSType = null;


        try {
            // InternalVampireLanguage.g:919:47: (iv_ruleVLSType= ruleVLSType EOF )
            // InternalVampireLanguage.g:920:2: iv_ruleVLSType= ruleVLSType EOF
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
    // InternalVampireLanguage.g:926:1: ruleVLSType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'type' ;
    public final AntlrDatatypeRuleToken ruleVLSType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:932:2: (kw= 'type' )
            // InternalVampireLanguage.g:933:2: kw= 'type'
            {
            kw=(Token)match(input,46,FOLLOW_2); 

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
    // InternalVampireLanguage.g:941:1: entryRuleVLSFi_Domain returns [String current=null] : iv_ruleVLSFi_Domain= ruleVLSFi_Domain EOF ;
    public final String entryRuleVLSFi_Domain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSFi_Domain = null;


        try {
            // InternalVampireLanguage.g:941:52: (iv_ruleVLSFi_Domain= ruleVLSFi_Domain EOF )
            // InternalVampireLanguage.g:942:2: iv_ruleVLSFi_Domain= ruleVLSFi_Domain EOF
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
    // InternalVampireLanguage.g:948:1: ruleVLSFi_Domain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'fi_domain' ;
    public final AntlrDatatypeRuleToken ruleVLSFi_Domain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:954:2: (kw= 'fi_domain' )
            // InternalVampireLanguage.g:955:2: kw= 'fi_domain'
            {
            kw=(Token)match(input,47,FOLLOW_2); 

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
    // InternalVampireLanguage.g:963:1: entryRuleVLSFi_Functors returns [String current=null] : iv_ruleVLSFi_Functors= ruleVLSFi_Functors EOF ;
    public final String entryRuleVLSFi_Functors() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSFi_Functors = null;


        try {
            // InternalVampireLanguage.g:963:54: (iv_ruleVLSFi_Functors= ruleVLSFi_Functors EOF )
            // InternalVampireLanguage.g:964:2: iv_ruleVLSFi_Functors= ruleVLSFi_Functors EOF
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
    // InternalVampireLanguage.g:970:1: ruleVLSFi_Functors returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'fi_functors' ;
    public final AntlrDatatypeRuleToken ruleVLSFi_Functors() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:976:2: (kw= 'fi_functors' )
            // InternalVampireLanguage.g:977:2: kw= 'fi_functors'
            {
            kw=(Token)match(input,48,FOLLOW_2); 

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
    // InternalVampireLanguage.g:985:1: entryRuleVLSFi_Predicates returns [String current=null] : iv_ruleVLSFi_Predicates= ruleVLSFi_Predicates EOF ;
    public final String entryRuleVLSFi_Predicates() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSFi_Predicates = null;


        try {
            // InternalVampireLanguage.g:985:56: (iv_ruleVLSFi_Predicates= ruleVLSFi_Predicates EOF )
            // InternalVampireLanguage.g:986:2: iv_ruleVLSFi_Predicates= ruleVLSFi_Predicates EOF
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
    // InternalVampireLanguage.g:992:1: ruleVLSFi_Predicates returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'fi_predicates' ;
    public final AntlrDatatypeRuleToken ruleVLSFi_Predicates() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:998:2: (kw= 'fi_predicates' )
            // InternalVampireLanguage.g:999:2: kw= 'fi_predicates'
            {
            kw=(Token)match(input,49,FOLLOW_2); 

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
    // InternalVampireLanguage.g:1007:1: entryRuleVLSUnknown returns [String current=null] : iv_ruleVLSUnknown= ruleVLSUnknown EOF ;
    public final String entryRuleVLSUnknown() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVLSUnknown = null;


        try {
            // InternalVampireLanguage.g:1007:50: (iv_ruleVLSUnknown= ruleVLSUnknown EOF )
            // InternalVampireLanguage.g:1008:2: iv_ruleVLSUnknown= ruleVLSUnknown EOF
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
    // InternalVampireLanguage.g:1014:1: ruleVLSUnknown returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'unknown' ;
    public final AntlrDatatypeRuleToken ruleVLSUnknown() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:1020:2: (kw= 'unknown' )
            // InternalVampireLanguage.g:1021:2: kw= 'unknown'
            {
            kw=(Token)match(input,50,FOLLOW_2); 

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
    // InternalVampireLanguage.g:1029:1: entryRuleVLSAnnotation returns [EObject current=null] : iv_ruleVLSAnnotation= ruleVLSAnnotation EOF ;
    public final EObject entryRuleVLSAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAnnotation = null;


        try {
            // InternalVampireLanguage.g:1029:54: (iv_ruleVLSAnnotation= ruleVLSAnnotation EOF )
            // InternalVampireLanguage.g:1030:2: iv_ruleVLSAnnotation= ruleVLSAnnotation EOF
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
    // InternalVampireLanguage.g:1036:1: ruleVLSAnnotation returns [EObject current=null] : ( (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )? ) ;
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
            // InternalVampireLanguage.g:1042:2: ( ( (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )? ) )
            // InternalVampireLanguage.g:1043:2: ( (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )? )
            {
            // InternalVampireLanguage.g:1043:2: ( (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )? )
            // InternalVampireLanguage.g:1044:3: (otherlv_0= '[' )? ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )? (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )? (otherlv_5= ']' )?
            {
            // InternalVampireLanguage.g:1044:3: (otherlv_0= '[' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==51) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVampireLanguage.g:1045:4: otherlv_0= '['
                    {
                    otherlv_0=(Token)match(input,51,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getVLSAnnotationAccess().getLeftSquareBracketKeyword_0());
                    			

                    }
                    break;

            }

            // InternalVampireLanguage.g:1050:3: ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_SINGLE_QUOTE && LA10_0<=RULE_LOWER_WORD_ID)||(LA10_0>=36 && LA10_0<=50)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVampireLanguage.g:1051:4: ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) )
                    {
                    // InternalVampireLanguage.g:1051:4: ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole ) )
                    // InternalVampireLanguage.g:1052:5: (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:1052:5: (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= ruleVLSRole )
                    int alt9=3;
                    switch ( input.LA(1) ) {
                    case RULE_LOWER_WORD_ID:
                        {
                        alt9=1;
                        }
                        break;
                    case RULE_SINGLE_QUOTE:
                        {
                        alt9=2;
                        }
                        break;
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
                    case 47:
                    case 48:
                    case 49:
                    case 50:
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
                            // InternalVampireLanguage.g:1053:6: lv_name_1_1= RULE_LOWER_WORD_ID
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
                            // InternalVampireLanguage.g:1068:6: lv_name_1_2= RULE_SINGLE_QUOTE
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
                            // InternalVampireLanguage.g:1083:6: lv_name_1_3= ruleVLSRole
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

            // InternalVampireLanguage.g:1101:3: (otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVampireLanguage.g:1102:4: otherlv_2= '(' ( (lv_followup_3_0= ruleVLSAnnotationTerms ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getVLSAnnotationAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalVampireLanguage.g:1106:4: ( (lv_followup_3_0= ruleVLSAnnotationTerms ) )
                    // InternalVampireLanguage.g:1107:5: (lv_followup_3_0= ruleVLSAnnotationTerms )
                    {
                    // InternalVampireLanguage.g:1107:5: (lv_followup_3_0= ruleVLSAnnotationTerms )
                    // InternalVampireLanguage.g:1108:6: lv_followup_3_0= ruleVLSAnnotationTerms
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

                    otherlv_4=(Token)match(input,34,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getVLSAnnotationAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalVampireLanguage.g:1130:3: (otherlv_5= ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVampireLanguage.g:1131:4: otherlv_5= ']'
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
    // InternalVampireLanguage.g:1140:1: entryRuleVLSAnnotationTerms returns [EObject current=null] : iv_ruleVLSAnnotationTerms= ruleVLSAnnotationTerms EOF ;
    public final EObject entryRuleVLSAnnotationTerms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAnnotationTerms = null;


        try {
            // InternalVampireLanguage.g:1140:59: (iv_ruleVLSAnnotationTerms= ruleVLSAnnotationTerms EOF )
            // InternalVampireLanguage.g:1141:2: iv_ruleVLSAnnotationTerms= ruleVLSAnnotationTerms EOF
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
    // InternalVampireLanguage.g:1147:1: ruleVLSAnnotationTerms returns [EObject current=null] : ( ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )* ) ;
    public final EObject ruleVLSAnnotationTerms() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_terms_0_0 = null;

        EObject lv_terms_2_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1153:2: ( ( ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )* ) )
            // InternalVampireLanguage.g:1154:2: ( ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )* )
            {
            // InternalVampireLanguage.g:1154:2: ( ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )* )
            // InternalVampireLanguage.g:1155:3: ( (lv_terms_0_0= ruleVLSAnnotation ) ) (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )*
            {
            // InternalVampireLanguage.g:1155:3: ( (lv_terms_0_0= ruleVLSAnnotation ) )
            // InternalVampireLanguage.g:1156:4: (lv_terms_0_0= ruleVLSAnnotation )
            {
            // InternalVampireLanguage.g:1156:4: (lv_terms_0_0= ruleVLSAnnotation )
            // InternalVampireLanguage.g:1157:5: lv_terms_0_0= ruleVLSAnnotation
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

            // InternalVampireLanguage.g:1174:3: (otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalVampireLanguage.g:1175:4: otherlv_1= ',' ( (lv_terms_2_0= ruleVLSAnnotation ) )
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_20); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVLSAnnotationTermsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalVampireLanguage.g:1179:4: ( (lv_terms_2_0= ruleVLSAnnotation ) )
            	    // InternalVampireLanguage.g:1180:5: (lv_terms_2_0= ruleVLSAnnotation )
            	    {
            	    // InternalVampireLanguage.g:1180:5: (lv_terms_2_0= ruleVLSAnnotation )
            	    // InternalVampireLanguage.g:1181:6: lv_terms_2_0= ruleVLSAnnotation
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
            	    break loop13;
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
    // InternalVampireLanguage.g:1203:1: entryRuleVLSTerm returns [EObject current=null] : iv_ruleVLSTerm= ruleVLSTerm EOF ;
    public final EObject entryRuleVLSTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSTerm = null;


        try {
            // InternalVampireLanguage.g:1203:48: (iv_ruleVLSTerm= ruleVLSTerm EOF )
            // InternalVampireLanguage.g:1204:2: iv_ruleVLSTerm= ruleVLSTerm EOF
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
    // InternalVampireLanguage.g:1210:1: ruleVLSTerm returns [EObject current=null] : this_VLSBinary_0= ruleVLSBinary ;
    public final EObject ruleVLSTerm() throws RecognitionException {
        EObject current = null;

        EObject this_VLSBinary_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1216:2: (this_VLSBinary_0= ruleVLSBinary )
            // InternalVampireLanguage.g:1217:2: this_VLSBinary_0= ruleVLSBinary
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
    // InternalVampireLanguage.g:1228:1: entryRuleVLSBinary returns [EObject current=null] : iv_ruleVLSBinary= ruleVLSBinary EOF ;
    public final EObject entryRuleVLSBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSBinary = null;


        try {
            // InternalVampireLanguage.g:1228:50: (iv_ruleVLSBinary= ruleVLSBinary EOF )
            // InternalVampireLanguage.g:1229:2: iv_ruleVLSBinary= ruleVLSBinary EOF
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
    // InternalVampireLanguage.g:1235:1: ruleVLSBinary returns [EObject current=null] : (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? ) ;
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
            // InternalVampireLanguage.g:1241:2: ( (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? ) )
            // InternalVampireLanguage.g:1242:2: (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? )
            {
            // InternalVampireLanguage.g:1242:2: (this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )? )
            // InternalVampireLanguage.g:1243:3: this_VLSUnitaryFormula_0= ruleVLSUnitaryFormula ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getVLSBinaryAccess().getVLSUnitaryFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_VLSUnitaryFormula_0=ruleVLSUnitaryFormula();

            state._fsp--;


            			current = this_VLSUnitaryFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalVampireLanguage.g:1251:3: ( ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) ) | ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+ | ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+ )?
            int alt17=4;
            switch ( input.LA(1) ) {
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    {
                    alt17=1;
                    }
                    break;
                case 58:
                    {
                    alt17=2;
                    }
                    break;
                case 59:
                    {
                    alt17=3;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // InternalVampireLanguage.g:1252:4: ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) )
                    {
                    // InternalVampireLanguage.g:1252:4: ( ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) ) )
                    // InternalVampireLanguage.g:1253:5: ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) ) ( (lv_right_13_0= ruleVLSUnitaryFormula ) )
                    {
                    // InternalVampireLanguage.g:1253:5: ( ( () otherlv_2= '<=>' ) | ( () otherlv_4= '=>' ) | ( () otherlv_6= '<=' ) | ( () otherlv_8= '<~>' ) | ( () otherlv_10= '~|' ) | ( () otherlv_12= '~&' ) )
                    int alt14=6;
                    switch ( input.LA(1) ) {
                    case 52:
                        {
                        alt14=1;
                        }
                        break;
                    case 53:
                        {
                        alt14=2;
                        }
                        break;
                    case 54:
                        {
                        alt14=3;
                        }
                        break;
                    case 55:
                        {
                        alt14=4;
                        }
                        break;
                    case 56:
                        {
                        alt14=5;
                        }
                        break;
                    case 57:
                        {
                        alt14=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // InternalVampireLanguage.g:1254:6: ( () otherlv_2= '<=>' )
                            {
                            // InternalVampireLanguage.g:1254:6: ( () otherlv_2= '<=>' )
                            // InternalVampireLanguage.g:1255:7: () otherlv_2= '<=>'
                            {
                            // InternalVampireLanguage.g:1255:7: ()
                            // InternalVampireLanguage.g:1256:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSEquivalentLeftAction_1_0_0_0_0(),
                            									current);
                            							

                            }

                            otherlv_2=(Token)match(input,52,FOLLOW_13); 

                            							newLeafNode(otherlv_2, grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_0_0_0_1());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalVampireLanguage.g:1268:6: ( () otherlv_4= '=>' )
                            {
                            // InternalVampireLanguage.g:1268:6: ( () otherlv_4= '=>' )
                            // InternalVampireLanguage.g:1269:7: () otherlv_4= '=>'
                            {
                            // InternalVampireLanguage.g:1269:7: ()
                            // InternalVampireLanguage.g:1270:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSImpliesLeftAction_1_0_0_1_0(),
                            									current);
                            							

                            }

                            otherlv_4=(Token)match(input,53,FOLLOW_13); 

                            							newLeafNode(otherlv_4, grammarAccess.getVLSBinaryAccess().getEqualsSignGreaterThanSignKeyword_1_0_0_1_1());
                            						

                            }


                            }
                            break;
                        case 3 :
                            // InternalVampireLanguage.g:1282:6: ( () otherlv_6= '<=' )
                            {
                            // InternalVampireLanguage.g:1282:6: ( () otherlv_6= '<=' )
                            // InternalVampireLanguage.g:1283:7: () otherlv_6= '<='
                            {
                            // InternalVampireLanguage.g:1283:7: ()
                            // InternalVampireLanguage.g:1284:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSRevImpliesLeftAction_1_0_0_2_0(),
                            									current);
                            							

                            }

                            otherlv_6=(Token)match(input,54,FOLLOW_13); 

                            							newLeafNode(otherlv_6, grammarAccess.getVLSBinaryAccess().getLessThanSignEqualsSignKeyword_1_0_0_2_1());
                            						

                            }


                            }
                            break;
                        case 4 :
                            // InternalVampireLanguage.g:1296:6: ( () otherlv_8= '<~>' )
                            {
                            // InternalVampireLanguage.g:1296:6: ( () otherlv_8= '<~>' )
                            // InternalVampireLanguage.g:1297:7: () otherlv_8= '<~>'
                            {
                            // InternalVampireLanguage.g:1297:7: ()
                            // InternalVampireLanguage.g:1298:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSXnorLeftAction_1_0_0_3_0(),
                            									current);
                            							

                            }

                            otherlv_8=(Token)match(input,55,FOLLOW_13); 

                            							newLeafNode(otherlv_8, grammarAccess.getVLSBinaryAccess().getLessThanSignTildeGreaterThanSignKeyword_1_0_0_3_1());
                            						

                            }


                            }
                            break;
                        case 5 :
                            // InternalVampireLanguage.g:1310:6: ( () otherlv_10= '~|' )
                            {
                            // InternalVampireLanguage.g:1310:6: ( () otherlv_10= '~|' )
                            // InternalVampireLanguage.g:1311:7: () otherlv_10= '~|'
                            {
                            // InternalVampireLanguage.g:1311:7: ()
                            // InternalVampireLanguage.g:1312:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSNorLeftAction_1_0_0_4_0(),
                            									current);
                            							

                            }

                            otherlv_10=(Token)match(input,56,FOLLOW_13); 

                            							newLeafNode(otherlv_10, grammarAccess.getVLSBinaryAccess().getTildeVerticalLineKeyword_1_0_0_4_1());
                            						

                            }


                            }
                            break;
                        case 6 :
                            // InternalVampireLanguage.g:1324:6: ( () otherlv_12= '~&' )
                            {
                            // InternalVampireLanguage.g:1324:6: ( () otherlv_12= '~&' )
                            // InternalVampireLanguage.g:1325:7: () otherlv_12= '~&'
                            {
                            // InternalVampireLanguage.g:1325:7: ()
                            // InternalVampireLanguage.g:1326:8: 
                            {

                            								current = forceCreateModelElementAndSet(
                            									grammarAccess.getVLSBinaryAccess().getVLSNandLeftAction_1_0_0_5_0(),
                            									current);
                            							

                            }

                            otherlv_12=(Token)match(input,57,FOLLOW_13); 

                            							newLeafNode(otherlv_12, grammarAccess.getVLSBinaryAccess().getTildeAmpersandKeyword_1_0_0_5_1());
                            						

                            }


                            }
                            break;

                    }

                    // InternalVampireLanguage.g:1338:5: ( (lv_right_13_0= ruleVLSUnitaryFormula ) )
                    // InternalVampireLanguage.g:1339:6: (lv_right_13_0= ruleVLSUnitaryFormula )
                    {
                    // InternalVampireLanguage.g:1339:6: (lv_right_13_0= ruleVLSUnitaryFormula )
                    // InternalVampireLanguage.g:1340:7: lv_right_13_0= ruleVLSUnitaryFormula
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
                    // InternalVampireLanguage.g:1359:4: ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+
                    {
                    // InternalVampireLanguage.g:1359:4: ( () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==58) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1360:5: () otherlv_15= '&' ( (lv_right_16_0= ruleVLSUnitaryFormula ) )
                    	    {
                    	    // InternalVampireLanguage.g:1360:5: ()
                    	    // InternalVampireLanguage.g:1361:6: 
                    	    {

                    	    						current = forceCreateModelElementAndSet(
                    	    							grammarAccess.getVLSBinaryAccess().getVLSAndLeftAction_1_1_0(),
                    	    							current);
                    	    					

                    	    }

                    	    otherlv_15=(Token)match(input,58,FOLLOW_13); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getVLSBinaryAccess().getAmpersandKeyword_1_1_1());
                    	    				
                    	    // InternalVampireLanguage.g:1371:5: ( (lv_right_16_0= ruleVLSUnitaryFormula ) )
                    	    // InternalVampireLanguage.g:1372:6: (lv_right_16_0= ruleVLSUnitaryFormula )
                    	    {
                    	    // InternalVampireLanguage.g:1372:6: (lv_right_16_0= ruleVLSUnitaryFormula )
                    	    // InternalVampireLanguage.g:1373:7: lv_right_16_0= ruleVLSUnitaryFormula
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
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:1392:4: ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+
                    {
                    // InternalVampireLanguage.g:1392:4: ( () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==59) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:1393:5: () otherlv_18= '|' ( (lv_right_19_0= ruleVLSUnitaryFormula ) )
                    	    {
                    	    // InternalVampireLanguage.g:1393:5: ()
                    	    // InternalVampireLanguage.g:1394:6: 
                    	    {

                    	    						current = forceCreateModelElementAndSet(
                    	    							grammarAccess.getVLSBinaryAccess().getVLSOrLeftAction_1_2_0(),
                    	    							current);
                    	    					

                    	    }

                    	    otherlv_18=(Token)match(input,59,FOLLOW_13); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getVLSBinaryAccess().getVerticalLineKeyword_1_2_1());
                    	    				
                    	    // InternalVampireLanguage.g:1404:5: ( (lv_right_19_0= ruleVLSUnitaryFormula ) )
                    	    // InternalVampireLanguage.g:1405:6: (lv_right_19_0= ruleVLSUnitaryFormula )
                    	    {
                    	    // InternalVampireLanguage.g:1405:6: (lv_right_19_0= ruleVLSUnitaryFormula )
                    	    // InternalVampireLanguage.g:1406:7: lv_right_19_0= ruleVLSUnitaryFormula
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
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
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
    // InternalVampireLanguage.g:1429:1: entryRuleVLSUnitaryFormula returns [EObject current=null] : iv_ruleVLSUnitaryFormula= ruleVLSUnitaryFormula EOF ;
    public final EObject entryRuleVLSUnitaryFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUnitaryFormula = null;


        try {
            // InternalVampireLanguage.g:1429:58: (iv_ruleVLSUnitaryFormula= ruleVLSUnitaryFormula EOF )
            // InternalVampireLanguage.g:1430:2: iv_ruleVLSUnitaryFormula= ruleVLSUnitaryFormula EOF
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
    // InternalVampireLanguage.g:1436:1: ruleVLSUnitaryFormula returns [EObject current=null] : (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) ) ;
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
            // InternalVampireLanguage.g:1442:2: ( (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) ) )
            // InternalVampireLanguage.g:1443:2: (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) )
            {
            // InternalVampireLanguage.g:1443:2: (this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier | this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier | this_VLSUnaryNegation_2= ruleVLSUnaryNegation | this_VLSUnaryInfix_3= ruleVLSUnaryInfix | (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' ) )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt18=1;
                }
                break;
            case 62:
                {
                alt18=2;
                }
                break;
            case 63:
                {
                alt18=3;
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
            case 47:
            case 48:
            case 49:
            case 50:
            case 67:
            case 68:
            case 69:
                {
                alt18=4;
                }
                break;
            case 33:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalVampireLanguage.g:1444:3: this_VLSUniversalQuantifier_0= ruleVLSUniversalQuantifier
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
                    // InternalVampireLanguage.g:1453:3: this_VLSExistentialQuantifier_1= ruleVLSExistentialQuantifier
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
                    // InternalVampireLanguage.g:1462:3: this_VLSUnaryNegation_2= ruleVLSUnaryNegation
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
                    // InternalVampireLanguage.g:1471:3: this_VLSUnaryInfix_3= ruleVLSUnaryInfix
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
                    // InternalVampireLanguage.g:1480:3: (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' )
                    {
                    // InternalVampireLanguage.g:1480:3: (otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')' )
                    // InternalVampireLanguage.g:1481:4: otherlv_4= '(' this_VLSTerm_5= ruleVLSTerm otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getVLSUnitaryFormulaAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getVLSUnitaryFormulaAccess().getVLSTermParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_16);
                    this_VLSTerm_5=ruleVLSTerm();

                    state._fsp--;


                    				current = this_VLSTerm_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,34,FOLLOW_2); 

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
    // InternalVampireLanguage.g:1502:1: entryRuleVLSUniversalQuantifier returns [EObject current=null] : iv_ruleVLSUniversalQuantifier= ruleVLSUniversalQuantifier EOF ;
    public final EObject entryRuleVLSUniversalQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUniversalQuantifier = null;


        try {
            // InternalVampireLanguage.g:1502:63: (iv_ruleVLSUniversalQuantifier= ruleVLSUniversalQuantifier EOF )
            // InternalVampireLanguage.g:1503:2: iv_ruleVLSUniversalQuantifier= ruleVLSUniversalQuantifier EOF
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
    // InternalVampireLanguage.g:1509:1: ruleVLSUniversalQuantifier returns [EObject current=null] : ( () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) ;
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
            // InternalVampireLanguage.g:1515:2: ( ( () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) )
            // InternalVampireLanguage.g:1516:2: ( () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            {
            // InternalVampireLanguage.g:1516:2: ( () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            // InternalVampireLanguage.g:1517:3: () (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            {
            // InternalVampireLanguage.g:1517:3: ()
            // InternalVampireLanguage.g:1518:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSUniversalQuantifierAccess().getVLSUniversalQuantifierAction_0(),
            					current);
            			

            }

            // InternalVampireLanguage.g:1524:3: (otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' )
            // InternalVampireLanguage.g:1525:4: otherlv_1= '!' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':'
            {
            otherlv_1=(Token)match(input,60,FOLLOW_26); 

            				newLeafNode(otherlv_1, grammarAccess.getVLSUniversalQuantifierAccess().getExclamationMarkKeyword_1_0());
            			
            otherlv_2=(Token)match(input,51,FOLLOW_27); 

            				newLeafNode(otherlv_2, grammarAccess.getVLSUniversalQuantifierAccess().getLeftSquareBracketKeyword_1_1());
            			
            // InternalVampireLanguage.g:1533:4: ( (lv_variables_3_0= ruleVLSVariable ) )
            // InternalVampireLanguage.g:1534:5: (lv_variables_3_0= ruleVLSVariable )
            {
            // InternalVampireLanguage.g:1534:5: (lv_variables_3_0= ruleVLSVariable )
            // InternalVampireLanguage.g:1535:6: lv_variables_3_0= ruleVLSVariable
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

            // InternalVampireLanguage.g:1552:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalVampireLanguage.g:1553:5: otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_27); 

            	    					newLeafNode(otherlv_4, grammarAccess.getVLSUniversalQuantifierAccess().getCommaKeyword_1_3_0());
            	    				
            	    // InternalVampireLanguage.g:1557:5: ( (lv_variables_5_0= ruleVLSVariable ) )
            	    // InternalVampireLanguage.g:1558:6: (lv_variables_5_0= ruleVLSVariable )
            	    {
            	    // InternalVampireLanguage.g:1558:6: (lv_variables_5_0= ruleVLSVariable )
            	    // InternalVampireLanguage.g:1559:7: lv_variables_5_0= ruleVLSVariable
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
            	    break loop19;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_28); 

            				newLeafNode(otherlv_6, grammarAccess.getVLSUniversalQuantifierAccess().getRightSquareBracketKeyword_1_4());
            			
            otherlv_7=(Token)match(input,61,FOLLOW_13); 

            				newLeafNode(otherlv_7, grammarAccess.getVLSUniversalQuantifierAccess().getColonKeyword_1_5());
            			

            }

            // InternalVampireLanguage.g:1586:3: ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:1587:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:1587:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:1588:5: lv_operand_8_0= ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:1609:1: entryRuleVLSExistentialQuantifier returns [EObject current=null] : iv_ruleVLSExistentialQuantifier= ruleVLSExistentialQuantifier EOF ;
    public final EObject entryRuleVLSExistentialQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSExistentialQuantifier = null;


        try {
            // InternalVampireLanguage.g:1609:65: (iv_ruleVLSExistentialQuantifier= ruleVLSExistentialQuantifier EOF )
            // InternalVampireLanguage.g:1610:2: iv_ruleVLSExistentialQuantifier= ruleVLSExistentialQuantifier EOF
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
    // InternalVampireLanguage.g:1616:1: ruleVLSExistentialQuantifier returns [EObject current=null] : ( () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) ;
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
            // InternalVampireLanguage.g:1622:2: ( ( () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) ) )
            // InternalVampireLanguage.g:1623:2: ( () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            {
            // InternalVampireLanguage.g:1623:2: ( () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) ) )
            // InternalVampireLanguage.g:1624:3: () (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' ) ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            {
            // InternalVampireLanguage.g:1624:3: ()
            // InternalVampireLanguage.g:1625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSExistentialQuantifierAccess().getVLSExistentialQuantifierAction_0(),
            					current);
            			

            }

            // InternalVampireLanguage.g:1631:3: (otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':' )
            // InternalVampireLanguage.g:1632:4: otherlv_1= '?' otherlv_2= '[' ( (lv_variables_3_0= ruleVLSVariable ) ) (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )* otherlv_6= ']' otherlv_7= ':'
            {
            otherlv_1=(Token)match(input,62,FOLLOW_26); 

            				newLeafNode(otherlv_1, grammarAccess.getVLSExistentialQuantifierAccess().getQuestionMarkKeyword_1_0());
            			
            otherlv_2=(Token)match(input,51,FOLLOW_27); 

            				newLeafNode(otherlv_2, grammarAccess.getVLSExistentialQuantifierAccess().getLeftSquareBracketKeyword_1_1());
            			
            // InternalVampireLanguage.g:1640:4: ( (lv_variables_3_0= ruleVLSVariable ) )
            // InternalVampireLanguage.g:1641:5: (lv_variables_3_0= ruleVLSVariable )
            {
            // InternalVampireLanguage.g:1641:5: (lv_variables_3_0= ruleVLSVariable )
            // InternalVampireLanguage.g:1642:6: lv_variables_3_0= ruleVLSVariable
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

            // InternalVampireLanguage.g:1659:4: (otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalVampireLanguage.g:1660:5: otherlv_4= ',' ( (lv_variables_5_0= ruleVLSVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_27); 

            	    					newLeafNode(otherlv_4, grammarAccess.getVLSExistentialQuantifierAccess().getCommaKeyword_1_3_0());
            	    				
            	    // InternalVampireLanguage.g:1664:5: ( (lv_variables_5_0= ruleVLSVariable ) )
            	    // InternalVampireLanguage.g:1665:6: (lv_variables_5_0= ruleVLSVariable )
            	    {
            	    // InternalVampireLanguage.g:1665:6: (lv_variables_5_0= ruleVLSVariable )
            	    // InternalVampireLanguage.g:1666:7: lv_variables_5_0= ruleVLSVariable
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
            	    break loop20;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_28); 

            				newLeafNode(otherlv_6, grammarAccess.getVLSExistentialQuantifierAccess().getRightSquareBracketKeyword_1_4());
            			
            otherlv_7=(Token)match(input,61,FOLLOW_13); 

            				newLeafNode(otherlv_7, grammarAccess.getVLSExistentialQuantifierAccess().getColonKeyword_1_5());
            			

            }

            // InternalVampireLanguage.g:1693:3: ( (lv_operand_8_0= ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:1694:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:1694:4: (lv_operand_8_0= ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:1695:5: lv_operand_8_0= ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:1716:1: entryRuleVLSUnaryNegation returns [EObject current=null] : iv_ruleVLSUnaryNegation= ruleVLSUnaryNegation EOF ;
    public final EObject entryRuleVLSUnaryNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUnaryNegation = null;


        try {
            // InternalVampireLanguage.g:1716:57: (iv_ruleVLSUnaryNegation= ruleVLSUnaryNegation EOF )
            // InternalVampireLanguage.g:1717:2: iv_ruleVLSUnaryNegation= ruleVLSUnaryNegation EOF
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
    // InternalVampireLanguage.g:1723:1: ruleVLSUnaryNegation returns [EObject current=null] : ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) ) ;
    public final EObject ruleVLSUnaryNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1729:2: ( ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) ) )
            // InternalVampireLanguage.g:1730:2: ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) )
            {
            // InternalVampireLanguage.g:1730:2: ( () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) ) )
            // InternalVampireLanguage.g:1731:3: () otherlv_1= '~' ( (lv_operand_2_0= ruleVLSUnitaryFormula ) )
            {
            // InternalVampireLanguage.g:1731:3: ()
            // InternalVampireLanguage.g:1732:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVLSUnaryNegationAccess().getVLSUnaryNegationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getVLSUnaryNegationAccess().getTildeKeyword_1());
            		
            // InternalVampireLanguage.g:1742:3: ( (lv_operand_2_0= ruleVLSUnitaryFormula ) )
            // InternalVampireLanguage.g:1743:4: (lv_operand_2_0= ruleVLSUnitaryFormula )
            {
            // InternalVampireLanguage.g:1743:4: (lv_operand_2_0= ruleVLSUnitaryFormula )
            // InternalVampireLanguage.g:1744:5: lv_operand_2_0= ruleVLSUnitaryFormula
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
    // InternalVampireLanguage.g:1765:1: entryRuleVLSUnaryInfix returns [EObject current=null] : iv_ruleVLSUnaryInfix= ruleVLSUnaryInfix EOF ;
    public final EObject entryRuleVLSUnaryInfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSUnaryInfix = null;


        try {
            // InternalVampireLanguage.g:1765:54: (iv_ruleVLSUnaryInfix= ruleVLSUnaryInfix EOF )
            // InternalVampireLanguage.g:1766:2: iv_ruleVLSUnaryInfix= ruleVLSUnaryInfix EOF
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
    // InternalVampireLanguage.g:1772:1: ruleVLSUnaryInfix returns [EObject current=null] : (this_VLSAtomic_0= ruleVLSAtomic ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )? ) ;
    public final EObject ruleVLSUnaryInfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_VLSAtomic_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1778:2: ( (this_VLSAtomic_0= ruleVLSAtomic ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )? ) )
            // InternalVampireLanguage.g:1779:2: (this_VLSAtomic_0= ruleVLSAtomic ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )? )
            {
            // InternalVampireLanguage.g:1779:2: (this_VLSAtomic_0= ruleVLSAtomic ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )? )
            // InternalVampireLanguage.g:1780:3: this_VLSAtomic_0= ruleVLSAtomic ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )?
            {

            			newCompositeNode(grammarAccess.getVLSUnaryInfixAccess().getVLSAtomicParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_VLSAtomic_0=ruleVLSAtomic();

            state._fsp--;


            			current = this_VLSAtomic_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalVampireLanguage.g:1788:3: ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=64 && LA22_0<=66)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVampireLanguage.g:1789:4: ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) ) ( (lv_right_7_0= ruleVLSAtomic ) )
                    {
                    // InternalVampireLanguage.g:1789:4: ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '=' ) | ( () otherlv_6= ':=' ) )
                    int alt21=3;
                    switch ( input.LA(1) ) {
                    case 64:
                        {
                        alt21=1;
                        }
                        break;
                    case 65:
                        {
                        alt21=2;
                        }
                        break;
                    case 66:
                        {
                        alt21=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }

                    switch (alt21) {
                        case 1 :
                            // InternalVampireLanguage.g:1790:5: ( () otherlv_2= '!=' )
                            {
                            // InternalVampireLanguage.g:1790:5: ( () otherlv_2= '!=' )
                            // InternalVampireLanguage.g:1791:6: () otherlv_2= '!='
                            {
                            // InternalVampireLanguage.g:1791:6: ()
                            // InternalVampireLanguage.g:1792:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getVLSUnaryInfixAccess().getVLSInequalityLeftAction_1_0_0_0(),
                            								current);
                            						

                            }

                            otherlv_2=(Token)match(input,64,FOLLOW_30); 

                            						newLeafNode(otherlv_2, grammarAccess.getVLSUnaryInfixAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalVampireLanguage.g:1804:5: ( () otherlv_4= '=' )
                            {
                            // InternalVampireLanguage.g:1804:5: ( () otherlv_4= '=' )
                            // InternalVampireLanguage.g:1805:6: () otherlv_4= '='
                            {
                            // InternalVampireLanguage.g:1805:6: ()
                            // InternalVampireLanguage.g:1806:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getVLSUnaryInfixAccess().getVLSEqualityLeftAction_1_0_1_0(),
                            								current);
                            						

                            }

                            otherlv_4=(Token)match(input,65,FOLLOW_30); 

                            						newLeafNode(otherlv_4, grammarAccess.getVLSUnaryInfixAccess().getEqualsSignKeyword_1_0_1_1());
                            					

                            }


                            }
                            break;
                        case 3 :
                            // InternalVampireLanguage.g:1818:5: ( () otherlv_6= ':=' )
                            {
                            // InternalVampireLanguage.g:1818:5: ( () otherlv_6= ':=' )
                            // InternalVampireLanguage.g:1819:6: () otherlv_6= ':='
                            {
                            // InternalVampireLanguage.g:1819:6: ()
                            // InternalVampireLanguage.g:1820:7: 
                            {

                            							current = forceCreateModelElementAndSet(
                            								grammarAccess.getVLSUnaryInfixAccess().getVLSAssignmentLeftAction_1_0_2_0(),
                            								current);
                            						

                            }

                            otherlv_6=(Token)match(input,66,FOLLOW_30); 

                            						newLeafNode(otherlv_6, grammarAccess.getVLSUnaryInfixAccess().getColonEqualsSignKeyword_1_0_2_1());
                            					

                            }


                            }
                            break;

                    }

                    // InternalVampireLanguage.g:1832:4: ( (lv_right_7_0= ruleVLSAtomic ) )
                    // InternalVampireLanguage.g:1833:5: (lv_right_7_0= ruleVLSAtomic )
                    {
                    // InternalVampireLanguage.g:1833:5: (lv_right_7_0= ruleVLSAtomic )
                    // InternalVampireLanguage.g:1834:6: lv_right_7_0= ruleVLSAtomic
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
    // InternalVampireLanguage.g:1856:1: entryRuleVLSAtomic returns [EObject current=null] : iv_ruleVLSAtomic= ruleVLSAtomic EOF ;
    public final EObject entryRuleVLSAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAtomic = null;


        try {
            // InternalVampireLanguage.g:1856:50: (iv_ruleVLSAtomic= ruleVLSAtomic EOF )
            // InternalVampireLanguage.g:1857:2: iv_ruleVLSAtomic= ruleVLSAtomic EOF
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
    // InternalVampireLanguage.g:1863:1: ruleVLSAtomic returns [EObject current=null] : (this_VLSAtomicConstant_0= ruleVLSAtomicConstant | this_VLSAtomicFunction_1= ruleVLSAtomicFunction | this_VLSVariable_2= ruleVLSVariable | this_VLSDefinedTerm_3= ruleVLSDefinedTerm ) ;
    public final EObject ruleVLSAtomic() throws RecognitionException {
        EObject current = null;

        EObject this_VLSAtomicConstant_0 = null;

        EObject this_VLSAtomicFunction_1 = null;

        EObject this_VLSVariable_2 = null;

        EObject this_VLSDefinedTerm_3 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:1869:2: ( (this_VLSAtomicConstant_0= ruleVLSAtomicConstant | this_VLSAtomicFunction_1= ruleVLSAtomicFunction | this_VLSVariable_2= ruleVLSVariable | this_VLSDefinedTerm_3= ruleVLSDefinedTerm ) )
            // InternalVampireLanguage.g:1870:2: (this_VLSAtomicConstant_0= ruleVLSAtomicConstant | this_VLSAtomicFunction_1= ruleVLSAtomicFunction | this_VLSVariable_2= ruleVLSVariable | this_VLSDefinedTerm_3= ruleVLSDefinedTerm )
            {
            // InternalVampireLanguage.g:1870:2: (this_VLSAtomicConstant_0= ruleVLSAtomicConstant | this_VLSAtomicFunction_1= ruleVLSAtomicFunction | this_VLSVariable_2= ruleVLSVariable | this_VLSDefinedTerm_3= ruleVLSDefinedTerm )
            int alt23=4;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalVampireLanguage.g:1871:3: this_VLSAtomicConstant_0= ruleVLSAtomicConstant
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
                    // InternalVampireLanguage.g:1880:3: this_VLSAtomicFunction_1= ruleVLSAtomicFunction
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
                    // InternalVampireLanguage.g:1889:3: this_VLSVariable_2= ruleVLSVariable
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
                    // InternalVampireLanguage.g:1898:3: this_VLSDefinedTerm_3= ruleVLSDefinedTerm
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
    // InternalVampireLanguage.g:1910:1: entryRuleVLSAtomicConstant returns [EObject current=null] : iv_ruleVLSAtomicConstant= ruleVLSAtomicConstant EOF ;
    public final EObject entryRuleVLSAtomicConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAtomicConstant = null;


        try {
            // InternalVampireLanguage.g:1910:58: (iv_ruleVLSAtomicConstant= ruleVLSAtomicConstant EOF )
            // InternalVampireLanguage.g:1911:2: iv_ruleVLSAtomicConstant= ruleVLSAtomicConstant EOF
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
    // InternalVampireLanguage.g:1917:1: ruleVLSAtomicConstant returns [EObject current=null] : ( ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) ) | ( () otherlv_3= '$true' ) | ( () otherlv_5= '$false' ) ) ;
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
            // InternalVampireLanguage.g:1923:2: ( ( ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) ) | ( () otherlv_3= '$true' ) | ( () otherlv_5= '$false' ) ) )
            // InternalVampireLanguage.g:1924:2: ( ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) ) | ( () otherlv_3= '$true' ) | ( () otherlv_5= '$false' ) )
            {
            // InternalVampireLanguage.g:1924:2: ( ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) ) | ( () otherlv_3= '$true' ) | ( () otherlv_5= '$false' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_SINGLE_QUOTE:
            case RULE_LOWER_WORD_ID:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
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
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt25=1;
                }
                break;
            case 67:
                {
                alt25=2;
                }
                break;
            case 68:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalVampireLanguage.g:1925:3: ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) )
                    {
                    // InternalVampireLanguage.g:1925:3: ( () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) ) )
                    // InternalVampireLanguage.g:1926:4: () ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) )
                    {
                    // InternalVampireLanguage.g:1926:4: ()
                    // InternalVampireLanguage.g:1927:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSAtomicConstantAccess().getVLSConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:1933:4: ( ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) ) )
                    // InternalVampireLanguage.g:1934:5: ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) )
                    {
                    // InternalVampireLanguage.g:1934:5: ( (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole ) )
                    // InternalVampireLanguage.g:1935:6: (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:1935:6: (lv_name_1_1= RULE_LOWER_WORD_ID | lv_name_1_2= RULE_SINGLE_QUOTE | lv_name_1_3= RULE_DOLLAR_ID | lv_name_1_4= RULE_DOUBLE_DOLLAR_ID | lv_name_1_5= ruleVLSRole )
                    int alt24=5;
                    switch ( input.LA(1) ) {
                    case RULE_LOWER_WORD_ID:
                        {
                        alt24=1;
                        }
                        break;
                    case RULE_SINGLE_QUOTE:
                        {
                        alt24=2;
                        }
                        break;
                    case RULE_DOLLAR_ID:
                        {
                        alt24=3;
                        }
                        break;
                    case RULE_DOUBLE_DOLLAR_ID:
                        {
                        alt24=4;
                        }
                        break;
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
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                        {
                        alt24=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // InternalVampireLanguage.g:1936:7: lv_name_1_1= RULE_LOWER_WORD_ID
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
                            // InternalVampireLanguage.g:1951:7: lv_name_1_2= RULE_SINGLE_QUOTE
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
                            // InternalVampireLanguage.g:1966:7: lv_name_1_3= RULE_DOLLAR_ID
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
                            // InternalVampireLanguage.g:1981:7: lv_name_1_4= RULE_DOUBLE_DOLLAR_ID
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
                            // InternalVampireLanguage.g:1996:7: lv_name_1_5= ruleVLSRole
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
                    // InternalVampireLanguage.g:2016:3: ( () otherlv_3= '$true' )
                    {
                    // InternalVampireLanguage.g:2016:3: ( () otherlv_3= '$true' )
                    // InternalVampireLanguage.g:2017:4: () otherlv_3= '$true'
                    {
                    // InternalVampireLanguage.g:2017:4: ()
                    // InternalVampireLanguage.g:2018:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSAtomicConstantAccess().getVLSTrueAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,67,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getVLSAtomicConstantAccess().getTrueKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVampireLanguage.g:2030:3: ( () otherlv_5= '$false' )
                    {
                    // InternalVampireLanguage.g:2030:3: ( () otherlv_5= '$false' )
                    // InternalVampireLanguage.g:2031:4: () otherlv_5= '$false'
                    {
                    // InternalVampireLanguage.g:2031:4: ()
                    // InternalVampireLanguage.g:2032:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSAtomicConstantAccess().getVLSFalseAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,68,FOLLOW_2); 

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
    // InternalVampireLanguage.g:2047:1: entryRuleVLSAtomicFunction returns [EObject current=null] : iv_ruleVLSAtomicFunction= ruleVLSAtomicFunction EOF ;
    public final EObject entryRuleVLSAtomicFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSAtomicFunction = null;


        try {
            // InternalVampireLanguage.g:2047:58: (iv_ruleVLSAtomicFunction= ruleVLSAtomicFunction EOF )
            // InternalVampireLanguage.g:2048:2: iv_ruleVLSAtomicFunction= ruleVLSAtomicFunction EOF
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
    // InternalVampireLanguage.g:2054:1: ruleVLSAtomicFunction returns [EObject current=null] : ( ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) ) | ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' ) ) ;
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
            // InternalVampireLanguage.g:2060:2: ( ( ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) ) | ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' ) ) )
            // InternalVampireLanguage.g:2061:2: ( ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) ) | ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' ) )
            {
            // InternalVampireLanguage.g:2061:2: ( ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) ) | ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_SINGLE_QUOTE && LA28_0<=RULE_LOWER_WORD_ID)||(LA28_0>=RULE_DOLLAR_ID && LA28_0<=RULE_DOUBLE_DOLLAR_ID)||(LA28_0>=36 && LA28_0<=50)) ) {
                alt28=1;
            }
            else if ( (LA28_0==69) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalVampireLanguage.g:2062:3: ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) )
                    {
                    // InternalVampireLanguage.g:2062:3: ( () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' ) )
                    // InternalVampireLanguage.g:2063:4: () ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )
                    {
                    // InternalVampireLanguage.g:2063:4: ()
                    // InternalVampireLanguage.g:2064:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSAtomicFunctionAccess().getVLSFunctionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:2070:4: ( ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) ) )
                    // InternalVampireLanguage.g:2071:5: ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) )
                    {
                    // InternalVampireLanguage.g:2071:5: ( (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole ) )
                    // InternalVampireLanguage.g:2072:6: (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole )
                    {
                    // InternalVampireLanguage.g:2072:6: (lv_constant_1_1= RULE_LOWER_WORD_ID | lv_constant_1_2= RULE_SINGLE_QUOTE | lv_constant_1_3= RULE_DOLLAR_ID | lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID | lv_constant_1_5= ruleVLSRole )
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
                    case 47:
                    case 48:
                    case 49:
                    case 50:
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
                            // InternalVampireLanguage.g:2073:7: lv_constant_1_1= RULE_LOWER_WORD_ID
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
                            // InternalVampireLanguage.g:2088:7: lv_constant_1_2= RULE_SINGLE_QUOTE
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
                            // InternalVampireLanguage.g:2103:7: lv_constant_1_3= RULE_DOLLAR_ID
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
                            // InternalVampireLanguage.g:2118:7: lv_constant_1_4= RULE_DOUBLE_DOLLAR_ID
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
                            // InternalVampireLanguage.g:2133:7: lv_constant_1_5= ruleVLSRole
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

                    // InternalVampireLanguage.g:2151:4: (otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')' )
                    // InternalVampireLanguage.g:2152:5: otherlv_2= '(' ( (lv_terms_3_0= ruleVLSFofTerm ) ) (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_30); 

                    					newLeafNode(otherlv_2, grammarAccess.getVLSAtomicFunctionAccess().getLeftParenthesisKeyword_0_2_0());
                    				
                    // InternalVampireLanguage.g:2156:5: ( (lv_terms_3_0= ruleVLSFofTerm ) )
                    // InternalVampireLanguage.g:2157:6: (lv_terms_3_0= ruleVLSFofTerm )
                    {
                    // InternalVampireLanguage.g:2157:6: (lv_terms_3_0= ruleVLSFofTerm )
                    // InternalVampireLanguage.g:2158:7: lv_terms_3_0= ruleVLSFofTerm
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

                    // InternalVampireLanguage.g:2175:5: (otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==29) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:2176:6: otherlv_4= ',' ( (lv_terms_5_0= ruleVLSFofTerm ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FOLLOW_30); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getVLSAtomicFunctionAccess().getCommaKeyword_0_2_2_0());
                    	    					
                    	    // InternalVampireLanguage.g:2180:6: ( (lv_terms_5_0= ruleVLSFofTerm ) )
                    	    // InternalVampireLanguage.g:2181:7: (lv_terms_5_0= ruleVLSFofTerm )
                    	    {
                    	    // InternalVampireLanguage.g:2181:7: (lv_terms_5_0= ruleVLSFofTerm )
                    	    // InternalVampireLanguage.g:2182:8: lv_terms_5_0= ruleVLSFofTerm
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
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getVLSAtomicFunctionAccess().getRightParenthesisKeyword_0_2_3());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:2207:3: ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' )
                    {
                    // InternalVampireLanguage.g:2207:3: ( () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')' )
                    // InternalVampireLanguage.g:2208:4: () ( (lv_name_8_0= '$less' ) ) otherlv_9= '(' ( (lv_terms_10_0= ruleVLSFofTerm ) ) otherlv_11= ',' ( (lv_terms_12_0= ruleVLSFofTerm ) ) otherlv_13= ')'
                    {
                    // InternalVampireLanguage.g:2208:4: ()
                    // InternalVampireLanguage.g:2209:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSAtomicFunctionAccess().getVLSLessAction_1_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:2215:4: ( (lv_name_8_0= '$less' ) )
                    // InternalVampireLanguage.g:2216:5: (lv_name_8_0= '$less' )
                    {
                    // InternalVampireLanguage.g:2216:5: (lv_name_8_0= '$less' )
                    // InternalVampireLanguage.g:2217:6: lv_name_8_0= '$less'
                    {
                    lv_name_8_0=(Token)match(input,69,FOLLOW_9); 

                    						newLeafNode(lv_name_8_0, grammarAccess.getVLSAtomicFunctionAccess().getNameLessKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVLSAtomicFunctionRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_8_0, "$less");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,33,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getVLSAtomicFunctionAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalVampireLanguage.g:2233:4: ( (lv_terms_10_0= ruleVLSFofTerm ) )
                    // InternalVampireLanguage.g:2234:5: (lv_terms_10_0= ruleVLSFofTerm )
                    {
                    // InternalVampireLanguage.g:2234:5: (lv_terms_10_0= ruleVLSFofTerm )
                    // InternalVampireLanguage.g:2235:6: lv_terms_10_0= ruleVLSFofTerm
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
                    			
                    // InternalVampireLanguage.g:2256:4: ( (lv_terms_12_0= ruleVLSFofTerm ) )
                    // InternalVampireLanguage.g:2257:5: (lv_terms_12_0= ruleVLSFofTerm )
                    {
                    // InternalVampireLanguage.g:2257:5: (lv_terms_12_0= ruleVLSFofTerm )
                    // InternalVampireLanguage.g:2258:6: lv_terms_12_0= ruleVLSFofTerm
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

                    otherlv_13=(Token)match(input,34,FOLLOW_2); 

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
    // InternalVampireLanguage.g:2284:1: entryRuleVLSVariable returns [EObject current=null] : iv_ruleVLSVariable= ruleVLSVariable EOF ;
    public final EObject entryRuleVLSVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSVariable = null;


        try {
            // InternalVampireLanguage.g:2284:52: (iv_ruleVLSVariable= ruleVLSVariable EOF )
            // InternalVampireLanguage.g:2285:2: iv_ruleVLSVariable= ruleVLSVariable EOF
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
    // InternalVampireLanguage.g:2291:1: ruleVLSVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_UPPER_WORD_ID ) ) ;
    public final EObject ruleVLSVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:2297:2: ( ( (lv_name_0_0= RULE_UPPER_WORD_ID ) ) )
            // InternalVampireLanguage.g:2298:2: ( (lv_name_0_0= RULE_UPPER_WORD_ID ) )
            {
            // InternalVampireLanguage.g:2298:2: ( (lv_name_0_0= RULE_UPPER_WORD_ID ) )
            // InternalVampireLanguage.g:2299:3: (lv_name_0_0= RULE_UPPER_WORD_ID )
            {
            // InternalVampireLanguage.g:2299:3: (lv_name_0_0= RULE_UPPER_WORD_ID )
            // InternalVampireLanguage.g:2300:4: lv_name_0_0= RULE_UPPER_WORD_ID
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
    // InternalVampireLanguage.g:2319:1: entryRuleVLSFofTerm returns [EObject current=null] : iv_ruleVLSFofTerm= ruleVLSFofTerm EOF ;
    public final EObject entryRuleVLSFofTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFofTerm = null;


        try {
            // InternalVampireLanguage.g:2319:51: (iv_ruleVLSFofTerm= ruleVLSFofTerm EOF )
            // InternalVampireLanguage.g:2320:2: iv_ruleVLSFofTerm= ruleVLSFofTerm EOF
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
    // InternalVampireLanguage.g:2326:1: ruleVLSFofTerm returns [EObject current=null] : (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionFof_1= ruleVLSFunctionFof | this_VLSDefinedTerm_2= ruleVLSDefinedTerm ) ;
    public final EObject ruleVLSFofTerm() throws RecognitionException {
        EObject current = null;

        EObject this_VLSVariable_0 = null;

        EObject this_VLSFunctionFof_1 = null;

        EObject this_VLSDefinedTerm_2 = null;



        	enterRule();

        try {
            // InternalVampireLanguage.g:2332:2: ( (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionFof_1= ruleVLSFunctionFof | this_VLSDefinedTerm_2= ruleVLSDefinedTerm ) )
            // InternalVampireLanguage.g:2333:2: (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionFof_1= ruleVLSFunctionFof | this_VLSDefinedTerm_2= ruleVLSDefinedTerm )
            {
            // InternalVampireLanguage.g:2333:2: (this_VLSVariable_0= ruleVLSVariable | this_VLSFunctionFof_1= ruleVLSFunctionFof | this_VLSDefinedTerm_2= ruleVLSDefinedTerm )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_UPPER_WORD_ID:
                {
                alt29=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
            case RULE_LOWER_WORD_ID:
            case RULE_DOLLAR_ID:
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt29=2;
                }
                break;
            case RULE_SIGNED_LITERAL:
            case RULE_SIGNED_REAL_ID:
            case RULE_SIGNED_RAT_ID:
            case RULE_DOUBLE_QUOTE:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalVampireLanguage.g:2334:3: this_VLSVariable_0= ruleVLSVariable
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
                    // InternalVampireLanguage.g:2343:3: this_VLSFunctionFof_1= ruleVLSFunctionFof
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
                    // InternalVampireLanguage.g:2352:3: this_VLSDefinedTerm_2= ruleVLSDefinedTerm
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
    // InternalVampireLanguage.g:2364:1: entryRuleVLSFunctionFof returns [EObject current=null] : iv_ruleVLSFunctionFof= ruleVLSFunctionFof EOF ;
    public final EObject entryRuleVLSFunctionFof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSFunctionFof = null;


        try {
            // InternalVampireLanguage.g:2364:55: (iv_ruleVLSFunctionFof= ruleVLSFunctionFof EOF )
            // InternalVampireLanguage.g:2365:2: iv_ruleVLSFunctionFof= ruleVLSFunctionFof EOF
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
    // InternalVampireLanguage.g:2371:1: ruleVLSFunctionFof returns [EObject current=null] : ( ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? ) ;
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
            // InternalVampireLanguage.g:2377:2: ( ( ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? ) )
            // InternalVampireLanguage.g:2378:2: ( ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? )
            {
            // InternalVampireLanguage.g:2378:2: ( ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )? )
            // InternalVampireLanguage.g:2379:3: ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) ) (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )?
            {
            // InternalVampireLanguage.g:2379:3: ( ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) ) )
            // InternalVampireLanguage.g:2380:4: ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) )
            {
            // InternalVampireLanguage.g:2380:4: ( (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID ) )
            // InternalVampireLanguage.g:2381:5: (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID )
            {
            // InternalVampireLanguage.g:2381:5: (lv_functor_0_1= RULE_LOWER_WORD_ID | lv_functor_0_2= RULE_SINGLE_QUOTE | lv_functor_0_3= RULE_DOLLAR_ID | lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID )
            int alt30=4;
            switch ( input.LA(1) ) {
            case RULE_LOWER_WORD_ID:
                {
                alt30=1;
                }
                break;
            case RULE_SINGLE_QUOTE:
                {
                alt30=2;
                }
                break;
            case RULE_DOLLAR_ID:
                {
                alt30=3;
                }
                break;
            case RULE_DOUBLE_DOLLAR_ID:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalVampireLanguage.g:2382:6: lv_functor_0_1= RULE_LOWER_WORD_ID
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
                    // InternalVampireLanguage.g:2397:6: lv_functor_0_2= RULE_SINGLE_QUOTE
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
                    // InternalVampireLanguage.g:2412:6: lv_functor_0_3= RULE_DOLLAR_ID
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
                    // InternalVampireLanguage.g:2427:6: lv_functor_0_4= RULE_DOUBLE_DOLLAR_ID
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

            // InternalVampireLanguage.g:2444:3: (otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalVampireLanguage.g:2445:4: otherlv_1= '(' ( (lv_terms_2_0= ruleVLSFofTerm ) ) (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getVLSFunctionFofAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalVampireLanguage.g:2449:4: ( (lv_terms_2_0= ruleVLSFofTerm ) )
                    // InternalVampireLanguage.g:2450:5: (lv_terms_2_0= ruleVLSFofTerm )
                    {
                    // InternalVampireLanguage.g:2450:5: (lv_terms_2_0= ruleVLSFofTerm )
                    // InternalVampireLanguage.g:2451:6: lv_terms_2_0= ruleVLSFofTerm
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

                    // InternalVampireLanguage.g:2468:4: (otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==29) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:2469:5: otherlv_3= ',' ( (lv_terms_4_0= ruleVLSFofTerm ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FOLLOW_30); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getVLSFunctionFofAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalVampireLanguage.g:2473:5: ( (lv_terms_4_0= ruleVLSFofTerm ) )
                    	    // InternalVampireLanguage.g:2474:6: (lv_terms_4_0= ruleVLSFofTerm )
                    	    {
                    	    // InternalVampireLanguage.g:2474:6: (lv_terms_4_0= ruleVLSFofTerm )
                    	    // InternalVampireLanguage.g:2475:7: lv_terms_4_0= ruleVLSFofTerm
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
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,34,FOLLOW_2); 

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
    // InternalVampireLanguage.g:2502:1: entryRuleVLSDefinedTerm returns [EObject current=null] : iv_ruleVLSDefinedTerm= ruleVLSDefinedTerm EOF ;
    public final EObject entryRuleVLSDefinedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVLSDefinedTerm = null;


        try {
            // InternalVampireLanguage.g:2502:55: (iv_ruleVLSDefinedTerm= ruleVLSDefinedTerm EOF )
            // InternalVampireLanguage.g:2503:2: iv_ruleVLSDefinedTerm= ruleVLSDefinedTerm EOF
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
    // InternalVampireLanguage.g:2509:1: ruleVLSDefinedTerm returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) ) | ( () ( (lv_value_3_0= RULE_SIGNED_REAL_ID ) ) ) | ( () ( (lv_value_5_0= RULE_SIGNED_RAT_ID ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE_QUOTE ) ) ) ) ;
    public final EObject ruleVLSDefinedTerm() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;


        	enterRule();

        try {
            // InternalVampireLanguage.g:2515:2: ( ( ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) ) | ( () ( (lv_value_3_0= RULE_SIGNED_REAL_ID ) ) ) | ( () ( (lv_value_5_0= RULE_SIGNED_RAT_ID ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE_QUOTE ) ) ) ) )
            // InternalVampireLanguage.g:2516:2: ( ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) ) | ( () ( (lv_value_3_0= RULE_SIGNED_REAL_ID ) ) ) | ( () ( (lv_value_5_0= RULE_SIGNED_RAT_ID ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE_QUOTE ) ) ) )
            {
            // InternalVampireLanguage.g:2516:2: ( ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) ) | ( () ( (lv_value_3_0= RULE_SIGNED_REAL_ID ) ) ) | ( () ( (lv_value_5_0= RULE_SIGNED_RAT_ID ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE_QUOTE ) ) ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_LITERAL:
                {
                alt33=1;
                }
                break;
            case RULE_SIGNED_REAL_ID:
                {
                alt33=2;
                }
                break;
            case RULE_SIGNED_RAT_ID:
                {
                alt33=3;
                }
                break;
            case RULE_DOUBLE_QUOTE:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalVampireLanguage.g:2517:3: ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) )
                    {
                    // InternalVampireLanguage.g:2517:3: ( () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) ) )
                    // InternalVampireLanguage.g:2518:4: () ( (lv_value_1_0= RULE_SIGNED_LITERAL ) )
                    {
                    // InternalVampireLanguage.g:2518:4: ()
                    // InternalVampireLanguage.g:2519:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSDefinedTermAccess().getVLSIntAction_0_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:2525:4: ( (lv_value_1_0= RULE_SIGNED_LITERAL ) )
                    // InternalVampireLanguage.g:2526:5: (lv_value_1_0= RULE_SIGNED_LITERAL )
                    {
                    // InternalVampireLanguage.g:2526:5: (lv_value_1_0= RULE_SIGNED_LITERAL )
                    // InternalVampireLanguage.g:2527:6: lv_value_1_0= RULE_SIGNED_LITERAL
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
                    // InternalVampireLanguage.g:2545:3: ( () ( (lv_value_3_0= RULE_SIGNED_REAL_ID ) ) )
                    {
                    // InternalVampireLanguage.g:2545:3: ( () ( (lv_value_3_0= RULE_SIGNED_REAL_ID ) ) )
                    // InternalVampireLanguage.g:2546:4: () ( (lv_value_3_0= RULE_SIGNED_REAL_ID ) )
                    {
                    // InternalVampireLanguage.g:2546:4: ()
                    // InternalVampireLanguage.g:2547:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSDefinedTermAccess().getVLSRealAction_1_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:2553:4: ( (lv_value_3_0= RULE_SIGNED_REAL_ID ) )
                    // InternalVampireLanguage.g:2554:5: (lv_value_3_0= RULE_SIGNED_REAL_ID )
                    {
                    // InternalVampireLanguage.g:2554:5: (lv_value_3_0= RULE_SIGNED_REAL_ID )
                    // InternalVampireLanguage.g:2555:6: lv_value_3_0= RULE_SIGNED_REAL_ID
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
                    // InternalVampireLanguage.g:2573:3: ( () ( (lv_value_5_0= RULE_SIGNED_RAT_ID ) ) )
                    {
                    // InternalVampireLanguage.g:2573:3: ( () ( (lv_value_5_0= RULE_SIGNED_RAT_ID ) ) )
                    // InternalVampireLanguage.g:2574:4: () ( (lv_value_5_0= RULE_SIGNED_RAT_ID ) )
                    {
                    // InternalVampireLanguage.g:2574:4: ()
                    // InternalVampireLanguage.g:2575:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSDefinedTermAccess().getVLSRationalAction_2_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:2581:4: ( (lv_value_5_0= RULE_SIGNED_RAT_ID ) )
                    // InternalVampireLanguage.g:2582:5: (lv_value_5_0= RULE_SIGNED_RAT_ID )
                    {
                    // InternalVampireLanguage.g:2582:5: (lv_value_5_0= RULE_SIGNED_RAT_ID )
                    // InternalVampireLanguage.g:2583:6: lv_value_5_0= RULE_SIGNED_RAT_ID
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
                    // InternalVampireLanguage.g:2601:3: ( () ( (lv_value_7_0= RULE_DOUBLE_QUOTE ) ) )
                    {
                    // InternalVampireLanguage.g:2601:3: ( () ( (lv_value_7_0= RULE_DOUBLE_QUOTE ) ) )
                    // InternalVampireLanguage.g:2602:4: () ( (lv_value_7_0= RULE_DOUBLE_QUOTE ) )
                    {
                    // InternalVampireLanguage.g:2602:4: ()
                    // InternalVampireLanguage.g:2603:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getVLSDefinedTermAccess().getVLSDoubleQuoteAction_3_0(),
                    						current);
                    				

                    }

                    // InternalVampireLanguage.g:2609:4: ( (lv_value_7_0= RULE_DOUBLE_QUOTE ) )
                    // InternalVampireLanguage.g:2610:5: (lv_value_7_0= RULE_DOUBLE_QUOTE )
                    {
                    // InternalVampireLanguage.g:2610:5: (lv_value_7_0= RULE_DOUBLE_QUOTE )
                    // InternalVampireLanguage.g:2611:6: lv_value_7_0= RULE_DOUBLE_QUOTE
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


    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\uffff\23\24\4\uffff";
    static final String dfa_3s = "\1\4\23\35\4\uffff";
    static final String dfa_4s = "\1\105\23\102\4\uffff";
    static final String dfa_5s = "\24\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_6s = "\30\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\1\1\uffff\1\27\1\uffff\1\3\1\4\1\26\3\27\25\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\20\uffff\2\24\1\25",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
            "\1\24\3\uffff\1\25\1\24\21\uffff\10\24\4\uffff\3\24",
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

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1870:2: (this_VLSAtomicConstant_0= ruleVLSAtomicConstant | this_VLSAtomicFunction_1= ruleVLSAtomicFunction | this_VLSVariable_2= ruleVLSVariable | this_VLSDefinedTerm_3= ruleVLSDefinedTerm )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000188000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0007FFF000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xD007FFF200007EB0L,0x0000000000000038L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000420000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000FFFF640000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0007FFF240000032L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000240000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000FFFF260000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0FF0000000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0007FFF000007EB0L,0x0000000000000038L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000002L});

}