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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'abstract'", "'class'", "'extends'", "'['", "','", "']'", "'.'", "'contains'", "'refers'", "'opposite'", "'error'", "'pred'", "'('", "')'", "':='", "';'", "'!'", "'+'", "':'", "'scope'", "'+='", "'='", "'..'", "'*'", "'::'", "'true'", "'false'", "'unknown'", "'?'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__20=20;
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
    // InternalProblem.g:72:1: ruleProblem returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleProblem() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalProblem.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalProblem.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=11 && LA1_0<=12)||(LA1_0>=21 && LA1_0<=22)||LA1_0==27||LA1_0==30||LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProblem.g:80:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalProblem.g:80:3: (lv_statements_0_0= ruleStatement )
            	    // InternalProblem.g:81:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getProblemAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProblemRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"org.eclipse.viatra.solver.language.Problem.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

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
    // $ANTLR end "ruleProblem"


    // $ANTLR start "entryRuleStatement"
    // InternalProblem.g:101:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalProblem.g:101:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalProblem.g:102:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalProblem.g:108:1: ruleStatement returns [EObject current=null] : (this_ClassDeclaration_0= ruleClassDeclaration | this_PredicateDefinition_1= rulePredicateDefinition | this_Assertion_2= ruleAssertion | this_ScopeDeclaration_3= ruleScopeDeclaration ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDeclaration_0 = null;

        EObject this_PredicateDefinition_1 = null;

        EObject this_Assertion_2 = null;

        EObject this_ScopeDeclaration_3 = null;



        	enterRule();

        try {
            // InternalProblem.g:114:2: ( (this_ClassDeclaration_0= ruleClassDeclaration | this_PredicateDefinition_1= rulePredicateDefinition | this_Assertion_2= ruleAssertion | this_ScopeDeclaration_3= ruleScopeDeclaration ) )
            // InternalProblem.g:115:2: (this_ClassDeclaration_0= ruleClassDeclaration | this_PredicateDefinition_1= rulePredicateDefinition | this_Assertion_2= ruleAssertion | this_ScopeDeclaration_3= ruleScopeDeclaration )
            {
            // InternalProblem.g:115:2: (this_ClassDeclaration_0= ruleClassDeclaration | this_PredicateDefinition_1= rulePredicateDefinition | this_Assertion_2= ruleAssertion | this_ScopeDeclaration_3= ruleScopeDeclaration )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt2=1;
                }
                break;
            case 21:
            case 22:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
            case 27:
            case 39:
                {
                alt2=3;
                }
                break;
            case 30:
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
                    // InternalProblem.g:116:3: this_ClassDeclaration_0= ruleClassDeclaration
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
                    // InternalProblem.g:125:3: this_PredicateDefinition_1= rulePredicateDefinition
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
                    // InternalProblem.g:134:3: this_Assertion_2= ruleAssertion
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
                    // InternalProblem.g:143:3: this_ScopeDeclaration_3= ruleScopeDeclaration
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
    // InternalProblem.g:155:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalProblem.g:155:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalProblem.g:156:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
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
    // InternalProblem.g:162:1: ruleClassDeclaration returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'extends' ( ( (otherlv_4= RULE_ID ) ) | (otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ']' ) ) ) | ( (lv_referenceDeclarations_10_0= ruleReferenceDeclaration ) ) )? (otherlv_11= ',' ( (lv_referenceDeclarations_12_0= ruleReferenceDeclaration ) ) )* otherlv_13= '.' ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_referenceDeclarations_10_0 = null;

        EObject lv_referenceDeclarations_12_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:168:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'extends' ( ( (otherlv_4= RULE_ID ) ) | (otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ']' ) ) ) | ( (lv_referenceDeclarations_10_0= ruleReferenceDeclaration ) ) )? (otherlv_11= ',' ( (lv_referenceDeclarations_12_0= ruleReferenceDeclaration ) ) )* otherlv_13= '.' ) )
            // InternalProblem.g:169:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'extends' ( ( (otherlv_4= RULE_ID ) ) | (otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ']' ) ) ) | ( (lv_referenceDeclarations_10_0= ruleReferenceDeclaration ) ) )? (otherlv_11= ',' ( (lv_referenceDeclarations_12_0= ruleReferenceDeclaration ) ) )* otherlv_13= '.' )
            {
            // InternalProblem.g:169:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'extends' ( ( (otherlv_4= RULE_ID ) ) | (otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ']' ) ) ) | ( (lv_referenceDeclarations_10_0= ruleReferenceDeclaration ) ) )? (otherlv_11= ',' ( (lv_referenceDeclarations_12_0= ruleReferenceDeclaration ) ) )* otherlv_13= '.' )
            // InternalProblem.g:170:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'extends' ( ( (otherlv_4= RULE_ID ) ) | (otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ']' ) ) ) | ( (lv_referenceDeclarations_10_0= ruleReferenceDeclaration ) ) )? (otherlv_11= ',' ( (lv_referenceDeclarations_12_0= ruleReferenceDeclaration ) ) )* otherlv_13= '.'
            {
            // InternalProblem.g:170:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalProblem.g:171:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalProblem.g:171:4: (lv_abstract_0_0= 'abstract' )
                    // InternalProblem.g:172:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,11,FOLLOW_4); 

                    					newLeafNode(lv_abstract_0_0, grammarAccess.getClassDeclarationAccess().getAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "abstract", lv_abstract_0_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDeclarationAccess().getClassKeyword_1());
            		
            // InternalProblem.g:188:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalProblem.g:189:4: (lv_name_2_0= RULE_ID )
            {
            // InternalProblem.g:189:4: (lv_name_2_0= RULE_ID )
            // InternalProblem.g:190:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            // InternalProblem.g:206:3: ( (otherlv_3= 'extends' ( ( (otherlv_4= RULE_ID ) ) | (otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ']' ) ) ) | ( (lv_referenceDeclarations_10_0= ruleReferenceDeclaration ) ) )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=18 && LA7_0<=19)) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // InternalProblem.g:207:4: (otherlv_3= 'extends' ( ( (otherlv_4= RULE_ID ) ) | (otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ']' ) ) )
                    {
                    // InternalProblem.g:207:4: (otherlv_3= 'extends' ( ( (otherlv_4= RULE_ID ) ) | (otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ']' ) ) )
                    // InternalProblem.g:208:5: otherlv_3= 'extends' ( ( (otherlv_4= RULE_ID ) ) | (otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ']' ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_7); 

                    					newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getExtendsKeyword_3_0_0());
                    				
                    // InternalProblem.g:212:5: ( ( (otherlv_4= RULE_ID ) ) | (otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ']' ) )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==14) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalProblem.g:213:6: ( (otherlv_4= RULE_ID ) )
                            {
                            // InternalProblem.g:213:6: ( (otherlv_4= RULE_ID ) )
                            // InternalProblem.g:214:7: (otherlv_4= RULE_ID )
                            {
                            // InternalProblem.g:214:7: (otherlv_4= RULE_ID )
                            // InternalProblem.g:215:8: otherlv_4= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassDeclarationRule());
                            								}
                            							
                            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); 

                            								newLeafNode(otherlv_4, grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationCrossReference_3_0_1_0_0());
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalProblem.g:227:6: (otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ']' )
                            {
                            // InternalProblem.g:227:6: (otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ']' )
                            // InternalProblem.g:228:7: otherlv_5= '[' ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= ']'
                            {
                            otherlv_5=(Token)match(input,14,FOLLOW_9); 

                            							newLeafNode(otherlv_5, grammarAccess.getClassDeclarationAccess().getLeftSquareBracketKeyword_3_0_1_1_0());
                            						
                            // InternalProblem.g:232:7: ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )?
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==RULE_ID) ) {
                                alt5=1;
                            }
                            switch (alt5) {
                                case 1 :
                                    // InternalProblem.g:233:8: ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                                    {
                                    // InternalProblem.g:233:8: ( (otherlv_6= RULE_ID ) )
                                    // InternalProblem.g:234:9: (otherlv_6= RULE_ID )
                                    {
                                    // InternalProblem.g:234:9: (otherlv_6= RULE_ID )
                                    // InternalProblem.g:235:10: otherlv_6= RULE_ID
                                    {

                                    										if (current==null) {
                                    											current = createModelElement(grammarAccess.getClassDeclarationRule());
                                    										}
                                    									
                                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); 

                                    										newLeafNode(otherlv_6, grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationCrossReference_3_0_1_1_1_0_0());
                                    									

                                    }


                                    }

                                    // InternalProblem.g:246:8: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                                    loop4:
                                    do {
                                        int alt4=2;
                                        int LA4_0 = input.LA(1);

                                        if ( (LA4_0==15) ) {
                                            alt4=1;
                                        }


                                        switch (alt4) {
                                    	case 1 :
                                    	    // InternalProblem.g:247:9: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                                    	    {
                                    	    otherlv_7=(Token)match(input,15,FOLLOW_5); 

                                    	    									newLeafNode(otherlv_7, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_0_1_1_1_1_0());
                                    	    								
                                    	    // InternalProblem.g:251:9: ( (otherlv_8= RULE_ID ) )
                                    	    // InternalProblem.g:252:10: (otherlv_8= RULE_ID )
                                    	    {
                                    	    // InternalProblem.g:252:10: (otherlv_8= RULE_ID )
                                    	    // InternalProblem.g:253:11: otherlv_8= RULE_ID
                                    	    {

                                    	    											if (current==null) {
                                    	    												current = createModelElement(grammarAccess.getClassDeclarationRule());
                                    	    											}
                                    	    										
                                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_10); 

                                    	    											newLeafNode(otherlv_8, grammarAccess.getClassDeclarationAccess().getSuperTypesClassDeclarationCrossReference_3_0_1_1_1_1_1_0());
                                    	    										

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop4;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            otherlv_9=(Token)match(input,16,FOLLOW_8); 

                            							newLeafNode(otherlv_9, grammarAccess.getClassDeclarationAccess().getRightSquareBracketKeyword_3_0_1_1_2());
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:274:4: ( (lv_referenceDeclarations_10_0= ruleReferenceDeclaration ) )
                    {
                    // InternalProblem.g:274:4: ( (lv_referenceDeclarations_10_0= ruleReferenceDeclaration ) )
                    // InternalProblem.g:275:5: (lv_referenceDeclarations_10_0= ruleReferenceDeclaration )
                    {
                    // InternalProblem.g:275:5: (lv_referenceDeclarations_10_0= ruleReferenceDeclaration )
                    // InternalProblem.g:276:6: lv_referenceDeclarations_10_0= ruleReferenceDeclaration
                    {

                    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsReferenceDeclarationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_referenceDeclarations_10_0=ruleReferenceDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"referenceDeclarations",
                    							lv_referenceDeclarations_10_0,
                    							"org.eclipse.viatra.solver.language.Problem.ReferenceDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProblem.g:294:3: (otherlv_11= ',' ( (lv_referenceDeclarations_12_0= ruleReferenceDeclaration ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalProblem.g:295:4: otherlv_11= ',' ( (lv_referenceDeclarations_12_0= ruleReferenceDeclaration ) )
            	    {
            	    otherlv_11=(Token)match(input,15,FOLLOW_11); 

            	    				newLeafNode(otherlv_11, grammarAccess.getClassDeclarationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalProblem.g:299:4: ( (lv_referenceDeclarations_12_0= ruleReferenceDeclaration ) )
            	    // InternalProblem.g:300:5: (lv_referenceDeclarations_12_0= ruleReferenceDeclaration )
            	    {
            	    // InternalProblem.g:300:5: (lv_referenceDeclarations_12_0= ruleReferenceDeclaration )
            	    // InternalProblem.g:301:6: lv_referenceDeclarations_12_0= ruleReferenceDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getReferenceDeclarationsReferenceDeclarationParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_referenceDeclarations_12_0=ruleReferenceDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"referenceDeclarations",
            	    							lv_referenceDeclarations_12_0,
            	    							"org.eclipse.viatra.solver.language.Problem.ReferenceDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getClassDeclarationAccess().getFullStopKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalProblem.g:327:1: entryRuleReferenceDeclaration returns [EObject current=null] : iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF ;
    public final EObject entryRuleReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceDeclaration = null;


        try {
            // InternalProblem.g:327:61: (iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF )
            // InternalProblem.g:328:2: iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF
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
    // InternalProblem.g:334:1: ruleReferenceDeclaration returns [EObject current=null] : ( ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_containment_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        EObject lv_multiplicity_4_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:340:2: ( ( ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )? ) )
            // InternalProblem.g:341:2: ( ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )? )
            {
            // InternalProblem.g:341:2: ( ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )? )
            // InternalProblem.g:342:3: ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )?
            {
            // InternalProblem.g:342:3: ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalProblem.g:343:4: ( (lv_containment_0_0= 'contains' ) )
                    {
                    // InternalProblem.g:343:4: ( (lv_containment_0_0= 'contains' ) )
                    // InternalProblem.g:344:5: (lv_containment_0_0= 'contains' )
                    {
                    // InternalProblem.g:344:5: (lv_containment_0_0= 'contains' )
                    // InternalProblem.g:345:6: lv_containment_0_0= 'contains'
                    {
                    lv_containment_0_0=(Token)match(input,18,FOLLOW_5); 

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
                    // InternalProblem.g:358:4: otherlv_1= 'refers'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getReferenceDeclarationAccess().getRefersKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalProblem.g:363:3: ( (otherlv_2= RULE_ID ) )
            // InternalProblem.g:364:4: (otherlv_2= RULE_ID )
            {
            // InternalProblem.g:364:4: (otherlv_2= RULE_ID )
            // InternalProblem.g:365:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceDeclarationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_2, grammarAccess.getReferenceDeclarationAccess().getReferenceTypeClassDeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceDeclarationAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalProblem.g:380:3: ( (lv_multiplicity_4_0= ruleMultiplicity ) )
            // InternalProblem.g:381:4: (lv_multiplicity_4_0= ruleMultiplicity )
            {
            // InternalProblem.g:381:4: (lv_multiplicity_4_0= ruleMultiplicity )
            // InternalProblem.g:382:5: lv_multiplicity_4_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getMultiplicityMultiplicityParserRuleCall_3_0());
            				
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

            otherlv_5=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceDeclarationAccess().getRightSquareBracketKeyword_4());
            		
            // InternalProblem.g:403:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalProblem.g:404:4: (lv_name_6_0= RULE_ID )
            {
            // InternalProblem.g:404:4: (lv_name_6_0= RULE_ID )
            // InternalProblem.g:405:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_6_0, grammarAccess.getReferenceDeclarationAccess().getNameIDTerminalRuleCall_5_0());
            				

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

            // InternalProblem.g:421:3: (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalProblem.g:422:4: otherlv_7= 'opposite' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getReferenceDeclarationAccess().getOppositeKeyword_6_0());
                    			
                    // InternalProblem.g:426:4: ( ( ruleQualifiedName ) )
                    // InternalProblem.g:427:5: ( ruleQualifiedName )
                    {
                    // InternalProblem.g:427:5: ( ruleQualifiedName )
                    // InternalProblem.g:428:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceDeclarationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getOppositeReferenceDeclarationCrossReference_6_1_0());
                    					
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
    // InternalProblem.g:447:1: entryRulePredicateDefinition returns [EObject current=null] : iv_rulePredicateDefinition= rulePredicateDefinition EOF ;
    public final EObject entryRulePredicateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateDefinition = null;


        try {
            // InternalProblem.g:447:60: (iv_rulePredicateDefinition= rulePredicateDefinition EOF )
            // InternalProblem.g:448:2: iv_rulePredicateDefinition= rulePredicateDefinition EOF
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
    // InternalProblem.g:454:1: rulePredicateDefinition returns [EObject current=null] : ( ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':=' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.' ) ;
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
            // InternalProblem.g:460:2: ( ( ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':=' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.' ) )
            // InternalProblem.g:461:2: ( ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':=' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.' )
            {
            // InternalProblem.g:461:2: ( ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':=' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.' )
            // InternalProblem.g:462:3: ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':=' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.'
            {
            // InternalProblem.g:462:3: ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalProblem.g:463:4: ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? )
                    {
                    // InternalProblem.g:463:4: ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? )
                    // InternalProblem.g:464:5: ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )?
                    {
                    // InternalProblem.g:464:5: ( (lv_error_0_0= 'error' ) )
                    // InternalProblem.g:465:6: (lv_error_0_0= 'error' )
                    {
                    // InternalProblem.g:465:6: (lv_error_0_0= 'error' )
                    // InternalProblem.g:466:7: lv_error_0_0= 'error'
                    {
                    lv_error_0_0=(Token)match(input,21,FOLLOW_16); 

                    							newLeafNode(lv_error_0_0, grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPredicateDefinitionRule());
                    							}
                    							setWithLastConsumed(current, "error", lv_error_0_0 != null, "error");
                    						

                    }


                    }

                    // InternalProblem.g:478:5: (otherlv_1= 'pred' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==22) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalProblem.g:479:6: otherlv_1= 'pred'
                            {
                            otherlv_1=(Token)match(input,22,FOLLOW_5); 

                            						newLeafNode(otherlv_1, grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_0_1());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:486:4: otherlv_2= 'pred'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalProblem.g:491:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalProblem.g:492:4: (lv_name_3_0= RULE_ID )
            {
            // InternalProblem.g:492:4: (lv_name_3_0= RULE_ID )
            // InternalProblem.g:493:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getPredicateDefinitionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalProblem.g:513:3: ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalProblem.g:514:4: ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    {
                    // InternalProblem.g:514:4: ( (lv_parameters_5_0= ruleParameter ) )
                    // InternalProblem.g:515:5: (lv_parameters_5_0= ruleParameter )
                    {
                    // InternalProblem.g:515:5: (lv_parameters_5_0= ruleParameter )
                    // InternalProblem.g:516:6: lv_parameters_5_0= ruleParameter
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

                    // InternalProblem.g:533:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalProblem.g:534:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPredicateDefinitionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalProblem.g:538:5: ( (lv_parameters_7_0= ruleParameter ) )
                    	    // InternalProblem.g:539:6: (lv_parameters_7_0= ruleParameter )
                    	    {
                    	    // InternalProblem.g:539:6: (lv_parameters_7_0= ruleParameter )
                    	    // InternalProblem.g:540:7: lv_parameters_7_0= ruleParameter
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
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getPredicateDefinitionAccess().getRightParenthesisKeyword_4());
            		
            // InternalProblem.g:563:3: (otherlv_9= ':=' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProblem.g:564:4: otherlv_9= ':=' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )*
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getPredicateDefinitionAccess().getColonEqualsSignKeyword_5_0());
                    			
                    // InternalProblem.g:568:4: ( (lv_bodies_10_0= ruleConjunction ) )
                    // InternalProblem.g:569:5: (lv_bodies_10_0= ruleConjunction )
                    {
                    // InternalProblem.g:569:5: (lv_bodies_10_0= ruleConjunction )
                    // InternalProblem.g:570:6: lv_bodies_10_0= ruleConjunction
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

                    // InternalProblem.g:587:4: (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==26) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalProblem.g:588:5: otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) )
                    	    {
                    	    otherlv_11=(Token)match(input,26,FOLLOW_21); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPredicateDefinitionAccess().getSemicolonKeyword_5_2_0());
                    	    				
                    	    // InternalProblem.g:592:5: ( (lv_bodies_12_0= ruleConjunction ) )
                    	    // InternalProblem.g:593:6: (lv_bodies_12_0= ruleConjunction )
                    	    {
                    	    // InternalProblem.g:593:6: (lv_bodies_12_0= ruleConjunction )
                    	    // InternalProblem.g:594:7: lv_bodies_12_0= ruleConjunction
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
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

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
    // InternalProblem.g:621:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalProblem.g:621:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalProblem.g:622:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalProblem.g:628:1: ruleParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalProblem.g:634:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalProblem.g:635:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalProblem.g:635:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalProblem.g:636:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalProblem.g:636:3: ( (otherlv_0= RULE_ID ) )
            // InternalProblem.g:637:4: (otherlv_0= RULE_ID )
            {
            // InternalProblem.g:637:4: (otherlv_0= RULE_ID )
            // InternalProblem.g:638:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterTypeClassDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalProblem.g:649:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProblem.g:650:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProblem.g:650:4: (lv_name_1_0= RULE_ID )
            // InternalProblem.g:651:5: lv_name_1_0= RULE_ID
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
    // InternalProblem.g:671:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // InternalProblem.g:671:52: (iv_ruleConjunction= ruleConjunction EOF )
            // InternalProblem.g:672:2: iv_ruleConjunction= ruleConjunction EOF
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
    // InternalProblem.g:678:1: ruleConjunction returns [EObject current=null] : ( ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_literals_0_0 = null;

        EObject lv_literals_2_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:684:2: ( ( ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )* ) )
            // InternalProblem.g:685:2: ( ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )* )
            {
            // InternalProblem.g:685:2: ( ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )* )
            // InternalProblem.g:686:3: ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )*
            {
            // InternalProblem.g:686:3: ( (lv_literals_0_0= ruleLiteral ) )
            // InternalProblem.g:687:4: (lv_literals_0_0= ruleLiteral )
            {
            // InternalProblem.g:687:4: (lv_literals_0_0= ruleLiteral )
            // InternalProblem.g:688:5: lv_literals_0_0= ruleLiteral
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

            // InternalProblem.g:705:3: (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalProblem.g:706:4: otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConjunctionAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalProblem.g:710:4: ( (lv_literals_2_0= ruleLiteral ) )
            	    // InternalProblem.g:711:5: (lv_literals_2_0= ruleLiteral )
            	    {
            	    // InternalProblem.g:711:5: (lv_literals_2_0= ruleLiteral )
            	    // InternalProblem.g:712:6: lv_literals_2_0= ruleLiteral
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
            	    break loop17;
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
    // InternalProblem.g:734:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalProblem.g:734:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalProblem.g:735:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalProblem.g:741:1: ruleLiteral returns [EObject current=null] : (this_Atom_0= ruleAtom | this_NegativeLiteral_1= ruleNegativeLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        EObject this_NegativeLiteral_1 = null;



        	enterRule();

        try {
            // InternalProblem.g:747:2: ( (this_Atom_0= ruleAtom | this_NegativeLiteral_1= ruleNegativeLiteral ) )
            // InternalProblem.g:748:2: (this_Atom_0= ruleAtom | this_NegativeLiteral_1= ruleNegativeLiteral )
            {
            // InternalProblem.g:748:2: (this_Atom_0= ruleAtom | this_NegativeLiteral_1= ruleNegativeLiteral )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==27) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalProblem.g:749:3: this_Atom_0= ruleAtom
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
                    // InternalProblem.g:758:3: this_NegativeLiteral_1= ruleNegativeLiteral
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
    // InternalProblem.g:770:1: entryRuleNegativeLiteral returns [EObject current=null] : iv_ruleNegativeLiteral= ruleNegativeLiteral EOF ;
    public final EObject entryRuleNegativeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegativeLiteral = null;


        try {
            // InternalProblem.g:770:56: (iv_ruleNegativeLiteral= ruleNegativeLiteral EOF )
            // InternalProblem.g:771:2: iv_ruleNegativeLiteral= ruleNegativeLiteral EOF
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
    // InternalProblem.g:777:1: ruleNegativeLiteral returns [EObject current=null] : (otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) ) ) ;
    public final EObject ruleNegativeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_atom_1_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:783:2: ( (otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) ) ) )
            // InternalProblem.g:784:2: (otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) ) )
            {
            // InternalProblem.g:784:2: (otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) ) )
            // InternalProblem.g:785:3: otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNegativeLiteralAccess().getExclamationMarkKeyword_0());
            		
            // InternalProblem.g:789:3: ( (lv_atom_1_0= ruleAtom ) )
            // InternalProblem.g:790:4: (lv_atom_1_0= ruleAtom )
            {
            // InternalProblem.g:790:4: (lv_atom_1_0= ruleAtom )
            // InternalProblem.g:791:5: lv_atom_1_0= ruleAtom
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
    // InternalProblem.g:812:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalProblem.g:812:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalProblem.g:813:2: iv_ruleAtom= ruleAtom EOF
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
    // InternalProblem.g:819:1: ruleAtom returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_transitiveClosure_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalProblem.g:825:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' ) )
            // InternalProblem.g:826:2: ( ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' )
            {
            // InternalProblem.g:826:2: ( ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' )
            // InternalProblem.g:827:3: ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')'
            {
            // InternalProblem.g:827:3: ( ( ruleQualifiedName ) )
            // InternalProblem.g:828:4: ( ruleQualifiedName )
            {
            // InternalProblem.g:828:4: ( ruleQualifiedName )
            // InternalProblem.g:829:5: ruleQualifiedName
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

            // InternalProblem.g:843:3: ( (lv_transitiveClosure_1_0= '+' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProblem.g:844:4: (lv_transitiveClosure_1_0= '+' )
                    {
                    // InternalProblem.g:844:4: (lv_transitiveClosure_1_0= '+' )
                    // InternalProblem.g:845:5: lv_transitiveClosure_1_0= '+'
                    {
                    lv_transitiveClosure_1_0=(Token)match(input,28,FOLLOW_17); 

                    					newLeafNode(lv_transitiveClosure_1_0, grammarAccess.getAtomAccess().getTransitiveClosurePlusSignKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomRule());
                    					}
                    					setWithLastConsumed(current, "transitiveClosure", lv_transitiveClosure_1_0 != null, "+");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2());
            		
            // InternalProblem.g:861:3: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalProblem.g:862:4: ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    // InternalProblem.g:862:4: ( (otherlv_3= RULE_ID ) )
                    // InternalProblem.g:863:5: (otherlv_3= RULE_ID )
                    {
                    // InternalProblem.g:863:5: (otherlv_3= RULE_ID )
                    // InternalProblem.g:864:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getArgumentsVariableCrossReference_3_0_0());
                    					

                    }


                    }

                    // InternalProblem.g:875:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==15) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalProblem.g:876:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAtomAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalProblem.g:880:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalProblem.g:881:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalProblem.g:881:6: (otherlv_5= RULE_ID )
                    	    // InternalProblem.g:882:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAtomRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getAtomAccess().getArgumentsVariableCrossReference_3_1_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAssertion"
    // InternalProblem.g:903:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalProblem.g:903:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalProblem.g:904:2: iv_ruleAssertion= ruleAssertion EOF
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
    // InternalProblem.g:910:1: ruleAssertion returns [EObject current=null] : ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.' ) ;
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
            // InternalProblem.g:916:2: ( ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.' ) )
            // InternalProblem.g:917:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.' )
            {
            // InternalProblem.g:917:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.' )
            // InternalProblem.g:918:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.'
            {
            // InternalProblem.g:918:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) )
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalProblem.g:919:4: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) )
                    {
                    // InternalProblem.g:919:4: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) )
                    // InternalProblem.g:920:5: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) )
                    {
                    // InternalProblem.g:920:5: ( ( ruleQualifiedName ) )
                    // InternalProblem.g:921:6: ( ruleQualifiedName )
                    {
                    // InternalProblem.g:921:6: ( ruleQualifiedName )
                    // InternalProblem.g:922:7: ruleQualifiedName
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

                    otherlv_1=(Token)match(input,23,FOLLOW_18); 

                    					newLeafNode(otherlv_1, grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_0_1());
                    				
                    // InternalProblem.g:940:5: ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalProblem.g:941:6: ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalProblem.g:941:6: ( ( ruleQualifiedName ) )
                            // InternalProblem.g:942:7: ( ruleQualifiedName )
                            {
                            // InternalProblem.g:942:7: ( ruleQualifiedName )
                            // InternalProblem.g:943:8: ruleQualifiedName
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

                            // InternalProblem.g:957:6: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==15) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // InternalProblem.g:958:7: otherlv_3= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_3=(Token)match(input,15,FOLLOW_5); 

                            	    							newLeafNode(otherlv_3, grammarAccess.getAssertionAccess().getCommaKeyword_0_0_2_1_0());
                            	    						
                            	    // InternalProblem.g:962:7: ( ( ruleQualifiedName ) )
                            	    // InternalProblem.g:963:8: ( ruleQualifiedName )
                            	    {
                            	    // InternalProblem.g:963:8: ( ruleQualifiedName )
                            	    // InternalProblem.g:964:9: ruleQualifiedName
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
                            	    break loop22;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_25); 

                    					newLeafNode(otherlv_5, grammarAccess.getAssertionAccess().getRightParenthesisKeyword_0_0_3());
                    				
                    otherlv_6=(Token)match(input,29,FOLLOW_26); 

                    					newLeafNode(otherlv_6, grammarAccess.getAssertionAccess().getColonKeyword_0_0_4());
                    				
                    // InternalProblem.g:988:5: ( (lv_value_7_0= ruleLogicValue ) )
                    // InternalProblem.g:989:6: (lv_value_7_0= ruleLogicValue )
                    {
                    // InternalProblem.g:989:6: (lv_value_7_0= ruleLogicValue )
                    // InternalProblem.g:990:7: lv_value_7_0= ruleLogicValue
                    {

                    							newCompositeNode(grammarAccess.getAssertionAccess().getValueLogicValueEnumRuleCall_0_0_5_0());
                    						
                    pushFollow(FOLLOW_27);
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
                    // InternalProblem.g:1009:4: ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' )
                    {
                    // InternalProblem.g:1009:4: ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' )
                    // InternalProblem.g:1010:5: ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')'
                    {
                    // InternalProblem.g:1010:5: ( (lv_value_8_0= ruleShortLogicValue ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==27||LA24_0==39) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalProblem.g:1011:6: (lv_value_8_0= ruleShortLogicValue )
                            {
                            // InternalProblem.g:1011:6: (lv_value_8_0= ruleShortLogicValue )
                            // InternalProblem.g:1012:7: lv_value_8_0= ruleShortLogicValue
                            {

                            							newCompositeNode(grammarAccess.getAssertionAccess().getValueShortLogicValueEnumRuleCall_0_1_0_0());
                            						
                            pushFollow(FOLLOW_5);
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

                    // InternalProblem.g:1029:5: ( ( ruleQualifiedName ) )
                    // InternalProblem.g:1030:6: ( ruleQualifiedName )
                    {
                    // InternalProblem.g:1030:6: ( ruleQualifiedName )
                    // InternalProblem.g:1031:7: ruleQualifiedName
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

                    otherlv_10=(Token)match(input,23,FOLLOW_18); 

                    					newLeafNode(otherlv_10, grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_1_2());
                    				
                    // InternalProblem.g:1049:5: ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_ID) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalProblem.g:1050:6: ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalProblem.g:1050:6: ( ( ruleQualifiedName ) )
                            // InternalProblem.g:1051:7: ( ruleQualifiedName )
                            {
                            // InternalProblem.g:1051:7: ( ruleQualifiedName )
                            // InternalProblem.g:1052:8: ruleQualifiedName
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

                            // InternalProblem.g:1066:6: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==15) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalProblem.g:1067:7: otherlv_12= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_12=(Token)match(input,15,FOLLOW_5); 

                            	    							newLeafNode(otherlv_12, grammarAccess.getAssertionAccess().getCommaKeyword_0_1_3_1_0());
                            	    						
                            	    // InternalProblem.g:1071:7: ( ( ruleQualifiedName ) )
                            	    // InternalProblem.g:1072:8: ( ruleQualifiedName )
                            	    {
                            	    // InternalProblem.g:1072:8: ( ruleQualifiedName )
                            	    // InternalProblem.g:1073:9: ruleQualifiedName
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
                            	    break loop25;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,24,FOLLOW_27); 

                    					newLeafNode(otherlv_14, grammarAccess.getAssertionAccess().getRightParenthesisKeyword_0_1_4());
                    				

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

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
    // InternalProblem.g:1103:1: entryRuleScopeDeclaration returns [EObject current=null] : iv_ruleScopeDeclaration= ruleScopeDeclaration EOF ;
    public final EObject entryRuleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeDeclaration = null;


        try {
            // InternalProblem.g:1103:57: (iv_ruleScopeDeclaration= ruleScopeDeclaration EOF )
            // InternalProblem.g:1104:2: iv_ruleScopeDeclaration= ruleScopeDeclaration EOF
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
    // InternalProblem.g:1110:1: ruleScopeDeclaration returns [EObject current=null] : (otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.' ) ;
    public final EObject ruleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeScopes_1_0 = null;

        EObject lv_typeScopes_3_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1116:2: ( (otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.' ) )
            // InternalProblem.g:1117:2: (otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.' )
            {
            // InternalProblem.g:1117:2: (otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.' )
            // InternalProblem.g:1118:3: otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getScopeDeclarationAccess().getScopeKeyword_0());
            		
            // InternalProblem.g:1122:3: ( (lv_typeScopes_1_0= ruleTypeScope ) )
            // InternalProblem.g:1123:4: (lv_typeScopes_1_0= ruleTypeScope )
            {
            // InternalProblem.g:1123:4: (lv_typeScopes_1_0= ruleTypeScope )
            // InternalProblem.g:1124:5: lv_typeScopes_1_0= ruleTypeScope
            {

            					newCompositeNode(grammarAccess.getScopeDeclarationAccess().getTypeScopesTypeScopeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalProblem.g:1141:3: (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalProblem.g:1142:4: otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getScopeDeclarationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalProblem.g:1146:4: ( (lv_typeScopes_3_0= ruleTypeScope ) )
            	    // InternalProblem.g:1147:5: (lv_typeScopes_3_0= ruleTypeScope )
            	    {
            	    // InternalProblem.g:1147:5: (lv_typeScopes_3_0= ruleTypeScope )
            	    // InternalProblem.g:1148:6: lv_typeScopes_3_0= ruleTypeScope
            	    {

            	    						newCompositeNode(grammarAccess.getScopeDeclarationAccess().getTypeScopesTypeScopeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
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
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

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
    // InternalProblem.g:1174:1: entryRuleTypeScope returns [EObject current=null] : iv_ruleTypeScope= ruleTypeScope EOF ;
    public final EObject entryRuleTypeScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeScope = null;


        try {
            // InternalProblem.g:1174:50: (iv_ruleTypeScope= ruleTypeScope EOF )
            // InternalProblem.g:1175:2: iv_ruleTypeScope= ruleTypeScope EOF
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
    // InternalProblem.g:1181:1: ruleTypeScope returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleMultiplicity ) ) ) ;
    public final EObject ruleTypeScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_increment_1_0=null;
        Token otherlv_2=null;
        EObject lv_multiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1187:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleMultiplicity ) ) ) )
            // InternalProblem.g:1188:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleMultiplicity ) ) )
            {
            // InternalProblem.g:1188:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleMultiplicity ) ) )
            // InternalProblem.g:1189:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )
            {
            // InternalProblem.g:1189:3: ( (otherlv_0= RULE_ID ) )
            // InternalProblem.g:1190:4: (otherlv_0= RULE_ID )
            {
            // InternalProblem.g:1190:4: (otherlv_0= RULE_ID )
            // InternalProblem.g:1191:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeScopeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_0, grammarAccess.getTypeScopeAccess().getTargetTypeClassDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalProblem.g:1202:3: ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            else if ( (LA29_0==32) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalProblem.g:1203:4: ( (lv_increment_1_0= '+=' ) )
                    {
                    // InternalProblem.g:1203:4: ( (lv_increment_1_0= '+=' ) )
                    // InternalProblem.g:1204:5: (lv_increment_1_0= '+=' )
                    {
                    // InternalProblem.g:1204:5: (lv_increment_1_0= '+=' )
                    // InternalProblem.g:1205:6: lv_increment_1_0= '+='
                    {
                    lv_increment_1_0=(Token)match(input,31,FOLLOW_13); 

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
                    // InternalProblem.g:1218:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeScopeAccess().getEqualsSignKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalProblem.g:1223:3: ( (lv_multiplicity_3_0= ruleMultiplicity ) )
            // InternalProblem.g:1224:4: (lv_multiplicity_3_0= ruleMultiplicity )
            {
            // InternalProblem.g:1224:4: (lv_multiplicity_3_0= ruleMultiplicity )
            // InternalProblem.g:1225:5: lv_multiplicity_3_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getTypeScopeAccess().getMultiplicityMultiplicityParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_multiplicity_3_0=ruleMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeScopeRule());
            					}
            					set(
            						current,
            						"multiplicity",
            						lv_multiplicity_3_0,
            						"org.eclipse.viatra.solver.language.Problem.Multiplicity");
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
    // InternalProblem.g:1246:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalProblem.g:1246:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalProblem.g:1247:2: iv_ruleMultiplicity= ruleMultiplicity EOF
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
    // InternalProblem.g:1253:1: ruleMultiplicity returns [EObject current=null] : (this_RangeMultiplicity_0= ruleRangeMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject this_RangeMultiplicity_0 = null;

        EObject this_ExactMultiplicity_1 = null;



        	enterRule();

        try {
            // InternalProblem.g:1259:2: ( (this_RangeMultiplicity_0= ruleRangeMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity ) )
            // InternalProblem.g:1260:2: (this_RangeMultiplicity_0= ruleRangeMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity )
            {
            // InternalProblem.g:1260:2: (this_RangeMultiplicity_0= ruleRangeMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==33) ) {
                    alt30=1;
                }
                else if ( (LA30_1==EOF||(LA30_1>=15 && LA30_1<=17)) ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalProblem.g:1261:3: this_RangeMultiplicity_0= ruleRangeMultiplicity
                    {

                    			newCompositeNode(grammarAccess.getMultiplicityAccess().getRangeMultiplicityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RangeMultiplicity_0=ruleRangeMultiplicity();

                    state._fsp--;


                    			current = this_RangeMultiplicity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:1270:3: this_ExactMultiplicity_1= ruleExactMultiplicity
                    {

                    			newCompositeNode(grammarAccess.getMultiplicityAccess().getExactMultiplicityParserRuleCall_1());
                    		
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
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleRangeMultiplicity"
    // InternalProblem.g:1282:1: entryRuleRangeMultiplicity returns [EObject current=null] : iv_ruleRangeMultiplicity= ruleRangeMultiplicity EOF ;
    public final EObject entryRuleRangeMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeMultiplicity = null;


        try {
            // InternalProblem.g:1282:58: (iv_ruleRangeMultiplicity= ruleRangeMultiplicity EOF )
            // InternalProblem.g:1283:2: iv_ruleRangeMultiplicity= ruleRangeMultiplicity EOF
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
    // InternalProblem.g:1289:1: ruleRangeMultiplicity returns [EObject current=null] : ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) ) ) ;
    public final EObject ruleRangeMultiplicity() throws RecognitionException {
        EObject current = null;

        Token lv_lowerBound_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1295:2: ( ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) ) ) )
            // InternalProblem.g:1296:2: ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) ) )
            {
            // InternalProblem.g:1296:2: ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) ) )
            // InternalProblem.g:1297:3: ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) )
            {
            // InternalProblem.g:1297:3: ( (lv_lowerBound_0_0= RULE_INT ) )
            // InternalProblem.g:1298:4: (lv_lowerBound_0_0= RULE_INT )
            {
            // InternalProblem.g:1298:4: (lv_lowerBound_0_0= RULE_INT )
            // InternalProblem.g:1299:5: lv_lowerBound_0_0= RULE_INT
            {
            lv_lowerBound_0_0=(Token)match(input,RULE_INT,FOLLOW_29); 

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

            otherlv_1=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getRangeMultiplicityAccess().getFullStopFullStopKeyword_1());
            		
            // InternalProblem.g:1319:3: ( (lv_upperBound_2_0= ruleUpperBound ) )
            // InternalProblem.g:1320:4: (lv_upperBound_2_0= ruleUpperBound )
            {
            // InternalProblem.g:1320:4: (lv_upperBound_2_0= ruleUpperBound )
            // InternalProblem.g:1321:5: lv_upperBound_2_0= ruleUpperBound
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
    // InternalProblem.g:1342:1: entryRuleExactMultiplicity returns [EObject current=null] : iv_ruleExactMultiplicity= ruleExactMultiplicity EOF ;
    public final EObject entryRuleExactMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactMultiplicity = null;


        try {
            // InternalProblem.g:1342:58: (iv_ruleExactMultiplicity= ruleExactMultiplicity EOF )
            // InternalProblem.g:1343:2: iv_ruleExactMultiplicity= ruleExactMultiplicity EOF
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
    // InternalProblem.g:1349:1: ruleExactMultiplicity returns [EObject current=null] : ( (lv_exactValue_0_0= RULE_INT ) ) ;
    public final EObject ruleExactMultiplicity() throws RecognitionException {
        EObject current = null;

        Token lv_exactValue_0_0=null;


        	enterRule();

        try {
            // InternalProblem.g:1355:2: ( ( (lv_exactValue_0_0= RULE_INT ) ) )
            // InternalProblem.g:1356:2: ( (lv_exactValue_0_0= RULE_INT ) )
            {
            // InternalProblem.g:1356:2: ( (lv_exactValue_0_0= RULE_INT ) )
            // InternalProblem.g:1357:3: (lv_exactValue_0_0= RULE_INT )
            {
            // InternalProblem.g:1357:3: (lv_exactValue_0_0= RULE_INT )
            // InternalProblem.g:1358:4: lv_exactValue_0_0= RULE_INT
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
    // InternalProblem.g:1377:1: entryRuleUpperBound returns [String current=null] : iv_ruleUpperBound= ruleUpperBound EOF ;
    public final String entryRuleUpperBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUpperBound = null;


        try {
            // InternalProblem.g:1377:50: (iv_ruleUpperBound= ruleUpperBound EOF )
            // InternalProblem.g:1378:2: iv_ruleUpperBound= ruleUpperBound EOF
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
    // InternalProblem.g:1384:1: ruleUpperBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUpperBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalProblem.g:1390:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalProblem.g:1391:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalProblem.g:1391:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT) ) {
                alt31=1;
            }
            else if ( (LA31_0==34) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalProblem.g:1392:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getUpperBoundAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:1400:3: kw= '*'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

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
    // InternalProblem.g:1409:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalProblem.g:1409:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalProblem.g:1410:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalProblem.g:1416:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalProblem.g:1422:2: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // InternalProblem.g:1423:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // InternalProblem.g:1423:2: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // InternalProblem.g:1424:3: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalProblem.g:1431:3: (kw= '::' this_ID_2= RULE_ID )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==35) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalProblem.g:1432:4: kw= '::' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,35,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop32;
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


    // $ANTLR start "ruleLogicValue"
    // InternalProblem.g:1449:1: ruleLogicValue returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) ) ;
    public final Enumerator ruleLogicValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalProblem.g:1455:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) ) )
            // InternalProblem.g:1456:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) )
            {
            // InternalProblem.g:1456:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt33=1;
                }
                break;
            case 37:
                {
                alt33=2;
                }
                break;
            case 38:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalProblem.g:1457:3: (enumLiteral_0= 'true' )
                    {
                    // InternalProblem.g:1457:3: (enumLiteral_0= 'true' )
                    // InternalProblem.g:1458:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1465:3: (enumLiteral_1= 'false' )
                    {
                    // InternalProblem.g:1465:3: (enumLiteral_1= 'false' )
                    // InternalProblem.g:1466:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:1473:3: (enumLiteral_2= 'unknown' )
                    {
                    // InternalProblem.g:1473:3: (enumLiteral_2= 'unknown' )
                    // InternalProblem.g:1474:4: enumLiteral_2= 'unknown'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

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
    // InternalProblem.g:1484:1: ruleShortLogicValue returns [Enumerator current=null] : ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) ) ;
    public final Enumerator ruleShortLogicValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalProblem.g:1490:2: ( ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) ) )
            // InternalProblem.g:1491:2: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) )
            {
            // InternalProblem.g:1491:2: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==27) ) {
                alt34=1;
            }
            else if ( (LA34_0==39) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalProblem.g:1492:3: (enumLiteral_0= '!' )
                    {
                    // InternalProblem.g:1492:3: (enumLiteral_0= '!' )
                    // InternalProblem.g:1493:4: enumLiteral_0= '!'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1500:3: (enumLiteral_1= '?' )
                    {
                    // InternalProblem.g:1500:3: (enumLiteral_1= '?' )
                    // InternalProblem.g:1501:4: enumLiteral_1= '?'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

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


    protected DFA27 dfa27 = new DFA27(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\4\1\27\1\uffff\2\4\1\27\1\17\1\21\2\4\1\uffff\2\17\1\4\1\17";
    static final String dfa_3s = "\1\47\1\43\1\uffff\1\4\1\30\2\43\1\35\2\4\1\uffff\2\43\1\4\1\43";
    static final String dfa_4s = "\2\uffff\1\2\7\uffff\1\1\4\uffff";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\26\uffff\1\2\13\uffff\1\2",
            "\1\4\13\uffff\1\3",
            "",
            "\1\5",
            "\1\6\23\uffff\1\7",
            "\1\4\13\uffff\1\3",
            "\1\11\10\uffff\1\7\12\uffff\1\10",
            "\1\2\13\uffff\1\12",
            "\1\13",
            "\1\14",
            "",
            "\1\11\10\uffff\1\7\12\uffff\1\10",
            "\1\11\10\uffff\1\7\12\uffff\1\15",
            "\1\16",
            "\1\11\10\uffff\1\7\12\uffff\1\15"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "918:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008048601812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000EA000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000002L});

}