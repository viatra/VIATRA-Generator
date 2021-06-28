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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_QUOTED_ID", "RULE_EXPONENTIAL", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'problem'", "'.'", "'abstract'", "'class'", "'extends'", "','", "'{'", "';'", "'}'", "'enum'", "'contains'", "'refers'", "'['", "']'", "'opposite'", "'error'", "'pred'", "'('", "')'", "':-'", "'!'", "'+'", "':'", "'scope'", "'+='", "'='", "'..'", "'*'", "'::'", "'true'", "'false'", "'-'", "'unknown'", "'?'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_EXPONENTIAL=8;
    public static final int RULE_ID=5;
    public static final int RULE_QUOTED_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalProblem.g:72:1: ruleProblem returns [EObject current=null] : ( (otherlv_0= 'problem' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '.' )? ( (lv_statements_3_0= ruleStatement ) )* ) ;
    public final EObject ruleProblem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:78:2: ( ( (otherlv_0= 'problem' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '.' )? ( (lv_statements_3_0= ruleStatement ) )* ) )
            // InternalProblem.g:79:2: ( (otherlv_0= 'problem' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '.' )? ( (lv_statements_3_0= ruleStatement ) )* )
            {
            // InternalProblem.g:79:2: ( (otherlv_0= 'problem' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '.' )? ( (lv_statements_3_0= ruleStatement ) )* )
            // InternalProblem.g:80:3: (otherlv_0= 'problem' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '.' )? ( (lv_statements_3_0= ruleStatement ) )*
            {
            // InternalProblem.g:80:3: (otherlv_0= 'problem' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '.' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalProblem.g:81:4: otherlv_0= 'problem' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '.'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getProblemAccess().getProblemKeyword_0_0());
                    			
                    // InternalProblem.g:85:4: ( (lv_name_1_0= ruleIdentifier ) )
                    // InternalProblem.g:86:5: (lv_name_1_0= ruleIdentifier )
                    {
                    // InternalProblem.g:86:5: (lv_name_1_0= ruleIdentifier )
                    // InternalProblem.g:87:6: lv_name_1_0= ruleIdentifier
                    {

                    						newCompositeNode(grammarAccess.getProblemAccess().getNameIdentifierParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_name_1_0=ruleIdentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProblemRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.viatra.solver.language.Problem.Identifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getProblemAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalProblem.g:109:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==RULE_QUOTED_ID||(LA2_0>=15 && LA2_0<=16)||LA2_0==22||(LA2_0>=28 && LA2_0<=29)||LA2_0==33||LA2_0==36||(LA2_0>=42 && LA2_0<=43)||LA2_0==46) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalProblem.g:110:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalProblem.g:110:4: (lv_statements_3_0= ruleStatement )
            	    // InternalProblem.g:111:5: lv_statements_3_0= ruleStatement
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
    // InternalProblem.g:132:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalProblem.g:132:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalProblem.g:133:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalProblem.g:139:1: ruleStatement returns [EObject current=null] : (this_ClassDeclaration_0= ruleClassDeclaration | this_EnumDeclaration_1= ruleEnumDeclaration | this_PredicateDefinition_2= rulePredicateDefinition | this_Assertion_3= ruleAssertion | this_NodeValueAssertion_4= ruleNodeValueAssertion | this_ScopeDeclaration_5= ruleScopeDeclaration ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDeclaration_0 = null;

        EObject this_EnumDeclaration_1 = null;

        EObject this_PredicateDefinition_2 = null;

        EObject this_Assertion_3 = null;

        EObject this_NodeValueAssertion_4 = null;

        EObject this_ScopeDeclaration_5 = null;



        	enterRule();

        try {
            // InternalProblem.g:145:2: ( (this_ClassDeclaration_0= ruleClassDeclaration | this_EnumDeclaration_1= ruleEnumDeclaration | this_PredicateDefinition_2= rulePredicateDefinition | this_Assertion_3= ruleAssertion | this_NodeValueAssertion_4= ruleNodeValueAssertion | this_ScopeDeclaration_5= ruleScopeDeclaration ) )
            // InternalProblem.g:146:2: (this_ClassDeclaration_0= ruleClassDeclaration | this_EnumDeclaration_1= ruleEnumDeclaration | this_PredicateDefinition_2= rulePredicateDefinition | this_Assertion_3= ruleAssertion | this_NodeValueAssertion_4= ruleNodeValueAssertion | this_ScopeDeclaration_5= ruleScopeDeclaration )
            {
            // InternalProblem.g:146:2: (this_ClassDeclaration_0= ruleClassDeclaration | this_EnumDeclaration_1= ruleEnumDeclaration | this_PredicateDefinition_2= rulePredicateDefinition | this_Assertion_3= ruleAssertion | this_NodeValueAssertion_4= ruleNodeValueAssertion | this_ScopeDeclaration_5= ruleScopeDeclaration )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalProblem.g:147:3: this_ClassDeclaration_0= ruleClassDeclaration
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
                    // InternalProblem.g:156:3: this_EnumDeclaration_1= ruleEnumDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getEnumDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumDeclaration_1=ruleEnumDeclaration();

                    state._fsp--;


                    			current = this_EnumDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalProblem.g:165:3: this_PredicateDefinition_2= rulePredicateDefinition
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPredicateDefinitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PredicateDefinition_2=rulePredicateDefinition();

                    state._fsp--;


                    			current = this_PredicateDefinition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalProblem.g:174:3: this_Assertion_3= ruleAssertion
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAssertionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assertion_3=ruleAssertion();

                    state._fsp--;


                    			current = this_Assertion_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalProblem.g:183:3: this_NodeValueAssertion_4= ruleNodeValueAssertion
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getNodeValueAssertionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_NodeValueAssertion_4=ruleNodeValueAssertion();

                    state._fsp--;


                    			current = this_NodeValueAssertion_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalProblem.g:192:3: this_ScopeDeclaration_5= ruleScopeDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getScopeDeclarationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScopeDeclaration_5=ruleScopeDeclaration();

                    state._fsp--;


                    			current = this_ScopeDeclaration_5;
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
    // InternalProblem.g:204:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalProblem.g:204:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalProblem.g:205:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
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
    // InternalProblem.g:211:1: ruleClassDeclaration returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' ) ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_referenceDeclarations_8_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:217:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' ) ) )
            // InternalProblem.g:218:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' ) )
            {
            // InternalProblem.g:218:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' ) )
            // InternalProblem.g:219:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' )
            {
            // InternalProblem.g:219:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalProblem.g:220:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalProblem.g:220:4: (lv_abstract_0_0= 'abstract' )
                    // InternalProblem.g:221:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,15,FOLLOW_6); 

                    					newLeafNode(lv_abstract_0_0, grammarAccess.getClassDeclarationAccess().getAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "abstract", lv_abstract_0_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDeclarationAccess().getClassKeyword_1());
            		
            // InternalProblem.g:237:3: ( (lv_name_2_0= ruleIdentifier ) )
            // InternalProblem.g:238:4: (lv_name_2_0= ruleIdentifier )
            {
            // InternalProblem.g:238:4: (lv_name_2_0= ruleIdentifier )
            // InternalProblem.g:239:5: lv_name_2_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getClassDeclarationAccess().getNameIdentifierParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.viatra.solver.language.Problem.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProblem.g:256:3: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProblem.g:257:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getExtendsKeyword_3_0());
                    			
                    // InternalProblem.g:261:4: ( ( ruleQualifiedName ) )
                    // InternalProblem.g:262:5: ( ruleQualifiedName )
                    {
                    // InternalProblem.g:262:5: ( ruleQualifiedName )
                    // InternalProblem.g:263:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassDeclarationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getSuperTypesRelationCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProblem.g:277:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalProblem.g:278:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProblem.g:282:5: ( ( ruleQualifiedName ) )
                    	    // InternalProblem.g:283:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalProblem.g:283:6: ( ruleQualifiedName )
                    	    // InternalProblem.g:284:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClassDeclarationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getClassDeclarationAccess().getSuperTypesRelationCrossReference_3_2_1_0());
                    	    						
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

            // InternalProblem.g:300:3: ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalProblem.g:301:4: (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' )
                    {
                    // InternalProblem.g:301:4: (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' )
                    // InternalProblem.g:302:5: otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_10); 

                    					newLeafNode(otherlv_7, grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_4_0_0());
                    				
                    // InternalProblem.g:306:5: ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID||LA8_0==RULE_QUOTED_ID||(LA8_0>=23 && LA8_0<=24)||(LA8_0>=42 && LA8_0<=43)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalProblem.g:307:6: ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )?
                    	    {
                    	    // InternalProblem.g:307:6: ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) )
                    	    // InternalProblem.g:308:7: (lv_referenceDeclarations_8_0= ruleReferenceDeclaration )
                    	    {
                    	    // InternalProblem.g:308:7: (lv_referenceDeclarations_8_0= ruleReferenceDeclaration )
                    	    // InternalProblem.g:309:8: lv_referenceDeclarations_8_0= ruleReferenceDeclaration
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

                    	    // InternalProblem.g:326:6: (otherlv_9= ';' )?
                    	    int alt7=2;
                    	    int LA7_0 = input.LA(1);

                    	    if ( (LA7_0==20) ) {
                    	        alt7=1;
                    	    }
                    	    switch (alt7) {
                    	        case 1 :
                    	            // InternalProblem.g:327:7: otherlv_9= ';'
                    	            {
                    	            otherlv_9=(Token)match(input,20,FOLLOW_10); 

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

                    otherlv_10=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(otherlv_10, grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_4_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:339:4: otherlv_11= '.'
                    {
                    otherlv_11=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEnumDeclaration"
    // InternalProblem.g:348:1: entryRuleEnumDeclaration returns [EObject current=null] : iv_ruleEnumDeclaration= ruleEnumDeclaration EOF ;
    public final EObject entryRuleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDeclaration = null;


        try {
            // InternalProblem.g:348:56: (iv_ruleEnumDeclaration= ruleEnumDeclaration EOF )
            // InternalProblem.g:349:2: iv_ruleEnumDeclaration= ruleEnumDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumDeclaration=ruleEnumDeclaration();

            state._fsp--;

             current =iv_ruleEnumDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumDeclaration"


    // $ANTLR start "ruleEnumDeclaration"
    // InternalProblem.g:355:1: ruleEnumDeclaration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= ruleIdentifier ) ) ( (otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' ) | otherlv_9= '.' ) ) ;
    public final EObject ruleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_literals_3_0 = null;

        EObject lv_literals_5_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:361:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= ruleIdentifier ) ) ( (otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' ) | otherlv_9= '.' ) ) )
            // InternalProblem.g:362:2: (otherlv_0= 'enum' ( (lv_name_1_0= ruleIdentifier ) ) ( (otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' ) | otherlv_9= '.' ) )
            {
            // InternalProblem.g:362:2: (otherlv_0= 'enum' ( (lv_name_1_0= ruleIdentifier ) ) ( (otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' ) | otherlv_9= '.' ) )
            // InternalProblem.g:363:3: otherlv_0= 'enum' ( (lv_name_1_0= ruleIdentifier ) ) ( (otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' ) | otherlv_9= '.' )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumDeclarationAccess().getEnumKeyword_0());
            		
            // InternalProblem.g:367:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalProblem.g:368:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalProblem.g:368:4: (lv_name_1_0= ruleIdentifier )
            // InternalProblem.g:369:5: lv_name_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getEnumDeclarationAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.viatra.solver.language.Problem.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProblem.g:386:3: ( (otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' ) | otherlv_9= '.' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            else if ( (LA13_0==14) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalProblem.g:387:4: (otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' )
                    {
                    // InternalProblem.g:387:4: (otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' )
                    // InternalProblem.g:388:5: otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_13); 

                    					newLeafNode(otherlv_2, grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2_0_0());
                    				
                    // InternalProblem.g:392:5: ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID||(LA12_0>=42 && LA12_0<=43)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalProblem.g:393:6: ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )?
                            {
                            // InternalProblem.g:393:6: ( (lv_literals_3_0= ruleEnumLiteral ) )
                            // InternalProblem.g:394:7: (lv_literals_3_0= ruleEnumLiteral )
                            {
                            // InternalProblem.g:394:7: (lv_literals_3_0= ruleEnumLiteral )
                            // InternalProblem.g:395:8: lv_literals_3_0= ruleEnumLiteral
                            {

                            								newCompositeNode(grammarAccess.getEnumDeclarationAccess().getLiteralsEnumLiteralParserRuleCall_2_0_1_0_0());
                            							
                            pushFollow(FOLLOW_14);
                            lv_literals_3_0=ruleEnumLiteral();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getEnumDeclarationRule());
                            								}
                            								add(
                            									current,
                            									"literals",
                            									lv_literals_3_0,
                            									"org.eclipse.viatra.solver.language.Problem.EnumLiteral");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalProblem.g:412:6: (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==18) ) {
                                    int LA10_1 = input.LA(2);

                                    if ( (LA10_1==RULE_ID||(LA10_1>=42 && LA10_1<=43)) ) {
                                        alt10=1;
                                    }


                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalProblem.g:413:7: otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) )
                            	    {
                            	    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                            	    							newLeafNode(otherlv_4, grammarAccess.getEnumDeclarationAccess().getCommaKeyword_2_0_1_1_0());
                            	    						
                            	    // InternalProblem.g:417:7: ( (lv_literals_5_0= ruleEnumLiteral ) )
                            	    // InternalProblem.g:418:8: (lv_literals_5_0= ruleEnumLiteral )
                            	    {
                            	    // InternalProblem.g:418:8: (lv_literals_5_0= ruleEnumLiteral )
                            	    // InternalProblem.g:419:9: lv_literals_5_0= ruleEnumLiteral
                            	    {

                            	    									newCompositeNode(grammarAccess.getEnumDeclarationAccess().getLiteralsEnumLiteralParserRuleCall_2_0_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_14);
                            	    lv_literals_5_0=ruleEnumLiteral();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getEnumDeclarationRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"literals",
                            	    										lv_literals_5_0,
                            	    										"org.eclipse.viatra.solver.language.Problem.EnumLiteral");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);

                            // InternalProblem.g:437:6: (otherlv_6= ',' | otherlv_7= ';' )?
                            int alt11=3;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==18) ) {
                                alt11=1;
                            }
                            else if ( (LA11_0==20) ) {
                                alt11=2;
                            }
                            switch (alt11) {
                                case 1 :
                                    // InternalProblem.g:438:7: otherlv_6= ','
                                    {
                                    otherlv_6=(Token)match(input,18,FOLLOW_15); 

                                    							newLeafNode(otherlv_6, grammarAccess.getEnumDeclarationAccess().getCommaKeyword_2_0_1_2_0());
                                    						

                                    }
                                    break;
                                case 2 :
                                    // InternalProblem.g:443:7: otherlv_7= ';'
                                    {
                                    otherlv_7=(Token)match(input,20,FOLLOW_15); 

                                    							newLeafNode(otherlv_7, grammarAccess.getEnumDeclarationAccess().getSemicolonKeyword_2_0_1_2_1());
                                    						

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:455:4: otherlv_9= '.'
                    {
                    otherlv_9=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getEnumDeclarationAccess().getFullStopKeyword_2_1());
                    			

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
    // $ANTLR end "ruleEnumDeclaration"


    // $ANTLR start "entryRuleEnumLiteral"
    // InternalProblem.g:464:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // InternalProblem.g:464:52: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // InternalProblem.g:465:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumLiteral=ruleEnumLiteral();

            state._fsp--;

             current =iv_ruleEnumLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumLiteral"


    // $ANTLR start "ruleEnumLiteral"
    // InternalProblem.g:471:1: ruleEnumLiteral returns [EObject current=null] : ( (lv_name_0_0= ruleIdentifier ) ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:477:2: ( ( (lv_name_0_0= ruleIdentifier ) ) )
            // InternalProblem.g:478:2: ( (lv_name_0_0= ruleIdentifier ) )
            {
            // InternalProblem.g:478:2: ( (lv_name_0_0= ruleIdentifier ) )
            // InternalProblem.g:479:3: (lv_name_0_0= ruleIdentifier )
            {
            // InternalProblem.g:479:3: (lv_name_0_0= ruleIdentifier )
            // InternalProblem.g:480:4: lv_name_0_0= ruleIdentifier
            {

            				newCompositeNode(grammarAccess.getEnumLiteralAccess().getNameIdentifierParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEnumLiteralRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.viatra.solver.language.Problem.Identifier");
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
    // $ANTLR end "ruleEnumLiteral"


    // $ANTLR start "entryRuleReferenceDeclaration"
    // InternalProblem.g:500:1: entryRuleReferenceDeclaration returns [EObject current=null] : iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF ;
    public final EObject entryRuleReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceDeclaration = null;


        try {
            // InternalProblem.g:500:61: (iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF )
            // InternalProblem.g:501:2: iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF
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
    // InternalProblem.g:507:1: ruleReferenceDeclaration returns [EObject current=null] : ( ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' )? ( ( ruleQualifiedName ) ) (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )? ( (lv_name_6_0= ruleIdentifier ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_containment_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_multiplicity_4_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:513:2: ( ( ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' )? ( ( ruleQualifiedName ) ) (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )? ( (lv_name_6_0= ruleIdentifier ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )? ) )
            // InternalProblem.g:514:2: ( ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' )? ( ( ruleQualifiedName ) ) (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )? ( (lv_name_6_0= ruleIdentifier ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )? )
            {
            // InternalProblem.g:514:2: ( ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' )? ( ( ruleQualifiedName ) ) (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )? ( (lv_name_6_0= ruleIdentifier ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )? )
            // InternalProblem.g:515:3: ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' )? ( ( ruleQualifiedName ) ) (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )? ( (lv_name_6_0= ruleIdentifier ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )?
            {
            // InternalProblem.g:515:3: ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            else if ( (LA14_0==24) ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // InternalProblem.g:516:4: ( (lv_containment_0_0= 'contains' ) )
                    {
                    // InternalProblem.g:516:4: ( (lv_containment_0_0= 'contains' ) )
                    // InternalProblem.g:517:5: (lv_containment_0_0= 'contains' )
                    {
                    // InternalProblem.g:517:5: (lv_containment_0_0= 'contains' )
                    // InternalProblem.g:518:6: lv_containment_0_0= 'contains'
                    {
                    lv_containment_0_0=(Token)match(input,23,FOLLOW_8); 

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
                    // InternalProblem.g:531:4: otherlv_1= 'refers'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getReferenceDeclarationAccess().getRefersKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalProblem.g:536:3: ( ( ruleQualifiedName ) )
            // InternalProblem.g:537:4: ( ruleQualifiedName )
            {
            // InternalProblem.g:537:4: ( ruleQualifiedName )
            // InternalProblem.g:538:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getReferenceTypeRelationCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProblem.g:552:3: (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalProblem.g:553:4: otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getReferenceDeclarationAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalProblem.g:557:4: ( (lv_multiplicity_4_0= ruleMultiplicity ) )
                    // InternalProblem.g:558:5: (lv_multiplicity_4_0= ruleMultiplicity )
                    {
                    // InternalProblem.g:558:5: (lv_multiplicity_4_0= ruleMultiplicity )
                    // InternalProblem.g:559:6: lv_multiplicity_4_0= ruleMultiplicity
                    {

                    						newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getMultiplicityMultiplicityParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getReferenceDeclarationAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalProblem.g:581:3: ( (lv_name_6_0= ruleIdentifier ) )
            // InternalProblem.g:582:4: (lv_name_6_0= ruleIdentifier )
            {
            // InternalProblem.g:582:4: (lv_name_6_0= ruleIdentifier )
            // InternalProblem.g:583:5: lv_name_6_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getNameIdentifierParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_6_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.viatra.solver.language.Problem.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProblem.g:600:3: (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProblem.g:601:4: otherlv_7= 'opposite' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getReferenceDeclarationAccess().getOppositeKeyword_4_0());
                    			
                    // InternalProblem.g:605:4: ( ( ruleQualifiedName ) )
                    // InternalProblem.g:606:5: ( ruleQualifiedName )
                    {
                    // InternalProblem.g:606:5: ( ruleQualifiedName )
                    // InternalProblem.g:607:6: ruleQualifiedName
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
    // InternalProblem.g:626:1: entryRulePredicateDefinition returns [EObject current=null] : iv_rulePredicateDefinition= rulePredicateDefinition EOF ;
    public final EObject entryRulePredicateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateDefinition = null;


        try {
            // InternalProblem.g:626:60: (iv_rulePredicateDefinition= rulePredicateDefinition EOF )
            // InternalProblem.g:627:2: iv_rulePredicateDefinition= rulePredicateDefinition EOF
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
    // InternalProblem.g:633:1: rulePredicateDefinition returns [EObject current=null] : ( ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.' ) ;
    public final EObject rulePredicateDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_error_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_bodies_10_0 = null;

        EObject lv_bodies_12_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:639:2: ( ( ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.' ) )
            // InternalProblem.g:640:2: ( ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.' )
            {
            // InternalProblem.g:640:2: ( ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.' )
            // InternalProblem.g:641:3: ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.'
            {
            // InternalProblem.g:641:3: ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            else if ( (LA18_0==29) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalProblem.g:642:4: ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? )
                    {
                    // InternalProblem.g:642:4: ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? )
                    // InternalProblem.g:643:5: ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )?
                    {
                    // InternalProblem.g:643:5: ( (lv_error_0_0= 'error' ) )
                    // InternalProblem.g:644:6: (lv_error_0_0= 'error' )
                    {
                    // InternalProblem.g:644:6: (lv_error_0_0= 'error' )
                    // InternalProblem.g:645:7: lv_error_0_0= 'error'
                    {
                    lv_error_0_0=(Token)match(input,28,FOLLOW_20); 

                    							newLeafNode(lv_error_0_0, grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPredicateDefinitionRule());
                    							}
                    							setWithLastConsumed(current, "error", lv_error_0_0 != null, "error");
                    						

                    }


                    }

                    // InternalProblem.g:657:5: (otherlv_1= 'pred' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==29) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalProblem.g:658:6: otherlv_1= 'pred'
                            {
                            otherlv_1=(Token)match(input,29,FOLLOW_3); 

                            						newLeafNode(otherlv_1, grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_0_1());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:665:4: otherlv_2= 'pred'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalProblem.g:670:3: ( (lv_name_3_0= ruleIdentifier ) )
            // InternalProblem.g:671:4: (lv_name_3_0= ruleIdentifier )
            {
            // InternalProblem.g:671:4: (lv_name_3_0= ruleIdentifier )
            // InternalProblem.g:672:5: lv_name_3_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getPredicateDefinitionAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_3_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicateDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.viatra.solver.language.Problem.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getPredicateDefinitionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalProblem.g:693:3: ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==RULE_QUOTED_ID||(LA20_0>=42 && LA20_0<=43)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProblem.g:694:4: ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    {
                    // InternalProblem.g:694:4: ( (lv_parameters_5_0= ruleParameter ) )
                    // InternalProblem.g:695:5: (lv_parameters_5_0= ruleParameter )
                    {
                    // InternalProblem.g:695:5: (lv_parameters_5_0= ruleParameter )
                    // InternalProblem.g:696:6: lv_parameters_5_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getPredicateDefinitionAccess().getParametersParameterParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    // InternalProblem.g:713:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==18) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalProblem.g:714:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_8); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPredicateDefinitionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalProblem.g:718:5: ( (lv_parameters_7_0= ruleParameter ) )
                    	    // InternalProblem.g:719:6: (lv_parameters_7_0= ruleParameter )
                    	    {
                    	    // InternalProblem.g:719:6: (lv_parameters_7_0= ruleParameter )
                    	    // InternalProblem.g:720:7: lv_parameters_7_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPredicateDefinitionAccess().getParametersParameterParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
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
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getPredicateDefinitionAccess().getRightParenthesisKeyword_4());
            		
            // InternalProblem.g:743:3: (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProblem.g:744:4: otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )*
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getPredicateDefinitionAccess().getColonHyphenMinusKeyword_5_0());
                    			
                    // InternalProblem.g:748:4: ( (lv_bodies_10_0= ruleConjunction ) )
                    // InternalProblem.g:749:5: (lv_bodies_10_0= ruleConjunction )
                    {
                    // InternalProblem.g:749:5: (lv_bodies_10_0= ruleConjunction )
                    // InternalProblem.g:750:6: lv_bodies_10_0= ruleConjunction
                    {

                    						newCompositeNode(grammarAccess.getPredicateDefinitionAccess().getBodiesConjunctionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_26);
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

                    // InternalProblem.g:767:4: (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==20) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalProblem.g:768:5: otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) )
                    	    {
                    	    otherlv_11=(Token)match(input,20,FOLLOW_25); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPredicateDefinitionAccess().getSemicolonKeyword_5_2_0());
                    	    				
                    	    // InternalProblem.g:772:5: ( (lv_bodies_12_0= ruleConjunction ) )
                    	    // InternalProblem.g:773:6: (lv_bodies_12_0= ruleConjunction )
                    	    {
                    	    // InternalProblem.g:773:6: (lv_bodies_12_0= ruleConjunction )
                    	    // InternalProblem.g:774:7: lv_bodies_12_0= ruleConjunction
                    	    {

                    	    							newCompositeNode(grammarAccess.getPredicateDefinitionAccess().getBodiesConjunctionParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
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
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

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
    // InternalProblem.g:801:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalProblem.g:801:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalProblem.g:802:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalProblem.g:808:1: ruleParameter returns [EObject current=null] : ( ( ( ruleQualifiedName ) )? ( (lv_name_1_0= ruleIdentifier ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:814:2: ( ( ( ( ruleQualifiedName ) )? ( (lv_name_1_0= ruleIdentifier ) ) ) )
            // InternalProblem.g:815:2: ( ( ( ruleQualifiedName ) )? ( (lv_name_1_0= ruleIdentifier ) ) )
            {
            // InternalProblem.g:815:2: ( ( ( ruleQualifiedName ) )? ( (lv_name_1_0= ruleIdentifier ) ) )
            // InternalProblem.g:816:3: ( ( ruleQualifiedName ) )? ( (lv_name_1_0= ruleIdentifier ) )
            {
            // InternalProblem.g:816:3: ( ( ruleQualifiedName ) )?
            int alt23=2;
            switch ( input.LA(1) ) {
                case RULE_QUOTED_ID:
                    {
                    alt23=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==RULE_ID||(LA23_2>=41 && LA23_2<=43)) ) {
                        alt23=1;
                    }
                    }
                    break;
                case 42:
                    {
                    int LA23_3 = input.LA(2);

                    if ( (LA23_3==RULE_ID||(LA23_3>=41 && LA23_3<=43)) ) {
                        alt23=1;
                    }
                    }
                    break;
                case 43:
                    {
                    int LA23_4 = input.LA(2);

                    if ( (LA23_4==RULE_ID||(LA23_4>=41 && LA23_4<=43)) ) {
                        alt23=1;
                    }
                    }
                    break;
            }

            switch (alt23) {
                case 1 :
                    // InternalProblem.g:817:4: ( ruleQualifiedName )
                    {
                    // InternalProblem.g:817:4: ( ruleQualifiedName )
                    // InternalProblem.g:818:5: ruleQualifiedName
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getParameterAccess().getParameterTypeRelationCrossReference_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    ruleQualifiedName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalProblem.g:832:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalProblem.g:833:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalProblem.g:833:4: (lv_name_1_0= ruleIdentifier )
            // InternalProblem.g:834:5: lv_name_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.viatra.solver.language.Problem.Identifier");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleConjunction"
    // InternalProblem.g:855:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // InternalProblem.g:855:52: (iv_ruleConjunction= ruleConjunction EOF )
            // InternalProblem.g:856:2: iv_ruleConjunction= ruleConjunction EOF
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
    // InternalProblem.g:862:1: ruleConjunction returns [EObject current=null] : ( ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_literals_0_0 = null;

        EObject lv_literals_2_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:868:2: ( ( ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )* ) )
            // InternalProblem.g:869:2: ( ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )* )
            {
            // InternalProblem.g:869:2: ( ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )* )
            // InternalProblem.g:870:3: ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )*
            {
            // InternalProblem.g:870:3: ( (lv_literals_0_0= ruleLiteral ) )
            // InternalProblem.g:871:4: (lv_literals_0_0= ruleLiteral )
            {
            // InternalProblem.g:871:4: (lv_literals_0_0= ruleLiteral )
            // InternalProblem.g:872:5: lv_literals_0_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getConjunctionAccess().getLiteralsLiteralParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalProblem.g:889:3: (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==18) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalProblem.g:890:4: otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_25); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConjunctionAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalProblem.g:894:4: ( (lv_literals_2_0= ruleLiteral ) )
            	    // InternalProblem.g:895:5: (lv_literals_2_0= ruleLiteral )
            	    {
            	    // InternalProblem.g:895:5: (lv_literals_2_0= ruleLiteral )
            	    // InternalProblem.g:896:6: lv_literals_2_0= ruleLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionAccess().getLiteralsLiteralParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
            	    break loop24;
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
    // InternalProblem.g:918:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalProblem.g:918:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalProblem.g:919:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalProblem.g:925:1: ruleLiteral returns [EObject current=null] : (this_Atom_0= ruleAtom | this_NegativeLiteral_1= ruleNegativeLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        EObject this_NegativeLiteral_1 = null;



        	enterRule();

        try {
            // InternalProblem.g:931:2: ( (this_Atom_0= ruleAtom | this_NegativeLiteral_1= ruleNegativeLiteral ) )
            // InternalProblem.g:932:2: (this_Atom_0= ruleAtom | this_NegativeLiteral_1= ruleNegativeLiteral )
            {
            // InternalProblem.g:932:2: (this_Atom_0= ruleAtom | this_NegativeLiteral_1= ruleNegativeLiteral )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID||LA25_0==RULE_QUOTED_ID||(LA25_0>=42 && LA25_0<=43)) ) {
                alt25=1;
            }
            else if ( (LA25_0==33) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalProblem.g:933:3: this_Atom_0= ruleAtom
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
                    // InternalProblem.g:942:3: this_NegativeLiteral_1= ruleNegativeLiteral
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
    // InternalProblem.g:954:1: entryRuleNegativeLiteral returns [EObject current=null] : iv_ruleNegativeLiteral= ruleNegativeLiteral EOF ;
    public final EObject entryRuleNegativeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegativeLiteral = null;


        try {
            // InternalProblem.g:954:56: (iv_ruleNegativeLiteral= ruleNegativeLiteral EOF )
            // InternalProblem.g:955:2: iv_ruleNegativeLiteral= ruleNegativeLiteral EOF
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
    // InternalProblem.g:961:1: ruleNegativeLiteral returns [EObject current=null] : (otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) ) ) ;
    public final EObject ruleNegativeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_atom_1_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:967:2: ( (otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) ) ) )
            // InternalProblem.g:968:2: (otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) ) )
            {
            // InternalProblem.g:968:2: (otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) ) )
            // InternalProblem.g:969:3: otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNegativeLiteralAccess().getExclamationMarkKeyword_0());
            		
            // InternalProblem.g:973:3: ( (lv_atom_1_0= ruleAtom ) )
            // InternalProblem.g:974:4: (lv_atom_1_0= ruleAtom )
            {
            // InternalProblem.g:974:4: (lv_atom_1_0= ruleAtom )
            // InternalProblem.g:975:5: lv_atom_1_0= ruleAtom
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
    // InternalProblem.g:996:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalProblem.g:996:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalProblem.g:997:2: iv_ruleAtom= ruleAtom EOF
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
    // InternalProblem.g:1003:1: ruleAtom returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalProblem.g:1009:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')' ) )
            // InternalProblem.g:1010:2: ( ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')' )
            {
            // InternalProblem.g:1010:2: ( ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')' )
            // InternalProblem.g:1011:3: ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')'
            {
            // InternalProblem.g:1011:3: ( ( ruleQualifiedName ) )
            // InternalProblem.g:1012:4: ( ruleQualifiedName )
            {
            // InternalProblem.g:1012:4: ( ruleQualifiedName )
            // InternalProblem.g:1013:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAtomAccess().getRelationRelationCrossReference_0_0());
            				
            pushFollow(FOLLOW_28);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProblem.g:1027:3: ( (lv_transitiveClosure_1_0= '+' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProblem.g:1028:4: (lv_transitiveClosure_1_0= '+' )
                    {
                    // InternalProblem.g:1028:4: (lv_transitiveClosure_1_0= '+' )
                    // InternalProblem.g:1029:5: lv_transitiveClosure_1_0= '+'
                    {
                    lv_transitiveClosure_1_0=(Token)match(input,34,FOLLOW_21); 

                    					newLeafNode(lv_transitiveClosure_1_0, grammarAccess.getAtomAccess().getTransitiveClosurePlusSignKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomRule());
                    					}
                    					setWithLastConsumed(current, "transitiveClosure", lv_transitiveClosure_1_0 != null, "+");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,30,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2());
            		
            // InternalProblem.g:1045:3: ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_EXPONENTIAL)||(LA28_0>=42 && LA28_0<=44)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalProblem.g:1046:4: ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
                    {
                    // InternalProblem.g:1046:4: ( (lv_arguments_3_0= ruleArgument ) )
                    // InternalProblem.g:1047:5: (lv_arguments_3_0= ruleArgument )
                    {
                    // InternalProblem.g:1047:5: (lv_arguments_3_0= ruleArgument )
                    // InternalProblem.g:1048:6: lv_arguments_3_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getAtomAccess().getArgumentsArgumentParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    // InternalProblem.g:1065:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==18) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalProblem.g:1066:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_30); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAtomAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalProblem.g:1070:5: ( (lv_arguments_5_0= ruleArgument ) )
                    	    // InternalProblem.g:1071:6: (lv_arguments_5_0= ruleArgument )
                    	    {
                    	    // InternalProblem.g:1071:6: (lv_arguments_5_0= ruleArgument )
                    	    // InternalProblem.g:1072:7: lv_arguments_5_0= ruleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getAtomAccess().getArgumentsArgumentParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
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
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

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
    // InternalProblem.g:1099:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalProblem.g:1099:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalProblem.g:1100:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalProblem.g:1106:1: ruleArgument returns [EObject current=null] : (this_VariableOrNodeArgument_0= ruleVariableOrNodeArgument | this_ConstantArgument_1= ruleConstantArgument ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_VariableOrNodeArgument_0 = null;

        EObject this_ConstantArgument_1 = null;



        	enterRule();

        try {
            // InternalProblem.g:1112:2: ( (this_VariableOrNodeArgument_0= ruleVariableOrNodeArgument | this_ConstantArgument_1= ruleConstantArgument ) )
            // InternalProblem.g:1113:2: (this_VariableOrNodeArgument_0= ruleVariableOrNodeArgument | this_ConstantArgument_1= ruleConstantArgument )
            {
            // InternalProblem.g:1113:2: (this_VariableOrNodeArgument_0= ruleVariableOrNodeArgument | this_ConstantArgument_1= ruleConstantArgument )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==RULE_QUOTED_ID||(LA29_0>=42 && LA29_0<=43)) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_STRING||LA29_0==RULE_INT||LA29_0==RULE_EXPONENTIAL||LA29_0==44) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalProblem.g:1114:3: this_VariableOrNodeArgument_0= ruleVariableOrNodeArgument
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getVariableOrNodeArgumentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableOrNodeArgument_0=ruleVariableOrNodeArgument();

                    state._fsp--;


                    			current = this_VariableOrNodeArgument_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:1123:3: this_ConstantArgument_1= ruleConstantArgument
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getConstantArgumentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstantArgument_1=ruleConstantArgument();

                    state._fsp--;


                    			current = this_ConstantArgument_1;
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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleVariableOrNodeArgument"
    // InternalProblem.g:1135:1: entryRuleVariableOrNodeArgument returns [EObject current=null] : iv_ruleVariableOrNodeArgument= ruleVariableOrNodeArgument EOF ;
    public final EObject entryRuleVariableOrNodeArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableOrNodeArgument = null;


        try {
            // InternalProblem.g:1135:63: (iv_ruleVariableOrNodeArgument= ruleVariableOrNodeArgument EOF )
            // InternalProblem.g:1136:2: iv_ruleVariableOrNodeArgument= ruleVariableOrNodeArgument EOF
            {
             newCompositeNode(grammarAccess.getVariableOrNodeArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableOrNodeArgument=ruleVariableOrNodeArgument();

            state._fsp--;

             current =iv_ruleVariableOrNodeArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableOrNodeArgument"


    // $ANTLR start "ruleVariableOrNodeArgument"
    // InternalProblem.g:1142:1: ruleVariableOrNodeArgument returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleVariableOrNodeArgument() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalProblem.g:1148:2: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:1149:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:1149:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:1150:3: ( ruleQualifiedName )
            {
            // InternalProblem.g:1150:3: ( ruleQualifiedName )
            // InternalProblem.g:1151:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableOrNodeArgumentRule());
            				}
            			

            				newCompositeNode(grammarAccess.getVariableOrNodeArgumentAccess().getVariableOrNodeVariableOrNodeCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "ruleVariableOrNodeArgument"


    // $ANTLR start "entryRuleConstantArgument"
    // InternalProblem.g:1168:1: entryRuleConstantArgument returns [EObject current=null] : iv_ruleConstantArgument= ruleConstantArgument EOF ;
    public final EObject entryRuleConstantArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantArgument = null;


        try {
            // InternalProblem.g:1168:57: (iv_ruleConstantArgument= ruleConstantArgument EOF )
            // InternalProblem.g:1169:2: iv_ruleConstantArgument= ruleConstantArgument EOF
            {
             newCompositeNode(grammarAccess.getConstantArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantArgument=ruleConstantArgument();

            state._fsp--;

             current =iv_ruleConstantArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantArgument"


    // $ANTLR start "ruleConstantArgument"
    // InternalProblem.g:1175:1: ruleConstantArgument returns [EObject current=null] : ( (lv_constant_0_0= ruleConstant ) ) ;
    public final EObject ruleConstantArgument() throws RecognitionException {
        EObject current = null;

        EObject lv_constant_0_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1181:2: ( ( (lv_constant_0_0= ruleConstant ) ) )
            // InternalProblem.g:1182:2: ( (lv_constant_0_0= ruleConstant ) )
            {
            // InternalProblem.g:1182:2: ( (lv_constant_0_0= ruleConstant ) )
            // InternalProblem.g:1183:3: (lv_constant_0_0= ruleConstant )
            {
            // InternalProblem.g:1183:3: (lv_constant_0_0= ruleConstant )
            // InternalProblem.g:1184:4: lv_constant_0_0= ruleConstant
            {

            				newCompositeNode(grammarAccess.getConstantArgumentAccess().getConstantConstantParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_constant_0_0=ruleConstant();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getConstantArgumentRule());
            				}
            				set(
            					current,
            					"constant",
            					lv_constant_0_0,
            					"org.eclipse.viatra.solver.language.Problem.Constant");
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
    // $ANTLR end "ruleConstantArgument"


    // $ANTLR start "entryRuleAssertion"
    // InternalProblem.g:1204:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalProblem.g:1204:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalProblem.g:1205:2: iv_ruleAssertion= ruleAssertion EOF
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
    // InternalProblem.g:1211:1: ruleAssertion returns [EObject current=null] : ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAssertionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAssertionArgument ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( (lv_arguments_11_0= ruleAssertionArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleAssertionArgument ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.' ) ;
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
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;

        Enumerator lv_value_7_0 = null;

        Enumerator lv_value_8_0 = null;

        EObject lv_arguments_11_0 = null;

        EObject lv_arguments_13_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1217:2: ( ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAssertionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAssertionArgument ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( (lv_arguments_11_0= ruleAssertionArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleAssertionArgument ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.' ) )
            // InternalProblem.g:1218:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAssertionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAssertionArgument ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( (lv_arguments_11_0= ruleAssertionArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleAssertionArgument ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.' )
            {
            // InternalProblem.g:1218:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAssertionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAssertionArgument ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( (lv_arguments_11_0= ruleAssertionArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleAssertionArgument ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.' )
            // InternalProblem.g:1219:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAssertionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAssertionArgument ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( (lv_arguments_11_0= ruleAssertionArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleAssertionArgument ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.'
            {
            // InternalProblem.g:1219:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAssertionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAssertionArgument ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( (lv_arguments_11_0= ruleAssertionArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleAssertionArgument ) ) )* )? otherlv_14= ')' ) )
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalProblem.g:1220:4: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAssertionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAssertionArgument ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) )
                    {
                    // InternalProblem.g:1220:4: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAssertionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAssertionArgument ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) )
                    // InternalProblem.g:1221:5: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAssertionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAssertionArgument ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) )
                    {
                    // InternalProblem.g:1221:5: ( ( ruleQualifiedName ) )
                    // InternalProblem.g:1222:6: ( ruleQualifiedName )
                    {
                    // InternalProblem.g:1222:6: ( ruleQualifiedName )
                    // InternalProblem.g:1223:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssertionRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssertionAccess().getRelationRelationCrossReference_0_0_0_0());
                    						
                    pushFollow(FOLLOW_21);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_29); 

                    					newLeafNode(otherlv_1, grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_0_1());
                    				
                    // InternalProblem.g:1241:5: ( ( (lv_arguments_2_0= ruleAssertionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAssertionArgument ) ) )* )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_EXPONENTIAL)||(LA31_0>=42 && LA31_0<=44)) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalProblem.g:1242:6: ( (lv_arguments_2_0= ruleAssertionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAssertionArgument ) ) )*
                            {
                            // InternalProblem.g:1242:6: ( (lv_arguments_2_0= ruleAssertionArgument ) )
                            // InternalProblem.g:1243:7: (lv_arguments_2_0= ruleAssertionArgument )
                            {
                            // InternalProblem.g:1243:7: (lv_arguments_2_0= ruleAssertionArgument )
                            // InternalProblem.g:1244:8: lv_arguments_2_0= ruleAssertionArgument
                            {

                            								newCompositeNode(grammarAccess.getAssertionAccess().getArgumentsAssertionArgumentParserRuleCall_0_0_2_0_0());
                            							
                            pushFollow(FOLLOW_23);
                            lv_arguments_2_0=ruleAssertionArgument();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getAssertionRule());
                            								}
                            								add(
                            									current,
                            									"arguments",
                            									lv_arguments_2_0,
                            									"org.eclipse.viatra.solver.language.Problem.AssertionArgument");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalProblem.g:1261:6: (otherlv_3= ',' ( (lv_arguments_4_0= ruleAssertionArgument ) ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==18) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // InternalProblem.g:1262:7: otherlv_3= ',' ( (lv_arguments_4_0= ruleAssertionArgument ) )
                            	    {
                            	    otherlv_3=(Token)match(input,18,FOLLOW_30); 

                            	    							newLeafNode(otherlv_3, grammarAccess.getAssertionAccess().getCommaKeyword_0_0_2_1_0());
                            	    						
                            	    // InternalProblem.g:1266:7: ( (lv_arguments_4_0= ruleAssertionArgument ) )
                            	    // InternalProblem.g:1267:8: (lv_arguments_4_0= ruleAssertionArgument )
                            	    {
                            	    // InternalProblem.g:1267:8: (lv_arguments_4_0= ruleAssertionArgument )
                            	    // InternalProblem.g:1268:9: lv_arguments_4_0= ruleAssertionArgument
                            	    {

                            	    									newCompositeNode(grammarAccess.getAssertionAccess().getArgumentsAssertionArgumentParserRuleCall_0_0_2_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_23);
                            	    lv_arguments_4_0=ruleAssertionArgument();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getAssertionRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"arguments",
                            	    										lv_arguments_4_0,
                            	    										"org.eclipse.viatra.solver.language.Problem.AssertionArgument");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop30;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_31); 

                    					newLeafNode(otherlv_5, grammarAccess.getAssertionAccess().getRightParenthesisKeyword_0_0_3());
                    				
                    otherlv_6=(Token)match(input,35,FOLLOW_32); 

                    					newLeafNode(otherlv_6, grammarAccess.getAssertionAccess().getColonKeyword_0_0_4());
                    				
                    // InternalProblem.g:1295:5: ( (lv_value_7_0= ruleLogicValue ) )
                    // InternalProblem.g:1296:6: (lv_value_7_0= ruleLogicValue )
                    {
                    // InternalProblem.g:1296:6: (lv_value_7_0= ruleLogicValue )
                    // InternalProblem.g:1297:7: lv_value_7_0= ruleLogicValue
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
                    // InternalProblem.g:1316:4: ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( (lv_arguments_11_0= ruleAssertionArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleAssertionArgument ) ) )* )? otherlv_14= ')' )
                    {
                    // InternalProblem.g:1316:4: ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( (lv_arguments_11_0= ruleAssertionArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleAssertionArgument ) ) )* )? otherlv_14= ')' )
                    // InternalProblem.g:1317:5: ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( (lv_arguments_11_0= ruleAssertionArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleAssertionArgument ) ) )* )? otherlv_14= ')'
                    {
                    // InternalProblem.g:1317:5: ( (lv_value_8_0= ruleShortLogicValue ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==33||LA32_0==46) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalProblem.g:1318:6: (lv_value_8_0= ruleShortLogicValue )
                            {
                            // InternalProblem.g:1318:6: (lv_value_8_0= ruleShortLogicValue )
                            // InternalProblem.g:1319:7: lv_value_8_0= ruleShortLogicValue
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

                    // InternalProblem.g:1336:5: ( ( ruleQualifiedName ) )
                    // InternalProblem.g:1337:6: ( ruleQualifiedName )
                    {
                    // InternalProblem.g:1337:6: ( ruleQualifiedName )
                    // InternalProblem.g:1338:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssertionRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssertionAccess().getRelationRelationCrossReference_0_1_1_0());
                    						
                    pushFollow(FOLLOW_21);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_10=(Token)match(input,30,FOLLOW_29); 

                    					newLeafNode(otherlv_10, grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_1_2());
                    				
                    // InternalProblem.g:1356:5: ( ( (lv_arguments_11_0= ruleAssertionArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleAssertionArgument ) ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_EXPONENTIAL)||(LA34_0>=42 && LA34_0<=44)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalProblem.g:1357:6: ( (lv_arguments_11_0= ruleAssertionArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleAssertionArgument ) ) )*
                            {
                            // InternalProblem.g:1357:6: ( (lv_arguments_11_0= ruleAssertionArgument ) )
                            // InternalProblem.g:1358:7: (lv_arguments_11_0= ruleAssertionArgument )
                            {
                            // InternalProblem.g:1358:7: (lv_arguments_11_0= ruleAssertionArgument )
                            // InternalProblem.g:1359:8: lv_arguments_11_0= ruleAssertionArgument
                            {

                            								newCompositeNode(grammarAccess.getAssertionAccess().getArgumentsAssertionArgumentParserRuleCall_0_1_3_0_0());
                            							
                            pushFollow(FOLLOW_23);
                            lv_arguments_11_0=ruleAssertionArgument();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getAssertionRule());
                            								}
                            								add(
                            									current,
                            									"arguments",
                            									lv_arguments_11_0,
                            									"org.eclipse.viatra.solver.language.Problem.AssertionArgument");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalProblem.g:1376:6: (otherlv_12= ',' ( (lv_arguments_13_0= ruleAssertionArgument ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==18) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // InternalProblem.g:1377:7: otherlv_12= ',' ( (lv_arguments_13_0= ruleAssertionArgument ) )
                            	    {
                            	    otherlv_12=(Token)match(input,18,FOLLOW_30); 

                            	    							newLeafNode(otherlv_12, grammarAccess.getAssertionAccess().getCommaKeyword_0_1_3_1_0());
                            	    						
                            	    // InternalProblem.g:1381:7: ( (lv_arguments_13_0= ruleAssertionArgument ) )
                            	    // InternalProblem.g:1382:8: (lv_arguments_13_0= ruleAssertionArgument )
                            	    {
                            	    // InternalProblem.g:1382:8: (lv_arguments_13_0= ruleAssertionArgument )
                            	    // InternalProblem.g:1383:9: lv_arguments_13_0= ruleAssertionArgument
                            	    {

                            	    									newCompositeNode(grammarAccess.getAssertionAccess().getArgumentsAssertionArgumentParserRuleCall_0_1_3_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_23);
                            	    lv_arguments_13_0=ruleAssertionArgument();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getAssertionRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"arguments",
                            	    										lv_arguments_13_0,
                            	    										"org.eclipse.viatra.solver.language.Problem.AssertionArgument");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,31,FOLLOW_4); 

                    					newLeafNode(otherlv_14, grammarAccess.getAssertionAccess().getRightParenthesisKeyword_0_1_4());
                    				

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAssertionArgument"
    // InternalProblem.g:1416:1: entryRuleAssertionArgument returns [EObject current=null] : iv_ruleAssertionArgument= ruleAssertionArgument EOF ;
    public final EObject entryRuleAssertionArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionArgument = null;


        try {
            // InternalProblem.g:1416:58: (iv_ruleAssertionArgument= ruleAssertionArgument EOF )
            // InternalProblem.g:1417:2: iv_ruleAssertionArgument= ruleAssertionArgument EOF
            {
             newCompositeNode(grammarAccess.getAssertionArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertionArgument=ruleAssertionArgument();

            state._fsp--;

             current =iv_ruleAssertionArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertionArgument"


    // $ANTLR start "ruleAssertionArgument"
    // InternalProblem.g:1423:1: ruleAssertionArgument returns [EObject current=null] : (this_NodeAssertionArgument_0= ruleNodeAssertionArgument | this_ConstantAssertionArgument_1= ruleConstantAssertionArgument ) ;
    public final EObject ruleAssertionArgument() throws RecognitionException {
        EObject current = null;

        EObject this_NodeAssertionArgument_0 = null;

        EObject this_ConstantAssertionArgument_1 = null;



        	enterRule();

        try {
            // InternalProblem.g:1429:2: ( (this_NodeAssertionArgument_0= ruleNodeAssertionArgument | this_ConstantAssertionArgument_1= ruleConstantAssertionArgument ) )
            // InternalProblem.g:1430:2: (this_NodeAssertionArgument_0= ruleNodeAssertionArgument | this_ConstantAssertionArgument_1= ruleConstantAssertionArgument )
            {
            // InternalProblem.g:1430:2: (this_NodeAssertionArgument_0= ruleNodeAssertionArgument | this_ConstantAssertionArgument_1= ruleConstantAssertionArgument )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||LA36_0==RULE_QUOTED_ID||(LA36_0>=42 && LA36_0<=43)) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_STRING||LA36_0==RULE_INT||LA36_0==RULE_EXPONENTIAL||LA36_0==44) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalProblem.g:1431:3: this_NodeAssertionArgument_0= ruleNodeAssertionArgument
                    {

                    			newCompositeNode(grammarAccess.getAssertionArgumentAccess().getNodeAssertionArgumentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NodeAssertionArgument_0=ruleNodeAssertionArgument();

                    state._fsp--;


                    			current = this_NodeAssertionArgument_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:1440:3: this_ConstantAssertionArgument_1= ruleConstantAssertionArgument
                    {

                    			newCompositeNode(grammarAccess.getAssertionArgumentAccess().getConstantAssertionArgumentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstantAssertionArgument_1=ruleConstantAssertionArgument();

                    state._fsp--;


                    			current = this_ConstantAssertionArgument_1;
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
    // $ANTLR end "ruleAssertionArgument"


    // $ANTLR start "entryRuleNodeAssertionArgument"
    // InternalProblem.g:1452:1: entryRuleNodeAssertionArgument returns [EObject current=null] : iv_ruleNodeAssertionArgument= ruleNodeAssertionArgument EOF ;
    public final EObject entryRuleNodeAssertionArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeAssertionArgument = null;


        try {
            // InternalProblem.g:1452:62: (iv_ruleNodeAssertionArgument= ruleNodeAssertionArgument EOF )
            // InternalProblem.g:1453:2: iv_ruleNodeAssertionArgument= ruleNodeAssertionArgument EOF
            {
             newCompositeNode(grammarAccess.getNodeAssertionArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeAssertionArgument=ruleNodeAssertionArgument();

            state._fsp--;

             current =iv_ruleNodeAssertionArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeAssertionArgument"


    // $ANTLR start "ruleNodeAssertionArgument"
    // InternalProblem.g:1459:1: ruleNodeAssertionArgument returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleNodeAssertionArgument() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalProblem.g:1465:2: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:1466:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:1466:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:1467:3: ( ruleQualifiedName )
            {
            // InternalProblem.g:1467:3: ( ruleQualifiedName )
            // InternalProblem.g:1468:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNodeAssertionArgumentRule());
            				}
            			

            				newCompositeNode(grammarAccess.getNodeAssertionArgumentAccess().getNodeNodeCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "ruleNodeAssertionArgument"


    // $ANTLR start "entryRuleConstantAssertionArgument"
    // InternalProblem.g:1485:1: entryRuleConstantAssertionArgument returns [EObject current=null] : iv_ruleConstantAssertionArgument= ruleConstantAssertionArgument EOF ;
    public final EObject entryRuleConstantAssertionArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantAssertionArgument = null;


        try {
            // InternalProblem.g:1485:66: (iv_ruleConstantAssertionArgument= ruleConstantAssertionArgument EOF )
            // InternalProblem.g:1486:2: iv_ruleConstantAssertionArgument= ruleConstantAssertionArgument EOF
            {
             newCompositeNode(grammarAccess.getConstantAssertionArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantAssertionArgument=ruleConstantAssertionArgument();

            state._fsp--;

             current =iv_ruleConstantAssertionArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantAssertionArgument"


    // $ANTLR start "ruleConstantAssertionArgument"
    // InternalProblem.g:1492:1: ruleConstantAssertionArgument returns [EObject current=null] : ( (lv_constant_0_0= ruleConstant ) ) ;
    public final EObject ruleConstantAssertionArgument() throws RecognitionException {
        EObject current = null;

        EObject lv_constant_0_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1498:2: ( ( (lv_constant_0_0= ruleConstant ) ) )
            // InternalProblem.g:1499:2: ( (lv_constant_0_0= ruleConstant ) )
            {
            // InternalProblem.g:1499:2: ( (lv_constant_0_0= ruleConstant ) )
            // InternalProblem.g:1500:3: (lv_constant_0_0= ruleConstant )
            {
            // InternalProblem.g:1500:3: (lv_constant_0_0= ruleConstant )
            // InternalProblem.g:1501:4: lv_constant_0_0= ruleConstant
            {

            				newCompositeNode(grammarAccess.getConstantAssertionArgumentAccess().getConstantConstantParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_constant_0_0=ruleConstant();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getConstantAssertionArgumentRule());
            				}
            				set(
            					current,
            					"constant",
            					lv_constant_0_0,
            					"org.eclipse.viatra.solver.language.Problem.Constant");
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
    // $ANTLR end "ruleConstantAssertionArgument"


    // $ANTLR start "entryRuleNodeValueAssertion"
    // InternalProblem.g:1521:1: entryRuleNodeValueAssertion returns [EObject current=null] : iv_ruleNodeValueAssertion= ruleNodeValueAssertion EOF ;
    public final EObject entryRuleNodeValueAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeValueAssertion = null;


        try {
            // InternalProblem.g:1521:59: (iv_ruleNodeValueAssertion= ruleNodeValueAssertion EOF )
            // InternalProblem.g:1522:2: iv_ruleNodeValueAssertion= ruleNodeValueAssertion EOF
            {
             newCompositeNode(grammarAccess.getNodeValueAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeValueAssertion=ruleNodeValueAssertion();

            state._fsp--;

             current =iv_ruleNodeValueAssertion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeValueAssertion"


    // $ANTLR start "ruleNodeValueAssertion"
    // InternalProblem.g:1528:1: ruleNodeValueAssertion returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstant ) ) otherlv_3= '.' ) ;
    public final EObject ruleNodeValueAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1534:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstant ) ) otherlv_3= '.' ) )
            // InternalProblem.g:1535:2: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstant ) ) otherlv_3= '.' )
            {
            // InternalProblem.g:1535:2: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstant ) ) otherlv_3= '.' )
            // InternalProblem.g:1536:3: ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleConstant ) ) otherlv_3= '.'
            {
            // InternalProblem.g:1536:3: ( ( ruleQualifiedName ) )
            // InternalProblem.g:1537:4: ( ruleQualifiedName )
            {
            // InternalProblem.g:1537:4: ( ruleQualifiedName )
            // InternalProblem.g:1538:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeValueAssertionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNodeValueAssertionAccess().getNodeNodeCrossReference_0_0());
            				
            pushFollow(FOLLOW_31);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeValueAssertionAccess().getColonKeyword_1());
            		
            // InternalProblem.g:1556:3: ( (lv_value_2_0= ruleConstant ) )
            // InternalProblem.g:1557:4: (lv_value_2_0= ruleConstant )
            {
            // InternalProblem.g:1557:4: (lv_value_2_0= ruleConstant )
            // InternalProblem.g:1558:5: lv_value_2_0= ruleConstant
            {

            					newCompositeNode(grammarAccess.getNodeValueAssertionAccess().getValueConstantParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_value_2_0=ruleConstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeValueAssertionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.viatra.solver.language.Problem.Constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeValueAssertionAccess().getFullStopKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeValueAssertion"


    // $ANTLR start "entryRuleConstant"
    // InternalProblem.g:1583:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalProblem.g:1583:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalProblem.g:1584:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalProblem.g:1590:1: ruleConstant returns [EObject current=null] : (this_RealConstant_0= ruleRealConstant | this_IntConstant_1= ruleIntConstant | this_StringConstant_2= ruleStringConstant ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        EObject this_RealConstant_0 = null;

        EObject this_IntConstant_1 = null;

        EObject this_StringConstant_2 = null;



        	enterRule();

        try {
            // InternalProblem.g:1596:2: ( (this_RealConstant_0= ruleRealConstant | this_IntConstant_1= ruleIntConstant | this_StringConstant_2= ruleStringConstant ) )
            // InternalProblem.g:1597:2: (this_RealConstant_0= ruleRealConstant | this_IntConstant_1= ruleIntConstant | this_StringConstant_2= ruleStringConstant )
            {
            // InternalProblem.g:1597:2: (this_RealConstant_0= ruleRealConstant | this_IntConstant_1= ruleIntConstant | this_StringConstant_2= ruleStringConstant )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RULE_INT) ) {
                    int LA37_3 = input.LA(3);

                    if ( (LA37_3==14) ) {
                        int LA37_5 = input.LA(4);

                        if ( (LA37_5==EOF||LA37_5==RULE_ID||LA37_5==RULE_QUOTED_ID||(LA37_5>=15 && LA37_5<=16)||LA37_5==22||(LA37_5>=28 && LA37_5<=29)||LA37_5==33||LA37_5==36||(LA37_5>=42 && LA37_5<=43)||LA37_5==46) ) {
                            alt37=2;
                        }
                        else if ( (LA37_5==RULE_INT||LA37_5==RULE_EXPONENTIAL) ) {
                            alt37=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 37, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA37_3==EOF||LA37_3==18||LA37_3==31) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA37_1==RULE_EXPONENTIAL) ) {
                    alt37=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXPONENTIAL:
                {
                alt37=1;
                }
                break;
            case RULE_INT:
                {
                int LA37_3 = input.LA(2);

                if ( (LA37_3==14) ) {
                    int LA37_5 = input.LA(3);

                    if ( (LA37_5==EOF||LA37_5==RULE_ID||LA37_5==RULE_QUOTED_ID||(LA37_5>=15 && LA37_5<=16)||LA37_5==22||(LA37_5>=28 && LA37_5<=29)||LA37_5==33||LA37_5==36||(LA37_5>=42 && LA37_5<=43)||LA37_5==46) ) {
                        alt37=2;
                    }
                    else if ( (LA37_5==RULE_INT||LA37_5==RULE_EXPONENTIAL) ) {
                        alt37=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA37_3==EOF||LA37_3==18||LA37_3==31) ) {
                    alt37=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalProblem.g:1598:3: this_RealConstant_0= ruleRealConstant
                    {

                    			newCompositeNode(grammarAccess.getConstantAccess().getRealConstantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealConstant_0=ruleRealConstant();

                    state._fsp--;


                    			current = this_RealConstant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:1607:3: this_IntConstant_1= ruleIntConstant
                    {

                    			newCompositeNode(grammarAccess.getConstantAccess().getIntConstantParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntConstant_1=ruleIntConstant();

                    state._fsp--;


                    			current = this_IntConstant_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalProblem.g:1616:3: this_StringConstant_2= ruleStringConstant
                    {

                    			newCompositeNode(grammarAccess.getConstantAccess().getStringConstantParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringConstant_2=ruleStringConstant();

                    state._fsp--;


                    			current = this_StringConstant_2;
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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleIntConstant"
    // InternalProblem.g:1628:1: entryRuleIntConstant returns [EObject current=null] : iv_ruleIntConstant= ruleIntConstant EOF ;
    public final EObject entryRuleIntConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntConstant = null;


        try {
            // InternalProblem.g:1628:52: (iv_ruleIntConstant= ruleIntConstant EOF )
            // InternalProblem.g:1629:2: iv_ruleIntConstant= ruleIntConstant EOF
            {
             newCompositeNode(grammarAccess.getIntConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntConstant=ruleIntConstant();

            state._fsp--;

             current =iv_ruleIntConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntConstant"


    // $ANTLR start "ruleIntConstant"
    // InternalProblem.g:1635:1: ruleIntConstant returns [EObject current=null] : ( (lv_intValue_0_0= ruleInteger ) ) ;
    public final EObject ruleIntConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_intValue_0_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1641:2: ( ( (lv_intValue_0_0= ruleInteger ) ) )
            // InternalProblem.g:1642:2: ( (lv_intValue_0_0= ruleInteger ) )
            {
            // InternalProblem.g:1642:2: ( (lv_intValue_0_0= ruleInteger ) )
            // InternalProblem.g:1643:3: (lv_intValue_0_0= ruleInteger )
            {
            // InternalProblem.g:1643:3: (lv_intValue_0_0= ruleInteger )
            // InternalProblem.g:1644:4: lv_intValue_0_0= ruleInteger
            {

            				newCompositeNode(grammarAccess.getIntConstantAccess().getIntValueIntegerParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_intValue_0_0=ruleInteger();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIntConstantRule());
            				}
            				set(
            					current,
            					"intValue",
            					lv_intValue_0_0,
            					"org.eclipse.viatra.solver.language.Problem.Integer");
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
    // $ANTLR end "ruleIntConstant"


    // $ANTLR start "entryRuleRealConstant"
    // InternalProblem.g:1664:1: entryRuleRealConstant returns [EObject current=null] : iv_ruleRealConstant= ruleRealConstant EOF ;
    public final EObject entryRuleRealConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealConstant = null;


        try {
            // InternalProblem.g:1664:53: (iv_ruleRealConstant= ruleRealConstant EOF )
            // InternalProblem.g:1665:2: iv_ruleRealConstant= ruleRealConstant EOF
            {
             newCompositeNode(grammarAccess.getRealConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealConstant=ruleRealConstant();

            state._fsp--;

             current =iv_ruleRealConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealConstant"


    // $ANTLR start "ruleRealConstant"
    // InternalProblem.g:1671:1: ruleRealConstant returns [EObject current=null] : ( (lv_realValue_0_0= ruleReal ) ) ;
    public final EObject ruleRealConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_realValue_0_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1677:2: ( ( (lv_realValue_0_0= ruleReal ) ) )
            // InternalProblem.g:1678:2: ( (lv_realValue_0_0= ruleReal ) )
            {
            // InternalProblem.g:1678:2: ( (lv_realValue_0_0= ruleReal ) )
            // InternalProblem.g:1679:3: (lv_realValue_0_0= ruleReal )
            {
            // InternalProblem.g:1679:3: (lv_realValue_0_0= ruleReal )
            // InternalProblem.g:1680:4: lv_realValue_0_0= ruleReal
            {

            				newCompositeNode(grammarAccess.getRealConstantAccess().getRealValueRealParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_realValue_0_0=ruleReal();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealConstantRule());
            				}
            				set(
            					current,
            					"realValue",
            					lv_realValue_0_0,
            					"org.eclipse.viatra.solver.language.Problem.Real");
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
    // $ANTLR end "ruleRealConstant"


    // $ANTLR start "entryRuleStringConstant"
    // InternalProblem.g:1700:1: entryRuleStringConstant returns [EObject current=null] : iv_ruleStringConstant= ruleStringConstant EOF ;
    public final EObject entryRuleStringConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstant = null;


        try {
            // InternalProblem.g:1700:55: (iv_ruleStringConstant= ruleStringConstant EOF )
            // InternalProblem.g:1701:2: iv_ruleStringConstant= ruleStringConstant EOF
            {
             newCompositeNode(grammarAccess.getStringConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringConstant=ruleStringConstant();

            state._fsp--;

             current =iv_ruleStringConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringConstant"


    // $ANTLR start "ruleStringConstant"
    // InternalProblem.g:1707:1: ruleStringConstant returns [EObject current=null] : ( (lv_stringValue_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringConstant() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_0_0=null;


        	enterRule();

        try {
            // InternalProblem.g:1713:2: ( ( (lv_stringValue_0_0= RULE_STRING ) ) )
            // InternalProblem.g:1714:2: ( (lv_stringValue_0_0= RULE_STRING ) )
            {
            // InternalProblem.g:1714:2: ( (lv_stringValue_0_0= RULE_STRING ) )
            // InternalProblem.g:1715:3: (lv_stringValue_0_0= RULE_STRING )
            {
            // InternalProblem.g:1715:3: (lv_stringValue_0_0= RULE_STRING )
            // InternalProblem.g:1716:4: lv_stringValue_0_0= RULE_STRING
            {
            lv_stringValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_stringValue_0_0, grammarAccess.getStringConstantAccess().getStringValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringConstantRule());
            				}
            				setWithLastConsumed(
            					current,
            					"stringValue",
            					lv_stringValue_0_0,
            					"org.eclipse.viatra.solver.language.Problem.STRING");
            			

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
    // $ANTLR end "ruleStringConstant"


    // $ANTLR start "entryRuleScopeDeclaration"
    // InternalProblem.g:1735:1: entryRuleScopeDeclaration returns [EObject current=null] : iv_ruleScopeDeclaration= ruleScopeDeclaration EOF ;
    public final EObject entryRuleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeDeclaration = null;


        try {
            // InternalProblem.g:1735:57: (iv_ruleScopeDeclaration= ruleScopeDeclaration EOF )
            // InternalProblem.g:1736:2: iv_ruleScopeDeclaration= ruleScopeDeclaration EOF
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
    // InternalProblem.g:1742:1: ruleScopeDeclaration returns [EObject current=null] : (otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.' ) ;
    public final EObject ruleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeScopes_1_0 = null;

        EObject lv_typeScopes_3_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1748:2: ( (otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.' ) )
            // InternalProblem.g:1749:2: (otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.' )
            {
            // InternalProblem.g:1749:2: (otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.' )
            // InternalProblem.g:1750:3: otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getScopeDeclarationAccess().getScopeKeyword_0());
            		
            // InternalProblem.g:1754:3: ( (lv_typeScopes_1_0= ruleTypeScope ) )
            // InternalProblem.g:1755:4: (lv_typeScopes_1_0= ruleTypeScope )
            {
            // InternalProblem.g:1755:4: (lv_typeScopes_1_0= ruleTypeScope )
            // InternalProblem.g:1756:5: lv_typeScopes_1_0= ruleTypeScope
            {

            					newCompositeNode(grammarAccess.getScopeDeclarationAccess().getTypeScopesTypeScopeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalProblem.g:1773:3: (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==18) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalProblem.g:1774:4: otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_33); 

            	    				newLeafNode(otherlv_2, grammarAccess.getScopeDeclarationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalProblem.g:1778:4: ( (lv_typeScopes_3_0= ruleTypeScope ) )
            	    // InternalProblem.g:1779:5: (lv_typeScopes_3_0= ruleTypeScope )
            	    {
            	    // InternalProblem.g:1779:5: (lv_typeScopes_3_0= ruleTypeScope )
            	    // InternalProblem.g:1780:6: lv_typeScopes_3_0= ruleTypeScope
            	    {

            	    						newCompositeNode(grammarAccess.getScopeDeclarationAccess().getTypeScopesTypeScopeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    break loop38;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalProblem.g:1806:1: entryRuleTypeScope returns [EObject current=null] : iv_ruleTypeScope= ruleTypeScope EOF ;
    public final EObject entryRuleTypeScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeScope = null;


        try {
            // InternalProblem.g:1806:50: (iv_ruleTypeScope= ruleTypeScope EOF )
            // InternalProblem.g:1807:2: iv_ruleTypeScope= ruleTypeScope EOF
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
    // InternalProblem.g:1813:1: ruleTypeScope returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) ) ) ;
    public final EObject ruleTypeScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_increment_1_0=null;
        Token otherlv_2=null;
        EObject lv_multiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1819:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) ) ) )
            // InternalProblem.g:1820:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) ) )
            {
            // InternalProblem.g:1820:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) ) )
            // InternalProblem.g:1821:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) )
            {
            // InternalProblem.g:1821:3: ( (otherlv_0= RULE_ID ) )
            // InternalProblem.g:1822:4: (otherlv_0= RULE_ID )
            {
            // InternalProblem.g:1822:4: (otherlv_0= RULE_ID )
            // InternalProblem.g:1823:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeScopeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_0, grammarAccess.getTypeScopeAccess().getTargetTypeClassDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalProblem.g:1834:3: ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==37) ) {
                alt39=1;
            }
            else if ( (LA39_0==38) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalProblem.g:1835:4: ( (lv_increment_1_0= '+=' ) )
                    {
                    // InternalProblem.g:1835:4: ( (lv_increment_1_0= '+=' ) )
                    // InternalProblem.g:1836:5: (lv_increment_1_0= '+=' )
                    {
                    // InternalProblem.g:1836:5: (lv_increment_1_0= '+=' )
                    // InternalProblem.g:1837:6: lv_increment_1_0= '+='
                    {
                    lv_increment_1_0=(Token)match(input,37,FOLLOW_17); 

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
                    // InternalProblem.g:1850:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeScopeAccess().getEqualsSignKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalProblem.g:1855:3: ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) )
            // InternalProblem.g:1856:4: (lv_multiplicity_3_0= ruleDefiniteMultiplicity )
            {
            // InternalProblem.g:1856:4: (lv_multiplicity_3_0= ruleDefiniteMultiplicity )
            // InternalProblem.g:1857:5: lv_multiplicity_3_0= ruleDefiniteMultiplicity
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
    // InternalProblem.g:1878:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalProblem.g:1878:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalProblem.g:1879:2: iv_ruleMultiplicity= ruleMultiplicity EOF
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
    // InternalProblem.g:1885:1: ruleMultiplicity returns [EObject current=null] : (this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity | this_DefiniteMultiplicity_1= ruleDefiniteMultiplicity ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject this_UnboundedMultiplicity_0 = null;

        EObject this_DefiniteMultiplicity_1 = null;



        	enterRule();

        try {
            // InternalProblem.g:1891:2: ( (this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity | this_DefiniteMultiplicity_1= ruleDefiniteMultiplicity ) )
            // InternalProblem.g:1892:2: (this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity | this_DefiniteMultiplicity_1= ruleDefiniteMultiplicity )
            {
            // InternalProblem.g:1892:2: (this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity | this_DefiniteMultiplicity_1= ruleDefiniteMultiplicity )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==EOF||LA40_0==26) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_INT) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalProblem.g:1893:3: this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity
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
                    // InternalProblem.g:1902:3: this_DefiniteMultiplicity_1= ruleDefiniteMultiplicity
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
    // InternalProblem.g:1914:1: entryRuleDefiniteMultiplicity returns [EObject current=null] : iv_ruleDefiniteMultiplicity= ruleDefiniteMultiplicity EOF ;
    public final EObject entryRuleDefiniteMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefiniteMultiplicity = null;


        try {
            // InternalProblem.g:1914:61: (iv_ruleDefiniteMultiplicity= ruleDefiniteMultiplicity EOF )
            // InternalProblem.g:1915:2: iv_ruleDefiniteMultiplicity= ruleDefiniteMultiplicity EOF
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
    // InternalProblem.g:1921:1: ruleDefiniteMultiplicity returns [EObject current=null] : (this_RangeMultiplicity_0= ruleRangeMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity ) ;
    public final EObject ruleDefiniteMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject this_RangeMultiplicity_0 = null;

        EObject this_ExactMultiplicity_1 = null;



        	enterRule();

        try {
            // InternalProblem.g:1927:2: ( (this_RangeMultiplicity_0= ruleRangeMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity ) )
            // InternalProblem.g:1928:2: (this_RangeMultiplicity_0= ruleRangeMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity )
            {
            // InternalProblem.g:1928:2: (this_RangeMultiplicity_0= ruleRangeMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==39) ) {
                    alt41=1;
                }
                else if ( (LA41_1==EOF||LA41_1==14||LA41_1==18||LA41_1==26) ) {
                    alt41=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalProblem.g:1929:3: this_RangeMultiplicity_0= ruleRangeMultiplicity
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
                    // InternalProblem.g:1938:3: this_ExactMultiplicity_1= ruleExactMultiplicity
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
    // InternalProblem.g:1950:1: entryRuleUnboundedMultiplicity returns [EObject current=null] : iv_ruleUnboundedMultiplicity= ruleUnboundedMultiplicity EOF ;
    public final EObject entryRuleUnboundedMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnboundedMultiplicity = null;


        try {
            // InternalProblem.g:1950:62: (iv_ruleUnboundedMultiplicity= ruleUnboundedMultiplicity EOF )
            // InternalProblem.g:1951:2: iv_ruleUnboundedMultiplicity= ruleUnboundedMultiplicity EOF
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
    // InternalProblem.g:1957:1: ruleUnboundedMultiplicity returns [EObject current=null] : () ;
    public final EObject ruleUnboundedMultiplicity() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalProblem.g:1963:2: ( () )
            // InternalProblem.g:1964:2: ()
            {
            // InternalProblem.g:1964:2: ()
            // InternalProblem.g:1965:3: 
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
    // InternalProblem.g:1974:1: entryRuleRangeMultiplicity returns [EObject current=null] : iv_ruleRangeMultiplicity= ruleRangeMultiplicity EOF ;
    public final EObject entryRuleRangeMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeMultiplicity = null;


        try {
            // InternalProblem.g:1974:58: (iv_ruleRangeMultiplicity= ruleRangeMultiplicity EOF )
            // InternalProblem.g:1975:2: iv_ruleRangeMultiplicity= ruleRangeMultiplicity EOF
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
    // InternalProblem.g:1981:1: ruleRangeMultiplicity returns [EObject current=null] : ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) ) ) ;
    public final EObject ruleRangeMultiplicity() throws RecognitionException {
        EObject current = null;

        Token lv_lowerBound_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1987:2: ( ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) ) ) )
            // InternalProblem.g:1988:2: ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) ) )
            {
            // InternalProblem.g:1988:2: ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) ) )
            // InternalProblem.g:1989:3: ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) )
            {
            // InternalProblem.g:1989:3: ( (lv_lowerBound_0_0= RULE_INT ) )
            // InternalProblem.g:1990:4: (lv_lowerBound_0_0= RULE_INT )
            {
            // InternalProblem.g:1990:4: (lv_lowerBound_0_0= RULE_INT )
            // InternalProblem.g:1991:5: lv_lowerBound_0_0= RULE_INT
            {
            lv_lowerBound_0_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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

            otherlv_1=(Token)match(input,39,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getRangeMultiplicityAccess().getFullStopFullStopKeyword_1());
            		
            // InternalProblem.g:2011:3: ( (lv_upperBound_2_0= ruleUpperBound ) )
            // InternalProblem.g:2012:4: (lv_upperBound_2_0= ruleUpperBound )
            {
            // InternalProblem.g:2012:4: (lv_upperBound_2_0= ruleUpperBound )
            // InternalProblem.g:2013:5: lv_upperBound_2_0= ruleUpperBound
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
    // InternalProblem.g:2034:1: entryRuleExactMultiplicity returns [EObject current=null] : iv_ruleExactMultiplicity= ruleExactMultiplicity EOF ;
    public final EObject entryRuleExactMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactMultiplicity = null;


        try {
            // InternalProblem.g:2034:58: (iv_ruleExactMultiplicity= ruleExactMultiplicity EOF )
            // InternalProblem.g:2035:2: iv_ruleExactMultiplicity= ruleExactMultiplicity EOF
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
    // InternalProblem.g:2041:1: ruleExactMultiplicity returns [EObject current=null] : ( (lv_exactValue_0_0= RULE_INT ) ) ;
    public final EObject ruleExactMultiplicity() throws RecognitionException {
        EObject current = null;

        Token lv_exactValue_0_0=null;


        	enterRule();

        try {
            // InternalProblem.g:2047:2: ( ( (lv_exactValue_0_0= RULE_INT ) ) )
            // InternalProblem.g:2048:2: ( (lv_exactValue_0_0= RULE_INT ) )
            {
            // InternalProblem.g:2048:2: ( (lv_exactValue_0_0= RULE_INT ) )
            // InternalProblem.g:2049:3: (lv_exactValue_0_0= RULE_INT )
            {
            // InternalProblem.g:2049:3: (lv_exactValue_0_0= RULE_INT )
            // InternalProblem.g:2050:4: lv_exactValue_0_0= RULE_INT
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
    // InternalProblem.g:2069:1: entryRuleUpperBound returns [String current=null] : iv_ruleUpperBound= ruleUpperBound EOF ;
    public final String entryRuleUpperBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUpperBound = null;


        try {
            // InternalProblem.g:2069:50: (iv_ruleUpperBound= ruleUpperBound EOF )
            // InternalProblem.g:2070:2: iv_ruleUpperBound= ruleUpperBound EOF
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
    // InternalProblem.g:2076:1: ruleUpperBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUpperBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalProblem.g:2082:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalProblem.g:2083:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalProblem.g:2083:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT) ) {
                alt42=1;
            }
            else if ( (LA42_0==40) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalProblem.g:2084:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getUpperBoundAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:2092:3: kw= '*'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalProblem.g:2101:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalProblem.g:2103:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalProblem.g:2104:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalProblem.g:2113:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QUOTED_ID_0= RULE_QUOTED_ID | (this_Identifier_1= ruleIdentifier (kw= '::' this_Identifier_3= ruleIdentifier )* ) ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_QUOTED_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Identifier_1 = null;

        AntlrDatatypeRuleToken this_Identifier_3 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalProblem.g:2120:2: ( (this_QUOTED_ID_0= RULE_QUOTED_ID | (this_Identifier_1= ruleIdentifier (kw= '::' this_Identifier_3= ruleIdentifier )* ) ) )
            // InternalProblem.g:2121:2: (this_QUOTED_ID_0= RULE_QUOTED_ID | (this_Identifier_1= ruleIdentifier (kw= '::' this_Identifier_3= ruleIdentifier )* ) )
            {
            // InternalProblem.g:2121:2: (this_QUOTED_ID_0= RULE_QUOTED_ID | (this_Identifier_1= ruleIdentifier (kw= '::' this_Identifier_3= ruleIdentifier )* ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_QUOTED_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID||(LA44_0>=42 && LA44_0<=43)) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalProblem.g:2122:3: this_QUOTED_ID_0= RULE_QUOTED_ID
                    {
                    this_QUOTED_ID_0=(Token)match(input,RULE_QUOTED_ID,FOLLOW_2); 

                    			current.merge(this_QUOTED_ID_0);
                    		

                    			newLeafNode(this_QUOTED_ID_0, grammarAccess.getQualifiedNameAccess().getQUOTED_IDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:2130:3: (this_Identifier_1= ruleIdentifier (kw= '::' this_Identifier_3= ruleIdentifier )* )
                    {
                    // InternalProblem.g:2130:3: (this_Identifier_1= ruleIdentifier (kw= '::' this_Identifier_3= ruleIdentifier )* )
                    // InternalProblem.g:2131:4: this_Identifier_1= ruleIdentifier (kw= '::' this_Identifier_3= ruleIdentifier )*
                    {

                    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getIdentifierParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_38);
                    this_Identifier_1=ruleIdentifier();

                    state._fsp--;


                    				current.merge(this_Identifier_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalProblem.g:2141:4: (kw= '::' this_Identifier_3= ruleIdentifier )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==41) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalProblem.g:2142:5: kw= '::' this_Identifier_3= ruleIdentifier
                    	    {
                    	    kw=(Token)match(input,41,FOLLOW_3); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_1_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getQualifiedNameAccess().getIdentifierParserRuleCall_1_1_1());
                    	    				
                    	    pushFollow(FOLLOW_38);
                    	    this_Identifier_3=ruleIdentifier();

                    	    state._fsp--;


                    	    					current.merge(this_Identifier_3);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleIdentifier"
    // InternalProblem.g:2166:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // InternalProblem.g:2166:50: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalProblem.g:2167:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalProblem.g:2173:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalProblem.g:2179:2: ( (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' ) )
            // InternalProblem.g:2180:2: (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' )
            {
            // InternalProblem.g:2180:2: (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' )
            int alt45=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt45=1;
                }
                break;
            case 42:
                {
                alt45=2;
                }
                break;
            case 43:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalProblem.g:2181:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:2189:3: kw= 'true'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getIdentifierAccess().getTrueKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalProblem.g:2195:3: kw= 'false'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getIdentifierAccess().getFalseKeyword_2());
                    		

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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleInteger"
    // InternalProblem.g:2204:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalProblem.g:2206:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalProblem.g:2207:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalProblem.g:2216:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalProblem.g:2223:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalProblem.g:2224:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalProblem.g:2224:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalProblem.g:2225:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalProblem.g:2225:3: (kw= '-' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalProblem.g:2226:4: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleReal"
    // InternalProblem.g:2246:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;


        try {
            // InternalProblem.g:2246:44: (iv_ruleReal= ruleReal EOF )
            // InternalProblem.g:2247:2: iv_ruleReal= ruleReal EOF
            {
             newCompositeNode(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReal=ruleReal();

            state._fsp--;

             current =iv_ruleReal.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalProblem.g:2253:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_EXPONENTIAL_1= RULE_EXPONENTIAL | (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT | this_EXPONENTIAL_5= RULE_EXPONENTIAL ) ) ) ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_EXPONENTIAL_1=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_EXPONENTIAL_5=null;


        	enterRule();

        try {
            // InternalProblem.g:2259:2: ( ( (kw= '-' )? (this_EXPONENTIAL_1= RULE_EXPONENTIAL | (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT | this_EXPONENTIAL_5= RULE_EXPONENTIAL ) ) ) ) )
            // InternalProblem.g:2260:2: ( (kw= '-' )? (this_EXPONENTIAL_1= RULE_EXPONENTIAL | (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT | this_EXPONENTIAL_5= RULE_EXPONENTIAL ) ) ) )
            {
            // InternalProblem.g:2260:2: ( (kw= '-' )? (this_EXPONENTIAL_1= RULE_EXPONENTIAL | (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT | this_EXPONENTIAL_5= RULE_EXPONENTIAL ) ) ) )
            // InternalProblem.g:2261:3: (kw= '-' )? (this_EXPONENTIAL_1= RULE_EXPONENTIAL | (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT | this_EXPONENTIAL_5= RULE_EXPONENTIAL ) ) )
            {
            // InternalProblem.g:2261:3: (kw= '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==44) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalProblem.g:2262:4: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalProblem.g:2268:3: (this_EXPONENTIAL_1= RULE_EXPONENTIAL | (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT | this_EXPONENTIAL_5= RULE_EXPONENTIAL ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_EXPONENTIAL) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_INT) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalProblem.g:2269:4: this_EXPONENTIAL_1= RULE_EXPONENTIAL
                    {
                    this_EXPONENTIAL_1=(Token)match(input,RULE_EXPONENTIAL,FOLLOW_2); 

                    				current.merge(this_EXPONENTIAL_1);
                    			

                    				newLeafNode(this_EXPONENTIAL_1, grammarAccess.getRealAccess().getEXPONENTIALTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalProblem.g:2277:4: (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT | this_EXPONENTIAL_5= RULE_EXPONENTIAL ) )
                    {
                    // InternalProblem.g:2277:4: (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT | this_EXPONENTIAL_5= RULE_EXPONENTIAL ) )
                    // InternalProblem.g:2278:5: this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT | this_EXPONENTIAL_5= RULE_EXPONENTIAL )
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_4); 

                    					current.merge(this_INT_2);
                    				

                    					newLeafNode(this_INT_2, grammarAccess.getRealAccess().getINTTerminalRuleCall_1_1_0());
                    				
                    kw=(Token)match(input,14,FOLLOW_39); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_1_1_1());
                    				
                    // InternalProblem.g:2290:5: (this_INT_4= RULE_INT | this_EXPONENTIAL_5= RULE_EXPONENTIAL )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_INT) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==RULE_EXPONENTIAL) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalProblem.g:2291:6: this_INT_4= RULE_INT
                            {
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

                            						current.merge(this_INT_4);
                            					

                            						newLeafNode(this_INT_4, grammarAccess.getRealAccess().getINTTerminalRuleCall_1_1_2_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalProblem.g:2299:6: this_EXPONENTIAL_5= RULE_EXPONENTIAL
                            {
                            this_EXPONENTIAL_5=(Token)match(input,RULE_EXPONENTIAL,FOLLOW_2); 

                            						current.merge(this_EXPONENTIAL_5);
                            					

                            						newLeafNode(this_EXPONENTIAL_5, grammarAccess.getRealAccess().getEXPONENTIALTerminalRuleCall_1_1_2_1());
                            					

                            }
                            break;

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
    // $ANTLR end "ruleReal"


    // $ANTLR start "ruleLogicValue"
    // InternalProblem.g:2313:1: ruleLogicValue returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) ) ;
    public final Enumerator ruleLogicValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalProblem.g:2319:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) ) )
            // InternalProblem.g:2320:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) )
            {
            // InternalProblem.g:2320:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt50=1;
                }
                break;
            case 43:
                {
                alt50=2;
                }
                break;
            case 45:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalProblem.g:2321:3: (enumLiteral_0= 'true' )
                    {
                    // InternalProblem.g:2321:3: (enumLiteral_0= 'true' )
                    // InternalProblem.g:2322:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:2329:3: (enumLiteral_1= 'false' )
                    {
                    // InternalProblem.g:2329:3: (enumLiteral_1= 'false' )
                    // InternalProblem.g:2330:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:2337:3: (enumLiteral_2= 'unknown' )
                    {
                    // InternalProblem.g:2337:3: (enumLiteral_2= 'unknown' )
                    // InternalProblem.g:2338:4: enumLiteral_2= 'unknown'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

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
    // InternalProblem.g:2348:1: ruleShortLogicValue returns [Enumerator current=null] : ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) ) ;
    public final Enumerator ruleShortLogicValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalProblem.g:2354:2: ( ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) ) )
            // InternalProblem.g:2355:2: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) )
            {
            // InternalProblem.g:2355:2: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==33) ) {
                alt51=1;
            }
            else if ( (LA51_0==46) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalProblem.g:2356:3: (enumLiteral_0= '!' )
                    {
                    // InternalProblem.g:2356:3: (enumLiteral_0= '!' )
                    // InternalProblem.g:2357:4: enumLiteral_0= '!'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:2364:3: (enumLiteral_1= '?' )
                    {
                    // InternalProblem.g:2364:3: (enumLiteral_1= '?' )
                    // InternalProblem.g:2365:4: enumLiteral_1= '?'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\5\3\uffff\4\36\3\uffff\1\5\3\36";
    static final String dfa_3s = "\1\56\3\uffff\1\43\3\51\3\uffff\1\53\3\51";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\4\uffff\1\4\1\6\1\5\4\uffff";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\uffff\1\4\7\uffff\2\1\5\uffff\1\2\5\uffff\2\3\3\uffff\1\10\2\uffff\1\11\5\uffff\1\6\1\7\2\uffff\1\10",
            "",
            "",
            "",
            "\1\10\4\uffff\1\12",
            "\1\10\4\uffff\1\12\5\uffff\1\13",
            "\1\10\4\uffff\1\12\5\uffff\1\13",
            "\1\10\4\uffff\1\12\5\uffff\1\13",
            "",
            "",
            "",
            "\1\14\44\uffff\1\15\1\16",
            "\1\10\4\uffff\1\12\5\uffff\1\13",
            "\1\10\4\uffff\1\12\5\uffff\1\13",
            "\1\10\4\uffff\1\12\5\uffff\1\13"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "146:2: (this_ClassDeclaration_0= ruleClassDeclaration | this_EnumDeclaration_1= ruleEnumDeclaration | this_PredicateDefinition_2= rulePredicateDefinition | this_Assertion_3= ruleAssertion | this_NodeValueAssertion_4= ruleNodeValueAssertion | this_ScopeDeclaration_5= ruleScopeDeclaration )";
        }
    }
    static final String dfa_7s = "\54\uffff";
    static final String dfa_8s = "\1\5\4\36\1\uffff\1\4\1\5\4\22\1\6\1\22\1\16\1\22\1\16\3\36\1\4\1\5\1\6\1\uffff\4\22\1\6\1\22\1\16\6\22\1\5\1\6\5\22";
    static final String dfa_9s = "\1\56\1\36\3\51\1\uffff\1\54\1\53\1\37\3\51\1\10\3\37\1\43\3\51\1\54\1\53\1\10\1\uffff\1\37\3\51\1\10\3\37\3\51\2\37\1\53\1\10\3\51\2\37";
    static final String dfa_10s = "\5\uffff\1\2\21\uffff\1\1\24\uffff";
    static final String dfa_11s = "\54\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\uffff\1\1\31\uffff\1\5\10\uffff\1\3\1\4\2\uffff\1\5",
            "\1\6",
            "\1\6\12\uffff\1\7",
            "\1\6\12\uffff\1\7",
            "\1\6\12\uffff\1\7",
            "",
            "\1\17\1\11\1\16\1\10\1\15\26\uffff\1\20\12\uffff\1\12\1\13\1\14",
            "\1\21\44\uffff\1\22\1\23",
            "\1\24\14\uffff\1\20",
            "\1\24\14\uffff\1\20\11\uffff\1\25",
            "\1\24\14\uffff\1\20\11\uffff\1\25",
            "\1\24\14\uffff\1\20\11\uffff\1\25",
            "\1\16\1\uffff\1\15",
            "\1\24\14\uffff\1\20",
            "\1\26\3\uffff\1\24\14\uffff\1\20",
            "\1\24\14\uffff\1\20",
            "\1\5\24\uffff\1\27",
            "\1\6\12\uffff\1\7",
            "\1\6\12\uffff\1\7",
            "\1\6\12\uffff\1\7",
            "\1\37\1\31\1\36\1\30\1\35\41\uffff\1\32\1\33\1\34",
            "\1\40\44\uffff\1\41\1\42",
            "\1\43\1\uffff\1\44",
            "",
            "\1\24\14\uffff\1\20",
            "\1\24\14\uffff\1\20\11\uffff\1\45",
            "\1\24\14\uffff\1\20\11\uffff\1\45",
            "\1\24\14\uffff\1\20\11\uffff\1\45",
            "\1\36\1\uffff\1\35",
            "\1\24\14\uffff\1\20",
            "\1\46\3\uffff\1\24\14\uffff\1\20",
            "\1\24\14\uffff\1\20",
            "\1\24\14\uffff\1\20\11\uffff\1\25",
            "\1\24\14\uffff\1\20\11\uffff\1\25",
            "\1\24\14\uffff\1\20\11\uffff\1\25",
            "\1\24\14\uffff\1\20",
            "\1\24\14\uffff\1\20",
            "\1\47\44\uffff\1\50\1\51",
            "\1\52\1\uffff\1\53",
            "\1\24\14\uffff\1\20\11\uffff\1\45",
            "\1\24\14\uffff\1\20\11\uffff\1\45",
            "\1\24\14\uffff\1\20\11\uffff\1\45",
            "\1\24\14\uffff\1\20",
            "\1\24\14\uffff\1\20"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1219:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleAssertionArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleAssertionArgument ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( (lv_arguments_11_0= ruleAssertionArgument ) ) (otherlv_12= ',' ( (lv_arguments_13_0= ruleAssertionArgument ) ) )* )? otherlv_14= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000C0000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00004C12304180A2L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000A4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000C00000000A0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C4000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000C0001A000A0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000C0001B000A0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000C0000200020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000C0002000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000C0020000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000C00800000A0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000C02000000A0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00001C00800001F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00001C00000001F0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00002C0000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000140L});

}