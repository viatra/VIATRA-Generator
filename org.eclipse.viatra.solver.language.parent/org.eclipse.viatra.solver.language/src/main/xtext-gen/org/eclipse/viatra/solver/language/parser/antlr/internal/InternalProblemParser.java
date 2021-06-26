package org.eclipse.viatra.solver.language.parser.antlr.internal;

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
import org.eclipse.viatra.solver.language.services.ProblemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProblemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_QUOTED_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'problem'", "'.'", "'abstract'", "'class'", "'extends'", "','", "'{'", "';'", "'}'", "'contains'", "'refers'", "'['", "']'", "'opposite'", "'error'", "'pred'", "'('", "')'", "':-'", "'!'", "'+'", "':'", "'scope'", "'+='", "'='", "'..'", "'*'", "'true'", "'false'", "'unknown'", "'?'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_QUOTED_ID=6;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalProblemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProblemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProblemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProblem.g"; }



     	private ProblemGrammarAccess grammarAccess;

        public InternalProblemParser(TokenStream input, ProblemGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Problem";
       	}

       	@Override
       	protected ProblemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProblem"
    // InternalProblem.g:65:1: entryRuleProblem returns [EObject current=null] : iv_ruleProblem= ruleProblem EOF ;
    public final EObject entryRuleProblem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblem = null;


        try {
            // InternalProblem.g:65:48: (iv_ruleProblem= ruleProblem EOF )
            // InternalProblem.g:66:2: iv_ruleProblem= ruleProblem EOF
            {
             newCompositeNode(grammarAccess.getProblemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProblem=ruleProblem();

            state._fsp--;

             current =iv_ruleProblem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProblem"


    // $ANTLR start "ruleProblem"
    // InternalProblem.g:72:1: ruleProblem returns [EObject current=null] : ( (otherlv_0= 'problem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.' )? ( (lv_statements_3_0= ruleStatement ) )* ) ;
    public final EObject ruleProblem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:78:2: ( ( (otherlv_0= 'problem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.' )? ( (lv_statements_3_0= ruleStatement ) )* ) )
            // InternalProblem.g:79:2: ( (otherlv_0= 'problem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.' )? ( (lv_statements_3_0= ruleStatement ) )* )
            {
            // InternalProblem.g:79:2: ( (otherlv_0= 'problem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.' )? ( (lv_statements_3_0= ruleStatement ) )* )
            // InternalProblem.g:80:3: (otherlv_0= 'problem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.' )? ( (lv_statements_3_0= ruleStatement ) )*
            {
            // InternalProblem.g:80:3: (otherlv_0= 'problem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalProblem.g:81:4: otherlv_0= 'problem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '.'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getProblemAccess().getProblemKeyword_0_0());
                    			
                    // InternalProblem.g:85:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalProblem.g:86:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalProblem.g:86:5: (lv_name_1_0= RULE_ID )
                    // InternalProblem.g:87:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getProblemAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProblemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getProblemAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalProblem.g:108:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==RULE_QUOTED_ID||(LA2_0>=14 && LA2_0<=15)||(LA2_0>=26 && LA2_0<=27)||LA2_0==31||LA2_0==34||LA2_0==42) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalProblem.g:109:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalProblem.g:109:4: (lv_statements_3_0= ruleStatement )
            	    // InternalProblem.g:110:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getProblemAccess().getStatementsStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProblemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"org.eclipse.viatra.solver.language.Problem.Statement");
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
    // $ANTLR end "ruleProblem"


    // $ANTLR start "entryRuleStatement"
    // InternalProblem.g:131:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalProblem.g:131:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalProblem.g:132:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalProblem.g:138:1: ruleStatement returns [EObject current=null] : (this_ClassDeclaration_0= ruleClassDeclaration | this_PredicateDefinition_1= rulePredicateDefinition | this_Assertion_2= ruleAssertion | this_ScopeDeclaration_3= ruleScopeDeclaration ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDeclaration_0 = null;

        EObject this_PredicateDefinition_1 = null;

        EObject this_Assertion_2 = null;

        EObject this_ScopeDeclaration_3 = null;



        	enterRule();

        try {
            // InternalProblem.g:144:2: ( (this_ClassDeclaration_0= ruleClassDeclaration | this_PredicateDefinition_1= rulePredicateDefinition | this_Assertion_2= ruleAssertion | this_ScopeDeclaration_3= ruleScopeDeclaration ) )
            // InternalProblem.g:145:2: (this_ClassDeclaration_0= ruleClassDeclaration | this_PredicateDefinition_1= rulePredicateDefinition | this_Assertion_2= ruleAssertion | this_ScopeDeclaration_3= ruleScopeDeclaration )
            {
            // InternalProblem.g:145:2: (this_ClassDeclaration_0= ruleClassDeclaration | this_PredicateDefinition_1= rulePredicateDefinition | this_Assertion_2= ruleAssertion | this_ScopeDeclaration_3= ruleScopeDeclaration )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
                {
                alt3=1;
                }
                break;
            case 26:
            case 27:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
            case RULE_QUOTED_ID:
            case 31:
            case 42:
                {
                alt3=3;
                }
                break;
            case 34:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalProblem.g:146:3: this_ClassDeclaration_0= ruleClassDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getClassDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassDeclaration_0=ruleClassDeclaration();

                    state._fsp--;


                    			current = this_ClassDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:155:3: this_PredicateDefinition_1= rulePredicateDefinition
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPredicateDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PredicateDefinition_1=rulePredicateDefinition();

                    state._fsp--;


                    			current = this_PredicateDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalProblem.g:164:3: this_Assertion_2= ruleAssertion
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAssertionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assertion_2=ruleAssertion();

                    state._fsp--;


                    			current = this_Assertion_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalProblem.g:173:3: this_ScopeDeclaration_3= ruleScopeDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getScopeDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScopeDeclaration_3=ruleScopeDeclaration();

                    state._fsp--;


                    			current = this_ScopeDeclaration_3;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalProblem.g:185:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalProblem.g:185:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalProblem.g:186:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
            {
             newCompositeNode(grammarAccess.getClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDeclaration=ruleClassDeclaration();

            state._fsp--;

             current =iv_ruleClassDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // InternalProblem.g:192:1: ruleClassDeclaration returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' ) ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_referenceDeclarations_8_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:198:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' ) ) )
            // InternalProblem.g:199:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' ) )
            {
            // InternalProblem.g:199:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' ) )
            // InternalProblem.g:200:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' )
            {
            // InternalProblem.g:200:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalProblem.g:201:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalProblem.g:201:4: (lv_abstract_0_0= 'abstract' )
                    // InternalProblem.g:202:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(lv_abstract_0_0, grammarAccess.getClassDeclarationAccess().getAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "abstract", lv_abstract_0_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDeclarationAccess().getClassKeyword_1());
            		
            // InternalProblem.g:218:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalProblem.g:219:4: (lv_name_2_0= RULE_ID )
            {
            // InternalProblem.g:219:4: (lv_name_2_0= RULE_ID )
            // InternalProblem.g:220:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClassDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalProblem.g:236:3: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProblem.g:237:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getExtendsKeyword_3_0());
                    			
                    // InternalProblem.g:241:4: ( ( ruleQualifiedName ) )
                    // InternalProblem.g:242:5: ( ruleQualifiedName )
                    {
                    // InternalProblem.g:242:5: ( ruleQualifiedName )
                    // InternalProblem.g:243:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassDeclarationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProblem.g:257:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalProblem.g:258:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProblem.g:262:5: ( ( ruleQualifiedName ) )
                    	    // InternalProblem.g:263:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalProblem.g:263:6: ( ruleQualifiedName )
                    	    // InternalProblem.g:264:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClassDeclarationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalProblem.g:280:3: ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==13) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalProblem.g:281:4: (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' )
                    {
                    // InternalProblem.g:281:4: (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' )
                    // InternalProblem.g:282:5: otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_10); 

                    					newLeafNode(otherlv_7, grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_4_0_0());
                    				
                    // InternalProblem.g:286:5: ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=21 && LA8_0<=22)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalProblem.g:287:6: ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )?
                    	    {
                    	    // InternalProblem.g:287:6: ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) )
                    	    // InternalProblem.g:288:7: (lv_referenceDeclarations_8_0= ruleReferenceDeclaration )
                    	    {
                    	    // InternalProblem.g:288:7: (lv_referenceDeclarations_8_0= ruleReferenceDeclaration )
                    	    // InternalProblem.g:289:8: lv_referenceDeclarations_8_0= ruleReferenceDeclaration
                    	    {

                    	    								newCompositeNode(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsReferenceDeclarationParserRuleCall_4_0_1_0_0());
                    	    							
                    	    pushFollow(FOLLOW_11);
                    	    lv_referenceDeclarations_8_0=ruleReferenceDeclaration();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"referenceDeclarations",
                    	    									lv_referenceDeclarations_8_0,
                    	    									"org.eclipse.viatra.solver.language.Problem.ReferenceDeclaration");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    // InternalProblem.g:306:6: (otherlv_9= ';' )?
                    	    int alt7=2;
                    	    int LA7_0 = input.LA(1);

                    	    if ( (LA7_0==19) ) {
                    	        alt7=1;
                    	    }
                    	    switch (alt7) {
                    	        case 1 :
                    	            // InternalProblem.g:307:7: otherlv_9= ';'
                    	            {
                    	            otherlv_9=(Token)match(input,19,FOLLOW_10); 

                    	            							newLeafNode(otherlv_9, grammarAccess.getClassDeclarationAccess().getSemicolonKeyword_4_0_1_1());
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(otherlv_10, grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_4_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:319:4: otherlv_11= '.'
                    {
                    otherlv_11=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getClassDeclarationAccess().getFullStopKeyword_4_1());
                    			

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
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleReferenceDeclaration"
    // InternalProblem.g:328:1: entryRuleReferenceDeclaration returns [EObject current=null] : iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF ;
    public final EObject entryRuleReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceDeclaration = null;


        try {
            // InternalProblem.g:328:61: (iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF )
            // InternalProblem.g:329:2: iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getReferenceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceDeclaration=ruleReferenceDeclaration();

            state._fsp--;

             current =iv_ruleReferenceDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceDeclaration"


    // $ANTLR start "ruleReferenceDeclaration"
    // InternalProblem.g:335:1: ruleReferenceDeclaration returns [EObject current=null] : ( ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' ) ( ( ruleQualifiedName ) ) (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_containment_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        EObject lv_multiplicity_4_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:341:2: ( ( ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' ) ( ( ruleQualifiedName ) ) (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )? ) )
            // InternalProblem.g:342:2: ( ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' ) ( ( ruleQualifiedName ) ) (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )? )
            {
            // InternalProblem.g:342:2: ( ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' ) ( ( ruleQualifiedName ) ) (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )? )
            // InternalProblem.g:343:3: ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' ) ( ( ruleQualifiedName ) ) (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )?
            {
            // InternalProblem.g:343:3: ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalProblem.g:344:4: ( (lv_containment_0_0= 'contains' ) )
                    {
                    // InternalProblem.g:344:4: ( (lv_containment_0_0= 'contains' ) )
                    // InternalProblem.g:345:5: (lv_containment_0_0= 'contains' )
                    {
                    // InternalProblem.g:345:5: (lv_containment_0_0= 'contains' )
                    // InternalProblem.g:346:6: lv_containment_0_0= 'contains'
                    {
                    lv_containment_0_0=(Token)match(input,21,FOLLOW_8); 

                    						newLeafNode(lv_containment_0_0, grammarAccess.getReferenceDeclarationAccess().getContainmentContainsKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceDeclarationRule());
                    						}
                    						setWithLastConsumed(current, "containment", lv_containment_0_0 != null, "contains");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:359:4: otherlv_1= 'refers'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getReferenceDeclarationAccess().getRefersKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalProblem.g:364:3: ( ( ruleQualifiedName ) )
            // InternalProblem.g:365:4: ( ruleQualifiedName )
            {
            // InternalProblem.g:365:4: ( ruleQualifiedName )
            // InternalProblem.g:366:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeClassDeclarationCrossReference_1_0());
            				
            pushFollow(FOLLOW_12);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProblem.g:380:3: (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalProblem.g:381:4: otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getReferenceDeclarationAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalProblem.g:385:4: ( (lv_multiplicity_4_0= ruleMultiplicity ) )
                    // InternalProblem.g:386:5: (lv_multiplicity_4_0= ruleMultiplicity )
                    {
                    // InternalProblem.g:386:5: (lv_multiplicity_4_0= ruleMultiplicity )
                    // InternalProblem.g:387:6: lv_multiplicity_4_0= ruleMultiplicity
                    {

                    						newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getMultiplicityMultiplicityParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_multiplicity_4_0=ruleMultiplicity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"multiplicity",
                    							lv_multiplicity_4_0,
                    							"org.eclipse.viatra.solver.language.Problem.Multiplicity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getReferenceDeclarationAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalProblem.g:409:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalProblem.g:410:4: (lv_name_6_0= RULE_ID )
            {
            // InternalProblem.g:410:4: (lv_name_6_0= RULE_ID )
            // InternalProblem.g:411:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_6_0, grammarAccess.getReferenceDeclarationAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalProblem.g:427:3: (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProblem.g:428:4: otherlv_7= 'opposite' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getReferenceDeclarationAccess().getOppositeKeyword_4_0());
                    			
                    // InternalProblem.g:432:4: ( ( ruleQualifiedName ) )
                    // InternalProblem.g:433:5: ( ruleQualifiedName )
                    {
                    // InternalProblem.g:433:5: ( ruleQualifiedName )
                    // InternalProblem.g:434:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceDeclarationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getOppositeReferenceDeclarationCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


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
    // $ANTLR end "ruleReferenceDeclaration"


    // $ANTLR start "entryRulePredicateDefinition"
    // InternalProblem.g:453:1: entryRulePredicateDefinition returns [EObject current=null] : iv_rulePredicateDefinition= rulePredicateDefinition EOF ;
    public final EObject entryRulePredicateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateDefinition = null;


        try {
            // InternalProblem.g:453:60: (iv_rulePredicateDefinition= rulePredicateDefinition EOF )
            // InternalProblem.g:454:2: iv_rulePredicateDefinition= rulePredicateDefinition EOF
            {
             newCompositeNode(grammarAccess.getPredicateDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicateDefinition=rulePredicateDefinition();

            state._fsp--;

             current =iv_rulePredicateDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicateDefinition"


    // $ANTLR start "rulePredicateDefinition"
    // InternalProblem.g:460:1: rulePredicateDefinition returns [EObject current=null] : ( ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.' ) ;
    public final EObject rulePredicateDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_error_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_bodies_10_0 = null;

        EObject lv_bodies_12_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:466:2: ( ( ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.' ) )
            // InternalProblem.g:467:2: ( ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.' )
            {
            // InternalProblem.g:467:2: ( ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.' )
            // InternalProblem.g:468:3: ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.'
            {
            // InternalProblem.g:468:3: ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalProblem.g:469:4: ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? )
                    {
                    // InternalProblem.g:469:4: ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? )
                    // InternalProblem.g:470:5: ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )?
                    {
                    // InternalProblem.g:470:5: ( (lv_error_0_0= 'error' ) )
                    // InternalProblem.g:471:6: (lv_error_0_0= 'error' )
                    {
                    // InternalProblem.g:471:6: (lv_error_0_0= 'error' )
                    // InternalProblem.g:472:7: lv_error_0_0= 'error'
                    {
                    lv_error_0_0=(Token)match(input,26,FOLLOW_16); 

                    							newLeafNode(lv_error_0_0, grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPredicateDefinitionRule());
                    							}
                    							setWithLastConsumed(current, "error", lv_error_0_0 != null, "error");
                    						

                    }


                    }

                    // InternalProblem.g:484:5: (otherlv_1= 'pred' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==27) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalProblem.g:485:6: otherlv_1= 'pred'
                            {
                            otherlv_1=(Token)match(input,27,FOLLOW_3); 

                            						newLeafNode(otherlv_1, grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_0_1());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:492:4: otherlv_2= 'pred'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalProblem.g:497:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalProblem.g:498:4: (lv_name_3_0= RULE_ID )
            {
            // InternalProblem.g:498:4: (lv_name_3_0= RULE_ID )
            // InternalProblem.g:499:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPredicateDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPredicateDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getPredicateDefinitionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalProblem.g:519:3: ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProblem.g:520:4: ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    {
                    // InternalProblem.g:520:4: ( (lv_parameters_5_0= ruleParameter ) )
                    // InternalProblem.g:521:5: (lv_parameters_5_0= ruleParameter )
                    {
                    // InternalProblem.g:521:5: (lv_parameters_5_0= ruleParameter )
                    // InternalProblem.g:522:6: lv_parameters_5_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getPredicateDefinitionAccess().getParametersParameterParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_parameters_5_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPredicateDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_5_0,
                    							"org.eclipse.viatra.solver.language.Problem.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProblem.g:539:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==17) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalProblem.g:540:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPredicateDefinitionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalProblem.g:544:5: ( (lv_parameters_7_0= ruleParameter ) )
                    	    // InternalProblem.g:545:6: (lv_parameters_7_0= ruleParameter )
                    	    {
                    	    // InternalProblem.g:545:6: (lv_parameters_7_0= ruleParameter )
                    	    // InternalProblem.g:546:7: lv_parameters_7_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPredicateDefinitionAccess().getParametersParameterParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_parameters_7_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPredicateDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_7_0,
                    	    								"org.eclipse.viatra.solver.language.Problem.Parameter");
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
                    break;

            }

            otherlv_8=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getPredicateDefinitionAccess().getRightParenthesisKeyword_4());
            		
            // InternalProblem.g:569:3: (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalProblem.g:570:4: otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )*
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getPredicateDefinitionAccess().getColonHyphenMinusKeyword_5_0());
                    			
                    // InternalProblem.g:574:4: ( (lv_bodies_10_0= ruleConjunction ) )
                    // InternalProblem.g:575:5: (lv_bodies_10_0= ruleConjunction )
                    {
                    // InternalProblem.g:575:5: (lv_bodies_10_0= ruleConjunction )
                    // InternalProblem.g:576:6: lv_bodies_10_0= ruleConjunction
                    {

                    						newCompositeNode(grammarAccess.getPredicateDefinitionAccess().getBodiesConjunctionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_bodies_10_0=ruleConjunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPredicateDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"bodies",
                    							lv_bodies_10_0,
                    							"org.eclipse.viatra.solver.language.Problem.Conjunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProblem.g:593:4: (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==19) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalProblem.g:594:5: otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_21); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPredicateDefinitionAccess().getSemicolonKeyword_5_2_0());
                    	    				
                    	    // InternalProblem.g:598:5: ( (lv_bodies_12_0= ruleConjunction ) )
                    	    // InternalProblem.g:599:6: (lv_bodies_12_0= ruleConjunction )
                    	    {
                    	    // InternalProblem.g:599:6: (lv_bodies_12_0= ruleConjunction )
                    	    // InternalProblem.g:600:7: lv_bodies_12_0= ruleConjunction
                    	    {

                    	    							newCompositeNode(grammarAccess.getPredicateDefinitionAccess().getBodiesConjunctionParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_bodies_12_0=ruleConjunction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPredicateDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"bodies",
                    	    								lv_bodies_12_0,
                    	    								"org.eclipse.viatra.solver.language.Problem.Conjunction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getPredicateDefinitionAccess().getFullStopKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicateDefinition"


    // $ANTLR start "entryRuleParameter"
    // InternalProblem.g:627:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalProblem.g:627:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalProblem.g:628:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalProblem.g:634:1: ruleParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalProblem.g:640:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalProblem.g:641:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalProblem.g:641:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalProblem.g:642:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalProblem.g:642:3: ( (otherlv_0= RULE_ID ) )
            // InternalProblem.g:643:4: (otherlv_0= RULE_ID )
            {
            // InternalProblem.g:643:4: (otherlv_0= RULE_ID )
            // InternalProblem.g:644:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterTypeClassDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalProblem.g:655:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProblem.g:656:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProblem.g:656:4: (lv_name_1_0= RULE_ID )
            // InternalProblem.g:657:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleConjunction"
    // InternalProblem.g:677:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // InternalProblem.g:677:52: (iv_ruleConjunction= ruleConjunction EOF )
            // InternalProblem.g:678:2: iv_ruleConjunction= ruleConjunction EOF
            {
             newCompositeNode(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;

             current =iv_ruleConjunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // InternalProblem.g:684:1: ruleConjunction returns [EObject current=null] : ( ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_literals_0_0 = null;

        EObject lv_literals_2_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:690:2: ( ( ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )* ) )
            // InternalProblem.g:691:2: ( ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )* )
            {
            // InternalProblem.g:691:2: ( ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )* )
            // InternalProblem.g:692:3: ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )*
            {
            // InternalProblem.g:692:3: ( (lv_literals_0_0= ruleLiteral ) )
            // InternalProblem.g:693:4: (lv_literals_0_0= ruleLiteral )
            {
            // InternalProblem.g:693:4: (lv_literals_0_0= ruleLiteral )
            // InternalProblem.g:694:5: lv_literals_0_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getConjunctionAccess().getLiteralsLiteralParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_literals_0_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConjunctionRule());
            					}
            					add(
            						current,
            						"literals",
            						lv_literals_0_0,
            						"org.eclipse.viatra.solver.language.Problem.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProblem.g:711:3: (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==17) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalProblem.g:712:4: otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConjunctionAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalProblem.g:716:4: ( (lv_literals_2_0= ruleLiteral ) )
            	    // InternalProblem.g:717:5: (lv_literals_2_0= ruleLiteral )
            	    {
            	    // InternalProblem.g:717:5: (lv_literals_2_0= ruleLiteral )
            	    // InternalProblem.g:718:6: lv_literals_2_0= ruleLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionAccess().getLiteralsLiteralParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_literals_2_0=ruleLiteral();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConjunctionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"literals",
            	    							lv_literals_2_0,
            	    							"org.eclipse.viatra.solver.language.Problem.Literal");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleLiteral"
    // InternalProblem.g:740:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalProblem.g:740:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalProblem.g:741:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalProblem.g:747:1: ruleLiteral returns [EObject current=null] : (this_Atom_0= ruleAtom | this_NegativeLiteral_1= ruleNegativeLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        EObject this_NegativeLiteral_1 = null;



        	enterRule();

        try {
            // InternalProblem.g:753:2: ( (this_Atom_0= ruleAtom | this_NegativeLiteral_1= ruleNegativeLiteral ) )
            // InternalProblem.g:754:2: (this_Atom_0= ruleAtom | this_NegativeLiteral_1= ruleNegativeLiteral )
            {
            // InternalProblem.g:754:2: (this_Atom_0= ruleAtom | this_NegativeLiteral_1= ruleNegativeLiteral )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==RULE_QUOTED_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==31) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalProblem.g:755:3: this_Atom_0= ruleAtom
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getAtomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atom_0=ruleAtom();

                    state._fsp--;


                    			current = this_Atom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:764:3: this_NegativeLiteral_1= ruleNegativeLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getNegativeLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NegativeLiteral_1=ruleNegativeLiteral();

                    state._fsp--;


                    			current = this_NegativeLiteral_1;
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleNegativeLiteral"
    // InternalProblem.g:776:1: entryRuleNegativeLiteral returns [EObject current=null] : iv_ruleNegativeLiteral= ruleNegativeLiteral EOF ;
    public final EObject entryRuleNegativeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegativeLiteral = null;


        try {
            // InternalProblem.g:776:56: (iv_ruleNegativeLiteral= ruleNegativeLiteral EOF )
            // InternalProblem.g:777:2: iv_ruleNegativeLiteral= ruleNegativeLiteral EOF
            {
             newCompositeNode(grammarAccess.getNegativeLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegativeLiteral=ruleNegativeLiteral();

            state._fsp--;

             current =iv_ruleNegativeLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegativeLiteral"


    // $ANTLR start "ruleNegativeLiteral"
    // InternalProblem.g:783:1: ruleNegativeLiteral returns [EObject current=null] : (otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) ) ) ;
    public final EObject ruleNegativeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_atom_1_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:789:2: ( (otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) ) ) )
            // InternalProblem.g:790:2: (otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) ) )
            {
            // InternalProblem.g:790:2: (otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) ) )
            // InternalProblem.g:791:3: otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNegativeLiteralAccess().getExclamationMarkKeyword_0());
            		
            // InternalProblem.g:795:3: ( (lv_atom_1_0= ruleAtom ) )
            // InternalProblem.g:796:4: (lv_atom_1_0= ruleAtom )
            {
            // InternalProblem.g:796:4: (lv_atom_1_0= ruleAtom )
            // InternalProblem.g:797:5: lv_atom_1_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getNegativeLiteralAccess().getAtomAtomParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_atom_1_0=ruleAtom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegativeLiteralRule());
            					}
            					set(
            						current,
            						"atom",
            						lv_atom_1_0,
            						"org.eclipse.viatra.solver.language.Problem.Atom");
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
    // $ANTLR end "ruleNegativeLiteral"


    // $ANTLR start "entryRuleAtom"
    // InternalProblem.g:818:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalProblem.g:818:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalProblem.g:819:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalProblem.g:825:1: ruleAtom returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_transitiveClosure_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:831:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')' ) )
            // InternalProblem.g:832:2: ( ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')' )
            {
            // InternalProblem.g:832:2: ( ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')' )
            // InternalProblem.g:833:3: ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')'
            {
            // InternalProblem.g:833:3: ( ( ruleQualifiedName ) )
            // InternalProblem.g:834:4: ( ruleQualifiedName )
            {
            // InternalProblem.g:834:4: ( ruleQualifiedName )
            // InternalProblem.g:835:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAtomAccess().getRelationRelationCrossReference_0_0());
            				
            pushFollow(FOLLOW_24);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProblem.g:849:3: ( (lv_transitiveClosure_1_0= '+' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalProblem.g:850:4: (lv_transitiveClosure_1_0= '+' )
                    {
                    // InternalProblem.g:850:4: (lv_transitiveClosure_1_0= '+' )
                    // InternalProblem.g:851:5: lv_transitiveClosure_1_0= '+'
                    {
                    lv_transitiveClosure_1_0=(Token)match(input,32,FOLLOW_17); 

                    					newLeafNode(lv_transitiveClosure_1_0, grammarAccess.getAtomAccess().getTransitiveClosurePlusSignKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomRule());
                    					}
                    					setWithLastConsumed(current, "transitiveClosure", lv_transitiveClosure_1_0 != null, "+");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2());
            		
            // InternalProblem.g:867:3: ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalProblem.g:868:4: ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
                    {
                    // InternalProblem.g:868:4: ( (lv_arguments_3_0= ruleArgument ) )
                    // InternalProblem.g:869:5: (lv_arguments_3_0= ruleArgument )
                    {
                    // InternalProblem.g:869:5: (lv_arguments_3_0= ruleArgument )
                    // InternalProblem.g:870:6: lv_arguments_3_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getAtomAccess().getArgumentsArgumentParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_arguments_3_0=ruleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"org.eclipse.viatra.solver.language.Problem.Argument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProblem.g:887:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==17) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalProblem.g:888:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAtomAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalProblem.g:892:5: ( (lv_arguments_5_0= ruleArgument ) )
                    	    // InternalProblem.g:893:6: (lv_arguments_5_0= ruleArgument )
                    	    {
                    	    // InternalProblem.g:893:6: (lv_arguments_5_0= ruleArgument )
                    	    // InternalProblem.g:894:7: lv_arguments_5_0= ruleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getAtomAccess().getArgumentsArgumentParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_arguments_5_0=ruleArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAtomRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_5_0,
                    	    								"org.eclipse.viatra.solver.language.Problem.Argument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAtomAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleArgument"
    // InternalProblem.g:921:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalProblem.g:921:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalProblem.g:922:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalProblem.g:928:1: ruleArgument returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalProblem.g:934:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalProblem.g:935:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalProblem.g:935:2: ( (otherlv_0= RULE_ID ) )
            // InternalProblem.g:936:3: (otherlv_0= RULE_ID )
            {
            // InternalProblem.g:936:3: (otherlv_0= RULE_ID )
            // InternalProblem.g:937:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getArgumentRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getArgumentAccess().getVariableVariableCrossReference_0());
            			

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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleAssertion"
    // InternalProblem.g:951:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalProblem.g:951:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalProblem.g:952:2: iv_ruleAssertion= ruleAssertion EOF
            {
             newCompositeNode(grammarAccess.getAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;

             current =iv_ruleAssertion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // InternalProblem.g:958:1: ruleAssertion returns [EObject current=null] : ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.' ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_value_7_0 = null;

        Enumerator lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:964:2: ( ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.' ) )
            // InternalProblem.g:965:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.' )
            {
            // InternalProblem.g:965:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.' )
            // InternalProblem.g:966:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.'
            {
            // InternalProblem.g:966:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalProblem.g:967:4: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) )
                    {
                    // InternalProblem.g:967:4: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) )
                    // InternalProblem.g:968:5: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) )
                    {
                    // InternalProblem.g:968:5: ( ( ruleQualifiedName ) )
                    // InternalProblem.g:969:6: ( ruleQualifiedName )
                    {
                    // InternalProblem.g:969:6: ( ruleQualifiedName )
                    // InternalProblem.g:970:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssertionRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssertionAccess().getRelationRelationCrossReference_0_0_0_0());
                    						
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,28,FOLLOW_25); 

                    					newLeafNode(otherlv_1, grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_0_1());
                    				
                    // InternalProblem.g:988:5: ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID||LA25_0==RULE_QUOTED_ID) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalProblem.g:989:6: ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalProblem.g:989:6: ( ( ruleQualifiedName ) )
                            // InternalProblem.g:990:7: ( ruleQualifiedName )
                            {
                            // InternalProblem.g:990:7: ( ruleQualifiedName )
                            // InternalProblem.g:991:8: ruleQualifiedName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssertionRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_0_2_0_0());
                            							
                            pushFollow(FOLLOW_19);
                            ruleQualifiedName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalProblem.g:1005:6: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==17) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // InternalProblem.g:1006:7: otherlv_3= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                            	    							newLeafNode(otherlv_3, grammarAccess.getAssertionAccess().getCommaKeyword_0_0_2_1_0());
                            	    						
                            	    // InternalProblem.g:1010:7: ( ( ruleQualifiedName ) )
                            	    // InternalProblem.g:1011:8: ( ruleQualifiedName )
                            	    {
                            	    // InternalProblem.g:1011:8: ( ruleQualifiedName )
                            	    // InternalProblem.g:1012:9: ruleQualifiedName
                            	    {

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getAssertionRule());
                            	    									}
                            	    								

                            	    									newCompositeNode(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_0_2_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_19);
                            	    ruleQualifiedName();

                            	    state._fsp--;


                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,29,FOLLOW_26); 

                    					newLeafNode(otherlv_5, grammarAccess.getAssertionAccess().getRightParenthesisKeyword_0_0_3());
                    				
                    otherlv_6=(Token)match(input,33,FOLLOW_27); 

                    					newLeafNode(otherlv_6, grammarAccess.getAssertionAccess().getColonKeyword_0_0_4());
                    				
                    // InternalProblem.g:1036:5: ( (lv_value_7_0= ruleLogicValue ) )
                    // InternalProblem.g:1037:6: (lv_value_7_0= ruleLogicValue )
                    {
                    // InternalProblem.g:1037:6: (lv_value_7_0= ruleLogicValue )
                    // InternalProblem.g:1038:7: lv_value_7_0= ruleLogicValue
                    {

                    							newCompositeNode(grammarAccess.getAssertionAccess().getValueLogicValueEnumRuleCall_0_0_5_0());
                    						
                    pushFollow(FOLLOW_4);
                    lv_value_7_0=ruleLogicValue();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssertionRule());
                    							}
                    							set(
                    								current,
                    								"value",
                    								lv_value_7_0,
                    								"org.eclipse.viatra.solver.language.Problem.LogicValue");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1057:4: ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' )
                    {
                    // InternalProblem.g:1057:4: ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' )
                    // InternalProblem.g:1058:5: ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')'
                    {
                    // InternalProblem.g:1058:5: ( (lv_value_8_0= ruleShortLogicValue ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==31||LA26_0==42) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalProblem.g:1059:6: (lv_value_8_0= ruleShortLogicValue )
                            {
                            // InternalProblem.g:1059:6: (lv_value_8_0= ruleShortLogicValue )
                            // InternalProblem.g:1060:7: lv_value_8_0= ruleShortLogicValue
                            {

                            							newCompositeNode(grammarAccess.getAssertionAccess().getValueShortLogicValueEnumRuleCall_0_1_0_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_value_8_0=ruleShortLogicValue();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssertionRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_8_0,
                            								"org.eclipse.viatra.solver.language.Problem.ShortLogicValue");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalProblem.g:1077:5: ( ( ruleQualifiedName ) )
                    // InternalProblem.g:1078:6: ( ruleQualifiedName )
                    {
                    // InternalProblem.g:1078:6: ( ruleQualifiedName )
                    // InternalProblem.g:1079:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssertionRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssertionAccess().getRelationRelationCrossReference_0_1_1_0());
                    						
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_10=(Token)match(input,28,FOLLOW_25); 

                    					newLeafNode(otherlv_10, grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_1_2());
                    				
                    // InternalProblem.g:1097:5: ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_ID||LA28_0==RULE_QUOTED_ID) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalProblem.g:1098:6: ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalProblem.g:1098:6: ( ( ruleQualifiedName ) )
                            // InternalProblem.g:1099:7: ( ruleQualifiedName )
                            {
                            // InternalProblem.g:1099:7: ( ruleQualifiedName )
                            // InternalProblem.g:1100:8: ruleQualifiedName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssertionRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_1_3_0_0());
                            							
                            pushFollow(FOLLOW_19);
                            ruleQualifiedName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalProblem.g:1114:6: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==17) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // InternalProblem.g:1115:7: otherlv_12= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_12=(Token)match(input,17,FOLLOW_8); 

                            	    							newLeafNode(otherlv_12, grammarAccess.getAssertionAccess().getCommaKeyword_0_1_3_1_0());
                            	    						
                            	    // InternalProblem.g:1119:7: ( ( ruleQualifiedName ) )
                            	    // InternalProblem.g:1120:8: ( ruleQualifiedName )
                            	    {
                            	    // InternalProblem.g:1120:8: ( ruleQualifiedName )
                            	    // InternalProblem.g:1121:9: ruleQualifiedName
                            	    {

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getAssertionRule());
                            	    									}
                            	    								

                            	    									newCompositeNode(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_1_3_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_19);
                            	    ruleQualifiedName();

                            	    state._fsp--;


                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,29,FOLLOW_4); 

                    					newLeafNode(otherlv_14, grammarAccess.getAssertionAccess().getRightParenthesisKeyword_0_1_4());
                    				

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getAssertionAccess().getFullStopKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleScopeDeclaration"
    // InternalProblem.g:1151:1: entryRuleScopeDeclaration returns [EObject current=null] : iv_ruleScopeDeclaration= ruleScopeDeclaration EOF ;
    public final EObject entryRuleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeDeclaration = null;


        try {
            // InternalProblem.g:1151:57: (iv_ruleScopeDeclaration= ruleScopeDeclaration EOF )
            // InternalProblem.g:1152:2: iv_ruleScopeDeclaration= ruleScopeDeclaration EOF
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
    // InternalProblem.g:1158:1: ruleScopeDeclaration returns [EObject current=null] : (otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.' ) ;
    public final EObject ruleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeScopes_1_0 = null;

        EObject lv_typeScopes_3_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1164:2: ( (otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.' ) )
            // InternalProblem.g:1165:2: (otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.' )
            {
            // InternalProblem.g:1165:2: (otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.' )
            // InternalProblem.g:1166:3: otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScopeDeclarationAccess().getScopeKeyword_0());
            		
            // InternalProblem.g:1170:3: ( (lv_typeScopes_1_0= ruleTypeScope ) )
            // InternalProblem.g:1171:4: (lv_typeScopes_1_0= ruleTypeScope )
            {
            // InternalProblem.g:1171:4: (lv_typeScopes_1_0= ruleTypeScope )
            // InternalProblem.g:1172:5: lv_typeScopes_1_0= ruleTypeScope
            {

            					newCompositeNode(grammarAccess.getScopeDeclarationAccess().getTypeScopesTypeScopeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_typeScopes_1_0=ruleTypeScope();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScopeDeclarationRule());
            					}
            					add(
            						current,
            						"typeScopes",
            						lv_typeScopes_1_0,
            						"org.eclipse.viatra.solver.language.Problem.TypeScope");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProblem.g:1189:3: (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==17) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalProblem.g:1190:4: otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getScopeDeclarationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalProblem.g:1194:4: ( (lv_typeScopes_3_0= ruleTypeScope ) )
            	    // InternalProblem.g:1195:5: (lv_typeScopes_3_0= ruleTypeScope )
            	    {
            	    // InternalProblem.g:1195:5: (lv_typeScopes_3_0= ruleTypeScope )
            	    // InternalProblem.g:1196:6: lv_typeScopes_3_0= ruleTypeScope
            	    {

            	    						newCompositeNode(grammarAccess.getScopeDeclarationAccess().getTypeScopesTypeScopeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_typeScopes_3_0=ruleTypeScope();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScopeDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"typeScopes",
            	    							lv_typeScopes_3_0,
            	    							"org.eclipse.viatra.solver.language.Problem.TypeScope");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getScopeDeclarationAccess().getFullStopKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleTypeScope"
    // InternalProblem.g:1222:1: entryRuleTypeScope returns [EObject current=null] : iv_ruleTypeScope= ruleTypeScope EOF ;
    public final EObject entryRuleTypeScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeScope = null;


        try {
            // InternalProblem.g:1222:50: (iv_ruleTypeScope= ruleTypeScope EOF )
            // InternalProblem.g:1223:2: iv_ruleTypeScope= ruleTypeScope EOF
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
    // InternalProblem.g:1229:1: ruleTypeScope returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) ) ) ;
    public final EObject ruleTypeScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_increment_1_0=null;
        Token otherlv_2=null;
        EObject lv_multiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1235:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) ) ) )
            // InternalProblem.g:1236:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) ) )
            {
            // InternalProblem.g:1236:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) ) )
            // InternalProblem.g:1237:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) )
            {
            // InternalProblem.g:1237:3: ( (otherlv_0= RULE_ID ) )
            // InternalProblem.g:1238:4: (otherlv_0= RULE_ID )
            {
            // InternalProblem.g:1238:4: (otherlv_0= RULE_ID )
            // InternalProblem.g:1239:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeScopeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_0, grammarAccess.getTypeScopeAccess().getTargetTypeClassDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalProblem.g:1250:3: ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            else if ( (LA31_0==36) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalProblem.g:1251:4: ( (lv_increment_1_0= '+=' ) )
                    {
                    // InternalProblem.g:1251:4: ( (lv_increment_1_0= '+=' ) )
                    // InternalProblem.g:1252:5: (lv_increment_1_0= '+=' )
                    {
                    // InternalProblem.g:1252:5: (lv_increment_1_0= '+=' )
                    // InternalProblem.g:1253:6: lv_increment_1_0= '+='
                    {
                    lv_increment_1_0=(Token)match(input,35,FOLLOW_13); 

                    						newLeafNode(lv_increment_1_0, grammarAccess.getTypeScopeAccess().getIncrementPlusSignEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeScopeRule());
                    						}
                    						setWithLastConsumed(current, "increment", lv_increment_1_0 != null, "+=");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1266:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeScopeAccess().getEqualsSignKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalProblem.g:1271:3: ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) )
            // InternalProblem.g:1272:4: (lv_multiplicity_3_0= ruleDefiniteMultiplicity )
            {
            // InternalProblem.g:1272:4: (lv_multiplicity_3_0= ruleDefiniteMultiplicity )
            // InternalProblem.g:1273:5: lv_multiplicity_3_0= ruleDefiniteMultiplicity
            {

            					newCompositeNode(grammarAccess.getTypeScopeAccess().getMultiplicityDefiniteMultiplicityParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_multiplicity_3_0=ruleDefiniteMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeScopeRule());
            					}
            					set(
            						current,
            						"multiplicity",
            						lv_multiplicity_3_0,
            						"org.eclipse.viatra.solver.language.Problem.DefiniteMultiplicity");
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
    // $ANTLR end "ruleTypeScope"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalProblem.g:1294:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalProblem.g:1294:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalProblem.g:1295:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;

             current =iv_ruleMultiplicity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalProblem.g:1301:1: ruleMultiplicity returns [EObject current=null] : (this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity | this_DefiniteMultiplicity_1= ruleDefiniteMultiplicity ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject this_UnboundedMultiplicity_0 = null;

        EObject this_DefiniteMultiplicity_1 = null;



        	enterRule();

        try {
            // InternalProblem.g:1307:2: ( (this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity | this_DefiniteMultiplicity_1= ruleDefiniteMultiplicity ) )
            // InternalProblem.g:1308:2: (this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity | this_DefiniteMultiplicity_1= ruleDefiniteMultiplicity )
            {
            // InternalProblem.g:1308:2: (this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity | this_DefiniteMultiplicity_1= ruleDefiniteMultiplicity )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==EOF||LA32_0==24) ) {
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
                    // InternalProblem.g:1309:3: this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity
                    {

                    			newCompositeNode(grammarAccess.getMultiplicityAccess().getUnboundedMultiplicityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnboundedMultiplicity_0=ruleUnboundedMultiplicity();

                    state._fsp--;


                    			current = this_UnboundedMultiplicity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:1318:3: this_DefiniteMultiplicity_1= ruleDefiniteMultiplicity
                    {

                    			newCompositeNode(grammarAccess.getMultiplicityAccess().getDefiniteMultiplicityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefiniteMultiplicity_1=ruleDefiniteMultiplicity();

                    state._fsp--;


                    			current = this_DefiniteMultiplicity_1;
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
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleDefiniteMultiplicity"
    // InternalProblem.g:1330:1: entryRuleDefiniteMultiplicity returns [EObject current=null] : iv_ruleDefiniteMultiplicity= ruleDefiniteMultiplicity EOF ;
    public final EObject entryRuleDefiniteMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefiniteMultiplicity = null;


        try {
            // InternalProblem.g:1330:61: (iv_ruleDefiniteMultiplicity= ruleDefiniteMultiplicity EOF )
            // InternalProblem.g:1331:2: iv_ruleDefiniteMultiplicity= ruleDefiniteMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getDefiniteMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefiniteMultiplicity=ruleDefiniteMultiplicity();

            state._fsp--;

             current =iv_ruleDefiniteMultiplicity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefiniteMultiplicity"


    // $ANTLR start "ruleDefiniteMultiplicity"
    // InternalProblem.g:1337:1: ruleDefiniteMultiplicity returns [EObject current=null] : (this_RangeMultiplicity_0= ruleRangeMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity ) ;
    public final EObject ruleDefiniteMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject this_RangeMultiplicity_0 = null;

        EObject this_ExactMultiplicity_1 = null;



        	enterRule();

        try {
            // InternalProblem.g:1343:2: ( (this_RangeMultiplicity_0= ruleRangeMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity ) )
            // InternalProblem.g:1344:2: (this_RangeMultiplicity_0= ruleRangeMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity )
            {
            // InternalProblem.g:1344:2: (this_RangeMultiplicity_0= ruleRangeMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==37) ) {
                    alt33=1;
                }
                else if ( (LA33_1==EOF||LA33_1==13||LA33_1==17||LA33_1==24) ) {
                    alt33=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalProblem.g:1345:3: this_RangeMultiplicity_0= ruleRangeMultiplicity
                    {

                    			newCompositeNode(grammarAccess.getDefiniteMultiplicityAccess().getRangeMultiplicityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RangeMultiplicity_0=ruleRangeMultiplicity();

                    state._fsp--;


                    			current = this_RangeMultiplicity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:1354:3: this_ExactMultiplicity_1= ruleExactMultiplicity
                    {

                    			newCompositeNode(grammarAccess.getDefiniteMultiplicityAccess().getExactMultiplicityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExactMultiplicity_1=ruleExactMultiplicity();

                    state._fsp--;


                    			current = this_ExactMultiplicity_1;
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
    // $ANTLR end "ruleDefiniteMultiplicity"


    // $ANTLR start "entryRuleUnboundedMultiplicity"
    // InternalProblem.g:1366:1: entryRuleUnboundedMultiplicity returns [EObject current=null] : iv_ruleUnboundedMultiplicity= ruleUnboundedMultiplicity EOF ;
    public final EObject entryRuleUnboundedMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnboundedMultiplicity = null;


        try {
            // InternalProblem.g:1366:62: (iv_ruleUnboundedMultiplicity= ruleUnboundedMultiplicity EOF )
            // InternalProblem.g:1367:2: iv_ruleUnboundedMultiplicity= ruleUnboundedMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getUnboundedMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnboundedMultiplicity=ruleUnboundedMultiplicity();

            state._fsp--;

             current =iv_ruleUnboundedMultiplicity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnboundedMultiplicity"


    // $ANTLR start "ruleUnboundedMultiplicity"
    // InternalProblem.g:1373:1: ruleUnboundedMultiplicity returns [EObject current=null] : () ;
    public final EObject ruleUnboundedMultiplicity() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalProblem.g:1379:2: ( () )
            // InternalProblem.g:1380:2: ()
            {
            // InternalProblem.g:1380:2: ()
            // InternalProblem.g:1381:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getUnboundedMultiplicityAccess().getUnboundedMultiplicityAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnboundedMultiplicity"


    // $ANTLR start "entryRuleRangeMultiplicity"
    // InternalProblem.g:1390:1: entryRuleRangeMultiplicity returns [EObject current=null] : iv_ruleRangeMultiplicity= ruleRangeMultiplicity EOF ;
    public final EObject entryRuleRangeMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeMultiplicity = null;


        try {
            // InternalProblem.g:1390:58: (iv_ruleRangeMultiplicity= ruleRangeMultiplicity EOF )
            // InternalProblem.g:1391:2: iv_ruleRangeMultiplicity= ruleRangeMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getRangeMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRangeMultiplicity=ruleRangeMultiplicity();

            state._fsp--;

             current =iv_ruleRangeMultiplicity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRangeMultiplicity"


    // $ANTLR start "ruleRangeMultiplicity"
    // InternalProblem.g:1397:1: ruleRangeMultiplicity returns [EObject current=null] : ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) ) ) ;
    public final EObject ruleRangeMultiplicity() throws RecognitionException {
        EObject current = null;

        Token lv_lowerBound_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1403:2: ( ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) ) ) )
            // InternalProblem.g:1404:2: ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) ) )
            {
            // InternalProblem.g:1404:2: ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) ) )
            // InternalProblem.g:1405:3: ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) )
            {
            // InternalProblem.g:1405:3: ( (lv_lowerBound_0_0= RULE_INT ) )
            // InternalProblem.g:1406:4: (lv_lowerBound_0_0= RULE_INT )
            {
            // InternalProblem.g:1406:4: (lv_lowerBound_0_0= RULE_INT )
            // InternalProblem.g:1407:5: lv_lowerBound_0_0= RULE_INT
            {
            lv_lowerBound_0_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            					newLeafNode(lv_lowerBound_0_0, grammarAccess.getRangeMultiplicityAccess().getLowerBoundINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeMultiplicityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lowerBound",
            						lv_lowerBound_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getRangeMultiplicityAccess().getFullStopFullStopKeyword_1());
            		
            // InternalProblem.g:1427:3: ( (lv_upperBound_2_0= ruleUpperBound ) )
            // InternalProblem.g:1428:4: (lv_upperBound_2_0= ruleUpperBound )
            {
            // InternalProblem.g:1428:4: (lv_upperBound_2_0= ruleUpperBound )
            // InternalProblem.g:1429:5: lv_upperBound_2_0= ruleUpperBound
            {

            					newCompositeNode(grammarAccess.getRangeMultiplicityAccess().getUpperBoundUpperBoundParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_upperBound_2_0=ruleUpperBound();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeMultiplicityRule());
            					}
            					set(
            						current,
            						"upperBound",
            						lv_upperBound_2_0,
            						"org.eclipse.viatra.solver.language.Problem.UpperBound");
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
    // $ANTLR end "ruleRangeMultiplicity"


    // $ANTLR start "entryRuleExactMultiplicity"
    // InternalProblem.g:1450:1: entryRuleExactMultiplicity returns [EObject current=null] : iv_ruleExactMultiplicity= ruleExactMultiplicity EOF ;
    public final EObject entryRuleExactMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactMultiplicity = null;


        try {
            // InternalProblem.g:1450:58: (iv_ruleExactMultiplicity= ruleExactMultiplicity EOF )
            // InternalProblem.g:1451:2: iv_ruleExactMultiplicity= ruleExactMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getExactMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExactMultiplicity=ruleExactMultiplicity();

            state._fsp--;

             current =iv_ruleExactMultiplicity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExactMultiplicity"


    // $ANTLR start "ruleExactMultiplicity"
    // InternalProblem.g:1457:1: ruleExactMultiplicity returns [EObject current=null] : ( (lv_exactValue_0_0= RULE_INT ) ) ;
    public final EObject ruleExactMultiplicity() throws RecognitionException {
        EObject current = null;

        Token lv_exactValue_0_0=null;


        	enterRule();

        try {
            // InternalProblem.g:1463:2: ( ( (lv_exactValue_0_0= RULE_INT ) ) )
            // InternalProblem.g:1464:2: ( (lv_exactValue_0_0= RULE_INT ) )
            {
            // InternalProblem.g:1464:2: ( (lv_exactValue_0_0= RULE_INT ) )
            // InternalProblem.g:1465:3: (lv_exactValue_0_0= RULE_INT )
            {
            // InternalProblem.g:1465:3: (lv_exactValue_0_0= RULE_INT )
            // InternalProblem.g:1466:4: lv_exactValue_0_0= RULE_INT
            {
            lv_exactValue_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_exactValue_0_0, grammarAccess.getExactMultiplicityAccess().getExactValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExactMultiplicityRule());
            				}
            				setWithLastConsumed(
            					current,
            					"exactValue",
            					lv_exactValue_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleExactMultiplicity"


    // $ANTLR start "entryRuleUpperBound"
    // InternalProblem.g:1485:1: entryRuleUpperBound returns [String current=null] : iv_ruleUpperBound= ruleUpperBound EOF ;
    public final String entryRuleUpperBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUpperBound = null;


        try {
            // InternalProblem.g:1485:50: (iv_ruleUpperBound= ruleUpperBound EOF )
            // InternalProblem.g:1486:2: iv_ruleUpperBound= ruleUpperBound EOF
            {
             newCompositeNode(grammarAccess.getUpperBoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpperBound=ruleUpperBound();

            state._fsp--;

             current =iv_ruleUpperBound.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpperBound"


    // $ANTLR start "ruleUpperBound"
    // InternalProblem.g:1492:1: ruleUpperBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUpperBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalProblem.g:1498:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalProblem.g:1499:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalProblem.g:1499:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT) ) {
                alt34=1;
            }
            else if ( (LA34_0==38) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalProblem.g:1500:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getUpperBoundAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:1508:3: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUpperBoundAccess().getAsteriskKeyword_1());
                    		

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
    // $ANTLR end "ruleUpperBound"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalProblem.g:1517:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalProblem.g:1517:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalProblem.g:1518:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalProblem.g:1524:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QUOTED_ID_0= RULE_QUOTED_ID | (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )* (kw= ':' this_QUOTED_ID_5= RULE_QUOTED_ID )? ) ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_QUOTED_ID_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_QUOTED_ID_5=null;


        	enterRule();

        try {
            // InternalProblem.g:1530:2: ( (this_QUOTED_ID_0= RULE_QUOTED_ID | (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )* (kw= ':' this_QUOTED_ID_5= RULE_QUOTED_ID )? ) ) )
            // InternalProblem.g:1531:2: (this_QUOTED_ID_0= RULE_QUOTED_ID | (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )* (kw= ':' this_QUOTED_ID_5= RULE_QUOTED_ID )? ) )
            {
            // InternalProblem.g:1531:2: (this_QUOTED_ID_0= RULE_QUOTED_ID | (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )* (kw= ':' this_QUOTED_ID_5= RULE_QUOTED_ID )? ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_QUOTED_ID) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalProblem.g:1532:3: this_QUOTED_ID_0= RULE_QUOTED_ID
                    {
                    this_QUOTED_ID_0=(Token)match(input,RULE_QUOTED_ID,FOLLOW_2); 

                    			current.merge(this_QUOTED_ID_0);
                    		

                    			newLeafNode(this_QUOTED_ID_0, grammarAccess.getQualifiedNameAccess().getQUOTED_IDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:1540:3: (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )* (kw= ':' this_QUOTED_ID_5= RULE_QUOTED_ID )? )
                    {
                    // InternalProblem.g:1540:3: (this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )* (kw= ':' this_QUOTED_ID_5= RULE_QUOTED_ID )? )
                    // InternalProblem.g:1541:4: this_ID_1= RULE_ID (kw= ':' this_ID_3= RULE_ID )* (kw= ':' this_QUOTED_ID_5= RULE_QUOTED_ID )?
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_32); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_0());
                    			
                    // InternalProblem.g:1548:4: (kw= ':' this_ID_3= RULE_ID )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==33) ) {
                            int LA35_1 = input.LA(2);

                            if ( (LA35_1==RULE_ID) ) {
                                alt35=1;
                            }


                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalProblem.g:1549:5: kw= ':' this_ID_3= RULE_ID
                    	    {
                    	    kw=(Token)match(input,33,FOLLOW_3); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonKeyword_1_1_0());
                    	    				
                    	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_32); 

                    	    					current.merge(this_ID_3);
                    	    				

                    	    					newLeafNode(this_ID_3, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    // InternalProblem.g:1562:4: (kw= ':' this_QUOTED_ID_5= RULE_QUOTED_ID )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==33) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalProblem.g:1563:5: kw= ':' this_QUOTED_ID_5= RULE_QUOTED_ID
                            {
                            kw=(Token)match(input,33,FOLLOW_33); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonKeyword_1_2_0());
                            				
                            this_QUOTED_ID_5=(Token)match(input,RULE_QUOTED_ID,FOLLOW_2); 

                            					current.merge(this_QUOTED_ID_5);
                            				

                            					newLeafNode(this_QUOTED_ID_5, grammarAccess.getQualifiedNameAccess().getQUOTED_IDTerminalRuleCall_1_2_1());
                            				

                            }
                            break;

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleLogicValue"
    // InternalProblem.g:1581:1: ruleLogicValue returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) ) ;
    public final Enumerator ruleLogicValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalProblem.g:1587:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) ) )
            // InternalProblem.g:1588:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) )
            {
            // InternalProblem.g:1588:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt38=1;
                }
                break;
            case 40:
                {
                alt38=2;
                }
                break;
            case 41:
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
                    // InternalProblem.g:1589:3: (enumLiteral_0= 'true' )
                    {
                    // InternalProblem.g:1589:3: (enumLiteral_0= 'true' )
                    // InternalProblem.g:1590:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1597:3: (enumLiteral_1= 'false' )
                    {
                    // InternalProblem.g:1597:3: (enumLiteral_1= 'false' )
                    // InternalProblem.g:1598:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:1605:3: (enumLiteral_2= 'unknown' )
                    {
                    // InternalProblem.g:1605:3: (enumLiteral_2= 'unknown' )
                    // InternalProblem.g:1606:4: enumLiteral_2= 'unknown'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleLogicValue"


    // $ANTLR start "ruleShortLogicValue"
    // InternalProblem.g:1616:1: ruleShortLogicValue returns [Enumerator current=null] : ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) ) ;
    public final Enumerator ruleShortLogicValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalProblem.g:1622:2: ( ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) ) )
            // InternalProblem.g:1623:2: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) )
            {
            // InternalProblem.g:1623:2: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==31) ) {
                alt39=1;
            }
            else if ( (LA39_0==42) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalProblem.g:1624:3: (enumLiteral_0= '!' )
                    {
                    // InternalProblem.g:1624:3: (enumLiteral_0= '!' )
                    // InternalProblem.g:1625:4: enumLiteral_0= '!'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1632:3: (enumLiteral_1= '?' )
                    {
                    // InternalProblem.g:1632:3: (enumLiteral_1= '?' )
                    // InternalProblem.g:1633:4: enumLiteral_1= '?'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getShortLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getShortLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleShortLogicValue"

    // Delegated rules


    protected DFA29 dfa29 = new DFA29(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\4\2\34\1\uffff\2\4\2\21\1\15\2\34\2\4\1\uffff\4\21\1\4\2\21";
    static final String dfa_3s = "\1\52\1\34\1\41\1\uffff\1\35\1\6\1\35\2\41\1\34\1\41\2\6\1\uffff\1\35\1\41\1\35\1\41\1\6\1\35\1\41";
    static final String dfa_4s = "\3\uffff\1\2\11\uffff\1\1\7\uffff";
    static final String dfa_5s = "\25\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\uffff\1\1\30\uffff\1\3\12\uffff\1\3",
            "\1\4",
            "\1\4\4\uffff\1\5",
            "",
            "\1\7\1\uffff\1\6\26\uffff\1\10",
            "\1\12\1\uffff\1\11",
            "\1\13\13\uffff\1\10",
            "\1\13\13\uffff\1\10\3\uffff\1\14",
            "\1\3\23\uffff\1\15",
            "\1\4",
            "\1\4\4\uffff\1\5",
            "\1\17\1\uffff\1\16",
            "\1\21\1\uffff\1\20",
            "",
            "\1\13\13\uffff\1\10",
            "\1\13\13\uffff\1\10\3\uffff\1\22",
            "\1\13\13\uffff\1\10",
            "\1\13\13\uffff\1\10\3\uffff\1\14",
            "\1\24\1\uffff\1\23",
            "\1\13\13\uffff\1\10",
            "\1\13\13\uffff\1\10\3\uffff\1\22"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "966:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000004048C00C052L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000052000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000050L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000050L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});

}